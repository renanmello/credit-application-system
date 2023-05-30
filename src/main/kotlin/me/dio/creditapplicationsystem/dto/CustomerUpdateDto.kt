package me.dio.creditapplicationsystem.dto

import me.dio.creditapplicationsystem.entity.Customer
import java.math.BigDecimal

data class CustomerUpdateDto(
    val firtName: String,
    val lastName: String,
    val income: BigDecimal,
    val zipcode: String,
    val street: String

) {
    fun toEntity(customer : Customer): Customer{
        customer.firstName = this.firtName
        customer.lastName = this.lastName
        customer.income = this.income
        customer.address.zipCode = this.zipcode
        customer.address.street = this.street
        return customer
    }
}