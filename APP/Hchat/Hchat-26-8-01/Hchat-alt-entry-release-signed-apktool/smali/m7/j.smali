.class public final Lm7/j;
.super Lm7/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final M()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    check-cast v0, Lm7/k;

    .line 4
    .line 5
    iget-object v0, v0, Lm7/k;->n:Lm7/t;

    .line 6
    .line 7
    invoke-virtual {v0}, Lm7/t;->Y()V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Lm7/i;->M()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final N()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lm7/j;->R()Ld7/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lo7/b;->N()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 9
    .line 10
    check-cast v0, Lm7/k;

    .line 11
    .line 12
    iget-object v1, v0, Lm7/k;->m:Lm7/v;

    .line 13
    .line 14
    invoke-virtual {v1}, Lo7/b;->N()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lm7/k;->q:Ld7/b;

    .line 18
    .line 19
    invoke-virtual {v1}, Lo7/b;->N()V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, Lm7/k;->n:Lm7/t;

    .line 23
    .line 24
    invoke-virtual {v0}, Lm7/t;->Z()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final R()Ld7/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    check-cast v0, Lm7/k;

    .line 4
    .line 5
    iget-object v0, v0, Lm7/k;->o:Ld7/b;

    .line 6
    .line 7
    return-object v0
.end method

.method public final U(I)Lm7/u;
    .locals 8

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    check-cast v0, Lm7/k;

    .line 4
    .line 5
    iget-object v0, v0, Lm7/k;->m:Lm7/v;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, -0x1

    .line 9
    if-eq p1, v2, :cond_6

    .line 10
    .line 11
    const-class v3, Lm7/j;

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lm7/j;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v4, Lm7/p;

    .line 23
    .line 24
    invoke-direct {v4, v0}, Lm7/p;-><init>(Lm7/j;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Lm7/p;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    sget-object v0, Lz7/h;->g:Lz7/h;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v0, Lz7/f;

    .line 37
    .line 38
    invoke-direct {v0, v4, v3, v1}, Lz7/f;-><init>(Ljava/util/Iterator;Ljava/lang/Class;Lbc/i;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_5

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Lm7/j;

    .line 52
    .line 53
    iget-object v3, v3, Lm7/q;->k:Lk7/c;

    .line 54
    .line 55
    check-cast v3, Lm7/k;

    .line 56
    .line 57
    iget-object v3, v3, Lm7/k;->m:Lm7/v;

    .line 58
    .line 59
    if-ne p1, v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    :cond_2
    move-object v6, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    iget-object v4, v3, Lo7/b;->k:Lz7/c;

    .line 67
    .line 68
    invoke-virtual {v4}, Lz7/c;->size()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x0

    .line 73
    :goto_1
    if-ge v5, v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, v5}, Lo7/b;->Q(I)Lk7/a;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    check-cast v6, Lm7/u;

    .line 80
    .line 81
    iget-object v7, v6, Lm7/b;->p:Lr7/f;

    .line 82
    .line 83
    iget v7, v7, Lr7/f;->n:I

    .line 84
    .line 85
    if-ne p1, v7, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :goto_2
    if-eqz v6, :cond_1

    .line 92
    .line 93
    return-object v6

    .line 94
    :cond_5
    return-object v1

    .line 95
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    return-object v1
.end method

.method public final V()Lm7/t;
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/q;->k:Lk7/c;

    .line 2
    .line 3
    check-cast v0, Lm7/k;

    .line 4
    .line 5
    iget-object v0, v0, Lm7/k;->n:Lm7/t;

    .line 6
    .line 7
    return-object v0
.end method

.method public final W(Ljava/lang/String;)Lm7/c;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lm7/j;->V()Lm7/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lm7/t;->w:Lm7/d;

    .line 6
    .line 7
    iget-object v1, v0, Lo7/b;->k:Lz7/c;

    .line 8
    .line 9
    invoke-virtual {v1}, Lz7/c;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v2

    .line 16
    move-object v5, v3

    .line 17
    :goto_0
    if-ge v4, v1, :cond_b

    .line 18
    .line 19
    invoke-virtual {v0, v4}, Lo7/b;->Q(I)Lk7/a;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    check-cast v6, Lm7/c;

    .line 24
    .line 25
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    sget v7, Lb8/l;->a:I

    .line 29
    .line 30
    const/16 v7, 0x3a

    .line 31
    .line 32
    invoke-virtual {p1, v7}, Ljava/lang/String;->indexOf(I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-lez v7, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    move-object v7, v3

    .line 44
    :goto_1
    if-eqz v7, :cond_2

    .line 45
    .line 46
    invoke-virtual {v6}, Lm7/c;->a0()Lm7/u;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    if-eqz v8, :cond_1

    .line 51
    .line 52
    iget-object v9, v8, Lm7/b;->o:Lr7/f;

    .line 53
    .line 54
    iget v9, v9, Lr7/f;->n:I

    .line 55
    .line 56
    invoke-virtual {v8, v9}, Lm7/b;->V(I)Lr7/o;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    if-eqz v8, :cond_1

    .line 61
    .line 62
    iget-object v8, v8, Lr7/r;->m:Ljava/lang/String;

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    move-object v8, v3

    .line 66
    :goto_2
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-nez v7, :cond_2

    .line 71
    .line 72
    move v7, v2

    .line 73
    goto :goto_7

    .line 74
    :cond_2
    invoke-static {p1}, Lb8/l;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    iget-object v8, v6, Lr7/b;->k:[B

    .line 79
    .line 80
    const/4 v9, 0x4

    .line 81
    invoke-static {v8, v9}, Lk7/a;->s([BI)I

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    invoke-virtual {v6}, Lm7/c;->b0()Lu7/a;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    if-nez v9, :cond_3

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_3
    if-gez v8, :cond_4

    .line 93
    .line 94
    :goto_3
    move-object v8, v3

    .line 95
    goto :goto_4

    .line 96
    :cond_4
    invoke-virtual {v6}, Lm7/c;->b0()Lu7/a;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    if-nez v9, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    invoke-virtual {v9, v8}, Lu7/c;->V(I)Lr7/s;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    :goto_4
    if-nez v8, :cond_6

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    iget-object v9, v8, Lr7/r;->m:Ljava/lang/String;

    .line 111
    .line 112
    if-nez v9, :cond_7

    .line 113
    .line 114
    :goto_5
    move-object v9, v3

    .line 115
    goto :goto_6

    .line 116
    :cond_7
    iget-object v8, v8, Lr7/s;->q:Lr7/u;

    .line 117
    .line 118
    if-nez v8, :cond_8

    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_8
    invoke-virtual {v8, v9, v2}, Lr7/u;->Q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    :goto_6
    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    :goto_7
    if-eqz v7, :cond_a

    .line 130
    .line 131
    invoke-virtual {v6}, Lm7/c;->Z()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_9

    .line 136
    .line 137
    move-object v5, v6

    .line 138
    goto :goto_8

    .line 139
    :cond_9
    return-object v6

    .line 140
    :cond_a
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_b
    return-object v5
.end method

.method public final X(I)Lm7/c;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lm7/j;->V()Lm7/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lm7/t;->w:Lm7/d;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    iget-object v2, v0, Lo7/b;->k:Lz7/c;

    .line 15
    .line 16
    invoke-virtual {v2}, Lz7/c;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    :goto_0
    if-ge v3, v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Lo7/b;->Q(I)Lk7/a;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Lm7/c;

    .line 28
    .line 29
    invoke-virtual {v4}, Lm7/c;->Z()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-ne p1, v5, :cond_1

    .line 34
    .line 35
    return-object v4

    .line 36
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lm7/i;->S()Lm7/i;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lm7/i;->l:Lm7/r;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lm7/r;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lm7/r;-><init>(Lm7/i;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lm7/i;->l:Lm7/r;

    .line 14
    .line 15
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "<"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p0}, Lm7/j;->V()Lm7/t;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, v1}, Lm7/t;->c0(Z)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lm7/q;->k:Lk7/c;

    .line 35
    .line 36
    check-cast v1, Lm7/k;

    .line 37
    .line 38
    iget-object v1, v1, Lm7/k;->m:Lm7/v;

    .line 39
    .line 40
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 41
    .line 42
    invoke-virtual {v1}, Lz7/c;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    const/16 v3, 0x20

    .line 51
    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Ly7/a;->h(Ljava/util/Iterator;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {p0}, Lm7/j;->V()Lm7/t;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v1, v1, Lm7/t;->w:Lm7/d;

    .line 69
    .line 70
    iget-object v1, v1, Lo7/b;->k:Lz7/c;

    .line 71
    .line 72
    invoke-virtual {v1}, Lz7/c;->b()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Ly7/a;->h(Ljava/util/Iterator;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    :cond_2
    const/16 v1, 0x3e

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    return-object v0
.end method
