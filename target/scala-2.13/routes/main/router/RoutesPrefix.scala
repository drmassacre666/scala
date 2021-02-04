// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/LENOVO LEGION/Desktop/scalaku/conf/routes
// @DATE:Thu Feb 04 19:20:09 SGT 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
