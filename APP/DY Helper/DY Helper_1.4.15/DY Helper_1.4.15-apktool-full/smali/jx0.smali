.class public abstract Ljx0;
.super Ljava/lang/Object;


# static fields
.field public static final α:[[F

.field public static final β:[[F

.field public static final γ:[F

.field public static final δ:[[F

.field public static final ε:Luy;

.field public static final ζ:Luy;

.field public static final η:[I

.field public static final θ:[Ljava/lang/String;

.field public static final ι:[Ljava/lang/String;

.field public static final κ:Ln5;

.field public static final λ:Ln5;

.field public static final μ:Ln5;

.field public static final ν:Ln5;

.field public static final ξ:Ln5;

.field public static final ο:Lzz1;

.field public static final π:Ljava/lang/Object;

.field public static volatile ρ:Z = false

.field public static volatile σ:I = 0x64


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [F

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    new-array v2, v0, [F

    .line 8
    .line 9
    fill-array-data v2, :array_1

    .line 10
    .line 11
    .line 12
    new-array v3, v0, [F

    .line 13
    .line 14
    fill-array-data v3, :array_2

    .line 15
    .line 16
    .line 17
    filled-new-array {v1, v2, v3}, [[F

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Ljx0;->α:[[F

    .line 22
    .line 23
    new-array v1, v0, [F

    .line 24
    .line 25
    fill-array-data v1, :array_3

    .line 26
    .line 27
    .line 28
    new-array v2, v0, [F

    .line 29
    .line 30
    fill-array-data v2, :array_4

    .line 31
    .line 32
    .line 33
    new-array v3, v0, [F

    .line 34
    .line 35
    fill-array-data v3, :array_5

    .line 36
    .line 37
    .line 38
    filled-new-array {v1, v2, v3}, [[F

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sput-object v1, Ljx0;->β:[[F

    .line 43
    .line 44
    new-array v1, v0, [F

    .line 45
    .line 46
    fill-array-data v1, :array_6

    .line 47
    .line 48
    .line 49
    sput-object v1, Ljx0;->γ:[F

    .line 50
    .line 51
    new-array v1, v0, [F

    .line 52
    .line 53
    fill-array-data v1, :array_7

    .line 54
    .line 55
    .line 56
    new-array v2, v0, [F

    .line 57
    .line 58
    fill-array-data v2, :array_8

    .line 59
    .line 60
    .line 61
    new-array v0, v0, [F

    .line 62
    .line 63
    fill-array-data v0, :array_9

    .line 64
    .line 65
    .line 66
    filled-new-array {v1, v2, v0}, [[F

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, Ljx0;->δ:[[F

    .line 71
    .line 72
    new-instance v0, Luy;

    .line 73
    .line 74
    const-string v1, "UNDEFINED"

    .line 75
    .line 76
    const/4 v2, 0x1

    .line 77
    invoke-direct {v0, v1, v2}, Luy;-><init>(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    sput-object v0, Ljx0;->ε:Luy;

    .line 81
    .line 82
    new-instance v0, Luy;

    .line 83
    .line 84
    const-string v1, "REUSABLE_CLAIMED"

    .line 85
    .line 86
    invoke-direct {v0, v1, v2}, Luy;-><init>(Ljava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Ljx0;->ζ:Luy;

    .line 90
    .line 91
    const/16 v0, 0x8

    .line 92
    .line 93
    new-array v1, v0, [I

    .line 94
    .line 95
    fill-array-data v1, :array_a

    .line 96
    .line 97
    .line 98
    sput-object v1, Ljx0;->η:[I

    .line 99
    .line 100
    const-string v1, "flame_task_list"

    .line 101
    .line 102
    const-string v3, "task_list"

    .line 103
    .line 104
    const-string v4, "new_task_list"

    .line 105
    .line 106
    filled-new-array {v4, v1, v3}, [Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    sput-object v1, Ljx0;->θ:[Ljava/lang/String;

    .line 111
    .line 112
    const-string v1, "flame_achieve_get"

    .line 113
    .line 114
    const-string v3, "update_data"

    .line 115
    .line 116
    const-string v4, "data"

    .line 117
    .line 118
    filled-new-array {v4, v1, v3}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    sput-object v1, Ljx0;->ι:[Ljava/lang/String;

    .line 123
    .line 124
    new-instance v1, Loq1;

    .line 125
    .line 126
    const/4 v3, 0x5

    .line 127
    invoke-direct {v1, v3}, Loq1;-><init>(I)V

    .line 128
    .line 129
    .line 130
    new-instance v3, Lnq1;

    .line 131
    .line 132
    const/16 v4, 0x12

    .line 133
    .line 134
    invoke-direct {v3, v4}, Lnq1;-><init>(I)V

    .line 135
    .line 136
    .line 137
    new-instance v4, Ln5;

    .line 138
    .line 139
    const/16 v5, 0x1d

    .line 140
    .line 141
    const/4 v6, 0x0

    .line 142
    invoke-direct {v4, v5, v1, v3, v6}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 143
    .line 144
    .line 145
    sput-object v4, Ljx0;->κ:Ln5;

    .line 146
    .line 147
    new-instance v1, Loq1;

    .line 148
    .line 149
    const/4 v3, 0x6

    .line 150
    invoke-direct {v1, v3}, Loq1;-><init>(I)V

    .line 151
    .line 152
    .line 153
    new-instance v3, Lnq1;

    .line 154
    .line 155
    const/16 v4, 0x13

    .line 156
    .line 157
    invoke-direct {v3, v4}, Lnq1;-><init>(I)V

    .line 158
    .line 159
    .line 160
    new-instance v4, Ln5;

    .line 161
    .line 162
    invoke-direct {v4, v5, v1, v3, v6}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 163
    .line 164
    .line 165
    sput-object v4, Ljx0;->λ:Ln5;

    .line 166
    .line 167
    new-instance v1, Loq1;

    .line 168
    .line 169
    const/4 v3, 0x7

    .line 170
    invoke-direct {v1, v3}, Loq1;-><init>(I)V

    .line 171
    .line 172
    .line 173
    new-instance v3, Lnq1;

    .line 174
    .line 175
    const/16 v4, 0x14

    .line 176
    .line 177
    invoke-direct {v3, v4}, Lnq1;-><init>(I)V

    .line 178
    .line 179
    .line 180
    new-instance v4, Ln5;

    .line 181
    .line 182
    invoke-direct {v4, v5, v1, v3, v6}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 183
    .line 184
    .line 185
    sput-object v4, Ljx0;->μ:Ln5;

    .line 186
    .line 187
    new-instance v1, Loq1;

    .line 188
    .line 189
    invoke-direct {v1, v0}, Loq1;-><init>(I)V

    .line 190
    .line 191
    .line 192
    new-instance v0, Lnq1;

    .line 193
    .line 194
    const/16 v3, 0x15

    .line 195
    .line 196
    invoke-direct {v0, v3}, Lnq1;-><init>(I)V

    .line 197
    .line 198
    .line 199
    new-instance v3, Ln5;

    .line 200
    .line 201
    invoke-direct {v3, v5, v1, v0, v6}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 202
    .line 203
    .line 204
    sput-object v3, Ljx0;->ν:Ln5;

    .line 205
    .line 206
    new-instance v0, Loq1;

    .line 207
    .line 208
    const/16 v1, 0x9

    .line 209
    .line 210
    invoke-direct {v0, v1}, Loq1;-><init>(I)V

    .line 211
    .line 212
    .line 213
    new-instance v1, Lnq1;

    .line 214
    .line 215
    const/16 v3, 0x16

    .line 216
    .line 217
    invoke-direct {v1, v3}, Lnq1;-><init>(I)V

    .line 218
    .line 219
    .line 220
    new-instance v3, Ln5;

    .line 221
    .line 222
    invoke-direct {v3, v5, v0, v1, v6}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 223
    .line 224
    .line 225
    sput-object v3, Ljx0;->ξ:Ln5;

    .line 226
    .line 227
    new-instance v0, Lzz1;

    .line 228
    .line 229
    invoke-direct {v0, v2, v6}, Lzz1;-><init>(IZ)V

    .line 230
    .line 231
    .line 232
    sput-object v0, Ljx0;->ο:Lzz1;

    .line 233
    .line 234
    new-instance v0, Ljava/lang/Object;

    .line 235
    .line 236
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 237
    .line 238
    .line 239
    sput-object v0, Ljx0;->π:Ljava/lang/Object;

    .line 240
    .line 241
    return-void

    .line 242
    nop

    .line 243
    :array_0
    .array-data 4
        0x3ecd759f
        0x3f2671bd
        -0x42ad373b    # -0.051461f
    .end array-data

    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    :array_1
    .array-data 4
        -0x417fdcdf
        0x3f9a2a3d
        0x3d3bd167
    .end array-data

    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    :array_2
    .array-data 4
        -0x44f7c02b    # -0.002079f
        0x3d4881e4
        0x3f740022
    .end array-data

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    :array_3
    .array-data 4
        0x3fee583d
        -0x407e8f35
        0x3e18c46b
    .end array-data

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    :array_4
    .array-data 4
        0x3ec669e1
        0x3f1f172e
        -0x43ecf866
    .end array-data

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    :array_5
    .array-data 4
        -0x437e39f7
        -0x42f43b81
        0x3f86653c
    .end array-data

    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    :array_6
    .array-data 4
        0x42be1810
        0x42c80000    # 100.0f
        0x42d9c419
    .end array-data

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    :array_7
    .array-data 4
        0x3ed31e17
        0x3eb71a0d
        0x3e38d7b9
    .end array-data

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    :array_8
    .array-data 4
        0x3e59b3d0    # 0.2126f
        0x3f371759    # 0.7152f
        0x3d93dd98    # 0.0722f
    .end array-data

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    :array_9
    .array-data 4
        0x3c9e47ef
        0x3df40c29
        0x3f7349cc
    .end array-data

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    :array_a
    .array-data 4
        -0xff01
        -0xff0100
        -0xff0001
        -0x100
        -0x10000
        -0xffff01
        -0x8100
        -0x80ff01
    .end array-data
.end method

.method public static Α(Ln01;Lnp0;Lw32;Lyr;Lf50;)Ln01;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ln01;->α:Lnp0;

    .line 4
    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2, p1}, Lj81;->Μ(Lw32;Lnp0;)Lw32;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Ln01;->β:Lw32;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lw32;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p3}, Lyr;->β()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v1, p0, Ln01;->γ:Lzr;

    .line 24
    .line 25
    iget v1, v1, Lzr;->ε:F

    .line 26
    .line 27
    cmpg-float v0, v0, v1

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Ln01;->δ:Lf50;

    .line 32
    .line 33
    if-ne p4, v0, :cond_0

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    sget-object p0, Ln01;->θ:Ln01;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    iget-object v0, p0, Ln01;->α:Lnp0;

    .line 41
    .line 42
    if-ne p1, v0, :cond_1

    .line 43
    .line 44
    invoke-static {p2, p1}, Lj81;->Μ(Lw32;Lnp0;)Lw32;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Ln01;->β:Lw32;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lw32;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-interface {p3}, Lyr;->β()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v1, p0, Ln01;->γ:Lzr;

    .line 61
    .line 62
    iget v1, v1, Lzr;->ε:F

    .line 63
    .line 64
    cmpg-float v0, v0, v1

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    iget-object v0, p0, Ln01;->δ:Lf50;

    .line 69
    .line 70
    if-ne p4, v0, :cond_1

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_1
    new-instance p0, Ln01;

    .line 74
    .line 75
    invoke-static {p2, p1}, Lj81;->Μ(Lw32;Lnp0;)Lw32;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-interface {p3}, Lyr;->β()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-interface {p3}, Lyr;->θ()F

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    new-instance v1, Lzr;

    .line 88
    .line 89
    invoke-direct {v1, v0, p3}, Lzr;-><init>(FF)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p1, p2, v1, p4}, Ln01;-><init>(Lnp0;Lw32;Lzr;Lf50;)V

    .line 93
    .line 94
    .line 95
    sput-object p0, Ln01;->θ:Ln01;

    .line 96
    .line 97
    return-object p0
.end method

.method public static Β(Ljavax/net/ssl/SSLSession;)Lqc0;
    .locals 6

    .line 1
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    const-string v1, "TLS_NULL_WITH_NULL_NULL"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    const-string v1, "SSL_NULL_WITH_NULL_NULL"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    sget-object v1, Luf;->β:Li2;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Li2;->ξ(Ljava/lang/String;)Luf;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const-string v2, "NONE"

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    sget-object v2, Lq42;->ζ:Lzz1;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Lzz1;->η(Ljava/lang/String;)Lq42;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    :try_start_0
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Lud2;->κ([Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v2
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    sget-object v2, Ljz;->ε:Ljz;

    .line 62
    .line 63
    :goto_0
    new-instance v3, Lqc0;

    .line 64
    .line 65
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lud2;->κ([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    new-instance v4, Lbi;

    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    invoke-direct {v4, v5, v2}, Lbi;-><init>(ILjava/util/List;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v3, v1, v0, p0, v4}, Lqc0;-><init>(Lq42;Luf;Ljava/util/List;Lp70;)V

    .line 80
    .line 81
    .line 82
    return-object v3

    .line 83
    :cond_0
    const-string p0, "tlsVersion == NONE"

    .line 84
    .line 85
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :goto_1
    const/4 p0, 0x0

    .line 89
    return-object p0

    .line 90
    :cond_1
    const-string p0, "tlsVersion == null"

    .line 91
    .line 92
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    const-string p0, "cipherSuite == "

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_3
    const-string p0, "cipherSuite == null"

    .line 107
    .line 108
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1
.end method

.method public static Γ(Ljava/lang/ClassLoader;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v0, "comment_panel_hook_enabled"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {v0, v2}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v3, "r29fd1f5135ecd17"

    .line 14
    .line 15
    const/4 v4, 0x4

    .line 16
    const/4 v5, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "disabled, skip init"

    .line 20
    .line 21
    invoke-static {v3, v0, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {v1, v2}, Luv0;->α(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    const-string v7, "#"

    .line 30
    .line 31
    sget-object v8, Lcm;->α:Ljava/util/Set;

    .line 32
    .line 33
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v9, 0x1e

    .line 38
    .line 39
    const-string v10, ","

    .line 40
    .line 41
    const/4 v11, 0x1

    .line 42
    const-string v12, "):"

    .line 43
    .line 44
    const/16 v13, 0x28

    .line 45
    .line 46
    const/16 v14, 0x23

    .line 47
    .line 48
    const-string v15, "rc1ad4955cc6c3a73"

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    const-string v0, "comment action list method empty"

    .line 53
    .line 54
    invoke-static {v15, v0, v5, v4, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    move v14, v2

    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :cond_2
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v16

    .line 64
    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    move-object v4, v0

    .line 75
    check-cast v4, Ljava/lang/reflect/Method;

    .line 76
    .line 77
    sget-object v0, Lcm;->α:Ljava/util/Set;

    .line 78
    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v17

    .line 88
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v13, Lul;

    .line 116
    .line 117
    const/16 v14, 0x8

    .line 118
    .line 119
    invoke-direct {v13, v14}, Lul;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-static {v2, v10, v5, v13, v9}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-static {v0, v2, v12, v4}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-interface {v8, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_3

    .line 135
    .line 136
    :try_start_0
    invoke-virtual {v4, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 137
    .line 138
    .line 139
    sget-object v0, Lxq0;->α:Lxq0;

    .line 140
    .line 141
    new-instance v13, Lbm;

    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    invoke-direct {v13, v1, v14}, Lbm;-><init>(Ljava/lang/ClassLoader;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v4, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    new-instance v14, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v11, "hooked "

    .line 168
    .line 169
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/4 v11, 0x4

    .line 186
    invoke-static {v15, v0, v5, v11, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    sget-object v0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :catchall_0
    move-exception v0

    .line 193
    new-instance v11, Leo1;

    .line 194
    .line 195
    invoke-direct {v11, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    move-object v0, v11

    .line 199
    :goto_1
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    if-eqz v0, :cond_3

    .line 204
    .line 205
    invoke-interface {v8, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    const-string v11, "hook method failed "

    .line 221
    .line 222
    invoke-static {v11, v2, v7, v4}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-static {v15, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    :cond_3
    const/4 v2, 0x0

    .line 230
    const/4 v4, 0x4

    .line 231
    const/4 v11, 0x1

    .line 232
    const/16 v13, 0x28

    .line 233
    .line 234
    const/16 v14, 0x23

    .line 235
    .line 236
    goto/16 :goto_0

    .line 237
    .line 238
    :goto_2
    invoke-static {v1, v14}, Luv0;->β(Ljava/lang/ClassLoader;Z)Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    sget-object v4, Lo20;->α:Ljava/util/Set;

    .line 243
    .line 244
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_4

    .line 249
    .line 250
    goto/16 :goto_6

    .line 251
    .line 252
    :cond_4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_7

    .line 261
    .line 262
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    check-cast v0, Ljava/lang/reflect/Method;

    .line 267
    .line 268
    sget-object v8, Lo20;->α:Ljava/util/Set;

    .line 269
    .line 270
    new-instance v8, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v11

    .line 279
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const/16 v11, 0x23

    .line 287
    .line 288
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    const/16 v13, 0x28

    .line 299
    .line 300
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-result-object v14

    .line 307
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    new-instance v15, Ll20;

    .line 311
    .line 312
    const/4 v11, 0x3

    .line 313
    invoke-direct {v15, v11}, Ll20;-><init>(I)V

    .line 314
    .line 315
    .line 316
    invoke-static {v14, v10, v5, v15, v9}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    invoke-static {v8, v11, v12, v0}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v8

    .line 324
    invoke-interface {v4, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v11

    .line 328
    if-eqz v11, :cond_5

    .line 329
    .line 330
    const/4 v11, 0x1

    .line 331
    :try_start_1
    invoke-virtual {v0, v11}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 332
    .line 333
    .line 334
    sget-object v14, Lxq0;->α:Lxq0;

    .line 335
    .line 336
    new-instance v15, Lbm;

    .line 337
    .line 338
    const/4 v9, 0x2

    .line 339
    invoke-direct {v15, v1, v9}, Lbm;-><init>(Ljava/lang/ClassLoader;I)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v14, v0, v15}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 343
    .line 344
    .line 345
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 346
    goto :goto_4

    .line 347
    :catchall_1
    move-exception v0

    .line 348
    new-instance v9, Leo1;

    .line 349
    .line 350
    invoke-direct {v9, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 351
    .line 352
    .line 353
    move-object v0, v9

    .line 354
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    if-eqz v0, :cond_6

    .line 359
    .line 360
    invoke-interface {v4, v8}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    goto :goto_5

    .line 364
    :cond_5
    const/4 v11, 0x1

    .line 365
    :cond_6
    :goto_5
    const/16 v9, 0x1e

    .line 366
    .line 367
    goto :goto_3

    .line 368
    :cond_7
    :goto_6
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    const-string v2, "init done commentMethods="

    .line 377
    .line 378
    const-string v4, ", feedMethods="

    .line 379
    .line 380
    invoke-static {v0, v1, v2, v4}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    const/4 v11, 0x4

    .line 385
    invoke-static {v3, v0, v5, v11, v5}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    return-void
.end method

.method public static Δ(F)I
    .locals 15

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    cmpg-float v0, p0, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    const/high16 p0, -0x1000000

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    const/high16 v0, 0x42c60000    # 99.0f

    .line 11
    .line 12
    cmpl-float v0, p0, v0

    .line 13
    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    const/4 p0, -0x1

    .line 17
    return p0

    .line 18
    :cond_1
    const/high16 v0, 0x41800000    # 16.0f

    .line 19
    .line 20
    add-float v1, p0, v0

    .line 21
    .line 22
    const/high16 v2, 0x42e80000    # 116.0f

    .line 23
    .line 24
    div-float/2addr v1, v2

    .line 25
    const/high16 v3, 0x41000000    # 8.0f

    .line 26
    .line 27
    cmpl-float v3, p0, v3

    .line 28
    .line 29
    const v4, 0x4461d2f7

    .line 30
    .line 31
    .line 32
    if-lez v3, :cond_2

    .line 33
    .line 34
    mul-float p0, v1, v1

    .line 35
    .line 36
    mul-float/2addr p0, v1

    .line 37
    goto :goto_0

    .line 38
    :cond_2
    div-float/2addr p0, v4

    .line 39
    :goto_0
    mul-float v3, v1, v1

    .line 40
    .line 41
    mul-float/2addr v3, v1

    .line 42
    const v5, 0x3c111aa7

    .line 43
    .line 44
    .line 45
    cmpl-float v5, v3, v5

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v7, 0x1

    .line 49
    if-lez v5, :cond_3

    .line 50
    .line 51
    move v5, v7

    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v5, v6

    .line 54
    :goto_1
    if-eqz v5, :cond_4

    .line 55
    .line 56
    move v8, v3

    .line 57
    goto :goto_2

    .line 58
    :cond_4
    mul-float v8, v1, v2

    .line 59
    .line 60
    sub-float/2addr v8, v0

    .line 61
    div-float/2addr v8, v4

    .line 62
    :goto_2
    if-eqz v5, :cond_5

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_5
    mul-float/2addr v1, v2

    .line 66
    sub-float/2addr v1, v0

    .line 67
    div-float v3, v1, v4

    .line 68
    .line 69
    :goto_3
    sget-object v0, Ljx0;->γ:[F

    .line 70
    .line 71
    aget v1, v0, v6

    .line 72
    .line 73
    mul-float/2addr v8, v1

    .line 74
    float-to-double v9, v8

    .line 75
    aget v1, v0, v7

    .line 76
    .line 77
    mul-float/2addr p0, v1

    .line 78
    float-to-double v11, p0

    .line 79
    const/4 p0, 0x2

    .line 80
    aget p0, v0, p0

    .line 81
    .line 82
    mul-float/2addr v3, p0

    .line 83
    float-to-double v13, v3

    .line 84
    invoke-static/range {v9 .. v14}, Lpi;->α(DDD)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    return p0
.end method

.method public static final Ε(Lv80;Le80;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    invoke-static {v0, p1}, Lh62;->κ(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p1, p0, v0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static Ζ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, ".m3u8"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const-string v0, "m3u8"

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const-string v0, ".mpd"

    .line 31
    .line 32
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-string v0, "mpegurl"

    .line 39
    .line 40
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    const-string v0, "dash"

    .line 47
    .line 48
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string v0, ".m4s"

    .line 55
    .line 56
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    const-string v0, ".jpg"

    .line 63
    .line 64
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    const-string v0, ".jpeg"

    .line 71
    .line 72
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_1

    .line 77
    .line 78
    const-string v0, ".png"

    .line 79
    .line 80
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_1

    .line 85
    .line 86
    const-string v0, ".webp"

    .line 87
    .line 88
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_1

    .line 93
    .line 94
    const-string v0, ".heic"

    .line 95
    .line 96
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_1

    .line 101
    .line 102
    const-string v0, ".heif"

    .line 103
    .line 104
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_1

    .line 109
    .line 110
    const-string v0, ".avif"

    .line 111
    .line 112
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_1

    .line 117
    .line 118
    const-string v0, "mime_type=image"

    .line 119
    .line 120
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_1

    .line 125
    .line 126
    const-string v0, "image_type=image"

    .line 127
    .line 128
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_1

    .line 133
    .line 134
    const-string v0, "image/"

    .line 135
    .line 136
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_1

    .line 141
    .line 142
    const-string v0, "tplv-dy-kuchen"

    .line 143
    .line 144
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_0

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_0
    return v1

    .line 152
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 153
    return p0
.end method

.method public static final Η(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 13
    .line 14
    and-int/lit8 p0, p0, 0x30

    .line 15
    .line 16
    const/16 v0, 0x20

    .line 17
    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static Θ(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "bytevc1"

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    const-string v0, "bytevc2"

    .line 23
    .line 24
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    const-string v0, "bytevc"

    .line 31
    .line 32
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const-string v0, "h265"

    .line 39
    .line 40
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    const-string v0, "hevc"

    .line 47
    .line 48
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string v0, "hvc1"

    .line 55
    .line 56
    invoke-static {p0, v0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    return v1

    .line 64
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 65
    return p0
.end method

.method public static Ι(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "http"

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, v0, v1}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {p0}, Ljx0;->Μ(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {p0}, Ljx0;->Ζ(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, ".mp4"

    .line 36
    .line 37
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    const-string v0, "format=mp4"

    .line 44
    .line 45
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    const-string v0, "mime=video/mp4"

    .line 52
    .line 53
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    const-string v0, "mime_type=video"

    .line 60
    .line 61
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    const-string v0, "video_mp4"

    .line 68
    .line 69
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    const-string v0, "/play/"

    .line 76
    .line 77
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    const-string v0, "playaddr"

    .line 84
    .line 85
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_4

    .line 90
    .line 91
    const-string v0, "play_addr"

    .line 92
    .line 93
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_4

    .line 98
    .line 99
    const-string v0, "/video/tos/"

    .line 100
    .line 101
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_3

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    :goto_0
    return v2

    .line 109
    :cond_4
    :goto_1
    return v1
.end method

.method public static Κ(C)Z
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static Λ(I)F
    .locals 6

    .line 1
    int-to-float p0, p0

    .line 2
    const/high16 v0, 0x437f0000    # 255.0f

    .line 3
    .line 4
    div-float/2addr p0, v0

    .line 5
    const v0, 0x3d25aee6    # 0.04045f

    .line 6
    .line 7
    .line 8
    cmpg-float v0, p0, v0

    .line 9
    .line 10
    const/high16 v1, 0x42c80000    # 100.0f

    .line 11
    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    const v0, 0x414eb852    # 12.92f

    .line 15
    .line 16
    .line 17
    div-float/2addr p0, v0

    .line 18
    :goto_0
    mul-float/2addr p0, v1

    .line 19
    return p0

    .line 20
    :cond_0
    const v0, 0x3d6147ae    # 0.055f

    .line 21
    .line 22
    .line 23
    add-float/2addr p0, v0

    .line 24
    const v0, 0x3f870a3d    # 1.055f

    .line 25
    .line 26
    .line 27
    div-float/2addr p0, v0

    .line 28
    float-to-double v2, p0

    .line 29
    const-wide v4, 0x4003333340000000L    # 2.4000000953674316

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    double-to-float p0, v2

    .line 39
    goto :goto_0
.end method

.method public static Μ(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-static {v0, p0, v0}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    :try_start_0
    new-instance v2, Ljava/net/URL;

    .line 11
    .line 12
    invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    new-instance v0, Leo1;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    move-object p0, v0

    .line 37
    :goto_0
    instance-of v0, p0, Leo1;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const-string p0, ""

    .line 42
    .line 43
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 44
    .line 45
    const-string v0, "music"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_1

    .line 53
    .line 54
    const-string v0, "audio"

    .line 55
    .line 56
    invoke-static {p0, v0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_1

    .line 61
    .line 62
    const-string p0, "/music/"

    .line 63
    .line 64
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-nez p0, :cond_1

    .line 69
    .line 70
    const-string p0, "/audio/"

    .line 71
    .line 72
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_1

    .line 77
    .line 78
    const-string p0, "mime=audio"

    .line 79
    .line 80
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-nez p0, :cond_1

    .line 85
    .line 86
    const-string p0, "mime_type=audio"

    .line 87
    .line 88
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-nez p0, :cond_1

    .line 93
    .line 94
    const-string p0, "audio/mpeg"

    .line 95
    .line 96
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-nez p0, :cond_1

    .line 101
    .line 102
    const-string p0, ".mp3"

    .line 103
    .line 104
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_1

    .line 109
    .line 110
    const-string p0, ".m4a"

    .line 111
    .line 112
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-nez p0, :cond_1

    .line 117
    .line 118
    const-string p0, ".aac"

    .line 119
    .line 120
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_1

    .line 125
    .line 126
    const-string p0, ".ogg"

    .line 127
    .line 128
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-nez p0, :cond_1

    .line 133
    .line 134
    const-string p0, ".wav"

    .line 135
    .line 136
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-nez p0, :cond_1

    .line 141
    .line 142
    const-string p0, ".flac"

    .line 143
    .line 144
    invoke-static {v1, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_2

    .line 149
    .line 150
    :cond_1
    const/4 v2, 0x1

    .line 151
    :cond_2
    return v2
.end method

.method public static Ν(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljx0;->Ζ(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    const-string p0, ".mp4"

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const-string p0, "format=mp4"

    .line 29
    .line 30
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    const-string p0, "mime=video/mp4"

    .line 37
    .line 38
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-nez p0, :cond_0

    .line 43
    .line 44
    const-string p0, "mime_type=video"

    .line 45
    .line 46
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_0

    .line 51
    .line 52
    const-string p0, "video_mp4"

    .line 53
    .line 54
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_0

    .line 59
    .line 60
    const-string p0, "main.mp4"

    .line 61
    .line 62
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_0

    .line 67
    .line 68
    const-string p0, "/play/"

    .line 69
    .line 70
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_0

    .line 75
    .line 76
    const-string p0, "playaddr"

    .line 77
    .line 78
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-nez p0, :cond_0

    .line 83
    .line 84
    const-string p0, "play_addr"

    .line 85
    .line 86
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_1

    .line 91
    .line 92
    :cond_0
    const/4 p0, 0x1

    .line 93
    return p0

    .line 94
    :cond_1
    return v1
.end method

.method public static Ξ([I[I)Ljava/lang/Integer;
    .locals 14

    .line 1
    array-length v0, p0

    .line 2
    array-length v1, p1

    .line 3
    if-ne v0, v1, :cond_d

    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    new-array v1, v0, [Z

    .line 8
    .line 9
    array-length v2, p0

    .line 10
    const/4 v3, 0x0

    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    move v6, v5

    .line 14
    :goto_0
    sget-object v7, Ljx0;->η:[I

    .line 15
    .line 16
    const/high16 v8, -0x1000000

    .line 17
    .line 18
    const/16 v9, 0x80

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    if-ge v4, v2, :cond_3

    .line 22
    .line 23
    aget v11, p0, v4

    .line 24
    .line 25
    add-int/lit8 v12, v6, 0x1

    .line 26
    .line 27
    ushr-int/lit8 v13, v11, 0x18

    .line 28
    .line 29
    if-ge v13, v9, :cond_0

    .line 30
    .line 31
    move v5, v10

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    or-int/2addr v8, v11

    .line 34
    aput v8, p1, v6

    .line 35
    .line 36
    move v6, v3

    .line 37
    move v9, v6

    .line 38
    :goto_1
    if-ge v6, v0, :cond_2

    .line 39
    .line 40
    aget v11, v7, v6

    .line 41
    .line 42
    add-int/lit8 v13, v9, 0x1

    .line 43
    .line 44
    if-ne v8, v11, :cond_1

    .line 45
    .line 46
    aput-boolean v10, v1, v9

    .line 47
    .line 48
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    move v9, v13

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 53
    .line 54
    move v6, v12

    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const/4 v0, 0x0

    .line 57
    if-nez v5, :cond_4

    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_4
    new-instance v2, Lxm0;

    .line 61
    .line 62
    const/4 v4, 0x7

    .line 63
    invoke-direct {v2, v3, v4, v10}, Lvm0;-><init>(III)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :cond_5
    move-object v4, v2

    .line 71
    check-cast v4, Lwm0;

    .line 72
    .line 73
    iget-boolean v5, v4, Lwm0;->η:Z

    .line 74
    .line 75
    if-eqz v5, :cond_6

    .line 76
    .line 77
    invoke-virtual {v4}, Lwm0;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    move-object v5, v4

    .line 82
    check-cast v5, Ljava/lang/Number;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    aget-boolean v5, v1, v5

    .line 89
    .line 90
    if-nez v5, :cond_5

    .line 91
    .line 92
    move-object v0, v4

    .line 93
    :cond_6
    check-cast v0, Ljava/lang/Integer;

    .line 94
    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    aget v0, v7, v0

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_7
    const v0, 0x10101

    .line 105
    .line 106
    .line 107
    move v1, v3

    .line 108
    :goto_3
    const/16 v2, 0x20

    .line 109
    .line 110
    if-ge v1, v2, :cond_c

    .line 111
    .line 112
    or-int v2, v0, v8

    .line 113
    .line 114
    array-length v4, p0

    .line 115
    move v5, v3

    .line 116
    :goto_4
    if-ge v5, v4, :cond_9

    .line 117
    .line 118
    aget v6, p0, v5

    .line 119
    .line 120
    ushr-int/lit8 v7, v6, 0x18

    .line 121
    .line 122
    if-lt v7, v9, :cond_8

    .line 123
    .line 124
    or-int/2addr v6, v8

    .line 125
    if-ne v6, v2, :cond_8

    .line 126
    .line 127
    const v2, 0x9e3779

    .line 128
    .line 129
    .line 130
    add-int/2addr v0, v2

    .line 131
    const v2, 0xffffff

    .line 132
    .line 133
    .line 134
    and-int/2addr v0, v2

    .line 135
    add-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_9
    move v0, v2

    .line 142
    :goto_5
    array-length v1, p0

    .line 143
    move v2, v3

    .line 144
    :goto_6
    if-ge v3, v1, :cond_b

    .line 145
    .line 146
    aget v4, p0, v3

    .line 147
    .line 148
    add-int/lit8 v5, v2, 0x1

    .line 149
    .line 150
    ushr-int/lit8 v4, v4, 0x18

    .line 151
    .line 152
    if-ge v4, v9, :cond_a

    .line 153
    .line 154
    aput v0, p1, v2

    .line 155
    .line 156
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 157
    .line 158
    move v2, v5

    .line 159
    goto :goto_6

    .line 160
    :cond_b
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :cond_c
    const-string p0, "GIF \u5e27\u989c\u8272\u8fc7\u4e8e\u590d\u6742\uff0c\u65e0\u6cd5\u5206\u914d\u900f\u660e\u989c\u8272\u952e"

    .line 166
    .line 167
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :goto_7
    const/4 p0, 0x0

    .line 171
    return-object p0

    .line 172
    :cond_d
    array-length p0, p0

    .line 173
    array-length p1, p1

    .line 174
    const-string v0, "GIF \u50cf\u7d20\u7f13\u51b2\u533a\u957f\u5ea6\u4e0d\u4e00\u81f4: source="

    .line 175
    .line 176
    const-string v1, ", target="

    .line 177
    .line 178
    invoke-static {p0, p1, v0, v1}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto :goto_7
.end method

.method public static Ο(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 9
    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    :goto_0
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_1
    instance-of p1, p0, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    check-cast p0, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, Lx02;->Π(Ljava/lang/String;)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static Π(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Lorg/json/JSONObject;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Lorg/json/JSONObject;

    .line 10
    .line 11
    const-string p1, "text"

    .line 12
    .line 13
    invoke-static {p1, p0}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of p1, p0, Ljava/lang/String;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    check-cast p0, Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-lez p1, :cond_1

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public static Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-lez p1, :cond_1

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static Σ(Ljava/lang/String;)Lgg1;
    .locals 18

    .line 1
    new-instance v1, Lorg/json/JSONObject;

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayDeque;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    new-instance v0, Ll91;

    .line 24
    .line 25
    invoke-direct {v0, v1, v5}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v6, 0x4

    .line 36
    sget-object v7, Ljx0;->θ:[Ljava/lang/String;

    .line 37
    .line 38
    const/4 v8, 0x3

    .line 39
    const/4 v9, 0x0

    .line 40
    if-nez v0, :cond_7

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ll91;

    .line 47
    .line 48
    iget-object v10, v0, Ll91;->ε:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v10, Lorg/json/JSONObject;

    .line 51
    .line 52
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    move v0, v4

    .line 61
    :goto_0
    if-ge v0, v8, :cond_3

    .line 62
    .line 63
    aget-object v12, v7, v0

    .line 64
    .line 65
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    if-eqz v13, :cond_2

    .line 70
    .line 71
    invoke-virtual {v3, v12}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v14

    .line 75
    if-nez v14, :cond_1

    .line 76
    .line 77
    new-instance v14, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {v3, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_1
    check-cast v14, Ljava/util/List;

    .line 86
    .line 87
    invoke-interface {v14, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    if-ge v11, v6, :cond_0

    .line 94
    .line 95
    move v6, v4

    .line 96
    :goto_1
    if-ge v6, v8, :cond_0

    .line 97
    .line 98
    sget-object v0, Ljx0;->ι:[Ljava/lang/String;

    .line 99
    .line 100
    aget-object v0, v0, v6

    .line 101
    .line 102
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    instance-of v7, v0, Lorg/json/JSONObject;

    .line 107
    .line 108
    if-eqz v7, :cond_4

    .line 109
    .line 110
    add-int/lit8 v7, v11, 0x1

    .line 111
    .line 112
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    new-instance v12, Ll91;

    .line 117
    .line 118
    invoke-direct {v12, v0, v7}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v12}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    instance-of v7, v0, Ljava/lang/String;

    .line 126
    .line 127
    if-eqz v7, :cond_6

    .line 128
    .line 129
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 130
    .line 131
    check-cast v0, Ljava/lang/String;

    .line 132
    .line 133
    invoke-direct {v7, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :catchall_0
    move-exception v0

    .line 138
    new-instance v7, Leo1;

    .line 139
    .line 140
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    instance-of v0, v7, Leo1;

    .line 144
    .line 145
    if-eqz v0, :cond_5

    .line 146
    .line 147
    move-object v7, v9

    .line 148
    :cond_5
    check-cast v7, Lorg/json/JSONObject;

    .line 149
    .line 150
    if-eqz v7, :cond_6

    .line 151
    .line 152
    add-int/lit8 v0, v11, 0x1

    .line 153
    .line 154
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    new-instance v12, Ll91;

    .line 159
    .line 160
    invoke-direct {v12, v7, v0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v12}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    :cond_6
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_7
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 170
    .line 171
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    invoke-static {v2}, Lex0;->Κ(I)I

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, Ljava/lang/Iterable;

    .line 187
    .line 188
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-eqz v10, :cond_9

    .line 197
    .line 198
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    check-cast v10, Ljava/util/Map$Entry;

    .line 203
    .line 204
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    check-cast v10, Ljava/util/List;

    .line 213
    .line 214
    new-instance v12, Ljava/util/ArrayList;

    .line 215
    .line 216
    const/16 v13, 0xa

    .line 217
    .line 218
    invoke-static {v10, v13}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v10

    .line 229
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    if-eqz v13, :cond_8

    .line 234
    .line 235
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    check-cast v13, Lorg/json/JSONArray;

    .line 240
    .line 241
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_8
    invoke-interface {v0, v11, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_9
    move v2, v4

    .line 258
    :goto_6
    sget-object v10, Ljz;->ε:Ljz;

    .line 259
    .line 260
    if-ge v2, v8, :cond_e

    .line 261
    .line 262
    aget-object v11, v7, v2

    .line 263
    .line 264
    invoke-virtual {v0, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    check-cast v12, Ljava/util/List;

    .line 269
    .line 270
    if-nez v12, :cond_a

    .line 271
    .line 272
    move-object v12, v10

    .line 273
    :cond_a
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 274
    .line 275
    .line 276
    move-result v13

    .line 277
    if-eqz v13, :cond_b

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_b
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    :cond_c
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 285
    .line 286
    .line 287
    move-result v13

    .line 288
    if-eqz v13, :cond_d

    .line 289
    .line 290
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v13

    .line 294
    check-cast v13, Ljava/lang/Number;

    .line 295
    .line 296
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    if-lez v13, :cond_c

    .line 301
    .line 302
    goto :goto_8

    .line 303
    :cond_d
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 304
    .line 305
    goto :goto_6

    .line 306
    :cond_e
    move-object v11, v9

    .line 307
    :goto_8
    if-nez v11, :cond_11

    .line 308
    .line 309
    move v2, v4

    .line 310
    :goto_9
    if-ge v2, v8, :cond_10

    .line 311
    .line 312
    aget-object v11, v7, v2

    .line 313
    .line 314
    invoke-interface {v0, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    if-eqz v12, :cond_f

    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_f
    add-int/lit8 v2, v2, 0x1

    .line 322
    .line 323
    goto :goto_9

    .line 324
    :cond_10
    move-object v11, v9

    .line 325
    :cond_11
    :goto_a
    if-nez v11, :cond_12

    .line 326
    .line 327
    :goto_b
    move-object v0, v9

    .line 328
    goto/16 :goto_f

    .line 329
    .line 330
    :cond_12
    invoke-static {v3, v11}, Lex0;->Θ(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    check-cast v2, Ljava/util/List;

    .line 335
    .line 336
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    :cond_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result v7

    .line 344
    if-eqz v7, :cond_14

    .line 345
    .line 346
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    move-object v8, v7

    .line 351
    check-cast v8, Lorg/json/JSONArray;

    .line 352
    .line 353
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 354
    .line 355
    .line 356
    move-result v8

    .line 357
    if-lez v8, :cond_13

    .line 358
    .line 359
    goto :goto_c

    .line 360
    :cond_14
    move-object v7, v9

    .line 361
    :goto_c
    check-cast v7, Lorg/json/JSONArray;

    .line 362
    .line 363
    if-nez v7, :cond_15

    .line 364
    .line 365
    invoke-static {v2}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    move-object v7, v2

    .line 370
    check-cast v7, Lorg/json/JSONArray;

    .line 371
    .line 372
    if-nez v7, :cond_15

    .line 373
    .line 374
    goto :goto_b

    .line 375
    :cond_15
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 376
    .line 377
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    invoke-static {v3}, Lex0;->Κ(I)I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    invoke-direct {v2, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    check-cast v0, Ljava/lang/Iterable;

    .line 393
    .line 394
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v3

    .line 402
    if-eqz v3, :cond_17

    .line 403
    .line 404
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    check-cast v3, Ljava/util/Map$Entry;

    .line 409
    .line 410
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v3

    .line 418
    check-cast v3, Ljava/util/List;

    .line 419
    .line 420
    invoke-static {v3}, Lxh;->С(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    check-cast v3, Ljava/lang/Integer;

    .line 425
    .line 426
    if-eqz v3, :cond_16

    .line 427
    .line 428
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    goto :goto_e

    .line 433
    :cond_16
    move v3, v4

    .line 434
    :goto_e
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    invoke-interface {v2, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_17
    new-instance v0, Lsg1;

    .line 443
    .line 444
    invoke-direct {v0, v11, v7, v2}, Lsg1;-><init>(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/LinkedHashMap;)V

    .line 445
    .line 446
    .line 447
    :goto_f
    if-eqz v0, :cond_19

    .line 448
    .line 449
    iget-object v2, v0, Lsg1;->β:Lorg/json/JSONArray;

    .line 450
    .line 451
    iget-object v3, v0, Lsg1;->α:Ljava/lang/String;

    .line 452
    .line 453
    const-string v4, "new_task_list"

    .line 454
    .line 455
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v3

    .line 459
    if-eqz v3, :cond_18

    .line 460
    .line 461
    const-string v3, "pet"

    .line 462
    .line 463
    goto :goto_10

    .line 464
    :cond_18
    const-string v3, "flame"

    .line 465
    .line 466
    :goto_10
    invoke-static {v2, v3}, Ljx0;->Υ(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    goto :goto_11

    .line 471
    :cond_19
    move-object v2, v9

    .line 472
    :goto_11
    if-nez v2, :cond_1a

    .line 473
    .line 474
    move-object v15, v10

    .line 475
    goto :goto_12

    .line 476
    :cond_1a
    move-object v15, v2

    .line 477
    :goto_12
    new-instance v11, Lgg1;

    .line 478
    .line 479
    const-string v2, "status_code"

    .line 480
    .line 481
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    const-string v4, "data"

    .line 486
    .line 487
    const-string v7, "base_resp"

    .line 488
    .line 489
    const/4 v8, -0x1

    .line 490
    if-eqz v3, :cond_1c

    .line 491
    .line 492
    invoke-virtual {v1, v2, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 493
    .line 494
    .line 495
    move-result v8

    .line 496
    :cond_1b
    :goto_13
    move v12, v8

    .line 497
    goto :goto_14

    .line 498
    :cond_1c
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    if-eqz v3, :cond_1d

    .line 503
    .line 504
    invoke-virtual {v3, v2, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 505
    .line 506
    .line 507
    move-result v8

    .line 508
    goto :goto_13

    .line 509
    :cond_1d
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    if-eqz v3, :cond_1b

    .line 514
    .line 515
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    if-eqz v10, :cond_1b

    .line 520
    .line 521
    invoke-virtual {v3, v2, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 522
    .line 523
    .line 524
    move-result v8

    .line 525
    goto :goto_13

    .line 526
    :goto_14
    const-string v2, "status_msg"

    .line 527
    .line 528
    invoke-static {v2, v1}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v3

    .line 532
    if-nez v3, :cond_1f

    .line 533
    .line 534
    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    if-eqz v3, :cond_1e

    .line 539
    .line 540
    const-string v7, "status_message"

    .line 541
    .line 542
    invoke-static {v7, v3}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v3

    .line 546
    goto :goto_15

    .line 547
    :cond_1e
    move-object v3, v9

    .line 548
    :goto_15
    if-nez v3, :cond_1f

    .line 549
    .line 550
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    if-eqz v3, :cond_20

    .line 555
    .line 556
    invoke-static {v2, v3}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v3

    .line 560
    :cond_1f
    move-object v13, v3

    .line 561
    goto :goto_16

    .line 562
    :cond_20
    move-object v13, v9

    .line 563
    :goto_16
    new-instance v2, Ljava/util/ArrayDeque;

    .line 564
    .line 565
    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 566
    .line 567
    .line 568
    new-instance v3, Ll91;

    .line 569
    .line 570
    invoke-direct {v3, v1, v5}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    :cond_21
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 577
    .line 578
    .line 579
    move-result v1

    .line 580
    if-nez v1, :cond_23

    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    check-cast v1, Ll91;

    .line 587
    .line 588
    iget-object v3, v1, Ll91;->ε:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v3, Lorg/json/JSONObject;

    .line 591
    .line 592
    iget-object v1, v1, Ll91;->ζ:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v1, Ljava/lang/Number;

    .line 595
    .line 596
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    const-string v4, "balance_spark"

    .line 601
    .line 602
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 603
    .line 604
    .line 605
    move-result v5

    .line 606
    if-eqz v5, :cond_26

    .line 607
    .line 608
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    if-nez v1, :cond_22

    .line 613
    .line 614
    goto :goto_17

    .line 615
    :cond_22
    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 616
    .line 617
    if-ne v1, v2, :cond_24

    .line 618
    .line 619
    :cond_23
    :goto_17
    move-object v14, v9

    .line 620
    goto :goto_1a

    .line 621
    :cond_24
    instance-of v2, v1, Ljava/lang/Number;

    .line 622
    .line 623
    if-eqz v2, :cond_25

    .line 624
    .line 625
    check-cast v1, Ljava/lang/Number;

    .line 626
    .line 627
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 628
    .line 629
    .line 630
    move-result-wide v1

    .line 631
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    :goto_18
    move-object v14, v1

    .line 636
    goto :goto_1a

    .line 637
    :cond_25
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    invoke-static {v1}, Lx02;->Σ(Ljava/lang/String;)Ljava/lang/Long;

    .line 642
    .line 643
    .line 644
    move-result-object v1

    .line 645
    goto :goto_18

    .line 646
    :cond_26
    if-ge v1, v6, :cond_21

    .line 647
    .line 648
    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    :cond_27
    :goto_19
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 653
    .line 654
    .line 655
    move-result v5

    .line 656
    if-eqz v5, :cond_21

    .line 657
    .line 658
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v5

    .line 662
    check-cast v5, Ljava/lang/String;

    .line 663
    .line 664
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v5

    .line 668
    instance-of v7, v5, Lorg/json/JSONObject;

    .line 669
    .line 670
    if-eqz v7, :cond_27

    .line 671
    .line 672
    add-int/lit8 v7, v1, 0x1

    .line 673
    .line 674
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 675
    .line 676
    .line 677
    move-result-object v7

    .line 678
    new-instance v8, Ll91;

    .line 679
    .line 680
    invoke-direct {v8, v5, v7}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v2, v8}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 684
    .line 685
    .line 686
    goto :goto_19

    .line 687
    :goto_1a
    if-eqz v0, :cond_28

    .line 688
    .line 689
    iget-object v1, v0, Lsg1;->α:Ljava/lang/String;

    .line 690
    .line 691
    move-object/from16 v16, v1

    .line 692
    .line 693
    goto :goto_1b

    .line 694
    :cond_28
    move-object/from16 v16, v9

    .line 695
    .line 696
    :goto_1b
    if-eqz v0, :cond_29

    .line 697
    .line 698
    iget-object v9, v0, Lsg1;->γ:Ljava/util/LinkedHashMap;

    .line 699
    .line 700
    :cond_29
    if-nez v9, :cond_2a

    .line 701
    .line 702
    sget-object v9, Lkz;->ε:Lkz;

    .line 703
    .line 704
    :cond_2a
    move-object/from16 v17, v9

    .line 705
    .line 706
    invoke-direct/range {v11 .. v17}, Lgg1;-><init>(ILjava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V

    .line 707
    .line 708
    .line 709
    return-object v11
.end method

.method public static Τ(Ljava/lang/String;I)J
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0, p1, v0}, Ljx0;->σ(Ljava/lang/String;IIZ)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    sget-object v2, Lqp;->ξ:Ljava/util/regex/Pattern;

    .line 7
    .line 8
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, -0x1

    .line 13
    move v4, v3

    .line 14
    move v5, v4

    .line 15
    move v6, v5

    .line 16
    move v7, v6

    .line 17
    move v8, v7

    .line 18
    move v9, v8

    .line 19
    :goto_0
    const/4 v10, 0x2

    .line 20
    const/4 v11, 0x1

    .line 21
    if-ge v1, p1, :cond_4

    .line 22
    .line 23
    add-int/lit8 v12, v1, 0x1

    .line 24
    .line 25
    invoke-static {p0, v12, p1, v11}, Ljx0;->σ(Ljava/lang/String;IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    invoke-virtual {v2, v1, v12}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 30
    .line 31
    .line 32
    if-ne v5, v3, :cond_0

    .line 33
    .line 34
    sget-object v1, Lqp;->ξ:Ljava/util/regex/Pattern;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-virtual {v2, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v8

    .line 68
    const/4 v1, 0x3

    .line 69
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    if-ne v6, v3, :cond_1

    .line 82
    .line 83
    sget-object v1, Lqp;->ν:Ljava/util/regex/Pattern;

    .line 84
    .line 85
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_1

    .line 94
    .line 95
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    goto :goto_1

    .line 107
    :cond_1
    if-ne v7, v3, :cond_2

    .line 108
    .line 109
    sget-object v1, Lqp;->μ:Ljava/util/regex/Pattern;

    .line 110
    .line 111
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-eqz v10, :cond_2

    .line 120
    .line 121
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 129
    .line 130
    invoke-static {v10, v7, v10}, Lnx;->ν(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    invoke-virtual {v1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const/4 v10, 0x6

    .line 142
    invoke-static {v1, v7, v0, v0, v10}, Lq02;->д(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    div-int/lit8 v7, v1, 0x4

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_2
    if-ne v4, v3, :cond_3

    .line 150
    .line 151
    sget-object v1, Lqp;->λ:Ljava/util/regex/Pattern;

    .line 152
    .line 153
    invoke-virtual {v2, v1}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_3

    .line 162
    .line 163
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    :cond_3
    :goto_1
    add-int/lit8 v12, v12, 0x1

    .line 175
    .line 176
    invoke-static {p0, v12, p1, v0}, Ljx0;->σ(Ljava/lang/String;IIZ)I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_4
    const/16 p0, 0x46

    .line 183
    .line 184
    if-gt p0, v4, :cond_5

    .line 185
    .line 186
    const/16 p1, 0x64

    .line 187
    .line 188
    if-ge v4, p1, :cond_5

    .line 189
    .line 190
    add-int/lit16 v4, v4, 0x76c

    .line 191
    .line 192
    :cond_5
    if-ltz v4, :cond_6

    .line 193
    .line 194
    if-ge v4, p0, :cond_6

    .line 195
    .line 196
    add-int/lit16 v4, v4, 0x7d0

    .line 197
    .line 198
    :cond_6
    const/16 p0, 0x641

    .line 199
    .line 200
    const-string p1, "Failed requirement."

    .line 201
    .line 202
    if-lt v4, p0, :cond_c

    .line 203
    .line 204
    if-eq v7, v3, :cond_b

    .line 205
    .line 206
    if-gt v11, v6, :cond_a

    .line 207
    .line 208
    const/16 p0, 0x20

    .line 209
    .line 210
    if-ge v6, p0, :cond_a

    .line 211
    .line 212
    if-ltz v5, :cond_9

    .line 213
    .line 214
    const/16 p0, 0x18

    .line 215
    .line 216
    if-ge v5, p0, :cond_9

    .line 217
    .line 218
    if-ltz v8, :cond_8

    .line 219
    .line 220
    const/16 p0, 0x3c

    .line 221
    .line 222
    if-ge v8, p0, :cond_8

    .line 223
    .line 224
    if-ltz v9, :cond_7

    .line 225
    .line 226
    if-ge v9, p0, :cond_7

    .line 227
    .line 228
    new-instance p0, Ljava/util/GregorianCalendar;

    .line 229
    .line 230
    sget-object p1, Lud2;->α:Ljava/util/TimeZone;

    .line 231
    .line 232
    invoke-direct {p0, p1}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->setLenient(Z)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0, v11, v4}, Ljava/util/Calendar;->set(II)V

    .line 239
    .line 240
    .line 241
    sub-int/2addr v7, v11

    .line 242
    invoke-virtual {p0, v10, v7}, Ljava/util/Calendar;->set(II)V

    .line 243
    .line 244
    .line 245
    const/4 p1, 0x5

    .line 246
    invoke-virtual {p0, p1, v6}, Ljava/util/Calendar;->set(II)V

    .line 247
    .line 248
    .line 249
    const/16 p1, 0xb

    .line 250
    .line 251
    invoke-virtual {p0, p1, v5}, Ljava/util/Calendar;->set(II)V

    .line 252
    .line 253
    .line 254
    const/16 p1, 0xc

    .line 255
    .line 256
    invoke-virtual {p0, p1, v8}, Ljava/util/Calendar;->set(II)V

    .line 257
    .line 258
    .line 259
    const/16 p1, 0xd

    .line 260
    .line 261
    invoke-virtual {p0, p1, v9}, Ljava/util/Calendar;->set(II)V

    .line 262
    .line 263
    .line 264
    const/16 p1, 0xe

    .line 265
    .line 266
    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 270
    .line 271
    .line 272
    move-result-wide p0

    .line 273
    return-wide p0

    .line 274
    :cond_7
    invoke-static {p1}, Lγ;->ν(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    const-wide/16 p0, 0x0

    .line 278
    .line 279
    return-wide p0

    .line 280
    :cond_8
    invoke-static {p1}, Lγ;->ν(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    const-wide/16 p0, 0x0

    .line 284
    .line 285
    return-wide p0

    .line 286
    :cond_9
    invoke-static {p1}, Lγ;->ν(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    const-wide/16 p0, 0x0

    .line 290
    .line 291
    return-wide p0

    .line 292
    :cond_a
    invoke-static {p1}, Lγ;->ν(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    const-wide/16 p0, 0x0

    .line 296
    .line 297
    return-wide p0

    .line 298
    :cond_b
    invoke-static {p1}, Lγ;->ν(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    const-wide/16 p0, 0x0

    .line 302
    .line 303
    return-wide p0

    .line 304
    :cond_c
    invoke-static {p1}, Lγ;->ν(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    const-wide/16 p0, 0x0

    .line 308
    .line 309
    return-wide p0
.end method

.method public static Υ(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 21

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lorg/json/JSONArray;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_b

    .line 17
    .line 18
    move-object/from16 v4, p0

    .line 19
    .line 20
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    move/from16 v20, v1

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_0
    const-string v6, "task_id"

    .line 31
    .line 32
    invoke-static {v6, v5}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    if-nez v6, :cond_1

    .line 37
    .line 38
    move/from16 v20, v1

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_1
    const-string v8, "sub_tasks"

    .line 44
    .line 45
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    move-object/from16 v9, p1

    .line 50
    .line 51
    if-eqz v8, :cond_2

    .line 52
    .line 53
    invoke-static {v8, v9}, Ljx0;->Υ(Lorg/json/JSONArray;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object v8

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/4 v8, 0x0

    .line 59
    :goto_1
    if-nez v8, :cond_3

    .line 60
    .line 61
    sget-object v8, Ljz;->ε:Ljz;

    .line 62
    .line 63
    :cond_3
    move-object/from16 v18, v8

    .line 64
    .line 65
    new-instance v8, Ltf1;

    .line 66
    .line 67
    const-string v10, "unique_task_id"

    .line 68
    .line 69
    invoke-static {v10, v5}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    const-string v11, "task_status"

    .line 74
    .line 75
    invoke-virtual {v5, v11, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    const-string v12, "token"

    .line 80
    .line 81
    invoke-static {v12, v5}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    const-string v13, "task_key"

    .line 86
    .line 87
    invoke-static {v13, v5}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    const-string v14, "task_name"

    .line 92
    .line 93
    invoke-static {v14, v5}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    const-string v15, "task_type"

    .line 98
    .line 99
    invoke-static {v15, v5}, Ljx0;->Ο(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v15

    .line 103
    const-string v2, "current_times"

    .line 104
    .line 105
    invoke-static {v2, v5}, Ljx0;->Ο(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v16

    .line 109
    const-string v7, "progress"

    .line 110
    .line 111
    move/from16 v20, v1

    .line 112
    .line 113
    if-nez v16, :cond_5

    .line 114
    .line 115
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-eqz v1, :cond_4

    .line 120
    .line 121
    invoke-static {v2, v1}, Ljx0;->Ο(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v16

    .line 125
    goto :goto_2

    .line 126
    :cond_4
    const/16 v16, 0x0

    .line 127
    .line 128
    :cond_5
    :goto_2
    const-string v1, "total_times"

    .line 129
    .line 130
    invoke-static {v1, v5}, Ljx0;->Ο(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-nez v2, :cond_7

    .line 135
    .line 136
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    if-eqz v2, :cond_6

    .line 141
    .line 142
    invoke-static {v1, v2}, Ljx0;->Ο(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    goto :goto_3

    .line 147
    :cond_6
    const/4 v7, 0x0

    .line 148
    goto :goto_3

    .line 149
    :cond_7
    move-object v7, v2

    .line 150
    :goto_3
    const-string v1, "title_v2"

    .line 151
    .line 152
    invoke-static {v1, v5}, Ljx0;->Π(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    if-nez v1, :cond_8

    .line 157
    .line 158
    const-string v1, "title"

    .line 159
    .line 160
    invoke-static {v1, v5}, Ljx0;->Π(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-nez v1, :cond_8

    .line 165
    .line 166
    const-string v1, "main_title"

    .line 167
    .line 168
    invoke-static {v1, v5}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    :cond_8
    const-string v2, "subtitle_v2"

    .line 173
    .line 174
    invoke-static {v2, v5}, Ljx0;->Π(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    if-nez v2, :cond_9

    .line 179
    .line 180
    const-string v2, "subtitle"

    .line 181
    .line 182
    invoke-static {v2, v5}, Ljx0;->Π(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    if-nez v2, :cond_9

    .line 187
    .line 188
    const-string v2, "sub_title"

    .line 189
    .line 190
    invoke-static {v2, v5}, Ljx0;->Ρ(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    :cond_9
    move-object/from16 v19, v5

    .line 195
    .line 196
    move-object v5, v8

    .line 197
    move-object/from16 v17, v9

    .line 198
    .line 199
    move v8, v11

    .line 200
    move-object v9, v12

    .line 201
    move-object v11, v14

    .line 202
    move-object v12, v15

    .line 203
    move-object v15, v1

    .line 204
    move-object v14, v7

    .line 205
    move-object v7, v10

    .line 206
    move-object v10, v13

    .line 207
    move-object/from16 v13, v16

    .line 208
    .line 209
    move-object/from16 v16, v2

    .line 210
    .line 211
    invoke-direct/range {v5 .. v19}, Ltf1;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lorg/json/JSONObject;)V

    .line 212
    .line 213
    .line 214
    move-object v7, v5

    .line 215
    :goto_4
    if-eqz v7, :cond_a

    .line 216
    .line 217
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    :cond_a
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 221
    .line 222
    move/from16 v1, v20

    .line 223
    .line 224
    const/4 v2, 0x0

    .line 225
    goto/16 :goto_0

    .line 226
    .line 227
    :cond_b
    return-object v0
.end method

.method public static final Φ(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "GET"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "HEAD"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static final Χ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    instance-of v0, p0, Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    move-object v0, p0

    .line 9
    check-cast v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/4 v1, 0x4

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static final Ψ(Lop;Ljava/lang/Object;)V
    .locals 9

    .line 1
    instance-of v0, p0, Lgt;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    check-cast p0, Lgt;

    .line 6
    .line 7
    iget-object v0, p0, Lgt;->θ:Lkotlinx/coroutines/α;

    .line 8
    .line 9
    iget-object v1, p0, Lgt;->ι:Lpp;

    .line 10
    .line 11
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    move-object v3, p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance v3, Lom;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, v2, v4}, Lom;-><init>(Ljava/lang/Throwable;Z)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-interface {v1}, Lop;->γ()Lup;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Lkotlinx/coroutines/α;->σ(Lup;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_1

    .line 35
    .line 36
    iput-object v3, p0, Lgt;->κ:Ljava/lang/Object;

    .line 37
    .line 38
    iput v4, p0, Ljt;->η:I

    .line 39
    .line 40
    invoke-interface {v1}, Lop;->γ()Lup;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0, p1, p0}, Lkotlinx/coroutines/α;->ρ(Lup;Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-static {}, Ld42;->α()Ltz;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-wide v5, v0, Ltz;->η:J

    .line 53
    .line 54
    const-wide v7, 0x100000000L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    cmp-long v2, v5, v7

    .line 60
    .line 61
    if-ltz v2, :cond_2

    .line 62
    .line 63
    iput-object v3, p0, Lgt;->κ:Ljava/lang/Object;

    .line 64
    .line 65
    iput v4, p0, Ljt;->η:I

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ltz;->φ(Ljt;)V

    .line 68
    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_2
    invoke-virtual {v0, v4}, Ltz;->χ(Z)V

    .line 72
    .line 73
    .line 74
    :try_start_0
    invoke-interface {v1}, Lop;->γ()Lup;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    sget-object v3, Lxn0;->ζ:Lxn0;

    .line 79
    .line 80
    invoke-interface {v2, v3}, Lup;->θ(Ltp;)Lsp;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lfo0;

    .line 85
    .line 86
    if-eqz v2, :cond_3

    .line 87
    .line 88
    invoke-virtual {v2}, Lfo0;->Μ()Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    invoke-virtual {v2}, Lfo0;->Β()Ljava/util/concurrent/CancellationException;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, Li81;->κ(Ljava/lang/Throwable;)Leo1;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p0, p1}, Lgt;->ζ(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    goto :goto_4

    .line 108
    :cond_3
    iget-object v2, p0, Lgt;->λ:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-interface {v1}, Lop;->γ()Lup;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v3, v2}, Lpd2;->б(Lup;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    sget-object v5, Lpd2;->θ:Luy;

    .line 119
    .line 120
    if-eq v2, v5, :cond_4

    .line 121
    .line 122
    invoke-static {v1, v3, v2}, Ls1;->Η(Lop;Lup;Ljava/lang/Object;)Lq62;

    .line 123
    .line 124
    .line 125
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const/4 v5, 0x0

    .line 128
    :goto_1
    :try_start_1
    invoke-virtual {v1, p1}, Lq8;->ζ(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 129
    .line 130
    .line 131
    if-eqz v5, :cond_5

    .line 132
    .line 133
    :try_start_2
    invoke-virtual {v5}, Lq62;->г()Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_6

    .line 138
    .line 139
    :cond_5
    invoke-static {v3, v2}, Lpd2;->Π(Lup;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    :goto_2
    invoke-virtual {v0}, Ltz;->ω()Z

    .line 143
    .line 144
    .line 145
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    if-nez p1, :cond_6

    .line 147
    .line 148
    :goto_3
    invoke-virtual {v0, v4}, Ltz;->υ(Z)V

    .line 149
    .line 150
    .line 151
    goto :goto_5

    .line 152
    :catchall_1
    move-exception p1

    .line 153
    if-eqz v5, :cond_7

    .line 154
    .line 155
    :try_start_3
    invoke-virtual {v5}, Lq62;->г()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-eqz v1, :cond_8

    .line 160
    .line 161
    :cond_7
    invoke-static {v3, v2}, Lpd2;->Π(Lup;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    :goto_4
    :try_start_4
    invoke-virtual {p0, p1}, Ljt;->κ(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :goto_5
    return-void

    .line 170
    :catchall_2
    move-exception p0

    .line 171
    invoke-virtual {v0, v4}, Ltz;->υ(Z)V

    .line 172
    .line 173
    .line 174
    throw p0

    .line 175
    :cond_9
    invoke-interface {p0, p1}, Lop;->ζ(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public static final Ω(Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Llz1;->ζ(I)Landroid/graphics/drawable/GradientDrawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Landroid/graphics/drawable/RippleDrawable;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, p0, v0, v2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method

.method public static final α(Landroid/content/Context;)Las;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 10
    .line 11
    new-instance v1, Las;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 22
    .line 23
    invoke-static {v0}, Lz50;->α(F)Ly50;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    new-instance v2, Lyr0;

    .line 30
    .line 31
    invoke-direct {v2, v0}, Lyr0;-><init>(F)V

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-direct {v1, p0, v0, v2}, Las;-><init>(FFLy50;)V

    .line 35
    .line 36
    .line 37
    return-object v1
.end method

.method public static final β(Lps0;La80;La80;Lv80;I)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, 0x4c886a29    # 7.1520584E7f

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3, v0}, Lv80;->Χ(I)Lv80;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3, p0}, Lv80;->η(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    :goto_0
    or-int/2addr v0, p4

    .line 26
    invoke-virtual {p3, p1}, Lv80;->η(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/16 v1, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v1, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v0, v1

    .line 38
    invoke-virtual {p3, p2}, Lv80;->η(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v1

    .line 50
    and-int/lit16 v1, v0, 0x93

    .line 51
    .line 52
    const/16 v2, 0x92

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    if-eq v1, v2, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    move v1, v3

    .line 60
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 61
    .line 62
    invoke-virtual {p3, v2, v1}, Lv80;->Ξ(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_6

    .line 67
    .line 68
    iget-object v1, p0, Lps0;->α:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-virtual {p3}, Lv80;->π()Lbl1;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    if-eqz p3, :cond_7

    .line 81
    .line 82
    new-instance v0, Lqs0;

    .line 83
    .line 84
    const/4 v5, 0x2

    .line 85
    move-object v1, p0

    .line 86
    move-object v2, p1

    .line 87
    move-object v3, p2

    .line 88
    move v4, p4

    .line 89
    invoke-direct/range {v0 .. v5}, Lqs0;-><init>(Lps0;La80;La80;II)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p3, Lbl1;->δ:Le80;

    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    move-object v1, p0

    .line 96
    move-object v2, p1

    .line 97
    move-object v4, p2

    .line 98
    move v5, p4

    .line 99
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .line 101
    const/16 p1, 0x21

    .line 102
    .line 103
    if-lt p0, p1, :cond_5

    .line 104
    .line 105
    const p0, 0x36bdf098

    .line 106
    .line 107
    .line 108
    invoke-virtual {p3, p0}, Lv80;->Φ(I)V

    .line 109
    .line 110
    .line 111
    and-int/lit16 p0, v0, 0x3fe

    .line 112
    .line 113
    invoke-static {v1, v2, v4, p3, p0}, Lpt0;->β(Lps0;La80;La80;Lv80;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p3, v3}, Lv80;->ο(Z)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    const p0, 0x36c07815

    .line 121
    .line 122
    .line 123
    invoke-virtual {p3, p0}, Lv80;->Φ(I)V

    .line 124
    .line 125
    .line 126
    and-int/lit16 p0, v0, 0x3fe

    .line 127
    .line 128
    invoke-static {v1, v2, v4, p3, p0}, Ljx0;->γ(Lps0;La80;La80;Lv80;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p3, v3}, Lv80;->ο(Z)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_6
    move-object v1, p0

    .line 136
    move-object v2, p1

    .line 137
    move-object v4, p2

    .line 138
    move v5, p4

    .line 139
    invoke-virtual {p3}, Lv80;->Ρ()V

    .line 140
    .line 141
    .line 142
    :goto_4
    invoke-virtual {p3}, Lv80;->π()Lbl1;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-eqz p0, :cond_7

    .line 147
    .line 148
    move-object v3, v2

    .line 149
    move-object v2, v1

    .line 150
    new-instance v1, Lqs0;

    .line 151
    .line 152
    const/4 v6, 0x3

    .line 153
    invoke-direct/range {v1 .. v6}, Lqs0;-><init>(Lps0;La80;La80;II)V

    .line 154
    .line 155
    .line 156
    iput-object v1, p0, Lbl1;->δ:Le80;

    .line 157
    .line 158
    :cond_7
    return-void
.end method

.method public static final γ(Lps0;La80;La80;Lv80;I)V
    .locals 6

    .line 1
    const v0, -0x62df7755

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, Lv80;->Χ(I)Lv80;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3, p0}, Lv80;->η(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p4

    .line 17
    invoke-virtual {p3, p1}, Lv80;->η(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    const/16 v1, 0x20

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/16 v1, 0x10

    .line 27
    .line 28
    :goto_1
    or-int/2addr v0, v1

    .line 29
    invoke-virtual {p3, p2}, Lv80;->η(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/16 v1, 0x100

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    const/16 v1, 0x80

    .line 39
    .line 40
    :goto_2
    or-int/2addr v0, v1

    .line 41
    and-int/lit16 v1, v0, 0x93

    .line 42
    .line 43
    const/16 v2, 0x92

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eq v1, v2, :cond_3

    .line 47
    .line 48
    move v1, v3

    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/4 v1, 0x0

    .line 51
    :goto_3
    and-int/2addr v0, v3

    .line 52
    invoke-virtual {p3, v0, v1}, Lv80;->Ξ(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget v0, p0, Lps0;->ε:F

    .line 59
    .line 60
    new-instance v1, Lqs0;

    .line 61
    .line 62
    invoke-direct {v1, p0, p1, p2}, Lqs0;-><init>(Lps0;La80;La80;)V

    .line 63
    .line 64
    .line 65
    const v2, -0x26233bb7

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v1, p3}, Lkn0;->Ν(ILm80;Lv80;)Lan;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    const/16 v2, 0x30

    .line 73
    .line 74
    invoke-static {v0, v1, p3, v2}, Ljx0;->ζ(FLan;Lv80;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    invoke-virtual {p3}, Lv80;->Ρ()V

    .line 79
    .line 80
    .line 81
    :goto_4
    invoke-virtual {p3}, Lv80;->π()Lbl1;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    if-eqz p3, :cond_5

    .line 86
    .line 87
    new-instance v0, Lqs0;

    .line 88
    .line 89
    const/4 v5, 0x1

    .line 90
    move-object v1, p0

    .line 91
    move-object v2, p1

    .line 92
    move-object v3, p2

    .line 93
    move v4, p4

    .line 94
    invoke-direct/range {v0 .. v5}, Lqs0;-><init>(Lps0;La80;La80;II)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p3, Lbl1;->δ:Le80;

    .line 98
    .line 99
    :cond_5
    return-void
.end method

.method public static final δ(Ljava/lang/String;Lr01;Lv80;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v12, p3

    .line 8
    .line 9
    const v2, 0x3a665470

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v2}, Lv80;->Χ(I)Lv80;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v0}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x4

    .line 20
    const/4 v4, 0x2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    move v2, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v4

    .line 26
    :goto_0
    or-int/2addr v2, v12

    .line 27
    and-int/lit8 v5, v2, 0x13

    .line 28
    .line 29
    const/16 v6, 0x12

    .line 30
    .line 31
    const/4 v13, 0x1

    .line 32
    const/4 v7, 0x0

    .line 33
    if-eq v5, v6, :cond_1

    .line 34
    .line 35
    move v5, v13

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v5, v7

    .line 38
    :goto_1
    and-int/2addr v2, v13

    .line 39
    invoke-virtual {v9, v2, v5}, Lv80;->Ξ(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_5

    .line 44
    .line 45
    const-wide v5, 0xffff3b30L

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_2
    const v2, 0x93b51f2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9, v2}, Lv80;->Φ(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v9, v7}, Lv80;->ο(Z)V

    .line 67
    .line 68
    .line 69
    const/16 v2, 0x10

    .line 70
    .line 71
    int-to-float v2, v2

    .line 72
    invoke-static {v1, v2}, Lxb;->σ(Lr01;F)Lr01;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-static {v7, v2}, Lxb;->Η(Lr01;F)Lr01;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v5, v6}, Lkn0;->β(J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v5

    .line 84
    sget-object v7, Lyo1;->α:Lxo1;

    .line 85
    .line 86
    invoke-static {v2, v5, v6, v7}, Lln0;->κ(Lr01;JLiv1;)Lr01;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    int-to-float v3, v3

    .line 91
    const/4 v5, 0x0

    .line 92
    invoke-static {v2, v3, v5, v4}, Lyh;->ж(Lr01;FFI)Lr01;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    sget-object v3, Lx;->κ:Laa;

    .line 97
    .line 98
    invoke-static {v3}, Lec;->δ(Laa;)Lpx0;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    iget-wide v4, v9, Lv80;->Χ:J

    .line 103
    .line 104
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    invoke-virtual {v9}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-static {v9, v2}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    sget-object v6, Lln;->β:Lkn;

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    sget-object v6, Lkn;->β:Lu40;

    .line 122
    .line 123
    invoke-virtual {v9}, Lv80;->Ψ()V

    .line 124
    .line 125
    .line 126
    iget-boolean v7, v9, Lv80;->Φ:Z

    .line 127
    .line 128
    if-eqz v7, :cond_3

    .line 129
    .line 130
    invoke-virtual {v9, v6}, Lv80;->κ(Lp70;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    invoke-virtual {v9}, Lv80;->и()V

    .line 135
    .line 136
    .line 137
    :goto_2
    sget-object v6, Lkn;->ε:Lui;

    .line 138
    .line 139
    invoke-static {v6, v9, v3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    sget-object v3, Lkn;->δ:Lui;

    .line 143
    .line 144
    invoke-static {v3, v9, v5}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    sget-object v4, Lkn;->ζ:Lui;

    .line 152
    .line 153
    invoke-static {v4, v9, v3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object v3, Lkn;->η:La1;

    .line 157
    .line 158
    invoke-static {v9, v3}, Le81;->ξ(Lv80;La80;)V

    .line 159
    .line 160
    .line 161
    sget-object v3, Lkn;->γ:Lui;

    .line 162
    .line 163
    invoke-static {v3, v9, v2}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    const/4 v2, 0x3

    .line 167
    invoke-static {v0, v2}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    new-instance v14, Lw32;

    .line 172
    .line 173
    sget-wide v15, Lci;->γ:J

    .line 174
    .line 175
    const/16 v3, 0x9

    .line 176
    .line 177
    invoke-static {v3}, Lu81;->η(I)J

    .line 178
    .line 179
    .line 180
    move-result-wide v17

    .line 181
    sget-object v19, Ld60;->ι:Ld60;

    .line 182
    .line 183
    const v20, 0xfffff8

    .line 184
    .line 185
    .line 186
    invoke-direct/range {v14 .. v20}, Lw32;-><init>(JJLd60;I)V

    .line 187
    .line 188
    .line 189
    const/16 v10, 0x180

    .line 190
    .line 191
    const/16 v11, 0x3fa

    .line 192
    .line 193
    const/4 v3, 0x0

    .line 194
    const/4 v5, 0x0

    .line 195
    const/4 v6, 0x0

    .line 196
    const/4 v7, 0x0

    .line 197
    const/4 v8, 0x0

    .line 198
    move-object v4, v14

    .line 199
    invoke-static/range {v2 .. v11}, Lln0;->α(Ljava/lang/String;Lr01;Lw32;IZIILv80;II)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v9, v13}, Lv80;->ο(Z)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_4
    :goto_3
    const v2, 0xa3e15cc

    .line 207
    .line 208
    .line 209
    invoke-virtual {v9, v2}, Lv80;->Φ(I)V

    .line 210
    .line 211
    .line 212
    const/4 v2, 0x7

    .line 213
    int-to-float v2, v2

    .line 214
    invoke-static {v1, v2}, Lxb;->а(Lr01;F)Lr01;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-static {v5, v6}, Lkn0;->β(J)J

    .line 219
    .line 220
    .line 221
    move-result-wide v3

    .line 222
    sget-object v5, Lyo1;->α:Lxo1;

    .line 223
    .line 224
    invoke-static {v2, v3, v4, v5}, Lln0;->κ(Lr01;JLiv1;)Lr01;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-static {v2, v9, v7}, Lec;->α(Lr01;Lv80;I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v9, v7}, Lv80;->ο(Z)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v9}, Lv80;->π()Lbl1;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    if-eqz v2, :cond_6

    .line 239
    .line 240
    new-instance v3, Lws0;

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    invoke-direct {v3, v0, v1, v12, v4}, Lws0;-><init>(Ljava/lang/String;Lr01;II)V

    .line 244
    .line 245
    .line 246
    :goto_4
    iput-object v3, v2, Lbl1;->δ:Le80;

    .line 247
    .line 248
    return-void

    .line 249
    :cond_5
    invoke-virtual {v9}, Lv80;->Ρ()V

    .line 250
    .line 251
    .line 252
    :goto_5
    invoke-virtual {v9}, Lv80;->π()Lbl1;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    if-eqz v2, :cond_6

    .line 257
    .line 258
    new-instance v3, Lws0;

    .line 259
    .line 260
    const/4 v4, 0x1

    .line 261
    invoke-direct {v3, v0, v1, v12, v4}, Lws0;-><init>(Ljava/lang/String;Lr01;II)V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_6
    return-void
.end method

.method public static final ε(Lxt0;ZZZLp70;Lp70;Lv80;I)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v14, p6

    .line 14
    .line 15
    const v0, 0xdfc54d4

    .line 16
    .line 17
    .line 18
    invoke-virtual {v14, v0}, Lv80;->Χ(I)Lv80;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v14, v1}, Lv80;->η(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/16 v0, 0x20

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/16 v0, 0x10

    .line 31
    .line 32
    :goto_0
    or-int v0, p7, v0

    .line 33
    .line 34
    invoke-virtual {v14, v2}, Lv80;->ζ(Z)Z

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    if-eqz v7, :cond_1

    .line 39
    .line 40
    const/16 v7, 0x100

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v7, 0x80

    .line 44
    .line 45
    :goto_1
    or-int/2addr v0, v7

    .line 46
    invoke-virtual {v14, v3}, Lv80;->ζ(Z)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    const/16 v7, 0x800

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v7, 0x400

    .line 56
    .line 57
    :goto_2
    or-int/2addr v0, v7

    .line 58
    invoke-virtual {v14, v4}, Lv80;->ζ(Z)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_3

    .line 63
    .line 64
    const/16 v7, 0x4000

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_3
    const/16 v7, 0x2000

    .line 68
    .line 69
    :goto_3
    or-int/2addr v0, v7

    .line 70
    invoke-virtual {v14, v5}, Lv80;->η(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    const/high16 v8, 0x20000

    .line 75
    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    move v7, v8

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const/high16 v7, 0x10000

    .line 81
    .line 82
    :goto_4
    or-int/2addr v0, v7

    .line 83
    invoke-virtual {v14, v6}, Lv80;->η(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_5

    .line 88
    .line 89
    const/high16 v7, 0x100000

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_5
    const/high16 v7, 0x80000

    .line 93
    .line 94
    :goto_5
    or-int/2addr v0, v7

    .line 95
    const v7, 0x92493

    .line 96
    .line 97
    .line 98
    and-int/2addr v7, v0

    .line 99
    const v10, 0x92492

    .line 100
    .line 101
    .line 102
    const/4 v15, 0x0

    .line 103
    if-eq v7, v10, :cond_6

    .line 104
    .line 105
    const/4 v7, 0x1

    .line 106
    goto :goto_6

    .line 107
    :cond_6
    move v7, v15

    .line 108
    :goto_6
    and-int/lit8 v10, v0, 0x1

    .line 109
    .line 110
    invoke-virtual {v14, v10, v7}, Lv80;->Ξ(IZ)Z

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-eqz v7, :cond_1e

    .line 115
    .line 116
    const v7, 0x3f47ae14    # 0.78f

    .line 117
    .line 118
    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    const-wide v10, 0xff3482ffL

    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    invoke-static {v10, v11}, Lkn0;->β(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v10

    .line 130
    goto :goto_7

    .line 131
    :cond_7
    if-eqz v4, :cond_8

    .line 132
    .line 133
    sget-wide v10, Lci;->γ:J

    .line 134
    .line 135
    const v12, 0x3f51eb85    # 0.82f

    .line 136
    .line 137
    .line 138
    invoke-static {v10, v11, v12}, Lci;->β(JF)J

    .line 139
    .line 140
    .line 141
    move-result-wide v10

    .line 142
    goto :goto_7

    .line 143
    :cond_8
    sget-wide v10, Lci;->β:J

    .line 144
    .line 145
    invoke-static {v10, v11, v7}, Lci;->β(JF)J

    .line 146
    .line 147
    .line 148
    move-result-wide v10

    .line 149
    :goto_7
    const/high16 v12, 0x43d20000    # 420.0f

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const/4 v9, 0x4

    .line 153
    invoke-static {v7, v12, v13, v9}, Lbd;->г(FFLjava/lang/Float;I)Lpz1;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    const-string v12, "liquid-fallback-tab-content-color"

    .line 158
    .line 159
    invoke-static {v10, v11, v7, v12, v14}, Lhw1;->α(JLpz1;Ljava/lang/String;Lv80;)Lc02;

    .line 160
    .line 161
    .line 162
    move-result-object v18

    .line 163
    if-eqz v3, :cond_9

    .line 164
    .line 165
    const v7, 0x3f91eb85    # 1.14f

    .line 166
    .line 167
    .line 168
    goto :goto_8

    .line 169
    :cond_9
    if-eqz v2, :cond_a

    .line 170
    .line 171
    const v7, 0x3f85c28f    # 1.045f

    .line 172
    .line 173
    .line 174
    goto :goto_8

    .line 175
    :cond_a
    const/high16 v7, 0x3f800000    # 1.0f

    .line 176
    .line 177
    :goto_8
    const v10, 0x3f2e147b    # 0.68f

    .line 178
    .line 179
    .line 180
    const/high16 v11, 0x43fa0000    # 500.0f

    .line 181
    .line 182
    invoke-static {v10, v11, v13, v9}, Lbd;->г(FFLjava/lang/Float;I)Lpz1;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    const-string v10, "liquid-fallback-tab-scale"

    .line 187
    .line 188
    invoke-static {v7, v9, v10, v14}, Ls3;->α(FLpz1;Ljava/lang/String;Lv80;)Lc02;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    sget-object v9, Lxb;->σ:Lu30;

    .line 193
    .line 194
    invoke-static {v9}, Lhp1;->α(Lr01;)Lr01;

    .line 195
    .line 196
    .line 197
    move-result-object v9

    .line 198
    invoke-virtual {v14, v7}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-virtual {v14}, Lv80;->Λ()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    sget-object v12, Lqn;->α:Li2;

    .line 207
    .line 208
    if-nez v10, :cond_b

    .line 209
    .line 210
    if-ne v11, v12, :cond_c

    .line 211
    .line 212
    :cond_b
    new-instance v11, Lts0;

    .line 213
    .line 214
    invoke-direct {v11, v7, v15}, Lts0;-><init>(Lc02;I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v14, v11}, Lv80;->е(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    :cond_c
    check-cast v11, La80;

    .line 221
    .line 222
    invoke-static {v9, v11}, Lh62;->г(Lr01;La80;)Lr01;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    invoke-virtual {v14, v1}, Lv80;->η(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v9

    .line 230
    const/high16 v10, 0x70000

    .line 231
    .line 232
    and-int/2addr v10, v0

    .line 233
    if-ne v10, v8, :cond_d

    .line 234
    .line 235
    const/4 v8, 0x1

    .line 236
    goto :goto_9

    .line 237
    :cond_d
    move v8, v15

    .line 238
    :goto_9
    or-int/2addr v8, v9

    .line 239
    const/high16 v9, 0x380000

    .line 240
    .line 241
    and-int/2addr v0, v9

    .line 242
    const/high16 v9, 0x100000

    .line 243
    .line 244
    if-ne v0, v9, :cond_e

    .line 245
    .line 246
    const/4 v0, 0x1

    .line 247
    goto :goto_a

    .line 248
    :cond_e
    move v0, v15

    .line 249
    :goto_a
    or-int/2addr v0, v8

    .line 250
    invoke-virtual {v14}, Lv80;->Λ()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    if-nez v0, :cond_f

    .line 255
    .line 256
    if-ne v8, v12, :cond_10

    .line 257
    .line 258
    :cond_f
    new-instance v8, Lus0;

    .line 259
    .line 260
    invoke-direct {v8, v1, v5, v6, v15}, Lus0;-><init>(Lxt0;Lp70;Lp70;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v14, v8}, Lv80;->е(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_10
    check-cast v8, La80;

    .line 267
    .line 268
    invoke-static {v7, v8}, Lyr1;->α(Lr01;La80;)Lr01;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    sget-object v7, Lu6;->α:Li2;

    .line 273
    .line 274
    const/4 v13, 0x1

    .line 275
    int-to-float v7, v13

    .line 276
    new-instance v8, Ls6;

    .line 277
    .line 278
    new-instance v9, Lγ;

    .line 279
    .line 280
    invoke-direct {v9, v13}, Lγ;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-direct {v8, v7, v9}, Ls6;-><init>(FLγ;)V

    .line 284
    .line 285
    .line 286
    invoke-static {v8, v14}, Lqi;->α(Ls6;Lv80;)Lsi;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    iget-wide v8, v14, Lv80;->Χ:J

    .line 291
    .line 292
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 293
    .line 294
    .line 295
    move-result v8

    .line 296
    invoke-virtual {v14}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    .line 297
    .line 298
    .line 299
    move-result-object v9

    .line 300
    invoke-static {v14, v0}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    sget-object v10, Lln;->β:Lkn;

    .line 305
    .line 306
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    sget-object v10, Lkn;->β:Lu40;

    .line 310
    .line 311
    invoke-virtual {v14}, Lv80;->Ψ()V

    .line 312
    .line 313
    .line 314
    iget-boolean v11, v14, Lv80;->Φ:Z

    .line 315
    .line 316
    if-eqz v11, :cond_11

    .line 317
    .line 318
    invoke-virtual {v14, v10}, Lv80;->κ(Lp70;)V

    .line 319
    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_11
    invoke-virtual {v14}, Lv80;->и()V

    .line 323
    .line 324
    .line 325
    :goto_b
    sget-object v11, Lkn;->ε:Lui;

    .line 326
    .line 327
    invoke-static {v11, v14, v7}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    sget-object v7, Lkn;->δ:Lui;

    .line 331
    .line 332
    invoke-static {v7, v14, v9}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    sget-object v9, Lkn;->ζ:Lui;

    .line 340
    .line 341
    invoke-static {v9, v14, v8}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    sget-object v8, Lkn;->η:La1;

    .line 345
    .line 346
    invoke-static {v14, v8}, Le81;->ξ(Lv80;La80;)V

    .line 347
    .line 348
    .line 349
    sget-object v12, Lkn;->γ:Lui;

    .line 350
    .line 351
    invoke-static {v12, v14, v0}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    sget-object v0, Lx;->θ:Laa;

    .line 355
    .line 356
    invoke-static {v0}, Lec;->δ(Laa;)Lpx0;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    iget-wide v2, v14, Lv80;->Χ:J

    .line 361
    .line 362
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    invoke-virtual {v14}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    sget-object v13, Lp01;->α:Lp01;

    .line 371
    .line 372
    invoke-static {v14, v13}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    .line 373
    .line 374
    .line 375
    move-result-object v15

    .line 376
    invoke-virtual {v14}, Lv80;->Ψ()V

    .line 377
    .line 378
    .line 379
    move/from16 v19, v2

    .line 380
    .line 381
    iget-boolean v2, v14, Lv80;->Φ:Z

    .line 382
    .line 383
    if-eqz v2, :cond_12

    .line 384
    .line 385
    invoke-virtual {v14, v10}, Lv80;->κ(Lp70;)V

    .line 386
    .line 387
    .line 388
    goto :goto_c

    .line 389
    :cond_12
    invoke-virtual {v14}, Lv80;->и()V

    .line 390
    .line 391
    .line 392
    :goto_c
    invoke-static {v11, v14, v0}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    invoke-static {v7, v14, v3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 396
    .line 397
    .line 398
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    invoke-static {v9, v14, v0}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    invoke-static {v14, v8}, Le81;->ξ(Lv80;La80;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v12, v14, v15}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    iget-object v0, v1, Lxt0;->γ:Landroid/graphics/Bitmap;

    .line 412
    .line 413
    iget-object v8, v1, Lxt0;->β:Ljava/lang/String;

    .line 414
    .line 415
    iget-object v2, v1, Lxt0;->ε:Ljava/lang/String;

    .line 416
    .line 417
    if-eqz v0, :cond_14

    .line 418
    .line 419
    const v0, -0x13a483df

    .line 420
    .line 421
    .line 422
    invoke-virtual {v14, v0}, Lv80;->Φ(I)V

    .line 423
    .line 424
    .line 425
    iget-object v0, v1, Lxt0;->γ:Landroid/graphics/Bitmap;

    .line 426
    .line 427
    new-instance v7, Lm2;

    .line 428
    .line 429
    invoke-direct {v7, v0}, Lm2;-><init>(Landroid/graphics/Bitmap;)V

    .line 430
    .line 431
    .line 432
    invoke-static {v8}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_13

    .line 437
    .line 438
    const/16 v0, 0x1b

    .line 439
    .line 440
    :goto_d
    int-to-float v0, v0

    .line 441
    goto :goto_e

    .line 442
    :cond_13
    const/16 v0, 0x17

    .line 443
    .line 444
    goto :goto_d

    .line 445
    :goto_e
    invoke-static {v13, v0}, Lxb;->а(Lr01;F)Lr01;

    .line 446
    .line 447
    .line 448
    move-result-object v9

    .line 449
    const/16 v12, 0x6000

    .line 450
    .line 451
    sget-object v10, Ljp;->α:Li2;

    .line 452
    .line 453
    move-object v11, v14

    .line 454
    invoke-static/range {v7 .. v12}, Lyh;->δ(Lm2;Ljava/lang/String;Lr01;Li2;Lv80;I)V

    .line 455
    .line 456
    .line 457
    move-object v0, v8

    .line 458
    const/4 v3, 0x0

    .line 459
    invoke-virtual {v14, v3}, Lv80;->ο(Z)V

    .line 460
    .line 461
    .line 462
    move-object/from16 v19, v0

    .line 463
    .line 464
    move-object v0, v13

    .line 465
    goto/16 :goto_11

    .line 466
    .line 467
    :cond_14
    move-object v0, v8

    .line 468
    const/4 v3, 0x0

    .line 469
    const v7, -0x139fcccf

    .line 470
    .line 471
    .line 472
    invoke-virtual {v14, v7}, Lv80;->Φ(I)V

    .line 473
    .line 474
    .line 475
    iget-object v7, v1, Lxt0;->α:Ljava/lang/String;

    .line 476
    .line 477
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 478
    .line 479
    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v7

    .line 483
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    const-string v8, "publish"

    .line 487
    .line 488
    invoke-static {v7, v8, v3}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 489
    .line 490
    .line 491
    move-result v7

    .line 492
    if-nez v7, :cond_17

    .line 493
    .line 494
    const-string v7, "\u53d1\u5e03"

    .line 495
    .line 496
    invoke-virtual {v0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result v7

    .line 500
    if-eqz v7, :cond_15

    .line 501
    .line 502
    goto :goto_f

    .line 503
    :cond_15
    invoke-static {v0}, Lq02;->Ω(Ljava/lang/CharSequence;)Ljava/lang/Character;

    .line 504
    .line 505
    .line 506
    move-result-object v7

    .line 507
    if-eqz v7, :cond_16

    .line 508
    .line 509
    invoke-virtual {v7}, Ljava/lang/Character;->toString()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v7

    .line 513
    if-nez v7, :cond_18

    .line 514
    .line 515
    :cond_16
    const-string v7, "\u2022"

    .line 516
    .line 517
    goto :goto_10

    .line 518
    :cond_17
    :goto_f
    const-string v7, "+"

    .line 519
    .line 520
    :cond_18
    :goto_10
    new-instance v9, Lw32;

    .line 521
    .line 522
    invoke-interface/range {v18 .. v18}, Lc02;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v8

    .line 526
    check-cast v8, Lci;

    .line 527
    .line 528
    iget-wide v10, v8, Lci;->α:J

    .line 529
    .line 530
    const/16 v8, 0x13

    .line 531
    .line 532
    invoke-static {v8}, Lu81;->η(I)J

    .line 533
    .line 534
    .line 535
    move-result-wide v22

    .line 536
    sget-object v24, Ld60;->θ:Ld60;

    .line 537
    .line 538
    const v25, 0xfffff8

    .line 539
    .line 540
    .line 541
    move-object/from16 v19, v9

    .line 542
    .line 543
    move-wide/from16 v20, v10

    .line 544
    .line 545
    invoke-direct/range {v19 .. v25}, Lw32;-><init>(JJLd60;I)V

    .line 546
    .line 547
    .line 548
    const/4 v15, 0x0

    .line 549
    const/4 v8, 0x1

    .line 550
    const/16 v16, 0x3fa

    .line 551
    .line 552
    move v10, v8

    .line 553
    const/4 v8, 0x0

    .line 554
    move v11, v10

    .line 555
    const/4 v10, 0x0

    .line 556
    move v12, v11

    .line 557
    const/4 v11, 0x0

    .line 558
    move/from16 v17, v12

    .line 559
    .line 560
    const/4 v12, 0x0

    .line 561
    move-object/from16 v19, v13

    .line 562
    .line 563
    const/4 v13, 0x0

    .line 564
    move-object/from16 v27, v19

    .line 565
    .line 566
    move-object/from16 v19, v0

    .line 567
    .line 568
    move-object/from16 v0, v27

    .line 569
    .line 570
    invoke-static/range {v7 .. v16}, Lln0;->α(Ljava/lang/String;Lr01;Lw32;IZIILv80;II)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v14, v3}, Lv80;->ο(Z)V

    .line 574
    .line 575
    .line 576
    :goto_11
    if-eqz v2, :cond_19

    .line 577
    .line 578
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 579
    .line 580
    .line 581
    move-result v7

    .line 582
    if-eqz v7, :cond_1a

    .line 583
    .line 584
    :cond_19
    iget-boolean v7, v1, Lxt0;->ζ:Z

    .line 585
    .line 586
    if-eqz v7, :cond_1b

    .line 587
    .line 588
    :cond_1a
    const v7, -0x139a0cea

    .line 589
    .line 590
    .line 591
    invoke-virtual {v14, v7}, Lv80;->Φ(I)V

    .line 592
    .line 593
    .line 594
    const/4 v7, 0x7

    .line 595
    int-to-float v7, v7

    .line 596
    const/4 v8, -0x3

    .line 597
    int-to-float v8, v8

    .line 598
    invoke-static {v0, v7, v8}, Lbd;->Ι(Lr01;FF)Lr01;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    const/16 v7, 0x30

    .line 603
    .line 604
    invoke-static {v2, v0, v14, v7}, Ljx0;->δ(Ljava/lang/String;Lr01;Lv80;I)V

    .line 605
    .line 606
    .line 607
    :goto_12
    invoke-virtual {v14, v3}, Lv80;->ο(Z)V

    .line 608
    .line 609
    .line 610
    const/4 v8, 0x1

    .line 611
    goto :goto_13

    .line 612
    :cond_1b
    const v0, -0x1489584e

    .line 613
    .line 614
    .line 615
    invoke-virtual {v14, v0}, Lv80;->Φ(I)V

    .line 616
    .line 617
    .line 618
    goto :goto_12

    .line 619
    :goto_13
    invoke-virtual {v14, v8}, Lv80;->ο(Z)V

    .line 620
    .line 621
    .line 622
    invoke-static/range {v19 .. v19}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    if-nez v0, :cond_1d

    .line 627
    .line 628
    const v0, 0x7a5ea387

    .line 629
    .line 630
    .line 631
    invoke-virtual {v14, v0}, Lv80;->Φ(I)V

    .line 632
    .line 633
    .line 634
    sget-object v8, Lxb;->ρ:Lu30;

    .line 635
    .line 636
    new-instance v9, Lw32;

    .line 637
    .line 638
    invoke-interface/range {v18 .. v18}, Lc02;->getValue()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    check-cast v0, Lci;

    .line 643
    .line 644
    iget-wide v10, v0, Lci;->α:J

    .line 645
    .line 646
    const/16 v0, 0xb

    .line 647
    .line 648
    invoke-static {v0}, Lu81;->η(I)J

    .line 649
    .line 650
    .line 651
    move-result-wide v23

    .line 652
    if-eqz p1, :cond_1c

    .line 653
    .line 654
    sget-object v0, Ld60;->θ:Ld60;

    .line 655
    .line 656
    :goto_14
    move-object/from16 v25, v0

    .line 657
    .line 658
    goto :goto_15

    .line 659
    :cond_1c
    sget-object v0, Ld60;->η:Ld60;

    .line 660
    .line 661
    goto :goto_14

    .line 662
    :goto_15
    const v26, 0xff7ff8

    .line 663
    .line 664
    .line 665
    move-object/from16 v20, v9

    .line 666
    .line 667
    move-wide/from16 v21, v10

    .line 668
    .line 669
    invoke-direct/range {v20 .. v26}, Lw32;-><init>(JJLd60;I)V

    .line 670
    .line 671
    .line 672
    const v15, 0x186030

    .line 673
    .line 674
    .line 675
    const/16 v16, 0x3a8

    .line 676
    .line 677
    const/4 v10, 0x2

    .line 678
    const/4 v11, 0x0

    .line 679
    const/4 v12, 0x1

    .line 680
    const/4 v13, 0x0

    .line 681
    move-object/from16 v7, v19

    .line 682
    .line 683
    invoke-static/range {v7 .. v16}, Lln0;->α(Ljava/lang/String;Lr01;Lw32;IZIILv80;II)V

    .line 684
    .line 685
    .line 686
    :goto_16
    invoke-virtual {v14, v3}, Lv80;->ο(Z)V

    .line 687
    .line 688
    .line 689
    const/4 v8, 0x1

    .line 690
    goto :goto_17

    .line 691
    :cond_1d
    const v0, 0x796ba418

    .line 692
    .line 693
    .line 694
    invoke-virtual {v14, v0}, Lv80;->Φ(I)V

    .line 695
    .line 696
    .line 697
    goto :goto_16

    .line 698
    :goto_17
    invoke-virtual {v14, v8}, Lv80;->ο(Z)V

    .line 699
    .line 700
    .line 701
    goto :goto_18

    .line 702
    :cond_1e
    invoke-virtual {v14}, Lv80;->Ρ()V

    .line 703
    .line 704
    .line 705
    :goto_18
    invoke-virtual {v14}, Lv80;->π()Lbl1;

    .line 706
    .line 707
    .line 708
    move-result-object v9

    .line 709
    if-eqz v9, :cond_1f

    .line 710
    .line 711
    new-instance v0, Lvs0;

    .line 712
    .line 713
    const/4 v8, 0x0

    .line 714
    move/from16 v2, p1

    .line 715
    .line 716
    move/from16 v3, p2

    .line 717
    .line 718
    move/from16 v7, p7

    .line 719
    .line 720
    invoke-direct/range {v0 .. v8}, Lvs0;-><init>(Lxt0;ZZZLp70;Lp70;II)V

    .line 721
    .line 722
    .line 723
    iput-object v0, v9, Lbl1;->δ:Le80;

    .line 724
    .line 725
    :cond_1f
    return-void
.end method

.method public static final ζ(FLan;Lv80;I)V
    .locals 6

    .line 1
    const v0, -0x58d73e34

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Lv80;->Χ(I)Lv80;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, Lv80;->γ(F)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    :goto_0
    or-int/2addr v0, p3

    .line 17
    and-int/lit8 v1, v0, 0x13

    .line 18
    .line 19
    const/16 v2, 0x12

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    if-eq v1, v2, :cond_1

    .line 23
    .line 24
    move v1, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    const/4 v1, 0x0

    .line 27
    :goto_1
    and-int/2addr v0, v3

    .line 28
    invoke-virtual {p2, v0, v1}, Lv80;->Ξ(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 39
    .line 40
    .line 41
    cmpg-float v0, v0, v1

    .line 42
    .line 43
    if-gtz v0, :cond_2

    .line 44
    .line 45
    const/high16 v0, 0x3f000000    # 0.5f

    .line 46
    .line 47
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 48
    .line 49
    invoke-static {p0, v0, v1}, Lj81;->λ(FFF)F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    .line 55
    .line 56
    :goto_2
    sget-object v1, Lfo;->θ:Lm02;

    .line 57
    .line 58
    invoke-virtual {p2, v1}, Lv80;->ι(Lak1;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lyr;

    .line 63
    .line 64
    invoke-interface {v1}, Lyr;->β()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    mul-float/2addr v2, v0

    .line 69
    invoke-interface {v1}, Lyr;->θ()F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    new-instance v4, Lzr;

    .line 74
    .line 75
    invoke-direct {v4, v2, v1}, Lzr;-><init>(FF)V

    .line 76
    .line 77
    .line 78
    const/high16 v1, 0x40000000    # 2.0f

    .line 79
    .line 80
    mul-float/2addr v1, v0

    .line 81
    sget-object v2, Lxb;->τ:Lu30;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    invoke-static {v2, v5, v1, v3}, Lyh;->ж(Lr01;FFI)Lr01;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    sget-object v2, Lx;->ν:Laa;

    .line 89
    .line 90
    new-instance v3, Lys0;

    .line 91
    .line 92
    invoke-direct {v3, v0, v4, p1}, Lys0;-><init>(FLzr;Lan;)V

    .line 93
    .line 94
    .line 95
    const v0, -0x35afdeca    # -3409997.5f

    .line 96
    .line 97
    .line 98
    invoke-static {v0, v3, p2}, Lkn0;->Ν(ILm80;Lv80;)Lan;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const/16 v3, 0xc30

    .line 103
    .line 104
    invoke-static {v1, v2, v0, p2, v3}, Lyh;->α(Lr01;Laa;Lan;Lv80;I)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_3
    invoke-virtual {p2}, Lv80;->Ρ()V

    .line 109
    .line 110
    .line 111
    :goto_3
    invoke-virtual {p2}, Lv80;->π()Lbl1;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    if-eqz p2, :cond_4

    .line 116
    .line 117
    new-instance v0, Lzs0;

    .line 118
    .line 119
    invoke-direct {v0, p0, p1, p3}, Lzs0;-><init>(FLan;I)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p2, Lbl1;->δ:Le80;

    .line 123
    .line 124
    :cond_4
    return-void
.end method

.method public static final η(Lr01;Le80;Lv80;I)V
    .locals 3

    .line 1
    const v0, -0x4d634bd0    # -1.824273E-8f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, Lv80;->Χ(I)Lv80;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lv80;->η(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 40
    .line 41
    const/16 v2, 0x12

    .line 42
    .line 43
    if-eq v1, v2, :cond_4

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    const/4 v1, 0x0

    .line 48
    :goto_3
    and-int/lit8 v2, v0, 0x1

    .line 49
    .line 50
    invoke-virtual {p2, v2, v1}, Lv80;->Ξ(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_6

    .line 55
    .line 56
    invoke-virtual {p2}, Lv80;->Λ()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sget-object v2, Lqn;->α:Li2;

    .line 61
    .line 62
    if-ne v1, v2, :cond_5

    .line 63
    .line 64
    new-instance v1, Lh12;

    .line 65
    .line 66
    invoke-direct {v1}, Lh12;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v1}, Lv80;->е(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    check-cast v1, Lh12;

    .line 73
    .line 74
    shl-int/lit8 v0, v0, 0x3

    .line 75
    .line 76
    and-int/lit16 v0, v0, 0x3f0

    .line 77
    .line 78
    invoke-static {v1, p0, p1, p2, v0}, Ljx0;->θ(Lh12;Lr01;Le80;Lv80;I)V

    .line 79
    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    invoke-virtual {p2}, Lv80;->Ρ()V

    .line 83
    .line 84
    .line 85
    :goto_4
    invoke-virtual {p2}, Lv80;->π()Lbl1;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-eqz p2, :cond_7

    .line 90
    .line 91
    new-instance v0, Ld12;

    .line 92
    .line 93
    invoke-direct {v0, p0, p1, p3}, Ld12;-><init>(Lr01;Le80;I)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p2, Lbl1;->δ:Le80;

    .line 97
    .line 98
    :cond_7
    return-void
.end method

.method public static final θ(Lh12;Lr01;Le80;Lv80;I)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v10, p4

    .line 10
    .line 11
    const v3, -0x1e845847

    .line 12
    .line 13
    .line 14
    invoke-virtual {v4, v3}, Lv80;->Χ(I)Lv80;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v3, v10, 0x6

    .line 18
    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    invoke-virtual {v4, v0}, Lv80;->η(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    const/4 v3, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v3, 0x2

    .line 30
    :goto_0
    or-int/2addr v3, v10

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v3, v10

    .line 33
    :goto_1
    and-int/lit8 v5, v10, 0x30

    .line 34
    .line 35
    if-nez v5, :cond_3

    .line 36
    .line 37
    invoke-virtual {v4, v1}, Lv80;->ε(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    const/16 v5, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v5, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v3, v5

    .line 49
    :cond_3
    and-int/lit16 v5, v10, 0x180

    .line 50
    .line 51
    if-nez v5, :cond_5

    .line 52
    .line 53
    invoke-virtual {v4, v2}, Lv80;->η(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_4

    .line 58
    .line 59
    const/16 v5, 0x100

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_4
    const/16 v5, 0x80

    .line 63
    .line 64
    :goto_3
    or-int/2addr v3, v5

    .line 65
    :cond_5
    and-int/lit16 v5, v3, 0x93

    .line 66
    .line 67
    const/16 v6, 0x92

    .line 68
    .line 69
    const/4 v11, 0x1

    .line 70
    const/4 v12, 0x0

    .line 71
    if-eq v5, v6, :cond_6

    .line 72
    .line 73
    move v5, v11

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    move v5, v12

    .line 76
    :goto_4
    and-int/2addr v3, v11

    .line 77
    invoke-virtual {v4, v3, v5}, Lv80;->Ξ(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_e

    .line 82
    .line 83
    iget-wide v5, v4, Lv80;->Χ:J

    .line 84
    .line 85
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 86
    .line 87
    .line 88
    move-result v13

    .line 89
    const/16 v3, 0xce

    .line 90
    .line 91
    sget-object v5, Lsn;->ε:Li51;

    .line 92
    .line 93
    invoke-virtual {v4, v3, v5}, Lv80;->Τ(ILi51;)V

    .line 94
    .line 95
    .line 96
    iget-boolean v3, v4, Lv80;->Φ:Z

    .line 97
    .line 98
    if-eqz v3, :cond_7

    .line 99
    .line 100
    iget-object v3, v4, Lv80;->Λ:Lrw1;

    .line 101
    .line 102
    invoke-static {v3}, Lrw1;->Β(Lrw1;)V

    .line 103
    .line 104
    .line 105
    :cond_7
    invoke-virtual {v4}, Lv80;->Γ()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    instance-of v5, v3, La90;

    .line 110
    .line 111
    if-eqz v5, :cond_8

    .line 112
    .line 113
    check-cast v3, La90;

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_8
    const/4 v3, 0x0

    .line 117
    :goto_5
    if-nez v3, :cond_9

    .line 118
    .line 119
    new-instance v14, Lho1;

    .line 120
    .line 121
    new-instance v15, Ls80;

    .line 122
    .line 123
    new-instance v3, Lt80;

    .line 124
    .line 125
    iget-wide v5, v4, Lv80;->Χ:J

    .line 126
    .line 127
    iget-boolean v7, v4, Lv80;->ρ:Z

    .line 128
    .line 129
    iget-boolean v8, v4, Lv80;->Ε:Z

    .line 130
    .line 131
    iget-object v9, v4, Lv80;->θ:Lzn;

    .line 132
    .line 133
    iget-object v9, v9, Lzn;->χ:Ln;

    .line 134
    .line 135
    invoke-direct/range {v3 .. v9}, Lt80;-><init>(Lv80;JZZLn;)V

    .line 136
    .line 137
    .line 138
    invoke-direct {v15, v3}, Ls80;-><init>(Lt80;)V

    .line 139
    .line 140
    .line 141
    const/4 v3, -0x1

    .line 142
    invoke-direct {v14, v15, v3}, La90;-><init>(Lfn1;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v14}, Lv80;->ж(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move-object v3, v14

    .line 149
    :cond_9
    iget-object v3, v3, La90;->α:Lfn1;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    check-cast v3, Ls80;

    .line 155
    .line 156
    iget-object v3, v3, Ls80;->ε:Lt80;

    .line 157
    .line 158
    invoke-virtual {v4}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    iget-object v6, v3, Lt80;->ζ:Lx91;

    .line 163
    .line 164
    invoke-virtual {v6, v5}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v4, v12}, Lv80;->ο(Z)V

    .line 168
    .line 169
    .line 170
    invoke-static {v4, v1}, Lpd2;->Γ(Lv80;Lr01;)Lr01;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-virtual {v4}, Lv80;->λ()Landroidx/compose/runtime/internal/α;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    sget-object v7, Lu40;->η:Lu40;

    .line 179
    .line 180
    invoke-virtual {v4}, Lv80;->Ψ()V

    .line 181
    .line 182
    .line 183
    iget-boolean v8, v4, Lv80;->Φ:Z

    .line 184
    .line 185
    if-eqz v8, :cond_a

    .line 186
    .line 187
    invoke-virtual {v4, v7}, Lv80;->κ(Lp70;)V

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :cond_a
    invoke-virtual {v4}, Lv80;->и()V

    .line 192
    .line 193
    .line 194
    :goto_6
    iget-object v7, v0, Lh12;->β:Lg12;

    .line 195
    .line 196
    invoke-static {v7, v4, v0}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    iget-object v7, v0, Lh12;->γ:Lg12;

    .line 200
    .line 201
    invoke-static {v7, v4, v3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    iget-object v3, v0, Lh12;->δ:Lg12;

    .line 205
    .line 206
    invoke-static {v3, v4, v2}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    sget-object v3, Lln;->β:Lkn;

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    sget-object v3, Lkn;->δ:Lui;

    .line 215
    .line 216
    invoke-static {v3, v4, v6}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    sget-object v3, Lkn;->η:La1;

    .line 220
    .line 221
    invoke-static {v4, v3}, Le81;->ξ(Lv80;La80;)V

    .line 222
    .line 223
    .line 224
    sget-object v3, Lkn;->γ:Lui;

    .line 225
    .line 226
    invoke-static {v3, v4, v5}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    sget-object v5, Lkn;->ζ:Lui;

    .line 234
    .line 235
    invoke-static {v5, v4, v3}, Le81;->ρ(Le80;Lv80;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v11}, Lv80;->ο(Z)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4}, Lv80;->ω()Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-nez v3, :cond_d

    .line 246
    .line 247
    const v3, -0x4b0e9154

    .line 248
    .line 249
    .line 250
    invoke-virtual {v4, v3}, Lv80;->Φ(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4, v0}, Lv80;->η(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    invoke-virtual {v4}, Lv80;->Λ()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    if-nez v3, :cond_b

    .line 262
    .line 263
    sget-object v3, Lqn;->α:Li2;

    .line 264
    .line 265
    if-ne v5, v3, :cond_c

    .line 266
    .line 267
    :cond_b
    new-instance v5, Lk1;

    .line 268
    .line 269
    const/16 v3, 0x8

    .line 270
    .line 271
    invoke-direct {v5, v3, v0}, Lk1;-><init>(ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v5}, Lv80;->е(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_c
    check-cast v5, Lp70;

    .line 278
    .line 279
    iget-object v3, v4, Lv80;->Ο:Lrn;

    .line 280
    .line 281
    iget-object v3, v3, Lrn;->β:Lke;

    .line 282
    .line 283
    iget-object v3, v3, Lke;->π:Lh81;

    .line 284
    .line 285
    sget-object v6, Lg61;->γ:Lg61;

    .line 286
    .line 287
    invoke-virtual {v3, v6}, Lh81;->Θ(Lo61;)V

    .line 288
    .line 289
    .line 290
    invoke-static {v3, v12, v5}, Lg81;->τ(Lh81;ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4, v12}, Lv80;->ο(Z)V

    .line 294
    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_d
    const v3, -0x4b0dac57

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, v3}, Lv80;->Φ(I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v4, v12}, Lv80;->ο(Z)V

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_e
    invoke-virtual {v4}, Lv80;->Ρ()V

    .line 308
    .line 309
    .line 310
    :goto_7
    invoke-virtual {v4}, Lv80;->π()Lbl1;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    if-eqz v3, :cond_f

    .line 315
    .line 316
    new-instance v4, Le12;

    .line 317
    .line 318
    invoke-direct {v4, v0, v1, v2, v10}, Le12;-><init>(Lh12;Lr01;Le80;I)V

    .line 319
    .line 320
    .line 321
    iput-object v4, v3, Lbl1;->δ:Le80;

    .line 322
    .line 323
    :cond_f
    return-void
.end method

.method public static final ι(Lm92;Ln5;Ljr0;)V
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
    const-string p1, "androidx.lifecycle.savedstate.vm.tag"

    .line 8
    .line 9
    iget-object p0, p0, Lm92;->α:Ln92;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    iget-object p2, p0, Ln92;->α:Lzz1;

    .line 14
    .line 15
    monitor-enter p2

    .line 16
    :try_start_0
    iget-object p0, p0, Ln92;->β:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/AutoCloseable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p2

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    monitor-exit p2

    .line 28
    throw p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    :goto_0
    check-cast p0, Laq1;

    .line 31
    .line 32
    return-void
.end method

.method public static final varargs κ([Ll91;)Landroid/os/Bundle;
    .locals 9

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    .line 5
    .line 6
    .line 7
    array-length v1, p0

    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v1, :cond_1d

    .line 10
    .line 11
    aget-object v3, p0, v2

    .line 12
    .line 13
    iget-object v4, v3, Ll91;->ε:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, Ljava/lang/String;

    .line 16
    .line 17
    iget-object v3, v3, Ll91;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    instance-of v5, v3, Ljava/lang/Boolean;

    .line 28
    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    check-cast v3, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_1
    instance-of v5, v3, Ljava/lang/Byte;

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    check-cast v3, Ljava/lang/Number;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :cond_2
    instance-of v5, v3, Ljava/lang/Character;

    .line 58
    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    check-cast v3, Ljava/lang/Character;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :cond_3
    instance-of v5, v3, Ljava/lang/Double;

    .line 73
    .line 74
    if-eqz v5, :cond_4

    .line 75
    .line 76
    check-cast v3, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 79
    .line 80
    .line 81
    move-result-wide v5

    .line 82
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_4
    instance-of v5, v3, Ljava/lang/Float;

    .line 88
    .line 89
    if-eqz v5, :cond_5

    .line 90
    .line 91
    check-cast v3, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :cond_5
    instance-of v5, v3, Ljava/lang/Integer;

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    check-cast v3, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :cond_6
    instance-of v5, v3, Ljava/lang/Long;

    .line 118
    .line 119
    if-eqz v5, :cond_7

    .line 120
    .line 121
    check-cast v3, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v5

    .line 127
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :cond_7
    instance-of v5, v3, Ljava/lang/Short;

    .line 133
    .line 134
    if-eqz v5, :cond_8

    .line 135
    .line 136
    check-cast v3, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Number;->shortValue()S

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_1

    .line 146
    .line 147
    :cond_8
    instance-of v5, v3, Landroid/os/Bundle;

    .line 148
    .line 149
    if-eqz v5, :cond_9

    .line 150
    .line 151
    check-cast v3, Landroid/os/Bundle;

    .line 152
    .line 153
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_1

    .line 157
    .line 158
    :cond_9
    instance-of v5, v3, Ljava/lang/CharSequence;

    .line 159
    .line 160
    if-eqz v5, :cond_a

    .line 161
    .line 162
    check-cast v3, Ljava/lang/CharSequence;

    .line 163
    .line 164
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    goto/16 :goto_1

    .line 168
    .line 169
    :cond_a
    instance-of v5, v3, Landroid/os/Parcelable;

    .line 170
    .line 171
    if-eqz v5, :cond_b

    .line 172
    .line 173
    check-cast v3, Landroid/os/Parcelable;

    .line 174
    .line 175
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_1

    .line 179
    .line 180
    :cond_b
    instance-of v5, v3, [Z

    .line 181
    .line 182
    if-eqz v5, :cond_c

    .line 183
    .line 184
    check-cast v3, [Z

    .line 185
    .line 186
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_1

    .line 190
    .line 191
    :cond_c
    instance-of v5, v3, [B

    .line 192
    .line 193
    if-eqz v5, :cond_d

    .line 194
    .line 195
    check-cast v3, [B

    .line 196
    .line 197
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :cond_d
    instance-of v5, v3, [C

    .line 203
    .line 204
    if-eqz v5, :cond_e

    .line 205
    .line 206
    check-cast v3, [C

    .line 207
    .line 208
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :cond_e
    instance-of v5, v3, [D

    .line 214
    .line 215
    if-eqz v5, :cond_f

    .line 216
    .line 217
    check-cast v3, [D

    .line 218
    .line 219
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putDoubleArray(Ljava/lang/String;[D)V

    .line 220
    .line 221
    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    :cond_f
    instance-of v5, v3, [F

    .line 225
    .line 226
    if-eqz v5, :cond_10

    .line 227
    .line 228
    check-cast v3, [F

    .line 229
    .line 230
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_10
    instance-of v5, v3, [I

    .line 236
    .line 237
    if-eqz v5, :cond_11

    .line 238
    .line 239
    check-cast v3, [I

    .line 240
    .line 241
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :cond_11
    instance-of v5, v3, [J

    .line 247
    .line 248
    if-eqz v5, :cond_12

    .line 249
    .line 250
    check-cast v3, [J

    .line 251
    .line 252
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :cond_12
    instance-of v5, v3, [S

    .line 258
    .line 259
    if-eqz v5, :cond_13

    .line 260
    .line 261
    check-cast v3, [S

    .line 262
    .line 263
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putShortArray(Ljava/lang/String;[S)V

    .line 264
    .line 265
    .line 266
    goto/16 :goto_1

    .line 267
    .line 268
    :cond_13
    instance-of v5, v3, [Ljava/lang/Object;

    .line 269
    .line 270
    const/16 v6, 0x22

    .line 271
    .line 272
    const-string v7, " for key \""

    .line 273
    .line 274
    if-eqz v5, :cond_18

    .line 275
    .line 276
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    const-class v8, Landroid/os/Parcelable;

    .line 288
    .line 289
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    if-eqz v8, :cond_14

    .line 294
    .line 295
    check-cast v3, [Landroid/os/Parcelable;

    .line 296
    .line 297
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 298
    .line 299
    .line 300
    goto/16 :goto_1

    .line 301
    .line 302
    :cond_14
    const-class v8, Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 305
    .line 306
    .line 307
    move-result v8

    .line 308
    if-eqz v8, :cond_15

    .line 309
    .line 310
    check-cast v3, [Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    goto :goto_1

    .line 316
    :cond_15
    const-class v8, Ljava/lang/CharSequence;

    .line 317
    .line 318
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    if-eqz v8, :cond_16

    .line 323
    .line 324
    check-cast v3, [Ljava/lang/CharSequence;

    .line 325
    .line 326
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    .line 327
    .line 328
    .line 329
    goto :goto_1

    .line 330
    :cond_16
    const-class v8, Ljava/io/Serializable;

    .line 331
    .line 332
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    if-eqz v8, :cond_17

    .line 337
    .line 338
    check-cast v3, Ljava/io/Serializable;

    .line 339
    .line 340
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 341
    .line 342
    .line 343
    goto :goto_1

    .line 344
    :cond_17
    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 349
    .line 350
    new-instance v1, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v2, "Illegal value array type "

    .line 353
    .line 354
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :cond_18
    instance-of v5, v3, Ljava/io/Serializable;

    .line 378
    .line 379
    if-eqz v5, :cond_19

    .line 380
    .line 381
    check-cast v3, Ljava/io/Serializable;

    .line 382
    .line 383
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 384
    .line 385
    .line 386
    goto :goto_1

    .line 387
    :cond_19
    instance-of v5, v3, Landroid/os/IBinder;

    .line 388
    .line 389
    if-eqz v5, :cond_1a

    .line 390
    .line 391
    check-cast v3, Landroid/os/IBinder;

    .line 392
    .line 393
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 394
    .line 395
    .line 396
    goto :goto_1

    .line 397
    :cond_1a
    instance-of v5, v3, Landroid/util/Size;

    .line 398
    .line 399
    if-eqz v5, :cond_1b

    .line 400
    .line 401
    check-cast v3, Landroid/util/Size;

    .line 402
    .line 403
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSize(Ljava/lang/String;Landroid/util/Size;)V

    .line 404
    .line 405
    .line 406
    goto :goto_1

    .line 407
    :cond_1b
    instance-of v5, v3, Landroid/util/SizeF;

    .line 408
    .line 409
    if-eqz v5, :cond_1c

    .line 410
    .line 411
    check-cast v3, Landroid/util/SizeF;

    .line 412
    .line 413
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSizeF(Ljava/lang/String;Landroid/util/SizeF;)V

    .line 414
    .line 415
    .line 416
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 417
    .line 418
    goto/16 :goto_0

    .line 419
    .line 420
    :cond_1c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 429
    .line 430
    new-instance v1, Ljava/lang/StringBuilder;

    .line 431
    .line 432
    const-string v2, "Illegal value type "

    .line 433
    .line 434
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    throw v0

    .line 457
    :cond_1d
    return-object v0
.end method

.method public static λ(I)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    if-gt v0, p0, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x25

    .line 5
    .line 6
    if-ge p0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v2, "radix "

    .line 12
    .line 13
    const-string v3, " was not in valid range "

    .line 14
    .line 15
    invoke-static {p0, v2, v3}, La12;->ζ(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v2, Lxm0;

    .line 20
    .line 21
    const/16 v3, 0x24

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-direct {v2, v0, v3, v4}, Lvm0;-><init>(III)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public static μ(III)V
    .locals 4

    .line 1
    const-string v0, "fromIndex: "

    .line 2
    .line 3
    if-ltz p0, :cond_1

    .line 4
    .line 5
    if-gt p1, p2, :cond_1

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p2, " > toIndex: "

    .line 11
    .line 12
    invoke-static {p0, p1, v0, p2}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 21
    .line 22
    const-string v2, ", toIndex: "

    .line 23
    .line 24
    const-string v3, ", size: "

    .line 25
    .line 26
    invoke-static {v0, p0, v2, p1, v3}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1
.end method

.method public static ν(Landroid/content/Context;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v1, "comment_bg_blur_cache"

    .line 11
    .line 12
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 16
    .line 17
    .line 18
    new-instance p0, Lcu;

    .line 19
    .line 20
    invoke-direct {p0, v0}, Lcu;-><init>(Ljava/io/File;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lp30;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lp30;-><init>(Lcu;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    :goto_0
    move v1, p0

    .line 30
    :goto_1
    invoke-virtual {v0}, Lσ;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-virtual {v0}, Lσ;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Ljava/io/File;

    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_0

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 49
    .line 50
    .line 51
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    :cond_0
    if-eqz v1, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    const/4 v1, 0x0

    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    :cond_2
    return-void
.end method

.method public static final ξ(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static final ο(Landroid/content/Context;)Lxx;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxx;

    .line 5
    .line 6
    invoke-static {p0}, Ljx0;->Η(Landroid/content/Context;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-direct {v0, p0}, Lxx;-><init>(Z)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static final π(Landroid/content/Context;)Lg50;
    .locals 4

    .line 1
    new-instance v0, Lg50;

    .line 2
    .line 3
    new-instance v1, Lxn0;

    .line 4
    .line 5
    const/16 v2, 0x1d

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lxn0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 14
    .line 15
    const/16 v3, 0x1f

    .line 16
    .line 17
    if-lt v2, v3, :cond_0

    .line 18
    .line 19
    sget-object v2, Le60;->α:Le60;

    .line 20
    .line 21
    invoke-virtual {v2, p0}, Le60;->α(Landroid/content/Context;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    new-instance v2, Lh2;

    .line 28
    .line 29
    invoke-direct {v2, p0}, Lh2;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Lg50;-><init>(Lxn0;Lh2;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method

.method public static ρ(Ljava/lang/Class;)Lm92;
    .locals 4

    .line 1
    const-string v0, "Cannot create an instance of "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2

    .line 8
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v1, Lm92;
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :catch_0
    move-exception v1

    .line 29
    goto :goto_0

    .line 30
    :catch_1
    move-exception v1

    .line 31
    goto :goto_1

    .line 32
    :goto_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    new-instance v3, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-direct {v2, p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    throw v2

    .line 50
    :goto_1
    new-instance v2, Ljava/lang/RuntimeException;

    .line 51
    .line 52
    new-instance v3, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {v2, p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw v2

    .line 68
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 69
    .line 70
    new-instance v2, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :catch_2
    move-exception v1

    .line 87
    new-instance v2, Ljava/lang/RuntimeException;

    .line 88
    .line 89
    new-instance v3, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-direct {v2, p0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    throw v2
.end method

.method public static σ(Ljava/lang/String;IIZ)I
    .locals 4

    .line 1
    :goto_0
    if-ge p1, p2, :cond_7

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x20

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    if-ne v0, v1, :cond_5

    .line 15
    .line 16
    :cond_0
    const/16 v1, 0x7f

    .line 17
    .line 18
    if-ge v0, v1, :cond_5

    .line 19
    .line 20
    const/16 v1, 0x30

    .line 21
    .line 22
    const/16 v3, 0x3a

    .line 23
    .line 24
    if-gt v1, v0, :cond_1

    .line 25
    .line 26
    if-ge v0, v3, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v1, 0x61

    .line 30
    .line 31
    if-gt v1, v0, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x7b

    .line 34
    .line 35
    if-ge v0, v1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    const/16 v1, 0x41

    .line 39
    .line 40
    if-gt v1, v0, :cond_3

    .line 41
    .line 42
    const/16 v1, 0x5b

    .line 43
    .line 44
    if-ge v0, v1, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    if-ne v0, v3, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    const/4 v0, 0x0

    .line 51
    goto :goto_2

    .line 52
    :cond_5
    :goto_1
    move v0, v2

    .line 53
    :goto_2
    xor-int/lit8 v1, p3, 0x1

    .line 54
    .line 55
    if-ne v0, v1, :cond_6

    .line 56
    .line 57
    return p1

    .line 58
    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    return p2
.end method

.method public static final τ(JLpp;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    new-instance v0, Lae;

    .line 9
    .line 10
    invoke-static {p2}, Lxb;->Θ(Lop;)Lop;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, v1, p2}, Lae;-><init>(ILop;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lae;->τ()V

    .line 19
    .line 20
    .line 21
    const-wide v1, 0x7fffffffffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long p2, p0, v1

    .line 27
    .line 28
    if-gez p2, :cond_3

    .line 29
    .line 30
    iget-object p2, v0, Lae;->ι:Lup;

    .line 31
    .line 32
    sget-object v1, Lx;->Γ:Lx;

    .line 33
    .line 34
    invoke-interface {p2, v1}, Lup;->θ(Ltp;)Lsp;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    instance-of v1, p2, Ltr;

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    check-cast p2, Ltr;

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 p2, 0x0

    .line 46
    :goto_0
    if-nez p2, :cond_2

    .line 47
    .line 48
    sget-object p2, Lar;->α:Ltr;

    .line 49
    .line 50
    :cond_2
    invoke-interface {p2, p0, p1, v0}, Ltr;->δ(JLae;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-virtual {v0}, Lae;->σ()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Lcq;->ε:Lcq;

    .line 58
    .line 59
    if-ne p0, p1, :cond_4

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_4
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 63
    .line 64
    return-object p0
.end method

.method public static υ(Ljava/io/File;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    return v0

    .line 16
    :cond_0
    array-length v2, p0

    .line 17
    move v3, v0

    .line 18
    move v4, v1

    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    aget-object v5, p0, v3

    .line 22
    .line 23
    invoke-static {v5}, Ljx0;->υ(Ljava/io/File;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    move v4, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v0

    .line 34
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return v4

    .line 38
    :cond_3
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 39
    .line 40
    .line 41
    return v1
.end method

.method public static φ([BI)Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    if-lt p1, v3, :cond_0

    .line 6
    .line 7
    aget-byte v4, p0, v2

    .line 8
    .line 9
    const/16 v5, 0xff

    .line 10
    .line 11
    and-int/2addr v4, v5

    .line 12
    if-ne v4, v5, :cond_0

    .line 13
    .line 14
    aget-byte v4, p0, v0

    .line 15
    .line 16
    and-int/2addr v4, v5

    .line 17
    const/16 v6, 0xd8

    .line 18
    .line 19
    if-ne v4, v6, :cond_0

    .line 20
    .line 21
    aget-byte v4, p0, v1

    .line 22
    .line 23
    and-int/2addr v4, v5

    .line 24
    if-ne v4, v5, :cond_0

    .line 25
    .line 26
    const-string p0, "image/jpeg"

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 v4, 0x6

    .line 30
    const/16 v5, 0x8

    .line 31
    .line 32
    const/4 v6, 0x4

    .line 33
    if-lt p1, v5, :cond_1

    .line 34
    .line 35
    aget-byte v7, p0, v2

    .line 36
    .line 37
    const/16 v8, -0x77

    .line 38
    .line 39
    if-ne v7, v8, :cond_1

    .line 40
    .line 41
    aget-byte v0, p0, v0

    .line 42
    .line 43
    const/16 v7, 0x50

    .line 44
    .line 45
    if-ne v0, v7, :cond_1

    .line 46
    .line 47
    aget-byte v0, p0, v1

    .line 48
    .line 49
    const/16 v7, 0x4e

    .line 50
    .line 51
    if-ne v0, v7, :cond_1

    .line 52
    .line 53
    aget-byte v0, p0, v3

    .line 54
    .line 55
    const/16 v3, 0x47

    .line 56
    .line 57
    if-ne v0, v3, :cond_1

    .line 58
    .line 59
    aget-byte v0, p0, v6

    .line 60
    .line 61
    const/16 v3, 0xd

    .line 62
    .line 63
    if-ne v0, v3, :cond_1

    .line 64
    .line 65
    const/4 v0, 0x5

    .line 66
    aget-byte v0, p0, v0

    .line 67
    .line 68
    const/16 v3, 0xa

    .line 69
    .line 70
    if-ne v0, v3, :cond_1

    .line 71
    .line 72
    aget-byte v0, p0, v4

    .line 73
    .line 74
    const/16 v7, 0x1a

    .line 75
    .line 76
    if-ne v0, v7, :cond_1

    .line 77
    .line 78
    const/4 v0, 0x7

    .line 79
    aget-byte v0, p0, v0

    .line 80
    .line 81
    if-ne v0, v3, :cond_1

    .line 82
    .line 83
    const-string p0, "image/png"

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_1
    if-lt p1, v4, :cond_3

    .line 87
    .line 88
    new-instance v0, Ljava/lang/String;

    .line 89
    .line 90
    sget-object v3, Lmf;->α:Ljava/nio/charset/Charset;

    .line 91
    .line 92
    invoke-direct {v0, p0, v2, v4, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 93
    .line 94
    .line 95
    const-string v3, "GIF87a"

    .line 96
    .line 97
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_2

    .line 102
    .line 103
    const-string v3, "GIF89a"

    .line 104
    .line 105
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_3

    .line 110
    .line 111
    :cond_2
    const-string p0, "image/gif"

    .line 112
    .line 113
    return-object p0

    .line 114
    :cond_3
    const/16 v0, 0xc

    .line 115
    .line 116
    if-lt p1, v0, :cond_4

    .line 117
    .line 118
    new-instance v3, Ljava/lang/String;

    .line 119
    .line 120
    sget-object v4, Lmf;->α:Ljava/nio/charset/Charset;

    .line 121
    .line 122
    invoke-direct {v3, p0, v2, v6, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 123
    .line 124
    .line 125
    new-instance v7, Ljava/lang/String;

    .line 126
    .line 127
    invoke-direct {v7, p0, v5, v6, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 128
    .line 129
    .line 130
    const-string v4, "RIFF"

    .line 131
    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_4

    .line 137
    .line 138
    const-string v3, "WEBP"

    .line 139
    .line 140
    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_4

    .line 145
    .line 146
    const-string p0, "image/webp"

    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_4
    if-lt p1, v1, :cond_5

    .line 150
    .line 151
    new-instance v3, Ljava/lang/String;

    .line 152
    .line 153
    sget-object v4, Lmf;->α:Ljava/nio/charset/Charset;

    .line 154
    .line 155
    invoke-direct {v3, p0, v2, v1, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 156
    .line 157
    .line 158
    const-string v1, "BM"

    .line 159
    .line 160
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_5

    .line 165
    .line 166
    const-string p0, "image/bmp"

    .line 167
    .line 168
    return-object p0

    .line 169
    :cond_5
    const/4 v1, 0x0

    .line 170
    if-lt p1, v0, :cond_a

    .line 171
    .line 172
    new-instance p1, Ljava/lang/String;

    .line 173
    .line 174
    sget-object v0, Lmf;->α:Ljava/nio/charset/Charset;

    .line 175
    .line 176
    invoke-direct {p1, p0, v6, v6, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 177
    .line 178
    .line 179
    const-string v2, "ftyp"

    .line 180
    .line 181
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p1, :cond_a

    .line 186
    .line 187
    new-instance p1, Ljava/lang/String;

    .line 188
    .line 189
    invoke-direct {p1, p0, v5, v6, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 190
    .line 191
    .line 192
    sget-object p0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 193
    .line 194
    invoke-virtual {p1, p0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    sparse-switch p1, :sswitch_data_0

    .line 206
    .line 207
    .line 208
    goto/16 :goto_0

    .line 209
    .line 210
    :sswitch_0
    const-string p1, "vvic"

    .line 211
    .line 212
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    if-nez p1, :cond_6

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :sswitch_1
    const-string p1, "vvi1"

    .line 220
    .line 221
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-nez p1, :cond_6

    .line 226
    .line 227
    goto :goto_0

    .line 228
    :cond_6
    const-string p0, "image/vvic"

    .line 229
    .line 230
    return-object p0

    .line 231
    :sswitch_2
    const-string p1, "msf1"

    .line 232
    .line 233
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-nez p1, :cond_7

    .line 238
    .line 239
    goto :goto_0

    .line 240
    :sswitch_3
    const-string p1, "mif1"

    .line 241
    .line 242
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-nez p1, :cond_7

    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_7
    const-string p0, "image/heif"

    .line 250
    .line 251
    return-object p0

    .line 252
    :sswitch_4
    const-string p1, "hevx"

    .line 253
    .line 254
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    if-nez p1, :cond_8

    .line 259
    .line 260
    goto :goto_0

    .line 261
    :sswitch_5
    const-string p1, "hevc"

    .line 262
    .line 263
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result p1

    .line 267
    if-nez p1, :cond_8

    .line 268
    .line 269
    goto :goto_0

    .line 270
    :sswitch_6
    const-string p1, "heix"

    .line 271
    .line 272
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-nez p1, :cond_8

    .line 277
    .line 278
    goto :goto_0

    .line 279
    :sswitch_7
    const-string p1, "heic"

    .line 280
    .line 281
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p1

    .line 285
    if-nez p1, :cond_8

    .line 286
    .line 287
    goto :goto_0

    .line 288
    :cond_8
    const-string p0, "image/heic"

    .line 289
    .line 290
    return-object p0

    .line 291
    :sswitch_8
    const-string p1, "avis"

    .line 292
    .line 293
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    if-nez p1, :cond_9

    .line 298
    .line 299
    goto :goto_0

    .line 300
    :sswitch_9
    const-string p1, "avif"

    .line 301
    .line 302
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    if-nez p1, :cond_9

    .line 307
    .line 308
    :goto_0
    const-string p1, "[MAGIC] \u672a\u77e5 ftyp brand: "

    .line 309
    .line 310
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    const-string p1, "DYHelper"

    .line 315
    .line 316
    invoke-static {p1, p0}, Lux;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    return-object v1

    .line 320
    :cond_9
    const-string p0, "image/avif"

    .line 321
    .line 322
    return-object p0

    .line 323
    :cond_a
    return-object v1

    .line 324
    nop

    .line 325
    :sswitch_data_0
    .sparse-switch
        0x2de012 -> :sswitch_9
        0x2de01f -> :sswitch_8
        0x30ced7 -> :sswitch_7
        0x30ceec -> :sswitch_6
        0x30d06a -> :sswitch_5
        0x30d07f -> :sswitch_4
        0x332327 -> :sswitch_3
        0x3348b1 -> :sswitch_2
        0x376ba8 -> :sswitch_1
        0x376bda -> :sswitch_0
    .end sparse-switch
.end method

.method public static final χ(Landroid/content/Context;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    int-to-float p1, p1

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    float-to-int p0, p0

    .line 19
    return p0
.end method

.method public static final ψ(CCZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-static {p0}, Ljava/lang/Character;->toUpperCase(C)C

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eq p0, p1, :cond_3

    .line 18
    .line 19
    invoke-static {p0}, Ljava/lang/Character;->toLowerCase(C)C

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ne p0, p1, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    :goto_0
    return v0
.end method

.method public static ω(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ";"

    .line 2
    .line 3
    invoke-static {p0, v0, p0}, Lq02;->щ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    :goto_0
    if-nez p0, :cond_1

    .line 29
    .line 30
    const-string p0, ""

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    sparse-switch v0, :sswitch_data_0

    .line 37
    .line 38
    .line 39
    goto/16 :goto_1

    .line 40
    .line 41
    :sswitch_0
    const-string v0, "audio/mpeg"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_7

    .line 48
    .line 49
    goto/16 :goto_1

    .line 50
    .line 51
    :sswitch_1
    const-string v0, "audio/flac"

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :cond_2
    const-string p0, "flac"

    .line 62
    .line 63
    return-object p0

    .line 64
    :sswitch_2
    const-string v0, "video/mp4"

    .line 65
    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_3

    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :cond_3
    const-string p0, "mp4"

    .line 75
    .line 76
    return-object p0

    .line 77
    :sswitch_3
    const-string v0, "audio/wav"

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_4

    .line 84
    .line 85
    goto/16 :goto_1

    .line 86
    .line 87
    :cond_4
    const-string p0, "wav"

    .line 88
    .line 89
    return-object p0

    .line 90
    :sswitch_4
    const-string v0, "audio/ogg"

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-nez p0, :cond_5

    .line 97
    .line 98
    goto/16 :goto_1

    .line 99
    .line 100
    :cond_5
    const-string p0, "ogg"

    .line 101
    .line 102
    return-object p0

    .line 103
    :sswitch_5
    const-string v0, "audio/mp4"

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-nez p0, :cond_6

    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :cond_6
    const-string p0, "m4a"

    .line 114
    .line 115
    return-object p0

    .line 116
    :sswitch_6
    const-string v0, "audio/mp3"

    .line 117
    .line 118
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_7

    .line 123
    .line 124
    goto/16 :goto_1

    .line 125
    .line 126
    :cond_7
    const-string p0, "mp3"

    .line 127
    .line 128
    return-object p0

    .line 129
    :sswitch_7
    const-string v0, "audio/amr"

    .line 130
    .line 131
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-nez p0, :cond_8

    .line 136
    .line 137
    goto/16 :goto_1

    .line 138
    .line 139
    :cond_8
    const-string p0, "amr"

    .line 140
    .line 141
    return-object p0

    .line 142
    :sswitch_8
    const-string v0, "audio/aac"

    .line 143
    .line 144
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-nez p0, :cond_9

    .line 149
    .line 150
    goto/16 :goto_1

    .line 151
    .line 152
    :cond_9
    const-string p0, "aac"

    .line 153
    .line 154
    return-object p0

    .line 155
    :sswitch_9
    const-string v0, "video/quicktime"

    .line 156
    .line 157
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_a

    .line 162
    .line 163
    goto/16 :goto_1

    .line 164
    .line 165
    :cond_a
    const-string p0, "mov"

    .line 166
    .line 167
    return-object p0

    .line 168
    :sswitch_a
    const-string v0, "image/png"

    .line 169
    .line 170
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-nez p0, :cond_b

    .line 175
    .line 176
    goto/16 :goto_1

    .line 177
    .line 178
    :cond_b
    const-string p0, "png"

    .line 179
    .line 180
    return-object p0

    .line 181
    :sswitch_b
    const-string v0, "image/jpg"

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-nez p0, :cond_f

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :sswitch_c
    const-string v0, "image/gif"

    .line 191
    .line 192
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    if-nez p0, :cond_c

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_c
    const-string p0, "gif"

    .line 200
    .line 201
    return-object p0

    .line 202
    :sswitch_d
    const-string v0, "image/bmp"

    .line 203
    .line 204
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-nez p0, :cond_d

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_d
    const-string p0, "bmp"

    .line 212
    .line 213
    return-object p0

    .line 214
    :sswitch_e
    const-string v0, "image/webp"

    .line 215
    .line 216
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    if-nez p0, :cond_e

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_e
    const-string p0, "webp"

    .line 224
    .line 225
    return-object p0

    .line 226
    :sswitch_f
    const-string v0, "image/vvic"

    .line 227
    .line 228
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-nez p0, :cond_10

    .line 233
    .line 234
    goto :goto_1

    .line 235
    :sswitch_10
    const-string v0, "image/jpeg"

    .line 236
    .line 237
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-nez p0, :cond_f

    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_f
    const-string p0, "jpg"

    .line 245
    .line 246
    return-object p0

    .line 247
    :sswitch_11
    const-string v0, "image/heif"

    .line 248
    .line 249
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result p0

    .line 253
    if-nez p0, :cond_10

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_10
    const-string p0, "heif"

    .line 257
    .line 258
    return-object p0

    .line 259
    :sswitch_12
    const-string v0, "image/heic"

    .line 260
    .line 261
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    if-nez p0, :cond_11

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_11
    const-string p0, "heic"

    .line 269
    .line 270
    return-object p0

    .line 271
    :sswitch_13
    const-string v0, "image/avif"

    .line 272
    .line 273
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result p0

    .line 277
    if-nez p0, :cond_12

    .line 278
    .line 279
    :goto_1
    return-object p1

    .line 280
    :cond_12
    const-string p0, "avif"

    .line 281
    .line 282
    return-object p0

    .line 283
    :sswitch_data_0
    .sparse-switch
        -0x58abd7ba -> :sswitch_13
        -0x58a8e8f5 -> :sswitch_12
        -0x58a8e8f2 -> :sswitch_11
        -0x58a7d764 -> :sswitch_10
        -0x58a24bf2 -> :sswitch_f
        -0x58a21830 -> :sswitch_e
        -0x3468a12f -> :sswitch_d
        -0x34688ef0 -> :sswitch_c
        -0x346882d3 -> :sswitch_b
        -0x34686c8b -> :sswitch_a
        -0x6648a5a -> :sswitch_9
        0xb26968a -> :sswitch_8
        0xb26980d -> :sswitch_7
        0xb26c537 -> :sswitch_6
        0xb26c538 -> :sswitch_5
        0xb26cbd6 -> :sswitch_4
        0xb26e933 -> :sswitch_3
        0x4f62635d -> :sswitch_2
        0x59aeaa01 -> :sswitch_1
        0x59b1e81e -> :sswitch_0
    .end sparse-switch
.end method

.method public static final а(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/RippleDrawable;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroid/graphics/drawable/RippleDrawable;

    .line 11
    .line 12
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-static {p2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p0, p1, p3}, Ljx0;->г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-direct {v0, p2, p0, p1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public static б(D)I
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmpl-double v0, p0, v0

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    const p0, 0x7fffffff

    .line 17
    .line 18
    .line 19
    return p0

    .line 20
    :cond_0
    const-wide/high16 v0, -0x3e20000000000000L    # -2.147483648E9

    .line 21
    .line 22
    cmpg-double v0, p0, v0

    .line 23
    .line 24
    if-gez v0, :cond_1

    .line 25
    .line 26
    const/high16 p0, -0x80000000

    .line 27
    .line 28
    return p0

    .line 29
    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    long-to-int p0, p0

    .line 34
    return p0

    .line 35
    :cond_2
    const-string p0, "Cannot round NaN value."

    .line 36
    .line 37
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static в(F)I
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const-string p0, "Cannot round NaN value."

    .line 13
    .line 14
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public static final г(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p0}, Ljx0;->χ(Landroid/content/Context;I)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    int-to-float p0, p0

    .line 24
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static final д(Ljava/lang/Throwable;Lp70;)Z
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lvn0;->α:Ljava/lang/Integer;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x13

    .line 14
    .line 15
    if-lt v0, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Lhh1;->β:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    check-cast v0, [Ljava/lang/Throwable;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    sget-object v0, Ljz;->ε:Ljz;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/4 v3, 0x0

    .line 60
    move v4, v3

    .line 61
    :goto_2
    if-ge v4, v2, :cond_4

    .line 62
    .line 63
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Ljava/lang/Throwable;

    .line 68
    .line 69
    instance-of v5, v5, Lqs;

    .line 70
    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    return v3

    .line 74
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    :try_start_0
    invoke-interface {p1}, Lp70;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lhn;

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    iget-boolean v0, p1, Lhn;->β:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    iget-object v2, p1, Lhn;->α:Ljava/util/List;

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    :try_start_1
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    move v4, v3

    .line 96
    :goto_3
    if-ge v4, v0, :cond_6

    .line 97
    .line 98
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    check-cast v5, Ljn;

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v4, v4, 0x1

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :catchall_0
    move-exception p1

    .line 111
    goto :goto_4

    .line 112
    :cond_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_6

    .line 117
    .line 118
    const/4 v3, 0x1

    .line 119
    :cond_6
    if-eqz v3, :cond_7

    .line 120
    .line 121
    new-instance v1, Lqs;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-direct {v1, p1}, Lqs;-><init>(Lhn;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :goto_4
    move-object v1, p1

    .line 131
    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    .line 132
    .line 133
    invoke-static {p0, v1}, Lln0;->η(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    :cond_8
    return v3
.end method

.method public static final е(Ljava/lang/String;Ljava/lang/String;Lxx;)Landroid/text/SpannableString;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "\n"

    .line 16
    .line 17
    invoke-static {p0, v0, p1}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    new-instance v1, Landroid/text/SpannableString;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 27
    .line 28
    iget-object v2, p2, Lxx;->ζ:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-direct {v0, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, 0x0

    .line 42
    const/16 v4, 0x21

    .line 43
    .line 44
    invoke-virtual {v1, v0, v3, v2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Landroid/text/style/StyleSpan;

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    invoke-direct {v0, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    invoke-virtual {v1, v0, v3, v5, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_1

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    add-int/2addr p0, v2

    .line 71
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    .line 72
    .line 73
    iget-object p2, p2, Lxx;->η:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    invoke-direct {p1, p2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-virtual {v1, p1, p0, p2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 87
    .line 88
    .line 89
    new-instance p1, Landroid/text/style/RelativeSizeSpan;

    .line 90
    .line 91
    const p2, 0x3f6147ae    # 0.88f

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, p2}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    .line 98
    .line 99
    .line 100
    move-result p2

    .line 101
    invoke-virtual {v1, p1, p0, p2, v4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-object v1
.end method

.method public static ж(Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v1, "h264"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    const-string v1, "avc1"

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const-string v1, "avc"

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v1, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :goto_0
    const/16 v1, 0x4b0

    .line 42
    .line 43
    :goto_1
    invoke-static {p0}, Ljx0;->Ν(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    add-int/lit16 v1, v1, 0x258

    .line 50
    .line 51
    :cond_2
    const-string v3, "/play/"

    .line 52
    .line 53
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_3

    .line 58
    .line 59
    const-string v3, "play_addr"

    .line 60
    .line 61
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_3

    .line 66
    .line 67
    const-string v3, "playaddr"

    .line 68
    .line 69
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    :cond_3
    add-int/lit16 v1, v1, 0x190

    .line 76
    .line 77
    :cond_4
    const-string v3, "/video/tos/"

    .line 78
    .line 79
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_5

    .line 84
    .line 85
    add-int/lit16 v1, v1, 0xfa

    .line 86
    .line 87
    :cond_5
    const-string v3, "source=pack"

    .line 88
    .line 89
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-nez v3, :cond_6

    .line 94
    .line 95
    const-string v3, "source=feed"

    .line 96
    .line 97
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_7

    .line 102
    .line 103
    :cond_6
    add-int/lit8 v1, v1, 0x78

    .line 104
    .line 105
    :cond_7
    const-string v3, "1080"

    .line 106
    .line 107
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-eqz v3, :cond_8

    .line 112
    .line 113
    add-int/lit16 v1, v1, 0x12c

    .line 114
    .line 115
    :cond_8
    const-string v3, "720"

    .line 116
    .line 117
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-eqz v3, :cond_9

    .line 122
    .line 123
    add-int/lit16 v1, v1, 0xc8

    .line 124
    .line 125
    :cond_9
    const-string v3, "540"

    .line 126
    .line 127
    invoke-static {v0, v3, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    if-eqz v3, :cond_a

    .line 132
    .line 133
    add-int/lit8 v1, v1, 0x64

    .line 134
    .line 135
    :cond_a
    invoke-static {p0}, Ljx0;->Θ(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_b

    .line 140
    .line 141
    add-int/lit16 v1, v1, -0x1f4

    .line 142
    .line 143
    :cond_b
    const-string p0, "download_addr"

    .line 144
    .line 145
    invoke-static {v0, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-eqz p0, :cond_c

    .line 150
    .line 151
    add-int/lit8 v1, v1, -0x78

    .line 152
    .line 153
    :cond_c
    const-string p0, "new_download_addr"

    .line 154
    .line 155
    invoke-static {v0, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    if-eqz p0, :cond_d

    .line 160
    .line 161
    add-int/lit8 v1, v1, -0x78

    .line 162
    .line 163
    :cond_d
    const-string p0, "/download/"

    .line 164
    .line 165
    invoke-static {v0, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-eqz p0, :cond_e

    .line 170
    .line 171
    add-int/lit8 v1, v1, -0x78

    .line 172
    .line 173
    :cond_e
    const-string p0, "download"

    .line 174
    .line 175
    invoke-static {v0, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    if-eqz p0, :cond_f

    .line 180
    .line 181
    const-string p0, "play"

    .line 182
    .line 183
    invoke-static {v0, p0, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-nez p0, :cond_f

    .line 188
    .line 189
    add-int/lit8 v1, v1, -0x50

    .line 190
    .line 191
    :cond_f
    return v1
.end method

.method public static з()F
    .locals 4

    .line 1
    const/high16 v0, 0x42480000    # 50.0f

    .line 2
    .line 3
    float-to-double v0, v0

    .line 4
    const-wide/high16 v2, 0x4030000000000000L    # 16.0

    .line 5
    .line 6
    add-double/2addr v0, v2

    .line 7
    const-wide/high16 v2, 0x405d000000000000L    # 116.0

    .line 8
    .line 9
    div-double/2addr v0, v2

    .line 10
    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    double-to-float v0, v0

    .line 17
    const/high16 v1, 0x42c80000    # 100.0f

    .line 18
    .line 19
    mul-float/2addr v0, v1

    .line 20
    return v0
.end method
