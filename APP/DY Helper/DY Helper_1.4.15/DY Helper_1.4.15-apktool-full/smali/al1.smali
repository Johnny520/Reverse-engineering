.class public final Lal1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:Lx22;

.field public final β:Lxk1;

.field public final γ:I

.field public final δ:I

.field public final ε:I

.field public final ζ:I

.field public final η:Z

.field public final θ:Z

.field public final ι:Lp;

.field public final κ:Lij0;

.field public final λ:Luk1;

.field public final μ:Z

.field public ν:Lv;

.field public ξ:Lcp1;

.field public ο:Lzo1;

.field public final π:Lw6;


# direct methods
.method public constructor <init>(Lx22;Lxk1;IIIIZZLp;Lij0;Luk1;Li5;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lal1;->α:Lx22;

    .line 14
    .line 15
    iput-object p2, p0, Lal1;->β:Lxk1;

    .line 16
    .line 17
    iput p3, p0, Lal1;->γ:I

    .line 18
    .line 19
    iput p4, p0, Lal1;->δ:I

    .line 20
    .line 21
    iput p5, p0, Lal1;->ε:I

    .line 22
    .line 23
    iput p6, p0, Lal1;->ζ:I

    .line 24
    .line 25
    iput-boolean p7, p0, Lal1;->η:Z

    .line 26
    .line 27
    iput-boolean p8, p0, Lal1;->θ:Z

    .line 28
    .line 29
    iput-object p9, p0, Lal1;->ι:Lp;

    .line 30
    .line 31
    iput-object p10, p0, Lal1;->κ:Lij0;

    .line 32
    .line 33
    iput-object p11, p0, Lal1;->λ:Luk1;

    .line 34
    .line 35
    iget-object p1, p12, Li5;->γ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Ljava/lang/String;

    .line 38
    .line 39
    const-string p2, "GET"

    .line 40
    .line 41
    invoke-static {p1, p2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    xor-int/lit8 p1, p1, 0x1

    .line 46
    .line 47
    iput-boolean p1, p0, Lal1;->μ:Z

    .line 48
    .line 49
    new-instance p1, Lw6;

    .line 50
    .line 51
    invoke-direct {p1}, Lw6;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lal1;->π:Lw6;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final α(Lvk1;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lal1;->π:Lw6;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw6;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v0, p0, Lal1;->ο:Lzo1;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    if-eqz p1, :cond_5

    .line 17
    .line 18
    monitor-enter p1

    .line 19
    :try_start_0
    iget v0, p1, Lvk1;->μ:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean v0, p1, Lvk1;->κ:Z

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p1, Lvk1;->γ:Lzo1;

    .line 31
    .line 32
    iget-object v0, v0, Lzo1;->α:Lp;

    .line 33
    .line 34
    iget-object v0, v0, Lp;->θ:Log0;

    .line 35
    .line 36
    iget-object v3, p0, Lal1;->ι:Lp;

    .line 37
    .line 38
    iget-object v3, v3, Lp;->θ:Log0;

    .line 39
    .line 40
    invoke-static {v0, v3}, Lud2;->α(Log0;Log0;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v2, p1, Lvk1;->γ:Lzo1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    :goto_0
    monitor-exit p1

    .line 50
    if-eqz v2, :cond_5

    .line 51
    .line 52
    iput-object v2, p0, Lal1;->ο:Lzo1;

    .line 53
    .line 54
    return v1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    monitor-exit p1

    .line 57
    throw p0

    .line 58
    :cond_5
    iget-object p1, p0, Lal1;->ν:Lv;

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    iget v0, p1, Lv;->α:I

    .line 63
    .line 64
    iget-object p1, p1, Lv;->β:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-ge v0, p1, :cond_6

    .line 73
    .line 74
    return v1

    .line 75
    :cond_6
    iget-object p0, p0, Lal1;->ξ:Lcp1;

    .line 76
    .line 77
    if-nez p0, :cond_7

    .line 78
    .line 79
    :goto_1
    return v1

    .line 80
    :cond_7
    invoke-virtual {p0}, Lcp1;->α()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0
.end method

.method public final β()Lbp1;
    .locals 13

    .line 1
    iget-object v0, p0, Lal1;->λ:Luk1;

    .line 2
    .line 3
    iget-object v0, v0, Luk1;->μ:Lvk1;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    :goto_0
    move-object v3, v1

    .line 10
    goto :goto_4

    .line 11
    :cond_1
    iget-boolean v3, p0, Lal1;->μ:Z

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Lvk1;->η(Z)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    monitor-enter v0

    .line 18
    iget-boolean v4, v0, Lvk1;->κ:Z

    .line 19
    .line 20
    if-nez v3, :cond_2

    .line 21
    .line 22
    :try_start_0
    iput-boolean v2, v0, Lvk1;->κ:Z

    .line 23
    .line 24
    iget-object v3, p0, Lal1;->λ:Luk1;

    .line 25
    .line 26
    invoke-virtual {v3}, Luk1;->ι()Ljava/net/Socket;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    goto :goto_3

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    goto/16 :goto_12

    .line 33
    .line 34
    :cond_2
    if-nez v4, :cond_5

    .line 35
    .line 36
    iget-object v3, v0, Lvk1;->γ:Lzo1;

    .line 37
    .line 38
    iget-object v3, v3, Lzo1;->α:Lp;

    .line 39
    .line 40
    iget-object v3, v3, Lp;->θ:Log0;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v4, p0, Lal1;->ι:Lp;

    .line 46
    .line 47
    iget-object v4, v4, Lp;->θ:Log0;

    .line 48
    .line 49
    iget v5, v3, Log0;->ε:I

    .line 50
    .line 51
    iget v6, v4, Log0;->ε:I

    .line 52
    .line 53
    if-ne v5, v6, :cond_3

    .line 54
    .line 55
    iget-object v3, v3, Log0;->δ:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v4, v4, Log0;->δ:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    move v3, v2

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    const/4 v3, 0x0

    .line 68
    :goto_1
    if-nez v3, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    move-object v3, v1

    .line 72
    goto :goto_3

    .line 73
    :cond_5
    :goto_2
    iget-object v3, p0, Lal1;->λ:Luk1;

    .line 74
    .line 75
    invoke-virtual {v3}, Luk1;->ι()Ljava/net/Socket;

    .line 76
    .line 77
    .line 78
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :goto_3
    monitor-exit v0

    .line 80
    iget-object v4, p0, Lal1;->λ:Luk1;

    .line 81
    .line 82
    iget-object v4, v4, Luk1;->μ:Lvk1;

    .line 83
    .line 84
    if-eqz v4, :cond_7

    .line 85
    .line 86
    if-nez v3, :cond_6

    .line 87
    .line 88
    new-instance v3, Ljo1;

    .line 89
    .line 90
    invoke-direct {v3, v0}, Ljo1;-><init>(Lvk1;)V

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    const-string p0, "Check failed."

    .line 95
    .line 96
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_7
    if-eqz v3, :cond_0

    .line 101
    .line 102
    invoke-static {v3}, Lud2;->γ(Ljava/net/Socket;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :goto_4
    if-eqz v3, :cond_8

    .line 107
    .line 108
    return-object v3

    .line 109
    :cond_8
    invoke-virtual {p0, v1, v1}, Lal1;->δ(Lmo;Ljava/util/List;)Ljo1;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_9

    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_9
    iget-object v0, p0, Lal1;->π:Lw6;

    .line 117
    .line 118
    invoke-virtual {v0}, Lw6;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_a

    .line 123
    .line 124
    iget-object p0, p0, Lal1;->π:Lw6;

    .line 125
    .line 126
    invoke-virtual {p0}, Lw6;->removeFirst()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Lbp1;

    .line 131
    .line 132
    return-object p0

    .line 133
    :cond_a
    iget-object v0, p0, Lal1;->ο:Lzo1;

    .line 134
    .line 135
    if-eqz v0, :cond_b

    .line 136
    .line 137
    iput-object v1, p0, Lal1;->ο:Lzo1;

    .line 138
    .line 139
    invoke-virtual {p0, v0, v1}, Lal1;->γ(Lzo1;Ljava/util/ArrayList;)Lmo;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    goto/16 :goto_11

    .line 144
    .line 145
    :cond_b
    iget-object v0, p0, Lal1;->ν:Lv;

    .line 146
    .line 147
    if-eqz v0, :cond_d

    .line 148
    .line 149
    iget v3, v0, Lv;->α:I

    .line 150
    .line 151
    iget-object v4, v0, Lv;->β:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v4, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-ge v3, v4, :cond_d

    .line 160
    .line 161
    iget v2, v0, Lv;->α:I

    .line 162
    .line 163
    iget-object v3, v0, Lv;->β:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v3, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-ge v2, v4, :cond_c

    .line 172
    .line 173
    iget v2, v0, Lv;->α:I

    .line 174
    .line 175
    add-int/lit8 v4, v2, 0x1

    .line 176
    .line 177
    iput v4, v0, Lv;->α:I

    .line 178
    .line 179
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Lzo1;

    .line 184
    .line 185
    invoke-virtual {p0, v0, v1}, Lal1;->γ(Lzo1;Ljava/util/ArrayList;)Lmo;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    goto/16 :goto_11

    .line 190
    .line 191
    :cond_c
    invoke-static {}, Lγ;->ο()V

    .line 192
    .line 193
    .line 194
    return-object v1

    .line 195
    :cond_d
    iget-object v0, p0, Lal1;->ξ:Lcp1;

    .line 196
    .line 197
    if-nez v0, :cond_e

    .line 198
    .line 199
    new-instance v0, Lcp1;

    .line 200
    .line 201
    iget-object v3, p0, Lal1;->ι:Lp;

    .line 202
    .line 203
    iget-object v4, p0, Lal1;->κ:Lij0;

    .line 204
    .line 205
    iget-object v5, p0, Lal1;->λ:Luk1;

    .line 206
    .line 207
    iget-boolean v6, p0, Lal1;->θ:Z

    .line 208
    .line 209
    invoke-direct {v0, v3, v4, v5, v6}, Lcp1;-><init>(Lp;Lij0;Luk1;Z)V

    .line 210
    .line 211
    .line 212
    iput-object v0, p0, Lal1;->ξ:Lcp1;

    .line 213
    .line 214
    :cond_e
    invoke-virtual {v0}, Lcp1;->α()Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_2b

    .line 219
    .line 220
    invoke-virtual {v0}, Lcp1;->α()Z

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-eqz v3, :cond_2a

    .line 225
    .line 226
    new-instance v3, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    :cond_f
    iget v4, v0, Lcp1;->ε:I

    .line 232
    .line 233
    iget-object v5, v0, Lcp1;->δ:Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 236
    .line 237
    .line 238
    move-result v5

    .line 239
    if-ge v4, v5, :cond_25

    .line 240
    .line 241
    iget-object v4, v0, Lcp1;->α:Lp;

    .line 242
    .line 243
    const-string v5, "No route to "

    .line 244
    .line 245
    iget v6, v0, Lcp1;->ε:I

    .line 246
    .line 247
    iget-object v7, v0, Lcp1;->δ:Ljava/util/List;

    .line 248
    .line 249
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    if-ge v6, v7, :cond_24

    .line 254
    .line 255
    iget-object v6, v0, Lcp1;->δ:Ljava/util/List;

    .line 256
    .line 257
    iget v7, v0, Lcp1;->ε:I

    .line 258
    .line 259
    add-int/lit8 v8, v7, 0x1

    .line 260
    .line 261
    iput v8, v0, Lcp1;->ε:I

    .line 262
    .line 263
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    check-cast v6, Ljava/net/Proxy;

    .line 268
    .line 269
    new-instance v7, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 272
    .line 273
    .line 274
    iput-object v7, v0, Lcp1;->ζ:Ljava/lang/Object;

    .line 275
    .line 276
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 277
    .line 278
    .line 279
    move-result-object v8

    .line 280
    sget-object v9, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 281
    .line 282
    if-eq v8, v9, :cond_13

    .line 283
    .line 284
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    sget-object v9, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 289
    .line 290
    if-ne v8, v9, :cond_10

    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_10
    invoke-virtual {v6}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    instance-of v9, v8, Ljava/net/InetSocketAddress;

    .line 298
    .line 299
    if-eqz v9, :cond_12

    .line 300
    .line 301
    check-cast v8, Ljava/net/InetSocketAddress;

    .line 302
    .line 303
    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    if-nez v9, :cond_11

    .line 308
    .line 309
    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_11
    invoke-virtual {v9}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v9

    .line 321
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    :goto_5
    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getPort()I

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    goto :goto_7

    .line 329
    :cond_12
    const-string p0, "Proxy.address() is not an InetSocketAddress: "

    .line 330
    .line 331
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    new-instance v1, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 348
    .line 349
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v0

    .line 357
    :cond_13
    :goto_6
    iget-object v8, v4, Lp;->θ:Log0;

    .line 358
    .line 359
    iget-object v9, v8, Log0;->δ:Ljava/lang/String;

    .line 360
    .line 361
    iget v8, v8, Log0;->ε:I

    .line 362
    .line 363
    :goto_7
    if-gt v2, v8, :cond_23

    .line 364
    .line 365
    const/high16 v10, 0x10000

    .line 366
    .line 367
    if-ge v8, v10, :cond_23

    .line 368
    .line 369
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 370
    .line 371
    .line 372
    move-result-object v5

    .line 373
    sget-object v10, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 374
    .line 375
    if-ne v5, v10, :cond_14

    .line 376
    .line 377
    invoke-static {v9, v8}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    goto/16 :goto_e

    .line 385
    .line 386
    :cond_14
    sget-object v5, Lqd2;->α:Lym1;

    .line 387
    .line 388
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    sget-object v5, Lqd2;->α:Lym1;

    .line 392
    .line 393
    invoke-virtual {v5, v9}, Lym1;->γ(Ljava/lang/CharSequence;)Z

    .line 394
    .line 395
    .line 396
    move-result v5

    .line 397
    if-eqz v5, :cond_15

    .line 398
    .line 399
    invoke-static {v9}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    invoke-static {v4}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    goto :goto_8

    .line 408
    :cond_15
    iget-object v5, v4, Lp;->α:Lx;

    .line 409
    .line 410
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    :try_start_1
    invoke-static {v9}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 414
    .line 415
    .line 416
    move-result-object v5

    .line 417
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-static {v5}, Lg7;->н([Ljava/lang/Object;)Ljava/util/List;

    .line 421
    .line 422
    .line 423
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 424
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    if-nez v10, :cond_22

    .line 429
    .line 430
    move-object v4, v5

    .line 431
    :goto_8
    iget-boolean v5, v0, Lcp1;->γ:Z

    .line 432
    .line 433
    if-eqz v5, :cond_1e

    .line 434
    .line 435
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    const/4 v9, 0x2

    .line 440
    if-ge v5, v9, :cond_16

    .line 441
    .line 442
    goto/16 :goto_c

    .line 443
    .line 444
    :cond_16
    new-instance v5, Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 447
    .line 448
    .line 449
    new-instance v9, Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 452
    .line 453
    .line 454
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 459
    .line 460
    .line 461
    move-result v11

    .line 462
    if-eqz v11, :cond_18

    .line 463
    .line 464
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v11

    .line 468
    move-object v12, v11

    .line 469
    check-cast v12, Ljava/net/InetAddress;

    .line 470
    .line 471
    instance-of v12, v12, Ljava/net/Inet6Address;

    .line 472
    .line 473
    if-eqz v12, :cond_17

    .line 474
    .line 475
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    goto :goto_9

    .line 479
    :cond_17
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    goto :goto_9

    .line 483
    :cond_18
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 484
    .line 485
    .line 486
    move-result v10

    .line 487
    if-nez v10, :cond_1e

    .line 488
    .line 489
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 490
    .line 491
    .line 492
    move-result v10

    .line 493
    if-eqz v10, :cond_19

    .line 494
    .line 495
    goto :goto_c

    .line 496
    :cond_19
    sget-object v4, Lsd2;->α:[B

    .line 497
    .line 498
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 503
    .line 504
    .line 505
    move-result-object v9

    .line 506
    invoke-static {}, Lyh;->χ()Lzt0;

    .line 507
    .line 508
    .line 509
    move-result-object v10

    .line 510
    :cond_1a
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    if-nez v4, :cond_1c

    .line 515
    .line 516
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v4

    .line 520
    if-eqz v4, :cond_1b

    .line 521
    .line 522
    goto :goto_b

    .line 523
    :cond_1b
    invoke-static {v10}, Lyh;->μ(Lzt0;)Lzt0;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    goto :goto_c

    .line 528
    :cond_1c
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 529
    .line 530
    .line 531
    move-result v4

    .line 532
    if-eqz v4, :cond_1d

    .line 533
    .line 534
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    invoke-virtual {v10, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    :cond_1d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v4

    .line 545
    if-eqz v4, :cond_1a

    .line 546
    .line 547
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    invoke-virtual {v10, v4}, Lzt0;->add(Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    goto :goto_a

    .line 555
    :cond_1e
    :goto_c
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object v4

    .line 559
    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    if-eqz v5, :cond_1f

    .line 564
    .line 565
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    check-cast v5, Ljava/net/InetAddress;

    .line 570
    .line 571
    new-instance v9, Ljava/net/InetSocketAddress;

    .line 572
    .line 573
    invoke-direct {v9, v5, v8}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    goto :goto_d

    .line 580
    :cond_1f
    :goto_e
    iget-object v4, v0, Lcp1;->ζ:Ljava/lang/Object;

    .line 581
    .line 582
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 583
    .line 584
    .line 585
    move-result-object v4

    .line 586
    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 587
    .line 588
    .line 589
    move-result v5

    .line 590
    if-eqz v5, :cond_21

    .line 591
    .line 592
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v5

    .line 596
    check-cast v5, Ljava/net/InetSocketAddress;

    .line 597
    .line 598
    new-instance v7, Lzo1;

    .line 599
    .line 600
    iget-object v8, v0, Lcp1;->α:Lp;

    .line 601
    .line 602
    invoke-direct {v7, v8, v6, v5}, Lzo1;-><init>(Lp;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 603
    .line 604
    .line 605
    iget-object v5, v0, Lcp1;->β:Lij0;

    .line 606
    .line 607
    monitor-enter v5

    .line 608
    :try_start_2
    iget-object v8, v5, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 609
    .line 610
    invoke-interface {v8, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 611
    .line 612
    .line 613
    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 614
    monitor-exit v5

    .line 615
    if-eqz v8, :cond_20

    .line 616
    .line 617
    iget-object v5, v0, Lcp1;->η:Ljava/util/ArrayList;

    .line 618
    .line 619
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    goto :goto_f

    .line 623
    :cond_20
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    goto :goto_f

    .line 627
    :catchall_1
    move-exception p0

    .line 628
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 629
    throw p0

    .line 630
    :cond_21
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 631
    .line 632
    .line 633
    move-result v4

    .line 634
    if-nez v4, :cond_f

    .line 635
    .line 636
    goto :goto_10

    .line 637
    :cond_22
    new-instance p0, Ljava/net/UnknownHostException;

    .line 638
    .line 639
    iget-object v0, v4, Lp;->α:Lx;

    .line 640
    .line 641
    new-instance v1, Ljava/lang/StringBuilder;

    .line 642
    .line 643
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    const-string v0, " returned no addresses for "

    .line 650
    .line 651
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-direct {p0, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 662
    .line 663
    .line 664
    throw p0

    .line 665
    :catch_0
    move-exception p0

    .line 666
    new-instance v0, Ljava/net/UnknownHostException;

    .line 667
    .line 668
    const-string v1, "Broken system behaviour for dns lookup of "

    .line 669
    .line 670
    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 678
    .line 679
    .line 680
    throw v0

    .line 681
    :cond_23
    new-instance p0, Ljava/net/SocketException;

    .line 682
    .line 683
    new-instance v0, Ljava/lang/StringBuilder;

    .line 684
    .line 685
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    const/16 v1, 0x3a

    .line 692
    .line 693
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    const-string v1, "; port is out of range"

    .line 700
    .line 701
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    invoke-direct {p0, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    throw p0

    .line 712
    :cond_24
    new-instance p0, Ljava/net/SocketException;

    .line 713
    .line 714
    iget-object v1, v4, Lp;->θ:Log0;

    .line 715
    .line 716
    iget-object v1, v1, Log0;->δ:Ljava/lang/String;

    .line 717
    .line 718
    const-string v2, "; exhausted proxy configurations: "

    .line 719
    .line 720
    iget-object v0, v0, Lcp1;->δ:Ljava/util/List;

    .line 721
    .line 722
    new-instance v3, Ljava/lang/StringBuilder;

    .line 723
    .line 724
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    .line 732
    .line 733
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 734
    .line 735
    .line 736
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    invoke-direct {p0, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    throw p0

    .line 744
    :cond_25
    :goto_10
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-eqz v2, :cond_26

    .line 749
    .line 750
    iget-object v2, v0, Lcp1;->η:Ljava/util/ArrayList;

    .line 751
    .line 752
    invoke-static {v3, v2}, Lxh;->ю(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 753
    .line 754
    .line 755
    iget-object v0, v0, Lcp1;->η:Ljava/util/ArrayList;

    .line 756
    .line 757
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 758
    .line 759
    .line 760
    :cond_26
    new-instance v0, Lv;

    .line 761
    .line 762
    const/4 v2, 0x5

    .line 763
    invoke-direct {v0, v2, v3}, Lv;-><init>(ILjava/util/ArrayList;)V

    .line 764
    .line 765
    .line 766
    iput-object v0, p0, Lal1;->ν:Lv;

    .line 767
    .line 768
    iget-object v2, p0, Lal1;->λ:Luk1;

    .line 769
    .line 770
    iget-boolean v2, v2, Luk1;->υ:Z

    .line 771
    .line 772
    if-nez v2, :cond_29

    .line 773
    .line 774
    iget v2, v0, Lv;->α:I

    .line 775
    .line 776
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 777
    .line 778
    .line 779
    move-result v4

    .line 780
    if-ge v2, v4, :cond_28

    .line 781
    .line 782
    iget v1, v0, Lv;->α:I

    .line 783
    .line 784
    add-int/lit8 v2, v1, 0x1

    .line 785
    .line 786
    iput v2, v0, Lv;->α:I

    .line 787
    .line 788
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    check-cast v0, Lzo1;

    .line 793
    .line 794
    invoke-virtual {p0, v0, v3}, Lal1;->γ(Lzo1;Ljava/util/ArrayList;)Lmo;

    .line 795
    .line 796
    .line 797
    move-result-object v0

    .line 798
    :goto_11
    iget-object v1, v0, Lmo;->λ:Ljava/util/List;

    .line 799
    .line 800
    invoke-virtual {p0, v0, v1}, Lal1;->δ(Lmo;Ljava/util/List;)Ljo1;

    .line 801
    .line 802
    .line 803
    move-result-object p0

    .line 804
    if-eqz p0, :cond_27

    .line 805
    .line 806
    return-object p0

    .line 807
    :cond_27
    return-object v0

    .line 808
    :cond_28
    invoke-static {}, Lγ;->ο()V

    .line 809
    .line 810
    .line 811
    return-object v1

    .line 812
    :cond_29
    const-string p0, "Canceled"

    .line 813
    .line 814
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    return-object v1

    .line 818
    :cond_2a
    invoke-static {}, Lγ;->ο()V

    .line 819
    .line 820
    .line 821
    return-object v1

    .line 822
    :cond_2b
    const-string p0, "exhausted all routes"

    .line 823
    .line 824
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 825
    .line 826
    .line 827
    return-object v1

    .line 828
    :goto_12
    monitor-exit v0

    .line 829
    throw p0
.end method

.method public final γ(Lzo1;Ljava/util/ArrayList;)Lmo;
    .locals 15

    .line 1
    move-object/from16 v10, p1

    .line 2
    .line 3
    sget-object v0, Lzj1;->λ:Lzj1;

    .line 4
    .line 5
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v10, Lzo1;->α:Lp;

    .line 9
    .line 10
    iget-object v2, v1, Lp;->γ:Ljavax/net/ssl/SSLSocketFactory;

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    iget-object v1, v1, Lp;->κ:Ljava/util/List;

    .line 15
    .line 16
    sget-object v2, Lpo;->ζ:Lpo;

    .line 17
    .line 18
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, v10, Lzo1;->α:Lp;

    .line 25
    .line 26
    iget-object v1, v1, Lp;->θ:Log0;

    .line 27
    .line 28
    iget-object v1, v1, Log0;->δ:Ljava/lang/String;

    .line 29
    .line 30
    sget-object v2, Lgh1;->α:Lf0;

    .line 31
    .line 32
    sget-object v2, Lgh1;->α:Lf0;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2, v1}, Landroid/security/NetworkSecurityPolicy;->isCleartextTrafficPermitted(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance p0, Ljava/net/UnknownServiceException;

    .line 52
    .line 53
    const-string v0, "CLEARTEXT communication to "

    .line 54
    .line 55
    const-string v2, " not permitted by network security policy"

    .line 56
    .line 57
    invoke-static {v0, v1, v2}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p0, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_1
    new-instance p0, Ljava/net/UnknownServiceException;

    .line 66
    .line 67
    const-string v0, "CLEARTEXT communication not enabled for client"

    .line 68
    .line 69
    invoke-direct {p0, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0

    .line 73
    :cond_2
    iget-object v1, v1, Lp;->ι:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    :goto_0
    iget-object v1, v10, Lzo1;->β:Ljava/net/Proxy;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    if-eq v1, v2, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    iget-object v1, v10, Lzo1;->α:Lp;

    .line 94
    .line 95
    iget-object v2, v1, Lp;->γ:Ljavax/net/ssl/SSLSocketFactory;

    .line 96
    .line 97
    if-nez v2, :cond_5

    .line 98
    .line 99
    iget-object v1, v1, Lp;->ι:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    :goto_1
    move-object v12, v3

    .line 109
    goto/16 :goto_4

    .line 110
    .line 111
    :cond_5
    :goto_2
    new-instance v0, Lb8;

    .line 112
    .line 113
    const/4 v1, 0x6

    .line 114
    invoke-direct {v0, v1}, Lb8;-><init>(I)V

    .line 115
    .line 116
    .line 117
    iget-object v1, v10, Lzo1;->α:Lp;

    .line 118
    .line 119
    iget-object v1, v1, Lp;->θ:Log0;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iput-object v1, v0, Lb8;->α:Ljava/lang/Object;

    .line 125
    .line 126
    const-string v1, "CONNECT"

    .line 127
    .line 128
    invoke-virtual {v0, v1, v3}, Lb8;->μ(Ljava/lang/String;Lkn1;)V

    .line 129
    .line 130
    .line 131
    iget-object v1, v10, Lzo1;->α:Lp;

    .line 132
    .line 133
    iget-object v2, v1, Lp;->θ:Log0;

    .line 134
    .line 135
    const/4 v3, 0x1

    .line 136
    invoke-static {v2, v3}, Lud2;->θ(Log0;Z)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const-string v3, "Host"

    .line 141
    .line 142
    invoke-virtual {v0, v3, v2}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const-string v2, "Proxy-Connection"

    .line 146
    .line 147
    const-string v3, "Keep-Alive"

    .line 148
    .line 149
    invoke-virtual {v0, v2, v3}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v2, "User-Agent"

    .line 153
    .line 154
    const-string v3, "okhttp/5.3.2"

    .line 155
    .line 156
    invoke-virtual {v0, v2, v3}, Lb8;->ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    new-instance v3, Li5;

    .line 160
    .line 161
    invoke-direct {v3, v0}, Li5;-><init>(Lb8;)V

    .line 162
    .line 163
    .line 164
    sget-object v0, Lbo1;->ε:Lao1;

    .line 165
    .line 166
    new-instance v2, Ljava/util/ArrayList;

    .line 167
    .line 168
    const/16 v4, 0x14

    .line 169
    .line 170
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    .line 172
    .line 173
    const-string v4, "Proxy-Authenticate"

    .line 174
    .line 175
    invoke-static {v4}, Lv81;->ζ(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    const-string v5, "OkHttp-Preemptive"

    .line 179
    .line 180
    invoke-static {v5, v4}, Lv81;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    const/4 v6, 0x0

    .line 184
    move v7, v6

    .line 185
    :goto_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    if-ge v7, v8, :cond_7

    .line 190
    .line 191
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v8

    .line 195
    check-cast v8, Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v4, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-eqz v8, :cond_6

    .line 202
    .line 203
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    add-int/lit8 v7, v7, -0x2

    .line 210
    .line 211
    :cond_6
    add-int/lit8 v7, v7, 0x2

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_7
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    invoke-static {v5}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    new-instance v4, Lvc0;

    .line 229
    .line 230
    new-array v5, v6, [Ljava/lang/String;

    .line 231
    .line 232
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    check-cast v2, [Ljava/lang/String;

    .line 237
    .line 238
    invoke-direct {v4, v2}, Lvc0;-><init>([Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object v0, v1, Lp;->ζ:Lx;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :goto_4
    new-instance v0, Lmo;

    .line 252
    .line 253
    iget-object v1, p0, Lal1;->α:Lx22;

    .line 254
    .line 255
    iget-object v2, p0, Lal1;->β:Lxk1;

    .line 256
    .line 257
    iget v3, p0, Lal1;->γ:I

    .line 258
    .line 259
    iget v4, p0, Lal1;->δ:I

    .line 260
    .line 261
    iget v5, p0, Lal1;->ε:I

    .line 262
    .line 263
    iget v6, p0, Lal1;->ζ:I

    .line 264
    .line 265
    iget-boolean v7, p0, Lal1;->η:Z

    .line 266
    .line 267
    iget-object v8, p0, Lal1;->λ:Luk1;

    .line 268
    .line 269
    const/4 v13, -0x1

    .line 270
    const/4 v14, 0x0

    .line 271
    move-object v9, p0

    .line 272
    move-object/from16 v11, p2

    .line 273
    .line 274
    invoke-direct/range {v0 .. v14}, Lmo;-><init>(Lx22;Lxk1;IIIIZLuk1;Lal1;Lzo1;Ljava/util/List;Li5;IZ)V

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    :cond_8
    new-instance p0, Ljava/net/UnknownServiceException;

    .line 279
    .line 280
    const-string v0, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    .line 281
    .line 282
    invoke-direct {p0, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    throw p0
.end method

.method public final δ(Lmo;Ljava/util/List;)Ljo1;
    .locals 10

    .line 1
    iget-object v0, p0, Lal1;->β:Lxk1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lal1;->μ:Z

    .line 4
    .line 5
    iget-object v2, p0, Lal1;->ι:Lp;

    .line 6
    .line 7
    iget-object v3, p0, Lal1;->λ:Luk1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Lmo;->ε()Z

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    move v6, v5

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v6, v4

    .line 22
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Lxk1;->δ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    const/4 v8, 0x0

    .line 39
    if-eqz v7, :cond_6

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, Lvk1;

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    monitor-enter v7

    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    :try_start_0
    iget-object v9, v7, Lvk1;->ι:Ldg0;

    .line 54
    .line 55
    if-eqz v9, :cond_2

    .line 56
    .line 57
    move v9, v5

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move v9, v4

    .line 60
    :goto_2
    if-nez v9, :cond_3

    .line 61
    .line 62
    :goto_3
    move v9, v4

    .line 63
    goto :goto_4

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    goto :goto_5

    .line 66
    :cond_3
    invoke-virtual {v7, v2, p2}, Lvk1;->ε(Lp;Ljava/util/List;)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-nez v9, :cond_4

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    invoke-virtual {v3, v7}, Luk1;->α(Lvk1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    .line 76
    move v9, v5

    .line 77
    :goto_4
    monitor-exit v7

    .line 78
    if-eqz v9, :cond_1

    .line 79
    .line 80
    invoke-virtual {v7, v1}, Lvk1;->η(Z)Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_5

    .line 85
    .line 86
    goto :goto_6

    .line 87
    :cond_5
    monitor-enter v7

    .line 88
    :try_start_1
    iput-boolean v5, v7, Lvk1;->κ:Z

    .line 89
    .line 90
    invoke-virtual {v3}, Luk1;->ι()Ljava/net/Socket;

    .line 91
    .line 92
    .line 93
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    monitor-exit v7

    .line 95
    if-eqz v8, :cond_1

    .line 96
    .line 97
    invoke-static {v8}, Lud2;->γ(Ljava/net/Socket;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catchall_1
    move-exception p0

    .line 102
    monitor-exit v7

    .line 103
    throw p0

    .line 104
    :goto_5
    monitor-exit v7

    .line 105
    throw p0

    .line 106
    :cond_6
    move-object v7, v8

    .line 107
    :goto_6
    if-nez v7, :cond_7

    .line 108
    .line 109
    return-object v8

    .line 110
    :cond_7
    if-eqz p1, :cond_8

    .line 111
    .line 112
    iget-object p2, p1, Lmo;->κ:Lzo1;

    .line 113
    .line 114
    iput-object p2, p0, Lal1;->ο:Lzo1;

    .line 115
    .line 116
    iget-object p0, p1, Lmo;->ρ:Ljava/net/Socket;

    .line 117
    .line 118
    if-eqz p0, :cond_8

    .line 119
    .line 120
    invoke-static {p0}, Lud2;->γ(Ljava/net/Socket;)V

    .line 121
    .line 122
    .line 123
    :cond_8
    new-instance p0, Ljo1;

    .line 124
    .line 125
    invoke-direct {p0, v7}, Ljo1;-><init>(Lvk1;)V

    .line 126
    .line 127
    .line 128
    return-object p0
.end method
