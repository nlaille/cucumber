#language: fr

@soustraction
Fonctionnalité: Les soustractions

  Scénario: Soustraction simple
    Etant donné une calculette a une valeur de 0,0
    Lorsque je soustrais 2,0
    Alors j'obtiens le résultat de -2,0

  Scénario: Soustraction negative
    Etant donné une calculette a une valeur de 0,0
    Lorsque je soustrais -2,0
    Alors j'obtiens le résultat de 2,0

  Scénario: Soustraction multiple
    Etant donné une calculette a une valeur de 0,0
    Lorsque je soustrais 2,0
    Et que je soustrais 2,0
    Alors j'obtiens le résultat de -4,0

  Plan du scénario: Tests soustractions
    Etant donné une calculette a une valeur de <init>
    Lorsque je soustrais <valeur1>
    Et que je soustrais <valeur2>
    Alors j'obtiens le résultat de <resultat>
    Exemples:
      | init | valeur1 | valeur2 | resultat |
      | 0,0  | 1,0     | 1,0     | -2,0     |
      | 0,0  | 1,3     | 2,4     | -3,7     |
      | 2,0  | 1,0     | 1,0     | 0,0      |
      | 0,0  | -2,0    | 2,0     | 0,0      |
      | 0,0  | -2,1    | 2,0     | 0,1      |
      | 0,0  | -2,1    | 2,0     | 0,1      |