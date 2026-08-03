.class public final synthetic Lwb/l8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/l8;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/l8;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Li0/h0;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    and-int/lit8 p2, p1, 0x3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    const/4 v1, 0x1

    .line 19
    if-eq p2, v0, :cond_0

    .line 20
    .line 21
    move p2, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    :goto_0
    and-int/2addr p1, v1

    .line 25
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/16 v7, 0x6db0

    .line 33
    .line 34
    iget-object v1, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 35
    .line 36
    const-string v2, "fake_scan_camera_enable"

    .line 37
    .line 38
    const-string v3, "\u6a21\u62df\u76f8\u673a\u626b\u7801"

    .line 39
    .line 40
    const-string v4, "\u8ba9\u76f8\u518c\u8bc6\u522b\u4e8c\u7ef4\u7801\u6309\u76f8\u673a\u626b\u7801\u6765\u6e90\u5904\u7406"

    .line 41
    .line 42
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 47
    .line 48
    .line 49
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_0
    move-object v5, p1

    .line 53
    check-cast v5, Li0/h0;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    and-int/lit8 p2, p1, 0x3

    .line 62
    .line 63
    const/4 v0, 0x2

    .line 64
    const/4 v1, 0x1

    .line 65
    if-eq p2, v0, :cond_2

    .line 66
    .line 67
    move p2, v1

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    const/4 p2, 0x0

    .line 70
    :goto_2
    and-int/2addr p1, v1

    .line 71
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/16 v6, 0x6db0

    .line 79
    .line 80
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 81
    .line 82
    const-string v1, "disable_hot_update_enable"

    .line 83
    .line 84
    const-string v2, "\u5c4f\u853d\u70ed\u66f4\u65b0"

    .line 85
    .line 86
    const-string v3, "\u963b\u6b62\u5fae\u4fe1\u52a0\u8f7d\u548c\u5e94\u7528\u70ed\u66f4\u65b0\u8865\u4e01"

    .line 87
    .line 88
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 93
    .line 94
    .line 95
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 96
    .line 97
    return-object p1

    .line 98
    :pswitch_1
    move-object v5, p1

    .line 99
    check-cast v5, Li0/h0;

    .line 100
    .line 101
    check-cast p2, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    and-int/lit8 p2, p1, 0x3

    .line 108
    .line 109
    const/4 v0, 0x2

    .line 110
    const/4 v7, 0x0

    .line 111
    const/4 v8, 0x1

    .line 112
    if-eq p2, v0, :cond_4

    .line 113
    .line 114
    move p2, v8

    .line 115
    goto :goto_4

    .line 116
    :cond_4
    move p2, v7

    .line 117
    :goto_4
    and-int/2addr p1, v8

    .line 118
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-eqz p1, :cond_5

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    const/16 v6, 0x6db0

    .line 126
    .line 127
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 128
    .line 129
    const-string v1, "message_forward_enable"

    .line 130
    .line 131
    const-string v2, "\u8f6c\u53d1\u83dc\u5355"

    .line 132
    .line 133
    const-string v3, "\u5728\u6d88\u606f\u957f\u6309\u83dc\u5355\u4e2d\u663e\u793a\u8f6c\u53d1[H]"

    .line 134
    .line 135
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 136
    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 140
    .line 141
    .line 142
    const-string v1, "message_forward_multi_moments_enable"

    .line 143
    .line 144
    const-string v2, "\u591a\u9009\u8f6c\u53d1\u5230\u670b\u53cb\u5708"

    .line 145
    .line 146
    const-string v3, "\u5728\u591a\u9009\u6d88\u606f\u83dc\u5355\u4e2d\u663e\u793a\u8f6c\u53d1\u5230\u670b\u53cb\u5708[H]"

    .line 147
    .line 148
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_5
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 153
    .line 154
    .line 155
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 156
    .line 157
    return-object p1

    .line 158
    :pswitch_2
    move-object v5, p1

    .line 159
    check-cast v5, Li0/h0;

    .line 160
    .line 161
    check-cast p2, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    and-int/lit8 p2, p1, 0x3

    .line 168
    .line 169
    const/4 v0, 0x2

    .line 170
    const/4 v1, 0x1

    .line 171
    if-eq p2, v0, :cond_6

    .line 172
    .line 173
    move p2, v1

    .line 174
    goto :goto_6

    .line 175
    :cond_6
    const/4 p2, 0x0

    .line 176
    :goto_6
    and-int/2addr p1, v1

    .line 177
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-eqz p1, :cond_7

    .line 182
    .line 183
    const/4 v4, 0x0

    .line 184
    const/16 v6, 0x6db0

    .line 185
    .line 186
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 187
    .line 188
    const-string v1, "quote_delete_clear_enable"

    .line 189
    .line 190
    const-string v2, "\u5220\u9664\u952e\u6e05\u5f15\u7528"

    .line 191
    .line 192
    const-string v3, "\u8f93\u5165\u6846\u4e3a\u7a7a\u4e14\u5df2\u5f15\u7528\u6d88\u606f\u65f6\uff0c\u6309\u8f93\u5165\u6cd5\u5220\u9664\u952e\u76f4\u63a5\u53d6\u6d88\u5f15\u7528"

    .line 193
    .line 194
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 195
    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_7
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 199
    .line 200
    .line 201
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 202
    .line 203
    return-object p1

    .line 204
    :pswitch_3
    move-object v5, p1

    .line 205
    check-cast v5, Li0/h0;

    .line 206
    .line 207
    check-cast p2, Ljava/lang/Integer;

    .line 208
    .line 209
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    and-int/lit8 p2, p1, 0x3

    .line 214
    .line 215
    const/4 v0, 0x2

    .line 216
    const/4 v1, 0x1

    .line 217
    if-eq p2, v0, :cond_8

    .line 218
    .line 219
    move p2, v1

    .line 220
    goto :goto_8

    .line 221
    :cond_8
    const/4 p2, 0x0

    .line 222
    :goto_8
    and-int/2addr p1, v1

    .line 223
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    if-eqz p1, :cond_9

    .line 228
    .line 229
    const/4 v4, 0x0

    .line 230
    const/16 v6, 0x6db0

    .line 231
    .line 232
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 233
    .line 234
    const-string v1, "edit_message_enable"

    .line 235
    .line 236
    const-string v2, "\u4fee\u6539\u804a\u5929\u8bb0\u5f55"

    .line 237
    .line 238
    const-string v3, "\u957f\u6309\u6587\u5b57\u3001\u5f15\u7528\u6216\u8f6c\u8d26\u6d88\u606f\u540e\u53ef\u4fee\u6539\u672c\u5730\u8bb0\u5f55"

    .line 239
    .line 240
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 241
    .line 242
    .line 243
    goto :goto_9

    .line 244
    :cond_9
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 245
    .line 246
    .line 247
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 248
    .line 249
    return-object p1

    .line 250
    :pswitch_4
    move-object v5, p1

    .line 251
    check-cast v5, Li0/h0;

    .line 252
    .line 253
    check-cast p2, Ljava/lang/Integer;

    .line 254
    .line 255
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    and-int/lit8 p2, p1, 0x3

    .line 260
    .line 261
    const/4 v0, 0x2

    .line 262
    const/4 v1, 0x1

    .line 263
    if-eq p2, v0, :cond_a

    .line 264
    .line 265
    move p2, v1

    .line 266
    goto :goto_a

    .line 267
    :cond_a
    const/4 p2, 0x0

    .line 268
    :goto_a
    and-int/2addr p1, v1

    .line 269
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 270
    .line 271
    .line 272
    move-result p1

    .line 273
    if-eqz p1, :cond_b

    .line 274
    .line 275
    const/4 v4, 0x0

    .line 276
    const/16 v6, 0x6db0

    .line 277
    .line 278
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 279
    .line 280
    const-string v1, "profile_id_enable"

    .line 281
    .line 282
    const-string v2, "\u663e\u793a\u597d\u53cb/\u7fa4\u804aID"

    .line 283
    .line 284
    const-string v3, "\u5728\u597d\u53cb\u548c\u7fa4\u804a\u8d44\u6599\u9875\u663e\u793a\u53ef\u70b9\u51fb\u590d\u5236\u7684 ID"

    .line 285
    .line 286
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 287
    .line 288
    .line 289
    goto :goto_b

    .line 290
    :cond_b
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 291
    .line 292
    .line 293
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 294
    .line 295
    return-object p1

    .line 296
    :pswitch_5
    move-object v5, p1

    .line 297
    check-cast v5, Li0/h0;

    .line 298
    .line 299
    check-cast p2, Ljava/lang/Integer;

    .line 300
    .line 301
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 302
    .line 303
    .line 304
    move-result p1

    .line 305
    and-int/lit8 p2, p1, 0x3

    .line 306
    .line 307
    const/4 v0, 0x2

    .line 308
    const/4 v1, 0x1

    .line 309
    if-eq p2, v0, :cond_c

    .line 310
    .line 311
    move p2, v1

    .line 312
    goto :goto_c

    .line 313
    :cond_c
    const/4 p2, 0x0

    .line 314
    :goto_c
    and-int/2addr p1, v1

    .line 315
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 316
    .line 317
    .line 318
    move-result p1

    .line 319
    if-eqz p1, :cond_d

    .line 320
    .line 321
    const/4 v4, 0x0

    .line 322
    const/16 v6, 0x6db0

    .line 323
    .line 324
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 325
    .line 326
    const-string v1, "emoji_save_enable"

    .line 327
    .line 328
    const-string v2, "\u4fdd\u5b58\u8868\u60c5"

    .line 329
    .line 330
    const-string v3, "\u957f\u6309\u804a\u5929\u8868\u60c5\u540e\u663e\u793a\u4fdd\u5b58\u5165\u53e3"

    .line 331
    .line 332
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 333
    .line 334
    .line 335
    goto :goto_d

    .line 336
    :cond_d
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 337
    .line 338
    .line 339
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 340
    .line 341
    return-object p1

    .line 342
    :pswitch_6
    move-object v5, p1

    .line 343
    check-cast v5, Li0/h0;

    .line 344
    .line 345
    check-cast p2, Ljava/lang/Integer;

    .line 346
    .line 347
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    and-int/lit8 p2, p1, 0x3

    .line 352
    .line 353
    const/4 v0, 0x2

    .line 354
    const/4 v1, 0x1

    .line 355
    if-eq p2, v0, :cond_e

    .line 356
    .line 357
    move p2, v1

    .line 358
    goto :goto_e

    .line 359
    :cond_e
    const/4 p2, 0x0

    .line 360
    :goto_e
    and-int/2addr p1, v1

    .line 361
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 362
    .line 363
    .line 364
    move-result p1

    .line 365
    if-eqz p1, :cond_f

    .line 366
    .line 367
    const/4 v4, 0x0

    .line 368
    const/16 v6, 0x6db0

    .line 369
    .line 370
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 371
    .line 372
    const-string v1, "message_forward_sns_enable"

    .line 373
    .line 374
    const-string v2, "\u670b\u53cb\u5708\u8f6c\u53d1"

    .line 375
    .line 376
    const-string v3, "\u5728\u53d1\u73b0\u9875\u6216\u597d\u53cb\u4e2a\u4eba\u4e3b\u9875\u957f\u6309\u670b\u53cb\u5708\u540e\u663e\u793a\u8f6c\u53d1[H]"

    .line 377
    .line 378
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 379
    .line 380
    .line 381
    goto :goto_f

    .line 382
    :cond_f
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 383
    .line 384
    .line 385
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 386
    .line 387
    return-object p1

    .line 388
    :pswitch_7
    move-object v5, p1

    .line 389
    check-cast v5, Li0/h0;

    .line 390
    .line 391
    check-cast p2, Ljava/lang/Integer;

    .line 392
    .line 393
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 394
    .line 395
    .line 396
    move-result p1

    .line 397
    and-int/lit8 p2, p1, 0x3

    .line 398
    .line 399
    const/4 v0, 0x2

    .line 400
    const/4 v1, 0x1

    .line 401
    if-eq p2, v0, :cond_10

    .line 402
    .line 403
    move p2, v1

    .line 404
    goto :goto_10

    .line 405
    :cond_10
    const/4 p2, 0x0

    .line 406
    :goto_10
    and-int/2addr p1, v1

    .line 407
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 408
    .line 409
    .line 410
    move-result p1

    .line 411
    if-eqz p1, :cond_11

    .line 412
    .line 413
    const/4 v4, 0x0

    .line 414
    const/16 v6, 0x6db0

    .line 415
    .line 416
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 417
    .line 418
    const-string v1, "remove_moments_ads_enable"

    .line 419
    .line 420
    const-string v2, "\u53bb\u9664\u670b\u53cb\u5708\u5e7f\u544a"

    .line 421
    .line 422
    const-string v3, "\u963b\u6b62\u670b\u53cb\u5708\u5e7f\u544a\u4fe1\u606f\u89e3\u6790\u548c\u5c55\u793a"

    .line 423
    .line 424
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 425
    .line 426
    .line 427
    goto :goto_11

    .line 428
    :cond_11
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 429
    .line 430
    .line 431
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 432
    .line 433
    return-object p1

    .line 434
    :pswitch_8
    move-object v5, p1

    .line 435
    check-cast v5, Li0/h0;

    .line 436
    .line 437
    check-cast p2, Ljava/lang/Integer;

    .line 438
    .line 439
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    and-int/lit8 p2, p1, 0x3

    .line 444
    .line 445
    const/4 v0, 0x2

    .line 446
    const/4 v1, 0x1

    .line 447
    if-eq p2, v0, :cond_12

    .line 448
    .line 449
    move p2, v1

    .line 450
    goto :goto_12

    .line 451
    :cond_12
    const/4 p2, 0x0

    .line 452
    :goto_12
    and-int/2addr p1, v1

    .line 453
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 454
    .line 455
    .line 456
    move-result p1

    .line 457
    if-eqz p1, :cond_13

    .line 458
    .line 459
    const/4 v4, 0x0

    .line 460
    const/16 v6, 0x6db0

    .line 461
    .line 462
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 463
    .line 464
    const-string v1, "plugin_agent_plus_menu_enable"

    .line 465
    .line 466
    const-string v2, "\u63d2\u4ef6 Agent \u5165\u53e3"

    .line 467
    .line 468
    const-string v3, "\u5728\u5fae\u4fe1\u53f3\u4e0a\u89d2\u52a0\u53f7\u83dc\u5355\u4e2d\u663e\u793a\u63d2\u4ef6 Agent\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u751f\u6548"

    .line 469
    .line 470
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 471
    .line 472
    .line 473
    goto :goto_13

    .line 474
    :cond_13
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 475
    .line 476
    .line 477
    :goto_13
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 478
    .line 479
    return-object p1

    .line 480
    :pswitch_9
    move-object v5, p1

    .line 481
    check-cast v5, Li0/h0;

    .line 482
    .line 483
    check-cast p2, Ljava/lang/Integer;

    .line 484
    .line 485
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 486
    .line 487
    .line 488
    move-result p1

    .line 489
    and-int/lit8 p2, p1, 0x3

    .line 490
    .line 491
    const/4 v0, 0x2

    .line 492
    const/4 v1, 0x1

    .line 493
    if-eq p2, v0, :cond_14

    .line 494
    .line 495
    move p2, v1

    .line 496
    goto :goto_14

    .line 497
    :cond_14
    const/4 p2, 0x0

    .line 498
    :goto_14
    and-int/2addr p1, v1

    .line 499
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 500
    .line 501
    .line 502
    move-result p1

    .line 503
    if-eqz p1, :cond_15

    .line 504
    .line 505
    const/4 v4, 0x0

    .line 506
    const/16 v6, 0x6db0

    .line 507
    .line 508
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 509
    .line 510
    const-string v1, "tablet_enable"

    .line 511
    .line 512
    const-string v2, "\u5e73\u677f\u6a21\u5f0f"

    .line 513
    .line 514
    const-string v3, "\u5f00\u542f\u5e73\u677f\u6a21\u5f0f\uff0c\u9000\u51fa\u5fae\u4fe1\u767b\u9646\u751f\u6548"

    .line 515
    .line 516
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 517
    .line 518
    .line 519
    goto :goto_15

    .line 520
    :cond_15
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 521
    .line 522
    .line 523
    :goto_15
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 524
    .line 525
    return-object p1

    .line 526
    :pswitch_a
    move-object v5, p1

    .line 527
    check-cast v5, Li0/h0;

    .line 528
    .line 529
    check-cast p2, Ljava/lang/Integer;

    .line 530
    .line 531
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 532
    .line 533
    .line 534
    move-result p1

    .line 535
    and-int/lit8 p2, p1, 0x3

    .line 536
    .line 537
    const/4 v0, 0x2

    .line 538
    const/4 v1, 0x1

    .line 539
    if-eq p2, v0, :cond_16

    .line 540
    .line 541
    move p2, v1

    .line 542
    goto :goto_16

    .line 543
    :cond_16
    const/4 p2, 0x0

    .line 544
    :goto_16
    and-int/2addr p1, v1

    .line 545
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 546
    .line 547
    .line 548
    move-result p1

    .line 549
    if-eqz p1, :cond_17

    .line 550
    .line 551
    const/4 v4, 0x0

    .line 552
    const/16 v6, 0x6db0

    .line 553
    .line 554
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 555
    .line 556
    const-string v1, "enable"

    .line 557
    .line 558
    const-string v2, "\u89c6\u9891\u53f7\u5a92\u4f53\u4e0b\u8f7d"

    .line 559
    .line 560
    const-string v3, "\u5728\u89c6\u9891\u53f7\u5206\u4eab\u83dc\u5355\u589e\u52a0\u590d\u5236\u94fe\u63a5\u548c\u4e0b\u8f7d\u5165\u53e3\uff0c\u5a92\u4f53\u4fdd\u5b58\u5230 Hchat/Finder"

    .line 561
    .line 562
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 563
    .line 564
    .line 565
    goto :goto_17

    .line 566
    :cond_17
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 567
    .line 568
    .line 569
    :goto_17
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 570
    .line 571
    return-object p1

    .line 572
    :pswitch_b
    move-object v5, p1

    .line 573
    check-cast v5, Li0/h0;

    .line 574
    .line 575
    check-cast p2, Ljava/lang/Integer;

    .line 576
    .line 577
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 578
    .line 579
    .line 580
    move-result p1

    .line 581
    and-int/lit8 p2, p1, 0x3

    .line 582
    .line 583
    const/4 v0, 0x2

    .line 584
    const/4 v7, 0x0

    .line 585
    const/4 v8, 0x1

    .line 586
    if-eq p2, v0, :cond_18

    .line 587
    .line 588
    move p2, v8

    .line 589
    goto :goto_18

    .line 590
    :cond_18
    move p2, v7

    .line 591
    :goto_18
    and-int/2addr p1, v8

    .line 592
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 593
    .line 594
    .line 595
    move-result p1

    .line 596
    if-eqz p1, :cond_19

    .line 597
    .line 598
    const/4 v4, 0x0

    .line 599
    const/16 v6, 0x6db0

    .line 600
    .line 601
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 602
    .line 603
    const-string v1, "enable"

    .line 604
    .line 605
    const-string v2, "\u5b9e\u540d\u5c3e\u5b57"

    .line 606
    .line 607
    const-string v3, "\u5728\u7fa4\u804a\u6635\u79f0\u540e\u663e\u793a\u5df2\u67e5\u8be2\u5230\u7684\u5b9e\u540d\u5c3e\u5b57"

    .line 608
    .line 609
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 610
    .line 611
    .line 612
    const/4 p1, 0x0

    .line 613
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 614
    .line 615
    .line 616
    const/4 v4, 0x1

    .line 617
    const-string v1, "message_query"

    .line 618
    .line 619
    const-string v2, "\u6d88\u606f\u89e6\u53d1\u67e5\u8be2"

    .line 620
    .line 621
    const-string v3, "\u6536\u5230\u7fa4\u6210\u5458\u6d88\u606f\u540e\u81ea\u52a8\u8865\u67e5"

    .line 622
    .line 623
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 624
    .line 625
    .line 626
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 627
    .line 628
    .line 629
    const-string v1, "visible_query"

    .line 630
    .line 631
    const-string v2, "\u53ef\u89c1\u6210\u5458\u67e5\u8be2"

    .line 632
    .line 633
    const-string v3, "\u804a\u5929\u9875\u51fa\u73b0\u672a\u7f13\u5b58\u6210\u5458\u65f6\u81ea\u52a8\u8865\u67e5"

    .line 634
    .line 635
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 636
    .line 637
    .line 638
    goto :goto_19

    .line 639
    :cond_19
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 640
    .line 641
    .line 642
    :goto_19
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 643
    .line 644
    return-object p1

    .line 645
    :pswitch_c
    move-object v5, p1

    .line 646
    check-cast v5, Li0/h0;

    .line 647
    .line 648
    check-cast p2, Ljava/lang/Integer;

    .line 649
    .line 650
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 651
    .line 652
    .line 653
    move-result p1

    .line 654
    and-int/lit8 p2, p1, 0x3

    .line 655
    .line 656
    const/4 v0, 0x2

    .line 657
    const/4 v1, 0x1

    .line 658
    if-eq p2, v0, :cond_1a

    .line 659
    .line 660
    move p2, v1

    .line 661
    goto :goto_1a

    .line 662
    :cond_1a
    const/4 p2, 0x0

    .line 663
    :goto_1a
    and-int/2addr p1, v1

    .line 664
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 665
    .line 666
    .line 667
    move-result p1

    .line 668
    if-eqz p1, :cond_1b

    .line 669
    .line 670
    const/4 v4, 0x0

    .line 671
    const/16 v6, 0x6db0

    .line 672
    .line 673
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 674
    .line 675
    const-string v1, "multi_recall_enable"

    .line 676
    .line 677
    const-string v2, "\u591a\u9009\u64a4\u56de"

    .line 678
    .line 679
    const-string v3, "\u5728\u591a\u9009\u6d88\u606f\u7684\u5206\u4eab\u83dc\u5355\u4e2d\u663e\u793a\u6279\u91cf\u64a4\u56de"

    .line 680
    .line 681
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 682
    .line 683
    .line 684
    goto :goto_1b

    .line 685
    :cond_1b
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 686
    .line 687
    .line 688
    :goto_1b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 689
    .line 690
    return-object p1

    .line 691
    :pswitch_d
    move-object v5, p1

    .line 692
    check-cast v5, Li0/h0;

    .line 693
    .line 694
    check-cast p2, Ljava/lang/Integer;

    .line 695
    .line 696
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 697
    .line 698
    .line 699
    move-result p1

    .line 700
    and-int/lit8 p2, p1, 0x3

    .line 701
    .line 702
    const/4 v0, 0x2

    .line 703
    const/4 v1, 0x1

    .line 704
    if-eq p2, v0, :cond_1c

    .line 705
    .line 706
    move p2, v1

    .line 707
    goto :goto_1c

    .line 708
    :cond_1c
    const/4 p2, 0x0

    .line 709
    :goto_1c
    and-int/2addr p1, v1

    .line 710
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 711
    .line 712
    .line 713
    move-result p1

    .line 714
    if-eqz p1, :cond_1d

    .line 715
    .line 716
    const/4 v4, 0x0

    .line 717
    const/16 v6, 0x6db0

    .line 718
    .line 719
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 720
    .line 721
    const-string v1, "status_text_limit_enable"

    .line 722
    .line 723
    const-string v2, "\u89e3\u9664\u72b6\u6001\u8bcd\u957f\u5ea6\u9650\u5236"

    .line 724
    .line 725
    const-string v3, "\u5f00\u542f\u540e\u4e2a\u4eba\u72b6\u6001\u8bcd\u53ef\u8d85\u8fc7\u5fae\u4fe1\u9ed8\u8ba4 10 \u5b57\u9650\u5236"

    .line 726
    .line 727
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 728
    .line 729
    .line 730
    goto :goto_1d

    .line 731
    :cond_1d
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 732
    .line 733
    .line 734
    :goto_1d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 735
    .line 736
    return-object p1

    .line 737
    :pswitch_e
    move-object v5, p1

    .line 738
    check-cast v5, Li0/h0;

    .line 739
    .line 740
    check-cast p2, Ljava/lang/Integer;

    .line 741
    .line 742
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 743
    .line 744
    .line 745
    move-result p1

    .line 746
    and-int/lit8 p2, p1, 0x3

    .line 747
    .line 748
    const/4 v0, 0x2

    .line 749
    const/4 v1, 0x1

    .line 750
    if-eq p2, v0, :cond_1e

    .line 751
    .line 752
    move p2, v1

    .line 753
    goto :goto_1e

    .line 754
    :cond_1e
    const/4 p2, 0x0

    .line 755
    :goto_1e
    and-int/2addr p1, v1

    .line 756
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 757
    .line 758
    .line 759
    move-result p1

    .line 760
    if-eqz p1, :cond_1f

    .line 761
    .line 762
    const/4 v4, 0x0

    .line 763
    const/16 v6, 0x6db0

    .line 764
    .line 765
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 766
    .line 767
    const-string v1, "call_media_limit_enable"

    .line 768
    .line 769
    const-string v2, "\u79fb\u9664\u901a\u8bdd\u5a92\u4f53\u9650\u5236"

    .line 770
    .line 771
    const-string v3, "\u901a\u8bdd\u65f6\u5141\u8bb8\u64ad\u653e\u8bed\u97f3\u548c\u89c6\u9891\uff0c\u5e76\u6253\u5f00\u804a\u5929\u62cd\u6444"

    .line 772
    .line 773
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 774
    .line 775
    .line 776
    goto :goto_1f

    .line 777
    :cond_1f
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 778
    .line 779
    .line 780
    :goto_1f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 781
    .line 782
    return-object p1

    .line 783
    :pswitch_f
    move-object v5, p1

    .line 784
    check-cast v5, Li0/h0;

    .line 785
    .line 786
    check-cast p2, Ljava/lang/Integer;

    .line 787
    .line 788
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 789
    .line 790
    .line 791
    move-result p1

    .line 792
    and-int/lit8 p2, p1, 0x3

    .line 793
    .line 794
    const/4 v0, 0x2

    .line 795
    const/4 v1, 0x1

    .line 796
    if-eq p2, v0, :cond_20

    .line 797
    .line 798
    move p2, v1

    .line 799
    goto :goto_20

    .line 800
    :cond_20
    const/4 p2, 0x0

    .line 801
    :goto_20
    and-int/2addr p1, v1

    .line 802
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 803
    .line 804
    .line 805
    move-result p1

    .line 806
    if-eqz p1, :cond_21

    .line 807
    .line 808
    const/4 v4, 0x0

    .line 809
    const/16 v6, 0x6db0

    .line 810
    .line 811
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 812
    .line 813
    const-string v1, "block_typing_report_enable"

    .line 814
    .line 815
    const-string v2, "\u62e6\u622a\u6b63\u5728\u8f93\u5165\u4e0a\u62a5"

    .line 816
    .line 817
    const-string v3, "\u8f93\u5165\u6587\u5b57\u65f6\u4e0d\u5411\u5bf9\u65b9\u663e\u793a\u6b63\u5728\u8f93\u5165\u72b6\u6001"

    .line 818
    .line 819
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 820
    .line 821
    .line 822
    goto :goto_21

    .line 823
    :cond_21
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 824
    .line 825
    .line 826
    :goto_21
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 827
    .line 828
    return-object p1

    .line 829
    :pswitch_10
    move-object v5, p1

    .line 830
    check-cast v5, Li0/h0;

    .line 831
    .line 832
    check-cast p2, Ljava/lang/Integer;

    .line 833
    .line 834
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 835
    .line 836
    .line 837
    move-result p1

    .line 838
    and-int/lit8 p2, p1, 0x3

    .line 839
    .line 840
    const/4 v0, 0x2

    .line 841
    const/4 v1, 0x1

    .line 842
    if-eq p2, v0, :cond_22

    .line 843
    .line 844
    move p2, v1

    .line 845
    goto :goto_22

    .line 846
    :cond_22
    const/4 p2, 0x0

    .line 847
    :goto_22
    and-int/2addr p1, v1

    .line 848
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 849
    .line 850
    .line 851
    move-result p1

    .line 852
    if-eqz p1, :cond_23

    .line 853
    .line 854
    const/4 v4, 0x0

    .line 855
    const/16 v6, 0x6db0

    .line 856
    .line 857
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 858
    .line 859
    const-string v1, "quick_contact_edit_enable"

    .line 860
    .line 861
    const-string v2, "\u5feb\u6377\u8bbe\u7f6e\u5907\u6ce8\u548c\u6807\u7b7e"

    .line 862
    .line 863
    const-string v3, "\u957f\u6309\u79c1\u804a\u4f1a\u8bdd\u6216\u597d\u53cb\u670b\u53cb\u5708\u5934\u50cf\u65f6\u663e\u793a\u5907\u6ce8\u548c\u6807\u7b7e\u8bbe\u7f6e\u5165\u53e3"

    .line 864
    .line 865
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 866
    .line 867
    .line 868
    goto :goto_23

    .line 869
    :cond_23
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 870
    .line 871
    .line 872
    :goto_23
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 873
    .line 874
    return-object p1

    .line 875
    :pswitch_11
    move-object v5, p1

    .line 876
    check-cast v5, Li0/h0;

    .line 877
    .line 878
    check-cast p2, Ljava/lang/Integer;

    .line 879
    .line 880
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 881
    .line 882
    .line 883
    move-result p1

    .line 884
    and-int/lit8 p2, p1, 0x3

    .line 885
    .line 886
    const/4 v0, 0x2

    .line 887
    const/4 v7, 0x0

    .line 888
    const/4 v8, 0x1

    .line 889
    if-eq p2, v0, :cond_24

    .line 890
    .line 891
    move p2, v8

    .line 892
    goto :goto_24

    .line 893
    :cond_24
    move p2, v7

    .line 894
    :goto_24
    and-int/2addr p1, v8

    .line 895
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 896
    .line 897
    .line 898
    move-result p1

    .line 899
    if-eqz p1, :cond_25

    .line 900
    .line 901
    const/4 v4, 0x0

    .line 902
    const/16 v6, 0x6db0

    .line 903
    .line 904
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 905
    .line 906
    const-string v1, "swipe_repeat_enable"

    .line 907
    .line 908
    const-string v2, "\u53f3\u6ed1\u590d\u8bfb"

    .line 909
    .line 910
    const-string v3, "\u53f3\u6ed1\u6d88\u606f\u540e\u590d\u8bfb\u5230\u5f53\u524d\u804a\u5929"

    .line 911
    .line 912
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 913
    .line 914
    .line 915
    const/4 p1, 0x0

    .line 916
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 917
    .line 918
    .line 919
    const-string v1, "repeat_menu_enable"

    .line 920
    .line 921
    const-string v2, "\u957f\u6309\u83dc\u5355\u590d\u8bfb"

    .line 922
    .line 923
    const-string v3, "\u957f\u6309\u6d88\u606f\u540e\u70b9\u51fb +1 \u590d\u8bfb\u5230\u5f53\u524d\u804a\u5929"

    .line 924
    .line 925
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 926
    .line 927
    .line 928
    goto :goto_25

    .line 929
    :cond_25
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 930
    .line 931
    .line 932
    :goto_25
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 933
    .line 934
    return-object p1

    .line 935
    :pswitch_12
    move-object v5, p1

    .line 936
    check-cast v5, Li0/h0;

    .line 937
    .line 938
    check-cast p2, Ljava/lang/Integer;

    .line 939
    .line 940
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 941
    .line 942
    .line 943
    move-result p1

    .line 944
    and-int/lit8 p2, p1, 0x3

    .line 945
    .line 946
    const/4 v0, 0x2

    .line 947
    const/4 v1, 0x1

    .line 948
    if-eq p2, v0, :cond_26

    .line 949
    .line 950
    move p2, v1

    .line 951
    goto :goto_26

    .line 952
    :cond_26
    const/4 p2, 0x0

    .line 953
    :goto_26
    and-int/2addr p1, v1

    .line 954
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 955
    .line 956
    .line 957
    move-result p1

    .line 958
    if-eqz p1, :cond_27

    .line 959
    .line 960
    const/4 v4, 0x0

    .line 961
    const/16 v6, 0x6db0

    .line 962
    .line 963
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 964
    .line 965
    const-string v1, "swipe_quote_enable"

    .line 966
    .line 967
    const-string v2, "\u5de6\u6ed1\u5f15\u7528\u56de\u590d"

    .line 968
    .line 969
    const-string v3, "\u5de6\u6ed1\u6d88\u606f\u540e\u8c03\u7528\u5fae\u4fe1\u539f\u751f\u5f15\u7528\u5165\u53e3"

    .line 970
    .line 971
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 972
    .line 973
    .line 974
    goto :goto_27

    .line 975
    :cond_27
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 976
    .line 977
    .line 978
    :goto_27
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 979
    .line 980
    return-object p1

    .line 981
    :pswitch_13
    move-object v5, p1

    .line 982
    check-cast v5, Li0/h0;

    .line 983
    .line 984
    check-cast p2, Ljava/lang/Integer;

    .line 985
    .line 986
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 987
    .line 988
    .line 989
    move-result p1

    .line 990
    and-int/lit8 p2, p1, 0x3

    .line 991
    .line 992
    const/4 v0, 0x2

    .line 993
    const/4 v1, 0x1

    .line 994
    if-eq p2, v0, :cond_28

    .line 995
    .line 996
    move p2, v1

    .line 997
    goto :goto_28

    .line 998
    :cond_28
    const/4 p2, 0x0

    .line 999
    :goto_28
    and-int/2addr p1, v1

    .line 1000
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1001
    .line 1002
    .line 1003
    move-result p1

    .line 1004
    if-eqz p1, :cond_29

    .line 1005
    .line 1006
    const/4 v4, 0x0

    .line 1007
    const/16 v6, 0x6db0

    .line 1008
    .line 1009
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1010
    .line 1011
    const-string v1, "disable_pat_enable"

    .line 1012
    .line 1013
    const-string v2, "\u7981\u6b62\u62cd\u4e00\u62cd"

    .line 1014
    .line 1015
    const-string v3, "\u53cc\u51fb\u804a\u5929\u5934\u50cf\u65f6\u4e0d\u53d1\u9001\u62cd\u4e00\u62cd"

    .line 1016
    .line 1017
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1018
    .line 1019
    .line 1020
    goto :goto_29

    .line 1021
    :cond_29
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1022
    .line 1023
    .line 1024
    :goto_29
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1025
    .line 1026
    return-object p1

    .line 1027
    :pswitch_14
    move-object v5, p1

    .line 1028
    check-cast v5, Li0/h0;

    .line 1029
    .line 1030
    check-cast p2, Ljava/lang/Integer;

    .line 1031
    .line 1032
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1033
    .line 1034
    .line 1035
    move-result p1

    .line 1036
    and-int/lit8 p2, p1, 0x3

    .line 1037
    .line 1038
    const/4 v0, 0x2

    .line 1039
    const/4 v1, 0x1

    .line 1040
    if-eq p2, v0, :cond_2a

    .line 1041
    .line 1042
    move p2, v1

    .line 1043
    goto :goto_2a

    .line 1044
    :cond_2a
    const/4 p2, 0x0

    .line 1045
    :goto_2a
    and-int/2addr p1, v1

    .line 1046
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1047
    .line 1048
    .line 1049
    move-result p1

    .line 1050
    if-eqz p1, :cond_2b

    .line 1051
    .line 1052
    const/4 v4, 0x0

    .line 1053
    const/16 v6, 0x6db0

    .line 1054
    .line 1055
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1056
    .line 1057
    const-string v1, "quick_terminate_enable"

    .line 1058
    .line 1059
    const-string v2, "\u5feb\u6377\u7ec8\u6b62"

    .line 1060
    .line 1061
    const-string v3, "\u5728\u5fae\u4fe1\u53f3\u4e0a\u89d2\u52a0\u53f7\u83dc\u5355\u4e2d\u6dfb\u52a0\u5feb\u6377\u7ec8\u6b62\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u751f\u6548"

    .line 1062
    .line 1063
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1064
    .line 1065
    .line 1066
    goto :goto_2b

    .line 1067
    :cond_2b
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1068
    .line 1069
    .line 1070
    :goto_2b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1071
    .line 1072
    return-object p1

    .line 1073
    :pswitch_15
    move-object v5, p1

    .line 1074
    check-cast v5, Li0/h0;

    .line 1075
    .line 1076
    check-cast p2, Ljava/lang/Integer;

    .line 1077
    .line 1078
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1079
    .line 1080
    .line 1081
    move-result p1

    .line 1082
    and-int/lit8 p2, p1, 0x3

    .line 1083
    .line 1084
    const/4 v0, 0x2

    .line 1085
    const/4 v7, 0x0

    .line 1086
    const/4 v8, 0x1

    .line 1087
    if-eq p2, v0, :cond_2c

    .line 1088
    .line 1089
    move p2, v8

    .line 1090
    goto :goto_2c

    .line 1091
    :cond_2c
    move p2, v7

    .line 1092
    :goto_2c
    and-int/2addr p1, v8

    .line 1093
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1094
    .line 1095
    .line 1096
    move-result p1

    .line 1097
    if-eqz p1, :cond_2d

    .line 1098
    .line 1099
    const/4 v4, 0x0

    .line 1100
    const/16 v6, 0x6db0

    .line 1101
    .line 1102
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1103
    .line 1104
    const-string v1, "drag_read_enable"

    .line 1105
    .line 1106
    const-string v2, "\u62d6\u62fd\u5df2\u8bfb"

    .line 1107
    .line 1108
    const-string v3, "\u5728\u5fae\u4fe1\u5e95\u90e8\u672a\u8bfb\u89d2\u6807\u5411\u4e0a\u62d6\u52a8\u540e\uff0c\u6e05\u7a7a\u5168\u90e8\u4f1a\u8bdd\u672a\u8bfb"

    .line 1109
    .line 1110
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1111
    .line 1112
    .line 1113
    const/4 p1, 0x0

    .line 1114
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1115
    .line 1116
    .line 1117
    const-string v1, "plus_menu_read_enable"

    .line 1118
    .line 1119
    const-string v2, "\u6ce8\u5165\u52a0\u53f7\u83dc\u5355\u5df2\u8bfb"

    .line 1120
    .line 1121
    const-string v3, "\u5728\u53f3\u4e0a\u89d2\u52a0\u53f7\u83dc\u5355\u6dfb\u52a0\u201c\u5168\u90e8\u5df2\u8bfb\u201d\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u751f\u6548"

    .line 1122
    .line 1123
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_2d

    .line 1127
    :cond_2d
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1128
    .line 1129
    .line 1130
    :goto_2d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1131
    .line 1132
    return-object p1

    .line 1133
    :pswitch_16
    move-object v5, p1

    .line 1134
    check-cast v5, Li0/h0;

    .line 1135
    .line 1136
    check-cast p2, Ljava/lang/Integer;

    .line 1137
    .line 1138
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1139
    .line 1140
    .line 1141
    move-result p1

    .line 1142
    and-int/lit8 p2, p1, 0x3

    .line 1143
    .line 1144
    const/4 v0, 0x2

    .line 1145
    const/4 v1, 0x1

    .line 1146
    if-eq p2, v0, :cond_2e

    .line 1147
    .line 1148
    move p2, v1

    .line 1149
    goto :goto_2e

    .line 1150
    :cond_2e
    const/4 p2, 0x0

    .line 1151
    :goto_2e
    and-int/2addr p1, v1

    .line 1152
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1153
    .line 1154
    .line 1155
    move-result p1

    .line 1156
    if-eqz p1, :cond_2f

    .line 1157
    .line 1158
    const/4 v4, 0x0

    .line 1159
    const/16 v6, 0x6db0

    .line 1160
    .line 1161
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1162
    .line 1163
    const-string v1, "message_forward_favorite_enable"

    .line 1164
    .line 1165
    const-string v2, "\u8f6c\u53d1\u6536\u85cf"

    .line 1166
    .line 1167
    const-string v3, "\u957f\u6309\u6536\u85cf\u540e\u663e\u793a\u8f6c\u53d1[H]"

    .line 1168
    .line 1169
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1170
    .line 1171
    .line 1172
    goto :goto_2f

    .line 1173
    :cond_2f
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1174
    .line 1175
    .line 1176
    :goto_2f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1177
    .line 1178
    return-object p1

    .line 1179
    :pswitch_17
    move-object v5, p1

    .line 1180
    check-cast v5, Li0/h0;

    .line 1181
    .line 1182
    check-cast p2, Ljava/lang/Integer;

    .line 1183
    .line 1184
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1185
    .line 1186
    .line 1187
    move-result p1

    .line 1188
    and-int/lit8 p2, p1, 0x3

    .line 1189
    .line 1190
    const/4 v0, 0x2

    .line 1191
    const/4 v1, 0x1

    .line 1192
    if-eq p2, v0, :cond_30

    .line 1193
    .line 1194
    move p2, v1

    .line 1195
    goto :goto_30

    .line 1196
    :cond_30
    const/4 p2, 0x0

    .line 1197
    :goto_30
    and-int/2addr p1, v1

    .line 1198
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1199
    .line 1200
    .line 1201
    move-result p1

    .line 1202
    if-eqz p1, :cond_31

    .line 1203
    .line 1204
    const/4 v4, 0x0

    .line 1205
    const/16 v6, 0x6db0

    .line 1206
    .line 1207
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1208
    .line 1209
    const-string v1, "message_text_color_enable"

    .line 1210
    .line 1211
    const-string v2, "\u542f\u7528\u6d88\u606f\u6587\u672c\u989c\u8272"

    .line 1212
    .line 1213
    const-string v3, "\u5904\u7406\u804a\u5929\u91cc\u7684\u6587\u672c\u6d88\u606f\u548c\u5f15\u7528\u6d88\u606f\u6b63\u6587"

    .line 1214
    .line 1215
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1216
    .line 1217
    .line 1218
    goto :goto_31

    .line 1219
    :cond_31
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1220
    .line 1221
    .line 1222
    :goto_31
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1223
    .line 1224
    return-object p1

    .line 1225
    :pswitch_18
    move-object v5, p1

    .line 1226
    check-cast v5, Li0/h0;

    .line 1227
    .line 1228
    check-cast p2, Ljava/lang/Integer;

    .line 1229
    .line 1230
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1231
    .line 1232
    .line 1233
    move-result p1

    .line 1234
    and-int/lit8 p2, p1, 0x3

    .line 1235
    .line 1236
    const/4 v0, 0x2

    .line 1237
    const/4 v1, 0x1

    .line 1238
    if-eq p2, v0, :cond_32

    .line 1239
    .line 1240
    move p2, v1

    .line 1241
    goto :goto_32

    .line 1242
    :cond_32
    const/4 p2, 0x0

    .line 1243
    :goto_32
    and-int/2addr p1, v1

    .line 1244
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1245
    .line 1246
    .line 1247
    move-result p1

    .line 1248
    if-eqz p1, :cond_33

    .line 1249
    .line 1250
    const/4 v4, 0x0

    .line 1251
    const/16 v6, 0x6db0

    .line 1252
    .line 1253
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1254
    .line 1255
    const-string v1, "hide_wechat_bottom_bar_enable"

    .line 1256
    .line 1257
    const-string v2, "\u9690\u85cf\u5fae\u4fe1\u5e95\u680f"

    .line 1258
    .line 1259
    const-string v3, "\u9690\u85cf\u5e95\u90e8\u7684\u5fae\u4fe1\u3001\u901a\u8baf\u5f55\u3001\u53d1\u73b0\u548c\u6211"

    .line 1260
    .line 1261
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1262
    .line 1263
    .line 1264
    goto :goto_33

    .line 1265
    :cond_33
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1266
    .line 1267
    .line 1268
    :goto_33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1269
    .line 1270
    return-object p1

    .line 1271
    :pswitch_19
    move-object v5, p1

    .line 1272
    check-cast v5, Li0/h0;

    .line 1273
    .line 1274
    check-cast p2, Ljava/lang/Integer;

    .line 1275
    .line 1276
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1277
    .line 1278
    .line 1279
    move-result p1

    .line 1280
    and-int/lit8 p2, p1, 0x3

    .line 1281
    .line 1282
    const/4 v0, 0x2

    .line 1283
    const/4 v1, 0x1

    .line 1284
    if-eq p2, v0, :cond_34

    .line 1285
    .line 1286
    move p2, v1

    .line 1287
    goto :goto_34

    .line 1288
    :cond_34
    const/4 p2, 0x0

    .line 1289
    :goto_34
    and-int/2addr p1, v1

    .line 1290
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1291
    .line 1292
    .line 1293
    move-result p1

    .line 1294
    if-eqz p1, :cond_35

    .line 1295
    .line 1296
    const/4 v4, 0x0

    .line 1297
    const/16 v6, 0x6db0

    .line 1298
    .line 1299
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1300
    .line 1301
    const-string v1, "auto_original_image_enable"

    .line 1302
    .line 1303
    const-string v2, "\u81ea\u52a8\u52fe\u9009\u539f\u56fe"

    .line 1304
    .line 1305
    const-string v3, "\u8fdb\u5165\u804a\u5929\u56fe\u7247\u53d1\u9001\u754c\u9762\u65f6\u81ea\u52a8\u9009\u62e9\u539f\u56fe"

    .line 1306
    .line 1307
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1308
    .line 1309
    .line 1310
    goto :goto_35

    .line 1311
    :cond_35
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1312
    .line 1313
    .line 1314
    :goto_35
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1315
    .line 1316
    return-object p1

    .line 1317
    :pswitch_1a
    move-object v5, p1

    .line 1318
    check-cast v5, Li0/h0;

    .line 1319
    .line 1320
    check-cast p2, Ljava/lang/Integer;

    .line 1321
    .line 1322
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1323
    .line 1324
    .line 1325
    move-result p1

    .line 1326
    and-int/lit8 p2, p1, 0x3

    .line 1327
    .line 1328
    const/4 v0, 0x2

    .line 1329
    const/4 v1, 0x1

    .line 1330
    if-eq p2, v0, :cond_36

    .line 1331
    .line 1332
    move p2, v1

    .line 1333
    goto :goto_36

    .line 1334
    :cond_36
    const/4 p2, 0x0

    .line 1335
    :goto_36
    and-int/2addr p1, v1

    .line 1336
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1337
    .line 1338
    .line 1339
    move-result p1

    .line 1340
    if-eqz p1, :cond_37

    .line 1341
    .line 1342
    const/4 v4, 0x0

    .line 1343
    const/16 v6, 0x6db0

    .line 1344
    .line 1345
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1346
    .line 1347
    const-string v1, "remove_forward_limit_enable"

    .line 1348
    .line 1349
    const-string v2, "\u79fb\u9664\u8f6c\u53d1\u9650\u5236"

    .line 1350
    .line 1351
    const-string v3, "\u5141\u8bb8\u5fae\u4fe1\u539f\u751f\u8f6c\u53d1\u9009\u62e9\u8d85\u8fc7 9 \u4e2a\u4f1a\u8bdd\uff1b\u5927\u91cf\u76ee\u6807\u4ecd\u53d7\u5fae\u4fe1\u53d1\u9001\u80fd\u529b\u9650\u5236"

    .line 1352
    .line 1353
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1354
    .line 1355
    .line 1356
    goto :goto_37

    .line 1357
    :cond_37
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1358
    .line 1359
    .line 1360
    :goto_37
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1361
    .line 1362
    return-object p1

    .line 1363
    :pswitch_1b
    move-object v5, p1

    .line 1364
    check-cast v5, Li0/h0;

    .line 1365
    .line 1366
    check-cast p2, Ljava/lang/Integer;

    .line 1367
    .line 1368
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1369
    .line 1370
    .line 1371
    move-result p1

    .line 1372
    and-int/lit8 p2, p1, 0x3

    .line 1373
    .line 1374
    const/4 v0, 0x2

    .line 1375
    const/4 v7, 0x0

    .line 1376
    const/4 v8, 0x1

    .line 1377
    if-eq p2, v0, :cond_38

    .line 1378
    .line 1379
    move p2, v8

    .line 1380
    goto :goto_38

    .line 1381
    :cond_38
    move p2, v7

    .line 1382
    :goto_38
    and-int/2addr p1, v8

    .line 1383
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1384
    .line 1385
    .line 1386
    move-result p1

    .line 1387
    if-eqz p1, :cond_39

    .line 1388
    .line 1389
    const/4 v4, 0x0

    .line 1390
    const/16 v6, 0x6db0

    .line 1391
    .line 1392
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1393
    .line 1394
    const-string v1, "plus_menu_enable"

    .line 1395
    .line 1396
    const-string v2, "\u6ce8\u5165\u52a0\u53f7\u83dc\u5355"

    .line 1397
    .line 1398
    const-string v3, "\u5728\u5fae\u4fe1\u53f3\u4e0a\u89d2\u52a0\u53f7\u83dc\u5355\u4e2d\u663e\u793a Hchat \u5165\u53e3\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u751f\u6548"

    .line 1399
    .line 1400
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1401
    .line 1402
    .line 1403
    const/4 p1, 0x0

    .line 1404
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1405
    .line 1406
    .line 1407
    const-string v1, "plus_long_press_enable"

    .line 1408
    .line 1409
    const-string v2, "\u957f\u6309\u52a0\u53f7\u5165\u53e3"

    .line 1410
    .line 1411
    const-string v3, "\u957f\u6309\u5fae\u4fe1\u53f3\u4e0a\u89d2\u52a0\u53f7\u6253\u5f00 Hchat \u8bbe\u7f6e\uff0c\u91cd\u542f\u5fae\u4fe1\u540e\u751f\u6548"

    .line 1412
    .line 1413
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1414
    .line 1415
    .line 1416
    goto :goto_39

    .line 1417
    :cond_39
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1418
    .line 1419
    .line 1420
    :goto_39
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1421
    .line 1422
    return-object p1

    .line 1423
    :pswitch_1c
    move-object v5, p1

    .line 1424
    check-cast v5, Li0/h0;

    .line 1425
    .line 1426
    check-cast p2, Ljava/lang/Integer;

    .line 1427
    .line 1428
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 1429
    .line 1430
    .line 1431
    move-result p1

    .line 1432
    and-int/lit8 p2, p1, 0x3

    .line 1433
    .line 1434
    const/4 v0, 0x2

    .line 1435
    const/4 v7, 0x0

    .line 1436
    const/4 v8, 0x1

    .line 1437
    if-eq p2, v0, :cond_3a

    .line 1438
    .line 1439
    move p2, v8

    .line 1440
    goto :goto_3a

    .line 1441
    :cond_3a
    move p2, v7

    .line 1442
    :goto_3a
    and-int/2addr p1, v8

    .line 1443
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 1444
    .line 1445
    .line 1446
    move-result p1

    .line 1447
    if-eqz p1, :cond_3b

    .line 1448
    .line 1449
    const/4 v4, 0x0

    .line 1450
    const/16 v6, 0x6db0

    .line 1451
    .line 1452
    iget-object v0, p0, Lwb/l8;->h:Landroid/content/SharedPreferences;

    .line 1453
    .line 1454
    const-string v1, "hide_chat_avatar_self"

    .line 1455
    .line 1456
    const-string v2, "\u9690\u85cf\u81ea\u5df1\u7684\u5934\u50cf"

    .line 1457
    .line 1458
    const-string v3, "\u5728\u7fa4\u804a\u548c\u79c1\u804a\u4e2d\u9690\u85cf\u81ea\u5df1\u53d1\u9001\u6d88\u606f\u7684\u5934\u50cf"

    .line 1459
    .line 1460
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1461
    .line 1462
    .line 1463
    const/4 p1, 0x0

    .line 1464
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 1465
    .line 1466
    .line 1467
    const-string v1, "hide_chat_avatar_other"

    .line 1468
    .line 1469
    const-string v2, "\u9690\u85cf\u5bf9\u65b9\u7684\u5934\u50cf"

    .line 1470
    .line 1471
    const-string v3, "\u5728\u7fa4\u804a\u548c\u79c1\u804a\u4e2d\u9690\u85cf\u5bf9\u65b9\u53d1\u9001\u6d88\u606f\u7684\u5934\u50cf"

    .line 1472
    .line 1473
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 1474
    .line 1475
    .line 1476
    goto :goto_3b

    .line 1477
    :cond_3b
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 1478
    .line 1479
    .line 1480
    :goto_3b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 1481
    .line 1482
    return-object p1

    .line 1483
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
