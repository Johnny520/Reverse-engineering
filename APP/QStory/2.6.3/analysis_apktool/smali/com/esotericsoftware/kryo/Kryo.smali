.class public Lcom/esotericsoftware/kryo/Kryo;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;
    }
.end annotation


# static fields
.field private static final DEFAULT_SERIALIZER_SIZE:I = 0x44

.field public static final NOT_NULL:B = 0x1t

.field private static final NO_REF:I = -0x2

.field public static final NULL:B = 0x0t

.field private static final REF:I = -0x1


# instance fields
.field private autoReset:Z

.field private classLoader:Ljava/lang/ClassLoader;

.field private final classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

.field private context:Lcom/esotericsoftware/kryo/util/ObjectMap;

.field private copyDepth:I

.field private copyReferences:Z

.field private copyShallow:Z

.field private defaultSerializer:Lcom/esotericsoftware/kryo/SerializerFactory;

.field private final defaultSerializers:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;",
            ">;"
        }
    .end annotation
.end field

.field private depth:I

.field private generics:Lcom/esotericsoftware/kryo/util/Generics;

.field private graphContext:Lcom/esotericsoftware/kryo/util/ObjectMap;

.field private final lowPriorityDefaultSerializerCount:I

.field private maxDepth:I

.field private needsCopyReference:Ljava/lang/Object;

.field private nextRegisterID:I

.field private originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

.field private readObject:Ljava/lang/Object;

.field private final readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

.field private referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

.field private references:Z

.field private registrationRequired:Z

.field private strategy:L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;

.field private volatile thread:Ljava/lang/Thread;

.field private warnUnregisteredClasses:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 534
    new-instance v0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;

    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;-><init>(Lcom/esotericsoftware/kryo/ClassResolver;Lcom/esotericsoftware/kryo/ReferenceResolver;)V

    return-void
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/ClassResolver;Lcom/esotericsoftware/kryo/ReferenceResolver;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/SerializerFactory$FieldSerializerFactory;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializer:Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v1, 0x44

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializers:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->classLoader:Ljava/lang/ClassLoader;

    .line 29
    .line 30
    new-instance v1, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;

    .line 31
    .line 32
    invoke-direct {v1}, Lcom/esotericsoftware/kryo/util/DefaultInstantiatorStrategy;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->strategy:L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    iput-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->registrationRequired:Z

    .line 39
    .line 40
    const v2, 0x7fffffff

    .line 41
    .line 42
    .line 43
    iput v2, p0, Lcom/esotericsoftware/kryo/Kryo;->maxDepth:I

    .line 44
    .line 45
    iput-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 46
    .line 47
    new-instance v2, Lcom/esotericsoftware/kryo/util/IntArray;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-direct {v2, v3}, Lcom/esotericsoftware/kryo/util/IntArray;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 54
    .line 55
    iput-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyReferences:Z

    .line 56
    .line 57
    new-instance v2, Lcom/esotericsoftware/kryo/util/DefaultGenerics;

    .line 58
    .line 59
    invoke-direct {v2, p0}, Lcom/esotericsoftware/kryo/util/DefaultGenerics;-><init>(Lcom/esotericsoftware/kryo/Kryo;)V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->generics:Lcom/esotericsoftware/kryo/util/Generics;

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    if-eqz p1, :cond_2

    .line 66
    .line 67
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 68
    .line 69
    invoke-interface {p1, p0}, Lcom/esotericsoftware/kryo/ClassResolver;->setKryo(Lcom/esotericsoftware/kryo/Kryo;)V

    .line 70
    .line 71
    .line 72
    iput-object p2, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 73
    .line 74
    if-eqz p2, :cond_0

    .line 75
    .line 76
    invoke-interface {p2, p0}, Lcom/esotericsoftware/kryo/ReferenceResolver;->setKryo(Lcom/esotericsoftware/kryo/Kryo;)V

    .line 77
    .line 78
    .line 79
    iput-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 80
    .line 81
    :cond_0
    const-class p1, [B

    .line 82
    .line 83
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$ByteArraySerializer;

    .line 84
    .line 85
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 86
    .line 87
    .line 88
    const-class p1, [C

    .line 89
    .line 90
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$CharArraySerializer;

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 93
    .line 94
    .line 95
    const-class p1, [S

    .line 96
    .line 97
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$ShortArraySerializer;

    .line 98
    .line 99
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 100
    .line 101
    .line 102
    const-class p1, [I

    .line 103
    .line 104
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$IntArraySerializer;

    .line 105
    .line 106
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 107
    .line 108
    .line 109
    const-class p1, [J

    .line 110
    .line 111
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$LongArraySerializer;

    .line 112
    .line 113
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 114
    .line 115
    .line 116
    const-class p1, [F

    .line 117
    .line 118
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$FloatArraySerializer;

    .line 119
    .line 120
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 121
    .line 122
    .line 123
    const-class p1, [D

    .line 124
    .line 125
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$DoubleArraySerializer;

    .line 126
    .line 127
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 128
    .line 129
    .line 130
    const-class p1, [Z

    .line 131
    .line 132
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$BooleanArraySerializer;

    .line 133
    .line 134
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 135
    .line 136
    .line 137
    const-class p1, [Ljava/lang/String;

    .line 138
    .line 139
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$StringArraySerializer;

    .line 140
    .line 141
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 142
    .line 143
    .line 144
    const-class p1, [Ljava/lang/Object;

    .line 145
    .line 146
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultArraySerializers$ObjectArraySerializer;

    .line 147
    .line 148
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 149
    .line 150
    .line 151
    const-class p1, Ljava/math/BigInteger;

    .line 152
    .line 153
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigIntegerSerializer;

    .line 154
    .line 155
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 156
    .line 157
    .line 158
    const-class p1, Ljava/math/BigDecimal;

    .line 159
    .line 160
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BigDecimalSerializer;

    .line 161
    .line 162
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 163
    .line 164
    .line 165
    const-class p1, Ljava/lang/Class;

    .line 166
    .line 167
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$ClassSerializer;

    .line 168
    .line 169
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 170
    .line 171
    .line 172
    const-class p1, Ljava/util/Date;

    .line 173
    .line 174
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DateSerializer;

    .line 175
    .line 176
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 177
    .line 178
    .line 179
    const-class p1, Ljava/lang/Enum;

    .line 180
    .line 181
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$EnumSerializer;

    .line 182
    .line 183
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 184
    .line 185
    .line 186
    const-class p1, Ljava/util/EnumSet;

    .line 187
    .line 188
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$EnumSetSerializer;

    .line 189
    .line 190
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 191
    .line 192
    .line 193
    const-class p1, Ljava/util/Currency;

    .line 194
    .line 195
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CurrencySerializer;

    .line 196
    .line 197
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 198
    .line 199
    .line 200
    const-class p1, Ljava/lang/StringBuffer;

    .line 201
    .line 202
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$StringBufferSerializer;

    .line 203
    .line 204
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 205
    .line 206
    .line 207
    const-class p1, Ljava/lang/StringBuilder;

    .line 208
    .line 209
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$StringBuilderSerializer;

    .line 210
    .line 211
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 212
    .line 213
    .line 214
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CollectionsEmptyListSerializer;

    .line 221
    .line 222
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 223
    .line 224
    .line 225
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CollectionsEmptyMapSerializer;

    .line 232
    .line 233
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 234
    .line 235
    .line 236
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 237
    .line 238
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CollectionsEmptySetSerializer;

    .line 243
    .line 244
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CollectionsSingletonListSerializer;

    .line 256
    .line 257
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v2, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CollectionsSingletonMapSerializer;

    .line 269
    .line 270
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CollectionsSingletonSetSerializer;

    .line 282
    .line 283
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 284
    .line 285
    .line 286
    const-class p1, Ljava/util/TreeSet;

    .line 287
    .line 288
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TreeSetSerializer;

    .line 289
    .line 290
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 291
    .line 292
    .line 293
    const-class p1, Ljava/util/Collection;

    .line 294
    .line 295
    const-class p2, Lcom/esotericsoftware/kryo/serializers/CollectionSerializer;

    .line 296
    .line 297
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 298
    .line 299
    .line 300
    const-class p1, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 301
    .line 302
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$ConcurrentSkipListMapSerializer;

    .line 303
    .line 304
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 305
    .line 306
    .line 307
    const-class p1, Ljava/util/TreeMap;

    .line 308
    .line 309
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TreeMapSerializer;

    .line 310
    .line 311
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 312
    .line 313
    .line 314
    const-class p1, Ljava/util/Map;

    .line 315
    .line 316
    const-class p2, Lcom/esotericsoftware/kryo/serializers/MapSerializer;

    .line 317
    .line 318
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 319
    .line 320
    .line 321
    const-class p1, Ljava/util/TimeZone;

    .line 322
    .line 323
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;

    .line 324
    .line 325
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 326
    .line 327
    .line 328
    const-class p1, Ljava/util/Calendar;

    .line 329
    .line 330
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CalendarSerializer;

    .line 331
    .line 332
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 333
    .line 334
    .line 335
    const-class p1, Ljava/util/Locale;

    .line 336
    .line 337
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LocaleSerializer;

    .line 338
    .line 339
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 340
    .line 341
    .line 342
    const-class p1, Ljava/nio/charset/Charset;

    .line 343
    .line 344
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CharsetSerializer;

    .line 345
    .line 346
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 347
    .line 348
    .line 349
    const-class p1, Ljava/net/URL;

    .line 350
    .line 351
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$URLSerializer;

    .line 352
    .line 353
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 354
    .line 355
    .line 356
    new-array p1, v3, [Ljava/lang/Object;

    .line 357
    .line 358
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object p1

    .line 362
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$ArraysAsListSerializer;

    .line 367
    .line 368
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 369
    .line 370
    .line 371
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$VoidSerializer;

    .line 372
    .line 373
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$VoidSerializer;-><init>()V

    .line 374
    .line 375
    .line 376
    sget-object p2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 377
    .line 378
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 379
    .line 380
    .line 381
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$PriorityQueueSerializer;

    .line 382
    .line 383
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$PriorityQueueSerializer;-><init>()V

    .line 384
    .line 385
    .line 386
    const-class p2, Ljava/util/PriorityQueue;

    .line 387
    .line 388
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 389
    .line 390
    .line 391
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BitSetSerializer;

    .line 392
    .line 393
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BitSetSerializer;-><init>()V

    .line 394
    .line 395
    .line 396
    const-class p2, Ljava/util/BitSet;

    .line 397
    .line 398
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)V

    .line 399
    .line 400
    .line 401
    const-class p1, Lcom/esotericsoftware/kryo/KryoSerializable;

    .line 402
    .line 403
    const-class p2, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$KryoSerializableSerializer;

    .line 404
    .line 405
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 406
    .line 407
    .line 408
    invoke-static {p0}, Lcom/esotericsoftware/kryo/serializers/OptionalSerializers;->addDefaultSerializers(Lcom/esotericsoftware/kryo/Kryo;)V

    .line 409
    .line 410
    .line 411
    invoke-static {p0}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers;->addDefaultSerializers(Lcom/esotericsoftware/kryo/Kryo;)V

    .line 412
    .line 413
    .line 414
    invoke-static {p0}, Lcom/esotericsoftware/kryo/serializers/ImmutableCollectionsSerializers;->addDefaultSerializers(Lcom/esotericsoftware/kryo/Kryo;)V

    .line 415
    .line 416
    .line 417
    const-string p1, "java.lang.Record"

    .line 418
    .line 419
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 420
    .line 421
    .line 422
    move-result p2

    .line 423
    if-eqz p2, :cond_1

    .line 424
    .line 425
    const-class p2, Lcom/esotericsoftware/kryo/serializers/RecordSerializer;

    .line 426
    .line 427
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/String;Ljava/lang/Class;)V

    .line 428
    .line 429
    .line 430
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 431
    .line 432
    .line 433
    move-result p1

    .line 434
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->lowPriorityDefaultSerializerCount:I

    .line 435
    .line 436
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$IntSerializer;

    .line 437
    .line 438
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$IntSerializer;-><init>()V

    .line 439
    .line 440
    .line 441
    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 442
    .line 443
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 444
    .line 445
    .line 446
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$StringSerializer;

    .line 447
    .line 448
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$StringSerializer;-><init>()V

    .line 449
    .line 450
    .line 451
    const-class p2, Ljava/lang/String;

    .line 452
    .line 453
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 454
    .line 455
    .line 456
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$FloatSerializer;

    .line 457
    .line 458
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$FloatSerializer;-><init>()V

    .line 459
    .line 460
    .line 461
    sget-object p2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 462
    .line 463
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 464
    .line 465
    .line 466
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BooleanSerializer;

    .line 467
    .line 468
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$BooleanSerializer;-><init>()V

    .line 469
    .line 470
    .line 471
    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 472
    .line 473
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 474
    .line 475
    .line 476
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$ByteSerializer;

    .line 477
    .line 478
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$ByteSerializer;-><init>()V

    .line 479
    .line 480
    .line 481
    sget-object p2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 482
    .line 483
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 484
    .line 485
    .line 486
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CharSerializer;

    .line 487
    .line 488
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CharSerializer;-><init>()V

    .line 489
    .line 490
    .line 491
    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 492
    .line 493
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 494
    .line 495
    .line 496
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$ShortSerializer;

    .line 497
    .line 498
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$ShortSerializer;-><init>()V

    .line 499
    .line 500
    .line 501
    sget-object p2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 502
    .line 503
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 504
    .line 505
    .line 506
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LongSerializer;

    .line 507
    .line 508
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$LongSerializer;-><init>()V

    .line 509
    .line 510
    .line 511
    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 512
    .line 513
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 514
    .line 515
    .line 516
    new-instance p1, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DoubleSerializer;

    .line 517
    .line 518
    invoke-direct {p1}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$DoubleSerializer;-><init>()V

    .line 519
    .line 520
    .line 521
    sget-object p2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 522
    .line 523
    invoke-virtual {p0, p2, p1}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    .line 524
    .line 525
    .line 526
    return-void

    .line 527
    :cond_2
    const-string p0, "classResolver cannot be null."

    .line 528
    .line 529
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    throw v2
.end method

.method public constructor <init>(Lcom/esotericsoftware/kryo/ReferenceResolver;)V
    .locals 1

    .line 533
    new-instance v0, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;

    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/DefaultClassResolver;-><init>()V

    invoke-direct {p0, v0, p1}, Lcom/esotericsoftware/kryo/Kryo;-><init>(Lcom/esotericsoftware/kryo/ClassResolver;Lcom/esotericsoftware/kryo/ReferenceResolver;)V

    return-void
.end method

.method private addDefaultSerializer(Ljava/lang/String;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/esotericsoftware/kryo/Serializer;",
            ">;)V"
        }
    .end annotation

    .line 29
    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 30
    :catch_0
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    const-string p2, "default serializer cannot be added: "

    .line 31
    invoke-static {p2, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 32
    invoke-direct {p0, p1}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private beginObject()V
    .locals 3

    .line 1
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->thread:Ljava/lang/Thread;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->thread:Ljava/lang/Thread;

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 26
    .line 27
    const-string v0, "Kryo must not be accessed concurrently by multiple threads."

    .line 28
    .line 29
    invoke-direct {p0, v0}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_2
    :goto_0
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 34
    .line 35
    iget v1, p0, Lcom/esotericsoftware/kryo/Kryo;->maxDepth:I

    .line 36
    .line 37
    if-eq v0, v1, :cond_3

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x1

    .line 40
    .line 41
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    new-instance v0, Lcom/esotericsoftware/kryo/KryoException;

    .line 45
    .line 46
    iget p0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v2, "Max depth exceeded: "

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {v0, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v0
.end method

.method private insertDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/SerializerFactory;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializers:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lcom/esotericsoftware/kryo/Kryo;->lowPriorityDefaultSerializerCount:I

    .line 8
    .line 9
    sub-int/2addr v0, v1

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    iget-object v3, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializers:Ljava/util/ArrayList;

    .line 13
    .line 14
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;

    .line 21
    .line 22
    iget-object v3, v3, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;->type:Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {p1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    add-int/lit8 v2, v1, 0x1

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    new-instance p0, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;

    .line 36
    .line 37
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;-><init>(Ljava/lang/Class;Lcom/esotericsoftware/kryo/SerializerFactory;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v2, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return v2
.end method


# virtual methods
.method public addDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/esotericsoftware/kryo/SerializerFactory$SingletonSerializerFactory;

    .line 6
    .line 7
    invoke-direct {v0, p2}, Lcom/esotericsoftware/kryo/SerializerFactory$SingletonSerializerFactory;-><init>(Lcom/esotericsoftware/kryo/Serializer;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/Kryo;->insertDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/SerializerFactory;)I

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string p0, "serializer cannot be null."

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string p0, "type cannot be null."

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public addDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/SerializerFactory;)V
    .locals 0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 26
    invoke-direct {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->insertDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/SerializerFactory;)I

    return-void

    .line 27
    :cond_0
    const-string p0, "serializerFactory cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void

    .line 28
    :cond_1
    const-string p0, "type cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/lang/Class<",
            "+",
            "Lcom/esotericsoftware/kryo/Serializer;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 33
    new-instance v0, Lcom/esotericsoftware/kryo/SerializerFactory$ReflectionSerializerFactory;

    invoke-direct {v0, p2}, Lcom/esotericsoftware/kryo/SerializerFactory$ReflectionSerializerFactory;-><init>(Ljava/lang/Class;)V

    invoke-direct {p0, p1, v0}, Lcom/esotericsoftware/kryo/Kryo;->insertDefaultSerializer(Ljava/lang/Class;Lcom/esotericsoftware/kryo/SerializerFactory;)I

    return-void

    .line 34
    :cond_0
    const-string p0, "serializerClass cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void

    .line 35
    :cond_1
    const-string p0, "type cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public copy(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_1
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    add-int/2addr v0, v1

    .line 14
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    new-instance v0, Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 21
    .line 22
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/IdentityMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lcom/esotericsoftware/kryo/util/IdentityMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 39
    .line 40
    sub-int/2addr p1, v1

    .line 41
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-object v0

    .line 49
    :cond_4
    :try_start_1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyReferences:Z

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_5
    instance-of v0, p1, Lcom/esotericsoftware/kryo/KryoCopyable;

    .line 56
    .line 57
    if-eqz v0, :cond_6

    .line 58
    .line 59
    check-cast p1, Lcom/esotericsoftware/kryo/KryoCopyable;

    .line 60
    .line 61
    invoke-interface {p1, p0}, Lcom/esotericsoftware/kryo/KryoCopyable;->copy(Lcom/esotericsoftware/kryo/Kryo;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    goto :goto_1

    .line 66
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0, p0, p1}, Lcom/esotericsoftware/kryo/Serializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    .line 79
    .line 80
    if-eqz v0, :cond_7

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_7
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 86
    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 90
    .line 91
    if-eqz v0, :cond_9

    .line 92
    .line 93
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 94
    .line 95
    if-ne v0, v1, :cond_9

    .line 96
    .line 97
    :cond_8
    const-string v0, "Copy"

    .line 98
    .line 99
    const/4 v2, -0x1

    .line 100
    invoke-static {v0, p1, v2}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    :cond_9
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 104
    .line 105
    sub-int/2addr v0, v1

    .line 106
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 107
    .line 108
    if-nez v0, :cond_a

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 111
    .line 112
    .line 113
    :cond_a
    return-object p1

    .line 114
    :goto_2
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 115
    .line 116
    sub-int/2addr v0, v1

    .line 117
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 118
    .line 119
    if-nez v0, :cond_b

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 122
    .line 123
    .line 124
    :cond_b
    throw p1
.end method

.method public copy(Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/esotericsoftware/kryo/Serializer;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 125
    :cond_0
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    if-eqz v0, :cond_1

    return-object p1

    .line 126
    :cond_1
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 127
    :try_start_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    if-nez v0, :cond_2

    new-instance v0, Lcom/esotericsoftware/kryo/util/IdentityMap;

    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/IdentityMap;-><init>()V

    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 128
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    invoke-virtual {v0, p1}, Lcom/esotericsoftware/kryo/util/IdentityMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_4

    .line 129
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_3
    return-object v0

    .line 130
    :cond_4
    :try_start_1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyReferences:Z

    if-eqz v0, :cond_5

    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    .line 131
    :cond_5
    instance-of v0, p1, Lcom/esotericsoftware/kryo/KryoCopyable;

    if-eqz v0, :cond_6

    .line 132
    check-cast p1, Lcom/esotericsoftware/kryo/KryoCopyable;

    invoke-interface {p1, p0}, Lcom/esotericsoftware/kryo/KryoCopyable;->copy(Lcom/esotericsoftware/kryo/Kryo;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    .line 133
    :cond_6
    invoke-virtual {p2, p0, p1}, Lcom/esotericsoftware/kryo/Serializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 134
    :goto_1
    iget-object p2, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    if-eqz p2, :cond_7

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 135
    :cond_7
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-nez p2, :cond_8

    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz p2, :cond_9

    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    if-ne p2, v1, :cond_9

    :cond_8
    const-string p2, "Copy"

    const/4 v0, -0x1

    invoke-static {p2, p1, v0}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :cond_9
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    sub-int/2addr p2, v1

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    if-nez p2, :cond_a

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_a
    return-object p1

    :goto_2
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    sub-int/2addr p2, v1

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    if-nez p2, :cond_b

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 137
    :cond_b
    throw p1
.end method

.method public copyShallow(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)TT;"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    add-int/2addr v0, v1

    .line 9
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 10
    .line 11
    iput-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    new-instance v2, Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 19
    .line 20
    invoke-direct {v2}, Lcom/esotericsoftware/kryo/util/IdentityMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Lcom/esotericsoftware/kryo/util/IdentityMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    .line 37
    .line 38
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 39
    .line 40
    sub-int/2addr p1, v1

    .line 41
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object v2

    .line 49
    :cond_3
    :try_start_1
    iget-boolean v2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyReferences:Z

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    .line 54
    .line 55
    :cond_4
    instance-of v2, p1, Lcom/esotericsoftware/kryo/KryoCopyable;

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    check-cast p1, Lcom/esotericsoftware/kryo/KryoCopyable;

    .line 60
    .line 61
    invoke-interface {p1, p0}, Lcom/esotericsoftware/kryo/KryoCopyable;->copy(Lcom/esotericsoftware/kryo/Kryo;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    goto :goto_1

    .line 66
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/Kryo;->getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2, p0, p1}, Lcom/esotericsoftware/kryo/Serializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_1
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    .line 79
    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_6
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 86
    .line 87
    if-nez v2, :cond_7

    .line 88
    .line 89
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 90
    .line 91
    if-eqz v2, :cond_8

    .line 92
    .line 93
    iget v2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 94
    .line 95
    if-ne v2, v1, :cond_8

    .line 96
    .line 97
    :cond_7
    const-string v2, "Shallow copy"

    .line 98
    .line 99
    const/4 v3, -0x1

    .line 100
    invoke-static {v2, p1, v3}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    .line 103
    :cond_8
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    .line 104
    .line 105
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 106
    .line 107
    sub-int/2addr v0, v1

    .line 108
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 109
    .line 110
    if-nez v0, :cond_9

    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 113
    .line 114
    .line 115
    :cond_9
    return-object p1

    .line 116
    :goto_2
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    .line 117
    .line 118
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 119
    .line 120
    sub-int/2addr v0, v1

    .line 121
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 122
    .line 123
    if-nez v0, :cond_a

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 126
    .line 127
    .line 128
    :cond_a
    throw p1
.end method

.method public copyShallow(Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/esotericsoftware/kryo/Serializer;",
            ")TT;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 129
    :cond_0
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 130
    iput-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    const/4 v0, 0x0

    .line 131
    :try_start_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    if-nez v2, :cond_1

    new-instance v2, Lcom/esotericsoftware/kryo/util/IdentityMap;

    invoke-direct {v2}, Lcom/esotericsoftware/kryo/util/IdentityMap;-><init>()V

    iput-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 132
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    invoke-virtual {v2, p1}, Lcom/esotericsoftware/kryo/util/IdentityMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    .line 133
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    .line 134
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_2
    return-object v2

    .line 135
    :cond_3
    :try_start_1
    iget-boolean v2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyReferences:Z

    if-eqz v2, :cond_4

    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    .line 136
    :cond_4
    instance-of v2, p1, Lcom/esotericsoftware/kryo/KryoCopyable;

    if-eqz v2, :cond_5

    .line 137
    check-cast p1, Lcom/esotericsoftware/kryo/KryoCopyable;

    invoke-interface {p1, p0}, Lcom/esotericsoftware/kryo/KryoCopyable;->copy(Lcom/esotericsoftware/kryo/Kryo;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    .line 138
    :cond_5
    invoke-virtual {p2, p0, p1}, Lcom/esotericsoftware/kryo/Serializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 139
    :goto_1
    iget-object p2, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    if-eqz p2, :cond_6

    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 140
    :cond_6
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-nez p2, :cond_7

    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz p2, :cond_8

    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    if-ne p2, v1, :cond_8

    :cond_7
    const-string p2, "Shallow copy"

    const/4 v2, -0x1

    invoke-static {p2, p1, v2}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :cond_8
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    .line 142
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    sub-int/2addr p2, v1

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    if-nez p2, :cond_9

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_9
    return-object p1

    .line 143
    :goto_2
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyShallow:Z

    .line 144
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    sub-int/2addr p2, v1

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    if-nez p2, :cond_a

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 145
    :cond_a
    throw p1
.end method

.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->classLoader:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    return-object p0
.end method

.method public getClassResolver()Lcom/esotericsoftware/kryo/ClassResolver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 2
    .line 3
    return-object p0
.end method

.method public getContext()Lcom/esotericsoftware/kryo/util/ObjectMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->context:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->context:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->context:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 13
    .line 14
    return-object p0
.end method

.method public getDefaultSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;
    .locals 4

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->getDefaultSerializerForAnnotatedType(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializers:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    if-ge v1, v0, :cond_2

    .line 18
    .line 19
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializers:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;

    .line 26
    .line 27
    iget-object v3, v2, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;->type:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    iget-object v3, v2, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;->serializerFactory:Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 36
    .line 37
    invoke-interface {v3, p1}, Lcom/esotericsoftware/kryo/SerializerFactory;->isSupported(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    iget-object v0, v2, Lcom/esotericsoftware/kryo/Kryo$DefaultSerializerEntry;->serializerFactory:Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 44
    .line 45
    invoke-interface {v0, p0, p1}, Lcom/esotericsoftware/kryo/SerializerFactory;->newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->newDefaultSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_3
    const-string p0, "type cannot be null."

    .line 59
    .line 60
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method

.method public getDefaultSerializerForAnnotatedType(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;
    .locals 2

    .line 1
    const-class v0, Lcom/esotericsoftware/kryo/DefaultSerializer;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/esotericsoftware/kryo/DefaultSerializer;

    .line 14
    .line 15
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/DefaultSerializer;->serializerFactory()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/DefaultSerializer;->value()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v1, v0}, Lcom/esotericsoftware/kryo/util/Util;->newFactory(Ljava/lang/Class;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0, p0, p1}, Lcom/esotericsoftware/kryo/SerializerFactory;->newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public getDepth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 2
    .line 3
    return p0
.end method

.method public getGenerics()Lcom/esotericsoftware/kryo/util/Generics;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->generics:Lcom/esotericsoftware/kryo/util/Generics;

    .line 2
    .line 3
    return-object p0
.end method

.method public getGraphContext()Lcom/esotericsoftware/kryo/util/ObjectMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->graphContext:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/ObjectMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->graphContext:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->graphContext:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 13
    .line 14
    return-object p0
.end method

.method public getInstantiatorStrategy()L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->strategy:L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNextRegistrationId()I
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->nextRegisterID:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 7
    .line 8
    invoke-interface {v1, v0}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(I)Lcom/esotericsoftware/kryo/Registration;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p0, Lcom/esotericsoftware/kryo/Kryo;->nextRegisterID:I

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 18
    .line 19
    iput v1, p0, Lcom/esotericsoftware/kryo/Kryo;->nextRegisterID:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance p0, Lcom/esotericsoftware/kryo/KryoException;

    .line 23
    .line 24
    const-string v0, "No registration IDs are available."

    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method

.method public getOriginalToCopyMap()Lcom/esotericsoftware/kryo/util/IdentityMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReferenceResolver()Lcom/esotericsoftware/kryo/ReferenceResolver;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 2
    .line 3
    return-object p0
.end method

.method public getReferences()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 2
    .line 3
    return p0
.end method

.method public getRegistration(I)Lcom/esotericsoftware/kryo/Registration;
    .locals 0

    .line 133
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    invoke-interface {p0, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(I)Lcom/esotericsoftware/kryo/Registration;

    move-result-object p0

    return-object p0
.end method

.method public getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_9

    .line 3
    .line 4
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 5
    .line 6
    invoke-interface {v1, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_8

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->isProxy(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const-class v1, Ljava/lang/reflect/InvocationHandler;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const-class v2, Ljava/lang/Enum;

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    if-eq p1, v2, :cond_3

    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_1

    .line 53
    .line 54
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 55
    .line 56
    invoke-interface {v1, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const-class v2, Ljava/util/EnumSet;

    .line 62
    .line 63
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 70
    .line 71
    invoke-interface {v1, v2}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->isClosure(Ljava/lang/Class;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 83
    .line 84
    const-class v2, Lcom/esotericsoftware/kryo/serializers/ClosureSerializer$Closure;

    .line 85
    .line 86
    invoke-interface {v1, v2}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    :cond_5
    :goto_0
    if-nez v1, :cond_8

    .line 91
    .line 92
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->registrationRequired:Z

    .line 93
    .line 94
    if-nez v1, :cond_7

    .line 95
    .line 96
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->WARN:Z

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->warnUnregisteredClasses:Z

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->unregisteredClassMessage(Ljava/lang/Class;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lcom/esotericsoftware/minlog/Log;->warn(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_6
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 112
    .line 113
    invoke-interface {p0, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->registerImplicit(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_7
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->unregisteredClassMessage(Ljava/lang/Class;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v0

    .line 126
    :cond_8
    return-object v1

    .line 127
    :cond_9
    const-string p0, "type cannot be null."

    .line 128
    .line 129
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v0
.end method

.method public getSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getWarnUnregisteredClasses()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/Kryo;->warnUnregisteredClasses:Z

    .line 2
    .line 3
    return p0
.end method

.method public isClosure(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Class;->isSynthetic()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 v0, 0x2f

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-ltz p1, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    :cond_0
    return p0

    .line 24
    :cond_1
    const-string p1, "type cannot be null."

    .line 25
    .line 26
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return p0
.end method

.method public isFinal(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->getElementClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    return p0

    .line 31
    :cond_1
    const-string p0, "type cannot be null."

    .line 32
    .line 33
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public isProxy(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/reflect/Proxy;->isProxyClass(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    const-string p0, "type cannot be null."

    .line 9
    .line 10
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public isRegistrationRequired()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/esotericsoftware/kryo/Kryo;->registrationRequired:Z

    .line 2
    .line 3
    return p0
.end method

.method public newDefaultSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializer:Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 2
    .line 3
    invoke-interface {v0, p0, p1}, Lcom/esotericsoftware/kryo/SerializerFactory;->newSerializer(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public newInstance(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/Registration;->getInstantiator()L飘花落叶言苏楪子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->newInstantiator(Ljava/lang/Class;)L飘花落叶言苏楪子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/esotericsoftware/kryo/Registration;->setInstantiator(L飘花落叶言苏楪子世哲兰/飘花落叶言子楪世苏哲兰;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-interface {v1}, L飘花落叶言苏楪子世哲兰/飘花落叶言子楪世苏哲兰;->newInstance()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public newInstantiator(Ljava/lang/Class;)L飘花落叶言苏楪子世哲兰/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->strategy:L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-interface {p0, p1}, L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;->newInstantiatorOf(Ljava/lang/Class;)L飘花落叶言苏楪子世哲兰/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public readClass(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->readClass(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1

    .line 34
    :cond_2
    const-string p0, "input cannot be null."

    .line 35
    .line 36
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public readClassAndObject(Lcom/esotericsoftware/kryo/io/Input;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_a

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->readClass(Lcom/esotericsoftware/kryo/io/Input;)Lcom/esotericsoftware/kryo/Registration;

    .line 9
    .line 10
    .line 11
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-nez v2, :cond_1

    .line 13
    .line 14
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 15
    .line 16
    sub-int/2addr p1, v1

    .line 17
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-object v0

    .line 29
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-boolean v3, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 34
    .line 35
    if-eqz v3, :cond_4

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    invoke-virtual {p0, p1, v0, v3}, Lcom/esotericsoftware/kryo/Kryo;->readReferenceOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Z)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/4 v4, -0x1

    .line 43
    if-ne v3, v4, :cond_3

    .line 44
    .line 45
    iget-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 48
    .line 49
    sub-int/2addr v0, v1

    .line 50
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-object p1

    .line 62
    :catchall_0
    move-exception p1

    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :try_start_2
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2, p0, p1, v0}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 73
    .line 74
    iget v2, v2, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 75
    .line 76
    if-ne v3, v2, :cond_5

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2, p0, p1, v0}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    :cond_5
    :goto_0
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 91
    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 95
    .line 96
    if-eqz v2, :cond_7

    .line 97
    .line 98
    iget v2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 99
    .line 100
    if-ne v2, v1, :cond_7

    .line 101
    .line 102
    :cond_6
    const-string v2, "Read"

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    invoke-static {v2, v0, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 109
    .line 110
    .line 111
    :cond_7
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 112
    .line 113
    sub-int/2addr p1, v1

    .line 114
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 115
    .line 116
    if-nez p1, :cond_8

    .line 117
    .line 118
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 119
    .line 120
    if-eqz p1, :cond_8

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 123
    .line 124
    .line 125
    :cond_8
    return-object v0

    .line 126
    :goto_1
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 127
    .line 128
    sub-int/2addr v0, v1

    .line 129
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 130
    .line 131
    if-nez v0, :cond_9

    .line 132
    .line 133
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 134
    .line 135
    if-eqz v0, :cond_9

    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 138
    .line 139
    .line 140
    :cond_9
    throw p1

    .line 141
    :cond_a
    const-string p0, "input cannot be null."

    .line 142
    .line 143
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object v0
.end method

.method public readObject(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_9

    .line 3
    .line 4
    if-eqz p2, :cond_8

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :try_start_0
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/Kryo;->readReferenceOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Z)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, -0x1

    .line 20
    if-ne v1, v2, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 25
    .line 26
    sub-int/2addr p2, v0

    .line 27
    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 28
    .line 29
    if-nez p2, :cond_0

    .line 30
    .line 31
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 32
    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-object p1

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    :try_start_1
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 54
    .line 55
    iget v2, v2, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 56
    .line 57
    if-ne v1, v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    :cond_3
    :goto_0
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 76
    .line 77
    if-nez v1, :cond_4

    .line 78
    .line 79
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    iget v1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 84
    .line 85
    if-ne v1, v0, :cond_5

    .line 86
    .line 87
    :cond_4
    const-string v1, "Read"

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-static {v1, p2, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    :cond_5
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 97
    .line 98
    sub-int/2addr p1, v0

    .line 99
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 100
    .line 101
    if-nez p1, :cond_6

    .line 102
    .line 103
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 104
    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 108
    .line 109
    .line 110
    :cond_6
    return-object p2

    .line 111
    :goto_1
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 112
    .line 113
    sub-int/2addr p2, v0

    .line 114
    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 115
    .line 116
    if-nez p2, :cond_7

    .line 117
    .line 118
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 119
    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 123
    .line 124
    .line 125
    :cond_7
    throw p1

    .line 126
    :cond_8
    const-string p0, "type cannot be null."

    .line 127
    .line 128
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_9
    const-string p0, "input cannot be null."

    .line 133
    .line 134
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v0
.end method

.method public readObject(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/esotericsoftware/kryo/Serializer;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_a

    if-eqz p2, :cond_9

    if-eqz p3, :cond_8

    .line 138
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    const/4 v0, 0x1

    .line 139
    :try_start_0
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    .line 140
    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/Kryo;->readReferenceOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Z)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 141
    iget-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p2, v0

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p2, :cond_0

    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 143
    :cond_1
    :try_start_1
    invoke-virtual {p3, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    .line 144
    iget-object p3, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    iget p3, p3, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    if-ne v1, p3, :cond_3

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    goto :goto_0

    .line 145
    :cond_2
    invoke-virtual {p3, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    .line 146
    :cond_3
    :goto_0
    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-nez p3, :cond_4

    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz p3, :cond_5

    iget p3, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-ne p3, v0, :cond_5

    :cond_4
    const-string p3, "Read"

    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    move-result p1

    invoke-static {p3, p2, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    :cond_5
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p1, :cond_6

    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_6
    return-object p2

    :goto_1
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p2, v0

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p2, :cond_7

    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p2, :cond_7

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 148
    :cond_7
    throw p1

    .line 149
    :cond_8
    const-string p0, "serializer cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-object v0

    .line 150
    :cond_9
    const-string p0, "type cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-object v0

    .line 151
    :cond_a
    const-string p0, "input cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-object v0
.end method

.method public readObjectOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_d

    .line 3
    .line 4
    if-eqz p2, :cond_c

    .line 5
    .line 6
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    :try_start_0
    iget-boolean v2, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    const-string v3, "Read"

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    :try_start_1
    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/Kryo;->readReferenceOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Z)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, -0x1

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    .line 25
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 26
    .line 27
    sub-int/2addr p2, v1

    .line 28
    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 29
    .line 30
    if-nez p2, :cond_0

    .line 31
    .line 32
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 33
    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object p1

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_1
    :try_start_2
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 56
    .line 57
    iget v2, v2, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 58
    .line 59
    if-ne v0, v2, :cond_7

    .line 60
    .line 61
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Lcom/esotericsoftware/kryo/Serializer;->getAcceptsNull()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_6

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->readByte()B

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-nez v4, :cond_6

    .line 84
    .line 85
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 86
    .line 87
    if-nez p2, :cond_3

    .line 88
    .line 89
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 90
    .line 91
    if-eqz p2, :cond_4

    .line 92
    .line 93
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 94
    .line 95
    if-ne p2, v1, :cond_4

    .line 96
    .line 97
    :cond_3
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-static {v3, v0, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    .line 103
    .line 104
    :cond_4
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 105
    .line 106
    sub-int/2addr p1, v1

    .line 107
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 108
    .line 109
    if-nez p1, :cond_5

    .line 110
    .line 111
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 112
    .line 113
    if-eqz p1, :cond_5

    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 116
    .line 117
    .line 118
    :cond_5
    return-object v0

    .line 119
    :cond_6
    :try_start_3
    invoke-virtual {v2, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    :cond_7
    :goto_0
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 124
    .line 125
    if-nez v0, :cond_8

    .line 126
    .line 127
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 128
    .line 129
    if-eqz v0, :cond_9

    .line 130
    .line 131
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 132
    .line 133
    if-ne v0, v1, :cond_9

    .line 134
    .line 135
    :cond_8
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    invoke-static {v3, p2, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    .line 141
    .line 142
    :cond_9
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 143
    .line 144
    sub-int/2addr p1, v1

    .line 145
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 146
    .line 147
    if-nez p1, :cond_a

    .line 148
    .line 149
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 150
    .line 151
    if-eqz p1, :cond_a

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 154
    .line 155
    .line 156
    :cond_a
    return-object p2

    .line 157
    :goto_1
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 158
    .line 159
    sub-int/2addr p2, v1

    .line 160
    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 161
    .line 162
    if-nez p2, :cond_b

    .line 163
    .line 164
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 165
    .line 166
    if-eqz p2, :cond_b

    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 169
    .line 170
    .line 171
    :cond_b
    throw p1

    .line 172
    :cond_c
    const-string p0, "type cannot be null."

    .line 173
    .line 174
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :cond_d
    const-string p0, "input cannot be null."

    .line 179
    .line 180
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-object v0
.end method

.method public readObjectOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/esotericsoftware/kryo/Serializer;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_e

    if-eqz p2, :cond_d

    if-eqz p3, :cond_c

    .line 184
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    const/4 v1, 0x1

    .line 185
    :try_start_0
    iget-boolean v2, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "Read"

    if-eqz v2, :cond_2

    .line 186
    :try_start_1
    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/Kryo;->readReferenceOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Z)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    .line 187
    iget-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 188
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p2, v1

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p2, :cond_0

    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 189
    :cond_1
    :try_start_2
    invoke-virtual {p3, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    .line 190
    iget-object p3, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    iget p3, p3, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    if-ne v0, p3, :cond_7

    invoke-virtual {p0, p2}, Lcom/esotericsoftware/kryo/Kryo;->reference(Ljava/lang/Object;)V

    goto :goto_0

    .line 191
    :cond_2
    invoke-virtual {p3}, Lcom/esotericsoftware/kryo/Serializer;->getAcceptsNull()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->readByte()B

    move-result v2

    if-nez v2, :cond_6

    .line 192
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-nez p2, :cond_3

    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz p2, :cond_4

    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-ne p2, v1, :cond_4

    :cond_3
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    move-result p1

    invoke-static {v3, v0, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    :cond_4
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_5
    return-object v0

    .line 194
    :cond_6
    :try_start_3
    invoke-virtual {p3, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    .line 195
    :cond_7
    :goto_0
    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-nez p3, :cond_8

    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz p3, :cond_9

    iget p3, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-ne p3, v1, :cond_9

    :cond_8
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    move-result p1

    invoke-static {v3, p2, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 196
    :cond_9
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p1, :cond_a

    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p1, :cond_a

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_a
    return-object p2

    :goto_1
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p2, v1

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p2, :cond_b

    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p2, :cond_b

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 197
    :cond_b
    throw p1

    .line 198
    :cond_c
    const-string p0, "serializer cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-object v0

    .line 199
    :cond_d
    const-string p0, "type cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-object v0

    .line 200
    :cond_e
    const-string p0, "input cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-object v0
.end method

.method public readReferenceOrNull(Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;Z)I
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->getWrapperClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 12
    .line 13
    invoke-interface {v0, p2}, Lcom/esotericsoftware/kryo/ReferenceResolver;->useReferences(Ljava/lang/Class;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, -0x1

    .line 18
    const/4 v2, -0x2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz p3, :cond_4

    .line 21
    .line 22
    invoke-virtual {p1, v3}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    if-nez p3, :cond_3

    .line 27
    .line 28
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    if-nez p2, :cond_1

    .line 32
    .line 33
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 34
    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 38
    .line 39
    if-ne p2, v3, :cond_2

    .line 40
    .line 41
    :cond_1
    const-string p2, "Read"

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-static {p2, p3, p1}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    iput-object p3, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;

    .line 51
    .line 52
    return v1

    .line 53
    :cond_3
    if-nez v0, :cond_6

    .line 54
    .line 55
    iget-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 56
    .line 57
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/util/IntArray;->add(I)V

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 61
    .line 62
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 63
    .line 64
    return p0

    .line 65
    :cond_4
    if-nez v0, :cond_5

    .line 66
    .line 67
    iget-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Lcom/esotericsoftware/kryo/util/IntArray;->add(I)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 73
    .line 74
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 75
    .line 76
    return p0

    .line 77
    :cond_5
    invoke-virtual {p1, v3}, Lcom/esotericsoftware/kryo/io/Input;->readVarInt(Z)I

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    :cond_6
    const-string v0, ": "

    .line 82
    .line 83
    const-string v4, "kryo"

    .line 84
    .line 85
    if-ne p3, v3, :cond_9

    .line 86
    .line 87
    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 88
    .line 89
    if-eqz p3, :cond_7

    .line 90
    .line 91
    new-instance p3, Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string v1, "Read: <not null>"

    .line 94
    .line 95
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    invoke-static {v1}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    invoke-static {v4, p3}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_7
    iget-object p3, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 117
    .line 118
    invoke-interface {p3, p2}, Lcom/esotericsoftware/kryo/ReferenceResolver;->nextReadId(Ljava/lang/Class;)I

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 123
    .line 124
    if-eqz v1, :cond_8

    .line 125
    .line 126
    const-string v1, "Read initial reference "

    .line 127
    .line 128
    invoke-static {p3, v1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {v4, p1}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_8
    iget-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 158
    .line 159
    invoke-virtual {p1, p3}, Lcom/esotericsoftware/kryo/util/IntArray;->add(I)V

    .line 160
    .line 161
    .line 162
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 163
    .line 164
    iget p0, p0, Lcom/esotericsoftware/kryo/util/IntArray;->size:I

    .line 165
    .line 166
    return p0

    .line 167
    :cond_9
    add-int/2addr p3, v2

    .line 168
    :try_start_0
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 169
    .line 170
    invoke-interface {v2, p2, p3}, Lcom/esotericsoftware/kryo/ReferenceResolver;->getReadObject(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    iput-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 175
    .line 176
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 177
    .line 178
    if-eqz p2, :cond_a

    .line 179
    .line 180
    const-string p2, "Read reference "

    .line 181
    .line 182
    invoke-static {p3, p2, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;

    .line 187
    .line 188
    invoke-static {p0}, Lcom/esotericsoftware/kryo/util/Util;->string(Ljava/lang/Object;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Input;->position()I

    .line 196
    .line 197
    .line 198
    move-result p0

    .line 199
    invoke-static {p0}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {v4, p0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_a
    return v1

    .line 214
    :catch_0
    move-exception p0

    .line 215
    new-instance p1, Lcom/esotericsoftware/kryo/KryoException;

    .line 216
    .line 217
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v1, "Unable to resolve reference for "

    .line 224
    .line 225
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string p2, " with id: "

    .line 232
    .line 233
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p2

    .line 243
    invoke-direct {p1, p2, p0}, Lcom/esotericsoftware/kryo/KryoException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    throw p1
.end method

.method public reference(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 2
    .line 3
    if-lez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 12
    .line 13
    invoke-virtual {v1, v0, p1}, Lcom/esotericsoftware/kryo/util/ObjectMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->needsCopyReference:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "object cannot be null."

    .line 21
    .line 22
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->readReferenceIds:Lcom/esotericsoftware/kryo/util/IntArray;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/util/IntArray;->pop()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, -0x2

    .line 39
    if-eq v0, v1, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 42
    .line 43
    invoke-interface {p0, v0, p1}, Lcom/esotericsoftware/kryo/ReferenceResolver;->setReadObject(ILjava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public register(Lcom/esotericsoftware/kryo/Registration;)Lcom/esotericsoftware/kryo/Registration;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Lcom/esotericsoftware/kryo/ClassResolver;->unregister(I)Lcom/esotericsoftware/kryo/Registration;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/Registration;->getType()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eq v1, v2, :cond_0

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "Registration overwritten: "

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, " -> "

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "kryo"

    .line 52
    .line 53
    invoke-static {v1, v0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 57
    .line 58
    invoke-interface {p0, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->register(Lcom/esotericsoftware/kryo/Registration;)Lcom/esotericsoftware/kryo/Registration;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_1
    const-string p0, "id must be > 0: "

    .line 64
    .line 65
    invoke-static {v0, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public register(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    invoke-interface {v0, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 84
    :cond_0
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->getDefaultSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;

    move-result-object p0

    return-object p0
.end method

.method public register(Ljava/lang/Class;I)Lcom/esotericsoftware/kryo/Registration;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    invoke-interface {v0, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 75
    :cond_0
    invoke-virtual {p0, p1}, Lcom/esotericsoftware/kryo/Kryo;->getDefaultSerializer(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Serializer;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/esotericsoftware/kryo/Kryo;->register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;I)Lcom/esotericsoftware/kryo/Registration;

    move-result-object p0

    return-object p0
.end method

.method public register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;)Lcom/esotericsoftware/kryo/Registration;
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    invoke-interface {v0, p1}, Lcom/esotericsoftware/kryo/ClassResolver;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {v0, p2}, Lcom/esotericsoftware/kryo/Registration;->setSerializer(Lcom/esotericsoftware/kryo/Serializer;)V

    return-object v0

    .line 78
    :cond_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    new-instance v1, Lcom/esotericsoftware/kryo/Registration;

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->getNextRegistrationId()I

    move-result p0

    invoke-direct {v1, p1, p2, p0}, Lcom/esotericsoftware/kryo/Registration;-><init>(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;I)V

    invoke-interface {v0, v1}, Lcom/esotericsoftware/kryo/ClassResolver;->register(Lcom/esotericsoftware/kryo/Registration;)Lcom/esotericsoftware/kryo/Registration;

    move-result-object p0

    return-object p0
.end method

.method public register(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;I)Lcom/esotericsoftware/kryo/Registration;
    .locals 1

    if-ltz p3, :cond_0

    .line 79
    new-instance v0, Lcom/esotericsoftware/kryo/Registration;

    invoke-direct {v0, p1, p2, p3}, Lcom/esotericsoftware/kryo/Registration;-><init>(Ljava/lang/Class;Lcom/esotericsoftware/kryo/Serializer;I)V

    invoke-virtual {p0, v0}, Lcom/esotericsoftware/kryo/Kryo;->register(Lcom/esotericsoftware/kryo/Registration;)Lcom/esotericsoftware/kryo/Registration;

    move-result-object p0

    return-object p0

    .line 80
    :cond_0
    const-string p0, "id must be >= 0: "

    .line 81
    invoke-static {p3, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 82
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public reset()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->graphContext:Lcom/esotericsoftware/kryo/util/ObjectMap;

    .line 5
    .line 6
    const/16 v2, 0x800

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lcom/esotericsoftware/kryo/util/ObjectMap;->clear(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 14
    .line 15
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/ClassResolver;->reset()V

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/esotericsoftware/kryo/ReferenceResolver;->reset()V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    iput-object v1, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;

    .line 29
    .line 30
    :cond_1
    iput v0, p0, Lcom/esotericsoftware/kryo/Kryo;->copyDepth:I

    .line 31
    .line 32
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->originalToCopy:Lcom/esotericsoftware/kryo/util/IdentityMap;

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lcom/esotericsoftware/kryo/util/ObjectMap;->clear(I)V

    .line 37
    .line 38
    .line 39
    :cond_2
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 40
    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    const-string p0, "kryo"

    .line 44
    .line 45
    const-string v0, "Object graph complete."

    .line 46
    .line 47
    invoke-static {p0, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_3
    return-void
.end method

.method public setAutoReset(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 2
    .line 3
    return-void
.end method

.method public setClassLoader(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->classLoader:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "classLoader cannot be null."

    .line 7
    .line 8
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setCopyReferences(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->copyReferences:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDefaultSerializer(Lcom/esotericsoftware/kryo/SerializerFactory;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 17
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializer:Lcom/esotericsoftware/kryo/SerializerFactory;

    return-void

    .line 18
    :cond_0
    const-string p0, "serializer cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public setDefaultSerializer(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/esotericsoftware/kryo/Serializer;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lcom/esotericsoftware/kryo/SerializerFactory$ReflectionSerializerFactory;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/esotericsoftware/kryo/SerializerFactory$ReflectionSerializerFactory;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->defaultSerializer:Lcom/esotericsoftware/kryo/SerializerFactory;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "serializer cannot be null."

    .line 12
    .line 13
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setInstantiatorStrategy(L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->strategy:L飘花落叶言苏楪子世兰哲/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-void
.end method

.method public setMaxDepth(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->maxDepth:I

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "maxDepth must be > 0."

    .line 7
    .line 8
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setOptimizedGenerics(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Lcom/esotericsoftware/kryo/util/DefaultGenerics;

    .line 4
    .line 5
    invoke-direct {p1, p0}, Lcom/esotericsoftware/kryo/util/DefaultGenerics;-><init>(Lcom/esotericsoftware/kryo/Kryo;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Lcom/esotericsoftware/kryo/util/NoGenerics;->INSTANCE:Lcom/esotericsoftware/kryo/util/Generics;

    .line 10
    .line 11
    :goto_0
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->generics:Lcom/esotericsoftware/kryo/util/Generics;

    .line 12
    .line 13
    return-void
.end method

.method public setReferenceResolver(Lcom/esotericsoftware/kryo/ReferenceResolver;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 5
    .line 6
    iput-object p1, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 7
    .line 8
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string p1, "Reference resolver: "

    .line 21
    .line 22
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "kryo"

    .line 27
    .line 28
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    const-string p0, "referenceResolver cannot be null."

    .line 33
    .line 34
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public setReferences(Z)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/esotericsoftware/kryo/ReferenceResolver;->reset()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->readObject:Ljava/lang/Object;

    .line 15
    .line 16
    :cond_1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    new-instance v0, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/util/MapReferenceResolver;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 30
    .line 31
    :cond_2
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 32
    .line 33
    if-eqz p0, :cond_3

    .line 34
    .line 35
    new-instance p0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v0, "References: "

    .line 38
    .line 39
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "kryo"

    .line 50
    .line 51
    invoke-static {v0, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    xor-int/lit8 p0, p1, 0x1

    .line 55
    .line 56
    return p0
.end method

.method public setRegistrationRequired(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->registrationRequired:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "Registration required: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public setWarnUnregisteredClasses(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->warnUnregisteredClasses:Z

    .line 2
    .line 3
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "Warn unregistered classes: "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "kryo"

    .line 22
    .line 23
    invoke-static {p1, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public unregisteredClassMessage(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v0, "Class is not registered: "

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->className(Ljava/lang/Class;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v0, "\nNote: To register this class use: kryo.register("

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->canonicalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, ".class);"

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/esotericsoftware/kryo/Kryo;->classResolver:Lcom/esotericsoftware/kryo/ClassResolver;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/esotericsoftware/kryo/ClassResolver;->writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object p1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 23
    .line 24
    if-nez p2, :cond_1

    .line 25
    .line 26
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 31
    .line 32
    .line 33
    :cond_1
    throw p1

    .line 34
    :cond_2
    const-string p0, "output cannot be null."

    .line 35
    .line 36
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public writeClassAndObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/Kryo;->writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 14
    .line 15
    sub-int/2addr p1, v0

    .line 16
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 17
    .line 18
    if-nez p1, :cond_4

    .line 19
    .line 20
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 21
    .line 22
    if-eqz p1, :cond_4

    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p0, p1, v1}, Lcom/esotericsoftware/kryo/Kryo;->writeClass(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-boolean v2, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-virtual {p0, p1, p2, v2}, Lcom/esotericsoftware/kryo/Kryo;->writeReferenceOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 50
    .line 51
    sub-int/2addr p1, v0

    .line 52
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 53
    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    :try_start_2
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 65
    .line 66
    if-nez v2, :cond_2

    .line 67
    .line 68
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    iget v2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 73
    .line 74
    if-ne v2, v0, :cond_3

    .line 75
    .line 76
    :cond_2
    const-string v2, "Write"

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-static {v2, p2, v3}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 83
    .line 84
    .line 85
    :cond_3
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    .line 91
    .line 92
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 93
    .line 94
    sub-int/2addr p1, v0

    .line 95
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 96
    .line 97
    if-nez p1, :cond_4

    .line 98
    .line 99
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 100
    .line 101
    if-eqz p1, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 104
    .line 105
    .line 106
    :cond_4
    return-void

    .line 107
    :goto_0
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 108
    .line 109
    sub-int/2addr p2, v0

    .line 110
    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 111
    .line 112
    if-nez p2, :cond_5

    .line 113
    .line 114
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 115
    .line 116
    if-eqz p2, :cond_5

    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 119
    .line 120
    .line 121
    :cond_5
    throw p1

    .line 122
    :cond_6
    const-string p0, "output cannot be null."

    .line 123
    .line 124
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public writeObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    if-eqz p2, :cond_5

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :try_start_0
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/Kryo;->writeReferenceOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 21
    .line 22
    sub-int/2addr p1, v0

    .line 23
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 24
    .line 25
    if-nez p1, :cond_3

    .line 26
    .line 27
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 28
    .line 29
    if-eqz p1, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    :try_start_1
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    iget v1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 46
    .line 47
    if-ne v1, v0, :cond_2

    .line 48
    .line 49
    :cond_1
    const-string v1, "Write"

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-static {v1, p2, v2}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p0, v1}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 74
    .line 75
    sub-int/2addr p1, v0

    .line 76
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 77
    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 81
    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 85
    .line 86
    .line 87
    :cond_3
    return-void

    .line 88
    :goto_0
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 89
    .line 90
    sub-int/2addr p2, v0

    .line 91
    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 92
    .line 93
    if-nez p2, :cond_4

    .line 94
    .line 95
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 96
    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 100
    .line 101
    .line 102
    :cond_4
    throw p1

    .line 103
    :cond_5
    const-string p0, "object cannot be null."

    .line 104
    .line 105
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_6
    const-string p0, "output cannot be null."

    .line 110
    .line 111
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public writeObject(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 3

    if-eqz p1, :cond_7

    if-eqz p2, :cond_6

    if-eqz p3, :cond_5

    .line 115
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    const/4 v0, 0x1

    .line 116
    :try_start_0
    iget-boolean v1, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/Kryo;->writeReferenceOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Z)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 117
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 118
    :cond_0
    :try_start_1
    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-nez v1, :cond_1

    sget-boolean v1, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-ne v1, v0, :cond_2

    :cond_1
    const-string v1, "Write"

    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    move-result v2

    invoke-static {v1, p2, v2}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 119
    :cond_2
    invoke-virtual {p3, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p1, v0

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p1, :cond_3

    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_3
    return-void

    :goto_0
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p2, v0

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p2, :cond_4

    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 121
    :cond_4
    throw p1

    .line 122
    :cond_5
    const-string p0, "serializer cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void

    .line 123
    :cond_6
    const-string p0, "object cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void

    .line 124
    :cond_7
    const-string p0, "output cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public writeObjectOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Lcom/esotericsoftware/kryo/Serializer;)V
    .locals 5

    .line 1
    const-string v0, "Write: <not null>"

    .line 2
    .line 3
    if-eqz p1, :cond_b

    .line 4
    .line 5
    if-eqz p3, :cond_a

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    :try_start_0
    iget-boolean v2, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    const-string v3, "Write"

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/Kryo;->writeReferenceOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    if-eqz v0, :cond_5

    .line 22
    .line 23
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 24
    .line 25
    sub-int/2addr p1, v1

    .line 26
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 27
    .line 28
    if-nez p1, :cond_8

    .line 29
    .line 30
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 31
    .line 32
    if-eqz p1, :cond_8

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_0
    :try_start_2
    invoke-virtual {p3}, Lcom/esotericsoftware/kryo/Serializer;->getAcceptsNull()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_5

    .line 46
    .line 47
    if-nez p2, :cond_3

    .line 48
    .line 49
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 50
    .line 51
    if-nez p2, :cond_1

    .line 52
    .line 53
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 54
    .line 55
    if-eqz p2, :cond_2

    .line 56
    .line 57
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 58
    .line 59
    if-ne p2, v1, :cond_2

    .line 60
    .line 61
    :cond_1
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    const/4 p3, 0x0

    .line 66
    invoke-static {v3, p3, p2}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    :cond_2
    const/4 p2, 0x0

    .line 70
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    .line 72
    .line 73
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 74
    .line 75
    sub-int/2addr p1, v1

    .line 76
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 77
    .line 78
    if-nez p1, :cond_8

    .line 79
    .line 80
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 81
    .line 82
    if-eqz p1, :cond_8

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    :try_start_3
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 89
    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    const-string v2, "kryo"

    .line 93
    .line 94
    new-instance v4, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v2, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    invoke-virtual {p1, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 118
    .line 119
    .line 120
    :cond_5
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 121
    .line 122
    if-nez v0, :cond_6

    .line 123
    .line 124
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 125
    .line 126
    if-eqz v0, :cond_7

    .line 127
    .line 128
    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 129
    .line 130
    if-ne v0, v1, :cond_7

    .line 131
    .line 132
    :cond_6
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    invoke-static {v3, p2, v0}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    :cond_7
    invoke-virtual {p3, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 140
    .line 141
    .line 142
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 143
    .line 144
    sub-int/2addr p1, v1

    .line 145
    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 146
    .line 147
    if-nez p1, :cond_8

    .line 148
    .line 149
    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 150
    .line 151
    if-eqz p1, :cond_8

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 154
    .line 155
    .line 156
    :cond_8
    return-void

    .line 157
    :goto_0
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 158
    .line 159
    sub-int/2addr p2, v1

    .line 160
    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 161
    .line 162
    if-nez p2, :cond_9

    .line 163
    .line 164
    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    .line 165
    .line 166
    if-eqz p2, :cond_9

    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 169
    .line 170
    .line 171
    :cond_9
    throw p1

    .line 172
    :cond_a
    const-string p0, "serializer cannot be null."

    .line 173
    .line 174
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_b
    const-string p0, "output cannot be null."

    .line 179
    .line 180
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public writeObjectOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Ljava/lang/Class;)V
    .locals 5

    .line 184
    const-string v0, "Write: <not null>"

    if-eqz p1, :cond_a

    .line 185
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Kryo;->beginObject()V

    const/4 v1, 0x1

    .line 186
    :try_start_0
    invoke-virtual {p0, p3}, Lcom/esotericsoftware/kryo/Kryo;->getRegistration(Ljava/lang/Class;)Lcom/esotericsoftware/kryo/Registration;

    move-result-object p3

    invoke-virtual {p3}, Lcom/esotericsoftware/kryo/Registration;->getSerializer()Lcom/esotericsoftware/kryo/Serializer;

    move-result-object p3

    .line 187
    iget-boolean v2, p0, Lcom/esotericsoftware/kryo/Kryo;->references:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "Write"

    if-eqz v2, :cond_0

    .line 188
    :try_start_1
    invoke-virtual {p0, p1, p2, v1}, Lcom/esotericsoftware/kryo/Kryo;->writeReferenceOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Z)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_5

    .line 189
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p1, :cond_8

    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_0

    .line 190
    :cond_0
    :try_start_2
    invoke-virtual {p3}, Lcom/esotericsoftware/kryo/Serializer;->getAcceptsNull()Z

    move-result v2

    if-nez v2, :cond_5

    if-nez p2, :cond_3

    .line 191
    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-nez p3, :cond_1

    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz p3, :cond_2

    iget p3, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-ne p3, v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    move-result p3

    invoke-static {v3, p2, p3}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    :cond_2
    const/4 p2, 0x0

    .line 192
    invoke-virtual {p1, p2}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p1, :cond_8

    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    return-void

    .line 194
    :cond_3
    :try_start_3
    sget-boolean v2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-eqz v2, :cond_4

    const-string v2, "kryo"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    move-result v0

    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    :cond_4
    invoke-virtual {p1, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 196
    :cond_5
    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    if-nez v0, :cond_6

    sget-boolean v0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    if-eqz v0, :cond_7

    iget v0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-ne v0, v1, :cond_7

    :cond_6
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    move-result v0

    invoke-static {v3, p2, v0}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 197
    :cond_7
    invoke-virtual {p3, p0, p1, p2}, Lcom/esotericsoftware/kryo/Serializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 198
    iget p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p1, v1

    iput p1, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p1, :cond_8

    iget-boolean p1, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    :cond_8
    return-void

    :goto_0
    iget p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    sub-int/2addr p2, v1

    iput p2, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    if-nez p2, :cond_9

    iget-boolean p2, p0, Lcom/esotericsoftware/kryo/Kryo;->autoReset:Z

    if-eqz p2, :cond_9

    invoke-virtual {p0}, Lcom/esotericsoftware/kryo/Kryo;->reset()V

    .line 199
    :cond_9
    throw p1

    .line 200
    :cond_a
    const-string p0, "output cannot be null."

    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method

.method public writeReferenceOrNull(Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;Z)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-nez p2, :cond_2

    .line 4
    .line 5
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-boolean p2, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    iget p0, p0, Lcom/esotericsoftware/kryo/Kryo;->depth:I

    .line 14
    .line 15
    if-ne p0, v1, :cond_1

    .line 16
    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const-string p3, "Write"

    .line 23
    .line 24
    invoke-static {p3, p0, p2}, Lcom/esotericsoftware/kryo/util/Util;->log(Ljava/lang/String;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-virtual {p1, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 28
    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    iget-object v2, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v2, v3}, Lcom/esotericsoftware/kryo/ReferenceResolver;->useReferences(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const-string v3, "Write: <not null>"

    .line 42
    .line 43
    const-string v4, "kryo"

    .line 44
    .line 45
    if-nez v2, :cond_5

    .line 46
    .line 47
    if-eqz p3, :cond_4

    .line 48
    .line 49
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 50
    .line 51
    if-eqz p0, :cond_3

    .line 52
    .line 53
    new-instance p0, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {v4, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-virtual {p1, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 77
    .line 78
    .line 79
    :cond_4
    return v0

    .line 80
    :cond_5
    iget-object p3, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 81
    .line 82
    invoke-interface {p3, p2}, Lcom/esotericsoftware/kryo/ReferenceResolver;->getWrittenId(Ljava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    const/4 v2, -0x1

    .line 87
    const-string v5, ": "

    .line 88
    .line 89
    if-eq p3, v2, :cond_7

    .line 90
    .line 91
    sget-boolean p0, Lcom/esotericsoftware/minlog/Log;->DEBUG:Z

    .line 92
    .line 93
    if-eqz p0, :cond_6

    .line 94
    .line 95
    const-string p0, "Write reference "

    .line 96
    .line 97
    invoke-static {p3, p0, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->string(Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {v4, p0}, Lcom/esotericsoftware/minlog/Log;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    add-int/lit8 p3, p3, 0x2

    .line 127
    .line 128
    invoke-virtual {p1, p3, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeVarInt(IZ)I

    .line 129
    .line 130
    .line 131
    return v1

    .line 132
    :cond_7
    iget-object p0, p0, Lcom/esotericsoftware/kryo/Kryo;->referenceResolver:Lcom/esotericsoftware/kryo/ReferenceResolver;

    .line 133
    .line 134
    invoke-interface {p0, p2}, Lcom/esotericsoftware/kryo/ReferenceResolver;->addWrittenObject(Ljava/lang/Object;)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 139
    .line 140
    if-eqz p3, :cond_8

    .line 141
    .line 142
    new-instance p3, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-static {v2}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    invoke-static {v4, p3}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_8
    invoke-virtual {p1, v1}, Lcom/esotericsoftware/kryo/io/Output;->writeByte(B)V

    .line 166
    .line 167
    .line 168
    sget-boolean p3, Lcom/esotericsoftware/minlog/Log;->TRACE:Z

    .line 169
    .line 170
    if-eqz p3, :cond_9

    .line 171
    .line 172
    const-string p3, "Write initial reference "

    .line 173
    .line 174
    invoke-static {p0, p3, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {p2}, Lcom/esotericsoftware/kryo/util/Util;->string(Ljava/lang/Object;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/esotericsoftware/kryo/io/Output;->position()I

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    invoke-static {p1}, Lcom/esotericsoftware/kryo/util/Util;->pos(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {v4, p0}, Lcom/esotericsoftware/minlog/Log;->trace(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    :cond_9
    return v0
.end method
