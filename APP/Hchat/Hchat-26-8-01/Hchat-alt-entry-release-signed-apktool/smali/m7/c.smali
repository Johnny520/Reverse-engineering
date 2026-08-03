.class public final Lm7/c;
.super Lv7/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public o:Lr7/l;

.field public p:Lr7/l;

.field public q:Lr7/l;

.field public r:Lr7/l;

.field public s:Lm7/u;


# virtual methods
.method public final B(Lq7/b;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lv7/j0;->B(Lq7/b;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv7/j0;->T()Lv7/k0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget-object v0, Lv7/k0;->u:Lv7/k0;

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-boolean v0, p1, Lu7/c;->s:Z

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Lv7/j0;->U(Lu7/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {p0}, Lv7/j0;->W()V

    .line 28
    .line 29
    .line 30
    :cond_2
    :goto_0
    iget-object p1, p0, Lm7/c;->o:Lr7/l;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lm7/c;->e0(Lr7/m;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-virtual {p0, p1}, Lm7/c;->c0(I)Lr7/l;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lm7/c;->o:Lr7/l;

    .line 41
    .line 42
    iget-object p1, p0, Lm7/c;->p:Lr7/l;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lm7/c;->e0(Lr7/m;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x4

    .line 48
    invoke-virtual {p0, p1}, Lm7/c;->c0(I)Lr7/l;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lm7/c;->p:Lr7/l;

    .line 53
    .line 54
    iget-object v0, p0, Lm7/c;->r:Lr7/l;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lm7/c;->e0(Lr7/m;)V

    .line 57
    .line 58
    .line 59
    const/16 v0, 0x8

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lm7/c;->c0(I)Lr7/l;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lm7/c;->r:Lr7/l;

    .line 66
    .line 67
    iget-object v0, p0, Lr7/b;->k:[B

    .line 68
    .line 69
    invoke-static {v0, p1}, Lk7/a;->s([BI)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/4 v1, 0x0

    .line 74
    if-gez v0, :cond_3

    .line 75
    .line 76
    :goto_1
    move-object v0, v1

    .line 77
    goto :goto_2

    .line 78
    :cond_3
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-nez v2, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_4
    invoke-virtual {v2, v0}, Lu7/c;->V(I)Lr7/s;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :goto_2
    check-cast v0, Lr7/o;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    iget-object v0, v0, Lr7/o;->t:Lr7/n;

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    move-object v0, v1

    .line 97
    :goto_3
    if-nez v0, :cond_6

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_6
    iget-object v2, p0, Lm7/c;->q:Lr7/l;

    .line 101
    .line 102
    if-eqz v2, :cond_8

    .line 103
    .line 104
    iget-object v2, v0, Lr7/n;->o:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-static {v2}, Ly7/a;->g(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_8

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    check-cast v3, Lr7/m;

    .line 121
    .line 122
    const-class v4, Lm7/c;

    .line 123
    .line 124
    invoke-interface {v3, v4}, Lr7/m;->d(Ljava/lang/Class;)Lk7/a;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    if-ne v3, p0, :cond_7

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    invoke-virtual {p0, v0}, Lm7/c;->d0(Lr7/n;)V

    .line 132
    .line 133
    .line 134
    new-instance v2, Lr7/l;

    .line 135
    .line 136
    invoke-direct {v2, p0, p1}, Lr7/l;-><init>(Lr7/b;I)V

    .line 137
    .line 138
    .line 139
    iget-object p1, v0, Lr7/n;->o:Ljava/lang/Object;

    .line 140
    .line 141
    invoke-static {p1, v2}, Ly7/a;->a(Ljava/lang/Object;Lr7/m;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iput-object p1, v0, Lr7/n;->o:Ljava/lang/Object;

    .line 146
    .line 147
    iput-object v2, p0, Lm7/c;->q:Lr7/l;

    .line 148
    .line 149
    :goto_4
    iget-object p1, p0, Lm7/c;->s:Lm7/u;

    .line 150
    .line 151
    if-nez p1, :cond_9

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_9
    iput-object v1, p0, Lm7/c;->s:Lm7/u;

    .line 155
    .line 156
    iget-object p1, p1, Lm7/u;->q:Ljava/util/HashSet;

    .line 157
    .line 158
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    :goto_5
    invoke-virtual {p0}, Lm7/c;->a0()Lm7/u;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    if-nez p1, :cond_a

    .line 166
    .line 167
    return-void

    .line 168
    :cond_a
    iput-object p1, p0, Lm7/c;->s:Lm7/u;

    .line 169
    .line 170
    iget-object p1, p1, Lm7/u;->q:Ljava/util/HashSet;

    .line 171
    .line 172
    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    return-void
.end method

.method public final P()Ll7/g;
    .locals 2

    .line 1
    const-class v0, Lm7/j;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lm7/j;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-class v1, Lm7/f;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lm7/f;

    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public final V(Lv7/h0;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lm7/c;->e0(Lr7/m;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Z()I
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    :goto_0
    move-object v0, v1

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {v2, v0}, Lu7/c;->V(I)Lr7/s;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_1
    check-cast v0, Lr7/o;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    iget-object v1, v0, Lr7/o;->t:Lr7/n;

    .line 29
    .line 30
    :cond_2
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iget v0, v1, Lr7/f;->n:I

    .line 33
    .line 34
    return v0

    .line 35
    :cond_3
    const/4 v0, 0x0

    .line 36
    return v0
.end method

.method public final a0()Lm7/u;
    .locals 3

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lm7/c;->s:Lm7/u;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v2, v1, Lm7/b;->p:Lr7/f;

    .line 16
    .line 17
    iget v2, v2, Lr7/f;->n:I

    .line 18
    .line 19
    if-ne v2, v0, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    const-class v1, Lm7/j;

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lm7/j;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lm7/j;->U(I)Lm7/u;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_2
    :goto_0
    const/4 v0, 0x0

    .line 38
    return-object v0
.end method

.method public final b0()Lu7/a;
    .locals 2

    .line 1
    invoke-super {p0}, Lv7/j0;->g()Lu7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lu7/a;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lu7/a;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final c0(I)Lr7/l;
    .locals 2

    .line 1
    if-gez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v1, p0, Lr7/b;->k:[B

    .line 12
    .line 13
    invoke-static {v1, p1}, Lk7/a;->s([BI)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1}, Lu7/c;->V(I)Lr7/s;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    :goto_0
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_2
    new-instance v1, Lr7/l;

    .line 26
    .line 27
    invoke-direct {v1, p0, p1}, Lr7/l;-><init>(Lr7/b;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lr7/s;->P(Lr7/m;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 6

    .line 1
    check-cast p1, Lm7/c;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm7/c;->Z()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p1}, Lm7/c;->Z()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    if-nez v1, :cond_1

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 p1, -0x1

    .line 22
    return p1

    .line 23
    :cond_1
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_2
    iget-object v0, p0, Lr7/b;->k:[B

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    if-nez v2, :cond_3

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    if-gez v0, :cond_4

    .line 47
    .line 48
    :goto_0
    move-object v0, v4

    .line 49
    goto :goto_1

    .line 50
    :cond_4
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    invoke-virtual {v2, v0}, Lu7/c;->V(I)Lr7/s;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_1
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_6
    iget-object v2, v0, Lr7/r;->m:Ljava/lang/String;

    .line 65
    .line 66
    if-nez v2, :cond_7

    .line 67
    .line 68
    :goto_2
    move-object v2, v4

    .line 69
    goto :goto_3

    .line 70
    :cond_7
    iget-object v0, v0, Lr7/s;->q:Lr7/u;

    .line 71
    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_8
    invoke-virtual {v0, v2, v3}, Lr7/u;->Q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    :goto_3
    const-string v0, ""

    .line 80
    .line 81
    if-nez v2, :cond_9

    .line 82
    .line 83
    move-object v2, v0

    .line 84
    :cond_9
    iget-object v5, p1, Lr7/b;->k:[B

    .line 85
    .line 86
    invoke-static {v5, v1}, Lk7/a;->s([BI)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {p1}, Lm7/c;->b0()Lu7/a;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-nez v5, :cond_a

    .line 95
    .line 96
    goto :goto_6

    .line 97
    :cond_a
    if-gez v1, :cond_b

    .line 98
    .line 99
    :goto_4
    move-object p1, v4

    .line 100
    goto :goto_5

    .line 101
    :cond_b
    invoke-virtual {p1}, Lm7/c;->b0()Lu7/a;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-nez p1, :cond_c

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_c
    invoke-virtual {p1, v1}, Lu7/c;->V(I)Lr7/s;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    :goto_5
    if-nez p1, :cond_d

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_d
    iget-object v1, p1, Lr7/r;->m:Ljava/lang/String;

    .line 116
    .line 117
    if-nez v1, :cond_e

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_e
    iget-object p1, p1, Lr7/s;->q:Lr7/u;

    .line 121
    .line 122
    if-nez p1, :cond_f

    .line 123
    .line 124
    move-object v4, v1

    .line 125
    goto :goto_6

    .line 126
    :cond_f
    invoke-virtual {p1, v1, v3}, Lr7/u;->Q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    :goto_6
    if-nez v4, :cond_10

    .line 131
    .line 132
    goto :goto_7

    .line 133
    :cond_10
    move-object v0, v4

    .line 134
    :goto_7
    invoke-virtual {v2, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    return p1
.end method

.method public final d0(Lr7/n;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lm7/c;->q:Lr7/l;

    .line 2
    .line 3
    if-eqz v0, :cond_b

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_3

    .line 8
    .line 9
    :cond_0
    iget-object v1, p1, Lr7/n;->o:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ly7/a;->i(Ljava/lang/Object;Lr7/m;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p1, Lr7/n;->o:Ljava/lang/Object;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lm7/c;->q:Lr7/l;

    .line 19
    .line 20
    invoke-virtual {p1}, Lr7/n;->O()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_1
    const-class v1, Lm7/j;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lk7/a;->u(Ljava/lang/Class;)Lk7/a;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lm7/j;

    .line 35
    .line 36
    const-class v2, Lm7/f;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lm7/f;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v1, v1, Lm7/q;->k:Lk7/c;

    .line 49
    .line 50
    check-cast v1, Lm7/g;

    .line 51
    .line 52
    iget-object v1, v1, Lm7/g;->p:Lm7/n;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v1, v0

    .line 56
    :goto_0
    if-nez v1, :cond_3

    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_3
    iget-object v3, p1, Lk7/a;->h:Lk7/a;

    .line 61
    .line 62
    if-eqz v3, :cond_b

    .line 63
    .line 64
    iget v3, p1, Lk7/a;->g:I

    .line 65
    .line 66
    if-ltz v3, :cond_b

    .line 67
    .line 68
    invoke-virtual {p1}, Lr7/n;->O()Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    invoke-virtual {p1}, Lr7/n;->N()Lr7/o;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-eqz v3, :cond_b

    .line 80
    .line 81
    iget-object v4, v3, Lk7/a;->h:Lk7/a;

    .line 82
    .line 83
    if-eqz v4, :cond_b

    .line 84
    .line 85
    iget v4, v3, Lk7/a;->g:I

    .line 86
    .line 87
    if-ltz v4, :cond_b

    .line 88
    .line 89
    iget-object v4, v3, Lr7/s;->p:Ljava/lang/Object;

    .line 90
    .line 91
    new-instance v5, Lce/n;

    .line 92
    .line 93
    const/16 v6, 0x19

    .line 94
    .line 95
    invoke-direct {v5, v6}, Lce/n;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v4}, Ly7/a;->g(Ljava/lang/Object;)Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-nez v6, :cond_5

    .line 107
    .line 108
    sget-object v4, Lz7/h;->g:Lz7/h;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_5
    new-instance v6, Lz7/k;

    .line 112
    .line 113
    invoke-direct {v6, v4, v5}, Lz7/k;-><init>(Ljava/util/Iterator;Ljava/util/function/Predicate;)V

    .line 114
    .line 115
    .line 116
    move-object v4, v6

    .line 117
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    const/4 v5, 0x0

    .line 122
    if-eqz v4, :cond_6

    .line 123
    .line 124
    const/4 v4, 0x1

    .line 125
    goto :goto_2

    .line 126
    :cond_6
    iget-object v4, v3, Lr7/o;->t:Lr7/n;

    .line 127
    .line 128
    if-eqz v4, :cond_7

    .line 129
    .line 130
    invoke-virtual {v4}, Lr7/n;->O()Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    goto :goto_2

    .line 135
    :cond_7
    move v4, v5

    .line 136
    :goto_2
    if-eqz v4, :cond_8

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    invoke-virtual {v1, v2}, Lk7/a;->v(Ljava/lang/Class;)Lk7/a;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, Lm7/f;

    .line 144
    .line 145
    if-eqz v2, :cond_9

    .line 146
    .line 147
    iget-object v0, v2, Lm7/q;->k:Lk7/c;

    .line 148
    .line 149
    check-cast v0, Lm7/g;

    .line 150
    .line 151
    iget-object v0, v0, Lm7/g;->o:Lu7/a;

    .line 152
    .line 153
    :cond_9
    if-nez v0, :cond_a

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_a
    invoke-virtual {p1, v5}, Lr7/f;->k(I)V

    .line 157
    .line 158
    .line 159
    iget-object v1, v1, Lm7/n;->o:Ls7/f;

    .line 160
    .line 161
    invoke-virtual {v1, p1}, Lo7/b;->a0(Lk7/a;)V

    .line 162
    .line 163
    .line 164
    iget-object p1, v0, Lu7/c;->p:Ls7/g;

    .line 165
    .line 166
    invoke-virtual {p1, v3}, Lo7/b;->a0(Lk7/a;)V

    .line 167
    .line 168
    .line 169
    :cond_b
    :goto_3
    return-void
.end method

.method public final e0(Lr7/m;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    invoke-virtual {v0, p1}, Lu7/c;->b0(Lr7/m;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final bridge synthetic g()Lu7/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    if-gez v0, :cond_1

    .line 17
    .line 18
    :goto_0
    move-object v0, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {p0}, Lm7/c;->b0()Lu7/a;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-virtual {v1, v0}, Lu7/c;->V(I)Lr7/s;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_1
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    iget-object v1, v0, Lr7/r;->m:Ljava/lang/String;

    .line 35
    .line 36
    if-nez v1, :cond_4

    .line 37
    .line 38
    :goto_2
    move-object v1, v2

    .line 39
    goto :goto_3

    .line 40
    :cond_4
    iget-object v0, v0, Lr7/s;->q:Lr7/u;

    .line 41
    .line 42
    if-nez v0, :cond_5

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_5
    const/4 v3, 0x0

    .line 46
    invoke-virtual {v0, v1, v3}, Lr7/u;->Q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :goto_3
    const/4 v0, 0x1

    .line 51
    if-eqz v1, :cond_8

    .line 52
    .line 53
    invoke-virtual {p0}, Lm7/c;->a0()Lm7/u;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    if-eqz v3, :cond_6

    .line 58
    .line 59
    iget-object v4, v3, Lm7/b;->o:Lr7/f;

    .line 60
    .line 61
    iget v4, v4, Lr7/f;->n:I

    .line 62
    .line 63
    invoke-virtual {v3, v4}, Lm7/b;->V(I)Lr7/o;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    if-eqz v3, :cond_6

    .line 68
    .line 69
    iget-object v2, v3, Lr7/r;->m:Ljava/lang/String;

    .line 70
    .line 71
    :cond_6
    if-nez v2, :cond_7

    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_7
    const-string v3, ":"

    .line 75
    .line 76
    invoke-static {v2, v3, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_8
    :goto_4
    const/4 v2, 0x0

    .line 81
    const/16 v3, 0x8

    .line 82
    .line 83
    if-eqz v1, :cond_f

    .line 84
    .line 85
    invoke-virtual {p0}, Lm7/c;->Z()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_9

    .line 90
    .line 91
    const-string v5, "(@"

    .line 92
    .line 93
    invoke-static {v1, v5}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v4, v3}, Ly7/a;->k(II)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v4, ")"

    .line 105
    .line 106
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_9
    invoke-virtual {p0}, Lv7/j0;->T()Lv7/k0;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    sget-object v5, Lv7/k0;->u:Lv7/k0;

    .line 118
    .line 119
    const-string v6, "["

    .line 120
    .line 121
    if-ne v4, v5, :cond_a

    .line 122
    .line 123
    invoke-virtual {p0}, Lv7/j0;->S()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    goto :goto_6

    .line 128
    :cond_a
    sget-object v5, Lv7/k0;->p:Lv7/k0;

    .line 129
    .line 130
    if-ne v4, v5, :cond_c

    .line 131
    .line 132
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_b

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_b
    move v0, v2

    .line 140
    :goto_5
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    goto :goto_6

    .line 145
    :cond_c
    sget-object v0, Lv7/k0;->n:Lv7/k0;

    .line 146
    .line 147
    if-ne v4, v0, :cond_d

    .line 148
    .line 149
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    goto :goto_6

    .line 158
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v2, "] "

    .line 167
    .line 168
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    invoke-static {v2, v3}, Ly7/a;->k(II)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    :goto_6
    const-string v2, "\""

    .line 187
    .line 188
    if-eqz v0, :cond_e

    .line 189
    .line 190
    const-string v3, "=\""

    .line 191
    .line 192
    invoke-static {v1, v3, v0, v2}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    return-object v0

    .line 197
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v1, "]=\""

    .line 212
    .line 213
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    return-object v0

    .line 231
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-class v1, Lm7/c;

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v1, ": "

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    iget v1, p0, Lk7/a;->g:I

    .line 251
    .line 252
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-string v1, "{NamespaceReference="

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    iget-object v1, p0, Lr7/b;->k:[B

    .line 261
    .line 262
    invoke-static {v1, v2}, Lk7/a;->s([BI)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string v1, ", NameReference="

    .line 270
    .line 271
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    iget-object v1, p0, Lr7/b;->k:[B

    .line 275
    .line 276
    const/4 v2, 0x4

    .line 277
    invoke-static {v1, v2}, Lk7/a;->s([BI)I

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v1, ", ValueStringReference="

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    iget-object v1, p0, Lr7/b;->k:[B

    .line 290
    .line 291
    invoke-static {v1, v3}, Lk7/a;->s([BI)I

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const-string v1, ", ValueSize="

    .line 299
    .line 300
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {p0}, Lv7/j0;->Q()I

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string v1, ", ValueTypeByte="

    .line 311
    .line 312
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Lv7/j0;->R()B

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    and-int/lit16 v1, v1, 0xff

    .line 320
    .line 321
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    const-string v1, ", Data="

    .line 325
    .line 326
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v1, "}"

    .line 337
    .line 338
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    return-object v0
.end method
