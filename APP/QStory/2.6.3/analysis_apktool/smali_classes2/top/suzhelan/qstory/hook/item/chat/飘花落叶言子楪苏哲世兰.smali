.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 7
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    const/16 v2, 0x763

    .line 8
    .line 9
    const/16 v3, 0x862

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v5}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 22
    .line 23
    aget-object v0, v0, v6

    .line 24
    .line 25
    const/16 v1, 0x8bb

    .line 26
    .line 27
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v0, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const/16 v1, 0x4e5

    .line 40
    .line 41
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_11

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const/16 v2, 0x152

    .line 58
    .line 59
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    invoke-static {v3, v2, v1}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const/16 v5, 0x634

    .line 70
    .line 71
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast v2, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    const/4 v5, 0x1

    .line 84
    if-eq v2, v5, :cond_0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    sget v2, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰哲世:I

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-static {v2}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/16 v7, 0xf7

    .line 98
    .line 99
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    iput-object v7, v2, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 104
    .line 105
    new-array v7, v4, [Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v2, v1, v7}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c"

    .line 112
    .line 113
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-static {v3, v2, v1}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/lang/Integer;

    .line 122
    .line 123
    if-nez v2, :cond_1

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-ne v2, v6, :cond_2

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-static {v2}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const/16 v3, 0x153

    .line 142
    .line 143
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    iput-object v3, v2, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 148
    .line 149
    const-class v3, Ljava/lang/String;

    .line 150
    .line 151
    iput-object v3, v2, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 152
    .line 153
    new-array v3, v4, [Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {v2, v1, v3}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v3}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const/16 v7, 0x154

    .line 170
    .line 171
    invoke-static {v7}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    iput-object v7, v3, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v7

    .line 184
    if-nez v7, :cond_3

    .line 185
    .line 186
    goto/16 :goto_a

    .line 187
    .line 188
    :cond_3
    new-instance v7, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    const/16 v8, 0x8b8

    .line 198
    .line 199
    invoke-static {v8}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    aget-char v8, v2, v4

    .line 206
    .line 207
    invoke-static {v8}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲(C)Z

    .line 208
    .line 209
    .line 210
    move-result v8

    .line 211
    if-nez v8, :cond_5

    .line 212
    .line 213
    aget-char v8, v2, v4

    .line 214
    .line 215
    invoke-static {v8}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(C)Z

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    if-eqz v8, :cond_4

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_4
    move v8, v4

    .line 223
    goto :goto_3

    .line 224
    :cond_5
    :goto_2
    move v8, v5

    .line 225
    :goto_3
    aget-char v9, v2, v4

    .line 226
    .line 227
    invoke-static {v9}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(C)Z

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    const v10, 0xfff0

    .line 232
    .line 233
    .line 234
    const v11, 0xff00

    .line 235
    .line 236
    .line 237
    const/16 v12, 0x3040

    .line 238
    .line 239
    const/16 v13, 0x3000

    .line 240
    .line 241
    if-nez v9, :cond_8

    .line 242
    .line 243
    aget-char v9, v2, v4

    .line 244
    .line 245
    if-gt v13, v9, :cond_6

    .line 246
    .line 247
    if-ge v9, v12, :cond_6

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_6
    if-gt v11, v9, :cond_7

    .line 251
    .line 252
    if-ge v9, v10, :cond_7

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_7
    move v9, v4

    .line 256
    goto :goto_5

    .line 257
    :cond_8
    :goto_4
    move v9, v5

    .line 258
    :goto_5
    array-length v14, v2

    .line 259
    move v15, v4

    .line 260
    :goto_6
    const-string v16, "\u55b5\u545c\u55b5\u545c\u55b5\u55b5\u545c\u545c"

    .line 261
    .line 262
    if-ge v15, v14, :cond_10

    .line 263
    .line 264
    aget-char v4, v2, v15

    .line 265
    .line 266
    invoke-static {v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲(C)Z

    .line 267
    .line 268
    .line 269
    move-result v17

    .line 270
    if-nez v17, :cond_a

    .line 271
    .line 272
    invoke-static {v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(C)Z

    .line 273
    .line 274
    .line 275
    move-result v17

    .line 276
    if-eqz v17, :cond_9

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_9
    const/4 v5, 0x0

    .line 280
    :cond_a
    :goto_7
    invoke-static {v4}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏哲兰世(C)Z

    .line 281
    .line 282
    .line 283
    move-result v17

    .line 284
    if-nez v17, :cond_d

    .line 285
    .line 286
    if-gt v13, v4, :cond_b

    .line 287
    .line 288
    if-ge v4, v12, :cond_b

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_b
    if-gt v11, v4, :cond_c

    .line 292
    .line 293
    if-ge v4, v10, :cond_c

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_c
    const/16 v17, 0x0

    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_d
    :goto_8
    const/16 v17, 0x1

    .line 300
    .line 301
    :goto_9
    if-eq v5, v8, :cond_f

    .line 302
    .line 303
    if-eqz v9, :cond_e

    .line 304
    .line 305
    if-nez v17, :cond_f

    .line 306
    .line 307
    :cond_e
    invoke-static/range {v16 .. v16}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    :cond_f
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    add-int/lit8 v15, v15, 0x1

    .line 318
    .line 319
    move v8, v5

    .line 320
    move/from16 v9, v17

    .line 321
    .line 322
    const/4 v4, 0x0

    .line 323
    const/4 v5, 0x1

    .line 324
    goto :goto_6

    .line 325
    :cond_10
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const/16 v4, 0x510

    .line 330
    .line 331
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    new-instance v4, Lkotlin/text/Regex;

    .line 335
    .line 336
    const/16 v5, 0x8b9

    .line 337
    .line 338
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v5

    .line 342
    invoke-direct {v4, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-static/range {v16 .. v16}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-virtual {v4, v2, v5}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    new-instance v4, Lkotlin/text/Regex;

    .line 354
    .line 355
    const/16 v5, 0x8ba

    .line 356
    .line 357
    invoke-static {v5}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    invoke-direct {v4, v5}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    const-string v5, ""

    .line 365
    .line 366
    invoke-virtual {v4, v2, v5}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-static {v2}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲苏兰楪世(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 371
    .line 372
    .line 373
    move-result-object v2

    .line 374
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    :goto_a
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    invoke-virtual {v3, v1, v2}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    const/4 v4, 0x0

    .line 386
    goto/16 :goto_0

    .line 387
    .line 388
    :cond_11
    return-void

    .line 389
    :pswitch_1
    invoke-virtual {v1, v5}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :pswitch_2
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 394
    .line 395
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :pswitch_3
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 406
    .line 407
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_4
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 418
    .line 419
    const/16 v1, 0x20f

    .line 420
    .line 421
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    new-instance v2, Ltop/suzhelan/qstory/hook/item/chat/FakeMap;

    .line 426
    .line 427
    invoke-direct {v2}, Ltop/suzhelan/qstory/hook/item/chat/FakeMap;-><init>()V

    .line 428
    .line 429
    .line 430
    invoke-static {v0, v1, v2}, Lde/robv/android/xposed/XposedHelpers;->setObjectField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    return-void

    .line 434
    :pswitch_5
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 435
    .line 436
    const v1, 0x7fffffff

    .line 437
    .line 438
    .line 439
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    aput-object v1, v0, v6

    .line 444
    .line 445
    return-void

    .line 446
    :pswitch_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 450
    .line 451
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 455
    .line 456
    .line 457
    check-cast v0, Landroid/widget/LinearLayout;

    .line 458
    .line 459
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 460
    .line 461
    .line 462
    move-result v1

    .line 463
    const/4 v4, 0x0

    .line 464
    :goto_b
    if-ge v4, v1, :cond_14

    .line 465
    .line 466
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-virtual {v2}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    if-eqz v2, :cond_13

    .line 475
    .line 476
    const/16 v3, 0x896

    .line 477
    .line 478
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    if-nez v3, :cond_12

    .line 487
    .line 488
    const-string v3, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u55b5\u55b5\u55b5\u545c\u545c\u55b5~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5~\u545c\u545c\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u545c\u55b5\u545c"

    .line 489
    .line 490
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v2

    .line 498
    if-eqz v2, :cond_13

    .line 499
    .line 500
    :cond_12
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 501
    .line 502
    .line 503
    goto :goto_c

    .line 504
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 505
    .line 506
    goto :goto_b

    .line 507
    :cond_14
    :goto_c
    return-void

    .line 508
    :pswitch_7
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 509
    .line 510
    invoke-virtual {v1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    return-void

    .line 514
    :pswitch_8
    invoke-virtual {v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    if-eqz v1, :cond_15

    .line 523
    .line 524
    move-object v5, v0

    .line 525
    check-cast v5, Ljava/util/List;

    .line 526
    .line 527
    :cond_15
    if-nez v5, :cond_16

    .line 528
    .line 529
    goto :goto_d

    .line 530
    :cond_16
    new-instance v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲苏世兰;

    .line 531
    .line 532
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 533
    .line 534
    .line 535
    new-instance v1, Lbsh/飘花落叶言子楪兰世哲苏;

    .line 536
    .line 537
    invoke-direct {v1, v0, v6}, Lbsh/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;I)V

    .line 538
    .line 539
    .line 540
    invoke-interface {v5, v1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 541
    .line 542
    .line 543
    :goto_d
    return-void

    .line 544
    :pswitch_9
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 545
    .line 546
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 550
    .line 551
    .line 552
    check-cast v0, Landroid/widget/LinearLayout;

    .line 553
    .line 554
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 555
    .line 556
    .line 557
    move-result v1

    .line 558
    const/4 v2, 0x4

    .line 559
    if-lt v1, v2, :cond_17

    .line 560
    .line 561
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    if-eqz v1, :cond_18

    .line 566
    .line 567
    new-instance v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲兰世;

    .line 568
    .line 569
    invoke-direct {v2, v0, v1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏哲兰世;-><init>(Landroid/widget/LinearLayout;Landroid/view/View;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 573
    .line 574
    .line 575
    goto :goto_e

    .line 576
    :cond_17
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-lt v1, v6, :cond_18

    .line 581
    .line 582
    new-instance v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 583
    .line 584
    const/16 v2, 0xc

    .line 585
    .line 586
    invoke-direct {v1, v0, v2}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 590
    .line 591
    .line 592
    :cond_18
    :goto_e
    return-void

    .line 593
    :pswitch_a
    iget-object v0, v1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 594
    .line 595
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    check-cast v0, Landroid/widget/LinearLayout;

    .line 602
    .line 603
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 604
    .line 605
    .line 606
    move-result v1

    .line 607
    const/4 v4, 0x0

    .line 608
    :goto_f
    if-ge v4, v1, :cond_1a

    .line 609
    .line 610
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-virtual {v2}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    if-eqz v2, :cond_19

    .line 619
    .line 620
    const-string v3, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u55b5\u545c\u545c\u545c~\u545c\u55b5\u55b5\u55b5\u545c\u545c\u545c\u545c~\u545c\u545c\u545c\u55b5\u55b5\u55b5\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c"

    .line 621
    .line 622
    invoke-static {v3}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    if-eqz v2, :cond_19

    .line 631
    .line 632
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 633
    .line 634
    .line 635
    goto :goto_10

    .line 636
    :cond_19
    add-int/lit8 v4, v4, 0x1

    .line 637
    .line 638
    goto :goto_f

    .line 639
    :cond_1a
    :goto_10
    return-void

    .line 640
    nop

    .line 641
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
