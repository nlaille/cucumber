#language: fr

@addition
Fonctionnalité: Les additions

  Scénario: Addition simple
    Etant donné une calculette a une valeur de 0,0
    Lorsque j'ajoute 2,0
    Alors j'obtiens le résultat de 2,0

  Scénario: Addition negative
    Etant donné une calculette a une valeur de 0,0
    Lorsque j'ajoute -2,0
    Alors j'obtiens le résultat de -2,0

  Scénario: Addition avec valeur par defaut
    Etant donné une calculette a une valeur de 2,0
    Lorsque j'ajoute 2,0
    Alors j'obtiens le résultat de 4,0

  Scénario: Multiple addition
    Etant donné une calculette a une valeur de 0,0
    Lorsque j'ajoute 2,0
    Et j'ajoute 4,0
    Et j'ajoute 8,0
    Alors j'obtiens le résultat de 14,0

  Plan du scénario: Tests d'additions
    Etant donné une calculette a une valeur de <init>
    Lorsque j'ajoute <valeur1>
    Et que j'ajoute <valeur2>
    Alors j'obtiens le résultat de <resultat>
    Exemples:
      | init | valeur1 | valeur2 | resultat |
      | 0,0  | 1,0     | 1,0     | 2,0      |
      | 5,0  | 1,0     | 2,0     | 8,0      |
      | 0,0  | 1,0     | 3,0     | 4,0      |
      | 0,0  | 1,0     | 0,0     | 1,0      |
      | 0,0  | 0,0     | 10,0    | 10,0     |
      | 0,0  | 0,5     | 0,5     | 1,0      |
      | 0,5  | 1,0     | 0,0     | 1,5      |