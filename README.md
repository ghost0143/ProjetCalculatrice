# EXPLICATION DU CODE

Lien vers la vidéo: https://www.youtube.com/watch?v=0fBpvbldMMs&t=440s

### Introduction
Le projet présent est une implémentation d'une calculatrice simple en utilisant le pattern Observer en complément de l'architecture Modèle-Vue-Contrôleur (MVC). Cette combinaison de conception permet de séparer les responsabilités, d'améliorer la maintenabilité du code et de faciliter la communication entre les différents composants du système.

### 1. Modèle (CalculatorModel)
La classe CalculatorModel représente le modèle de la calculatrice. Elle étend la classe Observable, ce qui lui permet d'agir en tant que sujet observable. Les principales caractéristiques de cette classe sont :
    • Les variables number1, number2 et result : elles stockent respectivement les nombres saisis et le résultat du calcul.
    • Les méthodes setNumber1 et setNumber2 : elles permettent de définir les valeurs des nombres et notifient les observateurs du changement en appelant la méthode notifyObservers().
    • Les méthodes add, subtract, multiply et divide : elles effectuent les opérations arithmétiques sur les nombres et notifient les observateurs du changement.
    • La méthode getResult : elle renvoie le résultat du calcul.

### 2. Vue (CalculatorView)
La classe CalculatorView représente la vue de la calculatrice. Elle implémente l'interface Observer, ce qui lui permet d'agir en tant qu'observateur. Les principales caractéristiques de cette classe sont :
    • Les composants d'interface utilisateur : la classe utilise JavaFX pour créer les éléments graphiques tels que les champs de texte, les menus déroulants et les boutons.
    • La méthode calculate : elle est appelée lorsque le bouton "Calculate" est cliqué. Cette méthode récupère les valeurs des nombres et de l'opération à partir des champs de texte et du menu déroulant, puis met à jour le modèle en conséquence.
    • La méthode update : elle est appelée lorsqu'elle reçoit une notification du modèle. Cette méthode met à jour l'étiquette de résultat avec la nouvelle valeur du résultat.

### 3. Contrôleur (CalculatorController)
La classe CalculatorController représente le contrôleur de la calculatrice. Elle assure la liaison entre la vue et le modèle en définissant les actions à effectuer en réponse aux événements utilisateur. Les principales caractéristiques de cette classe sont :
    • Le constructeur : le contrôleur est initialisé avec la vue et le modèle.
    • La classe interne CalculateButtonHandler : cette classe gère l'événement de clic sur le bouton "Calculate" et met à jour le modèle en fonction des valeurs saisies par l'utilisateur.
    • La classe interne CalculateButtonHandler est associée au bouton "Calculate" de la vue pour écouter les événements de clic.

### 4. Classe principale (MainApp)
La classe MainApp est la classe principale qui démarre l'application JavaFX. Elle crée une instance du modèle, de la vue et du contrôleur, puis configure la scène et affiche la fenêtre principale.

L'architecture MVC utilisée dans ce code favorise une séparation claire des responsabilités entre le modèle, la vue et le contrôleur, ce qui facilite la maintenance et l'évolutivité du code. Le modèle est responsable de la logique métier, la vue gère l'interface utilisateur et le contrôleur gère les interactions entre le modèle et la vue.

En utilisant le pattern Observer, le code établit une communication bidirectionnelle entre le modèle et la vue. Le modèle est le sujet observable, tandis que la vue est l'observateur. Lorsque des changements surviennent dans le modèle, tels que la modification des nombres ou l'exécution d'une opération, il notifie automatiquement les observateurs en appelant la méthode `notifyObservers()`. Cela permet à la vue d'être informée des changements et de mettre à jour son affichage en conséquence.

La classe CalculatorView implémente l'interface Observer et reçoit les mises à jour du modèle via la méthode `update()`. Dans cette méthode, la vue extrait la nouvelle valeur du résultat du modèle et la met à jour dans l'étiquette de résultat de l'interface utilisateur. Ainsi, chaque fois que le modèle change, la vue est automatiquement mise à jour avec les nouvelles données.

Cette utilisation du pattern Observer offre plusieurs avantages. Tout d'abord, elle permet une séparation claire entre le modèle et la vue, assurant ainsi une meilleure organisation et une meilleure lisibilité du code. Ensuite, elle facilite l'ajout de nouveaux observateurs, car tout composant qui implémente l'interface Observer peut être ajouté pour écouter les mises à jour du modèle sans nécessiter de modifications importantes.

Présentation du code source
Le code source de ce projet est disponible sur le gitHub : https://github.com/ghost0143/ProjetCalculatrice

### Conclusion
En conclusion, le code du programme de calculatrice utilise avec succès le pattern Observer pour permettre une communication efficace entre le modèle et la vue. Grâce à cette approche, les changements dans le modèle sont automatiquement reflétés dans la vue, offrant ainsi une expérience utilisateur cohérente et à jour. De plus, l'utilisation de l'architecture MVC en combinaison avec le pattern Observer rend le code modulaire, maintenable et évolutif.
