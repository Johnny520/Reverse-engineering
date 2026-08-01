.class public final Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;

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
    const/16 v3, 0x74a

    .line 8
    .line 9
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    const-string v9, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 15
    .line 16
    iget-object v10, v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    sparse-switch v2, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-super/range {p0 .. p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :sswitch_0
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Class;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v2, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 40
    .line 41
    const-string v2, "androidx."

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    const-string v2, "android."

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    const-string v2, "kotlin."

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_3

    .line 64
    .line 65
    const-string v2, "kotlinx."

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    const-string v2, "com.tencent.mmkv."

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_3

    .line 80
    .line 81
    const-string v2, "com.android.tools.r8."

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_3

    .line 88
    .line 89
    const-string v2, "com.google.android."

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_3

    .line 96
    .line 97
    const-string v2, "com.google.gson."

    .line 98
    .line 99
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_3

    .line 104
    .line 105
    const-string v2, "com.google.common."

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-nez v2, :cond_3

    .line 112
    .line 113
    const-string v2, "com.microsoft.appcenter."

    .line 114
    .line 115
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-nez v2, :cond_3

    .line 120
    .line 121
    const-string v2, "org.intellij.lang.annotations."

    .line 122
    .line 123
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_3

    .line 128
    .line 129
    const-string v2, "org.jetbrains.annotations."

    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    if-eqz v1, :cond_3

    .line 143
    .line 144
    array-length v2, v1

    .line 145
    :goto_0
    if-ge v8, v2, :cond_3

    .line 146
    .line 147
    aget-object v3, v1, v8

    .line 148
    .line 149
    const-class v4, Landroid/hardware/SensorEventListener;

    .line 150
    .line 151
    if-ne v3, v4, :cond_2

    .line 152
    .line 153
    const/16 v3, 0x475

    .line 154
    .line 155
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    const-class v4, Landroid/hardware/SensorEvent;

    .line 160
    .line 161
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-static {v0, v3, v4}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    move-object v4, v10

    .line 170
    check-cast v4, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世兰哲;

    .line 171
    .line 172
    iget-object v4, v4, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 173
    .line 174
    new-instance v5, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;

    .line 175
    .line 176
    const/16 v6, 0x10

    .line 177
    .line 178
    invoke-direct {v5, v6}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 179
    .line 180
    .line 181
    invoke-static {v3, v5}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :cond_2
    add-int/lit8 v8, v8, 0x1

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_3
    :goto_1
    return-void

    .line 192
    :sswitch_1
    check-cast v10, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏兰哲世;

    .line 193
    .line 194
    :try_start_0
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const/16 v2, 0x149

    .line 205
    .line 206
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    iget-object v3, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 211
    .line 212
    iput-object v2, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 213
    .line 214
    new-array v2, v8, [Ljava/lang/Object;

    .line 215
    .line 216
    invoke-virtual {v1, v0, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    check-cast v1, Landroid/view/View;

    .line 221
    .line 222
    const/16 v2, 0xa0

    .line 223
    .line 224
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    sget-object v3, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 233
    .line 234
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-static {v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-eqz v0, :cond_6

    .line 247
    .line 248
    if-nez v1, :cond_4

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    invoke-static {v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    const/16 v3, 0xa4

    .line 260
    .line 261
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    iget-object v6, v2, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 266
    .line 267
    iput-object v3, v6, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 268
    .line 269
    new-array v3, v8, [Ljava/lang/Object;

    .line 270
    .line 271
    invoke-virtual {v2, v0, v3}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    const/16 v2, 0x98

    .line 276
    .line 277
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const-class v3, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-static {v3, v2, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Ljava/util/ArrayList;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-eqz v2, :cond_6

    .line 298
    .line 299
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    const/16 v3, 0x152

    .line 304
    .line 305
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-static {v4, v3, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    check-cast v2, Ljava/lang/Integer;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-gt v2, v5, :cond_5

    .line 320
    .line 321
    check-cast v1, Landroid/view/ViewGroup;

    .line 322
    .line 323
    invoke-virtual {v10, v1}, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏(Landroid/view/ViewGroup;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 324
    .line 325
    .line 326
    goto :goto_2

    .line 327
    :catch_0
    move-exception v0

    .line 328
    invoke-virtual {v10}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    :cond_6
    :goto_2
    return-void

    .line 336
    :sswitch_2
    const/high16 v0, 0x240f0000

    .line 337
    .line 338
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    const/16 v0, 0x520a

    .line 343
    .line 344
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    check-cast v10, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰世哲;

    .line 349
    .line 350
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 351
    .line 352
    aget-object v0, v0, v8

    .line 353
    .line 354
    move-object v5, v0

    .line 355
    check-cast v5, Landroid/content/Context;

    .line 356
    .line 357
    invoke-static {v5}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏(Landroid/content/Context;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    move-object v1, v0

    .line 365
    check-cast v1, Ljava/util/List;

    .line 366
    .line 367
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    move-result-object v9

    .line 375
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-eqz v0, :cond_d

    .line 384
    .line 385
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    :try_start_1
    const-class v12, Ljava/util/List;

    .line 390
    .line 391
    invoke-static {v12, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, Ljava/util/List;

    .line 396
    .line 397
    if-eqz v0, :cond_7

    .line 398
    .line 399
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 400
    .line 401
    .line 402
    move-result v12

    .line 403
    if-eqz v12, :cond_8

    .line 404
    .line 405
    :cond_7
    const/4 v8, 0x0

    .line 406
    goto/16 :goto_6

    .line 407
    .line 408
    :cond_8
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v12

    .line 412
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    move-result-object v12

    .line 416
    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v12

    .line 420
    const/16 v13, 0x51

    .line 421
    .line 422
    invoke-static {v13}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v13

    .line 426
    invoke-virtual {v12, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 427
    .line 428
    .line 429
    move-result v12

    .line 430
    if-nez v12, :cond_9

    .line 431
    .line 432
    goto :goto_3

    .line 433
    :cond_9
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    sget v12, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 442
    .line 443
    const/16 v13, 0x2832

    .line 444
    .line 445
    const-class v14, Ljava/lang/CharSequence;

    .line 446
    .line 447
    const-class v15, Landroid/content/Context;

    .line 448
    .line 449
    const v6, 0x2412001f

    .line 450
    .line 451
    .line 452
    if-lt v12, v13, :cond_a

    .line 453
    .line 454
    :try_start_2
    const-class v12, Ljava/lang/String;

    .line 455
    .line 456
    filled-new-array {v15, v4, v14, v4, v12}, [Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-result-object v12

    .line 460
    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v13

    .line 464
    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    filled-new-array {v5, v3, v13, v2, v6}, [Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    invoke-static {v6, v12, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    goto :goto_4

    .line 477
    :catch_1
    move-exception v0

    .line 478
    const/4 v8, 0x0

    .line 479
    goto/16 :goto_7

    .line 480
    .line 481
    :cond_a
    filled-new-array {v15, v4, v14, v4}, [Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    move-result-object v12

    .line 485
    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    filled-new-array {v5, v3, v6, v2}, [Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v6

    .line 493
    invoke-static {v6, v12, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世兰楪哲苏([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    :goto_4
    new-instance v12, Ljava/util/ArrayList;

    .line 498
    .line 499
    new-instance v13, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 500
    .line 501
    const/16 v14, 0x1a

    .line 502
    .line 503
    invoke-direct {v13, v14}, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 504
    .line 505
    .line 506
    invoke-static {v0, v13}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Class;L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世兰苏哲;)[Ljava/lang/reflect/Method;

    .line 507
    .line 508
    .line 509
    move-result-object v13

    .line 510
    invoke-static {v13}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 511
    .line 512
    .line 513
    move-result-object v13

    .line 514
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 515
    .line 516
    .line 517
    new-instance v13, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 518
    .line 519
    const/16 v14, 0x1b

    .line 520
    .line 521
    invoke-direct {v13, v14}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 522
    .line 523
    .line 524
    invoke-static {v13}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 525
    .line 526
    .line 527
    move-result-object v13

    .line 528
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 529
    .line 530
    .line 531
    sget-object v13, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏哲兰;

    .line 532
    .line 533
    const/16 v14, 0x50

    .line 534
    .line 535
    invoke-static {v14}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v14

    .line 539
    invoke-static {v14}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    move-result-object v14

    .line 543
    filled-new-array {v14}, [Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    move-result-object v14

    .line 547
    new-instance v15, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲兰世;

    .line 548
    .line 549
    invoke-direct {v15, v5}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏哲兰世;-><init>(Landroid/content/Context;)V

    .line 550
    .line 551
    .line 552
    invoke-static {v13, v14, v15}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v13

    .line 556
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v12

    .line 560
    check-cast v12, Ljava/lang/reflect/Method;

    .line 561
    .line 562
    filled-new-array {v13}, [Ljava/lang/Object;

    .line 563
    .line 564
    .line 565
    move-result-object v13

    .line 566
    invoke-virtual {v12, v6, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    new-instance v12, Ljava/util/ArrayList;

    .line 570
    .line 571
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    invoke-static {v5, v0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v6

    .line 581
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    invoke-static {v5, v0}, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰哲苏(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    array-length v6, v0

    .line 596
    move v13, v8

    .line 597
    :goto_5
    if-ge v13, v6, :cond_c

    .line 598
    .line 599
    aget-object v14, v0, v13

    .line 600
    .line 601
    invoke-virtual {v14}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    move-result-object v15

    .line 605
    array-length v15, v15

    .line 606
    const/4 v8, 0x5

    .line 607
    if-ne v15, v8, :cond_b

    .line 608
    .line 609
    invoke-virtual {v14, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 610
    .line 611
    .line 612
    const/4 v0, 0x6

    .line 613
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 614
    .line 615
    .line 616
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 617
    const/4 v8, 0x0

    .line 618
    :try_start_3
    filled-new-array {v12, v8, v8, v0, v8}, [Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-virtual {v14, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-interface {v1, v7, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 627
    .line 628
    .line 629
    goto :goto_8

    .line 630
    :catch_2
    move-exception v0

    .line 631
    goto :goto_7

    .line 632
    :cond_b
    const/4 v8, 0x0

    .line 633
    add-int/lit8 v13, v13, 0x1

    .line 634
    .line 635
    const/4 v8, 0x0

    .line 636
    goto :goto_5

    .line 637
    :cond_c
    const/4 v8, 0x0

    .line 638
    new-instance v0, Llin/util/ReflectUtils/ReflectException;

    .line 639
    .line 640
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    const-string v12, "\u67e5\u627e\u4e0d\u5230\u6307\u5b9a\u957f\u5ea6\u7684\u6784\u9020\u65b9\u6cd5 : "

    .line 645
    .line 646
    const-string v13, " \u60f3\u8981\u67e5\u627e\u7684\u957f\u5ea6 : 5"

    .line 647
    .line 648
    invoke-static {v12, v6, v13}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v6

    .line 652
    invoke-direct {v0, v6}, Llin/util/ReflectUtils/ReflectException;-><init>(Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 656
    :goto_6
    const/4 v8, 0x0

    .line 657
    goto/16 :goto_3

    .line 658
    .line 659
    :goto_7
    invoke-virtual {v10}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 660
    .line 661
    .line 662
    move-result-object v6

    .line 663
    invoke-virtual {v6, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 664
    .line 665
    .line 666
    goto :goto_6

    .line 667
    :cond_d
    :goto_8
    return-void

    .line 668
    :sswitch_3
    const/4 v8, 0x0

    .line 669
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    instance-of v2, v0, Ljava/util/List;

    .line 680
    .line 681
    if-eqz v2, :cond_e

    .line 682
    .line 683
    move-object v6, v0

    .line 684
    check-cast v6, Ljava/util/List;

    .line 685
    .line 686
    goto :goto_9

    .line 687
    :cond_e
    move-object v6, v8

    .line 688
    :goto_9
    if-nez v6, :cond_f

    .line 689
    .line 690
    goto :goto_a

    .line 691
    :cond_f
    check-cast v10, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰苏哲楪;

    .line 692
    .line 693
    new-instance v0, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏兰哲;

    .line 694
    .line 695
    invoke-direct {v0, v10, v5}, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 696
    .line 697
    .line 698
    invoke-static {v6, v0}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰世哲苏楪(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    :goto_a
    return-void

    .line 706
    :sswitch_4
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    check-cast v10, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世兰苏楪哲;

    .line 713
    .line 714
    iget-object v0, v10, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 715
    .line 716
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    if-eqz v0, :cond_10

    .line 721
    .line 722
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    const-string v2, ""

    .line 727
    .line 728
    invoke-static {v0, v2}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-eqz v0, :cond_10

    .line 733
    .line 734
    const/16 v0, 0x8bf

    .line 735
    .line 736
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 741
    .line 742
    .line 743
    :cond_10
    return-void

    .line 744
    :sswitch_5
    check-cast v10, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;

    .line 745
    .line 746
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    :try_start_4
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 753
    .line 754
    iget-object v1, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 755
    .line 756
    aget-object v1, v1, v7

    .line 757
    .line 758
    if-nez v1, :cond_11

    .line 759
    .line 760
    goto/16 :goto_c

    .line 761
    .line 762
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    invoke-static {v10, v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;Ljava/lang/Object;)Landroid/widget/ImageView;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    if-nez v0, :cond_12

    .line 770
    .line 771
    goto/16 :goto_c

    .line 772
    .line 773
    :cond_12
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 774
    .line 775
    .line 776
    move-result-object v2

    .line 777
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    const/16 v4, 0x71c

    .line 786
    .line 787
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 788
    .line 789
    .line 790
    const/16 v4, 0x8ab

    .line 791
    .line 792
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    const/4 v5, 0x0

    .line 797
    invoke-static {v2, v4, v5}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 798
    .line 799
    .line 800
    move-result v2

    .line 801
    if-eqz v2, :cond_13

    .line 802
    .line 803
    goto :goto_c

    .line 804
    :cond_13
    invoke-static {v10}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏兰世哲(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;)Landroid/graphics/Bitmap;

    .line 805
    .line 806
    .line 807
    move-result-object v2

    .line 808
    if-nez v2, :cond_14

    .line 809
    .line 810
    goto :goto_c

    .line 811
    :cond_14
    iget v4, v10, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 812
    .line 813
    if-eqz v4, :cond_15

    .line 814
    .line 815
    goto :goto_b

    .line 816
    :cond_15
    sget-object v4, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 817
    .line 818
    iget-object v5, v10, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 819
    .line 820
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 821
    .line 822
    .line 823
    const-string v6, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 824
    .line 825
    invoke-static {v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v6

    .line 829
    const/16 v8, 0x32

    .line 830
    .line 831
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 832
    .line 833
    .line 834
    move-result-object v8

    .line 835
    invoke-virtual {v5, v8, v6}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v5

    .line 839
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    check-cast v5, Ljava/lang/Integer;

    .line 846
    .line 847
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 848
    .line 849
    .line 850
    move-result v3

    .line 851
    int-to-float v3, v3

    .line 852
    invoke-static {v4, v3}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Landroid/content/Context;F)I

    .line 853
    .line 854
    .line 855
    move-result v4

    .line 856
    iput v4, v10, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰苏世:I

    .line 857
    .line 858
    :goto_b
    invoke-static {v2, v4, v4, v7}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    const/16 v3, 0x8ac

    .line 863
    .line 864
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 871
    .line 872
    .line 873
    const v2, 0x2399333

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 881
    .line 882
    invoke-static {v3, v4}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    move-result v3

    .line 886
    if-nez v3, :cond_16

    .line 887
    .line 888
    new-instance v3, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;

    .line 889
    .line 890
    invoke-direct {v3, v10, v1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲楪兰苏;-><init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲苏楪兰;Ljava/lang/Object;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0, v2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    :cond_16
    const/4 v5, 0x0

    .line 900
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 901
    .line 902
    .line 903
    :catch_3
    :goto_c
    return-void

    .line 904
    :sswitch_6
    const/4 v8, 0x0

    .line 905
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    check-cast v10, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏世哲;

    .line 912
    .line 913
    iget-object v0, v10, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 914
    .line 915
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 916
    .line 917
    .line 918
    move-result v0

    .line 919
    if-eqz v0, :cond_19

    .line 920
    .line 921
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 922
    .line 923
    aget-object v0, v0, v5

    .line 924
    .line 925
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 926
    .line 927
    if-eqz v1, :cond_17

    .line 928
    .line 929
    move-object v6, v0

    .line 930
    check-cast v6, Landroid/view/ViewGroup;

    .line 931
    .line 932
    goto :goto_d

    .line 933
    :cond_17
    move-object v6, v8

    .line 934
    :goto_d
    if-nez v6, :cond_18

    .line 935
    .line 936
    goto :goto_e

    .line 937
    :cond_18
    const/16 v0, 0x8

    .line 938
    .line 939
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 940
    .line 941
    .line 942
    :cond_19
    :goto_e
    return-void

    .line 943
    :sswitch_7
    const/4 v8, 0x0

    .line 944
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    check-cast v10, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪兰世苏;

    .line 951
    .line 952
    iget-object v0, v10, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 953
    .line 954
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 955
    .line 956
    .line 957
    move-result v0

    .line 958
    if-nez v0, :cond_1a

    .line 959
    .line 960
    goto/16 :goto_14

    .line 961
    .line 962
    :cond_1a
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 963
    .line 964
    instance-of v2, v0, Landroid/widget/BaseAdapter;

    .line 965
    .line 966
    if-eqz v2, :cond_1b

    .line 967
    .line 968
    check-cast v0, Landroid/widget/BaseAdapter;

    .line 969
    .line 970
    goto :goto_f

    .line 971
    :cond_1b
    move-object v0, v8

    .line 972
    :goto_f
    if-nez v0, :cond_1c

    .line 973
    .line 974
    goto/16 :goto_14

    .line 975
    .line 976
    :cond_1c
    iget-object v2, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 977
    .line 978
    const/16 v16, 0x0

    .line 979
    .line 980
    aget-object v2, v2, v16

    .line 981
    .line 982
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    check-cast v2, Ljava/lang/Integer;

    .line 989
    .line 990
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 991
    .line 992
    .line 993
    move-result v2

    .line 994
    invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v0

    .line 998
    if-nez v0, :cond_1d

    .line 999
    .line 1000
    goto/16 :goto_14

    .line 1001
    .line 1002
    :cond_1d
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    const/16 v2, 0x81d

    .line 1007
    .line 1008
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v2

    .line 1012
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v2

    .line 1016
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v2

    .line 1020
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 1021
    .line 1022
    .line 1023
    move-result v3

    .line 1024
    if-eqz v3, :cond_1e

    .line 1025
    .line 1026
    invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v2

    .line 1030
    goto :goto_10

    .line 1031
    :cond_1e
    move-object v2, v8

    .line 1032
    :goto_10
    const/16 v3, 0x81e

    .line 1033
    .line 1034
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v3

    .line 1038
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    invoke-virtual {v3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 1047
    .line 1048
    .line 1049
    move-result v3

    .line 1050
    if-eqz v3, :cond_1f

    .line 1051
    .line 1052
    invoke-virtual {v0, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    goto :goto_11

    .line 1057
    :cond_1f
    move-object v0, v8

    .line 1058
    :goto_11
    if-eqz v2, :cond_24

    .line 1059
    .line 1060
    if-eqz v0, :cond_24

    .line 1061
    .line 1062
    const-string v3, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u545c"

    .line 1063
    .line 1064
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v3

    .line 1068
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1069
    .line 1070
    .line 1071
    move-result v3

    .line 1072
    if-nez v3, :cond_24

    .line 1073
    .line 1074
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    instance-of v3, v1, Landroid/view/View;

    .line 1079
    .line 1080
    if-eqz v3, :cond_20

    .line 1081
    .line 1082
    move-object v6, v1

    .line 1083
    check-cast v6, Landroid/view/View;

    .line 1084
    .line 1085
    goto :goto_12

    .line 1086
    :cond_20
    move-object v6, v8

    .line 1087
    :goto_12
    if-nez v6, :cond_21

    .line 1088
    .line 1089
    goto :goto_14

    .line 1090
    :cond_21
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    if-nez v1, :cond_22

    .line 1095
    .line 1096
    goto :goto_14

    .line 1097
    :cond_22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v3

    .line 1101
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v3

    .line 1105
    const/16 v4, 0x7c1

    .line 1106
    .line 1107
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    array-length v4, v3

    .line 1114
    const/4 v8, 0x0

    .line 1115
    :goto_13
    if-ge v8, v4, :cond_24

    .line 1116
    .line 1117
    aget-object v5, v3, v8

    .line 1118
    .line 1119
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v5, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v5

    .line 1126
    instance-of v6, v5, Landroid/widget/TextView;

    .line 1127
    .line 1128
    if-eqz v6, :cond_23

    .line 1129
    .line 1130
    check-cast v5, Landroid/widget/TextView;

    .line 1131
    .line 1132
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v6

    .line 1136
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v6

    .line 1140
    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1141
    .line 1142
    .line 1143
    move-result v6

    .line 1144
    if-eqz v6, :cond_23

    .line 1145
    .line 1146
    invoke-static {v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏哲兰(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v1

    .line 1150
    const/16 v2, 0x81f

    .line 1151
    .line 1152
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v2

    .line 1156
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1160
    .line 1161
    .line 1162
    const/16 v0, 0x29

    .line 1163
    .line 1164
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_14

    .line 1175
    :cond_23
    add-int/lit8 v8, v8, 0x1

    .line 1176
    .line 1177
    goto :goto_13

    .line 1178
    :cond_24
    :goto_14
    return-void

    .line 1179
    :sswitch_8
    const/4 v8, 0x0

    .line 1180
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1184
    .line 1185
    .line 1186
    check-cast v10, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪世哲;

    .line 1187
    .line 1188
    iget-object v0, v10, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1189
    .line 1190
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1191
    .line 1192
    .line 1193
    move-result v0

    .line 1194
    if-nez v0, :cond_25

    .line 1195
    .line 1196
    goto :goto_16

    .line 1197
    :cond_25
    :try_start_5
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    instance-of v1, v0, Landroid/widget/LinearLayout;

    .line 1202
    .line 1203
    if-eqz v1, :cond_26

    .line 1204
    .line 1205
    move-object v6, v0

    .line 1206
    check-cast v6, Landroid/widget/LinearLayout;

    .line 1207
    .line 1208
    goto :goto_15

    .line 1209
    :cond_26
    move-object v6, v8

    .line 1210
    :goto_15
    if-nez v6, :cond_27

    .line 1211
    .line 1212
    goto :goto_16

    .line 1213
    :cond_27
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1214
    .line 1215
    .line 1216
    move-result v0

    .line 1217
    if-lez v0, :cond_28

    .line 1218
    .line 1219
    const/4 v5, 0x0

    .line 1220
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    instance-of v0, v0, Landroid/widget/ImageView;

    .line 1225
    .line 1226
    if-eqz v0, :cond_28

    .line 1227
    .line 1228
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 1229
    .line 1230
    .line 1231
    const/16 v0, 0x11

    .line 1232
    .line 1233
    invoke-virtual {v6, v0}, Landroid/widget/LinearLayout;->setGravity(I)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 1234
    .line 1235
    .line 1236
    :catch_4
    :cond_28
    :goto_16
    return-void

    .line 1237
    :sswitch_9
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1241
    .line 1242
    .line 1243
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1244
    .line 1245
    check-cast v10, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;

    .line 1246
    .line 1247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    const/16 v1, 0x704

    .line 1251
    .line 1252
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    invoke-static {v10, v0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1257
    .line 1258
    .line 1259
    const/16 v1, 0x705

    .line 1260
    .line 1261
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v1

    .line 1265
    invoke-static {v10, v0, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    return-void

    .line 1269
    :sswitch_a
    check-cast v10, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;

    .line 1270
    .line 1271
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1275
    .line 1276
    .line 1277
    :try_start_6
    iget-object v0, v10, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 1278
    .line 1279
    if-eqz v0, :cond_29

    .line 1280
    .line 1281
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v1

    .line 1285
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    move-result v0

    .line 1289
    if-nez v0, :cond_29

    .line 1290
    .line 1291
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    iput-object v0, v10, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 1296
    .line 1297
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->getAllRunningPluginLoader()Ljava/util/Collection;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    const/16 v1, 0x611

    .line 1302
    .line 1303
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1307
    .line 1308
    .line 1309
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 1310
    .line 1311
    .line 1312
    move-result v0

    .line 1313
    if-nez v0, :cond_29

    .line 1314
    .line 1315
    const/16 v0, 0x612

    .line 1316
    .line 1317
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    invoke-static {v0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1322
    .line 1323
    .line 1324
    invoke-static {}, Llin/xposed/hook/javaplugin/controller/PluginManager;->stopAllPlugin()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 1325
    .line 1326
    .line 1327
    goto :goto_17

    .line 1328
    :catch_5
    move-exception v0

    .line 1329
    invoke-virtual {v10}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v1

    .line 1333
    invoke-virtual {v1, v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 1334
    .line 1335
    .line 1336
    :cond_29
    :goto_17
    return-void

    .line 1337
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
    .locals 12

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
    const-string v5, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 8
    .line 9
    iget-object v6, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast v6, L飘花落叶言苏世兰子楪哲/飘花落叶言子楪苏世兰哲;

    .line 25
    .line 26
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void

    .line 40
    :pswitch_2
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 41
    .line 42
    aget-object p0, p0, v3

    .line 43
    .line 44
    const/16 p1, 0x136

    .line 45
    .line 46
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-class v0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, p1, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/lang/String;

    .line 57
    .line 58
    const/16 v0, 0x137

    .line 59
    .line 60
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    new-instance p1, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    invoke-direct {p1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 73
    .line 74
    .line 75
    const/16 v0, 0x138

    .line 76
    .line 77
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    const-class v1, [B

    .line 82
    .line 83
    invoke-static {v1, v0, p0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, [B

    .line 88
    .line 89
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏([B)[B

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p1, p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲([B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Lcom/alibaba/fastjson2/JSONObject;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string p1, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u55b5"

    .line 101
    .line 102
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v1, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 111
    .line 112
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string v2, "\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5"

    .line 137
    .line 138
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const/16 v3, 0x21

    .line 147
    .line 148
    if-ne v0, v3, :cond_2

    .line 149
    .line 150
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->containsKey(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_2

    .line 159
    .line 160
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->containsKey(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_2

    .line 177
    .line 178
    const-string v0, "\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5"

    .line 179
    .line 180
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    instance-of v1, v1, Ljava/lang/String;

    .line 189
    .line 190
    if-eqz v1, :cond_2

    .line 191
    .line 192
    const-string v1, "\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c"

    .line 193
    .line 194
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    const/16 v3, 0x82

    .line 203
    .line 204
    if-eq v1, v3, :cond_1

    .line 205
    .line 206
    const/16 v3, 0x83

    .line 207
    .line 208
    if-ne v1, v3, :cond_2

    .line 209
    .line 210
    :cond_1
    invoke-static {p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONObject;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    check-cast v6, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世哲苏兰;

    .line 239
    .line 240
    iget-object v0, v6, L飘花落叶言世哲楪苏兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/ExecutorService;

    .line 241
    .line 242
    new-instance v2, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 243
    .line 244
    const/4 v3, 0x7

    .line 245
    invoke-direct {v2, v1, p0, p1, v3}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 246
    .line 247
    .line 248
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 249
    .line 250
    .line 251
    :cond_2
    return-void

    .line 252
    :pswitch_3
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    check-cast v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世哲苏;

    .line 259
    .line 260
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 261
    .line 262
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    if-nez p0, :cond_3

    .line 267
    .line 268
    goto :goto_0

    .line 269
    :cond_3
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 270
    .line 271
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 272
    .line 273
    aput-object p1, p0, v4

    .line 274
    .line 275
    :goto_0
    return-void

    .line 276
    :pswitch_4
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    check-cast v6, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪世兰苏哲;

    .line 283
    .line 284
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 285
    .line 286
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    if-eqz p0, :cond_4

    .line 291
    .line 292
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 293
    .line 294
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_4
    return-void

    .line 298
    :pswitch_5
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪苏兰;

    .line 305
    .line 306
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 307
    .line 308
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    if-eqz p0, :cond_5

    .line 313
    .line 314
    const/16 p0, 0x82e

    .line 315
    .line 316
    :try_start_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 317
    .line 318
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    invoke-static {v0, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 327
    .line 328
    .line 329
    goto :goto_1

    .line 330
    :catch_0
    :try_start_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 331
    .line 332
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    invoke-static {v0, p0, v4}, Lde/robv/android/xposed/XposedHelpers;->setIntField(Ljava/lang/Object;Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 337
    .line 338
    .line 339
    :catch_1
    :goto_1
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_5
    return-void

    .line 343
    :pswitch_6
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪兰苏世;

    .line 350
    .line 351
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 352
    .line 353
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 354
    .line 355
    .line 356
    move-result p0

    .line 357
    if-nez p0, :cond_6

    .line 358
    .line 359
    goto/16 :goto_3

    .line 360
    .line 361
    :cond_6
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 362
    .line 363
    aget-object p0, p0, v4

    .line 364
    .line 365
    instance-of v0, p0, Landroid/widget/TextView;

    .line 366
    .line 367
    if-eqz v0, :cond_7

    .line 368
    .line 369
    check-cast p0, Landroid/widget/TextView;

    .line 370
    .line 371
    goto :goto_2

    .line 372
    :cond_7
    move-object p0, v2

    .line 373
    :goto_2
    if-nez p0, :cond_8

    .line 374
    .line 375
    goto :goto_3

    .line 376
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    if-nez p0, :cond_9

    .line 381
    .line 382
    goto :goto_3

    .line 383
    :cond_9
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 384
    .line 385
    const/4 v3, 0x4

    .line 386
    aget-object v0, v0, v3

    .line 387
    .line 388
    instance-of v4, v0, Ljava/lang/String;

    .line 389
    .line 390
    if-eqz v4, :cond_a

    .line 391
    .line 392
    move-object v2, v0

    .line 393
    check-cast v2, Ljava/lang/String;

    .line 394
    .line 395
    :cond_a
    if-nez v2, :cond_b

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-lez v0, :cond_c

    .line 403
    .line 404
    :try_start_2
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 405
    .line 406
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-static {p0, v0}, Lde/robv/android/xposed/XposedHelpers;->getLongField(Ljava/lang/Object;Ljava/lang/String;)J

    .line 411
    .line 412
    .line 413
    move-result-wide v4

    .line 414
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5"

    .line 415
    .line 416
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-static {p0, v0}, Lde/robv/android/xposed/XposedHelpers;->getIntField(Ljava/lang/Object;Ljava/lang/String;)I

    .line 421
    .line 422
    .line 423
    move-result p0

    .line 424
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 425
    .line 426
    new-instance v6, Ljava/lang/StringBuilder;

    .line 427
    .line 428
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 429
    .line 430
    .line 431
    iget-object v7, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 432
    .line 433
    aget-object v7, v7, v1

    .line 434
    .line 435
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    const/16 v7, 0x28

    .line 439
    .line 440
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    const/16 v4, 0x29

    .line 447
    .line 448
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    aput-object v4, v0, v1

    .line 456
    .line 457
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 458
    .line 459
    new-instance v0, Ljava/lang/StringBuilder;

    .line 460
    .line 461
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    const/16 v1, 0x82a

    .line 468
    .line 469
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p0

    .line 483
    aput-object p0, p1, v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 484
    .line 485
    :catch_2
    :cond_c
    :goto_3
    return-void

    .line 486
    :pswitch_7
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰世楪哲;

    .line 493
    .line 494
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 495
    .line 496
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 497
    .line 498
    .line 499
    move-result p0

    .line 500
    if-eqz p0, :cond_d

    .line 501
    .line 502
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 503
    .line 504
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    :cond_d
    return-void

    .line 508
    :pswitch_8
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪哲世;

    .line 515
    .line 516
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 517
    .line 518
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 519
    .line 520
    .line 521
    move-result p0

    .line 522
    if-eqz p0, :cond_f

    .line 523
    .line 524
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 525
    .line 526
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c"

    .line 527
    .line 528
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    array-length v0, p0

    .line 535
    move v1, v3

    .line 536
    :goto_4
    if-ge v3, v0, :cond_f

    .line 537
    .line 538
    aget-object v2, p0, v3

    .line 539
    .line 540
    add-int/lit8 v4, v1, 0x1

    .line 541
    .line 542
    instance-of v2, v2, Ljava/lang/Boolean;

    .line 543
    .line 544
    if-eqz v2, :cond_e

    .line 545
    .line 546
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 547
    .line 548
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 549
    .line 550
    aput-object v5, v2, v1

    .line 551
    .line 552
    :cond_e
    add-int/lit8 v3, v3, 0x1

    .line 553
    .line 554
    move v1, v4

    .line 555
    goto :goto_4

    .line 556
    :cond_f
    return-void

    .line 557
    :pswitch_9
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪世哲;

    .line 564
    .line 565
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 566
    .line 567
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 568
    .line 569
    .line 570
    move-result p0

    .line 571
    if-nez p0, :cond_10

    .line 572
    .line 573
    goto/16 :goto_9

    .line 574
    .line 575
    :cond_10
    :try_start_3
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 576
    .line 577
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    move-result-object p0

    .line 581
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    const/16 v1, 0x7c1

    .line 586
    .line 587
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    array-length v1, v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 594
    move v2, v3

    .line 595
    :goto_5
    const-string v5, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 596
    .line 597
    if-ge v2, v1, :cond_12

    .line 598
    .line 599
    :try_start_4
    aget-object v6, v0, v2

    .line 600
    .line 601
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v6

    .line 605
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v7

    .line 609
    invoke-static {v6, v7}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v6

    .line 613
    if-eqz v6, :cond_11

    .line 614
    .line 615
    move v3, v4

    .line 616
    goto :goto_6

    .line 617
    :cond_11
    add-int/lit8 v2, v2, 0x1

    .line 618
    .line 619
    goto :goto_5

    .line 620
    :cond_12
    :goto_6
    if-eqz v3, :cond_13

    .line 621
    .line 622
    const/high16 v0, 0x428e0000    # 71.0f

    .line 623
    .line 624
    goto :goto_7

    .line 625
    :cond_13
    const/high16 v0, 0x42980000    # 76.0f

    .line 626
    .line 627
    :goto_7
    if-eqz v3, :cond_14

    .line 628
    .line 629
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    goto :goto_8

    .line 634
    :cond_14
    const-string v1, "\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c\u55b5"

    .line 635
    .line 636
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    :goto_8
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 641
    .line 642
    const/16 v3, 0x607

    .line 643
    .line 644
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    check-cast v2, Landroid/view/View;

    .line 651
    .line 652
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 661
    .line 662
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 663
    .line 664
    div-float/2addr v0, v3

    .line 665
    mul-float/2addr v0, v2

    .line 666
    const/high16 v2, 0x3f000000    # 0.5f

    .line 667
    .line 668
    add-float/2addr v0, v2

    .line 669
    float-to-int v0, v0

    .line 670
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 671
    .line 672
    .line 673
    move-result-object p0

    .line 674
    invoke-virtual {p0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 675
    .line 676
    .line 677
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 678
    .line 679
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 684
    .line 685
    .line 686
    :catch_3
    :goto_9
    return-void

    .line 687
    :pswitch_a
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;

    .line 694
    .line 695
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 696
    .line 697
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 698
    .line 699
    .line 700
    move-result p0

    .line 701
    if-nez p0, :cond_15

    .line 702
    .line 703
    goto :goto_b

    .line 704
    :cond_15
    :goto_a
    const/16 p0, 0x13

    .line 705
    .line 706
    if-ge v3, p0, :cond_16

    .line 707
    .line 708
    :try_start_5
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->method:Ljava/lang/reflect/Member;

    .line 709
    .line 710
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 711
    .line 712
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 713
    .line 714
    invoke-static {p0, v0, v1}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 715
    .line 716
    .line 717
    add-int/lit8 v3, v3, 0x1

    .line 718
    .line 719
    goto :goto_a

    .line 720
    :catch_4
    :cond_16
    :goto_b
    return-void

    .line 721
    :pswitch_b
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰苏楪哲;

    .line 722
    .line 723
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 727
    .line 728
    .line 729
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 730
    .line 731
    aget-object v0, p0, v3

    .line 732
    .line 733
    instance-of v5, v0, Landroid/content/Intent;

    .line 734
    .line 735
    const/16 v7, 0x77e

    .line 736
    .line 737
    if-eqz v5, :cond_17

    .line 738
    .line 739
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    check-cast v0, Landroid/content/Intent;

    .line 743
    .line 744
    goto :goto_c

    .line 745
    :cond_17
    aget-object p0, p0, v4

    .line 746
    .line 747
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    move-object v0, p0

    .line 754
    check-cast v0, Landroid/content/Intent;

    .line 755
    .line 756
    :goto_c
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 757
    .line 758
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 759
    .line 760
    .line 761
    move-result p0

    .line 762
    if-eqz p0, :cond_21

    .line 763
    .line 764
    iget-object p0, v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v0, p0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 767
    .line 768
    .line 769
    move-result p0

    .line 770
    if-eqz p0, :cond_18

    .line 771
    .line 772
    goto/16 :goto_10

    .line 773
    .line 774
    :cond_18
    const-string p0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5"

    .line 775
    .line 776
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object p0

    .line 780
    invoke-virtual {v0, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object p0

    .line 784
    if-eqz p0, :cond_21

    .line 785
    .line 786
    invoke-static {p0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲兰世楪(Ljava/lang/CharSequence;)Z

    .line 787
    .line 788
    .line 789
    move-result v5

    .line 790
    if-eqz v5, :cond_19

    .line 791
    .line 792
    goto/16 :goto_10

    .line 793
    .line 794
    :cond_19
    iget-object v5, v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/String;

    .line 795
    .line 796
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 797
    .line 798
    .line 799
    move-result-object v5

    .line 800
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 801
    .line 802
    invoke-virtual {p0, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v6

    .line 806
    const/16 v7, 0x52a

    .line 807
    .line 808
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    invoke-virtual {v5, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 815
    .line 816
    .line 817
    move-result-object v5

    .line 818
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    .line 819
    .line 820
    .line 821
    move-result v5

    .line 822
    if-nez v5, :cond_1a

    .line 823
    .line 824
    goto/16 :goto_10

    .line 825
    .line 826
    :cond_1a
    const-string v5, "\u55b5\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 827
    .line 828
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 829
    .line 830
    .line 831
    move-result-object v6

    .line 832
    invoke-static {p0, v6, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 833
    .line 834
    .line 835
    move-result v6

    .line 836
    const/4 v8, 0x6

    .line 837
    const/16 v9, 0x76d

    .line 838
    .line 839
    if-eqz v6, :cond_1b

    .line 840
    .line 841
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v5

    .line 845
    invoke-static {p0, v5, v3, v3, v8}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲世兰楪(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 846
    .line 847
    .line 848
    move-result v5

    .line 849
    add-int/2addr v5, v1

    .line 850
    invoke-virtual {p0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v1

    .line 854
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    goto :goto_d

    .line 858
    :cond_1b
    move-object v1, p0

    .line 859
    :goto_d
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 860
    .line 861
    .line 862
    move-result v5

    .line 863
    move v6, v3

    .line 864
    :goto_e
    if-ge v6, v5, :cond_1d

    .line 865
    .line 866
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 867
    .line 868
    .line 869
    move-result v10

    .line 870
    const/16 v11, 0x2f

    .line 871
    .line 872
    if-ne v10, v11, :cond_1c

    .line 873
    .line 874
    add-int/lit8 v6, v6, 0x1

    .line 875
    .line 876
    goto :goto_e

    .line 877
    :cond_1c
    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    goto :goto_f

    .line 885
    :cond_1d
    const-string v1, ""

    .line 886
    .line 887
    :goto_f
    const-string v5, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 888
    .line 889
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v6

    .line 893
    invoke-static {v1, v6, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 894
    .line 895
    .line 896
    move-result v6

    .line 897
    if-eqz v6, :cond_1e

    .line 898
    .line 899
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v5

    .line 903
    invoke-static {v1, v5, v3, v3, v8}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏哲世兰楪(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 904
    .line 905
    .line 906
    move-result v5

    .line 907
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v1

    .line 911
    invoke-static {v9}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    :cond_1e
    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 915
    .line 916
    invoke-virtual {v1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v1

    .line 920
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 924
    .line 925
    .line 926
    const-string v5, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c"

    .line 927
    .line 928
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v5

    .line 932
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 933
    .line 934
    .line 935
    move-result v5

    .line 936
    if-nez v5, :cond_21

    .line 937
    .line 938
    const/16 v5, 0x18e

    .line 939
    .line 940
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 941
    .line 942
    .line 943
    move-result-object v5

    .line 944
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 945
    .line 946
    .line 947
    move-result v5

    .line 948
    if-nez v5, :cond_21

    .line 949
    .line 950
    const/16 v5, 0x788

    .line 951
    .line 952
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v5

    .line 956
    invoke-virtual {v1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 957
    .line 958
    .line 959
    move-result v5

    .line 960
    if-nez v5, :cond_21

    .line 961
    .line 962
    const/16 v5, 0x789

    .line 963
    .line 964
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v5

    .line 968
    invoke-virtual {v1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    move-result v1

    .line 972
    if-eqz v1, :cond_1f

    .line 973
    .line 974
    goto :goto_10

    .line 975
    :cond_1f
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    if-eqz v0, :cond_21

    .line 980
    .line 981
    invoke-virtual {v0}, Landroid/content/ComponentName;->getShortClassName()Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    if-eqz v0, :cond_21

    .line 986
    .line 987
    const/16 v1, 0x786

    .line 988
    .line 989
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    invoke-static {v0, v1, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪兰哲世(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 994
    .line 995
    .line 996
    move-result v0

    .line 997
    if-ne v0, v4, :cond_21

    .line 998
    .line 999
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u55b5\u55b5~\u55b5\u545c\u55b5\u545c\u545c\u545c\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u545c\u545c\u545c\u55b5"

    .line 1000
    .line 1001
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v1

    .line 1005
    invoke-static {p0, v1, v3}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v1

    .line 1009
    if-nez v1, :cond_20

    .line 1010
    .line 1011
    const/16 v1, 0x373

    .line 1012
    .line 1013
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    invoke-static {p0, v1, v3}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏楪哲世兰(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1018
    .line 1019
    .line 1020
    move-result v1

    .line 1021
    if-nez v1, :cond_20

    .line 1022
    .line 1023
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1028
    .line 1029
    .line 1030
    move-result-object p0

    .line 1031
    :cond_20
    :try_start_6
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 1032
    .line 1033
    new-instance v1, Landroid/content/Intent;

    .line 1034
    .line 1035
    const/16 v3, 0xcb

    .line 1036
    .line 1037
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v3

    .line 1041
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1042
    .line 1043
    .line 1044
    move-result-object p0

    .line 1045
    invoke-direct {v1, v3, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1046
    .line 1047
    .line 1048
    const/high16 p0, 0x10000000

    .line 1049
    .line 1050
    invoke-virtual {v1, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1051
    .line 1052
    .line 1053
    const/16 p0, 0x787

    .line 1054
    .line 1055
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object p0

    .line 1059
    invoke-virtual {v1, p0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    .line 1064
    .line 1065
    move-result-object p0

    .line 1066
    const/16 v3, 0x783

    .line 1067
    .line 1068
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v3

    .line 1072
    const-class v4, Landroid/content/Intent;

    .line 1073
    .line 1074
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v4

    .line 1078
    invoke-virtual {p0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1079
    .line 1080
    .line 1081
    move-result-object p0

    .line 1082
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v1

    .line 1086
    invoke-virtual {p0, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    .line 1087
    .line 1088
    .line 1089
    :catch_5
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1090
    .line 1091
    .line 1092
    :cond_21
    :goto_10
    return-void

    .line 1093
    :pswitch_c
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世苏楪兰哲;

    .line 1100
    .line 1101
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1102
    .line 1103
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1104
    .line 1105
    .line 1106
    move-result p0

    .line 1107
    if-eqz p0, :cond_22

    .line 1108
    .line 1109
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1110
    .line 1111
    .line 1112
    :cond_22
    return-void

    .line 1113
    :pswitch_d
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1117
    .line 1118
    .line 1119
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪哲兰苏;

    .line 1120
    .line 1121
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1122
    .line 1123
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1124
    .line 1125
    .line 1126
    move-result p0

    .line 1127
    if-eqz p0, :cond_23

    .line 1128
    .line 1129
    new-instance p0, Ljava/util/ArrayList;

    .line 1130
    .line 1131
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 1132
    .line 1133
    .line 1134
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1135
    .line 1136
    .line 1137
    :cond_23
    return-void

    .line 1138
    :pswitch_e
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    check-cast v6, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏哲世兰;

    .line 1145
    .line 1146
    iget-object p0, v6, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 1147
    .line 1148
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1149
    .line 1150
    .line 1151
    move-result p0

    .line 1152
    if-eqz p0, :cond_24

    .line 1153
    .line 1154
    invoke-virtual {p1, v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 1155
    .line 1156
    .line 1157
    :cond_24
    return-void

    .line 1158
    nop

    .line 1159
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
