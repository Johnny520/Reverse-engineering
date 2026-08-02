.class public final Lnuke/startup/MainHook;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lde/robv/android/xposed/IXposedHookLoadPackage;
.implements Lde/robv/android/xposed/IXposedHookZygoteInit;


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final mTAG:Ljava/lang/String;

.field private startupParam:Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "MainHook"

    .line 5
    .line 6
    iput-object v0, p0, Lnuke/startup/MainHook;->mTAG:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lnuke/startup/MainHook;->requireRunningInTargetHost(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lnuke/startup/MainHook;->mTAG:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 22
    .line 23
    const-string v3, "] Enter handleLoadPackage: "

    .line 24
    .line 25
    const-string v4, "/"

    .line 26
    .line 27
    const-string v5, "["

    .line 28
    .line 29
    invoke-static {v5, v0, v3, v1, v4}, Lvi0;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, Lpp1;->a:Lpp1;

    .line 44
    .line 45
    iget-object v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object p1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    .line 56
    .line 57
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lnuke/startup/MainHook;->startupParam:Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    if-eqz p0, :cond_9

    .line 66
    .line 67
    iget-object p0, p0, Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;->modulePath:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const-wide v2, 0x1a347cafd16L

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v6

    .line 81
    cmp-long v2, v2, v6

    .line 82
    .line 83
    if-gez v2, :cond_1

    .line 84
    .line 85
    goto/16 :goto_3

    .line 86
    .line 87
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    const v3, -0x3a01688a

    .line 92
    .line 93
    .line 94
    if-eq v2, v3, :cond_3

    .line 95
    .line 96
    const v3, 0x12aad22a

    .line 97
    .line 98
    .line 99
    if-eq v2, v3, :cond_2

    .line 100
    .line 101
    const v3, 0x15924f98

    .line 102
    .line 103
    .line 104
    if-ne v2, v3, :cond_8

    .line 105
    .line 106
    const-string v2, "com.tencent.mobileqq"

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_8

    .line 113
    .line 114
    sget-object v2, Lvu0;->h:Lvu0;

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    const-string v2, "com.ss.android.ugc.aweme"

    .line 118
    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_8

    .line 124
    .line 125
    sget-object v2, Lvu0;->j:Lvu0;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    const-string v2, "com.tencent.mm"

    .line 129
    .line 130
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_8

    .line 135
    .line 136
    sget-object v2, Lvu0;->i:Lvu0;

    .line 137
    .line 138
    :goto_0
    sput-object v2, Lpp1;->b:Lvu0;

    .line 139
    .line 140
    sput-object p0, Lup0;->l:Ljava/lang/String;

    .line 141
    .line 142
    sput-object v0, Lup0;->n:Ljava/lang/String;

    .line 143
    .line 144
    sput-object v1, Lup0;->m:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    const-class v0, Landroid/app/Application;

    .line 151
    .line 152
    if-eqz p0, :cond_4

    .line 153
    .line 154
    const-class p0, Landroid/app/Instrumentation;

    .line 155
    .line 156
    invoke-static {p0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ln4;->v()Lsg1;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    const-string v1, "callApplicationOnCreate"

    .line 169
    .line 170
    iput-object v1, p0, Lzf1;->b:Ljava/lang/String;

    .line 171
    .line 172
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {p0, v0}, Lsg1;->d([Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0}, Lsg1;->c()Ljava/util/List;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    check-cast p0, Lzg1;

    .line 188
    .line 189
    iget-object p0, p0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    new-instance v0, Lvi1;

    .line 195
    .line 196
    const/16 v1, 0x16

    .line 197
    .line 198
    invoke-direct {v0, v1}, Lvi1;-><init>(I)V

    .line 199
    .line 200
    .line 201
    new-instance v1, Lvi1;

    .line 202
    .line 203
    const/16 v2, 0x17

    .line 204
    .line 205
    invoke-direct {v1, v2}, Lvi1;-><init>(I)V

    .line 206
    .line 207
    .line 208
    new-instance v2, Lkg3;

    .line 209
    .line 210
    invoke-direct {v2, p1, v0, v1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 211
    .line 212
    .line 213
    invoke-static {p0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    const-class p0, Landroid/app/Activity;

    .line 221
    .line 222
    invoke-static {p0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {p0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0}, Ln4;->v()Lsg1;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    const-string v0, "onResume"

    .line 235
    .line 236
    iput-object v0, p0, Lzf1;->b:Ljava/lang/String;

    .line 237
    .line 238
    invoke-virtual {p0}, Lsg1;->c()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-static {p0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    check-cast p0, Lzg1;

    .line 247
    .line 248
    iget-object p0, p0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 249
    .line 250
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    new-instance v0, Lvi1;

    .line 254
    .line 255
    const/16 v1, 0x15

    .line 256
    .line 257
    invoke-direct {v0, v1}, Lvi1;-><init>(I)V

    .line 258
    .line 259
    .line 260
    new-instance v1, Lkg3;

    .line 261
    .line 262
    invoke-direct {v1, p1, v0, p1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 263
    .line 264
    .line 265
    invoke-static {p0, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_4
    invoke-static {}, Lpp1;->a()[Lvj;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    array-length v2, p0

    .line 281
    const/4 v3, 0x0

    .line 282
    :goto_1
    if-ge v3, v2, :cond_6

    .line 283
    .line 284
    aget-object v4, p0, v3

    .line 285
    .line 286
    instance-of v6, v4, Ltb1;

    .line 287
    .line 288
    if-nez v6, :cond_5

    .line 289
    .line 290
    sget-object v6, Lst0;->a:Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4}, Lvj;->f()Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    if-eqz v4, :cond_5

    .line 300
    .line 301
    invoke-static {v0}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-static {v0}, Lop0;->y(Ljava/lang/Object;)Ln4;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v0}, Ln4;->v()Lsg1;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    const-string v1, "attach"

    .line 314
    .line 315
    iput-object v1, v0, Lzf1;->b:Ljava/lang/String;

    .line 316
    .line 317
    const-class v1, Landroid/content/Context;

    .line 318
    .line 319
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-virtual {v0, v1}, Lsg1;->d([Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0}, Lsg1;->c()Ljava/util/List;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-static {v0}, Ldu;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    check-cast v0, Lzg1;

    .line 335
    .line 336
    iget-object v0, v0, Lzg1;->j:Ljava/lang/reflect/Method;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    new-instance v1, Lv;

    .line 342
    .line 343
    const/16 v2, 0x12

    .line 344
    .line 345
    invoke-direct {v1, v2, p0}, Lv;-><init>(ILjava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    new-instance p0, Lkg3;

    .line 349
    .line 350
    invoke-direct {p0, p1, p1, v1}, Lkg3;-><init>(Lvj;Lin0;Lin0;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v0, p0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 362
    .line 363
    goto :goto_1

    .line 364
    :cond_6
    const-string p0, "NukeCore"

    .line 365
    .line 366
    new-instance p1, Ljava/lang/StringBuilder;

    .line 367
    .line 368
    const-string v0, "Skip process "

    .line 369
    .line 370
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v0, ": no hookers target this process"

    .line 377
    .line 378
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    const-string v1, "]"

    .line 398
    .line 399
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    sget-object v0, La83;->a:La83;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 413
    .line 414
    goto :goto_2

    .line 415
    :catchall_0
    move-exception v0

    .line 416
    new-instance v1, Lx92;

    .line 417
    .line 418
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 419
    .line 420
    .line 421
    move-object v0, v1

    .line 422
    :goto_2
    instance-of v0, v0, Lx92;

    .line 423
    .line 424
    if-eqz v0, :cond_7

    .line 425
    .line 426
    const/4 v0, 0x4

    .line 427
    invoke-static {v0, p0, p1}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    .line 428
    .line 429
    .line 430
    :cond_7
    :goto_3
    return-void

    .line 431
    :cond_8
    const-string p0, "Nuke is running on unsupported package: "

    .line 432
    .line 433
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :cond_9
    const-string p0, "startupParam"

    .line 442
    .line 443
    invoke-static {p0}, Lt11;->S(Ljava/lang/String;)V

    .line 444
    .line 445
    .line 446
    throw p1
.end method

.method public initZygote(Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnuke/startup/MainHook;->startupParam:Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;

    .line 5
    .line 6
    return-void
.end method

.method public final requireRunningInTargetHost(Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "com.tencent.mm"

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_1

    .line 11
    .line 12
    const-string p0, "com.tencent.mobileqq"

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 24
    return p0
.end method
