.class public final Ld7/m;
.super Ld7/g;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public t:Ld7/h;

.field public u:Ld7/d;


# virtual methods
.method public final X()J
    .locals 3

    .line 1
    iget-object v0, p0, Ld7/m;->t:Ld7/h;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ld7/s;->N(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ld7/g;->g0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget v0, p0, Ld7/g;->o:I

    .line 19
    .line 20
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/2addr v2, v0

    .line 25
    add-int/2addr v2, v1

    .line 26
    iget-object v0, p0, Lr7/b;->k:[B

    .line 27
    .line 28
    invoke-static {v0, v2}, Lk7/a;->t([BI)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    return-wide v0

    .line 33
    :cond_1
    invoke-virtual {p0}, Ld7/g;->d0()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0, v0}, Ld7/s;->N(I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    return-wide v0
.end method

.method public final Y()J
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/m;->t:Ld7/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {v0, v1}, Ld7/s;->N(I)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0

    .line 11
    :cond_0
    invoke-super {p0}, Ld7/g;->Y()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public final e0()J
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/m;->t:Ld7/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ld7/s;->N(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ld7/g;->g0()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget v0, p0, Ld7/g;->o:I

    .line 19
    .line 20
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v1, v0

    .line 25
    add-int/lit8 v1, v1, 0x4

    .line 26
    .line 27
    iget-object v0, p0, Lr7/b;->k:[B

    .line 28
    .line 29
    invoke-static {v0, v1}, Lk7/a;->t([BI)J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0

    .line 34
    :cond_1
    iget v0, p0, Ld7/g;->p:I

    .line 35
    .line 36
    add-int/lit8 v0, v0, 0x10

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ld7/s;->N(I)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    return-wide v0
.end method

.method public final l0(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/m;->t:Ld7/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-virtual {v0, v1, p1, p2}, Ld7/s;->Q(IJ)V

    .line 7
    .line 8
    .line 9
    const-wide/16 p1, 0x0

    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Ld7/g;->l0(J)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-super {p0, p1, p2}, Ld7/g;->l0(J)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final n0(Ld7/d;)V
    .locals 7

    .line 1
    iput-object p1, p0, Ld7/m;->u:Ld7/d;

    .line 2
    .line 3
    iget-object v0, p0, Ld7/g;->q:La5/a;

    .line 4
    .line 5
    iget v1, v0, La5/a;->h:I

    .line 6
    .line 7
    iget-object v2, v0, La5/a;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ld7/g;

    .line 10
    .line 11
    iget-wide v3, p0, Ld7/g;->s:J

    .line 12
    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    cmp-long v3, v3, v5

    .line 16
    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    iget-wide v3, p1, Ld7/g;->s:J

    .line 20
    .line 21
    iput-wide v3, p0, Ld7/g;->s:J

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Ld7/m;->Y()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    cmp-long v3, v3, v5

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Ld7/g;->Y()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-virtual {p0, v3, v4}, Ld7/m;->l0(J)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Ld7/m;->e0()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    cmp-long v3, v3, v5

    .line 43
    .line 44
    if-nez v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1}, Ld7/g;->e0()J

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    invoke-virtual {p0, v3, v4}, Ld7/m;->q0(J)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0}, Ld7/m;->X()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    cmp-long v3, v3, v5

    .line 58
    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1}, Ld7/g;->X()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    invoke-virtual {p0, v3, v4}, Ld7/m;->o0(J)V

    .line 66
    .line 67
    .line 68
    :cond_3
    invoke-virtual {v2, v1}, Ld7/s;->O(I)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-nez v3, :cond_5

    .line 73
    .line 74
    iget-object p1, p1, Ld7/g;->q:La5/a;

    .line 75
    .line 76
    iget-object v3, p1, La5/a;->i:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Ld7/g;

    .line 79
    .line 80
    iget p1, p1, La5/a;->h:I

    .line 81
    .line 82
    invoke-virtual {v3, p1}, Ld7/s;->O(I)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-virtual {v2, v1}, Ld7/s;->O(I)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-ne p1, v3, :cond_4

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    invoke-virtual {v0}, La5/a;->g()Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {v2, v1, p1}, Ld7/s;->R(II)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, La5/a;->g()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eq v3, p1, :cond_5

    .line 105
    .line 106
    invoke-virtual {v2}, Ld7/g;->j0()V

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_0
    return-void
.end method

.method public final o0(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/m;->t:Ld7/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2}, Ld7/s;->Q(IJ)V

    .line 8
    .line 9
    .line 10
    const-wide/16 p1, 0x0

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ld7/m;->p0(J)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2}, Ld7/m;->p0(J)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final p0(J)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ld7/g;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1, p2}, Ld7/g;->i0(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ld7/g;->d0()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0, p1, p2}, Ld7/s;->Q(IJ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget v1, p0, Ld7/g;->o:I

    .line 27
    .line 28
    const/16 v2, 0x14

    .line 29
    .line 30
    if-lt v0, v2, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v1

    .line 38
    add-int/2addr v0, v2

    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-virtual {p0, v0, v3}, Lr7/b;->M(IZ)V

    .line 41
    .line 42
    .line 43
    iget v0, p0, Ld7/g;->p:I

    .line 44
    .line 45
    add-int/lit8 v0, v0, 0x16

    .line 46
    .line 47
    invoke-virtual {p0, v0, v2}, Ld7/s;->R(II)V

    .line 48
    .line 49
    .line 50
    :goto_1
    invoke-virtual {p0}, Ld7/g;->d0()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v2, -0x1

    .line 55
    iget-object v3, p0, Lr7/b;->k:[B

    .line 56
    .line 57
    invoke-static {v3, v0, v2}, Lk7/a;->D([BII)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    add-int/2addr v0, v1

    .line 65
    add-int/lit8 v1, v0, 0x8

    .line 66
    .line 67
    iget-object v2, p0, Lr7/b;->k:[B

    .line 68
    .line 69
    add-int/lit8 v0, v0, 0x10

    .line 70
    .line 71
    array-length v3, v2

    .line 72
    if-le v0, v3, :cond_3

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    :goto_2
    if-ge v1, v0, :cond_4

    .line 76
    .line 77
    const-wide/16 v3, 0xff

    .line 78
    .line 79
    and-long/2addr v3, p1

    .line 80
    long-to-int v3, v3

    .line 81
    int-to-byte v3, v3

    .line 82
    aput-byte v3, v2, v1

    .line 83
    .line 84
    const/16 v3, 0x8

    .line 85
    .line 86
    ushr-long/2addr p1, v3

    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    :goto_3
    return-void
.end method

.method public final q0(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/m;->t:Ld7/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0xc

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2}, Ld7/s;->Q(IJ)V

    .line 8
    .line 9
    .line 10
    const-wide/16 p1, 0x0

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ld7/m;->r0(J)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0, p1, p2}, Ld7/m;->r0(J)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final r0(J)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ld7/g;->h0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ld7/g;->p:I

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-static {p1, p2}, Ld7/g;->i0(J)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    add-int/lit8 v1, v1, 0x10

    .line 17
    .line 18
    invoke-virtual {p0, v1, p1, p2}, Ld7/s;->Q(IJ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget v2, p0, Ld7/g;->o:I

    .line 27
    .line 28
    const/16 v3, 0x14

    .line 29
    .line 30
    if-lt v0, v3, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v2

    .line 38
    add-int/2addr v0, v3

    .line 39
    const/4 v4, 0x0

    .line 40
    invoke-virtual {p0, v0, v4}, Lr7/b;->M(IZ)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v0, v1, 0x16

    .line 44
    .line 45
    invoke-virtual {p0, v0, v3}, Ld7/s;->R(II)V

    .line 46
    .line 47
    .line 48
    :goto_1
    add-int/lit8 v1, v1, 0x10

    .line 49
    .line 50
    const/4 v0, -0x1

    .line 51
    iget-object v3, p0, Lr7/b;->k:[B

    .line 52
    .line 53
    invoke-static {v3, v1, v0}, Lk7/a;->D([BII)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    add-int/2addr v0, v2

    .line 61
    add-int/lit8 v1, v0, 0x8

    .line 62
    .line 63
    iget-object v2, p0, Lr7/b;->k:[B

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x10

    .line 66
    .line 67
    array-length v3, v2

    .line 68
    if-le v0, v3, :cond_3

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    :goto_2
    if-ge v1, v0, :cond_4

    .line 72
    .line 73
    const-wide/16 v3, 0xff

    .line 74
    .line 75
    and-long/2addr v3, p1

    .line 76
    long-to-int v3, v3

    .line 77
    int-to-byte v3, v3

    .line 78
    aput-byte v3, v2, v1

    .line 79
    .line 80
    const/16 v3, 0x8

    .line 81
    .line 82
    ushr-long/2addr p1, v3

    .line 83
    add-int/lit8 v1, v1, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_3
    return-void
.end method

.method public final s0()V
    .locals 7

    .line 1
    iget-object v0, p0, Ld7/m;->t:Ld7/h;

    .line 2
    .line 3
    iget-object v1, p0, Ld7/g;->q:La5/a;

    .line 4
    .line 5
    iget-object v2, v1, La5/a;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ld7/g;

    .line 8
    .line 9
    iget v1, v1, La5/a;->h:I

    .line 10
    .line 11
    const/4 v3, 0x3

    .line 12
    iget-object v2, v2, Lr7/b;->k:[B

    .line 13
    .line 14
    invoke-static {v2, v1, v3}, Lk7/a;->q([BII)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    const/16 v3, 0xc

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    new-instance v0, Ld7/h;

    .line 28
    .line 29
    sget-object v1, Lc7/g;->j:Lc7/g;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/16 v6, 0x10

    .line 33
    .line 34
    invoke-direct {v0, v6, v1, v5}, Ld7/h;-><init>(ILc7/g;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lr7/b;->p()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-ge v1, v4, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    iget-object v5, v0, Lr7/b;->k:[B

    .line 46
    .line 47
    const v6, 0x8074b50

    .line 48
    .line 49
    .line 50
    invoke-static {v5, v1, v6}, Lk7/a;->D([BII)V

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-virtual {p0}, Ld7/m;->e0()J

    .line 54
    .line 55
    .line 56
    move-result-wide v5

    .line 57
    invoke-virtual {v0, v3, v5, v6}, Ld7/s;->Q(IJ)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ld7/m;->X()J

    .line 61
    .line 62
    .line 63
    move-result-wide v5

    .line 64
    invoke-virtual {v0, v2, v5, v6}, Ld7/s;->Q(IJ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Ld7/m;->Y()J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    invoke-virtual {v0, v4, v1, v2}, Ld7/s;->Q(IJ)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, Ld7/m;->t:Ld7/h;

    .line 75
    .line 76
    const-wide/16 v0, 0x0

    .line 77
    .line 78
    invoke-super {p0, v0, v1}, Ld7/g;->l0(J)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v0, v1}, Ld7/m;->p0(J)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0, v1}, Ld7/m;->r0(J)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    const/4 v1, 0x0

    .line 89
    iput-object v1, p0, Ld7/m;->t:Ld7/h;

    .line 90
    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    invoke-virtual {v0, v4}, Ld7/s;->N(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    invoke-super {p0, v4, v5}, Ld7/g;->l0(J)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v3}, Ld7/s;->N(I)J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    invoke-virtual {p0, v3, v4}, Ld7/m;->r0(J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ld7/s;->N(I)J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    invoke-virtual {p0, v0, v1}, Ld7/m;->p0(J)V

    .line 112
    .line 113
    .line 114
    :cond_2
    return-void
.end method
