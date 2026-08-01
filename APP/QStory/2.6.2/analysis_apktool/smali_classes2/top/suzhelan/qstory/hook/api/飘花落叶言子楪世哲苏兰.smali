.class public final Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

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
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 6
    .line 7
    const-wide v3, -0x36a5b59d051405a7L    # -2.3451974620998843E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    const-wide v10, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    iget-object v12, v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    sparse-switch v2, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :sswitch_0
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Class;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 46
    .line 47
    const-string v2, "androidx."

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    const-string v2, "android."

    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-nez v2, :cond_3

    .line 62
    .line 63
    const-string v2, "kotlin."

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_3

    .line 70
    .line 71
    const-string v2, "kotlinx."

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-nez v2, :cond_3

    .line 78
    .line 79
    const-string v2, "com.tencent.mmkv."

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-nez v2, :cond_3

    .line 86
    .line 87
    const-string v2, "com.android.tools.r8."

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    const-string v2, "com.google.android."

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_3

    .line 102
    .line 103
    const-string v2, "com.google.gson."

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_3

    .line 110
    .line 111
    const-string v2, "com.google.common."

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_3

    .line 118
    .line 119
    const-string v2, "com.microsoft.appcenter."

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_3

    .line 126
    .line 127
    const-string v2, "org.intellij.lang.annotations."

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_3

    .line 134
    .line 135
    const-string v2, "org.jetbrains.annotations."

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_1

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    if-eqz v1, :cond_3

    .line 149
    .line 150
    array-length v2, v1

    .line 151
    :goto_0
    if-ge v9, v2, :cond_3

    .line 152
    .line 153
    aget-object v3, v1, v9

    .line 154
    .line 155
    const-class v4, Landroid/hardware/SensorEventListener;

    .line 156
    .line 157
    if-ne v3, v4, :cond_2

    .line 158
    .line 159
    const-wide v3, -0x36a568f7051405a7L    # -2.371905544514775E45

    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    const-class v4, Landroid/hardware/SensorEvent;

    .line 169
    .line 170
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v0, v3, v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    move-object v4, v12

    .line 179
    check-cast v4, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪苏世哲兰;

    .line 180
    .line 181
    iget-object v4, v4, L飘花落叶言苏世哲子楪兰/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 182
    .line 183
    new-instance v5, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;

    .line 184
    .line 185
    const/16 v6, 0xc

    .line 186
    .line 187
    invoke-direct {v5, v6}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 188
    .line 189
    .line 190
    invoke-static {v3, v5}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 198
    .line 199
    goto :goto_0

    .line 200
    :cond_3
    :goto_1
    return-void

    .line 201
    :sswitch_1
    check-cast v12, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏兰哲世;

    .line 202
    .line 203
    :try_start_0
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    const-wide v2, -0x36a52424051405a7L    # -2.395887284605895E45

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iget-object v3, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 223
    .line 224
    iput-object v2, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 225
    .line 226
    new-array v2, v9, [Ljava/lang/Object;

    .line 227
    .line 228
    invoke-virtual {v1, v0, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    check-cast v1, Landroid/view/View;

    .line 233
    .line 234
    const-wide v2, -0x36a50a19051405a7L    # -2.4049619347669426E45

    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    sget-object v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-static {v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    if-eqz v0, :cond_6

    .line 262
    .line 263
    if-nez v1, :cond_4

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    const-wide v3, -0x36a50923051405a7L    # -2.4052967726159928E45

    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    iget-object v4, v2, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 284
    .line 285
    iput-object v3, v4, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 286
    .line 287
    new-array v3, v9, [Ljava/lang/Object;

    .line 288
    .line 289
    invoke-virtual {v2, v0, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    const-wide v2, -0x36a50910051405a7L    # -2.4053226340758788E45

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    const-class v3, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-static {v3, v2, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    check-cast v0, Ljava/util/ArrayList;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    if-eqz v2, :cond_6

    .line 319
    .line 320
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    const-wide v3, -0x36a50919051405a7L    # -2.4053103839106696E45

    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    invoke-static {v5, v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Ljava/lang/Integer;

    .line 338
    .line 339
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-gt v2, v6, :cond_5

    .line 344
    .line 345
    check-cast v1, Landroid/view/ViewGroup;

    .line 346
    .line 347
    invoke-virtual {v12, v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏(Landroid/view/ViewGroup;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 348
    .line 349
    .line 350
    goto :goto_2

    .line 351
    :catch_0
    move-exception v0

    .line 352
    invoke-virtual {v12}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    invoke-virtual {v1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 357
    .line 358
    .line 359
    :cond_6
    :goto_2
    return-void

    .line 360
    :sswitch_2
    const/high16 v0, 0x240f0000

    .line 361
    .line 362
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    const/16 v0, 0x520a

    .line 367
    .line 368
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v3

    .line 372
    check-cast v12, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰哲世;

    .line 373
    .line 374
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 375
    .line 376
    aget-object v0, v0, v9

    .line 377
    .line 378
    move-object v4, v0

    .line 379
    check-cast v4, Landroid/content/Context;

    .line 380
    .line 381
    invoke-static {v4}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏楪世哲兰(Landroid/content/Context;)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    move-object v1, v0

    .line 389
    check-cast v1, Ljava/util/List;

    .line 390
    .line 391
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    move-result-object v6

    .line 399
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v10

    .line 403
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    if-eqz v0, :cond_d

    .line 408
    .line 409
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    :try_start_1
    const-class v11, Ljava/util/List;

    .line 414
    .line 415
    invoke-static {v11, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Ljava/util/List;

    .line 420
    .line 421
    if-eqz v0, :cond_7

    .line 422
    .line 423
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 424
    .line 425
    .line 426
    move-result v11

    .line 427
    if-eqz v11, :cond_8

    .line 428
    .line 429
    :cond_7
    const/4 v9, 0x0

    .line 430
    goto/16 :goto_6

    .line 431
    .line 432
    :cond_8
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v11

    .line 436
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    move-result-object v11

    .line 440
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v11

    .line 444
    const-wide v13, -0x36a5001a051405a7L    # -2.4084450650747453E45

    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v13

    .line 453
    invoke-virtual {v11, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 454
    .line 455
    .line 456
    move-result v11

    .line 457
    if-nez v11, :cond_9

    .line 458
    .line 459
    goto :goto_3

    .line 460
    :cond_9
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    sget v11, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 469
    .line 470
    const/16 v13, 0x2832

    .line 471
    .line 472
    const-class v14, Ljava/lang/CharSequence;

    .line 473
    .line 474
    const-class v15, Landroid/content/Context;

    .line 475
    .line 476
    const v7, 0x2412001f

    .line 477
    .line 478
    .line 479
    if-lt v11, v13, :cond_a

    .line 480
    .line 481
    :try_start_2
    const-class v11, Ljava/lang/String;

    .line 482
    .line 483
    filled-new-array {v15, v5, v14, v5, v11}, [Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    move-result-object v11

    .line 487
    invoke-virtual {v4, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v13

    .line 491
    invoke-virtual {v4, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v7

    .line 495
    filled-new-array {v4, v3, v13, v2, v7}, [Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v7

    .line 499
    invoke-static {v7, v11, v0}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世兰楪苏哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v7

    .line 503
    goto :goto_4

    .line 504
    :catch_1
    move-exception v0

    .line 505
    const/4 v9, 0x0

    .line 506
    goto/16 :goto_7

    .line 507
    .line 508
    :cond_a
    filled-new-array {v15, v5, v14, v5}, [Ljava/lang/Class;

    .line 509
    .line 510
    .line 511
    move-result-object v11

    .line 512
    invoke-virtual {v4, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v7

    .line 516
    filled-new-array {v4, v3, v7, v2}, [Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v7

    .line 520
    invoke-static {v7, v11, v0}, L飘花落叶言世兰哲子楪苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子世兰楪苏哲([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    :goto_4
    new-instance v11, Ljava/util/ArrayList;

    .line 525
    .line 526
    new-instance v13, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 527
    .line 528
    const/16 v14, 0x1a

    .line 529
    .line 530
    invoke-direct {v13, v14}, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 531
    .line 532
    .line 533
    invoke-static {v0, v13}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰苏哲;)[Ljava/lang/reflect/Method;

    .line 534
    .line 535
    .line 536
    move-result-object v13

    .line 537
    invoke-static {v13}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 538
    .line 539
    .line 540
    move-result-object v13

    .line 541
    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 542
    .line 543
    .line 544
    new-instance v13, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 545
    .line 546
    const/16 v14, 0x1b

    .line 547
    .line 548
    invoke-direct {v13, v14}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 549
    .line 550
    .line 551
    invoke-static {v13}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 552
    .line 553
    .line 554
    move-result-object v13

    .line 555
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 556
    .line 557
    .line 558
    sget-object v13, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 559
    .line 560
    const-wide v14, -0x36a5003b051405a7L    # -2.4084001478023117E45

    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    invoke-static {v14, v15}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v14

    .line 569
    invoke-static {v14}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    move-result-object v14

    .line 573
    filled-new-array {v14}, [Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    move-result-object v14

    .line 577
    new-instance v15, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰世哲;

    .line 578
    .line 579
    invoke-direct {v15, v4}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰世哲;-><init>(Landroid/content/Context;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v13, v14, v15}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v13

    .line 586
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v11

    .line 590
    check-cast v11, Ljava/lang/reflect/Method;

    .line 591
    .line 592
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v13

    .line 596
    invoke-virtual {v11, v7, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    new-instance v11, Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    invoke-static {v4, v0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v7

    .line 611
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    invoke-static {v4, v0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v0

    .line 618
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 619
    .line 620
    .line 621
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    array-length v7, v0

    .line 626
    move v13, v9

    .line 627
    :goto_5
    if-ge v13, v7, :cond_c

    .line 628
    .line 629
    aget-object v14, v0, v13

    .line 630
    .line 631
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    move-result-object v15

    .line 635
    array-length v15, v15

    .line 636
    const/4 v9, 0x5

    .line 637
    if-ne v15, v9, :cond_b

    .line 638
    .line 639
    invoke-virtual {v14, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 640
    .line 641
    .line 642
    const/4 v0, 0x6

    .line 643
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 644
    .line 645
    .line 646
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 647
    const/4 v9, 0x0

    .line 648
    :try_start_3
    filled-new-array {v11, v9, v9, v0, v9}, [Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    invoke-virtual {v14, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-interface {v1, v8, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 657
    .line 658
    .line 659
    goto :goto_8

    .line 660
    :catch_2
    move-exception v0

    .line 661
    goto :goto_7

    .line 662
    :cond_b
    const/4 v9, 0x0

    .line 663
    add-int/lit8 v13, v13, 0x1

    .line 664
    .line 665
    const/4 v9, 0x0

    .line 666
    goto :goto_5

    .line 667
    :cond_c
    const/4 v9, 0x0

    .line 668
    new-instance v0, Llin/util/ReflectUtils/ReflectException;

    .line 669
    .line 670
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v7

    .line 674
    const-string v11, "\u67e5\u627e\u4e0d\u5230\u6307\u5b9a\u957f\u5ea6\u7684\u6784\u9020\u65b9\u6cd5 : "

    .line 675
    .line 676
    const-string v13, " \u60f3\u8981\u67e5\u627e\u7684\u957f\u5ea6 : 5"

    .line 677
    .line 678
    invoke-static {v11, v7, v13}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v7

    .line 682
    invoke-direct {v0, v7}, Llin/util/ReflectUtils/ReflectException;-><init>(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 686
    :goto_6
    const/4 v9, 0x0

    .line 687
    goto/16 :goto_3

    .line 688
    .line 689
    :goto_7
    invoke-virtual {v12}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 690
    .line 691
    .line 692
    move-result-object v7

    .line 693
    invoke-virtual {v7, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 694
    .line 695
    .line 696
    goto :goto_6

    .line 697
    :cond_d
    :goto_8
    return-void

    .line 698
    :sswitch_3
    const/4 v9, 0x0

    .line 699
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v0

    .line 709
    instance-of v2, v0, Ljava/util/List;

    .line 710
    .line 711
    if-eqz v2, :cond_e

    .line 712
    .line 713
    move-object v7, v0

    .line 714
    check-cast v7, Ljava/util/List;

    .line 715
    .line 716
    goto :goto_9

    .line 717
    :cond_e
    move-object v7, v9

    .line 718
    :goto_9
    if-nez v7, :cond_f

    .line 719
    .line 720
    goto :goto_a

    .line 721
    :cond_f
    check-cast v12, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;

    .line 722
    .line 723
    new-instance v0, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏兰哲;

    .line 724
    .line 725
    invoke-direct {v0, v12, v6}, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 726
    .line 727
    .line 728
    invoke-static {v7, v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏兰哲楪世(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    :goto_a
    return-void

    .line 736
    :sswitch_4
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    check-cast v12, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰楪苏;

    .line 743
    .line 744
    iget-object v0, v12, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 745
    .line 746
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 747
    .line 748
    .line 749
    move-result v0

    .line 750
    if-eqz v0, :cond_10

    .line 751
    .line 752
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    const-wide v2, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    invoke-static {v0, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    if-eqz v0, :cond_10

    .line 770
    .line 771
    const-wide v2, -0x36a5ddfc051405a7L    # -2.3311301890513727E45

    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v0

    .line 780
    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    :cond_10
    return-void

    .line 784
    :sswitch_5
    check-cast v12, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;

    .line 785
    .line 786
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    :try_start_4
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 793
    .line 794
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 795
    .line 796
    aget-object v1, v1, v8

    .line 797
    .line 798
    if-nez v1, :cond_11

    .line 799
    .line 800
    goto/16 :goto_c

    .line 801
    .line 802
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-static {v12, v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;Ljava/lang/Object;)Landroid/widget/ImageView;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    if-nez v0, :cond_12

    .line 810
    .line 811
    goto/16 :goto_c

    .line 812
    .line 813
    :cond_12
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v2

    .line 825
    const-wide v5, -0x36a5ab52051405a7L    # -2.348784038247231E45

    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    const-wide v5, -0x36a5d016051405a7L    # -2.3359730876973915E45

    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v5

    .line 842
    const/4 v6, 0x0

    .line 843
    invoke-static {v2, v5, v6}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 844
    .line 845
    .line 846
    move-result v2

    .line 847
    if-eqz v2, :cond_13

    .line 848
    .line 849
    goto :goto_c

    .line 850
    :cond_13
    invoke-static {v12}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;)Landroid/graphics/Bitmap;

    .line 851
    .line 852
    .line 853
    move-result-object v2

    .line 854
    if-nez v2, :cond_14

    .line 855
    .line 856
    goto :goto_c

    .line 857
    :cond_14
    iget v5, v12, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:I

    .line 858
    .line 859
    if-eqz v5, :cond_15

    .line 860
    .line 861
    goto :goto_b

    .line 862
    :cond_15
    sget-object v5, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 863
    .line 864
    iget-object v6, v12, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 865
    .line 866
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    const-wide v9, -0x36a5d0ca051405a7L    # -2.3357280843932084E45

    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v7

    .line 878
    const/16 v9, 0x32

    .line 879
    .line 880
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 881
    .line 882
    .line 883
    move-result-object v9

    .line 884
    invoke-virtual {v6, v9, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v6

    .line 888
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    check-cast v6, Ljava/lang/Integer;

    .line 895
    .line 896
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 897
    .line 898
    .line 899
    move-result v3

    .line 900
    int-to-float v3, v3

    .line 901
    invoke-static {v5, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪哲苏世兰(Landroid/content/Context;F)I

    .line 902
    .line 903
    .line 904
    move-result v5

    .line 905
    iput v5, v12, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰苏世:I

    .line 906
    .line 907
    :goto_b
    invoke-static {v2, v5, v5, v8}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 908
    .line 909
    .line 910
    move-result-object v2

    .line 911
    const-wide v3, -0x36a5d003051405a7L    # -2.3359989491572775E45

    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 923
    .line 924
    .line 925
    const v2, 0x2399333

    .line 926
    .line 927
    .line 928
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v3

    .line 932
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 933
    .line 934
    invoke-static {v3, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    if-nez v3, :cond_16

    .line 939
    .line 940
    new-instance v3, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲兰楪;

    .line 941
    .line 942
    invoke-direct {v3, v12, v1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲兰楪;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;Ljava/lang/Object;)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v0, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 949
    .line 950
    .line 951
    :cond_16
    const/4 v6, 0x0

    .line 952
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 953
    .line 954
    .line 955
    :catch_3
    :goto_c
    return-void

    .line 956
    :sswitch_6
    const/4 v9, 0x0

    .line 957
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    check-cast v12, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏世哲;

    .line 964
    .line 965
    iget-object v0, v12, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 966
    .line 967
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    if-eqz v0, :cond_19

    .line 972
    .line 973
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 974
    .line 975
    aget-object v0, v0, v6

    .line 976
    .line 977
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 978
    .line 979
    if-eqz v1, :cond_17

    .line 980
    .line 981
    move-object v7, v0

    .line 982
    check-cast v7, Landroid/view/ViewGroup;

    .line 983
    .line 984
    goto :goto_d

    .line 985
    :cond_17
    move-object v7, v9

    .line 986
    :goto_d
    if-nez v7, :cond_18

    .line 987
    .line 988
    goto :goto_e

    .line 989
    :cond_18
    const/16 v0, 0x8

    .line 990
    .line 991
    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 992
    .line 993
    .line 994
    :cond_19
    :goto_e
    return-void

    .line 995
    :sswitch_7
    const/4 v9, 0x0

    .line 996
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    check-cast v12, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪苏兰世;

    .line 1003
    .line 1004
    iget-object v0, v12, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1005
    .line 1006
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1007
    .line 1008
    .line 1009
    move-result v0

    .line 1010
    if-nez v0, :cond_1a

    .line 1011
    .line 1012
    goto/16 :goto_14

    .line 1013
    .line 1014
    :cond_1a
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1015
    .line 1016
    instance-of v2, v0, Landroid/widget/BaseAdapter;

    .line 1017
    .line 1018
    if-eqz v2, :cond_1b

    .line 1019
    .line 1020
    check-cast v0, Landroid/widget/BaseAdapter;

    .line 1021
    .line 1022
    goto :goto_f

    .line 1023
    :cond_1b
    move-object v0, v9

    .line 1024
    :goto_f
    if-nez v0, :cond_1c

    .line 1025
    .line 1026
    goto/16 :goto_14

    .line 1027
    .line 1028
    :cond_1c
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 1029
    .line 1030
    const/16 v16, 0x0

    .line 1031
    .line 1032
    aget-object v2, v2, v16

    .line 1033
    .line 1034
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1038
    .line 1039
    .line 1040
    check-cast v2, Ljava/lang/Integer;

    .line 1041
    .line 1042
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1043
    .line 1044
    .line 1045
    move-result v2

    .line 1046
    invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    if-nez v0, :cond_1d

    .line 1051
    .line 1052
    goto/16 :goto_14

    .line 1053
    .line 1054
    :cond_1d
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    const-wide v2, -0x36a5cedb051405a7L    # -2.336401843479712E45

    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v2

    .line 1067
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v2

    .line 1071
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v2

    .line 1075
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 1076
    .line 1077
    .line 1078
    move-result v3

    .line 1079
    if-eqz v3, :cond_1e

    .line 1080
    .line 1081
    invoke-virtual {v2, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    goto :goto_10

    .line 1086
    :cond_1e
    move-object v2, v9

    .line 1087
    :goto_10
    const-wide v3, -0x36a5ceb3051405a7L    # -2.3364562886584192E45

    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v3

    .line 1096
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v3

    .line 1100
    invoke-virtual {v3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v3

    .line 1108
    if-eqz v3, :cond_1f

    .line 1109
    .line 1110
    invoke-virtual {v0, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v0

    .line 1114
    goto :goto_11

    .line 1115
    :cond_1f
    move-object v0, v9

    .line 1116
    :goto_11
    if-eqz v2, :cond_24

    .line 1117
    .line 1118
    if-eqz v0, :cond_24

    .line 1119
    .line 1120
    const-wide v3, -0x36a50776051405a7L    # -2.405880697157629E45

    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v3

    .line 1129
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1130
    .line 1131
    .line 1132
    move-result v3

    .line 1133
    if-nez v3, :cond_24

    .line 1134
    .line 1135
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v1

    .line 1139
    instance-of v3, v1, Landroid/view/View;

    .line 1140
    .line 1141
    if-eqz v3, :cond_20

    .line 1142
    .line 1143
    move-object v7, v1

    .line 1144
    check-cast v7, Landroid/view/View;

    .line 1145
    .line 1146
    goto :goto_12

    .line 1147
    :cond_20
    move-object v7, v9

    .line 1148
    :goto_12
    if-nez v7, :cond_21

    .line 1149
    .line 1150
    goto :goto_14

    .line 1151
    :cond_21
    invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v1

    .line 1155
    if-nez v1, :cond_22

    .line 1156
    .line 1157
    goto :goto_14

    .line 1158
    :cond_22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v3

    .line 1162
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v3

    .line 1166
    const-wide v4, -0x36a5b850051405a7L    # -2.3442569216377148E45

    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1175
    .line 1176
    .line 1177
    array-length v4, v3

    .line 1178
    const/4 v9, 0x0

    .line 1179
    :goto_13
    if-ge v9, v4, :cond_24

    .line 1180
    .line 1181
    aget-object v5, v3, v9

    .line 1182
    .line 1183
    invoke-virtual {v5, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v5

    .line 1190
    instance-of v6, v5, Landroid/widget/TextView;

    .line 1191
    .line 1192
    if-eqz v6, :cond_23

    .line 1193
    .line 1194
    check-cast v5, Landroid/widget/TextView;

    .line 1195
    .line 1196
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v6

    .line 1200
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v6

    .line 1204
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v6

    .line 1208
    if-eqz v6, :cond_23

    .line 1209
    .line 1210
    invoke-static {v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v1

    .line 1214
    const-wide v2, -0x36a5ce97051405a7L    # -2.3364944002835144E45

    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v2

    .line 1223
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1227
    .line 1228
    .line 1229
    const/16 v0, 0x29

    .line 1230
    .line 1231
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1232
    .line 1233
    .line 1234
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v0

    .line 1238
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1239
    .line 1240
    .line 1241
    goto :goto_14

    .line 1242
    :cond_23
    add-int/lit8 v9, v9, 0x1

    .line 1243
    .line 1244
    goto :goto_13

    .line 1245
    :cond_24
    :goto_14
    return-void

    .line 1246
    :sswitch_8
    const/4 v9, 0x0

    .line 1247
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1251
    .line 1252
    .line 1253
    check-cast v12, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

    .line 1254
    .line 1255
    iget-object v0, v12, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1256
    .line 1257
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1258
    .line 1259
    .line 1260
    move-result v0

    .line 1261
    if-nez v0, :cond_25

    .line 1262
    .line 1263
    goto :goto_16

    .line 1264
    :cond_25
    :try_start_5
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    instance-of v1, v0, Landroid/widget/LinearLayout;

    .line 1269
    .line 1270
    if-eqz v1, :cond_26

    .line 1271
    .line 1272
    move-object v7, v0

    .line 1273
    check-cast v7, Landroid/widget/LinearLayout;

    .line 1274
    .line 1275
    goto :goto_15

    .line 1276
    :cond_26
    move-object v7, v9

    .line 1277
    :goto_15
    if-nez v7, :cond_27

    .line 1278
    .line 1279
    goto :goto_16

    .line 1280
    :cond_27
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1281
    .line 1282
    .line 1283
    move-result v0

    .line 1284
    if-lez v0, :cond_28

    .line 1285
    .line 1286
    const/4 v6, 0x0

    .line 1287
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    instance-of v0, v0, Landroid/widget/ImageView;

    .line 1292
    .line 1293
    if-eqz v0, :cond_28

    .line 1294
    .line 1295
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 1296
    .line 1297
    .line 1298
    const/16 v0, 0x11

    .line 1299
    .line 1300
    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->setGravity(I)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 1301
    .line 1302
    .line 1303
    :catch_4
    :cond_28
    :goto_16
    return-void

    .line 1304
    :sswitch_9
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1308
    .line 1309
    .line 1310
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1311
    .line 1312
    check-cast v12, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;

    .line 1313
    .line 1314
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    const-wide v1, -0x36a5adb2051405a7L    # -2.3479564715308793E45

    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    invoke-static {v12, v0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1327
    .line 1328
    .line 1329
    const-wide v1, -0x36a5adbb051405a7L    # -2.34794422136567E45

    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v1

    .line 1338
    invoke-static {v12, v0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1339
    .line 1340
    .line 1341
    return-void

    .line 1342
    :sswitch_a
    check-cast v12, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;

    .line 1343
    .line 1344
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1348
    .line 1349
    .line 1350
    :try_start_6
    iget-object v0, v12, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 1351
    .line 1352
    if-eqz v0, :cond_29

    .line 1353
    .line 1354
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v1

    .line 1358
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1359
    .line 1360
    .line 1361
    move-result v0

    .line 1362
    if-nez v0, :cond_29

    .line 1363
    .line 1364
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v0

    .line 1368
    iput-object v0, v12, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 1369
    .line 1370
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->getAllRunningPluginLoader()Ljava/util/Collection;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    const-wide v1, -0x36a59281051405a7L    # -2.357431293755426E45

    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1383
    .line 1384
    .line 1385
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1386
    .line 1387
    .line 1388
    move-result v0

    .line 1389
    if-nez v0, :cond_29

    .line 1390
    .line 1391
    const-wide v0, -0x36a59260051405a7L    # -2.3574762110278594E45

    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1401
    .line 1402
    .line 1403
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopAllPlugin()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 1404
    .line 1405
    .line 1406
    goto :goto_17

    .line 1407
    :catch_5
    move-exception v0

    .line 1408
    invoke-virtual {v12}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v1

    .line 1412
    invoke-virtual {v1, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 1413
    .line 1414
    .line 1415
    :cond_29
    :goto_17
    return-void

    .line 1416
    nop

    .line 1417
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_a
        0x2 -> :sswitch_9
        0x7 -> :sswitch_8
        0xa -> :sswitch_7
        0xf -> :sswitch_6
        0x10 -> :sswitch_5
        0x11 -> :sswitch_4
        0x12 -> :sswitch_3
        0x13 -> :sswitch_2
        0x15 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    const-wide v5, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    iget-object v7, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast v7, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏世哲兰;

    .line 28
    .line 29
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :pswitch_2
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 44
    .line 45
    aget-object p0, p0, v3

    .line 46
    .line 47
    const-wide v0, -0x36a52684051405a7L    # -2.3950597178895432E45

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-class v0, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, p1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Ljava/lang/String;

    .line 63
    .line 64
    const-wide v0, -0x36a5268f051405a7L    # -2.3950447454653987E45

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    new-instance p1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 80
    .line 81
    invoke-direct {p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 82
    .line 83
    .line 84
    const-wide v0, -0x36a52655051405a7L    # -2.3951236909745244E45

    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-class v1, [B

    .line 94
    .line 95
    invoke-static {v1, v0, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, [B

    .line 100
    .line 101
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏([B)[B

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p1, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    const-wide v0, -0x36a5265f051405a7L    # -2.3951100796798475E45

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    const-wide v2, -0x36a52659051405a7L    # -2.3951182464566537E45

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {p0, v4}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    const-wide v4, -0x36a5265b051405a7L    # -2.3951155241977183E45

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    const/16 v6, 0x21

    .line 168
    .line 169
    if-ne p1, v6, :cond_2

    .line 170
    .line 171
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->containsKey(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_2

    .line 180
    .line 181
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->containsKey(Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    if-eqz p1, :cond_2

    .line 198
    .line 199
    const-wide v2, -0x36a52647051405a7L    # -2.395142746787072E45

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    instance-of p1, p1, Ljava/lang/String;

    .line 213
    .line 214
    if-eqz p1, :cond_2

    .line 215
    .line 216
    const-wide v8, -0x36a52645051405a7L    # -2.3951454690460073E45

    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    const/16 v6, 0x82

    .line 230
    .line 231
    if-eq p1, v6, :cond_1

    .line 232
    .line 233
    const/16 v6, 0x83

    .line 234
    .line 235
    if-ne p1, v6, :cond_2

    .line 236
    .line 237
    :cond_1
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    check-cast v7, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世哲苏兰;

    .line 266
    .line 267
    iget-object v1, v7, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/ExecutorService;

    .line 268
    .line 269
    new-instance v2, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 270
    .line 271
    const/4 v3, 0x7

    .line 272
    invoke-direct {v2, v0, p0, p1, v3}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 273
    .line 274
    .line 275
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 276
    .line 277
    .line 278
    :cond_2
    return-void

    .line 279
    :pswitch_3
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    check-cast v7, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世哲苏;

    .line 286
    .line 287
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 288
    .line 289
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    if-nez p0, :cond_3

    .line 294
    .line 295
    goto :goto_0

    .line 296
    :cond_3
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 297
    .line 298
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 299
    .line 300
    aput-object p1, p0, v4

    .line 301
    .line 302
    :goto_0
    return-void

    .line 303
    :pswitch_4
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    check-cast v7, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世兰苏哲;

    .line 310
    .line 311
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result p0

    .line 317
    if-eqz p0, :cond_4

    .line 318
    .line 319
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_4
    return-void

    .line 325
    :pswitch_5
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪兰苏世;

    .line 332
    .line 333
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 334
    .line 335
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 336
    .line 337
    .line 338
    move-result p0

    .line 339
    if-eqz p0, :cond_5

    .line 340
    .line 341
    const-wide v0, -0x36a5cd31051405a7L    # -2.336981684632945E45

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    :try_start_0
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 347
    .line 348
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    invoke-static {p0, v3, v5}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 357
    .line 358
    .line 359
    goto :goto_1

    .line 360
    :catch_0
    :try_start_1
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 361
    .line 362
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-static {p0, v0, v4}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 367
    .line 368
    .line 369
    :catch_1
    :goto_1
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :cond_5
    return-void

    .line 373
    :pswitch_6
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪兰世苏;

    .line 380
    .line 381
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 382
    .line 383
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 384
    .line 385
    .line 386
    move-result p0

    .line 387
    if-nez p0, :cond_6

    .line 388
    .line 389
    goto/16 :goto_3

    .line 390
    .line 391
    :cond_6
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 392
    .line 393
    aget-object p0, p0, v4

    .line 394
    .line 395
    instance-of v0, p0, Landroid/widget/TextView;

    .line 396
    .line 397
    if-eqz v0, :cond_7

    .line 398
    .line 399
    check-cast p0, Landroid/widget/TextView;

    .line 400
    .line 401
    goto :goto_2

    .line 402
    :cond_7
    move-object p0, v2

    .line 403
    :goto_2
    if-nez p0, :cond_8

    .line 404
    .line 405
    goto/16 :goto_3

    .line 406
    .line 407
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object p0

    .line 411
    if-nez p0, :cond_9

    .line 412
    .line 413
    goto :goto_3

    .line 414
    :cond_9
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 415
    .line 416
    const/4 v3, 0x4

    .line 417
    aget-object v0, v0, v3

    .line 418
    .line 419
    instance-of v4, v0, Ljava/lang/String;

    .line 420
    .line 421
    if-eqz v4, :cond_a

    .line 422
    .line 423
    move-object v2, v0

    .line 424
    check-cast v2, Ljava/lang/String;

    .line 425
    .line 426
    :cond_a
    if-nez v2, :cond_b

    .line 427
    .line 428
    goto :goto_3

    .line 429
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-lez v0, :cond_c

    .line 434
    .line 435
    const-wide v4, -0x36a526da051405a7L    # -2.3949426607553224E45

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    :try_start_2
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-static {p0, v0}, Lde/robv/android/xposed/XposedHelpers;->getLongField(Ljava/lang/Object;Ljava/lang/String;)J

    .line 445
    .line 446
    .line 447
    move-result-wide v4

    .line 448
    const-wide v6, -0x36a51b4a051405a7L    # -2.3989716039796664E45

    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-static {p0, v0}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 458
    .line 459
    .line 460
    move-result p0

    .line 461
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 462
    .line 463
    new-instance v6, Ljava/lang/StringBuilder;

    .line 464
    .line 465
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 466
    .line 467
    .line 468
    iget-object v7, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 469
    .line 470
    aget-object v7, v7, v1

    .line 471
    .line 472
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    const/16 v7, 0x28

    .line 476
    .line 477
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    const/16 v4, 0x29

    .line 484
    .line 485
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    aput-object v4, v0, v1

    .line 493
    .line 494
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 495
    .line 496
    new-instance v0, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 502
    .line 503
    .line 504
    const-wide v1, -0x36a5cda7051405a7L    # -2.3368210713557585E45

    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p0

    .line 523
    aput-object p0, p1, v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 524
    .line 525
    :catch_2
    :cond_c
    :goto_3
    return-void

    .line 526
    :pswitch_7
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪哲世;

    .line 533
    .line 534
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 535
    .line 536
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 537
    .line 538
    .line 539
    move-result p0

    .line 540
    if-eqz p0, :cond_d

    .line 541
    .line 542
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 543
    .line 544
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 545
    .line 546
    .line 547
    :cond_d
    return-void

    .line 548
    :pswitch_8
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪世哲;

    .line 555
    .line 556
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 557
    .line 558
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 559
    .line 560
    .line 561
    move-result p0

    .line 562
    if-eqz p0, :cond_f

    .line 563
    .line 564
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 565
    .line 566
    const-wide v0, -0x36a5a289051405a7L    # -2.3518452184200517E45

    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    array-length v0, p0

    .line 578
    move v1, v3

    .line 579
    :goto_4
    if-ge v3, v0, :cond_f

    .line 580
    .line 581
    aget-object v2, p0, v3

    .line 582
    .line 583
    add-int/lit8 v4, v1, 0x1

    .line 584
    .line 585
    instance-of v2, v2, Ljava/lang/Boolean;

    .line 586
    .line 587
    if-eqz v2, :cond_e

    .line 588
    .line 589
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 590
    .line 591
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 592
    .line 593
    aput-object v5, v2, v1

    .line 594
    .line 595
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 596
    .line 597
    move v1, v4

    .line 598
    goto :goto_4

    .line 599
    :cond_f
    return-void

    .line 600
    :pswitch_9
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲兰世楪;

    .line 607
    .line 608
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 609
    .line 610
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 611
    .line 612
    .line 613
    move-result p0

    .line 614
    if-nez p0, :cond_10

    .line 615
    .line 616
    goto/16 :goto_9

    .line 617
    .line 618
    :cond_10
    :try_start_3
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 619
    .line 620
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    move-result-object p0

    .line 624
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    const-wide v1, -0x36a5b850051405a7L    # -2.3442569216377148E45

    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    array-length v1, v0

    .line 640
    move v2, v3

    .line 641
    :goto_5
    const-wide v5, -0x36a5524e051405a7L    # -2.3798014565568084E45

    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    if-ge v2, v1, :cond_12

    .line 647
    .line 648
    aget-object v7, v0, v2

    .line 649
    .line 650
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    invoke-static {v7, v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v7

    .line 662
    if-eqz v7, :cond_11

    .line 663
    .line 664
    move v3, v4

    .line 665
    goto :goto_6

    .line 666
    :cond_11
    add-int/lit8 v2, v2, 0x1

    .line 667
    .line 668
    goto :goto_5

    .line 669
    :cond_12
    :goto_6
    if-eqz v3, :cond_13

    .line 670
    .line 671
    const/high16 v0, 0x428e0000    # 71.0f

    .line 672
    .line 673
    goto :goto_7

    .line 674
    :cond_13
    const/high16 v0, 0x42980000    # 76.0f

    .line 675
    .line 676
    :goto_7
    if-eqz v3, :cond_14

    .line 677
    .line 678
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    goto :goto_8

    .line 683
    :cond_14
    const-wide v1, -0x36a5144d051405a7L    # -2.4014066645973526E45

    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    :goto_8
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 693
    .line 694
    const-wide v5, -0x36a59389051405a7L    # -2.3570719555759574E45

    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 703
    .line 704
    .line 705
    check-cast v2, Landroid/view/View;

    .line 706
    .line 707
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 716
    .line 717
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 718
    .line 719
    div-float/2addr v0, v3

    .line 720
    mul-float/2addr v0, v2

    .line 721
    const/high16 v2, 0x3f000000    # 0.5f

    .line 722
    .line 723
    add-float/2addr v0, v2

    .line 724
    float-to-int v0, v0

    .line 725
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 726
    .line 727
    .line 728
    move-result-object p0

    .line 729
    invoke-virtual {p0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 730
    .line 731
    .line 732
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 733
    .line 734
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 739
    .line 740
    .line 741
    :catch_3
    :goto_9
    return-void

    .line 742
    :pswitch_a
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;

    .line 749
    .line 750
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 751
    .line 752
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 753
    .line 754
    .line 755
    move-result p0

    .line 756
    if-nez p0, :cond_15

    .line 757
    .line 758
    goto :goto_b

    .line 759
    :cond_15
    :goto_a
    const/16 p0, 0x13

    .line 760
    .line 761
    if-ge v3, p0, :cond_16

    .line 762
    .line 763
    :try_start_4
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 764
    .line 765
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 766
    .line 767
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 768
    .line 769
    invoke-static {p0, v0, v1}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 770
    .line 771
    .line 772
    add-int/lit8 v3, v3, 0x1

    .line 773
    .line 774
    goto :goto_a

    .line 775
    :catch_4
    :cond_16
    :goto_b
    return-void

    .line 776
    :pswitch_b
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;

    .line 777
    .line 778
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 785
    .line 786
    aget-object v0, p0, v3

    .line 787
    .line 788
    instance-of v5, v0, Landroid/content/Intent;

    .line 789
    .line 790
    const-wide v8, -0x36a5bfa8051405a7L    # -2.3416979982384694E45

    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    if-eqz v5, :cond_17

    .line 796
    .line 797
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    check-cast v0, Landroid/content/Intent;

    .line 801
    .line 802
    goto :goto_c

    .line 803
    :cond_17
    aget-object p0, p0, v4

    .line 804
    .line 805
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    move-object v0, p0

    .line 812
    check-cast v0, Landroid/content/Intent;

    .line 813
    .line 814
    :goto_c
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 815
    .line 816
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 817
    .line 818
    .line 819
    move-result p0

    .line 820
    if-eqz p0, :cond_21

    .line 821
    .line 822
    iget-object p0, v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 823
    .line 824
    invoke-virtual {v0, p0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 825
    .line 826
    .line 827
    move-result p0

    .line 828
    if-eqz p0, :cond_18

    .line 829
    .line 830
    goto/16 :goto_10

    .line 831
    .line 832
    :cond_18
    const-wide v5, -0x36a533a8051405a7L    # -2.390480878360255E45

    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object p0

    .line 841
    invoke-virtual {v0, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object p0

    .line 845
    if-eqz p0, :cond_21

    .line 846
    .line 847
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲世楪兰(Ljava/lang/CharSequence;)Z

    .line 848
    .line 849
    .line 850
    move-result v5

    .line 851
    if-eqz v5, :cond_19

    .line 852
    .line 853
    goto/16 :goto_10

    .line 854
    .line 855
    :cond_19
    iget-object v5, v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 856
    .line 857
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 858
    .line 859
    .line 860
    move-result-object v5

    .line 861
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 862
    .line 863
    invoke-virtual {p0, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 864
    .line 865
    .line 866
    move-result-object v6

    .line 867
    const-wide v7, -0x36a57a83051405a7L    # -2.3657913509459395E45

    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v5, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 879
    .line 880
    .line 881
    move-result-object v5

    .line 882
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 883
    .line 884
    .line 885
    move-result v5

    .line 886
    if-nez v5, :cond_1a

    .line 887
    .line 888
    goto/16 :goto_10

    .line 889
    .line 890
    :cond_1a
    const-wide v5, -0x36a5be6c051405a7L    # -2.3421281151502574E45

    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v9

    .line 899
    invoke-static {p0, v9, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 900
    .line 901
    .line 902
    move-result v9

    .line 903
    const/4 v10, 0x6

    .line 904
    const-wide v11, -0x36a5b0fe051405a7L    # -2.3468076782601542E45

    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    if-eqz v9, :cond_1b

    .line 910
    .line 911
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v5

    .line 915
    invoke-static {p0, v5, v3, v3, v10}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲楪世兰(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 916
    .line 917
    .line 918
    move-result v5

    .line 919
    add-int/2addr v5, v1

    .line 920
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v1

    .line 924
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    goto :goto_d

    .line 928
    :cond_1b
    move-object v1, p0

    .line 929
    :goto_d
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 930
    .line 931
    .line 932
    move-result v5

    .line 933
    move v6, v3

    .line 934
    :goto_e
    if-ge v6, v5, :cond_1d

    .line 935
    .line 936
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 937
    .line 938
    .line 939
    move-result v9

    .line 940
    const/16 v13, 0x2f

    .line 941
    .line 942
    if-ne v9, v13, :cond_1c

    .line 943
    .line 944
    add-int/lit8 v6, v6, 0x1

    .line 945
    .line 946
    goto :goto_e

    .line 947
    :cond_1c
    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    goto :goto_f

    .line 955
    :cond_1d
    const-wide v5, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v1

    .line 964
    :goto_f
    const-wide v5, -0x36a507a5051405a7L    # -2.405816724072648E45

    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object v9

    .line 973
    invoke-static {v1, v9, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 974
    .line 975
    .line 976
    move-result v9

    .line 977
    if-eqz v9, :cond_1e

    .line 978
    .line 979
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v5

    .line 983
    invoke-static {v1, v5, v3, v3, v10}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲楪世兰(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 984
    .line 985
    .line 986
    move-result v5

    .line 987
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    invoke-static {v11, v12}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    :cond_1e
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 995
    .line 996
    invoke-static {v1, v5, v7, v8}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Ljava/util/Locale;J)Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    const-wide v5, -0x36a5be68051405a7L    # -2.3421335596681282E45

    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v5

    .line 1009
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v5

    .line 1013
    if-nez v5, :cond_21

    .line 1014
    .line 1015
    const-wide v5, -0x36a52c03051405a7L    # -2.3931446087285122E45

    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v5

    .line 1024
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v5

    .line 1028
    if-nez v5, :cond_21

    .line 1029
    .line 1030
    const-wide v5, -0x36a5be57051405a7L    # -2.3421566988690788E45

    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v5

    .line 1039
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v5

    .line 1043
    if-nez v5, :cond_21

    .line 1044
    .line 1045
    const-wide v5, -0x36a5be43051405a7L    # -2.3421839214584325E45

    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v5

    .line 1054
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v1

    .line 1058
    if-eqz v1, :cond_1f

    .line 1059
    .line 1060
    goto/16 :goto_10

    .line 1061
    .line 1062
    :cond_1f
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    if-eqz v0, :cond_21

    .line 1067
    .line 1068
    invoke-virtual {v0}, Landroid/content/ComponentName;->getShortClassName()Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v0

    .line 1072
    if-eqz v0, :cond_21

    .line 1073
    .line 1074
    const-wide v5, -0x36a5be89051405a7L    # -2.3420886423956946E45

    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    invoke-static {v0, v1, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    if-ne v0, v4, :cond_21

    .line 1088
    .line 1089
    const-wide v0, -0x36a553e3051405a7L    # -2.3792501991223964E45

    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v5

    .line 1098
    invoke-static {p0, v5, v3}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v5

    .line 1102
    if-nez v5, :cond_20

    .line 1103
    .line 1104
    const-wide v5, -0x36a553eb051405a7L    # -2.379239310086655E45

    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v5

    .line 1113
    invoke-static {p0, v5, v3}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v3

    .line 1117
    if-nez v3, :cond_20

    .line 1118
    .line 1119
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1124
    .line 1125
    .line 1126
    move-result-object p0

    .line 1127
    :cond_20
    :try_start_5
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1128
    .line 1129
    new-instance v1, Landroid/content/Intent;

    .line 1130
    .line 1131
    const-wide v5, -0x36a5115f051405a7L    # -2.4024275116981154E45

    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v3

    .line 1140
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1141
    .line 1142
    .line 1143
    move-result-object p0

    .line 1144
    invoke-direct {v1, v3, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1145
    .line 1146
    .line 1147
    const/high16 p0, 0x10000000

    .line 1148
    .line 1149
    invoke-virtual {v1, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1150
    .line 1151
    .line 1152
    const-wide v5, -0x36a5be7b051405a7L    # -2.3421076982082422E45

    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object p0

    .line 1161
    invoke-virtual {v1, p0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    move-result-object p0

    .line 1168
    const-wide v3, -0x36a5beb7051405a7L    # -2.342026030440181E45

    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v3

    .line 1177
    const-class v4, Landroid/content/Intent;

    .line 1178
    .line 1179
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v4

    .line 1183
    invoke-virtual {p0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1184
    .line 1185
    .line 1186
    move-result-object p0

    .line 1187
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 1192
    .line 1193
    .line 1194
    :catch_5
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1195
    .line 1196
    .line 1197
    :cond_21
    :goto_10
    return-void

    .line 1198
    :pswitch_c
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1202
    .line 1203
    .line 1204
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世苏楪兰哲;

    .line 1205
    .line 1206
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1207
    .line 1208
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1209
    .line 1210
    .line 1211
    move-result p0

    .line 1212
    if-eqz p0, :cond_22

    .line 1213
    .line 1214
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1215
    .line 1216
    .line 1217
    :cond_22
    return-void

    .line 1218
    :pswitch_d
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1222
    .line 1223
    .line 1224
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲兰苏;

    .line 1225
    .line 1226
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1227
    .line 1228
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1229
    .line 1230
    .line 1231
    move-result p0

    .line 1232
    if-eqz p0, :cond_23

    .line 1233
    .line 1234
    new-instance p0, Ljava/util/ArrayList;

    .line 1235
    .line 1236
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1240
    .line 1241
    .line 1242
    :cond_23
    return-void

    .line 1243
    :pswitch_e
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1247
    .line 1248
    .line 1249
    check-cast v7, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏哲世兰;

    .line 1250
    .line 1251
    iget-object p0, v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1252
    .line 1253
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1254
    .line 1255
    .line 1256
    move-result p0

    .line 1257
    if-eqz p0, :cond_24

    .line 1258
    .line 1259
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1260
    .line 1261
    .line 1262
    :cond_24
    return-void

    .line 1263
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
