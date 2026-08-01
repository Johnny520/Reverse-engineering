.class public abstract Lz60;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:F = 24.0f


# direct methods
.method public static A(BBB[CI)V
    .locals 2

    .line 1
    invoke-static {p1}, Lz60;->H(B)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const/16 v0, -0x20

    .line 8
    .line 9
    const/16 v1, -0x60

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    if-lt p1, v1, :cond_2

    .line 14
    .line 15
    :cond_0
    const/16 v0, -0x13

    .line 16
    .line 17
    if-ne p0, v0, :cond_1

    .line 18
    .line 19
    if-ge p1, v1, :cond_2

    .line 20
    .line 21
    :cond_1
    invoke-static {p2}, Lz60;->H(B)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    and-int/lit8 p0, p0, 0xf

    .line 28
    .line 29
    shl-int/lit8 p0, p0, 0xc

    .line 30
    .line 31
    and-int/lit8 p1, p1, 0x3f

    .line 32
    .line 33
    shl-int/lit8 p1, p1, 0x6

    .line 34
    .line 35
    or-int/2addr p0, p1

    .line 36
    and-int/lit8 p1, p2, 0x3f

    .line 37
    .line 38
    or-int/2addr p0, p1

    .line 39
    int-to-char p0, p0

    .line 40
    aput-char p0, p3, p4

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    const-string p0, "Invalid UTF-8"

    .line 44
    .line 45
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public static B(BB[CI)V
    .locals 1

    .line 1
    const/16 v0, -0x3e

    .line 2
    .line 3
    if-lt p0, v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1}, Lz60;->H(B)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    and-int/lit8 p0, p0, 0x1f

    .line 12
    .line 13
    shl-int/lit8 p0, p0, 0x6

    .line 14
    .line 15
    and-int/lit8 p1, p1, 0x3f

    .line 16
    .line 17
    or-int/2addr p0, p1

    .line 18
    int-to-char p0, p0

    .line 19
    aput-char p0, p2, p3

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Invalid UTF-8: Illegal trailing byte in 2 bytes utf"

    .line 23
    .line 24
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string p0, "Invalid UTF-8: Illegal leading byte in 2 bytes utf"

    .line 29
    .line 30
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static C(I)I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_8

    .line 6
    .line 7
    const/4 v0, 0x4

    .line 8
    if-eq p0, v0, :cond_7

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    if-eq p0, v1, :cond_6

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-eq p0, v2, :cond_5

    .line 17
    .line 18
    const/16 v0, 0x20

    .line 19
    .line 20
    if-eq p0, v0, :cond_4

    .line 21
    .line 22
    const/16 v0, 0x40

    .line 23
    .line 24
    if-eq p0, v0, :cond_3

    .line 25
    .line 26
    const/16 v0, 0x80

    .line 27
    .line 28
    if-eq p0, v0, :cond_2

    .line 29
    .line 30
    const/16 v0, 0x100

    .line 31
    .line 32
    if-eq p0, v0, :cond_1

    .line 33
    .line 34
    const/16 v0, 0x200

    .line 35
    .line 36
    if-ne p0, v0, :cond_0

    .line 37
    .line 38
    const/16 p0, 0x9

    .line 39
    .line 40
    return p0

    .line 41
    :cond_0
    const-string v0, "type needs to be >= FIRST and <= LAST, type="

    .line 42
    .line 43
    invoke-static {v0, p0}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return p0

    .line 52
    :cond_1
    return v1

    .line 53
    :cond_2
    const/4 p0, 0x7

    .line 54
    return p0

    .line 55
    :cond_3
    const/4 p0, 0x6

    .line 56
    return p0

    .line 57
    :cond_4
    const/4 p0, 0x5

    .line 58
    return p0

    .line 59
    :cond_5
    return v0

    .line 60
    :cond_6
    const/4 p0, 0x3

    .line 61
    return p0

    .line 62
    :cond_7
    return v1

    .line 63
    :cond_8
    return v0

    .line 64
    :cond_9
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method public static final D(Lvz0;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lb60;->F()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final E(Lst0;Lst0;Lst0;I)Z
    .locals 2

    .line 1
    invoke-static {p3, p0, p2}, Lz60;->F(ILst0;Lst0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {p3, p1, p2}, Lz60;->F(ILst0;Lst0;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-static {p2, p0, p1, p3}, Lz60;->j(Lst0;Lst0;Lst0;I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-static {p2, p1, p0, p3}, Lz60;->j(Lst0;Lst0;Lst0;I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_3
    invoke-static {p3, p2, p0}, Lz60;->G(ILst0;Lst0;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    invoke-static {p3, p2, p1}, Lz60;->G(ILst0;Lst0;)J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    cmp-long p0, v0, p0

    .line 38
    .line 39
    if-gez p0, :cond_4

    .line 40
    .line 41
    :goto_0
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public static final F(ILst0;Lst0;)Z
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne p0, v0, :cond_2

    .line 5
    .line 6
    iget p0, p2, Lst0;->c:F

    .line 7
    .line 8
    iget p2, p2, Lst0;->a:F

    .line 9
    .line 10
    iget v0, p1, Lst0;->c:F

    .line 11
    .line 12
    cmpl-float p0, p0, v0

    .line 13
    .line 14
    if-gtz p0, :cond_0

    .line 15
    .line 16
    cmpl-float p0, p2, v0

    .line 17
    .line 18
    if-ltz p0, :cond_1

    .line 19
    .line 20
    :cond_0
    iget p0, p1, Lst0;->a:F

    .line 21
    .line 22
    cmpl-float p0, p2, p0

    .line 23
    .line 24
    if-lez p0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    const/4 v0, 0x4

    .line 29
    if-ne p0, v0, :cond_5

    .line 30
    .line 31
    iget p0, p2, Lst0;->a:F

    .line 32
    .line 33
    iget p2, p2, Lst0;->c:F

    .line 34
    .line 35
    iget v0, p1, Lst0;->a:F

    .line 36
    .line 37
    cmpg-float p0, p0, v0

    .line 38
    .line 39
    if-ltz p0, :cond_3

    .line 40
    .line 41
    cmpg-float p0, p2, v0

    .line 42
    .line 43
    if-gtz p0, :cond_4

    .line 44
    .line 45
    :cond_3
    iget p0, p1, Lst0;->c:F

    .line 46
    .line 47
    cmpg-float p0, p2, p0

    .line 48
    .line 49
    if-gez p0, :cond_4

    .line 50
    .line 51
    return v2

    .line 52
    :cond_4
    return v1

    .line 53
    :cond_5
    const/4 v0, 0x5

    .line 54
    if-ne p0, v0, :cond_8

    .line 55
    .line 56
    iget p0, p2, Lst0;->d:F

    .line 57
    .line 58
    iget p2, p2, Lst0;->b:F

    .line 59
    .line 60
    iget v0, p1, Lst0;->d:F

    .line 61
    .line 62
    cmpl-float p0, p0, v0

    .line 63
    .line 64
    if-gtz p0, :cond_6

    .line 65
    .line 66
    cmpl-float p0, p2, v0

    .line 67
    .line 68
    if-ltz p0, :cond_7

    .line 69
    .line 70
    :cond_6
    iget p0, p1, Lst0;->b:F

    .line 71
    .line 72
    cmpl-float p0, p2, p0

    .line 73
    .line 74
    if-lez p0, :cond_7

    .line 75
    .line 76
    return v2

    .line 77
    :cond_7
    return v1

    .line 78
    :cond_8
    const/4 v0, 0x6

    .line 79
    if-ne p0, v0, :cond_b

    .line 80
    .line 81
    iget p0, p2, Lst0;->b:F

    .line 82
    .line 83
    iget p2, p2, Lst0;->d:F

    .line 84
    .line 85
    iget v0, p1, Lst0;->b:F

    .line 86
    .line 87
    cmpg-float p0, p0, v0

    .line 88
    .line 89
    if-ltz p0, :cond_9

    .line 90
    .line 91
    cmpg-float p0, p2, v0

    .line 92
    .line 93
    if-gtz p0, :cond_a

    .line 94
    .line 95
    :cond_9
    iget p0, p1, Lst0;->d:F

    .line 96
    .line 97
    cmpg-float p0, p2, p0

    .line 98
    .line 99
    if-gez p0, :cond_a

    .line 100
    .line 101
    return v2

    .line 102
    :cond_a
    return v1

    .line 103
    :cond_b
    const-string p0, "This function should only be used for 2-D focus search"

    .line 104
    .line 105
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return v1
.end method

.method public static final G(ILst0;Lst0;)J
    .locals 10

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const-string v2, "This function should only be used for 2-D focus search"

    .line 4
    .line 5
    const/4 v3, 0x6

    .line 6
    const/4 v4, 0x5

    .line 7
    const/4 v5, 0x4

    .line 8
    const/4 v6, 0x3

    .line 9
    if-ne p0, v6, :cond_0

    .line 10
    .line 11
    iget v7, p1, Lst0;->a:F

    .line 12
    .line 13
    iget v8, p2, Lst0;->c:F

    .line 14
    .line 15
    :goto_0
    sub-float/2addr v7, v8

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-ne p0, v5, :cond_1

    .line 18
    .line 19
    iget v7, p2, Lst0;->a:F

    .line 20
    .line 21
    iget v8, p1, Lst0;->c:F

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    if-ne p0, v4, :cond_2

    .line 25
    .line 26
    iget v7, p1, Lst0;->b:F

    .line 27
    .line 28
    iget v8, p2, Lst0;->d:F

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    if-ne p0, v3, :cond_8

    .line 32
    .line 33
    iget v7, p2, Lst0;->b:F

    .line 34
    .line 35
    iget v8, p1, Lst0;->d:F

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    const/4 v8, 0x0

    .line 39
    cmpg-float v9, v7, v8

    .line 40
    .line 41
    if-gez v9, :cond_3

    .line 42
    .line 43
    move v7, v8

    .line 44
    :cond_3
    float-to-long v7, v7

    .line 45
    const/high16 v9, 0x40000000    # 2.0f

    .line 46
    .line 47
    if-ne p0, v6, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    if-ne p0, v5, :cond_5

    .line 51
    .line 52
    :goto_2
    iget p0, p1, Lst0;->b:F

    .line 53
    .line 54
    iget p1, p1, Lst0;->d:F

    .line 55
    .line 56
    sub-float/2addr p1, p0

    .line 57
    div-float/2addr p1, v9

    .line 58
    add-float/2addr p1, p0

    .line 59
    iget p0, p2, Lst0;->b:F

    .line 60
    .line 61
    iget p2, p2, Lst0;->d:F

    .line 62
    .line 63
    :goto_3
    sub-float/2addr p2, p0

    .line 64
    div-float/2addr p2, v9

    .line 65
    add-float/2addr p2, p0

    .line 66
    sub-float/2addr p1, p2

    .line 67
    goto :goto_5

    .line 68
    :cond_5
    if-ne p0, v4, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    if-ne p0, v3, :cond_7

    .line 72
    .line 73
    :goto_4
    iget p0, p1, Lst0;->a:F

    .line 74
    .line 75
    iget p1, p1, Lst0;->c:F

    .line 76
    .line 77
    sub-float/2addr p1, p0

    .line 78
    div-float/2addr p1, v9

    .line 79
    add-float/2addr p1, p0

    .line 80
    iget p0, p2, Lst0;->a:F

    .line 81
    .line 82
    iget p2, p2, Lst0;->c:F

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :goto_5
    float-to-long p0, p1

    .line 86
    const-wide/16 v0, 0xd

    .line 87
    .line 88
    mul-long/2addr v0, v7

    .line 89
    mul-long/2addr v0, v7

    .line 90
    mul-long/2addr p0, p0

    .line 91
    add-long/2addr p0, v0

    .line 92
    return-wide p0

    .line 93
    :cond_7
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-wide v0

    .line 97
    :cond_8
    invoke-static {v2}, Lxc;->o(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-wide v0
.end method

.method public static H(B)Z
    .locals 1

    .line 1
    const/16 v0, -0x41

    .line 2
    .line 3
    if-le p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static I(Lhw;)Lu60;
    .locals 2

    .line 1
    sget-object v0, Ln2;->W:Ln2;

    .line 2
    .line 3
    new-instance v1, Lra1;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p0, v1, Lra1;->d:Lhw;

    .line 9
    .line 10
    iput-object v0, v1, Lra1;->e:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v1
.end method

.method public static J(Lhw;)Lx51;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx51;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lx51;-><init>(Lhw;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final K(Lz11;Lq8;I)V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Lz11;->v:I

    .line 2
    .line 3
    if-le p2, v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lz11;->u:I

    .line 6
    .line 7
    if-lt p2, v1, :cond_1

    .line 8
    .line 9
    :cond_0
    if-nez v0, :cond_2

    .line 10
    .line 11
    if-nez p2, :cond_2

    .line 12
    .line 13
    :cond_1
    return-void

    .line 14
    :cond_2
    invoke-virtual {p0}, Lz11;->M()V

    .line 15
    .line 16
    .line 17
    iget v0, p0, Lz11;->v:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lz11;->y(I)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {p1}, Lq8;->j()V

    .line 26
    .line 27
    .line 28
    :cond_3
    invoke-virtual {p0}, Lz11;->j()V

    .line 29
    .line 30
    .line 31
    goto :goto_0
.end method

.method public static L(Ljava/nio/MappedByteBuffer;)Lge0;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit8 v0, v0, 0x4

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v1, 0xffff

    .line 24
    .line 25
    .line 26
    and-int/2addr v0, v1

    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const-string v2, "Cannot read metadata."

    .line 30
    .line 31
    if-gt v0, v1, :cond_5

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/lit8 v1, v1, 0x6

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    move v3, v1

    .line 44
    :goto_0
    const-wide v4, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const-wide/16 v6, -0x1

    .line 50
    .line 51
    if-ge v3, v0, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    add-int/lit8 v9, v9, 0x4

    .line 62
    .line 63
    invoke-virtual {p0, v9}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    int-to-long v9, v9

    .line 71
    and-long/2addr v9, v4

    .line 72
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    add-int/lit8 v11, v11, 0x4

    .line 77
    .line 78
    invoke-virtual {p0, v11}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 79
    .line 80
    .line 81
    const v11, 0x6d657461

    .line 82
    .line 83
    .line 84
    if-ne v11, v8, :cond_0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-wide v9, v6

    .line 91
    :goto_1
    cmp-long v0, v9, v6

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v6, v0

    .line 100
    sub-long v6, v9, v6

    .line 101
    .line 102
    long-to-int v0, v6

    .line 103
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    add-int/2addr v3, v0

    .line 108
    invoke-virtual {p0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/lit8 v0, v0, 0xc

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    int-to-long v6, v0

    .line 125
    and-long/2addr v6, v4

    .line 126
    :goto_2
    int-to-long v11, v1

    .line 127
    cmp-long v0, v11, v6

    .line 128
    .line 129
    if-gez v0, :cond_4

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    int-to-long v11, v3

    .line 140
    and-long/2addr v11, v4

    .line 141
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 142
    .line 143
    .line 144
    const v3, 0x456d6a69

    .line 145
    .line 146
    .line 147
    if-eq v3, v0, :cond_3

    .line 148
    .line 149
    const v3, 0x656d6a69

    .line 150
    .line 151
    .line 152
    if-ne v3, v0, :cond_2

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    :goto_3
    add-long/2addr v11, v9

    .line 159
    long-to-int v0, v11

    .line 160
    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 161
    .line 162
    .line 163
    new-instance v0, Lge0;

    .line 164
    .line 165
    invoke-direct {v0}, Led0;-><init>()V

    .line 166
    .line 167
    .line 168
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 169
    .line 170
    invoke-static {p0, v1}, Lt1;->f(Ljava/nio/ByteBuffer;Ljava/nio/ByteOrder;)I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    add-int/2addr v2, v1

    .line 179
    iput-object p0, v0, Led0;->g:Ljava/lang/Object;

    .line 180
    .line 181
    iput v2, v0, Led0;->d:I

    .line 182
    .line 183
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    sub-int/2addr v2, p0

    .line 188
    iput v2, v0, Led0;->e:I

    .line 189
    .line 190
    iget-object p0, v0, Led0;->g:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    iput p0, v0, Led0;->f:I

    .line 199
    .line 200
    return-object v0

    .line 201
    :cond_4
    new-instance p0, Ljava/io/IOException;

    .line 202
    .line 203
    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw p0

    .line 207
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 208
    .line 209
    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p0
.end method

.method public static final M(Ls71;Lk50;)Ls71;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ls71;

    .line 4
    .line 5
    iget-object v2, v0, Ls71;->a:Lj31;

    .line 6
    .line 7
    sget-object v3, Lk31;->d:Lx61;

    .line 8
    .line 9
    iget-object v3, v2, Lj31;->a:Lx61;

    .line 10
    .line 11
    sget-object v4, Ln2;->V:Ln2;

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_0

    .line 18
    .line 19
    :goto_0
    move-object v5, v3

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    sget-object v3, Lk31;->d:Lx61;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :goto_1
    iget-wide v3, v2, Lj31;->b:J

    .line 25
    .line 26
    sget-object v6, Lu71;->b:[Lv71;

    .line 27
    .line 28
    const-wide v23, 0xff00000000L

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long v6, v3, v23

    .line 34
    .line 35
    const-wide/16 v25, 0x0

    .line 36
    .line 37
    cmp-long v6, v6, v25

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    sget-wide v3, Lk31;->a:J

    .line 42
    .line 43
    :cond_1
    move-wide v6, v3

    .line 44
    iget-object v3, v2, Lj31;->c:Lzv;

    .line 45
    .line 46
    if-nez v3, :cond_2

    .line 47
    .line 48
    sget-object v3, Lzv;->f:Lzv;

    .line 49
    .line 50
    :cond_2
    move-object v8, v3

    .line 51
    iget-object v3, v2, Lj31;->d:Lxv;

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    iget v3, v3, Lxv;->a:I

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const/4 v3, 0x0

    .line 59
    :goto_2
    new-instance v9, Lxv;

    .line 60
    .line 61
    invoke-direct {v9, v3}, Lxv;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iget-object v3, v2, Lj31;->e:Lyv;

    .line 65
    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    iget v3, v3, Lyv;->a:I

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const v3, 0xffff

    .line 72
    .line 73
    .line 74
    :goto_3
    new-instance v10, Lyv;

    .line 75
    .line 76
    invoke-direct {v10, v3}, Lyv;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iget-object v3, v2, Lj31;->f:Lz51;

    .line 80
    .line 81
    if-nez v3, :cond_5

    .line 82
    .line 83
    sget-object v3, Lz51;->a:Lwl;

    .line 84
    .line 85
    :cond_5
    move-object v11, v3

    .line 86
    iget-object v3, v2, Lj31;->g:Ljava/lang/String;

    .line 87
    .line 88
    if-nez v3, :cond_6

    .line 89
    .line 90
    const-string v3, ""

    .line 91
    .line 92
    :cond_6
    move-object v12, v3

    .line 93
    iget-wide v3, v2, Lj31;->h:J

    .line 94
    .line 95
    and-long v13, v3, v23

    .line 96
    .line 97
    cmp-long v13, v13, v25

    .line 98
    .line 99
    if-nez v13, :cond_7

    .line 100
    .line 101
    sget-wide v3, Lk31;->b:J

    .line 102
    .line 103
    :cond_7
    move-wide v13, v3

    .line 104
    iget-object v3, v2, Lj31;->i:Lz9;

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    if-eqz v3, :cond_8

    .line 108
    .line 109
    iget v3, v3, Lz9;->a:F

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    move v3, v4

    .line 113
    :goto_4
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 114
    .line 115
    .line 116
    move-result v15

    .line 117
    if-eqz v15, :cond_9

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    move v4, v3

    .line 121
    :goto_5
    new-instance v15, Lz9;

    .line 122
    .line 123
    invoke-direct {v15, v4}, Lz9;-><init>(F)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v2, Lj31;->j:Ly61;

    .line 127
    .line 128
    if-nez v3, :cond_a

    .line 129
    .line 130
    sget-object v3, Ly61;->c:Ly61;

    .line 131
    .line 132
    :cond_a
    move-object/from16 v16, v3

    .line 133
    .line 134
    iget-object v3, v2, Lj31;->k:Lfb0;

    .line 135
    .line 136
    if-nez v3, :cond_b

    .line 137
    .line 138
    sget-object v3, Lfb0;->f:Lfb0;

    .line 139
    .line 140
    invoke-static {}, Lj50;->n()Lfb0;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    :cond_b
    move-object/from16 v17, v3

    .line 145
    .line 146
    iget-wide v3, v2, Lj31;->l:J

    .line 147
    .line 148
    const-wide/16 v18, 0x10

    .line 149
    .line 150
    cmp-long v18, v3, v18

    .line 151
    .line 152
    if-eqz v18, :cond_c

    .line 153
    .line 154
    :goto_6
    move-wide/from16 v18, v3

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_c
    sget-wide v3, Lk31;->c:J

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :goto_7
    iget-object v3, v2, Lj31;->m:Lu61;

    .line 161
    .line 162
    if-nez v3, :cond_d

    .line 163
    .line 164
    sget-object v3, Lu61;->b:Lu61;

    .line 165
    .line 166
    :cond_d
    move-object/from16 v20, v3

    .line 167
    .line 168
    iget-object v3, v2, Lj31;->n:Lv01;

    .line 169
    .line 170
    if-nez v3, :cond_e

    .line 171
    .line 172
    sget-object v3, Lv01;->d:Lv01;

    .line 173
    .line 174
    :cond_e
    move-object/from16 v21, v3

    .line 175
    .line 176
    iget-object v2, v2, Lj31;->o:Lo30;

    .line 177
    .line 178
    if-nez v2, :cond_f

    .line 179
    .line 180
    sget-object v2, Lqt;->Q:Lqt;

    .line 181
    .line 182
    :cond_f
    move-object/from16 v22, v2

    .line 183
    .line 184
    new-instance v4, Lj31;

    .line 185
    .line 186
    invoke-direct/range {v4 .. v22}, Lj31;-><init>(Lx61;JLzv;Lxv;Lyv;Lz51;Ljava/lang/String;JLz9;Ly61;Lfb0;JLu61;Lv01;Lo30;)V

    .line 187
    .line 188
    .line 189
    iget-object v2, v0, Ls71;->b:Lap0;

    .line 190
    .line 191
    sget v3, Lbp0;->b:I

    .line 192
    .line 193
    new-instance v5, Lap0;

    .line 194
    .line 195
    iget v3, v2, Lap0;->a:I

    .line 196
    .line 197
    const/4 v6, 0x5

    .line 198
    if-nez v3, :cond_10

    .line 199
    .line 200
    move v3, v6

    .line 201
    :cond_10
    iget v7, v2, Lap0;->b:I

    .line 202
    .line 203
    const/4 v8, 0x3

    .line 204
    const/4 v9, 0x0

    .line 205
    const/4 v10, 0x1

    .line 206
    if-ne v7, v8, :cond_13

    .line 207
    .line 208
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-eqz v7, :cond_12

    .line 213
    .line 214
    if-ne v7, v10, :cond_11

    .line 215
    .line 216
    :goto_8
    move v7, v6

    .line 217
    goto :goto_9

    .line 218
    :cond_11
    invoke-static {}, Lxc;->j()V

    .line 219
    .line 220
    .line 221
    return-object v9

    .line 222
    :cond_12
    const/4 v6, 0x4

    .line 223
    goto :goto_8

    .line 224
    :cond_13
    if-nez v7, :cond_16

    .line 225
    .line 226
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_15

    .line 231
    .line 232
    if-ne v6, v10, :cond_14

    .line 233
    .line 234
    const/4 v6, 0x2

    .line 235
    goto :goto_8

    .line 236
    :cond_14
    invoke-static {}, Lxc;->j()V

    .line 237
    .line 238
    .line 239
    return-object v9

    .line 240
    :cond_15
    move v7, v10

    .line 241
    :cond_16
    :goto_9
    iget-wide v8, v2, Lap0;->c:J

    .line 242
    .line 243
    and-long v11, v8, v23

    .line 244
    .line 245
    cmp-long v6, v11, v25

    .line 246
    .line 247
    if-nez v6, :cond_17

    .line 248
    .line 249
    sget-wide v8, Lbp0;->a:J

    .line 250
    .line 251
    :cond_17
    iget-object v6, v2, Lap0;->d:Lz61;

    .line 252
    .line 253
    if-nez v6, :cond_18

    .line 254
    .line 255
    sget-object v6, Lz61;->c:Lz61;

    .line 256
    .line 257
    :cond_18
    iget-object v11, v2, Lap0;->e:Ler0;

    .line 258
    .line 259
    iget-object v12, v2, Lap0;->f:Lla0;

    .line 260
    .line 261
    iget v13, v2, Lap0;->g:I

    .line 262
    .line 263
    if-nez v13, :cond_19

    .line 264
    .line 265
    sget v13, Lga0;->b:I

    .line 266
    .line 267
    :cond_19
    iget v14, v2, Lap0;->h:I

    .line 268
    .line 269
    if-nez v14, :cond_1a

    .line 270
    .line 271
    move v14, v10

    .line 272
    :cond_1a
    iget-object v2, v2, Lap0;->i:Lk71;

    .line 273
    .line 274
    if-nez v2, :cond_1b

    .line 275
    .line 276
    sget-object v2, Lk71;->c:Lk71;

    .line 277
    .line 278
    :cond_1b
    move-object v15, v2

    .line 279
    move-object v10, v6

    .line 280
    move v6, v3

    .line 281
    invoke-direct/range {v5 .. v15}, Lap0;-><init>(IIJLz61;Ler0;Lla0;IILk71;)V

    .line 282
    .line 283
    .line 284
    iget-object v0, v0, Ls71;->c:Lhr0;

    .line 285
    .line 286
    invoke-direct {v1, v4, v5, v0}, Ls71;-><init>(Lj31;Lap0;Lhr0;)V

    .line 287
    .line 288
    .line 289
    return-object v1
.end method

.method public static final N(ILrp;Ldv;Lst0;)Z
    .locals 10

    .line 1
    new-instance v0, Lsh0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v2, v1, [Ldv;

    .line 6
    .line 7
    invoke-direct {v0, v2}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p2, Loe0;->d:Loe0;

    .line 11
    .line 12
    iget-boolean v2, v2, Loe0;->q:Z

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-string v2, "visitChildren called on an unattached node"

    .line 17
    .line 18
    invoke-static {v2}, Lw10;->b(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    new-instance v2, Lsh0;

    .line 22
    .line 23
    new-array v3, v1, [Loe0;

    .line 24
    .line 25
    invoke-direct {v2, v3}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object p2, p2, Loe0;->d:Loe0;

    .line 29
    .line 30
    iget-object v3, p2, Loe0;->i:Loe0;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    invoke-static {v2, p2}, Lpf1;->e(Lsh0;Loe0;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v2, v3}, Lsh0;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    iget p2, v2, Lsh0;->f:I

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    const/4 v4, 0x0

    .line 45
    if-eqz p2, :cond_c

    .line 46
    .line 47
    add-int/lit8 p2, p2, -0x1

    .line 48
    .line 49
    invoke-virtual {v2, p2}, Lsh0;->k(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Loe0;

    .line 54
    .line 55
    iget v5, p2, Loe0;->g:I

    .line 56
    .line 57
    and-int/lit16 v5, v5, 0x400

    .line 58
    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    invoke-static {v2, p2}, Lpf1;->e(Lsh0;Loe0;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_1
    if-eqz p2, :cond_2

    .line 66
    .line 67
    iget v5, p2, Loe0;->f:I

    .line 68
    .line 69
    and-int/lit16 v5, v5, 0x400

    .line 70
    .line 71
    if-eqz v5, :cond_b

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    move-object v6, v5

    .line 75
    :goto_2
    if-eqz p2, :cond_2

    .line 76
    .line 77
    instance-of v7, p2, Ldv;

    .line 78
    .line 79
    if-eqz v7, :cond_4

    .line 80
    .line 81
    check-cast p2, Ldv;

    .line 82
    .line 83
    iget-boolean v7, p2, Loe0;->q:Z

    .line 84
    .line 85
    if-eqz v7, :cond_a

    .line 86
    .line 87
    invoke-virtual {v0, p2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_4
    iget v7, p2, Loe0;->f:I

    .line 92
    .line 93
    and-int/lit16 v7, v7, 0x400

    .line 94
    .line 95
    if-eqz v7, :cond_a

    .line 96
    .line 97
    instance-of v7, p2, Lsm;

    .line 98
    .line 99
    if-eqz v7, :cond_a

    .line 100
    .line 101
    move-object v7, p2

    .line 102
    check-cast v7, Lsm;

    .line 103
    .line 104
    iget-object v7, v7, Lsm;->s:Loe0;

    .line 105
    .line 106
    move v8, v4

    .line 107
    :goto_3
    if-eqz v7, :cond_9

    .line 108
    .line 109
    iget v9, v7, Loe0;->f:I

    .line 110
    .line 111
    and-int/lit16 v9, v9, 0x400

    .line 112
    .line 113
    if-eqz v9, :cond_8

    .line 114
    .line 115
    add-int/lit8 v8, v8, 0x1

    .line 116
    .line 117
    if-ne v8, v3, :cond_5

    .line 118
    .line 119
    move-object p2, v7

    .line 120
    goto :goto_4

    .line 121
    :cond_5
    if-nez v6, :cond_6

    .line 122
    .line 123
    new-instance v6, Lsh0;

    .line 124
    .line 125
    new-array v9, v1, [Loe0;

    .line 126
    .line 127
    invoke-direct {v6, v9}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    if-eqz p2, :cond_7

    .line 131
    .line 132
    invoke-virtual {v6, p2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-object p2, v5

    .line 136
    :cond_7
    invoke-virtual {v6, v7}, Lsh0;->b(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_8
    :goto_4
    iget-object v7, v7, Loe0;->i:Loe0;

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_9
    if-ne v8, v3, :cond_a

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_a
    :goto_5
    invoke-static {v6}, Lpf1;->f(Lsh0;)Loe0;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    goto :goto_2

    .line 150
    :cond_b
    iget-object p2, p2, Loe0;->i:Loe0;

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_c
    :goto_6
    iget p2, v0, Lsh0;->f:I

    .line 154
    .line 155
    if-eqz p2, :cond_10

    .line 156
    .line 157
    invoke-static {v0, p3, p0}, Lz60;->t(Lsh0;Lst0;I)Ldv;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    if-nez p2, :cond_d

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_d
    invoke-virtual {p2}, Ldv;->y0()Lav;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-boolean v1, v1, Lav;->a:Z

    .line 169
    .line 170
    if-eqz v1, :cond_e

    .line 171
    .line 172
    invoke-virtual {p1, p2}, Lrp;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    check-cast p0, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    return p0

    .line 183
    :cond_e
    invoke-static {p0, p1, p2, p3}, Lz60;->v(ILrp;Ldv;Lst0;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_f

    .line 188
    .line 189
    return v3

    .line 190
    :cond_f
    invoke-virtual {v0, p2}, Lsh0;->j(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_10
    :goto_7
    return v4
.end method

.method public static O(J)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "PointerId(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 p0, 0x29

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static final P(ILrp;Ldv;Lst0;)Ljava/lang/Boolean;
    .locals 7

    .line 1
    invoke-virtual {p2}, Ldv;->B0()Lcv;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_d

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x3

    .line 13
    const/4 v3, 0x2

    .line 14
    const/4 v4, 0x1

    .line 15
    if-eq v0, v4, :cond_3

    .line 16
    .line 17
    if-eq v0, v3, :cond_d

    .line 18
    .line 19
    if-ne v0, v2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2}, Ldv;->y0()Lav;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-boolean v0, v0, Lav;->a:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, p2}, Lrp;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ljava/lang/Boolean;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    if-nez p3, :cond_1

    .line 37
    .line 38
    invoke-static {p2, p0, p1}, Lz60;->u(Ldv;ILsw;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_1
    invoke-static {p0, p1, p2, p3}, Lz60;->N(ILrp;Ldv;Lst0;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_2
    invoke-static {}, Lxc;->j()V

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_3
    invoke-static {p2}, Li4;->q(Ldv;)Ldv;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v5, "ActiveParent must have a focusedChild"

    .line 65
    .line 66
    if-eqz v0, :cond_c

    .line 67
    .line 68
    invoke-virtual {v0}, Ldv;->B0()Lcv;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_a

    .line 77
    .line 78
    if-eq v6, v4, :cond_5

    .line 79
    .line 80
    if-eq v6, v3, :cond_a

    .line 81
    .line 82
    if-eq v6, v2, :cond_4

    .line 83
    .line 84
    invoke-static {}, Lxc;->j()V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    :cond_4
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v1

    .line 92
    :cond_5
    invoke-static {p0, p1, v0, p3}, Lz60;->P(ILrp;Ldv;Lst0;)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-static {v2, v3}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-nez v3, :cond_6

    .line 103
    .line 104
    return-object v2

    .line 105
    :cond_6
    if-nez p3, :cond_9

    .line 106
    .line 107
    invoke-virtual {v0}, Ldv;->B0()Lcv;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    sget-object v2, Lcv;->e:Lcv;

    .line 112
    .line 113
    if-ne p3, v2, :cond_8

    .line 114
    .line 115
    invoke-static {v0}, Li4;->n(Ldv;)Ldv;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    if-eqz p3, :cond_7

    .line 120
    .line 121
    invoke-static {p3}, Li4;->o(Ldv;)Lst0;

    .line 122
    .line 123
    .line 124
    move-result-object p3

    .line 125
    goto :goto_0

    .line 126
    :cond_7
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :cond_8
    const-string p0, "Searching for active node in inactive hierarchy"

    .line 131
    .line 132
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_9
    :goto_0
    invoke-static {p0, p1, p2, p3}, Lz60;->v(ILrp;Ldv;Lst0;)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    return-object p0

    .line 145
    :cond_a
    if-nez p3, :cond_b

    .line 146
    .line 147
    invoke-static {v0}, Li4;->o(Ldv;)Lst0;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    :cond_b
    invoke-static {p0, p1, p2, p3}, Lz60;->v(ILrp;Ldv;Lst0;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :cond_c
    invoke-static {v5}, Lxc;->o(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_d
    invoke-static {p2, p0, p1}, Lz60;->u(Ldv;ILsw;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0
.end method

.method public static final Q(Lu7;Lw7;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lu7;->e:Lgp0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p1, Lw7;->e:Lgp0;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lw7;->f:Lb8;

    .line 13
    .line 14
    iget-object v1, p0, Lu7;->f:Lb8;

    .line 15
    .line 16
    invoke-virtual {v0}, Lb8;->b()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Lb8;->a(I)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-virtual {v0, v4, v3}, Lb8;->e(FI)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-wide v0, p0, Lu7;->h:J

    .line 34
    .line 35
    iput-wide v0, p1, Lw7;->h:J

    .line 36
    .line 37
    iget-wide v0, p0, Lu7;->g:J

    .line 38
    .line 39
    iput-wide v0, p1, Lw7;->g:J

    .line 40
    .line 41
    iget-object p0, p0, Lu7;->i:Lgp0;

    .line 42
    .line 43
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    iput-boolean p0, p1, Lw7;->i:Z

    .line 54
    .line 55
    return-void
.end method

.method public static final a(Ljava/lang/Object;ILa80;Lmh;Lji;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v0, p4

    .line 12
    .line 13
    check-cast v0, Lpi;

    .line 14
    .line 15
    const v6, 0x340208e3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v6}, Lpi;->X(I)Lpi;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v6, v5, 0x6

    .line 22
    .line 23
    if-nez v6, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lpi;->h(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    const/4 v6, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v6, 0x2

    .line 34
    :goto_0
    or-int/2addr v6, v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v6, v5

    .line 37
    :goto_1
    and-int/lit8 v7, v5, 0x30

    .line 38
    .line 39
    if-nez v7, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lpi;->d(I)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    if-eqz v7, :cond_2

    .line 46
    .line 47
    const/16 v7, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v7, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v6, v7

    .line 53
    :cond_3
    and-int/lit16 v7, v5, 0x180

    .line 54
    .line 55
    if-nez v7, :cond_5

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Lpi;->h(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_4

    .line 62
    .line 63
    const/16 v7, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v7, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v6, v7

    .line 69
    :cond_5
    and-int/lit16 v7, v5, 0xc00

    .line 70
    .line 71
    if-nez v7, :cond_7

    .line 72
    .line 73
    invoke-virtual {v0, v4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_6

    .line 78
    .line 79
    const/16 v7, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v7, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v6, v7

    .line 85
    :cond_7
    and-int/lit16 v7, v6, 0x493

    .line 86
    .line 87
    const/16 v8, 0x492

    .line 88
    .line 89
    if-eq v7, v8, :cond_8

    .line 90
    .line 91
    const/4 v7, 0x1

    .line 92
    goto :goto_5

    .line 93
    :cond_8
    const/4 v7, 0x0

    .line 94
    :goto_5
    and-int/lit8 v8, v6, 0x1

    .line 95
    .line 96
    invoke-virtual {v0, v8, v7}, Lpi;->O(IZ)Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-eqz v7, :cond_11

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    invoke-virtual {v0, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    or-int/2addr v7, v8

    .line 111
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    sget-object v9, Lii;->a:Lr3;

    .line 116
    .line 117
    if-nez v7, :cond_9

    .line 118
    .line 119
    if-ne v8, v9, :cond_a

    .line 120
    .line 121
    :cond_9
    new-instance v8, Ly70;

    .line 122
    .line 123
    invoke-direct {v8, v1, v3}, Ly70;-><init>(Ljava/lang/Object;La80;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_a
    check-cast v8, Ly70;

    .line 130
    .line 131
    iput v2, v8, Ly70;->c:I

    .line 132
    .line 133
    iget-object v7, v8, Ly70;->g:Lgp0;

    .line 134
    .line 135
    sget-object v10, Lvq0;->a:Lej;

    .line 136
    .line 137
    invoke-virtual {v0, v10}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v11

    .line 141
    check-cast v11, Ly70;

    .line 142
    .line 143
    invoke-static {}, Lu50;->k()Ll21;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    if-eqz v12, :cond_b

    .line 148
    .line 149
    invoke-virtual {v12}, Ll21;->e()Lsw;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    goto :goto_6

    .line 154
    :cond_b
    const/4 v14, 0x0

    .line 155
    :goto_6
    invoke-static {v12}, Lu50;->s(Ll21;)Ll21;

    .line 156
    .line 157
    .line 158
    move-result-object v15

    .line 159
    :try_start_0
    invoke-virtual {v7}, Lgp0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v16

    .line 163
    move-object/from16 v13, v16

    .line 164
    .line 165
    check-cast v13, Ly70;

    .line 166
    .line 167
    if-eq v11, v13, :cond_e

    .line 168
    .line 169
    invoke-virtual {v7, v11}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    iget v7, v8, Ly70;->d:I

    .line 173
    .line 174
    if-lez v7, :cond_e

    .line 175
    .line 176
    iget-object v7, v8, Ly70;->e:Ly70;

    .line 177
    .line 178
    if-eqz v7, :cond_c

    .line 179
    .line 180
    invoke-virtual {v7}, Ly70;->b()V

    .line 181
    .line 182
    .line 183
    goto :goto_7

    .line 184
    :catchall_0
    move-exception v0

    .line 185
    goto :goto_9

    .line 186
    :cond_c
    :goto_7
    if-eqz v11, :cond_d

    .line 187
    .line 188
    invoke-virtual {v11}, Ly70;->a()Ly70;

    .line 189
    .line 190
    .line 191
    goto :goto_8

    .line 192
    :cond_d
    const/4 v11, 0x0

    .line 193
    :goto_8
    iput-object v11, v8, Ly70;->e:Ly70;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 194
    .line 195
    :cond_e
    invoke-static {v12, v15, v14}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    if-nez v7, :cond_f

    .line 207
    .line 208
    if-ne v11, v9, :cond_10

    .line 209
    .line 210
    :cond_f
    new-instance v11, Lo;

    .line 211
    .line 212
    const/4 v7, 0x7

    .line 213
    invoke-direct {v11, v7, v8}, Lo;-><init>(ILjava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, v11}, Lpi;->g0(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_10
    check-cast v11, Lsw;

    .line 220
    .line 221
    invoke-static {v8, v11, v0}, Ls91;->c(Ljava/lang/Object;Lsw;Lji;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v10, v8}, Lej;->a(Ljava/lang/Object;)Lct0;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    shr-int/lit8 v6, v6, 0x6

    .line 229
    .line 230
    and-int/lit8 v6, v6, 0x70

    .line 231
    .line 232
    const/16 v8, 0x8

    .line 233
    .line 234
    or-int/2addr v6, v8

    .line 235
    invoke-static {v7, v4, v0, v6}, Li4;->b(Lct0;Lww;Lji;I)V

    .line 236
    .line 237
    .line 238
    goto :goto_a

    .line 239
    :goto_9
    invoke-static {v12, v15, v14}, Lu50;->z(Ll21;Ll21;Lsw;)V

    .line 240
    .line 241
    .line 242
    throw v0

    .line 243
    :cond_11
    invoke-virtual {v0}, Lpi;->R()V

    .line 244
    .line 245
    .line 246
    :goto_a
    invoke-virtual {v0}, Lpi;->r()Lht0;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    if-eqz v6, :cond_12

    .line 251
    .line 252
    new-instance v0, Lz70;

    .line 253
    .line 254
    invoke-direct/range {v0 .. v5}, Lz70;-><init>(Ljava/lang/Object;ILa80;Lmh;I)V

    .line 255
    .line 256
    .line 257
    iput-object v0, v6, Lht0;->d:Lww;

    .line 258
    .line 259
    :cond_12
    return-void
.end method

.method public static final b(Lpe0;Lww;Lmh;Lww;Lww;IJJLfd1;Lmh;Lji;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v11, p12

    .line 4
    .line 5
    check-cast v11, Lpi;

    .line 6
    .line 7
    const v0, -0x4835c278

    .line 8
    .line 9
    .line 10
    invoke-virtual {v11, v0}, Lpi;->X(I)Lpi;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v11, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v2, 0x2

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v2

    .line 23
    :goto_0
    or-int v0, p13, v0

    .line 24
    .line 25
    const v3, 0x24b6c30

    .line 26
    .line 27
    .line 28
    or-int/2addr v0, v3

    .line 29
    const v3, 0x12492493

    .line 30
    .line 31
    .line 32
    and-int/2addr v3, v0

    .line 33
    const v4, 0x12492492

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-eq v3, v4, :cond_1

    .line 38
    .line 39
    move v3, v5

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 v3, 0x0

    .line 42
    :goto_1
    and-int/2addr v0, v5

    .line 43
    invoke-virtual {v11, v0, v3}, Lpi;->O(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_8

    .line 48
    .line 49
    invoke-virtual {v11}, Lpi;->T()V

    .line 50
    .line 51
    .line 52
    and-int/lit8 v0, p13, 0x1

    .line 53
    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {v11}, Lpi;->y()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    invoke-virtual {v11}, Lpi;->R()V

    .line 64
    .line 65
    .line 66
    move-object/from16 v0, p1

    .line 67
    .line 68
    move-object/from16 v3, p3

    .line 69
    .line 70
    move-object/from16 v4, p4

    .line 71
    .line 72
    move/from16 v2, p5

    .line 73
    .line 74
    move-wide/from16 v5, p6

    .line 75
    .line 76
    move-wide/from16 v7, p8

    .line 77
    .line 78
    move-object/from16 v14, p10

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    :goto_2
    sget-object v0, Lqh;->a:Lmh;

    .line 82
    .line 83
    sget-object v3, Lqh;->b:Lmh;

    .line 84
    .line 85
    sget-object v4, Lqh;->c:Lmh;

    .line 86
    .line 87
    sget-object v5, Lnf;->a:Lg41;

    .line 88
    .line 89
    invoke-virtual {v11, v5}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Llf;

    .line 94
    .line 95
    iget-wide v5, v5, Llf;->n:J

    .line 96
    .line 97
    invoke-static {v5, v6, v11}, Lnf;->b(JLji;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v7

    .line 101
    sget-object v9, Lde1;->v:Ljava/util/WeakHashMap;

    .line 102
    .line 103
    invoke-static {v11}, Ljo0;->o(Lji;)Lde1;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    iget-object v9, v9, Lde1;->g:Lx6;

    .line 108
    .line 109
    invoke-static {v11}, Ljo0;->o(Lji;)Lde1;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    iget-object v10, v10, Lde1;->b:Lx6;

    .line 114
    .line 115
    new-instance v12, Lma1;

    .line 116
    .line 117
    invoke-direct {v12, v9, v10}, Lma1;-><init>(Lfd1;Lfd1;)V

    .line 118
    .line 119
    .line 120
    move-object v14, v12

    .line 121
    :goto_3
    invoke-virtual {v11}, Lpi;->q()V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v11, v14}, Lpi;->f(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    invoke-virtual {v11}, Lpi;->L()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v10

    .line 132
    sget-object v12, Lii;->a:Lr3;

    .line 133
    .line 134
    if-nez v9, :cond_4

    .line 135
    .line 136
    if-ne v10, v12, :cond_5

    .line 137
    .line 138
    :cond_4
    new-instance v10, Luh0;

    .line 139
    .line 140
    invoke-direct {v10, v14}, Luh0;-><init>(Lfd1;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v11, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    check-cast v10, Luh0;

    .line 147
    .line 148
    invoke-virtual {v11, v10}, Lpi;->f(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v9

    .line 152
    invoke-virtual {v11, v14}, Lpi;->f(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    or-int/2addr v9, v13

    .line 157
    invoke-virtual {v11}, Lpi;->L()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v13

    .line 161
    if-nez v9, :cond_6

    .line 162
    .line 163
    if-ne v13, v12, :cond_7

    .line 164
    .line 165
    :cond_6
    new-instance v13, Lc;

    .line 166
    .line 167
    const/16 v9, 0x12

    .line 168
    .line 169
    invoke-direct {v13, v9, v10, v14}, Lc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v11, v13}, Lpi;->g0(Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_7
    check-cast v13, Lsw;

    .line 176
    .line 177
    invoke-static {v1, v13}, Lrd0;->B(Lpe0;Lsw;)Lpe0;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    new-instance v12, Lzx0;

    .line 182
    .line 183
    move-object/from16 p10, p2

    .line 184
    .line 185
    move-object/from16 p6, p11

    .line 186
    .line 187
    move-object/from16 p5, v0

    .line 188
    .line 189
    move/from16 p4, v2

    .line 190
    .line 191
    move-object/from16 p7, v3

    .line 192
    .line 193
    move-object/from16 p8, v4

    .line 194
    .line 195
    move-object/from16 p9, v10

    .line 196
    .line 197
    move-object/from16 p3, v12

    .line 198
    .line 199
    invoke-direct/range {p3 .. p10}, Lzx0;-><init>(ILww;Lmh;Lww;Lww;Luh0;Lmh;)V

    .line 200
    .line 201
    .line 202
    move-object/from16 v2, p3

    .line 203
    .line 204
    move/from16 v17, p4

    .line 205
    .line 206
    move-object/from16 v15, p7

    .line 207
    .line 208
    move-object/from16 v16, p8

    .line 209
    .line 210
    const v3, 0x329906e3

    .line 211
    .line 212
    .line 213
    invoke-static {v3, v2, v11}, Lkl;->w(ILex;Lji;)Lmh;

    .line 214
    .line 215
    .line 216
    move-result-object v10

    .line 217
    const/high16 v12, 0xc00000

    .line 218
    .line 219
    const/16 v13, 0x72

    .line 220
    .line 221
    const/4 v3, 0x0

    .line 222
    move-wide v4, v5

    .line 223
    move-wide v6, v7

    .line 224
    const/4 v8, 0x0

    .line 225
    move-object v2, v9

    .line 226
    const/4 v9, 0x0

    .line 227
    invoke-static/range {v2 .. v13}, Lh51;->a(Lpe0;Lx01;JJFFLmh;Lji;II)V

    .line 228
    .line 229
    .line 230
    move-object v2, v0

    .line 231
    move-wide v9, v6

    .line 232
    move-object v0, v11

    .line 233
    move-object v11, v14

    .line 234
    move/from16 v6, v17

    .line 235
    .line 236
    move-wide v7, v4

    .line 237
    move-object v4, v15

    .line 238
    move-object/from16 v5, v16

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :cond_8
    invoke-virtual {v11}, Lpi;->R()V

    .line 242
    .line 243
    .line 244
    move-object/from16 v2, p1

    .line 245
    .line 246
    move-object/from16 v4, p3

    .line 247
    .line 248
    move-object/from16 v5, p4

    .line 249
    .line 250
    move/from16 v6, p5

    .line 251
    .line 252
    move-wide/from16 v7, p6

    .line 253
    .line 254
    move-wide/from16 v9, p8

    .line 255
    .line 256
    move-object v0, v11

    .line 257
    move-object/from16 v11, p10

    .line 258
    .line 259
    :goto_4
    invoke-virtual {v0}, Lpi;->r()Lht0;

    .line 260
    .line 261
    .line 262
    move-result-object v14

    .line 263
    if-eqz v14, :cond_9

    .line 264
    .line 265
    new-instance v0, Lvx0;

    .line 266
    .line 267
    move-object/from16 v3, p2

    .line 268
    .line 269
    move-object/from16 v12, p11

    .line 270
    .line 271
    move/from16 v13, p13

    .line 272
    .line 273
    invoke-direct/range {v0 .. v13}, Lvx0;-><init>(Lpe0;Lww;Lmh;Lww;Lww;IJJLfd1;Lmh;I)V

    .line 274
    .line 275
    .line 276
    iput-object v0, v14, Lht0;->d:Lww;

    .line 277
    .line 278
    :cond_9
    return-void
.end method

.method public static final c(ILww;Lmh;Lww;Lww;Lfd1;Lmh;Lji;I)V
    .locals 17

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v7, p6

    .line 10
    .line 11
    move-object/from16 v0, p7

    .line 12
    .line 13
    check-cast v0, Lpi;

    .line 14
    .line 15
    const v1, -0x10b4d90d

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lpi;->X(I)Lpi;

    .line 19
    .line 20
    .line 21
    move/from16 v13, p0

    .line 22
    .line 23
    invoke-virtual {v0, v13}, Lpi;->d(I)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v8, 0x4

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    move v1, v8

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v1, 0x2

    .line 33
    :goto_0
    or-int v1, p8, v1

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Lpi;->h(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    const/16 v10, 0x20

    .line 40
    .line 41
    if-eqz v9, :cond_1

    .line 42
    .line 43
    move v9, v10

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/16 v9, 0x10

    .line 46
    .line 47
    :goto_1
    or-int/2addr v1, v9

    .line 48
    invoke-virtual {v0, v3}, Lpi;->h(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    const/16 v9, 0x100

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v9, 0x80

    .line 58
    .line 59
    :goto_2
    or-int/2addr v1, v9

    .line 60
    invoke-virtual {v0, v4}, Lpi;->h(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    const/16 v12, 0x800

    .line 65
    .line 66
    if-eqz v9, :cond_3

    .line 67
    .line 68
    move v9, v12

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    const/16 v9, 0x400

    .line 71
    .line 72
    :goto_3
    or-int/2addr v1, v9

    .line 73
    invoke-virtual {v0, v5}, Lpi;->h(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_4

    .line 78
    .line 79
    const/16 v9, 0x4000

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_4
    const/16 v9, 0x2000

    .line 83
    .line 84
    :goto_4
    or-int/2addr v1, v9

    .line 85
    move-object/from16 v9, p5

    .line 86
    .line 87
    invoke-virtual {v0, v9}, Lpi;->f(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    if-eqz v15, :cond_5

    .line 92
    .line 93
    const/high16 v15, 0x20000

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_5
    const/high16 v15, 0x10000

    .line 97
    .line 98
    :goto_5
    or-int/2addr v1, v15

    .line 99
    invoke-virtual {v0, v7}, Lpi;->h(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v15

    .line 103
    if-eqz v15, :cond_6

    .line 104
    .line 105
    const/high16 v15, 0x100000

    .line 106
    .line 107
    goto :goto_6

    .line 108
    :cond_6
    const/high16 v15, 0x80000

    .line 109
    .line 110
    :goto_6
    or-int/2addr v1, v15

    .line 111
    const v15, 0x92493

    .line 112
    .line 113
    .line 114
    and-int/2addr v15, v1

    .line 115
    const v11, 0x92492

    .line 116
    .line 117
    .line 118
    const/4 v6, 0x1

    .line 119
    if-eq v15, v11, :cond_7

    .line 120
    .line 121
    move v11, v6

    .line 122
    goto :goto_7

    .line 123
    :cond_7
    const/4 v11, 0x0

    .line 124
    :goto_7
    and-int/lit8 v15, v1, 0x1

    .line 125
    .line 126
    invoke-virtual {v0, v15, v11}, Lpi;->O(IZ)Z

    .line 127
    .line 128
    .line 129
    move-result v11

    .line 130
    if-eqz v11, :cond_1c

    .line 131
    .line 132
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v11

    .line 136
    sget-object v15, Lii;->a:Lr3;

    .line 137
    .line 138
    if-ne v11, v15, :cond_8

    .line 139
    .line 140
    new-instance v11, Lay0;

    .line 141
    .line 142
    invoke-direct {v11}, Lay0;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v11}, Lpi;->g0(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_8
    check-cast v11, Lay0;

    .line 149
    .line 150
    and-int/lit8 v14, v1, 0x70

    .line 151
    .line 152
    if-ne v14, v10, :cond_9

    .line 153
    .line 154
    move v10, v6

    .line 155
    goto :goto_8

    .line 156
    :cond_9
    const/4 v10, 0x0

    .line 157
    :goto_8
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v14

    .line 161
    if-nez v10, :cond_a

    .line 162
    .line 163
    if-ne v14, v15, :cond_b

    .line 164
    .line 165
    :cond_a
    new-instance v10, Lh2;

    .line 166
    .line 167
    invoke-direct {v10, v8, v2}, Lh2;-><init>(ILww;)V

    .line 168
    .line 169
    .line 170
    new-instance v14, Lmh;

    .line 171
    .line 172
    const v8, 0x24128b30

    .line 173
    .line 174
    .line 175
    invoke-direct {v14, v8, v6, v10}, Lmh;-><init>(IZLex;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v14}, Lpi;->g0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    move-object v10, v14

    .line 182
    check-cast v10, Lww;

    .line 183
    .line 184
    and-int/lit16 v8, v1, 0x1c00

    .line 185
    .line 186
    if-ne v8, v12, :cond_c

    .line 187
    .line 188
    move v8, v6

    .line 189
    goto :goto_9

    .line 190
    :cond_c
    const/4 v8, 0x0

    .line 191
    :goto_9
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    const/4 v14, 0x3

    .line 196
    if-nez v8, :cond_d

    .line 197
    .line 198
    if-ne v12, v15, :cond_e

    .line 199
    .line 200
    :cond_d
    new-instance v8, Lh2;

    .line 201
    .line 202
    invoke-direct {v8, v14, v4}, Lh2;-><init>(ILww;)V

    .line 203
    .line 204
    .line 205
    new-instance v12, Lmh;

    .line 206
    .line 207
    const v14, 0x18f7e4f7

    .line 208
    .line 209
    .line 210
    invoke-direct {v12, v14, v6, v8}, Lmh;-><init>(IZLex;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v12}, Lpi;->g0(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_e
    check-cast v12, Lww;

    .line 217
    .line 218
    const v8, 0xe000

    .line 219
    .line 220
    .line 221
    and-int/2addr v8, v1

    .line 222
    const/16 v14, 0x4000

    .line 223
    .line 224
    if-ne v8, v14, :cond_f

    .line 225
    .line 226
    move v8, v6

    .line 227
    goto :goto_a

    .line 228
    :cond_f
    const/4 v8, 0x0

    .line 229
    :goto_a
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    if-nez v8, :cond_10

    .line 234
    .line 235
    if-ne v14, v15, :cond_11

    .line 236
    .line 237
    :cond_10
    new-instance v8, Lh2;

    .line 238
    .line 239
    const/4 v14, 0x2

    .line 240
    invoke-direct {v8, v14, v5}, Lh2;-><init>(ILww;)V

    .line 241
    .line 242
    .line 243
    new-instance v14, Lmh;

    .line 244
    .line 245
    const v2, 0x142ea147

    .line 246
    .line 247
    .line 248
    invoke-direct {v14, v2, v6, v8}, Lmh;-><init>(IZLex;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v14}, Lpi;->g0(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_11
    check-cast v14, Lww;

    .line 255
    .line 256
    and-int/lit16 v2, v1, 0x380

    .line 257
    .line 258
    const/16 v8, 0x100

    .line 259
    .line 260
    if-ne v2, v8, :cond_12

    .line 261
    .line 262
    move v2, v6

    .line 263
    goto :goto_b

    .line 264
    :cond_12
    const/4 v2, 0x0

    .line 265
    :goto_b
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    if-nez v2, :cond_14

    .line 270
    .line 271
    if-ne v8, v15, :cond_13

    .line 272
    .line 273
    goto :goto_c

    .line 274
    :cond_13
    move/from16 p7, v1

    .line 275
    .line 276
    goto :goto_d

    .line 277
    :cond_14
    :goto_c
    new-instance v2, Ljc;

    .line 278
    .line 279
    const/4 v8, 0x3

    .line 280
    invoke-direct {v2, v8, v3, v11}, Ljc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    new-instance v8, Lmh;

    .line 284
    .line 285
    move/from16 p7, v1

    .line 286
    .line 287
    const v1, -0x69e1890d

    .line 288
    .line 289
    .line 290
    invoke-direct {v8, v1, v6, v2}, Lmh;-><init>(IZLex;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :goto_d
    check-cast v8, Lww;

    .line 297
    .line 298
    const/high16 v1, 0x380000

    .line 299
    .line 300
    and-int v1, p7, v1

    .line 301
    .line 302
    const/high16 v2, 0x100000

    .line 303
    .line 304
    if-ne v1, v2, :cond_15

    .line 305
    .line 306
    move v1, v6

    .line 307
    goto :goto_e

    .line 308
    :cond_15
    const/4 v1, 0x0

    .line 309
    :goto_e
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    if-nez v1, :cond_16

    .line 314
    .line 315
    if-ne v2, v15, :cond_17

    .line 316
    .line 317
    :cond_16
    new-instance v1, Lid;

    .line 318
    .line 319
    invoke-direct {v1, v7, v6}, Lid;-><init>(Lmh;I)V

    .line 320
    .line 321
    .line 322
    new-instance v2, Lmh;

    .line 323
    .line 324
    const v3, -0x67371298

    .line 325
    .line 326
    .line 327
    invoke-direct {v2, v3, v6, v1}, Lmh;-><init>(IZLex;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v0, v2}, Lpi;->g0(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_17
    check-cast v2, Lww;

    .line 334
    .line 335
    const/high16 v1, 0x70000

    .line 336
    .line 337
    and-int v1, p7, v1

    .line 338
    .line 339
    const/high16 v3, 0x20000

    .line 340
    .line 341
    if-ne v1, v3, :cond_18

    .line 342
    .line 343
    move v1, v6

    .line 344
    goto :goto_f

    .line 345
    :cond_18
    const/4 v1, 0x0

    .line 346
    :goto_f
    invoke-virtual {v0, v10}, Lpi;->f(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    or-int/2addr v1, v3

    .line 351
    invoke-virtual {v0, v12}, Lpi;->f(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    or-int/2addr v1, v3

    .line 356
    invoke-virtual {v0, v14}, Lpi;->f(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    or-int/2addr v1, v3

    .line 361
    and-int/lit8 v3, p7, 0xe

    .line 362
    .line 363
    const/4 v6, 0x4

    .line 364
    if-ne v3, v6, :cond_19

    .line 365
    .line 366
    const/4 v6, 0x1

    .line 367
    goto :goto_10

    .line 368
    :cond_19
    const/4 v6, 0x0

    .line 369
    :goto_10
    or-int/2addr v1, v6

    .line 370
    invoke-virtual {v0, v2}, Lpi;->f(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    or-int/2addr v1, v3

    .line 375
    invoke-virtual {v0, v8}, Lpi;->f(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v3

    .line 379
    or-int/2addr v1, v3

    .line 380
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    if-nez v1, :cond_1a

    .line 385
    .line 386
    if-ne v3, v15, :cond_1b

    .line 387
    .line 388
    :cond_1a
    move-object/from16 v16, v8

    .line 389
    .line 390
    new-instance v8, Lwx0;

    .line 391
    .line 392
    move-object v15, v11

    .line 393
    move-object v11, v12

    .line 394
    move-object v12, v14

    .line 395
    move-object v14, v2

    .line 396
    invoke-direct/range {v8 .. v16}, Lwx0;-><init>(Lfd1;Lww;Lww;Lww;ILww;Lay0;Lww;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v8}, Lpi;->g0(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    move-object v3, v8

    .line 403
    :cond_1b
    check-cast v3, Lww;

    .line 404
    .line 405
    const/4 v1, 0x0

    .line 406
    const/4 v2, 0x0

    .line 407
    invoke-static {v1, v3, v0, v2}, Li4;->f(Lpe0;Lww;Lji;I)V

    .line 408
    .line 409
    .line 410
    goto :goto_11

    .line 411
    :cond_1c
    invoke-virtual {v0}, Lpi;->R()V

    .line 412
    .line 413
    .line 414
    :goto_11
    invoke-virtual {v0}, Lpi;->r()Lht0;

    .line 415
    .line 416
    .line 417
    move-result-object v9

    .line 418
    if-eqz v9, :cond_1d

    .line 419
    .line 420
    new-instance v0, Lxx0;

    .line 421
    .line 422
    move/from16 v1, p0

    .line 423
    .line 424
    move-object/from16 v2, p1

    .line 425
    .line 426
    move-object/from16 v3, p2

    .line 427
    .line 428
    move-object/from16 v6, p5

    .line 429
    .line 430
    move/from16 v8, p8

    .line 431
    .line 432
    invoke-direct/range {v0 .. v8}, Lxx0;-><init>(ILww;Lmh;Lww;Lww;Lfd1;Lmh;I)V

    .line 433
    .line 434
    .line 435
    iput-object v0, v9, Lht0;->d:Lww;

    .line 436
    .line 437
    :cond_1d
    return-void
.end method

.method public static d(Lz11;Ljava/util/List;Lyi;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    if-ge v1, v0, :cond_3

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lu2;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Lz11;->c(Lu2;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p0, v2}, Lz11;->r(I)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    iget-object v4, p0, Lz11;->b:[I

    .line 29
    .line 30
    invoke-virtual {p0, v4, v3}, Lz11;->N([II)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget-object v4, p0, Lz11;->b:[I

    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Lz11;->r(I)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p0, v4, v2}, Lz11;->g([II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ge v3, v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {p0, v3}, Lz11;->h(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    iget-object v3, p0, Lz11;->c:[Ljava/lang/Object;

    .line 53
    .line 54
    aget-object v2, v3, v2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    sget-object v2, Lii;->a:Lr3;

    .line 58
    .line 59
    :goto_1
    instance-of v3, v2, Lht0;

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    check-cast v2, Lht0;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    const/4 v2, 0x0

    .line 67
    :goto_2
    if-eqz v2, :cond_2

    .line 68
    .line 69
    iput-object p2, v2, Lht0;->a:Lyi;

    .line 70
    .line 71
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    return-void
.end method

.method public static final e(Lw7;Lq7;JLsw;Ljk;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v1, v0, Ll51;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    check-cast v1, Ll51;

    .line 11
    .line 12
    iget v2, v1, Ll51;->l:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v2, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v4

    .line 21
    iput v2, v1, Ll51;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v1, Ll51;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljk;-><init>(Lik;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v8, Ll51;->k:Ljava/lang/Object;

    .line 32
    .line 33
    iget v1, v8, Ll51;->l:I

    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x2

    .line 37
    const/4 v11, 0x1

    .line 38
    sget-object v12, Lzk;->d:Lzk;

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    if-eq v1, v11, :cond_1

    .line 43
    .line 44
    if-ne v1, v10, :cond_2

    .line 45
    .line 46
    :cond_1
    iget-object v1, v8, Ll51;->j:Lzt0;

    .line 47
    .line 48
    iget-object v2, v8, Ll51;->i:Lsw;

    .line 49
    .line 50
    iget-object v3, v8, Ll51;->h:Lq7;

    .line 51
    .line 52
    iget-object v4, v8, Ll51;->g:Lw7;

    .line 53
    .line 54
    :try_start_0
    invoke-static {v0}, Lw60;->M(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :catch_0
    move-exception v0

    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    return-object v0

    .line 69
    :cond_3
    invoke-static {v0}, Lw60;->M(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-wide/16 v0, 0x0

    .line 73
    .line 74
    invoke-interface {v3, v0, v1}, Lq7;->b(J)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    invoke-interface {v3, v0, v1}, Lq7;->f(J)Lb8;

    .line 79
    .line 80
    .line 81
    move-result-object v16

    .line 82
    new-instance v1, Lzt0;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    const-wide/high16 v4, -0x8000000000000000L

    .line 88
    .line 89
    cmp-long v0, p2, v4

    .line 90
    .line 91
    if-nez v0, :cond_5

    .line 92
    .line 93
    :try_start_1
    invoke-interface {v8}, Lik;->e()Lpk;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0}, Lz60;->x(Lpk;)F

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    new-instance v0, Li51;
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_3

    .line 102
    .line 103
    move-object/from16 v5, p0

    .line 104
    .line 105
    move-object/from16 v7, p4

    .line 106
    .line 107
    move-object v2, v14

    .line 108
    move-object/from16 v4, v16

    .line 109
    .line 110
    :try_start_2
    invoke-direct/range {v0 .. v7}, Li51;-><init>(Lzt0;Ljava/lang/Object;Lq7;Lb8;Lw7;FLsw;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_2

    .line 111
    .line 112
    .line 113
    move-object v7, v1

    .line 114
    :try_start_3
    iput-object v5, v8, Ll51;->g:Lw7;

    .line 115
    .line 116
    iput-object v3, v8, Ll51;->h:Lq7;

    .line 117
    .line 118
    move-object/from16 v6, p4

    .line 119
    .line 120
    iput-object v6, v8, Ll51;->i:Lsw;

    .line 121
    .line 122
    iput-object v7, v8, Ll51;->j:Lzt0;

    .line 123
    .line 124
    iput v11, v8, Ll51;->l:I

    .line 125
    .line 126
    invoke-static {v3, v0, v8}, Lz60;->l(Lq7;Lsw;Ll51;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    .line 130
    if-ne v0, v12, :cond_4

    .line 131
    .line 132
    goto/16 :goto_6

    .line 133
    .line 134
    :cond_4
    move-object v4, v5

    .line 135
    move-object v2, v6

    .line 136
    goto :goto_4

    .line 137
    :catch_1
    move-exception v0

    .line 138
    move-object v4, v5

    .line 139
    :goto_2
    move-object v1, v7

    .line 140
    goto/16 :goto_7

    .line 141
    .line 142
    :catch_2
    move-exception v0

    .line 143
    :goto_3
    move-object v7, v1

    .line 144
    move-object v4, v5

    .line 145
    goto/16 :goto_7

    .line 146
    .line 147
    :catch_3
    move-exception v0

    .line 148
    move-object/from16 v5, p0

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    move-object/from16 v5, p0

    .line 152
    .line 153
    move-object/from16 v6, p4

    .line 154
    .line 155
    move-object v7, v1

    .line 156
    :try_start_4
    new-instance v13, Lu7;

    .line 157
    .line 158
    invoke-interface {v3}, Lq7;->d()Lq91;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    invoke-interface {v3}, Lq7;->e()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v19

    .line 166
    new-instance v0, Lj51;

    .line 167
    .line 168
    invoke-direct {v0, v5, v9}, Lj51;-><init>(Lw7;I)V

    .line 169
    .line 170
    .line 171
    move-wide/from16 v20, p2

    .line 172
    .line 173
    move-wide/from16 v17, p2

    .line 174
    .line 175
    move-object/from16 v22, v0

    .line 176
    .line 177
    invoke-direct/range {v13 .. v22}, Lu7;-><init>(Ljava/lang/Object;Lq91;Lb8;JLjava/lang/Object;JLhw;)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v8}, Lik;->e()Lpk;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, Lz60;->x(Lpk;)F

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    move-wide/from16 v1, p2

    .line 189
    .line 190
    move-object v4, v3

    .line 191
    move v3, v0

    .line 192
    move-object v0, v13

    .line 193
    invoke-static/range {v0 .. v6}, Lz60;->r(Lu7;JFLq7;Lw7;Lsw;)V

    .line 194
    .line 195
    .line 196
    move-object v13, v0

    .line 197
    iput-object v13, v7, Lzt0;->d:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_5

    .line 198
    .line 199
    move-object/from16 v4, p0

    .line 200
    .line 201
    move-object/from16 v3, p1

    .line 202
    .line 203
    move-object/from16 v2, p4

    .line 204
    .line 205
    :goto_4
    move-object v1, v7

    .line 206
    :cond_6
    :goto_5
    :try_start_5
    iget-object v0, v1, Lzt0;->d:Ljava/lang/Object;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    check-cast v0, Lu7;

    .line 212
    .line 213
    iget-object v0, v0, Lu7;->i:Lgp0;

    .line 214
    .line 215
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_7

    .line 226
    .line 227
    invoke-interface {v8}, Lik;->e()Lpk;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, Lz60;->x(Lpk;)F

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    new-instance v5, Lk51;
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_0

    .line 236
    .line 237
    move/from16 p2, v0

    .line 238
    .line 239
    move-object/from16 p1, v1

    .line 240
    .line 241
    move-object/from16 p5, v2

    .line 242
    .line 243
    move-object/from16 p3, v3

    .line 244
    .line 245
    move-object/from16 p4, v4

    .line 246
    .line 247
    move-object/from16 p0, v5

    .line 248
    .line 249
    :try_start_6
    invoke-direct/range {p0 .. p5}, Lk51;-><init>(Lzt0;FLq7;Lw7;Lsw;)V
    :try_end_6
    .catch Ljava/util/concurrent/CancellationException; {:try_start_6 .. :try_end_6} :catch_4

    .line 250
    .line 251
    .line 252
    move-object/from16 v0, p0

    .line 253
    .line 254
    move-object/from16 v1, p1

    .line 255
    .line 256
    move-object/from16 v3, p3

    .line 257
    .line 258
    move-object/from16 v4, p4

    .line 259
    .line 260
    move-object/from16 v2, p5

    .line 261
    .line 262
    :try_start_7
    iput-object v4, v8, Ll51;->g:Lw7;

    .line 263
    .line 264
    iput-object v3, v8, Ll51;->h:Lq7;

    .line 265
    .line 266
    iput-object v2, v8, Ll51;->i:Lsw;

    .line 267
    .line 268
    iput-object v1, v8, Ll51;->j:Lzt0;

    .line 269
    .line 270
    iput v10, v8, Ll51;->l:I

    .line 271
    .line 272
    invoke-static {v3, v0, v8}, Lz60;->l(Lq7;Lsw;Ll51;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0
    :try_end_7
    .catch Ljava/util/concurrent/CancellationException; {:try_start_7 .. :try_end_7} :catch_0

    .line 276
    if-ne v0, v12, :cond_6

    .line 277
    .line 278
    :goto_6
    return-object v12

    .line 279
    :catch_4
    move-exception v0

    .line 280
    move-object/from16 v1, p1

    .line 281
    .line 282
    move-object/from16 v4, p4

    .line 283
    .line 284
    goto :goto_7

    .line 285
    :cond_7
    sget-object v0, Lna1;->a:Lna1;

    .line 286
    .line 287
    return-object v0

    .line 288
    :catch_5
    move-exception v0

    .line 289
    move-object/from16 v4, p0

    .line 290
    .line 291
    goto/16 :goto_2

    .line 292
    .line 293
    :goto_7
    iget-object v2, v1, Lzt0;->d:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v2, Lu7;

    .line 296
    .line 297
    if-eqz v2, :cond_8

    .line 298
    .line 299
    iget-object v2, v2, Lu7;->i:Lgp0;

    .line 300
    .line 301
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 302
    .line 303
    invoke-virtual {v2, v3}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    :cond_8
    iget-object v1, v1, Lzt0;->d:Ljava/lang/Object;

    .line 307
    .line 308
    check-cast v1, Lu7;

    .line 309
    .line 310
    if-eqz v1, :cond_9

    .line 311
    .line 312
    iget-wide v1, v1, Lu7;->g:J

    .line 313
    .line 314
    iget-wide v5, v4, Lw7;->g:J

    .line 315
    .line 316
    cmp-long v1, v1, v5

    .line 317
    .line 318
    if-nez v1, :cond_9

    .line 319
    .line 320
    iput-boolean v9, v4, Lw7;->i:Z

    .line 321
    .line 322
    :cond_9
    throw v0
.end method

.method public static f(FLv7;Lww;Lm51;I)Ljava/lang/Object;
    .locals 14

    .line 1
    and-int/lit8 v0, p4, 0x8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x7

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {v1, v1, v0, p1}, Ls91;->O(FFLjava/lang/Object;I)Lo31;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :cond_0
    move-object v3, p1

    .line 13
    sget-object v4, Lkl;->x:Lq91;

    .line 14
    .line 15
    new-instance v5, Ljava/lang/Float;

    .line 16
    .line 17
    invoke-direct {v5, v1}, Ljava/lang/Float;-><init>(F)V

    .line 18
    .line 19
    .line 20
    new-instance v6, Ljava/lang/Float;

    .line 21
    .line 22
    invoke-direct {v6, p0}, Ljava/lang/Float;-><init>(F)V

    .line 23
    .line 24
    .line 25
    new-instance p0, Ljava/lang/Float;

    .line 26
    .line 27
    invoke-direct {p0, v1}, Ljava/lang/Float;-><init>(F)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v4, Lq91;->a:Lsw;

    .line 31
    .line 32
    invoke-interface {p1, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Lb8;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v5}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lb8;

    .line 45
    .line 46
    invoke-virtual {p0}, Lb8;->c()Lb8;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    :cond_1
    move-object v7, p0

    .line 51
    new-instance v2, Ln61;

    .line 52
    .line 53
    invoke-direct/range {v2 .. v7}, Ln61;-><init>(Lv7;Lq91;Ljava/lang/Object;Ljava/lang/Object;Lb8;)V

    .line 54
    .line 55
    .line 56
    new-instance v8, Lw7;

    .line 57
    .line 58
    const/16 p0, 0x38

    .line 59
    .line 60
    invoke-direct {v8, v4, v5, v7, p0}, Lw7;-><init>(Lq91;Ljava/lang/Object;Lb8;I)V

    .line 61
    .line 62
    .line 63
    new-instance v12, Lo;

    .line 64
    .line 65
    const/16 p0, 0x17

    .line 66
    .line 67
    move-object/from16 p1, p2

    .line 68
    .line 69
    invoke-direct {v12, p0, p1}, Lo;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-wide/high16 v10, -0x8000000000000000L

    .line 73
    .line 74
    move-object/from16 v13, p3

    .line 75
    .line 76
    move-object v9, v2

    .line 77
    invoke-static/range {v8 .. v13}, Lz60;->e(Lw7;Lq7;JLsw;Ljk;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    sget-object p1, Lna1;->a:Lna1;

    .line 82
    .line 83
    sget-object v0, Lzk;->d:Lzk;

    .line 84
    .line 85
    if-ne p0, v0, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move-object p0, p1

    .line 89
    :goto_0
    if-ne p0, v0, :cond_3

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_3
    return-object p1
.end method

.method public static final g(Lw7;Lml;ZLsw;Ljk;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lw7;->e:Lgp0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lw7;->f:Lb8;

    .line 8
    .line 9
    iget-object v2, p0, Lw7;->d:Lq91;

    .line 10
    .line 11
    new-instance v4, Lll;

    .line 12
    .line 13
    invoke-direct {v4, p1, v2, v0, v1}, Lll;-><init>(Lml;Lq91;Ljava/lang/Object;Lb8;)V

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    iget-wide p1, p0, Lw7;->g:J

    .line 19
    .line 20
    :goto_0
    move-object v3, p0

    .line 21
    move-wide v5, p1

    .line 22
    move-object v7, p3

    .line 23
    move-object v8, p4

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const-wide/high16 p1, -0x8000000000000000L

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-static/range {v3 .. v8}, Lz60;->e(Lw7;Lq7;JLsw;Ljk;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p1, Lzk;->d:Lzk;

    .line 33
    .line 34
    if-ne p0, p1, :cond_1

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    sget-object p0, Lna1;->a:Lna1;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final h(Lw7;Ljava/lang/Float;Lv7;ZLsw;Ljk;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lw7;->e:Lgp0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v4

    .line 7
    iget-object v3, p0, Lw7;->d:Lq91;

    .line 8
    .line 9
    iget-object v6, p0, Lw7;->f:Lb8;

    .line 10
    .line 11
    new-instance v1, Ln61;

    .line 12
    .line 13
    move-object v5, p1

    .line 14
    move-object v2, p2

    .line 15
    invoke-direct/range {v1 .. v6}, Ln61;-><init>(Lv7;Lq91;Ljava/lang/Object;Ljava/lang/Object;Lb8;)V

    .line 16
    .line 17
    .line 18
    move-object p1, v1

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    iget-wide p2, p0, Lw7;->g:J

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-wide/high16 p2, -0x8000000000000000L

    .line 25
    .line 26
    :goto_0
    invoke-static/range {p0 .. p5}, Lz60;->e(Lw7;Lq7;JLsw;Ljk;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, Lzk;->d:Lzk;

    .line 31
    .line 32
    if-ne p0, p1, :cond_1

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    sget-object p0, Lna1;->a:Lna1;

    .line 36
    .line 37
    return-object p0
.end method

.method public static i([F)F
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x0

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    return v2

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    aget v0, p0, v0

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    aget v1, p0, v1

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    aget v3, p0, v3

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    aget v4, p0, v4

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    aget v5, p0, v5

    .line 21
    .line 22
    const/4 v6, 0x5

    .line 23
    aget p0, p0, v6

    .line 24
    .line 25
    mul-float v6, v0, v4

    .line 26
    .line 27
    mul-float v7, v1, v5

    .line 28
    .line 29
    add-float/2addr v7, v6

    .line 30
    mul-float v6, v3, p0

    .line 31
    .line 32
    add-float/2addr v6, v7

    .line 33
    mul-float/2addr v4, v5

    .line 34
    sub-float/2addr v6, v4

    .line 35
    mul-float/2addr v1, v3

    .line 36
    sub-float/2addr v6, v1

    .line 37
    mul-float/2addr v0, p0

    .line 38
    sub-float/2addr v6, v0

    .line 39
    const/high16 p0, 0x3f000000    # 0.5f

    .line 40
    .line 41
    mul-float/2addr v6, p0

    .line 42
    cmpg-float p0, v6, v2

    .line 43
    .line 44
    if-gez p0, :cond_1

    .line 45
    .line 46
    neg-float p0, v6

    .line 47
    return p0

    .line 48
    :cond_1
    return v6
.end method

.method public static final j(Lst0;Lst0;Lst0;I)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    invoke-static {v3, v2, v0}, Lz60;->k(ILst0;Lst0;)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget v5, v2, Lst0;->b:F

    .line 14
    .line 15
    iget v6, v2, Lst0;->d:F

    .line 16
    .line 17
    iget v7, v2, Lst0;->a:F

    .line 18
    .line 19
    iget v2, v2, Lst0;->c:F

    .line 20
    .line 21
    iget v8, v0, Lst0;->d:F

    .line 22
    .line 23
    iget v9, v0, Lst0;->b:F

    .line 24
    .line 25
    iget v10, v0, Lst0;->c:F

    .line 26
    .line 27
    iget v11, v0, Lst0;->a:F

    .line 28
    .line 29
    const/4 v12, 0x0

    .line 30
    if-nez v4, :cond_13

    .line 31
    .line 32
    invoke-static {v3, v1, v0}, Lz60;->k(ILst0;Lst0;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_0
    const-string v4, "This function should only be used for 2-D focus search"

    .line 41
    .line 42
    const/4 v13, 0x6

    .line 43
    const/4 v14, 0x5

    .line 44
    const/4 v15, 0x4

    .line 45
    const/16 p0, 0x1

    .line 46
    .line 47
    const/4 v0, 0x3

    .line 48
    if-ne v3, v0, :cond_1

    .line 49
    .line 50
    cmpl-float v16, v11, v2

    .line 51
    .line 52
    if-ltz v16, :cond_11

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    if-ne v3, v15, :cond_2

    .line 56
    .line 57
    cmpg-float v16, v10, v7

    .line 58
    .line 59
    if-gtz v16, :cond_11

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    if-ne v3, v14, :cond_3

    .line 63
    .line 64
    cmpl-float v16, v9, v6

    .line 65
    .line 66
    if-ltz v16, :cond_11

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    if-ne v3, v13, :cond_12

    .line 70
    .line 71
    cmpg-float v16, v8, v5

    .line 72
    .line 73
    if-gtz v16, :cond_11

    .line 74
    .line 75
    :goto_0
    if-ne v3, v0, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    if-ne v3, v15, :cond_5

    .line 79
    .line 80
    :goto_1
    return p0

    .line 81
    :cond_5
    if-ne v3, v0, :cond_6

    .line 82
    .line 83
    iget v1, v1, Lst0;->c:F

    .line 84
    .line 85
    sub-float v1, v11, v1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    if-ne v3, v15, :cond_7

    .line 89
    .line 90
    iget v1, v1, Lst0;->a:F

    .line 91
    .line 92
    sub-float/2addr v1, v10

    .line 93
    goto :goto_2

    .line 94
    :cond_7
    if-ne v3, v14, :cond_8

    .line 95
    .line 96
    iget v1, v1, Lst0;->d:F

    .line 97
    .line 98
    sub-float v1, v9, v1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_8
    if-ne v3, v13, :cond_10

    .line 102
    .line 103
    iget v1, v1, Lst0;->b:F

    .line 104
    .line 105
    sub-float/2addr v1, v8

    .line 106
    :goto_2
    const/16 v16, 0x0

    .line 107
    .line 108
    cmpg-float v17, v1, v16

    .line 109
    .line 110
    if-gez v17, :cond_9

    .line 111
    .line 112
    move/from16 v1, v16

    .line 113
    .line 114
    :cond_9
    if-ne v3, v0, :cond_a

    .line 115
    .line 116
    sub-float/2addr v11, v7

    .line 117
    goto :goto_3

    .line 118
    :cond_a
    if-ne v3, v15, :cond_b

    .line 119
    .line 120
    sub-float v11, v2, v10

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_b
    if-ne v3, v14, :cond_c

    .line 124
    .line 125
    sub-float v11, v9, v5

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_c
    if-ne v3, v13, :cond_f

    .line 129
    .line 130
    sub-float v11, v6, v8

    .line 131
    .line 132
    :goto_3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 133
    .line 134
    cmpg-float v2, v11, v0

    .line 135
    .line 136
    if-gez v2, :cond_d

    .line 137
    .line 138
    move v11, v0

    .line 139
    :cond_d
    cmpg-float v0, v1, v11

    .line 140
    .line 141
    if-gez v0, :cond_e

    .line 142
    .line 143
    return p0

    .line 144
    :cond_e
    return v12

    .line 145
    :cond_f
    invoke-static {v4}, Lxc;->o(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return v12

    .line 149
    :cond_10
    invoke-static {v4}, Lxc;->o(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    return v12

    .line 153
    :cond_11
    return p0

    .line 154
    :cond_12
    invoke-static {v4}, Lxc;->o(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_13
    :goto_4
    return v12
.end method

.method public static final k(ILst0;Lst0;)Z
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x4

    .line 8
    if-ne p0, v0, :cond_2

    .line 9
    .line 10
    :goto_0
    iget p0, p1, Lst0;->d:F

    .line 11
    .line 12
    iget v0, p2, Lst0;->b:F

    .line 13
    .line 14
    cmpl-float p0, p0, v0

    .line 15
    .line 16
    if-lez p0, :cond_1

    .line 17
    .line 18
    iget p0, p1, Lst0;->b:F

    .line 19
    .line 20
    iget p1, p2, Lst0;->d:F

    .line 21
    .line 22
    cmpg-float p0, p0, p1

    .line 23
    .line 24
    if-gez p0, :cond_1

    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    return v1

    .line 28
    :cond_2
    const/4 v0, 0x5

    .line 29
    if-ne p0, v0, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    const/4 v0, 0x6

    .line 33
    if-ne p0, v0, :cond_5

    .line 34
    .line 35
    :goto_1
    iget p0, p1, Lst0;->c:F

    .line 36
    .line 37
    iget v0, p2, Lst0;->a:F

    .line 38
    .line 39
    cmpl-float p0, p0, v0

    .line 40
    .line 41
    if-lez p0, :cond_4

    .line 42
    .line 43
    iget p0, p1, Lst0;->a:F

    .line 44
    .line 45
    iget p1, p2, Lst0;->c:F

    .line 46
    .line 47
    cmpg-float p0, p0, p1

    .line 48
    .line 49
    if-gez p0, :cond_4

    .line 50
    .line 51
    return v2

    .line 52
    :cond_4
    return v1

    .line 53
    :cond_5
    const-string p0, "This function should only be used for 2-D focus search"

    .line 54
    .line 55
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return v1
.end method

.method public static final l(Lq7;Lsw;Ll51;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, Lq7;->a()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-interface {p2}, Lik;->e()Lpk;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget-object v0, Ln2;->H:Ln2;

    .line 12
    .line 13
    invoke-interface {p0, v0}, Lpk;->l(Lok;)Lnk;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p2}, Lik;->e()Lpk;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lv50;->l(Lpk;)Ls6;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, p1, p2}, Ls6;->c(Lsw;Ljk;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    invoke-static {}, Lxc;->d()V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    new-instance p0, Ls21;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-direct {p0, p1, v0}, Ls21;-><init>(Lsw;I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p2}, Lik;->e()Lpk;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lv50;->l(Lpk;)Ls6;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1, p0, p2}, Ls6;->c(Lsw;Ljk;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0
.end method

.method public static final m(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "index: "

    .line 7
    .line 8
    const-string v1, ", size: "

    .line 9
    .line 10
    invoke-static {p0, p1, v0, v1}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lxc;->f(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final n(II)V
    .locals 2

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-gt p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "index: "

    .line 7
    .line 8
    const-string v1, ", size: "

    .line 9
    .line 10
    invoke-static {p0, p1, v0, v1}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lxc;->f(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final o(III)V
    .locals 3

    .line 1
    const-string v0, "fromIndex: "

    .line 2
    .line 3
    if-ltz p0, :cond_1

    .line 4
    .line 5
    if-gt p1, p2, :cond_1

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p2, " > toIndex: "

    .line 11
    .line 12
    invoke-static {p0, p1, v0, p2}, Lt1;->k(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ", toIndex: "

    .line 31
    .line 32
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p0, ", size: "

    .line 39
    .line 40
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v1
.end method

.method public static final p(Ldv;Lsh0;)V
    .locals 8

    .line 1
    iget-object v0, p0, Loe0;->d:Loe0;

    .line 2
    .line 3
    iget-boolean v0, v0, Loe0;->q:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitChildren called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, Lw10;->b(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lsh0;

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    new-array v2, v1, [Loe0;

    .line 17
    .line 18
    invoke-direct {v0, v2}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Loe0;->d:Loe0;

    .line 22
    .line 23
    iget-object v2, p0, Loe0;->i:Loe0;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-static {v0, p0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0, v2}, Lsh0;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    :goto_0
    iget p0, v0, Lsh0;->f:I

    .line 35
    .line 36
    if-eqz p0, :cond_e

    .line 37
    .line 38
    add-int/lit8 p0, p0, -0x1

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lsh0;->k(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Loe0;

    .line 45
    .line 46
    iget v2, p0, Loe0;->g:I

    .line 47
    .line 48
    and-int/lit16 v2, v2, 0x400

    .line 49
    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    invoke-static {v0, p0}, Lpf1;->e(Lsh0;Loe0;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    :goto_1
    if-eqz p0, :cond_2

    .line 57
    .line 58
    iget v2, p0, Loe0;->f:I

    .line 59
    .line 60
    and-int/lit16 v2, v2, 0x400

    .line 61
    .line 62
    if-eqz v2, :cond_d

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    move-object v3, v2

    .line 66
    :goto_2
    if-eqz p0, :cond_2

    .line 67
    .line 68
    instance-of v4, p0, Ldv;

    .line 69
    .line 70
    if-eqz v4, :cond_6

    .line 71
    .line 72
    check-cast p0, Ldv;

    .line 73
    .line 74
    iget-boolean v4, p0, Loe0;->q:Z

    .line 75
    .line 76
    if-eqz v4, :cond_c

    .line 77
    .line 78
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    iget-boolean v4, v4, Lb60;->R:Z

    .line 83
    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_4
    invoke-virtual {p0}, Ldv;->y0()Lav;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    iget-boolean v4, v4, Lav;->a:Z

    .line 92
    .line 93
    if-eqz v4, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1, p0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_5
    invoke-static {p0, p1}, Lz60;->p(Ldv;Lsh0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    iget v4, p0, Loe0;->f:I

    .line 104
    .line 105
    and-int/lit16 v4, v4, 0x400

    .line 106
    .line 107
    if-eqz v4, :cond_c

    .line 108
    .line 109
    instance-of v4, p0, Lsm;

    .line 110
    .line 111
    if-eqz v4, :cond_c

    .line 112
    .line 113
    move-object v4, p0

    .line 114
    check-cast v4, Lsm;

    .line 115
    .line 116
    iget-object v4, v4, Lsm;->s:Loe0;

    .line 117
    .line 118
    const/4 v5, 0x0

    .line 119
    :goto_3
    const/4 v6, 0x1

    .line 120
    if-eqz v4, :cond_b

    .line 121
    .line 122
    iget v7, v4, Loe0;->f:I

    .line 123
    .line 124
    and-int/lit16 v7, v7, 0x400

    .line 125
    .line 126
    if-eqz v7, :cond_a

    .line 127
    .line 128
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    if-ne v5, v6, :cond_7

    .line 131
    .line 132
    move-object p0, v4

    .line 133
    goto :goto_4

    .line 134
    :cond_7
    if-nez v3, :cond_8

    .line 135
    .line 136
    new-instance v3, Lsh0;

    .line 137
    .line 138
    new-array v6, v1, [Loe0;

    .line 139
    .line 140
    invoke-direct {v3, v6}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_8
    if-eqz p0, :cond_9

    .line 144
    .line 145
    invoke-virtual {v3, p0}, Lsh0;->b(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object p0, v2

    .line 149
    :cond_9
    invoke-virtual {v3, v4}, Lsh0;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_a
    :goto_4
    iget-object v4, v4, Loe0;->i:Loe0;

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_b
    if-ne v5, v6, :cond_c

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_c
    :goto_5
    invoke-static {v3}, Lpf1;->f(Lsh0;)Loe0;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    goto :goto_2

    .line 163
    :cond_d
    iget-object p0, p0, Loe0;->i:Loe0;

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_e
    return-void
.end method

.method public static q(JJJLpi;)Lei0;
    .locals 36

    .line 1
    sget-wide v0, Lff;->g:J

    .line 2
    .line 3
    sget-object v2, Lnf;->a:Lg41;

    .line 4
    .line 5
    move-object/from16 v3, p6

    .line 6
    .line 7
    invoke-virtual {v3, v2}, Lpi;->j(Lat0;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Llf;

    .line 12
    .line 13
    iget-object v3, v2, Llf;->Z:Lei0;

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    new-instance v4, Lei0;

    .line 18
    .line 19
    sget-object v3, Li4;->f:Lmf;

    .line 20
    .line 21
    invoke-static {v2, v3}, Lnf;->c(Llf;Lmf;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    sget-object v3, Li4;->i:Lmf;

    .line 26
    .line 27
    invoke-static {v2, v3}, Lnf;->c(Llf;Lmf;)J

    .line 28
    .line 29
    .line 30
    move-result-wide v7

    .line 31
    sget-object v3, Li4;->g:Lmf;

    .line 32
    .line 33
    invoke-static {v2, v3}, Lnf;->c(Llf;Lmf;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v9

    .line 37
    sget-object v3, Li4;->j:Lmf;

    .line 38
    .line 39
    invoke-static {v2, v3}, Lnf;->c(Llf;Lmf;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v11

    .line 43
    sget-object v13, Li4;->k:Lmf;

    .line 44
    .line 45
    invoke-static {v2, v13}, Lnf;->c(Llf;Lmf;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v14

    .line 49
    move-wide/from16 v19, v0

    .line 50
    .line 51
    invoke-static {v2, v3}, Lnf;->c(Llf;Lmf;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    const v3, 0x3ec28f5c    # 0.38f

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v0, v1}, Lff;->b(FJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    move-wide/from16 v16, v0

    .line 63
    .line 64
    invoke-static {v2, v13}, Lnf;->c(Llf;Lmf;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-static {v3, v0, v1}, Lff;->b(FJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    move-wide v13, v14

    .line 73
    move-wide/from16 v15, v16

    .line 74
    .line 75
    move-wide/from16 v17, v0

    .line 76
    .line 77
    invoke-direct/range {v4 .. v18}, Lei0;-><init>(JJJJJJJ)V

    .line 78
    .line 79
    .line 80
    iput-object v4, v2, Llf;->Z:Lei0;

    .line 81
    .line 82
    move-object v3, v4

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move-wide/from16 v19, v0

    .line 85
    .line 86
    :goto_0
    const-wide/16 v0, 0x10

    .line 87
    .line 88
    cmp-long v2, p0, v0

    .line 89
    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    move-wide/from16 v22, p0

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    iget-wide v4, v3, Lei0;->a:J

    .line 96
    .line 97
    move-wide/from16 v22, v4

    .line 98
    .line 99
    :goto_1
    cmp-long v2, p2, v0

    .line 100
    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    move-wide/from16 v24, p2

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_2
    iget-wide v4, v3, Lei0;->b:J

    .line 107
    .line 108
    move-wide/from16 v24, v4

    .line 109
    .line 110
    :goto_2
    cmp-long v2, p4, v0

    .line 111
    .line 112
    if-eqz v2, :cond_3

    .line 113
    .line 114
    move-wide/from16 v26, p4

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_3
    iget-wide v4, v3, Lei0;->c:J

    .line 118
    .line 119
    move-wide/from16 v26, v4

    .line 120
    .line 121
    :goto_3
    cmp-long v2, v19, v0

    .line 122
    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    move-wide/from16 v28, v19

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_4
    iget-wide v4, v3, Lei0;->d:J

    .line 129
    .line 130
    move-wide/from16 v28, v4

    .line 131
    .line 132
    :goto_4
    cmp-long v2, v19, v0

    .line 133
    .line 134
    if-eqz v2, :cond_5

    .line 135
    .line 136
    move-wide/from16 v30, v19

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_5
    iget-wide v4, v3, Lei0;->e:J

    .line 140
    .line 141
    move-wide/from16 v30, v4

    .line 142
    .line 143
    :goto_5
    cmp-long v2, v19, v0

    .line 144
    .line 145
    if-eqz v2, :cond_6

    .line 146
    .line 147
    move-wide/from16 v32, v19

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_6
    iget-wide v4, v3, Lei0;->f:J

    .line 151
    .line 152
    move-wide/from16 v32, v4

    .line 153
    .line 154
    :goto_6
    cmp-long v0, v19, v0

    .line 155
    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    move-wide/from16 v34, v19

    .line 159
    .line 160
    goto :goto_7

    .line 161
    :cond_7
    iget-wide v0, v3, Lei0;->g:J

    .line 162
    .line 163
    move-wide/from16 v34, v0

    .line 164
    .line 165
    :goto_7
    new-instance v21, Lei0;

    .line 166
    .line 167
    invoke-direct/range {v21 .. v35}, Lei0;-><init>(JJJJJJJ)V

    .line 168
    .line 169
    .line 170
    return-object v21
.end method

.method public static final r(Lu7;JFLq7;Lw7;Lsw;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p3, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p4}, Lq7;->c()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-wide v0, p0, Lu7;->c:J

    .line 12
    .line 13
    sub-long v0, p1, v0

    .line 14
    .line 15
    long-to-float v0, v0

    .line 16
    div-float/2addr v0, p3

    .line 17
    float-to-long v0, v0

    .line 18
    :goto_0
    iput-wide p1, p0, Lu7;->g:J

    .line 19
    .line 20
    invoke-interface {p4, v0, v1}, Lq7;->b(J)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p2, p0, Lu7;->e:Lgp0;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p4, v0, v1}, Lq7;->f(J)Lb8;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lu7;->f:Lb8;

    .line 34
    .line 35
    invoke-interface {p4, v0, v1}, Lq7;->g(J)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    iget-wide p1, p0, Lu7;->g:J

    .line 42
    .line 43
    iput-wide p1, p0, Lu7;->h:J

    .line 44
    .line 45
    iget-object p1, p0, Lu7;->i:Lgp0;

    .line 46
    .line 47
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {p0, p5}, Lz60;->Q(Lu7;Lw7;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p6, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public static final s(JJ)Z
    .locals 0

    .line 1
    cmp-long p0, p0, p2

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public static final t(Lsh0;Lst0;I)Ldv;
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    const/high16 v3, 0x3f800000    # 1.0f

    .line 5
    .line 6
    if-ne p2, v0, :cond_0

    .line 7
    .line 8
    iget v0, p1, Lst0;->c:F

    .line 9
    .line 10
    iget v4, p1, Lst0;->a:F

    .line 11
    .line 12
    sub-float/2addr v0, v4

    .line 13
    add-float/2addr v0, v3

    .line 14
    invoke-virtual {p1, v0, v2}, Lst0;->d(FF)Lst0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x4

    .line 20
    if-ne p2, v0, :cond_1

    .line 21
    .line 22
    iget v0, p1, Lst0;->c:F

    .line 23
    .line 24
    iget v4, p1, Lst0;->a:F

    .line 25
    .line 26
    sub-float/2addr v0, v4

    .line 27
    add-float/2addr v0, v3

    .line 28
    neg-float v0, v0

    .line 29
    invoke-virtual {p1, v0, v2}, Lst0;->d(FF)Lst0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x5

    .line 35
    if-ne p2, v0, :cond_2

    .line 36
    .line 37
    iget v0, p1, Lst0;->d:F

    .line 38
    .line 39
    iget v4, p1, Lst0;->b:F

    .line 40
    .line 41
    sub-float/2addr v0, v4

    .line 42
    add-float/2addr v0, v3

    .line 43
    invoke-virtual {p1, v2, v0}, Lst0;->d(FF)Lst0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v0, 0x6

    .line 49
    if-ne p2, v0, :cond_5

    .line 50
    .line 51
    iget v0, p1, Lst0;->d:F

    .line 52
    .line 53
    iget v4, p1, Lst0;->b:F

    .line 54
    .line 55
    sub-float/2addr v0, v4

    .line 56
    add-float/2addr v0, v3

    .line 57
    neg-float v0, v0

    .line 58
    invoke-virtual {p1, v2, v0}, Lst0;->d(FF)Lst0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_0
    iget-object v2, p0, Lsh0;->d:[Ljava/lang/Object;

    .line 63
    .line 64
    iget p0, p0, Lsh0;->f:I

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    :goto_1
    if-ge v3, p0, :cond_4

    .line 68
    .line 69
    aget-object v4, v2, v3

    .line 70
    .line 71
    check-cast v4, Ldv;

    .line 72
    .line 73
    invoke-static {v4}, Li4;->t(Ldv;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_3

    .line 78
    .line 79
    invoke-static {v4}, Li4;->o(Ldv;)Lst0;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v5, v0, p1, p2}, Lz60;->E(Lst0;Lst0;Lst0;I)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    move-object v1, v4

    .line 90
    move-object v0, v5

    .line 91
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_4
    return-object v1

    .line 95
    :cond_5
    const-string p0, "This function should only be used for 2-D focus search"

    .line 96
    .line 97
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v1
.end method

.method public static final u(Ldv;ILsw;)Z
    .locals 4

    .line 1
    new-instance v0, Lsh0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v1, v1, [Ldv;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Lz60;->p(Ldv;Lsh0;)V

    .line 11
    .line 12
    .line 13
    iget v1, v0, Lsh0;->f:I

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-gt v1, v2, :cond_1

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p0, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 24
    .line 25
    aget-object p0, p0, v3

    .line 26
    .line 27
    :goto_0
    check-cast p0, Ldv;

    .line 28
    .line 29
    if-eqz p0, :cond_6

    .line 30
    .line 31
    invoke-interface {p2, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_1
    const/4 v1, 0x7

    .line 43
    const/4 v2, 0x4

    .line 44
    if-ne p1, v1, :cond_2

    .line 45
    .line 46
    move p1, v2

    .line 47
    :cond_2
    if-ne p1, v2, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    const/4 v1, 0x6

    .line 51
    if-ne p1, v1, :cond_4

    .line 52
    .line 53
    :goto_1
    invoke-static {p0}, Li4;->o(Ldv;)Lst0;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    new-instance v1, Lst0;

    .line 58
    .line 59
    iget v2, p0, Lst0;->a:F

    .line 60
    .line 61
    iget p0, p0, Lst0;->b:F

    .line 62
    .line 63
    invoke-direct {v1, v2, p0, v2, p0}, Lst0;-><init>(FFFF)V

    .line 64
    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/4 v1, 0x3

    .line 68
    if-ne p1, v1, :cond_5

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    const/4 v1, 0x5

    .line 72
    if-ne p1, v1, :cond_7

    .line 73
    .line 74
    :goto_2
    invoke-static {p0}, Li4;->o(Ldv;)Lst0;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance v1, Lst0;

    .line 79
    .line 80
    iget v2, p0, Lst0;->c:F

    .line 81
    .line 82
    iget p0, p0, Lst0;->d:F

    .line 83
    .line 84
    invoke-direct {v1, v2, p0, v2, p0}, Lst0;-><init>(FFFF)V

    .line 85
    .line 86
    .line 87
    :goto_3
    invoke-static {v0, v1, p1}, Lz60;->t(Lsh0;Lst0;I)Ldv;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-eqz p0, :cond_6

    .line 92
    .line 93
    invoke-interface {p2, p0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    check-cast p0, Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    return p0

    .line 104
    :cond_6
    return v3

    .line 105
    :cond_7
    const-string p0, "This function should only be used for 2-D focus search"

    .line 106
    .line 107
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return v3
.end method

.method public static final v(ILrp;Ldv;Lst0;)Z
    .locals 8

    .line 1
    invoke-static {p0, p1, p2, p3}, Lz60;->N(ILrp;Ldv;Lst0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-static {p2}, Lpf1;->R(Lrm;)Ldn0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lw3;

    .line 14
    .line 15
    invoke-virtual {v0}, Lw3;->getFocusOwner()Lwu;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lzu;

    .line 20
    .line 21
    invoke-virtual {v0}, Lzu;->f()Ldv;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v1, Lhl0;

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    move v5, p0

    .line 29
    move-object v6, p1

    .line 30
    move-object v3, p2

    .line 31
    move-object v4, p3

    .line 32
    invoke-direct/range {v1 .. v7}, Lhl0;-><init>(Ldv;Ldv;Ljava/lang/Object;ILrp;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v5, v1}, Li4;->E(Ldv;ILsw;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return p0
.end method

.method public static final w(Ls70;IJLxn0;JLga;Lk50;ILug0;)Lae0;
    .locals 9

    .line 1
    move-object/from16 v0, p10

    .line 2
    .line 3
    invoke-virtual {p4, p1}, Lxn0;->c(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    invoke-virtual {v0, p1}, Lu20;->b(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    check-cast p4, Ljava/util/List;

    .line 12
    .line 13
    if-eqz p4, :cond_0

    .line 14
    .line 15
    move-object v3, p4

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual/range {p0 .. p1}, Ls70;->a(I)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    new-instance v1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v1, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_0
    if-ge v2, p4, :cond_1

    .line 32
    .line 33
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lsd0;

    .line 38
    .line 39
    invoke-interface {v3, p2, p3}, Lsd0;->e(J)Lxq0;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v0, p1, v1}, Lug0;->i(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v3, v1

    .line 53
    :goto_1
    new-instance v0, Lae0;

    .line 54
    .line 55
    move v1, p1

    .line 56
    move-wide v4, p5

    .line 57
    move-object/from16 v7, p7

    .line 58
    .line 59
    move-object/from16 v8, p8

    .line 60
    .line 61
    move/from16 v2, p9

    .line 62
    .line 63
    invoke-direct/range {v0 .. v8}, Lae0;-><init>(IILjava/util/List;JLjava/lang/Object;Lga;Lk50;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public static final x(Lpk;)F
    .locals 1

    .line 1
    sget-object v0, Ln2;->K:Ln2;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lpk;->l(Lok;)Lnk;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxf0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lxf0;->u()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 17
    .line 18
    :goto_0
    const/4 v0, 0x0

    .line 19
    cmpl-float v0, p0, v0

    .line 20
    .line 21
    if-ltz v0, :cond_1

    .line 22
    .line 23
    return p0

    .line 24
    :cond_1
    const-string v0, "negative scale factor"

    .line 25
    .line 26
    invoke-static {v0}, Lyr0;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return p0
.end method

.method public static final y(Landroid/view/View;)Landroid/view/ViewParent;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    const v0, 0x7f060073

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    instance-of v0, p0, Landroid/view/ViewParent;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p0, Landroid/view/ViewParent;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public static z(BBBB[CI)V
    .locals 2

    .line 1
    invoke-static {p1}, Lz60;->H(B)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    shl-int/lit8 v0, p0, 0x1c

    .line 8
    .line 9
    add-int/lit8 v1, p1, 0x70

    .line 10
    .line 11
    add-int/2addr v1, v0

    .line 12
    shr-int/lit8 v0, v1, 0x1e

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {p2}, Lz60;->H(B)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-static {p3}, Lz60;->H(B)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    and-int/lit8 p0, p0, 0x7

    .line 29
    .line 30
    shl-int/lit8 p0, p0, 0x12

    .line 31
    .line 32
    and-int/lit8 p1, p1, 0x3f

    .line 33
    .line 34
    shl-int/lit8 p1, p1, 0xc

    .line 35
    .line 36
    or-int/2addr p0, p1

    .line 37
    and-int/lit8 p1, p2, 0x3f

    .line 38
    .line 39
    shl-int/lit8 p1, p1, 0x6

    .line 40
    .line 41
    or-int/2addr p0, p1

    .line 42
    and-int/lit8 p1, p3, 0x3f

    .line 43
    .line 44
    or-int/2addr p0, p1

    .line 45
    ushr-int/lit8 p1, p0, 0xa

    .line 46
    .line 47
    const p2, 0xd7c0

    .line 48
    .line 49
    .line 50
    add-int/2addr p1, p2

    .line 51
    int-to-char p1, p1

    .line 52
    aput-char p1, p4, p5

    .line 53
    .line 54
    add-int/lit8 p5, p5, 0x1

    .line 55
    .line 56
    and-int/lit16 p0, p0, 0x3ff

    .line 57
    .line 58
    const p1, 0xdc00

    .line 59
    .line 60
    .line 61
    add-int/2addr p0, p1

    .line 62
    int-to-char p0, p0

    .line 63
    aput-char p0, p4, p5

    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    const-string p0, "Invalid UTF-8"

    .line 67
    .line 68
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
