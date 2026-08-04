.class public final Lyyds/ᛱᲁᲀᲁ;
.super Lyyds/ᛷᛸᛸᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:I


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lyyds/ᛷᛸᛸᛳ;

    .line 2
    .line 3
    instance-of v0, p1, Lyyds/ᛱᲁᲀᲁ;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lyyds/ᛱᲁᲀᲁ;

    .line 8
    .line 9
    iget p1, p1, Lyyds/ᛱᲁᲀᲁ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    iget p0, p0, Lyyds/ᛱᲁᲀᲁ;->ᛲᛴᛳᛲ:I

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
    invoke-super {p0, p1}, Lyyds/ᛷᛸᛸᛳ;->ᛲᲈᲁ(Lyyds/ᛷᛸᛸᛳ;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛷᛸᛸᛳ;)I
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛱᲁᲀᲁ;->ᛲᛴᛳᛲ:I

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
