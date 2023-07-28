package bwf.idat.evaluacioncontinua01bennywochinyflores.Model

data class Libreria(
    val name :String,
    val  id: Int,
    val imgen: String,
    val autor :String,
    val año_nacido: Int,
    val año_muerte: Int

) fun getData() : List<Libreria> = listOf(
    Libreria("Fausto",10021,"https://www.gutenberg.org/cache/epub/68566/pg68566.cover.medium.jpg","Goethe, Johann Wolfgang von",1749,1832)
)
