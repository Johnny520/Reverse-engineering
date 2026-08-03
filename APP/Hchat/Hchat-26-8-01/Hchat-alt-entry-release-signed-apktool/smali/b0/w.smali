.class public abstract Lb0/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ly2/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ly2/c0;

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    and-int/2addr v1, v2

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v1, v2

    .line 12
    :goto_0
    sget-object v3, Ly2/d0;->g:Ly2/d0;

    .line 13
    .line 14
    invoke-direct {v0, v1, v3, v2}, Ly2/c0;-><init>(ZLy2/d0;Z)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lb0/w;->a:Ly2/c0;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Lz/g;Lz/c;Li0/h0;I)V
    .locals 8

    .line 1
    const v0, 0x71816bae

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    :goto_0
    or-int/2addr v0, p3

    .line 18
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/16 v2, 0x20

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/16 v2, 0x10

    .line 28
    .line 29
    :goto_1
    or-int/2addr v0, v2

    .line 30
    and-int/lit8 v2, v0, 0x13

    .line 31
    .line 32
    const/16 v3, 0x12

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    move v2, v4

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move v2, v5

    .line 41
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v3, v2}, Li0/h0;->S(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_7

    .line 48
    .line 49
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/16 v3, 0x1c

    .line 52
    .line 53
    if-lt v2, v3, :cond_3

    .line 54
    .line 55
    const v2, -0x3c2b7b58

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v2}, Li0/h0;->a0(I)V

    .line 59
    .line 60
    .line 61
    sget-object v2, Ly1/i0;->b:Li0/m2;

    .line 62
    .line 63
    invoke-virtual {p2, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Landroid/content/Context;

    .line 68
    .line 69
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 70
    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_3
    const v2, -0x3c2abb88

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, v2}, Li0/h0;->a0(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2, v5}, Li0/h0;->p(Z)V

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    :goto_3
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    and-int/lit8 v0, v0, 0xe

    .line 88
    .line 89
    if-eq v0, v1, :cond_4

    .line 90
    .line 91
    move v4, v5

    .line 92
    :cond_4
    or-int v0, v3, v4

    .line 93
    .line 94
    invoke-virtual {p2, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    or-int/2addr v0, v1

    .line 99
    invoke-virtual {p2}, Li0/h0;->P()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-nez v0, :cond_5

    .line 104
    .line 105
    sget-object v0, Li0/l;->a:Li0/e;

    .line 106
    .line 107
    if-ne v1, v0, :cond_6

    .line 108
    .line 109
    :cond_5
    new-instance v1, Lb0/s;

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-direct {v1, p1, v2, p0, v0}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    move-object v4, v1

    .line 119
    check-cast v4, Lfg/l;

    .line 120
    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v7, 0x3

    .line 123
    const/4 v2, 0x0

    .line 124
    const/4 v3, 0x0

    .line 125
    move-object v5, p2

    .line 126
    invoke-static/range {v2 .. v7}, Ll/i;->b(Ly0/o;Ll/d;Lfg/l;Li0/h0;II)V

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_7
    move-object v5, p2

    .line 131
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 132
    .line 133
    .line 134
    :goto_4
    invoke-virtual {v5}, Li0/h0;->t()Li0/r1;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    if-eqz p2, :cond_8

    .line 139
    .line 140
    new-instance v0, Lb0/q;

    .line 141
    .line 142
    invoke-direct {v0, p0, p1, p3}, Lb0/q;-><init>(Lz/g;Lz/c;I)V

    .line 143
    .line 144
    .line 145
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 146
    .line 147
    :cond_8
    return-void
.end method

.method public static final b(IJLi0/h0;I)V
    .locals 17

    .line 1
    move-wide/from16 v3, p1

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    const v1, -0x49eca00d

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, p4, 0x6

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    move/from16 v1, p0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Li0/h0;->d(I)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    move v5, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v5, 0x2

    .line 27
    :goto_0
    or-int v5, p4, v5

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v1, p0

    .line 31
    .line 32
    move/from16 v5, p4

    .line 33
    .line 34
    :goto_1
    and-int/lit8 v6, p4, 0x30

    .line 35
    .line 36
    const/16 v7, 0x20

    .line 37
    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v3, v4}, Li0/h0;->e(J)Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-eqz v6, :cond_2

    .line 45
    .line 46
    move v6, v7

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v6, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v5, v6

    .line 51
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 52
    .line 53
    const/16 v8, 0x12

    .line 54
    .line 55
    const/4 v9, 0x1

    .line 56
    const/4 v10, 0x0

    .line 57
    if-eq v6, v8, :cond_4

    .line 58
    .line 59
    move v6, v9

    .line 60
    goto :goto_3

    .line 61
    :cond_4
    move v6, v10

    .line 62
    :goto_3
    and-int/lit8 v8, v5, 0x1

    .line 63
    .line 64
    invoke-virtual {v0, v8, v6}, Li0/h0;->S(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_12

    .line 69
    .line 70
    sget-object v6, Ly1/i0;->b:Li0/m2;

    .line 71
    .line 72
    invoke-virtual {v0, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Landroid/content/Context;

    .line 77
    .line 78
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v11

    .line 82
    and-int/lit8 v12, v5, 0xe

    .line 83
    .line 84
    if-ne v12, v2, :cond_5

    .line 85
    .line 86
    move v2, v9

    .line 87
    goto :goto_4

    .line 88
    :cond_5
    move v2, v10

    .line 89
    :goto_4
    or-int/2addr v2, v11

    .line 90
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v11

    .line 94
    const/4 v12, -0x1

    .line 95
    if-nez v2, :cond_6

    .line 96
    .line 97
    sget-object v2, Li0/l;->a:Li0/e;

    .line 98
    .line 99
    if-ne v11, v2, :cond_7

    .line 100
    .line 101
    :cond_6
    filled-new-array {v1}, [I

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v8, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v2, v10, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    invoke-virtual {v0, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_7
    check-cast v11, Ljava/lang/Number;

    .line 121
    .line 122
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-ne v2, v12, :cond_8

    .line 127
    .line 128
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    if-eqz v6, :cond_13

    .line 133
    .line 134
    new-instance v0, Lb0/p;

    .line 135
    .line 136
    const/4 v5, 0x1

    .line 137
    move/from16 v2, p4

    .line 138
    .line 139
    invoke-direct/range {v0 .. v5}, Lb0/p;-><init>(IIJI)V

    .line 140
    .line 141
    .line 142
    :goto_5
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 143
    .line 144
    return-void

    .line 145
    :cond_8
    invoke-virtual {v0, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    check-cast v1, Landroid/content/Context;

    .line 150
    .line 151
    sget-object v6, Ly1/i0;->c:Li0/u;

    .line 152
    .line 153
    invoke-virtual {v0, v6}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Landroid/content/res/Resources;

    .line 158
    .line 159
    sget-object v8, Ly1/i0;->e:Li0/m2;

    .line 160
    .line 161
    invoke-virtual {v0, v8}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    check-cast v8, Ld2/d;

    .line 166
    .line 167
    monitor-enter v8

    .line 168
    :try_start_0
    iget-object v11, v8, Ld2/d;->a:Lf/w;

    .line 169
    .line 170
    invoke-virtual {v11, v2}, Lf/k;->b(I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    check-cast v11, Landroid/util/TypedValue;

    .line 175
    .line 176
    if-nez v11, :cond_9

    .line 177
    .line 178
    new-instance v11, Landroid/util/TypedValue;

    .line 179
    .line 180
    invoke-direct {v11}, Landroid/util/TypedValue;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v2, v11, v9}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 184
    .line 185
    .line 186
    iget-object v12, v8, Ld2/d;->a:Lf/w;

    .line 187
    .line 188
    invoke-virtual {v12, v2}, Lf/w;->d(I)I

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    iget-object v14, v12, Lf/k;->c:[Ljava/lang/Object;

    .line 193
    .line 194
    aget-object v15, v14, v13

    .line 195
    .line 196
    iget-object v12, v12, Lf/k;->b:[I

    .line 197
    .line 198
    aput v2, v12, v13

    .line 199
    .line 200
    aput-object v11, v14, v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :catchall_0
    move-exception v0

    .line 204
    goto/16 :goto_9

    .line 205
    .line 206
    :cond_9
    :goto_6
    monitor-exit v8

    .line 207
    iget-object v8, v11, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 208
    .line 209
    const/4 v11, 0x0

    .line 210
    if-eqz v8, :cond_b

    .line 211
    .line 212
    const-string v12, ".xml"

    .line 213
    .line 214
    invoke-static {v8, v12}, Log/m;->m0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 215
    .line 216
    .line 217
    move-result v12

    .line 218
    if-ne v12, v9, :cond_b

    .line 219
    .line 220
    const v3, -0x699b7fa2

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v3}, Li0/h0;->a0(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    sget-object v3, Ly1/i0;->d:Li0/m2;

    .line 231
    .line 232
    invoke-virtual {v0, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ld2/c;

    .line 237
    .line 238
    new-instance v3, Ld2/b;

    .line 239
    .line 240
    invoke-direct {v3, v1, v2}, Ld2/b;-><init>(Landroid/content/res/Resources$Theme;I)V

    .line 241
    .line 242
    .line 243
    iget-object v0, v0, Ld2/c;->a:Ljava/util/HashMap;

    .line 244
    .line 245
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 250
    .line 251
    if-eqz v0, :cond_a

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    check-cast v0, Ld2/a;

    .line 258
    .line 259
    :cond_a
    invoke-virtual {v6, v2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 260
    .line 261
    .line 262
    throw v11

    .line 263
    :cond_b
    const v12, -0x69992078

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v12}, Li0/h0;->a0(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    invoke-virtual {v0, v8}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    invoke-virtual {v0, v2}, Li0/h0;->d(I)Z

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    or-int/2addr v12, v13

    .line 282
    invoke-virtual {v0, v1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    or-int/2addr v1, v12

    .line 287
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    if-nez v1, :cond_c

    .line 292
    .line 293
    sget-object v1, Li0/l;->a:Li0/e;

    .line 294
    .line 295
    if-ne v12, v1, :cond_d

    .line 296
    .line 297
    :cond_c
    :try_start_1
    invoke-virtual {v6, v2, v11}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 305
    .line 306
    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    new-instance v12, Lf1/g;

    .line 311
    .line 312
    invoke-direct {v12, v1}, Lf1/g;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v12}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    :cond_d
    check-cast v12, Lf1/g;

    .line 319
    .line 320
    new-instance v1, Lk1/a;

    .line 321
    .line 322
    iget-object v2, v12, Lf1/g;->a:Landroid/graphics/Bitmap;

    .line 323
    .line 324
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    iget-object v6, v12, Lf1/g;->a:Landroid/graphics/Bitmap;

    .line 329
    .line 330
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    int-to-long v13, v2

    .line 335
    shl-long/2addr v13, v7

    .line 336
    int-to-long v7, v6

    .line 337
    const-wide v15, 0xffffffffL

    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    and-long v6, v7, v15

    .line 343
    .line 344
    or-long/2addr v6, v13

    .line 345
    invoke-direct {v1, v12, v6, v7}, Lk1/a;-><init>(Lf1/g;J)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v10}, Li0/h0;->p(Z)V

    .line 349
    .line 350
    .line 351
    and-int/lit8 v5, v5, 0x70

    .line 352
    .line 353
    const/16 v2, 0x20

    .line 354
    .line 355
    if-ne v5, v2, :cond_e

    .line 356
    .line 357
    goto :goto_7

    .line 358
    :cond_e
    move v9, v10

    .line 359
    :goto_7
    invoke-virtual {v0}, Li0/h0;->P()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    if-nez v9, :cond_f

    .line 364
    .line 365
    sget-object v5, Li0/l;->a:Li0/e;

    .line 366
    .line 367
    if-ne v2, v5, :cond_11

    .line 368
    .line 369
    :cond_f
    const-wide/16 v5, 0x10

    .line 370
    .line 371
    cmp-long v2, v3, v5

    .line 372
    .line 373
    if-nez v2, :cond_10

    .line 374
    .line 375
    goto :goto_8

    .line 376
    :cond_10
    new-instance v11, Lf1/n;

    .line 377
    .line 378
    const/4 v2, 0x5

    .line 379
    invoke-direct {v11, v3, v4, v2}, Lf1/n;-><init>(JI)V

    .line 380
    .line 381
    .line 382
    :goto_8
    invoke-virtual {v0, v11}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    move-object v2, v11

    .line 386
    :cond_11
    check-cast v2, Lf1/n;

    .line 387
    .line 388
    sget-object v5, Ly0/l;->a:Ly0/l;

    .line 389
    .line 390
    sget v6, Ll/f;->j:F

    .line 391
    .line 392
    invoke-static {v5, v6}, Lp/h1;->j(Ly0/o;F)Ly0/o;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    sget-object v6, Lv1/g;->b:Lv1/s0;

    .line 397
    .line 398
    const/16 v7, 0x16

    .line 399
    .line 400
    invoke-static {v5, v1, v6, v2, v7}, Lc1/h;->g(Ly0/o;Lk1/b;Lv1/s0;Lf1/n;I)Ly0/o;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-static {v1, v0, v10}, Lp/o;->a(Ly0/o;Li0/h0;I)V

    .line 405
    .line 406
    .line 407
    goto :goto_a

    .line 408
    :catch_0
    move-exception v0

    .line 409
    new-instance v1, Laf/d;

    .line 410
    .line 411
    new-instance v2, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    const-string v3, "Error attempting to load resource: "

    .line 414
    .line 415
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    throw v1

    .line 429
    :goto_9
    monitor-exit v8

    .line 430
    throw v0

    .line 431
    :cond_12
    invoke-virtual {v0}, Li0/h0;->V()V

    .line 432
    .line 433
    .line 434
    :goto_a
    invoke-virtual {v0}, Li0/h0;->t()Li0/r1;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    if-eqz v6, :cond_13

    .line 439
    .line 440
    new-instance v0, Lb0/p;

    .line 441
    .line 442
    const/4 v5, 0x0

    .line 443
    move/from16 v1, p0

    .line 444
    .line 445
    move/from16 v2, p4

    .line 446
    .line 447
    invoke-direct/range {v0 .. v5}, Lb0/p;-><init>(IIJI)V

    .line 448
    .line 449
    .line 450
    goto/16 :goto_5

    .line 451
    .line 452
    :cond_13
    return-void
.end method

.method public static final c(Lz/g;Ld0/d;Lfg/a;Li0/h0;I)V
    .locals 13

    .line 1
    move-object/from16 v8, p3

    .line 2
    .line 3
    move/from16 v0, p4

    .line 4
    .line 5
    const v1, -0x799dedcc

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, v0, 0x6

    .line 12
    .line 13
    const/4 v4, 0x4

    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    and-int/lit8 v1, v0, 0x8

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v8, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v8, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :goto_0
    if-eqz v1, :cond_1

    .line 30
    .line 31
    move v1, v4

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v1, 0x2

    .line 34
    :goto_1
    or-int/2addr v1, v0

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v1, v0

    .line 37
    :goto_2
    and-int/lit8 v5, v0, 0x30

    .line 38
    .line 39
    const/16 v6, 0x20

    .line 40
    .line 41
    if-nez v5, :cond_5

    .line 42
    .line 43
    and-int/lit8 v5, v0, 0x40

    .line 44
    .line 45
    if-nez v5, :cond_3

    .line 46
    .line 47
    invoke-virtual {v8, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    invoke-virtual {v8, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    :goto_3
    if-eqz v5, :cond_4

    .line 57
    .line 58
    move v5, v6

    .line 59
    goto :goto_4

    .line 60
    :cond_4
    const/16 v5, 0x10

    .line 61
    .line 62
    :goto_4
    or-int/2addr v1, v5

    .line 63
    :cond_5
    and-int/lit16 v5, v0, 0x180

    .line 64
    .line 65
    if-nez v5, :cond_7

    .line 66
    .line 67
    invoke-virtual {v8, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_6

    .line 72
    .line 73
    const/16 v5, 0x100

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    const/16 v5, 0x80

    .line 77
    .line 78
    :goto_5
    or-int/2addr v1, v5

    .line 79
    :cond_7
    and-int/lit16 v5, v1, 0x93

    .line 80
    .line 81
    const/16 v7, 0x92

    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v10, 0x1

    .line 85
    if-eq v5, v7, :cond_8

    .line 86
    .line 87
    move v5, v10

    .line 88
    goto :goto_6

    .line 89
    :cond_8
    move v5, v9

    .line 90
    :goto_6
    and-int/lit8 v7, v1, 0x1

    .line 91
    .line 92
    invoke-virtual {v8, v7, v5}, Li0/h0;->S(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_11

    .line 97
    .line 98
    and-int/lit8 v5, v1, 0x70

    .line 99
    .line 100
    if-eq v5, v6, :cond_a

    .line 101
    .line 102
    and-int/lit8 v5, v1, 0x40

    .line 103
    .line 104
    if-eqz v5, :cond_9

    .line 105
    .line 106
    invoke-virtual {v8, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-eqz v5, :cond_9

    .line 111
    .line 112
    goto :goto_7

    .line 113
    :cond_9
    move v5, v9

    .line 114
    goto :goto_8

    .line 115
    :cond_a
    :goto_7
    move v5, v10

    .line 116
    :goto_8
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    sget-object v7, Li0/l;->a:Li0/e;

    .line 121
    .line 122
    if-nez v5, :cond_b

    .line 123
    .line 124
    if-ne v6, v7, :cond_c

    .line 125
    .line 126
    :cond_b
    new-instance v6, Lb0/y;

    .line 127
    .line 128
    new-instance v5, Landroidx/lifecycle/x;

    .line 129
    .line 130
    new-instance v11, Laa/c;

    .line 131
    .line 132
    const/4 v12, 0x2

    .line 133
    invoke-direct {v11, p1, v12, p2}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const/16 v12, 0x1d

    .line 137
    .line 138
    invoke-direct {v5, v11, v12}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v6, v5}, Lb0/y;-><init>(Landroidx/lifecycle/x;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :cond_c
    check-cast v6, Lb0/y;

    .line 148
    .line 149
    and-int/lit8 v5, v1, 0xe

    .line 150
    .line 151
    if-eq v5, v4, :cond_d

    .line 152
    .line 153
    and-int/lit8 v1, v1, 0x8

    .line 154
    .line 155
    if-eqz v1, :cond_e

    .line 156
    .line 157
    invoke-virtual {v8, p0}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_e

    .line 162
    .line 163
    :cond_d
    move v9, v10

    .line 164
    :cond_e
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    if-nez v9, :cond_f

    .line 169
    .line 170
    if-ne v1, v7, :cond_10

    .line 171
    .line 172
    :cond_f
    new-instance v1, Lab/a;

    .line 173
    .line 174
    const/4 v4, 0x2

    .line 175
    invoke-direct {v1, p0, v4}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v8, v1}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_10
    move-object v5, v1

    .line 182
    check-cast v5, Lfg/a;

    .line 183
    .line 184
    new-instance v1, Lb0/q;

    .line 185
    .line 186
    const/4 v4, 0x0

    .line 187
    invoke-direct {v1, p1, v4, p0}, Lb0/q;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    const v4, 0x4e63add6    # 9.5495514E8f

    .line 191
    .line 192
    .line 193
    invoke-static {v4, v1, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    const/16 v9, 0xd80

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    move-object v4, v6

    .line 201
    sget-object v6, Lb0/w;->a:Ly2/c0;

    .line 202
    .line 203
    invoke-static/range {v4 .. v10}, Ly2/m;->a(Ly2/b0;Lfg/a;Ly2/c0;Ls0/d;Li0/h0;II)V

    .line 204
    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_11
    invoke-virtual/range {p3 .. p3}, Li0/h0;->V()V

    .line 208
    .line 209
    .line 210
    :goto_9
    invoke-virtual/range {p3 .. p3}, Li0/h0;->t()Li0/r1;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    if-eqz v6, :cond_12

    .line 215
    .line 216
    new-instance v0, Lb0/r;

    .line 217
    .line 218
    const/4 v5, 0x0

    .line 219
    move-object v1, p0

    .line 220
    move-object v2, p1

    .line 221
    move-object v3, p2

    .line 222
    move/from16 v4, p4

    .line 223
    .line 224
    invoke-direct/range {v0 .. v5}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 225
    .line 226
    .line 227
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 228
    .line 229
    :cond_12
    return-void
.end method

.method public static final d(Ly0/o;Ls0/d;Li0/h0;I)V
    .locals 3

    .line 1
    const v0, 0x52f9d6eb

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    if-eq v1, v2, :cond_4

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    const/4 v1, 0x0

    .line 48
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 49
    .line 50
    invoke-virtual {p2, v2, v1}, Li0/h0;->S(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    sget-object v1, Ld0/f;->a:Li0/u;

    .line 57
    .line 58
    and-int/lit8 v2, v0, 0xe

    .line 59
    .line 60
    or-int/lit16 v2, v2, 0x1b0

    .line 61
    .line 62
    shl-int/lit8 v0, v0, 0x6

    .line 63
    .line 64
    and-int/lit16 v0, v0, 0x1c00

    .line 65
    .line 66
    or-int/2addr v0, v2

    .line 67
    invoke-static {p0, v1, p1, p2, v0}, Lr9/e0;->e(Ly0/o;Li0/p1;Ls0/d;Li0/h0;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 72
    .line 73
    .line 74
    :goto_4
    invoke-virtual {p2}, Li0/h0;->t()Li0/r1;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-eqz p2, :cond_6

    .line 79
    .line 80
    new-instance v0, Lb0/i;

    .line 81
    .line 82
    const/4 v1, 0x2

    .line 83
    invoke-direct {v0, p0, p1, p3, v1}, Lb0/i;-><init>(Ly0/o;Ls0/d;II)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p2, Li0/r1;->d:Lfg/p;

    .line 87
    .line 88
    :cond_6
    return-void
.end method
