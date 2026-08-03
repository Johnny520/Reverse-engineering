.class public final synthetic Lwb/sr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/sr;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/sr;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/reflect/Field;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Field;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const-class v0, Landroid/widget/ImageView;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1

    .line 44
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-lez p1, :cond_0

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {p1, p1}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1

    .line 70
    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Field;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-class v0, Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1

    .line 90
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Field;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const-class v0, Landroid/app/Activity;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    const-class v1, Landroid/view/MenuItem;

    .line 123
    .line 124
    filled-new-array {v1, v0}, [Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    const-string v1, "onMMMenuItemSelected"

    .line 129
    .line 130
    invoke-static {p1, v1, v0}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    return-object p1

    .line 135
    :pswitch_6
    check-cast p1, Ljava/lang/Byte;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 142
    .line 143
    and-int/lit16 p1, p1, 0xff

    .line 144
    .line 145
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    const/4 v1, 0x1

    .line 154
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    const-string v1, "%02x"

    .line 159
    .line 160
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    xor-int/lit8 p1, p1, 0x1

    .line 175
    .line 176
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    return-object p1

    .line 181
    :pswitch_8
    check-cast p1, Log/f;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    check-cast p1, Log/i;

    .line 187
    .line 188
    invoke-virtual {p1}, Log/i;->a()Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    const/4 v0, 0x1

    .line 193
    check-cast p1, Log/g;

    .line 194
    .line 195
    invoke-virtual {p1, v0}, Log/g;->get(I)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    return-object p1

    .line 210
    :pswitch_9
    check-cast p1, Ljava/lang/reflect/Member;

    .line 211
    .line 212
    new-instance v0, Lu6/c;

    .line 213
    .line 214
    invoke-direct {v0, p1}, Lu6/c;-><init>(Ljava/lang/reflect/Member;)V

    .line 215
    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_a
    check-cast p1, Lu6/c;

    .line 219
    .line 220
    invoke-virtual {p1}, Lu6/c;->a()Ljava/lang/reflect/Member;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    return-object p1

    .line 228
    :pswitch_b
    check-cast p1, Landroid/content/Context;

    .line 229
    .line 230
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    new-instance v1, Landroid/content/Intent;

    .line 235
    .line 236
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 237
    .line 238
    .line 239
    const-string v2, "android.intent.action.PROCESS_TEXT"

    .line 240
    .line 241
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    const-string v2, "text/plain"

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    const/4 v2, 0x0

    .line 252
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    new-instance v1, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 266
    .line 267
    .line 268
    move-result v3

    .line 269
    :goto_1
    if-ge v2, v3, :cond_3

    .line 270
    .line 271
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    move-object v5, v4

    .line 276
    check-cast v5, Landroid/content/pm/ResolveInfo;

    .line 277
    .line 278
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    iget-object v7, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 283
    .line 284
    iget-object v7, v7, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    if-nez v6, :cond_1

    .line 291
    .line 292
    iget-object v5, v5, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 293
    .line 294
    iget-boolean v6, v5, Landroid/content/pm/ActivityInfo;->exported:Z

    .line 295
    .line 296
    if-eqz v6, :cond_2

    .line 297
    .line 298
    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->permission:Ljava/lang/String;

    .line 299
    .line 300
    if-eqz v5, :cond_1

    .line 301
    .line 302
    invoke-virtual {p1, v5}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result v5

    .line 306
    if-nez v5, :cond_2

    .line 307
    .line 308
    :cond_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 312
    .line 313
    goto :goto_1

    .line 314
    :cond_3
    return-object v1

    .line 315
    :pswitch_c
    check-cast p1, Le1/b;

    .line 316
    .line 317
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 318
    .line 319
    return-object p1

    .line 320
    :pswitch_d
    check-cast p1, Lwb/jv;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    iget-object p1, p1, Lwb/jv;->a:Ljava/lang/String;

    .line 326
    .line 327
    return-object p1

    .line 328
    :pswitch_e
    check-cast p1, Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    return-object p1

    .line 334
    :pswitch_f
    check-cast p1, Lfb/c;

    .line 335
    .line 336
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    iget-object v0, p1, Lfb/c;->a:Ljava/lang/String;

    .line 340
    .line 341
    const-string v1, "tool"

    .line 342
    .line 343
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_4

    .line 348
    .line 349
    iget-object p1, p1, Lfb/c;->d:Ljava/lang/String;

    .line 350
    .line 351
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 352
    .line 353
    .line 354
    move-result p1

    .line 355
    if-nez p1, :cond_4

    .line 356
    .line 357
    const/4 p1, 0x1

    .line 358
    goto :goto_2

    .line 359
    :cond_4
    const/4 p1, 0x0

    .line 360
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    return-object p1

    .line 365
    :pswitch_10
    check-cast p1, Lfb/c;

    .line 366
    .line 367
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    iget-object p1, p1, Lfb/c;->b:Ljava/lang/String;

    .line 371
    .line 372
    return-object p1

    .line 373
    :pswitch_11
    check-cast p1, Lfb/c;

    .line 374
    .line 375
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    iget-object p1, p1, Lfb/c;->a:Ljava/lang/String;

    .line 379
    .line 380
    const-string v0, "user"

    .line 381
    .line 382
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 387
    .line 388
    .line 389
    move-result-object p1

    .line 390
    return-object p1

    .line 391
    :pswitch_12
    check-cast p1, Lfb/a0;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    iget-object p1, p1, Lfb/a0;->b:Ljava/lang/String;

    .line 397
    .line 398
    return-object p1

    .line 399
    :pswitch_13
    check-cast p1, Lf1/d0;

    .line 400
    .line 401
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    const/high16 v0, 0x43340000    # 180.0f

    .line 405
    .line 406
    invoke-interface {p1, v0}, Lf1/d0;->f(F)V

    .line 407
    .line 408
    .line 409
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 410
    .line 411
    return-object p1

    .line 412
    :pswitch_14
    check-cast p1, Ljava/lang/String;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 418
    .line 419
    .line 420
    move-result p1

    .line 421
    xor-int/lit8 p1, p1, 0x1

    .line 422
    .line 423
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 424
    .line 425
    .line 426
    move-result-object p1

    .line 427
    return-object p1

    .line 428
    :pswitch_15
    check-cast p1, Lfb/q1;

    .line 429
    .line 430
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    iget-object p1, p1, Lfb/q1;->p:Ljava/lang/String;

    .line 434
    .line 435
    return-object p1

    .line 436
    :pswitch_16
    check-cast p1, Lfb/c;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    iget-object p1, p1, Lfb/c;->j:Ljava/util/List;

    .line 442
    .line 443
    invoke-static {p1}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    return-object p1

    .line 448
    :pswitch_17
    check-cast p1, Ljava/lang/String;

    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    const-string v0, "- "

    .line 454
    .line 455
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    return-object p1

    .line 460
    :pswitch_18
    check-cast p1, Lfb/a;

    .line 461
    .line 462
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iget-object p1, p1, Lfb/a;->a:Ljava/lang/String;

    .line 466
    .line 467
    const-string v0, "\u9644\u4ef6: "

    .line 468
    .line 469
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    return-object p1

    .line 474
    :pswitch_19
    check-cast p1, Lfb/a0;

    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    iget-object p1, p1, Lfb/a0;->b:Ljava/lang/String;

    .line 480
    .line 481
    return-object p1

    .line 482
    :pswitch_1a
    check-cast p1, Lfb/q1;

    .line 483
    .line 484
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    iget-object p1, p1, Lfb/q1;->a:Ljava/lang/String;

    .line 488
    .line 489
    return-object p1

    .line 490
    :pswitch_1b
    check-cast p1, Lfb/c;

    .line 491
    .line 492
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    iget-object p1, p1, Lfb/c;->j:Ljava/util/List;

    .line 496
    .line 497
    invoke-static {p1}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    return-object p1

    .line 502
    nop

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
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
