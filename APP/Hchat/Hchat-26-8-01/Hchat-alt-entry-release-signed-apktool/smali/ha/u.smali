.class public final synthetic Lha/u;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lha/v;


# direct methods
.method public synthetic constructor <init>(Lha/v;I)V
    .locals 0

    .line 1
    iput p2, p0, Lha/u;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lha/u;->h:Lha/v;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lha/u;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lha/u;->h:Lha/v;

    .line 7
    .line 8
    iget-object v0, v0, Lha/v;->e:Lha/z;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    const-string v2, "\u670b\u53cb\u5708\u5173\u952e\u8bcd\u5c4f\u853d\u4e2a\u4eba\u4e3b\u9875 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-boolean v3, v0, Lha/z;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    monitor-exit v0

    .line 22
    :goto_0
    move v2, v4

    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    :try_start_1
    iget-object v3, v0, Lha/z;->a:Lr8/g;

    .line 26
    .line 27
    iget-object v5, v3, Lr8/g;->a:Landroid/content/Context;

    .line 28
    .line 29
    iget-object v3, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 30
    .line 31
    invoke-static {v5, v3}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-wide v5, v3, Ll8/i;->a:J

    .line 36
    .line 37
    const-wide/16 v7, 0x0

    .line 38
    .line 39
    cmp-long v3, v5, v7

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    const-wide/16 v7, 0xbcc

    .line 44
    .line 45
    cmp-long v3, v5, v7

    .line 46
    .line 47
    if-ltz v3, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iput-boolean v4, v0, Lha/z;->p:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    monitor-exit v0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    goto :goto_6

    .line 56
    :cond_2
    :goto_1
    :try_start_2
    invoke-virtual {v0}, Lha/z;->k()Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 60
    if-eqz v3, :cond_5

    .line 61
    .line 62
    :try_start_3
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 63
    .line 64
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    if-eqz v6, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    move-object v6, v3

    .line 72
    :goto_2
    new-instance v7, Lha/y;

    .line 73
    .line 74
    const/4 v8, 0x3

    .line 75
    invoke-direct {v7, v0, v8}, Lha/y;-><init>(Lha/z;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5, v6, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 79
    .line 80
    .line 81
    iput-boolean v4, v0, Lha/z;->p:Z

    .line 82
    .line 83
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_1
    move-exception v5

    .line 87
    :try_start_4
    new-instance v6, Lsf/f;

    .line 88
    .line 89
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    move-object v5, v6

    .line 93
    :goto_3
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    if-nez v6, :cond_4

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_4
    iget-object v5, v0, Lha/z;->b:Lab/b;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    new-instance v7, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v5, v2, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 122
    .line 123
    :goto_4
    check-cast v5, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 129
    monitor-exit v0

    .line 130
    goto :goto_5

    .line 131
    :cond_5
    monitor-exit v0

    .line 132
    move v2, v1

    .line 133
    :goto_5
    if-ne v2, v4, :cond_6

    .line 134
    .line 135
    move v1, v4

    .line 136
    goto :goto_7

    .line 137
    :goto_6
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 138
    throw v1

    .line 139
    :cond_6
    :goto_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :pswitch_0
    iget-object v0, p0, Lha/u;->h:Lha/v;

    .line 145
    .line 146
    iget-object v0, v0, Lha/v;->e:Lha/z;

    .line 147
    .line 148
    const/4 v1, 0x0

    .line 149
    if-eqz v0, :cond_b

    .line 150
    .line 151
    const-string v2, "\u670b\u53cb\u5708\u5173\u952e\u8bcd\u5c4f\u853d\u4e2a\u4eba\u4e3b\u9875\u5217\u8868 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 152
    .line 153
    monitor-enter v0

    .line 154
    :try_start_6
    iget-boolean v3, v0, Lha/z;->o:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 155
    .line 156
    const/4 v4, 0x1

    .line 157
    if-eqz v3, :cond_7

    .line 158
    .line 159
    monitor-exit v0

    .line 160
    move v2, v4

    .line 161
    goto :goto_b

    .line 162
    :cond_7
    :try_start_7
    invoke-virtual {v0}, Lha/z;->n()Ljava/lang/reflect/Method;

    .line 163
    .line 164
    .line 165
    move-result-object v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 166
    if-eqz v3, :cond_a

    .line 167
    .line 168
    :try_start_8
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 169
    .line 170
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-eqz v6, :cond_8

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_8
    move-object v6, v3

    .line 178
    :goto_8
    new-instance v7, Lha/y;

    .line 179
    .line 180
    const/4 v8, 0x2

    .line 181
    invoke-direct {v7, v0, v8}, Lha/y;-><init>(Lha/z;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5, v6, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 185
    .line 186
    .line 187
    iput-boolean v4, v0, Lha/z;->o:Z

    .line 188
    .line 189
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 190
    .line 191
    goto :goto_9

    .line 192
    :catchall_2
    move-exception v5

    .line 193
    :try_start_9
    new-instance v6, Lsf/f;

    .line 194
    .line 195
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    move-object v5, v6

    .line 199
    :goto_9
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    if-nez v6, :cond_9

    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_9
    iget-object v5, v0, Lha/z;->b:Lab/b;

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    new-instance v7, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v5, v2, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 228
    .line 229
    :goto_a
    check-cast v5, Ljava/lang/Boolean;

    .line 230
    .line 231
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 232
    .line 233
    .line 234
    move-result v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 235
    monitor-exit v0

    .line 236
    goto :goto_b

    .line 237
    :catchall_3
    move-exception v1

    .line 238
    goto :goto_c

    .line 239
    :cond_a
    monitor-exit v0

    .line 240
    move v2, v1

    .line 241
    :goto_b
    if-ne v2, v4, :cond_b

    .line 242
    .line 243
    move v1, v4

    .line 244
    goto :goto_d

    .line 245
    :goto_c
    :try_start_a
    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 246
    throw v1

    .line 247
    :cond_b
    :goto_d
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    return-object v0

    .line 252
    :pswitch_1
    iget-object v0, p0, Lha/u;->h:Lha/v;

    .line 253
    .line 254
    iget-object v0, v0, Lha/v;->e:Lha/z;

    .line 255
    .line 256
    const/4 v1, 0x0

    .line 257
    if-eqz v0, :cond_10

    .line 258
    .line 259
    const-string v2, "\u670b\u53cb\u5708\u5173\u952e\u8bcd\u5c4f\u853d\u65b0\u7248\u65f6\u95f4\u7ebf Hook \u5b89\u88c5\u5931\u8d25: "

    .line 260
    .line 261
    monitor-enter v0

    .line 262
    :try_start_b
    iget-boolean v3, v0, Lha/z;->n:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 263
    .line 264
    const/4 v4, 0x1

    .line 265
    if-eqz v3, :cond_c

    .line 266
    .line 267
    monitor-exit v0

    .line 268
    move v2, v4

    .line 269
    goto :goto_11

    .line 270
    :cond_c
    :try_start_c
    invoke-virtual {v0}, Lha/z;->l()Ljava/lang/reflect/Method;

    .line 271
    .line 272
    .line 273
    move-result-object v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 274
    if-eqz v3, :cond_f

    .line 275
    .line 276
    :try_start_d
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 277
    .line 278
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    if-eqz v6, :cond_d

    .line 283
    .line 284
    goto :goto_e

    .line 285
    :cond_d
    move-object v6, v3

    .line 286
    :goto_e
    new-instance v7, Lha/y;

    .line 287
    .line 288
    const/4 v8, 0x0

    .line 289
    invoke-direct {v7, v0, v8}, Lha/y;-><init>(Lha/z;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v5, v6, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 293
    .line 294
    .line 295
    iput-boolean v4, v0, Lha/z;->n:Z

    .line 296
    .line 297
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .line 298
    .line 299
    goto :goto_f

    .line 300
    :catchall_4
    move-exception v5

    .line 301
    :try_start_e
    new-instance v6, Lsf/f;

    .line 302
    .line 303
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 304
    .line 305
    .line 306
    move-object v5, v6

    .line 307
    :goto_f
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    if-nez v6, :cond_e

    .line 312
    .line 313
    goto :goto_10

    .line 314
    :cond_e
    iget-object v5, v0, Lha/z;->b:Lab/b;

    .line 315
    .line 316
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    new-instance v7, Ljava/lang/StringBuilder;

    .line 321
    .line 322
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-virtual {v5, v2, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 336
    .line 337
    :goto_10
    check-cast v5, Ljava/lang/Boolean;

    .line 338
    .line 339
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 340
    .line 341
    .line 342
    move-result v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 343
    monitor-exit v0

    .line 344
    goto :goto_11

    .line 345
    :catchall_5
    move-exception v1

    .line 346
    goto :goto_12

    .line 347
    :cond_f
    monitor-exit v0

    .line 348
    move v2, v1

    .line 349
    :goto_11
    if-ne v2, v4, :cond_10

    .line 350
    .line 351
    move v1, v4

    .line 352
    goto :goto_13

    .line 353
    :goto_12
    :try_start_f
    monitor-exit v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 354
    throw v1

    .line 355
    :cond_10
    :goto_13
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    return-object v0

    .line 360
    :pswitch_2
    iget-object v0, p0, Lha/u;->h:Lha/v;

    .line 361
    .line 362
    iget-object v0, v0, Lha/v;->e:Lha/z;

    .line 363
    .line 364
    const/4 v1, 0x0

    .line 365
    if-eqz v0, :cond_15

    .line 366
    .line 367
    const-string v2, "\u670b\u53cb\u5708\u5173\u952e\u8bcd\u5c4f\u853d\u65e7\u7248\u65f6\u95f4\u7ebf Hook \u5b89\u88c5\u5931\u8d25: "

    .line 368
    .line 369
    monitor-enter v0

    .line 370
    :try_start_10
    iget-boolean v3, v0, Lha/z;->m:Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 371
    .line 372
    const/4 v4, 0x1

    .line 373
    if-eqz v3, :cond_11

    .line 374
    .line 375
    monitor-exit v0

    .line 376
    :goto_14
    move v2, v4

    .line 377
    goto :goto_18

    .line 378
    :cond_11
    :try_start_11
    invoke-virtual {v0}, Lha/z;->m()Ljava/lang/reflect/Method;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    if-nez v3, :cond_12

    .line 383
    .line 384
    iput-boolean v4, v0, Lha/z;->m:Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 385
    .line 386
    monitor-exit v0

    .line 387
    goto :goto_14

    .line 388
    :catchall_6
    move-exception v1

    .line 389
    goto :goto_19

    .line 390
    :cond_12
    :try_start_12
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 391
    .line 392
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->accessible(Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    if-eqz v6, :cond_13

    .line 397
    .line 398
    goto :goto_15

    .line 399
    :cond_13
    move-object v6, v3

    .line 400
    :goto_15
    new-instance v7, Lha/y;

    .line 401
    .line 402
    const/4 v8, 0x1

    .line 403
    invoke-direct {v7, v0, v8}, Lha/y;-><init>(Lha/z;I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v5, v6, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 407
    .line 408
    .line 409
    iput-boolean v4, v0, Lha/z;->m:Z

    .line 410
    .line 411
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 412
    .line 413
    goto :goto_16

    .line 414
    :catchall_7
    move-exception v5

    .line 415
    :try_start_13
    new-instance v6, Lsf/f;

    .line 416
    .line 417
    invoke-direct {v6, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 418
    .line 419
    .line 420
    move-object v5, v6

    .line 421
    :goto_16
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 422
    .line 423
    .line 424
    move-result-object v6

    .line 425
    if-nez v6, :cond_14

    .line 426
    .line 427
    goto :goto_17

    .line 428
    :cond_14
    iget-object v5, v0, Lha/z;->b:Lab/b;

    .line 429
    .line 430
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    new-instance v7, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    invoke-virtual {v5, v2, v6}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 450
    .line 451
    :goto_17
    check-cast v5, Ljava/lang/Boolean;

    .line 452
    .line 453
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 454
    .line 455
    .line 456
    move-result v2
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 457
    monitor-exit v0

    .line 458
    :goto_18
    if-ne v2, v4, :cond_15

    .line 459
    .line 460
    move v1, v4

    .line 461
    goto :goto_1a

    .line 462
    :goto_19
    :try_start_14
    monitor-exit v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 463
    throw v1

    .line 464
    :cond_15
    :goto_1a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    return-object v0

    .line 469
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
