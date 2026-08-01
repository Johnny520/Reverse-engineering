.class public final Lc5;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public a:Ljava/nio/ByteBuffer;

.field public b:I

.field public c:I

.field public d:[I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:I

.field public i:[I

.field public j:I

.field public k:I

.field public final l:Lb5;

.field public final m:Lzd;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    sget-object v0, Lb5;->b:Lb5;

    .line 2
    .line 3
    sget-object v1, Lzd;->a:Lbe;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lbe;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lzd;->a:Lbe;

    .line 13
    .line 14
    :cond_0
    sget-object v1, Lzd;->a:Lbe;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    iput v2, p0, Lc5;->c:I

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    iput-object v2, p0, Lc5;->d:[I

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    iput v2, p0, Lc5;->e:I

    .line 27
    .line 28
    iput-boolean v2, p0, Lc5;->f:Z

    .line 29
    .line 30
    iput-boolean v2, p0, Lc5;->g:Z

    .line 31
    .line 32
    const/16 v3, 0x10

    .line 33
    .line 34
    new-array v3, v3, [I

    .line 35
    .line 36
    iput-object v3, p0, Lc5;->i:[I

    .line 37
    .line 38
    iput v2, p0, Lc5;->j:I

    .line 39
    .line 40
    iput v2, p0, Lc5;->k:I

    .line 41
    .line 42
    iput-object v0, p0, Lc5;->l:Lb5;

    .line 43
    .line 44
    const/16 v0, 0x400

    .line 45
    .line 46
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 57
    .line 58
    iput-object v1, p0, Lc5;->m:Lzd;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput v0, p0, Lc5;->b:I

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a(IZ)V
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-virtual {p0, v1, v0}, Lc5;->p(II)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    iget v2, p0, Lc5;->b:I

    .line 11
    .line 12
    sub-int/2addr v2, v1

    .line 13
    iput v2, p0, Lc5;->b:I

    .line 14
    .line 15
    int-to-byte p2, p2

    .line 16
    invoke-virtual {v0, v2, p2}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Lc5;->q(I)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final b(B)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-virtual {p0, v1, v0}, Lc5;->p(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lc5;->b:I

    .line 9
    .line 10
    sub-int/2addr v2, v1

    .line 11
    iput v2, p0, Lc5;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c(IB)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lc5;->b(B)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lc5;->q(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    invoke-virtual {p0, v1, v0}, Lc5;->p(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lc5;->b:I

    .line 9
    .line 10
    sub-int/2addr v2, v1

    .line 11
    iput v2, p0, Lc5;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final e(II)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lc5;->d(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lc5;->q(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final f(J)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x8

    .line 3
    .line 4
    invoke-virtual {p0, v1, v0}, Lc5;->p(II)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget v2, p0, Lc5;->b:I

    .line 10
    .line 11
    sub-int/2addr v2, v1

    .line 12
    iput v2, p0, Lc5;->b:I

    .line 13
    .line 14
    invoke-virtual {v0, v2, p1, p2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final g(I)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x4

    .line 3
    invoke-virtual {p0, v1, v0}, Lc5;->p(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lc5;->o()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sub-int/2addr v0, p1

    .line 11
    add-int/2addr v0, v1

    .line 12
    iget-object p1, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    iget v2, p0, Lc5;->b:I

    .line 15
    .line 16
    sub-int/2addr v2, v1

    .line 17
    iput v2, p0, Lc5;->b:I

    .line 18
    .line 19
    invoke-virtual {p1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final h(II)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lc5;->g(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lc5;->q(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final i(S)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-virtual {p0, v1, v0}, Lc5;->p(II)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 7
    .line 8
    iget v2, p0, Lc5;->b:I

    .line 9
    .line 10
    sub-int/2addr v2, v1

    .line 11
    iput v2, p0, Lc5;->b:I

    .line 12
    .line 13
    invoke-virtual {v0, v2, p1}, Ljava/nio/ByteBuffer;->putShort(IS)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j(Ljava/lang/CharSequence;)I
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lc5;->m:Lzd;

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    check-cast v3, Lbe;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x0

    .line 18
    move v5, v4

    .line 19
    :goto_0
    const/16 v6, 0x80

    .line 20
    .line 21
    if-ge v5, v3, :cond_0

    .line 22
    .line 23
    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    if-ge v7, v6, :cond_0

    .line 28
    .line 29
    add-int/lit8 v5, v5, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v7, v3

    .line 33
    :goto_1
    const v8, 0xdfff

    .line 34
    .line 35
    .line 36
    const v9, 0xd800

    .line 37
    .line 38
    .line 39
    const/16 v10, 0x800

    .line 40
    .line 41
    const/4 v11, 0x1

    .line 42
    if-ge v5, v3, :cond_6

    .line 43
    .line 44
    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    if-ge v12, v10, :cond_1

    .line 49
    .line 50
    rsub-int/lit8 v8, v12, 0x7f

    .line 51
    .line 52
    ushr-int/lit8 v8, v8, 0x1f

    .line 53
    .line 54
    add-int/2addr v7, v8

    .line 55
    add-int/lit8 v5, v5, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    move v13, v4

    .line 63
    :goto_2
    if-ge v5, v12, :cond_5

    .line 64
    .line 65
    invoke-interface {v1, v5}, Ljava/lang/CharSequence;->charAt(I)C

    .line 66
    .line 67
    .line 68
    move-result v14

    .line 69
    if-ge v14, v10, :cond_2

    .line 70
    .line 71
    rsub-int/lit8 v14, v14, 0x7f

    .line 72
    .line 73
    ushr-int/lit8 v14, v14, 0x1f

    .line 74
    .line 75
    add-int/2addr v13, v14

    .line 76
    goto :goto_3

    .line 77
    :cond_2
    add-int/lit8 v13, v13, 0x2

    .line 78
    .line 79
    if-gt v9, v14, :cond_4

    .line 80
    .line 81
    if-gt v14, v8, :cond_4

    .line 82
    .line 83
    invoke-static {v1, v5}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 84
    .line 85
    .line 86
    move-result v14

    .line 87
    const/high16 v15, 0x10000

    .line 88
    .line 89
    if-lt v14, v15, :cond_3

    .line 90
    .line 91
    add-int/lit8 v5, v5, 0x1

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    new-instance v0, Lae;

    .line 95
    .line 96
    invoke-direct {v0, v5, v12}, Lae;-><init>(II)V

    .line 97
    .line 98
    .line 99
    throw v0

    .line 100
    :cond_4
    :goto_3
    add-int/2addr v5, v11

    .line 101
    goto :goto_2

    .line 102
    :cond_5
    add-int/2addr v7, v13

    .line 103
    :cond_6
    if-lt v7, v3, :cond_1d

    .line 104
    .line 105
    invoke-virtual {v0, v4}, Lc5;->b(B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v11, v7, v11}, Lc5;->s(III)V

    .line 109
    .line 110
    .line 111
    iget-object v3, v0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    iget v5, v0, Lc5;->b:I

    .line 114
    .line 115
    sub-int/2addr v5, v7

    .line 116
    iput v5, v0, Lc5;->b:I

    .line 117
    .line 118
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 119
    .line 120
    .line 121
    iget-object v3, v0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 122
    .line 123
    check-cast v2, Lbe;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    const-string v5, " at index "

    .line 133
    .line 134
    const-string v7, "Failed writing "

    .line 135
    .line 136
    if-eqz v2, :cond_13

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 147
    .line 148
    .line 149
    move-result v13

    .line 150
    add-int/2addr v13, v2

    .line 151
    invoke-virtual {v3}, Ljava/nio/Buffer;->remaining()I

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 156
    .line 157
    .line 158
    move-result v15

    .line 159
    add-int/2addr v14, v13

    .line 160
    :goto_4
    move/from16 v16, v11

    .line 161
    .line 162
    if-ge v4, v15, :cond_7

    .line 163
    .line 164
    add-int v11, v4, v13

    .line 165
    .line 166
    if-ge v11, v14, :cond_7

    .line 167
    .line 168
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    if-ge v8, v6, :cond_7

    .line 173
    .line 174
    int-to-byte v8, v8

    .line 175
    aput-byte v8, v12, v11

    .line 176
    .line 177
    add-int/lit8 v4, v4, 0x1

    .line 178
    .line 179
    move/from16 v11, v16

    .line 180
    .line 181
    const v8, 0xdfff

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    if-ne v4, v15, :cond_8

    .line 186
    .line 187
    add-int/2addr v13, v15

    .line 188
    goto/16 :goto_7

    .line 189
    .line 190
    :cond_8
    add-int/2addr v13, v4

    .line 191
    :goto_5
    if-ge v4, v15, :cond_12

    .line 192
    .line 193
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    if-ge v8, v6, :cond_9

    .line 198
    .line 199
    if-ge v13, v14, :cond_9

    .line 200
    .line 201
    add-int/lit8 v11, v13, 0x1

    .line 202
    .line 203
    int-to-byte v8, v8

    .line 204
    aput-byte v8, v12, v13

    .line 205
    .line 206
    move v13, v11

    .line 207
    goto/16 :goto_6

    .line 208
    .line 209
    :cond_9
    if-ge v8, v10, :cond_a

    .line 210
    .line 211
    add-int/lit8 v11, v14, -0x2

    .line 212
    .line 213
    if-gt v13, v11, :cond_a

    .line 214
    .line 215
    add-int/lit8 v11, v13, 0x1

    .line 216
    .line 217
    ushr-int/lit8 v10, v8, 0x6

    .line 218
    .line 219
    or-int/lit16 v10, v10, 0x3c0

    .line 220
    .line 221
    int-to-byte v10, v10

    .line 222
    aput-byte v10, v12, v13

    .line 223
    .line 224
    add-int/lit8 v13, v13, 0x2

    .line 225
    .line 226
    and-int/lit8 v8, v8, 0x3f

    .line 227
    .line 228
    or-int/2addr v8, v6

    .line 229
    int-to-byte v8, v8

    .line 230
    aput-byte v8, v12, v11

    .line 231
    .line 232
    goto :goto_6

    .line 233
    :cond_a
    if-lt v8, v9, :cond_b

    .line 234
    .line 235
    const v10, 0xdfff

    .line 236
    .line 237
    .line 238
    if-ge v10, v8, :cond_c

    .line 239
    .line 240
    :cond_b
    add-int/lit8 v10, v14, -0x3

    .line 241
    .line 242
    if-gt v13, v10, :cond_c

    .line 243
    .line 244
    add-int/lit8 v10, v13, 0x1

    .line 245
    .line 246
    ushr-int/lit8 v11, v8, 0xc

    .line 247
    .line 248
    or-int/lit16 v11, v11, 0x1e0

    .line 249
    .line 250
    int-to-byte v11, v11

    .line 251
    aput-byte v11, v12, v13

    .line 252
    .line 253
    add-int/lit8 v11, v13, 0x2

    .line 254
    .line 255
    ushr-int/lit8 v17, v8, 0x6

    .line 256
    .line 257
    and-int/lit8 v9, v17, 0x3f

    .line 258
    .line 259
    or-int/2addr v9, v6

    .line 260
    int-to-byte v9, v9

    .line 261
    aput-byte v9, v12, v10

    .line 262
    .line 263
    add-int/lit8 v13, v13, 0x3

    .line 264
    .line 265
    and-int/lit8 v8, v8, 0x3f

    .line 266
    .line 267
    or-int/2addr v8, v6

    .line 268
    int-to-byte v8, v8

    .line 269
    aput-byte v8, v12, v11

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_c
    add-int/lit8 v9, v14, -0x4

    .line 273
    .line 274
    if-gt v13, v9, :cond_f

    .line 275
    .line 276
    add-int/lit8 v9, v4, 0x1

    .line 277
    .line 278
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    if-eq v9, v10, :cond_e

    .line 283
    .line 284
    invoke-interface {v1, v9}, Ljava/lang/CharSequence;->charAt(I)C

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    invoke-static {v8, v4}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 289
    .line 290
    .line 291
    move-result v10

    .line 292
    if-eqz v10, :cond_d

    .line 293
    .line 294
    invoke-static {v8, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    add-int/lit8 v8, v13, 0x1

    .line 299
    .line 300
    ushr-int/lit8 v10, v4, 0x12

    .line 301
    .line 302
    or-int/lit16 v10, v10, 0xf0

    .line 303
    .line 304
    int-to-byte v10, v10

    .line 305
    aput-byte v10, v12, v13

    .line 306
    .line 307
    add-int/lit8 v10, v13, 0x2

    .line 308
    .line 309
    ushr-int/lit8 v11, v4, 0xc

    .line 310
    .line 311
    and-int/lit8 v11, v11, 0x3f

    .line 312
    .line 313
    or-int/2addr v11, v6

    .line 314
    int-to-byte v11, v11

    .line 315
    aput-byte v11, v12, v8

    .line 316
    .line 317
    add-int/lit8 v8, v13, 0x3

    .line 318
    .line 319
    ushr-int/lit8 v11, v4, 0x6

    .line 320
    .line 321
    and-int/lit8 v11, v11, 0x3f

    .line 322
    .line 323
    or-int/2addr v11, v6

    .line 324
    int-to-byte v11, v11

    .line 325
    aput-byte v11, v12, v10

    .line 326
    .line 327
    add-int/lit8 v13, v13, 0x4

    .line 328
    .line 329
    and-int/lit8 v4, v4, 0x3f

    .line 330
    .line 331
    or-int/2addr v4, v6

    .line 332
    int-to-byte v4, v4

    .line 333
    aput-byte v4, v12, v8

    .line 334
    .line 335
    move v4, v9

    .line 336
    :goto_6
    add-int/lit8 v4, v4, 0x1

    .line 337
    .line 338
    const v9, 0xd800

    .line 339
    .line 340
    .line 341
    const/16 v10, 0x800

    .line 342
    .line 343
    goto/16 :goto_5

    .line 344
    .line 345
    :cond_d
    move v4, v9

    .line 346
    :cond_e
    new-instance v0, Lae;

    .line 347
    .line 348
    add-int/lit8 v4, v4, -0x1

    .line 349
    .line 350
    invoke-direct {v0, v4, v15}, Lae;-><init>(II)V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :cond_f
    const v0, 0xd800

    .line 355
    .line 356
    .line 357
    if-gt v0, v8, :cond_11

    .line 358
    .line 359
    const v10, 0xdfff

    .line 360
    .line 361
    .line 362
    if-gt v8, v10, :cond_11

    .line 363
    .line 364
    add-int/lit8 v0, v4, 0x1

    .line 365
    .line 366
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    if-eq v0, v2, :cond_10

    .line 371
    .line 372
    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    invoke-static {v8, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    if-nez v0, :cond_11

    .line 381
    .line 382
    :cond_10
    new-instance v0, Lae;

    .line 383
    .line 384
    invoke-direct {v0, v4, v15}, Lae;-><init>(II)V

    .line 385
    .line 386
    .line 387
    throw v0

    .line 388
    :cond_11
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 389
    .line 390
    new-instance v1, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw v0

    .line 412
    :cond_12
    :goto_7
    sub-int/2addr v13, v2

    .line 413
    invoke-virtual {v3, v13}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 414
    .line 415
    .line 416
    goto/16 :goto_e

    .line 417
    .line 418
    :cond_13
    move/from16 v16, v11

    .line 419
    .line 420
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 425
    .line 426
    .line 427
    move-result v8

    .line 428
    :goto_8
    if-ge v4, v2, :cond_14

    .line 429
    .line 430
    :try_start_0
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    if-ge v9, v6, :cond_14

    .line 435
    .line 436
    add-int v10, v8, v4

    .line 437
    .line 438
    int-to-byte v9, v9

    .line 439
    invoke-virtual {v3, v10, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 440
    .line 441
    .line 442
    add-int/lit8 v4, v4, 0x1

    .line 443
    .line 444
    goto :goto_8

    .line 445
    :cond_14
    if-ne v4, v2, :cond_15

    .line 446
    .line 447
    add-int v2, v8, v4

    .line 448
    .line 449
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 450
    .line 451
    .line 452
    goto/16 :goto_e

    .line 453
    .line 454
    :cond_15
    add-int/2addr v8, v4

    .line 455
    :goto_9
    if-ge v4, v2, :cond_1c

    .line 456
    .line 457
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 458
    .line 459
    .line 460
    move-result v9

    .line 461
    if-ge v9, v6, :cond_16

    .line 462
    .line 463
    int-to-byte v9, v9

    .line 464
    invoke-virtual {v3, v8, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_5

    .line 465
    .line 466
    .line 467
    const/16 v10, 0x800

    .line 468
    .line 469
    :goto_a
    const v11, 0xd800

    .line 470
    .line 471
    .line 472
    const v12, 0xdfff

    .line 473
    .line 474
    .line 475
    goto/16 :goto_d

    .line 476
    .line 477
    :cond_16
    const/16 v10, 0x800

    .line 478
    .line 479
    if-ge v9, v10, :cond_17

    .line 480
    .line 481
    add-int/lit8 v11, v8, 0x1

    .line 482
    .line 483
    ushr-int/lit8 v12, v9, 0x6

    .line 484
    .line 485
    or-int/lit16 v12, v12, 0xc0

    .line 486
    .line 487
    int-to-byte v12, v12

    .line 488
    :try_start_1
    invoke-virtual {v3, v8, v12}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 489
    .line 490
    .line 491
    and-int/lit8 v8, v9, 0x3f

    .line 492
    .line 493
    or-int/2addr v8, v6

    .line 494
    int-to-byte v8, v8

    .line 495
    invoke-virtual {v3, v11, v8}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 496
    .line 497
    .line 498
    move v8, v11

    .line 499
    goto :goto_a

    .line 500
    :catch_0
    move v8, v11

    .line 501
    goto/16 :goto_f

    .line 502
    .line 503
    :cond_17
    const v11, 0xd800

    .line 504
    .line 505
    .line 506
    const v12, 0xdfff

    .line 507
    .line 508
    .line 509
    if-lt v9, v11, :cond_1b

    .line 510
    .line 511
    if-ge v12, v9, :cond_18

    .line 512
    .line 513
    goto :goto_c

    .line 514
    :cond_18
    add-int/lit8 v13, v4, 0x1

    .line 515
    .line 516
    if-eq v13, v2, :cond_1a

    .line 517
    .line 518
    :try_start_2
    invoke-interface {v1, v13}, Ljava/lang/CharSequence;->charAt(I)C

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    invoke-static {v9, v4}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 523
    .line 524
    .line 525
    move-result v14

    .line 526
    if-eqz v14, :cond_19

    .line 527
    .line 528
    invoke-static {v9, v4}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 529
    .line 530
    .line 531
    move-result v4
    :try_end_2
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_2 .. :try_end_2} :catch_1

    .line 532
    add-int/lit8 v9, v8, 0x1

    .line 533
    .line 534
    ushr-int/lit8 v14, v4, 0x12

    .line 535
    .line 536
    or-int/lit16 v14, v14, 0xf0

    .line 537
    .line 538
    int-to-byte v14, v14

    .line 539
    :try_start_3
    invoke-virtual {v3, v8, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_3 .. :try_end_3} :catch_3

    .line 540
    .line 541
    .line 542
    add-int/lit8 v14, v8, 0x2

    .line 543
    .line 544
    ushr-int/lit8 v15, v4, 0xc

    .line 545
    .line 546
    and-int/lit8 v15, v15, 0x3f

    .line 547
    .line 548
    or-int/2addr v15, v6

    .line 549
    int-to-byte v15, v15

    .line 550
    :try_start_4
    invoke-virtual {v3, v9, v15}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_4
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_4 .. :try_end_4} :catch_2

    .line 551
    .line 552
    .line 553
    add-int/lit8 v8, v8, 0x3

    .line 554
    .line 555
    ushr-int/lit8 v9, v4, 0x6

    .line 556
    .line 557
    and-int/lit8 v9, v9, 0x3f

    .line 558
    .line 559
    or-int/2addr v9, v6

    .line 560
    int-to-byte v9, v9

    .line 561
    :try_start_5
    invoke-virtual {v3, v14, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 562
    .line 563
    .line 564
    and-int/lit8 v4, v4, 0x3f

    .line 565
    .line 566
    or-int/2addr v4, v6

    .line 567
    int-to-byte v4, v4

    .line 568
    invoke-virtual {v3, v8, v4}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_5
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_5 .. :try_end_5} :catch_1

    .line 569
    .line 570
    .line 571
    move v4, v13

    .line 572
    goto :goto_d

    .line 573
    :catch_1
    :goto_b
    move v4, v13

    .line 574
    goto :goto_f

    .line 575
    :catch_2
    move v4, v13

    .line 576
    move v8, v14

    .line 577
    goto :goto_f

    .line 578
    :catch_3
    move v8, v9

    .line 579
    goto :goto_b

    .line 580
    :cond_19
    move v4, v13

    .line 581
    :cond_1a
    :try_start_6
    new-instance v0, Lae;

    .line 582
    .line 583
    invoke-direct {v0, v4, v2}, Lae;-><init>(II)V

    .line 584
    .line 585
    .line 586
    throw v0
    :try_end_6
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_6 .. :try_end_6} :catch_5

    .line 587
    :cond_1b
    :goto_c
    add-int/lit8 v13, v8, 0x1

    .line 588
    .line 589
    ushr-int/lit8 v14, v9, 0xc

    .line 590
    .line 591
    or-int/lit16 v14, v14, 0xe0

    .line 592
    .line 593
    int-to-byte v14, v14

    .line 594
    :try_start_7
    invoke-virtual {v3, v8, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;
    :try_end_7
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_7 .. :try_end_7} :catch_4

    .line 595
    .line 596
    .line 597
    add-int/lit8 v8, v8, 0x2

    .line 598
    .line 599
    ushr-int/lit8 v14, v9, 0x6

    .line 600
    .line 601
    and-int/lit8 v14, v14, 0x3f

    .line 602
    .line 603
    or-int/2addr v14, v6

    .line 604
    int-to-byte v14, v14

    .line 605
    :try_start_8
    invoke-virtual {v3, v13, v14}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 606
    .line 607
    .line 608
    and-int/lit8 v9, v9, 0x3f

    .line 609
    .line 610
    or-int/2addr v9, v6

    .line 611
    int-to-byte v9, v9

    .line 612
    invoke-virtual {v3, v8, v9}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 613
    .line 614
    .line 615
    :goto_d
    add-int/lit8 v4, v4, 0x1

    .line 616
    .line 617
    add-int/lit8 v8, v8, 0x1

    .line 618
    .line 619
    goto/16 :goto_9

    .line 620
    .line 621
    :catch_4
    move v8, v13

    .line 622
    goto :goto_f

    .line 623
    :cond_1c
    invoke-virtual {v3, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
    :try_end_8
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_8 .. :try_end_8} :catch_5

    .line 624
    .line 625
    .line 626
    :goto_e
    invoke-virtual {v0}, Lc5;->m()I

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    return v0

    .line 631
    :catch_5
    :goto_f
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 632
    .line 633
    .line 634
    move-result v0

    .line 635
    invoke-virtual {v3}, Ljava/nio/Buffer;->position()I

    .line 636
    .line 637
    .line 638
    move-result v2

    .line 639
    sub-int/2addr v8, v2

    .line 640
    add-int/lit8 v8, v8, 0x1

    .line 641
    .line 642
    invoke-static {v4, v8}, Ljava/lang/Math;->max(II)I

    .line 643
    .line 644
    .line 645
    move-result v2

    .line 646
    add-int/2addr v2, v0

    .line 647
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 648
    .line 649
    invoke-interface {v1, v4}, Ljava/lang/CharSequence;->charAt(I)C

    .line 650
    .line 651
    .line 652
    move-result v1

    .line 653
    new-instance v3, Ljava/lang/StringBuilder;

    .line 654
    .line 655
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 665
    .line 666
    .line 667
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    throw v0

    .line 675
    :cond_1d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 676
    .line 677
    int-to-long v1, v7

    .line 678
    const-wide v3, 0x100000000L

    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    add-long/2addr v1, v3

    .line 684
    new-instance v3, Ljava/lang/StringBuilder;

    .line 685
    .line 686
    const-string v4, "UTF-8 length does not fit in int: "

    .line 687
    .line 688
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    throw v0
.end method

.method public final k([I)I
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc5;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    array-length v1, p1

    .line 7
    invoke-virtual {p0, v0, v1, v0}, Lc5;->s(III)V

    .line 8
    .line 9
    .line 10
    array-length v0, p1

    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v0, :cond_0

    .line 14
    .line 15
    aget v1, p1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lc5;->g(I)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Lc5;->m()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    .line 29
    .line 30
    const-string p1, "FlatBuffers: object serialization must not be nested."

    .line 31
    .line 32
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public final l()I
    .locals 11

    .line 1
    iget-object v0, p0, Lc5;->d:[I

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    iget-boolean v0, p0, Lc5;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, Lc5;->d(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lc5;->o()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget v2, p0, Lc5;->e:I

    .line 18
    .line 19
    add-int/lit8 v2, v2, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v2, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Lc5;->d:[I

    .line 24
    .line 25
    aget v3, v3, v2

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    add-int/lit8 v2, v2, -0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v3, v2

    .line 33
    :goto_1
    if-ltz v3, :cond_2

    .line 34
    .line 35
    iget-object v4, p0, Lc5;->d:[I

    .line 36
    .line 37
    aget v4, v4, v3

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    sub-int v4, v1, v4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    move v4, v0

    .line 45
    :goto_2
    int-to-short v4, v4

    .line 46
    invoke-virtual {p0, v4}, Lc5;->i(S)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v3, v3, -0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    iget v3, p0, Lc5;->h:I

    .line 53
    .line 54
    sub-int v3, v1, v3

    .line 55
    .line 56
    int-to-short v3, v3

    .line 57
    invoke-virtual {p0, v3}, Lc5;->i(S)V

    .line 58
    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x3

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    mul-int/2addr v2, v3

    .line 64
    int-to-short v2, v2

    .line 65
    invoke-virtual {p0, v2}, Lc5;->i(S)V

    .line 66
    .line 67
    .line 68
    move v2, v0

    .line 69
    :goto_3
    iget v4, p0, Lc5;->j:I

    .line 70
    .line 71
    if-ge v2, v4, :cond_6

    .line 72
    .line 73
    iget-object v4, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/nio/Buffer;->capacity()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    iget-object v5, p0, Lc5;->i:[I

    .line 80
    .line 81
    aget v5, v5, v2

    .line 82
    .line 83
    sub-int/2addr v4, v5

    .line 84
    iget v5, p0, Lc5;->b:I

    .line 85
    .line 86
    iget-object v6, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    iget-object v7, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    invoke-virtual {v7, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-ne v6, v7, :cond_5

    .line 99
    .line 100
    move v7, v3

    .line 101
    :goto_4
    if-ge v7, v6, :cond_4

    .line 102
    .line 103
    iget-object v8, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    add-int v9, v4, v7

    .line 106
    .line 107
    invoke-virtual {v8, v9}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    iget-object v9, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 112
    .line 113
    add-int v10, v5, v7

    .line 114
    .line 115
    invoke-virtual {v9, v10}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    if-eq v8, v9, :cond_3

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_3
    add-int/lit8 v7, v7, 0x2

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    iget-object v4, p0, Lc5;->i:[I

    .line 126
    .line 127
    aget v2, v4, v2

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_5
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    move v2, v0

    .line 134
    :goto_6
    if-eqz v2, :cond_7

    .line 135
    .line 136
    iget-object v3, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    sub-int/2addr v3, v1

    .line 143
    iput v3, p0, Lc5;->b:I

    .line 144
    .line 145
    iget-object v4, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 146
    .line 147
    sub-int/2addr v2, v1

    .line 148
    invoke-virtual {v4, v3, v2}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 149
    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_7
    iget v2, p0, Lc5;->j:I

    .line 153
    .line 154
    iget-object v4, p0, Lc5;->i:[I

    .line 155
    .line 156
    array-length v5, v4

    .line 157
    if-ne v2, v5, :cond_8

    .line 158
    .line 159
    mul-int/2addr v2, v3

    .line 160
    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([II)[I

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    iput-object v2, p0, Lc5;->i:[I

    .line 165
    .line 166
    :cond_8
    iget-object v2, p0, Lc5;->i:[I

    .line 167
    .line 168
    iget v3, p0, Lc5;->j:I

    .line 169
    .line 170
    add-int/lit8 v4, v3, 0x1

    .line 171
    .line 172
    iput v4, p0, Lc5;->j:I

    .line 173
    .line 174
    invoke-virtual {p0}, Lc5;->o()I

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    aput v4, v2, v3

    .line 179
    .line 180
    iget-object v2, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 181
    .line 182
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    sub-int/2addr v3, v1

    .line 187
    invoke-virtual {p0}, Lc5;->o()I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    sub-int/2addr v4, v1

    .line 192
    invoke-virtual {v2, v3, v4}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 193
    .line 194
    .line 195
    :goto_7
    iput-boolean v0, p0, Lc5;->f:Z

    .line 196
    .line 197
    return v1

    .line 198
    :cond_9
    new-instance p0, Ljava/lang/AssertionError;

    .line 199
    .line 200
    const-string v0, "FlatBuffers: endTable called without startTable"

    .line 201
    .line 202
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    throw p0
.end method

.method public final m()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lc5;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lc5;->f:Z

    .line 7
    .line 8
    iget v0, p0, Lc5;->k:I

    .line 9
    .line 10
    iget-object v1, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    iget v2, p0, Lc5;->b:I

    .line 13
    .line 14
    add-int/lit8 v2, v2, -0x4

    .line 15
    .line 16
    iput v2, p0, Lc5;->b:I

    .line 17
    .line 18
    invoke-virtual {v1, v2, v0}, Ljava/nio/ByteBuffer;->putInt(II)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lc5;->o()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 27
    .line 28
    const-string v0, "FlatBuffers: endVector called without startVector"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    throw p0
.end method

.method public final n(I)V
    .locals 2

    .line 1
    iget v0, p0, Lc5;->c:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-virtual {p0, v0, v1}, Lc5;->p(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lc5;->g(I)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    iget v0, p0, Lc5;->b:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lc5;->g:Z

    .line 19
    .line 20
    return-void
.end method

.method public final o()I
    .locals 1

    .line 1
    iget-object v0, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget p0, p0, Lc5;->b:I

    .line 8
    .line 9
    sub-int/2addr v0, p0

    .line 10
    return v0
.end method

.method public final p(II)V
    .locals 7

    .line 1
    iget v0, p0, Lc5;->c:I

    .line 2
    .line 3
    if-le p1, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lc5;->c:I

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p0, Lc5;->b:I

    .line 14
    .line 15
    sub-int/2addr v0, v1

    .line 16
    add-int/2addr v0, p2

    .line 17
    not-int v0, v0

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    add-int/lit8 v1, p1, -0x1

    .line 21
    .line 22
    and-int/2addr v0, v1

    .line 23
    :goto_0
    iget v1, p0, Lc5;->b:I

    .line 24
    .line 25
    add-int v2, v0, p1

    .line 26
    .line 27
    add-int/2addr v2, p2

    .line 28
    const/4 v3, 0x0

    .line 29
    if-ge v1, v2, :cond_4

    .line 30
    .line 31
    iget-object v1, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/nio/Buffer;->capacity()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object v2, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/nio/Buffer;->capacity()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    .line 45
    const/16 v5, 0x400

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const v5, 0x7ffffff7

    .line 49
    .line 50
    .line 51
    if-eq v4, v5, :cond_3

    .line 52
    .line 53
    const/high16 v6, -0x40000000    # -2.0f

    .line 54
    .line 55
    and-int/2addr v6, v4

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    shl-int/lit8 v5, v4, 0x1

    .line 60
    .line 61
    :goto_1
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 62
    .line 63
    .line 64
    iget-object v3, p0, Lc5;->l:Lb5;

    .line 65
    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {v5}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    sget-object v5, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 74
    .line 75
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v5}, Ljava/nio/Buffer;->capacity()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    sub-int/2addr v5, v4

    .line 88
    invoke-virtual {v3, v5}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    .line 94
    iput-object v3, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    iget v2, p0, Lc5;->b:I

    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/nio/Buffer;->capacity()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    sub-int/2addr v3, v1

    .line 103
    add-int/2addr v3, v2

    .line 104
    iput v3, p0, Lc5;->b:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    new-instance p0, Ljava/lang/AssertionError;

    .line 108
    .line 109
    const-string p1, "FlatBuffers: cannot grow buffer beyond 2 gigabytes."

    .line 110
    .line 111
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    throw p0

    .line 115
    :cond_4
    move p1, v3

    .line 116
    :goto_2
    if-ge p1, v0, :cond_5

    .line 117
    .line 118
    iget-object p2, p0, Lc5;->a:Ljava/nio/ByteBuffer;

    .line 119
    .line 120
    iget v1, p0, Lc5;->b:I

    .line 121
    .line 122
    add-int/lit8 v1, v1, -0x1

    .line 123
    .line 124
    iput v1, p0, Lc5;->b:I

    .line 125
    .line 126
    invoke-virtual {p2, v1, v3}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 127
    .line 128
    .line 129
    add-int/lit8 p1, p1, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    return-void
.end method

.method public final q(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc5;->d:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Lc5;->o()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    aput p0, v0, p1

    .line 8
    .line 9
    return-void
.end method

.method public final r(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lc5;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lc5;->d:[I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    array-length v0, v0

    .line 10
    if-ge v0, p1, :cond_1

    .line 11
    .line 12
    :cond_0
    new-array v0, p1, [I

    .line 13
    .line 14
    iput-object v0, p0, Lc5;->d:[I

    .line 15
    .line 16
    :cond_1
    iput p1, p0, Lc5;->e:I

    .line 17
    .line 18
    iget-object v0, p0, Lc5;->d:[I

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1, p1, v1}, Ljava/util/Arrays;->fill([IIII)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    iput-boolean p1, p0, Lc5;->f:Z

    .line 26
    .line 27
    invoke-virtual {p0}, Lc5;->o()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lc5;->h:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    new-instance p0, Ljava/lang/AssertionError;

    .line 35
    .line 36
    const-string p1, "FlatBuffers: object serialization must not be nested."

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    throw p0
.end method

.method public final s(III)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lc5;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput p2, p0, Lc5;->k:I

    .line 6
    .line 7
    mul-int/2addr p1, p2

    .line 8
    const/4 p2, 0x4

    .line 9
    invoke-virtual {p0, p2, p1}, Lc5;->p(II)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p3, p1}, Lc5;->p(II)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lc5;->f:Z

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 20
    .line 21
    const-string p1, "FlatBuffers: object serialization must not be nested."

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method
