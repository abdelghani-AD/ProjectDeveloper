package com.example.projectdeveloper.model

data class ModeleRecyclerView(var langage: String, var developper: String, var image: Int)

/*class ModeleRecyclerView {
     var langage: String
     var developper: String
    private var image:Int = 0
    constructor(langage: String, developper: String, image: Int) {
        this.langage = langage
        this.developper = developper
        this.image = image
    }
    fun ModeleRecyclerView(langage: String?, developper: String?, image:Int=0) {
        this.langage = langage.toString()
        this.developper = developper.toString()
        this.image = image
    }

    fun getLangage(): String? {
        return langage
    }

    fun setName(name: String?) {
        this.langage = name.toString()
    }

    fun getDevelopper(): String? {
        return developper
    }

    fun setDevelopper(d: String?) {
        developper = d.toString()
    }
    fun getImage(): Int? {
        return image
    }
    fun setImage(age: Int=0) {
        this.image = age
    }
}*/