.class public final Lcom/alibaba/fastjson2/飘花落叶言子哲苏楪世兰;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# virtual methods
.method public final 飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 10
    .line 11
    sget-wide v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰哲苏:J

    .line 12
    .line 13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, [C

    .line 18
    .line 19
    :goto_0
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世子兰哲()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 26
    .line 27
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 28
    .line 29
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 30
    .line 31
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 32
    .line 33
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 34
    .line 35
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 36
    .line 37
    or-long/2addr v4, v6

    .line 38
    and-long/2addr v4, v2

    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    cmp-long v4, v4, v8

    .line 42
    .line 43
    const/16 v5, 0x20

    .line 44
    .line 45
    const/16 v10, 0x5c

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    iget-char v12, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 49
    .line 50
    const/4 v13, 0x1

    .line 51
    if-eqz v4, :cond_7

    .line 52
    .line 53
    and-long/2addr v2, v6

    .line 54
    cmp-long v2, v2, v8

    .line 55
    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    move v2, v13

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v2, v11

    .line 61
    :goto_1
    iget v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 62
    .line 63
    array-length v4, v1

    .line 64
    add-int/2addr v4, v3

    .line 65
    add-int/lit8 v4, v4, 0x2

    .line 66
    .line 67
    iget-object v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 68
    .line 69
    array-length v6, v6

    .line 70
    if-lt v4, v6, :cond_3

    .line 71
    .line 72
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 76
    .line 77
    add-int/lit8 v6, v3, 0x1

    .line 78
    .line 79
    aput-char v12, v4, v3

    .line 80
    .line 81
    array-length v3, v1

    .line 82
    :goto_2
    if-ge v11, v3, :cond_6

    .line 83
    .line 84
    invoke-static {v11, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世(I[C)C

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eq v7, v10, :cond_5

    .line 89
    .line 90
    if-eq v7, v12, :cond_5

    .line 91
    .line 92
    if-lt v7, v5, :cond_5

    .line 93
    .line 94
    const/16 v8, 0x3c

    .line 95
    .line 96
    if-eq v7, v8, :cond_5

    .line 97
    .line 98
    const/16 v8, 0x3e

    .line 99
    .line 100
    if-eq v7, v8, :cond_5

    .line 101
    .line 102
    const/16 v8, 0x28

    .line 103
    .line 104
    if-eq v7, v8, :cond_5

    .line 105
    .line 106
    const/16 v8, 0x29

    .line 107
    .line 108
    if-eq v7, v8, :cond_5

    .line 109
    .line 110
    if-eqz v2, :cond_4

    .line 111
    .line 112
    const/16 v8, 0x7f

    .line 113
    .line 114
    if-le v7, v8, :cond_4

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    add-int/lit8 v8, v6, 0x1

    .line 118
    .line 119
    aput-char v7, v4, v6

    .line 120
    .line 121
    add-int/lit8 v11, v11, 0x1

    .line 122
    .line 123
    move v6, v8

    .line 124
    goto :goto_2

    .line 125
    :cond_5
    :goto_3
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏兰世子哲([C)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_6
    aput-char v12, v4, v6

    .line 130
    .line 131
    add-int/2addr v6, v13

    .line 132
    iput v6, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 133
    .line 134
    return-void

    .line 135
    :cond_7
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 136
    .line 137
    array-length v3, v1

    .line 138
    add-int/2addr v3, v2

    .line 139
    add-int/lit8 v3, v3, 0x2

    .line 140
    .line 141
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 142
    .line 143
    array-length v4, v4

    .line 144
    if-lt v3, v4, :cond_8

    .line 145
    .line 146
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 147
    .line 148
    .line 149
    :cond_8
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 150
    .line 151
    add-int/lit8 v4, v2, 0x1

    .line 152
    .line 153
    aput-char v12, v3, v2

    .line 154
    .line 155
    array-length v2, v1

    .line 156
    :goto_4
    if-ge v11, v2, :cond_e

    .line 157
    .line 158
    add-int/lit8 v6, v11, 0x8

    .line 159
    .line 160
    if-ge v6, v2, :cond_a

    .line 161
    .line 162
    invoke-static {v11, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏哲世(I[C)J

    .line 163
    .line 164
    .line 165
    move-result-wide v14

    .line 166
    add-int/lit8 v7, v11, 0x4

    .line 167
    .line 168
    move-wide/from16 v16, v8

    .line 169
    .line 170
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰苏哲世(I[C)J

    .line 171
    .line 172
    .line 173
    move-result-wide v8

    .line 174
    or-long v18, v14, v8

    .line 175
    .line 176
    const-wide v20, -0xff00ff00ff0100L    # -5.82767264895205E303

    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    and-long v18, v18, v20

    .line 182
    .line 183
    cmp-long v7, v18, v16

    .line 184
    .line 185
    if-nez v7, :cond_9

    .line 186
    .line 187
    const/16 v7, 0x8

    .line 188
    .line 189
    shl-long v18, v14, v7

    .line 190
    .line 191
    move v7, v6

    .line 192
    or-long v5, v18, v8

    .line 193
    .line 194
    move/from16 v19, v11

    .line 195
    .line 196
    iget-wide v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏兰哲楪:J

    .line 197
    .line 198
    invoke-static {v5, v6, v10, v11}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_b

    .line 203
    .line 204
    invoke-static {v3, v4, v14, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲楪兰([CIJ)V

    .line 205
    .line 206
    .line 207
    add-int/lit8 v5, v4, 0x4

    .line 208
    .line 209
    invoke-static {v3, v5, v8, v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲楪兰([CIJ)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v4, v4, 0x8

    .line 213
    .line 214
    move v11, v7

    .line 215
    move-wide/from16 v8, v16

    .line 216
    .line 217
    const/16 v5, 0x20

    .line 218
    .line 219
    const/16 v10, 0x5c

    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_9
    :goto_5
    move/from16 v19, v11

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_a
    move-wide/from16 v16, v8

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_b
    :goto_6
    add-int/lit8 v11, v19, 0x1

    .line 229
    .line 230
    move/from16 v7, v19

    .line 231
    .line 232
    invoke-static {v7, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏兰哲世(I[C)C

    .line 233
    .line 234
    .line 235
    move-result v5

    .line 236
    const/16 v6, 0x5c

    .line 237
    .line 238
    if-eq v5, v6, :cond_d

    .line 239
    .line 240
    if-eq v5, v12, :cond_d

    .line 241
    .line 242
    const/16 v7, 0x20

    .line 243
    .line 244
    if-ge v5, v7, :cond_c

    .line 245
    .line 246
    goto :goto_7

    .line 247
    :cond_c
    add-int/lit8 v8, v4, 0x1

    .line 248
    .line 249
    aput-char v5, v3, v4

    .line 250
    .line 251
    move v10, v6

    .line 252
    move v5, v7

    .line 253
    move v4, v8

    .line 254
    move-wide/from16 v8, v16

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_d
    :goto_7
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏兰世子哲([C)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :cond_e
    aput-char v12, v3, v4

    .line 262
    .line 263
    add-int/2addr v4, v13

    .line 264
    iput v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 265
    .line 266
    return-void
.end method
