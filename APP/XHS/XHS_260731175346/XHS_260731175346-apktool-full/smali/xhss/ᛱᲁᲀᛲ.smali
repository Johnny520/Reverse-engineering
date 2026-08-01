.class public Lxhss/ᛱᲁᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:[I

.field public ᛳᲁᲇᛸ:[I

.field public ᛷᛴᛷᛱ:[I

.field public ᛷᛵᛵᲈ:Lxhss/ᲁᲁᛱᲀ;

.field public ᛸᛲᲀᛵ:[I

.field public ᛸᛴᛶᛳ:I

.field public ᲀᲇᛳᲁ:S

.field public ᲇᛴᲇᛵ:[I

.field public ᲇᛶᛴᲀ:S


# direct methods
.method public constructor <init>(Lxhss/ᲁᲁᛱᲀ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛵᛵᲈ:Lxhss/ᲁᲁᛱᲀ;

    .line 5
    .line 6
    return-void
.end method

.method public static ᛳᲁᲇᛸ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/Object;)I
    .locals 10

    .line 1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/high16 p1, 0x400000

    .line 12
    .line 13
    :goto_0
    or-int/2addr p0, p1

    .line 14
    return p0

    .line 15
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/16 v3, 0x5b

    .line 28
    .line 29
    const/16 v4, 0xc

    .line 30
    .line 31
    if-ne v0, v3, :cond_1

    .line 32
    .line 33
    const/16 v0, 0x9

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v0, v4

    .line 37
    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/16 v5, 0xa

    .line 42
    .line 43
    if-ne v0, v5, :cond_2

    .line 44
    .line 45
    rsub-int/lit8 v0, v1, 0x0

    .line 46
    .line 47
    add-int/2addr v3, v1

    .line 48
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    if-ne v0, v4, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v0, "L"

    .line 60
    .line 61
    const-string v1, ";"

    .line 62
    .line 63
    invoke-static {v0, p1, v1}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_2
    invoke-static {p0, p1, v2}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;I)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    return p0

    .line 77
    :cond_4
    check-cast p1, Lxhss/ᲁᲁᛱᲀ;

    .line 78
    .line 79
    iget-short v0, p1, Lxhss/ᲁᲁᛱᲀ;->ᛷᛵᛵᲈ:S

    .line 80
    .line 81
    and-int/lit8 v0, v0, 0x4

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    const-string v0, ""

    .line 86
    .line 87
    iget p1, p1, Lxhss/ᲁᲁᛱᲀ;->ᲇᛴᲇᛵ:I

    .line 88
    .line 89
    invoke-virtual {p0, v0, p1}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛶᲈᛶ(Ljava/lang/String;I)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    const/high16 p1, 0xc00000

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    iget-object v0, p0, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ:[Lxhss/ᛵᛶᛳ;

    .line 97
    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    const/16 v0, 0x10

    .line 101
    .line 102
    new-array v3, v0, [Lxhss/ᛵᛶᛳ;

    .line 103
    .line 104
    iput-object v3, p0, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ:[Lxhss/ᛵᛶᛳ;

    .line 105
    .line 106
    new-array v0, v0, [Lxhss/ᛵᛶᛳ;

    .line 107
    .line 108
    iput-object v0, p0, Lxhss/ᲇᲇᲈᛷ;->ᛸᛶᲈᛶ:[Lxhss/ᛵᛶᛳ;

    .line 109
    .line 110
    :cond_6
    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-object v3, p0, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ:[Lxhss/ᛵᛶᛳ;

    .line 115
    .line 116
    array-length v4, v3

    .line 117
    rem-int v4, v0, v4

    .line 118
    .line 119
    aget-object v3, v3, v4

    .line 120
    .line 121
    :goto_3
    if-eqz v3, :cond_7

    .line 122
    .line 123
    iget-object v4, v3, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v4, Lxhss/ᲁᲁᛱᲀ;

    .line 126
    .line 127
    if-eq v4, p1, :cond_7

    .line 128
    .line 129
    iget-object v3, v3, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v3, Lxhss/ᛵᛶᛳ;

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    if-eqz v3, :cond_8

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_8
    iget v3, p0, Lxhss/ᲇᲇᲈᛷ;->ᛷᲁᲁ:I

    .line 138
    .line 139
    iget-object v4, p0, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ:[Lxhss/ᛵᛶᛳ;

    .line 140
    .line 141
    array-length v5, v4

    .line 142
    mul-int/lit8 v5, v5, 0x3

    .line 143
    .line 144
    div-int/lit8 v5, v5, 0x4

    .line 145
    .line 146
    if-le v3, v5, :cond_b

    .line 147
    .line 148
    array-length v3, v4

    .line 149
    mul-int/lit8 v4, v3, 0x2

    .line 150
    .line 151
    add-int/2addr v4, v1

    .line 152
    new-array v5, v4, [Lxhss/ᛵᛶᛳ;

    .line 153
    .line 154
    sub-int/2addr v3, v1

    .line 155
    :goto_4
    if-ltz v3, :cond_a

    .line 156
    .line 157
    iget-object v1, p0, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ:[Lxhss/ᛵᛶᛳ;

    .line 158
    .line 159
    aget-object v1, v1, v3

    .line 160
    .line 161
    :goto_5
    if-eqz v1, :cond_9

    .line 162
    .line 163
    iget-object v6, v1, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v6, Lxhss/ᲁᲁᛱᲀ;

    .line 166
    .line 167
    invoke-static {v6}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    rem-int/2addr v6, v4

    .line 172
    iget-object v7, v1, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v7, Lxhss/ᛵᛶᛳ;

    .line 175
    .line 176
    aget-object v8, v5, v6

    .line 177
    .line 178
    iput-object v8, v1, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 179
    .line 180
    aput-object v1, v5, v6

    .line 181
    .line 182
    move-object v1, v7

    .line 183
    goto :goto_5

    .line 184
    :cond_9
    add-int/lit8 v3, v3, -0x1

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_a
    iput-object v5, p0, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ:[Lxhss/ᛵᛶᛳ;

    .line 188
    .line 189
    :cond_b
    iget v1, p0, Lxhss/ᲇᲇᲈᛷ;->ᛷᲁᲁ:I

    .line 190
    .line 191
    iget-object v3, p0, Lxhss/ᲇᲇᲈᛷ;->ᛸᛶᲈᛶ:[Lxhss/ᛵᛶᛳ;

    .line 192
    .line 193
    array-length v4, v3

    .line 194
    if-ne v1, v4, :cond_c

    .line 195
    .line 196
    array-length v1, v3

    .line 197
    mul-int/lit8 v1, v1, 0x2

    .line 198
    .line 199
    new-array v1, v1, [Lxhss/ᛵᛶᛳ;

    .line 200
    .line 201
    array-length v4, v3

    .line 202
    invoke-static {v3, v2, v1, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 203
    .line 204
    .line 205
    iput-object v1, p0, Lxhss/ᲇᲇᲈᛷ;->ᛸᛶᲈᛶ:[Lxhss/ᛵᛶᛳ;

    .line 206
    .line 207
    move-object v3, v1

    .line 208
    :cond_c
    new-instance v1, Lxhss/ᛵᛶᛳ;

    .line 209
    .line 210
    iget v2, p0, Lxhss/ᲇᲇᲈᛷ;->ᛷᲁᲁ:I

    .line 211
    .line 212
    invoke-direct {v1, v2, p1}, Lxhss/ᛵᛶᛳ;-><init>(ILxhss/ᲁᲁᛱᲀ;)V

    .line 213
    .line 214
    .line 215
    iget-object p1, p0, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ:[Lxhss/ᛵᛶᛳ;

    .line 216
    .line 217
    array-length v4, p1

    .line 218
    rem-int/2addr v0, v4

    .line 219
    aget-object v4, p1, v0

    .line 220
    .line 221
    iput-object v4, v1, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 222
    .line 223
    aput-object v1, p1, v0

    .line 224
    .line 225
    add-int/lit8 p1, v2, 0x1

    .line 226
    .line 227
    iput p1, p0, Lxhss/ᲇᲇᲈᛷ;->ᛷᲁᲁ:I

    .line 228
    .line 229
    aput-object v1, v3, v2

    .line 230
    .line 231
    move-object v3, v1

    .line 232
    :goto_6
    iget p1, v3, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 233
    .line 234
    const v0, 0x7fffffff

    .line 235
    .line 236
    .line 237
    const/16 v1, 0x82

    .line 238
    .line 239
    add-int v2, v1, p1

    .line 240
    .line 241
    and-int v9, v2, v0

    .line 242
    .line 243
    invoke-virtual {p0, v9}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ(I)Lxhss/ᛳᛴᛶᛷ;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    :goto_7
    const-string v6, ""

    .line 248
    .line 249
    if-eqz v0, :cond_e

    .line 250
    .line 251
    iget v2, v0, Lxhss/ᛳᛴᛶᛷ;->ᛱᛱᛲᲇ:I

    .line 252
    .line 253
    if-ne v2, v1, :cond_d

    .line 254
    .line 255
    iget v2, v0, Lxhss/ᛳᛴᛶᛷ;->ᛸᛴᛶᛳ:I

    .line 256
    .line 257
    if-ne v2, v9, :cond_d

    .line 258
    .line 259
    iget-wide v2, v0, Lxhss/ᛳᛴᛶᛷ;->ᲇᛶᛴᲀ:J

    .line 260
    .line 261
    int-to-long v4, p1

    .line 262
    cmp-long v2, v2, v4

    .line 263
    .line 264
    if-nez v2, :cond_d

    .line 265
    .line 266
    iget-object v2, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_d

    .line 273
    .line 274
    iget p0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛷᛵᛵᲈ:I

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_d
    iget-object v0, v0, Lxhss/ᛳᛴᛶᛷ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛴᛶᛷ;

    .line 278
    .line 279
    goto :goto_7

    .line 280
    :cond_e
    new-instance v3, Lxhss/ᛳᛴᛶᛷ;

    .line 281
    .line 282
    iget v4, p0, Lxhss/ᲇᲇᲈᛷ;->ᛸᛷᲈᲈ:I

    .line 283
    .line 284
    const/16 v5, 0x82

    .line 285
    .line 286
    int-to-long v7, p1

    .line 287
    invoke-direct/range {v3 .. v9}, Lxhss/ᛳᛴᛶᛷ;-><init>(IILjava/lang/String;JI)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, v3}, Lxhss/ᲇᲇᲈᛷ;->ᛷᲁᲁ(Lxhss/ᛳᛴᛶᛷ;)I

    .line 291
    .line 292
    .line 293
    move-result p0

    .line 294
    :goto_8
    const/high16 p1, 0x1000000

    .line 295
    .line 296
    goto/16 :goto_0
.end method

.method public static ᛸᛴᛶᛳ(Lxhss/ᲇᲇᲈᛷ;I[II)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    aget v2, p2, p3

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v2, v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_9

    .line 11
    .line 12
    :cond_0
    const v4, 0x3ffffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v4, v1

    .line 16
    const v5, 0x400005

    .line 17
    .line 18
    .line 19
    if-ne v4, v5, :cond_2

    .line 20
    .line 21
    if-ne v2, v5, :cond_1

    .line 22
    .line 23
    goto/16 :goto_9

    .line 24
    .line 25
    :cond_1
    move v1, v5

    .line 26
    :cond_2
    const/4 v4, 0x1

    .line 27
    if-nez v2, :cond_3

    .line 28
    .line 29
    aput v1, p2, p3

    .line 30
    .line 31
    return v4

    .line 32
    :cond_3
    const/high16 v6, -0x4000000

    .line 33
    .line 34
    and-int v7, v2, v6

    .line 35
    .line 36
    const/high16 v8, 0x400000

    .line 37
    .line 38
    const/high16 v9, 0x3c00000

    .line 39
    .line 40
    const/high16 v10, 0x800000

    .line 41
    .line 42
    if-nez v7, :cond_7

    .line 43
    .line 44
    and-int v11, v2, v9

    .line 45
    .line 46
    if-ne v11, v10, :cond_4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_4
    if-ne v2, v5, :cond_15

    .line 50
    .line 51
    and-int v0, v1, v6

    .line 52
    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    and-int v0, v1, v9

    .line 56
    .line 57
    if-ne v0, v10, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    move v1, v8

    .line 61
    :cond_6
    :goto_0
    move v8, v1

    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_7
    :goto_1
    if-ne v1, v5, :cond_8

    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :cond_8
    const/high16 v5, -0x400000

    .line 69
    .line 70
    and-int v11, v1, v5

    .line 71
    .line 72
    and-int/2addr v5, v2

    .line 73
    const-string v12, "java/lang/Object"

    .line 74
    .line 75
    if-ne v11, v5, :cond_11

    .line 76
    .line 77
    and-int v5, v2, v9

    .line 78
    .line 79
    if-ne v5, v10, :cond_10

    .line 80
    .line 81
    and-int v5, v1, v6

    .line 82
    .line 83
    or-int/2addr v5, v10

    .line 84
    const v6, 0xfffff

    .line 85
    .line 86
    .line 87
    and-int/2addr v1, v6

    .line 88
    and-int/2addr v6, v2

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const/16 v7, 0x20

    .line 93
    .line 94
    if-ge v1, v6, :cond_9

    .line 95
    .line 96
    int-to-long v8, v1

    .line 97
    int-to-long v10, v6

    .line 98
    :goto_2
    shl-long/2addr v10, v7

    .line 99
    or-long v7, v8, v10

    .line 100
    .line 101
    move-wide/from16 v16, v7

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_9
    int-to-long v8, v6

    .line 105
    int-to-long v10, v1

    .line 106
    goto :goto_2

    .line 107
    :goto_3
    add-int v7, v1, v6

    .line 108
    .line 109
    const v8, 0x7fffffff

    .line 110
    .line 111
    .line 112
    const/16 v9, 0x83

    .line 113
    .line 114
    add-int/2addr v7, v9

    .line 115
    and-int/2addr v7, v8

    .line 116
    invoke-virtual {v0, v7}, Lxhss/ᲇᲇᲈᛷ;->ᲇᛸᛳᲁ(I)Lxhss/ᛳᛴᛶᛷ;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    :goto_4
    if-eqz v8, :cond_b

    .line 121
    .line 122
    iget v10, v8, Lxhss/ᛳᛴᛶᛷ;->ᛱᛱᛲᲇ:I

    .line 123
    .line 124
    if-ne v10, v9, :cond_a

    .line 125
    .line 126
    iget v10, v8, Lxhss/ᛳᛴᛶᛷ;->ᛸᛴᛶᛳ:I

    .line 127
    .line 128
    if-ne v10, v7, :cond_a

    .line 129
    .line 130
    iget-wide v10, v8, Lxhss/ᛳᛴᛶᛷ;->ᲇᛶᛴᲀ:J

    .line 131
    .line 132
    cmp-long v10, v10, v16

    .line 133
    .line 134
    if-nez v10, :cond_a

    .line 135
    .line 136
    iget v0, v8, Lxhss/ᛳᛴᛶᛷ;->ᲀᲇᛳᲁ:I

    .line 137
    .line 138
    goto/16 :goto_6

    .line 139
    .line 140
    :cond_a
    iget-object v8, v8, Lxhss/ᛳᛴᛶᛷ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛴᛶᛷ;

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_b
    iget-object v8, v0, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ:[Lxhss/ᛳᛴᛶᛷ;

    .line 144
    .line 145
    aget-object v1, v8, v1

    .line 146
    .line 147
    iget-object v1, v1, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 148
    .line 149
    aget-object v6, v8, v6

    .line 150
    .line 151
    iget-object v6, v6, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 152
    .line 153
    const-class v8, Lxhss/ᲇᛷᛳᛵ;

    .line 154
    .line 155
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    const/16 v9, 0x2e

    .line 160
    .line 161
    const/16 v10, 0x2f

    .line 162
    .line 163
    :try_start_0
    invoke-virtual {v1, v10, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    invoke-static {v11, v3, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v11
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 171
    :try_start_1
    invoke-virtual {v6, v10, v9}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v13

    .line 175
    invoke-static {v13, v3, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 179
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    if-eqz v13, :cond_c

    .line 184
    .line 185
    move-object v12, v1

    .line 186
    goto :goto_5

    .line 187
    :cond_c
    invoke-virtual {v8, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_d

    .line 192
    .line 193
    move-object v12, v6

    .line 194
    goto :goto_5

    .line 195
    :cond_d
    invoke-virtual {v11}, Ljava/lang/Class;->isInterface()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_f

    .line 200
    .line 201
    invoke-virtual {v8}, Ljava/lang/Class;->isInterface()Z

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-eqz v1, :cond_e

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_e
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    invoke-virtual {v11, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_e

    .line 217
    .line 218
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1, v9, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    :cond_f
    :goto_5
    invoke-virtual {v0, v12}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    new-instance v13, Lxhss/ᛳᛴᛶᛷ;

    .line 231
    .line 232
    iget v14, v0, Lxhss/ᲇᲇᲈᛷ;->ᛸᛷᲈᲈ:I

    .line 233
    .line 234
    const/16 v15, 0x83

    .line 235
    .line 236
    move/from16 v18, v7

    .line 237
    .line 238
    invoke-direct/range {v13 .. v18}, Lxhss/ᛳᛴᛶᛷ;-><init>(IIJI)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, v13}, Lxhss/ᲇᲇᲈᛷ;->ᛳᲈᲈᛲ(Lxhss/ᛳᛴᛶᛷ;)V

    .line 242
    .line 243
    .line 244
    iput v1, v13, Lxhss/ᛳᛴᛶᛷ;->ᲀᲇᛳᲁ:I

    .line 245
    .line 246
    move v0, v1

    .line 247
    :goto_6
    or-int v8, v5, v0

    .line 248
    .line 249
    goto :goto_8

    .line 250
    :catch_0
    move-exception v0

    .line 251
    new-instance v1, Ljava/lang/TypeNotPresentException;

    .line 252
    .line 253
    invoke-direct {v1, v6, v0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    throw v1

    .line 257
    :catch_1
    move-exception v0

    .line 258
    new-instance v2, Ljava/lang/TypeNotPresentException;

    .line 259
    .line 260
    invoke-direct {v2, v1, v0}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    throw v2

    .line 264
    :cond_10
    and-int/2addr v1, v6

    .line 265
    add-int/2addr v1, v6

    .line 266
    or-int/2addr v1, v10

    .line 267
    invoke-virtual {v0, v12}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    :goto_7
    or-int v8, v1, v0

    .line 272
    .line 273
    goto :goto_8

    .line 274
    :cond_11
    and-int v5, v1, v6

    .line 275
    .line 276
    if-nez v5, :cond_12

    .line 277
    .line 278
    and-int v11, v1, v9

    .line 279
    .line 280
    if-ne v11, v10, :cond_15

    .line 281
    .line 282
    :cond_12
    if-eqz v5, :cond_13

    .line 283
    .line 284
    and-int/2addr v1, v9

    .line 285
    if-eq v1, v10, :cond_13

    .line 286
    .line 287
    add-int/2addr v5, v6

    .line 288
    :cond_13
    if-eqz v7, :cond_14

    .line 289
    .line 290
    and-int v1, v2, v9

    .line 291
    .line 292
    if-eq v1, v10, :cond_14

    .line 293
    .line 294
    add-int/2addr v7, v6

    .line 295
    :cond_14
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 296
    .line 297
    .line 298
    move-result v1

    .line 299
    or-int/2addr v1, v10

    .line 300
    invoke-virtual {v0, v12}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    goto :goto_7

    .line 305
    :cond_15
    :goto_8
    if-eq v8, v2, :cond_16

    .line 306
    .line 307
    aput v8, p2, p3

    .line 308
    .line 309
    return v4

    .line 310
    :cond_16
    :goto_9
    return v3
.end method

.method public static ᲇᛴᲇᛵ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;I)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p2}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v4, 0x46

    .line 10
    .line 11
    if-eq v2, v4, :cond_c

    .line 12
    .line 13
    const/high16 v5, 0x800000

    .line 14
    .line 15
    const/16 v6, 0x4c

    .line 16
    .line 17
    if-eq v2, v6, :cond_b

    .line 18
    .line 19
    const v7, 0x400001

    .line 20
    .line 21
    .line 22
    const/16 v8, 0x53

    .line 23
    .line 24
    if-eq v2, v8, :cond_a

    .line 25
    .line 26
    const/16 v9, 0x56

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    if-eq v2, v9, :cond_9

    .line 30
    .line 31
    const/16 v9, 0x49

    .line 32
    .line 33
    if-eq v2, v9, :cond_a

    .line 34
    .line 35
    const v11, 0x400004

    .line 36
    .line 37
    .line 38
    const/16 v12, 0x4a

    .line 39
    .line 40
    if-eq v2, v12, :cond_8

    .line 41
    .line 42
    const/16 v13, 0x5a

    .line 43
    .line 44
    if-eq v2, v13, :cond_a

    .line 45
    .line 46
    const v14, 0x400003

    .line 47
    .line 48
    .line 49
    const/16 v15, 0x5b

    .line 50
    .line 51
    if-eq v2, v15, :cond_0

    .line 52
    .line 53
    packed-switch v2, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p1 .. p2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "Invalid descriptor: "

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return v10

    .line 70
    :pswitch_0
    return v14

    .line 71
    :cond_0
    add-int/lit8 v2, p2, 0x1

    .line 72
    .line 73
    const v16, 0x400002

    .line 74
    .line 75
    .line 76
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-ne v3, v15, :cond_1

    .line 81
    .line 82
    add-int/lit8 v2, v2, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eq v3, v4, :cond_7

    .line 90
    .line 91
    if-eq v3, v6, :cond_6

    .line 92
    .line 93
    if-eq v3, v8, :cond_5

    .line 94
    .line 95
    if-eq v3, v13, :cond_4

    .line 96
    .line 97
    if-eq v3, v9, :cond_3

    .line 98
    .line 99
    if-eq v3, v12, :cond_2

    .line 100
    .line 101
    packed-switch v3, :pswitch_data_1

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-string v1, "Invalid descriptor fragment: "

    .line 109
    .line 110
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return v10

    .line 118
    :pswitch_1
    move v3, v14

    .line 119
    goto :goto_1

    .line 120
    :pswitch_2
    const v3, 0x40000b

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_3
    const v3, 0x40000a

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    move v3, v11

    .line 129
    goto :goto_1

    .line 130
    :cond_3
    move v3, v7

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    const v3, 0x400009

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_5
    const v3, 0x40000c

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    add-int/lit8 v3, v2, 0x1

    .line 141
    .line 142
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    add-int/lit8 v4, v4, -0x1

    .line 147
    .line 148
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v0, v1}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    or-int v3, v0, v5

    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_7
    move/from16 v3, v16

    .line 160
    .line 161
    :goto_1
    sub-int v2, v2, p2

    .line 162
    .line 163
    shl-int/lit8 v0, v2, 0x1a

    .line 164
    .line 165
    or-int/2addr v0, v3

    .line 166
    return v0

    .line 167
    :cond_8
    return v11

    .line 168
    :cond_9
    return v10

    .line 169
    :cond_a
    :pswitch_4
    return v7

    .line 170
    :cond_b
    add-int/lit8 v2, p2, 0x1

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    add-int/lit8 v3, v3, -0x1

    .line 177
    .line 178
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, v1}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    or-int/2addr v0, v5

    .line 187
    return v0

    .line 188
    :cond_c
    const v16, 0x400002

    .line 189
    .line 190
    .line 191
    return v16

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_4
        :pswitch_4
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x42
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public ᛱᛱᛲᲇ(IILxhss/ᛳᛴᛶᛷ;Lxhss/ᲇᲇᲈᛷ;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    const v5, 0x400005

    .line 12
    .line 13
    .line 14
    const v6, 0x400002

    .line 15
    .line 16
    .line 17
    const v8, 0x400001

    .line 18
    .line 19
    .line 20
    const v9, 0x400003

    .line 21
    .line 22
    .line 23
    const v10, 0x400004

    .line 24
    .line 25
    .line 26
    const/high16 v11, 0x400000

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    packed-switch v1, :pswitch_data_1

    .line 32
    .line 33
    .line 34
    const/high16 v13, 0x1800000

    .line 35
    .line 36
    const/high16 v14, 0x1400000

    .line 37
    .line 38
    const/high16 v15, 0x3c00000

    .line 39
    .line 40
    const/high16 v16, 0x800000

    .line 41
    .line 42
    const/4 v7, 0x2

    .line 43
    const/high16 v17, 0x100000

    .line 44
    .line 45
    const/4 v12, 0x1

    .line 46
    packed-switch v1, :pswitch_data_2

    .line 47
    .line 48
    .line 49
    const/4 v5, 0x3

    .line 50
    const/16 v13, 0x5b

    .line 51
    .line 52
    const/4 v14, 0x4

    .line 53
    const/4 v15, 0x0

    .line 54
    packed-switch v1, :pswitch_data_3

    .line 55
    .line 56
    .line 57
    packed-switch v1, :pswitch_data_4

    .line 58
    .line 59
    .line 60
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :pswitch_0
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_1
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-ne v2, v13, :cond_0

    .line 85
    .line 86
    invoke-virtual {v0, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_0
    invoke-virtual {v4, v1}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    or-int v1, v1, v16

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_2
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-ne v2, v13, :cond_1

    .line 110
    .line 111
    const-string v2, "["

    .line 112
    .line 113
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v0, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_1
    const/high16 v2, 0x4800000

    .line 122
    .line 123
    invoke-virtual {v4, v1}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    or-int/2addr v1, v2

    .line 128
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :pswitch_3
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 133
    .line 134
    .line 135
    packed-switch v2, :pswitch_data_5

    .line 136
    .line 137
    .line 138
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :pswitch_4
    const v1, 0x4400004

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_5
    const v1, 0x4400001

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_6
    const v1, 0x440000c

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_7
    const v1, 0x440000a

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_8
    const v1, 0x4400003

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :pswitch_9
    const v1, 0x4400002

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_a
    const v1, 0x440000b

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_b
    const v1, 0x4400009

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :pswitch_c
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v4, v1, v2}, Lxhss/ᲇᲇᲈᛷ;->ᛸᛶᲈᛶ(Ljava/lang/String;I)I

    .line 203
    .line 204
    .line 205
    move-result v1

    .line 206
    const/high16 v2, 0xc00000

    .line 207
    .line 208
    or-int/2addr v1, v2

    .line 209
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_d
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛷᲁᲁ(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v0, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-void

    .line 224
    :pswitch_e
    iget-object v2, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 225
    .line 226
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛷᲁᲁ(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const/16 v2, 0xb8

    .line 230
    .line 231
    if-eq v1, v2, :cond_4

    .line 232
    .line 233
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    const/16 v5, 0xb7

    .line 238
    .line 239
    if-ne v1, v5, :cond_4

    .line 240
    .line 241
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    const/16 v5, 0x3c

    .line 248
    .line 249
    if-ne v1, v5, :cond_4

    .line 250
    .line 251
    iget-object v1, v0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛲᲀᛵ:[I

    .line 252
    .line 253
    if-nez v1, :cond_2

    .line 254
    .line 255
    new-array v1, v7, [I

    .line 256
    .line 257
    iput-object v1, v0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛲᲀᛵ:[I

    .line 258
    .line 259
    :cond_2
    array-length v5, v1

    .line 260
    iget v6, v0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ:I

    .line 261
    .line 262
    if-lt v6, v5, :cond_3

    .line 263
    .line 264
    add-int/2addr v6, v12

    .line 265
    mul-int/lit8 v1, v5, 0x2

    .line 266
    .line 267
    invoke-static {v6, v1}, Ljava/lang/Math;->max(II)I

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    new-array v1, v1, [I

    .line 272
    .line 273
    iget-object v6, v0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛲᲀᛵ:[I

    .line 274
    .line 275
    invoke-static {v6, v15, v1, v15, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 276
    .line 277
    .line 278
    iput-object v1, v0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛲᲀᛵ:[I

    .line 279
    .line 280
    :cond_3
    iget v5, v0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ:I

    .line 281
    .line 282
    add-int/lit8 v6, v5, 0x1

    .line 283
    .line 284
    iput v6, v0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ:I

    .line 285
    .line 286
    aput v2, v1, v5

    .line 287
    .line 288
    :cond_4
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 289
    .line 290
    invoke-virtual {v0, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :pswitch_f
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛷᲁᲁ(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :pswitch_10
    invoke-virtual {v0, v12}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 304
    .line 305
    .line 306
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {v0, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_11
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 313
    .line 314
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛷᲁᲁ(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :pswitch_12
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v0, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_13
    const-string v0, "JSR/RET are not supported with computeFrames option"

    .line 325
    .line 326
    invoke-static {v0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :pswitch_14
    invoke-virtual {v0, v14}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v8}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :pswitch_15
    invoke-virtual {v0, v12}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v8}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 341
    .line 342
    .line 343
    return-void

    .line 344
    :pswitch_16
    invoke-virtual {v0, v12}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v9}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :pswitch_17
    invoke-virtual {v0, v12}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, v6}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :pswitch_18
    invoke-virtual {v0, v12}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v0, v10}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :pswitch_19
    invoke-virtual {v0, v2, v8}, Lxhss/ᛱᲁᲀᛲ;->ᛶᲇᲈᛸ(II)V

    .line 372
    .line 373
    .line 374
    return-void

    .line 375
    :pswitch_1a
    invoke-virtual {v0, v5}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0, v10}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :pswitch_1b
    invoke-virtual {v0, v14}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v9}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :pswitch_1c
    invoke-virtual {v0, v14}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v0, v10}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 402
    .line 403
    .line 404
    return-void

    .line 405
    :pswitch_1d
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 406
    .line 407
    .line 408
    move-result v1

    .line 409
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 417
    .line 418
    .line 419
    return-void

    .line 420
    :pswitch_1e
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 433
    .line 434
    .line 435
    move-result v4

    .line 436
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0, v4}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v0, v3}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 452
    .line 453
    .line 454
    return-void

    .line 455
    :pswitch_1f
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 460
    .line 461
    .line 462
    move-result v2

    .line 463
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 464
    .line 465
    .line 466
    move-result v3

    .line 467
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v0, v3}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 480
    .line 481
    .line 482
    return-void

    .line 483
    :pswitch_20
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 488
    .line 489
    .line 490
    move-result v2

    .line 491
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 501
    .line 502
    .line 503
    return-void

    .line 504
    :pswitch_21
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 509
    .line 510
    .line 511
    move-result v2

    .line 512
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0, v3}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :pswitch_22
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 538
    .line 539
    .line 540
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 544
    .line 545
    .line 546
    return-void

    .line 547
    :pswitch_23
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 555
    .line 556
    .line 557
    return-void

    .line 558
    :pswitch_24
    invoke-virtual {v0, v7}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 559
    .line 560
    .line 561
    return-void

    .line 562
    :pswitch_25
    invoke-virtual {v0, v12}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 563
    .line 564
    .line 565
    return-void

    .line 566
    :pswitch_26
    invoke-virtual {v0, v14}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 567
    .line 568
    .line 569
    return-void

    .line 570
    :pswitch_27
    invoke-virtual {v0, v5}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :pswitch_28
    invoke-virtual {v0, v12}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    invoke-virtual {v0, v2, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛶᲇᲈᛸ(II)V

    .line 582
    .line 583
    .line 584
    add-int/lit8 v1, v2, 0x1

    .line 585
    .line 586
    invoke-virtual {v0, v1, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛶᲇᲈᛸ(II)V

    .line 587
    .line 588
    .line 589
    if-lez v2, :cond_c

    .line 590
    .line 591
    add-int/lit8 v1, v2, -0x1

    .line 592
    .line 593
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ(I)I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    if-eq v2, v10, :cond_7

    .line 598
    .line 599
    if-ne v2, v9, :cond_5

    .line 600
    .line 601
    goto :goto_0

    .line 602
    :cond_5
    and-int v3, v2, v15

    .line 603
    .line 604
    if-eq v3, v14, :cond_6

    .line 605
    .line 606
    if-ne v3, v13, :cond_c

    .line 607
    .line 608
    :cond_6
    or-int v2, v2, v17

    .line 609
    .line 610
    invoke-virtual {v0, v1, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛶᲇᲈᛸ(II)V

    .line 611
    .line 612
    .line 613
    return-void

    .line 614
    :cond_7
    :goto_0
    invoke-virtual {v0, v1, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛶᲇᲈᛸ(II)V

    .line 615
    .line 616
    .line 617
    return-void

    .line 618
    :pswitch_29
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 619
    .line 620
    .line 621
    move-result v1

    .line 622
    invoke-virtual {v0, v2, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛶᲇᲈᛸ(II)V

    .line 623
    .line 624
    .line 625
    if-lez v2, :cond_c

    .line 626
    .line 627
    add-int/lit8 v1, v2, -0x1

    .line 628
    .line 629
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ(I)I

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    if-eq v2, v10, :cond_a

    .line 634
    .line 635
    if-ne v2, v9, :cond_8

    .line 636
    .line 637
    goto :goto_1

    .line 638
    :cond_8
    and-int v3, v2, v15

    .line 639
    .line 640
    if-eq v3, v14, :cond_9

    .line 641
    .line 642
    if-ne v3, v13, :cond_c

    .line 643
    .line 644
    :cond_9
    or-int v2, v2, v17

    .line 645
    .line 646
    invoke-virtual {v0, v1, v2}, Lxhss/ᛱᲁᲀᛲ;->ᛶᲇᲈᛸ(II)V

    .line 647
    .line 648
    .line 649
    return-void

    .line 650
    :cond_a
    :goto_1
    invoke-virtual {v0, v1, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛶᲇᲈᛸ(II)V

    .line 651
    .line 652
    .line 653
    return-void

    .line 654
    :pswitch_2a
    invoke-virtual {v0, v12}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛷᲈᲈ()I

    .line 658
    .line 659
    .line 660
    move-result v1

    .line 661
    if-ne v1, v5, :cond_b

    .line 662
    .line 663
    goto :goto_2

    .line 664
    :cond_b
    const/high16 v2, -0x4000000

    .line 665
    .line 666
    add-int/2addr v1, v2

    .line 667
    :goto_2
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 668
    .line 669
    .line 670
    return-void

    .line 671
    :pswitch_2b
    invoke-virtual {v0, v7}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0, v9}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 678
    .line 679
    .line 680
    return-void

    .line 681
    :pswitch_2c
    invoke-virtual {v0, v7}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0, v6}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 685
    .line 686
    .line 687
    return-void

    .line 688
    :pswitch_2d
    invoke-virtual {v0, v7}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0, v10}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 695
    .line 696
    .line 697
    return-void

    .line 698
    :pswitch_2e
    invoke-virtual {v0, v7}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0, v8}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 702
    .line 703
    .line 704
    return-void

    .line 705
    :pswitch_2f
    invoke-virtual {v0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ(I)I

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 710
    .line 711
    .line 712
    return-void

    .line 713
    :pswitch_30
    const/high16 v16, 0x800000

    .line 714
    .line 715
    iget v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛱᛱᛲᲇ:I

    .line 716
    .line 717
    packed-switch v1, :pswitch_data_6

    .line 718
    .line 719
    .line 720
    packed-switch v1, :pswitch_data_7

    .line 721
    .line 722
    .line 723
    new-instance v0, Ljava/lang/AssertionError;

    .line 724
    .line 725
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 726
    .line 727
    .line 728
    throw v0

    .line 729
    :pswitch_31
    iget-object v1, v3, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 730
    .line 731
    invoke-virtual {v0, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    return-void

    .line 735
    :pswitch_32
    const-string v1, "java/lang/invoke/MethodType"

    .line 736
    .line 737
    invoke-virtual {v4, v1}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 738
    .line 739
    .line 740
    move-result v1

    .line 741
    or-int v1, v1, v16

    .line 742
    .line 743
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 744
    .line 745
    .line 746
    return-void

    .line 747
    :pswitch_33
    const-string v1, "java/lang/invoke/MethodHandle"

    .line 748
    .line 749
    invoke-virtual {v4, v1}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 750
    .line 751
    .line 752
    move-result v1

    .line 753
    or-int v1, v1, v16

    .line 754
    .line 755
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 756
    .line 757
    .line 758
    return-void

    .line 759
    :pswitch_34
    const-string v1, "java/lang/String"

    .line 760
    .line 761
    invoke-virtual {v4, v1}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 762
    .line 763
    .line 764
    move-result v1

    .line 765
    or-int v1, v1, v16

    .line 766
    .line 767
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 768
    .line 769
    .line 770
    return-void

    .line 771
    :pswitch_35
    const-string v1, "java/lang/Class"

    .line 772
    .line 773
    invoke-virtual {v4, v1}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 774
    .line 775
    .line 776
    move-result v1

    .line 777
    or-int v1, v1, v16

    .line 778
    .line 779
    invoke-virtual {v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 780
    .line 781
    .line 782
    return-void

    .line 783
    :pswitch_36
    invoke-virtual {v0, v9}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 787
    .line 788
    .line 789
    return-void

    .line 790
    :pswitch_37
    invoke-virtual {v0, v10}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 794
    .line 795
    .line 796
    return-void

    .line 797
    :pswitch_38
    invoke-virtual {v0, v6}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 798
    .line 799
    .line 800
    return-void

    .line 801
    :pswitch_39
    invoke-virtual {v0, v8}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 802
    .line 803
    .line 804
    return-void

    .line 805
    :pswitch_3a
    invoke-virtual {v0, v9}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 809
    .line 810
    .line 811
    return-void

    .line 812
    :pswitch_3b
    invoke-virtual {v0, v6}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 813
    .line 814
    .line 815
    return-void

    .line 816
    :pswitch_3c
    invoke-virtual {v0, v10}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 817
    .line 818
    .line 819
    invoke-virtual {v0, v11}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 820
    .line 821
    .line 822
    return-void

    .line 823
    :pswitch_3d
    invoke-virtual {v0, v8}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 824
    .line 825
    .line 826
    return-void

    .line 827
    :pswitch_3e
    invoke-virtual {v0, v5}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 828
    .line 829
    .line 830
    :cond_c
    :pswitch_3f
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3d
        :pswitch_3c
        :pswitch_3c
        :pswitch_3b
        :pswitch_3b
        :pswitch_3b
        :pswitch_3a
        :pswitch_3a
        :pswitch_3d
        :pswitch_3d
        :pswitch_30
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_2f
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2e
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_2e
        :pswitch_2e
        :pswitch_2e
        :pswitch_29
        :pswitch_28
        :pswitch_29
        :pswitch_28
        :pswitch_29
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x4f
        :pswitch_27
        :pswitch_26
        :pswitch_27
        :pswitch_26
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_2e
        :pswitch_1c
        :pswitch_2c
        :pswitch_1b
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1a
        :pswitch_2e
        :pswitch_1c
        :pswitch_2e
        :pswitch_1c
        :pswitch_2e
        :pswitch_1c
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_2e
        :pswitch_2c
        :pswitch_2b
        :pswitch_15
        :pswitch_18
        :pswitch_16
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_3f
        :pswitch_3f
        :pswitch_3f
        :pswitch_14
        :pswitch_2e
        :pswitch_2e
        :pswitch_14
        :pswitch_14
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_24
        :pswitch_3f
        :pswitch_13
        :pswitch_13
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_25
        :pswitch_24
        :pswitch_25
        :pswitch_3f
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_3
        :pswitch_2
        :pswitch_15
        :pswitch_25
        :pswitch_1
        :pswitch_15
        :pswitch_25
        :pswitch_25
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xc5
        :pswitch_0
        :pswitch_25
        :pswitch_25
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x4
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x3
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0xf
        :pswitch_33
        :pswitch_32
        :pswitch_31
    .end packed-switch
.end method

.method public final ᛳᲈᲈᛲ(Lxhss/ᲇᲇᲈᛷ;ILjava/lang/String;I)V
    .locals 9

    .line 1
    new-array v0, p4, [I

    .line 2
    .line 3
    iput-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [I

    .line 7
    .line 8
    iput-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 9
    .line 10
    and-int/lit8 v2, p2, 0x8

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    const/high16 v2, 0x40000

    .line 16
    .line 17
    and-int/2addr p2, v2

    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    iget-object p2, p1, Lxhss/ᲇᲇᲈᛷ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    const/high16 v2, 0x800000

    .line 27
    .line 28
    or-int/2addr p2, v2

    .line 29
    aput p2, v0, v1

    .line 30
    .line 31
    :goto_0
    move p2, v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const p2, 0x400006

    .line 34
    .line 35
    .line 36
    aput p2, v0, v1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move p2, v1

    .line 40
    :goto_1
    invoke-static {p3}, Lxhss/ᲀᛲᲀᲈ;->ᛱᛱᛲᲇ(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    new-array v2, v0, [Lxhss/ᲀᛲᲀᲈ;

    .line 45
    .line 46
    move v5, v1

    .line 47
    move v4, v3

    .line 48
    :goto_2
    invoke-virtual {p3, v4}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    const/16 v7, 0x29

    .line 53
    .line 54
    if-eq v6, v7, :cond_4

    .line 55
    .line 56
    move v6, v4

    .line 57
    :goto_3
    invoke-virtual {p3, v6}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    const/16 v8, 0x5b

    .line 62
    .line 63
    if-ne v7, v8, :cond_2

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_2
    add-int/lit8 v7, v6, 0x1

    .line 69
    .line 70
    invoke-virtual {p3, v6}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    const/16 v8, 0x4c

    .line 75
    .line 76
    if-ne v6, v8, :cond_3

    .line 77
    .line 78
    const/16 v6, 0x3b

    .line 79
    .line 80
    invoke-virtual {p3, v6, v7}, Ljava/lang/String;->indexOf(II)I

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    add-int/2addr v6, v3

    .line 85
    invoke-static {v7, v6}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    :cond_3
    add-int/lit8 v6, v5, 0x1

    .line 90
    .line 91
    invoke-static {p3, v4, v7}, Lxhss/ᲀᛲᲀᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;II)Lxhss/ᲀᛲᲀᲈ;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    aput-object v4, v2, v5

    .line 96
    .line 97
    move v5, v6

    .line 98
    move v4, v7

    .line 99
    goto :goto_2

    .line 100
    :cond_4
    move p3, v1

    .line 101
    :goto_4
    const/high16 v3, 0x400000

    .line 102
    .line 103
    if-ge p3, v0, :cond_7

    .line 104
    .line 105
    aget-object v4, v2, p3

    .line 106
    .line 107
    invoke-virtual {v4}, Lxhss/ᲀᛲᲀᲈ;->ᲇᛴᲇᛵ()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-static {p1, v4, v1}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;I)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    iget-object v5, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 116
    .line 117
    add-int/lit8 v6, p2, 0x1

    .line 118
    .line 119
    aput v4, v5, p2

    .line 120
    .line 121
    const v7, 0x400004

    .line 122
    .line 123
    .line 124
    if-eq v4, v7, :cond_6

    .line 125
    .line 126
    const v7, 0x400003

    .line 127
    .line 128
    .line 129
    if-ne v4, v7, :cond_5

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    move p2, v6

    .line 133
    goto :goto_6

    .line 134
    :cond_6
    :goto_5
    add-int/lit8 p2, p2, 0x2

    .line 135
    .line 136
    aput v3, v5, v6

    .line 137
    .line 138
    :goto_6
    add-int/lit8 p3, p3, 0x1

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_7
    :goto_7
    if-ge p2, p4, :cond_8

    .line 142
    .line 143
    iget-object p1, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 144
    .line 145
    add-int/lit8 p3, p2, 0x1

    .line 146
    .line 147
    aput v3, p1, p2

    .line 148
    .line 149
    move p2, p3

    .line 150
    goto :goto_7

    .line 151
    :cond_8
    return-void
.end method

.method public final ᛶᲇᲈᛸ(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ:[I

    .line 10
    .line 11
    :cond_0
    array-length v1, v0

    .line 12
    if-lt p1, v1, :cond_1

    .line 13
    .line 14
    add-int/lit8 v0, p1, 0x1

    .line 15
    .line 16
    mul-int/lit8 v2, v1, 0x2

    .line 17
    .line 18
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    new-array v0, v0, [I

    .line 23
    .line 24
    iget-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ:[I

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ:[I

    .line 31
    .line 32
    :cond_1
    aput p2, v0, p1

    .line 33
    .line 34
    return-void
.end method

.method public final ᛷᛴᛷᛱ(II)I
    .locals 8

    .line 1
    const/high16 v0, -0x4000000

    .line 2
    .line 3
    and-int/2addr v0, p1

    .line 4
    const/high16 v1, 0x3c00000

    .line 5
    .line 6
    and-int/2addr v1, p1

    .line 7
    const/high16 v2, 0x1400000

    .line 8
    .line 9
    const/high16 v3, 0x400000

    .line 10
    .line 11
    const v4, 0x400003

    .line 12
    .line 13
    .line 14
    const v5, 0x400004

    .line 15
    .line 16
    .line 17
    const/high16 v6, 0x100000

    .line 18
    .line 19
    const v7, 0xfffff

    .line 20
    .line 21
    .line 22
    if-ne v1, v2, :cond_2

    .line 23
    .line 24
    iget-object p0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 25
    .line 26
    and-int p2, p1, v7

    .line 27
    .line 28
    aget p0, p0, p2

    .line 29
    .line 30
    add-int/2addr v0, p0

    .line 31
    and-int p0, p1, v6

    .line 32
    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    if-eq v0, v5, :cond_0

    .line 36
    .line 37
    if-ne v0, v4, :cond_1

    .line 38
    .line 39
    :cond_0
    return v3

    .line 40
    :cond_1
    return v0

    .line 41
    :cond_2
    const/high16 v2, 0x1800000

    .line 42
    .line 43
    if-ne v1, v2, :cond_5

    .line 44
    .line 45
    iget-object p0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 46
    .line 47
    and-int v1, p1, v7

    .line 48
    .line 49
    sub-int/2addr p2, v1

    .line 50
    aget p0, p0, p2

    .line 51
    .line 52
    add-int/2addr v0, p0

    .line 53
    and-int p0, p1, v6

    .line 54
    .line 55
    if-eqz p0, :cond_4

    .line 56
    .line 57
    if-eq v0, v5, :cond_3

    .line 58
    .line 59
    if-ne v0, v4, :cond_4

    .line 60
    .line 61
    :cond_3
    return v3

    .line 62
    :cond_4
    return v0

    .line 63
    :cond_5
    return p1
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᲁᛶᲁᛶ;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    move v3, v2

    .line 6
    move v4, v3

    .line 7
    :goto_0
    array-length v5, v0

    .line 8
    const/4 v6, 0x2

    .line 9
    const v7, 0x400003

    .line 10
    .line 11
    .line 12
    const v8, 0x400004

    .line 13
    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    if-ge v2, v5, :cond_3

    .line 17
    .line 18
    aget v5, v0, v2

    .line 19
    .line 20
    if-eq v5, v8, :cond_1

    .line 21
    .line 22
    if-ne v5, v7, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v6, v9

    .line 26
    :cond_1
    :goto_1
    add-int/2addr v2, v6

    .line 27
    const/high16 v6, 0x400000

    .line 28
    .line 29
    if-ne v5, v6, :cond_2

    .line 30
    .line 31
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    add-int/2addr v3, v4

    .line 37
    move v4, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    iget-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 40
    .line 41
    move v4, v1

    .line 42
    move v5, v4

    .line 43
    :goto_2
    array-length v10, v2

    .line 44
    if-ge v4, v10, :cond_6

    .line 45
    .line 46
    aget v10, v2, v4

    .line 47
    .line 48
    if-eq v10, v8, :cond_5

    .line 49
    .line 50
    if-ne v10, v7, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move v10, v9

    .line 54
    goto :goto_4

    .line 55
    :cond_5
    :goto_3
    move v10, v6

    .line 56
    :goto_4
    add-int/2addr v4, v10

    .line 57
    add-int/lit8 v5, v5, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_6
    iget-object p0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛵᛵᲈ:Lxhss/ᲁᲁᛱᲀ;

    .line 61
    .line 62
    iget p0, p0, Lxhss/ᲁᲁᛱᲀ;->ᲇᛴᲇᛵ:I

    .line 63
    .line 64
    invoke-virtual {p1, p0, v3, v5}, Lxhss/ᲁᛶᲁᛶ;->ᛸᛴᛶᛳ(III)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x3

    .line 68
    move v4, v1

    .line 69
    :goto_5
    add-int/lit8 v10, v3, -0x1

    .line 70
    .line 71
    if-lez v3, :cond_9

    .line 72
    .line 73
    aget v3, v0, v4

    .line 74
    .line 75
    if-eq v3, v8, :cond_8

    .line 76
    .line 77
    if-ne v3, v7, :cond_7

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_7
    move v11, v9

    .line 81
    goto :goto_7

    .line 82
    :cond_8
    :goto_6
    move v11, v6

    .line 83
    :goto_7
    add-int/2addr v4, v11

    .line 84
    add-int/lit8 v11, p0, 0x1

    .line 85
    .line 86
    iget-object v12, p1, Lxhss/ᲁᛶᲁᛶ;->ᛲᛵᲁᲁ:[I

    .line 87
    .line 88
    aput v3, v12, p0

    .line 89
    .line 90
    move v3, v10

    .line 91
    move p0, v11

    .line 92
    goto :goto_5

    .line 93
    :cond_9
    :goto_8
    add-int/lit8 v0, v5, -0x1

    .line 94
    .line 95
    if-lez v5, :cond_c

    .line 96
    .line 97
    aget v3, v2, v1

    .line 98
    .line 99
    if-eq v3, v8, :cond_b

    .line 100
    .line 101
    if-ne v3, v7, :cond_a

    .line 102
    .line 103
    goto :goto_9

    .line 104
    :cond_a
    move v4, v9

    .line 105
    goto :goto_a

    .line 106
    :cond_b
    :goto_9
    move v4, v6

    .line 107
    :goto_a
    add-int/2addr v1, v4

    .line 108
    add-int/lit8 v4, p0, 0x1

    .line 109
    .line 110
    iget-object v5, p1, Lxhss/ᲁᛶᲁᛶ;->ᛲᛵᲁᲁ:[I

    .line 111
    .line 112
    aput v3, v5, p0

    .line 113
    .line 114
    move v5, v0

    .line 115
    move p0, v4

    .line 116
    goto :goto_8

    .line 117
    :cond_c
    invoke-virtual {p1}, Lxhss/ᲁᛶᲁᛶ;->ᲀᲇᛳᲁ()V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public final ᛷᲁᲁ(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const/16 v1, 0x28

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    const/4 v3, 0x2

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lxhss/ᲀᛲᲀᲈ;->ᛳᲁᲇᛸ(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    shr-int/2addr p1, v3

    .line 17
    sub-int/2addr p1, v2

    .line 18
    invoke-virtual {p0, p1}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const/16 p1, 0x4a

    .line 23
    .line 24
    if-eq v0, p1, :cond_2

    .line 25
    .line 26
    const/16 p1, 0x44

    .line 27
    .line 28
    if-ne v0, p1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0, v2}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_2
    :goto_0
    invoke-virtual {p0, v3}, Lxhss/ᛱᲁᲀᛲ;->ᲈᛳᲀ(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final ᛸᛲᲀᛵ(Lxhss/ᲇᲇᲈᛷ;Lxhss/ᛱᲁᲀᛲ;I)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    iget-object v1, p0, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 5
    .line 6
    array-length v1, v1

    .line 7
    iget-object v2, p2, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-array v2, v0, [I

    .line 14
    .line 15
    iput-object v2, p2, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 16
    .line 17
    move v2, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v2, v4

    .line 20
    :goto_0
    move v5, v4

    .line 21
    :goto_1
    if-ge v5, v0, :cond_4

    .line 22
    .line 23
    iget-object v6, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ:[I

    .line 24
    .line 25
    if-eqz v6, :cond_2

    .line 26
    .line 27
    array-length v7, v6

    .line 28
    if-ge v5, v7, :cond_2

    .line 29
    .line 30
    aget v6, v6, v5

    .line 31
    .line 32
    if-nez v6, :cond_1

    .line 33
    .line 34
    iget-object v6, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 35
    .line 36
    aget v6, v6, v5

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_1
    invoke-virtual {p0, v6, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛷᛴᛷᛱ(II)I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    iget-object v6, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 45
    .line 46
    aget v6, v6, v5

    .line 47
    .line 48
    :goto_2
    iget-object v7, p0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛲᲀᛵ:[I

    .line 49
    .line 50
    if-eqz v7, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0, p1, v6}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ(Lxhss/ᲇᲇᲈᛷ;I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    :cond_3
    iget-object v7, p2, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 57
    .line 58
    invoke-static {p1, v6, v7, v5}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ(Lxhss/ᲇᲇᲈᛷ;I[II)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    or-int/2addr v2, v6

    .line 63
    add-int/lit8 v5, v5, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    if-lez p3, :cond_7

    .line 67
    .line 68
    move v1, v4

    .line 69
    :goto_3
    if-ge v1, v0, :cond_5

    .line 70
    .line 71
    iget-object v5, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 72
    .line 73
    aget v5, v5, v1

    .line 74
    .line 75
    iget-object v6, p2, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 76
    .line 77
    invoke-static {p1, v5, v6, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ(Lxhss/ᲇᲇᲈᛷ;I[II)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    or-int/2addr v2, v5

    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_5
    iget-object p0, p2, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 86
    .line 87
    if-nez p0, :cond_6

    .line 88
    .line 89
    new-array p0, v3, [I

    .line 90
    .line 91
    iput-object p0, p2, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    move v3, v2

    .line 95
    :goto_4
    invoke-static {p1, p3, p0, v4}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ(Lxhss/ᲇᲇᲈᛷ;I[II)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    or-int/2addr p0, v3

    .line 100
    return p0

    .line 101
    :cond_7
    iget-object p3, p0, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 102
    .line 103
    array-length p3, p3

    .line 104
    iget-short v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ:S

    .line 105
    .line 106
    add-int/2addr p3, v0

    .line 107
    iget-object v0, p2, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 108
    .line 109
    if-nez v0, :cond_8

    .line 110
    .line 111
    iget-short v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 112
    .line 113
    add-int/2addr v0, p3

    .line 114
    new-array v0, v0, [I

    .line 115
    .line 116
    iput-object v0, p2, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_8
    move v3, v2

    .line 120
    :goto_5
    move v0, v4

    .line 121
    :goto_6
    if-ge v0, p3, :cond_a

    .line 122
    .line 123
    iget-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 124
    .line 125
    aget v2, v2, v0

    .line 126
    .line 127
    iget-object v5, p0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛲᲀᛵ:[I

    .line 128
    .line 129
    if-eqz v5, :cond_9

    .line 130
    .line 131
    invoke-virtual {p0, p1, v2}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ(Lxhss/ᲇᲇᲈᛷ;I)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    :cond_9
    iget-object v5, p2, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 136
    .line 137
    invoke-static {p1, v2, v5, v0}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ(Lxhss/ᲇᲇᲈᛷ;I[II)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    or-int/2addr v3, v2

    .line 142
    add-int/lit8 v0, v0, 0x1

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_a
    :goto_7
    iget-short v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 146
    .line 147
    if-ge v4, v0, :cond_c

    .line 148
    .line 149
    iget-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛴᛷᛱ:[I

    .line 150
    .line 151
    aget v0, v0, v4

    .line 152
    .line 153
    invoke-virtual {p0, v0, v1}, Lxhss/ᛱᲁᲀᛲ;->ᛷᛴᛷᛱ(II)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    iget-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛲᲀᛵ:[I

    .line 158
    .line 159
    if-eqz v2, :cond_b

    .line 160
    .line 161
    invoke-virtual {p0, p1, v0}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ(Lxhss/ᲇᲇᲈᛷ;I)I

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    :cond_b
    iget-object v2, p2, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 166
    .line 167
    add-int v5, p3, v4

    .line 168
    .line 169
    invoke-static {p1, v0, v2, v5}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ(Lxhss/ᲇᲇᲈᛷ;I[II)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    or-int/2addr v3, v0

    .line 174
    add-int/lit8 v4, v4, 0x1

    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_c
    return v3
.end method

.method public final ᛸᛶᲈᛶ(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛴᛷᛱ:[I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛴᛷᛱ:[I

    .line 10
    .line 11
    :cond_0
    array-length v1, v0

    .line 12
    iget-short v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 13
    .line 14
    if-lt v2, v1, :cond_1

    .line 15
    .line 16
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    mul-int/lit8 v0, v1, 0x2

    .line 19
    .line 20
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    new-array v0, v0, [I

    .line 25
    .line 26
    iget-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛴᛷᛱ:[I

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static {v2, v3, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛴᛷᛱ:[I

    .line 33
    .line 34
    :cond_1
    iget-short v1, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 35
    .line 36
    add-int/lit8 v2, v1, 0x1

    .line 37
    .line 38
    int-to-short v2, v2

    .line 39
    iput-short v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 40
    .line 41
    aput p1, v0, v1

    .line 42
    .line 43
    iget-short p1, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ:S

    .line 44
    .line 45
    add-int/2addr p1, v2

    .line 46
    int-to-short p1, p1

    .line 47
    iget-object p0, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛵᛵᲈ:Lxhss/ᲁᲁᛱᲀ;

    .line 48
    .line 49
    iget-short v0, p0, Lxhss/ᲁᲁᛱᲀ;->ᛸᛴᛶᛳ:S

    .line 50
    .line 51
    if-le p1, v0, :cond_2

    .line 52
    .line 53
    iput-short p1, p0, Lxhss/ᲁᲁᛱᲀ;->ᛸᛴᛶᛳ:S

    .line 54
    .line 55
    :cond_2
    return-void
.end method

.method public final ᛸᛷᲈᲈ()I
    .locals 2

    .line 1
    iget-short v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lxhss/ᛱᲁᲀᛲ;->ᛷᛴᛷᛱ:[I

    .line 6
    .line 7
    add-int/lit8 v0, v0, -0x1

    .line 8
    .line 9
    int-to-short v0, v0

    .line 10
    iput-short v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 11
    .line 12
    aget p0, v1, v0

    .line 13
    .line 14
    return p0

    .line 15
    :cond_0
    iget-short v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ:S

    .line 16
    .line 17
    add-int/lit8 v0, v0, -0x1

    .line 18
    .line 19
    int-to-short v0, v0

    .line 20
    iput-short v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ:S

    .line 21
    .line 22
    neg-int p0, v0

    .line 23
    const/high16 v0, 0x1800000

    .line 24
    .line 25
    or-int/2addr p0, v0

    .line 26
    return p0
.end method

.method public final ᲀᲇᛳᲁ(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ:[I

    .line 2
    .line 3
    const/high16 v0, 0x1400000

    .line 4
    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    array-length v1, p0

    .line 8
    if-lt p1, v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    aget v1, p0, p1

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    or-int/2addr v0, p1

    .line 16
    aput v0, p0, p1

    .line 17
    .line 18
    return v0

    .line 19
    :cond_1
    return v1

    .line 20
    :cond_2
    :goto_0
    or-int p0, p1, v0

    .line 21
    .line 22
    return p0
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᲇᲇᲈᛷ;I)I
    .locals 8

    .line 1
    const v0, 0x400006

    .line 2
    .line 3
    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    const/high16 v1, -0x400000

    .line 7
    .line 8
    and-int/2addr v1, p2

    .line 9
    const/high16 v2, 0xc00000

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    const/high16 v2, 0x1000000

    .line 14
    .line 15
    if-ne v1, v2, :cond_5

    .line 16
    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    iget v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛴᛶᛳ:I

    .line 19
    .line 20
    if-ge v1, v2, :cond_5

    .line 21
    .line 22
    iget-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛸᛲᲀᛵ:[I

    .line 23
    .line 24
    aget v2, v2, v1

    .line 25
    .line 26
    const/high16 v3, -0x4000000

    .line 27
    .line 28
    and-int/2addr v3, v2

    .line 29
    const/high16 v4, 0x3c00000

    .line 30
    .line 31
    and-int/2addr v4, v2

    .line 32
    const v5, 0xfffff

    .line 33
    .line 34
    .line 35
    and-int v6, v2, v5

    .line 36
    .line 37
    const/high16 v7, 0x1400000

    .line 38
    .line 39
    if-ne v4, v7, :cond_1

    .line 40
    .line 41
    iget-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛱᛱᛲᲇ:[I

    .line 42
    .line 43
    aget v2, v2, v6

    .line 44
    .line 45
    :goto_1
    add-int/2addr v2, v3

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/high16 v7, 0x1800000

    .line 48
    .line 49
    if-ne v4, v7, :cond_2

    .line 50
    .line 51
    iget-object v2, p0, Lxhss/ᛱᲁᲀᛲ;->ᛳᲁᲇᛸ:[I

    .line 52
    .line 53
    array-length v4, v2

    .line 54
    sub-int/2addr v4, v6

    .line 55
    aget v2, v2, v4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_2
    if-ne p2, v2, :cond_4

    .line 59
    .line 60
    const/high16 p0, 0x800000

    .line 61
    .line 62
    if-ne p2, v0, :cond_3

    .line 63
    .line 64
    iget-object p2, p1, Lxhss/ᲇᲇᲈᛷ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    :goto_3
    or-int/2addr p0, p1

    .line 71
    return p0

    .line 72
    :cond_3
    and-int/2addr p2, v5

    .line 73
    iget-object v0, p1, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ:[Lxhss/ᛳᛴᛶᛷ;

    .line 74
    .line 75
    aget-object p2, v0, p2

    .line 76
    .line 77
    iget-object p2, p2, Lxhss/ᛳᛴᛶᛷ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lxhss/ᲇᲇᲈᛷ;->ᲈᛳᲀ(Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    return p2
.end method

.method public final ᲇᛸᛳᲁ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/16 v2, 0x28

    .line 7
    .line 8
    if-ne v1, v2, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    move v1, v0

    .line 12
    :goto_0
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/16 v3, 0x29

    .line 17
    .line 18
    if-eq v2, v3, :cond_2

    .line 19
    .line 20
    :goto_1
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v3, 0x5b

    .line 25
    .line 26
    if-ne v2, v3, :cond_0

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    add-int/lit8 v2, v1, 0x1

    .line 32
    .line 33
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v3, 0x4c

    .line 38
    .line 39
    if-ne v1, v3, :cond_1

    .line 40
    .line 41
    const/16 v1, 0x3b

    .line 42
    .line 43
    invoke-virtual {p2, v1, v2}, Ljava/lang/String;->indexOf(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v1, v0

    .line 48
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v1, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    add-int/2addr v0, v1

    .line 56
    :cond_3
    invoke-static {p1, p2, v0}, Lxhss/ᛱᲁᲀᛲ;->ᲇᛴᲇᛵ(Lxhss/ᲇᲇᲈᛷ;Ljava/lang/String;I)I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_5

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 63
    .line 64
    .line 65
    const p2, 0x400004

    .line 66
    .line 67
    .line 68
    if-eq p1, p2, :cond_4

    .line 69
    .line 70
    const p2, 0x400003

    .line 71
    .line 72
    .line 73
    if-ne p1, p2, :cond_5

    .line 74
    .line 75
    :cond_4
    const/high16 p1, 0x400000

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Lxhss/ᛱᲁᲀᛲ;->ᛸᛶᲈᛶ(I)V

    .line 78
    .line 79
    .line 80
    :cond_5
    return-void
.end method

.method public final ᲈᛳᲀ(I)V
    .locals 2

    .line 1
    iget-short v0, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 2
    .line 3
    if-lt v0, p1, :cond_0

    .line 4
    .line 5
    sub-int/2addr v0, p1

    .line 6
    int-to-short p1, v0

    .line 7
    iput-short p1, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-short v1, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ:S

    .line 11
    .line 12
    sub-int/2addr p1, v0

    .line 13
    sub-int/2addr v1, p1

    .line 14
    int-to-short p1, v1

    .line 15
    iput-short p1, p0, Lxhss/ᛱᲁᲀᛲ;->ᲇᛶᛴᲀ:S

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-short p1, p0, Lxhss/ᛱᲁᲀᛲ;->ᲀᲇᛳᲁ:S

    .line 19
    .line 20
    return-void
.end method
