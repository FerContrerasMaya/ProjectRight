radio = input ("Ingresa el radio del circulo: ")
radio = float (radio)

if (radio <= 0):
    print ("error")
    print ("Gracias, bye")
else:
    radios = (radio * radio)
    area = float (3.1416 * radios)
    print ("El area es: " , area)

