.class public final Lcom/example/dyhelper/MainHook;
.super Lio/github/libxposed/api/XposedModule;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic β:I


# instance fields
.field public α:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lio/github/libxposed/api/XposedModule;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/example/dyhelper/MainHook;->α:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onHotReloading(Lio/github/libxposed/api/XposedModuleInterface$HotReloadingParam;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string p0, "DYHelper: hot reload rejected because process hooks are not generation-safe"

    .line 5
    .line 6
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final onModuleLoaded(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lyq0;->α:Lyq0;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lyq0;->α(Lio/github/libxposed/api/XposedModule;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/example/dyhelper/MainHook;->α:Ljava/lang/String;

    .line 17
    .line 18
    sget-object v0, Lx01;->α:Lx01;

    .line 19
    .line 20
    invoke-virtual {p0}, Lio/github/libxposed/api/XposedModule;->getModuleApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sput-object p0, Lx01;->β:Ljava/lang/String;

    .line 36
    .line 37
    const-class v0, Lx01;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lx01;->δ:Ljava/lang/ClassLoader;

    .line 44
    .line 45
    const-string v0, "DYHelper: ModuleContext \u5df2\u521d\u59cb\u5316 modulePath="

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "DYHelper: libxposed API 102 module loaded process="

    .line 59
    .line 60
    invoke-static {p1, p0}, Lnx;->φ(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final onPackageReady(Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;)V
    .locals 24

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface/range {p1 .. p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-object/from16 v10, p0

    .line 12
    .line 13
    iget-object v0, v10, Lcom/example/dyhelper/MainHook;->α:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface/range {p1 .. p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-interface/range {p1 .. p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getClassLoader()Ljava/lang/ClassLoader;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface/range {p1 .. p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 36
    .line 37
    .line 38
    move-result-object v11

    .line 39
    new-instance v12, Lz81;

    .line 40
    .line 41
    invoke-direct {v12, v1, v0, v2, v11}, Lz81;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)V

    .line 42
    .line 43
    .line 44
    sget-object v2, Lsw0;->α:Ljava/util/Set;

    .line 45
    .line 46
    const-string v2, "com.xingin.xhs"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const-class v13, Landroid/content/Context;

    .line 53
    .line 54
    const-string v14, "attach"

    .line 55
    .line 56
    const-class v15, Landroid/app/Application;

    .line 57
    .line 58
    const-wide/16 v16, 0x0

    .line 59
    .line 60
    const-string v4, ""

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x1

    .line 65
    if-eqz v3, :cond_9

    .line 66
    .line 67
    sget-object v3, Lsw0;->α:Ljava/util/Set;

    .line 68
    .line 69
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v8

    .line 73
    if-eqz v8, :cond_9

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_23

    .line 80
    .line 81
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_23

    .line 86
    .line 87
    new-instance v10, Ln5;

    .line 88
    .line 89
    sget-object v0, Lnz;->ε:Lnz;

    .line 90
    .line 91
    const-string v2, "XHSHelper"

    .line 92
    .line 93
    invoke-direct {v10, v2, v0}, Ln5;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lmd2;->α:Ljava/lang/Object;

    .line 97
    .line 98
    if-eqz v11, :cond_1

    .line 99
    .line 100
    iget-object v0, v11, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    move-object v0, v5

    .line 104
    :goto_0
    if-nez v0, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    move-object v4, v0

    .line 108
    :goto_1
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 109
    .line 110
    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 114
    .line 115
    .line 116
    move-result-wide v8

    .line 117
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    goto :goto_2

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    new-instance v3, Leo1;

    .line 124
    .line 125
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    move-object v0, v3

    .line 129
    :goto_2
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    instance-of v8, v0, Leo1;

    .line 134
    .line 135
    if-eqz v8, :cond_3

    .line 136
    .line 137
    move-object v0, v3

    .line 138
    :cond_3
    check-cast v0, Ljava/lang/Number;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 141
    .line 142
    .line 143
    move-result-wide v8

    .line 144
    move v3, v6

    .line 145
    move-wide/from16 v22, v8

    .line 146
    .line 147
    move v9, v7

    .line 148
    move-wide/from16 v6, v22

    .line 149
    .line 150
    iget-object v8, v12, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 151
    .line 152
    const/4 v0, 0x0

    .line 153
    move-object/from16 v17, v2

    .line 154
    .line 155
    move/from16 v16, v3

    .line 156
    .line 157
    move-object v2, v4

    .line 158
    const-wide/16 v3, 0x0

    .line 159
    .line 160
    move-object/from16 v18, v5

    .line 161
    .line 162
    const-string v5, ""

    .line 163
    .line 164
    move/from16 v19, v9

    .line 165
    .line 166
    const-string v9, "1.4.15"

    .line 167
    .line 168
    move-object/from16 p1, v11

    .line 169
    .line 170
    move-object/from16 v18, v14

    .line 171
    .line 172
    move/from16 v11, v16

    .line 173
    .line 174
    move-object/from16 v20, v17

    .line 175
    .line 176
    move/from16 v14, v19

    .line 177
    .line 178
    invoke-static/range {v0 .. v9}, Lmd2;->β(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/ClassLoader;Ljava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    sget-object v2, Lsw0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 183
    .line 184
    invoke-virtual {v2, v11, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_4

    .line 189
    .line 190
    :goto_3
    move-object/from16 v3, v20

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_4
    :try_start_1
    new-instance v0, Lqg;

    .line 194
    .line 195
    const/4 v3, 0x6

    .line 196
    invoke-direct {v0, v12, v3, v10}, Lqg;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    filled-new-array {v13, v0}, [Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    move-object/from16 v3, v18

    .line 204
    .line 205
    invoke-static {v15, v3, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 206
    .line 207
    .line 208
    const-string v0, "XHSHelper: Application.attach Hook \u5df2\u5b89\u88c5"

    .line 209
    .line 210
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :catchall_1
    move-exception v0

    .line 215
    invoke-virtual {v2, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 216
    .line 217
    .line 218
    const-string v2, "SAMPLE Application.attach Hook \u5b89\u88c5\u5931\u8d25"

    .line 219
    .line 220
    move-object/from16 v3, v20

    .line 221
    .line 222
    invoke-static {v3, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    :goto_4
    if-eqz v1, :cond_8

    .line 226
    .line 227
    if-eqz p1, :cond_7

    .line 228
    .line 229
    move-object/from16 v1, p1

    .line 230
    .line 231
    iget-object v5, v1, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 232
    .line 233
    if-eqz v5, :cond_7

    .line 234
    .line 235
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 236
    .line 237
    .line 238
    move-result v0

    .line 239
    if-nez v0, :cond_5

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_5
    const/4 v5, 0x0

    .line 243
    :goto_5
    if-nez v5, :cond_6

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_6
    :try_start_2
    iget-object v0, v12, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 247
    .line 248
    invoke-static {v5, v11, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 252
    goto :goto_6

    .line 253
    :catchall_2
    move-exception v0

    .line 254
    new-instance v1, Leo1;

    .line 255
    .line 256
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    move-object v0, v1

    .line 260
    :goto_6
    instance-of v0, v0, Leo1;

    .line 261
    .line 262
    xor-int/lit8 v7, v0, 0x1

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_7
    :goto_7
    move v7, v14

    .line 266
    :goto_8
    if-eqz v7, :cond_8

    .line 267
    .line 268
    :try_start_3
    sget-object v0, Lod2;->α:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 269
    .line 270
    sget-object v0, Lsw0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 271
    .line 272
    invoke-static {v12, v10, v0}, Lod2;->α(Lz81;Ln5;Ljava/util/concurrent/atomic/AtomicBoolean;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 277
    .line 278
    .line 279
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 280
    goto :goto_9

    .line 281
    :catchall_3
    move-exception v0

    .line 282
    new-instance v1, Leo1;

    .line 283
    .line 284
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 285
    .line 286
    .line 287
    move-object v0, v1

    .line 288
    :goto_9
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-eqz v0, :cond_23

    .line 293
    .line 294
    const-string v1, "SAMPLE \u65e9\u671f Hook \u5b89\u88c5\u5931\u8d25\uff0c\u7b49\u5f85 attach \u91cd\u8bd5"

    .line 295
    .line 296
    invoke-static {v3, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 297
    .line 298
    .line 299
    goto/16 :goto_24

    .line 300
    .line 301
    :cond_8
    const-string v0, "XHSHelper: \u65e9\u671f DexKit \u6216\u5bbf\u4e3b ClassLoader \u672a\u5c31\u7eea\uff0cHook \u5ef6\u540e\u5230 Application.attach"

    .line 302
    .line 303
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    goto/16 :goto_24

    .line 307
    .line 308
    :cond_9
    move v11, v6

    .line 309
    move-object v3, v14

    .line 310
    move v14, v7

    .line 311
    sget-object v2, Ltw0;->α:Ljava/util/Set;

    .line 312
    .line 313
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    if-eqz v5, :cond_a

    .line 318
    .line 319
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v5

    .line 323
    if-eqz v5, :cond_a

    .line 324
    .line 325
    move v6, v14

    .line 326
    goto :goto_a

    .line 327
    :cond_a
    move v6, v11

    .line 328
    :goto_a
    const-string v5, "DYHelper"

    .line 329
    .line 330
    const-string v7, ", process="

    .line 331
    .line 332
    if-eqz v6, :cond_24

    .line 333
    .line 334
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    if-eqz v6, :cond_b

    .line 339
    .line 340
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v6

    .line 344
    if-eqz v6, :cond_b

    .line 345
    .line 346
    move v6, v14

    .line 347
    goto :goto_b

    .line 348
    :cond_b
    move v6, v11

    .line 349
    :goto_b
    if-nez v6, :cond_c

    .line 350
    .line 351
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    if-eqz v2, :cond_23

    .line 356
    .line 357
    new-instance v2, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    const-string v3, "DYHelper: \u8df3\u8fc7\u975e\u76ee\u6807\u5305\u52a0\u8f7d package="

    .line 360
    .line 361
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    goto/16 :goto_24

    .line 381
    .line 382
    :cond_c
    sget-object v2, Ltw0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 383
    .line 384
    invoke-virtual {v2, v11, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 385
    .line 386
    .line 387
    move-result v2

    .line 388
    if-nez v2, :cond_d

    .line 389
    .line 390
    const-string v2, "handleLoadPackage \u5df2\u5904\u7406\uff0c\u8df3\u8fc7\u5d4c\u5165\u5f0f\u6846\u67b6\u7684\u91cd\u590d\u56de\u8c03 package="

    .line 391
    .line 392
    invoke-static {v2, v1, v7, v0, v5}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    goto/16 :goto_24

    .line 396
    .line 397
    :cond_d
    new-instance v8, Ln5;

    .line 398
    .line 399
    sget-object v0, Ltw0;->β:Ljava/util/Set;

    .line 400
    .line 401
    invoke-direct {v8, v5, v0}, Ln5;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    .line 402
    .line 403
    .line 404
    :try_start_4
    invoke-static {}, Ltw0;->α()Landroid/content/Context;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    if-nez v0, :cond_e

    .line 409
    .line 410
    new-instance v0, Lrw0;

    .line 411
    .line 412
    invoke-direct {v0}, Lrw0;-><init>()V

    .line 413
    .line 414
    .line 415
    goto :goto_e

    .line 416
    :catchall_4
    move-exception v0

    .line 417
    goto :goto_c

    .line 418
    :cond_e
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-virtual {v0, v1, v11}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    new-instance v1, Lrw0;

    .line 427
    .line 428
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    .line 432
    .line 433
    .line 434
    move-result-wide v6

    .line 435
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 436
    .line 437
    if-nez v0, :cond_f

    .line 438
    .line 439
    move-object v0, v4

    .line 440
    :cond_f
    invoke-direct {v1, v6, v7, v0}, Lrw0;-><init>(JLjava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 441
    .line 442
    .line 443
    goto :goto_d

    .line 444
    :goto_c
    new-instance v1, Leo1;

    .line 445
    .line 446
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 447
    .line 448
    .line 449
    :goto_d
    move-object v0, v1

    .line 450
    :goto_e
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    if-nez v1, :cond_10

    .line 455
    .line 456
    goto :goto_f

    .line 457
    :cond_10
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    new-instance v1, Ljava/lang/StringBuilder;

    .line 462
    .line 463
    const-string v2, "DYHelper: \u8bfb\u53d6\u5bbf\u4e3b\u7248\u672c\u5931\u8d25\uff0c\u9876\u680f\u5206\u652f\u964d\u7ea7\u65e7\u7248: "

    .line 464
    .line 465
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    new-instance v0, Lrw0;

    .line 479
    .line 480
    invoke-direct {v0}, Lrw0;-><init>()V

    .line 481
    .line 482
    .line 483
    :goto_f
    move-object v1, v0

    .line 484
    check-cast v1, Lrw0;

    .line 485
    .line 486
    iget-wide v6, v1, Lrw0;->α:J

    .line 487
    .line 488
    const-wide/32 v18, 0x5f49d

    .line 489
    .line 490
    .line 491
    cmp-long v0, v6, v18

    .line 492
    .line 493
    move-wide/from16 v18, v6

    .line 494
    .line 495
    if-ltz v0, :cond_11

    .line 496
    .line 497
    move v6, v14

    .line 498
    goto :goto_10

    .line 499
    :cond_11
    move v6, v11

    .line 500
    :goto_10
    const-wide/32 v20, 0x5f5c9

    .line 501
    .line 502
    .line 503
    cmp-long v0, v18, v20

    .line 504
    .line 505
    if-ltz v0, :cond_12

    .line 506
    .line 507
    move v7, v14

    .line 508
    goto :goto_11

    .line 509
    :cond_12
    move v7, v11

    .line 510
    :goto_11
    iget-object v0, v12, Lz81;->β:Ljava/lang/String;

    .line 511
    .line 512
    const-string v2, "DYHelper: \u6a21\u5757\u5df2\u52a0\u8f7d (\u8fdb\u7a0b="

    .line 513
    .line 514
    const-string v9, ")"

    .line 515
    .line 516
    invoke-static {v2, v0, v9}, Lnx;->Ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    iget-object v0, v1, Lrw0;->β:Ljava/lang/String;

    .line 520
    .line 521
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    if-eqz v2, :cond_13

    .line 526
    .line 527
    const-string v0, "unknown"

    .line 528
    .line 529
    :cond_13
    move/from16 v19, v14

    .line 530
    .line 531
    move-object/from16 p1, v15

    .line 532
    .line 533
    iget-wide v14, v1, Lrw0;->α:J

    .line 534
    .line 535
    new-instance v2, Ljava/lang/StringBuilder;

    .line 536
    .line 537
    const-string v9, "DYHelper: \u5bbf\u4e3b\u7248\u672c versionName="

    .line 538
    .line 539
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    const-string v0, ", versionCode="

    .line 546
    .line 547
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    const-string v0, ", use3903Branch="

    .line 554
    .line 555
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    const-string v0, ", use390601Branch="

    .line 562
    .line 563
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    sget v0, Loe0;->α:I

    .line 577
    .line 578
    sget-object v0, Lx9;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 579
    .line 580
    invoke-static {}, Lcom/example/dyhelper/beta/BetaNativeBridge;->σ()Z

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    new-instance v2, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    const-string v9, "DYHelper: Beta native verifier loaded="

    .line 587
    .line 588
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 602
    .line 603
    invoke-static {}, Lcom/example/dyhelper/beta/BlacklistVerifier;->γ()Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    new-instance v2, Ljava/lang/StringBuilder;

    .line 608
    .line 609
    const-string v9, "DYHelper: Blacklist native verifier loaded="

    .line 610
    .line 611
    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    iget-object v0, v12, Lz81;->δ:Landroid/content/pm/ApplicationInfo;

    .line 625
    .line 626
    if-eqz v0, :cond_14

    .line 627
    .line 628
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 629
    .line 630
    goto :goto_12

    .line 631
    :cond_14
    const/4 v0, 0x0

    .line 632
    :goto_12
    const-string v2, "rc2b948eb05c3593c"

    .line 633
    .line 634
    const-string v9, "early blacklist cache loaded uid="

    .line 635
    .line 636
    if-eqz v0, :cond_15

    .line 637
    .line 638
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    goto :goto_13

    .line 647
    :cond_15
    const/4 v0, 0x0

    .line 648
    :goto_13
    if-nez v0, :cond_16

    .line 649
    .line 650
    goto :goto_14

    .line 651
    :cond_16
    move-object v4, v0

    .line 652
    :goto_14
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 653
    .line 654
    .line 655
    move-result v0

    .line 656
    if-eqz v0, :cond_17

    .line 657
    .line 658
    :goto_15
    const/4 v15, 0x0

    .line 659
    goto/16 :goto_18

    .line 660
    .line 661
    :cond_17
    const/4 v14, 0x4

    .line 662
    :try_start_5
    new-instance v0, Ljava/io/File;

    .line 663
    .line 664
    new-instance v15, Ljava/io/File;

    .line 665
    .line 666
    const-string v11, "shared_prefs"

    .line 667
    .line 668
    invoke-direct {v15, v4, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    const-string v4, "dyhelper_blacklist.xml"

    .line 672
    .line 673
    invoke-direct {v0, v15, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 677
    .line 678
    .line 679
    move-result v4

    .line 680
    if-nez v4, :cond_18

    .line 681
    .line 682
    goto :goto_15

    .line 683
    :cond_18
    sget-object v4, Lmf;->α:Ljava/nio/charset/Charset;

    .line 684
    .line 685
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    new-instance v11, Ljava/io/InputStreamReader;

    .line 689
    .line 690
    new-instance v15, Ljava/io/FileInputStream;

    .line 691
    .line 692
    invoke-direct {v15, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 693
    .line 694
    .line 695
    invoke-direct {v11, v15, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 696
    .line 697
    .line 698
    :try_start_6
    invoke-static {v11}, Li81;->φ(Ljava/io/Reader;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_7

    .line 702
    :try_start_7
    invoke-virtual {v11}, Ljava/io/InputStreamReader;->close()V

    .line 703
    .line 704
    .line 705
    invoke-static {v0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->θ(Ljava/lang/String;)Z

    .line 706
    .line 707
    .line 708
    move-result v4

    .line 709
    if-nez v4, :cond_19

    .line 710
    .line 711
    goto :goto_15

    .line 712
    :cond_19
    sput-boolean v19, Lcom/example/dyhelper/beta/BlacklistVerifier;->μ:Z

    .line 713
    .line 714
    const-string v4, "reason"

    .line 715
    .line 716
    invoke-static {v0, v4}, Lcom/example/dyhelper/beta/BlacklistVerifier;->ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v4

    .line 720
    sput-object v4, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 721
    .line 722
    const-string v4, "uid"

    .line 723
    .line 724
    invoke-static {v0, v4}, Lcom/example/dyhelper/beta/BlacklistVerifier;->ι(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    sput-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ:Ljava/lang/String;

    .line 729
    .line 730
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->κ:Ljava/lang/String;

    .line 731
    .line 732
    sget-object v4, Lcom/example/dyhelper/beta/BlacklistVerifier;->ν:Ljava/lang/String;

    .line 733
    .line 734
    new-instance v11, Ljava/lang/StringBuilder;

    .line 735
    .line 736
    invoke-direct {v11, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    const-string v0, " reason="

    .line 743
    .line 744
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 754
    const/4 v15, 0x0

    .line 755
    :try_start_8
    invoke-static {v2, v0, v15, v14, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 756
    .line 757
    .line 758
    sget-object v0, Ls62;->α:Ls62;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 759
    .line 760
    goto :goto_17

    .line 761
    :catchall_5
    move-exception v0

    .line 762
    goto :goto_16

    .line 763
    :catchall_6
    move-exception v0

    .line 764
    const/4 v15, 0x0

    .line 765
    goto :goto_16

    .line 766
    :catchall_7
    move-exception v0

    .line 767
    const/4 v15, 0x0

    .line 768
    move-object v4, v0

    .line 769
    :try_start_9
    throw v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 770
    :catchall_8
    move-exception v0

    .line 771
    :try_start_a
    invoke-static {v11, v4}, Lxb;->λ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 772
    .line 773
    .line 774
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 775
    :goto_16
    new-instance v4, Leo1;

    .line 776
    .line 777
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 778
    .line 779
    .line 780
    move-object v0, v4

    .line 781
    :goto_17
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    if-eqz v0, :cond_1a

    .line 786
    .line 787
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    const-string v4, "early blacklist cache load failed: "

    .line 792
    .line 793
    invoke-static {v4, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    invoke-static {v2, v0, v15, v14, v15}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 798
    .line 799
    .line 800
    :cond_1a
    :goto_18
    sget-object v0, Lcom/example/dyhelper/beta/BlacklistVerifier;->α:Lcom/example/dyhelper/beta/BlacklistVerifier;

    .line 801
    .line 802
    invoke-virtual {v0}, Lcom/example/dyhelper/beta/BlacklistVerifier;->ζ()Z

    .line 803
    .line 804
    .line 805
    move-result v0

    .line 806
    if-eqz v0, :cond_1b

    .line 807
    .line 808
    const-string v0, "DYHelper: Blacklist blocked by early blacklist cache, skip early hooks"

    .line 809
    .line 810
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    :cond_1b
    :try_start_b
    const-string v0, "onCreate"

    .line 814
    .line 815
    new-instance v2, Loj0;

    .line 816
    .line 817
    const/16 v4, 0x13

    .line 818
    .line 819
    invoke-direct {v2, v4}, Loj0;-><init>(I)V

    .line 820
    .line 821
    .line 822
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 826
    move-object/from16 v11, p1

    .line 827
    .line 828
    :try_start_c
    invoke-static {v11, v0, v2}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 829
    .line 830
    .line 831
    :goto_19
    move-object v2, v3

    .line 832
    goto :goto_1b

    .line 833
    :catchall_9
    move-exception v0

    .line 834
    goto :goto_1a

    .line 835
    :catchall_a
    move-exception v0

    .line 836
    move-object/from16 v11, p1

    .line 837
    .line 838
    :goto_1a
    const-string v2, "ModuleContextProvider init \u5931\u8d25"

    .line 839
    .line 840
    invoke-static {v5, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 841
    .line 842
    .line 843
    goto :goto_19

    .line 844
    :goto_1b
    sget-object v3, Ltw0;->α:Ljava/util/Set;

    .line 845
    .line 846
    move-object v4, v5

    .line 847
    sget-object v5, Ltw0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 848
    .line 849
    sget-object v9, Ltw0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 850
    .line 851
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 858
    .line 859
    .line 860
    move-object v14, v2

    .line 861
    new-instance v2, Lcf0;

    .line 862
    .line 863
    move-object/from16 v22, v12

    .line 864
    .line 865
    move-object v12, v4

    .line 866
    move-object/from16 v4, v22

    .line 867
    .line 868
    invoke-direct/range {v2 .. v10}, Lcf0;-><init>(Ljava/util/Set;Lz81;Ljava/util/concurrent/atomic/AtomicBoolean;ZZLn5;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/example/dyhelper/MainHook;)V

    .line 869
    .line 870
    .line 871
    filled-new-array {v13, v2}, [Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    invoke-static {v11, v14, v0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 876
    .line 877
    .line 878
    iget-wide v0, v1, Lrw0;->α:J

    .line 879
    .line 880
    cmp-long v0, v0, v16

    .line 881
    .line 882
    if-gtz v0, :cond_1c

    .line 883
    .line 884
    const-string v0, "\u65e9\u671f\u5bbf\u4e3b\u7248\u672c\u672a\u77e5\uff0c\u7b49\u5f85 Application.attach \u91cd\u65b0\u89e3\u6790"

    .line 885
    .line 886
    invoke-static {v12, v0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    goto :goto_1f

    .line 890
    :cond_1c
    iget-object v1, v4, Lz81;->γ:Ljava/lang/ClassLoader;

    .line 891
    .line 892
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    iget-object v2, v4, Lz81;->δ:Landroid/content/pm/ApplicationInfo;

    .line 897
    .line 898
    if-eqz v2, :cond_1e

    .line 899
    .line 900
    iget-object v5, v2, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    .line 901
    .line 902
    if-eqz v5, :cond_1e

    .line 903
    .line 904
    invoke-static {v5}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    if-nez v2, :cond_1d

    .line 909
    .line 910
    goto :goto_1c

    .line 911
    :cond_1d
    move-object v5, v15

    .line 912
    :goto_1c
    if-eqz v5, :cond_1e

    .line 913
    .line 914
    invoke-virtual {v0, v5}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    :cond_1e
    sget-object v2, Ltw0;->ζ:Ljava/lang/String;

    .line 918
    .line 919
    invoke-virtual {v0, v2}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    invoke-static {v0}, Lyh;->μ(Lzt0;)Lzt0;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    const/4 v3, 0x0

    .line 927
    invoke-virtual {v0, v3}, Lzt0;->listIterator(I)Ljava/util/ListIterator;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    :goto_1d
    move-object v0, v2

    .line 932
    check-cast v0, Lle0;

    .line 933
    .line 934
    invoke-virtual {v0}, Lle0;->hasNext()Z

    .line 935
    .line 936
    .line 937
    move-result v5

    .line 938
    if-eqz v5, :cond_20

    .line 939
    .line 940
    invoke-virtual {v0}, Lle0;->next()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    move-object v5, v0

    .line 945
    check-cast v5, Ljava/lang/String;

    .line 946
    .line 947
    :try_start_d
    invoke-static {v5, v3, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    .line 951
    goto :goto_1e

    .line 952
    :catchall_b
    move-exception v0

    .line 953
    new-instance v3, Leo1;

    .line 954
    .line 955
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 956
    .line 957
    .line 958
    move-object v0, v3

    .line 959
    :goto_1e
    instance-of v0, v0, Leo1;

    .line 960
    .line 961
    if-eqz v0, :cond_1f

    .line 962
    .line 963
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 968
    .line 969
    .line 970
    move-result-object v0

    .line 971
    const-string v1, "\u65e9\u671f ClassLoader \u5c1a\u4e0d\u53ef\u7528: class="

    .line 972
    .line 973
    const-string v2, ", loader="

    .line 974
    .line 975
    invoke-static {v1, v5, v2, v0, v12}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    :goto_1f
    const-string v0, "DYHelper: \u65e9\u671f\u5bbf\u4e3b\u73af\u5883\u672a\u5c31\u7eea\uff0cload-package Hook \u5ef6\u540e\u5230 Application.attach"

    .line 979
    .line 980
    invoke-static {v0}, Lux;->ρ(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    goto :goto_23

    .line 984
    :cond_1f
    const/4 v3, 0x0

    .line 985
    goto :goto_1d

    .line 986
    :cond_20
    :try_start_e
    sget-object v1, Ltw0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 987
    .line 988
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 989
    .line 990
    .line 991
    move/from16 v14, v19

    .line 992
    .line 993
    const/4 v3, 0x0

    .line 994
    invoke-virtual {v1, v3, v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 995
    .line 996
    .line 997
    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_c

    .line 998
    if-nez v0, :cond_21

    .line 999
    .line 1000
    const/4 v6, 0x0

    .line 1001
    goto :goto_20

    .line 1002
    :cond_21
    :try_start_f
    invoke-static {v4, v8, v6, v7}, Lkn0;->Δ(Lz81;Ln5;ZZ)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_d

    .line 1003
    .line 1004
    .line 1005
    move v6, v14

    .line 1006
    :goto_20
    :try_start_10
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    goto :goto_22

    .line 1011
    :catchall_c
    move-exception v0

    .line 1012
    goto :goto_21

    .line 1013
    :catchall_d
    move-exception v0

    .line 1014
    const/4 v3, 0x0

    .line 1015
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1016
    .line 1017
    .line 1018
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    .line 1019
    :goto_21
    new-instance v1, Leo1;

    .line 1020
    .line 1021
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1022
    .line 1023
    .line 1024
    move-object v0, v1

    .line 1025
    :goto_22
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v0

    .line 1029
    if-eqz v0, :cond_22

    .line 1030
    .line 1031
    const-string v1, "\u65e9\u671f load-package Hook \u5b89\u88c5\u5931\u8d25\uff0c\u7b49\u5f85 attach \u91cd\u8bd5"

    .line 1032
    .line 1033
    invoke-static {v12, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1034
    .line 1035
    .line 1036
    :cond_22
    :goto_23
    sget v0, Loe0;->α:I

    .line 1037
    .line 1038
    :cond_23
    :goto_24
    return-void

    .line 1039
    :cond_24
    move-object v12, v5

    .line 1040
    const-string v2, "\u8df3\u8fc7\u672a\u6ce8\u518c\u5bbf\u4e3b package="

    .line 1041
    .line 1042
    invoke-static {v2, v1, v7, v0, v12}, Lnx;->ψ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1043
    .line 1044
    .line 1045
    return-void
.end method
