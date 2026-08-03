.class public final synthetic Lq9/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf8/d;
.implements Lsa/d;
.implements Lwa/h;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Lc9/g;)V
    .locals 0

    .line 1
    const/16 p2, 0x10

    .line 2
    .line 3
    iput p2, p0, Lq9/a;->g:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lq9/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 11
    iput p2, p0, Lq9/a;->g:I

    iput-object p1, p0, Lq9/a;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lq9/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lta/c;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lta/c;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lq9/a;->g:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lz8/e;

    .line 11
    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    check-cast v2, Lf8/e;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v2, Lv0/a;

    .line 20
    .line 21
    const/16 v3, 0xc

    .line 22
    .line 23
    invoke-direct {v2, v1, v3}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    const/16 v1, 0xc

    .line 27
    .line 28
    const-string v3, "call_ringtone_block"

    .line 29
    .line 30
    const-string v4, "\u5c4f\u853d\u901a\u8bdd\u94c3\u58f0"

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_1
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Lz8/a;

    .line 40
    .line 41
    move-object/from16 v2, p1

    .line 42
    .line 43
    check-cast v2, Lf8/e;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    new-instance v2, Lv0/a;

    .line 49
    .line 50
    const/16 v3, 0xb

    .line 51
    .line 52
    invoke-direct {v2, v1, v3}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    const/16 v1, 0xc

    .line 56
    .line 57
    const-string v3, "call_media_limit"

    .line 58
    .line 59
    const-string v4, "\u79fb\u9664\u901a\u8bdd\u5a92\u4f53\u9650\u5236"

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_2
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ly9/c;

    .line 69
    .line 70
    move-object/from16 v2, p1

    .line 71
    .line 72
    check-cast v2, Lf8/e;

    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance v2, Lv0/a;

    .line 78
    .line 79
    const/16 v3, 0xa

    .line 80
    .line 81
    invoke-direct {v2, v1, v3}, Lv0/a;-><init>(Ljava/lang/Object;I)V

    .line 82
    .line 83
    .line 84
    const/16 v1, 0xc

    .line 85
    .line 86
    const-string v3, "member_title"

    .line 87
    .line 88
    const-string v4, "\u7fa4\u5458\u5934\u8854"

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_3
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Lxa/c;

    .line 98
    .line 99
    move-object/from16 v2, p1

    .line 100
    .line 101
    check-cast v2, Lf8/e;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lxa/c;->k()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_4
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, Lu9/c;

    .line 113
    .line 114
    move-object/from16 v2, p1

    .line 115
    .line 116
    check-cast v2, Lf8/e;

    .line 117
    .line 118
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v2, Li/e0;

    .line 122
    .line 123
    const/16 v3, 0x1d

    .line 124
    .line 125
    invoke-direct {v2, v1, v3}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 126
    .line 127
    .line 128
    const/16 v1, 0xc

    .line 129
    .line 130
    const-string v3, "hide_wechat_bottom_bar"

    .line 131
    .line 132
    const-string v4, "\u9690\u85cf\u5fae\u4fe1\u5e95\u680f"

    .line 133
    .line 134
    const/4 v5, 0x0

    .line 135
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :pswitch_5
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v1, Lb9/a;

    .line 142
    .line 143
    move-object/from16 v2, p1

    .line 144
    .line 145
    check-cast v2, Lf8/e;

    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    new-instance v2, Li/e0;

    .line 151
    .line 152
    const/16 v3, 0x18

    .line 153
    .line 154
    invoke-direct {v2, v1, v3}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    const/16 v1, 0xc

    .line 158
    .line 159
    const-string v3, "hide_chat_menu"

    .line 160
    .line 161
    const-string v4, "\u9690\u85cf\u957f\u6309\u83dc\u5355"

    .line 162
    .line 163
    const/4 v5, 0x0

    .line 164
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :pswitch_6
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, Lb9/a;

    .line 171
    .line 172
    move-object/from16 v2, p1

    .line 173
    .line 174
    check-cast v2, Lf8/e;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v2, Li/e0;

    .line 180
    .line 181
    const/16 v3, 0x14

    .line 182
    .line 183
    invoke-direct {v2, v1, v3}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 184
    .line 185
    .line 186
    const/16 v1, 0xc

    .line 187
    .line 188
    const-string v3, "hide_chat_avatar"

    .line 189
    .line 190
    const-string v4, "\u9690\u85cf\u5934\u50cf"

    .line 191
    .line 192
    const/4 v5, 0x0

    .line 193
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :pswitch_7
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v1, Ls8/c;

    .line 200
    .line 201
    move-object/from16 v2, p1

    .line 202
    .line 203
    check-cast v2, Lf8/g;

    .line 204
    .line 205
    if-eqz v2, :cond_3

    .line 206
    .line 207
    iget-wide v3, v2, Lf8/g;->g:J

    .line 208
    .line 209
    const-wide/16 v5, 0x0

    .line 210
    .line 211
    cmp-long v3, v3, v5

    .line 212
    .line 213
    if-lez v3, :cond_3

    .line 214
    .line 215
    iget-object v3, v2, Lf8/g;->c:Ljava/lang/String;

    .line 216
    .line 217
    if-eqz v3, :cond_3

    .line 218
    .line 219
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-eqz v3, :cond_0

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_0
    sget-object v3, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 227
    .line 228
    iget-object v7, v2, Lf8/g;->c:Ljava/lang/String;

    .line 229
    .line 230
    iget-object v8, v2, Lf8/g;->b:Ljava/lang/String;

    .line 231
    .line 232
    iget-object v9, v2, Lf8/g;->d:Ljava/lang/String;

    .line 233
    .line 234
    iget-wide v10, v2, Lf8/g;->f:J

    .line 235
    .line 236
    cmp-long v4, v10, v5

    .line 237
    .line 238
    if-lez v4, :cond_1

    .line 239
    .line 240
    const-wide/16 v4, 0x3e8

    .line 241
    .line 242
    mul-long v5, v10, v4

    .line 243
    .line 244
    :cond_1
    move-wide v10, v5

    .line 245
    iget-boolean v12, v2, Lf8/g;->k:Z

    .line 246
    .line 247
    iget-object v4, v2, Lf8/g;->e:Ljava/lang/String;

    .line 248
    .line 249
    if-eqz v4, :cond_2

    .line 250
    .line 251
    const/16 v5, 0xa

    .line 252
    .line 253
    invoke-static {v5, v4}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    if-eqz v4, :cond_2

    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    :goto_0
    move v13, v4

    .line 264
    goto :goto_1

    .line 265
    :cond_2
    const/4 v4, 0x0

    .line 266
    goto :goto_0

    .line 267
    :goto_1
    iget-wide v14, v2, Lf8/g;->g:J

    .line 268
    .line 269
    iget-object v4, v2, Lf8/g;->h:Ljava/lang/String;

    .line 270
    .line 271
    iget-object v2, v2, Lf8/g;->i:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-object/from16 v17, v2

    .line 277
    .line 278
    move-object/from16 v16, v4

    .line 279
    .line 280
    invoke-static/range {v7 .. v17}, Ll8/d;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZIJLjava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v1, v2}, Ls8/c;->N(Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 285
    .line 286
    .line 287
    :cond_3
    :goto_2
    return-void

    .line 288
    :pswitch_8
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v1, Lrb/b;

    .line 291
    .line 292
    move-object/from16 v2, p1

    .line 293
    .line 294
    check-cast v2, Lf8/e;

    .line 295
    .line 296
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    new-instance v2, Li/e0;

    .line 300
    .line 301
    const/16 v3, 0x10

    .line 302
    .line 303
    invoke-direct {v2, v1, v3}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 304
    .line 305
    .line 306
    const/16 v1, 0xc

    .line 307
    .line 308
    const-string v3, "zombie_check"

    .line 309
    .line 310
    const-string v4, "\u50f5\u5c38\u7c89\u68c0\u6d4b"

    .line 311
    .line 312
    const/4 v5, 0x0

    .line 313
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :pswitch_9
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v1, Lr9/a;

    .line 320
    .line 321
    move-object/from16 v2, p1

    .line 322
    .line 323
    check-cast v2, Lf8/e;

    .line 324
    .line 325
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v2, Li/e0;

    .line 329
    .line 330
    const/16 v3, 0xf

    .line 331
    .line 332
    invoke-direct {v2, v1, v3}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 333
    .line 334
    .line 335
    const/16 v1, 0xc

    .line 336
    .line 337
    const-string v3, "hchat_extra"

    .line 338
    .line 339
    const-string v4, "\u5206\u652f\u6269\u5c55\u529f\u80fd"

    .line 340
    .line 341
    const/4 v5, 0x0

    .line 342
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :pswitch_a
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v1, Lqb/a;

    .line 349
    .line 350
    move-object/from16 v2, p1

    .line 351
    .line 352
    check-cast v2, Lf8/e;

    .line 353
    .line 354
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    new-instance v2, Li/e0;

    .line 358
    .line 359
    const/16 v3, 0xd

    .line 360
    .line 361
    invoke-direct {v2, v1, v3}, Li/e0;-><init>(Ljava/lang/Object;I)V

    .line 362
    .line 363
    .line 364
    const/16 v1, 0xc

    .line 365
    .line 366
    const-string v3, "voice_forward"

    .line 367
    .line 368
    const-string v4, "\u8bed\u97f3\u8f6c\u53d1\u4fdd\u5b58"

    .line 369
    .line 370
    const/4 v5, 0x0

    .line 371
    invoke-static {v1, v2, v3, v4, v5}, Lr8/e;->f(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lr8/c;)V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :pswitch_b
    iget-object v1, v0, Lq9/a;->h:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v1, Lhb/r;

    .line 378
    .line 379
    move-object/from16 v2, p1

    .line 380
    .line 381
    check-cast v2, Lf8/e;

    .line 382
    .line 383
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1}, Lhb/r;->p()V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    nop

    .line 391
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/lang/String;Z)V
    .locals 3

    .line 1
    iget-object p2, p0, Lq9/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p2, Landroid/content/Context;

    .line 4
    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Leb/w;

    .line 15
    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-direct {v1, p2, p1, v2}, Leb/w;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public d(Ljava/lang/String;)Leb/l0;
    .locals 8

    .line 1
    iget-object v0, p0, Lq9/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "message_affix_enable"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_9

    .line 17
    .line 18
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto/16 :goto_5

    .line 25
    .line 26
    :cond_0
    const-string p1, "message_affix_text_format"

    .line 27
    .line 28
    const-string v1, "${sendText}"

    .line 29
    .line 30
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v4, ""

    .line 35
    .line 36
    if-nez p1, :cond_1

    .line 37
    .line 38
    move-object p1, v4

    .line 39
    :cond_1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    move-object p1, v1

    .line 46
    :cond_2
    move v5, v2

    .line 47
    move v6, v5

    .line 48
    :goto_0
    const/4 v7, 0x4

    .line 49
    invoke-static {p1, v1, v5, v2, v7}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-gez v5, :cond_8

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    if-eq v6, v5, :cond_3

    .line 57
    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :cond_3
    const/4 v5, 0x6

    .line 61
    invoke-static {p1, v1, v2, v2, v5}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    const-string v5, "message_affix_time_format"

    .line 66
    .line 67
    const-string v6, "HH:mm:ss"

    .line 68
    .line 69
    invoke-interface {v0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    move-object v4, v0

    .line 77
    :goto_1
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_5

    .line 90
    .line 91
    move-object v0, v6

    .line 92
    :cond_5
    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    .line 93
    .line 94
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-direct {v4, v0, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 99
    .line 100
    .line 101
    new-instance v0, Ljava/util/Date;

    .line 102
    .line 103
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception v0

    .line 112
    new-instance v4, Lsf/f;

    .line 113
    .line 114
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    move-object v0, v4

    .line 118
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-nez v4, :cond_6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_6
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 126
    .line 127
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    invoke-direct {v0, v6, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 132
    .line 133
    .line 134
    new-instance v4, Ljava/util/Date;

    .line 135
    .line 136
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    check-cast v0, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    const-string v5, "${line}"

    .line 153
    .line 154
    const-string v6, "\n"

    .line 155
    .line 156
    invoke-static {v4, v5, v6, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    const-string v7, "${sendTime}"

    .line 161
    .line 162
    invoke-static {v4, v7, v0, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    add-int/lit8 v1, v1, 0xb

    .line 167
    .line 168
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p1, v5, v6, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1, v7, v0, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-nez v0, :cond_7

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_7

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_7
    new-instance v3, Leb/l0;

    .line 194
    .line 195
    invoke-direct {v3, v4, p1}, Leb/l0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :goto_4
    return-object v3

    .line 199
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 200
    .line 201
    add-int/lit8 v5, v5, 0xb

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_9
    :goto_5
    return-object v3
.end method

.method public e()V
    .locals 9

    .line 1
    iget-object v0, p0, Lq9/a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lfg/p;

    .line 4
    .line 5
    sget-object v1, Lw0/m;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v2, Lw0/m;->h:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const/4 v4, 0x0

    .line 27
    move v5, v4

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const/4 v7, 0x1

    .line 39
    if-nez v5, :cond_1

    .line 40
    .line 41
    invoke-static {v6, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_1

    .line 46
    .line 47
    move v5, v7

    .line 48
    move v7, v4

    .line 49
    :cond_1
    if-eqz v7, :cond_0

    .line 50
    .line 51
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    sput-object v3, Lw0/m;->h:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    monitor-exit v1

    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    monitor-exit v1

    .line 61
    throw v0
.end method
