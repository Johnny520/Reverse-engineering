.class public final Lfn;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/io/Serializable;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lss0;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lfn;->a:Z

    .line 6
    .line 7
    iput-object p2, p0, Lfn;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lfn;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lfn;->g:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p5, p0, Lfn;->f:Ljava/lang/Object;

    .line 14
    .line 15
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 p2, 0x1f

    .line 18
    .line 19
    if-lt p1, p2, :cond_0

    .line 20
    .line 21
    sget-object p1, Ls91;->u:[B

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 p2, 0x1e

    .line 25
    .line 26
    if-eq p1, p2, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    sget-object p1, Ls91;->v:[B

    .line 31
    .line 32
    :goto_0
    iput-object p1, p0, Lfn;->d:Ljava/io/Serializable;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Llz0;Lx1;Llh;Lym;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lfn;->b:Ljava/lang/Object;

    .line 37
    iput-object p2, p0, Lfn;->c:Ljava/lang/Object;

    .line 38
    iput-object p3, p0, Lfn;->d:Ljava/io/Serializable;

    .line 39
    iput-object p4, p0, Lfn;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const p3, 0x7fffffff

    .line 40
    invoke-static {p3, p2, p1}, Lo30;->e(IILtb;)Lvb;

    move-result-object p1

    iput-object p1, p0, Lfn;->f:Ljava/lang/Object;

    .line 41
    new-instance p1, Ld;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Ld;-><init>(I)V

    iput-object p1, p0, Lfn;->h:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Lfn;Llz0;Lfg0;FFLjk;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v1, p5

    .line 8
    .line 9
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v2, v1, Lgg0;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    move-object v2, v1

    .line 17
    check-cast v2, Lgg0;

    .line 18
    .line 19
    iget v3, v2, Lgg0;->l:I

    .line 20
    .line 21
    const/high16 v4, -0x80000000

    .line 22
    .line 23
    and-int v6, v3, v4

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    sub-int/2addr v3, v4

    .line 28
    iput v3, v2, Lgg0;->l:I

    .line 29
    .line 30
    :goto_0
    move-object v9, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    new-instance v2, Lgg0;

    .line 33
    .line 34
    invoke-direct {v2, v5, v1}, Lgg0;-><init>(Lfn;Ljk;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :goto_1
    iget-object v1, v9, Lgg0;->j:Ljava/lang/Object;

    .line 39
    .line 40
    iget v2, v9, Lgg0;->l:I

    .line 41
    .line 42
    const/4 v10, 0x0

    .line 43
    const/4 v11, 0x0

    .line 44
    sget-object v12, Lna1;->a:Lna1;

    .line 45
    .line 46
    const/4 v13, 0x2

    .line 47
    const/4 v14, 0x1

    .line 48
    sget-object v15, Lzk;->d:Lzk;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    if-eq v2, v14, :cond_2

    .line 53
    .line 54
    if-ne v2, v13, :cond_1

    .line 55
    .line 56
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object v12

    .line 60
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v10

    .line 66
    :cond_2
    iget v0, v9, Lgg0;->i:F

    .line 67
    .line 68
    iget-object v2, v9, Lgg0;->h:Lwt0;

    .line 69
    .line 70
    iget-object v3, v9, Lgg0;->g:Llz0;

    .line 71
    .line 72
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {v1}, Lw60;->M(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v3, Lzt0;

    .line 80
    .line 81
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v0, v3, Lzt0;->d:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {v5, v0}, Lfn;->h(Lfg0;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v5, Lfn;->f:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lvb;

    .line 92
    .line 93
    invoke-static {v0}, Lfn;->g(Lvb;)Lfg0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    invoke-virtual {v5, v0}, Lfn;->h(Lfg0;)V

    .line 100
    .line 101
    .line 102
    iget-object v1, v3, Lzt0;->d:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Lfg0;

    .line 105
    .line 106
    invoke-virtual {v1, v0}, Lfg0;->a(Lfg0;)Lfg0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, v3, Lzt0;->d:Ljava/lang/Object;

    .line 111
    .line 112
    :cond_4
    new-instance v1, Lwt0;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 115
    .line 116
    .line 117
    iget-object v0, v3, Lzt0;->d:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lfg0;

    .line 120
    .line 121
    iget-wide v13, v0, Lfg0;->a:J

    .line 122
    .line 123
    invoke-virtual {v7, v13, v14}, Llz0;->e(J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v13

    .line 127
    invoke-virtual {v7, v13, v14}, Llz0;->g(J)F

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    iput v0, v1, Lwt0;->d:F

    .line 132
    .line 133
    invoke-static {v0}, Lr60;->e(F)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_5

    .line 138
    .line 139
    goto/16 :goto_6

    .line 140
    .line 141
    :cond_5
    new-instance v2, Lzt0;

    .line 142
    .line 143
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    const/16 v0, 0x1e

    .line 147
    .line 148
    invoke-static {v11, v11, v0}, Lpf1;->a(FFI)Lw7;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iput-object v0, v2, Lzt0;->d:Ljava/lang/Object;

    .line 153
    .line 154
    new-instance v0, Lig0;

    .line 155
    .line 156
    const/4 v8, 0x0

    .line 157
    move/from16 v4, p3

    .line 158
    .line 159
    move/from16 v6, p4

    .line 160
    .line 161
    invoke-direct/range {v0 .. v8}, Lig0;-><init>(Lwt0;Lzt0;Lzt0;FLfn;FLlz0;Lik;)V

    .line 162
    .line 163
    .line 164
    iput-object v7, v9, Lgg0;->g:Llz0;

    .line 165
    .line 166
    iput-object v1, v9, Lgg0;->h:Lwt0;

    .line 167
    .line 168
    iput v6, v9, Lgg0;->i:F

    .line 169
    .line 170
    const/4 v2, 0x1

    .line 171
    iput v2, v9, Lgg0;->l:I

    .line 172
    .line 173
    invoke-virtual {v5, v7, v0, v9}, Lfn;->i(Llz0;Lig0;Ljk;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-ne v0, v15, :cond_6

    .line 178
    .line 179
    goto/16 :goto_5

    .line 180
    .line 181
    :cond_6
    move-object v2, v1

    .line 182
    move v0, v6

    .line 183
    move-object v3, v7

    .line 184
    :goto_2
    iget-object v1, v5, Lfn;->h:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, Ld;

    .line 187
    .line 188
    iget-object v4, v1, Ld;->e:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v4, Ltb1;

    .line 191
    .line 192
    const v6, 0x7f7fffff    # Float.MAX_VALUE

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4, v6}, Ltb1;->b(F)F

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    iget-object v1, v1, Ld;->f:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v1, Ltb1;

    .line 202
    .line 203
    invoke-virtual {v1, v6}, Ltb1;->b(F)F

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-static {v4, v1}, Lg60;->b(FF)J

    .line 208
    .line 209
    .line 210
    move-result-wide v6

    .line 211
    const-wide/16 v13, 0x0

    .line 212
    .line 213
    cmp-long v1, v6, v13

    .line 214
    .line 215
    if-nez v1, :cond_9

    .line 216
    .line 217
    iget v1, v2, Lwt0;->d:F

    .line 218
    .line 219
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    const/high16 v4, 0x42c80000    # 100.0f

    .line 224
    .line 225
    div-float/2addr v1, v4

    .line 226
    invoke-static {v1, v0}, Ljava/lang/Math;->min(FF)F

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    iget v1, v2, Lwt0;->d:F

    .line 231
    .line 232
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    invoke-virtual {v3, v1}, Llz0;->d(F)F

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    mul-float/2addr v1, v0

    .line 241
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 242
    .line 243
    mul-float/2addr v1, v0

    .line 244
    cmpg-float v0, v1, v11

    .line 245
    .line 246
    if-nez v0, :cond_7

    .line 247
    .line 248
    move-wide v6, v13

    .line 249
    goto :goto_4

    .line 250
    :cond_7
    iget-object v0, v3, Llz0;->d:Lum0;

    .line 251
    .line 252
    sget-object v2, Lum0;->e:Lum0;

    .line 253
    .line 254
    if-ne v0, v2, :cond_8

    .line 255
    .line 256
    invoke-static {v1, v11}, Lg60;->b(FF)J

    .line 257
    .line 258
    .line 259
    move-result-wide v0

    .line 260
    :goto_3
    move-wide v6, v0

    .line 261
    goto :goto_4

    .line 262
    :cond_8
    invoke-static {v11, v1}, Lg60;->b(FF)J

    .line 263
    .line 264
    .line 265
    move-result-wide v0

    .line 266
    goto :goto_3

    .line 267
    :cond_9
    :goto_4
    move-wide v2, v6

    .line 268
    iget-object v0, v5, Lfn;->d:Ljava/io/Serializable;

    .line 269
    .line 270
    check-cast v0, Llh;

    .line 271
    .line 272
    const/4 v4, 0x0

    .line 273
    iput-object v4, v9, Lgg0;->g:Llz0;

    .line 274
    .line 275
    iput-object v4, v9, Lgg0;->h:Lwt0;

    .line 276
    .line 277
    const/4 v1, 0x2

    .line 278
    iput v1, v9, Lgg0;->l:I

    .line 279
    .line 280
    iget-object v0, v0, Ly1;->d:Ljava/lang/Object;

    .line 281
    .line 282
    move-object v1, v0

    .line 283
    check-cast v1, Ldz0;

    .line 284
    .line 285
    iget-object v0, v1, Ldz0;->N:Ly2;

    .line 286
    .line 287
    iget-object v0, v0, Ly2;->f:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, Lhw;

    .line 290
    .line 291
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    move-object v6, v0

    .line 296
    check-cast v6, Lyk;

    .line 297
    .line 298
    if-eqz v6, :cond_b

    .line 299
    .line 300
    new-instance v0, Lbz0;

    .line 301
    .line 302
    const/4 v5, 0x1

    .line 303
    invoke-direct/range {v0 .. v5}, Lbz0;-><init>(Ldz0;JLik;I)V

    .line 304
    .line 305
    .line 306
    const/4 v1, 0x3

    .line 307
    invoke-static {v6, v4, v0, v1}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 308
    .line 309
    .line 310
    if-ne v12, v15, :cond_a

    .line 311
    .line 312
    :goto_5
    return-object v15

    .line 313
    :cond_a
    :goto_6
    return-object v12

    .line 314
    :cond_b
    const-string v0, "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."

    .line 315
    .line 316
    invoke-static {v0}, Lxc;->o(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object v10
.end method

.method public static final b(Lfn;Lzt0;Lwt0;Llz0;Lzt0;JLjk;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-wide/from16 v0, p5

    .line 2
    .line 3
    move-object/from16 v2, p7

    .line 4
    .line 5
    instance-of v3, v2, Ljg0;

    .line 6
    .line 7
    if-eqz v3, :cond_0

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Ljg0;

    .line 11
    .line 12
    iget v4, v3, Ljg0;->m:I

    .line 13
    .line 14
    const/high16 v5, -0x80000000

    .line 15
    .line 16
    and-int v6, v4, v5

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    sub-int/2addr v4, v5

    .line 21
    iput v4, v3, Ljg0;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Ljg0;

    .line 25
    .line 26
    invoke-direct {v3, v2}, Ljk;-><init>(Lik;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v2, v3, Ljg0;->l:Ljava/lang/Object;

    .line 30
    .line 31
    iget v4, v3, Ljg0;->m:I

    .line 32
    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v4, :cond_2

    .line 36
    .line 37
    if-ne v4, v6, :cond_1

    .line 38
    .line 39
    iget-object p0, v3, Ljg0;->k:Lzt0;

    .line 40
    .line 41
    iget-object p1, v3, Ljg0;->j:Llz0;

    .line 42
    .line 43
    iget-object v0, v3, Ljg0;->i:Lwt0;

    .line 44
    .line 45
    iget-object v1, v3, Ljg0;->h:Lzt0;

    .line 46
    .line 47
    iget-object v3, v3, Ljg0;->g:Lfn;

    .line 48
    .line 49
    invoke-static {v2}, Lw60;->M(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v7, p0

    .line 53
    move-object v5, p1

    .line 54
    move-object p1, v1

    .line 55
    move-object p0, v3

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v5

    .line 63
    :cond_2
    invoke-static {v2}, Lw60;->M(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-wide/16 v7, 0x0

    .line 67
    .line 68
    cmp-long v2, v0, v7

    .line 69
    .line 70
    if-gez v2, :cond_3

    .line 71
    .line 72
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    new-instance v2, Lcg;

    .line 76
    .line 77
    const/4 v4, 0x6

    .line 78
    invoke-direct {v2, p0, v5, v4}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 79
    .line 80
    .line 81
    iput-object p0, v3, Ljg0;->g:Lfn;

    .line 82
    .line 83
    iput-object p1, v3, Ljg0;->h:Lzt0;

    .line 84
    .line 85
    iput-object p2, v3, Ljg0;->i:Lwt0;

    .line 86
    .line 87
    iput-object p3, v3, Ljg0;->j:Llz0;

    .line 88
    .line 89
    iput-object p4, v3, Ljg0;->k:Lzt0;

    .line 90
    .line 91
    iput v6, v3, Ljg0;->m:I

    .line 92
    .line 93
    invoke-static {v0, v1, v2, v3}, Lv50;->w(JLww;Ljk;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v0, Lzk;->d:Lzk;

    .line 98
    .line 99
    if-ne v2, v0, :cond_4

    .line 100
    .line 101
    return-object v0

    .line 102
    :cond_4
    move-object v0, p2

    .line 103
    move-object v5, p3

    .line 104
    move-object v7, p4

    .line 105
    :goto_1
    check-cast v2, Lfg0;

    .line 106
    .line 107
    if-eqz v2, :cond_5

    .line 108
    .line 109
    iget-object v1, p1, Lzt0;->d:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, Lfg0;

    .line 112
    .line 113
    iget-boolean v1, v1, Lfg0;->c:Z

    .line 114
    .line 115
    iget-wide v3, v2, Lfg0;->a:J

    .line 116
    .line 117
    iget-wide v8, v2, Lfg0;->b:J

    .line 118
    .line 119
    new-instance v10, Lfg0;

    .line 120
    .line 121
    move/from16 p7, v1

    .line 122
    .line 123
    move-wide p3, v3

    .line 124
    move-wide/from16 p5, v8

    .line 125
    .line 126
    move-object p2, v10

    .line 127
    invoke-direct/range {p2 .. p7}, Lfg0;-><init>(JJZ)V

    .line 128
    .line 129
    .line 130
    move-object v1, p2

    .line 131
    iput-object v1, p1, Lzt0;->d:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v5, v3, v4}, Llz0;->e(J)J

    .line 134
    .line 135
    .line 136
    move-result-wide v3

    .line 137
    invoke-virtual {v5, v3, v4}, Llz0;->i(J)F

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    iput p1, v0, Lwt0;->d:F

    .line 142
    .line 143
    const/16 p1, 0x1e

    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    invoke-static {v1, v1, p1}, Lpf1;->a(FFI)Lw7;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, v7, Lzt0;->d:Ljava/lang/Object;

    .line 151
    .line 152
    invoke-virtual {p0, v2}, Lfn;->h(Lfg0;)V

    .line 153
    .line 154
    .line 155
    iget p0, v0, Lwt0;->d:F

    .line 156
    .line 157
    invoke-static {p0}, Lr60;->e(F)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    xor-int/2addr p0, v6

    .line 162
    goto :goto_2

    .line 163
    :cond_5
    const/4 p0, 0x0

    .line 164
    :goto_2
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    return-object p0
.end method

.method public static g(Lvb;)Lfg0;
    .locals 2

    .line 1
    new-instance v0, Lk6;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1, p0}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p0, Lew;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {p0, v0, v1}, Lew;-><init>(Lk6;Lik;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lv50;->n(Lww;)Lq01;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    invoke-virtual {p0}, Lq01;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Lq01;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lfg0;

    .line 28
    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    :goto_1
    move-object v1, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v1, v0}, Lfg0;->a(Lfg0;)Lfg0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    return-object v1
.end method


# virtual methods
.method public c(Ljz0;F)F
    .locals 3

    .line 1
    iget-object p0, p0, Lfn;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Llz0;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Llz0;->d(F)F

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p2}, Llz0;->h(F)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-object p1, p1, Ljz0;->a:Llz0;

    .line 14
    .line 15
    iget-object p2, p1, Llz0;->k:Lny0;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p1, p2, v0, v1, v2}, Llz0;->c(Lny0;JI)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    invoke-virtual {p0, p1, p2}, Llz0;->e(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-virtual {p0, p1, p2}, Llz0;->g(J)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0
.end method

.method public d(Lir0;)Z
    .locals 12

    .line 1
    iget-object v0, p0, Lfn;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx1;

    .line 4
    .line 5
    iget-object v0, v0, Lx1;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/view/ViewConfiguration;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    neg-float v1, v1

    .line 14
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    neg-float v0, v0

    .line 19
    iget-object v2, p1, Lir0;->a:Ljava/util/List;

    .line 20
    .line 21
    new-instance v3, Lok0;

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    invoke-direct {v3, v4, v5}, Lok0;-><init>(J)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x0

    .line 33
    move v6, v5

    .line 34
    :goto_0
    iget-wide v7, v3, Lok0;->a:J

    .line 35
    .line 36
    if-ge v6, v4, :cond_0

    .line 37
    .line 38
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lnr0;

    .line 43
    .line 44
    iget-wide v9, v3, Lnr0;->j:J

    .line 45
    .line 46
    invoke-static {v7, v8, v9, v10}, Lok0;->e(JJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v7

    .line 50
    new-instance v3, Lok0;

    .line 51
    .line 52
    invoke-direct {v3, v7, v8}, Lok0;-><init>(J)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/16 v2, 0x20

    .line 59
    .line 60
    shr-long v3, v7, v2

    .line 61
    .line 62
    long-to-int v3, v3

    .line 63
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    mul-float/2addr v3, v0

    .line 68
    const-wide v9, 0xffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long v6, v7, v9

    .line 74
    .line 75
    long-to-int v0, v6

    .line 76
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    mul-float/2addr v0, v1

    .line 81
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    int-to-long v3, v1

    .line 86
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    int-to-long v0, v0

    .line 91
    shl-long v2, v3, v2

    .line 92
    .line 93
    and-long/2addr v0, v9

    .line 94
    or-long v7, v2, v0

    .line 95
    .line 96
    iget-object v0, p0, Lfn;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Llz0;

    .line 99
    .line 100
    invoke-virtual {v0, v7, v8}, Llz0;->e(J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v1

    .line 104
    invoke-virtual {v0, v1, v2}, Llz0;->i(J)F

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    const/4 v2, 0x0

    .line 109
    cmpg-float v3, v1, v2

    .line 110
    .line 111
    if-nez v3, :cond_1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    cmpl-float v1, v1, v2

    .line 115
    .line 116
    iget-object v0, v0, Llz0;->a:Lez0;

    .line 117
    .line 118
    if-lez v1, :cond_2

    .line 119
    .line 120
    invoke-interface {v0}, Lez0;->c()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    goto :goto_1

    .line 125
    :cond_2
    invoke-interface {v0}, Lez0;->a()Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    :goto_1
    if-eqz v5, :cond_3

    .line 130
    .line 131
    iget-object p0, p0, Lfn;->f:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p0, Lvb;

    .line 134
    .line 135
    new-instance v6, Lfg0;

    .line 136
    .line 137
    iget-object p1, p1, Lir0;->a:Ljava/util/List;

    .line 138
    .line 139
    invoke-static {p1}, Lye;->J(Ljava/util/List;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Lnr0;

    .line 144
    .line 145
    iget-wide v9, p1, Lnr0;->b:J

    .line 146
    .line 147
    const/4 v11, 0x0

    .line 148
    invoke-direct/range {v6 .. v11}, Lfg0;-><init>(JJZ)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p0, v6}, Ln01;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    instance-of p0, p0, Lvd;

    .line 156
    .line 157
    xor-int/lit8 p0, p0, 0x1

    .line 158
    .line 159
    return p0

    .line 160
    :cond_3
    iget-boolean p0, p0, Lfn;->a:Z

    .line 161
    .line 162
    return p0
.end method

.method public e(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const-string p2, "compressed"

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lfn;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lss0;

    .line 28
    .line 29
    invoke-interface {p0}, Lss0;->d()V

    .line 30
    .line 31
    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public f(ILjava/io/Serializable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lfn;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    new-instance v1, Len;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2, p0, p2}, Len;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public h(Lfg0;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lfn;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ld;

    .line 4
    .line 5
    iget-wide v0, p1, Lfg0;->b:J

    .line 6
    .line 7
    iget-wide v2, p1, Lfg0;->a:J

    .line 8
    .line 9
    iget-object p1, p0, Ld;->e:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ltb1;

    .line 12
    .line 13
    const/16 v4, 0x20

    .line 14
    .line 15
    shr-long v4, v2, v4

    .line 16
    .line 17
    long-to-int v4, v4

    .line 18
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {p1, v4, v0, v1}, Ltb1;->a(FJ)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ltb1;

    .line 28
    .line 29
    const-wide v4, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v2, v4

    .line 35
    long-to-int p1, v2

    .line 36
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {p0, p1, v0, v1}, Ltb1;->a(FJ)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public i(Llz0;Lig0;Ljk;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lkg0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lkg0;

    .line 7
    .line 8
    iget v1, v0, Lkg0;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkg0;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkg0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lkg0;-><init>(Lfn;Ljk;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lkg0;->g:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lkg0;->i:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lxc;->o(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p3}, Lw60;->M(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-boolean v3, p0, Lfn;->a:Z

    .line 49
    .line 50
    new-instance p3, Le;

    .line 51
    .line 52
    const/16 v1, 0x8

    .line 53
    .line 54
    invoke-direct {p3, p1, p2, v2, v1}, Le;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lik;I)V

    .line 55
    .line 56
    .line 57
    iput v3, v0, Lkg0;->i:I

    .line 58
    .line 59
    new-instance p1, Lc51;

    .line 60
    .line 61
    invoke-interface {v0}, Lik;->e()Lpk;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    invoke-direct {p1, v0, p2}, Lgy0;-><init>(Lik;Lpk;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p1, p3}, Lg60;->s(Lgy0;Lgy0;Lww;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    sget-object p2, Lzk;->d:Lzk;

    .line 73
    .line 74
    if-ne p1, p2, :cond_3

    .line 75
    .line 76
    return-object p2

    .line 77
    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 78
    iput-boolean p1, p0, Lfn;->a:Z

    .line 79
    .line 80
    sget-object p0, Lna1;->a:Lna1;

    .line 81
    .line 82
    return-object p0
.end method
