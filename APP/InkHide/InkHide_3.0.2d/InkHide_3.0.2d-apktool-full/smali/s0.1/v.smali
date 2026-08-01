.class public final synthetic Ls0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ls0/J;


# direct methods
.method public synthetic constructor <init>(Ls0/J;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/v;->b:I

    iput-object p1, p0, Ls0/v;->c:Ls0/J;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 1
    iget p1, p0, Ls0/v;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls0/v;->c:Ls0/J;

    .line 7
    .line 8
    invoke-virtual {p1}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Li/t;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Li/t;-><init>(Landroid/app/Activity;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v0, Li/t;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, Lt0/e;

    .line 23
    .line 24
    invoke-virtual {p1}, Lt0/c;->g()V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :pswitch_0
    new-instance v0, Ls0/G;

    .line 29
    .line 30
    new-instance v3, Ls0/z;

    .line 31
    .line 32
    iget-object p1, p0, Ls0/v;->c:Ls0/J;

    .line 33
    .line 34
    const/16 v1, 0x12

    .line 35
    .line 36
    invoke-direct {v3, p1, v1}, Ls0/z;-><init>(Ls0/J;I)V

    .line 37
    .line 38
    .line 39
    new-instance v5, Ls0/z;

    .line 40
    .line 41
    const/16 v1, 0x13

    .line 42
    .line 43
    invoke-direct {v5, p1, v1}, Ls0/z;-><init>(Ls0/J;I)V

    .line 44
    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    const-string v1, "\u4e3b\u9875\u641c\u7d22\u9690\u85cf"

    .line 48
    .line 49
    const-string v2, "\u9690\u85cf\u5bc6\u53cb\u5728\u5fae\u4fe1\u4e3b\u9875\u641c\u7d22\u4e2d\u7684\u7ed3\u679c"

    .line 50
    .line 51
    invoke-direct/range {v0 .. v5}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Ls0/G;

    .line 55
    .line 56
    new-instance v4, Ls0/z;

    .line 57
    .line 58
    const/16 v2, 0x14

    .line 59
    .line 60
    invoke-direct {v4, p1, v2}, Ls0/z;-><init>(Ls0/J;I)V

    .line 61
    .line 62
    .line 63
    new-instance v6, Ls0/z;

    .line 64
    .line 65
    const/16 v2, 0x15

    .line 66
    .line 67
    invoke-direct {v6, p1, v2}, Ls0/z;-><init>(Ls0/J;I)V

    .line 68
    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    const-string v2, "\u5355\u804a\u641c\u7d22\u9690\u85cf"

    .line 72
    .line 73
    const-string v3, "\u9690\u85cf\u5bc6\u53cb\u5728\u804a\u5929\u9875\u641c\u7d22\u4e2d\u7684\u8bb0\u5f55"

    .line 74
    .line 75
    invoke-direct/range {v1 .. v6}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 76
    .line 77
    .line 78
    filled-new-array {v0, v1}, [Ls0/G;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v1, "\u641c\u7d22\u9690\u85cf"

    .line 87
    .line 88
    invoke-virtual {p1, v1, v0}, Ls0/J;->O(Ljava/lang/String;Ljava/util/List;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_1
    new-instance v2, Ls0/G;

    .line 93
    .line 94
    new-instance v5, Ls0/x;

    .line 95
    .line 96
    iget-object p1, p0, Ls0/v;->c:Ls0/J;

    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-direct {v5, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 100
    .line 101
    .line 102
    new-instance v7, Ls0/x;

    .line 103
    .line 104
    const/4 v0, 0x4

    .line 105
    invoke-direct {v7, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 106
    .line 107
    .line 108
    const/4 v6, 0x0

    .line 109
    const-string v3, "\u9690\u85cf\u5bc6\u53cb"

    .line 110
    .line 111
    const-string v4, "\u9690\u85cf\u4f1a\u8bdd\u5217\u8868\u4e2d\u7684\u5bc6\u53cb\uff0c\u5173\u95ed\u540e\u5bc6\u53cb\u4f1a\u6062\u590d\u663e\u793a"

    .line 112
    .line 113
    invoke-direct/range {v2 .. v7}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 114
    .line 115
    .line 116
    new-instance v3, Ls0/G;

    .line 117
    .line 118
    new-instance v6, Ls0/x;

    .line 119
    .line 120
    const/4 v0, 0x5

    .line 121
    invoke-direct {v6, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 122
    .line 123
    .line 124
    new-instance v8, Ls0/x;

    .line 125
    .line 126
    const/4 v0, 0x6

    .line 127
    invoke-direct {v8, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 128
    .line 129
    .line 130
    const/4 v7, 0x0

    .line 131
    const-string v4, "\u9690\u85cf\u901a\u8baf\u5f55\u597d\u53cb"

    .line 132
    .line 133
    const-string v5, "\u9690\u85cf\u901a\u8baf\u5f55\u4e2d\u7684\u5bc6\u53cb\u8054\u7cfb\u4eba"

    .line 134
    .line 135
    invoke-direct/range {v3 .. v8}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 136
    .line 137
    .line 138
    new-instance v4, Ls0/G;

    .line 139
    .line 140
    iget-object v0, p1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getChatHistoryQuickUnhideClickCount()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    const/4 v5, 0x2

    .line 147
    const/16 v6, 0x8

    .line 148
    .line 149
    invoke-static {v1, v5, v6}, LD/h;->g(III)I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getChatHistoryQuickUnhideDurationMs()I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    const/16 v5, 0x12c

    .line 158
    .line 159
    const/16 v6, 0x1388

    .line 160
    .line 161
    invoke-static {v0, v5, v6}, LD/h;->g(III)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    new-instance v5, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v6, "\u8fdb\u5165\u5bc6\u53cb\u804a\u5929\u9875\u65f6\u9690\u85cf\u5386\u53f2\u804a\u5929\u5185\u5bb9\uff0c"

    .line 168
    .line 169
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v1, " \u51fb\u804a\u5929\u9875\u9762\u5feb\u901f\u89e3\u9664\uff0c\u7a97\u53e3 "

    .line 176
    .line 177
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v0, "ms"

    .line 184
    .line 185
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    new-instance v7, Ls0/x;

    .line 193
    .line 194
    const/4 v0, 0x7

    .line 195
    invoke-direct {v7, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 196
    .line 197
    .line 198
    new-instance v8, Ls0/x;

    .line 199
    .line 200
    const/16 v0, 0x8

    .line 201
    .line 202
    invoke-direct {v8, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 203
    .line 204
    .line 205
    new-instance v9, Ls0/x;

    .line 206
    .line 207
    const/16 v0, 0x9

    .line 208
    .line 209
    invoke-direct {v9, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 210
    .line 211
    .line 212
    const-string v5, "\u9690\u85cf\u804a\u5929\u8bb0\u5f55"

    .line 213
    .line 214
    invoke-direct/range {v4 .. v9}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 215
    .line 216
    .line 217
    new-instance v5, Ls0/G;

    .line 218
    .line 219
    new-instance v8, Ls0/x;

    .line 220
    .line 221
    const/16 v0, 0xa

    .line 222
    .line 223
    invoke-direct {v8, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 224
    .line 225
    .line 226
    new-instance v10, Ls0/x;

    .line 227
    .line 228
    const/16 v0, 0xb

    .line 229
    .line 230
    invoke-direct {v10, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 231
    .line 232
    .line 233
    const/4 v9, 0x0

    .line 234
    const-string v6, "\u5b58\u50a8\u7a7a\u95f4\u804a\u5929\u8bb0\u5f55\u9690\u85cf"

    .line 235
    .line 236
    const-string v7, "\u9690\u85cf\u5fae\u4fe1\u5b58\u50a8\u7a7a\u95f4\u804a\u5929\u8bb0\u5f55\u7ba1\u7406\u4e2d\u7684\u5bc6\u53cb\u4f1a\u8bdd"

    .line 237
    .line 238
    invoke-direct/range {v5 .. v10}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 239
    .line 240
    .line 241
    new-instance v6, Ls0/G;

    .line 242
    .line 243
    new-instance v9, Ls0/x;

    .line 244
    .line 245
    const/16 v0, 0xc

    .line 246
    .line 247
    invoke-direct {v9, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 248
    .line 249
    .line 250
    new-instance v11, Ls0/x;

    .line 251
    .line 252
    const/4 v0, 0x1

    .line 253
    invoke-direct {v11, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 254
    .line 255
    .line 256
    const/4 v10, 0x0

    .line 257
    const-string v7, "\u9690\u85cf\u72b6\u6001\u9875\u5bc6\u53cb"

    .line 258
    .line 259
    const-string v8, "\u9690\u85cf\u5fae\u4fe1\u72b6\u6001\u9875\u4e2d\u7684\u5bc6\u53cb\u72b6\u6001\u5206\u7ec4"

    .line 260
    .line 261
    invoke-direct/range {v6 .. v11}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 262
    .line 263
    .line 264
    new-instance v7, Ls0/G;

    .line 265
    .line 266
    new-instance v10, Ls0/x;

    .line 267
    .line 268
    const/4 v0, 0x2

    .line 269
    invoke-direct {v10, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 270
    .line 271
    .line 272
    new-instance v12, Ls0/x;

    .line 273
    .line 274
    const/4 v0, 0x3

    .line 275
    invoke-direct {v12, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 276
    .line 277
    .line 278
    const/4 v11, 0x0

    .line 279
    const-string v8, "\u9690\u85cf\u8bed\u97f3/\u89c6\u9891\u901a\u8bdd"

    .line 280
    .line 281
    const-string v9, "\u5bc6\u53cb\u6765\u8bed\u97f3\u6216\u89c6\u9891\u65f6\u62e6\u622a\u901a\u8bdd\u754c\u9762\u548c\u63d0\u9192"

    .line 282
    .line 283
    invoke-direct/range {v7 .. v12}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 284
    .line 285
    .line 286
    filled-new-array/range {v2 .. v7}, [Ls0/G;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    const-string v1, "\u5bc6\u53cb\u529f\u80fd"

    .line 295
    .line 296
    invoke-virtual {p1, v1, v0}, Ls0/J;->O(Ljava/lang/String;Ljava/util/List;)V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_2
    new-instance v2, Ls0/G;

    .line 301
    .line 302
    new-instance v5, Ls0/z;

    .line 303
    .line 304
    iget-object p1, p0, Ls0/v;->c:Ls0/J;

    .line 305
    .line 306
    const/4 v0, 0x0

    .line 307
    invoke-direct {v5, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 308
    .line 309
    .line 310
    new-instance v7, Ls0/z;

    .line 311
    .line 312
    const/4 v0, 0x1

    .line 313
    invoke-direct {v7, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 314
    .line 315
    .line 316
    const/4 v6, 0x0

    .line 317
    const-string v3, "\u6447\u4e00\u6447\u9690\u85cf"

    .line 318
    .line 319
    const-string v4, "\u4e34\u65f6\u89e3\u9664\u540e\u6447\u4e00\u6447\u624b\u673a\u5373\u53ef\u6062\u590d\u9690\u85cf"

    .line 320
    .line 321
    invoke-direct/range {v2 .. v7}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 322
    .line 323
    .line 324
    new-instance v3, Ls0/G;

    .line 325
    .line 326
    iget-object v0, p1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 327
    .line 328
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getSearchCommandText()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 333
    .line 334
    .line 335
    move-result v4

    .line 336
    if-eqz v4, :cond_1

    .line 337
    .line 338
    const-string v1, "#hide"

    .line 339
    .line 340
    :cond_1
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getSearchListCommandText()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 345
    .line 346
    .line 347
    move-result v4

    .line 348
    if-eqz v4, :cond_2

    .line 349
    .line 350
    const-string v0, "#list"

    .line 351
    .line 352
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    const-string v5, "\u641c\u7d22\u6846\u5feb\u6377\u6253\u5f00\u914d\u7f6e\u9762\u677f "

    .line 355
    .line 356
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    const-string v1, "\uff0c\u7ba1\u7406\u540d\u5355 "

    .line 363
    .line 364
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    new-instance v6, Ls0/z;

    .line 375
    .line 376
    const/4 v0, 0x2

    .line 377
    invoke-direct {v6, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 378
    .line 379
    .line 380
    new-instance v7, Ls0/z;

    .line 381
    .line 382
    const/4 v0, 0x3

    .line 383
    invoke-direct {v7, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 384
    .line 385
    .line 386
    new-instance v8, Ls0/z;

    .line 387
    .line 388
    const/4 v0, 0x4

    .line 389
    invoke-direct {v8, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 390
    .line 391
    .line 392
    const-string v4, "\u641c\u7d22\u6846\u547d\u4ee4\u76d1\u542c"

    .line 393
    .line 394
    invoke-direct/range {v3 .. v8}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 395
    .line 396
    .line 397
    new-instance v4, Ls0/G;

    .line 398
    .line 399
    new-instance v7, Ls0/z;

    .line 400
    .line 401
    const/4 v0, 0x5

    .line 402
    invoke-direct {v7, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 403
    .line 404
    .line 405
    new-instance v9, Ls0/z;

    .line 406
    .line 407
    const/4 v0, 0x6

    .line 408
    invoke-direct {v9, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 409
    .line 410
    .line 411
    const/4 v8, 0x0

    .line 412
    const-string v5, "\u5feb\u6377\u52a0\u5165\u540d\u5355"

    .line 413
    .line 414
    const-string v6, "\u5728\u4f1a\u8bdd\u5217\u8868\u548c\u901a\u8baf\u5f55\u957f\u6309\u83dc\u5355\u4e2d\u663e\u793a\u52a0\u5165\u540d\u5355"

    .line 415
    .line 416
    invoke-direct/range {v4 .. v9}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 417
    .line 418
    .line 419
    new-instance v5, Ls0/G;

    .line 420
    .line 421
    new-instance v8, Ls0/z;

    .line 422
    .line 423
    const/4 v0, 0x7

    .line 424
    invoke-direct {v8, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 425
    .line 426
    .line 427
    new-instance v10, Ls0/z;

    .line 428
    .line 429
    const/16 v0, 0x8

    .line 430
    .line 431
    invoke-direct {v10, p1, v0}, Ls0/z;-><init>(Ls0/J;I)V

    .line 432
    .line 433
    .line 434
    const/4 v9, 0x0

    .line 435
    const-string v6, "\u804a\u5929\u9875\u9762\u8f93\u5165\u6846\u53e3\u4ee4\u76d1\u542c"

    .line 436
    .line 437
    const-string v7, "\u76d1\u542c\u804a\u5929\u8f93\u5165\u6846\u4e2d\u7684\u9690\u85cf/\u5220\u9664\u7b49\u53e3\u4ee4"

    .line 438
    .line 439
    invoke-direct/range {v5 .. v10}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 440
    .line 441
    .line 442
    filled-new-array {v2, v3, v4, v5}, [Ls0/G;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    const-string v1, "\u5feb\u6377\u529f\u80fd"

    .line 451
    .line 452
    invoke-virtual {p1, v1, v0}, Ls0/J;->O(Ljava/lang/String;Ljava/util/List;)V

    .line 453
    .line 454
    .line 455
    return-void

    .line 456
    :pswitch_3
    new-instance p1, Li/q1;

    .line 457
    .line 458
    iget-object v0, p0, Ls0/v;->c:Ls0/J;

    .line 459
    .line 460
    invoke-virtual {v0}, Lt0/c;->getActivity()Landroid/app/Activity;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    invoke-direct {p1, v0}, Li/q1;-><init>(Landroid/app/Activity;)V

    .line 468
    .line 469
    .line 470
    iget-object v0, p1, Li/q1;->g:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 473
    .line 474
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    if-eqz v0, :cond_3

    .line 479
    .line 480
    goto :goto_1

    .line 481
    :cond_3
    iget-object p1, p1, Li/q1;->a:Landroid/view/View;

    .line 482
    .line 483
    check-cast p1, Lt0/e;

    .line 484
    .line 485
    invoke-virtual {p1}, Lt0/c;->g()V

    .line 486
    .line 487
    .line 488
    :goto_1
    return-void

    .line 489
    :pswitch_4
    iget-object p1, p0, Ls0/v;->c:Ls0/J;

    .line 490
    .line 491
    invoke-virtual {p1}, Ls0/J;->a()V

    .line 492
    .line 493
    .line 494
    return-void

    .line 495
    :pswitch_5
    new-instance v0, Ls0/G;

    .line 496
    .line 497
    new-instance v3, Ls0/z;

    .line 498
    .line 499
    iget-object p1, p0, Ls0/v;->c:Ls0/J;

    .line 500
    .line 501
    const/16 v1, 0x9

    .line 502
    .line 503
    invoke-direct {v3, p1, v1}, Ls0/z;-><init>(Ls0/J;I)V

    .line 504
    .line 505
    .line 506
    new-instance v5, Ls0/z;

    .line 507
    .line 508
    const/16 v1, 0xa

    .line 509
    .line 510
    invoke-direct {v5, p1, v1}, Ls0/z;-><init>(Ls0/J;I)V

    .line 511
    .line 512
    .line 513
    const/4 v4, 0x0

    .line 514
    const-string v1, "\u9632\u64a4\u56de"

    .line 515
    .line 516
    const-string v2, "\u963b\u6b62\u5bf9\u65b9\u64a4\u56de\u6d88\u606f\uff0c\u5e76\u5728\u804a\u5929\u9875\u663e\u793a\u672c\u5730\u63d0\u793a"

    .line 517
    .line 518
    invoke-direct/range {v0 .. v5}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 519
    .line 520
    .line 521
    new-instance v4, Ls0/z;

    .line 522
    .line 523
    const/16 v1, 0xb

    .line 524
    .line 525
    invoke-direct {v4, p1, v1}, Ls0/z;-><init>(Ls0/J;I)V

    .line 526
    .line 527
    .line 528
    new-instance v6, Ls0/z;

    .line 529
    .line 530
    const/16 v1, 0xc

    .line 531
    .line 532
    invoke-direct {v6, p1, v1}, Ls0/z;-><init>(Ls0/J;I)V

    .line 533
    .line 534
    .line 535
    new-instance v5, Ls0/z;

    .line 536
    .line 537
    const/16 v1, 0xd

    .line 538
    .line 539
    invoke-direct {v5, p1, v1}, Ls0/z;-><init>(Ls0/J;I)V

    .line 540
    .line 541
    .line 542
    new-instance v1, Ls0/G;

    .line 543
    .line 544
    const-string v2, "\u4fee\u6539\u672c\u5730\u597d\u53cb\u5934\u50cf"

    .line 545
    .line 546
    const-string v3, "\u5f00\u542f\u540e\u9009\u62e9\u8054\u7cfb\u4eba\u5e76\u4ece\u76f8\u518c\u8bbe\u7f6e\u672c\u5730\u5934\u50cf"

    .line 547
    .line 548
    invoke-direct/range {v1 .. v6}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 549
    .line 550
    .line 551
    new-instance v2, Ls0/G;

    .line 552
    .line 553
    new-instance v5, Ls0/z;

    .line 554
    .line 555
    const/16 v3, 0xe

    .line 556
    .line 557
    invoke-direct {v5, p1, v3}, Ls0/z;-><init>(Ls0/J;I)V

    .line 558
    .line 559
    .line 560
    new-instance v7, Ls0/z;

    .line 561
    .line 562
    const/16 v3, 0xf

    .line 563
    .line 564
    invoke-direct {v7, p1, v3}, Ls0/z;-><init>(Ls0/J;I)V

    .line 565
    .line 566
    .line 567
    const/4 v6, 0x0

    .line 568
    const-string v3, "\u963b\u6b62\u5fae\u4fe1\u70ed\u66f4\u65b0"

    .line 569
    .line 570
    const-string v4, "\u963b\u6b62\u5fae\u4fe1 Tinker \u70ed\u8865\u4e01\u52a0\u8f7d\uff0c\u964d\u4f4e\u70ed\u66f4\u65b0\u5bfc\u81f4\u9002\u914d\u5931\u6548\u7684\u6982\u7387"

    .line 571
    .line 572
    invoke-direct/range {v2 .. v7}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 573
    .line 574
    .line 575
    new-instance v3, Ls0/G;

    .line 576
    .line 577
    new-instance v6, Ls0/z;

    .line 578
    .line 579
    const/16 v4, 0x10

    .line 580
    .line 581
    invoke-direct {v6, p1, v4}, Ls0/z;-><init>(Ls0/J;I)V

    .line 582
    .line 583
    .line 584
    new-instance v8, Ls0/z;

    .line 585
    .line 586
    const/16 v4, 0x11

    .line 587
    .line 588
    invoke-direct {v8, p1, v4}, Ls0/z;-><init>(Ls0/J;I)V

    .line 589
    .line 590
    .line 591
    const/4 v7, 0x0

    .line 592
    const-string v4, "\u4f7f\u7528\u5168\u5c4f\u914d\u7f6e\u9875"

    .line 593
    .line 594
    const-string v5, "\u5f00\u542f\u540e\u914d\u7f6e\u9875\u9762\u5360\u6ee1\u5c4f\u5e55\uff1b\u5173\u95ed\u540e\u4ee5\u5c45\u4e2d\u5361\u7247\u65b9\u5f0f\u663e\u793a"

    .line 595
    .line 596
    invoke-direct/range {v3 .. v8}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 597
    .line 598
    .line 599
    filled-new-array {v0, v1, v2, v3}, [Ls0/G;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    const-string v1, "\u5b9e\u9a8c\u5ba4"

    .line 608
    .line 609
    invoke-virtual {p1, v1, v0}, Ls0/J;->O(Ljava/lang/String;Ljava/util/List;)V

    .line 610
    .line 611
    .line 612
    return-void

    .line 613
    :pswitch_6
    new-instance v2, Ls0/G;

    .line 614
    .line 615
    new-instance v5, Ls0/x;

    .line 616
    .line 617
    iget-object p1, p0, Ls0/v;->c:Ls0/J;

    .line 618
    .line 619
    const/16 v0, 0xd

    .line 620
    .line 621
    invoke-direct {v5, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 622
    .line 623
    .line 624
    new-instance v7, Ls0/x;

    .line 625
    .line 626
    const/16 v0, 0xf

    .line 627
    .line 628
    invoke-direct {v7, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 629
    .line 630
    .line 631
    const/4 v6, 0x0

    .line 632
    const-string v3, "\u9690\u85cf\u6d88\u606f\u89d2\u6807"

    .line 633
    .line 634
    const-string v4, "\u9690\u85cf\u5934\u50cf\u7ea2\u70b9\u548c\u9876\u90e8\u672a\u8bfb\u6d88\u606f\u6570\u91cf"

    .line 635
    .line 636
    invoke-direct/range {v2 .. v7}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 637
    .line 638
    .line 639
    iget-object v0, p1, Ls0/J;->l:Lcom/lu/wxmask/bean/OptionData;

    .line 640
    .line 641
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHiddenMessageVibrateMode()I

    .line 642
    .line 643
    .line 644
    move-result v0

    .line 645
    const/4 v1, 0x0

    .line 646
    const/4 v3, 0x3

    .line 647
    invoke-static {v0, v1, v3}, LD/h;->g(III)I

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    if-eqz v0, :cond_6

    .line 652
    .line 653
    const/4 v1, 0x2

    .line 654
    if-eq v0, v1, :cond_5

    .line 655
    .line 656
    if-eq v0, v3, :cond_4

    .line 657
    .line 658
    const-string v0, "\u9ed8\u8ba4"

    .line 659
    .line 660
    goto :goto_2

    .line 661
    :cond_4
    const-string v0, "\u8fde\u7eed"

    .line 662
    .line 663
    goto :goto_2

    .line 664
    :cond_5
    const-string v0, "\u5f3a\u70c8"

    .line 665
    .line 666
    goto :goto_2

    .line 667
    :cond_6
    const-string v0, "\u8f7b\u5fae"

    .line 668
    .line 669
    :goto_2
    const-string v1, "\u5bc6\u53cb\u6765\u6d88\u606f\u65f6\u89e6\u53d1\u5355\u72ec\u9707\u52a8\u63d0\u9192\uff0c\u5f53\u524d "

    .line 670
    .line 671
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v5

    .line 675
    new-instance v6, Ls0/x;

    .line 676
    .line 677
    const/16 v0, 0x10

    .line 678
    .line 679
    invoke-direct {v6, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 680
    .line 681
    .line 682
    new-instance v8, Ls0/x;

    .line 683
    .line 684
    const/16 v0, 0x11

    .line 685
    .line 686
    invoke-direct {v8, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 687
    .line 688
    .line 689
    const-string v0, "desc"

    .line 690
    .line 691
    invoke-static {v5, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    new-instance v7, Ls0/x;

    .line 695
    .line 696
    const/16 v0, 0x12

    .line 697
    .line 698
    invoke-direct {v7, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 699
    .line 700
    .line 701
    new-instance v3, Ls0/G;

    .line 702
    .line 703
    const-string v4, "\u5bc6\u53cb\u6d88\u606f\u9707\u52a8"

    .line 704
    .line 705
    invoke-direct/range {v3 .. v8}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 706
    .line 707
    .line 708
    new-instance v4, Ls0/G;

    .line 709
    .line 710
    new-instance v7, Ls0/x;

    .line 711
    .line 712
    const/16 v0, 0x13

    .line 713
    .line 714
    invoke-direct {v7, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 715
    .line 716
    .line 717
    new-instance v9, Ls0/x;

    .line 718
    .line 719
    const/16 v0, 0x14

    .line 720
    .line 721
    invoke-direct {v9, p1, v0}, Ls0/x;-><init>(Ls0/J;I)V

    .line 722
    .line 723
    .line 724
    const/4 v8, 0x0

    .line 725
    const-string v5, "\u5bc6\u53cb\u6d88\u606f\u9876\u90e8\u52a0\u7c97"

    .line 726
    .line 727
    const-string v6, "\u5bc6\u53cb\u6765\u6d88\u606f\u65f6\u8ba9\u9876\u90e8\u5fae\u4fe1\u6807\u9898\u52a0\u7c97\u63d0\u793a"

    .line 728
    .line 729
    invoke-direct/range {v4 .. v9}, Ls0/G;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;)V

    .line 730
    .line 731
    .line 732
    filled-new-array {v2, v3, v4}, [Ls0/G;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    const-string v1, "\u6d88\u606f\u63d0\u9192"

    .line 741
    .line 742
    invoke-virtual {p1, v1, v0}, Ls0/J;->O(Ljava/lang/String;Ljava/util/List;)V

    .line 743
    .line 744
    .line 745
    return-void

    .line 746
    nop

    .line 747
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
