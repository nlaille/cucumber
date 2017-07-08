# Cucumber

Ce projet est une introduction au framework Cucumber

Cucumber est un framework de test qui facilite la mise en place du BDD (Behaviour Driven Development)

Les tests sont ecris au format Gherkins

# Utilisation

Pour lancer les tests Cucumber, utiliser la task gradle `cucumber`

```
$ gradle cucumber
```

# Etendre le projet

## Steps existantes

```
# creation d'une instance de calculette
Etant donné une calculette a une valeur de <double>
# addition
Lorsque j'ajoute <double>
# soustraction
Lorsque je soustrais <double>
# assert du resultat
Alors j'obtiens le résultat de <double>
```

## Nouvelles Steps

Pour declarer de nouvelles Steps Cucumber

Les ajouter dans le package `com.cucumber.steps` dans le dossier `src/cucumber/java`

## Creation de nouvelles Scenarios/Fonctionnalites

Il est possible d'ajouter de nouveaux scenarios

Ou egalement de creer de nouvelles features dans le dossier `src/cucumber/resources/features`

# Liens utiles

https://cucumber.io/

https://cucumber.io/docs/reference/jvm

https://github.com/cucumber/cucumber-jvm

https://github.com/cucumber/cucumber/wiki/Gherkin

https://github.com/samueltbrown/gradle-cucumber-plugin

https://zsoltfabok.com/blog/2012/09/cucumber-jvm-hooks/

http://blog.czeczotka.com/2014/08/17/writing-cucumber-jvm-step-definitions/