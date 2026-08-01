.class public final Lo6;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Dialog;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Landroid/app/Activity;

.field public final synthetic e:Landroid/view/View;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroid/app/Dialog;Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lo6;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lo6;->b:Landroid/app/Dialog;

    .line 8
    .line 9
    iput-object p3, p0, Lo6;->c:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p1, p0, Lo6;->d:Landroid/app/Activity;

    .line 12
    .line 13
    iput-object p4, p0, Lo6;->e:Landroid/view/View;

    .line 14
    .line 15
    iput-object p5, p0, Lo6;->f:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, Lo6;->g:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, Lo6;->h:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p8, p0, Lo6;->i:Ljava/lang/Object;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;Landroid/app/Dialog;Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lo6;->a:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6;->i:Ljava/lang/Object;

    iput-object p2, p0, Lo6;->b:Landroid/app/Dialog;

    iput-object p3, p0, Lo6;->c:Landroid/content/Context;

    iput-object p4, p0, Lo6;->d:Landroid/app/Activity;

    iput-object p5, p0, Lo6;->e:Landroid/view/View;

    iput-object p6, p0, Lo6;->f:Ljava/lang/String;

    iput-object p7, p0, Lo6;->g:Ljava/lang/String;

    iput-object p8, p0, Lo6;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 1
    iget p1, p0, Lo6;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lo6;->b:Landroid/app/Dialog;

    .line 4
    .line 5
    iget-object v1, p0, Lo6;->i:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, Landroid/widget/EditText;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v2, ""

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    move-object p1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    if-nez p1, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v4, " "

    .line 44
    .line 45
    invoke-virtual {v3, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_2

    .line 54
    .line 55
    :goto_1
    const-wide/16 v2, -0x1

    .line 56
    .line 57
    :goto_2
    move-wide v12, v2

    .line 58
    goto/16 :goto_7

    .line 59
    .line 60
    :cond_2
    const-string v3, "\u79d2"

    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const/4 v4, 0x0

    .line 67
    if-nez v3, :cond_f

    .line 68
    .line 69
    const-string v3, "s"

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    goto/16 :goto_6

    .line 78
    .line 79
    :cond_3
    const-string v3, "\u5206\u949f"

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    const-wide/16 v5, 0x3c

    .line 86
    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    add-int/lit8 v3, v3, -0x2

    .line 94
    .line 95
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-static {v2, v3, v5, v6}, Li5;->J1(JJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v2

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    const-string v3, "\u5206"

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_e

    .line 115
    .line 116
    const-string v3, "m"

    .line 117
    .line 118
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_5
    const-string v3, "\u5c0f\u65f6"

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    const-wide/16 v5, 0xe10

    .line 133
    .line 134
    if-eqz v3, :cond_6

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    add-int/lit8 v3, v3, -0x2

    .line 141
    .line 142
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 147
    .line 148
    .line 149
    move-result-wide v2

    .line 150
    invoke-static {v2, v3, v5, v6}, Li5;->J1(JJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v2

    .line 154
    goto :goto_2

    .line 155
    :cond_6
    const-string v3, "\u65f6"

    .line 156
    .line 157
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-nez v3, :cond_d

    .line 162
    .line 163
    const-string v3, "h"

    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-eqz v3, :cond_7

    .line 170
    .line 171
    goto/16 :goto_4

    .line 172
    .line 173
    :cond_7
    const-string v3, "\u5929"

    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    const-wide/32 v5, 0x15180

    .line 180
    .line 181
    .line 182
    if-nez v3, :cond_c

    .line 183
    .line 184
    const-string v3, "\u65e5"

    .line 185
    .line 186
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eqz v3, :cond_8

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_8
    const-string v3, "days"

    .line 194
    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    if-eqz v3, :cond_9

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    add-int/lit8 v3, v3, -0x4

    .line 206
    .line 207
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 212
    .line 213
    .line 214
    move-result-wide v2

    .line 215
    invoke-static {v2, v3, v5, v6}, Li5;->J1(JJ)J

    .line 216
    .line 217
    .line 218
    move-result-wide v2

    .line 219
    goto/16 :goto_2

    .line 220
    .line 221
    :cond_9
    const-string v3, "day"

    .line 222
    .line 223
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-eqz v3, :cond_a

    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    add-int/lit8 v3, v3, -0x3

    .line 234
    .line 235
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 240
    .line 241
    .line 242
    move-result-wide v2

    .line 243
    invoke-static {v2, v3, v5, v6}, Li5;->J1(JJ)J

    .line 244
    .line 245
    .line 246
    move-result-wide v2

    .line 247
    goto/16 :goto_2

    .line 248
    .line 249
    :cond_a
    const-string v3, "d"

    .line 250
    .line 251
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-eqz v3, :cond_b

    .line 256
    .line 257
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    add-int/lit8 v3, v3, -0x1

    .line 262
    .line 263
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 268
    .line 269
    .line 270
    move-result-wide v2

    .line 271
    invoke-static {v2, v3, v5, v6}, Li5;->J1(JJ)J

    .line 272
    .line 273
    .line 274
    move-result-wide v2

    .line 275
    goto/16 :goto_2

    .line 276
    .line 277
    :cond_b
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 278
    .line 279
    .line 280
    move-result-wide v2

    .line 281
    goto/16 :goto_2

    .line 282
    .line 283
    :cond_c
    :goto_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    add-int/lit8 v3, v3, -0x1

    .line 288
    .line 289
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    invoke-static {v2, v3, v5, v6}, Li5;->J1(JJ)J

    .line 298
    .line 299
    .line 300
    move-result-wide v2

    .line 301
    goto/16 :goto_2

    .line 302
    .line 303
    :cond_d
    :goto_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    add-int/lit8 v3, v3, -0x1

    .line 308
    .line 309
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 314
    .line 315
    .line 316
    move-result-wide v2

    .line 317
    invoke-static {v2, v3, v5, v6}, Li5;->J1(JJ)J

    .line 318
    .line 319
    .line 320
    move-result-wide v2

    .line 321
    goto/16 :goto_2

    .line 322
    .line 323
    :cond_e
    :goto_5
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    add-int/lit8 v3, v3, -0x1

    .line 328
    .line 329
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 334
    .line 335
    .line 336
    move-result-wide v2

    .line 337
    invoke-static {v2, v3, v5, v6}, Li5;->J1(JJ)J

    .line 338
    .line 339
    .line 340
    move-result-wide v2

    .line 341
    goto/16 :goto_2

    .line 342
    .line 343
    :cond_f
    :goto_6
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    add-int/lit8 v3, v3, -0x1

    .line 348
    .line 349
    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-static {v2}, Li5;->p1(Ljava/lang/String;)J

    .line 354
    .line 355
    .line 356
    move-result-wide v2

    .line 357
    goto/16 :goto_2

    .line 358
    .line 359
    :goto_7
    const-wide/16 v2, 0x1

    .line 360
    .line 361
    cmp-long v2, v12, v2

    .line 362
    .line 363
    if-ltz v2, :cond_10

    .line 364
    .line 365
    const-wide/32 v2, 0x278d00

    .line 366
    .line 367
    .line 368
    cmp-long v2, v12, v2

    .line 369
    .line 370
    if-gtz v2, :cond_10

    .line 371
    .line 372
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 373
    .line 374
    .line 375
    :catchall_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    const-string v0, "group action mute custom seconds="

    .line 378
    .line 379
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    const-string v10, ""

    .line 393
    .line 394
    const-string v11, "\u7981\u8a00"

    .line 395
    .line 396
    iget-object v4, p0, Lo6;->c:Landroid/content/Context;

    .line 397
    .line 398
    iget-object v5, p0, Lo6;->d:Landroid/app/Activity;

    .line 399
    .line 400
    iget-object v6, p0, Lo6;->e:Landroid/view/View;

    .line 401
    .line 402
    iget-object v7, p0, Lo6;->f:Ljava/lang/String;

    .line 403
    .line 404
    iget-object v8, p0, Lo6;->g:Ljava/lang/String;

    .line 405
    .line 406
    iget-object v9, p0, Lo6;->h:Ljava/lang/String;

    .line 407
    .line 408
    invoke-static/range {v4 .. v13}, Ls6;->a(Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 409
    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_10
    :try_start_1
    const-string p0, "\u8bf7\u8f93\u5165 1 \u5230 2592000 \u79d2\uff0c\u6216 1 \u5230 30 \u5929"

    .line 413
    .line 414
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 415
    .line 416
    .line 417
    :catchall_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 418
    .line 419
    const-string v0, "group action failed type=\u7981\u8a00 reason=bad custom duration raw="

    .line 420
    .line 421
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    const-string p1, " seconds="

    .line 428
    .line 429
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {p0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    :goto_8
    return-void

    .line 443
    :pswitch_0
    :try_start_2
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 444
    .line 445
    .line 446
    :catchall_2
    move-object v6, v1

    .line 447
    check-cast v6, Ljava/lang/String;

    .line 448
    .line 449
    const-string v7, "\u827e\u7279"

    .line 450
    .line 451
    const-wide/16 v8, 0x0

    .line 452
    .line 453
    iget-object v0, p0, Lo6;->c:Landroid/content/Context;

    .line 454
    .line 455
    iget-object v1, p0, Lo6;->d:Landroid/app/Activity;

    .line 456
    .line 457
    iget-object v2, p0, Lo6;->e:Landroid/view/View;

    .line 458
    .line 459
    iget-object v3, p0, Lo6;->f:Ljava/lang/String;

    .line 460
    .line 461
    iget-object v4, p0, Lo6;->g:Ljava/lang/String;

    .line 462
    .line 463
    iget-object v5, p0, Lo6;->h:Ljava/lang/String;

    .line 464
    .line 465
    invoke-static/range {v0 .. v9}, Ls6;->a(Landroid/content/Context;Landroid/app/Activity;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
