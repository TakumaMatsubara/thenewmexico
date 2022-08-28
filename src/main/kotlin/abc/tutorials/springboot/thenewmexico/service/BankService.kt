package abc.tutorials.springboot.thenewmexico.service

import abc.tutorials.springboot.thenewmexico.datasource.BankDataSource
import abc.tutorials.springboot.thenewmexico.model.Bank
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class BankService(@Qualifier("mock") private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> {
        return dataSource.retrieveBanks()
    }
    fun getBank(accountNumber: String): Bank {
        return dataSource.retrieveBank(accountNumber)
    }
    fun addBank(bank: Bank): Bank {
        return dataSource.createBank(bank)
    }
    fun updateBank(bank: Bank): Bank {
        return dataSource.updateBank(bank)
    }
    fun deleteBank(accountNumber: String): Unit {
        return dataSource.deleteBank(accountNumber)
    }

}