package me.dio.creditapplicationsystem.dto

import me.dio.creditapplicationsystem.entity.Address
import me.dio.creditapplicationsystem.entity.Customer
import java.math.BigDecimal

data class CustomerDTO(
    val firtName: String,
    val lastName: String,
    val cpf: String,
    val income: BigDecimal,
    val email: String,
    val password: String,
    val zipcode: String,
    val street: String

) {
    fun toEntity(): Customer = Customer(
        firstName = this.firtName,
        lastName = this.lastName,
        cpf = this.cpf,
        income = this.income,
        email = this.email,
        password = this.password,
        address = Address(
            zipCode = this.zipcode,
            street = this.street
        )


        )
}