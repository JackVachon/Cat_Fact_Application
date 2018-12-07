package com.example.vacho.mobileappcatfacts;

import java.util.Random;

class FactBook {

    private String[] facts = {
            "A cat has been mayor of Talkeetna, Alaska, for 15 years. His name is Stubbs.",
            "More cats are left-pawed than right.",
            "A group of full-grown cats is called a clowder.",
            "The world's largest cat measured 48.5 inches long.",
            "The world's richest cat is worth $13 million after his human passed away and left her fortune to him.",
            "The musical Cats is based on a 1939 collection of T.S. Eliot poems called Old Possum’s Book of Practical Cats.",
            "Cats are often lactose intolerant, so stop givin' them milk!",
            "Cats make more than 100 different sounds whereas dogs make around 10.",
            "A cat has five toes on his front paws, and four on the back, unless he's a polydactyl.",
            "Cats are genetically predisposed to not be able to taste sweets.",
            "Feral cats roam the grounds of Disneyland, where they help control the amusement park’s rodent population.",
            "Isaac Newton is credited with inventing the cat door.",
            "Cats only sweat through their foot pads.",
            "The first cat in space was French. She was named Felicette, or \"Astrocat.\" She survived the trip.",
            "Most cats don't like water because their coats do not insulate them well enough.",
            "Only 11.5% of people consider themselves \"cat people.\"",
    };

    String getFact() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}