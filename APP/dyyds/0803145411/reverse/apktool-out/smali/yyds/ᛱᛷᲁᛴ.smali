.class public final Lyyds/ᛱᛷᲁᛴ;
.super Lyyds/ᲁᛳᛶᛶ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# virtual methods
.method public final ᛲᲈᲁ()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᛲᲈᲁ:Lyyds/ᛴᛸᛲᛳ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0, v0}, Lyyds/ᛲᛶᲇ;->ᲇᲇᲇᛱ(Lyyds/ᛱᛷᲁᛴ;Lyyds/ᛴᛸᛲᛳ;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0, v0}, Lyyds/ᛲᛶᲇ;->ᲀᛲᛲᲇ(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    const-string p0, "You must provide a configuration to resolve the member use build(configuration)."

    .line 23
    .line 24
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lyyds/ᲁᛳᛶᛶ;->ᛲᛴᛳᛲ(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method
