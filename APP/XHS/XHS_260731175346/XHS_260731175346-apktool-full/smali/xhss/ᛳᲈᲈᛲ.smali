.class public abstract Lxhss/ᛳᲈᲈᛲ;
.super Lxhss/ᲇᲁᛴᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# virtual methods
.method public final ᛱᛱᛲᲇ()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᲈᲈᛲ;->ᲇᛴᲇᛵ()Ljava/util/Random;

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

.method public final ᛷᛵᛵᲈ(I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᲈᲈᛲ;->ᲇᛴᲇᛵ()Ljava/util/Random;

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

.method public abstract ᲇᛴᲇᛵ()Ljava/util/Random;
.end method
