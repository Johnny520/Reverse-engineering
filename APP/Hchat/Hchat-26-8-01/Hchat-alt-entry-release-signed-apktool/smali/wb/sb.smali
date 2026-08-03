.class public final synthetic Lwb/sb;
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
    const/4 p2, 0x4

    .line 2
    iput p2, p0, Lwb/sb;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;IB)V
    .locals 0

    .line 10
    iput p2, p0, Lwb/sb;->g:I

    iput-object p1, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/sb;->g:I

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
    const/4 v5, 0x1

    .line 32
    const/16 v7, 0x6db0

    .line 33
    .line 34
    iget-object v1, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 35
    .line 36
    const-string v2, "selected_messages_enable"

    .line 37
    .line 38
    const-string v3, "\u7fa4\u53d1\u52a9\u624b"

    .line 39
    .line 40
    const-string v4, "\u5728\u591a\u9009\u6d88\u606f\u83dc\u5355\u4e2d\u663e\u793a\u7fa4\u53d1\u52a9\u624b[H]\u548c\u5b9a\u65f6\u8f6c\u53d1[H]"

    .line 41
    .line 42
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 43
    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const-string v2, "selected_messages_background_silent_send"

    .line 47
    .line 48
    const-string v3, "\u540e\u53f0\u9759\u9ed8\u53d1\u9001"

    .line 49
    .line 50
    const-string v4, "\u7fa4\u53d1\u65f6\u4e0d\u663e\u793a\u53d1\u9001\u8fdb\u5ea6\u7a97\u53e3"

    .line 51
    .line 52
    invoke-static/range {v1 .. v7}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_0
    move-object v5, p1

    .line 63
    check-cast v5, Li0/h0;

    .line 64
    .line 65
    check-cast p2, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    and-int/lit8 p2, p1, 0x3

    .line 72
    .line 73
    const/4 v0, 0x2

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v8, 0x1

    .line 76
    if-eq p2, v0, :cond_2

    .line 77
    .line 78
    move p2, v8

    .line 79
    goto :goto_2

    .line 80
    :cond_2
    move p2, v7

    .line 81
    :goto_2
    and-int/2addr p1, v8

    .line 82
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    const/16 v6, 0x6db0

    .line 90
    .line 91
    iget-object v0, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 92
    .line 93
    const-string v1, "hb_fake_packet_enable"

    .line 94
    .line 95
    const-string v2, "\u5f00\u542f\u5047\u7ea2\u5305"

    .line 96
    .line 97
    const-string v3, "\u53d1\u9001\u5047\u7ea2\u5305\u65f6\u4fee\u6b63\u8bf7\u6c42\u548c\u54cd\u5e94"

    .line 98
    .line 99
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x0

    .line 103
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 104
    .line 105
    .line 106
    const-string v1, "hb_fake_packet_receive_enable"

    .line 107
    .line 108
    const-string v2, "\u9886\u53d6\u5047\u7ea2\u5305"

    .line 109
    .line 110
    const-string v3, "\u6536\u5230\u5f02\u5e38\u7fa4 ID \u7ea2\u5305\u65f6\u5c1d\u8bd5\u4fee\u6b63"

    .line 111
    .line 112
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_3
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 117
    .line 118
    .line 119
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 120
    .line 121
    return-object p1

    .line 122
    :pswitch_1
    move-object v5, p1

    .line 123
    check-cast v5, Li0/h0;

    .line 124
    .line 125
    check-cast p2, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    and-int/lit8 p2, p1, 0x3

    .line 132
    .line 133
    const/4 v0, 0x2

    .line 134
    const/4 v7, 0x0

    .line 135
    const/4 v8, 0x1

    .line 136
    if-eq p2, v0, :cond_4

    .line 137
    .line 138
    move p2, v8

    .line 139
    goto :goto_4

    .line 140
    :cond_4
    move p2, v7

    .line 141
    :goto_4
    and-int/2addr p1, v8

    .line 142
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_5

    .line 147
    .line 148
    const/4 v4, 0x1

    .line 149
    const/16 v6, 0x6db0

    .line 150
    .line 151
    iget-object v0, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 152
    .line 153
    const-string v1, "scope_chat"

    .line 154
    .line 155
    const-string v2, "\u804a\u5929\u6d88\u606f"

    .line 156
    .line 157
    const-string v3, "\u66ff\u6362\u7fa4\u804a\u548c\u79c1\u804a\u6d88\u606f\u5934\u50cf"

    .line 158
    .line 159
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 160
    .line 161
    .line 162
    const/4 p1, 0x0

    .line 163
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 164
    .line 165
    .line 166
    const-string v1, "scope_conversation"

    .line 167
    .line 168
    const-string v2, "\u4f1a\u8bdd\u5217\u8868"

    .line 169
    .line 170
    const-string v3, "\u66ff\u6362\u5fae\u4fe1\u9996\u9875\u7684\u597d\u53cb\u5934\u50cf"

    .line 171
    .line 172
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 173
    .line 174
    .line 175
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 176
    .line 177
    .line 178
    const-string v1, "scope_contacts"

    .line 179
    .line 180
    const-string v2, "\u901a\u8baf\u5f55"

    .line 181
    .line 182
    const-string v3, "\u66ff\u6362\u901a\u8baf\u5f55\u4e2d\u7684\u597d\u53cb\u5934\u50cf"

    .line 183
    .line 184
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 185
    .line 186
    .line 187
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 188
    .line 189
    .line 190
    const-string v1, "scope_profile"

    .line 191
    .line 192
    const-string v2, "\u597d\u53cb\u8d44\u6599\u9875"

    .line 193
    .line 194
    const-string v3, "\u66ff\u6362\u597d\u53cb\u8d44\u6599\u9875\u4e2d\u7684\u5934\u50cf"

    .line 195
    .line 196
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 197
    .line 198
    .line 199
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 200
    .line 201
    .line 202
    const-string v1, "scope_moments"

    .line 203
    .line 204
    const-string v2, "\u670b\u53cb\u5708"

    .line 205
    .line 206
    const-string v3, "\u66ff\u6362\u670b\u53cb\u5708\u4e2d\u7684\u597d\u53cb\u5934\u50cf"

    .line 207
    .line 208
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 209
    .line 210
    .line 211
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 212
    .line 213
    .line 214
    const-string v1, "scope_other_ui"

    .line 215
    .line 216
    const-string v2, "\u5176\u4ed6\u5fae\u4fe1\u754c\u9762"

    .line 217
    .line 218
    const-string v3, "\u66ff\u6362\u6536\u85cf\u3001\u641c\u7d22\u7b49\u754c\u9762\u4e2d\u7684\u597d\u53cb\u5934\u50cf"

    .line 219
    .line 220
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 221
    .line 222
    .line 223
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 224
    .line 225
    .line 226
    const-string v1, "scope_notifications"

    .line 227
    .line 228
    const-string v2, "\u6d88\u606f\u901a\u77e5"

    .line 229
    .line 230
    const-string v3, "\u66ff\u6362\u5fae\u4fe1\u539f\u751f\u901a\u77e5\u548c Hchat \u901a\u77e5\u4e2d\u7684\u597d\u53cb\u5934\u50cf"

    .line 231
    .line 232
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 233
    .line 234
    .line 235
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 236
    .line 237
    .line 238
    const-string v1, "scope_moments_notifications"

    .line 239
    .line 240
    const-string v2, "\u670b\u53cb\u5708\u901a\u77e5"

    .line 241
    .line 242
    const-string v3, "\u66ff\u6362\u670b\u53cb\u5708\u53d1\u5e03\u901a\u77e5\u4e2d\u7684\u597d\u53cb\u5934\u50cf"

    .line 243
    .line 244
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 245
    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_5
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 249
    .line 250
    .line 251
    :goto_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 252
    .line 253
    return-object p1

    .line 254
    :pswitch_2
    move-object v5, p1

    .line 255
    check-cast v5, Li0/h0;

    .line 256
    .line 257
    check-cast p2, Ljava/lang/Integer;

    .line 258
    .line 259
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    and-int/lit8 p2, p1, 0x3

    .line 264
    .line 265
    const/4 v0, 0x2

    .line 266
    const/4 v1, 0x1

    .line 267
    if-eq p2, v0, :cond_6

    .line 268
    .line 269
    move p2, v1

    .line 270
    goto :goto_6

    .line 271
    :cond_6
    const/4 p2, 0x0

    .line 272
    :goto_6
    and-int/2addr p1, v1

    .line 273
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 274
    .line 275
    .line 276
    move-result p1

    .line 277
    if-eqz p1, :cond_7

    .line 278
    .line 279
    const/4 v4, 0x1

    .line 280
    const/16 v6, 0x6db0

    .line 281
    .line 282
    iget-object v0, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 283
    .line 284
    const-string v1, "conversation_menu"

    .line 285
    .line 286
    const-string v2, "\u4f1a\u8bdd\u5217\u8868\u957f\u6309\u83dc\u5355"

    .line 287
    .line 288
    const-string v3, "\u957f\u6309\u597d\u53cb\u4f1a\u8bdd\u65f6\u663e\u793a\u8bbe\u7f6e\u5934\u50cf\u5165\u53e3"

    .line 289
    .line 290
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_7
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 295
    .line 296
    .line 297
    :goto_7
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 298
    .line 299
    return-object p1

    .line 300
    :pswitch_3
    move-object v5, p1

    .line 301
    check-cast v5, Li0/h0;

    .line 302
    .line 303
    check-cast p2, Ljava/lang/Integer;

    .line 304
    .line 305
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    and-int/lit8 p2, p1, 0x3

    .line 310
    .line 311
    const/4 v0, 0x2

    .line 312
    const/4 v1, 0x1

    .line 313
    if-eq p2, v0, :cond_8

    .line 314
    .line 315
    move p2, v1

    .line 316
    goto :goto_8

    .line 317
    :cond_8
    const/4 p2, 0x0

    .line 318
    :goto_8
    and-int/2addr p1, v1

    .line 319
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 320
    .line 321
    .line 322
    move-result p1

    .line 323
    if-eqz p1, :cond_9

    .line 324
    .line 325
    const/4 v4, 0x0

    .line 326
    const/16 v6, 0x6db0

    .line 327
    .line 328
    iget-object v0, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 329
    .line 330
    const-string v1, "message_block_enable"

    .line 331
    .line 332
    const-string v2, "\u542f\u7528\u5c4f\u853d\u6d88\u606f"

    .line 333
    .line 334
    const-string v3, "\u603b\u5f00\u5173\u5f00\u542f\u540e\uff0c\u4ec5\u547d\u4e2d\u542f\u7528\u6a21\u677f\u7684\u65b0\u6d88\u606f\u4f1a\u88ab\u62e6\u622a"

    .line 335
    .line 336
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 337
    .line 338
    .line 339
    goto :goto_9

    .line 340
    :cond_9
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 341
    .line 342
    .line 343
    :goto_9
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 344
    .line 345
    return-object p1

    .line 346
    :pswitch_4
    check-cast p1, Li0/h0;

    .line 347
    .line 348
    check-cast p2, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    const/4 p2, 0x1

    .line 354
    invoke-static {p2}, Li0/r;->C(I)I

    .line 355
    .line 356
    .line 357
    move-result p2

    .line 358
    iget-object v0, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 359
    .line 360
    invoke-static {v0, p1, p2}, Lwb/ho;->L3(Landroid/content/SharedPreferences;Li0/h0;I)V

    .line 361
    .line 362
    .line 363
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 364
    .line 365
    return-object p1

    .line 366
    :pswitch_5
    move-object v3, p1

    .line 367
    check-cast v3, Li0/h0;

    .line 368
    .line 369
    check-cast p2, Ljava/lang/Integer;

    .line 370
    .line 371
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 372
    .line 373
    .line 374
    move-result p1

    .line 375
    and-int/lit8 p2, p1, 0x3

    .line 376
    .line 377
    const/4 v0, 0x2

    .line 378
    const/4 v6, 0x1

    .line 379
    const/4 v7, 0x0

    .line 380
    if-eq p2, v0, :cond_a

    .line 381
    .line 382
    move p2, v6

    .line 383
    goto :goto_a

    .line 384
    :cond_a
    move p2, v7

    .line 385
    :goto_a
    and-int/2addr p1, v6

    .line 386
    invoke-virtual {v3, p1, p2}, Li0/h0;->S(IZ)Z

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    if-eqz p1, :cond_b

    .line 391
    .line 392
    const-string p1, "hb_stats_count"

    .line 393
    .line 394
    iget-object p2, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 395
    .line 396
    invoke-interface {p2, p1, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 397
    .line 398
    .line 399
    move-result p1

    .line 400
    const-string v8, " \u4e2a"

    .line 401
    .line 402
    invoke-static {p1, v8}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v1

    .line 406
    const/4 v4, 0x6

    .line 407
    const/4 v5, 0x4

    .line 408
    const-string v0, "\u5df2\u62a2\u7ea2\u5305"

    .line 409
    .line 410
    const/4 v2, 0x0

    .line 411
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 412
    .line 413
    .line 414
    const/4 p1, 0x0

    .line 415
    invoke-static {p1, v3, v7, v6}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 416
    .line 417
    .line 418
    const-string v0, "hb_stats_amount"

    .line 419
    .line 420
    invoke-interface {p2, v0, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    int-to-double v0, v0

    .line 425
    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    .line 426
    .line 427
    div-double/2addr v0, v4

    .line 428
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    const-string v1, "%.2f \u5143"

    .line 441
    .line 442
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    const/4 v4, 0x6

    .line 447
    const/4 v5, 0x4

    .line 448
    const-string v0, "\u7d2f\u8ba1\u91d1\u989d"

    .line 449
    .line 450
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 451
    .line 452
    .line 453
    invoke-static {p1, v3, v7, v6}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 454
    .line 455
    .line 456
    const-string v0, "hb_stats_today"

    .line 457
    .line 458
    invoke-interface {p2, v0, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    invoke-static {v0, v8}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    const-string v0, "\u4eca\u65e5\u62a2\u5230"

    .line 467
    .line 468
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 469
    .line 470
    .line 471
    invoke-static {p1, v3, v7, v6}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 472
    .line 473
    .line 474
    const-string p1, "hb_stats_failed"

    .line 475
    .line 476
    invoke-interface {p2, p1, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 477
    .line 478
    .line 479
    move-result p1

    .line 480
    const-string p2, " \u6b21"

    .line 481
    .line 482
    invoke-static {p1, p2}, Lp/a;->i(ILjava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    const-string v0, "\u5931\u8d25\u6b21\u6570"

    .line 487
    .line 488
    invoke-static/range {v0 .. v5}, Lwb/ho;->B1(Ljava/lang/String;Ljava/lang/String;Lfg/a;Li0/h0;II)V

    .line 489
    .line 490
    .line 491
    goto :goto_b

    .line 492
    :cond_b
    invoke-virtual {v3}, Li0/h0;->V()V

    .line 493
    .line 494
    .line 495
    :goto_b
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 496
    .line 497
    return-object p1

    .line 498
    :pswitch_6
    move-object v5, p1

    .line 499
    check-cast v5, Li0/h0;

    .line 500
    .line 501
    check-cast p2, Ljava/lang/Integer;

    .line 502
    .line 503
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 504
    .line 505
    .line 506
    move-result p1

    .line 507
    and-int/lit8 p2, p1, 0x3

    .line 508
    .line 509
    const/4 v0, 0x2

    .line 510
    const/4 v7, 0x0

    .line 511
    const/4 v8, 0x1

    .line 512
    if-eq p2, v0, :cond_c

    .line 513
    .line 514
    move p2, v8

    .line 515
    goto :goto_c

    .line 516
    :cond_c
    move p2, v7

    .line 517
    :goto_c
    and-int/2addr p1, v8

    .line 518
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 519
    .line 520
    .line 521
    move-result p1

    .line 522
    if-eqz p1, :cond_d

    .line 523
    .line 524
    const/4 v4, 0x0

    .line 525
    const/16 v6, 0x6db0

    .line 526
    .line 527
    iget-object v0, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 528
    .line 529
    const-string v1, "call_block_incoming_ringtone"

    .line 530
    .line 531
    const-string v2, "\u5c4f\u853d\u901a\u8bdd\u547c\u5165\u94c3\u58f0"

    .line 532
    .line 533
    const-string v3, "\u6536\u5230\u5fae\u4fe1\u8bed\u97f3\u6216\u89c6\u9891\u901a\u8bdd\u65f6\u4e0d\u64ad\u653e\u6765\u7535\u94c3\u58f0"

    .line 534
    .line 535
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 536
    .line 537
    .line 538
    const/4 p1, 0x0

    .line 539
    invoke-static {p1, v5, v7, v8}, Lwb/ho;->D1(FLi0/h0;II)V

    .line 540
    .line 541
    .line 542
    const-string v1, "call_block_outgoing_ringtone"

    .line 543
    .line 544
    const-string v2, "\u5c4f\u853d\u901a\u8bdd\u547c\u51fa\u94c3\u58f0"

    .line 545
    .line 546
    const-string v3, "\u62e8\u6253\u5fae\u4fe1\u8bed\u97f3\u6216\u89c6\u9891\u901a\u8bdd\u65f6\u4e0d\u64ad\u653e\u7b49\u5f85\u94c3\u58f0"

    .line 547
    .line 548
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 549
    .line 550
    .line 551
    goto :goto_d

    .line 552
    :cond_d
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 553
    .line 554
    .line 555
    :goto_d
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 556
    .line 557
    return-object p1

    .line 558
    :pswitch_7
    move-object v5, p1

    .line 559
    check-cast v5, Li0/h0;

    .line 560
    .line 561
    check-cast p2, Ljava/lang/Integer;

    .line 562
    .line 563
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 564
    .line 565
    .line 566
    move-result p1

    .line 567
    and-int/lit8 p2, p1, 0x3

    .line 568
    .line 569
    const/4 v0, 0x2

    .line 570
    const/4 v1, 0x1

    .line 571
    if-eq p2, v0, :cond_e

    .line 572
    .line 573
    move p2, v1

    .line 574
    goto :goto_e

    .line 575
    :cond_e
    const/4 p2, 0x0

    .line 576
    :goto_e
    and-int/2addr p1, v1

    .line 577
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 578
    .line 579
    .line 580
    move-result p1

    .line 581
    if-eqz p1, :cond_f

    .line 582
    .line 583
    const/4 v4, 0x0

    .line 584
    const/16 v6, 0x6db0

    .line 585
    .line 586
    iget-object v0, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 587
    .line 588
    const-string v1, "auto_view_original_enable"

    .line 589
    .line 590
    const-string v2, "\u81ea\u52a8\u67e5\u770b\u539f\u56fe"

    .line 591
    .line 592
    const-string v3, "\u6253\u5f00\u804a\u5929\u56fe\u7247\u6216\u89c6\u9891\u65f6\u81ea\u52a8\u67e5\u770b\u539f\u56fe\u6216\u539f\u89c6\u9891"

    .line 593
    .line 594
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 595
    .line 596
    .line 597
    goto :goto_f

    .line 598
    :cond_f
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 599
    .line 600
    .line 601
    :goto_f
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 602
    .line 603
    return-object p1

    .line 604
    :pswitch_8
    move-object v5, p1

    .line 605
    check-cast v5, Li0/h0;

    .line 606
    .line 607
    check-cast p2, Ljava/lang/Integer;

    .line 608
    .line 609
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 610
    .line 611
    .line 612
    move-result p1

    .line 613
    and-int/lit8 p2, p1, 0x3

    .line 614
    .line 615
    const/4 v0, 0x2

    .line 616
    const/4 v1, 0x1

    .line 617
    if-eq p2, v0, :cond_10

    .line 618
    .line 619
    move p2, v1

    .line 620
    goto :goto_10

    .line 621
    :cond_10
    const/4 p2, 0x0

    .line 622
    :goto_10
    and-int/2addr p1, v1

    .line 623
    invoke-virtual {v5, p1, p2}, Li0/h0;->S(IZ)Z

    .line 624
    .line 625
    .line 626
    move-result p1

    .line 627
    if-eqz p1, :cond_11

    .line 628
    .line 629
    const/4 v4, 0x0

    .line 630
    const/16 v6, 0x6db0

    .line 631
    .line 632
    iget-object v0, p0, Lwb/sb;->h:Landroid/content/SharedPreferences;

    .line 633
    .line 634
    const-string v1, "original_moments_upload_enable"

    .line 635
    .line 636
    const-string v2, "\u539f\u56fe\u4e0a\u4f20"

    .line 637
    .line 638
    const-string v3, "\u53d1\u5e03\u670b\u53cb\u5708\u56fe\u7247\u548c\u89c6\u9891\u65f6\u5c3d\u91cf\u8df3\u8fc7\u5fae\u4fe1\u538b\u7f29"

    .line 639
    .line 640
    invoke-static/range {v0 .. v6}, Lwb/ho;->O3(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLi0/h0;I)V

    .line 641
    .line 642
    .line 643
    goto :goto_11

    .line 644
    :cond_11
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 645
    .line 646
    .line 647
    :goto_11
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 648
    .line 649
    return-object p1

    .line 650
    nop

    .line 651
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
