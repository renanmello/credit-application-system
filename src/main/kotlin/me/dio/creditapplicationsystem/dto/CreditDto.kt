package me.dio.creditapplicationsystem.dto

import me.dio.creditapplicationsystem.entity.Credit
import me.dio.creditapplicationsystem.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    val creditValue: BigDecimal,
    val dayFirstOfInstallment: LocalDate,
    val numberOfInstallment: Int,
    val costumerId: Long
) {
 fun toEntity(): Credit = Credit(
     creditValue = this.creditValue,
     dayFirstInstallment = this.dayFirstOfInstallment,
     numberOfInstallment = this.numberOfInstallment,
     customer = Customer (id = this.costumerId)

 )
}