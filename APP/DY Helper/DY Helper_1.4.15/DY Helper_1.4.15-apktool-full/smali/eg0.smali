.class public final Leg0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lb00;


# static fields
.field public static final η:Ljava/util/List;

.field public static final θ:Ljava/util/List;


# instance fields
.field public final α:Lvk1;

.field public final β:Lyk1;

.field public final γ:Ldg0;

.field public volatile δ:Lkg0;

.field public final ε:Lzj1;

.field public volatile ζ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v10, ":scheme"

    .line 2
    .line 3
    const-string v11, ":authority"

    .line 4
    .line 5
    const-string v0, "connection"

    .line 6
    .line 7
    const-string v1, "host"

    .line 8
    .line 9
    const-string v2, "keep-alive"

    .line 10
    .line 11
    const-string v3, "proxy-connection"

    .line 12
    .line 13
    const-string v4, "te"

    .line 14
    .line 15
    const-string v5, "transfer-encoding"

    .line 16
    .line 17
    const-string v6, "encoding"

    .line 18
    .line 19
    const-string v7, "upgrade"

    .line 20
    .line 21
    const-string v8, ":method"

    .line 22
    .line 23
    const-string v9, ":path"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lud2;->κ([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Leg0;->η:Ljava/util/List;

    .line 34
    .line 35
    const-string v7, "encoding"

    .line 36
    .line 37
    const-string v8, "upgrade"

    .line 38
    .line 39
    const-string v1, "connection"

    .line 40
    .line 41
    const-string v2, "host"

    .line 42
    .line 43
    const-string v3, "keep-alive"

    .line 44
    .line 45
    const-string v4, "proxy-connection"

    .line 46
    .line 47
    const-string v5, "te"

    .line 48
    .line 49
    const-string v6, "transfer-encoding"

    .line 50
    .line 51
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lud2;->κ([Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Leg0;->θ:Ljava/util/List;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Lt41;Lvk1;Lyk1;Ldg0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Leg0;->α:Lvk1;

    .line 11
    .line 12
    iput-object p3, p0, Leg0;->β:Lyk1;

    .line 13
    .line 14
    iput-object p4, p0, Leg0;->γ:Ldg0;

    .line 15
    .line 16
    iget-object p1, p1, Lt41;->σ:Ljava/util/List;

    .line 17
    .line 18
    sget-object p2, Lzj1;->λ:Lzj1;

    .line 19
    .line 20
    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object p2, Lzj1;->κ:Lzj1;

    .line 28
    .line 29
    :goto_0
    iput-object p2, p0, Leg0;->ε:Lzj1;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Leg0;->ζ:Z

    .line 3
    .line 4
    iget-object p0, p0, Leg0;->δ:Lkg0;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lsz;->μ:Lsz;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lkg0;->ζ(Lsz;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final α(Li5;)V
    .locals 14

    .line 1
    iget-object v0, p0, Leg0;->δ:Lkg0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p1, Li5;->ε:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lkn1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move v0, v1

    .line 17
    :goto_0
    iget-object v3, p1, Li5;->δ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lvc0;

    .line 20
    .line 21
    new-instance v4, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v3}, Lvc0;->size()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    add-int/lit8 v5, v5, 0x4

    .line 28
    .line 29
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Ltc0;

    .line 33
    .line 34
    sget-object v6, Ltc0;->ζ:Ldd;

    .line 35
    .line 36
    iget-object v7, p1, Li5;->γ:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v7, Ljava/lang/String;

    .line 39
    .line 40
    invoke-direct {v5, v6, v7}, Ltc0;-><init>(Ldd;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    new-instance v5, Ltc0;

    .line 47
    .line 48
    sget-object v6, Ltc0;->η:Ldd;

    .line 49
    .line 50
    iget-object p1, p1, Li5;->β:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Log0;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Log0;->β()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {p1}, Log0;->δ()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    if-eqz v8, :cond_2

    .line 66
    .line 67
    new-instance v9, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const/16 v7, 0x3f

    .line 76
    .line 77
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    :cond_2
    invoke-direct {v5, v6, v7}, Ltc0;-><init>(Ldd;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    const-string v5, "Host"

    .line 94
    .line 95
    invoke-virtual {v3, v5}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    if-eqz v5, :cond_3

    .line 100
    .line 101
    new-instance v6, Ltc0;

    .line 102
    .line 103
    sget-object v7, Ltc0;->ι:Ldd;

    .line 104
    .line 105
    invoke-direct {v6, v7, v5}, Ltc0;-><init>(Ldd;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :cond_3
    new-instance v5, Ltc0;

    .line 112
    .line 113
    sget-object v6, Ltc0;->θ:Ldd;

    .line 114
    .line 115
    iget-object p1, p1, Log0;->α:Ljava/lang/String;

    .line 116
    .line 117
    invoke-direct {v5, v6, p1}, Ltc0;-><init>(Ldd;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Lvc0;->size()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    move v5, v1

    .line 128
    :goto_1
    if-ge v5, p1, :cond_6

    .line 129
    .line 130
    invoke-virtual {v3, v5}, Lvc0;->β(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 135
    .line 136
    invoke-static {v7, v6, v7}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    sget-object v7, Leg0;->η:Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    if-eqz v7, :cond_4

    .line 147
    .line 148
    const-string v7, "te"

    .line 149
    .line 150
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_5

    .line 155
    .line 156
    invoke-virtual {v3, v5}, Lvc0;->δ(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    const-string v8, "trailers"

    .line 161
    .line 162
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_5

    .line 167
    .line 168
    :cond_4
    new-instance v7, Ltc0;

    .line 169
    .line 170
    invoke-virtual {v3, v5}, Lvc0;->δ(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    invoke-direct {v7, v6, v8}, Ltc0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_6
    iget-object v8, p0, Leg0;->γ:Ldg0;

    .line 184
    .line 185
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    xor-int/lit8 v9, v0, 0x1

    .line 189
    .line 190
    iget-object p1, v8, Ldg0;->Γ:Llg0;

    .line 191
    .line 192
    monitor-enter p1

    .line 193
    :try_start_0
    monitor-enter v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 194
    :try_start_1
    iget v3, v8, Ldg0;->ι:I

    .line 195
    .line 196
    const v5, 0x3fffffff    # 1.9999999f

    .line 197
    .line 198
    .line 199
    if-le v3, v5, :cond_7

    .line 200
    .line 201
    sget-object v3, Lsz;->λ:Lsz;

    .line 202
    .line 203
    invoke-virtual {v8, v3}, Ldg0;->κ(Lsz;)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :catchall_0
    move-exception v0

    .line 208
    move-object p0, v0

    .line 209
    goto/16 :goto_3

    .line 210
    .line 211
    :cond_7
    :goto_2
    iget-boolean v3, v8, Ldg0;->κ:Z

    .line 212
    .line 213
    if-nez v3, :cond_d

    .line 214
    .line 215
    iget v7, v8, Ldg0;->ι:I

    .line 216
    .line 217
    add-int/lit8 v3, v7, 0x2

    .line 218
    .line 219
    iput v3, v8, Ldg0;->ι:I

    .line 220
    .line 221
    new-instance v6, Lkg0;

    .line 222
    .line 223
    const/4 v11, 0x0

    .line 224
    const/4 v10, 0x0

    .line 225
    invoke-direct/range {v6 .. v11}, Lkg0;-><init>(ILdg0;ZZLvc0;)V

    .line 226
    .line 227
    .line 228
    if-eqz v0, :cond_8

    .line 229
    .line 230
    iget-wide v10, v8, Ldg0;->ω:J

    .line 231
    .line 232
    iget-wide v12, v8, Ldg0;->Α:J

    .line 233
    .line 234
    cmp-long v0, v10, v12

    .line 235
    .line 236
    if-gez v0, :cond_8

    .line 237
    .line 238
    iget-wide v10, v6, Lkg0;->θ:J

    .line 239
    .line 240
    iget-wide v12, v6, Lkg0;->ι:J

    .line 241
    .line 242
    cmp-long v0, v10, v12

    .line 243
    .line 244
    if-ltz v0, :cond_9

    .line 245
    .line 246
    :cond_8
    move v1, v2

    .line 247
    :cond_9
    invoke-virtual {v6}, Lkg0;->ι()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-eqz v0, :cond_a

    .line 252
    .line 253
    iget-object v0, v8, Ldg0;->ζ:Ljava/util/LinkedHashMap;

    .line 254
    .line 255
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 260
    .line 261
    .line 262
    :cond_a
    :try_start_2
    monitor-exit v8

    .line 263
    iget-object v0, v8, Ldg0;->Γ:Llg0;

    .line 264
    .line 265
    invoke-virtual {v0, v9, v7, v4}, Llg0;->λ(ZILjava/util/ArrayList;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 266
    .line 267
    .line 268
    monitor-exit p1

    .line 269
    if-eqz v1, :cond_b

    .line 270
    .line 271
    iget-object p1, v8, Ldg0;->Γ:Llg0;

    .line 272
    .line 273
    invoke-virtual {p1}, Llg0;->flush()V

    .line 274
    .line 275
    .line 276
    :cond_b
    iput-object v6, p0, Leg0;->δ:Lkg0;

    .line 277
    .line 278
    iget-boolean p1, p0, Leg0;->ζ:Z

    .line 279
    .line 280
    iget-object v0, p0, Leg0;->δ:Lkg0;

    .line 281
    .line 282
    if-nez p1, :cond_c

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    iget-object p1, v0, Lkg0;->ξ:Ljg0;

    .line 288
    .line 289
    iget-object v0, p0, Leg0;->β:Lyk1;

    .line 290
    .line 291
    iget v0, v0, Lyk1;->η:I

    .line 292
    .line 293
    int-to-long v0, v0

    .line 294
    invoke-virtual {p1, v0, v1}, Lm42;->η(J)Lm42;

    .line 295
    .line 296
    .line 297
    iget-object p1, p0, Leg0;->δ:Lkg0;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-object p1, p1, Lkg0;->ο:Ljg0;

    .line 303
    .line 304
    iget-object p0, p0, Leg0;->β:Lyk1;

    .line 305
    .line 306
    iget p0, p0, Lyk1;->θ:I

    .line 307
    .line 308
    int-to-long v0, p0

    .line 309
    invoke-virtual {p1, v0, v1}, Lm42;->η(J)Lm42;

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    sget-object p0, Lsz;->μ:Lsz;

    .line 317
    .line 318
    invoke-virtual {v0, p0}, Lkg0;->ζ(Lsz;)V

    .line 319
    .line 320
    .line 321
    const-string p0, "Canceled"

    .line 322
    .line 323
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :catchall_1
    move-exception v0

    .line 328
    move-object p0, v0

    .line 329
    goto :goto_4

    .line 330
    :cond_d
    :try_start_3
    new-instance p0, Lno;

    .line 331
    .line 332
    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    .line 333
    .line 334
    .line 335
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 336
    :goto_3
    :try_start_4
    monitor-exit v8

    .line 337
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 338
    :goto_4
    monitor-exit p1

    .line 339
    throw p0
.end method

.method public final β(Lzn1;)Lrx1;
    .locals 0

    .line 1
    iget-object p0, p0, Leg0;->δ:Lkg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkg0;->μ:Lig0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final γ()V
    .locals 0

    .line 1
    iget-object p0, p0, Leg0;->δ:Lkg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkg0;->ν:Lhg0;

    .line 7
    .line 8
    invoke-virtual {p0}, Lhg0;->close()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final δ()Z
    .locals 4

    .line 1
    iget-object p0, p0, Leg0;->δ:Lkg0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v1, p0, Lkg0;->μ:Lig0;

    .line 8
    .line 9
    iget-boolean v2, v1, Lig0;->ζ:Z

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Lig0;->θ:Lsc;

    .line 15
    .line 16
    invoke-virtual {v1}, Lsc;->η()Z

    .line 17
    .line 18
    .line 19
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    move v1, v3

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v1, v0

    .line 27
    :goto_0
    monitor-exit p0

    .line 28
    if-ne v1, v3, :cond_1

    .line 29
    .line 30
    return v3

    .line 31
    :goto_1
    monitor-exit p0

    .line 32
    throw v0

    .line 33
    :cond_1
    return v0
.end method

.method public final ε()V
    .locals 0

    .line 1
    iget-object p0, p0, Leg0;->γ:Ldg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldg0;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ζ()Llx1;
    .locals 0

    .line 1
    iget-object p0, p0, Leg0;->δ:Lkg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final η()La00;
    .locals 0

    .line 1
    iget-object p0, p0, Leg0;->α:Lvk1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final θ(Lzn1;)J
    .locals 0

    .line 1
    invoke-static {p1}, Lmg0;->α(Lzn1;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    invoke-static {p1}, Lud2;->ε(Lzn1;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    return-wide p0
.end method

.method public final ι(Li5;J)Liw1;
    .locals 0

    .line 1
    iget-object p0, p0, Leg0;->δ:Lkg0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkg0;->ν:Lhg0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final κ(Z)Lyn1;
    .locals 10

    .line 1
    iget-object v0, p0, Leg0;->δ:Lkg0;

    .line 2
    .line 3
    if-eqz v0, :cond_f

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :cond_0
    :goto_0
    :try_start_0
    iget-object v1, v0, Lkg0;->κ:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_7

    .line 14
    .line 15
    invoke-virtual {v0}, Lkg0;->η()Lsz;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-nez v1, :cond_7

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-nez p1, :cond_3

    .line 23
    .line 24
    iget-object v3, v0, Lkg0;->ζ:Ldg0;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v3, v0, Lkg0;->ν:Lhg0;

    .line 30
    .line 31
    iget-boolean v4, v3, Lhg0;->η:Z

    .line 32
    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    iget-boolean v3, v3, Lhg0;->ε:Z

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v3, v2

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    :goto_1
    move v3, v1

    .line 43
    :goto_2
    if-eqz v3, :cond_4

    .line 44
    .line 45
    :cond_3
    move v2, v1

    .line 46
    :cond_4
    if-eqz v2, :cond_5

    .line 47
    .line 48
    iget-object v1, v0, Lkg0;->ξ:Ljg0;

    .line 49
    .line 50
    invoke-virtual {v1}, Li7;->θ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_5
    :goto_3
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    .line 60
    if-eqz v2, :cond_0

    .line 61
    .line 62
    :try_start_2
    iget-object v1, v0, Lkg0;->ξ:Ljg0;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljg0;->μ()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_1
    move-exception p0

    .line 69
    goto :goto_4

    .line 70
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 75
    .line 76
    .line 77
    new-instance p0, Ljava/io/InterruptedIOException;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 83
    :goto_4
    if-eqz v2, :cond_6

    .line 84
    .line 85
    :try_start_4
    iget-object p1, v0, Lkg0;->ξ:Ljg0;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljg0;->μ()V

    .line 88
    .line 89
    .line 90
    :cond_6
    throw p0

    .line 91
    :cond_7
    iget-object v1, v0, Lkg0;->κ:Ljava/util/ArrayDeque;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_d

    .line 98
    .line 99
    iget-object v1, v0, Lkg0;->κ:Ljava/util/ArrayDeque;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    check-cast v1, Lvc0;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 109
    .line 110
    monitor-exit v0

    .line 111
    iget-object p0, p0, Leg0;->ε:Lzj1;

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v0, Ljava/util/ArrayList;

    .line 117
    .line 118
    const/16 v3, 0x14

    .line 119
    .line 120
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Lvc0;->size()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    const/4 v4, 0x0

    .line 128
    move v5, v2

    .line 129
    move-object v6, v4

    .line 130
    :goto_5
    if-ge v5, v3, :cond_a

    .line 131
    .line 132
    invoke-virtual {v1, v5}, Lvc0;->β(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {v1, v5}, Lvc0;->δ(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    const-string v9, ":status"

    .line 141
    .line 142
    invoke-virtual {v7, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-eqz v9, :cond_8

    .line 147
    .line 148
    const-string v6, "HTTP/1.1 "

    .line 149
    .line 150
    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-static {v6}, Lg81;->ξ(Ljava/lang/String;)Ln2;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    goto :goto_6

    .line 159
    :cond_8
    sget-object v9, Leg0;->θ:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v9, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-nez v9, :cond_9

    .line 166
    .line 167
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    invoke-static {v8}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    :cond_9
    :goto_6
    add-int/lit8 v5, v5, 0x1

    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_a
    if-eqz v6, :cond_c

    .line 185
    .line 186
    new-instance v1, Lyn1;

    .line 187
    .line 188
    invoke-direct {v1}, Lyn1;-><init>()V

    .line 189
    .line 190
    .line 191
    iput-object p0, v1, Lyn1;->β:Lzj1;

    .line 192
    .line 193
    iget p0, v6, Ln2;->β:I

    .line 194
    .line 195
    iput p0, v1, Lyn1;->γ:I

    .line 196
    .line 197
    iget-object p0, v6, Ln2;->δ:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast p0, Ljava/lang/String;

    .line 200
    .line 201
    iput-object p0, v1, Lyn1;->δ:Ljava/lang/String;

    .line 202
    .line 203
    new-instance p0, Lvc0;

    .line 204
    .line 205
    new-array v2, v2, [Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, [Ljava/lang/String;

    .line 212
    .line 213
    invoke-direct {p0, v0}, Lvc0;-><init>([Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p0}, Lvc0;->γ()Luc0;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    iput-object p0, v1, Lyn1;->ζ:Luc0;

    .line 221
    .line 222
    if-eqz p1, :cond_b

    .line 223
    .line 224
    iget p0, v1, Lyn1;->γ:I

    .line 225
    .line 226
    const/16 p1, 0x64

    .line 227
    .line 228
    if-ne p0, p1, :cond_b

    .line 229
    .line 230
    return-object v4

    .line 231
    :cond_b
    return-object v1

    .line 232
    :cond_c
    new-instance p0, Ljava/net/ProtocolException;

    .line 233
    .line 234
    const-string p1, "Expected \':status\' header not present"

    .line 235
    .line 236
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw p0

    .line 240
    :cond_d
    :try_start_5
    iget-object p0, v0, Lkg0;->ρ:Ljava/io/IOException;

    .line 241
    .line 242
    if-eqz p0, :cond_e

    .line 243
    .line 244
    goto :goto_7

    .line 245
    :cond_e
    new-instance p0, Lo02;

    .line 246
    .line 247
    invoke-virtual {v0}, Lkg0;->η()Lsz;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-direct {p0, p1}, Lo02;-><init>(Lsz;)V

    .line 255
    .line 256
    .line 257
    :goto_7
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 258
    :goto_8
    monitor-exit v0

    .line 259
    throw p0

    .line 260
    :cond_f
    const-string p0, "stream wasn\'t created"

    .line 261
    .line 262
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    const/4 p0, 0x0

    .line 266
    return-object p0
.end method
