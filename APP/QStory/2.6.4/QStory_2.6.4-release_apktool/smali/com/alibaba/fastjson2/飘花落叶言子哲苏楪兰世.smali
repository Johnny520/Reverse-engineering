.class public final Lcom/alibaba/fastjson2/飘花落叶言子哲苏楪兰世;
.super Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# virtual methods
.method public final 飘花落叶言子兰苏楪哲世(Z)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x5

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 6
    .line 7
    array-length v1, v1

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 14
    .line 15
    iget v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 16
    .line 17
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 18
    .line 19
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 20
    .line 21
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBooleanAsNumber:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    and-long/2addr v2, v4

    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v2, v2, v4

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    add-int/lit8 v2, v1, 0x1

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const/16 p1, 0x31

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/16 p1, 0x30

    .line 40
    .line 41
    :goto_0
    aput-char p1, v0, v1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世兰哲楪苏([CIZ)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    :goto_1
    iput v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 49
    .line 50
    return-void
.end method

.method public final 飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V
    .locals 25

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
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世子兰哲()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏哲世:Ljava/util/function/Function;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    move-object v5, v2

    .line 18
    check-cast v5, [B

    .line 19
    .line 20
    sget-object v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 21
    .line 22
    invoke-interface {v2, v1}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    iget-wide v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏兰哲楪:J

    .line 27
    .line 28
    const/16 v4, 0x29

    .line 29
    .line 30
    const/16 v6, 0x28

    .line 31
    .line 32
    const/16 v7, 0x3e

    .line 33
    .line 34
    const/16 v8, 0x3c

    .line 35
    .line 36
    iget-object v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 37
    .line 38
    const/16 v13, 0x20

    .line 39
    .line 40
    const-wide/16 v16, 0x0

    .line 41
    .line 42
    const/16 v9, 0x5c

    .line 43
    .line 44
    iget-char v10, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 45
    .line 46
    if-nez v1, :cond_e

    .line 47
    .line 48
    const/16 p1, 0x2

    .line 49
    .line 50
    iget-wide v14, v11, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 51
    .line 52
    const-wide v18, 0x800000000L

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long v14, v14, v18

    .line 58
    .line 59
    cmp-long v14, v14, v16

    .line 60
    .line 61
    iget v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 62
    .line 63
    if-eqz v14, :cond_6

    .line 64
    .line 65
    array-length v2, v5

    .line 66
    add-int/2addr v2, v15

    .line 67
    add-int/lit8 v2, v2, 0x2

    .line 68
    .line 69
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 70
    .line 71
    array-length v3, v3

    .line 72
    if-lt v2, v3, :cond_1

    .line 73
    .line 74
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 75
    .line 76
    .line 77
    :cond_1
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 78
    .line 79
    add-int/lit8 v3, v15, 0x1

    .line 80
    .line 81
    aput-char v10, v2, v15

    .line 82
    .line 83
    array-length v14, v5

    .line 84
    move/from16 v16, v3

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    :goto_0
    if-ge v1, v14, :cond_5

    .line 88
    .line 89
    const/16 v18, 0x1

    .line 90
    .line 91
    aget-byte v12, v5, v1

    .line 92
    .line 93
    if-eq v12, v9, :cond_3

    .line 94
    .line 95
    if-eq v12, v10, :cond_3

    .line 96
    .line 97
    if-lt v12, v13, :cond_3

    .line 98
    .line 99
    if-eq v12, v8, :cond_3

    .line 100
    .line 101
    if-eq v12, v7, :cond_3

    .line 102
    .line 103
    if-eq v12, v6, :cond_3

    .line 104
    .line 105
    if-ne v12, v4, :cond_2

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    add-int/lit8 v17, v16, 0x1

    .line 109
    .line 110
    int-to-char v12, v12

    .line 111
    aput-char v12, v2, v16

    .line 112
    .line 113
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    move/from16 v16, v17

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_3
    :goto_1
    iput v15, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 119
    .line 120
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 121
    .line 122
    array-length v2, v5

    .line 123
    const/4 v4, 0x6

    .line 124
    move/from16 v6, p1

    .line 125
    .line 126
    invoke-static {v2, v4, v15, v6}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(IIII)I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    array-length v4, v1

    .line 131
    if-lt v2, v4, :cond_4

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 134
    .line 135
    .line 136
    iget-object v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 137
    .line 138
    :cond_4
    iget-char v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 139
    .line 140
    aput-char v7, v1, v15

    .line 141
    .line 142
    const/4 v6, 0x0

    .line 143
    iget-wide v8, v11, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 144
    .line 145
    move v4, v3

    .line 146
    move-object v3, v1

    .line 147
    invoke-static/range {v3 .. v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏([CI[BICJ)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 152
    .line 153
    return-void

    .line 154
    :cond_5
    const/16 v18, 0x1

    .line 155
    .line 156
    aput-char v10, v2, v16

    .line 157
    .line 158
    add-int/lit8 v1, v16, 0x1

    .line 159
    .line 160
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 161
    .line 162
    return-void

    .line 163
    :cond_6
    const/16 v18, 0x1

    .line 164
    .line 165
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 166
    .line 167
    array-length v6, v5

    .line 168
    add-int/2addr v6, v15

    .line 169
    const/4 v7, 0x2

    .line 170
    add-int/2addr v6, v7

    .line 171
    array-length v7, v4

    .line 172
    if-lt v6, v7, :cond_7

    .line 173
    .line 174
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 175
    .line 176
    .line 177
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 178
    .line 179
    :cond_7
    add-int/lit8 v7, v15, 0x1

    .line 180
    .line 181
    aput-char v10, v4, v15

    .line 182
    .line 183
    array-length v8, v5

    .line 184
    and-int/lit8 v8, v8, -0x8

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    :goto_2
    if-ge v15, v8, :cond_8

    .line 188
    .line 189
    move v12, v13

    .line 190
    invoke-static {v5, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲世苏([BI)J

    .line 191
    .line 192
    .line 193
    move-result-wide v13

    .line 194
    invoke-static {v13, v14, v2, v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    move/from16 p1, v12

    .line 199
    .line 200
    if-eqz v1, :cond_9

    .line 201
    .line 202
    move-wide/from16 v16, v13

    .line 203
    .line 204
    invoke-static/range {v16 .. v17}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世子兰(J)J

    .line 205
    .line 206
    .line 207
    move-result-wide v12

    .line 208
    invoke-static {v4, v7, v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲楪兰([CIJ)V

    .line 209
    .line 210
    .line 211
    add-int/lit8 v1, v7, 0x4

    .line 212
    .line 213
    ushr-long v12, v16, p1

    .line 214
    .line 215
    invoke-static {v12, v13}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世子兰(J)J

    .line 216
    .line 217
    .line 218
    move-result-wide v12

    .line 219
    invoke-static {v4, v1, v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲楪兰([CIJ)V

    .line 220
    .line 221
    .line 222
    add-int/lit8 v7, v7, 0x8

    .line 223
    .line 224
    add-int/lit8 v15, v15, 0x8

    .line 225
    .line 226
    move/from16 v13, p1

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_8
    move/from16 p1, v13

    .line 230
    .line 231
    :cond_9
    :goto_3
    array-length v1, v5

    .line 232
    if-ge v15, v1, :cond_d

    .line 233
    .line 234
    aget-byte v1, v5, v15

    .line 235
    .line 236
    if-eq v1, v9, :cond_b

    .line 237
    .line 238
    if-eq v1, v10, :cond_b

    .line 239
    .line 240
    move/from16 v12, p1

    .line 241
    .line 242
    if-ge v1, v12, :cond_a

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_a
    add-int/lit8 v2, v7, 0x1

    .line 246
    .line 247
    int-to-char v1, v1

    .line 248
    aput-char v1, v4, v7

    .line 249
    .line 250
    add-int/lit8 v15, v15, 0x1

    .line 251
    .line 252
    move v7, v2

    .line 253
    const/16 p1, 0x20

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_b
    :goto_4
    array-length v1, v5

    .line 257
    mul-int/lit8 v1, v1, 0x5

    .line 258
    .line 259
    add-int/2addr v1, v6

    .line 260
    array-length v2, v4

    .line 261
    if-lt v1, v2, :cond_c

    .line 262
    .line 263
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 264
    .line 265
    .line 266
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 267
    .line 268
    :cond_c
    move-object v3, v4

    .line 269
    move v4, v7

    .line 270
    iget-char v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰苏世哲:C

    .line 271
    .line 272
    iget-wide v8, v11, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 273
    .line 274
    move v6, v15

    .line 275
    invoke-static/range {v3 .. v9}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲兰苏([CI[BICJ)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iput v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 280
    .line 281
    return-void

    .line 282
    :cond_d
    move v2, v7

    .line 283
    aput-char v10, v4, v2

    .line 284
    .line 285
    add-int/lit8 v7, v2, 0x1

    .line 286
    .line 287
    iput v7, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 288
    .line 289
    return-void

    .line 290
    :cond_e
    const/16 v18, 0x1

    .line 291
    .line 292
    if-nez v5, :cond_f

    .line 293
    .line 294
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世子兰哲()V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_f
    iget-wide v13, v11, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏兰哲:J

    .line 299
    .line 300
    sget-object v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserSecure:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 301
    .line 302
    move-wide/from16 v19, v13

    .line 303
    .line 304
    iget-wide v12, v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 305
    .line 306
    sget-object v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->EscapeNoneAscii:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 307
    .line 308
    move-wide/from16 v21, v2

    .line 309
    .line 310
    iget-wide v1, v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 311
    .line 312
    or-long v11, v12, v1

    .line 313
    .line 314
    and-long v11, v19, v11

    .line 315
    .line 316
    cmp-long v3, v11, v16

    .line 317
    .line 318
    if-eqz v3, :cond_15

    .line 319
    .line 320
    and-long v1, v19, v1

    .line 321
    .line 322
    cmp-long v1, v1, v16

    .line 323
    .line 324
    if-eqz v1, :cond_10

    .line 325
    .line 326
    move/from16 v1, v18

    .line 327
    .line 328
    goto :goto_5

    .line 329
    :cond_10
    const/4 v1, 0x0

    .line 330
    :goto_5
    iget v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 331
    .line 332
    array-length v3, v5

    .line 333
    add-int/2addr v3, v2

    .line 334
    const/4 v11, 0x2

    .line 335
    add-int/2addr v3, v11

    .line 336
    iget-object v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 337
    .line 338
    array-length v11, v11

    .line 339
    if-lt v3, v11, :cond_11

    .line 340
    .line 341
    invoke-virtual {v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 342
    .line 343
    .line 344
    :cond_11
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 345
    .line 346
    add-int/lit8 v11, v2, 0x1

    .line 347
    .line 348
    aput-char v10, v3, v2

    .line 349
    .line 350
    array-length v2, v5

    .line 351
    shr-int/lit8 v2, v2, 0x1

    .line 352
    .line 353
    const/4 v14, 0x0

    .line 354
    :goto_6
    if-ge v14, v2, :cond_14

    .line 355
    .line 356
    invoke-static {v5, v14}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰([BI)C

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    if-eq v13, v9, :cond_13

    .line 361
    .line 362
    if-eq v13, v10, :cond_13

    .line 363
    .line 364
    const/16 v12, 0x20

    .line 365
    .line 366
    if-lt v13, v12, :cond_13

    .line 367
    .line 368
    if-eq v13, v8, :cond_13

    .line 369
    .line 370
    if-eq v13, v7, :cond_13

    .line 371
    .line 372
    if-eq v13, v6, :cond_13

    .line 373
    .line 374
    if-eq v13, v4, :cond_13

    .line 375
    .line 376
    if-eqz v1, :cond_12

    .line 377
    .line 378
    const/16 v15, 0x7f

    .line 379
    .line 380
    if-le v13, v15, :cond_12

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_12
    add-int/lit8 v15, v11, 0x1

    .line 384
    .line 385
    aput-char v13, v3, v11

    .line 386
    .line 387
    add-int/lit8 v14, v14, 0x1

    .line 388
    .line 389
    move v11, v15

    .line 390
    goto :goto_6

    .line 391
    :cond_13
    :goto_7
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏兰世哲子([B)V

    .line 392
    .line 393
    .line 394
    return-void

    .line 395
    :cond_14
    aput-char v10, v3, v11

    .line 396
    .line 397
    add-int/lit8 v11, v11, 0x1

    .line 398
    .line 399
    iput v11, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 400
    .line 401
    return-void

    .line 402
    :cond_15
    iget v1, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 403
    .line 404
    array-length v2, v5

    .line 405
    add-int/2addr v2, v1

    .line 406
    const/4 v6, 0x2

    .line 407
    add-int/2addr v2, v6

    .line 408
    iget-object v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 409
    .line 410
    array-length v3, v3

    .line 411
    if-lt v2, v3, :cond_16

    .line 412
    .line 413
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏哲世兰子(I)V

    .line 414
    .line 415
    .line 416
    :cond_16
    iget-object v2, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言子世苏哲兰楪:[C

    .line 417
    .line 418
    add-int/lit8 v3, v1, 0x1

    .line 419
    .line 420
    aput-char v10, v2, v1

    .line 421
    .line 422
    array-length v1, v5

    .line 423
    shr-int/lit8 v1, v1, 0x1

    .line 424
    .line 425
    const/4 v15, 0x0

    .line 426
    :goto_8
    if-ge v15, v1, :cond_1b

    .line 427
    .line 428
    add-int/lit8 v4, v15, 0x8

    .line 429
    .line 430
    if-ge v4, v1, :cond_17

    .line 431
    .line 432
    shl-int/lit8 v6, v15, 0x1

    .line 433
    .line 434
    invoke-static {v5, v6}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲世苏([BI)J

    .line 435
    .line 436
    .line 437
    move-result-wide v6

    .line 438
    add-int/lit8 v8, v15, 0x4

    .line 439
    .line 440
    shl-int/lit8 v8, v8, 0x1

    .line 441
    .line 442
    invoke-static {v5, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰哲世苏([BI)J

    .line 443
    .line 444
    .line 445
    move-result-wide v13

    .line 446
    or-long v19, v6, v13

    .line 447
    .line 448
    const-wide v23, -0xff00ff00ff0100L    # -5.82767264895205E303

    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    and-long v19, v19, v23

    .line 454
    .line 455
    cmp-long v8, v19, v16

    .line 456
    .line 457
    if-nez v8, :cond_17

    .line 458
    .line 459
    const/16 v8, 0x8

    .line 460
    .line 461
    shl-long v19, v6, v8

    .line 462
    .line 463
    move v8, v10

    .line 464
    or-long v9, v19, v13

    .line 465
    .line 466
    move-wide/from16 v19, v13

    .line 467
    .line 468
    move-wide/from16 v12, v21

    .line 469
    .line 470
    invoke-static {v9, v10, v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 471
    .line 472
    .line 473
    move-result v9

    .line 474
    if-eqz v9, :cond_18

    .line 475
    .line 476
    invoke-static {v2, v3, v6, v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲楪兰([CIJ)V

    .line 477
    .line 478
    .line 479
    add-int/lit8 v6, v3, 0x4

    .line 480
    .line 481
    move-wide/from16 v9, v19

    .line 482
    .line 483
    invoke-static {v2, v6, v9, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏世哲楪兰([CIJ)V

    .line 484
    .line 485
    .line 486
    add-int/lit8 v3, v3, 0x8

    .line 487
    .line 488
    move v15, v4

    .line 489
    move v10, v8

    .line 490
    move-wide/from16 v21, v12

    .line 491
    .line 492
    const/16 v9, 0x5c

    .line 493
    .line 494
    goto :goto_8

    .line 495
    :cond_17
    move v8, v10

    .line 496
    move-wide/from16 v12, v21

    .line 497
    .line 498
    :cond_18
    add-int/lit8 v4, v15, 0x1

    .line 499
    .line 500
    invoke-static {v5, v15}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲世苏兰([BI)C

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    const/16 v7, 0x5c

    .line 505
    .line 506
    if-eq v6, v7, :cond_1a

    .line 507
    .line 508
    if-eq v6, v8, :cond_1a

    .line 509
    .line 510
    const/16 v15, 0x20

    .line 511
    .line 512
    if-ge v6, v15, :cond_19

    .line 513
    .line 514
    goto :goto_9

    .line 515
    :cond_19
    add-int/lit8 v9, v3, 0x1

    .line 516
    .line 517
    aput-char v6, v2, v3

    .line 518
    .line 519
    move v15, v4

    .line 520
    move v10, v8

    .line 521
    move v3, v9

    .line 522
    move-wide/from16 v21, v12

    .line 523
    .line 524
    move v9, v7

    .line 525
    goto :goto_8

    .line 526
    :cond_1a
    :goto_9
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世兰楪苏;->飘花落叶言楪苏兰世哲子([B)V

    .line 527
    .line 528
    .line 529
    return-void

    .line 530
    :cond_1b
    move v8, v10

    .line 531
    aput-char v8, v2, v3

    .line 532
    .line 533
    add-int/lit8 v3, v3, 0x1

    .line 534
    .line 535
    iput v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世楪苏哲兰:I

    .line 536
    .line 537
    return-void
.end method
