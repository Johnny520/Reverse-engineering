.class public final L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(Landroid/content/Context;)V
    .locals 11

    .line 1
    const/16 v0, 0x5fd

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    sput-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 22
    .line 23
    sput v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 24
    .line 25
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 26
    .line 27
    sput-object v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_7

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sget-object v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 46
    .line 47
    const-string v1, "\u7c7b\u52a0\u8f7d\u5668\u4e3aNull \u65e0\u6cd5\u8bbe\u7f6e"

    .line 48
    .line 49
    if-eqz v0, :cond_d

    .line 50
    .line 51
    instance-of v3, v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    check-cast v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    sput-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    invoke-direct {v3, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 63
    .line 64
    .line 65
    sput-object v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 66
    .line 67
    :goto_0
    const-class v0, Ltop/suzhelan/qstory/hook/InjectHook;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 74
    .line 75
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏(Landroid/content/Context;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const/16 v3, 0x46

    .line 95
    .line 96
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v3, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 108
    .line 109
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    sput-object v0, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 113
    .line 114
    sput-object p0, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Landroid/content/Context;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v3, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 121
    .line 122
    if-eqz v0, :cond_c

    .line 123
    .line 124
    instance-of v1, v0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏哲兰;

    .line 125
    .line 126
    if-eqz v1, :cond_1

    .line 127
    .line 128
    check-cast v0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏哲兰;

    .line 129
    .line 130
    sput-object v0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏哲兰;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    new-instance v1, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏哲兰;

    .line 134
    .line 135
    invoke-direct {v1, v0}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 136
    .line 137
    .line 138
    sput-object v1, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏哲兰;

    .line 139
    .line 140
    :goto_1
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v1, "/XpHelper"

    .line 149
    .line 150
    invoke-static {v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sput-object v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 155
    .line 156
    sget-object v0, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    const/4 v3, 0x1

    .line 167
    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->activities:[Landroid/content/pm/ActivityInfo;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_6

    .line 172
    .line 173
    aget-object v0, v0, v2

    .line 174
    .line 175
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 176
    .line 177
    sput-object v0, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 178
    .line 179
    sget-object v0, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 180
    .line 181
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_2

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_2
    :try_start_2
    const-string v0, "android.app.ActivityThread"

    .line 189
    .line 190
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    const-string v1, "sCurrentActivityThread"

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 201
    .line 202
    .line 203
    const/4 v1, 0x0

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    const-string v4, "mInstrumentation"

    .line 213
    .line 214
    invoke-virtual {v1, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    check-cast v4, Landroid/app/Instrumentation;

    .line 226
    .line 227
    new-instance v5, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;

    .line 228
    .line 229
    invoke-direct {v5, v4}, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;-><init>(Landroid/app/Instrumentation;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0}, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-static {}, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 239
    .line 240
    .line 241
    :try_start_3
    invoke-static {}, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 242
    .line 243
    .line 244
    :catch_0
    :goto_2
    new-instance v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 245
    .line 246
    const-string v1, "DexKitCache"

    .line 247
    .line 248
    invoke-direct {v0, v1, v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;I)V

    .line 249
    .line 250
    .line 251
    const-string v1, "DexKitCacheProxy"

    .line 252
    .line 253
    const-string v4, "checkCacheExpired: Host version updated Cache cleaned old:"

    .line 254
    .line 255
    const/16 v5, 0x1c

    .line 256
    .line 257
    :try_start_4
    const-string v6, "version"

    .line 258
    .line 259
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    invoke-virtual {v8, v7, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 268
    .line 269
    .line 270
    move-result-object v7

    .line 271
    iget-object v8, v7, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 272
    .line 273
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 274
    .line 275
    if-lt v9, v5, :cond_3

    .line 276
    .line 277
    invoke-static {v7}, L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/pm/PackageInfo;)J

    .line 278
    .line 279
    .line 280
    move-result-wide v9

    .line 281
    goto :goto_3

    .line 282
    :catch_1
    move-exception v0

    .line 283
    goto :goto_4

    .line 284
    :cond_3
    iget v7, v7, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 285
    .line 286
    int-to-long v9, v7

    .line 287
    :goto_3
    new-instance v7, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    const-string v8, "_"

    .line 296
    .line 297
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v7, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    const-string v8, ""

    .line 308
    .line 309
    invoke-virtual {v0, v6, v8}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v8

    .line 313
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-eqz v9, :cond_4

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_4
    iget-object v9, v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 321
    .line 322
    invoke-virtual {v9}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->clear()Landroid/content/SharedPreferences$Editor;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v7, v6}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const-string v4, " new:"

    .line 337
    .line 338
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_1

    .line 349
    .line 350
    .line 351
    goto :goto_5

    .line 352
    :goto_4
    new-instance v4, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    const-string v6, "checkCacheExpired: "

    .line 355
    .line 356
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 371
    .line 372
    .line 373
    :goto_5
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    const/16 v1, 0x47

    .line 378
    .line 379
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    sput-object v0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 388
    .line 389
    sget-object v0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 390
    .line 391
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏(Landroid/content/Context;)V

    .line 392
    .line 393
    .line 394
    sget-object p0, Lcom/kongzue/dialogx/DialogX$THEME;->AUTO:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 395
    .line 396
    sput-object p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 397
    .line 398
    sget-object p0, Lcom/kongzue/dialogx/DialogX$IMPL_MODE;->WINDOW:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 399
    .line 400
    sput-object p0, L飘花落叶言楪哲世苏兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 401
    .line 402
    sget-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰哲世;

    .line 403
    .line 404
    invoke-static {}, L飘花落叶言苏哲子世兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世哲兰苏;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    const/16 v0, 0x107

    .line 409
    .line 410
    invoke-interface {p0, v0}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 411
    .line 412
    .line 413
    move-result-object p0

    .line 414
    new-instance v0, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 415
    .line 416
    invoke-direct {v0, v5}, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 417
    .line 418
    .line 419
    invoke-interface {p0, v0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 420
    .line 421
    .line 422
    sget-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;

    .line 423
    .line 424
    const/16 v0, 0x4e1

    .line 425
    .line 426
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    iget-object p0, p0, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 434
    .line 435
    invoke-virtual {p0, v0, v2}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->getBoolean(Ljava/lang/String;Z)Z

    .line 436
    .line 437
    .line 438
    move-result p0

    .line 439
    if-eqz p0, :cond_5

    .line 440
    .line 441
    goto/16 :goto_8

    .line 442
    .line 443
    :cond_5
    const-string p0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 444
    .line 445
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object p0

    .line 449
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世()L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    iget-object p0, p0, L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 457
    .line 458
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 459
    .line 460
    .line 461
    move-result p0

    .line 462
    if-gez p0, :cond_6

    .line 463
    .line 464
    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    .line 465
    .line 466
    .line 467
    :cond_6
    invoke-static {}, L飘花落叶言世哲兰楪子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Z

    .line 468
    .line 469
    .line 470
    move-result p0

    .line 471
    const/16 v0, 0x3e

    .line 472
    .line 473
    const-class v1, Landroid/app/Activity;

    .line 474
    .line 475
    if-nez p0, :cond_8

    .line 476
    .line 477
    invoke-static {}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 478
    .line 479
    .line 480
    move-result p0

    .line 481
    if-nez p0, :cond_7

    .line 482
    .line 483
    goto/16 :goto_8

    .line 484
    .line 485
    :cond_7
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object p0

    .line 489
    const-string v2, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 490
    .line 491
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 504
    .line 505
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v3

    .line 509
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    new-instance v3, Ljava/io/File;

    .line 514
    .line 515
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    invoke-static {v3}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪苏兰世哲(Ljava/io/File;)V

    .line 519
    .line 520
    .line 521
    new-instance v2, Ljava/io/File;

    .line 522
    .line 523
    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    invoke-static {v2}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪苏兰世哲(Ljava/io/File;)V

    .line 527
    .line 528
    .line 529
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object p0

    .line 533
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 534
    .line 535
    const/16 v2, 0x1a

    .line 536
    .line 537
    invoke-direct {v0, v2}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 538
    .line 539
    .line 540
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    invoke-static {v1, p0, v0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 545
    .line 546
    .line 547
    goto/16 :goto_8

    .line 548
    .line 549
    :cond_8
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    new-instance v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;

    .line 554
    .line 555
    const/16 v4, 0x1b

    .line 556
    .line 557
    invoke-direct {v0, v4}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 558
    .line 559
    .line 560
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-static {v1, p0, v0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 565
    .line 566
    .line 567
    :try_start_5
    new-instance p0, Ljava/io/File;

    .line 568
    .line 569
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏世兰()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    const/16 v1, 0x42

    .line 574
    .line 575
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 583
    .line 584
    .line 585
    move-result v0

    .line 586
    if-eqz v0, :cond_9

    .line 587
    .line 588
    goto :goto_6

    .line 589
    :cond_9
    invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 590
    .line 591
    .line 592
    :catch_2
    :goto_6
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏哲楪兰()Z

    .line 593
    .line 594
    .line 595
    move-result p0

    .line 596
    const/16 v0, 0x40

    .line 597
    .line 598
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 599
    .line 600
    if-eqz p0, :cond_a

    .line 601
    .line 602
    const/16 p0, 0x3f

    .line 603
    .line 604
    :try_start_6
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object p0

    .line 608
    invoke-static {p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    move-result-object p0

    .line 612
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    new-array v2, v2, [Ljava/lang/Class;

    .line 617
    .line 618
    invoke-static {p0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 619
    .line 620
    .line 621
    move-result-object p0

    .line 622
    new-instance v1, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;

    .line 623
    .line 624
    invoke-direct {v1, v3}, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 625
    .line 626
    .line 627
    new-instance v2, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪苏世哲兰;

    .line 628
    .line 629
    invoke-direct {v2, v1, v3}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言世兰子苏楪哲/飘花落叶言子楪苏世兰哲;I)V

    .line 630
    .line 631
    .line 632
    invoke-static {p0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    .line 633
    .line 634
    .line 635
    goto :goto_7

    .line 636
    :catch_3
    move-exception p0

    .line 637
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 642
    .line 643
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 648
    .line 649
    .line 650
    goto :goto_7

    .line 651
    :cond_a
    const/16 p0, 0x41

    .line 652
    .line 653
    :try_start_7
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object p0

    .line 657
    invoke-static {p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    move-result-object p0

    .line 661
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v1

    .line 665
    new-array v2, v2, [Ljava/lang/Class;

    .line 666
    .line 667
    invoke-static {p0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 668
    .line 669
    .line 670
    move-result-object p0

    .line 671
    new-instance v1, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;

    .line 672
    .line 673
    const/4 v2, 0x2

    .line 674
    invoke-direct {v1, v2}, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 675
    .line 676
    .line 677
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 678
    .line 679
    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 680
    .line 681
    .line 682
    new-instance v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;

    .line 683
    .line 684
    const/4 v5, 0x5

    .line 685
    invoke-direct {v4, v2, v5, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰哲世苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    invoke-static {p0, v4}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 693
    .line 694
    .line 695
    goto :goto_7

    .line 696
    :catch_4
    move-exception p0

    .line 697
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    sget-object v1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 702
    .line 703
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 708
    .line 709
    .line 710
    :goto_7
    invoke-static {}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 711
    .line 712
    .line 713
    move-result p0

    .line 714
    if-eqz p0, :cond_b

    .line 715
    .line 716
    new-instance p0, Ljava/lang/StringBuilder;

    .line 717
    .line 718
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 719
    .line 720
    .line 721
    invoke-static {}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲()Lcom/alibaba/fastjson2/JSONObject;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    new-instance v1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;

    .line 726
    .line 727
    const/16 v2, 0x12

    .line 728
    .line 729
    invoke-direct {v1, p0, v2}, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 730
    .line 731
    .line 732
    new-instance v2, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;

    .line 733
    .line 734
    invoke-direct {v2, v1, v3}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->forEach(Ljava/util/function/BiConsumer;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    sub-int/2addr v0, v3

    .line 745
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 746
    .line 747
    .line 748
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object p0

    .line 752
    const/16 v0, 0x510

    .line 753
    .line 754
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 758
    .line 759
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    invoke-static {p0, v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    :cond_b
    :goto_8
    return-void

    .line 767
    :catch_5
    move-exception p0

    .line 768
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 769
    .line 770
    .line 771
    return-void

    .line 772
    :catch_6
    move-exception p0

    .line 773
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 774
    .line 775
    .line 776
    return-void

    .line 777
    :cond_c
    new-instance p0, Ltop/sacz/xphelper/exception/ReflectException;

    .line 778
    .line 779
    invoke-direct {p0, v1}, Ltop/sacz/xphelper/exception/ReflectException;-><init>(Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    throw p0

    .line 783
    :cond_d
    new-instance p0, Llin/util/ReflectUtils/ReflectException;

    .line 784
    .line 785
    invoke-direct {p0, v1}, Llin/util/ReflectUtils/ReflectException;-><init>(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    throw p0

    .line 789
    :catch_7
    move-exception p0

    .line 790
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 791
    .line 792
    .line 793
    return-void
.end method
