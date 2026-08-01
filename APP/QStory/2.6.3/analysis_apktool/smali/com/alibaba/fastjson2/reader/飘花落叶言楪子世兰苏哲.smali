.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰苏哲;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# virtual methods
.method public final 飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/JSONObject;Ljava/lang/Class;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子世兰苏哲;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 22
    .line 23
    .line 24
    return-object v3

    .line 25
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-wide v4, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 30
    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    or-long v6, v4, p4

    .line 34
    .line 35
    invoke-virtual {v1, v6, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世楪哲(J)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_2
    new-instance v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 47
    .line 48
    invoke-direct {v2}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_6

    .line 56
    .line 57
    iget-char v6, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 58
    .line 59
    const/16 v7, 0x74

    .line 60
    .line 61
    if-eq v6, v7, :cond_5

    .line 62
    .line 63
    const/16 v7, 0x66

    .line 64
    .line 65
    if-ne v6, v7, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    const/16 v7, 0x22

    .line 69
    .line 70
    if-eq v6, v7, :cond_6

    .line 71
    .line 72
    const/16 v7, 0x27

    .line 73
    .line 74
    if-eq v6, v7, :cond_6

    .line 75
    .line 76
    const/16 v7, 0x7d

    .line 77
    .line 78
    if-ne v6, v7, :cond_4

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-object v3

    .line 89
    :cond_5
    :goto_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 90
    .line 91
    .line 92
    return-object v3

    .line 93
    :cond_6
    :goto_1
    const/4 v6, 0x0

    .line 94
    :goto_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    iget-object v8, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 99
    .line 100
    if-eqz v7, :cond_9

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 103
    .line 104
    .line 105
    invoke-static {v2, v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/JSONObject;Ljava/lang/Class;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/function/Function;

    .line 110
    .line 111
    if-eqz v2, :cond_7

    .line 112
    .line 113
    invoke-interface {v2, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :cond_7
    iget-object v0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 118
    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_8
    return-object v1

    .line 125
    :cond_9
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 126
    .line 127
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 128
    .line 129
    .line 130
    move-result-wide v9

    .line 131
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    if-nez v6, :cond_10

    .line 135
    .line 136
    iget-wide v11, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 137
    .line 138
    cmp-long v11, v9, v11

    .line 139
    .line 140
    if-nez v11, :cond_10

    .line 141
    .line 142
    move-wide v11, v4

    .line 143
    or-long v4, p4, v11

    .line 144
    .line 145
    iget-wide v13, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 146
    .line 147
    or-long/2addr v13, v4

    .line 148
    sget-object v15, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 149
    .line 150
    move-object/from16 v16, v3

    .line 151
    .line 152
    move-wide/from16 p2, v4

    .line 153
    .line 154
    iget-wide v3, v15, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 155
    .line 156
    and-long/2addr v3, v13

    .line 157
    const-wide/16 v17, 0x0

    .line 158
    .line 159
    cmp-long v3, v3, v17

    .line 160
    .line 161
    if-nez v3, :cond_a

    .line 162
    .line 163
    :goto_3
    move v15, v6

    .line 164
    goto :goto_5

    .line 165
    :cond_a
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()J

    .line 166
    .line 167
    .line 168
    move-result-wide v3

    .line 169
    invoke-virtual {v0, v7, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-nez v3, :cond_c

    .line 174
    .line 175
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    iget-object v4, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v4, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 182
    .line 183
    move v15, v6

    .line 184
    iget-wide v5, v7, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 185
    .line 186
    or-long/2addr v5, v13

    .line 187
    invoke-virtual {v4, v3, v8, v5, v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    if-eqz v4, :cond_b

    .line 192
    .line 193
    move-object/from16 v19, v4

    .line 194
    .line 195
    move-object v4, v3

    .line 196
    move-object/from16 v3, v19

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    const-string v2, "No suitable ObjectReader found for"

    .line 202
    .line 203
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-object v16

    .line 221
    :cond_c
    move v15, v6

    .line 222
    move-object/from16 v4, v16

    .line 223
    .line 224
    :goto_4
    if-ne v3, v0, :cond_d

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_d
    invoke-interface {v3, v9, v10}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲世兰苏(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    if-eqz v6, :cond_e

    .line 232
    .line 233
    if-nez v4, :cond_e

    .line 234
    .line 235
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    :cond_e
    move-object v7, v4

    .line 240
    const/4 v2, 0x0

    .line 241
    move-object v0, v3

    .line 242
    const/4 v3, 0x0

    .line 243
    move-wide/from16 v4, p2

    .line 244
    .line 245
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    if-eqz v6, :cond_f

    .line 250
    .line 251
    invoke-virtual {v6, v0, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_f
    return-object v0

    .line 255
    :cond_10
    move-object/from16 v16, v3

    .line 256
    .line 257
    move-wide v11, v4

    .line 258
    goto :goto_3

    .line 259
    :goto_5
    invoke-virtual {v0, v9, v10}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-nez v3, :cond_11

    .line 264
    .line 265
    or-long v4, p4, v11

    .line 266
    .line 267
    invoke-virtual {v1, v4, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世哲楪(J)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_11

    .line 272
    .line 273
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲()J

    .line 274
    .line 275
    .line 276
    move-result-wide v3

    .line 277
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    :cond_11
    if-nez v3, :cond_12

    .line 282
    .line 283
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    goto :goto_6

    .line 295
    :cond_12
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    iget-object v3, v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v2, v3, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    :goto_6
    add-int/lit8 v6, v15, 0x1

    .line 305
    .line 306
    move-wide v4, v11

    .line 307
    move-object/from16 v3, v16

    .line 308
    .line 309
    goto/16 :goto_2
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v7, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    return-object v7

    .line 9
    :cond_0
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 10
    .line 11
    or-long v4, v1, p4

    .line 12
    .line 13
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 14
    .line 15
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 16
    .line 17
    move-object v1, p1

    .line 18
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-wide v8, v4

    .line 23
    iget-object v10, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eq v1, v10, :cond_1

    .line 32
    .line 33
    move-object v3, p2

    .line 34
    move-object/from16 v4, p3

    .line 35
    .line 36
    move-wide/from16 v5, p4

    .line 37
    .line 38
    move-object v1, v2

    .line 39
    move-object v2, p1

    .line 40
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰楪哲世()Z

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子世楪苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v2, "expect object, but "

    .line 65
    .line 66
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v7

    .line 92
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 93
    .line 94
    .line 95
    new-instance v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 96
    .line 97
    invoke-direct {v2}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 98
    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_5

    .line 106
    .line 107
    invoke-static {v2, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/JSONObject;Ljava/lang/Class;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    return-object v1

    .line 119
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    iget-wide v11, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 124
    .line 125
    cmp-long v6, v4, v11

    .line 126
    .line 127
    if-nez v6, :cond_9

    .line 128
    .line 129
    if-nez v3, :cond_9

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子哲兰世()J

    .line 132
    .line 133
    .line 134
    move-result-wide v4

    .line 135
    iget-object v6, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 136
    .line 137
    invoke-virtual {p0, v6, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    if-nez v4, :cond_7

    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v6, v7, v4}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    if-eqz v5, :cond_6

    .line 152
    .line 153
    move-object v4, v5

    .line 154
    goto :goto_1

    .line 155
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string v2, "autoType not support : "

    .line 158
    .line 159
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-object v7

    .line 177
    :cond_7
    :goto_1
    if-ne v4, p0, :cond_8

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_8
    const/4 v0, 0x1

    .line 181
    iput-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 182
    .line 183
    move-object v1, p1

    .line 184
    move-object v2, p2

    .line 185
    move-object/from16 v3, p3

    .line 186
    .line 187
    move-object v0, v4

    .line 188
    move-wide/from16 v4, p4

    .line 189
    .line 190
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :cond_9
    const-wide/16 v11, 0x0

    .line 196
    .line 197
    cmp-long v6, v4, v11

    .line 198
    .line 199
    if-nez v6, :cond_a

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_a
    invoke-virtual {p0, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    if-nez v4, :cond_b

    .line 207
    .line 208
    invoke-virtual {p1, v8, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世哲楪(J)Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_b

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲()J

    .line 215
    .line 216
    .line 217
    move-result-wide v4

    .line 218
    invoke-virtual {p0, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    :cond_b
    if-nez v4, :cond_c

    .line 223
    .line 224
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    invoke-virtual {v2, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_c
    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    iget-object v4, v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 241
    .line 242
    invoke-virtual {v2, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 246
    .line 247
    goto/16 :goto_0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    array-length v2, v1

    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_1
    if-ge v3, v2, :cond_3

    .line 19
    .line 20
    aget-object v4, v1, v3

    .line 21
    .line 22
    iget-object v5, v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v5}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    instance-of v6, v5, Ljava/util/Map;

    .line 29
    .line 30
    if-eqz v6, :cond_2

    .line 31
    .line 32
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v4, v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    instance-of v7, v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;

    .line 41
    .line 42
    if-eqz v7, :cond_2

    .line 43
    .line 44
    if-ne v0, p1, :cond_1

    .line 45
    .line 46
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 47
    .line 48
    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>(Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    check-cast v5, Ljava/util/Map;

    .line 52
    .line 53
    invoke-interface {v6, v5, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-object v4, v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v4, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-static {v0, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/JSONObject;Ljava/lang/Class;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method
