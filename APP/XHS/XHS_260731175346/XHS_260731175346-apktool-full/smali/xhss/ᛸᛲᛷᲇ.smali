.class public final Lxhss/ᛸᛲᛷᲇ;
.super Ljava/util/HashMap;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛳᛱᛴᲀ;
.implements Lxhss/ᲁᲇᛶᛶ;


# direct methods
.method public static ᛷᛴᛷᛱ(Ljava/util/Map;Lxhss/ᲇᛳᛶ;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p0, v0, p1}, Lxhss/ᛸᛲᛷᲇ;->ᲇᛶᛴᲀ(Ljava/util/Map;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static ᲇᛶᛴᲀ(Ljava/util/Map;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x7b

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v0, 0x1

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    iget-boolean v3, p2, Lxhss/ᲇᛳᛶ;->ᛷᛵᛵᲈ:Z

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v3, 0x2c

    .line 46
    .line 47
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1, v2, p1, p2}, Lxhss/ᛳᛱᛲᲀ;->ᛴᲈᛱᛴ(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/16 p0, 0x7d

    .line 63
    .line 64
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 65
    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛳᛶ;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lxhss/ᛸᛲᛷᲇ;->ᛷᛴᛷᛱ(Ljava/util/Map;Lxhss/ᲇᛳᛶ;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ(Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lxhss/ᛸᛲᛷᲇ;->ᲇᛶᛴᲀ(Ljava/util/Map;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ᛳᲁᲇᛸ()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛳᛶ;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lxhss/ᛸᛲᛷᲇ;->ᛷᛴᛷᛱ(Ljava/util/Map;Lxhss/ᲇᛳᛶ;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲇᛳᛶ;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxhss/ᛸᛲᛷᲇ;->ᛷᛴᛷᛱ(Ljava/util/Map;Lxhss/ᲇᛳᛶ;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛳᛶ;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lxhss/ᛸᛲᛷᲇ;->ᲇᛶᛴᲀ(Ljava/util/Map;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
