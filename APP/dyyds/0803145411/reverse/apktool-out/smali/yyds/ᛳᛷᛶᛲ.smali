.class public abstract Lyyds/ᛳᛷᛶᛲ;
.super Lyyds/ᲇᛸᛴᛷ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# virtual methods
.method public final ᛲᲈᲁ(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyyds/ᛳᛷᛶᛲ;->ᲇᲇᲇᛱ()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    rsub-int/lit8 v0, p1, 0x20

    .line 10
    .line 11
    ushr-int/2addr p0, v0

    .line 12
    neg-int p1, p1

    .line 13
    shr-int/lit8 p1, p1, 0x1f

    .line 14
    .line 15
    and-int/2addr p0, p1

    .line 16
    return p0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛳᛷᛶᛲ;->ᲇᲇᲇᛱ()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/Random;->nextInt()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final ᛶᛷᛲᲁ(I)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛳᛷᛶᛲ;->ᲇᲇᲇᛱ()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Ljava/util/Random;->nextInt(I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public abstract ᲇᲇᲇᛱ()Ljava/util/Random;
.end method

.method public final ᲇᲈᛵᛷ()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛳᛷᛶᛲ;->ᲇᲇᲇᛱ()Ljava/util/Random;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/util/Random;->nextLong()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method
