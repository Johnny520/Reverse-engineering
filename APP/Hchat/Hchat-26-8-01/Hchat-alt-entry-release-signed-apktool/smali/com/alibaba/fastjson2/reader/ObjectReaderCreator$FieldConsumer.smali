.class final Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "FieldConsumer"
.end annotation


# instance fields
.field final beanInfo:Lcom/alibaba/fastjson2/codec/BeanInfo;

.field final fieldBased:Z

.field final fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

.field final fieldReaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ">;"
        }
    .end annotation
.end field

.field final namingStrategy:Ljava/lang/String;

.field final objectClass:Ljava/lang/Class;

.field final objectType:Ljava/lang/reflect/Type;

.field final provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

.field final synthetic this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/util/Map;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/codec/FieldInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ">;",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Z)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->objectClass:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->objectType:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->namingStrategy:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldReaders:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->beanInfo:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 19
    .line 20
    iput-boolean p9, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldBased:Z

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    check-cast v13, Ljava/lang/reflect/Field;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 10
    .line 11
    .line 12
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldBased:Z

    .line 13
    .line 14
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 15
    .line 16
    const/16 v17, 0x0

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-wide v3, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 21
    .line 22
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 23
    .line 24
    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 25
    .line 26
    or-long/2addr v3, v5

    .line 27
    iput-wide v3, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v3, 0x1

    .line 35
    and-int/2addr v1, v3

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move/from16 v3, v17

    .line 40
    .line 41
    :goto_0
    iput-boolean v3, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 42
    .line 43
    :goto_1
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 44
    .line 45
    iget-wide v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 46
    .line 47
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->beanInfo:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 48
    .line 49
    iget-wide v5, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 50
    .line 51
    or-long/2addr v2, v5

    .line 52
    iput-wide v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 53
    .line 54
    iget-object v2, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 55
    .line 56
    iput-object v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 59
    .line 60
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->objectClass:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-virtual {v2, v1, v3, v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 66
    .line 67
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 68
    .line 69
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget-wide v1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 72
    .line 73
    const-wide/high16 v3, 0x2000000000000L

    .line 74
    .line 75
    and-long/2addr v1, v3

    .line 76
    const-wide/16 v3, 0x0

    .line 77
    .line 78
    cmp-long v1, v1, v3

    .line 79
    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    const-class v1, Ljava/util/Map;

    .line 83
    .line 84
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_2

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_2
    return-void

    .line 96
    :cond_3
    :goto_2
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 97
    .line 98
    iget-object v1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_4
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 110
    .line 111
    iget-object v1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 112
    .line 113
    :cond_5
    :goto_3
    move-object v4, v1

    .line 114
    goto :goto_5

    .line 115
    :cond_6
    :goto_4
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->namingStrategy:Ljava/lang/String;

    .line 120
    .line 121
    if-eqz v2, :cond_5

    .line 122
    .line 123
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->fieldName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    goto :goto_3

    .line 128
    :goto_5
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->beanInfo:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 129
    .line 130
    iget-object v1, v1, Lcom/alibaba/fastjson2/codec/BeanInfo;->orders:[Ljava/lang/String;

    .line 131
    .line 132
    if-eqz v1, :cond_9

    .line 133
    .line 134
    array-length v2, v1

    .line 135
    if-lez v2, :cond_9

    .line 136
    .line 137
    move/from16 v2, v17

    .line 138
    .line 139
    :goto_6
    array-length v3, v1

    .line 140
    if-ge v2, v3, :cond_8

    .line 141
    .line 142
    aget-object v3, v1, v2

    .line 143
    .line 144
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-eqz v3, :cond_7

    .line 149
    .line 150
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 151
    .line 152
    iput v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 153
    .line 154
    goto :goto_7

    .line 155
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_8
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 159
    .line 160
    iget v3, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 161
    .line 162
    if-nez v3, :cond_9

    .line 163
    .line 164
    array-length v1, v1

    .line 165
    iput v1, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 166
    .line 167
    :cond_9
    :goto_7
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-virtual {v13}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 176
    .line 177
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 178
    .line 179
    invoke-static {v1, v11, v12, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->getInitReader(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/reflect/Type;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/FieldInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 184
    .line 185
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->objectClass:Ljava/lang/Class;

    .line 186
    .line 187
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->objectType:Ljava/lang/reflect/Type;

    .line 188
    .line 189
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 190
    .line 191
    iget v6, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 192
    .line 193
    move v8, v6

    .line 194
    iget-wide v6, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 195
    .line 196
    move v9, v8

    .line 197
    iget-object v8, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 198
    .line 199
    move v10, v9

    .line 200
    iget-object v9, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 201
    .line 202
    move v15, v10

    .line 203
    iget-object v10, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 204
    .line 205
    move/from16 v16, v15

    .line 206
    .line 207
    iget-object v15, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->arrayToMapKey:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/codec/FieldInfo;->getInitArrayToMapDuplicateHandler()Ljava/util/function/BiConsumer;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    move/from16 v20, v16

    .line 214
    .line 215
    move-object/from16 v16, v5

    .line 216
    .line 217
    move/from16 v5, v20

    .line 218
    .line 219
    invoke-virtual/range {v1 .. v16}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    move-object v15, v4

    .line 224
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldReaders:Ljava/util/Map;

    .line 225
    .line 226
    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 231
    .line 232
    if-nez v2, :cond_a

    .line 233
    .line 234
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldReaders:Ljava/util/Map;

    .line 235
    .line 236
    invoke-interface {v2, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_a
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/reader/FieldReader;->compareTo(Lcom/alibaba/fastjson2/reader/FieldReader;)I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-lez v2, :cond_b

    .line 245
    .line 246
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldReaders:Ljava/util/Map;

    .line 247
    .line 248
    invoke-interface {v2, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    :cond_b
    :goto_8
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 252
    .line 253
    iget-object v1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 254
    .line 255
    if-eqz v1, :cond_e

    .line 256
    .line 257
    array-length v2, v1

    .line 258
    move/from16 v3, v17

    .line 259
    .line 260
    :goto_9
    if-ge v3, v2, :cond_e

    .line 261
    .line 262
    aget-object v4, v1, v3

    .line 263
    .line 264
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_c

    .line 269
    .line 270
    move-object/from16 v16, v1

    .line 271
    .line 272
    move/from16 v17, v2

    .line 273
    .line 274
    move/from16 v18, v3

    .line 275
    .line 276
    goto :goto_a

    .line 277
    :cond_c
    move-object v5, v1

    .line 278
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 279
    .line 280
    move v6, v2

    .line 281
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->objectClass:Ljava/lang/Class;

    .line 282
    .line 283
    move/from16 v17, v3

    .line 284
    .line 285
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->objectType:Ljava/lang/reflect/Type;

    .line 286
    .line 287
    iget-object v7, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 288
    .line 289
    move-object v8, v5

    .line 290
    iget v5, v7, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 291
    .line 292
    iget-wide v9, v7, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 293
    .line 294
    move-wide/from16 v18, v9

    .line 295
    .line 296
    iget-object v9, v7, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 297
    .line 298
    iget-object v10, v7, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 299
    .line 300
    const/4 v14, 0x0

    .line 301
    move-object v7, v8

    .line 302
    const/4 v8, 0x0

    .line 303
    move-object/from16 v16, v7

    .line 304
    .line 305
    move/from16 v20, v17

    .line 306
    .line 307
    move/from16 v17, v6

    .line 308
    .line 309
    move-wide/from16 v6, v18

    .line 310
    .line 311
    move/from16 v18, v20

    .line 312
    .line 313
    invoke-virtual/range {v1 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldReaders:Ljava/util/Map;

    .line 318
    .line 319
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    check-cast v2, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 324
    .line 325
    if-nez v2, :cond_d

    .line 326
    .line 327
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;->fieldReaders:Ljava/util/Map;

    .line 328
    .line 329
    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    :cond_d
    :goto_a
    add-int/lit8 v3, v18, 0x1

    .line 333
    .line 334
    move-object/from16 v1, v16

    .line 335
    .line 336
    move/from16 v2, v17

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_e
    return-void
.end method
