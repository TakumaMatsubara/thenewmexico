package abc.tutorials.springboot.thenewmexico.datasource

import abc.tutorials.springboot.thenewmexico.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
}