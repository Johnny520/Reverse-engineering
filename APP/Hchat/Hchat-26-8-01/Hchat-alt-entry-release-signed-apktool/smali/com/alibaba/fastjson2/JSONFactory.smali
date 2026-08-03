.class public final Lcom/alibaba/fastjson2/JSONFactory;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/JSONFactory$FJ1OjbectBuilder;,
        Lcom/alibaba/fastjson2/JSONFactory$FJ1ObjectInnerSupplier;,
        Lcom/alibaba/fastjson2/JSONFactory$CacheItem;,
        Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;
    }
.end annotation


# static fields
.field static final ARRAY_READER:Lcom/alibaba/fastjson2/reader/ObjectReader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "Lcom/alibaba/fastjson2/JSONArray;",
            ">;"
        }
    .end annotation
.end field

.field static final BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/alibaba/fastjson2/JSONFactory$CacheItem;",
            "[B>;"
        }
    .end annotation
.end field

.field static final CA:[C

.field static final CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

.field static final CACHE_THRESHOLD:I = 0x100000

.field static final CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/alibaba/fastjson2/JSONFactory$CacheItem;",
            "[C>;"
        }
    .end annotation
.end field

.field static final DIGITS2:[I

.field static final DOUBLE_10_POW:[D

.field static final DOUBLE_ZERO:Ljava/lang/Double;

.field static final FLOAT_10_POW:[F

.field static final HIGH:Ljava/math/BigDecimal;

.field static final HIGH_BIGINT:Ljava/math/BigInteger;

.field static JSON_ARRAY_1x_SUPPLIER:Ljava/util/function/Supplier; = null

.field static JSON_ARRAY_CLASS_1x:Ljava/lang/Class; = null

.field static JSON_OBJECT_1x_BUILDER:Ljava/util/function/Function; = null

.field static JSON_OBJECT_1x_INNER_MAP:Ljava/util/function/Function; = null

.field static JSON_OBJECT_1x_SUPPLIER:Ljava/util/function/Supplier; = null

.field static JSON_OBJECT_CLASS_1x:Ljava/lang/Class; = null

.field static volatile JSON_REFLECT_1x_ERROR:Z = false

.field static final LOW:Ljava/math/BigDecimal;

.field static final LOW_BIGINT:Ljava/math/BigInteger;

.field static final NAME_CACHE:[Lcom/alibaba/fastjson2/util/NameCacheEntry;

.field static final NAME_CACHE2:[Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

.field static final OBJECT_READER:Lcom/alibaba/fastjson2/reader/ObjectReader;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "Lcom/alibaba/fastjson2/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field static final UUID_LOOKUP:[C

.field static final UUID_VALUES:[B

.field static defaultArraySupplier:Ljava/util/function/Supplier; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Supplier<",
            "Ljava/util/List;",
            ">;"
        }
    .end annotation
.end field

.field static defaultDecimalMaxScale:I = 0x800

.field public static final defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

.field static defaultObjectSupplier:Ljava/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Supplier<",
            "Ljava/util/Map;",
            ">;"
        }
    .end annotation
.end field

.field public static final defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

.field static defaultReaderFeatures:J

.field static defaultReaderFormat:Ljava/lang/String;

.field static defaultReaderZoneId:Ljava/time/ZoneId;

.field static defaultWriterFeatures:J

.field static defaultWriterFormat:Ljava/lang/String;

.field static defaultWriterZoneId:Ljava/time/ZoneId;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    new-array v1, v0, [Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 4
    .line 5
    sput-object v1, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE:[Lcom/alibaba/fastjson2/util/NameCacheEntry;

    .line 6
    .line 7
    new-array v0, v0, [Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 8
    .line 9
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->NAME_CACHE2:[Lcom/alibaba/fastjson2/JSONFactory$NameCacheEntry2;

    .line 10
    .line 11
    const-wide v0, -0x1fffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sput-object v2, Lcom/alibaba/fastjson2/JSONFactory;->LOW:Ljava/math/BigDecimal;

    .line 21
    .line 22
    const-wide v2, 0x1fffffffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sput-object v4, Lcom/alibaba/fastjson2/JSONFactory;->HIGH:Ljava/math/BigDecimal;

    .line 32
    .line 33
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->LOW_BIGINT:Ljava/math/BigInteger;

    .line 38
    .line 39
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->HIGH_BIGINT:Ljava/math/BigInteger;

    .line 44
    .line 45
    const/16 v0, 0x40

    .line 46
    .line 47
    new-array v0, v0, [C

    .line 48
    .line 49
    fill-array-data v0, :array_0

    .line 50
    .line 51
    .line 52
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CA:[C

    .line 53
    .line 54
    const/16 v0, 0x67

    .line 55
    .line 56
    new-array v0, v0, [I

    .line 57
    .line 58
    fill-array-data v0, :array_1

    .line 59
    .line 60
    .line 61
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->DIGITS2:[I

    .line 62
    .line 63
    const/16 v0, 0xb

    .line 64
    .line 65
    new-array v0, v0, [F

    .line 66
    .line 67
    fill-array-data v0, :array_2

    .line 68
    .line 69
    .line 70
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->FLOAT_10_POW:[F

    .line 71
    .line 72
    const/16 v0, 0x17

    .line 73
    .line 74
    new-array v0, v0, [D

    .line 75
    .line 76
    fill-array-data v0, :array_3

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->DOUBLE_10_POW:[D

    .line 80
    .line 81
    const-wide/16 v0, 0x0

    .line 82
    .line 83
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->DOUBLE_ZERO:Ljava/lang/Double;

    .line 88
    .line 89
    const/16 v0, 0x10

    .line 90
    .line 91
    new-array v1, v0, [Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    move v3, v2

    .line 95
    :goto_0
    if-ge v3, v0, :cond_0

    .line 96
    .line 97
    new-instance v4, Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 98
    .line 99
    invoke-direct {v4}, Lcom/alibaba/fastjson2/JSONFactory$CacheItem;-><init>()V

    .line 100
    .line 101
    .line 102
    aput-object v4, v1, v3

    .line 103
    .line 104
    add-int/lit8 v3, v3, 0x1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    sput-object v1, Lcom/alibaba/fastjson2/JSONFactory;->CACHE_ITEMS:[Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 108
    .line 109
    const-class v0, [C

    .line 110
    .line 111
    const-string v1, "chars"

    .line 112
    .line 113
    const-class v3, Lcom/alibaba/fastjson2/JSONFactory$CacheItem;

    .line 114
    .line 115
    invoke-static {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 120
    .line 121
    const-class v0, [B

    .line 122
    .line 123
    const-string v1, "bytes"

    .line 124
    .line 125
    invoke-static {v3, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->BYTES_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 130
    .line 131
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 132
    .line 133
    invoke-direct {v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;-><init>()V

    .line 134
    .line 135
    .line 136
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 137
    .line 138
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 139
    .line 140
    invoke-direct {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;-><init>()V

    .line 141
    .line 142
    .line 143
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 144
    .line 145
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;->JSON_ARRAY_READER:Lcom/alibaba/fastjson2/reader/ObjectReaderImplList;

    .line 146
    .line 147
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->ARRAY_READER:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 148
    .line 149
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->INSTANCE_OBJECT:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 150
    .line 151
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->OBJECT_READER:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 152
    .line 153
    const/16 v0, 0x100

    .line 154
    .line 155
    new-array v1, v0, [C

    .line 156
    .line 157
    sput-object v1, Lcom/alibaba/fastjson2/JSONFactory;->UUID_LOOKUP:[C

    .line 158
    .line 159
    const/16 v1, 0x37

    .line 160
    .line 161
    new-array v1, v1, [B

    .line 162
    .line 163
    sput-object v1, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 164
    .line 165
    :goto_1
    if-ge v2, v0, :cond_3

    .line 166
    .line 167
    shr-int/lit8 v1, v2, 0x4

    .line 168
    .line 169
    and-int/lit8 v1, v1, 0xf

    .line 170
    .line 171
    and-int/lit8 v3, v2, 0xf

    .line 172
    .line 173
    sget-object v4, Lcom/alibaba/fastjson2/JSONFactory;->UUID_LOOKUP:[C

    .line 174
    .line 175
    const/16 v5, 0xa

    .line 176
    .line 177
    if-ge v1, v5, :cond_1

    .line 178
    .line 179
    add-int/lit8 v1, v1, 0x30

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_1
    add-int/lit8 v1, v1, 0x57

    .line 183
    .line 184
    :goto_2
    shl-int/lit8 v1, v1, 0x8

    .line 185
    .line 186
    if-ge v3, v5, :cond_2

    .line 187
    .line 188
    add-int/lit8 v3, v3, 0x30

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_2
    add-int/lit8 v3, v3, 0x57

    .line 192
    .line 193
    :goto_3
    add-int/2addr v1, v3

    .line 194
    int-to-char v1, v1

    .line 195
    aput-char v1, v4, v2

    .line 196
    .line 197
    add-int/lit8 v2, v2, 0x1

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_3
    const/16 v0, 0x30

    .line 201
    .line 202
    :goto_4
    const/16 v1, 0x39

    .line 203
    .line 204
    if-gt v0, v1, :cond_4

    .line 205
    .line 206
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 207
    .line 208
    add-int/lit8 v2, v0, -0x30

    .line 209
    .line 210
    int-to-byte v3, v2

    .line 211
    aput-byte v3, v1, v2

    .line 212
    .line 213
    add-int/lit8 v0, v0, 0x1

    .line 214
    .line 215
    int-to-char v0, v0

    .line 216
    goto :goto_4

    .line 217
    :cond_4
    const/16 v0, 0x61

    .line 218
    .line 219
    :goto_5
    const/16 v1, 0x66

    .line 220
    .line 221
    if-gt v0, v1, :cond_5

    .line 222
    .line 223
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 224
    .line 225
    add-int/lit8 v2, v0, -0x30

    .line 226
    .line 227
    add-int/lit8 v3, v0, -0x57

    .line 228
    .line 229
    int-to-byte v3, v3

    .line 230
    aput-byte v3, v1, v2

    .line 231
    .line 232
    add-int/lit8 v0, v0, 0x1

    .line 233
    .line 234
    int-to-char v0, v0

    .line 235
    goto :goto_5

    .line 236
    :cond_5
    const/16 v0, 0x41

    .line 237
    .line 238
    :goto_6
    const/16 v1, 0x46

    .line 239
    .line 240
    if-gt v0, v1, :cond_6

    .line 241
    .line 242
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->UUID_VALUES:[B

    .line 243
    .line 244
    add-int/lit8 v2, v0, -0x30

    .line 245
    .line 246
    add-int/lit8 v3, v0, -0x37

    .line 247
    .line 248
    int-to-byte v3, v3

    .line 249
    aput-byte v3, v1, v2

    .line 250
    .line 251
    add-int/lit8 v0, v0, 0x1

    .line 252
    .line 253
    int-to-char v0, v0

    .line 254
    goto :goto_6

    .line 255
    :cond_6
    return-void

    .line 256
    nop

    .line 257
    :array_0
    .array-data 2
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x2bs
        0x2fs
    .end array-data

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x41200000    # 10.0f
        0x42c80000    # 100.0f
        0x447a0000    # 1000.0f
        0x461c4000    # 10000.0f
        0x47c35000    # 100000.0f
        0x49742400    # 1000000.0f
        0x4b189680    # 1.0E7f
        0x4cbebc20    # 1.0E8f
        0x4e6e6b28    # 1.0E9f
        0x501502f9    # 1.0E10f
    .end array-data

    :array_3
    .array-data 8
        0x3ff0000000000000L    # 1.0
        0x4024000000000000L    # 10.0
        0x4059000000000000L    # 100.0
        0x408f400000000000L    # 1000.0
        0x40c3880000000000L    # 10000.0
        0x40f86a0000000000L    # 100000.0
        0x412e848000000000L    # 1000000.0
        0x416312d000000000L    # 1.0E7
        0x4197d78400000000L    # 1.0E8
        0x41cdcd6500000000L    # 1.0E9
        0x4202a05f20000000L    # 1.0E10
        0x42374876e8000000L    # 1.0E11
        0x426d1a94a2000000L    # 1.0E12
        0x42a2309ce5400000L    # 1.0E13
        0x42d6bcc41e900000L    # 1.0E14
        0x430c6bf526340000L    # 1.0E15
        0x4341c37937e08000L    # 1.0E16
        0x4376345785d8a000L    # 1.0E17
        0x43abc16d674ec800L    # 1.0E18
        0x43e158e460913d00L    # 1.0E19
        0x4415af1d78b58c40L    # 1.0E20
        0x444b1ae4d6e2ef50L    # 1.0E21
        0x4480f0cf064dd592L    # 1.0E22
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static createJSONObject1(Ljava/util/Map;)Ljava/util/Map;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson/JSONObject;-><init>(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2

    .line 33
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    return-object v0
.end method

.method public static createReadContext(J)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2

    .line 18
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1, p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;J)V

    return-object v0
.end method

.method public static createReadContext(Lcom/alibaba/fastjson2/SymbolTable;)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2

    .line 27
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;)V

    return-object v0
.end method

.method public static varargs createReadContext(Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2

    .line 28
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;)V

    .line 29
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    return-object v0
.end method

.method public static varargs createReadContext(Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2

    .line 20
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 21
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader$Context;->config(Lcom/alibaba/fastjson2/filter/Filter;)V

    return-object v0
.end method

.method public static varargs createReadContext(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 1

    if-nez p0, :cond_0

    .line 24
    sget-object p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 25
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 26
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    return-object v0
.end method

.method public static varargs createReadContext(Ljava/util/function/Supplier;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Ljava/util/Map;",
            ">;",
            "Ljava/util/function/Supplier<",
            "Ljava/util/List;",
            ">;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Lcom/alibaba/fastjson2/JSONReader$Context;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader$Context;->setObjectSupplier(Ljava/util/function/Supplier;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setArraySupplier(Ljava/util/function/Supplier;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static varargs createReadContext(Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Ljava/util/Map;",
            ">;[",
            "Lcom/alibaba/fastjson2/JSONReader$Feature;",
            ")",
            "Lcom/alibaba/fastjson2/JSONReader$Context;"
        }
    .end annotation

    .line 30
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 31
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/JSONReader$Context;->setObjectSupplier(Ljava/util/function/Supplier;)V

    .line 32
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    return-object v0
.end method

.method public static varargs createReadContext([Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2

    .line 19
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    return-object v0
.end method

.method public static varargs createReadContext([Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 2

    .line 22
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    const/4 p1, 0x0

    .line 23
    new-array p1, p1, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    return-object v0
.end method

.method public static createWriteContext()Lcom/alibaba/fastjson2/JSONWriter$Context;
    .locals 2

    .line 10
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    return-object v0
.end method

.method public static varargs createWriteContext(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)Lcom/alibaba/fastjson2/JSONWriter$Context;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->config([Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static varargs createWriteContext([Lcom/alibaba/fastjson2/JSONWriter$Feature;)Lcom/alibaba/fastjson2/JSONWriter$Context;
    .locals 2

    .line 11
    new-instance v0, Lcom/alibaba/fastjson2/JSONWriter$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/JSONWriter$Context;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V

    return-object v0
.end method

.method public static getBuilderJSONObject1x()Ljava/util/function/Function;
    .locals 2

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_1x_BUILDER:Ljava/util/function/Function;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_REFLECT_1x_ERROR:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONFactory$FJ1OjbectBuilder;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONFactory$FJ1OjbectBuilder;-><init>(Lcom/alibaba/fastjson2/JSONFactory$1;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_1x_BUILDER:Ljava/util/function/Function;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    const/4 v0, 0x1

    .line 25
    sput-boolean v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_REFLECT_1x_ERROR:Z

    .line 26
    .line 27
    const-string v0, "create JSONObject1 error"

    .line 28
    .line 29
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    return-object v0

    .line 34
    :cond_0
    :goto_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_1x_BUILDER:Ljava/util/function/Function;

    .line 35
    .line 36
    return-object v0
.end method

.method public static getClassJSONArray1x()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_ARRAY_CLASS_1x:Ljava/lang/Class;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_REFLECT_1x_ERROR:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    const-class v0, Lcom/alibaba/fastjson/JSONArray;

    .line 10
    .line 11
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_ARRAY_CLASS_1x:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    const/4 v0, 0x1

    .line 15
    sput-boolean v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_REFLECT_1x_ERROR:Z

    .line 16
    .line 17
    :cond_0
    :goto_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_ARRAY_CLASS_1x:Ljava/lang/Class;

    .line 18
    .line 19
    return-object v0
.end method

.method public static getClassJSONObject1x()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_CLASS_1x:Ljava/lang/Class;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_REFLECT_1x_ERROR:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    :try_start_0
    const-class v0, Lcom/alibaba/fastjson/JSONObject;

    .line 10
    .line 11
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_CLASS_1x:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    const/4 v0, 0x1

    .line 15
    sput-boolean v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_REFLECT_1x_ERROR:Z

    .line 16
    .line 17
    :cond_0
    :goto_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_CLASS_1x:Ljava/lang/Class;

    .line 18
    .line 19
    return-object v0
.end method

.method public static getDefaultArraySupplier()Ljava/util/function/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/function/Supplier<",
            "Ljava/util/List;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultArraySupplier:Ljava/util/function/Supplier;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultObjectSupplier()Ljava/util/function/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/function/Supplier<",
            "Ljava/util/Map;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectSupplier:Ljava/util/function/Supplier;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultObjectWriterProvider()Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDefaultReaderFeatures()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static getInnerMap()Ljava/util/function/Function;
    .locals 2

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_1x_INNER_MAP:Ljava/util/function/Function;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-boolean v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_REFLECT_1x_ERROR:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    :try_start_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONFactory$FJ1ObjectInnerSupplier;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONFactory$FJ1ObjectInnerSupplier;-><init>(Lcom/alibaba/fastjson2/JSONFactory$1;)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_1x_INNER_MAP:Ljava/util/function/Function;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    const/4 v0, 0x1

    .line 25
    sput-boolean v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_REFLECT_1x_ERROR:Z

    .line 26
    .line 27
    const-string v0, "create getInnerMap error"

    .line 28
    .line 29
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    return-object v0

    .line 34
    :cond_0
    :goto_0
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->JSON_OBJECT_1x_INNER_MAP:Ljava/util/function/Function;

    .line 35
    .line 36
    return-object v0
.end method

.method public static getObjectReader(Ljava/lang/reflect/Type;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 2

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    invoke-virtual {v1, p1, p2}, Lcom/alibaba/fastjson2/JSONReader$Feature;->isEnabled(J)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static getObjectWriter(Ljava/lang/reflect/Type;J)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 3

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectWriterProvider()Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 10
    .line 11
    invoke-virtual {v2, p1, p2}, Lcom/alibaba/fastjson2/JSONWriter$Feature;->isEnabled(J)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v0, p0, v1, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static setDefaultArraySupplier(Ljava/util/function/Supplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Ljava/util/List;",
            ">;)V"
        }
    .end annotation

    .line 1
    sput-object p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultArraySupplier:Ljava/util/function/Supplier;

    .line 2
    .line 3
    return-void
.end method

.method public static setDefaultObjectSupplier(Ljava/util/function/Supplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Ljava/util/Map;",
            ">;)V"
        }
    .end annotation

    .line 1
    sput-object p0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectSupplier:Ljava/util/function/Supplier;

    .line 2
    .line 3
    return-void
.end method
