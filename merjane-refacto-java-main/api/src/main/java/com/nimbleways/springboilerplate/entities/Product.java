package com.nimbleways.springboilerplate.entities;

import com.nimbleways.springboilerplate.entities.enums.ProductType;
import lombok.*;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "lead_time")
    private Integer leadTime;

    @Column(name = "available")
    private Integer available;

    @Column(name = "type")
	private ProductType productType;

    @Column(name = "name")
    private String name;

    @Column(name = "expiry_date")
    private LocalDate expiryDate;

    @Column(name = "season_start_date")
    private LocalDate seasonStartDate;

    @Column(name = "season_end_date")
    private LocalDate seasonEndDate;

	@Column(name = "flash_end_date")
	private LocalDate flashSaleEndDate;

	@Column(name = "max_FlashSale_Quantity")
	private Integer maximumFlashSaleQuantity;

	@Column(name = "flashSale_Quantity_Sold")
	private Integer flashSaleQuantitySold;
}
