package abc.tutorials.springboot.thenewmexico.model

//data classはequalsやhashCodeなどの機能をすでに持つ．
data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int,
)

