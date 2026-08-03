.class public abstract Ls7/d;
.super Lo7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final m:Lr7/g;

.field public final n:Lo7/c;


# direct methods
.method public constructor <init>(Lr7/f;Lo7/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lo7/b;-><init>(Lk7/f;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Ls7/d;->m:Lr7/g;

    .line 6
    .line 7
    iput-object p2, p0, Ls7/d;->n:Lo7/c;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lr7/f;Lo7/c;Lk7/f;)V
    .locals 0

    .line 10
    invoke-direct {p0, p3}, Lo7/b;-><init>(Lk7/f;)V

    .line 11
    iput-object p1, p0, Ls7/d;->m:Lr7/g;

    .line 12
    iput-object p2, p0, Ls7/d;->n:Lo7/c;

    return-void
.end method


# virtual methods
.method public final B(Lq7/b;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ls7/d;->l0()Lo7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Ls7/d;->m:Lr7/g;

    .line 14
    .line 15
    invoke-interface {v0}, Lr7/g;->get()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v0}, Lq7/b;->g(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {p1, v1}, Lq7/b;->a(I)Lq7/b;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p0, v1}, Ls7/d;->Y(Lq7/b;)V

    .line 31
    .line 32
    .line 33
    iget v2, v1, Lq7/b;->k:I

    .line 34
    .line 35
    add-int/2addr v0, v2

    .line 36
    invoke-virtual {v1}, Lq7/b;->close()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Lq7/b;->g(I)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public V()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ls7/d;->l0()Lo7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lo7/c;->c0(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public X()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lo7/b;->U()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ls7/d;->j0()I

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public Y(Lq7/b;)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Ls7/d;->l0()Lo7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-super {p0, v1, v2}, Lo7/b;->d0(IZ)V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lo7/b;->Q(I)Lk7/a;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lr7/k;

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Lo7/b;->Q(I)Lk7/a;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v3}, Lr7/k;->O()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget v6, v3, Lr7/k;->m:I

    .line 33
    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    iget v7, p1, Lq7/b;->k:I

    .line 37
    .line 38
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    add-int/2addr v8, v7

    .line 43
    if-ltz v6, :cond_0

    .line 44
    .line 45
    if-gt v6, v8, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    const-string p1, "Offset "

    .line 49
    .line 50
    const-string v0, " is out of range "

    .line 51
    .line 52
    invoke-static {v6, p1, v0, v8}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_1
    :goto_1
    invoke-virtual {v4, v5}, Lk7/a;->I(Z)V

    .line 61
    .line 62
    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    iget v5, p1, Lq7/b;->k:I

    .line 66
    .line 67
    invoke-virtual {p1, v6}, Lq7/b;->g(I)V

    .line 68
    .line 69
    .line 70
    :try_start_0
    invoke-virtual {v4, p1}, Lk7/a;->G(Lq7/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    iget v3, p1, Lq7/b;->k:I

    .line 74
    .line 75
    if-ge v3, v5, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1, v5}, Lq7/b;->g(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catch_0
    move-exception p1

    .line 82
    new-instance v0, Ljava/io/IOException;

    .line 83
    .line 84
    invoke-virtual {v3}, Lr7/k;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    new-instance v3, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v4, "Error at:"

    .line 95
    .line 96
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v2, v2, Lk7/e;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    :goto_0
    if-ge v1, v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lk7/e;

    .line 25
    .line 26
    invoke-interface {v2}, Lk7/e;->c()V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final d0(IZ)V
    .locals 0

    .line 1
    const/4 p2, 0x1

    .line 2
    invoke-super {p0, p1, p2}, Lo7/b;->d0(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo7/b;->k:Lz7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz7/c;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public j0()I
    .locals 8

    .line 1
    invoke-virtual {p0}, Ls7/d;->l0()Lo7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lo7/b;->k:Lz7/c;

    .line 6
    .line 7
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lo7/c;->c0(I)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lk7/a;->h:Lk7/a;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ls7/d;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    new-instance v2, Lf6/b;

    .line 26
    .line 27
    invoke-direct {v2, p0}, Lf6/b;-><init>(Lk7/a;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Lk7/a;->z(Lf6/b;)V

    .line 31
    .line 32
    .line 33
    iget v0, v2, Lf6/b;->c:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v0, v1

    .line 37
    :goto_0
    iget-object v2, p0, Ls7/d;->m:Lr7/g;

    .line 38
    .line 39
    invoke-interface {v2, v0}, Lr7/g;->k(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Ls7/d;->l0()Lo7/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v2, p0, Lo7/b;->k:Lz7/c;

    .line 47
    .line 48
    invoke-virtual {v2}, Lz7/c;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v0, v2}, Lo7/c;->c0(I)V

    .line 53
    .line 54
    .line 55
    move v3, v1

    .line 56
    :goto_1
    if-ge v1, v2, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Lr7/k;

    .line 63
    .line 64
    invoke-virtual {p0, v1}, Lo7/b;->Q(I)Lk7/a;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Lk7/a;->y()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    iget v7, v4, Lr7/k;->m:I

    .line 76
    .line 77
    if-eqz v6, :cond_1

    .line 78
    .line 79
    const/4 v5, -0x1

    .line 80
    if-eq v5, v7, :cond_3

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Lr7/k;->S(I)V

    .line 83
    .line 84
    .line 85
    iput v5, v4, Lr7/k;->m:I

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_1
    if-eq v3, v7, :cond_2

    .line 89
    .line 90
    invoke-virtual {v4, v3}, Lr7/k;->S(I)V

    .line 91
    .line 92
    .line 93
    iput v3, v4, Lr7/k;->m:I

    .line 94
    .line 95
    :cond_2
    invoke-virtual {v5}, Lk7/a;->p()I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    add-int/2addr v4, v3

    .line 100
    move v3, v4

    .line 101
    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    invoke-virtual {p0}, Ls7/d;->k0()Lr7/a;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Lr7/a;->N(I)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    add-int/2addr v0, v3

    .line 115
    return v0

    .line 116
    :cond_5
    return v3
.end method

.method public k0()Lr7/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public l0()Lo7/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ls7/d;->n:Lo7/c;

    .line 2
    .line 3
    return-object v0
.end method
