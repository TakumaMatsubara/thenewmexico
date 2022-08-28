package abc.tutorials.springboot.thenewmexico.datasource.mock

import abc.tutorials.springboot.thenewmexico.datasource.BankDataSource
import abc.tutorials.springboot.thenewmexico.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = mutableListOf(
        Bank("1234", 3.13, 14),
        Bank("1010", 3.13, 0),
        Bank("5678", 0.0, 14),
    )

    override fun retrieveBanks(): Collection<Bank> = banks

    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank with account number $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exists.")
        }
        banks.add(bank)

        return bank
    }
}