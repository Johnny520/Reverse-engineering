.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;
.super Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final CLASS_SUBLIST:Ljava/lang/Class;

.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

.field static final INSTANCE_JSON_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

.field static final INSTANCE_JSON_ARRAY_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

.field static final TYPE_NAME_ARRAY_LIST:Ljava/lang/String;

.field static final TYPE_NAME_HASH_ARRAY_LIST:J

.field static final TYPE_NAME_JSONB_ARRAY_LIST:[B


# instance fields
.field final defineClass:Ljava/lang/Class;

.field final defineType:Ljava/lang/reflect/Type;

.field final features:J

.field final itemClass:Ljava/lang/Class;

.field final itemClassRefDetect:Z

.field volatile itemClassWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

.field final itemType:Ljava/lang/reflect/Type;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const-wide/16 v5, 0x0

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 13
    .line 14
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const-wide/16 v6, 0x0

    .line 18
    .line 19
    const-class v2, Lcom/alibaba/fastjson2/JSONArray;

    .line 20
    .line 21
    invoke-direct/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE_JSON_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 25
    .line 26
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONArray1x()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE_JSON_ARRAY_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    const-wide/16 v7, 0x0

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    .line 44
    .line 45
    .line 46
    sput-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE_JSON_ARRAY_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 47
    .line 48
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-virtual {v0, v1, v1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->CLASS_SUBLIST:Ljava/lang/Class;

    .line 63
    .line 64
    const-class v0, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->TYPE_NAME_ARRAY_LIST:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    sput-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->TYPE_NAME_JSONB_ARRAY_LIST:[B

    .line 77
    .line 78
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v0

    .line 82
    sput-wide v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->TYPE_NAME_HASH_ARRAY_LIST:J

    .line 83
    .line 84
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->defineClass:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->defineType:Ljava/lang/reflect/Type;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClass:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemType:Ljava/lang/reflect/Type;

    .line 11
    .line 12
    iput-wide p5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->features:J

    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    invoke-static {p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassRefDetect:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toList(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v8

    .line 15
    iget-boolean v1, v2, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    if-eqz v1, :cond_4

    .line 20
    .line 21
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 26
    .line 27
    .line 28
    move-object v1, v9

    .line 29
    :goto_0
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-ge v10, v3, :cond_3

    .line 34
    .line 35
    invoke-interface {v8, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-ne v4, v9, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    move-object v9, v4

    .line 57
    :goto_1
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemType:Ljava/lang/reflect/Type;

    .line 62
    .line 63
    move-wide/from16 v6, p5

    .line 64
    .line 65
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 66
    .line 67
    .line 68
    :goto_2
    add-int/lit8 v10, v10, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-void

    .line 72
    :cond_4
    iget-object v11, v2, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 73
    .line 74
    iget-object v12, v11, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 75
    .line 76
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v13

    .line 80
    if-nez v13, :cond_5

    .line 81
    .line 82
    const/16 v1, 0x5b

    .line 83
    .line 84
    const/16 v3, 0x5d

    .line 85
    .line 86
    invoke-virtual {v2, v1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(CC)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_5
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->startArray()V

    .line 91
    .line 92
    .line 93
    move-object v1, v9

    .line 94
    move-object/from16 v16, v1

    .line 95
    .line 96
    move v15, v10

    .line 97
    const/16 v17, 0x1

    .line 98
    .line 99
    :goto_3
    if-ge v15, v13, :cond_1b

    .line 100
    .line 101
    if-eqz v15, :cond_6

    .line 102
    .line 103
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeComma()V

    .line 104
    .line 105
    .line 106
    :cond_6
    invoke-interface {v8, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-nez v3, :cond_7

    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 113
    .line 114
    .line 115
    :goto_4
    move-object v14, v1

    .line 116
    goto/16 :goto_5

    .line 117
    .line 118
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    const-class v5, Ljava/lang/String;

    .line 123
    .line 124
    if-ne v4, v5, :cond_8

    .line 125
    .line 126
    check-cast v3, Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_8
    const-class v5, Ljava/lang/Integer;

    .line 133
    .line 134
    const-wide/16 v18, 0x0

    .line 135
    .line 136
    if-ne v4, v5, :cond_a

    .line 137
    .line 138
    const-wide/16 p2, 0x2

    .line 139
    .line 140
    iget-wide v6, v12, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 141
    .line 142
    and-long v5, v6, p2

    .line 143
    .line 144
    cmp-long v5, v5, v18

    .line 145
    .line 146
    if-nez v5, :cond_9

    .line 147
    .line 148
    check-cast v3, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(Ljava/lang/Integer;)V

    .line 151
    .line 152
    .line 153
    goto :goto_4

    .line 154
    :cond_9
    move-object v5, v1

    .line 155
    invoke-virtual {v12, v4, v4, v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    move-object v6, v5

    .line 164
    const-class v5, Ljava/lang/Integer;

    .line 165
    .line 166
    move-object v14, v6

    .line 167
    move-wide/from16 v6, p5

    .line 168
    .line 169
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_5

    .line 173
    .line 174
    :cond_a
    move-object v14, v1

    .line 175
    const-wide/16 p2, 0x2

    .line 176
    .line 177
    const-class v1, Ljava/lang/Long;

    .line 178
    .line 179
    if-ne v4, v1, :cond_c

    .line 180
    .line 181
    iget-wide v5, v12, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 182
    .line 183
    const-wide/16 v20, 0x4

    .line 184
    .line 185
    and-long v5, v5, v20

    .line 186
    .line 187
    cmp-long v1, v5, v18

    .line 188
    .line 189
    if-nez v1, :cond_b

    .line 190
    .line 191
    check-cast v3, Ljava/lang/Long;

    .line 192
    .line 193
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(Ljava/lang/Long;)V

    .line 194
    .line 195
    .line 196
    goto :goto_5

    .line 197
    :cond_b
    invoke-virtual {v12, v4, v4, v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    const-class v5, Ljava/lang/Long;

    .line 206
    .line 207
    move-wide/from16 v6, p5

    .line 208
    .line 209
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_c
    const-class v1, Ljava/lang/Boolean;

    .line 214
    .line 215
    if-ne v4, v1, :cond_e

    .line 216
    .line 217
    iget-wide v5, v12, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 218
    .line 219
    and-long v5, v5, p2

    .line 220
    .line 221
    cmp-long v1, v5, v18

    .line 222
    .line 223
    if-nez v1, :cond_d

    .line 224
    .line 225
    check-cast v3, Ljava/lang/Boolean;

    .line 226
    .line 227
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 232
    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_d
    invoke-virtual {v12, v4, v4, v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    const-class v5, Ljava/lang/Boolean;

    .line 244
    .line 245
    move-wide/from16 v6, p5

    .line 246
    .line 247
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_e
    const-class v1, Ljava/math/BigDecimal;

    .line 252
    .line 253
    if-ne v4, v1, :cond_10

    .line 254
    .line 255
    iget-wide v5, v12, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 256
    .line 257
    const-wide/16 v20, 0x8

    .line 258
    .line 259
    and-long v5, v5, v20

    .line 260
    .line 261
    cmp-long v1, v5, v18

    .line 262
    .line 263
    if-nez v1, :cond_f

    .line 264
    .line 265
    check-cast v3, Ljava/math/BigDecimal;

    .line 266
    .line 267
    move-wide/from16 v6, p5

    .line 268
    .line 269
    invoke-virtual {v2, v3, v6, v7, v9}, Lcom/alibaba/fastjson2/JSONWriter;->writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 270
    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_f
    move-wide/from16 v6, p5

    .line 274
    .line 275
    invoke-virtual {v12, v4, v4, v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    const-class v5, Ljava/math/BigDecimal;

    .line 284
    .line 285
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 286
    .line 287
    .line 288
    :goto_5
    move-object v1, v14

    .line 289
    goto/16 :goto_c

    .line 290
    .line 291
    :cond_10
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClass:Ljava/lang/Class;

    .line 292
    .line 293
    if-ne v4, v1, :cond_12

    .line 294
    .line 295
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 296
    .line 297
    if-eqz v1, :cond_12

    .line 298
    .line 299
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 300
    .line 301
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassRefDetect:Z

    .line 302
    .line 303
    if-eqz v4, :cond_11

    .line 304
    .line 305
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    if-eqz v4, :cond_11

    .line 310
    .line 311
    const/4 v4, 0x1

    .line 312
    goto :goto_6

    .line 313
    :cond_11
    move v4, v10

    .line 314
    :goto_6
    move/from16 v18, v17

    .line 315
    .line 316
    move/from16 v17, v4

    .line 317
    .line 318
    goto :goto_a

    .line 319
    :cond_12
    if-ne v4, v14, :cond_13

    .line 320
    .line 321
    move-object/from16 v1, v16

    .line 322
    .line 323
    :goto_7
    move/from16 v18, v17

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_13
    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 327
    .line 328
    if-ne v4, v1, :cond_14

    .line 329
    .line 330
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 331
    .line 332
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    :goto_8
    move/from16 v17, v5

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_14
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    if-ne v4, v1, :cond_15

    .line 344
    .line 345
    invoke-static {}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->getINSTANCE1()Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    goto :goto_8

    .line 354
    :cond_15
    const-class v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 355
    .line 356
    if-ne v4, v1, :cond_16

    .line 357
    .line 358
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE_JSON_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 359
    .line 360
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    goto :goto_8

    .line 365
    :cond_16
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONArray1x()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    if-ne v4, v1, :cond_17

    .line 370
    .line 371
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE_JSON_ARRAY_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 372
    .line 373
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 374
    .line 375
    .line 376
    move-result v5

    .line 377
    goto :goto_8

    .line 378
    :cond_17
    invoke-virtual {v11, v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v5

    .line 386
    goto :goto_8

    .line 387
    :goto_9
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClass:Ljava/lang/Class;

    .line 388
    .line 389
    if-ne v4, v5, :cond_18

    .line 390
    .line 391
    iput-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 392
    .line 393
    :cond_18
    move-object/from16 v16, v1

    .line 394
    .line 395
    move-object v14, v4

    .line 396
    goto :goto_7

    .line 397
    :goto_a
    if-eqz v17, :cond_19

    .line 398
    .line 399
    invoke-virtual {v2, v15, v3}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v4

    .line 403
    if-eqz v4, :cond_19

    .line 404
    .line 405
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    goto :goto_b

    .line 412
    :cond_19
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemType:Ljava/lang/reflect/Type;

    .line 417
    .line 418
    iget-wide v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->features:J

    .line 419
    .line 420
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 421
    .line 422
    .line 423
    if-eqz v17, :cond_1a

    .line 424
    .line 425
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_1a
    :goto_b
    move/from16 v17, v18

    .line 429
    .line 430
    goto/16 :goto_5

    .line 431
    .line 432
    :goto_c
    add-int/lit8 v15, v15, 0x1

    .line 433
    .line 434
    goto/16 :goto_3

    .line 435
    .line 436
    :cond_1b
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->endArray()V

    .line 437
    .line 438
    .line 439
    return-void
.end method

.method public writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 9

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toList(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x0

    .line 19
    const/4 p4, 0x0

    .line 20
    move v0, p4

    .line 21
    move-object p4, p3

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-ge v0, v1, :cond_3

    .line 27
    .line 28
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    if-nez v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 35
    .line 36
    .line 37
    move-object v3, p1

    .line 38
    goto :goto_3

    .line 39
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-ne v1, p3, :cond_2

    .line 44
    .line 45
    :goto_1
    move-object v2, p4

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    move-object p3, v1

    .line 52
    goto :goto_1

    .line 53
    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget-object v6, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemType:Ljava/lang/reflect/Type;

    .line 58
    .line 59
    iget-wide v7, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->features:J

    .line 60
    .line 61
    or-long/2addr v7, p5

    .line 62
    move-object v3, p1

    .line 63
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 64
    .line 65
    .line 66
    move-object p4, v2

    .line 67
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    move-object p1, v3

    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    instance-of v4, v3, Ljava/lang/Class;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v5, 0x0

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    check-cast v3, Ljava/lang/Class;

    .line 23
    .line 24
    :goto_0
    move-object v4, v5

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    iget-object v4, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->defineType:Ljava/lang/reflect/Type;

    .line 27
    .line 28
    if-ne v3, v4, :cond_2

    .line 29
    .line 30
    iget-object v3, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClass:Ljava/lang/Class;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    instance-of v4, v3, Ljava/lang/reflect/ParameterizedType;

    .line 34
    .line 35
    if-eqz v4, :cond_5

    .line 36
    .line 37
    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    .line 38
    .line 39
    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    array-length v6, v4

    .line 44
    if-ne v6, v9, :cond_3

    .line 45
    .line 46
    aget-object v4, v4, v8

    .line 47
    .line 48
    instance-of v6, v4, Ljava/lang/Class;

    .line 49
    .line 50
    if-eqz v6, :cond_3

    .line 51
    .line 52
    check-cast v4, Ljava/lang/Class;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    move-object v4, v5

    .line 56
    :goto_1
    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    instance-of v6, v3, Ljava/lang/Class;

    .line 61
    .line 62
    if-eqz v6, :cond_4

    .line 63
    .line 64
    check-cast v3, Ljava/lang/Class;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    move-object v3, v5

    .line 68
    goto :goto_2

    .line 69
    :cond_5
    move-object v3, v5

    .line 70
    move-object v4, v3

    .line 71
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    move-wide/from16 v10, p5

    .line 76
    .line 77
    invoke-virtual {v2, v1, v3, v10, v11}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/Class;J)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_8

    .line 82
    .line 83
    sget-object v3, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->CLASS_SUBLIST:Ljava/lang/Class;

    .line 84
    .line 85
    if-eq v6, v3, :cond_7

    .line 86
    .line 87
    const-class v3, Ljava/util/ArrayList;

    .line 88
    .line 89
    if-ne v6, v3, :cond_6

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_6
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_7
    :goto_3
    sget-object v3, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->TYPE_NAME_JSONB_ARRAY_LIST:[B

    .line 101
    .line 102
    sget-wide v6, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->TYPE_NAME_HASH_ARRAY_LIST:J

    .line 103
    .line 104
    invoke-virtual {v2, v3, v6, v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName([BJ)Z

    .line 105
    .line 106
    .line 107
    :cond_8
    :goto_4
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toList(Ljava/lang/Object;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 112
    .line 113
    .line 114
    move-result v13

    .line 115
    if-nez v13, :cond_9

    .line 116
    .line 117
    const/16 v1, -0x6c

    .line 118
    .line 119
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(B)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_9
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->isBeanToArray()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_d

    .line 128
    .line 129
    invoke-virtual {v2, v13}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 130
    .line 131
    .line 132
    move-object v1, v5

    .line 133
    :goto_5
    if-ge v8, v13, :cond_c

    .line 134
    .line 135
    invoke-interface {v12, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    if-nez v3, :cond_a

    .line 140
    .line 141
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 142
    .line 143
    .line 144
    move-object v9, v5

    .line 145
    move-object v5, v4

    .line 146
    goto :goto_8

    .line 147
    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    if-ne v6, v5, :cond_b

    .line 152
    .line 153
    move-object v9, v5

    .line 154
    :goto_6
    move-object v5, v4

    .line 155
    goto :goto_7

    .line 156
    :cond_b
    invoke-virtual {v2, v6}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    move-object v9, v6

    .line 161
    goto :goto_6

    .line 162
    :goto_7
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    move-wide v6, v10

    .line 167
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 168
    .line 169
    .line 170
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 171
    .line 172
    move-wide/from16 v10, p5

    .line 173
    .line 174
    move-object v4, v5

    .line 175
    move-object v5, v9

    .line 176
    goto :goto_5

    .line 177
    :cond_c
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->endArray()V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_d
    iget-object v10, v2, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 182
    .line 183
    invoke-virtual {v2, v13}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 184
    .line 185
    .line 186
    move-object v1, v5

    .line 187
    move v11, v8

    .line 188
    :goto_9
    if-ge v11, v13, :cond_1b

    .line 189
    .line 190
    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    if-nez v3, :cond_e

    .line 195
    .line 196
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_f

    .line 200
    .line 201
    :cond_e
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    const-class v6, Ljava/lang/String;

    .line 206
    .line 207
    if-ne v4, v6, :cond_f

    .line 208
    .line 209
    check-cast v3, Ljava/lang/String;

    .line 210
    .line 211
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_f

    .line 215
    .line 216
    :cond_f
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClass:Ljava/lang/Class;

    .line 217
    .line 218
    if-ne v4, v6, :cond_11

    .line 219
    .line 220
    iget-boolean v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassRefDetect:Z

    .line 221
    .line 222
    if-eqz v6, :cond_10

    .line 223
    .line 224
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    if-eqz v6, :cond_10

    .line 229
    .line 230
    move v14, v9

    .line 231
    goto :goto_a

    .line 232
    :cond_10
    move v14, v8

    .line 233
    goto :goto_a

    .line 234
    :cond_11
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    move v14, v6

    .line 239
    :goto_a
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClass:Ljava/lang/Class;

    .line 240
    .line 241
    if-ne v4, v6, :cond_12

    .line 242
    .line 243
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 244
    .line 245
    if-eqz v6, :cond_12

    .line 246
    .line 247
    iget-object v4, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 248
    .line 249
    move-object v15, v1

    .line 250
    move-object v1, v4

    .line 251
    :goto_b
    move-object/from16 v16, v5

    .line 252
    .line 253
    goto :goto_d

    .line 254
    :cond_12
    if-ne v4, v5, :cond_13

    .line 255
    .line 256
    move-object v15, v1

    .line 257
    goto :goto_b

    .line 258
    :cond_13
    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 259
    .line 260
    if-ne v4, v1, :cond_14

    .line 261
    .line 262
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 263
    .line 264
    goto :goto_c

    .line 265
    :cond_14
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    if-ne v4, v1, :cond_15

    .line 270
    .line 271
    invoke-static {}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->getINSTANCE1()Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    goto :goto_c

    .line 276
    :cond_15
    const-class v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 277
    .line 278
    if-ne v4, v1, :cond_16

    .line 279
    .line 280
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE_JSON_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 281
    .line 282
    goto :goto_c

    .line 283
    :cond_16
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONArray1x()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    if-ne v4, v1, :cond_17

    .line 288
    .line 289
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE_JSON_ARRAY_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 290
    .line 291
    goto :goto_c

    .line 292
    :cond_17
    invoke-virtual {v10, v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    :goto_c
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClass:Ljava/lang/Class;

    .line 297
    .line 298
    if-ne v4, v5, :cond_18

    .line 299
    .line 300
    iput-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemClassWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 301
    .line 302
    :cond_18
    move-object v15, v1

    .line 303
    move-object/from16 v16, v4

    .line 304
    .line 305
    :goto_d
    if-eqz v14, :cond_19

    .line 306
    .line 307
    invoke-virtual {v2, v11, v3}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    if-eqz v4, :cond_19

    .line 312
    .line 313
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    goto :goto_e

    .line 320
    :cond_19
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object v4

    .line 324
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->itemType:Ljava/lang/reflect/Type;

    .line 325
    .line 326
    iget-wide v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->features:J

    .line 327
    .line 328
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 329
    .line 330
    .line 331
    if-eqz v14, :cond_1a

    .line 332
    .line 333
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    :cond_1a
    :goto_e
    move-object v1, v15

    .line 337
    move-object/from16 v5, v16

    .line 338
    .line 339
    :goto_f
    add-int/lit8 v11, v11, 0x1

    .line 340
    .line 341
    goto/16 :goto_9

    .line 342
    .line 343
    :cond_1b
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->endArray()V

    .line 344
    .line 345
    .line 346
    return-void
.end method
