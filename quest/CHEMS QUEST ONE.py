#stage no es traducible sin dañar el codigo

stage.set_background("halfcourt")
dibujo = codesters.Sprite("player1")
dibujo.go_to(-175, -150)
red = codesters.Sprite("basketballnet")
red.go_to(215, 175)
stage.set_gravity(10)
dibujo.set_gravity_off()

def click(dibujo):
    pelota = codesters.Sprite("basketball")
    pelota.go_to(-175, -125)
    pelota.set_x_speed(10)
    pelota.set_y_speed(10)
    
dibujo.event_click(click)
stage.disable_right_wall()

def collision(red, golpe_dibujo):
    mi_variable = golpe_dibujo.get_image_name()
    if mi_variable == "basketball":
        dibujo.say("marcaste punto jajajaj")
        golpe_dibujo.hide()
        global puntuacion
        puntuacion += 1
        mi_pantalla.update(puntuacion)
        
red.event_collision(collision)

dibujo = codesters.Text("mete bola mete punto :v")
puntuacion = 0
mi_pantalla = codesters.Display(puntuacion, -200, 150)


