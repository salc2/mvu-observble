import monix.eval.Task
import monix.reactive.Observable

trait Runtime {

  type Model

  type Msg

  def view(model: Model): Unit

  def init:(Model, Task[Msg])


  def update(msg: Msg, model: Model): (Model, Task[Msg])

  def main: Observable[Msg]


  private val backbone: Observable[Model] = main.scan(init._1)( (mo,msg) => {
    val (nm, tsk) = update(msg, mo)

    ???
  } )



}
