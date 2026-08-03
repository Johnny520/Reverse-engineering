.class public final Lqb/j;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqb/k;


# direct methods
.method public synthetic constructor <init>(Lqb/k;I)V
    .locals 0

    .line 1
    iput p2, p0, Lqb/j;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lqb/j;->b:Lqb/k;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 12

    .line 1
    iget v0, p0, Lqb/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lqb/j;->b:Lqb/k;

    .line 14
    .line 15
    invoke-virtual {v0}, Lqb/k;->p()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget-object v2, v0, Lqb/k;->c:Landroid/content/SharedPreferences;

    .line 20
    .line 21
    if-eqz v1, :cond_5

    .line 22
    .line 23
    const-string v1, "voice_forward_chat_multi_forward_enable"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const-string v4, "voice_forward_chat_multi_merge_enable"

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v3}, Lk8/b;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_5

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_3

    .line 69
    .line 70
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v7}, Lqb/k;->u(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    :goto_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 82
    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    invoke-static {v5, p1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-eqz v6, :cond_5

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_4

    .line 96
    .line 97
    const-string v10, "\u9010\u6761\u8f6c\u53d1\u8bed\u97f3[H]"

    .line 98
    .line 99
    const-string v11, "icons_filled_share"

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    const/4 v8, 0x0

    .line 103
    const v9, 0x4843564d    # 200025.2f

    .line 104
    .line 105
    .line 106
    invoke-static/range {v6 .. v11}, Lqb/k;->a(Ljava/lang/Object;Landroid/view/View;IILjava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-interface {v2, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    const/4 v0, 0x2

    .line 120
    if-lt p1, v0, :cond_5

    .line 121
    .line 122
    const-string v10, "\u5408\u5e76\u8bed\u97f3[H]"

    .line 123
    .line 124
    const-string v11, "icons_filled_share"

    .line 125
    .line 126
    const/4 v7, 0x0

    .line 127
    const/4 v8, 0x0

    .line 128
    const v9, 0x4843564e    # 200025.22f

    .line 129
    .line 130
    .line 131
    invoke-static/range {v6 .. v11}, Lqb/k;->a(Ljava/lang/Object;Landroid/view/View;IILjava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :cond_5
    :goto_1
    return-void

    .line 135
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lqb/j;->b:Lqb/k;

    .line 139
    .line 140
    invoke-virtual {v0}, Lqb/k;->p()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_6

    .line 145
    .line 146
    goto/16 :goto_f

    .line 147
    .line 148
    :cond_6
    const-string v1, "voice_forward_favorite_forward_enable"

    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    const/4 v2, 0x1

    .line 155
    const/4 v3, 0x0

    .line 156
    if-eqz v1, :cond_7

    .line 157
    .line 158
    iget-object v1, v0, Lqb/k;->d:Landroid/content/SharedPreferences;

    .line 159
    .line 160
    const-string v4, "message_forward_favorite_enable"

    .line 161
    .line 162
    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_7

    .line 167
    .line 168
    move v1, v2

    .line 169
    goto :goto_2

    .line 170
    :cond_7
    move v1, v3

    .line 171
    :goto_2
    const-string v4, "voice_forward_favorite_save_enable"

    .line 172
    .line 173
    invoke-virtual {v0, v4}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-nez v1, :cond_8

    .line 178
    .line 179
    if-nez v4, :cond_8

    .line 180
    .line 181
    goto/16 :goto_f

    .line 182
    .line 183
    :cond_8
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 184
    .line 185
    if-eqz v5, :cond_1c

    .line 186
    .line 187
    invoke-static {v3, v5}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    if-eqz v6, :cond_1c

    .line 192
    .line 193
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 194
    .line 195
    invoke-static {v3}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    if-eqz v3, :cond_9

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_9
    invoke-static {v5}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    if-eqz v3, :cond_1c

    .line 207
    .line 208
    :goto_3
    invoke-static {v3}, Lqb/k;->r(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-nez v7, :cond_a

    .line 213
    .line 214
    goto/16 :goto_f

    .line 215
    .line 216
    :cond_a
    invoke-static {v2, v5}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    instance-of v5, v2, Landroid/view/View;

    .line 221
    .line 222
    const/4 v7, 0x0

    .line 223
    if-eqz v5, :cond_b

    .line 224
    .line 225
    check-cast v2, Landroid/view/View;

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_b
    move-object v2, v7

    .line 229
    :goto_4
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 230
    .line 231
    if-eqz v5, :cond_c

    .line 232
    .line 233
    iget-object v8, v0, Lqb/k;->m:Ljava/util/Map;

    .line 234
    .line 235
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    check-cast v8, Ljava/util/Map;

    .line 239
    .line 240
    invoke-interface {v8, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    :cond_c
    if-eqz v2, :cond_d

    .line 244
    .line 245
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    goto :goto_5

    .line 250
    :cond_d
    move-object v5, v7

    .line 251
    :goto_5
    instance-of v8, v5, Landroid/app/Activity;

    .line 252
    .line 253
    if-eqz v8, :cond_e

    .line 254
    .line 255
    check-cast v5, Landroid/app/Activity;

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_e
    move-object v5, v7

    .line 259
    :goto_6
    if-eqz v5, :cond_f

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_f
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    if-eqz v5, :cond_10

    .line 267
    .line 268
    invoke-virtual {v5}, Lq8/o;->a()Landroid/app/Activity;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    goto :goto_7

    .line 273
    :cond_10
    move-object v5, v7

    .line 274
    :goto_7
    if-eqz v5, :cond_11

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_11
    move-object v5, v7

    .line 278
    :goto_8
    if-eqz v5, :cond_12

    .line 279
    .line 280
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    if-nez v8, :cond_12

    .line 285
    .line 286
    iget-object v8, v0, Lqb/k;->n:Ljava/util/Map;

    .line 287
    .line 288
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    check-cast v8, Ljava/util/Map;

    .line 292
    .line 293
    invoke-interface {v8, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    :cond_12
    iput-object v3, v0, Lqb/k;->s:Ljava/lang/Object;

    .line 297
    .line 298
    invoke-virtual {v0, v3}, Lqb/k;->B(Ljava/lang/Object;)Lqb/i;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    if-eqz v3, :cond_1a

    .line 303
    .line 304
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 305
    .line 306
    if-eqz p1, :cond_13

    .line 307
    .line 308
    iget-object v5, v0, Lqb/k;->o:Ljava/util/Map;

    .line 309
    .line 310
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    check-cast v5, Ljava/util/Map;

    .line 314
    .line 315
    invoke-interface {v5, p1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    :cond_13
    if-eqz v2, :cond_14

    .line 319
    .line 320
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    goto :goto_9

    .line 325
    :cond_14
    move-object p1, v7

    .line 326
    :goto_9
    instance-of v5, p1, Landroid/app/Activity;

    .line 327
    .line 328
    if-eqz v5, :cond_15

    .line 329
    .line 330
    check-cast p1, Landroid/app/Activity;

    .line 331
    .line 332
    goto :goto_a

    .line 333
    :cond_15
    move-object p1, v7

    .line 334
    :goto_a
    if-eqz p1, :cond_16

    .line 335
    .line 336
    :goto_b
    move-object v7, p1

    .line 337
    goto :goto_d

    .line 338
    :cond_16
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    if-eqz p1, :cond_17

    .line 343
    .line 344
    invoke-virtual {p1}, Lq8/o;->a()Landroid/app/Activity;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    goto :goto_c

    .line 349
    :cond_17
    move-object p1, v7

    .line 350
    :goto_c
    if-eqz p1, :cond_18

    .line 351
    .line 352
    goto :goto_b

    .line 353
    :cond_18
    :goto_d
    if-eqz v7, :cond_19

    .line 354
    .line 355
    invoke-virtual {v7}, Landroid/app/Activity;->isFinishing()Z

    .line 356
    .line 357
    .line 358
    move-result p1

    .line 359
    if-nez p1, :cond_19

    .line 360
    .line 361
    iget-object p1, v0, Lqb/k;->p:Ljava/util/Map;

    .line 362
    .line 363
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    check-cast p1, Ljava/util/Map;

    .line 367
    .line 368
    invoke-interface {p1, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    :cond_19
    iput-object v3, v0, Lqb/k;->t:Lqb/i;

    .line 372
    .line 373
    :cond_1a
    if-eqz v1, :cond_1b

    .line 374
    .line 375
    const-string v10, "\u8f6c\u53d1[H]"

    .line 376
    .line 377
    const-string v11, "icons_filled_share"

    .line 378
    .line 379
    const/4 v8, 0x0

    .line 380
    const v9, 0x48435646    # 200025.1f

    .line 381
    .line 382
    .line 383
    move-object v7, v2

    .line 384
    invoke-static/range {v6 .. v11}, Lqb/k;->a(Ljava/lang/Object;Landroid/view/View;IILjava/lang/String;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    goto :goto_e

    .line 388
    :cond_1b
    move-object v7, v2

    .line 389
    :goto_e
    if-eqz v4, :cond_1c

    .line 390
    .line 391
    const-string v10, "\u4fdd\u5b58[H]"

    .line 392
    .line 393
    const-string v11, "icons_filled_download"

    .line 394
    .line 395
    const/4 v8, 0x0

    .line 396
    const v9, 0x48435653    # 200025.3f

    .line 397
    .line 398
    .line 399
    invoke-static/range {v6 .. v11}, Lqb/k;->a(Ljava/lang/Object;Landroid/view/View;IILjava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    :cond_1c
    :goto_f
    return-void

    .line 403
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 14

    .line 1
    iget v0, p0, Lqb/j;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lqb/j;->b:Lqb/k;

    .line 14
    .line 15
    iget-object v1, v0, Lqb/k;->l:Ljava/util/Set;

    .line 16
    .line 17
    invoke-virtual {v0}, Lqb/k;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1d

    .line 22
    .line 23
    const-string v2, "voice_forward_favorite_forward_enable"

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    goto/16 :goto_11

    .line 32
    .line 33
    :cond_0
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-static {v3, v2}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move-object v2, v4

    .line 45
    :goto_0
    instance-of v5, v2, Landroid/view/View;

    .line 46
    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    check-cast v2, Landroid/view/View;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    move-object v2, v4

    .line 53
    :goto_1
    if-eqz v2, :cond_1d

    .line 54
    .line 55
    invoke-static {v2}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_1d

    .line 60
    .line 61
    invoke-static {v2}, Lqb/k;->r(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-nez v5, :cond_3

    .line 66
    .line 67
    goto/16 :goto_11

    .line 68
    .line 69
    :cond_3
    iget-object v5, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 70
    .line 71
    instance-of v6, v5, Landroid/app/Activity;

    .line 72
    .line 73
    if-eqz v6, :cond_4

    .line 74
    .line 75
    check-cast v5, Landroid/app/Activity;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    move-object v5, v4

    .line 79
    :goto_2
    if-eqz v5, :cond_5

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    if-eqz v5, :cond_6

    .line 87
    .line 88
    invoke-virtual {v5}, Lq8/o;->a()Landroid/app/Activity;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    goto :goto_3

    .line 93
    :cond_6
    move-object v5, v4

    .line 94
    :goto_3
    if-eqz v5, :cond_7

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_7
    move-object v5, v4

    .line 98
    :goto_4
    iget-object v6, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 99
    .line 100
    const-string v7, "S"

    .line 101
    .line 102
    const-string v8, "Q"

    .line 103
    .line 104
    const-string v9, "T"

    .line 105
    .line 106
    const-string v10, "P"

    .line 107
    .line 108
    filled-new-array {v9, v10, v7, v8}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    const/4 v8, 0x0

    .line 113
    move v9, v8

    .line 114
    :goto_5
    const/4 v10, 0x4

    .line 115
    if-lt v9, v10, :cond_13

    .line 116
    .line 117
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->chatPage()Lq8/m;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    if-eqz v7, :cond_9

    .line 122
    .line 123
    invoke-virtual {v7}, Lq8/m;->a()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    if-eqz v7, :cond_9

    .line 128
    .line 129
    invoke-static {v7}, Lqb/k;->s(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v9

    .line 133
    if-eqz v9, :cond_8

    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_8
    move-object v7, v4

    .line 137
    :goto_6
    if-eqz v7, :cond_9

    .line 138
    .line 139
    goto/16 :goto_f

    .line 140
    .line 141
    :cond_9
    const-string v7, ""

    .line 142
    .line 143
    if-nez v6, :cond_a

    .line 144
    .line 145
    goto/16 :goto_f

    .line 146
    .line 147
    :cond_a
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    :goto_7
    if-eqz v9, :cond_16

    .line 152
    .line 153
    const-class v10, Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    if-nez v10, :cond_16

    .line 160
    .line 161
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    :cond_b
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    if-eqz v11, :cond_12

    .line 174
    .line 175
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    check-cast v11, Ljava/lang/reflect/Field;

    .line 180
    .line 181
    invoke-virtual {v11}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    const-class v13, Ljava/lang/String;

    .line 186
    .line 187
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v12

    .line 191
    if-nez v12, :cond_c

    .line 192
    .line 193
    goto :goto_8

    .line 194
    :cond_c
    invoke-static {v11, v6}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    instance-of v12, v11, Ljava/lang/String;

    .line 199
    .line 200
    if-eqz v12, :cond_d

    .line 201
    .line 202
    check-cast v11, Ljava/lang/String;

    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_d
    move-object v11, v4

    .line 206
    :goto_9
    if-eqz v11, :cond_b

    .line 207
    .line 208
    invoke-static {v11}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    const-string v13, "filehelper"

    .line 217
    .line 218
    invoke-static {v12, v13}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    if-eqz v13, :cond_f

    .line 223
    .line 224
    :cond_e
    :goto_a
    move v12, v3

    .line 225
    goto :goto_b

    .line 226
    :cond_f
    const-string v13, "@chatroom"

    .line 227
    .line 228
    invoke-static {v12, v13, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v13

    .line 232
    if-nez v13, :cond_e

    .line 233
    .line 234
    const-string v13, "@im.chatroom"

    .line 235
    .line 236
    invoke-static {v12, v13, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 237
    .line 238
    .line 239
    move-result v13

    .line 240
    if-nez v13, :cond_e

    .line 241
    .line 242
    const-string v13, "@openim"

    .line 243
    .line 244
    invoke-static {v12, v13, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 245
    .line 246
    .line 247
    move-result v13

    .line 248
    if-eqz v13, :cond_10

    .line 249
    .line 250
    goto :goto_a

    .line 251
    :cond_10
    invoke-static {v12}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v12

    .line 255
    :goto_b
    if-eqz v12, :cond_11

    .line 256
    .line 257
    goto :goto_c

    .line 258
    :cond_11
    move-object v11, v4

    .line 259
    :goto_c
    if-eqz v11, :cond_b

    .line 260
    .line 261
    move-object v7, v11

    .line 262
    goto :goto_f

    .line 263
    :cond_12
    invoke-virtual {v9}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    goto :goto_7

    .line 268
    :cond_13
    aget-object v10, v7, v9

    .line 269
    .line 270
    invoke-static {v6, v10}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v10

    .line 274
    instance-of v11, v10, Ljava/lang/String;

    .line 275
    .line 276
    if-eqz v11, :cond_14

    .line 277
    .line 278
    check-cast v10, Ljava/lang/String;

    .line 279
    .line 280
    goto :goto_d

    .line 281
    :cond_14
    move-object v10, v4

    .line 282
    :goto_d
    if-eqz v10, :cond_1c

    .line 283
    .line 284
    invoke-static {v10}, Lqb/k;->s(Ljava/lang/String;)Z

    .line 285
    .line 286
    .line 287
    move-result v11

    .line 288
    if-eqz v11, :cond_15

    .line 289
    .line 290
    goto :goto_e

    .line 291
    :cond_15
    move-object v10, v4

    .line 292
    :goto_e
    if-eqz v10, :cond_1c

    .line 293
    .line 294
    move-object v7, v10

    .line 295
    :cond_16
    :goto_f
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    if-eqz v6, :cond_17

    .line 300
    .line 301
    const-string v0, "\u5f53\u524d\u804a\u5929\u4e0d\u53ef\u7528"

    .line 302
    .line 303
    invoke-static {v5, v0}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    goto :goto_11

    .line 310
    :cond_17
    invoke-virtual {v0, v2}, Lqb/k;->B(Ljava/lang/Object;)Lqb/i;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    if-nez v2, :cond_18

    .line 315
    .line 316
    const-string v0, "\u6536\u85cf\u8bed\u97f3\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 317
    .line 318
    invoke-static {v5, v0}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    goto :goto_11

    .line 325
    :cond_18
    if-eqz v5, :cond_1b

    .line 326
    .line 327
    invoke-virtual {v5}, Landroid/app/Activity;->isFinishing()Z

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    if-eqz v6, :cond_19

    .line 332
    .line 333
    goto :goto_10

    .line 334
    :cond_19
    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    if-nez v6, :cond_1a

    .line 339
    .line 340
    invoke-interface {v1, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    new-instance v1, Laa/c;

    .line 344
    .line 345
    const/16 v6, 0x1a

    .line 346
    .line 347
    invoke-direct {v1, v0, v6, v2}, Laa/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    new-instance v6, Lc9/n0;

    .line 351
    .line 352
    invoke-direct {v6, v0, v2, v7, v5}, Lc9/n0;-><init>(Lqb/k;Lqb/i;Ljava/lang/String;Landroid/app/Activity;)V

    .line 353
    .line 354
    .line 355
    new-instance v2, Lqb/c;

    .line 356
    .line 357
    const/4 v7, 0x1

    .line 358
    invoke-direct {v2, v0, v5, v7}, Lqb/c;-><init>(Lqb/k;Landroid/app/Activity;I)V

    .line 359
    .line 360
    .line 361
    new-instance v0, Ldb/f;

    .line 362
    .line 363
    const/16 v7, 0x15

    .line 364
    .line 365
    invoke-direct {v0, v1, v7, v6}, Ldb/f;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    new-instance v1, Ls0/d;

    .line 369
    .line 370
    const v6, 0x5882feb4

    .line 371
    .line 372
    .line 373
    invoke-direct {v1, v6, v0, v3}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 374
    .line 375
    .line 376
    invoke-static {v5, v2, v1}, Lwb/y2;->P1(Landroid/app/Activity;Lfg/a;Ls0/d;)Lwb/kv;

    .line 377
    .line 378
    .line 379
    :cond_1a
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    goto :goto_11

    .line 383
    :cond_1b
    :goto_10
    invoke-virtual {p1, v4}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    goto :goto_11

    .line 387
    :cond_1c
    add-int/lit8 v9, v9, 0x1

    .line 388
    .line 389
    goto/16 :goto_5

    .line 390
    .line 391
    :cond_1d
    :goto_11
    return-void

    .line 392
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    iget-object v0, p0, Lqb/j;->b:Lqb/k;

    .line 396
    .line 397
    invoke-virtual {v0}, Lqb/k;->p()Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-nez v1, :cond_1e

    .line 402
    .line 403
    goto/16 :goto_1a

    .line 404
    .line 405
    :cond_1e
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 406
    .line 407
    if-eqz v1, :cond_30

    .line 408
    .line 409
    const/4 v2, 0x0

    .line 410
    invoke-static {v2, v1}, Ltf/l;->C0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    instance-of v4, v3, Landroid/view/MenuItem;

    .line 415
    .line 416
    const/4 v5, 0x0

    .line 417
    if-eqz v4, :cond_1f

    .line 418
    .line 419
    check-cast v3, Landroid/view/MenuItem;

    .line 420
    .line 421
    goto :goto_12

    .line 422
    :cond_1f
    move-object v3, v5

    .line 423
    :goto_12
    if-eqz v3, :cond_30

    .line 424
    .line 425
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    const v6, 0x48435646    # 200025.1f

    .line 430
    .line 431
    .line 432
    const v7, 0x48435653    # 200025.3f

    .line 433
    .line 434
    .line 435
    if-eq v4, v6, :cond_20

    .line 436
    .line 437
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    if-eq v4, v7, :cond_20

    .line 442
    .line 443
    goto/16 :goto_1a

    .line 444
    .line 445
    :cond_20
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 446
    .line 447
    .line 448
    move-result v4

    .line 449
    if-ne v4, v6, :cond_21

    .line 450
    .line 451
    const-string v4, "voice_forward_favorite_forward_enable"

    .line 452
    .line 453
    invoke-virtual {v0, v4}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 454
    .line 455
    .line 456
    move-result v4

    .line 457
    if-eqz v4, :cond_30

    .line 458
    .line 459
    iget-object v4, v0, Lqb/k;->d:Landroid/content/SharedPreferences;

    .line 460
    .line 461
    const-string v6, "message_forward_favorite_enable"

    .line 462
    .line 463
    invoke-interface {v4, v6, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 464
    .line 465
    .line 466
    move-result v2

    .line 467
    if-nez v2, :cond_30

    .line 468
    .line 469
    :cond_21
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 470
    .line 471
    .line 472
    move-result v2

    .line 473
    if-ne v2, v7, :cond_22

    .line 474
    .line 475
    const-string v2, "voice_forward_favorite_save_enable"

    .line 476
    .line 477
    invoke-virtual {v0, v2}, Lqb/k;->O(Ljava/lang/String;)Z

    .line 478
    .line 479
    .line 480
    move-result v2

    .line 481
    if-nez v2, :cond_22

    .line 482
    .line 483
    goto/16 :goto_1a

    .line 484
    .line 485
    :cond_22
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    if-eqz v2, :cond_23

    .line 490
    .line 491
    invoke-virtual {v2}, Lq8/o;->a()Landroid/app/Activity;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    goto :goto_13

    .line 496
    :cond_23
    move-object v2, v5

    .line 497
    :goto_13
    if-eqz v2, :cond_24

    .line 498
    .line 499
    goto :goto_14

    .line 500
    :cond_24
    move-object v2, v5

    .line 501
    :goto_14
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 502
    .line 503
    invoke-static {v4}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    if-eqz v4, :cond_25

    .line 508
    .line 509
    goto :goto_16

    .line 510
    :cond_25
    invoke-static {v1}, Lg4/a;->J(Ljava/lang/Object;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    if-eqz v4, :cond_26

    .line 515
    .line 516
    goto :goto_16

    .line 517
    :cond_26
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 518
    .line 519
    if-eqz v1, :cond_27

    .line 520
    .line 521
    iget-object v4, v0, Lqb/k;->m:Ljava/util/Map;

    .line 522
    .line 523
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    if-eqz v1, :cond_27

    .line 528
    .line 529
    :goto_15
    move-object v4, v1

    .line 530
    goto :goto_16

    .line 531
    :cond_27
    if-eqz v2, :cond_28

    .line 532
    .line 533
    iget-object v1, v0, Lqb/k;->n:Ljava/util/Map;

    .line 534
    .line 535
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    if-eqz v1, :cond_28

    .line 540
    .line 541
    goto :goto_15

    .line 542
    :cond_28
    iget-object v1, v0, Lqb/k;->s:Ljava/lang/Object;

    .line 543
    .line 544
    goto :goto_15

    .line 545
    :goto_16
    if-eqz v4, :cond_29

    .line 546
    .line 547
    invoke-virtual {v0, v4}, Lqb/k;->B(Ljava/lang/Object;)Lqb/i;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    if-eqz v1, :cond_29

    .line 552
    .line 553
    goto :goto_17

    .line 554
    :cond_29
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 555
    .line 556
    if-eqz v1, :cond_2a

    .line 557
    .line 558
    iget-object v6, v0, Lqb/k;->o:Ljava/util/Map;

    .line 559
    .line 560
    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    check-cast v1, Lqb/i;

    .line 565
    .line 566
    if-eqz v1, :cond_2a

    .line 567
    .line 568
    goto :goto_17

    .line 569
    :cond_2a
    if-eqz v2, :cond_2b

    .line 570
    .line 571
    iget-object v1, v0, Lqb/k;->p:Ljava/util/Map;

    .line 572
    .line 573
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    check-cast v1, Lqb/i;

    .line 578
    .line 579
    if-eqz v1, :cond_2b

    .line 580
    .line 581
    goto :goto_17

    .line 582
    :cond_2b
    iget-object v1, v0, Lqb/k;->t:Lqb/i;

    .line 583
    .line 584
    :goto_17
    if-nez v1, :cond_2d

    .line 585
    .line 586
    if-nez v4, :cond_2c

    .line 587
    .line 588
    const-string v0, "\u6536\u85cf\u8bed\u97f3\u4e0d\u53ef\u7528"

    .line 589
    .line 590
    goto :goto_18

    .line 591
    :cond_2c
    const-string v0, "\u6536\u85cf\u8bed\u97f3\u6587\u4ef6\u4e0d\u5b58\u5728"

    .line 592
    .line 593
    :goto_18
    invoke-static {v2, v0}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {p1, v5}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    goto :goto_1a

    .line 600
    :cond_2d
    if-nez v2, :cond_2e

    .line 601
    .line 602
    invoke-virtual {p1, v5}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    goto :goto_1a

    .line 606
    :cond_2e
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 607
    .line 608
    .line 609
    move-result v3

    .line 610
    if-ne v3, v7, :cond_2f

    .line 611
    .line 612
    new-instance v3, Ljava/lang/Thread;

    .line 613
    .line 614
    new-instance v4, Lac/l;

    .line 615
    .line 616
    const/16 v6, 0x1d

    .line 617
    .line 618
    invoke-direct {v4, v0, v2, v1, v6}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 619
    .line 620
    .line 621
    const-string v0, "Hchat-VoiceSave"

    .line 622
    .line 623
    invoke-direct {v3, v4, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    .line 627
    .line 628
    .line 629
    goto :goto_19

    .line 630
    :cond_2f
    invoke-virtual {v0, v2, v1}, Lqb/k;->J(Landroid/app/Activity;Lqb/i;)V

    .line 631
    .line 632
    .line 633
    :goto_19
    invoke-virtual {p1, v5}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    :cond_30
    :goto_1a
    return-void

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
