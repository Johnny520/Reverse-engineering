.class public final L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static 飘花落叶言子楪世苏哲兰(Landroid/content/Context;)V
    .locals 12

    .line 1
    const/16 v0, 0x66a

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    sput-object p0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

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
    sput v1, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 24
    .line 25
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 26
    .line 27
    sput-object v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;
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
    sput-object v0, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

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
    sget-object v1, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 46
    .line 47
    const-string v1, "\u7c7b\u52a0\u8f7d\u5668\u4e3aNull \u65e0\u6cd5\u8bbe\u7f6e"

    .line 48
    .line 49
    if-eqz v0, :cond_d

    .line 50
    .line 51
    instance-of v3, v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 52
    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    check-cast v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    sput-object v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    invoke-direct {v3, v0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 63
    .line 64
    .line 65
    sput-object v3, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏哲兰;

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
    sput-object v0, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 74
    .line 75
    invoke-static {p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲(Landroid/content/Context;)V

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
    const/16 v3, 0x66b

    .line 95
    .line 96
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

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
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    sput-object v0, L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 113
    .line 114
    sput-object p0, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/content/Context;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v3, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 121
    .line 122
    if-eqz v0, :cond_c

    .line 123
    .line 124
    instance-of v1, v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;

    .line 125
    .line 126
    if-eqz v1, :cond_1

    .line 127
    .line 128
    check-cast v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;

    .line 129
    .line 130
    sput-object v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    new-instance v1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;

    .line 134
    .line 135
    invoke-direct {v1, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 136
    .line 137
    .line 138
    sput-object v1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;

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
    sput-object v0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 155
    .line 156
    sget-object v0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    sput-object v0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 178
    .line 179
    sget-object v0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

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
    new-instance v5, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;

    .line 228
    .line 229
    invoke-direct {v5, v4}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;-><init>(Landroid/app/Instrumentation;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0}, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-static {}, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 239
    .line 240
    .line 241
    :try_start_3
    invoke-static {}, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 242
    .line 243
    .line 244
    :catch_0
    :goto_2
    new-instance v0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 245
    .line 246
    const-string v1, "DexKitCache"

    .line 247
    .line 248
    const-string v4, ""

    .line 249
    .line 250
    invoke-direct {v0, v1, v4}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    const-string v1, "DexKitCacheProxy"

    .line 254
    .line 255
    const-string v5, "checkCacheExpired: Host version updated Cache cleaned old:"

    .line 256
    .line 257
    const/16 v6, 0x1c

    .line 258
    .line 259
    :try_start_4
    const-string v7, "version"

    .line 260
    .line 261
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 266
    .line 267
    .line 268
    move-result-object v9

    .line 269
    invoke-virtual {v9, v8, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 270
    .line 271
    .line 272
    move-result-object v8

    .line 273
    iget-object v9, v8, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 274
    .line 275
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 276
    .line 277
    if-lt v10, v6, :cond_3

    .line 278
    .line 279
    invoke-static {v8}, L飘花落叶言楪世苏哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/pm/PackageInfo;)J

    .line 280
    .line 281
    .line 282
    move-result-wide v10

    .line 283
    goto :goto_3

    .line 284
    :catch_1
    move-exception v0

    .line 285
    goto :goto_4

    .line 286
    :cond_3
    iget v8, v8, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 287
    .line 288
    int-to-long v10, v8

    .line 289
    :goto_3
    new-instance v8, Ljava/lang/StringBuilder;

    .line 290
    .line 291
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v9, "_"

    .line 298
    .line 299
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v8, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v8

    .line 309
    invoke-virtual {v0, v7, v4}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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
    iget-object v9, v0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;

    .line 321
    .line 322
    invoke-virtual {v9}, L飘花落叶言楪兰世子哲苏/飘花落叶言子楪哲世苏兰;->clear()Landroid/content/SharedPreferences$Editor;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v8, v7}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    new-instance v0, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    const-string v5, "checkCacheExpired: "

    .line 355
    .line 356
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 374
    .line 375
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 376
    .line 377
    .line 378
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    const/16 v1, 0x66c

    .line 386
    .line 387
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    sput-object v0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 399
    .line 400
    sget-object v0, L飘花落叶言楪哲苏子兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/jvm/internal/types/飘花落叶言子楪世兰苏哲;

    .line 401
    .line 402
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏(Landroid/content/Context;)V

    .line 403
    .line 404
    .line 405
    sget-object p0, Lcom/kongzue/dialogx/DialogX$THEME;->AUTO:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 406
    .line 407
    sput-object p0, L飘花落叶言楪哲苏子兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/kongzue/dialogx/DialogX$THEME;

    .line 408
    .line 409
    sget-object p0, Lcom/kongzue/dialogx/DialogX$IMPL_MODE;->WINDOW:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 410
    .line 411
    sput-object p0, L飘花落叶言楪哲苏子兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    .line 412
    .line 413
    sget-object p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏兰哲世;

    .line 414
    .line 415
    invoke-static {}, L飘花落叶言苏哲楪兰世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    const/16 v0, 0x108

    .line 420
    .line 421
    invoke-interface {p0, v0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(I)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 422
    .line 423
    .line 424
    move-result-object p0

    .line 425
    new-instance v0, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 426
    .line 427
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 428
    .line 429
    .line 430
    invoke-interface {p0, v0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(Lretrofit2/飘花落叶言子楪苏世兰哲;)V

    .line 431
    .line 432
    .line 433
    sget-object p0, L飘花落叶言世哲楪兰苏子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 434
    .line 435
    const/16 v0, 0x4c5

    .line 436
    .line 437
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {p0, v0, v2}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Z)Z

    .line 442
    .line 443
    .line 444
    move-result p0

    .line 445
    if-eqz p0, :cond_5

    .line 446
    .line 447
    goto/16 :goto_8

    .line 448
    .line 449
    :cond_5
    const-string p0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 450
    .line 451
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    invoke-static {p0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏()L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    iget-object p0, p0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Integer;

    .line 463
    .line 464
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result p0

    .line 468
    if-gez p0, :cond_6

    .line 469
    .line 470
    invoke-static {v2}, Ljava/lang/System;->exit(I)V

    .line 471
    .line 472
    .line 473
    :cond_6
    invoke-static {}, L飘花落叶言世兰子楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Z

    .line 474
    .line 475
    .line 476
    move-result p0

    .line 477
    const/16 v0, 0x3d

    .line 478
    .line 479
    const-class v1, Landroid/app/Activity;

    .line 480
    .line 481
    if-nez p0, :cond_8

    .line 482
    .line 483
    invoke-static {}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()Z

    .line 484
    .line 485
    .line 486
    move-result p0

    .line 487
    if-nez p0, :cond_7

    .line 488
    .line 489
    goto/16 :goto_8

    .line 490
    .line 491
    :cond_7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 492
    .line 493
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 494
    .line 495
    .line 496
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v2

    .line 500
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    const-string v2, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 504
    .line 505
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 510
    .line 511
    .line 512
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    new-instance v2, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 519
    .line 520
    .line 521
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    const-string v3, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c"

    .line 529
    .line 530
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    new-instance v3, Ljava/io/File;

    .line 542
    .line 543
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-static {v3}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)V

    .line 547
    .line 548
    .line 549
    new-instance v2, Ljava/io/File;

    .line 550
    .line 551
    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    invoke-static {v2}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世(Ljava/io/File;)V

    .line 555
    .line 556
    .line 557
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object p0

    .line 561
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏兰世;

    .line 562
    .line 563
    invoke-direct {v0, v6}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 564
    .line 565
    .line 566
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v0

    .line 570
    invoke-static {v1, p0, v0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 571
    .line 572
    .line 573
    goto/16 :goto_8

    .line 574
    .line 575
    :cond_8
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object p0

    .line 579
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏兰世;

    .line 580
    .line 581
    const/16 v4, 0x1d

    .line 582
    .line 583
    invoke-direct {v0, v4}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 584
    .line 585
    .line 586
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    invoke-static {v1, p0, v0}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 591
    .line 592
    .line 593
    :try_start_5
    new-instance p0, Ljava/io/File;

    .line 594
    .line 595
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    const/16 v1, 0x41

    .line 600
    .line 601
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    if-eqz v0, :cond_9

    .line 613
    .line 614
    goto :goto_6

    .line 615
    :cond_9
    invoke-virtual {p0}, Ljava/io/File;->createNewFile()Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 616
    .line 617
    .line 618
    :catch_2
    :goto_6
    invoke-static {}, Lkotlin/collections/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏哲兰()Z

    .line 619
    .line 620
    .line 621
    move-result p0

    .line 622
    const/16 v0, 0x3f

    .line 623
    .line 624
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 625
    .line 626
    if-eqz p0, :cond_a

    .line 627
    .line 628
    const/16 p0, 0x3e

    .line 629
    .line 630
    :try_start_6
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object p0

    .line 634
    invoke-static {p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v1

    .line 642
    new-array v2, v2, [Ljava/lang/Class;

    .line 643
    .line 644
    invoke-static {p0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 645
    .line 646
    .line 647
    move-result-object p0

    .line 648
    new-instance v1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;

    .line 649
    .line 650
    invoke-direct {v1, v6}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 651
    .line 652
    .line 653
    new-instance v2, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;

    .line 654
    .line 655
    invoke-direct {v2, v1, v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;-><init>(L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世兰哲;I)V

    .line 656
    .line 657
    .line 658
    invoke-static {p0, v2}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;
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
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 668
    .line 669
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 674
    .line 675
    .line 676
    goto :goto_7

    .line 677
    :cond_a
    const/16 p0, 0x40

    .line 678
    .line 679
    :try_start_7
    invoke-static {p0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object p0

    .line 683
    invoke-static {p0}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    move-result-object p0

    .line 687
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    new-array v2, v2, [Ljava/lang/Class;

    .line 692
    .line 693
    invoke-static {p0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->findMethodBestMatch(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 694
    .line 695
    .line 696
    move-result-object p0

    .line 697
    new-instance v1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;

    .line 698
    .line 699
    invoke-direct {v1, v4}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;-><init>(I)V

    .line 700
    .line 701
    .line 702
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 703
    .line 704
    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 705
    .line 706
    .line 707
    new-instance v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏哲世;

    .line 708
    .line 709
    const/4 v5, 0x5

    .line 710
    invoke-direct {v4, v2, v5, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏哲世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 711
    .line 712
    .line 713
    invoke-static {p0, v4}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 714
    .line 715
    .line 716
    move-result-object p0

    .line 717
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    .line 718
    .line 719
    .line 720
    goto :goto_7

    .line 721
    :catch_4
    move-exception p0

    .line 722
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    sget-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 727
    .line 728
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 733
    .line 734
    .line 735
    :goto_7
    invoke-static {}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()Z

    .line 736
    .line 737
    .line 738
    move-result p0

    .line 739
    if-eqz p0, :cond_b

    .line 740
    .line 741
    new-instance p0, Ljava/lang/StringBuilder;

    .line 742
    .line 743
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 744
    .line 745
    .line 746
    invoke-static {}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    new-instance v1, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;

    .line 751
    .line 752
    const/16 v2, 0x12

    .line 753
    .line 754
    invoke-direct {v1, p0, v2}, Landroidx/compose/foundation/layout/飘花落叶言子楪哲世苏兰;-><init>(Ljava/lang/Object;I)V

    .line 755
    .line 756
    .line 757
    new-instance v2, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;

    .line 758
    .line 759
    invoke-direct {v2, v1, v3}, Lorg/apache/commons/lang3/time/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;I)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0, v2}, Ljava/util/LinkedHashMap;->forEach(Ljava/util/function/BiConsumer;)V

    .line 763
    .line 764
    .line 765
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    sub-int/2addr v0, v3

    .line 770
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object p0

    .line 777
    const/16 v0, 0x4f4

    .line 778
    .line 779
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c"

    .line 783
    .line 784
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-static {p0, v0}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 789
    .line 790
    .line 791
    :cond_b
    :goto_8
    return-void

    .line 792
    :catch_5
    move-exception p0

    .line 793
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :catch_6
    move-exception p0

    .line 798
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 799
    .line 800
    .line 801
    return-void

    .line 802
    :cond_c
    new-instance p0, Ltop/sacz/xphelper/exception/ReflectException;

    .line 803
    .line 804
    invoke-direct {p0, v1}, Ltop/sacz/xphelper/exception/ReflectException;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    throw p0

    .line 808
    :cond_d
    new-instance p0, Llin/util/ReflectUtils/ReflectException;

    .line 809
    .line 810
    invoke-direct {p0, v1}, Llin/util/ReflectUtils/ReflectException;-><init>(Ljava/lang/String;)V

    .line 811
    .line 812
    .line 813
    throw p0

    .line 814
    :catch_7
    move-exception p0

    .line 815
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)V

    .line 816
    .line 817
    .line 818
    return-void
.end method
