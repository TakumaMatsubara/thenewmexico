package abc.tutorials.springboot.thenewmexico.datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()


    @Test
    fun should_provide_a_collection_of_banks() {
        // given


        // when
        val banks = mockDataSource.getBanks()


        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }

    @Test
    fun should_provide_some_mock_data() {
        // when
        val banks = mockDataSource.getBanks()

        // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0}

    }
}