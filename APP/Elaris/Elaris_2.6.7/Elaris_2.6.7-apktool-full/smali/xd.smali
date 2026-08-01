.class public abstract Lxd;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field public static final d:Ljava/util/Map;

.field public static final e:Ljava/util/Set;

.field public static final f:Ljava/lang/Object;

.field public static g:J

.field public static h:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v5, "com.tencent.mobileqq.activity.miniaio.h"

    .line 2
    .line 3
    const-string v6, "com.tencent.mobileqq.activity.miniaio.i"

    .line 4
    .line 5
    const-string v0, "com.tencent.mobileqq.activity.miniaio.c"

    .line 6
    .line 7
    const-string v1, "com.tencent.mobileqq.activity.miniaio.d"

    .line 8
    .line 9
    const-string v2, "com.tencent.mobileqq.activity.miniaio.e"

    .line 10
    .line 11
    const-string v3, "com.tencent.mobileqq.activity.miniaio.f"

    .line 12
    .line 13
    const-string v4, "com.tencent.mobileqq.activity.miniaio.g"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lxd;->a:[Ljava/lang/String;

    .line 20
    .line 21
    const-string v0, "com.tencent.mobileqq.utils.CustomWidgetUtil"

    .line 22
    .line 23
    const-string v1, "com.tencent.widget.CustomWidgetUtil"

    .line 24
    .line 25
    const-string v2, "com.tencent.qqmini.sdk.core.utils.CustomWidgetUtil"

    .line 26
    .line 27
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lxd;->b:[Ljava/lang/String;

    .line 32
    .line 33
    const-string v6, "com.tencent.mobileqq.activity.recent.cur.DragFrameLayout$RecentRollingTextView"

    .line 34
    .line 35
    const-string v7, "com.tencent.widget.RollingTextView"

    .line 36
    .line 37
    const-string v1, "com.tencent.qqnt.chats.view.RollingTextView"

    .line 38
    .line 39
    const-string v2, "com.tencent.qqnt.chats.view.RecentRollingTextView"

    .line 40
    .line 41
    const-string v3, "com.tencent.mobileqq.widget.RollingTextView"

    .line 42
    .line 43
    const-string v4, "com.tencent.mobileqq.activity.recent.RecentRollingTextView"

    .line 44
    .line 45
    const-string v5, "com.tencent.mobileqq.activity.home.impl.widget.RecentRollingTextView"

    .line 46
    .line 47
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lxd;->c:[Ljava/lang/String;

    .line 52
    .line 53
    new-instance v0, Ljava/util/WeakHashMap;

    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lxd;->d:Ljava/util/Map;

    .line 63
    .line 64
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lxd;->e:Ljava/util/Set;

    .line 74
    .line 75
    new-instance v0, Ljava/lang/Object;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    sput-object v0, Lxd;->f:Ljava/lang/Object;

    .line 81
    .line 82
    const-wide/16 v0, 0x0

    .line 83
    .line 84
    sput-wide v0, Lxd;->g:J

    .line 85
    .line 86
    const/4 v0, 0x0

    .line 87
    sput v0, Lxd;->h:I

    .line 88
    .line 89
    return-void
.end method

.method public static a(ILjava/lang/Object;)V
    .locals 12

    .line 1
    if-eqz p1, :cond_13

    .line 2
    .line 3
    if-gtz p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_c

    .line 6
    .line 7
    :cond_0
    const-string v0, "debug_log"

    .line 8
    .line 9
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    const-string v0, "eq_unread_full_count"

    .line 18
    .line 19
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eq v0, v3, :cond_3

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    sget-object v0, Lxd;->f:Ljava/lang/Object;

    .line 40
    .line 41
    monitor-enter v0

    .line 42
    :try_start_0
    sget-wide v5, Lxd;->g:J

    .line 43
    .line 44
    const-wide/16 v7, 0x0

    .line 45
    .line 46
    cmp-long v7, v5, v7

    .line 47
    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    sub-long v5, v3, v5

    .line 51
    .line 52
    const-wide/32 v7, 0x493e0

    .line 53
    .line 54
    .line 55
    cmp-long v5, v5, v7

    .line 56
    .line 57
    if-gez v5, :cond_2

    .line 58
    .line 59
    sget v3, Lxd;->h:I

    .line 60
    .line 61
    const/4 v4, 0x3

    .line 62
    if-lt v3, v4, :cond_1

    .line 63
    .line 64
    monitor-exit v0

    .line 65
    goto :goto_2

    .line 66
    :catchall_0
    move-exception p0

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    add-int/2addr v3, v1

    .line 69
    sput v3, Lxd;->h:I

    .line 70
    .line 71
    monitor-exit v0

    .line 72
    goto :goto_0

    .line 73
    :cond_2
    sput-wide v3, Lxd;->g:J

    .line 74
    .line 75
    sput v1, Lxd;->h:I

    .line 76
    .line 77
    monitor-exit v0

    .line 78
    :goto_0
    move v0, v1

    .line 79
    goto :goto_3

    .line 80
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    throw p0

    .line 82
    :cond_3
    :goto_2
    move v0, v2

    .line 83
    :goto_3
    const/16 v3, 0x78

    .line 84
    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    instance-of v4, p1, Landroid/view/View;

    .line 88
    .line 89
    if-eqz v4, :cond_4

    .line 90
    .line 91
    move-object v4, p1

    .line 92
    check-cast v4, Landroid/view/View;

    .line 93
    .line 94
    new-instance v5, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 97
    .line 98
    .line 99
    filled-new-array {v2}, [I

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-static {v4, v5, v2, v6}, Lv4;->d(Landroid/view/View;Ljava/lang/StringBuilder;I[I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    goto :goto_4

    .line 111
    :cond_4
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {p1, v2, v4}, Li5;->V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    goto :goto_4

    .line 120
    :cond_5
    const-string v4, ""

    .line 121
    .line 122
    :goto_4
    if-lez p0, :cond_7

    .line 123
    .line 124
    instance-of v5, p1, Landroid/view/View;

    .line 125
    .line 126
    if-nez v5, :cond_6

    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_6
    sget-object v5, Lxd;->d:Ljava/util/Map;

    .line 130
    .line 131
    move-object v6, p1

    .line 132
    check-cast v6, Landroid/view/View;

    .line 133
    .line 134
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    :cond_7
    :goto_5
    const-string v5, "mNum"

    .line 142
    .line 143
    const-string v6, "j"

    .line 144
    .line 145
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    sget-object v6, Lw4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 150
    .line 151
    move v6, v2

    .line 152
    :goto_6
    const/4 v7, 0x2

    .line 153
    if-ge v6, v7, :cond_9

    .line 154
    .line 155
    aget-object v7, v5, v6

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    invoke-static {v8, v7}, Lw4;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    if-eqz v7, :cond_8

    .line 166
    .line 167
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 172
    .line 173
    if-ne v8, v9, :cond_8

    .line 174
    .line 175
    :try_start_1
    invoke-virtual {v7, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v7, p1, p0}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 179
    .line 180
    .line 181
    :catchall_1
    :cond_8
    add-int/lit8 v6, v6, 0x1

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_9
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    const-string v6, "mText"

    .line 189
    .line 190
    const-string v8, "n"

    .line 191
    .line 192
    filled-new-array {v6, v8}, [Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    sget-object v8, Lw4;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 197
    .line 198
    if-eqz v5, :cond_b

    .line 199
    .line 200
    move v8, v2

    .line 201
    :goto_7
    if-ge v8, v7, :cond_b

    .line 202
    .line 203
    aget-object v9, v6, v8

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    invoke-static {v10, v9}, Lw4;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    if-eqz v9, :cond_a

    .line 214
    .line 215
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    const-class v11, Ljava/lang/String;

    .line 220
    .line 221
    if-ne v10, v11, :cond_a

    .line 222
    .line 223
    :try_start_2
    invoke-virtual {v9, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v9, p1, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 227
    .line 228
    .line 229
    :catchall_2
    :cond_a
    add-int/lit8 v8, v8, 0x1

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_b
    instance-of v1, p1, Landroid/view/View;

    .line 233
    .line 234
    if-eqz v1, :cond_c

    .line 235
    .line 236
    move-object v5, p1

    .line 237
    check-cast v5, Landroid/view/View;

    .line 238
    .line 239
    const/4 v6, 0x4

    .line 240
    invoke-static {v5, p0, v6}, Lv4;->F(Landroid/view/View;II)V

    .line 241
    .line 242
    .line 243
    :try_start_3
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 244
    .line 245
    .line 246
    :catchall_3
    :cond_c
    if-eqz v0, :cond_13

    .line 247
    .line 248
    const-string v0, "QUIBadge/updateNum"

    .line 249
    .line 250
    if-eqz v1, :cond_d

    .line 251
    .line 252
    move-object v1, p1

    .line 253
    check-cast v1, Landroid/view/View;

    .line 254
    .line 255
    new-instance v5, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 258
    .line 259
    .line 260
    filled-new-array {v2}, [I

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-static {v1, v5, v2, v3}, Lv4;->d(Landroid/view/View;Ljava/lang/StringBuilder;I[I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    goto :goto_8

    .line 272
    :cond_d
    invoke-static {}, Li5;->i1()Ljava/util/Set;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    invoke-static {p1, v2, v1}, Li5;->V(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    :goto_8
    const-string v2, "QUIBadge count argument"

    .line 281
    .line 282
    const-string v3, "none"

    .line 283
    .line 284
    :try_start_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    const/16 v6, 0x320

    .line 287
    .line 288
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 289
    .line 290
    .line 291
    const-string v6, "unread-full"

    .line 292
    .line 293
    invoke-static {v5, v6, v0}, Lv4;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    const-string v0, "\ntarget="

    .line 297
    .line 298
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    const-string v0, "\npage="

    .line 313
    .line 314
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    instance-of v0, p1, Landroid/view/View;

    .line 318
    .line 319
    if-eqz v0, :cond_f

    .line 320
    .line 321
    check-cast p1, Landroid/view/View;

    .line 322
    .line 323
    const-string v0, "unknown"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    .line 324
    .line 325
    :try_start_5
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 326
    .line 327
    .line 328
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 329
    if-nez p1, :cond_e

    .line 330
    .line 331
    goto :goto_9

    .line 332
    :cond_e
    :try_start_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    goto :goto_9

    .line 341
    :cond_f
    const-string v0, "unknown"

    .line 342
    .line 343
    :catchall_4
    :goto_9
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    const-string p1, "\noriginalUnreadFields="

    .line 347
    .line 348
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    const-string p0, "\noriginalBadgeText="

    .line 355
    .line 356
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    const/16 p0, 0x12c

    .line 360
    .line 361
    if-eqz v4, :cond_11

    .line 362
    .line 363
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 364
    .line 365
    .line 366
    move-result p1

    .line 367
    if-nez p1, :cond_10

    .line 368
    .line 369
    goto :goto_a

    .line 370
    :cond_10
    invoke-static {v4, p0}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    goto :goto_b

    .line 375
    :cond_11
    :goto_a
    move-object p1, v3

    .line 376
    :goto_b
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    .line 378
    .line 379
    const-string p1, "\nmodifiedBadgeText="

    .line 380
    .line 381
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    if-eqz v1, :cond_12

    .line 385
    .line 386
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    if-eqz p1, :cond_12

    .line 391
    .line 392
    invoke-static {v1, p0}, Li5;->H1(Ljava/lang/CharSequence;I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    :cond_12
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    const-string p0, "\nskipped=false"

    .line 400
    .line 401
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    const-string p0, "\nskipReason=none"

    .line 405
    .line 406
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    const-string p0, "\nreason="

    .line 410
    .line 411
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 422
    .line 423
    .line 424
    goto :goto_c

    .line 425
    :catchall_5
    move-exception p0

    .line 426
    const-string p1, "traceUnreadCountEvent failed: "

    .line 427
    .line 428
    invoke-static {p1, p0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 429
    .line 430
    .line 431
    :cond_13
    :goto_c
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0}, Lt2;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string v1, "\\|"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    array-length v2, v1

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    if-ge v3, v2, :cond_3

    .line 28
    .line 29
    aget-object v4, v1, v3

    .line 30
    .line 31
    if-nez v4, :cond_1

    .line 32
    .line 33
    const-string v4, ""

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    :goto_1
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, "|"

    .line 59
    .line 60
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-static {p0, p1}, Lt2;->p(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static c(Ljava/lang/Object;ILjava/util/Set;)I
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    if-gt v1, v4, :cond_0

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    instance-of v5, v0, Ljava/lang/CharSequence;

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    instance-of v5, v0, Ljava/lang/Number;

    .line 25
    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    instance-of v5, v0, Ljava/lang/Boolean;

    .line 29
    .line 30
    if-nez v5, :cond_0

    .line 31
    .line 32
    instance-of v5, v0, Ljava/lang/Enum;

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    :cond_0
    const/16 v16, 0x0

    .line 37
    .line 38
    goto/16 :goto_d

    .line 39
    .line 40
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    const-string v7, "badge"

    .line 53
    .line 54
    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v8

    .line 58
    const-string v9, "group"

    .line 59
    .line 60
    const-string v10, "troop"

    .line 61
    .line 62
    const-string v11, "conversation"

    .line 63
    .line 64
    const-string v12, "contact"

    .line 65
    .line 66
    const-string v13, "chat"

    .line 67
    .line 68
    const-string v14, "recent"

    .line 69
    .line 70
    const-string v15, "unread"

    .line 71
    .line 72
    const/16 v16, 0x0

    .line 73
    .line 74
    if-nez v8, :cond_3

    .line 75
    .line 76
    invoke-virtual {v6, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-nez v8, :cond_3

    .line 81
    .line 82
    invoke-virtual {v6, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-nez v8, :cond_3

    .line 87
    .line 88
    invoke-virtual {v6, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    if-nez v8, :cond_3

    .line 93
    .line 94
    const-string v8, "aio"

    .line 95
    .line 96
    invoke-virtual {v6, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-nez v8, :cond_3

    .line 101
    .line 102
    const-string v8, "message"

    .line 103
    .line 104
    invoke-virtual {v6, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-nez v8, :cond_3

    .line 109
    .line 110
    const-string v8, "msg"

    .line 111
    .line 112
    invoke-virtual {v6, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-nez v8, :cond_3

    .line 117
    .line 118
    invoke-virtual {v6, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-nez v8, :cond_3

    .line 123
    .line 124
    invoke-virtual {v6, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-nez v8, :cond_3

    .line 129
    .line 130
    invoke-virtual {v6, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-nez v8, :cond_3

    .line 135
    .line 136
    invoke-virtual {v6, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_2

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_2
    move/from16 v6, v16

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    :goto_0
    const/4 v6, 0x1

    .line 147
    :goto_1
    move/from16 v8, v16

    .line 148
    .line 149
    :goto_2
    if-eqz v5, :cond_e

    .line 150
    .line 151
    const-class v3, Ljava/lang/Object;

    .line 152
    .line 153
    if-eq v5, v3, :cond_e

    .line 154
    .line 155
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    array-length v4, v3

    .line 160
    move-object/from16 v17, v3

    .line 161
    .line 162
    move/from16 v3, v16

    .line 163
    .line 164
    :goto_3
    if-ge v3, v4, :cond_d

    .line 165
    .line 166
    move/from16 v18, v3

    .line 167
    .line 168
    aget-object v3, v17, v18

    .line 169
    .line 170
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 171
    .line 172
    .line 173
    move-result v19

    .line 174
    invoke-static/range {v19 .. v19}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 175
    .line 176
    .line 177
    move-result v19

    .line 178
    if-eqz v19, :cond_4

    .line 179
    .line 180
    add-int/lit8 v3, v18, 0x1

    .line 181
    .line 182
    move/from16 v20, v4

    .line 183
    .line 184
    move-object/from16 v19, v5

    .line 185
    .line 186
    move/from16 v21, v6

    .line 187
    .line 188
    const/4 v4, 0x1

    .line 189
    const/4 v5, 0x2

    .line 190
    goto/16 :goto_c

    .line 191
    .line 192
    :cond_4
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v19
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 196
    move/from16 v20, v4

    .line 197
    .line 198
    :try_start_1
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 202
    move-object/from16 v19, v5

    .line 203
    .line 204
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 208
    move/from16 v21, v6

    .line 209
    .line 210
    :try_start_3
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 211
    .line 212
    if-eq v5, v6, :cond_b

    .line 213
    .line 214
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    const-class v6, Ljava/lang/Integer;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 219
    .line 220
    if-eq v5, v6, :cond_5

    .line 221
    .line 222
    :try_start_4
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 227
    .line 228
    if-eq v5, v6, :cond_5

    .line 229
    .line 230
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    const-class v6, Ljava/lang/Long;

    .line 235
    .line 236
    if-eq v5, v6, :cond_5

    .line 237
    .line 238
    const-class v5, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 245
    .line 246
    .line 247
    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 248
    if-eqz v5, :cond_6

    .line 249
    .line 250
    :cond_5
    const/4 v5, 0x2

    .line 251
    goto/16 :goto_6

    .line 252
    .line 253
    :cond_6
    const/4 v5, 0x2

    .line 254
    if-ge v1, v5, :cond_8

    .line 255
    .line 256
    :try_start_5
    const-string v6, "data"

    .line 257
    .line 258
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-nez v6, :cond_7

    .line 263
    .line 264
    const-string v6, "info"

    .line 265
    .line 266
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    if-nez v6, :cond_7

    .line 271
    .line 272
    const-string v6, "model"

    .line 273
    .line 274
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    if-nez v6, :cond_7

    .line 279
    .line 280
    const-string v6, "item"

    .line 281
    .line 282
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-nez v6, :cond_7

    .line 287
    .line 288
    invoke-virtual {v4, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    if-nez v6, :cond_7

    .line 293
    .line 294
    invoke-virtual {v4, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    if-nez v6, :cond_7

    .line 299
    .line 300
    invoke-virtual {v4, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 301
    .line 302
    .line 303
    move-result v6

    .line 304
    if-nez v6, :cond_7

    .line 305
    .line 306
    invoke-virtual {v4, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 307
    .line 308
    .line 309
    move-result v6

    .line 310
    if-nez v6, :cond_7

    .line 311
    .line 312
    invoke-virtual {v4, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    if-nez v6, :cond_7

    .line 317
    .line 318
    invoke-virtual {v4, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    if-nez v6, :cond_7

    .line 323
    .line 324
    invoke-virtual {v4, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 325
    .line 326
    .line 327
    move-result v6

    .line 328
    if-nez v6, :cond_7

    .line 329
    .line 330
    invoke-virtual {v4, v13}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 331
    .line 332
    .line 333
    move-result v4

    .line 334
    if-eqz v4, :cond_8

    .line 335
    .line 336
    :cond_7
    const/4 v4, 0x1

    .line 337
    goto :goto_5

    .line 338
    :catchall_0
    :cond_8
    :goto_4
    const/4 v4, 0x1

    .line 339
    goto/16 :goto_b

    .line 340
    .line 341
    :goto_5
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    add-int/lit8 v4, v1, 0x1

    .line 349
    .line 350
    invoke-static {v3, v4, v2}, Lxd;->c(Ljava/lang/Object;ILjava/util/Set;)I

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    if-le v3, v8, :cond_8

    .line 355
    .line 356
    move v8, v3

    .line 357
    goto :goto_4

    .line 358
    :catchall_1
    const/4 v5, 0x2

    .line 359
    goto :goto_4

    .line 360
    :goto_6
    if-nez v21, :cond_9

    .line 361
    .line 362
    invoke-virtual {v4, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 363
    .line 364
    .line 365
    move-result v6

    .line 366
    if-nez v6, :cond_9

    .line 367
    .line 368
    const-string v6, "count"

    .line 369
    .line 370
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 371
    .line 372
    .line 373
    move-result v6

    .line 374
    if-nez v6, :cond_9

    .line 375
    .line 376
    invoke-virtual {v4, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 377
    .line 378
    .line 379
    move-result v6

    .line 380
    if-nez v6, :cond_9

    .line 381
    .line 382
    const-string v6, "num"

    .line 383
    .line 384
    invoke-virtual {v4, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 385
    .line 386
    .line 387
    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 388
    if-eqz v4, :cond_8

    .line 389
    .line 390
    :cond_9
    const/4 v4, 0x1

    .line 391
    :try_start_6
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    instance-of v6, v3, Ljava/lang/Number;

    .line 399
    .line 400
    if-eqz v6, :cond_a

    .line 401
    .line 402
    check-cast v3, Ljava/lang/Number;

    .line 403
    .line 404
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 408
    goto :goto_7

    .line 409
    :cond_a
    move/from16 v3, v16

    .line 410
    .line 411
    :goto_7
    if-le v3, v8, :cond_c

    .line 412
    .line 413
    const/16 v6, 0x63

    .line 414
    .line 415
    if-le v3, v6, :cond_c

    .line 416
    .line 417
    const v6, 0xf4240

    .line 418
    .line 419
    .line 420
    if-ge v3, v6, :cond_c

    .line 421
    .line 422
    move v8, v3

    .line 423
    goto :goto_b

    .line 424
    :catchall_2
    :cond_b
    :goto_8
    const/4 v4, 0x1

    .line 425
    const/4 v5, 0x2

    .line 426
    goto :goto_b

    .line 427
    :catchall_3
    :goto_9
    move/from16 v21, v6

    .line 428
    .line 429
    goto :goto_8

    .line 430
    :catchall_4
    :goto_a
    move-object/from16 v19, v5

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :catchall_5
    move/from16 v20, v4

    .line 434
    .line 435
    goto :goto_a

    .line 436
    :catchall_6
    :cond_c
    :goto_b
    add-int/lit8 v3, v18, 0x1

    .line 437
    .line 438
    :goto_c
    move-object/from16 v5, v19

    .line 439
    .line 440
    move/from16 v4, v20

    .line 441
    .line 442
    move/from16 v6, v21

    .line 443
    .line 444
    goto/16 :goto_3

    .line 445
    .line 446
    :cond_d
    move-object/from16 v19, v5

    .line 447
    .line 448
    move/from16 v21, v6

    .line 449
    .line 450
    const/4 v4, 0x1

    .line 451
    const/4 v5, 0x2

    .line 452
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    move v4, v5

    .line 457
    move-object v5, v3

    .line 458
    goto/16 :goto_2

    .line 459
    .line 460
    :cond_e
    return v8

    .line 461
    :goto_d
    return v16
.end method

.method public static d(Ljava/lang/String;Ljava/lang/reflect/Method;)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "hooked widget text full unread count limit ("

    .line 6
    .line 7
    const-string v3, "hooked widget badge full unread count limit ("

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    const-string v6, "target.unread_full.qui_badge_class"

    .line 14
    .line 15
    const-string v7, "com.tencent.mobileqq.quibadge.QUIBadge"

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    invoke-static {v8, v6, v7}, Lt2;->i(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    .line 35
    if-eq v7, v8, :cond_0

    .line 36
    .line 37
    const/16 v16, 0x0

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_0
    const-string v7, "): "

    .line 42
    .line 43
    const-class v8, Ljava/lang/String;

    .line 44
    .line 45
    const/4 v9, 0x4

    .line 46
    const/4 v10, 0x3

    .line 47
    const/4 v11, 0x2

    .line 48
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    const/4 v13, 0x5

    .line 51
    const/4 v14, 0x1

    .line 52
    const/16 v15, 0x3c

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    :try_start_1
    array-length v4, v5

    .line 59
    if-ne v4, v13, :cond_3

    .line 60
    .line 61
    aget-object v4, v5, v16

    .line 62
    .line 63
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    aget-object v4, v5, v14

    .line 70
    .line 71
    if-ne v4, v12, :cond_3

    .line 72
    .line 73
    aget-object v4, v5, v11

    .line 74
    .line 75
    if-ne v4, v12, :cond_3

    .line 76
    .line 77
    aget-object v4, v5, v10

    .line 78
    .line 79
    if-ne v4, v12, :cond_3

    .line 80
    .line 81
    aget-object v4, v5, v9

    .line 82
    .line 83
    if-ne v4, v8, :cond_3

    .line 84
    .line 85
    invoke-static {v1}, Lxd;->e(Ljava/lang/reflect/Method;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-nez v2, :cond_1

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_1
    new-instance v2, Lsd;

    .line 94
    .line 95
    invoke-direct {v2, v15}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-static {v1, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 99
    .line 100
    .line 101
    new-instance v2, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    return v14

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    goto :goto_1

    .line 129
    :cond_2
    const/16 v16, 0x0

    .line 130
    .line 131
    :cond_3
    array-length v3, v5

    .line 132
    const/4 v4, 0x6

    .line 133
    if-lt v3, v4, :cond_5

    .line 134
    .line 135
    const-class v3, Landroid/widget/TextView;

    .line 136
    .line 137
    aget-object v4, v5, v16

    .line 138
    .line 139
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_5

    .line 144
    .line 145
    aget-object v3, v5, v14

    .line 146
    .line 147
    if-ne v3, v12, :cond_5

    .line 148
    .line 149
    aget-object v3, v5, v11

    .line 150
    .line 151
    if-ne v3, v12, :cond_5

    .line 152
    .line 153
    aget-object v3, v5, v10

    .line 154
    .line 155
    if-ne v3, v12, :cond_5

    .line 156
    .line 157
    aget-object v3, v5, v9

    .line 158
    .line 159
    if-ne v3, v12, :cond_5

    .line 160
    .line 161
    aget-object v3, v5, v13

    .line 162
    .line 163
    if-ne v3, v8, :cond_5

    .line 164
    .line 165
    invoke-static {v1}, Lxd;->e(Ljava/lang/reflect/Method;)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    if-nez v3, :cond_4

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_4
    new-instance v3, Ltd;

    .line 173
    .line 174
    invoke-direct {v3, v15}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 178
    .line 179
    .line 180
    new-instance v3, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-static {v1}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-static {v0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    .line 204
    .line 205
    return v14

    .line 206
    :cond_5
    :goto_0
    return v16

    .line 207
    :catchall_1
    move-exception v0

    .line 208
    const/16 v16, 0x0

    .line 209
    .line 210
    :goto_1
    const-string v1, "hookOneWidgetUnreadFullMethod failed: "

    .line 211
    .line 212
    invoke-static {v1, v0}, La;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 213
    .line 214
    .line 215
    return v16
.end method

.method public static e(Ljava/lang/reflect/Method;)Z
    .locals 1

    .line 1
    sget-object v0, Lxd;->e:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Lv4;->E(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static f(Landroid/widget/TextView;I)V
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    if-gtz p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :try_start_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    :catchall_0
    :cond_1
    const p1, 0x7fffffff

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxWidth(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :catchall_1
    :try_start_2
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    .line 31
    .line 32
    :catchall_2
    :cond_2
    :goto_0
    return-void
.end method

.method public static g(Ljava/lang/Object;IILjava/util/Set;)V
    .locals 8

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    if-lez p1, :cond_7

    .line 4
    .line 5
    if-ltz p2, :cond_7

    .line 6
    .line 7
    if-eqz p3, :cond_7

    .line 8
    .line 9
    invoke-interface {p3, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_3

    .line 16
    .line 17
    :cond_0
    instance-of v0, p0, Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    check-cast p0, Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p2}, Li5;->E0(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_1

    .line 32
    .line 33
    invoke-static {p0}, Li5;->y0(Landroid/view/View;)Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-eqz p2, :cond_7

    .line 38
    .line 39
    :cond_1
    invoke-static {p0, p1}, Lxd;->f(Landroid/widget/TextView;I)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v2, 0x1

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    check-cast p0, Landroid/view/ViewGroup;

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/16 v3, 0x20

    .line 56
    .line 57
    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    :goto_0
    if-ge v1, v0, :cond_7

    .line 62
    .line 63
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    add-int/lit8 v4, p2, -0x1

    .line 68
    .line 69
    invoke-static {v3, p1, v4, p3}, Lxd;->g(Ljava/lang/Object;IILjava/util/Set;)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    instance-of v0, p0, Landroid/view/View;

    .line 76
    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    instance-of v0, p0, Ljava/lang/CharSequence;

    .line 80
    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    instance-of v0, p0, Ljava/lang/Number;

    .line 84
    .line 85
    if-nez v0, :cond_7

    .line 86
    .line 87
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    :goto_1
    if-eqz v0, :cond_7

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    array-length v4, v3

    .line 103
    move v5, v1

    .line 104
    :goto_2
    if-ge v5, v4, :cond_6

    .line 105
    .line 106
    aget-object v6, v3, v5

    .line 107
    .line 108
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-nez v7, :cond_5

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-nez v7, :cond_5

    .line 127
    .line 128
    invoke-virtual {v6, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    add-int/lit8 v7, p2, -0x1

    .line 136
    .line 137
    invoke-static {v6, p1, v7, p3}, Lxd;->g(Ljava/lang/Object;IILjava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    :catchall_0
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_1

    .line 148
    :cond_7
    :goto_3
    return-void
.end method
