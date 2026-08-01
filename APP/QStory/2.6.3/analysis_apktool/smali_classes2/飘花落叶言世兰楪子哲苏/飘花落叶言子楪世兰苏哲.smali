.class public abstract L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏兰世;

.field public static final 飘花落叶言子楪世苏哲兰:[B


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    sput-object v1, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[B

    .line 5
    .line 6
    sget-object v1, Lokio/ByteString;->Companion:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v1, "efbbbf"

    .line 12
    .line 13
    invoke-static {v1}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lokio/ByteString;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "feff"

    .line 18
    .line 19
    invoke-static {v2}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lokio/ByteString;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "fffe0000"

    .line 24
    .line 25
    invoke-static {v3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lokio/ByteString;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "fffe"

    .line 30
    .line 31
    invoke-static {v4}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lokio/ByteString;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const-string v5, "0000feff"

    .line 36
    .line 37
    invoke-static {v5}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Lokio/ByteString;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    filled-new-array {v1, v2, v3, v4, v5}, [Lokio/ByteString;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v6, Ljava/util/ArrayList;

    .line 46
    .line 47
    new-instance v2, Lkotlin/collections/飘花落叶言子楪苏兰世哲;

    .line 48
    .line 49
    invoke-direct {v2, v1, v0}, Lkotlin/collections/飘花落叶言子楪苏兰世哲;-><init>([Ljava/lang/Object;Z)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    const/4 v3, 0x1

    .line 60
    if-le v2, v3, :cond_0

    .line 61
    .line 62
    invoke-static {v6}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    new-instance v9, Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-direct {v9, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    move v3, v0

    .line 75
    :goto_0
    if-ge v3, v2, :cond_1

    .line 76
    .line 77
    const/4 v4, -0x1

    .line 78
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move v2, v0

    .line 89
    move v3, v2

    .line 90
    :goto_1
    const/4 v10, 0x5

    .line 91
    if-ge v2, v10, :cond_2

    .line 92
    .line 93
    aget-object v4, v1, v2

    .line 94
    .line 95
    add-int/lit8 v5, v3, 0x1

    .line 96
    .line 97
    invoke-static {v6, v4}, L飘花落叶言世哲楪兰子苏/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰哲世(Ljava/util/ArrayList;Ljava/lang/Comparable;)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v9, v4, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    .line 110
    move v3, v5

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Lokio/ByteString;

    .line 117
    .line 118
    invoke-virtual {v2}, Lokio/ByteString;->size()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-lez v2, :cond_8

    .line 123
    .line 124
    move v2, v0

    .line 125
    :goto_2
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-ge v2, v3, :cond_6

    .line 130
    .line 131
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Lokio/ByteString;

    .line 136
    .line 137
    add-int/lit8 v4, v2, 0x1

    .line 138
    .line 139
    move v5, v4

    .line 140
    :goto_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-ge v5, v7, :cond_5

    .line 145
    .line 146
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    check-cast v7, Lokio/ByteString;

    .line 151
    .line 152
    invoke-virtual {v7, v3}, Lokio/ByteString;->startsWith(Lokio/ByteString;)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    if-eqz v8, :cond_5

    .line 157
    .line 158
    invoke-virtual {v7}, Lokio/ByteString;->size()I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    invoke-virtual {v3}, Lokio/ByteString;->size()I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    if-eq v8, v11, :cond_4

    .line 167
    .line 168
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    check-cast v7, Ljava/lang/Number;

    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    check-cast v8, Ljava/lang/Number;

    .line 183
    .line 184
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-le v7, v8, :cond_3

    .line 189
    .line 190
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v7

    .line 197
    check-cast v7, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_4
    const-string v0, "duplicate option: "

    .line 207
    .line 208
    invoke-static {v7, v0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_5
    move v2, v4

    .line 213
    goto :goto_2

    .line 214
    :cond_6
    new-instance v4, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;

    .line 215
    .line 216
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    const/4 v7, 0x0

    .line 220
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    const-wide/16 v2, 0x0

    .line 225
    .line 226
    const/4 v5, 0x0

    .line 227
    invoke-static/range {v2 .. v9}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲世苏兰(JL飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;ILjava/util/ArrayList;IILjava/util/ArrayList;)V

    .line 228
    .line 229
    .line 230
    iget-wide v2, v4, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:J

    .line 231
    .line 232
    const-wide/16 v5, 0x4

    .line 233
    .line 234
    div-long/2addr v2, v5

    .line 235
    long-to-int v2, v2

    .line 236
    new-array v3, v2, [I

    .line 237
    .line 238
    :goto_4
    if-ge v0, v2, :cond_7

    .line 239
    .line 240
    invoke-virtual {v4}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪世兰哲苏;->readInt()I

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    aput v5, v3, v0

    .line 245
    .line 246
    add-int/lit8 v0, v0, 0x1

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_7
    new-instance v0, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏兰世;

    .line 250
    .line 251
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    check-cast v1, [Lokio/ByteString;

    .line 256
    .line 257
    invoke-direct {v0, v1, v3}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏兰世;-><init>([Lokio/ByteString;[I)V

    .line 258
    .line 259
    .line 260
    sput-object v0, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰哲苏子楪/飘花落叶言子楪哲苏兰世;

    .line 261
    .line 262
    return-void

    .line 263
    :cond_8
    const-string v0, "the empty byte string is not a supported option"

    .line 264
    .line 265
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Ljava/lang/String;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/16 v3, 0x1f

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-lez v3, :cond_1

    .line 19
    .line 20
    const/16 v3, 0x7f

    .line 21
    .line 22
    invoke-static {v2, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-ltz v2, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    return v1

    .line 33
    :cond_2
    const/4 p0, -0x1

    .line 34
    return p0
.end method

.method public static final 飘花落叶言子楪世兰苏哲([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    array-length v0, p0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    if-eqz p1, :cond_4

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_1
    array-length v0, p0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    if-ge v2, v0, :cond_4

    .line 18
    .line 19
    aget-object v3, p0, v2

    .line 20
    .line 21
    array-length v4, p1

    .line 22
    move v5, v1

    .line 23
    :goto_1
    if-ge v5, v4, :cond_3

    .line 24
    .line 25
    aget-object v6, p1, v5

    .line 26
    .line 27
    invoke-interface {p2, v3, v6}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_2

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    :goto_2
    return v1
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Ljava/lang/String;CII)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p2, p3, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0, p2}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v0, p1, :cond_0

    .line 11
    .line 12
    return p2

    .line 13
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    return p3
.end method

.method public static final 飘花落叶言子楪世哲苏兰(IILjava/lang/String;Ljava/lang/String;)I
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p0, p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {p3, v0}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏世楪哲兰(Ljava/lang/CharSequence;C)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return p0

    .line 17
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return p1
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    :catch_0
    return-void

    .line 8
    :catch_1
    move-exception p0

    .line 9
    throw p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(JJJ)V
    .locals 4

    .line 1
    or-long v0, p2, p4

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    cmp-long v0, p2, p0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    sub-long v0, p0, p2

    .line 14
    .line 15
    cmp-long p4, v0, p4

    .line 16
    .line 17
    if-ltz p4, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance p4, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 21
    .line 22
    new-instance p5, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v0, "length="

    .line 25
    .line 26
    invoke-direct {p5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p5, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, ", offset="

    .line 33
    .line 34
    invoke-virtual {p5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p5, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, ", count="

    .line 41
    .line 42
    invoke-virtual {p5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p5, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {p4, p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p4
.end method

.method public static final 飘花落叶言子楪哲世苏兰(ILjava/lang/String;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    const-wide/32 v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v0, p0, v0

    .line 11
    .line 12
    if-lez v0, :cond_0

    .line 13
    .line 14
    const p0, 0x7fffffff

    .line 15
    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, p0, v0

    .line 21
    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    long-to-int p0, p0

    .line 27
    :catch_0
    :cond_2
    return p0
.end method

.method public static final 飘花落叶言子楪苏世兰哲(IILjava/lang/String;)I
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    add-int/lit8 p1, p1, -0x1

    .line 5
    .line 6
    if-gt p0, p1, :cond_1

    .line 7
    .line 8
    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/16 v1, 0xc

    .line 21
    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    const/16 v1, 0xd

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    const/16 v1, 0x20

    .line 29
    .line 30
    if-eq v0, v1, :cond_0

    .line 31
    .line 32
    add-int/lit8 p1, p1, 0x1

    .line 33
    .line 34
    return p1

    .line 35
    :cond_0
    if-eq p1, p0, :cond_1

    .line 36
    .line 37
    add-int/lit8 p1, p1, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(IILjava/lang/String;)I
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p0, p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const/16 v1, 0xa

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    const/16 v1, 0xc

    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    const/16 v1, 0xd

    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    const/16 v1, 0x20

    .line 27
    .line 28
    if-eq v0, v1, :cond_0

    .line 29
    .line 30
    return p0

    .line 31
    :cond_0
    add-int/lit8 p0, p0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return p1
.end method

.method public static final 飘花落叶言子楪苏兰世哲(C)I
    .locals 2

    .line 1
    const/16 v0, 0x30

    .line 2
    .line 3
    if-gt v0, p0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x3a

    .line 6
    .line 7
    if-ge p0, v1, :cond_0

    .line 8
    .line 9
    sub-int/2addr p0, v0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 v0, 0x61

    .line 12
    .line 13
    if-gt v0, p0, :cond_1

    .line 14
    .line 15
    const/16 v0, 0x67

    .line 16
    .line 17
    if-ge p0, v0, :cond_1

    .line 18
    .line 19
    add-int/lit8 p0, p0, -0x57

    .line 20
    .line 21
    return p0

    .line 22
    :cond_1
    const/16 v0, 0x41

    .line 23
    .line 24
    if-gt v0, p0, :cond_2

    .line 25
    .line 26
    const/16 v0, 0x47

    .line 27
    .line 28
    if-ge p0, v0, :cond_2

    .line 29
    .line 30
    add-int/lit8 p0, p0, -0x37

    .line 31
    .line 32
    return p0

    .line 33
    :cond_2
    const/4 p0, -0x1

    .line 34
    return p0
.end method

.method public static final 飘花落叶言子楪苏兰哲世(L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;->readByte()B

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    and-int/lit16 v0, v0, 0xff

    .line 9
    .line 10
    shl-int/lit8 v0, v0, 0x10

    .line 11
    .line 12
    invoke-interface {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;->readByte()B

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    and-int/lit16 v1, v1, 0xff

    .line 17
    .line 18
    shl-int/lit8 v1, v1, 0x8

    .line 19
    .line 20
    or-int/2addr v0, v1

    .line 21
    invoke-interface {p0}, L飘花落叶言世兰哲苏子楪/飘花落叶言子楪苏世兰哲;->readByte()B

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    and-int/lit16 p0, p0, 0xff

    .line 26
    .line 27
    or-int/2addr p0, v0

    .line 28
    return p0
.end method

.method public static final 飘花落叶言子楪苏哲世兰([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    array-length v1, p0

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    if-ge v3, v1, :cond_2

    .line 16
    .line 17
    aget-object v4, p0, v3

    .line 18
    .line 19
    array-length v5, p1

    .line 20
    move v6, v2

    .line 21
    :goto_1
    if-ge v6, v5, :cond_1

    .line 22
    .line 23
    aget-object v7, p1, v6

    .line 24
    .line 25
    invoke-interface {p2, v4, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-nez v7, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    new-array p0, v2, [Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, [Ljava/lang/String;

    .line 48
    .line 49
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Authorization"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    const-string v0, "Cookie"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, "Proxy-Authorization"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, "Set-Cookie"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0

    .line 39
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 40
    return p0
.end method
