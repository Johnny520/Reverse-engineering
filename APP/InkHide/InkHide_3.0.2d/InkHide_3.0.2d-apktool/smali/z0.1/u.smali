.class public abstract Lz0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;


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
    sput-object v0, Lz0/u;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lz0/u;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Ljava/lang/Throwable;)Z
    .locals 8

    .line 1
    new-instance v0, Lr0/n1;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr0/n1;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LK0/h;

    .line 9
    .line 10
    new-instance v2, LF0/a;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, v3, p0}, LF0/a;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, v0}, LK0/h;-><init>(LM0/a;LM0/l;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v1}, LT0/h;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Ljava/lang/Throwable;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v2, "getStackTrace(...)"

    .line 41
    .line 42
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    array-length v2, v0

    .line 46
    move v3, v1

    .line 47
    :goto_0
    if-ge v3, v2, :cond_0

    .line 48
    .line 49
    aget-object v4, v0, v3

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    const-string v6, "getClassName(...)"

    .line 56
    .line 57
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-string v7, "com.lu.wxmask"

    .line 61
    .line 62
    invoke-static {v5, v1, v7}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v4, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const-string v5, "com.lu.lposed"

    .line 76
    .line 77
    invoke-static {v4, v1, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 88
    return p0

    .line 89
    :cond_3
    return v1
.end method

.method public static b(Landroid/content/Context;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 7

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    const-string p0, "inkhide_crash"

    .line 15
    .line 16
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 33
    .line 34
    const-string v1, "yyyyMMdd-HHmmss-SSS"

    .line 35
    .line 36
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 39
    .line 40
    .line 41
    new-instance v1, Ljava/util/Date;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance v1, Ljava/io/File;

    .line 51
    .line 52
    const-string v2, "inkhide-crash-"

    .line 53
    .line 54
    const-string v3, ".log"

    .line 55
    .line 56
    invoke-static {v2, p0, v3}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {v1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    new-instance p0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v2, "module=3.0.2d(1027)\n"

    .line 66
    .line 67
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lz0/r;->o()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v4, "wechat="

    .line 77
    .line 78
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/16 v2, 0xa

    .line 92
    .line 93
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-static {}, Landroidx/emoji2/text/b;->n()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    new-instance v4, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v5, "process="

    .line 103
    .line 104
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    new-instance p1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v6, "thread="

    .line 131
    .line 132
    invoke-direct {p1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v3, "("

    .line 139
    .line 140
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v3, ")"

    .line 147
    .line 148
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 162
    .line 163
    .line 164
    move-result-wide v2

    .line 165
    new-instance p1, Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string v4, "time="

    .line 168
    .line 169
    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p1, "\n\n"

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    new-instance p1, Ljava/io/StringWriter;

    .line 188
    .line 189
    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    .line 190
    .line 191
    .line 192
    new-instance v2, Ljava/io/PrintWriter;

    .line 193
    .line 194
    invoke-direct {v2, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/io/PrintWriter;->flush()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    const-string p2, "toString(...)"

    .line 208
    .line 209
    invoke-static {p1, p2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-static {p0, p2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v1, p0}, LD/h;->X(Ljava/io/File;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    new-instance p0, Lz0/t;

    .line 226
    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, p0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    if-nez p0, :cond_2

    .line 235
    .line 236
    const/4 p0, 0x0

    .line 237
    new-array p0, p0, [Ljava/io/File;

    .line 238
    .line 239
    :cond_2
    new-instance p1, LV/k;

    .line 240
    .line 241
    const/4 p2, 0x4

    .line 242
    invoke-direct {p1, p2}, LV/k;-><init>(I)V

    .line 243
    .line 244
    .line 245
    array-length p2, p0

    .line 246
    const/4 v0, 0x1

    .line 247
    if-nez p2, :cond_3

    .line 248
    .line 249
    goto :goto_0

    .line 250
    :cond_3
    array-length p2, p0

    .line 251
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    const-string p2, "copyOf(...)"

    .line 256
    .line 257
    invoke-static {p0, p2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    array-length p2, p0

    .line 261
    if-le p2, v0, :cond_4

    .line 262
    .line 263
    invoke-static {p0, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 264
    .line 265
    .line 266
    :cond_4
    :goto_0
    invoke-static {p0}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    const/16 p2, 0xc

    .line 275
    .line 276
    sub-int/2addr p1, p2

    .line 277
    if-gtz p1, :cond_5

    .line 278
    .line 279
    sget-object p0, LF0/s;->a:LF0/s;

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_5
    if-ne p1, v0, :cond_7

    .line 283
    .line 284
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    if-nez p1, :cond_6

    .line 289
    .line 290
    invoke-static {p0}, LF0/l;->Y(Ljava/util/List;)I

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    invoke-static {p0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    goto :goto_3

    .line 303
    :cond_6
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 304
    .line 305
    const-string p1, "List is empty."

    .line 306
    .line 307
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    throw p0

    .line 311
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    .line 315
    .line 316
    instance-of p1, p0, Ljava/util/RandomAccess;

    .line 317
    .line 318
    if-eqz p1, :cond_8

    .line 319
    .line 320
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 321
    .line 322
    .line 323
    move-result p1

    .line 324
    :goto_1
    if-ge p2, p1, :cond_9

    .line 325
    .line 326
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    add-int/lit8 p2, p2, 0x1

    .line 334
    .line 335
    goto :goto_1

    .line 336
    :cond_8
    invoke-interface {p0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    if-eqz p1, :cond_9

    .line 345
    .line 346
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    goto :goto_2

    .line 354
    :cond_9
    move-object p0, v0

    .line 355
    :goto_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    :catchall_0
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    if-eqz p1, :cond_a

    .line 364
    .line 365
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    check-cast p1, Ljava/io/File;

    .line 370
    .line 371
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 372
    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_a
    const-string p0, "runtime crash saved"

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    invoke-static {p0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    return-void
.end method
