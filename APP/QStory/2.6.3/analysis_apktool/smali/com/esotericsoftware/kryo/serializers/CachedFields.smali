.class Lcom/esotericsoftware/kryo/serializers/CachedFields;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;",
        ">;"
    }
.end annotation


# static fields
.field static final emptyCachedFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;


# instance fields
.field private access:Ljava/lang/Object;

.field copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

.field fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

.field private final removedFields:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/reflect/Field;",
            ">;"
        }
    .end annotation
.end field

.field private final serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 3
    .line 4
    sput-object v0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->emptyCachedFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/serializers/FieldSerializer;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 6
    .line 7
    iput-object v1, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 8
    .line 9
    new-array v0, v0, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->removedFields:Ljava/util/ArrayList;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 21
    .line 22
    return-void
.end method

.method private addField(Ljava/lang/reflect/Field;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Field;",
            "Z",
            "Ljava/util/ArrayList<",
            "Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-eqz v5, :cond_0

    .line 18
    .line 19
    goto/16 :goto_a

    .line 20
    .line 21
    :cond_0
    iget-object v5, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 22
    .line 23
    iget-object v5, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->config:Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    iget-boolean v6, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->ignoreSyntheticFields:Z

    .line 32
    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    goto/16 :goto_a

    .line 36
    .line 37
    :cond_1
    invoke-virtual {v2}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const/4 v7, 0x1

    .line 42
    const-string v8, "kryo"

    .line 43
    .line 44
    if-nez v6, :cond_3

    .line 45
    .line 46
    iget-boolean v6, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->setFieldsAsAccessible:Z

    .line 47
    .line 48
    if-nez v6, :cond_2

    .line 49
    .line 50
    goto/16 :goto_a

    .line 51
    .line 52
    :cond_2
    :try_start_0
    invoke-virtual {v2, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/security/AccessControlException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_0
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 57
    .line 58
    if-eqz v0, :cond_15

    .line 59
    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v1, "Unable to set field as accessible: "

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v8, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_3
    :goto_0
    const-class v6, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Optional;

    .line 80
    .line 81
    invoke-virtual {v2, v6}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Optional;

    .line 86
    .line 87
    if-eqz v6, :cond_4

    .line 88
    .line 89
    iget-object v9, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 90
    .line 91
    iget-object v9, v9, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 92
    .line 93
    invoke-virtual {v9}, Lcom/esotericsoftware/kryo/Kryo;->getContext()Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-interface {v6}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Optional;->value()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v9, v6}, Lcom/esotericsoftware/kryo/util/ObjectMap;->containsKey(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    if-nez v6, :cond_4

    .line 106
    .line 107
    goto/16 :goto_a

    .line 108
    .line 109
    :cond_4
    iget-object v6, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->removedFields:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_5

    .line 116
    .line 117
    goto/16 :goto_a

    .line 118
    .line 119
    :cond_5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    if-eqz v6, :cond_6

    .line 124
    .line 125
    iget-boolean v9, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->serializeTransient:Z

    .line 126
    .line 127
    if-nez v9, :cond_6

    .line 128
    .line 129
    iget-boolean v9, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->copyTransient:Z

    .line 130
    .line 131
    if-nez v9, :cond_6

    .line 132
    .line 133
    goto/16 :goto_a

    .line 134
    .line 135
    :cond_6
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    new-instance v10, Lcom/esotericsoftware/kryo/util/Generics$GenericType;

    .line 140
    .line 141
    iget-object v11, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 142
    .line 143
    iget-object v11, v11, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-direct {v10, v9, v11, v12}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->getType()Ljava/lang/reflect/Type;

    .line 153
    .line 154
    .line 155
    move-result-object v11

    .line 156
    instance-of v11, v11, Ljava/lang/Class;

    .line 157
    .line 158
    if-eqz v11, :cond_7

    .line 159
    .line 160
    invoke-virtual {v10}, Lcom/esotericsoftware/kryo/util/Generics$GenericType;->getType()Ljava/lang/reflect/Type;

    .line 161
    .line 162
    .line 163
    move-result-object v11

    .line 164
    check-cast v11, Ljava/lang/Class;

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_7
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    :goto_1
    const/4 v12, -0x1

    .line 172
    if-eqz p2, :cond_9

    .line 173
    .line 174
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    if-nez v13, :cond_9

    .line 179
    .line 180
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    invoke-virtual {v11}, Ljava/lang/Class;->getModifiers()I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_9

    .line 195
    .line 196
    :try_start_1
    iget-object v0, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->access:Ljava/lang/Object;

    .line 197
    .line 198
    if-nez v0, :cond_8

    .line 199
    .line 200
    iget-object v0, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 201
    .line 202
    iget-object v0, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 203
    .line 204
    invoke-static {v0}, Lcom/esotericsoftware/reflectasm/FieldAccess;->get(Ljava/lang/Class;)Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iput-object v0, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->access:Ljava/lang/Object;

    .line 209
    .line 210
    goto :goto_2

    .line 211
    :catch_1
    move-exception v0

    .line 212
    goto :goto_3

    .line 213
    :catch_2
    move-exception v0

    .line 214
    goto :goto_3

    .line 215
    :cond_8
    :goto_2
    iget-object v0, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->access:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v0, Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 218
    .line 219
    invoke-virtual {v0, v2}, Lcom/esotericsoftware/reflectasm/FieldAccess;->getIndex(Ljava/lang/reflect/Field;)I

    .line 220
    .line 221
    .line 222
    move-result v0
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/LinkageError; {:try_start_1 .. :try_end_1} :catch_1

    .line 223
    goto :goto_4

    .line 224
    :goto_3
    sget-boolean v13, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 225
    .line 226
    if-eqz v13, :cond_9

    .line 227
    .line 228
    const-string v13, "Unable to use ReflectASM."

    .line 229
    .line 230
    invoke-static {v8, v13, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 231
    .line 232
    .line 233
    :cond_9
    move v0, v12

    .line 234
    :goto_4
    sget-boolean v13, Lcom/esotericsoftware/kryo/util/Util;->unsafe:Z

    .line 235
    .line 236
    if-eqz v13, :cond_a

    .line 237
    .line 238
    invoke-direct {v1, v2, v11, v10}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->newUnsafeField(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    goto :goto_5

    .line 243
    :cond_a
    if-eq v0, v12, :cond_b

    .line 244
    .line 245
    invoke-direct {v1, v2, v11, v10}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->newAsmField(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    iget-object v12, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->access:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v12, Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 252
    .line 253
    iput-object v12, v10, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->access:Lcom/esotericsoftware/reflectasm/FieldAccess;

    .line 254
    .line 255
    iput v0, v10, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->accessIndex:I

    .line 256
    .line 257
    move-object v0, v10

    .line 258
    goto :goto_5

    .line 259
    :cond_b
    invoke-direct {v1, v2, v11, v10}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->newReflectField(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    :goto_5
    iget-boolean v10, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->varEncoding:Z

    .line 264
    .line 265
    iput-boolean v10, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->varEncoding:Z

    .line 266
    .line 267
    iget-boolean v10, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->extendedFieldNames:Z

    .line 268
    .line 269
    if-eqz v10, :cond_c

    .line 270
    .line 271
    new-instance v10, Ljava/lang/StringBuilder;

    .line 272
    .line 273
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v12

    .line 280
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v12, "."

    .line 284
    .line 285
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v12

    .line 292
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v10

    .line 299
    iput-object v10, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    .line 300
    .line 301
    goto :goto_6

    .line 302
    :cond_c
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    iput-object v10, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    .line 307
    .line 308
    :goto_6
    instance-of v10, v0, Lcom/esotericsoftware/kryo/serializers/ReflectField;

    .line 309
    .line 310
    const-string v12, ")"

    .line 311
    .line 312
    const-string v13, " ("

    .line 313
    .line 314
    const-string v14, " field: "

    .line 315
    .line 316
    const-string v15, "Cached "

    .line 317
    .line 318
    const/16 v16, 0x0

    .line 319
    .line 320
    if-eqz v10, :cond_10

    .line 321
    .line 322
    iget-boolean v10, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->fieldsCanBeNull:Z

    .line 323
    .line 324
    if-eqz v10, :cond_d

    .line 325
    .line 326
    const-class v10, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$NotNull;

    .line 327
    .line 328
    invoke-virtual {v2, v10}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    if-nez v10, :cond_d

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_d
    move/from16 v7, v16

    .line 336
    .line 337
    :goto_7
    iput-boolean v7, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->canBeNull:Z

    .line 338
    .line 339
    iget-object v7, v1, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 340
    .line 341
    iget-object v7, v7, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 342
    .line 343
    invoke-virtual {v7, v11}, Lcom/esotericsoftware/kryo/Kryo;->isFinal(Ljava/lang/Class;)Z

    .line 344
    .line 345
    .line 346
    move-result v7

    .line 347
    if-nez v7, :cond_e

    .line 348
    .line 349
    iget-boolean v7, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->fixedFieldTypes:Z

    .line 350
    .line 351
    if-eqz v7, :cond_f

    .line 352
    .line 353
    :cond_e
    iput-object v11, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->valueClass:Ljava/lang/Class;

    .line 354
    .line 355
    :cond_f
    sget-boolean v7, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 356
    .line 357
    if-eqz v7, :cond_12

    .line 358
    .line 359
    new-instance v7, Ljava/lang/StringBuilder;

    .line 360
    .line 361
    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v11}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-static {v9}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    invoke-static {v8, v2}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    goto :goto_9

    .line 402
    :cond_10
    const-class v10, Ljava/lang/String;

    .line 403
    .line 404
    if-ne v11, v10, :cond_11

    .line 405
    .line 406
    iget-boolean v10, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->fieldsCanBeNull:Z

    .line 407
    .line 408
    if-eqz v10, :cond_11

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_11
    move/from16 v7, v16

    .line 412
    .line 413
    :goto_8
    iput-boolean v7, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->canBeNull:Z

    .line 414
    .line 415
    iput-object v11, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->valueClass:Ljava/lang/Class;

    .line 416
    .line 417
    sget-boolean v7, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 418
    .line 419
    if-eqz v7, :cond_12

    .line 420
    .line 421
    new-instance v7, Ljava/lang/StringBuilder;

    .line 422
    .line 423
    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v11}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v10

    .line 430
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-static {v9}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-static {v8, v2}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    :cond_12
    :goto_9
    invoke-direct {v1, v0}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->applyAnnotations(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;)V

    .line 464
    .line 465
    .line 466
    if-eqz v6, :cond_14

    .line 467
    .line 468
    iget-boolean v1, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->serializeTransient:Z

    .line 469
    .line 470
    if-eqz v1, :cond_13

    .line 471
    .line 472
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    :cond_13
    iget-boolean v1, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$FieldSerializerConfig;->copyTransient:Z

    .line 476
    .line 477
    if-eqz v1, :cond_15

    .line 478
    .line 479
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_14
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    :cond_15
    :goto_a
    return-void
.end method

.method private applyAnnotations(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 2
    .line 3
    const-class v1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Bind;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    const-class v4, Ljava/lang/Object;

    .line 11
    .line 12
    if-eqz v2, :cond_4

    .line 13
    .line 14
    iget-object v2, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 15
    .line 16
    if-nez v2, :cond_3

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Bind;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Bind;->valueClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-ne v2, v4, :cond_0

    .line 29
    .line 30
    move-object v2, v3

    .line 31
    :cond_0
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setValueClass(Ljava/lang/Class;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Bind;->serializer()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Bind;->serializerFactory()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-direct {p0, v2, v5, v6}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->newSerializer(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setSerializer(Lcom/esotericsoftware/kryo/Serializer;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Bind;->canBeNull()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setCanBeNull(Z)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Bind;->variableLengthEncoding()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setVariableLengthEncoding(Z)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$Bind;->optimizePositive()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-virtual {p1, v1}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setOptimizePositive(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iget-object p0, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 76
    .line 77
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    iget-object p1, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string v0, "@Bind applied to a field that already has a serializer: "

    .line 92
    .line 93
    invoke-static {p0, v0, p1}, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    :goto_0
    const-class v1, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_a

    .line 104
    .line 105
    iget-object v2, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 106
    .line 107
    if-nez v2, :cond_9

    .line 108
    .line 109
    const-class v2, Ljava/util/Collection;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_8

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    check-cast v1, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;

    .line 126
    .line 127
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;->elementClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    if-ne v2, v4, :cond_5

    .line 132
    .line 133
    move-object v2, v3

    .line 134
    :cond_5
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;->elementSerializer()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;->elementSerializerFactory()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-direct {p0, v2, v5, v6}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->newSerializer(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    new-instance v6, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;

    .line 147
    .line 148
    invoke-direct {v6}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer$BindCollection;->elementsCanBeNull()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    invoke-virtual {v6, v1}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->setElementsCanBeNull(Z)V

    .line 156
    .line 157
    .line 158
    if-eqz v2, :cond_6

    .line 159
    .line 160
    invoke-virtual {v6, v2}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->setElementClass(Ljava/lang/Class;)V

    .line 161
    .line 162
    .line 163
    :cond_6
    if-eqz v5, :cond_7

    .line 164
    .line 165
    invoke-virtual {v6, v5}, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;->setElementSerializer(Lcom/esotericsoftware/kryo/Serializer;)V

    .line 166
    .line 167
    .line 168
    :cond_7
    invoke-virtual {p1, v6}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setSerializer(Lcom/esotericsoftware/kryo/Serializer;)V

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_8
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    const-string v1, "@BindCollection can only be used with a field implementing Collection: "

    .line 185
    .line 186
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    throw p0

    .line 200
    :cond_9
    iget-object p0, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    iget-object p1, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    const-string v0, "@BindCollection applied to a field that already has a serializer: "

    .line 217
    .line 218
    invoke-static {p0, v0, p1}, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_a
    :goto_1
    const-class v1, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;

    .line 223
    .line 224
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_13

    .line 229
    .line 230
    iget-object v2, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->serializer:Lcom/esotericsoftware/kryo/Serializer;

    .line 231
    .line 232
    if-nez v2, :cond_12

    .line 233
    .line 234
    const-class v2, Ljava/util/Map;

    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    invoke-virtual {v2, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_11

    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;

    .line 251
    .line 252
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;->valueClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    if-ne v1, v4, :cond_b

    .line 257
    .line 258
    move-object v1, v3

    .line 259
    :cond_b
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;->valueSerializer()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;->valueSerializerFactory()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    invoke-direct {p0, v1, v2, v5}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->newSerializer(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;->keyClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    if-ne v5, v4, :cond_c

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_c
    move-object v3, v5

    .line 279
    :goto_2
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;->keySerializer()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;->keySerializerFactory()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    invoke-direct {p0, v3, v4, v5}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->newSerializer(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    new-instance v4, Lcom/esotericsoftware/kryo/serializers/MapSerializer;

    .line 292
    .line 293
    invoke-direct {v4}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;->keysCanBeNull()Z

    .line 297
    .line 298
    .line 299
    move-result v5

    .line 300
    invoke-virtual {v4, v5}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->setKeysCanBeNull(Z)V

    .line 301
    .line 302
    .line 303
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer$BindMap;->valuesCanBeNull()Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    invoke-virtual {v4, v0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->setValuesCanBeNull(Z)V

    .line 308
    .line 309
    .line 310
    if-eqz v3, :cond_d

    .line 311
    .line 312
    invoke-virtual {v4, v3}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->setKeyClass(Ljava/lang/Class;)V

    .line 313
    .line 314
    .line 315
    :cond_d
    if-eqz p0, :cond_e

    .line 316
    .line 317
    invoke-virtual {v4, p0}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->setKeySerializer(Lcom/esotericsoftware/kryo/Serializer;)V

    .line 318
    .line 319
    .line 320
    :cond_e
    if-eqz v1, :cond_f

    .line 321
    .line 322
    invoke-virtual {v4, v1}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->setValueClass(Ljava/lang/Class;)V

    .line 323
    .line 324
    .line 325
    :cond_f
    if-eqz v2, :cond_10

    .line 326
    .line 327
    invoke-virtual {v4, v2}, Lcom/esotericsoftware/kryo/serializers/MapSerializer;->setValueSerializer(Lcom/esotericsoftware/kryo/Serializer;)V

    .line 328
    .line 329
    .line 330
    :cond_10
    invoke-virtual {p1, v4}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->setSerializer(Lcom/esotericsoftware/kryo/Serializer;)V

    .line 331
    .line 332
    .line 333
    return-void

    .line 334
    :cond_11
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    new-instance v0, Ljava/lang/StringBuilder;

    .line 345
    .line 346
    const-string v1, "@BindMap can only be used with a field implementing Map: "

    .line 347
    .line 348
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw p0

    .line 362
    :cond_12
    iget-object p0, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 363
    .line 364
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    iget-object p1, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 373
    .line 374
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    const-string v0, "@BindMap applied to a field that already has a serializer: "

    .line 379
    .line 380
    invoke-static {p0, v0, p1}, Lcom/esotericsoftware/kryo/serializers/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_13
    return-void
.end method

.method private newAsmField(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    if-ne p2, v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$IntAsmField;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$IntAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$FloatAsmField;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$FloatAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    if-ne p2, v0, :cond_2

    .line 30
    .line 31
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$BooleanAsmField;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$BooleanAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p2, v0, :cond_3

    .line 40
    .line 41
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$LongAsmField;

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$LongAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    if-ne p2, v0, :cond_4

    .line 50
    .line 51
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$DoubleAsmField;

    .line 52
    .line 53
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$DoubleAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    if-ne p2, v0, :cond_5

    .line 60
    .line 61
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$ShortAsmField;

    .line 62
    .line 63
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$ShortAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne p2, v0, :cond_6

    .line 70
    .line 71
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$CharAsmField;

    .line 72
    .line 73
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$CharAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_6
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    if-ne p2, v0, :cond_7

    .line 80
    .line 81
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$ByteAsmField;

    .line 82
    .line 83
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$ByteAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_7
    const-class v0, Ljava/lang/String;

    .line 88
    .line 89
    if-ne p2, v0, :cond_9

    .line 90
    .line 91
    iget-object p2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 92
    .line 93
    iget-object p2, p2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 94
    .line 95
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/Kryo;->getReferences()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_8

    .line 100
    .line 101
    iget-object p2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 102
    .line 103
    iget-object p2, p2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 104
    .line 105
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/Kryo;->getReferenceResolver()Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-interface {p2, v0}, Lcom/esotericsoftware/kryo/ReferenceResolver;->useReferences(Ljava/lang/Class;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-nez p2, :cond_9

    .line 114
    .line 115
    :cond_8
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/AsmField$StringAsmField;

    .line 116
    .line 117
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/AsmField$StringAsmField;-><init>(Ljava/lang/reflect/Field;)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_9
    new-instance p2, Lcom/esotericsoftware/kryo/serializers/AsmField;

    .line 122
    .line 123
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 124
    .line 125
    invoke-direct {p2, p1, p0, p3}, Lcom/esotericsoftware/kryo/serializers/AsmField;-><init>(Ljava/lang/reflect/Field;Lcom/esotericsoftware/kryo/serializers/FieldSerializer;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)V

    .line 126
    .line 127
    .line 128
    return-object p2
.end method

.method private newReflectField(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    if-ne p2, v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/ReflectField$IntReflectField;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/ReflectField$IntReflectField;-><init>(Ljava/lang/reflect/Field;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/ReflectField$FloatReflectField;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/ReflectField$FloatReflectField;-><init>(Ljava/lang/reflect/Field;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    if-ne p2, v0, :cond_2

    .line 30
    .line 31
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/ReflectField$BooleanReflectField;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/ReflectField$BooleanReflectField;-><init>(Ljava/lang/reflect/Field;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p2, v0, :cond_3

    .line 40
    .line 41
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/ReflectField$LongReflectField;

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/ReflectField$LongReflectField;-><init>(Ljava/lang/reflect/Field;)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    if-ne p2, v0, :cond_4

    .line 50
    .line 51
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/ReflectField$DoubleReflectField;

    .line 52
    .line 53
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/ReflectField$DoubleReflectField;-><init>(Ljava/lang/reflect/Field;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    if-ne p2, v0, :cond_5

    .line 60
    .line 61
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/ReflectField$ShortReflectField;

    .line 62
    .line 63
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/ReflectField$ShortReflectField;-><init>(Ljava/lang/reflect/Field;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne p2, v0, :cond_6

    .line 70
    .line 71
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/ReflectField$CharReflectField;

    .line 72
    .line 73
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/ReflectField$CharReflectField;-><init>(Ljava/lang/reflect/Field;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_6
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    if-ne p2, v0, :cond_7

    .line 80
    .line 81
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/ReflectField$ByteReflectField;

    .line 82
    .line 83
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/ReflectField$ByteReflectField;-><init>(Ljava/lang/reflect/Field;)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_7
    new-instance p2, Lcom/esotericsoftware/kryo/serializers/ReflectField;

    .line 88
    .line 89
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 90
    .line 91
    invoke-direct {p2, p1, p0, p3}, Lcom/esotericsoftware/kryo/serializers/ReflectField;-><init>(Ljava/lang/reflect/Field;Lcom/esotericsoftware/kryo/serializers/FieldSerializer;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)V

    .line 92
    .line 93
    .line 94
    return-object p2
.end method

.method private newSerializer(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;
    .locals 2

    .line 1
    const-class v0, Lcom/esotericsoftware/kryo/Serializer;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    const-class v0, Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 8
    .line 9
    if-ne p3, v0, :cond_1

    .line 10
    .line 11
    move-object p3, v1

    .line 12
    :cond_1
    if-nez p3, :cond_2

    .line 13
    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    const-class p3, Lcom/esotericsoftware/kryo/SerializerFactory$ReflectionSerializerFactory;

    .line 17
    .line 18
    :cond_2
    if-nez p3, :cond_3

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_3
    invoke-static {p3, p2}, Lcom/esotericsoftware/kryo/util/Util;->newFactory(Ljava/lang/Class;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 26
    .line 27
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 28
    .line 29
    invoke-interface {p2, p0, p1}, Lcom/esotericsoftware/kryo/SerializerFactory;->newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method private newUnsafeField(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    if-ne p2, v0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$IntUnsafeField;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$IntUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$FloatUnsafeField;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$FloatUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 28
    .line 29
    if-ne p2, v0, :cond_2

    .line 30
    .line 31
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$BooleanUnsafeField;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$BooleanUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p2, v0, :cond_3

    .line 40
    .line 41
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$LongUnsafeField;

    .line 42
    .line 43
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$LongUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    if-ne p2, v0, :cond_4

    .line 50
    .line 51
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$DoubleUnsafeField;

    .line 52
    .line 53
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$DoubleUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    if-ne p2, v0, :cond_5

    .line 60
    .line 61
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$ShortUnsafeField;

    .line 62
    .line 63
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$ShortUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 64
    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne p2, v0, :cond_6

    .line 70
    .line 71
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$CharUnsafeField;

    .line 72
    .line 73
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$CharUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_6
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    if-ne p2, v0, :cond_7

    .line 80
    .line 81
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$ByteUnsafeField;

    .line 82
    .line 83
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$ByteUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 84
    .line 85
    .line 86
    return-object p0

    .line 87
    :cond_7
    const-class v0, Ljava/lang/String;

    .line 88
    .line 89
    if-ne p2, v0, :cond_9

    .line 90
    .line 91
    iget-object p2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 92
    .line 93
    iget-object p2, p2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 94
    .line 95
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/Kryo;->getReferences()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_8

    .line 100
    .line 101
    iget-object p2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 102
    .line 103
    iget-object p2, p2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->kryo:Lcom/esotericsoftware/kryo/Kryo;

    .line 104
    .line 105
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/Kryo;->getReferenceResolver()Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-interface {p2, v0}, Lcom/esotericsoftware/kryo/ReferenceResolver;->useReferences(Ljava/lang/Class;)Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    if-nez p2, :cond_9

    .line 114
    .line 115
    :cond_8
    new-instance p0, Lcom/esotericsoftware/kryo/serializers/UnsafeField$StringUnsafeField;

    .line 116
    .line 117
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/serializers/UnsafeField$StringUnsafeField;-><init>(Ljava/lang/reflect/Field;)V

    .line 118
    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_9
    new-instance p2, Lcom/esotericsoftware/kryo/serializers/UnsafeField;

    .line 122
    .line 123
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 124
    .line 125
    invoke-direct {p2, p1, p0, p3}, Lcom/esotericsoftware/kryo/serializers/UnsafeField;-><init>(Ljava/lang/reflect/Field;Lcom/esotericsoftware/kryo/serializers/FieldSerializer;Lcom/esotericsoftware/kryo/util/Generics$GenericType;)V

    .line 126
    .line 127
    .line 128
    return-object p2
.end method


# virtual methods
.method public compare(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;)I
    .locals 0

    .line 10
    iget-object p0, p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    iget-object p1, p2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 2
    .line 3
    check-cast p2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->compare(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public rebuild()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->emptyCachedFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 16
    .line 17
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->initializeCachedFields()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-boolean v2, Lcom/esotericsoftware/kryo/util/Util;->unsafe:Z

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    sget-boolean v2, Lcom/esotericsoftware/kryo/util/Util;->isAndroid:Z

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    iget-object v2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 43
    .line 44
    iget-object v2, v2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Class;->getModifiers()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move v2, v3

    .line 59
    :goto_0
    iget-object v4, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 60
    .line 61
    iget-object v4, v4, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 62
    .line 63
    :goto_1
    const-class v5, Ljava/lang/Object;

    .line 64
    .line 65
    if-eq v4, v5, :cond_3

    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    array-length v6, v5

    .line 72
    move v7, v3

    .line 73
    :goto_2
    if-ge v7, v6, :cond_2

    .line 74
    .line 75
    aget-object v8, v5, v7

    .line 76
    .line 77
    invoke-direct {p0, v8, v2, v0, v1}, Lcom/esotericsoftware/kryo/serializers/CachedFields;->addField(Ljava/lang/reflect/Field;ZLjava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v7, v7, 0x1

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    iget-object v2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 89
    .line 90
    array-length v2, v2

    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    if-eq v2, v3, :cond_4

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    new-array v2, v2, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 102
    .line 103
    iput-object v2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 104
    .line 105
    :cond_4
    iget-object v2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 111
    .line 112
    invoke-static {v0, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 116
    .line 117
    array-length v0, v0

    .line 118
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eq v0, v2, :cond_5

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    new-array v0, v0, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 129
    .line 130
    iput-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 131
    .line 132
    :cond_5
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 133
    .line 134
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 138
    .line 139
    invoke-static {v0, p0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 140
    .line 141
    .line 142
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 143
    .line 144
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->initializeCachedFields()V

    .line 145
    .line 146
    .line 147
    return-void
.end method

.method public removeField(Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;)V
    .locals 8

    const/4 v0, 0x0

    move v1, v0

    .line 121
    :goto_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    array-length v3, v2

    const/4 v4, 0x1

    if-ge v1, v3, :cond_1

    .line 122
    aget-object v3, v2, v1

    if-ne v3, p1, :cond_0

    .line 123
    array-length v5, v2

    sub-int/2addr v5, v4

    new-array v6, v5, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 124
    invoke-static {v2, v0, v6, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 125
    iget-object v2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    add-int/lit8 v7, v1, 0x1

    sub-int/2addr v5, v1

    invoke-static {v2, v7, v6, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    iput-object v6, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 127
    iget-object v1, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->removedFields:Ljava/util/ArrayList;

    iget-object v2, v3, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v1, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_1
    move v2, v0

    .line 128
    :goto_2
    iget-object v3, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    array-length v5, v3

    if-ge v2, v5, :cond_3

    .line 129
    aget-object v5, v3, v2

    if-ne v5, p1, :cond_2

    .line 130
    array-length v1, v3

    sub-int/2addr v1, v4

    new-array v6, v1, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 131
    invoke-static {v3, v0, v6, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 132
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    add-int/lit8 v3, v2, 0x1

    sub-int/2addr v1, v2

    invoke-static {v0, v3, v6, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 133
    iput-object v6, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 134
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->removedFields:Ljava/util/ArrayList;

    iget-object v1, v5, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    move v4, v1

    :goto_3
    if-eqz v4, :cond_4

    return-void

    .line 135
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Field \""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\" not found on class: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 136
    invoke-static {p0, v0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    .line 137
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public removeField(Ljava/lang/String;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 4
    .line 5
    array-length v3, v2

    .line 6
    const/4 v4, 0x1

    .line 7
    if-ge v1, v3, :cond_1

    .line 8
    .line 9
    aget-object v2, v2, v1

    .line 10
    .line 11
    iget-object v3, v2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    iget-object v3, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 20
    .line 21
    array-length v5, v3

    .line 22
    sub-int/2addr v5, v4

    .line 23
    new-array v6, v5, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 24
    .line 25
    invoke-static {v3, v0, v6, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 29
    .line 30
    add-int/lit8 v7, v1, 0x1

    .line 31
    .line 32
    sub-int/2addr v5, v1

    .line 33
    invoke-static {v3, v7, v6, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    iput-object v6, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->fields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 37
    .line 38
    iget-object v1, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->removedFields:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v2, v2, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move v1, v4

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v1, v0

    .line 51
    :goto_1
    move v2, v0

    .line 52
    :goto_2
    iget-object v3, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 53
    .line 54
    array-length v5, v3

    .line 55
    if-ge v2, v5, :cond_3

    .line 56
    .line 57
    aget-object v3, v3, v2

    .line 58
    .line 59
    iget-object v5, v3, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->name:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    iget-object v1, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 68
    .line 69
    array-length v5, v1

    .line 70
    sub-int/2addr v5, v4

    .line 71
    new-array v6, v5, [Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 72
    .line 73
    invoke-static {v1, v0, v6, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 77
    .line 78
    add-int/lit8 v1, v2, 0x1

    .line 79
    .line 80
    sub-int/2addr v5, v2

    .line 81
    invoke-static {v0, v1, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 82
    .line 83
    .line 84
    iput-object v6, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->copyFields:[Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;

    .line 85
    .line 86
    iget-object v0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->removedFields:Ljava/util/ArrayList;

    .line 87
    .line 88
    iget-object v1, v3, Lcom/esotericsoftware/kryo/serializers/FieldSerializer$CachedField;->field:Ljava/lang/reflect/Field;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_3
    move v4, v1

    .line 98
    :goto_3
    if-eqz v4, :cond_4

    .line 99
    .line 100
    return-void

    .line 101
    :cond_4
    const-string v0, "Field \""

    .line 102
    .line 103
    const-string v1, "\" not found on class: "

    .line 104
    .line 105
    invoke-static {v0, p1, v1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/CachedFields;->serializer:Lcom/esotericsoftware/kryo/serializers/FieldSerializer;

    .line 110
    .line 111
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/FieldSerializer;->type:Ljava/lang/Class;

    .line 112
    .line 113
    invoke-static {p0, p1}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method
