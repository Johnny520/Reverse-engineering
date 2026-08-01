.class Lcom/typesafe/config/impl/SerializedConfigValue;
.super Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/io/Externalizable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/typesafe/config/impl/SerializedConfigValue$SerializedValueType;,
        Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

.field private wasConfig:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-interface {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏哲兰;->root()L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/SerializedConfigValue;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/typesafe/config/impl/SerializedConfigValue;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    return-void
.end method

.method private fieldIn(Ljava/io/ObjectInput;)Ljava/io/DataInput;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    new-array p0, p0, [B

    .line 6
    .line 7
    invoke-interface {p1, p0}, Ljava/io/DataInput;->readFully([B)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ljava/io/DataInputStream;

    .line 11
    .line 12
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method private static readCode(Ljava/io/DataInput;)Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    sget-object v0, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->UNKNOWN:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->forInt(I)Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string v0, "field code "

    .line 19
    .line 20
    const-string v1, " is not supposed to be on the wire"

    .line 21
    .line 22
    invoke-static {p0, v0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏兰哲世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public static readOrigin(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/EnumMap;

    .line 2
    .line 3
    const-class v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    :goto_0
    invoke-static {p0}, Lcom/typesafe/config/impl/SerializedConfigValue;->readCode(Ljava/io/DataInput;)Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:[I

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    aget v2, v2, v3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    packed-switch v2, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_8

    .line 25
    .line 26
    :pswitch_0
    invoke-static {p0}, Lcom/typesafe/config/impl/SerializedConfigValue;->skipField(Ljava/io/DataInput;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_8

    .line 30
    .line 31
    :pswitch_1
    const-string p0, "Not expecting this field here: "

    .line 32
    .line 33
    invoke-static {v1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v3

    .line 37
    :pswitch_2
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏()Ljava/util/EnumMap;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 45
    .line 46
    :goto_1
    new-instance p1, Ljava/util/EnumMap;

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/util/EnumMap;-><init>(Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/util/Map$Entry;

    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    sget-object v4, Lcom/typesafe/config/impl/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:[I

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    aget v4, v4, v5

    .line 91
    .line 92
    packed-switch v4, :pswitch_data_1

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :pswitch_3
    const-string p0, "should not appear here: "

    .line 97
    .line 98
    invoke-static {v2, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-object v3

    .line 102
    :pswitch_4
    const-string p1, "applying fields, base object should not contain "

    .line 103
    .line 104
    const-string v0, " "

    .line 105
    .line 106
    invoke-static {p1, v2, v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-object v3

    .line 110
    :pswitch_5
    sget-object v4, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_NULL_COMMENTS:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 111
    .line 112
    invoke-virtual {v0, v4}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-eqz v5, :cond_3

    .line 117
    .line 118
    invoke-virtual {p1, v4}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {p1, v2, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :pswitch_6
    sget-object v4, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_NULL_RESOURCE:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 131
    .line 132
    invoke-virtual {v0, v4}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    if-eqz v5, :cond_4

    .line 137
    .line 138
    invoke-virtual {p1, v4}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {p1, v2, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :pswitch_7
    sget-object v4, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_NULL_URL:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 151
    .line 152
    invoke-virtual {v0, v4}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_5

    .line 157
    .line 158
    invoke-virtual {p1, v4}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {p1, v2, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :pswitch_8
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {p1, v2, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :pswitch_9
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {p1, v2, v4}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_6
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_7

    .line 191
    .line 192
    return-object v3

    .line 193
    :cond_7
    sget-object p0, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_DESCRIPTION:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 194
    .line 195
    invoke-virtual {p1, p0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    move-object v5, p0

    .line 200
    check-cast v5, Ljava/lang/String;

    .line 201
    .line 202
    sget-object p0, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_LINE_NUMBER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 203
    .line 204
    invoke-virtual {p1, p0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    check-cast p0, Ljava/lang/Integer;

    .line 209
    .line 210
    sget-object v0, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_END_LINE_NUMBER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 211
    .line 212
    invoke-virtual {p1, v0}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, Ljava/lang/Integer;

    .line 217
    .line 218
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_TYPE:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 219
    .line 220
    invoke-virtual {p1, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Ljava/lang/Number;

    .line 225
    .line 226
    if-eqz v1, :cond_c

    .line 227
    .line 228
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    invoke-static {}, Lcom/typesafe/config/impl/OriginType;->values()[Lcom/typesafe/config/impl/OriginType;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    array-length v3, v3

    .line 237
    if-ge v2, v3, :cond_8

    .line 238
    .line 239
    invoke-static {}, Lcom/typesafe/config/impl/OriginType;->values()[Lcom/typesafe/config/impl/OriginType;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    aget-object v1, v2, v1

    .line 248
    .line 249
    :goto_3
    move-object v8, v1

    .line 250
    goto :goto_4

    .line 251
    :cond_8
    sget-object v1, Lcom/typesafe/config/impl/OriginType;->GENERIC:Lcom/typesafe/config/impl/OriginType;

    .line 252
    .line 253
    goto :goto_3

    .line 254
    :goto_4
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_URL:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 255
    .line 256
    invoke-virtual {p1, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    move-object v9, v1

    .line 261
    check-cast v9, Ljava/lang/String;

    .line 262
    .line 263
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_RESOURCE:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 264
    .line 265
    invoke-virtual {p1, v1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, Ljava/lang/String;

    .line 270
    .line 271
    sget-object v2, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_COMMENTS:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 272
    .line 273
    invoke-virtual {p1, v2}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    move-object v11, p1

    .line 278
    check-cast v11, Ljava/util/List;

    .line 279
    .line 280
    sget-object p1, Lcom/typesafe/config/impl/OriginType;->RESOURCE:Lcom/typesafe/config/impl/OriginType;

    .line 281
    .line 282
    if-ne v8, p1, :cond_9

    .line 283
    .line 284
    if-nez v1, :cond_9

    .line 285
    .line 286
    move-object v10, v5

    .line 287
    goto :goto_5

    .line 288
    :cond_9
    move-object v10, v1

    .line 289
    :goto_5
    new-instance v4, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 290
    .line 291
    const/4 p1, -0x1

    .line 292
    if-eqz p0, :cond_a

    .line 293
    .line 294
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    move v6, p0

    .line 299
    goto :goto_6

    .line 300
    :cond_a
    move v6, p1

    .line 301
    :goto_6
    if-eqz v0, :cond_b

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    :cond_b
    move v7, p1

    .line 308
    invoke-direct/range {v4 .. v11}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;-><init>(Ljava/lang/String;IILcom/typesafe/config/impl/OriginType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 309
    .line 310
    .line 311
    return-object v4

    .line 312
    :cond_c
    const-string p0, "Missing ORIGIN_TYPE field"

    .line 313
    .line 314
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    return-object v3

    .line 318
    :pswitch_a
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 319
    .line 320
    .line 321
    const-string v3, ""

    .line 322
    .line 323
    goto :goto_8

    .line 324
    :pswitch_b
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 325
    .line 326
    .line 327
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    new-instance v3, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 334
    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    :goto_7
    if-ge v4, v2, :cond_d

    .line 338
    .line 339
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    add-int/lit8 v4, v4, 0x1

    .line 347
    .line 348
    goto :goto_7

    .line 349
    :pswitch_c
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 350
    .line 351
    .line 352
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    goto :goto_8

    .line 357
    :pswitch_d
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 358
    .line 359
    .line 360
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    goto :goto_8

    .line 365
    :pswitch_e
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 366
    .line 367
    .line 368
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    goto :goto_8

    .line 377
    :pswitch_f
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 378
    .line 379
    .line 380
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 385
    .line 386
    .line 387
    move-result-object v3

    .line 388
    goto :goto_8

    .line 389
    :pswitch_10
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 390
    .line 391
    .line 392
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    goto :goto_8

    .line 401
    :pswitch_11
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 402
    .line 403
    .line 404
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    :cond_d
    :goto_8
    if-eqz v3, :cond_0

    .line 409
    .line 410
    invoke-virtual {v0, v1, v3}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    goto/16 :goto_0

    .line 414
    .line 415
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method private readResolve()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    .line 2
    .line 3
    iget-object p0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    invoke-interface {p0}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;->toConfig()L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method private static readValue(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    move-object v2, v1

    .line 4
    :goto_0
    invoke-static {p0}, Lcom/typesafe/config/impl/SerializedConfigValue;->readCode(Ljava/io/DataInput;)Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    sget-object v4, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->END_MARKER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 9
    .line 10
    if-ne v3, v4, :cond_1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    const-string p0, "No value data found in serialization of value"

    .line 16
    .line 17
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    sget-object v4, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->VALUE_DATA:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 22
    .line 23
    if-ne v3, v4, :cond_3

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v2}, Lcom/typesafe/config/impl/SerializedConfigValue;->readValueData(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const-string p0, "Origin must be stored before value data"

    .line 36
    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_3
    sget-object v4, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->VALUE_ORIGIN:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 42
    .line 43
    if-ne v3, v4, :cond_4

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 46
    .line 47
    .line 48
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/SerializedConfigValue;->readOrigin(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    goto :goto_0

    .line 53
    :cond_4
    invoke-static {p0}, Lcom/typesafe/config/impl/SerializedConfigValue;->skipField(Ljava/io/DataInput;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0
.end method

.method private static readValueData(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 5

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedValueType;->forInt(I)Lcom/typesafe/config/impl/SerializedConfigValue$SerializedValueType;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:[I

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    aget v0, v0, v3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    const-string p0, "Unhandled serialized value type: "

    .line 25
    .line 26
    invoke-static {v1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v2

    .line 30
    :pswitch_0
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    new-instance v1, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    if-ge v3, v0, :cond_0

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/SerializedConfigValue;->readValue(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v3, v3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance p0, Lcom/typesafe/config/impl/SimpleConfigObject;

    .line 56
    .line 57
    invoke-direct {p0, p1, v1}, Lcom/typesafe/config/impl/SimpleConfigObject;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/Map;)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_1
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    new-instance v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    :goto_1
    if-ge v3, v0, :cond_1

    .line 71
    .line 72
    invoke-static {p0, p1}, Lcom/typesafe/config/impl/SerializedConfigValue;->readValue(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    new-instance p0, Lcom/typesafe/config/impl/SimpleConfigList;

    .line 83
    .line 84
    invoke-direct {p0, p1, v1}, Lcom/typesafe/config/impl/SimpleConfigList;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/util/List;)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_2
    new-instance v0, Lcom/typesafe/config/impl/ConfigString$Quoted;

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-direct {v0, p1, p0}, Lcom/typesafe/config/impl/ConfigString$Quoted;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :pswitch_3
    invoke-interface {p0}, Ljava/io/DataInput;->readDouble()D

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance v2, Lcom/typesafe/config/impl/ConfigDouble;

    .line 107
    .line 108
    invoke-direct {v2, p1, v0, v1, p0}, Lcom/typesafe/config/impl/ConfigDouble;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;DLjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v2

    .line 112
    :pswitch_4
    invoke-interface {p0}, Ljava/io/DataInput;->readLong()J

    .line 113
    .line 114
    .line 115
    move-result-wide v0

    .line 116
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance v2, Lcom/typesafe/config/impl/ConfigLong;

    .line 121
    .line 122
    invoke-direct {v2, p1, v0, v1, p0}, Lcom/typesafe/config/impl/ConfigLong;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;JLjava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v2

    .line 126
    :pswitch_5
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-interface {p0}, Ljava/io/DataInput;->readUTF()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    new-instance v1, Lcom/typesafe/config/impl/ConfigInt;

    .line 135
    .line 136
    invoke-direct {v1, p1, v0, p0}, Lcom/typesafe/config/impl/ConfigInt;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;ILjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v1

    .line 140
    :pswitch_6
    new-instance p0, Lcom/typesafe/config/impl/ConfigNull;

    .line 141
    .line 142
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/ConfigNull;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)V

    .line 143
    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_7
    new-instance v0, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 147
    .line 148
    invoke-interface {p0}, Ljava/io/DataInput;->readBoolean()Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    invoke-direct {v0, p1, p0}, Lcom/typesafe/config/impl/ConfigBoolean;-><init>(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;Z)V

    .line 153
    .line 154
    .line 155
    return-object v0

    .line 156
    :cond_2
    const-string p0, "Unknown serialized value type: "

    .line 157
    .line 158
    invoke-static {v0, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-object v2

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static shouldNotBeUsed()Lcom/typesafe/config/ConfigException;
    .locals 3

    .line 1
    new-instance v0, Lcom/typesafe/config/ConfigException$BugOrBroken;

    .line 2
    .line 3
    const-class v1, Lcom/typesafe/config/impl/SerializedConfigValue;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, " should not exist outside of serialization"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lcom/typesafe/config/ConfigException$BugOrBroken;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method private static skipField(Ljava/io/DataInput;)V
    .locals 2

    .line 1
    invoke-interface {p0}, Ljava/io/DataInput;->readInt()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p0, v0}, Ljava/io/DataInput;->skipBytes(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    invoke-interface {p0, v0}, Ljava/io/DataInput;->readFully([B)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method private static writeEndMarker(Ljava/io/DataOutput;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->END_MARKER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0, v0}, Ljava/io/DataOutput;->writeByte(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static writeField(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p1, p1, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 14
    .line 15
    .line 16
    array-length p1, v0

    .line 17
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeInt(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0, v0}, Ljava/io/DataOutput;->write([B)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static writeOrigin(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏()Ljava/util/EnumMap;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 11
    .line 12
    :goto_0
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏()Ljava/util/EnumMap;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 v0, -0x1

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/util/EnumMap;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Ljava/util/EnumMap;-><init>(Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_4

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 51
    .line 52
    invoke-virtual {v1, v4}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v1, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-static {v3, v5}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_2

    .line 71
    .line 72
    invoke-virtual {v1, v4}, Ljava/util/EnumMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/EnumMap;->containsKey(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_1

    .line 81
    .line 82
    sget-object v3, Lcom/typesafe/config/impl/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰:[I

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    aget v3, v3, v5

    .line 89
    .line 90
    const-string v5, ""

    .line 91
    .line 92
    packed-switch v3, :pswitch_data_0

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :pswitch_0
    const-string p0, "should not appear here: "

    .line 97
    .line 98
    invoke-static {v4, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :pswitch_1
    const-string p0, "computing delta, base object should not contain "

    .line 103
    .line 104
    const-string p1, " "

    .line 105
    .line 106
    invoke-static {p0, v4, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_2
    sget-object v3, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_NULL_COMMENTS:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 111
    .line 112
    invoke-virtual {v1, v3, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :pswitch_3
    sget-object v3, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_NULL_RESOURCE:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 117
    .line 118
    invoke-virtual {v1, v3, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :pswitch_4
    sget-object v3, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_NULL_URL:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 123
    .line 124
    invoke-virtual {v1, v3, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :pswitch_5
    const-string p0, "should always be an ORIGIN_TYPE field"

    .line 129
    .line 130
    invoke-static {p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :pswitch_6
    sget-object v3, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_END_LINE_NUMBER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 135
    .line 136
    invoke-virtual {v1, v3, v0}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :pswitch_7
    sget-object v3, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ORIGIN_LINE_NUMBER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 141
    .line 142
    invoke-virtual {v1, v3, v0}, Ljava/util/EnumMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :pswitch_8
    const-string p0, "origin missing description field? "

    .line 147
    .line 148
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_3
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 153
    .line 154
    :cond_4
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    if-eqz p2, :cond_5

    .line 167
    .line 168
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    check-cast p2, Ljava/util/Map$Entry;

    .line 173
    .line 174
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;

    .line 175
    .line 176
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 181
    .line 182
    invoke-direct {v0, v1}, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;-><init>(Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;)V

    .line 183
    .line 184
    .line 185
    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    iget-object v2, v0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/io/DataOutputStream;

    .line 190
    .line 191
    invoke-static {v2, v1, p2}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeOriginField(Ljava/io/DataOutput;Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeField(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    invoke-static {p0}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeEndMarker(Ljava/io/DataOutput;)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static writeOriginField(Ljava/io/DataOutput;Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;Ljava/lang/Object;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string p0, "Unhandled field from origin: "

    .line 13
    .line 14
    invoke-static {p1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    check-cast p2, Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeInt(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Ljava/lang/String;

    .line 42
    .line 43
    invoke-interface {p0, p2}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    :pswitch_1
    return-void

    .line 48
    :pswitch_2
    check-cast p2, Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {p0, p2}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_3
    check-cast p2, Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {p0, p2}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_4
    check-cast p2, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_5
    check-cast p2, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeInt(I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_6
    check-cast p2, Ljava/lang/Integer;

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_7
    check-cast p2, Ljava/lang/String;

    .line 91
    .line 92
    invoke-interface {p0, p2}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static writeValue(Ljava/io/DataOutput;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->VALUE_ORIGIN:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;-><init>(Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->origin()L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 13
    .line 14
    iget-object v2, v0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/io/DataOutputStream;

    .line 15
    .line 16
    invoke-static {v2, v1, p2}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeOrigin(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeField(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;)V

    .line 20
    .line 21
    .line 22
    new-instance p2, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;

    .line 23
    .line 24
    sget-object v0, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->VALUE_DATA:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 25
    .line 26
    invoke-direct {p2, v0}, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;-><init>(Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p2, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/io/DataOutputStream;

    .line 30
    .line 31
    invoke-static {v0, p1}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeValueData(Ljava/io/DataOutput;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, p2}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeField(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeEndMarker(Ljava/io/DataOutput;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method private static writeValueData(Ljava/io/DataOutput;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)V
    .locals 3

    .line 1
    invoke-static {p1}, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedValueType;->forValue(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;)Lcom/typesafe/config/impl/SerializedConfigValue$SerializedValueType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-interface {p0, v1}, Ljava/io/DataOutput;->writeByte(I)V

    .line 10
    .line 11
    .line 12
    sget-object v1, Lcom/typesafe/config/impl/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:[I

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    aget v0, v1, v0

    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    :pswitch_0
    goto :goto_2

    .line 24
    :pswitch_1
    check-cast p1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰苏哲;

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-interface {p0, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {p0, v2}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 67
    .line 68
    invoke-interface {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->origin()L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 73
    .line 74
    invoke-static {p0, v1, v2}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeValue(Ljava/io/DataOutput;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_2
    check-cast p1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世苏兰哲;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-interface {p0, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_0

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    check-cast v1, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 102
    .line 103
    invoke-interface {p1}, L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;->origin()L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    check-cast v2, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 108
    .line 109
    invoke-static {p0, v1, v2}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeValue(Ljava/io/DataOutput;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_0
    :goto_2
    return-void

    .line 114
    :pswitch_3
    check-cast p1, Lcom/typesafe/config/impl/ConfigString;

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/typesafe/config/impl/ConfigString;->unwrapped()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_4
    move-object v0, p1

    .line 125
    check-cast v0, Lcom/typesafe/config/impl/ConfigDouble;

    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/typesafe/config/impl/ConfigDouble;->unwrapped()Ljava/lang/Double;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 132
    .line 133
    .line 134
    move-result-wide v0

    .line 135
    invoke-interface {p0, v0, v1}, Ljava/io/DataOutput;->writeDouble(D)V

    .line 136
    .line 137
    .line 138
    check-cast p1, Lcom/typesafe/config/impl/ConfigNumber;

    .line 139
    .line 140
    invoke-virtual {p1}, Lcom/typesafe/config/impl/ConfigNumber;->transformToString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-void

    .line 148
    :pswitch_5
    move-object v0, p1

    .line 149
    check-cast v0, Lcom/typesafe/config/impl/ConfigLong;

    .line 150
    .line 151
    invoke-virtual {v0}, Lcom/typesafe/config/impl/ConfigLong;->unwrapped()Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    invoke-interface {p0, v0, v1}, Ljava/io/DataOutput;->writeLong(J)V

    .line 160
    .line 161
    .line 162
    check-cast p1, Lcom/typesafe/config/impl/ConfigNumber;

    .line 163
    .line 164
    invoke-virtual {p1}, Lcom/typesafe/config/impl/ConfigNumber;->transformToString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :pswitch_6
    move-object v0, p1

    .line 173
    check-cast v0, Lcom/typesafe/config/impl/ConfigInt;

    .line 174
    .line 175
    invoke-virtual {v0}, Lcom/typesafe/config/impl/ConfigInt;->unwrapped()Ljava/lang/Integer;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    invoke-interface {p0, v0}, Ljava/io/DataOutput;->writeInt(I)V

    .line 184
    .line 185
    .line 186
    check-cast p1, Lcom/typesafe/config/impl/ConfigNumber;

    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/typesafe/config/impl/ConfigNumber;->transformToString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeUTF(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_7
    check-cast p1, Lcom/typesafe/config/impl/ConfigBoolean;

    .line 197
    .line 198
    invoke-virtual {p1}, Lcom/typesafe/config/impl/ConfigBoolean;->unwrapped()Ljava/lang/Boolean;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-interface {p0, p1}, Ljava/io/DataOutput;->writeBoolean(Z)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/typesafe/config/impl/SerializedConfigValue;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->canEqual(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    .line 13
    .line 14
    check-cast p1, Lcom/typesafe/config/impl/SerializedConfigValue;

    .line 15
    .line 16
    iget-boolean v2, p1, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    add-int/lit8 v0, v0, 0x29

    .line 8
    .line 9
    mul-int/lit8 v0, v0, 0x29

    .line 10
    .line 11
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    .line 12
    .line 13
    add-int/2addr v0, p0

    .line 14
    mul-int/lit8 v0, v0, 0x29

    .line 15
    .line 16
    return v0
.end method

.method public newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SerializedConfigValue;
    .locals 0

    .line 6
    invoke-static {}, Lcom/typesafe/config/impl/SerializedConfigValue;->shouldNotBeUsed()Lcom/typesafe/config/ConfigException;

    move-result-object p0

    throw p0
.end method

.method public bridge synthetic newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/typesafe/config/impl/SerializedConfigValue;->newCopy(L飘花落叶言楪兰子苏世哲/飘花落叶言子楪世兰哲苏;)Lcom/typesafe/config/impl/SerializedConfigValue;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public readExternal(Ljava/io/ObjectInput;)V
    .locals 3

    .line 1
    :cond_0
    :goto_0
    invoke-static {p1}, Lcom/typesafe/config/impl/SerializedConfigValue;->readCode(Ljava/io/DataInput;)Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->END_MARKER:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    return-void

    .line 10
    :cond_1
    invoke-direct {p0, p1}, Lcom/typesafe/config/impl/SerializedConfigValue;->fieldIn(Ljava/io/ObjectInput;)Ljava/io/DataInput;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    sget-object v2, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ROOT_VALUE:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 15
    .line 16
    if-ne v0, v2, :cond_2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-static {v1, v0}, Lcom/typesafe/config/impl/SerializedConfigValue;->readValue(Ljava/io/DataInput;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    sget-object v2, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ROOT_WAS_CONFIG:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 27
    .line 28
    if-ne v0, v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/io/DataInput;->readBoolean()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput-boolean v0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    .line 35
    .line 36
    goto :goto_0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "(value="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ",wasConfig="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    .line 33
    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p0, ")"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public unwrapped()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/SerializedConfigValue;->shouldNotBeUsed()Lcom/typesafe/config/ConfigException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public valueType()Lcom/typesafe/config/ConfigValueType;
    .locals 0

    .line 1
    invoke-static {}, Lcom/typesafe/config/impl/SerializedConfigValue;->shouldNotBeUsed()Lcom/typesafe/config/ConfigException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    throw p0
.end method

.method public writeExternal(Ljava/io/ObjectOutput;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    check-cast v0, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/typesafe/config/impl/飘花落叶言子楪世哲兰苏;->resolveStatus()Lcom/typesafe/config/impl/ResolveStatus;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lcom/typesafe/config/impl/ResolveStatus;->RESOLVED:Lcom/typesafe/config/impl/ResolveStatus;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;

    .line 14
    .line 15
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ROOT_VALUE:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;-><init>(Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->value:L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    iget-object v3, v0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/io/DataOutputStream;

    .line 24
    .line 25
    invoke-static {v3, v1, v2}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeValue(Ljava/io/DataOutput;L飘花落叶言楪兰子苏世哲/飘花落叶言子楪苏世兰哲;Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeField(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;

    .line 32
    .line 33
    sget-object v1, Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;->ROOT_WAS_CONFIG:Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;-><init>(Lcom/typesafe/config/impl/SerializedConfigValue$SerializedField;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/io/DataOutputStream;

    .line 39
    .line 40
    iget-boolean p0, p0, Lcom/typesafe/config/impl/SerializedConfigValue;->wasConfig:Z

    .line 41
    .line 42
    invoke-virtual {v1, p0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v0}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeField(Ljava/io/DataOutput;Lcom/typesafe/config/impl/飘花落叶言子世楪苏哲兰;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lcom/typesafe/config/impl/SerializedConfigValue;->writeEndMarker(Ljava/io/DataOutput;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    new-instance p0, Ljava/io/NotSerializableException;

    .line 53
    .line 54
    const-string p1, "tried to serialize a value with unresolved substitutions, need to Config#resolve() first, see API docs"

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method
