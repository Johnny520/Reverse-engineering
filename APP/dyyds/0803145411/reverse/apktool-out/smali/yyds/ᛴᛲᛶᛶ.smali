.class public final Lyyds/ᛴᛲᛶᛶ;
.super Lyyds/ᲇᛴᲇᛶ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Ljava/lang/Object;

.field public ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;


# virtual methods
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
    const/4 v3, 0x1

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

.method public final ᲀᛲᛳᲀ()Ljava/util/Map;
    .locals 8

    .line 1
    invoke-super {p0}, Lyyds/ᲇᛴᲇᛶ;->ᲀᛲᛳᲀ()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lkotlin/Pair;

    .line 6
    .line 7
    const-string v2, "isEnumConstant"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lkotlin/Pair;

    .line 14
    .line 15
    const-string v4, "isEnumConstantNot"

    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, Lyyds/ᛴᛲᛶᛶ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v5, v3

    .line 23
    new-instance v3, Lkotlin/Pair;

    .line 24
    .line 25
    const-string v6, "type"

    .line 26
    .line 27
    invoke-direct {v3, v6, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lyyds/ᛴᛲᛶᛶ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 31
    .line 32
    new-instance v4, Lkotlin/Pair;

    .line 33
    .line 34
    const-string v6, "typeCondition"

    .line 35
    .line 36
    invoke-direct {v4, v6, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object p0, v5

    .line 40
    new-instance v5, Lkotlin/Pair;

    .line 41
    .line 42
    const-string v6, "genericType"

    .line 43
    .line 44
    invoke-direct {v5, v6, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v6, Lkotlin/Pair;

    .line 48
    .line 49
    const-string v7, "genericTypeCondition"

    .line 50
    .line 51
    invoke-direct {v6, v7, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    filled-new-array/range {v1 .. v6}, [Lkotlin/Pair;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lyyds/ᲁᲈᛶᛴ;->ᛶᲈᛴᲈ([Lkotlin/Pair;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 68
    .line 69
    .line 70
    return-object v1
.end method
