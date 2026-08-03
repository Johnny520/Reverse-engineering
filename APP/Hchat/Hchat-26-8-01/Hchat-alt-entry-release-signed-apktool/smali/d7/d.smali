.class public final Ld7/d;
.super Ld7/g;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public t:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lc7/g;->h:Lc7/g;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/16 v2, 0x2e

    .line 6
    .line 7
    invoke-direct {p0, v2, v0, v1}, Ld7/g;-><init>(ILc7/g;I)V

    .line 8
    .line 9
    .line 10
    const v0, 0x81a4

    .line 11
    .line 12
    .line 13
    const/16 v1, 0x28

    .line 14
    .line 15
    invoke-virtual {p0, v1, v0}, Ld7/s;->R(II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final W()I
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld7/s;->O(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f0()I
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    return v0
.end method

.method public final h0()Z
    .locals 2

    .line 1
    const/16 v0, 0x2a

    .line 2
    .line 3
    iget-object v1, p0, Lr7/b;->k:[B

    .line 4
    .line 5
    invoke-static {v1, v0}, Lk7/a;->s([BI)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final j0()V
    .locals 7

    .line 1
    iget-object v0, p0, Ld7/d;->t:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    array-length v2, v1

    .line 12
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    iget v4, p0, Ld7/g;->o:I

    .line 17
    .line 18
    add-int/2addr v3, v4

    .line 19
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    add-int/2addr v5, v3

    .line 24
    add-int/2addr v5, v2

    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {p0, v5, v3}, Lr7/b;->M(IZ)V

    .line 27
    .line 28
    .line 29
    const/16 v5, 0x20

    .line 30
    .line 31
    invoke-virtual {p0, v5, v2}, Ld7/s;->R(II)V

    .line 32
    .line 33
    .line 34
    if-nez v2, :cond_0

    .line 35
    .line 36
    iput-object v0, p0, Ld7/d;->t:Ljava/lang/String;

    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    iget-object v5, p0, Lr7/b;->k:[B

    .line 40
    .line 41
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    add-int/2addr v6, v4

    .line 46
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    add-int/2addr v4, v6

    .line 51
    invoke-static {v1, v3, v5, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Ld7/d;->t:Ljava/lang/String;

    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public final k0(Ljava/io/InputStream;)I
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ld7/s;->O(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string p1, ""

    .line 11
    .line 12
    iput-object p1, p0, Ld7/d;->t:Ljava/lang/String;

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget v4, p0, Ld7/g;->o:I

    .line 20
    .line 21
    add-int/2addr v3, v4

    .line 22
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    add-int/2addr v5, v3

    .line 27
    add-int/2addr v5, v1

    .line 28
    invoke-virtual {p0, v5, v2}, Lr7/b;->M(IZ)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, Ld7/s;->R(II)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lr7/b;->k:[B

    .line 35
    .line 36
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    add-int/2addr v2, v4

    .line 41
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v3, v2

    .line 46
    invoke-virtual {p1, v0, v3, v1}, Ljava/io/InputStream;->read([BII)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-ne p1, v1, :cond_1

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput-object p1, p0, Ld7/d;->t:Ljava/lang/String;

    .line 54
    .line 55
    return v1

    .line 56
    :cond_1
    const-string v0, "Stream ended before reading comment: read="

    .line 57
    .line 58
    const-string v2, ", name length="

    .line 59
    .line 60
    invoke-static {p1, v0, v2, v1}, Lp/a;->j(ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    return p1
.end method

.method public final n0()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Ld7/d;->t:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lr7/b;->k:[B

    .line 10
    .line 11
    iget v2, p0, Ld7/g;->o:I

    .line 12
    .line 13
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-int/2addr v3, v2

    .line 18
    array-length v2, v1

    .line 19
    sub-int/2addr v2, v3

    .line 20
    if-gtz v2, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-le v0, v2, :cond_1

    .line 26
    .line 27
    move v0, v2

    .line 28
    :cond_1
    new-instance v2, Ljava/lang/String;

    .line 29
    .line 30
    sget-object v4, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 31
    .line 32
    invoke-direct {v2, v1, v3, v0, v4}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 33
    .line 34
    .line 35
    move-object v0, v2

    .line 36
    :goto_0
    iput-object v0, p0, Ld7/d;->t:Ljava/lang/String;

    .line 37
    .line 38
    :cond_2
    iget-object v0, p0, Ld7/d;->t:Ljava/lang/String;

    .line 39
    .line 40
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lr7/b;->p()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Ld7/t;->n:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "Invalid"

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "["

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-wide v1, p0, Ld7/g;->s:J

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const/16 v1, 0x5d

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ld7/g;->a0()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v3, 0x1

    .line 38
    if-lez v2, :cond_1

    .line 39
    .line 40
    const-string v2, "name="

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move v1, v3

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 v1, 0x0

    .line 51
    :goto_0
    invoke-virtual {p0}, Ld7/d;->n0()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const-string v5, ", "

    .line 60
    .line 61
    if-lez v4, :cond_3

    .line 62
    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    :cond_2
    const-string v1, "comment="

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    move v1, v3

    .line 77
    :cond_3
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_4
    const-string v1, "SIG="

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ld7/t;->T()Lc7/g;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", versionMadeBy="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const/4 v1, 0x4

    .line 100
    invoke-virtual {p0, v1}, Ld7/s;->O(I)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    int-to-short v2, v2

    .line 105
    invoke-static {v2}, Ly7/a;->o(S)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v2, ", versionExtract="

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const/4 v2, 0x6

    .line 118
    invoke-virtual {p0, v2}, Ld7/s;->O(I)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    int-to-short v2, v2

    .line 123
    invoke-static {v2}, Ly7/a;->o(S)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v2, ", GP={"

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v2, p0, Ld7/g;->q:La5/a;

    .line 136
    .line 137
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string v2, "}, method="

    .line 141
    .line 142
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Ld7/g;->c0()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v2, ", date="

    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    iget v2, p0, Ld7/g;->p:I

    .line 158
    .line 159
    add-int/2addr v2, v1

    .line 160
    invoke-virtual {p0, v2}, Ld7/s;->N(I)J

    .line 161
    .line 162
    .line 163
    move-result-wide v4

    .line 164
    invoke-static {v3, v4, v5}, Ly7/a;->l(IJ)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    const-string v2, ", crc="

    .line 172
    .line 173
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Ld7/g;->Y()J

    .line 177
    .line 178
    .line 179
    move-result-wide v2

    .line 180
    const/16 v4, 0x8

    .line 181
    .line 182
    invoke-static {v4, v2, v3}, Ly7/a;->l(IJ)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string v2, ", cSize="

    .line 190
    .line 191
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0}, Ld7/g;->X()J

    .line 195
    .line 196
    .line 197
    move-result-wide v2

    .line 198
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    const-string v2, ", size="

    .line 202
    .line 203
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, Ld7/g;->e0()J

    .line 207
    .line 208
    .line 209
    move-result-wide v2

    .line 210
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v2, ", fileNameLength="

    .line 214
    .line 215
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    const-string v2, ", extraLength="

    .line 226
    .line 227
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Ld7/g;->Z()I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    const-string v2, ", commentLength="

    .line 238
    .line 239
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    const/16 v2, 0x20

    .line 243
    .line 244
    invoke-virtual {p0, v2}, Ld7/s;->O(I)I

    .line 245
    .line 246
    .line 247
    move-result v2

    .line 248
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    const-string v2, ", offset="

    .line 252
    .line 253
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {p0}, Ld7/g;->g0()Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_5

    .line 261
    .line 262
    iget v2, p0, Ld7/g;->o:I

    .line 263
    .line 264
    invoke-virtual {p0}, Ld7/g;->b0()I

    .line 265
    .line 266
    .line 267
    move-result v3

    .line 268
    add-int/2addr v3, v2

    .line 269
    add-int/2addr v3, v1

    .line 270
    iget-object v1, p0, Lr7/b;->k:[B

    .line 271
    .line 272
    invoke-static {v1, v3}, Lk7/a;->t([BI)J

    .line 273
    .line 274
    .line 275
    move-result-wide v1

    .line 276
    goto :goto_1

    .line 277
    :cond_5
    const/16 v1, 0x2a

    .line 278
    .line 279
    invoke-virtual {p0, v1}, Ld7/s;->N(I)J

    .line 280
    .line 281
    .line 282
    move-result-wide v1

    .line 283
    :goto_1
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v1, ", internalAttr="

    .line 287
    .line 288
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    const/16 v1, 0x24

    .line 292
    .line 293
    invoke-virtual {p0, v1}, Ld7/s;->O(I)I

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v1, ", externalAttr="

    .line 301
    .line 302
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    iget-object v1, p0, Lr7/b;->k:[B

    .line 306
    .line 307
    const/16 v2, 0x26

    .line 308
    .line 309
    invoke-static {v1, v2}, Lk7/a;->s([BI)I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    invoke-static {v1, v4}, Ly7/a;->k(II)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    const-string v1, ", attrId="

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0, v2}, Ld7/s;->O(I)I

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    const-string v1, ", permissions="

    .line 333
    .line 334
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    new-instance v1, Ld7/c;

    .line 338
    .line 339
    invoke-direct {v1, p0}, Ld7/c;-><init>(Ld7/d;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    return-object v0
.end method
