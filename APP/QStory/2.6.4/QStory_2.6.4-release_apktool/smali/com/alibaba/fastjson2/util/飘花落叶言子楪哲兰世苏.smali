.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/GenericDeclaration;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/GenericDeclaration;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/util/function/Supplier;Ljava/lang/reflect/Method;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 14
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/GenericDeclaration;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/GenericDeclaration;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Ljava/lang/Class;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz p1, :cond_17

    .line 16
    .line 17
    const-string v0, "null"

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_17

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    goto/16 :goto_8

    .line 32
    .line 33
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    if-eq p0, v0, :cond_16

    .line 36
    .line 37
    const-class v0, Ljava/lang/Byte;

    .line 38
    .line 39
    if-ne p0, v0, :cond_1

    .line 40
    .line 41
    goto/16 :goto_7

    .line 42
    .line 43
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-eq p0, v0, :cond_15

    .line 46
    .line 47
    const-class v0, Ljava/lang/Short;

    .line 48
    .line 49
    if-ne p0, v0, :cond_2

    .line 50
    .line 51
    goto/16 :goto_6

    .line 52
    .line 53
    :cond_2
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    if-eq p0, v0, :cond_14

    .line 56
    .line 57
    const-class v0, Ljava/lang/Integer;

    .line 58
    .line 59
    if-ne p0, v0, :cond_3

    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    if-eq p0, v0, :cond_12

    .line 66
    .line 67
    const-class v0, Ljava/lang/Long;

    .line 68
    .line 69
    if-ne p0, v0, :cond_4

    .line 70
    .line 71
    goto/16 :goto_4

    .line 72
    .line 73
    :cond_4
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    if-eq p0, v0, :cond_11

    .line 76
    .line 77
    const-class v0, Ljava/lang/Float;

    .line 78
    .line 79
    if-ne p0, v0, :cond_5

    .line 80
    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_5
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    if-eq p0, v0, :cond_10

    .line 86
    .line 87
    const-class v0, Ljava/lang/Double;

    .line 88
    .line 89
    if-ne p0, v0, :cond_6

    .line 90
    .line 91
    goto/16 :goto_2

    .line 92
    .line 93
    :cond_6
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    if-eq p0, v0, :cond_f

    .line 97
    .line 98
    const-class v0, Ljava/lang/Character;

    .line 99
    .line 100
    if-ne p0, v0, :cond_7

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_7
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    if-eq p0, v0, :cond_e

    .line 106
    .line 107
    const-class v0, Ljava/lang/Boolean;

    .line 108
    .line 109
    if-ne p0, v0, :cond_8

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_8
    const-class v0, Ljava/math/BigDecimal;

    .line 113
    .line 114
    if-ne p0, v0, :cond_9

    .line 115
    .line 116
    new-instance v1, Ljava/math/BigDecimal;

    .line 117
    .line 118
    invoke-direct {v1, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    goto/16 :goto_8

    .line 122
    .line 123
    :cond_9
    const-class v0, Ljava/math/BigInteger;

    .line 124
    .line 125
    if-ne p0, v0, :cond_a

    .line 126
    .line 127
    new-instance v1, Ljava/math/BigInteger;

    .line 128
    .line 129
    invoke-direct {v1, p1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_8

    .line 133
    .line 134
    :cond_a
    const-class v0, Ljava/util/Collections;

    .line 135
    .line 136
    if-eq p0, v0, :cond_b

    .line 137
    .line 138
    const-class v0, Ljava/util/List;

    .line 139
    .line 140
    if-eq p0, v0, :cond_b

    .line 141
    .line 142
    const-class v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 143
    .line 144
    if-ne p0, v0, :cond_d

    .line 145
    .line 146
    :cond_b
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    const/16 v1, 0x5b

    .line 151
    .line 152
    if-ne v0, v1, :cond_c

    .line 153
    .line 154
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    goto/16 :goto_8

    .line 159
    .line 160
    :cond_c
    const/16 v0, 0x2c

    .line 161
    .line 162
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    const/4 v1, -0x1

    .line 167
    if-eq v0, v1, :cond_d

    .line 168
    .line 169
    const-string p0, ","

    .line 170
    .line 171
    invoke-virtual {p1, p0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    goto/16 :goto_8

    .line 180
    .line 181
    :cond_d
    const-string v0, "can not convert to "

    .line 182
    .line 183
    const-string v1, ", value : "

    .line 184
    .line 185
    invoke-static {v0, p0, v1, p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    move-object v1, v2

    .line 189
    goto :goto_8

    .line 190
    :cond_e
    :goto_0
    const-string p0, "true"

    .line 191
    .line 192
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result p0

    .line 196
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    goto :goto_8

    .line 201
    :cond_f
    :goto_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    goto :goto_8

    .line 210
    :cond_10
    :goto_2
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 211
    .line 212
    .line 213
    move-result-wide p0

    .line 214
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    goto :goto_8

    .line 219
    :cond_11
    :goto_3
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    goto :goto_8

    .line 228
    :cond_12
    :goto_4
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    if-nez p0, :cond_13

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    const/16 v0, 0x13

    .line 239
    .line 240
    if-ne p0, v0, :cond_13

    .line 241
    .line 242
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 243
    .line 244
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子苏楪兰哲世(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 245
    .line 246
    .line 247
    move-result-wide p0

    .line 248
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    goto :goto_8

    .line 253
    :cond_13
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 254
    .line 255
    .line 256
    move-result-wide p0

    .line 257
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    goto :goto_8

    .line 262
    :cond_14
    :goto_5
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    goto :goto_8

    .line 271
    :cond_15
    :goto_6
    invoke-static {p1}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    .line 272
    .line 273
    .line 274
    move-result p0

    .line 275
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    goto :goto_8

    .line 280
    :cond_16
    :goto_7
    invoke-static {p1}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    .line 281
    .line 282
    .line 283
    move-result p0

    .line 284
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    :cond_17
    :goto_8
    return-object v1

    .line 289
    :pswitch_0
    check-cast p1, Ljava/util/Map;

    .line 290
    .line 291
    check-cast v1, Ljava/util/function/Supplier;

    .line 292
    .line 293
    invoke-interface {v1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    if-eqz v1, :cond_18

    .line 310
    .line 311
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, Ljava/util/Map$Entry;

    .line 316
    .line 317
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    check-cast v1, Ljava/lang/Iterable;

    .line 326
    .line 327
    :try_start_0
    move-object v4, p0

    .line 328
    check-cast v4, Ljava/lang/reflect/Method;

    .line 329
    .line 330
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-virtual {v4, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    .line 336
    .line 337
    goto :goto_9

    .line 338
    :catchall_0
    move-exception p0

    .line 339
    const-string p1, "putAll ArrayListMultimap error"

    .line 340
    .line 341
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    goto :goto_a

    .line 345
    :cond_18
    move-object v2, v0

    .line 346
    :goto_a
    return-object v2

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
