.class public abstract Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

.field public static 飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;

.field public static 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;


# direct methods
.method public static final 飘花落叶言子楪世兰哲苏(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世哲苏;
    .locals 4

    .line 1
    invoke-virtual {p0}, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰()Landroidx/compose/foundation/text/selection/CrossStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;

    .line 8
    .line 9
    sget-object v1, Landroidx/compose/foundation/text/selection/CrossStatus;->CROSSED:Landroidx/compose/foundation/text/selection/CrossStatus;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v3

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v0, v2

    .line 18
    :goto_0
    new-instance v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世哲苏;

    .line 19
    .line 20
    invoke-static {p0, v0, v3, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲兰世(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;ZZLandroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {p0, v0, v2, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏哲兰世(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;ZZLandroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v1, v3, p0, v0}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世哲苏;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;Z)V

    .line 29
    .line 30
    .line 31
    return-object v1
.end method

.method public static final 飘花落叶言子楪世兰苏哲(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 16

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v10, p2

    .line 4
    .line 5
    move/from16 v11, p4

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    check-cast v8, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 10
    .line 11
    const v0, -0x50245748

    .line 12
    .line 13
    .line 14
    invoke-virtual {v8, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v0, v11, 0x6

    .line 18
    .line 19
    const/4 v2, 0x4

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v8, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰(Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    move v0, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x2

    .line 31
    :goto_0
    or-int/2addr v0, v11

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v0, v11

    .line 34
    :goto_1
    and-int/lit8 v3, v11, 0x30

    .line 35
    .line 36
    const/16 v4, 0x20

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-virtual {v8, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    move v3, v4

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v3, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v0, v3

    .line 55
    :cond_3
    and-int/lit16 v3, v11, 0x180

    .line 56
    .line 57
    if-nez v3, :cond_5

    .line 58
    .line 59
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    const/16 v3, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v3, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v0, v3

    .line 71
    :cond_5
    and-int/lit16 v3, v0, 0x93

    .line 72
    .line 73
    const/16 v5, 0x92

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x1

    .line 77
    if-eq v3, v5, :cond_6

    .line 78
    .line 79
    move v3, v7

    .line 80
    goto :goto_4

    .line 81
    :cond_6
    move v3, v6

    .line 82
    :goto_4
    and-int/lit8 v5, v0, 0x1

    .line 83
    .line 84
    invoke-virtual {v8, v5, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    if-eqz v3, :cond_13

    .line 89
    .line 90
    and-int/lit8 v3, v0, 0xe

    .line 91
    .line 92
    if-ne v3, v2, :cond_7

    .line 93
    .line 94
    move v5, v7

    .line 95
    goto :goto_5

    .line 96
    :cond_7
    move v5, v6

    .line 97
    :goto_5
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    or-int/2addr v5, v9

    .line 102
    invoke-virtual {v8}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    sget-object v12, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 107
    .line 108
    if-nez v5, :cond_8

    .line 109
    .line 110
    if-ne v9, v12, :cond_9

    .line 111
    .line 112
    :cond_8
    new-instance v9, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰楪哲苏;

    .line 113
    .line 114
    invoke-direct {v9, v10, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰楪哲苏;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;Z)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8, v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_9
    check-cast v9, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;

    .line 121
    .line 122
    invoke-virtual {v8, v10}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-ne v3, v2, :cond_a

    .line 127
    .line 128
    move v2, v7

    .line 129
    goto :goto_6

    .line 130
    :cond_a
    move v2, v6

    .line 131
    :goto_6
    or-int/2addr v2, v5

    .line 132
    invoke-virtual {v8}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    if-nez v2, :cond_b

    .line 137
    .line 138
    if-ne v3, v12, :cond_c

    .line 139
    .line 140
    :cond_b
    new-instance v3, Landroidx/compose/foundation/text/selection/飘花落叶言子苏楪世哲兰;

    .line 141
    .line 142
    invoke-direct {v3, v10, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子苏楪世哲兰;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_c
    check-cast v3, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;

    .line 149
    .line 150
    invoke-virtual {v10}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰世哲苏()Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget-wide v13, v2, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 155
    .line 156
    invoke-static {v13, v14}, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪苏世兰哲(J)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v1, :cond_d

    .line 161
    .line 162
    invoke-virtual {v10}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰世哲苏()Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    iget-wide v13, v5, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 167
    .line 168
    shr-long v4, v13, v4

    .line 169
    .line 170
    :goto_7
    long-to-int v4, v4

    .line 171
    goto :goto_8

    .line 172
    :cond_d
    invoke-virtual {v10}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪兰世哲苏()Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    iget-wide v4, v4, Landroidx/compose/ui/text/input/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 177
    .line 178
    const-wide v13, 0xffffffffL

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    and-long/2addr v4, v13

    .line 184
    goto :goto_7

    .line 185
    :goto_8
    iget-object v5, v10, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 186
    .line 187
    if-eqz v5, :cond_10

    .line 188
    .line 189
    invoke-virtual {v5}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲兰苏()Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    if-eqz v5, :cond_10

    .line 194
    .line 195
    iget-object v5, v5, Landroidx/compose/foundation/text/飘花落叶言子哲楪世苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 196
    .line 197
    if-eqz v5, :cond_10

    .line 198
    .line 199
    if-ltz v4, :cond_10

    .line 200
    .line 201
    iget-object v14, v5, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;

    .line 202
    .line 203
    iget-object v5, v5, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 204
    .line 205
    iget-object v14, v14, Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 206
    .line 207
    iget-object v14, v14, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 210
    .line 211
    .line 212
    move-result v14

    .line 213
    if-nez v14, :cond_e

    .line 214
    .line 215
    goto :goto_9

    .line 216
    :cond_e
    invoke-virtual {v5, v4}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    iget v15, v5, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 221
    .line 222
    sub-int/2addr v15, v7

    .line 223
    iget v13, v5, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏:I

    .line 224
    .line 225
    sub-int/2addr v13, v7

    .line 226
    invoke-static {v15, v13}, Ljava/lang/Math;->min(II)I

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    invoke-static {v14, v13}, Ljava/lang/Math;->min(II)I

    .line 231
    .line 232
    .line 233
    move-result v13

    .line 234
    invoke-virtual {v5, v13, v6}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(IZ)I

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    if-le v4, v6, :cond_f

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_f
    invoke-virtual {v5, v13}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(I)V

    .line 242
    .line 243
    .line 244
    iget-object v4, v5, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-static {v13, v4}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲(ILjava/util/List;)I

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    check-cast v4, Landroidx/compose/ui/text/飘花落叶言子楪哲苏世兰;

    .line 255
    .line 256
    iget-object v5, v4, Landroidx/compose/ui/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪世苏哲兰;

    .line 257
    .line 258
    iget v4, v4, Landroidx/compose/ui/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:I

    .line 259
    .line 260
    sub-int/2addr v13, v4

    .line 261
    iget-object v4, v5, Landroidx/compose/ui/text/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子苏楪兰哲世/飘花落叶言子楪苏哲兰世;

    .line 262
    .line 263
    invoke-virtual {v4, v13}, L飘花落叶言子苏楪兰哲世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(I)F

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    invoke-virtual {v4, v13}, L飘花落叶言子苏楪兰哲世/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰(I)F

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    sub-float v13, v5, v4

    .line 272
    .line 273
    move v6, v13

    .line 274
    goto :goto_a

    .line 275
    :cond_10
    :goto_9
    const/4 v6, 0x0

    .line 276
    :goto_a
    invoke-virtual {v8, v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v4

    .line 280
    invoke-virtual {v8}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    if-nez v4, :cond_11

    .line 285
    .line 286
    if-ne v5, v12, :cond_12

    .line 287
    .line 288
    :cond_11
    new-instance v5, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲苏兰;

    .line 289
    .line 290
    invoke-direct {v5, v9, v7}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v8, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_12
    check-cast v5, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 297
    .line 298
    sget-object v4, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 299
    .line 300
    invoke-static {v4, v9, v5}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 301
    .line 302
    .line 303
    move-result-object v7

    .line 304
    shl-int/lit8 v0, v0, 0x3

    .line 305
    .line 306
    and-int/lit16 v9, v0, 0x3f0

    .line 307
    .line 308
    const-wide/16 v4, 0x0

    .line 309
    .line 310
    move-object v0, v3

    .line 311
    move v3, v2

    .line 312
    move-object/from16 v2, p1

    .line 313
    .line 314
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 315
    .line 316
    .line 317
    goto :goto_b

    .line 318
    :cond_13
    invoke-virtual {v8}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 319
    .line 320
    .line 321
    :goto_b
    invoke-virtual {v8}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    if-eqz v0, :cond_14

    .line 326
    .line 327
    new-instance v2, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世哲兰;

    .line 328
    .line 329
    move-object/from16 v3, p1

    .line 330
    .line 331
    invoke-direct {v2, v1, v3, v10, v11}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世哲兰;-><init>(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;I)V

    .line 332
    .line 333
    .line 334
    iput-object v2, v0, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 335
    .line 336
    :cond_14
    return-void
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 7

    .line 1
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, -0x6e8e8303

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p3

    .line 19
    and-int/lit8 v1, v0, 0x13

    .line 20
    .line 21
    const/16 v2, 0x12

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    move v1, v3

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 v1, 0x0

    .line 29
    :goto_1
    and-int/2addr v0, v3

    .line 30
    invoke-virtual {p2, v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 41
    .line 42
    if-ne v0, v1, :cond_2

    .line 43
    .line 44
    sget-object v0, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世哲苏楪兰;

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    check-cast v0, Landroidx/compose/ui/layout/飘花落叶言子世兰苏楪哲;

    .line 50
    .line 51
    iget-wide v1, p2, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏哲楪:J

    .line 52
    .line 53
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰哲世()Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-static {p2, p0}, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;

    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪哲兰世()V

    .line 73
    .line 74
    .line 75
    iget-boolean v6, p2, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏楪哲:Z

    .line 76
    .line 77
    if-eqz v6, :cond_3

    .line 78
    .line 79
    invoke-virtual {p2, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏哲楪世兰()V

    .line 84
    .line 85
    .line 86
    :goto_2
    sget-object v5, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 87
    .line 88
    invoke-static {p2, v0, v5}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 89
    .line 90
    .line 91
    sget-object v0, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 92
    .line 93
    invoke-static {p2, v2, v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget-object v1, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 101
    .line 102
    invoke-static {p2, v0, v1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 103
    .line 104
    .line 105
    sget-object v0, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 106
    .line 107
    invoke-static {p2, v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 108
    .line 109
    .line 110
    sget-object v0, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 111
    .line 112
    invoke-static {p2, v4, v0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏楪兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V

    .line 113
    .line 114
    .line 115
    const/4 v0, 0x6

    .line 116
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p1, p2, v0}, Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 128
    .line 129
    .line 130
    :goto_3
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    new-instance v0, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲楪兰苏;

    .line 137
    .line 138
    invoke-direct {v0, p0, p1, p3}, Landroidx/compose/foundation/text/selection/飘花落叶言子世哲楪兰苏;-><init>(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;I)V

    .line 139
    .line 140
    .line 141
    iput-object v0, p2, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 142
    .line 143
    :cond_5
    return-void
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;ZLandroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 4

    .line 1
    check-cast p3, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, 0x7ddd909a

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p4, 0x6

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x2

    .line 22
    :goto_0
    or-int/2addr v0, p4

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p4

    .line 25
    :goto_1
    invoke-virtual {p3, p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/16 v1, 0x20

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    const/16 v1, 0x10

    .line 35
    .line 36
    :goto_2
    or-int/2addr v0, v1

    .line 37
    invoke-virtual {p3, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰(Z)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    const/16 v1, 0x100

    .line 44
    .line 45
    goto :goto_3

    .line 46
    :cond_3
    const/16 v1, 0x80

    .line 47
    .line 48
    :goto_3
    or-int/2addr v0, v1

    .line 49
    and-int/lit16 v1, v0, 0x93

    .line 50
    .line 51
    const/16 v2, 0x92

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    if-eq v1, v2, :cond_4

    .line 55
    .line 56
    move v1, v3

    .line 57
    goto :goto_4

    .line 58
    :cond_4
    const/4 v1, 0x0

    .line 59
    :goto_4
    and-int/2addr v0, v3

    .line 60
    invoke-virtual {p3, v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    sget-object v0, Landroidx/compose/foundation/text/selection/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 67
    .line 68
    const/high16 v0, 0x41c80000    # 25.0f

    .line 69
    .line 70
    invoke-static {p0, v0, v0}, Landroidx/compose/foundation/layout/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪苏世哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;FF)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    new-instance v1, Landroidx/compose/foundation/text/飘花落叶言子苏哲兰楪世;

    .line 75
    .line 76
    invoke-direct {v1, p1, v3, p2}, Landroidx/compose/foundation/text/飘花落叶言子苏哲兰楪世;-><init>(Ljava/lang/Object;IZ)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {p3, v0}, Landroidx/compose/foundation/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)V

    .line 84
    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_5
    invoke-virtual {p3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 88
    .line 89
    .line 90
    :goto_5
    invoke-virtual {p3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 91
    .line 92
    .line 93
    move-result-object p3

    .line 94
    if-eqz p3, :cond_6

    .line 95
    .line 96
    new-instance v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世哲兰;

    .line 97
    .line 98
    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世哲兰;-><init>(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;ZI)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p3, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 102
    .line 103
    :cond_6
    return-void
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 18

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move/from16 v9, p3

    .line 8
    .line 9
    move-object/from16 v10, p7

    .line 10
    .line 11
    move/from16 v11, p9

    .line 12
    .line 13
    move-object/from16 v12, p8

    .line 14
    .line 15
    check-cast v12, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 16
    .line 17
    const v0, -0x1bcadee8

    .line 18
    .line 19
    .line 20
    invoke-virtual {v12, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v0, v11, 0x6

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    and-int/lit8 v0, v11, 0x8

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v12, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v12, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :goto_0
    if-eqz v0, :cond_1

    .line 42
    .line 43
    move v0, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/4 v0, 0x2

    .line 46
    :goto_1
    or-int/2addr v0, v11

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v0, v11

    .line 49
    :goto_2
    and-int/lit8 v2, v11, 0x30

    .line 50
    .line 51
    const/16 v3, 0x20

    .line 52
    .line 53
    if-nez v2, :cond_4

    .line 54
    .line 55
    invoke-virtual {v12, v7}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰(Z)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    move v2, v3

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    const/16 v2, 0x10

    .line 64
    .line 65
    :goto_3
    or-int/2addr v0, v2

    .line 66
    :cond_4
    and-int/lit16 v2, v11, 0x180

    .line 67
    .line 68
    if-nez v2, :cond_6

    .line 69
    .line 70
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {v12, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏(I)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    const/16 v2, 0x100

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_5
    const/16 v2, 0x80

    .line 84
    .line 85
    :goto_4
    or-int/2addr v0, v2

    .line 86
    :cond_6
    and-int/lit16 v2, v11, 0xc00

    .line 87
    .line 88
    if-nez v2, :cond_8

    .line 89
    .line 90
    invoke-virtual {v12, v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰(Z)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-eqz v2, :cond_7

    .line 95
    .line 96
    const/16 v2, 0x800

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_7
    const/16 v2, 0x400

    .line 100
    .line 101
    :goto_5
    or-int/2addr v0, v2

    .line 102
    :cond_8
    and-int/lit16 v2, v11, 0x6000

    .line 103
    .line 104
    if-nez v2, :cond_9

    .line 105
    .line 106
    or-int/lit16 v0, v0, 0x2000

    .line 107
    .line 108
    :cond_9
    const/high16 v2, 0x180000

    .line 109
    .line 110
    and-int/2addr v2, v11

    .line 111
    if-nez v2, :cond_b

    .line 112
    .line 113
    invoke-virtual {v12, v10}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_a

    .line 118
    .line 119
    const/high16 v2, 0x100000

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_a
    const/high16 v2, 0x80000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v0, v2

    .line 125
    :cond_b
    const v2, 0x82493

    .line 126
    .line 127
    .line 128
    and-int/2addr v2, v0

    .line 129
    const v4, 0x82492

    .line 130
    .line 131
    .line 132
    const/4 v5, 0x0

    .line 133
    if-eq v2, v4, :cond_c

    .line 134
    .line 135
    const/4 v2, 0x1

    .line 136
    goto :goto_7

    .line 137
    :cond_c
    move v2, v5

    .line 138
    :goto_7
    and-int/lit8 v4, v0, 0x1

    .line 139
    .line 140
    invoke-virtual {v12, v4, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_1c

    .line 145
    .line 146
    invoke-virtual {v12}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏哲楪()V

    .line 147
    .line 148
    .line 149
    and-int/lit8 v2, v11, 0x1

    .line 150
    .line 151
    const v4, -0xe001

    .line 152
    .line 153
    .line 154
    if-eqz v2, :cond_e

    .line 155
    .line 156
    invoke-virtual {v12}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏哲兰()Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-eqz v2, :cond_d

    .line 161
    .line 162
    goto :goto_8

    .line 163
    :cond_d
    invoke-virtual {v12}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 164
    .line 165
    .line 166
    and-int/2addr v0, v4

    .line 167
    move-wide/from16 v14, p4

    .line 168
    .line 169
    goto :goto_9

    .line 170
    :cond_e
    :goto_8
    and-int/2addr v0, v4

    .line 171
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    :goto_9
    invoke-virtual {v12}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰世苏()V

    .line 177
    .line 178
    .line 179
    if-eqz v7, :cond_12

    .line 180
    .line 181
    sget-object v2, Landroidx/compose/foundation/text/selection/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 182
    .line 183
    sget-object v2, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Ltr:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 184
    .line 185
    if-ne v8, v2, :cond_f

    .line 186
    .line 187
    if-eqz v9, :cond_10

    .line 188
    .line 189
    :cond_f
    sget-object v2, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Rtl:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 190
    .line 191
    if-ne v8, v2, :cond_11

    .line 192
    .line 193
    if-eqz v9, :cond_11

    .line 194
    .line 195
    :cond_10
    const/4 v2, 0x1

    .line 196
    goto :goto_a

    .line 197
    :cond_11
    move v2, v5

    .line 198
    :goto_a
    move v4, v2

    .line 199
    goto :goto_b

    .line 200
    :cond_12
    sget-object v2, Landroidx/compose/foundation/text/selection/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏哲世;

    .line 201
    .line 202
    sget-object v2, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Ltr:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 203
    .line 204
    if-ne v8, v2, :cond_13

    .line 205
    .line 206
    if-eqz v9, :cond_14

    .line 207
    .line 208
    :cond_13
    sget-object v2, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Rtl:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 209
    .line 210
    if-ne v8, v2, :cond_15

    .line 211
    .line 212
    if-eqz v9, :cond_15

    .line 213
    .line 214
    :cond_14
    move v4, v5

    .line 215
    goto :goto_b

    .line 216
    :cond_15
    const/4 v4, 0x1

    .line 217
    :goto_b
    if-eqz v4, :cond_16

    .line 218
    .line 219
    sget-object v2, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/飘花落叶言子楪世哲兰苏;

    .line 220
    .line 221
    goto :goto_c

    .line 222
    :cond_16
    sget-object v2, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/飘花落叶言子楪世哲兰苏;

    .line 223
    .line 224
    :goto_c
    and-int/lit8 v13, v0, 0xe

    .line 225
    .line 226
    if-eq v13, v1, :cond_18

    .line 227
    .line 228
    and-int/lit8 v1, v0, 0x8

    .line 229
    .line 230
    if-eqz v1, :cond_17

    .line 231
    .line 232
    invoke-virtual {v12, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-eqz v1, :cond_17

    .line 237
    .line 238
    goto :goto_d

    .line 239
    :cond_17
    move v1, v5

    .line 240
    goto :goto_e

    .line 241
    :cond_18
    :goto_d
    const/4 v1, 0x1

    .line 242
    :goto_e
    and-int/lit8 v0, v0, 0x70

    .line 243
    .line 244
    if-ne v0, v3, :cond_19

    .line 245
    .line 246
    const/4 v0, 0x1

    .line 247
    goto :goto_f

    .line 248
    :cond_19
    move v0, v5

    .line 249
    :goto_f
    or-int/2addr v0, v1

    .line 250
    invoke-virtual {v12, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰(Z)Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    or-int/2addr v0, v1

    .line 255
    invoke-virtual {v12}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    if-nez v0, :cond_1a

    .line 260
    .line 261
    sget-object v0, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 262
    .line 263
    if-ne v1, v0, :cond_1b

    .line 264
    .line 265
    :cond_1a
    new-instance v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪世苏兰哲;

    .line 266
    .line 267
    invoke-direct {v1, v6, v7, v4}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;ZZ)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v12, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    :cond_1b
    check-cast v1, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 274
    .line 275
    invoke-static {v10, v5, v1}, Landroidx/compose/ui/semantics/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;ZL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    sget-object v0, Landroidx/compose/ui/platform/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪兰世哲苏:Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    move-object v1, v0

    .line 286
    check-cast v1, Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 287
    .line 288
    new-instance v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪世哲苏兰;

    .line 289
    .line 290
    move-wide/from16 v16, v14

    .line 291
    .line 292
    move-object v14, v2

    .line 293
    move-wide/from16 v2, v16

    .line 294
    .line 295
    invoke-direct/range {v0 .. v6}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪世哲苏兰;-><init>(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;JZLandroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;)V

    .line 296
    .line 297
    .line 298
    const v1, 0x515e2041

    .line 299
    .line 300
    .line 301
    invoke-static {v1, v0, v12}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(ILkotlin/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    or-int/lit16 v1, v13, 0x180

    .line 306
    .line 307
    invoke-static {v6, v14, v0, v12, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 308
    .line 309
    .line 310
    goto :goto_10

    .line 311
    :cond_1c
    invoke-virtual {v12}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 312
    .line 313
    .line 314
    move-wide/from16 v2, p4

    .line 315
    .line 316
    :goto_10
    invoke-virtual {v12}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    if-eqz v12, :cond_1d

    .line 321
    .line 322
    new-instance v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪世哲兰苏;

    .line 323
    .line 324
    move-object v1, v6

    .line 325
    move v4, v9

    .line 326
    move v9, v11

    .line 327
    move-wide v5, v2

    .line 328
    move v2, v7

    .line 329
    move-object v3, v8

    .line 330
    move-object v8, v10

    .line 331
    move/from16 v7, p6

    .line 332
    .line 333
    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪世哲兰苏;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;ZLandroidx/compose/ui/text/style/ResolvedTextDirection;ZJFLandroidx/compose/ui/飘花落叶言子楪哲苏兰世;I)V

    .line 334
    .line 335
    .line 336
    iput-object v0, v12, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 337
    .line 338
    :cond_1d
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 12

    .line 1
    move/from16 v4, p4

    .line 2
    .line 3
    move-object v9, p3

    .line 4
    check-cast v9, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 5
    .line 6
    const p3, -0x40fab302

    .line 7
    .line 8
    .line 9
    invoke-virtual {v9, p3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 10
    .line 11
    .line 12
    and-int/lit8 p3, v4, 0x6

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    if-nez p3, :cond_2

    .line 16
    .line 17
    and-int/lit8 p3, v4, 0x8

    .line 18
    .line 19
    if-nez p3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v9, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v9, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p3

    .line 30
    :goto_0
    if-eqz p3, :cond_1

    .line 31
    .line 32
    move p3, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 p3, 0x2

    .line 35
    :goto_1
    or-int/2addr p3, v4

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move p3, v4

    .line 38
    :goto_2
    and-int/lit8 v1, v4, 0x30

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v9, p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    move v1, v2

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    const/16 v1, 0x10

    .line 53
    .line 54
    :goto_3
    or-int/2addr p3, v1

    .line 55
    :cond_4
    and-int/lit16 v1, v4, 0x180

    .line 56
    .line 57
    if-nez v1, :cond_6

    .line 58
    .line 59
    invoke-virtual {v9, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    const/16 v1, 0x100

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_5
    const/16 v1, 0x80

    .line 69
    .line 70
    :goto_4
    or-int/2addr p3, v1

    .line 71
    :cond_6
    and-int/lit16 v1, p3, 0x93

    .line 72
    .line 73
    const/16 v3, 0x92

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x1

    .line 77
    if-eq v1, v3, :cond_7

    .line 78
    .line 79
    move v1, v6

    .line 80
    goto :goto_5

    .line 81
    :cond_7
    move v1, v5

    .line 82
    :goto_5
    and-int/lit8 v3, p3, 0x1

    .line 83
    .line 84
    invoke-virtual {v9, v3, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_d

    .line 89
    .line 90
    and-int/lit8 v1, p3, 0x70

    .line 91
    .line 92
    if-ne v1, v2, :cond_8

    .line 93
    .line 94
    move v1, v6

    .line 95
    goto :goto_6

    .line 96
    :cond_8
    move v1, v5

    .line 97
    :goto_6
    and-int/lit8 v2, p3, 0xe

    .line 98
    .line 99
    if-eq v2, v0, :cond_a

    .line 100
    .line 101
    and-int/lit8 v0, p3, 0x8

    .line 102
    .line 103
    if-eqz v0, :cond_9

    .line 104
    .line 105
    invoke-virtual {v9, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_9

    .line 110
    .line 111
    goto :goto_7

    .line 112
    :cond_9
    move v6, v5

    .line 113
    :cond_a
    :goto_7
    or-int v0, v1, v6

    .line 114
    .line 115
    invoke-virtual {v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-nez v0, :cond_b

    .line 120
    .line 121
    sget-object v0, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 122
    .line 123
    if-ne v1, v0, :cond_c

    .line 124
    .line 125
    :cond_b
    new-instance v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰世哲;

    .line 126
    .line 127
    invoke-direct {v1, p1, p0}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰世哲;-><init>(Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲世苏兰;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v9, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_c
    check-cast v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰世哲;

    .line 134
    .line 135
    new-instance v7, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;

    .line 136
    .line 137
    sget-object v0, Landroidx/compose/ui/window/SecureFlagPolicy;->Inherit:Landroidx/compose/ui/window/SecureFlagPolicy;

    .line 138
    .line 139
    invoke-direct {v7, v5, v0, v5}, Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;-><init>(ZLandroidx/compose/ui/window/SecureFlagPolicy;Z)V

    .line 140
    .line 141
    .line 142
    shl-int/lit8 p3, p3, 0x3

    .line 143
    .line 144
    and-int/lit16 p3, p3, 0x1c00

    .line 145
    .line 146
    or-int/lit16 v10, p3, 0x180

    .line 147
    .line 148
    const/4 v11, 0x2

    .line 149
    const/4 v6, 0x0

    .line 150
    move-object v8, p2

    .line 151
    move-object v5, v1

    .line 152
    invoke-static/range {v5 .. v11}, Landroidx/compose/ui/window/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/window/飘花落叶言子楪兰哲苏世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/window/飘花落叶言子世楪苏哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;II)V

    .line 153
    .line 154
    .line 155
    goto :goto_8

    .line 156
    :cond_d
    invoke-virtual {v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 157
    .line 158
    .line 159
    :goto_8
    invoke-virtual {v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 160
    .line 161
    .line 162
    move-result-object p3

    .line 163
    if-eqz p3, :cond_e

    .line 164
    .line 165
    new-instance v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪苏哲兰;

    .line 166
    .line 167
    const/4 v5, 0x4

    .line 168
    move-object v1, p0

    .line 169
    move-object v2, p1

    .line 170
    move-object v3, p2

    .line 171
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪苏哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 172
    .line 173
    .line 174
    iput-object v0, p3, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 175
    .line 176
    :cond_e
    return-void
.end method

.method public static final 飘花落叶言子楪兰世苏哲(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;
    .locals 11

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;Z)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    invoke-interface {p0, v1, v2}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iget v3, v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 15
    .line 16
    iget v0, v0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 17
    .line 18
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    int-to-long v3, v3

    .line 23
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v5, v0

    .line 28
    const/16 v0, 0x20

    .line 29
    .line 30
    shl-long/2addr v3, v0

    .line 31
    const-wide v7, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v5, v7

    .line 37
    or-long/2addr v3, v5

    .line 38
    invoke-interface {p0, v3, v4}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    new-instance p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 43
    .line 44
    shr-long v5, v1, v0

    .line 45
    .line 46
    long-to-int v5, v5

    .line 47
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    and-long/2addr v1, v7

    .line 52
    long-to-int v1, v1

    .line 53
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    shr-long v9, v3, v0

    .line 58
    .line 59
    long-to-int v0, v9

    .line 60
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    and-long v2, v3, v7

    .line 65
    .line 66
    long-to-int v2, v2

    .line 67
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-direct {p0, v5, v1, v0, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;-><init>(FFFF)V

    .line 72
    .line 73
    .line 74
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;F)Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v3, p1

    .line 4
    .line 5
    float-to-double v1, v3

    .line 6
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    double-to-float v1, v1

    .line 11
    float-to-int v1, v1

    .line 12
    mul-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    sget-object v2, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;

    .line 15
    .line 16
    sget-object v4, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    sget-object v5, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    iget-object v6, v2, Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Bitmap;

    .line 25
    .line 26
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-gt v1, v7, :cond_1

    .line 31
    .line 32
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-le v1, v6, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    move-object v7, v2

    .line 40
    move-object v8, v4

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    :goto_1
    const/4 v2, 0x1

    .line 43
    invoke-static {v1, v1, v2}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪苏世哲兰(III)Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sput-object v2, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;

    .line 48
    .line 49
    invoke-static {v2}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    sput-object v4, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :goto_2
    if-nez v5, :cond_2

    .line 57
    .line 58
    new-instance v5, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 59
    .line 60
    invoke-direct {v5}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v5, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 64
    .line 65
    :cond_2
    move-object v9, v5

    .line 66
    iget-object v1, v9, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;

    .line 67
    .line 68
    iget-object v2, v0, Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/draw/飘花落叶言子楪世哲苏兰;

    .line 69
    .line 70
    invoke-interface {v2}, Landroidx/compose/ui/draw/飘花落叶言子楪世哲苏兰;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget-object v4, v7, Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Bitmap;

    .line 75
    .line 76
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    int-to-float v5, v5

    .line 81
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    int-to-float v4, v4

    .line 86
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    int-to-long v5, v5

    .line 91
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    int-to-long v10, v4

    .line 96
    const/16 v4, 0x20

    .line 97
    .line 98
    shl-long/2addr v5, v4

    .line 99
    const-wide v17, 0xffffffffL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    and-long v10, v10, v17

    .line 105
    .line 106
    or-long/2addr v5, v10

    .line 107
    iget-object v10, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 108
    .line 109
    iget-object v11, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/unit/LayoutDirection;

    .line 110
    .line 111
    iget-object v12, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;

    .line 112
    .line 113
    iget-wide v13, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:J

    .line 114
    .line 115
    iput-object v0, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 116
    .line 117
    iput-object v2, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/unit/LayoutDirection;

    .line 118
    .line 119
    iput-object v8, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;

    .line 120
    .line 121
    iput-wide v5, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:J

    .line 122
    .line 123
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 124
    .line 125
    .line 126
    move-object v0, v10

    .line 127
    move-object v2, v11

    .line 128
    sget-wide v10, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:J

    .line 129
    .line 130
    move-object v5, v12

    .line 131
    move-wide v14, v13

    .line 132
    invoke-interface {v9}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()J

    .line 133
    .line 134
    .line 135
    move-result-wide v12

    .line 136
    move-wide/from16 v19, v14

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    const/16 v16, 0x3a

    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    move-wide/from16 v21, v19

    .line 143
    .line 144
    invoke-static/range {v9 .. v16}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰哲苏楪(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;JJFLandroidx/compose/ui/graphics/drawscope/飘花落叶言子楪苏世兰哲;I)V

    .line 145
    .line 146
    .line 147
    const-wide v19, 0xff000000L

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 153
    .line 154
    .line 155
    move-result-wide v10

    .line 156
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    int-to-long v12, v6

    .line 161
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    int-to-long v14, v6

    .line 166
    shl-long/2addr v12, v4

    .line 167
    and-long v14, v14, v17

    .line 168
    .line 169
    or-long/2addr v12, v14

    .line 170
    const/4 v15, 0x0

    .line 171
    const/16 v16, 0x78

    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    invoke-static/range {v9 .. v16}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰哲苏楪(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;JJFLandroidx/compose/ui/graphics/drawscope/飘花落叶言子楪苏世兰哲;I)V

    .line 175
    .line 176
    .line 177
    invoke-static/range {v19 .. v20}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世兰苏哲(J)J

    .line 178
    .line 179
    .line 180
    move-result-wide v10

    .line 181
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    int-to-long v12, v6

    .line 186
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    int-to-long v14, v6

    .line 191
    shl-long/2addr v12, v4

    .line 192
    and-long v14, v14, v17

    .line 193
    .line 194
    or-long/2addr v12, v14

    .line 195
    const/16 v6, 0x78

    .line 196
    .line 197
    move-wide/from16 v23, v12

    .line 198
    .line 199
    move-object v12, v5

    .line 200
    move-wide/from16 v4, v23

    .line 201
    .line 202
    move-wide/from16 v23, v10

    .line 203
    .line 204
    move-object v10, v0

    .line 205
    move-object v11, v2

    .line 206
    move-object v0, v9

    .line 207
    move-object v9, v1

    .line 208
    move-wide/from16 v1, v23

    .line 209
    .line 210
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子苏哲世楪兰(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;JFJI)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世()V

    .line 214
    .line 215
    .line 216
    iput-object v10, v9, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 217
    .line 218
    iput-object v11, v9, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/unit/LayoutDirection;

    .line 219
    .line 220
    iput-object v12, v9, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;

    .line 221
    .line 222
    move-wide/from16 v14, v21

    .line 223
    .line 224
    iput-wide v14, v9, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:J

    .line 225
    .line 226
    return-object v7
.end method

.method public static final 飘花落叶言子楪哲世苏兰(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;J)Z
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    iget v1, p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    shr-long v2, p1, v2

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    cmpg-float v0, v0, v2

    .line 15
    .line 16
    if-gtz v0, :cond_0

    .line 17
    .line 18
    cmpg-float v0, v2, v1

    .line 19
    .line 20
    if-gtz v0, :cond_0

    .line 21
    .line 22
    iget v0, p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 23
    .line 24
    iget p0, p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 25
    .line 26
    const-wide v1, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr p1, v1

    .line 32
    long-to-int p1, p1

    .line 33
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    cmpg-float p2, v0, p1

    .line 38
    .line 39
    if-gtz p2, :cond_0

    .line 40
    .line 41
    cmpg-float p0, p1, p0

    .line 42
    .line 43
    if-gtz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0
.end method

.method public static final 飘花落叶言子楪哲兰世苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏哲世兰;Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世哲兰苏:Landroidx/collection/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    instance-of v1, p4, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p4

    .line 8
    check-cast v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;

    .line 9
    .line 10
    iget v2, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;

    .line 23
    .line 24
    invoke-direct {v1, p4}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p4, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    if-eq v3, v6, :cond_2

    .line 39
    .line 40
    if-ne v3, v5, :cond_1

    .line 41
    .line 42
    iget-object p0, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 45
    .line 46
    iget-object p1, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;

    .line 49
    .line 50
    iget-object p2, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 53
    .line 54
    :try_start_0
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto/16 :goto_8

    .line 61
    .line 62
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 p0, 0x0

    .line 68
    return-object p0

    .line 69
    :cond_2
    iget-object p0, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$1:Ljava/lang/Object;

    .line 70
    .line 71
    move-object p1, p0

    .line 72
    check-cast p1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;

    .line 73
    .line 74
    iget-object p0, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 77
    .line 78
    :try_start_1
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :catchall_1
    move-exception p0

    .line 83
    goto :goto_3

    .line 84
    :cond_3
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p4, p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {p4, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    check-cast p4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 94
    .line 95
    iget p3, p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:I

    .line 96
    .line 97
    and-int/2addr p3, v6

    .line 98
    if-eqz p3, :cond_7

    .line 99
    .line 100
    iget-wide p2, p4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 101
    .line 102
    invoke-interface {p1, p2, p3}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲(J)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_d

    .line 107
    .line 108
    :try_start_2
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 109
    .line 110
    .line 111
    iget-wide p2, p4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 112
    .line 113
    new-instance p4, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲苏世;

    .line 114
    .line 115
    invoke-direct {p4, p1, v4}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    iput-object p0, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object p1, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$1:Ljava/lang/Object;

    .line 121
    .line 122
    iput v6, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 123
    .line 124
    invoke-static {p0, p2, p3, p4, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p4

    .line 128
    if-ne p4, v2, :cond_4

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_4
    :goto_1
    check-cast p4, Ljava/lang/Boolean;

    .line 132
    .line 133
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 134
    .line 135
    .line 136
    move-result p2

    .line 137
    if-eqz p2, :cond_6

    .line 138
    .line 139
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 140
    .line 141
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 142
    .line 143
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 144
    .line 145
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 146
    .line 147
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    :goto_2
    if-ge v4, p2, :cond_6

    .line 152
    .line 153
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    check-cast p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 158
    .line 159
    invoke-static {p3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 160
    .line 161
    .line 162
    move-result p4

    .line 163
    if-eqz p4, :cond_5

    .line 164
    .line 165
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 166
    .line 167
    .line 168
    :cond_5
    add-int/lit8 v4, v4, 0x1

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_6
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_9

    .line 175
    .line 176
    :goto_3
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_7
    iget p2, p2, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:I

    .line 181
    .line 182
    if-eq p2, v6, :cond_9

    .line 183
    .line 184
    if-eq p2, v5, :cond_8

    .line 185
    .line 186
    sget-object p3, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰哲苏:Landroidx/collection/飘花落叶言子楪苏世哲兰;

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_8
    sget-object p3, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰苏哲:Landroidx/collection/飘花落叶言子楪苏世哲兰;

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_9
    move-object p3, v0

    .line 193
    :goto_4
    iget-wide v7, p4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 194
    .line 195
    invoke-interface {p1, v7, v8, p3, p2}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰(JLandroidx/collection/飘花落叶言子楪苏世哲兰;I)Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-eqz p2, :cond_d

    .line 200
    .line 201
    :try_start_3
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 202
    .line 203
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    xor-int/2addr v0, v6

    .line 211
    iput-boolean v0, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 212
    .line 213
    iget-wide v7, p4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 214
    .line 215
    new-instance p4, Landroidx/compose/foundation/text/selection/飘花落叶言子苏楪兰哲世;

    .line 216
    .line 217
    invoke-direct {p4, p1, p3, p2, v6}, Landroidx/compose/foundation/text/selection/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 218
    .line 219
    .line 220
    iput-object p0, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$0:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object p1, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$1:Ljava/lang/Object;

    .line 223
    .line 224
    iput-object p2, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->L$2:Ljava/lang/Object;

    .line 225
    .line 226
    iput v5, v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$mouseSelection$1;->label:I

    .line 227
    .line 228
    invoke-static {p0, v7, v8, p4, v1}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p4

    .line 232
    if-ne p4, v2, :cond_a

    .line 233
    .line 234
    :goto_5
    return-object v2

    .line 235
    :cond_a
    move-object v9, p2

    .line 236
    move-object p2, p0

    .line 237
    move-object p0, v9

    .line 238
    :goto_6
    check-cast p4, Ljava/lang/Boolean;

    .line 239
    .line 240
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 241
    .line 242
    .line 243
    move-result p3

    .line 244
    if-eqz p3, :cond_c

    .line 245
    .line 246
    iget-boolean p0, p0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 247
    .line 248
    if-eqz p0, :cond_c

    .line 249
    .line 250
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 251
    .line 252
    iget-object p0, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 253
    .line 254
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 255
    .line 256
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 257
    .line 258
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    :goto_7
    if-ge v4, p2, :cond_c

    .line 263
    .line 264
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    check-cast p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 269
    .line 270
    invoke-static {p3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 271
    .line 272
    .line 273
    move-result p4

    .line 274
    if-eqz p4, :cond_b

    .line 275
    .line 276
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 277
    .line 278
    .line 279
    :cond_b
    add-int/lit8 v4, v4, 0x1

    .line 280
    .line 281
    goto :goto_7

    .line 282
    :cond_c
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()V

    .line 283
    .line 284
    .line 285
    goto :goto_9

    .line 286
    :goto_8
    invoke-interface {p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲()V

    .line 287
    .line 288
    .line 289
    throw p0

    .line 290
    :cond_d
    :goto_9
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 291
    .line 292
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲兰苏世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v6, :cond_2

    .line 38
    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    move-object p1, p0

    .line 44
    check-cast p1, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;

    .line 45
    .line 46
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    .line 55
    :catch_0
    move-exception p0

    .line 56
    goto/16 :goto_7

    .line 57
    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    :cond_2
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$2:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 67
    .line 68
    iget-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;

    .line 71
    .line 72
    iget-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    :try_start_1
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    .line 78
    .line 79
    move-object v11, p2

    .line 80
    move-object p2, p0

    .line 81
    move-object p0, v11

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :try_start_2
    iget-object p2, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 87
    .line 88
    invoke-static {p2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏楪世哲兰(Ljava/util/List;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 93
    .line 94
    iget-wide v7, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 95
    .line 96
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$1:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$2:Ljava/lang/Object;

    .line 101
    .line 102
    iput v6, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 103
    .line 104
    invoke-static {p0, v7, v8, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JLkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    if-ne p3, v1, :cond_4

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    :goto_1
    check-cast p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 112
    .line 113
    if-eqz p3, :cond_a

    .line 114
    .line 115
    iget-wide v7, p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 116
    .line 117
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget v9, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:I

    .line 124
    .line 125
    invoke-static {v2, v9}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;I)F

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    iget-wide v9, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 130
    .line 131
    invoke-static {v9, v10, v7, v8}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(JJ)J

    .line 132
    .line 133
    .line 134
    move-result-wide v9

    .line 135
    invoke-static {v9, v10}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(J)F

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    cmpg-float p2, p2, v2

    .line 140
    .line 141
    if-gez p2, :cond_5

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_5
    move v6, v4

    .line 145
    :goto_2
    if-eqz v6, :cond_a

    .line 146
    .line 147
    sget-object p2, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世苏哲兰:Landroidx/collection/飘花落叶言子楪苏世哲兰;

    .line 148
    .line 149
    invoke-interface {p1, v7, v8, p2}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲(JLandroidx/collection/飘花落叶言子楪苏世哲兰;)V

    .line 150
    .line 151
    .line 152
    iget-wide p2, p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 153
    .line 154
    new-instance v2, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪苏哲兰;

    .line 155
    .line 156
    invoke-direct {v2, p1, v4}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪苏哲兰;-><init>(Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;I)V

    .line 157
    .line 158
    .line 159
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$0:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$1:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->L$2:Ljava/lang/Object;

    .line 164
    .line 165
    iput v5, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionFirstPress$1;->label:I

    .line 166
    .line 167
    invoke-static {p0, p2, p3, v2, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    if-ne p3, v1, :cond_6

    .line 172
    .line 173
    :goto_3
    return-object v1

    .line 174
    :cond_6
    :goto_4
    check-cast p3, Ljava/lang/Boolean;

    .line 175
    .line 176
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 177
    .line 178
    .line 179
    move-result p2

    .line 180
    if-eqz p2, :cond_9

    .line 181
    .line 182
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 183
    .line 184
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 185
    .line 186
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 187
    .line 188
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 191
    .line 192
    .line 193
    move-result p2

    .line 194
    :goto_5
    if-ge v4, p2, :cond_8

    .line 195
    .line 196
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p3

    .line 200
    check-cast p3, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 201
    .line 202
    invoke-static {p3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_7

    .line 207
    .line 208
    invoke-virtual {p3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 209
    .line 210
    .line 211
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_8
    invoke-interface {p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰()V

    .line 215
    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_9
    invoke-interface {p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 219
    .line 220
    .line 221
    :cond_a
    :goto_6
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 222
    .line 223
    return-object p0

    .line 224
    :goto_7
    invoke-interface {p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->onCancel()V

    .line 225
    .line 226
    .line 227
    throw p0
.end method

.method public static final 飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;I)Landroidx/compose/ui/text/style/ResolvedTextDirection;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 4
    .line 5
    iget-object v0, v0, Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 6
    .line 7
    iget-object v0, v0, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {v1, p1}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    add-int/lit8 v2, p1, -0x1

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eq v0, v2, :cond_2

    .line 29
    .line 30
    :cond_1
    iget-object v2, p0, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 33
    .line 34
    iget-object v2, v2, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eq p1, v2, :cond_3

    .line 41
    .line 42
    add-int/lit8 v2, p1, 0x1

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eq v0, v1, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲苏兰世(Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;Z)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪兰世苏哲(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰苏世(Z)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    invoke-static {v0, p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲世苏兰(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;J)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;ILkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p4, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    sget-object v4, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v6, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    move-object p1, p0

    .line 45
    check-cast p1, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;

    .line 46
    .line 47
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 50
    .line 51
    :try_start_0
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :catch_0
    move-exception p0

    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :cond_2
    iget-wide p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->J$0:J

    .line 66
    .line 67
    iget-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$2:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 70
    .line 71
    iget-object p3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$1:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p3, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;

    .line 74
    .line 75
    iget-object v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 78
    .line 79
    :try_start_1
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 80
    .line 81
    .line 82
    move-wide v7, p0

    .line 83
    move-object p1, p3

    .line 84
    move-object p0, v2

    .line 85
    goto :goto_2

    .line 86
    :catch_1
    move-exception p0

    .line 87
    move-object p1, p3

    .line 88
    goto/16 :goto_6

    .line 89
    .line 90
    :cond_3
    invoke-static {p4}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :try_start_2
    iget-object p2, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {p2}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子苏楪世哲兰(Ljava/util/List;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 100
    .line 101
    iget-wide v7, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 102
    .line 103
    iget-wide v9, p2, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 104
    .line 105
    if-le p3, v5, :cond_4

    .line 106
    .line 107
    sget-object p2, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰哲苏:Landroidx/collection/飘花落叶言子楪苏世哲兰;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    sget-object p2, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰苏哲:Landroidx/collection/飘花落叶言子楪苏世哲兰;

    .line 111
    .line 112
    :goto_1
    invoke-interface {p1, v9, v10, p2}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏兰哲(JLandroidx/collection/飘花落叶言子楪苏世哲兰;)V

    .line 113
    .line 114
    .line 115
    new-instance p2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 116
    .line 117
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 118
    .line 119
    .line 120
    const-wide p3, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    iput-wide p3, p2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 126
    .line 127
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 128
    .line 129
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰哲苏()Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    invoke-interface {p3}, Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪世苏兰哲()J

    .line 134
    .line 135
    .line 136
    move-result-wide p3

    .line 137
    new-instance v2, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;

    .line 138
    .line 139
    invoke-direct {v2, v7, v8, p2, v3}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1;-><init>(JLkotlin/jvm/internal/Ref$LongRef;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 140
    .line 141
    .line 142
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$0:Ljava/lang/Object;

    .line 143
    .line 144
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$1:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object p2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$2:Ljava/lang/Object;

    .line 147
    .line 148
    iput-wide v7, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->J$0:J

    .line 149
    .line 150
    iput v6, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 151
    .line 152
    invoke-virtual {p0, p3, p4, v2, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世兰哲(JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p4

    .line 156
    if-ne p4, v1, :cond_5

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    :goto_2
    check-cast p4, Landroidx/compose/foundation/text/selection/DownResolution;

    .line 160
    .line 161
    if-nez p4, :cond_6

    .line 162
    .line 163
    sget-object p4, Landroidx/compose/foundation/text/selection/DownResolution;->Timeout:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 164
    .line 165
    :cond_6
    sget-object p3, Landroidx/compose/foundation/text/selection/DownResolution;->Cancel:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 166
    .line 167
    if-ne p4, p3, :cond_7

    .line 168
    .line 169
    invoke-interface {p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->onCancel()V

    .line 170
    .line 171
    .line 172
    return-object v4

    .line 173
    :cond_7
    sget-object p3, Landroidx/compose/foundation/text/selection/DownResolution;->Up:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 174
    .line 175
    if-ne p4, p3, :cond_8

    .line 176
    .line 177
    invoke-interface {p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰()V

    .line 178
    .line 179
    .line 180
    return-object v4

    .line 181
    :cond_8
    sget-object p3, Landroidx/compose/foundation/text/selection/DownResolution;->Drag:Landroidx/compose/foundation/text/selection/DownResolution;

    .line 182
    .line 183
    if-ne p4, p3, :cond_9

    .line 184
    .line 185
    iget-wide p2, p2, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 186
    .line 187
    invoke-interface {p1, p2, p3}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲(J)V

    .line 188
    .line 189
    .line 190
    :cond_9
    new-instance p2, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪苏哲兰;

    .line 191
    .line 192
    invoke-direct {p2, p1, v6}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪苏哲兰;-><init>(Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;I)V

    .line 193
    .line 194
    .line 195
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$0:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$1:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->L$2:Ljava/lang/Object;

    .line 200
    .line 201
    iput v5, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$touchSelectionSubsequentPress$1;->label:I

    .line 202
    .line 203
    invoke-static {p0, v7, v8, p2, v0}, Landroidx/compose/foundation/gestures/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p4

    .line 207
    if-ne p4, v1, :cond_a

    .line 208
    .line 209
    :goto_3
    return-object v1

    .line 210
    :cond_a
    :goto_4
    check-cast p4, Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    if-eqz p2, :cond_d

    .line 217
    .line 218
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 219
    .line 220
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 221
    .line 222
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 223
    .line 224
    iget-object p0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 225
    .line 226
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 227
    .line 228
    .line 229
    move-result p2

    .line 230
    const/4 p3, 0x0

    .line 231
    :goto_5
    if-ge p3, p2, :cond_c

    .line 232
    .line 233
    invoke-interface {p0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p4

    .line 237
    check-cast p4, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 238
    .line 239
    invoke-static {p4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_b

    .line 244
    .line 245
    invoke-virtual {p4}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰()V

    .line 246
    .line 247
    .line 248
    :cond_b
    add-int/lit8 p3, p3, 0x1

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_c
    invoke-interface {p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰()V

    .line 252
    .line 253
    .line 254
    return-object v4

    .line 255
    :cond_d
    invoke-interface {p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->onCancel()V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0

    .line 256
    .line 257
    .line 258
    return-object v4

    .line 259
    :goto_6
    invoke-interface {p1}, Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;->onCancel()V

    .line 260
    .line 261
    .line 262
    throw p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    sget-object p1, Landroidx/compose/ui/input/pointer/PointerEventPass;->Main:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 55
    .line 56
    iput-object p0, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    iput v3, v0, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitDown$1;->label:I

    .line 59
    .line 60
    check-cast p0, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;

    .line 61
    .line 62
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_2
    check-cast p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;

    .line 70
    .line 71
    iget-object v2, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    const/4 v5, 0x0

    .line 78
    :goto_3
    if-ge v5, v4, :cond_5

    .line 79
    .line 80
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    check-cast v6, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 85
    .line 86
    invoke-static {v6}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_4

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    return-object p1
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    check-cast v1, Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰楪苏哲:Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏哲世兰;-><init>(Landroidx/compose/ui/platform/飘花落叶言子哲兰苏世楪;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitSelectionGestures$2;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v1, v0, p1, p2, v2}, Landroidx/compose/foundation/text/selection/SelectionGesturesKt$awaitSelectionGestures$2;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏哲世兰;Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏兰哲世;Landroidx/compose/foundation/text/飘花落叶言子苏楪哲世兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, p3}, Landroidx/compose/foundation/gestures/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪兰世哲苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 29
    .line 30
    if-ne p0, p1, :cond_0

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 34
    .line 35
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏兰哲世(Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;I)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;
    .locals 2

    .line 1
    iget-object p1, p1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-wide v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:J

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 15
    .line 16
    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;-><init>(Landroidx/compose/ui/text/style/ResolvedTextDirection;IJ)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲世兰(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v6, p2

    .line 4
    .line 5
    iget v7, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:I

    .line 6
    .line 7
    iget v8, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:I

    .line 8
    .line 9
    move-object/from16 v4, p0

    .line 10
    .line 11
    iget-boolean v9, v4, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Z

    .line 12
    .line 13
    if-eqz v9, :cond_0

    .line 14
    .line 15
    move v2, v8

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v7

    .line 18
    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v10, v0

    .line 21
    check-cast v10, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 22
    .line 23
    iget v11, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 24
    .line 25
    sget-object v12, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 26
    .line 27
    new-instance v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;

    .line 28
    .line 29
    const/4 v13, 0x0

    .line 30
    invoke-direct {v0, v1, v2, v13}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;-><init>(Ljava/lang/Object;II)V

    .line 31
    .line 32
    .line 33
    invoke-static {v12, v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v9, :cond_1

    .line 38
    .line 39
    move v3, v7

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v3, v8

    .line 42
    :goto_1
    new-instance v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;

    .line 43
    .line 44
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;-><init>(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;IIL飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Lkotlin/飘花落叶言子楪苏世哲兰;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v12, v0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-wide/16 v3, 0x1

    .line 52
    .line 53
    iget-wide v14, v6, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世哲苏兰:J

    .line 54
    .line 55
    cmp-long v3, v3, v14

    .line 56
    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_2
    if-ne v2, v11, :cond_3

    .line 67
    .line 68
    return-object v6

    .line 69
    :cond_3
    iget-object v3, v10, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 70
    .line 71
    invoke-virtual {v3, v11}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-interface {v5}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eq v4, v3, :cond_4

    .line 86
    .line 87
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_4
    iget v3, v6, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 95
    .line 96
    invoke-virtual {v10, v3}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世(I)J

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    const/4 v6, -0x1

    .line 101
    if-ne v11, v6, :cond_5

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    if-ne v2, v11, :cond_6

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_6
    if-ge v8, v7, :cond_7

    .line 108
    .line 109
    sget-object v6, Landroidx/compose/foundation/text/selection/CrossStatus;->NOT_CROSSED:Landroidx/compose/foundation/text/selection/CrossStatus;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_7
    if-le v8, v7, :cond_8

    .line 113
    .line 114
    sget-object v6, Landroidx/compose/foundation/text/selection/CrossStatus;->CROSSED:Landroidx/compose/foundation/text/selection/CrossStatus;

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_8
    sget-object v6, Landroidx/compose/foundation/text/selection/CrossStatus;->COLLAPSED:Landroidx/compose/foundation/text/selection/CrossStatus;

    .line 118
    .line 119
    :goto_2
    sget-object v7, Landroidx/compose/foundation/text/selection/CrossStatus;->CROSSED:Landroidx/compose/foundation/text/selection/CrossStatus;

    .line 120
    .line 121
    if-ne v6, v7, :cond_9

    .line 122
    .line 123
    const/4 v13, 0x1

    .line 124
    :cond_9
    xor-int v6, v9, v13

    .line 125
    .line 126
    if-eqz v6, :cond_a

    .line 127
    .line 128
    if-ge v2, v11, :cond_d

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_a
    if-le v2, v11, :cond_d

    .line 132
    .line 133
    :goto_3
    sget v6, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 134
    .line 135
    const/16 v6, 0x20

    .line 136
    .line 137
    shr-long v6, v4, v6

    .line 138
    .line 139
    long-to-int v6, v6

    .line 140
    if-eq v3, v6, :cond_c

    .line 141
    .line 142
    const-wide v6, 0xffffffffL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    and-long/2addr v4, v6

    .line 148
    long-to-int v4, v4

    .line 149
    if-ne v3, v4, :cond_b

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_b
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :cond_c
    :goto_4
    invoke-interface {v0}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    check-cast v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 162
    .line 163
    return-object v0

    .line 164
    :cond_d
    :goto_5
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    return-object v0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;ZZLandroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:I

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:I

    .line 7
    .line 8
    :goto_0
    iget p3, p3, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    packed-switch p3, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p3, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p3, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 16
    .line 17
    invoke-virtual {p3, v0}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世(I)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    goto :goto_1

    .line 22
    :pswitch_0
    iget-object p3, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p3, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 25
    .line 26
    iget-object p3, p3, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;

    .line 27
    .line 28
    iget-object p3, p3, Landroidx/compose/ui/text/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;

    .line 29
    .line 30
    iget-object p3, p3, Landroidx/compose/ui/text/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0, p3}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世(ILjava/lang/CharSequence;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v0, p3}, Landroidx/compose/foundation/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏世兰(ILjava/lang/CharSequence;)I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    invoke-static {v1, p3}, Landroidx/compose/ui/text/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲(II)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    :goto_1
    xor-int/2addr p1, p2

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    sget p1, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 48
    .line 49
    const/16 p1, 0x20

    .line 50
    .line 51
    shr-long p1, v0, p1

    .line 52
    .line 53
    :goto_2
    long-to-int p1, p1

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    sget p1, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 56
    .line 57
    const-wide p1, 0xffffffffL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr p1, v0

    .line 63
    goto :goto_2

    .line 64
    :goto_3
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
