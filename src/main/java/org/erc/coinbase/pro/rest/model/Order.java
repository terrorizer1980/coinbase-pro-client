/**
    This file is part of coinbase-pro-client.

    coinbase-pro-client is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Foobar is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with coinbase-pro-client.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.erc.coinbase.pro.rest.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * Instantiates a new order.
 */
@Data
public class Order {

	/** The id. */
	private String id;
	
	/** The price. */
	private BigDecimal price;
	
	/** The size. */
	private BigDecimal size;
	
	/** The product id. */
	private String product_id;
	
	/** The side. */
	private String side;
	
	/** The stp. */
	private String stp;
	
	/** The type. */
	private String type;
	
	/** The time in force. */
	private String time_in_force;
	
	/** The post only. */
	private Boolean post_only;
	
	/** The created at. */
	private Date created_at;
	
	/** The fill fees. */
	private BigDecimal fill_fees;
	
	/** The filled size. */
	private BigDecimal filled_size;
	
	/** The executed value. */
	private BigDecimal executed_value;
	
	/** The status. */
	private String status;
	
	/** The settled. */
	private Boolean settled;
}