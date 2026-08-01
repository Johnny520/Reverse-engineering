.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;
.super Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:J

.field public static final 飘花落叶言子楪世哲苏兰:J


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:J

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "*"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sput-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:J

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sput-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏:J

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, ".."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲兰苏()Z
    .locals 4

    .line 1
    sget-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:J

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:J

    .line 4
    .line 5
    cmp-long p0, v2, v0

    .line 6
    .line 7
    if-eqz p0, :cond_1

    .line 8
    .line 9
    sget-wide v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏:J

    .line 10
    .line 11
    cmp-long p0, v2, v0

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/JSONArray;)V
    .locals 9

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-wide v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏兰哲:J

    .line 5
    .line 6
    if-eqz v0, :cond_9

    .line 7
    .line 8
    const/16 v0, -0x5a

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    :goto_0
    const/16 v0, -0x5b

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1b

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    cmp-long v4, v0, v4

    .line 31
    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世兰楪()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/JSONArray;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_8

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    :goto_2
    if-ge v1, v0, :cond_1b

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世兰楪()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_6

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_7
    :goto_3
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/JSONArray;)V

    .line 112
    .line 113
    .line 114
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_9
    iget-char v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 122
    .line 123
    const/16 v4, 0x2c

    .line 124
    .line 125
    const/16 v5, 0x7b

    .line 126
    .line 127
    const/16 v6, 0x5b

    .line 128
    .line 129
    if-ne v0, v5, :cond_16

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 132
    .line 133
    .line 134
    :cond_a
    :goto_5
    iget-char v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 135
    .line 136
    const/16 v7, 0x7d

    .line 137
    .line 138
    if-ne v0, v7, :cond_b

    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 141
    .line 142
    .line 143
    iget-char p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 144
    .line 145
    if-ne p0, v4, :cond_1b

    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 152
    .line 153
    .line 154
    move-result-wide v7

    .line 155
    cmp-long v0, v7, v2

    .line 156
    .line 157
    if-nez v0, :cond_c

    .line 158
    .line 159
    const/4 v0, 0x1

    .line 160
    goto :goto_6

    .line 161
    :cond_c
    move v0, v1

    .line 162
    :goto_6
    iget-char v7, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 163
    .line 164
    if-nez v0, :cond_d

    .line 165
    .line 166
    if-eq v7, v5, :cond_d

    .line 167
    .line 168
    if-eq v7, v6, :cond_d

    .line 169
    .line 170
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_d
    const/16 v8, 0x22

    .line 175
    .line 176
    if-eq v7, v8, :cond_14

    .line 177
    .line 178
    const/16 v8, 0x27

    .line 179
    .line 180
    if-eq v7, v8, :cond_14

    .line 181
    .line 182
    const/16 v8, 0x2b

    .line 183
    .line 184
    if-eq v7, v8, :cond_13

    .line 185
    .line 186
    const/16 v8, 0x2d

    .line 187
    .line 188
    if-eq v7, v8, :cond_13

    .line 189
    .line 190
    if-eq v7, v6, :cond_10

    .line 191
    .line 192
    const/16 v8, 0x66

    .line 193
    .line 194
    if-eq v7, v8, :cond_f

    .line 195
    .line 196
    const/16 v8, 0x6e

    .line 197
    .line 198
    if-eq v7, v8, :cond_e

    .line 199
    .line 200
    const/16 v8, 0x74

    .line 201
    .line 202
    if-eq v7, v8, :cond_f

    .line 203
    .line 204
    if-eq v7, v5, :cond_10

    .line 205
    .line 206
    packed-switch v7, :pswitch_data_0

    .line 207
    .line 208
    .line 209
    const-string p0, "TODO : "

    .line 210
    .line 211
    iget-char p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 212
    .line 213
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :cond_e
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰哲子()V

    .line 218
    .line 219
    .line 220
    const/4 v0, 0x0

    .line 221
    goto :goto_7

    .line 222
    :cond_f
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    goto :goto_7

    .line 231
    :cond_10
    if-eqz v0, :cond_12

    .line 232
    .line 233
    if-ne v7, v6, :cond_11

    .line 234
    .line 235
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    goto :goto_7

    .line 240
    :cond_11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    goto :goto_7

    .line 245
    :cond_12
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/JSONArray;)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_13
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏楪兰()Ljava/lang/Number;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    goto :goto_7

    .line 257
    :cond_14
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    :goto_7
    instance-of v7, v0, Ljava/util/Collection;

    .line 262
    .line 263
    if-eqz v7, :cond_15

    .line 264
    .line 265
    check-cast v0, Ljava/util/Collection;

    .line 266
    .line 267
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 268
    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_15
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    :goto_8
    iget-char v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 275
    .line 276
    if-ne v0, v4, :cond_a

    .line 277
    .line 278
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 279
    .line 280
    .line 281
    goto/16 :goto_5

    .line 282
    .line 283
    :cond_16
    if-ne v0, v6, :cond_1c

    .line 284
    .line 285
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 286
    .line 287
    .line 288
    :cond_17
    iget-char v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 289
    .line 290
    const/16 v1, 0x5d

    .line 291
    .line 292
    if-ne v0, v1, :cond_18

    .line 293
    .line 294
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 295
    .line 296
    .line 297
    goto :goto_b

    .line 298
    :cond_18
    if-eq v0, v5, :cond_1a

    .line 299
    .line 300
    if-ne v0, v6, :cond_19

    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_19
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 304
    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_1a
    :goto_9
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/JSONArray;)V

    .line 308
    .line 309
    .line 310
    :goto_a
    iget-char v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 311
    .line 312
    if-ne v0, v4, :cond_17

    .line 313
    .line 314
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 315
    .line 316
    .line 317
    :goto_b
    iget-char p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 318
    .line 319
    if-ne p0, v4, :cond_1b

    .line 320
    .line 321
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 322
    .line 323
    .line 324
    :cond_1b
    return-void

    .line 325
    :cond_1c
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲兰子()V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 9
    .line 10
    :goto_0
    new-instance v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 11
    .line 12
    invoke-direct {v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲兰苏()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲兰世;

    .line 22
    .line 23
    invoke-direct {v2, p0, p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲兰世;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;Lcom/alibaba/fastjson2/JSONArray;)V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;

    .line 28
    .line 29
    invoke-direct {v2, p0, p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪哲世兰;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;Lcom/alibaba/fastjson2/JSONArray;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-interface {v2, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/4 v0, 0x1

    .line 40
    if-ne p0, v0, :cond_2

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    instance-of v2, v2, Ljava/util/Collection;

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    iput-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 59
    .line 60
    :goto_2
    iget-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 61
    .line 62
    instance-of v1, p0, Ljava/util/List;

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    iget-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 67
    .line 68
    instance-of v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子世哲苏兰楪;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 73
    .line 74
    check-cast p0, Ljava/util/List;

    .line 75
    .line 76
    invoke-direct {v1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;-><init>(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    iput-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 80
    .line 81
    :cond_3
    iput-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 82
    .line 83
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/JSONArray;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    iput-boolean p0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 13
    .line 14
    return-void
.end method
