.class public abstract Lv7/j0;
.super Lr7/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public m:Lv7/h0;

.field public final n:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lr7/b;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lv7/j0;->n:I

    .line 5
    .line 6
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sub-int/2addr p1, p2

    .line 11
    iget-object v0, p0, Lr7/b;->k:[B

    .line 12
    .line 13
    int-to-short p1, p1

    .line 14
    invoke-static {v0, p2, p1}, Lk7/a;->F([BIS)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public B(Lq7/b;)V
    .locals 5

    .line 1
    iget v0, p1, Lq7/b;->k:I

    .line 2
    .line 3
    iget v1, p0, Lv7/j0;->n:I

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Lq7/b;->c(I)V

    .line 6
    .line 7
    .line 8
    const v2, 0xffff

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lq7/b;->readShort()S

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    and-int/2addr v2, v3

    .line 16
    const/16 v3, 0x8

    .line 17
    .line 18
    if-ge v2, v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lq7/b;->available()I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-lt v4, v3, :cond_0

    .line 25
    .line 26
    move v4, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v4, v2

    .line 29
    :goto_0
    invoke-virtual {p1, v0}, Lq7/b;->g(I)V

    .line 30
    .line 31
    .line 32
    add-int/2addr v4, v1

    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, v4, v0}, Lr7/b;->M(IZ)V

    .line 35
    .line 36
    .line 37
    invoke-super {p0, p1}, Lr7/b;->B(Lq7/b;)V

    .line 38
    .line 39
    .line 40
    if-ge v2, v3, :cond_1

    .line 41
    .line 42
    add-int/lit8 p1, v1, 0x8

    .line 43
    .line 44
    invoke-virtual {p0, p1, v0}, Lr7/b;->M(IZ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    sub-int/2addr p1, v1

    .line 52
    iget-object v0, p0, Lr7/b;->k:[B

    .line 53
    .line 54
    int-to-short p1, p1

    .line 55
    invoke-static {v0, v1, p1}, Lk7/a;->F([BIS)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public N()Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p0}, Lv7/j0;->T()Lv7/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_4

    .line 9
    .line 10
    :cond_0
    sget-object v2, Lv7/k0;->w:Lv7/k0;

    .line 11
    .line 12
    sget-object v3, Lv7/k0;->v:Lv7/k0;

    .line 13
    .line 14
    sget-object v4, Lv7/k0;->j:Lv7/k0;

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    const-string v6, "?null"

    .line 18
    .line 19
    const-string v7, "@null"

    .line 20
    .line 21
    sget-object v8, Lv7/k0;->i:Lv7/k0;

    .line 22
    .line 23
    if-eq v0, v8, :cond_c

    .line 24
    .line 25
    if-eq v0, v4, :cond_c

    .line 26
    .line 27
    if-eq v0, v3, :cond_c

    .line 28
    .line 29
    if-ne v0, v2, :cond_1

    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_1
    sget-object v2, Lv7/k0;->u:Lv7/k0;

    .line 33
    .line 34
    if-ne v0, v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Lv7/j0;->S()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :cond_2
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    sget-object v3, Ln7/g;->a:Ljava/util/HashMap;

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    if-eq v2, v5, :cond_4

    .line 50
    .line 51
    :cond_3
    :goto_0
    move-object v7, v1

    .line 52
    goto :goto_2

    .line 53
    :cond_4
    sget-object v3, Lv7/k0;->h:Lv7/k0;

    .line 54
    .line 55
    if-ne v0, v3, :cond_6

    .line 56
    .line 57
    if-nez v2, :cond_5

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_5
    const-string v7, "@empty"

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_6
    if-eqz v2, :cond_7

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_7
    if-ne v0, v4, :cond_9

    .line 67
    .line 68
    if-nez v2, :cond_8

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_8
    move-object v6, v1

    .line 72
    :goto_1
    move-object v7, v6

    .line 73
    goto :goto_2

    .line 74
    :cond_9
    if-ne v0, v8, :cond_3

    .line 75
    .line 76
    if-nez v2, :cond_3

    .line 77
    .line 78
    :goto_2
    if-eqz v7, :cond_a

    .line 79
    .line 80
    return-object v7

    .line 81
    :cond_a
    sget-object v3, Ln7/g;->a:Ljava/util/HashMap;

    .line 82
    .line 83
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Ln7/a;

    .line 88
    .line 89
    if-nez v0, :cond_b

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_b
    invoke-virtual {v0, v2}, Ln7/a;->a(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :cond_c
    :goto_3
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-nez v9, :cond_10

    .line 102
    .line 103
    sget-object v2, Ln7/g;->a:Ljava/util/HashMap;

    .line 104
    .line 105
    if-nez v9, :cond_f

    .line 106
    .line 107
    if-ne v0, v8, :cond_d

    .line 108
    .line 109
    if-nez v9, :cond_e

    .line 110
    .line 111
    return-object v7

    .line 112
    :cond_d
    if-nez v9, :cond_e

    .line 113
    .line 114
    return-object v6

    .line 115
    :cond_e
    :goto_4
    return-object v1

    .line 116
    :cond_f
    throw v1

    .line 117
    :cond_10
    invoke-virtual {p0}, Lv7/j0;->T()Lv7/k0;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    if-eqz v6, :cond_12

    .line 122
    .line 123
    if-eq v6, v8, :cond_11

    .line 124
    .line 125
    if-eq v6, v4, :cond_11

    .line 126
    .line 127
    if-eq v6, v3, :cond_11

    .line 128
    .line 129
    if-ne v6, v2, :cond_12

    .line 130
    .line 131
    :cond_11
    invoke-virtual {p0}, Lv7/j0;->i()Ll7/f;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    if-nez v2, :cond_13

    .line 136
    .line 137
    :cond_12
    move-object v4, v1

    .line 138
    goto :goto_5

    .line 139
    :cond_13
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    invoke-virtual {v2, v3}, Ll7/f;->W(I)Lt7/b;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    if-nez v4, :cond_14

    .line 148
    .line 149
    invoke-virtual {v2}, Ll7/f;->Y()Ll7/l;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    if-eqz v6, :cond_14

    .line 154
    .line 155
    invoke-virtual {v6, v2, v3}, Ll7/l;->X(Ll7/f;I)Lt7/b;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    :cond_14
    :goto_5
    if-nez v4, :cond_16

    .line 160
    .line 161
    invoke-virtual {p0}, Lv7/j0;->i()Ll7/f;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    if-eqz v2, :cond_15

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_15
    const-string v0, "Parent package block is null"

    .line 169
    .line 170
    invoke-static {v0}, Lbsh/j;->c(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-object v1

    .line 174
    :cond_16
    :goto_6
    if-eqz v4, :cond_17

    .line 175
    .line 176
    invoke-virtual {v4}, Lt7/b;->b()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    if-eqz v1, :cond_17

    .line 181
    .line 182
    invoke-virtual {p0}, Lv7/j0;->i()Ll7/f;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v4, v1, v0}, Lt7/b;->a(Ll7/f;Lv7/k0;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    return-object v0

    .line 191
    :cond_17
    if-ne v0, v8, :cond_18

    .line 192
    .line 193
    goto :goto_7

    .line 194
    :cond_18
    const/4 v5, 0x0

    .line 195
    :goto_7
    sget-object v0, Ln7/g;->a:Ljava/util/HashMap;

    .line 196
    .line 197
    if-eqz v5, :cond_19

    .line 198
    .line 199
    const-string v0, "@0x"

    .line 200
    .line 201
    invoke-static {v9, v0}, Ly7/a;->p(ILjava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    return-object v0

    .line 206
    :cond_19
    const-string v0, "?0x"

    .line 207
    .line 208
    invoke-static {v9, v0}, Ly7/a;->p(ILjava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0
.end method

.method public O()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    iget v1, p0, Lv7/j0;->n:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x4

    .line 6
    .line 7
    invoke-static {v0, v1}, Lk7/a;->s([BI)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public abstract P()Ll7/g;
.end method

.method public Q()I
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    iget v1, p0, Lv7/j0;->n:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lk7/a;->w([BI)S

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const v1, 0xffff

    .line 10
    .line 11
    .line 12
    and-int/2addr v0, v1

    .line 13
    return v0
.end method

.method public R()B
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    iget v1, p0, Lv7/j0;->n:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x3

    .line 6
    .line 7
    aget-byte v0, v0, v1

    .line 8
    .line 9
    return v0
.end method

.method public final S()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lv7/j0;->T()Lv7/k0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lv7/k0;->u:Lv7/k0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    :goto_0
    move-object v0, v2

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lv7/j0;->g()Lu7/c;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-virtual {v0, v1}, Lu7/c;->V(I)Lr7/s;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_1
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {v0}, Lr7/s;->Y()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    const-string v0, ""

    .line 36
    .line 37
    :cond_2
    return-object v0

    .line 38
    :cond_3
    return-object v2
.end method

.method public final T()Lv7/k0;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lv7/j0;->R()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    sget-object v1, Lv7/k0;->x:[Lv7/k0;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    const-class v1, Lv7/k0;

    .line 16
    .line 17
    monitor-enter v1

    .line 18
    const/16 v2, 0x20

    .line 19
    .line 20
    :try_start_0
    new-array v2, v2, [Lv7/k0;

    .line 21
    .line 22
    invoke-static {}, Lv7/k0;->values()[Lv7/k0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    array-length v4, v3

    .line 27
    const/4 v5, 0x0

    .line 28
    :goto_0
    if-ge v5, v4, :cond_2

    .line 29
    .line 30
    aget-object v6, v3, v5

    .line 31
    .line 32
    iget-byte v7, v6, Lv7/k0;->g:B

    .line 33
    .line 34
    and-int/lit16 v7, v7, 0xff

    .line 35
    .line 36
    aput-object v6, v2, v7

    .line 37
    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    sput-object v2, Lv7/k0;->x:[Lv7/k0;

    .line 44
    .line 45
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    move-object v1, v2

    .line 47
    :goto_1
    array-length v2, v1

    .line 48
    if-ge v0, v2, :cond_3

    .line 49
    .line 50
    aget-object v0, v1, v0

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_3
    :goto_2
    const/4 v0, 0x0

    .line 54
    return-object v0

    .line 55
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw v0
.end method

.method public final U(Lu7/c;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Lu7/c;->V(I)Lr7/s;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lv7/j0;->W()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, Lv7/j0;->m:Lv7/h0;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lv7/j0;->W()V

    .line 20
    .line 21
    .line 22
    :cond_1
    new-instance v0, Lv7/h0;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, v1}, Lv7/h0;-><init>(Lr7/b;I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lv7/j0;->m:Lv7/h0;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lr7/s;->P(Lr7/m;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public V(Lv7/h0;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv7/j0;->g()Lu7/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Lu7/c;->b0(Lr7/m;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final W()V
    .locals 2

    .line 1
    iget-object v0, p0, Lv7/j0;->m:Lv7/h0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lv7/j0;->m:Lv7/h0;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lv7/j0;->V(Lv7/h0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public X(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr7/b;->k:[B

    .line 2
    .line 3
    iget v1, p0, Lv7/j0;->n:I

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x4

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Lk7/a;->D([BII)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g()Lu7/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lk7/a;->h:Lk7/a;

    .line 2
    .line 3
    :goto_0
    if-eqz v0, :cond_1

    .line 4
    .line 5
    instance-of v1, v0, Ll7/b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ll7/b;

    .line 10
    .line 11
    invoke-interface {v0}, Ll7/b;->g()Lu7/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, v0, Lk7/a;->h:Lk7/a;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public final i()Ll7/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv7/j0;->P()Ll7/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Ll7/g;->i()Ll7/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lv7/j0;->i()Ll7/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lv7/j0;->T()Lv7/k0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, ":"

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v2, v1}, Ly7/a;->k(II)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, " "

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lv7/j0;->N()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lv7/j0;->Q()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eq v2, v1, :cond_1

    .line 64
    .line 65
    const-string v2, "size="

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lv7/j0;->Q()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, ", "

    .line 78
    .line 79
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_1
    const-string v2, "type="

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lv7/j0;->T()Lv7/k0;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-eqz v2, :cond_2

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    invoke-virtual {p0}, Lv7/j0;->R()B

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    invoke-static {v3}, Ly7/a;->n(B)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string v3, ", data="

    .line 109
    .line 110
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    sget-object v4, Lv7/k0;->u:Lv7/k0;

    .line 118
    .line 119
    if-ne v2, v4, :cond_8

    .line 120
    .line 121
    invoke-virtual {p0}, Lv7/j0;->T()Lv7/k0;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const/4 v5, 0x0

    .line 126
    if-eq v2, v4, :cond_3

    .line 127
    .line 128
    :goto_1
    move-object v2, v5

    .line 129
    goto :goto_2

    .line 130
    :cond_3
    invoke-virtual {p0}, Lv7/j0;->g()Lu7/c;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-nez v2, :cond_4

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    invoke-virtual {p0}, Lv7/j0;->O()I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-virtual {v2, v4}, Lu7/c;->V(I)Lr7/s;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    :goto_2
    if-eqz v2, :cond_7

    .line 146
    .line 147
    iget-object v1, v2, Lr7/r;->m:Ljava/lang/String;

    .line 148
    .line 149
    if-nez v1, :cond_5

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    iget-object v2, v2, Lr7/s;->q:Lr7/u;

    .line 153
    .line 154
    if-nez v2, :cond_6

    .line 155
    .line 156
    move-object v5, v1

    .line 157
    goto :goto_3

    .line 158
    :cond_6
    const/4 v3, 0x0

    .line 159
    invoke-virtual {v2, v1, v3}, Lr7/u;->Q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    :goto_3
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_7
    invoke-static {v3, v1}, Ly7/a;->k(II)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_8
    invoke-static {v3, v1}, Ly7/a;->k(II)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    :goto_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0
.end method
