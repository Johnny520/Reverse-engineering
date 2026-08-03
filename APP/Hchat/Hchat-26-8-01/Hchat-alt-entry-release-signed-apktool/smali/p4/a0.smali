.class public final Lp4/a0;
.super Lp4/l;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final f:Lp4/f;

.field public final g:Lz4/g;

.field public final h:[Lp4/f;

.field public final i:Z


# direct methods
.method public constructor <init>(Lu4/t;Lp4/f;Lz4/g;[Lp4/f;)V
    .locals 6

    .line 1
    sget-object v0, Lu4/p;->i:Lu4/p;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Lp4/l;-><init>(Lu4/t;Lu4/p;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_6

    .line 7
    .line 8
    if-eqz p3, :cond_5

    .line 9
    .line 10
    if-eqz p4, :cond_4

    .line 11
    .line 12
    iget p1, p3, Lz4/g;->i:I

    .line 13
    .line 14
    array-length v0, p4

    .line 15
    if-ne p1, v0, :cond_3

    .line 16
    .line 17
    const v0, 0xffff

    .line 18
    .line 19
    .line 20
    if-gt p1, v0, :cond_2

    .line 21
    .line 22
    iput-object p2, p0, Lp4/a0;->f:Lp4/f;

    .line 23
    .line 24
    iput-object p3, p0, Lp4/a0;->g:Lz4/g;

    .line 25
    .line 26
    iput-object p4, p0, Lp4/a0;->h:[Lp4/f;

    .line 27
    .line 28
    const/4 p2, 0x2

    .line 29
    const/4 p4, 0x1

    .line 30
    if-ge p1, p2, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-static {p3}, Lp4/a0;->m(Lz4/g;)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    iget p3, p3, Lz4/g;->i:I

    .line 38
    .line 39
    int-to-long v0, p3

    .line 40
    const-wide/16 v2, 0x4

    .line 41
    .line 42
    mul-long/2addr v0, v2

    .line 43
    const-wide/16 v4, 0x2

    .line 44
    .line 45
    add-long/2addr v0, v4

    .line 46
    const-wide/16 v4, 0x0

    .line 47
    .line 48
    cmp-long p3, p1, v4

    .line 49
    .line 50
    if-ltz p3, :cond_1

    .line 51
    .line 52
    const-wide/16 v4, 0x5

    .line 53
    .line 54
    mul-long/2addr v0, v4

    .line 55
    div-long/2addr v0, v2

    .line 56
    cmp-long p1, p1, v0

    .line 57
    .line 58
    if-gtz p1, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 p4, 0x0

    .line 62
    :goto_0
    iput-boolean p4, p0, Lp4/a0;->i:Z

    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    const-string p1, "too many cases"

    .line 66
    .line 67
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    throw p1

    .line 72
    :cond_3
    const-string p1, "cases / targets mismatch"

    .line 73
    .line 74
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    throw p1

    .line 79
    :cond_4
    const-string p1, "targets == null"

    .line 80
    .line 81
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    throw p1

    .line 86
    :cond_5
    const-string p1, "cases == null"

    .line 87
    .line 88
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    throw p1

    .line 93
    :cond_6
    const-string p1, "user == null"

    .line 94
    .line 95
    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const/4 p1, 0x0

    .line 99
    throw p1
.end method

.method public static m(Lz4/g;)J
    .locals 5

    .line 1
    iget v0, p0, Lz4/g;->i:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Lz4/g;->n(I)I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    int-to-long v1, v1

    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lz4/g;->n(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    int-to-long v3, p0

    .line 16
    sub-long/2addr v3, v1

    .line 17
    const-wide/16 v0, 0x1

    .line 18
    .line 19
    add-long/2addr v3, v0

    .line 20
    const-wide/16 v0, 0x2

    .line 21
    .line 22
    mul-long/2addr v3, v0

    .line 23
    const-wide/16 v0, 0x4

    .line 24
    .line 25
    add-long/2addr v3, v0

    .line 26
    const-wide/32 v0, 0x7fffffff

    .line 27
    .line 28
    .line 29
    cmp-long p0, v3, v0

    .line 30
    .line 31
    if-gtz p0, :cond_0

    .line 32
    .line 33
    return-wide v3

    .line 34
    :cond_0
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    return-wide v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lp4/a0;->h:[Lp4/f;

    .line 9
    .line 10
    array-length v2, v1

    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v2, :cond_0

    .line 13
    .line 14
    const-string v4, "\n    "

    .line 15
    .line 16
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v4, p0, Lp4/a0;->g:Lz4/g;

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Lz4/g;->n(I)I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v4, ": "

    .line 29
    .line 30
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    aget-object v4, v1, v3

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0
.end method

.method public final b()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lp4/a0;->i:Z

    .line 2
    .line 3
    iget-object v1, p0, Lp4/a0;->g:Lz4/g;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v1}, Lp4/a0;->m(Lz4/g;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    :goto_0
    long-to-int v0, v0

    .line 12
    return v0

    .line 13
    :cond_0
    iget v0, v1, Lz4/g;->i:I

    .line 14
    .line 15
    int-to-long v0, v0

    .line 16
    const-wide/16 v2, 0x4

    .line 17
    .line 18
    mul-long/2addr v0, v2

    .line 19
    const-wide/16 v2, 0x2

    .line 20
    .line 21
    add-long/2addr v0, v2

    .line 22
    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lp4/a0;->f:Lp4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp4/h;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const/16 v2, 0x64

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lp4/a0;->h:[Lp4/f;

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    iget-boolean v4, p0, Lp4/a0;->i:Z

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    const-string v4, "packed"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string v4, "sparse"

    .line 25
    .line 26
    :goto_0
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v4, "-switch-payload // for switch @ "

    .line 30
    .line 31
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, La/a;->X0(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    :goto_1
    if-ge v4, v3, :cond_1

    .line 43
    .line 44
    aget-object v5, v2, v4

    .line 45
    .line 46
    invoke-virtual {v5}, Lp4/h;->e()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    sub-int v6, v5, v0

    .line 51
    .line 52
    const-string v7, "\n  "

    .line 53
    .line 54
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v7, p0, Lp4/a0;->g:Lz4/g;

    .line 58
    .line 59
    invoke-virtual {v7, v4}, Lz4/g;->n(I)I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v7, ": "

    .line 67
    .line 68
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, La/a;->Y0(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v5, " // "

    .line 79
    .line 80
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-static {v6}, La/a;->L0(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    return-object v0
.end method

.method public final k(Lu4/p;)Lp4/h;
    .locals 4

    .line 1
    new-instance p1, Lp4/a0;

    .line 2
    .line 3
    iget-object v0, p0, Lp4/a0;->g:Lz4/g;

    .line 4
    .line 5
    iget-object v1, p0, Lp4/a0;->h:[Lp4/f;

    .line 6
    .line 7
    iget-object v2, p0, Lp4/h;->c:Lu4/t;

    .line 8
    .line 9
    iget-object v3, p0, Lp4/a0;->f:Lp4/f;

    .line 10
    .line 11
    invoke-direct {p1, v2, v3, v0, v1}, Lp4/a0;-><init>(Lu4/t;Lp4/f;Lz4/g;[Lp4/f;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method

.method public final l(Lz4/d;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lp4/a0;->f:Lp4/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp4/h;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sget-object v1, Lp4/k;->J:Lp4/j;

    .line 8
    .line 9
    iget-object v1, v1, Lp4/j;->d:Lf8/i;

    .line 10
    .line 11
    invoke-virtual {v1}, Lf8/i;->j()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object v2, p0, Lp4/a0;->h:[Lp4/f;

    .line 16
    .line 17
    array-length v3, v2

    .line 18
    iget-boolean v4, p0, Lp4/a0;->i:Z

    .line 19
    .line 20
    iget-object v5, p0, Lp4/a0;->g:Lz4/g;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    move v4, v6

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v5, v6}, Lz4/g;->n(I)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    :goto_0
    if-nez v3, :cond_1

    .line 34
    .line 35
    move v3, v6

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    add-int/lit8 v3, v3, -0x1

    .line 38
    .line 39
    invoke-virtual {v5, v3}, Lz4/g;->n(I)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    :goto_1
    sub-int/2addr v3, v4

    .line 44
    add-int/lit8 v3, v3, 0x1

    .line 45
    .line 46
    const/16 v7, 0x100

    .line 47
    .line 48
    invoke-virtual {p1, v7}, Lz4/d;->l(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v3}, Lz4/d;->l(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v4}, Lz4/d;->k(I)V

    .line 55
    .line 56
    .line 57
    move v7, v6

    .line 58
    :goto_2
    if-ge v6, v3, :cond_5

    .line 59
    .line 60
    add-int v8, v4, v6

    .line 61
    .line 62
    invoke-virtual {v5, v7}, Lz4/g;->n(I)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-le v9, v8, :cond_2

    .line 67
    .line 68
    move v8, v1

    .line 69
    goto :goto_3

    .line 70
    :cond_2
    aget-object v8, v2, v7

    .line 71
    .line 72
    invoke-virtual {v8}, Lp4/h;->e()I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    sub-int/2addr v8, v0

    .line 77
    add-int/lit8 v7, v7, 0x1

    .line 78
    .line 79
    :goto_3
    invoke-virtual {p1, v8}, Lz4/d;->k(I)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v6, v6, 0x1

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/16 v1, 0x200

    .line 86
    .line 87
    invoke-virtual {p1, v1}, Lz4/d;->l(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v3}, Lz4/d;->l(I)V

    .line 91
    .line 92
    .line 93
    move v1, v6

    .line 94
    :goto_4
    if-ge v1, v3, :cond_4

    .line 95
    .line 96
    invoke-virtual {v5, v1}, Lz4/g;->n(I)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {p1, v4}, Lz4/d;->k(I)V

    .line 101
    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    :goto_5
    if-ge v6, v3, :cond_5

    .line 107
    .line 108
    aget-object v1, v2, v6

    .line 109
    .line 110
    invoke-virtual {v1}, Lp4/h;->e()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    sub-int/2addr v1, v0

    .line 115
    invoke-virtual {p1, v1}, Lz4/d;->k(I)V

    .line 116
    .line 117
    .line 118
    add-int/lit8 v6, v6, 0x1

    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_5
    return-void
.end method
