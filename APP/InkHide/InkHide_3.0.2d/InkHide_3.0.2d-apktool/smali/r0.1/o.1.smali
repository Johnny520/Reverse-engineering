.class public final Lr0/o;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/q;


# direct methods
.method public synthetic constructor <init>(Lr0/q;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/o;->a:I

    iput-object p1, p0, Lr0/o;->b:Lr0/q;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, Lr0/o;->b:Lr0/q;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const-string v5, "args"

    .line 10
    .line 11
    const-string v6, "param"

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    iget v8, v0, Lr0/o;->a:I

    .line 15
    .line 16
    invoke-static {v1, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    packed-switch v8, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    sget-boolean v6, Lz0/i;->a:Z

    .line 23
    .line 24
    invoke-static {}, Lz0/g;->u()Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v6, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {v6, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v7, v6}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    instance-of v6, v5, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz v6, :cond_1

    .line 43
    .line 44
    check-cast v5, Ljava/lang/String;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object v5, v4

    .line 48
    :goto_0
    if-nez v5, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    iget-object v6, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 52
    .line 53
    if-nez v6, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {v3, v6, v5}, Lr0/q;->a(Lr0/q;Ljava/lang/Object;Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_5

    .line 61
    .line 62
    invoke-virtual {v1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    instance-of v1, v6, Landroid/view/View;

    .line 66
    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    move-object v4, v6

    .line 70
    check-cast v4, Landroid/view/View;

    .line 71
    .line 72
    :cond_4
    if-eqz v4, :cond_5

    .line 73
    .line 74
    new-instance v1, Lr0/p;

    .line 75
    .line 76
    invoke-direct {v1, v3, v6, v5, v7}, Lr0/p;-><init>(Lr0/q;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v4, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 80
    .line 81
    .line 82
    new-instance v1, Lr0/p;

    .line 83
    .line 84
    invoke-direct {v1, v3, v6, v5, v2}, Lr0/p;-><init>(Lr0/q;Ljava/lang/Object;Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    const-wide/16 v2, 0x12c

    .line 88
    .line 89
    invoke-virtual {v4, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 90
    .line 91
    .line 92
    :cond_5
    :goto_1
    return-void

    .line 93
    :pswitch_0
    sget-boolean v6, Lz0/i;->a:Z

    .line 94
    .line 95
    invoke-static {}, Lz0/g;->u()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-nez v6, :cond_6

    .line 100
    .line 101
    goto/16 :goto_7

    .line 102
    .line 103
    :cond_6
    iget-object v6, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 104
    .line 105
    invoke-static {v6, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v7, v6}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    instance-of v7, v6, Landroid/widget/ImageView;

    .line 113
    .line 114
    if-eqz v7, :cond_7

    .line 115
    .line 116
    check-cast v6, Landroid/widget/ImageView;

    .line 117
    .line 118
    move-object v10, v6

    .line 119
    goto :goto_2

    .line 120
    :cond_7
    move-object v10, v4

    .line 121
    :goto_2
    if-nez v10, :cond_8

    .line 122
    .line 123
    goto/16 :goto_7

    .line 124
    .line 125
    :cond_8
    iget-object v6, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 126
    .line 127
    invoke-static {v6, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2, v6}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    instance-of v5, v2, Ljava/lang/String;

    .line 135
    .line 136
    if-eqz v5, :cond_9

    .line 137
    .line 138
    check-cast v2, Ljava/lang/String;

    .line 139
    .line 140
    move-object v8, v2

    .line 141
    goto :goto_3

    .line 142
    :cond_9
    move-object v8, v4

    .line 143
    :goto_3
    if-nez v8, :cond_a

    .line 144
    .line 145
    goto/16 :goto_7

    .line 146
    .line 147
    :cond_a
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 148
    .line 149
    instance-of v5, v2, Ljava/lang/reflect/Method;

    .line 150
    .line 151
    if-eqz v5, :cond_b

    .line 152
    .line 153
    check-cast v2, Ljava/lang/reflect/Method;

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_b
    move-object v2, v4

    .line 157
    :goto_4
    if-eqz v2, :cond_d

    .line 158
    .line 159
    iget-object v5, v3, Lr0/q;->b:Ljava/util/Set;

    .line 160
    .line 161
    invoke-interface {v5, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_c

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_c
    invoke-interface {v5, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lz0/l;->c()Ljava/util/Map;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    const/4 v14, 0x0

    .line 180
    const/4 v15, 0x0

    .line 181
    const-string v12, ","

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const/16 v16, 0x3e

    .line 185
    .line 186
    invoke-static/range {v11 .. v16}, LF0/k;->m0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v7

    .line 202
    new-instance v9, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-string v6, "#"

    .line 211
    .line 212
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    const-string v7, "getParameterTypes(...)"

    .line 227
    .line 228
    invoke-static {v2, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v7, Lq0/d;

    .line 232
    .line 233
    const/16 v9, 0xd

    .line 234
    .line 235
    invoke-direct {v7, v9}, Lq0/d;-><init>(I)V

    .line 236
    .line 237
    .line 238
    const/16 v9, 0x1e

    .line 239
    .line 240
    const-string v11, ","

    .line 241
    .line 242
    invoke-static {v2, v11, v7, v9}, LF0/h;->h0([Ljava/lang/Object;Ljava/lang/String;LM0/l;I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    const-string v7, "firstUser="

    .line 247
    .line 248
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v7

    .line 252
    const-string v9, "configured="

    .line 253
    .line 254
    invoke-virtual {v9, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    const-string v9, "custom local avatar loader hit"

    .line 259
    .line 260
    filled-new-array {v9, v6, v2, v7, v5}, [Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_d
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    :goto_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    invoke-static {v8}, Lz0/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    if-nez v9, :cond_e

    .line 279
    .line 280
    goto/16 :goto_7

    .line 281
    .line 282
    :cond_e
    new-instance v2, Ljava/io/File;

    .line 283
    .line 284
    invoke-direct {v2, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 292
    .line 293
    .line 294
    move-result-wide v6

    .line 295
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 296
    .line 297
    .line 298
    move-result-wide v11

    .line 299
    invoke-static {v10}, Lr0/q;->j(Landroid/widget/ImageView;)I

    .line 300
    .line 301
    .line 302
    move-result v13

    .line 303
    new-instance v14, Ljava/lang/StringBuilder;

    .line 304
    .line 305
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string v5, ":"

    .line 312
    .line 313
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v14, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v14, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v5

    .line 335
    iget-object v3, v3, Lr0/q;->a:Landroid/util/LruCache;

    .line 336
    .line 337
    invoke-virtual {v3, v5}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    check-cast v6, Landroid/graphics/Bitmap;

    .line 342
    .line 343
    if-nez v6, :cond_10

    .line 344
    .line 345
    invoke-static {v10}, Lr0/q;->j(Landroid/widget/ImageView;)I

    .line 346
    .line 347
    .line 348
    move-result v6

    .line 349
    invoke-static {v2, v6}, Lr0/q;->c(Ljava/io/File;I)Landroid/graphics/Bitmap;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    if-eqz v2, :cond_f

    .line 354
    .line 355
    invoke-virtual {v3, v5, v2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-object v6, v2

    .line 359
    goto :goto_6

    .line 360
    :cond_f
    move-object v6, v4

    .line 361
    :goto_6
    if-nez v6, :cond_10

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_10
    move-object v11, v6

    .line 365
    sget-object v2, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 366
    .line 367
    invoke-virtual {v10, v2}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v10}, Landroid/view/View;->invalidate()V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    const-string v3, "custom local avatar applied"

    .line 385
    .line 386
    filled-new-array {v3, v8, v2}, [Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    new-instance v7, LD0/a;

    .line 394
    .line 395
    const/4 v12, 0x1

    .line 396
    invoke-direct/range {v7 .. v12}, LD0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v10, v7}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 400
    .line 401
    .line 402
    invoke-virtual {v1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :goto_7
    return-void

    .line 406
    nop

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
