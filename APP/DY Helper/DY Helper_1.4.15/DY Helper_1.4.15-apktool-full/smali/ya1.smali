.class public final synthetic Lya1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lya1;->ε:I

    .line 2
    .line 3
    iput-object p3, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput p1, p0, Lya1;->η:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lya1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lorg/json/JSONArray;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget p0, p0, Lya1;->η:I

    .line 21
    .line 22
    add-int/lit8 p0, p0, 0x1

    .line 23
    .line 24
    invoke-static {p0, p1}, Lpe1;->δ(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 30
    .line 31
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lorg/json/JSONObject;

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget p0, p0, Lya1;->η:I

    .line 40
    .line 41
    add-int/lit8 p0, p0, 0x1

    .line 42
    .line 43
    invoke-static {p0, p1}, Lpe1;->δ(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lorg/json/JSONArray;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    iget p0, p0, Lya1;->η:I

    .line 63
    .line 64
    add-int/lit8 p0, p0, 0x1

    .line 65
    .line 66
    sget-object v0, Lkd1;->α:Lkd1;

    .line 67
    .line 68
    invoke-virtual {v0, p0, p1}, Lkd1;->γ(ILjava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lorg/json/JSONObject;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v0}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget p0, p0, Lya1;->η:I

    .line 87
    .line 88
    add-int/lit8 p0, p0, 0x1

    .line 89
    .line 90
    sget-object v0, Lkd1;->α:Lkd1;

    .line 91
    .line 92
    invoke-virtual {v0, p0, p1}, Lkd1;->γ(ILjava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v0, Lorg/json/JSONArray;

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget p0, p0, Lya1;->η:I

    .line 112
    .line 113
    add-int/lit8 p0, p0, 0x1

    .line 114
    .line 115
    invoke-static {p0, p1}, Lxn0;->Κ(ILjava/lang/Object;)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 121
    .line 122
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v0, Lorg/json/JSONObject;

    .line 125
    .line 126
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iget p0, p0, Lya1;->η:I

    .line 131
    .line 132
    add-int/lit8 p0, p0, 0x1

    .line 133
    .line 134
    invoke-static {p0, p1}, Lxn0;->Κ(ILjava/lang/Object;)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    return-object p0

    .line 139
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Lorg/json/JSONArray;

    .line 148
    .line 149
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget p0, p0, Lya1;->η:I

    .line 154
    .line 155
    add-int/lit8 p0, p0, 0x1

    .line 156
    .line 157
    invoke-static {p0, p1}, Lxn0;->Ι(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 163
    .line 164
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v0, Lorg/json/JSONObject;

    .line 167
    .line 168
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iget p0, p0, Lya1;->η:I

    .line 173
    .line 174
    add-int/lit8 p0, p0, 0x1

    .line 175
    .line 176
    invoke-static {p0, p1}, Lxn0;->Ι(ILjava/lang/Object;)Lorg/json/JSONArray;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :pswitch_7
    check-cast p1, Ljava/lang/Integer;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v0, Lorg/json/JSONArray;

    .line 190
    .line 191
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iget p0, p0, Lya1;->η:I

    .line 196
    .line 197
    add-int/lit8 p0, p0, 0x1

    .line 198
    .line 199
    invoke-static {p0, p1}, Lxn0;->Ν(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 205
    .line 206
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Lorg/json/JSONObject;

    .line 209
    .line 210
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iget p0, p0, Lya1;->η:I

    .line 215
    .line 216
    add-int/lit8 p0, p0, 0x1

    .line 217
    .line 218
    invoke-static {p0, p1}, Lxn0;->Ν(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    return-object p0

    .line 223
    :pswitch_9
    check-cast p1, Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v0, Lorg/json/JSONArray;

    .line 232
    .line 233
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iget p0, p0, Lya1;->η:I

    .line 238
    .line 239
    add-int/lit8 p0, p0, 0x1

    .line 240
    .line 241
    invoke-static {p0, p1}, Lxn0;->Λ(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    return-object p0

    .line 246
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 247
    .line 248
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v0, Lorg/json/JSONObject;

    .line 251
    .line 252
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    iget p0, p0, Lya1;->η:I

    .line 257
    .line 258
    add-int/lit8 p0, p0, 0x1

    .line 259
    .line 260
    invoke-static {p0, p1}, Lxn0;->Λ(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 261
    .line 262
    .line 263
    move-result-object p0

    .line 264
    return-object p0

    .line 265
    :pswitch_b
    check-cast p1, Ljava/lang/Integer;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result p1

    .line 271
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Lorg/json/JSONArray;

    .line 274
    .line 275
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    iget p0, p0, Lya1;->η:I

    .line 280
    .line 281
    add-int/lit8 p0, p0, 0x1

    .line 282
    .line 283
    invoke-static {p0, p1}, Lxn0;->Μ(ILjava/lang/Object;)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    return-object p0

    .line 288
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 289
    .line 290
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Lorg/json/JSONObject;

    .line 293
    .line 294
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    iget p0, p0, Lya1;->η:I

    .line 299
    .line 300
    add-int/lit8 p0, p0, 0x1

    .line 301
    .line 302
    invoke-static {p0, p1}, Lxn0;->Μ(ILjava/lang/Object;)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    return-object p0

    .line 307
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 308
    .line 309
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Lorg/json/JSONArray;

    .line 316
    .line 317
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    iget p0, p0, Lya1;->η:I

    .line 322
    .line 323
    add-int/lit8 p0, p0, 0x1

    .line 324
    .line 325
    invoke-static {p0, p1}, Llb1;->β(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    return-object p0

    .line 330
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 331
    .line 332
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v0, Lorg/json/JSONObject;

    .line 335
    .line 336
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    iget p0, p0, Lya1;->η:I

    .line 341
    .line 342
    add-int/lit8 p0, p0, 0x1

    .line 343
    .line 344
    invoke-static {p0, p1}, Llb1;->β(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    return-object p0

    .line 349
    :pswitch_f
    check-cast p1, Ljava/lang/Integer;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, Lorg/json/JSONArray;

    .line 358
    .line 359
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    iget p0, p0, Lya1;->η:I

    .line 364
    .line 365
    add-int/lit8 p0, p0, 0x1

    .line 366
    .line 367
    invoke-static {p0, p1}, Li81;->ο(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    return-object p0

    .line 372
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 373
    .line 374
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Lorg/json/JSONObject;

    .line 377
    .line 378
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    iget p0, p0, Lya1;->η:I

    .line 383
    .line 384
    add-int/lit8 p0, p0, 0x1

    .line 385
    .line 386
    invoke-static {p0, p1}, Li81;->ο(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    return-object p0

    .line 391
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Lorg/json/JSONArray;

    .line 400
    .line 401
    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    iget p0, p0, Lya1;->η:I

    .line 406
    .line 407
    add-int/lit8 p0, p0, 0x1

    .line 408
    .line 409
    invoke-static {p0, p1}, Li81;->ξ(ILjava/lang/Object;)Ljava/lang/Boolean;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    return-object p0

    .line 414
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 415
    .line 416
    iget-object v0, p0, Lya1;->ζ:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v0, Lorg/json/JSONObject;

    .line 419
    .line 420
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    iget p0, p0, Lya1;->η:I

    .line 425
    .line 426
    add-int/lit8 p0, p0, 0x1

    .line 427
    .line 428
    invoke-static {p0, p1}, Li81;->ξ(ILjava/lang/Object;)Ljava/lang/Boolean;

    .line 429
    .line 430
    .line 431
    move-result-object p0

    .line 432
    return-object p0

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
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
