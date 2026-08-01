.class public final Lxhss/ᛷᛷᛳᛶ;
.super Lxhss/ᛴᛴᛴᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᲇᛴᲇᛵ:I


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lxhss/ᛴᛴᛴᛷ;

    .line 2
    .line 3
    instance-of v0, p1, Lxhss/ᛷᛷᛳᛶ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lxhss/ᛷᛷᛳᛶ;

    .line 8
    .line 9
    iget p1, p1, Lxhss/ᛷᛷᛳᛶ;->ᲇᛴᲇᛵ:I

    .line 10
    .line 11
    iget p0, p0, Lxhss/ᛷᛷᛳᛶ;->ᲇᛴᲇᛵ:I

    .line 12
    .line 13
    invoke-static {p1, p0}, Ljava/lang/Integer;->compare(II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-super {p0, p1}, Lxhss/ᛴᛴᛴᛷ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛴᛴᛷ;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final ᛱᛱᛲᲇ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᛷᛷᛳᛶ;->ᲇᛴᲇᛵ:I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛴᛴᛷ;)I
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method
