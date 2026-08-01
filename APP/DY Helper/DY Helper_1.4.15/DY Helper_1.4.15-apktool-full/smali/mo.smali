.class public final Lmo;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lbp1;
.implements La00;


# instance fields
.field public final α:Lx22;

.field public final β:Lxk1;

.field public final γ:I

.field public final δ:I

.field public final ε:I

.field public final ζ:I

.field public final η:Z

.field public final θ:Luk1;

.field public final ι:Lal1;

.field public final κ:Lzo1;

.field public final λ:Ljava/util/List;

.field public final μ:Li5;

.field public final ν:I

.field public final ξ:Z

.field public volatile ο:Z

.field public π:Ljava/net/Socket;

.field public ρ:Ljava/net/Socket;

.field public σ:Lqc0;

.field public τ:Lzj1;

.field public υ:Lm6;

.field public φ:Lvk1;


# direct methods
.method public constructor <init>(Lx22;Lxk1;IIIIZLuk1;Lal1;Lzo1;Ljava/util/List;Li5;IZ)V
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
    iput-object p1, p0, Lmo;->α:Lx22;

    .line 14
    .line 15
    iput-object p2, p0, Lmo;->β:Lxk1;

    .line 16
    .line 17
    iput p3, p0, Lmo;->γ:I

    .line 18
    .line 19
    iput p4, p0, Lmo;->δ:I

    .line 20
    .line 21
    iput p5, p0, Lmo;->ε:I

    .line 22
    .line 23
    iput p6, p0, Lmo;->ζ:I

    .line 24
    .line 25
    iput-boolean p7, p0, Lmo;->η:Z

    .line 26
    .line 27
    iput-object p8, p0, Lmo;->θ:Luk1;

    .line 28
    .line 29
    iput-object p9, p0, Lmo;->ι:Lal1;

    .line 30
    .line 31
    iput-object p10, p0, Lmo;->κ:Lzo1;

    .line 32
    .line 33
    iput-object p11, p0, Lmo;->λ:Ljava/util/List;

    .line 34
    .line 35
    iput-object p12, p0, Lmo;->μ:Li5;

    .line 36
    .line 37
    iput p13, p0, Lmo;->ν:I

    .line 38
    .line 39
    iput-boolean p14, p0, Lmo;->ξ:Z

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lmo;->ο:Z

    .line 3
    .line 4
    iget-object p0, p0, Lmo;->π:Ljava/net/Socket;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Lud2;->γ(Ljava/net/Socket;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final α()Lbp1;
    .locals 15

    .line 1
    new-instance v0, Lmo;

    .line 2
    .line 3
    iget v13, p0, Lmo;->ν:I

    .line 4
    .line 5
    iget-boolean v14, p0, Lmo;->ξ:Z

    .line 6
    .line 7
    iget-object v1, p0, Lmo;->α:Lx22;

    .line 8
    .line 9
    iget-object v2, p0, Lmo;->β:Lxk1;

    .line 10
    .line 11
    iget v3, p0, Lmo;->γ:I

    .line 12
    .line 13
    iget v4, p0, Lmo;->δ:I

    .line 14
    .line 15
    iget v5, p0, Lmo;->ε:I

    .line 16
    .line 17
    iget v6, p0, Lmo;->ζ:I

    .line 18
    .line 19
    iget-boolean v7, p0, Lmo;->η:Z

    .line 20
    .line 21
    iget-object v8, p0, Lmo;->θ:Luk1;

    .line 22
    .line 23
    iget-object v9, p0, Lmo;->ι:Lal1;

    .line 24
    .line 25
    iget-object v10, p0, Lmo;->κ:Lzo1;

    .line 26
    .line 27
    iget-object v11, p0, Lmo;->λ:Ljava/util/List;

    .line 28
    .line 29
    iget-object v12, p0, Lmo;->μ:Li5;

    .line 30
    .line 31
    invoke-direct/range {v0 .. v14}, Lmo;-><init>(Lx22;Lxk1;IIIIZLuk1;Lal1;Lzo1;Ljava/util/List;Li5;IZ)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final β(Luk1;Ljava/io/IOException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final γ()Lap1;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lmo;->β:Lxk1;

    .line 4
    .line 5
    iget-object v0, v1, Lmo;->θ:Luk1;

    .line 6
    .line 7
    iget-object v3, v0, Luk1;->χ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    iget-object v8, v1, Lmo;->π:Ljava/net/Socket;

    .line 10
    .line 11
    if-eqz v8, :cond_12

    .line 12
    .line 13
    invoke-virtual {v1}, Lmo;->ε()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_11

    .line 18
    .line 19
    iget-object v0, v1, Lmo;->κ:Lzo1;

    .line 20
    .line 21
    iget-object v4, v0, Lzo1;->α:Lp;

    .line 22
    .line 23
    iget-object v13, v0, Lzo1;->γ:Ljava/net/InetSocketAddress;

    .line 24
    .line 25
    iget-object v0, v0, Lzo1;->α:Lp;

    .line 26
    .line 27
    iget-object v4, v4, Lp;->κ:Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    const/4 v14, 0x0

    .line 33
    const/4 v15, 0x0

    .line 34
    :try_start_0
    iget-object v5, v1, Lmo;->μ:Li5;

    .line 35
    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, Lmo;->λ()Lap1;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    iget-object v6, v5, Lap1;->γ:Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    if-eqz v6, :cond_1

    .line 45
    .line 46
    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    iget-object v0, v1, Lmo;->ρ:Ljava/net/Socket;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-static {v0}, Lud2;->γ(Ljava/net/Socket;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    invoke-static {v8}, Lud2;->γ(Ljava/net/Socket;)V

    .line 57
    .line 58
    .line 59
    return-object v5

    .line 60
    :catchall_0
    move-exception v0

    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :catch_0
    move-exception v0

    .line 64
    move-object v4, v15

    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_1
    :try_start_1
    iget-object v5, v0, Lp;->γ:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    const/4 v6, 0x1

    .line 70
    const-string v7, "socket"

    .line 71
    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    :try_start_2
    iget-object v5, v1, Lmo;->υ:Lm6;

    .line 75
    .line 76
    if-eqz v5, :cond_4

    .line 77
    .line 78
    iget-object v5, v5, Lm6;->η:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v5, Lrk1;

    .line 81
    .line 82
    iget-object v5, v5, Lrk1;->ζ:Lsc;

    .line 83
    .line 84
    invoke-virtual {v5}, Lsc;->η()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    iget-object v5, v1, Lmo;->υ:Lm6;

    .line 91
    .line 92
    if-eqz v5, :cond_2

    .line 93
    .line 94
    iget-object v5, v5, Lm6;->θ:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, Lqk1;

    .line 97
    .line 98
    iget-object v5, v5, Lqk1;->ζ:Lsc;

    .line 99
    .line 100
    invoke-virtual {v5}, Lsc;->η()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_3

    .line 105
    .line 106
    iget-object v5, v0, Lp;->γ:Ljavax/net/ssl/SSLSocketFactory;

    .line 107
    .line 108
    iget-object v0, v0, Lp;->θ:Log0;

    .line 109
    .line 110
    iget-object v9, v0, Log0;->δ:Ljava/lang/String;

    .line 111
    .line 112
    iget v0, v0, Log0;->ε:I

    .line 113
    .line 114
    invoke-virtual {v5, v8, v9, v0, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    check-cast v0, Ljavax/net/ssl/SSLSocket;

    .line 122
    .line 123
    invoke-virtual {v1, v4, v0}, Lmo;->ν(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lmo;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    iget v9, v5, Lmo;->ν:I

    .line 128
    .line 129
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    check-cast v9, Lpo;

    .line 134
    .line 135
    invoke-virtual {v5, v4, v0}, Lmo;->μ(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lmo;

    .line 136
    .line 137
    .line 138
    move-result-object v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    :try_start_3
    iget-boolean v5, v5, Lmo;->ξ:Z

    .line 140
    .line 141
    invoke-virtual {v9, v0, v5}, Lpo;->α(Ljavax/net/ssl/SSLSocket;Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v0, v9}, Lmo;->κ(Ljavax/net/ssl/SSLSocket;Lpo;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 145
    .line 146
    .line 147
    move-object/from16 v16, v4

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :catch_1
    move-exception v0

    .line 151
    goto/16 :goto_2

    .line 152
    .line 153
    :cond_2
    :try_start_4
    invoke-static {v7}, Lln0;->и(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v15

    .line 157
    :cond_3
    new-instance v0, Ljava/io/IOException;

    .line 158
    .line 159
    const-string v4, "TLS tunnel buffered too many bytes!"

    .line 160
    .line 161
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_4
    invoke-static {v7}, Lln0;->и(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    throw v15

    .line 169
    :cond_5
    iput-object v8, v1, Lmo;->ρ:Ljava/net/Socket;

    .line 170
    .line 171
    iget-object v0, v0, Lp;->ι:Ljava/util/List;

    .line 172
    .line 173
    sget-object v4, Lzj1;->λ:Lzj1;

    .line 174
    .line 175
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_6

    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_6
    sget-object v4, Lzj1;->θ:Lzj1;

    .line 183
    .line 184
    :goto_0
    iput-object v4, v1, Lmo;->τ:Lzj1;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 185
    .line 186
    move-object/from16 v16, v15

    .line 187
    .line 188
    :goto_1
    :try_start_5
    new-instance v4, Lvk1;

    .line 189
    .line 190
    iget-object v5, v1, Lmo;->α:Lx22;

    .line 191
    .line 192
    move v9, v6

    .line 193
    iget-object v6, v1, Lmo;->β:Lxk1;

    .line 194
    .line 195
    move-object v0, v7

    .line 196
    iget-object v7, v1, Lmo;->κ:Lzo1;

    .line 197
    .line 198
    move v10, v9

    .line 199
    iget-object v9, v1, Lmo;->ρ:Ljava/net/Socket;

    .line 200
    .line 201
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move v11, v10

    .line 205
    iget-object v10, v1, Lmo;->σ:Lqc0;

    .line 206
    .line 207
    move v12, v11

    .line 208
    iget-object v11, v1, Lmo;->τ:Lzj1;

    .line 209
    .line 210
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move/from16 v17, v12

    .line 214
    .line 215
    iget-object v12, v1, Lmo;->υ:Lm6;

    .line 216
    .line 217
    if-eqz v12, :cond_7

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-direct/range {v4 .. v12}, Lvk1;-><init>(Lx22;Lxk1;Lzo1;Ljava/net/Socket;Ljava/net/Socket;Lqc0;Lzj1;Lm6;)V

    .line 223
    .line 224
    .line 225
    iput-object v4, v1, Lmo;->φ:Lvk1;

    .line 226
    .line 227
    invoke-virtual {v4}, Lvk1;->ι()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 231
    .line 232
    .line 233
    :try_start_6
    new-instance v0, Lap1;

    .line 234
    .line 235
    const/4 v4, 0x6

    .line 236
    invoke-direct {v0, v1, v15, v4}, Lap1;-><init>(Lbp1;Ljava/lang/Throwable;I)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    return-object v0

    .line 243
    :catchall_1
    move-exception v0

    .line 244
    move/from16 v14, v17

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :catch_2
    move-exception v0

    .line 248
    move-object/from16 v4, v16

    .line 249
    .line 250
    move/from16 v14, v17

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :catch_3
    move-exception v0

    .line 254
    move-object/from16 v4, v16

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_7
    :try_start_7
    invoke-static {v0}, Lln0;->и(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    throw v15
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 261
    :goto_2
    :try_start_8
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    iget-boolean v2, v1, Lmo;->η:Z

    .line 268
    .line 269
    if-eqz v2, :cond_c

    .line 270
    .line 271
    instance-of v2, v0, Ljava/net/ProtocolException;

    .line 272
    .line 273
    if-eqz v2, :cond_8

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_8
    instance-of v2, v0, Ljava/io/InterruptedIOException;

    .line 277
    .line 278
    if-eqz v2, :cond_9

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_9
    instance-of v2, v0, Ljavax/net/ssl/SSLHandshakeException;

    .line 282
    .line 283
    if-eqz v2, :cond_a

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    instance-of v2, v2, Ljava/security/cert/CertificateException;

    .line 290
    .line 291
    if-eqz v2, :cond_a

    .line 292
    .line 293
    goto :goto_3

    .line 294
    :cond_a
    instance-of v2, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 295
    .line 296
    if-eqz v2, :cond_b

    .line 297
    .line 298
    goto :goto_3

    .line 299
    :cond_b
    instance-of v2, v0, Ljavax/net/ssl/SSLException;

    .line 300
    .line 301
    if-eqz v2, :cond_c

    .line 302
    .line 303
    move-object v15, v4

    .line 304
    :cond_c
    :goto_3
    new-instance v2, Lap1;

    .line 305
    .line 306
    invoke-direct {v2, v1, v15, v0}, Lap1;-><init>(Lbp1;Lmo;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 307
    .line 308
    .line 309
    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    if-nez v14, :cond_e

    .line 313
    .line 314
    iget-object v0, v1, Lmo;->ρ:Ljava/net/Socket;

    .line 315
    .line 316
    if-eqz v0, :cond_d

    .line 317
    .line 318
    invoke-static {v0}, Lud2;->γ(Ljava/net/Socket;)V

    .line 319
    .line 320
    .line 321
    :cond_d
    invoke-static {v8}, Lud2;->γ(Ljava/net/Socket;)V

    .line 322
    .line 323
    .line 324
    :cond_e
    return-object v2

    .line 325
    :goto_4
    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    if-nez v14, :cond_10

    .line 329
    .line 330
    iget-object v1, v1, Lmo;->ρ:Ljava/net/Socket;

    .line 331
    .line 332
    if-eqz v1, :cond_f

    .line 333
    .line 334
    invoke-static {v1}, Lud2;->γ(Ljava/net/Socket;)V

    .line 335
    .line 336
    .line 337
    :cond_f
    invoke-static {v8}, Lud2;->γ(Ljava/net/Socket;)V

    .line 338
    .line 339
    .line 340
    :cond_10
    throw v0

    .line 341
    :cond_11
    const-string v0, "already connected"

    .line 342
    .line 343
    invoke-static {v0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    :goto_5
    const/4 v0, 0x0

    .line 347
    return-object v0

    .line 348
    :cond_12
    const-string v0, "TCP not connected"

    .line 349
    .line 350
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    goto :goto_5
.end method

.method public final δ()Lvk1;
    .locals 5

    .line 1
    iget-object v0, p0, Lmo;->θ:Luk1;

    .line 2
    .line 3
    iget-object v0, v0, Luk1;->ε:Lt41;

    .line 4
    .line 5
    iget-object v0, v0, Lt41;->Α:Lij0;

    .line 6
    .line 7
    iget-object v1, p0, Lmo;->κ:Lzo1;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 16
    .line 17
    .line 18
    monitor-exit v0

    .line 19
    iget-object v0, p0, Lmo;->φ:Lvk1;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lmo;->κ:Lzo1;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lmo;->ι:Lal1;

    .line 30
    .line 31
    iget-object v2, p0, Lmo;->λ:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {v1, p0, v2}, Lal1;->δ(Lmo;Ljava/util/List;)Ljo1;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    iget-object p0, v1, Ljo1;->α:Lvk1;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_0
    monitor-enter v0

    .line 43
    :try_start_1
    iget-object v1, p0, Lmo;->β:Lxk1;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    sget-object v2, Lud2;->α:Ljava/util/TimeZone;

    .line 49
    .line 50
    iget-object v2, v1, Lxk1;->δ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 51
    .line 52
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    iget-object v2, v1, Lxk1;->β:Lw22;

    .line 56
    .line 57
    iget-object v1, v1, Lxk1;->γ:Lwk1;

    .line 58
    .line 59
    const-wide/16 v3, 0x0

    .line 60
    .line 61
    invoke-virtual {v2, v1, v3, v4}, Lw22;->γ(Lt22;J)V

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Lmo;->θ:Luk1;

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Luk1;->α(Lvk1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    monitor-exit v0

    .line 70
    return-object v0

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    monitor-exit v0

    .line 73
    throw p0

    .line 74
    :catchall_1
    move-exception p0

    .line 75
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 76
    throw p0
.end method

.method public final ε()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lmo;->τ:Lzj1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final ζ()Lzo1;
    .locals 0

    .line 1
    iget-object p0, p0, Lmo;->κ:Lzo1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final η()Lap1;
    .locals 8

    .line 1
    iget-object v0, p0, Lmo;->β:Lxk1;

    .line 2
    .line 3
    iget-object v1, p0, Lmo;->θ:Luk1;

    .line 4
    .line 5
    iget-object v1, v1, Luk1;->χ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    iget-object v2, p0, Lmo;->κ:Lzo1;

    .line 8
    .line 9
    iget-object v3, p0, Lmo;->π:Ljava/net/Socket;

    .line 10
    .line 11
    if-nez v3, :cond_3

    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :try_start_0
    iget-object v4, v2, Lzo1;->γ:Ljava/net/InetSocketAddress;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lmo;->ι()V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    new-instance v4, Lap1;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x6

    .line 33
    invoke-direct {v4, p0, v5, v6}, Lap1;-><init>(Lbp1;Ljava/lang/Throwable;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-object v4

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception v4

    .line 43
    :try_start_1
    iget-object v5, v2, Lzo1;->α:Lp;

    .line 44
    .line 45
    iget-object v5, v2, Lzo1;->β:Ljava/net/Proxy;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    sget-object v6, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 52
    .line 53
    if-eq v5, v6, :cond_0

    .line 54
    .line 55
    iget-object v5, v2, Lzo1;->α:Lp;

    .line 56
    .line 57
    iget-object v6, v5, Lp;->η:Ljava/net/ProxySelector;

    .line 58
    .line 59
    iget-object v5, v5, Lp;->θ:Log0;

    .line 60
    .line 61
    invoke-virtual {v5}, Log0;->η()Ljava/net/URI;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    iget-object v7, v2, Lzo1;->β:Ljava/net/Proxy;

    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v6, v5, v7, v4}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    iget-object v2, v2, Lzo1;->γ:Ljava/net/InetSocketAddress;

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v0, Lap1;

    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    invoke-direct {v0, p0, v4, v2}, Lap1;-><init>(Lbp1;Ljava/lang/Throwable;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    if-nez v3, :cond_1

    .line 92
    .line 93
    iget-object p0, p0, Lmo;->π:Ljava/net/Socket;

    .line 94
    .line 95
    if-eqz p0, :cond_1

    .line 96
    .line 97
    invoke-static {p0}, Lud2;->γ(Ljava/net/Socket;)V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-object v0

    .line 101
    :goto_0
    invoke-virtual {v1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    if-nez v3, :cond_2

    .line 105
    .line 106
    iget-object p0, p0, Lmo;->π:Ljava/net/Socket;

    .line 107
    .line 108
    if-eqz p0, :cond_2

    .line 109
    .line 110
    invoke-static {p0}, Lud2;->γ(Ljava/net/Socket;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    throw v0

    .line 114
    :cond_3
    const-string p0, "TCP already connected"

    .line 115
    .line 116
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    const/4 p0, 0x0

    .line 120
    return-object p0
.end method

.method public final θ()V
    .locals 0

    .line 1
    return-void
.end method

.method public final ι()V
    .locals 4

    .line 1
    iget-object v0, p0, Lmo;->κ:Lzo1;

    .line 2
    .line 3
    iget-object v0, v0, Lzo1;->β:Ljava/net/Proxy;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Llo;->α:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    new-instance v0, Ljava/net/Socket;

    .line 28
    .line 29
    iget-object v1, p0, Lmo;->κ:Lzo1;

    .line 30
    .line 31
    iget-object v1, v1, Lzo1;->β:Ljava/net/Proxy;

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v0, p0, Lmo;->κ:Lzo1;

    .line 38
    .line 39
    iget-object v0, v0, Lzo1;->α:Lp;

    .line 40
    .line 41
    iget-object v0, v0, Lp;->β:Ljavax/net/SocketFactory;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    :goto_1
    iput-object v0, p0, Lmo;->π:Ljava/net/Socket;

    .line 51
    .line 52
    iget-boolean v1, p0, Lmo;->ο:Z

    .line 53
    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    iget v1, p0, Lmo;->ζ:I

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 59
    .line 60
    .line 61
    :try_start_0
    sget-object v1, Lgh1;->α:Lf0;

    .line 62
    .line 63
    sget-object v1, Lgh1;->α:Lf0;

    .line 64
    .line 65
    iget-object v2, p0, Lmo;->κ:Lzo1;

    .line 66
    .line 67
    iget-object v2, v2, Lzo1;->γ:Ljava/net/InetSocketAddress;

    .line 68
    .line 69
    iget v3, p0, Lmo;->ε:I

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2, v3}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 78
    .line 79
    .line 80
    :try_start_1
    new-instance v1, Li0;

    .line 81
    .line 82
    invoke-direct {v1, v0}, Li0;-><init>(Ljava/net/Socket;)V

    .line 83
    .line 84
    .line 85
    new-instance v0, Lm6;

    .line 86
    .line 87
    invoke-direct {v0, v1}, Lm6;-><init>(Li0;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Lmo;->υ:Lm6;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 91
    .line 92
    return-void

    .line 93
    :catch_0
    move-exception p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "throw with null exception"

    .line 99
    .line 100
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_2

    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 108
    .line 109
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :catch_1
    move-exception v0

    .line 114
    new-instance v1, Ljava/net/ConnectException;

    .line 115
    .line 116
    new-instance v2, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v3, "Failed to connect to "

    .line 119
    .line 120
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget-object p0, p0, Lmo;->κ:Lzo1;

    .line 124
    .line 125
    iget-object p0, p0, Lzo1;->γ:Ljava/net/InetSocketAddress;

    .line 126
    .line 127
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-direct {v1, p0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 138
    .line 139
    .line 140
    throw v1

    .line 141
    :cond_3
    const-string p0, "canceled"

    .line 142
    .line 143
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-void
.end method

.method public final κ(Ljavax/net/ssl/SSLSocket;Lpo;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lmo;->κ:Lzo1;

    .line 2
    .line 3
    iget-object v0, v0, Lzo1;->α:Lp;

    .line 4
    .line 5
    :try_start_0
    iget-boolean v1, p2, Lpo;->β:Z

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    sget-object v1, Lgh1;->α:Lf0;

    .line 11
    .line 12
    sget-object v1, Lgh1;->α:Lf0;

    .line 13
    .line 14
    iget-object v3, v0, Lp;->θ:Log0;

    .line 15
    .line 16
    iget-object v3, v3, Log0;->δ:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, v0, Lp;->ι:Ljava/util/List;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Lf0;->γ:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    move-object v6, v5

    .line 43
    check-cast v6, Lmx1;

    .line 44
    .line 45
    invoke-interface {v6, p1}, Lmx1;->α(Ljavax/net/ssl/SSLSocket;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v5, v2

    .line 53
    :goto_0
    check-cast v5, Lmx1;

    .line 54
    .line 55
    if-eqz v5, :cond_2

    .line 56
    .line 57
    invoke-interface {v5, p1, v3, v4}, Lmx1;->δ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {v1}, Ljx0;->Β(Ljavax/net/ssl/SSLSession;)Lqc0;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, v0, Lp;->δ:Ljavax/net/ssl/HostnameVerifier;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object v5, v0, Lp;->θ:Log0;

    .line 84
    .line 85
    iget-object v5, v5, Log0;->δ:Ljava/lang/String;

    .line 86
    .line 87
    invoke-interface {v4, v5, v1}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_4

    .line 92
    .line 93
    invoke-virtual {v3}, Lqc0;->α()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    if-nez p2, :cond_3

    .line 102
    .line 103
    const/4 p2, 0x0

    .line 104
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 112
    .line 113
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 114
    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v2, "\n            |Hostname "

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-object v0, v0, Lp;->θ:Log0;

    .line 126
    .line 127
    iget-object v0, v0, Log0;->δ:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v0, " not verified:\n            |    certificate: "

    .line 133
    .line 134
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    sget-object v0, Lje;->γ:Lje;

    .line 138
    .line 139
    invoke-static {p0}, Lyh;->и(Ljava/security/cert/X509Certificate;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, "\n            |    DN: "

    .line 147
    .line 148
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string v0, "\n            |    subjectAltNames: "

    .line 163
    .line 164
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const/4 v0, 0x7

    .line 168
    invoke-static {p0, v0}, Lr41;->α(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const/4 v2, 0x2

    .line 173
    invoke-static {p0, v2}, Lr41;->α(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-static {v0, p0}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p0, "\n            "

    .line 185
    .line 186
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-static {p0}, Lr02;->Ζ(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-direct {p2, p0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw p2

    .line 201
    :cond_3
    new-instance p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 202
    .line 203
    new-instance p2, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    const-string v1, "Hostname "

    .line 209
    .line 210
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    iget-object v0, v0, Lp;->θ:Log0;

    .line 214
    .line 215
    iget-object v0, v0, Log0;->δ:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v0, " not verified (no certificates)"

    .line 221
    .line 222
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p2

    .line 229
    invoke-direct {p0, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    throw p0

    .line 233
    :cond_4
    iget-object v1, v0, Lp;->ε:Lje;

    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    new-instance v4, Lqc0;

    .line 239
    .line 240
    iget-object v5, v3, Lqc0;->α:Lq42;

    .line 241
    .line 242
    iget-object v6, v3, Lqc0;->β:Luf;

    .line 243
    .line 244
    iget-object v7, v3, Lqc0;->γ:Ljava/util/List;

    .line 245
    .line 246
    new-instance v8, Lz7;

    .line 247
    .line 248
    const/4 v9, 0x4

    .line 249
    invoke-direct {v8, v1, v3, v0, v9}, Lz7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v4, v5, v6, v7, v8}, Lqc0;-><init>(Lq42;Luf;Ljava/util/List;Lp70;)V

    .line 253
    .line 254
    .line 255
    iput-object v4, p0, Lmo;->σ:Lqc0;

    .line 256
    .line 257
    iget-object v0, v0, Lp;->θ:Log0;

    .line 258
    .line 259
    iget-object v0, v0, Log0;->δ:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    iget-object v0, v1, Lje;->α:Ljava/util/Set;

    .line 265
    .line 266
    check-cast v0, Ljava/lang/Iterable;

    .line 267
    .line 268
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-nez v1, :cond_9

    .line 277
    .line 278
    iget-boolean p2, p2, Lpo;->β:Z

    .line 279
    .line 280
    if-eqz p2, :cond_7

    .line 281
    .line 282
    sget-object p2, Lgh1;->α:Lf0;

    .line 283
    .line 284
    sget-object p2, Lgh1;->α:Lf0;

    .line 285
    .line 286
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    iget-object p2, p2, Lf0;->γ:Ljava/util/ArrayList;

    .line 290
    .line 291
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object p2

    .line 295
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_6

    .line 300
    .line 301
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    move-object v1, v0

    .line 306
    check-cast v1, Lmx1;

    .line 307
    .line 308
    invoke-interface {v1, p1}, Lmx1;->α(Ljavax/net/ssl/SSLSocket;)Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_5

    .line 313
    .line 314
    goto :goto_2

    .line 315
    :cond_6
    move-object v0, v2

    .line 316
    :goto_2
    check-cast v0, Lmx1;

    .line 317
    .line 318
    if-eqz v0, :cond_7

    .line 319
    .line 320
    invoke-interface {v0, p1}, Lmx1;->β(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    :cond_7
    iput-object p1, p0, Lmo;->ρ:Ljava/net/Socket;

    .line 325
    .line 326
    new-instance p2, Li0;

    .line 327
    .line 328
    invoke-direct {p2, p1}, Li0;-><init>(Ljava/net/Socket;)V

    .line 329
    .line 330
    .line 331
    new-instance v0, Lm6;

    .line 332
    .line 333
    invoke-direct {v0, p2}, Lm6;-><init>(Li0;)V

    .line 334
    .line 335
    .line 336
    iput-object v0, p0, Lmo;->υ:Lm6;

    .line 337
    .line 338
    if-eqz v2, :cond_8

    .line 339
    .line 340
    sget-object p2, Lzj1;->ζ:Lrk0;

    .line 341
    .line 342
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-static {v2}, Lrk0;->ξ(Ljava/lang/String;)Lzj1;

    .line 346
    .line 347
    .line 348
    move-result-object p2

    .line 349
    goto :goto_3

    .line 350
    :cond_8
    sget-object p2, Lzj1;->θ:Lzj1;

    .line 351
    .line 352
    :goto_3
    iput-object p2, p0, Lmo;->τ:Lzj1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 353
    .line 354
    sget-object p0, Lgh1;->α:Lf0;

    .line 355
    .line 356
    sget-object p0, Lgh1;->α:Lf0;

    .line 357
    .line 358
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :cond_9
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-static {p0}, Llz1;->ψ(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 370
    :goto_4
    sget-object p2, Lgh1;->α:Lf0;

    .line 371
    .line 372
    sget-object p2, Lgh1;->α:Lf0;

    .line 373
    .line 374
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    invoke-static {p1}, Lud2;->γ(Ljava/net/Socket;)V

    .line 378
    .line 379
    .line 380
    throw p0
.end method

.method public final λ()Lap1;
    .locals 9

    .line 1
    iget-object v0, p0, Lmo;->μ:Li5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lmo;->κ:Lzo1;

    .line 7
    .line 8
    iget-object v2, v1, Lzo1;->α:Lp;

    .line 9
    .line 10
    iget-object v2, v2, Lp;->θ:Log0;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "CONNECT "

    .line 15
    .line 16
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    invoke-static {v2, v4}, Lud2;->θ(Log0;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " HTTP/1.1"

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, Luf0;

    .line 37
    .line 38
    iget-object v4, p0, Lmo;->υ:Lm6;

    .line 39
    .line 40
    const-string v5, "socket"

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    if-eqz v4, :cond_5

    .line 44
    .line 45
    invoke-direct {v3, v6, p0, v4}, Luf0;-><init>(Lt41;La00;Lm6;)V

    .line 46
    .line 47
    .line 48
    iget-object v4, p0, Lmo;->υ:Lm6;

    .line 49
    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    iget-object v4, v4, Lm6;->η:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lrk1;

    .line 55
    .line 56
    iget-object v4, v4, Lrk1;->ε:Lrx1;

    .line 57
    .line 58
    invoke-interface {v4}, Lrx1;->α()Lm42;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iget v7, p0, Lmo;->γ:I

    .line 63
    .line 64
    int-to-long v7, v7

    .line 65
    invoke-virtual {v4, v7, v8}, Lm42;->η(J)Lm42;

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, Lmo;->υ:Lm6;

    .line 69
    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    iget-object v4, v4, Lm6;->θ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v4, Lqk1;

    .line 75
    .line 76
    iget-object v4, v4, Lqk1;->ε:Liw1;

    .line 77
    .line 78
    invoke-interface {v4}, Liw1;->α()Lm42;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    iget v5, p0, Lmo;->δ:I

    .line 83
    .line 84
    int-to-long v7, v5

    .line 85
    invoke-virtual {v4, v7, v8}, Lm42;->η(J)Lm42;

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, Li5;->δ:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Lvc0;

    .line 91
    .line 92
    invoke-virtual {v3, v4, v2}, Luf0;->μ(Lvc0;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Luf0;->γ()V

    .line 96
    .line 97
    .line 98
    const/4 v2, 0x0

    .line 99
    invoke-virtual {v3, v2}, Luf0;->κ(Z)Lyn1;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iput-object v0, v2, Lyn1;->α:Li5;

    .line 107
    .line 108
    invoke-virtual {v2}, Lyn1;->α()Lzn1;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iget v2, v0, Lzn1;->θ:I

    .line 113
    .line 114
    invoke-static {v0}, Lud2;->ε(Lzn1;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    const-wide/16 v7, -0x1

    .line 119
    .line 120
    cmp-long v7, v4, v7

    .line 121
    .line 122
    if-nez v7, :cond_0

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_0
    iget-object v0, v0, Lzn1;->ε:Li5;

    .line 126
    .line 127
    iget-object v0, v0, Li5;->β:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Log0;

    .line 130
    .line 131
    invoke-virtual {v3, v0, v4, v5}, Luf0;->λ(Log0;J)Lrf0;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    const v3, 0x7fffffff

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v3}, Lud2;->ζ(Lrx1;I)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lrf0;->close()V

    .line 142
    .line 143
    .line 144
    :goto_0
    const/16 v0, 0xc8

    .line 145
    .line 146
    if-eq v2, v0, :cond_2

    .line 147
    .line 148
    const/16 p0, 0x197

    .line 149
    .line 150
    if-ne v2, p0, :cond_1

    .line 151
    .line 152
    iget-object p0, v1, Lzo1;->α:Lp;

    .line 153
    .line 154
    iget-object p0, p0, Lp;->ζ:Lx;

    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const-string p0, "Failed to authenticate with proxy"

    .line 160
    .line 161
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_1
    const/4 p0, 0x0

    .line 165
    return-object p0

    .line 166
    :cond_1
    const-string p0, "Unexpected response code for CONNECT: "

    .line 167
    .line 168
    invoke-static {p0, v2}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    new-instance v0, Lap1;

    .line 177
    .line 178
    const/4 v1, 0x6

    .line 179
    invoke-direct {v0, p0, v6, v1}, Lap1;-><init>(Lbp1;Ljava/lang/Throwable;I)V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :cond_3
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw v6

    .line 187
    :cond_4
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw v6

    .line 191
    :cond_5
    invoke-static {v5}, Lln0;->и(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    throw v6
.end method

.method public final μ(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lmo;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lmo;->ν:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    :goto_0
    if-ge v2, v3, :cond_4

    .line 15
    .line 16
    move-object/from16 v4, p1

    .line 17
    .line 18
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lpo;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-boolean v6, v5, Lpo;->α:Z

    .line 28
    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object v6, v5, Lpo;->δ:[Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    sget-object v8, Ls21;->β:Ls21;

    .line 41
    .line 42
    invoke-static {v6, v7, v8}, Lsd2;->ε([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v5, v5, Lpo;->γ:[Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    sget-object v7, Luf;->γ:Ltf;

    .line 58
    .line 59
    invoke-static {v5, v6, v7}, Lsd2;->ε([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 v3, -0x1

    .line 69
    if-eq v1, v3, :cond_3

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    :goto_2
    move/from16 v18, v1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    const/4 v1, 0x0

    .line 76
    goto :goto_2

    .line 77
    :goto_3
    new-instance v4, Lmo;

    .line 78
    .line 79
    iget-object v14, v0, Lmo;->κ:Lzo1;

    .line 80
    .line 81
    iget-object v15, v0, Lmo;->λ:Ljava/util/List;

    .line 82
    .line 83
    iget-object v5, v0, Lmo;->α:Lx22;

    .line 84
    .line 85
    iget-object v6, v0, Lmo;->β:Lxk1;

    .line 86
    .line 87
    iget v7, v0, Lmo;->γ:I

    .line 88
    .line 89
    iget v8, v0, Lmo;->δ:I

    .line 90
    .line 91
    iget v9, v0, Lmo;->ε:I

    .line 92
    .line 93
    iget v10, v0, Lmo;->ζ:I

    .line 94
    .line 95
    iget-boolean v11, v0, Lmo;->η:Z

    .line 96
    .line 97
    iget-object v12, v0, Lmo;->θ:Luk1;

    .line 98
    .line 99
    iget-object v13, v0, Lmo;->ι:Lal1;

    .line 100
    .line 101
    iget-object v0, v0, Lmo;->μ:Li5;

    .line 102
    .line 103
    move-object/from16 v16, v0

    .line 104
    .line 105
    move/from16 v17, v2

    .line 106
    .line 107
    invoke-direct/range {v4 .. v18}, Lmo;-><init>(Lx22;Lxk1;IIIIZLuk1;Lal1;Lzo1;Ljava/util/List;Li5;IZ)V

    .line 108
    .line 109
    .line 110
    return-object v4

    .line 111
    :cond_4
    const/4 v0, 0x0

    .line 112
    return-object v0
.end method

.method public final ν(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lmo;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lmo;->ν:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Lmo;->μ(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Lmo;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Unable to find acceptable protocols. isFallback="

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-boolean p0, p0, Lmo;->ξ:Z

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ", modes="

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const-string p1, ", supported protocols="

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {v0, p0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method
