.class public final synthetic Lwb/dj;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lfg/p;Lr6/c;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/16 p4, 0xa

    .line 2
    .line 3
    iput p4, p0, Lwb/dj;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lwb/dj;->h:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Lwb/dj;->i:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p3, p0, Lwb/dj;->j:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 15
    iput p4, p0, Lwb/dj;->g:I

    iput-object p1, p0, Lwb/dj;->h:Ljava/lang/Object;

    iput-object p2, p0, Lwb/dj;->i:Ljava/lang/Object;

    iput-object p3, p0, Lwb/dj;->j:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Li0/a1;Li0/a1;)V
    .locals 1

    .line 16
    const/16 v0, 0x8

    iput v0, p0, Lwb/dj;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/dj;->j:Ljava/lang/Object;

    iput-object p2, p0, Lwb/dj;->h:Ljava/lang/Object;

    iput-object p3, p0, Lwb/dj;->i:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lx8/s;Lfg/l;Landroid/content/Context;)V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput v0, p0, Lwb/dj;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/dj;->i:Ljava/lang/Object;

    iput-object p2, p0, Lwb/dj;->h:Ljava/lang/Object;

    iput-object p3, p0, Lwb/dj;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lwb/dj;->g:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lxa/m;

    .line 13
    .line 14
    iget-object v3, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lxa/i;

    .line 17
    .line 18
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ljava/util/List;

    .line 21
    .line 22
    check-cast v1, Ljava/util/Set;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast v1, Ljava/lang/Iterable;

    .line 28
    .line 29
    new-instance v5, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-static {v6, v4}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    iget-object v6, v6, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    if-eqz v6, :cond_1

    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-lez v8, :cond_1

    .line 82
    .line 83
    move-object v7, v6

    .line 84
    :cond_1
    if-eqz v7, :cond_0

    .line 85
    .line 86
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    iget-object v1, v3, Lxa/i;->a:Landroid/app/Activity;

    .line 91
    .line 92
    new-instance v4, Lwb/xi;

    .line 93
    .line 94
    const/16 v6, 0x19

    .line 95
    .line 96
    invoke-direct {v4, v3, v6, v5}, Lwb/xi;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    const-string v3, "\u6b63\u5728\u66f4\u65b0\u597d\u53cb\u6807\u7b7e..."

    .line 100
    .line 101
    invoke-virtual {v2, v1, v3, v4}, Lxa/m;->g(Landroid/app/Activity;Ljava/lang/String;Lfg/a;)V

    .line 102
    .line 103
    .line 104
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 105
    .line 106
    return-object v1

    .line 107
    :pswitch_0
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 108
    .line 109
    move-object v4, v2

    .line 110
    check-cast v4, Lxa/m;

    .line 111
    .line 112
    iget-object v2, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 113
    .line 114
    move-object v7, v2

    .line 115
    check-cast v7, Lxa/i;

    .line 116
    .line 117
    iget-object v8, v7, Lxa/i;->a:Landroid/app/Activity;

    .line 118
    .line 119
    iget-object v2, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 122
    .line 123
    check-cast v1, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    const/4 v2, 0x1

    .line 132
    if-eq v1, v2, :cond_5

    .line 133
    .line 134
    const/4 v2, 0x2

    .line 135
    if-eq v1, v2, :cond_3

    .line 136
    .line 137
    goto/16 :goto_1

    .line 138
    .line 139
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {v8}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-nez v1, :cond_4

    .line 147
    .line 148
    goto/16 :goto_1

    .line 149
    .line 150
    :cond_4
    new-instance v15, Lxa/e;

    .line 151
    .line 152
    const/4 v1, 0x0

    .line 153
    invoke-direct {v15, v4, v7, v1}, Lxa/e;-><init>(Lxa/m;Lxa/i;I)V

    .line 154
    .line 155
    .line 156
    new-instance v1, Lk/s1;

    .line 157
    .line 158
    const/4 v2, 0x7

    .line 159
    invoke-direct {v1, v2}, Lk/s1;-><init>(I)V

    .line 160
    .line 161
    .line 162
    const/16 v17, 0x208

    .line 163
    .line 164
    const-string v9, "\u65b0\u5efa\u5e76\u6dfb\u52a0\u6807\u7b7e"

    .line 165
    .line 166
    const-string v10, "\u6807\u7b7e\u521b\u5efa\u540e\u4f1a\u81ea\u52a8\u6dfb\u52a0\u7ed9\u5f53\u524d\u597d\u53cb"

    .line 167
    .line 168
    const/4 v11, 0x0

    .line 169
    const-string v12, "\u8f93\u5165\u6807\u7b7e\u540d\u79f0"

    .line 170
    .line 171
    const/16 v13, 0x20

    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    move-object/from16 v16, v1

    .line 175
    .line 176
    invoke-static/range {v8 .. v17}, Lwb/y2;->c2(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLfg/l;Lfg/a;I)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_5
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-static {v8}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-nez v1, :cond_6

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_6
    new-instance v1, Lk/s1;

    .line 191
    .line 192
    const/4 v2, 0x7

    .line 193
    invoke-direct {v1, v2}, Lk/s1;-><init>(I)V

    .line 194
    .line 195
    .line 196
    const-string v2, "\u8bbe\u7f6e\u597d\u53cb\u6807\u7b7e"

    .line 197
    .line 198
    const-string v3, "\u6b63\u5728\u8f7d\u5165\u597d\u53cb\u6807\u7b7e..."

    .line 199
    .line 200
    invoke-static {v8, v1, v2, v3}, Lwb/y2;->X1(Landroid/app/Activity;Lfg/a;Ljava/lang/String;Ljava/lang/String;)Lwb/kv;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    new-instance v1, Ljava/lang/Thread;

    .line 205
    .line 206
    new-instance v3, Lb9/c;

    .line 207
    .line 208
    move-object v6, v8

    .line 209
    const/16 v8, 0x1a

    .line 210
    .line 211
    invoke-direct/range {v3 .. v8}, Lb9/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 212
    .line 213
    .line 214
    const-string v2, "Hchat-QuickContactLabels"

    .line 215
    .line 216
    invoke-direct {v1, v3, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 220
    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_7
    iget-object v11, v2, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-static {v8}, Lxa/m;->a(Landroid/app/Activity;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_8

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_8
    new-instance v15, Lxa/e;

    .line 236
    .line 237
    const/4 v1, 0x1

    .line 238
    invoke-direct {v15, v4, v7, v1}, Lxa/e;-><init>(Lxa/m;Lxa/i;I)V

    .line 239
    .line 240
    .line 241
    new-instance v1, Lk/s1;

    .line 242
    .line 243
    const/4 v2, 0x7

    .line 244
    invoke-direct {v1, v2}, Lk/s1;-><init>(I)V

    .line 245
    .line 246
    .line 247
    const/16 v17, 0x200

    .line 248
    .line 249
    const-string v9, "\u4fee\u6539\u597d\u53cb\u5907\u6ce8"

    .line 250
    .line 251
    const-string v10, "\u7559\u7a7a\u5e76\u786e\u5b9a\u53ef\u6e05\u9664\u5907\u6ce8"

    .line 252
    .line 253
    const-string v12, "\u8f93\u5165\u597d\u53cb\u5907\u6ce8"

    .line 254
    .line 255
    const/16 v13, 0x64

    .line 256
    .line 257
    const/4 v14, 0x1

    .line 258
    move-object/from16 v16, v1

    .line 259
    .line 260
    invoke-static/range {v8 .. v17}, Lwb/y2;->c2(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLfg/l;Lfg/a;I)V

    .line 261
    .line 262
    .line 263
    :goto_1
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 264
    .line 265
    return-object v1

    .line 266
    :pswitch_1
    iget-object v2, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v2, Lfg/p;

    .line 269
    .line 270
    iget-object v3, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v3, Lr6/c;

    .line 273
    .line 274
    iget-object v4, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 275
    .line 276
    instance-of v5, v4, Ljava/util/Collection;

    .line 277
    .line 278
    if-eqz v5, :cond_a

    .line 279
    .line 280
    move-object v5, v4

    .line 281
    check-cast v5, Ljava/util/Collection;

    .line 282
    .line 283
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-nez v5, :cond_9

    .line 288
    .line 289
    goto :goto_2

    .line 290
    :cond_9
    const/4 v4, 0x0

    .line 291
    :cond_a
    :goto_2
    if-eqz v4, :cond_d

    .line 292
    .line 293
    invoke-interface {v2, v4, v1}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    check-cast v2, Ljava/lang/Boolean;

    .line 298
    .line 299
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    iget-object v3, v3, Lr6/c;->b:Lr6/b;

    .line 304
    .line 305
    sget-object v5, Lr6/b;->i:Lr6/b;

    .line 306
    .line 307
    if-eq v3, v5, :cond_e

    .line 308
    .line 309
    sget-object v3, Ly6/b;->a:Ly6/a;

    .line 310
    .line 311
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-gtz v3, :cond_e

    .line 316
    .line 317
    invoke-static {v4}, Ls6/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    const/4 v4, 0x0

    .line 322
    const-string v5, ""

    .line 323
    .line 324
    const-string v6, " (Kotlin reflection is not available)"

    .line 325
    .line 326
    if-eqz v3, :cond_b

    .line 327
    .line 328
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    invoke-static {v3, v6, v5, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    :cond_b
    if-eqz v1, :cond_c

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-static {v1, v6, v5, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    :cond_c
    sget-object v1, Ly6/b;->a:Ly6/a;

    .line 345
    .line 346
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 347
    .line 348
    .line 349
    goto :goto_3

    .line 350
    :cond_d
    const/4 v2, 0x1

    .line 351
    :cond_e
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    return-object v1

    .line 356
    :pswitch_2
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v2, Landroid/content/Context;

    .line 359
    .line 360
    iget-object v3, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v3, Landroidx/lifecycle/q;

    .line 363
    .line 364
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 365
    .line 366
    move-object v13, v4

    .line 367
    check-cast v13, Li0/a1;

    .line 368
    .line 369
    check-cast v1, Li0/a0;

    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    const-string v1, "sensor"

    .line 375
    .line 376
    invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    instance-of v2, v1, Landroid/hardware/SensorManager;

    .line 381
    .line 382
    const/4 v4, 0x0

    .line 383
    if-eqz v2, :cond_f

    .line 384
    .line 385
    check-cast v1, Landroid/hardware/SensorManager;

    .line 386
    .line 387
    goto :goto_4

    .line 388
    :cond_f
    move-object v1, v4

    .line 389
    :goto_4
    if-eqz v1, :cond_11

    .line 390
    .line 391
    const/16 v2, 0xf

    .line 392
    .line 393
    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    if-nez v2, :cond_10

    .line 398
    .line 399
    goto :goto_5

    .line 400
    :cond_10
    move-object v4, v2

    .line 401
    goto :goto_6

    .line 402
    :cond_11
    :goto_5
    if-eqz v1, :cond_12

    .line 403
    .line 404
    const/16 v2, 0xb

    .line 405
    .line 406
    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    :cond_12
    :goto_6
    if-eqz v1, :cond_14

    .line 411
    .line 412
    if-nez v4, :cond_13

    .line 413
    .line 414
    goto :goto_7

    .line 415
    :cond_13
    const/16 v2, 0x9

    .line 416
    .line 417
    new-array v6, v2, [F

    .line 418
    .line 419
    const/4 v2, 0x3

    .line 420
    new-array v7, v2, [F

    .line 421
    .line 422
    new-instance v9, Lgg/r;

    .line 423
    .line 424
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 425
    .line 426
    .line 427
    new-instance v10, Lgg/r;

    .line 428
    .line 429
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 430
    .line 431
    .line 432
    new-instance v11, Lgg/r;

    .line 433
    .line 434
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 435
    .line 436
    .line 437
    new-instance v12, Lgg/r;

    .line 438
    .line 439
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 440
    .line 441
    .line 442
    new-instance v8, Lgg/q;

    .line 443
    .line 444
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 445
    .line 446
    .line 447
    new-instance v2, Lgg/q;

    .line 448
    .line 449
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 450
    .line 451
    .line 452
    new-instance v5, Lwh/d;

    .line 453
    .line 454
    invoke-direct/range {v5 .. v13}, Lwh/d;-><init>([F[FLgg/q;Lgg/r;Lgg/r;Lgg/r;Lgg/r;Li0/a1;)V

    .line 455
    .line 456
    .line 457
    new-instance v7, Lwh/b;

    .line 458
    .line 459
    move-object v6, v2

    .line 460
    move-object v9, v4

    .line 461
    move-object v10, v8

    .line 462
    move-object v8, v5

    .line 463
    move-object v5, v7

    .line 464
    move-object v7, v1

    .line 465
    invoke-direct/range {v5 .. v10}, Lwh/b;-><init>(Lgg/q;Landroid/hardware/SensorManager;Lwh/d;Landroid/hardware/Sensor;Lgg/q;)V

    .line 466
    .line 467
    .line 468
    move-object v1, v5

    .line 469
    move-object v5, v8

    .line 470
    move-object v8, v10

    .line 471
    invoke-interface {v3}, Landroidx/lifecycle/q;->f()Landroidx/lifecycle/s;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-virtual {v2, v1}, Landroidx/lifecycle/s;->a(Landroidx/lifecycle/p;)V

    .line 476
    .line 477
    .line 478
    move-object v10, v5

    .line 479
    new-instance v5, Lwh/e;

    .line 480
    .line 481
    move-object v9, v7

    .line 482
    move-object v11, v8

    .line 483
    move-object v7, v1

    .line 484
    move-object v8, v6

    .line 485
    move-object v6, v2

    .line 486
    invoke-direct/range {v5 .. v11}, Lwh/e;-><init>(Landroidx/lifecycle/s;Lwh/b;Lgg/q;Landroid/hardware/SensorManager;Lwh/d;Lgg/q;)V

    .line 487
    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_14
    :goto_7
    new-instance v5, Li/j1;

    .line 491
    .line 492
    const/4 v1, 0x1

    .line 493
    invoke-direct {v5, v1}, Li/j1;-><init>(I)V

    .line 494
    .line 495
    .line 496
    :goto_8
    return-object v5

    .line 497
    :pswitch_3
    iget-object v2, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v2, Ljava/util/List;

    .line 500
    .line 501
    iget-object v3, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v3, Li0/a1;

    .line 504
    .line 505
    iget-object v4, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v4, Li0/a1;

    .line 508
    .line 509
    check-cast v1, Lwb/iv;

    .line 510
    .line 511
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    sget-object v3, Lwb/iv;->m:Lwb/iv;

    .line 518
    .line 519
    if-ne v1, v3, :cond_16

    .line 520
    .line 521
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    check-cast v1, Ljava/lang/String;

    .line 526
    .line 527
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 528
    .line 529
    .line 530
    move-result v1

    .line 531
    if-eqz v1, :cond_16

    .line 532
    .line 533
    invoke-static {v2}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    check-cast v1, Ljava/lang/String;

    .line 538
    .line 539
    if-nez v1, :cond_15

    .line 540
    .line 541
    const-string v1, ""

    .line 542
    .line 543
    :cond_15
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    :cond_16
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 547
    .line 548
    return-object v1

    .line 549
    :pswitch_4
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v2, Landroid/content/Context;

    .line 552
    .line 553
    iget-object v3, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v3, Li0/j1;

    .line 556
    .line 557
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v4, Li0/j1;

    .line 560
    .line 561
    check-cast v1, Ljava/lang/Integer;

    .line 562
    .line 563
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    invoke-virtual {v3}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    check-cast v3, Ljava/util/List;

    .line 572
    .line 573
    invoke-static {v1, v3}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    check-cast v1, Lfb/c;

    .line 578
    .line 579
    if-eqz v1, :cond_18

    .line 580
    .line 581
    iget-object v3, v1, Lfb/c;->b:Ljava/lang/String;

    .line 582
    .line 583
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 592
    .line 593
    .line 594
    move-result v5

    .line 595
    if-eqz v5, :cond_17

    .line 596
    .line 597
    const-string v1, "\u5f53\u524d\u6d88\u606f\u6ca1\u6709\u53ef\u5f15\u7528\u5185\u5bb9"

    .line 598
    .line 599
    const/4 v3, 0x0

    .line 600
    invoke-static {v2, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 605
    .line 606
    .line 607
    goto :goto_9

    .line 608
    :cond_17
    new-instance v2, Lfb/a1;

    .line 609
    .line 610
    iget-object v5, v1, Lfb/c;->a:Ljava/lang/String;

    .line 611
    .line 612
    const/16 v6, 0x5dc0

    .line 613
    .line 614
    invoke-static {v6, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    iget-wide v6, v1, Lfb/c;->m:J

    .line 619
    .line 620
    invoke-direct {v2, v6, v7, v5, v3}, Lfb/a1;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    invoke-virtual {v4, v2}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 624
    .line 625
    .line 626
    :cond_18
    :goto_9
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 627
    .line 628
    return-object v1

    .line 629
    :pswitch_5
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v2, Lia/n;

    .line 632
    .line 633
    iget-object v3, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v3, Li0/a1;

    .line 636
    .line 637
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 638
    .line 639
    check-cast v4, Li0/a1;

    .line 640
    .line 641
    check-cast v1, Li0/a0;

    .line 642
    .line 643
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    new-instance v1, Lwb/jp;

    .line 647
    .line 648
    const/16 v5, 0x17

    .line 649
    .line 650
    invoke-direct {v1, v3, v5}, Lwb/jp;-><init>(Li0/a1;I)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v2, v1}, Lia/n;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    new-instance v1, Lci/w;

    .line 657
    .line 658
    const/16 v3, 0xa

    .line 659
    .line 660
    invoke-direct {v1, v2, v3, v4}, Lci/w;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 661
    .line 662
    .line 663
    return-object v1

    .line 664
    :pswitch_6
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 665
    .line 666
    check-cast v2, Lfb/d1;

    .line 667
    .line 668
    iget-object v3, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v3, Li0/a1;

    .line 671
    .line 672
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 673
    .line 674
    check-cast v4, Li0/a1;

    .line 675
    .line 676
    check-cast v1, Ljava/lang/Integer;

    .line 677
    .line 678
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 679
    .line 680
    .line 681
    move-result v1

    .line 682
    invoke-static {v3, v2, v1}, Lwb/y2;->Y(Li0/a1;Lfb/d1;I)Ljava/util/ArrayList;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    if-eqz v1, :cond_19

    .line 687
    .line 688
    invoke-interface {v3, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 692
    .line 693
    invoke-interface {v4, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 694
    .line 695
    .line 696
    const/4 v1, 0x1

    .line 697
    goto :goto_a

    .line 698
    :cond_19
    const/4 v1, 0x0

    .line 699
    :goto_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    return-object v1

    .line 704
    :pswitch_7
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v2, Landroid/content/Context;

    .line 707
    .line 708
    iget-object v3, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v3, Lfg/a;

    .line 711
    .line 712
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 713
    .line 714
    check-cast v4, Lfg/a;

    .line 715
    .line 716
    check-cast v1, Lr/h;

    .line 717
    .line 718
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    sget-object v5, Lwb/p0;->W4:Ls0/d;

    .line 722
    .line 723
    const/4 v6, 0x0

    .line 724
    const/4 v7, 0x3

    .line 725
    invoke-static {v1, v6, v5, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 726
    .line 727
    .line 728
    new-instance v5, Lc9/h0;

    .line 729
    .line 730
    const/4 v8, 0x7

    .line 731
    invoke-direct {v5, v2, v3, v4, v8}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 732
    .line 733
    .line 734
    new-instance v2, Ls0/d;

    .line 735
    .line 736
    const v3, -0x26873af9

    .line 737
    .line 738
    .line 739
    const/4 v4, 0x1

    .line 740
    invoke-direct {v2, v3, v5, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 741
    .line 742
    .line 743
    invoke-static {v1, v6, v2, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 744
    .line 745
    .line 746
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 747
    .line 748
    return-object v1

    .line 749
    :pswitch_8
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 750
    .line 751
    move-object v3, v2

    .line 752
    check-cast v3, Lv8/a;

    .line 753
    .line 754
    iget-object v2, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v2, Li0/a1;

    .line 757
    .line 758
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 759
    .line 760
    check-cast v4, Li0/a1;

    .line 761
    .line 762
    move-object v10, v1

    .line 763
    check-cast v10, Ljava/util/Set;

    .line 764
    .line 765
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    const/16 v17, 0x0

    .line 769
    .line 770
    const/16 v18, 0x3f7f

    .line 771
    .line 772
    move-object v1, v4

    .line 773
    const/4 v4, 0x0

    .line 774
    const/4 v5, 0x0

    .line 775
    const/4 v6, 0x0

    .line 776
    const/4 v7, 0x0

    .line 777
    const/4 v8, 0x0

    .line 778
    const/4 v9, 0x0

    .line 779
    const/4 v11, 0x0

    .line 780
    const-wide/16 v12, 0x0

    .line 781
    .line 782
    const/4 v14, 0x0

    .line 783
    const/4 v15, 0x0

    .line 784
    const/16 v16, 0x0

    .line 785
    .line 786
    invoke-static/range {v3 .. v18}, Lv8/a;->a(Lv8/a;Ljava/lang/String;ZZLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;ZJZLjava/lang/String;ZLjava/lang/String;I)Lv8/a;

    .line 787
    .line 788
    .line 789
    move-result-object v3

    .line 790
    invoke-interface {v2, v3}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 791
    .line 792
    .line 793
    sget-object v2, Lwb/g;->i:Lwb/g;

    .line 794
    .line 795
    invoke-interface {v1, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 799
    .line 800
    return-object v1

    .line 801
    :pswitch_9
    iget-object v2, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 802
    .line 803
    move-object v3, v2

    .line 804
    check-cast v3, Lx8/s;

    .line 805
    .line 806
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 807
    .line 808
    check-cast v2, Lfg/l;

    .line 809
    .line 810
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 811
    .line 812
    move-object v10, v4

    .line 813
    check-cast v10, Landroid/content/Context;

    .line 814
    .line 815
    check-cast v1, Ljava/util/List;

    .line 816
    .line 817
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 818
    .line 819
    .line 820
    iget-object v4, v3, Lx8/s;->c:Ljava/lang/String;

    .line 821
    .line 822
    invoke-static {v4}, Lwb/ho;->P4(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 823
    .line 824
    .line 825
    move-result-object v4

    .line 826
    invoke-static {v4, v1}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    new-instance v5, Ljava/util/ArrayList;

    .line 831
    .line 832
    invoke-static {v4}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 833
    .line 834
    .line 835
    move-result v6

    .line 836
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 844
    .line 845
    .line 846
    move-result v6

    .line 847
    if-eqz v6, :cond_1a

    .line 848
    .line 849
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v6

    .line 853
    check-cast v6, Ljava/lang/String;

    .line 854
    .line 855
    invoke-static {v6, v5}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 856
    .line 857
    .line 858
    goto :goto_b

    .line 859
    :cond_1a
    new-instance v4, Ljava/util/ArrayList;

    .line 860
    .line 861
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 865
    .line 866
    .line 867
    move-result-object v5

    .line 868
    :cond_1b
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 869
    .line 870
    .line 871
    move-result v6

    .line 872
    if-eqz v6, :cond_1c

    .line 873
    .line 874
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v6

    .line 878
    move-object v7, v6

    .line 879
    check-cast v7, Ljava/lang/String;

    .line 880
    .line 881
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 882
    .line 883
    .line 884
    move-result v7

    .line 885
    if-lez v7, :cond_1b

    .line 886
    .line 887
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    goto :goto_c

    .line 891
    :cond_1c
    invoke-static {v4}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 892
    .line 893
    .line 894
    move-result-object v4

    .line 895
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 896
    .line 897
    .line 898
    move-result-object v11

    .line 899
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 900
    .line 901
    .line 902
    move-result v4

    .line 903
    if-nez v4, :cond_1d

    .line 904
    .line 905
    const/4 v15, 0x0

    .line 906
    const/16 v16, 0x3e

    .line 907
    .line 908
    const-string v12, ";;;"

    .line 909
    .line 910
    const/4 v13, 0x0

    .line 911
    const/4 v14, 0x0

    .line 912
    invoke-static/range {v11 .. v16}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v5

    .line 916
    const/4 v8, 0x0

    .line 917
    const/16 v9, 0x1b

    .line 918
    .line 919
    const/4 v4, 0x0

    .line 920
    const-wide/16 v6, 0x0

    .line 921
    .line 922
    invoke-static/range {v3 .. v9}, Lx8/s;->a(Lx8/s;ILjava/lang/String;JZI)Lx8/s;

    .line 923
    .line 924
    .line 925
    move-result-object v3

    .line 926
    invoke-interface {v2, v3}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 930
    .line 931
    .line 932
    move-result v1

    .line 933
    const-string v2, "\u5df2\u9009\u62e9 "

    .line 934
    .line 935
    const-string v3, " \u4e2a\u6587\u4ef6"

    .line 936
    .line 937
    invoke-static {v2, v1, v3, v10, v4}, Lwb/en;->o(Ljava/lang/String;ILjava/lang/String;Landroid/content/Context;I)V

    .line 938
    .line 939
    .line 940
    :cond_1d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 941
    .line 942
    return-object v1

    .line 943
    :pswitch_a
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 944
    .line 945
    check-cast v2, Lfg/a;

    .line 946
    .line 947
    iget-object v3, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v3, Landroid/content/Context;

    .line 950
    .line 951
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 952
    .line 953
    check-cast v4, Lba/n;

    .line 954
    .line 955
    check-cast v1, Lba/b;

    .line 956
    .line 957
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 961
    .line 962
    .line 963
    move-result v1

    .line 964
    const/4 v5, 0x0

    .line 965
    if-eqz v1, :cond_1f

    .line 966
    .line 967
    const/4 v2, 0x1

    .line 968
    if-eq v1, v2, :cond_20

    .line 969
    .line 970
    const/4 v2, 0x2

    .line 971
    if-ne v1, v2, :cond_1e

    .line 972
    .line 973
    const-string v1, "\u6c14\u6ce1\u56fe\u7247\u65e0\u6548\u6216\u8bfb\u53d6\u5931\u8d25"

    .line 974
    .line 975
    invoke-static {v3, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 980
    .line 981
    .line 982
    goto :goto_d

    .line 983
    :cond_1e
    invoke-static {}, Lokio/a;->k()V

    .line 984
    .line 985
    .line 986
    const/4 v1, 0x0

    .line 987
    goto :goto_e

    .line 988
    :cond_1f
    invoke-interface {v2}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    iget-object v1, v4, Lba/n;->h:Ljava/lang/String;

    .line 992
    .line 993
    const-string v2, "\u5df2\u66f4\u65b0"

    .line 994
    .line 995
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v1

    .line 999
    invoke-static {v3, v1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v1

    .line 1003
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 1004
    .line 1005
    .line 1006
    :cond_20
    :goto_d
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1007
    .line 1008
    :goto_e
    return-object v1

    .line 1009
    :pswitch_b
    iget-object v2, v0, Lwb/dj;->h:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast v2, Lfg/l;

    .line 1012
    .line 1013
    iget-object v3, v0, Lwb/dj;->i:Ljava/lang/Object;

    .line 1014
    .line 1015
    check-cast v3, Ldb/c;

    .line 1016
    .line 1017
    iget-object v4, v0, Lwb/dj;->j:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v4, Ljava/util/List;

    .line 1020
    .line 1021
    check-cast v1, Ljava/lang/Long;

    .line 1022
    .line 1023
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1024
    .line 1025
    .line 1026
    invoke-static {v4, v1}, Ltf/m;->G1(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v1

    .line 1030
    invoke-static {v3, v1}, Lwb/ho;->p7(Ldb/c;Ljava/util/ArrayList;)Ldb/c;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    invoke-interface {v2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 1038
    .line 1039
    return-object v1

    .line 1040
    nop

    .line 1041
    :pswitch_data_0
    .packed-switch 0x0
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
