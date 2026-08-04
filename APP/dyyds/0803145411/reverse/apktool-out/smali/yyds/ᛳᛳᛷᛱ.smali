.class public final Lyyds/ᛳᛳᛷᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲀᲁ;

.field public static final ᲀᛲᛳᲀ:Ljava/util/List;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᛳᛳᛷᛱ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛷᛳᲈᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    const/16 v2, 0x2a

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-byte v2, v1, v3

    .line 8
    .line 9
    new-instance v2, Lyyds/ᲇᲁᲀᲁ;

    .line 10
    .line 11
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v2, v1}, Lyyds/ᲇᲁᲀᲁ;-><init>([B)V

    .line 16
    .line 17
    .line 18
    sput-object v2, Lyyds/ᛳᛳᛷᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲀᲁ;

    .line 19
    .line 20
    const-string v1, "*"

    .line 21
    .line 22
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sput-object v1, Lyyds/ᛳᛳᛷᛱ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 27
    .line 28
    new-instance v1, Lyyds/ᛳᛳᛷᛱ;

    .line 29
    .line 30
    new-instance v2, Lyyds/ᛷᛳᲈᛲ;

    .line 31
    .line 32
    invoke-direct {v2, v0}, Lyyds/ᛷᛳᲈᛲ;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v2}, Lyyds/ᛳᛳᛷᛱ;-><init>(Lyyds/ᛷᛳᲈᛲ;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lyyds/ᛳᛳᛷᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛳᛳᛷᛱ;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Lyyds/ᛷᛳᲈᛲ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᛳᛷᛱ;->ᛲᲈᲁ:Lyyds/ᛷᛳᲈᛲ;

    .line 5
    .line 6
    return-void
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/16 v1, 0x2e

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-char v1, v0, v2

    .line 8
    .line 9
    invoke-static {p0, v0}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛴᛴᲁ(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᛲᛱᲁᛳ(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, ""

    .line 18
    .line 19
    invoke-static {v0, v1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛸᲇᛶ(Ljava/util/List;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-static {p1}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lyyds/ᛳᛳᛷᛱ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object p0, p0, Lyyds/ᛳᛳᛷᛱ;->ᛲᲈᲁ:Lyyds/ᛷᛳᲈᛲ;

    .line 10
    .line 11
    iget-object v1, p0, Lyyds/ᛷᛳᲈᛲ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x1

    .line 20
    const/4 v4, 0x0

    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    move v1, v4

    .line 30
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lyyds/ᛷᛳᲈᛲ;->ᲇᲇᲇᛱ()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_2

    .line 45
    :catch_0
    move-exception v2

    .line 46
    :try_start_1
    iput-object v2, p0, Lyyds/ᛷᛳᲈᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    move v1, v3

    .line 55
    goto :goto_0

    .line 56
    :goto_2
    if-eqz v1, :cond_0

    .line 57
    .line 58
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 63
    .line 64
    .line 65
    :cond_0
    throw p0

    .line 66
    :cond_1
    :try_start_2
    iget-object v1, p0, Lyyds/ᛷᛳᲈᛲ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 79
    .line 80
    .line 81
    :cond_2
    :goto_3
    iget-object v1, p0, Lyyds/ᛷᛳᲈᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v1, Lyyds/ᲇᲁᲀᲁ;

    .line 84
    .line 85
    if-eqz v1, :cond_17

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    new-array v2, v1, [Lyyds/ᲇᲁᲀᲁ;

    .line 92
    .line 93
    move v5, v4

    .line 94
    :goto_4
    if-ge v5, v1, :cond_3

    .line 95
    .line 96
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    check-cast v6, Ljava/lang/String;

    .line 101
    .line 102
    new-instance v7, Lyyds/ᲇᲁᲀᲁ;

    .line 103
    .line 104
    sget-object v8, Lyyds/ᛲᛵᛴᛴ;->ᛲᲈᲁ:Ljava/nio/charset/Charset;

    .line 105
    .line 106
    invoke-virtual {v6, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-direct {v7, v8}, Lyyds/ᲇᲁᲀᲁ;-><init>([B)V

    .line 111
    .line 112
    .line 113
    iput-object v6, v7, Lyyds/ᲇᲁᲀᲁ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 114
    .line 115
    aput-object v7, v2, v5

    .line 116
    .line 117
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_3
    move v5, v4

    .line 121
    :goto_5
    const/4 v6, 0x0

    .line 122
    if-ge v5, v1, :cond_6

    .line 123
    .line 124
    iget-object v7, p0, Lyyds/ᛷᛳᲈᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v7, Lyyds/ᲇᲁᲀᲁ;

    .line 127
    .line 128
    if-eqz v7, :cond_4

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_4
    move-object v7, v6

    .line 132
    :goto_6
    invoke-static {v7, v2, v5}, Lyyds/ᛴᛸᛲ;->ᛲᲈᲁ(Lyyds/ᲇᲁᲀᲁ;[Lyyds/ᲇᲁᲀᲁ;I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    if-eqz v7, :cond_5

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_6
    move-object v7, v6

    .line 143
    :goto_7
    if-le v1, v3, :cond_9

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    check-cast v5, [Lyyds/ᲇᲁᲀᲁ;

    .line 150
    .line 151
    array-length v8, v5

    .line 152
    sub-int/2addr v8, v3

    .line 153
    move v9, v4

    .line 154
    :goto_8
    if-ge v9, v8, :cond_9

    .line 155
    .line 156
    sget-object v10, Lyyds/ᛳᛳᛷᛱ;->ᛵᛸᛸᛷ:Lyyds/ᲇᲁᲀᲁ;

    .line 157
    .line 158
    aput-object v10, v5, v9

    .line 159
    .line 160
    iget-object v10, p0, Lyyds/ᛷᛳᲈᛲ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v10, Lyyds/ᲇᲁᲀᲁ;

    .line 163
    .line 164
    if-eqz v10, :cond_7

    .line 165
    .line 166
    goto :goto_9

    .line 167
    :cond_7
    move-object v10, v6

    .line 168
    :goto_9
    invoke-static {v10, v5, v9}, Lyyds/ᛴᛸᛲ;->ᛲᲈᲁ(Lyyds/ᲇᲁᲀᲁ;[Lyyds/ᲇᲁᲀᲁ;I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    if-eqz v10, :cond_8

    .line 173
    .line 174
    goto :goto_a

    .line 175
    :cond_8
    add-int/lit8 v9, v9, 0x1

    .line 176
    .line 177
    goto :goto_8

    .line 178
    :cond_9
    move-object v10, v6

    .line 179
    :goto_a
    if-eqz v10, :cond_c

    .line 180
    .line 181
    sub-int/2addr v1, v3

    .line 182
    move v5, v4

    .line 183
    :goto_b
    if-ge v5, v1, :cond_c

    .line 184
    .line 185
    iget-object v8, p0, Lyyds/ᛷᛳᲈᛲ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v8, Lyyds/ᲇᲁᲀᲁ;

    .line 188
    .line 189
    if-eqz v8, :cond_a

    .line 190
    .line 191
    goto :goto_c

    .line 192
    :cond_a
    move-object v8, v6

    .line 193
    :goto_c
    invoke-static {v8, v2, v5}, Lyyds/ᛴᛸᛲ;->ᛲᲈᲁ(Lyyds/ᲇᲁᲀᲁ;[Lyyds/ᲇᲁᲀᲁ;I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    if-eqz v8, :cond_b

    .line 198
    .line 199
    goto :goto_d

    .line 200
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 201
    .line 202
    goto :goto_b

    .line 203
    :cond_c
    move-object v8, v6

    .line 204
    :goto_d
    const/16 p0, 0x2e

    .line 205
    .line 206
    if-eqz v8, :cond_d

    .line 207
    .line 208
    const-string v1, "!"

    .line 209
    .line 210
    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    new-array v2, v3, [C

    .line 215
    .line 216
    aput-char p0, v2, v4

    .line 217
    .line 218
    invoke-static {v1, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛴᛴᲁ(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    goto :goto_f

    .line 223
    :cond_d
    if-nez v7, :cond_e

    .line 224
    .line 225
    if-nez v10, :cond_e

    .line 226
    .line 227
    sget-object p0, Lyyds/ᛳᛳᛷᛱ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 228
    .line 229
    goto :goto_f

    .line 230
    :cond_e
    sget-object v1, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 231
    .line 232
    if-eqz v7, :cond_f

    .line 233
    .line 234
    new-array v2, v3, [C

    .line 235
    .line 236
    aput-char p0, v2, v4

    .line 237
    .line 238
    invoke-static {v7, v2}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛴᛴᲁ(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    goto :goto_e

    .line 243
    :cond_f
    move-object v2, v1

    .line 244
    :goto_e
    if-eqz v10, :cond_10

    .line 245
    .line 246
    new-array v1, v3, [C

    .line 247
    .line 248
    aput-char p0, v1, v4

    .line 249
    .line 250
    invoke-static {v10, v1}, Lyyds/ᛲᲇᛸᲇ;->ᛷᛴᛴᲁ(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    :cond_10
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-le p0, v5, :cond_11

    .line 263
    .line 264
    move-object p0, v2

    .line 265
    goto :goto_f

    .line 266
    :cond_11
    move-object p0, v1

    .line 267
    :goto_f
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    const/16 v5, 0x21

    .line 276
    .line 277
    if-ne v1, v2, :cond_12

    .line 278
    .line 279
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    check-cast v1, Ljava/lang/String;

    .line 284
    .line 285
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eq v1, v5, :cond_12

    .line 290
    .line 291
    return-object v6

    .line 292
    :cond_12
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    check-cast v1, Ljava/lang/String;

    .line 297
    .line 298
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-ne v1, v5, :cond_13

    .line 303
    .line 304
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 309
    .line 310
    .line 311
    move-result p0

    .line 312
    :goto_10
    sub-int/2addr v0, p0

    .line 313
    goto :goto_11

    .line 314
    :cond_13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 319
    .line 320
    .line 321
    move-result p0

    .line 322
    add-int/2addr p0, v3

    .line 323
    goto :goto_10

    .line 324
    :goto_11
    invoke-static {p1}, Lyyds/ᛳᛳᛷᛱ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/util/List;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    new-instance p1, Lyyds/ᛳᛳᲀᲀ;

    .line 329
    .line 330
    invoke-direct {p1, v3, p0}, Lyyds/ᛳᛳᲀᲀ;-><init>(ILjava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    if-ltz v0, :cond_16

    .line 334
    .line 335
    if-nez v0, :cond_14

    .line 336
    .line 337
    goto :goto_12

    .line 338
    :cond_14
    instance-of p0, p1, Lyyds/ᲇᛱᛱᛴ;

    .line 339
    .line 340
    if-eqz p0, :cond_15

    .line 341
    .line 342
    check-cast p1, Lyyds/ᲇᛱᛱᛴ;

    .line 343
    .line 344
    invoke-interface {p1, v0}, Lyyds/ᲇᛱᛱᛴ;->ᛲᲈᲁ(I)Lyyds/ᛵᲈᛴᛷ;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    goto :goto_12

    .line 349
    :cond_15
    new-instance p0, Lyyds/ᛲᛳᲁᛳ;

    .line 350
    .line 351
    invoke-direct {p0, p1, v0}, Lyyds/ᛲᛳᲁᛳ;-><init>(Lyyds/ᛵᲈᛴᛷ;I)V

    .line 352
    .line 353
    .line 354
    move-object p1, p0

    .line 355
    :goto_12
    const-string p0, "."

    .line 356
    .line 357
    invoke-static {p1, p0}, Lyyds/ᛷᛴᛳᛶ;->ᛲᛶᛱᲈ(Lyyds/ᛵᲈᛴᛷ;Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    return-object p0

    .line 362
    :cond_16
    const-string p0, "Requested element count "

    .line 363
    .line 364
    const-string p1, " is less than zero."

    .line 365
    .line 366
    invoke-static {p0, v0, p1}, Lyyds/ᛷᲈᲈᛶ;->ᛶᛷᛲᲁ(Ljava/lang/String;ILjava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    return-object v6

    .line 370
    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 371
    .line 372
    new-instance v0, Ljava/lang/StringBuilder;

    .line 373
    .line 374
    const-string v1, "Unable to load "

    .line 375
    .line 376
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    iget-object v1, p0, Lyyds/ᛷᛳᲈᛲ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v1, Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v1, " resource."

    .line 387
    .line 388
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    iget-object p0, p0, Lyyds/ᛷᛳᲈᛲ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast p0, Ljava/io/IOException;

    .line 401
    .line 402
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 403
    .line 404
    .line 405
    throw p1
.end method
