package com.example.vacho.mobileappcatfacts;

import java.util.Random;

class FactBook {

    private String[] facts = {
            "Three dogs (from First Class cabins!) survived the sinking of the Titanic – two Pomeranians and one Pekingese.",
            "Puppies have 28 teeth and normal adult dogs have 42.",
            "Unlike humans who sweat everywhere, dogs only sweat through the pads of their feet.",
            "The fastest breed, the Greyhound, can run up to 44 miles per hour.",
            "Perky-eared dogs hear sounds better than floppy-eared dogs.",
            "There are about 400 million dogs in the world.",
            "The average dog lives 10 to 14 years.",
            "Thomas Jefferson helped enact a dog tax in Virginia, because he was annoyed that dogs were killing his sheep.",
            "The heaviest breed, the Mastiff, weighs about 200 pounds.",
            "More than half of all U.S. presidents have owned dogs.",
            "Just like human fingerprints, no two dogs' nose prints are alike.",
            "Dogs can see best at dawn and dusk.",
            "More than one in three U.S. families owns a dog.",
            "Petting a dog can lower your blood pressure.",
            "Over half of dog owners include their dogs in annual holiday photos.",
            "Puppies are blind, deaf and toothless when born.",
            "Most dogs have fur",
            "A pack of dogs is often composed of eight to ten members.",
            "Dogs will poop facing the North-South magnetic axis",
            "Boy Scouts and Girl Scouts can earn badges for dog care and pet care",
            "Max, the world’s oldest dog, passed away at the ripe old age of 29 years and 282 days old in 2013.",
            "Tripping over your dog is the second most likely way to get injured around hounds.",
            "Dalmatian puppies are pure white when they are born and develop their spots as they grow older.",
            "45% of dogs sleep in their owner’s bed",
            "Dogs are not colorblind. They also see blue and yellow.",
            "A person who hunts with a Beagle is known as a “Beagler.”",
            "An African wolf dog known as the Basenji is the only dog in the world that cannot bark.",
            "A group of pugs is called a \"grumble.\""
    };

    String getFact() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }
}