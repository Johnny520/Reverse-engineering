.class public final Lcom/alibaba/fastjson2/飘花落叶言子世哲兰苏楪;
.super Lcom/alibaba/fastjson2/飘花落叶言子世哲兰楪苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Z
    .locals 11

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    :goto_0
    return v1

    .line 23
    :pswitch_0
    check-cast p0, Ljava/math/BigDecimal;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    goto/16 :goto_10

    .line 28
    .line 29
    :cond_1
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    check-cast p1, Ljava/math/BigDecimal;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    new-instance p1, Ljava/math/BigDecimal;

    .line 42
    .line 43
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 44
    .line 45
    invoke-direct {p1, v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {p1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    :goto_1
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    goto/16 :goto_10

    .line 58
    .line 59
    :cond_3
    instance-of v0, p1, Ljava/lang/Float;

    .line 60
    .line 61
    if-nez v0, :cond_1b

    .line 62
    .line 63
    instance-of v0, p1, Ljava/lang/Double;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    goto/16 :goto_e

    .line 68
    .line 69
    :cond_4
    instance-of v0, p1, Ljava/lang/String;

    .line 70
    .line 71
    if-eqz v0, :cond_1d

    .line 72
    .line 73
    check-cast p1, Ljava/lang/String;

    .line 74
    .line 75
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    goto/16 :goto_10

    .line 84
    .line 85
    :cond_5
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const/16 v2, 0x2b

    .line 90
    .line 91
    const/16 v3, 0x2d

    .line 92
    .line 93
    const/16 v4, 0x2e

    .line 94
    .line 95
    const/4 v5, 0x1

    .line 96
    if-eq v0, v3, :cond_9

    .line 97
    .line 98
    if-ne v0, v2, :cond_6

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_6
    if-ne v0, v4, :cond_8

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-ne v6, v5, :cond_7

    .line 108
    .line 109
    goto/16 :goto_10

    .line 110
    .line 111
    :cond_7
    :goto_2
    move v6, v5

    .line 112
    goto :goto_4

    .line 113
    :cond_8
    move v6, v1

    .line 114
    goto :goto_4

    .line 115
    :cond_9
    :goto_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-ne v0, v5, :cond_a

    .line 120
    .line 121
    goto/16 :goto_10

    .line 122
    .line 123
    :cond_a
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    goto :goto_2

    .line 128
    :goto_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    const/16 v8, 0x39

    .line 133
    .line 134
    const/16 v9, 0x30

    .line 135
    .line 136
    if-ne v0, v4, :cond_b

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_b
    if-lt v0, v9, :cond_e

    .line 140
    .line 141
    if-gt v0, v8, :cond_e

    .line 142
    .line 143
    :goto_5
    if-ge v6, v7, :cond_19

    .line 144
    .line 145
    add-int/lit8 v0, v6, 0x1

    .line 146
    .line 147
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-lt v6, v9, :cond_d

    .line 152
    .line 153
    if-le v6, v8, :cond_c

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_c
    move v6, v0

    .line 157
    goto :goto_5

    .line 158
    :cond_d
    :goto_6
    move v10, v6

    .line 159
    move v6, v0

    .line 160
    move v0, v10

    .line 161
    move v10, v5

    .line 162
    goto :goto_8

    .line 163
    :cond_e
    :goto_7
    move v10, v1

    .line 164
    :goto_8
    if-ne v0, v4, :cond_11

    .line 165
    .line 166
    if-ge v6, v7, :cond_19

    .line 167
    .line 168
    add-int/lit8 v0, v6, 0x1

    .line 169
    .line 170
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-lt v4, v9, :cond_10

    .line 175
    .line 176
    if-gt v4, v8, :cond_10

    .line 177
    .line 178
    :goto_9
    if-ge v0, v7, :cond_19

    .line 179
    .line 180
    add-int/lit8 v6, v0, 0x1

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-lt v0, v9, :cond_12

    .line 187
    .line 188
    if-le v0, v8, :cond_f

    .line 189
    .line 190
    goto :goto_a

    .line 191
    :cond_f
    move v0, v6

    .line 192
    goto :goto_9

    .line 193
    :cond_10
    move v6, v0

    .line 194
    move v0, v4

    .line 195
    goto :goto_a

    .line 196
    :cond_11
    move v5, v1

    .line 197
    :cond_12
    :goto_a
    if-nez v10, :cond_13

    .line 198
    .line 199
    if-nez v5, :cond_13

    .line 200
    .line 201
    goto/16 :goto_10

    .line 202
    .line 203
    :cond_13
    const/16 v4, 0x65

    .line 204
    .line 205
    if-eq v0, v4, :cond_14

    .line 206
    .line 207
    const/16 v4, 0x45

    .line 208
    .line 209
    if-ne v0, v4, :cond_1d

    .line 210
    .line 211
    :cond_14
    if-ne v6, v7, :cond_15

    .line 212
    .line 213
    goto :goto_c

    .line 214
    :cond_15
    add-int/lit8 v0, v6, 0x1

    .line 215
    .line 216
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eq v4, v2, :cond_16

    .line 221
    .line 222
    if-ne v4, v3, :cond_17

    .line 223
    .line 224
    :cond_16
    if-ge v0, v7, :cond_1d

    .line 225
    .line 226
    add-int/lit8 v6, v6, 0x2

    .line 227
    .line 228
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    move v0, v6

    .line 233
    :cond_17
    if-lt v4, v9, :cond_1d

    .line 234
    .line 235
    if-gt v4, v8, :cond_1d

    .line 236
    .line 237
    :goto_b
    if-ge v0, v7, :cond_19

    .line 238
    .line 239
    add-int/lit8 v2, v0, 0x1

    .line 240
    .line 241
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-lt v0, v9, :cond_1d

    .line 246
    .line 247
    if-le v0, v8, :cond_18

    .line 248
    .line 249
    goto :goto_10

    .line 250
    :cond_18
    move v0, v2

    .line 251
    goto :goto_b

    .line 252
    :cond_19
    :goto_c
    new-instance v0, Ljava/math/BigDecimal;

    .line 253
    .line 254
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/math/BigDecimal;->signum()I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-nez p1, :cond_1a

    .line 262
    .line 263
    new-instance p1, Ljava/math/BigDecimal;

    .line 264
    .line 265
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 266
    .line 267
    invoke-direct {p1, v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 268
    .line 269
    .line 270
    goto :goto_d

    .line 271
    :cond_1a
    invoke-virtual {v0}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    :goto_d
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    goto :goto_10

    .line 280
    :cond_1b
    :goto_e
    check-cast p1, Ljava/lang/Number;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 283
    .line 284
    .line 285
    move-result-wide v2

    .line 286
    new-instance p1, Ljava/math/BigDecimal;

    .line 287
    .line 288
    invoke-direct {p1, v2, v3}, Ljava/math/BigDecimal;-><init>(D)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p1}, Ljava/math/BigDecimal;->signum()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-nez v0, :cond_1c

    .line 296
    .line 297
    new-instance p1, Ljava/math/BigDecimal;

    .line 298
    .line 299
    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 300
    .line 301
    invoke-direct {p1, v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 302
    .line 303
    .line 304
    goto :goto_f

    .line 305
    :cond_1c
    invoke-virtual {p1}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    :goto_f
    invoke-virtual {p0, p1}, Ljava/math/BigDecimal;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    :cond_1d
    :goto_10
    return v1

    .line 314
    nop

    .line 315
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
