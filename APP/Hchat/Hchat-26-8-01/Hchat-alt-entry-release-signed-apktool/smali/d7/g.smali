.class public abstract Ld7/g;
.super Ld7/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final o:I

.field public final p:I

.field public final q:La5/a;

.field public r:Ljava/lang/String;

.field public s:J


# direct methods
.method public constructor <init>(ILc7/g;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ld7/t;-><init>(ILc7/g;)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ld7/g;->o:I

    .line 5
    .line 6
    iput p3, p0, Ld7/g;->p:I

    .line 7
    .line 8
    new-instance p1, La5/a;

    .line 9
    .line 10
    const/4 p2, 0x1

    .line 11
    invoke-direct {p1, p3, p2, p0}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ld7/g;->q:La5/a;

    .line 15
    .line 16
    invoke-static {p1}, La5/a;->b(La5/a;)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 p3, p3, 0x4

    .line 20
    .line 21
    const-wide/32 p1, 0x2210821

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p3, p1, p2}, Ld7/s;->Q(IJ)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static i0(J)Z
    .locals 2

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v0, p0, v0

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-wide v0, -0x100000000L

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    and-long/2addr p0, v0

    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long p0, p0, v0

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    return p0
.end method


# virtual methods
.method public final V(Ljava/io/InputStream;)I
    .locals 8

    .line 1
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ld7/g;->p:I

    .line 6
    .line 7
    iget v2, p0, Ld7/g;->o:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    iput-object v0, p0, Ld7/g;->r:Ljava/lang/String;

    .line 16
    .line 17
    move v0, v4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    add-int v5, v2, v0

    .line 20
    .line 21
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    add-int/2addr v6, v5

    .line 26
    invoke-virtual {p0}, Ld7/g;->W()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    add-int/2addr v5, v6

    .line 31
    invoke-virtual {p0, v5, v4}, Lr7/b;->M(IZ)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v5, v1, 0x14

    .line 35
    .line 36
    invoke-virtual {p0, v5, v0}, Ld7/s;->R(II)V

    .line 37
    .line 38
    .line 39
    iget-object v5, p0, Lr7/b;->k:[B

    .line 40
    .line 41
    invoke-virtual {p1, v5, v2, v0}, Ljava/io/InputStream;->read([BII)I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-ne v5, v0, :cond_3

    .line 46
    .line 47
    iput-object v3, p0, Ld7/g;->r:Ljava/lang/String;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    add-int/2addr v6, v2

    .line 61
    add-int/2addr v6, v5

    .line 62
    invoke-virtual {p0}, Ld7/g;->W()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    add-int/2addr v7, v6

    .line 67
    invoke-virtual {p0, v7, v4}, Lr7/b;->M(IZ)V

    .line 68
    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x16

    .line 71
    .line 72
    invoke-virtual {p0, v1, v5}, Ld7/s;->R(II)V

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, Lr7/b;->k:[B

    .line 76
    .line 77
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    add-int/2addr v4, v2

    .line 82
    invoke-virtual {p1, v1, v4, v5}, Ljava/io/InputStream;->read([BII)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-ne v1, v5, :cond_2

    .line 87
    .line 88
    move v4, v5

    .line 89
    :goto_1
    add-int/2addr v0, v4

    .line 90
    invoke-virtual {p0, p1}, Ld7/g;->k0(Ljava/io/InputStream;)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    add-int/2addr p1, v0

    .line 95
    iput-object v3, p0, Ld7/g;->r:Ljava/lang/String;

    .line 96
    .line 97
    return p1

    .line 98
    :cond_2
    const-string p1, "Stream ended before reading extra bytes: read="

    .line 99
    .line 100
    const-string v0, ", extra length="

    .line 101
    .line 102
    invoke-static {v1, p1, v0, v5}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 p1, 0x0

    .line 110
    return p1

    .line 111
    :cond_3
    const-string p1, "Stream ended before reading file name: read="

    .line 112
    .line 113
    const-string v1, ", name length="

    .line 114
    .line 115
    invoke-static {v5, p1, v1, v0}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    const/4 p1, 0x0

    .line 123
    return p1
.end method

.method public W()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public X()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld7/g;->d0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, v0}, Ld7/s;->N(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public Y()J
    .locals 2

    .line 1
    iget v0, p0, Ld7/g;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ld7/s;->N(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final Z()I
    .locals 1

    .line 1
    iget v0, p0, Ld7/g;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x16

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ld7/s;->O(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final a0()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ld7/g;->r:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lr7/b;->k:[B

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    iget v3, p0, Ld7/g;->o:I

    .line 13
    .line 14
    sub-int/2addr v2, v3

    .line 15
    if-gtz v2, :cond_0

    .line 16
    .line 17
    const-string v0, ""

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-le v0, v2, :cond_1

    .line 21
    .line 22
    move v0, v2

    .line 23
    :cond_1
    new-instance v2, Ljava/lang/String;

    .line 24
    .line 25
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 26
    .line 27
    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 28
    .line 29
    .line 30
    move-object v0, v2

    .line 31
    :goto_0
    iput-object v0, p0, Ld7/g;->r:Ljava/lang/String;

    .line 32
    .line 33
    :cond_2
    iget-object v0, p0, Ld7/g;->r:Ljava/lang/String;

    .line 34
    .line 35
    return-object v0
.end method

.method public final b0()I
    .locals 1

    .line 1
    iget v0, p0, Ld7/g;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x14

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ld7/s;->O(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final c0()I
    .locals 1

    .line 1
    iget v0, p0, Ld7/g;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ld7/s;->O(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final d0()I
    .locals 1

    .line 1
    iget v0, p0, Ld7/g;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xc

    .line 4
    .line 5
    return v0
.end method

.method public e0()J
    .locals 2

    .line 1
    iget v0, p0, Ld7/g;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ld7/s;->N(I)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public f0()I
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    return v0
.end method

.method public final g0()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ld7/g;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Ld7/g;->f0()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public h0()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ld7/g;->d0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lr7/b;->k:[B

    .line 6
    .line 7
    invoke-static {v1, v0}, Lk7/a;->s([BI)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ld7/g;->d0()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v2, p0, Lr7/b;->k:[B

    .line 20
    .line 21
    invoke-static {v2, v0}, Lk7/a;->s([BI)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    :goto_0
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    return v0
.end method

.method public j0()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld7/g;->r:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ld7/g;->m0(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public k0(Ljava/io/InputStream;)I
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public l0(J)V
    .locals 1

    .line 1
    iget v0, p0, Ld7/g;->p:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1, p2}, Ld7/s;->Q(IJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final m0(Ljava/lang/String;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const-string p1, ""

    .line 4
    .line 5
    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ld7/g;->q:La5/a;

    .line 12
    .line 13
    invoke-static {v1}, La5/a;->b(La5/a;)V

    .line 14
    .line 15
    .line 16
    array-length v1, v0

    .line 17
    iget v2, p0, Ld7/g;->o:I

    .line 18
    .line 19
    add-int v3, v2, v1

    .line 20
    .line 21
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    add-int/2addr v4, v3

    .line 26
    invoke-virtual {p0}, Ld7/g;->W()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    add-int/2addr v3, v4

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-virtual {p0, v3, v4}, Lr7/b;->M(IZ)V

    .line 33
    .line 34
    .line 35
    iget v3, p0, Ld7/g;->p:I

    .line 36
    .line 37
    add-int/lit8 v3, v3, 0x14

    .line 38
    .line 39
    invoke-virtual {p0, v3, v1}, Ld7/s;->R(II)V

    .line 40
    .line 41
    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    iput-object p1, p0, Ld7/g;->r:Ljava/lang/String;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    iget-object v3, p0, Lr7/b;->k:[B

    .line 48
    .line 49
    invoke-static {v0, v4, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Ld7/g;->r:Ljava/lang/String;

    .line 53
    .line 54
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ld7/t;->n:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "Invalid"

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "["

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-wide v1, p0, Ld7/g;->s:J

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, "] "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ld7/g;->a0()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-lez v2, :cond_1

    .line 38
    .line 39
    const-string v2, "name="

    .line 40
    .line 41
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", "

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    :cond_1
    const-string v1, "SIG="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ld7/t;->T()Lc7/g;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", versionMadeBy="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x4

    .line 70
    invoke-virtual {p0, v1}, Ld7/s;->O(I)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    int-to-short v2, v2

    .line 75
    invoke-static {v2}, Ly7/a;->o(S)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v2, ", platform="

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const/4 v2, 0x5

    .line 88
    iget-object v3, p0, Lr7/b;->k:[B

    .line 89
    .line 90
    aget-byte v2, v3, v2

    .line 91
    .line 92
    and-int/lit16 v2, v2, 0xff

    .line 93
    .line 94
    int-to-byte v2, v2

    .line 95
    invoke-static {v2}, Ly7/a;->n(B)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v2, ", GP={"

    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object v2, p0, Ld7/g;->q:La5/a;

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v2, "}, method="

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Ld7/g;->c0()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v2, ", date="

    .line 125
    .line 126
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget v2, p0, Ld7/g;->p:I

    .line 130
    .line 131
    add-int/2addr v2, v1

    .line 132
    invoke-virtual {p0, v2}, Ld7/s;->N(I)J

    .line 133
    .line 134
    .line 135
    move-result-wide v1

    .line 136
    const/4 v3, 0x1

    .line 137
    invoke-static {v3, v1, v2}, Ly7/a;->l(IJ)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", crc="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ld7/g;->Y()J

    .line 150
    .line 151
    .line 152
    move-result-wide v1

    .line 153
    const/16 v3, 0x8

    .line 154
    .line 155
    invoke-static {v3, v1, v2}, Ly7/a;->l(IJ)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v1, ", cSize="

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Ld7/g;->X()J

    .line 168
    .line 169
    .line 170
    move-result-wide v1

    .line 171
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v1, ", size="

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Ld7/g;->e0()J

    .line 180
    .line 181
    .line 182
    move-result-wide v1

    .line 183
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v1, ", fileNameLength="

    .line 187
    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const-string v1, ", extraLength="

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    return-object v0
.end method
