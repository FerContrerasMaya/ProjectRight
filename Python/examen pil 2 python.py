nombre = input ("Ingresa tu nombre: ")
apellido = input ("Ingresa tu apellido: ")
edad = input ("Ingresa tu edad: ")
edad = int (edad)

if (edad < 18 or edad > 69) :
    print ("No puede solicitar un credito bancario debe tener entre 18 y 69 años")
    print ("Gracias, bye")
else :
    mensuales = input ("Ingresos mensuales: ")
    mensuales = int (mensuales)
    if (mensuales <= 10000)  :
        print ("Usted aun no es candidatp pra tramitar un credito con nosotros")
        print ("Gracias, bye")
    if (mensuales > 10000 and mensuales <= 25000) :
        print ("Usted es candidato para nuestra segmentacion clasica")
        print ("Gracias, bye")
    if (mensuales > 25000 and mensuales <= 35000) :
        print ("Usted es candidato para nuestra segmentacion oro")
        print ("Gracias, bye")
    if (mensuales > 35000) :
        print ("Usted es candidato para nuestra segmentacion platino")
        print ("Gracias, bye")


                   
                


