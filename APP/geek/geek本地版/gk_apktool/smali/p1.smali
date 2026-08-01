.class public final synthetic Lp1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lp1;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lp1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lp1;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lmb0;

    .line 15
    .line 16
    iget-object v3, v0, Lmb0;->a:Landroid/view/View;

    .line 17
    .line 18
    const v4, 0x7e060008

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-wide v5, v0, Lmb0;->d:J

    .line 26
    .line 27
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-static {v3, v5}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    iget-object v0, v0, Lmb0;->a:Landroid/view/View;

    .line 38
    .line 39
    invoke-virtual {v0, v4, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :pswitch_0
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_1
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lu7;

    .line 56
    .line 57
    iput-boolean v5, v0, Lu7;->c:Z

    .line 58
    .line 59
    iget-object v2, v0, Lu7;->e:Lwd;

    .line 60
    .line 61
    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 62
    .line 63
    iget-object v4, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:Lma0;

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    invoke-virtual {v4}, Lma0;->f()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_1

    .line 72
    .line 73
    iget v2, v0, Lu7;->b:I

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Lu7;->a(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    iget v4, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    .line 80
    .line 81
    if-ne v4, v3, :cond_2

    .line 82
    .line 83
    iget v0, v0, Lu7;->b:I

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    .line 86
    .line 87
    .line 88
    :cond_2
    :goto_0
    return-void

    .line 89
    :pswitch_2
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lyy;

    .line 92
    .line 93
    invoke-virtual {v0}, Lyy;->e()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_3
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lgy;

    .line 100
    .line 101
    iget-object v2, v0, Lgy;->f:Landroidx/lifecycle/a;

    .line 102
    .line 103
    iget v3, v0, Lgy;->b:I

    .line 104
    .line 105
    if-nez v3, :cond_3

    .line 106
    .line 107
    iput-boolean v4, v0, Lgy;->c:Z

    .line 108
    .line 109
    sget-object v3, Liq;->ON_PAUSE:Liq;

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    iget v3, v0, Lgy;->a:I

    .line 115
    .line 116
    if-nez v3, :cond_4

    .line 117
    .line 118
    iget-boolean v3, v0, Lgy;->c:Z

    .line 119
    .line 120
    if-eqz v3, :cond_4

    .line 121
    .line 122
    sget-object v3, Liq;->ON_STOP:Liq;

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Landroidx/lifecycle/a;->d(Liq;)V

    .line 125
    .line 126
    .line 127
    iput-boolean v4, v0, Lgy;->d:Z

    .line 128
    .line 129
    :cond_4
    return-void

    .line 130
    :pswitch_4
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Li00;

    .line 133
    .line 134
    iget-object v0, v0, Li00;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Ljava/lang/String;

    .line 137
    .line 138
    sget-object v2, Lgn;->a:Lgn;

    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    sget-object v2, Lgn;->f:Ljava/lang/ref/WeakReference;

    .line 144
    .line 145
    if-eqz v2, :cond_6

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    check-cast v2, Landroid/app/Activity;

    .line 152
    .line 153
    if-nez v2, :cond_5

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_5
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    .line 157
    .line 158
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    sget-object v6, Lpb0;->b0:Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {v3, v5, v6}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 168
    .line 169
    .line 170
    const-string v5, "siphfbKnIOivKkdXrqo=\n"

    .line 171
    .line 172
    const-string v6, "2U8YItzGVIE=\n"

    .line 173
    .line 174
    invoke-static {v5, v6}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-virtual {v3, v5, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 179
    .line 180
    .line 181
    const-string v0, "2fnoxzRSwA==\n"

    .line 182
    .line 183
    const-string v5, "spyRmEMzubQ=\n"

    .line 184
    .line 185
    invoke-static {v0, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x10000000

    .line 193
    .line 194
    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 198
    .line 199
    .line 200
    :catchall_0
    :cond_6
    :goto_1
    return-void

    .line 201
    :pswitch_5
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, Le00;

    .line 204
    .line 205
    iput-boolean v5, v0, Le00;->a:Z

    .line 206
    .line 207
    return-void

    .line 208
    :pswitch_6
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 209
    .line 210
    move-object v2, v0

    .line 211
    check-cast v2, Lvk;

    .line 212
    .line 213
    const-string v0, "fetchFonts result is not OK. ("

    .line 214
    .line 215
    iget-object v4, v2, Lvk;->d:Ljava/lang/Object;

    .line 216
    .line 217
    monitor-enter v4

    .line 218
    :try_start_1
    iget-object v6, v2, Lvk;->h:Lip;

    .line 219
    .line 220
    if-nez v6, :cond_7

    .line 221
    .line 222
    monitor-exit v4

    .line 223
    goto/16 :goto_7

    .line 224
    .line 225
    :catchall_1
    move-exception v0

    .line 226
    goto/16 :goto_9

    .line 227
    .line 228
    :cond_7
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 229
    :try_start_2
    invoke-virtual {v2}, Lvk;->b()Lgl;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    iget v6, v4, Lgl;->e:I

    .line 234
    .line 235
    if-ne v6, v3, :cond_8

    .line 236
    .line 237
    iget-object v3, v2, Lvk;->d:Ljava/lang/Object;

    .line 238
    .line 239
    monitor-enter v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 240
    :try_start_3
    monitor-exit v3

    .line 241
    goto :goto_2

    .line 242
    :catchall_2
    move-exception v0

    .line 243
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 244
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 245
    :catchall_3
    move-exception v0

    .line 246
    goto/16 :goto_5

    .line 247
    .line 248
    :cond_8
    :goto_2
    if-nez v6, :cond_b

    .line 249
    .line 250
    :try_start_5
    const-string v0, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    .line 251
    .line 252
    sget v3, Ln70;->a:I

    .line 253
    .line 254
    invoke-static {v0}, Lm70;->a(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    iget-object v0, v2, Lvk;->c:Lvh;

    .line 258
    .line 259
    iget-object v3, v2, Lvk;->a:Landroid/content/Context;

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    filled-new-array {v4}, [Lgl;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    sget-object v6, Lb80;->a:Lct;

    .line 269
    .line 270
    invoke-virtual {v6, v3, v0, v5}, Lct;->h(Landroid/content/Context;[Lgl;I)Landroid/graphics/Typeface;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    iget-object v3, v2, Lvk;->a:Landroid/content/Context;

    .line 275
    .line 276
    iget-object v4, v4, Lgl;->a:Landroid/net/Uri;

    .line 277
    .line 278
    invoke-static {v3, v4}, Lgt;->o(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    .line 279
    .line 280
    .line 281
    move-result-object v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 282
    if-eqz v3, :cond_a

    .line 283
    .line 284
    if-eqz v0, :cond_a

    .line 285
    .line 286
    :try_start_6
    const-string v4, "EmojiCompat.MetadataRepo.create"

    .line 287
    .line 288
    invoke-static {v4}, Lm70;->a(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v4, La8;

    .line 292
    .line 293
    invoke-static {v3}, Lgt;->x(Ljava/nio/MappedByteBuffer;)Lwv;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    invoke-direct {v4, v0, v3}, La8;-><init>(Landroid/graphics/Typeface;Lwv;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 298
    .line 299
    .line 300
    :try_start_7
    invoke-static {}, Lm70;->b()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 301
    .line 302
    .line 303
    :try_start_8
    invoke-static {}, Lm70;->b()V

    .line 304
    .line 305
    .line 306
    iget-object v3, v2, Lvk;->d:Ljava/lang/Object;

    .line 307
    .line 308
    monitor-enter v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 309
    :try_start_9
    iget-object v0, v2, Lvk;->h:Lip;

    .line 310
    .line 311
    if-eqz v0, :cond_9

    .line 312
    .line 313
    invoke-virtual {v0, v4}, Lip;->I(La8;)V

    .line 314
    .line 315
    .line 316
    goto :goto_3

    .line 317
    :catchall_4
    move-exception v0

    .line 318
    goto :goto_4

    .line 319
    :cond_9
    :goto_3
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 320
    :try_start_a
    invoke-virtual {v2}, Lvk;->a()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :goto_4
    :try_start_b
    monitor-exit v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 325
    :try_start_c
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 326
    :catchall_5
    move-exception v0

    .line 327
    :try_start_d
    sget v3, Ln70;->a:I

    .line 328
    .line 329
    invoke-static {}, Lm70;->b()V

    .line 330
    .line 331
    .line 332
    throw v0

    .line 333
    :cond_a
    new-instance v0, Ljava/lang/RuntimeException;

    .line 334
    .line 335
    const-string v3, "Unable to open file."

    .line 336
    .line 337
    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 341
    :catchall_6
    move-exception v0

    .line 342
    :try_start_e
    sget v3, Ln70;->a:I

    .line 343
    .line 344
    invoke-static {}, Lm70;->b()V

    .line 345
    .line 346
    .line 347
    throw v0

    .line 348
    :cond_b
    new-instance v3, Ljava/lang/RuntimeException;

    .line 349
    .line 350
    new-instance v4, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    const-string v0, ")"

    .line 359
    .line 360
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    throw v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 371
    :goto_5
    iget-object v3, v2, Lvk;->d:Ljava/lang/Object;

    .line 372
    .line 373
    monitor-enter v3

    .line 374
    :try_start_f
    iget-object v4, v2, Lvk;->h:Lip;

    .line 375
    .line 376
    if-eqz v4, :cond_c

    .line 377
    .line 378
    invoke-virtual {v4, v0}, Lip;->F(Ljava/lang/Throwable;)V

    .line 379
    .line 380
    .line 381
    goto :goto_6

    .line 382
    :catchall_7
    move-exception v0

    .line 383
    goto :goto_8

    .line 384
    :cond_c
    :goto_6
    monitor-exit v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_7

    .line 385
    invoke-virtual {v2}, Lvk;->a()V

    .line 386
    .line 387
    .line 388
    :goto_7
    return-void

    .line 389
    :goto_8
    :try_start_10
    monitor-exit v3
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    .line 390
    throw v0

    .line 391
    :goto_9
    :try_start_11
    monitor-exit v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 392
    throw v0

    .line 393
    :pswitch_7
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v0, Lph;

    .line 396
    .line 397
    iget-object v2, v0, Lph;->h:Landroid/widget/AutoCompleteTextView;

    .line 398
    .line 399
    invoke-virtual {v2}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    invoke-virtual {v0, v2}, Lph;->s(Z)V

    .line 404
    .line 405
    .line 406
    iput-boolean v2, v0, Lph;->m:Z

    .line 407
    .line 408
    return-void

    .line 409
    :pswitch_8
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, Lg2;

    .line 412
    .line 413
    invoke-static {v0}, Lg2;->a(Lg2;)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_9
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v0, Lvb;

    .line 420
    .line 421
    iget-object v3, v0, Lvb;->b:Ljava/lang/Runnable;

    .line 422
    .line 423
    if-eqz v3, :cond_d

    .line 424
    .line 425
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V

    .line 426
    .line 427
    .line 428
    iput-object v2, v0, Lvb;->b:Ljava/lang/Runnable;

    .line 429
    .line 430
    :cond_d
    return-void

    .line 431
    :pswitch_a
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 434
    .line 435
    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 436
    .line 437
    .line 438
    return-void

    .line 439
    :pswitch_b
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v0, Lua;

    .line 442
    .line 443
    invoke-virtual {v0, v4}, Lua;->s(Z)V

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :pswitch_c
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 450
    .line 451
    invoke-virtual {v0}, Lnz;->j0()V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :pswitch_d
    iget-object v0, v1, Lp1;->b:Ljava/lang/Object;

    .line 456
    .line 457
    move-object v2, v0

    .line 458
    check-cast v2, Landroid/app/Activity;

    .line 459
    .line 460
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-nez v0, :cond_17

    .line 465
    .line 466
    sget-object v6, Ls1;->g:Landroid/os/Handler;

    .line 467
    .line 468
    sget-object v0, Ls1;->f:Ljava/lang/reflect/Method;

    .line 469
    .line 470
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 471
    .line 472
    const/16 v8, 0x1c

    .line 473
    .line 474
    if-lt v7, v8, :cond_e

    .line 475
    .line 476
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_e

    .line 480
    .line 481
    :cond_e
    const/16 v8, 0x1b

    .line 482
    .line 483
    const/16 v9, 0x1a

    .line 484
    .line 485
    if-eq v7, v9, :cond_f

    .line 486
    .line 487
    if-ne v7, v8, :cond_10

    .line 488
    .line 489
    :cond_f
    if-nez v0, :cond_10

    .line 490
    .line 491
    goto/16 :goto_d

    .line 492
    .line 493
    :cond_10
    sget-object v10, Ls1;->e:Ljava/lang/reflect/Method;

    .line 494
    .line 495
    if-nez v10, :cond_11

    .line 496
    .line 497
    sget-object v10, Ls1;->d:Ljava/lang/reflect/Method;

    .line 498
    .line 499
    if-nez v10, :cond_11

    .line 500
    .line 501
    goto/16 :goto_d

    .line 502
    .line 503
    :cond_11
    :try_start_12
    sget-object v10, Ls1;->c:Ljava/lang/reflect/Field;

    .line 504
    .line 505
    invoke-virtual {v10, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v11

    .line 509
    if-nez v11, :cond_12

    .line 510
    .line 511
    goto :goto_d

    .line 512
    :cond_12
    sget-object v10, Ls1;->b:Ljava/lang/reflect/Field;

    .line 513
    .line 514
    invoke-virtual {v10, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v10

    .line 518
    if-nez v10, :cond_13

    .line 519
    .line 520
    goto :goto_d

    .line 521
    :cond_13
    invoke-virtual {v2}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 522
    .line 523
    .line 524
    move-result-object v12

    .line 525
    new-instance v13, Lr1;

    .line 526
    .line 527
    invoke-direct {v13, v2}, Lr1;-><init>(Landroid/app/Activity;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v12, v13}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 531
    .line 532
    .line 533
    new-instance v14, Lh1;

    .line 534
    .line 535
    invoke-direct {v14, v13, v11, v4, v5}, Lh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v6, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 539
    .line 540
    .line 541
    if-eq v7, v9, :cond_15

    .line 542
    .line 543
    if-ne v7, v8, :cond_14

    .line 544
    .line 545
    goto :goto_a

    .line 546
    :cond_14
    move v4, v5

    .line 547
    :cond_15
    :goto_a
    if-eqz v4, :cond_16

    .line 548
    .line 549
    :try_start_13
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v14

    .line 553
    sget-object v15, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_9

    .line 554
    .line 555
    const/16 v16, 0x0

    .line 556
    .line 557
    const/16 v17, 0x0

    .line 558
    .line 559
    move-object v4, v12

    .line 560
    const/4 v12, 0x0

    .line 561
    move-object v7, v13

    .line 562
    const/4 v13, 0x0

    .line 563
    move-object/from16 v18, v15

    .line 564
    .line 565
    move-object/from16 v19, v15

    .line 566
    .line 567
    :try_start_14
    filled-new-array/range {v11 .. v19}, [Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v8

    .line 571
    invoke-virtual {v0, v10, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    goto :goto_b

    .line 575
    :catchall_8
    move-exception v0

    .line 576
    goto :goto_c

    .line 577
    :catchall_9
    move-exception v0

    .line 578
    move-object v4, v12

    .line 579
    move-object v7, v13

    .line 580
    goto :goto_c

    .line 581
    :cond_16
    move-object v4, v12

    .line 582
    move-object v7, v13

    .line 583
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 584
    .line 585
    .line 586
    :goto_b
    :try_start_15
    new-instance v0, Lh1;

    .line 587
    .line 588
    invoke-direct {v0, v4, v7, v3, v5}, Lh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v6, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 592
    .line 593
    .line 594
    goto :goto_e

    .line 595
    :goto_c
    new-instance v8, Lh1;

    .line 596
    .line 597
    invoke-direct {v8, v4, v7, v3, v5}, Lh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v6, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 601
    .line 602
    .line 603
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 604
    :catchall_a
    :goto_d
    invoke-virtual {v2}, Landroid/app/Activity;->recreate()V

    .line 605
    .line 606
    .line 607
    :cond_17
    :goto_e
    return-void

    .line 608
    nop

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
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
