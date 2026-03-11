# ☕ Teahouse

## Overview

Teahouse is a **full-stack web application** designed to streamline tea shop operations by decoupling customer-facing ordering from internal inventory management.

**The Problem:** Tea shops typically juggle manual order-taking and disconnected inventory tracking, leading to overselling, stock-outs, and lost sales visibility.

**The Solution:** Teahouse separates customer-facing ordering (browsing menu, placing orders, tracking confirmations) from internal operations (real-time stock tracking, inventory updates, fulfillment management). Built with Spring Boot and a relational database backend, it ensures accurate stock visibility across both channels and prevents overselling through transactional consistency.

## Features

**Customer Ordering**
- Browse tea menu with real-time stock availability and pricing
- Add items to cart, apply promotions, and complete secure checkout
- Receive order confirmation and estimated fulfillment time
- View past orders and reorder frequently purchased items

**Admin Inventory Management**
- Live dashboard showing current stock levels by product
- Automatic low-stock alerts and reorder reminders
- Transactional inventory updates as orders are fulfilled
- Audit trail of all inventory changes for compliance and troubleshooting
- Product catalog management (add, update, retire items)

## Technical Stack

| Layer | Technology |
|-------|-----------|
| **Backend** | Java 11+, Spring Boot, Spring Data JPA |
| **Frontend** | HTML5, CSS3, JavaScript (vanilla or framework if applicable) |
| **Database** | MySQL / PostgreSQL |
| **Build Tool** | Maven / Gradle |
| **API** | RESTful JSON endpoints |

## Architecture & How It Works

**Request Flow (Customer Places Order):**
1. Customer selects tea products on frontend → HTTP POST to `/api/orders`
2. Spring Boot backend validates:
   - Product exists and is active
   - Requested quantity ≤ available stock
3. Database transaction:
   - Creates `Order` record with customer details
   - Decrements `Product.availableStock`
4. Returns order confirmation JSON to frontend
5. Admin sees live inventory update on dashboard

**Admin Inventory Update Flow:**
1. Admin updates stock on dashboard → PUT to `/api/inventory/{productId}`
2. Backend persists changes to database
3. Frontend reflects live inventory updates for customers

**Why This Architecture:**
- **Spring Boot** provides rapid REST API development and transaction management
- **Relational Database** ensures ACID compliance for inventory consistency (prevents overselling)
- **Vanilla JavaScript Frontend** keeps deployment lightweight and responsive


## Future Enhancements

- Email/SMS order notifications for customers
- Subscription-based recurring orders
- Admin analytics dashboard (peak order times, best-selling products)
- Multi-location inventory management
- Payment gateway integration (Stripe/PayPal)
- Mobile app for staff order fulfillment tracking
