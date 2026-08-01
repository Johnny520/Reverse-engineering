.class public final synthetic Lo0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lo0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lo0/a;->c:Ljava/lang/Object;

    iput-object p3, p0, Lo0/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lo0/a;->a:I

    iput-object p1, p0, Lo0/a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lo0/a;->d:Ljava/lang/Object;

    iput-object p3, p0, Lo0/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lz0/b;LM0/l;)V
    .locals 1

    .line 3
    const/4 v0, 0x4

    iput v0, p0, Lo0/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo0/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lo0/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Lo0/a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lo0/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lo0/a;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    check-cast p1, LD0/c;

    .line 11
    .line 12
    const-string v1, "response code is "

    .line 13
    .line 14
    const-string v2, "response"

    .line 15
    .line 16
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    :try_start_0
    iget-object v4, p1, LD0/c;->d:Ljava/lang/Throwable;

    .line 22
    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    iget v4, p1, LD0/c;->a:I

    .line 26
    .line 27
    const/16 v5, 0xc8

    .line 28
    .line 29
    if-ne v4, v5, :cond_0

    .line 30
    .line 31
    new-instance v1, Ljava/lang/String;

    .line 32
    .line 33
    iget-object p1, p1, LD0/c;->c:[B

    .line 34
    .line 35
    sget-object v4, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 36
    .line 37
    invoke-direct {v1, p1, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 38
    .line 39
    .line 40
    sget-object p1, Lz0/d;->a:Lz0/c;

    .line 41
    .line 42
    invoke-static {v1}, Lz0/c;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1}, Lz0/c;->a(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0}, Lz0/c;->e(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1, v3, v2}, Lz0/c;->f(Ljava/lang/String;ZLjava/lang/Throwable;)Lz0/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    iget p1, p1, LD0/c;->a:I

    .line 63
    .line 64
    new-instance v4, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_1
    throw v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    :goto_0
    sget-object v0, Lz0/d;->a:Lz0/c;

    .line 82
    .line 83
    invoke-static {p1, v3}, Lz0/c;->g(Ljava/lang/Throwable;Z)Lz0/b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-nez v1, :cond_7

    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    invoke-static {p1, v1}, Lz0/c;->g(Ljava/lang/Throwable;Z)Lz0/b;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-nez v1, :cond_3

    .line 95
    .line 96
    :cond_2
    move-object v1, v2

    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-static {v1}, Lz0/c;->d(Lz0/b;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    :goto_1
    if-eqz v1, :cond_4

    .line 105
    .line 106
    const/16 v2, 0x3fc

    .line 107
    .line 108
    invoke-static {v1, p1, v2}, Lz0/b;->a(Lz0/b;Ljava/lang/Throwable;I)Lz0/b;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    new-instance v1, Lorg/json/JSONObject;

    .line 113
    .line 114
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v4, "serviceEnabled"

    .line 118
    .line 119
    iget-boolean v5, v2, Lz0/b;->a:Z

    .line 120
    .line 121
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-string v4, "serviceMessage"

    .line 126
    .line 127
    iget-object v5, v2, Lz0/b;->b:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v4, "validUntil"

    .line 134
    .line 135
    iget-wide v5, v2, Lz0/b;->c:J

    .line 136
    .line 137
    invoke-virtual {v1, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    const-string v4, "updateEnabled"

    .line 142
    .line 143
    iget-boolean v5, v2, Lz0/b;->d:Z

    .line 144
    .line 145
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const-string v4, "latestVersionCode"

    .line 150
    .line 151
    iget v5, v2, Lz0/b;->e:I

    .line 152
    .line 153
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const-string v4, "latestVersionName"

    .line 158
    .line 159
    iget-object v5, v2, Lz0/b;->f:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    const-string v4, "forceUpdate"

    .line 166
    .line 167
    iget-boolean v5, v2, Lz0/b;->g:Z

    .line 168
    .line 169
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-string v4, "updateMessage"

    .line 174
    .line 175
    iget-object v5, v2, Lz0/b;->h:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const-string v4, "downloadUrl"

    .line 182
    .line 183
    iget-object v5, v2, Lz0/b;->i:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    const-string v4, "serverTime"

    .line 190
    .line 191
    iget-wide v5, v2, Lz0/b;->j:J

    .line 192
    .line 193
    invoke-virtual {v1, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    const-string v4, "put(...)"

    .line 198
    .line 199
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    const-string v4, "toString(...)"

    .line 207
    .line 208
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v1}, Lz0/c;->a(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    :cond_4
    if-nez v2, :cond_6

    .line 215
    .line 216
    iget-object v0, p0, Lo0/a;->b:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v0, Lz0/b;

    .line 219
    .line 220
    if-nez v0, :cond_5

    .line 221
    .line 222
    new-instance v0, Lz0/b;

    .line 223
    .line 224
    const/16 v1, 0x7ff

    .line 225
    .line 226
    invoke-direct {v0, p1, v1}, Lz0/b;-><init>(Ljava/lang/Throwable;I)V

    .line 227
    .line 228
    .line 229
    :cond_5
    move-object p1, v0

    .line 230
    goto :goto_2

    .line 231
    :cond_6
    move-object p1, v2

    .line 232
    goto :goto_2

    .line 233
    :cond_7
    move-object p1, v1

    .line 234
    :goto_2
    sget-object v0, Lz0/d;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 235
    .line 236
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 237
    .line 238
    .line 239
    iget-object v0, p0, Lo0/a;->d:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, LM0/l;

    .line 242
    .line 243
    invoke-interface {v0, p1}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    sget-object p1, LE0/i;->a:LE0/i;

    .line 247
    .line 248
    return-object p1

    .line 249
    :pswitch_0
    check-cast p1, Lz0/b;

    .line 250
    .line 251
    const-string v0, "result"

    .line 252
    .line 253
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget-boolean v0, p1, Lz0/b;->a:Z

    .line 257
    .line 258
    iget-object v1, p0, Lo0/a;->b:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v1, Lx0/b;

    .line 261
    .line 262
    iget-object v2, p0, Lo0/a;->d:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v2, Landroid/content/Context;

    .line 265
    .line 266
    if-nez v0, :cond_8

    .line 267
    .line 268
    invoke-virtual {v1, v2, p1}, Lx0/b;->c(Landroid/content/Context;Lz0/b;)V

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_8
    invoke-virtual {p1}, Lz0/b;->b()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    const/4 v3, 0x0

    .line 277
    if-eqz v0, :cond_9

    .line 278
    .line 279
    invoke-virtual {v1, v2, p1, v3}, Lx0/b;->d(Landroid/content/Context;Lz0/b;Z)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_9
    iput-boolean v3, v1, Lx0/b;->d:Z

    .line 284
    .line 285
    iget-object p1, p1, Lz0/b;->l:Ljava/lang/Throwable;

    .line 286
    .line 287
    if-nez p1, :cond_a

    .line 288
    .line 289
    iget-object p1, p0, Lo0/a;->c:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast p1, Ljava/lang/String;

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_a
    const-string p1, "\u68c0\u67e5\u66f4\u65b0\u5931\u8d25"

    .line 295
    .line 296
    :goto_3
    invoke-static {p1}, Lb1/h;->P(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :goto_4
    sget-object p1, LE0/i;->a:LE0/i;

    .line 300
    .line 301
    return-object p1

    .line 302
    :pswitch_1
    check-cast p1, Landroid/widget/TextView;

    .line 303
    .line 304
    const-string v0, "textView"

    .line 305
    .line 306
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    if-eqz v0, :cond_b

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    goto :goto_5

    .line 320
    :cond_b
    const/4 v0, 0x0

    .line 321
    :goto_5
    if-nez v0, :cond_c

    .line 322
    .line 323
    const-string v0, ""

    .line 324
    .line 325
    :cond_c
    iget-object v1, p0, Lo0/a;->b:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v1, Lr0/l1;

    .line 328
    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    const-string v1, "\u6587\u4ef6\u5927\u5c0f"

    .line 341
    .line 342
    const/4 v2, 0x0

    .line 343
    invoke-static {v0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-nez v1, :cond_d

    .line 348
    .line 349
    const-string v1, "file size"

    .line 350
    .line 351
    const/4 v2, 0x1

    .line 352
    invoke-static {v0, v1, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_e

    .line 357
    .line 358
    :cond_d
    iget-object v0, p0, Lo0/a;->c:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Landroid/view/View;

    .line 361
    .line 362
    invoke-static {p1, v0}, Lr0/l1;->m(Landroid/widget/TextView;Landroid/view/View;)Landroid/view/View;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    iget-object v0, p0, Lo0/a;->d:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v0, Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    :cond_e
    sget-object p1, LE0/i;->a:LE0/i;

    .line 374
    .line 375
    return-object p1

    .line 376
    :pswitch_2
    check-cast p1, LD0/c;

    .line 377
    .line 378
    iget-object v0, p0, Lo0/a;->b:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Ljava/io/File;

    .line 381
    .line 382
    iget-object v1, p0, Lo0/a;->c:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v1, Ljava/lang/String;

    .line 385
    .line 386
    iget-object v2, p0, Lo0/a;->d:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v2, Ljava/lang/String;

    .line 389
    .line 390
    invoke-static {v0, v1, v2, p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->d(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;LD0/c;)LE0/i;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    return-object p1

    .line 395
    :pswitch_3
    check-cast p1, LD0/c;

    .line 396
    .line 397
    iget-object v0, p0, Lo0/a;->b:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v0, Ljava/io/File;

    .line 400
    .line 401
    iget-object v1, p0, Lo0/a;->d:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v1, LM0/p;

    .line 404
    .line 405
    iget-object v2, p0, Lo0/a;->c:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v2, Ljava/lang/String;

    .line 408
    .line 409
    invoke-static {v0, v1, v2, p1}, Lcom/lu/wxmask/config/AppConfigUtil$Companion;->b(Ljava/io/File;LM0/p;Ljava/lang/String;LD0/c;)LE0/i;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    return-object p1

    .line 414
    nop

    .line 415
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
