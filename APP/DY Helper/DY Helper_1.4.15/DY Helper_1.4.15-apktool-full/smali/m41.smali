.class public abstract Lm41;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final β:Ljava/util/Set;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, Lm41;->β:Ljava/util/Set;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lm41;->γ:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    return-void
.end method

.method public static α(Ljava/lang/reflect/Method;Ljava/lang/String;Lm01;)V
    .locals 5

    .line 1
    const-string v0, " method="

    .line 2
    .line 3
    const-string v1, "[install] role="

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget-object v3, Lm41;->β:Ljava/util/Set;

    .line 10
    .line 11
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v4, 0x1

    .line 19
    :try_start_0
    invoke-virtual {p0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    sget-object v4, Lxq0;->α:Lxq0;

    .line 23
    .line 24
    invoke-virtual {v4, p0, p2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 25
    .line 26
    .line 27
    new-instance p0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lm41;->γ(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    new-instance p2, Leo1;

    .line 53
    .line 54
    invoke-direct {p2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object p0, p2

    .line 58
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_1

    .line 63
    .line 64
    invoke-interface {v3, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    new-instance p2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v1, "[install] failed role="

    .line 70
    .line 71
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string p2, "DYH-OfflineCache"

    .line 88
    .line 89
    invoke-static {p2, p1, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    :goto_1
    return-void
.end method

.method public static β(Ljava/lang/ClassLoader;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lm41;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v6, 0x0

    .line 8
    invoke-virtual {v0, v6, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v7, 0x18

    .line 13
    .line 14
    const/16 v8, 0x17

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "offline_cache_count_enabled"

    .line 20
    .line 21
    invoke-static {v0, v6}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const-string v2, "offline_cache_count"

    .line 26
    .line 27
    const/16 v3, 0x64

    .line 28
    .line 29
    :try_start_0
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 34
    .line 35
    .line 36
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    :catchall_0
    const/16 v2, 0xa

    .line 38
    .line 39
    const/16 v4, 0x1f4

    .line 40
    .line 41
    invoke-static {v3, v2, v4}, Lj81;->μ(III)I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    sput-boolean v0, Ljx0;->ρ:Z

    .line 46
    .line 47
    sput v2, Ljx0;->σ:I

    .line 48
    .line 49
    sget-boolean v0, Ljx0;->ρ:Z

    .line 50
    .line 51
    sget v2, Ljx0;->σ:I

    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string v4, "[config] initial enabled="

    .line 56
    .line 57
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " count="

    .line 64
    .line 65
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lm41;->γ(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Lsv0;

    .line 79
    .line 80
    invoke-direct {v0, v8}, Lsv0;-><init>(I)V

    .line 81
    .line 82
    .line 83
    sget-object v2, Lui1;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    new-instance v0, Lsv0;

    .line 89
    .line 90
    invoke-direct {v0, v7}, Lsv0;-><init>(I)V

    .line 91
    .line 92
    .line 93
    sget-object v2, Lui1;->ι:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 94
    .line 95
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :goto_0
    sget-object v9, Ll41;->α:Ll41;

    .line 99
    .line 100
    sget-object v0, Lkx;->Ｐ:Lkx;

    .line 101
    .line 102
    new-instance v3, Lsv0;

    .line 103
    .line 104
    const/16 v10, 0x16

    .line 105
    .line 106
    invoke-direct {v3, v10}, Lsv0;-><init>(I)V

    .line 107
    .line 108
    .line 109
    new-instance v4, Lr20;

    .line 110
    .line 111
    const/16 v2, 0x1c

    .line 112
    .line 113
    invoke-direct {v4, p0, v2}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 114
    .line 115
    .line 116
    new-instance v5, Lt20;

    .line 117
    .line 118
    const/16 v2, 0xf

    .line 119
    .line 120
    invoke-direct {v5, p0, v2}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 121
    .line 122
    .line 123
    const/4 v2, 0x0

    .line 124
    move-object v1, p0

    .line 125
    invoke-static/range {v0 .. v5}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v11

    .line 129
    invoke-virtual {v9, p0, v2}, Ll41;->λ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_1

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    check-cast v3, Ljava/lang/reflect/Method;

    .line 148
    .line 149
    new-instance v4, Loj0;

    .line 150
    .line 151
    const/16 v5, 0x15

    .line 152
    .line 153
    invoke-direct {v4, v5}, Loj0;-><init>(I)V

    .line 154
    .line 155
    .line 156
    const-string v5, "target_getter"

    .line 157
    .line 158
    invoke-static {v3, v5, v4}, Lm41;->α(Ljava/lang/reflect/Method;Ljava/lang/String;Lm01;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    sget-object v0, Ll41;->α:Ll41;

    .line 163
    .line 164
    invoke-virtual {v0, p0, v2}, Ll41;->μ(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    const/4 v9, 0x2

    .line 177
    if-eqz v3, :cond_2

    .line 178
    .line 179
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    check-cast v3, Ljava/lang/reflect/Method;

    .line 184
    .line 185
    new-instance v4, Lbt;

    .line 186
    .line 187
    const-string v5, "target_setter"

    .line 188
    .line 189
    invoke-direct {v4, v5, v9}, Lbt;-><init>(Ljava/lang/String;I)V

    .line 190
    .line 191
    .line 192
    invoke-static {v3, v5, v4}, Lm41;->α(Ljava/lang/reflect/Method;Ljava/lang/String;Lm01;)V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_2
    sget-object v0, Lkx;->Ｏ:Lkx;

    .line 197
    .line 198
    new-instance v3, Lsv0;

    .line 199
    .line 200
    const/16 v4, 0xc

    .line 201
    .line 202
    invoke-direct {v3, v4}, Lsv0;-><init>(I)V

    .line 203
    .line 204
    .line 205
    new-instance v4, Lk41;

    .line 206
    .line 207
    invoke-direct {v4, p0, v6}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 208
    .line 209
    .line 210
    new-instance v5, Lt20;

    .line 211
    .line 212
    const/16 v6, 0x11

    .line 213
    .line 214
    invoke-direct {v5, p0, v6}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 215
    .line 216
    .line 217
    move-object v1, p0

    .line 218
    invoke-static/range {v0 .. v5}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-eqz v3, :cond_3

    .line 231
    .line 232
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    check-cast v3, Ljava/lang/reflect/Method;

    .line 237
    .line 238
    new-instance v4, Lbt;

    .line 239
    .line 240
    const-string v5, "cache_loader"

    .line 241
    .line 242
    invoke-direct {v4, v5, v9}, Lbt;-><init>(Ljava/lang/String;I)V

    .line 243
    .line 244
    .line 245
    invoke-static {v3, v5, v4}, Lm41;->α(Ljava/lang/reflect/Method;Ljava/lang/String;Lm01;)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_3
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-eqz v3, :cond_4

    .line 258
    .line 259
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    check-cast v3, Ljava/lang/reflect/Method;

    .line 264
    .line 265
    new-instance v4, Loj0;

    .line 266
    .line 267
    invoke-direct {v4, v10}, Loj0;-><init>(I)V

    .line 268
    .line 269
    .line 270
    const-string v5, "panel_adjust"

    .line 271
    .line 272
    invoke-static {v3, v5, v4}, Lm41;->α(Ljava/lang/reflect/Method;Ljava/lang/String;Lm01;)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_4
    sget-object v0, Ll41;->α:Ll41;

    .line 277
    .line 278
    sget-object v0, Lkx;->Ｒ:Lkx;

    .line 279
    .line 280
    new-instance v3, Lsv0;

    .line 281
    .line 282
    const/16 v4, 0xb

    .line 283
    .line 284
    invoke-direct {v3, v4}, Lsv0;-><init>(I)V

    .line 285
    .line 286
    .line 287
    new-instance v4, Lr20;

    .line 288
    .line 289
    const/16 v5, 0x1d

    .line 290
    .line 291
    invoke-direct {v4, p0, v5}, Lr20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 292
    .line 293
    .line 294
    new-instance v5, Lt20;

    .line 295
    .line 296
    const/16 v6, 0x10

    .line 297
    .line 298
    invoke-direct {v5, p0, v6}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 299
    .line 300
    .line 301
    move-object v1, p0

    .line 302
    invoke-static/range {v0 .. v5}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-eqz v3, :cond_5

    .line 315
    .line 316
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    check-cast v3, Ljava/lang/reflect/Method;

    .line 321
    .line 322
    new-instance v4, Loj0;

    .line 323
    .line 324
    invoke-direct {v4, v7}, Loj0;-><init>(I)V

    .line 325
    .line 326
    .line 327
    const-string v5, "panel_render"

    .line 328
    .line 329
    invoke-static {v3, v5, v4}, Lm41;->α(Ljava/lang/reflect/Method;Ljava/lang/String;Lm01;)V

    .line 330
    .line 331
    .line 332
    goto :goto_5

    .line 333
    :cond_5
    sget-object v0, Ll41;->α:Ll41;

    .line 334
    .line 335
    sget-object v0, Lkx;->Ｑ:Lkx;

    .line 336
    .line 337
    new-instance v3, Lsv0;

    .line 338
    .line 339
    const/16 v4, 0x13

    .line 340
    .line 341
    invoke-direct {v3, v4}, Lsv0;-><init>(I)V

    .line 342
    .line 343
    .line 344
    new-instance v4, Lk41;

    .line 345
    .line 346
    const/16 v5, 0x8

    .line 347
    .line 348
    invoke-direct {v4, p0, v5}, Lk41;-><init>(Ljava/lang/ClassLoader;I)V

    .line 349
    .line 350
    .line 351
    new-instance v5, Lt20;

    .line 352
    .line 353
    const/16 v6, 0x14

    .line 354
    .line 355
    invoke-direct {v5, p0, v6}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 356
    .line 357
    .line 358
    move-object v1, p0

    .line 359
    invoke-static/range {v0 .. v5}, Ll41;->κ(Lkx;Ljava/lang/ClassLoader;ZLa80;Lp70;La80;)Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    if-eqz v1, :cond_6

    .line 372
    .line 373
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    check-cast v1, Ljava/lang/reflect/Method;

    .line 378
    .line 379
    new-instance v2, Loj0;

    .line 380
    .line 381
    invoke-direct {v2, v8}, Loj0;-><init>(I)V

    .line 382
    .line 383
    .line 384
    const-string v3, "panel_ui"

    .line 385
    .line 386
    invoke-static {v1, v3, v2}, Lm41;->α(Ljava/lang/reflect/Method;Ljava/lang/String;Lm01;)V

    .line 387
    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_6
    return-void
.end method

.method public static γ(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "DYH-OfflineCache"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
