.class public final Lha/f0;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lha/g0;


# direct methods
.method public synthetic constructor <init>(Lha/g0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lha/f0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lha/f0;->b:Lha/g0;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Lha/f0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lha/f0;->b:Lha/g0;

    .line 14
    .line 15
    iget-object v0, v0, Lha/g0;->b:Landroid/content/SharedPreferences;

    .line 16
    .line 17
    const-string v1, "original_moments_upload_enable"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-static {p1}, Ltf/l;->z0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object p1, v0

    .line 38
    :goto_0
    instance-of v1, p1, Landroid/content/Intent;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    move-object v0, p1

    .line 43
    check-cast v0, Landroid/content/Intent;

    .line 44
    .line 45
    :cond_2
    if-eqz v0, :cond_3

    .line 46
    .line 47
    const-string p1, "CropImage_Compress_Img"

    .line 48
    .line 49
    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    const-string p1, "key_delete_origin_file"

    .line 53
    .line 54
    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_1
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    iget v0, p0, Lha/f0;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lha/f0;->b:Lha/g0;

    .line 10
    .line 11
    iget-object v0, v0, Lha/g0;->b:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    const-string v1, "original_moments_upload_enable"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_d

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lha/f0;->b:Lha/g0;

    .line 25
    .line 26
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 27
    .line 28
    if-eqz v1, :cond_10

    .line 29
    .line 30
    array-length v3, v1

    .line 31
    const/4 v4, 0x3

    .line 32
    if-ge v3, v4, :cond_1

    .line 33
    .line 34
    goto/16 :goto_d

    .line 35
    .line 36
    :cond_1
    aget-object v3, v1, v2

    .line 37
    .line 38
    instance-of v4, v3, Ljava/lang/String;

    .line 39
    .line 40
    const/4 v5, 0x0

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    check-cast v3, Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v3, v5

    .line 47
    :goto_0
    if-eqz v3, :cond_10

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    aget-object v6, v1, v4

    .line 51
    .line 52
    instance-of v7, v6, Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v7, :cond_3

    .line 55
    .line 56
    check-cast v6, Ljava/lang/String;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v6, v5

    .line 60
    :goto_1
    if-eqz v6, :cond_10

    .line 61
    .line 62
    const/4 v7, 0x2

    .line 63
    aget-object v1, v1, v7

    .line 64
    .line 65
    instance-of v7, v1, Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v7, :cond_4

    .line 68
    .line 69
    check-cast v1, Ljava/lang/String;

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    move-object v1, v5

    .line 73
    :goto_2
    if-eqz v1, :cond_10

    .line 74
    .line 75
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_10

    .line 80
    .line 81
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_10

    .line 86
    .line 87
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_5

    .line 92
    .line 93
    goto/16 :goto_d

    .line 94
    .line 95
    :cond_5
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    :try_start_0
    iget-object v8, v0, Lha/g0;->f:Ljava/lang/reflect/Method;

    .line 100
    .line 101
    if-eqz v8, :cond_6

    .line 102
    .line 103
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-static {v8, v5, v7}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    goto :goto_4

    .line 122
    :catchall_0
    move-exception v7

    .line 123
    goto :goto_3

    .line 124
    :cond_6
    move v7, v2

    .line 125
    goto :goto_6

    .line 126
    :goto_3
    new-instance v8, Lsf/f;

    .line 127
    .line 128
    invoke-direct {v8, v7}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    move-object v7, v8

    .line 132
    :goto_4
    invoke-static {v7}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    if-nez v8, :cond_7

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_7
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    const-string v9, "[Hchat:OriginalMomentsUpload] \u539f\u56fe\u65e0\u538b\u7f29\u8f6c\u6362\u5931\u8d25: "

    .line 144
    .line 145
    invoke-static {v9, v7, v8}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 149
    .line 150
    :goto_5
    check-cast v7, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    :goto_6
    if-eqz v7, :cond_8

    .line 157
    .line 158
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_d

    .line 164
    .line 165
    :cond_8
    const-class v7, Ljava/lang/String;

    .line 166
    .line 167
    :try_start_1
    iget-object v0, v0, Lha/g0;->a:Lr8/g;

    .line 168
    .line 169
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 170
    .line 171
    const-string v8, "com.tencent.mm.vfs.w6"

    .line 172
    .line 173
    invoke-static {v8, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_f

    .line 178
    .line 179
    const-string v8, "j"

    .line 180
    .line 181
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    invoke-static {v0, v8, v9}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    const-string v9, "u"

    .line 190
    .line 191
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-static {v0, v9, v10}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    const-string v10, "c"

    .line 200
    .line 201
    filled-new-array {v7, v7}, [Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    invoke-static {v0, v10, v11}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    const-string v11, "k"

    .line 210
    .line 211
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-static {v0, v11, v7}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    if-eqz v8, :cond_f

    .line 220
    .line 221
    if-eqz v9, :cond_f

    .line 222
    .line 223
    if-eqz v10, :cond_f

    .line 224
    .line 225
    if-nez v0, :cond_9

    .line 226
    .line 227
    goto/16 :goto_c

    .line 228
    .line 229
    :cond_9
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-static {v8, v5, v7}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v7

    .line 243
    if-nez v7, :cond_a

    .line 244
    .line 245
    goto :goto_c

    .line 246
    :cond_a
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    invoke-static {v9, v5, v7}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    filled-new-array {v6, v1}, [Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    invoke-static {v10, v5, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v0, v5, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    instance-of v1, v0, Ljava/lang/Number;

    .line 273
    .line 274
    if-eqz v1, :cond_b

    .line 275
    .line 276
    move-object v5, v0

    .line 277
    check-cast v5, Ljava/lang/Number;

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :catchall_1
    move-exception v0

    .line 281
    goto :goto_9

    .line 282
    :cond_b
    :goto_7
    const-wide/16 v0, 0x0

    .line 283
    .line 284
    if-eqz v5, :cond_c

    .line 285
    .line 286
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 287
    .line 288
    .line 289
    move-result-wide v5

    .line 290
    goto :goto_8

    .line 291
    :cond_c
    move-wide v5, v0

    .line 292
    :goto_8
    cmp-long v0, v5, v0

    .line 293
    .line 294
    if-lez v0, :cond_d

    .line 295
    .line 296
    move v2, v4

    .line 297
    :cond_d
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 301
    goto :goto_a

    .line 302
    :goto_9
    new-instance v1, Lsf/f;

    .line 303
    .line 304
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    move-object v0, v1

    .line 308
    :goto_a
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    if-nez v1, :cond_e

    .line 313
    .line 314
    goto :goto_b

    .line 315
    :cond_e
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    const-string v2, "[Hchat:OriginalMomentsUpload] \u539f\u56fe\u590d\u5236\u5931\u8d25: "

    .line 320
    .line 321
    invoke-static {v2, v0, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 322
    .line 323
    .line 324
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 325
    .line 326
    :goto_b
    check-cast v0, Ljava/lang/Boolean;

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    :cond_f
    :goto_c
    if-eqz v2, :cond_10

    .line 333
    .line 334
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 335
    .line 336
    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_10
    :goto_d
    return-void

    .line 340
    :pswitch_0
    iget-object v0, p0, Lha/f0;->b:Lha/g0;

    .line 341
    .line 342
    iget-object v0, v0, Lha/g0;->b:Landroid/content/SharedPreferences;

    .line 343
    .line 344
    const-string v1, "original_moments_upload_enable"

    .line 345
    .line 346
    const/4 v2, 0x0

    .line 347
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-nez v0, :cond_11

    .line 352
    .line 353
    goto :goto_f

    .line 354
    :cond_11
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 355
    .line 356
    if-eqz p1, :cond_16

    .line 357
    .line 358
    array-length v0, p1

    .line 359
    const/4 v1, 0x3

    .line 360
    if-ge v0, v1, :cond_12

    .line 361
    .line 362
    goto :goto_f

    .line 363
    :cond_12
    aget-object v0, p1, v2

    .line 364
    .line 365
    instance-of v0, v0, Landroid/content/Intent;

    .line 366
    .line 367
    if-nez v0, :cond_13

    .line 368
    .line 369
    goto :goto_f

    .line 370
    :cond_13
    const/4 v0, 0x1

    .line 371
    aget-object v1, p1, v0

    .line 372
    .line 373
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 374
    .line 375
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    if-eqz v1, :cond_14

    .line 380
    .line 381
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 382
    .line 383
    aput-object v1, p1, v0

    .line 384
    .line 385
    const/4 v0, 0x2

    .line 386
    aput-object v1, p1, v0

    .line 387
    .line 388
    :cond_14
    aget-object p1, p1, v2

    .line 389
    .line 390
    instance-of v0, p1, Landroid/content/Intent;

    .line 391
    .line 392
    if-eqz v0, :cond_15

    .line 393
    .line 394
    check-cast p1, Landroid/content/Intent;

    .line 395
    .line 396
    goto :goto_e

    .line 397
    :cond_15
    const/4 p1, 0x0

    .line 398
    :goto_e
    if-eqz p1, :cond_16

    .line 399
    .line 400
    const-string v0, "CropImage_Compress_Img"

    .line 401
    .line 402
    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 403
    .line 404
    .line 405
    :cond_16
    :goto_f
    return-void

    .line 406
    nop

    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
