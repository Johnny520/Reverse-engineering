.class public final Lxhss/ᲈᛱᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲇᲁᲀᲇ;


# instance fields
.field public ᛱᛱᛲᲇ:B

.field public final ᛳᲁᲇᛸ:Lxhss/ᲁᛸᛵᛳ;

.field public final ᛷᛴᛷᛱ:Lxhss/ᲇᛷᛵᲀ;

.field public final ᲇᛴᲇᛵ:Ljava/util/zip/Inflater;

.field public final ᲇᛶᛴᲀ:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Lxhss/ᲀᛶᛷᛳ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᲁᛸᛵᛳ;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lxhss/ᲁᛸᛵᛳ;-><init>(Lxhss/ᲇᲁᲀᲇ;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛸᛵᛳ;

    .line 10
    .line 11
    new-instance p1, Ljava/util/zip/Inflater;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lxhss/ᲈᛱᛴ;->ᲇᛴᲇᛵ:Ljava/util/zip/Inflater;

    .line 18
    .line 19
    new-instance v1, Lxhss/ᲇᛷᛵᲀ;

    .line 20
    .line 21
    invoke-direct {v1, v0, p1}, Lxhss/ᲇᛷᛵᲀ;-><init>(Lxhss/ᲁᛸᛵᛳ;Ljava/util/zip/Inflater;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lxhss/ᲈᛱᛴ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛷᛵᲀ;

    .line 25
    .line 26
    new-instance p1, Ljava/util/zip/CRC32;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lxhss/ᲈᛱᛴ;->ᲇᛶᛴᲀ:Ljava/util/zip/CRC32;

    .line 32
    .line 33
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/String;II)V
    .locals 2

    .line 1
    if-ne p2, p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 5
    .line 6
    invoke-static {p2}, Lxhss/ᛷᛸᲀᲀ;->ᛵᛲᲁᛶ(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p2}, Lxhss/ᛲᛱᛲᲀ;->ᛲᛵᲁᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p1}, Lxhss/ᛷᛸᲀᲀ;->ᛵᛲᲁᛶ(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lxhss/ᛲᛱᛲᲀ;->ᛲᛵᲁᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p0, ": actual 0x"

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " != expected 0x"

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᛱᛴ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛷᛵᲀ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᲇᛷᛵᲀ;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛴᛲᛴᛶ;JJ)V
    .locals 4

    .line 1
    iget-object p1, p1, Lxhss/ᛴᛲᛴᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛲᛳᲁᛳ;

    .line 2
    .line 3
    :goto_0
    iget v0, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 4
    .line 5
    iget v1, p1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    int-to-long v0, v0

    .line 9
    cmp-long v2, p2, v0

    .line 10
    .line 11
    if-ltz v2, :cond_0

    .line 12
    .line 13
    sub-long/2addr p2, v0

    .line 14
    iget-object p1, p1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    cmp-long v2, p4, v0

    .line 20
    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    iget v2, p1, Lxhss/ᛲᛳᲁᛳ;->ᛱᛱᛲᲇ:I

    .line 24
    .line 25
    int-to-long v2, v2

    .line 26
    add-long/2addr v2, p2

    .line 27
    long-to-int p2, v2

    .line 28
    iget p3, p1, Lxhss/ᛲᛳᲁᛳ;->ᛳᲁᲇᛸ:I

    .line 29
    .line 30
    sub-int/2addr p3, p2

    .line 31
    int-to-long v2, p3

    .line 32
    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    long-to-int p3, v2

    .line 37
    iget-object v2, p0, Lxhss/ᲈᛱᛴ;->ᲇᛶᛴᲀ:Ljava/util/zip/CRC32;

    .line 38
    .line 39
    iget-object v3, p1, Lxhss/ᛲᛳᲁᛳ;->ᛷᛵᛵᲈ:[B

    .line 40
    .line 41
    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 42
    .line 43
    .line 44
    int-to-long p2, p3

    .line 45
    sub-long/2addr p4, p2

    .line 46
    iget-object p1, p1, Lxhss/ᛲᛳᲁᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛲᛳᲁᛳ;

    .line 47
    .line 48
    move-wide p2, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛸᛵᛳ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲁᲀᲇ;

    .line 4
    .line 5
    invoke-interface {p0}, Lxhss/ᲇᲁᲀᲇ;->ᛷᛵᛵᲈ()Lxhss/ᛲᲁᲈᛲ;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p3

    .line 4
    .line 5
    iget-object v7, v0, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛸᛵᛳ;

    .line 6
    .line 7
    iget-object v1, v7, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛲᛴᛶ;

    .line 8
    .line 9
    iget-byte v2, v0, Lxhss/ᲈᛱᛴ;->ᛱᛱᛲᲇ:B

    .line 10
    .line 11
    iget-object v8, v0, Lxhss/ᲈᛱᛴ;->ᲇᛶᛴᲀ:Ljava/util/zip/CRC32;

    .line 12
    .line 13
    const/4 v9, 0x1

    .line 14
    if-nez v2, :cond_c

    .line 15
    .line 16
    const-wide/16 v2, 0xa

    .line 17
    .line 18
    invoke-virtual {v7, v2, v3}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 19
    .line 20
    .line 21
    const-wide/16 v2, 0x3

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ(J)B

    .line 24
    .line 25
    .line 26
    move-result v12

    .line 27
    shr-int/lit8 v2, v12, 0x1

    .line 28
    .line 29
    and-int/2addr v2, v9

    .line 30
    if-ne v2, v9, :cond_0

    .line 31
    .line 32
    move v13, v9

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v2, 0x0

    .line 35
    move v13, v2

    .line 36
    :goto_0
    if-eqz v13, :cond_1

    .line 37
    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    const-wide/16 v4, 0xa

    .line 41
    .line 42
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛴᛲᛴᛶ;JJ)V

    .line 43
    .line 44
    .line 45
    :cond_1
    invoke-virtual {v7}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᲈᛶ()S

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    const-string v2, "ID1ID2"

    .line 50
    .line 51
    const/16 v3, 0x1f8b

    .line 52
    .line 53
    invoke-static {v2, v3, v0}, Lxhss/ᲈᛱᛴ;->ᛱᛱᛲᲇ(Ljava/lang/String;II)V

    .line 54
    .line 55
    .line 56
    const-wide/16 v2, 0x8

    .line 57
    .line 58
    invoke-virtual {v7, v2, v3}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 59
    .line 60
    .line 61
    shr-int/lit8 v0, v12, 0x2

    .line 62
    .line 63
    and-int/2addr v0, v9

    .line 64
    const v14, 0xff00

    .line 65
    .line 66
    .line 67
    const-wide/16 v2, 0x2

    .line 68
    .line 69
    if-ne v0, v9, :cond_4

    .line 70
    .line 71
    invoke-virtual {v7, v2, v3}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 72
    .line 73
    .line 74
    if-eqz v13, :cond_2

    .line 75
    .line 76
    move-wide v4, v2

    .line 77
    const-wide/16 v2, 0x0

    .line 78
    .line 79
    move-wide v15, v4

    .line 80
    const-wide/16 v4, 0x2

    .line 81
    .line 82
    const-wide/16 p1, -0x1

    .line 83
    .line 84
    move-object/from16 v0, p0

    .line 85
    .line 86
    move-wide v10, v15

    .line 87
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛴᛲᛴᛶ;JJ)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    move-wide v10, v2

    .line 92
    const-wide/16 p1, -0x1

    .line 93
    .line 94
    :goto_1
    invoke-virtual {v1}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛸᛳᲁ()S

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    and-int v2, v0, v14

    .line 99
    .line 100
    ushr-int/lit8 v2, v2, 0x8

    .line 101
    .line 102
    and-int/lit16 v0, v0, 0xff

    .line 103
    .line 104
    shl-int/lit8 v0, v0, 0x8

    .line 105
    .line 106
    or-int/2addr v0, v2

    .line 107
    int-to-short v0, v0

    .line 108
    const v2, 0xffff

    .line 109
    .line 110
    .line 111
    and-int/2addr v0, v2

    .line 112
    int-to-long v4, v0

    .line 113
    invoke-virtual {v7, v4, v5}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 114
    .line 115
    .line 116
    if-eqz v13, :cond_3

    .line 117
    .line 118
    const-wide/16 v2, 0x0

    .line 119
    .line 120
    move-object/from16 v0, p0

    .line 121
    .line 122
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛴᛲᛴᛶ;JJ)V

    .line 123
    .line 124
    .line 125
    :cond_3
    move-object v15, v1

    .line 126
    invoke-virtual {v7, v4, v5}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    move-object v15, v1

    .line 131
    move-wide v10, v2

    .line 132
    const-wide/16 p1, -0x1

    .line 133
    .line 134
    :goto_2
    shr-int/lit8 v0, v12, 0x3

    .line 135
    .line 136
    and-int/2addr v0, v9

    .line 137
    const-wide/16 v16, 0x1

    .line 138
    .line 139
    if-ne v0, v9, :cond_7

    .line 140
    .line 141
    const-wide/16 v2, 0x0

    .line 142
    .line 143
    const-wide v4, 0x7fffffffffffffffL

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    const/4 v1, 0x0

    .line 149
    move-object v0, v7

    .line 150
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ(BJJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v18

    .line 154
    cmp-long v0, v18, p1

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    if-eqz v13, :cond_5

    .line 159
    .line 160
    const-wide/16 v2, 0x0

    .line 161
    .line 162
    add-long v4, v18, v16

    .line 163
    .line 164
    move-object/from16 v0, p0

    .line 165
    .line 166
    move-object v1, v15

    .line 167
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛴᛲᛴᛶ;JJ)V

    .line 168
    .line 169
    .line 170
    :cond_5
    add-long v0, v18, v16

    .line 171
    .line 172
    invoke-virtual {v7, v0, v1}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 173
    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_6
    new-instance v0, Ljava/io/EOFException;

    .line 177
    .line 178
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 179
    .line 180
    .line 181
    throw v0

    .line 182
    :cond_7
    :goto_3
    shr-int/lit8 v0, v12, 0x4

    .line 183
    .line 184
    and-int/2addr v0, v9

    .line 185
    if-ne v0, v9, :cond_a

    .line 186
    .line 187
    const-wide/16 v2, 0x0

    .line 188
    .line 189
    const-wide v4, 0x7fffffffffffffffL

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    const/4 v1, 0x0

    .line 195
    move-object v0, v7

    .line 196
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲁᛸᛵᛳ;->ᛳᲁᲇᛸ(BJJ)J

    .line 197
    .line 198
    .line 199
    move-result-wide v18

    .line 200
    cmp-long v0, v18, p1

    .line 201
    .line 202
    if-eqz v0, :cond_9

    .line 203
    .line 204
    if-eqz v13, :cond_8

    .line 205
    .line 206
    const-wide/16 v2, 0x0

    .line 207
    .line 208
    add-long v4, v18, v16

    .line 209
    .line 210
    move-object/from16 v0, p0

    .line 211
    .line 212
    move-object v1, v15

    .line 213
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛴᛲᛴᛶ;JJ)V

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_8
    move-object/from16 v0, p0

    .line 218
    .line 219
    move-object v1, v15

    .line 220
    :goto_4
    add-long v2, v18, v16

    .line 221
    .line 222
    invoke-virtual {v7, v2, v3}, Lxhss/ᲁᛸᛵᛳ;->ᛸᛶᛴᲈ(J)V

    .line 223
    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_9
    new-instance v0, Ljava/io/EOFException;

    .line 227
    .line 228
    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :cond_a
    move-object/from16 v0, p0

    .line 233
    .line 234
    move-object v1, v15

    .line 235
    :goto_5
    if-eqz v13, :cond_b

    .line 236
    .line 237
    invoke-virtual {v7, v10, v11}, Lxhss/ᲁᛸᛵᛳ;->ᛶᲇᲈᛸ(J)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1}, Lxhss/ᛴᛲᛴᛶ;->ᲇᛸᛳᲁ()S

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    and-int v2, v1, v14

    .line 245
    .line 246
    ushr-int/lit8 v2, v2, 0x8

    .line 247
    .line 248
    and-int/lit16 v1, v1, 0xff

    .line 249
    .line 250
    shl-int/lit8 v1, v1, 0x8

    .line 251
    .line 252
    or-int/2addr v1, v2

    .line 253
    int-to-short v1, v1

    .line 254
    invoke-virtual {v8}, Ljava/util/zip/CRC32;->getValue()J

    .line 255
    .line 256
    .line 257
    move-result-wide v2

    .line 258
    long-to-int v2, v2

    .line 259
    int-to-short v2, v2

    .line 260
    const-string v3, "FHCRC"

    .line 261
    .line 262
    invoke-static {v3, v1, v2}, Lxhss/ᲈᛱᛴ;->ᛱᛱᛲᲇ(Ljava/lang/String;II)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v8}, Ljava/util/zip/CRC32;->reset()V

    .line 266
    .line 267
    .line 268
    :cond_b
    iput-byte v9, v0, Lxhss/ᲈᛱᛴ;->ᛱᛱᛲᲇ:B

    .line 269
    .line 270
    move v2, v9

    .line 271
    goto :goto_6

    .line 272
    :cond_c
    const-wide/16 p1, -0x1

    .line 273
    .line 274
    :goto_6
    const/4 v10, 0x2

    .line 275
    if-ne v2, v9, :cond_e

    .line 276
    .line 277
    iget-wide v2, v6, Lxhss/ᛴᛲᛴᛶ;->ᛳᲁᲇᛸ:J

    .line 278
    .line 279
    iget-object v1, v0, Lxhss/ᲈᛱᛴ;->ᛷᛴᛷᛱ:Lxhss/ᲇᛷᛵᲀ;

    .line 280
    .line 281
    const-wide/16 v4, 0x2000

    .line 282
    .line 283
    invoke-virtual {v1, v4, v5, v6}, Lxhss/ᲇᛷᛵᲀ;->ᛸᛴᛶᛳ(JLxhss/ᛴᛲᛴᛶ;)J

    .line 284
    .line 285
    .line 286
    move-result-wide v4

    .line 287
    cmp-long v1, v4, p1

    .line 288
    .line 289
    if-eqz v1, :cond_d

    .line 290
    .line 291
    move-object v1, v6

    .line 292
    invoke-virtual/range {v0 .. v5}, Lxhss/ᲈᛱᛴ;->ᛳᲁᲇᛸ(Lxhss/ᛴᛲᛴᛶ;JJ)V

    .line 293
    .line 294
    .line 295
    return-wide v4

    .line 296
    :cond_d
    iput-byte v10, v0, Lxhss/ᲈᛱᛴ;->ᛱᛱᛲᲇ:B

    .line 297
    .line 298
    move v2, v10

    .line 299
    :cond_e
    if-ne v2, v10, :cond_10

    .line 300
    .line 301
    invoke-virtual {v7}, Lxhss/ᲁᛸᛵᛳ;->ᛷᲁᲁ()I

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    invoke-virtual {v8}, Ljava/util/zip/CRC32;->getValue()J

    .line 306
    .line 307
    .line 308
    move-result-wide v2

    .line 309
    long-to-int v2, v2

    .line 310
    const-string v3, "CRC"

    .line 311
    .line 312
    invoke-static {v3, v1, v2}, Lxhss/ᲈᛱᛴ;->ᛱᛱᛲᲇ(Ljava/lang/String;II)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v7}, Lxhss/ᲁᛸᛵᛳ;->ᛷᲁᲁ()I

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    iget-object v2, v0, Lxhss/ᲈᛱᛴ;->ᲇᛴᲇᛵ:Ljava/util/zip/Inflater;

    .line 320
    .line 321
    invoke-virtual {v2}, Ljava/util/zip/Inflater;->getBytesWritten()J

    .line 322
    .line 323
    .line 324
    move-result-wide v2

    .line 325
    long-to-int v2, v2

    .line 326
    const-string v3, "ISIZE"

    .line 327
    .line 328
    invoke-static {v3, v1, v2}, Lxhss/ᲈᛱᛴ;->ᛱᛱᛲᲇ(Ljava/lang/String;II)V

    .line 329
    .line 330
    .line 331
    const/4 v1, 0x3

    .line 332
    iput-byte v1, v0, Lxhss/ᲈᛱᛴ;->ᛱᛱᛲᲇ:B

    .line 333
    .line 334
    invoke-virtual {v7}, Lxhss/ᲁᛸᛵᛳ;->ᛱᛱᛲᲇ()Z

    .line 335
    .line 336
    .line 337
    move-result v0

    .line 338
    if-eqz v0, :cond_f

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_f
    const-string v0, "gzip finished without exhausting source"

    .line 342
    .line 343
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    const-wide/16 v0, 0x0

    .line 347
    .line 348
    return-wide v0

    .line 349
    :cond_10
    :goto_7
    return-wide p1
.end method
