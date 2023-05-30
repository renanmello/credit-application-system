package me.dio.creditapplicationsystem.dto

import me.dio.creditapplicationsystem.entity.Customer
import java.math.BigDecimal

data class CustomerView(
    val firtName: String,
    val lastName: String,
    val cpf: String,
    val income: BigDecimal,
    val email: String,
    val password: String,
    val zipcode: String,
    val street: String
) {
constructor(customer: Customer): this(
    firtName = customer.firstName,
    lastName = customer.lastName,
    cpf = customer.cpf,
    income = customer.income,
    email = customer.email,
    password = customer.password,
    zipcode = customer.address.zipCode,
    street = customer.address.street

)

}