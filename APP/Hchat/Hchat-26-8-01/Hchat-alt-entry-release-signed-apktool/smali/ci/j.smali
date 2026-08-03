.class public final Lci/j;
.super Lyf/i;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic h:I

.field public i:I

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILxb/i;Li0/g1;Lwf/c;)V
    .locals 1

    .line 1
    const/16 v0, 0x13

    .line 2
    .line 3
    iput v0, p0, Lci/j;->h:I

    .line 4
    .line 5
    iput p1, p0, Lci/j;->i:I

    .line 6
    .line 7
    iput-object p2, p0, Lci/j;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Lci/j;->k:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p4}, Lyf/i;-><init>(ILwf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/view/textclassifier/TextClassifier;Lfg/p;Lwf/c;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lci/j;->h:I

    .line 16
    iput-object p1, p0, Lci/j;->j:Ljava/lang/Object;

    check-cast p2, Lyf/i;

    iput-object p2, p0, Lci/j;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 17
    iput p4, p0, Lci/j;->h:I

    iput-object p1, p0, Lci/j;->j:Ljava/lang/Object;

    iput-object p2, p0, Lci/j;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lwf/c;I)V
    .locals 0

    .line 18
    iput p3, p0, Lci/j;->h:I

    iput-object p1, p0, Lci/j;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lyf/i;-><init>(ILwf/c;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lwf/c;)Lwf/c;
    .locals 3

    .line 1
    iget v0, p0, Lci/j;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lci/j;

    .line 7
    .line 8
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ly2/x;

    .line 11
    .line 12
    const/16 v2, 0x1d

    .line 13
    .line 14
    invoke-direct {v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lci/j;->j:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    new-instance p1, Lci/j;

    .line 21
    .line 22
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Li0/y1;

    .line 25
    .line 26
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Landroid/view/View;

    .line 29
    .line 30
    const/16 v2, 0x1c

    .line 31
    .line 32
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_1
    new-instance p1, Lci/j;

    .line 37
    .line 38
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ltg/z;

    .line 41
    .line 42
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ly1/z1;

    .line 45
    .line 46
    const/16 v2, 0x1b

    .line 47
    .line 48
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_2
    new-instance v0, Lci/j;

    .line 53
    .line 54
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ly1/k0;

    .line 57
    .line 58
    const/16 v2, 0x1a

    .line 59
    .line 60
    invoke-direct {v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 61
    .line 62
    .line 63
    iput-object p1, v0, Lci/j;->j:Ljava/lang/Object;

    .line 64
    .line 65
    return-object v0

    .line 66
    :pswitch_3
    new-instance p1, Lci/j;

    .line 67
    .line 68
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lxb/o;

    .line 71
    .line 72
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Ls1/t;

    .line 75
    .line 76
    const/16 v2, 0x19

    .line 77
    .line 78
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    :pswitch_4
    new-instance v0, Lci/j;

    .line 83
    .line 84
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v1, Lxb/i;

    .line 87
    .line 88
    const/16 v2, 0x18

    .line 89
    .line 90
    invoke-direct {v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 91
    .line 92
    .line 93
    iput-object p1, v0, Lci/j;->j:Ljava/lang/Object;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_5
    new-instance p1, Lci/j;

    .line 97
    .line 98
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Lx2/n;

    .line 101
    .line 102
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Le1/c;

    .line 105
    .line 106
    const/16 v2, 0x17

    .line 107
    .line 108
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :pswitch_6
    new-instance p1, Lci/j;

    .line 113
    .line 114
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, Lr/z;

    .line 117
    .line 118
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v1, Ljava/util/List;

    .line 121
    .line 122
    const/16 v2, 0x16

    .line 123
    .line 124
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :pswitch_7
    new-instance p1, Lci/j;

    .line 129
    .line 130
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Li0/a1;

    .line 133
    .line 134
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v1, Li0/a1;

    .line 137
    .line 138
    const/16 v2, 0x15

    .line 139
    .line 140
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 141
    .line 142
    .line 143
    return-object p1

    .line 144
    :pswitch_8
    new-instance p1, Lci/j;

    .line 145
    .line 146
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Li/c;

    .line 149
    .line 150
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Le1/b;

    .line 153
    .line 154
    const/16 v2, 0x14

    .line 155
    .line 156
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 157
    .line 158
    .line 159
    return-object p1

    .line 160
    :pswitch_9
    new-instance p1, Lci/j;

    .line 161
    .line 162
    iget v0, p0, Lci/j;->i:I

    .line 163
    .line 164
    iget-object v1, p0, Lci/j;->j:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v1, Lxb/i;

    .line 167
    .line 168
    iget-object v2, p0, Lci/j;->k:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v2, Li0/g1;

    .line 171
    .line 172
    invoke-direct {p1, v0, v1, v2, p2}, Lci/j;-><init>(ILxb/i;Li0/g1;Lwf/c;)V

    .line 173
    .line 174
    .line 175
    return-object p1

    .line 176
    :pswitch_a
    new-instance p1, Lci/j;

    .line 177
    .line 178
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Ls1/x;

    .line 181
    .line 182
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, Lh0/d1;

    .line 185
    .line 186
    const/16 v2, 0x12

    .line 187
    .line 188
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 189
    .line 190
    .line 191
    return-object p1

    .line 192
    :pswitch_b
    new-instance v0, Lci/j;

    .line 193
    .line 194
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v1, Ltg/e;

    .line 197
    .line 198
    const/16 v2, 0x11

    .line 199
    .line 200
    invoke-direct {v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 201
    .line 202
    .line 203
    iput-object p1, v0, Lci/j;->j:Ljava/lang/Object;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_c
    new-instance v0, Lci/j;

    .line 207
    .line 208
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v1, Lug/g;

    .line 211
    .line 212
    const/16 v2, 0x10

    .line 213
    .line 214
    invoke-direct {v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 215
    .line 216
    .line 217
    iput-object p1, v0, Lci/j;->j:Ljava/lang/Object;

    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_d
    new-instance v0, Lci/j;

    .line 221
    .line 222
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, Lug/g;

    .line 225
    .line 226
    const/16 v2, 0xf

    .line 227
    .line 228
    invoke-direct {v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 229
    .line 230
    .line 231
    iput-object p1, v0, Lci/j;->j:Ljava/lang/Object;

    .line 232
    .line 233
    return-object v0

    .line 234
    :pswitch_e
    new-instance p1, Lci/j;

    .line 235
    .line 236
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v0, Lt/h;

    .line 239
    .line 240
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v1, Lab/e;

    .line 243
    .line 244
    const/16 v2, 0xe

    .line 245
    .line 246
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 247
    .line 248
    .line 249
    return-object p1

    .line 250
    :pswitch_f
    new-instance p1, Lci/j;

    .line 251
    .line 252
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v0, Lqg/r0;

    .line 255
    .line 256
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v1, Lm/t1;

    .line 259
    .line 260
    const/16 v2, 0xd

    .line 261
    .line 262
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 263
    .line 264
    .line 265
    return-object p1

    .line 266
    :pswitch_10
    new-instance p1, Lci/j;

    .line 267
    .line 268
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v0, Lm/a0;

    .line 271
    .line 272
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v1, Lm/h2;

    .line 275
    .line 276
    const/16 v2, 0xc

    .line 277
    .line 278
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 279
    .line 280
    .line 281
    return-object p1

    .line 282
    :pswitch_11
    new-instance v0, Lci/j;

    .line 283
    .line 284
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v1, Lsg/g;

    .line 287
    .line 288
    const/16 v2, 0xb

    .line 289
    .line 290
    invoke-direct {v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 291
    .line 292
    .line 293
    iput-object p1, v0, Lci/j;->j:Ljava/lang/Object;

    .line 294
    .line 295
    return-object v0

    .line 296
    :pswitch_12
    new-instance p1, Lci/j;

    .line 297
    .line 298
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v0, Lm/o1;

    .line 301
    .line 302
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v1, Lfg/p;

    .line 305
    .line 306
    const/16 v2, 0xa

    .line 307
    .line 308
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 309
    .line 310
    .line 311
    return-object p1

    .line 312
    :pswitch_13
    new-instance v0, Lci/j;

    .line 313
    .line 314
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v1, Lm/l1;

    .line 317
    .line 318
    const/16 v2, 0x9

    .line 319
    .line 320
    invoke-direct {v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 321
    .line 322
    .line 323
    iput-object p1, v0, Lci/j;->j:Ljava/lang/Object;

    .line 324
    .line 325
    return-object v0

    .line 326
    :pswitch_14
    new-instance p1, Lci/j;

    .line 327
    .line 328
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v0, Lm/n;

    .line 331
    .line 332
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v1, Lc0/m;

    .line 335
    .line 336
    const/16 v2, 0x8

    .line 337
    .line 338
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 339
    .line 340
    .line 341
    return-object p1

    .line 342
    :pswitch_15
    new-instance p1, Lci/j;

    .line 343
    .line 344
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Ln/k;

    .line 347
    .line 348
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v1, Ln/i;

    .line 351
    .line 352
    const/4 v2, 0x7

    .line 353
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 354
    .line 355
    .line 356
    return-object p1

    .line 357
    :pswitch_16
    new-instance p1, Lci/j;

    .line 358
    .line 359
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, Ln/k;

    .line 362
    .line 363
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v1, Ln/h;

    .line 366
    .line 367
    const/4 v2, 0x6

    .line 368
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 369
    .line 370
    .line 371
    return-object p1

    .line 372
    :pswitch_17
    new-instance p1, Lci/j;

    .line 373
    .line 374
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v0, Landroid/view/textclassifier/TextClassifier;

    .line 377
    .line 378
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v1, Lyf/i;

    .line 381
    .line 382
    invoke-direct {p1, v0, v1, p2}, Lci/j;-><init>(Landroid/view/textclassifier/TextClassifier;Lfg/p;Lwf/c;)V

    .line 383
    .line 384
    .line 385
    return-object p1

    .line 386
    :pswitch_18
    new-instance p1, Lci/j;

    .line 387
    .line 388
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, Lf0/p;

    .line 391
    .line 392
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v1, Lci/e;

    .line 395
    .line 396
    const/4 v2, 0x4

    .line 397
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 398
    .line 399
    .line 400
    return-object p1

    .line 401
    :pswitch_19
    new-instance p1, Lci/j;

    .line 402
    .line 403
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 404
    .line 405
    check-cast v0, Lqg/r0;

    .line 406
    .line 407
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v1, Lf0/j;

    .line 410
    .line 411
    const/4 v2, 0x3

    .line 412
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 413
    .line 414
    .line 415
    return-object p1

    .line 416
    :pswitch_1a
    new-instance p1, Lci/j;

    .line 417
    .line 418
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 419
    .line 420
    check-cast v0, Lf0/c;

    .line 421
    .line 422
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v1, Lf0/n;

    .line 425
    .line 426
    const/4 v2, 0x2

    .line 427
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 428
    .line 429
    .line 430
    return-object p1

    .line 431
    :pswitch_1b
    new-instance p1, Lci/j;

    .line 432
    .line 433
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v0, Le2/c;

    .line 436
    .line 437
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v1, Ljava/lang/Runnable;

    .line 440
    .line 441
    const/4 v2, 0x1

    .line 442
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 443
    .line 444
    .line 445
    return-object p1

    .line 446
    :pswitch_1c
    new-instance p1, Lci/j;

    .line 447
    .line 448
    iget-object v0, p0, Lci/j;->j:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v0, Lci/k;

    .line 451
    .line 452
    iget-object v1, p0, Lci/j;->k:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v1, Lgg/r;

    .line 455
    .line 456
    const/4 v2, 0x0

    .line 457
    invoke-direct {p1, v0, v1, p2, v2}, Lci/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 458
    .line 459
    .line 460
    return-object p1

    .line 461
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lci/j;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lqg/t;

    .line 7
    .line 8
    check-cast p2, Lwf/c;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lci/j;

    .line 15
    .line 16
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :pswitch_0
    check-cast p1, Lqg/t;

    .line 24
    .line 25
    check-cast p2, Lwf/c;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lci/j;

    .line 32
    .line 33
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_1
    check-cast p1, Lqg/t;

    .line 41
    .line 42
    check-cast p2, Lwf/c;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lci/j;

    .line 49
    .line 50
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_2
    check-cast p1, Ly1/s1;

    .line 59
    .line 60
    check-cast p2, Lwf/c;

    .line 61
    .line 62
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lci/j;

    .line 67
    .line 68
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_3
    check-cast p1, Lqg/t;

    .line 77
    .line 78
    check-cast p2, Lwf/c;

    .line 79
    .line 80
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lci/j;

    .line 85
    .line 86
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 87
    .line 88
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :pswitch_4
    check-cast p1, Lqg/t;

    .line 94
    .line 95
    check-cast p2, Lwf/c;

    .line 96
    .line 97
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Lci/j;

    .line 102
    .line 103
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    :pswitch_5
    check-cast p1, Lqg/t;

    .line 111
    .line 112
    check-cast p2, Lwf/c;

    .line 113
    .line 114
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Lci/j;

    .line 119
    .line 120
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    :pswitch_6
    check-cast p1, Lqg/t;

    .line 128
    .line 129
    check-cast p2, Lwf/c;

    .line 130
    .line 131
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Lci/j;

    .line 136
    .line 137
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    return-object p1

    .line 144
    :pswitch_7
    check-cast p1, Lqg/t;

    .line 145
    .line 146
    check-cast p2, Lwf/c;

    .line 147
    .line 148
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    check-cast p1, Lci/j;

    .line 153
    .line 154
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :pswitch_8
    check-cast p1, Lqg/t;

    .line 162
    .line 163
    check-cast p2, Lwf/c;

    .line 164
    .line 165
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Lci/j;

    .line 170
    .line 171
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 172
    .line 173
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    return-object p1

    .line 178
    :pswitch_9
    check-cast p1, Lqg/t;

    .line 179
    .line 180
    check-cast p2, Lwf/c;

    .line 181
    .line 182
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, Lci/j;

    .line 187
    .line 188
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 189
    .line 190
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    return-object p2

    .line 194
    :pswitch_a
    check-cast p1, Lqg/t;

    .line 195
    .line 196
    check-cast p2, Lwf/c;

    .line 197
    .line 198
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    check-cast p1, Lci/j;

    .line 203
    .line 204
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 205
    .line 206
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    return-object p1

    .line 211
    :pswitch_b
    check-cast p2, Lwf/c;

    .line 212
    .line 213
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    check-cast p1, Lci/j;

    .line 218
    .line 219
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 220
    .line 221
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    return-object p1

    .line 226
    :pswitch_c
    check-cast p1, Ltg/e;

    .line 227
    .line 228
    check-cast p2, Lwf/c;

    .line 229
    .line 230
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, Lci/j;

    .line 235
    .line 236
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 237
    .line 238
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    return-object p1

    .line 243
    :pswitch_d
    check-cast p1, Lsg/o;

    .line 244
    .line 245
    check-cast p2, Lwf/c;

    .line 246
    .line 247
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Lci/j;

    .line 252
    .line 253
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 254
    .line 255
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    return-object p1

    .line 260
    :pswitch_e
    check-cast p1, Lqg/t;

    .line 261
    .line 262
    check-cast p2, Lwf/c;

    .line 263
    .line 264
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    check-cast p1, Lci/j;

    .line 269
    .line 270
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 271
    .line 272
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    return-object p1

    .line 277
    :pswitch_f
    check-cast p1, Lqg/t;

    .line 278
    .line 279
    check-cast p2, Lwf/c;

    .line 280
    .line 281
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    check-cast p1, Lci/j;

    .line 286
    .line 287
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 288
    .line 289
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    return-object p1

    .line 294
    :pswitch_10
    check-cast p1, Lqg/t;

    .line 295
    .line 296
    check-cast p2, Lwf/c;

    .line 297
    .line 298
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 299
    .line 300
    .line 301
    move-result-object p1

    .line 302
    check-cast p1, Lci/j;

    .line 303
    .line 304
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 305
    .line 306
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    return-object p1

    .line 311
    :pswitch_11
    check-cast p1, Lqg/t;

    .line 312
    .line 313
    check-cast p2, Lwf/c;

    .line 314
    .line 315
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    check-cast p1, Lci/j;

    .line 320
    .line 321
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 322
    .line 323
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    return-object p1

    .line 328
    :pswitch_12
    check-cast p1, Lqg/t;

    .line 329
    .line 330
    check-cast p2, Lwf/c;

    .line 331
    .line 332
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    check-cast p1, Lci/j;

    .line 337
    .line 338
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 339
    .line 340
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    return-object p1

    .line 345
    :pswitch_13
    check-cast p1, Lqg/t;

    .line 346
    .line 347
    check-cast p2, Lwf/c;

    .line 348
    .line 349
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    check-cast p1, Lci/j;

    .line 354
    .line 355
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 356
    .line 357
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    return-object p1

    .line 362
    :pswitch_14
    check-cast p1, Lqg/t;

    .line 363
    .line 364
    check-cast p2, Lwf/c;

    .line 365
    .line 366
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    check-cast p1, Lci/j;

    .line 371
    .line 372
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 373
    .line 374
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    return-object p1

    .line 379
    :pswitch_15
    check-cast p1, Lqg/t;

    .line 380
    .line 381
    check-cast p2, Lwf/c;

    .line 382
    .line 383
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    check-cast p1, Lci/j;

    .line 388
    .line 389
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 390
    .line 391
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    return-object p1

    .line 396
    :pswitch_16
    check-cast p1, Lqg/t;

    .line 397
    .line 398
    check-cast p2, Lwf/c;

    .line 399
    .line 400
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    check-cast p1, Lci/j;

    .line 405
    .line 406
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 407
    .line 408
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    return-object p1

    .line 413
    :pswitch_17
    check-cast p1, Lqg/t;

    .line 414
    .line 415
    check-cast p2, Lwf/c;

    .line 416
    .line 417
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 418
    .line 419
    .line 420
    move-result-object p1

    .line 421
    check-cast p1, Lci/j;

    .line 422
    .line 423
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 424
    .line 425
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    return-object p1

    .line 430
    :pswitch_18
    check-cast p1, Lqg/t;

    .line 431
    .line 432
    check-cast p2, Lwf/c;

    .line 433
    .line 434
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    check-cast p1, Lci/j;

    .line 439
    .line 440
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 441
    .line 442
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 446
    .line 447
    return-object p1

    .line 448
    :pswitch_19
    check-cast p1, Lqg/t;

    .line 449
    .line 450
    check-cast p2, Lwf/c;

    .line 451
    .line 452
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    check-cast p1, Lci/j;

    .line 457
    .line 458
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 459
    .line 460
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    sget-object p1, Lxf/a;->g:Lxf/a;

    .line 464
    .line 465
    return-object p1

    .line 466
    :pswitch_1a
    check-cast p1, Lqg/t;

    .line 467
    .line 468
    check-cast p2, Lwf/c;

    .line 469
    .line 470
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    check-cast p1, Lci/j;

    .line 475
    .line 476
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 477
    .line 478
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    return-object p1

    .line 483
    :pswitch_1b
    check-cast p1, Lqg/t;

    .line 484
    .line 485
    check-cast p2, Lwf/c;

    .line 486
    .line 487
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    check-cast p1, Lci/j;

    .line 492
    .line 493
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 494
    .line 495
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    return-object p1

    .line 500
    :pswitch_1c
    check-cast p1, Lqg/t;

    .line 501
    .line 502
    check-cast p2, Lwf/c;

    .line 503
    .line 504
    invoke-virtual {p0, p1, p2}, Lci/j;->create(Ljava/lang/Object;Lwf/c;)Lwf/c;

    .line 505
    .line 506
    .line 507
    move-result-object p1

    .line 508
    check-cast p1, Lci/j;

    .line 509
    .line 510
    sget-object p2, Lsf/n;->a:Lsf/n;

    .line 511
    .line 512
    invoke-virtual {p1, p2}, Lci/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    return-object p1

    .line 517
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget v0, v4, Lci/j;->h:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/high16 v2, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x3

    .line 11
    const/4 v7, 0x2

    .line 12
    sget-object v8, Lsf/n;->a:Lsf/n;

    .line 13
    .line 14
    const-string v9, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    const/4 v10, 0x1

    .line 17
    iget-object v11, v4, Lci/j;->k:Ljava/lang/Object;

    .line 18
    .line 19
    sget-object v12, Lxf/a;->g:Lxf/a;

    .line 20
    .line 21
    const/4 v13, 0x0

    .line 22
    packed-switch v0, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    iget v0, v4, Lci/j;->i:I

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    if-ne v0, v10, :cond_0

    .line 30
    .line 31
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lqg/t;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_0
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    move-object v8, v13

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lqg/t;

    .line 50
    .line 51
    :cond_2
    :goto_1
    invoke-static {v0}, Lqg/v;->o(Lqg/t;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_7

    .line 56
    .line 57
    sget-object v1, Ly2/c;->i:Ly2/c;

    .line 58
    .line 59
    iput-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 60
    .line 61
    iput v10, v4, Lci/j;->i:I

    .line 62
    .line 63
    invoke-interface {v4}, Lwf/c;->getContext()Lwf/g;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    sget-object v3, Ly1/r1;->g:Ly1/r1;

    .line 68
    .line 69
    invoke-interface {v2, v3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-nez v2, :cond_6

    .line 74
    .line 75
    invoke-interface {v4}, Lwf/c;->getContext()Lwf/g;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v2}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v2, v1, v4}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-ne v1, v12, :cond_3

    .line 88
    .line 89
    move-object v8, v12

    .line 90
    goto :goto_3

    .line 91
    :cond_3
    :goto_2
    move-object v1, v11

    .line 92
    check-cast v1, Ly2/x;

    .line 93
    .line 94
    iget-object v2, v1, Ly2/x;->I:[I

    .line 95
    .line 96
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_4
    aget v3, v2, v5

    .line 104
    .line 105
    aget v6, v2, v10

    .line 106
    .line 107
    iget-object v7, v1, Ly2/x;->s:Landroid/view/View;

    .line 108
    .line 109
    invoke-virtual {v7, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 110
    .line 111
    .line 112
    aget v7, v2, v5

    .line 113
    .line 114
    if-ne v3, v7, :cond_5

    .line 115
    .line 116
    aget v2, v2, v10

    .line 117
    .line 118
    if-eq v6, v2, :cond_2

    .line 119
    .line 120
    :cond_5
    invoke-virtual {v1}, Ly2/x;->p()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_6
    invoke-static {}, Lah/a;->d()V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_7
    :goto_3
    return-object v8

    .line 129
    :pswitch_0
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 130
    .line 131
    move-object v1, v0

    .line 132
    check-cast v1, Li0/y1;

    .line 133
    .line 134
    check-cast v11, Landroid/view/View;

    .line 135
    .line 136
    iget v0, v4, Lci/j;->i:I

    .line 137
    .line 138
    const v2, 0x7f06002b

    .line 139
    .line 140
    .line 141
    if-eqz v0, :cond_9

    .line 142
    .line 143
    if-ne v0, v10, :cond_8

    .line 144
    .line 145
    :try_start_0
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 146
    .line 147
    .line 148
    goto :goto_5

    .line 149
    :catchall_0
    move-exception v0

    .line 150
    goto :goto_7

    .line 151
    :cond_8
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    move-object v8, v13

    .line 155
    goto :goto_6

    .line 156
    :cond_9
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :try_start_1
    iput v10, v4, Lci/j;->i:I

    .line 160
    .line 161
    iget-object v0, v1, Li0/y1;->u:Ltg/b0;

    .line 162
    .line 163
    new-instance v3, Li0/v1;

    .line 164
    .line 165
    invoke-direct {v3, v7, v13, v5}, Li0/v1;-><init>(ILwf/c;I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v3, v4}, Ltg/s;->f(Ltg/d;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    if-ne v0, v12, :cond_a

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_a
    move-object v0, v8

    .line 176
    :goto_4
    if-ne v0, v12, :cond_b

    .line 177
    .line 178
    move-object v8, v12

    .line 179
    goto :goto_6

    .line 180
    :cond_b
    :goto_5
    invoke-static {v11}, Ly1/v2;->a(Landroid/view/View;)Li0/o;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    if-ne v0, v1, :cond_c

    .line 185
    .line 186
    invoke-virtual {v11, v2, v13}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_c
    :goto_6
    return-object v8

    .line 190
    :goto_7
    invoke-static {v11}, Ly1/v2;->a(Landroid/view/View;)Li0/o;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    if-ne v3, v1, :cond_d

    .line 195
    .line 196
    invoke-virtual {v11, v2, v13}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_d
    throw v0

    .line 200
    :pswitch_1
    iget v0, v4, Lci/j;->i:I

    .line 201
    .line 202
    if-eqz v0, :cond_f

    .line 203
    .line 204
    if-eq v0, v10, :cond_e

    .line 205
    .line 206
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :goto_8
    move-object v12, v13

    .line 210
    goto :goto_a

    .line 211
    :cond_e
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto :goto_9

    .line 215
    :cond_f
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Ltg/z;

    .line 221
    .line 222
    new-instance v1, Lci/i;

    .line 223
    .line 224
    check-cast v11, Ly1/z1;

    .line 225
    .line 226
    invoke-direct {v1, v11, v3}, Lci/i;-><init>(Ljava/lang/Object;I)V

    .line 227
    .line 228
    .line 229
    iput v10, v4, Lci/j;->i:I

    .line 230
    .line 231
    invoke-interface {v0, v1, v4}, Ltg/d;->b(Ltg/e;Lwf/c;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    if-ne v0, v12, :cond_10

    .line 236
    .line 237
    goto :goto_a

    .line 238
    :cond_10
    :goto_9
    invoke-static {}, Lokio/a;->c()V

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :goto_a
    return-object v12

    .line 243
    :pswitch_2
    iget v0, v4, Lci/j;->i:I

    .line 244
    .line 245
    if-eqz v0, :cond_12

    .line 246
    .line 247
    if-eq v0, v10, :cond_11

    .line 248
    .line 249
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :goto_b
    move-object v12, v13

    .line 253
    goto :goto_d

    .line 254
    :cond_11
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Ly1/s1;

    .line 257
    .line 258
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    goto :goto_c

    .line 262
    :cond_12
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, Ly1/s1;

    .line 268
    .line 269
    check-cast v11, Ly1/k0;

    .line 270
    .line 271
    iput-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 272
    .line 273
    iput v10, v4, Lci/j;->i:I

    .line 274
    .line 275
    new-instance v1, Lqg/g;

    .line 276
    .line 277
    invoke-static {v4}, Lfb/v0;->x(Lwf/c;)Lwf/c;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-direct {v1, v10, v2}, Lqg/g;-><init>(ILwf/c;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1}, Lqg/g;->p()V

    .line 285
    .line 286
    .line 287
    iget-object v2, v11, Ly1/k0;->h:Ln2/t;

    .line 288
    .line 289
    iget-object v3, v2, Ln2/t;->a:Ln2/n;

    .line 290
    .line 291
    invoke-interface {v3}, Ln2/n;->b()V

    .line 292
    .line 293
    .line 294
    new-instance v5, Ln2/y;

    .line 295
    .line 296
    invoke-direct {v5, v2, v3}, Ln2/y;-><init>(Ln2/t;Ln2/n;)V

    .line 297
    .line 298
    .line 299
    iget-object v2, v2, Ln2/t;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 300
    .line 301
    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    new-instance v2, Lf1/p;

    .line 305
    .line 306
    const/16 v3, 0x8

    .line 307
    .line 308
    invoke-direct {v2, v0, v3, v11}, Lf1/p;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v2}, Lqg/g;->r(Lfg/l;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1}, Lqg/g;->o()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-ne v0, v12, :cond_13

    .line 319
    .line 320
    goto :goto_d

    .line 321
    :cond_13
    :goto_c
    invoke-static {}, Lokio/a;->c()V

    .line 322
    .line 323
    .line 324
    goto :goto_b

    .line 325
    :goto_d
    return-object v12

    .line 326
    :pswitch_3
    iget v0, v4, Lci/j;->i:I

    .line 327
    .line 328
    if-eqz v0, :cond_15

    .line 329
    .line 330
    if-ne v0, v10, :cond_14

    .line 331
    .line 332
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    goto :goto_e

    .line 336
    :cond_14
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    move-object v8, v13

    .line 340
    goto :goto_e

    .line 341
    :cond_15
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, Lxb/o;

    .line 347
    .line 348
    iget-object v0, v0, Lxb/o;->f:Li/c;

    .line 349
    .line 350
    check-cast v11, Ls1/t;

    .line 351
    .line 352
    iget-wide v1, v11, Ls1/t;->c:J

    .line 353
    .line 354
    new-instance v3, Le1/b;

    .line 355
    .line 356
    invoke-direct {v3, v1, v2}, Le1/b;-><init>(J)V

    .line 357
    .line 358
    .line 359
    iput v10, v4, Lci/j;->i:I

    .line 360
    .line 361
    invoke-virtual {v0, v3, v4}, Li/c;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    if-ne v0, v12, :cond_16

    .line 366
    .line 367
    move-object v8, v12

    .line 368
    :cond_16
    :goto_e
    return-object v8

    .line 369
    :pswitch_4
    check-cast v11, Lxb/i;

    .line 370
    .line 371
    iget-object v0, v11, Lxb/i;->b:Llg/a;

    .line 372
    .line 373
    iget-object v1, v4, Lci/j;->j:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v1, Lqg/t;

    .line 376
    .line 377
    iget v2, v4, Lci/j;->i:I

    .line 378
    .line 379
    if-eqz v2, :cond_19

    .line 380
    .line 381
    if-eq v2, v10, :cond_18

    .line 382
    .line 383
    if-ne v2, v7, :cond_17

    .line 384
    .line 385
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    goto :goto_11

    .line 389
    :cond_17
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    move-object v8, v13

    .line 393
    goto :goto_12

    .line 394
    :cond_18
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    goto :goto_f

    .line 398
    :cond_19
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    iput-object v1, v4, Lci/j;->j:Ljava/lang/Object;

    .line 402
    .line 403
    iput v10, v4, Lci/j;->i:I

    .line 404
    .line 405
    invoke-static {v4}, Lrg/g;->c(Lci/j;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    if-ne v2, v12, :cond_1a

    .line 410
    .line 411
    goto :goto_10

    .line 412
    :cond_1a
    :goto_f
    invoke-virtual {v11}, Lxb/i;->c()F

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    invoke-virtual {v11}, Lxb/i;->b()F

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    cmpg-float v2, v2, v5

    .line 421
    .line 422
    if-nez v2, :cond_1b

    .line 423
    .line 424
    goto :goto_11

    .line 425
    :cond_1b
    iget v2, v0, Llg/a;->b:F

    .line 426
    .line 427
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    iget v0, v0, Llg/a;->a:F

    .line 436
    .line 437
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    sub-float/2addr v2, v0

    .line 446
    const v0, 0x3ccccccd    # 0.025f

    .line 447
    .line 448
    .line 449
    mul-float/2addr v2, v0

    .line 450
    new-instance v0, Lwb/h3;

    .line 451
    .line 452
    invoke-direct {v0, v11, v6}, Lwb/h3;-><init>(Lxb/i;I)V

    .line 453
    .line 454
    .line 455
    invoke-static {v0}, Li0/r;->B(Lfg/a;)Lm/a;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    new-instance v5, Lxb/g;

    .line 460
    .line 461
    invoke-direct {v5, v0, v11, v2}, Lxb/g;-><init>(Lm/a;Lxb/i;F)V

    .line 462
    .line 463
    .line 464
    iput-object v1, v4, Lci/j;->j:Ljava/lang/Object;

    .line 465
    .line 466
    iput v7, v4, Lci/j;->i:I

    .line 467
    .line 468
    invoke-static {v5, v4}, Ltg/s;->g(Lxb/g;Lyf/c;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    if-ne v0, v12, :cond_1c

    .line 473
    .line 474
    :goto_10
    move-object v8, v12

    .line 475
    goto :goto_12

    .line 476
    :cond_1c
    :goto_11
    new-instance v0, Lxb/b;

    .line 477
    .line 478
    invoke-direct {v0, v11, v13, v3}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 479
    .line 480
    .line 481
    invoke-static {v1, v13, v0, v6}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 482
    .line 483
    .line 484
    new-instance v0, Lxb/b;

    .line 485
    .line 486
    const/4 v2, 0x5

    .line 487
    invoke-direct {v0, v11, v13, v2}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 488
    .line 489
    .line 490
    invoke-static {v1, v13, v0, v6}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 491
    .line 492
    .line 493
    new-instance v0, Lxb/b;

    .line 494
    .line 495
    const/4 v2, 0x6

    .line 496
    invoke-direct {v0, v11, v13, v2}, Lxb/b;-><init>(Lxb/i;Lwf/c;I)V

    .line 497
    .line 498
    .line 499
    invoke-static {v1, v13, v0, v6}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 500
    .line 501
    .line 502
    :goto_12
    return-object v8

    .line 503
    :pswitch_5
    iget v0, v4, Lci/j;->i:I

    .line 504
    .line 505
    if-eqz v0, :cond_1e

    .line 506
    .line 507
    if-ne v0, v10, :cond_1d

    .line 508
    .line 509
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    goto :goto_13

    .line 513
    :cond_1d
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    move-object v8, v13

    .line 517
    goto :goto_13

    .line 518
    :cond_1e
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, Lx2/n;

    .line 524
    .line 525
    new-instance v1, Ld1/c0;

    .line 526
    .line 527
    check-cast v11, Le1/c;

    .line 528
    .line 529
    const/16 v2, 0x11

    .line 530
    .line 531
    invoke-direct {v1, v11, v2}, Ld1/c0;-><init>(Ljava/lang/Object;I)V

    .line 532
    .line 533
    .line 534
    iput v10, v4, Lci/j;->i:I

    .line 535
    .line 536
    invoke-static {v0, v1, v4}, Loh/h;->k(Lx1/i;Lfg/a;Lyf/c;)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    if-ne v0, v12, :cond_1f

    .line 541
    .line 542
    move-object v8, v12

    .line 543
    :cond_1f
    :goto_13
    return-object v8

    .line 544
    :pswitch_6
    iget v0, v4, Lci/j;->i:I

    .line 545
    .line 546
    if-eqz v0, :cond_21

    .line 547
    .line 548
    if-ne v0, v10, :cond_20

    .line 549
    .line 550
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    goto :goto_14

    .line 554
    :cond_20
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    move-object v8, v13

    .line 558
    goto :goto_14

    .line 559
    :cond_21
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v0, Lr/z;

    .line 565
    .line 566
    check-cast v11, Ljava/util/List;

    .line 567
    .line 568
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    iput v10, v4, Lci/j;->i:I

    .line 573
    .line 574
    sget-object v2, Lr/z;->y:Lp4/t;

    .line 575
    .line 576
    invoke-virtual {v0, v1, v4}, Lr/z;->f(ILyf/c;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    if-ne v0, v12, :cond_22

    .line 581
    .line 582
    move-object v8, v12

    .line 583
    :cond_22
    :goto_14
    return-object v8

    .line 584
    :pswitch_7
    check-cast v11, Li0/a1;

    .line 585
    .line 586
    iget v0, v4, Lci/j;->i:I

    .line 587
    .line 588
    if-eqz v0, :cond_24

    .line 589
    .line 590
    if-ne v0, v10, :cond_23

    .line 591
    .line 592
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    goto :goto_15

    .line 596
    :cond_23
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    move-object v8, v13

    .line 600
    goto :goto_16

    .line 601
    :cond_24
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 602
    .line 603
    .line 604
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v0, Li0/a1;

    .line 607
    .line 608
    sget-object v1, Lwb/ho;->a:Log/k;

    .line 609
    .line 610
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    check-cast v0, Ljava/lang/Boolean;

    .line 615
    .line 616
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    if-eqz v0, :cond_25

    .line 621
    .line 622
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 623
    .line 624
    invoke-interface {v11, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    goto :goto_16

    .line 628
    :cond_25
    iput v10, v4, Lci/j;->i:I

    .line 629
    .line 630
    const-wide/16 v0, 0x64

    .line 631
    .line 632
    invoke-static {v0, v1, v4}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    if-ne v0, v12, :cond_26

    .line 637
    .line 638
    move-object v8, v12

    .line 639
    goto :goto_16

    .line 640
    :cond_26
    :goto_15
    sget-object v0, Lwb/ho;->a:Log/k;

    .line 641
    .line 642
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 643
    .line 644
    invoke-interface {v11, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    :goto_16
    return-object v8

    .line 648
    :pswitch_8
    iget v0, v4, Lci/j;->i:I

    .line 649
    .line 650
    if-eqz v0, :cond_28

    .line 651
    .line 652
    if-ne v0, v10, :cond_27

    .line 653
    .line 654
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 655
    .line 656
    .line 657
    goto :goto_17

    .line 658
    :cond_27
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    move-object v8, v13

    .line 662
    goto :goto_17

    .line 663
    :cond_28
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v0, Li/c;

    .line 669
    .line 670
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    check-cast v1, Ljava/lang/Number;

    .line 675
    .line 676
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 677
    .line 678
    .line 679
    move-result v1

    .line 680
    check-cast v11, Le1/b;

    .line 681
    .line 682
    iget-wide v2, v11, Le1/b;->a:J

    .line 683
    .line 684
    const/16 v5, 0x20

    .line 685
    .line 686
    shr-long/2addr v2, v5

    .line 687
    long-to-int v2, v2

    .line 688
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 689
    .line 690
    .line 691
    move-result v2

    .line 692
    add-float/2addr v2, v1

    .line 693
    new-instance v1, Ljava/lang/Float;

    .line 694
    .line 695
    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    .line 696
    .line 697
    .line 698
    iput v10, v4, Lci/j;->i:I

    .line 699
    .line 700
    invoke-virtual {v0, v1, v4}, Li/c;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    if-ne v0, v12, :cond_29

    .line 705
    .line 706
    move-object v8, v12

    .line 707
    :cond_29
    :goto_17
    return-object v8

    .line 708
    :pswitch_9
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 709
    .line 710
    check-cast v0, Lxb/i;

    .line 711
    .line 712
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    check-cast v11, Li0/g1;

    .line 716
    .line 717
    sget-object v1, Lwb/o3;->a:Li0/m2;

    .line 718
    .line 719
    invoke-virtual {v11}, Li0/g1;->g()I

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    iget v2, v4, Lci/j;->i:I

    .line 724
    .line 725
    if-ne v1, v2, :cond_2a

    .line 726
    .line 727
    invoke-virtual {v0}, Lxb/i;->b()F

    .line 728
    .line 729
    .line 730
    move-result v1

    .line 731
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 732
    .line 733
    .line 734
    move-result v1

    .line 735
    if-eq v1, v2, :cond_2b

    .line 736
    .line 737
    :cond_2a
    invoke-virtual {v11, v2}, Li0/g1;->h(I)V

    .line 738
    .line 739
    .line 740
    int-to-float v1, v2

    .line 741
    iget-object v2, v0, Lxb/i;->a:Lqg/t;

    .line 742
    .line 743
    new-instance v3, Li/i1;

    .line 744
    .line 745
    invoke-direct {v3, v0, v1, v13}, Li/i1;-><init>(Lxb/i;FLwf/c;)V

    .line 746
    .line 747
    .line 748
    invoke-static {v2, v13, v3, v6}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 749
    .line 750
    .line 751
    :cond_2b
    return-object v8

    .line 752
    :pswitch_a
    iget v0, v4, Lci/j;->i:I

    .line 753
    .line 754
    if-eqz v0, :cond_2d

    .line 755
    .line 756
    if-ne v0, v10, :cond_2c

    .line 757
    .line 758
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 759
    .line 760
    .line 761
    goto :goto_18

    .line 762
    :cond_2c
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    move-object v8, v13

    .line 766
    goto :goto_18

    .line 767
    :cond_2d
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 768
    .line 769
    .line 770
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast v0, Ls1/x;

    .line 773
    .line 774
    check-cast v11, Lh0/d1;

    .line 775
    .line 776
    new-instance v1, Lh0/t0;

    .line 777
    .line 778
    invoke-direct {v1, v11, v7}, Lh0/t0;-><init>(Lh0/d1;I)V

    .line 779
    .line 780
    .line 781
    iput v10, v4, Lci/j;->i:I

    .line 782
    .line 783
    const/4 v2, 0x7

    .line 784
    invoke-static {v0, v13, v1, v4, v2}, Lm/y2;->d(Ls1/x;Lwb/l7;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    if-ne v0, v12, :cond_2e

    .line 789
    .line 790
    move-object v8, v12

    .line 791
    :cond_2e
    :goto_18
    return-object v8

    .line 792
    :pswitch_b
    iget v0, v4, Lci/j;->i:I

    .line 793
    .line 794
    if-eqz v0, :cond_30

    .line 795
    .line 796
    if-ne v0, v10, :cond_2f

    .line 797
    .line 798
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 799
    .line 800
    .line 801
    goto :goto_19

    .line 802
    :cond_2f
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 803
    .line 804
    .line 805
    move-object v8, v13

    .line 806
    goto :goto_19

    .line 807
    :cond_30
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 808
    .line 809
    .line 810
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast v11, Ltg/e;

    .line 813
    .line 814
    iput v10, v4, Lci/j;->i:I

    .line 815
    .line 816
    invoke-interface {v11, v0, v4}, Ltg/e;->e(Ljava/lang/Object;Lwf/c;)Ljava/lang/Object;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    if-ne v0, v12, :cond_31

    .line 821
    .line 822
    move-object v8, v12

    .line 823
    :cond_31
    :goto_19
    return-object v8

    .line 824
    :pswitch_c
    iget v0, v4, Lci/j;->i:I

    .line 825
    .line 826
    if-eqz v0, :cond_33

    .line 827
    .line 828
    if-ne v0, v10, :cond_32

    .line 829
    .line 830
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    goto :goto_1a

    .line 834
    :cond_32
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 835
    .line 836
    .line 837
    move-object v8, v13

    .line 838
    goto :goto_1a

    .line 839
    :cond_33
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 840
    .line 841
    .line 842
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 843
    .line 844
    check-cast v0, Ltg/e;

    .line 845
    .line 846
    check-cast v11, Lug/g;

    .line 847
    .line 848
    iput v10, v4, Lci/j;->i:I

    .line 849
    .line 850
    invoke-virtual {v11, v0, v4}, Lug/g;->a(Ltg/e;Lyf/c;)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    if-ne v0, v12, :cond_34

    .line 855
    .line 856
    move-object v8, v12

    .line 857
    :cond_34
    :goto_1a
    return-object v8

    .line 858
    :pswitch_d
    iget v0, v4, Lci/j;->i:I

    .line 859
    .line 860
    if-eqz v0, :cond_36

    .line 861
    .line 862
    if-ne v0, v10, :cond_35

    .line 863
    .line 864
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 865
    .line 866
    .line 867
    goto :goto_1c

    .line 868
    :cond_35
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    move-object v8, v13

    .line 872
    goto :goto_1c

    .line 873
    :cond_36
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 877
    .line 878
    check-cast v0, Lsg/o;

    .line 879
    .line 880
    check-cast v11, Lug/g;

    .line 881
    .line 882
    iput v10, v4, Lci/j;->i:I

    .line 883
    .line 884
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 885
    .line 886
    .line 887
    new-instance v1, Lug/n;

    .line 888
    .line 889
    invoke-direct {v1, v0}, Lug/n;-><init>(Lsg/o;)V

    .line 890
    .line 891
    .line 892
    move-object v0, v4

    .line 893
    check-cast v0, Lyf/c;

    .line 894
    .line 895
    invoke-virtual {v11, v1, v0}, Lug/g;->a(Ltg/e;Lyf/c;)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    if-ne v0, v12, :cond_37

    .line 900
    .line 901
    goto :goto_1b

    .line 902
    :cond_37
    move-object v0, v8

    .line 903
    :goto_1b
    if-ne v0, v12, :cond_38

    .line 904
    .line 905
    move-object v8, v12

    .line 906
    :cond_38
    :goto_1c
    return-object v8

    .line 907
    :pswitch_e
    iget v0, v4, Lci/j;->i:I

    .line 908
    .line 909
    if-eqz v0, :cond_3a

    .line 910
    .line 911
    if-ne v0, v10, :cond_39

    .line 912
    .line 913
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 914
    .line 915
    .line 916
    goto :goto_1d

    .line 917
    :cond_39
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    move-object v8, v13

    .line 921
    goto :goto_1d

    .line 922
    :cond_3a
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 926
    .line 927
    check-cast v0, Lt/h;

    .line 928
    .line 929
    check-cast v11, Lab/e;

    .line 930
    .line 931
    iput v10, v4, Lci/j;->i:I

    .line 932
    .line 933
    invoke-static {v0, v11, v4}, Loh/h;->k(Lx1/i;Lfg/a;Lyf/c;)Ljava/lang/Object;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    if-ne v0, v12, :cond_3b

    .line 938
    .line 939
    move-object v8, v12

    .line 940
    :cond_3b
    :goto_1d
    return-object v8

    .line 941
    :pswitch_f
    iget v0, v4, Lci/j;->i:I

    .line 942
    .line 943
    if-eqz v0, :cond_3e

    .line 944
    .line 945
    if-eq v0, v10, :cond_3d

    .line 946
    .line 947
    if-ne v0, v7, :cond_3c

    .line 948
    .line 949
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 950
    .line 951
    .line 952
    goto :goto_20

    .line 953
    :cond_3c
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    move-object v8, v13

    .line 957
    goto :goto_20

    .line 958
    :cond_3d
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    goto :goto_1e

    .line 962
    :cond_3e
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v0, Lqg/r0;

    .line 968
    .line 969
    iput v10, v4, Lci/j;->i:I

    .line 970
    .line 971
    invoke-interface {v0, v4}, Lqg/r0;->g(Lyf/c;)Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v0

    .line 975
    if-ne v0, v12, :cond_3f

    .line 976
    .line 977
    goto :goto_1f

    .line 978
    :cond_3f
    :goto_1e
    check-cast v11, Lm/t1;

    .line 979
    .line 980
    iput v7, v4, Lci/j;->i:I

    .line 981
    .line 982
    invoke-virtual {v11, v4}, Lm/t1;->j(Lyf/c;)Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    if-ne v0, v12, :cond_40

    .line 987
    .line 988
    :goto_1f
    move-object v8, v12

    .line 989
    :cond_40
    :goto_20
    return-object v8

    .line 990
    :pswitch_10
    iget v0, v4, Lci/j;->i:I

    .line 991
    .line 992
    if-eqz v0, :cond_42

    .line 993
    .line 994
    if-ne v0, v10, :cond_41

    .line 995
    .line 996
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 997
    .line 998
    .line 999
    goto :goto_21

    .line 1000
    :cond_41
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    move-object v8, v13

    .line 1004
    goto :goto_21

    .line 1005
    :cond_42
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1006
    .line 1007
    .line 1008
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1009
    .line 1010
    check-cast v0, Lm/a0;

    .line 1011
    .line 1012
    iget-boolean v1, v0, Lm/a0;->b:Z

    .line 1013
    .line 1014
    if-eqz v1, :cond_43

    .line 1015
    .line 1016
    const/high16 v2, -0x40800000    # -1.0f

    .line 1017
    .line 1018
    :cond_43
    check-cast v11, Lm/h2;

    .line 1019
    .line 1020
    iget-object v1, v11, Lm/h2;->T:Lm/o2;

    .line 1021
    .line 1022
    iget-wide v6, v0, Lm/a0;->a:J

    .line 1023
    .line 1024
    invoke-static {v6, v7, v2}, Lu2/q;->f(JF)J

    .line 1025
    .line 1026
    .line 1027
    move-result-wide v2

    .line 1028
    iput v10, v4, Lci/j;->i:I

    .line 1029
    .line 1030
    invoke-virtual {v1, v2, v3, v5, v4}, Lm/o2;->b(JZLyf/i;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    if-ne v0, v12, :cond_44

    .line 1035
    .line 1036
    move-object v8, v12

    .line 1037
    :cond_44
    :goto_21
    return-object v8

    .line 1038
    :pswitch_11
    iget v0, v4, Lci/j;->i:I

    .line 1039
    .line 1040
    if-eqz v0, :cond_46

    .line 1041
    .line 1042
    if-ne v0, v10, :cond_45

    .line 1043
    .line 1044
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1045
    .line 1046
    move-object v1, v0

    .line 1047
    check-cast v1, Lqg/r0;

    .line 1048
    .line 1049
    :try_start_2
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1050
    .line 1051
    .line 1052
    move-object/from16 v0, p1

    .line 1053
    .line 1054
    goto :goto_22

    .line 1055
    :catchall_1
    move-exception v0

    .line 1056
    goto :goto_24

    .line 1057
    :cond_45
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1058
    .line 1059
    .line 1060
    move-object v12, v13

    .line 1061
    goto :goto_23

    .line 1062
    :cond_46
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1063
    .line 1064
    .line 1065
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v0, Lqg/t;

    .line 1068
    .line 1069
    new-instance v1, Lci/c;

    .line 1070
    .line 1071
    invoke-direct {v1, v7, v13}, Lci/c;-><init>(ILwf/c;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-static {v0, v13, v1, v6}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v1

    .line 1078
    :try_start_3
    check-cast v11, Lsg/g;

    .line 1079
    .line 1080
    iput-object v1, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1081
    .line 1082
    iput v10, v4, Lci/j;->i:I

    .line 1083
    .line 1084
    invoke-interface {v11, v4}, Lsg/g;->f(Lwf/c;)Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1088
    if-ne v0, v12, :cond_47

    .line 1089
    .line 1090
    goto :goto_23

    .line 1091
    :cond_47
    :goto_22
    invoke-interface {v1, v13}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 1092
    .line 1093
    .line 1094
    move-object v12, v0

    .line 1095
    :goto_23
    return-object v12

    .line 1096
    :goto_24
    invoke-interface {v1, v13}, Lqg/r0;->a(Ljava/util/concurrent/CancellationException;)V

    .line 1097
    .line 1098
    .line 1099
    throw v0

    .line 1100
    :pswitch_12
    iget v0, v4, Lci/j;->i:I

    .line 1101
    .line 1102
    if-eqz v0, :cond_49

    .line 1103
    .line 1104
    if-ne v0, v10, :cond_48

    .line 1105
    .line 1106
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1107
    .line 1108
    .line 1109
    goto :goto_25

    .line 1110
    :cond_48
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    move-object v8, v13

    .line 1114
    goto :goto_25

    .line 1115
    :cond_49
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1116
    .line 1117
    .line 1118
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v0, Lm/o1;

    .line 1121
    .line 1122
    iget-object v0, v0, Lm/o1;->a:Lm/o2;

    .line 1123
    .line 1124
    check-cast v11, Lfg/p;

    .line 1125
    .line 1126
    iput v10, v4, Lci/j;->i:I

    .line 1127
    .line 1128
    sget-object v1, Lk/d1;->h:Lk/d1;

    .line 1129
    .line 1130
    invoke-virtual {v0, v1, v11, v4}, Lm/o2;->f(Lk/d1;Lfg/p;Lyf/c;)Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    if-ne v0, v12, :cond_4a

    .line 1135
    .line 1136
    move-object v8, v12

    .line 1137
    :cond_4a
    :goto_25
    return-object v8

    .line 1138
    :pswitch_13
    move-object v1, v11

    .line 1139
    check-cast v1, Lm/l1;

    .line 1140
    .line 1141
    iget v0, v4, Lci/j;->i:I

    .line 1142
    .line 1143
    if-eqz v0, :cond_4d

    .line 1144
    .line 1145
    if-eq v0, v10, :cond_4c

    .line 1146
    .line 1147
    if-ne v0, v7, :cond_4b

    .line 1148
    .line 1149
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1150
    .line 1151
    check-cast v0, Lqg/t;

    .line 1152
    .line 1153
    :try_start_4
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 1154
    .line 1155
    .line 1156
    goto :goto_26

    .line 1157
    :catchall_2
    move-exception v0

    .line 1158
    goto :goto_2a

    .line 1159
    :cond_4b
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1160
    .line 1161
    .line 1162
    move-object v8, v13

    .line 1163
    goto :goto_29

    .line 1164
    :cond_4c
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1165
    .line 1166
    check-cast v0, Lqg/t;

    .line 1167
    .line 1168
    :try_start_5
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 1169
    .line 1170
    .line 1171
    move-object/from16 v2, p1

    .line 1172
    .line 1173
    goto :goto_27

    .line 1174
    :cond_4d
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1175
    .line 1176
    .line 1177
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1178
    .line 1179
    check-cast v0, Lqg/t;

    .line 1180
    .line 1181
    :cond_4e
    :goto_26
    :try_start_6
    invoke-interface {v0}, Lqg/t;->n()Lwf/g;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v2

    .line 1185
    invoke-static {v2}, Lqg/v;->p(Lwf/g;)Z

    .line 1186
    .line 1187
    .line 1188
    move-result v2

    .line 1189
    if-eqz v2, :cond_50

    .line 1190
    .line 1191
    iget-object v2, v1, Lm/l1;->g:Lsg/c;

    .line 1192
    .line 1193
    iput-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1194
    .line 1195
    iput v10, v4, Lci/j;->i:I

    .line 1196
    .line 1197
    invoke-virtual {v2, v4}, Lsg/c;->f(Lwf/c;)Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v2

    .line 1201
    if-ne v2, v12, :cond_4f

    .line 1202
    .line 1203
    goto :goto_28

    .line 1204
    :cond_4f
    :goto_27
    move-object v3, v2

    .line 1205
    check-cast v3, Lm/h1;

    .line 1206
    .line 1207
    iget-object v2, v1, Lm/o1;->c:Lu2/c;

    .line 1208
    .line 1209
    sget v5, Lm/m1;->a:F

    .line 1210
    .line 1211
    invoke-interface {v2, v5}, Lu2/c;->x0(F)F

    .line 1212
    .line 1213
    .line 1214
    move-result v2

    .line 1215
    iget-object v5, v1, Lm/o1;->c:Lu2/c;

    .line 1216
    .line 1217
    sget v6, Lm/m1;->b:F

    .line 1218
    .line 1219
    invoke-interface {v5, v6}, Lu2/c;->x0(F)F

    .line 1220
    .line 1221
    .line 1222
    move-result v5

    .line 1223
    move v6, v2

    .line 1224
    iget-object v2, v1, Lm/o1;->a:Lm/o2;

    .line 1225
    .line 1226
    iput-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1227
    .line 1228
    iput v7, v4, Lci/j;->i:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1229
    .line 1230
    move/from16 v19, v6

    .line 1231
    .line 1232
    move-object v6, v4

    .line 1233
    move/from16 v4, v19

    .line 1234
    .line 1235
    :try_start_7
    invoke-static/range {v1 .. v6}, Lm/l1;->c(Lm/l1;Lm/o2;Lm/h1;FFLyf/c;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1239
    move-object v4, v6

    .line 1240
    if-ne v2, v12, :cond_4e

    .line 1241
    .line 1242
    :goto_28
    move-object v8, v12

    .line 1243
    goto :goto_29

    .line 1244
    :catchall_3
    move-exception v0

    .line 1245
    move-object v4, v6

    .line 1246
    goto :goto_2a

    .line 1247
    :cond_50
    iput-object v13, v1, Lm/l1;->h:Lqg/e1;

    .line 1248
    .line 1249
    :goto_29
    return-object v8

    .line 1250
    :goto_2a
    iput-object v13, v1, Lm/l1;->h:Lqg/e1;

    .line 1251
    .line 1252
    throw v0

    .line 1253
    :pswitch_14
    iget v0, v4, Lci/j;->i:I

    .line 1254
    .line 1255
    if-eqz v0, :cond_52

    .line 1256
    .line 1257
    if-ne v0, v10, :cond_51

    .line 1258
    .line 1259
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1260
    .line 1261
    .line 1262
    goto :goto_2b

    .line 1263
    :cond_51
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    move-object v8, v13

    .line 1267
    goto :goto_2b

    .line 1268
    :cond_52
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1269
    .line 1270
    .line 1271
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1272
    .line 1273
    check-cast v0, Lm/n;

    .line 1274
    .line 1275
    iget-object v15, v0, Lm/n;->c:Lk/h1;

    .line 1276
    .line 1277
    iget-object v0, v0, Lm/n;->b:Lm/m;

    .line 1278
    .line 1279
    move-object/from16 v16, v11

    .line 1280
    .line 1281
    check-cast v16, Lc0/m;

    .line 1282
    .line 1283
    iput v10, v4, Lci/j;->i:I

    .line 1284
    .line 1285
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1286
    .line 1287
    .line 1288
    new-instance v13, Lk/g1;

    .line 1289
    .line 1290
    const/16 v18, 0x0

    .line 1291
    .line 1292
    sget-object v14, Lk/d1;->h:Lk/d1;

    .line 1293
    .line 1294
    move-object/from16 v17, v0

    .line 1295
    .line 1296
    invoke-direct/range {v13 .. v18}, Lk/g1;-><init>(Lk/d1;Lk/h1;Lfg/p;Ljava/lang/Object;Lwf/c;)V

    .line 1297
    .line 1298
    .line 1299
    invoke-static {v13, v4}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    if-ne v0, v12, :cond_53

    .line 1304
    .line 1305
    move-object v8, v12

    .line 1306
    :cond_53
    :goto_2b
    return-object v8

    .line 1307
    :pswitch_15
    iget v0, v4, Lci/j;->i:I

    .line 1308
    .line 1309
    if-eqz v0, :cond_55

    .line 1310
    .line 1311
    if-ne v0, v10, :cond_54

    .line 1312
    .line 1313
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1314
    .line 1315
    .line 1316
    goto :goto_2c

    .line 1317
    :cond_54
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    move-object v8, v13

    .line 1321
    goto :goto_2c

    .line 1322
    :cond_55
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1323
    .line 1324
    .line 1325
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1326
    .line 1327
    check-cast v0, Ln/k;

    .line 1328
    .line 1329
    check-cast v11, Ln/i;

    .line 1330
    .line 1331
    iput v10, v4, Lci/j;->i:I

    .line 1332
    .line 1333
    invoke-virtual {v0, v11, v4}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    if-ne v0, v12, :cond_56

    .line 1338
    .line 1339
    move-object v8, v12

    .line 1340
    :cond_56
    :goto_2c
    return-object v8

    .line 1341
    :pswitch_16
    iget v0, v4, Lci/j;->i:I

    .line 1342
    .line 1343
    if-eqz v0, :cond_58

    .line 1344
    .line 1345
    if-ne v0, v10, :cond_57

    .line 1346
    .line 1347
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1348
    .line 1349
    .line 1350
    goto :goto_2d

    .line 1351
    :cond_57
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1352
    .line 1353
    .line 1354
    move-object v8, v13

    .line 1355
    goto :goto_2d

    .line 1356
    :cond_58
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1357
    .line 1358
    .line 1359
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1360
    .line 1361
    check-cast v0, Ln/k;

    .line 1362
    .line 1363
    check-cast v11, Ln/h;

    .line 1364
    .line 1365
    iput v10, v4, Lci/j;->i:I

    .line 1366
    .line 1367
    invoke-virtual {v0, v11, v4}, Ln/k;->a(Ln/j;Lwf/c;)Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    if-ne v0, v12, :cond_59

    .line 1372
    .line 1373
    move-object v8, v12

    .line 1374
    :cond_59
    :goto_2d
    return-object v8

    .line 1375
    :pswitch_17
    iget v0, v4, Lci/j;->i:I

    .line 1376
    .line 1377
    if-eqz v0, :cond_5b

    .line 1378
    .line 1379
    if-ne v0, v10, :cond_5a

    .line 1380
    .line 1381
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1382
    .line 1383
    .line 1384
    move-object/from16 v13, p1

    .line 1385
    .line 1386
    goto :goto_2e

    .line 1387
    :cond_5a
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1388
    .line 1389
    .line 1390
    goto :goto_2e

    .line 1391
    :cond_5b
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1392
    .line 1393
    .line 1394
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1395
    .line 1396
    check-cast v0, Landroid/view/textclassifier/TextClassifier;

    .line 1397
    .line 1398
    if-eqz v0, :cond_5d

    .line 1399
    .line 1400
    check-cast v11, Lyf/i;

    .line 1401
    .line 1402
    iput v10, v4, Lci/j;->i:I

    .line 1403
    .line 1404
    invoke-interface {v11, v0, v4}, Lfg/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    if-ne v0, v12, :cond_5c

    .line 1409
    .line 1410
    move-object v13, v12

    .line 1411
    goto :goto_2e

    .line 1412
    :cond_5c
    move-object v13, v0

    .line 1413
    :cond_5d
    :goto_2e
    return-object v13

    .line 1414
    :pswitch_18
    iget v0, v4, Lci/j;->i:I

    .line 1415
    .line 1416
    if-eqz v0, :cond_5f

    .line 1417
    .line 1418
    if-eq v0, v10, :cond_5e

    .line 1419
    .line 1420
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1421
    .line 1422
    .line 1423
    :goto_2f
    move-object v12, v13

    .line 1424
    goto :goto_30

    .line 1425
    :cond_5e
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    invoke-static {}, Lokio/a;->c()V

    .line 1429
    .line 1430
    .line 1431
    goto :goto_2f

    .line 1432
    :cond_5f
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1433
    .line 1434
    .line 1435
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1436
    .line 1437
    check-cast v0, Lf0/p;

    .line 1438
    .line 1439
    check-cast v11, Lci/e;

    .line 1440
    .line 1441
    iput v10, v4, Lci/j;->i:I

    .line 1442
    .line 1443
    invoke-static {v0, v11, v4}, Ly1/d2;->a(Lf0/p;Lci/e;Lyf/c;)V

    .line 1444
    .line 1445
    .line 1446
    :goto_30
    return-object v12

    .line 1447
    :pswitch_19
    check-cast v11, Lf0/j;

    .line 1448
    .line 1449
    iget v0, v4, Lci/j;->i:I

    .line 1450
    .line 1451
    const-wide/16 v14, 0x1f4

    .line 1452
    .line 1453
    if-eqz v0, :cond_64

    .line 1454
    .line 1455
    if-eq v0, v10, :cond_63

    .line 1456
    .line 1457
    if-eq v0, v7, :cond_62

    .line 1458
    .line 1459
    if-eq v0, v6, :cond_61

    .line 1460
    .line 1461
    if-ne v0, v3, :cond_60

    .line 1462
    .line 1463
    :try_start_8
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1464
    .line 1465
    .line 1466
    goto :goto_35

    .line 1467
    :catchall_4
    move-exception v0

    .line 1468
    goto :goto_36

    .line 1469
    :cond_60
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1470
    .line 1471
    .line 1472
    move-object v12, v13

    .line 1473
    goto :goto_34

    .line 1474
    :cond_61
    :try_start_9
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1475
    .line 1476
    .line 1477
    goto :goto_33

    .line 1478
    :cond_62
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1479
    .line 1480
    .line 1481
    new-instance v0, Laf/d;

    .line 1482
    .line 1483
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 1484
    .line 1485
    .line 1486
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1487
    :cond_63
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1488
    .line 1489
    .line 1490
    goto :goto_31

    .line 1491
    :cond_64
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1492
    .line 1493
    .line 1494
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1495
    .line 1496
    check-cast v0, Lqg/r0;

    .line 1497
    .line 1498
    if-eqz v0, :cond_65

    .line 1499
    .line 1500
    iput v10, v4, Lci/j;->i:I

    .line 1501
    .line 1502
    invoke-static {v0, v4}, Lqg/v;->d(Lqg/r0;Lyf/i;)Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v0

    .line 1506
    if-ne v0, v12, :cond_65

    .line 1507
    .line 1508
    goto :goto_34

    .line 1509
    :cond_65
    :goto_31
    :try_start_a
    iget-object v0, v11, Lf0/j;->c:Li0/f1;

    .line 1510
    .line 1511
    invoke-virtual {v0, v2}, Li0/f1;->h(F)V

    .line 1512
    .line 1513
    .line 1514
    iget-boolean v0, v11, Lf0/j;->a:Z

    .line 1515
    .line 1516
    if-nez v0, :cond_66

    .line 1517
    .line 1518
    iput v7, v4, Lci/j;->i:I

    .line 1519
    .line 1520
    invoke-static {v4}, Lqg/v;->b(Lyf/c;)V

    .line 1521
    .line 1522
    .line 1523
    goto :goto_34

    .line 1524
    :cond_66
    :goto_32
    iput v6, v4, Lci/j;->i:I

    .line 1525
    .line 1526
    invoke-static {v14, v15, v4}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v0

    .line 1530
    if-ne v0, v12, :cond_67

    .line 1531
    .line 1532
    goto :goto_34

    .line 1533
    :cond_67
    :goto_33
    iget-object v0, v11, Lf0/j;->c:Li0/f1;

    .line 1534
    .line 1535
    invoke-virtual {v0, v1}, Li0/f1;->h(F)V

    .line 1536
    .line 1537
    .line 1538
    iput v3, v4, Lci/j;->i:I

    .line 1539
    .line 1540
    invoke-static {v14, v15, v4}, Lqg/v;->f(JLwf/c;)Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    if-ne v0, v12, :cond_68

    .line 1545
    .line 1546
    :goto_34
    return-object v12

    .line 1547
    :cond_68
    :goto_35
    iget-object v0, v11, Lf0/j;->c:Li0/f1;

    .line 1548
    .line 1549
    invoke-virtual {v0, v2}, Li0/f1;->h(F)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 1550
    .line 1551
    .line 1552
    goto :goto_32

    .line 1553
    :goto_36
    iget-object v2, v11, Lf0/j;->c:Li0/f1;

    .line 1554
    .line 1555
    invoke-virtual {v2, v1}, Li0/f1;->h(F)V

    .line 1556
    .line 1557
    .line 1558
    throw v0

    .line 1559
    :pswitch_1a
    iget v0, v4, Lci/j;->i:I

    .line 1560
    .line 1561
    if-eqz v0, :cond_6b

    .line 1562
    .line 1563
    if-eq v0, v10, :cond_6a

    .line 1564
    .line 1565
    if-eq v0, v7, :cond_69

    .line 1566
    .line 1567
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1568
    .line 1569
    .line 1570
    :goto_37
    move-object v8, v13

    .line 1571
    goto :goto_3a

    .line 1572
    :cond_69
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1573
    .line 1574
    .line 1575
    invoke-static {}, Lokio/a;->c()V

    .line 1576
    .line 1577
    .line 1578
    goto :goto_37

    .line 1579
    :cond_6a
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1580
    .line 1581
    .line 1582
    goto :goto_39

    .line 1583
    :cond_6b
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1584
    .line 1585
    .line 1586
    new-instance v0, Li2/z;

    .line 1587
    .line 1588
    const/16 v1, 0xf

    .line 1589
    .line 1590
    invoke-direct {v0, v1}, Li2/z;-><init>(I)V

    .line 1591
    .line 1592
    .line 1593
    iput v10, v4, Lci/j;->i:I

    .line 1594
    .line 1595
    invoke-virtual {v4}, Lyf/c;->getContext()Lwf/g;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    invoke-static {v1}, Li0/r;->s(Lwf/g;)Li0/d;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v1

    .line 1603
    new-instance v2, Li0/t0;

    .line 1604
    .line 1605
    invoke-direct {v2, v0, v5}, Li0/t0;-><init>(Lfg/l;I)V

    .line 1606
    .line 1607
    .line 1608
    invoke-virtual {v1, v2, v4}, Li0/d;->d(Lfg/l;Lwf/c;)Ljava/lang/Object;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v0

    .line 1612
    if-ne v0, v12, :cond_6c

    .line 1613
    .line 1614
    :goto_38
    move-object v8, v12

    .line 1615
    goto :goto_3a

    .line 1616
    :cond_6c
    :goto_39
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast v0, Lf0/c;

    .line 1619
    .line 1620
    invoke-virtual {v0}, Lf0/c;->i()Ltg/n;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v0

    .line 1624
    if-eqz v0, :cond_6d

    .line 1625
    .line 1626
    new-instance v1, Lci/i;

    .line 1627
    .line 1628
    check-cast v11, Lf0/n;

    .line 1629
    .line 1630
    invoke-direct {v1, v11, v7}, Lci/i;-><init>(Ljava/lang/Object;I)V

    .line 1631
    .line 1632
    .line 1633
    iput v7, v4, Lci/j;->i:I

    .line 1634
    .line 1635
    check-cast v0, Ltg/r;

    .line 1636
    .line 1637
    invoke-static {v0, v1, v4}, Ltg/r;->j(Ltg/r;Ltg/e;Lwf/c;)V

    .line 1638
    .line 1639
    .line 1640
    goto :goto_38

    .line 1641
    :cond_6d
    :goto_3a
    return-object v8

    .line 1642
    :pswitch_1b
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1643
    .line 1644
    check-cast v0, Le2/c;

    .line 1645
    .line 1646
    iget v2, v4, Lci/j;->i:I

    .line 1647
    .line 1648
    if-eqz v2, :cond_6f

    .line 1649
    .line 1650
    if-ne v2, v10, :cond_6e

    .line 1651
    .line 1652
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1653
    .line 1654
    .line 1655
    goto :goto_3c

    .line 1656
    :cond_6e
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1657
    .line 1658
    .line 1659
    move-object v8, v13

    .line 1660
    goto :goto_3d

    .line 1661
    :cond_6f
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1662
    .line 1663
    .line 1664
    iget-object v2, v0, Le2/c;->f:Le2/g;

    .line 1665
    .line 1666
    iput v10, v4, Lci/j;->i:I

    .line 1667
    .line 1668
    iget v3, v2, Le2/g;->b:F

    .line 1669
    .line 1670
    sub-float/2addr v1, v3

    .line 1671
    invoke-virtual {v2, v1, v4}, Le2/g;->b(FLyf/c;)Ljava/lang/Object;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v1

    .line 1675
    if-ne v1, v12, :cond_70

    .line 1676
    .line 1677
    goto :goto_3b

    .line 1678
    :cond_70
    move-object v1, v8

    .line 1679
    :goto_3b
    if-ne v1, v12, :cond_71

    .line 1680
    .line 1681
    move-object v8, v12

    .line 1682
    goto :goto_3d

    .line 1683
    :cond_71
    :goto_3c
    iget-object v0, v0, Le2/c;->c:Landroidx/lifecycle/x;

    .line 1684
    .line 1685
    iget-object v0, v0, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 1686
    .line 1687
    check-cast v0, Li0/j1;

    .line 1688
    .line 1689
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1690
    .line 1691
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 1692
    .line 1693
    .line 1694
    check-cast v11, Ljava/lang/Runnable;

    .line 1695
    .line 1696
    invoke-interface {v11}, Ljava/lang/Runnable;->run()V

    .line 1697
    .line 1698
    .line 1699
    :goto_3d
    return-object v8

    .line 1700
    :pswitch_1c
    iget v0, v4, Lci/j;->i:I

    .line 1701
    .line 1702
    if-eqz v0, :cond_73

    .line 1703
    .line 1704
    if-ne v0, v10, :cond_72

    .line 1705
    .line 1706
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1707
    .line 1708
    .line 1709
    goto :goto_3e

    .line 1710
    :cond_72
    invoke-static {v9}, Lj8/o;->A(Ljava/lang/String;)V

    .line 1711
    .line 1712
    .line 1713
    move-object v8, v13

    .line 1714
    goto :goto_3e

    .line 1715
    :cond_73
    invoke-static/range {p1 .. p1}, Lf8/i;->I0(Ljava/lang/Object;)V

    .line 1716
    .line 1717
    .line 1718
    iget-object v0, v4, Lci/j;->j:Ljava/lang/Object;

    .line 1719
    .line 1720
    check-cast v0, Lci/k;

    .line 1721
    .line 1722
    iget-object v0, v0, Lci/k;->A:Li/c;

    .line 1723
    .line 1724
    check-cast v11, Lgg/r;

    .line 1725
    .line 1726
    iget v1, v11, Lgg/r;->g:F

    .line 1727
    .line 1728
    new-instance v2, Ljava/lang/Float;

    .line 1729
    .line 1730
    invoke-direct {v2, v1}, Ljava/lang/Float;-><init>(F)V

    .line 1731
    .line 1732
    .line 1733
    const/16 v1, 0x78

    .line 1734
    .line 1735
    sget-object v3, Li/x;->b:Lg1/d;

    .line 1736
    .line 1737
    invoke-static {v1, v7, v3}, Li/d;->p(IILi/v;)Li/l1;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v1

    .line 1741
    iput v10, v4, Lci/j;->i:I

    .line 1742
    .line 1743
    const/4 v3, 0x0

    .line 1744
    const/16 v5, 0xc

    .line 1745
    .line 1746
    move-object/from16 v19, v2

    .line 1747
    .line 1748
    move-object v2, v1

    .line 1749
    move-object/from16 v1, v19

    .line 1750
    .line 1751
    invoke-static/range {v0 .. v5}, Li/c;->c(Li/c;Ljava/lang/Object;Li/k;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v0

    .line 1755
    if-ne v0, v12, :cond_74

    .line 1756
    .line 1757
    move-object v8, v12

    .line 1758
    :cond_74
    :goto_3e
    return-object v8

    .line 1759
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
