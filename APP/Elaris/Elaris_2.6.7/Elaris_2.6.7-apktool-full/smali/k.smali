.class public final Lk;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lc;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lk;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 4

    .line 1
    iget p0, p0, Lk;->a:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-ne p3, v1, :cond_8

    .line 11
    .line 12
    if-nez p4, :cond_0

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    sget-object p0, Lcom/mr/elaris/w;->r:Ly;

    .line 17
    .line 18
    sput-object v2, Lcom/mr/elaris/w;->r:Ly;

    .line 19
    .line 20
    if-eqz p1, :cond_9

    .line 21
    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    if-nez p3, :cond_2

    .line 31
    .line 32
    const-string p0, "\u76ee\u5f55\u6388\u6743\u5931\u8d25"

    .line 33
    .line 34
    invoke-static {p1, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_2
    invoke-virtual {p4}, Landroid/content/Intent;->getFlags()I

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    and-int/lit8 v1, p4, 0x1

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    move p2, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    and-int/lit8 p4, p4, 0x2

    .line 50
    .line 51
    if-eqz p4, :cond_4

    .line 52
    .line 53
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    const/4 v1, 0x3

    .line 58
    invoke-virtual {p4, p3, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_4
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 63
    .line 64
    .line 65
    move-result-object p4

    .line 66
    invoke-virtual {p4, p3, p2}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    invoke-virtual {p4, p3, p2}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_1
    move-exception p2

    .line 79
    const-string p4, "voice-message"

    .line 80
    .line 81
    const-string v1, "persist-tree-permission"

    .line 82
    .line 83
    invoke-static {p4, v1, p2}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-static {p1, p3}, Lcom/mr/elaris/w;->L(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    :goto_1
    if-nez p2, :cond_5

    .line 91
    .line 92
    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string p2, "local voice tree grant was not persisted uri="

    .line 101
    .line 102
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const-string p0, "\u76ee\u5f55\u6388\u6743\u672a\u4fdd\u5b58\uff0c\u8bf7\u91cd\u65b0\u9009\u62e9\u7cfb\u7edf\u5141\u8bb8\u6388\u6743\u7684\u76ee\u5f55"

    .line 110
    .line 111
    invoke-static {p1, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_3

    .line 115
    .line 116
    :cond_5
    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-nez p2, :cond_6

    .line 121
    .line 122
    move-object p2, p1

    .line 123
    :cond_6
    invoke-static {p3}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p4

    .line 127
    invoke-static {p3, p4}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    invoke-static {p2, p4}, Lcom/mr/elaris/w;->n0(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-nez v2, :cond_7

    .line 140
    .line 141
    const-string v1, "\u6388\u6743\u76ee\u5f55"

    .line 142
    .line 143
    :cond_7
    new-instance v2, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    const-string v1, "elaris_local_voice_state"

    .line 152
    .line 153
    invoke-virtual {p2, v1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    const-string v0, "tree_uri"

    .line 162
    .line 163
    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    const-string v0, "tree_doc_uri"

    .line 172
    .line 173
    invoke-virtual {p4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p4

    .line 177
    invoke-interface {p2, v0, p4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    const-string p4, "tree_parent_docs"

    .line 182
    .line 183
    const-string v0, ""

    .line 184
    .line 185
    invoke-interface {p2, p4, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    const-string p4, "tree_segments"

    .line 190
    .line 191
    invoke-static {v2}, Lcom/mr/elaris/w;->e0(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-interface {p2, p4, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 200
    .line 201
    .line 202
    :catchall_2
    invoke-virtual {p3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p2

    .line 206
    invoke-static {p2}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    const-string p3, "local voice entry tree granted uri="

    .line 211
    .line 212
    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    invoke-static {p2}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const-string p2, "\u5df2\u6388\u6743\u76ee\u5f55"

    .line 220
    .line 221
    invoke-static {p1, p2}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    iget-object p2, p0, Ly;->b:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast p2, Ljava/lang/ClassLoader;

    .line 227
    .line 228
    iget-object p0, p0, Ly;->a:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast p0, Lpd;

    .line 231
    .line 232
    invoke-static {p1, p2, p0}, Lcom/mr/elaris/w;->O0(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_8
    :goto_2
    sput-object v2, Lcom/mr/elaris/w;->r:Ly;

    .line 237
    .line 238
    :cond_9
    :goto_3
    return-void

    .line 239
    :pswitch_0
    sget-object p0, Lg2;->h:Lf2;

    .line 240
    .line 241
    sput-object v2, Lg2;->h:Lf2;

    .line 242
    .line 243
    if-eqz p0, :cond_d

    .line 244
    .line 245
    if-ne p3, v1, :cond_d

    .line 246
    .line 247
    if-nez p4, :cond_a

    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_a
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    if-nez p1, :cond_b

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_b
    iget-object p2, p0, Lf2;->a:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 260
    .line 261
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    check-cast p2, Landroid/app/Activity;

    .line 266
    .line 267
    iget-object p3, p0, Lf2;->b:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p3, Ljava/lang/ref/WeakReference;

    .line 270
    .line 271
    invoke-virtual {p3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p3

    .line 275
    check-cast p3, Le2;

    .line 276
    .line 277
    if-eqz p2, :cond_d

    .line 278
    .line 279
    if-nez p3, :cond_c

    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_c
    iget-object p4, p3, Le2;->g:Landroid/widget/TextView;

    .line 283
    .line 284
    const-string v0, "\u6b63\u5728\u4e0a\u4f20\u5f85\u5ba1\u6838\u8868\u60c5"

    .line 285
    .line 286
    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 287
    .line 288
    .line 289
    sget-object p4, Lg2;->c:Ljava/util/concurrent/ExecutorService;

    .line 290
    .line 291
    new-instance v0, Lo;

    .line 292
    .line 293
    invoke-direct {v0, p2, p1, p0, p3}, Lo;-><init>(Landroid/app/Activity;Landroid/net/Uri;Lf2;Le2;)V

    .line 294
    .line 295
    .line 296
    invoke-interface {p4, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 297
    .line 298
    .line 299
    :cond_d
    :goto_4
    return-void

    .line 300
    :pswitch_1
    const-class p0, Ls;

    .line 301
    .line 302
    monitor-enter p0

    .line 303
    :try_start_3
    sget-boolean v3, Ls;->h:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 304
    .line 305
    if-nez v3, :cond_e

    .line 306
    .line 307
    monitor-exit p0

    .line 308
    goto :goto_6

    .line 309
    :cond_e
    :try_start_4
    sput-boolean v0, Ls;->h:Z

    .line 310
    .line 311
    sget-object v0, Ls;->d:Ljava/lang/ref/WeakReference;

    .line 312
    .line 313
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 314
    .line 315
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    sput-object v3, Ls;->d:Ljava/lang/ref/WeakReference;

    .line 319
    .line 320
    if-nez v0, :cond_f

    .line 321
    .line 322
    goto :goto_5

    .line 323
    :cond_f
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 327
    :goto_5
    monitor-exit p0

    .line 328
    :goto_6
    if-nez v2, :cond_10

    .line 329
    .line 330
    const-string p0, "album video bubble duplicate picker result ignored"

    .line 331
    .line 332
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    goto :goto_8

    .line 336
    :cond_10
    if-ne p3, v1, :cond_16

    .line 337
    .line 338
    if-eqz p4, :cond_16

    .line 339
    .line 340
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    if-nez p0, :cond_11

    .line 345
    .line 346
    goto :goto_8

    .line 347
    :cond_11
    invoke-virtual {p4}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    if-eqz p1, :cond_14

    .line 352
    .line 353
    if-nez p0, :cond_12

    .line 354
    .line 355
    goto :goto_7

    .line 356
    :cond_12
    invoke-virtual {p4}, Landroid/content/Intent;->getFlags()I

    .line 357
    .line 358
    .line 359
    move-result p3

    .line 360
    and-int/2addr p3, p2

    .line 361
    if-nez p3, :cond_13

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_13
    :try_start_5
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 365
    .line 366
    .line 367
    move-result-object p3

    .line 368
    invoke-virtual {p3, p0, p2}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 369
    .line 370
    .line 371
    const-string p3, "album video bubble document uri permission retained"

    .line 372
    .line 373
    invoke-static {p3}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_0

    .line 374
    .line 375
    .line 376
    :catch_0
    :cond_14
    :goto_7
    sget-object p3, Ls;->e:Ljava/lang/ClassLoader;

    .line 377
    .line 378
    if-eqz p1, :cond_16

    .line 379
    .line 380
    if-nez p3, :cond_15

    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_15
    new-instance p4, Ljava/lang/Thread;

    .line 384
    .line 385
    new-instance v0, Lo;

    .line 386
    .line 387
    invoke-direct {v0, p1, p3, v2, p0}, Lo;-><init>(Landroid/app/Activity;Ljava/lang/ClassLoader;Ljava/lang/Object;Landroid/net/Uri;)V

    .line 388
    .line 389
    .line 390
    const-string p0, "Elaris-video-bubble-send"

    .line 391
    .line 392
    invoke-direct {p4, v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p4, p2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {p4}, Ljava/lang/Thread;->start()V

    .line 399
    .line 400
    .line 401
    :cond_16
    :goto_8
    return-void

    .line 402
    :catchall_3
    move-exception p1

    .line 403
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 404
    throw p1

    .line 405
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
