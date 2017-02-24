import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.{Group, Scene}
import scalafx.scene.control.Label
import scalafx.scene.text.Font
/**
  * Created by aworton on 24/02/17.
  */
object HelloFx extends JFXApp{

  stage = new PrimaryStage
  stage.setTitle("Hello ScalaFX")

  val group = new Group(new Label("Hello Label"){styleClass = Iterable("scale")})
  val scene = new Scene(group, 800, 600)
  scene.stylesheets.add("main.css")
  stage.scene = scene
}
