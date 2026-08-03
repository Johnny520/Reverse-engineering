.class public final Lv7/a0;
.super Lr7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final S(II)[B
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    sub-int/2addr v1, p1

    .line 5
    if-lt v1, p2, :cond_2

    .line 6
    .line 7
    if-gtz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-array v1, p2, [B

    .line 11
    .line 12
    if-ltz p2, :cond_1

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v0, p1, v1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-object v1

    .line 19
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public final T(II)I
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    add-int v2, p1, p2

    .line 5
    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 v1, 0x1

    .line 11
    if-ne p2, v1, :cond_1

    .line 12
    .line 13
    aget-byte p1, v0, p1

    .line 14
    .line 15
    and-int/lit16 p1, p1, 0xff

    .line 16
    .line 17
    return p1

    .line 18
    :cond_1
    const/4 v2, 0x2

    .line 19
    if-ne p2, v2, :cond_2

    .line 20
    .line 21
    aget-byte p2, v0, p1

    .line 22
    .line 23
    and-int/lit16 p2, p2, 0xff

    .line 24
    .line 25
    add-int/2addr p1, v1

    .line 26
    aget-byte p1, v0, p1

    .line 27
    .line 28
    and-int/lit16 p1, p1, 0xff

    .line 29
    .line 30
    shl-int/lit8 p1, p1, 0x8

    .line 31
    .line 32
    or-int/2addr p1, p2

    .line 33
    int-to-short p1, p1

    .line 34
    const p2, 0xffff

    .line 35
    .line 36
    .line 37
    and-int/2addr p1, p2

    .line 38
    return p1

    .line 39
    :cond_2
    const/4 v0, 0x4

    .line 40
    if-ne p2, v0, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lr7/c;->O(I)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_3
    const-string p1, "Invalid data size "

    .line 48
    .line 49
    invoke-static {p2, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    return p1
.end method
