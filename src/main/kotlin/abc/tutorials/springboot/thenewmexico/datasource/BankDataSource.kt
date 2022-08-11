package abc.tutorials.springboot.thenewmexico.datasource

import abc.tutorials.springboot.thenewmexico.model.Bank

interface BankDataSource {

    fun retriveBanks(): Collection<Bank>
}