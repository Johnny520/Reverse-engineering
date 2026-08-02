.class public abstract Lk60;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lh22;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh22;

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lh22;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lk60;->a:Lh22;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Lcz2;Lqy2;Lpx;I)V
    .locals 7

    .line 1
    move-object v3, p2

    .line 2
    check-cast v3, Lgo0;

    .line 3
    .line 4
    const p2, 0x71816bae

    .line 5
    .line 6
    .line 7
    invoke-virtual {v3, p2}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v3, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v6, 0x4

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    move p2, v6

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p2, 0x2

    .line 20
    :goto_0
    or-int/2addr p2, p3

    .line 21
    invoke-virtual {v3, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/16 v0, 0x20

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/16 v0, 0x10

    .line 31
    .line 32
    :goto_1
    or-int/2addr p2, v0

    .line 33
    and-int/lit8 v0, p2, 0x13

    .line 34
    .line 35
    const/16 v1, 0x12

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    const/4 v4, 0x0

    .line 39
    if-eq v0, v1, :cond_2

    .line 40
    .line 41
    move v0, v2

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v0, v4

    .line 44
    :goto_2
    and-int/lit8 v1, p2, 0x1

    .line 45
    .line 46
    invoke-virtual {v3, v1, v0}, Lgo0;->O(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_7

    .line 51
    .line 52
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 53
    .line 54
    const/16 v1, 0x1c

    .line 55
    .line 56
    if-lt v0, v1, :cond_3

    .line 57
    .line 58
    const v0, -0x3c2b7b58

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 62
    .line 63
    .line 64
    sget-object v0, Lr7;->b:Ltu2;

    .line 65
    .line 66
    invoke-virtual {v3, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Landroid/content/Context;

    .line 71
    .line 72
    invoke-virtual {v3, v4}, Lgo0;->p(Z)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    const v0, -0x3c2abb88

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v0}, Lgo0;->W(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v4}, Lgo0;->p(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    :goto_3
    invoke-virtual {v3, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    and-int/lit8 p2, p2, 0xe

    .line 91
    .line 92
    if-eq p2, v6, :cond_4

    .line 93
    .line 94
    move v2, v4

    .line 95
    :cond_4
    or-int p2, v1, v2

    .line 96
    .line 97
    invoke-virtual {v3, v0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    or-int/2addr p2, v1

    .line 102
    invoke-virtual {v3}, Lgo0;->L()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-nez p2, :cond_5

    .line 107
    .line 108
    sget-object p2, Lnx;->a:Leb;

    .line 109
    .line 110
    if-ne v1, p2, :cond_6

    .line 111
    .line 112
    :cond_5
    new-instance v1, Lm0;

    .line 113
    .line 114
    const/4 p2, 0x6

    .line 115
    invoke-direct {v1, p1, v0, p0, p2}, Lm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v3, v1}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_6
    move-object v2, v1

    .line 122
    check-cast v2, Lin0;

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    const/4 v5, 0x3

    .line 126
    const/4 v0, 0x0

    .line 127
    const/4 v1, 0x0

    .line 128
    invoke-static/range {v0 .. v5}, Lr00;->b(Luh1;Lm00;Lin0;Lpx;II)V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_7
    invoke-virtual {v3}, Lgo0;->R()V

    .line 133
    .line 134
    .line 135
    :goto_4
    invoke-virtual {v3}, Lgo0;->r()Lb62;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    if-eqz p2, :cond_8

    .line 140
    .line 141
    new-instance v0, Laf;

    .line 142
    .line 143
    invoke-direct {v0, p3, v6, p0, p1}, Laf;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 147
    .line 148
    :cond_8
    return-void
.end method

.method public static final b(IJLpx;I)V
    .locals 58

    .line 1
    move-wide/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    check-cast v1, Lgo0;

    .line 6
    .line 7
    const v0, -0x49eca00d

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v0}, Lgo0;->X(I)Lgo0;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v0, p4, 0x6

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    const/4 v5, 0x2

    .line 17
    move/from16 v6, p0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1, v6}, Lgo0;->d(I)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move v0, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v5

    .line 30
    :goto_0
    or-int v0, p4, v0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move/from16 v0, p4

    .line 34
    .line 35
    :goto_1
    and-int/lit8 v7, p4, 0x30

    .line 36
    .line 37
    if-nez v7, :cond_3

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Lgo0;->e(J)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_2

    .line 44
    .line 45
    const/16 v7, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v7, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v7

    .line 51
    :cond_3
    move v7, v0

    .line 52
    and-int/lit8 v0, v7, 0x13

    .line 53
    .line 54
    const/16 v9, 0x12

    .line 55
    .line 56
    const/4 v10, 0x1

    .line 57
    const/4 v11, 0x0

    .line 58
    if-eq v0, v9, :cond_4

    .line 59
    .line 60
    move v0, v10

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    move v0, v11

    .line 63
    :goto_3
    and-int/lit8 v9, v7, 0x1

    .line 64
    .line 65
    invoke-virtual {v1, v9, v0}, Lgo0;->O(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_4d

    .line 70
    .line 71
    sget-object v0, Lr7;->b:Ltu2;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    check-cast v9, Landroid/content/Context;

    .line 78
    .line 79
    invoke-virtual {v1, v9}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    and-int/lit8 v13, v7, 0xe

    .line 84
    .line 85
    if-ne v13, v4, :cond_5

    .line 86
    .line 87
    move v13, v10

    .line 88
    goto :goto_4

    .line 89
    :cond_5
    move v13, v11

    .line 90
    :goto_4
    or-int/2addr v12, v13

    .line 91
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    const/4 v14, -0x1

    .line 96
    if-nez v12, :cond_6

    .line 97
    .line 98
    sget-object v12, Lnx;->a:Leb;

    .line 99
    .line 100
    if-ne v13, v12, :cond_7

    .line 101
    .line 102
    :cond_6
    filled-new-array {v6}, [I

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    invoke-virtual {v9, v12}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    invoke-virtual {v9, v11, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    invoke-virtual {v1, v13}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_7
    check-cast v13, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-ne v9, v14, :cond_8

    .line 128
    .line 129
    invoke-virtual {v1}, Lgo0;->r()Lb62;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    if-eqz v7, :cond_4e

    .line 134
    .line 135
    new-instance v0, Li60;

    .line 136
    .line 137
    const/4 v5, 0x1

    .line 138
    move/from16 v4, p4

    .line 139
    .line 140
    move v1, v6

    .line 141
    invoke-direct/range {v0 .. v5}, Li60;-><init>(IJII)V

    .line 142
    .line 143
    .line 144
    iput-object v0, v7, Lb62;->d:Lmn0;

    .line 145
    .line 146
    return-void

    .line 147
    :cond_8
    invoke-virtual {v1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Landroid/content/Context;

    .line 152
    .line 153
    sget-object v6, Lr7;->c:Lmy;

    .line 154
    .line 155
    invoke-virtual {v1, v6}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    check-cast v6, Landroid/content/res/Resources;

    .line 160
    .line 161
    sget-object v12, Lr7;->e:Ltu2;

    .line 162
    .line 163
    invoke-virtual {v1, v12}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    check-cast v12, Ll92;

    .line 168
    .line 169
    monitor-enter v12

    .line 170
    :try_start_0
    iget-object v13, v12, Ll92;->a:Lzj1;

    .line 171
    .line 172
    invoke-virtual {v13, v9}, Lx01;->b(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    check-cast v13, Landroid/util/TypedValue;

    .line 177
    .line 178
    if-nez v13, :cond_9

    .line 179
    .line 180
    new-instance v13, Landroid/util/TypedValue;

    .line 181
    .line 182
    invoke-direct {v13}, Landroid/util/TypedValue;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6, v9, v13, v10}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 186
    .line 187
    .line 188
    iget-object v15, v12, Ll92;->a:Lzj1;

    .line 189
    .line 190
    invoke-virtual {v15, v9}, Lzj1;->d(I)I

    .line 191
    .line 192
    .line 193
    move-result v16

    .line 194
    iget-object v8, v15, Lx01;->c:[Ljava/lang/Object;

    .line 195
    .line 196
    aget-object v17, v8, v16

    .line 197
    .line 198
    iget-object v15, v15, Lx01;->b:[I

    .line 199
    .line 200
    aput v9, v15, v16

    .line 201
    .line 202
    aput-object v13, v8, v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :catchall_0
    move-exception v0

    .line 206
    goto/16 :goto_3a

    .line 207
    .line 208
    :cond_9
    :goto_5
    monitor-exit v12

    .line 209
    iget-object v8, v13, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 210
    .line 211
    const/4 v12, 0x5

    .line 212
    if-eqz v8, :cond_46

    .line 213
    .line 214
    const-string v15, ".xml"

    .line 215
    .line 216
    invoke-static {v8, v15}, Lpv2;->l0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v15

    .line 220
    if-ne v15, v10, :cond_46

    .line 221
    .line 222
    const v8, -0x699b7fa2

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1, v8}, Lgo0;->W(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    iget v13, v13, Landroid/util/TypedValue;->changingConfigurations:I

    .line 233
    .line 234
    sget-object v0, Lr7;->d:Ltu2;

    .line 235
    .line 236
    invoke-virtual {v1, v0}, Lgo0;->j(Le42;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    move-object v15, v0

    .line 241
    check-cast v15, Lvx0;

    .line 242
    .line 243
    new-instance v4, Lux0;

    .line 244
    .line 245
    invoke-direct {v4, v8, v9}, Lux0;-><init>(Landroid/content/res/Resources$Theme;I)V

    .line 246
    .line 247
    .line 248
    iget-object v0, v15, Lvx0;->a:Ljava/util/HashMap;

    .line 249
    .line 250
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 255
    .line 256
    if-eqz v0, :cond_a

    .line 257
    .line 258
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    check-cast v0, Ltx0;

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_a
    const/4 v0, 0x0

    .line 266
    :goto_6
    if-nez v0, :cond_45

    .line 267
    .line 268
    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 269
    .line 270
    .line 271
    move-result-object v9

    .line 272
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    :goto_7
    if-eq v0, v5, :cond_b

    .line 277
    .line 278
    if-eq v0, v10, :cond_b

    .line 279
    .line 280
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    goto :goto_7

    .line 285
    :cond_b
    if-ne v0, v5, :cond_44

    .line 286
    .line 287
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    const-string v14, "vector"

    .line 292
    .line 293
    invoke-static {v0, v14}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_43

    .line 298
    .line 299
    invoke-static {v9}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 300
    .line 301
    .line 302
    move-result-object v14

    .line 303
    new-instance v10, Lyb;

    .line 304
    .line 305
    invoke-direct {v10, v9}, Lyb;-><init>(Landroid/content/res/XmlResourceParser;)V

    .line 306
    .line 307
    .line 308
    sget-object v0, Lci0;->b:[I

    .line 309
    .line 310
    if-nez v8, :cond_c

    .line 311
    .line 312
    invoke-virtual {v6, v14, v0}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    :goto_8
    move-object/from16 v19, v0

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :cond_c
    invoke-virtual {v8, v14, v0, v11, v11}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    goto :goto_8

    .line 324
    :goto_9
    invoke-virtual/range {v19 .. v19}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    invoke-virtual {v10, v0}, Lyb;->c(I)V

    .line 329
    .line 330
    .line 331
    const-string v0, "autoMirrored"

    .line 332
    .line 333
    const-string v5, "http://schemas.android.com/apk/res/android"

    .line 334
    .line 335
    invoke-interface {v9, v5, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v0, :cond_d

    .line 340
    .line 341
    move-object/from16 v5, v19

    .line 342
    .line 343
    invoke-virtual {v5, v12, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    move/from16 v30, v0

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_d
    move-object/from16 v5, v19

    .line 351
    .line 352
    move/from16 v30, v11

    .line 353
    .line 354
    :goto_a
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    invoke-virtual {v10, v0}, Lyb;->c(I)V

    .line 359
    .line 360
    .line 361
    const-string v0, "viewportWidth"

    .line 362
    .line 363
    const/4 v12, 0x7

    .line 364
    const/4 v11, 0x0

    .line 365
    invoke-virtual {v10, v5, v0, v12, v11}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 366
    .line 367
    .line 368
    move-result v25

    .line 369
    const-string v0, "viewportHeight"

    .line 370
    .line 371
    const/16 v12, 0x8

    .line 372
    .line 373
    invoke-virtual {v10, v5, v0, v12, v11}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 374
    .line 375
    .line 376
    move-result v26

    .line 377
    cmpg-float v0, v25, v11

    .line 378
    .line 379
    if-lez v0, :cond_42

    .line 380
    .line 381
    cmpg-float v0, v26, v11

    .line 382
    .line 383
    if-lez v0, :cond_41

    .line 384
    .line 385
    const/4 v12, 0x3

    .line 386
    invoke-virtual {v5, v12, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 387
    .line 388
    .line 389
    move-result v21

    .line 390
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    invoke-virtual {v10, v0}, Lyb;->c(I)V

    .line 395
    .line 396
    .line 397
    const/4 v12, 0x2

    .line 398
    invoke-virtual {v5, v12, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 399
    .line 400
    .line 401
    move-result v22

    .line 402
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    invoke-virtual {v10, v0}, Lyb;->c(I)V

    .line 407
    .line 408
    .line 409
    const/4 v11, 0x1

    .line 410
    invoke-virtual {v5, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_13

    .line 415
    .line 416
    new-instance v0, Landroid/util/TypedValue;

    .line 417
    .line 418
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v5, v11, v0}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 422
    .line 423
    .line 424
    iget v0, v0, Landroid/util/TypedValue;->type:I

    .line 425
    .line 426
    if-ne v0, v12, :cond_e

    .line 427
    .line 428
    sget-wide v23, Lju;->g:J

    .line 429
    .line 430
    move/from16 v32, v7

    .line 431
    .line 432
    :goto_b
    move-wide/from16 v27, v23

    .line 433
    .line 434
    goto/16 :goto_e

    .line 435
    .line 436
    :cond_e
    const-string v0, "tint"

    .line 437
    .line 438
    const-string v12, "http://schemas.android.com/apk/res/android"

    .line 439
    .line 440
    invoke-interface {v9, v12, v0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    if-eqz v0, :cond_11

    .line 445
    .line 446
    new-instance v0, Landroid/util/TypedValue;

    .line 447
    .line 448
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v5, v11, v0}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 452
    .line 453
    .line 454
    iget v11, v0, Landroid/util/TypedValue;->type:I

    .line 455
    .line 456
    const/4 v12, 0x2

    .line 457
    if-eq v11, v12, :cond_10

    .line 458
    .line 459
    const/16 v12, 0x1c

    .line 460
    .line 461
    if-lt v11, v12, :cond_f

    .line 462
    .line 463
    const/16 v12, 0x1f

    .line 464
    .line 465
    if-gt v11, v12, :cond_f

    .line 466
    .line 467
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 468
    .line 469
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    move/from16 v32, v7

    .line 474
    .line 475
    goto :goto_d

    .line 476
    :cond_f
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    move/from16 v32, v7

    .line 481
    .line 482
    const/4 v11, 0x1

    .line 483
    const/4 v12, 0x0

    .line 484
    invoke-virtual {v5, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    sget-object v11, Lvu;->a:Ljava/lang/ThreadLocal;

    .line 489
    .line 490
    :try_start_1
    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    invoke-static {v0, v7, v8}, Lvu;->a(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    .line 495
    .line 496
    .line 497
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 498
    goto :goto_d

    .line 499
    :catch_0
    move-exception v0

    .line 500
    const-string v7, "CSLCompat"

    .line 501
    .line 502
    const-string v11, "Failed to inflate ColorStateList."

    .line 503
    .line 504
    invoke-static {v7, v11, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 505
    .line 506
    .line 507
    :goto_c
    const/4 v0, 0x0

    .line 508
    goto :goto_d

    .line 509
    :cond_10
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    .line 510
    .line 511
    new-instance v2, Ljava/lang/StringBuilder;

    .line 512
    .line 513
    const-string v3, "Failed to resolve attribute at index 1: "

    .line 514
    .line 515
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-direct {v1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    throw v1

    .line 529
    :cond_11
    move/from16 v32, v7

    .line 530
    .line 531
    goto :goto_c

    .line 532
    :goto_d
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 533
    .line 534
    .line 535
    move-result v7

    .line 536
    invoke-virtual {v10, v7}, Lyb;->c(I)V

    .line 537
    .line 538
    .line 539
    if-eqz v0, :cond_12

    .line 540
    .line 541
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    invoke-static {v0}, Lsp0;->b(I)J

    .line 546
    .line 547
    .line 548
    move-result-wide v23

    .line 549
    goto :goto_b

    .line 550
    :cond_12
    sget-wide v23, Lju;->g:J

    .line 551
    .line 552
    goto :goto_b

    .line 553
    :cond_13
    move/from16 v32, v7

    .line 554
    .line 555
    sget-wide v23, Lju;->g:J

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :goto_e
    const/4 v0, 0x6

    .line 559
    const/4 v7, -0x1

    .line 560
    invoke-virtual {v5, v0, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 561
    .line 562
    .line 563
    move-result v11

    .line 564
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 565
    .line 566
    .line 567
    move-result v12

    .line 568
    invoke-virtual {v10, v12}, Lyb;->c(I)V

    .line 569
    .line 570
    .line 571
    const/16 v12, 0x9

    .line 572
    .line 573
    if-eq v11, v7, :cond_14

    .line 574
    .line 575
    const/4 v7, 0x3

    .line 576
    if-eq v11, v7, :cond_16

    .line 577
    .line 578
    const/4 v7, 0x5

    .line 579
    if-eq v11, v7, :cond_14

    .line 580
    .line 581
    if-eq v11, v12, :cond_15

    .line 582
    .line 583
    packed-switch v11, :pswitch_data_0

    .line 584
    .line 585
    .line 586
    :cond_14
    const/16 v29, 0x5

    .line 587
    .line 588
    goto :goto_f

    .line 589
    :pswitch_0
    const/16 v29, 0xc

    .line 590
    .line 591
    goto :goto_f

    .line 592
    :pswitch_1
    const/16 v7, 0xe

    .line 593
    .line 594
    move/from16 v29, v7

    .line 595
    .line 596
    goto :goto_f

    .line 597
    :pswitch_2
    const/16 v29, 0xd

    .line 598
    .line 599
    goto :goto_f

    .line 600
    :cond_15
    move/from16 v29, v12

    .line 601
    .line 602
    goto :goto_f

    .line 603
    :cond_16
    const/16 v29, 0x3

    .line 604
    .line 605
    :goto_f
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 606
    .line 607
    .line 608
    move-result-object v7

    .line 609
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 610
    .line 611
    div-float v23, v21, v7

    .line 612
    .line 613
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    .line 618
    .line 619
    div-float v24, v22, v7

    .line 620
    .line 621
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 622
    .line 623
    .line 624
    new-instance v21, Lrx0;

    .line 625
    .line 626
    const/16 v22, 0x0

    .line 627
    .line 628
    const/16 v31, 0x1

    .line 629
    .line 630
    invoke-direct/range {v21 .. v31}, Lrx0;-><init>(Ljava/lang/String;FFFFJIZI)V

    .line 631
    .line 632
    .line 633
    move-object/from16 v5, v21

    .line 634
    .line 635
    const/4 v7, 0x0

    .line 636
    :goto_10
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 637
    .line 638
    .line 639
    move-result v11

    .line 640
    const/4 v12, 0x1

    .line 641
    if-eq v11, v12, :cond_40

    .line 642
    .line 643
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    .line 644
    .line 645
    .line 646
    move-result v11

    .line 647
    if-ge v11, v12, :cond_17

    .line 648
    .line 649
    invoke-interface {v9}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 650
    .line 651
    .line 652
    move-result v11

    .line 653
    const/4 v12, 0x3

    .line 654
    if-ne v11, v12, :cond_18

    .line 655
    .line 656
    const/4 v11, 0x1

    .line 657
    :goto_11
    move/from16 v26, v13

    .line 658
    .line 659
    goto/16 :goto_31

    .line 660
    .line 661
    :cond_17
    const/4 v12, 0x3

    .line 662
    :cond_18
    const-string v11, "group"

    .line 663
    .line 664
    sget-object v42, Lbe0;->h:Lbe0;

    .line 665
    .line 666
    const-string v22, ""

    .line 667
    .line 668
    iget-object v0, v10, Lyb;->a:Lorg/xmlpull/v1/XmlPullParser;

    .line 669
    .line 670
    iget-object v12, v10, Lyb;->c:Lj5;

    .line 671
    .line 672
    move/from16 v24, v7

    .line 673
    .line 674
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 675
    .line 676
    .line 677
    move-result v7

    .line 678
    move-object/from16 v25, v9

    .line 679
    .line 680
    const/4 v9, 0x2

    .line 681
    if-eq v7, v9, :cond_1d

    .line 682
    .line 683
    const/4 v9, 0x3

    .line 684
    if-eq v7, v9, :cond_1a

    .line 685
    .line 686
    :cond_19
    move/from16 v26, v13

    .line 687
    .line 688
    :goto_12
    const/16 v9, 0xd

    .line 689
    .line 690
    const/4 v11, 0x1

    .line 691
    const/4 v13, -0x1

    .line 692
    const/16 v17, 0x4

    .line 693
    .line 694
    const/16 v20, 0x2

    .line 695
    .line 696
    const/16 v21, 0x9

    .line 697
    .line 698
    goto/16 :goto_2f

    .line 699
    .line 700
    :cond_1a
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-virtual {v11, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    if-eqz v0, :cond_19

    .line 709
    .line 710
    add-int/lit8 v7, v24, 0x1

    .line 711
    .line 712
    const/4 v0, 0x0

    .line 713
    :goto_13
    if-ge v0, v7, :cond_1c

    .line 714
    .line 715
    iget-object v9, v5, Lrx0;->i:Ljava/util/ArrayList;

    .line 716
    .line 717
    iget-boolean v11, v5, Lrx0;->k:Z

    .line 718
    .line 719
    if-eqz v11, :cond_1b

    .line 720
    .line 721
    const-string v11, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    .line 722
    .line 723
    invoke-static {v11}, Lkz0;->b(Ljava/lang/String;)V

    .line 724
    .line 725
    .line 726
    :cond_1b
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 727
    .line 728
    .line 729
    move-result v11

    .line 730
    const/16 v18, 0x1

    .line 731
    .line 732
    add-int/lit8 v11, v11, -0x1

    .line 733
    .line 734
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v11

    .line 738
    check-cast v11, Lqx0;

    .line 739
    .line 740
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 741
    .line 742
    .line 743
    move-result v12

    .line 744
    add-int/lit8 v12, v12, -0x1

    .line 745
    .line 746
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v9

    .line 750
    check-cast v9, Lqx0;

    .line 751
    .line 752
    iget-object v9, v9, Lqx0;->j:Ljava/util/ArrayList;

    .line 753
    .line 754
    new-instance v33, Lr93;

    .line 755
    .line 756
    iget-object v12, v11, Lqx0;->a:Ljava/lang/String;

    .line 757
    .line 758
    move/from16 v22, v0

    .line 759
    .line 760
    iget v0, v11, Lqx0;->b:F

    .line 761
    .line 762
    move/from16 v35, v0

    .line 763
    .line 764
    iget v0, v11, Lqx0;->c:F

    .line 765
    .line 766
    move/from16 v36, v0

    .line 767
    .line 768
    iget v0, v11, Lqx0;->d:F

    .line 769
    .line 770
    move/from16 v37, v0

    .line 771
    .line 772
    iget v0, v11, Lqx0;->e:F

    .line 773
    .line 774
    move/from16 v38, v0

    .line 775
    .line 776
    iget v0, v11, Lqx0;->f:F

    .line 777
    .line 778
    move/from16 v39, v0

    .line 779
    .line 780
    iget v0, v11, Lqx0;->g:F

    .line 781
    .line 782
    move/from16 v40, v0

    .line 783
    .line 784
    iget v0, v11, Lqx0;->h:F

    .line 785
    .line 786
    move/from16 v41, v0

    .line 787
    .line 788
    iget-object v0, v11, Lqx0;->i:Ljava/util/List;

    .line 789
    .line 790
    iget-object v11, v11, Lqx0;->j:Ljava/util/ArrayList;

    .line 791
    .line 792
    move-object/from16 v42, v0

    .line 793
    .line 794
    move-object/from16 v43, v11

    .line 795
    .line 796
    move-object/from16 v34, v12

    .line 797
    .line 798
    invoke-direct/range {v33 .. v43}, Lr93;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/ArrayList;)V

    .line 799
    .line 800
    .line 801
    move-object/from16 v0, v33

    .line 802
    .line 803
    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    add-int/lit8 v0, v22, 0x1

    .line 807
    .line 808
    goto :goto_13

    .line 809
    :cond_1c
    move/from16 v26, v13

    .line 810
    .line 811
    const/4 v7, 0x0

    .line 812
    :goto_14
    const/16 v9, 0xd

    .line 813
    .line 814
    const/4 v11, 0x1

    .line 815
    const/4 v13, -0x1

    .line 816
    :goto_15
    const/16 v17, 0x4

    .line 817
    .line 818
    const/16 v20, 0x2

    .line 819
    .line 820
    const/16 v21, 0x9

    .line 821
    .line 822
    goto/16 :goto_30

    .line 823
    .line 824
    :cond_1d
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v7

    .line 828
    if-eqz v7, :cond_19

    .line 829
    .line 830
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 831
    .line 832
    .line 833
    move-result v9

    .line 834
    move/from16 v26, v13

    .line 835
    .line 836
    const v13, -0x624e8b7e

    .line 837
    .line 838
    .line 839
    if-eq v9, v13, :cond_3a

    .line 840
    .line 841
    const v13, 0x346425

    .line 842
    .line 843
    .line 844
    const/high16 v2, 0x3f800000    # 1.0f

    .line 845
    .line 846
    if-eq v9, v13, :cond_23

    .line 847
    .line 848
    const v0, 0x5e0f67f

    .line 849
    .line 850
    .line 851
    if-eq v9, v0, :cond_1e

    .line 852
    .line 853
    :goto_16
    goto/16 :goto_12

    .line 854
    .line 855
    :cond_1e
    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 856
    .line 857
    .line 858
    move-result v0

    .line 859
    if-nez v0, :cond_1f

    .line 860
    .line 861
    :goto_17
    goto :goto_16

    .line 862
    :cond_1f
    sget-object v0, Lci0;->c:[I

    .line 863
    .line 864
    if-nez v8, :cond_20

    .line 865
    .line 866
    invoke-virtual {v6, v14, v0}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 867
    .line 868
    .line 869
    move-result-object v0

    .line 870
    goto :goto_18

    .line 871
    :cond_20
    const/4 v12, 0x0

    .line 872
    invoke-virtual {v8, v14, v0, v12, v12}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    :goto_18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 877
    .line 878
    .line 879
    move-result v3

    .line 880
    invoke-virtual {v10, v3}, Lyb;->c(I)V

    .line 881
    .line 882
    .line 883
    const-string v3, "rotation"

    .line 884
    .line 885
    const/4 v7, 0x5

    .line 886
    const/4 v9, 0x0

    .line 887
    invoke-virtual {v10, v0, v3, v7, v9}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 888
    .line 889
    .line 890
    move-result v35

    .line 891
    const/4 v11, 0x1

    .line 892
    invoke-virtual {v0, v11, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 893
    .line 894
    .line 895
    move-result v36

    .line 896
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    invoke-virtual {v10, v3}, Lyb;->c(I)V

    .line 901
    .line 902
    .line 903
    const/4 v12, 0x2

    .line 904
    invoke-virtual {v0, v12, v9}, Landroid/content/res/TypedArray;->getFloat(IF)F

    .line 905
    .line 906
    .line 907
    move-result v37

    .line 908
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 909
    .line 910
    .line 911
    move-result v3

    .line 912
    invoke-virtual {v10, v3}, Lyb;->c(I)V

    .line 913
    .line 914
    .line 915
    const-string v3, "scaleX"

    .line 916
    .line 917
    const/4 v12, 0x3

    .line 918
    invoke-virtual {v10, v0, v3, v12, v2}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 919
    .line 920
    .line 921
    move-result v38

    .line 922
    const-string v3, "scaleY"

    .line 923
    .line 924
    const/4 v7, 0x4

    .line 925
    invoke-virtual {v10, v0, v3, v7, v2}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 926
    .line 927
    .line 928
    move-result v39

    .line 929
    const-string v2, "translateX"

    .line 930
    .line 931
    const/4 v3, 0x6

    .line 932
    invoke-virtual {v10, v0, v2, v3, v9}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 933
    .line 934
    .line 935
    move-result v40

    .line 936
    const-string v2, "translateY"

    .line 937
    .line 938
    const/4 v3, 0x7

    .line 939
    invoke-virtual {v10, v0, v2, v3, v9}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 940
    .line 941
    .line 942
    move-result v41

    .line 943
    const/4 v12, 0x0

    .line 944
    invoke-virtual {v0, v12}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v2

    .line 948
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 949
    .line 950
    .line 951
    move-result v3

    .line 952
    invoke-virtual {v10, v3}, Lyb;->c(I)V

    .line 953
    .line 954
    .line 955
    if-nez v2, :cond_21

    .line 956
    .line 957
    move-object/from16 v34, v22

    .line 958
    .line 959
    goto :goto_19

    .line 960
    :cond_21
    move-object/from16 v34, v2

    .line 961
    .line 962
    :goto_19
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 963
    .line 964
    .line 965
    sget v0, Ls93;->a:I

    .line 966
    .line 967
    iget-boolean v0, v5, Lrx0;->k:Z

    .line 968
    .line 969
    if-eqz v0, :cond_22

    .line 970
    .line 971
    const-string v0, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    .line 972
    .line 973
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    :cond_22
    new-instance v33, Lqx0;

    .line 977
    .line 978
    const/16 v43, 0x200

    .line 979
    .line 980
    invoke-direct/range {v33 .. v43}, Lqx0;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 981
    .line 982
    .line 983
    move-object/from16 v0, v33

    .line 984
    .line 985
    iget-object v2, v5, Lrx0;->i:Ljava/util/ArrayList;

    .line 986
    .line 987
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    move/from16 v7, v24

    .line 991
    .line 992
    goto/16 :goto_14

    .line 993
    .line 994
    :cond_23
    const-string v3, "path"

    .line 995
    .line 996
    invoke-virtual {v7, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 997
    .line 998
    .line 999
    move-result v3

    .line 1000
    if-nez v3, :cond_24

    .line 1001
    .line 1002
    goto/16 :goto_17

    .line 1003
    .line 1004
    :cond_24
    sget-object v3, Lci0;->d:[I

    .line 1005
    .line 1006
    if-nez v8, :cond_25

    .line 1007
    .line 1008
    invoke-virtual {v6, v14, v3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v3

    .line 1012
    const/4 v7, 0x0

    .line 1013
    goto :goto_1a

    .line 1014
    :cond_25
    const/4 v7, 0x0

    .line 1015
    invoke-virtual {v8, v14, v3, v7, v7}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v3

    .line 1019
    :goto_1a
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1020
    .line 1021
    .line 1022
    move-result v9

    .line 1023
    invoke-virtual {v10, v9}, Lyb;->c(I)V

    .line 1024
    .line 1025
    .line 1026
    const-string v9, "pathData"

    .line 1027
    .line 1028
    const-string v11, "http://schemas.android.com/apk/res/android"

    .line 1029
    .line 1030
    invoke-interface {v0, v11, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    if-eqz v0, :cond_39

    .line 1035
    .line 1036
    invoke-virtual {v3, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1041
    .line 1042
    .line 1043
    move-result v7

    .line 1044
    invoke-virtual {v10, v7}, Lyb;->c(I)V

    .line 1045
    .line 1046
    .line 1047
    if-nez v0, :cond_26

    .line 1048
    .line 1049
    move-object/from16 v44, v22

    .line 1050
    .line 1051
    :goto_1b
    const/4 v9, 0x2

    .line 1052
    goto :goto_1c

    .line 1053
    :cond_26
    move-object/from16 v44, v0

    .line 1054
    .line 1055
    goto :goto_1b

    .line 1056
    :goto_1c
    invoke-virtual {v3, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1061
    .line 1062
    .line 1063
    move-result v7

    .line 1064
    invoke-virtual {v10, v7}, Lyb;->c(I)V

    .line 1065
    .line 1066
    .line 1067
    if-nez v0, :cond_27

    .line 1068
    .line 1069
    sget v0, Ls93;->a:I

    .line 1070
    .line 1071
    :goto_1d
    move-object/from16 v45, v42

    .line 1072
    .line 1073
    goto :goto_1e

    .line 1074
    :cond_27
    invoke-static {v12, v0}, Lj5;->a(Lj5;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v42

    .line 1078
    goto :goto_1d

    .line 1079
    :goto_1e
    const-string v0, "fillColor"

    .line 1080
    .line 1081
    const/4 v11, 0x1

    .line 1082
    invoke-virtual {v10, v3, v8, v0, v11}, Lyb;->a(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Ldk;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    const-string v7, "fillAlpha"

    .line 1087
    .line 1088
    const/16 v9, 0xc

    .line 1089
    .line 1090
    invoke-virtual {v10, v3, v7, v9, v2}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1091
    .line 1092
    .line 1093
    move-result v48

    .line 1094
    const-string v7, "strokeLineCap"

    .line 1095
    .line 1096
    iget-object v11, v10, Lyb;->a:Lorg/xmlpull/v1/XmlPullParser;

    .line 1097
    .line 1098
    invoke-static {v11, v7}, Lfd3;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v7

    .line 1102
    if-nez v7, :cond_28

    .line 1103
    .line 1104
    const/4 v7, -0x1

    .line 1105
    const/16 v11, 0x8

    .line 1106
    .line 1107
    goto :goto_1f

    .line 1108
    :cond_28
    const/4 v7, -0x1

    .line 1109
    const/16 v11, 0x8

    .line 1110
    .line 1111
    invoke-virtual {v3, v11, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 1112
    .line 1113
    .line 1114
    move-result v12

    .line 1115
    move v7, v12

    .line 1116
    :goto_1f
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1117
    .line 1118
    .line 1119
    move-result v12

    .line 1120
    invoke-virtual {v10, v12}, Lyb;->c(I)V

    .line 1121
    .line 1122
    .line 1123
    if-eqz v7, :cond_29

    .line 1124
    .line 1125
    const/4 v12, 0x1

    .line 1126
    if-eq v7, v12, :cond_2b

    .line 1127
    .line 1128
    const/4 v12, 0x2

    .line 1129
    if-eq v7, v12, :cond_2a

    .line 1130
    .line 1131
    :cond_29
    const/16 v52, 0x0

    .line 1132
    .line 1133
    goto :goto_20

    .line 1134
    :cond_2a
    const/16 v52, 0x2

    .line 1135
    .line 1136
    goto :goto_20

    .line 1137
    :cond_2b
    const/16 v52, 0x1

    .line 1138
    .line 1139
    :goto_20
    const-string v7, "strokeLineJoin"

    .line 1140
    .line 1141
    iget-object v12, v10, Lyb;->a:Lorg/xmlpull/v1/XmlPullParser;

    .line 1142
    .line 1143
    invoke-static {v12, v7}, Lfd3;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v7

    .line 1147
    if-nez v7, :cond_2c

    .line 1148
    .line 1149
    const/4 v12, -0x1

    .line 1150
    const/4 v13, -0x1

    .line 1151
    goto :goto_21

    .line 1152
    :cond_2c
    const/16 v7, 0x9

    .line 1153
    .line 1154
    const/4 v13, -0x1

    .line 1155
    invoke-virtual {v3, v7, v13}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 1156
    .line 1157
    .line 1158
    move-result v12

    .line 1159
    :goto_21
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1160
    .line 1161
    .line 1162
    move-result v7

    .line 1163
    invoke-virtual {v10, v7}, Lyb;->c(I)V

    .line 1164
    .line 1165
    .line 1166
    if-eqz v12, :cond_2f

    .line 1167
    .line 1168
    const/4 v7, 0x1

    .line 1169
    if-eq v12, v7, :cond_2e

    .line 1170
    .line 1171
    const/4 v7, 0x2

    .line 1172
    if-eq v12, v7, :cond_2d

    .line 1173
    .line 1174
    :goto_22
    const/16 v53, 0x0

    .line 1175
    .line 1176
    goto :goto_23

    .line 1177
    :cond_2d
    move/from16 v53, v7

    .line 1178
    .line 1179
    goto :goto_23

    .line 1180
    :cond_2e
    const/4 v7, 0x2

    .line 1181
    const/16 v53, 0x1

    .line 1182
    .line 1183
    goto :goto_23

    .line 1184
    :cond_2f
    const/4 v7, 0x2

    .line 1185
    goto :goto_22

    .line 1186
    :goto_23
    const-string v12, "strokeMiterLimit"

    .line 1187
    .line 1188
    const/16 v7, 0xa

    .line 1189
    .line 1190
    const/high16 v9, 0x40800000    # 4.0f

    .line 1191
    .line 1192
    invoke-virtual {v10, v3, v12, v7, v9}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1193
    .line 1194
    .line 1195
    move-result v54

    .line 1196
    const-string v7, "strokeColor"

    .line 1197
    .line 1198
    const/4 v9, 0x3

    .line 1199
    invoke-virtual {v10, v3, v8, v7, v9}, Lyb;->a(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Ldk;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v7

    .line 1203
    const-string v12, "strokeAlpha"

    .line 1204
    .line 1205
    const/16 v9, 0xb

    .line 1206
    .line 1207
    invoke-virtual {v10, v3, v12, v9, v2}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1208
    .line 1209
    .line 1210
    move-result v50

    .line 1211
    const-string v9, "strokeWidth"

    .line 1212
    .line 1213
    const/4 v12, 0x4

    .line 1214
    invoke-virtual {v10, v3, v9, v12, v2}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1215
    .line 1216
    .line 1217
    move-result v51

    .line 1218
    const-string v9, "trimPathEnd"

    .line 1219
    .line 1220
    const/4 v11, 0x6

    .line 1221
    invoke-virtual {v10, v3, v9, v11, v2}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1222
    .line 1223
    .line 1224
    move-result v56

    .line 1225
    const-string v2, "trimPathOffset"

    .line 1226
    .line 1227
    const/4 v9, 0x7

    .line 1228
    const/4 v11, 0x0

    .line 1229
    invoke-virtual {v10, v3, v2, v9, v11}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1230
    .line 1231
    .line 1232
    move-result v57

    .line 1233
    const-string v2, "trimPathStart"

    .line 1234
    .line 1235
    const/4 v9, 0x5

    .line 1236
    invoke-virtual {v10, v3, v2, v9, v11}, Lyb;->b(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    .line 1237
    .line 1238
    .line 1239
    move-result v55

    .line 1240
    const-string v2, "fillType"

    .line 1241
    .line 1242
    iget-object v9, v10, Lyb;->a:Lorg/xmlpull/v1/XmlPullParser;

    .line 1243
    .line 1244
    invoke-static {v9, v2}, Lfd3;->a(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    if-nez v2, :cond_30

    .line 1249
    .line 1250
    const/16 v9, 0xd

    .line 1251
    .line 1252
    const/16 v17, 0x0

    .line 1253
    .line 1254
    goto :goto_24

    .line 1255
    :cond_30
    const/4 v2, 0x0

    .line 1256
    const/16 v9, 0xd

    .line 1257
    .line 1258
    invoke-virtual {v3, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 1259
    .line 1260
    .line 1261
    move-result v17

    .line 1262
    :goto_24
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1263
    .line 1264
    .line 1265
    move-result v2

    .line 1266
    invoke-virtual {v10, v2}, Lyb;->c(I)V

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 1270
    .line 1271
    .line 1272
    iget-object v2, v0, Ldk;->j:Ljava/lang/Object;

    .line 1273
    .line 1274
    check-cast v2, Landroid/graphics/Shader;

    .line 1275
    .line 1276
    iget v0, v0, Ldk;->i:I

    .line 1277
    .line 1278
    if-eqz v2, :cond_31

    .line 1279
    .line 1280
    goto :goto_25

    .line 1281
    :cond_31
    if-eqz v0, :cond_33

    .line 1282
    .line 1283
    :goto_25
    if-eqz v2, :cond_32

    .line 1284
    .line 1285
    new-instance v0, Lbn;

    .line 1286
    .line 1287
    invoke-direct {v0, v2}, Lbn;-><init>(Landroid/graphics/Shader;)V

    .line 1288
    .line 1289
    .line 1290
    move-object/from16 v47, v0

    .line 1291
    .line 1292
    goto :goto_26

    .line 1293
    :cond_32
    new-instance v2, Lft2;

    .line 1294
    .line 1295
    invoke-static {v0}, Lsp0;->b(I)J

    .line 1296
    .line 1297
    .line 1298
    move-result-wide v11

    .line 1299
    invoke-direct {v2, v11, v12}, Lft2;-><init>(J)V

    .line 1300
    .line 1301
    .line 1302
    move-object/from16 v47, v2

    .line 1303
    .line 1304
    goto :goto_26

    .line 1305
    :cond_33
    const/16 v47, 0x0

    .line 1306
    .line 1307
    :goto_26
    iget-object v0, v7, Ldk;->j:Ljava/lang/Object;

    .line 1308
    .line 1309
    check-cast v0, Landroid/graphics/Shader;

    .line 1310
    .line 1311
    iget v2, v7, Ldk;->i:I

    .line 1312
    .line 1313
    if-eqz v0, :cond_34

    .line 1314
    .line 1315
    goto :goto_27

    .line 1316
    :cond_34
    if-eqz v2, :cond_36

    .line 1317
    .line 1318
    :goto_27
    if-eqz v0, :cond_35

    .line 1319
    .line 1320
    new-instance v2, Lbn;

    .line 1321
    .line 1322
    invoke-direct {v2, v0}, Lbn;-><init>(Landroid/graphics/Shader;)V

    .line 1323
    .line 1324
    .line 1325
    move-object/from16 v49, v2

    .line 1326
    .line 1327
    goto :goto_28

    .line 1328
    :cond_35
    new-instance v0, Lft2;

    .line 1329
    .line 1330
    invoke-static {v2}, Lsp0;->b(I)J

    .line 1331
    .line 1332
    .line 1333
    move-result-wide v11

    .line 1334
    invoke-direct {v0, v11, v12}, Lft2;-><init>(J)V

    .line 1335
    .line 1336
    .line 1337
    move-object/from16 v49, v0

    .line 1338
    .line 1339
    goto :goto_28

    .line 1340
    :cond_36
    const/16 v49, 0x0

    .line 1341
    .line 1342
    :goto_28
    if-nez v17, :cond_37

    .line 1343
    .line 1344
    const/16 v46, 0x0

    .line 1345
    .line 1346
    goto :goto_29

    .line 1347
    :cond_37
    const/16 v46, 0x1

    .line 1348
    .line 1349
    :goto_29
    iget-boolean v0, v5, Lrx0;->k:Z

    .line 1350
    .line 1351
    if-eqz v0, :cond_38

    .line 1352
    .line 1353
    const-string v0, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    .line 1354
    .line 1355
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 1356
    .line 1357
    .line 1358
    :cond_38
    iget-object v0, v5, Lrx0;->i:Ljava/util/ArrayList;

    .line 1359
    .line 1360
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1361
    .line 1362
    .line 1363
    move-result v2

    .line 1364
    const/16 v18, 0x1

    .line 1365
    .line 1366
    add-int/lit8 v2, v2, -0x1

    .line 1367
    .line 1368
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v0

    .line 1372
    check-cast v0, Lqx0;

    .line 1373
    .line 1374
    iget-object v0, v0, Lqx0;->j:Ljava/util/ArrayList;

    .line 1375
    .line 1376
    new-instance v43, Lw93;

    .line 1377
    .line 1378
    invoke-direct/range {v43 .. v57}, Lw93;-><init>(Ljava/lang/String;Ljava/util/List;ILan;FLan;FFIIFFFF)V

    .line 1379
    .line 1380
    .line 1381
    move-object/from16 v2, v43

    .line 1382
    .line 1383
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1384
    .line 1385
    .line 1386
    move/from16 v7, v24

    .line 1387
    .line 1388
    const/4 v11, 0x1

    .line 1389
    goto/16 :goto_15

    .line 1390
    .line 1391
    :cond_39
    const-string v0, "No path data available"

    .line 1392
    .line 1393
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1394
    .line 1395
    .line 1396
    return-void

    .line 1397
    :cond_3a
    const/16 v9, 0xd

    .line 1398
    .line 1399
    const/4 v13, -0x1

    .line 1400
    const/16 v17, 0x4

    .line 1401
    .line 1402
    const/16 v20, 0x2

    .line 1403
    .line 1404
    const/16 v21, 0x9

    .line 1405
    .line 1406
    const-string v0, "clip-path"

    .line 1407
    .line 1408
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1409
    .line 1410
    .line 1411
    move-result v0

    .line 1412
    if-nez v0, :cond_3b

    .line 1413
    .line 1414
    const/4 v11, 0x1

    .line 1415
    goto/16 :goto_2f

    .line 1416
    .line 1417
    :cond_3b
    sget-object v0, Lci0;->e:[I

    .line 1418
    .line 1419
    if-nez v8, :cond_3c

    .line 1420
    .line 1421
    invoke-virtual {v6, v14, v0}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v0

    .line 1425
    const/4 v2, 0x0

    .line 1426
    goto :goto_2a

    .line 1427
    :cond_3c
    const/4 v2, 0x0

    .line 1428
    invoke-virtual {v8, v14, v0, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v0

    .line 1432
    :goto_2a
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1433
    .line 1434
    .line 1435
    move-result v3

    .line 1436
    invoke-virtual {v10, v3}, Lyb;->c(I)V

    .line 1437
    .line 1438
    .line 1439
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v3

    .line 1443
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1444
    .line 1445
    .line 1446
    move-result v2

    .line 1447
    invoke-virtual {v10, v2}, Lyb;->c(I)V

    .line 1448
    .line 1449
    .line 1450
    if-nez v3, :cond_3d

    .line 1451
    .line 1452
    move-object/from16 v44, v22

    .line 1453
    .line 1454
    :goto_2b
    const/4 v11, 0x1

    .line 1455
    goto :goto_2c

    .line 1456
    :cond_3d
    move-object/from16 v44, v3

    .line 1457
    .line 1458
    goto :goto_2b

    .line 1459
    :goto_2c
    invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v2

    .line 1463
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    .line 1464
    .line 1465
    .line 1466
    move-result v3

    .line 1467
    invoke-virtual {v10, v3}, Lyb;->c(I)V

    .line 1468
    .line 1469
    .line 1470
    if-nez v2, :cond_3e

    .line 1471
    .line 1472
    sget v2, Ls93;->a:I

    .line 1473
    .line 1474
    :goto_2d
    move-object/from16 v52, v42

    .line 1475
    .line 1476
    goto :goto_2e

    .line 1477
    :cond_3e
    invoke-static {v12, v2}, Lj5;->a(Lj5;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v42

    .line 1481
    goto :goto_2d

    .line 1482
    :goto_2e
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1483
    .line 1484
    .line 1485
    iget-boolean v0, v5, Lrx0;->k:Z

    .line 1486
    .line 1487
    if-eqz v0, :cond_3f

    .line 1488
    .line 1489
    const-string v0, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    .line 1490
    .line 1491
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 1492
    .line 1493
    .line 1494
    :cond_3f
    new-instance v43, Lqx0;

    .line 1495
    .line 1496
    const/16 v53, 0x200

    .line 1497
    .line 1498
    const/16 v45, 0x0

    .line 1499
    .line 1500
    const/16 v46, 0x0

    .line 1501
    .line 1502
    const/16 v47, 0x0

    .line 1503
    .line 1504
    const/high16 v48, 0x3f800000    # 1.0f

    .line 1505
    .line 1506
    const/high16 v49, 0x3f800000    # 1.0f

    .line 1507
    .line 1508
    const/16 v50, 0x0

    .line 1509
    .line 1510
    const/16 v51, 0x0

    .line 1511
    .line 1512
    invoke-direct/range {v43 .. v53}, Lqx0;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    .line 1513
    .line 1514
    .line 1515
    move-object/from16 v0, v43

    .line 1516
    .line 1517
    iget-object v2, v5, Lrx0;->i:Ljava/util/ArrayList;

    .line 1518
    .line 1519
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1520
    .line 1521
    .line 1522
    add-int/lit8 v7, v24, 0x1

    .line 1523
    .line 1524
    goto :goto_30

    .line 1525
    :goto_2f
    move/from16 v7, v24

    .line 1526
    .line 1527
    :goto_30
    invoke-interface/range {v25 .. v25}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 1528
    .line 1529
    .line 1530
    move/from16 v12, v21

    .line 1531
    .line 1532
    move-object/from16 v9, v25

    .line 1533
    .line 1534
    move/from16 v13, v26

    .line 1535
    .line 1536
    const/4 v0, 0x6

    .line 1537
    goto/16 :goto_10

    .line 1538
    .line 1539
    :cond_40
    move v11, v12

    .line 1540
    goto/16 :goto_11

    .line 1541
    .line 1542
    :goto_31
    iget v0, v10, Lyb;->b:I

    .line 1543
    .line 1544
    or-int v0, v26, v0

    .line 1545
    .line 1546
    new-instance v2, Ltx0;

    .line 1547
    .line 1548
    invoke-virtual {v5}, Lrx0;->b()Lsx0;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v3

    .line 1552
    invoke-direct {v2, v3, v0}, Ltx0;-><init>(Lsx0;I)V

    .line 1553
    .line 1554
    .line 1555
    iget-object v0, v15, Lvx0;->a:Ljava/util/HashMap;

    .line 1556
    .line 1557
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 1558
    .line 1559
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 1560
    .line 1561
    .line 1562
    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1563
    .line 1564
    .line 1565
    move-object v0, v2

    .line 1566
    goto :goto_32

    .line 1567
    :cond_41
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1568
    .line 1569
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v1

    .line 1573
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1574
    .line 1575
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1576
    .line 1577
    .line 1578
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1579
    .line 1580
    .line 1581
    const-string v1, "<VectorGraphic> tag requires viewportHeight > 0"

    .line 1582
    .line 1583
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1584
    .line 1585
    .line 1586
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v1

    .line 1590
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1591
    .line 1592
    .line 1593
    throw v0

    .line 1594
    :cond_42
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1595
    .line 1596
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v1

    .line 1600
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1601
    .line 1602
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 1603
    .line 1604
    .line 1605
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1606
    .line 1607
    .line 1608
    const-string v1, "<VectorGraphic> tag requires viewportWidth > 0"

    .line 1609
    .line 1610
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v1

    .line 1617
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1618
    .line 1619
    .line 1620
    throw v0

    .line 1621
    :cond_43
    const-string v0, "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"

    .line 1622
    .line 1623
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 1624
    .line 1625
    .line 1626
    return-void

    .line 1627
    :cond_44
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 1628
    .line 1629
    const-string v1, "No start tag found"

    .line 1630
    .line 1631
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 1632
    .line 1633
    .line 1634
    throw v0

    .line 1635
    :cond_45
    move/from16 v32, v7

    .line 1636
    .line 1637
    move v11, v10

    .line 1638
    :goto_32
    iget-object v0, v0, Ltx0;->a:Lsx0;

    .line 1639
    .line 1640
    invoke-static {v0, v1}, Lv93;->c(Lsx0;Lpx;)Lu93;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v0

    .line 1644
    const/4 v12, 0x0

    .line 1645
    invoke-virtual {v1, v12}, Lgo0;->p(Z)V

    .line 1646
    .line 1647
    .line 1648
    const/4 v2, 0x0

    .line 1649
    goto :goto_35

    .line 1650
    :cond_46
    move/from16 v32, v7

    .line 1651
    .line 1652
    move v11, v10

    .line 1653
    const v2, -0x69992078

    .line 1654
    .line 1655
    .line 1656
    invoke-virtual {v1, v2}, Lgo0;->W(I)V

    .line 1657
    .line 1658
    .line 1659
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v0

    .line 1663
    invoke-virtual {v1, v8}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1664
    .line 1665
    .line 1666
    move-result v2

    .line 1667
    invoke-virtual {v1, v9}, Lgo0;->d(I)Z

    .line 1668
    .line 1669
    .line 1670
    move-result v3

    .line 1671
    or-int/2addr v2, v3

    .line 1672
    invoke-virtual {v1, v0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 1673
    .line 1674
    .line 1675
    move-result v0

    .line 1676
    or-int/2addr v0, v2

    .line 1677
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v2

    .line 1681
    if-nez v0, :cond_47

    .line 1682
    .line 1683
    sget-object v0, Lnx;->a:Leb;

    .line 1684
    .line 1685
    if-ne v2, v0, :cond_48

    .line 1686
    .line 1687
    :cond_47
    const/4 v2, 0x0

    .line 1688
    goto :goto_33

    .line 1689
    :cond_48
    move-object v3, v2

    .line 1690
    const/4 v2, 0x0

    .line 1691
    goto :goto_34

    .line 1692
    :goto_33
    :try_start_2
    invoke-virtual {v6, v9, v2}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v0

    .line 1696
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1697
    .line 1698
    .line 1699
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 1700
    .line 1701
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v0

    .line 1705
    new-instance v3, Ld9;

    .line 1706
    .line 1707
    invoke-direct {v3, v0}, Ld9;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 1708
    .line 1709
    .line 1710
    invoke-virtual {v1, v3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1711
    .line 1712
    .line 1713
    :goto_34
    check-cast v3, Ld9;

    .line 1714
    .line 1715
    new-instance v0, Lyk;

    .line 1716
    .line 1717
    invoke-direct {v0, v3}, Lyk;-><init>(Ld9;)V

    .line 1718
    .line 1719
    .line 1720
    const/4 v12, 0x0

    .line 1721
    invoke-virtual {v1, v12}, Lgo0;->p(Z)V

    .line 1722
    .line 1723
    .line 1724
    :goto_35
    and-int/lit8 v3, v32, 0x70

    .line 1725
    .line 1726
    const/16 v4, 0x20

    .line 1727
    .line 1728
    if-ne v3, v4, :cond_49

    .line 1729
    .line 1730
    move v10, v11

    .line 1731
    goto :goto_36

    .line 1732
    :cond_49
    const/4 v10, 0x0

    .line 1733
    :goto_36
    invoke-virtual {v1}, Lgo0;->L()Ljava/lang/Object;

    .line 1734
    .line 1735
    .line 1736
    move-result-object v3

    .line 1737
    if-nez v10, :cond_4b

    .line 1738
    .line 1739
    sget-object v4, Lnx;->a:Leb;

    .line 1740
    .line 1741
    if-ne v3, v4, :cond_4a

    .line 1742
    .line 1743
    goto :goto_37

    .line 1744
    :cond_4a
    move-object v15, v3

    .line 1745
    move-wide/from16 v2, p1

    .line 1746
    .line 1747
    goto :goto_39

    .line 1748
    :cond_4b
    :goto_37
    const-wide/16 v3, 0x10

    .line 1749
    .line 1750
    cmp-long v3, p1, v3

    .line 1751
    .line 1752
    if-nez v3, :cond_4c

    .line 1753
    .line 1754
    move-object v15, v2

    .line 1755
    move-wide/from16 v2, p1

    .line 1756
    .line 1757
    goto :goto_38

    .line 1758
    :cond_4c
    new-instance v15, Lcl;

    .line 1759
    .line 1760
    move-wide/from16 v2, p1

    .line 1761
    .line 1762
    const/4 v7, 0x5

    .line 1763
    invoke-direct {v15, v2, v3, v7}, Lcl;-><init>(JI)V

    .line 1764
    .line 1765
    .line 1766
    :goto_38
    invoke-virtual {v1, v15}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 1767
    .line 1768
    .line 1769
    :goto_39
    check-cast v15, Lcl;

    .line 1770
    .line 1771
    sget-object v4, Lrh1;->a:Lrh1;

    .line 1772
    .line 1773
    sget v5, Lo00;->e:F

    .line 1774
    .line 1775
    invoke-static {v4, v5}, Lte;->g0(Luh1;F)Luh1;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v4

    .line 1779
    invoke-static {v4, v0, v15}, Lxe1;->Z(Luh1;Llw1;Lcl;)Luh1;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v0

    .line 1783
    const/4 v12, 0x0

    .line 1784
    invoke-static {v0, v1, v12}, Ldm;->a(Luh1;Lpx;I)V

    .line 1785
    .line 1786
    .line 1787
    goto :goto_3b

    .line 1788
    :catch_1
    move-exception v0

    .line 1789
    new-instance v1, Lpv;

    .line 1790
    .line 1791
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1792
    .line 1793
    const-string v3, "Error attempting to load resource: "

    .line 1794
    .line 1795
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1796
    .line 1797
    .line 1798
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v2

    .line 1805
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1806
    .line 1807
    .line 1808
    throw v1

    .line 1809
    :goto_3a
    monitor-exit v12

    .line 1810
    throw v0

    .line 1811
    :cond_4d
    invoke-virtual {v1}, Lgo0;->R()V

    .line 1812
    .line 1813
    .line 1814
    :goto_3b
    invoke-virtual {v1}, Lgo0;->r()Lb62;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v6

    .line 1818
    if-eqz v6, :cond_4e

    .line 1819
    .line 1820
    new-instance v0, Li60;

    .line 1821
    .line 1822
    const/4 v5, 0x0

    .line 1823
    move/from16 v1, p0

    .line 1824
    .line 1825
    move/from16 v4, p4

    .line 1826
    .line 1827
    invoke-direct/range {v0 .. v5}, Li60;-><init>(IJII)V

    .line 1828
    .line 1829
    .line 1830
    iput-object v0, v6, Lb62;->d:Lmn0;

    .line 1831
    .line 1832
    :cond_4e
    return-void

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final c(Lcz2;Lry2;Lxm0;Lpx;I)V
    .locals 9

    .line 1
    move-object v4, p3

    .line 2
    check-cast v4, Lgo0;

    .line 3
    .line 4
    const p3, -0x799dedcc

    .line 5
    .line 6
    .line 7
    invoke-virtual {v4, p3}, Lgo0;->X(I)Lgo0;

    .line 8
    .line 9
    .line 10
    and-int/lit8 p3, p4, 0x6

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-nez p3, :cond_2

    .line 14
    .line 15
    and-int/lit8 p3, p4, 0x8

    .line 16
    .line 17
    if-nez p3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v4, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v4, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    :goto_0
    if-eqz p3, :cond_1

    .line 29
    .line 30
    move p3, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 p3, 0x2

    .line 33
    :goto_1
    or-int/2addr p3, p4

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move p3, p4

    .line 36
    :goto_2
    and-int/lit8 v1, p4, 0x30

    .line 37
    .line 38
    const/16 v2, 0x20

    .line 39
    .line 40
    if-nez v1, :cond_5

    .line 41
    .line 42
    and-int/lit8 v1, p4, 0x40

    .line 43
    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    invoke-virtual {v4, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    invoke-virtual {v4, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    :goto_3
    if-eqz v1, :cond_4

    .line 56
    .line 57
    move v1, v2

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    const/16 v1, 0x10

    .line 60
    .line 61
    :goto_4
    or-int/2addr p3, v1

    .line 62
    :cond_5
    and-int/lit16 v1, p4, 0x180

    .line 63
    .line 64
    if-nez v1, :cond_7

    .line 65
    .line 66
    invoke-virtual {v4, p2}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_6

    .line 71
    .line 72
    const/16 v1, 0x100

    .line 73
    .line 74
    goto :goto_5

    .line 75
    :cond_6
    const/16 v1, 0x80

    .line 76
    .line 77
    :goto_5
    or-int/2addr p3, v1

    .line 78
    :cond_7
    and-int/lit16 v1, p3, 0x93

    .line 79
    .line 80
    const/16 v3, 0x92

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v6, 0x1

    .line 84
    if-eq v1, v3, :cond_8

    .line 85
    .line 86
    move v1, v6

    .line 87
    goto :goto_6

    .line 88
    :cond_8
    move v1, v5

    .line 89
    :goto_6
    and-int/lit8 v3, p3, 0x1

    .line 90
    .line 91
    invoke-virtual {v4, v3, v1}, Lgo0;->O(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_11

    .line 96
    .line 97
    and-int/lit8 v1, p3, 0x70

    .line 98
    .line 99
    if-eq v1, v2, :cond_a

    .line 100
    .line 101
    and-int/lit8 v1, p3, 0x40

    .line 102
    .line 103
    if-eqz v1, :cond_9

    .line 104
    .line 105
    invoke-virtual {v4, p1}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_9

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_9
    move v1, v5

    .line 113
    goto :goto_8

    .line 114
    :cond_a
    :goto_7
    move v1, v6

    .line 115
    :goto_8
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    sget-object v3, Lnx;->a:Leb;

    .line 120
    .line 121
    if-nez v1, :cond_b

    .line 122
    .line 123
    if-ne v2, v3, :cond_c

    .line 124
    .line 125
    :cond_b
    new-instance v2, Lje1;

    .line 126
    .line 127
    new-instance v1, Ln4;

    .line 128
    .line 129
    new-instance v7, Lr1;

    .line 130
    .line 131
    const/16 v8, 0xd

    .line 132
    .line 133
    invoke-direct {v7, v8, p1, p2}, Lr1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    const/4 v8, 0x7

    .line 137
    invoke-direct {v1, v8, v7}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-direct {v2, v1}, Lje1;-><init>(Ln4;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4, v2}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_c
    check-cast v2, Lje1;

    .line 147
    .line 148
    and-int/lit8 v1, p3, 0xe

    .line 149
    .line 150
    if-eq v1, v0, :cond_d

    .line 151
    .line 152
    and-int/lit8 p3, p3, 0x8

    .line 153
    .line 154
    if-eqz p3, :cond_e

    .line 155
    .line 156
    invoke-virtual {v4, p0}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result p3

    .line 160
    if-eqz p3, :cond_e

    .line 161
    .line 162
    :cond_d
    move v5, v6

    .line 163
    :cond_e
    invoke-virtual {v4}, Lgo0;->L()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p3

    .line 167
    if-nez v5, :cond_f

    .line 168
    .line 169
    if-ne p3, v3, :cond_10

    .line 170
    .line 171
    :cond_f
    new-instance p3, Lta;

    .line 172
    .line 173
    const/4 v0, 0x6

    .line 174
    invoke-direct {p3, v0, p0}, Lta;-><init>(ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, p3}, Lgo0;->f0(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_10
    move-object v1, p3

    .line 181
    check-cast v1, Lxm0;

    .line 182
    .line 183
    new-instance p3, Laf;

    .line 184
    .line 185
    const/4 v0, 0x3

    .line 186
    invoke-direct {p3, v0, p1, p0}, Laf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    const v0, 0x4e63add6    # 9.5495514E8f

    .line 190
    .line 191
    .line 192
    invoke-static {v0, p3, v4}, Lxe1;->i0(ILun0;Lpx;)Lkw;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    const/16 v5, 0xd80

    .line 197
    .line 198
    const/4 v6, 0x0

    .line 199
    move-object v0, v2

    .line 200
    sget-object v2, Lk60;->a:Lh22;

    .line 201
    .line 202
    invoke-static/range {v0 .. v6}, Lpa;->a(Lg22;Lxm0;Lh22;Lkw;Lpx;II)V

    .line 203
    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_11
    invoke-virtual {v4}, Lgo0;->R()V

    .line 207
    .line 208
    .line 209
    :goto_9
    invoke-virtual {v4}, Lgo0;->r()Lb62;

    .line 210
    .line 211
    .line 212
    move-result-object p3

    .line 213
    if-eqz p3, :cond_12

    .line 214
    .line 215
    new-instance v0, Lva;

    .line 216
    .line 217
    const/4 v5, 0x6

    .line 218
    move-object v1, p0

    .line 219
    move-object v2, p1

    .line 220
    move-object v3, p2

    .line 221
    move v4, p4

    .line 222
    invoke-direct/range {v0 .. v5}, Lva;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lun0;II)V

    .line 223
    .line 224
    .line 225
    iput-object v0, p3, Lb62;->d:Lmn0;

    .line 226
    .line 227
    :cond_12
    return-void
.end method

.method public static final d(Luh1;Lkw;Lpx;I)V
    .locals 4

    .line 1
    check-cast p2, Lgo0;

    .line 2
    .line 3
    const v0, 0x52f9d6eb

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Lgo0;->X(I)Lgo0;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p3, 0x6

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2, p0}, Lgo0;->f(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    or-int/2addr v0, p3

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p3

    .line 26
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 27
    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p2, p1}, Lgo0;->h(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    const/16 v2, 0x20

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v2, 0x10

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v2

    .line 42
    :cond_3
    and-int/lit8 v2, v0, 0x13

    .line 43
    .line 44
    const/16 v3, 0x12

    .line 45
    .line 46
    if-eq v2, v3, :cond_4

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    const/4 v2, 0x0

    .line 51
    :goto_3
    and-int/lit8 v3, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p2, v3, v2}, Lgo0;->O(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    sget-object v2, Laz2;->a:Lmy;

    .line 60
    .line 61
    and-int/lit8 v3, v0, 0xe

    .line 62
    .line 63
    or-int/lit16 v3, v3, 0x1b0

    .line 64
    .line 65
    shl-int/lit8 v0, v0, 0x6

    .line 66
    .line 67
    and-int/lit16 v0, v0, 0x1c00

    .line 68
    .line 69
    or-int/2addr v0, v3

    .line 70
    invoke-static {p0, v2, p1, p2, v0}, Lrp0;->I(Luh1;Le42;Lkw;Lpx;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_4

    .line 74
    :cond_5
    invoke-virtual {p2}, Lgo0;->R()V

    .line 75
    .line 76
    .line 77
    :goto_4
    invoke-virtual {p2}, Lgo0;->r()Lb62;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-eqz p2, :cond_6

    .line 82
    .line 83
    new-instance v0, Lob;

    .line 84
    .line 85
    invoke-direct {v0, p0, p1, p3, v1}, Lob;-><init>(Luh1;Lkw;II)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p2, Lb62;->d:Lmn0;

    .line 89
    .line 90
    :cond_6
    return-void
.end method
