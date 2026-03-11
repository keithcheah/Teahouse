# ☕ Teahouse

## Overview

Teahouse is a **full-stack web application** designed to streamline tea shop operations by decoupling customer-facing ordering from internal inventory management.

**The Problem:** Tea shops typically juggle manual order-taking and disconnected inventory tracking, leading to overselling, stock-outs, and lost sales visibility.

**The Solution:** Teahouse is a full-stack order and inventory management system for tea shops. It separates customer-facing ordering (browsing menu, placing orders, tracking confirmations) from internal operations (real-time stock tracking, inventory updates, fulfillment management). Built with Spring Boot and a relational database backend, Teahouse ensures accurate stock visibility across both channels and prevents overselling through transactional consistency.

## Features

### Customer-Facing Order Portal
- Browse tea menu with real-time stock availability
- Add items to cart and place orders with order confirmation
- View order history and estimated fulfillment time

### Internal Inventory Management Dashboard
- Real-time stock level tracking and low-stock alerts
- Update inventory as orders are fulfilled
- Manage tea product catalog (name, price, description, stock limits)
- Generate inventory reports by product or time period

## Technical Stack

| Layer | Technology |
|-------|-----------|
| **Backend** | Java 11+, Spring Boot, Spring Data JPA |
| **Frontend** | HTML5, CSS3, JavaScript (vanilla or framework if applicable) |
| **Database** | MySQL / PostgreSQL |
| **Build Tool** | Maven / Gradle |
| **API** | RESTful JSON endpoints |

## Architecture & How It Works

**System Design:**
- **Backend:** RESTful Spring Boot API that handles order management, inventory updates, and data persistence
- **Frontend:** HTML/CSS/JavaScript client interacting with the backend API for real-time stock visibility
- **Database:** Relational database (MySQL/PostgreSQL) storing customer orders, inventory records, and product metadata
- **Key Workflows:**
  1. **Customer orders a product** → Frontend sends POST request to `/api/orders` → Backend validates stock → Reduces inventory → Returns order confirmation
  2. **Admin updates stock** → Admin dashboard PUTs to `/api/inventory/{productId}` → Backend persists changes → Frontend reflects live updates

**Backend:**
- SpringBoot

**Frontend:**
- HTML/CSS/JavaScript
