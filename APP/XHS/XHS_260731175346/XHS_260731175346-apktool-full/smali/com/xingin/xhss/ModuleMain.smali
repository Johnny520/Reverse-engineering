.class public final Lcom/xingin/xhss/ModuleMain;
.super Lio/github/libxposed/api/XposedModule;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field private cache:Z

.field public ᛷᛵᛵᲈ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x104a41b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x104b31b858845L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/github/libxposed/api/XposedModule;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final native c(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final onModuleLoaded(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V
    .locals 2

    .line 1
    const-wide v0, -0x1045a1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x104521b858845L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;

    .line 18
    .line 19
    sget-object v0, Lcom/xingin/xhss/ModuleInit;->ᛷᛵᛵᲈ:Lcom/xingin/xhss/ModuleInit;

    .line 20
    .line 21
    const-wide v0, -0x104ce1b858845L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    const-wide v0, -0x104d51b858845L

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const-wide v0, -0xcc9b1b858845L

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    const-wide v0, -0xcca21b858845L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᲇᛴᲇᛵ:Lcom/xingin/xhss/ModuleMain;

    .line 59
    .line 60
    if-nez v0, :cond_0

    .line 61
    .line 62
    sput-object p0, Lxhss/ᲇᲁᛱᛸ;->ᲇᛴᲇᛵ:Lcom/xingin/xhss/ModuleMain;

    .line 63
    .line 64
    :cond_0
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᲇᛶᛴᲀ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;

    .line 65
    .line 66
    if-nez p0, :cond_1

    .line 67
    .line 68
    sput-object p1, Lxhss/ᲇᲁᛱᛸ;->ᲇᛶᛴᲀ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;

    .line 69
    .line 70
    :cond_1
    return-void
.end method

.method public final onPackageLoaded(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V
    .locals 14

    .line 1
    const-wide v0, -0x104601b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Lio/github/libxposed/api/XposedModule;->onPackageLoaded(Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lcom/xingin/xhss/ModuleMain;->ᛷᛵᛵᲈ:Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide v0, -0x104401b858845L

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :goto_0
    invoke-interface {p0}, Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;->getProcessName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const-wide v0, -0x104661b858845L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->isFirstPackage()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_b

    .line 43
    .line 44
    const-wide v0, -0x1047a1b858845L

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_1

    .line 58
    .line 59
    const-wide v0, -0x104891b858845L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-nez p0, :cond_1

    .line 73
    .line 74
    goto/16 :goto_7

    .line 75
    .line 76
    :cond_1
    sget-object p0, Lcom/xingin/xhss/ModuleInit;->ᛷᛵᛵᲈ:Lcom/xingin/xhss/ModuleInit;

    .line 77
    .line 78
    const-wide v0, -0x104db1b858845L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    const-wide v0, -0x104e11b858845L

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-wide v0, -0x104e81b858845L

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 112
    .line 113
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {p0, v0}, Lcom/xingin/xhss/ModuleInit;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 121
    .line 122
    .line 123
    move-result-wide v0

    .line 124
    sget-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 125
    .line 126
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getDefaultClassLoader()Ljava/lang/ClassLoader;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sput-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛸᛴᛶᛳ:Ljava/lang/ClassLoader;

    .line 134
    .line 135
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    const-wide v2, -0x104ef1b858845L

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    const-wide v2, -0xcc771b858845L

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    sput-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛸᛷᲈᲈ:Landroid/content/pm/ApplicationInfo;

    .line 156
    .line 157
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {p0}, Lio/github/libxposed/api/XposedModule;->getModuleApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    const-wide v2, -0x105071b858845L

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    const-wide v2, -0xcc5b1b858845L

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    sput-object p0, Lxhss/ᲇᲁᛱᛸ;->ᛸᛲᲀᛵ:Landroid/content/pm/ApplicationInfo;

    .line 182
    .line 183
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {p0}, Lio/github/libxposed/api/XposedModule;->getFrameworkName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    const-wide v2, -0x105251b858845L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v2}, Lio/github/libxposed/api/XposedModule;->getFrameworkVersion()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const-wide v3, -0x1053b1b858845L

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v3}, Lio/github/libxposed/api/XposedModule;->getFrameworkVersionCode()J

    .line 220
    .line 221
    .line 222
    move-result-wide v3

    .line 223
    new-instance v5, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-wide v6, -0x105541b858845L

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-wide v6, -0x105651b858845L

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    const-wide v6, -0x1057a1b858845L

    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    invoke-static {v6, v7}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    const-wide v2, -0x105931b858845L

    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    const-wide v3, -0xfd001b858845L

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    const-wide v5, -0xfce91b858845L

    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 303
    .line 304
    .line 305
    move-result v7

    .line 306
    const-wide v8, -0xfcf11b858845L

    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    const/4 v10, 0x0

    .line 312
    if-nez v7, :cond_2

    .line 313
    .line 314
    goto :goto_2

    .line 315
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 316
    .line 317
    .line 318
    move-result v7

    .line 319
    move v11, v10

    .line 320
    :goto_1
    if-ge v11, v7, :cond_4

    .line 321
    .line 322
    add-int/lit16 v12, v11, 0x7d0

    .line 323
    .line 324
    if-le v12, v7, :cond_3

    .line 325
    .line 326
    move v12, v7

    .line 327
    :cond_3
    invoke-virtual {v2, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v11

    .line 331
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    sget-object v13, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 335
    .line 336
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-static {v11}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    move v11, v12

    .line 343
    goto :goto_1

    .line 344
    :cond_4
    :goto_2
    const-wide v11, -0x105cc1b858845L

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-nez v2, :cond_5

    .line 358
    .line 359
    const-wide v11, -0x105d41b858845L

    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result p0

    .line 372
    if-nez p0, :cond_5

    .line 373
    .line 374
    goto/16 :goto_7

    .line 375
    .line 376
    :cond_5
    sput-object p1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛴᛷᛱ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;

    .line 377
    .line 378
    :try_start_0
    sget-object p0, Lxhss/ᲇᲀᛳᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲇᲀᛳᛸ;

    .line 379
    .line 380
    invoke-virtual {p0}, Lxhss/ᲇᲀᛳᛸ;->ᲇᛴᲇᛵ()V

    .line 381
    .line 382
    .line 383
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 384
    .line 385
    goto :goto_3

    .line 386
    :catchall_0
    move-exception p0

    .line 387
    new-instance v2, Lxhss/ᲈᛳᛱᲇ;

    .line 388
    .line 389
    invoke-direct {v2, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    move-object p0, v2

    .line 393
    :goto_3
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    if-eqz p0, :cond_8

    .line 398
    .line 399
    new-instance v2, Ljava/lang/StringBuilder;

    .line 400
    .line 401
    const-wide v11, -0x105db1b858845L

    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    invoke-static {v11, v12}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v7

    .line 410
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object p0

    .line 417
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    invoke-static {v3, v4}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    invoke-static {v5, v6}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-nez v2, :cond_6

    .line 435
    .line 436
    goto :goto_5

    .line 437
    :cond_6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    move v7, v10

    .line 442
    :goto_4
    if-ge v7, v2, :cond_8

    .line 443
    .line 444
    add-int/lit16 v11, v7, 0x7d0

    .line 445
    .line 446
    if-le v11, v2, :cond_7

    .line 447
    .line 448
    move v11, v2

    .line 449
    :cond_7
    invoke-virtual {p0, v7, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v7

    .line 453
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    sget-object v12, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 457
    .line 458
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-static {v7}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    move v7, v11

    .line 465
    goto :goto_4

    .line 466
    :cond_8
    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 467
    .line 468
    .line 469
    move-result-wide v11

    .line 470
    sub-long/2addr v11, v0

    .line 471
    new-instance p0, Ljava/lang/StringBuilder;

    .line 472
    .line 473
    const-wide v0, -0x105eb1b858845L

    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->getPackageName()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    const-wide v0, -0x105f11b858845L

    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {p0, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    const-wide v0, -0x105f81b858845L

    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    invoke-static {v3, v4, p0, v5, v6}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛴᛶᛳ(JLjava/lang/String;J)I

    .line 524
    .line 525
    .line 526
    move-result p1

    .line 527
    if-nez p1, :cond_9

    .line 528
    .line 529
    goto :goto_7

    .line 530
    :cond_9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 531
    .line 532
    .line 533
    move-result p1

    .line 534
    :goto_6
    if-ge v10, p1, :cond_b

    .line 535
    .line 536
    add-int/lit16 v0, v10, 0x7d0

    .line 537
    .line 538
    if-le v0, p1, :cond_a

    .line 539
    .line 540
    move v0, p1

    .line 541
    :cond_a
    invoke-virtual {p0, v10, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    invoke-static {v8, v9}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    sget-object v2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 549
    .line 550
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    invoke-static {v1}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    move v10, v0

    .line 557
    goto :goto_6

    .line 558
    :cond_b
    :goto_7
    return-void
.end method

.method public final ᛱᛱᛲᲇ(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xingin/xhss/ModuleMain;->cache:Z

    .line 2
    .line 3
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xingin/xhss/ModuleMain;->cache:Z

    .line 2
    .line 3
    return p0
.end method
