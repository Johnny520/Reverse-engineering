.class public final synthetic Lc9;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/view/LayoutInflater;Lky1;Lcu1;)V
    .locals 0

    .line 1
    const/16 p2, 0x10

    .line 2
    .line 3
    iput p2, p0, Lc9;->ε:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lc9;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lc9;->η:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p4, p0, Lc9;->θ:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 16
    const/16 v0, 0xc

    iput v0, p0, Lc9;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9;->θ:Ljava/lang/Object;

    iput-object p2, p0, Lc9;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Lc9;->η:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/app/Activity;Ljava/lang/Object;I)V
    .locals 0

    .line 17
    iput p4, p0, Lc9;->ε:I

    iput-object p1, p0, Lc9;->η:Ljava/lang/Object;

    iput-object p2, p0, Lc9;->ζ:Ljava/lang/Object;

    iput-object p3, p0, Lc9;->θ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p4, p0, Lc9;->ε:I

    iput-object p1, p0, Lc9;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lc9;->η:Ljava/lang/Object;

    iput-object p3, p0, Lc9;->θ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lum1;La80;Ljava/lang/String;)V
    .locals 1

    .line 15
    const/4 v0, 0x5

    iput v0, p0, Lc9;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc9;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lc9;->θ:Ljava/lang/Object;

    iput-object p3, p0, Lc9;->η:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lc9;->ε:I

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const/16 v4, 0xa

    .line 10
    .line 11
    const-string v5, ""

    .line 12
    .line 13
    const/16 v6, 0xe

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    const/4 v9, 0x3

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x0

    .line 20
    iget-object v12, v0, Lc9;->θ:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v13, v0, Lc9;->ζ:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v0, v0, Lc9;->η:Ljava/lang/Object;

    .line 25
    .line 26
    packed-switch v2, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v0, Lt72;

    .line 30
    .line 31
    check-cast v13, Landroid/app/Activity;

    .line 32
    .line 33
    check-cast v12, Landroid/app/AlertDialog;

    .line 34
    .line 35
    sget-object v1, Lui1;->α:Ljava/lang/Object;

    .line 36
    .line 37
    const-string v1, "version_update_skipped_version_code"

    .line 38
    .line 39
    iget v0, v0, Lt72;->α:I

    .line 40
    .line 41
    invoke-static {v1, v0}, Lui1;->Η(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const-string v0, "\u5df2\u8df3\u8fc7\u5f53\u524d\u7248\u672c"

    .line 45
    .line 46
    invoke-static {v13, v0, v11}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v12}, Landroid/app/Dialog;->dismiss()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_0
    move-object v1, v13

    .line 58
    check-cast v1, Landroid/app/Activity;

    .line 59
    .line 60
    check-cast v0, Lky1;

    .line 61
    .line 62
    check-cast v12, Lcu1;

    .line 63
    .line 64
    sget-object v2, Ljz1;->α:Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    sget-object v2, Lry1;->α:Lry1;

    .line 67
    .line 68
    invoke-static {v0}, Lry1;->Π(Lky1;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v0}, Lry1;->Ψ(Lky1;)Lmy1;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v0}, Lry1;->Ο(Lky1;)Lgy1;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iget-boolean v5, v3, Lgy1;->β:Z

    .line 81
    .line 82
    iget-boolean v3, v3, Lgy1;->α:Z

    .line 83
    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    if-eqz v5, :cond_0

    .line 87
    .line 88
    const-string v3, "custom_on"

    .line 89
    .line 90
    :goto_0
    move-object v5, v3

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    if-eqz v3, :cond_1

    .line 93
    .line 94
    if-nez v5, :cond_1

    .line 95
    .line 96
    const-string v3, "custom_off"

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    const-string v3, "follow"

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :goto_1
    iget-wide v13, v0, Lky1;->β:J

    .line 103
    .line 104
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    cmp-long v7, v13, v7

    .line 109
    .line 110
    if-lez v7, :cond_2

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    move-object v3, v10

    .line 114
    :goto_2
    if-eqz v3, :cond_4

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v7

    .line 120
    invoke-static {}, Lv81;->θ()Ljava/util/Map;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-interface {v3, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Lsd;

    .line 133
    .line 134
    if-nez v3, :cond_3

    .line 135
    .line 136
    new-instance v3, Lsd;

    .line 137
    .line 138
    invoke-direct {v3, v7, v8}, Lsd;-><init>(J)V

    .line 139
    .line 140
    .line 141
    :cond_3
    new-instance v10, Lrd;

    .line 142
    .line 143
    iget-object v7, v3, Lsd;->β:Lip1;

    .line 144
    .line 145
    iget-object v8, v3, Lsd;->γ:Lip1;

    .line 146
    .line 147
    iget-object v3, v3, Lsd;->δ:Lip1;

    .line 148
    .line 149
    invoke-direct {v10, v7, v8, v3}, Lrd;-><init>(Lip1;Lip1;Lip1;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    move-object v8, v10

    .line 153
    const-string v3, " \u7684\u7eed\u706b\u4e0e\u5c0f\u706b\u4eba"

    .line 154
    .line 155
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    new-instance v9, Lqh1;

    .line 160
    .line 161
    const/16 v3, 0x9

    .line 162
    .line 163
    invoke-direct {v9, v1, v3, v0}, Lqh1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    new-instance v10, Luy1;

    .line 167
    .line 168
    invoke-direct {v10, v0, v1, v12, v11}, Luy1;-><init>(Ljava/lang/Object;Landroid/app/Activity;Lp70;I)V

    .line 169
    .line 170
    .line 171
    new-instance v11, Lz7;

    .line 172
    .line 173
    invoke-direct {v11, v0, v1, v12, v6}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 174
    .line 175
    .line 176
    const-string v3, "\u53ef\u5355\u72ec\u8bbe\u7f6e\u6d88\u606f\u6765\u6e90\u3001\u7eed\u706b\u3001\u706b\u661f\u4efb\u52a1\u3001\u81ea\u52a8\u6295\u5582\u548c\u8425\u5730\u52a8\u4f5c\u8986\u76d6\u9879"

    .line 177
    .line 178
    const-string v6, "\u4e2a\u4eba\u7eed\u706b\u89c4\u5219"

    .line 179
    .line 180
    move-object v7, v0

    .line 181
    invoke-static/range {v1 .. v11}, Ljz1;->ρ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lmy1;Ljava/lang/String;Ljava/lang/String;Lky1;Lrd;Lqh1;Lg80;Lp70;)V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_1
    check-cast v13, Lpu1;

    .line 186
    .line 187
    check-cast v0, Landroid/widget/TextView;

    .line 188
    .line 189
    check-cast v12, Landroid/content/Context;

    .line 190
    .line 191
    sget-object v1, Lbv1;->ε:Lpu1;

    .line 192
    .line 193
    if-ne v1, v13, :cond_5

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_5
    invoke-virtual {v0, v9}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 197
    .line 198
    .line 199
    sput-object v13, Lbv1;->ε:Lpu1;

    .line 200
    .line 201
    sget-object v0, Lbv1;->α:Lbv1;

    .line 202
    .line 203
    invoke-static {v12}, Lbv1;->а(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    new-instance v0, Lkt0;

    .line 207
    .line 208
    const/16 v1, 0x1b

    .line 209
    .line 210
    invoke-direct {v0, v1}, Lkt0;-><init>(I)V

    .line 211
    .line 212
    .line 213
    sget-object v1, Lbv1;->λ:Landroid/widget/LinearLayout;

    .line 214
    .line 215
    if-nez v1, :cond_6

    .line 216
    .line 217
    invoke-virtual {v0}, Lkt0;->invoke()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    const/4 v3, 0x0

    .line 226
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    const/high16 v3, -0x3f000000    # -8.0f

    .line 231
    .line 232
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    const-wide/16 v3, 0x96

    .line 237
    .line 238
    invoke-virtual {v2, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    new-instance v3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 243
    .line 244
    invoke-direct {v3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    new-instance v3, Lii0;

    .line 252
    .line 253
    const/16 v4, 0x16

    .line 254
    .line 255
    invoke-direct {v3, v0, v4, v1}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 263
    .line 264
    .line 265
    :goto_3
    return-void

    .line 266
    :pswitch_2
    check-cast v0, Landroid/app/AlertDialog;

    .line 267
    .line 268
    move-object v6, v13

    .line 269
    check-cast v6, Landroid/app/Activity;

    .line 270
    .line 271
    check-cast v12, La80;

    .line 272
    .line 273
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 274
    .line 275
    .line 276
    sget-object v0, Lbv1;->α:Lbv1;

    .line 277
    .line 278
    const-string v0, "im_auto_read_filter_rules"

    .line 279
    .line 280
    invoke-static {v0, v5}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    new-instance v11, Lhu;

    .line 285
    .line 286
    const/16 v0, 0x1c

    .line 287
    .line 288
    invoke-direct {v11, v12, v6, v0}, Lhu;-><init>(La80;Landroid/app/Activity;I)V

    .line 289
    .line 290
    .line 291
    const-string v7, "\u8bbe\u7f6e\u81ea\u52a8\u5df2\u8bfb\u89c4\u5219"

    .line 292
    .line 293
    const-string v8, "\u6bcf\u884c\u4e00\u4e2a\u89c4\u5219\uff0c\u4e5f\u53ef\u4ee5\u4f7f\u7528 cid:/uid:/name:"

    .line 294
    .line 295
    const v10, 0x20001

    .line 296
    .line 297
    .line 298
    invoke-static/range {v6 .. v11}, Lbv1;->Χ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILa80;)V

    .line 299
    .line 300
    .line 301
    return-void

    .line 302
    :pswitch_3
    check-cast v13, Landroid/widget/LinearLayout;

    .line 303
    .line 304
    check-cast v0, La80;

    .line 305
    .line 306
    check-cast v12, Landroid/widget/TextView;

    .line 307
    .line 308
    invoke-virtual {v13, v9}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 309
    .line 310
    .line 311
    new-instance v1, Lfi;

    .line 312
    .line 313
    invoke-direct {v1, v12, v9}, Lfi;-><init>(Landroid/widget/TextView;I)V

    .line 314
    .line 315
    .line 316
    invoke-interface {v0, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :pswitch_4
    check-cast v12, Landroid/widget/TextView;

    .line 321
    .line 322
    check-cast v13, Landroid/app/Activity;

    .line 323
    .line 324
    check-cast v0, Ljava/lang/String;

    .line 325
    .line 326
    invoke-static {v12, v13, v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileUidInjectHook;->α(Landroid/widget/TextView;Landroid/app/Activity;Ljava/lang/String;Landroid/view/View;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :pswitch_5
    check-cast v13, La80;

    .line 331
    .line 332
    check-cast v0, Lum1;

    .line 333
    .line 334
    check-cast v12, Landroid/app/AlertDialog;

    .line 335
    .line 336
    iget-object v0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 337
    .line 338
    invoke-interface {v13, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v12}, Landroid/app/Dialog;->dismiss()V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :pswitch_6
    check-cast v13, Landroid/widget/EditText;

    .line 346
    .line 347
    check-cast v0, Lrb1;

    .line 348
    .line 349
    check-cast v12, Landroid/app/AlertDialog;

    .line 350
    .line 351
    invoke-virtual {v13}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    if-eqz v1, :cond_7

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    if-eqz v1, :cond_7

    .line 362
    .line 363
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    if-eqz v1, :cond_7

    .line 372
    .line 373
    invoke-static {v1, v4}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 374
    .line 375
    .line 376
    move-result-object v10

    .line 377
    :cond_7
    if-eqz v10, :cond_9

    .line 378
    .line 379
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    if-ltz v1, :cond_9

    .line 384
    .line 385
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    const v2, 0xf4240

    .line 390
    .line 391
    .line 392
    if-le v1, v2, :cond_8

    .line 393
    .line 394
    goto :goto_4

    .line 395
    :cond_8
    invoke-virtual {v0, v10}, Lrb1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroid/app/Dialog;->dismiss()V

    .line 399
    .line 400
    .line 401
    goto :goto_5

    .line 402
    :cond_9
    :goto_4
    const-string v0, "\u8bf7\u8f93\u5165 0 \u5230 1000000 \u4e4b\u95f4\u7684\u6574\u6570"

    .line 403
    .line 404
    invoke-virtual {v13, v0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 405
    .line 406
    .line 407
    :goto_5
    return-void

    .line 408
    :pswitch_7
    check-cast v13, Lnb1;

    .line 409
    .line 410
    check-cast v0, Ljava/util/Set;

    .line 411
    .line 412
    check-cast v12, Landroid/app/AlertDialog;

    .line 413
    .line 414
    check-cast v0, Ljava/lang/Iterable;

    .line 415
    .line 416
    new-instance v1, Ljava/util/TreeSet;

    .line 417
    .line 418
    invoke-direct {v1}, Ljava/util/TreeSet;-><init>()V

    .line 419
    .line 420
    .line 421
    invoke-static {v0, v1}, Lxh;->ｃ(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v13, v1}, Lnb1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v12}, Landroid/app/Dialog;->dismiss()V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :pswitch_8
    move-object v15, v13

    .line 432
    check-cast v15, Landroid/app/Activity;

    .line 433
    .line 434
    check-cast v0, Lec1;

    .line 435
    .line 436
    check-cast v12, Landroid/view/View;

    .line 437
    .line 438
    new-instance v1, Lz7;

    .line 439
    .line 440
    const/16 v2, 0xb

    .line 441
    .line 442
    invoke-direct {v1, v15, v12, v0, v2}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 443
    .line 444
    .line 445
    sget-object v2, Lx01;->α:Lx01;

    .line 446
    .line 447
    invoke-virtual {v2, v15}, Lx01;->δ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    const v4, 0x7f0c0033

    .line 452
    .line 453
    .line 454
    invoke-virtual {v2, v4, v10, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    new-instance v4, Landroid/app/AlertDialog$Builder;

    .line 462
    .line 463
    invoke-direct {v4, v15}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v4, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    invoke-static {v15}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    iget-object v7, v5, Lxx;->β:Ljava/lang/String;

    .line 479
    .line 480
    const/16 v8, 0x10

    .line 481
    .line 482
    invoke-static {v8, v15, v7}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 483
    .line 484
    .line 485
    move-result-object v7

    .line 486
    invoke-virtual {v2, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 487
    .line 488
    .line 489
    const v7, 0x7f090099

    .line 490
    .line 491
    .line 492
    const v8, 0x7f0900a3

    .line 493
    .line 494
    .line 495
    const v12, 0x7f09009d

    .line 496
    .line 497
    .line 498
    filled-new-array {v12, v7, v8}, [I

    .line 499
    .line 500
    .line 501
    move-result-object v7

    .line 502
    :goto_6
    if-ge v11, v9, :cond_a

    .line 503
    .line 504
    aget v8, v7, v11

    .line 505
    .line 506
    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    iget-object v12, v5, Lxx;->γ:Ljava/lang/String;

    .line 511
    .line 512
    const/16 v13, 0xc

    .line 513
    .line 514
    invoke-static {v13, v15, v12}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 515
    .line 516
    .line 517
    move-result-object v12

    .line 518
    invoke-virtual {v8, v12}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 519
    .line 520
    .line 521
    add-int/lit8 v11, v11, 0x1

    .line 522
    .line 523
    goto :goto_6

    .line 524
    :cond_a
    invoke-static {v2, v5}, Lxn0;->μ(Landroid/view/View;Lxx;)V

    .line 525
    .line 526
    .line 527
    const v7, 0x7f090077

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 531
    .line 532
    .line 533
    move-result-object v8

    .line 534
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    check-cast v8, Landroid/widget/Button;

    .line 538
    .line 539
    iget-object v9, v5, Lxx;->μ:Ljava/lang/String;

    .line 540
    .line 541
    iget-object v11, v5, Lxx;->λ:Ljava/lang/String;

    .line 542
    .line 543
    invoke-static {v11}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 544
    .line 545
    .line 546
    move-result v11

    .line 547
    invoke-static {v8, v9, v11}, Lxn0;->Ж(Landroid/widget/Button;Ljava/lang/String;I)V

    .line 548
    .line 549
    .line 550
    const v8, 0x7f090084

    .line 551
    .line 552
    .line 553
    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 554
    .line 555
    .line 556
    move-result-object v9

    .line 557
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    check-cast v9, Landroid/widget/Button;

    .line 561
    .line 562
    iget-object v11, v5, Lxx;->σ:Ljava/lang/String;

    .line 563
    .line 564
    iget-object v12, v5, Lxx;->ρ:Ljava/lang/String;

    .line 565
    .line 566
    invoke-static {v12}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    move-result v12

    .line 570
    invoke-static {v9, v11, v12}, Lxn0;->Ж(Landroid/widget/Button;Ljava/lang/String;I)V

    .line 571
    .line 572
    .line 573
    const v9, 0x7f09009a

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    check-cast v11, Landroid/widget/Button;

    .line 584
    .line 585
    iget-object v12, v5, Lxx;->χ:Ljava/lang/String;

    .line 586
    .line 587
    invoke-static {v5}, Lxn0;->о(Lxx;)I

    .line 588
    .line 589
    .line 590
    move-result v13

    .line 591
    invoke-static {v11, v12, v13}, Lxn0;->Ж(Landroid/widget/Button;Ljava/lang/String;I)V

    .line 592
    .line 593
    .line 594
    const v11, 0x7f0900a2

    .line 595
    .line 596
    .line 597
    invoke-virtual {v2, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 598
    .line 599
    .line 600
    move-result-object v12

    .line 601
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    check-cast v12, Landroid/widget/Button;

    .line 605
    .line 606
    iget-object v5, v5, Lxx;->ι:Ljava/lang/String;

    .line 607
    .line 608
    const-string v13, "#FFFFFF"

    .line 609
    .line 610
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 611
    .line 612
    .line 613
    move-result v13

    .line 614
    invoke-static {v12, v5, v13}, Lxn0;->Ж(Landroid/widget/Button;Ljava/lang/String;I)V

    .line 615
    .line 616
    .line 617
    const v5, 0x7f09009e

    .line 618
    .line 619
    .line 620
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    check-cast v5, Landroid/widget/TextView;

    .line 625
    .line 626
    iget-object v12, v0, Lec1;->δ:Ljava/lang/String;

    .line 627
    .line 628
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 629
    .line 630
    .line 631
    const v5, 0x7f09009f

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 635
    .line 636
    .line 637
    move-result-object v5

    .line 638
    check-cast v5, Landroid/widget/TextView;

    .line 639
    .line 640
    invoke-static {v0}, Lxn0;->Е(Lec1;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v12

    .line 644
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 645
    .line 646
    .line 647
    const-string v5, "\u5f00\u542f"

    .line 648
    .line 649
    const-string v12, "\u5173\u95ed"

    .line 650
    .line 651
    const-string v13, "\u8ddf\u968f\u5168\u5c40"

    .line 652
    .line 653
    filled-new-array {v13, v5, v12}, [Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v5

    .line 657
    invoke-static {v5}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    new-instance v12, Lvb1;

    .line 662
    .line 663
    invoke-direct {v12, v15, v5}, Lvb1;-><init>(Landroid/app/Activity;Ljava/util/List;)V

    .line 664
    .line 665
    .line 666
    const v5, 0x7f09009c

    .line 667
    .line 668
    .line 669
    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 670
    .line 671
    .line 672
    move-result-object v5

    .line 673
    check-cast v5, Landroid/widget/Spinner;

    .line 674
    .line 675
    const v13, 0x7f0900a0

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 679
    .line 680
    .line 681
    move-result-object v13

    .line 682
    check-cast v13, Landroid/widget/Spinner;

    .line 683
    .line 684
    const v14, 0x7f0900a5

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 688
    .line 689
    .line 690
    move-result-object v14

    .line 691
    check-cast v14, Landroid/widget/Spinner;

    .line 692
    .line 693
    filled-new-array {v5, v13, v14}, [Landroid/widget/Spinner;

    .line 694
    .line 695
    .line 696
    move-result-object v16

    .line 697
    invoke-static/range {v16 .. v16}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 698
    .line 699
    .line 700
    move-result-object v16

    .line 701
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 702
    .line 703
    .line 704
    move-result-object v16

    .line 705
    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v17

    .line 709
    if-eqz v17, :cond_b

    .line 710
    .line 711
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v17

    .line 715
    move-object/from16 v10, v17

    .line 716
    .line 717
    check-cast v10, Landroid/widget/Spinner;

    .line 718
    .line 719
    invoke-virtual {v10, v12}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 720
    .line 721
    .line 722
    invoke-static {v15}, Ljx0;->ο(Landroid/content/Context;)Lxx;

    .line 723
    .line 724
    .line 725
    move-result-object v11

    .line 726
    iget-object v6, v11, Lxx;->Α:Ljava/lang/String;

    .line 727
    .line 728
    iget-object v9, v11, Lxx;->χ:Ljava/lang/String;

    .line 729
    .line 730
    invoke-static {v3, v15, v6, v9}, Ljx0;->а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;

    .line 731
    .line 732
    .line 733
    move-result-object v6

    .line 734
    invoke-virtual {v10, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 735
    .line 736
    .line 737
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    .line 738
    .line 739
    iget-object v9, v11, Lxx;->γ:Ljava/lang/String;

    .line 740
    .line 741
    invoke-static {v9}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 742
    .line 743
    .line 744
    move-result v9

    .line 745
    invoke-direct {v6, v9}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 746
    .line 747
    .line 748
    invoke-virtual {v10, v6}, Landroid/widget/Spinner;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 749
    .line 750
    .line 751
    const/16 v6, 0xe

    .line 752
    .line 753
    const v9, 0x7f09009a

    .line 754
    .line 755
    .line 756
    const/4 v10, 0x0

    .line 757
    const v11, 0x7f0900a2

    .line 758
    .line 759
    .line 760
    goto :goto_7

    .line 761
    :cond_b
    iget-object v3, v0, Lec1;->ε:Lsd;

    .line 762
    .line 763
    iget-object v6, v3, Lsd;->β:Lip1;

    .line 764
    .line 765
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 766
    .line 767
    .line 768
    move-result v6

    .line 769
    invoke-virtual {v5, v6}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 770
    .line 771
    .line 772
    iget-object v6, v3, Lsd;->γ:Lip1;

    .line 773
    .line 774
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 775
    .line 776
    .line 777
    move-result v6

    .line 778
    invoke-virtual {v13, v6}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 779
    .line 780
    .line 781
    iget-object v6, v3, Lsd;->δ:Lip1;

    .line 782
    .line 783
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 784
    .line 785
    .line 786
    move-result v6

    .line 787
    invoke-virtual {v14, v6}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 788
    .line 789
    .line 790
    new-instance v6, Lum1;

    .line 791
    .line 792
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v3}, Lsd;->β()Ltd;

    .line 796
    .line 797
    .line 798
    move-result-object v9

    .line 799
    iput-object v9, v6, Lum1;->ε:Ljava/lang/Object;

    .line 800
    .line 801
    new-instance v10, Lum1;

    .line 802
    .line 803
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 804
    .line 805
    .line 806
    iget-object v11, v3, Lsd;->ε:Ljava/lang/Integer;

    .line 807
    .line 808
    sget-object v12, Ltd;->η:Ltd;

    .line 809
    .line 810
    if-ne v9, v12, :cond_c

    .line 811
    .line 812
    goto :goto_8

    .line 813
    :cond_c
    const/4 v11, 0x0

    .line 814
    :goto_8
    iput-object v11, v10, Lum1;->ε:Ljava/lang/Object;

    .line 815
    .line 816
    new-instance v9, Lum1;

    .line 817
    .line 818
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 819
    .line 820
    .line 821
    iget-object v3, v3, Lsd;->η:Ljava/util/Set;

    .line 822
    .line 823
    iput-object v3, v9, Lum1;->ε:Ljava/lang/Object;

    .line 824
    .line 825
    invoke-virtual {v2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 826
    .line 827
    .line 828
    move-result-object v3

    .line 829
    check-cast v3, Landroid/widget/Button;

    .line 830
    .line 831
    invoke-virtual {v2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 832
    .line 833
    .line 834
    move-result-object v7

    .line 835
    check-cast v7, Landroid/widget/Button;

    .line 836
    .line 837
    invoke-static {v6, v10, v3, v7, v9}, Lxn0;->Д(Lum1;Lum1;Landroid/widget/Button;Landroid/widget/Button;Lum1;)V

    .line 838
    .line 839
    .line 840
    move-object/from16 v20, v14

    .line 841
    .line 842
    new-instance v14, Lsb1;

    .line 843
    .line 844
    move-object/from16 v18, v0

    .line 845
    .line 846
    move-object/from16 v19, v3

    .line 847
    .line 848
    move-object/from16 v16, v6

    .line 849
    .line 850
    move-object/from16 v21, v9

    .line 851
    .line 852
    move-object/from16 v17, v10

    .line 853
    .line 854
    move-object/from16 v0, v20

    .line 855
    .line 856
    move-object/from16 v20, v7

    .line 857
    .line 858
    invoke-direct/range {v14 .. v21}, Lsb1;-><init>(Landroid/app/Activity;Lum1;Lum1;Lec1;Landroid/widget/Button;Landroid/widget/Button;Lum1;)V

    .line 859
    .line 860
    .line 861
    move-object/from16 v19, v16

    .line 862
    .line 863
    move-object/from16 v16, v18

    .line 864
    .line 865
    invoke-virtual {v3, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 866
    .line 867
    .line 868
    new-instance v14, Lsb1;

    .line 869
    .line 870
    move-object/from16 v18, v20

    .line 871
    .line 872
    move-object/from16 v20, v17

    .line 873
    .line 874
    move-object/from16 v17, v21

    .line 875
    .line 876
    move-object/from16 v21, v18

    .line 877
    .line 878
    move-object/from16 v18, v3

    .line 879
    .line 880
    invoke-direct/range {v14 .. v21}, Lsb1;-><init>(Landroid/app/Activity;Lec1;Lum1;Landroid/widget/Button;Lum1;Lum1;Landroid/widget/Button;)V

    .line 881
    .line 882
    .line 883
    move-object/from16 v7, v21

    .line 884
    .line 885
    move-object/from16 v21, v17

    .line 886
    .line 887
    move-object/from16 v17, v20

    .line 888
    .line 889
    invoke-virtual {v7, v14}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 890
    .line 891
    .line 892
    const v3, 0x7f09009b

    .line 893
    .line 894
    .line 895
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 896
    .line 897
    .line 898
    move-result-object v3

    .line 899
    new-instance v6, Lsa;

    .line 900
    .line 901
    const/16 v7, 0xd

    .line 902
    .line 903
    invoke-direct {v6, v4, v7}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 904
    .line 905
    .line 906
    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 907
    .line 908
    .line 909
    const v3, 0x7f09009a

    .line 910
    .line 911
    .line 912
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 913
    .line 914
    .line 915
    move-result-object v3

    .line 916
    check-cast v3, Landroid/widget/Button;

    .line 917
    .line 918
    new-instance v6, Lsa;

    .line 919
    .line 920
    const/16 v7, 0xe

    .line 921
    .line 922
    invoke-direct {v6, v4, v7}, Lsa;-><init>(Landroid/app/AlertDialog;I)V

    .line 923
    .line 924
    .line 925
    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 926
    .line 927
    .line 928
    const v3, 0x7f0900a2

    .line 929
    .line 930
    .line 931
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    check-cast v2, Landroid/widget/Button;

    .line 936
    .line 937
    move-object/from16 v18, v16

    .line 938
    .line 939
    new-instance v16, Lea0;

    .line 940
    .line 941
    move-object/from16 v20, v0

    .line 942
    .line 943
    move-object/from16 v25, v1

    .line 944
    .line 945
    move-object/from16 v24, v4

    .line 946
    .line 947
    move-object/from16 v22, v19

    .line 948
    .line 949
    move-object/from16 v23, v21

    .line 950
    .line 951
    move-object/from16 v19, v13

    .line 952
    .line 953
    move-object/from16 v21, v17

    .line 954
    .line 955
    move-object/from16 v17, v18

    .line 956
    .line 957
    move-object/from16 v18, v5

    .line 958
    .line 959
    invoke-direct/range {v16 .. v25}, Lea0;-><init>(Lec1;Landroid/widget/Spinner;Landroid/widget/Spinner;Landroid/widget/Spinner;Lum1;Lum1;Lum1;Landroid/app/AlertDialog;Lz7;)V

    .line 960
    .line 961
    .line 962
    move-object/from16 v1, v16

    .line 963
    .line 964
    move-object/from16 v0, v24

    .line 965
    .line 966
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 967
    .line 968
    .line 969
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 970
    .line 971
    .line 972
    const v1, 0x3f428f5c    # 0.76f

    .line 973
    .line 974
    .line 975
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 976
    .line 977
    .line 978
    move-result-object v1

    .line 979
    const v2, 0x3f6b851f    # 0.92f

    .line 980
    .line 981
    .line 982
    invoke-static {v15, v0, v2, v1}, Lxn0;->φ(Landroid/app/Activity;Landroid/app/AlertDialog;FLjava/lang/Float;)V

    .line 983
    .line 984
    .line 985
    return-void

    .line 986
    :pswitch_9
    check-cast v13, Lqm1;

    .line 987
    .line 988
    check-cast v0, Landroid/widget/LinearLayout;

    .line 989
    .line 990
    check-cast v12, Landroid/widget/TextView;

    .line 991
    .line 992
    sget v1, Lcom/example/dyhelper/ui/MainActivity;->η:I

    .line 993
    .line 994
    iget-boolean v1, v13, Lqm1;->ε:Z

    .line 995
    .line 996
    xor-int/lit8 v2, v1, 0x1

    .line 997
    .line 998
    iput-boolean v2, v13, Lqm1;->ε:Z

    .line 999
    .line 1000
    if-nez v1, :cond_d

    .line 1001
    .line 1002
    move v3, v11

    .line 1003
    :cond_d
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1004
    .line 1005
    .line 1006
    iget-boolean v0, v13, Lqm1;->ε:Z

    .line 1007
    .line 1008
    if-eqz v0, :cond_e

    .line 1009
    .line 1010
    const-string v0, "\u2304"

    .line 1011
    .line 1012
    goto :goto_9

    .line 1013
    :cond_e
    const-string v0, "\u203a"

    .line 1014
    .line 1015
    :goto_9
    invoke-virtual {v12, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1016
    .line 1017
    .line 1018
    return-void

    .line 1019
    :pswitch_a
    check-cast v13, Lnd0;

    .line 1020
    .line 1021
    check-cast v0, Landroid/widget/EditText;

    .line 1022
    .line 1023
    check-cast v12, Landroid/app/AlertDialog;

    .line 1024
    .line 1025
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    if-eqz v1, :cond_f

    .line 1030
    .line 1031
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    goto :goto_a

    .line 1036
    :cond_f
    const/4 v1, 0x0

    .line 1037
    :goto_a
    if-nez v1, :cond_10

    .line 1038
    .line 1039
    goto :goto_b

    .line 1040
    :cond_10
    move-object v5, v1

    .line 1041
    :goto_b
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v1

    .line 1045
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1050
    .line 1051
    .line 1052
    move-result v2

    .line 1053
    if-nez v2, :cond_11

    .line 1054
    .line 1055
    goto :goto_d

    .line 1056
    :cond_11
    :goto_c
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1057
    .line 1058
    .line 1059
    move-result v2

    .line 1060
    if-ge v11, v2, :cond_14

    .line 1061
    .line 1062
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 1063
    .line 1064
    .line 1065
    move-result v2

    .line 1066
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v2

    .line 1070
    if-nez v2, :cond_13

    .line 1071
    .line 1072
    :cond_12
    :goto_d
    const/4 v4, 0x0

    .line 1073
    goto :goto_f

    .line 1074
    :cond_13
    add-int/lit8 v11, v11, 0x1

    .line 1075
    .line 1076
    goto :goto_c

    .line 1077
    :cond_14
    invoke-static {v1, v4}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v1

    .line 1081
    if-eqz v1, :cond_12

    .line 1082
    .line 1083
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 1084
    .line 1085
    .line 1086
    move-result-wide v2

    .line 1087
    cmp-long v2, v2, v7

    .line 1088
    .line 1089
    if-lez v2, :cond_15

    .line 1090
    .line 1091
    goto :goto_e

    .line 1092
    :cond_15
    const/4 v1, 0x0

    .line 1093
    :goto_e
    if-eqz v1, :cond_12

    .line 1094
    .line 1095
    invoke-virtual {v1}, Ljava/lang/Long;->toString()Ljava/lang/String;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v10

    .line 1099
    move-object v4, v10

    .line 1100
    :goto_f
    if-nez v4, :cond_16

    .line 1101
    .line 1102
    const-string v1, "\u8bf7\u8f93\u5165\u6709\u6548\u7684\u6570\u5b57 UID"

    .line 1103
    .line 1104
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 1105
    .line 1106
    .line 1107
    goto :goto_10

    .line 1108
    :cond_16
    sget-object v0, Lbe0;->α:Lbe0;

    .line 1109
    .line 1110
    invoke-virtual {v0}, Lbe0;->ξ()Ljava/util/List;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v1

    .line 1114
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1115
    .line 1116
    .line 1117
    move-result v9

    .line 1118
    new-instance v1, Lxd0;

    .line 1119
    .line 1120
    const-string v8, ""

    .line 1121
    .line 1122
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1123
    .line 1124
    .line 1125
    move-result-wide v2

    .line 1126
    const-string v5, ""

    .line 1127
    .line 1128
    const-string v6, ""

    .line 1129
    .line 1130
    const-string v7, ""

    .line 1131
    .line 1132
    invoke-direct/range {v1 .. v8}, Lxd0;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1133
    .line 1134
    .line 1135
    invoke-virtual {v13, v1}, Lnd0;->α(Lxd0;)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v0}, Lbe0;->ξ()Ljava/util/List;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1143
    .line 1144
    .line 1145
    move-result v0

    .line 1146
    if-le v0, v9, :cond_17

    .line 1147
    .line 1148
    invoke-virtual {v12}, Landroid/app/Dialog;->dismiss()V

    .line 1149
    .line 1150
    .line 1151
    :cond_17
    :goto_10
    return-void

    .line 1152
    :pswitch_b
    check-cast v13, Lum1;

    .line 1153
    .line 1154
    check-cast v12, La80;

    .line 1155
    .line 1156
    check-cast v0, Ljava/lang/String;

    .line 1157
    .line 1158
    iget-object v1, v13, Lum1;->ε:Ljava/lang/Object;

    .line 1159
    .line 1160
    check-cast v1, Landroid/app/AlertDialog;

    .line 1161
    .line 1162
    if-eqz v1, :cond_18

    .line 1163
    .line 1164
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 1165
    .line 1166
    .line 1167
    :cond_18
    invoke-interface {v12, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    return-void

    .line 1171
    :pswitch_c
    check-cast v13, Landroid/view/ViewGroup;

    .line 1172
    .line 1173
    move-object v1, v0

    .line 1174
    check-cast v1, Lv20;

    .line 1175
    .line 1176
    check-cast v12, Landroid/widget/FrameLayout;

    .line 1177
    .line 1178
    sget-object v0, Lz20;->α:Lz20;

    .line 1179
    .line 1180
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v0

    .line 1184
    if-nez v0, :cond_19

    .line 1185
    .line 1186
    goto :goto_13

    .line 1187
    :cond_19
    invoke-static {v0}, Lz20;->ρ(Landroid/content/Context;)Landroid/app/Activity;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v2

    .line 1191
    invoke-static {v13}, Lz20;->ο(Landroid/view/ViewGroup;)Ljava/lang/Object;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v3

    .line 1195
    if-nez v3, :cond_1b

    .line 1196
    .line 1197
    if-eqz v2, :cond_1a

    .line 1198
    .line 1199
    sget-object v3, Lz20;->θ:Ljava/util/Map;

    .line 1200
    .line 1201
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v3

    .line 1205
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 1206
    .line 1207
    if-eqz v3, :cond_1a

    .line 1208
    .line 1209
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v3

    .line 1213
    goto :goto_11

    .line 1214
    :cond_1a
    const/4 v3, 0x0

    .line 1215
    :cond_1b
    :goto_11
    :try_start_0
    iget-object v4, v1, Lv20;->η:Lp80;

    .line 1216
    .line 1217
    new-instance v5, Lw20;

    .line 1218
    .line 1219
    invoke-direct {v5, v13, v0, v2, v3}, Lw20;-><init>(Landroid/view/ViewGroup;Landroid/content/Context;Landroid/app/Activity;Ljava/lang/Object;)V

    .line 1220
    .line 1221
    .line 1222
    invoke-interface {v4, v5}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    invoke-static {v12, v1}, Lz20;->σ(Landroid/view/View;Lv20;)V

    .line 1226
    .line 1227
    .line 1228
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1229
    .line 1230
    goto :goto_12

    .line 1231
    :catchall_0
    move-exception v0

    .line 1232
    new-instance v2, Leo1;

    .line 1233
    .line 1234
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1235
    .line 1236
    .line 1237
    move-object v0, v2

    .line 1238
    :goto_12
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v0

    .line 1242
    if-eqz v0, :cond_1c

    .line 1243
    .line 1244
    iget-object v1, v1, Lv20;->α:Ljava/lang/String;

    .line 1245
    .line 1246
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v0

    .line 1250
    const-string v2, "\u53f3\u4fa7\u6309\u94ae\u70b9\u51fb\u5931\u8d25 id="

    .line 1251
    .line 1252
    const-string v3, ": "

    .line 1253
    .line 1254
    invoke-static {v2, v1, v3, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0

    .line 1258
    const/4 v1, 0x4

    .line 1259
    const-string v2, "FeedRightButtonManager"

    .line 1260
    .line 1261
    const/4 v3, 0x0

    .line 1262
    invoke-static {v2, v0, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1263
    .line 1264
    .line 1265
    :cond_1c
    :goto_13
    return-void

    .line 1266
    :pswitch_d
    check-cast v13, Landroid/widget/TextView;

    .line 1267
    .line 1268
    check-cast v0, Lru;

    .line 1269
    .line 1270
    check-cast v12, Lzu;

    .line 1271
    .line 1272
    invoke-virtual {v13, v9}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v0, v12}, Lru;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    return-void

    .line 1279
    :pswitch_e
    check-cast v13, Landroid/app/Activity;

    .line 1280
    .line 1281
    check-cast v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 1282
    .line 1283
    check-cast v12, Landroid/app/AlertDialog;

    .line 1284
    .line 1285
    invoke-static {v13, v0, v12, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->Δ(Landroid/app/Activity;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 1286
    .line 1287
    .line 1288
    return-void

    .line 1289
    :pswitch_f
    check-cast v13, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 1290
    .line 1291
    check-cast v0, Lp70;

    .line 1292
    .line 1293
    check-cast v12, Landroid/app/AlertDialog;

    .line 1294
    .line 1295
    invoke-static {v13, v0, v12, v1}, Lcom/example/dyhelper/hook/comment/bookmark/BookmarkManagerDialog;->ι(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;Lp70;Landroid/app/AlertDialog;Landroid/view/View;)V

    .line 1296
    .line 1297
    .line 1298
    return-void

    .line 1299
    :pswitch_10
    check-cast v13, Landroid/app/Activity;

    .line 1300
    .line 1301
    check-cast v0, Ljava/lang/String;

    .line 1302
    .line 1303
    check-cast v12, Ljava/lang/String;

    .line 1304
    .line 1305
    const-string v1, "clipboard"

    .line 1306
    .line 1307
    invoke-virtual {v13, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v1

    .line 1311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1312
    .line 1313
    .line 1314
    check-cast v1, Landroid/content/ClipboardManager;

    .line 1315
    .line 1316
    invoke-static {v0, v12}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v2

    .line 1320
    invoke-virtual {v1, v2}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 1321
    .line 1322
    .line 1323
    const-string v1, "\u2705 \u5df2\u590d\u5236"

    .line 1324
    .line 1325
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v0

    .line 1329
    invoke-static {v13, v0, v11}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 1334
    .line 1335
    .line 1336
    return-void

    .line 1337
    :pswitch_data_0
    .packed-switch 0x0
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
