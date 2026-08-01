.class public final Lmc0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lrx1;


# instance fields
.field public ε:B

.field public final ζ:Lrk1;

.field public final η:Ljava/util/zip/Inflater;

.field public final θ:Lvl0;

.field public final ι:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Lad;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lrk1;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lrk1;-><init>(Lrx1;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lmc0;->ζ:Lrk1;

    .line 13
    .line 14
    new-instance p1, Ljava/util/zip/Inflater;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lmc0;->η:Ljava/util/zip/Inflater;

    .line 21
    .line 22
    new-instance v1, Lvl0;

    .line 23
    .line 24
    invoke-direct {v1, v0, p1}, Lvl0;-><init>(Lrk1;Ljava/util/zip/Inflater;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lmc0;->θ:Lvl0;

    .line 28
    .line 29
    new-instance p1, Ljava/util/zip/CRC32;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lmc0;->ι:Ljava/util/zip/CRC32;

    .line 35
    .line 36
    return-void
.end method

.method public static δ(IILjava/lang/String;)V
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 5
    .line 6
    invoke-static {p1}, Lln0;->й(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-static {p1, v1}, Lq02;->л(Ljava/lang/String;I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p0}, Lln0;->й(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0, v1}, Lq02;->л(Ljava/lang/String;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p2, ": actual 0x"

    .line 33
    .line 34
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, " != expected 0x"

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lmc0;->θ:Lvl0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvl0;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final α()Lm42;
    .locals 0

    .line 1
    iget-object p0, p0, Lmc0;->ζ:Lrk1;

    .line 2
    .line 3
    iget-object p0, p0, Lrk1;->ε:Lrx1;

    .line 4
    .line 5
    invoke-interface {p0}, Lrx1;->α()Lm42;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final β(JLsc;)J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p3

    .line 4
    .line 5
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-byte v1, v0, Lmc0;->ε:B

    .line 9
    .line 10
    iget-object v7, v0, Lmc0;->ι:Ljava/util/zip/CRC32;

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    iget-object v9, v0, Lmc0;->ζ:Lrk1;

    .line 14
    .line 15
    const-wide/16 v15, -0x1

    .line 16
    .line 17
    if-nez v1, :cond_c

    .line 18
    .line 19
    const-wide/16 v1, 0xa

    .line 20
    .line 21
    invoke-virtual {v9, v1, v2}, Lrk1;->μ(J)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v9, Lrk1;->ζ:Lsc;

    .line 25
    .line 26
    const-wide/16 v2, 0x3

    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Lsc;->θ(J)B

    .line 29
    .line 30
    .line 31
    move-result v17

    .line 32
    shr-int/lit8 v2, v17, 0x1

    .line 33
    .line 34
    and-int/2addr v2, v8

    .line 35
    if-ne v2, v8, :cond_0

    .line 36
    .line 37
    move/from16 v18, v8

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v2, 0x0

    .line 41
    move/from16 v18, v2

    .line 42
    .line 43
    :goto_0
    if-eqz v18, :cond_1

    .line 44
    .line 45
    const-wide/16 v2, 0x0

    .line 46
    .line 47
    const-wide/16 v4, 0xa

    .line 48
    .line 49
    invoke-virtual/range {v0 .. v5}, Lmc0;->η(Lsc;JJ)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {v9}, Lrk1;->readShort()S

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const-string v2, "ID1ID2"

    .line 57
    .line 58
    const/16 v3, 0x1f8b

    .line 59
    .line 60
    invoke-static {v3, v0, v2}, Lmc0;->δ(IILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-wide/16 v2, 0x8

    .line 64
    .line 65
    invoke-virtual {v9, v2, v3}, Lrk1;->skip(J)V

    .line 66
    .line 67
    .line 68
    shr-int/lit8 v0, v17, 0x2

    .line 69
    .line 70
    and-int/2addr v0, v8

    .line 71
    const v19, 0xff00

    .line 72
    .line 73
    .line 74
    const-wide/16 v10, 0x2

    .line 75
    .line 76
    if-ne v0, v8, :cond_4

    .line 77
    .line 78
    invoke-virtual {v9, v10, v11}, Lrk1;->μ(J)V

    .line 79
    .line 80
    .line 81
    if-eqz v18, :cond_2

    .line 82
    .line 83
    const-wide/16 v2, 0x0

    .line 84
    .line 85
    const-wide/16 v4, 0x2

    .line 86
    .line 87
    move-object/from16 v0, p0

    .line 88
    .line 89
    invoke-virtual/range {v0 .. v5}, Lmc0;->η(Lsc;JJ)V

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {v1}, Lsc;->readShort()S

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    and-int v2, v0, v19

    .line 97
    .line 98
    ushr-int/lit8 v2, v2, 0x8

    .line 99
    .line 100
    and-int/lit16 v0, v0, 0xff

    .line 101
    .line 102
    shl-int/lit8 v0, v0, 0x8

    .line 103
    .line 104
    or-int/2addr v0, v2

    .line 105
    int-to-short v0, v0

    .line 106
    const v2, 0xffff

    .line 107
    .line 108
    .line 109
    and-int/2addr v0, v2

    .line 110
    int-to-long v4, v0

    .line 111
    invoke-virtual {v9, v4, v5}, Lrk1;->μ(J)V

    .line 112
    .line 113
    .line 114
    if-eqz v18, :cond_3

    .line 115
    .line 116
    const-wide/16 v2, 0x0

    .line 117
    .line 118
    move-object/from16 v0, p0

    .line 119
    .line 120
    invoke-virtual/range {v0 .. v5}, Lmc0;->η(Lsc;JJ)V

    .line 121
    .line 122
    .line 123
    :cond_3
    invoke-virtual {v9, v4, v5}, Lrk1;->skip(J)V

    .line 124
    .line 125
    .line 126
    :cond_4
    shr-int/lit8 v0, v17, 0x3

    .line 127
    .line 128
    and-int/2addr v0, v8

    .line 129
    const-wide/16 v20, 0x1

    .line 130
    .line 131
    if-ne v0, v8, :cond_7

    .line 132
    .line 133
    move-wide v2, v10

    .line 134
    const-wide/16 v11, 0x0

    .line 135
    .line 136
    const-wide v13, 0x7fffffffffffffffL

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    const/4 v10, 0x0

    .line 142
    invoke-virtual/range {v9 .. v14}, Lrk1;->η(BJJ)J

    .line 143
    .line 144
    .line 145
    move-result-wide v10

    .line 146
    cmp-long v0, v10, v15

    .line 147
    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    if-eqz v18, :cond_5

    .line 151
    .line 152
    move-wide v4, v2

    .line 153
    const-wide/16 v2, 0x0

    .line 154
    .line 155
    move-wide v12, v4

    .line 156
    add-long v4, v10, v20

    .line 157
    .line 158
    move-object/from16 v0, p0

    .line 159
    .line 160
    invoke-virtual/range {v0 .. v5}, Lmc0;->η(Lsc;JJ)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_5
    move-wide v12, v2

    .line 165
    :goto_1
    add-long v10, v10, v20

    .line 166
    .line 167
    invoke-virtual {v9, v10, v11}, Lrk1;->skip(J)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_6
    new-instance v0, Ljava/io/EOFException;

    .line 172
    .line 173
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 174
    .line 175
    .line 176
    throw v0

    .line 177
    :cond_7
    move-wide v12, v10

    .line 178
    :goto_2
    shr-int/lit8 v0, v17, 0x4

    .line 179
    .line 180
    and-int/2addr v0, v8

    .line 181
    if-ne v0, v8, :cond_a

    .line 182
    .line 183
    move-wide v2, v12

    .line 184
    const-wide/16 v11, 0x0

    .line 185
    .line 186
    const-wide v13, 0x7fffffffffffffffL

    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    const/4 v10, 0x0

    .line 192
    invoke-virtual/range {v9 .. v14}, Lrk1;->η(BJJ)J

    .line 193
    .line 194
    .line 195
    move-result-wide v10

    .line 196
    cmp-long v0, v10, v15

    .line 197
    .line 198
    if-eqz v0, :cond_9

    .line 199
    .line 200
    if-eqz v18, :cond_8

    .line 201
    .line 202
    move-wide v12, v2

    .line 203
    const-wide/16 v2, 0x0

    .line 204
    .line 205
    add-long v4, v10, v20

    .line 206
    .line 207
    move-object/from16 v0, p0

    .line 208
    .line 209
    invoke-virtual/range {v0 .. v5}, Lmc0;->η(Lsc;JJ)V

    .line 210
    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_8
    move-object/from16 v0, p0

    .line 214
    .line 215
    move-wide v12, v2

    .line 216
    :goto_3
    add-long v10, v10, v20

    .line 217
    .line 218
    invoke-virtual {v9, v10, v11}, Lrk1;->skip(J)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_9
    new-instance v0, Ljava/io/EOFException;

    .line 223
    .line 224
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 225
    .line 226
    .line 227
    throw v0

    .line 228
    :cond_a
    move-object/from16 v0, p0

    .line 229
    .line 230
    :goto_4
    if-eqz v18, :cond_b

    .line 231
    .line 232
    invoke-virtual {v9, v12, v13}, Lrk1;->μ(J)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Lsc;->readShort()S

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    and-int v2, v1, v19

    .line 240
    .line 241
    ushr-int/lit8 v2, v2, 0x8

    .line 242
    .line 243
    and-int/lit16 v1, v1, 0xff

    .line 244
    .line 245
    shl-int/lit8 v1, v1, 0x8

    .line 246
    .line 247
    or-int/2addr v1, v2

    .line 248
    int-to-short v1, v1

    .line 249
    invoke-virtual {v7}, Ljava/util/zip/CRC32;->getValue()J

    .line 250
    .line 251
    .line 252
    move-result-wide v2

    .line 253
    long-to-int v2, v2

    .line 254
    int-to-short v2, v2

    .line 255
    const-string v3, "FHCRC"

    .line 256
    .line 257
    invoke-static {v1, v2, v3}, Lmc0;->δ(IILjava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7}, Ljava/util/zip/CRC32;->reset()V

    .line 261
    .line 262
    .line 263
    :cond_b
    iput-byte v8, v0, Lmc0;->ε:B

    .line 264
    .line 265
    :cond_c
    iget-byte v1, v0, Lmc0;->ε:B

    .line 266
    .line 267
    const/4 v10, 0x2

    .line 268
    if-ne v1, v8, :cond_e

    .line 269
    .line 270
    iget-wide v2, v6, Lsc;->ζ:J

    .line 271
    .line 272
    iget-object v1, v0, Lmc0;->θ:Lvl0;

    .line 273
    .line 274
    const-wide/16 v4, 0x2000

    .line 275
    .line 276
    invoke-virtual {v1, v4, v5, v6}, Lvl0;->β(JLsc;)J

    .line 277
    .line 278
    .line 279
    move-result-wide v4

    .line 280
    cmp-long v1, v4, v15

    .line 281
    .line 282
    if-eqz v1, :cond_d

    .line 283
    .line 284
    move-object v1, v6

    .line 285
    invoke-virtual/range {v0 .. v5}, Lmc0;->η(Lsc;JJ)V

    .line 286
    .line 287
    .line 288
    return-wide v4

    .line 289
    :cond_d
    iput-byte v10, v0, Lmc0;->ε:B

    .line 290
    .line 291
    :cond_e
    iget-byte v1, v0, Lmc0;->ε:B

    .line 292
    .line 293
    if-ne v1, v10, :cond_10

    .line 294
    .line 295
    invoke-virtual {v9}, Lrk1;->θ()I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    invoke-virtual {v7}, Ljava/util/zip/CRC32;->getValue()J

    .line 300
    .line 301
    .line 302
    move-result-wide v2

    .line 303
    long-to-int v2, v2

    .line 304
    const-string v3, "CRC"

    .line 305
    .line 306
    invoke-static {v1, v2, v3}, Lmc0;->δ(IILjava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v9}, Lrk1;->θ()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    iget-object v2, v0, Lmc0;->η:Ljava/util/zip/Inflater;

    .line 314
    .line 315
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->getBytesWritten()J

    .line 316
    .line 317
    .line 318
    move-result-wide v2

    .line 319
    long-to-int v2, v2

    .line 320
    const-string v3, "ISIZE"

    .line 321
    .line 322
    invoke-static {v1, v2, v3}, Lmc0;->δ(IILjava/lang/String;)V

    .line 323
    .line 324
    .line 325
    const/4 v1, 0x3

    .line 326
    iput-byte v1, v0, Lmc0;->ε:B

    .line 327
    .line 328
    invoke-virtual {v9}, Lrk1;->δ()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_f

    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_f
    const-string v0, "gzip finished without exhausting source"

    .line 336
    .line 337
    invoke-static {v0}, Lγ;->τ(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    const-wide/16 v0, 0x0

    .line 341
    .line 342
    return-wide v0

    .line 343
    :cond_10
    :goto_5
    return-wide v15
.end method

.method public final η(Lsc;JJ)V
    .locals 4

    .line 1
    iget-object p1, p1, Lsc;->ε:Lrr1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :goto_0
    iget v0, p1, Lrr1;->γ:I

    .line 7
    .line 8
    iget v1, p1, Lrr1;->β:I

    .line 9
    .line 10
    sub-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    cmp-long v2, p2, v2

    .line 14
    .line 15
    if-ltz v2, :cond_0

    .line 16
    .line 17
    sub-int/2addr v0, v1

    .line 18
    int-to-long v0, v0

    .line 19
    sub-long/2addr p2, v0

    .line 20
    iget-object p1, p1, Lrr1;->ζ:Lrr1;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    cmp-long v2, p4, v0

    .line 29
    .line 30
    if-lez v2, :cond_1

    .line 31
    .line 32
    iget v2, p1, Lrr1;->β:I

    .line 33
    .line 34
    int-to-long v2, v2

    .line 35
    add-long/2addr v2, p2

    .line 36
    long-to-int p2, v2

    .line 37
    iget p3, p1, Lrr1;->γ:I

    .line 38
    .line 39
    sub-int/2addr p3, p2

    .line 40
    int-to-long v2, p3

    .line 41
    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    long-to-int p3, v2

    .line 46
    iget-object v2, p0, Lmc0;->ι:Ljava/util/zip/CRC32;

    .line 47
    .line 48
    iget-object v3, p1, Lrr1;->α:[B

    .line 49
    .line 50
    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 51
    .line 52
    .line 53
    int-to-long p2, p3

    .line 54
    sub-long/2addr p4, p2

    .line 55
    iget-object p1, p1, Lrr1;->ζ:Lrr1;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-wide p2, v0

    .line 61
    goto :goto_1

    .line 62
    :cond_1
    return-void
.end method
