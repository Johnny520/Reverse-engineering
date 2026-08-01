.class public final Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;
.super L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

.field public 飘花落叶言子楪世哲兰苏:Ljava/util/List;

.field public final synthetic 飘花落叶言子楪世哲苏兰:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, Lorg/luckypray/dexkit/query/enums/MatchType;->Contains:Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 8
    .line 9
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 12
    iput p1, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I
    .locals 7

    .line 1
    iget v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x2

    .line 6
    const/16 v4, 0xa

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {v0, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰哲世;

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    :goto_1
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰哲世;->飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    new-instance v4, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰哲世;

    .line 49
    .line 50
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :goto_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪世哲苏(Ljava/util/ArrayList;)[I

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲([I)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move v0, v5

    .line 72
    :goto_3
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    invoke-virtual {p0, p1}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    goto :goto_4

    .line 83
    :cond_3
    move p0, v5

    .line 84
    :goto_4
    invoke-virtual {p1, v3}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v2, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v5, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 98
    .line 99
    .line 100
    return p0

    .line 101
    :pswitch_0
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    new-instance v6, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-static {v0, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;

    .line 129
    .line 130
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_4
    invoke-static {v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪世哲苏(Ljava/util/ArrayList;)[I

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲([I)I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    goto :goto_6

    .line 154
    :cond_5
    move v0, v5

    .line 155
    :goto_6
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p0, Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 158
    .line 159
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v3, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v5, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, p0, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(BI)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 180
    .line 181
    .line 182
    return p0

    .line 183
    :pswitch_1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 184
    .line 185
    if-eqz v0, :cond_7

    .line 186
    .line 187
    new-instance v6, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-static {v0, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_6

    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;

    .line 211
    .line 212
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_6
    invoke-static {v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪世哲苏(Ljava/util/ArrayList;)[I

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲([I)I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    goto :goto_8

    .line 236
    :cond_7
    move v0, v5

    .line 237
    :goto_8
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p0, Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 240
    .line 241
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 242
    .line 243
    .line 244
    move-result p0

    .line 245
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, v3, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v5, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p1, p0, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(BI)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 262
    .line 263
    .line 264
    return p0

    .line 265
    :pswitch_2
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 266
    .line 267
    if-eqz v0, :cond_9

    .line 268
    .line 269
    new-instance v6, Ljava/util/ArrayList;

    .line 270
    .line 271
    invoke-static {v0, v4}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子苏世兰哲楪(Ljava/lang/Iterable;I)I

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    .line 277
    .line 278
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v4

    .line 286
    if-eqz v4, :cond_8

    .line 287
    .line 288
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    check-cast v4, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;

    .line 293
    .line 294
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v4, p1}, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲世兰;->飘花落叶言子世苏兰哲楪(Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    goto :goto_9

    .line 309
    :cond_8
    invoke-static {v6}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰楪世哲苏(Ljava/util/ArrayList;)[I

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    invoke-virtual {p1, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲([I)I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    goto :goto_a

    .line 318
    :cond_9
    move v0, v5

    .line 319
    :goto_a
    iget-object p0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p0, Lorg/luckypray/dexkit/query/enums/MatchType;

    .line 322
    .line 323
    invoke-virtual {p0}, Lorg/luckypray/dexkit/query/enums/MatchType;->getValue()B

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    invoke-virtual {p1, v1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰(I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p1, v3, v5}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p1, v5, v0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(II)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1, p0, v2}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(BI)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰()I

    .line 340
    .line 341
    .line 342
    move-result p0

    .line 343
    invoke-virtual {p1, p0}, Lcom/google/flatbuffers/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)V

    .line 344
    .line 345
    .line 346
    return p0

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public 飘花落叶言子苏世兰哲楪(Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏兰世哲;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v0, p0, Lorg/luckypray/dexkit/query/matchers/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
