// use an integer for version numbers
version = 16


cloudstream {
    language = "id"
    // All of these properties are optional, you can safely remove them

    description = "Otakudesu is the place to find the best anime you can find."
    authors = listOf("TeKuma25", "CodeSannz")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "AnimeMovie",
        "Anime",
        "OVA",
    )

    iconUrl = "https://github.com/CodeSannz/IndoMovie/raw/refs/heads/master/Otakudesu/icon.png"
}
