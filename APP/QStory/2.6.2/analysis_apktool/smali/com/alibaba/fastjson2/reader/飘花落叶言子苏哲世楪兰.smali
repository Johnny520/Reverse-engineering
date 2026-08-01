.class public final synthetic Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/annotation/Annotation;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;I)V
    .locals 0

    .line 11
    iput p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    const-string v2, "using"

    .line 6
    .line 7
    const-string v3, "keyUsing"

    .line 8
    .line 9
    const-string v4, "valueUsing"

    .line 10
    .line 11
    const-string v5, "format"

    .line 12
    .line 13
    const-string v6, "ordinal"

    .line 14
    .line 15
    const-string v7, "unwrapped"

    .line 16
    .line 17
    const-string v8, "defaultValue"

    .line 18
    .line 19
    const-string v9, "name"

    .line 20
    .line 21
    const-string v10, "label"

    .line 22
    .line 23
    const-string v11, "access"

    .line 24
    .line 25
    const v13, -0x54d84a9c

    .line 26
    .line 27
    .line 28
    const-wide/high16 v16, 0x2000000000000L

    .line 29
    .line 30
    const-string v14, "value"

    .line 31
    .line 32
    const/4 v12, 0x0

    .line 33
    iget-object v15, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;

    .line 34
    .line 35
    iget-object v0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    .line 36
    .line 37
    packed-switch v1, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    move-object/from16 v1, p1

    .line 41
    .line 42
    check-cast v1, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :try_start_0
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eq v1, v13, :cond_3

    .line 57
    .line 58
    const v3, 0x5fb28d2

    .line 59
    .line 60
    .line 61
    if-eq v1, v3, :cond_2

    .line 62
    .line 63
    const v3, 0x6ac9171

    .line 64
    .line 65
    .line 66
    if-eq v1, v3, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    check-cast v0, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_4

    .line 82
    .line 83
    iget-object v1, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 84
    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_4

    .line 92
    .line 93
    :cond_1
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    const-string v1, "index"

    .line 97
    .line 98
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_4

    .line 103
    .line 104
    check-cast v0, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    const/4 v1, -0x1

    .line 111
    if-eq v0, v1, :cond_4

    .line 112
    .line 113
    iput v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_4

    .line 121
    .line 122
    check-cast v0, Ljava/lang/Enum;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v1, "WRITE_ONLY"

    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    iput-boolean v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    :catchall_0
    :cond_4
    :goto_0
    return-void

    .line 137
    :pswitch_0
    move-object/from16 v1, p1

    .line 138
    .line 139
    check-cast v1, Ljava/lang/reflect/Method;

    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    :try_start_1
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    sparse-switch v1, :sswitch_data_0

    .line 154
    .line 155
    .line 156
    goto/16 :goto_1

    .line 157
    .line 158
    :sswitch_0
    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_5

    .line 163
    .line 164
    check-cast v0, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_5

    .line 171
    .line 172
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 173
    .line 174
    goto/16 :goto_1

    .line 175
    .line 176
    :sswitch_1
    const-string v1, "jsonDirect"

    .line 177
    .line 178
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_5

    .line 183
    .line 184
    check-cast v0, Ljava/lang/Boolean;

    .line 185
    .line 186
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_5

    .line 191
    .line 192
    iget-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 193
    .line 194
    const-wide/high16 v2, 0x4000000000000L

    .line 195
    .line 196
    or-long/2addr v0, v2

    .line 197
    iput-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :sswitch_2
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-eqz v1, :cond_5

    .line 206
    .line 207
    check-cast v0, Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-nez v1, :cond_5

    .line 214
    .line 215
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 216
    .line 217
    goto/16 :goto_1

    .line 218
    .line 219
    :sswitch_3
    const-string v1, "serialize"

    .line 220
    .line 221
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_5

    .line 226
    .line 227
    check-cast v0, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-nez v0, :cond_5

    .line 234
    .line 235
    const/4 v0, 0x1

    .line 236
    iput-boolean v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Z

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :sswitch_4
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_5

    .line 244
    .line 245
    check-cast v0, Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-nez v1, :cond_5

    .line 252
    .line 253
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :sswitch_5
    const-string v1, "serialzeFeatures"

    .line 257
    .line 258
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-eqz v1, :cond_5

    .line 263
    .line 264
    check-cast v0, [Ljava/lang/Enum;

    .line 265
    .line 266
    invoke-static {v15, v0}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;[Ljava/lang/Enum;)V

    .line 267
    .line 268
    .line 269
    goto :goto_1

    .line 270
    :sswitch_6
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    if-eqz v1, :cond_5

    .line 275
    .line 276
    check-cast v0, Ljava/lang/Boolean;

    .line 277
    .line 278
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_5

    .line 283
    .line 284
    iget-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 285
    .line 286
    or-long v0, v0, v16

    .line 287
    .line 288
    iput-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 289
    .line 290
    goto :goto_1

    .line 291
    :sswitch_7
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_5

    .line 296
    .line 297
    check-cast v0, Ljava/lang/Integer;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eqz v0, :cond_5

    .line 304
    .line 305
    iput v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 306
    .line 307
    goto :goto_1

    .line 308
    :sswitch_8
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_5

    .line 313
    .line 314
    check-cast v0, Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {v15, v0}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世(L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    goto :goto_1

    .line 320
    :sswitch_9
    const-string v1, "serializeUsing"

    .line 321
    .line 322
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_5

    .line 327
    .line 328
    check-cast v0, Ljava/lang/Class;

    .line 329
    .line 330
    const-class v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 331
    .line 332
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_5

    .line 337
    .line 338
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 339
    .line 340
    :catchall_1
    :cond_5
    :goto_1
    return-void

    .line 341
    :pswitch_1
    move-object/from16 v1, p1

    .line 342
    .line 343
    check-cast v1, Ljava/lang/reflect/Method;

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    :try_start_2
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    sparse-switch v1, :sswitch_data_1

    .line 358
    .line 359
    .line 360
    goto :goto_2

    .line 361
    :sswitch_a
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    if-eqz v1, :cond_6

    .line 366
    .line 367
    check-cast v0, Ljava/lang/Class;

    .line 368
    .line 369
    invoke-static {v0}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世(Ljava/lang/Class;)Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    if-eqz v0, :cond_6

    .line 374
    .line 375
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世:Ljava/lang/Class;

    .line 376
    .line 377
    goto :goto_2

    .line 378
    :sswitch_b
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v1

    .line 382
    if-eqz v1, :cond_6

    .line 383
    .line 384
    check-cast v0, Ljava/lang/Class;

    .line 385
    .line 386
    invoke-static {v0}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世(Ljava/lang/Class;)Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-eqz v0, :cond_6

    .line 391
    .line 392
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 393
    .line 394
    goto :goto_2

    .line 395
    :sswitch_c
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-eqz v1, :cond_6

    .line 400
    .line 401
    check-cast v0, Ljava/lang/Class;

    .line 402
    .line 403
    invoke-static {v0}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世(Ljava/lang/Class;)Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    if-eqz v0, :cond_6

    .line 408
    .line 409
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/Class;

    .line 410
    .line 411
    goto :goto_2

    .line 412
    :sswitch_d
    const-string v1, "contentAs"

    .line 413
    .line 414
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-eqz v1, :cond_6

    .line 419
    .line 420
    check-cast v0, Ljava/lang/Class;

    .line 421
    .line 422
    const-class v1, Ljava/lang/Void;

    .line 423
    .line 424
    if-eq v0, v1, :cond_6

    .line 425
    .line 426
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 427
    .line 428
    :catchall_2
    :cond_6
    :goto_2
    return-void

    .line 429
    :pswitch_2
    move-object/from16 v1, p1

    .line 430
    .line 431
    check-cast v1, Ljava/lang/reflect/Method;

    .line 432
    .line 433
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    :try_start_3
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    const-string v1, "enabled"

    .line 442
    .line 443
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v1

    .line 447
    if-eqz v1, :cond_7

    .line 448
    .line 449
    check-cast v0, Ljava/lang/Boolean;

    .line 450
    .line 451
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    if-eqz v0, :cond_7

    .line 456
    .line 457
    move-wide/from16 v0, v16

    .line 458
    .line 459
    iput-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 460
    .line 461
    :catchall_3
    :cond_7
    return-void

    .line 462
    :pswitch_3
    move-object/from16 v1, p1

    .line 463
    .line 464
    check-cast v1, Ljava/lang/reflect/Method;

    .line 465
    .line 466
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    :try_start_4
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    const v3, -0x53ecbf86

    .line 479
    .line 480
    .line 481
    if-eq v1, v3, :cond_9

    .line 482
    .line 483
    const v3, 0x6ac9171

    .line 484
    .line 485
    .line 486
    if-eq v1, v3, :cond_8

    .line 487
    .line 488
    goto :goto_3

    .line 489
    :cond_8
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    if-eqz v1, :cond_a

    .line 494
    .line 495
    check-cast v0, Ljava/lang/String;

    .line 496
    .line 497
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-nez v1, :cond_a

    .line 502
    .line 503
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 504
    .line 505
    goto :goto_3

    .line 506
    :cond_9
    const-string v1, "alternate"

    .line 507
    .line 508
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    if-eqz v1, :cond_a

    .line 513
    .line 514
    check-cast v0, [Ljava/lang/String;

    .line 515
    .line 516
    array-length v1, v0

    .line 517
    if-eqz v1, :cond_a

    .line 518
    .line 519
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 520
    .line 521
    :catchall_4
    :cond_a
    :goto_3
    return-void

    .line 522
    :pswitch_4
    move-object/from16 v1, p1

    .line 523
    .line 524
    check-cast v1, Ljava/lang/reflect/Method;

    .line 525
    .line 526
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    :try_start_5
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    if-eqz v1, :cond_b

    .line 539
    .line 540
    check-cast v0, Ljava/lang/Boolean;

    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    iput-boolean v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 547
    .line 548
    :catchall_5
    :cond_b
    return-void

    .line 549
    :pswitch_5
    move-object/from16 v1, p1

    .line 550
    .line 551
    check-cast v1, Ljava/lang/reflect/Method;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    :try_start_6
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 562
    .line 563
    .line 564
    move-result v1

    .line 565
    if-eqz v1, :cond_f

    .line 566
    .line 567
    check-cast v0, Ljava/lang/Enum;

    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    const v2, -0x7656e5

    .line 578
    .line 579
    .line 580
    if-eq v1, v2, :cond_e

    .line 581
    .line 582
    const v2, 0xa13a8f

    .line 583
    .line 584
    .line 585
    if-eq v1, v2, :cond_d

    .line 586
    .line 587
    const v2, 0x7342860f

    .line 588
    .line 589
    .line 590
    if-eq v1, v2, :cond_c

    .line 591
    .line 592
    goto :goto_4

    .line 593
    :cond_c
    const-string v1, "ALWAYS"

    .line 594
    .line 595
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    if-eqz v0, :cond_f

    .line 600
    .line 601
    iget-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 602
    .line 603
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 604
    .line 605
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 606
    .line 607
    or-long/2addr v0, v2

    .line 608
    iput-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 609
    .line 610
    goto :goto_4

    .line 611
    :cond_d
    const-string v1, "NON_DEFAULT"

    .line 612
    .line 613
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    if-eqz v0, :cond_f

    .line 618
    .line 619
    iget-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 620
    .line 621
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 622
    .line 623
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 624
    .line 625
    or-long/2addr v0, v2

    .line 626
    iput-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 627
    .line 628
    goto :goto_4

    .line 629
    :cond_e
    const-string v1, "NON_EMPTY"

    .line 630
    .line 631
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    if-eqz v0, :cond_f

    .line 636
    .line 637
    iget-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 638
    .line 639
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 640
    .line 641
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 642
    .line 643
    or-long/2addr v0, v2

    .line 644
    iput-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 645
    .line 646
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 647
    .line 648
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 649
    .line 650
    or-long/2addr v0, v2

    .line 651
    iput-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 652
    .line 653
    :catchall_6
    :cond_f
    :goto_4
    return-void

    .line 654
    :pswitch_6
    move-object/from16 v1, p1

    .line 655
    .line 656
    check-cast v1, Ljava/lang/reflect/Method;

    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    :try_start_7
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    const v3, 0x6ac9171

    .line 671
    .line 672
    .line 673
    if-eq v1, v3, :cond_10

    .line 674
    .line 675
    goto :goto_5

    .line 676
    :cond_10
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 677
    .line 678
    .line 679
    move-result v1

    .line 680
    if-eqz v1, :cond_11

    .line 681
    .line 682
    check-cast v0, Ljava/lang/String;

    .line 683
    .line 684
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 685
    .line 686
    .line 687
    move-result v1

    .line 688
    if-nez v1, :cond_11

    .line 689
    .line 690
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 691
    .line 692
    :catchall_7
    :cond_11
    :goto_5
    return-void

    .line 693
    :pswitch_7
    move-object/from16 v1, p1

    .line 694
    .line 695
    check-cast v1, Ljava/lang/reflect/Method;

    .line 696
    .line 697
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v5

    .line 701
    :try_start_8
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    const v6, 0x6a69c84

    .line 710
    .line 711
    .line 712
    if-eq v1, v6, :cond_14

    .line 713
    .line 714
    const v2, 0x1d513165

    .line 715
    .line 716
    .line 717
    if-eq v1, v2, :cond_13

    .line 718
    .line 719
    const v2, 0x793d5993

    .line 720
    .line 721
    .line 722
    if-eq v1, v2, :cond_12

    .line 723
    .line 724
    goto :goto_6

    .line 725
    :cond_12
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 726
    .line 727
    .line 728
    move-result v1

    .line 729
    if-eqz v1, :cond_15

    .line 730
    .line 731
    check-cast v0, Ljava/lang/Class;

    .line 732
    .line 733
    invoke-static {v0}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏哲楪(Ljava/lang/Class;)Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    if-eqz v0, :cond_15

    .line 738
    .line 739
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 740
    .line 741
    goto :goto_6

    .line 742
    :cond_13
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v1

    .line 746
    if-eqz v1, :cond_15

    .line 747
    .line 748
    check-cast v0, Ljava/lang/Class;

    .line 749
    .line 750
    invoke-static {v0}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏哲楪(Ljava/lang/Class;)Ljava/lang/Class;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    if-eqz v0, :cond_15

    .line 755
    .line 756
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 757
    .line 758
    goto :goto_6

    .line 759
    :cond_14
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result v1

    .line 763
    if-eqz v1, :cond_15

    .line 764
    .line 765
    check-cast v0, Ljava/lang/Class;

    .line 766
    .line 767
    invoke-static {v0}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏哲楪(Ljava/lang/Class;)Ljava/lang/Class;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    if-eqz v0, :cond_15

    .line 772
    .line 773
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 774
    .line 775
    :catchall_8
    :cond_15
    :goto_6
    return-void

    .line 776
    :pswitch_8
    move-object/from16 v1, p1

    .line 777
    .line 778
    check-cast v1, Ljava/lang/reflect/Method;

    .line 779
    .line 780
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    :try_start_9
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v14, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    move-result v1

    .line 792
    if-eqz v1, :cond_16

    .line 793
    .line 794
    check-cast v0, [Ljava/lang/String;

    .line 795
    .line 796
    array-length v1, v0

    .line 797
    if-eqz v1, :cond_16

    .line 798
    .line 799
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 800
    .line 801
    :catchall_9
    :cond_16
    return-void

    .line 802
    :pswitch_9
    move-object/from16 v1, p1

    .line 803
    .line 804
    check-cast v1, Ljava/lang/reflect/Method;

    .line 805
    .line 806
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    :try_start_a
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 815
    .line 816
    .line 817
    move-result v1

    .line 818
    if-eq v1, v13, :cond_1a

    .line 819
    .line 820
    const v3, -0x176ed461

    .line 821
    .line 822
    .line 823
    if-eq v1, v3, :cond_19

    .line 824
    .line 825
    const v3, 0x6ac9171

    .line 826
    .line 827
    .line 828
    if-eq v1, v3, :cond_17

    .line 829
    .line 830
    goto :goto_7

    .line 831
    :cond_17
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v1

    .line 835
    if-eqz v1, :cond_1b

    .line 836
    .line 837
    check-cast v0, Ljava/lang/String;

    .line 838
    .line 839
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    if-nez v1, :cond_1b

    .line 844
    .line 845
    iget-object v1, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 846
    .line 847
    if-eqz v1, :cond_18

    .line 848
    .line 849
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 850
    .line 851
    .line 852
    move-result v1

    .line 853
    if-eqz v1, :cond_1b

    .line 854
    .line 855
    :cond_18
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 856
    .line 857
    goto :goto_7

    .line 858
    :cond_19
    const-string v1, "required"

    .line 859
    .line 860
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    move-result v1

    .line 864
    if-eqz v1, :cond_1b

    .line 865
    .line 866
    check-cast v0, Ljava/lang/Boolean;

    .line 867
    .line 868
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 869
    .line 870
    .line 871
    move-result v0

    .line 872
    if-eqz v0, :cond_1b

    .line 873
    .line 874
    const/4 v0, 0x1

    .line 875
    iput-boolean v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Z

    .line 876
    .line 877
    goto :goto_7

    .line 878
    :cond_1a
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v1

    .line 882
    if-eqz v1, :cond_1b

    .line 883
    .line 884
    check-cast v0, Ljava/lang/Enum;

    .line 885
    .line 886
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    const-string v1, "READ_ONLY"

    .line 891
    .line 892
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-result v0

    .line 896
    iput-boolean v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 897
    .line 898
    :catchall_a
    :cond_1b
    :goto_7
    return-void

    .line 899
    :pswitch_a
    move-object/from16 v1, p1

    .line 900
    .line 901
    check-cast v1, Ljava/lang/reflect/Method;

    .line 902
    .line 903
    const-string v2, "\'T\'"

    .line 904
    .line 905
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v3

    .line 909
    :try_start_b
    invoke-virtual {v1, v0, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 910
    .line 911
    .line 912
    move-result-object v0

    .line 913
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 914
    .line 915
    .line 916
    move-result v1

    .line 917
    sparse-switch v1, :sswitch_data_2

    .line 918
    .line 919
    .line 920
    goto/16 :goto_a

    .line 921
    .line 922
    :sswitch_e
    const-string v1, "deserialize"

    .line 923
    .line 924
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    if-eqz v1, :cond_22

    .line 929
    .line 930
    check-cast v0, Ljava/lang/Boolean;

    .line 931
    .line 932
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 933
    .line 934
    .line 935
    move-result v0

    .line 936
    if-nez v0, :cond_22

    .line 937
    .line 938
    const/4 v0, 0x1

    .line 939
    iput-boolean v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏:Z

    .line 940
    .line 941
    goto/16 :goto_a

    .line 942
    .line 943
    :sswitch_f
    const-string v1, "deserializeUsing"

    .line 944
    .line 945
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v1

    .line 949
    if-eqz v1, :cond_22

    .line 950
    .line 951
    check-cast v0, Ljava/lang/Class;

    .line 952
    .line 953
    const-class v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 954
    .line 955
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 956
    .line 957
    .line 958
    move-result v1

    .line 959
    if-eqz v1, :cond_22

    .line 960
    .line 961
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:Ljava/lang/Class;

    .line 962
    .line 963
    goto/16 :goto_a

    .line 964
    .line 965
    :sswitch_10
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 966
    .line 967
    .line 968
    move-result v1

    .line 969
    if-eqz v1, :cond_22

    .line 970
    .line 971
    check-cast v0, Ljava/lang/String;

    .line 972
    .line 973
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 974
    .line 975
    .line 976
    move-result v1

    .line 977
    if-nez v1, :cond_22

    .line 978
    .line 979
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 980
    .line 981
    goto/16 :goto_a

    .line 982
    .line 983
    :sswitch_11
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result v1

    .line 987
    if-eqz v1, :cond_22

    .line 988
    .line 989
    check-cast v0, Ljava/lang/String;

    .line 990
    .line 991
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 992
    .line 993
    .line 994
    move-result v1

    .line 995
    if-nez v1, :cond_22

    .line 996
    .line 997
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 998
    .line 999
    goto/16 :goto_a

    .line 1000
    .line 1001
    :sswitch_12
    const-string v1, "alternateNames"

    .line 1002
    .line 1003
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    move-result v1

    .line 1007
    if-eqz v1, :cond_22

    .line 1008
    .line 1009
    check-cast v0, [Ljava/lang/String;

    .line 1010
    .line 1011
    array-length v1, v0

    .line 1012
    if-eqz v1, :cond_22

    .line 1013
    .line 1014
    iget-object v1, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 1015
    .line 1016
    if-nez v1, :cond_1c

    .line 1017
    .line 1018
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 1019
    .line 1020
    goto/16 :goto_a

    .line 1021
    .line 1022
    :cond_1c
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 1023
    .line 1024
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1025
    .line 1026
    .line 1027
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1032
    .line 1033
    .line 1034
    iget-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 1035
    .line 1036
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 1041
    .line 1042
    .line 1043
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 1044
    .line 1045
    .line 1046
    move-result v0

    .line 1047
    new-array v0, v0, [Ljava/lang/String;

    .line 1048
    .line 1049
    invoke-interface {v1, v0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v0

    .line 1053
    check-cast v0, [Ljava/lang/String;

    .line 1054
    .line 1055
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 1056
    .line 1057
    goto/16 :goto_a

    .line 1058
    .line 1059
    :sswitch_13
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v1

    .line 1063
    if-eqz v1, :cond_22

    .line 1064
    .line 1065
    check-cast v0, Ljava/lang/String;

    .line 1066
    .line 1067
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1068
    .line 1069
    .line 1070
    move-result v1

    .line 1071
    if-nez v1, :cond_22

    .line 1072
    .line 1073
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 1074
    .line 1075
    goto/16 :goto_a

    .line 1076
    .line 1077
    :sswitch_14
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1078
    .line 1079
    .line 1080
    move-result v1

    .line 1081
    if-eqz v1, :cond_22

    .line 1082
    .line 1083
    check-cast v0, Ljava/lang/Boolean;

    .line 1084
    .line 1085
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v0

    .line 1089
    if-eqz v0, :cond_22

    .line 1090
    .line 1091
    iget-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 1092
    .line 1093
    const-wide/high16 v16, 0x2000000000000L

    .line 1094
    .line 1095
    or-long v0, v0, v16

    .line 1096
    .line 1097
    iput-wide v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 1098
    .line 1099
    goto/16 :goto_a

    .line 1100
    .line 1101
    :sswitch_15
    const-string v1, "parseFeatures"

    .line 1102
    .line 1103
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v1

    .line 1107
    if-eqz v1, :cond_22

    .line 1108
    .line 1109
    check-cast v0, [Ljava/lang/Enum;

    .line 1110
    .line 1111
    array-length v1, v0

    .line 1112
    const/4 v2, 0x0

    .line 1113
    :goto_8
    if-ge v2, v1, :cond_22

    .line 1114
    .line 1115
    aget-object v3, v0, v2

    .line 1116
    .line 1117
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v3

    .line 1121
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 1122
    .line 1123
    .line 1124
    move-result v4

    .line 1125
    const v5, -0x35496aab    # -5982890.5f

    .line 1126
    .line 1127
    .line 1128
    if-eq v4, v5, :cond_1f

    .line 1129
    .line 1130
    const v5, -0xbf831a8

    .line 1131
    .line 1132
    .line 1133
    if-eq v4, v5, :cond_1e

    .line 1134
    .line 1135
    const v5, 0x778dede2

    .line 1136
    .line 1137
    .line 1138
    if-eq v4, v5, :cond_1d

    .line 1139
    .line 1140
    goto :goto_9

    .line 1141
    :cond_1d
    const-string v4, "InitStringFieldAsEmpty"

    .line 1142
    .line 1143
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v3

    .line 1147
    if-eqz v3, :cond_20

    .line 1148
    .line 1149
    iget-wide v3, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 1150
    .line 1151
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1152
    .line 1153
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1154
    .line 1155
    or-long/2addr v3, v5

    .line 1156
    iput-wide v3, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 1157
    .line 1158
    goto :goto_9

    .line 1159
    :cond_1e
    const-string v4, "SupportAutoType"

    .line 1160
    .line 1161
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1162
    .line 1163
    .line 1164
    move-result v3

    .line 1165
    if-eqz v3, :cond_20

    .line 1166
    .line 1167
    iget-wide v3, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 1168
    .line 1169
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1170
    .line 1171
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1172
    .line 1173
    or-long/2addr v3, v5

    .line 1174
    iput-wide v3, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 1175
    .line 1176
    goto :goto_9

    .line 1177
    :cond_1f
    const-string v4, "SupportArrayToBean"

    .line 1178
    .line 1179
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1180
    .line 1181
    .line 1182
    move-result v3

    .line 1183
    if-eqz v3, :cond_20

    .line 1184
    .line 1185
    iget-wide v3, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 1186
    .line 1187
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 1188
    .line 1189
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 1190
    .line 1191
    or-long/2addr v3, v5

    .line 1192
    iput-wide v3, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:J

    .line 1193
    .line 1194
    :cond_20
    :goto_9
    add-int/lit8 v2, v2, 0x1

    .line 1195
    .line 1196
    goto :goto_8

    .line 1197
    :sswitch_16
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1198
    .line 1199
    .line 1200
    move-result v1

    .line 1201
    if-eqz v1, :cond_22

    .line 1202
    .line 1203
    check-cast v0, Ljava/lang/Integer;

    .line 1204
    .line 1205
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1206
    .line 1207
    .line 1208
    move-result v0

    .line 1209
    if-eqz v0, :cond_22

    .line 1210
    .line 1211
    iput v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 1212
    .line 1213
    goto :goto_a

    .line 1214
    :sswitch_17
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1215
    .line 1216
    .line 1217
    move-result v1

    .line 1218
    if-eqz v1, :cond_22

    .line 1219
    .line 1220
    check-cast v0, Ljava/lang/String;

    .line 1221
    .line 1222
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 1223
    .line 1224
    .line 1225
    move-result v1

    .line 1226
    if-nez v1, :cond_22

    .line 1227
    .line 1228
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    const/16 v1, 0x54

    .line 1233
    .line 1234
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 1235
    .line 1236
    .line 1237
    move-result v1

    .line 1238
    const/4 v3, -0x1

    .line 1239
    if-eq v1, v3, :cond_21

    .line 1240
    .line 1241
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1242
    .line 1243
    .line 1244
    move-result v1

    .line 1245
    if-nez v1, :cond_21

    .line 1246
    .line 1247
    const-string v1, "T"

    .line 1248
    .line 1249
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    :cond_21
    iput-object v0, v15, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1254
    .line 1255
    :catchall_b
    :cond_22
    :goto_a
    return-void

    .line 1256
    nop

    .line 1257
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

    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    :sswitch_data_0
    .sparse-switch
        -0x51c06e7c -> :sswitch_9
        -0x4ba00809 -> :sswitch_8
        -0x47f1458f -> :sswitch_7
        -0x3ade7834 -> :sswitch_6
        -0x3814e684 -> :sswitch_5
        -0x27497450 -> :sswitch_4
        -0x222e9920 -> :sswitch_3
        0x337a8b -> :sswitch_2
        0xbd26f1 -> :sswitch_1
        0x61f7ef4 -> :sswitch_0
    .end sparse-switch

    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    :sswitch_data_1
    .sparse-switch
        -0x1843fd75 -> :sswitch_d
        0x6a69c84 -> :sswitch_c
        0x1d513165 -> :sswitch_b
        0x793d5993 -> :sswitch_a
    .end sparse-switch

    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    :sswitch_data_2
    .sparse-switch
        -0x4ba00809 -> :sswitch_17
        -0x47f1458f -> :sswitch_16
        -0x4000fff0 -> :sswitch_15
        -0x3ade7834 -> :sswitch_14
        -0x27497450 -> :sswitch_13
        -0xd631d12 -> :sswitch_12
        0x337a8b -> :sswitch_11
        0x61f7ef4 -> :sswitch_10
        0x3ecb2845 -> :sswitch_f
        0x6820db7f -> :sswitch_e
    .end sparse-switch
.end method
