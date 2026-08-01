.class public abstract La80;
.super Ljava/lang/Object;


# static fields
.field public static final a:[[D

.field public static final b:[[D

.field public static final c:[D

.field public static final d:Ll0;

.field public static final e:Ll0;

.field public static final f:Ltk;

.field public static final g:Ll0;

.field public static final h:[Z

.field public static final i:[B

.field public static final j:[B

.field public static final k:[B

.field public static final l:[B

.field public static final m:[B

.field public static final n:[B

.field public static final o:[B

.field public static final p:[I

.field public static final q:[I

.field public static r:Landroid/graphics/drawable/RippleDrawable; = null

.field public static s:I = 0x0

.field public static t:I = 0x0

.field public static u:I = 0x0

.field public static v:Ljava/lang/String; = ""


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [D

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    new-array v2, v0, [D

    .line 8
    .line 9
    fill-array-data v2, :array_1

    .line 10
    .line 11
    .line 12
    new-array v3, v0, [D

    .line 13
    .line 14
    fill-array-data v3, :array_2

    .line 15
    .line 16
    .line 17
    filled-new-array {v1, v2, v3}, [[D

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, La80;->a:[[D

    .line 22
    .line 23
    new-array v1, v0, [D

    .line 24
    .line 25
    fill-array-data v1, :array_3

    .line 26
    .line 27
    .line 28
    new-array v2, v0, [D

    .line 29
    .line 30
    fill-array-data v2, :array_4

    .line 31
    .line 32
    .line 33
    new-array v3, v0, [D

    .line 34
    .line 35
    fill-array-data v3, :array_5

    .line 36
    .line 37
    .line 38
    filled-new-array {v1, v2, v3}, [[D

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sput-object v1, La80;->b:[[D

    .line 43
    .line 44
    new-array v1, v0, [D

    .line 45
    .line 46
    fill-array-data v1, :array_6

    .line 47
    .line 48
    .line 49
    sput-object v1, La80;->c:[D

    .line 50
    .line 51
    new-instance v1, Ll0;

    .line 52
    .line 53
    const/16 v2, 0x1b

    .line 54
    .line 55
    const-string v3, "UNDEFINED"

    .line 56
    .line 57
    invoke-direct {v1, v2, v3}, Ll0;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sput-object v1, La80;->d:Ll0;

    .line 61
    .line 62
    new-instance v1, Ll0;

    .line 63
    .line 64
    const-string v3, "REUSABLE_CLAIMED"

    .line 65
    .line 66
    invoke-direct {v1, v2, v3}, Ll0;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sput-object v1, La80;->e:Ll0;

    .line 70
    .line 71
    new-instance v1, Ltk;

    .line 72
    .line 73
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    sput-object v1, La80;->f:Ltk;

    .line 77
    .line 78
    new-instance v1, Ll0;

    .line 79
    .line 80
    const-string v3, "CONDITION_FALSE"

    .line 81
    .line 82
    invoke-direct {v1, v2, v3}, Ll0;-><init>(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sput-object v1, La80;->g:Ll0;

    .line 86
    .line 87
    new-array v0, v0, [Z

    .line 88
    .line 89
    sput-object v0, La80;->h:[Z

    .line 90
    .line 91
    const/4 v0, 0x4

    .line 92
    new-array v1, v0, [B

    .line 93
    .line 94
    fill-array-data v1, :array_7

    .line 95
    .line 96
    .line 97
    sput-object v1, La80;->i:[B

    .line 98
    .line 99
    new-array v1, v0, [B

    .line 100
    .line 101
    fill-array-data v1, :array_8

    .line 102
    .line 103
    .line 104
    sput-object v1, La80;->j:[B

    .line 105
    .line 106
    new-array v1, v0, [B

    .line 107
    .line 108
    fill-array-data v1, :array_9

    .line 109
    .line 110
    .line 111
    sput-object v1, La80;->k:[B

    .line 112
    .line 113
    new-array v1, v0, [B

    .line 114
    .line 115
    fill-array-data v1, :array_a

    .line 116
    .line 117
    .line 118
    sput-object v1, La80;->l:[B

    .line 119
    .line 120
    new-array v1, v0, [B

    .line 121
    .line 122
    fill-array-data v1, :array_b

    .line 123
    .line 124
    .line 125
    sput-object v1, La80;->m:[B

    .line 126
    .line 127
    new-array v1, v0, [B

    .line 128
    .line 129
    fill-array-data v1, :array_c

    .line 130
    .line 131
    .line 132
    sput-object v1, La80;->n:[B

    .line 133
    .line 134
    new-array v0, v0, [B

    .line 135
    .line 136
    fill-array-data v0, :array_d

    .line 137
    .line 138
    .line 139
    sput-object v0, La80;->o:[B

    .line 140
    .line 141
    const v0, 0x7f0400fc

    .line 142
    .line 143
    .line 144
    filled-new-array {v0}, [I

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sput-object v0, La80;->p:[I

    .line 149
    .line 150
    const v0, 0x7f040103

    .line 151
    .line 152
    .line 153
    filled-new-array {v0}, [I

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sput-object v0, La80;->q:[I

    .line 158
    .line 159
    return-void

    .line 160
    nop

    .line 161
    :array_0
    .array-data 8
        0x3fd9aeb3dd11be6eL    # 0.401288
        0x3fe4ce379b77c02bL    # 0.650173
        -0x4055a6e75ff609ddL    # -0.051461
    .end array-data

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    :array_1
    .array-data 8
        -0x402ffb9bed30f063L    # -0.250268
        0x3ff345479d4d8341L    # 1.204414
        0x3fa77a2cecc814d7L    # 0.045854
    .end array-data

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    :array_2
    .array-data 8
        -0x409ef8055fbb517aL    # -0.002079
        0x3fa9103c8e25c811L    # 0.048952
        0x3fee800431bde82dL    # 0.953127
    .end array-data

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    :array_3
    .array-data 8
        0x3fda63c2e8477c96L    # 0.41233895
        0x3fd6e341ae4b2c79L    # 0.35762064
        0x3fc71af7273e5d5eL    # 0.18051042
    .end array-data

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    :array_4
    .array-data 8
        0x3fcb367a0f9096bcL    # 0.2126
        0x3fe6e2eb1c432ca5L    # 0.7152
        0x3fb27bb2fec56d5dL    # 0.0722
    .end array-data

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    :array_5
    .array-data 8
        0x3f93c8fde0401c25L    # 0.01932141
        0x3fbe818525c434ceL    # 0.11916382
        0x3fee693974c0c730L    # 0.95034478
    .end array-data

    .line 242
    .line 243
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
    .line 254
    .line 255
    .line 256
    .line 257
    :array_6
    .array-data 8
        0x4057c3020c49ba5eL    # 95.047
        0x4059000000000000L    # 100.0
        0x405b3883126e978dL    # 108.883
    .end array-data

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
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
    :array_7
    .array-data 1
        0x30t
        0x31t
        0x35t
        0x0t
    .end array-data

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    :array_8
    .array-data 1
        0x30t
        0x31t
        0x30t
        0x0t
    .end array-data

    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    :array_9
    .array-data 1
        0x30t
        0x30t
        0x39t
        0x0t
    .end array-data

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    :array_a
    .array-data 1
        0x30t
        0x30t
        0x35t
        0x0t
    .end array-data

    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    :array_b
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    :array_c
    .array-data 1
        0x30t
        0x30t
        0x31t
        0x0t
    .end array-data

    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    :array_d
    .array-data 1
        0x30t
        0x30t
        0x32t
        0x0t
    .end array-data
.end method

.method public static final A(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Lnb;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lnb;

    .line 6
    .line 7
    iget-object p0, p0, Lnb;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, Lct;->f(Ljava/lang/Throwable;)Le10;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final B(Lld;Ljava/lang/Object;)V
    .locals 10

    .line 1
    instance-of v0, p0, Ltg;

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    check-cast p0, Ltg;

    .line 6
    .line 7
    iget-object v0, p0, Ltg;->d:Lke;

    .line 8
    .line 9
    iget-object v1, p0, Ltg;->e:Lm50;

    .line 10
    .line 11
    invoke-static {p1}, Lf10;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

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
    new-instance v3, Lnb;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, v2, v4}, Lnb;-><init>(Ljava/lang/Throwable;Z)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {v1}, Lm50;->d()Lge;

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, Lm50;->b:Lge;

    .line 29
    .line 30
    invoke-virtual {v0}, Lke;->e()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    iput-object v3, p0, Ltg;->f:Ljava/lang/Object;

    .line 38
    .line 39
    iput v5, p0, Lvg;->c:I

    .line 40
    .line 41
    invoke-static {v2}, Lip;->l(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2, p0}, Lke;->d(Lge;Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    invoke-static {}, Lt60;->a()Lkj;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-wide v6, v0, Lkj;->c:J

    .line 53
    .line 54
    const-wide v8, 0x100000000L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    cmp-long v4, v6, v8

    .line 60
    .line 61
    if-ltz v4, :cond_3

    .line 62
    .line 63
    iput-object v3, p0, Ltg;->f:Ljava/lang/Object;

    .line 64
    .line 65
    iput v5, p0, Lvg;->c:I

    .line 66
    .line 67
    iget-object p1, v0, Lkj;->e:Lk6;

    .line 68
    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    new-instance p1, Lk6;

    .line 72
    .line 73
    invoke-direct {p1}, Lk6;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, v0, Lkj;->e:Lk6;

    .line 77
    .line 78
    :cond_2
    invoke-virtual {p1, p0}, Lk6;->addLast(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_5

    .line 82
    :cond_3
    invoke-virtual {v0, v5}, Lkj;->k(Z)V

    .line 83
    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    :try_start_0
    invoke-static {v2}, Lip;->l(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    sget-object v5, Lvh;->h:Lvh;

    .line 90
    .line 91
    invoke-interface {v2, v5}, Lge;->b(Lfe;)Lee;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Lmp;

    .line 96
    .line 97
    if-eqz v5, :cond_4

    .line 98
    .line 99
    invoke-interface {v5}, Lmp;->a()Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-nez v6, :cond_4

    .line 104
    .line 105
    check-cast v5, Lwp;

    .line 106
    .line 107
    invoke-virtual {v5}, Lwp;->t()Ljava/util/concurrent/CancellationException;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, v3, p1}, Ltg;->a(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lct;->f(Ljava/lang/Throwable;)Le10;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p0, p1}, Ltg;->f(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_0
    move-exception p1

    .line 123
    goto :goto_4

    .line 124
    :cond_4
    iget-object v3, p0, Ltg;->g:Ljava/lang/Object;

    .line 125
    .line 126
    invoke-static {v2}, Lip;->l(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    invoke-static {v2, v3}, Lff;->V(Lge;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    sget-object v5, Lff;->x:Ll0;

    .line 134
    .line 135
    if-eq v3, v5, :cond_5

    .line 136
    .line 137
    invoke-static {v1, v2, v3}, Lip;->b0(Lld;Lge;Ljava/lang/Object;)Lo80;

    .line 138
    .line 139
    .line 140
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    goto :goto_1

    .line 142
    :cond_5
    move-object v5, v4

    .line 143
    :goto_1
    :try_start_1
    invoke-virtual {v1, p1}, Lm50;->f(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 144
    .line 145
    .line 146
    if-eqz v5, :cond_6

    .line 147
    .line 148
    :try_start_2
    invoke-virtual {v5}, Lo80;->K()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_7

    .line 153
    .line 154
    :cond_6
    invoke-static {v2, v3}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    :goto_2
    invoke-virtual {v0}, Lkj;->l()Z

    .line 158
    .line 159
    .line 160
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 161
    if-nez p1, :cond_7

    .line 162
    .line 163
    :goto_3
    invoke-virtual {v0}, Lkj;->f()V

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :catchall_1
    move-exception p1

    .line 168
    if-eqz v5, :cond_8

    .line 169
    .line 170
    :try_start_3
    invoke-virtual {v5}, Lo80;->K()Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-eqz v1, :cond_9

    .line 175
    .line 176
    :cond_8
    invoke-static {v2, v3}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_9
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 180
    :goto_4
    :try_start_4
    invoke-virtual {p0, p1, v4}, Lvg;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :goto_5
    return-void

    .line 185
    :catchall_2
    move-exception p0

    .line 186
    invoke-virtual {v0}, Lkj;->f()V

    .line 187
    .line 188
    .line 189
    throw p0

    .line 190
    :cond_a
    invoke-interface {p0, p1}, Lld;->f(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public static E(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lch;->g(Landroid/graphics/drawable/Drawable;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static F(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lch;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static G(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lch;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static H(Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    :goto_0
    if-lez v0, :cond_2

    .line 3
    .line 4
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq v1, v2, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    return-void
.end method

.method public static final I(Lge;Lwm;Lm50;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p2, Lm50;->b:Lge;

    .line 2
    .line 3
    invoke-static {v0}, Lip;->l(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    sget-object v2, Lhe;->d:Lhe;

    .line 9
    .line 10
    invoke-interface {p0, v1, v2}, Lge;->h(Ljava/lang/Object;Lwm;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-interface {v0, p0}, Lge;->i(Lge;)Lge;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v0, p0, v2}, Lip;->t(Lge;Lge;Z)Lge;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    sget-object v1, Lvh;->h:Lvh;

    .line 33
    .line 34
    invoke-interface {p0, v1}, Lge;->b(Lfe;)Lee;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lmp;

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-interface {v1}, Lmp;->a()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    check-cast v1, Lwp;

    .line 50
    .line 51
    invoke-virtual {v1}, Lwp;->t()Ljava/util/concurrent/CancellationException;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    throw p0

    .line 56
    :cond_2
    :goto_1
    if-ne p0, v0, :cond_3

    .line 57
    .line 58
    new-instance v0, Lw10;

    .line 59
    .line 60
    invoke-direct {v0, p0, p2}, Lw10;-><init>(Lge;Lm50;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v0, p1}, Lct;->x(Lw10;Lw10;Lwm;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_3
    sget-object v1, Lvh;->b:Lvh;

    .line 70
    .line 71
    invoke-interface {p0, v1}, Lge;->b(Lfe;)Lee;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-interface {v0, v1}, Lge;->b(Lfe;)Lee;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v3, v0}, Lip;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const/4 v1, 0x0

    .line 84
    if-eqz v0, :cond_4

    .line 85
    .line 86
    new-instance v0, Lo80;

    .line 87
    .line 88
    invoke-direct {v0, p0, p2}, Lo80;-><init>(Lge;Lm50;)V

    .line 89
    .line 90
    .line 91
    iget-object p0, v0, Lg;->c:Lge;

    .line 92
    .line 93
    invoke-static {p0, v1}, Lff;->V(Lge;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    :try_start_0
    invoke-static {v0, v0, p1}, Lct;->x(Lw10;Lw10;Lwm;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    invoke-static {p0, p2}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    move-object p0, p1

    .line 105
    goto :goto_3

    .line 106
    :catchall_0
    move-exception p1

    .line 107
    invoke-static {p0, p2}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_4
    new-instance v0, Lug;

    .line 112
    .line 113
    invoke-direct {v0, p0, p2}, Lw10;-><init>(Lge;Lm50;)V

    .line 114
    .line 115
    .line 116
    invoke-static {p1, v0, v0}, Lip;->X(Lwm;Lg;Lg;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lug;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 120
    .line 121
    :cond_5
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-eqz p1, :cond_b

    .line 126
    .line 127
    const/4 p0, 0x2

    .line 128
    if-ne p1, p0, :cond_a

    .line 129
    .line 130
    invoke-virtual {v0}, Lwp;->x()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    instance-of p1, p0, Lwo;

    .line 135
    .line 136
    if-eqz p1, :cond_6

    .line 137
    .line 138
    move-object v1, p0

    .line 139
    check-cast v1, Lwo;

    .line 140
    .line 141
    :cond_6
    if-eqz v1, :cond_8

    .line 142
    .line 143
    iget-object p1, v1, Lwo;->a:Lvo;

    .line 144
    .line 145
    if-nez p1, :cond_7

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_7
    move-object p0, p1

    .line 149
    :cond_8
    :goto_2
    nop

    .line 150
    instance-of p1, p0, Lnb;

    .line 151
    .line 152
    if-nez p1, :cond_9

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_9
    check-cast p0, Lnb;

    .line 156
    .line 157
    iget-object p0, p0, Lnb;->a:Ljava/lang/Throwable;

    .line 158
    .line 159
    throw p0

    .line 160
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    const-string p1, "Already suspended"

    .line 163
    .line 164
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p0

    .line 168
    :cond_b
    const/4 p1, 0x1

    .line 169
    invoke-virtual {p0, v0, v2, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_5

    .line 174
    .line 175
    sget-object p0, Lpe;->a:Lpe;

    .line 176
    .line 177
    :goto_3
    return-object p0
.end method

.method public static J(D)D
    .locals 8

    .line 1
    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    .line 2
    .line 3
    add-double/2addr p0, v0

    .line 4
    const-wide/high16 v2, 0x405d000000000000L    # 116.0

    .line 5
    .line 6
    div-double/2addr p0, v2

    .line 7
    mul-double v4, p0, p0

    .line 8
    .line 9
    mul-double/2addr v4, p0

    .line 10
    const-wide v6, 0x3f822354d28f7cd6L    # 0.008856451679035631

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmpl-double v6, v4, v6

    .line 16
    .line 17
    if-lez v6, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    mul-double/2addr p0, v2

    .line 21
    sub-double/2addr p0, v0

    .line 22
    const-wide v0, 0x408c3a5ed097b426L    # 903.2962962962963

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    div-double v4, p0, v0

    .line 28
    .line 29
    :goto_0
    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    .line 30
    .line 31
    mul-double/2addr v4, p0

    .line 32
    return-wide v4
.end method

.method public static a(Lqc;Lar;I)V
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    iget v2, v0, Lqc;->l0:I

    .line 8
    .line 9
    iget-object v3, v0, Lqc;->o0:[Lu8;

    .line 10
    .line 11
    const/4 v14, 0x0

    .line 12
    :goto_0
    move v12, v2

    .line 13
    move-object v13, v3

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget v2, v0, Lqc;->m0:I

    .line 16
    .line 17
    iget-object v3, v0, Lqc;->n0:[Lu8;

    .line 18
    .line 19
    const/4 v14, 0x2

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    const/4 v15, 0x0

    .line 22
    :goto_2
    if-ge v15, v12, :cond_6d

    .line 23
    .line 24
    aget-object v2, v13, v15

    .line 25
    .line 26
    iget-boolean v3, v2, Lu8;->q:Z

    .line 27
    .line 28
    iget-object v4, v2, Lu8;->a:Lpc;

    .line 29
    .line 30
    iget-object v5, v4, Lpc;->F:[Lcc;

    .line 31
    .line 32
    const/4 v6, 0x3

    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    const/16 v7, 0x8

    .line 36
    .line 37
    if-nez v3, :cond_19

    .line 38
    .line 39
    iget v3, v2, Lu8;->l:I

    .line 40
    .line 41
    mul-int/lit8 v17, v3, 0x2

    .line 42
    .line 43
    move-object v8, v4

    .line 44
    move-object v11, v8

    .line 45
    const/16 v18, 0x0

    .line 46
    .line 47
    const/16 v19, 0x0

    .line 48
    .line 49
    :goto_3
    if-nez v18, :cond_14

    .line 50
    .line 51
    const/16 v21, 0x1

    .line 52
    .line 53
    iget v9, v2, Lu8;->i:I

    .line 54
    .line 55
    add-int/lit8 v9, v9, 0x1

    .line 56
    .line 57
    iput v9, v2, Lu8;->i:I

    .line 58
    .line 59
    iget-object v9, v8, Lpc;->b0:[Lpc;

    .line 60
    .line 61
    iget-object v10, v8, Lpc;->F:[Lcc;

    .line 62
    .line 63
    aput-object v16, v9, v3

    .line 64
    .line 65
    iget-object v9, v8, Lpc;->a0:[Lpc;

    .line 66
    .line 67
    aput-object v16, v9, v3

    .line 68
    .line 69
    iget v9, v8, Lpc;->V:I

    .line 70
    .line 71
    if-eq v9, v7, :cond_e

    .line 72
    .line 73
    invoke-virtual {v8, v3}, Lpc;->h(I)I

    .line 74
    .line 75
    .line 76
    aget-object v9, v10, v17

    .line 77
    .line 78
    invoke-virtual {v9}, Lcc;->c()I

    .line 79
    .line 80
    .line 81
    add-int/lit8 v9, v17, 0x1

    .line 82
    .line 83
    aget-object v23, v10, v9

    .line 84
    .line 85
    invoke-virtual/range {v23 .. v23}, Lcc;->c()I

    .line 86
    .line 87
    .line 88
    aget-object v23, v10, v17

    .line 89
    .line 90
    invoke-virtual/range {v23 .. v23}, Lcc;->c()I

    .line 91
    .line 92
    .line 93
    aget-object v9, v10, v9

    .line 94
    .line 95
    invoke-virtual {v9}, Lcc;->c()I

    .line 96
    .line 97
    .line 98
    iget-object v9, v2, Lu8;->b:Lpc;

    .line 99
    .line 100
    if-nez v9, :cond_1

    .line 101
    .line 102
    iput-object v8, v2, Lu8;->b:Lpc;

    .line 103
    .line 104
    :cond_1
    iput-object v8, v2, Lu8;->d:Lpc;

    .line 105
    .line 106
    iget-object v9, v8, Lpc;->c0:[I

    .line 107
    .line 108
    aget v9, v9, v3

    .line 109
    .line 110
    if-ne v9, v6, :cond_e

    .line 111
    .line 112
    iget-object v7, v8, Lpc;->l:[I

    .line 113
    .line 114
    aget v7, v7, v3

    .line 115
    .line 116
    if-eqz v7, :cond_3

    .line 117
    .line 118
    if-eq v7, v6, :cond_3

    .line 119
    .line 120
    const/4 v6, 0x2

    .line 121
    if-ne v7, v6, :cond_2

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_2
    move/from16 v25, v3

    .line 125
    .line 126
    move-object/from16 v26, v5

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_3
    :goto_4
    iget v6, v2, Lu8;->j:I

    .line 130
    .line 131
    add-int/lit8 v6, v6, 0x1

    .line 132
    .line 133
    iput v6, v2, Lu8;->j:I

    .line 134
    .line 135
    iget-object v6, v8, Lpc;->Z:[F

    .line 136
    .line 137
    aget v6, v6, v3

    .line 138
    .line 139
    cmpl-float v25, v6, v19

    .line 140
    .line 141
    if-lez v25, :cond_4

    .line 142
    .line 143
    move/from16 v25, v3

    .line 144
    .line 145
    iget v3, v2, Lu8;->k:F

    .line 146
    .line 147
    add-float/2addr v3, v6

    .line 148
    iput v3, v2, Lu8;->k:F

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_4
    move/from16 v25, v3

    .line 152
    .line 153
    :goto_5
    iget v3, v8, Lpc;->V:I

    .line 154
    .line 155
    move-object/from16 v26, v5

    .line 156
    .line 157
    const/16 v5, 0x8

    .line 158
    .line 159
    if-eq v3, v5, :cond_8

    .line 160
    .line 161
    const/4 v3, 0x3

    .line 162
    if-ne v9, v3, :cond_8

    .line 163
    .line 164
    if-eqz v7, :cond_5

    .line 165
    .line 166
    if-ne v7, v3, :cond_8

    .line 167
    .line 168
    :cond_5
    cmpg-float v3, v6, v19

    .line 169
    .line 170
    if-gez v3, :cond_6

    .line 171
    .line 172
    move/from16 v3, v21

    .line 173
    .line 174
    iput-boolean v3, v2, Lu8;->n:Z

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_6
    move/from16 v3, v21

    .line 178
    .line 179
    iput-boolean v3, v2, Lu8;->o:Z

    .line 180
    .line 181
    :goto_6
    iget-object v3, v2, Lu8;->h:Ljava/util/ArrayList;

    .line 182
    .line 183
    if-nez v3, :cond_7

    .line 184
    .line 185
    new-instance v3, Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object v3, v2, Lu8;->h:Ljava/util/ArrayList;

    .line 191
    .line 192
    :cond_7
    iget-object v3, v2, Lu8;->h:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    :cond_8
    iget-object v3, v2, Lu8;->f:Lpc;

    .line 198
    .line 199
    if-nez v3, :cond_9

    .line 200
    .line 201
    iput-object v8, v2, Lu8;->f:Lpc;

    .line 202
    .line 203
    :cond_9
    iget-object v3, v2, Lu8;->g:Lpc;

    .line 204
    .line 205
    if-eqz v3, :cond_a

    .line 206
    .line 207
    iget-object v3, v3, Lpc;->a0:[Lpc;

    .line 208
    .line 209
    aput-object v8, v3, v25

    .line 210
    .line 211
    :cond_a
    iput-object v8, v2, Lu8;->g:Lpc;

    .line 212
    .line 213
    :goto_7
    if-nez v25, :cond_c

    .line 214
    .line 215
    iget v3, v8, Lpc;->j:I

    .line 216
    .line 217
    if-eqz v3, :cond_b

    .line 218
    .line 219
    goto :goto_8

    .line 220
    :cond_b
    iget v3, v8, Lpc;->m:I

    .line 221
    .line 222
    if-nez v3, :cond_f

    .line 223
    .line 224
    iget v3, v8, Lpc;->n:I

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_c
    iget v3, v8, Lpc;->k:I

    .line 228
    .line 229
    if-eqz v3, :cond_d

    .line 230
    .line 231
    goto :goto_8

    .line 232
    :cond_d
    iget v3, v8, Lpc;->p:I

    .line 233
    .line 234
    if-nez v3, :cond_f

    .line 235
    .line 236
    iget v3, v8, Lpc;->q:I

    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_e
    move/from16 v25, v3

    .line 240
    .line 241
    move-object/from16 v26, v5

    .line 242
    .line 243
    :cond_f
    :goto_8
    if-eq v11, v8, :cond_10

    .line 244
    .line 245
    iget-object v3, v11, Lpc;->b0:[Lpc;

    .line 246
    .line 247
    aput-object v8, v3, v25

    .line 248
    .line 249
    :cond_10
    add-int/lit8 v3, v17, 0x1

    .line 250
    .line 251
    aget-object v3, v10, v3

    .line 252
    .line 253
    iget-object v3, v3, Lcc;->d:Lcc;

    .line 254
    .line 255
    if-eqz v3, :cond_11

    .line 256
    .line 257
    iget-object v3, v3, Lcc;->b:Lpc;

    .line 258
    .line 259
    iget-object v5, v3, Lpc;->F:[Lcc;

    .line 260
    .line 261
    aget-object v5, v5, v17

    .line 262
    .line 263
    iget-object v5, v5, Lcc;->d:Lcc;

    .line 264
    .line 265
    if-eqz v5, :cond_11

    .line 266
    .line 267
    iget-object v5, v5, Lcc;->b:Lpc;

    .line 268
    .line 269
    if-eq v5, v8, :cond_12

    .line 270
    .line 271
    :cond_11
    move-object/from16 v3, v16

    .line 272
    .line 273
    :cond_12
    if-eqz v3, :cond_13

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_13
    move-object v3, v8

    .line 277
    const/16 v18, 0x1

    .line 278
    .line 279
    :goto_9
    move-object v11, v8

    .line 280
    move-object/from16 v5, v26

    .line 281
    .line 282
    const/4 v6, 0x3

    .line 283
    const/16 v7, 0x8

    .line 284
    .line 285
    move-object v8, v3

    .line 286
    move/from16 v3, v25

    .line 287
    .line 288
    goto/16 :goto_3

    .line 289
    .line 290
    :cond_14
    move/from16 v25, v3

    .line 291
    .line 292
    move-object/from16 v26, v5

    .line 293
    .line 294
    iget-object v3, v2, Lu8;->b:Lpc;

    .line 295
    .line 296
    if-eqz v3, :cond_15

    .line 297
    .line 298
    iget-object v3, v3, Lpc;->F:[Lcc;

    .line 299
    .line 300
    aget-object v3, v3, v17

    .line 301
    .line 302
    invoke-virtual {v3}, Lcc;->c()I

    .line 303
    .line 304
    .line 305
    :cond_15
    iget-object v3, v2, Lu8;->d:Lpc;

    .line 306
    .line 307
    if-eqz v3, :cond_16

    .line 308
    .line 309
    iget-object v3, v3, Lpc;->F:[Lcc;

    .line 310
    .line 311
    add-int/lit8 v17, v17, 0x1

    .line 312
    .line 313
    aget-object v3, v3, v17

    .line 314
    .line 315
    invoke-virtual {v3}, Lcc;->c()I

    .line 316
    .line 317
    .line 318
    :cond_16
    iput-object v8, v2, Lu8;->c:Lpc;

    .line 319
    .line 320
    if-nez v25, :cond_17

    .line 321
    .line 322
    iget-boolean v3, v2, Lu8;->m:Z

    .line 323
    .line 324
    if-eqz v3, :cond_17

    .line 325
    .line 326
    iput-object v8, v2, Lu8;->e:Lpc;

    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_17
    iput-object v4, v2, Lu8;->e:Lpc;

    .line 330
    .line 331
    :goto_a
    iget-boolean v3, v2, Lu8;->o:Z

    .line 332
    .line 333
    if-eqz v3, :cond_18

    .line 334
    .line 335
    iget-boolean v3, v2, Lu8;->n:Z

    .line 336
    .line 337
    if-eqz v3, :cond_18

    .line 338
    .line 339
    const/4 v3, 0x1

    .line 340
    goto :goto_b

    .line 341
    :cond_18
    const/4 v3, 0x0

    .line 342
    :goto_b
    iput-boolean v3, v2, Lu8;->p:Z

    .line 343
    .line 344
    :goto_c
    const/4 v3, 0x1

    .line 345
    goto :goto_d

    .line 346
    :cond_19
    move-object/from16 v26, v5

    .line 347
    .line 348
    const/16 v19, 0x0

    .line 349
    .line 350
    goto :goto_c

    .line 351
    :goto_d
    iput-boolean v3, v2, Lu8;->q:Z

    .line 352
    .line 353
    iget-object v10, v2, Lu8;->c:Lpc;

    .line 354
    .line 355
    iget-object v11, v2, Lu8;->b:Lpc;

    .line 356
    .line 357
    iget-object v3, v2, Lu8;->d:Lpc;

    .line 358
    .line 359
    iget-object v5, v2, Lu8;->e:Lpc;

    .line 360
    .line 361
    iget v6, v2, Lu8;->k:F

    .line 362
    .line 363
    iget-object v7, v0, Lpc;->c0:[I

    .line 364
    .line 365
    iget-object v8, v0, Lpc;->F:[Lcc;

    .line 366
    .line 367
    aget v7, v7, p2

    .line 368
    .line 369
    const/4 v9, 0x2

    .line 370
    if-ne v7, v9, :cond_1a

    .line 371
    .line 372
    const/4 v7, 0x1

    .line 373
    goto :goto_e

    .line 374
    :cond_1a
    const/4 v7, 0x0

    .line 375
    :goto_e
    if-nez p2, :cond_1e

    .line 376
    .line 377
    iget v9, v5, Lpc;->X:I

    .line 378
    .line 379
    if-nez v9, :cond_1b

    .line 380
    .line 381
    const/16 v21, 0x1

    .line 382
    .line 383
    :goto_f
    move/from16 v17, v6

    .line 384
    .line 385
    const/4 v6, 0x1

    .line 386
    goto :goto_10

    .line 387
    :cond_1b
    const/16 v21, 0x0

    .line 388
    .line 389
    goto :goto_f

    .line 390
    :goto_10
    if-ne v9, v6, :cond_1c

    .line 391
    .line 392
    move/from16 v18, v6

    .line 393
    .line 394
    :goto_11
    const/4 v6, 0x2

    .line 395
    goto :goto_12

    .line 396
    :cond_1c
    const/16 v18, 0x0

    .line 397
    .line 398
    goto :goto_11

    .line 399
    :goto_12
    if-ne v9, v6, :cond_1d

    .line 400
    .line 401
    const/4 v9, 0x1

    .line 402
    goto :goto_13

    .line 403
    :cond_1d
    const/4 v9, 0x0

    .line 404
    :goto_13
    move-object v6, v4

    .line 405
    move/from16 v28, v7

    .line 406
    .line 407
    move/from16 v25, v21

    .line 408
    .line 409
    :goto_14
    const/16 v22, 0x0

    .line 410
    .line 411
    goto :goto_1a

    .line 412
    :cond_1e
    move/from16 v17, v6

    .line 413
    .line 414
    move v6, v9

    .line 415
    iget v9, v5, Lpc;->Y:I

    .line 416
    .line 417
    if-nez v9, :cond_1f

    .line 418
    .line 419
    const/16 v22, 0x1

    .line 420
    .line 421
    :goto_15
    const/4 v6, 0x1

    .line 422
    goto :goto_16

    .line 423
    :cond_1f
    const/16 v22, 0x0

    .line 424
    .line 425
    goto :goto_15

    .line 426
    :goto_16
    if-ne v9, v6, :cond_20

    .line 427
    .line 428
    const/16 v18, 0x1

    .line 429
    .line 430
    :goto_17
    const/4 v6, 0x2

    .line 431
    goto :goto_18

    .line 432
    :cond_20
    const/16 v18, 0x0

    .line 433
    .line 434
    goto :goto_17

    .line 435
    :goto_18
    if-ne v9, v6, :cond_21

    .line 436
    .line 437
    const/4 v9, 0x1

    .line 438
    goto :goto_19

    .line 439
    :cond_21
    const/4 v9, 0x0

    .line 440
    :goto_19
    move-object v6, v4

    .line 441
    move/from16 v28, v7

    .line 442
    .line 443
    move/from16 v25, v22

    .line 444
    .line 445
    goto :goto_14

    .line 446
    :goto_1a
    if-nez v22, :cond_2e

    .line 447
    .line 448
    iget-object v7, v6, Lpc;->F:[Lcc;

    .line 449
    .line 450
    move-object/from16 v32, v7

    .line 451
    .line 452
    iget-object v7, v6, Lpc;->c0:[I

    .line 453
    .line 454
    move-object/from16 v33, v7

    .line 455
    .line 456
    aget-object v7, v32, v14

    .line 457
    .line 458
    if-eqz v9, :cond_22

    .line 459
    .line 460
    const/16 v30, 0x1

    .line 461
    .line 462
    goto :goto_1b

    .line 463
    :cond_22
    const/16 v30, 0x4

    .line 464
    .line 465
    :goto_1b
    invoke-virtual {v7}, Lcc;->c()I

    .line 466
    .line 467
    .line 468
    move-result v34

    .line 469
    move-object/from16 v35, v8

    .line 470
    .line 471
    aget v8, v33, p2

    .line 472
    .line 473
    move/from16 v36, v9

    .line 474
    .line 475
    const/4 v9, 0x3

    .line 476
    if-ne v8, v9, :cond_23

    .line 477
    .line 478
    iget-object v8, v6, Lpc;->l:[I

    .line 479
    .line 480
    aget v8, v8, p2

    .line 481
    .line 482
    if-nez v8, :cond_23

    .line 483
    .line 484
    const/4 v8, 0x1

    .line 485
    goto :goto_1c

    .line 486
    :cond_23
    const/4 v8, 0x0

    .line 487
    :goto_1c
    iget-object v9, v7, Lcc;->d:Lcc;

    .line 488
    .line 489
    if-eqz v9, :cond_24

    .line 490
    .line 491
    if-eq v6, v4, :cond_24

    .line 492
    .line 493
    invoke-virtual {v9}, Lcc;->c()I

    .line 494
    .line 495
    .line 496
    move-result v9

    .line 497
    add-int v34, v9, v34

    .line 498
    .line 499
    :cond_24
    move/from16 v9, v34

    .line 500
    .line 501
    if-eqz v36, :cond_25

    .line 502
    .line 503
    if-eq v6, v4, :cond_25

    .line 504
    .line 505
    if-eq v6, v11, :cond_25

    .line 506
    .line 507
    const/16 v30, 0x5

    .line 508
    .line 509
    :cond_25
    move-object/from16 v34, v4

    .line 510
    .line 511
    iget-object v4, v7, Lcc;->d:Lcc;

    .line 512
    .line 513
    if-eqz v4, :cond_28

    .line 514
    .line 515
    if-ne v6, v11, :cond_26

    .line 516
    .line 517
    move/from16 v37, v8

    .line 518
    .line 519
    iget-object v8, v7, Lcc;->g:La40;

    .line 520
    .line 521
    iget-object v4, v4, Lcc;->g:La40;

    .line 522
    .line 523
    move/from16 v38, v12

    .line 524
    .line 525
    const/4 v12, 0x6

    .line 526
    invoke-virtual {v1, v8, v4, v9, v12}, Lar;->f(La40;La40;II)V

    .line 527
    .line 528
    .line 529
    goto :goto_1d

    .line 530
    :cond_26
    move/from16 v37, v8

    .line 531
    .line 532
    move/from16 v38, v12

    .line 533
    .line 534
    iget-object v8, v7, Lcc;->g:La40;

    .line 535
    .line 536
    iget-object v4, v4, Lcc;->g:La40;

    .line 537
    .line 538
    const/16 v12, 0x8

    .line 539
    .line 540
    invoke-virtual {v1, v8, v4, v9, v12}, Lar;->f(La40;La40;II)V

    .line 541
    .line 542
    .line 543
    :goto_1d
    if-eqz v37, :cond_27

    .line 544
    .line 545
    if-nez v36, :cond_27

    .line 546
    .line 547
    const/4 v4, 0x5

    .line 548
    goto :goto_1e

    .line 549
    :cond_27
    move/from16 v4, v30

    .line 550
    .line 551
    :goto_1e
    iget-object v8, v7, Lcc;->g:La40;

    .line 552
    .line 553
    iget-object v7, v7, Lcc;->d:Lcc;

    .line 554
    .line 555
    iget-object v7, v7, Lcc;->g:La40;

    .line 556
    .line 557
    invoke-virtual {v1, v8, v7, v9, v4}, Lar;->e(La40;La40;II)V

    .line 558
    .line 559
    .line 560
    goto :goto_1f

    .line 561
    :cond_28
    move/from16 v38, v12

    .line 562
    .line 563
    :goto_1f
    if-eqz v28, :cond_2a

    .line 564
    .line 565
    iget v4, v6, Lpc;->V:I

    .line 566
    .line 567
    const/16 v12, 0x8

    .line 568
    .line 569
    if-eq v4, v12, :cond_29

    .line 570
    .line 571
    aget v4, v33, p2

    .line 572
    .line 573
    const/4 v9, 0x3

    .line 574
    if-ne v4, v9, :cond_29

    .line 575
    .line 576
    add-int/lit8 v4, v14, 0x1

    .line 577
    .line 578
    aget-object v4, v32, v4

    .line 579
    .line 580
    iget-object v4, v4, Lcc;->g:La40;

    .line 581
    .line 582
    aget-object v7, v32, v14

    .line 583
    .line 584
    iget-object v7, v7, Lcc;->g:La40;

    .line 585
    .line 586
    const/4 v8, 0x0

    .line 587
    const/4 v9, 0x5

    .line 588
    invoke-virtual {v1, v4, v7, v8, v9}, Lar;->f(La40;La40;II)V

    .line 589
    .line 590
    .line 591
    goto :goto_20

    .line 592
    :cond_29
    const/4 v8, 0x0

    .line 593
    :goto_20
    aget-object v4, v32, v14

    .line 594
    .line 595
    iget-object v4, v4, Lcc;->g:La40;

    .line 596
    .line 597
    aget-object v7, v35, v14

    .line 598
    .line 599
    iget-object v7, v7, Lcc;->g:La40;

    .line 600
    .line 601
    const/16 v12, 0x8

    .line 602
    .line 603
    invoke-virtual {v1, v4, v7, v8, v12}, Lar;->f(La40;La40;II)V

    .line 604
    .line 605
    .line 606
    :cond_2a
    add-int/lit8 v4, v14, 0x1

    .line 607
    .line 608
    aget-object v4, v32, v4

    .line 609
    .line 610
    iget-object v4, v4, Lcc;->d:Lcc;

    .line 611
    .line 612
    if-eqz v4, :cond_2b

    .line 613
    .line 614
    iget-object v4, v4, Lcc;->b:Lpc;

    .line 615
    .line 616
    iget-object v7, v4, Lpc;->F:[Lcc;

    .line 617
    .line 618
    aget-object v7, v7, v14

    .line 619
    .line 620
    iget-object v7, v7, Lcc;->d:Lcc;

    .line 621
    .line 622
    if-eqz v7, :cond_2b

    .line 623
    .line 624
    iget-object v7, v7, Lcc;->b:Lpc;

    .line 625
    .line 626
    if-eq v7, v6, :cond_2c

    .line 627
    .line 628
    :cond_2b
    move-object/from16 v4, v16

    .line 629
    .line 630
    :cond_2c
    if-eqz v4, :cond_2d

    .line 631
    .line 632
    move-object v6, v4

    .line 633
    goto :goto_21

    .line 634
    :cond_2d
    const/16 v22, 0x1

    .line 635
    .line 636
    :goto_21
    move-object/from16 v4, v34

    .line 637
    .line 638
    move-object/from16 v8, v35

    .line 639
    .line 640
    move/from16 v9, v36

    .line 641
    .line 642
    move/from16 v12, v38

    .line 643
    .line 644
    goto/16 :goto_1a

    .line 645
    .line 646
    :cond_2e
    move-object/from16 v35, v8

    .line 647
    .line 648
    move/from16 v36, v9

    .line 649
    .line 650
    move/from16 v38, v12

    .line 651
    .line 652
    if-eqz v3, :cond_31

    .line 653
    .line 654
    iget-object v4, v10, Lpc;->F:[Lcc;

    .line 655
    .line 656
    add-int/lit8 v6, v14, 0x1

    .line 657
    .line 658
    aget-object v4, v4, v6

    .line 659
    .line 660
    iget-object v4, v4, Lcc;->d:Lcc;

    .line 661
    .line 662
    if-eqz v4, :cond_31

    .line 663
    .line 664
    iget-object v4, v3, Lpc;->F:[Lcc;

    .line 665
    .line 666
    aget-object v4, v4, v6

    .line 667
    .line 668
    iget-object v7, v3, Lpc;->c0:[I

    .line 669
    .line 670
    aget v7, v7, p2

    .line 671
    .line 672
    const/4 v9, 0x3

    .line 673
    if-ne v7, v9, :cond_2f

    .line 674
    .line 675
    iget-object v7, v3, Lpc;->l:[I

    .line 676
    .line 677
    aget v7, v7, p2

    .line 678
    .line 679
    if-nez v7, :cond_2f

    .line 680
    .line 681
    if-nez v36, :cond_2f

    .line 682
    .line 683
    iget-object v7, v4, Lcc;->d:Lcc;

    .line 684
    .line 685
    iget-object v8, v7, Lcc;->b:Lpc;

    .line 686
    .line 687
    if-ne v8, v0, :cond_2f

    .line 688
    .line 689
    iget-object v8, v4, Lcc;->g:La40;

    .line 690
    .line 691
    iget-object v7, v7, Lcc;->g:La40;

    .line 692
    .line 693
    invoke-virtual {v4}, Lcc;->c()I

    .line 694
    .line 695
    .line 696
    move-result v9

    .line 697
    neg-int v9, v9

    .line 698
    const/4 v12, 0x5

    .line 699
    invoke-virtual {v1, v8, v7, v9, v12}, Lar;->e(La40;La40;II)V

    .line 700
    .line 701
    .line 702
    goto :goto_22

    .line 703
    :cond_2f
    const/4 v12, 0x5

    .line 704
    if-eqz v36, :cond_30

    .line 705
    .line 706
    iget-object v7, v4, Lcc;->d:Lcc;

    .line 707
    .line 708
    iget-object v8, v7, Lcc;->b:Lpc;

    .line 709
    .line 710
    if-ne v8, v0, :cond_30

    .line 711
    .line 712
    iget-object v8, v4, Lcc;->g:La40;

    .line 713
    .line 714
    iget-object v7, v7, Lcc;->g:La40;

    .line 715
    .line 716
    invoke-virtual {v4}, Lcc;->c()I

    .line 717
    .line 718
    .line 719
    move-result v9

    .line 720
    neg-int v9, v9

    .line 721
    const/4 v12, 0x4

    .line 722
    invoke-virtual {v1, v8, v7, v9, v12}, Lar;->e(La40;La40;II)V

    .line 723
    .line 724
    .line 725
    :cond_30
    :goto_22
    iget-object v7, v4, Lcc;->g:La40;

    .line 726
    .line 727
    iget-object v8, v10, Lpc;->F:[Lcc;

    .line 728
    .line 729
    aget-object v6, v8, v6

    .line 730
    .line 731
    iget-object v6, v6, Lcc;->d:Lcc;

    .line 732
    .line 733
    iget-object v6, v6, Lcc;->g:La40;

    .line 734
    .line 735
    invoke-virtual {v4}, Lcc;->c()I

    .line 736
    .line 737
    .line 738
    move-result v4

    .line 739
    neg-int v4, v4

    .line 740
    const/4 v12, 0x6

    .line 741
    invoke-virtual {v1, v7, v6, v4, v12}, Lar;->g(La40;La40;II)V

    .line 742
    .line 743
    .line 744
    :cond_31
    if-eqz v28, :cond_32

    .line 745
    .line 746
    add-int/lit8 v4, v14, 0x1

    .line 747
    .line 748
    aget-object v6, v35, v4

    .line 749
    .line 750
    iget-object v6, v6, Lcc;->g:La40;

    .line 751
    .line 752
    iget-object v7, v10, Lpc;->F:[Lcc;

    .line 753
    .line 754
    aget-object v4, v7, v4

    .line 755
    .line 756
    iget-object v7, v4, Lcc;->g:La40;

    .line 757
    .line 758
    invoke-virtual {v4}, Lcc;->c()I

    .line 759
    .line 760
    .line 761
    move-result v4

    .line 762
    const/16 v12, 0x8

    .line 763
    .line 764
    invoke-virtual {v1, v6, v7, v4, v12}, Lar;->f(La40;La40;II)V

    .line 765
    .line 766
    .line 767
    :cond_32
    iget-object v4, v2, Lu8;->h:Ljava/util/ArrayList;

    .line 768
    .line 769
    if-eqz v4, :cond_3c

    .line 770
    .line 771
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 772
    .line 773
    .line 774
    move-result v6

    .line 775
    const/4 v7, 0x1

    .line 776
    if-le v6, v7, :cond_3c

    .line 777
    .line 778
    iget-boolean v8, v2, Lu8;->n:Z

    .line 779
    .line 780
    if-eqz v8, :cond_33

    .line 781
    .line 782
    iget-boolean v8, v2, Lu8;->p:Z

    .line 783
    .line 784
    if-nez v8, :cond_33

    .line 785
    .line 786
    iget v8, v2, Lu8;->j:I

    .line 787
    .line 788
    int-to-float v8, v8

    .line 789
    move/from16 v17, v8

    .line 790
    .line 791
    :cond_33
    move-object/from16 v9, v16

    .line 792
    .line 793
    move/from16 v12, v19

    .line 794
    .line 795
    const/4 v8, 0x0

    .line 796
    :goto_23
    if-ge v8, v6, :cond_3c

    .line 797
    .line 798
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v21

    .line 802
    move-object/from16 v7, v21

    .line 803
    .line 804
    check-cast v7, Lpc;

    .line 805
    .line 806
    iget-object v0, v7, Lpc;->Z:[F

    .line 807
    .line 808
    move-object/from16 v21, v0

    .line 809
    .line 810
    iget-object v0, v7, Lpc;->F:[Lcc;

    .line 811
    .line 812
    aget v21, v21, p2

    .line 813
    .line 814
    cmpg-float v24, v21, v19

    .line 815
    .line 816
    move-object/from16 v28, v0

    .line 817
    .line 818
    if-gez v24, :cond_35

    .line 819
    .line 820
    iget-boolean v0, v2, Lu8;->p:Z

    .line 821
    .line 822
    if-eqz v0, :cond_34

    .line 823
    .line 824
    add-int/lit8 v0, v14, 0x1

    .line 825
    .line 826
    aget-object v0, v28, v0

    .line 827
    .line 828
    iget-object v0, v0, Lcc;->g:La40;

    .line 829
    .line 830
    aget-object v7, v28, v14

    .line 831
    .line 832
    iget-object v7, v7, Lcc;->g:La40;

    .line 833
    .line 834
    move-object/from16 v29, v4

    .line 835
    .line 836
    move/from16 v30, v6

    .line 837
    .line 838
    const/4 v4, 0x0

    .line 839
    const/4 v6, 0x4

    .line 840
    invoke-virtual {v1, v0, v7, v4, v6}, Lar;->e(La40;La40;II)V

    .line 841
    .line 842
    .line 843
    move/from16 v20, v12

    .line 844
    .line 845
    move v12, v4

    .line 846
    goto :goto_24

    .line 847
    :cond_34
    const/high16 v21, 0x3f800000    # 1.0f

    .line 848
    .line 849
    :cond_35
    move-object/from16 v29, v4

    .line 850
    .line 851
    move/from16 v30, v6

    .line 852
    .line 853
    const/4 v6, 0x4

    .line 854
    cmpl-float v0, v21, v19

    .line 855
    .line 856
    if-nez v0, :cond_36

    .line 857
    .line 858
    add-int/lit8 v0, v14, 0x1

    .line 859
    .line 860
    aget-object v0, v28, v0

    .line 861
    .line 862
    iget-object v0, v0, Lcc;->g:La40;

    .line 863
    .line 864
    aget-object v4, v28, v14

    .line 865
    .line 866
    iget-object v4, v4, Lcc;->g:La40;

    .line 867
    .line 868
    move/from16 v20, v12

    .line 869
    .line 870
    const/16 v7, 0x8

    .line 871
    .line 872
    const/4 v12, 0x0

    .line 873
    invoke-virtual {v1, v0, v4, v12, v7}, Lar;->e(La40;La40;II)V

    .line 874
    .line 875
    .line 876
    :goto_24
    move/from16 v24, v8

    .line 877
    .line 878
    move/from16 v35, v19

    .line 879
    .line 880
    move/from16 v12, v20

    .line 881
    .line 882
    move-object/from16 v19, v13

    .line 883
    .line 884
    goto/16 :goto_29

    .line 885
    .line 886
    :cond_36
    move/from16 v20, v12

    .line 887
    .line 888
    const/4 v12, 0x0

    .line 889
    if-eqz v9, :cond_3b

    .line 890
    .line 891
    iget-object v4, v9, Lpc;->F:[Lcc;

    .line 892
    .line 893
    aget-object v9, v4, v14

    .line 894
    .line 895
    iget-object v9, v9, Lcc;->g:La40;

    .line 896
    .line 897
    add-int/lit8 v32, v14, 0x1

    .line 898
    .line 899
    aget-object v4, v4, v32

    .line 900
    .line 901
    iget-object v4, v4, Lcc;->g:La40;

    .line 902
    .line 903
    aget-object v6, v28, v14

    .line 904
    .line 905
    iget-object v6, v6, Lcc;->g:La40;

    .line 906
    .line 907
    aget-object v12, v28, v32

    .line 908
    .line 909
    iget-object v12, v12, Lcc;->g:La40;

    .line 910
    .line 911
    move/from16 v28, v0

    .line 912
    .line 913
    invoke-virtual {v1}, Lar;->k()Lp6;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    move-object/from16 v32, v7

    .line 918
    .line 919
    move/from16 v7, v19

    .line 920
    .line 921
    iput v7, v0, Lp6;->b:F

    .line 922
    .line 923
    cmpl-float v19, v17, v7

    .line 924
    .line 925
    move/from16 v35, v7

    .line 926
    .line 927
    const/high16 v7, -0x40800000    # -1.0f

    .line 928
    .line 929
    if-eqz v19, :cond_37

    .line 930
    .line 931
    cmpl-float v19, v20, v21

    .line 932
    .line 933
    if-nez v19, :cond_38

    .line 934
    .line 935
    :cond_37
    move/from16 v24, v8

    .line 936
    .line 937
    move-object/from16 v19, v13

    .line 938
    .line 939
    move v13, v7

    .line 940
    const/high16 v7, 0x3f800000    # 1.0f

    .line 941
    .line 942
    goto :goto_26

    .line 943
    :cond_38
    cmpl-float v19, v20, v35

    .line 944
    .line 945
    if-nez v19, :cond_39

    .line 946
    .line 947
    iget-object v6, v0, Lp6;->d:Lo6;

    .line 948
    .line 949
    const/high16 v12, 0x3f800000    # 1.0f

    .line 950
    .line 951
    invoke-interface {v6, v9, v12}, Lo6;->i(La40;F)V

    .line 952
    .line 953
    .line 954
    iget-object v6, v0, Lp6;->d:Lo6;

    .line 955
    .line 956
    invoke-interface {v6, v4, v7}, Lo6;->i(La40;F)V

    .line 957
    .line 958
    .line 959
    :goto_25
    move/from16 v24, v8

    .line 960
    .line 961
    move-object/from16 v19, v13

    .line 962
    .line 963
    goto :goto_27

    .line 964
    :cond_39
    const/high16 v7, 0x3f800000    # 1.0f

    .line 965
    .line 966
    if-nez v28, :cond_3a

    .line 967
    .line 968
    iget-object v4, v0, Lp6;->d:Lo6;

    .line 969
    .line 970
    invoke-interface {v4, v6, v7}, Lo6;->i(La40;F)V

    .line 971
    .line 972
    .line 973
    iget-object v4, v0, Lp6;->d:Lo6;

    .line 974
    .line 975
    const/high16 v6, -0x40800000    # -1.0f

    .line 976
    .line 977
    invoke-interface {v4, v12, v6}, Lo6;->i(La40;F)V

    .line 978
    .line 979
    .line 980
    goto :goto_25

    .line 981
    :cond_3a
    div-float v19, v20, v17

    .line 982
    .line 983
    div-float v20, v21, v17

    .line 984
    .line 985
    move/from16 v24, v8

    .line 986
    .line 987
    div-float v8, v19, v20

    .line 988
    .line 989
    move-object/from16 v19, v13

    .line 990
    .line 991
    iget-object v13, v0, Lp6;->d:Lo6;

    .line 992
    .line 993
    invoke-interface {v13, v9, v7}, Lo6;->i(La40;F)V

    .line 994
    .line 995
    .line 996
    iget-object v7, v0, Lp6;->d:Lo6;

    .line 997
    .line 998
    const/high16 v13, -0x40800000    # -1.0f

    .line 999
    .line 1000
    invoke-interface {v7, v4, v13}, Lo6;->i(La40;F)V

    .line 1001
    .line 1002
    .line 1003
    iget-object v4, v0, Lp6;->d:Lo6;

    .line 1004
    .line 1005
    invoke-interface {v4, v12, v8}, Lo6;->i(La40;F)V

    .line 1006
    .line 1007
    .line 1008
    iget-object v4, v0, Lp6;->d:Lo6;

    .line 1009
    .line 1010
    neg-float v7, v8

    .line 1011
    invoke-interface {v4, v6, v7}, Lo6;->i(La40;F)V

    .line 1012
    .line 1013
    .line 1014
    goto :goto_27

    .line 1015
    :goto_26
    iget-object v8, v0, Lp6;->d:Lo6;

    .line 1016
    .line 1017
    invoke-interface {v8, v9, v7}, Lo6;->i(La40;F)V

    .line 1018
    .line 1019
    .line 1020
    iget-object v8, v0, Lp6;->d:Lo6;

    .line 1021
    .line 1022
    invoke-interface {v8, v4, v13}, Lo6;->i(La40;F)V

    .line 1023
    .line 1024
    .line 1025
    iget-object v4, v0, Lp6;->d:Lo6;

    .line 1026
    .line 1027
    invoke-interface {v4, v12, v7}, Lo6;->i(La40;F)V

    .line 1028
    .line 1029
    .line 1030
    iget-object v4, v0, Lp6;->d:Lo6;

    .line 1031
    .line 1032
    invoke-interface {v4, v6, v13}, Lo6;->i(La40;F)V

    .line 1033
    .line 1034
    .line 1035
    :goto_27
    invoke-virtual {v1, v0}, Lar;->c(Lp6;)V

    .line 1036
    .line 1037
    .line 1038
    goto :goto_28

    .line 1039
    :cond_3b
    move-object/from16 v32, v7

    .line 1040
    .line 1041
    move/from16 v24, v8

    .line 1042
    .line 1043
    move/from16 v35, v19

    .line 1044
    .line 1045
    move-object/from16 v19, v13

    .line 1046
    .line 1047
    :goto_28
    move/from16 v12, v21

    .line 1048
    .line 1049
    move-object/from16 v9, v32

    .line 1050
    .line 1051
    :goto_29
    add-int/lit8 v8, v24, 0x1

    .line 1052
    .line 1053
    const/4 v7, 0x1

    .line 1054
    move-object/from16 v0, p0

    .line 1055
    .line 1056
    move-object/from16 v13, v19

    .line 1057
    .line 1058
    move-object/from16 v4, v29

    .line 1059
    .line 1060
    move/from16 v6, v30

    .line 1061
    .line 1062
    move/from16 v19, v35

    .line 1063
    .line 1064
    goto/16 :goto_23

    .line 1065
    .line 1066
    :cond_3c
    move-object/from16 v19, v13

    .line 1067
    .line 1068
    if-eqz v11, :cond_3d

    .line 1069
    .line 1070
    if-eq v11, v3, :cond_3e

    .line 1071
    .line 1072
    if-eqz v36, :cond_3d

    .line 1073
    .line 1074
    goto :goto_2a

    .line 1075
    :cond_3d
    move-object v0, v3

    .line 1076
    const/16 v27, 0x2

    .line 1077
    .line 1078
    goto :goto_2f

    .line 1079
    :cond_3e
    :goto_2a
    aget-object v0, v26, v14

    .line 1080
    .line 1081
    iget-object v2, v10, Lpc;->F:[Lcc;

    .line 1082
    .line 1083
    add-int/lit8 v4, v14, 0x1

    .line 1084
    .line 1085
    aget-object v2, v2, v4

    .line 1086
    .line 1087
    iget-object v0, v0, Lcc;->d:Lcc;

    .line 1088
    .line 1089
    if-eqz v0, :cond_3f

    .line 1090
    .line 1091
    iget-object v0, v0, Lcc;->g:La40;

    .line 1092
    .line 1093
    goto :goto_2b

    .line 1094
    :cond_3f
    move-object/from16 v0, v16

    .line 1095
    .line 1096
    :goto_2b
    iget-object v2, v2, Lcc;->d:Lcc;

    .line 1097
    .line 1098
    if-eqz v2, :cond_40

    .line 1099
    .line 1100
    iget-object v2, v2, Lcc;->g:La40;

    .line 1101
    .line 1102
    move-object v6, v2

    .line 1103
    goto :goto_2c

    .line 1104
    :cond_40
    move-object/from16 v6, v16

    .line 1105
    .line 1106
    :goto_2c
    iget-object v2, v11, Lpc;->F:[Lcc;

    .line 1107
    .line 1108
    aget-object v2, v2, v14

    .line 1109
    .line 1110
    iget-object v7, v3, Lpc;->F:[Lcc;

    .line 1111
    .line 1112
    aget-object v4, v7, v4

    .line 1113
    .line 1114
    if-eqz v0, :cond_42

    .line 1115
    .line 1116
    if-eqz v6, :cond_42

    .line 1117
    .line 1118
    if-nez p2, :cond_41

    .line 1119
    .line 1120
    iget v5, v5, Lpc;->S:F

    .line 1121
    .line 1122
    goto :goto_2d

    .line 1123
    :cond_41
    iget v5, v5, Lpc;->T:F

    .line 1124
    .line 1125
    :goto_2d
    invoke-virtual {v2}, Lcc;->c()I

    .line 1126
    .line 1127
    .line 1128
    move-result v7

    .line 1129
    invoke-virtual {v4}, Lcc;->c()I

    .line 1130
    .line 1131
    .line 1132
    move-result v8

    .line 1133
    iget-object v2, v2, Lcc;->g:La40;

    .line 1134
    .line 1135
    iget-object v4, v4, Lcc;->g:La40;

    .line 1136
    .line 1137
    const/4 v9, 0x7

    .line 1138
    move-object/from16 v27, v3

    .line 1139
    .line 1140
    move-object v3, v0

    .line 1141
    move-object/from16 v0, v27

    .line 1142
    .line 1143
    move/from16 v27, v7

    .line 1144
    .line 1145
    move-object v7, v4

    .line 1146
    move/from16 v4, v27

    .line 1147
    .line 1148
    const/16 v27, 0x2

    .line 1149
    .line 1150
    invoke-virtual/range {v1 .. v9}, Lar;->b(La40;La40;IFLa40;La40;II)V

    .line 1151
    .line 1152
    .line 1153
    goto :goto_2e

    .line 1154
    :cond_42
    move-object v0, v3

    .line 1155
    const/16 v27, 0x2

    .line 1156
    .line 1157
    :cond_43
    :goto_2e
    move-object/from16 v1, p1

    .line 1158
    .line 1159
    goto/16 :goto_44

    .line 1160
    .line 1161
    :goto_2f
    if-eqz v25, :cond_56

    .line 1162
    .line 1163
    if-eqz v11, :cond_56

    .line 1164
    .line 1165
    iget v1, v2, Lu8;->j:I

    .line 1166
    .line 1167
    if-lez v1, :cond_44

    .line 1168
    .line 1169
    iget v2, v2, Lu8;->i:I

    .line 1170
    .line 1171
    if-ne v2, v1, :cond_44

    .line 1172
    .line 1173
    const/16 v22, 0x1

    .line 1174
    .line 1175
    goto :goto_30

    .line 1176
    :cond_44
    const/16 v22, 0x0

    .line 1177
    .line 1178
    :goto_30
    move-object v12, v11

    .line 1179
    move-object v13, v12

    .line 1180
    :goto_31
    if-eqz v12, :cond_43

    .line 1181
    .line 1182
    iget-object v1, v12, Lpc;->F:[Lcc;

    .line 1183
    .line 1184
    iget-object v2, v12, Lpc;->b0:[Lpc;

    .line 1185
    .line 1186
    aget-object v2, v2, p2

    .line 1187
    .line 1188
    :goto_32
    if-eqz v2, :cond_45

    .line 1189
    .line 1190
    iget v3, v2, Lpc;->V:I

    .line 1191
    .line 1192
    const/16 v5, 0x8

    .line 1193
    .line 1194
    if-ne v3, v5, :cond_46

    .line 1195
    .line 1196
    iget-object v2, v2, Lpc;->b0:[Lpc;

    .line 1197
    .line 1198
    aget-object v2, v2, p2

    .line 1199
    .line 1200
    goto :goto_32

    .line 1201
    :cond_45
    const/16 v5, 0x8

    .line 1202
    .line 1203
    :cond_46
    if-nez v2, :cond_48

    .line 1204
    .line 1205
    if-ne v12, v0, :cond_47

    .line 1206
    .line 1207
    goto :goto_33

    .line 1208
    :cond_47
    move-object/from16 v17, v2

    .line 1209
    .line 1210
    move-object/from16 v20, v13

    .line 1211
    .line 1212
    const/16 v31, 0x5

    .line 1213
    .line 1214
    move v13, v5

    .line 1215
    goto/16 :goto_3a

    .line 1216
    .line 1217
    :cond_48
    :goto_33
    aget-object v3, v1, v14

    .line 1218
    .line 1219
    iget-object v4, v3, Lcc;->g:La40;

    .line 1220
    .line 1221
    iget-object v6, v3, Lcc;->d:Lcc;

    .line 1222
    .line 1223
    if-eqz v6, :cond_49

    .line 1224
    .line 1225
    iget-object v6, v6, Lcc;->g:La40;

    .line 1226
    .line 1227
    goto :goto_34

    .line 1228
    :cond_49
    move-object/from16 v6, v16

    .line 1229
    .line 1230
    :goto_34
    if-eq v13, v12, :cond_4a

    .line 1231
    .line 1232
    iget-object v6, v13, Lpc;->F:[Lcc;

    .line 1233
    .line 1234
    add-int/lit8 v7, v14, 0x1

    .line 1235
    .line 1236
    aget-object v6, v6, v7

    .line 1237
    .line 1238
    iget-object v6, v6, Lcc;->g:La40;

    .line 1239
    .line 1240
    goto :goto_35

    .line 1241
    :cond_4a
    if-ne v12, v11, :cond_4c

    .line 1242
    .line 1243
    if-ne v13, v12, :cond_4c

    .line 1244
    .line 1245
    aget-object v6, v26, v14

    .line 1246
    .line 1247
    iget-object v6, v6, Lcc;->d:Lcc;

    .line 1248
    .line 1249
    if-eqz v6, :cond_4b

    .line 1250
    .line 1251
    iget-object v6, v6, Lcc;->g:La40;

    .line 1252
    .line 1253
    goto :goto_35

    .line 1254
    :cond_4b
    move-object/from16 v6, v16

    .line 1255
    .line 1256
    :cond_4c
    :goto_35
    invoke-virtual {v3}, Lcc;->c()I

    .line 1257
    .line 1258
    .line 1259
    move-result v3

    .line 1260
    add-int/lit8 v7, v14, 0x1

    .line 1261
    .line 1262
    aget-object v8, v1, v7

    .line 1263
    .line 1264
    invoke-virtual {v8}, Lcc;->c()I

    .line 1265
    .line 1266
    .line 1267
    move-result v8

    .line 1268
    if-eqz v2, :cond_4d

    .line 1269
    .line 1270
    iget-object v9, v2, Lpc;->F:[Lcc;

    .line 1271
    .line 1272
    aget-object v9, v9, v14

    .line 1273
    .line 1274
    iget-object v5, v9, Lcc;->g:La40;

    .line 1275
    .line 1276
    aget-object v1, v1, v7

    .line 1277
    .line 1278
    iget-object v1, v1, Lcc;->g:La40;

    .line 1279
    .line 1280
    goto :goto_37

    .line 1281
    :cond_4d
    iget-object v5, v10, Lpc;->F:[Lcc;

    .line 1282
    .line 1283
    aget-object v5, v5, v7

    .line 1284
    .line 1285
    iget-object v9, v5, Lcc;->d:Lcc;

    .line 1286
    .line 1287
    if-eqz v9, :cond_4e

    .line 1288
    .line 1289
    iget-object v5, v9, Lcc;->g:La40;

    .line 1290
    .line 1291
    goto :goto_36

    .line 1292
    :cond_4e
    move-object/from16 v5, v16

    .line 1293
    .line 1294
    :goto_36
    aget-object v1, v1, v7

    .line 1295
    .line 1296
    iget-object v1, v1, Lcc;->g:La40;

    .line 1297
    .line 1298
    :goto_37
    if-eqz v9, :cond_4f

    .line 1299
    .line 1300
    invoke-virtual {v9}, Lcc;->c()I

    .line 1301
    .line 1302
    .line 1303
    move-result v9

    .line 1304
    add-int/2addr v8, v9

    .line 1305
    :cond_4f
    if-eqz v13, :cond_50

    .line 1306
    .line 1307
    iget-object v9, v13, Lpc;->F:[Lcc;

    .line 1308
    .line 1309
    aget-object v9, v9, v7

    .line 1310
    .line 1311
    invoke-virtual {v9}, Lcc;->c()I

    .line 1312
    .line 1313
    .line 1314
    move-result v9

    .line 1315
    add-int/2addr v3, v9

    .line 1316
    :cond_50
    if-eqz v4, :cond_54

    .line 1317
    .line 1318
    if-eqz v6, :cond_54

    .line 1319
    .line 1320
    if-eqz v5, :cond_54

    .line 1321
    .line 1322
    if-eqz v1, :cond_54

    .line 1323
    .line 1324
    if-ne v12, v11, :cond_51

    .line 1325
    .line 1326
    iget-object v3, v11, Lpc;->F:[Lcc;

    .line 1327
    .line 1328
    aget-object v3, v3, v14

    .line 1329
    .line 1330
    invoke-virtual {v3}, Lcc;->c()I

    .line 1331
    .line 1332
    .line 1333
    move-result v3

    .line 1334
    :cond_51
    if-ne v12, v0, :cond_52

    .line 1335
    .line 1336
    iget-object v8, v0, Lpc;->F:[Lcc;

    .line 1337
    .line 1338
    aget-object v7, v8, v7

    .line 1339
    .line 1340
    invoke-virtual {v7}, Lcc;->c()I

    .line 1341
    .line 1342
    .line 1343
    move-result v8

    .line 1344
    :cond_52
    if-eqz v22, :cond_53

    .line 1345
    .line 1346
    const/16 v9, 0x8

    .line 1347
    .line 1348
    :goto_38
    move-object v7, v2

    .line 1349
    move-object v2, v4

    .line 1350
    move v4, v3

    .line 1351
    move-object v3, v6

    .line 1352
    move-object v6, v5

    .line 1353
    goto :goto_39

    .line 1354
    :cond_53
    const/4 v9, 0x5

    .line 1355
    goto :goto_38

    .line 1356
    :goto_39
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1357
    .line 1358
    move-object/from16 v17, v7

    .line 1359
    .line 1360
    move-object/from16 v20, v13

    .line 1361
    .line 1362
    const/16 v13, 0x8

    .line 1363
    .line 1364
    const/16 v31, 0x5

    .line 1365
    .line 1366
    move-object v7, v1

    .line 1367
    move-object/from16 v1, p1

    .line 1368
    .line 1369
    invoke-virtual/range {v1 .. v9}, Lar;->b(La40;La40;IFLa40;La40;II)V

    .line 1370
    .line 1371
    .line 1372
    goto :goto_3a

    .line 1373
    :cond_54
    move-object/from16 v17, v2

    .line 1374
    .line 1375
    move-object/from16 v20, v13

    .line 1376
    .line 1377
    const/16 v13, 0x8

    .line 1378
    .line 1379
    const/16 v31, 0x5

    .line 1380
    .line 1381
    :goto_3a
    iget v1, v12, Lpc;->V:I

    .line 1382
    .line 1383
    if-eq v1, v13, :cond_55

    .line 1384
    .line 1385
    move-object/from16 v20, v12

    .line 1386
    .line 1387
    :cond_55
    move-object/from16 v12, v17

    .line 1388
    .line 1389
    move-object/from16 v13, v20

    .line 1390
    .line 1391
    goto/16 :goto_31

    .line 1392
    .line 1393
    :cond_56
    const/16 v13, 0x8

    .line 1394
    .line 1395
    if-eqz v18, :cond_43

    .line 1396
    .line 1397
    if-eqz v11, :cond_43

    .line 1398
    .line 1399
    iget v1, v2, Lu8;->j:I

    .line 1400
    .line 1401
    if-lez v1, :cond_57

    .line 1402
    .line 1403
    iget v2, v2, Lu8;->i:I

    .line 1404
    .line 1405
    if-ne v2, v1, :cond_57

    .line 1406
    .line 1407
    const/16 v22, 0x1

    .line 1408
    .line 1409
    goto :goto_3b

    .line 1410
    :cond_57
    const/16 v22, 0x0

    .line 1411
    .line 1412
    :goto_3b
    move-object v1, v11

    .line 1413
    move-object v12, v1

    .line 1414
    :goto_3c
    if-eqz v12, :cond_62

    .line 1415
    .line 1416
    iget-object v2, v12, Lpc;->F:[Lcc;

    .line 1417
    .line 1418
    iget-object v3, v12, Lpc;->b0:[Lpc;

    .line 1419
    .line 1420
    aget-object v3, v3, p2

    .line 1421
    .line 1422
    :goto_3d
    if-eqz v3, :cond_58

    .line 1423
    .line 1424
    iget v4, v3, Lpc;->V:I

    .line 1425
    .line 1426
    if-ne v4, v13, :cond_58

    .line 1427
    .line 1428
    iget-object v3, v3, Lpc;->b0:[Lpc;

    .line 1429
    .line 1430
    aget-object v3, v3, p2

    .line 1431
    .line 1432
    goto :goto_3d

    .line 1433
    :cond_58
    if-eq v12, v11, :cond_60

    .line 1434
    .line 1435
    if-eq v12, v0, :cond_60

    .line 1436
    .line 1437
    if-eqz v3, :cond_60

    .line 1438
    .line 1439
    if-ne v3, v0, :cond_59

    .line 1440
    .line 1441
    move-object/from16 v3, v16

    .line 1442
    .line 1443
    :cond_59
    aget-object v4, v2, v14

    .line 1444
    .line 1445
    move-object v5, v2

    .line 1446
    iget-object v2, v4, Lcc;->g:La40;

    .line 1447
    .line 1448
    iget-object v6, v1, Lpc;->F:[Lcc;

    .line 1449
    .line 1450
    add-int/lit8 v7, v14, 0x1

    .line 1451
    .line 1452
    aget-object v6, v6, v7

    .line 1453
    .line 1454
    iget-object v6, v6, Lcc;->g:La40;

    .line 1455
    .line 1456
    invoke-virtual {v4}, Lcc;->c()I

    .line 1457
    .line 1458
    .line 1459
    move-result v4

    .line 1460
    aget-object v8, v5, v7

    .line 1461
    .line 1462
    invoke-virtual {v8}, Lcc;->c()I

    .line 1463
    .line 1464
    .line 1465
    move-result v8

    .line 1466
    if-eqz v3, :cond_5b

    .line 1467
    .line 1468
    iget-object v5, v3, Lpc;->F:[Lcc;

    .line 1469
    .line 1470
    aget-object v5, v5, v14

    .line 1471
    .line 1472
    iget-object v9, v5, Lcc;->g:La40;

    .line 1473
    .line 1474
    iget-object v13, v5, Lcc;->d:Lcc;

    .line 1475
    .line 1476
    if-eqz v13, :cond_5a

    .line 1477
    .line 1478
    iget-object v13, v13, Lcc;->g:La40;

    .line 1479
    .line 1480
    goto :goto_3f

    .line 1481
    :cond_5a
    move-object/from16 v13, v16

    .line 1482
    .line 1483
    goto :goto_3f

    .line 1484
    :cond_5b
    iget-object v9, v0, Lpc;->F:[Lcc;

    .line 1485
    .line 1486
    aget-object v9, v9, v14

    .line 1487
    .line 1488
    if-eqz v9, :cond_5c

    .line 1489
    .line 1490
    iget-object v13, v9, Lcc;->g:La40;

    .line 1491
    .line 1492
    goto :goto_3e

    .line 1493
    :cond_5c
    move-object/from16 v13, v16

    .line 1494
    .line 1495
    :goto_3e
    aget-object v5, v5, v7

    .line 1496
    .line 1497
    iget-object v5, v5, Lcc;->g:La40;

    .line 1498
    .line 1499
    move-object/from16 v39, v13

    .line 1500
    .line 1501
    move-object v13, v5

    .line 1502
    move-object v5, v9

    .line 1503
    move-object/from16 v9, v39

    .line 1504
    .line 1505
    :goto_3f
    if-eqz v5, :cond_5d

    .line 1506
    .line 1507
    invoke-virtual {v5}, Lcc;->c()I

    .line 1508
    .line 1509
    .line 1510
    move-result v5

    .line 1511
    add-int/2addr v8, v5

    .line 1512
    :cond_5d
    iget-object v5, v1, Lpc;->F:[Lcc;

    .line 1513
    .line 1514
    aget-object v5, v5, v7

    .line 1515
    .line 1516
    invoke-virtual {v5}, Lcc;->c()I

    .line 1517
    .line 1518
    .line 1519
    move-result v5

    .line 1520
    add-int/2addr v4, v5

    .line 1521
    if-eqz v22, :cond_5e

    .line 1522
    .line 1523
    const/16 v7, 0x8

    .line 1524
    .line 1525
    goto :goto_40

    .line 1526
    :cond_5e
    const/4 v7, 0x4

    .line 1527
    :goto_40
    if-eqz v2, :cond_5f

    .line 1528
    .line 1529
    if-eqz v6, :cond_5f

    .line 1530
    .line 1531
    if-eqz v9, :cond_5f

    .line 1532
    .line 1533
    if-eqz v13, :cond_5f

    .line 1534
    .line 1535
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1536
    .line 1537
    move-object/from16 v17, v3

    .line 1538
    .line 1539
    move-object v3, v6

    .line 1540
    move-object v6, v9

    .line 1541
    const/16 v30, 0x4

    .line 1542
    .line 1543
    move v9, v7

    .line 1544
    move-object v7, v13

    .line 1545
    move-object v13, v1

    .line 1546
    move-object/from16 v1, p1

    .line 1547
    .line 1548
    invoke-virtual/range {v1 .. v9}, Lar;->b(La40;La40;IFLa40;La40;II)V

    .line 1549
    .line 1550
    .line 1551
    goto :goto_41

    .line 1552
    :cond_5f
    move-object v13, v1

    .line 1553
    move-object/from16 v17, v3

    .line 1554
    .line 1555
    const/16 v30, 0x4

    .line 1556
    .line 1557
    move-object/from16 v1, p1

    .line 1558
    .line 1559
    :goto_41
    move-object/from16 v3, v17

    .line 1560
    .line 1561
    goto :goto_42

    .line 1562
    :cond_60
    move-object v13, v1

    .line 1563
    const/16 v30, 0x4

    .line 1564
    .line 1565
    move-object/from16 v1, p1

    .line 1566
    .line 1567
    :goto_42
    iget v2, v12, Lpc;->V:I

    .line 1568
    .line 1569
    const/16 v5, 0x8

    .line 1570
    .line 1571
    if-eq v2, v5, :cond_61

    .line 1572
    .line 1573
    move-object v13, v12

    .line 1574
    :cond_61
    move-object v12, v3

    .line 1575
    move-object v1, v13

    .line 1576
    move v13, v5

    .line 1577
    goto/16 :goto_3c

    .line 1578
    .line 1579
    :cond_62
    move-object/from16 v1, p1

    .line 1580
    .line 1581
    iget-object v2, v11, Lpc;->F:[Lcc;

    .line 1582
    .line 1583
    aget-object v2, v2, v14

    .line 1584
    .line 1585
    aget-object v3, v26, v14

    .line 1586
    .line 1587
    iget-object v3, v3, Lcc;->d:Lcc;

    .line 1588
    .line 1589
    iget-object v4, v0, Lpc;->F:[Lcc;

    .line 1590
    .line 1591
    add-int/lit8 v5, v14, 0x1

    .line 1592
    .line 1593
    aget-object v12, v4, v5

    .line 1594
    .line 1595
    iget-object v4, v10, Lpc;->F:[Lcc;

    .line 1596
    .line 1597
    aget-object v4, v4, v5

    .line 1598
    .line 1599
    iget-object v13, v4, Lcc;->d:Lcc;

    .line 1600
    .line 1601
    const/4 v9, 0x5

    .line 1602
    if-eqz v3, :cond_64

    .line 1603
    .line 1604
    if-eq v11, v0, :cond_63

    .line 1605
    .line 1606
    iget-object v4, v2, Lcc;->g:La40;

    .line 1607
    .line 1608
    iget-object v3, v3, Lcc;->g:La40;

    .line 1609
    .line 1610
    invoke-virtual {v2}, Lcc;->c()I

    .line 1611
    .line 1612
    .line 1613
    move-result v2

    .line 1614
    invoke-virtual {v1, v4, v3, v2, v9}, Lar;->e(La40;La40;II)V

    .line 1615
    .line 1616
    .line 1617
    goto :goto_43

    .line 1618
    :cond_63
    if-eqz v13, :cond_64

    .line 1619
    .line 1620
    move-object v4, v2

    .line 1621
    iget-object v2, v4, Lcc;->g:La40;

    .line 1622
    .line 1623
    iget-object v3, v3, Lcc;->g:La40;

    .line 1624
    .line 1625
    invoke-virtual {v4}, Lcc;->c()I

    .line 1626
    .line 1627
    .line 1628
    move-result v4

    .line 1629
    iget-object v6, v12, Lcc;->g:La40;

    .line 1630
    .line 1631
    iget-object v7, v13, Lcc;->g:La40;

    .line 1632
    .line 1633
    invoke-virtual {v12}, Lcc;->c()I

    .line 1634
    .line 1635
    .line 1636
    move-result v8

    .line 1637
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1638
    .line 1639
    invoke-virtual/range {v1 .. v9}, Lar;->b(La40;La40;IFLa40;La40;II)V

    .line 1640
    .line 1641
    .line 1642
    :cond_64
    :goto_43
    if-eqz v13, :cond_65

    .line 1643
    .line 1644
    if-eq v11, v0, :cond_65

    .line 1645
    .line 1646
    iget-object v2, v12, Lcc;->g:La40;

    .line 1647
    .line 1648
    iget-object v3, v13, Lcc;->g:La40;

    .line 1649
    .line 1650
    invoke-virtual {v12}, Lcc;->c()I

    .line 1651
    .line 1652
    .line 1653
    move-result v4

    .line 1654
    neg-int v4, v4

    .line 1655
    invoke-virtual {v1, v2, v3, v4, v9}, Lar;->e(La40;La40;II)V

    .line 1656
    .line 1657
    .line 1658
    :cond_65
    :goto_44
    if-nez v25, :cond_66

    .line 1659
    .line 1660
    if-eqz v18, :cond_6c

    .line 1661
    .line 1662
    :cond_66
    if-eqz v11, :cond_6c

    .line 1663
    .line 1664
    if-eq v11, v0, :cond_6c

    .line 1665
    .line 1666
    iget-object v2, v11, Lpc;->F:[Lcc;

    .line 1667
    .line 1668
    aget-object v3, v2, v14

    .line 1669
    .line 1670
    iget-object v4, v0, Lpc;->F:[Lcc;

    .line 1671
    .line 1672
    add-int/lit8 v5, v14, 0x1

    .line 1673
    .line 1674
    aget-object v4, v4, v5

    .line 1675
    .line 1676
    iget-object v6, v3, Lcc;->d:Lcc;

    .line 1677
    .line 1678
    if-eqz v6, :cond_67

    .line 1679
    .line 1680
    iget-object v6, v6, Lcc;->g:La40;

    .line 1681
    .line 1682
    goto :goto_45

    .line 1683
    :cond_67
    move-object/from16 v6, v16

    .line 1684
    .line 1685
    :goto_45
    iget-object v7, v4, Lcc;->d:Lcc;

    .line 1686
    .line 1687
    if-eqz v7, :cond_68

    .line 1688
    .line 1689
    iget-object v7, v7, Lcc;->g:La40;

    .line 1690
    .line 1691
    goto :goto_46

    .line 1692
    :cond_68
    move-object/from16 v7, v16

    .line 1693
    .line 1694
    :goto_46
    if-eq v10, v0, :cond_6a

    .line 1695
    .line 1696
    iget-object v7, v10, Lpc;->F:[Lcc;

    .line 1697
    .line 1698
    aget-object v7, v7, v5

    .line 1699
    .line 1700
    iget-object v7, v7, Lcc;->d:Lcc;

    .line 1701
    .line 1702
    if-eqz v7, :cond_69

    .line 1703
    .line 1704
    iget-object v7, v7, Lcc;->g:La40;

    .line 1705
    .line 1706
    move-object/from16 v16, v7

    .line 1707
    .line 1708
    :cond_69
    move-object/from16 v7, v16

    .line 1709
    .line 1710
    :cond_6a
    if-ne v11, v0, :cond_6b

    .line 1711
    .line 1712
    aget-object v4, v2, v5

    .line 1713
    .line 1714
    :cond_6b
    if-eqz v6, :cond_6c

    .line 1715
    .line 1716
    if-eqz v7, :cond_6c

    .line 1717
    .line 1718
    invoke-virtual {v3}, Lcc;->c()I

    .line 1719
    .line 1720
    .line 1721
    move-result v2

    .line 1722
    iget-object v0, v0, Lpc;->F:[Lcc;

    .line 1723
    .line 1724
    aget-object v0, v0, v5

    .line 1725
    .line 1726
    invoke-virtual {v0}, Lcc;->c()I

    .line 1727
    .line 1728
    .line 1729
    move-result v8

    .line 1730
    iget-object v0, v3, Lcc;->g:La40;

    .line 1731
    .line 1732
    iget-object v3, v4, Lcc;->g:La40;

    .line 1733
    .line 1734
    const/4 v9, 0x5

    .line 1735
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1736
    .line 1737
    move-object v4, v7

    .line 1738
    move-object v7, v3

    .line 1739
    move-object v3, v6

    .line 1740
    move-object v6, v4

    .line 1741
    move v4, v2

    .line 1742
    move-object v2, v0

    .line 1743
    invoke-virtual/range {v1 .. v9}, Lar;->b(La40;La40;IFLa40;La40;II)V

    .line 1744
    .line 1745
    .line 1746
    :cond_6c
    add-int/lit8 v15, v15, 0x1

    .line 1747
    .line 1748
    move-object/from16 v0, p0

    .line 1749
    .line 1750
    move-object/from16 v1, p1

    .line 1751
    .line 1752
    move-object/from16 v13, v19

    .line 1753
    .line 1754
    move/from16 v12, v38

    .line 1755
    .line 1756
    goto/16 :goto_2

    .line 1757
    .line 1758
    :cond_6d
    return-void
.end method

.method public static b(Lm50;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-interface {p0}, Lan;->b()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, " cannot be cast to kotlin.jvm.functions.Function2"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance v0, Ljava/lang/ClassCastException;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-class p0, La80;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {v0, p0}, Lip;->U(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public static c(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    .line 1
    sget-object v0, Lwy;->B:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    const/4 p3, 0x1

    .line 9
    invoke-virtual {p1, p3, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    new-instance p1, Landroid/util/TypedValue;

    .line 19
    .line 20
    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    const v0, 0x7f040220

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0, p1, p3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    iget p2, p1, Landroid/util/TypedValue;->type:I

    .line 37
    .line 38
    const/16 p3, 0x12

    .line 39
    .line 40
    if-ne p2, p3, :cond_1

    .line 41
    .line 42
    iget p1, p1, Landroid/util/TypedValue;->data:I

    .line 43
    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    :cond_0
    sget-object p1, La80;->q:[I

    .line 47
    .line 48
    const-string p2, "Theme.MaterialComponents"

    .line 49
    .line 50
    invoke-static {p0, p1, p2}, La80;->f(Landroid/content/Context;[ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    sget-object p1, La80;->p:[I

    .line 54
    .line 55
    const-string p2, "Theme.AppCompat"

    .line 56
    .line 57
    invoke-static {p0, p1, p2}, La80;->f(Landroid/content/Context;[ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static d(III)V
    .locals 3

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
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string p0, " > toIndex: "

    .line 21
    .line 22
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p2

    .line 36
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 37
    .line 38
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p0, ", toIndex: "

    .line 47
    .line 48
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, ", size: "

    .line 55
    .line 56
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1
.end method

.method public static varargs e(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V
    .locals 5

    .line 1
    sget-object v0, Lwy;->B:[I

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x2

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    array-length v1, p5

    .line 20
    const/4 v3, 0x1

    .line 21
    const/4 v4, -0x1

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eq p0, v4, :cond_4

    .line 29
    .line 30
    :goto_0
    move v2, v3

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    array-length p1, p5

    .line 37
    move p2, v2

    .line 38
    :goto_1
    if-ge p2, p1, :cond_3

    .line 39
    .line 40
    aget p3, p5, p2

    .line 41
    .line 42
    invoke-virtual {p0, p3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    if-ne p3, v4, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 49
    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    add-int/lit8 p2, p2, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_4
    :goto_2
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 60
    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    return-void

    .line 65
    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 66
    .line 67
    const-string p1, "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."

    .line 68
    .line 69
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p0
.end method

.method public static f(Landroid/content/Context;[ILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    array-length v1, p1

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    add-int/lit8 v0, v0, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const-string p1, "The style on this component requires your app theme to be "

    .line 24
    .line 25
    const-string v0, " (or a descendant)."

    .line 26
    .line 27
    invoke-static {p1, p2, v0}, Lz30;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0

    .line 35
    :cond_1
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static g(Landroid/content/Context;)Lwk;
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljf;

    .line 8
    .line 9
    const/16 v1, 0x10

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Lvh;

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lvh;-><init>(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "Package manager required to locate emoji font provider"

    .line 27
    .line 28
    invoke-static {v2, v1}, Lzt;->f(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Landroid/content/Intent;

    .line 32
    .line 33
    const-string v3, "androidx.content.action.LOAD_EMOJI_FONT"

    .line 34
    .line 35
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x0

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, Landroid/content/pm/ResolveInfo;

    .line 59
    .line 60
    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    iget-object v6, v4, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 65
    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    iget v6, v6, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 69
    .line 70
    const/4 v7, 0x1

    .line 71
    and-int/2addr v6, v7

    .line 72
    if-ne v6, v7, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move-object v4, v5

    .line 76
    :goto_1
    if-nez v4, :cond_3

    .line 77
    .line 78
    :goto_2
    move-object v1, v5

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    :try_start_0
    iget-object v2, v4, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v4, v4, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, v1, v4}, Lvh;->g(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v1, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    array-length v6, v0

    .line 94
    :goto_3
    if-ge v3, v6, :cond_4

    .line 95
    .line 96
    aget-object v7, v0, v3

    .line 97
    .line 98
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    new-instance v1, Ly1;

    .line 113
    .line 114
    const-string v3, "emojicompat-emoji-font"

    .line 115
    .line 116
    invoke-direct {v1, v2, v4, v3, v0}, Ly1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :catch_0
    move-exception v0

    .line 121
    const-string v1, "emoji2.text.DefaultEmojiConfig"

    .line 122
    .line 123
    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 124
    .line 125
    .line 126
    goto :goto_2

    .line 127
    :goto_4
    if-nez v1, :cond_5

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    new-instance v5, Lwk;

    .line 131
    .line 132
    new-instance v0, Lvk;

    .line 133
    .line 134
    invoke-direct {v0, p0, v1}, Lvk;-><init>(Landroid/content/Context;Ly1;)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v5, v0}, Lai;-><init>(Ldi;)V

    .line 138
    .line 139
    .line 140
    :goto_5
    return-object v5
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, "SMCCEyJ7\n"

    .line 2
    .line 3
    const-string v1, "IKX6QFYJ7AY=\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    const-string p0, ""

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    div-int/lit8 v0, v0, 0x2

    .line 26
    .line 27
    new-array v1, v0, [B

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_0
    if-ge v2, v0, :cond_1

    .line 31
    .line 32
    mul-int/lit8 v3, v2, 0x2

    .line 33
    .line 34
    add-int/lit8 v4, v3, 0x2

    .line 35
    .line 36
    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "ii5Yzqq81OuecxST8Oc=\n"

    .line 41
    .line 42
    const-string v5, "+Vs6vd7OvYU=\n"

    .line 43
    .line 44
    invoke-static {v4, v5}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-static {v4, v3}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    const/16 v4, 0x10

    .line 52
    .line 53
    invoke-static {v4}, Lff;->h(I)V

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    xor-int/lit8 v3, v3, 0x5a

    .line 61
    .line 62
    int-to-byte v3, v3

    .line 63
    aput-byte v3, v1, v2

    .line 64
    .line 65
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 69
    .line 70
    sget-object v0, Lc9;->a:Ljava/nio/charset/Charset;

    .line 71
    .line 72
    invoke-direct {p0, v1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 73
    .line 74
    .line 75
    return-object p0
.end method

.method public static i(D)I
    .locals 2

    .line 1
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 2
    .line 3
    div-double/2addr p0, v0

    .line 4
    const-wide v0, 0x3f69a5c37387b719L    # 0.0031308

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    cmpg-double v0, p0, v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    const-wide v0, 0x4029d70a3d70a3d7L    # 12.92

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    mul-double/2addr p0, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide v0, 0x3fdaaaaaaaaaaaabL    # 0.4166666666666667

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    const-wide v0, 0x3ff0e147ae147ae1L    # 1.055

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    mul-double/2addr p0, v0

    .line 35
    const-wide v0, 0x3fac28f5c28f5c29L    # 0.055

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    sub-double/2addr p0, v0

    .line 41
    :goto_0
    const-wide v0, 0x406fe00000000000L    # 255.0

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    mul-double/2addr p0, v0

    .line 47
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    .line 48
    .line 49
    .line 50
    move-result-wide p0

    .line 51
    long-to-int p0, p0

    .line 52
    if-gez p0, :cond_1

    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return p0

    .line 56
    :cond_1
    const/16 p1, 0xff

    .line 57
    .line 58
    if-le p0, p1, :cond_2

    .line 59
    .line 60
    return p1

    .line 61
    :cond_2
    return p0
.end method

.method public static j(Landroid/view/View;)Landroid/view/View;
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    check-cast p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "eXewzGLbXXtfZuyhJJwY\n"

    .line 24
    .line 25
    const-string v4, "HhLEjwqyMR8=\n"

    .line 26
    .line 27
    invoke-static {v3, v4}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-static {v3, v2}, Lip;->n(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, La80;->j(Landroid/view/View;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public static k(Landroid/widget/EdgeEffect;)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Luh;->b(Landroid/widget/EdgeEffect;)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static m(Landroid/content/Context;Ly1;)Lf2;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, v0, Ly1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v4, v0, Ly1;->c:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast v4, Ljava/lang/String;

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-virtual {v1, v3, v5}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    if-eqz v6, :cond_10

    .line 25
    .line 26
    iget-object v7, v6, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_f

    .line 33
    .line 34
    iget-object v3, v6, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    .line 35
    .line 36
    const/16 v4, 0x40

    .line 37
    .line 38
    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 43
    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    array-length v4, v1

    .line 50
    move v7, v5

    .line 51
    :goto_0
    if-ge v7, v4, :cond_0

    .line 52
    .line 53
    aget-object v8, v1, v7

    .line 54
    .line 55
    invoke-virtual {v8}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    add-int/lit8 v7, v7, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    sget-object v1, La80;->f:Ltk;

    .line 66
    .line 67
    invoke-static {v3, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 68
    .line 69
    .line 70
    iget-object v4, v0, Ly1;->e:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, Ljava/util/List;

    .line 73
    .line 74
    if-eqz v4, :cond_1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_1
    invoke-static {v2, v5}, La80;->z(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    :goto_1
    move v2, v5

    .line 82
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    const/4 v8, 0x0

    .line 87
    if-ge v2, v7, :cond_4

    .line 88
    .line 89
    new-instance v7, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    check-cast v9, Ljava/util/Collection;

    .line 96
    .line 97
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v7, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-eq v9, v10, :cond_2

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_2
    move v9, v5

    .line 115
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-ge v9, v10, :cond_5

    .line 120
    .line 121
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    check-cast v10, [B

    .line 126
    .line 127
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    check-cast v11, [B

    .line 132
    .line 133
    invoke-static {v10, v11}, Ljava/util/Arrays;->equals([B[B)Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-nez v10, :cond_3

    .line 138
    .line 139
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    move-object v6, v8

    .line 146
    :cond_5
    const/4 v1, 0x1

    .line 147
    if-nez v6, :cond_6

    .line 148
    .line 149
    new-instance v0, Lf2;

    .line 150
    .line 151
    invoke-direct {v0, v1, v8}, Lf2;-><init>(I[Lgl;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_6
    iget-object v2, v6, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 156
    .line 157
    new-instance v3, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    new-instance v4, Landroid/net/Uri$Builder;

    .line 163
    .line 164
    invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v6, "content"

    .line 168
    .line 169
    invoke-virtual {v4, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    invoke-virtual {v4, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-virtual {v4}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    new-instance v4, Landroid/net/Uri$Builder;

    .line 182
    .line 183
    invoke-direct {v4}, Landroid/net/Uri$Builder;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v4, v2}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    const-string v4, "file"

    .line 195
    .line 196
    invoke-virtual {v2, v4}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-virtual {v2}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    :try_start_0
    const-string v11, "_id"

    .line 205
    .line 206
    const-string v12, "file_id"

    .line 207
    .line 208
    const-string v13, "font_ttc_index"

    .line 209
    .line 210
    const-string v14, "font_variation_settings"

    .line 211
    .line 212
    const-string v15, "font_weight"

    .line 213
    .line 214
    const-string v16, "font_italic"

    .line 215
    .line 216
    const-string v17, "result_code"

    .line 217
    .line 218
    filled-new-array/range {v11 .. v17}, [Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 223
    .line 224
    .line 225
    move-result-object v9

    .line 226
    const-string v12, "query = ?"

    .line 227
    .line 228
    iget-object v0, v0, Ly1;->d:Ljava/io/Serializable;

    .line 229
    .line 230
    check-cast v0, Ljava/lang/String;

    .line 231
    .line 232
    filled-new-array {v0}, [Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v13

    .line 236
    const/4 v14, 0x0

    .line 237
    const/4 v15, 0x0

    .line 238
    invoke-static/range {v9 .. v15}, Luk;->a(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Landroid/database/Cursor;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    if-eqz v8, :cond_c

    .line 243
    .line 244
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-lez v0, :cond_c

    .line 249
    .line 250
    const-string v0, "result_code"

    .line 251
    .line 252
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    new-instance v3, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v4, "_id"

    .line 262
    .line 263
    invoke-interface {v8, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    const-string v6, "file_id"

    .line 268
    .line 269
    invoke-interface {v8, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    const-string v7, "font_ttc_index"

    .line 274
    .line 275
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    const-string v9, "font_weight"

    .line 280
    .line 281
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    const-string v11, "font_italic"

    .line 286
    .line 287
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 288
    .line 289
    .line 290
    move-result v11

    .line 291
    :goto_5
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    if-eqz v12, :cond_c

    .line 296
    .line 297
    const/4 v12, -0x1

    .line 298
    if-eq v0, v12, :cond_7

    .line 299
    .line 300
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 301
    .line 302
    .line 303
    move-result v13

    .line 304
    move/from16 v17, v13

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    goto :goto_c

    .line 309
    :cond_7
    move/from16 v17, v5

    .line 310
    .line 311
    :goto_6
    if-eq v7, v12, :cond_8

    .line 312
    .line 313
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getInt(I)I

    .line 314
    .line 315
    .line 316
    move-result v13

    .line 317
    move v14, v13

    .line 318
    goto :goto_7

    .line 319
    :cond_8
    move v14, v5

    .line 320
    :goto_7
    if-ne v6, v12, :cond_9

    .line 321
    .line 322
    invoke-interface {v8, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v12

    .line 326
    invoke-static {v10, v12, v13}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 327
    .line 328
    .line 329
    move-result-object v12

    .line 330
    :goto_8
    move-object v13, v12

    .line 331
    const/4 v12, -0x1

    .line 332
    goto :goto_9

    .line 333
    :cond_9
    invoke-interface {v8, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 334
    .line 335
    .line 336
    move-result-wide v12

    .line 337
    invoke-static {v2, v12, v13}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 338
    .line 339
    .line 340
    move-result-object v12

    .line 341
    goto :goto_8

    .line 342
    :goto_9
    if-eq v9, v12, :cond_a

    .line 343
    .line 344
    invoke-interface {v8, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    goto :goto_a

    .line 349
    :cond_a
    const/16 v15, 0x190

    .line 350
    .line 351
    :goto_a
    if-eq v11, v12, :cond_b

    .line 352
    .line 353
    invoke-interface {v8, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 354
    .line 355
    .line 356
    move-result v12

    .line 357
    if-ne v12, v1, :cond_b

    .line 358
    .line 359
    move/from16 v16, v1

    .line 360
    .line 361
    goto :goto_b

    .line 362
    :cond_b
    move/from16 v16, v5

    .line 363
    .line 364
    :goto_b
    new-instance v12, Lgl;

    .line 365
    .line 366
    invoke-direct/range {v12 .. v17}, Lgl;-><init>(Landroid/net/Uri;IIZI)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_c
    if-eqz v8, :cond_d

    .line 374
    .line 375
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 376
    .line 377
    .line 378
    :cond_d
    new-array v0, v5, [Lgl;

    .line 379
    .line 380
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    check-cast v0, [Lgl;

    .line 385
    .line 386
    new-instance v1, Lf2;

    .line 387
    .line 388
    invoke-direct {v1, v5, v0}, Lf2;-><init>(I[Lgl;)V

    .line 389
    .line 390
    .line 391
    return-object v1

    .line 392
    :goto_c
    if-eqz v8, :cond_e

    .line 393
    .line 394
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 395
    .line 396
    .line 397
    :cond_e
    throw v0

    .line 398
    :cond_f
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 399
    .line 400
    new-instance v1, Ljava/lang/StringBuilder;

    .line 401
    .line 402
    const-string v2, "Found content provider "

    .line 403
    .line 404
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string v2, ", but package was not "

    .line 411
    .line 412
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    throw v0

    .line 426
    :cond_10
    new-instance v0, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 427
    .line 428
    new-instance v1, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    const-string v2, "No package found for authority: "

    .line 431
    .line 432
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-direct {v0, v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw v0
.end method

.method public static n(Landroid/app/Activity;)I
    .locals 3

    .line 1
    const-string v0, "u/II\n"

    .line 2
    .line 3
    const-string v1, "2pF8CRqxRak=\n"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    sget-object v0, Lgn;->a:Lgn;

    .line 9
    .line 10
    const-string v1, "5cPKtOk4Qgzhy+yK6S5UFvr50ITmIkM=\n"

    .line 11
    .line 12
    const-string v2, "jqaz64pNMXg=\n"

    .line 13
    .line 14
    invoke-static {v1, v2}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v0, ""

    .line 22
    .line 23
    invoke-static {v1, v0}, Lgn;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lez v1, :cond_0

    .line 32
    .line 33
    :try_start_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    return p0

    .line 38
    :catch_0
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 47
    .line 48
    and-int/lit8 p0, p0, 0x30

    .line 49
    .line 50
    const/16 v0, 0x20

    .line 51
    .line 52
    if-ne p0, v0, :cond_1

    .line 53
    .line 54
    const-string p0, "z8u0MsxsEw==\n"

    .line 55
    .line 56
    const-string v0, "7POGcfQtI4I=\n"

    .line 57
    .line 58
    :goto_0
    invoke-static {p0, v0}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const-string p0, "O1JE1o6DLw==\n"

    .line 68
    .line 69
    const-string v0, "GGJzlb+1H68=\n"

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :goto_1
    return p0
.end method

.method public static final o(Lge;Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    sget-object v0, Lle;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 18
    .line 19
    :try_start_0
    check-cast v1, Li2;

    .line 20
    .line 21
    invoke-virtual {v1, p1}, Li2;->d(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    if-ne p1, v1, :cond_0

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    const-string v3, "Exception while trying to handle coroutine exception"

    .line 33
    .line 34
    invoke-direct {v2, v3, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, p1}, Lip;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v3, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    :try_start_1
    new-instance v0, Lng;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Lng;-><init>(Lge;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0}, Lip;->f(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    .line 60
    :catchall_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0, p0, p1}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static p(Lmp;Lsp;I)Lzg;
    .locals 9

    .line 1
    and-int/lit8 v0, p2, 0x1

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    and-int/lit8 p2, p2, 0x2

    .line 11
    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move v1, v2

    .line 16
    :goto_1
    check-cast p0, Lwp;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    instance-of v2, p1, Lop;

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    check-cast v2, Lop;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object v2, p2

    .line 33
    :goto_2
    if-nez v2, :cond_4

    .line 34
    .line 35
    new-instance v2, Ljp;

    .line 36
    .line 37
    invoke-direct {v2, p1}, Ljp;-><init>(Lsp;)V

    .line 38
    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_3
    move-object v2, p1

    .line 42
    :cond_4
    :goto_3
    iput-object p0, v2, Lsp;->d:Lwp;

    .line 43
    .line 44
    :cond_5
    :goto_4
    invoke-virtual {p0}, Lwp;->x()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    instance-of v4, v3, Lui;

    .line 49
    .line 50
    if-eqz v4, :cond_c

    .line 51
    .line 52
    move-object v4, v3

    .line 53
    check-cast v4, Lui;

    .line 54
    .line 55
    iget-boolean v5, v4, Lui;->a:Z

    .line 56
    .line 57
    if-eqz v5, :cond_8

    .line 58
    .line 59
    sget-object v5, Lwp;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 60
    .line 61
    :cond_6
    invoke-virtual {v5, p0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    if-eqz v4, :cond_7

    .line 66
    .line 67
    goto/16 :goto_9

    .line 68
    .line 69
    :cond_7
    invoke-virtual {v5, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eq v4, v3, :cond_6

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_8
    new-instance v3, Lmw;

    .line 77
    .line 78
    invoke-direct {v3}, Lvr;-><init>()V

    .line 79
    .line 80
    .line 81
    iget-boolean v5, v4, Lui;->a:Z

    .line 82
    .line 83
    if-eqz v5, :cond_9

    .line 84
    .line 85
    move-object v5, v3

    .line 86
    goto :goto_5

    .line 87
    :cond_9
    new-instance v5, Luo;

    .line 88
    .line 89
    invoke-direct {v5, v3}, Luo;-><init>(Lmw;)V

    .line 90
    .line 91
    .line 92
    :goto_5
    sget-object v6, Lwp;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 93
    .line 94
    :cond_a
    invoke-virtual {v6, p0, v4, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-eqz v3, :cond_b

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_b
    invoke-virtual {v6, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    if-eq v3, v4, :cond_a

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_c
    instance-of v4, v3, Lvo;

    .line 109
    .line 110
    if-eqz v4, :cond_15

    .line 111
    .line 112
    move-object v4, v3

    .line 113
    check-cast v4, Lvo;

    .line 114
    .line 115
    invoke-interface {v4}, Lvo;->d()Lmw;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-nez v5, :cond_d

    .line 120
    .line 121
    check-cast v3, Lsp;

    .line 122
    .line 123
    invoke-virtual {p0, v3}, Lwp;->H(Lsp;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_d
    sget-object v6, Lnw;->a:Lnw;

    .line 128
    .line 129
    if-eqz v0, :cond_12

    .line 130
    .line 131
    instance-of v7, v3, Lup;

    .line 132
    .line 133
    if-eqz v7, :cond_12

    .line 134
    .line 135
    monitor-enter v3

    .line 136
    :try_start_0
    move-object v7, v3

    .line 137
    check-cast v7, Lup;

    .line 138
    .line 139
    invoke-virtual {v7}, Lup;->c()Ljava/lang/Throwable;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    if-eqz v7, :cond_e

    .line 144
    .line 145
    instance-of v8, p1, Lea;

    .line 146
    .line 147
    if-eqz v8, :cond_11

    .line 148
    .line 149
    move-object v8, v3

    .line 150
    check-cast v8, Lup;

    .line 151
    .line 152
    invoke-virtual {v8}, Lup;->f()Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-nez v8, :cond_11

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :catchall_0
    move-exception p0

    .line 160
    goto :goto_7

    .line 161
    :cond_e
    :goto_6
    move-object v6, v3

    .line 162
    check-cast v6, Lvo;

    .line 163
    .line 164
    invoke-virtual {p0, v6, v5, v2}, Lwp;->j(Lvo;Lmw;Lsp;)Z

    .line 165
    .line 166
    .line 167
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    if-nez v6, :cond_f

    .line 169
    .line 170
    monitor-exit v3

    .line 171
    goto :goto_4

    .line 172
    :cond_f
    if-nez v7, :cond_10

    .line 173
    .line 174
    monitor-exit v3

    .line 175
    return-object v2

    .line 176
    :cond_10
    move-object v6, v2

    .line 177
    :cond_11
    monitor-exit v3

    .line 178
    goto :goto_8

    .line 179
    :goto_7
    monitor-exit v3

    .line 180
    throw p0

    .line 181
    :cond_12
    move-object v7, p2

    .line 182
    :goto_8
    if-eqz v7, :cond_14

    .line 183
    .line 184
    if-eqz v1, :cond_13

    .line 185
    .line 186
    invoke-interface {p1, v7}, Lsm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    :cond_13
    return-object v6

    .line 190
    :cond_14
    invoke-virtual {p0, v4, v5, v2}, Lwp;->j(Lvo;Lmw;Lsp;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_5

    .line 195
    .line 196
    :goto_9
    return-object v2

    .line 197
    :cond_15
    if-eqz v1, :cond_18

    .line 198
    .line 199
    instance-of p0, v3, Lnb;

    .line 200
    .line 201
    if-eqz p0, :cond_16

    .line 202
    .line 203
    check-cast v3, Lnb;

    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_16
    move-object v3, p2

    .line 207
    :goto_a
    if-eqz v3, :cond_17

    .line 208
    .line 209
    iget-object p2, v3, Lnb;->a:Ljava/lang/Throwable;

    .line 210
    .line 211
    :cond_17
    invoke-interface {p1, p2}, Lsm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    :cond_18
    sget-object p0, Lnw;->a:Lnw;

    .line 215
    .line 216
    return-object p0
.end method

.method public static final q([Ljava/lang/Object;)Li;
    .locals 1

    .line 1
    const-string v0, "array"

    .line 2
    .line 3
    invoke-static {v0, p0}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Li;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Li;-><init>([Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static r(Loe;Lge;Lwm;I)Lp40;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p1, Lwi;->a:Lwi;

    .line 6
    .line 7
    :cond_0
    invoke-interface {p0}, Loe;->e()Lge;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0, p1, v0}, Lip;->t(Lge;Lge;Z)Lge;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Lwg;->a:Lxf;

    .line 16
    .line 17
    if-eq p0, p1, :cond_1

    .line 18
    .line 19
    sget-object p3, Lvh;->b:Lvh;

    .line 20
    .line 21
    invoke-interface {p0, p3}, Lge;->b(Lfe;)Lee;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    if-nez p3, :cond_1

    .line 26
    .line 27
    invoke-interface {p0, p1}, Lge;->i(Lge;)Lge;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :cond_1
    new-instance p1, Lp40;

    .line 32
    .line 33
    invoke-direct {p1, p0, v0}, Lg;-><init>(Lge;Z)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Lz30;->t(I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_5

    .line 41
    .line 42
    if-eq p0, v0, :cond_4

    .line 43
    .line 44
    const/4 p3, 0x2

    .line 45
    if-eq p0, p3, :cond_3

    .line 46
    .line 47
    const/4 p3, 0x3

    .line 48
    if-ne p0, p3, :cond_2

    .line 49
    .line 50
    :try_start_0
    iget-object p0, p1, Lg;->c:Lge;

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    invoke-static {p0, p3}, Lff;->V(Lge;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :try_start_1
    move-object v0, p2

    .line 58
    check-cast v0, Lm50;

    .line 59
    .line 60
    invoke-static {v0}, La80;->b(Lm50;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2, p1, p1}, Lwm;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    :try_start_2
    invoke-static {p0, p3}, Lff;->L(Lge;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 68
    .line 69
    .line 70
    sget-object p0, Lpe;->a:Lpe;

    .line 71
    .line 72
    if-eq p2, p0, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1, p2}, Lg;->f(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    goto :goto_0

    .line 80
    :catchall_1
    move-exception p2

    .line 81
    :try_start_3
    invoke-static {p0, p3}, Lff;->L(Lge;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    throw p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 85
    :goto_0
    invoke-static {p0}, Lct;->f(Ljava/lang/Throwable;)Le10;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p1, p0}, Lg;->f(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_2
    new-instance p0, Lpb;

    .line 94
    .line 95
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_3
    check-cast p2, Lm50;

    .line 100
    .line 101
    invoke-virtual {p2, p1}, Lm50;->a(Lld;)Lld;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-static {p0}, Lip;->z(Lld;)Lld;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    sget-object p2, Lvh;->n:Lvh;

    .line 110
    .line 111
    invoke-interface {p0, p2}, Lld;->f(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    return-object p1

    .line 115
    :cond_5
    invoke-static {p2, p1, p1}, Lip;->X(Lwm;Lg;Lg;)V

    .line 116
    .line 117
    .line 118
    return-object p1
.end method

.method public static s(I)D
    .locals 6

    .line 1
    int-to-double v0, p0

    .line 2
    const-wide v2, 0x406fe00000000000L    # 255.0

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    div-double/2addr v0, v2

    .line 8
    const-wide v2, 0x3fa4b5daa07d970dL    # 0.040449936

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmpg-double p0, v0, v2

    .line 14
    .line 15
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 16
    .line 17
    if-gtz p0, :cond_0

    .line 18
    .line 19
    const-wide v4, 0x4029d70a3d70a3d7L    # 12.92

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    div-double/2addr v0, v4

    .line 25
    :goto_0
    mul-double/2addr v0, v2

    .line 26
    return-wide v0

    .line 27
    :cond_0
    const-wide v4, 0x3fac28f5c28f5c29L    # 0.055

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    add-double/2addr v0, v4

    .line 33
    const-wide v4, 0x3ff0e147ae147ae1L    # 1.055

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    div-double/2addr v0, v4

    .line 39
    const-wide v4, 0x4003333333333333L    # 2.4

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    goto :goto_0
.end method

.method public static t(FII)I
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    mul-float/2addr v0, p0

    .line 7
    float-to-int v0, v0

    .line 8
    const/16 v1, 0xff

    .line 9
    .line 10
    invoke-static {v0, v1}, Lgt;->e(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    int-to-float v2, v2

    .line 19
    mul-float/2addr v2, p0

    .line 20
    float-to-int v2, v2

    .line 21
    invoke-static {v2, v1}, Lgt;->e(II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    int-to-float p1, p1

    .line 30
    mul-float/2addr p1, p0

    .line 31
    float-to-int p0, p1

    .line 32
    invoke-static {p0, v1}, Lgt;->e(II)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-static {p2, v0, v2, p0}, Landroid/graphics/Color;->argb(IIII)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public static varargs u(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;
    .locals 0

    .line 1
    invoke-static {p0, p1, p3, p4}, La80;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 2
    .line 3
    .line 4
    invoke-static/range {p0 .. p5}, La80;->e(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static v(Landroid/view/inputmethod/EditorInfo;Landroid/view/inputmethod/InputConnection;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroid/view/inputmethod/EditorInfo;->hintText:Ljava/lang/CharSequence;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    instance-of p1, p0, Landroid/view/View;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    return-void
.end method

.method public static w(Landroid/widget/EdgeEffect;FF)F
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2}, Luh;->c(Landroid/widget/EdgeEffect;FF)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p0, p1, p2}, Lth;->a(Landroid/widget/EdgeEffect;FF)V

    .line 13
    .line 14
    .line 15
    return p1
.end method

.method public static x(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lcl;
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    :goto_0
    invoke-interface/range {p0 .. p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x2

    .line 9
    if-eq v1, v3, :cond_0

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    if-ne v1, v3, :cond_f

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-string v4, "font-family"

    .line 18
    .line 19
    move-object/from16 v5, p0

    .line 20
    .line 21
    invoke-interface {v5, v3, v1, v4}, Lorg/xmlpull/v1/XmlPullParser;->require(ILjava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_e

    .line 33
    .line 34
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    sget-object v6, Lty;->b:[I

    .line 39
    .line 40
    invoke-virtual {v0, v4, v6}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-virtual {v4, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const/4 v8, 0x4

    .line 50
    invoke-virtual {v4, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    const/4 v10, 0x5

    .line 55
    invoke-virtual {v4, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    invoke-virtual {v4, v2, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    invoke-virtual {v4, v3, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    const/16 v14, 0x1f4

    .line 68
    .line 69
    const/4 v15, 0x3

    .line 70
    invoke-virtual {v4, v15, v14}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    move-object/from16 v16, v1

    .line 75
    .line 76
    const/4 v1, 0x6

    .line 77
    invoke-virtual {v4, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {v4}, Landroid/content/res/TypedArray;->recycle()V

    .line 82
    .line 83
    .line 84
    if-eqz v7, :cond_2

    .line 85
    .line 86
    if-eqz v9, :cond_2

    .line 87
    .line 88
    if-eqz v11, :cond_2

    .line 89
    .line 90
    :goto_1
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eq v1, v15, :cond_1

    .line 95
    .line 96
    invoke-static {v5}, La80;->H(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-static {v0, v12}, La80;->z(Landroid/content/res/Resources;I)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v1, Lfl;

    .line 105
    .line 106
    new-instance v2, Ly1;

    .line 107
    .line 108
    invoke-direct {v2, v7, v9, v11, v0}, Ly1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 109
    .line 110
    .line 111
    invoke-direct {v1, v2, v13, v14, v8}, Lfl;-><init>(Ly1;IILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v1

    .line 115
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    :goto_2
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    if-eq v7, v15, :cond_c

    .line 125
    .line 126
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-eq v7, v3, :cond_3

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    const-string v8, "font"

    .line 138
    .line 139
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_b

    .line 144
    .line 145
    invoke-static {v5}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    sget-object v8, Lty;->c:[I

    .line 150
    .line 151
    invoke-virtual {v0, v7, v8}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    const/16 v8, 0x8

    .line 156
    .line 157
    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-eqz v9, :cond_4

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_4
    move v8, v2

    .line 165
    :goto_3
    const/16 v9, 0x190

    .line 166
    .line 167
    invoke-virtual {v7, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 168
    .line 169
    .line 170
    move-result v18

    .line 171
    invoke-virtual {v7, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    if-eqz v8, :cond_5

    .line 176
    .line 177
    move v8, v1

    .line 178
    goto :goto_4

    .line 179
    :cond_5
    move v8, v3

    .line 180
    :goto_4
    invoke-virtual {v7, v8, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-ne v2, v8, :cond_6

    .line 185
    .line 186
    move/from16 v23, v2

    .line 187
    .line 188
    goto :goto_5

    .line 189
    :cond_6
    move/from16 v23, v6

    .line 190
    .line 191
    :goto_5
    const/16 v8, 0x9

    .line 192
    .line 193
    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-eqz v9, :cond_7

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_7
    move v8, v15

    .line 201
    :goto_6
    const/4 v9, 0x7

    .line 202
    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    if-eqz v11, :cond_8

    .line 207
    .line 208
    goto :goto_7

    .line 209
    :cond_8
    const/4 v9, 0x4

    .line 210
    :goto_7
    invoke-virtual {v7, v9}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v22

    .line 214
    invoke-virtual {v7, v8, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 215
    .line 216
    .line 217
    move-result v19

    .line 218
    invoke-virtual {v7, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    if-eqz v8, :cond_9

    .line 223
    .line 224
    move v8, v10

    .line 225
    goto :goto_8

    .line 226
    :cond_9
    move v8, v6

    .line 227
    :goto_8
    invoke-virtual {v7, v8, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 228
    .line 229
    .line 230
    move-result v20

    .line 231
    invoke-virtual {v7, v8}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v21

    .line 235
    invoke-virtual {v7}, Landroid/content/res/TypedArray;->recycle()V

    .line 236
    .line 237
    .line 238
    :goto_9
    invoke-interface {v5}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 239
    .line 240
    .line 241
    move-result v7

    .line 242
    if-eq v7, v15, :cond_a

    .line 243
    .line 244
    invoke-static {v5}, La80;->H(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 245
    .line 246
    .line 247
    goto :goto_9

    .line 248
    :cond_a
    new-instance v17, Lel;

    .line 249
    .line 250
    invoke-direct/range {v17 .. v23}, Lel;-><init>(IIILjava/lang/String;Ljava/lang/String;Z)V

    .line 251
    .line 252
    .line 253
    move-object/from16 v7, v17

    .line 254
    .line 255
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    goto/16 :goto_2

    .line 259
    .line 260
    :cond_b
    invoke-static {v5}, La80;->H(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_2

    .line 264
    .line 265
    :cond_c
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_d

    .line 270
    .line 271
    return-object v16

    .line 272
    :cond_d
    new-instance v0, Ldl;

    .line 273
    .line 274
    new-array v1, v6, [Lel;

    .line 275
    .line 276
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    check-cast v1, [Lel;

    .line 281
    .line 282
    invoke-direct {v0, v1}, Ldl;-><init>([Lel;)V

    .line 283
    .line 284
    .line 285
    return-object v0

    .line 286
    :cond_e
    move-object/from16 v16, v1

    .line 287
    .line 288
    invoke-static {v5}, La80;->H(Lorg/xmlpull/v1/XmlPullParser;)V

    .line 289
    .line 290
    .line 291
    return-object v16

    .line 292
    :cond_f
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    .line 293
    .line 294
    const-string v1, "No start tag found"

    .line 295
    .line 296
    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0
.end method

.method public static y(Lge;Lge;)Lge;
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lip;->o(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwi;->a:Lwi;

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, Ljb;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1}, Ljb;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, p0, v0}, Lge;->h(Ljava/lang/Object;Lwm;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lge;

    .line 22
    .line 23
    return-object p0
.end method

.method public static z(Landroid/content/res/Resources;I)Ljava/util/List;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :try_start_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_3

    .line 24
    :cond_1
    :try_start_1
    new-instance v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v0, v2}, Lbl;->a(Landroid/content/res/TypedArray;I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-ne v3, v4, :cond_4

    .line 36
    .line 37
    move p1, v2

    .line 38
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge p1, v3, :cond_6

    .line 43
    .line 44
    invoke-virtual {v0, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    array-length v5, v3

    .line 60
    move v6, v2

    .line 61
    :goto_1
    if-ge v6, v5, :cond_2

    .line 62
    .line 63
    aget-object v7, v3, v6

    .line 64
    .line 65
    invoke-static {v7, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_3
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    new-instance p1, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    array-length v3, p0

    .line 91
    move v4, v2

    .line 92
    :goto_2
    if-ge v4, v3, :cond_5

    .line 93
    .line 94
    aget-object v5, p0, v4

    .line 95
    .line 96
    invoke-static {v5, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_5
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    :cond_6
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    .line 111
    .line 112
    return-object v1

    .line 113
    :goto_3
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 114
    .line 115
    .line 116
    throw p0
.end method


# virtual methods
.method public abstract C(Z)V
.end method

.method public abstract D(Z)V
.end method

.method public abstract l([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
.end method
