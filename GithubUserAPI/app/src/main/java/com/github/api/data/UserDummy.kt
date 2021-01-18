package com.github.api.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list  = arrayListOf<User>()

        list.add(User(
            "JakeWharton",
            "https://avatars0.githubusercontent.com/u/66577?v=4",
            "https://github.com/JakeWharton",
            "https://api.github.com/users/JakeWharton/followers",
            10,
            "https://api.github.com/users/JakeWharton/following{/other_user}",
            15,
            "https://api.github.com/users/JakeWharton/repos",
            10
        ))

        list.add(User(
            "SidiqPermana",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            10,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            15,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(User(
            "Mane",
            "https://avatars3.githubusercontent.com/u/402056?v=4",
            "https://github.com/mane",
            "https://api.github.com/users/mane/followers",
            10,
            "https://api.github.com/users/mane/following{/other_user}",
            15,
            "https://api.github.com/users/mane/repos",
            10
        ))

        list.add(User(
            "Alex",
            "https://avatars2.githubusercontent.com/u/772?v=4",
            "https://github.com/alex",
            "https://api.github.com/users/alex/followers",
            10,
            "https://api.github.com/users/alex/following{/other_user}",
            15,
            "https://api.github.com/users/alex/repos",
            10
        ))

        list.add(User(
            "JakeWharton5",
            "https://avatars0.githubusercontent.com/u/645548?v=4",
            "https://github.com/kaira",
            "https://api.github.com/users/kaira/followers",
            10,
            "https://api.github.com/users/anshukaira/following{/other_user}",
            15,
            "https://api.github.com/users/anshukaira/repos",
            10
        ))
        return list
    }
}