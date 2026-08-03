.class public final synthetic Lwb/n8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/n8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/n8;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/n8;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    check-cast v10, Li0/h0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v5

    .line 26
    invoke-virtual {v10, v1, v2}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    sget-object v1, Lp/j;->c:Lp/e;

    .line 33
    .line 34
    sget-object v2, Ly0/b;->s:Ly0/e;

    .line 35
    .line 36
    invoke-static {v1, v2, v10, v4}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-wide v2, v10, Li0/h0;->T:J

    .line 41
    .line 42
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    invoke-virtual {v10}, Li0/h0;->l()Ls0/h;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    sget-object v4, Ly0/l;->a:Ly0/l;

    .line 51
    .line 52
    invoke-static {v10, v4}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 57
    .line 58
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 62
    .line 63
    invoke-virtual {v10}, Li0/h0;->d0()V

    .line 64
    .line 65
    .line 66
    iget-boolean v8, v10, Li0/h0;->S:Z

    .line 67
    .line 68
    if-eqz v8, :cond_1

    .line 69
    .line 70
    invoke-virtual {v10, v7}, Li0/h0;->k(Lfg/a;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {v10}, Li0/h0;->n0()V

    .line 75
    .line 76
    .line 77
    :goto_1
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 78
    .line 79
    invoke-static {v7, v10, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget-object v1, Lx1/f;->d:Lx1/e;

    .line 83
    .line 84
    invoke-static {v1, v10, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    sget-object v2, Lx1/f;->f:Lx1/e;

    .line 92
    .line 93
    invoke-static {v2, v10, v1}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object v1, Lx1/f;->g:Lx1/d;

    .line 97
    .line 98
    invoke-static {v1, v10}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 99
    .line 100
    .line 101
    sget-object v1, Lx1/f;->c:Lx1/e;

    .line 102
    .line 103
    invoke-static {v1, v10, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 107
    .line 108
    invoke-virtual {v10, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    check-cast v1, Lbi/b;

    .line 113
    .line 114
    invoke-virtual {v1}, Lbi/b;->g()J

    .line 115
    .line 116
    .line 117
    move-result-wide v1

    .line 118
    const/16 v3, 0xe

    .line 119
    .line 120
    invoke-static {v3}, Lx6/d;->D(I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    const/16 v22, 0x0

    .line 125
    .line 126
    const v23, 0x3ffea

    .line 127
    .line 128
    .line 129
    move-wide/from16 v27, v1

    .line 130
    .line 131
    move-object v2, v4

    .line 132
    move-wide/from16 v3, v27

    .line 133
    .line 134
    const-string v1, "\u68c0\u6d4b\u4f9d\u636e\u6765\u81ea\u5fae\u4fe1\u652f\u4ed8\u63a5\u53e3\u8fd4\u56de\u6587\u6848\u3002\u652f\u4ed8\u98ce\u63a7\u6216\u670d\u52a1\u7aef\u6587\u6848\u53d8\u5316\u53ef\u80fd\u4ea7\u751f\u68c0\u6d4b\u5931\u8d25\uff0c\u8bf7\u5148\u5c0f\u8303\u56f4\u9a8c\u8bc1\u7ed3\u679c\u3002"

    .line 135
    .line 136
    move-object v8, v2

    .line 137
    const/4 v2, 0x0

    .line 138
    move v9, v5

    .line 139
    move-wide v5, v6

    .line 140
    const/4 v7, 0x0

    .line 141
    move-object v11, v8

    .line 142
    const/4 v8, 0x0

    .line 143
    move v12, v9

    .line 144
    move-object/from16 v20, v10

    .line 145
    .line 146
    const-wide/16 v9, 0x0

    .line 147
    .line 148
    move-object v13, v11

    .line 149
    const/4 v11, 0x0

    .line 150
    move v14, v12

    .line 151
    move-object v15, v13

    .line 152
    const-wide/16 v12, 0x0

    .line 153
    .line 154
    move/from16 v16, v14

    .line 155
    .line 156
    const/4 v14, 0x0

    .line 157
    move-object/from16 v17, v15

    .line 158
    .line 159
    const/4 v15, 0x0

    .line 160
    move/from16 v18, v16

    .line 161
    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    move-object/from16 v19, v17

    .line 165
    .line 166
    const/16 v17, 0x0

    .line 167
    .line 168
    move/from16 v21, v18

    .line 169
    .line 170
    const/16 v18, 0x0

    .line 171
    .line 172
    move-object/from16 v24, v19

    .line 173
    .line 174
    const/16 v19, 0x0

    .line 175
    .line 176
    move/from16 v25, v21

    .line 177
    .line 178
    const/16 v21, 0x6006

    .line 179
    .line 180
    move-object/from16 v26, v24

    .line 181
    .line 182
    invoke-static/range {v1 .. v23}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 183
    .line 184
    .line 185
    move-object/from16 v10, v20

    .line 186
    .line 187
    iget-object v1, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 188
    .line 189
    invoke-virtual {v10, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    iget-object v13, v0, Lwb/n8;->j:Li0/a1;

    .line 198
    .line 199
    sget-object v14, Li0/l;->a:Li0/e;

    .line 200
    .line 201
    if-nez v2, :cond_2

    .line 202
    .line 203
    if-ne v3, v14, :cond_3

    .line 204
    .line 205
    :cond_2
    new-instance v3, Lwb/k9;

    .line 206
    .line 207
    const/4 v2, 0x0

    .line 208
    iget-object v4, v0, Lwb/n8;->i:Li0/a1;

    .line 209
    .line 210
    invoke-direct {v3, v1, v4, v13, v2}, Lwb/k9;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v10, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_3
    move-object v2, v3

    .line 217
    check-cast v2, Lfg/a;

    .line 218
    .line 219
    const/high16 v15, 0x3f800000    # 1.0f

    .line 220
    .line 221
    move-object/from16 v1, v26

    .line 222
    .line 223
    invoke-static {v1, v15}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    const/16 v4, 0xc

    .line 228
    .line 229
    int-to-float v5, v4

    .line 230
    const/4 v7, 0x0

    .line 231
    const/16 v8, 0xd

    .line 232
    .line 233
    const/4 v4, 0x0

    .line 234
    const/4 v6, 0x0

    .line 235
    invoke-static/range {v3 .. v8}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-static {v10}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    const/16 v11, 0x186

    .line 244
    .line 245
    const/16 v12, 0x778

    .line 246
    .line 247
    move-object/from16 v17, v1

    .line 248
    .line 249
    const-string v1, "\u786e\u8ba4\u542f\u7528"

    .line 250
    .line 251
    const/4 v4, 0x0

    .line 252
    const/4 v5, 0x0

    .line 253
    const/4 v9, 0x0

    .line 254
    move-object/from16 v0, v17

    .line 255
    .line 256
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v10}, Li0/h0;->P()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    if-ne v1, v14, :cond_4

    .line 264
    .line 265
    new-instance v1, Lwb/l9;

    .line 266
    .line 267
    const/4 v2, 0x0

    .line 268
    invoke-direct {v1, v13, v2}, Lwb/l9;-><init>(Li0/a1;I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v10, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_4
    move-object v2, v1

    .line 275
    check-cast v2, Lfg/a;

    .line 276
    .line 277
    invoke-static {v0, v15}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    const/16 v0, 0x8

    .line 282
    .line 283
    int-to-float v5, v0

    .line 284
    const/4 v7, 0x0

    .line 285
    const/16 v8, 0xd

    .line 286
    .line 287
    const/4 v4, 0x0

    .line 288
    const/4 v6, 0x0

    .line 289
    invoke-static/range {v3 .. v8}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 290
    .line 291
    .line 292
    move-result-object v3

    .line 293
    invoke-static {v10}, Lsh/c;->a(Li0/h0;)Lsh/q1;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    const/16 v11, 0x1b6

    .line 298
    .line 299
    const/16 v12, 0x778

    .line 300
    .line 301
    const-string v1, "\u53d6\u6d88"

    .line 302
    .line 303
    const/4 v4, 0x0

    .line 304
    const/4 v5, 0x0

    .line 305
    const/4 v9, 0x0

    .line 306
    invoke-static/range {v1 .. v12}, Lsh/s;->o(Ljava/lang/String;Lfg/a;Ly0/o;ZFFFLsh/q1;Lp/z0;Li0/h0;II)V

    .line 307
    .line 308
    .line 309
    const/4 v14, 0x1

    .line 310
    invoke-virtual {v10, v14}, Li0/h0;->p(Z)V

    .line 311
    .line 312
    .line 313
    goto :goto_2

    .line 314
    :cond_5
    invoke-virtual {v10}, Li0/h0;->V()V

    .line 315
    .line 316
    .line 317
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 318
    .line 319
    return-object v0
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwb/n8;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v7, p1

    .line 9
    .line 10
    check-cast v7, Li0/h0;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    and-int/lit8 v2, v1, 0x3

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    const/4 v10, 0x1

    .line 24
    const/4 v11, 0x0

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    move v2, v10

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v2, v11

    .line 30
    :goto_0
    and-int/2addr v1, v10

    .line 31
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_c

    .line 36
    .line 37
    iget-object v1, v0, Lwb/n8;->i:Li0/a1;

    .line 38
    .line 39
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 50
    .line 51
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    sget-object v13, Li0/l;->a:Li0/e;

    .line 60
    .line 61
    if-nez v3, :cond_1

    .line 62
    .line 63
    if-ne v4, v13, :cond_2

    .line 64
    .line 65
    :cond_1
    new-instance v4, Lwb/jo;

    .line 66
    .line 67
    const/16 v3, 0x9

    .line 68
    .line 69
    invoke-direct {v4, v12, v1, v3}, Lwb/jo;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    move-object v6, v4

    .line 76
    check-cast v6, Lfg/l;

    .line 77
    .line 78
    const/16 v8, 0x1b0

    .line 79
    .line 80
    const/16 v9, 0x8

    .line 81
    .line 82
    const-string v3, "\u8bb0\u5f55\u8fd0\u884c\u65e5\u5fd7"

    .line 83
    .line 84
    const-string v4, "\u53ea\u4fdd\u7559\u6700\u8fd1 200 \u6761"

    .line 85
    .line 86
    const/4 v5, 0x0

    .line 87
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    check-cast v1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_b

    .line 101
    .line 102
    const v1, -0x5babd090

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 110
    .line 111
    .line 112
    iget-object v2, v0, Lwb/n8;->j:Li0/a1;

    .line 113
    .line 114
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    const-string v3, "\u6682\u65e0\u8bb0\u5f55"

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    new-instance v4, Log/d;

    .line 139
    .line 140
    invoke-direct {v4, v3}, Log/d;-><init>(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    move v3, v11

    .line 144
    :goto_1
    invoke-virtual {v4}, Log/d;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    if-eqz v5, :cond_5

    .line 149
    .line 150
    invoke-virtual {v4}, Log/d;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    if-ltz v3, :cond_4

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    invoke-static {}, La/a;->P0()V

    .line 159
    .line 160
    .line 161
    const/4 v1, 0x0

    .line 162
    throw v1

    .line 163
    :cond_5
    const-string v4, " \u6761\u8bb0\u5f55"

    .line 164
    .line 165
    invoke-static {v3, v4}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    :goto_2
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    if-nez v4, :cond_6

    .line 178
    .line 179
    if-ne v5, v13, :cond_7

    .line 180
    .line 181
    :cond_6
    new-instance v5, Lwb/od;

    .line 182
    .line 183
    const/4 v4, 0x7

    .line 184
    invoke-direct {v5, v12, v2, v4}, Lwb/od;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    check-cast v5, Lfg/a;

    .line 191
    .line 192
    const-string v4, "\u5237\u65b0\u65e5\u5fd7"

    .line 193
    .line 194
    const/4 v6, 0x6

    .line 195
    invoke-static {v4, v3, v5, v7, v6}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    check-cast v3, Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_a

    .line 209
    .line 210
    const v3, -0x5ba6bd1b

    .line 211
    .line 212
    .line 213
    invoke-virtual {v7, v3}, Li0/h0;->a0(I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    check-cast v3, Ljava/lang/String;

    .line 224
    .line 225
    const/16 v4, 0x1388

    .line 226
    .line 227
    invoke-static {v4, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 232
    .line 233
    invoke-virtual {v7, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    check-cast v4, Lbi/b;

    .line 238
    .line 239
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 240
    .line 241
    .line 242
    move-result-wide v4

    .line 243
    const/16 v6, 0xc

    .line 244
    .line 245
    invoke-static {v6}, Lx6/d;->D(I)J

    .line 246
    .line 247
    .line 248
    move-result-wide v8

    .line 249
    sget-object v6, Ly0/l;->a:Ly0/l;

    .line 250
    .line 251
    const/high16 v14, 0x3f800000    # 1.0f

    .line 252
    .line 253
    invoke-static {v6, v14}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    const/16 v14, 0x10

    .line 258
    .line 259
    int-to-float v14, v14

    .line 260
    invoke-static {v6, v14}, Lp/d;->l(Ly0/o;F)Ly0/o;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    const/16 v23, 0x0

    .line 265
    .line 266
    const v24, 0x3ff68

    .line 267
    .line 268
    .line 269
    move-object/from16 v21, v7

    .line 270
    .line 271
    move-wide/from16 v38, v8

    .line 272
    .line 273
    move-object v9, v2

    .line 274
    move-object v2, v3

    .line 275
    move-object v3, v6

    .line 276
    move-wide/from16 v6, v38

    .line 277
    .line 278
    const/4 v8, 0x0

    .line 279
    move-object v14, v9

    .line 280
    sget-object v9, Lm2/p;->b:Lm2/m;

    .line 281
    .line 282
    move v15, v10

    .line 283
    move/from16 v16, v11

    .line 284
    .line 285
    const-wide/16 v10, 0x0

    .line 286
    .line 287
    move-object/from16 v17, v12

    .line 288
    .line 289
    const/4 v12, 0x0

    .line 290
    move-object/from16 v19, v13

    .line 291
    .line 292
    move-object/from16 v18, v14

    .line 293
    .line 294
    const-wide/16 v13, 0x0

    .line 295
    .line 296
    move/from16 v20, v15

    .line 297
    .line 298
    const/4 v15, 0x0

    .line 299
    move/from16 v22, v16

    .line 300
    .line 301
    const/16 v16, 0x0

    .line 302
    .line 303
    move-object/from16 v25, v17

    .line 304
    .line 305
    const/16 v17, 0x0

    .line 306
    .line 307
    move-object/from16 v26, v18

    .line 308
    .line 309
    const/16 v18, 0x0

    .line 310
    .line 311
    move-object/from16 v27, v19

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    move/from16 v28, v20

    .line 316
    .line 317
    const/16 v20, 0x0

    .line 318
    .line 319
    move/from16 v29, v22

    .line 320
    .line 321
    const/16 v22, 0x6030

    .line 322
    .line 323
    move-object/from16 v30, v26

    .line 324
    .line 325
    move-object/from16 v31, v27

    .line 326
    .line 327
    move/from16 v0, v28

    .line 328
    .line 329
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 330
    .line 331
    .line 332
    move-object/from16 v7, v21

    .line 333
    .line 334
    const/4 v2, 0x0

    .line 335
    invoke-static {v1, v7, v2, v0}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 336
    .line 337
    .line 338
    move-object/from16 v0, v25

    .line 339
    .line 340
    invoke-virtual {v7, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    if-nez v1, :cond_8

    .line 349
    .line 350
    move-object/from16 v1, v31

    .line 351
    .line 352
    if-ne v3, v1, :cond_9

    .line 353
    .line 354
    :cond_8
    new-instance v3, Lwb/od;

    .line 355
    .line 356
    const/16 v1, 0x8

    .line 357
    .line 358
    move-object/from16 v14, v30

    .line 359
    .line 360
    invoke-direct {v3, v0, v14, v1}, Lwb/od;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_9
    check-cast v3, Lfg/a;

    .line 367
    .line 368
    const/16 v0, 0x36

    .line 369
    .line 370
    const-string v1, "\u6e05\u7a7a\u65e5\u5fd7"

    .line 371
    .line 372
    const-string v4, "\u5220\u9664\u5f53\u524d\u81ea\u52a8\u8bc4\u8bba\u8fd0\u884c\u8bb0\u5f55"

    .line 373
    .line 374
    invoke-static {v1, v4, v3, v7, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 378
    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_a
    move v2, v11

    .line 382
    const v0, -0x5b9aeb75

    .line 383
    .line 384
    .line 385
    invoke-virtual {v7, v0}, Li0/h0;->a0(I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 389
    .line 390
    .line 391
    :goto_3
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 392
    .line 393
    .line 394
    goto :goto_4

    .line 395
    :cond_b
    move v2, v11

    .line 396
    const v0, -0x5b9a86b5

    .line 397
    .line 398
    .line 399
    invoke-virtual {v7, v0}, Li0/h0;->a0(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 403
    .line 404
    .line 405
    goto :goto_4

    .line 406
    :cond_c
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 407
    .line 408
    .line 409
    :goto_4
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 410
    .line 411
    return-object v0

    .line 412
    :pswitch_0
    invoke-direct/range {p0 .. p2}, Lwb/n8;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    return-object v0

    .line 417
    :pswitch_1
    move-object/from16 v6, p1

    .line 418
    .line 419
    check-cast v6, Li0/h0;

    .line 420
    .line 421
    move-object/from16 v0, p2

    .line 422
    .line 423
    check-cast v0, Ljava/lang/Integer;

    .line 424
    .line 425
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    and-int/lit8 v1, v0, 0x3

    .line 430
    .line 431
    const/4 v2, 0x2

    .line 432
    const/4 v9, 0x1

    .line 433
    const/4 v10, 0x0

    .line 434
    if-eq v1, v2, :cond_d

    .line 435
    .line 436
    move v1, v9

    .line 437
    goto :goto_5

    .line 438
    :cond_d
    move v1, v10

    .line 439
    :goto_5
    and-int/2addr v0, v9

    .line 440
    invoke-virtual {v6, v0, v1}, Li0/h0;->S(IZ)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-eqz v0, :cond_13

    .line 445
    .line 446
    move-object/from16 v0, p0

    .line 447
    .line 448
    iget-object v11, v0, Lwb/n8;->i:Li0/a1;

    .line 449
    .line 450
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    check-cast v1, Ljava/lang/Boolean;

    .line 455
    .line 456
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 461
    .line 462
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    sget-object v13, Li0/l;->a:Li0/e;

    .line 471
    .line 472
    if-nez v2, :cond_e

    .line 473
    .line 474
    if-ne v3, v13, :cond_f

    .line 475
    .line 476
    :cond_e
    new-instance v3, Lwb/di;

    .line 477
    .line 478
    const/4 v2, 0x5

    .line 479
    invoke-direct {v3, v12, v11, v2}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    :cond_f
    move-object v5, v3

    .line 486
    check-cast v5, Lfg/l;

    .line 487
    .line 488
    const/16 v7, 0x1b0

    .line 489
    .line 490
    const/16 v8, 0x8

    .line 491
    .line 492
    const-string v2, "\u670b\u53cb\u5708\u81ea\u52a8\u70b9\u8d5e"

    .line 493
    .line 494
    const-string v3, "\u6309\u4e0b\u65b9\u89c4\u5219\u5904\u7406\u65b0\u83b7\u53d6\u7684\u670b\u53cb\u5708"

    .line 495
    .line 496
    const/4 v4, 0x0

    .line 497
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 498
    .line 499
    .line 500
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v1

    .line 504
    check-cast v1, Ljava/lang/Boolean;

    .line 505
    .line 506
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 507
    .line 508
    .line 509
    move-result v1

    .line 510
    if-eqz v1, :cond_12

    .line 511
    .line 512
    const v1, 0x6cb7a5dd

    .line 513
    .line 514
    .line 515
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 516
    .line 517
    .line 518
    const/4 v1, 0x0

    .line 519
    invoke-static {v1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 520
    .line 521
    .line 522
    iget-object v1, v0, Lwb/n8;->j:Li0/a1;

    .line 523
    .line 524
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    check-cast v2, Ljava/lang/Boolean;

    .line 529
    .line 530
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 531
    .line 532
    .line 533
    move-result v2

    .line 534
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    if-nez v3, :cond_10

    .line 543
    .line 544
    if-ne v4, v13, :cond_11

    .line 545
    .line 546
    :cond_10
    new-instance v4, Lwb/di;

    .line 547
    .line 548
    const/4 v3, 0x6

    .line 549
    invoke-direct {v4, v12, v1, v3}, Lwb/di;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    :cond_11
    move-object v5, v4

    .line 556
    check-cast v5, Lfg/l;

    .line 557
    .line 558
    const/16 v7, 0x1b0

    .line 559
    .line 560
    const/16 v8, 0x8

    .line 561
    .line 562
    move v1, v2

    .line 563
    const-string v2, "\u70b9\u8d5e\u81ea\u5df1\u7684\u670b\u53cb\u5708"

    .line 564
    .line 565
    const-string v3, "\u81ea\u5df1\u7684\u670b\u53cb\u5708\u4e0d\u53d7\u597d\u53cb\u540d\u5355\u9650\u5236"

    .line 566
    .line 567
    const/4 v4, 0x0

    .line 568
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 572
    .line 573
    .line 574
    goto :goto_6

    .line 575
    :cond_12
    const v1, 0x6cbc228f

    .line 576
    .line 577
    .line 578
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 582
    .line 583
    .line 584
    goto :goto_6

    .line 585
    :cond_13
    move-object/from16 v0, p0

    .line 586
    .line 587
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 588
    .line 589
    .line 590
    :goto_6
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 591
    .line 592
    return-object v1

    .line 593
    :pswitch_2
    move-object/from16 v7, p1

    .line 594
    .line 595
    check-cast v7, Li0/h0;

    .line 596
    .line 597
    move-object/from16 v1, p2

    .line 598
    .line 599
    check-cast v1, Ljava/lang/Integer;

    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    and-int/lit8 v2, v1, 0x3

    .line 606
    .line 607
    const/4 v3, 0x2

    .line 608
    const/4 v10, 0x1

    .line 609
    const/4 v11, 0x0

    .line 610
    if-eq v2, v3, :cond_14

    .line 611
    .line 612
    move v2, v10

    .line 613
    goto :goto_7

    .line 614
    :cond_14
    move v2, v11

    .line 615
    :goto_7
    and-int/2addr v1, v10

    .line 616
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    if-eqz v1, :cond_20

    .line 621
    .line 622
    iget-object v1, v0, Lwb/n8;->i:Li0/a1;

    .line 623
    .line 624
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    check-cast v2, Ljava/lang/Boolean;

    .line 629
    .line 630
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 631
    .line 632
    .line 633
    move-result v2

    .line 634
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 635
    .line 636
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v3

    .line 640
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v4

    .line 644
    sget-object v13, Li0/l;->a:Li0/e;

    .line 645
    .line 646
    if-nez v3, :cond_15

    .line 647
    .line 648
    if-ne v4, v13, :cond_16

    .line 649
    .line 650
    :cond_15
    new-instance v4, Lwb/wh;

    .line 651
    .line 652
    const/4 v3, 0x6

    .line 653
    invoke-direct {v4, v12, v1, v3}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    :cond_16
    move-object v6, v4

    .line 660
    check-cast v6, Lfg/l;

    .line 661
    .line 662
    const/16 v8, 0x1b0

    .line 663
    .line 664
    const/16 v9, 0x8

    .line 665
    .line 666
    const-string v3, "\u8bb0\u5f55\u8fd0\u884c\u65e5\u5fd7"

    .line 667
    .line 668
    const-string v4, "\u8bb0\u5f55\u81ea\u52a8\u8f6c\u53d1\u6267\u884c\u60c5\u51b5"

    .line 669
    .line 670
    const/4 v5, 0x0

    .line 671
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 672
    .line 673
    .line 674
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    check-cast v1, Ljava/lang/Boolean;

    .line 679
    .line 680
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 681
    .line 682
    .line 683
    move-result v1

    .line 684
    if-eqz v1, :cond_1f

    .line 685
    .line 686
    const v1, -0x58ed131c

    .line 687
    .line 688
    .line 689
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 690
    .line 691
    .line 692
    const/4 v1, 0x0

    .line 693
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 694
    .line 695
    .line 696
    iget-object v2, v0, Lwb/n8;->j:Li0/a1;

    .line 697
    .line 698
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    check-cast v3, Ljava/lang/String;

    .line 703
    .line 704
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 705
    .line 706
    .line 707
    move-result v3

    .line 708
    if-eqz v3, :cond_17

    .line 709
    .line 710
    const-string v3, "\u6682\u65e0\u8bb0\u5f55"

    .line 711
    .line 712
    goto :goto_9

    .line 713
    :cond_17
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-result-object v3

    .line 717
    check-cast v3, Ljava/lang/String;

    .line 718
    .line 719
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    new-instance v4, Log/d;

    .line 723
    .line 724
    invoke-direct {v4, v3}, Log/d;-><init>(Ljava/lang/CharSequence;)V

    .line 725
    .line 726
    .line 727
    move v3, v11

    .line 728
    :goto_8
    invoke-virtual {v4}, Log/d;->hasNext()Z

    .line 729
    .line 730
    .line 731
    move-result v5

    .line 732
    if-eqz v5, :cond_19

    .line 733
    .line 734
    invoke-virtual {v4}, Log/d;->next()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    add-int/lit8 v3, v3, 0x1

    .line 738
    .line 739
    if-ltz v3, :cond_18

    .line 740
    .line 741
    goto :goto_8

    .line 742
    :cond_18
    invoke-static {}, La/a;->P0()V

    .line 743
    .line 744
    .line 745
    const/4 v1, 0x0

    .line 746
    throw v1

    .line 747
    :cond_19
    const-string v4, " \u6761\u8bb0\u5f55"

    .line 748
    .line 749
    invoke-static {v3, v4}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v3

    .line 753
    :goto_9
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v4

    .line 757
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v5

    .line 761
    if-nez v4, :cond_1a

    .line 762
    .line 763
    if-ne v5, v13, :cond_1b

    .line 764
    .line 765
    :cond_1a
    new-instance v5, Lwb/od;

    .line 766
    .line 767
    const/4 v4, 0x4

    .line 768
    invoke-direct {v5, v12, v2, v4}, Lwb/od;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v7, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 772
    .line 773
    .line 774
    :cond_1b
    check-cast v5, Lfg/a;

    .line 775
    .line 776
    const-string v4, "\u5237\u65b0\u65e5\u5fd7"

    .line 777
    .line 778
    const/4 v6, 0x6

    .line 779
    invoke-static {v4, v3, v5, v7, v6}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 780
    .line 781
    .line 782
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v3

    .line 786
    check-cast v3, Ljava/lang/String;

    .line 787
    .line 788
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 789
    .line 790
    .line 791
    move-result v3

    .line 792
    if-nez v3, :cond_1e

    .line 793
    .line 794
    const v3, -0x58e485fa

    .line 795
    .line 796
    .line 797
    invoke-virtual {v7, v3}, Li0/h0;->a0(I)V

    .line 798
    .line 799
    .line 800
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 801
    .line 802
    .line 803
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v3

    .line 807
    check-cast v3, Ljava/lang/String;

    .line 808
    .line 809
    const/16 v4, 0x1388

    .line 810
    .line 811
    invoke-static {v4, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v3

    .line 815
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 816
    .line 817
    invoke-virtual {v7, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v4

    .line 821
    check-cast v4, Lbi/b;

    .line 822
    .line 823
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 824
    .line 825
    .line 826
    move-result-wide v4

    .line 827
    const/16 v6, 0xc

    .line 828
    .line 829
    invoke-static {v6}, Lx6/d;->D(I)J

    .line 830
    .line 831
    .line 832
    move-result-wide v8

    .line 833
    sget-object v6, Ly0/l;->a:Ly0/l;

    .line 834
    .line 835
    const/high16 v14, 0x3f800000    # 1.0f

    .line 836
    .line 837
    invoke-static {v6, v14}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 838
    .line 839
    .line 840
    move-result-object v6

    .line 841
    const/16 v14, 0x10

    .line 842
    .line 843
    int-to-float v14, v14

    .line 844
    invoke-static {v6, v14}, Lp/d;->l(Ly0/o;F)Ly0/o;

    .line 845
    .line 846
    .line 847
    move-result-object v6

    .line 848
    const/16 v23, 0x0

    .line 849
    .line 850
    const v24, 0x3ff68

    .line 851
    .line 852
    .line 853
    move-object/from16 v21, v7

    .line 854
    .line 855
    move-wide/from16 v38, v8

    .line 856
    .line 857
    move-object v9, v2

    .line 858
    move-object v2, v3

    .line 859
    move-object v3, v6

    .line 860
    move-wide/from16 v6, v38

    .line 861
    .line 862
    const/4 v8, 0x0

    .line 863
    move-object v14, v9

    .line 864
    sget-object v9, Lm2/p;->b:Lm2/m;

    .line 865
    .line 866
    move v15, v10

    .line 867
    move/from16 v16, v11

    .line 868
    .line 869
    const-wide/16 v10, 0x0

    .line 870
    .line 871
    move-object/from16 v17, v12

    .line 872
    .line 873
    const/4 v12, 0x0

    .line 874
    move-object/from16 v19, v13

    .line 875
    .line 876
    move-object/from16 v18, v14

    .line 877
    .line 878
    const-wide/16 v13, 0x0

    .line 879
    .line 880
    move/from16 v20, v15

    .line 881
    .line 882
    const/4 v15, 0x0

    .line 883
    move/from16 v22, v16

    .line 884
    .line 885
    const/16 v16, 0x0

    .line 886
    .line 887
    move-object/from16 v25, v17

    .line 888
    .line 889
    const/16 v17, 0x0

    .line 890
    .line 891
    move-object/from16 v26, v18

    .line 892
    .line 893
    const/16 v18, 0x0

    .line 894
    .line 895
    move-object/from16 v27, v19

    .line 896
    .line 897
    const/16 v19, 0x0

    .line 898
    .line 899
    move/from16 v28, v20

    .line 900
    .line 901
    const/16 v20, 0x0

    .line 902
    .line 903
    move/from16 v29, v22

    .line 904
    .line 905
    const/16 v22, 0x6030

    .line 906
    .line 907
    move-object/from16 v33, v26

    .line 908
    .line 909
    move-object/from16 v34, v27

    .line 910
    .line 911
    move/from16 v0, v28

    .line 912
    .line 913
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 914
    .line 915
    .line 916
    move-object/from16 v7, v21

    .line 917
    .line 918
    const/4 v2, 0x0

    .line 919
    invoke-static {v1, v7, v2, v0}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 920
    .line 921
    .line 922
    move-object/from16 v0, v25

    .line 923
    .line 924
    invoke-virtual {v7, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v3

    .line 932
    if-nez v1, :cond_1c

    .line 933
    .line 934
    move-object/from16 v1, v34

    .line 935
    .line 936
    if-ne v3, v1, :cond_1d

    .line 937
    .line 938
    :cond_1c
    new-instance v3, Lwb/od;

    .line 939
    .line 940
    const/4 v1, 0x5

    .line 941
    move-object/from16 v14, v33

    .line 942
    .line 943
    invoke-direct {v3, v0, v14, v1}, Lwb/od;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 947
    .line 948
    .line 949
    :cond_1d
    check-cast v3, Lfg/a;

    .line 950
    .line 951
    const/16 v0, 0x36

    .line 952
    .line 953
    const-string v1, "\u6e05\u7a7a\u65e5\u5fd7"

    .line 954
    .line 955
    const-string v4, "\u5220\u9664\u5f53\u524d\u81ea\u52a8\u8f6c\u53d1\u8fd0\u884c\u8bb0\u5f55"

    .line 956
    .line 957
    invoke-static {v1, v4, v3, v7, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 961
    .line 962
    .line 963
    goto :goto_a

    .line 964
    :cond_1e
    move v2, v11

    .line 965
    const v0, -0x58d8b454

    .line 966
    .line 967
    .line 968
    invoke-virtual {v7, v0}, Li0/h0;->a0(I)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 972
    .line 973
    .line 974
    :goto_a
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 975
    .line 976
    .line 977
    goto :goto_b

    .line 978
    :cond_1f
    move v2, v11

    .line 979
    const v0, -0x58d84f94

    .line 980
    .line 981
    .line 982
    invoke-virtual {v7, v0}, Li0/h0;->a0(I)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v7, v2}, Li0/h0;->p(Z)V

    .line 986
    .line 987
    .line 988
    goto :goto_b

    .line 989
    :cond_20
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 990
    .line 991
    .line 992
    :goto_b
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 993
    .line 994
    return-object v0

    .line 995
    :pswitch_3
    move-object/from16 v6, p1

    .line 996
    .line 997
    check-cast v6, Li0/h0;

    .line 998
    .line 999
    move-object/from16 v0, p2

    .line 1000
    .line 1001
    check-cast v0, Ljava/lang/Integer;

    .line 1002
    .line 1003
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1004
    .line 1005
    .line 1006
    move-result v0

    .line 1007
    and-int/lit8 v1, v0, 0x3

    .line 1008
    .line 1009
    const/4 v2, 0x2

    .line 1010
    const/4 v9, 0x1

    .line 1011
    const/4 v10, 0x0

    .line 1012
    if-eq v1, v2, :cond_21

    .line 1013
    .line 1014
    move v1, v9

    .line 1015
    goto :goto_c

    .line 1016
    :cond_21
    move v1, v10

    .line 1017
    :goto_c
    and-int/2addr v0, v9

    .line 1018
    invoke-virtual {v6, v0, v1}, Li0/h0;->S(IZ)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v0

    .line 1022
    if-eqz v0, :cond_2d

    .line 1023
    .line 1024
    move-object/from16 v0, p0

    .line 1025
    .line 1026
    iget-object v11, v0, Lwb/n8;->i:Li0/a1;

    .line 1027
    .line 1028
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    check-cast v1, Ljava/lang/Boolean;

    .line 1033
    .line 1034
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1035
    .line 1036
    .line 1037
    move-result v1

    .line 1038
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 1039
    .line 1040
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v2

    .line 1044
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v3

    .line 1048
    sget-object v13, Li0/l;->a:Li0/e;

    .line 1049
    .line 1050
    if-nez v2, :cond_22

    .line 1051
    .line 1052
    if-ne v3, v13, :cond_23

    .line 1053
    .line 1054
    :cond_22
    new-instance v3, Lwb/wh;

    .line 1055
    .line 1056
    const/4 v2, 0x2

    .line 1057
    invoke-direct {v3, v12, v11, v2}, Lwb/wh;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1061
    .line 1062
    .line 1063
    :cond_23
    move-object v5, v3

    .line 1064
    check-cast v5, Lfg/l;

    .line 1065
    .line 1066
    const/16 v7, 0x1b0

    .line 1067
    .line 1068
    const/16 v8, 0x8

    .line 1069
    .line 1070
    const-string v2, "\u8bb0\u5f55\u8fd0\u884c\u65e5\u5fd7"

    .line 1071
    .line 1072
    const-string v3, "\u53ea\u4fdd\u7559\u6700\u8fd1 200 \u6761"

    .line 1073
    .line 1074
    const/4 v4, 0x0

    .line 1075
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1076
    .line 1077
    .line 1078
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    check-cast v1, Ljava/lang/Boolean;

    .line 1083
    .line 1084
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v1

    .line 1088
    if-eqz v1, :cond_2c

    .line 1089
    .line 1090
    const v1, 0x61f2f97b

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 1094
    .line 1095
    .line 1096
    const/4 v1, 0x0

    .line 1097
    invoke-static {v1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1098
    .line 1099
    .line 1100
    iget-object v2, v0, Lwb/n8;->j:Li0/a1;

    .line 1101
    .line 1102
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v3

    .line 1106
    check-cast v3, Ljava/lang/String;

    .line 1107
    .line 1108
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1109
    .line 1110
    .line 1111
    move-result v3

    .line 1112
    if-eqz v3, :cond_24

    .line 1113
    .line 1114
    const-string v3, "\u6682\u65e0\u8bb0\u5f55"

    .line 1115
    .line 1116
    goto :goto_e

    .line 1117
    :cond_24
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v3

    .line 1121
    check-cast v3, Ljava/lang/String;

    .line 1122
    .line 1123
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1124
    .line 1125
    .line 1126
    new-instance v4, Log/d;

    .line 1127
    .line 1128
    invoke-direct {v4, v3}, Log/d;-><init>(Ljava/lang/CharSequence;)V

    .line 1129
    .line 1130
    .line 1131
    move v3, v10

    .line 1132
    :goto_d
    invoke-virtual {v4}, Log/d;->hasNext()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v5

    .line 1136
    if-eqz v5, :cond_26

    .line 1137
    .line 1138
    invoke-virtual {v4}, Log/d;->next()Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    add-int/lit8 v3, v3, 0x1

    .line 1142
    .line 1143
    if-ltz v3, :cond_25

    .line 1144
    .line 1145
    goto :goto_d

    .line 1146
    :cond_25
    invoke-static {}, La/a;->P0()V

    .line 1147
    .line 1148
    .line 1149
    const/4 v1, 0x0

    .line 1150
    throw v1

    .line 1151
    :cond_26
    const-string v4, " \u6761\u8bb0\u5f55"

    .line 1152
    .line 1153
    invoke-static {v3, v4}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v3

    .line 1157
    :goto_e
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v4

    .line 1161
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v5

    .line 1165
    if-nez v4, :cond_27

    .line 1166
    .line 1167
    if-ne v5, v13, :cond_28

    .line 1168
    .line 1169
    :cond_27
    new-instance v5, Lwb/od;

    .line 1170
    .line 1171
    const/4 v4, 0x2

    .line 1172
    invoke-direct {v5, v12, v2, v4}, Lwb/od;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v6, v5}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1176
    .line 1177
    .line 1178
    :cond_28
    check-cast v5, Lfg/a;

    .line 1179
    .line 1180
    const-string v4, "\u5237\u65b0\u65e5\u5fd7"

    .line 1181
    .line 1182
    const/4 v7, 0x6

    .line 1183
    invoke-static {v4, v3, v5, v6, v7}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1184
    .line 1185
    .line 1186
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v3

    .line 1190
    check-cast v3, Ljava/lang/String;

    .line 1191
    .line 1192
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1193
    .line 1194
    .line 1195
    move-result v3

    .line 1196
    if-nez v3, :cond_2b

    .line 1197
    .line 1198
    const v3, 0x61f801ad

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v6, v3}, Li0/h0;->a0(I)V

    .line 1202
    .line 1203
    .line 1204
    invoke-static {v1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1205
    .line 1206
    .line 1207
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v3

    .line 1211
    check-cast v3, Ljava/lang/String;

    .line 1212
    .line 1213
    const/16 v4, 0x1388

    .line 1214
    .line 1215
    invoke-static {v4, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v3

    .line 1219
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 1220
    .line 1221
    invoke-virtual {v6, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v4

    .line 1225
    check-cast v4, Lbi/b;

    .line 1226
    .line 1227
    invoke-virtual {v4}, Lbi/b;->h()J

    .line 1228
    .line 1229
    .line 1230
    move-result-wide v4

    .line 1231
    const/16 v7, 0xc

    .line 1232
    .line 1233
    invoke-static {v7}, Lx6/d;->D(I)J

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v7

    .line 1237
    sget-object v11, Ly0/l;->a:Ly0/l;

    .line 1238
    .line 1239
    const/high16 v14, 0x3f800000    # 1.0f

    .line 1240
    .line 1241
    invoke-static {v11, v14}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v11

    .line 1245
    const/16 v14, 0x10

    .line 1246
    .line 1247
    int-to-float v14, v14

    .line 1248
    invoke-static {v11, v14}, Lp/d;->l(Ly0/o;F)Ly0/o;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v11

    .line 1252
    const/16 v22, 0x0

    .line 1253
    .line 1254
    const v23, 0x3ff68

    .line 1255
    .line 1256
    .line 1257
    move-object/from16 v20, v6

    .line 1258
    .line 1259
    move-wide/from16 v38, v7

    .line 1260
    .line 1261
    move v8, v1

    .line 1262
    move-object v1, v3

    .line 1263
    move-wide v3, v4

    .line 1264
    move-wide/from16 v5, v38

    .line 1265
    .line 1266
    const/4 v7, 0x0

    .line 1267
    move v14, v8

    .line 1268
    sget-object v8, Lm2/p;->b:Lm2/m;

    .line 1269
    .line 1270
    move v15, v9

    .line 1271
    move/from16 v16, v10

    .line 1272
    .line 1273
    const-wide/16 v9, 0x0

    .line 1274
    .line 1275
    move-object/from16 v17, v2

    .line 1276
    .line 1277
    move-object v2, v11

    .line 1278
    const/4 v11, 0x0

    .line 1279
    move-object/from16 v18, v12

    .line 1280
    .line 1281
    move-object/from16 v19, v13

    .line 1282
    .line 1283
    const-wide/16 v12, 0x0

    .line 1284
    .line 1285
    move/from16 v21, v14

    .line 1286
    .line 1287
    const/4 v14, 0x0

    .line 1288
    move/from16 v24, v15

    .line 1289
    .line 1290
    const/4 v15, 0x0

    .line 1291
    move/from16 v25, v16

    .line 1292
    .line 1293
    const/16 v16, 0x0

    .line 1294
    .line 1295
    move-object/from16 v26, v17

    .line 1296
    .line 1297
    const/16 v17, 0x0

    .line 1298
    .line 1299
    move-object/from16 v27, v18

    .line 1300
    .line 1301
    const/16 v18, 0x0

    .line 1302
    .line 1303
    move-object/from16 v28, v19

    .line 1304
    .line 1305
    const/16 v19, 0x0

    .line 1306
    .line 1307
    move/from16 v29, v21

    .line 1308
    .line 1309
    const/16 v21, 0x6030

    .line 1310
    .line 1311
    move-object/from16 v35, v26

    .line 1312
    .line 1313
    move-object/from16 v36, v28

    .line 1314
    .line 1315
    move/from16 v0, v29

    .line 1316
    .line 1317
    invoke-static/range {v1 .. v23}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 1318
    .line 1319
    .line 1320
    move-object/from16 v6, v20

    .line 1321
    .line 1322
    const/4 v1, 0x0

    .line 1323
    const/4 v15, 0x1

    .line 1324
    invoke-static {v0, v6, v1, v15}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1325
    .line 1326
    .line 1327
    move-object/from16 v0, v27

    .line 1328
    .line 1329
    invoke-virtual {v6, v0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v2

    .line 1333
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v3

    .line 1337
    if-nez v2, :cond_29

    .line 1338
    .line 1339
    move-object/from16 v2, v36

    .line 1340
    .line 1341
    if-ne v3, v2, :cond_2a

    .line 1342
    .line 1343
    :cond_29
    new-instance v3, Lwb/od;

    .line 1344
    .line 1345
    const/4 v2, 0x3

    .line 1346
    move-object/from16 v4, v35

    .line 1347
    .line 1348
    invoke-direct {v3, v0, v4, v2}, Lwb/od;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1349
    .line 1350
    .line 1351
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1352
    .line 1353
    .line 1354
    :cond_2a
    check-cast v3, Lfg/a;

    .line 1355
    .line 1356
    const/16 v0, 0x36

    .line 1357
    .line 1358
    const-string v2, "\u6e05\u7a7a\u65e5\u5fd7"

    .line 1359
    .line 1360
    const-string v4, "\u5220\u9664\u5f53\u524d\u81ea\u52a8\u70b9\u8d5e\u8fd0\u884c\u8bb0\u5f55"

    .line 1361
    .line 1362
    invoke-static {v2, v4, v3, v6, v0}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v6, v1}, Li0/h0;->p(Z)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_f

    .line 1369
    :cond_2b
    move v1, v10

    .line 1370
    const v0, 0x6203c810

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v6, v1}, Li0/h0;->p(Z)V

    .line 1377
    .line 1378
    .line 1379
    :goto_f
    invoke-virtual {v6, v1}, Li0/h0;->p(Z)V

    .line 1380
    .line 1381
    .line 1382
    goto :goto_10

    .line 1383
    :cond_2c
    move v1, v10

    .line 1384
    const v0, 0x62042cd0

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v6, v0}, Li0/h0;->a0(I)V

    .line 1388
    .line 1389
    .line 1390
    invoke-virtual {v6, v1}, Li0/h0;->p(Z)V

    .line 1391
    .line 1392
    .line 1393
    goto :goto_10

    .line 1394
    :cond_2d
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1395
    .line 1396
    .line 1397
    :goto_10
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 1398
    .line 1399
    return-object v0

    .line 1400
    :pswitch_4
    move-object/from16 v6, p1

    .line 1401
    .line 1402
    check-cast v6, Li0/h0;

    .line 1403
    .line 1404
    move-object/from16 v0, p2

    .line 1405
    .line 1406
    check-cast v0, Ljava/lang/Integer;

    .line 1407
    .line 1408
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1409
    .line 1410
    .line 1411
    move-result v0

    .line 1412
    and-int/lit8 v1, v0, 0x3

    .line 1413
    .line 1414
    const/4 v2, 0x2

    .line 1415
    const/4 v9, 0x1

    .line 1416
    const/4 v10, 0x0

    .line 1417
    if-eq v1, v2, :cond_2e

    .line 1418
    .line 1419
    move v1, v9

    .line 1420
    goto :goto_11

    .line 1421
    :cond_2e
    move v1, v10

    .line 1422
    :goto_11
    and-int/2addr v0, v9

    .line 1423
    invoke-virtual {v6, v0, v1}, Li0/h0;->S(IZ)Z

    .line 1424
    .line 1425
    .line 1426
    move-result v0

    .line 1427
    if-eqz v0, :cond_33

    .line 1428
    .line 1429
    move-object/from16 v0, p0

    .line 1430
    .line 1431
    iget-object v11, v0, Lwb/n8;->i:Li0/a1;

    .line 1432
    .line 1433
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v1

    .line 1437
    check-cast v1, Ljava/lang/Boolean;

    .line 1438
    .line 1439
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1440
    .line 1441
    .line 1442
    move-result v1

    .line 1443
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 1444
    .line 1445
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1446
    .line 1447
    .line 1448
    move-result v2

    .line 1449
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v3

    .line 1453
    sget-object v13, Li0/l;->a:Li0/e;

    .line 1454
    .line 1455
    if-nez v2, :cond_2f

    .line 1456
    .line 1457
    if-ne v3, v13, :cond_30

    .line 1458
    .line 1459
    :cond_2f
    new-instance v3, Lwb/me;

    .line 1460
    .line 1461
    const/16 v2, 0x10

    .line 1462
    .line 1463
    invoke-direct {v3, v12, v11, v2}, Lwb/me;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1464
    .line 1465
    .line 1466
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1467
    .line 1468
    .line 1469
    :cond_30
    move-object v5, v3

    .line 1470
    check-cast v5, Lfg/l;

    .line 1471
    .line 1472
    const/16 v7, 0x1b0

    .line 1473
    .line 1474
    const/16 v8, 0x8

    .line 1475
    .line 1476
    const-string v2, "\u81ea\u52a8\u53d1\u9001\u795d\u798f\u8bed"

    .line 1477
    .line 1478
    const-string v3, "\u62a2\u5230\u7ea2\u5305\u540e\u53d1\u9001\u795d\u798f\u8bed"

    .line 1479
    .line 1480
    const/4 v4, 0x0

    .line 1481
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 1482
    .line 1483
    .line 1484
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v1

    .line 1488
    check-cast v1, Ljava/lang/Boolean;

    .line 1489
    .line 1490
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1491
    .line 1492
    .line 1493
    move-result v1

    .line 1494
    if-eqz v1, :cond_32

    .line 1495
    .line 1496
    const v1, -0x18ef9ac2

    .line 1497
    .line 1498
    .line 1499
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 1500
    .line 1501
    .line 1502
    const/4 v11, 0x0

    .line 1503
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1504
    .line 1505
    .line 1506
    iget-object v1, v0, Lwb/n8;->j:Li0/a1;

    .line 1507
    .line 1508
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v2

    .line 1512
    move-object v3, v2

    .line 1513
    check-cast v3, Ljava/lang/String;

    .line 1514
    .line 1515
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v2

    .line 1519
    if-ne v2, v13, :cond_31

    .line 1520
    .line 1521
    new-instance v2, Lwb/mf;

    .line 1522
    .line 1523
    const/16 v4, 0x18

    .line 1524
    .line 1525
    invoke-direct {v2, v1, v4}, Lwb/mf;-><init>(Li0/a1;I)V

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v6, v2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1529
    .line 1530
    .line 1531
    :cond_31
    move-object v5, v2

    .line 1532
    check-cast v5, Lfg/l;

    .line 1533
    .line 1534
    const/16 v7, 0x6036

    .line 1535
    .line 1536
    const/16 v8, 0x8

    .line 1537
    .line 1538
    const-string v1, "\u795d\u798f\u8bed\u5185\u5bb9"

    .line 1539
    .line 1540
    const-string v2, "\u62a2\u5230\u7ea2\u5305\u540e\u53d1\u9001\u7684\u6587\u5b57"

    .line 1541
    .line 1542
    const/4 v4, 0x0

    .line 1543
    invoke-static/range {v1 .. v8}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 1544
    .line 1545
    .line 1546
    invoke-static {v11, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1547
    .line 1548
    .line 1549
    const/4 v5, 0x0

    .line 1550
    const/16 v7, 0x6db0

    .line 1551
    .line 1552
    const-string v2, "hb_wish_random"

    .line 1553
    .line 1554
    const-string v3, "\u968f\u673a\u795d\u798f\u8bed"

    .line 1555
    .line 1556
    const-string v4, "\u4ece\u6a21\u677f\u4e2d\u968f\u673a\u9009\u62e9"

    .line 1557
    .line 1558
    move-object v1, v12

    .line 1559
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 1563
    .line 1564
    .line 1565
    goto :goto_12

    .line 1566
    :cond_32
    const v1, -0x18eb6924

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 1570
    .line 1571
    .line 1572
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 1573
    .line 1574
    .line 1575
    goto :goto_12

    .line 1576
    :cond_33
    move-object/from16 v0, p0

    .line 1577
    .line 1578
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 1579
    .line 1580
    .line 1581
    :goto_12
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1582
    .line 1583
    return-object v1

    .line 1584
    :pswitch_5
    move-object/from16 v1, p1

    .line 1585
    .line 1586
    check-cast v1, Li0/h0;

    .line 1587
    .line 1588
    move-object/from16 v2, p2

    .line 1589
    .line 1590
    check-cast v2, Ljava/lang/Integer;

    .line 1591
    .line 1592
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1593
    .line 1594
    .line 1595
    move-result v2

    .line 1596
    and-int/lit8 v3, v2, 0x3

    .line 1597
    .line 1598
    const/4 v4, 0x2

    .line 1599
    const/4 v5, 0x1

    .line 1600
    if-eq v3, v4, :cond_34

    .line 1601
    .line 1602
    move v3, v5

    .line 1603
    goto :goto_13

    .line 1604
    :cond_34
    const/4 v3, 0x0

    .line 1605
    :goto_13
    and-int/2addr v2, v5

    .line 1606
    invoke-virtual {v1, v2, v3}, Li0/h0;->S(IZ)Z

    .line 1607
    .line 1608
    .line 1609
    move-result v2

    .line 1610
    if-eqz v2, :cond_38

    .line 1611
    .line 1612
    iget-object v2, v0, Lwb/n8;->i:Li0/a1;

    .line 1613
    .line 1614
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v3

    .line 1618
    check-cast v3, Ljava/lang/Number;

    .line 1619
    .line 1620
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 1621
    .line 1622
    .line 1623
    move-result-wide v3

    .line 1624
    const-wide/16 v5, 0x0

    .line 1625
    .line 1626
    cmp-long v3, v3, v5

    .line 1627
    .line 1628
    iget-object v4, v0, Lwb/n8;->j:Li0/a1;

    .line 1629
    .line 1630
    if-gtz v3, :cond_35

    .line 1631
    .line 1632
    const-string v3, "\u5c1a\u672a\u6267\u884c"

    .line 1633
    .line 1634
    goto :goto_14

    .line 1635
    :cond_35
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 1636
    .line 1637
    const-string v5, "MM-dd HH:mm:ss"

    .line 1638
    .line 1639
    sget-object v6, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 1640
    .line 1641
    invoke-direct {v3, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1642
    .line 1643
    .line 1644
    new-instance v5, Ljava/util/Date;

    .line 1645
    .line 1646
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v6

    .line 1650
    check-cast v6, Ljava/lang/Number;

    .line 1651
    .line 1652
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 1653
    .line 1654
    .line 1655
    move-result-wide v6

    .line 1656
    invoke-direct {v5, v6, v7}, Ljava/util/Date;-><init>(J)V

    .line 1657
    .line 1658
    .line 1659
    invoke-virtual {v3, v5}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v3

    .line 1663
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v5

    .line 1667
    check-cast v5, Ljava/lang/String;

    .line 1668
    .line 1669
    const-string v6, " \u00b7 "

    .line 1670
    .line 1671
    invoke-static {v3, v6, v5}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v3

    .line 1675
    :goto_14
    iget-object v5, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 1676
    .line 1677
    invoke-virtual {v1, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v6

    .line 1681
    invoke-virtual {v1}, Li0/h0;->P()Ljava/lang/Object;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v7

    .line 1685
    if-nez v6, :cond_36

    .line 1686
    .line 1687
    sget-object v6, Li0/l;->a:Li0/e;

    .line 1688
    .line 1689
    if-ne v7, v6, :cond_37

    .line 1690
    .line 1691
    :cond_36
    new-instance v7, Lwb/k9;

    .line 1692
    .line 1693
    const/4 v6, 0x1

    .line 1694
    invoke-direct {v7, v5, v2, v4, v6}, Lwb/k9;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 1695
    .line 1696
    .line 1697
    invoke-virtual {v1, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1698
    .line 1699
    .line 1700
    :cond_37
    check-cast v7, Lfg/a;

    .line 1701
    .line 1702
    const/4 v2, 0x6

    .line 1703
    const-string v4, "\u5237\u65b0\u72b6\u6001"

    .line 1704
    .line 1705
    invoke-static {v4, v3, v7, v1, v2}, Lwb/ho;->b(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;I)V

    .line 1706
    .line 1707
    .line 1708
    goto :goto_15

    .line 1709
    :cond_38
    invoke-virtual {v1}, Li0/h0;->V()V

    .line 1710
    .line 1711
    .line 1712
    :goto_15
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1713
    .line 1714
    return-object v1

    .line 1715
    :pswitch_6
    move-object/from16 v7, p1

    .line 1716
    .line 1717
    check-cast v7, Li0/h0;

    .line 1718
    .line 1719
    move-object/from16 v1, p2

    .line 1720
    .line 1721
    check-cast v1, Ljava/lang/Integer;

    .line 1722
    .line 1723
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1724
    .line 1725
    .line 1726
    move-result v1

    .line 1727
    and-int/lit8 v2, v1, 0x3

    .line 1728
    .line 1729
    const/4 v3, 0x2

    .line 1730
    const/4 v11, 0x1

    .line 1731
    const/4 v12, 0x0

    .line 1732
    if-eq v2, v3, :cond_39

    .line 1733
    .line 1734
    move v2, v11

    .line 1735
    goto :goto_16

    .line 1736
    :cond_39
    move v2, v12

    .line 1737
    :goto_16
    and-int/2addr v1, v11

    .line 1738
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 1739
    .line 1740
    .line 1741
    move-result v1

    .line 1742
    if-eqz v1, :cond_41

    .line 1743
    .line 1744
    iget-object v1, v0, Lwb/n8;->i:Li0/a1;

    .line 1745
    .line 1746
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v2

    .line 1750
    check-cast v2, Ljava/lang/String;

    .line 1751
    .line 1752
    const-string v13, "custom"

    .line 1753
    .line 1754
    invoke-static {v2, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1755
    .line 1756
    .line 1757
    move-result v3

    .line 1758
    const-string v4, "hidden"

    .line 1759
    .line 1760
    if-eqz v3, :cond_3a

    .line 1761
    .line 1762
    const-string v2, "\u4f7f\u7528\u81ea\u5b9a\u4e49\u65f6\u95f4\u683c\u5f0f"

    .line 1763
    .line 1764
    :goto_17
    move-object v3, v2

    .line 1765
    goto :goto_18

    .line 1766
    :cond_3a
    invoke-static {v2, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1767
    .line 1768
    .line 1769
    move-result v2

    .line 1770
    if-eqz v2, :cond_3b

    .line 1771
    .line 1772
    const-string v2, "\u9690\u85cf\u5fae\u4fe1\u539f\u751f\u804a\u5929\u65f6\u95f4"

    .line 1773
    .line 1774
    goto :goto_17

    .line 1775
    :cond_3b
    const-string v2, "\u4fdd\u6301\u5fae\u4fe1\u539f\u6837"

    .line 1776
    .line 1777
    goto :goto_17

    .line 1778
    :goto_18
    new-instance v2, Lwb/dq;

    .line 1779
    .line 1780
    const-string v5, "\u5fae\u4fe1\u539f\u6837"

    .line 1781
    .line 1782
    const-string v6, "original"

    .line 1783
    .line 1784
    invoke-direct {v2, v6, v5}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1785
    .line 1786
    .line 1787
    new-instance v5, Lwb/dq;

    .line 1788
    .line 1789
    const-string v6, "\u81ea\u5b9a\u4e49"

    .line 1790
    .line 1791
    invoke-direct {v5, v13, v6}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1792
    .line 1793
    .line 1794
    new-instance v6, Lwb/dq;

    .line 1795
    .line 1796
    const-string v8, "\u9690\u85cf"

    .line 1797
    .line 1798
    invoke-direct {v6, v4, v8}, Lwb/dq;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1799
    .line 1800
    .line 1801
    filled-new-array {v2, v5, v6}, [Lwb/dq;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v2

    .line 1805
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v4

    .line 1809
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v2

    .line 1813
    move-object v5, v2

    .line 1814
    check-cast v5, Ljava/lang/String;

    .line 1815
    .line 1816
    iget-object v14, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 1817
    .line 1818
    invoke-virtual {v7, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1819
    .line 1820
    .line 1821
    move-result v2

    .line 1822
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v6

    .line 1826
    sget-object v15, Li0/l;->a:Li0/e;

    .line 1827
    .line 1828
    if-nez v2, :cond_3c

    .line 1829
    .line 1830
    if-ne v6, v15, :cond_3d

    .line 1831
    .line 1832
    :cond_3c
    new-instance v6, Lwb/wb;

    .line 1833
    .line 1834
    const/4 v2, 0x3

    .line 1835
    invoke-direct {v6, v14, v1, v2}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1836
    .line 1837
    .line 1838
    invoke-virtual {v7, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1839
    .line 1840
    .line 1841
    :cond_3d
    check-cast v6, Lfg/l;

    .line 1842
    .line 1843
    const/4 v9, 0x6

    .line 1844
    const/16 v10, 0x20

    .line 1845
    .line 1846
    const-string v2, "\u663e\u793a\u65b9\u5f0f"

    .line 1847
    .line 1848
    move-object v8, v7

    .line 1849
    const/4 v7, 0x0

    .line 1850
    invoke-static/range {v2 .. v10}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 1851
    .line 1852
    .line 1853
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1854
    .line 1855
    .line 1856
    move-result-object v1

    .line 1857
    check-cast v1, Ljava/lang/String;

    .line 1858
    .line 1859
    invoke-static {v1, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1860
    .line 1861
    .line 1862
    move-result v1

    .line 1863
    if-eqz v1, :cond_40

    .line 1864
    .line 1865
    const v1, 0x696d9ff

    .line 1866
    .line 1867
    .line 1868
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 1869
    .line 1870
    .line 1871
    const/4 v1, 0x0

    .line 1872
    invoke-static {v1, v8, v12, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1873
    .line 1874
    .line 1875
    iget-object v1, v0, Lwb/n8;->j:Li0/a1;

    .line 1876
    .line 1877
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1878
    .line 1879
    .line 1880
    move-result-object v2

    .line 1881
    move-object v4, v2

    .line 1882
    check-cast v4, Ljava/lang/String;

    .line 1883
    .line 1884
    invoke-virtual {v8, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1885
    .line 1886
    .line 1887
    move-result v2

    .line 1888
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v3

    .line 1892
    if-nez v2, :cond_3e

    .line 1893
    .line 1894
    if-ne v3, v15, :cond_3f

    .line 1895
    .line 1896
    :cond_3e
    new-instance v3, Lwb/wb;

    .line 1897
    .line 1898
    const/4 v2, 0x4

    .line 1899
    invoke-direct {v3, v14, v1, v2}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 1903
    .line 1904
    .line 1905
    :cond_3f
    move-object v6, v3

    .line 1906
    check-cast v6, Lfg/l;

    .line 1907
    .line 1908
    move-object v7, v8

    .line 1909
    const/16 v8, 0x36

    .line 1910
    .line 1911
    const/16 v9, 0x8

    .line 1912
    .line 1913
    const-string v2, "\u65f6\u95f4\u683c\u5f0f"

    .line 1914
    .line 1915
    const-string v3, "\u4f8b\u5982 yyyy-MM-dd HH:mm:ss"

    .line 1916
    .line 1917
    const/4 v5, 0x0

    .line 1918
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 1919
    .line 1920
    .line 1921
    move-object v8, v7

    .line 1922
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1923
    .line 1924
    .line 1925
    goto :goto_19

    .line 1926
    :cond_40
    const v1, 0x69f5782

    .line 1927
    .line 1928
    .line 1929
    invoke-virtual {v8, v1}, Li0/h0;->a0(I)V

    .line 1930
    .line 1931
    .line 1932
    invoke-virtual {v8, v12}, Li0/h0;->p(Z)V

    .line 1933
    .line 1934
    .line 1935
    goto :goto_19

    .line 1936
    :cond_41
    move-object v8, v7

    .line 1937
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 1938
    .line 1939
    .line 1940
    :goto_19
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1941
    .line 1942
    return-object v1

    .line 1943
    :pswitch_7
    move-object/from16 v15, p1

    .line 1944
    .line 1945
    check-cast v15, Li0/h0;

    .line 1946
    .line 1947
    move-object/from16 v1, p2

    .line 1948
    .line 1949
    check-cast v1, Ljava/lang/Integer;

    .line 1950
    .line 1951
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1952
    .line 1953
    .line 1954
    move-result v1

    .line 1955
    and-int/lit8 v2, v1, 0x3

    .line 1956
    .line 1957
    const/4 v3, 0x2

    .line 1958
    const/4 v10, 0x0

    .line 1959
    const/4 v11, 0x1

    .line 1960
    if-eq v2, v3, :cond_42

    .line 1961
    .line 1962
    move v2, v11

    .line 1963
    goto :goto_1a

    .line 1964
    :cond_42
    move v2, v10

    .line 1965
    :goto_1a
    and-int/2addr v1, v11

    .line 1966
    invoke-virtual {v15, v1, v2}, Li0/h0;->S(IZ)Z

    .line 1967
    .line 1968
    .line 1969
    move-result v1

    .line 1970
    if-eqz v1, :cond_4a

    .line 1971
    .line 1972
    iget-object v1, v0, Lwb/n8;->i:Li0/a1;

    .line 1973
    .line 1974
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v2

    .line 1978
    check-cast v2, Ljava/lang/Boolean;

    .line 1979
    .line 1980
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1981
    .line 1982
    .line 1983
    move-result v2

    .line 1984
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 1985
    .line 1986
    invoke-virtual {v15, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 1987
    .line 1988
    .line 1989
    move-result v3

    .line 1990
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v4

    .line 1994
    sget-object v13, Li0/l;->a:Li0/e;

    .line 1995
    .line 1996
    if-nez v3, :cond_43

    .line 1997
    .line 1998
    if-ne v4, v13, :cond_44

    .line 1999
    .line 2000
    :cond_43
    new-instance v4, Lwb/wb;

    .line 2001
    .line 2002
    const/16 v3, 0xd

    .line 2003
    .line 2004
    invoke-direct {v4, v12, v1, v3}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 2005
    .line 2006
    .line 2007
    invoke-virtual {v15, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2008
    .line 2009
    .line 2010
    :cond_44
    move-object v6, v4

    .line 2011
    check-cast v6, Lfg/l;

    .line 2012
    .line 2013
    const/16 v8, 0x1b0

    .line 2014
    .line 2015
    const/16 v9, 0x8

    .line 2016
    .line 2017
    const-string v3, "\u542f\u7528\u5706\u89d2\u5934\u50cf"

    .line 2018
    .line 2019
    const-string v4, "\u7edf\u4e00\u5e94\u7528\u5230\u5fae\u4fe1\u754c\u9762\u548c\u901a\u77e5\u5934\u50cf"

    .line 2020
    .line 2021
    const/4 v5, 0x0

    .line 2022
    move-object v7, v15

    .line 2023
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 2024
    .line 2025
    .line 2026
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2027
    .line 2028
    .line 2029
    move-result-object v1

    .line 2030
    check-cast v1, Ljava/lang/Boolean;

    .line 2031
    .line 2032
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2033
    .line 2034
    .line 2035
    move-result v1

    .line 2036
    if-eqz v1, :cond_49

    .line 2037
    .line 2038
    const v1, -0x321a059f

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v15, v1}, Li0/h0;->a0(I)V

    .line 2042
    .line 2043
    .line 2044
    const/4 v1, 0x0

    .line 2045
    invoke-static {v1, v15, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 2046
    .line 2047
    .line 2048
    sget-object v1, Ly0/l;->a:Ly0/l;

    .line 2049
    .line 2050
    const/high16 v2, 0x3f800000    # 1.0f

    .line 2051
    .line 2052
    invoke-static {v1, v2}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v3

    .line 2056
    const/16 v4, 0x10

    .line 2057
    .line 2058
    int-to-float v4, v4

    .line 2059
    const/16 v5, 0xe

    .line 2060
    .line 2061
    int-to-float v5, v5

    .line 2062
    invoke-static {v3, v4, v5}, Lp/d;->m(Ly0/o;FF)Ly0/o;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v3

    .line 2066
    sget-object v4, Lp/j;->c:Lp/e;

    .line 2067
    .line 2068
    sget-object v5, Ly0/b;->s:Ly0/e;

    .line 2069
    .line 2070
    invoke-static {v4, v5, v15, v10}, Lp/s;->a(Lp/i;Ly0/e;Li0/h0;I)Lp/t;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v4

    .line 2074
    iget-wide v5, v15, Li0/h0;->T:J

    .line 2075
    .line 2076
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 2077
    .line 2078
    .line 2079
    move-result v5

    .line 2080
    invoke-virtual {v15}, Li0/h0;->l()Ls0/h;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v6

    .line 2084
    invoke-static {v15, v3}, Ly0/a;->c(Li0/h0;Ly0/o;)Ly0/o;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v3

    .line 2088
    sget-object v7, Lx1/g;->f:Lx1/f;

    .line 2089
    .line 2090
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2091
    .line 2092
    .line 2093
    sget-object v7, Lx1/f;->b:Lx1/y;

    .line 2094
    .line 2095
    invoke-virtual {v15}, Li0/h0;->d0()V

    .line 2096
    .line 2097
    .line 2098
    iget-boolean v8, v15, Li0/h0;->S:Z

    .line 2099
    .line 2100
    if-eqz v8, :cond_45

    .line 2101
    .line 2102
    invoke-virtual {v15, v7}, Li0/h0;->k(Lfg/a;)V

    .line 2103
    .line 2104
    .line 2105
    goto :goto_1b

    .line 2106
    :cond_45
    invoke-virtual {v15}, Li0/h0;->n0()V

    .line 2107
    .line 2108
    .line 2109
    :goto_1b
    sget-object v7, Lx1/f;->e:Lx1/e;

    .line 2110
    .line 2111
    invoke-static {v7, v15, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2112
    .line 2113
    .line 2114
    sget-object v4, Lx1/f;->d:Lx1/e;

    .line 2115
    .line 2116
    invoke-static {v4, v15, v6}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2117
    .line 2118
    .line 2119
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2120
    .line 2121
    .line 2122
    move-result-object v4

    .line 2123
    sget-object v5, Lx1/f;->f:Lx1/e;

    .line 2124
    .line 2125
    invoke-static {v5, v15, v4}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2126
    .line 2127
    .line 2128
    sget-object v4, Lx1/f;->g:Lx1/d;

    .line 2129
    .line 2130
    invoke-static {v4, v15}, Li0/r;->w(Lfg/l;Li0/h0;)V

    .line 2131
    .line 2132
    .line 2133
    sget-object v4, Lx1/f;->c:Lx1/e;

    .line 2134
    .line 2135
    invoke-static {v4, v15, v3}, Li0/r;->A(Lfg/p;Li0/h0;Ljava/lang/Object;)V

    .line 2136
    .line 2137
    .line 2138
    iget-object v3, v0, Lwb/n8;->j:Li0/a1;

    .line 2139
    .line 2140
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v4

    .line 2144
    check-cast v4, Ljava/lang/Number;

    .line 2145
    .line 2146
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 2147
    .line 2148
    .line 2149
    move-result v4

    .line 2150
    const v5, 0x3dcccccd    # 0.1f

    .line 2151
    .line 2152
    .line 2153
    const/high16 v6, 0x3f000000    # 0.5f

    .line 2154
    .line 2155
    invoke-static {v4, v5, v6}, Lr9/e0;->q(FFF)F

    .line 2156
    .line 2157
    .line 2158
    move-result v4

    .line 2159
    const/high16 v7, 0x42c80000    # 100.0f

    .line 2160
    .line 2161
    mul-float/2addr v4, v7

    .line 2162
    invoke-static {v4}, Lig/a;->X(F)I

    .line 2163
    .line 2164
    .line 2165
    move-result v4

    .line 2166
    int-to-float v4, v4

    .line 2167
    div-float/2addr v4, v7

    .line 2168
    mul-float/2addr v4, v7

    .line 2169
    invoke-static {v4}, Lig/a;->X(F)I

    .line 2170
    .line 2171
    .line 2172
    move-result v4

    .line 2173
    const-string v7, "\u5706\u89d2\u5f27\u5ea6 "

    .line 2174
    .line 2175
    const-string v8, "%"

    .line 2176
    .line 2177
    invoke-static {v4, v7, v8}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2178
    .line 2179
    .line 2180
    move-result-object v4

    .line 2181
    sget-object v7, Lbi/d;->a:Li0/m2;

    .line 2182
    .line 2183
    invoke-virtual {v15, v7}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v7

    .line 2187
    check-cast v7, Lbi/b;

    .line 2188
    .line 2189
    invoke-virtual {v7}, Lbi/b;->g()J

    .line 2190
    .line 2191
    .line 2192
    move-result-wide v7

    .line 2193
    move v9, v5

    .line 2194
    move-wide/from16 v38, v7

    .line 2195
    .line 2196
    move v7, v2

    .line 2197
    move-object v2, v4

    .line 2198
    move-wide/from16 v4, v38

    .line 2199
    .line 2200
    sget-object v8, Lm2/k;->j:Lm2/k;

    .line 2201
    .line 2202
    const/16 v23, 0x0

    .line 2203
    .line 2204
    const v24, 0x3ffba

    .line 2205
    .line 2206
    .line 2207
    move-object v14, v3

    .line 2208
    const/4 v3, 0x0

    .line 2209
    move/from16 v17, v6

    .line 2210
    .line 2211
    move/from16 v16, v7

    .line 2212
    .line 2213
    const-wide/16 v6, 0x0

    .line 2214
    .line 2215
    move/from16 v18, v9

    .line 2216
    .line 2217
    const/4 v9, 0x0

    .line 2218
    move/from16 v19, v10

    .line 2219
    .line 2220
    move/from16 v20, v11

    .line 2221
    .line 2222
    const-wide/16 v10, 0x0

    .line 2223
    .line 2224
    move-object/from16 v21, v12

    .line 2225
    .line 2226
    const/4 v12, 0x0

    .line 2227
    move-object/from16 v25, v13

    .line 2228
    .line 2229
    move-object/from16 v22, v14

    .line 2230
    .line 2231
    const-wide/16 v13, 0x0

    .line 2232
    .line 2233
    move-object/from16 v26, v21

    .line 2234
    .line 2235
    move-object/from16 v21, v15

    .line 2236
    .line 2237
    const/4 v15, 0x0

    .line 2238
    move/from16 v27, v16

    .line 2239
    .line 2240
    const/16 v16, 0x0

    .line 2241
    .line 2242
    move/from16 v28, v17

    .line 2243
    .line 2244
    const/16 v17, 0x0

    .line 2245
    .line 2246
    move/from16 v29, v18

    .line 2247
    .line 2248
    const/16 v18, 0x0

    .line 2249
    .line 2250
    move/from16 v30, v19

    .line 2251
    .line 2252
    const/16 v19, 0x0

    .line 2253
    .line 2254
    move/from16 v31, v20

    .line 2255
    .line 2256
    const/16 v20, 0x0

    .line 2257
    .line 2258
    move-object/from16 v32, v22

    .line 2259
    .line 2260
    const/high16 v22, 0x180000

    .line 2261
    .line 2262
    move-object/from16 v0, v25

    .line 2263
    .line 2264
    move-object/from16 v37, v26

    .line 2265
    .line 2266
    invoke-static/range {v2 .. v24}, Lsh/s;->n(Ljava/lang/String;Ly0/o;JJLm2/k;Lm2/p;JLt2/k;JIZIILfg/l;Li2/n0;Li0/h0;III)V

    .line 2267
    .line 2268
    .line 2269
    move-object/from16 v15, v21

    .line 2270
    .line 2271
    invoke-interface/range {v32 .. v32}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v2

    .line 2275
    check-cast v2, Ljava/lang/Number;

    .line 2276
    .line 2277
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 2278
    .line 2279
    .line 2280
    move-result v2

    .line 2281
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v3

    .line 2285
    if-ne v3, v0, :cond_46

    .line 2286
    .line 2287
    new-instance v3, Lwb/hd;

    .line 2288
    .line 2289
    const/16 v4, 0x12

    .line 2290
    .line 2291
    move-object/from16 v14, v32

    .line 2292
    .line 2293
    invoke-direct {v3, v14, v4}, Lwb/hd;-><init>(Li0/a1;I)V

    .line 2294
    .line 2295
    .line 2296
    invoke-virtual {v15, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2297
    .line 2298
    .line 2299
    goto :goto_1c

    .line 2300
    :cond_46
    move-object/from16 v14, v32

    .line 2301
    .line 2302
    :goto_1c
    check-cast v3, Lfg/l;

    .line 2303
    .line 2304
    const/high16 v7, 0x3f800000    # 1.0f

    .line 2305
    .line 2306
    invoke-static {v1, v7}, Lp/h1;->d(Ly0/o;F)Ly0/o;

    .line 2307
    .line 2308
    .line 2309
    move-result-object v8

    .line 2310
    const/16 v1, 0x8

    .line 2311
    .line 2312
    int-to-float v10, v1

    .line 2313
    const/4 v12, 0x0

    .line 2314
    const/16 v13, 0xd

    .line 2315
    .line 2316
    const/4 v9, 0x0

    .line 2317
    const/4 v11, 0x0

    .line 2318
    invoke-static/range {v8 .. v13}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 2319
    .line 2320
    .line 2321
    move-result-object v4

    .line 2322
    new-instance v6, Llg/a;

    .line 2323
    .line 2324
    const/high16 v1, 0x3f000000    # 0.5f

    .line 2325
    .line 2326
    const v9, 0x3dcccccd    # 0.1f

    .line 2327
    .line 2328
    .line 2329
    invoke-direct {v6, v9, v1}, Llg/a;-><init>(FF)V

    .line 2330
    .line 2331
    .line 2332
    move-object/from16 v5, v37

    .line 2333
    .line 2334
    invoke-virtual {v15, v5}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2335
    .line 2336
    .line 2337
    move-result v7

    .line 2338
    invoke-virtual {v15}, Li0/h0;->P()Ljava/lang/Object;

    .line 2339
    .line 2340
    .line 2341
    move-result-object v8

    .line 2342
    if-nez v7, :cond_47

    .line 2343
    .line 2344
    if-ne v8, v0, :cond_48

    .line 2345
    .line 2346
    :cond_47
    new-instance v8, Lwb/od;

    .line 2347
    .line 2348
    const/4 v0, 0x0

    .line 2349
    invoke-direct {v8, v5, v14, v0}, Lwb/od;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 2350
    .line 2351
    .line 2352
    invoke-virtual {v15, v8}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2353
    .line 2354
    .line 2355
    :cond_48
    check-cast v8, Lfg/a;

    .line 2356
    .line 2357
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v0

    .line 2361
    const v5, 0x3e4ccccd    # 0.2f

    .line 2362
    .line 2363
    .line 2364
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v5

    .line 2368
    const v7, 0x3e99999a    # 0.3f

    .line 2369
    .line 2370
    .line 2371
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v7

    .line 2375
    const v9, 0x3ecccccd    # 0.4f

    .line 2376
    .line 2377
    .line 2378
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v9

    .line 2382
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 2383
    .line 2384
    .line 2385
    move-result-object v1

    .line 2386
    filled-new-array {v0, v5, v7, v9, v1}, [Ljava/lang/Float;

    .line 2387
    .line 2388
    .line 2389
    move-result-object v0

    .line 2390
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 2391
    .line 2392
    .line 2393
    move-result-object v13

    .line 2394
    const v16, 0x301b0

    .line 2395
    .line 2396
    .line 2397
    const/16 v17, 0x2788

    .line 2398
    .line 2399
    const/4 v5, 0x0

    .line 2400
    const/16 v7, 0x27

    .line 2401
    .line 2402
    const/4 v9, 0x0

    .line 2403
    const/4 v10, 0x0

    .line 2404
    const/4 v11, 0x0

    .line 2405
    const/4 v12, 0x1

    .line 2406
    const/4 v14, 0x0

    .line 2407
    invoke-static/range {v2 .. v17}, Lsh/f1;->a(FLfg/l;Ly0/o;ZLlg/a;ILfg/a;FLsh/r0;Lsh/s0;ZLjava/util/List;FLi0/h0;II)V

    .line 2408
    .line 2409
    .line 2410
    const/4 v0, 0x1

    .line 2411
    invoke-virtual {v15, v0}, Li0/h0;->p(Z)V

    .line 2412
    .line 2413
    .line 2414
    const/4 v0, 0x0

    .line 2415
    invoke-virtual {v15, v0}, Li0/h0;->p(Z)V

    .line 2416
    .line 2417
    .line 2418
    goto :goto_1d

    .line 2419
    :cond_49
    move v0, v10

    .line 2420
    const v1, -0x3201ae23

    .line 2421
    .line 2422
    .line 2423
    invoke-virtual {v15, v1}, Li0/h0;->a0(I)V

    .line 2424
    .line 2425
    .line 2426
    invoke-virtual {v15, v0}, Li0/h0;->p(Z)V

    .line 2427
    .line 2428
    .line 2429
    goto :goto_1d

    .line 2430
    :cond_4a
    invoke-virtual {v15}, Li0/h0;->V()V

    .line 2431
    .line 2432
    .line 2433
    :goto_1d
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2434
    .line 2435
    return-object v0

    .line 2436
    :pswitch_8
    move-object/from16 v6, p1

    .line 2437
    .line 2438
    check-cast v6, Li0/h0;

    .line 2439
    .line 2440
    move-object/from16 v0, p2

    .line 2441
    .line 2442
    check-cast v0, Ljava/lang/Integer;

    .line 2443
    .line 2444
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2445
    .line 2446
    .line 2447
    move-result v0

    .line 2448
    and-int/lit8 v1, v0, 0x3

    .line 2449
    .line 2450
    const/4 v2, 0x2

    .line 2451
    const/4 v9, 0x1

    .line 2452
    const/4 v10, 0x0

    .line 2453
    if-eq v1, v2, :cond_4b

    .line 2454
    .line 2455
    move v1, v9

    .line 2456
    goto :goto_1e

    .line 2457
    :cond_4b
    move v1, v10

    .line 2458
    :goto_1e
    and-int/2addr v0, v9

    .line 2459
    invoke-virtual {v6, v0, v1}, Li0/h0;->S(IZ)Z

    .line 2460
    .line 2461
    .line 2462
    move-result v0

    .line 2463
    if-eqz v0, :cond_51

    .line 2464
    .line 2465
    move-object/from16 v0, p0

    .line 2466
    .line 2467
    iget-object v11, v0, Lwb/n8;->i:Li0/a1;

    .line 2468
    .line 2469
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v1

    .line 2473
    check-cast v1, Ljava/lang/Boolean;

    .line 2474
    .line 2475
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2476
    .line 2477
    .line 2478
    move-result v1

    .line 2479
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 2480
    .line 2481
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2482
    .line 2483
    .line 2484
    move-result v2

    .line 2485
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 2486
    .line 2487
    .line 2488
    move-result-object v3

    .line 2489
    sget-object v13, Li0/l;->a:Li0/e;

    .line 2490
    .line 2491
    if-nez v2, :cond_4c

    .line 2492
    .line 2493
    if-ne v3, v13, :cond_4d

    .line 2494
    .line 2495
    :cond_4c
    new-instance v3, Lwb/wb;

    .line 2496
    .line 2497
    const/16 v2, 0x15

    .line 2498
    .line 2499
    invoke-direct {v3, v12, v11, v2}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 2500
    .line 2501
    .line 2502
    invoke-virtual {v6, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2503
    .line 2504
    .line 2505
    :cond_4d
    move-object v5, v3

    .line 2506
    check-cast v5, Lfg/l;

    .line 2507
    .line 2508
    const/16 v7, 0x1b0

    .line 2509
    .line 2510
    const/16 v8, 0x8

    .line 2511
    .line 2512
    const-string v2, "\u542f\u7528\u6d88\u606f\u6c14\u6ce1"

    .line 2513
    .line 2514
    const-string v3, "\u4f7f\u7528\u672c\u5730\u56fe\u7247\u66ff\u6362\u5fae\u4fe1\u539f\u751f\u6d88\u606f\u6c14\u6ce1"

    .line 2515
    .line 2516
    const/4 v4, 0x0

    .line 2517
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 2518
    .line 2519
    .line 2520
    invoke-interface {v11}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v1

    .line 2524
    check-cast v1, Ljava/lang/Boolean;

    .line 2525
    .line 2526
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2527
    .line 2528
    .line 2529
    move-result v1

    .line 2530
    if-eqz v1, :cond_50

    .line 2531
    .line 2532
    const v1, -0x3e143a13

    .line 2533
    .line 2534
    .line 2535
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 2536
    .line 2537
    .line 2538
    const/4 v1, 0x0

    .line 2539
    invoke-static {v1, v6, v10, v9}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 2540
    .line 2541
    .line 2542
    iget-object v1, v0, Lwb/n8;->j:Li0/a1;

    .line 2543
    .line 2544
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2545
    .line 2546
    .line 2547
    move-result-object v2

    .line 2548
    check-cast v2, Ljava/lang/Boolean;

    .line 2549
    .line 2550
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2551
    .line 2552
    .line 2553
    move-result v2

    .line 2554
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2555
    .line 2556
    .line 2557
    move-result v3

    .line 2558
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 2559
    .line 2560
    .line 2561
    move-result-object v4

    .line 2562
    if-nez v3, :cond_4e

    .line 2563
    .line 2564
    if-ne v4, v13, :cond_4f

    .line 2565
    .line 2566
    :cond_4e
    new-instance v4, Lwb/wb;

    .line 2567
    .line 2568
    const/16 v3, 0x16

    .line 2569
    .line 2570
    invoke-direct {v4, v12, v1, v3}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 2571
    .line 2572
    .line 2573
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2574
    .line 2575
    .line 2576
    :cond_4f
    move-object v5, v4

    .line 2577
    check-cast v5, Lfg/l;

    .line 2578
    .line 2579
    const/16 v7, 0x1b0

    .line 2580
    .line 2581
    const/16 v8, 0x8

    .line 2582
    .line 2583
    move v1, v2

    .line 2584
    const-string v2, "\u6df1\u8272\u6a21\u5f0f\u5355\u72ec\u8bbe\u7f6e"

    .line 2585
    .line 2586
    const-string v3, "\u672a\u8bbe\u7f6e\u6df1\u8272\u6c14\u6ce1\u65f6\u81ea\u52a8\u6cbf\u7528\u5bf9\u5e94\u6d45\u8272\u6c14\u6ce1"

    .line 2587
    .line 2588
    const/4 v4, 0x0

    .line 2589
    invoke-static/range {v1 .. v8}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 2590
    .line 2591
    .line 2592
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 2593
    .line 2594
    .line 2595
    goto :goto_1f

    .line 2596
    :cond_50
    const v1, -0x3e0b5eb7

    .line 2597
    .line 2598
    .line 2599
    invoke-virtual {v6, v1}, Li0/h0;->a0(I)V

    .line 2600
    .line 2601
    .line 2602
    invoke-virtual {v6, v10}, Li0/h0;->p(Z)V

    .line 2603
    .line 2604
    .line 2605
    goto :goto_1f

    .line 2606
    :cond_51
    move-object/from16 v0, p0

    .line 2607
    .line 2608
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 2609
    .line 2610
    .line 2611
    :goto_1f
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2612
    .line 2613
    return-object v1

    .line 2614
    :pswitch_9
    move-object/from16 v6, p1

    .line 2615
    .line 2616
    check-cast v6, Li0/h0;

    .line 2617
    .line 2618
    move-object/from16 v1, p2

    .line 2619
    .line 2620
    check-cast v1, Ljava/lang/Integer;

    .line 2621
    .line 2622
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2623
    .line 2624
    .line 2625
    move-result v1

    .line 2626
    and-int/lit8 v2, v1, 0x3

    .line 2627
    .line 2628
    const/4 v3, 0x2

    .line 2629
    const/4 v10, 0x1

    .line 2630
    const/4 v11, 0x0

    .line 2631
    if-eq v2, v3, :cond_52

    .line 2632
    .line 2633
    move v2, v10

    .line 2634
    goto :goto_20

    .line 2635
    :cond_52
    move v2, v11

    .line 2636
    :goto_20
    and-int/2addr v1, v10

    .line 2637
    invoke-virtual {v6, v1, v2}, Li0/h0;->S(IZ)Z

    .line 2638
    .line 2639
    .line 2640
    move-result v1

    .line 2641
    if-eqz v1, :cond_58

    .line 2642
    .line 2643
    iget-object v1, v0, Lwb/n8;->i:Li0/a1;

    .line 2644
    .line 2645
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2646
    .line 2647
    .line 2648
    move-result-object v2

    .line 2649
    check-cast v2, Ljava/lang/Boolean;

    .line 2650
    .line 2651
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2652
    .line 2653
    .line 2654
    move-result v2

    .line 2655
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 2656
    .line 2657
    invoke-virtual {v6, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2658
    .line 2659
    .line 2660
    move-result v3

    .line 2661
    invoke-virtual {v6}, Li0/h0;->P()Ljava/lang/Object;

    .line 2662
    .line 2663
    .line 2664
    move-result-object v4

    .line 2665
    sget-object v13, Li0/l;->a:Li0/e;

    .line 2666
    .line 2667
    if-nez v3, :cond_53

    .line 2668
    .line 2669
    if-ne v4, v13, :cond_54

    .line 2670
    .line 2671
    :cond_53
    new-instance v4, Lwb/wb;

    .line 2672
    .line 2673
    const/16 v3, 0x12

    .line 2674
    .line 2675
    invoke-direct {v4, v12, v1, v3}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 2676
    .line 2677
    .line 2678
    invoke-virtual {v6, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2679
    .line 2680
    .line 2681
    :cond_54
    check-cast v4, Lfg/l;

    .line 2682
    .line 2683
    const/16 v8, 0x1b0

    .line 2684
    .line 2685
    const/16 v9, 0x8

    .line 2686
    .line 2687
    const-string v3, "\u4f2a\u9020\u8bed\u97f3\u65f6\u957f"

    .line 2688
    .line 2689
    move-object v7, v6

    .line 2690
    move-object v6, v4

    .line 2691
    const-string v4, "\u53d1\u9001\u8bed\u97f3\u65f6\u4f7f\u7528\u81ea\u5b9a\u4e49\u663e\u793a\u65f6\u957f"

    .line 2692
    .line 2693
    const/4 v5, 0x0

    .line 2694
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 2695
    .line 2696
    .line 2697
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2698
    .line 2699
    .line 2700
    move-result-object v1

    .line 2701
    check-cast v1, Ljava/lang/Boolean;

    .line 2702
    .line 2703
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2704
    .line 2705
    .line 2706
    move-result v1

    .line 2707
    if-eqz v1, :cond_57

    .line 2708
    .line 2709
    const v1, 0x2d6832ac

    .line 2710
    .line 2711
    .line 2712
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 2713
    .line 2714
    .line 2715
    const/4 v1, 0x0

    .line 2716
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 2717
    .line 2718
    .line 2719
    iget-object v1, v0, Lwb/n8;->j:Li0/a1;

    .line 2720
    .line 2721
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2722
    .line 2723
    .line 2724
    move-result-object v2

    .line 2725
    move-object v4, v2

    .line 2726
    check-cast v4, Ljava/lang/String;

    .line 2727
    .line 2728
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2729
    .line 2730
    .line 2731
    move-result v2

    .line 2732
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 2733
    .line 2734
    .line 2735
    move-result-object v3

    .line 2736
    if-nez v2, :cond_55

    .line 2737
    .line 2738
    if-ne v3, v13, :cond_56

    .line 2739
    .line 2740
    :cond_55
    new-instance v3, Lwb/wb;

    .line 2741
    .line 2742
    const/16 v2, 0x13

    .line 2743
    .line 2744
    invoke-direct {v3, v12, v1, v2}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 2745
    .line 2746
    .line 2747
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2748
    .line 2749
    .line 2750
    :cond_56
    move-object v5, v3

    .line 2751
    check-cast v5, Lfg/l;

    .line 2752
    .line 2753
    move-object v6, v7

    .line 2754
    const/16 v7, 0x36

    .line 2755
    .line 2756
    const-string v2, "\u663e\u793a\u65f6\u957f"

    .line 2757
    .line 2758
    const-string v3, "\u5355\u4f4d\u79d2\uff0c1-60"

    .line 2759
    .line 2760
    invoke-static/range {v2 .. v7}, Lwb/ho;->w2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/l;Li0/h0;I)V

    .line 2761
    .line 2762
    .line 2763
    move-object v7, v6

    .line 2764
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 2765
    .line 2766
    .line 2767
    goto :goto_21

    .line 2768
    :cond_57
    const v1, 0x2d76abc7

    .line 2769
    .line 2770
    .line 2771
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 2772
    .line 2773
    .line 2774
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 2775
    .line 2776
    .line 2777
    goto :goto_21

    .line 2778
    :cond_58
    move-object v7, v6

    .line 2779
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 2780
    .line 2781
    .line 2782
    :goto_21
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2783
    .line 2784
    return-object v1

    .line 2785
    :pswitch_a
    move-object/from16 v7, p1

    .line 2786
    .line 2787
    check-cast v7, Li0/h0;

    .line 2788
    .line 2789
    move-object/from16 v1, p2

    .line 2790
    .line 2791
    check-cast v1, Ljava/lang/Integer;

    .line 2792
    .line 2793
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2794
    .line 2795
    .line 2796
    move-result v1

    .line 2797
    and-int/lit8 v2, v1, 0x3

    .line 2798
    .line 2799
    const/4 v3, 0x2

    .line 2800
    const/4 v10, 0x1

    .line 2801
    const/4 v11, 0x0

    .line 2802
    if-eq v2, v3, :cond_59

    .line 2803
    .line 2804
    move v2, v10

    .line 2805
    goto :goto_22

    .line 2806
    :cond_59
    move v2, v11

    .line 2807
    :goto_22
    and-int/2addr v1, v10

    .line 2808
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 2809
    .line 2810
    .line 2811
    move-result v1

    .line 2812
    if-eqz v1, :cond_5f

    .line 2813
    .line 2814
    iget-object v1, v0, Lwb/n8;->i:Li0/a1;

    .line 2815
    .line 2816
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2817
    .line 2818
    .line 2819
    move-result-object v2

    .line 2820
    check-cast v2, Ljava/lang/Boolean;

    .line 2821
    .line 2822
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2823
    .line 2824
    .line 2825
    move-result v2

    .line 2826
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 2827
    .line 2828
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2829
    .line 2830
    .line 2831
    move-result v3

    .line 2832
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 2833
    .line 2834
    .line 2835
    move-result-object v4

    .line 2836
    sget-object v13, Li0/l;->a:Li0/e;

    .line 2837
    .line 2838
    if-nez v3, :cond_5a

    .line 2839
    .line 2840
    if-ne v4, v13, :cond_5b

    .line 2841
    .line 2842
    :cond_5a
    new-instance v4, Lwb/wb;

    .line 2843
    .line 2844
    const/16 v3, 0xe

    .line 2845
    .line 2846
    invoke-direct {v4, v12, v1, v3}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 2847
    .line 2848
    .line 2849
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2850
    .line 2851
    .line 2852
    :cond_5b
    move-object v6, v4

    .line 2853
    check-cast v6, Lfg/l;

    .line 2854
    .line 2855
    const/16 v8, 0x1b0

    .line 2856
    .line 2857
    const/16 v9, 0x8

    .line 2858
    .line 2859
    const-string v3, "\u670b\u53cb\u5708\u5173\u952e\u8bcd\u5c4f\u853d"

    .line 2860
    .line 2861
    const-string v4, "\u9690\u85cf\u6b63\u6587\u547d\u4e2d\u4efb\u610f\u5173\u952e\u8bcd\u7684\u670b\u53cb\u5708"

    .line 2862
    .line 2863
    const/4 v5, 0x0

    .line 2864
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 2865
    .line 2866
    .line 2867
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2868
    .line 2869
    .line 2870
    move-result-object v1

    .line 2871
    check-cast v1, Ljava/lang/Boolean;

    .line 2872
    .line 2873
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2874
    .line 2875
    .line 2876
    move-result v1

    .line 2877
    if-eqz v1, :cond_5e

    .line 2878
    .line 2879
    const v1, 0x191ea6cc

    .line 2880
    .line 2881
    .line 2882
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 2883
    .line 2884
    .line 2885
    const/4 v1, 0x0

    .line 2886
    invoke-static {v1, v7, v11, v10}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 2887
    .line 2888
    .line 2889
    iget-object v1, v0, Lwb/n8;->j:Li0/a1;

    .line 2890
    .line 2891
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2892
    .line 2893
    .line 2894
    move-result-object v2

    .line 2895
    move-object v4, v2

    .line 2896
    check-cast v4, Ljava/lang/String;

    .line 2897
    .line 2898
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2899
    .line 2900
    .line 2901
    move-result v2

    .line 2902
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 2903
    .line 2904
    .line 2905
    move-result-object v3

    .line 2906
    if-nez v2, :cond_5c

    .line 2907
    .line 2908
    if-ne v3, v13, :cond_5d

    .line 2909
    .line 2910
    :cond_5c
    new-instance v3, Lwb/wb;

    .line 2911
    .line 2912
    const/16 v2, 0xf

    .line 2913
    .line 2914
    invoke-direct {v3, v12, v1, v2}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 2915
    .line 2916
    .line 2917
    invoke-virtual {v7, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 2918
    .line 2919
    .line 2920
    :cond_5d
    move-object v6, v3

    .line 2921
    check-cast v6, Lfg/l;

    .line 2922
    .line 2923
    const/16 v8, 0xc36

    .line 2924
    .line 2925
    const/4 v9, 0x0

    .line 2926
    const-string v2, "\u5c4f\u853d\u5173\u952e\u8bcd"

    .line 2927
    .line 2928
    const-string v3, "\u591a\u4e2a\u5173\u952e\u8bcd\u7528\u9017\u53f7\u6216\u6362\u884c\u5206\u9694"

    .line 2929
    .line 2930
    const/4 v5, 0x3

    .line 2931
    invoke-static/range {v2 .. v9}, Lwb/ho;->C1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILfg/l;Li0/h0;II)V

    .line 2932
    .line 2933
    .line 2934
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 2935
    .line 2936
    .line 2937
    goto :goto_23

    .line 2938
    :cond_5e
    const v1, 0x1925b46d

    .line 2939
    .line 2940
    .line 2941
    invoke-virtual {v7, v1}, Li0/h0;->a0(I)V

    .line 2942
    .line 2943
    .line 2944
    invoke-virtual {v7, v11}, Li0/h0;->p(Z)V

    .line 2945
    .line 2946
    .line 2947
    goto :goto_23

    .line 2948
    :cond_5f
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 2949
    .line 2950
    .line 2951
    :goto_23
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 2952
    .line 2953
    return-object v1

    .line 2954
    :pswitch_b
    move-object/from16 v7, p1

    .line 2955
    .line 2956
    check-cast v7, Li0/h0;

    .line 2957
    .line 2958
    move-object/from16 v1, p2

    .line 2959
    .line 2960
    check-cast v1, Ljava/lang/Integer;

    .line 2961
    .line 2962
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2963
    .line 2964
    .line 2965
    move-result v1

    .line 2966
    and-int/lit8 v2, v1, 0x3

    .line 2967
    .line 2968
    const/4 v3, 0x2

    .line 2969
    const/4 v10, 0x0

    .line 2970
    const/4 v11, 0x1

    .line 2971
    if-eq v2, v3, :cond_60

    .line 2972
    .line 2973
    move v2, v11

    .line 2974
    goto :goto_24

    .line 2975
    :cond_60
    move v2, v10

    .line 2976
    :goto_24
    and-int/2addr v1, v11

    .line 2977
    invoke-virtual {v7, v1, v2}, Li0/h0;->S(IZ)Z

    .line 2978
    .line 2979
    .line 2980
    move-result v1

    .line 2981
    if-eqz v1, :cond_65

    .line 2982
    .line 2983
    iget-object v1, v0, Lwb/n8;->i:Li0/a1;

    .line 2984
    .line 2985
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 2986
    .line 2987
    .line 2988
    move-result-object v2

    .line 2989
    check-cast v2, Ljava/lang/Boolean;

    .line 2990
    .line 2991
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2992
    .line 2993
    .line 2994
    move-result v2

    .line 2995
    iget-object v12, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 2996
    .line 2997
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 2998
    .line 2999
    .line 3000
    move-result v3

    .line 3001
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 3002
    .line 3003
    .line 3004
    move-result-object v4

    .line 3005
    iget-object v13, v0, Lwb/n8;->j:Li0/a1;

    .line 3006
    .line 3007
    sget-object v14, Li0/l;->a:Li0/e;

    .line 3008
    .line 3009
    if-nez v3, :cond_61

    .line 3010
    .line 3011
    if-ne v4, v14, :cond_62

    .line 3012
    .line 3013
    :cond_61
    new-instance v4, Lwb/bc;

    .line 3014
    .line 3015
    const/4 v3, 0x1

    .line 3016
    invoke-direct {v4, v12, v1, v13, v3}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 3017
    .line 3018
    .line 3019
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 3020
    .line 3021
    .line 3022
    :cond_62
    move-object v6, v4

    .line 3023
    check-cast v6, Lfg/l;

    .line 3024
    .line 3025
    const/16 v8, 0x1b0

    .line 3026
    .line 3027
    const/16 v9, 0x8

    .line 3028
    .line 3029
    const-string v3, "\u4f7f\u7528\u56fa\u5b9a\u7ed3\u679c"

    .line 3030
    .line 3031
    const-string v4, "\u76f4\u63a5\u53d1\u9001\u4e0b\u65b9\u8bbe\u7f6e\u7684\u9ab0\u5b50\u70b9\u6570\u6216\u731c\u62f3\u7ed3\u679c"

    .line 3032
    .line 3033
    const/4 v5, 0x0

    .line 3034
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 3035
    .line 3036
    .line 3037
    const/4 v2, 0x0

    .line 3038
    invoke-static {v2, v7, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 3039
    .line 3040
    .line 3041
    invoke-interface {v13}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 3042
    .line 3043
    .line 3044
    move-result-object v2

    .line 3045
    check-cast v2, Ljava/lang/Boolean;

    .line 3046
    .line 3047
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 3048
    .line 3049
    .line 3050
    move-result v2

    .line 3051
    invoke-virtual {v7, v12}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 3052
    .line 3053
    .line 3054
    move-result v3

    .line 3055
    invoke-virtual {v7}, Li0/h0;->P()Ljava/lang/Object;

    .line 3056
    .line 3057
    .line 3058
    move-result-object v4

    .line 3059
    if-nez v3, :cond_63

    .line 3060
    .line 3061
    if-ne v4, v14, :cond_64

    .line 3062
    .line 3063
    :cond_63
    new-instance v4, Lwb/bc;

    .line 3064
    .line 3065
    const/4 v3, 0x2

    .line 3066
    invoke-direct {v4, v12, v13, v1, v3}, Lwb/bc;-><init>(Landroid/content/SharedPreferences;Li0/a1;Li0/a1;I)V

    .line 3067
    .line 3068
    .line 3069
    invoke-virtual {v7, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 3070
    .line 3071
    .line 3072
    :cond_64
    move-object v6, v4

    .line 3073
    check-cast v6, Lfg/l;

    .line 3074
    .line 3075
    const/16 v8, 0x1b0

    .line 3076
    .line 3077
    const/16 v9, 0x8

    .line 3078
    .line 3079
    const-string v3, "\u53d1\u9001\u65f6\u9009\u62e9"

    .line 3080
    .line 3081
    const-string v4, "\u6bcf\u6b21\u53d1\u9001\u9ab0\u5b50\u6216\u731c\u62f3\u524d\u5f39\u51fa\u7ed3\u679c\u9009\u62e9"

    .line 3082
    .line 3083
    const/4 v5, 0x0

    .line 3084
    invoke-static/range {v2 .. v9}, Lwb/ho;->P3(ZLjava/lang/String;Ljava/lang/String;ZLfg/l;Li0/h0;II)V

    .line 3085
    .line 3086
    .line 3087
    goto :goto_25

    .line 3088
    :cond_65
    invoke-virtual {v7}, Li0/h0;->V()V

    .line 3089
    .line 3090
    .line 3091
    :goto_25
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 3092
    .line 3093
    return-object v1

    .line 3094
    :pswitch_c
    move-object/from16 v8, p1

    .line 3095
    .line 3096
    check-cast v8, Li0/h0;

    .line 3097
    .line 3098
    move-object/from16 v1, p2

    .line 3099
    .line 3100
    check-cast v1, Ljava/lang/Integer;

    .line 3101
    .line 3102
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 3103
    .line 3104
    .line 3105
    move-result v1

    .line 3106
    and-int/lit8 v2, v1, 0x3

    .line 3107
    .line 3108
    const/4 v10, 0x0

    .line 3109
    const/4 v11, 0x1

    .line 3110
    const/4 v12, 0x2

    .line 3111
    if-eq v2, v12, :cond_66

    .line 3112
    .line 3113
    move v2, v11

    .line 3114
    goto :goto_26

    .line 3115
    :cond_66
    move v2, v10

    .line 3116
    :goto_26
    and-int/2addr v1, v11

    .line 3117
    invoke-virtual {v8, v1, v2}, Li0/h0;->S(IZ)Z

    .line 3118
    .line 3119
    .line 3120
    move-result v1

    .line 3121
    if-eqz v1, :cond_6e

    .line 3122
    .line 3123
    iget-object v1, v0, Lwb/n8;->i:Li0/a1;

    .line 3124
    .line 3125
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 3126
    .line 3127
    .line 3128
    move-result-object v2

    .line 3129
    check-cast v2, Ljava/lang/Number;

    .line 3130
    .line 3131
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 3132
    .line 3133
    .line 3134
    move-result v2

    .line 3135
    const-string v3, " \u70b9"

    .line 3136
    .line 3137
    invoke-static {v2, v3}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 3138
    .line 3139
    .line 3140
    move-result-object v2

    .line 3141
    new-instance v4, Llg/d;

    .line 3142
    .line 3143
    const/4 v5, 0x6

    .line 3144
    invoke-direct {v4, v11, v5, v11}, Llg/b;-><init>(III)V

    .line 3145
    .line 3146
    .line 3147
    move-object v5, v4

    .line 3148
    new-instance v4, Ljava/util/ArrayList;

    .line 3149
    .line 3150
    invoke-static {v5}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 3151
    .line 3152
    .line 3153
    move-result v6

    .line 3154
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 3155
    .line 3156
    .line 3157
    invoke-virtual {v5}, Llg/b;->iterator()Ljava/util/Iterator;

    .line 3158
    .line 3159
    .line 3160
    move-result-object v5

    .line 3161
    :goto_27
    move-object v6, v5

    .line 3162
    check-cast v6, Llg/c;

    .line 3163
    .line 3164
    iget-boolean v7, v6, Llg/c;->i:Z

    .line 3165
    .line 3166
    const-string v13, ""

    .line 3167
    .line 3168
    if-eqz v7, :cond_67

    .line 3169
    .line 3170
    invoke-virtual {v6}, Llg/c;->next()Ljava/lang/Object;

    .line 3171
    .line 3172
    .line 3173
    move-result-object v6

    .line 3174
    check-cast v6, Ljava/lang/Number;

    .line 3175
    .line 3176
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 3177
    .line 3178
    .line 3179
    move-result v6

    .line 3180
    new-instance v7, Lwb/bp;

    .line 3181
    .line 3182
    invoke-static {v6, v3}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 3183
    .line 3184
    .line 3185
    move-result-object v9

    .line 3186
    invoke-direct {v7, v9, v6, v13}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 3187
    .line 3188
    .line 3189
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3190
    .line 3191
    .line 3192
    goto :goto_27

    .line 3193
    :cond_67
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 3194
    .line 3195
    .line 3196
    move-result-object v3

    .line 3197
    check-cast v3, Ljava/lang/Number;

    .line 3198
    .line 3199
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3200
    .line 3201
    .line 3202
    move-result v5

    .line 3203
    iget-object v14, v0, Lwb/n8;->h:Landroid/content/SharedPreferences;

    .line 3204
    .line 3205
    invoke-virtual {v8, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 3206
    .line 3207
    .line 3208
    move-result v3

    .line 3209
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 3210
    .line 3211
    .line 3212
    move-result-object v6

    .line 3213
    sget-object v15, Li0/l;->a:Li0/e;

    .line 3214
    .line 3215
    if-nez v3, :cond_68

    .line 3216
    .line 3217
    if-ne v6, v15, :cond_69

    .line 3218
    .line 3219
    :cond_68
    new-instance v6, Lwb/wb;

    .line 3220
    .line 3221
    const/16 v3, 0x1a

    .line 3222
    .line 3223
    invoke-direct {v6, v14, v1, v3}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 3224
    .line 3225
    .line 3226
    invoke-virtual {v8, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 3227
    .line 3228
    .line 3229
    :cond_69
    check-cast v6, Lfg/l;

    .line 3230
    .line 3231
    const/4 v7, 0x0

    .line 3232
    const/4 v9, 0x6

    .line 3233
    move-object v3, v2

    .line 3234
    const-string v2, "\u9ab0\u5b50\u70b9\u6570"

    .line 3235
    .line 3236
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 3237
    .line 3238
    .line 3239
    const/4 v1, 0x0

    .line 3240
    invoke-static {v1, v8, v10, v11}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 3241
    .line 3242
    .line 3243
    iget-object v1, v0, Lwb/n8;->j:Li0/a1;

    .line 3244
    .line 3245
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 3246
    .line 3247
    .line 3248
    move-result-object v2

    .line 3249
    check-cast v2, Ljava/lang/Number;

    .line 3250
    .line 3251
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 3252
    .line 3253
    .line 3254
    move-result v2

    .line 3255
    const-string v3, "\u77f3\u5934"

    .line 3256
    .line 3257
    const-string v4, "\u5e03"

    .line 3258
    .line 3259
    const-string v5, "\u526a\u5200"

    .line 3260
    .line 3261
    const/4 v6, 0x3

    .line 3262
    if-eq v2, v12, :cond_6b

    .line 3263
    .line 3264
    if-eq v2, v6, :cond_6a

    .line 3265
    .line 3266
    move-object v2, v5

    .line 3267
    goto :goto_28

    .line 3268
    :cond_6a
    move-object v2, v4

    .line 3269
    goto :goto_28

    .line 3270
    :cond_6b
    move-object v2, v3

    .line 3271
    :goto_28
    new-instance v7, Lwb/bp;

    .line 3272
    .line 3273
    invoke-direct {v7, v5, v11, v13}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 3274
    .line 3275
    .line 3276
    new-instance v5, Lwb/bp;

    .line 3277
    .line 3278
    invoke-direct {v5, v3, v12, v13}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 3279
    .line 3280
    .line 3281
    new-instance v3, Lwb/bp;

    .line 3282
    .line 3283
    invoke-direct {v3, v4, v6, v13}, Lwb/bp;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 3284
    .line 3285
    .line 3286
    filled-new-array {v7, v5, v3}, [Lwb/bp;

    .line 3287
    .line 3288
    .line 3289
    move-result-object v3

    .line 3290
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 3291
    .line 3292
    .line 3293
    move-result-object v4

    .line 3294
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 3295
    .line 3296
    .line 3297
    move-result-object v3

    .line 3298
    check-cast v3, Ljava/lang/Number;

    .line 3299
    .line 3300
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 3301
    .line 3302
    .line 3303
    move-result v5

    .line 3304
    invoke-virtual {v8, v14}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 3305
    .line 3306
    .line 3307
    move-result v3

    .line 3308
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 3309
    .line 3310
    .line 3311
    move-result-object v6

    .line 3312
    if-nez v3, :cond_6c

    .line 3313
    .line 3314
    if-ne v6, v15, :cond_6d

    .line 3315
    .line 3316
    :cond_6c
    new-instance v6, Lwb/wb;

    .line 3317
    .line 3318
    const/16 v3, 0x1b

    .line 3319
    .line 3320
    invoke-direct {v6, v14, v1, v3}, Lwb/wb;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 3321
    .line 3322
    .line 3323
    invoke-virtual {v8, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 3324
    .line 3325
    .line 3326
    :cond_6d
    check-cast v6, Lfg/l;

    .line 3327
    .line 3328
    const/4 v7, 0x0

    .line 3329
    const/4 v9, 0x6

    .line 3330
    move-object v3, v2

    .line 3331
    const-string v2, "\u731c\u62f3\u7ed3\u679c"

    .line 3332
    .line 3333
    invoke-static/range {v2 .. v9}, Lwb/ho;->J2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;ZLi0/h0;I)V

    .line 3334
    .line 3335
    .line 3336
    goto :goto_29

    .line 3337
    :cond_6e
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 3338
    .line 3339
    .line 3340
    :goto_29
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 3341
    .line 3342
    return-object v1

    .line 3343
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
