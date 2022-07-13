Polymorphism Exercise
<ol>
<li> Create a Person class with attributes String name and int health. 
Create a constructor with parameter name and set health = 100;.  
Create getter methods for name and health and setter method for 
  health.</li>
<li> Create a Warrior class that extends Person with an attribute Weapon 
weapon;. Create a constructor with parameter name. Call the super 
constructor with the name. Create a setter method 
  setWeapon(Weapon weapon);.</li>
<li> Create a Weapon class with one abstract method strike(Warrior 
  opponent); an no attributes.</li>
<li> To the Warrior class. Add a decHealth method with a single 
parameter int amt. Set the health value to Math.max(0, health – 
amt); which will keep the health attribute from going negative. Then 
call the opponent’s decHealth method. The getName, getHealth, 
  and setHealth from Person class will be used.</li>
<li> To the Warrior class add an attack method that takes a Warrior 
opponent parameter. If this warrior’s health is positive and the 
opponent’s health is positive and this warrior’s weapon is not null, 
print this warrior’s name is attacking the opponent’s name. Finally, 
  print the opponent’s name and health.</li>
<li> Use the provided Weapons and Main classes to validate your Warrior 
  and Weapon classes.</li>
<li> Output should be:<ul>
<li>Xena is attacking Star</li>
<li>Mesmerizing Star</li>
<li>Star health = 97</li>
<li>Star is attacking Xena</li>
<li>Slashing Xena</li>
<li>Xena health = 95</li>
<li>Xena is attacking Star</li>
<li>Snapping Star</li>
  <li>Star health = 93</li></ul>
  </li>
</ol>
