.class Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mr/elaris/InAppSettingsTargetPickerPage;->showFriendPicker(Lcom/mr/elaris/InAppSettings;Landroid/widget/TextView;Landroid/widget/TextView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$filterArr:[Ljava/lang/Runnable;

.field final synthetic val$friendList:Ljava/util/ArrayList;

.field final synthetic val$linkedHashSet:Ljava/util/LinkedHashSet;

.field final synthetic val$settings:Lcom/mr/elaris/InAppSettings;

.field final synthetic val$showPicker:Ljava/lang/Runnable;

.field final synthetic val$shown:[Z

.field final synthetic val$summary:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/mr/elaris/InAppSettings;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Landroid/widget/TextView;[Ljava/lang/Runnable;[ZLjava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$friendList:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$linkedHashSet:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$summary:Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$filterArr:[Ljava/lang/Runnable;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$shown:[Z

    .line 12
    .line 13
    iput-object p7, p0, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$showPicker:Ljava/lang/Runnable;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public run()V
    .locals 36

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    sget-object v3, Li5;->c:Ljava/util/ArrayList;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v4

    .line 29
    sget-wide v6, Li5;->b:J

    .line 30
    .line 31
    sub-long/2addr v4, v6

    .line 32
    const-wide/32 v6, 0xea60

    .line 33
    .line 34
    .line 35
    cmp-long v4, v4, v6

    .line 36
    .line 37
    if-gez v4, :cond_1

    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_30

    .line 45
    .line 46
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    invoke-virtual {v3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    .line 54
    .line 55
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    goto :goto_1

    .line 57
    :catchall_1
    :cond_2
    const-class v3, Li5;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    :goto_1
    if-eqz v3, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object v3, v0

    .line 67
    :goto_2
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    if-nez v3, :cond_4

    .line 73
    .line 74
    const-string v0, "classLoader null"

    .line 75
    .line 76
    invoke-static {v0}, Li5;->X0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_30

    .line 85
    .line 86
    :cond_4
    invoke-static {v3}, Li5;->l(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const/4 v10, 0x1

    .line 91
    const/4 v11, 0x0

    .line 92
    if-nez v0, :cond_6

    .line 93
    .line 94
    const-string v0, "friend-list kernel skipped reason=runtime null"

    .line 95
    .line 96
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    :goto_3
    move/from16 v18, v11

    .line 100
    .line 101
    goto/16 :goto_27

    .line 102
    .line 103
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v5, "friend-list kernel runtime="

    .line 112
    .line 113
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string v4, "com.tencent.qqnt.kernel.api.IKernelService"

    .line 121
    .line 122
    :try_start_2
    invoke-static {v4, v11, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 126
    goto :goto_4

    .line 127
    :catchall_2
    const/4 v5, 0x0

    .line 128
    :goto_4
    const-class v12, Ljava/lang/String;

    .line 129
    .line 130
    const/4 v13, 0x2

    .line 131
    const-string v14, ""

    .line 132
    .line 133
    if-eqz v5, :cond_c

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    const-string v8, "getRuntimeService"

    .line 140
    .line 141
    const-class v9, Ljava/lang/Class;

    .line 142
    .line 143
    filled-new-array {v9, v12}, [Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    :goto_5
    if-eqz v7, :cond_7

    .line 148
    .line 149
    const-class v2, Ljava/lang/Object;

    .line 150
    .line 151
    if-eq v7, v2, :cond_7

    .line 152
    .line 153
    :try_start_3
    invoke-virtual {v7, v8, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 158
    .line 159
    .line 160
    goto :goto_6

    .line 161
    :catchall_3
    invoke-virtual {v7}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    goto :goto_5

    .line 166
    :cond_7
    const/4 v2, 0x0

    .line 167
    :goto_6
    if-eqz v2, :cond_8

    .line 168
    .line 169
    :try_start_4
    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 170
    .line 171
    .line 172
    filled-new-array {v5, v14}, [Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v2, v0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 180
    if-eqz v2, :cond_8

    .line 181
    .line 182
    goto :goto_8

    .line 183
    :catchall_4
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-static {v2}, Li5;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    :catchall_5
    :cond_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 196
    .line 197
    .line 198
    move-result v7

    .line 199
    if-eqz v7, :cond_b

    .line 200
    .line 201
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    check-cast v7, Ljava/lang/reflect/Method;

    .line 206
    .line 207
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    :try_start_5
    array-length v15, v8

    .line 212
    if-ne v15, v13, :cond_a

    .line 213
    .line 214
    aget-object v15, v8, v11

    .line 215
    .line 216
    if-ne v15, v9, :cond_a

    .line 217
    .line 218
    aget-object v15, v8, v10

    .line 219
    .line 220
    if-ne v15, v12, :cond_a

    .line 221
    .line 222
    invoke-virtual {v7, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 223
    .line 224
    .line 225
    filled-new-array {v5, v14}, [Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-virtual {v7, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    if-eqz v7, :cond_9

    .line 234
    .line 235
    :goto_7
    move-object v2, v7

    .line 236
    goto :goto_8

    .line 237
    :cond_a
    array-length v15, v8

    .line 238
    if-ne v15, v10, :cond_9

    .line 239
    .line 240
    aget-object v8, v8, v11

    .line 241
    .line 242
    if-ne v8, v9, :cond_9

    .line 243
    .line 244
    invoke-virtual {v7, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 245
    .line 246
    .line 247
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    invoke-virtual {v7, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 255
    if-eqz v7, :cond_9

    .line 256
    .line 257
    goto :goto_7

    .line 258
    :cond_b
    const/4 v2, 0x0

    .line 259
    :goto_8
    if-eqz v2, :cond_c

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_c
    invoke-static {v3, v4}, Li5;->t1(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    if-eqz v2, :cond_d

    .line 267
    .line 268
    goto :goto_9

    .line 269
    :cond_d
    invoke-static {v0}, Li5;->g2(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    const-string v4, "getKernelService"

    .line 274
    .line 275
    invoke-static {v2, v4}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    if-nez v2, :cond_e

    .line 280
    .line 281
    invoke-static {v0, v4}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    :cond_e
    :goto_9
    if-nez v2, :cond_f

    .line 286
    .line 287
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    const-string v5, "friend-list kernel skipped reason=kernel service null runtime="

    .line 296
    .line 297
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v4

    .line 301
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    goto :goto_a

    .line 305
    :cond_f
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    move-result-object v4

    .line 309
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    const-string v5, "friend-list kernel service="

    .line 314
    .line 315
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-static {v4}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :goto_a
    const-string v4, "getBuddyService"

    .line 323
    .line 324
    invoke-static {v2, v4}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    if-eqz v5, :cond_10

    .line 329
    .line 330
    goto :goto_b

    .line 331
    :cond_10
    const-string v5, "getBuddyListService"

    .line 332
    .line 333
    invoke-static {v2, v5}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    if-eqz v5, :cond_11

    .line 338
    .line 339
    goto :goto_b

    .line 340
    :cond_11
    const-string v5, "getRelationService"

    .line 341
    .line 342
    invoke-static {v2, v5}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    :goto_b
    if-nez v5, :cond_12

    .line 347
    .line 348
    invoke-static {v0}, Li5;->g2(Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    invoke-static {v5, v4}, Li5;->v(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    :cond_12
    move-object v15, v5

    .line 357
    if-nez v15, :cond_14

    .line 358
    .line 359
    if-nez v2, :cond_13

    .line 360
    .line 361
    goto :goto_c

    .line 362
    :cond_13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    const-string v2, ", kernel="

    .line 371
    .line 372
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v14

    .line 376
    :goto_c
    const-string v0, "friend-list kernel skipped reason=buddy service null"

    .line 377
    .line 378
    invoke-virtual {v0, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    goto/16 :goto_3

    .line 386
    .line 387
    :cond_14
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    const-string v4, "friend-list kernel buddy="

    .line 396
    .line 397
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    const-string v2, "getCurrentAccountUid"

    .line 405
    .line 406
    invoke-static {v0, v2}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    const-string v4, "getCurrentAccountUin"

    .line 411
    .line 412
    invoke-static {v0, v4}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    const-string v5, "getAccount"

    .line 417
    .line 418
    invoke-static {v0, v5}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v5

    .line 422
    const-string v7, "getAccountUin"

    .line 423
    .line 424
    invoke-static {v0, v7}, Li5;->w(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    const-string v21, "uin"

    .line 429
    .line 430
    const-string v22, "longAccountUin"

    .line 431
    .line 432
    const-string v16, "currentUid"

    .line 433
    .line 434
    const-string v17, "currentUin"

    .line 435
    .line 436
    const-string v18, "mCurrentUid"

    .line 437
    .line 438
    const-string v19, "mCurrentUin"

    .line 439
    .line 440
    const-string v20, "account"

    .line 441
    .line 442
    filled-new-array/range {v16 .. v22}, [Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    invoke-static {v0, v8}, Li5;->c2(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    filled-new-array {v2, v4, v5, v7, v0}, [Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-static {v0}, Li5;->s0([Ljava/lang/String;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-static {v0}, Li5;->B(Ljava/lang/Object;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    if-nez v2, :cond_15

    .line 467
    .line 468
    new-array v0, v10, [Ljava/lang/String;

    .line 469
    .line 470
    aput-object v14, v0, v11

    .line 471
    .line 472
    move-object v2, v0

    .line 473
    goto :goto_d

    .line 474
    :cond_15
    new-array v2, v13, [Ljava/lang/String;

    .line 475
    .line 476
    aput-object v0, v2, v11

    .line 477
    .line 478
    aput-object v14, v2, v10

    .line 479
    .line 480
    :goto_d
    const-string v23, "BUDDY"

    .line 481
    .line 482
    const-string v24, ""

    .line 483
    .line 484
    const-string v16, "KNOMAL"

    .line 485
    .line 486
    const-string v17, "NOMAL"

    .line 487
    .line 488
    const-string v18, "NORMAL"

    .line 489
    .line 490
    const-string v19, "KLETTER"

    .line 491
    .line 492
    const-string v20, "LETTER"

    .line 493
    .line 494
    const-string v21, "ALL"

    .line 495
    .line 496
    const-string v22, "FRIEND"

    .line 497
    .line 498
    filled-new-array/range {v16 .. v24}, [Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v16

    .line 502
    array-length v4, v2

    .line 503
    move v5, v11

    .line 504
    :goto_e
    if-ge v5, v4, :cond_5

    .line 505
    .line 506
    aget-object v7, v2, v5

    .line 507
    .line 508
    move v8, v11

    .line 509
    :goto_f
    const/16 v0, 0x9

    .line 510
    .line 511
    if-ge v8, v0, :cond_3b

    .line 512
    .line 513
    aget-object v17, v16, v8

    .line 514
    .line 515
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-static {v0}, Li5;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    :goto_10
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    if-eqz v0, :cond_29

    .line 532
    .line 533
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    move/from16 v18, v11

    .line 538
    .line 539
    move-object v11, v0

    .line 540
    check-cast v11, Ljava/lang/reflect/Method;

    .line 541
    .line 542
    const-string v0, "getBuddyListFromCache"

    .line 543
    .line 544
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v10

    .line 548
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-nez v0, :cond_17

    .line 553
    .line 554
    :cond_16
    :goto_11
    move/from16 v11, v18

    .line 555
    .line 556
    const/4 v10, 0x1

    .line 557
    goto :goto_10

    .line 558
    :cond_17
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    array-length v10, v0

    .line 563
    if-ne v10, v13, :cond_16

    .line 564
    .line 565
    aget-object v10, v0, v18

    .line 566
    .line 567
    if-eq v10, v12, :cond_18

    .line 568
    .line 569
    goto :goto_11

    .line 570
    :cond_18
    const/4 v10, 0x1

    .line 571
    :try_start_6
    invoke-virtual {v11, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 572
    .line 573
    .line 574
    move/from16 v19, v10

    .line 575
    .line 576
    aget-object v10, v0, v19

    .line 577
    .line 578
    if-nez v10, :cond_1b

    .line 579
    .line 580
    :cond_19
    :goto_12
    move-object/from16 v21, v0

    .line 581
    .line 582
    move-object/from16 v22, v2

    .line 583
    .line 584
    :cond_1a
    const/16 v23, 0x0

    .line 585
    .line 586
    goto :goto_16

    .line 587
    :cond_1b
    if-ne v10, v12, :cond_1d

    .line 588
    .line 589
    move-object/from16 v21, v0

    .line 590
    .line 591
    move-object/from16 v22, v2

    .line 592
    .line 593
    if-nez v17, :cond_1c

    .line 594
    .line 595
    move-object/from16 v23, v14

    .line 596
    .line 597
    goto :goto_16

    .line 598
    :cond_1c
    move-object/from16 v23, v17

    .line 599
    .line 600
    goto :goto_16

    .line 601
    :cond_1d
    invoke-virtual {v10}, Ljava/lang/Class;->isEnum()Z

    .line 602
    .line 603
    .line 604
    move-result v20

    .line 605
    if-nez v20, :cond_1e

    .line 606
    .line 607
    goto :goto_12

    .line 608
    :cond_1e
    invoke-virtual {v10}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v10

    .line 612
    if-eqz v10, :cond_19

    .line 613
    .line 614
    array-length v13, v10

    .line 615
    if-nez v13, :cond_1f

    .line 616
    .line 617
    goto :goto_12

    .line 618
    :cond_1f
    if-nez v17, :cond_20

    .line 619
    .line 620
    move-object v13, v14

    .line 621
    :goto_13
    move-object/from16 v21, v0

    .line 622
    .line 623
    goto :goto_14

    .line 624
    :cond_20
    move-object/from16 v13, v17

    .line 625
    .line 626
    goto :goto_13

    .line 627
    :goto_14
    array-length v0, v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 628
    move-object/from16 v22, v2

    .line 629
    .line 630
    move/from16 v2, v18

    .line 631
    .line 632
    :goto_15
    if-ge v2, v0, :cond_23

    .line 633
    .line 634
    :try_start_7
    aget-object v23, v10, v2

    .line 635
    .line 636
    if-eqz v23, :cond_21

    .line 637
    .line 638
    move/from16 v24, v0

    .line 639
    .line 640
    invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    invoke-virtual {v13, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    if-eqz v0, :cond_22

    .line 649
    .line 650
    goto :goto_16

    .line 651
    :cond_21
    move/from16 v24, v0

    .line 652
    .line 653
    :cond_22
    add-int/lit8 v2, v2, 0x1

    .line 654
    .line 655
    move/from16 v0, v24

    .line 656
    .line 657
    goto :goto_15

    .line 658
    :cond_23
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-nez v0, :cond_1a

    .line 663
    .line 664
    aget-object v23, v10, v18

    .line 665
    .line 666
    :goto_16
    if-nez v23, :cond_24

    .line 667
    .line 668
    const/16 v19, 0x1

    .line 669
    .line 670
    aget-object v0, v21, v19

    .line 671
    .line 672
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    if-nez v0, :cond_24

    .line 677
    .line 678
    aget-object v0, v21, v19

    .line 679
    .line 680
    invoke-static {v0}, Li5;->T(Ljava/lang/Class;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v23

    .line 684
    :cond_24
    move-object/from16 v0, v23

    .line 685
    .line 686
    goto :goto_17

    .line 687
    :catchall_6
    move-exception v0

    .line 688
    goto :goto_19

    .line 689
    :goto_17
    if-nez v7, :cond_25

    .line 690
    .line 691
    move-object v2, v14

    .line 692
    goto :goto_18

    .line 693
    :cond_25
    move-object v2, v7

    .line 694
    :goto_18
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-virtual {v11, v15, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 702
    goto/16 :goto_1c

    .line 703
    .line 704
    :catchall_7
    move-exception v0

    .line 705
    move-object/from16 v22, v2

    .line 706
    .line 707
    :goto_19
    new-instance v2, Ljava/lang/StringBuilder;

    .line 708
    .line 709
    const-string v10, "friend-list buddy cache invoke failed method="

    .line 710
    .line 711
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    new-instance v10, Ljava/lang/StringBuilder;

    .line 715
    .line 716
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    move-result-object v13

    .line 723
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v13

    .line 727
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    const/16 v13, 0x23

    .line 731
    .line 732
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 733
    .line 734
    .line 735
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v13

    .line 739
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    const/16 v13, 0x28

    .line 743
    .line 744
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    move-result-object v11

    .line 751
    move-object/from16 v21, v0

    .line 752
    .line 753
    move/from16 v13, v18

    .line 754
    .line 755
    :goto_1a
    array-length v0, v11

    .line 756
    if-ge v13, v0, :cond_28

    .line 757
    .line 758
    if-lez v13, :cond_26

    .line 759
    .line 760
    const/16 v0, 0x2c

    .line 761
    .line 762
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 763
    .line 764
    .line 765
    :cond_26
    aget-object v0, v11, v13

    .line 766
    .line 767
    if-nez v0, :cond_27

    .line 768
    .line 769
    const-string v0, "?"

    .line 770
    .line 771
    goto :goto_1b

    .line 772
    :cond_27
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v0

    .line 776
    :goto_1b
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    add-int/lit8 v13, v13, 0x1

    .line 780
    .line 781
    goto :goto_1a

    .line 782
    :cond_28
    const/16 v0, 0x29

    .line 783
    .line 784
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    .line 793
    .line 794
    const-string v0, ", error="

    .line 795
    .line 796
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 797
    .line 798
    .line 799
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 808
    .line 809
    .line 810
    const-string v0, ": "

    .line 811
    .line 812
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 827
    .line 828
    .line 829
    move/from16 v11, v18

    .line 830
    .line 831
    move-object/from16 v2, v22

    .line 832
    .line 833
    const/4 v10, 0x1

    .line 834
    const/4 v13, 0x2

    .line 835
    goto/16 :goto_10

    .line 836
    .line 837
    :cond_29
    move-object/from16 v22, v2

    .line 838
    .line 839
    move/from16 v18, v11

    .line 840
    .line 841
    const/4 v0, 0x0

    .line 842
    :goto_1c
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    move v11, v5

    .line 847
    new-instance v5, Ljava/util/ArrayList;

    .line 848
    .line 849
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 850
    .line 851
    .line 852
    new-instance v9, Ljava/util/IdentityHashMap;

    .line 853
    .line 854
    invoke-direct {v9}, Ljava/util/IdentityHashMap;-><init>()V

    .line 855
    .line 856
    .line 857
    invoke-static {v9}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 858
    .line 859
    .line 860
    move-result-object v9

    .line 861
    move v10, v8

    .line 862
    const/4 v8, 0x0

    .line 863
    move v13, v10

    .line 864
    move v10, v4

    .line 865
    move-object v4, v0

    .line 866
    invoke-static/range {v4 .. v9}, Li5;->J(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/LinkedHashMap;Ljava/lang/String;ILjava/util/Set;)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 870
    .line 871
    .line 872
    move-result v0

    .line 873
    if-nez v0, :cond_2c

    .line 874
    .line 875
    const-string v0, "getBuddyRemark"

    .line 876
    .line 877
    invoke-static {v15, v0, v5}, Li5;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    const-string v8, "getBuddyNick"

    .line 882
    .line 883
    invoke-static {v15, v8, v5}, Li5;->q(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/LinkedHashMap;

    .line 884
    .line 885
    .line 886
    move-result-object v8

    .line 887
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 888
    .line 889
    .line 890
    move-result-object v5

    .line 891
    :goto_1d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 892
    .line 893
    .line 894
    move-result v9

    .line 895
    if-eqz v9, :cond_2c

    .line 896
    .line 897
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v9

    .line 901
    check-cast v9, Ljava/lang/String;

    .line 902
    .line 903
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v21

    .line 907
    move/from16 v23, v2

    .line 908
    .line 909
    move-object/from16 v2, v21

    .line 910
    .line 911
    check-cast v2, Lh5;

    .line 912
    .line 913
    invoke-virtual {v0, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v21

    .line 917
    move-object/from16 v24, v0

    .line 918
    .line 919
    move-object/from16 v0, v21

    .line 920
    .line 921
    check-cast v0, Ljava/lang/String;

    .line 922
    .line 923
    invoke-virtual {v8, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v21

    .line 927
    move-object/from16 v25, v5

    .line 928
    .line 929
    move-object/from16 v5, v21

    .line 930
    .line 931
    check-cast v5, Ljava/lang/String;

    .line 932
    .line 933
    move-object/from16 v21, v7

    .line 934
    .line 935
    if-nez v2, :cond_2a

    .line 936
    .line 937
    move-object v7, v14

    .line 938
    goto :goto_1e

    .line 939
    :cond_2a
    iget-object v7, v2, Lh5;->b:Ljava/lang/String;

    .line 940
    .line 941
    :goto_1e
    filled-new-array {v0, v5, v7}, [Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    invoke-static {v0}, Li5;->s0([Ljava/lang/String;)Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    if-nez v2, :cond_2b

    .line 950
    .line 951
    move-object v2, v14

    .line 952
    goto :goto_1f

    .line 953
    :cond_2b
    iget-object v2, v2, Lh5;->c:Ljava/lang/String;

    .line 954
    .line 955
    :goto_1f
    invoke-static {v6, v9, v0, v2}, Li5;->s1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    move-object/from16 v7, v21

    .line 959
    .line 960
    move/from16 v2, v23

    .line 961
    .line 962
    move-object/from16 v0, v24

    .line 963
    .line 964
    move-object/from16 v5, v25

    .line 965
    .line 966
    goto :goto_1d

    .line 967
    :cond_2c
    move/from16 v23, v2

    .line 968
    .line 969
    move-object/from16 v21, v7

    .line 970
    .line 971
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 972
    .line 973
    .line 974
    move-result v0

    .line 975
    sub-int v0, v0, v23

    .line 976
    .line 977
    const-string v7, "default"

    .line 978
    .line 979
    const-string v2, ", reqType="

    .line 980
    .line 981
    if-lez v0, :cond_31

    .line 982
    .line 983
    new-instance v0, Ljava/lang/StringBuilder;

    .line 984
    .line 985
    const-string v4, "friend-list kernel cache hit account="

    .line 986
    .line 987
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    if-eqz v21, :cond_2e

    .line 991
    .line 992
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 993
    .line 994
    .line 995
    move-result v4

    .line 996
    if-nez v4, :cond_2d

    .line 997
    .line 998
    goto :goto_20

    .line 999
    :cond_2d
    move-object/from16 v4, v21

    .line 1000
    .line 1001
    goto :goto_21

    .line 1002
    :cond_2e
    :goto_20
    move-object v4, v7

    .line 1003
    :goto_21
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1007
    .line 1008
    .line 1009
    if-eqz v17, :cond_30

    .line 1010
    .line 1011
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 1012
    .line 1013
    .line 1014
    move-result v2

    .line 1015
    if-nez v2, :cond_2f

    .line 1016
    .line 1017
    goto :goto_22

    .line 1018
    :cond_2f
    move-object/from16 v7, v17

    .line 1019
    .line 1020
    :cond_30
    :goto_22
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1021
    .line 1022
    .line 1023
    const-string v2, ", count="

    .line 1024
    .line 1025
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1026
    .line 1027
    .line 1028
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 1029
    .line 1030
    .line 1031
    move-result v2

    .line 1032
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    const-string v0, "kernel-buddy-cache"

    .line 1043
    .line 1044
    invoke-static {v3, v0, v6}, Li5;->r0(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;)Ljava/util/ArrayList;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    goto/16 :goto_30

    .line 1049
    .line 1050
    :cond_31
    if-nez v4, :cond_32

    .line 1051
    .line 1052
    move/from16 v0, v18

    .line 1053
    .line 1054
    goto :goto_23

    .line 1055
    :cond_32
    instance-of v0, v4, Ljava/util/Collection;

    .line 1056
    .line 1057
    if-eqz v0, :cond_33

    .line 1058
    .line 1059
    move-object v0, v4

    .line 1060
    check-cast v0, Ljava/util/Collection;

    .line 1061
    .line 1062
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 1063
    .line 1064
    .line 1065
    move-result v0

    .line 1066
    goto :goto_23

    .line 1067
    :cond_33
    instance-of v0, v4, Ljava/util/Map;

    .line 1068
    .line 1069
    if-eqz v0, :cond_34

    .line 1070
    .line 1071
    move-object v0, v4

    .line 1072
    check-cast v0, Ljava/util/Map;

    .line 1073
    .line 1074
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 1075
    .line 1076
    .line 1077
    move-result v0

    .line 1078
    goto :goto_23

    .line 1079
    :cond_34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    if-eqz v0, :cond_35

    .line 1088
    .line 1089
    invoke-static {v4}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 1090
    .line 1091
    .line 1092
    move-result v0

    .line 1093
    goto :goto_23

    .line 1094
    :cond_35
    const/4 v0, 0x1

    .line 1095
    :goto_23
    if-lez v0, :cond_3a

    .line 1096
    .line 1097
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1098
    .line 1099
    const-string v5, "friend-list kernel cache ignored account="

    .line 1100
    .line 1101
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1102
    .line 1103
    .line 1104
    if-eqz v21, :cond_37

    .line 1105
    .line 1106
    invoke-virtual/range {v21 .. v21}, Ljava/lang/String;->length()I

    .line 1107
    .line 1108
    .line 1109
    move-result v5

    .line 1110
    if-nez v5, :cond_36

    .line 1111
    .line 1112
    goto :goto_24

    .line 1113
    :cond_36
    move-object/from16 v5, v21

    .line 1114
    .line 1115
    goto :goto_25

    .line 1116
    :cond_37
    :goto_24
    move-object v5, v7

    .line 1117
    :goto_25
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1121
    .line 1122
    .line 1123
    if-eqz v17, :cond_39

    .line 1124
    .line 1125
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    .line 1126
    .line 1127
    .line 1128
    move-result v2

    .line 1129
    if-nez v2, :cond_38

    .line 1130
    .line 1131
    goto :goto_26

    .line 1132
    :cond_38
    move-object/from16 v7, v17

    .line 1133
    .line 1134
    :cond_39
    :goto_26
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1135
    .line 1136
    .line 1137
    const-string v2, ", rawSize="

    .line 1138
    .line 1139
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    :cond_3a
    add-int/lit8 v8, v13, 0x1

    .line 1153
    .line 1154
    move v4, v10

    .line 1155
    move v5, v11

    .line 1156
    move/from16 v11, v18

    .line 1157
    .line 1158
    move-object/from16 v7, v21

    .line 1159
    .line 1160
    move-object/from16 v2, v22

    .line 1161
    .line 1162
    const/4 v10, 0x1

    .line 1163
    const/4 v13, 0x2

    .line 1164
    goto/16 :goto_f

    .line 1165
    .line 1166
    :cond_3b
    move-object/from16 v22, v2

    .line 1167
    .line 1168
    move v10, v4

    .line 1169
    move/from16 v18, v11

    .line 1170
    .line 1171
    move v11, v5

    .line 1172
    add-int/lit8 v5, v11, 0x1

    .line 1173
    .line 1174
    move/from16 v11, v18

    .line 1175
    .line 1176
    const/4 v10, 0x1

    .line 1177
    const/4 v13, 0x2

    .line 1178
    goto/16 :goto_e

    .line 1179
    .line 1180
    :goto_27
    const-string v34, "com.tencent.mobileqq.friend.api.IFriendHandlerService"

    .line 1181
    .line 1182
    const-string v35, "com.tencent.mobileqq.friend.api.IFriendService"

    .line 1183
    .line 1184
    const-string v23, "com.tencent.qqnt.ntrelation.friendsinfo.api.IQQFriendsInfoApi"

    .line 1185
    .line 1186
    const-string v24, "com.tencent.qqnt.ntrelation.friendsinfo.api.IFriendsInfoService"

    .line 1187
    .line 1188
    const-string v25, "com.tencent.qqnt.relation.api.IFriendListApi"

    .line 1189
    .line 1190
    const-string v26, "com.tencent.qqnt.relation.api.IFriendListRepoApi"

    .line 1191
    .line 1192
    const-string v27, "com.tencent.qqnt.relation.api.IFriendListService"

    .line 1193
    .line 1194
    const-string v28, "com.tencent.qqnt.relation.api.IRelationApi"

    .line 1195
    .line 1196
    const-string v29, "com.tencent.mobileqq.relation.api.IFriendListApi"

    .line 1197
    .line 1198
    const-string v30, "com.tencent.mobileqq.relation.api.IFriendListRepoApi"

    .line 1199
    .line 1200
    const-string v31, "com.tencent.mobileqq.relation.api.IRelationApi"

    .line 1201
    .line 1202
    const-string v32, "com.tencent.mobileqq.friend.api.IFriendListApi"

    .line 1203
    .line 1204
    const-string v33, "com.tencent.mobileqq.friend.api.IFriendDataService"

    .line 1205
    .line 1206
    filled-new-array/range {v23 .. v35}, [Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v0

    .line 1210
    move/from16 v2, v18

    .line 1211
    .line 1212
    :goto_28
    const/16 v4, 0xd

    .line 1213
    .line 1214
    if-ge v2, v4, :cond_3e

    .line 1215
    .line 1216
    aget-object v4, v0, v2

    .line 1217
    .line 1218
    invoke-static {v3, v4}, Li5;->t1(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v4

    .line 1222
    if-nez v4, :cond_3c

    .line 1223
    .line 1224
    goto :goto_29

    .line 1225
    :cond_3c
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 1226
    .line 1227
    .line 1228
    move-result v5

    .line 1229
    const/4 v10, 0x1

    .line 1230
    invoke-static {v4, v6, v10}, Li5;->I(Ljava/lang/Object;Ljava/util/LinkedHashMap;Z)V

    .line 1231
    .line 1232
    .line 1233
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 1234
    .line 1235
    .line 1236
    move-result v4

    .line 1237
    if-le v4, v5, :cond_3d

    .line 1238
    .line 1239
    const-string v0, "nt-friend-api"

    .line 1240
    .line 1241
    invoke-static {v3, v0, v6}, Li5;->r0(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;)Ljava/util/ArrayList;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    goto/16 :goto_30

    .line 1246
    .line 1247
    :cond_3d
    :goto_29
    add-int/lit8 v2, v2, 0x1

    .line 1248
    .line 1249
    goto :goto_28

    .line 1250
    :cond_3e
    invoke-static {v3}, Li5;->l(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v0

    .line 1254
    if-nez v0, :cond_3f

    .line 1255
    .line 1256
    goto/16 :goto_2e

    .line 1257
    .line 1258
    :cond_3f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v2

    .line 1262
    invoke-static {v2}, Li5;->k(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v2

    .line 1266
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v2

    .line 1270
    :cond_40
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1271
    .line 1272
    .line 1273
    move-result v4

    .line 1274
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1275
    .line 1276
    if-eqz v4, :cond_41

    .line 1277
    .line 1278
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v4

    .line 1282
    check-cast v4, Ljava/lang/reflect/Method;

    .line 1283
    .line 1284
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v7

    .line 1288
    const-string v8, "getManager"

    .line 1289
    .line 1290
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v9

    .line 1294
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v8

    .line 1298
    if-eqz v8, :cond_40

    .line 1299
    .line 1300
    array-length v8, v7

    .line 1301
    const/4 v10, 0x1

    .line 1302
    if-ne v8, v10, :cond_40

    .line 1303
    .line 1304
    aget-object v7, v7, v18

    .line 1305
    .line 1306
    if-ne v7, v5, :cond_40

    .line 1307
    .line 1308
    :try_start_8
    invoke-virtual {v4, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1309
    .line 1310
    .line 1311
    goto :goto_2a

    .line 1312
    :cond_41
    const/4 v4, 0x0

    .line 1313
    :catchall_8
    :goto_2a
    if-nez v4, :cond_42

    .line 1314
    .line 1315
    goto/16 :goto_2e

    .line 1316
    .line 1317
    :cond_42
    new-instance v2, Ljava/util/ArrayList;

    .line 1318
    .line 1319
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1320
    .line 1321
    .line 1322
    :try_start_9
    const-string v7, "com.tencent.mobileqq.app.QQManagerFactory"

    .line 1323
    .line 1324
    move/from16 v8, v18

    .line 1325
    .line 1326
    invoke-static {v7, v8, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v7

    .line 1330
    invoke-static {v7}, Li5;->j(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v7

    .line 1334
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v7

    .line 1338
    :cond_43
    :goto_2b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1339
    .line 1340
    .line 1341
    move-result v8

    .line 1342
    if-eqz v8, :cond_46

    .line 1343
    .line 1344
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v8

    .line 1348
    check-cast v8, Ljava/lang/reflect/Field;

    .line 1349
    .line 1350
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v9

    .line 1354
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1355
    .line 1356
    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v9

    .line 1360
    const-string v10, "friend"

    .line 1361
    .line 1362
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1363
    .line 1364
    .line 1365
    move-result v10

    .line 1366
    if-nez v10, :cond_44

    .line 1367
    .line 1368
    const-string v10, "contact"

    .line 1369
    .line 1370
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1371
    .line 1372
    .line 1373
    move-result v10

    .line 1374
    if-nez v10, :cond_44

    .line 1375
    .line 1376
    const-string v10, "relation"

    .line 1377
    .line 1378
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1379
    .line 1380
    .line 1381
    move-result v10

    .line 1382
    if-nez v10, :cond_44

    .line 1383
    .line 1384
    const-string v10, "buddy"

    .line 1385
    .line 1386
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1387
    .line 1388
    .line 1389
    move-result v9

    .line 1390
    if-nez v9, :cond_44

    .line 1391
    .line 1392
    goto :goto_2b

    .line 1393
    :cond_44
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v9

    .line 1397
    if-eq v9, v5, :cond_45

    .line 1398
    .line 1399
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v9

    .line 1403
    const-class v10, Ljava/lang/Integer;

    .line 1404
    .line 1405
    if-eq v9, v10, :cond_45

    .line 1406
    .line 1407
    goto :goto_2b

    .line 1408
    :cond_45
    const/4 v10, 0x1

    .line 1409
    invoke-virtual {v8, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1410
    .line 1411
    .line 1412
    const/4 v9, 0x0

    .line 1413
    invoke-virtual {v8, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v8

    .line 1417
    instance-of v10, v8, Ljava/lang/Number;

    .line 1418
    .line 1419
    if-eqz v10, :cond_43

    .line 1420
    .line 1421
    move-object v10, v8

    .line 1422
    check-cast v10, Ljava/lang/Number;

    .line 1423
    .line 1424
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1425
    .line 1426
    .line 1427
    move-result v10

    .line 1428
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v10

    .line 1432
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    move-result v10

    .line 1436
    if-nez v10, :cond_43

    .line 1437
    .line 1438
    check-cast v8, Ljava/lang/Number;

    .line 1439
    .line 1440
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1441
    .line 1442
    .line 1443
    move-result v8

    .line 1444
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v8

    .line 1448
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1449
    .line 1450
    .line 1451
    goto :goto_2b

    .line 1452
    :catchall_9
    :cond_46
    const/16 v5, 0xb

    .line 1453
    .line 1454
    new-array v7, v5, [I

    .line 1455
    .line 1456
    fill-array-data v7, :array_0

    .line 1457
    .line 1458
    .line 1459
    const/4 v8, 0x0

    .line 1460
    :goto_2c
    if-ge v8, v5, :cond_48

    .line 1461
    .line 1462
    aget v9, v7, v8

    .line 1463
    .line 1464
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v10

    .line 1468
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1469
    .line 1470
    .line 1471
    move-result v10

    .line 1472
    if-nez v10, :cond_47

    .line 1473
    .line 1474
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v9

    .line 1478
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1479
    .line 1480
    .line 1481
    :cond_47
    add-int/lit8 v8, v8, 0x1

    .line 1482
    .line 1483
    goto :goto_2c

    .line 1484
    :cond_48
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v2

    .line 1488
    :catchall_a
    :cond_49
    :goto_2d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1489
    .line 1490
    .line 1491
    move-result v5

    .line 1492
    if-eqz v5, :cond_4b

    .line 1493
    .line 1494
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v5

    .line 1498
    check-cast v5, Ljava/lang/Integer;

    .line 1499
    .line 1500
    :try_start_a
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1501
    .line 1502
    .line 1503
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v5

    .line 1507
    invoke-virtual {v4, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v5

    .line 1511
    if-nez v5, :cond_4a

    .line 1512
    .line 1513
    goto :goto_2d

    .line 1514
    :cond_4a
    new-instance v7, Ljava/util/LinkedHashMap;

    .line 1515
    .line 1516
    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_b

    .line 1517
    .line 1518
    .line 1519
    const/4 v10, 0x1

    .line 1520
    :try_start_b
    invoke-static {v5, v7, v10}, Li5;->I(Ljava/lang/Object;Ljava/util/LinkedHashMap;Z)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v7}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 1524
    .line 1525
    .line 1526
    move-result v5

    .line 1527
    if-nez v5, :cond_49

    .line 1528
    .line 1529
    invoke-interface {v6, v7}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 1530
    .line 1531
    .line 1532
    const-string v0, "old-friend-manager"

    .line 1533
    .line 1534
    invoke-static {v3, v0, v6}, Li5;->r0(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;)Ljava/util/ArrayList;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v0

    .line 1538
    goto :goto_30

    .line 1539
    :catchall_b
    const/4 v10, 0x1

    .line 1540
    goto :goto_2d

    .line 1541
    :cond_4b
    :goto_2e
    invoke-static {v3}, Li5;->l(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v0

    .line 1545
    if-nez v0, :cond_4c

    .line 1546
    .line 1547
    goto :goto_2f

    .line 1548
    :cond_4c
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 1549
    .line 1550
    .line 1551
    move-result v2

    .line 1552
    const/4 v8, 0x0

    .line 1553
    invoke-static {v0, v6, v8}, Li5;->I(Ljava/lang/Object;Ljava/util/LinkedHashMap;Z)V

    .line 1554
    .line 1555
    .line 1556
    invoke-interface {v6}, Ljava/util/Map;->size()I

    .line 1557
    .line 1558
    .line 1559
    move-result v0

    .line 1560
    if-le v0, v2, :cond_4d

    .line 1561
    .line 1562
    const-string v0, "recent-c2c"

    .line 1563
    .line 1564
    invoke-static {v3, v0, v6}, Li5;->r0(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/util/LinkedHashMap;)Ljava/util/ArrayList;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v0

    .line 1568
    goto :goto_30

    .line 1569
    :cond_4d
    :goto_2f
    const-string v0, "all sources empty"

    .line 1570
    .line 1571
    invoke-static {v0}, Li5;->X0(Ljava/lang/String;)V

    .line 1572
    .line 1573
    .line 1574
    new-instance v0, Ljava/util/ArrayList;

    .line 1575
    .line 1576
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1577
    .line 1578
    .line 1579
    :goto_30
    new-instance v2, Ljava/util/ArrayList;

    .line 1580
    .line 1581
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1582
    .line 1583
    .line 1584
    iget-object v0, v1, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;->val$settings:Lcom/mr/elaris/InAppSettings;

    .line 1585
    .line 1586
    iget-object v0, v0, Lcom/mr/elaris/InAppSettings;->activity:Landroid/app/Activity;

    .line 1587
    .line 1588
    new-instance v3, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;

    .line 1589
    .line 1590
    invoke-direct {v3, v1, v2}, Lcom/mr/elaris/InAppSettingsTargetPickerPage$11$1;-><init>(Lcom/mr/elaris/InAppSettingsTargetPickerPage$11;Ljava/util/ArrayList;)V

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1594
    .line 1595
    .line 1596
    return-void

    :array_0
    .array-data 4
        0x32
        0x33
        0x34
        0x2e
        0x2f
        0x30
        0x1
        0x3
        0xa
        0x1e
        0x22
    .end array-data
.end method
