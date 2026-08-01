.class public final Lr0/C1;
.super Lc0/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/D1;


# direct methods
.method public synthetic constructor <init>(Lr0/D1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/C1;->a:I

    iput-object p1, p0, Lr0/C1;->b:Lr0/D1;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    .line 1
    iget v0, p0, Lr0/C1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    return-void

    .line 7
    :pswitch_1
    const-string v0, "param"

    .line 8
    .line 9
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v1, v0, Landroid/view/View;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroid/view/View;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v1, p0, Lr0/C1;->b:Lr0/D1;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Lr0/D1;->x(Landroid/view/View;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    iget-object v2, v1, Lr0/D1;->d:Ljava/util/Set;

    .line 35
    .line 36
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 40
    .line 41
    const-string v2, "args"

    .line 42
    .line 43
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static {v2, p1}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    invoke-static {v0}, Lr0/D1;->q(Landroid/view/View;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    :cond_3
    if-eqz p1, :cond_5

    .line 58
    .line 59
    iget-object v2, v1, Lr0/D1;->g:Ljava/util/WeakHashMap;

    .line 60
    .line 61
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lr0/D1;->K()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_4

    .line 69
    .line 70
    invoke-static {v0}, Lr0/D1;->r(Landroid/view/View;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    const-string v3, "m97"

    .line 75
    .line 76
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    iget-object v2, v1, Lr0/D1;->f:Ljava/util/Set;

    .line 83
    .line 84
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {v1, p1}, Lr0/D1;->D(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_5
    invoke-virtual {v1, v0}, Lr0/D1;->J(Landroid/view/View;)V

    .line 91
    .line 92
    .line 93
    :goto_1
    return-void

    .line 94
    :pswitch_2
    const-string v0, "param"

    .line 95
    .line 96
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 100
    .line 101
    const-string v1, "args"

    .line 102
    .line 103
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-static {v2, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    goto/16 :goto_9

    .line 114
    .line 115
    :cond_6
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 116
    .line 117
    invoke-static {v2, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 v1, 0x1

    .line 121
    invoke-static {v1, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    instance-of v3, v2, Ljava/lang/Number;

    .line 126
    .line 127
    const/4 v4, 0x0

    .line 128
    if-eqz v3, :cond_7

    .line 129
    .line 130
    check-cast v2, Ljava/lang/Number;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    move-object v2, v4

    .line 134
    :goto_2
    if-eqz v2, :cond_15

    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    iget-object v3, p0, Lr0/C1;->b:Lr0/D1;

    .line 141
    .line 142
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v5}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 158
    .line 159
    .line 160
    move-result v6

    .line 161
    if-eqz v6, :cond_b

    .line 162
    .line 163
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    check-cast v6, Ljava/lang/reflect/Field;

    .line 168
    .line 169
    :try_start_0
    invoke-virtual {v6, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    instance-of v7, v6, Landroid/view/View;

    .line 177
    .line 178
    if-eqz v7, :cond_9

    .line 179
    .line 180
    check-cast v6, Landroid/view/View;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :catchall_0
    move-exception v6

    .line 184
    goto :goto_3

    .line 185
    :cond_9
    move-object v6, v4

    .line 186
    goto :goto_4

    .line 187
    :goto_3
    new-instance v7, LE0/d;

    .line 188
    .line 189
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    move-object v6, v7

    .line 193
    :goto_4
    nop

    .line 194
    instance-of v7, v6, LE0/d;

    .line 195
    .line 196
    if-eqz v7, :cond_a

    .line 197
    .line 198
    move-object v6, v4

    .line 199
    :cond_a
    check-cast v6, Landroid/view/View;

    .line 200
    .line 201
    if-eqz v6, :cond_8

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_b
    move-object v6, v4

    .line 205
    :goto_5
    if-nez v6, :cond_c

    .line 206
    .line 207
    goto :goto_9

    .line 208
    :cond_c
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    instance-of v5, v1, Landroid/view/View;

    .line 213
    .line 214
    if-eqz v5, :cond_d

    .line 215
    .line 216
    check-cast v1, Landroid/view/View;

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_d
    move-object v1, v4

    .line 220
    :goto_6
    if-eqz v1, :cond_f

    .line 221
    .line 222
    invoke-static {v1}, Lr0/D1;->u(Landroid/view/View;)Z

    .line 223
    .line 224
    .line 225
    move-result v5

    .line 226
    if-eqz v5, :cond_e

    .line 227
    .line 228
    move-object v4, v1

    .line 229
    goto :goto_7

    .line 230
    :cond_e
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    instance-of v5, v1, Landroid/view/View;

    .line 235
    .line 236
    if-eqz v5, :cond_d

    .line 237
    .line 238
    check-cast v1, Landroid/view/View;

    .line 239
    .line 240
    goto :goto_6

    .line 241
    :cond_f
    :goto_7
    invoke-virtual {v3, v4}, Lr0/D1;->x(Landroid/view/View;)Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-nez v1, :cond_10

    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_10
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 249
    .line 250
    if-nez p1, :cond_11

    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_11
    invoke-static {v0}, Lr0/D1;->F(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-nez v0, :cond_12

    .line 258
    .line 259
    invoke-static {v2, p1}, Lr0/D1;->E(ILjava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :cond_12
    invoke-static {}, Lr0/D1;->K()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_14

    .line 268
    .line 269
    iget-object v1, v3, Lr0/D1;->f:Ljava/util/Set;

    .line 270
    .line 271
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-eqz p1, :cond_14

    .line 276
    .line 277
    if-nez v0, :cond_13

    .line 278
    .line 279
    goto :goto_8

    .line 280
    :cond_13
    iget-object p1, v3, Lr0/D1;->n:Ljava/util/Set;

    .line 281
    .line 282
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    :cond_14
    :goto_8
    invoke-virtual {v3, v6, v0}, Lr0/D1;->H(Landroid/view/View;Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_15
    :goto_9
    return-void

    .line 289
    :pswitch_3
    const-string v0, "param"

    .line 290
    .line 291
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 295
    .line 296
    if-nez p1, :cond_16

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_16
    iget-object v0, p0, Lr0/C1;->b:Lr0/D1;

    .line 300
    .line 301
    iget-boolean v1, v0, Lr0/D1;->i:Z

    .line 302
    .line 303
    if-nez v1, :cond_17

    .line 304
    .line 305
    iget-object v1, v0, Lr0/D1;->e:Ljava/util/Set;

    .line 306
    .line 307
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v1

    .line 311
    if-eqz v1, :cond_17

    .line 312
    .line 313
    iget-object v1, v0, Lr0/D1;->g:Ljava/util/WeakHashMap;

    .line 314
    .line 315
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    check-cast p1, Landroid/view/View;

    .line 320
    .line 321
    if-eqz p1, :cond_17

    .line 322
    .line 323
    new-instance v1, LA0/m;

    .line 324
    .line 325
    const/16 v2, 0xa

    .line 326
    .line 327
    invoke-direct {v1, v0, p1, v2}, LA0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 331
    .line 332
    .line 333
    :cond_17
    :goto_a
    return-void

    .line 334
    :pswitch_4
    const-string v0, "param"

    .line 335
    .line 336
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 340
    .line 341
    instance-of v0, p1, Landroid/app/Activity;

    .line 342
    .line 343
    if-eqz v0, :cond_18

    .line 344
    .line 345
    check-cast p1, Landroid/app/Activity;

    .line 346
    .line 347
    goto :goto_b

    .line 348
    :cond_18
    const/4 p1, 0x0

    .line 349
    :goto_b
    if-nez p1, :cond_19

    .line 350
    .line 351
    goto :goto_c

    .line 352
    :cond_19
    iget-object v0, p0, Lr0/C1;->b:Lr0/D1;

    .line 353
    .line 354
    invoke-virtual {v0, p1}, Lr0/D1;->z(Landroid/app/Activity;)Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-nez v1, :cond_1a

    .line 359
    .line 360
    goto :goto_c

    .line 361
    :cond_1a
    invoke-static {v0, p1}, Lr0/D1;->a(Lr0/D1;Landroid/app/Activity;)V

    .line 362
    .line 363
    .line 364
    :goto_c
    return-void

    .line 365
    :pswitch_5
    const-string v0, "param"

    .line 366
    .line 367
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 371
    .line 372
    const-string v1, "args"

    .line 373
    .line 374
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    const/4 v1, 0x0

    .line 378
    invoke-static {v1, v0}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 383
    .line 384
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v0

    .line 388
    if-nez v0, :cond_1b

    .line 389
    .line 390
    goto :goto_e

    .line 391
    :cond_1b
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 392
    .line 393
    instance-of v0, p1, Landroid/app/Activity;

    .line 394
    .line 395
    if-eqz v0, :cond_1c

    .line 396
    .line 397
    check-cast p1, Landroid/app/Activity;

    .line 398
    .line 399
    goto :goto_d

    .line 400
    :cond_1c
    const/4 p1, 0x0

    .line 401
    :goto_d
    if-nez p1, :cond_1d

    .line 402
    .line 403
    goto :goto_e

    .line 404
    :cond_1d
    iget-object v0, p0, Lr0/C1;->b:Lr0/D1;

    .line 405
    .line 406
    invoke-virtual {v0, p1}, Lr0/D1;->z(Landroid/app/Activity;)Z

    .line 407
    .line 408
    .line 409
    move-result v1

    .line 410
    if-nez v1, :cond_1e

    .line 411
    .line 412
    goto :goto_e

    .line 413
    :cond_1e
    invoke-static {v0, p1}, Lr0/D1;->a(Lr0/D1;Landroid/app/Activity;)V

    .line 414
    .line 415
    .line 416
    :goto_e
    return-void

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr0/C1;->b:Lr0/D1;

    .line 3
    .line 4
    const-string v2, "param"

    .line 5
    .line 6
    iget v3, p0, Lr0/C1;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 16
    .line 17
    instance-of v2, p1, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move-object v0, p1

    .line 22
    check-cast v0, Landroid/view/View;

    .line 23
    .line 24
    :cond_0
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {v1, v0}, Lr0/D1;->x(Landroid/view/View;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    iget-object p1, v1, Lr0/D1;->h:Ljava/util/WeakHashMap;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Ljava/lang/Long;

    .line 45
    .line 46
    if-eqz v4, :cond_3

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const-wide/16 v4, 0x0

    .line 54
    .line 55
    :goto_0
    sub-long v4, v2, v4

    .line 56
    .line 57
    const-wide/16 v6, 0x78

    .line 58
    .line 59
    cmp-long v4, v4, v6

    .line 60
    .line 61
    if-gez v4, :cond_4

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    iget-object p1, v1, Lr0/D1;->d:Ljava/util/Set;

    .line 72
    .line 73
    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Lr0/D1;->q(Landroid/view/View;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_6

    .line 81
    .line 82
    iget-object v2, v1, Lr0/D1;->g:Ljava/util/WeakHashMap;

    .line 83
    .line 84
    invoke-virtual {v2, p1, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lr0/D1;->K()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_5

    .line 92
    .line 93
    invoke-static {v0}, Lr0/D1;->r(Landroid/view/View;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const-string v3, "m97"

    .line 98
    .line 99
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_5

    .line 104
    .line 105
    iget-object v2, v1, Lr0/D1;->f:Ljava/util/Set;

    .line 106
    .line 107
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :cond_5
    invoke-virtual {v1, p1}, Lr0/D1;->D(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    invoke-virtual {v1, v0}, Lr0/D1;->J(Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    return-void

    .line 117
    :pswitch_1
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 121
    .line 122
    const-string v3, "args"

    .line 123
    .line 124
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 v3, 0x1

    .line 128
    invoke-static {v3, v2}, LF0/h;->f0(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    instance-of v4, v2, Ljava/lang/Number;

    .line 133
    .line 134
    if-eqz v4, :cond_7

    .line 135
    .line 136
    check-cast v2, Ljava/lang/Number;

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_7
    move-object v2, v0

    .line 140
    :goto_2
    if-eqz v2, :cond_1d

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 147
    .line 148
    if-nez p1, :cond_8

    .line 149
    .line 150
    goto/16 :goto_b

    .line 151
    .line 152
    :cond_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-static {v2, p1}, Lr0/D1;->E(ILjava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-nez p1, :cond_9

    .line 160
    .line 161
    goto/16 :goto_b

    .line 162
    .line 163
    :cond_9
    sget-boolean v2, Lz0/i;->a:Z

    .line 164
    .line 165
    invoke-static {}, Lz0/g;->E()Z

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    if-nez v2, :cond_a

    .line 170
    .line 171
    goto/16 :goto_b

    .line 172
    .line 173
    :cond_a
    invoke-static {}, Lr0/D1;->d()Ljava/util/Set;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v4, :cond_b

    .line 182
    .line 183
    goto/16 :goto_b

    .line 184
    .line 185
    :cond_b
    const/4 v4, 0x0

    .line 186
    invoke-virtual {v1, v4, p1}, Lr0/D1;->e(ILjava/lang/Object;)Ljava/util/Set;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    new-instance v6, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    :cond_c
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-eqz v8, :cond_d

    .line 204
    .line 205
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    move-object v9, v8

    .line 210
    check-cast v9, Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-eqz v9, :cond_c

    .line 217
    .line 218
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_3

    .line 222
    :cond_d
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v6

    .line 226
    if-eqz v6, :cond_e

    .line 227
    .line 228
    goto/16 :goto_b

    .line 229
    .line 230
    :cond_e
    invoke-static {v5, v2}, LF0/w;->Y(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-interface {v5}, Ljava/util/Set;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v5

    .line 238
    if-eqz v5, :cond_1d

    .line 239
    .line 240
    invoke-virtual {v1, p1}, Lr0/D1;->w(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-nez v1, :cond_f

    .line 245
    .line 246
    goto/16 :goto_b

    .line 247
    .line 248
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-static {v1}, Lr0/D1;->b(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    :catchall_0
    :cond_10
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-eqz v5, :cond_1d

    .line 265
    .line 266
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    check-cast v5, Ljava/lang/reflect/Field;

    .line 271
    .line 272
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 273
    .line 274
    .line 275
    move-result v6

    .line 276
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    if-eqz v6, :cond_11

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_11
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 288
    .line 289
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    if-nez v6, :cond_1a

    .line 294
    .line 295
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    if-eqz v6, :cond_12

    .line 304
    .line 305
    goto/16 :goto_8

    .line 306
    .line 307
    :cond_12
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    const-class v7, Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-nez v6, :cond_13

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_13
    :try_start_0
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    instance-of v7, v6, Ljava/lang/String;

    .line 328
    .line 329
    if-eqz v7, :cond_14

    .line 330
    .line 331
    check-cast v6, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 332
    .line 333
    goto :goto_6

    .line 334
    :catchall_1
    move-exception v6

    .line 335
    goto :goto_5

    .line 336
    :cond_14
    move-object v6, v0

    .line 337
    goto :goto_6

    .line 338
    :goto_5
    new-instance v7, LE0/d;

    .line 339
    .line 340
    invoke-direct {v7, v6}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 341
    .line 342
    .line 343
    move-object v6, v7

    .line 344
    :goto_6
    nop

    .line 345
    instance-of v7, v6, LE0/d;

    .line 346
    .line 347
    if-eqz v7, :cond_15

    .line 348
    .line 349
    move-object v6, v0

    .line 350
    :cond_15
    check-cast v6, Ljava/lang/String;

    .line 351
    .line 352
    if-nez v6, :cond_16

    .line 353
    .line 354
    goto :goto_4

    .line 355
    :cond_16
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    if-eqz v7, :cond_17

    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_17
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 363
    .line 364
    .line 365
    move-result-object v7

    .line 366
    :cond_18
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 367
    .line 368
    .line 369
    move-result v8

    .line 370
    if-eqz v8, :cond_10

    .line 371
    .line 372
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v8

    .line 376
    check-cast v8, Ljava/lang/String;

    .line 377
    .line 378
    invoke-static {v6, v8, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    if-eqz v8, :cond_18

    .line 383
    .line 384
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    move-object v8, v6

    .line 389
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v9

    .line 393
    const-string v10, ","

    .line 394
    .line 395
    if-eqz v9, :cond_19

    .line 396
    .line 397
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v9

    .line 401
    check-cast v9, Ljava/lang/String;

    .line 402
    .line 403
    new-instance v11, Ljava/lang/StringBuilder;

    .line 404
    .line 405
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v11

    .line 418
    const-string v12, ""

    .line 419
    .line 420
    invoke-static {v8, v11, v12}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    new-instance v11, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v10

    .line 436
    invoke-static {v8, v10, v12}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v8

    .line 440
    invoke-static {v8, v9, v12}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v8

    .line 444
    goto :goto_7

    .line 445
    :cond_19
    const-string v7, ",,"

    .line 446
    .line 447
    invoke-static {v8, v7, v10}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v7

    .line 451
    invoke-virtual {v7, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v6

    .line 455
    if-nez v6, :cond_10

    .line 456
    .line 457
    :try_start_1
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v5, p1, v7}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    goto/16 :goto_4

    .line 464
    .line 465
    :cond_1a
    :goto_8
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    instance-of v7, v6, Ljava/lang/Number;

    .line 473
    .line 474
    if-eqz v7, :cond_1b

    .line 475
    .line 476
    check-cast v6, Ljava/lang/Number;

    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_1b
    move-object v6, v0

    .line 480
    :goto_9
    if-eqz v6, :cond_1c

    .line 481
    .line 482
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 483
    .line 484
    .line 485
    move-result v6

    .line 486
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    goto :goto_a

    .line 491
    :cond_1c
    move-object v6, v0

    .line 492
    :goto_a
    if-eqz v6, :cond_10

    .line 493
    .line 494
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    if-eqz v6, :cond_10

    .line 499
    .line 500
    invoke-virtual {v5, p1, v4}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 501
    .line 502
    .line 503
    goto/16 :goto_4

    .line 504
    .line 505
    :cond_1d
    :goto_b
    return-void

    .line 506
    :pswitch_2
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-boolean v0, v1, Lr0/D1;->i:Z

    .line 510
    .line 511
    if-nez v0, :cond_1e

    .line 512
    .line 513
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 514
    .line 515
    iget-object v2, v1, Lr0/D1;->e:Ljava/util/Set;

    .line 516
    .line 517
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v0

    .line 521
    if-eqz v0, :cond_1e

    .line 522
    .line 523
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 524
    .line 525
    const-string v0, "thisObject"

    .line 526
    .line 527
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, p1}, Lr0/D1;->i(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    :cond_1e
    return-void

    .line 534
    :pswitch_3
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 538
    .line 539
    instance-of v2, p1, Landroid/app/Activity;

    .line 540
    .line 541
    if-eqz v2, :cond_1f

    .line 542
    .line 543
    check-cast p1, Landroid/app/Activity;

    .line 544
    .line 545
    goto :goto_c

    .line 546
    :cond_1f
    move-object p1, v0

    .line 547
    :goto_c
    if-nez p1, :cond_20

    .line 548
    .line 549
    goto :goto_d

    .line 550
    :cond_20
    invoke-virtual {v1, p1}, Lr0/D1;->z(Landroid/app/Activity;)Z

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    if-nez v2, :cond_21

    .line 555
    .line 556
    goto :goto_d

    .line 557
    :cond_21
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 558
    .line 559
    .line 560
    move-result-object p1

    .line 561
    if-eqz p1, :cond_22

    .line 562
    .line 563
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    :cond_22
    invoke-virtual {v1, v0}, Lr0/D1;->I(Landroid/view/View;)V

    .line 568
    .line 569
    .line 570
    :goto_d
    return-void

    .line 571
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
