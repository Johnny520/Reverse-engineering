.class public final L飘花落叶言苏世楪子哲兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(Landroid/content/Context;)V
    .locals 11

    .line 1
    const-wide v0, -0x36a59485051405a7L    # -2.356728950950101E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    sput-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 25
    .line 26
    sput v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 27
    .line 28
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 29
    .line 30
    sput-object v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget-object v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 49
    .line 50
    const-string v1, "\u7c7b\u52a0\u8f7d\u5668\u4e3aNull \u65e0\u6cd5\u8bbe\u7f6e"

    .line 51
    .line 52
    if-eqz v0, :cond_c

    .line 53
    .line 54
    instance-of v3, v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 55
    .line 56
    if-eqz v3, :cond_0

    .line 57
    .line 58
    check-cast v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    sput-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-instance v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    invoke-direct {v3, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 66
    .line 67
    .line 68
    sput-object v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    :goto_0
    const-class v0, Ltop/suzhelan/qstory/hook/InjectHook;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 77
    .line 78
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏楪世哲兰(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-wide v3, -0x36a500d6051405a7L    # -2.4081891727348207E45

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const-wide v3, -0x36a5ef5c051405a7L    # -2.3250758851791154E45

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    sput-object v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 124
    .line 125
    sput-object p0, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sget-object v3, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 132
    .line 133
    if-eqz v0, :cond_b

    .line 134
    .line 135
    instance-of v1, v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;

    .line 136
    .line 137
    if-eqz v1, :cond_1

    .line 138
    .line 139
    check-cast v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;

    .line 140
    .line 141
    sput-object v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    new-instance v1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;

    .line 145
    .line 146
    invoke-direct {v1, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 147
    .line 148
    .line 149
    sput-object v1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏哲兰;

    .line 150
    .line 151
    :goto_1
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    const-string v1, "/XpHelper"

    .line 160
    .line 161
    invoke-static {v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sput-object v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 166
    .line 167
    sget-object v0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    const/4 v3, 0x1

    .line 178
    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_6

    .line 183
    .line 184
    aget-object v0, v0, v2

    .line 185
    .line 186
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 187
    .line 188
    sput-object v0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 189
    .line 190
    sget-object v0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 191
    .line 192
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_2

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_2
    :try_start_2
    const-string v0, "android.app.ActivityThread"

    .line 200
    .line 201
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    const-string v1, "sCurrentActivityThread"

    .line 206
    .line 207
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 212
    .line 213
    .line 214
    const/4 v1, 0x0

    .line 215
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const-string v4, "mInstrumentation"

    .line 224
    .line 225
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    check-cast v4, Landroid/app/Instrumentation;

    .line 237
    .line 238
    new-instance v5, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世苏哲兰;

    .line 239
    .line 240
    invoke-direct {v5, v4}, L飘花落叶言苏楪世兰哲子/飘花落叶言子楪世苏哲兰;-><init>(Landroid/app/Instrumentation;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    invoke-static {v0}, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    invoke-static {}, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 250
    .line 251
    .line 252
    :try_start_3
    invoke-static {}, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 253
    .line 254
    .line 255
    :catch_0
    :goto_2
    new-instance v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 256
    .line 257
    const-string v1, "DexKitCache"

    .line 258
    .line 259
    invoke-direct {v0, v1, v2}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;I)V

    .line 260
    .line 261
    .line 262
    const-string v1, "DexKitCacheProxy"

    .line 263
    .line 264
    const-string v4, "checkCacheExpired: Host version updated Cache cleaned old:"

    .line 265
    .line 266
    const/16 v5, 0x1c

    .line 267
    .line 268
    :try_start_4
    const-string v6, "version"

    .line 269
    .line 270
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v7

    .line 274
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    invoke-virtual {v8, v7, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 283
    .line 284
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 285
    .line 286
    if-lt v9, v5, :cond_3

    .line 287
    .line 288
    invoke-static {v7}, L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/pm/PackageInfo;)J

    .line 289
    .line 290
    .line 291
    move-result-wide v9

    .line 292
    goto :goto_3

    .line 293
    :catch_1
    move-exception v0

    .line 294
    goto :goto_4

    .line 295
    :cond_3
    iget v7, v7, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 296
    .line 297
    int-to-long v9, v7

    .line 298
    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v8, "_"

    .line 307
    .line 308
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    const-string v8, ""

    .line 319
    .line 320
    invoke-virtual {v0, v6, v8}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v9

    .line 328
    if-eqz v9, :cond_4

    .line 329
    .line 330
    goto :goto_5

    .line 331
    :cond_4
    iget-object v9, v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 332
    .line 333
    invoke-virtual {v9}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->clear()Landroid/content/SharedPreferences$Editor;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v7, v6}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    new-instance v0, Ljava/lang/StringBuilder;

    .line 340
    .line 341
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    const-string v4, " new:"

    .line 348
    .line 349
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_1

    .line 360
    .line 361
    .line 362
    goto :goto_5

    .line 363
    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    const-string v6, "checkCacheExpired: "

    .line 366
    .line 367
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 382
    .line 383
    .line 384
    :goto_5
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    const-wide v6, -0x36a500d9051405a7L    # -2.4081850893464177E45

    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    sput-object v0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 402
    .line 403
    sget-object v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪兰子苏/飘花落叶言子楪世苏哲兰;

    .line 404
    .line 405
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏(Landroid/content/Context;)V

    .line 406
    .line 407
    .line 408
    sget-object p0, Lcom/kongzue/dialogx/DialogX$THEME;->AUTO:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 409
    .line 410
    sput-object p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 411
    .line 412
    sget-object p0, Lcom/kongzue/dialogx/DialogX$IMPL_MODE;->WINDOW:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 413
    .line 414
    sput-object p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 415
    .line 416
    sget-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪子兰苏/飘花落叶言子楪哲世苏兰;

    .line 417
    .line 418
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    const/16 v0, 0x106

    .line 423
    .line 424
    invoke-interface {p0, v0}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    new-instance v0, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 429
    .line 430
    invoke-direct {v0, v5}, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 431
    .line 432
    .line 433
    invoke-interface {p0, v0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 434
    .line 435
    .line 436
    sget-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 437
    .line 438
    const-wide v0, -0x36a5700b051405a7L    # -2.369439177919332E45

    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    iget-object p0, p0, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 451
    .line 452
    invoke-virtual {p0, v0, v2}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->getBoolean(Ljava/lang/String;Z)Z

    .line 453
    .line 454
    .line 455
    move-result p0

    .line 456
    if-eqz p0, :cond_5

    .line 457
    .line 458
    goto/16 :goto_8

    .line 459
    .line 460
    :cond_5
    const-wide v0, -0x36a59470051405a7L    # -2.3567575346689224E45

    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p0

    .line 469
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    invoke-static {}, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Z

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    const-wide v0, -0x36a50182051405a7L    # -2.407955058466379E45

    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    const-class v4, Landroid/app/Activity;

    .line 482
    .line 483
    if-nez p0, :cond_7

    .line 484
    .line 485
    invoke-static {}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 486
    .line 487
    .line 488
    move-result p0

    .line 489
    if-nez p0, :cond_6

    .line 490
    .line 491
    goto/16 :goto_8

    .line 492
    .line 493
    :cond_6
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    const-wide v2, -0x36a5019e051405a7L    # -2.407916946841284E45

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    const-wide v5, -0x36a50185051405a7L    # -2.407950975077976E45

    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    new-instance v3, Ljava/io/File;

    .line 528
    .line 529
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    invoke-static {v3}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/io/File;)V

    .line 533
    .line 534
    .line 535
    new-instance v2, Ljava/io/File;

    .line 536
    .line 537
    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    invoke-static {v2}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰(Ljava/io/File;)V

    .line 541
    .line 542
    .line 543
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 548
    .line 549
    const/16 v1, 0x1a

    .line 550
    .line 551
    invoke-direct {v0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 552
    .line 553
    .line 554
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    invoke-static {v4, p0, v0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 559
    .line 560
    .line 561
    goto/16 :goto_8

    .line 562
    .line 563
    :cond_7
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object p0

    .line 567
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 568
    .line 569
    const/16 v1, 0x1b

    .line 570
    .line 571
    invoke-direct {v0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 572
    .line 573
    .line 574
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    invoke-static {v4, p0, v0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 579
    .line 580
    .line 581
    :try_start_5
    new-instance p0, Ljava/io/File;

    .line 582
    .line 583
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    const-wide v4, -0x36a50101051405a7L    # -2.4081306441677103E45

    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 600
    .line 601
    .line 602
    move-result v0

    .line 603
    if-eqz v0, :cond_8

    .line 604
    .line 605
    goto :goto_6

    .line 606
    :cond_8
    invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 607
    .line 608
    .line 609
    :catch_2
    :goto_6
    invoke-static {}, L飘花落叶言世子哲苏兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲()Z

    .line 610
    .line 611
    .line 612
    move-result p0

    .line 613
    const-wide v0, -0x36a50134051405a7L    # -2.4080612265648585E45

    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    const-wide v4, -0x36a5014d051405a7L    # -2.4080271983281664E45

    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    if-eqz p0, :cond_9

    .line 624
    .line 625
    const-wide v6, -0x36a50171051405a7L    # -2.4079781976673298E45

    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    :try_start_6
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object p0

    .line 634
    invoke-static {p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v4

    .line 642
    new-array v2, v2, [Ljava/lang/Class;

    .line 643
    .line 644
    invoke-static {p0, v4, v2}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 645
    .line 646
    .line 647
    move-result-object p0

    .line 648
    new-instance v2, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲兰苏;

    .line 649
    .line 650
    invoke-direct {v2, v3}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 651
    .line 652
    .line 653
    new-instance v4, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏世哲兰;

    .line 654
    .line 655
    invoke-direct {v4, v2, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏世兰哲;I)V

    .line 656
    .line 657
    .line 658
    invoke-static {p0, v4}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 659
    .line 660
    .line 661
    goto :goto_7

    .line 662
    :catch_3
    move-exception p0

    .line 663
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 668
    .line 669
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 674
    .line 675
    .line 676
    goto :goto_7

    .line 677
    :cond_9
    const-wide v6, -0x36a5013e051405a7L    # -2.4080476152701816E45

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    :try_start_7
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    invoke-static {p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 687
    .line 688
    .line 689
    move-result-object p0

    .line 690
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v4

    .line 694
    new-array v2, v2, [Ljava/lang/Class;

    .line 695
    .line 696
    invoke-static {p0, v4, v2}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 697
    .line 698
    .line 699
    move-result-object p0

    .line 700
    new-instance v2, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲兰苏;

    .line 701
    .line 702
    const/4 v4, 0x2

    .line 703
    invoke-direct {v2, v4}, L飘花落叶言世兰苏楪子哲/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 704
    .line 705
    .line 706
    new-instance v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 707
    .line 708
    invoke-direct {v4}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 709
    .line 710
    .line 711
    new-instance v5, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;

    .line 712
    .line 713
    const/4 v6, 0x5

    .line 714
    invoke-direct {v5, v4, v6, v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    invoke-static {p0, v5}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 718
    .line 719
    .line 720
    move-result-object p0

    .line 721
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 722
    .line 723
    .line 724
    goto :goto_7

    .line 725
    :catch_4
    move-exception p0

    .line 726
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 731
    .line 732
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 737
    .line 738
    .line 739
    :goto_7
    invoke-static {}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 740
    .line 741
    .line 742
    move-result p0

    .line 743
    if-eqz p0, :cond_a

    .line 744
    .line 745
    new-instance p0, Ljava/lang/StringBuilder;

    .line 746
    .line 747
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 748
    .line 749
    .line 750
    invoke-static {}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪兰哲苏世()Lcom/alibaba/fastjson2/JSONObject;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    new-instance v1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;

    .line 755
    .line 756
    const/16 v2, 0x12

    .line 757
    .line 758
    invoke-direct {v1, p0, v2}, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 759
    .line 760
    .line 761
    new-instance v2, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;

    .line 762
    .line 763
    invoke-direct {v2, v1, v3}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->forEach(Ljava/util/function/BiConsumer;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 770
    .line 771
    .line 772
    move-result v0

    .line 773
    sub-int/2addr v0, v3

    .line 774
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object p0

    .line 781
    const-wide v0, -0x36a57c83051405a7L    # -2.3650944526584854E45

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    const-wide v0, -0x36a5018b051405a7L    # -2.40794280830117E45

    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 799
    .line 800
    .line 801
    :cond_a
    :goto_8
    return-void

    .line 802
    :catch_5
    move-exception p0

    .line 803
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 804
    .line 805
    .line 806
    return-void

    .line 807
    :catch_6
    move-exception p0

    .line 808
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 809
    .line 810
    .line 811
    return-void

    .line 812
    :cond_b
    new-instance p0, Ltop/sacz/xphelper/exception/ReflectException;

    .line 813
    .line 814
    invoke-direct {p0, v1}, Ltop/sacz/xphelper/exception/ReflectException;-><init>(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    throw p0

    .line 818
    :cond_c
    new-instance p0, Llin/util/ReflectUtils/ReflectException;

    .line 819
    .line 820
    invoke-direct {p0, v1}, Llin/util/ReflectUtils/ReflectException;-><init>(Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    throw p0

    .line 824
    :catch_7
    move-exception p0

    .line 825
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 826
    .line 827
    .line 828
    return-void
.end method
