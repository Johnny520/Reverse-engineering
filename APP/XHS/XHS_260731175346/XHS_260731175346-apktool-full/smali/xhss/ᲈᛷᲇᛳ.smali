.class public abstract Lxhss/ᲈᛷᲇᛳ;
.super Lxhss/ᛳᛳᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# virtual methods
.method public final ᛸᛷᲈᲈ(Ljava/lang/String;Ljava/lang/Object;Lxhss/ᛵᲈᛷ;)Z
    .locals 1

    .line 1
    iget-object p3, p3, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 2
    .line 3
    sget-object v0, Lxhss/ᛳᛳᛱᛳ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛳᛱᛳ;

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->ᛸᛴᛶᛳ()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_3

    .line 12
    .line 13
    iget-object p0, p3, Lxhss/ᲀᛲᲇ;->ᛳᲁᲇᛸ:Ljava/util/Set;

    .line 14
    .line 15
    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p0, Lxhss/ᛸᲁᛴᛷ;

    .line 23
    .line 24
    const-string p2, "The path "

    .line 25
    .line 26
    const-string p3, " is null"

    .line 27
    .line 28
    invoke-static {p2, p1, p3}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :cond_1
    iget-object p1, p3, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    instance-of p1, p2, Ljava/util/List;

    .line 42
    .line 43
    if-nez p1, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->ᛸᛴᛶᛳ()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    iget-object p1, p3, Lxhss/ᲀᛲᲇ;->ᛳᲁᲇᛸ:Ljava/util/Set;

    .line 52
    .line 53
    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    new-instance p1, Lxhss/ᛸᲁᛴᛷ;

    .line 61
    .line 62
    invoke-virtual {p0}, Lxhss/ᛳᛳᛵᛱ;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    filled-new-array {p0, p2}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const-string p2, "Filter: %s can only be applied to arrays. Current context is: %s"

    .line 71
    .line 72
    invoke-static {p2, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 81
    return p0

    .line 82
    :cond_4
    const/4 p0, 0x1

    .line 83
    return p0
.end method
