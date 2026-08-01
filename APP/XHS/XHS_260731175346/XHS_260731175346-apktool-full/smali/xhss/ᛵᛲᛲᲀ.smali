.class public final Lxhss/ᛵᛲᛲᲀ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛷᛴᛷᛱ:Lxhss/ᲁᛴᲇᛲ;

.field public ᲇᛴᲇᛵ:Ljava/util/List;


# virtual methods
.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛵᛲᛲᲀ;->ᲇᛴᲇᛵ:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {v0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lxhss/ᛱᛳᛸ;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    :goto_1
    invoke-virtual {v3, p1}, Lxhss/ᛱᛳᛸ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    new-instance v3, Lxhss/ᛱᛳᛸ;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-static {v2}, Lxhss/ᛷᲇᛵᛳ;->ᛱᛲᛸᲇ(Ljava/util/ArrayList;)[I

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᲀᲇᛳᲁ([I)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    move v0, v1

    .line 62
    :goto_3
    iget-object p0, p0, Lxhss/ᛵᛲᛲᲀ;->ᛷᛴᛷᛱ:Lxhss/ᲁᛴᲇᛲ;

    .line 63
    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lxhss/ᲁᛴᲇᛲ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    goto :goto_4

    .line 71
    :cond_3
    move p0, v1

    .line 72
    :goto_4
    const/4 v2, 0x2

    .line 73
    invoke-virtual {p1, v2}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 74
    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-virtual {p1, v2, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 88
    .line 89
    .line 90
    return p0
.end method
