package abc.tutorials.springboot.thenewmexico.service

import abc.tutorials.springboot.thenewmexico.datasource.BankDataSource
import abc.tutorials.springboot.thenewmexico.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)

}