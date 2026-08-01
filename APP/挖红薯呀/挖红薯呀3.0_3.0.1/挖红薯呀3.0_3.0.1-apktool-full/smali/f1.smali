.class public final Lf1;
.super Landroid/view/accessibility/AccessibilityNodeProvider;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final a:Ld;


# direct methods
.method public constructor <init>(Ld;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/view/accessibility/AccessibilityNodeProvider;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf1;->a:Ld;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance v0, Le1;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Le1;-><init>(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lf1;->a:Ld;

    .line 7
    .line 8
    iget-object p0, p0, Ld;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lc4;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0, p3, p4}, Lc4;->b(ILe1;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final createAccessibilityNodeInfo(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lf1;->a:Ld;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ld;->k(I)Le1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object p0, p0, Le1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 12
    .line 13
    return-object p0
.end method

.method public final findAccessibilityNodeInfosByText(Ljava/lang/String;I)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lf1;->a:Ld;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public final findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 3

    .line 1
    iget-object p0, p0, Lf1;->a:Ld;

    .line 2
    .line 3
    iget-object v0, p0, Ld;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lc4;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq p1, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-ne p1, v1, :cond_0

    .line 13
    .line 14
    iget p1, v0, Lc4;->o:I

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ld;->k(I)Le1;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const-string p0, "Unknown focus type: "

    .line 22
    .line 23
    invoke-static {p0, p1}, Lt1;->l(Ljava/lang/String;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    move-object p0, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    iget p1, v0, Lc4;->p:I

    .line 33
    .line 34
    const/high16 v0, -0x80000000

    .line 35
    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-virtual {p0, p1}, Ld;->k(I)Le1;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :goto_1
    if-nez p0, :cond_3

    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_3
    iget-object p0, p0, Le1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 47
    .line 48
    return-object p0
.end method

.method public final performAction(IILandroid/os/Bundle;)Z
    .locals 18

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v2, v2, Lf1;->a:Ld;

    .line 10
    .line 11
    iget-object v2, v2, Ld;->f:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Lc4;

    .line 14
    .line 15
    iget-object v4, v2, Lc4;->j:Landroid/view/accessibility/AccessibilityManager;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    iget-object v7, v2, Lc4;->g:Lw3;

    .line 23
    .line 24
    invoke-virtual {v2}, Lc4;->k()Lu20;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    invoke-virtual {v8, v0}, Lu20;->b(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    check-cast v8, Lzz0;

    .line 33
    .line 34
    if-eqz v8, :cond_0

    .line 35
    .line 36
    iget-object v11, v8, Lzz0;->a:Lxz0;

    .line 37
    .line 38
    if-nez v11, :cond_1

    .line 39
    .line 40
    :cond_0
    :goto_0
    const/16 v17, 0x0

    .line 41
    .line 42
    goto/16 :goto_3f

    .line 43
    .line 44
    :cond_1
    iget-object v8, v11, Lxz0;->c:Lb60;

    .line 45
    .line 46
    iget v10, v11, Lxz0;->g:I

    .line 47
    .line 48
    iget-object v12, v11, Lxz0;->d:Lsz0;

    .line 49
    .line 50
    iget-object v13, v12, Lsz0;->d:Ljh0;

    .line 51
    .line 52
    sget-object v14, Lb01;->n:Le01;

    .line 53
    .line 54
    invoke-virtual {v13, v14}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v14

    .line 58
    if-nez v14, :cond_2

    .line 59
    .line 60
    const/4 v14, 0x0

    .line 61
    :cond_2
    move/from16 p0, v5

    .line 62
    .line 63
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {v14, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    const/4 v15, 0x1

    .line 70
    if-eqz v14, :cond_4

    .line 71
    .line 72
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 73
    .line 74
    const/16 v9, 0x22

    .line 75
    .line 76
    if-lt v14, v9, :cond_3

    .line 77
    .line 78
    invoke-static {v4}, Ls0;->e(Landroid/view/accessibility/AccessibilityManager;)Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move v9, v15

    .line 84
    :goto_1
    if-nez v9, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    const/16 v9, 0x40

    .line 88
    .line 89
    const/high16 v14, -0x80000000

    .line 90
    .line 91
    if-eq v1, v9, :cond_81

    .line 92
    .line 93
    const/16 v4, 0x80

    .line 94
    .line 95
    if-eq v1, v4, :cond_7f

    .line 96
    .line 97
    const/16 v9, 0x200

    .line 98
    .line 99
    const/16 v4, 0x100

    .line 100
    .line 101
    const/4 v14, -0x1

    .line 102
    if-eq v1, v4, :cond_61

    .line 103
    .line 104
    if-eq v1, v9, :cond_61

    .line 105
    .line 106
    const/16 v4, 0x4000

    .line 107
    .line 108
    if-eq v1, v4, :cond_5f

    .line 109
    .line 110
    const/high16 v4, 0x20000

    .line 111
    .line 112
    if-eq v1, v4, :cond_5b

    .line 113
    .line 114
    invoke-static {v11}, Lrd0;->g(Lxz0;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-nez v4, :cond_5

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_5
    if-eq v1, v15, :cond_58

    .line 122
    .line 123
    const/4 v4, 0x2

    .line 124
    if-eq v1, v4, :cond_56

    .line 125
    .line 126
    sget-object v4, Lk50;->e:Lk50;

    .line 127
    .line 128
    sparse-switch v1, :sswitch_data_0

    .line 129
    .line 130
    .line 131
    packed-switch v1, :pswitch_data_0

    .line 132
    .line 133
    .line 134
    packed-switch v1, :pswitch_data_1

    .line 135
    .line 136
    .line 137
    iget-object v2, v2, Lc4;->v:Ll31;

    .line 138
    .line 139
    invoke-virtual {v2, v0}, Ll31;->b(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Ll31;

    .line 144
    .line 145
    if-eqz v0, :cond_0

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ll31;->b(I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/lang/CharSequence;

    .line 152
    .line 153
    if-nez v0, :cond_6

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_6
    sget-object v0, Lrz0;->w:Le01;

    .line 157
    .line 158
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    if-nez v0, :cond_7

    .line 163
    .line 164
    const/4 v15, 0x0

    .line 165
    goto :goto_2

    .line 166
    :cond_7
    move-object v15, v0

    .line 167
    :goto_2
    check-cast v15, Ljava/util/List;

    .line 168
    .line 169
    if-nez v15, :cond_8

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :cond_8
    invoke-interface {v15}, Ljava/util/Collection;->size()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-gtz v0, :cond_9

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_9
    const/4 v0, 0x0

    .line 182
    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Lxc;->d()V

    .line 190
    .line 191
    .line 192
    const/4 v9, 0x0

    .line 193
    goto/16 :goto_40

    .line 194
    .line 195
    :pswitch_0
    sget-object v0, Lrz0;->A:Le01;

    .line 196
    .line 197
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-nez v0, :cond_a

    .line 202
    .line 203
    const/4 v15, 0x0

    .line 204
    goto :goto_3

    .line 205
    :cond_a
    move-object v15, v0

    .line 206
    :goto_3
    check-cast v15, Lo0;

    .line 207
    .line 208
    if-eqz v15, :cond_0

    .line 209
    .line 210
    iget-object v0, v15, Lo0;->b:Lex;

    .line 211
    .line 212
    check-cast v0, Lhw;

    .line 213
    .line 214
    if-eqz v0, :cond_0

    .line 215
    .line 216
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    goto/16 :goto_40

    .line 227
    .line 228
    :pswitch_1
    sget-object v0, Lrz0;->y:Le01;

    .line 229
    .line 230
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    if-nez v0, :cond_b

    .line 235
    .line 236
    const/4 v15, 0x0

    .line 237
    goto :goto_4

    .line 238
    :cond_b
    move-object v15, v0

    .line 239
    :goto_4
    check-cast v15, Lo0;

    .line 240
    .line 241
    if-eqz v15, :cond_0

    .line 242
    .line 243
    iget-object v0, v15, Lo0;->b:Lex;

    .line 244
    .line 245
    check-cast v0, Lhw;

    .line 246
    .line 247
    if-eqz v0, :cond_0

    .line 248
    .line 249
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ljava/lang/Boolean;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    goto/16 :goto_40

    .line 260
    .line 261
    :pswitch_2
    sget-object v0, Lrz0;->z:Le01;

    .line 262
    .line 263
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    if-nez v0, :cond_c

    .line 268
    .line 269
    const/4 v15, 0x0

    .line 270
    goto :goto_5

    .line 271
    :cond_c
    move-object v15, v0

    .line 272
    :goto_5
    check-cast v15, Lo0;

    .line 273
    .line 274
    if-eqz v15, :cond_0

    .line 275
    .line 276
    iget-object v0, v15, Lo0;->b:Lex;

    .line 277
    .line 278
    check-cast v0, Lhw;

    .line 279
    .line 280
    if-eqz v0, :cond_0

    .line 281
    .line 282
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    check-cast v0, Ljava/lang/Boolean;

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    goto/16 :goto_40

    .line 293
    .line 294
    :pswitch_3
    sget-object v0, Lrz0;->x:Le01;

    .line 295
    .line 296
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    if-nez v0, :cond_d

    .line 301
    .line 302
    const/4 v15, 0x0

    .line 303
    goto :goto_6

    .line 304
    :cond_d
    move-object v15, v0

    .line 305
    :goto_6
    check-cast v15, Lo0;

    .line 306
    .line 307
    if-eqz v15, :cond_0

    .line 308
    .line 309
    iget-object v0, v15, Lo0;->b:Lex;

    .line 310
    .line 311
    check-cast v0, Lhw;

    .line 312
    .line 313
    if-eqz v0, :cond_0

    .line 314
    .line 315
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, Ljava/lang/Boolean;

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    goto/16 :goto_40

    .line 326
    .line 327
    :sswitch_0
    sget-object v0, Lrz0;->o:Le01;

    .line 328
    .line 329
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    if-nez v0, :cond_e

    .line 334
    .line 335
    const/4 v15, 0x0

    .line 336
    goto :goto_7

    .line 337
    :cond_e
    move-object v15, v0

    .line 338
    :goto_7
    check-cast v15, Lo0;

    .line 339
    .line 340
    if-eqz v15, :cond_0

    .line 341
    .line 342
    iget-object v0, v15, Lo0;->b:Lex;

    .line 343
    .line 344
    check-cast v0, Lhw;

    .line 345
    .line 346
    if-eqz v0, :cond_0

    .line 347
    .line 348
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    check-cast v0, Ljava/lang/Boolean;

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    goto/16 :goto_40

    .line 359
    .line 360
    :sswitch_1
    if-eqz v3, :cond_0

    .line 361
    .line 362
    const-string v0, "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"

    .line 363
    .line 364
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-nez v1, :cond_f

    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :cond_f
    sget-object v1, Lrz0;->i:Le01;

    .line 373
    .line 374
    invoke-virtual {v13, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    if-nez v1, :cond_10

    .line 379
    .line 380
    const/4 v15, 0x0

    .line 381
    goto :goto_8

    .line 382
    :cond_10
    move-object v15, v1

    .line 383
    :goto_8
    check-cast v15, Lo0;

    .line 384
    .line 385
    if-eqz v15, :cond_0

    .line 386
    .line 387
    iget-object v1, v15, Lo0;->b:Lex;

    .line 388
    .line 389
    check-cast v1, Lsw;

    .line 390
    .line 391
    if-eqz v1, :cond_0

    .line 392
    .line 393
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 394
    .line 395
    .line 396
    move-result v0

    .line 397
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-interface {v1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, Ljava/lang/Boolean;

    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 408
    .line 409
    .line 410
    move-result v9

    .line 411
    goto/16 :goto_40

    .line 412
    .line 413
    :sswitch_2
    invoke-virtual {v11}, Lxz0;->l()Lxz0;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    if-eqz v0, :cond_12

    .line 418
    .line 419
    iget-object v1, v0, Lxz0;->d:Lsz0;

    .line 420
    .line 421
    sget-object v2, Lrz0;->d:Le01;

    .line 422
    .line 423
    iget-object v1, v1, Lsz0;->d:Ljh0;

    .line 424
    .line 425
    invoke-virtual {v1, v2}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    if-nez v1, :cond_11

    .line 430
    .line 431
    const/4 v1, 0x0

    .line 432
    :cond_11
    check-cast v1, Lo0;

    .line 433
    .line 434
    goto :goto_9

    .line 435
    :cond_12
    const/4 v1, 0x0

    .line 436
    :goto_9
    if-eqz v0, :cond_15

    .line 437
    .line 438
    if-eqz v1, :cond_13

    .line 439
    .line 440
    goto :goto_a

    .line 441
    :cond_13
    invoke-virtual {v0}, Lxz0;->l()Lxz0;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    if-eqz v0, :cond_12

    .line 446
    .line 447
    iget-object v1, v0, Lxz0;->d:Lsz0;

    .line 448
    .line 449
    sget-object v2, Lrz0;->d:Le01;

    .line 450
    .line 451
    iget-object v1, v1, Lsz0;->d:Ljh0;

    .line 452
    .line 453
    invoke-virtual {v1, v2}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    if-nez v1, :cond_14

    .line 458
    .line 459
    const/4 v1, 0x0

    .line 460
    :cond_14
    check-cast v1, Lo0;

    .line 461
    .line 462
    goto :goto_9

    .line 463
    :cond_15
    :goto_a
    if-nez v0, :cond_16

    .line 464
    .line 465
    invoke-virtual {v11}, Lxz0;->g()Lst0;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    new-instance v1, Landroid/graphics/Rect;

    .line 470
    .line 471
    iget v2, v0, Lst0;->a:F

    .line 472
    .line 473
    float-to-double v2, v2

    .line 474
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 475
    .line 476
    .line 477
    move-result-wide v2

    .line 478
    double-to-float v2, v2

    .line 479
    float-to-int v2, v2

    .line 480
    iget v3, v0, Lst0;->b:F

    .line 481
    .line 482
    float-to-double v3, v3

    .line 483
    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    .line 484
    .line 485
    .line 486
    move-result-wide v3

    .line 487
    double-to-float v3, v3

    .line 488
    float-to-int v3, v3

    .line 489
    iget v4, v0, Lst0;->c:F

    .line 490
    .line 491
    float-to-double v4, v4

    .line 492
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 493
    .line 494
    .line 495
    move-result-wide v4

    .line 496
    double-to-float v4, v4

    .line 497
    invoke-static {v4}, Lrd0;->Q(F)I

    .line 498
    .line 499
    .line 500
    move-result v4

    .line 501
    iget v0, v0, Lst0;->d:F

    .line 502
    .line 503
    float-to-double v5, v0

    .line 504
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 505
    .line 506
    .line 507
    move-result-wide v5

    .line 508
    double-to-float v0, v5

    .line 509
    invoke-static {v0}, Lrd0;->Q(F)I

    .line 510
    .line 511
    .line 512
    move-result v0

    .line 513
    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v7, v1}, Landroid/view/View;->requestRectangleOnScreen(Landroid/graphics/Rect;)Z

    .line 517
    .line 518
    .line 519
    move-result v9

    .line 520
    goto/16 :goto_40

    .line 521
    .line 522
    :cond_16
    iget-object v2, v0, Lxz0;->d:Lsz0;

    .line 523
    .line 524
    iget-object v2, v2, Lsz0;->d:Ljh0;

    .line 525
    .line 526
    iget-object v0, v0, Lxz0;->c:Lb60;

    .line 527
    .line 528
    iget-object v3, v0, Lb60;->I:Lmj0;

    .line 529
    .line 530
    iget-object v3, v3, Lmj0;->c:Lc20;

    .line 531
    .line 532
    invoke-static {v3}, Lj50;->g(Li50;)Lst0;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    iget-object v0, v0, Lb60;->I:Lmj0;

    .line 537
    .line 538
    iget-object v0, v0, Lmj0;->c:Lc20;

    .line 539
    .line 540
    invoke-virtual {v0}, Lqj0;->k()Li50;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    const-wide/16 v5, 0x0

    .line 545
    .line 546
    if-eqz v0, :cond_17

    .line 547
    .line 548
    check-cast v0, Lqj0;

    .line 549
    .line 550
    invoke-virtual {v0, v5, v6}, Lqj0;->P0(J)J

    .line 551
    .line 552
    .line 553
    move-result-wide v9

    .line 554
    goto :goto_b

    .line 555
    :cond_17
    move-wide v9, v5

    .line 556
    :goto_b
    invoke-virtual {v3, v9, v10}, Lst0;->e(J)Lst0;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v11}, Lxz0;->d()Lqj0;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    if-eqz v3, :cond_19

    .line 565
    .line 566
    invoke-virtual {v3}, Lqj0;->G0()Loe0;

    .line 567
    .line 568
    .line 569
    move-result-object v7

    .line 570
    iget-boolean v7, v7, Loe0;->q:Z

    .line 571
    .line 572
    if-eqz v7, :cond_18

    .line 573
    .line 574
    goto :goto_c

    .line 575
    :cond_18
    const/4 v3, 0x0

    .line 576
    :goto_c
    if-eqz v3, :cond_19

    .line 577
    .line 578
    invoke-virtual {v3, v5, v6}, Lqj0;->P0(J)J

    .line 579
    .line 580
    .line 581
    move-result-wide v9

    .line 582
    goto :goto_d

    .line 583
    :cond_19
    move-wide v9, v5

    .line 584
    :goto_d
    invoke-virtual {v11}, Lxz0;->d()Lqj0;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    if-eqz v3, :cond_1a

    .line 589
    .line 590
    iget-wide v5, v3, Lxq0;->f:J

    .line 591
    .line 592
    :cond_1a
    invoke-static {v5, v6}, Lo30;->C(J)J

    .line 593
    .line 594
    .line 595
    move-result-wide v5

    .line 596
    invoke-static {v9, v10, v5, v6}, Lv50;->b(JJ)Lst0;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    sget-object v5, Lb01;->u:Le01;

    .line 601
    .line 602
    invoke-virtual {v2, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v5

    .line 606
    if-nez v5, :cond_1b

    .line 607
    .line 608
    const/4 v5, 0x0

    .line 609
    :cond_1b
    check-cast v5, Lhy0;

    .line 610
    .line 611
    sget-object v5, Lb01;->v:Le01;

    .line 612
    .line 613
    invoke-virtual {v2, v5}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    if-nez v2, :cond_1c

    .line 618
    .line 619
    const/16 v16, 0x0

    .line 620
    .line 621
    goto :goto_e

    .line 622
    :cond_1c
    move-object/from16 v16, v2

    .line 623
    .line 624
    :goto_e
    check-cast v16, Lhy0;

    .line 625
    .line 626
    iget v2, v3, Lst0;->a:F

    .line 627
    .line 628
    iget v5, v0, Lst0;->a:F

    .line 629
    .line 630
    sub-float/2addr v2, v5

    .line 631
    iget v5, v3, Lst0;->c:F

    .line 632
    .line 633
    iget v6, v0, Lst0;->c:F

    .line 634
    .line 635
    sub-float/2addr v5, v6

    .line 636
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    .line 641
    .line 642
    .line 643
    move-result v7

    .line 644
    cmpg-float v6, v6, v7

    .line 645
    .line 646
    if-nez v6, :cond_1e

    .line 647
    .line 648
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 649
    .line 650
    .line 651
    move-result v6

    .line 652
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 653
    .line 654
    .line 655
    move-result v7

    .line 656
    cmpg-float v6, v6, v7

    .line 657
    .line 658
    if-gez v6, :cond_1d

    .line 659
    .line 660
    goto :goto_f

    .line 661
    :cond_1d
    move v2, v5

    .line 662
    goto :goto_f

    .line 663
    :cond_1e
    move/from16 v2, p0

    .line 664
    .line 665
    :goto_f
    iget-object v5, v8, Lb60;->C:Lk50;

    .line 666
    .line 667
    if-ne v5, v4, :cond_1f

    .line 668
    .line 669
    neg-float v2, v2

    .line 670
    :cond_1f
    iget v4, v3, Lst0;->b:F

    .line 671
    .line 672
    iget v5, v0, Lst0;->b:F

    .line 673
    .line 674
    sub-float/2addr v4, v5

    .line 675
    iget v3, v3, Lst0;->d:F

    .line 676
    .line 677
    iget v0, v0, Lst0;->d:F

    .line 678
    .line 679
    sub-float/2addr v3, v0

    .line 680
    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    .line 685
    .line 686
    .line 687
    move-result v5

    .line 688
    cmpg-float v0, v0, v5

    .line 689
    .line 690
    if-nez v0, :cond_21

    .line 691
    .line 692
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 697
    .line 698
    .line 699
    move-result v5

    .line 700
    cmpg-float v0, v0, v5

    .line 701
    .line 702
    if-gez v0, :cond_20

    .line 703
    .line 704
    move v5, v4

    .line 705
    goto :goto_10

    .line 706
    :cond_20
    move v5, v3

    .line 707
    goto :goto_10

    .line 708
    :cond_21
    move/from16 v5, p0

    .line 709
    .line 710
    :goto_10
    if-eqz v1, :cond_0

    .line 711
    .line 712
    iget-object v0, v1, Lo0;->b:Lex;

    .line 713
    .line 714
    check-cast v0, Lww;

    .line 715
    .line 716
    if-eqz v0, :cond_0

    .line 717
    .line 718
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    invoke-interface {v0, v1, v2}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    check-cast v0, Ljava/lang/Boolean;

    .line 731
    .line 732
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 733
    .line 734
    .line 735
    move-result v0

    .line 736
    if-ne v0, v15, :cond_0

    .line 737
    .line 738
    :goto_11
    move v9, v15

    .line 739
    goto/16 :goto_40

    .line 740
    .line 741
    :sswitch_3
    if-eqz v3, :cond_22

    .line 742
    .line 743
    const-string v0, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    .line 744
    .line 745
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    goto :goto_12

    .line 750
    :cond_22
    const/4 v0, 0x0

    .line 751
    :goto_12
    sget-object v1, Lrz0;->k:Le01;

    .line 752
    .line 753
    invoke-virtual {v13, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    if-nez v1, :cond_23

    .line 758
    .line 759
    const/4 v15, 0x0

    .line 760
    goto :goto_13

    .line 761
    :cond_23
    move-object v15, v1

    .line 762
    :goto_13
    check-cast v15, Lo0;

    .line 763
    .line 764
    if-eqz v15, :cond_0

    .line 765
    .line 766
    iget-object v1, v15, Lo0;->b:Lex;

    .line 767
    .line 768
    check-cast v1, Lsw;

    .line 769
    .line 770
    if-eqz v1, :cond_0

    .line 771
    .line 772
    new-instance v2, Lf8;

    .line 773
    .line 774
    if-nez v0, :cond_24

    .line 775
    .line 776
    const-string v0, ""

    .line 777
    .line 778
    :cond_24
    invoke-direct {v2, v0}, Lf8;-><init>(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    invoke-interface {v1, v2}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    check-cast v0, Ljava/lang/Boolean;

    .line 786
    .line 787
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 788
    .line 789
    .line 790
    move-result v9

    .line 791
    goto/16 :goto_40

    .line 792
    .line 793
    :sswitch_4
    sget-object v0, Lrz0;->u:Le01;

    .line 794
    .line 795
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    if-nez v0, :cond_25

    .line 800
    .line 801
    const/4 v15, 0x0

    .line 802
    goto :goto_14

    .line 803
    :cond_25
    move-object v15, v0

    .line 804
    :goto_14
    check-cast v15, Lo0;

    .line 805
    .line 806
    if-eqz v15, :cond_0

    .line 807
    .line 808
    iget-object v0, v15, Lo0;->b:Lex;

    .line 809
    .line 810
    check-cast v0, Lhw;

    .line 811
    .line 812
    if-eqz v0, :cond_0

    .line 813
    .line 814
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    check-cast v0, Ljava/lang/Boolean;

    .line 819
    .line 820
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 821
    .line 822
    .line 823
    move-result v9

    .line 824
    goto/16 :goto_40

    .line 825
    .line 826
    :sswitch_5
    sget-object v0, Lrz0;->t:Le01;

    .line 827
    .line 828
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    if-nez v0, :cond_26

    .line 833
    .line 834
    const/4 v15, 0x0

    .line 835
    goto :goto_15

    .line 836
    :cond_26
    move-object v15, v0

    .line 837
    :goto_15
    check-cast v15, Lo0;

    .line 838
    .line 839
    if-eqz v15, :cond_0

    .line 840
    .line 841
    iget-object v0, v15, Lo0;->b:Lex;

    .line 842
    .line 843
    check-cast v0, Lhw;

    .line 844
    .line 845
    if-eqz v0, :cond_0

    .line 846
    .line 847
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    check-cast v0, Ljava/lang/Boolean;

    .line 852
    .line 853
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 854
    .line 855
    .line 856
    move-result v9

    .line 857
    goto/16 :goto_40

    .line 858
    .line 859
    :sswitch_6
    sget-object v0, Lrz0;->s:Le01;

    .line 860
    .line 861
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    if-nez v0, :cond_27

    .line 866
    .line 867
    const/4 v15, 0x0

    .line 868
    goto :goto_16

    .line 869
    :cond_27
    move-object v15, v0

    .line 870
    :goto_16
    check-cast v15, Lo0;

    .line 871
    .line 872
    if-eqz v15, :cond_0

    .line 873
    .line 874
    iget-object v0, v15, Lo0;->b:Lex;

    .line 875
    .line 876
    check-cast v0, Lhw;

    .line 877
    .line 878
    if-eqz v0, :cond_0

    .line 879
    .line 880
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    check-cast v0, Ljava/lang/Boolean;

    .line 885
    .line 886
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 887
    .line 888
    .line 889
    move-result v9

    .line 890
    goto/16 :goto_40

    .line 891
    .line 892
    :sswitch_7
    sget-object v0, Lrz0;->q:Le01;

    .line 893
    .line 894
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    if-nez v0, :cond_28

    .line 899
    .line 900
    const/4 v15, 0x0

    .line 901
    goto :goto_17

    .line 902
    :cond_28
    move-object v15, v0

    .line 903
    :goto_17
    check-cast v15, Lo0;

    .line 904
    .line 905
    if-eqz v15, :cond_0

    .line 906
    .line 907
    iget-object v0, v15, Lo0;->b:Lex;

    .line 908
    .line 909
    check-cast v0, Lhw;

    .line 910
    .line 911
    if-eqz v0, :cond_0

    .line 912
    .line 913
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    check-cast v0, Ljava/lang/Boolean;

    .line 918
    .line 919
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 920
    .line 921
    .line 922
    move-result v9

    .line 923
    goto/16 :goto_40

    .line 924
    .line 925
    :sswitch_8
    sget-object v0, Lrz0;->r:Le01;

    .line 926
    .line 927
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    if-nez v0, :cond_29

    .line 932
    .line 933
    const/4 v15, 0x0

    .line 934
    goto :goto_18

    .line 935
    :cond_29
    move-object v15, v0

    .line 936
    :goto_18
    check-cast v15, Lo0;

    .line 937
    .line 938
    if-eqz v15, :cond_0

    .line 939
    .line 940
    iget-object v0, v15, Lo0;->b:Lex;

    .line 941
    .line 942
    check-cast v0, Lhw;

    .line 943
    .line 944
    if-eqz v0, :cond_0

    .line 945
    .line 946
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    check-cast v0, Ljava/lang/Boolean;

    .line 951
    .line 952
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 953
    .line 954
    .line 955
    move-result v9

    .line 956
    goto/16 :goto_40

    .line 957
    .line 958
    :pswitch_4
    :sswitch_9
    const/16 v0, 0x1000

    .line 959
    .line 960
    if-ne v1, v0, :cond_2a

    .line 961
    .line 962
    move v0, v15

    .line 963
    goto :goto_19

    .line 964
    :cond_2a
    const/4 v0, 0x0

    .line 965
    :goto_19
    const/16 v2, 0x2000

    .line 966
    .line 967
    if-ne v1, v2, :cond_2b

    .line 968
    .line 969
    move v2, v15

    .line 970
    goto :goto_1a

    .line 971
    :cond_2b
    const/4 v2, 0x0

    .line 972
    :goto_1a
    const v3, 0x1020039

    .line 973
    .line 974
    .line 975
    if-ne v1, v3, :cond_2c

    .line 976
    .line 977
    move v3, v15

    .line 978
    goto :goto_1b

    .line 979
    :cond_2c
    const/4 v3, 0x0

    .line 980
    :goto_1b
    const v5, 0x102003b

    .line 981
    .line 982
    .line 983
    if-ne v1, v5, :cond_2d

    .line 984
    .line 985
    move v5, v15

    .line 986
    goto :goto_1c

    .line 987
    :cond_2d
    const/4 v5, 0x0

    .line 988
    :goto_1c
    const v7, 0x1020038

    .line 989
    .line 990
    .line 991
    if-ne v1, v7, :cond_2e

    .line 992
    .line 993
    move v7, v15

    .line 994
    goto :goto_1d

    .line 995
    :cond_2e
    const/4 v7, 0x0

    .line 996
    :goto_1d
    const v9, 0x102003a

    .line 997
    .line 998
    .line 999
    if-ne v1, v9, :cond_2f

    .line 1000
    .line 1001
    move v1, v15

    .line 1002
    goto :goto_1e

    .line 1003
    :cond_2f
    const/4 v1, 0x0

    .line 1004
    :goto_1e
    if-nez v3, :cond_31

    .line 1005
    .line 1006
    if-nez v5, :cond_31

    .line 1007
    .line 1008
    if-nez v0, :cond_31

    .line 1009
    .line 1010
    if-eqz v2, :cond_30

    .line 1011
    .line 1012
    goto :goto_1f

    .line 1013
    :cond_30
    const/4 v9, 0x0

    .line 1014
    goto :goto_20

    .line 1015
    :cond_31
    :goto_1f
    move v9, v15

    .line 1016
    :goto_20
    if-nez v7, :cond_33

    .line 1017
    .line 1018
    if-nez v1, :cond_33

    .line 1019
    .line 1020
    if-nez v0, :cond_33

    .line 1021
    .line 1022
    if-eqz v2, :cond_32

    .line 1023
    .line 1024
    goto :goto_21

    .line 1025
    :cond_32
    const/4 v15, 0x0

    .line 1026
    :cond_33
    :goto_21
    if-nez v0, :cond_34

    .line 1027
    .line 1028
    if-eqz v2, :cond_38

    .line 1029
    .line 1030
    :cond_34
    sget-object v0, Lb01;->c:Le01;

    .line 1031
    .line 1032
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v0

    .line 1036
    if-nez v0, :cond_35

    .line 1037
    .line 1038
    const/4 v0, 0x0

    .line 1039
    :cond_35
    check-cast v0, Lys0;

    .line 1040
    .line 1041
    sget-object v1, Lrz0;->i:Le01;

    .line 1042
    .line 1043
    invoke-virtual {v13, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v1

    .line 1047
    if-nez v1, :cond_36

    .line 1048
    .line 1049
    const/4 v1, 0x0

    .line 1050
    :cond_36
    check-cast v1, Lo0;

    .line 1051
    .line 1052
    if-eqz v0, :cond_38

    .line 1053
    .line 1054
    if-eqz v1, :cond_38

    .line 1055
    .line 1056
    if-eqz v2, :cond_37

    .line 1057
    .line 1058
    const/high16 v0, -0x80000000

    .line 1059
    .line 1060
    goto :goto_22

    .line 1061
    :cond_37
    move/from16 v0, p0

    .line 1062
    .line 1063
    :goto_22
    iget-object v1, v1, Lo0;->b:Lex;

    .line 1064
    .line 1065
    check-cast v1, Lsw;

    .line 1066
    .line 1067
    if-eqz v1, :cond_0

    .line 1068
    .line 1069
    add-float v5, p0, v0

    .line 1070
    .line 1071
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    invoke-interface {v1, v0}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    check-cast v0, Ljava/lang/Boolean;

    .line 1080
    .line 1081
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1082
    .line 1083
    .line 1084
    move-result v9

    .line 1085
    goto/16 :goto_40

    .line 1086
    .line 1087
    :cond_38
    iget-object v0, v8, Lb60;->I:Lmj0;

    .line 1088
    .line 1089
    iget-object v0, v0, Lmj0;->c:Lc20;

    .line 1090
    .line 1091
    invoke-static {v0}, Lj50;->g(Li50;)Lst0;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    invoke-virtual {v0}, Lst0;->b()J

    .line 1096
    .line 1097
    .line 1098
    move-result-wide v0

    .line 1099
    new-instance v10, Ljava/util/ArrayList;

    .line 1100
    .line 1101
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 1102
    .line 1103
    .line 1104
    sget-object v11, Lrz0;->B:Le01;

    .line 1105
    .line 1106
    invoke-virtual {v13, v11}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v11

    .line 1110
    if-nez v11, :cond_39

    .line 1111
    .line 1112
    const/4 v11, 0x0

    .line 1113
    :cond_39
    check-cast v11, Lo0;

    .line 1114
    .line 1115
    if-eqz v11, :cond_3a

    .line 1116
    .line 1117
    iget-object v11, v11, Lo0;->b:Lex;

    .line 1118
    .line 1119
    check-cast v11, Lsw;

    .line 1120
    .line 1121
    if-eqz v11, :cond_3a

    .line 1122
    .line 1123
    invoke-interface {v11, v10}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v11

    .line 1127
    check-cast v11, Ljava/lang/Boolean;

    .line 1128
    .line 1129
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1130
    .line 1131
    .line 1132
    move-result v11

    .line 1133
    if-eqz v11, :cond_3a

    .line 1134
    .line 1135
    const/4 v11, 0x0

    .line 1136
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v10

    .line 1140
    check-cast v10, Ljava/lang/Float;

    .line 1141
    .line 1142
    goto :goto_23

    .line 1143
    :cond_3a
    const/4 v10, 0x0

    .line 1144
    :goto_23
    sget-object v11, Lrz0;->d:Le01;

    .line 1145
    .line 1146
    invoke-virtual {v13, v11}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v11

    .line 1150
    if-nez v11, :cond_3b

    .line 1151
    .line 1152
    const/4 v11, 0x0

    .line 1153
    :cond_3b
    check-cast v11, Lo0;

    .line 1154
    .line 1155
    if-nez v11, :cond_3c

    .line 1156
    .line 1157
    goto/16 :goto_0

    .line 1158
    .line 1159
    :cond_3c
    iget-object v11, v11, Lo0;->b:Lex;

    .line 1160
    .line 1161
    sget-object v12, Lb01;->u:Le01;

    .line 1162
    .line 1163
    invoke-virtual {v13, v12}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v12

    .line 1167
    if-nez v12, :cond_3d

    .line 1168
    .line 1169
    const/4 v12, 0x0

    .line 1170
    :cond_3d
    check-cast v12, Lhy0;

    .line 1171
    .line 1172
    if-eqz v12, :cond_48

    .line 1173
    .line 1174
    if-eqz v9, :cond_48

    .line 1175
    .line 1176
    if-eqz v10, :cond_3e

    .line 1177
    .line 1178
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 1179
    .line 1180
    .line 1181
    move-result v9

    .line 1182
    move-wide/from16 p1, v0

    .line 1183
    .line 1184
    goto :goto_24

    .line 1185
    :cond_3e
    const/16 v9, 0x20

    .line 1186
    .line 1187
    move-wide/from16 p1, v0

    .line 1188
    .line 1189
    shr-long v0, p1, v9

    .line 1190
    .line 1191
    long-to-int v0, v0

    .line 1192
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1193
    .line 1194
    .line 1195
    move-result v9

    .line 1196
    :goto_24
    if-nez v3, :cond_3f

    .line 1197
    .line 1198
    if-eqz v2, :cond_40

    .line 1199
    .line 1200
    :cond_3f
    neg-float v9, v9

    .line 1201
    :cond_40
    iget-object v0, v8, Lb60;->C:Lk50;

    .line 1202
    .line 1203
    if-ne v0, v4, :cond_42

    .line 1204
    .line 1205
    if-nez v3, :cond_41

    .line 1206
    .line 1207
    if-eqz v5, :cond_42

    .line 1208
    .line 1209
    :cond_41
    neg-float v9, v9

    .line 1210
    :cond_42
    invoke-static {v12, v9}, Lc4;->p(Lhy0;F)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    if-eqz v0, :cond_49

    .line 1215
    .line 1216
    sget-object v0, Lrz0;->y:Le01;

    .line 1217
    .line 1218
    invoke-virtual {v13, v0}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 1219
    .line 1220
    .line 1221
    move-result v1

    .line 1222
    if-nez v1, :cond_44

    .line 1223
    .line 1224
    sget-object v1, Lrz0;->A:Le01;

    .line 1225
    .line 1226
    invoke-virtual {v13, v1}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v1

    .line 1230
    if-eqz v1, :cond_43

    .line 1231
    .line 1232
    goto :goto_25

    .line 1233
    :cond_43
    check-cast v11, Lww;

    .line 1234
    .line 1235
    if-eqz v11, :cond_0

    .line 1236
    .line 1237
    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    invoke-interface {v11, v0, v6}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    check-cast v0, Ljava/lang/Boolean;

    .line 1246
    .line 1247
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v9

    .line 1251
    goto/16 :goto_40

    .line 1252
    .line 1253
    :cond_44
    :goto_25
    cmpl-float v1, v9, p0

    .line 1254
    .line 1255
    if-lez v1, :cond_46

    .line 1256
    .line 1257
    sget-object v0, Lrz0;->A:Le01;

    .line 1258
    .line 1259
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    if-nez v0, :cond_45

    .line 1264
    .line 1265
    const/4 v15, 0x0

    .line 1266
    goto :goto_26

    .line 1267
    :cond_45
    move-object v15, v0

    .line 1268
    :goto_26
    check-cast v15, Lo0;

    .line 1269
    .line 1270
    goto :goto_28

    .line 1271
    :cond_46
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v0

    .line 1275
    if-nez v0, :cond_47

    .line 1276
    .line 1277
    const/4 v15, 0x0

    .line 1278
    goto :goto_27

    .line 1279
    :cond_47
    move-object v15, v0

    .line 1280
    :goto_27
    check-cast v15, Lo0;

    .line 1281
    .line 1282
    :goto_28
    if-eqz v15, :cond_0

    .line 1283
    .line 1284
    iget-object v0, v15, Lo0;->b:Lex;

    .line 1285
    .line 1286
    check-cast v0, Lhw;

    .line 1287
    .line 1288
    if-eqz v0, :cond_0

    .line 1289
    .line 1290
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v0

    .line 1294
    check-cast v0, Ljava/lang/Boolean;

    .line 1295
    .line 1296
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1297
    .line 1298
    .line 1299
    move-result v9

    .line 1300
    goto/16 :goto_40

    .line 1301
    .line 1302
    :cond_48
    move-wide/from16 p1, v0

    .line 1303
    .line 1304
    :cond_49
    sget-object v0, Lb01;->v:Le01;

    .line 1305
    .line 1306
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    if-nez v0, :cond_4a

    .line 1311
    .line 1312
    const/4 v0, 0x0

    .line 1313
    :cond_4a
    check-cast v0, Lhy0;

    .line 1314
    .line 1315
    if-eqz v0, :cond_0

    .line 1316
    .line 1317
    if-eqz v15, :cond_0

    .line 1318
    .line 1319
    if-eqz v10, :cond_4b

    .line 1320
    .line 1321
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 1322
    .line 1323
    .line 1324
    move-result v1

    .line 1325
    goto :goto_29

    .line 1326
    :cond_4b
    const-wide v3, 0xffffffffL

    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    and-long v3, p1, v3

    .line 1332
    .line 1333
    long-to-int v1, v3

    .line 1334
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1335
    .line 1336
    .line 1337
    move-result v1

    .line 1338
    :goto_29
    if-nez v7, :cond_4c

    .line 1339
    .line 1340
    if-eqz v2, :cond_4d

    .line 1341
    .line 1342
    :cond_4c
    neg-float v1, v1

    .line 1343
    :cond_4d
    invoke-static {v0, v1}, Lc4;->p(Lhy0;F)Z

    .line 1344
    .line 1345
    .line 1346
    move-result v0

    .line 1347
    if-eqz v0, :cond_0

    .line 1348
    .line 1349
    sget-object v0, Lrz0;->x:Le01;

    .line 1350
    .line 1351
    invoke-virtual {v13, v0}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 1352
    .line 1353
    .line 1354
    move-result v2

    .line 1355
    if-nez v2, :cond_4f

    .line 1356
    .line 1357
    sget-object v2, Lrz0;->z:Le01;

    .line 1358
    .line 1359
    invoke-virtual {v13, v2}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v2

    .line 1363
    if-eqz v2, :cond_4e

    .line 1364
    .line 1365
    goto :goto_2a

    .line 1366
    :cond_4e
    check-cast v11, Lww;

    .line 1367
    .line 1368
    if-eqz v11, :cond_0

    .line 1369
    .line 1370
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v0

    .line 1374
    invoke-interface {v11, v6, v0}, Lww;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v0

    .line 1378
    check-cast v0, Ljava/lang/Boolean;

    .line 1379
    .line 1380
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1381
    .line 1382
    .line 1383
    move-result v9

    .line 1384
    goto/16 :goto_40

    .line 1385
    .line 1386
    :cond_4f
    :goto_2a
    cmpl-float v1, v1, p0

    .line 1387
    .line 1388
    if-lez v1, :cond_51

    .line 1389
    .line 1390
    sget-object v0, Lrz0;->z:Le01;

    .line 1391
    .line 1392
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v0

    .line 1396
    if-nez v0, :cond_50

    .line 1397
    .line 1398
    const/4 v15, 0x0

    .line 1399
    goto :goto_2b

    .line 1400
    :cond_50
    move-object v15, v0

    .line 1401
    :goto_2b
    check-cast v15, Lo0;

    .line 1402
    .line 1403
    goto :goto_2d

    .line 1404
    :cond_51
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    if-nez v0, :cond_52

    .line 1409
    .line 1410
    const/4 v15, 0x0

    .line 1411
    goto :goto_2c

    .line 1412
    :cond_52
    move-object v15, v0

    .line 1413
    :goto_2c
    check-cast v15, Lo0;

    .line 1414
    .line 1415
    :goto_2d
    if-eqz v15, :cond_0

    .line 1416
    .line 1417
    iget-object v0, v15, Lo0;->b:Lex;

    .line 1418
    .line 1419
    check-cast v0, Lhw;

    .line 1420
    .line 1421
    if-eqz v0, :cond_0

    .line 1422
    .line 1423
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v0

    .line 1427
    check-cast v0, Ljava/lang/Boolean;

    .line 1428
    .line 1429
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1430
    .line 1431
    .line 1432
    move-result v9

    .line 1433
    goto/16 :goto_40

    .line 1434
    .line 1435
    :sswitch_a
    sget-object v0, Lrz0;->c:Le01;

    .line 1436
    .line 1437
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    if-nez v0, :cond_53

    .line 1442
    .line 1443
    const/4 v15, 0x0

    .line 1444
    goto :goto_2e

    .line 1445
    :cond_53
    move-object v15, v0

    .line 1446
    :goto_2e
    check-cast v15, Lo0;

    .line 1447
    .line 1448
    if-eqz v15, :cond_0

    .line 1449
    .line 1450
    iget-object v0, v15, Lo0;->b:Lex;

    .line 1451
    .line 1452
    check-cast v0, Lhw;

    .line 1453
    .line 1454
    if-eqz v0, :cond_0

    .line 1455
    .line 1456
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    check-cast v0, Ljava/lang/Boolean;

    .line 1461
    .line 1462
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1463
    .line 1464
    .line 1465
    move-result v9

    .line 1466
    goto/16 :goto_40

    .line 1467
    .line 1468
    :sswitch_b
    sget-object v1, Lrz0;->b:Le01;

    .line 1469
    .line 1470
    invoke-virtual {v13, v1}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1471
    .line 1472
    .line 1473
    move-result-object v1

    .line 1474
    if-nez v1, :cond_54

    .line 1475
    .line 1476
    const/4 v1, 0x0

    .line 1477
    :cond_54
    check-cast v1, Lo0;

    .line 1478
    .line 1479
    if-eqz v1, :cond_55

    .line 1480
    .line 1481
    iget-object v1, v1, Lo0;->b:Lex;

    .line 1482
    .line 1483
    check-cast v1, Lhw;

    .line 1484
    .line 1485
    if-eqz v1, :cond_55

    .line 1486
    .line 1487
    invoke-interface {v1}, Lhw;->invoke()Ljava/lang/Object;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v1

    .line 1491
    check-cast v1, Ljava/lang/Boolean;

    .line 1492
    .line 1493
    move-object/from16 v16, v1

    .line 1494
    .line 1495
    :goto_2f
    const/16 v1, 0xc

    .line 1496
    .line 1497
    const/4 v3, 0x0

    .line 1498
    goto :goto_30

    .line 1499
    :cond_55
    const/16 v16, 0x0

    .line 1500
    .line 1501
    goto :goto_2f

    .line 1502
    :goto_30
    invoke-static {v2, v0, v15, v3, v1}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 1503
    .line 1504
    .line 1505
    if-eqz v16, :cond_0

    .line 1506
    .line 1507
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1508
    .line 1509
    .line 1510
    move-result v9

    .line 1511
    goto/16 :goto_40

    .line 1512
    .line 1513
    :cond_56
    sget-object v0, Lb01;->k:Le01;

    .line 1514
    .line 1515
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    if-nez v0, :cond_57

    .line 1520
    .line 1521
    const/4 v0, 0x0

    .line 1522
    :cond_57
    invoke-static {v0, v5}, Lp30;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1523
    .line 1524
    .line 1525
    move-result v0

    .line 1526
    if-eqz v0, :cond_0

    .line 1527
    .line 1528
    invoke-virtual {v7}, Lw3;->getFocusOwner()Lwu;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    check-cast v0, Lzu;

    .line 1533
    .line 1534
    const/16 v1, 0x8

    .line 1535
    .line 1536
    const/4 v11, 0x0

    .line 1537
    invoke-virtual {v0, v1, v11, v15}, Lzu;->b(IZZ)Z

    .line 1538
    .line 1539
    .line 1540
    goto/16 :goto_11

    .line 1541
    .line 1542
    :cond_58
    invoke-virtual {v7}, Landroid/view/View;->isInTouchMode()Z

    .line 1543
    .line 1544
    .line 1545
    move-result v0

    .line 1546
    if-eqz v0, :cond_59

    .line 1547
    .line 1548
    invoke-virtual {v7}, Landroid/view/View;->requestFocusFromTouch()Z

    .line 1549
    .line 1550
    .line 1551
    :cond_59
    sget-object v0, Lrz0;->v:Le01;

    .line 1552
    .line 1553
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v0

    .line 1557
    if-nez v0, :cond_5a

    .line 1558
    .line 1559
    const/4 v15, 0x0

    .line 1560
    goto :goto_31

    .line 1561
    :cond_5a
    move-object v15, v0

    .line 1562
    :goto_31
    check-cast v15, Lo0;

    .line 1563
    .line 1564
    if-eqz v15, :cond_0

    .line 1565
    .line 1566
    iget-object v0, v15, Lo0;->b:Lex;

    .line 1567
    .line 1568
    check-cast v0, Lhw;

    .line 1569
    .line 1570
    if-eqz v0, :cond_0

    .line 1571
    .line 1572
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v0

    .line 1576
    check-cast v0, Ljava/lang/Boolean;

    .line 1577
    .line 1578
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1579
    .line 1580
    .line 1581
    move-result v9

    .line 1582
    goto/16 :goto_40

    .line 1583
    .line 1584
    :cond_5b
    if-eqz v3, :cond_5c

    .line 1585
    .line 1586
    const-string v0, "ACTION_ARGUMENT_SELECTION_START_INT"

    .line 1587
    .line 1588
    invoke-virtual {v3, v0, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1589
    .line 1590
    .line 1591
    move-result v0

    .line 1592
    goto :goto_32

    .line 1593
    :cond_5c
    move v0, v14

    .line 1594
    :goto_32
    if-eqz v3, :cond_5d

    .line 1595
    .line 1596
    const-string v1, "ACTION_ARGUMENT_SELECTION_END_INT"

    .line 1597
    .line 1598
    invoke-virtual {v3, v1, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 1599
    .line 1600
    .line 1601
    move-result v14

    .line 1602
    :cond_5d
    const/4 v1, 0x0

    .line 1603
    invoke-virtual {v2, v11, v0, v14, v1}, Lc4;->C(Lxz0;IIZ)Z

    .line 1604
    .line 1605
    .line 1606
    move-result v0

    .line 1607
    if-eqz v0, :cond_5e

    .line 1608
    .line 1609
    invoke-virtual {v2, v10}, Lc4;->s(I)I

    .line 1610
    .line 1611
    .line 1612
    move-result v3

    .line 1613
    const/16 v4, 0xc

    .line 1614
    .line 1615
    const/4 v5, 0x0

    .line 1616
    invoke-static {v2, v3, v1, v5, v4}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 1617
    .line 1618
    .line 1619
    :cond_5e
    move v9, v0

    .line 1620
    goto/16 :goto_40

    .line 1621
    .line 1622
    :cond_5f
    sget-object v0, Lrz0;->p:Le01;

    .line 1623
    .line 1624
    invoke-virtual {v13, v0}, Ljh0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    if-nez v0, :cond_60

    .line 1629
    .line 1630
    const/4 v15, 0x0

    .line 1631
    goto :goto_33

    .line 1632
    :cond_60
    move-object v15, v0

    .line 1633
    :goto_33
    check-cast v15, Lo0;

    .line 1634
    .line 1635
    if-eqz v15, :cond_0

    .line 1636
    .line 1637
    iget-object v0, v15, Lo0;->b:Lex;

    .line 1638
    .line 1639
    check-cast v0, Lhw;

    .line 1640
    .line 1641
    if-eqz v0, :cond_0

    .line 1642
    .line 1643
    invoke-interface {v0}, Lhw;->invoke()Ljava/lang/Object;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v0

    .line 1647
    check-cast v0, Ljava/lang/Boolean;

    .line 1648
    .line 1649
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1650
    .line 1651
    .line 1652
    move-result v9

    .line 1653
    goto/16 :goto_40

    .line 1654
    .line 1655
    :cond_61
    if-eqz v3, :cond_0

    .line 1656
    .line 1657
    const-string v0, "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"

    .line 1658
    .line 1659
    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 1660
    .line 1661
    .line 1662
    move-result v0

    .line 1663
    const-string v5, "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"

    .line 1664
    .line 1665
    invoke-virtual {v3, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 1666
    .line 1667
    .line 1668
    move-result v3

    .line 1669
    if-ne v1, v4, :cond_62

    .line 1670
    .line 1671
    move v1, v15

    .line 1672
    goto :goto_34

    .line 1673
    :cond_62
    const/4 v1, 0x0

    .line 1674
    :goto_34
    iget-object v5, v2, Lc4;->y:Ljava/lang/Integer;

    .line 1675
    .line 1676
    if-nez v5, :cond_63

    .line 1677
    .line 1678
    goto :goto_35

    .line 1679
    :cond_63
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1680
    .line 1681
    .line 1682
    move-result v5

    .line 1683
    if-eq v10, v5, :cond_64

    .line 1684
    .line 1685
    :goto_35
    iput v14, v2, Lc4;->x:I

    .line 1686
    .line 1687
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v5

    .line 1691
    iput-object v5, v2, Lc4;->y:Ljava/lang/Integer;

    .line 1692
    .line 1693
    :cond_64
    invoke-static {v11}, Lc4;->l(Lxz0;)Ljava/lang/String;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v5

    .line 1697
    if-eqz v5, :cond_0

    .line 1698
    .line 1699
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1700
    .line 1701
    .line 1702
    move-result v6

    .line 1703
    if-nez v6, :cond_65

    .line 1704
    .line 1705
    goto/16 :goto_0

    .line 1706
    .line 1707
    :cond_65
    invoke-static {v11}, Lc4;->l(Lxz0;)Ljava/lang/String;

    .line 1708
    .line 1709
    .line 1710
    move-result-object v6

    .line 1711
    if-eqz v6, :cond_67

    .line 1712
    .line 1713
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 1714
    .line 1715
    .line 1716
    move-result v8

    .line 1717
    if-nez v8, :cond_66

    .line 1718
    .line 1719
    goto :goto_36

    .line 1720
    :cond_66
    if-eq v0, v15, :cond_72

    .line 1721
    .line 1722
    const/4 v8, 0x2

    .line 1723
    if-eq v0, v8, :cond_70

    .line 1724
    .line 1725
    const/4 v7, 0x4

    .line 1726
    if-eq v0, v7, :cond_6a

    .line 1727
    .line 1728
    const/16 v8, 0x8

    .line 1729
    .line 1730
    if-eq v0, v8, :cond_68

    .line 1731
    .line 1732
    const/16 v8, 0x10

    .line 1733
    .line 1734
    if-eq v0, v8, :cond_6a

    .line 1735
    .line 1736
    :cond_67
    :goto_36
    const/4 v7, 0x0

    .line 1737
    goto/16 :goto_37

    .line 1738
    .line 1739
    :cond_68
    sget-object v7, Lw0;->c:Lw0;

    .line 1740
    .line 1741
    if-nez v7, :cond_69

    .line 1742
    .line 1743
    new-instance v7, Lw0;

    .line 1744
    .line 1745
    invoke-direct {v7}, Lt0;-><init>()V

    .line 1746
    .line 1747
    .line 1748
    sput-object v7, Lw0;->c:Lw0;

    .line 1749
    .line 1750
    :cond_69
    sget-object v7, Lw0;->c:Lw0;

    .line 1751
    .line 1752
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1753
    .line 1754
    .line 1755
    iput-object v6, v7, Lt0;->a:Ljava/lang/String;

    .line 1756
    .line 1757
    goto/16 :goto_37

    .line 1758
    .line 1759
    :cond_6a
    sget-object v8, Lrz0;->a:Le01;

    .line 1760
    .line 1761
    invoke-virtual {v13, v8}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 1762
    .line 1763
    .line 1764
    move-result v8

    .line 1765
    if-nez v8, :cond_6b

    .line 1766
    .line 1767
    goto :goto_36

    .line 1768
    :cond_6b
    invoke-static {v12}, Lu50;->p(Lsz0;)Lg71;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v8

    .line 1772
    if-nez v8, :cond_6c

    .line 1773
    .line 1774
    goto :goto_36

    .line 1775
    :cond_6c
    if-ne v0, v7, :cond_6e

    .line 1776
    .line 1777
    sget-object v7, Lu0;->g:Lu0;

    .line 1778
    .line 1779
    if-nez v7, :cond_6d

    .line 1780
    .line 1781
    new-instance v7, Lu0;

    .line 1782
    .line 1783
    const/4 v10, 0x2

    .line 1784
    invoke-direct {v7, v10}, Lu0;-><init>(I)V

    .line 1785
    .line 1786
    .line 1787
    sput-object v7, Lu0;->g:Lu0;

    .line 1788
    .line 1789
    :cond_6d
    sget-object v7, Lu0;->g:Lu0;

    .line 1790
    .line 1791
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1792
    .line 1793
    .line 1794
    iput-object v6, v7, Lt0;->a:Ljava/lang/String;

    .line 1795
    .line 1796
    iput-object v8, v7, Lu0;->d:Ljava/lang/Object;

    .line 1797
    .line 1798
    goto :goto_37

    .line 1799
    :cond_6e
    sget-object v7, Lv0;->e:Lv0;

    .line 1800
    .line 1801
    if-nez v7, :cond_6f

    .line 1802
    .line 1803
    new-instance v7, Lv0;

    .line 1804
    .line 1805
    invoke-direct {v7}, Lt0;-><init>()V

    .line 1806
    .line 1807
    .line 1808
    new-instance v10, Landroid/graphics/Rect;

    .line 1809
    .line 1810
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 1811
    .line 1812
    .line 1813
    sput-object v7, Lv0;->e:Lv0;

    .line 1814
    .line 1815
    :cond_6f
    sget-object v7, Lv0;->e:Lv0;

    .line 1816
    .line 1817
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1818
    .line 1819
    .line 1820
    iput-object v6, v7, Lt0;->a:Ljava/lang/String;

    .line 1821
    .line 1822
    iput-object v8, v7, Lv0;->c:Lg71;

    .line 1823
    .line 1824
    iput-object v11, v7, Lv0;->d:Lxz0;

    .line 1825
    .line 1826
    goto :goto_37

    .line 1827
    :cond_70
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v7

    .line 1831
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1832
    .line 1833
    .line 1834
    move-result-object v7

    .line 1835
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v7

    .line 1839
    iget-object v7, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1840
    .line 1841
    sget-object v8, Lu0;->f:Lu0;

    .line 1842
    .line 1843
    if-nez v8, :cond_71

    .line 1844
    .line 1845
    new-instance v8, Lu0;

    .line 1846
    .line 1847
    invoke-direct {v8, v15}, Lu0;-><init>(I)V

    .line 1848
    .line 1849
    .line 1850
    invoke-static {v7}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v7

    .line 1854
    iput-object v7, v8, Lu0;->d:Ljava/lang/Object;

    .line 1855
    .line 1856
    sput-object v8, Lu0;->f:Lu0;

    .line 1857
    .line 1858
    :cond_71
    sget-object v7, Lu0;->f:Lu0;

    .line 1859
    .line 1860
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    invoke-virtual {v7, v6}, Lu0;->f(Ljava/lang/String;)V

    .line 1864
    .line 1865
    .line 1866
    goto :goto_37

    .line 1867
    :cond_72
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v7

    .line 1871
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v7

    .line 1875
    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v7

    .line 1879
    iget-object v7, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 1880
    .line 1881
    sget-object v8, Lu0;->e:Lu0;

    .line 1882
    .line 1883
    if-nez v8, :cond_73

    .line 1884
    .line 1885
    new-instance v8, Lu0;

    .line 1886
    .line 1887
    const/4 v10, 0x0

    .line 1888
    invoke-direct {v8, v10}, Lu0;-><init>(I)V

    .line 1889
    .line 1890
    .line 1891
    invoke-static {v7}, Ljava/text/BreakIterator;->getCharacterInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    .line 1892
    .line 1893
    .line 1894
    move-result-object v7

    .line 1895
    iput-object v7, v8, Lu0;->d:Ljava/lang/Object;

    .line 1896
    .line 1897
    sput-object v8, Lu0;->e:Lu0;

    .line 1898
    .line 1899
    :cond_73
    sget-object v7, Lu0;->e:Lu0;

    .line 1900
    .line 1901
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1902
    .line 1903
    .line 1904
    invoke-virtual {v7, v6}, Lu0;->f(Ljava/lang/String;)V

    .line 1905
    .line 1906
    .line 1907
    :goto_37
    if-nez v7, :cond_74

    .line 1908
    .line 1909
    goto/16 :goto_0

    .line 1910
    .line 1911
    :cond_74
    invoke-virtual {v2, v11}, Lc4;->i(Lxz0;)I

    .line 1912
    .line 1913
    .line 1914
    move-result v6

    .line 1915
    if-ne v6, v14, :cond_76

    .line 1916
    .line 1917
    if-eqz v1, :cond_75

    .line 1918
    .line 1919
    const/4 v5, 0x0

    .line 1920
    goto :goto_38

    .line 1921
    :cond_75
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1922
    .line 1923
    .line 1924
    move-result v5

    .line 1925
    :goto_38
    move v6, v5

    .line 1926
    :cond_76
    if-eqz v1, :cond_77

    .line 1927
    .line 1928
    invoke-virtual {v7, v6}, Lt0;->a(I)[I

    .line 1929
    .line 1930
    .line 1931
    move-result-object v5

    .line 1932
    goto :goto_39

    .line 1933
    :cond_77
    invoke-virtual {v7, v6}, Lt0;->d(I)[I

    .line 1934
    .line 1935
    .line 1936
    move-result-object v5

    .line 1937
    :goto_39
    if-nez v5, :cond_78

    .line 1938
    .line 1939
    goto/16 :goto_0

    .line 1940
    .line 1941
    :cond_78
    const/16 v17, 0x0

    .line 1942
    .line 1943
    aget v6, v5, v17

    .line 1944
    .line 1945
    aget v5, v5, v15

    .line 1946
    .line 1947
    if-eqz v3, :cond_7c

    .line 1948
    .line 1949
    sget-object v3, Lb01;->a:Le01;

    .line 1950
    .line 1951
    invoke-virtual {v13, v3}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 1952
    .line 1953
    .line 1954
    move-result v3

    .line 1955
    if-nez v3, :cond_7c

    .line 1956
    .line 1957
    sget-object v3, Lb01;->E:Le01;

    .line 1958
    .line 1959
    invoke-virtual {v13, v3}, Ljh0;->c(Ljava/lang/Object;)Z

    .line 1960
    .line 1961
    .line 1962
    move-result v3

    .line 1963
    if-eqz v3, :cond_7c

    .line 1964
    .line 1965
    invoke-virtual {v2, v11}, Lc4;->j(Lxz0;)I

    .line 1966
    .line 1967
    .line 1968
    move-result v3

    .line 1969
    if-ne v3, v14, :cond_7a

    .line 1970
    .line 1971
    if-eqz v1, :cond_79

    .line 1972
    .line 1973
    move v3, v6

    .line 1974
    goto :goto_3a

    .line 1975
    :cond_79
    move v3, v5

    .line 1976
    :cond_7a
    :goto_3a
    if-eqz v1, :cond_7b

    .line 1977
    .line 1978
    move v7, v5

    .line 1979
    goto :goto_3c

    .line 1980
    :cond_7b
    move v7, v6

    .line 1981
    goto :goto_3c

    .line 1982
    :cond_7c
    if-eqz v1, :cond_7d

    .line 1983
    .line 1984
    move v3, v5

    .line 1985
    goto :goto_3b

    .line 1986
    :cond_7d
    move v3, v6

    .line 1987
    :goto_3b
    move v7, v3

    .line 1988
    :goto_3c
    if-eqz v1, :cond_7e

    .line 1989
    .line 1990
    move v12, v4

    .line 1991
    goto :goto_3d

    .line 1992
    :cond_7e
    move v12, v9

    .line 1993
    :goto_3d
    new-instance v10, Ly3;

    .line 1994
    .line 1995
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1996
    .line 1997
    .line 1998
    move-result-wide v16

    .line 1999
    move v13, v0

    .line 2000
    move v14, v6

    .line 2001
    move v1, v15

    .line 2002
    move v15, v5

    .line 2003
    invoke-direct/range {v10 .. v17}, Ly3;-><init>(Lxz0;IIIIJ)V

    .line 2004
    .line 2005
    .line 2006
    iput-object v10, v2, Lc4;->C:Ly3;

    .line 2007
    .line 2008
    invoke-virtual {v2, v11, v3, v7, v1}, Lc4;->C(Lxz0;IIZ)Z

    .line 2009
    .line 2010
    .line 2011
    :goto_3e
    move v9, v1

    .line 2012
    goto :goto_40

    .line 2013
    :cond_7f
    move v1, v15

    .line 2014
    const/16 v17, 0x0

    .line 2015
    .line 2016
    iget v3, v2, Lc4;->o:I

    .line 2017
    .line 2018
    if-ne v3, v0, :cond_80

    .line 2019
    .line 2020
    iput v14, v2, Lc4;->o:I

    .line 2021
    .line 2022
    const/4 v3, 0x0

    .line 2023
    iput-object v3, v2, Lc4;->q:Le1;

    .line 2024
    .line 2025
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    .line 2026
    .line 2027
    .line 2028
    const/high16 v5, 0x10000

    .line 2029
    .line 2030
    const/16 v6, 0xc

    .line 2031
    .line 2032
    invoke-static {v2, v0, v5, v3, v6}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 2033
    .line 2034
    .line 2035
    goto :goto_3e

    .line 2036
    :cond_80
    :goto_3f
    move/from16 v9, v17

    .line 2037
    .line 2038
    goto :goto_40

    .line 2039
    :cond_81
    move v1, v15

    .line 2040
    const/4 v3, 0x0

    .line 2041
    const/high16 v5, 0x10000

    .line 2042
    .line 2043
    const/16 v6, 0xc

    .line 2044
    .line 2045
    const/16 v17, 0x0

    .line 2046
    .line 2047
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 2048
    .line 2049
    .line 2050
    move-result v8

    .line 2051
    if-eqz v8, :cond_80

    .line 2052
    .line 2053
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 2054
    .line 2055
    .line 2056
    move-result v4

    .line 2057
    if-eqz v4, :cond_80

    .line 2058
    .line 2059
    iget v4, v2, Lc4;->o:I

    .line 2060
    .line 2061
    if-ne v4, v0, :cond_82

    .line 2062
    .line 2063
    goto :goto_3f

    .line 2064
    :cond_82
    if-eq v4, v14, :cond_83

    .line 2065
    .line 2066
    invoke-static {v2, v4, v5, v3, v6}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 2067
    .line 2068
    .line 2069
    :cond_83
    iput v0, v2, Lc4;->o:I

    .line 2070
    .line 2071
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    .line 2072
    .line 2073
    .line 2074
    const v4, 0x8000

    .line 2075
    .line 2076
    .line 2077
    invoke-static {v2, v0, v4, v3, v6}, Lc4;->w(Lc4;IILjava/lang/Integer;I)V

    .line 2078
    .line 2079
    .line 2080
    goto :goto_3e

    .line 2081
    :goto_40
    return v9

    .line 2082
    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_b
        0x20 -> :sswitch_a
        0x1000 -> :sswitch_9
        0x2000 -> :sswitch_9
        0x8000 -> :sswitch_8
        0x10000 -> :sswitch_7
        0x40000 -> :sswitch_6
        0x80000 -> :sswitch_5
        0x100000 -> :sswitch_4
        0x200000 -> :sswitch_3
        0x1020036 -> :sswitch_2
        0x102003d -> :sswitch_1
        0x1020054 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1020038
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1020046
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
