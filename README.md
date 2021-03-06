# 172Project4
Project 4
Name: Margaret M. Curtis
Partner: Scott Onestak

Short Description:
Program that runs based on command line arguments. If the argument desires a meridian path(kruskal’s) through the ur campus, it will output the graph GUI and show the MWST on the map in a colored line. The console will print out the roads traveled in order. If the argument desires the shortest path (dijkstras), it will output a GUI with the proper map and the shortest path between the two given points with a different colored line. The console will print out the intersections in order and the total distance traveled in miles. 

Directions for running code:
Code can be run in Eclipse
Code can be run in Terminal
cd Desktop 
javac Test.java
example command line arguments:
for Kruskal’s: ur_campus.txt -show -meridianmap
for Dijkstra’s: nys.txt -show -directions i0 i200
java Test

Expected Source Output for Test Cases:
MONROE COUNTY: DIJKSTRA’S
Here is how to get from i29 to i429: 
i429 -> i430 -> i431 -> i432 -> i433 -> i434 -> i435 -> i436 -> i437 -> i438 -> i439 -> i440 -> i441 -> i442 -> i443 -> i444 -> i445 -> i446 -> i447 -> i448 -> i449 -> i450 -> i451 -> i452 -> i453 -> i454 -> i455 -> i456 -> i457 -> i458 -> i459 -> i4659 -> i4658 -> i4657 -> i4656 -> i55469 -> i55468 -> i55467 -> i55466 -> i55465 -> i55464 -> i55463 -> i2594 -> i35275 -> i55462 -> i44516 -> i52056 -> i55461 -> i17904 -> i55460 -> i55459 -> i17918 -> i55458 -> i55457 -> i55456 -> i28848 -> i55204 -> i55455 -> i55454 -> i55453 -> i55452 -> i55451 -> i55450 -> i55449 -> i55448 -> i55447 -> i55446 -> i55445 -> i55444 -> i28445 -> i5868 -> i53236 -> i55443 -> i35446 -> i55442 -> i38416 -> i55441 -> i55440 -> i55439 -> i5928 -> i55438 -> i55437 -> i55436 -> i55435 -> i55434 -> i49228 -> i55433 -> i55432 -> i55431 -> i55430 -> i55429 -> i55428 -> i23947 -> i55077 -> i55427 -> i25563 -> i55426 -> i55425 -> i52084 -> i55424 -> i55423 -> i55422 -> i22256 -> i1836 -> i1835 -> i1834 -> i2150 -> i2149 -> i2148 -> i2147 -> i55421 -> i55420 -> i55419 -> i55418 -> i55417 -> i55416 -> i55415 -> i55414 -> i55413 -> i55412 -> i55411 -> i35687 -> i55410 -> i55409 -> i53853 -> i55408 -> i15347 -> i55407 -> i55406 -> i55405 -> i35501 -> i15336 -> i55404 -> i55403 -> i55402 -> i42283 -> i55401 -> i55400 -> i55399 -> i55398 -> i55397 -> i19148 -> i55396 -> i55395 -> i55394 -> i55393 -> i55392 -> i55391 -> i48797 -> i48796 -> i48795 -> i48794 -> i48793 -> i48792 -> i48791 -> i8673 -> i70060 -> i70061 -> i70062 -> i70063 -> i8837 -> i50625 -> i70064 -> i63905 -> i70065 -> i70066 -> i63880 -> i70067 -> i70068 -> i70069 -> i70070 -> i70071 -> i70072 -> i70073 -> i70074 -> i70075 -> i70076 -> i70077 -> i70078 -> i70079 -> i70080 -> i70081 -> i11457 -> i70082 -> i70083 -> i70084 -> i70085 -> i70086 -> i70087 -> i70088 -> i70089 -> i32750 -> i70090 -> i70091 -> i70092 -> i70093 -> i71714 -> i58185 -> i58182 -> i75109 -> i41910 -> i65310 -> i74243 -> i58161 -> i11472 -> i50631 -> i41909 -> i11633 -> i42011 -> i71794 -> i50793 -> i65394 -> i42013 -> i50795 -> i32844 -> i65395 -> i21916 -> i42020 -> i71797 -> i58243 -> i65396 -> i21920 -> i65397 -> i42018 -> i21922 -> i50824 -> i72729 -> i21929 -> i58252 -> i61411 -> i21931 -> i42035 -> i67991 -> i42043 -> i42060 -> i42051 -> i50852 -> i75108 -> i66327 -> i59599 -> i66373 -> i58277 -> i75107 -> i66341 -> i43168 -> i75106 -> i50634 -> i13178 -> i66402 -> i66401 -> i66400 -> i66399 -> i66398 -> i66397 -> i36021 -> i36020 -> i36019 -> i15764 -> i15765 -> i15766 -> i15767 -> i15768 -> i73 -> i15769 -> i15770 -> i15771 -> i15772 -> i15773 -> i15774 -> i15775 -> i15776 -> i82 -> i15777 -> i15778 -> i15779 -> i15780 -> i15781 -> i15782 -> i15783 -> i15784 -> i15785 -> i15786 -> i15787 -> i15788 -> i15789 -> i15214 -> i15790 -> i15791 -> i15792 -> i15793 -> i15794 -> i15224 -> i15795 -> i15796 -> i15797 -> i15798 -> i15799 -> i15800 -> i15801 -> i15802 -> i15803 -> i15804 -> i15805 -> i15806 -> i15807 -> i15808 -> i15809 -> i15810 -> i15811 -> i15812 -> i15813 -> i15814 -> i15815 -> i15816 -> i15817 -> i15818 -> i15819 -> i15820 -> i15821 -> i15822 -> i15823 -> i61455 -> i36712 -> i36713 -> i15832 -> i3180 -> i36714 -> i3190 -> i15754 -> i36715 -> i36716 -> i15749 -> i16437 -> i36717 -> i3557 -> i36718 -> i36719 -> i36720 -> i36721 -> i36722 -> i36723 -> i36724 -> i36725 -> i36726 -> i61770 -> i61771 -> i61772 -> i61773 -> i16413 -> i37288 -> i37289 -> i37290 -> i37291 -> i37292 -> i36966 -> i36967 -> i36968 -> i54144 -> i26996 -> i54145 -> i54146 -> i54147 -> i54148 -> i54149 -> i54150 -> i54151 -> i54152 -> i54153 -> i54154 -> i37357 -> i37358 -> i37359 -> i37360 -> i37361 -> i37362 -> i37363 -> i8592 -> i8593 -> i8594 -> i8595 -> i8596 -> i8597 -> i8598 -> i8599 -> i8600 -> i8601 -> i8602 -> i1789 -> i1790 -> i1791 -> i1792 -> i1793 -> i1794 -> i1795 -> i1796 -> i1797 -> i1798 -> i1799 -> i1800 -> i1801 -> i19 -> i20 -> i21 -> i22 -> i23 -> i24 -> i25 -> i26 -> i27 -> i28 -> i29
The total distance traveled from i29 to i429 is 16.704660990882484 miles

UR CAMPUS: KRUSKAL’S
GILBERT-LONG to i2
i9 to i10
i74 to GOERGEN
i6 to i7
i19 to i22
i18 to i22
TIERNAN-SHORT to i3
i7 to i8
i63 to HARKNESS
i8 to i9
i17 to i18
i20 to i19
i50 to i48
i49 to i53
i23 to i24
i38 to i37
i37 to i38
i26 to i32
i24 to i25
i76 to UHS
i34 to i35
i73 to i71
i23 to i25
i16 to i41
i26 to i27
i35 to BURTON
CROSBY to i27
i1 to i2
i52 to i47
BURTON to i34
i1 to i3
i75 to CSB
i17 to i20
i26 to CROSBY
i70 to i71
i72 to WILMOT
i82 to ANDERSON
i8 to i13
i30 to i29
RETTNER to i39
i77 to i76
i11 to i3
SIMON to i53
i24 to i32
i2 to i4
i82 to SAGE
i40 to i28
i54 to i30
i10 to i11
i10 to i11
i24 to i26
i35 to i36
i15 to HOEING
i23 to i34
i4 to i6
i38 to LECHASE
i64 to GAVETT
i4 to i5
i67 to WALLIS
i65 to GAVETT
i11 to TIERNAN-COMMON
i14 to i18
i33 to i30
i14 to LOVEJOY
i12 to i11
i49 to i47
GILBERT-COMMON to i4
i33 to WILSON
i50 to i52
i58 to i61
i29 to i28
i15 to i19
i44 to i45
i53 to i52
i47 to i48
i55 to i42
i10 to i12
i10 to i12
i29 to i54
i45 to HOYT
RUSH-RHEES to i43
i57 to i58
i65 to i66
i38 to i51
i75 to HYLAN
i66 to HOPEMAN
i25 to i31
i60 to ITS
i39 to TUNNEL-MOREY
i82 to WILDER
i13 to i15
WILSON to RETTNER
i64 to i65
i59 to i58
i13 to i14
i21 to i40
i42 to RUSH-RHEES
i57 to MELIORA-NORTH
i36 to i37
i14 to i16
HOPEMAN to i67
ITS to i59
i9 to i3
i41 to i36
i17 to i23
i20 to i24
i15 to i21
i56 to i43
i75 to HUTCH-UPPER
i43 to B&L
i2 to i7
i61 to i62
i74 to i75
i32 to i31
i67 to GLEASON-HALL
i27 to i28
i42 to MOREY
i16 to i17
i62 to MELIORA-SOUTH
DEWEY to i49
i48 to LATTIMORE
i54 to GOERGEN-ATHLETIC
i42 to WILSON-BRIDGE
