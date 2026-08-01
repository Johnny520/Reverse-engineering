.class public abstract Li62;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lzz1;

.field public static final β:Lkw0;

.field public static γ:Landroid/graphics/Paint;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, Le81;->β(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    if-lt v0, v1, :cond_0

    .line 11
    .line 12
    new-instance v0, Lj62;

    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lzz1;-><init>(I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Li62;->α:Lzz1;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Lzz1;

    .line 23
    .line 24
    const/16 v1, 0x8

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lzz1;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Li62;->α:Lzz1;

    .line 30
    .line 31
    :goto_0
    new-instance v0, Lkw0;

    .line 32
    .line 33
    const/16 v1, 0x10

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lkw0;-><init>(I)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Li62;->β:Lkw0;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    sput-object v0, Li62;->γ:Landroid/graphics/Paint;

    .line 42
    .line 43
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static α(Landroid/content/Context;[Lf60;I)Landroid/graphics/Typeface;
    .locals 2

    .line 1
    const-string v0, "TypefaceCompat.createFromFontInfo"

    .line 2
    .line 3
    invoke-static {v0}, Le81;->β(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    sget-object v0, Li62;->α:Lzz1;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_1
    invoke-virtual {v0, p1, p0}, Lzz1;->θ([Lf60;Landroid/content/ContentResolver;)Landroid/graphics/fonts/FontFamily;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p1, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 24
    .line 25
    invoke-direct {p1, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p2}, Lzz1;->ζ(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p1, p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 41
    .line 42
    .line 43
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception p0

    .line 46
    :try_start_2
    const-string p1, "TypefaceCompatApi29Impl"

    .line 47
    .line 48
    const-string p2, "Font load failed"

    .line 49
    .line 50
    invoke-static {p1, p2, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 59
    .line 60
    .line 61
    throw p0
.end method

.method public static β(Landroid/content/Context;Lu50;Landroid/content/res/Resources;ILjava/lang/String;IILy5;Z)Landroid/graphics/Typeface;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v4, p6

    .line 4
    .line 5
    move-object/from16 v1, p7

    .line 6
    .line 7
    instance-of v2, v0, Lx50;

    .line 8
    .line 9
    const/16 v3, 0x15

    .line 10
    .line 11
    const/4 v6, -0x3

    .line 12
    const/4 v7, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    if-eqz v2, :cond_16

    .line 15
    .line 16
    check-cast v0, Lx50;

    .line 17
    .line 18
    const-string v2, "TypefaceCompat"

    .line 19
    .line 20
    iget-object v8, v0, Lx50;->δ:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v9

    .line 26
    const/4 v10, 0x1

    .line 27
    if-nez v9, :cond_0

    .line 28
    .line 29
    invoke-static {v8}, Li62;->ε(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    if-eqz v8, :cond_0

    .line 34
    .line 35
    goto/16 :goto_6

    .line 36
    .line 37
    :cond_0
    iget-object v8, v0, Lx50;->α:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    if-ne v9, v10, :cond_1

    .line 44
    .line 45
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ln50;

    .line 50
    .line 51
    iget-object v2, v2, Ln50;->ε:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v2}, Li62;->ε(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_1
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/16 v11, 0x1f

    .line 62
    .line 63
    if-ge v9, v11, :cond_2

    .line 64
    .line 65
    :goto_0
    move-object v8, v7

    .line 66
    goto/16 :goto_6

    .line 67
    .line 68
    :cond_2
    move v9, v5

    .line 69
    :goto_1
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-ge v9, v11, :cond_4

    .line 74
    .line 75
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v11

    .line 79
    check-cast v11, Ln50;

    .line 80
    .line 81
    iget-object v11, v11, Ln50;->ε:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v11}, Li62;->ε(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    if-nez v11, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    move v9, v5

    .line 94
    move-object v11, v7

    .line 95
    :goto_2
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-ge v9, v12, :cond_9

    .line 100
    .line 101
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    check-cast v12, Ln50;

    .line 106
    .line 107
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    sub-int/2addr v13, v10

    .line 112
    if-ne v9, v13, :cond_5

    .line 113
    .line 114
    iget-object v13, v12, Ln50;->ζ:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    if-eqz v13, :cond_5

    .line 121
    .line 122
    iget-object v2, v12, Ln50;->ε:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v11, v2}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setSystemFallback(Ljava/lang/String;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 125
    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_5
    iget-object v13, v12, Ln50;->ε:Ljava/lang/String;

    .line 129
    .line 130
    iget-object v14, v12, Ln50;->ζ:Ljava/lang/String;

    .line 131
    .line 132
    invoke-static {v13}, Li62;->ε(Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 133
    .line 134
    .line 135
    move-result-object v13

    .line 136
    invoke-static {v13}, Li62;->ζ(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    if-nez v13, :cond_6

    .line 141
    .line 142
    new-instance v8, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v9, "Unable identify the primary font for "

    .line 145
    .line 146
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v9, v12, Ln50;->ε:Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v9, ". Falling back to provider font."

    .line 155
    .line 156
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    invoke-static {v2, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_6
    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    if-eqz v12, :cond_7

    .line 172
    .line 173
    :try_start_0
    new-instance v12, Landroid/graphics/fonts/FontFamily$Builder;

    .line 174
    .line 175
    new-instance v15, Landroid/graphics/fonts/Font$Builder;

    .line 176
    .line 177
    invoke-static {v13}, Lk42;->γ(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/Font$Builder;

    .line 178
    .line 179
    .line 180
    move-result-object v13

    .line 181
    invoke-virtual {v13, v14}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    invoke-virtual {v13}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    invoke-direct {v12, v13}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v12}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 193
    .line 194
    .line 195
    move-result-object v12
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    goto :goto_3

    .line 197
    :catch_0
    const-string v8, "Failed to clone Font instance. Fall back to provider font."

    .line 198
    .line 199
    invoke-static {v2, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    .line 201
    .line 202
    goto/16 :goto_0

    .line 203
    .line 204
    :cond_7
    new-instance v12, Landroid/graphics/fonts/FontFamily$Builder;

    .line 205
    .line 206
    invoke-direct {v12, v13}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    :goto_3
    if-nez v11, :cond_8

    .line 214
    .line 215
    new-instance v11, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 216
    .line 217
    invoke-direct {v11, v12}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_8
    invoke-virtual {v11, v12}, Landroid/graphics/Typeface$CustomFallbackBuilder;->addCustomFallback(Landroid/graphics/fonts/FontFamily;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 222
    .line 223
    .line 224
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 225
    .line 226
    goto/16 :goto_2

    .line 227
    .line 228
    :cond_9
    :goto_5
    invoke-virtual {v11}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 229
    .line 230
    .line 231
    move-result-object v8

    .line 232
    :goto_6
    if-eqz v8, :cond_b

    .line 233
    .line 234
    if-eqz v1, :cond_a

    .line 235
    .line 236
    new-instance v0, Landroid/os/Handler;

    .line 237
    .line 238
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 243
    .line 244
    .line 245
    new-instance v2, Lii0;

    .line 246
    .line 247
    invoke-direct {v2, v1, v3, v8}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 251
    .line 252
    .line 253
    :cond_a
    sget-object v0, Li62;->β:Lkw0;

    .line 254
    .line 255
    invoke-static/range {p2 .. p6}, Li62;->δ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    invoke-virtual {v0, v1, v8}, Lkw0;->β(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    return-object v8

    .line 263
    :cond_b
    if-eqz p8, :cond_d

    .line 264
    .line 265
    iget v2, v0, Lx50;->γ:I

    .line 266
    .line 267
    if-nez v2, :cond_c

    .line 268
    .line 269
    :goto_7
    move v2, v10

    .line 270
    goto :goto_8

    .line 271
    :cond_c
    move v2, v5

    .line 272
    goto :goto_8

    .line 273
    :cond_d
    if-nez v1, :cond_c

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :goto_8
    const/4 v3, -0x1

    .line 277
    if-eqz p8, :cond_e

    .line 278
    .line 279
    iget v8, v0, Lx50;->β:I

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_e
    move v8, v3

    .line 283
    :goto_9
    new-instance v9, Landroid/os/Handler;

    .line 284
    .line 285
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 286
    .line 287
    .line 288
    move-result-object v11

    .line 289
    invoke-direct {v9, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 290
    .line 291
    .line 292
    new-instance v11, Ly21;

    .line 293
    .line 294
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 295
    .line 296
    .line 297
    iput-object v1, v11, Ly21;->ε:Ljava/lang/Object;

    .line 298
    .line 299
    iget-object v0, v0, Lx50;->α:Ljava/util/ArrayList;

    .line 300
    .line 301
    new-instance v12, Ln5;

    .line 302
    .line 303
    new-instance v1, Lnn1;

    .line 304
    .line 305
    invoke-direct {v1, v9}, Lnn1;-><init>(Landroid/os/Handler;)V

    .line 306
    .line 307
    .line 308
    const/4 v9, 0x7

    .line 309
    invoke-direct {v12, v9, v11, v1, v5}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 310
    .line 311
    .line 312
    if-eqz v2, :cond_12

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    if-gt v2, v10, :cond_11

    .line 319
    .line 320
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Ln50;

    .line 325
    .line 326
    sget-object v2, Lt50;->α:Lkw0;

    .line 327
    .line 328
    invoke-static {v0}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-static {v4, v2}, Lt50;->α(ILjava/util/List;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    sget-object v9, Lt50;->α:Lkw0;

    .line 337
    .line 338
    invoke-virtual {v9, v2}, Lkw0;->α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    check-cast v9, Landroid/graphics/Typeface;

    .line 343
    .line 344
    if-eqz v9, :cond_f

    .line 345
    .line 346
    new-instance v0, Lｓ;

    .line 347
    .line 348
    invoke-direct {v0, v10, v11, v9, v5}, Lｓ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v0}, Lnn1;->execute(Ljava/lang/Runnable;)V

    .line 352
    .line 353
    .line 354
    move-object v7, v9

    .line 355
    goto/16 :goto_d

    .line 356
    .line 357
    :cond_f
    if-ne v8, v3, :cond_10

    .line 358
    .line 359
    invoke-static {v0}, Ljava/util/List;->of(Ljava/lang/Object;)Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    move-object/from16 v1, p0

    .line 364
    .line 365
    invoke-static {v2, v1, v0, v4}, Lt50;->β(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Ls50;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v12, v0}, Ln5;->Ο(Ls50;)V

    .line 370
    .line 371
    .line 372
    iget-object v7, v0, Ls50;->α:Landroid/graphics/Typeface;

    .line 373
    .line 374
    goto/16 :goto_d

    .line 375
    .line 376
    :cond_10
    move-object/from16 v1, p0

    .line 377
    .line 378
    move-object v3, v0

    .line 379
    new-instance v0, Lq50;

    .line 380
    .line 381
    const/4 v5, 0x0

    .line 382
    move-object/from16 v16, v2

    .line 383
    .line 384
    move-object v2, v1

    .line 385
    move-object/from16 v1, v16

    .line 386
    .line 387
    invoke-direct/range {v0 .. v5}, Lq50;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 388
    .line 389
    .line 390
    :try_start_1
    sget-object v1, Lt50;->β:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 391
    .line 392
    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 393
    .line 394
    .line 395
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_4

    .line 396
    int-to-long v1, v8

    .line 397
    :try_start_2
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 398
    .line 399
    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_3

    .line 403
    :try_start_3
    check-cast v0, Ls50;

    .line 404
    .line 405
    invoke-virtual {v12, v0}, Ln5;->Ο(Ls50;)V

    .line 406
    .line 407
    .line 408
    iget-object v7, v0, Ls50;->α:Landroid/graphics/Typeface;

    .line 409
    .line 410
    goto/16 :goto_d

    .line 411
    .line 412
    :catch_1
    move-exception v0

    .line 413
    goto :goto_a

    .line 414
    :catch_2
    move-exception v0

    .line 415
    goto :goto_b

    .line 416
    :catch_3
    new-instance v0, Ljava/lang/InterruptedException;

    .line 417
    .line 418
    const-string v1, "timeout"

    .line 419
    .line 420
    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v0

    .line 424
    :goto_a
    throw v0

    .line 425
    :goto_b
    new-instance v1, Ljava/lang/RuntimeException;

    .line 426
    .line 427
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 428
    .line 429
    .line 430
    throw v1
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_4

    .line 431
    :catch_4
    iget-object v0, v12, Ln5;->η:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v0, Lnn1;

    .line 434
    .line 435
    iget-object v1, v12, Ln5;->ζ:Ljava/lang/Object;

    .line 436
    .line 437
    check-cast v1, Ly21;

    .line 438
    .line 439
    new-instance v2, Lmd;

    .line 440
    .line 441
    invoke-direct {v2, v1, v6}, Lmd;-><init>(Ly21;I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v2}, Lnn1;->execute(Ljava/lang/Runnable;)V

    .line 445
    .line 446
    .line 447
    goto/16 :goto_d

    .line 448
    .line 449
    :cond_11
    const-string v0, "Fallbacks with blocking fetches are not supported for performance reasons"

    .line 450
    .line 451
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-object v7

    .line 455
    :cond_12
    invoke-static {v4, v0}, Lt50;->α(ILjava/util/List;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    sget-object v3, Lt50;->α:Lkw0;

    .line 460
    .line 461
    invoke-virtual {v3, v2}, Lkw0;->α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    check-cast v3, Landroid/graphics/Typeface;

    .line 466
    .line 467
    if-eqz v3, :cond_13

    .line 468
    .line 469
    new-instance v0, Lｓ;

    .line 470
    .line 471
    invoke-direct {v0, v10, v11, v3, v5}, Lｓ;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v0}, Lnn1;->execute(Ljava/lang/Runnable;)V

    .line 475
    .line 476
    .line 477
    move-object v7, v3

    .line 478
    goto :goto_d

    .line 479
    :cond_13
    new-instance v1, Lr50;

    .line 480
    .line 481
    invoke-direct {v1, v5, v12}, Lr50;-><init>(ILjava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    sget-object v8, Lt50;->γ:Ljava/lang/Object;

    .line 485
    .line 486
    monitor-enter v8

    .line 487
    :try_start_4
    sget-object v3, Lt50;->δ:Lfw1;

    .line 488
    .line 489
    invoke-virtual {v3, v2}, Lfw1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v5

    .line 493
    check-cast v5, Ljava/util/ArrayList;

    .line 494
    .line 495
    if-eqz v5, :cond_14

    .line 496
    .line 497
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    monitor-exit v8

    .line 501
    goto :goto_d

    .line 502
    :catchall_0
    move-exception v0

    .line 503
    goto :goto_e

    .line 504
    :cond_14
    new-instance v5, Ljava/util/ArrayList;

    .line 505
    .line 506
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 510
    .line 511
    .line 512
    invoke-virtual {v3, v2, v5}, Lfw1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 516
    move-object v3, v0

    .line 517
    new-instance v0, Lq50;

    .line 518
    .line 519
    const/4 v5, 0x1

    .line 520
    move-object v1, v2

    .line 521
    move-object/from16 v2, p0

    .line 522
    .line 523
    invoke-direct/range {v0 .. v5}, Lq50;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 524
    .line 525
    .line 526
    sget-object v2, Lt50;->β:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 527
    .line 528
    new-instance v3, Lr50;

    .line 529
    .line 530
    invoke-direct {v3, v10, v1}, Lr50;-><init>(ILjava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    if-nez v1, :cond_15

    .line 538
    .line 539
    new-instance v1, Landroid/os/Handler;

    .line 540
    .line 541
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 542
    .line 543
    .line 544
    move-result-object v5

    .line 545
    invoke-direct {v1, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 546
    .line 547
    .line 548
    goto :goto_c

    .line 549
    :cond_15
    new-instance v1, Landroid/os/Handler;

    .line 550
    .line 551
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 552
    .line 553
    .line 554
    :goto_c
    new-instance v5, Lon1;

    .line 555
    .line 556
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 557
    .line 558
    .line 559
    iput-object v0, v5, Lon1;->ε:Lq50;

    .line 560
    .line 561
    iput-object v3, v5, Lon1;->ζ:Lr50;

    .line 562
    .line 563
    iput-object v1, v5, Lon1;->η:Landroid/os/Handler;

    .line 564
    .line 565
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 566
    .line 567
    .line 568
    :goto_d
    move-object/from16 v12, p2

    .line 569
    .line 570
    goto/16 :goto_13

    .line 571
    .line 572
    :goto_e
    :try_start_5
    monitor-exit v8
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 573
    throw v0

    .line 574
    :cond_16
    sget-object v2, Li62;->α:Lzz1;

    .line 575
    .line 576
    check-cast v0, Lv50;

    .line 577
    .line 578
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    :try_start_6
    iget-object v0, v0, Lv50;->α:[Lw50;

    .line 582
    .line 583
    array-length v2, v0

    .line 584
    move-object v8, v7

    .line 585
    :goto_f
    if-ge v5, v2, :cond_18

    .line 586
    .line 587
    aget-object v9, v0, v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 588
    .line 589
    :try_start_7
    new-instance v10, Landroid/graphics/fonts/Font$Builder;

    .line 590
    .line 591
    iget v11, v9, Lw50;->ε:I
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 592
    .line 593
    move-object/from16 v12, p2

    .line 594
    .line 595
    :try_start_8
    invoke-direct {v10, v12, v11}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/content/res/Resources;I)V

    .line 596
    .line 597
    .line 598
    iget v11, v9, Lw50;->α:I

    .line 599
    .line 600
    invoke-virtual {v10, v11}, Landroid/graphics/fonts/Font$Builder;->setWeight(I)Landroid/graphics/fonts/Font$Builder;

    .line 601
    .line 602
    .line 603
    move-result-object v10

    .line 604
    iget-boolean v11, v9, Lw50;->β:Z

    .line 605
    .line 606
    invoke-virtual {v10, v11}, Landroid/graphics/fonts/Font$Builder;->setSlant(I)Landroid/graphics/fonts/Font$Builder;

    .line 607
    .line 608
    .line 609
    move-result-object v10

    .line 610
    iget v11, v9, Lw50;->δ:I

    .line 611
    .line 612
    invoke-virtual {v10, v11}, Landroid/graphics/fonts/Font$Builder;->setTtcIndex(I)Landroid/graphics/fonts/Font$Builder;

    .line 613
    .line 614
    .line 615
    move-result-object v10

    .line 616
    iget-object v9, v9, Lw50;->γ:Ljava/lang/String;

    .line 617
    .line 618
    invoke-virtual {v10, v9}, Landroid/graphics/fonts/Font$Builder;->setFontVariationSettings(Ljava/lang/String;)Landroid/graphics/fonts/Font$Builder;

    .line 619
    .line 620
    .line 621
    move-result-object v9

    .line 622
    invoke-virtual {v9}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    .line 623
    .line 624
    .line 625
    move-result-object v9

    .line 626
    if-nez v8, :cond_17

    .line 627
    .line 628
    new-instance v10, Landroid/graphics/fonts/FontFamily$Builder;

    .line 629
    .line 630
    invoke-direct {v10, v9}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 631
    .line 632
    .line 633
    move-object v8, v10

    .line 634
    goto :goto_10

    .line 635
    :catch_5
    move-exception v0

    .line 636
    goto :goto_11

    .line 637
    :cond_17
    invoke-virtual {v8, v9}, Landroid/graphics/fonts/FontFamily$Builder;->addFont(Landroid/graphics/fonts/Font;)Landroid/graphics/fonts/FontFamily$Builder;
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    .line 638
    .line 639
    .line 640
    goto :goto_10

    .line 641
    :catch_6
    move-exception v0

    .line 642
    move-object/from16 v12, p2

    .line 643
    .line 644
    goto :goto_11

    .line 645
    :catch_7
    move-object/from16 v12, p2

    .line 646
    .line 647
    :catch_8
    :goto_10
    add-int/lit8 v5, v5, 0x1

    .line 648
    .line 649
    goto :goto_f

    .line 650
    :cond_18
    move-object/from16 v12, p2

    .line 651
    .line 652
    if-nez v8, :cond_19

    .line 653
    .line 654
    goto :goto_12

    .line 655
    :cond_19
    :try_start_9
    invoke-virtual {v8}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    new-instance v2, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 660
    .line 661
    invoke-direct {v2, v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 662
    .line 663
    .line 664
    invoke-static {v0, v4}, Lzz1;->ζ(Landroid/graphics/fonts/FontFamily;I)Landroid/graphics/fonts/Font;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    invoke-virtual {v0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    invoke-virtual {v2, v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    invoke-virtual {v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 677
    .line 678
    .line 679
    move-result-object v7
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5

    .line 680
    goto :goto_12

    .line 681
    :goto_11
    const-string v2, "TypefaceCompatApi29Impl"

    .line 682
    .line 683
    const-string v5, "Font load failed"

    .line 684
    .line 685
    invoke-static {v2, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 686
    .line 687
    .line 688
    :goto_12
    if-eqz v1, :cond_1b

    .line 689
    .line 690
    if-eqz v7, :cond_1a

    .line 691
    .line 692
    new-instance v0, Landroid/os/Handler;

    .line 693
    .line 694
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 699
    .line 700
    .line 701
    new-instance v2, Lii0;

    .line 702
    .line 703
    invoke-direct {v2, v1, v3, v7}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 707
    .line 708
    .line 709
    goto :goto_13

    .line 710
    :cond_1a
    invoke-virtual {v1, v6}, Ly5;->α(I)V

    .line 711
    .line 712
    .line 713
    :cond_1b
    :goto_13
    if-eqz v7, :cond_1c

    .line 714
    .line 715
    sget-object v0, Li62;->β:Lkw0;

    .line 716
    .line 717
    invoke-static/range {p2 .. p6}, Li62;->δ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-virtual {v0, v1, v7}, Lkw0;->β(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    :cond_1c
    return-object v7
.end method

.method public static γ(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    sget-object v0, Li62;->α:Lzz1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, Landroid/graphics/fonts/Font$Builder;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Landroid/graphics/fonts/Font$Builder;-><init>(Landroid/content/res/Resources;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/fonts/Font$Builder;->build()Landroid/graphics/fonts/Font;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroid/graphics/fonts/FontFamily$Builder;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroid/graphics/fonts/FontFamily$Builder;-><init>(Landroid/graphics/fonts/Font;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/fonts/FontFamily$Builder;->build()Landroid/graphics/fonts/FontFamily;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Landroid/graphics/Typeface$CustomFallbackBuilder;-><init>(Landroid/graphics/fonts/FontFamily;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/graphics/fonts/Font;->getStyle()Landroid/graphics/fonts/FontStyle;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v2, v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->setStyle(Landroid/graphics/fonts/FontStyle;)Landroid/graphics/Typeface$CustomFallbackBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/graphics/Typeface$CustomFallbackBuilder;->build()Landroid/graphics/Typeface;

    .line 38
    .line 39
    .line 40
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const-string v1, "TypefaceCompatApi29Impl"

    .line 44
    .line 45
    const-string v2, "Font load failed"

    .line 46
    .line 47
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-static {p0, p1, p2, p3, p4}, Li62;->δ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Li62;->β:Lkw0;

    .line 58
    .line 59
    invoke-virtual {p1, p0, v0}, Lkw0;->β(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_0
    return-object v0
.end method

.method public static δ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public static ε(Ljava/lang/String;)Landroid/graphics/Typeface;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    invoke-static {p0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 17
    .line 18
    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static ζ(Landroid/graphics/Typeface;)Landroid/graphics/fonts/Font;
    .locals 2

    .line 1
    sget-object v0, Li62;->γ:Landroid/graphics/Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/Paint;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Li62;->γ:Landroid/graphics/Paint;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Li62;->γ:Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v1, 0x41200000    # 10.0f

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Li62;->γ:Landroid/graphics/Paint;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 22
    .line 23
    .line 24
    sget-object p0, Li62;->γ:Landroid/graphics/Paint;

    .line 25
    .line 26
    invoke-static {p0}, Lk42;->ε(Landroid/graphics/Paint;)Landroid/graphics/text/PositionedGlyphs;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lk42;->α(Landroid/graphics/text/PositionedGlyphs;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_1
    invoke-static {p0}, Lk42;->δ(Landroid/graphics/text/PositionedGlyphs;)Landroid/graphics/fonts/Font;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
