.class public final synthetic Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 7
    iput p2, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final 飘花落叶言子楪世苏哲兰()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget p0, p0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v0, 0x3

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const-wide v0, -0x36a43118051405a7L    # -2.480576760085178E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_1
    const-wide v0, -0x36a43117051405a7L    # -2.4805781212146458E45

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    const/16 p0, 0x15

    .line 41
    .line 42
    :try_start_0
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->detectUpdates()V

    .line 43
    .line 44
    .line 45
    invoke-static {}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世兰哲()L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 46
    .line 47
    .line 48
    new-instance v0, Landroid/os/Handler;

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 58
    .line 59
    const/16 v2, 0x14

    .line 60
    .line 61
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    new-instance v0, Landroid/os/Handler;

    .line 68
    .line 69
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 74
    .line 75
    .line 76
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 77
    .line 78
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    goto :goto_2

    .line 87
    :catch_0
    move-exception v0

    .line 88
    const-wide v1, -0x36a4310f051405a7L    # -2.4805890102503873E45

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    :try_start_1
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v2, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v1, v2, v0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 104
    .line 105
    .line 106
    new-instance v0, Landroid/os/Handler;

    .line 107
    .line 108
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 113
    .line 114
    .line 115
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 116
    .line 117
    const/16 v2, 0x16

    .line 118
    .line 119
    invoke-direct {v1, v2}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    .line 124
    .line 125
    new-instance v0, Landroid/os/Handler;

    .line 126
    .line 127
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 132
    .line 133
    .line 134
    new-instance v1, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 135
    .line 136
    invoke-direct {v1, p0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :goto_1
    return-void

    .line 141
    :goto_2
    new-instance v1, Landroid/os/Handler;

    .line 142
    .line 143
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 148
    .line 149
    .line 150
    new-instance v2, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 151
    .line 152
    invoke-direct {v2, p0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 156
    .line 157
    .line 158
    throw v0

    .line 159
    :pswitch_3
    :try_start_2
    invoke-static {}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰()V

    .line 160
    .line 161
    .line 162
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-interface {p0}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏()Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-interface {p0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    iget-object p0, p0, Lretrofit2/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    check-cast p0, Ltop/suzhelan/qstory/entity/QSResult;

    .line 180
    .line 181
    invoke-virtual {p0}, Ltop/suzhelan/qstory/entity/QSResult;->getData()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    check-cast p0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世苏兰哲;

    .line 186
    .line 187
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    const-wide v0, -0x36a58b74051405a7L    # -2.359888132444595E45

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    new-instance v0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 199
    .line 200
    invoke-direct {v0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 201
    .line 202
    .line 203
    const-wide v1, -0x36a58b71051405a7L    # -2.359892215832998E45

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-virtual {v0, p0, v1}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-static {}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    if-nez p0, :cond_0

    .line 220
    .line 221
    new-instance p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;

    .line 222
    .line 223
    invoke-direct {p0}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 224
    .line 225
    .line 226
    const-wide v0, -0x36a542b9051405a7L    # -2.385231002003399E45

    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    const-wide v1, -0x36a5e358051405a7L    # -2.3292627194217106E45

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    iget-object p0, p0, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 244
    .line 245
    invoke-virtual {p0, v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 246
    .line 247
    .line 248
    invoke-static {}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :catch_1
    move-exception v0

    .line 253
    move-object p0, v0

    .line 254
    const-wide v0, -0x36a54acf051405a7L    # -2.3824134640052935E45

    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 270
    .line 271
    .line 272
    :cond_0
    :goto_3
    return-void

    .line 273
    :pswitch_4
    sget p0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:I

    .line 274
    .line 275
    :try_start_3
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 276
    .line 277
    const-wide v0, -0x36a575f0051405a7L    # -2.3673852335525972E45

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-direct {p0, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Ljava/util/Date;

    .line 294
    .line 295
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 296
    .line 297
    .line 298
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    :goto_4
    const-wide v0, -0x36a55d90051405a7L    # -2.3758786814309438E45

    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-static {v0}, Llin/xposed/hook/util/qq/Hook_cookie;->getPskey(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-nez v0, :cond_1

    .line 316
    .line 317
    const-wide/16 v0, 0x3e8

    .line 318
    .line 319
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 320
    .line 321
    .line 322
    goto :goto_4

    .line 323
    :catch_2
    move-exception v0

    .line 324
    move-object p0, v0

    .line 325
    goto :goto_7

    .line 326
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 329
    .line 330
    .line 331
    const-wide v4, -0x36a57477051405a7L    # -2.367898379361914E45

    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p0

    .line 350
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 351
    .line 352
    const-class v1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 353
    .line 354
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    check-cast v1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;

    .line 359
    .line 360
    if-nez v1, :cond_2

    .line 361
    .line 362
    move v1, v2

    .line 363
    goto :goto_5

    .line 364
    :cond_2
    iget-object v1, v1, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 367
    .line 368
    .line 369
    move-result v1

    .line 370
    :goto_5
    if-eqz v1, :cond_3

    .line 371
    .line 372
    invoke-static {}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p0

    .line 376
    :cond_3
    const-class v1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰哲苏;

    .line 377
    .line 378
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    check-cast v1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世兰哲苏;

    .line 383
    .line 384
    if-nez v1, :cond_4

    .line 385
    .line 386
    goto :goto_6

    .line 387
    :cond_4
    iget-object v1, v1, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 388
    .line 389
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    :goto_6
    invoke-static {p0, v2}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Z)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    sget v1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:I

    .line 398
    .line 399
    const-class v1, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世哲苏兰;

    .line 400
    .line 401
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    check-cast v0, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏兰哲;

    .line 406
    .line 407
    iget-object v0, v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 408
    .line 409
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_5

    .line 414
    .line 415
    invoke-static {p0}, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    :cond_5
    const-wide v0, -0x36a5747b051405a7L    # -2.3678929348440432E45

    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 431
    .line 432
    .line 433
    goto :goto_8

    .line 434
    :goto_7
    const-wide v0, -0x36a575ea051405a7L    # -2.3673934003294033E45

    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const-wide v1, -0x36a57460051405a7L    # -2.3679296853396707E45

    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 453
    .line 454
    .line 455
    invoke-static {}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;->飘花落叶言子世哲苏兰楪()V

    .line 456
    .line 457
    .line 458
    new-instance v0, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 461
    .line 462
    .line 463
    const-wide v1, -0x36a57469051405a7L    # -2.3679174351744615E45

    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object p0

    .line 479
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 487
    .line 488
    .line 489
    :goto_8
    return-void

    .line 490
    :pswitch_5
    const-wide v0, -0x36a5faea051405a7L    # -2.3210496642137068E45

    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->SUCCESS:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 500
    .line 501
    invoke-static {p0, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;)V

    .line 502
    .line 503
    .line 504
    return-void

    .line 505
    :pswitch_6
    const-wide v0, -0x36a5fae1051405a7L    # -2.321061914378916E45

    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object p0

    .line 514
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 515
    .line 516
    invoke-static {p0, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :pswitch_7
    const-wide v0, -0x36a5fafe051405a7L    # -2.321022441624353E45

    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object p0

    .line 529
    sget-object v0, Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;->WARNING:Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;

    .line 530
    .line 531
    invoke-static {p0, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世苏兰哲楪;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/dialogs/WaitDialog$TYPE;)V

    .line 532
    .line 533
    .line 534
    return-void

    .line 535
    :pswitch_8
    sget-object p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;

    .line 536
    .line 537
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    invoke-static {}, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object p0

    .line 544
    new-instance v1, Ljava/io/File;

    .line 545
    .line 546
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 550
    .line 551
    .line 552
    move-result p0

    .line 553
    if-eqz p0, :cond_12

    .line 554
    .line 555
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 556
    .line 557
    .line 558
    move-result p0

    .line 559
    if-nez p0, :cond_6

    .line 560
    .line 561
    goto/16 :goto_e

    .line 562
    .line 563
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 564
    .line 565
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 566
    .line 567
    .line 568
    new-instance v4, Ljava/util/ArrayList;

    .line 569
    .line 570
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 571
    .line 572
    .line 573
    sget-object v5, Lkotlin/io/FileWalkDirection;->TOP_DOWN:Lkotlin/io/FileWalkDirection;

    .line 574
    .line 575
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    new-instance v6, Lkotlin/io/飘花落叶言子楪苏哲世兰;

    .line 579
    .line 580
    invoke-direct {v6, v1, v2, v5}, Lkotlin/io/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 581
    .line 582
    .line 583
    new-instance v1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 584
    .line 585
    const/16 v5, 0xf

    .line 586
    .line 587
    invoke-direct {v1, v5}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 588
    .line 589
    .line 590
    new-instance v7, Lkotlin/sequences/飘花落叶言子楪世兰哲苏;

    .line 591
    .line 592
    invoke-direct {v7, v6, v3, v1}, Lkotlin/sequences/飘花落叶言子楪世兰哲苏;-><init>(Lkotlin/sequences/飘花落叶言子楪苏哲世兰;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 593
    .line 594
    .line 595
    new-instance v1, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;

    .line 596
    .line 597
    invoke-direct {v1, v7}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;-><init>(Lkotlin/sequences/飘花落叶言子楪世兰哲苏;)V

    .line 598
    .line 599
    .line 600
    :goto_9
    invoke-virtual {v1}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    if-eqz v6, :cond_7

    .line 605
    .line 606
    invoke-virtual {v1}, Lkotlin/sequences/飘花落叶言子楪世兰苏哲;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v6

    .line 610
    check-cast v6, Ljava/io/File;

    .line 611
    .line 612
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    goto :goto_9

    .line 616
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    if-nez v1, :cond_8

    .line 621
    .line 622
    new-instance p0, Landroid/os/Handler;

    .line 623
    .line 624
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 629
    .line 630
    .line 631
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 632
    .line 633
    invoke-direct {v0, v5}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 637
    .line 638
    .line 639
    goto/16 :goto_f

    .line 640
    .line 641
    :cond_8
    const-wide v5, -0x36a5070c051405a7L    # -2.4060249768812036E45

    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v7

    .line 650
    const-wide v5, -0x36a5fa97051405a7L    # -2.3211626379595246E45

    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v8

    .line 659
    const-wide v5, -0x36a5072f051405a7L    # -2.4059773373498346E45

    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v9

    .line 668
    const-wide v5, -0x36a506ff051405a7L    # -2.4060426715642835E45

    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v10

    .line 677
    const-wide v5, -0x36a506d5051405a7L    # -2.4060998390019262E45

    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 683
    .line 684
    .line 685
    move-result-object v11

    .line 686
    const-wide v5, -0x36a506e3051405a7L    # -2.4060807831893786E45

    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v12

    .line 695
    const-wide v5, -0x36a5fa9d051405a7L    # -2.3211544711827185E45

    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v13

    .line 704
    const-wide v5, -0x36a5fa9b051405a7L    # -2.3211571934416538E45

    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v14

    .line 713
    filled-new-array/range {v7 .. v14}, [Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲苏兰世;->飘花落叶言子苏兰哲楪世([Ljava/lang/Object;)Ljava/util/Set;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 722
    .line 723
    .line 724
    move-result-object v4

    .line 725
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 726
    .line 727
    .line 728
    move-result v5

    .line 729
    if-eqz v5, :cond_c

    .line 730
    .line 731
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v5

    .line 735
    check-cast v5, Ljava/io/File;

    .line 736
    .line 737
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    const-wide v7, -0x36a5ab52051405a7L    # -2.348784038247231E45

    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 753
    .line 754
    const-wide v8, -0x36a57a83051405a7L    # -2.3657913509459395E45

    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    invoke-static {v6, v7, v8, v9}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/String;Ljava/util/Locale;J)Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v6

    .line 763
    move-object v7, v1

    .line 764
    check-cast v7, Ljava/lang/Iterable;

    .line 765
    .line 766
    instance-of v8, v7, Ljava/util/Collection;

    .line 767
    .line 768
    if-eqz v8, :cond_9

    .line 769
    .line 770
    move-object v8, v7

    .line 771
    check-cast v8, Ljava/util/Collection;

    .line 772
    .line 773
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 774
    .line 775
    .line 776
    move-result v8

    .line 777
    if-eqz v8, :cond_9

    .line 778
    .line 779
    goto :goto_b

    .line 780
    :cond_9
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 781
    .line 782
    .line 783
    move-result-object v7

    .line 784
    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 785
    .line 786
    .line 787
    move-result v8

    .line 788
    if-eqz v8, :cond_b

    .line 789
    .line 790
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v8

    .line 794
    check-cast v8, Ljava/lang/String;

    .line 795
    .line 796
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    invoke-virtual {v6, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 800
    .line 801
    .line 802
    move-result v8

    .line 803
    if-eqz v8, :cond_a

    .line 804
    .line 805
    goto :goto_a

    .line 806
    :cond_b
    :goto_b
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    goto :goto_a

    .line 810
    :cond_c
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 811
    .line 812
    .line 813
    move-result v1

    .line 814
    if-nez v1, :cond_d

    .line 815
    .line 816
    new-instance p0, Landroid/os/Handler;

    .line 817
    .line 818
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 823
    .line 824
    .line 825
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 826
    .line 827
    const/16 v1, 0x10

    .line 828
    .line 829
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 833
    .line 834
    .line 835
    goto/16 :goto_f

    .line 836
    .line 837
    :cond_d
    new-instance v4, Lkotlin/jvm/internal/Ref$IntRef;

    .line 838
    .line 839
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 840
    .line 841
    .line 842
    new-instance v5, Lkotlin/jvm/internal/Ref$IntRef;

    .line 843
    .line 844
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 845
    .line 846
    .line 847
    new-instance v6, Landroid/os/Handler;

    .line 848
    .line 849
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 850
    .line 851
    .line 852
    move-result-object v7

    .line 853
    invoke-direct {v6, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 857
    .line 858
    .line 859
    move-result-object p0

    .line 860
    move v7, v2

    .line 861
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 862
    .line 863
    .line 864
    move-result v8

    .line 865
    if-eqz v8, :cond_11

    .line 866
    .line 867
    add-int/lit8 v8, v7, 0x1

    .line 868
    .line 869
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v9

    .line 873
    check-cast v9, Ljava/io/File;

    .line 874
    .line 875
    int-to-float v10, v8

    .line 876
    int-to-float v11, v1

    .line 877
    div-float/2addr v10, v11

    .line 878
    new-instance v11, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世苏哲;

    .line 879
    .line 880
    invoke-direct {v11, v7, v1, v9, v10}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪兰世苏哲;-><init>(IILjava/io/File;F)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v6, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 884
    .line 885
    .line 886
    :try_start_4
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v7

    .line 890
    invoke-static {v7}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v7

    .line 894
    const-wide v10, -0x36a507ec051405a7L    # -2.4057200838804424E45

    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    invoke-static {v10, v11}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v10

    .line 903
    invoke-static {v7, v10, v2}, Lkotlin/text/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰哲苏楪(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 904
    .line 905
    .line 906
    move-result v10

    .line 907
    if-eqz v10, :cond_10

    .line 908
    .line 909
    new-instance v10, Ljava/lang/StringBuilder;

    .line 910
    .line 911
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v11

    .line 918
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 919
    .line 920
    .line 921
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 922
    .line 923
    .line 924
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object v7

    .line 928
    new-instance v10, Ljava/io/File;

    .line 929
    .line 930
    invoke-virtual {v9}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 931
    .line 932
    .line 933
    move-result-object v11

    .line 934
    invoke-direct {v10, v11, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    .line 938
    .line 939
    .line 940
    move-result v7

    .line 941
    if-eqz v7, :cond_e

    .line 942
    .line 943
    iget v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 944
    .line 945
    add-int/2addr v7, v3

    .line 946
    iput v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 947
    .line 948
    goto :goto_d

    .line 949
    :cond_e
    invoke-virtual {v9, v10}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 950
    .line 951
    .line 952
    move-result v7

    .line 953
    if-eqz v7, :cond_f

    .line 954
    .line 955
    iget v7, v4, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 956
    .line 957
    add-int/2addr v7, v3

    .line 958
    iput v7, v4, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 959
    .line 960
    goto :goto_d

    .line 961
    :cond_f
    iget v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 962
    .line 963
    add-int/2addr v7, v3

    .line 964
    iput v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 965
    .line 966
    goto :goto_d

    .line 967
    :cond_10
    iget v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 968
    .line 969
    add-int/2addr v7, v3

    .line 970
    iput v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 971
    .line 972
    goto :goto_d

    .line 973
    :catch_3
    iget v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 974
    .line 975
    add-int/2addr v7, v3

    .line 976
    iput v7, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 977
    .line 978
    :goto_d
    move v7, v8

    .line 979
    goto :goto_c

    .line 980
    :cond_11
    new-instance p0, Landroidx/activity/飘花落叶言子楪哲苏世兰;

    .line 981
    .line 982
    invoke-direct {p0, v1, v0, v5, v4}, Landroidx/activity/飘花落叶言子楪哲苏世兰;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v6, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 986
    .line 987
    .line 988
    goto :goto_f

    .line 989
    :cond_12
    :goto_e
    new-instance p0, Landroid/os/Handler;

    .line 990
    .line 991
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 992
    .line 993
    .line 994
    move-result-object v0

    .line 995
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 996
    .line 997
    .line 998
    new-instance v0, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 999
    .line 1000
    const/16 v1, 0xe

    .line 1001
    .line 1002
    invoke-direct {v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(I)V

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1006
    .line 1007
    .line 1008
    :goto_f
    return-void

    .line 1009
    :pswitch_9
    invoke-static {v3}, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Z)V

    .line 1010
    .line 1011
    .line 1012
    return-void

    .line 1013
    :pswitch_a
    invoke-static {v2}, L飘花落叶言世哲苏兰楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Z)V

    .line 1014
    .line 1015
    .line 1016
    return-void

    .line 1017
    :pswitch_b
    invoke-static {}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世()Landroid/graphics/drawable/Drawable;

    .line 1018
    .line 1019
    .line 1020
    return-void

    .line 1021
    :pswitch_c
    :try_start_5
    new-instance p0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;

    .line 1022
    .line 1023
    invoke-direct {p0}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏兰哲世;-><init>()V

    .line 1024
    .line 1025
    .line 1026
    sget-object v1, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 1027
    .line 1028
    new-instance v2, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;

    .line 1029
    .line 1030
    const/16 v4, 0x12

    .line 1031
    .line 1032
    invoke-direct {v2, p0, v4}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/Object;I)V

    .line 1033
    .line 1034
    .line 1035
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1036
    .line 1037
    .line 1038
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪苏世兰哲;->飘花落叶言子世楪苏兰哲()V

    .line 1039
    .line 1040
    .line 1041
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;

    .line 1042
    .line 1043
    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;-><init>(I)V

    .line 1044
    .line 1045
    .line 1046
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/descriptors/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲()Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    const-wide v1, -0x36a57ebf051405a7L    # -2.3643158866029703E45

    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v1

    .line 1059
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1060
    .line 1061
    .line 1062
    move-result v0

    .line 1063
    const/16 v1, 0x18

    .line 1064
    .line 1065
    if-nez v0, :cond_13

    .line 1066
    .line 1067
    const-wide v4, -0x36a57e98051405a7L    # -2.36436897065221E45

    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v0

    .line 1076
    invoke-static {v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1077
    .line 1078
    .line 1079
    new-instance v0, Landroidx/window/area/飘花落叶言子楪世兰哲苏;

    .line 1080
    .line 1081
    invoke-direct {v0, v1}, Landroidx/window/area/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 1082
    .line 1083
    .line 1084
    new-instance v2, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 1085
    .line 1086
    invoke-direct {v2, v0}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 1087
    .line 1088
    .line 1089
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 1090
    .line 1091
    .line 1092
    :cond_13
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 1093
    .line 1094
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 1095
    .line 1096
    .line 1097
    new-instance p0, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;

    .line 1098
    .line 1099
    invoke-direct {p0, v0}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 1103
    .line 1104
    .line 1105
    sget-object p0, L飘花落叶言苏世子哲兰楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 1106
    .line 1107
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏哲兰;

    .line 1108
    .line 1109
    .line 1110
    move-result-object p0

    .line 1111
    invoke-interface {p0}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 1112
    .line 1113
    .line 1114
    move-result-object p0

    .line 1115
    new-instance v0, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;

    .line 1116
    .line 1117
    invoke-direct {v0, v1}, L飘花落叶言世楪哲苏子兰/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 1118
    .line 1119
    .line 1120
    invoke-interface {p0, v0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世(Lretrofit2/飘花落叶言子楪苏世兰哲;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 1121
    .line 1122
    .line 1123
    goto :goto_10

    .line 1124
    :catch_4
    move-exception v0

    .line 1125
    move-object p0, v0

    .line 1126
    const-wide v0, -0x36a5014d051405a7L    # -2.4080271983281664E45

    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    sget-object v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1136
    .line 1137
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v1

    .line 1141
    invoke-static {v0, v1, p0, v3}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 1142
    .line 1143
    .line 1144
    :goto_10
    return-void

    .line 1145
    :pswitch_d
    sget-object p0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;

    .line 1146
    .line 1147
    const-string v0, "DexKitCache"

    .line 1148
    .line 1149
    new-instance v4, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 1150
    .line 1151
    const/16 v5, 0x19

    .line 1152
    .line 1153
    invoke-direct {v4, v5}, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;-><init>(I)V

    .line 1154
    .line 1155
    .line 1156
    invoke-static {v4}, Landroidx/compose/foundation/draganddrop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)L飘花落叶言世苏兰哲楪子/飘花落叶言子楪兰世苏哲;

    .line 1157
    .line 1158
    .line 1159
    sget-object v4, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 1160
    .line 1161
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 1162
    .line 1163
    .line 1164
    move-result v4

    .line 1165
    if-eqz v4, :cond_17

    .line 1166
    .line 1167
    new-instance v4, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;

    .line 1168
    .line 1169
    sget-object v5, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 1170
    .line 1171
    invoke-direct {v4, v5, v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v4}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰()L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v0

    .line 1178
    invoke-virtual {v0}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世苏兰;->clear()Landroid/content/SharedPreferences$Editor;

    .line 1179
    .line 1180
    .line 1181
    const-wide v4, -0x36a54d28051405a7L    # -2.3815954251952156E45

    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    invoke-static {v0}, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 1191
    .line 1192
    .line 1193
    const-wide v4, -0x36a54d00051405a7L    # -2.381649870373923E45

    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    :try_start_6
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    invoke-static {}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()Ljava/lang/String;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v4

    .line 1206
    invoke-virtual {p0, v4, v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    new-instance v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 1210
    .line 1211
    invoke-direct {v4}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 1212
    .line 1213
    .line 1214
    new-instance v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1215
    .line 1216
    invoke-direct {v5}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 1217
    .line 1218
    .line 1219
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 1220
    .line 1221
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 1222
    .line 1223
    .line 1224
    move-result v6

    .line 1225
    sub-int/2addr v6, v3

    .line 1226
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v0

    .line 1230
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v3

    .line 1234
    :cond_14
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v0

    .line 1238
    if-eqz v0, :cond_16

    .line 1239
    .line 1240
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v0

    .line 1244
    move-object v7, v0

    .line 1245
    check-cast v7, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;

    .line 1246
    .line 1247
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 1248
    .line 1249
    .line 1250
    move-result v0

    .line 1251
    new-instance v8, Landroid/os/Message;

    .line 1252
    .line 1253
    invoke-direct {v8}, Landroid/os/Message;-><init>()V

    .line 1254
    .line 1255
    .line 1256
    filled-new-array {v0, v6}, [I

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    iput-object v0, v8, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1261
    .line 1262
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子楪苏世哲兰;

    .line 1263
    .line 1264
    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1265
    .line 1266
    .line 1267
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1270
    .line 1271
    .line 1272
    const-wide v8, -0x36a54d0a051405a7L    # -2.381636259079246E45

    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    invoke-static {v8, v9}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v8

    .line 1281
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v7}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v8

    .line 1288
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    invoke-static {v0}, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    instance-of v0, v7, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;

    .line 1299
    .line 1300
    if-eqz v0, :cond_15

    .line 1301
    .line 1302
    move-object v0, v7

    .line 1303
    check-cast v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;

    .line 1304
    .line 1305
    invoke-interface {v0}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;->run()V

    .line 1306
    .line 1307
    .line 1308
    :cond_15
    instance-of v0, v7, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 1309
    .line 1310
    if-eqz v0, :cond_14

    .line 1311
    .line 1312
    move-object v0, v7

    .line 1313
    check-cast v0, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 1314
    .line 1315
    :try_start_7
    new-instance v8, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;

    .line 1316
    .line 1317
    invoke-direct {v8, v1}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 1318
    .line 1319
    .line 1320
    invoke-interface {v0, v8}, L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;)V

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v7}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getItemPath()Ljava/lang/String;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v0

    .line 1327
    invoke-virtual {v8}, Lcom/bumptech/glide/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲()Lcom/alibaba/fastjson2/JSONObject;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v8

    .line 1331
    invoke-virtual {v4, v0, v8}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    .line 1332
    .line 1333
    .line 1334
    goto :goto_11

    .line 1335
    :catch_5
    move-exception v0

    .line 1336
    :try_start_8
    invoke-virtual {v7}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v7

    .line 1340
    invoke-virtual {v7, v0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 1341
    .line 1342
    .line 1343
    goto :goto_11

    .line 1344
    :cond_16
    const-wide v0, -0x36a54cf0051405a7L    # -2.381671648445406E45

    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    invoke-static {v0}, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 1354
    .line 1355
    .line 1356
    const-wide v0, -0x36a54d1c051405a7L    # -2.3816117587488278E45

    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v0

    .line 1365
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONObject;->toString()Ljava/lang/String;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v1

    .line 1369
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1370
    .line 1371
    .line 1372
    sget-object v0, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 1373
    .line 1374
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 1375
    .line 1376
    .line 1377
    const-wide v0, -0x36a54d4d051405a7L    # -2.3815450634049113E45

    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1387
    .line 1388
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1389
    .line 1390
    .line 1391
    sget-object v2, L飘花落叶言世哲子楪兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 1392
    .line 1393
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1394
    .line 1395
    .line 1396
    const-wide v2, -0x36a5335a051405a7L    # -2.3905870464587344E45

    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1402
    .line 1403
    .line 1404
    move-result-object v2

    .line 1405
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1406
    .line 1407
    .line 1408
    sget-object v2, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 1409
    .line 1410
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v1

    .line 1417
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    const-wide v0, -0x36a54ce1051405a7L    # -2.381692065387421E45

    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v0

    .line 1429
    invoke-static {}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰()Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v1

    .line 1433
    invoke-virtual {p0, v1, v0}, L飘花落叶言苏楪哲兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1434
    .line 1435
    .line 1436
    const-wide/16 v0, 0x1f4

    .line 1437
    .line 1438
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 1439
    .line 1440
    .line 1441
    const-wide v0, -0x36a54d2c051405a7L    # -2.3815899806773448E45

    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1447
    .line 1448
    .line 1449
    move-result-object p0

    .line 1450
    invoke-static {p0}, L飘花落叶言世哲兰楪苏子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 1451
    .line 1452
    .line 1453
    goto :goto_12

    .line 1454
    :catch_6
    move-exception v0

    .line 1455
    move-object p0, v0

    .line 1456
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/Throwable;)V

    .line 1457
    .line 1458
    .line 1459
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Exception;)V

    .line 1460
    .line 1461
    .line 1462
    :goto_12
    sget-object p0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Landroid/content/Context;

    .line 1463
    .line 1464
    invoke-static {p0}, L飘花落叶言子楪世苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪哲兰(Landroid/content/Context;)V

    .line 1465
    .line 1466
    .line 1467
    goto :goto_13

    .line 1468
    :cond_17
    const-string p0, "storePath is empty(\u8bf7\u4f7f\u7528KvHelper.initialize(String path)\u521d\u59cb\u5316"

    .line 1469
    .line 1470
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 1471
    .line 1472
    .line 1473
    :goto_13
    return-void

    .line 1474
    :pswitch_e
    const-wide v0, -0x36a57cef051405a7L    # -2.3649474506759756E45

    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 1480
    .line 1481
    .line 1482
    move-result-object p0

    .line 1483
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 1484
    .line 1485
    .line 1486
    return-void

    .line 1487
    :pswitch_f
    invoke-static {}, Llin/xposed/hook/view/main/MainSettingActivity;->飘花落叶言子楪兰世苏哲()V

    .line 1488
    .line 1489
    .line 1490
    return-void

    .line 1491
    :pswitch_10
    invoke-static {}, Ltop/suzhelan/qstory/ui/activity/SettingActivity;->飘花落叶言子楪哲世兰苏()V

    .line 1492
    .line 1493
    .line 1494
    return-void

    .line 1495
    :pswitch_11
    sget p0, Ltop/suzhelan/plugin/sdk/online/manager/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 1496
    .line 1497
    sget-object v1, Ltop/suzhelan/plugin/sdk/online/manager/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/LinkedHashSet;

    .line 1498
    .line 1499
    monitor-enter v1

    .line 1500
    :try_start_9
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲楪兰世苏(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 1504
    monitor-exit v1

    .line 1505
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v1

    .line 1509
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1510
    .line 1511
    .line 1512
    move-result v0

    .line 1513
    if-eqz v0, :cond_18

    .line 1514
    .line 1515
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    check-cast v0, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪苏世哲兰;

    .line 1520
    .line 1521
    :try_start_a
    invoke-virtual {v0, p0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    .line 1522
    .line 1523
    .line 1524
    goto :goto_14

    .line 1525
    :catch_7
    move-exception v0

    .line 1526
    const-string v2, "MessageBadgeManager"

    .line 1527
    .line 1528
    const-string v3, "Error notifying listener"

    .line 1529
    .line 1530
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1531
    .line 1532
    .line 1533
    goto :goto_14

    .line 1534
    :cond_18
    return-void

    .line 1535
    :catchall_1
    move-exception v0

    .line 1536
    move-object p0, v0

    .line 1537
    monitor-exit v1

    .line 1538
    throw p0

    .line 1539
    :pswitch_12
    invoke-static {}, Llin/xposed/hook/view/main/itemview/Update;->飘花落叶言子楪世兰苏哲()V

    .line 1540
    .line 1541
    .line 1542
    return-void

    .line 1543
    :pswitch_13
    invoke-static {}, Llin/xposed/hook/view/main/itemview/ClearLoginInformation;->飘花落叶言子楪世苏兰哲()V

    .line 1544
    .line 1545
    .line 1546
    :pswitch_14
    return-void

    .line 1547
    :pswitch_15
    sget-object p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子兰世哲楪苏:Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 1548
    .line 1549
    monitor-enter p0

    .line 1550
    :try_start_b
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1551
    .line 1552
    iget-object v4, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 1553
    .line 1554
    iget v5, p0, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 1555
    .line 1556
    const/16 v6, 0x1e

    .line 1557
    .line 1558
    if-ge v3, v6, :cond_1a

    .line 1559
    .line 1560
    :goto_15
    if-ge v2, v5, :cond_1b

    .line 1561
    .line 1562
    :try_start_c
    aget-object v0, v4, v2

    .line 1563
    .line 1564
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 1565
    .line 1566
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getShowLayoutBounds()Z

    .line 1567
    .line 1568
    .line 1569
    move-result v3

    .line 1570
    sget-object v6, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->飘花落叶言子兰世楪哲苏:Ljava/lang/Class;

    .line 1571
    .line 1572
    invoke-static {}, Landroidx/compose/ui/platform/飘花落叶言子苏哲兰楪世;->飘花落叶言子楪苏兰哲世()Z

    .line 1573
    .line 1574
    .line 1575
    move-result v6

    .line 1576
    invoke-virtual {v0, v6}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->setShowLayoutBounds(Z)V

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getShowLayoutBounds()Z

    .line 1580
    .line 1581
    .line 1582
    move-result v6

    .line 1583
    if-eq v3, v6, :cond_19

    .line 1584
    .line 1585
    new-instance v3, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰世哲;

    .line 1586
    .line 1587
    invoke-direct {v3, v0, v1}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰世哲;-><init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;I)V

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual {v0, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1591
    .line 1592
    .line 1593
    goto :goto_16

    .line 1594
    :catchall_2
    move-exception v0

    .line 1595
    goto :goto_18

    .line 1596
    :cond_19
    :goto_16
    add-int/lit8 v2, v2, 0x1

    .line 1597
    .line 1598
    goto :goto_15

    .line 1599
    :cond_1a
    :goto_17
    if-ge v2, v5, :cond_1b

    .line 1600
    .line 1601
    aget-object v1, v4, v2

    .line 1602
    .line 1603
    check-cast v1, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 1604
    .line 1605
    new-instance v3, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰世哲;

    .line 1606
    .line 1607
    invoke-direct {v3, v1, v0}, Landroidx/compose/ui/platform/飘花落叶言子楪苏兰世哲;-><init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;I)V

    .line 1608
    .line 1609
    .line 1610
    invoke-virtual {v1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1611
    .line 1612
    .line 1613
    add-int/lit8 v2, v2, 0x1

    .line 1614
    .line 1615
    goto :goto_17

    .line 1616
    :cond_1b
    monitor-exit p0

    .line 1617
    return-void

    .line 1618
    :goto_18
    monitor-exit p0

    .line 1619
    throw v0

    .line 1620
    nop

    .line 1621
    :pswitch_data_0
    .packed-switch 0x0
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
