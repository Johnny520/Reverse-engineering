.class public final Lp4/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ln4/a;

.field public final b:I

.field public c:Ljava/util/ArrayList;

.field public d:Z

.field public e:Z

.field public f:I

.field public g:I

.field public final h:I


# direct methods
.method public constructor <init>(Ln4/a;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp4/u;->a:Ln4/a;

    .line 5
    .line 6
    iput p3, p0, Lp4/u;->b:I

    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    iput p1, p0, Lp4/u;->f:I

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lp4/u;->d:Z

    .line 20
    .line 21
    iput-boolean p1, p0, Lp4/u;->e:Z

    .line 22
    .line 23
    iput p4, p0, Lp4/u;->h:I

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lp4/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lp4/u;->d:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p1, Lp4/h;->c:Lu4/t;

    .line 11
    .line 12
    iget v0, v0, Lu4/t;->c:I

    .line 13
    .line 14
    if-ltz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lp4/u;->d:Z

    .line 18
    .line 19
    :cond_0
    iget-boolean v0, p0, Lp4/u;->e:Z

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    instance-of p1, p1, Lp4/p;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    throw p1

    .line 30
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 14

    .line 1
    iget-object v0, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lp4/u;->b:I

    .line 8
    .line 9
    iget v2, p0, Lp4/u;->f:I

    .line 10
    .line 11
    add-int/2addr v1, v2

    .line 12
    iget v2, p0, Lp4/u;->g:I

    .line 13
    .line 14
    add-int/2addr v1, v2

    .line 15
    iget v2, p0, Lp4/u;->h:I

    .line 16
    .line 17
    sub-int v2, v1, v2

    .line 18
    .line 19
    new-instance v3, La5/a;

    .line 20
    .line 21
    const/16 v4, 0xb

    .line 22
    .line 23
    invoke-direct {v3, v1, v4}, La5/a;-><init>(II)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    move v5, v4

    .line 28
    :goto_0
    const/4 v6, 0x1

    .line 29
    if-ge v5, v1, :cond_1

    .line 30
    .line 31
    if-lt v5, v2, :cond_0

    .line 32
    .line 33
    add-int/lit8 v7, v5, 0x1

    .line 34
    .line 35
    invoke-virtual {v3, v5, v7, v6}, La5/a;->d(III)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v3, v5, v5, v6}, La5/a;->d(III)V

    .line 40
    .line 41
    .line 42
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    :goto_2
    if-ge v4, v0, :cond_7

    .line 46
    .line 47
    iget-object v1, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lp4/h;

    .line 54
    .line 55
    instance-of v2, v1, Lp4/f;

    .line 56
    .line 57
    if-nez v2, :cond_6

    .line 58
    .line 59
    iget-object v2, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object v5, v1, Lp4/h;->d:Lu4/p;

    .line 62
    .line 63
    iget-object v7, v5, Lz4/e;->h:[Ljava/lang/Object;

    .line 64
    .line 65
    array-length v7, v7

    .line 66
    new-instance v8, Lu4/p;

    .line 67
    .line 68
    invoke-direct {v8, v7}, Lz4/e;-><init>(I)V

    .line 69
    .line 70
    .line 71
    const/4 v9, 0x0

    .line 72
    move v10, v9

    .line 73
    :goto_3
    if-ge v10, v7, :cond_4

    .line 74
    .line 75
    invoke-virtual {v5, v10}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    check-cast v11, Lu4/o;

    .line 80
    .line 81
    if-nez v11, :cond_2

    .line 82
    .line 83
    :goto_4
    const/4 v11, 0x0

    .line 84
    goto :goto_6

    .line 85
    :cond_2
    :try_start_0
    iget-object v12, v3, La5/a;->i:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v12, Lz4/g;

    .line 88
    .line 89
    iget v13, v11, Lu4/o;->g:I

    .line 90
    .line 91
    invoke-virtual {v12, v13}, Lz4/g;->n(I)I

    .line 92
    .line 93
    .line 94
    move-result v12
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    goto :goto_5

    .line 96
    :catch_0
    const/4 v12, -0x1

    .line 97
    :goto_5
    if-ltz v12, :cond_3

    .line 98
    .line 99
    invoke-virtual {v11, v12}, Lu4/o;->o(I)Lu4/o;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    goto :goto_6

    .line 104
    :cond_3
    const-string v11, "no mapping specified for register"

    .line 105
    .line 106
    invoke-static {v11}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :goto_6
    invoke-virtual {v8, v10, v11}, Lz4/e;->m(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v10, v10, 0x1

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_4
    iput-boolean v9, v8, Lz4/j;->g:Z

    .line 117
    .line 118
    invoke-virtual {v8, v5}, Lz4/e;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_5

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_5
    move-object v5, v8

    .line 126
    :goto_7
    invoke-virtual {v1, v5}, Lp4/h;->k(Lu4/p;)Lp4/h;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v2, v4, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    iget v0, p0, Lp4/u;->g:I

    .line 137
    .line 138
    add-int/2addr v0, v6

    .line 139
    iput v0, p0, Lp4/u;->g:I

    .line 140
    .line 141
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    const/4 v2, 0x1

    .line 9
    if-ge v1, v0, :cond_1

    .line 10
    .line 11
    iget-object v3, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lp4/h;

    .line 18
    .line 19
    instance-of v4, v3, Lp4/f;

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    iget-object v4, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Lp4/h;->j(I)Lp4/h;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v4, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget v0, p0, Lp4/u;->f:I

    .line 36
    .line 37
    add-int/2addr v0, v2

    .line 38
    iput v0, p0, Lp4/u;->f:I

    .line 39
    .line 40
    return-void
.end method

.method public final d(Lp4/h;)Lp4/j;
    .locals 4

    .line 1
    iget-object v0, p1, Lp4/h;->d:Lu4/p;

    .line 2
    .line 3
    iget-object v1, p1, Lp4/h;->b:Lp4/j;

    .line 4
    .line 5
    iget-boolean v2, v1, Lp4/j;->e:Z

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-virtual {v0, v2, v3}, Lu4/p;->r(ZLjava/util/BitSet;)Lu4/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, Lp4/h;->k(Lu4/p;)Lp4/h;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0, v1}, Lp4/u;->e(Lp4/h;Lp4/j;)Lp4/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance v0, Le4/a;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v2, "No expanded opcode for "

    .line 28
    .line 29
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {v0, p1, v3}, Lf4/a;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method public final e(Lp4/h;Lp4/j;)Lp4/j;
    .locals 2

    .line 1
    :goto_0
    if-eqz p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p2, Lp4/j;->d:Lf8/i;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lf8/i;->S(Lp4/h;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lp4/u;->a:Ln4/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p2

    .line 17
    :cond_0
    sget-object v0, Lp4/k;->a:[Lp4/j;

    .line 18
    .line 19
    iget p2, p2, Lp4/j;->c:I

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    const/4 v1, 0x0

    .line 23
    if-ne p2, v0, :cond_1

    .line 24
    .line 25
    move-object p2, v1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    add-int/lit8 p2, p2, 0x1

    .line 28
    .line 29
    :try_start_0
    sget-object v0, Lp4/k;->a:[Lp4/j;

    .line 30
    .line 31
    aget-object p2, v0, p2
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    if-eqz p2, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    :cond_2
    const-string p1, "bogus opcode"

    .line 37
    .line 38
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_3
    return-object p2
.end method

.method public final f([Lp4/j;)Z
    .locals 14

    .line 1
    iget v0, p0, Lp4/u;->f:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-gez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    :cond_0
    move v2, v1

    .line 8
    :goto_0
    iget-object v3, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    iget v4, p0, Lp4/u;->f:I

    .line 15
    .line 16
    move v5, v1

    .line 17
    :goto_1
    if-ge v5, v3, :cond_6

    .line 18
    .line 19
    iget-object v6, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lp4/h;

    .line 26
    .line 27
    aget-object v7, p1, v5

    .line 28
    .line 29
    invoke-virtual {p0, v6, v7}, Lp4/u;->e(Lp4/h;Lp4/j;)Lp4/j;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    if-nez v8, :cond_4

    .line 34
    .line 35
    invoke-virtual {p0, v6}, Lp4/u;->d(Lp4/h;)Lp4/j;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    iget-object v7, v7, Lp4/j;->d:Lf8/i;

    .line 40
    .line 41
    invoke-virtual {v7, v6}, Lf8/i;->m(Lp4/h;)Ljava/util/BitSet;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    iget-object v9, v6, Lp4/h;->b:Lp4/j;

    .line 46
    .line 47
    iget-boolean v9, v9, Lp4/j;->e:Z

    .line 48
    .line 49
    iget-object v6, v6, Lp4/h;->d:Lu4/p;

    .line 50
    .line 51
    iget-object v10, v6, Lz4/e;->h:[Ljava/lang/Object;

    .line 52
    .line 53
    array-length v10, v10

    .line 54
    if-eqz v9, :cond_1

    .line 55
    .line 56
    invoke-virtual {v7, v1}, Ljava/util/BitSet;->get(I)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-nez v11, :cond_1

    .line 61
    .line 62
    invoke-virtual {v6, v1}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v11

    .line 66
    check-cast v11, Lu4/o;

    .line 67
    .line 68
    invoke-virtual {v11}, Lu4/o;->j()I

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    goto :goto_2

    .line 73
    :cond_1
    move v11, v1

    .line 74
    :goto_2
    move v12, v1

    .line 75
    :goto_3
    if-ge v9, v10, :cond_3

    .line 76
    .line 77
    invoke-virtual {v7, v9}, Ljava/util/BitSet;->get(I)Z

    .line 78
    .line 79
    .line 80
    move-result v13

    .line 81
    if-nez v13, :cond_2

    .line 82
    .line 83
    invoke-virtual {v6, v9}, Lz4/e;->l(I)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    check-cast v13, Lu4/o;

    .line 88
    .line 89
    invoke-virtual {v13}, Lu4/o;->j()I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    add-int/2addr v12, v13

    .line 94
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-le v6, v4, :cond_5

    .line 102
    .line 103
    move v4, v6

    .line 104
    goto :goto_4

    .line 105
    :cond_4
    if-ne v7, v8, :cond_5

    .line 106
    .line 107
    goto :goto_5

    .line 108
    :cond_5
    :goto_4
    aput-object v8, p1, v5

    .line 109
    .line 110
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_6
    if-lt v0, v4, :cond_7

    .line 114
    .line 115
    iput v0, p0, Lp4/u;->f:I

    .line 116
    .line 117
    return v2

    .line 118
    :cond_7
    sub-int v0, v4, v0

    .line 119
    .line 120
    iget-object v2, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    move v3, v1

    .line 127
    :goto_6
    if-ge v3, v2, :cond_9

    .line 128
    .line 129
    iget-object v5, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    check-cast v5, Lp4/h;

    .line 136
    .line 137
    instance-of v6, v5, Lp4/f;

    .line 138
    .line 139
    if-nez v6, :cond_8

    .line 140
    .line 141
    iget-object v6, p0, Lp4/u;->c:Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {v5, v0}, Lp4/h;->j(I)Lp4/h;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    invoke-virtual {v6, v3, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_9
    const/4 v2, 0x1

    .line 154
    move v0, v4

    .line 155
    goto/16 :goto_0
.end method
