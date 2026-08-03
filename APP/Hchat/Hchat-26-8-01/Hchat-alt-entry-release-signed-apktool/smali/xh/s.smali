.class public final synthetic Lxh/s;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Ljava/util/ArrayList;

.field public final synthetic i:I

.field public final synthetic j:J

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Lsh/t;

.field public final synthetic m:Ln1/a;

.field public final synthetic n:Lfg/l;

.field public final synthetic o:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/ArrayList;IJLi0/a1;Lsh/t;Ln1/a;Lfg/l;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lxh/s;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lxh/s;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput p3, p0, Lxh/s;->i:I

    .line 9
    .line 10
    iput-wide p4, p0, Lxh/s;->j:J

    .line 11
    .line 12
    iput-object p6, p0, Lxh/s;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p7, p0, Lxh/s;->l:Lsh/t;

    .line 15
    .line 16
    iput-object p8, p0, Lxh/s;->m:Ln1/a;

    .line 17
    .line 18
    iput-object p9, p0, Lxh/s;->n:Lfg/l;

    .line 19
    .line 20
    iput-object p10, p0, Lxh/s;->o:Li0/a1;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lp/f1;

    .line 6
    .line 7
    move-object/from16 v10, p2

    .line 8
    .line 9
    check-cast v10, Li0/h0;

    .line 10
    .line 11
    move-object/from16 v2, p3

    .line 12
    .line 13
    check-cast v2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x6

    .line 23
    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-virtual {v10, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v3, 0x2

    .line 35
    :goto_0
    or-int/2addr v2, v3

    .line 36
    :cond_1
    move/from16 v25, v2

    .line 37
    .line 38
    and-int/lit8 v2, v25, 0x13

    .line 39
    .line 40
    const/16 v3, 0x12

    .line 41
    .line 42
    const/4 v4, 0x0

    .line 43
    if-eq v2, v3, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v2, v4

    .line 48
    :goto_1
    and-int/lit8 v3, v25, 0x1

    .line 49
    .line 50
    invoke-virtual {v10, v3, v2}, Li0/h0;->S(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, Lxh/s;->g:Z

    .line 57
    .line 58
    iget-object v3, v0, Lxh/s;->h:Ljava/util/ArrayList;

    .line 59
    .line 60
    iget v5, v0, Lxh/s;->i:I

    .line 61
    .line 62
    iget-wide v6, v0, Lxh/s;->j:J

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    const v8, -0x3947460c

    .line 67
    .line 68
    .line 69
    invoke-virtual {v10, v8}, Li0/h0;->a0(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Ljava/lang/String;

    .line 77
    .line 78
    const/16 v9, 0x8

    .line 79
    .line 80
    int-to-float v14, v9

    .line 81
    const/4 v15, 0x0

    .line 82
    const/16 v16, 0xb

    .line 83
    .line 84
    sget-object v11, Ly0/l;->a:Ly0/l;

    .line 85
    .line 86
    const/4 v12, 0x0

    .line 87
    const/4 v13, 0x0

    .line 88
    invoke-static/range {v11 .. v16}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    sget-object v11, Ly0/b;->q:Ly0/f;

    .line 93
    .line 94
    new-instance v12, Lp/p1;

    .line 95
    .line 96
    invoke-direct {v12, v11}, Lp/p1;-><init>(Ly0/f;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v9, v12}, Ly0/o;->d(Ly0/o;)Ly0/o;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    invoke-virtual {v1, v9, v4}, Lp/f1;->a(Ly0/o;Z)Ly0/o;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    sget-object v11, Lbi/m;->a:Li0/m2;

    .line 108
    .line 109
    invoke-virtual {v10, v11}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    check-cast v11, Lbi/l;

    .line 114
    .line 115
    iget-object v11, v11, Lbi/l;->d:Li0/j1;

    .line 116
    .line 117
    invoke-virtual {v11}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    check-cast v11, Li2/n0;

    .line 122
    .line 123
    iget-object v11, v11, Li2/n0;->a:Li2/f0;

    .line 124
    .line 125
    iget-wide v11, v11, Li2/f0;->b:J

    .line 126
    .line 127
    move v13, v4

    .line 128
    move-wide/from16 v30, v11

    .line 129
    .line 130
    move v11, v5

    .line 131
    move-wide v4, v6

    .line 132
    move-wide/from16 v6, v30

    .line 133
    .line 134
    new-instance v12, Lt2/k;

    .line 135
    .line 136
    const/4 v14, 0x6

    .line 137
    invoke-direct {v12, v14}, Lt2/k;-><init>(I)V

    .line 138
    .line 139
    .line 140
    const/16 v23, 0x0

    .line 141
    .line 142
    const v24, 0x3fbe8

    .line 143
    .line 144
    .line 145
    move v14, v2

    .line 146
    move-object v2, v8

    .line 147
    const/4 v8, 0x0

    .line 148
    move-object v15, v3

    .line 149
    move-object v3, v9

    .line 150
    const/4 v9, 0x0

    .line 151
    move-object/from16 v21, v10

    .line 152
    .line 153
    move/from16 v16, v11

    .line 154
    .line 155
    const-wide/16 v10, 0x0

    .line 156
    .line 157
    move/from16 v18, v13

    .line 158
    .line 159
    move/from16 v17, v14

    .line 160
    .line 161
    const-wide/16 v13, 0x0

    .line 162
    .line 163
    move-object/from16 v19, v15

    .line 164
    .line 165
    const/4 v15, 0x0

    .line 166
    move/from16 v20, v16

    .line 167
    .line 168
    const/16 v16, 0x0

    .line 169
    .line 170
    move/from16 v22, v17

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    move/from16 v26, v18

    .line 175
    .line 176
    const/16 v18, 0x0

    .line 177
    .line 178
    move-object/from16 v27, v19

    .line 179
    .line 180
    const/16 v19, 0x0

    .line 181
    .line 182
    move/from16 v28, v20

    .line 183
    .line 184
    const/16 v20, 0x0

    .line 185
    .line 186
    move/from16 v29, v22

    .line 187
    .line 188
    const/16 v22, 0x0

    .line 189
    .line 190
    move/from16 v0, v26

    .line 191
    .line 192
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 193
    .line 194
    .line 195
    move-object/from16 v10, v21

    .line 196
    .line 197
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_3
    move/from16 v29, v2

    .line 202
    .line 203
    move-object/from16 v27, v3

    .line 204
    .line 205
    move v0, v4

    .line 206
    move/from16 v28, v5

    .line 207
    .line 208
    move-wide v4, v6

    .line 209
    const v2, -0x3940d824

    .line 210
    .line 211
    .line 212
    invoke-virtual {v10, v2}, Li0/h0;->a0(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 216
    .line 217
    .line 218
    :goto_2
    and-int/lit8 v2, v25, 0xe

    .line 219
    .line 220
    invoke-static {v1, v4, v5, v10, v2}, Lsh/s;->e(Lp/f1;JLi0/h0;I)V

    .line 221
    .line 222
    .line 223
    if-eqz v29, :cond_6

    .line 224
    .line 225
    const v1, -0x393eada7

    .line 226
    .line 227
    .line 228
    invoke-virtual {v10, v1}, Li0/h0;->a0(I)V

    .line 229
    .line 230
    .line 231
    move-object/from16 v1, p0

    .line 232
    .line 233
    iget-object v2, v1, Lxh/s;->k:Li0/a1;

    .line 234
    .line 235
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    check-cast v3, Ljava/lang/Boolean;

    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    sget-object v5, Li0/l;->a:Li0/e;

    .line 250
    .line 251
    if-ne v3, v5, :cond_4

    .line 252
    .line 253
    new-instance v3, Lwb/ht;

    .line 254
    .line 255
    const/4 v6, 0x6

    .line 256
    invoke-direct {v3, v2, v6}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v10, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_4
    check-cast v3, Lfg/a;

    .line 263
    .line 264
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    if-ne v2, v5, :cond_5

    .line 269
    .line 270
    new-instance v2, Lwb/ht;

    .line 271
    .line 272
    const/4 v5, 0x7

    .line 273
    iget-object v6, v1, Lxh/s;->o:Li0/a1;

    .line 274
    .line 275
    invoke-direct {v2, v6, v5}, Lwb/ht;-><init>(Li0/a1;I)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v10, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    :cond_5
    move-object v6, v2

    .line 282
    check-cast v6, Lfg/a;

    .line 283
    .line 284
    const/16 v11, 0x6c00

    .line 285
    .line 286
    iget-object v7, v1, Lxh/s;->l:Lsh/t;

    .line 287
    .line 288
    iget-object v8, v1, Lxh/s;->m:Ln1/a;

    .line 289
    .line 290
    iget-object v9, v1, Lxh/s;->n:Lfg/l;

    .line 291
    .line 292
    move-object v5, v3

    .line 293
    move-object/from16 v2, v27

    .line 294
    .line 295
    move/from16 v3, v28

    .line 296
    .line 297
    invoke-static/range {v2 .. v11}, Lr9/e0;->g(Ljava/util/ArrayList;IZLfg/a;Lfg/a;Lsh/t;Ln1/a;Lfg/l;Li0/h0;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 301
    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_6
    move-object/from16 v1, p0

    .line 305
    .line 306
    const v2, -0x39363024

    .line 307
    .line 308
    .line 309
    invoke-virtual {v10, v2}, Li0/h0;->a0(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10, v0}, Li0/h0;->p(Z)V

    .line 313
    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_7
    move-object v1, v0

    .line 317
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 318
    .line 319
    .line 320
    :goto_3
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 321
    .line 322
    return-object v0
.end method
