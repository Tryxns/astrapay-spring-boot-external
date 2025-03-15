# Spring Boot Astrapay Base Project
Simple Note Application Project using Spring Boot

## Setup:  
1. Clone this repo
```
git clone git@github.com:Tryxns/astrapay-spring-boot-external.git
```
2. Run AstrapayBaseExternal.java via your IDE (IntelliJ / Eclipse)


## APIs:

- Get all notes
[GET] Endpoint:
```
/v1/notes
```
![astrapay_get_all](https://github.com/user-attachments/assets/209a9b42-30b2-47d6-8d14-e988879ff1cb)

- Get a note
[GET] Endpoint:
```
/v1/notes/{sequence_id}
```
![astrapay_get_single](https://github.com/user-attachments/assets/09191820-2a36-4583-9699-3114a3be04a4)

- Add a new note
[POST] Endpoint:
```
/v1/notes
```
![astrapay_post](https://github.com/user-attachments/assets/fd1a7386-2445-4894-9355-5aee0060396b)

- Remove a note
[DELETE] Endpoint:
```
/v1/notes/{sequence_id}
```
![astrapay_delete](https://github.com/user-attachments/assets/46895ba0-0d11-4f64-ae00-5e3385a99ea3)

- Validation for empty note content
![astrapay_validation](https://github.com/user-attachments/assets/4cb4e03a-fa46-4fcd-a463-c3daf68c0a06)
