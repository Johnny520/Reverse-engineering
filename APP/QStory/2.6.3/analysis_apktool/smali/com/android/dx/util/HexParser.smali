.class public final Lcom/android/dx/util/HexParser;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static parse(Ljava/lang/String;)[B
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    div-int/lit8 v2, v1, 0x2

    .line 8
    .line 9
    new-array v3, v2, [B

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v4

    .line 13
    move v6, v5

    .line 14
    :goto_0
    if-ge v5, v1, :cond_f

    .line 15
    .line 16
    const/16 v7, 0xa

    .line 17
    .line 18
    invoke-virtual {v0, v7, v5}, Ljava/lang/String;->indexOf(II)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    if-gez v7, :cond_0

    .line 23
    .line 24
    move v7, v1

    .line 25
    :cond_0
    const/16 v8, 0x23

    .line 26
    .line 27
    invoke-virtual {v0, v8, v5}, Ljava/lang/String;->indexOf(II)I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-ltz v8, :cond_1

    .line 32
    .line 33
    if-ge v8, v7, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v0, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 45
    .line 46
    const/16 v8, 0x3a

    .line 47
    .line 48
    invoke-virtual {v5, v8}, Ljava/lang/String;->indexOf(I)I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    const/4 v9, 0x0

    .line 53
    const/16 v10, 0x10

    .line 54
    .line 55
    const/16 v11, 0x22

    .line 56
    .line 57
    const/4 v12, -0x1

    .line 58
    if-eq v8, v12, :cond_4

    .line 59
    .line 60
    invoke-virtual {v5, v11}, Ljava/lang/String;->indexOf(I)I

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    if-eq v13, v12, :cond_2

    .line 65
    .line 66
    if-ge v13, v8, :cond_2

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-virtual {v5, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v13

    .line 77
    add-int/lit8 v8, v8, 0x1

    .line 78
    .line 79
    invoke-virtual {v5, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v13, v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-ne v8, v6, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    const-string v0, "bogus offset marker: "

    .line 91
    .line 92
    invoke-static {v0, v13}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-static {v0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v9

    .line 100
    :cond_4
    :goto_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    move v13, v4

    .line 105
    move v15, v13

    .line 106
    move-object/from16 v16, v9

    .line 107
    .line 108
    move v14, v12

    .line 109
    :goto_3
    const-string v9, "spare digit around offset "

    .line 110
    .line 111
    if-ge v13, v8, :cond_c

    .line 112
    .line 113
    invoke-virtual {v5, v13}, Ljava/lang/String;->charAt(I)C

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    if-eqz v15, :cond_6

    .line 118
    .line 119
    if-ne v4, v11, :cond_5

    .line 120
    .line 121
    move v9, v10

    .line 122
    const/4 v15, 0x0

    .line 123
    goto :goto_5

    .line 124
    :cond_5
    int-to-byte v4, v4

    .line 125
    aput-byte v4, v3, v6

    .line 126
    .line 127
    add-int/lit8 v6, v6, 0x1

    .line 128
    .line 129
    move v9, v10

    .line 130
    goto :goto_5

    .line 131
    :cond_6
    const/16 v10, 0x20

    .line 132
    .line 133
    if-gt v4, v10, :cond_7

    .line 134
    .line 135
    :goto_4
    const/16 v9, 0x10

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_7
    if-ne v4, v11, :cond_9

    .line 139
    .line 140
    if-ne v14, v12, :cond_8

    .line 141
    .line 142
    const/4 v15, 0x1

    .line 143
    goto :goto_4

    .line 144
    :cond_8
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object v16

    .line 152
    :cond_9
    const/16 v9, 0x10

    .line 153
    .line 154
    invoke-static {v4, v9}, Ljava/lang/Character;->digit(CI)I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eq v10, v12, :cond_b

    .line 159
    .line 160
    if-ne v14, v12, :cond_a

    .line 161
    .line 162
    move v14, v10

    .line 163
    goto :goto_5

    .line 164
    :cond_a
    shl-int/lit8 v4, v14, 0x4

    .line 165
    .line 166
    or-int/2addr v4, v10

    .line 167
    int-to-byte v4, v4

    .line 168
    aput-byte v4, v3, v6

    .line 169
    .line 170
    add-int/lit8 v6, v6, 0x1

    .line 171
    .line 172
    move v14, v12

    .line 173
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 174
    .line 175
    move v10, v9

    .line 176
    const/4 v4, 0x0

    .line 177
    goto :goto_3

    .line 178
    :cond_b
    new-instance v0, Ljava/lang/RuntimeException;

    .line 179
    .line 180
    new-instance v1, Ljava/lang/StringBuilder;

    .line 181
    .line 182
    const-string v2, "bogus digit character: \""

    .line 183
    .line 184
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string v2, "\""

    .line 191
    .line 192
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    throw v0

    .line 203
    :cond_c
    if-ne v14, v12, :cond_e

    .line 204
    .line 205
    if-nez v15, :cond_d

    .line 206
    .line 207
    move v5, v7

    .line 208
    const/4 v4, 0x0

    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_d
    const-string v0, "unterminated quote around offset "

    .line 212
    .line 213
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-object v16

    .line 221
    :cond_e
    invoke-static {v6}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v0, v9}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-object v16

    .line 229
    :cond_f
    if-ge v6, v2, :cond_10

    .line 230
    .line 231
    new-array v0, v6, [B

    .line 232
    .line 233
    const/4 v1, 0x0

    .line 234
    invoke-static {v3, v1, v0, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 235
    .line 236
    .line 237
    return-object v0

    .line 238
    :cond_10
    return-object v3
.end method
