.class public abstract Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:J

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public 飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 6
    .line 7
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 5
    .line 6
    array-length p1, p2

    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, p1, :cond_0

    .line 11
    .line 12
    aget-object v3, p2, v2

    .line 13
    .line 14
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONPath$Feature;->mask:J

    .line 15
    .line 16
    or-long/2addr v0, v3

    .line 17
    add-int/lit8 v2, v2, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iput-wide v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:J

    .line 21
    .line 22
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Lcom/alibaba/fastjson2/JSONPathFilter$Operator;
    .locals 9

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "between"

    .line 5
    .line 6
    const-string v3, "in"

    .line 7
    .line 8
    const-string v4, "like"

    .line 9
    .line 10
    const-string v5, "rlike"

    .line 11
    .line 12
    const-string v6, "with"

    .line 13
    .line 14
    const/16 v7, 0x3d

    .line 15
    .line 16
    const-string v8, "not support operator : "

    .line 17
    .line 18
    sparse-switch v0, :sswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0, v8}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :sswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v2, "starts"

    .line 40
    .line 41
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v6, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {v8, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_1
    const-string p0, "startsWith"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    :goto_0
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->STARTS_WITH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_2
    invoke-static {v8, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v1

    .line 88
    :sswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {v5, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->RLIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_3
    invoke-static {v8, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v1

    .line 112
    :sswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v6, "nin"

    .line 120
    .line 121
    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-eqz v6, :cond_4

    .line 126
    .line 127
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_4
    const-string v6, "not"

    .line 131
    .line 132
    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    if-eqz v6, :cond_9

    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_5

    .line 150
    .line 151
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_LIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 152
    .line 153
    return-object p0

    .line 154
    :cond_5
    invoke-virtual {v5, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_6

    .line 159
    .line 160
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_RLIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_6
    invoke-virtual {v3, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_7

    .line 168
    .line 169
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 170
    .line 171
    return-object p0

    .line 172
    :cond_7
    invoke-virtual {v2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_8

    .line 177
    .line 178
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NOT_BETWEEN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_8
    invoke-static {v8, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object v1

    .line 189
    :cond_9
    invoke-static {v8, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-object v1

    .line 197
    :sswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-virtual {v4, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_a

    .line 209
    .line 210
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LIKE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 211
    .line 212
    return-object p0

    .line 213
    :cond_a
    invoke-static {v8, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-object v1

    .line 221
    :sswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-virtual {v3, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_b

    .line 233
    .line 234
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->IN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 235
    .line 236
    return-object p0

    .line 237
    :cond_b
    const-string v0, "is"

    .line 238
    .line 239
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_c

    .line 244
    .line 245
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->EQ:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 246
    .line 247
    return-object p0

    .line 248
    :cond_c
    invoke-static {v8, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-object v1

    .line 256
    :sswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    const-string v2, "ends"

    .line 264
    .line 265
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_e

    .line 270
    .line 271
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 272
    .line 273
    .line 274
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-virtual {v6, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_d

    .line 283
    .line 284
    goto :goto_1

    .line 285
    :cond_d
    invoke-static {v8, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    return-object v1

    .line 293
    :cond_e
    const-string p0, "endsWith"

    .line 294
    .line 295
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    if-eqz p0, :cond_f

    .line 300
    .line 301
    :goto_1
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->ENDS_WITH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 302
    .line 303
    return-object p0

    .line 304
    :cond_f
    invoke-static {v8, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p0

    .line 308
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    return-object v1

    .line 312
    :sswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲世楪()J

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-virtual {v2, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    if-eqz v0, :cond_10

    .line 324
    .line 325
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->BETWEEN:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 326
    .line 327
    return-object p0

    .line 328
    :cond_10
    invoke-static {v8, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    return-object v1

    .line 336
    :sswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 337
    .line 338
    .line 339
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 340
    .line 341
    if-ne v0, v7, :cond_11

    .line 342
    .line 343
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 344
    .line 345
    .line 346
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->GE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 347
    .line 348
    return-object p0

    .line 349
    :cond_11
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->GT:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 350
    .line 351
    return-object p0

    .line 352
    :sswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 353
    .line 354
    .line 355
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 356
    .line 357
    const/16 v1, 0x7e

    .line 358
    .line 359
    if-ne v0, v1, :cond_12

    .line 360
    .line 361
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏兰楪世()V

    .line 362
    .line 363
    .line 364
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->REG_MATCH:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 365
    .line 366
    return-object p0

    .line 367
    :cond_12
    if-ne v0, v7, :cond_13

    .line 368
    .line 369
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 370
    .line 371
    .line 372
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->EQ:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 373
    .line 374
    return-object p0

    .line 375
    :cond_13
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->EQ:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 376
    .line 377
    return-object p0

    .line 378
    :sswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 379
    .line 380
    .line 381
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 382
    .line 383
    if-ne v0, v7, :cond_14

    .line 384
    .line 385
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 386
    .line 387
    .line 388
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 389
    .line 390
    return-object p0

    .line 391
    :cond_14
    const/16 v1, 0x3e

    .line 392
    .line 393
    if-ne v0, v1, :cond_15

    .line 394
    .line 395
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 396
    .line 397
    .line 398
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 399
    .line 400
    return-object p0

    .line 401
    :cond_15
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->LT:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 402
    .line 403
    return-object p0

    .line 404
    :sswitch_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 405
    .line 406
    .line 407
    iget-char v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 408
    .line 409
    if-ne v0, v7, :cond_16

    .line 410
    .line 411
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 412
    .line 413
    .line 414
    sget-object p0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 415
    .line 416
    return-object p0

    .line 417
    :cond_16
    const-string v0, "not support operator : !"

    .line 418
    .line 419
    iget-char p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 420
    .line 421
    invoke-static {p0, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;)V

    .line 422
    .line 423
    .line 424
    return-object v1

    .line 425
    :sswitch_data_0
    .sparse-switch
        0x21 -> :sswitch_a
        0x3c -> :sswitch_9
        0x3d -> :sswitch_8
        0x3e -> :sswitch_7
        0x42 -> :sswitch_6
        0x45 -> :sswitch_5
        0x49 -> :sswitch_4
        0x4c -> :sswitch_3
        0x4e -> :sswitch_2
        0x52 -> :sswitch_1
        0x53 -> :sswitch_0
        0x62 -> :sswitch_6
        0x65 -> :sswitch_5
        0x69 -> :sswitch_4
        0x6c -> :sswitch_3
        0x6e -> :sswitch_2
        0x72 -> :sswitch_1
        0x73 -> :sswitch_0
    .end sparse-switch
.end method

.method public static 飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "#-1"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世苏哲;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    new-array v3, v2, [Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 21
    .line 22
    iget-boolean v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰:Z

    .line 23
    .line 24
    const/16 v5, 0x1a

    .line 25
    .line 26
    sget-object v6, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪苏世哲兰:Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;

    .line 27
    .line 28
    iget-object v7, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;

    .line 29
    .line 30
    iget-boolean v14, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰:Z

    .line 31
    .line 32
    if-eqz v14, :cond_2

    .line 33
    .line 34
    iget-char v8, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 35
    .line 36
    if-ne v8, v5, :cond_2

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰楪世;

    .line 41
    .line 42
    new-array v2, v2, [Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 43
    .line 44
    invoke-direct {v1, v6, v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰楪世;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 45
    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_1
    sget-object v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子楪兰世哲苏;

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    iget-char v8, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 52
    .line 53
    const/16 v9, 0x65

    .line 54
    .line 55
    const/16 v10, 0x5f

    .line 56
    .line 57
    const/16 v11, 0x5a

    .line 58
    .line 59
    const/16 v12, 0x41

    .line 60
    .line 61
    const/16 v13, 0x7a

    .line 62
    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const/16 v15, 0x61

    .line 66
    .line 67
    const/16 v5, 0x2e

    .line 68
    .line 69
    const/16 v2, 0x40

    .line 70
    .line 71
    if-ne v8, v9, :cond_c

    .line 72
    .line 73
    move v8, v12

    .line 74
    const/16 v12, 0x74

    .line 75
    .line 76
    move v9, v13

    .line 77
    const/16 v13, 0x73

    .line 78
    .line 79
    move/from16 v17, v8

    .line 80
    .line 81
    const/16 v8, 0x65

    .line 82
    .line 83
    move/from16 v18, v9

    .line 84
    .line 85
    const/16 v9, 0x78

    .line 86
    .line 87
    move/from16 v19, v10

    .line 88
    .line 89
    const/16 v10, 0x69

    .line 90
    .line 91
    move/from16 v20, v11

    .line 92
    .line 93
    const/16 v11, 0x73

    .line 94
    .line 95
    invoke-virtual/range {v7 .. v13}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世苏楪兰(CCCCCC)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_b

    .line 100
    .line 101
    const/16 v3, 0x28

    .line 102
    .line 103
    invoke-virtual {v7, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    const-string v4, "syntax error "

    .line 108
    .line 109
    if-eqz v3, :cond_a

    .line 110
    .line 111
    iget-char v3, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 112
    .line 113
    if-ne v3, v2, :cond_4

    .line 114
    .line 115
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_3

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v16

    .line 133
    :cond_4
    :goto_0
    iget-char v3, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 134
    .line 135
    if-lt v3, v15, :cond_5

    .line 136
    .line 137
    const/16 v9, 0x7a

    .line 138
    .line 139
    if-le v3, v9, :cond_8

    .line 140
    .line 141
    :cond_5
    const/16 v8, 0x41

    .line 142
    .line 143
    if-lt v3, v8, :cond_6

    .line 144
    .line 145
    const/16 v10, 0x5a

    .line 146
    .line 147
    if-le v3, v10, :cond_8

    .line 148
    .line 149
    :cond_6
    const/16 v11, 0x5f

    .line 150
    .line 151
    if-eq v3, v11, :cond_8

    .line 152
    .line 153
    if-eq v3, v2, :cond_8

    .line 154
    .line 155
    invoke-static {v3}, Ljava/lang/Character;->isIdeographic(I)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_7

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-object v16

    .line 170
    :cond_8
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏()Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    const/16 v2, 0x29

    .line 175
    .line 176
    invoke-virtual {v7, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世(C)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_9

    .line 181
    .line 182
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰楪哲世;

    .line 183
    .line 184
    sget-object v3, Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/飘花落叶言子世兰苏哲楪;

    .line 185
    .line 186
    const/4 v4, 0x0

    .line 187
    new-array v4, v4, [Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 188
    .line 189
    invoke-direct {v2, v0, v1, v3, v4}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰楪哲世;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 190
    .line 191
    .line 192
    return-object v2

    .line 193
    :cond_9
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-object v16

    .line 201
    :cond_a
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    return-object v16

    .line 209
    :cond_b
    const/16 v8, 0x41

    .line 210
    .line 211
    const/16 v9, 0x7a

    .line 212
    .line 213
    const/16 v10, 0x5a

    .line 214
    .line 215
    const/16 v11, 0x5f

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_c
    move v8, v11

    .line 219
    move v11, v10

    .line 220
    move v10, v8

    .line 221
    move v8, v12

    .line 222
    move v9, v13

    .line 223
    :goto_2
    iget-char v12, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 224
    .line 225
    const/16 v13, 0x1a

    .line 226
    .line 227
    if-eq v12, v13, :cond_19

    .line 228
    .line 229
    if-ne v12, v5, :cond_d

    .line 230
    .line 231
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏()Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 235
    .line 236
    .line 237
    move-result-object v12

    .line 238
    goto :goto_4

    .line 239
    :cond_d
    const/16 v5, 0x5b

    .line 240
    .line 241
    if-ne v12, v5, :cond_e

    .line 242
    .line 243
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰()Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 244
    .line 245
    .line 246
    move-result-object v12

    .line 247
    goto :goto_4

    .line 248
    :cond_e
    if-lt v12, v15, :cond_f

    .line 249
    .line 250
    if-le v12, v9, :cond_15

    .line 251
    .line 252
    :cond_f
    if-lt v12, v8, :cond_10

    .line 253
    .line 254
    if-le v12, v10, :cond_15

    .line 255
    .line 256
    :cond_10
    if-eq v12, v11, :cond_15

    .line 257
    .line 258
    invoke-static {v12}, Ljava/lang/Character;->isIdeographic(I)Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-eqz v5, :cond_11

    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_11
    const/16 v5, 0x3f

    .line 266
    .line 267
    if-ne v12, v5, :cond_13

    .line 268
    .line 269
    if-eqz v14, :cond_12

    .line 270
    .line 271
    iget v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 272
    .line 273
    if-nez v5, :cond_12

    .line 274
    .line 275
    sget-object v12, Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子苏世兰哲楪;

    .line 276
    .line 277
    iput-object v12, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 278
    .line 279
    add-int/lit8 v5, v5, 0x1

    .line 280
    .line 281
    iput v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 282
    .line 283
    :cond_12
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲()Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    goto :goto_4

    .line 291
    :cond_13
    if-ne v12, v2, :cond_14

    .line 292
    .line 293
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 294
    .line 295
    .line 296
    sget-object v12, Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪世兰;

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_14
    const-string v0, "not support "

    .line 300
    .line 301
    invoke-static {v12, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲(ILjava/lang/String;)V

    .line 302
    .line 303
    .line 304
    return-object v16

    .line 305
    :cond_15
    :goto_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏()Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 306
    .line 307
    .line 308
    move-result-object v12

    .line 309
    :goto_4
    iget v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 310
    .line 311
    if-nez v5, :cond_16

    .line 312
    .line 313
    iput-object v12, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 314
    .line 315
    goto :goto_5

    .line 316
    :cond_16
    const/4 v2, 0x1

    .line 317
    if-ne v5, v2, :cond_17

    .line 318
    .line 319
    iput-object v12, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 320
    .line 321
    goto :goto_5

    .line 322
    :cond_17
    const/4 v2, 0x2

    .line 323
    if-ne v5, v2, :cond_18

    .line 324
    .line 325
    new-instance v2, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 328
    .line 329
    .line 330
    iput-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 331
    .line 332
    iget-object v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 333
    .line 334
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    iget-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 338
    .line 339
    iget-object v5, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 340
    .line 341
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    iget-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_18
    iget-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    :goto_5
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 356
    .line 357
    const/4 v5, 0x1

    .line 358
    add-int/2addr v2, v5

    .line 359
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 360
    .line 361
    const/16 v2, 0x40

    .line 362
    .line 363
    const/16 v5, 0x2e

    .line 364
    .line 365
    goto/16 :goto_2

    .line 366
    .line 367
    :cond_19
    const/4 v5, 0x1

    .line 368
    if-eqz v4, :cond_1c

    .line 369
    .line 370
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 371
    .line 372
    if-ne v2, v5, :cond_1a

    .line 373
    .line 374
    iput-object v6, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_1a
    const/4 v4, 0x2

    .line 378
    if-ne v2, v4, :cond_1b

    .line 379
    .line 380
    new-instance v2, Ljava/util/ArrayList;

    .line 381
    .line 382
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 383
    .line 384
    .line 385
    iput-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 386
    .line 387
    iget-object v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 388
    .line 389
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    iget-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 393
    .line 394
    iget-object v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 395
    .line 396
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    iget-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_1b
    iget-object v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 406
    .line 407
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    :goto_6
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 411
    .line 412
    const/4 v5, 0x1

    .line 413
    add-int/2addr v2, v5

    .line 414
    iput v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 415
    .line 416
    :cond_1c
    iget v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 417
    .line 418
    if-ne v2, v5, :cond_1f

    .line 419
    .line 420
    iget-object v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 421
    .line 422
    instance-of v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

    .line 423
    .line 424
    if-eqz v2, :cond_1d

    .line 425
    .line 426
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰楪世哲;

    .line 427
    .line 428
    check-cast v1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;

    .line 429
    .line 430
    invoke-direct {v2, v0, v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰楪世哲;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世兰楪;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 431
    .line 432
    .line 433
    return-object v2

    .line 434
    :cond_1d
    instance-of v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 435
    .line 436
    if-eqz v2, :cond_1e

    .line 437
    .line 438
    move-object v2, v1

    .line 439
    check-cast v2, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;

    .line 440
    .line 441
    iget v4, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰:I

    .line 442
    .line 443
    if-ltz v4, :cond_1e

    .line 444
    .line 445
    new-instance v1, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;

    .line 446
    .line 447
    invoke-direct {v1, v0, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰世楪;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏哲世楪兰;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 448
    .line 449
    .line 450
    return-object v1

    .line 451
    :cond_1e
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰楪世;

    .line 452
    .line 453
    invoke-direct {v2, v1, v0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子苏哲兰楪世;-><init>(Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 454
    .line 455
    .line 456
    return-object v2

    .line 457
    :cond_1f
    const/4 v4, 0x2

    .line 458
    if-ne v2, v4, :cond_20

    .line 459
    .line 460
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰楪哲世;

    .line 461
    .line 462
    iget-object v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰苏哲:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 463
    .line 464
    iget-object v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世兰哲苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 465
    .line 466
    invoke-direct {v2, v0, v4, v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰楪哲世;-><init>(Ljava/lang/String;Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 467
    .line 468
    .line 469
    return-object v2

    .line 470
    :cond_20
    new-instance v2, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲楪苏;

    .line 471
    .line 472
    iget-object v1, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏世哲兰:Ljava/util/ArrayList;

    .line 473
    .line 474
    invoke-direct {v2, v0, v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子世兰哲楪苏;-><init>(Ljava/lang/String;Ljava/util/List;[Lcom/alibaba/fastjson2/JSONPath$Feature;)V

    .line 475
    .line 476
    .line 477
    return-object v2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract 飘花落叶言子楪世哲兰苏()Z
.end method

.method public final 飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 6
    .line 7
    sget-object v1, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;-><init>(L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 15
    .line 16
    return-object p0
.end method

.method public abstract 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
.end method

.method public abstract 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;
.end method
