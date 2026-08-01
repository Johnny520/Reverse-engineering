.class public abstract L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:C

.field public static final 飘花落叶言子楪世苏兰哲:C

.field public static final 飘花落叶言子楪世苏哲兰:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    sput-object v0, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 5
    .line 6
    const/16 v0, 0x2e

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    sget-char v0, Ljava/io/File;->separatorChar:C

    .line 12
    .line 13
    sput-char v0, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:C

    .line 14
    .line 15
    const/16 v1, 0x5c

    .line 16
    .line 17
    const/16 v2, 0x2f

    .line 18
    .line 19
    if-ne v0, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    move v1, v2

    .line 25
    :goto_0
    sput-char v1, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:C

    .line 26
    .line 27
    const-string v0, "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$"

    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 30
    .line 31
    .line 32
    const-string v0, "^[a-zA-Z0-9][a-zA-Z0-9-]*$"

    .line 33
    .line 34
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static 飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    return v2

    .line 11
    :cond_0
    const/4 v3, 0x0

    .line 12
    if-eqz v0, :cond_15

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_a

    .line 17
    .line 18
    :cond_1
    sget-object v4, Lorg/apache/commons/io/IOCase;->SENSITIVE:Lorg/apache/commons/io/IOCase;

    .line 19
    .line 20
    move-object/from16 v5, p2

    .line 21
    .line 22
    invoke-static {v5, v4}, Lorg/apache/commons/io/IOCase;->value(Lorg/apache/commons/io/IOCase;Lorg/apache/commons/io/IOCase;)Lorg/apache/commons/io/IOCase;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/16 v5, 0x3f

    .line 27
    .line 28
    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const-string v7, "*"

    .line 33
    .line 34
    const-string v8, "?"

    .line 35
    .line 36
    const/4 v9, -0x1

    .line 37
    const/16 v10, 0x2a

    .line 38
    .line 39
    if-ne v6, v9, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1, v10}, Ljava/lang/String;->indexOf(I)I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-ne v6, v9, :cond_2

    .line 46
    .line 47
    filled-new-array {v1}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move/from16 v16, v2

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->toCharArray()[C

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v6, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v11, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    array-length v12, v1

    .line 69
    move v13, v3

    .line 70
    move v14, v13

    .line 71
    :goto_0
    if-ge v13, v12, :cond_8

    .line 72
    .line 73
    aget-char v15, v1, v13

    .line 74
    .line 75
    if-eq v15, v5, :cond_4

    .line 76
    .line 77
    if-ne v15, v10, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    move/from16 v16, v2

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    :goto_1
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 87
    .line 88
    .line 89
    move-result v16

    .line 90
    if-eqz v16, :cond_5

    .line 91
    .line 92
    move/from16 v16, v2

    .line 93
    .line 94
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move/from16 v16, v2

    .line 106
    .line 107
    :goto_2
    if-ne v15, v5, :cond_6

    .line 108
    .line 109
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_6
    if-eq v14, v10, :cond_7

    .line 114
    .line 115
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_7
    :goto_3
    add-int/lit8 v13, v13, 0x1

    .line 119
    .line 120
    move v14, v15

    .line 121
    move/from16 v2, v16

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_8
    move/from16 v16, v2

    .line 125
    .line 126
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_9

    .line 131
    .line 132
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_9
    sget-object v1, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    check-cast v1, [Ljava/lang/String;

    .line 146
    .line 147
    :goto_4
    new-instance v2, Ljava/util/ArrayDeque;

    .line 148
    .line 149
    array-length v5, v1

    .line 150
    invoke-direct {v2, v5}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 151
    .line 152
    .line 153
    move v5, v3

    .line 154
    move v6, v5

    .line 155
    move v10, v6

    .line 156
    :cond_a
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-nez v11, :cond_b

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    check-cast v5, [I

    .line 167
    .line 168
    aget v10, v5, v3

    .line 169
    .line 170
    aget v6, v5, v16

    .line 171
    .line 172
    move/from16 v5, v16

    .line 173
    .line 174
    :cond_b
    :goto_5
    array-length v11, v1

    .line 175
    if-ge v10, v11, :cond_13

    .line 176
    .line 177
    aget-object v11, v1, v10

    .line 178
    .line 179
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v11

    .line 183
    if-eqz v11, :cond_d

    .line 184
    .line 185
    add-int/lit8 v6, v6, 0x1

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    if-le v6, v11, :cond_c

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_c
    :goto_6
    move v5, v3

    .line 195
    goto :goto_8

    .line 196
    :cond_d
    aget-object v11, v1, v10

    .line 197
    .line 198
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-eqz v11, :cond_f

    .line 203
    .line 204
    array-length v5, v1

    .line 205
    add-int/lit8 v5, v5, -0x1

    .line 206
    .line 207
    if-ne v10, v5, :cond_e

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    move v6, v5

    .line 214
    :cond_e
    move/from16 v5, v16

    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_f
    if-eqz v5, :cond_11

    .line 218
    .line 219
    aget-object v11, v1, v10

    .line 220
    .line 221
    invoke-virtual {v4, v0, v6, v11}, Lorg/apache/commons/io/IOCase;->checkIndexOf(Ljava/lang/String;ILjava/lang/String;)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-ne v6, v9, :cond_10

    .line 226
    .line 227
    goto :goto_9

    .line 228
    :cond_10
    add-int/lit8 v5, v6, 0x1

    .line 229
    .line 230
    aget-object v11, v1, v10

    .line 231
    .line 232
    invoke-virtual {v4, v0, v5, v11}, Lorg/apache/commons/io/IOCase;->checkIndexOf(Ljava/lang/String;ILjava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    if-ltz v5, :cond_12

    .line 237
    .line 238
    filled-new-array {v10, v5}, [I

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    invoke-virtual {v2, v5}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_11
    aget-object v11, v1, v10

    .line 247
    .line 248
    invoke-virtual {v4, v0, v6, v11}, Lorg/apache/commons/io/IOCase;->checkRegionMatches(Ljava/lang/String;ILjava/lang/String;)Z

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    if-nez v11, :cond_12

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_12
    :goto_7
    aget-object v5, v1, v10

    .line 256
    .line 257
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    add-int/2addr v5, v6

    .line 262
    move v6, v5

    .line 263
    goto :goto_6

    .line 264
    :goto_8
    add-int/lit8 v10, v10, 0x1

    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_13
    :goto_9
    array-length v11, v1

    .line 268
    if-ne v10, v11, :cond_14

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 271
    .line 272
    .line 273
    move-result v11

    .line 274
    if-ne v6, v11, :cond_14

    .line 275
    .line 276
    return v16

    .line 277
    :cond_14
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v11

    .line 281
    if-eqz v11, :cond_a

    .line 282
    .line 283
    :cond_15
    :goto_a
    return v3
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, -0x1

    .line 6
    const/16 v2, 0x5c

    .line 7
    .line 8
    sget-char v3, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:C

    .line 9
    .line 10
    if-ne v3, v2, :cond_5

    .line 11
    .line 12
    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sget-char v4, L飘花落叶言苏子楪兰世哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:C

    .line 17
    .line 18
    invoke-virtual {p0, v4}, Ljava/lang/String;->lastIndexOf(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-ne v3, v1, :cond_2

    .line 23
    .line 24
    if-ne v4, v1, :cond_1

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    add-int/lit8 v3, v4, 0x1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    if-ne v4, v1, :cond_3

    .line 32
    .line 33
    :goto_0
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    goto :goto_0

    .line 41
    :goto_1
    const/16 v4, 0x3a

    .line 42
    .line 43
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->indexOf(II)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ne v3, v1, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    const-string p0, "NTFS ADS separator (\':\') in file name is forbidden."

    .line 51
    .line 52
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_5
    :goto_2
    const/16 v0, 0x2e

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/16 v3, 0x2f

    .line 63
    .line 64
    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-le v2, v0, :cond_6

    .line 77
    .line 78
    move v0, v1

    .line 79
    :cond_6
    if-ne v0, v1, :cond_7

    .line 80
    .line 81
    const-string p0, ""

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method
