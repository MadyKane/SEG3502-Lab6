# SEG3502 - Lab 6 : Service Web Spring Boot REST Calculator

Ce projet implémente le livrable évalué du Laboratoire 6 (section 6) : un service Web RESTful Calculator développé avec Spring Boot et Kotlin, incluant la génération automatique de la documentation OpenAPI 3 / Swagger UI.

## Points de terminaison (Endpoints)

- `GET /calculator/add/{nombre1}/{nombre2}` : Additionne `nombre1` et `nombre2`
- `GET /calculator/subtract/{nombre1}/{nombre2}` : Soustrait `nombre2` de `nombre1`
- `GET /calculator/multiply/{nombre1}/{nombre2}` : Multiplie `nombre1` et `nombre2`
- `GET /calculator/divide/{nombre1}/{nombre2}` : Divise `nombre1` par `nombre2`

## Documentation OpenAPI

Une fois l'application démarrée sur le port `8080` :
- **JSON** : `http://localhost:8080/v3/api-docs/`
- **YAML** : `http://localhost:8080/v3/api-docs.yaml`
- **Swagger UI** : `http://localhost:8080/swagger-ui.html`

## Exécution

Si vous avez déjà un wrapper Gradle (`gradlew`) dans votre dépôt GitHub Classroom, copiez simplement le dossier `src/` et le fichier `build.gradle.kts`, puis lancez :

```bash
./gradlew bootRun
```
