.class public final synthetic Lhb/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lhb/i0;Lfg/l;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lhb/x;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lhb/x;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lhb/x;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lhb/x;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lhb/x;->l:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lhb/x;->m:Ljava/lang/Object;

    .line 16
    .line 17
    iput-boolean p6, p0, Lhb/x;->h:Z

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lw/q0;ZLy1/o2;Lh0/d1;Ln2/s;Lb5/k;)V
    .locals 1

    .line 20
    const/4 v0, 0x2

    iput v0, p0, Lhb/x;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/x;->i:Ljava/lang/Object;

    iput-boolean p2, p0, Lhb/x;->h:Z

    iput-object p3, p0, Lhb/x;->j:Ljava/lang/Object;

    iput-object p4, p0, Lhb/x;->k:Ljava/lang/Object;

    iput-object p5, p0, Lhb/x;->l:Ljava/lang/Object;

    iput-object p6, p0, Lhb/x;->m:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Li0/a1;Ljava/util/List;Ljava/util/ArrayList;Lfg/l;)V
    .locals 1

    .line 21
    const/4 v0, 0x3

    iput v0, p0, Lhb/x;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lhb/x;->h:Z

    iput-object p2, p0, Lhb/x;->k:Ljava/lang/Object;

    iput-object p3, p0, Lhb/x;->i:Ljava/lang/Object;

    iput-object p4, p0, Lhb/x;->j:Ljava/lang/Object;

    iput-object p5, p0, Lhb/x;->l:Ljava/lang/Object;

    iput-object p6, p0, Lhb/x;->m:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 22
    iput p7, p0, Lhb/x;->g:I

    iput-boolean p1, p0, Lhb/x;->h:Z

    iput-object p2, p0, Lhb/x;->i:Ljava/lang/Object;

    iput-object p3, p0, Lhb/x;->j:Ljava/lang/Object;

    iput-object p4, p0, Lhb/x;->k:Ljava/lang/Object;

    iput-object p5, p0, Lhb/x;->l:Ljava/lang/Object;

    iput-object p6, p0, Lhb/x;->m:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lhb/x;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lhb/x;->i:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Li0/a1;

    .line 10
    .line 11
    iget-object v0, p0, Lhb/x;->j:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Ljava/util/Set;

    .line 15
    .line 16
    iget-object v0, p0, Lhb/x;->k:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Lfg/l;

    .line 20
    .line 21
    iget-object v0, p0, Lhb/x;->l:Ljava/lang/Object;

    .line 22
    .line 23
    move-object v5, v0

    .line 24
    check-cast v5, Ln9/a;

    .line 25
    .line 26
    iget-object v0, p0, Lhb/x;->m:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lfg/a;

    .line 29
    .line 30
    check-cast p1, Lr/h;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    sget-object v1, Lwb/p0;->p3:Ls0/d;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x3

    .line 39
    invoke-static {p1, v7, v1, v8}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lc9/k0;

    .line 43
    .line 44
    const/16 v6, 0xb

    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Lc9/k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lfg/l;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    new-instance v2, Ls0/d;

    .line 50
    .line 51
    const v3, 0x3e87c7c

    .line 52
    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-direct {v2, v3, v1, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v7, v2, v8}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 59
    .line 60
    .line 61
    iget-boolean v1, p0, Lhb/x;->h:Z

    .line 62
    .line 63
    if-eqz v1, :cond_0

    .line 64
    .line 65
    sget-object v1, Lwb/p0;->q3:Ls0/d;

    .line 66
    .line 67
    invoke-static {p1, v7, v1, v8}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lwb/x6;

    .line 71
    .line 72
    const/16 v2, 0x9

    .line 73
    .line 74
    invoke-direct {v1, v0, v2}, Lwb/x6;-><init>(Lfg/a;I)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Ls0/d;

    .line 78
    .line 79
    const v2, -0x3427fc3f    # -2.8313474E7f

    .line 80
    .line 81
    .line 82
    invoke-direct {v0, v2, v1, v4}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v7, v0, v8}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 86
    .line 87
    .line 88
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_0
    iget-object v0, p0, Lhb/x;->k:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lfg/l;

    .line 94
    .line 95
    iget-object v1, p0, Lhb/x;->i:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Li0/a1;

    .line 98
    .line 99
    iget-object v2, p0, Lhb/x;->j:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Ljava/util/List;

    .line 102
    .line 103
    iget-object v3, p0, Lhb/x;->l:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v3, Ljava/util/ArrayList;

    .line 106
    .line 107
    iget-object v4, p0, Lhb/x;->m:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v4, Lfg/l;

    .line 110
    .line 111
    check-cast p1, Lr/h;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    sget-object v5, Lwb/p0;->f3:Ls0/d;

    .line 117
    .line 118
    const/4 v6, 0x0

    .line 119
    const/4 v7, 0x3

    .line 120
    invoke-static {p1, v6, v5, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 121
    .line 122
    .line 123
    new-instance v5, Lh0/f;

    .line 124
    .line 125
    const/4 v8, 0x2

    .line 126
    iget-boolean v9, p0, Lhb/x;->h:Z

    .line 127
    .line 128
    invoke-direct {v5, v9, v0, v8}, Lh0/f;-><init>(ZLjava/lang/Object;I)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Ls0/d;

    .line 132
    .line 133
    const v8, 0x7cd855e6

    .line 134
    .line 135
    .line 136
    const/4 v9, 0x1

    .line 137
    invoke-direct {v0, v8, v5, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1, v6, v0, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 141
    .line 142
    .line 143
    sget-object v0, Lwb/p0;->g3:Ls0/d;

    .line 144
    .line 145
    invoke-static {p1, v6, v0, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 146
    .line 147
    .line 148
    new-instance v0, Lwb/s1;

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    invoke-direct {v0, v1, v5}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 152
    .line 153
    .line 154
    new-instance v1, Ls0/d;

    .line 155
    .line 156
    const v5, -0xb2630dc

    .line 157
    .line 158
    .line 159
    invoke-direct {v1, v5, v0, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 160
    .line 161
    .line 162
    invoke-static {p1, v6, v1, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 163
    .line 164
    .line 165
    new-instance v0, Lc9/h0;

    .line 166
    .line 167
    const/4 v1, 0x2

    .line 168
    invoke-direct {v0, v2, v3, v4, v1}, Lc9/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 169
    .line 170
    .line 171
    new-instance v1, Ls0/d;

    .line 172
    .line 173
    const v2, 0x30da8bc3

    .line 174
    .line 175
    .line 176
    invoke-direct {v1, v2, v0, v9}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 177
    .line 178
    .line 179
    invoke-static {p1, v6, v1, v7}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 180
    .line 181
    .line 182
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 183
    .line 184
    return-object p1

    .line 185
    :pswitch_1
    iget-object v0, p0, Lhb/x;->i:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, Lw/q0;

    .line 188
    .line 189
    iget-object v1, v0, Lw/q0;->o:Li0/j1;

    .line 190
    .line 191
    iget-object v2, p0, Lhb/x;->j:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v2, Ly1/o2;

    .line 194
    .line 195
    iget-object v3, p0, Lhb/x;->k:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v3, Lh0/d1;

    .line 198
    .line 199
    iget-object v4, p0, Lhb/x;->l:Ljava/lang/Object;

    .line 200
    .line 201
    move-object v6, v4

    .line 202
    check-cast v6, Ln2/s;

    .line 203
    .line 204
    iget-object v4, p0, Lhb/x;->m:Ljava/lang/Object;

    .line 205
    .line 206
    move-object v7, v4

    .line 207
    check-cast v7, Lb5/k;

    .line 208
    .line 209
    check-cast p1, Lv1/t;

    .line 210
    .line 211
    iput-object p1, v0, Lw/q0;->h:Lv1/t;

    .line 212
    .line 213
    invoke-virtual {v0}, Lw/q0;->d()Lw/m1;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    if-eqz v4, :cond_1

    .line 218
    .line 219
    iput-object p1, v4, Lw/m1;->b:Lv1/t;

    .line 220
    .line 221
    :cond_1
    iget-boolean p1, p0, Lhb/x;->h:Z

    .line 222
    .line 223
    if-eqz p1, :cond_6

    .line 224
    .line 225
    invoke-virtual {v0}, Lw/q0;->a()Lw/h0;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    sget-object v4, Lw/h0;->h:Lw/h0;

    .line 230
    .line 231
    const/4 v5, 0x0

    .line 232
    const/4 v8, 0x1

    .line 233
    if-ne p1, v4, :cond_3

    .line 234
    .line 235
    iget-object p1, v0, Lw/q0;->l:Li0/j1;

    .line 236
    .line 237
    invoke-virtual {p1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    check-cast p1, Ljava/lang/Boolean;

    .line 242
    .line 243
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 244
    .line 245
    .line 246
    move-result p1

    .line 247
    if-eqz p1, :cond_2

    .line 248
    .line 249
    check-cast v2, Ly1/v1;

    .line 250
    .line 251
    iget-object p1, v2, Ly1/v1;->c:Li0/j1;

    .line 252
    .line 253
    invoke-virtual {p1}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    check-cast p1, Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-eqz p1, :cond_2

    .line 264
    .line 265
    invoke-virtual {v3}, Lh0/d1;->r()V

    .line 266
    .line 267
    .line 268
    goto :goto_0

    .line 269
    :cond_2
    invoke-virtual {v3}, Lh0/d1;->o()V

    .line 270
    .line 271
    .line 272
    :goto_0
    invoke-static {v3, v8}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    iget-object v2, v0, Lw/q0;->m:Li0/j1;

    .line 277
    .line 278
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {v2, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v3, v5}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    iget-object v2, v0, Lw/q0;->n:Li0/j1;

    .line 290
    .line 291
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    invoke-virtual {v2, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    iget-wide v2, v6, Ln2/s;->b:J

    .line 299
    .line 300
    invoke-static {v2, v3}, Li2/m0;->c(J)Z

    .line 301
    .line 302
    .line 303
    move-result p1

    .line 304
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-virtual {v1, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    goto :goto_1

    .line 312
    :cond_3
    invoke-virtual {v0}, Lw/q0;->a()Lw/h0;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    sget-object v2, Lw/h0;->i:Lw/h0;

    .line 317
    .line 318
    if-ne p1, v2, :cond_4

    .line 319
    .line 320
    invoke-static {v3, v8}, Lfb/v0;->z(Lh0/d1;Z)Z

    .line 321
    .line 322
    .line 323
    move-result p1

    .line 324
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {v1, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    :cond_4
    :goto_1
    invoke-static {v0, v6, v7}, Lw/s;->w(Lw/q0;Ln2/s;Lb5/k;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Lw/q0;->d()Lw/m1;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    if-eqz p1, :cond_6

    .line 339
    .line 340
    iget-object v1, v0, Lw/q0;->e:Ln2/y;

    .line 341
    .line 342
    if-eqz v1, :cond_6

    .line 343
    .line 344
    invoke-virtual {v0}, Lw/q0;->b()Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-eqz v0, :cond_6

    .line 349
    .line 350
    iget-object v0, p1, Lw/m1;->b:Lv1/t;

    .line 351
    .line 352
    if-eqz v0, :cond_6

    .line 353
    .line 354
    invoke-interface {v0}, Lv1/t;->C()Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-nez v2, :cond_5

    .line 359
    .line 360
    goto :goto_2

    .line 361
    :cond_5
    iget-object v2, p1, Lw/m1;->c:Lv1/t;

    .line 362
    .line 363
    if-eqz v2, :cond_6

    .line 364
    .line 365
    iget-object v8, p1, Lw/m1;->a:Li2/k0;

    .line 366
    .line 367
    new-instance v9, Li0/c;

    .line 368
    .line 369
    const/4 p1, 0x2

    .line 370
    invoke-direct {v9, v0, p1}, Li0/c;-><init>(Ljava/lang/Object;I)V

    .line 371
    .line 372
    .line 373
    invoke-static {v0}, Lac/p;->O(Lv1/t;)Le1/c;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    invoke-interface {v0, v2, v5}, Lv1/t;->k0(Lv1/t;Z)Le1/c;

    .line 378
    .line 379
    .line 380
    move-result-object v11

    .line 381
    iget-object p1, v1, Ln2/y;->a:Ln2/t;

    .line 382
    .line 383
    iget-object p1, p1, Ln2/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    check-cast p1, Ln2/y;

    .line 390
    .line 391
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result p1

    .line 395
    if-eqz p1, :cond_6

    .line 396
    .line 397
    iget-object v5, v1, Ln2/y;->b:Ln2/n;

    .line 398
    .line 399
    invoke-interface/range {v5 .. v11}, Ln2/n;->g(Ln2/s;Lb5/k;Li2/k0;Li0/c;Le1/c;Le1/c;)V

    .line 400
    .line 401
    .line 402
    :cond_6
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 403
    .line 404
    return-object p1

    .line 405
    :pswitch_2
    iget-object v0, p0, Lhb/x;->i:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v0, Ln1/a;

    .line 408
    .line 409
    iget-object v1, p0, Lhb/x;->j:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v1, Li0/f1;

    .line 412
    .line 413
    iget-object v2, p0, Lhb/x;->k:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v2, Li0/f1;

    .line 416
    .line 417
    iget-object v3, p0, Lhb/x;->l:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v3, Li0/a1;

    .line 420
    .line 421
    iget-object v4, p0, Lhb/x;->m:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v4, Li0/a1;

    .line 424
    .line 425
    check-cast p1, Ljava/lang/Float;

    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 428
    .line 429
    .line 430
    move-result p1

    .line 431
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    const/high16 v6, 0x40000000    # 2.0f

    .line 436
    .line 437
    div-float/2addr p1, v6

    .line 438
    add-float/2addr p1, v5

    .line 439
    invoke-virtual {v1, p1}, Li0/f1;->h(F)V

    .line 440
    .line 441
    .line 442
    iget-boolean p1, p0, Lhb/x;->h:Z

    .line 443
    .line 444
    const/high16 v5, 0x41a80000    # 21.0f

    .line 445
    .line 446
    const/high16 v6, -0x3e580000    # -21.0f

    .line 447
    .line 448
    const/4 v7, 0x0

    .line 449
    if-eqz p1, :cond_7

    .line 450
    .line 451
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 452
    .line 453
    .line 454
    move-result v1

    .line 455
    invoke-static {v1, v6, v7}, Lr9/e0;->q(FFF)F

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    goto :goto_3

    .line 460
    :cond_7
    invoke-virtual {v1}, Li0/f1;->g()F

    .line 461
    .line 462
    .line 463
    move-result v1

    .line 464
    invoke-static {v1, v7, v5}, Lr9/e0;->q(FFF)F

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    :goto_3
    invoke-virtual {v2, v1}, Li0/f1;->h(F)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    const/high16 v8, -0x3ed00000    # -11.0f

    .line 476
    .line 477
    cmpg-float v8, v8, v1

    .line 478
    .line 479
    if-gtz v8, :cond_8

    .line 480
    .line 481
    const/high16 v8, -0x3ee00000    # -10.0f

    .line 482
    .line 483
    cmpg-float v1, v1, v8

    .line 484
    .line 485
    if-gtz v1, :cond_8

    .line 486
    .line 487
    goto :goto_4

    .line 488
    :cond_8
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    const/high16 v8, 0x41200000    # 10.0f

    .line 493
    .line 494
    cmpg-float v8, v8, v1

    .line 495
    .line 496
    if-gtz v8, :cond_9

    .line 497
    .line 498
    const/high16 v8, 0x41300000    # 11.0f

    .line 499
    .line 500
    cmpg-float v1, v1, v8

    .line 501
    .line 502
    if-gtz v1, :cond_9

    .line 503
    .line 504
    :goto_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 505
    .line 506
    invoke-interface {v3, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    goto/16 :goto_8

    .line 510
    .line 511
    :cond_9
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    const/high16 v8, -0x3e600000    # -20.0f

    .line 516
    .line 517
    cmpg-float v8, v8, v1

    .line 518
    .line 519
    if-gtz v8, :cond_a

    .line 520
    .line 521
    const/high16 v8, -0x40800000    # -1.0f

    .line 522
    .line 523
    cmpg-float v1, v1, v8

    .line 524
    .line 525
    if-gtz v1, :cond_a

    .line 526
    .line 527
    goto :goto_5

    .line 528
    :cond_a
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    const/high16 v8, 0x3f800000    # 1.0f

    .line 533
    .line 534
    cmpg-float v8, v8, v1

    .line 535
    .line 536
    if-gtz v8, :cond_b

    .line 537
    .line 538
    const/high16 v8, 0x41a00000    # 20.0f

    .line 539
    .line 540
    cmpg-float v1, v1, v8

    .line 541
    .line 542
    if-gtz v1, :cond_b

    .line 543
    .line 544
    :goto_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 545
    .line 546
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 547
    .line 548
    .line 549
    goto :goto_8

    .line 550
    :cond_b
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    check-cast v1, Ljava/lang/Boolean;

    .line 555
    .line 556
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 557
    .line 558
    .line 559
    move-result v1

    .line 560
    if-nez v1, :cond_f

    .line 561
    .line 562
    if-eqz p1, :cond_c

    .line 563
    .line 564
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 565
    .line 566
    .line 567
    move-result v1

    .line 568
    cmpg-float v1, v1, v6

    .line 569
    .line 570
    if-nez v1, :cond_c

    .line 571
    .line 572
    goto :goto_6

    .line 573
    :cond_c
    if-nez p1, :cond_d

    .line 574
    .line 575
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    cmpg-float v1, v1, v7

    .line 580
    .line 581
    if-nez v1, :cond_d

    .line 582
    .line 583
    :goto_6
    const/16 p1, 0x16

    .line 584
    .line 585
    check-cast v0, Ln1/c;

    .line 586
    .line 587
    invoke-virtual {v0, p1}, Ln1/c;->a(I)V

    .line 588
    .line 589
    .line 590
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 591
    .line 592
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    invoke-interface {v3, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    goto :goto_8

    .line 599
    :cond_d
    if-eqz p1, :cond_e

    .line 600
    .line 601
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    cmpg-float v1, v1, v7

    .line 606
    .line 607
    if-nez v1, :cond_e

    .line 608
    .line 609
    goto :goto_7

    .line 610
    :cond_e
    if-nez p1, :cond_f

    .line 611
    .line 612
    invoke-virtual {v2}, Li0/f1;->g()F

    .line 613
    .line 614
    .line 615
    move-result p1

    .line 616
    cmpg-float p1, p1, v5

    .line 617
    .line 618
    if-nez p1, :cond_f

    .line 619
    .line 620
    :goto_7
    const/16 p1, 0x15

    .line 621
    .line 622
    check-cast v0, Ln1/c;

    .line 623
    .line 624
    invoke-virtual {v0, p1}, Ln1/c;->a(I)V

    .line 625
    .line 626
    .line 627
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 628
    .line 629
    invoke-interface {v4, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 630
    .line 631
    .line 632
    invoke-interface {v3, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    :cond_f
    :goto_8
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 636
    .line 637
    return-object p1

    .line 638
    :pswitch_3
    iget-object v0, p0, Lhb/x;->i:Ljava/lang/Object;

    .line 639
    .line 640
    move-object v1, v0

    .line 641
    check-cast v1, Landroid/app/Activity;

    .line 642
    .line 643
    iget-object v0, p0, Lhb/x;->j:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v0, Lhb/i0;

    .line 646
    .line 647
    iget-object v2, p0, Lhb/x;->k:Ljava/lang/Object;

    .line 648
    .line 649
    move-object v3, v2

    .line 650
    check-cast v3, Lfg/l;

    .line 651
    .line 652
    iget-object v2, p0, Lhb/x;->l:Ljava/lang/Object;

    .line 653
    .line 654
    move-object v5, v2

    .line 655
    check-cast v5, Ljava/lang/String;

    .line 656
    .line 657
    iget-object v2, p0, Lhb/x;->m:Ljava/lang/Object;

    .line 658
    .line 659
    move-object v6, v2

    .line 660
    check-cast v6, Ljava/lang/String;

    .line 661
    .line 662
    move-object v2, p1

    .line 663
    check-cast v2, Ljava/util/List;

    .line 664
    .line 665
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 669
    .line 670
    .line 671
    move-result p1

    .line 672
    if-nez p1, :cond_12

    .line 673
    .line 674
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 675
    .line 676
    .line 677
    move-result p1

    .line 678
    if-eqz p1, :cond_10

    .line 679
    .line 680
    goto :goto_9

    .line 681
    :cond_10
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 682
    .line 683
    .line 684
    move-result p1

    .line 685
    if-eqz p1, :cond_11

    .line 686
    .line 687
    const-string p1, "\u6ca1\u6709\u53ef\u7528\u8054\u7cfb\u4eba"

    .line 688
    .line 689
    invoke-virtual {v0, v1, p1}, Lhb/i0;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    goto :goto_9

    .line 693
    :cond_11
    new-instance v4, Lk/s1;

    .line 694
    .line 695
    const/4 p1, 0x7

    .line 696
    invoke-direct {v4, p1}, Lk/s1;-><init>(I)V

    .line 697
    .line 698
    .line 699
    iget-boolean p1, p0, Lhb/x;->h:Z

    .line 700
    .line 701
    xor-int/lit8 v7, p1, 0x1

    .line 702
    .line 703
    const/4 v10, 0x0

    .line 704
    const/16 v11, 0xf80

    .line 705
    .line 706
    const/4 v8, 0x0

    .line 707
    const/4 v9, 0x0

    .line 708
    invoke-static/range {v1 .. v11}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 709
    .line 710
    .line 711
    :cond_12
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 712
    .line 713
    return-object p1

    .line 714
    nop

    .line 715
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
