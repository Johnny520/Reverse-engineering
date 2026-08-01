.class public final synthetic Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    const v3, 0x240902af

    .line 8
    .line 9
    .line 10
    const v6, 0x240902b0

    .line 11
    .line 12
    .line 13
    const-wide v9, -0x36a5d115051405a7L    # -2.335625999683132E45

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const v11, 0x240902ae

    .line 19
    .line 20
    .line 21
    const v12, 0x240c00eb

    .line 22
    .line 23
    .line 24
    const-wide v13, -0x36a5003d051405a7L    # -2.4083974255433764E45

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/4 v15, 0x4

    .line 30
    const-wide v16, -0x36a57b58051405a7L    # -2.365501430369323E45

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide v18, -0x36a57282051405a7L    # -2.3685803052252235E45

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const-wide v20, -0x36a5d0ca051405a7L    # -2.3357280843932084E45

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const-class v4, Ljava/lang/String;

    .line 46
    .line 47
    const-wide v22, -0x36a572df051405a7L    # -2.368453720184729E45

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    const-wide v24, -0x36a54ec1051405a7L    # -2.381038723242933E45

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    const/4 v5, 0x1

    .line 58
    const-wide v26, -0x36a592e4051405a7L    # -2.3572965419381252E45

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    iget-object v0, v0, Lcom/google/android/material/textfield/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 66
    .line 67
    packed-switch v2, :pswitch_data_0

    .line 68
    .line 69
    .line 70
    check-cast v0, Landroid/widget/Switch;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    xor-int/2addr v1, v5

    .line 77
    invoke-virtual {v0, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_0
    check-cast v0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;

    .line 82
    .line 83
    iget-object v1, v0, L飘花落叶言子苏世兰楪哲/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏兰哲世;

    .line 86
    .line 87
    iget-object v1, v1, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_1

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    check-cast v3, Ljava/util/Map$Entry;

    .line 113
    .line 114
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_0

    .line 125
    .line 126
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Ljava/lang/Iterable;

    .line 143
    .line 144
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪兰世苏(Ljava/lang/Iterable;)Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    const-wide v0, -0x36a43270051405a7L    # -2.480108531548295E45

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_2
    new-instance v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 168
    .line 169
    invoke-direct {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 170
    .line 171
    .line 172
    const-wide v3, -0x36a4327e051405a7L    # -2.4800894757357474E45

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    iput-object v5, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 182
    .line 183
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 184
    .line 185
    .line 186
    new-instance v5, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    const-wide v6, -0x36a4327b051405a7L    # -2.4800935591241504E45

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    const-wide v6, -0x36a43262051405a7L    # -2.4801275873608425E45

    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    iput-object v5, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 227
    .line 228
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 229
    .line 230
    .line 231
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    new-instance v4, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;

    .line 236
    .line 237
    invoke-direct {v4, v0, v15, v1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2, v3, v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 241
    .line 242
    .line 243
    invoke-static/range {v24 .. v25}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iput-object v0, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 248
    .line 249
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 253
    .line 254
    .line 255
    :goto_1
    return-void

    .line 256
    :pswitch_1
    check-cast v0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;

    .line 257
    .line 258
    iget-object v1, v0, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;

    .line 259
    .line 260
    iget-object v1, v1, L飘花落叶言苏哲楪子兰世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲:Ljava/util/LinkedHashMap;

    .line 261
    .line 262
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 263
    .line 264
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_4

    .line 280
    .line 281
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    check-cast v3, Ljava/util/Map$Entry;

    .line 286
    .line 287
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    check-cast v4, Ljava/lang/Boolean;

    .line 292
    .line 293
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 294
    .line 295
    .line 296
    move-result v4

    .line 297
    if-eqz v4, :cond_3

    .line 298
    .line 299
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_4
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, Ljava/lang/Iterable;

    .line 316
    .line 317
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪兰世苏(Ljava/lang/Iterable;)Ljava/util/List;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    if-eqz v2, :cond_5

    .line 326
    .line 327
    const-wide v0, -0x36a43301051405a7L    # -2.4799111677754808E45

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_5
    new-instance v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 341
    .line 342
    invoke-direct {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 343
    .line 344
    .line 345
    const-wide v3, -0x36a54eb4051405a7L    # -2.3810564179260128E45

    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    iput-object v5, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 355
    .line 356
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 357
    .line 358
    .line 359
    new-instance v5, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 362
    .line 363
    .line 364
    const-wide v6, -0x36a43308051405a7L    # -2.479901639869207E45

    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    const-wide v6, -0x36a432f7051405a7L    # -2.4799247790701576E45

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    invoke-static {v6, v7}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    iput-object v5, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 400
    .line 401
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 402
    .line 403
    .line 404
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    new-instance v4, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;

    .line 409
    .line 410
    const/4 v5, 0x3

    .line 411
    invoke-direct {v4, v0, v5, v1}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v3, v4}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 415
    .line 416
    .line 417
    invoke-static/range {v24 .. v25}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    iput-object v0, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 427
    .line 428
    .line 429
    :goto_3
    return-void

    .line 430
    :pswitch_2
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;

    .line 431
    .line 432
    if-eqz v0, :cond_6

    .line 433
    .line 434
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪()V

    .line 435
    .line 436
    .line 437
    :cond_6
    return-void

    .line 438
    :pswitch_3
    check-cast v0, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏兰哲;

    .line 439
    .line 440
    sget-object v1, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 441
    .line 442
    const-wide v1, -0x36a5da5f051405a7L    # -2.3323892338089802E45

    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    new-instance v2, Ljava/lang/StringBuilder;

    .line 452
    .line 453
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 454
    .line 455
    .line 456
    const-wide v3, -0x36a5da46051405a7L    # -2.3324232620456723E45

    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v3

    .line 465
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    sget-object v3, L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/String;

    .line 469
    .line 470
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 471
    .line 472
    .line 473
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    invoke-static {v2, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    const-wide v2, -0x36a5da21051405a7L    # -2.3324736238359766E45

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    new-instance v3, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏世兰;

    .line 491
    .line 492
    const/4 v4, 0x2

    .line 493
    invoke-direct {v3, v0, v4}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏世兰;-><init>(Ljava/lang/Object;I)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v1, v2, v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 497
    .line 498
    .line 499
    return-void

    .line 500
    :pswitch_4
    check-cast v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲兰世;

    .line 501
    .line 502
    iget-object v0, v0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;

    .line 503
    .line 504
    invoke-virtual {v0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :pswitch_5
    check-cast v0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世苏兰哲;

    .line 509
    .line 510
    sget v1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:I

    .line 511
    .line 512
    const-wide v1, -0x36a57453051405a7L    # -2.3679473800227506E45

    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    const-wide v2, -0x36a57444051405a7L    # -2.3679677969647658E45

    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-static {v2, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    const-wide v2, -0x36a53196051405a7L    # -2.3912022769781275E45

    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v2

    .line 543
    new-instance v3, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏世兰;

    .line 544
    .line 545
    invoke-direct {v3, v0, v5}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪哲苏世兰;-><init>(Ljava/lang/Object;I)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v1, v2, v3}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 549
    .line 550
    .line 551
    return-void

    .line 552
    :pswitch_6
    check-cast v0, L飘花落叶言苏世兰哲楪子/飘花落叶言子楪世兰哲苏;

    .line 553
    .line 554
    new-instance v1, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;

    .line 555
    .line 556
    new-instance v2, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 557
    .line 558
    const/16 v3, 0x19

    .line 559
    .line 560
    invoke-direct {v2, v0, v3}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 561
    .line 562
    .line 563
    invoke-direct {v1, v2}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲世兰;)V

    .line 564
    .line 565
    .line 566
    iget-object v0, v0, L飘花落叶言苏世兰哲楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 567
    .line 568
    invoke-static/range {v22 .. v23}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    invoke-virtual {v0, v4, v2}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 573
    .line 574
    .line 575
    move-result-object v0

    .line 576
    invoke-virtual {v1, v0}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;)V

    .line 577
    .line 578
    .line 579
    iget-object v0, v1, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 580
    .line 581
    invoke-static/range {v18 .. v19}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v2

    .line 585
    invoke-virtual {v0, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲()V

    .line 589
    .line 590
    .line 591
    return-void

    .line 592
    :pswitch_7
    check-cast v0, L飘花落叶言苏世兰哲楪子/飘花落叶言子楪世哲兰苏;

    .line 593
    .line 594
    new-instance v1, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;

    .line 595
    .line 596
    new-instance v2, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 597
    .line 598
    const/16 v3, 0x18

    .line 599
    .line 600
    invoke-direct {v2, v0, v3}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 601
    .line 602
    .line 603
    invoke-direct {v1, v2}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲世兰;)V

    .line 604
    .line 605
    .line 606
    iget-object v0, v0, L飘花落叶言苏世兰哲楪子/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 607
    .line 608
    invoke-static/range {v22 .. v23}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    invoke-virtual {v0, v4, v2}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    invoke-virtual {v1, v0}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;)V

    .line 617
    .line 618
    .line 619
    iget-object v0, v1, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 620
    .line 621
    invoke-static/range {v18 .. v19}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    invoke-virtual {v0, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v1}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲()V

    .line 629
    .line 630
    .line 631
    return-void

    .line 632
    :pswitch_8
    check-cast v0, L飘花落叶言苏世兰哲楪子/飘花落叶言子楪世苏兰哲;

    .line 633
    .line 634
    sget v1, L飘花落叶言苏世兰哲楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:I

    .line 635
    .line 636
    new-instance v1, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;

    .line 637
    .line 638
    new-instance v2, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;

    .line 639
    .line 640
    const/16 v3, 0x17

    .line 641
    .line 642
    invoke-direct {v2, v0, v3}, Landroidx/fragment/app/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 643
    .line 644
    .line 645
    invoke-direct {v1, v2}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;-><init>(L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲世兰;)V

    .line 646
    .line 647
    .line 648
    iget-object v0, v0, L飘花落叶言苏世兰哲楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 649
    .line 650
    invoke-static/range {v22 .. v23}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    invoke-virtual {v0, v4, v2}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-virtual {v1, v0}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/util/ArrayList;)V

    .line 659
    .line 660
    .line 661
    iget-object v0, v1, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 662
    .line 663
    invoke-static/range {v18 .. v19}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v2

    .line 667
    invoke-virtual {v0, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰苏哲楪(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v1}, L飘花落叶言苏哲楪世子兰/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲()V

    .line 671
    .line 672
    .line 673
    return-void

    .line 674
    :pswitch_9
    check-cast v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;

    .line 675
    .line 676
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪苏哲兰世;->飘花落叶言子世哲苏兰楪()V

    .line 677
    .line 678
    .line 679
    const-wide v0, -0x36a5fb0a051405a7L    # -2.321006108070741E45

    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-static {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪哲苏(Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    new-instance v1, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 693
    .line 694
    const/16 v2, 0xe

    .line 695
    .line 696
    invoke-direct {v1, v2}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 697
    .line 698
    .line 699
    iput-object v1, v0, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰苏楪哲:L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;

    .line 700
    .line 701
    invoke-virtual {v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世兰楪苏哲()V

    .line 702
    .line 703
    .line 704
    new-instance v0, Ljava/lang/Thread;

    .line 705
    .line 706
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 707
    .line 708
    const/16 v2, 0xd

    .line 709
    .line 710
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 711
    .line 712
    .line 713
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 717
    .line 718
    .line 719
    return-void

    .line 720
    :pswitch_a
    check-cast v0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲苏兰;

    .line 721
    .line 722
    iget-object v2, v0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 723
    .line 724
    if-nez v2, :cond_7

    .line 725
    .line 726
    new-instance v2, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 727
    .line 728
    const-wide v3, -0x36a53270051405a7L    # -2.3909055507541724E45

    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    invoke-direct {v2, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    iput-object v2, v0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 741
    .line 742
    :cond_7
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    new-instance v2, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 747
    .line 748
    invoke-direct {v2, v1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 749
    .line 750
    .line 751
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    const v3, 0x240c00f3

    .line 756
    .line 757
    .line 758
    invoke-virtual {v1, v3, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    const v3, 0x24090076

    .line 763
    .line 764
    .line 765
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 766
    .line 767
    .line 768
    move-result-object v3

    .line 769
    check-cast v3, Landroid/widget/EditText;

    .line 770
    .line 771
    iget-object v4, v0, L飘花落叶言世哲苏楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 772
    .line 773
    const-wide v5, -0x36a517ec051405a7L    # -2.4001448975808098E45

    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v5

    .line 782
    invoke-virtual {v4, v5}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    check-cast v4, Ljava/lang/String;

    .line 787
    .line 788
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 789
    .line 790
    .line 791
    const v4, 0x240902cb

    .line 792
    .line 793
    .line 794
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 795
    .line 796
    .line 797
    move-result-object v4

    .line 798
    check-cast v4, Landroid/widget/Button;

    .line 799
    .line 800
    new-instance v5, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;

    .line 801
    .line 802
    invoke-direct {v5, v0, v3, v2, v15}, Llin/xposed/hook/javaplugin/view/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v2, v1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 809
    .line 810
    .line 811
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 812
    .line 813
    .line 814
    return-void

    .line 815
    :pswitch_b
    check-cast v0, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 816
    .line 817
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 818
    .line 819
    .line 820
    return-void

    .line 821
    :pswitch_c
    move-object v2, v0

    .line 822
    check-cast v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲兰苏楪;

    .line 823
    .line 824
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    new-instance v6, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 829
    .line 830
    invoke-direct {v6, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 831
    .line 832
    .line 833
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    const v1, 0x240c00fe

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0, v1, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    const v1, 0x2409020b

    .line 845
    .line 846
    .line 847
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    move-object v3, v1

    .line 852
    check-cast v3, Landroid/widget/EditText;

    .line 853
    .line 854
    iget-object v1, v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 855
    .line 856
    const-wide v4, -0x36a51d1f051405a7L    # -2.3983332342593227E45

    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    invoke-virtual {v1, v4}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v4

    .line 869
    check-cast v4, Ljava/lang/CharSequence;

    .line 870
    .line 871
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 872
    .line 873
    .line 874
    const v4, 0x2409020c

    .line 875
    .line 876
    .line 877
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 878
    .line 879
    .line 880
    move-result-object v4

    .line 881
    check-cast v4, Landroid/widget/EditText;

    .line 882
    .line 883
    const-wide v7, -0x36a51d06051405a7L    # -2.3983672624960148E45

    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v5

    .line 892
    invoke-virtual {v1, v5}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v5

    .line 896
    check-cast v5, Ljava/lang/CharSequence;

    .line 897
    .line 898
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 899
    .line 900
    .line 901
    const v5, 0x24090359

    .line 902
    .line 903
    .line 904
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 905
    .line 906
    .line 907
    move-result-object v5

    .line 908
    check-cast v5, Landroid/widget/EditText;

    .line 909
    .line 910
    const-wide v7, -0x36a51d0d051405a7L    # -2.398357734589741E45

    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v7

    .line 919
    invoke-virtual {v1, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    move-result-object v1

    .line 923
    check-cast v1, Ljava/lang/CharSequence;

    .line 924
    .line 925
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 926
    .line 927
    .line 928
    const v1, 0x240902cf

    .line 929
    .line 930
    .line 931
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 932
    .line 933
    .line 934
    move-result-object v1

    .line 935
    move-object v7, v1

    .line 936
    check-cast v7, Landroid/widget/Button;

    .line 937
    .line 938
    new-instance v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲兰楪苏;

    .line 939
    .line 940
    invoke-direct/range {v1 .. v6}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲兰楪苏;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲兰苏楪;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v6, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v6}, Landroid/app/Dialog;->show()V

    .line 950
    .line 951
    .line 952
    return-void

    .line 953
    :pswitch_d
    check-cast v0, Landroid/content/Context;

    .line 954
    .line 955
    invoke-static {v0}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;)V

    .line 956
    .line 957
    .line 958
    return-void

    .line 959
    :pswitch_e
    check-cast v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪哲苏世兰;

    .line 960
    .line 961
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    iget-object v0, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 966
    .line 967
    invoke-static {v1, v0}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroid/content/Context;Ljava/lang/String;)Z

    .line 968
    .line 969
    .line 970
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 975
    .line 976
    .line 977
    return-void

    .line 978
    :pswitch_f
    check-cast v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲兰苏;

    .line 979
    .line 980
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 981
    .line 982
    .line 983
    move-result-object v1

    .line 984
    iget-object v0, v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 985
    .line 986
    invoke-static {v1, v0}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世苏兰(Landroid/content/Context;Ljava/lang/String;)Z

    .line 987
    .line 988
    .line 989
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 994
    .line 995
    .line 996
    return-void

    .line 997
    :pswitch_10
    check-cast v0, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;

    .line 998
    .line 999
    sget-object v1, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 1000
    .line 1001
    new-instance v2, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;

    .line 1002
    .line 1003
    invoke-direct {v2, v0, v8}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世苏兰哲;I)V

    .line 1004
    .line 1005
    .line 1006
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1007
    .line 1008
    .line 1009
    return-void

    .line 1010
    :pswitch_11
    check-cast v0, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;

    .line 1011
    .line 1012
    invoke-virtual {v0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Landroidx/fragment/app/FragmentActivity;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v0

    .line 1016
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 1017
    .line 1018
    .line 1019
    return-void

    .line 1020
    :pswitch_12
    check-cast v0, Llin/xposed/hook/view/main/MainSettingActivity;

    .line 1021
    .line 1022
    invoke-static {v0, v1}, Llin/xposed/hook/view/main/MainSettingActivity;->飘花落叶言子楪哲兰苏世(Llin/xposed/hook/view/main/MainSettingActivity;Landroid/view/View;)V

    .line 1023
    .line 1024
    .line 1025
    return-void

    .line 1026
    :pswitch_13
    check-cast v0, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    .line 1027
    .line 1028
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v1

    .line 1032
    instance-of v2, v1, Llin/xposed/hook/view/main/MainSettingActivity;

    .line 1033
    .line 1034
    if-eqz v2, :cond_8

    .line 1035
    .line 1036
    check-cast v1, Llin/xposed/hook/view/main/MainSettingActivity;

    .line 1037
    .line 1038
    goto :goto_4

    .line 1039
    :cond_8
    move-object v1, v7

    .line 1040
    :goto_4
    if-nez v1, :cond_9

    .line 1041
    .line 1042
    goto/16 :goto_5

    .line 1043
    .line 1044
    :cond_9
    invoke-virtual {v0}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->getItemName()Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v2

    .line 1048
    const-wide v3, -0x36a57ccf051405a7L    # -2.3649910068189414E45

    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v1, v2}, Llin/xposed/hook/view/main/MainSettingActivity;->setTitleCenterText(Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    new-instance v1, Landroid/os/Bundle;

    .line 1063
    .line 1064
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1065
    .line 1066
    .line 1067
    const-wide v2, -0x36a5491e051405a7L    # -2.3830028330648006E45

    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v2

    .line 1076
    invoke-virtual {v0}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->getItemName()Ljava/lang/String;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v3

    .line 1080
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    sget-object v2, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲世楪兰:L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏兰哲;

    .line 1084
    .line 1085
    invoke-virtual {v2}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世哲兰()Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    const-wide v3, -0x36a57cb8051405a7L    # -2.3650223127966982E45

    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v0}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->getItemName()Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v3

    .line 1101
    invoke-virtual {v2, v3}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世楪兰苏哲(Ljava/lang/String;)Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v3

    .line 1105
    if-nez v3, :cond_a

    .line 1106
    .line 1107
    new-instance v3, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;

    .line 1108
    .line 1109
    invoke-direct {v3, v0}, L飘花落叶言世兰子哲苏楪/飘花落叶言子楪世苏哲兰;-><init>(Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;)V

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v3, v1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏楪哲兰(Landroid/os/Bundle;)V

    .line 1113
    .line 1114
    .line 1115
    :cond_a
    new-instance v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;

    .line 1116
    .line 1117
    invoke-direct {v1, v2}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;)V

    .line 1118
    .line 1119
    .line 1120
    const v2, 0x2401003f

    .line 1121
    .line 1122
    .line 1123
    iput v2, v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 1124
    .line 1125
    const v2, 0x24010040

    .line 1126
    .line 1127
    .line 1128
    iput v2, v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 1129
    .line 1130
    const v2, 0x2401002e

    .line 1131
    .line 1132
    .line 1133
    iput v2, v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 1134
    .line 1135
    const v2, 0x2401002f

    .line 1136
    .line 1137
    .line 1138
    iput v2, v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:I

    .line 1139
    .line 1140
    iget-boolean v2, v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:Z

    .line 1141
    .line 1142
    if-eqz v2, :cond_b

    .line 1143
    .line 1144
    iput-boolean v5, v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:Z

    .line 1145
    .line 1146
    iput-object v7, v1, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/String;

    .line 1147
    .line 1148
    sget-object v2, Llin/xposed/hook/view/main/MainSettingActivity;->Companion:L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏哲兰世;

    .line 1149
    .line 1150
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v0}, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->getItemName()Ljava/lang/String;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v0

    .line 1157
    const v2, 0x240901a5

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v1, v2, v3, v0}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(ILandroidx/fragment/app/飘花落叶言子楪兰苏哲世;Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v1, v8}, Landroidx/fragment/app/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Z)I

    .line 1164
    .line 1165
    .line 1166
    goto :goto_5

    .line 1167
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 1168
    .line 1169
    const-string v1, "This FragmentTransaction is not allowed to be added to the back stack."

    .line 1170
    .line 1171
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1175
    :catch_0
    move-exception v0

    .line 1176
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Exception;)V

    .line 1177
    .line 1178
    .line 1179
    :goto_5
    return-void

    .line 1180
    :pswitch_14
    check-cast v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;

    .line 1181
    .line 1182
    iget-object v0, v0, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲:L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;

    .line 1183
    .line 1184
    if-eqz v0, :cond_c

    .line 1185
    .line 1186
    invoke-virtual {v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰()Landroid/view/View$OnClickListener;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    if-eqz v0, :cond_c

    .line 1191
    .line 1192
    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 1193
    .line 1194
    .line 1195
    :cond_c
    return-void

    .line 1196
    :pswitch_15
    move-object v5, v0

    .line 1197
    check-cast v5, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;

    .line 1198
    .line 1199
    iget-object v0, v5, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1200
    .line 1201
    if-nez v0, :cond_d

    .line 1202
    .line 1203
    new-instance v0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1204
    .line 1205
    const-wide v13, -0x36a5dfbd051405a7L    # -2.3305190419203827E45

    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    invoke-static {v13, v14}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v2

    .line 1214
    invoke-direct {v0, v2}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 1215
    .line 1216
    .line 1217
    iput-object v0, v5, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1218
    .line 1219
    :cond_d
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v0

    .line 1223
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1227
    .line 1228
    .line 1229
    new-instance v1, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 1230
    .line 1231
    invoke-direct {v1, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 1232
    .line 1233
    .line 1234
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v0

    .line 1238
    invoke-virtual {v0, v12, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v2

    .line 1246
    move-object v4, v2

    .line 1247
    check-cast v4, Landroid/widget/CheckBox;

    .line 1248
    .line 1249
    iget-object v2, v5, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1250
    .line 1251
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1252
    .line 1253
    .line 1254
    invoke-static {v9, v10}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v7

    .line 1258
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1259
    .line 1260
    invoke-virtual {v2, v8, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v2

    .line 1264
    invoke-static/range {v26 .. v27}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1268
    .line 1269
    .line 1270
    check-cast v2, Ljava/lang/Boolean;

    .line 1271
    .line 1272
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v2

    .line 1276
    invoke-virtual {v4, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v2

    .line 1283
    check-cast v2, Landroid/widget/EditText;

    .line 1284
    .line 1285
    iget-object v6, v5, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1286
    .line 1287
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1288
    .line 1289
    .line 1290
    invoke-static/range {v20 .. v21}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v7

    .line 1294
    const/16 v8, 0x32

    .line 1295
    .line 1296
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v8

    .line 1300
    invoke-virtual {v6, v8, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v6

    .line 1304
    check-cast v6, Ljava/lang/Integer;

    .line 1305
    .line 1306
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v6

    .line 1310
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v3

    .line 1317
    move-object v7, v3

    .line 1318
    check-cast v7, Landroid/widget/Button;

    .line 1319
    .line 1320
    move-object v3, v1

    .line 1321
    new-instance v1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲楪兰;

    .line 1322
    .line 1323
    const/4 v6, 0x0

    .line 1324
    invoke-direct/range {v1 .. v6}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;Ljava/lang/Object;I)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v3, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    .line 1334
    .line 1335
    .line 1336
    return-void

    .line 1337
    :pswitch_16
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;

    .line 1338
    .line 1339
    iget-object v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1340
    .line 1341
    if-nez v2, :cond_e

    .line 1342
    .line 1343
    new-instance v2, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1344
    .line 1345
    const-wide v4, -0x36a5d0b7051405a7L    # -2.3357539458530944E45

    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v4

    .line 1354
    invoke-direct {v2, v4}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 1355
    .line 1356
    .line 1357
    iput-object v2, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1358
    .line 1359
    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v1

    .line 1363
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    move-wide v4, v9

    .line 1370
    new-instance v10, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 1371
    .line 1372
    invoke-direct {v10, v1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 1373
    .line 1374
    .line 1375
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v2

    .line 1379
    invoke-virtual {v2, v12, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    invoke-virtual {v2, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v7

    .line 1387
    move-object v13, v7

    .line 1388
    check-cast v13, Landroid/widget/CheckBox;

    .line 1389
    .line 1390
    iget-object v7, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1391
    .line 1392
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1393
    .line 1394
    .line 1395
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v4

    .line 1399
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1400
    .line 1401
    invoke-virtual {v7, v5, v4}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v4

    .line 1405
    invoke-static/range {v26 .. v27}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1406
    .line 1407
    .line 1408
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1409
    .line 1410
    .line 1411
    check-cast v4, Ljava/lang/Boolean;

    .line 1412
    .line 1413
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1414
    .line 1415
    .line 1416
    move-result v4

    .line 1417
    invoke-virtual {v13, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 1418
    .line 1419
    .line 1420
    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v4

    .line 1424
    move-object v9, v4

    .line 1425
    check-cast v9, Landroid/widget/EditText;

    .line 1426
    .line 1427
    iget-object v4, v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 1428
    .line 1429
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1430
    .line 1431
    .line 1432
    invoke-static/range {v20 .. v21}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v5

    .line 1436
    const/16 v6, 0x1a

    .line 1437
    .line 1438
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v6

    .line 1442
    invoke-virtual {v4, v6, v5}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v4

    .line 1446
    check-cast v4, Ljava/lang/Integer;

    .line 1447
    .line 1448
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v4

    .line 1452
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1453
    .line 1454
    .line 1455
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v3

    .line 1459
    check-cast v3, Landroid/widget/Button;

    .line 1460
    .line 1461
    new-instance v8, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;

    .line 1462
    .line 1463
    const/4 v14, 0x0

    .line 1464
    move-object v11, v0

    .line 1465
    move-object v12, v1

    .line 1466
    invoke-direct/range {v8 .. v14}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰哲苏;-><init>(Ljava/lang/Object;Landroid/view/KeyEvent$Callback;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/View;I)V

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v3, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v10, v2}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 1473
    .line 1474
    .line 1475
    invoke-virtual {v10}, Landroid/app/Dialog;->show()V

    .line 1476
    .line 1477
    .line 1478
    return-void

    .line 1479
    :pswitch_17
    check-cast v0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;

    .line 1480
    .line 1481
    sget v1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 1482
    .line 1483
    sget-object v1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 1484
    .line 1485
    const-wide v2, -0x36a5d530051405a7L    # -2.3341954526125965E45

    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1491
    .line 1492
    .line 1493
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1494
    .line 1495
    .line 1496
    const-wide v1, -0x36a538e5051405a7L    # -2.3886556037440912E45

    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    new-instance v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子楪兰苏哲世;

    .line 1505
    .line 1506
    invoke-direct {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 1507
    .line 1508
    .line 1509
    const-wide v2, -0x36a5d558051405a7L    # -2.3341410074338892E45

    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v2

    .line 1518
    iput-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 1519
    .line 1520
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 1521
    .line 1522
    .line 1523
    const-wide v2, -0x36a5d542051405a7L    # -2.3341709522821782E45

    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v2

    .line 1532
    iput-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰:Ljava/lang/CharSequence;

    .line 1533
    .line 1534
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 1535
    .line 1536
    .line 1537
    invoke-virtual {v0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰世哲()Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v2

    .line 1541
    iput-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪兰世哲:Ljava/lang/String;

    .line 1542
    .line 1543
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 1544
    .line 1545
    .line 1546
    invoke-static/range {v24 .. v25}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v2

    .line 1550
    iput-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪哲世兰:Ljava/lang/String;

    .line 1551
    .line 1552
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 1553
    .line 1554
    .line 1555
    const-wide v2, -0x36a52167051405a7L    # -2.3968414363627413E45

    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v2

    .line 1564
    iput-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世兰哲:Ljava/lang/String;

    .line 1565
    .line 1566
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰楪苏哲()V

    .line 1567
    .line 1568
    .line 1569
    new-instance v2, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏兰哲世;

    .line 1570
    .line 1571
    invoke-direct {v2, v0, v8}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 1572
    .line 1573
    .line 1574
    iput-object v2, v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏世楪兰哲:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰哲苏;

    .line 1575
    .line 1576
    invoke-virtual {v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 1577
    .line 1578
    .line 1579
    return-void

    .line 1580
    :pswitch_18
    check-cast v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏楪兰;

    .line 1581
    .line 1582
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v1

    .line 1586
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    iget-object v1, v0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/util/Map;

    .line 1593
    .line 1594
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v1

    .line 1598
    check-cast v1, Ljava/util/Collection;

    .line 1599
    .line 1600
    new-array v2, v8, [Ljava/lang/String;

    .line 1601
    .line 1602
    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v1

    .line 1606
    check-cast v1, [Ljava/lang/String;

    .line 1607
    .line 1608
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪世兰哲()L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v2

    .line 1612
    const-wide v3, -0x36a5b326051405a7L    # -2.3460563347939927E45

    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v3

    .line 1621
    iput-object v3, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪:Ljava/lang/CharSequence;

    .line 1622
    .line 1623
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲世兰()V

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v2, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪哲兰世([Ljava/lang/String;)V

    .line 1627
    .line 1628
    .line 1629
    new-instance v1, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲楪兰苏;

    .line 1630
    .line 1631
    invoke-direct {v1, v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲楪兰苏;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏楪兰;)V

    .line 1632
    .line 1633
    .line 1634
    iput-object v1, v2, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲兰楪世:Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪哲世兰苏;

    .line 1635
    .line 1636
    invoke-virtual {v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子苏楪世哲兰()V

    .line 1637
    .line 1638
    .line 1639
    return-void

    .line 1640
    :pswitch_19
    move-object v4, v0

    .line 1641
    check-cast v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;

    .line 1642
    .line 1643
    iget-object v0, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1644
    .line 1645
    if-nez v0, :cond_f

    .line 1646
    .line 1647
    new-instance v0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1648
    .line 1649
    const-wide v2, -0x36a562ac051405a7L    # -2.3740983240872134E45

    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v2

    .line 1658
    const-wide v5, -0x36a562ab051405a7L    # -2.374099685216681E45

    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v3

    .line 1667
    invoke-direct {v0, v2, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1668
    .line 1669
    .line 1670
    iput-object v0, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1671
    .line 1672
    :cond_f
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v0

    .line 1676
    new-instance v14, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 1677
    .line 1678
    invoke-direct {v14, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;-><init>(Landroid/content/Context;)V

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v14}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 1682
    .line 1683
    .line 1684
    move-result v1

    .line 1685
    invoke-virtual {v14, v1}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)V

    .line 1686
    .line 1687
    .line 1688
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v1

    .line 1696
    const v2, 0x240c00f5

    .line 1697
    .line 1698
    .line 1699
    invoke-virtual {v0, v2, v7, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v0

    .line 1703
    const v2, 0x24090387

    .line 1704
    .line 1705
    .line 1706
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v2

    .line 1710
    check-cast v2, Landroid/widget/TextView;

    .line 1711
    .line 1712
    const-wide v5, -0x36a56347051405a7L    # -2.3738873490197225E45

    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v3

    .line 1721
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1722
    .line 1723
    .line 1724
    const v2, 0x24090112

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1728
    .line 1729
    .line 1730
    move-result-object v2

    .line 1731
    move-object v5, v2

    .line 1732
    check-cast v5, Landroid/widget/EditText;

    .line 1733
    .line 1734
    const v2, 0x240902ac

    .line 1735
    .line 1736
    .line 1737
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v2

    .line 1741
    move-object v6, v2

    .line 1742
    check-cast v6, Landroid/widget/EditText;

    .line 1743
    .line 1744
    const v2, 0x240902ab

    .line 1745
    .line 1746
    .line 1747
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1748
    .line 1749
    .line 1750
    move-result-object v2

    .line 1751
    check-cast v2, Landroid/widget/EditText;

    .line 1752
    .line 1753
    const v3, 0x2409017f

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v3

    .line 1760
    move-object v8, v3

    .line 1761
    check-cast v8, Landroid/widget/EditText;

    .line 1762
    .line 1763
    const v3, 0x24090180

    .line 1764
    .line 1765
    .line 1766
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v3

    .line 1770
    move-object v9, v3

    .line 1771
    check-cast v9, Landroid/widget/EditText;

    .line 1772
    .line 1773
    const v3, 0x2409017e

    .line 1774
    .line 1775
    .line 1776
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v3

    .line 1780
    move-object v10, v3

    .line 1781
    check-cast v10, Landroid/widget/EditText;

    .line 1782
    .line 1783
    const v3, 0x24090176

    .line 1784
    .line 1785
    .line 1786
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1787
    .line 1788
    .line 1789
    move-result-object v3

    .line 1790
    move-object v11, v3

    .line 1791
    check-cast v11, Landroid/widget/CheckBox;

    .line 1792
    .line 1793
    const v3, 0x24090267

    .line 1794
    .line 1795
    .line 1796
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1797
    .line 1798
    .line 1799
    move-result-object v3

    .line 1800
    move-object v12, v3

    .line 1801
    check-cast v12, Landroid/widget/CheckBox;

    .line 1802
    .line 1803
    const v3, 0x24090155

    .line 1804
    .line 1805
    .line 1806
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v3

    .line 1810
    move-object v13, v3

    .line 1811
    check-cast v13, Landroid/widget/CheckBox;

    .line 1812
    .line 1813
    const v3, 0x240902ce

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v3

    .line 1820
    move-object v15, v3

    .line 1821
    check-cast v15, Landroid/widget/Button;

    .line 1822
    .line 1823
    iget-object v3, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1824
    .line 1825
    const-wide v16, -0x36a56348051405a7L    # -2.3738859878902548E45

    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1831
    .line 1832
    .line 1833
    move-result-object v7

    .line 1834
    invoke-virtual {v3, v1, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v3

    .line 1838
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v3

    .line 1842
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1843
    .line 1844
    .line 1845
    move-result-wide v16

    .line 1846
    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v3

    .line 1850
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1851
    .line 1852
    .line 1853
    iget-object v3, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1854
    .line 1855
    const-wide v16, -0x36a56336051405a7L    # -2.373910488220673E45

    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1861
    .line 1862
    .line 1863
    move-result-object v7

    .line 1864
    move-object/from16 p0, v5

    .line 1865
    .line 1866
    const/4 v5, 0x0

    .line 1867
    invoke-virtual {v3, v5, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v3

    .line 1871
    check-cast v3, Ljava/lang/CharSequence;

    .line 1872
    .line 1873
    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1874
    .line 1875
    .line 1876
    iget-object v3, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1877
    .line 1878
    const-wide v16, -0x36a56325051405a7L    # -2.3739336274216237E45

    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v7

    .line 1887
    invoke-virtual {v3, v5, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v3

    .line 1891
    check-cast v3, Ljava/lang/CharSequence;

    .line 1892
    .line 1893
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1894
    .line 1895
    .line 1896
    iget-object v3, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1897
    .line 1898
    const-wide v16, -0x36a5632b051405a7L    # -2.3739254606448176E45

    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v7

    .line 1907
    invoke-virtual {v3, v5, v7}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v3

    .line 1911
    check-cast v3, Ljava/lang/CharSequence;

    .line 1912
    .line 1913
    invoke-virtual {v8, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1914
    .line 1915
    .line 1916
    iget-object v3, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1917
    .line 1918
    const-wide v16, -0x36a5631d051405a7L    # -2.3739445164573652E45

    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v5

    .line 1927
    invoke-virtual {v3, v1, v5}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v3

    .line 1931
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1932
    .line 1933
    .line 1934
    move-result-object v3

    .line 1935
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1936
    .line 1937
    .line 1938
    move-result-wide v16

    .line 1939
    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1940
    .line 1941
    .line 1942
    move-result-object v3

    .line 1943
    invoke-virtual {v9, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1944
    .line 1945
    .line 1946
    iget-object v3, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1947
    .line 1948
    const-wide v16, -0x36a56300051405a7L    # -2.373983989211928E45

    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v5

    .line 1957
    invoke-virtual {v3, v1, v5}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v1

    .line 1961
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v1

    .line 1965
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 1966
    .line 1967
    .line 1968
    move-result-wide v16

    .line 1969
    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v1

    .line 1973
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1974
    .line 1975
    .line 1976
    iget-object v1, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 1977
    .line 1978
    const-wide v16, -0x36a562f5051405a7L    # -2.3739989616360725E45

    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v3

    .line 1987
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1988
    .line 1989
    invoke-virtual {v1, v5, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1990
    .line 1991
    .line 1992
    move-result-object v1

    .line 1993
    check-cast v1, Ljava/lang/Boolean;

    .line 1994
    .line 1995
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1996
    .line 1997
    .line 1998
    move-result v1

    .line 1999
    invoke-virtual {v11, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 2000
    .line 2001
    .line 2002
    iget-object v1, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 2003
    .line 2004
    const-wide v16, -0x36a562ff051405a7L    # -2.3739853503413957E45

    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v3

    .line 2013
    invoke-virtual {v1, v5, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v1

    .line 2017
    check-cast v1, Ljava/lang/Boolean;

    .line 2018
    .line 2019
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2020
    .line 2021
    .line 2022
    move-result v1

    .line 2023
    invoke-virtual {v12, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 2024
    .line 2025
    .line 2026
    iget-object v1, v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 2027
    .line 2028
    const-wide v16, -0x36a562e0051405a7L    # -2.374027545354894E45

    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    invoke-static/range {v16 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v3

    .line 2037
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2038
    .line 2039
    invoke-virtual {v1, v5, v3}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v1

    .line 2043
    check-cast v1, Ljava/lang/Boolean;

    .line 2044
    .line 2045
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2046
    .line 2047
    .line 2048
    move-result v1

    .line 2049
    invoke-virtual {v13, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 2050
    .line 2051
    .line 2052
    new-instance v3, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲兰苏;

    .line 2053
    .line 2054
    move-object/from16 v5, p0

    .line 2055
    .line 2056
    move-object v7, v2

    .line 2057
    invoke-direct/range {v3 .. v14}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世哲兰苏;-><init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏世兰哲;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/CheckBox;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;)V

    .line 2058
    .line 2059
    .line 2060
    invoke-virtual {v15, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2061
    .line 2062
    .line 2063
    invoke-virtual {v14, v0}, L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;->setContentView(Landroid/view/View;)V

    .line 2064
    .line 2065
    .line 2066
    invoke-virtual {v14}, Landroid/app/Dialog;->show()V

    .line 2067
    .line 2068
    .line 2069
    return-void

    .line 2070
    :pswitch_1a
    check-cast v0, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏哲世;

    .line 2071
    .line 2072
    iget-object v1, v0, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Landroid/widget/EditText;

    .line 2073
    .line 2074
    if-nez v1, :cond_10

    .line 2075
    .line 2076
    goto :goto_8

    .line 2077
    :cond_10
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 2078
    .line 2079
    .line 2080
    move-result v1

    .line 2081
    iget-object v2, v0, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Landroid/widget/EditText;

    .line 2082
    .line 2083
    if-eqz v2, :cond_11

    .line 2084
    .line 2085
    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v2

    .line 2089
    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    .line 2090
    .line 2091
    if-eqz v2, :cond_11

    .line 2092
    .line 2093
    goto :goto_6

    .line 2094
    :cond_11
    move v5, v8

    .line 2095
    :goto_6
    iget-object v2, v0, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Landroid/widget/EditText;

    .line 2096
    .line 2097
    if-eqz v5, :cond_12

    .line 2098
    .line 2099
    const/4 v5, 0x0

    .line 2100
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 2101
    .line 2102
    .line 2103
    goto :goto_7

    .line 2104
    :cond_12
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v3

    .line 2108
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 2109
    .line 2110
    .line 2111
    :goto_7
    if-ltz v1, :cond_13

    .line 2112
    .line 2113
    iget-object v2, v0, Lcom/google/android/material/textfield/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:Landroid/widget/EditText;

    .line 2114
    .line 2115
    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 2116
    .line 2117
    .line 2118
    :cond_13
    invoke-virtual {v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世()V

    .line 2119
    .line 2120
    .line 2121
    :goto_8
    return-void

    .line 2122
    :pswitch_1b
    check-cast v0, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;

    .line 2123
    .line 2124
    invoke-virtual {v0}, Lcom/google/android/material/textfield/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世哲苏()V

    .line 2125
    .line 2126
    .line 2127
    return-void

    .line 2128
    :pswitch_1c
    check-cast v0, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;

    .line 2129
    .line 2130
    iget-object v2, v0, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

    .line 2131
    .line 2132
    if-nez v2, :cond_14

    .line 2133
    .line 2134
    goto :goto_9

    .line 2135
    :cond_14
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v2

    .line 2139
    invoke-virtual {v1}, Landroid/view/View;->hasFocus()Z

    .line 2140
    .line 2141
    .line 2142
    move-result v1

    .line 2143
    if-eqz v1, :cond_15

    .line 2144
    .line 2145
    iget-object v1, v0, Lcom/google/android/material/textfield/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EditText;

    .line 2146
    .line 2147
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 2148
    .line 2149
    .line 2150
    :cond_15
    if-eqz v2, :cond_16

    .line 2151
    .line 2152
    invoke-interface {v2}, Landroid/text/Editable;->clear()V

    .line 2153
    .line 2154
    .line 2155
    :cond_16
    invoke-virtual {v0}, Lcom/google/android/material/textfield/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世()V

    .line 2156
    .line 2157
    .line 2158
    :goto_9
    return-void

    .line 2159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
