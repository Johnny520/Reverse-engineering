.class public final Lg10;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:J

.field public static final β:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final ε:Ljava/lang/Object;

.field public static final ζ:Ljava/lang/Object;

.field public static final η:Ljava/lang/Object;

.field public static final θ:Ljava/lang/Object;

.field public static final ι:Ljava/util/LinkedHashMap;

.field public static final κ:Ljava/util/WeakHashMap;

.field public static λ:Ld10;

.field public static μ:J

.field public static final ν:Lq00;

.field public static final ξ:Lsg;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    sput-wide v0, Lg10;->α:J

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 14
    .line 15
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lg10;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lg10;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 28
    .line 29
    new-instance v0, Ljava/lang/Object;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lg10;->ε:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/Object;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lg10;->ζ:Ljava/lang/Object;

    .line 42
    .line 43
    new-instance v0, Ljava/lang/Object;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lg10;->η:Ljava/lang/Object;

    .line 49
    .line 50
    new-instance v0, Ljava/lang/Object;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lg10;->θ:Ljava/lang/Object;

    .line 56
    .line 57
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lg10;->ι:Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    new-instance v0, Ljava/util/WeakHashMap;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lg10;->κ:Ljava/util/WeakHashMap;

    .line 70
    .line 71
    new-instance v0, Lq00;

    .line 72
    .line 73
    const/16 v1, 0x11

    .line 74
    .line 75
    invoke-direct {v0, v1}, Lq00;-><init>(I)V

    .line 76
    .line 77
    .line 78
    sput-object v0, Lg10;->ν:Lq00;

    .line 79
    .line 80
    new-instance v0, Lsg;

    .line 81
    .line 82
    const/4 v1, 0x1

    .line 83
    invoke-direct {v0, v1}, Lsg;-><init>(I)V

    .line 84
    .line 85
    .line 86
    sput-object v0, Lg10;->ξ:Lsg;

    .line 87
    .line 88
    return-void
.end method

.method public static final α(Ljava/lang/Object;Landroid/view/MotionEvent;Ljava/lang/String;Z)Z
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    if-eqz p3, :cond_7

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/16 v17, 0x0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v6

    .line 19
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v9

    .line 31
    sget-object v11, Lg10;->η:Ljava/lang/Object;

    .line 32
    .line 33
    monitor-enter v11

    .line 34
    :try_start_0
    sget-object v12, Lg10;->κ:Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-virtual {v12}, Ljava/util/WeakHashMap;->values()Ljava/util/Collection;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v12, Ljava/lang/Iterable;

    .line 44
    .line 45
    instance-of v13, v12, Ljava/util/Collection;

    .line 46
    .line 47
    if-eqz v13, :cond_1

    .line 48
    .line 49
    move-object v13, v12

    .line 50
    check-cast v13, Ljava/util/Collection;

    .line 51
    .line 52
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    if-eqz v13, :cond_1

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    const/16 v17, 0x0

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_4

    .line 64
    :cond_1
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 65
    .line 66
    .line 67
    move-result-object v12

    .line 68
    :cond_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v13

    .line 72
    if-eqz v13, :cond_6

    .line 73
    .line 74
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    check-cast v13, Lh10;

    .line 79
    .line 80
    iget-object v13, v13, Lh10;->γ:Lj10;

    .line 81
    .line 82
    if-nez v13, :cond_4

    .line 83
    .line 84
    :cond_3
    const/16 v17, 0x0

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    iget-wide v14, v13, Lj10;->β:J

    .line 88
    .line 89
    sub-long v16, v9, v14

    .line 90
    .line 91
    const-wide/16 v18, 0x0

    .line 92
    .line 93
    cmp-long v18, v18, v16

    .line 94
    .line 95
    if-gtz v18, :cond_3

    .line 96
    .line 97
    const-wide/16 v18, 0x4b0

    .line 98
    .line 99
    cmp-long v16, v16, v18

    .line 100
    .line 101
    if-gtz v16, :cond_3

    .line 102
    .line 103
    const/16 v17, 0x0

    .line 104
    .line 105
    iget-wide v2, v13, Lj10;->α:J

    .line 106
    .line 107
    cmp-long v2, v2, v4

    .line 108
    .line 109
    if-nez v2, :cond_5

    .line 110
    .line 111
    cmp-long v2, v14, v6

    .line 112
    .line 113
    if-nez v2, :cond_5

    .line 114
    .line 115
    iget v2, v13, Lj10;->γ:F

    .line 116
    .line 117
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-ne v2, v3, :cond_5

    .line 126
    .line 127
    iget v2, v13, Lj10;->δ:F

    .line 128
    .line 129
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    invoke-static {v8}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 134
    .line 135
    .line 136
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    if-ne v2, v3, :cond_5

    .line 138
    .line 139
    const/4 v2, 0x1

    .line 140
    goto :goto_1

    .line 141
    :cond_5
    :goto_0
    move/from16 v2, v17

    .line 142
    .line 143
    :goto_1
    if-eqz v2, :cond_2

    .line 144
    .line 145
    const/4 v3, 0x1

    .line 146
    goto :goto_2

    .line 147
    :cond_6
    const/16 v17, 0x0

    .line 148
    .line 149
    move/from16 v3, v17

    .line 150
    .line 151
    :goto_2
    monitor-exit v11

    .line 152
    if-nez v3, :cond_8

    .line 153
    .line 154
    :goto_3
    return v17

    .line 155
    :goto_4
    monitor-exit v11

    .line 156
    throw v0

    .line 157
    :cond_7
    const/16 v17, 0x0

    .line 158
    .line 159
    :cond_8
    if-nez v1, :cond_9

    .line 160
    .line 161
    goto :goto_5

    .line 162
    :cond_9
    new-instance v2, Ld10;

    .line 163
    .line 164
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDownTime()J

    .line 165
    .line 166
    .line 167
    move-result-wide v5

    .line 168
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 169
    .line 170
    .line 171
    move-result-wide v7

    .line 172
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawX()F

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getRawY()F

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    invoke-direct/range {v2 .. v8}, Ld10;-><init>(IIJJ)V

    .line 189
    .line 190
    .line 191
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 192
    .line 193
    .line 194
    move-result-wide v3

    .line 195
    sget-object v5, Lg10;->θ:Ljava/lang/Object;

    .line 196
    .line 197
    monitor-enter v5

    .line 198
    :try_start_1
    sget-object v0, Lg10;->λ:Ld10;

    .line 199
    .line 200
    invoke-static {v0, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-eqz v0, :cond_a

    .line 205
    .line 206
    sget-wide v6, Lg10;->μ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 207
    .line 208
    sub-long v6, v3, v6

    .line 209
    .line 210
    const-wide/16 v8, 0x5dc

    .line 211
    .line 212
    cmp-long v0, v6, v8

    .line 213
    .line 214
    if-gtz v0, :cond_a

    .line 215
    .line 216
    monitor-exit v5

    .line 217
    return v17

    .line 218
    :catchall_1
    move-exception v0

    .line 219
    goto/16 :goto_9

    .line 220
    .line 221
    :cond_a
    :try_start_2
    sput-object v2, Lg10;->λ:Ld10;

    .line 222
    .line 223
    sput-wide v3, Lg10;->μ:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 224
    .line 225
    monitor-exit v5

    .line 226
    :goto_5
    sget-object v0, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 227
    .line 228
    new-instance v2, Lqt;

    .line 229
    .line 230
    const/16 v3, 0xd

    .line 231
    .line 232
    invoke-direct {v2, v3}, Lqt;-><init>(I)V

    .line 233
    .line 234
    .line 235
    invoke-static {v0, v2}, Lxh;->Я(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_e

    .line 248
    .line 249
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    move-object v3, v0

    .line 254
    check-cast v3, Le10;

    .line 255
    .line 256
    move-object/from16 v4, p0

    .line 257
    .line 258
    :try_start_3
    invoke-interface {v3, v4, v1}, Le10;->β(Ljava/lang/Object;Landroid/view/MotionEvent;)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 263
    .line 264
    .line 265
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 266
    goto :goto_6

    .line 267
    :catchall_2
    move-exception v0

    .line 268
    new-instance v5, Leo1;

    .line 269
    .line 270
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    move-object v0, v5

    .line 274
    :goto_6
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    if-eqz v5, :cond_c

    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    sget-object v6, Lg10;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 289
    .line 290
    invoke-virtual {v6, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-eqz v6, :cond_c

    .line 295
    .line 296
    const-string v6, "r898d705a05f158a0"

    .line 297
    .line 298
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    const-string v7, "\u53cc\u51fb\u7b56\u7565\u5f02\u5e38 source="

    .line 303
    .line 304
    const-string v8, " listener="

    .line 305
    .line 306
    const-string v9, ": "

    .line 307
    .line 308
    move-object/from16 v10, p2

    .line 309
    .line 310
    invoke-static {v7, v10, v8, v3, v9}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    const/4 v5, 0x4

    .line 322
    const/4 v7, 0x0

    .line 323
    invoke-static {v6, v3, v7, v5, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    goto :goto_7

    .line 327
    :cond_c
    move-object/from16 v10, p2

    .line 328
    .line 329
    :goto_7
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 330
    .line 331
    instance-of v5, v0, Leo1;

    .line 332
    .line 333
    if-eqz v5, :cond_d

    .line 334
    .line 335
    move-object v0, v3

    .line 336
    :cond_d
    check-cast v0, Ljava/lang/Boolean;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 339
    .line 340
    .line 341
    move-result v0

    .line 342
    if-eqz v0, :cond_b

    .line 343
    .line 344
    const/4 v2, 0x1

    .line 345
    goto :goto_8

    .line 346
    :cond_e
    move/from16 v2, v17

    .line 347
    .line 348
    :goto_8
    return v2

    .line 349
    :goto_9
    monitor-exit v5

    .line 350
    throw v0
.end method

.method public static β(Ljava/lang/ClassLoader;Le10;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lg10;->ε:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    sget-object p1, Lg10;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-virtual {p1, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object p1, Lc10;->α:Lc10;

    .line 28
    .line 29
    sget-object p1, Lg10;->ν:Lq00;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    sget-object v5, Lc10;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 35
    .line 36
    invoke-virtual {v5, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addIfAbsent(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :goto_0
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :cond_1
    move v3, v4

    .line 52
    :goto_1
    monitor-exit v0

    .line 53
    const/4 p1, 0x4

    .line 54
    const/4 v0, 0x0

    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    :try_start_1
    sget-object v1, Le30;->α:Le30;

    .line 58
    .line 59
    invoke-virtual {v1, p0}, Le30;->β(Ljava/lang/ClassLoader;)V

    .line 60
    .line 61
    .line 62
    sget-object v1, Lg10;->ξ:Lsg;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sget-object v2, Le30;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 68
    .line 69
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_2
    sget-object v1, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catchall_1
    move-exception v1

    .line 82
    new-instance v2, Leo1;

    .line 83
    .line 84
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    move-object v1, v2

    .line 88
    :goto_2
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    const-string v2, "r898d705a05f158a0"

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    const-string v3, "\u53cc\u51fb\u89e6\u6478\u8bc1\u636e\u89c2\u5bdf\u5668\u5b89\u88c5\u5931\u8d25\uff0c\u4ec5\u4fdd\u7559\u5bbf\u4e3b\u4e3b\u5165\u53e3: "

    .line 101
    .line 102
    invoke-static {v3, v1}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v2, v1, v0, p1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    :try_start_2
    sget-object v1, Lc10;->α:Lc10;

    .line 110
    .line 111
    invoke-virtual {v1, p0, v4}, Lc10;->ζ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-static {p0}, Lc10;->η(Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    new-instance v2, Ll91;

    .line 120
    .line 121
    invoke-direct {v2, v1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :catchall_2
    move-exception p0

    .line 126
    new-instance v2, Leo1;

    .line 127
    .line 128
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 129
    .line 130
    .line 131
    :goto_3
    instance-of p0, v2, Leo1;

    .line 132
    .line 133
    if-nez p0, :cond_6

    .line 134
    .line 135
    move-object p0, v2

    .line 136
    check-cast p0, Ll91;

    .line 137
    .line 138
    iget-object v1, p0, Ll91;->ε:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Ljava/util/List;

    .line 141
    .line 142
    iget-object p0, p0, Ll91;->ζ:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Ljava/util/List;

    .line 145
    .line 146
    sget-object v3, Lg10;->ε:Ljava/lang/Object;

    .line 147
    .line 148
    monitor-enter v3

    .line 149
    :try_start_3
    sget-object v4, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_5

    .line 156
    .line 157
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_4

    .line 162
    .line 163
    const-string v1, "r898d705a05f158a0"

    .line 164
    .line 165
    const-string v4, "\u6682\u672a\u89e3\u6790\u5230\u5bbf\u4e3b\u53cc\u51fb\u4e3b\u5165\u53e3\uff0c\u7b49\u5f85 DexKit \u9884\u70ed\u7ed3\u679c"

    .line 166
    .line 167
    invoke-static {v1, v4, v0, p1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :catchall_3
    move-exception p0

    .line 172
    goto :goto_5

    .line 173
    :cond_4
    invoke-static {v1}, Lg10;->δ(Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    :goto_4
    invoke-static {p0}, Lg10;->ε(Ljava/util/List;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 177
    .line 178
    .line 179
    :cond_5
    monitor-exit v3

    .line 180
    goto :goto_6

    .line 181
    :goto_5
    monitor-exit v3

    .line 182
    throw p0

    .line 183
    :cond_6
    :goto_6
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    if-eqz p0, :cond_7

    .line 188
    .line 189
    const-string v1, "r898d705a05f158a0"

    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    const-string v2, "\u89e3\u6790\u5bbf\u4e3b\u53cc\u51fb\u5165\u53e3\u5931\u8d25: "

    .line 196
    .line 197
    invoke-static {v2, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-static {v1, p0, v0, p1, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_7
    return-void

    .line 205
    :goto_7
    monitor-exit v0

    .line 206
    throw p0
.end method

.method public static γ(Ljava/lang/Class;)Z
    .locals 2

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"

    .line 16
    .line 17
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public static δ(Ljava/util/List;)V
    .locals 18

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v3, v2

    .line 21
    check-cast v3, Ljava/lang/reflect/Method;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-static {v4, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-class v5, Landroid/view/MotionEvent;

    .line 50
    .line 51
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v4, v5}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v3}, Lg10;->γ(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    if-eqz v3, :cond_0

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    .line 79
    .line 80
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v2, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    const/4 v4, 0x0

    .line 97
    const/4 v5, 0x1

    .line 98
    if-eqz v3, :cond_4

    .line 99
    .line 100
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-object v6, v3

    .line 105
    check-cast v6, Ljava/lang/reflect/Method;

    .line 106
    .line 107
    invoke-static {v6}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-static {v8, v6}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    new-instance v11, Ljava/util/ArrayList;

    .line 127
    .line 128
    array-length v12, v10

    .line 129
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    array-length v12, v10

    .line 133
    :goto_2
    if-ge v4, v12, :cond_3

    .line 134
    .line 135
    aget-object v13, v10, v4

    .line 136
    .line 137
    invoke-static {v13, v11, v4, v5}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    goto :goto_2

    .line 142
    :cond_3
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 147
    .line 148
    .line 149
    const-string v12, ","

    .line 150
    .line 151
    const/16 v16, 0x0

    .line 152
    .line 153
    const/16 v17, 0x3e

    .line 154
    .line 155
    const/4 v13, 0x0

    .line 156
    const/4 v14, 0x0

    .line 157
    const/4 v15, 0x0

    .line 158
    invoke-static/range {v11 .. v17}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    const-string v5, "#"

    .line 163
    .line 164
    const-string v6, "("

    .line 165
    .line 166
    invoke-static {v7, v5, v8, v6, v4}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    const-string v5, "):"

    .line 171
    .line 172
    invoke-static {v4, v5, v9, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-eqz v4, :cond_2

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    const/4 v1, 0x4

    .line 187
    const/4 v3, 0x0

    .line 188
    if-eq v0, v5, :cond_5

    .line 189
    .line 190
    const-string v0, "r898d705a05f158a0"

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    const-string v4, "\u53cc\u51fb\u4e3b\u5165\u53e3\u5019\u9009\u4e0d\u552f\u4e00\uff0c\u62d2\u7edd\u5b89\u88c5 Hook count="

    .line 197
    .line 198
    invoke-static {v4, v2}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-static {v0, v2, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_5
    invoke-static {v2}, Lxh;->Щ(Ljava/util/List;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, Ljava/lang/reflect/Method;

    .line 211
    .line 212
    invoke-static {v0}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-static {v6, v0}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    new-instance v9, Ljava/util/ArrayList;

    .line 232
    .line 233
    array-length v10, v8

    .line 234
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 235
    .line 236
    .line 237
    array-length v10, v8

    .line 238
    move v11, v4

    .line 239
    :goto_3
    if-ge v11, v10, :cond_6

    .line 240
    .line 241
    aget-object v12, v8, v11

    .line 242
    .line 243
    invoke-static {v12, v9, v11, v5}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    goto :goto_3

    .line 248
    :cond_6
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 253
    .line 254
    .line 255
    const-string v10, ","

    .line 256
    .line 257
    const/4 v14, 0x0

    .line 258
    const/16 v15, 0x3e

    .line 259
    .line 260
    const/4 v11, 0x0

    .line 261
    const/4 v12, 0x0

    .line 262
    const/4 v13, 0x0

    .line 263
    invoke-static/range {v9 .. v15}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v8

    .line 267
    const-string v9, "#"

    .line 268
    .line 269
    const-string v10, "("

    .line 270
    .line 271
    invoke-static {v2, v9, v6, v10, v8}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    const-string v6, "):"

    .line 276
    .line 277
    invoke-static {v2, v6, v7}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    const-string v6, "primary:"

    .line 282
    .line 283
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    sget-object v7, Lg10;->ζ:Ljava/lang/Object;

    .line 288
    .line 289
    monitor-enter v7

    .line 290
    :try_start_0
    sget-object v8, Lg10;->ι:Ljava/util/LinkedHashMap;

    .line 291
    .line 292
    invoke-virtual {v8, v6}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 296
    if-eqz v9, :cond_7

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_7
    :try_start_1
    invoke-virtual {v0, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 300
    .line 301
    .line 302
    sget-object v4, Lxq0;->α:Lxq0;

    .line 303
    .line 304
    new-instance v5, Lxl;

    .line 305
    .line 306
    const v9, 0x7fffffff

    .line 307
    .line 308
    .line 309
    invoke-direct {v5, v9}, Lxl;-><init>(I)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v4, v0, v5}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-interface {v8, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :catchall_0
    move-exception v0

    .line 323
    :try_start_2
    new-instance v4, Leo1;

    .line 324
    .line 325
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 326
    .line 327
    .line 328
    move-object v0, v4

    .line 329
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    if-eqz v4, :cond_8

    .line 334
    .line 335
    const-string v5, "r898d705a05f158a0"

    .line 336
    .line 337
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    new-instance v6, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 344
    .line 345
    .line 346
    const-string v8, "\u5b89\u88c5\u53cc\u51fb\u4e3b\u5165\u53e3 Hook \u5931\u8d25: "

    .line 347
    .line 348
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    const-string v8, ", "

    .line 355
    .line 356
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    invoke-static {v5, v4, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    goto :goto_5

    .line 370
    :catchall_1
    move-exception v0

    .line 371
    goto :goto_7

    .line 372
    :cond_8
    :goto_5
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 373
    .line 374
    instance-of v5, v0, Leo1;

    .line 375
    .line 376
    if-eqz v5, :cond_9

    .line 377
    .line 378
    move-object v0, v4

    .line 379
    :cond_9
    check-cast v0, Ljava/lang/Boolean;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 382
    .line 383
    .line 384
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 385
    :goto_6
    monitor-exit v7

    .line 386
    if-eqz v4, :cond_a

    .line 387
    .line 388
    const-string v0, "r898d705a05f158a0"

    .line 389
    .line 390
    const-string v4, "\u5bbf\u4e3b\u53cc\u51fb\u4e3b\u5165\u53e3\u7edf\u4e00 Hook \u5df2\u5b89\u88c5: "

    .line 391
    .line 392
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-static {v0, v2, v3, v1, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    :cond_a
    return-void

    .line 400
    :goto_7
    monitor-exit v7

    .line 401
    throw v0
.end method

.method public static ε(Ljava/util/List;)V
    .locals 18

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface/range {p0 .. p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v5, v2

    .line 23
    check-cast v5, Ljava/lang/reflect/Method;

    .line 24
    .line 25
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_0

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-nez v7, :cond_0

    .line 50
    .line 51
    array-length v7, v6

    .line 52
    const/4 v8, 0x3

    .line 53
    if-ne v7, v8, :cond_0

    .line 54
    .line 55
    aget-object v3, v6, v3

    .line 56
    .line 57
    const-class v7, Landroid/view/MotionEvent;

    .line 58
    .line 59
    invoke-static {v3, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    aget-object v3, v6, v4

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950BD40139730D1F55377227BCD8D5E99"

    .line 72
    .line 73
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    const/4 v3, 0x2

    .line 84
    aget-object v3, v6, v3

    .line 85
    .line 86
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    const-string v4, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 91
    .line 92
    invoke-static {v4}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_0

    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {v3}, Lg10;->γ(Ljava/lang/Class;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_0

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    new-instance v1, Ljava/util/HashSet;

    .line 120
    .line 121
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v2, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_4

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    move-object v6, v5

    .line 144
    check-cast v6, Ljava/lang/reflect/Method;

    .line 145
    .line 146
    invoke-static {v6}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-static {v8, v6}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    new-instance v11, Ljava/util/ArrayList;

    .line 166
    .line 167
    array-length v12, v10

    .line 168
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    array-length v12, v10

    .line 172
    move v13, v3

    .line 173
    :goto_2
    if-ge v13, v12, :cond_3

    .line 174
    .line 175
    aget-object v14, v10, v13

    .line 176
    .line 177
    invoke-static {v14, v11, v13, v4}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    goto :goto_2

    .line 182
    :cond_3
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 187
    .line 188
    .line 189
    const-string v12, ","

    .line 190
    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v17, 0x3e

    .line 194
    .line 195
    const/4 v13, 0x0

    .line 196
    const/4 v14, 0x0

    .line 197
    const/4 v15, 0x0

    .line 198
    invoke-static/range {v11 .. v17}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    const-string v10, "#"

    .line 203
    .line 204
    const-string v11, "("

    .line 205
    .line 206
    invoke-static {v7, v10, v8, v11, v6}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    const-string v7, "):"

    .line 211
    .line 212
    invoke-static {v6, v7, v9, v1}, Llz1;->Γ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashSet;)Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-eqz v6, :cond_2

    .line 217
    .line 218
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_1

    .line 222
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_5

    .line 227
    .line 228
    goto/16 :goto_7

    .line 229
    .line 230
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    const/4 v1, 0x4

    .line 235
    const/4 v5, 0x0

    .line 236
    if-eq v0, v4, :cond_6

    .line 237
    .line 238
    const-string v0, "r898d705a05f158a0"

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    const-string v3, "\u53cc\u51fb\u8bed\u4e49\u515c\u5e95\u5019\u9009\u4e0d\u552f\u4e00\uff0c\u62d2\u7edd\u5b89\u88c5 Hook count="

    .line 245
    .line 246
    invoke-static {v3, v2}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-static {v0, v2, v5, v1, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_6
    invoke-static {v2}, Lxh;->Щ(Ljava/util/List;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    check-cast v0, Ljava/lang/reflect/Method;

    .line 259
    .line 260
    invoke-static {v0}, Llz1;->τ(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-static {v6, v0}, Llz1;->ο(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v7

    .line 272
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    new-instance v9, Ljava/util/ArrayList;

    .line 280
    .line 281
    array-length v10, v8

    .line 282
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 283
    .line 284
    .line 285
    array-length v10, v8

    .line 286
    move v11, v3

    .line 287
    :goto_3
    if-ge v11, v10, :cond_7

    .line 288
    .line 289
    aget-object v12, v8, v11

    .line 290
    .line 291
    invoke-static {v12, v9, v11, v4}, Llz1;->δ(Ljava/lang/Class;Ljava/util/ArrayList;II)I

    .line 292
    .line 293
    .line 294
    move-result v11

    .line 295
    goto :goto_3

    .line 296
    :cond_7
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 301
    .line 302
    .line 303
    const-string v10, ","

    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    const/16 v15, 0x3e

    .line 307
    .line 308
    const/4 v11, 0x0

    .line 309
    const/4 v12, 0x0

    .line 310
    const/4 v13, 0x0

    .line 311
    invoke-static/range {v9 .. v15}, Lxh;->О(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;ILa80;I)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    const-string v9, "#"

    .line 316
    .line 317
    const-string v10, "("

    .line 318
    .line 319
    invoke-static {v2, v9, v6, v10, v8}, Lnx;->ρ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    const-string v6, "):"

    .line 324
    .line 325
    invoke-static {v2, v6, v7}, Llz1;->π(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const-string v6, "semantic:"

    .line 330
    .line 331
    invoke-virtual {v6, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    sget-object v7, Lg10;->ζ:Ljava/lang/Object;

    .line 336
    .line 337
    monitor-enter v7

    .line 338
    :try_start_0
    sget-object v8, Lg10;->ι:Ljava/util/LinkedHashMap;

    .line 339
    .line 340
    invoke-virtual {v8, v6}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 344
    if-eqz v9, :cond_8

    .line 345
    .line 346
    goto :goto_6

    .line 347
    :cond_8
    :try_start_1
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 348
    .line 349
    .line 350
    sget-object v3, Lxq0;->α:Lxq0;

    .line 351
    .line 352
    new-instance v4, Lf10;

    .line 353
    .line 354
    const v9, 0x7fffffff

    .line 355
    .line 356
    .line 357
    const/4 v10, 0x0

    .line 358
    invoke-direct {v4, v9, v10}, Lf10;-><init>(II)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3, v0, v4}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    invoke-interface {v8, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    .line 370
    goto :goto_4

    .line 371
    :catchall_0
    move-exception v0

    .line 372
    :try_start_2
    new-instance v3, Leo1;

    .line 373
    .line 374
    invoke-direct {v3, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 375
    .line 376
    .line 377
    move-object v0, v3

    .line 378
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    if-eqz v3, :cond_9

    .line 383
    .line 384
    const-string v4, "r898d705a05f158a0"

    .line 385
    .line 386
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    new-instance v6, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 393
    .line 394
    .line 395
    const-string v8, "\u5b89\u88c5\u53cc\u51fb\u8bed\u4e49\u515c\u5e95 Hook \u5931\u8d25: "

    .line 396
    .line 397
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    const-string v8, ", "

    .line 404
    .line 405
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    invoke-static {v4, v3, v5, v1, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    goto :goto_5

    .line 419
    :catchall_1
    move-exception v0

    .line 420
    goto :goto_8

    .line 421
    :cond_9
    :goto_5
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 422
    .line 423
    instance-of v4, v0, Leo1;

    .line 424
    .line 425
    if-eqz v4, :cond_a

    .line 426
    .line 427
    move-object v0, v3

    .line 428
    :cond_a
    check-cast v0, Ljava/lang/Boolean;

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 431
    .line 432
    .line 433
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 434
    :goto_6
    monitor-exit v7

    .line 435
    if-eqz v3, :cond_b

    .line 436
    .line 437
    const-string v0, "r898d705a05f158a0"

    .line 438
    .line 439
    const-string v3, "\u5bbf\u4e3b\u53cc\u51fb\u8bed\u4e49\u515c\u5e95 Hook \u5df2\u5b89\u88c5: "

    .line 440
    .line 441
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-static {v0, v2, v5, v1, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    :cond_b
    :goto_7
    return-void

    .line 449
    :goto_8
    monitor-exit v7

    .line 450
    throw v0
.end method

.method public static ζ(Le10;)V
    .locals 7

    .line 1
    sget-object v0, Lg10;->ε:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lg10;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 13
    monitor-exit v0

    .line 14
    if-eqz p0, :cond_4

    .line 15
    .line 16
    sget-object p0, Lg10;->ζ:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :try_start_1
    sget-object v0, Lg10;->ι:Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast v1, Ljava/lang/Iterable;

    .line 29
    .line 30
    invoke-static {v1}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 35
    .line 36
    .line 37
    monitor-exit p0

    .line 38
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const/4 v0, 0x0

    .line 43
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x4

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ll01;

    .line 56
    .line 57
    :try_start_2
    invoke-virtual {v2}, Ll01;->α()V

    .line 58
    .line 59
    .line 60
    sget-object v2, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception v2

    .line 64
    new-instance v5, Leo1;

    .line 65
    .line 66
    invoke-direct {v5, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    move-object v2, v5

    .line 70
    :goto_1
    instance-of v5, v2, Leo1;

    .line 71
    .line 72
    if-nez v5, :cond_1

    .line 73
    .line 74
    move-object v5, v2

    .line 75
    check-cast v5, Ls62;

    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    :cond_1
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    const-string v5, "r898d705a05f158a0"

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const-string v6, "\u5378\u8f7d\u53cc\u51fb\u5165\u53e3 Hook \u5931\u8d25: "

    .line 92
    .line 93
    invoke-static {v6, v2}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v5, v2, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    sget-object p0, Lg10;->δ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 104
    .line 105
    .line 106
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_3

    .line 111
    .line 112
    const-string p0, "r898d705a05f158a0"

    .line 113
    .line 114
    const-string v1, "\u5bbf\u4e3b\u53cc\u51fb\u5165\u53e3\u7edf\u4e00 Hook \u5df2\u5378\u8f7d count="

    .line 115
    .line 116
    const-string v2, " reason=\u65e0\u6d3b\u8dc3\u53cc\u51fb\u7b56\u7565"

    .line 117
    .line 118
    invoke-static {v1, v0, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {p0, v0, v3, v4, v3}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_3
    sget-object p0, Le30;->α:Le30;

    .line 126
    .line 127
    sget-object p0, Lg10;->ξ:Lsg;

    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object v0, Le30;->γ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 133
    .line 134
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    sget-object p0, Lg10;->η:Ljava/lang/Object;

    .line 138
    .line 139
    monitor-enter p0

    .line 140
    :try_start_3
    sget-object v0, Lg10;->κ:Ljava/util/WeakHashMap;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 143
    .line 144
    .line 145
    monitor-exit p0

    .line 146
    sget-object p0, Lg10;->θ:Ljava/lang/Object;

    .line 147
    .line 148
    monitor-enter p0

    .line 149
    :try_start_4
    sput-object v3, Lg10;->λ:Ld10;

    .line 150
    .line 151
    const-wide/16 v0, 0x0

    .line 152
    .line 153
    sput-wide v0, Lg10;->μ:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 154
    .line 155
    monitor-exit p0

    .line 156
    return-void

    .line 157
    :catchall_1
    move-exception v0

    .line 158
    monitor-exit p0

    .line 159
    throw v0

    .line 160
    :catchall_2
    move-exception v0

    .line 161
    monitor-exit p0

    .line 162
    throw v0

    .line 163
    :catchall_3
    move-exception v0

    .line 164
    monitor-exit p0

    .line 165
    throw v0

    .line 166
    :cond_4
    return-void

    .line 167
    :catchall_4
    move-exception p0

    .line 168
    monitor-exit v0

    .line 169
    throw p0
.end method
