# Projet Lecteur de Fichiers

## Description

Le Projet Lecteur de Fichiers est une application Java qui permet aux utilisateurs de lire et traiter différents types de fichiers, notamment les fichiers TXT, CSV et JSON. Le programme offre plusieurs fonctionnalités :

    Afficher le contenu d’un fichier dans l’ordre normal.
    Afficher le contenu d’un fichier à l’envers (ordre des lignes inversé).
    Afficher le contenu d’un fichier de manière palindromique (inversion caractère par caractère).
    Comparer le contenu de deux fichiers pour déterminer s’ils sont identiques.

Le projet suit une approche orientée objet en définissant une classe abstraite FileType et en implémentant des lecteurs spécifiques pour chaque format de fichier (FileTxt, FileCsv, FileJson).
Fonctionnalités

    Prise en charge de plusieurs types de fichiers : TXT, CSV, JSON.
    Lecture de contenu de fichier : Affiche le contenu d’un fichier tel quel.
    Inversion de contenu : Affiche le contenu d’un fichier en inversant l’ordre des lignes.
    Affichage palindromique : Inverse chaque ligne caractère par caractère.
    Comparaison de fichiers : Compare le contenu de deux fichiers pour vérifier s’ils sont identiques.

## Utilisation

    Clonez le dépôt ou téléchargez le projet.
    Compilez et exécutez la classe FileReader.java pour démarrer l’application.
    Suivez les instructions dans la console pour :
        Afficher le contenu des fichiers dans différents formats.
        Comparer deux fichiers.
    Le programme prend en charge les fichiers de type TXT, CSV, et JSON.

## Exemples

Vous pouvez tester le programme avec des fichiers situés dans le dossier example_files/.
Dépendances

Aucune dépendance externe n’est requise pour ce projet. Il fonctionne avec la bibliothèque standard de Java.
