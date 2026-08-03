.class public final synthetic Lwb/qg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/qg;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/qg;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 11
    iput p3, p0, Lwb/qg;->g:I

    iput-object p1, p0, Lwb/qg;->i:Li0/a1;

    iput-object p2, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/qg;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v1, "system_notification"

    .line 13
    .line 14
    :goto_0
    iget-object v2, p0, Lwb/qg;->i:Li0/a1;

    .line 15
    .line 16
    iget-object v3, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    invoke-static {v2, p1, v3, v1, v0}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v1, p0, Lwb/qg;->i:Li0/a1;

    .line 31
    .line 32
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 36
    .line 37
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v1, "enable"

    .line 42
    .line 43
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    const-wide/16 v2, 0x3e8

    .line 54
    .line 55
    div-long/2addr v0, v2

    .line 56
    goto :goto_2

    .line 57
    :cond_0
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    :goto_2
    const-string v2, "enabled_at_seconds"

    .line 60
    .line 61
    invoke-interface {p1, v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 75
    .line 76
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, Llg/d;

    .line 80
    .line 81
    const/4 v1, 0x5

    .line 82
    const/4 v2, 0x1

    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-direct {v0, v3, v1, v2}, Llg/b;-><init>(III)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 88
    .line 89
    const-string v2, "zombie_check_max_retries"

    .line 90
    .line 91
    invoke-static {v1, v2, p1, v0}, Lwb/ho;->s4(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Llg/d;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 101
    .line 102
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Llg/d;

    .line 106
    .line 107
    const/16 v1, 0x3c

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    const/4 v3, 0x5

    .line 111
    invoke-direct {v0, v3, v1, v2}, Llg/b;-><init>(III)V

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 115
    .line 116
    const-string v2, "zombie_check_timeout_seconds"

    .line 117
    .line 118
    invoke-static {v1, v2, p1, v0}, Lwb/ho;->s4(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Llg/d;)V

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 128
    .line 129
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    new-instance v0, Llg/d;

    .line 133
    .line 134
    const/16 v1, 0x78

    .line 135
    .line 136
    const/4 v2, 0x1

    .line 137
    const/4 v3, 0x0

    .line 138
    invoke-direct {v0, v3, v1, v2}, Llg/b;-><init>(III)V

    .line 139
    .line 140
    .line 141
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 142
    .line 143
    const-string v2, "zombie_check_max_delay_seconds"

    .line 144
    .line 145
    invoke-static {v1, v2, p1, v0}, Lwb/ho;->s4(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Llg/d;)V

    .line 146
    .line 147
    .line 148
    goto :goto_1

    .line 149
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 155
    .line 156
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance v0, Llg/d;

    .line 160
    .line 161
    const/16 v1, 0x3c

    .line 162
    .line 163
    const/4 v2, 0x1

    .line 164
    const/4 v3, 0x0

    .line 165
    invoke-direct {v0, v3, v1, v2}, Llg/b;-><init>(III)V

    .line 166
    .line 167
    .line 168
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 169
    .line 170
    const-string v2, "zombie_check_min_delay_seconds"

    .line 171
    .line 172
    invoke-static {v1, v2, p1, v0}, Lwb/ho;->s4(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Llg/d;)V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_1

    .line 176
    .line 177
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 183
    .line 184
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    const/16 v0, 0xa

    .line 188
    .line 189
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    if-eqz p1, :cond_2

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    iget-object v0, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 200
    .line 201
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-gez p1, :cond_1

    .line 206
    .line 207
    const/4 p1, 0x0

    .line 208
    :cond_1
    const-string v1, "daily_like_limit"

    .line 209
    .line 210
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 215
    .line 216
    .line 217
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 218
    .line 219
    return-object p1

    .line 220
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    iget-object v1, p0, Lwb/qg;->i:Li0/a1;

    .line 227
    .line 228
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    iget-object p1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 232
    .line 233
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    const-string v1, "list_mode"

    .line 238
    .line 239
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    const-string v1, "keyword_notify_filter_mode"

    .line 255
    .line 256
    goto/16 :goto_0

    .line 257
    .line 258
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 259
    .line 260
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    const-string v1, "zombie_check_keep_awake"

    .line 265
    .line 266
    goto/16 :goto_0

    .line 267
    .line 268
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 274
    .line 275
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    new-instance v0, Llg/d;

    .line 279
    .line 280
    const/16 v1, 0x12c

    .line 281
    .line 282
    const/4 v2, 0x1

    .line 283
    const/4 v3, 0x0

    .line 284
    invoke-direct {v0, v3, v1, v2}, Llg/b;-><init>(III)V

    .line 285
    .line 286
    .line 287
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 288
    .line 289
    const-string v2, "zombie_check_delete_delay_seconds"

    .line 290
    .line 291
    invoke-static {v1, v2, p1, v0}, Lwb/ho;->s4(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Llg/d;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_1

    .line 295
    .line 296
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    const-string v1, "zombie_check_clear_record"

    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 307
    .line 308
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 309
    .line 310
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 311
    .line 312
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    const-string v1, "zombie_check_label_name"

    .line 325
    .line 326
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_1

    .line 334
    .line 335
    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    const-string v1, "zombie_check_auto_tag"

    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :pswitch_d
    check-cast p1, Ljava/lang/String;

    .line 346
    .line 347
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 348
    .line 349
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 350
    .line 351
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    const-string v1, "qq_music_order_triggers"

    .line 356
    .line 357
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 362
    .line 363
    .line 364
    goto/16 :goto_1

    .line 365
    .line 366
    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    const-string v1, "text_voice_play_enable"

    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    const-string v1, "text_voice_send_enable"

    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 387
    .line 388
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 392
    .line 393
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    const/16 v0, 0xa

    .line 397
    .line 398
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    if-eqz p1, :cond_4

    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    iget-object v0, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 409
    .line 410
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    if-gez p1, :cond_3

    .line 415
    .line 416
    const/4 p1, 0x0

    .line 417
    :cond_3
    const-string v1, "daily_limit"

    .line 418
    .line 419
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 424
    .line 425
    .line 426
    :cond_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 427
    .line 428
    return-object p1

    .line 429
    :pswitch_11
    check-cast p1, Ljava/lang/String;

    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 435
    .line 436
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    const/16 v0, 0xa

    .line 440
    .line 441
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    if-eqz p1, :cond_6

    .line 446
    .line 447
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    iget-object v0, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 452
    .line 453
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    if-gez p1, :cond_5

    .line 458
    .line 459
    const/4 p1, 0x0

    .line 460
    :cond_5
    const-string v1, "random_max_seconds"

    .line 461
    .line 462
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 463
    .line 464
    .line 465
    move-result-object p1

    .line 466
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 467
    .line 468
    .line 469
    :cond_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 470
    .line 471
    return-object p1

    .line 472
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 473
    .line 474
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 478
    .line 479
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    const/16 v0, 0xa

    .line 483
    .line 484
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    if-eqz p1, :cond_8

    .line 489
    .line 490
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 491
    .line 492
    .line 493
    move-result p1

    .line 494
    iget-object v0, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 495
    .line 496
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    if-gez p1, :cond_7

    .line 501
    .line 502
    const/4 p1, 0x0

    .line 503
    :cond_7
    const-string v1, "random_min_seconds"

    .line 504
    .line 505
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 510
    .line 511
    .line 512
    :cond_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 513
    .line 514
    return-object p1

    .line 515
    :pswitch_13
    check-cast p1, Ljava/lang/String;

    .line 516
    .line 517
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 521
    .line 522
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    const/16 v0, 0xa

    .line 526
    .line 527
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    if-eqz p1, :cond_a

    .line 532
    .line 533
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 534
    .line 535
    .line 536
    move-result p1

    .line 537
    iget-object v0, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 538
    .line 539
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    if-gez p1, :cond_9

    .line 544
    .line 545
    const/4 p1, 0x0

    .line 546
    :cond_9
    const-string v1, "fixed_delay_seconds"

    .line 547
    .line 548
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 549
    .line 550
    .line 551
    move-result-object p1

    .line 552
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 553
    .line 554
    .line 555
    :cond_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 556
    .line 557
    return-object p1

    .line 558
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 559
    .line 560
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    iget-object v1, p0, Lwb/qg;->i:Li0/a1;

    .line 565
    .line 566
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    iget-object p1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 570
    .line 571
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 572
    .line 573
    .line 574
    move-result-object p1

    .line 575
    const-string v1, "delay_mode"

    .line 576
    .line 577
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 578
    .line 579
    .line 580
    move-result-object p1

    .line 581
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 582
    .line 583
    .line 584
    goto/16 :goto_1

    .line 585
    .line 586
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 587
    .line 588
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 589
    .line 590
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 591
    .line 592
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    const-string v1, "toast_template"

    .line 597
    .line 598
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 599
    .line 600
    .line 601
    move-result-object p1

    .line 602
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 603
    .line 604
    .line 605
    goto/16 :goto_1

    .line 606
    .line 607
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 608
    .line 609
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 610
    .line 611
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 612
    .line 613
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    const-string v1, "body_template"

    .line 618
    .line 619
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 620
    .line 621
    .line 622
    move-result-object p1

    .line 623
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 624
    .line 625
    .line 626
    goto/16 :goto_1

    .line 627
    .line 628
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 629
    .line 630
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 631
    .line 632
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 633
    .line 634
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    const-string v1, "title_template"

    .line 639
    .line 640
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 645
    .line 646
    .line 647
    goto/16 :goto_1

    .line 648
    .line 649
    :pswitch_18
    check-cast p1, Ljava/lang/Boolean;

    .line 650
    .line 651
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    const-string v1, "allow_live_photo"

    .line 656
    .line 657
    goto/16 :goto_0

    .line 658
    .line 659
    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    .line 660
    .line 661
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 662
    .line 663
    .line 664
    move-result v0

    .line 665
    const-string v1, "allow_video"

    .line 666
    .line 667
    goto/16 :goto_0

    .line 668
    .line 669
    :pswitch_1a
    check-cast p1, Ljava/lang/Boolean;

    .line 670
    .line 671
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    const-string v1, "allow_image"

    .line 676
    .line 677
    goto/16 :goto_0

    .line 678
    .line 679
    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    .line 680
    .line 681
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    const-string v1, "allow_text"

    .line 686
    .line 687
    goto/16 :goto_0

    .line 688
    .line 689
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 690
    .line 691
    iget-object v0, p0, Lwb/qg;->i:Li0/a1;

    .line 692
    .line 693
    iget-object v1, p0, Lwb/qg;->h:Landroid/content/SharedPreferences;

    .line 694
    .line 695
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    const-string v1, "content_template"

    .line 700
    .line 701
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 702
    .line 703
    .line 704
    move-result-object p1

    .line 705
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 706
    .line 707
    .line 708
    goto/16 :goto_1

    .line 709
    .line 710
    nop

    .line 711
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
