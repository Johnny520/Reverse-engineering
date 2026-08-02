.class public final Lfa;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lfa;->i:I

    .line 2
    .line 3
    iput-object p2, p0, Lfa;->k:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lfa;->j:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lfa;->i:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Llx;

    .line 9
    .line 10
    iget-object v0, p0, Lfa;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lmn0;

    .line 13
    .line 14
    iget-object p0, p0, Lfa;->k:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lbg3;

    .line 17
    .line 18
    iget-boolean v2, p0, Lbg3;->j:Z

    .line 19
    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    iget-object v2, p1, Llx;->c:Lia1;

    .line 23
    .line 24
    iget-object v3, p1, Llx;->a:Landroid/view/View;

    .line 25
    .line 26
    invoke-interface {v2}, Lia1;->getLifecycle()Lba1;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iput-object v0, p0, Lbg3;->l:Lmn0;

    .line 31
    .line 32
    iget-object v4, p0, Lbg3;->k:Lba1;

    .line 33
    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v3}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {p1, v0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    new-instance p1, Lt7;

    .line 55
    .line 56
    const/4 v0, 0x6

    .line 57
    invoke-direct {p1, v0, p0, v2}, Lt7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iput-object v2, p0, Lbg3;->k:Lba1;

    .line 65
    .line 66
    invoke-virtual {v2, p0}, Lba1;->a(Lha1;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    check-cast v2, Lla1;

    .line 71
    .line 72
    iget-object v2, v2, Lla1;->h:Laa1;

    .line 73
    .line 74
    sget-object v3, Laa1;->j:Laa1;

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-ltz v2, :cond_2

    .line 81
    .line 82
    iget-object v2, p0, Lbg3;->i:Lfy;

    .line 83
    .line 84
    new-instance v3, Lky;

    .line 85
    .line 86
    invoke-direct {v3, p0, p1, v0}, Lky;-><init>(Lbg3;Llx;Lmn0;)V

    .line 87
    .line 88
    .line 89
    new-instance p0, Lkw;

    .line 90
    .line 91
    const p1, -0x66c1ecc8

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, p1, v1, v3}, Lkw;-><init>(IZLun0;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, p0}, Lfy;->A(Lmn0;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    :goto_0
    sget-object p0, La83;->a:La83;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_0
    check-cast p1, Lrz1;

    .line 104
    .line 105
    iget-object v0, p0, Lfa;->k:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, Lsz1;

    .line 108
    .line 109
    iget-object p0, p0, Lfa;->j:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, Lvq2;

    .line 112
    .line 113
    iget-object p0, p0, Lvq2;->G:Lv5;

    .line 114
    .line 115
    invoke-static {p1, v0, p0}, Lrz1;->k(Lrz1;Lsz1;Lin0;)V

    .line 116
    .line 117
    .line 118
    sget-object p0, La83;->a:La83;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_1
    check-cast p1, Landroid/view/MotionEvent;

    .line 122
    .line 123
    iget-object v0, p0, Lfa;->j:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, Lu12;

    .line 126
    .line 127
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_4

    .line 132
    .line 133
    iget-object p0, p0, Lfa;->k:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, Lkj1;

    .line 136
    .line 137
    invoke-virtual {v0}, Lu12;->f()Lin0;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Lcc;

    .line 142
    .line 143
    invoke-virtual {v0, p1}, Lcc;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    check-cast p1, Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_3

    .line 154
    .line 155
    sget-object p1, Lt12;->i:Lt12;

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    sget-object p1, Lt12;->j:Lt12;

    .line 159
    .line 160
    :goto_1
    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    invoke-virtual {v0}, Lu12;->f()Lin0;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, Lcc;

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Lcc;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    :goto_2
    sget-object p0, La83;->a:La83;

    .line 173
    .line 174
    return-object p0

    .line 175
    :pswitch_2
    check-cast p1, Lrz1;

    .line 176
    .line 177
    iget-object v0, p0, Lfa;->k:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lsz1;

    .line 180
    .line 181
    iget-object p0, p0, Lfa;->j:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p0, Lel;

    .line 184
    .line 185
    iget-object p0, p0, Lel;->v:Lin0;

    .line 186
    .line 187
    invoke-static {p1, v0, p0}, Lrz1;->k(Lrz1;Lsz1;Lin0;)V

    .line 188
    .line 189
    .line 190
    sget-object p0, La83;->a:La83;

    .line 191
    .line 192
    return-object p0

    .line 193
    :pswitch_3
    check-cast p1, Luh1;

    .line 194
    .line 195
    iget-object v0, p0, Lfa;->k:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lr61;

    .line 198
    .line 199
    iget-object p0, p0, Lfa;->j:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p0, Luh1;

    .line 202
    .line 203
    invoke-interface {p1, p0}, Luh1;->c(Luh1;)Luh1;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {v0, p0}, Lr61;->d0(Luh1;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, La83;->a:La83;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 214
    .line 215
    iget-object p1, p0, Lfa;->k:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p1, Lxb;

    .line 218
    .line 219
    iget-object p1, p1, Lxb;->i:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p1, Landroid/view/Choreographer;

    .line 222
    .line 223
    iget-object p0, p0, Lfa;->j:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p0, Lwb;

    .line 226
    .line 227
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 228
    .line 229
    .line 230
    sget-object p0, La83;->a:La83;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_5
    check-cast p1, Ljava/lang/Throwable;

    .line 234
    .line 235
    iget-object p1, p0, Lfa;->k:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p1, Lvb;

    .line 238
    .line 239
    iget-object p0, p0, Lfa;->j:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast p0, Lwb;

    .line 242
    .line 243
    iget-object v0, p1, Lvb;->l:Ljava/lang/Object;

    .line 244
    .line 245
    monitor-enter v0

    .line 246
    :try_start_0
    iget-object p1, p1, Lvb;->n:Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    .line 250
    .line 251
    monitor-exit v0

    .line 252
    sget-object p0, La83;->a:La83;

    .line 253
    .line 254
    return-object p0

    .line 255
    :catchall_0
    move-exception p0

    .line 256
    monitor-exit v0

    .line 257
    throw p0

    .line 258
    :pswitch_6
    check-cast p1, Lba0;

    .line 259
    .line 260
    iget-object p1, p0, Lfa;->k:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast p1, Ld22;

    .line 263
    .line 264
    iget-object p0, p0, Lfa;->j:Ljava/lang/Object;

    .line 265
    .line 266
    check-cast p0, Lg22;

    .line 267
    .line 268
    invoke-virtual {p1, p0}, Ld22;->setPositionProvider(Lg22;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p1}, Ld22;->r()V

    .line 272
    .line 273
    .line 274
    new-instance p0, Lka;

    .line 275
    .line 276
    invoke-direct {p0, v2}, Lka;-><init>(I)V

    .line 277
    .line 278
    .line 279
    return-object p0

    .line 280
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 281
    .line 282
    iget-object p1, p0, Lfa;->k:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast p1, Ltz0;

    .line 285
    .line 286
    iget-object v0, p1, Ltz0;->c:Ljava/lang/Object;

    .line 287
    .line 288
    monitor-enter v0

    .line 289
    :try_start_1
    iput-boolean v1, p1, Ltz0;->e:Z

    .line 290
    .line 291
    iget-object v1, p1, Ltz0;->d:Lzk1;

    .line 292
    .line 293
    iget-object v3, v1, Lzk1;->h:[Ljava/lang/Object;

    .line 294
    .line 295
    iget v1, v1, Lzk1;->j:I

    .line 296
    .line 297
    :goto_3
    const/4 v4, 0x0

    .line 298
    if-ge v2, v1, :cond_6

    .line 299
    .line 300
    aget-object v5, v3, v2

    .line 301
    .line 302
    check-cast v5, Lod3;

    .line 303
    .line 304
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    check-cast v5, Lxr1;

    .line 309
    .line 310
    if-eqz v5, :cond_5

    .line 311
    .line 312
    iget-object v6, v5, Lxr1;->b:Ll62;

    .line 313
    .line 314
    if-eqz v6, :cond_5

    .line 315
    .line 316
    invoke-virtual {v6}, Ll62;->closeConnection()V

    .line 317
    .line 318
    .line 319
    iput-object v4, v5, Lxr1;->b:Ll62;

    .line 320
    .line 321
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 322
    .line 323
    goto :goto_3

    .line 324
    :catchall_1
    move-exception p0

    .line 325
    goto :goto_4

    .line 326
    :cond_6
    iget-object p1, p1, Ltz0;->d:Lzk1;

    .line 327
    .line 328
    invoke-virtual {p1}, Lzk1;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 329
    .line 330
    .line 331
    monitor-exit v0

    .line 332
    iget-object p0, p0, Lfa;->j:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p0, Lga;

    .line 335
    .line 336
    iget-object p0, p0, Lga;->i:Lo03;

    .line 337
    .line 338
    iget-object p1, p0, Lo03;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 339
    .line 340
    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    iget-object p0, p0, Lo03;->a:Lv02;

    .line 344
    .line 345
    invoke-interface {p0}, Lv02;->g()V

    .line 346
    .line 347
    .line 348
    sget-object p0, La83;->a:La83;

    .line 349
    .line 350
    return-object p0

    .line 351
    :goto_4
    monitor-exit v0

    .line 352
    throw p0

    .line 353
    :pswitch_8
    check-cast p1, Lj20;

    .line 354
    .line 355
    new-instance p1, Ltz0;

    .line 356
    .line 357
    iget-object v0, p0, Lfa;->k:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v0, Lu91;

    .line 360
    .line 361
    new-instance v1, Lea;

    .line 362
    .line 363
    iget-object p0, p0, Lfa;->j:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast p0, Lga;

    .line 366
    .line 367
    invoke-direct {v1, v2, p0}, Lea;-><init>(ILjava/lang/Object;)V

    .line 368
    .line 369
    .line 370
    invoke-direct {p1, v0, v1}, Ltz0;-><init>(Lu91;Lea;)V

    .line 371
    .line 372
    .line 373
    return-object p1

    .line 374
    nop

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
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
