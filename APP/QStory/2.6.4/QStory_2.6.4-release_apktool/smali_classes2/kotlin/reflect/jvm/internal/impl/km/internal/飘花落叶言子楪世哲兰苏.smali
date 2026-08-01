.class public abstract Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static final 飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰哲世苏;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子世兰苏楪哲:L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getFlags()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1}, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(I)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x1

    .line 19
    const/4 v2, -0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value$Type;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:[I

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    aget v2, v0, p1

    .line 37
    .line 38
    :goto_0
    if-eq v2, v1, :cond_4

    .line 39
    .line 40
    const/4 p1, 0x2

    .line 41
    if-eq v2, p1, :cond_3

    .line 42
    .line 43
    const/4 p1, 0x3

    .line 44
    if-eq v2, p1, :cond_2

    .line 45
    .line 46
    const/4 p1, 0x4

    .line 47
    if-ne v2, p1, :cond_1

    .line 48
    .line 49
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰苏世哲;

    .line 50
    .line 51
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    invoke-direct {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰苏世哲;-><init>(J)V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_1
    const-string p1, "Cannot read value of unsigned type: "

    .line 60
    .line 61
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value$Type;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0, p1}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v3

    .line 69
    :cond_2
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰世哲苏;

    .line 70
    .line 71
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    long-to-int p0, v0

    .line 76
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰世哲苏;-><init>(I)V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_3
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰苏哲世;

    .line 81
    .line 82
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    long-to-int p0, v0

    .line 87
    int-to-short p0, p0

    .line 88
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰苏哲世;-><init>(S)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_4
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰世苏哲;

    .line 93
    .line 94
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    long-to-int p0, v0

    .line 99
    int-to-byte p0, p0

    .line 100
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰世苏哲;-><init>(B)V

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_5
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getType()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value$Type;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-nez v0, :cond_6

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_6
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:[I

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    aget v2, v2, v0

    .line 118
    .line 119
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 120
    .line 121
    .line 122
    :pswitch_0
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()V

    .line 123
    .line 124
    .line 125
    return-object v3

    .line 126
    :pswitch_1
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getArrayElementList()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v0, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    :cond_7
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_8

    .line 147
    .line 148
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-static {v1, p1}, Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰哲世苏;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-eqz v1, :cond_7

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_8
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世兰哲苏;

    .line 168
    .line 169
    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世兰哲苏;-><init>(Ljava/util/ArrayList;)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_2
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世哲兰苏;

    .line 174
    .line 175
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getAnnotation()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世哲苏兰;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世哲兰苏;-><init>(Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世哲苏兰;)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_3
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏兰世哲;

    .line 191
    .line 192
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getClassId()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    invoke-static {p1, v1}, Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;I)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getEnumValueId()I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    invoke-interface {p1, p0}, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;->getString(I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-direct {v0, v1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getClassId()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    invoke-static {p1, v0}, Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getArrayDimensionCount()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-nez v0, :cond_9

    .line 225
    .line 226
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲世兰苏;

    .line 227
    .line 228
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲世兰苏;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-object p0

    .line 232
    :cond_9
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世兰苏哲;

    .line 233
    .line 234
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getArrayDimensionCount()I

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    invoke-direct {v0, p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/String;I)V

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    :pswitch_5
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲兰苏世;

    .line 243
    .line 244
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getStringValue()I

    .line 245
    .line 246
    .line 247
    move-result p0

    .line 248
    invoke-interface {p1, p0}, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;->getString(I)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-direct {v0, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲兰苏世;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_6
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏世哲兰;

    .line 257
    .line 258
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 259
    .line 260
    .line 261
    move-result-wide v2

    .line 262
    const-wide/16 v4, 0x0

    .line 263
    .line 264
    cmp-long p0, v2, v4

    .line 265
    .line 266
    if-eqz p0, :cond_a

    .line 267
    .line 268
    goto :goto_3

    .line 269
    :cond_a
    const/4 v1, 0x0

    .line 270
    :goto_3
    invoke-direct {p1, v1}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏世哲兰;-><init>(Z)V

    .line 271
    .line 272
    .line 273
    return-object p1

    .line 274
    :pswitch_7
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏哲兰世;

    .line 275
    .line 276
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getDoubleValue()D

    .line 277
    .line 278
    .line 279
    move-result-wide v0

    .line 280
    invoke-direct {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏哲兰世;-><init>(D)V

    .line 281
    .line 282
    .line 283
    return-object p1

    .line 284
    :pswitch_8
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏兰哲世;

    .line 285
    .line 286
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getFloatValue()F

    .line 287
    .line 288
    .line 289
    move-result p0

    .line 290
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏兰哲世;-><init>(F)V

    .line 291
    .line 292
    .line 293
    return-object p1

    .line 294
    :pswitch_9
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏哲世兰;

    .line 295
    .line 296
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 297
    .line 298
    .line 299
    move-result-wide v0

    .line 300
    long-to-int p0, v0

    .line 301
    int-to-char p0, p0

    .line 302
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏哲世兰;-><init>(C)V

    .line 303
    .line 304
    .line 305
    return-object p1

    .line 306
    :pswitch_a
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲苏兰世;

    .line 307
    .line 308
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 309
    .line 310
    .line 311
    move-result-wide v0

    .line 312
    invoke-direct {p1, v0, v1}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲苏兰世;-><init>(J)V

    .line 313
    .line 314
    .line 315
    return-object p1

    .line 316
    :pswitch_b
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲世苏兰;

    .line 317
    .line 318
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 319
    .line 320
    .line 321
    move-result-wide v0

    .line 322
    long-to-int p0, v0

    .line 323
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲世苏兰;-><init>(I)V

    .line 324
    .line 325
    .line 326
    return-object p1

    .line 327
    :pswitch_c
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲兰世苏;

    .line 328
    .line 329
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 330
    .line 331
    .line 332
    move-result-wide v0

    .line 333
    long-to-int p0, v0

    .line 334
    int-to-short p0, p0

    .line 335
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪哲兰世苏;-><init>(S)V

    .line 336
    .line 337
    .line 338
    return-object p1

    .line 339
    :pswitch_d
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏世兰哲;

    .line 340
    .line 341
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;->getIntValue()J

    .line 342
    .line 343
    .line 344
    move-result-wide v0

    .line 345
    long-to-int p0, v0

    .line 346
    int-to-byte p0, p0

    .line 347
    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪苏世兰哲;-><init>(B)V

    .line 348
    .line 349
    .line 350
    return-object p1

    .line 351
    :pswitch_e
    return-object v3

    .line 352
    nop

    .line 353
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世哲苏兰;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;->getId()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {p1, v0}, Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation;->getArgumentList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument;

    .line 39
    .line 40
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument;->getValue()Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v3, p1}, Lkotlin/reflect/jvm/internal/impl/km/internal/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument$Value;L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;)Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪兰哲世苏;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Annotation$Argument;->getNameId()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-interface {p1, v2}, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;->getString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v4, Lkotlin/Pair;

    .line 62
    .line 63
    invoke-direct {v4, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const/4 v4, 0x0

    .line 68
    :goto_1
    if-eqz v4, :cond_0

    .line 69
    .line 70
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子世楪苏兰哲;->飘花落叶言子世兰楪哲苏(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世哲苏兰;

    .line 79
    .line 80
    invoke-direct {p1, v0, p0}, Lkotlin/reflect/jvm/internal/impl/km/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 81
    .line 82
    .line 83
    return-object p1
.end method

.method public static final 飘花落叶言子楪世苏哲兰(L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p1}, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {p0, p1}, L飘花落叶言世楪兰苏子哲/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(I)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    const-string p0, "."

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    return-object v0
.end method
