.class public final Lxhss/ᲁᛸᛵᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲀᛶᛷᛳ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

.field public ᲇᛴᲇᛵ:Z


# direct methods
.method public constructor <init>(Lxhss/ᲇᲁᲀᲇ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 5
    .line 6
    new-instance p1, Lxhss/ᛴᛲᛴᛶ;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ:Z

    .line 7
    .line 8
    iget-object v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 14
    .line 15
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 16
    .line 17
    invoke-virtual {p0, v0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᛴᲈ(J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final isOpen()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 2
    .line 3
    iget-wide v1, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 4
    .line 5
    const-wide/16 v3, 0x0

    .line 6
    .line 7
    cmp-long v1, v1, v3

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 12
    .line 13
    const-wide/16 v1, 0x2000

    .line 14
    .line 15
    invoke-interface {p0, v1, v2, v0}, Lxhss/ᲇᲁᲀᲇ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/16 v3, -0x1

    .line 20
    .line 21
    cmp-long p0, v1, v3

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, -0x1

    .line 26
    return p0

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Lxhss/ᛴᛲᛴᛶ;->read(Ljava/nio/ByteBuffer;)I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()Z
    .locals 6

    .line 1
    iget-boolean v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 7
    .line 8
    invoke-virtual {v0}, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 15
    .line 16
    const-wide/16 v2, 0x2000

    .line 17
    .line 18
    invoke-interface {p0, v2, v3, v0}, Lxhss/ᲇᲁᲀᲇ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/16 v4, -0x1

    .line 23
    .line 24
    cmp-long p0, v2, v4

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v1

    .line 31
    :cond_1
    const-string p0, "closed"

    .line 32
    .line 33
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return v1
.end method

.method public final ᛳᲁᲇᛸ(BJJ)J
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p4

    .line 6
    .line 7
    iget-boolean v4, v0, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ:Z

    .line 8
    .line 9
    const-wide/16 v5, 0x0

    .line 10
    .line 11
    if-nez v4, :cond_12

    .line 12
    .line 13
    cmp-long v4, v5, v2

    .line 14
    .line 15
    if-gtz v4, :cond_11

    .line 16
    .line 17
    move-wide v7, v5

    .line 18
    :goto_0
    cmp-long v4, v7, v2

    .line 19
    .line 20
    if-gez v4, :cond_f

    .line 21
    .line 22
    cmp-long v4, v5, v7

    .line 23
    .line 24
    iget-object v11, v0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 25
    .line 26
    if-gtz v4, :cond_e

    .line 27
    .line 28
    cmp-long v4, v7, v2

    .line 29
    .line 30
    if-gtz v4, :cond_e

    .line 31
    .line 32
    iget-wide v12, v11, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 33
    .line 34
    cmp-long v4, v2, v12

    .line 35
    .line 36
    if-lez v4, :cond_0

    .line 37
    .line 38
    move-wide v14, v12

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move-wide v14, v2

    .line 41
    :goto_1
    cmp-long v4, v7, v14

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    :goto_2
    move-wide/from16 p2, v5

    .line 46
    .line 47
    :cond_1
    const-wide/16 v16, -0x1

    .line 48
    .line 49
    goto/16 :goto_9

    .line 50
    .line 51
    :cond_2
    iget-object v4, v11, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 52
    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    sub-long v16, v12, v7

    .line 57
    .line 58
    cmp-long v16, v16, v7

    .line 59
    .line 60
    if-gez v16, :cond_7

    .line 61
    .line 62
    :goto_3
    cmp-long v16, v12, v7

    .line 63
    .line 64
    if-lez v16, :cond_4

    .line 65
    .line 66
    iget-object v4, v4, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 67
    .line 68
    move-wide/from16 p2, v5

    .line 69
    .line 70
    iget v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 71
    .line 72
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 73
    .line 74
    sub-int/2addr v5, v6

    .line 75
    int-to-long v5, v5

    .line 76
    sub-long/2addr v12, v5

    .line 77
    move-wide/from16 v5, p2

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    move-wide/from16 p2, v5

    .line 81
    .line 82
    move-wide v5, v7

    .line 83
    :goto_4
    cmp-long v16, v12, v14

    .line 84
    .line 85
    if-gez v16, :cond_1

    .line 86
    .line 87
    const-wide/16 v16, -0x1

    .line 88
    .line 89
    iget-object v9, v4, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 90
    .line 91
    iget v10, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 92
    .line 93
    move-wide/from16 v18, v5

    .line 94
    .line 95
    int-to-long v5, v10

    .line 96
    iget v10, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 97
    .line 98
    move-object/from16 v20, v9

    .line 99
    .line 100
    int-to-long v9, v10

    .line 101
    add-long/2addr v9, v14

    .line 102
    sub-long/2addr v9, v12

    .line 103
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v5

    .line 107
    long-to-int v5, v5

    .line 108
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 109
    .line 110
    int-to-long v9, v6

    .line 111
    add-long v9, v9, v18

    .line 112
    .line 113
    sub-long/2addr v9, v12

    .line 114
    long-to-int v6, v9

    .line 115
    :goto_5
    if-ge v6, v5, :cond_6

    .line 116
    .line 117
    aget-byte v9, v20, v6

    .line 118
    .line 119
    if-ne v9, v1, :cond_5

    .line 120
    .line 121
    iget v4, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 122
    .line 123
    sub-int/2addr v6, v4

    .line 124
    int-to-long v4, v6

    .line 125
    add-long/2addr v4, v12

    .line 126
    goto :goto_a

    .line 127
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_6
    iget v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 131
    .line 132
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 133
    .line 134
    sub-int/2addr v5, v6

    .line 135
    int-to-long v5, v5

    .line 136
    add-long/2addr v5, v12

    .line 137
    iget-object v4, v4, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 138
    .line 139
    move-wide v12, v5

    .line 140
    goto :goto_4

    .line 141
    :cond_7
    move-wide/from16 p2, v5

    .line 142
    .line 143
    const-wide/16 v16, -0x1

    .line 144
    .line 145
    :goto_6
    iget v9, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 146
    .line 147
    iget v10, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 148
    .line 149
    sub-int/2addr v9, v10

    .line 150
    int-to-long v9, v9

    .line 151
    add-long/2addr v9, v5

    .line 152
    cmp-long v12, v9, v7

    .line 153
    .line 154
    if-gtz v12, :cond_8

    .line 155
    .line 156
    iget-object v4, v4, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 157
    .line 158
    move-wide v5, v9

    .line 159
    goto :goto_6

    .line 160
    :cond_8
    move-wide v9, v7

    .line 161
    :goto_7
    cmp-long v12, v5, v14

    .line 162
    .line 163
    if-gez v12, :cond_b

    .line 164
    .line 165
    iget-object v12, v4, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 166
    .line 167
    iget v13, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 168
    .line 169
    move-wide/from16 v18, v5

    .line 170
    .line 171
    int-to-long v5, v13

    .line 172
    iget v13, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 173
    .line 174
    move-wide/from16 v20, v9

    .line 175
    .line 176
    int-to-long v9, v13

    .line 177
    add-long/2addr v9, v14

    .line 178
    sub-long v9, v9, v18

    .line 179
    .line 180
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 181
    .line 182
    .line 183
    move-result-wide v5

    .line 184
    long-to-int v5, v5

    .line 185
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 186
    .line 187
    int-to-long v9, v6

    .line 188
    add-long v9, v9, v20

    .line 189
    .line 190
    sub-long v9, v9, v18

    .line 191
    .line 192
    long-to-int v6, v9

    .line 193
    :goto_8
    if-ge v6, v5, :cond_a

    .line 194
    .line 195
    aget-byte v9, v12, v6

    .line 196
    .line 197
    if-ne v9, v1, :cond_9

    .line 198
    .line 199
    iget v4, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 200
    .line 201
    sub-int/2addr v6, v4

    .line 202
    int-to-long v4, v6

    .line 203
    add-long v4, v4, v18

    .line 204
    .line 205
    goto :goto_a

    .line 206
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :cond_a
    iget v5, v4, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 210
    .line 211
    iget v6, v4, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 212
    .line 213
    sub-int/2addr v5, v6

    .line 214
    int-to-long v5, v5

    .line 215
    add-long v9, v18, v5

    .line 216
    .line 217
    iget-object v4, v4, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 218
    .line 219
    move-wide v5, v9

    .line 220
    goto :goto_7

    .line 221
    :cond_b
    :goto_9
    move-wide/from16 v4, v16

    .line 222
    .line 223
    :goto_a
    cmp-long v6, v4, v16

    .line 224
    .line 225
    if-eqz v6, :cond_c

    .line 226
    .line 227
    return-wide v4

    .line 228
    :cond_c
    iget-wide v4, v11, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 229
    .line 230
    cmp-long v6, v4, v2

    .line 231
    .line 232
    if-gez v6, :cond_10

    .line 233
    .line 234
    iget-object v6, v0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 235
    .line 236
    const-wide/16 v9, 0x2000

    .line 237
    .line 238
    invoke-interface {v6, v9, v10, v11}, Lxhss/ᲇᲁᲀᲇ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 239
    .line 240
    .line 241
    move-result-wide v9

    .line 242
    cmp-long v6, v9, v16

    .line 243
    .line 244
    if-nez v6, :cond_d

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_d
    invoke-static {v7, v8, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 248
    .line 249
    .line 250
    move-result-wide v7

    .line 251
    move-wide/from16 v5, p2

    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :cond_e
    iget-wide v0, v11, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 256
    .line 257
    new-instance v4, Ljava/lang/StringBuilder;

    .line 258
    .line 259
    const-string v5, "size="

    .line 260
    .line 261
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    const-string v0, " fromIndex="

    .line 268
    .line 269
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    const-string v0, " toIndex="

    .line 276
    .line 277
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw v1

    .line 297
    :cond_f
    const-wide/16 v16, -0x1

    .line 298
    .line 299
    :cond_10
    :goto_b
    return-wide v16

    .line 300
    :cond_11
    move-wide/from16 p2, v5

    .line 301
    .line 302
    const-string v0, "fromIndex=0 toIndex="

    .line 303
    .line 304
    invoke-static {v0, v2, v3}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 305
    .line 306
    .line 307
    return-wide p2

    .line 308
    :cond_12
    move-wide/from16 p2, v5

    .line 309
    .line 310
    const-string v0, "closed"

    .line 311
    .line 312
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    return-wide p2
.end method

.method public final ᛳᲈᲈᛲ(J)Z
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-ltz v0, :cond_3

    .line 7
    .line 8
    iget-boolean v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ:Z

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 13
    .line 14
    iget-wide v2, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 15
    .line 16
    cmp-long v2, v2, p1

    .line 17
    .line 18
    if-gez v2, :cond_1

    .line 19
    .line 20
    iget-object v2, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 21
    .line 22
    const-wide/16 v3, 0x2000

    .line 23
    .line 24
    invoke-interface {v2, v3, v4, v0}, Lxhss/ᲇᲁᲀᲇ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide/16 v4, -0x1

    .line 29
    .line 30
    cmp-long v0, v2, v4

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    const-string p0, "closed"

    .line 38
    .line 39
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return v1

    .line 43
    :cond_3
    const-string p0, "byteCount < 0: "

    .line 44
    .line 45
    invoke-static {p0, p1, p2}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 46
    .line 47
    .line 48
    return v1
.end method

.method public final ᛶᲇᲈᛸ(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lxhss/ᲁᛸᛵᛳ;->ᛳᲈᲈᛲ(J)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 2
    .line 3
    invoke-interface {p0}, Lxhss/ᲇᲁᲀᲇ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛷᲁᲁ()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᲈᛶ()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    const/high16 v0, -0x1000000

    .line 13
    .line 14
    and-int/2addr v0, p0

    .line 15
    ushr-int/lit8 v0, v0, 0x18

    .line 16
    .line 17
    const/high16 v1, 0xff0000

    .line 18
    .line 19
    and-int/2addr v1, p0

    .line 20
    ushr-int/lit8 v1, v1, 0x8

    .line 21
    .line 22
    or-int/2addr v0, v1

    .line 23
    const v1, 0xff00

    .line 24
    .line 25
    .line 26
    and-int/2addr v1, p0

    .line 27
    shl-int/lit8 v1, v1, 0x8

    .line 28
    .line 29
    or-int/2addr v0, v1

    .line 30
    and-int/lit16 p0, p0, 0xff

    .line 31
    .line 32
    shl-int/lit8 p0, p0, 0x18

    .line 33
    .line 34
    or-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final ᛸᛲᲀᛵ()I
    .locals 2

    .line 1
    const-wide/16 v0, 0x4

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᲈᛶ()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-ltz v2, :cond_3

    .line 6
    .line 7
    iget-boolean v3, p0, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ:Z

    .line 8
    .line 9
    if-nez v3, :cond_2

    .line 10
    .line 11
    iget-object v3, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 12
    .line 13
    iget-wide v4, v3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 14
    .line 15
    cmp-long v4, v4, v0

    .line 16
    .line 17
    if-nez v4, :cond_1

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    return-wide v0

    .line 22
    :cond_0
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 23
    .line 24
    const-wide/16 v0, 0x2000

    .line 25
    .line 26
    invoke-interface {p0, v0, v1, v3}, Lxhss/ᲇᲁᲀᲇ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const-wide/16 v4, -0x1

    .line 31
    .line 32
    cmp-long p0, v0, v4

    .line 33
    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    return-wide v4

    .line 37
    :cond_1
    iget-wide v0, v3, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 38
    .line 39
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide p0

    .line 43
    invoke-virtual {v3, p0, p1, p3}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    return-wide p0

    .line 48
    :cond_2
    const-string p0, "closed"

    .line 49
    .line 50
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-wide v0

    .line 54
    :cond_3
    const-string p0, "byteCount < 0: "

    .line 55
    .line 56
    invoke-static {p0, p1, p2}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 57
    .line 58
    .line 59
    return-wide v0
.end method

.method public final ᛸᛶᛴᲈ(J)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᲇᛴᲇᛵ:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    :goto_0
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    cmp-long v2, p1, v0

    .line 8
    .line 9
    if-lez v2, :cond_2

    .line 10
    .line 11
    iget-object v2, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 12
    .line 13
    iget-wide v3, v2, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 14
    .line 15
    cmp-long v0, v3, v0

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 20
    .line 21
    const-wide/16 v3, 0x2000

    .line 22
    .line 23
    invoke-interface {v0, v3, v4, v2}, Lxhss/ᲇᲁᲀᲇ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    const-wide/16 v3, -0x1

    .line 28
    .line 29
    cmp-long v0, v0, v3

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p0

    .line 40
    :cond_1
    :goto_1
    iget-wide v0, v2, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 41
    .line 42
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    invoke-virtual {v2, v0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛶᛴᲈ(J)V

    .line 47
    .line 48
    .line 49
    sub-long/2addr p1, v0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    return-void

    .line 52
    :cond_3
    const-string p0, "closed"

    .line 53
    .line 54
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final ᛸᛶᲈᛶ()S
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛸᛳᲁ()S

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final ᲀᲇᛳᲁ(J)Lxhss/ᛳᛶᲈᲈ;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛲᲀᛵ(J)Lxhss/ᛳᛶᲈᲈ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final ᲇᛴᲇᛵ()B
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 7
    .line 8
    invoke-virtual {p0}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛴᲇᛵ()B

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final ᲇᛶᛴᲀ()[B
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lxhss/ᛴᛲᛴᛶ;->ᲈᛲᛵᲁ(Lxhss/ᲇᲁᲀᲇ;)V

    .line 6
    .line 7
    .line 8
    iget-wide v0, p0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Lxhss/ᛴᛲᛴᛶ;->ᲀᲇᛳᲁ(J)[B

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final ᲇᛸᛳᲁ(J)Ljava/lang/String;
    .locals 21

    .line 1
    move-wide/from16 v6, p1

    .line 2
    .line 3
    const-wide/16 v8, 0x0

    .line 4
    .line 5
    cmp-long v0, v6, v8

    .line 6
    .line 7
    if-ltz v0, :cond_6

    .line 8
    .line 9
    const-wide v10, 0x7fffffffffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, v6, v10

    .line 15
    .line 16
    const-wide/16 v12, 0x1

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    move-wide v4, v10

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    add-long v0, v6, v12

    .line 23
    .line 24
    move-wide v4, v0

    .line 25
    :goto_0
    const/16 v1, 0xa

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    move-object/from16 v0, p0

    .line 30
    .line 31
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ(BJJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    const-wide/16 v14, -0x1

    .line 36
    .line 37
    cmp-long v3, v1, v14

    .line 38
    .line 39
    iget-object v14, v0, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 40
    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    invoke-static {v1, v2, v14}, Lxhss/ᛱᛱᛲᲇ;->ᛷᛵᛵᲈ(JLxhss/ᛴᛲᛴᛶ;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :cond_1
    cmp-long v1, v4, v10

    .line 49
    .line 50
    if-gez v1, :cond_2

    .line 51
    .line 52
    invoke-virtual {v0, v4, v5}, Lxhss/ᲁᛸᛵᛳ;->ᛳᲈᲈᛲ(J)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    sub-long v1, v4, v12

    .line 59
    .line 60
    invoke-virtual {v14, v1, v2}, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ(J)B

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/16 v2, 0xd

    .line 65
    .line 66
    if-ne v1, v2, :cond_2

    .line 67
    .line 68
    add-long v1, v4, v12

    .line 69
    .line 70
    invoke-virtual {v0, v1, v2}, Lxhss/ᲁᛸᛵᛳ;->ᛳᲈᲈᛲ(J)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {v14, v4, v5}, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ(J)B

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/16 v1, 0xa

    .line 81
    .line 82
    if-ne v0, v1, :cond_2

    .line 83
    .line 84
    invoke-static {v4, v5, v14}, Lxhss/ᛱᛱᛲᲇ;->ᛷᛵᛵᲈ(JLxhss/ᛴᛲᛴᛶ;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_2
    new-instance v0, Lxhss/ᛴᛲᛴᛶ;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-wide v1, v14, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 95
    .line 96
    const-wide/16 v3, 0x20

    .line 97
    .line 98
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v19

    .line 102
    iget-wide v1, v14, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 103
    .line 104
    const-wide/16 v17, 0x0

    .line 105
    .line 106
    move-wide v15, v1

    .line 107
    invoke-static/range {v15 .. v20}, Lxhss/ᛷᛸᲀᲀ;->ᛸᛷᲈᲈ(JJJ)V

    .line 108
    .line 109
    .line 110
    cmp-long v1, v19, v8

    .line 111
    .line 112
    if-eqz v1, :cond_5

    .line 113
    .line 114
    iget-wide v1, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 115
    .line 116
    add-long v1, v1, v19

    .line 117
    .line 118
    iput-wide v1, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 119
    .line 120
    iget-object v1, v14, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 121
    .line 122
    :goto_1
    iget v2, v1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 123
    .line 124
    iget v3, v1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 125
    .line 126
    sub-int/2addr v2, v3

    .line 127
    int-to-long v2, v2

    .line 128
    cmp-long v4, v17, v2

    .line 129
    .line 130
    if-ltz v4, :cond_3

    .line 131
    .line 132
    sub-long v17, v17, v2

    .line 133
    .line 134
    iget-object v1, v1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_3
    move-wide/from16 v2, v17

    .line 138
    .line 139
    move-wide/from16 v4, v19

    .line 140
    .line 141
    :goto_2
    cmp-long v10, v4, v8

    .line 142
    .line 143
    if-lez v10, :cond_5

    .line 144
    .line 145
    invoke-virtual {v1}, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ()Lxhss/ᛲᛳᲁᛳ;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    iget v11, v10, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 150
    .line 151
    long-to-int v2, v2

    .line 152
    add-int/2addr v11, v2

    .line 153
    iput v11, v10, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 154
    .line 155
    long-to-int v2, v4

    .line 156
    add-int/2addr v11, v2

    .line 157
    iget v2, v10, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 158
    .line 159
    invoke-static {v11, v2}, Ljava/lang/Math;->min(II)I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    iput v2, v10, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 164
    .line 165
    iget-object v2, v0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 166
    .line 167
    if-nez v2, :cond_4

    .line 168
    .line 169
    iput-object v10, v10, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 170
    .line 171
    iput-object v10, v10, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 172
    .line 173
    iput-object v10, v0, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_4
    iget-object v2, v2, Lxhss/ᛲᛳᲁᛳ;->ᲀᲇᛳᲁ:Lxhss/ᛲᛳᲁᛳ;

    .line 177
    .line 178
    invoke-virtual {v2, v10}, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ(Lxhss/ᛲᛳᲁᛳ;)V

    .line 179
    .line 180
    .line 181
    :goto_3
    iget v2, v10, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 182
    .line 183
    iget v3, v10, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 184
    .line 185
    sub-int/2addr v2, v3

    .line 186
    int-to-long v2, v2

    .line 187
    sub-long/2addr v4, v2

    .line 188
    iget-object v1, v1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 189
    .line 190
    move-wide v2, v8

    .line 191
    goto :goto_2

    .line 192
    :cond_5
    new-instance v1, Ljava/io/EOFException;

    .line 193
    .line 194
    iget-wide v2, v14, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 195
    .line 196
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 197
    .line 198
    .line 199
    move-result-wide v2

    .line 200
    iget-wide v4, v0, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 201
    .line 202
    invoke-virtual {v0, v4, v5}, Lxhss/ᛴᛲᛴᛶ;->ᛸᛲᲀᛵ(J)Lxhss/ᛳᛶᲈᲈ;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Lxhss/ᛳᛶᲈᲈ;->ᛱᛱᛲᲇ()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    new-instance v4, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v5, "\\n not found: limit="

    .line 213
    .line 214
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v2, " content="

    .line 221
    .line 222
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const/16 v0, 0x2026

    .line 229
    .line 230
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-direct {v1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v1

    .line 241
    :cond_6
    const-string v0, "limit < 0: "

    .line 242
    .line 243
    invoke-static {v0, v6, v7}, Lxhss/ᛵᲈᲁᲈ;->ᛷᲁᲁ(Ljava/lang/String;J)V

    .line 244
    .line 245
    .line 246
    const/4 v0, 0x0

    .line 247
    return-object v0
.end method

.method public final ᲈᛳᲀ()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᲀᲈᲈ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lxhss/ᲀᲈᲈ;-><init>(Lxhss/ᲀᛶᛷᛳ;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
