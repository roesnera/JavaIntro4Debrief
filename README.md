Polymorphism Exercise
<ol>
<li> Create a Person class with attributes String name and int health. 
Create a constructor with parameter name and set <strong>health = 100;</strong>.  
Create getter methods for <strong>name</strong> and <strong>health</strong> and setter method for 
  <strong>health</strong>.</li>
<li> Create a Warrior class that extends Person with an attribute <strong>Weapon 
weapon;</strong>. Create a constructor with parameter <strong>name</strong>. Call the super 
constructor with the <strong>name</strong>. Create a setter method 
  <strong>setWeapon(Weapon weapon);</strong>.</li>
<li> Create a Weapon class with one abstract method <strong>strike(Warrior 
  opponent);</strong> an no attributes.</li>
<li> To the <strong>Warrior</strong> class. Add a <strong>decHealth</strong> method with a single 
parameter <strong>int amt</strong>. Set the <strong>health</strong> value to <strong>Math.max(0, health – 
amt);</strong> which will keep the <strong>health</strong> attribute from going negative. Then 
call the opponent’s <strong>decHealth</strong> method. The <strong>getName</strong>, <strong>getHealth</strong>, 
  and <strong>setHealth</strong> from Person class will be used.</li>
<li> To the <strong>Warrior</strong> class add an <strong>attack</strong> method that takes a <strong>Warrior 
opponent</strong> parameter. If this warrior’s <strong>health</strong> is positive and the 
opponent’s <strong>health</strong> is positive and this warrior’s <strong>weapon</strong> is not null, 
print this warrior’s <strong>name</strong> is attacking the opponent’s <strong>name</strong>. Finally, 
  print the opponent’s <strong>name</strong> and <strong>health</strong>.</li>
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
