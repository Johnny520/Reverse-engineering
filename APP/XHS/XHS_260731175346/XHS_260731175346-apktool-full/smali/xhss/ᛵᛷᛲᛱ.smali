.class public final Lxhss/ᛵᛷᛲᛱ;
.super Lxhss/ᛶᛵᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᲇᛴᲇᛵ:Ljava/util/List;


# virtual methods
.method public final ᛵᛲᲁᛶ(Lxhss/ᛷᛴᛲᛲ;)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛴᲁᛶᲁ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lxhss/ᛵᛷᛲᛱ;->ᲇᛴᲇᛵ:Ljava/util/List;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-object p1, p0, Lxhss/ᛵᛷᛲᛱ;->ᲇᛴᲇᛵ:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I
    .locals 3

    .line 1
    iget-object p0, p0, Lxhss/ᛵᛷᛲᛱ;->ᲇᛴᲇᛵ:Ljava/util/List;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-static {p0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lxhss/ᛴᲁᛶᲁ;

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Lxhss/ᛴᲁᛶᲁ;->ᛸᛶᲈᛶ(Lxhss/ᛱᲁᛴᲈ;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v1}, Lxhss/ᛷᲇᛵᛳ;->ᛱᛲᛸᲇ(Ljava/util/ArrayList;)[I

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᲀᲇᛳᲁ([I)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move p0, v0

    .line 53
    :goto_1
    const/4 v1, 0x3

    .line 54
    invoke-virtual {p1, v1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛶᲈᛶ(I)V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    invoke-virtual {p1, v1, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v0, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛷᛴᛷᛱ(II)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x1

    .line 65
    invoke-virtual {p1, p0, v0}, Lxhss/ᛱᲁᛴᲈ;->ᛱᛱᛲᲇ(IB)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛴᛶᛳ()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-virtual {p1, p0}, Lxhss/ᛱᲁᛴᲈ;->ᛸᛷᲈᲈ(I)V

    .line 73
    .line 74
    .line 75
    return p0
.end method
