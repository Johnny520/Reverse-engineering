.class public abstract Lw51;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:Lk21;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lo30;->D:F

    .line 2
    .line 3
    sput v0, Lw51;->a:F

    .line 4
    .line 5
    sget v1, Lo30;->M:F

    .line 6
    .line 7
    sput v1, Lw51;->b:F

    .line 8
    .line 9
    sget v1, Lo30;->J:F

    .line 10
    .line 11
    sput v1, Lw51;->c:F

    .line 12
    .line 13
    sget v1, Lo30;->G:F

    .line 14
    .line 15
    sput v1, Lw51;->d:F

    .line 16
    .line 17
    sub-float/2addr v1, v0

    .line 18
    const/high16 v0, 0x40000000    # 2.0f

    .line 19
    .line 20
    div-float/2addr v1, v0

    .line 21
    sput v1, Lw51;->e:F

    .line 22
    .line 23
    new-instance v0, Lk21;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lw51;->f:Lk21;

    .line 29
    .line 30
    return-void
.end method

.method public static final a(ZLsw;Lpe0;ZLt51;Lji;I)V
    .locals 17

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v6, p5

    .line 6
    .line 7
    check-cast v6, Lpi;

    .line 8
    .line 9
    const v0, -0xfb23c9f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v6, v0}, Lpi;->X(I)Lpi;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, v1}, Lpi;->g(Z)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x2

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v2

    .line 25
    :goto_0
    or-int v0, p6, v0

    .line 26
    .line 27
    invoke-virtual {v6, v8}, Lpi;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v3, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v3

    .line 39
    or-int/lit16 v0, v0, 0x6d80

    .line 40
    .line 41
    move-object/from16 v3, p4

    .line 42
    .line 43
    invoke-virtual {v6, v3}, Lpi;->f(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    const/high16 v4, 0x20000

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/high16 v4, 0x10000

    .line 53
    .line 54
    :goto_2
    or-int/2addr v0, v4

    .line 55
    const/high16 v4, 0x180000

    .line 56
    .line 57
    or-int/2addr v0, v4

    .line 58
    const v4, 0x92493

    .line 59
    .line 60
    .line 61
    and-int/2addr v4, v0

    .line 62
    const v5, 0x92492

    .line 63
    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v9, 0x1

    .line 67
    if-eq v4, v5, :cond_3

    .line 68
    .line 69
    move v4, v9

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    move v4, v7

    .line 72
    :goto_3
    and-int/lit8 v5, v0, 0x1

    .line 73
    .line 74
    invoke-virtual {v6, v5, v4}, Lpi;->O(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_8

    .line 79
    .line 80
    invoke-virtual {v6}, Lpi;->T()V

    .line 81
    .line 82
    .line 83
    and-int/lit8 v4, p6, 0x1

    .line 84
    .line 85
    sget-object v5, Lme0;->a:Lme0;

    .line 86
    .line 87
    if-eqz v4, :cond_5

    .line 88
    .line 89
    invoke-virtual {v6}, Lpi;->y()Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eqz v4, :cond_4

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    invoke-virtual {v6}, Lpi;->R()V

    .line 97
    .line 98
    .line 99
    move-object/from16 v9, p2

    .line 100
    .line 101
    move/from16 v4, p3

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    :goto_4
    move v4, v9

    .line 105
    move-object v9, v5

    .line 106
    :goto_5
    invoke-virtual {v6}, Lpi;->q()V

    .line 107
    .line 108
    .line 109
    const v10, 0x696ac19a

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v10}, Lpi;->W(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Lpi;->L()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    sget-object v11, Lii;->a:Lr3;

    .line 120
    .line 121
    if-ne v10, v11, :cond_6

    .line 122
    .line 123
    new-instance v10, Lxg0;

    .line 124
    .line 125
    invoke-direct {v10}, Lxg0;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v10}, Lpi;->g0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    check-cast v10, Lxg0;

    .line 132
    .line 133
    invoke-virtual {v6, v7}, Lpi;->p(Z)V

    .line 134
    .line 135
    .line 136
    if-eqz v8, :cond_7

    .line 137
    .line 138
    sget-object v5, Lj30;->a:Lcz;

    .line 139
    .line 140
    new-instance v5, Lxv0;

    .line 141
    .line 142
    invoke-direct {v5, v2}, Lxv0;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-static {v1, v10, v4, v5, v8}, Lpf1;->V(ZLxg0;ZLxv0;Lsw;)Lpe0;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    :cond_7
    invoke-interface {v9, v5}, Lpe0;->c(Lpe0;)Lpe0;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v2}, Ls11;->f(Lpe0;)Lpe0;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    new-instance v11, Lr11;

    .line 158
    .line 159
    const/16 v16, 0x0

    .line 160
    .line 161
    sget v12, Lw51;->c:F

    .line 162
    .line 163
    sget v13, Lw51;->d:F

    .line 164
    .line 165
    move v14, v12

    .line 166
    move v15, v13

    .line 167
    invoke-direct/range {v11 .. v16}, Lr11;-><init>(FFFFZ)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v2, v11}, Lpe0;->c(Lpe0;)Lpe0;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    sget-object v5, Lo30;->B:Lz01;

    .line 175
    .line 176
    invoke-static {v5, v6}, Lc11;->a(Lz01;Lji;)Lx01;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    shl-int/lit8 v7, v0, 0x3

    .line 181
    .line 182
    and-int/lit8 v7, v7, 0x70

    .line 183
    .line 184
    shr-int/lit8 v0, v0, 0x6

    .line 185
    .line 186
    or-int/lit16 v7, v7, 0x180

    .line 187
    .line 188
    and-int/lit16 v0, v0, 0x1c00

    .line 189
    .line 190
    or-int/2addr v0, v7

    .line 191
    or-int/lit16 v7, v0, 0x6000

    .line 192
    .line 193
    move-object v0, v2

    .line 194
    move v2, v4

    .line 195
    move-object v4, v10

    .line 196
    invoke-static/range {v0 .. v7}, Lw51;->b(Lpe0;ZZLt51;Lg30;Lx01;Lji;I)V

    .line 197
    .line 198
    .line 199
    move v4, v2

    .line 200
    move-object v3, v9

    .line 201
    goto :goto_6

    .line 202
    :cond_8
    invoke-virtual {v6}, Lpi;->R()V

    .line 203
    .line 204
    .line 205
    move-object/from16 v3, p2

    .line 206
    .line 207
    move/from16 v4, p3

    .line 208
    .line 209
    :goto_6
    invoke-virtual {v6}, Lpi;->r()Lht0;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    if-eqz v7, :cond_9

    .line 214
    .line 215
    new-instance v0, Lu51;

    .line 216
    .line 217
    move/from16 v1, p0

    .line 218
    .line 219
    move-object/from16 v5, p4

    .line 220
    .line 221
    move/from16 v6, p6

    .line 222
    .line 223
    move-object v2, v8

    .line 224
    invoke-direct/range {v0 .. v6}, Lu51;-><init>(ZLsw;Lpe0;ZLt51;I)V

    .line 225
    .line 226
    .line 227
    iput-object v0, v7, Lht0;->d:Lww;

    .line 228
    .line 229
    :cond_9
    return-void
.end method

.method public static final b(Lpe0;ZZLt51;Lg30;Lx01;Lji;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move/from16 v7, p7

    .line 14
    .line 15
    move-object/from16 v0, p6

    .line 16
    .line 17
    check-cast v0, Lpi;

    .line 18
    .line 19
    const v8, -0x27fd625d

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v8}, Lpi;->X(I)Lpi;

    .line 23
    .line 24
    .line 25
    and-int/lit8 v8, v7, 0x6

    .line 26
    .line 27
    if-nez v8, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lpi;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    if-eqz v8, :cond_0

    .line 34
    .line 35
    const/4 v8, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v8, 0x2

    .line 38
    :goto_0
    or-int/2addr v8, v7

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v8, v7

    .line 41
    :goto_1
    and-int/lit8 v10, v7, 0x30

    .line 42
    .line 43
    if-nez v10, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lpi;->g(Z)Z

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-eqz v10, :cond_2

    .line 50
    .line 51
    const/16 v10, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v10, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v8, v10

    .line 57
    :cond_3
    and-int/lit16 v10, v7, 0x180

    .line 58
    .line 59
    if-nez v10, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lpi;->g(Z)Z

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    if-eqz v10, :cond_4

    .line 66
    .line 67
    const/16 v10, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const/16 v10, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v8, v10

    .line 73
    :cond_5
    and-int/lit16 v10, v7, 0xc00

    .line 74
    .line 75
    if-nez v10, :cond_7

    .line 76
    .line 77
    invoke-virtual {v0, v4}, Lpi;->f(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    if-eqz v10, :cond_6

    .line 82
    .line 83
    const/16 v10, 0x800

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v10, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v8, v10

    .line 89
    :cond_7
    and-int/lit16 v10, v7, 0x6000

    .line 90
    .line 91
    if-nez v10, :cond_9

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    invoke-virtual {v0, v10}, Lpi;->h(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    if-eqz v10, :cond_8

    .line 99
    .line 100
    const/16 v10, 0x4000

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v10, 0x2000

    .line 104
    .line 105
    :goto_5
    or-int/2addr v8, v10

    .line 106
    :cond_9
    const/high16 v10, 0x30000

    .line 107
    .line 108
    and-int/2addr v10, v7

    .line 109
    if-nez v10, :cond_b

    .line 110
    .line 111
    invoke-virtual {v0, v5}, Lpi;->f(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-eqz v10, :cond_a

    .line 116
    .line 117
    const/high16 v10, 0x20000

    .line 118
    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v10, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v8, v10

    .line 123
    :cond_b
    const/high16 v10, 0x180000

    .line 124
    .line 125
    and-int/2addr v10, v7

    .line 126
    if-nez v10, :cond_d

    .line 127
    .line 128
    invoke-virtual {v0, v6}, Lpi;->f(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-eqz v10, :cond_c

    .line 133
    .line 134
    const/high16 v10, 0x100000

    .line 135
    .line 136
    goto :goto_7

    .line 137
    :cond_c
    const/high16 v10, 0x80000

    .line 138
    .line 139
    :goto_7
    or-int/2addr v8, v10

    .line 140
    :cond_d
    const v10, 0x92493

    .line 141
    .line 142
    .line 143
    and-int/2addr v10, v8

    .line 144
    const v11, 0x92492

    .line 145
    .line 146
    .line 147
    const/4 v12, 0x1

    .line 148
    if-eq v10, v11, :cond_e

    .line 149
    .line 150
    move v10, v12

    .line 151
    goto :goto_8

    .line 152
    :cond_e
    const/4 v10, 0x0

    .line 153
    :goto_8
    and-int/2addr v8, v12

    .line 154
    invoke-virtual {v0, v8, v10}, Lpi;->O(IZ)Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-eqz v8, :cond_1e

    .line 159
    .line 160
    if-eqz v3, :cond_10

    .line 161
    .line 162
    if-eqz v2, :cond_f

    .line 163
    .line 164
    iget-wide v10, v4, Lt51;->b:J

    .line 165
    .line 166
    goto :goto_9

    .line 167
    :cond_f
    iget-wide v10, v4, Lt51;->f:J

    .line 168
    .line 169
    goto :goto_9

    .line 170
    :cond_10
    if-eqz v2, :cond_11

    .line 171
    .line 172
    iget-wide v10, v4, Lt51;->j:J

    .line 173
    .line 174
    goto :goto_9

    .line 175
    :cond_11
    iget-wide v10, v4, Lt51;->n:J

    .line 176
    .line 177
    :goto_9
    if-eqz v3, :cond_13

    .line 178
    .line 179
    if-eqz v2, :cond_12

    .line 180
    .line 181
    iget-wide v14, v4, Lt51;->a:J

    .line 182
    .line 183
    goto :goto_a

    .line 184
    :cond_12
    iget-wide v14, v4, Lt51;->e:J

    .line 185
    .line 186
    goto :goto_a

    .line 187
    :cond_13
    if-eqz v2, :cond_14

    .line 188
    .line 189
    iget-wide v14, v4, Lt51;->i:J

    .line 190
    .line 191
    goto :goto_a

    .line 192
    :cond_14
    iget-wide v14, v4, Lt51;->m:J

    .line 193
    .line 194
    :goto_a
    sget-object v8, Lo30;->I:Lz01;

    .line 195
    .line 196
    invoke-static {v8, v0}, Lc11;->a(Lz01;Lji;)Lx01;

    .line 197
    .line 198
    .line 199
    move-result-object v8

    .line 200
    sget v12, Lo30;->H:F

    .line 201
    .line 202
    if-eqz v3, :cond_16

    .line 203
    .line 204
    move-wide/from16 v16, v14

    .line 205
    .line 206
    if-eqz v2, :cond_15

    .line 207
    .line 208
    iget-wide v13, v4, Lt51;->c:J

    .line 209
    .line 210
    goto :goto_b

    .line 211
    :cond_15
    iget-wide v13, v4, Lt51;->g:J

    .line 212
    .line 213
    goto :goto_b

    .line 214
    :cond_16
    move-wide/from16 v16, v14

    .line 215
    .line 216
    if-eqz v2, :cond_17

    .line 217
    .line 218
    iget-wide v13, v4, Lt51;->k:J

    .line 219
    .line 220
    goto :goto_b

    .line 221
    :cond_17
    iget-wide v13, v4, Lt51;->o:J

    .line 222
    .line 223
    :goto_b
    new-instance v15, Lg31;

    .line 224
    .line 225
    invoke-direct {v15, v13, v14}, Lg31;-><init>(J)V

    .line 226
    .line 227
    .line 228
    new-instance v13, Lta;

    .line 229
    .line 230
    invoke-direct {v13, v12, v15, v8}, Lta;-><init>(FLg31;Lx01;)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v1, v13}, Lpe0;->c(Lpe0;)Lpe0;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    invoke-static {v12, v10, v11, v8}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    sget-object v10, Ln2;->e:Lha;

    .line 242
    .line 243
    const/4 v11, 0x0

    .line 244
    invoke-static {v10, v11}, Lza;->d(Lha;Z)Lxd0;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    invoke-static {v0}, Lo30;->p(Lji;)I

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    invoke-virtual {v0}, Lpi;->l()Lfq0;

    .line 253
    .line 254
    .line 255
    move-result-object v12

    .line 256
    invoke-static {v0, v8}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    sget-object v13, Lfi;->b:Lei;

    .line 261
    .line 262
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    sget-object v13, Lei;->b:Lcj;

    .line 266
    .line 267
    invoke-virtual {v0}, Lpi;->Z()V

    .line 268
    .line 269
    .line 270
    iget-boolean v14, v0, Lpi;->S:Z

    .line 271
    .line 272
    if-eqz v14, :cond_18

    .line 273
    .line 274
    invoke-virtual {v0, v13}, Lpi;->k(Lhw;)V

    .line 275
    .line 276
    .line 277
    goto :goto_c

    .line 278
    :cond_18
    invoke-virtual {v0}, Lpi;->j0()V

    .line 279
    .line 280
    .line 281
    :goto_c
    sget-object v14, Lei;->e:Lm7;

    .line 282
    .line 283
    invoke-static {v0, v14, v10}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    sget-object v10, Lei;->d:Lm7;

    .line 287
    .line 288
    invoke-static {v0, v10, v12}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    sget-object v12, Lei;->f:Lm7;

    .line 292
    .line 293
    iget-boolean v15, v0, Lpi;->S:Z

    .line 294
    .line 295
    if-nez v15, :cond_19

    .line 296
    .line 297
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v15

    .line 301
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    invoke-static {v15, v9}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-nez v9, :cond_1a

    .line 310
    .line 311
    :cond_19
    invoke-static {v11, v0, v11, v12}, Lt1;->o(ILpi;ILm7;)V

    .line 312
    .line 313
    .line 314
    :cond_1a
    sget-object v9, Lei;->c:Lm7;

    .line 315
    .line 316
    invoke-static {v0, v9, v8}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-static {}, Li4;->i()Lpe0;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    new-instance v11, Lf81;

    .line 324
    .line 325
    sget-object v15, Leg0;->d:Leg0;

    .line 326
    .line 327
    invoke-static {v15, v0}, Lg60;->u(Leg0;Lji;)Lo31;

    .line 328
    .line 329
    .line 330
    move-result-object v15

    .line 331
    invoke-direct {v11, v5, v2, v15}, Lf81;-><init>(Lg30;ZLo31;)V

    .line 332
    .line 333
    .line 334
    invoke-interface {v8, v11}, Lpe0;->c(Lpe0;)Lpe0;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    sget v11, Lo30;->F:F

    .line 339
    .line 340
    const/high16 v15, 0x40000000    # 2.0f

    .line 341
    .line 342
    div-float/2addr v11, v15

    .line 343
    const/4 v15, 0x4

    .line 344
    invoke-static {v11, v15}, Luv0;->a(FI)Lwv0;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    invoke-static {v8, v5, v11}, Lc10;->a(Lpe0;Lg30;Lf10;)Lpe0;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    move-wide/from16 v1, v16

    .line 353
    .line 354
    invoke-static {v8, v1, v2, v6}, Ls91;->l(Lpe0;JLx01;)Lpe0;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    sget-object v2, Ln2;->i:Lha;

    .line 359
    .line 360
    const/4 v11, 0x0

    .line 361
    invoke-static {v2, v11}, Lza;->d(Lha;Z)Lxd0;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-static {v0}, Lo30;->p(Lji;)I

    .line 366
    .line 367
    .line 368
    move-result v8

    .line 369
    invoke-virtual {v0}, Lpi;->l()Lfq0;

    .line 370
    .line 371
    .line 372
    move-result-object v11

    .line 373
    invoke-static {v0, v1}, Ls91;->E(Lji;Lpe0;)Lpe0;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    invoke-virtual {v0}, Lpi;->Z()V

    .line 378
    .line 379
    .line 380
    iget-boolean v15, v0, Lpi;->S:Z

    .line 381
    .line 382
    if-eqz v15, :cond_1b

    .line 383
    .line 384
    invoke-virtual {v0, v13}, Lpi;->k(Lhw;)V

    .line 385
    .line 386
    .line 387
    goto :goto_d

    .line 388
    :cond_1b
    invoke-virtual {v0}, Lpi;->j0()V

    .line 389
    .line 390
    .line 391
    :goto_d
    invoke-static {v0, v14, v2}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v0, v10, v11}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    iget-boolean v2, v0, Lpi;->S:Z

    .line 398
    .line 399
    if-nez v2, :cond_1c

    .line 400
    .line 401
    invoke-virtual {v0}, Lpi;->L()Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    invoke-static {v2, v10}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    if-nez v2, :cond_1d

    .line 414
    .line 415
    :cond_1c
    invoke-static {v8, v0, v8, v12}, Lt1;->o(ILpi;ILm7;)V

    .line 416
    .line 417
    .line 418
    :cond_1d
    invoke-static {v0, v9, v1}, Lw60;->J(Lji;Lww;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    const v1, 0x49acf3f3

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v1}, Lpi;->W(I)V

    .line 425
    .line 426
    .line 427
    const/4 v11, 0x0

    .line 428
    invoke-virtual {v0, v11}, Lpi;->p(Z)V

    .line 429
    .line 430
    .line 431
    const/4 v1, 0x1

    .line 432
    invoke-virtual {v0, v1}, Lpi;->p(Z)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v1}, Lpi;->p(Z)V

    .line 436
    .line 437
    .line 438
    goto :goto_e

    .line 439
    :cond_1e
    invoke-virtual {v0}, Lpi;->R()V

    .line 440
    .line 441
    .line 442
    :goto_e
    invoke-virtual {v0}, Lpi;->r()Lht0;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    if-eqz v8, :cond_1f

    .line 447
    .line 448
    new-instance v0, Lv51;

    .line 449
    .line 450
    move-object/from16 v1, p0

    .line 451
    .line 452
    move/from16 v2, p1

    .line 453
    .line 454
    invoke-direct/range {v0 .. v7}, Lv51;-><init>(Lpe0;ZZLt51;Lg30;Lx01;I)V

    .line 455
    .line 456
    .line 457
    iput-object v0, v8, Lht0;->d:Lww;

    .line 458
    .line 459
    :cond_1f
    return-void
.end method
