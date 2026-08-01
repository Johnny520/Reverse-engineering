.class public final synthetic Lrh0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# instance fields
.field public final synthetic α:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lrh0;->α:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 7
    iput p1, p0, Lrh0;->α:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lrh0;->α:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object p1, p0

    .line 15
    :goto_0
    const-string p2, "onSuccess"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p2, :cond_7

    .line 23
    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    invoke-static {v0, p3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object p1, p0

    .line 32
    :goto_1
    if-eqz p1, :cond_2

    .line 33
    .line 34
    const-string p2, "getConversationId"

    .line 35
    .line 36
    invoke-static {p1, p2}, Lry1;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    instance-of p3, p2, Ljava/lang/String;

    .line 41
    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    check-cast p2, Ljava/lang/String;

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move-object p2, p0

    .line 48
    :goto_2
    const-string p3, ""

    .line 49
    .line 50
    if-nez p2, :cond_3

    .line 51
    .line 52
    move-object p2, p3

    .line 53
    :cond_3
    if-eqz p1, :cond_4

    .line 54
    .line 55
    const-string v1, "getUuid"

    .line 56
    .line 57
    invoke-static {p1, v1}, Lry1;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    instance-of v2, v1, Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move-object v1, p0

    .line 69
    :goto_3
    if-nez v1, :cond_5

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_5
    move-object p3, v1

    .line 73
    :goto_4
    if-eqz p1, :cond_6

    .line 74
    .line 75
    const-string v1, "getMsgStatus"

    .line 76
    .line 77
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v1, p1, v0}, Lry1;->ν(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, Ljava/lang/Number;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    :cond_6
    const-string p1, " uuid="

    .line 92
    .line 93
    const-string v1, " status="

    .line 94
    .line 95
    const-string v2, "\u53d1\u9001\u6210\u529f\u56de\u8c03 conv="

    .line 96
    .line 97
    invoke-static {v2, p2, p1, p3, v1}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-static {p1}, Lry1;->ю(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez p1, :cond_9

    .line 116
    .line 117
    invoke-static {p2}, Lry1;->Ю(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_6

    .line 121
    :cond_7
    const-string p2, "onFailure"

    .line 122
    .line 123
    invoke-static {p1, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_9

    .line 128
    .line 129
    if-eqz p3, :cond_8

    .line 130
    .line 131
    invoke-static {v0, p3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    goto :goto_5

    .line 136
    :cond_8
    move-object p1, p0

    .line 137
    :goto_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string p3, "\u53d1\u9001\u5931\u8d25\u56de\u8c03: "

    .line 140
    .line 141
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1, p0}, Lry1;->э(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    :cond_9
    :goto_6
    return-object p0

    .line 155
    :pswitch_0
    invoke-static {p1, p2, p3}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileAwemeListClient;->β(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    return-object p0

    .line 160
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const/4 p2, 0x0

    .line 165
    if-eqz p0, :cond_f

    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    sparse-switch v0, :sswitch_data_0

    .line 172
    .line 173
    .line 174
    goto :goto_7

    .line 175
    :sswitch_0
    const-string p3, "hashCode"

    .line 176
    .line 177
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-nez p0, :cond_a

    .line 182
    .line 183
    goto :goto_7

    .line 184
    :cond_a
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    goto :goto_7

    .line 193
    :sswitch_1
    const-string p1, "invoke"

    .line 194
    .line 195
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_7

    .line 199
    :sswitch_2
    const-string v0, "equals"

    .line 200
    .line 201
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-nez p0, :cond_b

    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_b
    const/4 p0, 0x0

    .line 209
    if-eqz p3, :cond_c

    .line 210
    .line 211
    invoke-static {p0, p3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    :cond_c
    if-ne p1, p2, :cond_d

    .line 216
    .line 217
    const/4 p0, 0x1

    .line 218
    :cond_d
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    goto :goto_7

    .line 223
    :sswitch_3
    const-string p1, "toString"

    .line 224
    .line 225
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    if-nez p0, :cond_e

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_e
    const-string p2, "DYHelperPetElfImReadyCallback"

    .line 233
    .line 234
    :cond_f
    :goto_7
    return-object p2

    .line 235
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    const-class v0, Ljava/lang/Object;

    .line 240
    .line 241
    invoke-static {p0, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    const/4 v0, 0x0

    .line 246
    if-eqz p0, :cond_18

    .line 247
    .line 248
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    if-eqz p0, :cond_17

    .line 253
    .line 254
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    const v2, -0x69e9ad94

    .line 259
    .line 260
    .line 261
    if-eq v1, v2, :cond_16

    .line 262
    .line 263
    const v2, -0x4d378041

    .line 264
    .line 265
    .line 266
    if-eq v1, v2, :cond_12

    .line 267
    .line 268
    const p3, 0x8cdac1b

    .line 269
    .line 270
    .line 271
    if-eq v1, p3, :cond_10

    .line 272
    .line 273
    goto :goto_9

    .line 274
    :cond_10
    const-string p3, "hashCode"

    .line 275
    .line 276
    invoke-virtual {p0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result p0

    .line 280
    if-nez p0, :cond_11

    .line 281
    .line 282
    goto :goto_9

    .line 283
    :cond_11
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    goto/16 :goto_c

    .line 292
    .line 293
    :cond_12
    const-string v1, "equals"

    .line 294
    .line 295
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    if-nez p0, :cond_13

    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_13
    if-eqz p3, :cond_14

    .line 303
    .line 304
    invoke-static {v0, p3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    goto :goto_8

    .line 309
    :cond_14
    const/4 p0, 0x0

    .line 310
    :goto_8
    if-ne p1, p0, :cond_15

    .line 311
    .line 312
    const/4 v0, 0x1

    .line 313
    :cond_15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    goto :goto_c

    .line 318
    :cond_16
    const-string p1, "toString"

    .line 319
    .line 320
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-eqz p0, :cond_17

    .line 325
    .line 326
    const-string p0, "IMConversationCatalogObserver"

    .line 327
    .line 328
    goto :goto_c

    .line 329
    :cond_17
    :goto_9
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-static {p0}, Lvh0;->μ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    goto :goto_c

    .line 341
    :cond_18
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    if-eqz p3, :cond_1c

    .line 349
    .line 350
    array-length p1, p3

    .line 351
    if-nez p1, :cond_19

    .line 352
    .line 353
    goto :goto_b

    .line 354
    :cond_19
    const-string p1, "onQueryConversationPage"

    .line 355
    .line 356
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result p0

    .line 360
    if-eqz p0, :cond_1a

    .line 361
    .line 362
    invoke-static {v0, p3}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-static {p0}, Lvh0;->Β(Ljava/lang/Object;)I

    .line 367
    .line 368
    .line 369
    goto :goto_b

    .line 370
    :cond_1a
    array-length p0, p3

    .line 371
    :goto_a
    if-ge v0, p0, :cond_1c

    .line 372
    .line 373
    aget-object p1, p3, v0

    .line 374
    .line 375
    if-eqz p1, :cond_1b

    .line 376
    .line 377
    invoke-static {p1}, Lvh0;->ρ(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v1

    .line 381
    if-nez v1, :cond_1b

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    const-string v2, "~7924EBBB37EFAC6EEF193CFCBA9DD6232A50A25E0A4B21992CD70263C63D9042834AF1CA597362601B03C66D"

    .line 392
    .line 393
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-nez v1, :cond_1b

    .line 402
    .line 403
    invoke-static {p1}, Lvh0;->Β(Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 404
    .line 405
    .line 406
    :cond_1b
    add-int/lit8 v0, v0, 0x1

    .line 407
    .line 408
    goto :goto_a

    .line 409
    :catchall_0
    :cond_1c
    :goto_b
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-static {p0}, Lvh0;->μ(Ljava/lang/Class;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    :goto_c
    return-object p0

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_3
        -0x4d378041 -> :sswitch_2
        -0x468dbb88 -> :sswitch_1
        0x8cdac1b -> :sswitch_0
    .end sparse-switch
.end method
