.class public final synthetic Lwb/di;
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
    iput p3, p0, Lwb/di;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/di;->i:Li0/a1;

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
    iput p3, p0, Lwb/di;->g:I

    iput-object p1, p0, Lwb/di;->i:Li0/a1;

    iput-object p2, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/di;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/di;->i:Li0/a1;

    .line 7
    .line 8
    iget-object v1, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/16 v0, 0xa

    .line 19
    .line 20
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-gez p1, :cond_0

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    :cond_0
    const-string v1, "daily_comment_limit"

    .line 38
    .line 39
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 44
    .line 45
    .line 46
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 50
    .line 51
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 52
    .line 53
    check-cast p1, Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v0, "comment_list_mode"

    .line 67
    .line 68
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 73
    .line 74
    .line 75
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_1
    iget-object v0, p0, Lwb/di;->i:Li0/a1;

    .line 79
    .line 80
    iget-object v1, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 81
    .line 82
    check-cast p1, Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    const/16 v0, 0xa

    .line 91
    .line 92
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const/4 v1, 0x1

    .line 107
    if-ge p1, v1, :cond_2

    .line 108
    .line 109
    move p1, v1

    .line 110
    :cond_2
    const-string v1, "comment_max_age_hours"

    .line 111
    .line 112
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 117
    .line 118
    .line 119
    :cond_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 120
    .line 121
    return-object p1

    .line 122
    :pswitch_2
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 123
    .line 124
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 125
    .line 126
    check-cast p1, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v1, "comment_end_time"

    .line 133
    .line 134
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :pswitch_3
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 143
    .line 144
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 145
    .line 146
    check-cast p1, Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-string v1, "comment_start_time"

    .line 153
    .line 154
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :pswitch_4
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 163
    .line 164
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 165
    .line 166
    check-cast p1, Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    const-string v3, "comment_time_window_enable"

    .line 173
    .line 174
    :goto_1
    invoke-static {v1, p1, v0, v3, v2}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :pswitch_5
    iget-object v0, p0, Lwb/di;->i:Li0/a1;

    .line 179
    .line 180
    iget-object v1, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 181
    .line 182
    check-cast p1, Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    const/16 v0, 0xa

    .line 191
    .line 192
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-eqz p1, :cond_5

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    if-gez p1, :cond_4

    .line 207
    .line 208
    const/4 p1, 0x0

    .line 209
    :cond_4
    const-string v1, "comment_random_max_seconds"

    .line 210
    .line 211
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 216
    .line 217
    .line 218
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 219
    .line 220
    return-object p1

    .line 221
    :pswitch_6
    iget-object v0, p0, Lwb/di;->i:Li0/a1;

    .line 222
    .line 223
    iget-object v1, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 224
    .line 225
    check-cast p1, Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    const/16 v0, 0xa

    .line 234
    .line 235
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-eqz p1, :cond_7

    .line 240
    .line 241
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-gez p1, :cond_6

    .line 250
    .line 251
    const/4 p1, 0x0

    .line 252
    :cond_6
    const-string v1, "comment_random_min_seconds"

    .line 253
    .line 254
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 259
    .line 260
    .line 261
    :cond_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 262
    .line 263
    return-object p1

    .line 264
    :pswitch_7
    iget-object v0, p0, Lwb/di;->i:Li0/a1;

    .line 265
    .line 266
    iget-object v1, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 267
    .line 268
    check-cast p1, Ljava/lang/String;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    const/16 v0, 0xa

    .line 277
    .line 278
    invoke-static {v0, p1}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-eqz p1, :cond_9

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-gez p1, :cond_8

    .line 293
    .line 294
    const/4 p1, 0x0

    .line 295
    :cond_8
    const-string v1, "comment_fixed_delay_seconds"

    .line 296
    .line 297
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 302
    .line 303
    .line 304
    :cond_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 305
    .line 306
    return-object p1

    .line 307
    :pswitch_8
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 308
    .line 309
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 310
    .line 311
    check-cast p1, Ljava/lang/Integer;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    const-string v0, "comment_delay_mode"

    .line 325
    .line 326
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 331
    .line 332
    .line 333
    goto/16 :goto_0

    .line 334
    .line 335
    :pswitch_9
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 336
    .line 337
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 338
    .line 339
    check-cast p1, Ljava/lang/String;

    .line 340
    .line 341
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    const-string v1, "group_rename_listen_groups"

    .line 346
    .line 347
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 348
    .line 349
    .line 350
    move-result-object p1

    .line 351
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_0

    .line 355
    .line 356
    :pswitch_a
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 357
    .line 358
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 359
    .line 360
    check-cast p1, Ljava/lang/String;

    .line 361
    .line 362
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const-string v1, "group_member_reply_listen_groups"

    .line 367
    .line 368
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_0

    .line 376
    .line 377
    :pswitch_b
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 378
    .line 379
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 380
    .line 381
    check-cast p1, Lwb/bp;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    sget-object v2, Lob/p;->a:Ljava/util/List;

    .line 387
    .line 388
    iget p1, p1, Lwb/bp;->b:I

    .line 389
    .line 390
    invoke-static {p1, v2}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    check-cast p1, Lob/o;

    .line 395
    .line 396
    if-eqz p1, :cond_a

    .line 397
    .line 398
    iget-object p1, p1, Lob/o;->a:Ljava/lang/String;

    .line 399
    .line 400
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    const-string v1, "text_voice_voice"

    .line 408
    .line 409
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 414
    .line 415
    .line 416
    :cond_a
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 417
    .line 418
    return-object p1

    .line 419
    :pswitch_c
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 420
    .line 421
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 422
    .line 423
    check-cast p1, Ljava/lang/String;

    .line 424
    .line 425
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    const-string v1, "text_voice_tts_voice"

    .line 430
    .line 431
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 436
    .line 437
    .line 438
    goto/16 :goto_0

    .line 439
    .line 440
    :pswitch_d
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 441
    .line 442
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 443
    .line 444
    check-cast p1, Lr/h;

    .line 445
    .line 446
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    sget-object v2, Lwb/p0;->u2:Ls0/d;

    .line 450
    .line 451
    const/4 v3, 0x0

    .line 452
    const/4 v4, 0x3

    .line 453
    invoke-static {p1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 454
    .line 455
    .line 456
    new-instance v2, Lwb/vc;

    .line 457
    .line 458
    const/4 v5, 0x2

    .line 459
    invoke-direct {v2, v0, v1, v5}, Lwb/vc;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 460
    .line 461
    .line 462
    new-instance v0, Ls0/d;

    .line 463
    .line 464
    const v1, -0x1201b231

    .line 465
    .line 466
    .line 467
    const/4 v5, 0x1

    .line 468
    invoke-direct {v0, v1, v2, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 469
    .line 470
    .line 471
    invoke-static {p1, v3, v0, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 472
    .line 473
    .line 474
    goto/16 :goto_0

    .line 475
    .line 476
    :pswitch_e
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 477
    .line 478
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 479
    .line 480
    check-cast p1, Ljava/lang/Boolean;

    .line 481
    .line 482
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    const-string v3, "scheduled_task_enable"

    .line 487
    .line 488
    invoke-static {v1, p1, v0, v3, v2}, Lwb/en;->m(Li0/a1;Ljava/lang/Boolean;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 489
    .line 490
    .line 491
    sget-object p1, Lbe/h;->a:Lcb/f;

    .line 492
    .line 493
    if-eqz p1, :cond_b

    .line 494
    .line 495
    invoke-virtual {p1}, Lcb/f;->r()V

    .line 496
    .line 497
    .line 498
    :cond_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 499
    .line 500
    return-object p1

    .line 501
    :pswitch_f
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 502
    .line 503
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 504
    .line 505
    check-cast p1, Ljava/util/List;

    .line 506
    .line 507
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    const-string v1, "group_member_reply_template_bindings"

    .line 518
    .line 519
    invoke-static {p1}, Lr9/e0;->A(Ljava/util/List;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_0

    .line 531
    .line 532
    :pswitch_10
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 533
    .line 534
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 535
    .line 536
    check-cast p1, Lr/h;

    .line 537
    .line 538
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    sget-object v2, Lwb/p0;->t2:Ls0/d;

    .line 542
    .line 543
    const/4 v3, 0x0

    .line 544
    const/4 v4, 0x3

    .line 545
    invoke-static {p1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 546
    .line 547
    .line 548
    new-instance v2, Lwb/vc;

    .line 549
    .line 550
    const/4 v5, 0x6

    .line 551
    invoke-direct {v2, v0, v1, v5}, Lwb/vc;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 552
    .line 553
    .line 554
    new-instance v0, Ls0/d;

    .line 555
    .line 556
    const v1, -0x107ceaf8

    .line 557
    .line 558
    .line 559
    const/4 v5, 0x1

    .line 560
    invoke-direct {v0, v1, v2, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 561
    .line 562
    .line 563
    invoke-static {p1, v3, v0, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 564
    .line 565
    .line 566
    goto/16 :goto_0

    .line 567
    .line 568
    :pswitch_11
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 569
    .line 570
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 571
    .line 572
    check-cast p1, Ljava/lang/Integer;

    .line 573
    .line 574
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 575
    .line 576
    .line 577
    move-result v2

    .line 578
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 582
    .line 583
    .line 584
    move-result-object p1

    .line 585
    const-string v0, "audio_transform_mode"

    .line 586
    .line 587
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

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
    :pswitch_12
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 597
    .line 598
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 599
    .line 600
    check-cast p1, Lr/h;

    .line 601
    .line 602
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    sget-object v2, Lwb/p0;->s2:Ls0/d;

    .line 606
    .line 607
    const/4 v3, 0x0

    .line 608
    const/4 v4, 0x3

    .line 609
    invoke-static {p1, v3, v2, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 610
    .line 611
    .line 612
    new-instance v2, Lwb/vc;

    .line 613
    .line 614
    const/4 v5, 0x5

    .line 615
    invoke-direct {v2, v0, v1, v5}, Lwb/vc;-><init>(Landroid/content/SharedPreferences;Li0/a1;I)V

    .line 616
    .line 617
    .line 618
    new-instance v0, Ls0/d;

    .line 619
    .line 620
    const v1, -0x47fbd7ef

    .line 621
    .line 622
    .line 623
    const/4 v5, 0x1

    .line 624
    invoke-direct {v0, v1, v2, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 625
    .line 626
    .line 627
    invoke-static {p1, v3, v0, v4}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 628
    .line 629
    .line 630
    goto/16 :goto_0

    .line 631
    .line 632
    :pswitch_13
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 633
    .line 634
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 635
    .line 636
    check-cast p1, Ljava/util/List;

    .line 637
    .line 638
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 645
    .line 646
    .line 647
    move-result-object v0

    .line 648
    const-string v1, "group_rename_template_bindings"

    .line 649
    .line 650
    invoke-static {p1}, Lx6/d;->t(Ljava/util/List;)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object p1

    .line 654
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 655
    .line 656
    .line 657
    move-result-object p1

    .line 658
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 659
    .line 660
    .line 661
    goto/16 :goto_0

    .line 662
    .line 663
    :pswitch_14
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 664
    .line 665
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 666
    .line 667
    check-cast p1, Ljava/lang/String;

    .line 668
    .line 669
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    const-string v1, "excluded_talkers"

    .line 674
    .line 675
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 676
    .line 677
    .line 678
    move-result-object p1

    .line 679
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 680
    .line 681
    .line 682
    goto/16 :goto_0

    .line 683
    .line 684
    :pswitch_15
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 685
    .line 686
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 687
    .line 688
    check-cast p1, Ljava/lang/Boolean;

    .line 689
    .line 690
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 691
    .line 692
    .line 693
    move-result v2

    .line 694
    const-string v3, "excluded_talkers_enable"

    .line 695
    .line 696
    goto/16 :goto_1

    .line 697
    .line 698
    :pswitch_16
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 699
    .line 700
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 701
    .line 702
    check-cast p1, Ljava/lang/Boolean;

    .line 703
    .line 704
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    const-string v3, "like_self"

    .line 709
    .line 710
    goto/16 :goto_1

    .line 711
    .line 712
    :pswitch_17
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 713
    .line 714
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 715
    .line 716
    check-cast p1, Ljava/lang/Boolean;

    .line 717
    .line 718
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 719
    .line 720
    .line 721
    move-result v2

    .line 722
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 726
    .line 727
    .line 728
    move-result-object p1

    .line 729
    const-string v0, "enable"

    .line 730
    .line 731
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    if-eqz v2, :cond_c

    .line 736
    .line 737
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 738
    .line 739
    .line 740
    move-result-wide v0

    .line 741
    const-wide/16 v2, 0x3e8

    .line 742
    .line 743
    div-long/2addr v0, v2

    .line 744
    goto :goto_2

    .line 745
    :cond_c
    const-wide/16 v0, 0x0

    .line 746
    .line 747
    :goto_2
    const-string v2, "enabled_at_seconds"

    .line 748
    .line 749
    invoke-interface {p1, v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 750
    .line 751
    .line 752
    move-result-object p1

    .line 753
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 754
    .line 755
    .line 756
    goto/16 :goto_0

    .line 757
    .line 758
    :pswitch_18
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 759
    .line 760
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 761
    .line 762
    check-cast p1, Ljava/lang/String;

    .line 763
    .line 764
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    const-string v1, "qq_music_order_app_id"

    .line 769
    .line 770
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 771
    .line 772
    .line 773
    move-result-object p1

    .line 774
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 775
    .line 776
    .line 777
    goto/16 :goto_0

    .line 778
    .line 779
    :pswitch_19
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 780
    .line 781
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 782
    .line 783
    check-cast p1, Ljava/lang/String;

    .line 784
    .line 785
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    const-string v1, "qq_music_order_default_singer"

    .line 790
    .line 791
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 792
    .line 793
    .line 794
    move-result-object p1

    .line 795
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 796
    .line 797
    .line 798
    goto/16 :goto_0

    .line 799
    .line 800
    :pswitch_1a
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 801
    .line 802
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 803
    .line 804
    check-cast p1, Ljava/lang/Boolean;

    .line 805
    .line 806
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    invoke-interface {v1, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 811
    .line 812
    .line 813
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 814
    .line 815
    .line 816
    move-result-object p1

    .line 817
    const-string v0, "qq_music_order_custom_singer"

    .line 818
    .line 819
    invoke-interface {p1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 820
    .line 821
    .line 822
    move-result-object p1

    .line 823
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 824
    .line 825
    .line 826
    goto/16 :goto_0

    .line 827
    .line 828
    :pswitch_1b
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 829
    .line 830
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 831
    .line 832
    check-cast p1, Ljava/lang/String;

    .line 833
    .line 834
    invoke-static {p1, v1, p1, v0}, Lwb/en;->b(Ljava/lang/String;Li0/a1;Ljava/lang/String;Landroid/content/SharedPreferences;)Landroid/content/SharedPreferences$Editor;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    const-string v1, "exclude_keywords_video_text"

    .line 839
    .line 840
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 841
    .line 842
    .line 843
    move-result-object p1

    .line 844
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 845
    .line 846
    .line 847
    goto/16 :goto_0

    .line 848
    .line 849
    :pswitch_1c
    iget-object v0, p0, Lwb/di;->h:Landroid/content/SharedPreferences;

    .line 850
    .line 851
    iget-object v1, p0, Lwb/di;->i:Li0/a1;

    .line 852
    .line 853
    check-cast p1, Ljava/lang/Boolean;

    .line 854
    .line 855
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 856
    .line 857
    .line 858
    move-result v2

    .line 859
    const-string v3, "keyword_video"

    .line 860
    .line 861
    goto/16 :goto_1

    .line 862
    .line 863
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
