.class public final Lyyds/ᛵᲀᲀᛶ;
.super Lyyds/ᲁᛳᛶᛶ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᛶᛳ:Ljava/lang/Object;

.field public ᛸᛸᛷᛱ:Lyyds/ᛳᛱᛶᛲ;


# virtual methods
.method public final varargs ᛱᲈᲁ([Lyyds/ᲁᛸᲀᛱ;)V
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    check-cast p1, [Lyyds/ᲁᛸᲀᛱ;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᲇᛴᲇᛶ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashSet;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lyyds/ᛶᲁᛶᲁ;->ᛵᲀᲈᛴ(Ljava/util/AbstractCollection;[Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final varargs ᛲᛳᛶᲁ([Ljava/lang/Object;)V
    .locals 1

    .line 1
    array-length v0, p1

    .line 2
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-virtual {p0, p1}, Lyyds/ᲁᛳᛶᛶ;->ᲇᲇᲇᛱ([Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final ᛲᲈᲁ()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᛲᲈᲁ:Lyyds/ᛴᛸᛲᛳ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lyyds/ᛴᛸᛲᛳ;->ᛲᲈᲁ:Ljava/lang/Class;

    .line 6
    .line 7
    new-instance v2, Lyyds/ᛸᛲᛲᲈ;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, p0, v0, v3}, Lyyds/ᛸᛲᛲᲈ;-><init>(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1, v2}, Lyyds/ᛲᛶᲇ;->ᛵᛶᛲᲀ(Lyyds/ᲇᛴᲇᛶ;Lyyds/ᛴᛸᛲᛳ;Ljava/lang/Class;Lyyds/ᛷᛴᲈᲀ;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string p0, "You must provide a configuration to resolve the member use build(configuration)."

    .line 19
    .line 20
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iput-object v0, p0, Lyyds/ᲁᛳᛶᛶ;->ᛷᛵᲇᲀ:Ljava/lang/Integer;

    .line 7
    .line 8
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Ljava/util/Map;
    .locals 8

    .line 1
    invoke-super {p0}, Lyyds/ᲁᛳᛶᛶ;->ᲀᛲᛳᲀ()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lyyds/ᛵᲀᲀᛶ;->ᛱᛳᛶᛳ:Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v2, Lkotlin/Pair;

    .line 8
    .line 9
    const-string v3, "returnType"

    .line 10
    .line 11
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛶ;->ᛸᛸᛷᛱ:Lyyds/ᛳᛱᛶᛲ;

    .line 15
    .line 16
    new-instance v3, Lkotlin/Pair;

    .line 17
    .line 18
    const-string v1, "returnTypeCondition"

    .line 19
    .line 20
    invoke-direct {v3, v1, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lkotlin/Pair;

    .line 24
    .line 25
    const-string p0, "isBridge"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v4, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v5, Lkotlin/Pair;

    .line 32
    .line 33
    const-string p0, "isBridgeNot"

    .line 34
    .line 35
    invoke-direct {v5, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v6, Lkotlin/Pair;

    .line 39
    .line 40
    const-string p0, "isDefault"

    .line 41
    .line 42
    invoke-direct {v6, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v7, Lkotlin/Pair;

    .line 46
    .line 47
    const-string p0, "isDefaultNot"

    .line 48
    .line 49
    invoke-direct {v7, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array/range {v2 .. v7}, [Lkotlin/Pair;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lyyds/ᲁᲈᛶᛴ;->ᛶᲈᛴᲈ([Lkotlin/Pair;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 66
    .line 67
    .line 68
    return-object v1
.end method
