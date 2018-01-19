def call() {
  def config = [ a : 1, b : [ c : 2, d : 3] ]
  this['config'] =  config
}
