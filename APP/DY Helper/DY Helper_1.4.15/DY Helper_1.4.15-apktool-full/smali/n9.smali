.class public final synthetic Ln9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Ln9;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Ln9;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ln9;->ε:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v10, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 14
    .line 15
    :try_start_0
    invoke-static {}, Lx9;->ζ()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const-string v0, "\u8425\u5730\u7ba1\u7406\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 22
    .line 23
    invoke-static {v10, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v0, Lx01;->α:Lx01;

    .line 34
    .line 35
    invoke-virtual {v0, v10}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const v1, 0x7f0c0032

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v11

    .line 46
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 50
    .line 51
    invoke-direct {v0, v10}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v11}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v10, v11, v8}, Lxn0;->π(Landroid/app/Activity;Landroid/view/View;Landroid/app/AlertDialog;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8}, Landroid/app/Dialog;->show()V

    .line 69
    .line 70
    .line 71
    const v0, 0x3f5c28f6    # 0.86f

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const v1, 0x3f70a3d7    # 0.94f

    .line 79
    .line 80
    .line 81
    invoke-static {v10, v8, v1, v0}, Lxn0;->φ(Landroid/app/Activity;Landroid/app/AlertDialog;FLjava/lang/Float;)V

    .line 82
    .line 83
    .line 84
    new-instance v13, Landroid/os/Handler;

    .line 85
    .line 86
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {v13, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 91
    .line 92
    .line 93
    new-instance v9, Lum1;

    .line 94
    .line 95
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 96
    .line 97
    .line 98
    new-instance v12, Lum1;

    .line 99
    .line 100
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    new-instance v7, Lub1;

    .line 104
    .line 105
    invoke-direct/range {v7 .. v13}, Lub1;-><init>(Landroid/app/AlertDialog;Lum1;Landroid/app/Activity;Landroid/view/View;Lum1;Landroid/os/Handler;)V

    .line 106
    .line 107
    .line 108
    new-instance v0, Lj9;

    .line 109
    .line 110
    invoke-direct {v0, v13, v3, v7}, Lj9;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v13, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :goto_0
    sget-object v1, Lxq0;->α:Lxq0;

    .line 121
    .line 122
    const-string v3, "DYHelper: \u6253\u5f00\u8425\u5730\u7ba1\u7406\u754c\u9762\u5931\u8d25"

    .line 123
    .line 124
    invoke-virtual {v1, v3}, Lxq0;->η(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v0}, Lxq0;->θ(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-nez v0, :cond_1

    .line 135
    .line 136
    const-string v0, ""

    .line 137
    .line 138
    :cond_1
    const-string v1, "\u6253\u5f00\u8425\u5730\u7ba1\u7406\u5931\u8d25: "

    .line 139
    .line 140
    invoke-static {v2, v10, v1, v0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_1
    return-void

    .line 144
    :pswitch_0
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 145
    .line 146
    :try_start_1
    sget-object v0, Lq71;->α:Lq71;

    .line 147
    .line 148
    invoke-static {}, Lq71;->Ε()Lf8;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0, v1}, Lq71;->ν(Lf8;Landroid/app/Activity;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :catchall_1
    move-exception v0

    .line 157
    const-string v2, "DYHelper"

    .line 158
    .line 159
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    const-string v3, "OperationDialog downloadCurrentWork failed: "

    .line 164
    .line 165
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v2, v0, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    const-string v0, "\u4e0b\u8f7d\u4f5c\u54c1\u5931\u8d25"

    .line 173
    .line 174
    invoke-static {v1, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 179
    .line 180
    .line 181
    :goto_2
    return-void

    .line 182
    :pswitch_1
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 183
    .line 184
    sget-object v1, Lq71;->α:Lq71;

    .line 185
    .line 186
    const-string v1, "\u6dfb\u52a0\u4f5c\u8005\u4e3b\u9875\u4e66\u7b7e"

    .line 187
    .line 188
    new-instance v2, Lf9;

    .line 189
    .line 190
    const/16 v3, 0xa

    .line 191
    .line 192
    invoke-direct {v2, v0, v3}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 193
    .line 194
    .line 195
    invoke-static {v0, v1, v2}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_2
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 200
    .line 201
    sget-object v1, Lbv1;->α:Lbv1;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    new-instance v1, Lhg1;

    .line 207
    .line 208
    const/16 v2, 0x8

    .line 209
    .line 210
    invoke-direct {v1, v0, v2}, Lhg1;-><init>(Landroid/app/Activity;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :pswitch_3
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 218
    .line 219
    sget-object v1, Lq71;->α:Lq71;

    .line 220
    .line 221
    const-string v1, "\u6dfb\u52a0\u4f5c\u54c1\u4e66\u7b7e"

    .line 222
    .line 223
    new-instance v2, Lf9;

    .line 224
    .line 225
    const/16 v3, 0x12

    .line 226
    .line 227
    invoke-direct {v2, v0, v3}, Lf9;-><init>(Landroid/app/Activity;I)V

    .line 228
    .line 229
    .line 230
    invoke-static {v0, v1, v2}, Lq71;->Ρ(Landroid/app/Activity;Ljava/lang/String;La80;)V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :pswitch_4
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 235
    .line 236
    :try_start_2
    sget-object v0, Lq71;->α:Lq71;

    .line 237
    .line 238
    invoke-static {}, Lq71;->Ε()Lf8;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Lf8;->ι()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_2

    .line 247
    .line 248
    sget-object v2, Lqy0;->α:Lqy0;

    .line 249
    .line 250
    invoke-virtual {v2, v0, v1}, Lqy0;->Γ(Lf8;Landroid/app/Activity;)V

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :catchall_2
    move-exception v0

    .line 255
    goto :goto_3

    .line 256
    :cond_2
    const-string v0, "\u672a\u627e\u5230\u53ef\u4e0b\u8f7d\u7684\u97f3\u9891"

    .line 257
    .line 258
    invoke-static {v1, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 263
    .line 264
    .line 265
    goto :goto_4

    .line 266
    :goto_3
    const-string v2, "DYHelper"

    .line 267
    .line 268
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    const-string v3, "OperationDialog downloadCurrentAudio failed: "

    .line 273
    .line 274
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    invoke-static {v2, v0, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    const-string v0, "\u4e0b\u8f7d\u97f3\u9891\u5931\u8d25"

    .line 282
    .line 283
    invoke-static {v1, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 288
    .line 289
    .line 290
    :goto_4
    return-void

    .line 291
    :pswitch_5
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 292
    .line 293
    const-string v2, "DYHelper"

    .line 294
    .line 295
    sget-object v3, Lq71;->α:Lq71;

    .line 296
    .line 297
    :try_start_3
    invoke-virtual {v3, v1}, Lq71;->Λ(Landroid/app/Activity;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 298
    .line 299
    .line 300
    goto :goto_5

    .line 301
    :catchall_3
    move-exception v0

    .line 302
    move-object v4, v0

    .line 303
    const-string v0, "\u64cd\u4f5c\u83dc\u5355 XML UI \u6253\u5f00\u5931\u8d25\uff0c\u6539\u7528\u7eaf\u4ee3\u7801\u9762\u677f"

    .line 304
    .line 305
    invoke-static {v2, v0, v4}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    :try_start_4
    invoke-virtual {v3, v1}, Lq71;->Κ(Landroid/app/Activity;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 309
    .line 310
    .line 311
    goto :goto_5

    .line 312
    :catchall_4
    move-exception v0

    .line 313
    invoke-static {v0, v4}, Lln0;->η(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    const-string v3, "\u64cd\u4f5c\u83dc\u5355\u964d\u7ea7 UI \u6253\u5f00\u5931\u8d25"

    .line 317
    .line 318
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 319
    .line 320
    .line 321
    const-string v2, "\u64cd\u4f5c\u83dc\u5355"

    .line 322
    .line 323
    invoke-static {v1, v2, v0}, Lu81;->ο(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    :goto_5
    return-void

    .line 327
    :pswitch_6
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 328
    .line 329
    :try_start_5
    new-instance v0, Lli0;

    .line 330
    .line 331
    invoke-direct {v0, v1}, Lli0;-><init>(Landroid/app/Activity;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, Lli0;->η()V

    .line 335
    .line 336
    .line 337
    sget-object v0, Ls62;->α:Ls62;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :catchall_5
    move-exception v0

    .line 341
    new-instance v2, Leo1;

    .line 342
    .line 343
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 344
    .line 345
    .line 346
    move-object v0, v2

    .line 347
    :goto_6
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    if-eqz v0, :cond_3

    .line 352
    .line 353
    const-string v2, "r846626a90309cae8"

    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-static {v0}, Lmi0;->α(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    const-string v5, "\u6253\u5f00\u6279\u91cf\u5220\u9664\u4f1a\u8bdd\u5f39\u7a97\u5931\u8d25 type="

    .line 368
    .line 369
    const-string v7, ", message="

    .line 370
    .line 371
    invoke-static {v5, v3, v7, v4}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 376
    .line 377
    .line 378
    invoke-static {v0}, Lmi0;->α(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    const-string v2, "\u6253\u5f00\u4f1a\u8bdd\u5220\u9664\u5217\u8868\u5931\u8d25\uff1a"

    .line 383
    .line 384
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v1, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 393
    .line 394
    .line 395
    :cond_3
    return-void

    .line 396
    :pswitch_7
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 397
    .line 398
    const-string v1, "\u4f1a\u8bdd\u6279\u91cf\u5220\u9664\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 399
    .line 400
    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :pswitch_8
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 409
    .line 410
    :try_start_6
    invoke-static {v1}, Lbd;->е(Landroid/app/Activity;)V

    .line 411
    .line 412
    .line 413
    sget-object v0, Ls62;->α:Ls62;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 414
    .line 415
    goto :goto_7

    .line 416
    :catchall_6
    move-exception v0

    .line 417
    new-instance v2, Leo1;

    .line 418
    .line 419
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 420
    .line 421
    .line 422
    move-object v0, v2

    .line 423
    :goto_7
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    if-eqz v0, :cond_4

    .line 428
    .line 429
    const-string v2, "r84e9ffe40b72d3"

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    const-string v4, "\u5207\u6362\u9690\u85cf\u8054\u7cfb\u4eba\u72b6\u6001\u5931\u8d25: "

    .line 436
    .line 437
    invoke-static {v4, v3, v2, v0}, Lnx;->ω(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 438
    .line 439
    .line 440
    const-string v0, "\u9690\u85cf\u8054\u7cfb\u4eba\u72b6\u6001\u5207\u6362\u5931\u8d25"

    .line 441
    .line 442
    invoke-static {v1, v0}, Lbd;->б(Landroid/app/Activity;Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    :cond_4
    return-void

    .line 446
    :pswitch_9
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 447
    .line 448
    const-string v1, "\u9690\u85cf\u8054\u7cfb\u4eba\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 449
    .line 450
    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 451
    .line 452
    .line 453
    move-result-object v0

    .line 454
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 455
    .line 456
    .line 457
    return-void

    .line 458
    :pswitch_a
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 459
    .line 460
    :try_start_7
    new-instance v0, Ldc0;

    .line 461
    .line 462
    invoke-direct {v0, v1}, Ldc0;-><init>(Landroid/app/Activity;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0}, Ldc0;->ε()V

    .line 466
    .line 467
    .line 468
    sget-object v0, Ls62;->α:Ls62;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 469
    .line 470
    goto :goto_8

    .line 471
    :catchall_7
    move-exception v0

    .line 472
    new-instance v2, Leo1;

    .line 473
    .line 474
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 475
    .line 476
    .line 477
    move-object v0, v2

    .line 478
    :goto_8
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    if-eqz v0, :cond_5

    .line 483
    .line 484
    const-string v2, "rd4acaeee73d4cda0"

    .line 485
    .line 486
    invoke-static {v0}, Lec0;->α(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v3

    .line 490
    const-string v4, "\u6253\u5f00\u7fa4\u7ba1\u7406\u5f39\u7a97\u5931\u8d25\uff1a"

    .line 491
    .line 492
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 497
    .line 498
    .line 499
    invoke-static {v0}, Lec0;->α(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    const-string v2, "\u6253\u5f00\u7fa4\u7ba1\u7406\u5931\u8d25\uff1a"

    .line 504
    .line 505
    invoke-static {v6, v1, v2, v0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    :cond_5
    return-void

    .line 509
    :pswitch_b
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 510
    .line 511
    const-string v1, "\u7fa4\u7ba1\u7406\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 512
    .line 513
    invoke-static {v0, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :pswitch_c
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 522
    .line 523
    sget-object v1, Lx10;->α:Lx10;

    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    new-instance v1, Ln9;

    .line 529
    .line 530
    const/4 v2, 0x5

    .line 531
    invoke-direct {v1, v0, v2}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 535
    .line 536
    .line 537
    return-void

    .line 538
    :pswitch_d
    iget-object v9, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 539
    .line 540
    :try_start_8
    invoke-static {}, Lui1;->Α()Z

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    if-nez v0, :cond_6

    .line 545
    .line 546
    invoke-static {v9}, Lui1;->π(Landroid/content/Context;)V

    .line 547
    .line 548
    .line 549
    goto :goto_9

    .line 550
    :catchall_8
    move-exception v0

    .line 551
    goto/16 :goto_b

    .line 552
    .line 553
    :cond_6
    :goto_9
    sget-object v0, Lia0;->α:Landroid/app/AlertDialog;

    .line 554
    .line 555
    if-eqz v0, :cond_7

    .line 556
    .line 557
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 558
    .line 559
    .line 560
    :cond_7
    sget-object v0, Lx01;->α:Lx01;

    .line 561
    .line 562
    invoke-virtual {v0, v9}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    const v1, 0x7f0c0027

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0, v1, v5, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    invoke-static {v9}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 577
    .line 578
    .line 579
    move-result-object v15

    .line 580
    iget-object v1, v15, Lxx;->β:Ljava/lang/String;

    .line 581
    .line 582
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 583
    .line 584
    .line 585
    move-result v7

    .line 586
    const/high16 v8, 0x41600000    # 14.0f

    .line 587
    .line 588
    invoke-static {v8, v7, v0}, Lia0;->ε(FILandroid/view/View;)V

    .line 589
    .line 590
    .line 591
    const/4 v7, 0x7

    .line 592
    new-array v8, v7, [I

    .line 593
    .line 594
    fill-array-data v8, :array_0

    .line 595
    .line 596
    .line 597
    move v10, v6

    .line 598
    :goto_a
    if-ge v10, v7, :cond_9

    .line 599
    .line 600
    aget v11, v8, v10

    .line 601
    .line 602
    invoke-virtual {v0, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    if-eqz v11, :cond_8

    .line 607
    .line 608
    iget-object v12, v15, Lxx;->γ:Ljava/lang/String;

    .line 609
    .line 610
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 611
    .line 612
    .line 613
    move-result v12

    .line 614
    const/high16 v13, 0x41200000    # 10.0f

    .line 615
    .line 616
    invoke-static {v13, v12, v11}, Lia0;->ε(FILandroid/view/View;)V

    .line 617
    .line 618
    .line 619
    :cond_8
    add-int/lit8 v10, v10, 0x1

    .line 620
    .line 621
    goto :goto_a

    .line 622
    :cond_9
    const v7, 0x7f090151

    .line 623
    .line 624
    .line 625
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 626
    .line 627
    .line 628
    move-result-object v8

    .line 629
    if-eqz v8, :cond_a

    .line 630
    .line 631
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    iget-object v10, v15, Lxx;->δ:Ljava/lang/String;

    .line 636
    .line 637
    invoke-static {v10}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 638
    .line 639
    .line 640
    move-result v10

    .line 641
    const/high16 v11, 0x3f800000    # 1.0f

    .line 642
    .line 643
    invoke-static {v8, v1, v10, v11}, Lia0;->ζ(Landroid/view/View;IIF)V

    .line 644
    .line 645
    .line 646
    :cond_a
    const v1, 0x7f0902cc

    .line 647
    .line 648
    .line 649
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 650
    .line 651
    .line 652
    move-result-object v1

    .line 653
    if-eqz v1, :cond_b

    .line 654
    .line 655
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackgroundColor(I)V

    .line 656
    .line 657
    .line 658
    :cond_b
    invoke-static {v0, v15}, Lia0;->α(Landroid/view/View;Lxx;)V

    .line 659
    .line 660
    .line 661
    const v1, 0x7f090343

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    check-cast v1, Landroid/widget/TextView;

    .line 669
    .line 670
    const v8, 0x7f090346

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 674
    .line 675
    .line 676
    move-result-object v8

    .line 677
    move-object/from16 v18, v8

    .line 678
    .line 679
    check-cast v18, Landroid/widget/TextView;

    .line 680
    .line 681
    const v8, 0x7f090367

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 685
    .line 686
    .line 687
    move-result-object v8

    .line 688
    move-object v10, v8

    .line 689
    check-cast v10, Landroid/widget/TextView;

    .line 690
    .line 691
    const v8, 0x7f090369

    .line 692
    .line 693
    .line 694
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 695
    .line 696
    .line 697
    move-result-object v8

    .line 698
    move-object v11, v8

    .line 699
    check-cast v11, Landroid/widget/TextView;

    .line 700
    .line 701
    const v8, 0x7f09036e

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 705
    .line 706
    .line 707
    move-result-object v8

    .line 708
    move-object/from16 v16, v8

    .line 709
    .line 710
    check-cast v16, Landroid/widget/TextView;

    .line 711
    .line 712
    const v8, 0x7f09026c

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 716
    .line 717
    .line 718
    move-result-object v8

    .line 719
    check-cast v8, Landroid/widget/LinearLayout;

    .line 720
    .line 721
    const v12, 0x7f0902d0

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 725
    .line 726
    .line 727
    move-result-object v12

    .line 728
    move-object v13, v12

    .line 729
    check-cast v13, Landroid/widget/Switch;

    .line 730
    .line 731
    const v12, 0x7f090347

    .line 732
    .line 733
    .line 734
    invoke-virtual {v0, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 735
    .line 736
    .line 737
    move-result-object v12

    .line 738
    move-object/from16 v17, v12

    .line 739
    .line 740
    check-cast v17, Landroid/widget/TextView;

    .line 741
    .line 742
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    invoke-static {v13, v15}, Lia0;->μ(Landroid/widget/Switch;Lxx;)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 749
    .line 750
    .line 751
    move-result-object v7

    .line 752
    check-cast v7, Landroid/widget/FrameLayout;

    .line 753
    .line 754
    move-object v12, v8

    .line 755
    new-instance v8, Lcom/example/dyhelper/ui/GestureAreaView;

    .line 756
    .line 757
    const/4 v14, 0x6

    .line 758
    invoke-direct {v8, v9, v5, v14, v6}, Lcom/example/dyhelper/ui/GestureAreaView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 759
    .line 760
    .line 761
    sget-object v5, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 762
    .line 763
    invoke-virtual {v8, v5}, Lcom/example/dyhelper/ui/GestureAreaView;->setGridBounds(Lw90;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v7}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 767
    .line 768
    .line 769
    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    .line 770
    .line 771
    const/4 v14, -0x1

    .line 772
    invoke-direct {v5, v14, v14}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 773
    .line 774
    .line 775
    invoke-virtual {v7, v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 776
    .line 777
    .line 778
    const v5, 0x7f09028b

    .line 779
    .line 780
    .line 781
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    move-object/from16 v20, v5

    .line 786
    .line 787
    check-cast v20, Landroid/widget/LinearLayout;

    .line 788
    .line 789
    const v5, 0x7f09031b

    .line 790
    .line 791
    .line 792
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 793
    .line 794
    .line 795
    move-result-object v5

    .line 796
    move-object/from16 v22, v5

    .line 797
    .line 798
    check-cast v22, Landroid/widget/TextView;

    .line 799
    .line 800
    const v5, 0x7f09032f

    .line 801
    .line 802
    .line 803
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 804
    .line 805
    .line 806
    move-result-object v5

    .line 807
    move-object/from16 v23, v5

    .line 808
    .line 809
    check-cast v23, Landroid/widget/TextView;

    .line 810
    .line 811
    const v5, 0x7f09034a

    .line 812
    .line 813
    .line 814
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 815
    .line 816
    .line 817
    move-result-object v5

    .line 818
    move-object/from16 v24, v5

    .line 819
    .line 820
    check-cast v24, Landroid/widget/TextView;

    .line 821
    .line 822
    const v5, 0x7f090058

    .line 823
    .line 824
    .line 825
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 826
    .line 827
    .line 828
    move-result-object v5

    .line 829
    check-cast v5, Landroid/widget/Button;

    .line 830
    .line 831
    const v7, 0x7f090059

    .line 832
    .line 833
    .line 834
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 835
    .line 836
    .line 837
    move-result-object v7

    .line 838
    check-cast v7, Landroid/widget/Button;

    .line 839
    .line 840
    const v14, 0x7f090067

    .line 841
    .line 842
    .line 843
    invoke-virtual {v0, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 844
    .line 845
    .line 846
    move-result-object v14

    .line 847
    check-cast v14, Landroid/widget/Button;

    .line 848
    .line 849
    const v3, 0x7f090064

    .line 850
    .line 851
    .line 852
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    check-cast v3, Landroid/widget/Button;

    .line 857
    .line 858
    const v4, 0x7f090068

    .line 859
    .line 860
    .line 861
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    check-cast v4, Landroid/widget/Button;

    .line 866
    .line 867
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    invoke-static {v5, v6}, Lia0;->λ(Landroid/widget/Button;Z)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    invoke-static {v7, v6}, Lia0;->λ(Landroid/widget/Button;Z)V

    .line 877
    .line 878
    .line 879
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    invoke-static {v14, v6}, Lia0;->λ(Landroid/widget/Button;Z)V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 886
    .line 887
    .line 888
    invoke-static {v3, v6}, Lia0;->λ(Landroid/widget/Button;Z)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 892
    .line 893
    .line 894
    invoke-static {v4, v2}, Lia0;->λ(Landroid/widget/Button;Z)V

    .line 895
    .line 896
    .line 897
    new-instance v2, Lpa;

    .line 898
    .line 899
    const/4 v6, 0x4

    .line 900
    invoke-direct {v2, v6}, Lpa;-><init>(I)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 904
    .line 905
    .line 906
    const-string v1, "gesture_enabled"

    .line 907
    .line 908
    const/4 v2, 0x0

    .line 909
    invoke-static {v1, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 910
    .line 911
    .line 912
    move-result v1

    .line 913
    invoke-virtual {v13, v1}, Landroid/widget/Switch;->setChecked(Z)V

    .line 914
    .line 915
    .line 916
    move-object v1, v7

    .line 917
    new-instance v7, Lca0;

    .line 918
    .line 919
    move-object v2, v1

    .line 920
    move-object v1, v12

    .line 921
    move-object v6, v14

    .line 922
    move-object/from16 v12, v16

    .line 923
    .line 924
    move-object/from16 v16, v17

    .line 925
    .line 926
    move-object/from16 v14, v18

    .line 927
    .line 928
    invoke-direct/range {v7 .. v16}, Lca0;-><init>(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 929
    .line 930
    .line 931
    move-object/from16 v18, v14

    .line 932
    .line 933
    move-object/from16 v17, v16

    .line 934
    .line 935
    move-object/from16 v16, v12

    .line 936
    .line 937
    invoke-virtual {v13, v7}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 938
    .line 939
    .line 940
    new-instance v7, Lwu;

    .line 941
    .line 942
    const/4 v12, 0x2

    .line 943
    invoke-direct {v7, v13, v12}, Lwu;-><init>(Landroid/widget/Switch;I)V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 947
    .line 948
    .line 949
    new-instance v19, Lm90;

    .line 950
    .line 951
    move-object/from16 v21, v8

    .line 952
    .line 953
    invoke-direct/range {v19 .. v24}, Lm90;-><init>(Landroid/widget/LinearLayout;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 954
    .line 955
    .line 956
    move-object/from16 v1, v19

    .line 957
    .line 958
    move-object/from16 v8, v21

    .line 959
    .line 960
    move-object/from16 v12, v23

    .line 961
    .line 962
    invoke-virtual {v8, v1}, Lcom/example/dyhelper/ui/GestureAreaView;->setOnAreaSelectedListener(La80;)V

    .line 963
    .line 964
    .line 965
    new-instance v7, Lda0;

    .line 966
    .line 967
    const/16 v21, 0x0

    .line 968
    .line 969
    move-object v14, v10

    .line 970
    move-object/from16 v19, v15

    .line 971
    .line 972
    move-object/from16 v10, v20

    .line 973
    .line 974
    move-object v15, v11

    .line 975
    move-object/from16 v20, v17

    .line 976
    .line 977
    move-object/from16 v11, v22

    .line 978
    .line 979
    move-object/from16 v17, v13

    .line 980
    .line 981
    move-object/from16 v13, v24

    .line 982
    .line 983
    invoke-direct/range {v7 .. v21}, Lda0;-><init>(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;I)V

    .line 984
    .line 985
    .line 986
    move-object v11, v15

    .line 987
    move-object/from16 v13, v17

    .line 988
    .line 989
    move-object/from16 v15, v19

    .line 990
    .line 991
    move-object/from16 v17, v20

    .line 992
    .line 993
    move-object/from16 v20, v10

    .line 994
    .line 995
    move-object v10, v14

    .line 996
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 997
    .line 998
    .line 999
    new-instance v7, Lda0;

    .line 1000
    .line 1001
    const/16 v21, 0x1

    .line 1002
    .line 1003
    move-object v14, v10

    .line 1004
    move-object/from16 v19, v15

    .line 1005
    .line 1006
    move-object/from16 v10, v20

    .line 1007
    .line 1008
    move-object v15, v11

    .line 1009
    move-object/from16 v20, v17

    .line 1010
    .line 1011
    move-object/from16 v11, v22

    .line 1012
    .line 1013
    move-object/from16 v17, v13

    .line 1014
    .line 1015
    move-object/from16 v13, v24

    .line 1016
    .line 1017
    invoke-direct/range {v7 .. v21}, Lda0;-><init>(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;I)V

    .line 1018
    .line 1019
    .line 1020
    move-object v11, v15

    .line 1021
    move-object/from16 v13, v17

    .line 1022
    .line 1023
    move-object/from16 v15, v19

    .line 1024
    .line 1025
    move-object/from16 v17, v20

    .line 1026
    .line 1027
    move-object/from16 v20, v10

    .line 1028
    .line 1029
    move-object v10, v14

    .line 1030
    invoke-virtual {v2, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1031
    .line 1032
    .line 1033
    new-instance v7, Lnu;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1034
    .line 1035
    move-object v12, v9

    .line 1036
    move-object v9, v8

    .line 1037
    move-object v8, v12

    .line 1038
    move-object v12, v10

    .line 1039
    move-object v10, v13

    .line 1040
    move-object/from16 v14, v16

    .line 1041
    .line 1042
    move-object v13, v11

    .line 1043
    move-object/from16 v16, v15

    .line 1044
    .line 1045
    move-object/from16 v15, v18

    .line 1046
    .line 1047
    move-object/from16 v11, v20

    .line 1048
    .line 1049
    :try_start_9
    invoke-direct/range {v7 .. v17}, Lnu;-><init>(Landroid/app/Activity;Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/Switch;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1050
    .line 1051
    .line 1052
    move-object v11, v9

    .line 1053
    move-object v9, v8

    .line 1054
    move-object v8, v11

    .line 1055
    move-object v11, v13

    .line 1056
    move-object/from16 v18, v15

    .line 1057
    .line 1058
    move-object/from16 v15, v16

    .line 1059
    .line 1060
    move-object v13, v10

    .line 1061
    move-object v10, v12

    .line 1062
    move-object/from16 v16, v14

    .line 1063
    .line 1064
    :try_start_a
    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1065
    .line 1066
    .line 1067
    new-instance v1, Ll9;

    .line 1068
    .line 1069
    invoke-direct {v1, v8, v9}, Ll9;-><init>(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;)V

    .line 1070
    .line 1071
    .line 1072
    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1073
    .line 1074
    .line 1075
    new-instance v7, Lea0;

    .line 1076
    .line 1077
    move-object/from16 v12, v16

    .line 1078
    .line 1079
    move-object/from16 v16, v17

    .line 1080
    .line 1081
    move-object/from16 v14, v18

    .line 1082
    .line 1083
    invoke-direct/range {v7 .. v16}, Lea0;-><init>(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 1084
    .line 1085
    .line 1086
    move-object/from16 v18, v14

    .line 1087
    .line 1088
    move-object/from16 v17, v16

    .line 1089
    .line 1090
    move-object/from16 v16, v12

    .line 1091
    .line 1092
    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1093
    .line 1094
    .line 1095
    move-object v12, v11

    .line 1096
    move-object v14, v13

    .line 1097
    move-object/from16 v13, v16

    .line 1098
    .line 1099
    move-object v11, v10

    .line 1100
    move-object/from16 v16, v15

    .line 1101
    .line 1102
    move-object/from16 v15, v18

    .line 1103
    .line 1104
    move-object v10, v8

    .line 1105
    invoke-static/range {v10 .. v17}, Lia0;->ι(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;)V

    .line 1106
    .line 1107
    .line 1108
    new-instance v1, Landroid/app/AlertDialog$Builder;

    .line 1109
    .line 1110
    invoke-direct {v1, v9}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v0

    .line 1117
    const/4 v1, 0x1

    .line 1118
    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v0

    .line 1122
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 1123
    .line 1124
    .line 1125
    move-result-object v0

    .line 1126
    sput-object v0, Lia0;->α:Landroid/app/AlertDialog;

    .line 1127
    .line 1128
    sget-object v0, Lia0;->α:Landroid/app/AlertDialog;

    .line 1129
    .line 1130
    if-eqz v0, :cond_c

    .line 1131
    .line 1132
    new-instance v1, Lz90;

    .line 1133
    .line 1134
    const/4 v2, 0x0

    .line 1135
    invoke-direct {v1, v2}, Lz90;-><init>(I)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 1139
    .line 1140
    .line 1141
    :cond_c
    sget-object v0, Lia0;->α:Landroid/app/AlertDialog;

    .line 1142
    .line 1143
    if-eqz v0, :cond_d

    .line 1144
    .line 1145
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 1146
    .line 1147
    .line 1148
    :cond_d
    sget-object v0, Lia0;->α:Landroid/app/AlertDialog;

    .line 1149
    .line 1150
    if-eqz v0, :cond_e

    .line 1151
    .line 1152
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    if-eqz v0, :cond_e

    .line 1157
    .line 1158
    const v1, 0x106000d

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 1162
    .line 1163
    .line 1164
    const/high16 v1, 0x3f000000    # 0.5f

    .line 1165
    .line 1166
    invoke-virtual {v0, v1}, Landroid/view/Window;->setDimAmount(F)V

    .line 1167
    .line 1168
    .line 1169
    const/4 v12, 0x2

    .line 1170
    invoke-virtual {v0, v12}, Landroid/view/Window;->addFlags(I)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v1

    .line 1177
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v1

    .line 1181
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 1182
    .line 1183
    int-to-float v1, v1

    .line 1184
    const v2, 0x3f733333    # 0.95f

    .line 1185
    .line 1186
    .line 1187
    mul-float/2addr v1, v2

    .line 1188
    float-to-int v1, v1

    .line 1189
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v2

    .line 1193
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v2

    .line 1197
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 1198
    .line 1199
    int-to-float v2, v2

    .line 1200
    const v3, 0x3f6147ae    # 0.88f

    .line 1201
    .line 1202
    .line 1203
    mul-float/2addr v2, v3

    .line 1204
    float-to-int v2, v2

    .line 1205
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 1206
    .line 1207
    .line 1208
    goto :goto_c

    .line 1209
    :catchall_9
    move-exception v0

    .line 1210
    move-object v9, v8

    .line 1211
    :goto_b
    const-string v1, "DYHelper"

    .line 1212
    .line 1213
    const-string v2, "\u6253\u5f00\u624b\u52bf\u914d\u7f6e\u754c\u9762\u5931\u8d25"

    .line 1214
    .line 1215
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v0

    .line 1222
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1223
    .line 1224
    const-string v2, "\u6253\u5f00\u914d\u7f6e\u754c\u9762\u5931\u8d25: "

    .line 1225
    .line 1226
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1227
    .line 1228
    .line 1229
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    .line 1232
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v0

    .line 1236
    const/4 v2, 0x0

    .line 1237
    invoke-static {v9, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v0

    .line 1241
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1242
    .line 1243
    .line 1244
    :cond_e
    :goto_c
    return-void

    .line 1245
    :pswitch_e
    move v2, v6

    .line 1246
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1247
    .line 1248
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 1249
    .line 1250
    const-wide/16 v3, 0x0

    .line 1251
    .line 1252
    invoke-static {v0, v3, v4, v2}, Lcom/example/dyhelper/hook/γ;->в(Landroid/app/Activity;JZ)V

    .line 1253
    .line 1254
    .line 1255
    return-void

    .line 1256
    :pswitch_f
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1257
    .line 1258
    sget-object v1, Lcom/example/dyhelper/hook/γ;->η:Ljava/lang/Object;

    .line 1259
    .line 1260
    monitor-enter v1

    .line 1261
    :try_start_b
    sget-object v2, Lcom/example/dyhelper/hook/γ;->χ:Ljava/util/WeakHashMap;

    .line 1262
    .line 1263
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    sget-object v2, Lcom/example/dyhelper/hook/γ;->ψ:Ljava/util/WeakHashMap;

    .line 1267
    .line 1268
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1269
    .line 1270
    .line 1271
    move-result-wide v3

    .line 1272
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v3

    .line 1276
    invoke-virtual {v2, v0, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 1277
    .line 1278
    .line 1279
    monitor-exit v1

    .line 1280
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 1281
    .line 1282
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/γ;->и(Landroid/app/Activity;)V

    .line 1283
    .line 1284
    .line 1285
    return-void

    .line 1286
    :catchall_a
    move-exception v0

    .line 1287
    monitor-exit v1

    .line 1288
    throw v0

    .line 1289
    :pswitch_10
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1290
    .line 1291
    sget-object v1, Lq71;->α:Lq71;

    .line 1292
    .line 1293
    invoke-static {v0, v5}, Lq71;->Ι(Landroid/app/Activity;Lnt;)V

    .line 1294
    .line 1295
    .line 1296
    return-void

    .line 1297
    :pswitch_11
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1298
    .line 1299
    sget-object v1, Lcom/example/dyhelper/hook/γ;->α:Lcom/example/dyhelper/hook/γ;

    .line 1300
    .line 1301
    invoke-virtual {v1, v0}, Lcom/example/dyhelper/hook/γ;->и(Landroid/app/Activity;)V

    .line 1302
    .line 1303
    .line 1304
    return-void

    .line 1305
    :pswitch_12
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1306
    .line 1307
    const-string v2, "aweme://lynxview/?hide_nav_bar=1&should_full_screen=1&surl=https%3A%2F%2Flf-dy-sourcecdn-tos.bytegecko.com%2Fobj%2Fbyte-gurd-source%2Fies%2Fdouyin%2Fmain_arch%2Ffe_lynx_history%2Ftemplate.js&channel=fe_lynx_history&bundle=template.js&dynamic=1&fallback_url=https%3A%2F%2Faweme.snssdk.com%2Ffalcon%2Ffe_lynx_main_web%2Flong_video_history%2Findex.html%3Fhide_nav_bar%3D1&use_bdx=1&use_gecko_first=1&use_bdx_since=16.9.0&trans_status_bar=1&enable_prefetch=1&enter_from=navigation_panel&landing=video"

    .line 1308
    .line 1309
    const-string v3, "FeedGestureHook"

    .line 1310
    .line 1311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v0

    .line 1319
    if-nez v0, :cond_f

    .line 1320
    .line 1321
    sget-object v0, Lx10;->ε:Ljava/lang/ClassLoader;

    .line 1322
    .line 1323
    if-nez v0, :cond_f

    .line 1324
    .line 1325
    goto/16 :goto_14

    .line 1326
    .line 1327
    :cond_f
    move-object v4, v0

    .line 1328
    const-string v0, "~79141EF2FBD496D84F82136FAD77522A06BB551B75C1AEA3D4F42A80C42F5DAB"

    .line 1329
    .line 1330
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v0

    .line 1334
    const-string v6, "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724259A29B43A5807491FC629BF3D81986847A"

    .line 1335
    .line 1336
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v6

    .line 1340
    filled-new-array {v0, v6}, [Ljava/lang/String;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v0

    .line 1348
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v6

    .line 1352
    :cond_10
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1353
    .line 1354
    .line 1355
    move-result v0

    .line 1356
    if-eqz v0, :cond_1b

    .line 1357
    .line 1358
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v0

    .line 1362
    check-cast v0, Ljava/lang/String;

    .line 1363
    .line 1364
    :try_start_c
    invoke-static {v4, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 1368
    goto :goto_e

    .line 1369
    :catchall_b
    move-object v0, v5

    .line 1370
    :goto_e
    if-nez v0, :cond_11

    .line 1371
    .line 1372
    goto :goto_d

    .line 1373
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v0

    .line 1377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1378
    .line 1379
    .line 1380
    array-length v7, v0

    .line 1381
    const/4 v8, 0x0

    .line 1382
    :goto_f
    if-ge v8, v7, :cond_14

    .line 1383
    .line 1384
    aget-object v9, v0, v8

    .line 1385
    .line 1386
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v10

    .line 1390
    const-string v11, "buildRoute"

    .line 1391
    .line 1392
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1393
    .line 1394
    .line 1395
    move-result v10

    .line 1396
    if-eqz v10, :cond_12

    .line 1397
    .line 1398
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v10

    .line 1402
    array-length v10, v10

    .line 1403
    const/4 v12, 0x2

    .line 1404
    if-ne v10, v12, :cond_13

    .line 1405
    .line 1406
    const-class v10, Landroid/content/Context;

    .line 1407
    .line 1408
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v11

    .line 1412
    const/16 v26, 0x0

    .line 1413
    .line 1414
    aget-object v11, v11, v26

    .line 1415
    .line 1416
    invoke-virtual {v10, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1417
    .line 1418
    .line 1419
    move-result v10

    .line 1420
    if-eqz v10, :cond_13

    .line 1421
    .line 1422
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v10

    .line 1426
    const/16 v25, 0x1

    .line 1427
    .line 1428
    aget-object v10, v10, v25

    .line 1429
    .line 1430
    const-class v11, Ljava/lang/String;

    .line 1431
    .line 1432
    invoke-static {v10, v11}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    move-result v10

    .line 1436
    if-eqz v10, :cond_13

    .line 1437
    .line 1438
    goto :goto_10

    .line 1439
    :cond_12
    const/4 v12, 0x2

    .line 1440
    :cond_13
    add-int/lit8 v8, v8, 0x1

    .line 1441
    .line 1442
    goto :goto_f

    .line 1443
    :cond_14
    const/4 v12, 0x2

    .line 1444
    move-object v9, v5

    .line 1445
    :goto_10
    if-nez v9, :cond_15

    .line 1446
    .line 1447
    goto :goto_d

    .line 1448
    :cond_15
    :try_start_d
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v0

    .line 1452
    invoke-virtual {v9, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    if-nez v0, :cond_16

    .line 1457
    .line 1458
    goto :goto_d

    .line 1459
    :cond_16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v7

    .line 1463
    invoke-virtual {v7}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v7

    .line 1467
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1468
    .line 1469
    .line 1470
    array-length v8, v7

    .line 1471
    const/4 v9, 0x0

    .line 1472
    :goto_11
    if-ge v9, v8, :cond_18

    .line 1473
    .line 1474
    aget-object v10, v7, v9

    .line 1475
    .line 1476
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v11

    .line 1480
    const-string v13, "open"

    .line 1481
    .line 1482
    invoke-static {v11, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1483
    .line 1484
    .line 1485
    move-result v11

    .line 1486
    if-eqz v11, :cond_17

    .line 1487
    .line 1488
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v11

    .line 1492
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1493
    .line 1494
    .line 1495
    array-length v11, v11

    .line 1496
    if-nez v11, :cond_17

    .line 1497
    .line 1498
    goto :goto_12

    .line 1499
    :catchall_c
    move-exception v0

    .line 1500
    goto :goto_13

    .line 1501
    :cond_17
    add-int/lit8 v9, v9, 0x1

    .line 1502
    .line 1503
    goto :goto_11

    .line 1504
    :cond_18
    move-object v10, v5

    .line 1505
    :goto_12
    if-nez v10, :cond_19

    .line 1506
    .line 1507
    goto/16 :goto_d

    .line 1508
    .line 1509
    :cond_19
    invoke-virtual {v10, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v0

    .line 1513
    instance-of v7, v0, Ljava/lang/Boolean;

    .line 1514
    .line 1515
    if-eqz v7, :cond_1a

    .line 1516
    .line 1517
    check-cast v0, Ljava/lang/Boolean;

    .line 1518
    .line 1519
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1520
    .line 1521
    .line 1522
    move-result v0

    .line 1523
    if-eqz v0, :cond_10

    .line 1524
    .line 1525
    :cond_1a
    const-string v0, "\u901a\u8fc7 SmartRouter \u6253\u5f00\u89c2\u770b\u5386\u53f2\u8bb0\u5f55"

    .line 1526
    .line 1527
    const/4 v7, 0x4

    .line 1528
    invoke-static {v3, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    .line 1529
    .line 1530
    .line 1531
    goto :goto_15

    .line 1532
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v0

    .line 1536
    const-string v7, "SmartRouter \u6253\u5f00\u89c2\u770b\u5386\u53f2\u8bb0\u5f55\u5931\u8d25: "

    .line 1537
    .line 1538
    invoke-static {v7, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v0

    .line 1542
    const/4 v7, 0x4

    .line 1543
    invoke-static {v3, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1544
    .line 1545
    .line 1546
    goto/16 :goto_d

    .line 1547
    .line 1548
    :cond_1b
    :goto_14
    :try_start_e
    new-instance v0, Landroid/content/Intent;

    .line 1549
    .line 1550
    const-string v4, "android.intent.action.VIEW"

    .line 1551
    .line 1552
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v2

    .line 1556
    invoke-direct {v0, v4, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1557
    .line 1558
    .line 1559
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v2

    .line 1563
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1564
    .line 1565
    .line 1566
    const/high16 v2, 0x20000000

    .line 1567
    .line 1568
    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1569
    .line 1570
    .line 1571
    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1572
    .line 1573
    .line 1574
    const-string v0, "\u901a\u8fc7 Intent \u5c1d\u8bd5\u6253\u5f00\u89c2\u770b\u5386\u53f2\u8bb0\u5f55"

    .line 1575
    .line 1576
    const/4 v7, 0x4

    .line 1577
    invoke-static {v3, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 1578
    .line 1579
    .line 1580
    goto :goto_15

    .line 1581
    :catchall_d
    move-exception v0

    .line 1582
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    const-string v2, "\u6253\u5f00\u89c2\u770b\u5386\u53f2\u8bb0\u5f55\u5931\u8d25: "

    .line 1587
    .line 1588
    invoke-static {v2, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    const/4 v7, 0x4

    .line 1593
    invoke-static {v3, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1594
    .line 1595
    .line 1596
    const-string v0, "\u6253\u5f00\u89c2\u770b\u5386\u53f2\u8bb0\u5f55\u5931\u8d25"

    .line 1597
    .line 1598
    const/4 v2, 0x0

    .line 1599
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1604
    .line 1605
    .line 1606
    :goto_15
    return-void

    .line 1607
    :pswitch_13
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1608
    .line 1609
    const-string v2, "FeedGestureHook"

    .line 1610
    .line 1611
    sget-object v3, Ln81;->ε:Ln81;

    .line 1612
    .line 1613
    const-string v4, "homepage_hot"

    .line 1614
    .line 1615
    :try_start_f
    sget-object v0, Lb10;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 1616
    .line 1617
    sget-object v0, Lpq;->α:Lpq;

    .line 1618
    .line 1619
    invoke-static {}, Lpq;->β()Lkq;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    if-eqz v0, :cond_1c

    .line 1624
    .line 1625
    iget-object v0, v0, Lkq;->β:Ljava/lang/Object;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 1626
    .line 1627
    goto :goto_17

    .line 1628
    :cond_1c
    :goto_16
    move-object v0, v5

    .line 1629
    goto :goto_17

    .line 1630
    :catchall_e
    move-exception v0

    .line 1631
    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1632
    .line 1633
    .line 1634
    move-result-object v0

    .line 1635
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1636
    .line 1637
    const-string v7, "\u83b7\u53d6 Aweme \u5bf9\u8c61\u5931\u8d25: "

    .line 1638
    .line 1639
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v0

    .line 1649
    const/4 v7, 0x4

    .line 1650
    invoke-static {v2, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1651
    .line 1652
    .line 1653
    goto :goto_16

    .line 1654
    :goto_17
    if-eqz v0, :cond_1d

    .line 1655
    .line 1656
    invoke-static {v1, v0, v4, v3}, Lp81;->μ(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;Ln81;)Z

    .line 1657
    .line 1658
    .line 1659
    move-result v0

    .line 1660
    if-nez v0, :cond_1e

    .line 1661
    .line 1662
    const-string v0, "\u4e0d\u611f\u5174\u8da3\u64cd\u4f5c\u5931\u8d25"

    .line 1663
    .line 1664
    const/4 v3, 0x0

    .line 1665
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1666
    .line 1667
    .line 1668
    move-result-object v0

    .line 1669
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1670
    .line 1671
    .line 1672
    goto :goto_19

    .line 1673
    :catchall_f
    move-exception v0

    .line 1674
    goto :goto_18

    .line 1675
    :cond_1d
    const-string v0, "\u672a\u627e\u5230\u5f53\u524d\u89c6\u9891\u4fe1\u606f"

    .line 1676
    .line 1677
    const/4 v3, 0x0

    .line 1678
    invoke-static {v1, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v0

    .line 1682
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    .line 1683
    .line 1684
    .line 1685
    goto :goto_19

    .line 1686
    :goto_18
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v0

    .line 1690
    const-string v3, "\u4e0d\u611f\u5174\u8da3\u52a8\u4f5c\u5f02\u5e38: "

    .line 1691
    .line 1692
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v0

    .line 1696
    const/4 v7, 0x4

    .line 1697
    invoke-static {v2, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1698
    .line 1699
    .line 1700
    const-string v0, "\u4e0d\u611f\u5174\u8da3\u64cd\u4f5c\u5f02\u5e38"

    .line 1701
    .line 1702
    const/4 v2, 0x0

    .line 1703
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v0

    .line 1707
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1708
    .line 1709
    .line 1710
    :cond_1e
    :goto_19
    return-void

    .line 1711
    :pswitch_14
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1712
    .line 1713
    sget-object v1, Lq71;->α:Lq71;

    .line 1714
    .line 1715
    new-instance v1, Ln9;

    .line 1716
    .line 1717
    const/16 v2, 0x17

    .line 1718
    .line 1719
    invoke-direct {v1, v0, v2}, Ln9;-><init>(Landroid/app/Activity;I)V

    .line 1720
    .line 1721
    .line 1722
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1723
    .line 1724
    .line 1725
    return-void

    .line 1726
    :pswitch_15
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1727
    .line 1728
    const-string v2, "\u6253\u5f00\u53d1\u5e03\u9875\u5931\u8d25"

    .line 1729
    .line 1730
    :try_start_11
    sget-object v0, Ldk1;->α:Ldk1;

    .line 1731
    .line 1732
    invoke-static {v1}, Ldk1;->π(Landroid/app/Activity;)Z

    .line 1733
    .line 1734
    .line 1735
    move-result v0

    .line 1736
    if-nez v0, :cond_1f

    .line 1737
    .line 1738
    const/4 v3, 0x0

    .line 1739
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v0

    .line 1743
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_10

    .line 1744
    .line 1745
    .line 1746
    goto :goto_1a

    .line 1747
    :catchall_10
    move-exception v0

    .line 1748
    const-string v3, "FeedGestureHook"

    .line 1749
    .line 1750
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v0

    .line 1754
    const-string v4, "\u6253\u5f00\u53d1\u5e03\u9875\u5f02\u5e38: "

    .line 1755
    .line 1756
    invoke-static {v4, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v0

    .line 1760
    const/4 v7, 0x4

    .line 1761
    invoke-static {v3, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1762
    .line 1763
    .line 1764
    const/4 v3, 0x0

    .line 1765
    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v0

    .line 1769
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1770
    .line 1771
    .line 1772
    :cond_1f
    :goto_1a
    return-void

    .line 1773
    :pswitch_16
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1774
    .line 1775
    :try_start_12
    sget-object v0, Lry1;->α:Lry1;

    .line 1776
    .line 1777
    invoke-virtual {v0, v1}, Lry1;->О(Landroid/app/Activity;)Ljava/lang/String;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v0

    .line 1781
    const/4 v2, 0x1

    .line 1782
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v0

    .line 1786
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_11

    .line 1787
    .line 1788
    .line 1789
    goto :goto_1b

    .line 1790
    :catchall_11
    move-exception v0

    .line 1791
    const-string v2, "FeedGestureHook"

    .line 1792
    .line 1793
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v0

    .line 1797
    const-string v3, "\u7eed\u706b\u82b1\u5931\u8d25: "

    .line 1798
    .line 1799
    invoke-static {v3, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v0

    .line 1803
    const/4 v7, 0x4

    .line 1804
    invoke-static {v2, v0, v5, v7, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1805
    .line 1806
    .line 1807
    const-string v0, "\u7eed\u706b\u82b1\u5931\u8d25"

    .line 1808
    .line 1809
    const/4 v2, 0x0

    .line 1810
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v0

    .line 1814
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1815
    .line 1816
    .line 1817
    :goto_1b
    return-void

    .line 1818
    :pswitch_17
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1819
    .line 1820
    :try_start_13
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 1821
    .line 1822
    .line 1823
    move-result v0

    .line 1824
    if-nez v0, :cond_22

    .line 1825
    .line 1826
    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    .line 1827
    .line 1828
    .line 1829
    move-result v0

    .line 1830
    if-eqz v0, :cond_20

    .line 1831
    .line 1832
    goto :goto_1c

    .line 1833
    :cond_20
    sget-object v0, Lx10;->α:Lx10;

    .line 1834
    .line 1835
    invoke-static {v1}, Lx10;->ζ(Landroid/app/Activity;)V

    .line 1836
    .line 1837
    .line 1838
    invoke-static {v1}, Lx10;->κ(Landroid/app/Activity;)Lv10;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v0

    .line 1842
    invoke-static {v0}, Lx10;->ε(Lv10;)V

    .line 1843
    .line 1844
    .line 1845
    new-instance v0, Lja0;

    .line 1846
    .line 1847
    const/4 v2, 0x0

    .line 1848
    invoke-direct {v0, v1, v2}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 1849
    .line 1850
    .line 1851
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v2

    .line 1855
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v3

    .line 1859
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1860
    .line 1861
    .line 1862
    move-result v2

    .line 1863
    if-eqz v2, :cond_21

    .line 1864
    .line 1865
    invoke-virtual {v0}, Lja0;->invoke()Ljava/lang/Object;

    .line 1866
    .line 1867
    .line 1868
    goto :goto_1c

    .line 1869
    :cond_21
    new-instance v2, Lν;

    .line 1870
    .line 1871
    const/16 v3, 0x11

    .line 1872
    .line 1873
    invoke-direct {v2, v3, v0}, Lν;-><init>(ILjava/lang/Object;)V

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_12

    .line 1877
    .line 1878
    .line 1879
    goto :goto_1c

    .line 1880
    :catchall_12
    move-exception v0

    .line 1881
    const-string v2, "FeedGestureHook"

    .line 1882
    .line 1883
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v3

    .line 1887
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1888
    .line 1889
    const-string v5, "\u663e\u793a\u624b\u52bf\u4f4d\u7f6e\u9884\u89c8\u5931\u8d25: "

    .line 1890
    .line 1891
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1892
    .line 1893
    .line 1894
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1895
    .line 1896
    .line 1897
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v3

    .line 1901
    invoke-static {v2, v3, v0}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1902
    .line 1903
    .line 1904
    const-string v0, "\u663e\u793a\u9884\u89c8\u5931\u8d25"

    .line 1905
    .line 1906
    const/4 v2, 0x0

    .line 1907
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v0

    .line 1911
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1912
    .line 1913
    .line 1914
    :cond_22
    :goto_1c
    return-void

    .line 1915
    :pswitch_18
    iget-object v1, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1916
    .line 1917
    :try_start_14
    invoke-static {v1}, Lpd2;->Χ(Landroid/app/Activity;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_13

    .line 1918
    .line 1919
    .line 1920
    goto :goto_1d

    .line 1921
    :catchall_13
    move-exception v0

    .line 1922
    const-string v2, "DYHelper"

    .line 1923
    .line 1924
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v3

    .line 1928
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1929
    .line 1930
    const-string v5, "\u9ab0\u5b50\u5f39\u7a97\u5f02\u5e38: "

    .line 1931
    .line 1932
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1933
    .line 1934
    .line 1935
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1936
    .line 1937
    .line 1938
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1939
    .line 1940
    .line 1941
    move-result-object v3

    .line 1942
    invoke-static {v2, v3, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1943
    .line 1944
    .line 1945
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v0

    .line 1949
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1950
    .line 1951
    const-string v3, "\u9ab0\u5b50\u529f\u80fd\u5f02\u5e38: "

    .line 1952
    .line 1953
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1954
    .line 1955
    .line 1956
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1957
    .line 1958
    .line 1959
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v0

    .line 1963
    const/4 v2, 0x0

    .line 1964
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v0

    .line 1968
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1969
    .line 1970
    .line 1971
    :goto_1d
    return-void

    .line 1972
    :pswitch_19
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1973
    .line 1974
    invoke-static {v0}, Lpd2;->Τ(Landroid/app/Activity;)V

    .line 1975
    .line 1976
    .line 1977
    return-void

    .line 1978
    :pswitch_1a
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1979
    .line 1980
    invoke-static {v0}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->φ(Landroid/app/Activity;)V

    .line 1981
    .line 1982
    .line 1983
    return-void

    .line 1984
    :pswitch_1b
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1985
    .line 1986
    sget-object v1, Lr9;->α:Landroid/os/Handler;

    .line 1987
    .line 1988
    invoke-static {v0}, Lr9;->ε(Landroid/app/Activity;)V

    .line 1989
    .line 1990
    .line 1991
    return-void

    .line 1992
    :pswitch_1c
    iget-object v0, v0, Ln9;->ζ:Landroid/app/Activity;

    .line 1993
    .line 1994
    sget-object v1, Lr9;->α:Landroid/os/Handler;

    .line 1995
    .line 1996
    invoke-static {v0}, Lr9;->ε(Landroid/app/Activity;)V

    .line 1997
    .line 1998
    .line 1999
    return-void

    .line 2000
    nop

    .line 2001
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

    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    :array_0
    .array-data 4
        0x7f090154
        0x7f0900d4
        0x7f0900d5
        0x7f0900d3
        0x7f0900d1
        0x7f09028b
        0x7f0900d2
    .end array-data
.end method
