.class public final Lg0/f;
.super Lx1/x0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx1/x0;"
    }
.end annotation


# instance fields
.field public final a:Li2/g;

.field public final b:Li2/n0;

.field public final c:Lm2/d;

.field public final d:Lfg/l;

.field public final e:I

.field public final f:Z

.field public final g:I

.field public final h:I

.field public final i:Ljava/util/List;

.field public final j:Lfg/l;

.field public final k:Lfg/l;


# direct methods
.method public constructor <init>(Li2/g;Li2/n0;Lm2/d;Lfg/l;IZIILjava/util/List;Lfg/l;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg0/f;->a:Li2/g;

    .line 5
    .line 6
    iput-object p2, p0, Lg0/f;->b:Li2/n0;

    .line 7
    .line 8
    iput-object p3, p0, Lg0/f;->c:Lm2/d;

    .line 9
    .line 10
    iput-object p4, p0, Lg0/f;->d:Lfg/l;

    .line 11
    .line 12
    iput p5, p0, Lg0/f;->e:I

    .line 13
    .line 14
    iput-boolean p6, p0, Lg0/f;->f:Z

    .line 15
    .line 16
    iput p7, p0, Lg0/f;->g:I

    .line 17
    .line 18
    iput p8, p0, Lg0/f;->h:I

    .line 19
    .line 20
    iput-object p9, p0, Lg0/f;->i:Ljava/util/List;

    .line 21
    .line 22
    iput-object p10, p0, Lg0/f;->j:Lfg/l;

    .line 23
    .line 24
    iput-object p11, p0, Lg0/f;->k:Lfg/l;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, Lg0/f;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    check-cast p1, Lg0/f;

    .line 12
    .line 13
    iget-object v0, p0, Lg0/f;->a:Li2/g;

    .line 14
    .line 15
    iget-object v1, p1, Lg0/f;->a:Li2/g;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_2
    iget-object v0, p0, Lg0/f;->b:Li2/n0;

    .line 25
    .line 26
    iget-object v1, p1, Lg0/f;->b:Li2/n0;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    iget-object v0, p0, Lg0/f;->i:Ljava/util/List;

    .line 36
    .line 37
    iget-object v1, p1, Lg0/f;->i:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget-object v0, p0, Lg0/f;->c:Lm2/d;

    .line 47
    .line 48
    iget-object v1, p1, Lg0/f;->c:Lm2/d;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_5
    iget-object v0, p0, Lg0/f;->d:Lfg/l;

    .line 58
    .line 59
    iget-object v1, p1, Lg0/f;->d:Lfg/l;

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_6
    iget-object v0, p0, Lg0/f;->k:Lfg/l;

    .line 65
    .line 66
    iget-object v1, p1, Lg0/f;->k:Lfg/l;

    .line 67
    .line 68
    if-eq v0, v1, :cond_7

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_7
    iget v0, p0, Lg0/f;->e:I

    .line 72
    .line 73
    iget v1, p1, Lg0/f;->e:I

    .line 74
    .line 75
    if-ne v0, v1, :cond_c

    .line 76
    .line 77
    iget-boolean v0, p0, Lg0/f;->f:Z

    .line 78
    .line 79
    iget-boolean v1, p1, Lg0/f;->f:Z

    .line 80
    .line 81
    if-eq v0, v1, :cond_8

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_8
    iget v0, p0, Lg0/f;->g:I

    .line 85
    .line 86
    iget v1, p1, Lg0/f;->g:I

    .line 87
    .line 88
    if-eq v0, v1, :cond_9

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_9
    iget v0, p0, Lg0/f;->h:I

    .line 92
    .line 93
    iget v1, p1, Lg0/f;->h:I

    .line 94
    .line 95
    if-eq v0, v1, :cond_a

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_a
    iget-object v0, p0, Lg0/f;->j:Lfg/l;

    .line 99
    .line 100
    iget-object p1, p1, Lg0/f;->j:Lfg/l;

    .line 101
    .line 102
    if-eq v0, p1, :cond_b

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_b
    :goto_0
    const/4 p1, 0x1

    .line 106
    return p1

    .line 107
    :cond_c
    :goto_1
    const/4 p1, 0x0

    .line 108
    return p1
.end method

.method public final f()Ly0/n;
    .locals 2

    .line 1
    new-instance v0, Lg0/j;

    .line 2
    .line 3
    invoke-direct {v0}, Ly0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg0/f;->a:Li2/g;

    .line 7
    .line 8
    iput-object v1, v0, Lg0/j;->u:Li2/g;

    .line 9
    .line 10
    iget-object v1, p0, Lg0/f;->b:Li2/n0;

    .line 11
    .line 12
    iput-object v1, v0, Lg0/j;->v:Li2/n0;

    .line 13
    .line 14
    iget-object v1, p0, Lg0/f;->c:Lm2/d;

    .line 15
    .line 16
    iput-object v1, v0, Lg0/j;->w:Lm2/d;

    .line 17
    .line 18
    iget-object v1, p0, Lg0/f;->d:Lfg/l;

    .line 19
    .line 20
    iput-object v1, v0, Lg0/j;->x:Lfg/l;

    .line 21
    .line 22
    iget v1, p0, Lg0/f;->e:I

    .line 23
    .line 24
    iput v1, v0, Lg0/j;->y:I

    .line 25
    .line 26
    iget-boolean v1, p0, Lg0/f;->f:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Lg0/j;->z:Z

    .line 29
    .line 30
    iget v1, p0, Lg0/f;->g:I

    .line 31
    .line 32
    iput v1, v0, Lg0/j;->A:I

    .line 33
    .line 34
    iget v1, p0, Lg0/f;->h:I

    .line 35
    .line 36
    iput v1, v0, Lg0/j;->B:I

    .line 37
    .line 38
    iget-object v1, p0, Lg0/f;->i:Ljava/util/List;

    .line 39
    .line 40
    iput-object v1, v0, Lg0/j;->C:Ljava/util/List;

    .line 41
    .line 42
    iget-object v1, p0, Lg0/f;->j:Lfg/l;

    .line 43
    .line 44
    iput-object v1, v0, Lg0/j;->D:Lfg/l;

    .line 45
    .line 46
    iget-object v1, p0, Lg0/f;->k:Lfg/l;

    .line 47
    .line 48
    iput-object v1, v0, Lg0/j;->E:Lfg/l;

    .line 49
    .line 50
    return-object v0
.end method

.method public final g(Ly0/n;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lg0/j;

    .line 6
    .line 7
    iget-object v2, v1, Lg0/j;->v:Li2/n0;

    .line 8
    .line 9
    iget-object v3, v0, Lg0/f;->b:Li2/n0;

    .line 10
    .line 11
    if-eq v3, v2, :cond_1

    .line 12
    .line 13
    iget-object v3, v3, Li2/n0;->a:Li2/f0;

    .line 14
    .line 15
    iget-object v2, v2, Li2/n0;->a:Li2/f0;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Li2/f0;->b(Li2/f0;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :goto_0
    const/4 v2, 0x0

    .line 30
    :goto_1
    iget-object v3, v1, Lg0/j;->u:Li2/g;

    .line 31
    .line 32
    iget-object v3, v3, Li2/g;->h:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, v0, Lg0/f;->a:Li2/g;

    .line 35
    .line 36
    iget-object v5, v4, Li2/g;->h:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v3, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    iget-object v5, v1, Lg0/j;->u:Li2/g;

    .line 43
    .line 44
    iget-object v5, v5, Li2/g;->g:Ljava/util/List;

    .line 45
    .line 46
    iget-object v6, v4, Li2/g;->g:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/4 v5, 0x0

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    :goto_2
    const/4 v5, 0x1

    .line 60
    :goto_3
    if-eqz v5, :cond_4

    .line 61
    .line 62
    iput-object v4, v1, Lg0/j;->u:Li2/g;

    .line 63
    .line 64
    :cond_4
    if-nez v3, :cond_5

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    iput-object v3, v1, Lg0/j;->I:Lg0/i;

    .line 68
    .line 69
    :cond_5
    iget-object v3, v1, Lg0/j;->v:Li2/n0;

    .line 70
    .line 71
    iget-object v4, v0, Lg0/f;->b:Li2/n0;

    .line 72
    .line 73
    invoke-virtual {v3, v4}, Li2/n0;->b(Li2/n0;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const/4 v6, 0x1

    .line 78
    xor-int/2addr v3, v6

    .line 79
    iput-object v4, v1, Lg0/j;->v:Li2/n0;

    .line 80
    .line 81
    iget-object v4, v1, Lg0/j;->C:Ljava/util/List;

    .line 82
    .line 83
    iget-object v7, v0, Lg0/f;->i:Ljava/util/List;

    .line 84
    .line 85
    invoke-static {v4, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-nez v4, :cond_6

    .line 90
    .line 91
    iput-object v7, v1, Lg0/j;->C:Ljava/util/List;

    .line 92
    .line 93
    move v3, v6

    .line 94
    :cond_6
    iget v4, v1, Lg0/j;->B:I

    .line 95
    .line 96
    iget v7, v0, Lg0/f;->h:I

    .line 97
    .line 98
    if-eq v4, v7, :cond_7

    .line 99
    .line 100
    iput v7, v1, Lg0/j;->B:I

    .line 101
    .line 102
    move v3, v6

    .line 103
    :cond_7
    iget v4, v1, Lg0/j;->A:I

    .line 104
    .line 105
    iget v7, v0, Lg0/f;->g:I

    .line 106
    .line 107
    if-eq v4, v7, :cond_8

    .line 108
    .line 109
    iput v7, v1, Lg0/j;->A:I

    .line 110
    .line 111
    move v3, v6

    .line 112
    :cond_8
    iget-boolean v4, v1, Lg0/j;->z:Z

    .line 113
    .line 114
    iget-boolean v7, v0, Lg0/f;->f:Z

    .line 115
    .line 116
    if-eq v4, v7, :cond_9

    .line 117
    .line 118
    iput-boolean v7, v1, Lg0/j;->z:Z

    .line 119
    .line 120
    move v3, v6

    .line 121
    :cond_9
    iget-object v4, v1, Lg0/j;->w:Lm2/d;

    .line 122
    .line 123
    iget-object v7, v0, Lg0/f;->c:Lm2/d;

    .line 124
    .line 125
    invoke-static {v4, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v4

    .line 129
    if-nez v4, :cond_a

    .line 130
    .line 131
    iput-object v7, v1, Lg0/j;->w:Lm2/d;

    .line 132
    .line 133
    move v3, v6

    .line 134
    :cond_a
    iget v4, v1, Lg0/j;->y:I

    .line 135
    .line 136
    iget v7, v0, Lg0/f;->e:I

    .line 137
    .line 138
    if-ne v4, v7, :cond_b

    .line 139
    .line 140
    move v6, v3

    .line 141
    goto :goto_4

    .line 142
    :cond_b
    iput v7, v1, Lg0/j;->y:I

    .line 143
    .line 144
    :goto_4
    iget-object v3, v1, Lg0/j;->x:Lfg/l;

    .line 145
    .line 146
    iget-object v4, v0, Lg0/f;->d:Lfg/l;

    .line 147
    .line 148
    const/4 v7, 0x1

    .line 149
    if-eq v3, v4, :cond_c

    .line 150
    .line 151
    iput-object v4, v1, Lg0/j;->x:Lfg/l;

    .line 152
    .line 153
    move v3, v7

    .line 154
    goto :goto_5

    .line 155
    :cond_c
    const/4 v3, 0x0

    .line 156
    :goto_5
    iget-object v4, v1, Lg0/j;->D:Lfg/l;

    .line 157
    .line 158
    iget-object v8, v0, Lg0/f;->j:Lfg/l;

    .line 159
    .line 160
    if-eq v4, v8, :cond_d

    .line 161
    .line 162
    iput-object v8, v1, Lg0/j;->D:Lfg/l;

    .line 163
    .line 164
    move v3, v7

    .line 165
    :cond_d
    iget-object v4, v1, Lg0/j;->E:Lfg/l;

    .line 166
    .line 167
    iget-object v8, v0, Lg0/f;->k:Lfg/l;

    .line 168
    .line 169
    if-eq v4, v8, :cond_e

    .line 170
    .line 171
    iput-object v8, v1, Lg0/j;->E:Lfg/l;

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_e
    move v7, v3

    .line 175
    :goto_6
    if-nez v5, :cond_f

    .line 176
    .line 177
    if-nez v6, :cond_f

    .line 178
    .line 179
    if-eqz v7, :cond_10

    .line 180
    .line 181
    :cond_f
    invoke-virtual {v1}, Lg0/j;->k1()Lg0/d;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    iget-object v9, v1, Lg0/j;->u:Li2/g;

    .line 186
    .line 187
    iget-object v10, v1, Lg0/j;->v:Li2/n0;

    .line 188
    .line 189
    iget-object v11, v1, Lg0/j;->w:Lm2/d;

    .line 190
    .line 191
    iget v12, v1, Lg0/j;->y:I

    .line 192
    .line 193
    iget-boolean v13, v1, Lg0/j;->z:Z

    .line 194
    .line 195
    iget v14, v1, Lg0/j;->A:I

    .line 196
    .line 197
    iget v15, v1, Lg0/j;->B:I

    .line 198
    .line 199
    iget-object v3, v1, Lg0/j;->C:Ljava/util/List;

    .line 200
    .line 201
    move-object/from16 v16, v3

    .line 202
    .line 203
    invoke-virtual/range {v8 .. v16}, Lg0/d;->g(Li2/g;Li2/n0;Lm2/d;IZIILjava/util/List;)V

    .line 204
    .line 205
    .line 206
    :cond_10
    iget-boolean v3, v1, Ly0/n;->t:Z

    .line 207
    .line 208
    if-nez v3, :cond_11

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_11
    if-nez v5, :cond_12

    .line 212
    .line 213
    if-eqz v2, :cond_13

    .line 214
    .line 215
    iget-object v3, v1, Lg0/j;->H:Lg0/h;

    .line 216
    .line 217
    if-eqz v3, :cond_13

    .line 218
    .line 219
    :cond_12
    invoke-static {v1}, Lx1/k;->n(Lx1/z1;)V

    .line 220
    .line 221
    .line 222
    :cond_13
    if-nez v5, :cond_14

    .line 223
    .line 224
    if-nez v6, :cond_14

    .line 225
    .line 226
    if-eqz v7, :cond_15

    .line 227
    .line 228
    :cond_14
    invoke-static {v1}, Lx1/k;->m(Lx1/v;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v1}, Lx1/k;->l(Lx1/m;)V

    .line 232
    .line 233
    .line 234
    :cond_15
    if-eqz v2, :cond_16

    .line 235
    .line 236
    invoke-static {v1}, Lx1/k;->l(Lx1/m;)V

    .line 237
    .line 238
    .line 239
    :cond_16
    :goto_7
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lg0/f;->a:Li2/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Li2/g;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lg0/f;->b:Li2/n0;

    .line 11
    .line 12
    invoke-virtual {v2}, Li2/n0;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lg0/f;->c:Lm2/d;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    const/4 v2, 0x0

    .line 27
    iget-object v3, p0, Lg0/f;->d:Lfg/l;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v3, v2

    .line 37
    :goto_0
    add-int/2addr v0, v3

    .line 38
    mul-int/2addr v0, v1

    .line 39
    iget v3, p0, Lg0/f;->e:I

    .line 40
    .line 41
    invoke-static {v3, v0, v1}, Leh/a;->e(III)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-boolean v3, p0, Lg0/f;->f:Z

    .line 46
    .line 47
    invoke-static {v0, v1, v3}, Leh/a;->h(IIZ)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget v3, p0, Lg0/f;->g:I

    .line 52
    .line 53
    add-int/2addr v0, v3

    .line 54
    mul-int/2addr v0, v1

    .line 55
    iget v3, p0, Lg0/f;->h:I

    .line 56
    .line 57
    add-int/2addr v0, v3

    .line 58
    mul-int/2addr v0, v1

    .line 59
    iget-object v3, p0, Lg0/f;->i:Ljava/util/List;

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move v3, v2

    .line 69
    :goto_1
    add-int/2addr v0, v3

    .line 70
    mul-int/2addr v0, v1

    .line 71
    iget-object v1, p0, Lg0/f;->j:Lfg/l;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    move v1, v2

    .line 81
    :goto_2
    add-int/2addr v0, v1

    .line 82
    mul-int/lit16 v0, v0, 0x745f

    .line 83
    .line 84
    iget-object v1, p0, Lg0/f;->k:Lfg/l;

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    :cond_3
    add-int/2addr v0, v2

    .line 93
    return v0
.end method
