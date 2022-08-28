package abc.tutorials.springboot.thenewmexico.model

import com.fasterxml.jackson.annotation.JsonProperty

//data classはequalsやhashCodeなどの機能をすでに持つ．
data class Bank(
    @JsonProperty("account_number")
    val accountNumber: String,

    @JsonProperty("trust")
    val trust: Double,

    @JsonProperty("default_transaction_fee")
    val transactionFee: Int,
)

