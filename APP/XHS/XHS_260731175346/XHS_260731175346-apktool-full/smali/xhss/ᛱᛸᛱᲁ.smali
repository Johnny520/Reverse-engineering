.class public final Lxhss/ᛱᛸᛱᲁ;
.super Lxhss/ᛱᛶᛶᛱ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public ᛱᛱᛲᲇ:Ljava/util/ArrayList;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lxhss/ᛱᛸᛱᲁ;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    check-cast p1, Lxhss/ᛱᛸᛱᲁ;

    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᛱᛸᛱᲁ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object p1, p1, Lxhss/ᛱᛸᛱᲁ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛸᛱᲁ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛸᛱᲁ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    const-string v1, ","

    .line 6
    .line 7
    invoke-static {v1, v0, p0}, Lxhss/ᛵᛵᛲᲈ;->ᲇᛸᛳᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "["

    .line 12
    .line 13
    const-string v1, "]"

    .line 14
    .line 15
    invoke-static {v0, p0, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ()Lxhss/ᛱᛸᛱᲁ;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ᛸᛷᲈᲈ(Lxhss/ᲈᲀᲇᛵ;)Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
