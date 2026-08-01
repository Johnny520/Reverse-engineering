.class public final Lxhss/ᛵᛸᲈᛲ;
.super Lxhss/ᛵᛷᛴᲁ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᲀᲇᛳᲁ:Ljava/lang/String;


# virtual methods
.method public final ᛳᲁᲇᛸ()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛵᛷᛴᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛵᲇᲈ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lxhss/ᛸᛵᲇᲈ;->ᛷᛵᛵᲈ:Ljava/lang/Class;

    .line 6
    .line 7
    new-instance v2, Lxhss/ᲇᛵᲇᛱ;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    invoke-direct {v2, v3, p0, v0}, Lxhss/ᲇᛵᲇᛱ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1, v2}, Lxhss/ᛱᛷᛵᛸ;->ᛶᲇᲈᛸ(Lxhss/ᛵᛷᛴᲁ;Lxhss/ᛸᛵᲇᲈ;Ljava/lang/Class;Lxhss/ᛷᛴᛲᛲ;)Ljava/util/List;

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
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/util/Map;
    .locals 8

    .line 1
    invoke-super {p0}, Lxhss/ᛵᛷᛴᲁ;->ᛷᛵᛵᲈ()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lxhss/ᲀᛴᛳᛸ;

    .line 6
    .line 7
    const-string v2, "isEnumConstant"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, v3}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lxhss/ᲀᛴᛳᛸ;

    .line 14
    .line 15
    const-string v4, "isEnumConstantNot"

    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lxhss/ᛵᛸᲈᛲ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 21
    .line 22
    move-object v4, v3

    .line 23
    new-instance v3, Lxhss/ᲀᛴᛳᛸ;

    .line 24
    .line 25
    const-string v5, "type"

    .line 26
    .line 27
    invoke-direct {v3, v5, p0}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v4

    .line 31
    new-instance v4, Lxhss/ᲀᛴᛳᛸ;

    .line 32
    .line 33
    const-string v5, "typeCondition"

    .line 34
    .line 35
    invoke-direct {v4, v5, p0}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Lxhss/ᲀᛴᛳᛸ;

    .line 39
    .line 40
    const-string v6, "genericType"

    .line 41
    .line 42
    invoke-direct {v5, v6, p0}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, Lxhss/ᲀᛴᛳᛸ;

    .line 46
    .line 47
    const-string v7, "genericTypeCondition"

    .line 48
    .line 49
    invoke-direct {v6, v7, p0}, Lxhss/ᲀᛴᛳᛸ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array/range {v1 .. v6}, [Lxhss/ᲀᛴᛳᛸ;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lxhss/ᲁᛵᛸᛳ;->ᲇᛸᛳᲁ([Lxhss/ᲀᛴᛳᛸ;)Ljava/util/Map;

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
