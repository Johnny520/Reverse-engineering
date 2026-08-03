.class final Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;
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
    name = "CreateFieldReaderConsumer"
.end annotation


# instance fields
.field final beanInfo:Lcom/alibaba/fastjson2/codec/BeanInfo;

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

.field final orders:[Ljava/lang/String;

.field final provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

.field final synthetic this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;[Ljava/lang/String;Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/util/Map;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Lcom/alibaba/fastjson2/codec/FieldInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ">;",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectType:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->namingStrategy:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->orders:[Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->beanInfo:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 19
    .line 20
    iput-object p9, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

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
    check-cast v13, Ljava/lang/reflect/Method;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 13
    .line 14
    iget-wide v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 15
    .line 16
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->beanInfo:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 17
    .line 18
    iget-wide v5, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 19
    .line 20
    or-long/2addr v2, v5

    .line 21
    iput-wide v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 22
    .line 23
    iget-object v2, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 24
    .line 25
    iput-object v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 28
    .line 29
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 30
    .line 31
    invoke-virtual {v2, v1, v3, v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 35
    .line 36
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    goto/16 :goto_c

    .line 41
    .line 42
    :cond_0
    iget-object v1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 43
    .line 44
    const/4 v2, 0x2

    .line 45
    const/4 v3, 0x1

    .line 46
    const/4 v4, 0x0

    .line 47
    if-nez v1, :cond_a

    .line 48
    .line 49
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v5, "set"

    .line 54
    .line 55
    invoke-virtual {v1, v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->namingStrategy:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->setterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 68
    .line 69
    iget-object v6, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 70
    .line 71
    if-nez v6, :cond_3

    .line 72
    .line 73
    const/4 v6, 0x3

    .line 74
    invoke-virtual {v1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-static {v6, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    if-nez v6, :cond_1

    .line 85
    .line 86
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    aget-object v7, v7, v4

    .line 91
    .line 92
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    if-ne v7, v8, :cond_1

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    if-nez v7, :cond_1

    .line 101
    .line 102
    new-instance v6, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v7, "is"

    .line 105
    .line 106
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    invoke-static {v7}, Ljava/lang/Character;->toUpperCase(C)C

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 132
    .line 133
    invoke-static {v6, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    :cond_1
    if-eqz v6, :cond_3

    .line 138
    .line 139
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 140
    .line 141
    filled-new-array {v1}, [Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iput-object v1, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_2
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->beanInfo:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 149
    .line 150
    iget-boolean v1, v1, Lcom/alibaba/fastjson2/codec/BeanInfo;->kotlin:Z

    .line 151
    .line 152
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->namingStrategy:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v13, v1, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/reflect/Method;ZLjava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    :cond_3
    :goto_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-lez v1, :cond_4

    .line 163
    .line 164
    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    goto :goto_1

    .line 169
    :cond_4
    move v6, v4

    .line 170
    :goto_1
    if-ne v1, v3, :cond_5

    .line 171
    .line 172
    const/16 v7, 0x61

    .line 173
    .line 174
    if-lt v6, v7, :cond_5

    .line 175
    .line 176
    const/16 v7, 0x7a

    .line 177
    .line 178
    if-le v6, v7, :cond_6

    .line 179
    .line 180
    :cond_5
    if-le v1, v2, :cond_9

    .line 181
    .line 182
    const/16 v7, 0x41

    .line 183
    .line 184
    if-lt v6, v7, :cond_9

    .line 185
    .line 186
    const/16 v8, 0x5a

    .line 187
    .line 188
    if-gt v6, v8, :cond_9

    .line 189
    .line 190
    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    if-lt v6, v7, :cond_9

    .line 195
    .line 196
    if-gt v6, v8, :cond_9

    .line 197
    .line 198
    :cond_6
    invoke-virtual {v5}, Ljava/lang/String;->toCharArray()[C

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    if-ne v1, v3, :cond_7

    .line 203
    .line 204
    aget-char v7, v6, v4

    .line 205
    .line 206
    add-int/lit8 v7, v7, -0x20

    .line 207
    .line 208
    int-to-char v7, v7

    .line 209
    aput-char v7, v6, v4

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_7
    aget-char v7, v6, v4

    .line 213
    .line 214
    add-int/lit8 v7, v7, 0x20

    .line 215
    .line 216
    int-to-char v7, v7

    .line 217
    aput-char v7, v6, v4

    .line 218
    .line 219
    :goto_2
    new-instance v7, Ljava/lang/String;

    .line 220
    .line 221
    invoke-direct {v7, v6}, Ljava/lang/String;-><init>([C)V

    .line 222
    .line 223
    .line 224
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 225
    .line 226
    invoke-static {v6, v7}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 227
    .line 228
    .line 229
    move-result-object v6

    .line 230
    if-eqz v6, :cond_9

    .line 231
    .line 232
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 233
    .line 234
    .line 235
    move-result v7

    .line 236
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-eqz v7, :cond_8

    .line 241
    .line 242
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    goto :goto_3

    .line 247
    :cond_8
    if-ne v1, v3, :cond_9

    .line 248
    .line 249
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 250
    .line 251
    filled-new-array {v5}, [Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    iput-object v5, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    goto :goto_3

    .line 262
    :cond_9
    move-object v1, v5

    .line 263
    :cond_a
    :goto_3
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->orders:[Ljava/lang/String;

    .line 264
    .line 265
    if-eqz v5, :cond_d

    .line 266
    .line 267
    array-length v5, v5

    .line 268
    if-lez v5, :cond_d

    .line 269
    .line 270
    move v5, v4

    .line 271
    :goto_4
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->orders:[Ljava/lang/String;

    .line 272
    .line 273
    array-length v7, v6

    .line 274
    if-ge v5, v7, :cond_c

    .line 275
    .line 276
    aget-object v6, v6, v5

    .line 277
    .line 278
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result v6

    .line 282
    if-eqz v6, :cond_b

    .line 283
    .line 284
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 285
    .line 286
    iput v5, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_c
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 293
    .line 294
    iget v7, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 295
    .line 296
    if-nez v7, :cond_d

    .line 297
    .line 298
    array-length v6, v6

    .line 299
    iput v6, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 300
    .line 301
    :cond_d
    :goto_5
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    array-length v6, v5

    .line 306
    if-nez v6, :cond_f

    .line 307
    .line 308
    move-object v4, v1

    .line 309
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 310
    .line 311
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 312
    .line 313
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectType:Ljava/lang/reflect/Type;

    .line 314
    .line 315
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 316
    .line 317
    iget v6, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 318
    .line 319
    iget-wide v7, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 320
    .line 321
    const-wide/high16 v9, 0x100000000000000L

    .line 322
    .line 323
    or-long/2addr v7, v9

    .line 324
    move v9, v6

    .line 325
    move-wide v6, v7

    .line 326
    iget-object v8, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 327
    .line 328
    move v10, v9

    .line 329
    iget-object v9, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 330
    .line 331
    iget-object v5, v5, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 332
    .line 333
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 334
    .line 335
    .line 336
    move-result-object v11

    .line 337
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    move-result-object v12

    .line 341
    iget-object v14, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 342
    .line 343
    invoke-virtual {v14}, Lcom/alibaba/fastjson2/codec/FieldInfo;->getInitReader()Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    iget-object v15, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 348
    .line 349
    move-object/from16 v16, v1

    .line 350
    .line 351
    move-object v1, v15

    .line 352
    iget-object v15, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->arrayToMapKey:Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;->getInitArrayToMapDuplicateHandler()Ljava/util/function/BiConsumer;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    move-object/from16 v19, v16

    .line 359
    .line 360
    move-object/from16 v16, v1

    .line 361
    .line 362
    move-object/from16 v1, v19

    .line 363
    .line 364
    move/from16 v19, v10

    .line 365
    .line 366
    move-object v10, v5

    .line 367
    move/from16 v5, v19

    .line 368
    .line 369
    invoke-virtual/range {v1 .. v16}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 374
    .line 375
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    check-cast v2, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 380
    .line 381
    if-nez v2, :cond_e

    .line 382
    .line 383
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 384
    .line 385
    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :cond_e
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/reader/FieldReader;->compareTo(Lcom/alibaba/fastjson2/reader/FieldReader;)I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    if-lez v2, :cond_19

    .line 394
    .line 395
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 396
    .line 397
    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    return-void

    .line 401
    :cond_f
    move/from16 v19, v4

    .line 402
    .line 403
    move-object v4, v1

    .line 404
    move/from16 v1, v19

    .line 405
    .line 406
    if-ne v6, v2, :cond_10

    .line 407
    .line 408
    aget-object v1, v5, v3

    .line 409
    .line 410
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    aget-object v2, v2, v3

    .line 415
    .line 416
    invoke-virtual {v13, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 417
    .line 418
    .line 419
    move-object v3, v1

    .line 420
    new-instance v1, Lcom/alibaba/fastjson2/reader/FieldReaderAnySetter;

    .line 421
    .line 422
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 423
    .line 424
    iget v5, v4, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 425
    .line 426
    move v7, v5

    .line 427
    iget-wide v5, v4, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 428
    .line 429
    iget-object v4, v4, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 430
    .line 431
    move v8, v7

    .line 432
    move-object v7, v4

    .line 433
    move v4, v8

    .line 434
    move-object v8, v13

    .line 435
    invoke-direct/range {v1 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderAnySetter;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/reflect/Method;)V

    .line 436
    .line 437
    .line 438
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 439
    .line 440
    iget-object v3, v1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 441
    .line 442
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    return-void

    .line 446
    :cond_10
    aget-object v12, v5, v1

    .line 447
    .line 448
    invoke-virtual {v12}, Ljava/lang/Class;->isPrimitive()Z

    .line 449
    .line 450
    .line 451
    move-result v2

    .line 452
    if-nez v2, :cond_12

    .line 453
    .line 454
    const-class v2, Ljava/lang/String;

    .line 455
    .line 456
    if-eq v12, v2, :cond_12

    .line 457
    .line 458
    invoke-virtual {v12}, Ljava/lang/Class;->isEnum()Z

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    if-eqz v2, :cond_11

    .line 463
    .line 464
    goto :goto_6

    .line 465
    :cond_11
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    aget-object v2, v2, v1

    .line 470
    .line 471
    goto :goto_7

    .line 472
    :cond_12
    :goto_6
    move-object v2, v12

    .line 473
    :goto_7
    instance-of v5, v2, Ljava/lang/Class;

    .line 474
    .line 475
    if-eqz v5, :cond_14

    .line 476
    .line 477
    const-class v5, Ljava/util/Collection;

    .line 478
    .line 479
    move-object v6, v2

    .line 480
    check-cast v6, Ljava/lang/Class;

    .line 481
    .line 482
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 483
    .line 484
    .line 485
    move-result v5

    .line 486
    if-eqz v5, :cond_14

    .line 487
    .line 488
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 489
    .line 490
    invoke-virtual {v5}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    move v6, v1

    .line 495
    :goto_8
    array-length v7, v5

    .line 496
    if-ge v6, v7, :cond_14

    .line 497
    .line 498
    aget-object v7, v5, v6

    .line 499
    .line 500
    invoke-static {v7, v13}, Lcom/alibaba/fastjson2/util/BeanUtils;->getMethod(Ljava/lang/Class;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    .line 501
    .line 502
    .line 503
    move-result-object v7

    .line 504
    if-eqz v7, :cond_13

    .line 505
    .line 506
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 507
    .line 508
    .line 509
    move-result-object v7

    .line 510
    array-length v8, v7

    .line 511
    if-ne v8, v3, :cond_13

    .line 512
    .line 513
    aget-object v7, v7, v1

    .line 514
    .line 515
    instance-of v8, v7, Ljava/lang/reflect/ParameterizedType;

    .line 516
    .line 517
    if-eqz v8, :cond_13

    .line 518
    .line 519
    move-object v2, v7

    .line 520
    :cond_13
    add-int/lit8 v6, v6, 0x1

    .line 521
    .line 522
    goto :goto_8

    .line 523
    :cond_14
    move-object v11, v2

    .line 524
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 525
    .line 526
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 527
    .line 528
    invoke-static {v2, v11, v12, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->getInitReader(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/reflect/Type;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/FieldInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 529
    .line 530
    .line 531
    move-result-object v14

    .line 532
    move v2, v1

    .line 533
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 534
    .line 535
    move v3, v2

    .line 536
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 537
    .line 538
    move v5, v3

    .line 539
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectType:Ljava/lang/reflect/Type;

    .line 540
    .line 541
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 542
    .line 543
    move v7, v5

    .line 544
    iget v5, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 545
    .line 546
    iget-wide v8, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 547
    .line 548
    move-wide v9, v8

    .line 549
    iget-object v8, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 550
    .line 551
    move-wide v15, v9

    .line 552
    iget-object v9, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 553
    .line 554
    iget-object v10, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 555
    .line 556
    move-wide/from16 v16, v15

    .line 557
    .line 558
    iget-object v15, v6, Lcom/alibaba/fastjson2/codec/FieldInfo;->arrayToMapKey:Ljava/lang/String;

    .line 559
    .line 560
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/codec/FieldInfo;->getInitArrayToMapDuplicateHandler()Ljava/util/function/BiConsumer;

    .line 561
    .line 562
    .line 563
    move-result-object v6

    .line 564
    move-wide/from16 v19, v16

    .line 565
    .line 566
    move-object/from16 v16, v6

    .line 567
    .line 568
    move/from16 v17, v7

    .line 569
    .line 570
    move-wide/from16 v6, v19

    .line 571
    .line 572
    invoke-virtual/range {v1 .. v16}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    move-object v15, v4

    .line 577
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 578
    .line 579
    invoke-interface {v2, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    check-cast v2, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 584
    .line 585
    if-nez v2, :cond_15

    .line 586
    .line 587
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 588
    .line 589
    invoke-interface {v2, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    goto :goto_9

    .line 593
    :cond_15
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/reader/FieldReader;->compareTo(Lcom/alibaba/fastjson2/reader/FieldReader;)I

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    if-lez v2, :cond_16

    .line 598
    .line 599
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 600
    .line 601
    invoke-interface {v2, v15, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    :cond_16
    :goto_9
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 605
    .line 606
    iget-object v1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 607
    .line 608
    if-eqz v1, :cond_19

    .line 609
    .line 610
    array-length v2, v1

    .line 611
    move/from16 v3, v17

    .line 612
    .line 613
    :goto_a
    if-ge v3, v2, :cond_19

    .line 614
    .line 615
    aget-object v4, v1, v3

    .line 616
    .line 617
    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    if-eqz v5, :cond_18

    .line 622
    .line 623
    :cond_17
    move-object/from16 p1, v1

    .line 624
    .line 625
    move/from16 v16, v2

    .line 626
    .line 627
    move/from16 v17, v3

    .line 628
    .line 629
    goto :goto_b

    .line 630
    :cond_18
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 631
    .line 632
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v5

    .line 636
    check-cast v5, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 637
    .line 638
    if-nez v5, :cond_17

    .line 639
    .line 640
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldReaders:Ljava/util/Map;

    .line 641
    .line 642
    move-object v6, v1

    .line 643
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->this$0:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 644
    .line 645
    move v7, v2

    .line 646
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectClass:Ljava/lang/Class;

    .line 647
    .line 648
    move/from16 v17, v3

    .line 649
    .line 650
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->objectType:Ljava/lang/reflect/Type;

    .line 651
    .line 652
    iget-object v8, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;->fieldInfo:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 653
    .line 654
    move-object v9, v5

    .line 655
    iget v5, v8, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 656
    .line 657
    move-object v10, v6

    .line 658
    move/from16 v16, v7

    .line 659
    .line 660
    iget-wide v6, v8, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 661
    .line 662
    iget-object v0, v8, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 663
    .line 664
    move-object/from16 v18, v9

    .line 665
    .line 666
    iget-object v9, v8, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 667
    .line 668
    iget-object v8, v8, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 669
    .line 670
    move-object/from16 p1, v10

    .line 671
    .line 672
    move-object v10, v8

    .line 673
    move-object v8, v0

    .line 674
    move-object/from16 v0, v18

    .line 675
    .line 676
    invoke-virtual/range {v1 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    :goto_b
    add-int/lit8 v3, v17, 0x1

    .line 684
    .line 685
    move-object/from16 v0, p0

    .line 686
    .line 687
    move-object/from16 v1, p1

    .line 688
    .line 689
    move/from16 v2, v16

    .line 690
    .line 691
    goto :goto_a

    .line 692
    :cond_19
    :goto_c
    return-void
.end method
