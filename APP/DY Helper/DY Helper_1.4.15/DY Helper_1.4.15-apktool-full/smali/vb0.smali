.class public final synthetic Lvb0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;

.field public final synthetic κ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ldc0;Lum1;Ljava/util/ArrayList;Lum1;Lum1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lvb0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvb0;->ζ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lvb0;->η:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lvb0;->κ:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lvb0;->θ:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lvb0;->ι:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p6, p0, Lvb0;->ε:I

    iput-object p1, p0, Lvb0;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lvb0;->η:Ljava/lang/Object;

    iput-object p3, p0, Lvb0;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lvb0;->ι:Ljava/lang/Object;

    iput-object p5, p0, Lvb0;->κ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/LinkedHashSet;Landroid/app/Activity;Lum1;Lf8;Ljava/util/ArrayList;)V
    .locals 1

    .line 19
    const/4 v0, 0x2

    iput v0, p0, Lvb0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvb0;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lvb0;->θ:Ljava/lang/Object;

    iput-object p3, p0, Lvb0;->η:Ljava/lang/Object;

    iput-object p4, p0, Lvb0;->ι:Ljava/lang/Object;

    iput-object p5, p0, Lvb0;->κ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lvb0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvb0;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    .line 10
    iget-object v1, p0, Lvb0;->η:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lzc0;

    .line 13
    .line 14
    iget-object v2, p0, Lvb0;->θ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    iget-object v3, p0, Lvb0;->ι:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Landroid/widget/TextView;

    .line 21
    .line 22
    iget-object p0, p0, Lvb0;->κ:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, Lku1;

    .line 41
    .line 42
    iget-object v5, v5, Lku1;->α:Ljava/lang/String;

    .line 43
    .line 44
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 51
    .line 52
    .line 53
    invoke-static {v3, v0, p0, v2}, Lbv1;->Π(Landroid/widget/TextView;Ljava/util/List;Landroid/widget/TextView;Ljava/util/LinkedHashMap;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Ls62;->α:Ls62;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    iget-object v0, p0, Lvb0;->ζ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 62
    .line 63
    iget-object v1, p0, Lvb0;->θ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Landroid/app/Activity;

    .line 66
    .line 67
    iget-object v2, p0, Lvb0;->η:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lum1;

    .line 70
    .line 71
    iget-object v3, p0, Lvb0;->ι:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v3, Lf8;

    .line 74
    .line 75
    iget-object p0, p0, Lvb0;->κ:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-static {v0}, Lxh;->Ю(Ljava/lang/Iterable;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v4, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_2

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Ljava/lang/Number;

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    invoke-static {v5, p0}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    check-cast v5, Landroid/graphics/Bitmap;

    .line 113
    .line 114
    if-eqz v5, :cond_1

    .line 115
    .line 116
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_4

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    move-object v5, v4

    .line 140
    check-cast v5, Landroid/graphics/Bitmap;

    .line 141
    .line 142
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    if-nez v5, :cond_3

    .line 147
    .line 148
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_5

    .line 157
    .line 158
    const-string p0, "\u8bf7\u9009\u62e9\u56fe\u7247"

    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    invoke-static {v1, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_5
    iget-object v0, v2, Lum1;->ε:Ljava/lang/Object;

    .line 170
    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    check-cast v0, Landroid/app/AlertDialog;

    .line 174
    .line 175
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 176
    .line 177
    .line 178
    sget-object v0, Lqy0;->α:Lqy0;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_6

    .line 191
    .line 192
    const-string p0, "\u6ca1\u6709\u53ef\u4fdd\u5b58\u7684\u56fe\u7247"

    .line 193
    .line 194
    invoke-static {v1, p0}, Lqy0;->Г(Landroid/app/Activity;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_6
    invoke-static {v1}, Lyh;->у(Landroid/content/Context;)Liu;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    iget-object v4, v2, Liu;->β:Ljava/lang/String;

    .line 203
    .line 204
    if-eqz v4, :cond_8

    .line 205
    .line 206
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 207
    .line 208
    .line 209
    move-result v4

    .line 210
    if-eqz v4, :cond_7

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_7
    invoke-virtual {v2}, Liu;->α()Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-nez v2, :cond_8

    .line 218
    .line 219
    const-string v2, "DYHelper"

    .line 220
    .line 221
    const-string v4, "[DOWNLOAD-STORAGE] \u5f53\u524d\u7a7a\u95f4\u65e0\u53ef\u7528 SAF \u6388\u6743\uff0c\u6539\u7528 MediaStore"

    .line 222
    .line 223
    invoke-static {v2, v4}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :cond_8
    :goto_3
    const-string v2, "jpg"

    .line 227
    .line 228
    invoke-static {v1, v3, v2}, Lqy0;->γ(Landroid/content/Context;Lf8;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {v2}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    sget-object v4, Ljy0;->η:Ljy0;

    .line 237
    .line 238
    invoke-static {v0, v1, v3, v4, v2}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    const/4 v3, 0x1

    .line 247
    if-gt v2, v3, :cond_9

    .line 248
    .line 249
    const-string v2, "\u5c06\u4fdd\u5b58 1 \u5f20\u56fe\u7247\u3002"

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_9
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    const-string v3, "\u5c06\u4fdd\u5b58 "

    .line 257
    .line 258
    const-string v4, " \u5f20\u56fe\u7247\uff0c\u6587\u4ef6\u540d\u4f1a\u81ea\u52a8\u8ffd\u52a0 _img1\u3001_img2\u3002"

    .line 259
    .line 260
    invoke-static {v3, v2, v4}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    :goto_4
    iget-object v3, v0, Lfv;->β:Ljava/lang/String;

    .line 265
    .line 266
    new-instance v4, Lm3;

    .line 267
    .line 268
    const/4 v5, 0x5

    .line 269
    invoke-direct {v4, v1, p0, v0, v5}, Lm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 270
    .line 271
    .line 272
    const-string p0, "\u786e\u8ba4\u56fe\u7247\u6587\u4ef6\u540d"

    .line 273
    .line 274
    invoke-static {v1, p0, v2, v3, v4}, Lqy0;->ρ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 275
    .line 276
    .line 277
    :goto_5
    sget-object p0, Ls62;->α:Ls62;

    .line 278
    .line 279
    return-object p0

    .line 280
    :cond_a
    const-string p0, "dialog"

    .line 281
    .line 282
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const/4 p0, 0x0

    .line 286
    throw p0

    .line 287
    :pswitch_1
    iget-object v0, p0, Lvb0;->ζ:Ljava/lang/Object;

    .line 288
    .line 289
    move-object v5, v0

    .line 290
    check-cast v5, Ln;

    .line 291
    .line 292
    iget-object v0, p0, Lvb0;->η:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Landroid/content/Context;

    .line 295
    .line 296
    iget-object v1, p0, Lvb0;->θ:Ljava/lang/Object;

    .line 297
    .line 298
    move-object v4, v1

    .line 299
    check-cast v4, Lih0;

    .line 300
    .line 301
    iget-object v1, p0, Lvb0;->ι:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, Lgc;

    .line 304
    .line 305
    iget-object p0, p0, Lvb0;->κ:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast p0, Lic;

    .line 308
    .line 309
    move-object v2, v1

    .line 310
    sget-object v1, Lnh0;->α:Lnh0;

    .line 311
    .line 312
    :try_start_0
    invoke-virtual {v5}, Ln;->Ζ()V

    .line 313
    .line 314
    .line 315
    invoke-static {v0}, Lnh0;->ω(Landroid/content/Context;)Landroid/content/Context;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-eqz v0, :cond_c

    .line 320
    .line 321
    invoke-static {}, Lnh0;->λ()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    if-eqz v3, :cond_b

    .line 326
    .line 327
    new-instance v6, Lθ;

    .line 328
    .line 329
    const/16 v7, 0x11

    .line 330
    .line 331
    invoke-direct {v6, v7, v2}, Lθ;-><init>(ILjava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    move-object v2, v0

    .line 335
    invoke-virtual/range {v1 .. v6}, Lnh0;->κ(Landroid/content/Context;Ljava/lang/Object;Lih0;Ln;Lθ;)Llh0;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    new-instance v1, Lp3;

    .line 340
    .line 341
    const/16 v2, 0x14

    .line 342
    .line 343
    invoke-direct {v1, p0, v2, v0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v1}, Lnh0;->υ(Lp70;)V

    .line 347
    .line 348
    .line 349
    goto :goto_8

    .line 350
    :catchall_0
    move-exception v0

    .line 351
    goto :goto_6

    .line 352
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 353
    .line 354
    const-string v1, "\u672a\u627e\u5230\u5f53\u524d\u804a\u5929\u4f1a\u8bdd\uff0c\u8bf7\u4fdd\u6301\u804a\u5929\u9875\u9762\u6253\u5f00"

    .line 355
    .line 356
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    throw v0

    .line 360
    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 361
    .line 362
    const-string v1, "\u65e0\u6cd5\u83b7\u53d6\u5bbf\u4e3b\u4e0a\u4e0b\u6587\uff0c\u8bf7\u91cd\u65b0\u6253\u5f00\u6296\u97f3\u540e\u518d\u8bd5"

    .line 363
    .line 364
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 368
    :goto_6
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 369
    .line 370
    const-string v2, "rfae3094b732ade5a"

    .line 371
    .line 372
    if-eqz v1, :cond_d

    .line 373
    .line 374
    const-string v1, "exportActiveConversationAsync cancelled"

    .line 375
    .line 376
    const/4 v3, 0x4

    .line 377
    const/4 v4, 0x0

    .line 378
    invoke-static {v2, v1, v4, v3, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 379
    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_d
    const-string v1, "exportActiveConversationAsync failed"

    .line 383
    .line 384
    invoke-static {v2, v1, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 385
    .line 386
    .line 387
    :goto_7
    new-instance v1, Lp3;

    .line 388
    .line 389
    const/16 v2, 0x15

    .line 390
    .line 391
    invoke-direct {v1, p0, v2, v0}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v1}, Lnh0;->υ(Lp70;)V

    .line 395
    .line 396
    .line 397
    :goto_8
    sget-object p0, Ls62;->α:Ls62;

    .line 398
    .line 399
    return-object p0

    .line 400
    :pswitch_2
    iget-object v0, p0, Lvb0;->ζ:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v0, Ldc0;

    .line 403
    .line 404
    iget-object v1, v0, Ldc0;->β:Ljava/lang/ClassLoader;

    .line 405
    .line 406
    iget-object v2, p0, Lvb0;->η:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v2, Lum1;

    .line 409
    .line 410
    iget-object v3, p0, Lvb0;->κ:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v3, Ljava/util/ArrayList;

    .line 413
    .line 414
    iget-object v4, p0, Lvb0;->θ:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v4, Lum1;

    .line 417
    .line 418
    iget-object p0, p0, Lvb0;->ι:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast p0, Lum1;

    .line 421
    .line 422
    sget-object v5, Ls62;->α:Ls62;

    .line 423
    .line 424
    :try_start_1
    new-instance v6, Lwb0;

    .line 425
    .line 426
    const/4 v7, 0x2

    .line 427
    invoke-direct {v6, v0, v7}, Lwb0;-><init>(Ldc0;I)V

    .line 428
    .line 429
    .line 430
    new-instance v7, Lyb0;

    .line 431
    .line 432
    const/4 v8, 0x1

    .line 433
    invoke-direct {v7, v0, v8}, Lyb0;-><init>(Ldc0;I)V

    .line 434
    .line 435
    .line 436
    invoke-static {v1, v3, v6, v7}, Lx;->κ(Ljava/lang/ClassLoader;Ljava/util/ArrayList;Lp70;La80;)Leb0;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    iput-object v3, v2, Lum1;->ε:Ljava/lang/Object;

    .line 441
    .line 442
    new-instance v2, Lwb0;

    .line 443
    .line 444
    const/4 v3, 0x3

    .line 445
    invoke-direct {v2, v0, v3}, Lwb0;-><init>(Ldc0;I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v2}, Ldc0;->β(Lp70;)V

    .line 449
    .line 450
    .line 451
    new-instance v2, Lwb0;

    .line 452
    .line 453
    const/4 v3, 0x4

    .line 454
    invoke-direct {v2, v0, v3}, Lwb0;-><init>(Ldc0;I)V

    .line 455
    .line 456
    .line 457
    new-instance v0, Lzb0;

    .line 458
    .line 459
    const/4 v3, 0x4

    .line 460
    invoke-direct {v0, v3}, Lzb0;-><init>(I)V

    .line 461
    .line 462
    .line 463
    invoke-static {v1, v2, v0}, Lx;->Γ(Ljava/lang/ClassLoader;Lp70;La80;)Lsb0;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    iput-object v0, v4, Lum1;->ε:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 468
    .line 469
    move-object v1, v5

    .line 470
    goto :goto_9

    .line 471
    :catchall_1
    move-exception v0

    .line 472
    new-instance v1, Leo1;

    .line 473
    .line 474
    invoke-direct {v1, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 475
    .line 476
    .line 477
    :goto_9
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    if-eqz v0, :cond_e

    .line 482
    .line 483
    iput-object v0, p0, Lum1;->ε:Ljava/lang/Object;

    .line 484
    .line 485
    :cond_e
    return-object v5

    .line 486
    nop

    .line 487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
