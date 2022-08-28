package abc.tutorials.springboot.thenewmexico.datasource.network.dto

import abc.tutorials.springboot.thenewmexico.model.Bank

data class BankList (
    val results: Collection<Bank>
)