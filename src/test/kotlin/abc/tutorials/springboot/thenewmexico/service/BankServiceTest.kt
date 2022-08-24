package abc.tutorials.springboot.thenewmexico.service

import abc.tutorials.springboot.thenewmexico.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
//apiの情報であるかのテスト

internal class BankServiceTest{

    private val dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(dataSource)


    @Test
    fun `should call its data source to retrieve banks`() {
        // when
        val banks = bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }

    }
}