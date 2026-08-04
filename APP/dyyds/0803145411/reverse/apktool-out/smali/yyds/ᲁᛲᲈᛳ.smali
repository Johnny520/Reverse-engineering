.class public final Lyyds/ᲁᛲᲈᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ᲇᲇᲇᛱ:Ljava/util/logging/Logger;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᲇᛲᛶᛵ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᲁᲀᛴᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lyyds/ᛳᛲᲈᛷ;

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
    sput-object v0, Lyyds/ᲁᛲᲈᛳ;->ᲇᲇᲇᛱ:Ljava/util/logging/Logger;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lyyds/ᲀᲀᛵᲈ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 5
    .line 6
    new-instance v0, Lyyds/ᲁᲀᛴᲇ;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lyyds/ᲁᲀᛴᲇ;-><init>(Lyyds/ᲀᲀᛵᲈ;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲀᛴᲇ;

    .line 12
    .line 13
    new-instance p1, Lyyds/ᲇᛲᛶᛵ;

    .line 14
    .line 15
    invoke-direct {p1, v0}, Lyyds/ᲇᛲᛶᛵ;-><init>(Lyyds/ᲁᲀᛴᲇ;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lyyds/ᲁᛲᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛲᛶᛵ;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛲᲈᲁ(ZLyyds/ᲀᛶᲁ;)Z
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 3
    .line 4
    const-wide/16 v2, 0x9

    .line 5
    .line 6
    invoke-virtual {v1, v2, v3}, Lyyds/ᲀᲀᛵᲈ;->ᛷᛸᲇᛶ(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 10
    .line 11
    invoke-static {v1}, Lyyds/ᛶᲁᛵᛲ;->ᛷᛵᲇᲀ(Lyyds/ᲀᲀᛵᲈ;)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x4000

    .line 16
    .line 17
    if-gt v1, v2, :cond_2f

    .line 18
    .line 19
    iget-object v3, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 20
    .line 21
    invoke-virtual {v3}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    and-int/lit16 v3, v3, 0xff

    .line 26
    .line 27
    iget-object v4, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 28
    .line 29
    invoke-virtual {v4}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    and-int/lit16 v5, v4, 0xff

    .line 34
    .line 35
    iget-object v6, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 36
    .line 37
    invoke-virtual {v6}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const v7, 0x7fffffff

    .line 42
    .line 43
    .line 44
    and-int/2addr v7, v6

    .line 45
    const/16 v8, 0x8

    .line 46
    .line 47
    const/4 v9, 0x1

    .line 48
    if-eq v3, v8, :cond_0

    .line 49
    .line 50
    sget-object v10, Lyyds/ᲁᛲᲈᛳ;->ᲇᲇᲇᛱ:Ljava/util/logging/Logger;

    .line 51
    .line 52
    sget-object v11, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 53
    .line 54
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    if-eqz v11, :cond_0

    .line 59
    .line 60
    invoke-static {v9, v7, v1, v3, v5}, Lyyds/ᛳᛲᲈᛷ;->ᛵᛸᛸᛷ(ZIIII)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v11

    .line 64
    invoke-virtual {v10, v11}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_0
    const/4 v10, 0x4

    .line 68
    if-eqz p1, :cond_2

    .line 69
    .line 70
    if-ne v3, v10, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const-string p0, "Expected a SETTINGS frame but was "

    .line 74
    .line 75
    invoke-static {v3}, Lyyds/ᛳᛲᲈᛷ;->ᛲᲈᲁ(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1, p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛳᛶᛵ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return v0

    .line 83
    :cond_2
    :goto_0
    const/16 p1, 0xe

    .line 84
    .line 85
    const/4 v11, 0x5

    .line 86
    const/4 v12, 0x2

    .line 87
    packed-switch v3, :pswitch_data_0

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 91
    .line 92
    int-to-long p1, v1

    .line 93
    invoke-virtual {p0, p1, p2}, Lyyds/ᲀᲀᛵᲈ;->ᛸᛸᛷᛱ(J)V

    .line 94
    .line 95
    .line 96
    return v9

    .line 97
    :pswitch_0
    const-string p1, "TYPE_WINDOW_UPDATE length !=4: "

    .line 98
    .line 99
    if-ne v1, v10, :cond_7

    .line 100
    .line 101
    :try_start_1
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 102
    .line 103
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 104
    .line 105
    .line 106
    move-result p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 107
    const-wide/32 v2, 0x7fffffff

    .line 108
    .line 109
    .line 110
    int-to-long p0, p0

    .line 111
    and-long/2addr p0, v2

    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    cmp-long v0, p0, v2

    .line 115
    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    sget-object v2, Lyyds/ᲁᛲᲈᛳ;->ᲇᲇᲇᛱ:Ljava/util/logging/Logger;

    .line 119
    .line 120
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_3

    .line 127
    .line 128
    invoke-static {v9, v7, v1, p0, p1}, Lyyds/ᛳᛲᲈᛷ;->ᲀᛲᛳᲀ(ZIIJ)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    iget-object p2, p2, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 136
    .line 137
    if-nez v7, :cond_4

    .line 138
    .line 139
    monitor-enter p2

    .line 140
    :try_start_2
    iget-wide v0, p2, Lyyds/ᛴᲀᛷᛷ;->ᛵᲀᲈᛴ:J

    .line 141
    .line 142
    add-long/2addr v0, p0

    .line 143
    iput-wide v0, p2, Lyyds/ᛴᲀᛷᛷ;->ᛵᲀᲈᛴ:J

    .line 144
    .line 145
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    .line 147
    .line 148
    monitor-exit p2

    .line 149
    return v9

    .line 150
    :catchall_0
    move-exception p0

    .line 151
    monitor-exit p2

    .line 152
    throw p0

    .line 153
    :cond_4
    invoke-virtual {p2, v7}, Lyyds/ᛴᲀᛷᛷ;->ᲇᲇᲇᛱ(I)Lyyds/ᲇᲀᲁᛵ;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    if-eqz p2, :cond_29

    .line 158
    .line 159
    monitor-enter p2

    .line 160
    :try_start_3
    iget-wide v1, p2, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ:J

    .line 161
    .line 162
    add-long/2addr v1, p0

    .line 163
    iput-wide v1, p2, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ:J

    .line 164
    .line 165
    if-lez v0, :cond_5

    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 168
    .line 169
    .line 170
    :cond_5
    monitor-exit p2

    .line 171
    return v9

    .line 172
    :catchall_1
    move-exception p0

    .line 173
    monitor-exit p2

    .line 174
    throw p0

    .line 175
    :cond_6
    :try_start_4
    new-instance p0, Ljava/io/IOException;

    .line 176
    .line 177
    const-string p1, "windowSizeIncrement was 0"

    .line 178
    .line 179
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    throw p0

    .line 183
    :catch_0
    move-exception p0

    .line 184
    goto :goto_1

    .line 185
    :cond_7
    new-instance p0, Ljava/io/IOException;

    .line 186
    .line 187
    new-instance p2, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {p2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 203
    :goto_1
    sget-object p1, Lyyds/ᲁᛲᲈᛳ;->ᲇᲇᲇᛱ:Ljava/util/logging/Logger;

    .line 204
    .line 205
    invoke-static {v9, v7, v1, v8, v5}, Lyyds/ᛳᛲᲈᛷ;->ᛵᛸᛸᛷ(ZIIII)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p0

    .line 213
    :pswitch_1
    if-lt v1, v8, :cond_f

    .line 214
    .line 215
    if-nez v7, :cond_e

    .line 216
    .line 217
    iget-object v2, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 218
    .line 219
    invoke-virtual {v2}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    iget-object v3, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 224
    .line 225
    invoke-virtual {v3}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 226
    .line 227
    .line 228
    move-result v3

    .line 229
    sub-int/2addr v1, v8

    .line 230
    invoke-static {p1}, Lyyds/ᲀᲁᲈᲇ;->ᛲᛶᛱᲈ(I)[I

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    array-length v4, p1

    .line 235
    move v5, v0

    .line 236
    :goto_2
    if-ge v5, v4, :cond_9

    .line 237
    .line 238
    aget v6, p1, v5

    .line 239
    .line 240
    invoke-static {v6}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 241
    .line 242
    .line 243
    move-result v7

    .line 244
    if-ne v7, v3, :cond_8

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_9
    move v6, v0

    .line 251
    :goto_3
    if-eqz v6, :cond_d

    .line 252
    .line 253
    sget-object p1, Lyyds/ᲇᲁᲀᲁ;->ᲇᲇᲇᛱ:Lyyds/ᲇᲁᲀᲁ;

    .line 254
    .line 255
    if-lez v1, :cond_a

    .line 256
    .line 257
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 258
    .line 259
    int-to-long v3, v1

    .line 260
    invoke-virtual {p0, v3, v4}, Lyyds/ᲀᲀᛵᲈ;->ᛷᲈᲈᲁ(J)Lyyds/ᲇᲁᲀᲁ;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    :cond_a
    invoke-virtual {p1}, Lyyds/ᲇᲁᲀᲁ;->ᛵᛸᛸᛷ()I

    .line 265
    .line 266
    .line 267
    iget-object p0, p2, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 268
    .line 269
    monitor-enter p0

    .line 270
    :try_start_5
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    new-array v1, v0, [Lyyds/ᲇᲀᲁᛵ;

    .line 277
    .line 278
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    iput-boolean v9, p0, Lyyds/ᛴᲀᛷᛷ;->ᛱᲈᲁ:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 283
    .line 284
    monitor-exit p0

    .line 285
    check-cast p1, [Lyyds/ᲇᲀᲁᛵ;

    .line 286
    .line 287
    array-length p0, p1

    .line 288
    :goto_4
    if-ge v0, p0, :cond_29

    .line 289
    .line 290
    aget-object v1, p1, v0

    .line 291
    .line 292
    iget v3, v1, Lyyds/ᲇᲀᲁᛵ;->ᲀᛲᛳᲀ:I

    .line 293
    .line 294
    if-le v3, v2, :cond_c

    .line 295
    .line 296
    invoke-virtual {v1}, Lyyds/ᲇᲀᲁᛵ;->ᛱᲈᲁ()Z

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eqz v3, :cond_c

    .line 301
    .line 302
    monitor-enter v1

    .line 303
    :try_start_6
    invoke-virtual {v1}, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ()I

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    if-nez v3, :cond_b

    .line 308
    .line 309
    iput v8, v1, Lyyds/ᲇᲀᲁᛵ;->ᛱᛳᲇ:I

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 312
    .line 313
    .line 314
    goto :goto_5

    .line 315
    :catchall_2
    move-exception p0

    .line 316
    goto :goto_6

    .line 317
    :cond_b
    :goto_5
    monitor-exit v1

    .line 318
    iget-object v3, p2, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 319
    .line 320
    iget v1, v1, Lyyds/ᲇᲀᲁᛵ;->ᲀᛲᛳᲀ:I

    .line 321
    .line 322
    invoke-virtual {v3, v1}, Lyyds/ᛴᲀᛷᛷ;->ᛶᛷᛲᲁ(I)Lyyds/ᲇᲀᲁᛵ;

    .line 323
    .line 324
    .line 325
    goto :goto_7

    .line 326
    :goto_6
    monitor-exit v1

    .line 327
    throw p0

    .line 328
    :cond_c
    :goto_7
    add-int/lit8 v0, v0, 0x1

    .line 329
    .line 330
    goto :goto_4

    .line 331
    :catchall_3
    move-exception p1

    .line 332
    monitor-exit p0

    .line 333
    throw p1

    .line 334
    :cond_d
    const-string p0, "TYPE_GOAWAY unexpected error code: "

    .line 335
    .line 336
    invoke-static {v3, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return v0

    .line 344
    :cond_e
    const-string p0, "TYPE_GOAWAY streamId != 0"

    .line 345
    .line 346
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    return v0

    .line 350
    :cond_f
    const-string p0, "TYPE_GOAWAY length < 8: "

    .line 351
    .line 352
    invoke-static {v1, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p0

    .line 356
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return v0

    .line 360
    :pswitch_2
    if-ne v1, v8, :cond_16

    .line 361
    .line 362
    if-nez v7, :cond_15

    .line 363
    .line 364
    iget-object p1, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 365
    .line 366
    invoke-virtual {p1}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 371
    .line 372
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 373
    .line 374
    .line 375
    move-result p0

    .line 376
    and-int/lit8 v1, v4, 0x1

    .line 377
    .line 378
    if-eqz v1, :cond_10

    .line 379
    .line 380
    move v0, v9

    .line 381
    :cond_10
    iget-object v1, p2, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 382
    .line 383
    if-eqz v0, :cond_14

    .line 384
    .line 385
    monitor-enter v1

    .line 386
    const-wide/16 v2, 0x1

    .line 387
    .line 388
    if-eq p1, v9, :cond_13

    .line 389
    .line 390
    if-eq p1, v12, :cond_12

    .line 391
    .line 392
    const/4 p0, 0x3

    .line 393
    if-eq p1, p0, :cond_11

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_11
    :try_start_7
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 397
    .line 398
    .line 399
    goto :goto_8

    .line 400
    :catchall_4
    move-exception p0

    .line 401
    goto :goto_9

    .line 402
    :cond_12
    iget-wide p0, v1, Lyyds/ᛴᲀᛷᛷ;->ᲇᛱᛲ:J

    .line 403
    .line 404
    add-long/2addr p0, v2

    .line 405
    iput-wide p0, v1, Lyyds/ᛴᲀᛷᛷ;->ᲇᛱᛲ:J

    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_13
    iget-wide p0, v1, Lyyds/ᛴᲀᛷᛷ;->ᛱᛳᲇ:J

    .line 409
    .line 410
    add-long/2addr p0, v2

    .line 411
    iput-wide p0, v1, Lyyds/ᛴᲀᛷᛷ;->ᛱᛳᲇ:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 412
    .line 413
    :goto_8
    monitor-exit v1

    .line 414
    return v9

    .line 415
    :goto_9
    monitor-exit v1

    .line 416
    throw p0

    .line 417
    :cond_14
    iget-object v0, v1, Lyyds/ᛴᲀᛷᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛱᛷᛱᛳ;

    .line 418
    .line 419
    new-instance v1, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    .line 423
    .line 424
    iget-object v2, p2, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 425
    .line 426
    iget-object v2, v2, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 427
    .line 428
    const-string v3, " ping"

    .line 429
    .line 430
    invoke-static {v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    iget-object p2, p2, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 435
    .line 436
    new-instance v2, Lyyds/ᲁᛲᲈᛷ;

    .line 437
    .line 438
    invoke-direct {v2, p2, p1, p0, v9}, Lyyds/ᲁᛲᲈᛷ;-><init>(Lyyds/ᛴᲀᛷᛷ;III)V

    .line 439
    .line 440
    .line 441
    invoke-static {v0, v1, v2}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 442
    .line 443
    .line 444
    return v9

    .line 445
    :cond_15
    const-string p0, "TYPE_PING streamId != 0"

    .line 446
    .line 447
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    return v0

    .line 451
    :cond_16
    const-string p0, "TYPE_PING length != 8: "

    .line 452
    .line 453
    invoke-static {v1, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object p0

    .line 457
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    return v0

    .line 461
    :pswitch_3
    invoke-virtual {p0, p2, v1, v5, v7}, Lyyds/ᲁᛲᲈᛳ;->ᛳᲁᲁᲇ(Lyyds/ᲀᛶᲁ;III)V

    .line 462
    .line 463
    .line 464
    return v9

    .line 465
    :pswitch_4
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 466
    .line 467
    if-nez v7, :cond_24

    .line 468
    .line 469
    and-int/lit8 p1, v4, 0x1

    .line 470
    .line 471
    if-eqz p1, :cond_18

    .line 472
    .line 473
    if-nez v1, :cond_17

    .line 474
    .line 475
    goto/16 :goto_10

    .line 476
    .line 477
    :cond_17
    const-string p0, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 478
    .line 479
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    return v0

    .line 483
    :cond_18
    rem-int/lit8 p1, v1, 0x6

    .line 484
    .line 485
    if-nez p1, :cond_23

    .line 486
    .line 487
    new-instance p1, Lyyds/ᛷᲇᲁᛴ;

    .line 488
    .line 489
    invoke-direct {p1}, Lyyds/ᛷᲇᲁᛴ;-><init>()V

    .line 490
    .line 491
    .line 492
    invoke-static {v0, v1}, Lyyds/ᛳᛵᲀ;->ᛷᛵᲇᲀ(II)Lyyds/ᲈᲈᲀᲈ;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    const/4 v3, 0x6

    .line 497
    invoke-static {v1, v3}, Lyyds/ᛳᛵᲀ;->ᛷᛲᲈᛱ(Lyyds/ᲈᲈᲀᲈ;I)Lyyds/ᲇᲁᲁᲁ;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    iget v3, v1, Lyyds/ᲇᲁᲁᲁ;->ᲀᛲᛳᲀ:I

    .line 502
    .line 503
    iget v4, v1, Lyyds/ᲇᲁᲁᲁ;->ᲇᲈᛵᛷ:I

    .line 504
    .line 505
    iget v1, v1, Lyyds/ᲇᲁᲁᲁ;->ᛲᛴᛳᛲ:I

    .line 506
    .line 507
    if-lez v1, :cond_19

    .line 508
    .line 509
    if-le v3, v4, :cond_1a

    .line 510
    .line 511
    :cond_19
    if-gez v1, :cond_22

    .line 512
    .line 513
    if-gt v4, v3, :cond_22

    .line 514
    .line 515
    :cond_1a
    :goto_a
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->ᛵᛶᛲᲀ()S

    .line 516
    .line 517
    .line 518
    move-result v5

    .line 519
    sget-object v6, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 520
    .line 521
    const v6, 0xffff

    .line 522
    .line 523
    .line 524
    and-int/2addr v5, v6

    .line 525
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 526
    .line 527
    .line 528
    move-result v6

    .line 529
    if-eq v5, v12, :cond_1f

    .line 530
    .line 531
    if-eq v5, v10, :cond_1d

    .line 532
    .line 533
    if-eq v5, v11, :cond_1b

    .line 534
    .line 535
    goto :goto_b

    .line 536
    :cond_1b
    if-lt v6, v2, :cond_1c

    .line 537
    .line 538
    const v7, 0xffffff

    .line 539
    .line 540
    .line 541
    if-gt v6, v7, :cond_1c

    .line 542
    .line 543
    goto :goto_b

    .line 544
    :cond_1c
    const-string p0, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    .line 545
    .line 546
    invoke-static {v6, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object p0

    .line 550
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    return v0

    .line 554
    :cond_1d
    if-ltz v6, :cond_1e

    .line 555
    .line 556
    goto :goto_b

    .line 557
    :cond_1e
    const-string p0, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 558
    .line 559
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    return v0

    .line 563
    :cond_1f
    if-eqz v6, :cond_21

    .line 564
    .line 565
    if-ne v6, v9, :cond_20

    .line 566
    .line 567
    goto :goto_b

    .line 568
    :cond_20
    const-string p0, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 569
    .line 570
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    return v0

    .line 574
    :cond_21
    :goto_b
    invoke-virtual {p1, v5, v6}, Lyyds/ᛷᲇᲁᛴ;->ᛵᛸᛸᛷ(II)V

    .line 575
    .line 576
    .line 577
    if-eq v3, v4, :cond_22

    .line 578
    .line 579
    add-int/2addr v3, v1

    .line 580
    goto :goto_a

    .line 581
    :cond_22
    iget-object p0, p2, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 582
    .line 583
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᲈᲈᲁ:Lyyds/ᛱᛷᛱᛳ;

    .line 584
    .line 585
    new-instance v1, Ljava/lang/StringBuilder;

    .line 586
    .line 587
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 588
    .line 589
    .line 590
    iget-object p0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 591
    .line 592
    const-string v2, " applyAndAckSettings"

    .line 593
    .line 594
    invoke-static {v1, p0, v2}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object p0

    .line 598
    new-instance v1, Lyyds/ᛷᛴᛱᛱ;

    .line 599
    .line 600
    invoke-direct {v1, p2, v11, p1}, Lyyds/ᛷᛴᛱᛱ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    invoke-static {v0, p0, v1}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 604
    .line 605
    .line 606
    return v9

    .line 607
    :cond_23
    const-string p0, "TYPE_SETTINGS length % 6 != 0: "

    .line 608
    .line 609
    invoke-static {v1, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 610
    .line 611
    .line 612
    move-result-object p0

    .line 613
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    return v0

    .line 617
    :cond_24
    const-string p0, "TYPE_SETTINGS streamId != 0"

    .line 618
    .line 619
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    return v0

    .line 623
    :pswitch_5
    if-ne v1, v10, :cond_2c

    .line 624
    .line 625
    if-eqz v7, :cond_2b

    .line 626
    .line 627
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 628
    .line 629
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 630
    .line 631
    .line 632
    move-result p0

    .line 633
    invoke-static {p1}, Lyyds/ᲀᲁᲈᲇ;->ᛲᛶᛱᲈ(I)[I

    .line 634
    .line 635
    .line 636
    move-result-object p1

    .line 637
    array-length v1, p1

    .line 638
    move v2, v0

    .line 639
    :goto_c
    if-ge v2, v1, :cond_26

    .line 640
    .line 641
    aget v3, p1, v2

    .line 642
    .line 643
    invoke-static {v3}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    if-ne v4, p0, :cond_25

    .line 648
    .line 649
    goto :goto_d

    .line 650
    :cond_25
    add-int/lit8 v2, v2, 0x1

    .line 651
    .line 652
    goto :goto_c

    .line 653
    :cond_26
    move v3, v0

    .line 654
    :goto_d
    if-eqz v3, :cond_2a

    .line 655
    .line 656
    iget-object p0, p2, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 657
    .line 658
    if-eqz v7, :cond_27

    .line 659
    .line 660
    and-int/lit8 p1, v6, 0x1

    .line 661
    .line 662
    if-nez p1, :cond_27

    .line 663
    .line 664
    iget-object p1, p0, Lyyds/ᛴᲀᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛱᛳ;

    .line 665
    .line 666
    new-instance p2, Ljava/lang/StringBuilder;

    .line 667
    .line 668
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 669
    .line 670
    .line 671
    iget-object v0, p0, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 672
    .line 673
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    const/16 v0, 0x5b

    .line 677
    .line 678
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    const-string v0, "] onReset"

    .line 685
    .line 686
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object p2

    .line 693
    new-instance v0, Lyyds/ᲀᛸᛶᛱ;

    .line 694
    .line 695
    invoke-direct {v0, p0, v7, v3}, Lyyds/ᲀᛸᛶᛱ;-><init>(Lyyds/ᛴᲀᛷᛷ;II)V

    .line 696
    .line 697
    .line 698
    invoke-static {p1, p2, v0}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 699
    .line 700
    .line 701
    return v9

    .line 702
    :cond_27
    invoke-virtual {p0, v7}, Lyyds/ᛴᲀᛷᛷ;->ᛶᛷᛲᲁ(I)Lyyds/ᲇᲀᲁᛵ;

    .line 703
    .line 704
    .line 705
    move-result-object p0

    .line 706
    if-eqz p0, :cond_29

    .line 707
    .line 708
    monitor-enter p0

    .line 709
    :try_start_8
    invoke-virtual {p0}, Lyyds/ᲇᲀᲁᛵ;->ᛶᛷᛲᲁ()I

    .line 710
    .line 711
    .line 712
    move-result p1

    .line 713
    if-nez p1, :cond_28

    .line 714
    .line 715
    iput v3, p0, Lyyds/ᲇᲀᲁᛵ;->ᛱᛳᲇ:I

    .line 716
    .line 717
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 718
    .line 719
    .line 720
    goto :goto_e

    .line 721
    :catchall_5
    move-exception p1

    .line 722
    goto :goto_f

    .line 723
    :cond_28
    :goto_e
    monitor-exit p0

    .line 724
    return v9

    .line 725
    :goto_f
    monitor-exit p0

    .line 726
    throw p1

    .line 727
    :cond_29
    :goto_10
    return v9

    .line 728
    :cond_2a
    const-string p1, "TYPE_RST_STREAM unexpected error code: "

    .line 729
    .line 730
    invoke-static {p0, p1}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object p0

    .line 734
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    return v0

    .line 738
    :cond_2b
    const-string p0, "TYPE_RST_STREAM streamId == 0"

    .line 739
    .line 740
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    return v0

    .line 744
    :cond_2c
    new-instance p0, Ljava/io/IOException;

    .line 745
    .line 746
    new-instance p1, Ljava/lang/StringBuilder;

    .line 747
    .line 748
    const-string p2, "TYPE_RST_STREAM length: "

    .line 749
    .line 750
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 754
    .line 755
    .line 756
    const-string p2, " != 4"

    .line 757
    .line 758
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 759
    .line 760
    .line 761
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object p1

    .line 765
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    throw p0

    .line 769
    :pswitch_6
    if-ne v1, v11, :cond_2e

    .line 770
    .line 771
    if-eqz v7, :cond_2d

    .line 772
    .line 773
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 774
    .line 775
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 776
    .line 777
    .line 778
    invoke-virtual {p0}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 779
    .line 780
    .line 781
    return v9

    .line 782
    :cond_2d
    const-string p0, "TYPE_PRIORITY streamId == 0"

    .line 783
    .line 784
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    return v0

    .line 788
    :cond_2e
    new-instance p0, Ljava/io/IOException;

    .line 789
    .line 790
    new-instance p1, Ljava/lang/StringBuilder;

    .line 791
    .line 792
    const-string p2, "TYPE_PRIORITY length: "

    .line 793
    .line 794
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    const-string p2, " != 5"

    .line 801
    .line 802
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    .line 804
    .line 805
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object p1

    .line 809
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    throw p0

    .line 813
    :pswitch_7
    invoke-virtual {p0, p2, v1, v5, v7}, Lyyds/ᲁᛲᲈᛳ;->ᛷᲈᲈᲁ(Lyyds/ᲀᛶᲁ;III)V

    .line 814
    .line 815
    .line 816
    return v9

    .line 817
    :pswitch_8
    invoke-virtual {p0, p2, v1, v5, v7}, Lyyds/ᲁᛲᲈᛳ;->ᲇᲇᲇᛱ(Lyyds/ᲀᛶᲁ;III)V

    .line 818
    .line 819
    .line 820
    return v9

    .line 821
    :cond_2f
    const-string p0, "FRAME_SIZE_ERROR: "

    .line 822
    .line 823
    invoke-static {v1, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object p0

    .line 827
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 828
    .line 829
    .line 830
    :catch_1
    return v0

    .line 831
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

.method public final ᛳᲁᲁᲇ(Lyyds/ᲀᛶᲁ;III)V
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
    iget-object v0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 8
    .line 9
    invoke-virtual {v0}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    sget-object v1, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

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
    iget-object v1, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 20
    .line 21
    invoke-virtual {v1}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

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
    invoke-static {p2, p3, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛲᛲᲈᲈ(III)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p0, p2, v0, p3, p4}, Lyyds/ᲁᛲᲈᛳ;->ᛶᛷᛲᲁ(IIII)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p1, p1, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 40
    .line 41
    monitor-enter p1

    .line 42
    :try_start_0
    iget-object p2, p1, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛴᛸ:Ljava/util/LinkedHashSet;

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
    invoke-virtual {p1, v1, p0}, Lyyds/ᛴᲀᛷᛷ;->ᛵᛶᛲᲀ(II)V
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
    iget-object p2, p1, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛴᛸ:Ljava/util/LinkedHashSet;

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
    iget-object p2, p1, Lyyds/ᛴᲀᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛱᛳ;

    .line 73
    .line 74
    new-instance p3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object p4, p1, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

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
    new-instance p4, Lyyds/ᲀᛸᛶᛱ;

    .line 102
    .line 103
    invoke-direct {p4, p1, v1, p0}, Lyyds/ᲀᛸᛶᛱ;-><init>(Lyyds/ᛴᲀᛷᛷ;ILjava/util/List;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p2, p3, p4}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

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
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final ᛶᛷᛲᲁ(IIII)Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲁᲀᛴᲇ;

    .line 2
    .line 3
    iput p1, v0, Lyyds/ᲁᲀᛴᲇ;->ᲇᲇᲇᛱ:I

    .line 4
    .line 5
    iput p2, v0, Lyyds/ᲁᲀᛴᲇ;->ᛶᛷᛲᲁ:I

    .line 6
    .line 7
    iput p3, v0, Lyyds/ᲁᲀᛴᲇ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    iput p4, v0, Lyyds/ᲁᲀᛴᲇ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲁᛲᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲇᛲᛶᛵ;

    .line 12
    .line 13
    iget-object p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲀᛵᲈ;

    .line 14
    .line 15
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lyyds/ᲀᲀᛵᲈ;->ᛲᲈᲁ()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_c

    .line 20
    .line 21
    invoke-virtual {p1}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    sget-object p3, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

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
    invoke-virtual {p0, p3, p2}, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ(II)I

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
    sget-object v0, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

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
    invoke-virtual {p0, p2}, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ(Lyyds/ᛸᛸᛸᛵ;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    sget-object v0, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

    .line 62
    .line 63
    array-length v0, v0

    .line 64
    sub-int/2addr p3, v0

    .line 65
    iget v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

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
    iget-object p3, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

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
    invoke-virtual {p0, p2}, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ(Lyyds/ᛸᛸᛸᛵ;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const-string p0, "Header index too large "

    .line 84
    .line 85
    invoke-static {p2, p0}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛳᛶᲁ(ILjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

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
    sget-object p2, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

    .line 98
    .line 99
    invoke-virtual {p0}, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲇᲁᲀᲁ;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲇᲁᲀᲁ;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    new-instance p4, Lyyds/ᛸᛸᛸᛵ;

    .line 111
    .line 112
    invoke-direct {p4, p2, p3}, Lyyds/ᛸᛸᛸᛵ;-><init>(Lyyds/ᲇᲁᲀᲁ;Lyyds/ᲇᲁᲀᲁ;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, p4}, Lyyds/ᲇᛲᛶᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛸᛸᛸᛵ;)V

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
    invoke-virtual {p0, p3, p2}, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ(II)I

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    add-int/lit8 p2, p2, -0x1

    .line 130
    .line 131
    invoke-virtual {p0, p2}, Lyyds/ᲇᛲᛶᛵ;->ᲀᛲᛳᲀ(I)Lyyds/ᲇᲁᲀᲁ;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p0}, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲇᲁᲀᲁ;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    new-instance p4, Lyyds/ᛸᛸᛸᛵ;

    .line 140
    .line 141
    invoke-direct {p4, p2, p3}, Lyyds/ᛸᛸᛸᛵ;-><init>(Lyyds/ᲇᲁᲀᲁ;Lyyds/ᲇᲁᲀᲁ;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0, p4}, Lyyds/ᲇᛲᛶᛵ;->ᲇᲈᛵᛷ(Lyyds/ᛸᛸᛸᛵ;)V

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
    invoke-virtual {p0, p3, p2}, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ(II)I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    iput p2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ:I

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
    iget p3, p0, Lyyds/ᲇᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 170
    .line 171
    if-ge p2, p3, :cond_0

    .line 172
    .line 173
    if-nez p2, :cond_6

    .line 174
    .line 175
    iget-object p2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

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
    iget-object p2, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ:[Lyyds/ᛸᛸᛸᛵ;

    .line 183
    .line 184
    array-length p2, p2

    .line 185
    add-int/lit8 p2, p2, -0x1

    .line 186
    .line 187
    iput p2, p0, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ:I

    .line 188
    .line 189
    iput v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᛶᛷᛲᲁ:I

    .line 190
    .line 191
    iput v0, p0, Lyyds/ᲇᛲᛶᛵ;->ᛱᲈᲁ:I

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_6
    sub-int/2addr p3, p2

    .line 196
    invoke-virtual {p0, p3}, Lyyds/ᲇᛲᛶᛵ;->ᛵᛸᛸᛷ(I)I

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
    iget p0, p0, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ:I

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
    invoke-virtual {p0, p3, p2}, Lyyds/ᲇᛲᛶᛵ;->ᲇᲇᲇᛱ(II)I

    .line 233
    .line 234
    .line 235
    move-result p2

    .line 236
    add-int/lit8 p2, p2, -0x1

    .line 237
    .line 238
    invoke-virtual {p0, p2}, Lyyds/ᲇᛲᛶᛵ;->ᲀᛲᛳᲀ(I)Lyyds/ᲇᲁᲀᲁ;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    invoke-virtual {p0}, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲇᲁᲀᲁ;

    .line 243
    .line 244
    .line 245
    move-result-object p3

    .line 246
    new-instance p4, Lyyds/ᛸᛸᛸᛵ;

    .line 247
    .line 248
    invoke-direct {p4, p2, p3}, Lyyds/ᛸᛸᛸᛵ;-><init>(Lyyds/ᲇᲁᲀᲁ;Lyyds/ᲇᲁᲀᲁ;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p0, p4}, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ(Lyyds/ᛸᛸᛸᛵ;)V

    .line 252
    .line 253
    .line 254
    goto/16 :goto_0

    .line 255
    .line 256
    :cond_a
    :goto_1
    sget-object p2, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ:[Lyyds/ᛸᛸᛸᛵ;

    .line 257
    .line 258
    invoke-virtual {p0}, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲇᲁᲀᲁ;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    invoke-static {p2}, Lyyds/ᛵᲀᲁᛷ;->ᛲᲈᲁ(Lyyds/ᲇᲁᲀᲁ;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0}, Lyyds/ᲇᛲᛶᛵ;->ᛲᛴᛳᛲ()Lyyds/ᲇᲁᲀᲁ;

    .line 266
    .line 267
    .line 268
    move-result-object p3

    .line 269
    new-instance p4, Lyyds/ᛸᛸᛸᛵ;

    .line 270
    .line 271
    invoke-direct {p4, p2, p3}, Lyyds/ᛸᛸᛸᛵ;-><init>(Lyyds/ᲇᲁᲀᲁ;Lyyds/ᲇᲁᲀᲁ;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0, p4}, Lyyds/ᲇᛲᛶᛵ;->ᛲᲈᲁ(Lyyds/ᛸᛸᛸᛵ;)V

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
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-object p4

    .line 285
    :cond_c
    iget-object p1, p0, Lyyds/ᲇᛲᛶᛵ;->ᛵᛸᛸᛷ:Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-static {p1}, Lyyds/ᛷᛷᛶᲇ;->ᛴᛸᛴᛸ(Ljava/lang/Iterable;)Ljava/util/List;

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
    iput-wide p3, p0, Lyyds/ᲇᛲᛶᛵ;->ᲀᛲᛳᲀ:J

    .line 297
    .line 298
    return-object p2
.end method

.method public final ᛷᲈᲈᲁ(Lyyds/ᲀᛶᲁ;III)V
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
    iget-object v0, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 17
    .line 18
    invoke-virtual {v0}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget-object v3, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

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
    iget-object v3, p0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 33
    .line 34
    invoke-virtual {v3}, Lyyds/ᲀᲀᛵᲈ;->ᛳᲁᲁᲇ()I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 38
    .line 39
    .line 40
    sget-object v3, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

    .line 41
    .line 42
    add-int/lit8 p2, p2, -0x5

    .line 43
    .line 44
    :cond_2
    invoke-static {p2, p3, v0}, Lyyds/ᛱᛷᲈᛲ;->ᛲᛲᲈᲈ(III)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p0, p2, v0, p3, p4}, Lyyds/ᲁᛲᲈᛳ;->ᛶᛷᛲᲁ(IIII)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget-object v5, p1, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

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
    iget-object p2, v5, Lyyds/ᛴᲀᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛱᛳ;

    .line 66
    .line 67
    new-instance p3, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    iget-object v0, v5, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

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
    new-instance p3, Lyyds/ᲀᛸᛶᛱ;

    .line 93
    .line 94
    invoke-direct {p3, v5, p4, p0, v7}, Lyyds/ᲀᛸᛶᛱ;-><init>(Lyyds/ᛴᲀᛷᛷ;ILjava/util/List;Z)V

    .line 95
    .line 96
    .line 97
    invoke-static {p2, p1, p3}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    monitor-enter v5

    .line 102
    :try_start_0
    invoke-virtual {v5, p4}, Lyyds/ᛴᲀᛷᛷ;->ᲇᲇᲇᛱ(I)Lyyds/ᲇᲀᲁᛵ;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    if-nez p2, :cond_8

    .line 107
    .line 108
    iget-boolean p2, v5, Lyyds/ᛴᲀᛷᛷ;->ᛱᲈᲁ:Z
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
    iget p2, v5, Lyyds/ᛴᲀᛷᛷ;->ᲇᲇᲇᛱ:I
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
    iget p3, v5, Lyyds/ᛴᲀᛷᛷ;->ᛶᛷᛲᲁ:I

    .line 123
    .line 124
    rem-int/lit8 p3, p3, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
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
    invoke-static {p0}, Lyyds/ᛴᛲᛲᲇ;->ᛱᲈᲁ(Ljava/util/List;)Lyyds/ᛷᛸᛱᛴ;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    new-instance v3, Lyyds/ᲇᲀᲁᛵ;

    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    move v4, p4

    .line 138
    invoke-direct/range {v3 .. v8}, Lyyds/ᲇᲀᲁᛵ;-><init>(ILyyds/ᛴᲀᛷᛷ;ZZLyyds/ᛷᛸᛱᛴ;)V

    .line 139
    .line 140
    .line 141
    iput v4, v5, Lyyds/ᛴᲀᛷᛷ;->ᲇᲇᲇᛱ:I

    .line 142
    .line 143
    iget-object p0, v5, Lyyds/ᛴᲀᛷᛷ;->ᲇᲈᛵᛷ:Ljava/util/LinkedHashMap;

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
    iget-object p0, v5, Lyyds/ᛴᲀᛷᛷ;->ᛲᛳᛶᲁ:Lyyds/ᛱᛴᛳᛱ;

    .line 153
    .line 154
    invoke-virtual {p0}, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ()Lyyds/ᛱᛷᛱᛳ;

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
    iget-object p3, v5, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

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
    new-instance p2, Lyyds/ᛷᛴᛱᛱ;

    .line 184
    .line 185
    const/4 p3, 0x4

    .line 186
    invoke-direct {p2, v5, p3, v3}, Lyyds/ᛷᛴᛱᛱ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-static {p0, p1, p2}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    .line 191
    .line 192
    monitor-exit v5

    .line 193
    return-void

    .line 194
    :catchall_0
    move-exception v0

    .line 195
    move-object p0, v0

    .line 196
    goto :goto_2

    .line 197
    :cond_8
    monitor-exit v5

    .line 198
    invoke-static {p0}, Lyyds/ᛴᛲᛲᲇ;->ᛱᲈᲁ(Ljava/util/List;)Lyyds/ᛷᛸᛱᛴ;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    invoke-virtual {p2, p0, v7}, Lyyds/ᲇᲀᲁᛵ;->ᛷᲈᲈᲁ(Lyyds/ᛷᛸᛱᛴ;Z)V

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :goto_2
    monitor-exit v5

    .line 207
    throw p0

    .line 208
    :cond_9
    const-string p0, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 209
    .line 210
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-void
.end method

.method public final ᲇᲇᲇᛱ(Lyyds/ᲀᛶᲁ;III)V
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
    iget-object v7, v0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 29
    .line 30
    invoke-virtual {v7}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛷᛲᲁ()B

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    sget-object v8, Lyyds/ᛶᲁᛵᛲ;->ᛲᲈᲁ:[B

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
    invoke-static {v8, v2, v7}, Lyyds/ᛱᛷᲈᛲ;->ᛲᛲᲈᲈ(III)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iget-object v8, v0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 48
    .line 49
    iget-object v9, v1, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

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
    new-instance v4, Lyyds/ᛷᛲᲈᛲ;

    .line 63
    .line 64
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    int-to-long v10, v2

    .line 68
    invoke-virtual {v8, v10, v11}, Lyyds/ᲀᲀᛵᲈ;->ᛷᛸᲇᛶ(J)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v8, v10, v11, v4}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

    .line 72
    .line 73
    .line 74
    iget-object v8, v9, Lyyds/ᛴᲀᛷᛷ;->ᛷᛲᲈᛱ:Lyyds/ᛱᛷᛱᛳ;

    .line 75
    .line 76
    new-instance v1, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-object v5, v9, Lyyds/ᛴᲀᛷᛷ;->ᛲᛴᛳᛲ:Ljava/lang/String;

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
    new-instance v1, Lyyds/ᛲᛸᛶᲈ;

    .line 104
    .line 105
    move v5, v2

    .line 106
    move-object v2, v9

    .line 107
    invoke-direct/range {v1 .. v6}, Lyyds/ᛲᛸᛶᲈ;-><init>(Lyyds/ᛴᲀᛷᛷ;ILyyds/ᛷᛲᲈᛲ;IZ)V

    .line 108
    .line 109
    .line 110
    invoke-static {v8, v10, v1}, Lyyds/ᛱᛷᛱᛳ;->ᛵᛸᛸᛷ(Lyyds/ᛱᛷᛱᛳ;Ljava/lang/String;Lyyds/ᲁᛶᲁᲀ;)V

    .line 111
    .line 112
    .line 113
    goto/16 :goto_a

    .line 114
    .line 115
    :cond_3
    invoke-virtual {v9, v3}, Lyyds/ᛴᲀᛷᛷ;->ᲇᲇᲇᛱ(I)Lyyds/ᲇᲀᲁᛵ;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    if-nez v9, :cond_4

    .line 120
    .line 121
    iget-object v4, v1, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 122
    .line 123
    const/4 v5, 0x2

    .line 124
    invoke-virtual {v4, v3, v5}, Lyyds/ᛴᲀᛷᛷ;->ᛵᛶᛲᲀ(II)V

    .line 125
    .line 126
    .line 127
    iget-object v1, v1, Lyyds/ᲀᛶᲁ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 128
    .line 129
    int-to-long v2, v2

    .line 130
    invoke-virtual {v1, v2, v3}, Lyyds/ᛴᲀᛷᛷ;->ᛳᲁᲁᲇ(J)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8, v2, v3}, Lyyds/ᲀᲀᛵᲈ;->ᛸᛸᛷᛱ(J)V

    .line 134
    .line 135
    .line 136
    goto/16 :goto_a

    .line 137
    .line 138
    :cond_4
    sget-object v1, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 139
    .line 140
    iget-object v1, v9, Lyyds/ᲇᲀᲁᛵ;->ᛷᲈᲈᲁ:Lyyds/ᛳᲇᛴᛱ;

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
    iget-object v15, v1, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 152
    .line 153
    if-lez v14, :cond_c

    .line 154
    .line 155
    monitor-enter v15

    .line 156
    :try_start_0
    iget-boolean v14, v1, Lyyds/ᛳᲇᛴᛱ;->ᲇᲈᛵᛷ:Z

    .line 157
    .line 158
    iget-object v5, v1, Lyyds/ᛳᲇᛴᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛲᲈᛲ;

    .line 159
    .line 160
    move-wide/from16 p1, v12

    .line 161
    .line 162
    iget-wide v12, v5, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 163
    .line 164
    add-long/2addr v12, v10

    .line 165
    iget-wide v4, v1, Lyyds/ᛳᲇᛴᛱ;->ᲀᛲᛳᲀ:J
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
    invoke-virtual {v8, v10, v11}, Lyyds/ᲀᲀᛵᲈ;->ᛸᛸᛷᛱ(J)V

    .line 178
    .line 179
    .line 180
    iget-object v1, v1, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 181
    .line 182
    const/4 v2, 0x4

    .line 183
    invoke-virtual {v1, v2}, Lyyds/ᲇᲀᲁᛵ;->ᲇᲇᲇᛱ(I)V

    .line 184
    .line 185
    .line 186
    goto :goto_9

    .line 187
    :cond_6
    if-eqz v14, :cond_7

    .line 188
    .line 189
    invoke-virtual {v8, v10, v11}, Lyyds/ᲀᲀᛵᲈ;->ᛸᛸᛷᛱ(J)V

    .line 190
    .line 191
    .line 192
    goto :goto_9

    .line 193
    :cond_7
    iget-object v4, v1, Lyyds/ᛳᲇᛴᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᲈᛲ;

    .line 194
    .line 195
    invoke-virtual {v8, v10, v11, v4}, Lyyds/ᲀᲀᛵᲈ;->ᛶᛸᲀᲁ(JLyyds/ᛷᛲᲈᛲ;)J

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
    iget-object v4, v1, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 207
    .line 208
    monitor-enter v4

    .line 209
    :try_start_1
    iget-boolean v5, v1, Lyyds/ᛳᲇᛴᛱ;->ᛶᛷᛲᲁ:Z

    .line 210
    .line 211
    if-eqz v5, :cond_8

    .line 212
    .line 213
    iget-object v5, v1, Lyyds/ᛳᲇᛴᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᲈᛲ;

    .line 214
    .line 215
    iget-wide v12, v5, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

    .line 216
    .line 217
    invoke-virtual {v5, v12, v13}, Lyyds/ᛷᛲᲈᛲ;->ᛷᛶᛷᲀ(J)V

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
    iget-object v5, v1, Lyyds/ᛳᲇᛴᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛲᲈᛲ;

    .line 224
    .line 225
    iget-wide v12, v5, Lyyds/ᛷᛲᲈᛲ;->ᲇᲈᛵᛷ:J

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
    iget-object v13, v1, Lyyds/ᛳᲇᛴᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᲈᛲ;

    .line 235
    .line 236
    invoke-virtual {v5, v13}, Lyyds/ᛷᛲᲈᛲ;->ᛸᛴᛵᛶ(Lyyds/ᛷᛷᛳᛷ;)V

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
    sget-object v4, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 259
    .line 260
    iget-object v4, v15, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 261
    .line 262
    invoke-virtual {v4, v2, v3}, Lyyds/ᛴᲀᛷᛷ;->ᛳᲁᲁᲇ(J)V

    .line 263
    .line 264
    .line 265
    iget-object v1, v1, Lyyds/ᛳᲇᛴᛱ;->ᛱᲈᲁ:Lyyds/ᲇᲀᲁᛵ;

    .line 266
    .line 267
    iget-object v1, v1, Lyyds/ᲇᲀᲁᛵ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲀᛷᛷ;

    .line 268
    .line 269
    iget-object v1, v1, Lyyds/ᛴᲀᛷᛷ;->ᛵᛶᛲᲀ:Lyyds/ᛷᛷᲁᛲ;

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
    sget-object v1, Lyyds/ᛷᛸᛱᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛸᛱᛴ;

    .line 277
    .line 278
    const/4 v4, 0x1

    .line 279
    invoke-virtual {v9, v1, v4}, Lyyds/ᲇᲀᲁᛵ;->ᛷᲈᲈᲁ(Lyyds/ᛷᛸᛱᛴ;Z)V

    .line 280
    .line 281
    .line 282
    :cond_d
    :goto_a
    iget-object v0, v0, Lyyds/ᲁᛲᲈᛳ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲀᛵᲈ;

    .line 283
    .line 284
    int-to-long v1, v7

    .line 285
    invoke-virtual {v0, v1, v2}, Lyyds/ᲀᲀᛵᲈ;->ᛸᛸᛷᛱ(J)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :cond_e
    const-string v0, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 290
    .line 291
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_f
    const-string v0, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    .line 296
    .line 297
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᲇᛱᛲ(Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    return-void
.end method
