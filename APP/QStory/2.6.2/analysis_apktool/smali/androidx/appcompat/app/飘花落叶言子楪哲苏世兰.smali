.class public final synthetic Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/content/Context;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

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
    .locals 10

    .line 1
    iget v0, p0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Landroid/content/Context;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-static {}, Lkotlin/reflect/jvm/internal/飘花落叶言楪子世哲兰苏;->飘花落叶言子楪兰哲苏世()Lcom/alibaba/fastjson2/JSONObject;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide v2, -0x36a40225051405a7L    # -2.4969361751572692E45

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    const-wide v2, -0x36a40221051405a7L    # -2.49694161967514E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentAccountNickName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lio/ktor/client/plugins/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲兰世()Landroid/util/Pair;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    const-wide v3, -0x36a4022a051405a7L    # -2.4969293695099308E45

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iget-object v4, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    const-wide v3, -0x36a40215051405a7L    # -2.496957953228752E45

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catch_0
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    goto :goto_1

    .line 83
    :cond_0
    :goto_0
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    .line 84
    .line 85
    invoke-direct {v2, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 86
    .line 87
    .line 88
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 89
    .line 90
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 91
    .line 92
    .line 93
    const-wide v4, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    iput-object v4, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 103
    .line 104
    sget-object v4, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Landroid/os/Handler;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v4, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;

    .line 110
    .line 111
    const/16 v5, 0x9

    .line 112
    .line 113
    invoke-direct {v4, v3, v5, v2}, L飘花落叶言世苏兰哲子楪/飘花落叶言子世兰楪苏哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    const-wide v5, -0x36a538e5051405a7L    # -2.3886556037440912E45

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    const-wide v5, -0x36a582f4051405a7L    # -2.362849950166275E45

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    sget-object v5, L飘花落叶言苏世子楪兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/ExecutorService;

    .line 133
    .line 134
    new-instance v6, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;

    .line 135
    .line 136
    invoke-direct {v6, p0, v1, v4}, L飘花落叶言苏哲世子楪兰/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 143
    .line 144
    .line 145
    iget-object p0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p0, Ljava/lang/CharSequence;

    .line 148
    .line 149
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-lez p0, :cond_1

    .line 154
    .line 155
    const-wide v4, -0x36a40218051405a7L    # -2.496953869840349E45

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    iget-object v2, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 165
    .line 166
    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    const-wide v2, -0x36a40201051405a7L    # -2.4969851758181058E45

    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    const-wide v2, -0x36a5018b051405a7L    # -2.40794280830117E45

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v0, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    :cond_1
    invoke-static {}, L飘花落叶言苏哲子兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-interface {p0, v0}, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/JSONObject;)Lretrofit2/飘花落叶言子楪世兰苏哲;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-interface {p0}, Lretrofit2/飘花落叶言子楪世兰苏哲;->execute()Lretrofit2/飘花落叶言子世兰楪哲苏;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :goto_1
    const-wide v2, -0x36a401f6051405a7L    # -2.4970001482422503E45

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-static {v0, v2, p0, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 216
    .line 217
    .line 218
    :goto_2
    return-void

    .line 219
    :pswitch_0
    new-instance v0, Landroidx/profileinstaller/飘花落叶言子楪世哲兰苏;

    .line 220
    .line 221
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 222
    .line 223
    .line 224
    sget-object v1, Landroidx/profileinstaller/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 225
    .line 226
    const/4 v2, 0x0

    .line 227
    invoke-static {p0, v0, v1, v2}, Landroidx/profileinstaller/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世哲苏(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/飘花落叶言子楪世兰苏哲;Z)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_1
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 232
    .line 233
    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 234
    .line 235
    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 236
    .line 237
    .line 238
    const/4 v4, 0x0

    .line 239
    const/4 v5, 0x1

    .line 240
    const-wide/16 v6, 0x0

    .line 241
    .line 242
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 243
    .line 244
    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 245
    .line 246
    .line 247
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;

    .line 248
    .line 249
    const/4 v1, 0x2

    .line 250
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/飘花落叶言子楪哲苏世兰;-><init>(Landroid/content/Context;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 254
    .line 255
    .line 256
    return-void

    .line 257
    :pswitch_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 258
    .line 259
    const/16 v2, 0x21

    .line 260
    .line 261
    if-lt v0, v2, :cond_7

    .line 262
    .line 263
    new-instance v3, Landroid/content/ComponentName;

    .line 264
    .line 265
    const-string v4, "androidx.appcompat.app.AppLocalesMetadataHolderService"

    .line 266
    .line 267
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-virtual {v4, v3}, Landroid/content/pm/PackageManager;->getComponentEnabledSetting(Landroid/content/ComponentName;)I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    if-eq v4, v1, :cond_7

    .line 279
    .line 280
    const-string v4, "locale"

    .line 281
    .line 282
    if-lt v0, v2, :cond_4

    .line 283
    .line 284
    sget-object v0, Landroidx/appcompat/app/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏哲世:Landroidx/collection/飘花落叶言子楪苏世兰哲;

    .line 285
    .line 286
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    new-instance v2, Landroidx/collection/飘花落叶言子楪世苏兰哲;

    .line 290
    .line 291
    invoke-direct {v2, v0}, Landroidx/collection/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/collection/飘花落叶言子楪苏世兰哲;)V

    .line 292
    .line 293
    .line 294
    :cond_2
    invoke-virtual {v2}, Landroidx/collection/飘花落叶言子楪世苏兰哲;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    if-eqz v0, :cond_3

    .line 299
    .line 300
    invoke-virtual {v2}, Landroidx/collection/飘花落叶言子楪世苏兰哲;->next()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 305
    .line 306
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    check-cast v0, Landroidx/appcompat/app/飘花落叶言子楪兰苏世哲;

    .line 311
    .line 312
    if-eqz v0, :cond_2

    .line 313
    .line 314
    check-cast v0, Landroidx/appcompat/app/飘花落叶言子世哲楪兰苏;

    .line 315
    .line 316
    iget-object v0, v0, Landroidx/appcompat/app/飘花落叶言子世哲楪兰苏;->飘花落叶言子世楪苏兰哲:Landroid/content/Context;

    .line 317
    .line 318
    if-eqz v0, :cond_2

    .line 319
    .line 320
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    goto :goto_3

    .line 325
    :cond_3
    const/4 v0, 0x0

    .line 326
    :goto_3
    if-eqz v0, :cond_5

    .line 327
    .line 328
    invoke-static {v0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Landroid/os/LocaleList;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    new-instance v2, Landroidx/core/os/飘花落叶言子楪苏世兰哲;

    .line 333
    .line 334
    new-instance v5, Landroidx/core/os/飘花落叶言子楪苏哲世兰;

    .line 335
    .line 336
    invoke-direct {v5, v0}, Landroidx/core/os/飘花落叶言子楪苏哲世兰;-><init>(Landroid/os/LocaleList;)V

    .line 337
    .line 338
    .line 339
    invoke-direct {v2, v5}, Landroidx/core/os/飘花落叶言子楪苏世兰哲;-><init>(Landroidx/core/os/飘花落叶言子楪苏哲世兰;)V

    .line 340
    .line 341
    .line 342
    goto :goto_4

    .line 343
    :cond_4
    sget-object v2, Landroidx/appcompat/app/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:Landroidx/core/os/飘花落叶言子楪苏世兰哲;

    .line 344
    .line 345
    if-eqz v2, :cond_5

    .line 346
    .line 347
    goto :goto_4

    .line 348
    :cond_5
    sget-object v2, Landroidx/core/os/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/core/os/飘花落叶言子楪苏世兰哲;

    .line 349
    .line 350
    :goto_4
    iget-object v0, v2, Landroidx/core/os/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/core/os/飘花落叶言子楪苏哲世兰;

    .line 351
    .line 352
    iget-object v0, v0, Landroidx/core/os/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/os/LocaleList;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v0

    .line 358
    if-eqz v0, :cond_6

    .line 359
    .line 360
    invoke-static {p0}, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰(Landroid/content/Context;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    if-eqz v2, :cond_6

    .line 369
    .line 370
    invoke-static {v0}, Landroidx/appcompat/app/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Landroid/os/LocaleList;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-static {v2, v0}, Landroidx/appcompat/app/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Landroid/os/LocaleList;)V

    .line 375
    .line 376
    .line 377
    :cond_6
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    invoke-virtual {p0, v3, v1, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 382
    .line 383
    .line 384
    :cond_7
    sput-boolean v1, Landroidx/appcompat/app/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪兰苏世哲:Z

    .line 385
    .line 386
    return-void

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
