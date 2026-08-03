.class public final synthetic Lwb/me;
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

    .line 12
    iput p3, p0, Lwb/me;->g:I

    iput-object p1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/me;->i:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/SharedPreferences;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lwb/me;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/me;->i:Li0/a1;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/me;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "exclude_keywords"

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
    const-string v1, "exclude_keywords_enable"

    .line 35
    .line 36
    :goto_1
    iget-object v2, p0, Lwb/me;->i:Li0/a1;

    .line 37
    .line 38
    iget-object v3, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

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
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 47
    .line 48
    iget-object v1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 49
    .line 50
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "include_keywords"

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
    const-string v1, "include_keywords_enable"

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :pswitch_3
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 76
    .line 77
    iget-object v1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 78
    .line 79
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "display_mode"

    .line 84
    .line 85
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 96
    .line 97
    iget-object v1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 98
    .line 99
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "scope"

    .line 104
    .line 105
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_5
    check-cast p1, Ljava/util/Set;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 119
    .line 120
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 124
    .line 125
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-string v1, "fake_like_excluded_ids"

    .line 130
    .line 131
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    const-string v1, "hb_notify_failed_system_enable"

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    const-string v1, "hb_announce_enable"

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :pswitch_8
    check-cast p1, Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    const-string v1, "hb_notify_sound_enable"

    .line 164
    .line 165
    goto/16 :goto_1

    .line 166
    .line 167
    :pswitch_9
    check-cast p1, Ljava/lang/Boolean;

    .line 168
    .line 169
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    const-string v1, "hb_notify_toast_enable"

    .line 174
    .line 175
    goto/16 :goto_1

    .line 176
    .line 177
    :pswitch_a
    check-cast p1, Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    const-string v1, "hb_notify_failed_toast_enable"

    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    const-string v1, "hb_notify_system_enable"

    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    const-string v1, "hb_wish_enable"

    .line 204
    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :pswitch_d
    check-cast p1, Ljava/lang/Boolean;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    const-string v1, "enable"

    .line 214
    .line 215
    goto/16 :goto_1

    .line 216
    .line 217
    :pswitch_e
    check-cast p1, Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    const-string v1, "group_invite_detail_enable"

    .line 224
    .line 225
    goto/16 :goto_1

    .line 226
    .line 227
    :pswitch_f
    check-cast p1, Ljava/lang/Boolean;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    const-string v1, "group_leave_monitor_enable"

    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    const-string v1, "hb_reply_enable"

    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :pswitch_11
    check-cast p1, Ljava/lang/Integer;

    .line 248
    .line 249
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    iget-object v1, p0, Lwb/me;->i:Li0/a1;

    .line 254
    .line 255
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    iget-object p1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 259
    .line 260
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    const-string v1, "transfer_keyword_mode"

    .line 265
    .line 266
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 271
    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    iget-object v1, p0, Lwb/me;->i:Li0/a1;

    .line 282
    .line 283
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    iget-object p1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 287
    .line 288
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    const-string v1, "transfer_amount_action"

    .line 293
    .line 294
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :pswitch_13
    check-cast p1, Ljava/lang/Integer;

    .line 304
    .line 305
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    iget-object v1, p0, Lwb/me;->i:Li0/a1;

    .line 310
    .line 311
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    iget-object p1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 315
    .line 316
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    const-string v1, "transfer_amount_cond"

    .line 321
    .line 322
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 327
    .line 328
    .line 329
    goto/16 :goto_0

    .line 330
    .line 331
    :pswitch_14
    check-cast p1, Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    const-string v1, "transfer_amount_enable"

    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :pswitch_15
    check-cast p1, Ljava/lang/Integer;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    iget-object v1, p0, Lwb/me;->i:Li0/a1;

    .line 348
    .line 349
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    iget-object p1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 353
    .line 354
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    const-string v1, "transfer_mode"

    .line 359
    .line 360
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_0

    .line 368
    .line 369
    :pswitch_16
    check-cast p1, Ljava/lang/String;

    .line 370
    .line 371
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 372
    .line 373
    iget-object v1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 374
    .line 375
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    const-string v1, "end_time"

    .line 380
    .line 381
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 382
    .line 383
    .line 384
    move-result-object p1

    .line 385
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 386
    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 391
    .line 392
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 393
    .line 394
    iget-object v1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 395
    .line 396
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    const-string v1, "start_time"

    .line 401
    .line 402
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 407
    .line 408
    .line 409
    goto/16 :goto_0

    .line 410
    .line 411
    :pswitch_18
    check-cast p1, Ljava/lang/Boolean;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    const-string v1, "time_window_enable"

    .line 418
    .line 419
    goto/16 :goto_1

    .line 420
    .line 421
    :pswitch_19
    check-cast p1, Ljava/lang/String;

    .line 422
    .line 423
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 427
    .line 428
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    const/16 v0, 0xa

    .line 432
    .line 433
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    if-eqz p1, :cond_1

    .line 438
    .line 439
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    iget-object v0, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 444
    .line 445
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    if-gez p1, :cond_0

    .line 450
    .line 451
    const/4 p1, 0x0

    .line 452
    :cond_0
    const-string v1, "interval_seconds"

    .line 453
    .line 454
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 459
    .line 460
    .line 461
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 462
    .line 463
    return-object p1

    .line 464
    :pswitch_1a
    check-cast p1, Ljava/lang/Boolean;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    const-string v1, "enable"

    .line 471
    .line 472
    goto/16 :goto_1

    .line 473
    .line 474
    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    const-string v1, "floating_nav"

    .line 481
    .line 482
    goto/16 :goto_1

    .line 483
    .line 484
    :pswitch_1c
    check-cast p1, Ljava/lang/String;

    .line 485
    .line 486
    iget-object v0, p0, Lwb/me;->i:Li0/a1;

    .line 487
    .line 488
    iget-object v1, p0, Lwb/me;->h:Landroid/content/SharedPreferences;

    .line 489
    .line 490
    invoke-static {p1, v0, p1, v1}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    const-string v1, "sdk_app_name"

    .line 495
    .line 496
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_0

    .line 504
    .line 505
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
