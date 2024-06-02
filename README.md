# README - Middle Earth Army API

## Description
This application provides a simple API for managing battalions and creatures in Middle Earth.

## Step by Step - Recommended Order of Operations

1. Create Battalion
2. Display All Battalions to get the index
3. Add Creature to Battalion
4. Display All Creatures (Optional)
5. Display Creatures and Battalions (Optional)

## Endpoints

### Create Battalion
- **Endpoint**: `POST /army/createBattalion?type={type}`
- **Example**: 
  ```
  POST http://localhost:8080/army/createBattalion?type=elf
  ```
- **Description**: Creates a new battalion of the specified type (elf, gnome, ent).

### Add Creature to Battalion
- **Endpoint**: `POST /army/addCreatureToBattalion?battalionIndex={index}&type={type}&name={name}&health={health}&attackPower={attackPower}`
- **Example**: 
  ```
  POST http://localhost:8080/army/addCreatureToBattalion?battalionIndex=0&type=elf&name=Legolas&health=100&attackPower=80
  ```

### Display All Battalions and Creatures
- **Endpoint**: `GET /army/showAllBattalionsAndCreatures`
- **Example**: 
  ```
  GET http://localhost:8080/army/showAllBattalionsAndCreatures
  ```

### Display All Battalions
- **Endpoint**: `GET /army/showAllBattalions`
- **Example**: 
  ```
  GET http://localhost:8080/army/showAllBattalions
  ```

### Display All Creatures
- **Endpoint**: `GET /army/showAllCreatures`
- **Example**: 
  ```
  GET http://localhost:8080/army/showAllCreatures
  ```
