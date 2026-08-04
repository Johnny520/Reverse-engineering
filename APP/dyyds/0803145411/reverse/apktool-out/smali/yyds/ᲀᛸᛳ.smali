.class public final Lyyds/ᲀᛸᛳ;
.super Lyyds/ᲀᛶᲁᛵ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;Lyyds/ᛷᛸᛸᛳ;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V
    .locals 4

    .line 1
    iget-object p2, p4, Lyyds/ᛸᛴᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛴᲈᛳᛶ;

    .line 2
    .line 3
    iget-object v0, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v0, p3, Ljava/util/Map;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p2, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 13
    .line 14
    invoke-virtual {p2, p3}, Lyyds/ᛱᛱᛴ;->ᛵᲀᲈᛴ(Ljava/lang/Object;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p0, p1, p3, p4, v0}, Lyyds/ᲀᛶᲁᛵ;->ᲇᲈᛵᛷ(Ljava/lang/String;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    instance-of v0, p3, Ljava/util/List;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    :goto_1
    iget-object v1, p2, Lyyds/ᛴᲈᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 53
    .line 54
    invoke-virtual {v1, p3}, Lyyds/ᛱᛱᛴ;->ᲈᲀᛲᲀ(Ljava/lang/Object;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-ge v0, v1, :cond_2

    .line 59
    .line 60
    :try_start_0
    invoke-virtual {p0, v0, p1, p3, p4}, Lyyds/ᲀᛶᲁᛵ;->ᲀᛲᛳᲀ(ILjava/lang/String;Ljava/lang/Object;Lyyds/ᛸᛴᛷᲇ;)V
    :try_end_0
    .catch Lyyds/ᛷᛵᛳᲈ; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :catch_0
    move-exception v1

    .line 65
    iget-object v2, p2, Lyyds/ᛴᲈᛳᛶ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 66
    .line 67
    sget-object v3, Lyyds/ᛲᲀᲇᲇ;->ᛶᛷᛲᲁ:Lyyds/ᛲᲀᲇᲇ;

    .line 68
    .line 69
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_1

    .line 74
    .line 75
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    throw v1

    .line 79
    :cond_2
    return-void
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "[*]"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
