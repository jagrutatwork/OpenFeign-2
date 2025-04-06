# 🧩 OpenFeign Microservices Demo (Spring Boot)

This is a demo project showcasing how to use **OpenFeign** in a Spring Boot microservices architecture to call REST APIs between services seamlessly.

---

## 📌 Overview

This project includes **two Spring Boot applications**:

### 1. `DemoService` (Port: `8085`)
A simple REST service exposing basic endpoints:

- `/user/name` → returns user name  
- `/user/address` → returns user address  
- `/user/status` → returns user status  

### 2. `FeignClientService` (Port: `8086`)
A client service that uses **OpenFeign** to consume APIs from the `DemoService`. It re-exposes them via:

- `/demo/user-name`
- `/demo/user-address`
- `/demo/user-status`

---

## 🚀 How It Works

1. `DemoService` exposes 3 endpoints.
2. `FeignClientService` uses an interface annotated with `@FeignClient` to call `DemoService` internally.
3. Feign handles the HTTP calls behind the scenes using method signatures and annotations.

---

## 🧠 Key Components

### 🔹 `FeignServiceUtil.java` (Feign Client Interface)

```java
@FeignClient(value = "feignDemo", url = "http://localhost:8085/user")
public interface FeignServiceUtil {
    @GetMapping("/name")
    String getName();

    @GetMapping("/address")
    String getAddress();

    @GetMapping("/status")
    String getStatus();
}
