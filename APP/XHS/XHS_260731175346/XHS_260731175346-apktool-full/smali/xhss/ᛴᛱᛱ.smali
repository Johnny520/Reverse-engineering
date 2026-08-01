.class public final Lxhss/ᛴᛱᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ᛷᛴᛷᛱ:Ljava/util/logging/Logger;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᲀᛸᲀᛳ;

.field public final ᲇᛴᲇᛵ:Lxhss/ᛲᲈᛵᛶ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lxhss/ᲁᛱᛱᲇ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lxhss/ᛴᛱᛱ;->ᛷᛴᛷᛱ:Ljava/util/logging/Logger;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lxhss/ᲁᛸᛵᛳ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 5
    .line 6
    new-instance v0, Lxhss/ᲀᛸᲀᛳ;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lxhss/ᲀᛸᲀᛳ;-><init>(Lxhss/ᲁᛸᛵᛳ;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxhss/ᛴᛱᛱ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛸᲀᛳ;

    .line 12
    .line 13
    new-instance p1, Lxhss/ᛲᲈᛵᛶ;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lxhss/ᛲᲈᛵᛶ;-><init>(Lxhss/ᲀᛸᲀᛳ;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lxhss/ᛴᛱᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛲᲈᛵᛶ;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᲁᛸᛵᛳ;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛱᛱᛲᲇ(ZLxhss/ᛸᛵᛸᛶ;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    iget-object v3, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 7
    .line 8
    const-wide/16 v4, 0x9

    .line 9
    .line 10
    invoke-virtual {v3, v4, v5}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    .line 11
    .line 12
    .line 13
    iget-object v3, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 14
    .line 15
    invoke-static {v3}, Lxhss/ᛶᛸᛲ;->ᲈᛳᲀ(Lxhss/ᲁᛸᛵᛳ;)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v4, 0x4000

    .line 20
    .line 21
    if-gt v3, v4, :cond_2f

    .line 22
    .line 23
    iget-object v5, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 24
    .line 25
    invoke-virtual {v5}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    and-int/lit16 v5, v5, 0xff

    .line 30
    .line 31
    iget-object v6, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 32
    .line 33
    invoke-virtual {v6}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    and-int/lit16 v7, v6, 0xff

    .line 38
    .line 39
    iget-object v8, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 40
    .line 41
    invoke-virtual {v8}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    const v9, 0x7fffffff

    .line 46
    .line 47
    .line 48
    and-int/2addr v9, v8

    .line 49
    const/16 v10, 0x8

    .line 50
    .line 51
    const/4 v11, 0x1

    .line 52
    if-eq v5, v10, :cond_0

    .line 53
    .line 54
    sget-object v12, Lxhss/ᛴᛱᛱ;->ᛷᛴᛷᛱ:Ljava/util/logging/Logger;

    .line 55
    .line 56
    sget-object v13, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 57
    .line 58
    invoke-virtual {v12, v13}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 59
    .line 60
    .line 61
    move-result v13

    .line 62
    if-eqz v13, :cond_0

    .line 63
    .line 64
    invoke-static {v11, v9, v3, v5, v7}, Lxhss/ᲁᛱᛱᲇ;->ᛱᛱᛲᲇ(ZIIII)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v13

    .line 68
    invoke-virtual {v12, v13}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    const/4 v12, 0x4

    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    if-ne v5, v12, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 78
    .line 79
    const-string v1, "Expected a SETTINGS frame but was "

    .line 80
    .line 81
    invoke-static {v5}, Lxhss/ᲁᛱᛱᲇ;->ᛷᛵᛵᲈ(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v3, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_2
    :goto_0
    const/4 v13, 0x3

    .line 102
    const/4 v15, 0x5

    .line 103
    const/16 p1, 0xe

    .line 104
    .line 105
    const/4 v14, 0x2

    .line 106
    packed-switch v5, :pswitch_data_0

    .line 107
    .line 108
    .line 109
    iget-object v0, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 110
    .line 111
    int-to-long v1, v3

    .line 112
    invoke-virtual {v0, v1, v2}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 113
    .line 114
    .line 115
    return v11

    .line 116
    :pswitch_0
    const-string v2, "TYPE_WINDOW_UPDATE length !=4: "

    .line 117
    .line 118
    if-ne v3, v12, :cond_7

    .line 119
    .line 120
    :try_start_1
    iget-object v0, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 121
    .line 122
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 123
    .line 124
    .line 125
    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 126
    const-wide/32 v4, 0x7fffffff

    .line 127
    .line 128
    .line 129
    int-to-long v12, v0

    .line 130
    and-long/2addr v4, v12

    .line 131
    const-wide/16 v12, 0x0

    .line 132
    .line 133
    cmp-long v0, v4, v12

    .line 134
    .line 135
    if-eqz v0, :cond_6

    .line 136
    .line 137
    sget-object v2, Lxhss/ᛴᛱᛱ;->ᛷᛴᛷᛱ:Ljava/util/logging/Logger;

    .line 138
    .line 139
    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 140
    .line 141
    invoke-virtual {v2, v6}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_3

    .line 146
    .line 147
    invoke-static {v11, v9, v3, v4, v5}, Lxhss/ᲁᛱᛱᲇ;->ᛳᲁᲇᛸ(ZIIJ)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_3
    iget-object v1, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 155
    .line 156
    if-nez v9, :cond_4

    .line 157
    .line 158
    monitor-enter v1

    .line 159
    :try_start_2
    iget-wide v2, v1, Lxhss/ᲁᛲᛵ;->ᲈᛲᛵᲁ:J

    .line 160
    .line 161
    add-long/2addr v2, v4

    .line 162
    iput-wide v2, v1, Lxhss/ᲁᛲᛵ;->ᲈᛲᛵᲁ:J

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 165
    .line 166
    .line 167
    monitor-exit v1

    .line 168
    return v11

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    monitor-exit v1

    .line 171
    throw v0

    .line 172
    :cond_4
    invoke-virtual {v1, v9}, Lxhss/ᲁᛲᛵ;->ᛳᲁᲇᛸ(I)Lxhss/ᛸᛳᛴ;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_29

    .line 177
    .line 178
    monitor-enter v1

    .line 179
    :try_start_3
    iget-wide v2, v1, Lxhss/ᛸᛳᛴ;->ᲇᛶᛴᲀ:J

    .line 180
    .line 181
    add-long/2addr v2, v4

    .line 182
    iput-wide v2, v1, Lxhss/ᛸᛳᛴ;->ᲇᛶᛴᲀ:J

    .line 183
    .line 184
    if-lez v0, :cond_5

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 187
    .line 188
    .line 189
    :cond_5
    monitor-exit v1

    .line 190
    return v11

    .line 191
    :catchall_1
    move-exception v0

    .line 192
    monitor-exit v1

    .line 193
    throw v0

    .line 194
    :cond_6
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    .line 195
    .line 196
    const-string v1, "windowSizeIncrement was 0"

    .line 197
    .line 198
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :catch_0
    move-exception v0

    .line 203
    goto :goto_1

    .line 204
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 205
    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 222
    :goto_1
    sget-object v1, Lxhss/ᛴᛱᛱ;->ᛷᛴᛷᛱ:Ljava/util/logging/Logger;

    .line 223
    .line 224
    invoke-static {v11, v9, v3, v10, v7}, Lxhss/ᲁᛱᛱᲇ;->ᛱᛱᛲᲇ(ZIIII)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :pswitch_1
    if-lt v3, v10, :cond_f

    .line 233
    .line 234
    if-nez v9, :cond_e

    .line 235
    .line 236
    iget-object v4, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 237
    .line 238
    invoke-virtual {v4}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    iget-object v5, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 243
    .line 244
    invoke-virtual {v5}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    sub-int/2addr v3, v10

    .line 249
    invoke-static/range {p1 .. p1}, Lxhss/ᛴᛸᛲᛳ;->ᛲᛴᲀᲈ(I)[I

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    array-length v7, v6

    .line 254
    move v8, v2

    .line 255
    :goto_2
    if-ge v8, v7, :cond_9

    .line 256
    .line 257
    aget v9, v6, v8

    .line 258
    .line 259
    invoke-static {v9}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 260
    .line 261
    .line 262
    move-result v12

    .line 263
    if-ne v12, v5, :cond_8

    .line 264
    .line 265
    goto :goto_3

    .line 266
    :cond_8
    add-int/lit8 v8, v8, 0x1

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_9
    move v9, v2

    .line 270
    :goto_3
    if-eqz v9, :cond_d

    .line 271
    .line 272
    sget-object v5, Lxhss/ᛳᛶᲈᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛳᛶᲈᲈ;

    .line 273
    .line 274
    if-lez v3, :cond_a

    .line 275
    .line 276
    iget-object v0, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 277
    .line 278
    int-to-long v5, v3

    .line 279
    invoke-virtual {v0, v5, v6}, Lxhss/ᲁᛸᛵᛳ;->ᲀᲇᛳᲁ(J)Lxhss/ᛳᛶᲈᲈ;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    :cond_a
    invoke-virtual {v5}, Lxhss/ᛳᛶᲈᲈ;->ᛷᛵᛵᲈ()I

    .line 284
    .line 285
    .line 286
    iget-object v3, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 287
    .line 288
    monitor-enter v3

    .line 289
    :try_start_5
    iget-object v0, v3, Lxhss/ᲁᛲᛵ;->ᛳᲁᲇᛸ:Ljava/util/LinkedHashMap;

    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    new-array v5, v2, [Lxhss/ᛸᛳᛴ;

    .line 296
    .line 297
    invoke-interface {v0, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    iput-boolean v11, v3, Lxhss/ᲁᛲᛵ;->ᲀᲇᛳᲁ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 302
    .line 303
    monitor-exit v3

    .line 304
    check-cast v0, [Lxhss/ᛸᛳᛴ;

    .line 305
    .line 306
    array-length v3, v0

    .line 307
    :goto_4
    if-ge v2, v3, :cond_29

    .line 308
    .line 309
    aget-object v5, v0, v2

    .line 310
    .line 311
    iget v6, v5, Lxhss/ᛸᛳᛴ;->ᛱᛱᛲᲇ:I

    .line 312
    .line 313
    if-le v6, v4, :cond_c

    .line 314
    .line 315
    invoke-virtual {v5}, Lxhss/ᛸᛳᛴ;->ᛸᛲᲀᛵ()Z

    .line 316
    .line 317
    .line 318
    move-result v6

    .line 319
    if-eqz v6, :cond_c

    .line 320
    .line 321
    monitor-enter v5

    .line 322
    :try_start_6
    invoke-virtual {v5}, Lxhss/ᛸᛳᛴ;->ᛸᛴᛶᛳ()I

    .line 323
    .line 324
    .line 325
    move-result v6

    .line 326
    if-nez v6, :cond_b

    .line 327
    .line 328
    iput v10, v5, Lxhss/ᛸᛳᛴ;->ᛸᛶᲈᛶ:I

    .line 329
    .line 330
    invoke-virtual {v5}, Ljava/lang/Object;->notifyAll()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 331
    .line 332
    .line 333
    goto :goto_5

    .line 334
    :catchall_2
    move-exception v0

    .line 335
    goto :goto_6

    .line 336
    :cond_b
    :goto_5
    monitor-exit v5

    .line 337
    iget-object v6, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 338
    .line 339
    iget v5, v5, Lxhss/ᛸᛳᛴ;->ᛱᛱᛲᲇ:I

    .line 340
    .line 341
    invoke-virtual {v6, v5}, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ(I)Lxhss/ᛸᛳᛴ;

    .line 342
    .line 343
    .line 344
    goto :goto_7

    .line 345
    :goto_6
    monitor-exit v5

    .line 346
    throw v0

    .line 347
    :cond_c
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :catchall_3
    move-exception v0

    .line 351
    monitor-exit v3

    .line 352
    throw v0

    .line 353
    :cond_d
    const-string v0, "TYPE_GOAWAY unexpected error code: "

    .line 354
    .line 355
    invoke-static {v0, v5}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    return v2

    .line 363
    :cond_e
    const-string v0, "TYPE_GOAWAY streamId != 0"

    .line 364
    .line 365
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    return v2

    .line 369
    :cond_f
    const-string v0, "TYPE_GOAWAY length < 8: "

    .line 370
    .line 371
    invoke-static {v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    return v2

    .line 379
    :pswitch_2
    if-ne v3, v10, :cond_16

    .line 380
    .line 381
    if-nez v9, :cond_15

    .line 382
    .line 383
    iget-object v3, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 384
    .line 385
    invoke-virtual {v3}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    iget-object v0, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 390
    .line 391
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    and-int/lit8 v4, v6, 0x1

    .line 396
    .line 397
    if-eqz v4, :cond_10

    .line 398
    .line 399
    move v2, v11

    .line 400
    :cond_10
    iget-object v4, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 401
    .line 402
    if-eqz v2, :cond_14

    .line 403
    .line 404
    monitor-enter v4

    .line 405
    const-wide/16 v0, 0x1

    .line 406
    .line 407
    if-eq v3, v11, :cond_13

    .line 408
    .line 409
    if-eq v3, v14, :cond_12

    .line 410
    .line 411
    if-eq v3, v13, :cond_11

    .line 412
    .line 413
    goto :goto_8

    .line 414
    :cond_11
    :try_start_7
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V

    .line 415
    .line 416
    .line 417
    goto :goto_8

    .line 418
    :catchall_4
    move-exception v0

    .line 419
    goto :goto_9

    .line 420
    :cond_12
    iget-wide v2, v4, Lxhss/ᲁᛲᛵ;->ᛳᲈᲈᛲ:J

    .line 421
    .line 422
    add-long/2addr v2, v0

    .line 423
    iput-wide v2, v4, Lxhss/ᲁᛲᛵ;->ᛳᲈᲈᛲ:J

    .line 424
    .line 425
    goto :goto_8

    .line 426
    :cond_13
    iget-wide v2, v4, Lxhss/ᲁᛲᛵ;->ᛸᛶᲈᛶ:J

    .line 427
    .line 428
    add-long/2addr v2, v0

    .line 429
    iput-wide v2, v4, Lxhss/ᲁᛲᛵ;->ᛸᛶᲈᛶ:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 430
    .line 431
    :goto_8
    monitor-exit v4

    .line 432
    return v11

    .line 433
    :goto_9
    monitor-exit v4

    .line 434
    throw v0

    .line 435
    :cond_14
    iget-object v2, v4, Lxhss/ᲁᛲᛵ;->ᛸᛲᲀᛵ:Lxhss/ᲇᲀᲀᛷ;

    .line 436
    .line 437
    new-instance v4, Ljava/lang/StringBuilder;

    .line 438
    .line 439
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 440
    .line 441
    .line 442
    iget-object v5, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 443
    .line 444
    iget-object v5, v5, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 445
    .line 446
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    const-string v5, " ping"

    .line 450
    .line 451
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v4

    .line 458
    iget-object v1, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 459
    .line 460
    new-instance v5, Lxhss/ᲈᛸᛲᛱ;

    .line 461
    .line 462
    invoke-direct {v5, v1, v3, v0, v11}, Lxhss/ᲈᛸᛲᛱ;-><init>(Lxhss/ᲁᛲᛵ;III)V

    .line 463
    .line 464
    .line 465
    invoke-static {v2, v4, v5}, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ(Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)V

    .line 466
    .line 467
    .line 468
    return v11

    .line 469
    :cond_15
    const-string v0, "TYPE_PING streamId != 0"

    .line 470
    .line 471
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 472
    .line 473
    .line 474
    return v2

    .line 475
    :cond_16
    const-string v0, "TYPE_PING length != 8: "

    .line 476
    .line 477
    invoke-static {v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    return v2

    .line 485
    :pswitch_3
    invoke-virtual {v0, v1, v3, v7, v9}, Lxhss/ᛴᛱᛱ;->ᛸᛲᲀᛵ(Lxhss/ᛸᛵᛸᛶ;III)V

    .line 486
    .line 487
    .line 488
    return v11

    .line 489
    :pswitch_4
    iget-object v0, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 490
    .line 491
    if-nez v9, :cond_24

    .line 492
    .line 493
    and-int/lit8 v5, v6, 0x1

    .line 494
    .line 495
    if-eqz v5, :cond_18

    .line 496
    .line 497
    if-nez v3, :cond_17

    .line 498
    .line 499
    goto/16 :goto_10

    .line 500
    .line 501
    :cond_17
    const-string v0, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 502
    .line 503
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    return v2

    .line 507
    :cond_18
    rem-int/lit8 v5, v3, 0x6

    .line 508
    .line 509
    if-nez v5, :cond_23

    .line 510
    .line 511
    new-instance v5, Lxhss/ᛴᲇᛳᲇ;

    .line 512
    .line 513
    invoke-direct {v5}, Lxhss/ᛴᲇᛳᲇ;-><init>()V

    .line 514
    .line 515
    .line 516
    invoke-static {v2, v3}, Lxhss/ᛵᛵᛲᲈ;->ᛲᛴᲀᲈ(II)Lxhss/ᛱᛲᲇᲀ;

    .line 517
    .line 518
    .line 519
    move-result-object v3

    .line 520
    const/4 v6, 0x6

    .line 521
    invoke-static {v3, v6}, Lxhss/ᛵᛵᛲᲈ;->ᲈᛲᛵᲁ(Lxhss/ᛱᛲᲇᲀ;I)Lxhss/ᲁᛵᛶᲁ;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    iget v6, v3, Lxhss/ᲁᛵᛶᲁ;->ᛱᛱᛲᲇ:I

    .line 526
    .line 527
    iget v7, v3, Lxhss/ᲁᛵᛶᲁ;->ᛳᲁᲇᛸ:I

    .line 528
    .line 529
    iget v3, v3, Lxhss/ᲁᛵᛶᲁ;->ᲇᛴᲇᛵ:I

    .line 530
    .line 531
    if-lez v3, :cond_19

    .line 532
    .line 533
    if-le v6, v7, :cond_1a

    .line 534
    .line 535
    :cond_19
    if-gez v3, :cond_22

    .line 536
    .line 537
    if-gt v7, v6, :cond_22

    .line 538
    .line 539
    :cond_1a
    :goto_a
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᲈᛶ()S

    .line 540
    .line 541
    .line 542
    move-result v8

    .line 543
    sget-object v9, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 544
    .line 545
    const v9, 0xffff

    .line 546
    .line 547
    .line 548
    and-int/2addr v8, v9

    .line 549
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 550
    .line 551
    .line 552
    move-result v9

    .line 553
    if-eq v8, v14, :cond_1f

    .line 554
    .line 555
    if-eq v8, v12, :cond_1d

    .line 556
    .line 557
    if-eq v8, v15, :cond_1b

    .line 558
    .line 559
    goto :goto_b

    .line 560
    :cond_1b
    if-lt v9, v4, :cond_1c

    .line 561
    .line 562
    const v10, 0xffffff

    .line 563
    .line 564
    .line 565
    if-gt v9, v10, :cond_1c

    .line 566
    .line 567
    goto :goto_b

    .line 568
    :cond_1c
    const-string v0, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    .line 569
    .line 570
    invoke-static {v0, v9}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    return v2

    .line 578
    :cond_1d
    if-ltz v9, :cond_1e

    .line 579
    .line 580
    goto :goto_b

    .line 581
    :cond_1e
    const-string v0, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 582
    .line 583
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    return v2

    .line 587
    :cond_1f
    if-eqz v9, :cond_21

    .line 588
    .line 589
    if-ne v9, v11, :cond_20

    .line 590
    .line 591
    goto :goto_b

    .line 592
    :cond_20
    const-string v0, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 593
    .line 594
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    return v2

    .line 598
    :cond_21
    :goto_b
    invoke-virtual {v5, v8, v9}, Lxhss/ᛴᲇᛳᲇ;->ᛱᛱᛲᲇ(II)V

    .line 599
    .line 600
    .line 601
    if-eq v6, v7, :cond_22

    .line 602
    .line 603
    add-int/2addr v6, v3

    .line 604
    goto :goto_a

    .line 605
    :cond_22
    iget-object v0, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 606
    .line 607
    iget-object v2, v0, Lxhss/ᲁᛲᛵ;->ᛸᛲᲀᛵ:Lxhss/ᲇᲀᲀᛷ;

    .line 608
    .line 609
    new-instance v3, Ljava/lang/StringBuilder;

    .line 610
    .line 611
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 612
    .line 613
    .line 614
    iget-object v0, v0, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 615
    .line 616
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    const-string v0, " applyAndAckSettings"

    .line 620
    .line 621
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    new-instance v3, Lxhss/ᛱᲀᲇᛸ;

    .line 629
    .line 630
    invoke-direct {v3, v13, v1, v5}, Lxhss/ᛱᲀᲇᛸ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    invoke-static {v2, v0, v3}, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ(Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)V

    .line 634
    .line 635
    .line 636
    return v11

    .line 637
    :cond_23
    const-string v0, "TYPE_SETTINGS length % 6 != 0: "

    .line 638
    .line 639
    invoke-static {v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    return v2

    .line 647
    :cond_24
    const-string v0, "TYPE_SETTINGS streamId != 0"

    .line 648
    .line 649
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    return v2

    .line 653
    :pswitch_5
    if-ne v3, v12, :cond_2c

    .line 654
    .line 655
    if-eqz v9, :cond_2b

    .line 656
    .line 657
    iget-object v0, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 658
    .line 659
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    invoke-static/range {p1 .. p1}, Lxhss/ᛴᛸᛲᛳ;->ᛲᛴᲀᲈ(I)[I

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    array-length v4, v3

    .line 668
    move v5, v2

    .line 669
    :goto_c
    if-ge v5, v4, :cond_26

    .line 670
    .line 671
    aget v6, v3, v5

    .line 672
    .line 673
    invoke-static {v6}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 674
    .line 675
    .line 676
    move-result v7

    .line 677
    if-ne v7, v0, :cond_25

    .line 678
    .line 679
    goto :goto_d

    .line 680
    :cond_25
    add-int/lit8 v5, v5, 0x1

    .line 681
    .line 682
    goto :goto_c

    .line 683
    :cond_26
    move v6, v2

    .line 684
    :goto_d
    if-eqz v6, :cond_2a

    .line 685
    .line 686
    iget-object v0, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 687
    .line 688
    if-eqz v9, :cond_27

    .line 689
    .line 690
    and-int/lit8 v1, v8, 0x1

    .line 691
    .line 692
    if-nez v1, :cond_27

    .line 693
    .line 694
    iget-object v1, v0, Lxhss/ᲁᛲᛵ;->ᛸᛷᲈᲈ:Lxhss/ᲇᲀᲀᛷ;

    .line 695
    .line 696
    new-instance v2, Ljava/lang/StringBuilder;

    .line 697
    .line 698
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 699
    .line 700
    .line 701
    iget-object v3, v0, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 702
    .line 703
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    .line 705
    .line 706
    const/16 v3, 0x5b

    .line 707
    .line 708
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    const-string v3, "] onReset"

    .line 715
    .line 716
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    new-instance v3, Lxhss/ᛱᛸᲈᛶ;

    .line 724
    .line 725
    invoke-direct {v3, v0, v9, v6}, Lxhss/ᛱᛸᲈᛶ;-><init>(Lxhss/ᲁᛲᛵ;II)V

    .line 726
    .line 727
    .line 728
    invoke-static {v1, v2, v3}, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ(Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)V

    .line 729
    .line 730
    .line 731
    return v11

    .line 732
    :cond_27
    invoke-virtual {v0, v9}, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ(I)Lxhss/ᛸᛳᛴ;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    if-eqz v1, :cond_29

    .line 737
    .line 738
    monitor-enter v1

    .line 739
    :try_start_8
    invoke-virtual {v1}, Lxhss/ᛸᛳᛴ;->ᛸᛴᛶᛳ()I

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    if-nez v0, :cond_28

    .line 744
    .line 745
    iput v6, v1, Lxhss/ᛸᛳᛴ;->ᛸᛶᲈᛶ:I

    .line 746
    .line 747
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 748
    .line 749
    .line 750
    goto :goto_e

    .line 751
    :catchall_5
    move-exception v0

    .line 752
    goto :goto_f

    .line 753
    :cond_28
    :goto_e
    monitor-exit v1

    .line 754
    return v11

    .line 755
    :goto_f
    monitor-exit v1

    .line 756
    throw v0

    .line 757
    :cond_29
    :goto_10
    return v11

    .line 758
    :cond_2a
    const-string v1, "TYPE_RST_STREAM unexpected error code: "

    .line 759
    .line 760
    invoke-static {v1, v0}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 765
    .line 766
    .line 767
    return v2

    .line 768
    :cond_2b
    const-string v0, "TYPE_RST_STREAM streamId == 0"

    .line 769
    .line 770
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    return v2

    .line 774
    :cond_2c
    new-instance v0, Ljava/io/IOException;

    .line 775
    .line 776
    new-instance v1, Ljava/lang/StringBuilder;

    .line 777
    .line 778
    const-string v2, "TYPE_RST_STREAM length: "

    .line 779
    .line 780
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 784
    .line 785
    .line 786
    const-string v2, " != 4"

    .line 787
    .line 788
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 789
    .line 790
    .line 791
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    throw v0

    .line 799
    :pswitch_6
    if-ne v3, v15, :cond_2e

    .line 800
    .line 801
    if-eqz v9, :cond_2d

    .line 802
    .line 803
    iget-object v0, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 804
    .line 805
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 806
    .line 807
    .line 808
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 809
    .line 810
    .line 811
    return v11

    .line 812
    :cond_2d
    const-string v0, "TYPE_PRIORITY streamId == 0"

    .line 813
    .line 814
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    return v2

    .line 818
    :cond_2e
    new-instance v0, Ljava/io/IOException;

    .line 819
    .line 820
    new-instance v1, Ljava/lang/StringBuilder;

    .line 821
    .line 822
    const-string v2, "TYPE_PRIORITY length: "

    .line 823
    .line 824
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    const-string v2, " != 5"

    .line 831
    .line 832
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    throw v0

    .line 843
    :pswitch_7
    invoke-virtual {v0, v1, v3, v7, v9}, Lxhss/ᛴᛱᛱ;->ᲀᲇᛳᲁ(Lxhss/ᛸᛵᛸᛶ;III)V

    .line 844
    .line 845
    .line 846
    return v11

    .line 847
    :pswitch_8
    invoke-virtual {v0, v1, v3, v7, v9}, Lxhss/ᛴᛱᛱ;->ᛳᲁᲇᛸ(Lxhss/ᛸᛵᛸᛶ;III)V

    .line 848
    .line 849
    .line 850
    return v11

    .line 851
    :cond_2f
    const-string v0, "FRAME_SIZE_ERROR: "

    .line 852
    .line 853
    invoke-static {v0, v3}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    :catch_1
    return v2

    .line 861
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᛵᛸᛶ;III)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    if-eqz v3, :cond_f

    .line 10
    .line 11
    and-int/lit8 v4, v2, 0x1

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    move v4, v6

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v4, v6

    .line 19
    const/4 v6, 0x0

    .line 20
    :goto_0
    and-int/lit8 v7, v2, 0x20

    .line 21
    .line 22
    if-nez v7, :cond_e

    .line 23
    .line 24
    and-int/lit8 v7, v2, 0x8

    .line 25
    .line 26
    if-eqz v7, :cond_1

    .line 27
    .line 28
    iget-object v7, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 29
    .line 30
    invoke-virtual {v7}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    sget-object v8, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 35
    .line 36
    and-int/lit16 v7, v7, 0xff

    .line 37
    .line 38
    :goto_1
    move/from16 v8, p2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const/4 v7, 0x0

    .line 42
    goto :goto_1

    .line 43
    :goto_2
    invoke-static {v8, v2, v7}, Lxhss/ᛵᛶᲀᲇ;->ᲇᛶᛴᲀ(III)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget-object v8, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 48
    .line 49
    iget-object v9, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    and-int/lit8 v10, v3, 0x1

    .line 54
    .line 55
    if-nez v10, :cond_2

    .line 56
    .line 57
    move v10, v4

    .line 58
    goto :goto_3

    .line 59
    :cond_2
    const/4 v10, 0x0

    .line 60
    :goto_3
    if-eqz v10, :cond_3

    .line 61
    .line 62
    new-instance v4, Lxhss/ᛴᛲᛴᛶ;

    .line 63
    .line 64
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    int-to-long v10, v2

    .line 68
    invoke-virtual {v8, v10, v11}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8, v10, v11, v4}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 72
    .line 73
    .line 74
    iget-object v8, v9, Lxhss/ᲁᛲᛵ;->ᛸᛷᲈᲈ:Lxhss/ᲇᲀᲀᛷ;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v5, v9, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const/16 v5, 0x5b

    .line 87
    .line 88
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v5, "] onData"

    .line 95
    .line 96
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    new-instance v1, Lxhss/ᲈᛲᲈᛶ;

    .line 104
    .line 105
    move v5, v2

    .line 106
    move-object v2, v9

    .line 107
    invoke-direct/range {v1 .. v6}, Lxhss/ᲈᛲᲈᛶ;-><init>(Lxhss/ᲁᛲᛵ;ILxhss/ᛴᛲᛴᛶ;IZ)V

    .line 108
    .line 109
    .line 110
    invoke-static {v8, v10, v1}, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ(Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_a

    .line 114
    .line 115
    :cond_3
    invoke-virtual {v9, v3}, Lxhss/ᲁᛲᛵ;->ᛳᲁᲇᛸ(I)Lxhss/ᛸᛳᛴ;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    if-nez v9, :cond_4

    .line 120
    .line 121
    iget-object v4, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 122
    .line 123
    const/4 v5, 0x2

    .line 124
    invoke-virtual {v4, v3, v5}, Lxhss/ᲁᛲᛵ;->ᛸᛶᲈᛶ(II)V

    .line 125
    .line 126
    .line 127
    iget-object v1, v1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 128
    .line 129
    int-to-long v2, v2

    .line 130
    invoke-virtual {v1, v2, v3}, Lxhss/ᲁᛲᛵ;->ᛸᛲᲀᛵ(J)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8, v2, v3}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 134
    .line 135
    .line 136
    goto/16 :goto_a

    .line 137
    .line 138
    :cond_4
    sget-object v1, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 139
    .line 140
    iget-object v1, v9, Lxhss/ᛸᛳᛴ;->ᛸᛲᲀᛵ:Lxhss/ᛱᲀᲇᛳ;

    .line 141
    .line 142
    int-to-long v2, v2

    .line 143
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-wide v10, v2

    .line 147
    :goto_4
    const-wide/16 v12, 0x0

    .line 148
    .line 149
    cmp-long v14, v10, v12

    .line 150
    .line 151
    iget-object v15, v1, Lxhss/ᛱᲀᲇᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛸᛳᛴ;

    .line 152
    .line 153
    if-lez v14, :cond_c

    .line 154
    .line 155
    monitor-enter v15

    .line 156
    :try_start_0
    iget-boolean v14, v1, Lxhss/ᛱᲀᲇᛳ;->ᛳᲁᲇᛸ:Z

    .line 157
    .line 158
    iget-object v5, v1, Lxhss/ᛱᲀᲇᛳ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛲᛴᛶ;

    .line 159
    .line 160
    move-wide/from16 p1, v12

    .line 161
    .line 162
    iget-wide v12, v5, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 163
    .line 164
    add-long/2addr v12, v10

    .line 165
    iget-wide v4, v1, Lxhss/ᛱᲀᲇᛳ;->ᛱᛱᛲᲇ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 166
    .line 167
    cmp-long v4, v12, v4

    .line 168
    .line 169
    if-lez v4, :cond_5

    .line 170
    .line 171
    const/4 v4, 0x1

    .line 172
    goto :goto_5

    .line 173
    :cond_5
    const/4 v4, 0x0

    .line 174
    :goto_5
    monitor-exit v15

    .line 175
    if-eqz v4, :cond_6

    .line 176
    .line 177
    invoke-virtual {v8, v10, v11}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 178
    .line 179
    .line 180
    iget-object v1, v1, Lxhss/ᛱᲀᲇᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛸᛳᛴ;

    .line 181
    .line 182
    const/4 v2, 0x4

    .line 183
    invoke-virtual {v1, v2}, Lxhss/ᛸᛳᛴ;->ᲀᲇᛳᲁ(I)V

    .line 184
    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_6
    if-eqz v14, :cond_7

    .line 188
    .line 189
    invoke-virtual {v8, v10, v11}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 190
    .line 191
    .line 192
    goto :goto_9

    .line 193
    :cond_7
    iget-object v4, v1, Lxhss/ᛱᲀᲇᛳ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛲᛴᛶ;

    .line 194
    .line 195
    invoke-virtual {v8, v10, v11, v4}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v4

    .line 199
    const-wide/16 v12, -0x1

    .line 200
    .line 201
    cmp-long v12, v4, v12

    .line 202
    .line 203
    if-eqz v12, :cond_b

    .line 204
    .line 205
    sub-long/2addr v10, v4

    .line 206
    iget-object v4, v1, Lxhss/ᛱᲀᲇᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛸᛳᛴ;

    .line 207
    .line 208
    monitor-enter v4

    .line 209
    :try_start_1
    iget-boolean v5, v1, Lxhss/ᛱᲀᲇᛳ;->ᲇᛶᛴᲀ:Z

    .line 210
    .line 211
    if-eqz v5, :cond_8

    .line 212
    .line 213
    iget-object v5, v1, Lxhss/ᛱᲀᲇᛳ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛲᛴᛶ;

    .line 214
    .line 215
    iget-wide v12, v5, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 216
    .line 217
    invoke-virtual {v5, v12, v13}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᛴᲈ(J)V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :catchall_0
    move-exception v0

    .line 222
    goto :goto_8

    .line 223
    :cond_8
    iget-object v5, v1, Lxhss/ᛱᲀᲇᛳ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛲᛴᛶ;

    .line 224
    .line 225
    iget-wide v12, v5, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 226
    .line 227
    cmp-long v12, v12, p1

    .line 228
    .line 229
    if-nez v12, :cond_9

    .line 230
    .line 231
    const/4 v12, 0x1

    .line 232
    goto :goto_6

    .line 233
    :cond_9
    const/4 v12, 0x0

    .line 234
    :goto_6
    iget-object v13, v1, Lxhss/ᛱᲀᲇᛳ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛲᛴᛶ;

    .line 235
    .line 236
    invoke-virtual {v5, v13}, Lxhss/ᛴᛲᛴᛶ;->ᲈᛲᛵᲁ(Lxhss/ᲇᲁᲀᲇ;)V

    .line 237
    .line 238
    .line 239
    if-eqz v12, :cond_a

    .line 240
    .line 241
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 242
    .line 243
    .line 244
    :cond_a
    :goto_7
    monitor-exit v4

    .line 245
    const/4 v4, 0x1

    .line 246
    goto :goto_4

    .line 247
    :goto_8
    monitor-exit v4

    .line 248
    throw v0

    .line 249
    :cond_b
    new-instance v0, Ljava/io/EOFException;

    .line 250
    .line 251
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 252
    .line 253
    .line 254
    throw v0

    .line 255
    :catchall_1
    move-exception v0

    .line 256
    monitor-exit v15

    .line 257
    throw v0

    .line 258
    :cond_c
    sget-object v4, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 259
    .line 260
    iget-object v4, v15, Lxhss/ᛸᛳᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 261
    .line 262
    invoke-virtual {v4, v2, v3}, Lxhss/ᲁᛲᛵ;->ᛸᛲᲀᛵ(J)V

    .line 263
    .line 264
    .line 265
    iget-object v1, v1, Lxhss/ᛱᲀᲇᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛸᛳᛴ;

    .line 266
    .line 267
    iget-object v1, v1, Lxhss/ᛸᛳᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 268
    .line 269
    iget-object v1, v1, Lxhss/ᲁᛲᛵ;->ᛸᛶᛴᲈ:Lxhss/ᛵᛷᛷᲀ;

    .line 270
    .line 271
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    :goto_9
    if-eqz v6, :cond_d

    .line 275
    .line 276
    sget-object v1, Lxhss/ᲁᛸᛱᛵ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛸᛱᛵ;

    .line 277
    .line 278
    const/4 v4, 0x1

    .line 279
    invoke-virtual {v9, v1, v4}, Lxhss/ᛸᛳᛴ;->ᲈᛳᲀ(Lxhss/ᲁᛸᛱᛵ;Z)V

    .line 280
    .line 281
    .line 282
    :cond_d
    :goto_a
    iget-object v0, v0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 283
    .line 284
    int-to-long v1, v7

    .line 285
    invoke-virtual {v0, v1, v2}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :cond_e
    const-string v0, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 290
    .line 291
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_f
    const-string v0, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    .line 296
    .line 297
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-void
.end method

.method public final ᛸᛲᲀᛵ(Lxhss/ᛸᛵᛸᛶ;III)V
    .locals 3

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x8

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 8
    .line 9
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 14
    .line 15
    and-int/lit16 v0, v0, 0xff

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    iget-object v1, p0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 20
    .line 21
    invoke-virtual {v1}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const v2, 0x7fffffff

    .line 26
    .line 27
    .line 28
    and-int/2addr v1, v2

    .line 29
    add-int/lit8 p2, p2, -0x4

    .line 30
    .line 31
    invoke-static {p2, p3, v0}, Lxhss/ᛵᛶᲀᲇ;->ᲇᛶᛴᲀ(III)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p0, p2, v0, p3, p4}, Lxhss/ᛴᛱᛱ;->ᲇᛴᲇᛵ(IIII)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p1, p1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 40
    .line 41
    monitor-enter p1

    .line 42
    :try_start_0
    iget-object p2, p1, Lxhss/ᲁᛲᛵ;->ᛲᛴᲀᲈ:Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    if-eqz p2, :cond_1

    .line 53
    .line 54
    const/4 p0, 0x2

    .line 55
    invoke-virtual {p1, v1, p0}, Lxhss/ᲁᛲᛵ;->ᛸᛶᲈᛶ(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    monitor-exit p1

    .line 59
    return-void

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    :try_start_1
    iget-object p2, p1, Lxhss/ᲁᛲᛵ;->ᛲᛴᲀᲈ:Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-interface {p2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    monitor-exit p1

    .line 72
    iget-object p2, p1, Lxhss/ᲁᛲᛵ;->ᛸᛷᲈᲈ:Lxhss/ᲇᲀᲀᛷ;

    .line 73
    .line 74
    new-instance p3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object p4, p1, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const/16 p4, 0x5b

    .line 85
    .line 86
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p4, "] onRequest"

    .line 93
    .line 94
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    new-instance p4, Lxhss/ᛱᛸᲈᛶ;

    .line 102
    .line 103
    invoke-direct {p4, p1, v1, p0}, Lxhss/ᛱᛸᲈᛶ;-><init>(Lxhss/ᲁᛲᛵ;ILjava/util/List;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p2, p3, p4}, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ(Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :goto_1
    monitor-exit p1

    .line 111
    throw p0

    .line 112
    :cond_2
    const-string p0, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 113
    .line 114
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final ᲀᲇᛳᲁ(Lxhss/ᛸᛵᛸᛶ;III)V
    .locals 9

    .line 1
    if-eqz p4, :cond_9

    .line 2
    .line 3
    and-int/lit8 v0, p3, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move v7, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v7, v1

    .line 12
    :goto_0
    and-int/lit8 v0, p3, 0x8

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 17
    .line 18
    invoke-virtual {v0}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-object v3, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 23
    .line 24
    and-int/lit16 v0, v0, 0xff

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v0, v1

    .line 28
    :goto_1
    and-int/lit8 v3, p3, 0x20

    .line 29
    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    iget-object v3, p0, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ:Lxhss/ᲁᛸᛵᛳ;

    .line 33
    .line 34
    invoke-virtual {v3}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛲᲀᛵ()I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 38
    .line 39
    .line 40
    sget-object v3, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 41
    .line 42
    add-int/lit8 p2, p2, -0x5

    .line 43
    .line 44
    :cond_2
    invoke-static {p2, p3, v0}, Lxhss/ᛵᛶᲀᲇ;->ᲇᛶᛴᲀ(III)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p0, p2, v0, p3, p4}, Lxhss/ᛴᛱᛱ;->ᲇᛴᲇᛵ(IIII)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object v5, p1, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 53
    .line 54
    if-eqz p4, :cond_3

    .line 55
    .line 56
    and-int/lit8 p1, p4, 0x1

    .line 57
    .line 58
    if-nez p1, :cond_3

    .line 59
    .line 60
    move v1, v2

    .line 61
    :cond_3
    const/16 p1, 0x5b

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    iget-object p2, v5, Lxhss/ᲁᛲᛵ;->ᛸᛷᲈᲈ:Lxhss/ᲇᲀᲀᛷ;

    .line 66
    .line 67
    new-instance p3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object v0, v5, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p1, "] onHeaders"

    .line 84
    .line 85
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    new-instance p3, Lxhss/ᛱᛸᲈᛶ;

    .line 93
    .line 94
    invoke-direct {p3, v5, p4, p0, v7}, Lxhss/ᛱᛸᲈᛶ;-><init>(Lxhss/ᲁᛲᛵ;ILjava/util/List;Z)V

    .line 95
    .line 96
    .line 97
    invoke-static {p2, p1, p3}, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ(Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    monitor-enter v5

    .line 102
    :try_start_0
    invoke-virtual {v5, p4}, Lxhss/ᲁᛲᛵ;->ᛳᲁᲇᛸ(I)Lxhss/ᛸᛳᛴ;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    if-nez p2, :cond_8

    .line 107
    .line 108
    iget-boolean p2, v5, Lxhss/ᲁᛲᛵ;->ᲀᲇᛳᲁ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    .line 110
    if-eqz p2, :cond_5

    .line 111
    .line 112
    monitor-exit v5

    .line 113
    return-void

    .line 114
    :cond_5
    :try_start_1
    iget p2, v5, Lxhss/ᲁᛲᛵ;->ᛷᛴᛷᛱ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    if-gt p4, p2, :cond_6

    .line 117
    .line 118
    monitor-exit v5

    .line 119
    return-void

    .line 120
    :cond_6
    :try_start_2
    rem-int/lit8 p2, p4, 0x2

    .line 121
    .line 122
    iget p3, v5, Lxhss/ᲁᛲᛵ;->ᲇᛶᛴᲀ:I

    .line 123
    .line 124
    const/4 v0, 0x2

    .line 125
    rem-int/2addr p3, v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    if-ne p2, p3, :cond_7

    .line 127
    .line 128
    monitor-exit v5

    .line 129
    return-void

    .line 130
    :cond_7
    :try_start_3
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᲀᲇᛳᲁ(Ljava/util/List;)Lxhss/ᲁᛸᛱᛵ;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    new-instance v3, Lxhss/ᛸᛳᛴ;

    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    move v4, p4

    .line 138
    invoke-direct/range {v3 .. v8}, Lxhss/ᛸᛳᛴ;-><init>(ILxhss/ᲁᛲᛵ;ZZLxhss/ᲁᛸᛱᛵ;)V

    .line 139
    .line 140
    .line 141
    iput v4, v5, Lxhss/ᲁᛲᛵ;->ᛷᛴᛷᛱ:I

    .line 142
    .line 143
    iget-object p0, v5, Lxhss/ᲁᛲᛵ;->ᛳᲁᲇᛸ:Ljava/util/LinkedHashMap;

    .line 144
    .line 145
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    invoke-interface {p0, p2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    iget-object p0, v5, Lxhss/ᲁᛲᛵ;->ᛸᛴᛶᛳ:Lxhss/ᛸᛱᛴᛳ;

    .line 153
    .line 154
    invoke-virtual {p0}, Lxhss/ᛸᛱᛴᛳ;->ᲇᛴᲇᛵ()Lxhss/ᲇᲀᲀᛷ;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    new-instance p2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    iget-object p3, v5, Lxhss/ᲁᛲᛵ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 164
    .line 165
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string p1, "] onStream"

    .line 175
    .line 176
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    new-instance p2, Lxhss/ᛱᲀᲇᛸ;

    .line 184
    .line 185
    invoke-direct {p2, v0, v5, v3}, Lxhss/ᛱᲀᲇᛸ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-static {p0, p1, p2}, Lxhss/ᲇᲀᲀᛷ;->ᛱᛱᛲᲇ(Lxhss/ᲇᲀᲀᛷ;Ljava/lang/String;Lxhss/ᛱᛳᲇᛶ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 189
    .line 190
    .line 191
    monitor-exit v5

    .line 192
    return-void

    .line 193
    :catchall_0
    move-exception v0

    .line 194
    move-object p0, v0

    .line 195
    goto :goto_2

    .line 196
    :cond_8
    monitor-exit v5

    .line 197
    invoke-static {p0}, Lxhss/ᛶᛴᲀᛲ;->ᲀᲇᛳᲁ(Ljava/util/List;)Lxhss/ᲁᛸᛱᛵ;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-virtual {p2, p0, v7}, Lxhss/ᛸᛳᛴ;->ᲈᛳᲀ(Lxhss/ᲁᛸᛱᛵ;Z)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :goto_2
    monitor-exit v5

    .line 206
    throw p0

    .line 207
    :cond_9
    const-string p0, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 208
    .line 209
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-void
.end method

.method public final ᲇᛴᲇᛵ(IIII)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛱᛱ;->ᛳᲁᲇᛸ:Lxhss/ᲀᛸᲀᛳ;

    .line 2
    .line 3
    iput p1, v0, Lxhss/ᲀᛸᲀᛳ;->ᛷᛴᛷᛱ:I

    .line 4
    .line 5
    iput p2, v0, Lxhss/ᲀᛸᲀᛳ;->ᲇᛶᛴᲀ:I

    .line 6
    .line 7
    iput p3, v0, Lxhss/ᲀᛸᲀᛳ;->ᛳᲁᲇᛸ:I

    .line 8
    .line 9
    iput p4, v0, Lxhss/ᲀᛸᲀᛳ;->ᲇᛴᲇᛵ:I

    .line 10
    .line 11
    iget-object p0, p0, Lxhss/ᛴᛱᛱ;->ᲇᛴᲇᛵ:Lxhss/ᛲᲈᛵᛶ;

    .line 12
    .line 13
    iget-object p1, p0, Lxhss/ᛲᲈᛵᛶ;->ᲇᛴᲇᛵ:Lxhss/ᲁᛸᛵᛳ;

    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_c

    .line 20
    .line 21
    invoke-virtual {p1}, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ()B

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    sget-object p3, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ:[B

    .line 26
    .line 27
    and-int/lit16 p3, p2, 0xff

    .line 28
    .line 29
    const/4 p4, 0x0

    .line 30
    const/16 v0, 0x80

    .line 31
    .line 32
    if-eq p3, v0, :cond_b

    .line 33
    .line 34
    and-int/lit16 v1, p2, 0x80

    .line 35
    .line 36
    if-ne v1, v0, :cond_3

    .line 37
    .line 38
    const/16 p2, 0x7f

    .line 39
    .line 40
    invoke-virtual {p0, p3, p2}, Lxhss/ᛲᲈᛵᛶ;->ᲇᛶᛴᲀ(II)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    add-int/lit8 p3, p2, -0x1

    .line 45
    .line 46
    if-ltz p3, :cond_1

    .line 47
    .line 48
    sget-object v0, Lxhss/ᲀᲁᛸᲀ;->ᛷᛵᛵᲈ:[Lxhss/ᛱᛵᲀᛱ;

    .line 49
    .line 50
    array-length v1, v0

    .line 51
    add-int/lit8 v1, v1, -0x1

    .line 52
    .line 53
    if-gt p3, v1, :cond_1

    .line 54
    .line 55
    aget-object p2, v0, p3

    .line 56
    .line 57
    invoke-virtual {p0, p2}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛵᛵᲈ(Lxhss/ᛱᛵᲀᛱ;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    sget-object v0, Lxhss/ᲀᲁᛸᲀ;->ᛷᛵᛵᲈ:[Lxhss/ᛱᛵᲀᛱ;

    .line 62
    .line 63
    array-length v0, v0

    .line 64
    sub-int/2addr p3, v0

    .line 65
    iget v0, p0, Lxhss/ᛲᲈᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 66
    .line 67
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    add-int/2addr v0, p3

    .line 70
    if-ltz v0, :cond_2

    .line 71
    .line 72
    iget-object p3, p0, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ:[Lxhss/ᛱᛵᲀᛱ;

    .line 73
    .line 74
    array-length v1, p3

    .line 75
    if-ge v0, v1, :cond_2

    .line 76
    .line 77
    aget-object p2, p3, v0

    .line 78
    .line 79
    invoke-virtual {p0, p2}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛵᛵᲈ(Lxhss/ᛱᛵᲀᛱ;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const-string p0, "Header index too large "

    .line 84
    .line 85
    invoke-static {p0, p2}, Lxhss/ᛴᛸᛲᛳ;->ᛶᲇᲈᛸ(Ljava/lang/String;I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object p4

    .line 93
    :cond_3
    const/16 v0, 0x40

    .line 94
    .line 95
    if-ne p3, v0, :cond_4

    .line 96
    .line 97
    sget-object p2, Lxhss/ᲀᲁᛸᲀ;->ᛷᛵᛵᲈ:[Lxhss/ᛱᛵᲀᛱ;

    .line 98
    .line 99
    invoke-virtual {p0}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ()Lxhss/ᛳᛶᲈᲈ;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Lxhss/ᲀᲁᛸᲀ;->ᛷᛵᛵᲈ(Lxhss/ᛳᛶᲈᲈ;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ()Lxhss/ᛳᛶᲈᲈ;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    new-instance p4, Lxhss/ᛱᛵᲀᛱ;

    .line 111
    .line 112
    invoke-direct {p4, p2, p3}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Lxhss/ᛳᛶᲈᲈ;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p4}, Lxhss/ᛲᲈᛵᛶ;->ᲇᛴᲇᛵ(Lxhss/ᛱᛵᲀᛱ;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    and-int/lit8 v1, p2, 0x40

    .line 120
    .line 121
    if-ne v1, v0, :cond_5

    .line 122
    .line 123
    const/16 p2, 0x3f

    .line 124
    .line 125
    invoke-virtual {p0, p3, p2}, Lxhss/ᛲᲈᛵᛶ;->ᲇᛶᛴᲀ(II)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    add-int/lit8 p2, p2, -0x1

    .line 130
    .line 131
    invoke-virtual {p0, p2}, Lxhss/ᛲᲈᛵᛶ;->ᛳᲁᲇᛸ(I)Lxhss/ᛳᛶᲈᲈ;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p0}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ()Lxhss/ᛳᛶᲈᲈ;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    new-instance p4, Lxhss/ᛱᛵᲀᛱ;

    .line 140
    .line 141
    invoke-direct {p4, p2, p3}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Lxhss/ᛳᛶᲈᲈ;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p4}, Lxhss/ᛲᲈᛵᛶ;->ᲇᛴᲇᛵ(Lxhss/ᛱᛵᲀᛱ;)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_5
    and-int/lit8 p2, p2, 0x20

    .line 150
    .line 151
    const/16 v0, 0x20

    .line 152
    .line 153
    if-ne p2, v0, :cond_8

    .line 154
    .line 155
    const/16 p2, 0x1f

    .line 156
    .line 157
    invoke-virtual {p0, p3, p2}, Lxhss/ᛲᲈᛵᛶ;->ᲇᛶᛴᲀ(II)I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    iput p2, p0, Lxhss/ᛲᲈᛵᛶ;->ᛷᛵᛵᲈ:I

    .line 162
    .line 163
    if-ltz p2, :cond_7

    .line 164
    .line 165
    const/16 p3, 0x1000

    .line 166
    .line 167
    if-gt p2, p3, :cond_7

    .line 168
    .line 169
    iget p3, p0, Lxhss/ᛲᲈᛵᛶ;->ᛸᛴᛶᛳ:I

    .line 170
    .line 171
    if-ge p2, p3, :cond_0

    .line 172
    .line 173
    if-nez p2, :cond_6

    .line 174
    .line 175
    iget-object p2, p0, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ:[Lxhss/ᛱᛵᲀᛱ;

    .line 176
    .line 177
    array-length p3, p2

    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-static {p2, v0, p3, p4}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-object p2, p0, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ:[Lxhss/ᛱᛵᲀᛱ;

    .line 183
    .line 184
    array-length p2, p2

    .line 185
    add-int/lit8 p2, p2, -0x1

    .line 186
    .line 187
    iput p2, p0, Lxhss/ᛲᲈᛵᛶ;->ᲇᛶᛴᲀ:I

    .line 188
    .line 189
    iput v0, p0, Lxhss/ᛲᲈᛵᛶ;->ᲀᲇᛳᲁ:I

    .line 190
    .line 191
    iput v0, p0, Lxhss/ᛲᲈᛵᛶ;->ᛸᛴᛶᛳ:I

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_6
    sub-int/2addr p3, p2

    .line 196
    invoke-virtual {p0, p3}, Lxhss/ᛲᲈᛵᛶ;->ᛱᛱᛲᲇ(I)I

    .line 197
    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_7
    new-instance p1, Ljava/io/IOException;

    .line 202
    .line 203
    iget p0, p0, Lxhss/ᛲᲈᛵᛶ;->ᛷᛵᛵᲈ:I

    .line 204
    .line 205
    new-instance p2, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string p3, "Invalid dynamic table size update "

    .line 208
    .line 209
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    throw p1

    .line 223
    :cond_8
    const/16 p2, 0x10

    .line 224
    .line 225
    if-eq p3, p2, :cond_a

    .line 226
    .line 227
    if-nez p3, :cond_9

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_9
    const/16 p2, 0xf

    .line 231
    .line 232
    invoke-virtual {p0, p3, p2}, Lxhss/ᛲᲈᛵᛶ;->ᲇᛶᛴᲀ(II)I

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    add-int/lit8 p2, p2, -0x1

    .line 237
    .line 238
    invoke-virtual {p0, p2}, Lxhss/ᛲᲈᛵᛶ;->ᛳᲁᲇᛸ(I)Lxhss/ᛳᛶᲈᲈ;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-virtual {p0}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ()Lxhss/ᛳᛶᲈᲈ;

    .line 243
    .line 244
    .line 245
    move-result-object p3

    .line 246
    new-instance p4, Lxhss/ᛱᛵᲀᛱ;

    .line 247
    .line 248
    invoke-direct {p4, p2, p3}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Lxhss/ᛳᛶᲈᲈ;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, p4}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛵᛵᲈ(Lxhss/ᛱᛵᲀᛱ;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_a
    :goto_1
    sget-object p2, Lxhss/ᲀᲁᛸᲀ;->ᛷᛵᛵᲈ:[Lxhss/ᛱᛵᲀᛱ;

    .line 257
    .line 258
    invoke-virtual {p0}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ()Lxhss/ᛳᛶᲈᲈ;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-static {p2}, Lxhss/ᲀᲁᛸᲀ;->ᛷᛵᛵᲈ(Lxhss/ᛳᛶᲈᲈ;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛴᛷᛱ()Lxhss/ᛳᛶᲈᲈ;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    new-instance p4, Lxhss/ᛱᛵᲀᛱ;

    .line 270
    .line 271
    invoke-direct {p4, p2, p3}, Lxhss/ᛱᛵᲀᛱ;-><init>(Lxhss/ᛳᛶᲈᲈ;Lxhss/ᛳᛶᲈᲈ;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, p4}, Lxhss/ᛲᲈᛵᛶ;->ᛷᛵᛵᲈ(Lxhss/ᛱᛵᲀᛱ;)V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :cond_b
    const-string p0, "index == 0"

    .line 280
    .line 281
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-object p4

    .line 285
    :cond_c
    iget-object p1, p0, Lxhss/ᛲᲈᛵᛶ;->ᛱᛱᛲᲇ:Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-static {p1}, Lxhss/ᛷᲇᛵᛳ;->ᛴᲈᲀᲀ(Ljava/util/Collection;)Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 292
    .line 293
    .line 294
    const-wide/16 p3, 0x0

    .line 295
    .line 296
    iput-wide p3, p0, Lxhss/ᛲᲈᛵᛶ;->ᛳᲁᲇᛸ:J

    .line 297
    .line 298
    return-object p2
.end method
