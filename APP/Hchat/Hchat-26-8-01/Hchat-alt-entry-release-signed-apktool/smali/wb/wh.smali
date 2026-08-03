.class public final synthetic Lwb/wh;
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
    iput p3, p0, Lwb/wh;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/wh;->i:Li0/a1;

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
    iput p3, p0, Lwb/wh;->g:I

    iput-object p1, p0, Lwb/wh;->i:Li0/a1;

    iput-object p2, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/wh;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "exclude_keywords_image_text"

    .line 17
    .line 18
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    return-object p1

    .line 28
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const-string v1, "keyword_image"

    .line 35
    .line 36
    :goto_1
    iget-object v2, p0, Lwb/wh;->i:Li0/a1;

    .line 37
    .line 38
    iget-object v3, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 39
    .line 40
    invoke-static {v2, p1, v3, v1, v0}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 47
    .line 48
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 49
    .line 50
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "exclude_keywords_text"

    .line 55
    .line 56
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const-string v1, "keyword_text"

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const-string v1, "allow_video"

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    const-string v1, "allow_image"

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const-string v1, "allow_text"

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 106
    .line 107
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const/16 v0, 0xa

    .line 111
    .line 112
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-eqz p1, :cond_1

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    iget-object v0, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 123
    .line 124
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const/4 v1, 0x1

    .line 129
    if-ge p1, v1, :cond_0

    .line 130
    .line 131
    move p1, v1

    .line 132
    :cond_0
    const-string v1, "max_age_hours"

    .line 133
    .line 134
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 139
    .line 140
    .line 141
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 145
    .line 146
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 147
    .line 148
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 149
    .line 150
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const-string v1, "end_time"

    .line 155
    .line 156
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 166
    .line 167
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 168
    .line 169
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 170
    .line 171
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const-string v1, "start_time"

    .line 176
    .line 177
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    const-string v1, "time_window_enable"

    .line 193
    .line 194
    goto/16 :goto_1

    .line 195
    .line 196
    :pswitch_a
    check-cast p1, Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 202
    .line 203
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    const/16 v0, 0xa

    .line 207
    .line 208
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    if-eqz p1, :cond_3

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    iget-object v0, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 219
    .line 220
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    if-gez p1, :cond_2

    .line 225
    .line 226
    const/4 p1, 0x0

    .line 227
    :cond_2
    const-string v1, "random_max_seconds"

    .line 228
    .line 229
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 234
    .line 235
    .line 236
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 237
    .line 238
    return-object p1

    .line 239
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 245
    .line 246
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    const/16 v0, 0xa

    .line 250
    .line 251
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    if-eqz p1, :cond_5

    .line 256
    .line 257
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    iget-object v0, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 262
    .line 263
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    if-gez p1, :cond_4

    .line 268
    .line 269
    const/4 p1, 0x0

    .line 270
    :cond_4
    const-string v1, "random_min_seconds"

    .line 271
    .line 272
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 277
    .line 278
    .line 279
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 280
    .line 281
    return-object p1

    .line 282
    :pswitch_c
    check-cast p1, Ljava/lang/String;

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 288
    .line 289
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    const/16 v0, 0xa

    .line 293
    .line 294
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    if-eqz p1, :cond_7

    .line 299
    .line 300
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    iget-object v0, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 305
    .line 306
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-gez p1, :cond_6

    .line 311
    .line 312
    const/4 p1, 0x0

    .line 313
    :cond_6
    const-string v1, "fixed_delay_seconds"

    .line 314
    .line 315
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 320
    .line 321
    .line 322
    :cond_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 323
    .line 324
    return-object p1

    .line 325
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    iget-object v1, p0, Lwb/wh;->i:Li0/a1;

    .line 332
    .line 333
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    iget-object p1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 337
    .line 338
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    const-string v1, "delay_mode"

    .line 343
    .line 344
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 349
    .line 350
    .line 351
    goto/16 :goto_0

    .line 352
    .line 353
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 354
    .line 355
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 356
    .line 357
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 358
    .line 359
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    const-string v1, "text_speech_quiet_end"

    .line 364
    .line 365
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_0

    .line 373
    .line 374
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 375
    .line 376
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 377
    .line 378
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 379
    .line 380
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    const-string v1, "text_speech_quiet_start"

    .line 385
    .line 386
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_0

    .line 394
    .line 395
    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    .line 396
    .line 397
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 398
    .line 399
    .line 400
    move-result v0

    .line 401
    const-string v1, "text_speech_quiet_enable"

    .line 402
    .line 403
    goto/16 :goto_1

    .line 404
    .line 405
    :pswitch_11
    check-cast p1, Ljava/lang/Boolean;

    .line 406
    .line 407
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    const-string v1, "text_speech_announce_sender"

    .line 412
    .line 413
    goto/16 :goto_1

    .line 414
    .line 415
    :pswitch_12
    check-cast p1, Ljava/lang/Boolean;

    .line 416
    .line 417
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 418
    .line 419
    .line 420
    move-result v0

    .line 421
    const-string v1, "text_speech_volume_control"

    .line 422
    .line 423
    goto/16 :goto_1

    .line 424
    .line 425
    :pswitch_13
    check-cast p1, Ljava/lang/Boolean;

    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    const-string v1, "text_speech_play_voice_messages"

    .line 432
    .line 433
    goto/16 :goto_1

    .line 434
    .line 435
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 436
    .line 437
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 438
    .line 439
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 440
    .line 441
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    const-string v1, "text_speech_tts_voice"

    .line 446
    .line 447
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 452
    .line 453
    .line 454
    goto/16 :goto_0

    .line 455
    .line 456
    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    .line 457
    .line 458
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    const-string v1, "text_speech_enable"

    .line 463
    .line 464
    goto/16 :goto_1

    .line 465
    .line 466
    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    .line 467
    .line 468
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    const-string v1, "log_enable"

    .line 473
    .line 474
    goto/16 :goto_1

    .line 475
    .line 476
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 477
    .line 478
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 479
    .line 480
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 481
    .line 482
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 483
    .line 484
    .line 485
    move-result-object p1

    .line 486
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    check-cast v0, Ljava/lang/String;

    .line 491
    .line 492
    const-string v1, "keyword_notify_quiet_end"

    .line 493
    .line 494
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 495
    .line 496
    .line 497
    move-result-object p1

    .line 498
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 499
    .line 500
    .line 501
    goto/16 :goto_0

    .line 502
    .line 503
    :pswitch_18
    check-cast p1, Ljava/lang/String;

    .line 504
    .line 505
    iget-object v0, p0, Lwb/wh;->i:Li0/a1;

    .line 506
    .line 507
    iget-object v1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 508
    .line 509
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 510
    .line 511
    .line 512
    move-result-object p1

    .line 513
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    check-cast v0, Ljava/lang/String;

    .line 518
    .line 519
    const-string v1, "keyword_notify_quiet_start"

    .line 520
    .line 521
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 526
    .line 527
    .line 528
    goto/16 :goto_0

    .line 529
    .line 530
    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    .line 531
    .line 532
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    const-string v1, "keyword_notify_quiet"

    .line 537
    .line 538
    goto/16 :goto_1

    .line 539
    .line 540
    :pswitch_1a
    check-cast p1, Ljava/lang/Boolean;

    .line 541
    .line 542
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    const-string v1, "log_enable"

    .line 547
    .line 548
    goto/16 :goto_1

    .line 549
    .line 550
    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    .line 551
    .line 552
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    iget-object v1, p0, Lwb/wh;->i:Li0/a1;

    .line 557
    .line 558
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    iget-object p1, p0, Lwb/wh;->h:Landroid/content/SharedPreferences;

    .line 562
    .line 563
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 564
    .line 565
    .line 566
    move-result-object p1

    .line 567
    const-string v1, "enable"

    .line 568
    .line 569
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    if-eqz v0, :cond_8

    .line 574
    .line 575
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 576
    .line 577
    .line 578
    move-result-wide v0

    .line 579
    const-wide/16 v2, 0x3e8

    .line 580
    .line 581
    div-long/2addr v0, v2

    .line 582
    goto :goto_2

    .line 583
    :cond_8
    const-wide/16 v0, 0x0

    .line 584
    .line 585
    :goto_2
    const-string v2, "enabled_at_seconds"

    .line 586
    .line 587
    invoke-interface {p1, v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 588
    .line 589
    .line 590
    move-result-object p1

    .line 591
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 592
    .line 593
    .line 594
    goto/16 :goto_0

    .line 595
    .line 596
    :pswitch_1c
    check-cast p1, Ljava/lang/Boolean;

    .line 597
    .line 598
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 599
    .line 600
    .line 601
    move-result v0

    .line 602
    const-string v1, "toast"

    .line 603
    .line 604
    goto/16 :goto_1

    .line 605
    .line 606
    nop

    .line 607
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
