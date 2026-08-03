.class public final synthetic Lwb/tc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/SharedPreferences;Li0/a1;)V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    iput v0, p0, Lwb/tc;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    iput-object p3, p0, Lwb/tc;->h:Li0/a1;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Landroid/content/Context;Li0/a1;I)V
    .locals 0

    .line 15
    iput p4, p0, Lwb/tc;->g:I

    iput-object p1, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lwb/tc;->j:Landroid/content/Context;

    iput-object p3, p0, Lwb/tc;->h:Li0/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/SharedPreferences;Landroid/content/Context;I)V
    .locals 0

    .line 16
    iput p4, p0, Lwb/tc;->g:I

    iput-object p1, p0, Lwb/tc;->h:Li0/a1;

    iput-object p2, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lwb/tc;->j:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lwb/tc;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v3, p0, Lwb/tc;->h:Li0/a1;

    .line 13
    .line 14
    check-cast p1, Lr/h;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    sget-object v4, Lwb/p0;->T4:Ls0/d;

    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    invoke-static {p1, v2, v4, v5}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 23
    .line 24
    .line 25
    new-instance v4, Lc9/h0;

    .line 26
    .line 27
    const/16 v6, 0x19

    .line 28
    .line 29
    invoke-direct {v4, v0, v1, v3, v6}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Ls0/d;

    .line 33
    .line 34
    const v1, -0x1f68a3b0

    .line 35
    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    invoke-direct {v0, v1, v4, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v2, v0, v5}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 42
    .line 43
    .line 44
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_0
    iget-object v0, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 48
    .line 49
    iget-object v2, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 50
    .line 51
    iget-object v3, p0, Lwb/tc;->h:Li0/a1;

    .line 52
    .line 53
    check-cast p1, Ljava/util/List;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-eqz v4, :cond_0

    .line 63
    .line 64
    const-string p1, "\u6ca1\u6709\u53ef\u5220\u9664\u7684\u540d\u5355"

    .line 65
    .line 66
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_4

    .line 74
    .line 75
    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    const-string v7, "|"

    .line 93
    .line 94
    const-string v8, "contact"

    .line 95
    .line 96
    const-string v9, "group_member"

    .line 97
    .line 98
    if-eqz v6, :cond_2

    .line 99
    .line 100
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    check-cast v6, Laa/a;

    .line 105
    .line 106
    iget-object v10, v6, Laa/a;->b:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v6, v6, Laa/a;->c:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v10, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    if-eqz v10, :cond_1

    .line 121
    .line 122
    move-object v8, v9

    .line 123
    :cond_1
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    new-instance v9, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    invoke-static {v4}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    check-cast v5, Ljava/util/List;

    .line 162
    .line 163
    new-instance v6, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    :cond_3
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    if-eqz v10, :cond_5

    .line 177
    .line 178
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    move-object v11, v10

    .line 183
    check-cast v11, Laa/a;

    .line 184
    .line 185
    iget-object v12, v11, Laa/a;->b:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v11, v11, Laa/a;->c:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    if-eqz v12, :cond_4

    .line 200
    .line 201
    move-object v12, v9

    .line 202
    goto :goto_3

    .line 203
    :cond_4
    move-object v12, v8

    .line 204
    :goto_3
    invoke-static {v11}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    new-instance v13, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    invoke-interface {v4, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-nez v11, :cond_3

    .line 235
    .line 236
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_5
    invoke-interface {v3, v6}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    const-string v3, "message_block_bindings"

    .line 248
    .line 249
    invoke-static {v6}, La2/a;->e(Ljava/util/List;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 258
    .line 259
    .line 260
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 261
    .line 262
    .line 263
    move-result p1

    .line 264
    const-string v2, "\u5df2\u5220\u9664 "

    .line 265
    .line 266
    const-string v3, " \u4e2a\u540d\u5355\u9879"

    .line 267
    .line 268
    invoke-static {v2, p1, v3, v0, v1}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 269
    .line 270
    .line 271
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 272
    .line 273
    return-object p1

    .line 274
    :pswitch_1
    iget-object v0, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 275
    .line 276
    iget-object v1, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 277
    .line 278
    iget-object v2, p0, Lwb/tc;->h:Li0/a1;

    .line 279
    .line 280
    check-cast p1, Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    check-cast v3, Ljava/lang/String;

    .line 290
    .line 291
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    const-string v2, "bubble_icon"

    .line 299
    .line 300
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 305
    .line 306
    .line 307
    invoke-static {v1, v3}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :pswitch_2
    iget-object v0, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 313
    .line 314
    iget-object v1, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 315
    .line 316
    iget-object v2, p0, Lwb/tc;->h:Li0/a1;

    .line 317
    .line 318
    check-cast p1, Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    check-cast v3, Ljava/lang/String;

    .line 328
    .line 329
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v2, "bubble_dark_icon"

    .line 337
    .line 338
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 343
    .line 344
    .line 345
    invoke-static {v1, v3}, Lig/a;->m(Landroid/content/Context;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_0

    .line 349
    .line 350
    :pswitch_3
    iget-object v0, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 351
    .line 352
    iget-object v3, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 353
    .line 354
    iget-object v4, p0, Lwb/tc;->h:Li0/a1;

    .line 355
    .line 356
    check-cast p1, Ljava/lang/Boolean;

    .line 357
    .line 358
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const-string v6, "crash_report_enable"

    .line 367
    .line 368
    invoke-interface {v0, v6, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-eqz v0, :cond_a

    .line 377
    .line 378
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    sget-object p1, Lh/Hchat/crash/g;->a:Lh/Hchat/crash/g;

    .line 382
    .line 383
    sput-boolean v5, Lh/Hchat/crash/g;->i:Z

    .line 384
    .line 385
    if-nez v5, :cond_6

    .line 386
    .line 387
    sget-object p1, Lh/Hchat/crash/g;->p:Ljava/io/File;

    .line 388
    .line 389
    if-eqz p1, :cond_b

    .line 390
    .line 391
    invoke-static {}, Lh/Hchat/crash/g;->c()V

    .line 392
    .line 393
    .line 394
    goto :goto_6

    .line 395
    :cond_6
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    instance-of v0, p1, Landroid/app/Application;

    .line 400
    .line 401
    if-eqz v0, :cond_7

    .line 402
    .line 403
    move-object v2, p1

    .line 404
    check-cast v2, Landroid/app/Application;

    .line 405
    .line 406
    :cond_7
    if-eqz v2, :cond_8

    .line 407
    .line 408
    goto :goto_5

    .line 409
    :cond_8
    sget-object v2, Lh/Hchat/crash/g;->j:Landroid/app/Application;

    .line 410
    .line 411
    if-eqz v2, :cond_b

    .line 412
    .line 413
    :goto_5
    invoke-static {v2}, Lh/Hchat/crash/g;->h(Landroid/app/Application;)V

    .line 414
    .line 415
    .line 416
    sget-object p1, Lh/Hchat/crash/g;->k:Ljava/lang/ClassLoader;

    .line 417
    .line 418
    if-eqz p1, :cond_9

    .line 419
    .line 420
    invoke-static {v2, p1}, Lh/Hchat/crash/g;->g(Landroid/app/Application;Ljava/lang/ClassLoader;)V

    .line 421
    .line 422
    .line 423
    goto :goto_6

    .line 424
    :cond_9
    invoke-static {}, Lh/Hchat/crash/g;->d()V

    .line 425
    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_a
    const-string p1, "\u4fdd\u5b58\u8bbe\u7f6e\u5931\u8d25"

    .line 429
    .line 430
    invoke-static {v3, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 431
    .line 432
    .line 433
    move-result-object p1

    .line 434
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 435
    .line 436
    .line 437
    :cond_b
    :goto_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 438
    .line 439
    return-object p1

    .line 440
    :pswitch_4
    iget-object v0, p0, Lwb/tc;->h:Li0/a1;

    .line 441
    .line 442
    iget-object v1, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 443
    .line 444
    iget-object v2, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 445
    .line 446
    check-cast p1, Ljava/lang/Boolean;

    .line 447
    .line 448
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    const-string p1, "wechat_keep_alive_network_heartbeat"

    .line 456
    .line 457
    invoke-static {v2, v1, p1, v3}, Lwb/ho;->l4(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 458
    .line 459
    .line 460
    goto/16 :goto_0

    .line 461
    .line 462
    :pswitch_5
    iget-object v0, p0, Lwb/tc;->h:Li0/a1;

    .line 463
    .line 464
    iget-object v1, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 465
    .line 466
    iget-object v2, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 467
    .line 468
    check-cast p1, Ljava/lang/Boolean;

    .line 469
    .line 470
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    const-string p1, "wechat_keep_alive_watchdog"

    .line 478
    .line 479
    invoke-static {v2, v1, p1, v3}, Lwb/ho;->l4(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_0

    .line 483
    .line 484
    :pswitch_6
    iget-object v0, p0, Lwb/tc;->h:Li0/a1;

    .line 485
    .line 486
    iget-object v1, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 487
    .line 488
    iget-object v2, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 489
    .line 490
    check-cast p1, Ljava/lang/Boolean;

    .line 491
    .line 492
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    const-string p1, "wechat_keep_alive_root_app_ops"

    .line 500
    .line 501
    invoke-static {v2, v1, p1, v3}, Lwb/ho;->l4(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_0

    .line 505
    .line 506
    :pswitch_7
    iget-object v0, p0, Lwb/tc;->h:Li0/a1;

    .line 507
    .line 508
    iget-object v1, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 509
    .line 510
    iget-object v2, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 511
    .line 512
    check-cast p1, Ljava/lang/Boolean;

    .line 513
    .line 514
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    const-string p1, "wechat_keep_alive_root_doze_whitelist"

    .line 522
    .line 523
    invoke-static {v2, v1, p1, v3}, Lwb/ho;->l4(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 524
    .line 525
    .line 526
    goto/16 :goto_0

    .line 527
    .line 528
    :pswitch_8
    iget-object v0, p0, Lwb/tc;->h:Li0/a1;

    .line 529
    .line 530
    iget-object v1, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 531
    .line 532
    iget-object v2, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 533
    .line 534
    check-cast p1, Ljava/lang/Boolean;

    .line 535
    .line 536
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 537
    .line 538
    .line 539
    move-result v3

    .line 540
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    const-string p1, "wechat_keep_alive_wake_lock"

    .line 544
    .line 545
    invoke-static {v2, v1, p1, v3}, Lwb/ho;->l4(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 546
    .line 547
    .line 548
    goto/16 :goto_0

    .line 549
    .line 550
    :pswitch_9
    iget-object v0, p0, Lwb/tc;->h:Li0/a1;

    .line 551
    .line 552
    iget-object v1, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 553
    .line 554
    iget-object v2, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 555
    .line 556
    check-cast p1, Ljava/lang/Boolean;

    .line 557
    .line 558
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 563
    .line 564
    .line 565
    const-string p1, "wechat_keep_alive_foreground_service"

    .line 566
    .line 567
    invoke-static {v2, v1, p1, v3}, Lwb/ho;->l4(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 568
    .line 569
    .line 570
    goto/16 :goto_0

    .line 571
    .line 572
    :pswitch_a
    iget-object v0, p0, Lwb/tc;->h:Li0/a1;

    .line 573
    .line 574
    iget-object v1, p0, Lwb/tc;->i:Landroid/content/SharedPreferences;

    .line 575
    .line 576
    iget-object v2, p0, Lwb/tc;->j:Landroid/content/Context;

    .line 577
    .line 578
    check-cast p1, Ljava/lang/Boolean;

    .line 579
    .line 580
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 581
    .line 582
    .line 583
    move-result v3

    .line 584
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    const-string p1, "wechat_keep_alive_enable"

    .line 588
    .line 589
    invoke-static {v2, v1, p1, v3}, Lwb/ho;->l4(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Z)V

    .line 590
    .line 591
    .line 592
    goto/16 :goto_0

    .line 593
    .line 594
    nop

    .line 595
    :pswitch_data_0
    .packed-switch 0x0
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
