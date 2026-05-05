# Problems Detected

## 1. Type checking with if-else
GameObject davranışları type string üzerinden kontrol ediliyor.

## 2. Single Responsibility ihlali
GameObject hem veri hem davranış yönetiyor.

## 3. Open/Closed ihlali
Yeni obje için mevcut kod değiştiriliyor.

## 4. String dependency
String typo riski var.

## 5. Low extensibility
Yeni object tipleri kolay eklenemiyor.

## 6. Violation of Open/Closed Principle
New game object types require modifying existing update logic instead of extending it.