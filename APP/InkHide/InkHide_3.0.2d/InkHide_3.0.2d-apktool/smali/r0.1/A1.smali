.class public final Lr0/A1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public a:Ljava/lang/ref/WeakReference;

.field public b:LA0/V;

.field public final c:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lr0/A1;->c:Landroid/os/Handler;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/Object;Landroid/widget/EditText;)V
    .locals 11

    .line 1
    invoke-static {}, Lz0/r;->t()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->clearFocus()V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lr0/A1;->b(Landroid/app/Activity;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_7

    .line 17
    .line 18
    :cond_0
    const-string v0, "b5i"

    .line 19
    .line 20
    invoke-static {v0}, LB0/b;->a(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x0

    .line 25
    if-gtz v1, :cond_2

    .line 26
    .line 27
    :cond_1
    :goto_0
    move v0, v2

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_4

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->performClick()Z

    .line 62
    .line 63
    .line 64
    const-string v1, "search command back button clicked"

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    filled-new-array {v1, v3, v0}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    new-instance v1, LE0/d;

    .line 86
    .line 87
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    move-object v0, v1

    .line 91
    :goto_1
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    instance-of v3, v0, LE0/d;

    .line 94
    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    move-object v0, v1

    .line 98
    :cond_5
    check-cast v0, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    :goto_2
    if-eqz v0, :cond_6

    .line 105
    .line 106
    goto/16 :goto_7

    .line 107
    .line 108
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v1, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    move-object v3, v0

    .line 118
    :goto_3
    if-eqz v3, :cond_8

    .line 119
    .line 120
    const-class v0, Ljava/lang/Object;

    .line 121
    .line 122
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    if-nez v0, :cond_8

    .line 127
    .line 128
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v4, "getDeclaredMethods(...)"

    .line 133
    .line 134
    invoke-static {v0, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v0}, LF0/h;->j0([Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    goto :goto_4

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    new-instance v4, LE0/d;

    .line 144
    .line 145
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 146
    .line 147
    .line 148
    move-object v0, v4

    .line 149
    :goto_4
    sget-object v4, LF0/s;->a:LF0/s;

    .line 150
    .line 151
    instance-of v5, v0, LE0/d;

    .line 152
    .line 153
    if-eqz v5, :cond_7

    .line 154
    .line 155
    move-object v0, v4

    .line 156
    :cond_7
    check-cast v0, Ljava/util/Collection;

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    goto :goto_3

    .line 166
    :cond_8
    const-string v9, "onCancel"

    .line 167
    .line 168
    const-string v10, "onBack"

    .line 169
    .line 170
    const-string v4, "cancelSearch"

    .line 171
    .line 172
    const-string v5, "clearSearch"

    .line 173
    .line 174
    const-string v6, "closeSearch"

    .line 175
    .line 176
    const-string v7, "hideSearch"

    .line 177
    .line 178
    const-string v8, "collapse"

    .line 179
    .line 180
    filled-new-array/range {v4 .. v10}, [Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    const/4 v4, 0x0

    .line 197
    const-string v5, "getParameterTypes(...)"

    .line 198
    .line 199
    const/4 v6, 0x1

    .line 200
    if-eqz v3, :cond_c

    .line 201
    .line 202
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v8

    .line 216
    if-eqz v8, :cond_b

    .line 217
    .line 218
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    move-object v9, v8

    .line 223
    check-cast v9, Ljava/lang/reflect/Method;

    .line 224
    .line 225
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    invoke-static {v10, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-eqz v10, :cond_a

    .line 234
    .line 235
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-result-object v9

    .line 239
    invoke-static {v9, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    array-length v9, v9

    .line 243
    if-nez v9, :cond_a

    .line 244
    .line 245
    move-object v4, v8

    .line 246
    :cond_b
    check-cast v4, Ljava/lang/reflect/Method;

    .line 247
    .line 248
    if-eqz v4, :cond_9

    .line 249
    .line 250
    invoke-static {p1, v4}, Lr0/A1;->c(Ljava/lang/Object;Ljava/lang/reflect/Method;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_9

    .line 255
    .line 256
    :goto_5
    move v2, v6

    .line 257
    goto/16 :goto_6

    .line 258
    .line 259
    :cond_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    if-eqz v1, :cond_f

    .line 268
    .line 269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    move-object v3, v1

    .line 274
    check-cast v3, Ljava/lang/reflect/Method;

    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    invoke-static {v7, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    array-length v7, v7

    .line 284
    if-nez v7, :cond_d

    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 291
    .line 292
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    if-eqz v7, :cond_d

    .line 297
    .line 298
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    const-string v8, "getName(...)"

    .line 303
    .line 304
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    const-string v9, "cancel"

    .line 308
    .line 309
    invoke-static {v7, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    if-nez v7, :cond_e

    .line 314
    .line 315
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v7

    .line 319
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    const-string v9, "close"

    .line 323
    .line 324
    invoke-static {v7, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 325
    .line 326
    .line 327
    move-result v7

    .line 328
    if-nez v7, :cond_e

    .line 329
    .line 330
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    invoke-static {v7, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    const-string v9, "hide"

    .line 338
    .line 339
    invoke-static {v7, v9, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 340
    .line 341
    .line 342
    move-result v7

    .line 343
    if-nez v7, :cond_e

    .line 344
    .line 345
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-static {v3, v8}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    const-string v7, "back"

    .line 353
    .line 354
    invoke-static {v3, v7, v6}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    if-eqz v3, :cond_d

    .line 359
    .line 360
    :cond_e
    move-object v4, v1

    .line 361
    :cond_f
    check-cast v4, Ljava/lang/reflect/Method;

    .line 362
    .line 363
    if-eqz v4, :cond_10

    .line 364
    .line 365
    invoke-static {p1, v4}, Lr0/A1;->c(Ljava/lang/Object;Ljava/lang/reflect/Method;)Z

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    if-eqz v0, :cond_10

    .line 370
    .line 371
    goto :goto_5

    .line 372
    :cond_10
    :goto_6
    if-eqz v2, :cond_11

    .line 373
    .line 374
    goto :goto_7

    .line 375
    :cond_11
    instance-of v0, p1, Landroid/view/View;

    .line 376
    .line 377
    if-eqz v0, :cond_12

    .line 378
    .line 379
    check-cast p1, Landroid/view/View;

    .line 380
    .line 381
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    if-eqz p1, :cond_12

    .line 386
    .line 387
    goto :goto_7

    .line 388
    :cond_12
    invoke-static {p0}, Lr0/A1;->b(Landroid/app/Activity;)Z

    .line 389
    .line 390
    .line 391
    move-result p0

    .line 392
    if-eqz p0, :cond_13

    .line 393
    .line 394
    :goto_7
    return-void

    .line 395
    :cond_13
    invoke-virtual {p2}, Landroid/view/View;->clearFocus()V

    .line 396
    .line 397
    .line 398
    return-void
.end method

.method public static b(Landroid/app/Activity;)Z
    .locals 2

    .line 1
    :try_start_0
    instance-of v0, p0, Landroidx/activity/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroidx/activity/g;

    .line 7
    .line 8
    iget-object v0, v0, Landroidx/activity/g;->i:Landroidx/activity/i;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/activity/i;->b()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->onBackPressed()V

    .line 15
    .line 16
    .line 17
    :goto_0
    const-string v0, "search command activity back dispatched"

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    new-instance v0, LE0/d;

    .line 39
    .line 40
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    move-object p0, v0

    .line 44
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 45
    .line 46
    instance-of v1, p0, LE0/d;

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    move-object p0, v0

    .line 51
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0
.end method

.method public static c(Ljava/lang/Object;Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    const-string v0, "search command close search invoked"

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {v0, p0, p1}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    new-instance p1, LE0/d;

    .line 35
    .line 36
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, p1

    .line 40
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    instance-of v0, p0, LE0/d;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    move-object p0, p1

    .line 47
    :cond_0
    check-cast p0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/reflect/Field;)Landroid/widget/EditText;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of p1, p0, Landroid/widget/EditText;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroid/widget/EditText;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p0, v1

    .line 20
    goto :goto_1

    .line 21
    :goto_0
    new-instance p1, LE0/d;

    .line 22
    .line 23
    invoke-direct {p1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object p0, p1

    .line 27
    :goto_1
    nop

    .line 28
    instance-of p1, p0, LE0/d;

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_1
    move-object v1, p0

    .line 34
    :goto_2
    check-cast v1, Landroid/widget/EditText;

    .line 35
    .line 36
    return-object v1
.end method


# virtual methods
.method public final d(Landroid/app/Activity;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lr0/A1;->a:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Landroid/app/Activity;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v0, v1

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move-object p1, v1

    .line 45
    :goto_1
    if-nez p1, :cond_3

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move-object v0, p1

    .line 49
    :goto_2
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_4

    .line 60
    .line 61
    new-instance v1, Lr0/y1;

    .line 62
    .line 63
    invoke-direct {v1, v0, p2}, Lr0/y1;-><init>(Landroid/app/Activity;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 67
    .line 68
    .line 69
    :cond_4
    :goto_3
    return-void
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 9

    .line 1
    new-instance p2, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    :cond_0
    invoke-direct {p2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    instance-of v0, p2, Landroid/app/Application;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p2, Landroid/app/Application;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object p2, v1

    .line 26
    :goto_0
    if-nez p2, :cond_2

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_2
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 30
    .line 31
    const-string v2, "search-command-activity-lifecycle"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    new-instance v0, Lr0/j;

    .line 41
    .line 42
    const/4 v2, 0x5

    .line 43
    invoke-direct {v0, p0, v2}, Lr0/j;-><init>(Le0/a;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-static {p1}, LA0/l;->l(Landroid/content/Context;)LA0/V;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, Lr0/A1;->b:LA0/V;

    .line 54
    .line 55
    sget-object p2, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 56
    .line 57
    new-instance v2, LA0/u;

    .line 58
    .line 59
    new-instance v5, Lr0/n1;

    .line 60
    .line 61
    const/4 p2, 0x7

    .line 62
    invoke-direct {v5, p2}, Lr0/n1;-><init>(I)V

    .line 63
    .line 64
    .line 65
    new-instance v6, LA0/h;

    .line 66
    .line 67
    const/16 p2, 0x13

    .line 68
    .line 69
    invoke-direct {v6, p1, p2}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 70
    .line 71
    .line 72
    new-instance v7, Lr0/n1;

    .line 73
    .line 74
    const/16 p2, 0x8

    .line 75
    .line 76
    invoke-direct {v7, p2}, Lr0/n1;-><init>(I)V

    .line 77
    .line 78
    .line 79
    new-instance v8, LA0/a;

    .line 80
    .line 81
    const/16 p2, 0x10

    .line 82
    .line 83
    invoke-direct {v8, p2}, LA0/a;-><init>(I)V

    .line 84
    .line 85
    .line 86
    const-string v3, "search-command"

    .line 87
    .line 88
    const-string v4, "\u641c\u7d22\u6846\u547d\u4ee4\u76d1\u542c"

    .line 89
    .line 90
    invoke-direct/range {v2 .. v8}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p1, v2}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 94
    .line 95
    .line 96
    iget-object p2, p0, Lr0/A1;->b:LA0/V;

    .line 97
    .line 98
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 101
    .line 102
    .line 103
    if-eqz p2, :cond_4

    .line 104
    .line 105
    iget-object p2, p2, LA0/V;->a:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_4

    .line 116
    .line 117
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/lang/String;

    .line 122
    .line 123
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_4
    const-string p2, "com.tencent.mm.ui.tools.ActionBarSearchView"

    .line 128
    .line 129
    invoke-interface {v0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    :cond_5
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_9

    .line 141
    .line 142
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    move-object v2, v0

    .line 147
    check-cast v2, Ljava/lang/String;

    .line 148
    .line 149
    const-string v0, "search-command-ctor:"

    .line 150
    .line 151
    invoke-static {v0, v2}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 156
    .line 157
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_6

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const/4 v4, 0x0

    .line 169
    invoke-static {v2, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    goto :goto_4

    .line 174
    :catchall_0
    move-exception v0

    .line 175
    new-instance v4, LE0/d;

    .line 176
    .line 177
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    move-object v0, v4

    .line 181
    :goto_4
    nop

    .line 182
    instance-of v4, v0, LE0/d;

    .line 183
    .line 184
    if-eqz v4, :cond_7

    .line 185
    .line 186
    move-object v0, v1

    .line 187
    :cond_7
    check-cast v0, Ljava/lang/Class;

    .line 188
    .line 189
    if-nez v0, :cond_8

    .line 190
    .line 191
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 192
    .line 193
    invoke-virtual {v0, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_8
    :try_start_1
    new-instance v4, LC0/d;

    .line 198
    .line 199
    const/4 v5, 0x3

    .line 200
    invoke-direct {v4, v5, p0}, LC0/d;-><init>(ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v0, v4}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 204
    .line 205
    .line 206
    const-string v0, "search command hook installed"

    .line 207
    .line 208
    filled-new-array {v0, v2}, [Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :catchall_1
    move-exception v0

    .line 219
    new-instance v4, LE0/d;

    .line 220
    .line 221
    invoke-direct {v4, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    move-object v0, v4

    .line 225
    :goto_5
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    if-eqz v0, :cond_5

    .line 230
    .line 231
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 232
    .line 233
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    const-string v3, "search command hook install fail"

    .line 237
    .line 238
    filled-new-array {v3, v2, v0}, [Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_9
    return-void
.end method
