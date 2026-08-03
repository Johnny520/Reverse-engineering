.class public Lcom/alibaba/fastjson2/util/TypeUtils;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/util/TypeUtils$Cache;,
        Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field static final BIG_10_POW:[D

.field private static final BIG_TEN_POWERS_TABLE_0:[Ljava/math/BigInteger;

.field private static volatile BIG_TEN_POWERS_TABLE_1:[Ljava/math/BigInteger;

.field static final CACHE:Lcom/alibaba/fastjson2/util/TypeUtils$Cache;

.field static final CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/alibaba/fastjson2/util/TypeUtils$Cache;",
            "[C>;"
        }
    .end annotation
.end field

.field public static final CLASS_SINGLE_LIST:Ljava/lang/Class;

.field public static final CLASS_SINGLE_SET:Ljava/lang/Class;

.field public static final CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

.field public static final PARAM_TYPE_LIST_STR:Ljava/lang/reflect/ParameterizedType;

.field static final SINGLE_SMALL_10_POW:[F

.field public static final SMALL_10_POW:[D

.field static final TINY_10_POW:[D


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sput-object v2, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_SINGLE_SET:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_SINGLE_LIST:Ljava/lang/Class;

    .line 25
    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 40
    .line 41
    new-instance v1, Lcom/alibaba/fastjson2/util/ParameterizedTypeImpl;

    .line 42
    .line 43
    new-array v2, v0, [Ljava/lang/reflect/Type;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const-class v4, Ljava/lang/String;

    .line 47
    .line 48
    aput-object v4, v2, v3

    .line 49
    .line 50
    const-class v4, Ljava/util/List;

    .line 51
    .line 52
    invoke-direct {v1, v4, v2}, Lcom/alibaba/fastjson2/util/ParameterizedTypeImpl;-><init>(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    .line 53
    .line 54
    .line 55
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->PARAM_TYPE_LIST_STR:Ljava/lang/reflect/ParameterizedType;

    .line 56
    .line 57
    const/16 v1, 0x17

    .line 58
    .line 59
    new-array v1, v1, [D

    .line 60
    .line 61
    fill-array-data v1, :array_0

    .line 62
    .line 63
    .line 64
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 65
    .line 66
    const/16 v1, 0xb

    .line 67
    .line 68
    new-array v1, v1, [F

    .line 69
    .line 70
    fill-array-data v1, :array_1

    .line 71
    .line 72
    .line 73
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->SINGLE_SMALL_10_POW:[F

    .line 74
    .line 75
    const/4 v1, 0x5

    .line 76
    new-array v2, v1, [D

    .line 77
    .line 78
    fill-array-data v2, :array_2

    .line 79
    .line 80
    .line 81
    sput-object v2, Lcom/alibaba/fastjson2/util/TypeUtils;->BIG_10_POW:[D

    .line 82
    .line 83
    new-array v1, v1, [D

    .line 84
    .line 85
    fill-array-data v1, :array_3

    .line 86
    .line 87
    .line 88
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->TINY_10_POW:[D

    .line 89
    .line 90
    new-instance v1, Lcom/alibaba/fastjson2/util/TypeUtils$Cache;

    .line 91
    .line 92
    invoke-direct {v1}, Lcom/alibaba/fastjson2/util/TypeUtils$Cache;-><init>()V

    .line 93
    .line 94
    .line 95
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->CACHE:Lcom/alibaba/fastjson2/util/TypeUtils$Cache;

    .line 96
    .line 97
    const-class v1, [C

    .line 98
    .line 99
    const-string v2, "chars"

    .line 100
    .line 101
    const-class v4, Lcom/alibaba/fastjson2/util/TypeUtils$Cache;

    .line 102
    .line 103
    invoke-static {v4, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sput-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->CHARS_UPDATER:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 108
    .line 109
    const/16 v1, 0x13

    .line 110
    .line 111
    new-array v2, v1, [Ljava/math/BigInteger;

    .line 112
    .line 113
    sget-object v4, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 114
    .line 115
    aput-object v4, v2, v3

    .line 116
    .line 117
    sget-object v3, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    .line 118
    .line 119
    aput-object v3, v2, v0

    .line 120
    .line 121
    const-wide/16 v3, 0xa

    .line 122
    .line 123
    const/4 v0, 0x2

    .line 124
    move-wide v5, v3

    .line 125
    :goto_0
    if-ge v0, v1, :cond_0

    .line 126
    .line 127
    mul-long/2addr v5, v3

    .line 128
    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    aput-object v7, v2, v0

    .line 133
    .line 134
    add-int/lit8 v0, v0, 0x1

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    sput-object v2, Lcom/alibaba/fastjson2/util/TypeUtils;->BIG_TEN_POWERS_TABLE_0:[Ljava/math/BigInteger;

    .line 138
    .line 139
    return-void

    .line 140
    nop

    .line 141
    :array_0
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

    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :array_1
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

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    :array_2
    .array-data 8
        0x4341c37937e08000L    # 1.0E16
        0x4693b8b5b5056e17L    # 1.0E32
        0x4d384f03e93ff9f5L    # 1.0E64
        0x5a827748f9301d32L    # 1.0E128
        0x75154fdd7f73bf3cL    # 1.0E256
    .end array-data

    .line 264
    :array_3
    .array-data 8
        0x3c9cd2b297d889bcL    # 1.0E-16
        0x3949f623d5a8a733L    # 1.0E-32
        0x32a50ffd44f4a73dL    # 1.0E-64
        0x255bba08cf8c979dL    # 1.0E-128
        0xac8062864ac6f43L    # 1.0E-256
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

.method public static cast(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 492
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;",
            ")TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    const-class v1, Ljava/util/Date;

    .line 13
    .line 14
    if-ne p1, v1, :cond_2

    .line 15
    .line 16
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toDate(Ljava/lang/Object;)Ljava/util/Date;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_2
    const-class v1, Ljava/time/Instant;

    .line 22
    .line 23
    if-ne p1, v1, :cond_3

    .line 24
    .line 25
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toInstant(Ljava/lang/Object;)Ljava/time/Instant;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_3
    const-class v1, Ljava/time/LocalDate;

    .line 31
    .line 32
    if-ne p1, v1, :cond_4

    .line 33
    .line 34
    instance-of v1, p0, Ljava/util/Date;

    .line 35
    .line 36
    if-eqz v1, :cond_4

    .line 37
    .line 38
    check-cast p0, Ljava/util/Date;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_4
    const-class v1, Ljava/time/LocalDateTime;

    .line 56
    .line 57
    if-ne p1, v1, :cond_5

    .line 58
    .line 59
    instance-of v1, p0, Ljava/util/Date;

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    check-cast p0, Ljava/util/Date;

    .line 64
    .line 65
    invoke-virtual {p0}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0

    .line 80
    :cond_5
    const-class v1, Ljava/lang/String;

    .line 81
    .line 82
    if-ne p1, v1, :cond_7

    .line 83
    .line 84
    instance-of p1, p0, Ljava/lang/Character;

    .line 85
    .line 86
    if-eqz p1, :cond_6

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_6
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_7
    const-class v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 99
    .line 100
    if-ne p1, v1, :cond_8

    .line 101
    .line 102
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 103
    .line 104
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toIntValue(Ljava/lang/Object;)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    invoke-direct {p1, p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :cond_8
    const-class v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 113
    .line 114
    if-ne p1, v1, :cond_9

    .line 115
    .line 116
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 117
    .line 118
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toLongValue(Ljava/lang/Object;)J

    .line 119
    .line 120
    .line 121
    move-result-wide v0

    .line 122
    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :cond_9
    const-class v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 127
    .line 128
    if-ne p1, v1, :cond_a

    .line 129
    .line 130
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 131
    .line 132
    check-cast p0, Ljava/lang/Boolean;

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    invoke-direct {p1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 139
    .line 140
    .line 141
    return-object p1

    .line 142
    :cond_a
    instance-of v1, p0, Ljava/util/Map;

    .line 143
    .line 144
    if-eqz v1, :cond_b

    .line 145
    .line 146
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p0, Ljava/util/Map;

    .line 151
    .line 152
    const-wide/16 v0, 0x0

    .line 153
    .line 154
    invoke-interface {p1, p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {p2, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    if-eqz v1, :cond_c

    .line 168
    .line 169
    invoke-interface {v1, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    return-object p0

    .line 174
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_d

    .line 179
    .line 180
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    instance-of v1, v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 189
    .line 190
    if-eqz v1, :cond_e

    .line 191
    .line 192
    instance-of v1, p0, Ljava/lang/Integer;

    .line 193
    .line 194
    if-eqz v1, :cond_d

    .line 195
    .line 196
    check-cast p0, Ljava/lang/Integer;

    .line 197
    .line 198
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    check-cast v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 203
    .line 204
    invoke-virtual {v2, p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->of(I)Ljava/lang/Enum;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :cond_d
    move-object v2, p1

    .line 210
    goto :goto_0

    .line 211
    :cond_e
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    const/4 v5, 0x0

    .line 220
    const-wide/16 v6, 0x0

    .line 221
    .line 222
    move-object v4, p1

    .line 223
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    :goto_0
    instance-of p1, p0, Ljava/lang/String;

    .line 229
    .line 230
    if-eqz p1, :cond_13

    .line 231
    .line 232
    check-cast p0, Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-nez p1, :cond_12

    .line 239
    .line 240
    const-string p1, "null"

    .line 241
    .line 242
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_f

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_f
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    const/4 p2, 0x0

    .line 254
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 255
    .line 256
    .line 257
    move-result p1

    .line 258
    const/16 p2, 0x22

    .line 259
    .line 260
    if-eq p1, p2, :cond_11

    .line 261
    .line 262
    const/16 p2, 0x7b

    .line 263
    .line 264
    if-eq p1, p2, :cond_11

    .line 265
    .line 266
    const/16 p2, 0x5b

    .line 267
    .line 268
    if-ne p1, p2, :cond_10

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_10
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    :goto_1
    move-object v1, p0

    .line 280
    goto :goto_3

    .line 281
    :cond_11
    :goto_2
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    goto :goto_1

    .line 286
    :goto_3
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    const/4 v3, 0x0

    .line 295
    const-wide/16 v4, 0x0

    .line 296
    .line 297
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    return-object p0

    .line 302
    :cond_12
    :goto_4
    return-object v0

    .line 303
    :cond_13
    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-eqz p1, :cond_14

    .line 308
    .line 309
    instance-of p1, p0, Ljava/lang/Integer;

    .line 310
    .line 311
    if-eqz p1, :cond_14

    .line 312
    .line 313
    move-object p1, p0

    .line 314
    check-cast p1, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 321
    .line 322
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    instance-of v3, v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 327
    .line 328
    if-eqz v3, :cond_14

    .line 329
    .line 330
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 331
    .line 332
    invoke-virtual {v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->of(I)Ljava/lang/Enum;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    return-object p0

    .line 337
    :cond_14
    instance-of p1, p0, Ljava/util/Collection;

    .line 338
    .line 339
    if-eqz p1, :cond_15

    .line 340
    .line 341
    invoke-virtual {p2, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    check-cast p0, Ljava/util/Collection;

    .line 346
    .line 347
    invoke-interface {p1, p0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    return-object p0

    .line 352
    :cond_15
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    instance-of p2, p0, Ljava/lang/Integer;

    .line 357
    .line 358
    if-nez p2, :cond_16

    .line 359
    .line 360
    instance-of p2, p0, Ljava/lang/Long;

    .line 361
    .line 362
    if-eqz p2, :cond_17

    .line 363
    .line 364
    :cond_16
    move-object p2, p0

    .line 365
    check-cast p2, Ljava/lang/Number;

    .line 366
    .line 367
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 368
    .line 369
    .line 370
    move-result-wide v3

    .line 371
    const-string p2, "java.time.LocalDateTime"

    .line 372
    .line 373
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result p2

    .line 377
    if-nez p2, :cond_1c

    .line 378
    .line 379
    const-string p2, "java.sql.Date"

    .line 380
    .line 381
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result p2

    .line 385
    if-nez p2, :cond_1b

    .line 386
    .line 387
    const-string p2, "java.sql.Time"

    .line 388
    .line 389
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result p2

    .line 393
    if-nez p2, :cond_1a

    .line 394
    .line 395
    const-string p2, "java.sql.Timestamp"

    .line 396
    .line 397
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result p2

    .line 401
    if-nez p2, :cond_19

    .line 402
    .line 403
    :cond_17
    sget-object p2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 404
    .line 405
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-virtual {p2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 410
    .line 411
    .line 412
    move-result-object p2

    .line 413
    instance-of v1, p2, Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;

    .line 414
    .line 415
    if-eqz v1, :cond_18

    .line 416
    .line 417
    check-cast p2, Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;

    .line 418
    .line 419
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;->getFunction()Ljava/util/function/Function;

    .line 420
    .line 421
    .line 422
    move-result-object p2

    .line 423
    if-eqz p2, :cond_18

    .line 424
    .line 425
    invoke-interface {p2, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p2

    .line 429
    invoke-virtual {v2, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-eqz v1, :cond_18

    .line 434
    .line 435
    return-object p2

    .line 436
    :cond_18
    const-string p2, "can not cast to "

    .line 437
    .line 438
    const-string v1, ", from "

    .line 439
    .line 440
    invoke-static {p2, p1, v1}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    move-result-object p0

    .line 448
    invoke-static {p1, p0}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 449
    .line 450
    .line 451
    return-object v0

    .line 452
    :cond_19
    new-instance p0, Ljava/sql/Timestamp;

    .line 453
    .line 454
    invoke-direct {p0, v3, v4}, Ljava/sql/Timestamp;-><init>(J)V

    .line 455
    .line 456
    .line 457
    return-object p0

    .line 458
    :cond_1a
    new-instance p0, Ljava/sql/Time;

    .line 459
    .line 460
    invoke-direct {p0, v3, v4}, Ljava/sql/Time;-><init>(J)V

    .line 461
    .line 462
    .line 463
    return-object p0

    .line 464
    :cond_1b
    new-instance p0, Ljava/sql/Date;

    .line 465
    .line 466
    invoke-direct {p0, v3, v4}, Ljava/sql/Date;-><init>(J)V

    .line 467
    .line 468
    .line 469
    return-object p0

    .line 470
    :cond_1c
    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    sget-object p1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 475
    .line 476
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 477
    .line 478
    .line 479
    move-result-object p0

    .line 480
    return-object p0
.end method

.method public static cast(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .line 481
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static cast(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;",
            ")TT;"
        }
    .end annotation

    .line 482
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 483
    check-cast p1, Ljava/lang/Class;

    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 484
    :cond_0
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    .line 485
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    .line 486
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p1, p0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 487
    :cond_1
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 488
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    .line 489
    check-cast p0, Ljava/util/Map;

    const-wide/16 v0, 0x0

    invoke-interface {p1, p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 490
    :cond_2
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 491
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/JSON;->parseObject(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static cast(Ljava/lang/Object;[Ljava/lang/reflect/Type;)[Ljava/lang/Object;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 493
    :cond_0
    array-length v0, p1

    new-array v1, v0, [Ljava/lang/Object;

    .line 494
    instance-of v2, p0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 495
    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v2, v3, 0x1

    .line 496
    aget-object v4, p1, v3

    invoke-static {v0, v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v1, v3

    move v3, v2

    goto :goto_0

    .line 497
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 498
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 499
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v2

    :goto_1
    if-ge v3, v0, :cond_2

    if-ge v3, v2, :cond_2

    .line 500
    invoke-static {p0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v4

    .line 501
    aget-object v5, p1, v3

    invoke-static {v4, v5}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-object v1

    .line 502
    :cond_3
    invoke-static {p1}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, " from "

    const-string v0, "can not cast to types "

    invoke-static {v0, p0, p1, v2}, Lah/a;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Comparable;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-class v2, Ljava/math/BigInteger;

    .line 27
    .line 28
    const-class v3, Ljava/lang/Double;

    .line 29
    .line 30
    const-class v4, Ljava/lang/Float;

    .line 31
    .line 32
    const-class v5, Ljava/lang/Long;

    .line 33
    .line 34
    const-class v6, Ljava/lang/Integer;

    .line 35
    .line 36
    const-class v7, Ljava/math/BigDecimal;

    .line 37
    .line 38
    if-ne v0, v7, :cond_5

    .line 39
    .line 40
    if-ne v1, v6, :cond_1

    .line 41
    .line 42
    new-instance v0, Ljava/math/BigDecimal;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/Integer;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(I)V

    .line 51
    .line 52
    .line 53
    :goto_0
    move-object p1, v0

    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_1
    if-ne v1, v5, :cond_2

    .line 57
    .line 58
    new-instance v0, Ljava/math/BigDecimal;

    .line 59
    .line 60
    check-cast p1, Ljava/lang/Long;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(J)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    if-ne v1, v4, :cond_3

    .line 71
    .line 72
    check-cast p1, Ljava/lang/Float;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    float-to-double v0, p1

    .line 79
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_3
    if-ne v1, v3, :cond_4

    .line 86
    .line 87
    check-cast p1, Ljava/lang/Double;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 90
    .line 91
    .line 92
    move-result-wide v0

    .line 93
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_4
    if-ne v1, v2, :cond_29

    .line 100
    .line 101
    new-instance v0, Ljava/math/BigDecimal;

    .line 102
    .line 103
    check-cast p1, Ljava/math/BigInteger;

    .line 104
    .line 105
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    if-ne v0, v2, :cond_a

    .line 110
    .line 111
    if-ne v1, v6, :cond_6

    .line 112
    .line 113
    check-cast p1, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    int-to-long v0, p1

    .line 120
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_6
    if-ne v1, v5, :cond_7

    .line 127
    .line 128
    check-cast p1, Ljava/lang/Long;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    goto/16 :goto_4

    .line 139
    .line 140
    :cond_7
    if-ne v1, v4, :cond_8

    .line 141
    .line 142
    check-cast p1, Ljava/lang/Float;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    float-to-double v0, p1

    .line 149
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-instance v0, Ljava/math/BigDecimal;

    .line 154
    .line 155
    check-cast p0, Ljava/math/BigInteger;

    .line 156
    .line 157
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 158
    .line 159
    .line 160
    :goto_1
    move-object p0, v0

    .line 161
    goto/16 :goto_4

    .line 162
    .line 163
    :cond_8
    if-ne v1, v3, :cond_9

    .line 164
    .line 165
    check-cast p1, Ljava/lang/Double;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 168
    .line 169
    .line 170
    move-result-wide v0

    .line 171
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    new-instance v0, Ljava/math/BigDecimal;

    .line 176
    .line 177
    check-cast p0, Ljava/math/BigInteger;

    .line 178
    .line 179
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_9
    if-ne v1, v7, :cond_29

    .line 184
    .line 185
    new-instance v0, Ljava/math/BigDecimal;

    .line 186
    .line 187
    check-cast p0, Ljava/math/BigInteger;

    .line 188
    .line 189
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_a
    const-class v8, Ljava/lang/String;

    .line 194
    .line 195
    if-ne v0, v5, :cond_10

    .line 196
    .line 197
    if-ne v1, v6, :cond_b

    .line 198
    .line 199
    new-instance v0, Ljava/lang/Long;

    .line 200
    .line 201
    check-cast p1, Ljava/lang/Integer;

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    int-to-long v1, p1

    .line 208
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_b
    if-ne v1, v7, :cond_c

    .line 214
    .line 215
    new-instance v0, Ljava/math/BigDecimal;

    .line 216
    .line 217
    check-cast p0, Ljava/lang/Long;

    .line 218
    .line 219
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 220
    .line 221
    .line 222
    move-result-wide v1

    .line 223
    invoke-direct {v0, v1, v2}, Ljava/math/BigDecimal;-><init>(J)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_c
    if-ne v1, v4, :cond_d

    .line 228
    .line 229
    new-instance v0, Ljava/lang/Float;

    .line 230
    .line 231
    check-cast p0, Ljava/lang/Long;

    .line 232
    .line 233
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 234
    .line 235
    .line 236
    move-result-wide v1

    .line 237
    long-to-float p0, v1

    .line 238
    invoke-direct {v0, p0}, Ljava/lang/Float;-><init>(F)V

    .line 239
    .line 240
    .line 241
    goto :goto_1

    .line 242
    :cond_d
    if-ne v1, v3, :cond_e

    .line 243
    .line 244
    new-instance v0, Ljava/lang/Double;

    .line 245
    .line 246
    check-cast p0, Ljava/lang/Long;

    .line 247
    .line 248
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 249
    .line 250
    .line 251
    move-result-wide v1

    .line 252
    long-to-double v1, v1

    .line 253
    invoke-direct {v0, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 254
    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_e
    if-ne v1, v2, :cond_f

    .line 258
    .line 259
    check-cast p0, Ljava/lang/Long;

    .line 260
    .line 261
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 262
    .line 263
    .line 264
    move-result-wide v0

    .line 265
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    goto/16 :goto_4

    .line 270
    .line 271
    :cond_f
    if-ne v1, v8, :cond_29

    .line 272
    .line 273
    check-cast p0, Ljava/lang/Long;

    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 276
    .line 277
    .line 278
    move-result-wide v0

    .line 279
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    new-instance v0, Ljava/math/BigDecimal;

    .line 284
    .line 285
    check-cast p1, Ljava/lang/String;

    .line 286
    .line 287
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_0

    .line 291
    .line 292
    :cond_10
    if-ne v0, v6, :cond_16

    .line 293
    .line 294
    if-ne v1, v5, :cond_11

    .line 295
    .line 296
    new-instance v0, Ljava/lang/Long;

    .line 297
    .line 298
    check-cast p0, Ljava/lang/Integer;

    .line 299
    .line 300
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 301
    .line 302
    .line 303
    move-result p0

    .line 304
    int-to-long v1, p0

    .line 305
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 306
    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    :cond_11
    if-ne v1, v7, :cond_12

    .line 311
    .line 312
    new-instance v0, Ljava/math/BigDecimal;

    .line 313
    .line 314
    check-cast p0, Ljava/lang/Integer;

    .line 315
    .line 316
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(I)V

    .line 321
    .line 322
    .line 323
    goto/16 :goto_1

    .line 324
    .line 325
    :cond_12
    if-ne v1, v2, :cond_13

    .line 326
    .line 327
    check-cast p0, Ljava/lang/Integer;

    .line 328
    .line 329
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result p0

    .line 333
    int-to-long v0, p0

    .line 334
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    goto/16 :goto_4

    .line 339
    .line 340
    :cond_13
    if-ne v1, v4, :cond_14

    .line 341
    .line 342
    new-instance v0, Ljava/lang/Float;

    .line 343
    .line 344
    check-cast p0, Ljava/lang/Integer;

    .line 345
    .line 346
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 347
    .line 348
    .line 349
    move-result p0

    .line 350
    int-to-float p0, p0

    .line 351
    invoke-direct {v0, p0}, Ljava/lang/Float;-><init>(F)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_1

    .line 355
    .line 356
    :cond_14
    if-ne v1, v3, :cond_15

    .line 357
    .line 358
    new-instance v0, Ljava/lang/Double;

    .line 359
    .line 360
    check-cast p0, Ljava/lang/Integer;

    .line 361
    .line 362
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 363
    .line 364
    .line 365
    move-result p0

    .line 366
    int-to-double v1, p0

    .line 367
    invoke-direct {v0, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_1

    .line 371
    .line 372
    :cond_15
    if-ne v1, v8, :cond_29

    .line 373
    .line 374
    check-cast p0, Ljava/lang/Integer;

    .line 375
    .line 376
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 377
    .line 378
    .line 379
    move-result p0

    .line 380
    int-to-long v0, p0

    .line 381
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 382
    .line 383
    .line 384
    move-result-object p0

    .line 385
    new-instance v0, Ljava/math/BigDecimal;

    .line 386
    .line 387
    check-cast p1, Ljava/lang/String;

    .line 388
    .line 389
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    goto/16 :goto_0

    .line 393
    .line 394
    :cond_16
    if-ne v0, v3, :cond_1c

    .line 395
    .line 396
    if-ne v1, v6, :cond_17

    .line 397
    .line 398
    new-instance v0, Ljava/lang/Double;

    .line 399
    .line 400
    check-cast p1, Ljava/lang/Integer;

    .line 401
    .line 402
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result p1

    .line 406
    int-to-double v1, p1

    .line 407
    invoke-direct {v0, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 408
    .line 409
    .line 410
    goto/16 :goto_0

    .line 411
    .line 412
    :cond_17
    if-ne v1, v5, :cond_18

    .line 413
    .line 414
    new-instance v0, Ljava/lang/Double;

    .line 415
    .line 416
    check-cast p1, Ljava/lang/Long;

    .line 417
    .line 418
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 419
    .line 420
    .line 421
    move-result-wide v1

    .line 422
    long-to-double v1, v1

    .line 423
    invoke-direct {v0, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 424
    .line 425
    .line 426
    goto/16 :goto_0

    .line 427
    .line 428
    :cond_18
    if-ne v1, v4, :cond_19

    .line 429
    .line 430
    new-instance v0, Ljava/lang/Double;

    .line 431
    .line 432
    check-cast p1, Ljava/lang/Float;

    .line 433
    .line 434
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 435
    .line 436
    .line 437
    move-result p1

    .line 438
    float-to-double v1, p1

    .line 439
    invoke-direct {v0, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_0

    .line 443
    .line 444
    :cond_19
    if-ne v1, v7, :cond_1a

    .line 445
    .line 446
    check-cast p0, Ljava/lang/Double;

    .line 447
    .line 448
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 449
    .line 450
    .line 451
    move-result-wide v0

    .line 452
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    goto/16 :goto_4

    .line 457
    .line 458
    :cond_1a
    if-ne v1, v8, :cond_1b

    .line 459
    .line 460
    check-cast p0, Ljava/lang/Double;

    .line 461
    .line 462
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 463
    .line 464
    .line 465
    move-result-wide v0

    .line 466
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    new-instance v0, Ljava/math/BigDecimal;

    .line 471
    .line 472
    check-cast p1, Ljava/lang/String;

    .line 473
    .line 474
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    goto/16 :goto_0

    .line 478
    .line 479
    :cond_1b
    if-ne v1, v2, :cond_29

    .line 480
    .line 481
    check-cast p0, Ljava/lang/Double;

    .line 482
    .line 483
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 484
    .line 485
    .line 486
    move-result-wide v0

    .line 487
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    new-instance v0, Ljava/math/BigDecimal;

    .line 492
    .line 493
    check-cast p1, Ljava/math/BigInteger;

    .line 494
    .line 495
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 496
    .line 497
    .line 498
    goto/16 :goto_0

    .line 499
    .line 500
    :cond_1c
    if-ne v0, v4, :cond_22

    .line 501
    .line 502
    if-ne v1, v6, :cond_1d

    .line 503
    .line 504
    new-instance v0, Ljava/lang/Float;

    .line 505
    .line 506
    check-cast p1, Ljava/lang/Integer;

    .line 507
    .line 508
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 509
    .line 510
    .line 511
    move-result p1

    .line 512
    int-to-float p1, p1

    .line 513
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 514
    .line 515
    .line 516
    goto/16 :goto_0

    .line 517
    .line 518
    :cond_1d
    if-ne v1, v5, :cond_1e

    .line 519
    .line 520
    new-instance v0, Ljava/lang/Float;

    .line 521
    .line 522
    check-cast p1, Ljava/lang/Long;

    .line 523
    .line 524
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 525
    .line 526
    .line 527
    move-result-wide v1

    .line 528
    long-to-float p1, v1

    .line 529
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_0

    .line 533
    .line 534
    :cond_1e
    if-ne v1, v3, :cond_1f

    .line 535
    .line 536
    new-instance v0, Ljava/lang/Double;

    .line 537
    .line 538
    check-cast p0, Ljava/lang/Float;

    .line 539
    .line 540
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 541
    .line 542
    .line 543
    move-result p0

    .line 544
    float-to-double v1, p0

    .line 545
    invoke-direct {v0, v1, v2}, Ljava/lang/Double;-><init>(D)V

    .line 546
    .line 547
    .line 548
    goto/16 :goto_1

    .line 549
    .line 550
    :cond_1f
    if-ne v1, v7, :cond_20

    .line 551
    .line 552
    check-cast p0, Ljava/lang/Float;

    .line 553
    .line 554
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 555
    .line 556
    .line 557
    move-result p0

    .line 558
    float-to-double v0, p0

    .line 559
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 560
    .line 561
    .line 562
    move-result-object p0

    .line 563
    goto/16 :goto_4

    .line 564
    .line 565
    :cond_20
    if-ne v1, v8, :cond_21

    .line 566
    .line 567
    check-cast p0, Ljava/lang/Float;

    .line 568
    .line 569
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 570
    .line 571
    .line 572
    move-result p0

    .line 573
    float-to-double v0, p0

    .line 574
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 575
    .line 576
    .line 577
    move-result-object p0

    .line 578
    new-instance v0, Ljava/math/BigDecimal;

    .line 579
    .line 580
    check-cast p1, Ljava/lang/String;

    .line 581
    .line 582
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    goto/16 :goto_0

    .line 586
    .line 587
    :cond_21
    if-ne v1, v2, :cond_29

    .line 588
    .line 589
    check-cast p0, Ljava/lang/Float;

    .line 590
    .line 591
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 592
    .line 593
    .line 594
    move-result p0

    .line 595
    float-to-double v0, p0

    .line 596
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 597
    .line 598
    .line 599
    move-result-object p0

    .line 600
    new-instance v0, Ljava/math/BigDecimal;

    .line 601
    .line 602
    check-cast p1, Ljava/math/BigInteger;

    .line 603
    .line 604
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 605
    .line 606
    .line 607
    goto/16 :goto_0

    .line 608
    .line 609
    :cond_22
    if-ne v0, v8, :cond_29

    .line 610
    .line 611
    move-object v0, p0

    .line 612
    check-cast v0, Ljava/lang/String;

    .line 613
    .line 614
    if-ne v1, v6, :cond_24

    .line 615
    .line 616
    const/4 v1, 0x0

    .line 617
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 622
    .line 623
    .line 624
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 625
    move-object v2, v1

    .line 626
    goto :goto_2

    .line 627
    :catch_0
    move-exception v2

    .line 628
    :goto_2
    if-eqz v2, :cond_23

    .line 629
    .line 630
    :try_start_1
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 631
    .line 632
    .line 633
    move-result-wide v2

    .line 634
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    move-object v2, p1

    .line 639
    check-cast v2, Ljava/lang/Integer;

    .line 640
    .line 641
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 642
    .line 643
    .line 644
    move-result v2

    .line 645
    int-to-long v2, v2

    .line 646
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 647
    .line 648
    .line 649
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 650
    goto :goto_3

    .line 651
    :catch_1
    move-exception v1

    .line 652
    goto :goto_3

    .line 653
    :cond_23
    move-object v1, v2

    .line 654
    :goto_3
    if-eqz v1, :cond_29

    .line 655
    .line 656
    new-instance p0, Ljava/math/BigDecimal;

    .line 657
    .line 658
    invoke-direct {p0, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 659
    .line 660
    .line 661
    check-cast p1, Ljava/lang/Integer;

    .line 662
    .line 663
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 664
    .line 665
    .line 666
    move-result p1

    .line 667
    int-to-long v0, p1

    .line 668
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 669
    .line 670
    .line 671
    move-result-object p1

    .line 672
    goto :goto_4

    .line 673
    :cond_24
    if-ne v1, v5, :cond_25

    .line 674
    .line 675
    new-instance p0, Ljava/math/BigDecimal;

    .line 676
    .line 677
    invoke-direct {p0, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    check-cast p1, Ljava/lang/Long;

    .line 681
    .line 682
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 683
    .line 684
    .line 685
    move-result-wide v0

    .line 686
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 687
    .line 688
    .line 689
    move-result-object p1

    .line 690
    goto :goto_4

    .line 691
    :cond_25
    if-ne v1, v4, :cond_26

    .line 692
    .line 693
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 694
    .line 695
    .line 696
    move-result p0

    .line 697
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 698
    .line 699
    .line 700
    move-result-object p0

    .line 701
    goto :goto_4

    .line 702
    :cond_26
    if-ne v1, v3, :cond_27

    .line 703
    .line 704
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 705
    .line 706
    .line 707
    move-result-wide v0

    .line 708
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 709
    .line 710
    .line 711
    move-result-object p0

    .line 712
    goto :goto_4

    .line 713
    :cond_27
    if-ne v1, v2, :cond_28

    .line 714
    .line 715
    new-instance p0, Ljava/math/BigInteger;

    .line 716
    .line 717
    invoke-direct {p0, v0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    goto :goto_4

    .line 721
    :cond_28
    if-ne v1, v7, :cond_29

    .line 722
    .line 723
    new-instance p0, Ljava/math/BigDecimal;

    .line 724
    .line 725
    invoke-direct {p0, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    :cond_29
    :goto_4
    check-cast p0, Ljava/lang/Comparable;

    .line 729
    .line 730
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 731
    .line 732
    .line 733
    move-result p0

    .line 734
    return p0
.end method

.method public static doubleValue(IJI)D
    .locals 6

    .line 498
    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    int-to-long v0, v0

    int-to-double v2, p3

    const-wide v4, 0x400a934f0979a371L    # 3.321928094887362

    mul-double/2addr v2, v4

    .line 499
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, -0x434

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    int-to-double p0, p0

    const-wide/16 p2, 0x0

    mul-double/2addr p0, p2

    return-wide p0

    :cond_0
    const-wide/16 v2, 0x401

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    int-to-double p0, p0

    const-wide/high16 p2, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    mul-double/2addr p0, p2

    return-wide p0

    :cond_1
    if-gez p3, :cond_2

    neg-int p3, p3

    .line 500
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/TypeUtils;->power10(I)Ljava/math/BigInteger;

    move-result-object p3

    .line 501
    invoke-static {p1, p2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    int-to-double v0, p0

    .line 502
    invoke-virtual {p1, p3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->doubleValue()D

    move-result-wide p0

    mul-double/2addr p0, v0

    return-wide p0

    :cond_2
    if-nez p3, :cond_3

    int-to-double v0, p0

    long-to-double p0, p1

    mul-double/2addr v0, p0

    return-wide v0

    .line 503
    :cond_3
    invoke-static {p1, p2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    long-to-int p2, v0

    add-int/lit8 p2, p2, -0x38

    .line 504
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/TypeUtils;->power10(I)Ljava/math/BigInteger;

    move-result-object p3

    if-gtz p2, :cond_4

    neg-int v0, p2

    .line 505
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object p1

    goto :goto_0

    .line 506
    :cond_4
    invoke-virtual {p3, p2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object p3

    .line 507
    :goto_0
    invoke-virtual {p1, p3}, Ljava/math/BigInteger;->divideAndRemainder(Ljava/math/BigInteger;)[Ljava/math/BigInteger;

    move-result-object p1

    const/4 p3, 0x0

    .line 508
    aget-object p3, p1, p3

    invoke-virtual {p3}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v0

    const/4 p3, 0x1

    .line 509
    aget-object p1, p1, p3

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result p1

    .line 510
    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p3

    rsub-int/lit8 p3, p3, 0x9

    rsub-int v2, p2, -0x434

    if-lt p3, v2, :cond_5

    int-to-double v2, p0

    int-to-long p0, p1

    or-long/2addr p0, v0

    long-to-double p0, p0

    .line 511
    invoke-static {p0, p1, p2}, Ljava/lang/Math;->scalb(DI)D

    move-result-wide p0

    mul-double/2addr p0, v2

    return-wide p0

    :cond_5
    const-wide/16 p2, 0x1

    shl-long v3, p2, v2

    sub-long/2addr v3, p2

    shr-long p2, v0, v2

    and-long/2addr v0, v3

    .line 512
    invoke-static {v0, v1}, Ljava/lang/Long;->signum(J)I

    move-result v0

    int-to-long v0, v0

    or-long/2addr p2, v0

    int-to-long v0, p1

    or-long p1, p2, v0

    int-to-double v0, p0

    long-to-double p0, p1

    const/16 p2, -0x434

    .line 513
    invoke-static {p0, p1, p2}, Ljava/lang/Math;->scalb(DI)D

    move-result-wide p0

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method public static doubleValue(ZI[CI)D
    .locals 20

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    const/4 v3, 0x1

    .line 9
    sub-int/2addr v2, v3

    .line 10
    sget-object v4, Lcom/alibaba/fastjson2/util/TypeUtils;->SINGLE_SMALL_10_POW:[F

    .line 11
    .line 12
    array-length v4, v4

    .line 13
    const/16 v4, 0x10

    .line 14
    .line 15
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result v9

    .line 19
    const/4 v4, 0x0

    .line 20
    aget-char v5, p2, v4

    .line 21
    .line 22
    add-int/lit8 v5, v5, -0x30

    .line 23
    .line 24
    const/16 v6, 0x9

    .line 25
    .line 26
    invoke-static {v9, v6}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    move v7, v3

    .line 31
    :goto_0
    if-ge v7, v6, :cond_0

    .line 32
    .line 33
    mul-int/lit8 v5, v5, 0xa

    .line 34
    .line 35
    aget-char v8, p2, v7

    .line 36
    .line 37
    add-int/2addr v5, v8

    .line 38
    add-int/lit8 v5, v5, -0x30

    .line 39
    .line 40
    add-int/lit8 v7, v7, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    int-to-long v7, v5

    .line 44
    :goto_1
    if-ge v6, v9, :cond_1

    .line 45
    .line 46
    const-wide/16 v10, 0xa

    .line 47
    .line 48
    mul-long/2addr v7, v10

    .line 49
    aget-char v5, p2, v6

    .line 50
    .line 51
    add-int/lit8 v5, v5, -0x30

    .line 52
    .line 53
    int-to-long v10, v5

    .line 54
    add-long/2addr v7, v10

    .line 55
    add-int/lit8 v6, v6, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    long-to-double v5, v7

    .line 59
    sub-int v10, v0, v9

    .line 60
    .line 61
    const/16 v11, 0xf

    .line 62
    .line 63
    const-wide/16 v12, 0x0

    .line 64
    .line 65
    if-gt v1, v11, :cond_a

    .line 66
    .line 67
    if-eqz v10, :cond_8

    .line 68
    .line 69
    cmpl-double v11, v5, v12

    .line 70
    .line 71
    if-nez v11, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    if-ltz v10, :cond_6

    .line 75
    .line 76
    if-gt v10, v2, :cond_4

    .line 77
    .line 78
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 79
    .line 80
    aget-wide v1, v0, v10

    .line 81
    .line 82
    mul-double/2addr v5, v1

    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    neg-double v0, v5

    .line 86
    return-wide v0

    .line 87
    :cond_3
    return-wide v5

    .line 88
    :cond_4
    rsub-int/lit8 v11, v9, 0xf

    .line 89
    .line 90
    add-int/2addr v2, v11

    .line 91
    if-gt v10, v2, :cond_a

    .line 92
    .line 93
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 94
    .line 95
    aget-wide v1, v0, v11

    .line 96
    .line 97
    mul-double/2addr v5, v1

    .line 98
    sub-int/2addr v10, v11

    .line 99
    aget-wide v1, v0, v10

    .line 100
    .line 101
    mul-double/2addr v5, v1

    .line 102
    if-eqz p0, :cond_5

    .line 103
    .line 104
    neg-double v0, v5

    .line 105
    return-wide v0

    .line 106
    :cond_5
    return-wide v5

    .line 107
    :cond_6
    neg-int v2, v2

    .line 108
    if-lt v10, v2, :cond_a

    .line 109
    .line 110
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 111
    .line 112
    neg-int v1, v10

    .line 113
    aget-wide v1, v0, v1

    .line 114
    .line 115
    div-double/2addr v5, v1

    .line 116
    if-eqz p0, :cond_7

    .line 117
    .line 118
    neg-double v0, v5

    .line 119
    return-wide v0

    .line 120
    :cond_7
    return-wide v5

    .line 121
    :cond_8
    :goto_2
    if-eqz p0, :cond_9

    .line 122
    .line 123
    neg-double v0, v5

    .line 124
    return-wide v0

    .line 125
    :cond_9
    return-wide v5

    .line 126
    :cond_a
    const-wide/high16 v14, 0x4000000000000000L    # 2.0

    .line 127
    .line 128
    if-lez v10, :cond_14

    .line 129
    .line 130
    const/16 v2, 0x135

    .line 131
    .line 132
    const-wide/high16 v11, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 133
    .line 134
    const-wide/high16 v16, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    .line 135
    .line 136
    if-le v0, v2, :cond_c

    .line 137
    .line 138
    if-eqz p0, :cond_b

    .line 139
    .line 140
    return-wide v16

    .line 141
    :cond_b
    return-wide v11

    .line 142
    :cond_c
    and-int/lit8 v2, v10, 0xf

    .line 143
    .line 144
    if-eqz v2, :cond_d

    .line 145
    .line 146
    sget-object v13, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 147
    .line 148
    aget-wide v18, v13, v2

    .line 149
    .line 150
    mul-double v5, v5, v18

    .line 151
    .line 152
    :cond_d
    shr-int/lit8 v2, v10, 0x4

    .line 153
    .line 154
    if-eqz v2, :cond_13

    .line 155
    .line 156
    move v10, v4

    .line 157
    :goto_3
    if-le v2, v3, :cond_f

    .line 158
    .line 159
    and-int/lit8 v13, v2, 0x1

    .line 160
    .line 161
    if-eqz v13, :cond_e

    .line 162
    .line 163
    sget-object v13, Lcom/alibaba/fastjson2/util/TypeUtils;->BIG_10_POW:[D

    .line 164
    .line 165
    aget-wide v18, v13, v10

    .line 166
    .line 167
    mul-double v5, v5, v18

    .line 168
    .line 169
    :cond_e
    add-int/lit8 v10, v10, 0x1

    .line 170
    .line 171
    shr-int/lit8 v2, v2, 0x1

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_f
    sget-object v2, Lcom/alibaba/fastjson2/util/TypeUtils;->BIG_10_POW:[D

    .line 175
    .line 176
    aget-wide v18, v2, v10

    .line 177
    .line 178
    mul-double v18, v18, v5

    .line 179
    .line 180
    invoke-static/range {v18 .. v19}, Ljava/lang/Double;->isInfinite(D)Z

    .line 181
    .line 182
    .line 183
    move-result v13

    .line 184
    if-eqz v13, :cond_12

    .line 185
    .line 186
    div-double/2addr v5, v14

    .line 187
    aget-wide v13, v2, v10

    .line 188
    .line 189
    mul-double/2addr v5, v13

    .line 190
    invoke-static {v5, v6}, Ljava/lang/Double;->isInfinite(D)Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_11

    .line 195
    .line 196
    if-eqz p0, :cond_10

    .line 197
    .line 198
    return-wide v16

    .line 199
    :cond_10
    return-wide v11

    .line 200
    :cond_11
    const-wide v5, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_12
    move-wide/from16 v5, v18

    .line 207
    .line 208
    :cond_13
    :goto_4
    move-wide v11, v5

    .line 209
    goto :goto_6

    .line 210
    :cond_14
    if-gez v10, :cond_13

    .line 211
    .line 212
    neg-int v2, v10

    .line 213
    const/16 v10, -0x145

    .line 214
    .line 215
    const-wide/high16 v16, -0x8000000000000000L

    .line 216
    .line 217
    if-ge v0, v10, :cond_16

    .line 218
    .line 219
    if-eqz p0, :cond_15

    .line 220
    .line 221
    return-wide v16

    .line 222
    :cond_15
    return-wide v12

    .line 223
    :cond_16
    and-int/lit8 v10, v2, 0xf

    .line 224
    .line 225
    if-eqz v10, :cond_17

    .line 226
    .line 227
    sget-object v11, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 228
    .line 229
    aget-wide v10, v11, v10

    .line 230
    .line 231
    div-double/2addr v5, v10

    .line 232
    :cond_17
    shr-int/lit8 v2, v2, 0x4

    .line 233
    .line 234
    if-eqz v2, :cond_13

    .line 235
    .line 236
    move v10, v4

    .line 237
    :goto_5
    if-le v2, v3, :cond_19

    .line 238
    .line 239
    and-int/lit8 v11, v2, 0x1

    .line 240
    .line 241
    if-eqz v11, :cond_18

    .line 242
    .line 243
    sget-object v11, Lcom/alibaba/fastjson2/util/TypeUtils;->TINY_10_POW:[D

    .line 244
    .line 245
    aget-wide v18, v11, v10

    .line 246
    .line 247
    mul-double v5, v5, v18

    .line 248
    .line 249
    :cond_18
    add-int/lit8 v10, v10, 0x1

    .line 250
    .line 251
    shr-int/lit8 v2, v2, 0x1

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_19
    sget-object v2, Lcom/alibaba/fastjson2/util/TypeUtils;->TINY_10_POW:[D

    .line 255
    .line 256
    aget-wide v10, v2, v10

    .line 257
    .line 258
    mul-double v18, v5, v10

    .line 259
    .line 260
    cmpl-double v2, v18, v12

    .line 261
    .line 262
    if-nez v2, :cond_12

    .line 263
    .line 264
    mul-double/2addr v5, v14

    .line 265
    mul-double/2addr v5, v10

    .line 266
    cmpl-double v2, v5, v12

    .line 267
    .line 268
    if-nez v2, :cond_1b

    .line 269
    .line 270
    if-eqz p0, :cond_1a

    .line 271
    .line 272
    return-wide v16

    .line 273
    :cond_1a
    return-wide v12

    .line 274
    :cond_1b
    const-wide/16 v5, 0x1

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :goto_6
    const/16 v2, 0x44c

    .line 278
    .line 279
    if-le v1, v2, :cond_1c

    .line 280
    .line 281
    const/16 v1, 0x31

    .line 282
    .line 283
    aput-char v1, p2, v2

    .line 284
    .line 285
    const/16 v1, 0x44d

    .line 286
    .line 287
    :cond_1c
    move v10, v1

    .line 288
    new-instance v5, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 289
    .line 290
    move-wide v6, v7

    .line 291
    move-object/from16 v8, p2

    .line 292
    .line 293
    invoke-direct/range {v5 .. v10}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>(J[CII)V

    .line 294
    .line 295
    .line 296
    sub-int/2addr v0, v10

    .line 297
    invoke-static {v11, v12}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 298
    .line 299
    .line 300
    move-result-wide v1

    .line 301
    neg-int v6, v0

    .line 302
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    invoke-virtual {v5, v0, v4}, Lcom/alibaba/fastjson2/util/FDBigInteger;->multByPow52(II)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    iput-boolean v3, v5, Lcom/alibaba/fastjson2/util/FDBigInteger;->immutable:Z

    .line 315
    .line 316
    const/4 v7, 0x0

    .line 317
    move v8, v4

    .line 318
    :goto_7
    const/16 v9, 0x34

    .line 319
    .line 320
    ushr-long v9, v1, v9

    .line 321
    .line 322
    long-to-int v9, v9

    .line 323
    const-wide v10, 0xfffffffffffffL

    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    and-long/2addr v10, v1

    .line 329
    if-lez v9, :cond_1d

    .line 330
    .line 331
    const-wide/high16 v12, 0x10000000000000L

    .line 332
    .line 333
    or-long/2addr v10, v12

    .line 334
    goto :goto_8

    .line 335
    :cond_1d
    invoke-static {v10, v11}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    .line 336
    .line 337
    .line 338
    move-result v9

    .line 339
    add-int/lit8 v9, v9, -0xb

    .line 340
    .line 341
    shl-long/2addr v10, v9

    .line 342
    rsub-int/lit8 v9, v9, 0x1

    .line 343
    .line 344
    :goto_8
    add-int/lit16 v12, v9, -0x3ff

    .line 345
    .line 346
    invoke-static {v10, v11}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 347
    .line 348
    .line 349
    move-result v13

    .line 350
    ushr-long/2addr v10, v13

    .line 351
    add-int/lit16 v9, v9, -0x433

    .line 352
    .line 353
    add-int/2addr v9, v13

    .line 354
    rsub-int/lit8 v14, v13, 0x35

    .line 355
    .line 356
    if-ltz v9, :cond_1e

    .line 357
    .line 358
    add-int v15, v6, v9

    .line 359
    .line 360
    move/from16 v16, v0

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_1e
    sub-int v15, v0, v9

    .line 364
    .line 365
    move/from16 v16, v15

    .line 366
    .line 367
    move v15, v6

    .line 368
    :goto_9
    const/16 v4, -0x3ff

    .line 369
    .line 370
    if-gt v12, v4, :cond_1f

    .line 371
    .line 372
    add-int/2addr v12, v13

    .line 373
    add-int/lit16 v12, v12, 0x3ff

    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_1f
    add-int/lit8 v12, v13, 0x1

    .line 377
    .line 378
    :goto_a
    add-int v4, v15, v12

    .line 379
    .line 380
    add-int v12, v16, v12

    .line 381
    .line 382
    invoke-static {v12, v15}, Ljava/lang/Math;->min(II)I

    .line 383
    .line 384
    .line 385
    move-result v13

    .line 386
    invoke-static {v4, v13}, Ljava/lang/Math;->min(II)I

    .line 387
    .line 388
    .line 389
    move-result v13

    .line 390
    sub-int/2addr v4, v13

    .line 391
    sub-int/2addr v12, v13

    .line 392
    sub-int/2addr v15, v13

    .line 393
    invoke-static {v10, v11, v6, v4}, Lcom/alibaba/fastjson2/util/FDBigInteger;->valueOfMulPow52(JII)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    if-eqz v7, :cond_20

    .line 398
    .line 399
    if-eq v8, v12, :cond_21

    .line 400
    .line 401
    :cond_20
    invoke-virtual {v5, v12}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    move v8, v12

    .line 406
    :cond_21
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson2/util/FDBigInteger;->cmp(Lcom/alibaba/fastjson2/util/FDBigInteger;)I

    .line 407
    .line 408
    .line 409
    move-result v10

    .line 410
    if-lez v10, :cond_23

    .line 411
    .line 412
    invoke-virtual {v4, v7}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftInplaceSub(Lcom/alibaba/fastjson2/util/FDBigInteger;)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    if-ne v14, v3, :cond_22

    .line 417
    .line 418
    const/16 v10, -0x3fe

    .line 419
    .line 420
    if-le v9, v10, :cond_22

    .line 421
    .line 422
    add-int/lit8 v15, v15, -0x1

    .line 423
    .line 424
    if-gez v15, :cond_22

    .line 425
    .line 426
    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    move v9, v3

    .line 431
    const/4 v15, 0x0

    .line 432
    goto :goto_b

    .line 433
    :cond_22
    move v9, v3

    .line 434
    goto :goto_b

    .line 435
    :cond_23
    if-gez v10, :cond_29

    .line 436
    .line 437
    invoke-virtual {v7, v4}, Lcom/alibaba/fastjson2/util/FDBigInteger;->rightInplaceSub(Lcom/alibaba/fastjson2/util/FDBigInteger;)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    const/4 v9, 0x0

    .line 442
    :goto_b
    invoke-virtual {v4, v6, v15}, Lcom/alibaba/fastjson2/util/FDBigInteger;->cmpPow52(II)I

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    if-gez v4, :cond_24

    .line 447
    .line 448
    goto :goto_e

    .line 449
    :cond_24
    const-wide/16 v10, -0x1

    .line 450
    .line 451
    const-wide/16 v12, 0x0

    .line 452
    .line 453
    const-wide/16 v14, 0x1

    .line 454
    .line 455
    if-nez v4, :cond_26

    .line 456
    .line 457
    and-long v3, v1, v14

    .line 458
    .line 459
    cmp-long v0, v3, v12

    .line 460
    .line 461
    if-eqz v0, :cond_29

    .line 462
    .line 463
    if-eqz v9, :cond_25

    .line 464
    .line 465
    goto :goto_c

    .line 466
    :cond_25
    move-wide v10, v14

    .line 467
    :goto_c
    add-long/2addr v1, v10

    .line 468
    goto :goto_e

    .line 469
    :cond_26
    if-eqz v9, :cond_27

    .line 470
    .line 471
    goto :goto_d

    .line 472
    :cond_27
    move-wide v10, v14

    .line 473
    :goto_d
    add-long/2addr v1, v10

    .line 474
    cmp-long v4, v1, v12

    .line 475
    .line 476
    if-eqz v4, :cond_29

    .line 477
    .line 478
    const-wide/high16 v9, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 479
    .line 480
    cmp-long v4, v1, v9

    .line 481
    .line 482
    if-nez v4, :cond_28

    .line 483
    .line 484
    goto :goto_e

    .line 485
    :cond_28
    const/4 v4, 0x0

    .line 486
    goto/16 :goto_7

    .line 487
    .line 488
    :cond_29
    :goto_e
    if-eqz p0, :cond_2a

    .line 489
    .line 490
    const-wide/high16 v3, -0x8000000000000000L

    .line 491
    .line 492
    or-long/2addr v1, v3

    .line 493
    :cond_2a
    invoke-static {v1, v2}, Ljava/lang/Double;->longBitsToDouble(J)D

    .line 494
    .line 495
    .line 496
    move-result-wide v0

    .line 497
    return-wide v0
.end method

.method public static floatValue(IJI)F
    .locals 6

    .line 439
    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x40

    int-to-long v0, v0

    int-to-double v2, p3

    const-wide v4, 0x400a934f0979a371L    # 3.321928094887362

    mul-double/2addr v2, v4

    .line 440
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-long v2, v2

    sub-long/2addr v0, v2

    const-wide/16 v2, -0x97

    cmp-long v2, v0, v2

    if-gez v2, :cond_0

    int-to-float p0, p0

    const/4 p1, 0x0

    :goto_0
    mul-float/2addr p0, p1

    return p0

    :cond_0
    const-wide/16 v2, 0x81

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    int-to-float p0, p0

    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    goto :goto_0

    :cond_1
    if-gez p3, :cond_2

    .line 441
    invoke-static {p1, p2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    int-to-float p0, p0

    neg-int p2, p3

    .line 442
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->power10(I)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->floatValue()F

    move-result p1

    :goto_1
    mul-float/2addr p1, p0

    return p1

    .line 443
    :cond_2
    invoke-static {p1, p2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object p1

    long-to-int p2, v0

    add-int/lit8 p2, p2, -0x1b

    .line 444
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/TypeUtils;->power10(I)Ljava/math/BigInteger;

    move-result-object p3

    if-gtz p2, :cond_3

    neg-int v0, p2

    .line 445
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object p1

    goto :goto_2

    .line 446
    :cond_3
    invoke-virtual {p3, p2}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    move-result-object p3

    .line 447
    :goto_2
    invoke-virtual {p1, p3}, Ljava/math/BigInteger;->divideAndRemainder(Ljava/math/BigInteger;)[Ljava/math/BigInteger;

    move-result-object p1

    const/4 p3, 0x0

    .line 448
    aget-object p3, p1, p3

    invoke-virtual {p3}, Ljava/math/BigInteger;->intValue()I

    move-result p3

    const/4 v0, 0x1

    .line 449
    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result p1

    .line 450
    invoke-static {p3}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result v1

    rsub-int/lit8 v1, v1, 0x6

    rsub-int v2, p2, -0x97

    if-lt v1, v2, :cond_4

    int-to-float p0, p0

    or-int/2addr p1, p3

    int-to-float p1, p1

    .line 451
    invoke-static {p1, p2}, Ljava/lang/Math;->scalb(FI)F

    move-result p1

    goto :goto_1

    :cond_4
    shl-int p2, v0, v2

    sub-int/2addr p2, v0

    shr-int v0, p3, v2

    and-int/2addr p2, p3

    .line 452
    invoke-static {p2}, Ljava/lang/Integer;->signum(I)I

    move-result p2

    or-int/2addr p2, v0

    or-int/2addr p1, p2

    int-to-float p0, p0

    int-to-float p1, p1

    const/16 p2, -0x97

    .line 453
    invoke-static {p1, p2}, Ljava/lang/Math;->scalb(FI)F

    move-result p1

    goto :goto_1
.end method

.method public static floatValue(ZI[CI)F
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p3

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/util/TypeUtils;->SINGLE_SMALL_10_POW:[F

    .line 6
    .line 7
    array-length v2, v2

    .line 8
    const/4 v3, 0x1

    .line 9
    sub-int/2addr v2, v3

    .line 10
    const/16 v4, 0x8

    .line 11
    .line 12
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    const/4 v11, 0x0

    .line 17
    aget-char v5, p2, v11

    .line 18
    .line 19
    add-int/lit8 v5, v5, -0x30

    .line 20
    .line 21
    move v6, v3

    .line 22
    :goto_0
    if-ge v6, v9, :cond_0

    .line 23
    .line 24
    mul-int/lit8 v5, v5, 0xa

    .line 25
    .line 26
    aget-char v7, p2, v6

    .line 27
    .line 28
    add-int/2addr v5, v7

    .line 29
    add-int/lit8 v5, v5, -0x30

    .line 30
    .line 31
    add-int/lit8 v6, v6, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    int-to-float v6, v5

    .line 35
    sub-int v7, v0, v9

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v10, 0x7

    .line 39
    if-gt v1, v10, :cond_9

    .line 40
    .line 41
    if-eqz v7, :cond_7

    .line 42
    .line 43
    cmpl-float v10, v6, v8

    .line 44
    .line 45
    if-nez v10, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    if-ltz v7, :cond_5

    .line 49
    .line 50
    if-gt v7, v2, :cond_3

    .line 51
    .line 52
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils;->SINGLE_SMALL_10_POW:[F

    .line 53
    .line 54
    aget v0, v0, v7

    .line 55
    .line 56
    mul-float/2addr v6, v0

    .line 57
    if-eqz p0, :cond_2

    .line 58
    .line 59
    neg-float v0, v6

    .line 60
    return v0

    .line 61
    :cond_2
    return v6

    .line 62
    :cond_3
    rsub-int/lit8 v10, v9, 0x7

    .line 63
    .line 64
    add-int/2addr v2, v10

    .line 65
    if-gt v7, v2, :cond_c

    .line 66
    .line 67
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils;->SINGLE_SMALL_10_POW:[F

    .line 68
    .line 69
    aget v1, v0, v10

    .line 70
    .line 71
    mul-float/2addr v6, v1

    .line 72
    sub-int/2addr v7, v10

    .line 73
    aget v0, v0, v7

    .line 74
    .line 75
    mul-float/2addr v6, v0

    .line 76
    if-eqz p0, :cond_4

    .line 77
    .line 78
    neg-float v0, v6

    .line 79
    return v0

    .line 80
    :cond_4
    return v6

    .line 81
    :cond_5
    neg-int v2, v2

    .line 82
    if-lt v7, v2, :cond_c

    .line 83
    .line 84
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils;->SINGLE_SMALL_10_POW:[F

    .line 85
    .line 86
    neg-int v1, v7

    .line 87
    aget v0, v0, v1

    .line 88
    .line 89
    div-float/2addr v6, v0

    .line 90
    if-eqz p0, :cond_6

    .line 91
    .line 92
    neg-float v0, v6

    .line 93
    return v0

    .line 94
    :cond_6
    return v6

    .line 95
    :cond_7
    :goto_1
    if-eqz p0, :cond_8

    .line 96
    .line 97
    neg-float v0, v6

    .line 98
    return v0

    .line 99
    :cond_8
    return v6

    .line 100
    :cond_9
    if-lt v0, v1, :cond_c

    .line 101
    .line 102
    add-int v2, v1, v0

    .line 103
    .line 104
    const/16 v10, 0xf

    .line 105
    .line 106
    if-gt v2, v10, :cond_c

    .line 107
    .line 108
    int-to-long v2, v5

    .line 109
    :goto_2
    if-ge v9, v1, :cond_a

    .line 110
    .line 111
    const-wide/16 v4, 0xa

    .line 112
    .line 113
    mul-long/2addr v2, v4

    .line 114
    aget-char v4, p2, v9

    .line 115
    .line 116
    add-int/lit8 v4, v4, -0x30

    .line 117
    .line 118
    int-to-long v4, v4

    .line 119
    add-long/2addr v2, v4

    .line 120
    add-int/lit8 v9, v9, 0x1

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_a
    long-to-double v2, v2

    .line 124
    sub-int/2addr v0, v1

    .line 125
    sget-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 126
    .line 127
    aget-wide v0, v1, v0

    .line 128
    .line 129
    mul-double/2addr v2, v0

    .line 130
    double-to-float v0, v2

    .line 131
    if-eqz p0, :cond_b

    .line 132
    .line 133
    neg-float v0, v0

    .line 134
    :cond_b
    return v0

    .line 135
    :cond_c
    float-to-double v12, v6

    .line 136
    if-lez v7, :cond_11

    .line 137
    .line 138
    const/16 v2, 0x27

    .line 139
    .line 140
    if-le v0, v2, :cond_e

    .line 141
    .line 142
    if-eqz p0, :cond_d

    .line 143
    .line 144
    const/high16 v0, -0x800000    # Float.NEGATIVE_INFINITY

    .line 145
    .line 146
    return v0

    .line 147
    :cond_d
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 148
    .line 149
    return v0

    .line 150
    :cond_e
    and-int/lit8 v2, v7, 0xf

    .line 151
    .line 152
    if-eqz v2, :cond_f

    .line 153
    .line 154
    sget-object v6, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 155
    .line 156
    aget-wide v14, v6, v2

    .line 157
    .line 158
    mul-double/2addr v12, v14

    .line 159
    :cond_f
    shr-int/lit8 v2, v7, 0x4

    .line 160
    .line 161
    if-eqz v2, :cond_16

    .line 162
    .line 163
    move v6, v11

    .line 164
    :goto_3
    if-lez v2, :cond_16

    .line 165
    .line 166
    and-int/lit8 v7, v2, 0x1

    .line 167
    .line 168
    if-eqz v7, :cond_10

    .line 169
    .line 170
    sget-object v7, Lcom/alibaba/fastjson2/util/TypeUtils;->BIG_10_POW:[D

    .line 171
    .line 172
    aget-wide v14, v7, v6

    .line 173
    .line 174
    mul-double/2addr v12, v14

    .line 175
    :cond_10
    add-int/lit8 v6, v6, 0x1

    .line 176
    .line 177
    shr-int/lit8 v2, v2, 0x1

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_11
    if-gez v7, :cond_16

    .line 181
    .line 182
    neg-int v2, v7

    .line 183
    const/16 v6, -0x2e

    .line 184
    .line 185
    if-ge v0, v6, :cond_13

    .line 186
    .line 187
    if-eqz p0, :cond_12

    .line 188
    .line 189
    const/high16 v0, -0x80000000

    .line 190
    .line 191
    return v0

    .line 192
    :cond_12
    return v8

    .line 193
    :cond_13
    and-int/lit8 v6, v2, 0xf

    .line 194
    .line 195
    if-eqz v6, :cond_14

    .line 196
    .line 197
    sget-object v7, Lcom/alibaba/fastjson2/util/TypeUtils;->SMALL_10_POW:[D

    .line 198
    .line 199
    aget-wide v6, v7, v6

    .line 200
    .line 201
    div-double/2addr v12, v6

    .line 202
    :cond_14
    shr-int/lit8 v2, v2, 0x4

    .line 203
    .line 204
    if-eqz v2, :cond_16

    .line 205
    .line 206
    move v6, v11

    .line 207
    :goto_4
    if-lez v2, :cond_16

    .line 208
    .line 209
    and-int/lit8 v7, v2, 0x1

    .line 210
    .line 211
    if-eqz v7, :cond_15

    .line 212
    .line 213
    sget-object v7, Lcom/alibaba/fastjson2/util/TypeUtils;->TINY_10_POW:[D

    .line 214
    .line 215
    aget-wide v14, v7, v6

    .line 216
    .line 217
    mul-double/2addr v12, v14

    .line 218
    :cond_15
    add-int/lit8 v6, v6, 0x1

    .line 219
    .line 220
    shr-int/lit8 v2, v2, 0x1

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_16
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 224
    .line 225
    .line 226
    double-to-float v6, v12

    .line 227
    invoke-static {v2, v6}, Ljava/lang/Math;->min(FF)F

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    const/4 v6, 0x1

    .line 232
    invoke-static {v6, v2}, Ljava/lang/Math;->max(FF)F

    .line 233
    .line 234
    .line 235
    move-result v2

    .line 236
    const/16 v6, 0xc8

    .line 237
    .line 238
    if-le v1, v6, :cond_17

    .line 239
    .line 240
    const/16 v1, 0x31

    .line 241
    .line 242
    aput-char v1, p2, v6

    .line 243
    .line 244
    const/16 v1, 0xc9

    .line 245
    .line 246
    :cond_17
    move v10, v1

    .line 247
    new-instance v1, Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 248
    .line 249
    int-to-long v6, v5

    .line 250
    move-object/from16 v8, p2

    .line 251
    .line 252
    move-object v5, v1

    .line 253
    invoke-direct/range {v5 .. v10}, Lcom/alibaba/fastjson2/util/FDBigInteger;-><init>(J[CII)V

    .line 254
    .line 255
    .line 256
    sub-int/2addr v0, v10

    .line 257
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    neg-int v2, v0

    .line 262
    invoke-static {v11, v2}, Ljava/lang/Math;->max(II)I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    invoke-virtual {v5, v0, v11}, Lcom/alibaba/fastjson2/util/FDBigInteger;->multByPow52(II)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 271
    .line 272
    .line 273
    move-result-object v5

    .line 274
    iput-boolean v3, v5, Lcom/alibaba/fastjson2/util/FDBigInteger;->immutable:Z

    .line 275
    .line 276
    const/4 v6, 0x0

    .line 277
    move v7, v11

    .line 278
    :goto_5
    ushr-int/lit8 v8, v1, 0x17

    .line 279
    .line 280
    const v9, 0x7fffff

    .line 281
    .line 282
    .line 283
    and-int/2addr v9, v1

    .line 284
    if-lez v8, :cond_18

    .line 285
    .line 286
    const/high16 v10, 0x800000

    .line 287
    .line 288
    or-int/2addr v9, v10

    .line 289
    goto :goto_6

    .line 290
    :cond_18
    invoke-static {v9}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    sub-int/2addr v8, v4

    .line 295
    shl-int/2addr v9, v8

    .line 296
    rsub-int/lit8 v8, v8, 0x1

    .line 297
    .line 298
    :goto_6
    add-int/lit8 v10, v8, -0x7f

    .line 299
    .line 300
    invoke-static {v9}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 301
    .line 302
    .line 303
    move-result v12

    .line 304
    ushr-int/2addr v9, v12

    .line 305
    add-int/lit16 v8, v8, -0x96

    .line 306
    .line 307
    add-int/2addr v8, v12

    .line 308
    rsub-int/lit8 v13, v12, 0x18

    .line 309
    .line 310
    if-ltz v8, :cond_19

    .line 311
    .line 312
    add-int v14, v2, v8

    .line 313
    .line 314
    move v15, v0

    .line 315
    goto :goto_7

    .line 316
    :cond_19
    sub-int v14, v0, v8

    .line 317
    .line 318
    move v15, v14

    .line 319
    move v14, v2

    .line 320
    :goto_7
    const/16 v4, -0x7f

    .line 321
    .line 322
    if-gt v10, v4, :cond_1a

    .line 323
    .line 324
    add-int/2addr v10, v12

    .line 325
    add-int/lit8 v10, v10, 0x7f

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_1a
    add-int/lit8 v10, v12, 0x1

    .line 329
    .line 330
    :goto_8
    add-int v4, v14, v10

    .line 331
    .line 332
    add-int/2addr v15, v10

    .line 333
    invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I

    .line 334
    .line 335
    .line 336
    move-result v10

    .line 337
    invoke-static {v4, v10}, Ljava/lang/Math;->min(II)I

    .line 338
    .line 339
    .line 340
    move-result v10

    .line 341
    sub-int/2addr v4, v10

    .line 342
    sub-int/2addr v15, v10

    .line 343
    sub-int/2addr v14, v10

    .line 344
    int-to-long v9, v9

    .line 345
    invoke-static {v9, v10, v2, v4}, Lcom/alibaba/fastjson2/util/FDBigInteger;->valueOfMulPow52(JII)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    if-eqz v6, :cond_1b

    .line 350
    .line 351
    if-eq v7, v15, :cond_1c

    .line 352
    .line 353
    :cond_1b
    invoke-virtual {v5, v15}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    move v7, v15

    .line 358
    :cond_1c
    invoke-virtual {v4, v6}, Lcom/alibaba/fastjson2/util/FDBigInteger;->cmp(Lcom/alibaba/fastjson2/util/FDBigInteger;)I

    .line 359
    .line 360
    .line 361
    move-result v9

    .line 362
    if-lez v9, :cond_1e

    .line 363
    .line 364
    invoke-virtual {v4, v6}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftInplaceSub(Lcom/alibaba/fastjson2/util/FDBigInteger;)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    if-ne v13, v3, :cond_1d

    .line 369
    .line 370
    const/16 v9, -0x7e

    .line 371
    .line 372
    if-le v8, v9, :cond_1d

    .line 373
    .line 374
    add-int/lit8 v14, v14, -0x1

    .line 375
    .line 376
    if-gez v14, :cond_1d

    .line 377
    .line 378
    invoke-virtual {v4, v3}, Lcom/alibaba/fastjson2/util/FDBigInteger;->leftShift(I)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    move v8, v3

    .line 383
    move v14, v11

    .line 384
    goto :goto_9

    .line 385
    :cond_1d
    move v8, v3

    .line 386
    goto :goto_9

    .line 387
    :cond_1e
    if-gez v9, :cond_24

    .line 388
    .line 389
    invoke-virtual {v6, v4}, Lcom/alibaba/fastjson2/util/FDBigInteger;->rightInplaceSub(Lcom/alibaba/fastjson2/util/FDBigInteger;)Lcom/alibaba/fastjson2/util/FDBigInteger;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    move v8, v11

    .line 394
    :goto_9
    invoke-virtual {v4, v2, v14}, Lcom/alibaba/fastjson2/util/FDBigInteger;->cmpPow52(II)I

    .line 395
    .line 396
    .line 397
    move-result v4

    .line 398
    if-gez v4, :cond_1f

    .line 399
    .line 400
    goto :goto_b

    .line 401
    :cond_1f
    const/4 v9, -0x1

    .line 402
    if-nez v4, :cond_21

    .line 403
    .line 404
    and-int/lit8 v0, v1, 0x1

    .line 405
    .line 406
    if-eqz v0, :cond_24

    .line 407
    .line 408
    if-eqz v8, :cond_20

    .line 409
    .line 410
    move v3, v9

    .line 411
    :cond_20
    add-int/2addr v1, v3

    .line 412
    goto :goto_b

    .line 413
    :cond_21
    if-eqz v8, :cond_22

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_22
    move v9, v3

    .line 417
    :goto_a
    add-int/2addr v1, v9

    .line 418
    if-eqz v1, :cond_24

    .line 419
    .line 420
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 421
    .line 422
    if-ne v1, v4, :cond_23

    .line 423
    .line 424
    goto :goto_b

    .line 425
    :cond_23
    const/16 v4, 0x8

    .line 426
    .line 427
    goto/16 :goto_5

    .line 428
    .line 429
    :cond_24
    :goto_b
    if-eqz p0, :cond_25

    .line 430
    .line 431
    const/high16 v0, -0x80000000

    .line 432
    .line 433
    or-int/2addr v1, v0

    .line 434
    :cond_25
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    return v0
.end method

.method public static getArrayClass(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-class p0, [I

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 9
    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    const-class p0, [B

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 16
    .line 17
    if-ne p0, v0, :cond_2

    .line 18
    .line 19
    const-class p0, [S

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_2
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne p0, v0, :cond_3

    .line 25
    .line 26
    const-class p0, [J

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    const-class v0, Ljava/lang/String;

    .line 30
    .line 31
    if-ne p0, v0, :cond_4

    .line 32
    .line 33
    const-class p0, [Ljava/lang/String;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_4
    const-class v0, Ljava/lang/Object;

    .line 37
    .line 38
    if-ne p0, v0, :cond_5

    .line 39
    .line 40
    const-class p0, [Ljava/lang/Object;

    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_5
    const/4 v0, 0x1

    .line 44
    invoke-static {p0, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/Class;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Class;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    aget-object p0, p0, v1

    .line 43
    .line 44
    instance-of v0, p0, Ljava/lang/Class;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    check-cast p0, Ljava/lang/Class;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    check-cast v0, Ljava/lang/reflect/WildcardType;

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    array-length v2, v0

    .line 68
    const/4 v3, 0x1

    .line 69
    if-ne v2, v3, :cond_5

    .line 70
    .line 71
    aget-object p0, v0, v1

    .line 72
    .line 73
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_5
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getArrayClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_6
    const-class p0, Ljava/lang/Object;

    .line 98
    .line 99
    return-object p0
.end method

.method public static getDefaultValue(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    if-ne p0, v0, :cond_1

    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    if-ne p0, v0, :cond_2

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    if-ne p0, v0, :cond_3

    .line 35
    .line 36
    const-wide/16 v0, 0x0

    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-ne p0, v0, :cond_4

    .line 46
    .line 47
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_4
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    if-ne p0, v0, :cond_5

    .line 53
    .line 54
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_5
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    if-ne p0, v0, :cond_6

    .line 62
    .line 63
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_6
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    if-ne p0, v0, :cond_7

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :cond_7
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public static getInnerMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getInnerMap()Ljava/util/function/Function;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/util/Map;

    .line 10
    .line 11
    return-object p0
.end method

.method public static getMapValueType(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    array-length v0, p0

    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aget-object p0, p0, v0

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    const-class p0, Ljava/lang/Object;

    .line 20
    .line 21
    return-object p0
.end method

.method public static getMapping(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 100
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->TYPE_MAPPINGS:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Class;

    return-object p0
.end method

.method public static getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ljava/lang/Class;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Class;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    instance-of v0, p0, Ljava/lang/reflect/TypeVariable;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    check-cast p0, Ljava/lang/reflect/TypeVariable;

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    aget-object p0, p0, v1

    .line 43
    .line 44
    instance-of v0, p0, Ljava/lang/Class;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    check-cast p0, Ljava/lang/Class;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_4
    instance-of v0, p0, Ljava/lang/reflect/WildcardType;

    .line 57
    .line 58
    if-eqz v0, :cond_5

    .line 59
    .line 60
    move-object v0, p0

    .line 61
    check-cast v0, Ljava/lang/reflect/WildcardType;

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    array-length v2, v0

    .line 68
    const/4 v3, 0x1

    .line 69
    if-ne v2, v3, :cond_5

    .line 70
    .line 71
    aget-object p0, v0, v1

    .line 72
    .line 73
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_5
    instance-of v0, p0, Ljava/lang/reflect/GenericArrayType;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    check-cast p0, Ljava/lang/reflect/GenericArrayType;

    .line 83
    .line 84
    invoke-interface {p0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getArrayClass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_6
    const-class p0, Ljava/lang/Object;

    .line 98
    .line 99
    return-object p0
.end method

.method public static getTypeName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "java.util.HashMap"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_8

    .line 12
    .line 13
    const-string v1, "java.util.ArrayList"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_7

    .line 20
    .line 21
    const-string v1, "com.alibaba.fastjson.JSONObject"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_6

    .line 28
    .line 29
    const-string v1, "com.alibaba.fastjson.JSONArray"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_5

    .line 36
    .line 37
    const-string v1, "java.util.List"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    const-string v1, "com.alibaba.fastjson2.JSONArray"

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    const-string v1, "java.lang.Object"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    const-string v1, "com.alibaba.fastjson2.JSONObject"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    sget-object v1, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->NAME_MAPPINGS:Ljava/util/Map;

    .line 70
    .line 71
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v1, :cond_0

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_0
    const/16 v1, 0x24

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    const/4 v2, -0x1

    .line 87
    if-eq v1, v2, :cond_4

    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->isInteger(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-class v1, Ljava/util/Map;

    .line 106
    .line 107
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_1
    const-string p0, "JSONObject"

    .line 119
    .line 120
    return-object p0

    .line 121
    :cond_2
    const-string p0, "Object"

    .line 122
    .line 123
    return-object p0

    .line 124
    :cond_3
    const-string p0, "JSONArray"

    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_4
    return-object v0

    .line 128
    :cond_5
    const-string p0, "JA1"

    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_6
    const-string p0, "JO1"

    .line 132
    .line 133
    return-object p0

    .line 134
    :cond_7
    const-string p0, "A"

    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_8
    const-string p0, "M"

    .line 138
    .line 139
    return-object p0
.end method

.method public static getTypeName(Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 1

    .line 140
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 141
    check-cast p0, Ljava/lang/Class;

    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 142
    :cond_0
    const-string p0, "<non-class>"

    return-object p0
.end method

.method public static intern(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 3

    .line 1
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-class v2, Ljava/util/List;

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    array-length v1, v0

    .line 21
    const/4 v2, 0x1

    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    aget-object v0, v0, v1

    .line 26
    .line 27
    const-class v1, Ljava/lang/String;

    .line 28
    .line 29
    if-ne v0, v1, :cond_0

    .line 30
    .line 31
    sget-object p0, Lcom/alibaba/fastjson2/util/TypeUtils;->PARAM_TYPE_LIST_STR:Ljava/lang/reflect/ParameterizedType;

    .line 32
    .line 33
    :cond_0
    return-object p0
.end method

.method public static isInteger(Ljava/lang/String;)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_8

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_3

    .line 11
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x2d

    .line 16
    .line 17
    const/16 v3, 0x39

    .line 18
    .line 19
    const/16 v4, 0x30

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    if-eq v1, v2, :cond_3

    .line 23
    .line 24
    const/16 v2, 0x2b

    .line 25
    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    if-lt v1, v4, :cond_2

    .line 30
    .line 31
    if-le v1, v3, :cond_4

    .line 32
    .line 33
    :cond_2
    return v0

    .line 34
    :cond_3
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-ne v1, v5, :cond_4

    .line 39
    .line 40
    return v0

    .line 41
    :cond_4
    move v1, v5

    .line 42
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ge v1, v2, :cond_7

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-lt v2, v4, :cond_6

    .line 53
    .line 54
    if-le v2, v3, :cond_5

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_6
    :goto_2
    return v0

    .line 61
    :cond_7
    return v5

    .line 62
    :cond_8
    :goto_3
    return v0
.end method

.method public static isInteger([BII)Z
    .locals 6

    const/4 v0, 0x0

    if-eqz p0, :cond_8

    if-nez p2, :cond_0

    goto :goto_3

    .line 63
    :cond_0
    aget-byte v1, p0, p1

    int-to-char v1, v1

    const/16 v2, 0x2d

    const/16 v3, 0x39

    const/16 v4, 0x30

    const/4 v5, 0x1

    if-eq v1, v2, :cond_3

    const/16 v2, 0x2b

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    if-lt v1, v4, :cond_2

    if-le v1, v3, :cond_4

    :cond_2
    return v0

    :cond_3
    :goto_0
    if-ne p2, v5, :cond_4

    return v0

    :cond_4
    add-int/2addr p2, p1

    add-int/2addr p1, v5

    :goto_1
    if-ge p1, p2, :cond_7

    .line 64
    aget-byte v1, p0, p1

    int-to-char v1, v1

    if-lt v1, v4, :cond_6

    if-le v1, v3, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_6
    :goto_2
    return v0

    :cond_7
    return v5

    :cond_8
    :goto_3
    return v0
.end method

.method public static isNumber(Ljava/lang/String;)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_19

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_c

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/16 v2, 0x2b

    .line 17
    .line 18
    const/16 v3, 0x2d

    .line 19
    .line 20
    const/16 v4, 0x2e

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    if-eq v1, v3, :cond_4

    .line 24
    .line 25
    if-ne v1, v2, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    if-ne v1, v4, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-ne v6, v5, :cond_2

    .line 35
    .line 36
    return v0

    .line 37
    :cond_2
    :goto_0
    move v6, v5

    .line 38
    goto :goto_2

    .line 39
    :cond_3
    move v6, v0

    .line 40
    goto :goto_2

    .line 41
    :cond_4
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-ne v1, v5, :cond_5

    .line 46
    .line 47
    return v0

    .line 48
    :cond_5
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    goto :goto_0

    .line 53
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-ne v1, v4, :cond_6

    .line 58
    .line 59
    move v8, v5

    .line 60
    goto :goto_3

    .line 61
    :cond_6
    move v8, v0

    .line 62
    :goto_3
    const/16 v9, 0x39

    .line 63
    .line 64
    const/16 v10, 0x30

    .line 65
    .line 66
    if-nez v8, :cond_a

    .line 67
    .line 68
    if-lt v1, v10, :cond_a

    .line 69
    .line 70
    if-gt v1, v9, :cond_a

    .line 71
    .line 72
    :goto_4
    if-ge v6, v7, :cond_9

    .line 73
    .line 74
    add-int/lit8 v1, v6, 0x1

    .line 75
    .line 76
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-lt v6, v10, :cond_8

    .line 81
    .line 82
    if-le v6, v9, :cond_7

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_7
    move v6, v1

    .line 86
    goto :goto_4

    .line 87
    :cond_8
    :goto_5
    move v8, v6

    .line 88
    move v6, v1

    .line 89
    move v1, v8

    .line 90
    move v8, v5

    .line 91
    goto :goto_6

    .line 92
    :cond_9
    return v5

    .line 93
    :cond_a
    move v8, v0

    .line 94
    :goto_6
    if-ne v1, v4, :cond_10

    .line 95
    .line 96
    if-ge v6, v7, :cond_f

    .line 97
    .line 98
    add-int/lit8 v1, v6, 0x1

    .line 99
    .line 100
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    if-lt v4, v10, :cond_e

    .line 105
    .line 106
    if-gt v4, v9, :cond_e

    .line 107
    .line 108
    :goto_7
    if-ge v1, v7, :cond_d

    .line 109
    .line 110
    add-int/lit8 v6, v1, 0x1

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-lt v1, v10, :cond_c

    .line 117
    .line 118
    if-le v1, v9, :cond_b

    .line 119
    .line 120
    goto :goto_8

    .line 121
    :cond_b
    move v1, v6

    .line 122
    goto :goto_7

    .line 123
    :cond_c
    :goto_8
    move v4, v5

    .line 124
    goto :goto_9

    .line 125
    :cond_d
    return v5

    .line 126
    :cond_e
    move v6, v1

    .line 127
    move v1, v4

    .line 128
    goto :goto_8

    .line 129
    :cond_f
    return v5

    .line 130
    :cond_10
    move v4, v0

    .line 131
    :goto_9
    if-nez v8, :cond_11

    .line 132
    .line 133
    if-nez v4, :cond_11

    .line 134
    .line 135
    return v0

    .line 136
    :cond_11
    const/16 v4, 0x65

    .line 137
    .line 138
    if-eq v1, v4, :cond_12

    .line 139
    .line 140
    const/16 v4, 0x45

    .line 141
    .line 142
    if-ne v1, v4, :cond_17

    .line 143
    .line 144
    :cond_12
    if-ne v6, v7, :cond_13

    .line 145
    .line 146
    return v5

    .line 147
    :cond_13
    add-int/lit8 v1, v6, 0x1

    .line 148
    .line 149
    invoke-virtual {p0, v6}, Ljava/lang/String;->charAt(I)C

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eq v4, v2, :cond_14

    .line 154
    .line 155
    if-ne v4, v3, :cond_15

    .line 156
    .line 157
    :cond_14
    if-ge v1, v7, :cond_19

    .line 158
    .line 159
    add-int/lit8 v6, v6, 0x2

    .line 160
    .line 161
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    move v1, v6

    .line 166
    :cond_15
    if-lt v4, v10, :cond_19

    .line 167
    .line 168
    if-gt v4, v9, :cond_19

    .line 169
    .line 170
    :goto_a
    if-ge v1, v7, :cond_18

    .line 171
    .line 172
    add-int/lit8 v2, v1, 0x1

    .line 173
    .line 174
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-lt v1, v10, :cond_17

    .line 179
    .line 180
    if-le v1, v9, :cond_16

    .line 181
    .line 182
    goto :goto_b

    .line 183
    :cond_16
    move v1, v2

    .line 184
    goto :goto_a

    .line 185
    :cond_17
    :goto_b
    return v0

    .line 186
    :cond_18
    return v5

    .line 187
    :cond_19
    :goto_c
    return v0
.end method

.method public static isNumber([BII)Z
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_19

    if-nez p2, :cond_0

    goto/16 :goto_b

    .line 188
    :cond_0
    aget-byte v1, p0, p1

    int-to-char v1, v1

    const/16 v2, 0x2b

    const/16 v3, 0x2d

    const/16 v4, 0x2e

    const/4 v5, 0x1

    if-eq v1, v3, :cond_4

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    if-ne v1, v4, :cond_3

    if-ne p2, v5, :cond_2

    return v0

    :cond_2
    add-int/lit8 v6, p1, 0x1

    goto :goto_1

    :cond_3
    move v6, p1

    goto :goto_1

    :cond_4
    :goto_0
    if-ne p2, v5, :cond_5

    return v0

    :cond_5
    add-int/lit8 v6, p1, 0x1

    .line 189
    aget-byte v1, p0, v6

    int-to-char v1, v1

    :goto_1
    add-int/2addr p1, p2

    if-ne v1, v4, :cond_6

    move p2, v5

    goto :goto_2

    :cond_6
    move p2, v0

    :goto_2
    const/16 v7, 0x39

    const/16 v8, 0x30

    if-nez p2, :cond_a

    if-lt v1, v8, :cond_a

    if-gt v1, v7, :cond_a

    :goto_3
    if-ge v6, p1, :cond_9

    add-int/lit8 p2, v6, 0x1

    .line 190
    aget-byte v1, p0, v6

    int-to-char v1, v1

    if-lt v1, v8, :cond_8

    if-le v1, v7, :cond_7

    goto :goto_4

    :cond_7
    move v6, p2

    goto :goto_3

    :cond_8
    :goto_4
    move v6, p2

    move p2, v5

    goto :goto_5

    :cond_9
    return v5

    :cond_a
    move p2, v0

    :goto_5
    if-ne v1, v4, :cond_10

    if-ge v6, p1, :cond_f

    add-int/lit8 v1, v6, 0x1

    .line 191
    aget-byte v4, p0, v6

    int-to-char v4, v4

    if-lt v4, v8, :cond_e

    if-gt v4, v7, :cond_e

    :goto_6
    if-ge v1, p1, :cond_d

    add-int/lit8 v6, v1, 0x1

    .line 192
    aget-byte v1, p0, v1

    int-to-char v1, v1

    if-lt v1, v8, :cond_c

    if-le v1, v7, :cond_b

    goto :goto_7

    :cond_b
    move v1, v6

    goto :goto_6

    :cond_c
    :goto_7
    move v4, v5

    goto :goto_8

    :cond_d
    return v5

    :cond_e
    move v6, v1

    move v1, v4

    goto :goto_7

    :cond_f
    return v5

    :cond_10
    move v4, v0

    :goto_8
    if-nez p2, :cond_11

    if-nez v4, :cond_11

    return v0

    :cond_11
    const/16 p2, 0x65

    if-eq v1, p2, :cond_12

    const/16 p2, 0x45

    if-ne v1, p2, :cond_17

    :cond_12
    if-ne v6, p1, :cond_13

    return v5

    :cond_13
    add-int/lit8 p2, v6, 0x1

    .line 193
    aget-byte v1, p0, v6

    int-to-char v1, v1

    if-eq v1, v2, :cond_14

    if-ne v1, v3, :cond_15

    :cond_14
    if-ge p2, p1, :cond_19

    add-int/lit8 v6, v6, 0x2

    .line 194
    aget-byte p2, p0, p2

    int-to-char v1, p2

    move p2, v6

    :cond_15
    if-lt v1, v8, :cond_19

    if-gt v1, v7, :cond_19

    :goto_9
    if-ge p2, p1, :cond_18

    add-int/lit8 v1, p2, 0x1

    .line 195
    aget-byte p2, p0, p2

    int-to-char p2, p2

    if-lt p2, v8, :cond_17

    if-le p2, v7, :cond_16

    goto :goto_a

    :cond_16
    move p2, v1

    goto :goto_9

    :cond_17
    :goto_a
    return v0

    :cond_18
    return v5

    :cond_19
    :goto_b
    return v0
.end method

.method public static isNumber([CII)Z
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_19

    if-nez p2, :cond_0

    goto/16 :goto_b

    .line 196
    :cond_0
    aget-char v1, p0, p1

    const/16 v2, 0x2b

    const/16 v3, 0x2d

    const/16 v4, 0x2e

    const/4 v5, 0x1

    if-eq v1, v3, :cond_4

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    if-ne v1, v4, :cond_3

    if-ne p2, v5, :cond_2

    return v0

    :cond_2
    add-int/lit8 v6, p1, 0x1

    goto :goto_1

    :cond_3
    move v6, p1

    goto :goto_1

    :cond_4
    :goto_0
    if-ne p2, v5, :cond_5

    return v0

    :cond_5
    add-int/lit8 v6, p1, 0x1

    .line 197
    aget-char v1, p0, v6

    :goto_1
    add-int/2addr p1, p2

    if-ne v1, v4, :cond_6

    move p2, v5

    goto :goto_2

    :cond_6
    move p2, v0

    :goto_2
    const/16 v7, 0x39

    const/16 v8, 0x30

    if-nez p2, :cond_a

    if-lt v1, v8, :cond_a

    if-gt v1, v7, :cond_a

    :goto_3
    if-ge v6, p1, :cond_9

    add-int/lit8 p2, v6, 0x1

    .line 198
    aget-char v1, p0, v6

    if-lt v1, v8, :cond_8

    if-le v1, v7, :cond_7

    goto :goto_4

    :cond_7
    move v6, p2

    goto :goto_3

    :cond_8
    :goto_4
    move v6, p2

    move p2, v5

    goto :goto_5

    :cond_9
    return v5

    :cond_a
    move p2, v0

    :goto_5
    if-ne v1, v4, :cond_10

    if-ge v6, p1, :cond_f

    add-int/lit8 v1, v6, 0x1

    .line 199
    aget-char v4, p0, v6

    if-lt v4, v8, :cond_e

    if-gt v4, v7, :cond_e

    :goto_6
    if-ge v1, p1, :cond_d

    add-int/lit8 v6, v1, 0x1

    .line 200
    aget-char v1, p0, v1

    if-lt v1, v8, :cond_c

    if-le v1, v7, :cond_b

    goto :goto_7

    :cond_b
    move v1, v6

    goto :goto_6

    :cond_c
    :goto_7
    move v4, v5

    goto :goto_8

    :cond_d
    return v5

    :cond_e
    move v6, v1

    move v1, v4

    goto :goto_7

    :cond_f
    return v5

    :cond_10
    move v4, v0

    :goto_8
    if-nez p2, :cond_11

    if-nez v4, :cond_11

    return v0

    :cond_11
    const/16 p2, 0x65

    if-eq v1, p2, :cond_12

    const/16 p2, 0x45

    if-ne v1, p2, :cond_17

    :cond_12
    if-ne v6, p1, :cond_13

    return v5

    :cond_13
    add-int/lit8 p2, v6, 0x1

    .line 201
    aget-char v1, p0, v6

    if-eq v1, v2, :cond_14

    if-ne v1, v3, :cond_15

    :cond_14
    if-ge p2, p1, :cond_19

    add-int/lit8 v6, v6, 0x2

    .line 202
    aget-char v1, p0, p2

    move p2, v6

    :cond_15
    if-lt v1, v8, :cond_19

    if-gt v1, v7, :cond_19

    :goto_9
    if-ge p2, p1, :cond_18

    add-int/lit8 v1, p2, 0x1

    .line 203
    aget-char p2, p0, p2

    if-lt p2, v8, :cond_17

    if-le p2, v7, :cond_16

    goto :goto_a

    :cond_16
    move p2, v1

    goto :goto_9

    :cond_17
    :goto_a
    return v0

    :cond_18
    return v5

    :cond_19
    :goto_b
    return v0
.end method

.method public static isUUID(Ljava/lang/String;)Z
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/16 v2, 0x66

    .line 10
    .line 11
    const/16 v3, 0x61

    .line 12
    .line 13
    const/16 v4, 0x46

    .line 14
    .line 15
    const/16 v5, 0x41

    .line 16
    .line 17
    const/16 v6, 0x39

    .line 18
    .line 19
    const/16 v7, 0x30

    .line 20
    .line 21
    const/16 v8, 0x20

    .line 22
    .line 23
    const/4 v9, 0x1

    .line 24
    if-ne v1, v8, :cond_6

    .line 25
    .line 26
    move v1, v0

    .line 27
    :goto_0
    if-ge v1, v8, :cond_5

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    if-lt v10, v7, :cond_1

    .line 34
    .line 35
    if-le v10, v6, :cond_3

    .line 36
    .line 37
    :cond_1
    if-lt v10, v5, :cond_2

    .line 38
    .line 39
    if-le v10, v4, :cond_3

    .line 40
    .line 41
    :cond_2
    if-lt v10, v3, :cond_4

    .line 42
    .line 43
    if-gt v10, v2, :cond_4

    .line 44
    .line 45
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    return v0

    .line 49
    :cond_5
    return v9

    .line 50
    :cond_6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/16 v8, 0x24

    .line 55
    .line 56
    if-ne v1, v8, :cond_e

    .line 57
    .line 58
    move v1, v0

    .line 59
    :goto_1
    if-ge v1, v8, :cond_d

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    const/16 v11, 0x8

    .line 66
    .line 67
    if-eq v1, v11, :cond_b

    .line 68
    .line 69
    const/16 v11, 0xd

    .line 70
    .line 71
    if-eq v1, v11, :cond_b

    .line 72
    .line 73
    const/16 v11, 0x12

    .line 74
    .line 75
    if-eq v1, v11, :cond_b

    .line 76
    .line 77
    const/16 v11, 0x17

    .line 78
    .line 79
    if-ne v1, v11, :cond_7

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_7
    if-lt v10, v7, :cond_8

    .line 83
    .line 84
    if-le v10, v6, :cond_c

    .line 85
    .line 86
    :cond_8
    if-lt v10, v5, :cond_9

    .line 87
    .line 88
    if-le v10, v4, :cond_c

    .line 89
    .line 90
    :cond_9
    if-lt v10, v3, :cond_a

    .line 91
    .line 92
    if-gt v10, v2, :cond_a

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_a
    return v0

    .line 96
    :cond_b
    :goto_2
    const/16 v11, 0x2d

    .line 97
    .line 98
    if-eq v10, v11, :cond_c

    .line 99
    .line 100
    return v0

    .line 101
    :cond_c
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_d
    return v9

    .line 105
    :cond_e
    return v0
.end method

.method public static loadClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xc0

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    return-object v2

    .line 11
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x4c

    .line 16
    .line 17
    const/16 v3, 0x3b

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x1

    .line 22
    const/4 v7, -0x1

    .line 23
    sparse-switch v0, :sswitch_data_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :sswitch_0
    const-string v0, "short[]"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    goto/16 :goto_0

    .line 37
    .line 38
    :cond_1
    const/16 v7, 0x50

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :sswitch_1
    const-string v0, "boolean[]"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    goto/16 :goto_0

    .line 51
    .line 52
    :cond_2
    const/16 v7, 0x4f

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :sswitch_2
    const-string v0, "JSONObject"

    .line 57
    .line 58
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_3

    .line 63
    .line 64
    goto/16 :goto_0

    .line 65
    .line 66
    :cond_3
    const/16 v7, 0x4e

    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :sswitch_3
    const-string v0, "[String"

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    goto/16 :goto_0

    .line 79
    .line 80
    :cond_4
    const/16 v7, 0x4d

    .line 81
    .line 82
    goto/16 :goto_0

    .line 83
    .line 84
    :sswitch_4
    const-string v0, "ConcurrentHashMap"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_5

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :cond_5
    move v7, v1

    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :sswitch_5
    const-string v0, "double[]"

    .line 98
    .line 99
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_6

    .line 104
    .line 105
    goto/16 :goto_0

    .line 106
    .line 107
    :cond_6
    const/16 v7, 0x4b

    .line 108
    .line 109
    goto/16 :goto_0

    .line 110
    .line 111
    :sswitch_6
    const-string v0, "java.util.LinkedHashSet"

    .line 112
    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_7

    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :cond_7
    const/16 v7, 0x4a

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :sswitch_7
    const-string v0, "java.util.LinkedHashMap"

    .line 126
    .line 127
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-nez v0, :cond_8

    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_8
    const/16 v7, 0x49

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :sswitch_8
    const-string v0, "java.lang.String"

    .line 140
    .line 141
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_9

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_9
    const/16 v7, 0x48

    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :sswitch_9
    const-string v0, "java.util.TreeSet"

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_a

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_a
    const/16 v7, 0x47

    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :sswitch_a
    const-string v0, "java.lang.Object"

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-nez v0, :cond_b

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_b
    const/16 v7, 0x46

    .line 178
    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :sswitch_b
    const-string v0, "java.util.Collections$SingletonSet"

    .line 182
    .line 183
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-nez v0, :cond_c

    .line 188
    .line 189
    goto/16 :goto_0

    .line 190
    .line 191
    :cond_c
    const/16 v7, 0x45

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :sswitch_c
    const-string v0, "java.util.Collections$UnmodifiableRandomAccessList"

    .line 196
    .line 197
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-nez v0, :cond_d

    .line 202
    .line 203
    goto/16 :goto_0

    .line 204
    .line 205
    :cond_d
    const/16 v7, 0x44

    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :sswitch_d
    const-string v0, "TreeSet"

    .line 210
    .line 211
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-nez v0, :cond_e

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_e
    const/16 v7, 0x43

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :sswitch_e
    const-string v0, "ArrayList"

    .line 224
    .line 225
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-nez v0, :cond_f

    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_f
    const/16 v7, 0x42

    .line 234
    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :sswitch_f
    const-string v0, "java.lang.Long"

    .line 238
    .line 239
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-nez v0, :cond_10

    .line 244
    .line 245
    goto/16 :goto_0

    .line 246
    .line 247
    :cond_10
    const/16 v7, 0x41

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :sswitch_10
    const-string v0, "java.util.Arrays$ArrayList"

    .line 252
    .line 253
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-nez v0, :cond_11

    .line 258
    .line 259
    goto/16 :goto_0

    .line 260
    .line 261
    :cond_11
    const/16 v7, 0x40

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :sswitch_11
    const-string v0, "short"

    .line 266
    .line 267
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_12

    .line 272
    .line 273
    goto/16 :goto_0

    .line 274
    .line 275
    :cond_12
    const/16 v7, 0x3f

    .line 276
    .line 277
    goto/16 :goto_0

    .line 278
    .line 279
    :sswitch_12
    const-string v0, "int[]"

    .line 280
    .line 281
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_13

    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :cond_13
    const/16 v7, 0x3e

    .line 290
    .line 291
    goto/16 :goto_0

    .line 292
    .line 293
    :sswitch_13
    const-string v0, "float"

    .line 294
    .line 295
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-nez v0, :cond_14

    .line 300
    .line 301
    goto/16 :goto_0

    .line 302
    .line 303
    :cond_14
    const/16 v7, 0x3d

    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :sswitch_14
    const-string v0, "java.util.List"

    .line 308
    .line 309
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-nez v0, :cond_15

    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_15
    const/16 v7, 0x3c

    .line 318
    .line 319
    goto/16 :goto_0

    .line 320
    .line 321
    :sswitch_15
    const-string v0, "boolean"

    .line 322
    .line 323
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-nez v0, :cond_16

    .line 328
    .line 329
    goto/16 :goto_0

    .line 330
    .line 331
    :cond_16
    move v7, v3

    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :sswitch_16
    const-string v0, "java.util.Collections$EmptyList"

    .line 335
    .line 336
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-nez v0, :cond_17

    .line 341
    .line 342
    goto/16 :goto_0

    .line 343
    .line 344
    :cond_17
    const/16 v7, 0x3a

    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :sswitch_17
    const-string v0, "long"

    .line 349
    .line 350
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-nez v0, :cond_18

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_18
    const/16 v7, 0x39

    .line 359
    .line 360
    goto/16 :goto_0

    .line 361
    .line 362
    :sswitch_18
    const-string v0, "char"

    .line 363
    .line 364
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    if-nez v0, :cond_19

    .line 369
    .line 370
    goto/16 :goto_0

    .line 371
    .line 372
    :cond_19
    const/16 v7, 0x38

    .line 373
    .line 374
    goto/16 :goto_0

    .line 375
    .line 376
    :sswitch_19
    const-string v0, "byte"

    .line 377
    .line 378
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v0

    .line 382
    if-nez v0, :cond_1a

    .line 383
    .line 384
    goto/16 :goto_0

    .line 385
    .line 386
    :cond_1a
    const/16 v7, 0x37

    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :sswitch_1a
    const-string v0, "UUID"

    .line 391
    .line 392
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-nez v0, :cond_1b

    .line 397
    .line 398
    goto/16 :goto_0

    .line 399
    .line 400
    :cond_1b
    const/16 v7, 0x36

    .line 401
    .line 402
    goto/16 :goto_0

    .line 403
    .line 404
    :sswitch_1b
    const-string v0, "List"

    .line 405
    .line 406
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-nez v0, :cond_1c

    .line 411
    .line 412
    goto/16 :goto_0

    .line 413
    .line 414
    :cond_1c
    const/16 v7, 0x35

    .line 415
    .line 416
    goto/16 :goto_0

    .line 417
    .line 418
    :sswitch_1c
    const-string v0, "Date"

    .line 419
    .line 420
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    if-nez v0, :cond_1d

    .line 425
    .line 426
    goto/16 :goto_0

    .line 427
    .line 428
    :cond_1d
    const/16 v7, 0x34

    .line 429
    .line 430
    goto/16 :goto_0

    .line 431
    .line 432
    :sswitch_1d
    const-string v0, "int"

    .line 433
    .line 434
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-nez v0, :cond_1e

    .line 439
    .line 440
    goto/16 :goto_0

    .line 441
    .line 442
    :cond_1e
    const/16 v7, 0x33

    .line 443
    .line 444
    goto/16 :goto_0

    .line 445
    .line 446
    :sswitch_1e
    const-string v0, "Set"

    .line 447
    .line 448
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    move-result v0

    .line 452
    if-nez v0, :cond_1f

    .line 453
    .line 454
    goto/16 :goto_0

    .line 455
    .line 456
    :cond_1f
    const/16 v7, 0x32

    .line 457
    .line 458
    goto/16 :goto_0

    .line 459
    .line 460
    :sswitch_1f
    const-string v0, "Map"

    .line 461
    .line 462
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    if-nez v0, :cond_20

    .line 467
    .line 468
    goto/16 :goto_0

    .line 469
    .line 470
    :cond_20
    const/16 v7, 0x31

    .line 471
    .line 472
    goto/16 :goto_0

    .line 473
    .line 474
    :sswitch_20
    const-string v0, "JO1"

    .line 475
    .line 476
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    move-result v0

    .line 480
    if-nez v0, :cond_21

    .line 481
    .line 482
    goto/16 :goto_0

    .line 483
    .line 484
    :cond_21
    const/16 v7, 0x30

    .line 485
    .line 486
    goto/16 :goto_0

    .line 487
    .line 488
    :sswitch_21
    const-string v0, "[Z"

    .line 489
    .line 490
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-nez v0, :cond_22

    .line 495
    .line 496
    goto/16 :goto_0

    .line 497
    .line 498
    :cond_22
    const/16 v7, 0x2f

    .line 499
    .line 500
    goto/16 :goto_0

    .line 501
    .line 502
    :sswitch_22
    const-string v0, "[S"

    .line 503
    .line 504
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-nez v0, :cond_23

    .line 509
    .line 510
    goto/16 :goto_0

    .line 511
    .line 512
    :cond_23
    const/16 v7, 0x2e

    .line 513
    .line 514
    goto/16 :goto_0

    .line 515
    .line 516
    :sswitch_23
    const-string v0, "[O"

    .line 517
    .line 518
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    if-nez v0, :cond_24

    .line 523
    .line 524
    goto/16 :goto_0

    .line 525
    .line 526
    :cond_24
    const/16 v7, 0x2d

    .line 527
    .line 528
    goto/16 :goto_0

    .line 529
    .line 530
    :sswitch_24
    const-string v0, "[J"

    .line 531
    .line 532
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v0

    .line 536
    if-nez v0, :cond_25

    .line 537
    .line 538
    goto/16 :goto_0

    .line 539
    .line 540
    :cond_25
    const/16 v7, 0x2c

    .line 541
    .line 542
    goto/16 :goto_0

    .line 543
    .line 544
    :sswitch_25
    const-string v0, "[I"

    .line 545
    .line 546
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-nez v0, :cond_26

    .line 551
    .line 552
    goto/16 :goto_0

    .line 553
    .line 554
    :cond_26
    const/16 v7, 0x2b

    .line 555
    .line 556
    goto/16 :goto_0

    .line 557
    .line 558
    :sswitch_26
    const-string v0, "[F"

    .line 559
    .line 560
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-nez v0, :cond_27

    .line 565
    .line 566
    goto/16 :goto_0

    .line 567
    .line 568
    :cond_27
    const/16 v7, 0x2a

    .line 569
    .line 570
    goto/16 :goto_0

    .line 571
    .line 572
    :sswitch_27
    const-string v0, "[D"

    .line 573
    .line 574
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-nez v0, :cond_28

    .line 579
    .line 580
    goto/16 :goto_0

    .line 581
    .line 582
    :cond_28
    const/16 v7, 0x29

    .line 583
    .line 584
    goto/16 :goto_0

    .line 585
    .line 586
    :sswitch_28
    const-string v0, "[C"

    .line 587
    .line 588
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    if-nez v0, :cond_29

    .line 593
    .line 594
    goto/16 :goto_0

    .line 595
    .line 596
    :cond_29
    const/16 v7, 0x28

    .line 597
    .line 598
    goto/16 :goto_0

    .line 599
    .line 600
    :sswitch_29
    const-string v0, "[B"

    .line 601
    .line 602
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v0

    .line 606
    if-nez v0, :cond_2a

    .line 607
    .line 608
    goto/16 :goto_0

    .line 609
    .line 610
    :cond_2a
    const/16 v7, 0x27

    .line 611
    .line 612
    goto/16 :goto_0

    .line 613
    .line 614
    :sswitch_2a
    const-string v0, "LM"

    .line 615
    .line 616
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move-result v0

    .line 620
    if-nez v0, :cond_2b

    .line 621
    .line 622
    goto/16 :goto_0

    .line 623
    .line 624
    :cond_2b
    const/16 v7, 0x26

    .line 625
    .line 626
    goto/16 :goto_0

    .line 627
    .line 628
    :sswitch_2b
    const-string v0, "LA"

    .line 629
    .line 630
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    if-nez v0, :cond_2c

    .line 635
    .line 636
    goto/16 :goto_0

    .line 637
    .line 638
    :cond_2c
    const/16 v7, 0x25

    .line 639
    .line 640
    goto/16 :goto_0

    .line 641
    .line 642
    :sswitch_2c
    const-string v0, "Z"

    .line 643
    .line 644
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v0

    .line 648
    if-nez v0, :cond_2d

    .line 649
    .line 650
    goto/16 :goto_0

    .line 651
    .line 652
    :cond_2d
    const/16 v7, 0x24

    .line 653
    .line 654
    goto/16 :goto_0

    .line 655
    .line 656
    :sswitch_2d
    const-string v0, "S"

    .line 657
    .line 658
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-nez v0, :cond_2e

    .line 663
    .line 664
    goto/16 :goto_0

    .line 665
    .line 666
    :cond_2e
    const/16 v7, 0x23

    .line 667
    .line 668
    goto/16 :goto_0

    .line 669
    .line 670
    :sswitch_2e
    const-string v0, "O"

    .line 671
    .line 672
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    if-nez v0, :cond_2f

    .line 677
    .line 678
    goto/16 :goto_0

    .line 679
    .line 680
    :cond_2f
    const/16 v7, 0x22

    .line 681
    .line 682
    goto/16 :goto_0

    .line 683
    .line 684
    :sswitch_2f
    const-string v0, "M"

    .line 685
    .line 686
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v0

    .line 690
    if-nez v0, :cond_30

    .line 691
    .line 692
    goto/16 :goto_0

    .line 693
    .line 694
    :cond_30
    const/16 v7, 0x21

    .line 695
    .line 696
    goto/16 :goto_0

    .line 697
    .line 698
    :sswitch_30
    const-string v0, "J"

    .line 699
    .line 700
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    if-nez v0, :cond_31

    .line 705
    .line 706
    goto/16 :goto_0

    .line 707
    .line 708
    :cond_31
    const/16 v7, 0x20

    .line 709
    .line 710
    goto/16 :goto_0

    .line 711
    .line 712
    :sswitch_31
    const-string v0, "I"

    .line 713
    .line 714
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    move-result v0

    .line 718
    if-nez v0, :cond_32

    .line 719
    .line 720
    goto/16 :goto_0

    .line 721
    .line 722
    :cond_32
    const/16 v7, 0x1f

    .line 723
    .line 724
    goto/16 :goto_0

    .line 725
    .line 726
    :sswitch_32
    const-string v0, "F"

    .line 727
    .line 728
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-nez v0, :cond_33

    .line 733
    .line 734
    goto/16 :goto_0

    .line 735
    .line 736
    :cond_33
    const/16 v7, 0x1e

    .line 737
    .line 738
    goto/16 :goto_0

    .line 739
    .line 740
    :sswitch_33
    const-string v0, "D"

    .line 741
    .line 742
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v0

    .line 746
    if-nez v0, :cond_34

    .line 747
    .line 748
    goto/16 :goto_0

    .line 749
    .line 750
    :cond_34
    const/16 v7, 0x1d

    .line 751
    .line 752
    goto/16 :goto_0

    .line 753
    .line 754
    :sswitch_34
    const-string v0, "C"

    .line 755
    .line 756
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 757
    .line 758
    .line 759
    move-result v0

    .line 760
    if-nez v0, :cond_35

    .line 761
    .line 762
    goto/16 :goto_0

    .line 763
    .line 764
    :cond_35
    const/16 v7, 0x1c

    .line 765
    .line 766
    goto/16 :goto_0

    .line 767
    .line 768
    :sswitch_35
    const-string v0, "B"

    .line 769
    .line 770
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 771
    .line 772
    .line 773
    move-result v0

    .line 774
    if-nez v0, :cond_36

    .line 775
    .line 776
    goto/16 :goto_0

    .line 777
    .line 778
    :cond_36
    const/16 v7, 0x1b

    .line 779
    .line 780
    goto/16 :goto_0

    .line 781
    .line 782
    :sswitch_36
    const-string v0, "A"

    .line 783
    .line 784
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    if-nez v0, :cond_37

    .line 789
    .line 790
    goto/16 :goto_0

    .line 791
    .line 792
    :cond_37
    const/16 v7, 0x1a

    .line 793
    .line 794
    goto/16 :goto_0

    .line 795
    .line 796
    :sswitch_37
    const-string v0, "Calendar"

    .line 797
    .line 798
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    if-nez v0, :cond_38

    .line 803
    .line 804
    goto/16 :goto_0

    .line 805
    .line 806
    :cond_38
    const/16 v7, 0x19

    .line 807
    .line 808
    goto/16 :goto_0

    .line 809
    .line 810
    :sswitch_38
    const-string v0, "java.util.Collections$EmptySet"

    .line 811
    .line 812
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    move-result v0

    .line 816
    if-nez v0, :cond_39

    .line 817
    .line 818
    goto/16 :goto_0

    .line 819
    .line 820
    :cond_39
    const/16 v7, 0x18

    .line 821
    .line 822
    goto/16 :goto_0

    .line 823
    .line 824
    :sswitch_39
    const-string v0, "java.util.Collections$EmptyMap"

    .line 825
    .line 826
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 827
    .line 828
    .line 829
    move-result v0

    .line 830
    if-nez v0, :cond_3a

    .line 831
    .line 832
    goto/16 :goto_0

    .line 833
    .line 834
    :cond_3a
    const/16 v7, 0x17

    .line 835
    .line 836
    goto/16 :goto_0

    .line 837
    .line 838
    :sswitch_3a
    const-string v0, "java.lang.Class"

    .line 839
    .line 840
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    move-result v0

    .line 844
    if-nez v0, :cond_3b

    .line 845
    .line 846
    goto/16 :goto_0

    .line 847
    .line 848
    :cond_3b
    const/16 v7, 0x16

    .line 849
    .line 850
    goto/16 :goto_0

    .line 851
    .line 852
    :sswitch_3b
    const-string v0, "float[]"

    .line 853
    .line 854
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result v0

    .line 858
    if-nez v0, :cond_3c

    .line 859
    .line 860
    goto/16 :goto_0

    .line 861
    .line 862
    :cond_3c
    const/16 v7, 0x15

    .line 863
    .line 864
    goto/16 :goto_0

    .line 865
    .line 866
    :sswitch_3c
    const-string v0, "LinkedList"

    .line 867
    .line 868
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 869
    .line 870
    .line 871
    move-result v0

    .line 872
    if-nez v0, :cond_3d

    .line 873
    .line 874
    goto/16 :goto_0

    .line 875
    .line 876
    :cond_3d
    const/16 v7, 0x14

    .line 877
    .line 878
    goto/16 :goto_0

    .line 879
    .line 880
    :sswitch_3d
    const-string v0, "java.util.Collections$SingletonList"

    .line 881
    .line 882
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    if-nez v0, :cond_3e

    .line 887
    .line 888
    goto/16 :goto_0

    .line 889
    .line 890
    :cond_3e
    const/16 v7, 0x13

    .line 891
    .line 892
    goto/16 :goto_0

    .line 893
    .line 894
    :sswitch_3e
    const-string v0, "long[]"

    .line 895
    .line 896
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    if-nez v0, :cond_3f

    .line 901
    .line 902
    goto/16 :goto_0

    .line 903
    .line 904
    :cond_3f
    const/16 v7, 0x12

    .line 905
    .line 906
    goto/16 :goto_0

    .line 907
    .line 908
    :sswitch_3f
    const-string v0, "java.util.ArrayList"

    .line 909
    .line 910
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    move-result v0

    .line 914
    if-nez v0, :cond_40

    .line 915
    .line 916
    goto/16 :goto_0

    .line 917
    .line 918
    :cond_40
    const/16 v7, 0x11

    .line 919
    .line 920
    goto/16 :goto_0

    .line 921
    .line 922
    :sswitch_40
    const-string v0, "double"

    .line 923
    .line 924
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    move-result v0

    .line 928
    if-nez v0, :cond_41

    .line 929
    .line 930
    goto/16 :goto_0

    .line 931
    .line 932
    :cond_41
    const/16 v7, 0x10

    .line 933
    .line 934
    goto/16 :goto_0

    .line 935
    .line 936
    :sswitch_41
    const-string v0, "char[]"

    .line 937
    .line 938
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v0

    .line 942
    if-nez v0, :cond_42

    .line 943
    .line 944
    goto/16 :goto_0

    .line 945
    .line 946
    :cond_42
    const/16 v7, 0xf

    .line 947
    .line 948
    goto/16 :goto_0

    .line 949
    .line 950
    :sswitch_42
    const-string v0, "byte[]"

    .line 951
    .line 952
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    move-result v0

    .line 956
    if-nez v0, :cond_43

    .line 957
    .line 958
    goto/16 :goto_0

    .line 959
    .line 960
    :cond_43
    const/16 v7, 0xe

    .line 961
    .line 962
    goto/16 :goto_0

    .line 963
    .line 964
    :sswitch_43
    const-string v0, "java.util.Set"

    .line 965
    .line 966
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 967
    .line 968
    .line 969
    move-result v0

    .line 970
    if-nez v0, :cond_44

    .line 971
    .line 972
    goto/16 :goto_0

    .line 973
    .line 974
    :cond_44
    const/16 v7, 0xd

    .line 975
    .line 976
    goto/16 :goto_0

    .line 977
    .line 978
    :sswitch_44
    const-string v0, "java.util.Map"

    .line 979
    .line 980
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v0

    .line 984
    if-nez v0, :cond_45

    .line 985
    .line 986
    goto/16 :goto_0

    .line 987
    .line 988
    :cond_45
    const/16 v7, 0xc

    .line 989
    .line 990
    goto/16 :goto_0

    .line 991
    .line 992
    :sswitch_45
    const-string v0, "java.util.HashSet"

    .line 993
    .line 994
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 995
    .line 996
    .line 997
    move-result v0

    .line 998
    if-nez v0, :cond_46

    .line 999
    .line 1000
    goto/16 :goto_0

    .line 1001
    .line 1002
    :cond_46
    const/16 v7, 0xb

    .line 1003
    .line 1004
    goto/16 :goto_0

    .line 1005
    .line 1006
    :sswitch_46
    const-string v0, "java.util.HashMap"

    .line 1007
    .line 1008
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    if-nez v0, :cond_47

    .line 1013
    .line 1014
    goto/16 :goto_0

    .line 1015
    .line 1016
    :cond_47
    const/16 v7, 0xa

    .line 1017
    .line 1018
    goto/16 :goto_0

    .line 1019
    .line 1020
    :sswitch_47
    const-string v0, "LinkedHashSet"

    .line 1021
    .line 1022
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1023
    .line 1024
    .line 1025
    move-result v0

    .line 1026
    if-nez v0, :cond_48

    .line 1027
    .line 1028
    goto/16 :goto_0

    .line 1029
    .line 1030
    :cond_48
    const/16 v7, 0x9

    .line 1031
    .line 1032
    goto/16 :goto_0

    .line 1033
    .line 1034
    :sswitch_48
    const-string v0, "LinkedHashMap"

    .line 1035
    .line 1036
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v0

    .line 1040
    if-nez v0, :cond_49

    .line 1041
    .line 1042
    goto/16 :goto_0

    .line 1043
    .line 1044
    :cond_49
    const/16 v7, 0x8

    .line 1045
    .line 1046
    goto/16 :goto_0

    .line 1047
    .line 1048
    :sswitch_49
    const-string v0, "ConcurrentLinkedQueue"

    .line 1049
    .line 1050
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1051
    .line 1052
    .line 1053
    move-result v0

    .line 1054
    if-nez v0, :cond_4a

    .line 1055
    .line 1056
    goto :goto_0

    .line 1057
    :cond_4a
    const/4 v7, 0x7

    .line 1058
    goto :goto_0

    .line 1059
    :sswitch_4a
    const-string v0, "String"

    .line 1060
    .line 1061
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1062
    .line 1063
    .line 1064
    move-result v0

    .line 1065
    if-nez v0, :cond_4b

    .line 1066
    .line 1067
    goto :goto_0

    .line 1068
    :cond_4b
    const/4 v7, 0x6

    .line 1069
    goto :goto_0

    .line 1070
    :sswitch_4b
    const-string v0, "java.util.LinkedList"

    .line 1071
    .line 1072
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1073
    .line 1074
    .line 1075
    move-result v0

    .line 1076
    if-nez v0, :cond_4c

    .line 1077
    .line 1078
    goto :goto_0

    .line 1079
    :cond_4c
    const/4 v7, 0x5

    .line 1080
    goto :goto_0

    .line 1081
    :sswitch_4c
    const-string v0, "HashSet"

    .line 1082
    .line 1083
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v0

    .line 1087
    if-nez v0, :cond_4d

    .line 1088
    .line 1089
    goto :goto_0

    .line 1090
    :cond_4d
    const/4 v7, 0x4

    .line 1091
    goto :goto_0

    .line 1092
    :sswitch_4d
    const-string v0, "HashMap"

    .line 1093
    .line 1094
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v0

    .line 1098
    if-nez v0, :cond_4e

    .line 1099
    .line 1100
    goto :goto_0

    .line 1101
    :cond_4e
    const/4 v7, 0x3

    .line 1102
    goto :goto_0

    .line 1103
    :sswitch_4e
    const-string v0, "Object"

    .line 1104
    .line 1105
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1106
    .line 1107
    .line 1108
    move-result v0

    .line 1109
    if-nez v0, :cond_4f

    .line 1110
    .line 1111
    goto :goto_0

    .line 1112
    :cond_4f
    move v7, v4

    .line 1113
    goto :goto_0

    .line 1114
    :sswitch_4f
    const-string v0, "java.io.IOException"

    .line 1115
    .line 1116
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1117
    .line 1118
    .line 1119
    move-result v0

    .line 1120
    if-nez v0, :cond_50

    .line 1121
    .line 1122
    goto :goto_0

    .line 1123
    :cond_50
    move v7, v6

    .line 1124
    goto :goto_0

    .line 1125
    :sswitch_50
    const-string v0, "java.lang.Integer"

    .line 1126
    .line 1127
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v0

    .line 1131
    if-nez v0, :cond_51

    .line 1132
    .line 1133
    goto :goto_0

    .line 1134
    :cond_51
    move v7, v5

    .line 1135
    :goto_0
    packed-switch v7, :pswitch_data_0

    .line 1136
    .line 1137
    .line 1138
    goto :goto_1

    .line 1139
    :pswitch_0
    const-class p0, Lcom/alibaba/fastjson2/JSONObject;

    .line 1140
    .line 1141
    return-object p0

    .line 1142
    :pswitch_1
    const-class p0, [Ljava/lang/String;

    .line 1143
    .line 1144
    return-object p0

    .line 1145
    :pswitch_2
    const-class p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 1146
    .line 1147
    return-object p0

    .line 1148
    :pswitch_3
    sget-object p0, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_SINGLE_SET:Ljava/lang/Class;

    .line 1149
    .line 1150
    return-object p0

    .line 1151
    :pswitch_4
    sget-object p0, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 1152
    .line 1153
    return-object p0

    .line 1154
    :pswitch_5
    const-class p0, Ljava/util/TreeSet;

    .line 1155
    .line 1156
    return-object p0

    .line 1157
    :pswitch_6
    const-class p0, Ljava/lang/Long;

    .line 1158
    .line 1159
    return-object p0

    .line 1160
    :pswitch_7
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1161
    .line 1162
    .line 1163
    move-result-object p0

    .line 1164
    filled-new-array {p0}, [Ljava/lang/Integer;

    .line 1165
    .line 1166
    .line 1167
    move-result-object p0

    .line 1168
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1169
    .line 1170
    .line 1171
    move-result-object p0

    .line 1172
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    move-result-object p0

    .line 1176
    return-object p0

    .line 1177
    :pswitch_8
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1178
    .line 1179
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p0

    .line 1183
    return-object p0

    .line 1184
    :pswitch_9
    const-class p0, Ljava/util/UUID;

    .line 1185
    .line 1186
    return-object p0

    .line 1187
    :pswitch_a
    const-class p0, Ljava/util/List;

    .line 1188
    .line 1189
    return-object p0

    .line 1190
    :pswitch_b
    const-class p0, Ljava/util/Date;

    .line 1191
    .line 1192
    return-object p0

    .line 1193
    :pswitch_c
    const-string p0, "com.alibaba.fastjson.JSONObject"

    .line 1194
    .line 1195
    :goto_1
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils$Mapping;->TYPE_MAPPINGS:Ljava/util/Map;

    .line 1196
    .line 1197
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v0

    .line 1201
    check-cast v0, Ljava/lang/Class;

    .line 1202
    .line 1203
    if-eqz v0, :cond_52

    .line 1204
    .line 1205
    return-object v0

    .line 1206
    :cond_52
    const-string v0, "java.util.ImmutableCollections$"

    .line 1207
    .line 1208
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1209
    .line 1210
    .line 1211
    move-result v0

    .line 1212
    if-eqz v0, :cond_53

    .line 1213
    .line 1214
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 1215
    .line 1216
    .line 1217
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1218
    return-object p0

    .line 1219
    :catch_0
    sget-object p0, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_UNMODIFIABLE_LIST:Ljava/lang/Class;

    .line 1220
    .line 1221
    return-object p0

    .line 1222
    :cond_53
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    if-ne v0, v1, :cond_54

    .line 1227
    .line 1228
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 1229
    .line 1230
    .line 1231
    move-result v0

    .line 1232
    sub-int/2addr v0, v6

    .line 1233
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 1234
    .line 1235
    .line 1236
    move-result v0

    .line 1237
    if-ne v0, v3, :cond_54

    .line 1238
    .line 1239
    invoke-static {v6, v6, p0}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 1240
    .line 1241
    .line 1242
    move-result-object p0

    .line 1243
    :cond_54
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    const/16 v1, 0x5b

    .line 1248
    .line 1249
    if-eq v0, v1, :cond_57

    .line 1250
    .line 1251
    const-string v0, "[]"

    .line 1252
    .line 1253
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v0

    .line 1257
    if-eqz v0, :cond_55

    .line 1258
    .line 1259
    goto :goto_2

    .line 1260
    :cond_55
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v0

    .line 1268
    if-eqz v0, :cond_56

    .line 1269
    .line 1270
    :try_start_1
    invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 1271
    .line 1272
    .line 1273
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 1274
    return-object p0

    .line 1275
    :catch_1
    :cond_56
    :try_start_2
    const-class v0, Lcom/alibaba/fastjson2/JSON;

    .line 1276
    .line 1277
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v0

    .line 1281
    invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 1282
    .line 1283
    .line 1284
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1285
    return-object p0

    .line 1286
    :catch_2
    :try_start_3
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 1287
    .line 1288
    .line 1289
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 1290
    return-object p0

    .line 1291
    :catch_3
    return-object v2

    .line 1292
    :cond_57
    :goto_2
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 1293
    .line 1294
    .line 1295
    move-result v0

    .line 1296
    if-ne v0, v1, :cond_58

    .line 1297
    .line 1298
    invoke-virtual {p0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v0

    .line 1302
    goto :goto_3

    .line 1303
    :cond_58
    invoke-static {v4, v5, p0}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    :goto_3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v0

    .line 1311
    if-eqz v0, :cond_59

    .line 1312
    .line 1313
    invoke-static {v0, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object p0

    .line 1317
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1318
    .line 1319
    .line 1320
    move-result-object p0

    .line 1321
    return-object p0

    .line 1322
    :cond_59
    const-string v0, "load class error "

    .line 1323
    .line 1324
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1325
    .line 1326
    .line 1327
    move-result-object p0

    .line 1328
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    return-object v2

    .line 1332
    :pswitch_d
    const-class p0, [Z

    .line 1333
    .line 1334
    return-object p0

    .line 1335
    :pswitch_e
    const-class p0, [S

    .line 1336
    .line 1337
    return-object p0

    .line 1338
    :pswitch_f
    const-class p0, [Ljava/lang/Object;

    .line 1339
    .line 1340
    return-object p0

    .line 1341
    :pswitch_10
    const-class p0, [I

    .line 1342
    .line 1343
    return-object p0

    .line 1344
    :pswitch_11
    const-class p0, [D

    .line 1345
    .line 1346
    return-object p0

    .line 1347
    :pswitch_12
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 1348
    .line 1349
    return-object p0

    .line 1350
    :pswitch_13
    sget-object p0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 1351
    .line 1352
    return-object p0

    .line 1353
    :pswitch_14
    sget-object p0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 1354
    .line 1355
    return-object p0

    .line 1356
    :pswitch_15
    sget-object p0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 1357
    .line 1358
    return-object p0

    .line 1359
    :pswitch_16
    sget-object p0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 1360
    .line 1361
    return-object p0

    .line 1362
    :pswitch_17
    sget-object p0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 1363
    .line 1364
    return-object p0

    .line 1365
    :pswitch_18
    sget-object p0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 1366
    .line 1367
    return-object p0

    .line 1368
    :pswitch_19
    const-class p0, Ljava/util/Calendar;

    .line 1369
    .line 1370
    return-object p0

    .line 1371
    :pswitch_1a
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 1372
    .line 1373
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1374
    .line 1375
    .line 1376
    move-result-object p0

    .line 1377
    return-object p0

    .line 1378
    :pswitch_1b
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 1379
    .line 1380
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1381
    .line 1382
    .line 1383
    move-result-object p0

    .line 1384
    return-object p0

    .line 1385
    :pswitch_1c
    const-class p0, Ljava/lang/Class;

    .line 1386
    .line 1387
    return-object p0

    .line 1388
    :pswitch_1d
    const-class p0, [F

    .line 1389
    .line 1390
    return-object p0

    .line 1391
    :pswitch_1e
    sget-object p0, Lcom/alibaba/fastjson2/util/TypeUtils;->CLASS_SINGLE_LIST:Ljava/lang/Class;

    .line 1392
    .line 1393
    return-object p0

    .line 1394
    :pswitch_1f
    const-class p0, [J

    .line 1395
    .line 1396
    return-object p0

    .line 1397
    :pswitch_20
    const-class p0, Ljava/util/ArrayList;

    .line 1398
    .line 1399
    return-object p0

    .line 1400
    :pswitch_21
    sget-object p0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 1401
    .line 1402
    return-object p0

    .line 1403
    :pswitch_22
    const-class p0, [C

    .line 1404
    .line 1405
    return-object p0

    .line 1406
    :pswitch_23
    const-class p0, [B

    .line 1407
    .line 1408
    return-object p0

    .line 1409
    :pswitch_24
    const-class p0, Ljava/util/Set;

    .line 1410
    .line 1411
    return-object p0

    .line 1412
    :pswitch_25
    const-class p0, Ljava/util/Map;

    .line 1413
    .line 1414
    return-object p0

    .line 1415
    :pswitch_26
    const-class p0, Ljava/util/LinkedHashSet;

    .line 1416
    .line 1417
    return-object p0

    .line 1418
    :pswitch_27
    const-class p0, Ljava/util/LinkedHashMap;

    .line 1419
    .line 1420
    return-object p0

    .line 1421
    :pswitch_28
    const-class p0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 1422
    .line 1423
    return-object p0

    .line 1424
    :pswitch_29
    const-class p0, Ljava/lang/String;

    .line 1425
    .line 1426
    return-object p0

    .line 1427
    :pswitch_2a
    const-class p0, Ljava/util/LinkedList;

    .line 1428
    .line 1429
    return-object p0

    .line 1430
    :pswitch_2b
    const-class p0, Ljava/util/HashSet;

    .line 1431
    .line 1432
    return-object p0

    .line 1433
    :pswitch_2c
    const-class p0, Ljava/util/HashMap;

    .line 1434
    .line 1435
    return-object p0

    .line 1436
    :pswitch_2d
    const-class p0, Ljava/lang/Object;

    .line 1437
    .line 1438
    return-object p0

    .line 1439
    :pswitch_2e
    const-class p0, Ljava/io/IOException;

    .line 1440
    .line 1441
    return-object p0

    .line 1442
    :pswitch_2f
    const-class p0, Ljava/lang/Integer;

    .line 1443
    .line 1444
    return-object p0

    .line 1445
    :sswitch_data_0
    .sparse-switch
        -0x7a988a96 -> :sswitch_50
        -0x77d84db3 -> :sswitch_4f
        -0x739a70a1 -> :sswitch_4e
        -0x73343eb2 -> :sswitch_4d
        -0x733427ac -> :sswitch_4c
        -0x71348fe9 -> :sswitch_4b
        -0x6bc5b3cf -> :sswitch_4a
        -0x62e26bdf -> :sswitch_49
        -0x5485130b -> :sswitch_48
        -0x5484fc05 -> :sswitch_47
        -0x539bd852 -> :sswitch_46
        -0x539bc14c -> :sswitch_45
        -0x52743c64 -> :sswitch_44
        -0x5274255e -> :sswitch_43
        -0x51e5b596 -> :sswitch_42
        -0x5128dec8 -> :sswitch_41
        -0x4f08842f -> :sswitch_40
        -0x4267cf29 -> :sswitch_3f
        -0x4164dd22 -> :sswitch_3e
        -0x400bab66 -> :sswitch_3d
        -0x39260d89 -> :sswitch_3c
        -0x2daef942 -> :sswitch_3b
        -0x1fa1475c -> :sswitch_3a
        -0x18a7fb22 -> :sswitch_39
        -0x18a7e41c -> :sswitch_38
        -0x6c6a0a2 -> :sswitch_37
        0x41 -> :sswitch_36
        0x42 -> :sswitch_35
        0x43 -> :sswitch_34
        0x44 -> :sswitch_33
        0x46 -> :sswitch_32
        0x49 -> :sswitch_31
        0x4a -> :sswitch_30
        0x4d -> :sswitch_2f
        0x4f -> :sswitch_2e
        0x53 -> :sswitch_2d
        0x5a -> :sswitch_2c
        0x975 -> :sswitch_2b
        0x981 -> :sswitch_2a
        0xb47 -> :sswitch_29
        0xb48 -> :sswitch_28
        0xb49 -> :sswitch_27
        0xb4b -> :sswitch_26
        0xb4e -> :sswitch_25
        0xb4f -> :sswitch_24
        0xb54 -> :sswitch_23
        0xb58 -> :sswitch_22
        0xb5f -> :sswitch_21
        0x11f8c -> :sswitch_20
        0x12d3c -> :sswitch_1f
        0x14442 -> :sswitch_1e
        0x197ef -> :sswitch_1d
        0x2063ce -> :sswitch_1c
        0x2424be -> :sswitch_1b
        0x27ebbb -> :sswitch_1a
        0x2e6108 -> :sswitch_19
        0x2e9356 -> :sswitch_18
        0x32c67c -> :sswitch_17
        0x3a8415c -> :sswitch_16
        0x3db6c28 -> :sswitch_15
        0x3ec5a5e -> :sswitch_14
        0x5d0225c -> :sswitch_13
        0x5fb6391 -> :sswitch_12
        0x685847c -> :sswitch_11
        0xab3ed4d -> :sswitch_10
        0x17c521d0 -> :sswitch_f
        0x227fe277 -> :sswitch_e
        0x23d25bc4 -> :sswitch_d
        0x35074651 -> :sswitch_c
        0x37bda8e6 -> :sswitch_b
        0x3f697993 -> :sswitch_a
        0x436ac224 -> :sswitch_9
        0x473e3665 -> :sswitch_8
        0x4b050b55 -> :sswitch_7
        0x4b05225b -> :sswitch_6
        0x5107d6f3 -> :sswitch_5
        0x51cb8f97 -> :sswitch_4
        0x62115c4c -> :sswitch_3
        0x68732647 -> :sswitch_2
        0x7ab10d8a -> :sswitch_1
        0x7b3660de -> :sswitch_0
    .end sparse-switch

    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_2c
        :pswitch_2b
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_2a
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_20
        :pswitch_18
        :pswitch_17
        :pswitch_21
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_2c
        :pswitch_2d
        :pswitch_13
        :pswitch_12
        :pswitch_2a
        :pswitch_27
        :pswitch_23
        :pswitch_22
        :pswitch_11
        :pswitch_1d
        :pswitch_10
        :pswitch_1f
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_25
        :pswitch_24
        :pswitch_15
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_18
        :pswitch_17
        :pswitch_14
        :pswitch_8
        :pswitch_12
        :pswitch_a
        :pswitch_16
        :pswitch_10
        :pswitch_13
        :pswitch_7
        :pswitch_6
        :pswitch_20
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2d
        :pswitch_5
        :pswitch_29
        :pswitch_27
        :pswitch_26
        :pswitch_11
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_d
        :pswitch_e
    .end packed-switch
.end method

.method public static newProxyInstance(Ljava/lang/Class;Lcom/alibaba/fastjson2/JSONObject;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lcom/alibaba/fastjson2/JSONObject;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {p0}, [Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {v0, p0, p1}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static nonePrimitive(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "double"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_7

    .line 18
    .line 19
    const-string v1, "int"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_6

    .line 26
    .line 27
    const-string v1, "byte"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_5

    .line 34
    .line 35
    const-string v1, "char"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    const-string v1, "long"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    const-string v1, "boolean"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    const-string v1, "float"

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    const-string v1, "short"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const-class p0, Ljava/lang/Short;

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_1
    const-class p0, Ljava/lang/Float;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_2
    const-class p0, Ljava/lang/Boolean;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_3
    const-class p0, Ljava/lang/Long;

    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_4
    const-class p0, Ljava/lang/Character;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_5
    const-class p0, Ljava/lang/Byte;

    .line 92
    .line 93
    return-object p0

    .line 94
    :cond_6
    const-class p0, Ljava/lang/Integer;

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_7
    const-class p0, Ljava/lang/Double;

    .line 98
    .line 99
    :cond_8
    :goto_0
    return-object p0
.end method

.method public static parseBigDecimal([BII)Ljava/math/BigDecimal;
    .locals 23

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    if-eqz p0, :cond_c

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_6

    .line 8
    .line 9
    :cond_0
    aget-byte v1, p0, p1

    .line 10
    .line 11
    const/16 v2, 0x2d

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    if-ne v1, v2, :cond_1

    .line 16
    .line 17
    add-int/lit8 v1, p1, 0x1

    .line 18
    .line 19
    move v2, v4

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move/from16 v1, p1

    .line 22
    .line 23
    move v2, v3

    .line 24
    :goto_0
    const/16 v5, 0x14

    .line 25
    .line 26
    if-le v0, v5, :cond_2

    .line 27
    .line 28
    if-eqz v2, :cond_a

    .line 29
    .line 30
    const/16 v5, 0x15

    .line 31
    .line 32
    if-ne v0, v5, :cond_a

    .line 33
    .line 34
    :cond_2
    add-int v5, p1, v0

    .line 35
    .line 36
    const/4 v6, -0x1

    .line 37
    move v9, v3

    .line 38
    move v12, v6

    .line 39
    const-wide/16 v10, 0x0

    .line 40
    .line 41
    :goto_1
    if-ge v1, v5, :cond_3

    .line 42
    .line 43
    aget-byte v13, p0, v1

    .line 44
    .line 45
    const/16 v14, 0x2e

    .line 46
    .line 47
    if-ne v13, v14, :cond_5

    .line 48
    .line 49
    add-int/lit8 v9, v9, 0x1

    .line 50
    .line 51
    if-le v9, v4, :cond_4

    .line 52
    .line 53
    :cond_3
    const-wide/16 v16, 0x0

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_4
    move v12, v1

    .line 57
    const-wide/16 v16, 0x0

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_5
    const-wide/16 v14, -0x1

    .line 61
    .line 62
    const-wide/16 v16, 0x0

    .line 63
    .line 64
    const/16 v7, 0x30

    .line 65
    .line 66
    if-lt v13, v7, :cond_6

    .line 67
    .line 68
    const/16 v7, 0x39

    .line 69
    .line 70
    if-gt v13, v7, :cond_6

    .line 71
    .line 72
    const-wide/16 v7, 0xa

    .line 73
    .line 74
    mul-long v18, v10, v7

    .line 75
    .line 76
    or-long v20, v10, v7

    .line 77
    .line 78
    const/16 v22, 0x1f

    .line 79
    .line 80
    ushr-long v20, v20, v22

    .line 81
    .line 82
    cmp-long v20, v20, v16

    .line 83
    .line 84
    if-eqz v20, :cond_7

    .line 85
    .line 86
    div-long v7, v18, v7

    .line 87
    .line 88
    cmp-long v7, v7, v10

    .line 89
    .line 90
    if-nez v7, :cond_6

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_6
    move-wide v10, v14

    .line 94
    goto :goto_4

    .line 95
    :cond_7
    :goto_2
    add-int/lit8 v13, v13, -0x30

    .line 96
    .line 97
    int-to-long v7, v13

    .line 98
    add-long v10, v18, v7

    .line 99
    .line 100
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :goto_4
    cmp-long v1, v10, v16

    .line 104
    .line 105
    if-ltz v1, :cond_a

    .line 106
    .line 107
    if-gt v9, v4, :cond_a

    .line 108
    .line 109
    if-eqz v2, :cond_8

    .line 110
    .line 111
    neg-long v10, v10

    .line 112
    :cond_8
    if-eq v12, v6, :cond_9

    .line 113
    .line 114
    sub-int v12, v12, p1

    .line 115
    .line 116
    sub-int/2addr v0, v12

    .line 117
    add-int/lit8 v3, v0, -0x1

    .line 118
    .line 119
    :cond_9
    invoke-static {v10, v11, v3}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :cond_a
    new-array v1, v0, [C

    .line 125
    .line 126
    move v2, v3

    .line 127
    :goto_5
    if-ge v2, v0, :cond_b

    .line 128
    .line 129
    add-int v4, p1, v2

    .line 130
    .line 131
    aget-byte v4, p0, v4

    .line 132
    .line 133
    int-to-char v4, v4

    .line 134
    aput-char v4, v1, v2

    .line 135
    .line 136
    add-int/lit8 v2, v2, 0x1

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_b
    new-instance v2, Ljava/math/BigDecimal;

    .line 140
    .line 141
    invoke-direct {v2, v1, v3, v0}, Ljava/math/BigDecimal;-><init>([CII)V

    .line 142
    .line 143
    .line 144
    return-object v2

    .line 145
    :cond_c
    :goto_6
    const/4 v0, 0x0

    .line 146
    return-object v0
.end method

.method public static parseBigDecimal([CII)Ljava/math/BigDecimal;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    if-eqz v0, :cond_b

    if-nez v2, :cond_0

    goto/16 :goto_6

    .line 147
    :cond_0
    aget-char v3, v0, v1

    const/16 v4, 0x2d

    const/4 v6, 0x1

    if-ne v3, v4, :cond_1

    add-int/lit8 v3, v1, 0x1

    move v4, v6

    goto :goto_0

    :cond_1
    move v3, v1

    const/4 v4, 0x0

    :goto_0
    const/16 v7, 0x14

    if-le v2, v7, :cond_2

    if-eqz v4, :cond_a

    const/16 v7, 0x15

    if-ne v2, v7, :cond_a

    :cond_2
    add-int v7, v1, v2

    const/4 v8, -0x1

    const-wide/16 v9, 0x0

    move v14, v8

    move-wide v12, v9

    const/4 v11, 0x0

    :goto_1
    if-ge v3, v7, :cond_7

    .line 148
    aget-char v15, v0, v3

    const/16 v5, 0x2e

    if-ne v15, v5, :cond_4

    add-int/lit8 v11, v11, 0x1

    if-le v11, v6, :cond_3

    goto :goto_4

    :cond_3
    move v14, v3

    goto :goto_3

    :cond_4
    const-wide/16 v16, -0x1

    const/16 v5, 0x30

    if-lt v15, v5, :cond_5

    const/16 v5, 0x39

    if-gt v15, v5, :cond_5

    const-wide/16 v18, 0xa

    mul-long v20, v12, v18

    or-long v22, v12, v18

    const/16 v5, 0x1f

    ushr-long v22, v22, v5

    cmp-long v5, v22, v9

    if-eqz v5, :cond_6

    .line 149
    div-long v18, v20, v18

    cmp-long v5, v18, v12

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    move-wide/from16 v12, v16

    goto :goto_4

    :cond_6
    :goto_2
    add-int/lit8 v15, v15, -0x30

    int-to-long v12, v15

    add-long v12, v20, v12

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_7
    :goto_4
    cmp-long v3, v12, v9

    if-ltz v3, :cond_a

    if-gt v11, v6, :cond_a

    if-eqz v4, :cond_8

    neg-long v12, v12

    :cond_8
    if-eq v14, v8, :cond_9

    sub-int/2addr v14, v1

    sub-int v0, v2, v14

    add-int/lit8 v5, v0, -0x1

    goto :goto_5

    :cond_9
    const/4 v5, 0x0

    .line 150
    :goto_5
    invoke-static {v12, v13, v5}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0

    .line 151
    :cond_a
    new-instance v3, Ljava/math/BigDecimal;

    invoke-direct {v3, v0, v1, v2}, Ljava/math/BigDecimal;-><init>([CII)V

    return-object v3

    :cond_b
    :goto_6
    const/4 v0, 0x0

    return-object v0
.end method

.method public static parseBoolean([BII)Ljava/lang/Boolean;
    .locals 3

    .line 1
    if-eqz p2, :cond_7

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p2, v0, :cond_2

    .line 5
    .line 6
    const/16 v0, 0x65

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-eq p2, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x5

    .line 12
    if-eq p2, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    aget-byte v1, p0, p1

    .line 16
    .line 17
    const/16 v2, 0x66

    .line 18
    .line 19
    if-ne v1, v2, :cond_4

    .line 20
    .line 21
    add-int/lit8 v1, p1, 0x1

    .line 22
    .line 23
    aget-byte v1, p0, v1

    .line 24
    .line 25
    const/16 v2, 0x61

    .line 26
    .line 27
    if-ne v1, v2, :cond_4

    .line 28
    .line 29
    add-int/lit8 v1, p1, 0x2

    .line 30
    .line 31
    aget-byte v1, p0, v1

    .line 32
    .line 33
    const/16 v2, 0x6c

    .line 34
    .line 35
    if-ne v1, v2, :cond_4

    .line 36
    .line 37
    add-int/lit8 v1, p1, 0x3

    .line 38
    .line 39
    aget-byte v1, p0, v1

    .line 40
    .line 41
    const/16 v2, 0x73

    .line 42
    .line 43
    if-ne v1, v2, :cond_4

    .line 44
    .line 45
    add-int/lit8 v1, p1, 0x4

    .line 46
    .line 47
    aget-byte v1, p0, v1

    .line 48
    .line 49
    if-ne v1, v0, :cond_4

    .line 50
    .line 51
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_1
    aget-byte v1, p0, p1

    .line 55
    .line 56
    const/16 v2, 0x74

    .line 57
    .line 58
    if-ne v1, v2, :cond_4

    .line 59
    .line 60
    add-int/lit8 v1, p1, 0x1

    .line 61
    .line 62
    aget-byte v1, p0, v1

    .line 63
    .line 64
    const/16 v2, 0x72

    .line 65
    .line 66
    if-ne v1, v2, :cond_4

    .line 67
    .line 68
    add-int/lit8 v1, p1, 0x2

    .line 69
    .line 70
    aget-byte v1, p0, v1

    .line 71
    .line 72
    const/16 v2, 0x75

    .line 73
    .line 74
    if-ne v1, v2, :cond_4

    .line 75
    .line 76
    add-int/lit8 v1, p1, 0x3

    .line 77
    .line 78
    aget-byte v1, p0, v1

    .line 79
    .line 80
    if-ne v1, v0, :cond_4

    .line 81
    .line 82
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_2
    aget-byte v0, p0, p1

    .line 86
    .line 87
    const/16 v1, 0x31

    .line 88
    .line 89
    if-eq v0, v1, :cond_6

    .line 90
    .line 91
    const/16 v1, 0x59

    .line 92
    .line 93
    if-ne v0, v1, :cond_3

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    const/16 v1, 0x30

    .line 97
    .line 98
    if-eq v0, v1, :cond_5

    .line 99
    .line 100
    const/16 v1, 0x4e

    .line 101
    .line 102
    if-ne v0, v1, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    :goto_0
    new-instance v0, Ljava/lang/String;

    .line 106
    .line 107
    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([BII)V

    .line 108
    .line 109
    .line 110
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0

    .line 119
    :cond_5
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_6
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_7
    const/4 p0, 0x0

    .line 126
    return-object p0
.end method

.method public static parseBoolean([CII)Ljava/lang/Boolean;
    .locals 3

    if-eqz p2, :cond_7

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/16 v0, 0x65

    const/4 v1, 0x4

    if-eq p2, v1, :cond_1

    const/4 v1, 0x5

    if-eq p2, v1, :cond_0

    goto :goto_0

    .line 127
    :cond_0
    aget-char v1, p0, p1

    const/16 v2, 0x66

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x1

    aget-char v1, p0, v1

    const/16 v2, 0x61

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x2

    aget-char v1, p0, v1

    const/16 v2, 0x6c

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x3

    aget-char v1, p0, v1

    const/16 v2, 0x73

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x4

    aget-char v1, p0, v1

    if-ne v1, v0, :cond_4

    .line 128
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 129
    :cond_1
    aget-char v1, p0, p1

    const/16 v2, 0x74

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x1

    aget-char v1, p0, v1

    const/16 v2, 0x72

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x2

    aget-char v1, p0, v1

    const/16 v2, 0x75

    if-ne v1, v2, :cond_4

    add-int/lit8 v1, p1, 0x3

    aget-char v1, p0, v1

    if-ne v1, v0, :cond_4

    .line 130
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    .line 131
    :cond_2
    aget-char v0, p0, p1

    const/16 v1, 0x31

    if-eq v0, v1, :cond_6

    const/16 v1, 0x59

    if-ne v0, v1, :cond_3

    goto :goto_2

    :cond_3
    const/16 v1, 0x30

    if-eq v0, v1, :cond_5

    const/16 v1, 0x4e

    if-ne v0, v1, :cond_4

    goto :goto_1

    .line 132
    :cond_4
    :goto_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    .line 133
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    .line 134
    :cond_5
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    .line 135
    :cond_6
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method public static parseDouble([BII)D
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    add-int v3, v1, v2

    .line 8
    .line 9
    if-eqz v2, :cond_1a

    .line 10
    .line 11
    :try_start_0
    aget-byte v4, v0, v1

    .line 12
    .line 13
    const/16 v5, 0x2d

    .line 14
    .line 15
    const/16 v6, 0x2b

    .line 16
    .line 17
    if-eq v4, v6, :cond_1

    .line 18
    .line 19
    if-eq v4, v5, :cond_0

    .line 20
    .line 21
    move v9, v1

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v4, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v4, 0x0

    .line 28
    :goto_0
    add-int/lit8 v9, v1, 0x1

    .line 29
    .line 30
    const/4 v10, 0x1

    .line 31
    :goto_1
    new-array v11, v2, [C
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x0

    .line 36
    :goto_2
    const-string v15, "multiple points"

    .line 37
    .line 38
    const/16 v16, 0x1

    .line 39
    .line 40
    const/16 v7, 0x2e

    .line 41
    .line 42
    const/16 v8, 0x30

    .line 43
    .line 44
    if-ge v9, v3, :cond_5

    .line 45
    .line 46
    :try_start_1
    aget-byte v5, v0, v9

    .line 47
    .line 48
    if-ne v5, v8, :cond_2

    .line 49
    .line 50
    add-int/lit8 v12, v12, 0x1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    if-ne v5, v7, :cond_5

    .line 54
    .line 55
    if-nez v13, :cond_4

    .line 56
    .line 57
    sub-int v5, v9, v1

    .line 58
    .line 59
    if-eqz v10, :cond_3

    .line 60
    .line 61
    add-int/lit8 v5, v5, -0x1

    .line 62
    .line 63
    :cond_3
    move v14, v5

    .line 64
    move/from16 v13, v16

    .line 65
    .line 66
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 67
    .line 68
    const/16 v5, 0x2d

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    new-instance v3, Ljava/lang/NumberFormatException;

    .line 72
    .line 73
    invoke-direct {v3, v15}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v3

    .line 77
    :cond_5
    const/4 v5, 0x0

    .line 78
    const/16 v19, 0x0

    .line 79
    .line 80
    :goto_4
    const/16 v6, 0x39

    .line 81
    .line 82
    if-ge v9, v3, :cond_a

    .line 83
    .line 84
    aget-byte v7, v0, v9

    .line 85
    .line 86
    const/16 v8, 0x31

    .line 87
    .line 88
    if-lt v7, v8, :cond_6

    .line 89
    .line 90
    if-gt v7, v6, :cond_6

    .line 91
    .line 92
    add-int/lit8 v6, v5, 0x1

    .line 93
    .line 94
    int-to-char v7, v7

    .line 95
    aput-char v7, v11, v5

    .line 96
    .line 97
    move v5, v6

    .line 98
    const/16 v8, 0x2e

    .line 99
    .line 100
    const/16 v19, 0x0

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    const/16 v8, 0x30

    .line 104
    .line 105
    if-ne v7, v8, :cond_7

    .line 106
    .line 107
    add-int/lit8 v6, v5, 0x1

    .line 108
    .line 109
    int-to-char v7, v7

    .line 110
    aput-char v7, v11, v5

    .line 111
    .line 112
    add-int/lit8 v19, v19, 0x1

    .line 113
    .line 114
    move v5, v6

    .line 115
    const/16 v8, 0x2e

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_7
    const/16 v8, 0x2e

    .line 119
    .line 120
    if-ne v7, v8, :cond_a

    .line 121
    .line 122
    if-nez v13, :cond_9

    .line 123
    .line 124
    sub-int v6, v9, v1

    .line 125
    .line 126
    if-eqz v10, :cond_8

    .line 127
    .line 128
    add-int/lit8 v6, v6, -0x1

    .line 129
    .line 130
    :cond_8
    move v14, v6

    .line 131
    move/from16 v13, v16

    .line 132
    .line 133
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 134
    .line 135
    move v7, v8

    .line 136
    const/16 v8, 0x30

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_9
    new-instance v3, Ljava/lang/NumberFormatException;

    .line 140
    .line 141
    invoke-direct {v3, v15}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v3

    .line 145
    :cond_a
    sub-int v5, v5, v19

    .line 146
    .line 147
    if-nez v5, :cond_b

    .line 148
    .line 149
    move/from16 v7, v16

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_b
    const/4 v7, 0x0

    .line 153
    :goto_6
    if-eqz v7, :cond_c

    .line 154
    .line 155
    if-eqz v12, :cond_1b

    .line 156
    .line 157
    :cond_c
    if-eqz v13, :cond_d

    .line 158
    .line 159
    sub-int/2addr v14, v12

    .line 160
    goto :goto_7

    .line 161
    :cond_d
    add-int v14, v5, v19

    .line 162
    .line 163
    :goto_7
    if-ge v9, v3, :cond_e

    .line 164
    .line 165
    aget-byte v8, v0, v9

    .line 166
    .line 167
    const/16 v10, 0x65

    .line 168
    .line 169
    if-eq v8, v10, :cond_f

    .line 170
    .line 171
    const/16 v10, 0x45

    .line 172
    .line 173
    if-ne v8, v10, :cond_e

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_e
    move/from16 v18, v7

    .line 177
    .line 178
    goto :goto_f

    .line 179
    :cond_f
    :goto_8
    add-int/lit8 v8, v9, 0x1

    .line 180
    .line 181
    aget-byte v10, v0, v8

    .line 182
    .line 183
    const/16 v12, 0x2b

    .line 184
    .line 185
    if-eq v10, v12, :cond_11

    .line 186
    .line 187
    const/16 v12, 0x2d

    .line 188
    .line 189
    if-eq v10, v12, :cond_10

    .line 190
    .line 191
    move/from16 v9, v16

    .line 192
    .line 193
    goto :goto_a

    .line 194
    :cond_10
    const/4 v8, -0x1

    .line 195
    goto :goto_9

    .line 196
    :cond_11
    move/from16 v8, v16

    .line 197
    .line 198
    :goto_9
    add-int/lit8 v9, v9, 0x2

    .line 199
    .line 200
    move/from16 v20, v9

    .line 201
    .line 202
    move v9, v8

    .line 203
    move/from16 v8, v20

    .line 204
    .line 205
    :goto_a
    move v12, v8

    .line 206
    const/4 v10, 0x0

    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    :goto_b
    if-ge v12, v3, :cond_13

    .line 210
    .line 211
    const v13, 0xccccccc

    .line 212
    .line 213
    .line 214
    if-lt v10, v13, :cond_12

    .line 215
    .line 216
    move/from16 v17, v16

    .line 217
    .line 218
    :cond_12
    add-int/lit8 v13, v12, 0x1

    .line 219
    .line 220
    aget-byte v15, v0, v12

    .line 221
    .line 222
    move/from16 v18, v7

    .line 223
    .line 224
    const/16 v7, 0x30

    .line 225
    .line 226
    if-lt v15, v7, :cond_14

    .line 227
    .line 228
    if-gt v15, v6, :cond_14

    .line 229
    .line 230
    mul-int/lit8 v10, v10, 0xa

    .line 231
    .line 232
    add-int/lit8 v15, v15, -0x30

    .line 233
    .line 234
    add-int/2addr v10, v15

    .line 235
    move v12, v13

    .line 236
    move/from16 v7, v18

    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_13
    move/from16 v18, v7

    .line 240
    .line 241
    :cond_14
    add-int/lit16 v6, v5, 0x144

    .line 242
    .line 243
    add-int v6, v6, v19

    .line 244
    .line 245
    if-nez v17, :cond_16

    .line 246
    .line 247
    if-le v10, v6, :cond_15

    .line 248
    .line 249
    goto :goto_d

    .line 250
    :cond_15
    mul-int/2addr v9, v10

    .line 251
    add-int/2addr v9, v14

    .line 252
    :goto_c
    move v14, v9

    .line 253
    goto :goto_e

    .line 254
    :cond_16
    :goto_d
    mul-int/2addr v9, v6

    .line 255
    goto :goto_c

    .line 256
    :goto_e
    if-eq v12, v8, :cond_1b

    .line 257
    .line 258
    move v9, v12

    .line 259
    :goto_f
    if-ge v9, v3, :cond_17

    .line 260
    .line 261
    add-int/lit8 v3, v3, -0x1

    .line 262
    .line 263
    if-ne v9, v3, :cond_1b

    .line 264
    .line 265
    :cond_17
    if-eqz v18, :cond_19

    .line 266
    .line 267
    if-eqz v4, :cond_18

    .line 268
    .line 269
    const-wide/high16 v0, -0x8000000000000000L

    .line 270
    .line 271
    return-wide v0

    .line 272
    :cond_18
    const-wide/16 v0, 0x0

    .line 273
    .line 274
    return-wide v0

    .line 275
    :cond_19
    invoke-static {v4, v14, v11, v5}, Lcom/alibaba/fastjson2/util/TypeUtils;->doubleValue(ZI[CI)D

    .line 276
    .line 277
    .line 278
    move-result-wide v0

    .line 279
    return-wide v0

    .line 280
    :cond_1a
    new-instance v3, Ljava/lang/NumberFormatException;

    .line 281
    .line 282
    const-string v4, "empty String"

    .line 283
    .line 284
    invoke-direct {v3, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v3
    :try_end_1
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 288
    :catch_0
    :cond_1b
    new-instance v3, Ljava/lang/String;

    .line 289
    .line 290
    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 291
    .line 292
    .line 293
    invoke-static {v3}, Lah/a;->u(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    const-wide/16 v0, 0x0

    .line 297
    .line 298
    return-wide v0
.end method

.method public static parseDouble([CII)D
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    add-int v3, v1, v2

    if-eqz v2, :cond_1a

    .line 299
    :try_start_0
    aget-char v4, v0, v1

    const/16 v5, 0x2d

    const/16 v6, 0x2b

    if-eq v4, v6, :cond_1

    if-eq v4, v5, :cond_0

    move v9, v1

    const/4 v4, 0x0

    const/4 v10, 0x0

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    add-int/lit8 v9, v1, 0x1

    const/4 v10, 0x1

    .line 300
    :goto_1
    new-array v11, v2, [C
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 301
    :goto_2
    const-string v15, "multiple points"

    const/16 v16, 0x1

    const/16 v7, 0x2e

    const/16 v8, 0x30

    if-ge v9, v3, :cond_5

    .line 302
    :try_start_1
    aget-char v5, v0, v9

    if-ne v5, v8, :cond_2

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_2
    if-ne v5, v7, :cond_5

    if-nez v13, :cond_4

    sub-int v5, v9, v1

    if-eqz v10, :cond_3

    add-int/lit8 v5, v5, -0x1

    :cond_3
    move v14, v5

    move/from16 v13, v16

    :goto_3
    add-int/lit8 v9, v9, 0x1

    const/16 v5, 0x2d

    goto :goto_2

    .line 303
    :cond_4
    new-instance v3, Ljava/lang/NumberFormatException;

    invoke-direct {v3, v15}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_5
    const/4 v5, 0x0

    const/16 v19, 0x0

    :goto_4
    const/16 v6, 0x39

    if-ge v9, v3, :cond_a

    .line 304
    aget-char v7, v0, v9

    const/16 v8, 0x31

    if-lt v7, v8, :cond_6

    if-gt v7, v6, :cond_6

    add-int/lit8 v6, v5, 0x1

    .line 305
    aput-char v7, v11, v5

    move v5, v6

    const/16 v8, 0x2e

    const/16 v19, 0x0

    goto :goto_5

    :cond_6
    const/16 v8, 0x30

    if-ne v7, v8, :cond_7

    add-int/lit8 v6, v5, 0x1

    .line 306
    aput-char v7, v11, v5

    add-int/lit8 v19, v19, 0x1

    move v5, v6

    const/16 v8, 0x2e

    goto :goto_5

    :cond_7
    const/16 v8, 0x2e

    if-ne v7, v8, :cond_a

    if-nez v13, :cond_9

    sub-int v6, v9, v1

    if-eqz v10, :cond_8

    add-int/lit8 v6, v6, -0x1

    :cond_8
    move v14, v6

    move/from16 v13, v16

    :goto_5
    add-int/lit8 v9, v9, 0x1

    move v7, v8

    const/16 v8, 0x30

    goto :goto_4

    .line 307
    :cond_9
    new-instance v3, Ljava/lang/NumberFormatException;

    invoke-direct {v3, v15}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_a
    sub-int v5, v5, v19

    if-nez v5, :cond_b

    move/from16 v7, v16

    goto :goto_6

    :cond_b
    const/4 v7, 0x0

    :goto_6
    if-eqz v7, :cond_c

    if-eqz v12, :cond_1b

    :cond_c
    if-eqz v13, :cond_d

    sub-int/2addr v14, v12

    goto :goto_7

    :cond_d
    add-int v14, v5, v19

    :goto_7
    if-ge v9, v3, :cond_e

    .line 308
    aget-char v8, v0, v9

    const/16 v10, 0x65

    if-eq v8, v10, :cond_f

    const/16 v10, 0x45

    if-ne v8, v10, :cond_e

    goto :goto_8

    :cond_e
    move/from16 v18, v7

    goto :goto_f

    :cond_f
    :goto_8
    add-int/lit8 v8, v9, 0x1

    .line 309
    aget-char v10, v0, v8

    const/16 v12, 0x2b

    if-eq v10, v12, :cond_11

    const/16 v12, 0x2d

    if-eq v10, v12, :cond_10

    move/from16 v9, v16

    goto :goto_a

    :cond_10
    const/4 v8, -0x1

    goto :goto_9

    :cond_11
    move/from16 v8, v16

    :goto_9
    add-int/lit8 v9, v9, 0x2

    move/from16 v20, v9

    move v9, v8

    move/from16 v8, v20

    :goto_a
    move v12, v8

    const/4 v10, 0x0

    const/16 v17, 0x0

    :goto_b
    if-ge v12, v3, :cond_13

    const v13, 0xccccccc

    if-lt v10, v13, :cond_12

    move/from16 v17, v16

    :cond_12
    add-int/lit8 v13, v12, 0x1

    .line 310
    aget-char v15, v0, v12

    move/from16 v18, v7

    const/16 v7, 0x30

    if-lt v15, v7, :cond_14

    if-gt v15, v6, :cond_14

    mul-int/lit8 v10, v10, 0xa

    add-int/lit8 v15, v15, -0x30

    add-int/2addr v10, v15

    move v12, v13

    move/from16 v7, v18

    goto :goto_b

    :cond_13
    move/from16 v18, v7

    :cond_14
    add-int/lit16 v6, v5, 0x144

    add-int v6, v6, v19

    if-nez v17, :cond_16

    if-le v10, v6, :cond_15

    goto :goto_d

    :cond_15
    mul-int/2addr v9, v10

    add-int/2addr v9, v14

    :goto_c
    move v14, v9

    goto :goto_e

    :cond_16
    :goto_d
    mul-int/2addr v9, v6

    goto :goto_c

    :goto_e
    if-eq v12, v8, :cond_1b

    move v9, v12

    :goto_f
    if-ge v9, v3, :cond_17

    add-int/lit8 v3, v3, -0x1

    if-ne v9, v3, :cond_1b

    :cond_17
    if-eqz v18, :cond_19

    if-eqz v4, :cond_18

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_18
    const-wide/16 v0, 0x0

    return-wide v0

    .line 311
    :cond_19
    invoke-static {v4, v14, v11, v5}, Lcom/alibaba/fastjson2/util/TypeUtils;->doubleValue(ZI[CI)D

    move-result-wide v0

    return-wide v0

    .line 312
    :cond_1a
    new-instance v3, Ljava/lang/NumberFormatException;

    const-string v4, "empty String"

    invoke-direct {v3, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 313
    :catch_0
    :cond_1b
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v3}, Lah/a;->u(Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static parseFloat([BII)F
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    add-int v3, v1, v2

    .line 8
    .line 9
    if-eqz v2, :cond_1a

    .line 10
    .line 11
    :try_start_0
    aget-byte v4, v0, v1

    .line 12
    .line 13
    const/16 v5, 0x2d

    .line 14
    .line 15
    const/16 v6, 0x2b

    .line 16
    .line 17
    if-eq v4, v6, :cond_1

    .line 18
    .line 19
    if-eq v4, v5, :cond_0

    .line 20
    .line 21
    move v9, v1

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v4, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v4, 0x0

    .line 28
    :goto_0
    add-int/lit8 v9, v1, 0x1

    .line 29
    .line 30
    const/4 v10, 0x1

    .line 31
    :goto_1
    new-array v11, v2, [C
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x0

    .line 36
    :goto_2
    const-string v15, "multiple points"

    .line 37
    .line 38
    const/16 v16, 0x1

    .line 39
    .line 40
    const/16 v7, 0x2e

    .line 41
    .line 42
    const/16 v8, 0x30

    .line 43
    .line 44
    if-ge v9, v3, :cond_5

    .line 45
    .line 46
    :try_start_1
    aget-byte v5, v0, v9

    .line 47
    .line 48
    if-ne v5, v8, :cond_2

    .line 49
    .line 50
    add-int/lit8 v12, v12, 0x1

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    if-ne v5, v7, :cond_5

    .line 54
    .line 55
    if-nez v13, :cond_4

    .line 56
    .line 57
    sub-int v5, v9, v1

    .line 58
    .line 59
    if-eqz v10, :cond_3

    .line 60
    .line 61
    add-int/lit8 v5, v5, -0x1

    .line 62
    .line 63
    :cond_3
    move v14, v5

    .line 64
    move/from16 v13, v16

    .line 65
    .line 66
    :goto_3
    add-int/lit8 v9, v9, 0x1

    .line 67
    .line 68
    const/16 v5, 0x2d

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    new-instance v3, Ljava/lang/NumberFormatException;

    .line 72
    .line 73
    invoke-direct {v3, v15}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v3

    .line 77
    :cond_5
    const/4 v5, 0x0

    .line 78
    const/16 v19, 0x0

    .line 79
    .line 80
    :goto_4
    const/16 v6, 0x39

    .line 81
    .line 82
    if-ge v9, v3, :cond_a

    .line 83
    .line 84
    aget-byte v7, v0, v9

    .line 85
    .line 86
    const/16 v8, 0x31

    .line 87
    .line 88
    if-lt v7, v8, :cond_6

    .line 89
    .line 90
    if-gt v7, v6, :cond_6

    .line 91
    .line 92
    add-int/lit8 v6, v5, 0x1

    .line 93
    .line 94
    int-to-char v7, v7

    .line 95
    aput-char v7, v11, v5

    .line 96
    .line 97
    move v5, v6

    .line 98
    const/16 v8, 0x2e

    .line 99
    .line 100
    const/16 v19, 0x0

    .line 101
    .line 102
    goto :goto_5

    .line 103
    :cond_6
    const/16 v8, 0x30

    .line 104
    .line 105
    if-ne v7, v8, :cond_7

    .line 106
    .line 107
    add-int/lit8 v6, v5, 0x1

    .line 108
    .line 109
    int-to-char v7, v7

    .line 110
    aput-char v7, v11, v5

    .line 111
    .line 112
    add-int/lit8 v19, v19, 0x1

    .line 113
    .line 114
    move v5, v6

    .line 115
    const/16 v8, 0x2e

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_7
    const/16 v8, 0x2e

    .line 119
    .line 120
    if-ne v7, v8, :cond_a

    .line 121
    .line 122
    if-nez v13, :cond_9

    .line 123
    .line 124
    sub-int v6, v9, v1

    .line 125
    .line 126
    if-eqz v10, :cond_8

    .line 127
    .line 128
    add-int/lit8 v6, v6, -0x1

    .line 129
    .line 130
    :cond_8
    move v14, v6

    .line 131
    move/from16 v13, v16

    .line 132
    .line 133
    :goto_5
    add-int/lit8 v9, v9, 0x1

    .line 134
    .line 135
    move v7, v8

    .line 136
    const/16 v8, 0x30

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_9
    new-instance v3, Ljava/lang/NumberFormatException;

    .line 140
    .line 141
    invoke-direct {v3, v15}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v3

    .line 145
    :cond_a
    sub-int v5, v5, v19

    .line 146
    .line 147
    if-nez v5, :cond_b

    .line 148
    .line 149
    move/from16 v7, v16

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_b
    const/4 v7, 0x0

    .line 153
    :goto_6
    if-eqz v7, :cond_c

    .line 154
    .line 155
    if-eqz v12, :cond_1b

    .line 156
    .line 157
    :cond_c
    if-eqz v13, :cond_d

    .line 158
    .line 159
    sub-int/2addr v14, v12

    .line 160
    goto :goto_7

    .line 161
    :cond_d
    add-int v14, v5, v19

    .line 162
    .line 163
    :goto_7
    if-ge v9, v3, :cond_e

    .line 164
    .line 165
    aget-byte v8, v0, v9

    .line 166
    .line 167
    const/16 v10, 0x65

    .line 168
    .line 169
    if-eq v8, v10, :cond_f

    .line 170
    .line 171
    const/16 v10, 0x45

    .line 172
    .line 173
    if-ne v8, v10, :cond_e

    .line 174
    .line 175
    goto :goto_8

    .line 176
    :cond_e
    move/from16 v18, v7

    .line 177
    .line 178
    goto :goto_f

    .line 179
    :cond_f
    :goto_8
    add-int/lit8 v8, v9, 0x1

    .line 180
    .line 181
    aget-byte v10, v0, v8

    .line 182
    .line 183
    const/16 v12, 0x2b

    .line 184
    .line 185
    if-eq v10, v12, :cond_11

    .line 186
    .line 187
    const/16 v12, 0x2d

    .line 188
    .line 189
    if-eq v10, v12, :cond_10

    .line 190
    .line 191
    move/from16 v9, v16

    .line 192
    .line 193
    goto :goto_a

    .line 194
    :cond_10
    const/4 v8, -0x1

    .line 195
    goto :goto_9

    .line 196
    :cond_11
    move/from16 v8, v16

    .line 197
    .line 198
    :goto_9
    add-int/lit8 v9, v9, 0x2

    .line 199
    .line 200
    move/from16 v20, v9

    .line 201
    .line 202
    move v9, v8

    .line 203
    move/from16 v8, v20

    .line 204
    .line 205
    :goto_a
    move v12, v8

    .line 206
    const/4 v10, 0x0

    .line 207
    const/16 v17, 0x0

    .line 208
    .line 209
    :goto_b
    if-ge v12, v3, :cond_13

    .line 210
    .line 211
    const v13, 0xccccccc

    .line 212
    .line 213
    .line 214
    if-lt v10, v13, :cond_12

    .line 215
    .line 216
    move/from16 v17, v16

    .line 217
    .line 218
    :cond_12
    add-int/lit8 v13, v12, 0x1

    .line 219
    .line 220
    aget-byte v15, v0, v12

    .line 221
    .line 222
    move/from16 v18, v7

    .line 223
    .line 224
    const/16 v7, 0x30

    .line 225
    .line 226
    if-lt v15, v7, :cond_14

    .line 227
    .line 228
    if-gt v15, v6, :cond_14

    .line 229
    .line 230
    mul-int/lit8 v10, v10, 0xa

    .line 231
    .line 232
    add-int/lit8 v15, v15, -0x30

    .line 233
    .line 234
    add-int/2addr v10, v15

    .line 235
    move v12, v13

    .line 236
    move/from16 v7, v18

    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_13
    move/from16 v18, v7

    .line 240
    .line 241
    :cond_14
    add-int/lit16 v6, v5, 0x144

    .line 242
    .line 243
    add-int v6, v6, v19

    .line 244
    .line 245
    if-nez v17, :cond_16

    .line 246
    .line 247
    if-le v10, v6, :cond_15

    .line 248
    .line 249
    goto :goto_d

    .line 250
    :cond_15
    mul-int/2addr v9, v10

    .line 251
    add-int/2addr v9, v14

    .line 252
    :goto_c
    move v14, v9

    .line 253
    goto :goto_e

    .line 254
    :cond_16
    :goto_d
    mul-int/2addr v9, v6

    .line 255
    goto :goto_c

    .line 256
    :goto_e
    if-eq v12, v8, :cond_1b

    .line 257
    .line 258
    move v9, v12

    .line 259
    :goto_f
    if-ge v9, v3, :cond_17

    .line 260
    .line 261
    add-int/lit8 v3, v3, -0x1

    .line 262
    .line 263
    if-ne v9, v3, :cond_1b

    .line 264
    .line 265
    :cond_17
    if-eqz v18, :cond_19

    .line 266
    .line 267
    if-eqz v4, :cond_18

    .line 268
    .line 269
    const/high16 v0, -0x80000000

    .line 270
    .line 271
    return v0

    .line 272
    :cond_18
    const/4 v0, 0x0

    .line 273
    return v0

    .line 274
    :cond_19
    invoke-static {v4, v14, v11, v5}, Lcom/alibaba/fastjson2/util/TypeUtils;->floatValue(ZI[CI)F

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    return v0

    .line 279
    :cond_1a
    new-instance v3, Ljava/lang/NumberFormatException;

    .line 280
    .line 281
    const-string v4, "empty String"

    .line 282
    .line 283
    invoke-direct {v3, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v3
    :try_end_1
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 287
    :catch_0
    :cond_1b
    new-instance v3, Ljava/lang/String;

    .line 288
    .line 289
    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 290
    .line 291
    .line 292
    invoke-static {v3}, Lah/a;->u(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    const/4 v0, 0x0

    .line 296
    return v0
.end method

.method public static parseFloat([CII)F
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    add-int v3, v1, v2

    if-eqz v2, :cond_1a

    .line 297
    :try_start_0
    aget-char v4, v0, v1

    const/16 v5, 0x2d

    const/16 v6, 0x2b

    if-eq v4, v6, :cond_1

    if-eq v4, v5, :cond_0

    move v9, v1

    const/4 v4, 0x0

    const/4 v10, 0x0

    goto :goto_1

    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    add-int/lit8 v9, v1, 0x1

    const/4 v10, 0x1

    .line 298
    :goto_1
    new-array v11, v2, [C
    :try_end_0
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 299
    :goto_2
    const-string v15, "multiple points"

    const/16 v16, 0x1

    const/16 v7, 0x2e

    const/16 v8, 0x30

    if-ge v9, v3, :cond_5

    .line 300
    :try_start_1
    aget-char v5, v0, v9

    if-ne v5, v8, :cond_2

    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_2
    if-ne v5, v7, :cond_5

    if-nez v13, :cond_4

    sub-int v5, v9, v1

    if-eqz v10, :cond_3

    add-int/lit8 v5, v5, -0x1

    :cond_3
    move v14, v5

    move/from16 v13, v16

    :goto_3
    add-int/lit8 v9, v9, 0x1

    const/16 v5, 0x2d

    goto :goto_2

    .line 301
    :cond_4
    new-instance v3, Ljava/lang/NumberFormatException;

    invoke-direct {v3, v15}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_5
    const/4 v5, 0x0

    const/16 v19, 0x0

    :goto_4
    const/16 v6, 0x39

    if-ge v9, v3, :cond_a

    .line 302
    aget-char v7, v0, v9

    const/16 v8, 0x31

    if-lt v7, v8, :cond_6

    if-gt v7, v6, :cond_6

    add-int/lit8 v6, v5, 0x1

    .line 303
    aput-char v7, v11, v5

    move v5, v6

    const/16 v8, 0x2e

    const/16 v19, 0x0

    goto :goto_5

    :cond_6
    const/16 v8, 0x30

    if-ne v7, v8, :cond_7

    add-int/lit8 v6, v5, 0x1

    .line 304
    aput-char v7, v11, v5

    add-int/lit8 v19, v19, 0x1

    move v5, v6

    const/16 v8, 0x2e

    goto :goto_5

    :cond_7
    const/16 v8, 0x2e

    if-ne v7, v8, :cond_a

    if-nez v13, :cond_9

    sub-int v6, v9, v1

    if-eqz v10, :cond_8

    add-int/lit8 v6, v6, -0x1

    :cond_8
    move v14, v6

    move/from16 v13, v16

    :goto_5
    add-int/lit8 v9, v9, 0x1

    move v7, v8

    const/16 v8, 0x30

    goto :goto_4

    .line 305
    :cond_9
    new-instance v3, Ljava/lang/NumberFormatException;

    invoke-direct {v3, v15}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_a
    sub-int v5, v5, v19

    if-nez v5, :cond_b

    move/from16 v7, v16

    goto :goto_6

    :cond_b
    const/4 v7, 0x0

    :goto_6
    if-eqz v7, :cond_c

    if-eqz v12, :cond_1b

    :cond_c
    if-eqz v13, :cond_d

    sub-int/2addr v14, v12

    goto :goto_7

    :cond_d
    add-int v14, v5, v19

    :goto_7
    if-ge v9, v3, :cond_e

    .line 306
    aget-char v8, v0, v9

    const/16 v10, 0x65

    if-eq v8, v10, :cond_f

    const/16 v10, 0x45

    if-ne v8, v10, :cond_e

    goto :goto_8

    :cond_e
    move/from16 v18, v7

    goto :goto_f

    :cond_f
    :goto_8
    add-int/lit8 v8, v9, 0x1

    .line 307
    aget-char v10, v0, v8

    const/16 v12, 0x2b

    if-eq v10, v12, :cond_11

    const/16 v12, 0x2d

    if-eq v10, v12, :cond_10

    move/from16 v9, v16

    goto :goto_a

    :cond_10
    const/4 v8, -0x1

    goto :goto_9

    :cond_11
    move/from16 v8, v16

    :goto_9
    add-int/lit8 v9, v9, 0x2

    move/from16 v20, v9

    move v9, v8

    move/from16 v8, v20

    :goto_a
    move v12, v8

    const/4 v10, 0x0

    const/16 v17, 0x0

    :goto_b
    if-ge v12, v3, :cond_13

    const v13, 0xccccccc

    if-lt v10, v13, :cond_12

    move/from16 v17, v16

    :cond_12
    add-int/lit8 v13, v12, 0x1

    .line 308
    aget-char v15, v0, v12

    move/from16 v18, v7

    const/16 v7, 0x30

    if-lt v15, v7, :cond_14

    if-gt v15, v6, :cond_14

    mul-int/lit8 v10, v10, 0xa

    add-int/lit8 v15, v15, -0x30

    add-int/2addr v10, v15

    move v12, v13

    move/from16 v7, v18

    goto :goto_b

    :cond_13
    move/from16 v18, v7

    :cond_14
    add-int/lit16 v6, v5, 0x144

    add-int v6, v6, v19

    if-nez v17, :cond_16

    if-le v10, v6, :cond_15

    goto :goto_d

    :cond_15
    mul-int/2addr v9, v10

    add-int/2addr v9, v14

    :goto_c
    move v14, v9

    goto :goto_e

    :cond_16
    :goto_d
    mul-int/2addr v9, v6

    goto :goto_c

    :goto_e
    if-eq v12, v8, :cond_1b

    move v9, v12

    :goto_f
    if-ge v9, v3, :cond_17

    add-int/lit8 v3, v3, -0x1

    if-ne v9, v3, :cond_1b

    :cond_17
    if-eqz v18, :cond_19

    if-eqz v4, :cond_18

    const/high16 v0, -0x80000000

    return v0

    :cond_18
    const/4 v0, 0x0

    return v0

    .line 309
    :cond_19
    invoke-static {v4, v14, v11, v5}, Lcom/alibaba/fastjson2/util/TypeUtils;->floatValue(ZI[CI)F

    move-result v0

    return v0

    .line 310
    :cond_1a
    new-instance v3, Ljava/lang/NumberFormatException;

    const-string v4, "empty String"

    invoke-direct {v3, v4}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catch Ljava/lang/StringIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    .line 311
    :catch_0
    :cond_1b
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    invoke-static {v3}, Lah/a;->u(Ljava/lang/Object;)V

    const/4 v0, 0x0

    return v0
.end method

.method public static parseInt([BII)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const v3, 0xf4240

    .line 8
    .line 9
    .line 10
    const v4, 0x186a0

    .line 11
    .line 12
    .line 13
    const/16 v5, 0x2710

    .line 14
    .line 15
    const/16 v9, 0x39

    .line 16
    .line 17
    const/16 v10, 0x30

    .line 18
    .line 19
    packed-switch v2, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :pswitch_0
    aget-byte v11, v0, v1

    .line 25
    .line 26
    add-int/lit8 v12, v1, 0x1

    .line 27
    .line 28
    aget-byte v12, v0, v12

    .line 29
    .line 30
    add-int/lit8 v13, v1, 0x2

    .line 31
    .line 32
    aget-byte v13, v0, v13

    .line 33
    .line 34
    add-int/lit8 v14, v1, 0x3

    .line 35
    .line 36
    aget-byte v14, v0, v14

    .line 37
    .line 38
    add-int/lit8 v15, v1, 0x4

    .line 39
    .line 40
    aget-byte v15, v0, v15

    .line 41
    .line 42
    add-int/lit8 v16, v1, 0x5

    .line 43
    .line 44
    aget-byte v8, v0, v16

    .line 45
    .line 46
    add-int/lit8 v16, v1, 0x6

    .line 47
    .line 48
    aget-byte v7, v0, v16

    .line 49
    .line 50
    add-int/lit8 v16, v1, 0x7

    .line 51
    .line 52
    aget-byte v6, v0, v16

    .line 53
    .line 54
    if-lt v11, v10, :cond_0

    .line 55
    .line 56
    if-gt v11, v9, :cond_0

    .line 57
    .line 58
    if-lt v12, v10, :cond_0

    .line 59
    .line 60
    if-gt v12, v9, :cond_0

    .line 61
    .line 62
    if-lt v13, v10, :cond_0

    .line 63
    .line 64
    if-gt v13, v9, :cond_0

    .line 65
    .line 66
    if-lt v14, v10, :cond_0

    .line 67
    .line 68
    if-gt v14, v9, :cond_0

    .line 69
    .line 70
    if-lt v15, v10, :cond_0

    .line 71
    .line 72
    if-gt v15, v9, :cond_0

    .line 73
    .line 74
    if-lt v8, v10, :cond_0

    .line 75
    .line 76
    if-gt v8, v9, :cond_0

    .line 77
    .line 78
    if-lt v7, v10, :cond_0

    .line 79
    .line 80
    if-gt v7, v9, :cond_0

    .line 81
    .line 82
    if-lt v6, v10, :cond_0

    .line 83
    .line 84
    if-gt v6, v9, :cond_0

    .line 85
    .line 86
    sub-int/2addr v11, v10

    .line 87
    const v0, 0x989680

    .line 88
    .line 89
    .line 90
    mul-int/2addr v11, v0

    .line 91
    invoke-static {v12, v10, v3, v11}, Lp/a;->z(IIII)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v13, v10, v4, v0}, Lp/a;->z(IIII)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v14, v10, v5, v0}, Lp/a;->z(IIII)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/16 v1, 0x3e8

    .line 104
    .line 105
    invoke-static {v15, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    const/16 v1, 0x64

    .line 110
    .line 111
    invoke-static {v8, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    const/16 v1, 0xa

    .line 116
    .line 117
    invoke-static {v7, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    :goto_0
    sub-int/2addr v6, v10

    .line 122
    add-int/2addr v6, v0

    .line 123
    return v6

    .line 124
    :pswitch_1
    aget-byte v6, v0, v1

    .line 125
    .line 126
    add-int/lit8 v7, v1, 0x1

    .line 127
    .line 128
    aget-byte v7, v0, v7

    .line 129
    .line 130
    add-int/lit8 v8, v1, 0x2

    .line 131
    .line 132
    aget-byte v8, v0, v8

    .line 133
    .line 134
    add-int/lit8 v11, v1, 0x3

    .line 135
    .line 136
    aget-byte v11, v0, v11

    .line 137
    .line 138
    add-int/lit8 v12, v1, 0x4

    .line 139
    .line 140
    aget-byte v12, v0, v12

    .line 141
    .line 142
    add-int/lit8 v13, v1, 0x5

    .line 143
    .line 144
    aget-byte v13, v0, v13

    .line 145
    .line 146
    add-int/lit8 v14, v1, 0x6

    .line 147
    .line 148
    aget-byte v14, v0, v14

    .line 149
    .line 150
    if-lt v6, v10, :cond_0

    .line 151
    .line 152
    if-gt v6, v9, :cond_0

    .line 153
    .line 154
    if-lt v7, v10, :cond_0

    .line 155
    .line 156
    if-gt v7, v9, :cond_0

    .line 157
    .line 158
    if-lt v8, v10, :cond_0

    .line 159
    .line 160
    if-gt v8, v9, :cond_0

    .line 161
    .line 162
    if-lt v11, v10, :cond_0

    .line 163
    .line 164
    if-gt v11, v9, :cond_0

    .line 165
    .line 166
    if-lt v12, v10, :cond_0

    .line 167
    .line 168
    if-gt v12, v9, :cond_0

    .line 169
    .line 170
    if-lt v13, v10, :cond_0

    .line 171
    .line 172
    if-gt v13, v9, :cond_0

    .line 173
    .line 174
    if-lt v14, v10, :cond_0

    .line 175
    .line 176
    if-gt v14, v9, :cond_0

    .line 177
    .line 178
    sub-int/2addr v6, v10

    .line 179
    mul-int/2addr v6, v3

    .line 180
    invoke-static {v7, v10, v4, v6}, Lp/a;->z(IIII)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-static {v8, v10, v5, v0}, Lp/a;->z(IIII)I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    const/16 v1, 0x3e8

    .line 189
    .line 190
    invoke-static {v11, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    const/16 v1, 0x64

    .line 195
    .line 196
    invoke-static {v12, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    const/16 v1, 0xa

    .line 201
    .line 202
    invoke-static {v13, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    sub-int/2addr v14, v10

    .line 207
    add-int/2addr v14, v0

    .line 208
    return v14

    .line 209
    :pswitch_2
    aget-byte v3, v0, v1

    .line 210
    .line 211
    add-int/lit8 v6, v1, 0x1

    .line 212
    .line 213
    aget-byte v6, v0, v6

    .line 214
    .line 215
    add-int/lit8 v7, v1, 0x2

    .line 216
    .line 217
    aget-byte v7, v0, v7

    .line 218
    .line 219
    add-int/lit8 v8, v1, 0x3

    .line 220
    .line 221
    aget-byte v8, v0, v8

    .line 222
    .line 223
    add-int/lit8 v11, v1, 0x4

    .line 224
    .line 225
    aget-byte v11, v0, v11

    .line 226
    .line 227
    add-int/lit8 v12, v1, 0x5

    .line 228
    .line 229
    aget-byte v12, v0, v12

    .line 230
    .line 231
    if-lt v3, v10, :cond_0

    .line 232
    .line 233
    if-gt v3, v9, :cond_0

    .line 234
    .line 235
    if-lt v6, v10, :cond_0

    .line 236
    .line 237
    if-gt v6, v9, :cond_0

    .line 238
    .line 239
    if-lt v7, v10, :cond_0

    .line 240
    .line 241
    if-gt v7, v9, :cond_0

    .line 242
    .line 243
    if-lt v8, v10, :cond_0

    .line 244
    .line 245
    if-gt v8, v9, :cond_0

    .line 246
    .line 247
    if-lt v11, v10, :cond_0

    .line 248
    .line 249
    if-gt v11, v9, :cond_0

    .line 250
    .line 251
    if-lt v12, v10, :cond_0

    .line 252
    .line 253
    if-gt v12, v9, :cond_0

    .line 254
    .line 255
    sub-int/2addr v3, v10

    .line 256
    mul-int/2addr v3, v4

    .line 257
    invoke-static {v6, v10, v5, v3}, Lp/a;->z(IIII)I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    const/16 v1, 0x3e8

    .line 262
    .line 263
    invoke-static {v7, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    const/16 v1, 0x64

    .line 268
    .line 269
    invoke-static {v8, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    const/16 v1, 0xa

    .line 274
    .line 275
    invoke-static {v11, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    sub-int/2addr v12, v10

    .line 280
    add-int/2addr v12, v0

    .line 281
    return v12

    .line 282
    :pswitch_3
    aget-byte v3, v0, v1

    .line 283
    .line 284
    add-int/lit8 v4, v1, 0x1

    .line 285
    .line 286
    aget-byte v4, v0, v4

    .line 287
    .line 288
    add-int/lit8 v6, v1, 0x2

    .line 289
    .line 290
    aget-byte v6, v0, v6

    .line 291
    .line 292
    add-int/lit8 v7, v1, 0x3

    .line 293
    .line 294
    aget-byte v7, v0, v7

    .line 295
    .line 296
    add-int/lit8 v8, v1, 0x4

    .line 297
    .line 298
    aget-byte v8, v0, v8

    .line 299
    .line 300
    if-lt v3, v10, :cond_0

    .line 301
    .line 302
    if-gt v3, v9, :cond_0

    .line 303
    .line 304
    if-lt v4, v10, :cond_0

    .line 305
    .line 306
    if-gt v4, v9, :cond_0

    .line 307
    .line 308
    if-lt v6, v10, :cond_0

    .line 309
    .line 310
    if-gt v6, v9, :cond_0

    .line 311
    .line 312
    if-lt v7, v10, :cond_0

    .line 313
    .line 314
    if-gt v7, v9, :cond_0

    .line 315
    .line 316
    if-lt v8, v10, :cond_0

    .line 317
    .line 318
    if-gt v8, v9, :cond_0

    .line 319
    .line 320
    sub-int/2addr v3, v10

    .line 321
    mul-int/2addr v3, v5

    .line 322
    const/16 v1, 0x3e8

    .line 323
    .line 324
    invoke-static {v4, v10, v1, v3}, Lp/a;->z(IIII)I

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    const/16 v1, 0x64

    .line 329
    .line 330
    invoke-static {v6, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    const/16 v1, 0xa

    .line 335
    .line 336
    invoke-static {v7, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    sub-int/2addr v8, v10

    .line 341
    add-int/2addr v8, v0

    .line 342
    return v8

    .line 343
    :pswitch_4
    aget-byte v3, v0, v1

    .line 344
    .line 345
    add-int/lit8 v4, v1, 0x1

    .line 346
    .line 347
    aget-byte v4, v0, v4

    .line 348
    .line 349
    add-int/lit8 v5, v1, 0x2

    .line 350
    .line 351
    aget-byte v5, v0, v5

    .line 352
    .line 353
    add-int/lit8 v6, v1, 0x3

    .line 354
    .line 355
    aget-byte v6, v0, v6

    .line 356
    .line 357
    if-lt v3, v10, :cond_0

    .line 358
    .line 359
    if-gt v3, v9, :cond_0

    .line 360
    .line 361
    if-lt v4, v10, :cond_0

    .line 362
    .line 363
    if-gt v4, v9, :cond_0

    .line 364
    .line 365
    if-lt v5, v10, :cond_0

    .line 366
    .line 367
    if-gt v5, v9, :cond_0

    .line 368
    .line 369
    if-lt v6, v10, :cond_0

    .line 370
    .line 371
    if-gt v6, v9, :cond_0

    .line 372
    .line 373
    sub-int/2addr v3, v10

    .line 374
    const/16 v1, 0x3e8

    .line 375
    .line 376
    mul-int/2addr v3, v1

    .line 377
    const/16 v1, 0x64

    .line 378
    .line 379
    invoke-static {v4, v10, v1, v3}, Lp/a;->z(IIII)I

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    const/16 v1, 0xa

    .line 384
    .line 385
    invoke-static {v5, v10, v1, v0}, Lp/a;->z(IIII)I

    .line 386
    .line 387
    .line 388
    move-result v0

    .line 389
    goto/16 :goto_0

    .line 390
    .line 391
    :pswitch_5
    aget-byte v3, v0, v1

    .line 392
    .line 393
    add-int/lit8 v4, v1, 0x1

    .line 394
    .line 395
    aget-byte v4, v0, v4

    .line 396
    .line 397
    add-int/lit8 v5, v1, 0x2

    .line 398
    .line 399
    aget-byte v5, v0, v5

    .line 400
    .line 401
    if-lt v3, v10, :cond_0

    .line 402
    .line 403
    if-gt v3, v9, :cond_0

    .line 404
    .line 405
    if-lt v4, v10, :cond_0

    .line 406
    .line 407
    if-gt v4, v9, :cond_0

    .line 408
    .line 409
    if-lt v5, v10, :cond_0

    .line 410
    .line 411
    if-gt v5, v9, :cond_0

    .line 412
    .line 413
    sub-int/2addr v3, v10

    .line 414
    const/16 v18, 0x64

    .line 415
    .line 416
    mul-int/lit8 v3, v3, 0x64

    .line 417
    .line 418
    const/16 v1, 0xa

    .line 419
    .line 420
    invoke-static {v4, v10, v1, v3}, Lp/a;->z(IIII)I

    .line 421
    .line 422
    .line 423
    move-result v0

    .line 424
    sub-int/2addr v5, v10

    .line 425
    add-int/2addr v5, v0

    .line 426
    return v5

    .line 427
    :pswitch_6
    aget-byte v3, v0, v1

    .line 428
    .line 429
    add-int/lit8 v4, v1, 0x1

    .line 430
    .line 431
    aget-byte v4, v0, v4

    .line 432
    .line 433
    if-lt v3, v10, :cond_0

    .line 434
    .line 435
    if-gt v3, v9, :cond_0

    .line 436
    .line 437
    if-lt v4, v10, :cond_0

    .line 438
    .line 439
    if-gt v4, v9, :cond_0

    .line 440
    .line 441
    sub-int/2addr v3, v10

    .line 442
    const/16 v17, 0xa

    .line 443
    .line 444
    mul-int/lit8 v3, v3, 0xa

    .line 445
    .line 446
    sub-int/2addr v4, v10

    .line 447
    add-int/2addr v4, v3

    .line 448
    return v4

    .line 449
    :pswitch_7
    aget-byte v3, v0, v1

    .line 450
    .line 451
    if-lt v3, v10, :cond_0

    .line 452
    .line 453
    if-gt v3, v9, :cond_0

    .line 454
    .line 455
    sub-int/2addr v3, v10

    .line 456
    return v3

    .line 457
    :cond_0
    :goto_1
    new-instance v3, Ljava/lang/String;

    .line 458
    .line 459
    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([BII)V

    .line 460
    .line 461
    .line 462
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    return v0

    .line 467
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

.method public static parseInt([CII)I
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const v3, 0xf4240

    const v4, 0x186a0

    const/16 v5, 0x2710

    const/16 v9, 0x39

    const/16 v10, 0x30

    packed-switch v2, :pswitch_data_0

    goto/16 :goto_1

    .line 467
    :pswitch_0
    aget-char v11, v0, v1

    add-int/lit8 v12, v1, 0x1

    .line 468
    aget-char v12, v0, v12

    add-int/lit8 v13, v1, 0x2

    .line 469
    aget-char v13, v0, v13

    add-int/lit8 v14, v1, 0x3

    .line 470
    aget-char v14, v0, v14

    add-int/lit8 v15, v1, 0x4

    .line 471
    aget-char v15, v0, v15

    add-int/lit8 v16, v1, 0x5

    .line 472
    aget-char v8, v0, v16

    add-int/lit8 v16, v1, 0x6

    .line 473
    aget-char v7, v0, v16

    add-int/lit8 v16, v1, 0x7

    .line 474
    aget-char v6, v0, v16

    if-lt v11, v10, :cond_0

    if-gt v11, v9, :cond_0

    if-lt v12, v10, :cond_0

    if-gt v12, v9, :cond_0

    if-lt v13, v10, :cond_0

    if-gt v13, v9, :cond_0

    if-lt v14, v10, :cond_0

    if-gt v14, v9, :cond_0

    if-lt v15, v10, :cond_0

    if-gt v15, v9, :cond_0

    if-lt v8, v10, :cond_0

    if-gt v8, v9, :cond_0

    if-lt v7, v10, :cond_0

    if-gt v7, v9, :cond_0

    if-lt v6, v10, :cond_0

    if-gt v6, v9, :cond_0

    sub-int/2addr v11, v10

    const v0, 0x989680

    mul-int/2addr v11, v0

    .line 475
    invoke-static {v12, v10, v3, v11}, Lp/a;->z(IIII)I

    move-result v0

    invoke-static {v13, v10, v4, v0}, Lp/a;->z(IIII)I

    move-result v0

    invoke-static {v14, v10, v5, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0x3e8

    invoke-static {v15, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0x64

    invoke-static {v8, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v7, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    :goto_0
    sub-int/2addr v6, v10

    add-int/2addr v6, v0

    return v6

    .line 476
    :pswitch_1
    aget-char v6, v0, v1

    add-int/lit8 v7, v1, 0x1

    .line 477
    aget-char v7, v0, v7

    add-int/lit8 v8, v1, 0x2

    .line 478
    aget-char v8, v0, v8

    add-int/lit8 v11, v1, 0x3

    .line 479
    aget-char v11, v0, v11

    add-int/lit8 v12, v1, 0x4

    .line 480
    aget-char v12, v0, v12

    add-int/lit8 v13, v1, 0x5

    .line 481
    aget-char v13, v0, v13

    add-int/lit8 v14, v1, 0x6

    .line 482
    aget-char v14, v0, v14

    if-lt v6, v10, :cond_0

    if-gt v6, v9, :cond_0

    if-lt v7, v10, :cond_0

    if-gt v7, v9, :cond_0

    if-lt v8, v10, :cond_0

    if-gt v8, v9, :cond_0

    if-lt v11, v10, :cond_0

    if-gt v11, v9, :cond_0

    if-lt v12, v10, :cond_0

    if-gt v12, v9, :cond_0

    if-lt v13, v10, :cond_0

    if-gt v13, v9, :cond_0

    if-lt v14, v10, :cond_0

    if-gt v14, v9, :cond_0

    sub-int/2addr v6, v10

    mul-int/2addr v6, v3

    .line 483
    invoke-static {v7, v10, v4, v6}, Lp/a;->z(IIII)I

    move-result v0

    invoke-static {v8, v10, v5, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0x3e8

    invoke-static {v11, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0x64

    invoke-static {v12, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v13, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v14, v10

    add-int/2addr v14, v0

    return v14

    .line 484
    :pswitch_2
    aget-char v3, v0, v1

    add-int/lit8 v6, v1, 0x1

    .line 485
    aget-char v6, v0, v6

    add-int/lit8 v7, v1, 0x2

    .line 486
    aget-char v7, v0, v7

    add-int/lit8 v8, v1, 0x3

    .line 487
    aget-char v8, v0, v8

    add-int/lit8 v11, v1, 0x4

    .line 488
    aget-char v11, v0, v11

    add-int/lit8 v12, v1, 0x5

    .line 489
    aget-char v12, v0, v12

    if-lt v3, v10, :cond_0

    if-gt v3, v9, :cond_0

    if-lt v6, v10, :cond_0

    if-gt v6, v9, :cond_0

    if-lt v7, v10, :cond_0

    if-gt v7, v9, :cond_0

    if-lt v8, v10, :cond_0

    if-gt v8, v9, :cond_0

    if-lt v11, v10, :cond_0

    if-gt v11, v9, :cond_0

    if-lt v12, v10, :cond_0

    if-gt v12, v9, :cond_0

    sub-int/2addr v3, v10

    mul-int/2addr v3, v4

    .line 490
    invoke-static {v6, v10, v5, v3}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0x3e8

    invoke-static {v7, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0x64

    invoke-static {v8, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v11, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v12, v10

    add-int/2addr v12, v0

    return v12

    .line 491
    :pswitch_3
    aget-char v3, v0, v1

    add-int/lit8 v4, v1, 0x1

    .line 492
    aget-char v4, v0, v4

    add-int/lit8 v6, v1, 0x2

    .line 493
    aget-char v6, v0, v6

    add-int/lit8 v7, v1, 0x3

    .line 494
    aget-char v7, v0, v7

    add-int/lit8 v8, v1, 0x4

    .line 495
    aget-char v8, v0, v8

    if-lt v3, v10, :cond_0

    if-gt v3, v9, :cond_0

    if-lt v4, v10, :cond_0

    if-gt v4, v9, :cond_0

    if-lt v6, v10, :cond_0

    if-gt v6, v9, :cond_0

    if-lt v7, v10, :cond_0

    if-gt v7, v9, :cond_0

    if-lt v8, v10, :cond_0

    if-gt v8, v9, :cond_0

    sub-int/2addr v3, v10

    mul-int/2addr v3, v5

    const/16 v1, 0x3e8

    .line 496
    invoke-static {v4, v10, v1, v3}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0x64

    invoke-static {v6, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v7, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v8, v10

    add-int/2addr v8, v0

    return v8

    .line 497
    :pswitch_4
    aget-char v3, v0, v1

    add-int/lit8 v4, v1, 0x1

    .line 498
    aget-char v4, v0, v4

    add-int/lit8 v5, v1, 0x2

    .line 499
    aget-char v5, v0, v5

    add-int/lit8 v6, v1, 0x3

    .line 500
    aget-char v6, v0, v6

    if-lt v3, v10, :cond_0

    if-gt v3, v9, :cond_0

    if-lt v4, v10, :cond_0

    if-gt v4, v9, :cond_0

    if-lt v5, v10, :cond_0

    if-gt v5, v9, :cond_0

    if-lt v6, v10, :cond_0

    if-gt v6, v9, :cond_0

    sub-int/2addr v3, v10

    const/16 v1, 0x3e8

    mul-int/2addr v3, v1

    const/16 v1, 0x64

    .line 501
    invoke-static {v4, v10, v1, v3}, Lp/a;->z(IIII)I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v5, v10, v1, v0}, Lp/a;->z(IIII)I

    move-result v0

    goto/16 :goto_0

    .line 502
    :pswitch_5
    aget-char v3, v0, v1

    add-int/lit8 v4, v1, 0x1

    .line 503
    aget-char v4, v0, v4

    add-int/lit8 v5, v1, 0x2

    .line 504
    aget-char v5, v0, v5

    if-lt v3, v10, :cond_0

    if-gt v3, v9, :cond_0

    if-lt v4, v10, :cond_0

    if-gt v4, v9, :cond_0

    if-lt v5, v10, :cond_0

    if-gt v5, v9, :cond_0

    sub-int/2addr v3, v10

    const/16 v18, 0x64

    mul-int/lit8 v3, v3, 0x64

    const/16 v1, 0xa

    .line 505
    invoke-static {v4, v10, v1, v3}, Lp/a;->z(IIII)I

    move-result v0

    sub-int/2addr v5, v10

    add-int/2addr v5, v0

    return v5

    .line 506
    :pswitch_6
    aget-char v3, v0, v1

    add-int/lit8 v4, v1, 0x1

    .line 507
    aget-char v4, v0, v4

    if-lt v3, v10, :cond_0

    if-gt v3, v9, :cond_0

    if-lt v4, v10, :cond_0

    if-gt v4, v9, :cond_0

    sub-int/2addr v3, v10

    const/16 v17, 0xa

    mul-int/lit8 v3, v3, 0xa

    sub-int/2addr v4, v10

    add-int/2addr v4, v3

    return v4

    .line 508
    :pswitch_7
    aget-char v3, v0, v1

    if-lt v3, v10, :cond_0

    if-gt v3, v9, :cond_0

    sub-int/2addr v3, v10

    return v3

    .line 509
    :cond_0
    :goto_1
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V

    .line 510
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    return v0

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

.method public static parseLong([BII)J
    .locals 13

    .line 1
    const v0, 0x186a0

    .line 2
    .line 3
    .line 4
    const/16 v1, 0x39

    .line 5
    .line 6
    const/16 v2, 0x30

    .line 7
    .line 8
    packed-switch p2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    goto/16 :goto_0

    .line 12
    .line 13
    :pswitch_0
    aget-byte v3, p0, p1

    .line 14
    .line 15
    add-int/lit8 v4, p1, 0x1

    .line 16
    .line 17
    aget-byte v4, p0, v4

    .line 18
    .line 19
    add-int/lit8 v5, p1, 0x2

    .line 20
    .line 21
    aget-byte v5, p0, v5

    .line 22
    .line 23
    add-int/lit8 v6, p1, 0x3

    .line 24
    .line 25
    aget-byte v6, p0, v6

    .line 26
    .line 27
    add-int/lit8 v7, p1, 0x4

    .line 28
    .line 29
    aget-byte v7, p0, v7

    .line 30
    .line 31
    add-int/lit8 v8, p1, 0x5

    .line 32
    .line 33
    aget-byte v8, p0, v8

    .line 34
    .line 35
    add-int/lit8 v9, p1, 0x6

    .line 36
    .line 37
    aget-byte v9, p0, v9

    .line 38
    .line 39
    add-int/lit8 v10, p1, 0x7

    .line 40
    .line 41
    aget-byte v10, p0, v10

    .line 42
    .line 43
    if-lt v3, v2, :cond_0

    .line 44
    .line 45
    if-gt v3, v1, :cond_0

    .line 46
    .line 47
    if-lt v4, v2, :cond_0

    .line 48
    .line 49
    if-gt v4, v1, :cond_0

    .line 50
    .line 51
    if-lt v5, v2, :cond_0

    .line 52
    .line 53
    if-gt v5, v1, :cond_0

    .line 54
    .line 55
    if-lt v6, v2, :cond_0

    .line 56
    .line 57
    if-gt v6, v1, :cond_0

    .line 58
    .line 59
    if-lt v7, v2, :cond_0

    .line 60
    .line 61
    if-gt v7, v1, :cond_0

    .line 62
    .line 63
    if-lt v8, v2, :cond_0

    .line 64
    .line 65
    if-gt v8, v1, :cond_0

    .line 66
    .line 67
    if-lt v9, v2, :cond_0

    .line 68
    .line 69
    if-gt v9, v1, :cond_0

    .line 70
    .line 71
    if-lt v10, v2, :cond_0

    .line 72
    .line 73
    if-gt v10, v1, :cond_0

    .line 74
    .line 75
    sub-int/2addr v3, v2

    .line 76
    int-to-long p0, v3

    .line 77
    const-wide/32 v11, 0x989680

    .line 78
    .line 79
    .line 80
    mul-long/2addr p0, v11

    .line 81
    sub-int/2addr v4, v2

    .line 82
    const p2, 0xf4240

    .line 83
    .line 84
    .line 85
    mul-int/2addr v4, p2

    .line 86
    int-to-long v3, v4

    .line 87
    add-long/2addr p0, v3

    .line 88
    sub-int/2addr v5, v2

    .line 89
    mul-int/2addr v5, v0

    .line 90
    int-to-long v0, v5

    .line 91
    add-long/2addr p0, v0

    .line 92
    sub-int/2addr v6, v2

    .line 93
    mul-int/lit16 v6, v6, 0x2710

    .line 94
    .line 95
    int-to-long v0, v6

    .line 96
    add-long/2addr p0, v0

    .line 97
    sub-int/2addr v7, v2

    .line 98
    mul-int/lit16 v7, v7, 0x3e8

    .line 99
    .line 100
    int-to-long v0, v7

    .line 101
    add-long/2addr p0, v0

    .line 102
    sub-int/2addr v8, v2

    .line 103
    mul-int/lit8 v8, v8, 0x64

    .line 104
    .line 105
    int-to-long v0, v8

    .line 106
    add-long/2addr p0, v0

    .line 107
    sub-int/2addr v9, v2

    .line 108
    mul-int/lit8 v9, v9, 0xa

    .line 109
    .line 110
    int-to-long v0, v9

    .line 111
    add-long/2addr p0, v0

    .line 112
    sub-int/2addr v10, v2

    .line 113
    int-to-long v0, v10

    .line 114
    add-long/2addr p0, v0

    .line 115
    return-wide p0

    .line 116
    :pswitch_1
    aget-byte v3, p0, p1

    .line 117
    .line 118
    add-int/lit8 v4, p1, 0x1

    .line 119
    .line 120
    aget-byte v4, p0, v4

    .line 121
    .line 122
    add-int/lit8 v5, p1, 0x2

    .line 123
    .line 124
    aget-byte v5, p0, v5

    .line 125
    .line 126
    add-int/lit8 v6, p1, 0x3

    .line 127
    .line 128
    aget-byte v6, p0, v6

    .line 129
    .line 130
    add-int/lit8 v7, p1, 0x4

    .line 131
    .line 132
    aget-byte v7, p0, v7

    .line 133
    .line 134
    add-int/lit8 v8, p1, 0x5

    .line 135
    .line 136
    aget-byte v8, p0, v8

    .line 137
    .line 138
    add-int/lit8 v9, p1, 0x6

    .line 139
    .line 140
    aget-byte v9, p0, v9

    .line 141
    .line 142
    if-lt v3, v2, :cond_0

    .line 143
    .line 144
    if-gt v3, v1, :cond_0

    .line 145
    .line 146
    if-lt v4, v2, :cond_0

    .line 147
    .line 148
    if-gt v4, v1, :cond_0

    .line 149
    .line 150
    if-lt v5, v2, :cond_0

    .line 151
    .line 152
    if-gt v5, v1, :cond_0

    .line 153
    .line 154
    if-lt v6, v2, :cond_0

    .line 155
    .line 156
    if-gt v6, v1, :cond_0

    .line 157
    .line 158
    if-lt v7, v2, :cond_0

    .line 159
    .line 160
    if-gt v7, v1, :cond_0

    .line 161
    .line 162
    if-lt v8, v2, :cond_0

    .line 163
    .line 164
    if-gt v8, v1, :cond_0

    .line 165
    .line 166
    if-lt v9, v2, :cond_0

    .line 167
    .line 168
    if-gt v9, v1, :cond_0

    .line 169
    .line 170
    sub-int/2addr v3, v2

    .line 171
    int-to-long p0, v3

    .line 172
    const-wide/32 v10, 0xf4240

    .line 173
    .line 174
    .line 175
    mul-long/2addr p0, v10

    .line 176
    sub-int/2addr v4, v2

    .line 177
    mul-int/2addr v4, v0

    .line 178
    int-to-long v0, v4

    .line 179
    add-long/2addr p0, v0

    .line 180
    sub-int/2addr v5, v2

    .line 181
    mul-int/lit16 v5, v5, 0x2710

    .line 182
    .line 183
    int-to-long v0, v5

    .line 184
    add-long/2addr p0, v0

    .line 185
    sub-int/2addr v6, v2

    .line 186
    mul-int/lit16 v6, v6, 0x3e8

    .line 187
    .line 188
    int-to-long v0, v6

    .line 189
    add-long/2addr p0, v0

    .line 190
    sub-int/2addr v7, v2

    .line 191
    mul-int/lit8 v7, v7, 0x64

    .line 192
    .line 193
    int-to-long v0, v7

    .line 194
    add-long/2addr p0, v0

    .line 195
    sub-int/2addr v8, v2

    .line 196
    mul-int/lit8 v8, v8, 0xa

    .line 197
    .line 198
    int-to-long v0, v8

    .line 199
    add-long/2addr p0, v0

    .line 200
    sub-int/2addr v9, v2

    .line 201
    int-to-long v0, v9

    .line 202
    add-long/2addr p0, v0

    .line 203
    return-wide p0

    .line 204
    :pswitch_2
    aget-byte v0, p0, p1

    .line 205
    .line 206
    add-int/lit8 v3, p1, 0x1

    .line 207
    .line 208
    aget-byte v3, p0, v3

    .line 209
    .line 210
    add-int/lit8 v4, p1, 0x2

    .line 211
    .line 212
    aget-byte v4, p0, v4

    .line 213
    .line 214
    add-int/lit8 v5, p1, 0x3

    .line 215
    .line 216
    aget-byte v5, p0, v5

    .line 217
    .line 218
    add-int/lit8 v6, p1, 0x4

    .line 219
    .line 220
    aget-byte v6, p0, v6

    .line 221
    .line 222
    add-int/lit8 v7, p1, 0x5

    .line 223
    .line 224
    aget-byte v7, p0, v7

    .line 225
    .line 226
    if-lt v0, v2, :cond_0

    .line 227
    .line 228
    if-gt v0, v1, :cond_0

    .line 229
    .line 230
    if-lt v3, v2, :cond_0

    .line 231
    .line 232
    if-gt v3, v1, :cond_0

    .line 233
    .line 234
    if-lt v4, v2, :cond_0

    .line 235
    .line 236
    if-gt v4, v1, :cond_0

    .line 237
    .line 238
    if-lt v5, v2, :cond_0

    .line 239
    .line 240
    if-gt v5, v1, :cond_0

    .line 241
    .line 242
    if-lt v6, v2, :cond_0

    .line 243
    .line 244
    if-gt v6, v1, :cond_0

    .line 245
    .line 246
    if-lt v7, v2, :cond_0

    .line 247
    .line 248
    if-gt v7, v1, :cond_0

    .line 249
    .line 250
    sub-int/2addr v0, v2

    .line 251
    int-to-long p0, v0

    .line 252
    const-wide/32 v0, 0x186a0

    .line 253
    .line 254
    .line 255
    mul-long/2addr p0, v0

    .line 256
    sub-int/2addr v3, v2

    .line 257
    mul-int/lit16 v3, v3, 0x2710

    .line 258
    .line 259
    int-to-long v0, v3

    .line 260
    add-long/2addr p0, v0

    .line 261
    sub-int/2addr v4, v2

    .line 262
    mul-int/lit16 v4, v4, 0x3e8

    .line 263
    .line 264
    int-to-long v0, v4

    .line 265
    add-long/2addr p0, v0

    .line 266
    sub-int/2addr v5, v2

    .line 267
    mul-int/lit8 v5, v5, 0x64

    .line 268
    .line 269
    int-to-long v0, v5

    .line 270
    add-long/2addr p0, v0

    .line 271
    sub-int/2addr v6, v2

    .line 272
    mul-int/lit8 v6, v6, 0xa

    .line 273
    .line 274
    int-to-long v0, v6

    .line 275
    add-long/2addr p0, v0

    .line 276
    sub-int/2addr v7, v2

    .line 277
    int-to-long v0, v7

    .line 278
    add-long/2addr p0, v0

    .line 279
    return-wide p0

    .line 280
    :pswitch_3
    aget-byte v0, p0, p1

    .line 281
    .line 282
    add-int/lit8 v3, p1, 0x1

    .line 283
    .line 284
    aget-byte v3, p0, v3

    .line 285
    .line 286
    add-int/lit8 v4, p1, 0x2

    .line 287
    .line 288
    aget-byte v4, p0, v4

    .line 289
    .line 290
    add-int/lit8 v5, p1, 0x3

    .line 291
    .line 292
    aget-byte v5, p0, v5

    .line 293
    .line 294
    add-int/lit8 v6, p1, 0x4

    .line 295
    .line 296
    aget-byte v6, p0, v6

    .line 297
    .line 298
    if-lt v0, v2, :cond_0

    .line 299
    .line 300
    if-gt v0, v1, :cond_0

    .line 301
    .line 302
    if-lt v3, v2, :cond_0

    .line 303
    .line 304
    if-gt v3, v1, :cond_0

    .line 305
    .line 306
    if-lt v4, v2, :cond_0

    .line 307
    .line 308
    if-gt v4, v1, :cond_0

    .line 309
    .line 310
    if-lt v5, v2, :cond_0

    .line 311
    .line 312
    if-gt v5, v1, :cond_0

    .line 313
    .line 314
    if-lt v6, v2, :cond_0

    .line 315
    .line 316
    if-gt v6, v1, :cond_0

    .line 317
    .line 318
    sub-int/2addr v0, v2

    .line 319
    int-to-long p0, v0

    .line 320
    const-wide/16 v0, 0x2710

    .line 321
    .line 322
    mul-long/2addr p0, v0

    .line 323
    sub-int/2addr v3, v2

    .line 324
    mul-int/lit16 v3, v3, 0x3e8

    .line 325
    .line 326
    int-to-long v0, v3

    .line 327
    add-long/2addr p0, v0

    .line 328
    sub-int/2addr v4, v2

    .line 329
    mul-int/lit8 v4, v4, 0x64

    .line 330
    .line 331
    int-to-long v0, v4

    .line 332
    add-long/2addr p0, v0

    .line 333
    sub-int/2addr v5, v2

    .line 334
    mul-int/lit8 v5, v5, 0xa

    .line 335
    .line 336
    int-to-long v0, v5

    .line 337
    add-long/2addr p0, v0

    .line 338
    sub-int/2addr v6, v2

    .line 339
    int-to-long v0, v6

    .line 340
    add-long/2addr p0, v0

    .line 341
    return-wide p0

    .line 342
    :pswitch_4
    aget-byte v0, p0, p1

    .line 343
    .line 344
    add-int/lit8 v3, p1, 0x1

    .line 345
    .line 346
    aget-byte v3, p0, v3

    .line 347
    .line 348
    add-int/lit8 v4, p1, 0x2

    .line 349
    .line 350
    aget-byte v4, p0, v4

    .line 351
    .line 352
    add-int/lit8 v5, p1, 0x3

    .line 353
    .line 354
    aget-byte v5, p0, v5

    .line 355
    .line 356
    if-lt v0, v2, :cond_0

    .line 357
    .line 358
    if-gt v0, v1, :cond_0

    .line 359
    .line 360
    if-lt v3, v2, :cond_0

    .line 361
    .line 362
    if-gt v3, v1, :cond_0

    .line 363
    .line 364
    if-lt v4, v2, :cond_0

    .line 365
    .line 366
    if-gt v4, v1, :cond_0

    .line 367
    .line 368
    if-lt v5, v2, :cond_0

    .line 369
    .line 370
    if-gt v5, v1, :cond_0

    .line 371
    .line 372
    sub-int/2addr v0, v2

    .line 373
    int-to-long p0, v0

    .line 374
    const-wide/16 v0, 0x3e8

    .line 375
    .line 376
    mul-long/2addr p0, v0

    .line 377
    sub-int/2addr v3, v2

    .line 378
    mul-int/lit8 v3, v3, 0x64

    .line 379
    .line 380
    int-to-long v0, v3

    .line 381
    add-long/2addr p0, v0

    .line 382
    sub-int/2addr v4, v2

    .line 383
    mul-int/lit8 v4, v4, 0xa

    .line 384
    .line 385
    int-to-long v0, v4

    .line 386
    add-long/2addr p0, v0

    .line 387
    sub-int/2addr v5, v2

    .line 388
    int-to-long v0, v5

    .line 389
    add-long/2addr p0, v0

    .line 390
    return-wide p0

    .line 391
    :pswitch_5
    aget-byte v0, p0, p1

    .line 392
    .line 393
    add-int/lit8 v3, p1, 0x1

    .line 394
    .line 395
    aget-byte v3, p0, v3

    .line 396
    .line 397
    add-int/lit8 v4, p1, 0x2

    .line 398
    .line 399
    aget-byte v4, p0, v4

    .line 400
    .line 401
    if-lt v0, v2, :cond_0

    .line 402
    .line 403
    if-gt v0, v1, :cond_0

    .line 404
    .line 405
    if-lt v3, v2, :cond_0

    .line 406
    .line 407
    if-gt v3, v1, :cond_0

    .line 408
    .line 409
    if-lt v4, v2, :cond_0

    .line 410
    .line 411
    if-gt v4, v1, :cond_0

    .line 412
    .line 413
    sub-int/2addr v0, v2

    .line 414
    int-to-long p0, v0

    .line 415
    const-wide/16 v0, 0x64

    .line 416
    .line 417
    mul-long/2addr p0, v0

    .line 418
    sub-int/2addr v3, v2

    .line 419
    mul-int/lit8 v3, v3, 0xa

    .line 420
    .line 421
    int-to-long v0, v3

    .line 422
    add-long/2addr p0, v0

    .line 423
    sub-int/2addr v4, v2

    .line 424
    int-to-long v0, v4

    .line 425
    add-long/2addr p0, v0

    .line 426
    return-wide p0

    .line 427
    :pswitch_6
    aget-byte v0, p0, p1

    .line 428
    .line 429
    add-int/lit8 v3, p1, 0x1

    .line 430
    .line 431
    aget-byte v3, p0, v3

    .line 432
    .line 433
    if-lt v0, v2, :cond_0

    .line 434
    .line 435
    if-gt v0, v1, :cond_0

    .line 436
    .line 437
    if-lt v3, v2, :cond_0

    .line 438
    .line 439
    if-gt v3, v1, :cond_0

    .line 440
    .line 441
    sub-int/2addr v0, v2

    .line 442
    int-to-long p0, v0

    .line 443
    const-wide/16 v0, 0xa

    .line 444
    .line 445
    mul-long/2addr p0, v0

    .line 446
    sub-int/2addr v3, v2

    .line 447
    int-to-long v0, v3

    .line 448
    add-long/2addr p0, v0

    .line 449
    return-wide p0

    .line 450
    :pswitch_7
    aget-byte v0, p0, p1

    .line 451
    .line 452
    if-lt v0, v2, :cond_0

    .line 453
    .line 454
    if-gt v0, v1, :cond_0

    .line 455
    .line 456
    sub-int/2addr v0, v2

    .line 457
    int-to-long p0, v0

    .line 458
    return-wide p0

    .line 459
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/String;

    .line 460
    .line 461
    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([BII)V

    .line 462
    .line 463
    .line 464
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 465
    .line 466
    .line 467
    move-result-wide p0

    .line 468
    return-wide p0

    .line 469
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

.method public static parseLong([CII)J
    .locals 13

    const v0, 0x186a0

    const/16 v1, 0x39

    const/16 v2, 0x30

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_0

    .line 469
    :pswitch_0
    aget-char v3, p0, p1

    add-int/lit8 v4, p1, 0x1

    .line 470
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x2

    .line 471
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x3

    .line 472
    aget-char v6, p0, v6

    add-int/lit8 v7, p1, 0x4

    .line 473
    aget-char v7, p0, v7

    add-int/lit8 v8, p1, 0x5

    .line 474
    aget-char v8, p0, v8

    add-int/lit8 v9, p1, 0x6

    .line 475
    aget-char v9, p0, v9

    add-int/lit8 v10, p1, 0x7

    .line 476
    aget-char v10, p0, v10

    if-lt v3, v2, :cond_0

    if-gt v3, v1, :cond_0

    if-lt v4, v2, :cond_0

    if-gt v4, v1, :cond_0

    if-lt v5, v2, :cond_0

    if-gt v5, v1, :cond_0

    if-lt v6, v2, :cond_0

    if-gt v6, v1, :cond_0

    if-lt v7, v2, :cond_0

    if-gt v7, v1, :cond_0

    if-lt v8, v2, :cond_0

    if-gt v8, v1, :cond_0

    if-lt v9, v2, :cond_0

    if-gt v9, v1, :cond_0

    if-lt v10, v2, :cond_0

    if-gt v10, v1, :cond_0

    sub-int/2addr v3, v2

    int-to-long p0, v3

    const-wide/32 v11, 0x989680

    mul-long/2addr p0, v11

    sub-int/2addr v4, v2

    const p2, 0xf4240

    mul-int/2addr v4, p2

    int-to-long v3, v4

    add-long/2addr p0, v3

    sub-int/2addr v5, v2

    mul-int/2addr v5, v0

    int-to-long v0, v5

    add-long/2addr p0, v0

    sub-int/2addr v6, v2

    mul-int/lit16 v6, v6, 0x2710

    int-to-long v0, v6

    add-long/2addr p0, v0

    sub-int/2addr v7, v2

    mul-int/lit16 v7, v7, 0x3e8

    int-to-long v0, v7

    add-long/2addr p0, v0

    sub-int/2addr v8, v2

    mul-int/lit8 v8, v8, 0x64

    int-to-long v0, v8

    add-long/2addr p0, v0

    sub-int/2addr v9, v2

    mul-int/lit8 v9, v9, 0xa

    int-to-long v0, v9

    add-long/2addr p0, v0

    sub-int/2addr v10, v2

    int-to-long v0, v10

    add-long/2addr p0, v0

    return-wide p0

    .line 477
    :pswitch_1
    aget-char v3, p0, p1

    add-int/lit8 v4, p1, 0x1

    .line 478
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x2

    .line 479
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x3

    .line 480
    aget-char v6, p0, v6

    add-int/lit8 v7, p1, 0x4

    .line 481
    aget-char v7, p0, v7

    add-int/lit8 v8, p1, 0x5

    .line 482
    aget-char v8, p0, v8

    add-int/lit8 v9, p1, 0x6

    .line 483
    aget-char v9, p0, v9

    if-lt v3, v2, :cond_0

    if-gt v3, v1, :cond_0

    if-lt v4, v2, :cond_0

    if-gt v4, v1, :cond_0

    if-lt v5, v2, :cond_0

    if-gt v5, v1, :cond_0

    if-lt v6, v2, :cond_0

    if-gt v6, v1, :cond_0

    if-lt v7, v2, :cond_0

    if-gt v7, v1, :cond_0

    if-lt v8, v2, :cond_0

    if-gt v8, v1, :cond_0

    if-lt v9, v2, :cond_0

    if-gt v9, v1, :cond_0

    sub-int/2addr v3, v2

    int-to-long p0, v3

    const-wide/32 v10, 0xf4240

    mul-long/2addr p0, v10

    sub-int/2addr v4, v2

    mul-int/2addr v4, v0

    int-to-long v0, v4

    add-long/2addr p0, v0

    sub-int/2addr v5, v2

    mul-int/lit16 v5, v5, 0x2710

    int-to-long v0, v5

    add-long/2addr p0, v0

    sub-int/2addr v6, v2

    mul-int/lit16 v6, v6, 0x3e8

    int-to-long v0, v6

    add-long/2addr p0, v0

    sub-int/2addr v7, v2

    mul-int/lit8 v7, v7, 0x64

    int-to-long v0, v7

    add-long/2addr p0, v0

    sub-int/2addr v8, v2

    mul-int/lit8 v8, v8, 0xa

    int-to-long v0, v8

    add-long/2addr p0, v0

    sub-int/2addr v9, v2

    int-to-long v0, v9

    add-long/2addr p0, v0

    return-wide p0

    .line 484
    :pswitch_2
    aget-char v0, p0, p1

    add-int/lit8 v3, p1, 0x1

    .line 485
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x2

    .line 486
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x3

    .line 487
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x4

    .line 488
    aget-char v6, p0, v6

    add-int/lit8 v7, p1, 0x5

    .line 489
    aget-char v7, p0, v7

    if-lt v0, v2, :cond_0

    if-gt v0, v1, :cond_0

    if-lt v3, v2, :cond_0

    if-gt v3, v1, :cond_0

    if-lt v4, v2, :cond_0

    if-gt v4, v1, :cond_0

    if-lt v5, v2, :cond_0

    if-gt v5, v1, :cond_0

    if-lt v6, v2, :cond_0

    if-gt v6, v1, :cond_0

    if-lt v7, v2, :cond_0

    if-gt v7, v1, :cond_0

    sub-int/2addr v0, v2

    int-to-long p0, v0

    const-wide/32 v0, 0x186a0

    mul-long/2addr p0, v0

    sub-int/2addr v3, v2

    mul-int/lit16 v3, v3, 0x2710

    int-to-long v0, v3

    add-long/2addr p0, v0

    sub-int/2addr v4, v2

    mul-int/lit16 v4, v4, 0x3e8

    int-to-long v0, v4

    add-long/2addr p0, v0

    sub-int/2addr v5, v2

    mul-int/lit8 v5, v5, 0x64

    int-to-long v0, v5

    add-long/2addr p0, v0

    sub-int/2addr v6, v2

    mul-int/lit8 v6, v6, 0xa

    int-to-long v0, v6

    add-long/2addr p0, v0

    sub-int/2addr v7, v2

    int-to-long v0, v7

    add-long/2addr p0, v0

    return-wide p0

    .line 490
    :pswitch_3
    aget-char v0, p0, p1

    add-int/lit8 v3, p1, 0x1

    .line 491
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x2

    .line 492
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x3

    .line 493
    aget-char v5, p0, v5

    add-int/lit8 v6, p1, 0x4

    .line 494
    aget-char v6, p0, v6

    if-lt v0, v2, :cond_0

    if-gt v0, v1, :cond_0

    if-lt v3, v2, :cond_0

    if-gt v3, v1, :cond_0

    if-lt v4, v2, :cond_0

    if-gt v4, v1, :cond_0

    if-lt v5, v2, :cond_0

    if-gt v5, v1, :cond_0

    if-lt v6, v2, :cond_0

    if-gt v6, v1, :cond_0

    sub-int/2addr v0, v2

    int-to-long p0, v0

    const-wide/16 v0, 0x2710

    mul-long/2addr p0, v0

    sub-int/2addr v3, v2

    mul-int/lit16 v3, v3, 0x3e8

    int-to-long v0, v3

    add-long/2addr p0, v0

    sub-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x64

    int-to-long v0, v4

    add-long/2addr p0, v0

    sub-int/2addr v5, v2

    mul-int/lit8 v5, v5, 0xa

    int-to-long v0, v5

    add-long/2addr p0, v0

    sub-int/2addr v6, v2

    int-to-long v0, v6

    add-long/2addr p0, v0

    return-wide p0

    .line 495
    :pswitch_4
    aget-char v0, p0, p1

    add-int/lit8 v3, p1, 0x1

    .line 496
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x2

    .line 497
    aget-char v4, p0, v4

    add-int/lit8 v5, p1, 0x3

    .line 498
    aget-char v5, p0, v5

    if-lt v0, v2, :cond_0

    if-gt v0, v1, :cond_0

    if-lt v3, v2, :cond_0

    if-gt v3, v1, :cond_0

    if-lt v4, v2, :cond_0

    if-gt v4, v1, :cond_0

    if-lt v5, v2, :cond_0

    if-gt v5, v1, :cond_0

    sub-int/2addr v0, v2

    int-to-long p0, v0

    const-wide/16 v0, 0x3e8

    mul-long/2addr p0, v0

    sub-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x64

    int-to-long v0, v3

    add-long/2addr p0, v0

    sub-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xa

    int-to-long v0, v4

    add-long/2addr p0, v0

    sub-int/2addr v5, v2

    int-to-long v0, v5

    add-long/2addr p0, v0

    return-wide p0

    .line 499
    :pswitch_5
    aget-char v0, p0, p1

    add-int/lit8 v3, p1, 0x1

    .line 500
    aget-char v3, p0, v3

    add-int/lit8 v4, p1, 0x2

    .line 501
    aget-char v4, p0, v4

    if-lt v0, v2, :cond_0

    if-gt v0, v1, :cond_0

    if-lt v3, v2, :cond_0

    if-gt v3, v1, :cond_0

    if-lt v4, v2, :cond_0

    if-gt v4, v1, :cond_0

    sub-int/2addr v0, v2

    int-to-long p0, v0

    const-wide/16 v0, 0x64

    mul-long/2addr p0, v0

    sub-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xa

    int-to-long v0, v3

    add-long/2addr p0, v0

    sub-int/2addr v4, v2

    int-to-long v0, v4

    add-long/2addr p0, v0

    return-wide p0

    .line 502
    :pswitch_6
    aget-char v0, p0, p1

    add-int/lit8 v3, p1, 0x1

    .line 503
    aget-char v3, p0, v3

    if-lt v0, v2, :cond_0

    if-gt v0, v1, :cond_0

    if-lt v3, v2, :cond_0

    if-gt v3, v1, :cond_0

    sub-int/2addr v0, v2

    int-to-long p0, v0

    const-wide/16 v0, 0xa

    mul-long/2addr p0, v0

    sub-int/2addr v3, v2

    int-to-long v0, v3

    add-long/2addr p0, v0

    return-wide p0

    .line 504
    :pswitch_7
    aget-char v0, p0, p1

    if-lt v0, v2, :cond_0

    if-gt v0, v1, :cond_0

    sub-int/2addr v0, v2

    int-to-long p0, v0

    return-wide p0

    .line 505
    :cond_0
    :goto_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p0, p1, p2}, Ljava/lang/String;-><init>([CII)V

    .line 506
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    return-wide p0

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

.method private static power10(I)Ljava/math/BigInteger;
    .locals 5

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/util/TypeUtils;->BIG_TEN_POWERS_TABLE_0:[Ljava/math/BigInteger;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ge p0, v1, :cond_0

    .line 5
    .line 6
    aget-object p0, v0, p0

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/util/TypeUtils;->BIG_TEN_POWERS_TABLE_1:[Ljava/math/BigInteger;

    .line 10
    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    const/16 v1, 0x80

    .line 14
    .line 15
    new-array v2, v1, [Ljava/math/BigInteger;

    .line 16
    .line 17
    const/16 v3, 0x12

    .line 18
    .line 19
    aget-object v0, v0, v3

    .line 20
    .line 21
    const/16 v3, 0x13

    .line 22
    .line 23
    :goto_0
    if-ge v3, v1, :cond_1

    .line 24
    .line 25
    sget-object v4, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    .line 26
    .line 27
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    aput-object v0, v2, v3

    .line 32
    .line 33
    add-int/lit8 v3, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    sput-object v2, Lcom/alibaba/fastjson2/util/TypeUtils;->BIG_TEN_POWERS_TABLE_1:[Ljava/math/BigInteger;

    .line 37
    .line 38
    move-object v1, v2

    .line 39
    :cond_2
    aget-object p0, v1, p0

    .line 40
    .line 41
    return-object p0
.end method

.method public static toAsciiCharArray([B)[C
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p0

    .line 6
    if-ge v1, v2, :cond_0

    .line 7
    .line 8
    aget-byte v2, p0, v1

    .line 9
    .line 10
    int-to-char v2, v2

    .line 11
    aput-char v2, v0, v1

    .line 12
    .line 13
    add-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-object v0
.end method

.method public static toBigDecimal(D)Ljava/math/BigDecimal;
    .locals 3

    const/16 v0, 0x18

    .line 83
    new-array v0, v0, [B

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 84
    invoke-static {p0, p1, v0, v2, v1}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(D[BIZ)I

    move-result p0

    .line 85
    invoke-static {v0, v2, p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseBigDecimal([BII)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static toBigDecimal(F)Ljava/math/BigDecimal;
    .locals 3

    const/16 v0, 0xf

    .line 80
    new-array v0, v0, [B

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 81
    invoke-static {p0, v0, v2, v1}, Lcom/alibaba/fastjson2/util/DoubleToDecimal;->toString(F[BIZ)I

    move-result p0

    .line 82
    invoke-static {v0, v2, p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseBigDecimal([BII)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static toBigDecimal(J)Ljava/math/BigDecimal;
    .locals 0

    .line 79
    invoke-static {p0, p1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;
    .locals 2

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    instance-of v0, p0, Ljava/math/BigDecimal;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Byte;

    .line 9
    .line 10
    if-nez v0, :cond_5

    .line 11
    .line 12
    instance-of v0, p0, Ljava/lang/Short;

    .line 13
    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    instance-of v0, p0, Ljava/lang/Integer;

    .line 17
    .line 18
    if-nez v0, :cond_5

    .line 19
    .line 20
    instance-of v0, p0, Ljava/lang/Long;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    check-cast p0, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    const-string v0, "null"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    new-instance v0, Ljava/math/BigDecimal;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_4
    const-class v0, Ljava/math/BigDecimal;

    .line 55
    .line 56
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 57
    .line 58
    invoke-static {p0, v0, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, Ljava/math/BigDecimal;

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_5
    :goto_1
    check-cast p0, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v0

    .line 71
    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_6
    :goto_2
    check-cast p0, Ljava/math/BigDecimal;

    .line 77
    .line 78
    return-object p0
.end method

.method public static toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;
    .locals 2

    if-eqz p0, :cond_1

    .line 86
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "null"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    const/4 v0, 0x0

    .line 88
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseBigDecimal([CII)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static toBigDecimal([B)Ljava/math/BigDecimal;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 90
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseBigDecimal([BII)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static toBigDecimal([C)Ljava/math/BigDecimal;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 89
    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->parseBigDecimal([CII)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method

.method public static toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;
    .locals 2

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    instance-of v0, p0, Ljava/math/BigInteger;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Byte;

    .line 9
    .line 10
    if-nez v0, :cond_5

    .line 11
    .line 12
    instance-of v0, p0, Ljava/lang/Short;

    .line 13
    .line 14
    if-nez v0, :cond_5

    .line 15
    .line 16
    instance-of v0, p0, Ljava/lang/Integer;

    .line 17
    .line 18
    if-nez v0, :cond_5

    .line 19
    .line 20
    instance-of v0, p0, Ljava/lang/Long;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v0, :cond_4

    .line 28
    .line 29
    check-cast p0, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    const-string v0, "null"

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    new-instance v0, Ljava/math/BigInteger;

    .line 47
    .line 48
    invoke-direct {v0, p0}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_4
    const-string p0, "can not cast to bigint"

    .line 55
    .line 56
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_5
    :goto_1
    check-cast p0, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_6
    :goto_2
    check-cast p0, Ljava/math/BigInteger;

    .line 73
    .line 74
    return-object p0
.end method

.method public static toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v1, p0, Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    check-cast p0, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    const-string v1, "null"

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_3
    :goto_0
    return-object v0

    .line 43
    :cond_4
    instance-of v0, p0, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v0, :cond_6

    .line 46
    .line 47
    check-cast p0, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const/4 v0, 0x1

    .line 54
    if-ne p0, v0, :cond_5

    .line 55
    .line 56
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_5
    if-nez p0, :cond_6

    .line 60
    .line 61
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_6
    const-string p0, "can not cast to boolean"

    .line 65
    .line 66
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 p0, 0x0

    .line 70
    return-object p0
.end method

.method public static toBooleanValue(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v1, :cond_4

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    const-string v1, "null"

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    return p0

    .line 42
    :cond_3
    :goto_0
    return v0

    .line 43
    :cond_4
    instance-of v1, p0, Ljava/lang/Number;

    .line 44
    .line 45
    if-eqz v1, :cond_6

    .line 46
    .line 47
    check-cast p0, Ljava/lang/Number;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const/4 v1, 0x1

    .line 54
    if-ne p0, v1, :cond_5

    .line 55
    .line 56
    return v1

    .line 57
    :cond_5
    if-nez p0, :cond_6

    .line 58
    .line 59
    return v0

    .line 60
    :cond_6
    const-string p0, "can not cast to boolean"

    .line 61
    .line 62
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const/4 p0, 0x0

    .line 66
    return p0
.end method

.method public static toByte(Ljava/lang/Object;)Ljava/lang/Byte;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Byte;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    check-cast p0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    const-string v0, "null"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_4
    const-string p0, "can not cast to byte"

    .line 56
    .line 57
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0

    .line 62
    :cond_5
    :goto_1
    check-cast p0, Ljava/lang/Byte;

    .line 63
    .line 64
    return-object p0
.end method

.method public static toByteValue(Ljava/lang/Object;)B
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Byte;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Byte;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Byte;->byteValue()B

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->byteValue()B

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v1, p0, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    const-string v1, "null"

    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {p0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_4
    :goto_0
    return v0

    .line 54
    :cond_5
    const-string p0, "can not cast to byte"

    .line 55
    .line 56
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method public static toDate(Ljava/lang/Object;)Ljava/util/Date;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/util/Date;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/util/Date;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v1, p0, Ljava/time/Instant;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast p0, Ljava/time/Instant;

    .line 17
    .line 18
    new-instance v0, Ljava/util/Date;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 21
    .line 22
    .line 23
    move-result-wide v1

    .line 24
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    instance-of v1, p0, Ljava/time/ZonedDateTime;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    check-cast p0, Ljava/time/ZonedDateTime;

    .line 33
    .line 34
    new-instance v0, Ljava/util/Date;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 41
    .line 42
    .line 43
    move-result-wide v1

    .line 44
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    instance-of v1, p0, Ljava/time/LocalDate;

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    check-cast p0, Ljava/time/LocalDate;

    .line 53
    .line 54
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/time/LocalDate;->atStartOfDay(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v0, Ljava/util/Date;

    .line 61
    .line 62
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 67
    .line 68
    .line 69
    move-result-wide v1

    .line 70
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    instance-of v1, p0, Ljava/time/LocalDateTime;

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    check-cast p0, Ljava/time/LocalDateTime;

    .line 79
    .line 80
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 81
    .line 82
    invoke-static {p0, v0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    new-instance v0, Ljava/util/Date;

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 93
    .line 94
    .line 95
    move-result-wide v1

    .line 96
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 97
    .line 98
    .line 99
    return-object v0

    .line 100
    :cond_5
    instance-of v1, p0, Ljava/lang/String;

    .line 101
    .line 102
    if-eqz v1, :cond_7

    .line 103
    .line 104
    check-cast p0, Ljava/lang/String;

    .line 105
    .line 106
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 107
    .line 108
    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 109
    .line 110
    .line 111
    move-result-wide v1

    .line 112
    const-wide/16 v3, 0x0

    .line 113
    .line 114
    cmp-long p0, v1, v3

    .line 115
    .line 116
    if-nez p0, :cond_6

    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_6
    new-instance p0, Ljava/util/Date;

    .line 120
    .line 121
    invoke-direct {p0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 122
    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_7
    instance-of v0, p0, Ljava/lang/Long;

    .line 126
    .line 127
    if-nez v0, :cond_9

    .line 128
    .line 129
    instance-of v0, p0, Ljava/lang/Integer;

    .line 130
    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_8
    const-string v0, "can not cast to Date from "

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0, v0}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/4 p0, 0x0

    .line 144
    return-object p0

    .line 145
    :cond_9
    :goto_0
    new-instance v0, Ljava/util/Date;

    .line 146
    .line 147
    check-cast p0, Ljava/lang/Number;

    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide v1

    .line 153
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 154
    .line 155
    .line 156
    return-object v0
.end method

.method public static toDouble(Ljava/lang/Object;)Ljava/lang/Double;
    .locals 2

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Double;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    check-cast p0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    const-string v0, "null"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_4
    const-string p0, "can not cast to decimal"

    .line 56
    .line 57
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0

    .line 62
    :cond_5
    :goto_1
    check-cast p0, Ljava/lang/Double;

    .line 63
    .line 64
    return-object p0
.end method

.method public static toDoubleValue(Ljava/lang/Object;)D
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    instance-of v2, p0, Ljava/lang/Double;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    check-cast p0, Ljava/lang/Double;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_1
    instance-of v2, p0, Ljava/lang/Number;

    .line 18
    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    check-cast p0, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0

    .line 28
    :cond_2
    instance-of v2, p0, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v2, :cond_5

    .line 31
    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_4

    .line 39
    .line 40
    const-string v2, "null"

    .line 41
    .line 42
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    :cond_4
    :goto_0
    return-wide v0

    .line 54
    :cond_5
    const-string p0, "can not cast to decimal"

    .line 55
    .line 56
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const-wide/16 v0, 0x0

    .line 60
    .line 61
    return-wide v0
.end method

.method public static toFloat(Ljava/lang/Object;)Ljava/lang/Float;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Float;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    check-cast p0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    const-string v0, "null"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_4
    const-string p0, "can not cast to decimal"

    .line 56
    .line 57
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0

    .line 62
    :cond_5
    :goto_1
    check-cast p0, Ljava/lang/Float;

    .line 63
    .line 64
    return-object p0
.end method

.method public static toFloatValue(Ljava/lang/Object;)F
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Float;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Float;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v1, p0, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v1, :cond_5

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    const-string v1, "null"

    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :cond_4
    :goto_0
    return v0

    .line 54
    :cond_5
    const-string p0, "can not cast to decimal"

    .line 55
    .line 56
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return p0
.end method

.method public static toInstant(Ljava/lang/Object;)Ljava/time/Instant;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/time/Instant;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/time/Instant;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v1, p0, Ljava/util/Date;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    check-cast p0, Ljava/util/Date;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_2
    instance-of v1, p0, Ljava/time/ZonedDateTime;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    check-cast p0, Ljava/time/ZonedDateTime;

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_3
    instance-of v1, p0, Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v1, :cond_7

    .line 37
    .line 38
    check-cast p0, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_6

    .line 45
    .line 46
    const-string v1, "null"

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_4
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/16 v1, 0x22

    .line 61
    .line 62
    if-eq v0, v1, :cond_5

    .line 63
    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v2, "\""

    .line 67
    .line 68
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    goto :goto_0

    .line 86
    :cond_5
    invoke-static {p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    :goto_0
    const-class v0, Ljava/time/Instant;

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, Ljava/time/Instant;

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_6
    :goto_1
    return-object v0

    .line 100
    :cond_7
    instance-of v0, p0, Ljava/util/Map;

    .line 101
    .line 102
    if-eqz v0, :cond_8

    .line 103
    .line 104
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInstant;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplInstant;

    .line 105
    .line 106
    check-cast p0, Ljava/util/Map;

    .line 107
    .line 108
    const-wide/16 v1, 0x0

    .line 109
    .line 110
    invoke-virtual {v0, p0, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplInstant;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Ljava/time/Instant;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_8
    const-string v0, "can not cast to Date from "

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0, v0}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const/4 p0, 0x0

    .line 127
    return-object p0
.end method

.method public static toIntValue(Ljava/lang/Object;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v1, p0, Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v1, :cond_7

    .line 30
    .line 31
    check-cast p0, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_6

    .line 38
    .line 39
    const-string v1, "null"

    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    const/16 v0, 0x2c

    .line 49
    .line 50
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    add-int/lit8 v1, v1, -0x4

    .line 59
    .line 60
    if-ne v0, v1, :cond_4

    .line 61
    .line 62
    const/16 v0, 0x2e

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v1, -0x1

    .line 69
    if-ne v0, v1, :cond_4

    .line 70
    .line 71
    invoke-static {}, Ljava/text/NumberFormat;->getNumberInstance()Ljava/text/NumberFormat;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0, p0}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    return p0

    .line 84
    :catch_0
    :cond_4
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    return p0

    .line 95
    :cond_5
    const-string v0, "parseInt error, "

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    return p0

    .line 106
    :cond_6
    :goto_0
    return v0

    .line 107
    :cond_7
    const-string p0, "can not cast to int"

    .line 108
    .line 109
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 p0, 0x0

    .line 113
    return p0
.end method

.method public static toInteger(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 2

    .line 1
    if-eqz p0, :cond_7

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Integer;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    check-cast p0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    const-string v0, "null"

    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_3
    :goto_0
    return-object v1

    .line 55
    :cond_4
    instance-of v0, p0, Ljava/util/Map;

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    move-object v0, p0

    .line 60
    check-cast v0, Ljava/util/Map;

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_5
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    check-cast p0, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_6
    const-string p0, "can not cast to integer"

    .line 85
    .line 86
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    return-object p0

    .line 91
    :cond_7
    :goto_1
    check-cast p0, Ljava/lang/Integer;

    .line 92
    .line 93
    return-object p0
.end method

.method public static toList(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    instance-of v0, p0, Ljava/util/List;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/util/List;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_1
    instance-of v0, p0, Ljava/lang/Iterable;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    check-cast p0, Ljava/lang/Iterable;

    .line 22
    .line 23
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-object v0

    .line 42
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "Can not cast \'"

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v1, "\' to List"

    .line 50
    .line 51
    invoke-static {p0, v1, v0}, Lbc/e;->h(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method

.method public static toLong(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Long;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string v1, "null"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return-object p0

    .line 31
    :cond_2
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toLongValue(Ljava/lang/Object;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_3
    :goto_0
    check-cast p0, Ljava/lang/Long;

    .line 41
    .line 42
    return-object p0
.end method

.method public static toLongValue(Ljava/lang/Object;)J
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_0
    instance-of v2, p0, Ljava/lang/Long;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    check-cast p0, Ljava/lang/Long;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0

    .line 17
    :cond_1
    instance-of v2, p0, Ljava/lang/Number;

    .line 18
    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    check-cast p0, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    return-wide v0

    .line 28
    :cond_2
    instance-of v2, p0, Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v2, :cond_7

    .line 31
    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_6

    .line 39
    .line 40
    const-string v2, "null"

    .line 41
    .line 42
    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const/16 v0, 0x2c

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    add-int/lit8 v1, v1, -0x4

    .line 60
    .line 61
    if-ne v0, v1, :cond_4

    .line 62
    .line 63
    const/16 v0, 0x2e

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v1, -0x1

    .line 70
    if-ne v0, v1, :cond_4

    .line 71
    .line 72
    invoke-static {}, Ljava/text/NumberFormat;->getNumberInstance()Ljava/text/NumberFormat;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, p0}, Ljava/text/NumberFormat;->parse(Ljava/lang/String;)Ljava/lang/Number;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 81
    .line 82
    .line 83
    move-result-wide v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    return-wide v0

    .line 85
    :catch_0
    :cond_4
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    return-wide v0

    .line 96
    :cond_5
    const-string v0, "parseLong error "

    .line 97
    .line 98
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-wide/16 v0, 0x0

    .line 106
    .line 107
    :cond_6
    :goto_0
    return-wide v0

    .line 108
    :cond_7
    const-string v0, "can not cast to long from "

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0, v0}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    const-wide/16 v0, 0x0

    .line 118
    .line 119
    return-wide v0
.end method

.method public static toShort(Ljava/lang/Object;)Ljava/lang/Short;
    .locals 1

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Short;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    instance-of v0, p0, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    check-cast p0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    const-string v0, "null"

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    invoke-static {p0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_4
    const-string p0, "can not cast to byte"

    .line 56
    .line 57
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0

    .line 62
    :cond_5
    :goto_1
    check-cast p0, Ljava/lang/Short;

    .line 63
    .line 64
    return-object p0
.end method

.method public static toShortValue(Ljava/lang/Object;)S
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/Short;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p0, Ljava/lang/Short;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Short;->shortValue()S

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    instance-of v1, p0, Ljava/lang/Number;

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    check-cast p0, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Number;->shortValue()S

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    int-to-byte p0, p0

    .line 27
    int-to-short p0, p0

    .line 28
    return p0

    .line 29
    :cond_2
    instance-of v1, p0, Ljava/lang/String;

    .line 30
    .line 31
    if-eqz v1, :cond_5

    .line 32
    .line 33
    check-cast p0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    const-string v1, "null"

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    invoke-static {p0}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_4
    :goto_0
    return v0

    .line 56
    :cond_5
    const-string p0, "can not cast to byte"

    .line 57
    .line 58
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return p0
.end method

.method public static toStringArray(Ljava/lang/Object;)[Ljava/lang/String;
    .locals 5

    .line 1
    if-eqz p0, :cond_9

    .line 2
    .line 3
    instance-of v0, p0, [Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_6

    .line 8
    :cond_0
    instance-of v0, p0, Ljava/util/Collection;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    check-cast p0, Ljava/util/Collection;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-array v0, v0, [Ljava/lang/String;

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    add-int/lit8 v3, v1, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    instance-of v4, v2, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 50
    .line 51
    :goto_2
    aput-object v2, v0, v1

    .line 52
    .line 53
    move v1, v3

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return-object v0

    .line 56
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_8

    .line 65
    .line 66
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    new-array v2, v0, [Ljava/lang/String;

    .line 71
    .line 72
    :goto_3
    if-ge v1, v0, :cond_7

    .line 73
    .line 74
    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-eqz v3, :cond_6

    .line 79
    .line 80
    instance-of v4, v3, Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v4, :cond_5

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    goto :goto_5

    .line 90
    :cond_6
    :goto_4
    check-cast v3, Ljava/lang/String;

    .line 91
    .line 92
    :goto_5
    aput-object v3, v2, v1

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_7
    return-object v2

    .line 98
    :cond_8
    const-class v0, [Ljava/lang/String;

    .line 99
    .line 100
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 101
    .line 102
    invoke-static {p0, v0, v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->cast(Ljava/lang/Object;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, [Ljava/lang/String;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_9
    :goto_6
    check-cast p0, [Ljava/lang/String;

    .line 110
    .line 111
    return-object p0
.end method

.method public static validateIPv4(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    .line 159
    invoke-static {p0, v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->validateIPv4(Ljava/lang/String;I)Z

    move-result p0

    return p0
.end method

.method public static validateIPv4(Ljava/lang/String;I)Z
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int v2, v1, p1

    .line 10
    .line 11
    const/4 v3, 0x7

    .line 12
    if-lt v2, v3, :cond_11

    .line 13
    .line 14
    const/16 v3, 0x19

    .line 15
    .line 16
    if-le v2, v3, :cond_1

    .line 17
    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_1
    move v2, p1

    .line 21
    move v3, v0

    .line 22
    :goto_0
    const/4 v4, 0x3

    .line 23
    const/4 v5, 0x1

    .line 24
    if-ge p1, v1, :cond_10

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    const/16 v7, 0x2e

    .line 31
    .line 32
    if-eq v6, v7, :cond_2

    .line 33
    .line 34
    add-int/lit8 v8, v1, -0x1

    .line 35
    .line 36
    if-ne p1, v8, :cond_e

    .line 37
    .line 38
    :cond_2
    if-ne v6, v7, :cond_3

    .line 39
    .line 40
    move v8, p1

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    add-int/lit8 v8, p1, 0x1

    .line 43
    .line 44
    :goto_1
    sub-int v9, v8, v2

    .line 45
    .line 46
    const/16 v10, 0x39

    .line 47
    .line 48
    const/16 v11, 0x30

    .line 49
    .line 50
    if-eq v9, v5, :cond_c

    .line 51
    .line 52
    const/4 v5, 0x2

    .line 53
    if-eq v9, v5, :cond_9

    .line 54
    .line 55
    if-eq v9, v4, :cond_4

    .line 56
    .line 57
    return v0

    .line 58
    :cond_4
    add-int/lit8 v4, v8, -0x3

    .line 59
    .line 60
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    add-int/lit8 v5, v8, -0x2

    .line 65
    .line 66
    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    add-int/lit8 v8, v8, -0x1

    .line 71
    .line 72
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-lt v4, v11, :cond_8

    .line 77
    .line 78
    const/16 v9, 0x32

    .line 79
    .line 80
    if-le v4, v9, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    if-lt v5, v11, :cond_8

    .line 84
    .line 85
    if-le v5, v10, :cond_6

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    if-lt v8, v11, :cond_8

    .line 89
    .line 90
    if-le v8, v10, :cond_7

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_7
    add-int/lit8 v4, v4, -0x30

    .line 94
    .line 95
    mul-int/lit8 v4, v4, 0x64

    .line 96
    .line 97
    const/16 v9, 0xa

    .line 98
    .line 99
    invoke-static {v5, v11, v9, v4}, Lp/a;->z(IIII)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    add-int/lit8 v8, v8, -0x30

    .line 104
    .line 105
    add-int/2addr v8, v4

    .line 106
    const/16 v4, 0xff

    .line 107
    .line 108
    if-le v8, v4, :cond_d

    .line 109
    .line 110
    :cond_8
    :goto_2
    return v0

    .line 111
    :cond_9
    add-int/lit8 v4, v8, -0x2

    .line 112
    .line 113
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    add-int/lit8 v8, v8, -0x1

    .line 118
    .line 119
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-lt v4, v11, :cond_b

    .line 124
    .line 125
    if-le v4, v10, :cond_a

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_a
    if-lt v5, v11, :cond_b

    .line 129
    .line 130
    if-le v5, v10, :cond_d

    .line 131
    .line 132
    :cond_b
    :goto_3
    return v0

    .line 133
    :cond_c
    add-int/lit8 v8, v8, -0x1

    .line 134
    .line 135
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-lt v4, v11, :cond_f

    .line 140
    .line 141
    if-le v4, v10, :cond_d

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_d
    if-ne v6, v7, :cond_e

    .line 145
    .line 146
    add-int/lit8 v3, v3, 0x1

    .line 147
    .line 148
    add-int/lit8 v2, p1, 0x1

    .line 149
    .line 150
    :cond_e
    add-int/lit8 p1, p1, 0x1

    .line 151
    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_f
    :goto_4
    return v0

    .line 155
    :cond_10
    if-ne v3, v4, :cond_11

    .line 156
    .line 157
    return v5

    .line 158
    :cond_11
    :goto_5
    return v0
.end method

.method public static validateIPv6(Ljava/lang/String;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x2

    .line 12
    if-lt v2, v3, :cond_1

    .line 13
    .line 14
    const/16 v4, 0x27

    .line 15
    .line 16
    if-le v2, v4, :cond_2

    .line 17
    .line 18
    :cond_1
    move/from16 v16, v1

    .line 19
    .line 20
    goto/16 :goto_a

    .line 21
    .line 22
    :cond_2
    move v4, v1

    .line 23
    move v5, v4

    .line 24
    move v6, v5

    .line 25
    :goto_0
    const/4 v7, 0x1

    .line 26
    if-ge v4, v2, :cond_3

    .line 27
    .line 28
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    const/16 v9, 0x2e

    .line 33
    .line 34
    if-ne v8, v9, :cond_4

    .line 35
    .line 36
    invoke-static {v0, v5}, Lcom/alibaba/fastjson2/util/TypeUtils;->validateIPv4(Ljava/lang/String;I)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    return v1

    .line 43
    :cond_3
    move/from16 v16, v1

    .line 44
    .line 45
    goto/16 :goto_9

    .line 46
    .line 47
    :cond_4
    const/16 v9, 0x3a

    .line 48
    .line 49
    if-eq v8, v9, :cond_6

    .line 50
    .line 51
    add-int/lit8 v10, v2, -0x1

    .line 52
    .line 53
    if-ne v4, v10, :cond_5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_5
    move/from16 v16, v1

    .line 57
    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_6
    :goto_1
    if-ne v8, v9, :cond_7

    .line 61
    .line 62
    move v10, v4

    .line 63
    goto :goto_2

    .line 64
    :cond_7
    add-int/lit8 v10, v4, 0x1

    .line 65
    .line 66
    :goto_2
    sub-int v11, v10, v5

    .line 67
    .line 68
    if-eqz v11, :cond_2b

    .line 69
    .line 70
    const/16 v12, 0x66

    .line 71
    .line 72
    const/16 v13, 0x61

    .line 73
    .line 74
    const/16 v14, 0x46

    .line 75
    .line 76
    const/16 v15, 0x41

    .line 77
    .line 78
    move/from16 v16, v1

    .line 79
    .line 80
    const/16 v1, 0x39

    .line 81
    .line 82
    const/16 v9, 0x30

    .line 83
    .line 84
    if-eq v11, v7, :cond_27

    .line 85
    .line 86
    if-eq v11, v3, :cond_20

    .line 87
    .line 88
    const/4 v7, 0x3

    .line 89
    if-eq v11, v7, :cond_16

    .line 90
    .line 91
    const/4 v7, 0x4

    .line 92
    if-eq v11, v7, :cond_8

    .line 93
    .line 94
    return v16

    .line 95
    :cond_8
    add-int/lit8 v7, v10, -0x4

    .line 96
    .line 97
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    add-int/lit8 v11, v10, -0x3

    .line 102
    .line 103
    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    add-int/lit8 v3, v10, -0x2

    .line 108
    .line 109
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    add-int/lit8 v10, v10, -0x1

    .line 114
    .line 115
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    if-lt v7, v9, :cond_9

    .line 120
    .line 121
    if-le v7, v1, :cond_b

    .line 122
    .line 123
    :cond_9
    if-lt v7, v15, :cond_a

    .line 124
    .line 125
    if-le v7, v14, :cond_b

    .line 126
    .line 127
    :cond_a
    if-lt v7, v13, :cond_15

    .line 128
    .line 129
    if-le v7, v12, :cond_b

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_b
    if-lt v11, v9, :cond_c

    .line 133
    .line 134
    if-le v11, v1, :cond_e

    .line 135
    .line 136
    :cond_c
    if-lt v11, v15, :cond_d

    .line 137
    .line 138
    if-le v11, v14, :cond_e

    .line 139
    .line 140
    :cond_d
    if-lt v11, v13, :cond_15

    .line 141
    .line 142
    if-le v11, v12, :cond_e

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_e
    if-lt v3, v9, :cond_f

    .line 146
    .line 147
    if-le v3, v1, :cond_11

    .line 148
    .line 149
    :cond_f
    if-lt v3, v15, :cond_10

    .line 150
    .line 151
    if-le v3, v14, :cond_11

    .line 152
    .line 153
    :cond_10
    if-lt v3, v13, :cond_15

    .line 154
    .line 155
    if-le v3, v12, :cond_11

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_11
    if-lt v10, v9, :cond_13

    .line 159
    .line 160
    if-le v10, v1, :cond_12

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_12
    const/16 v1, 0x3a

    .line 164
    .line 165
    goto/16 :goto_7

    .line 166
    .line 167
    :cond_13
    :goto_3
    if-lt v10, v15, :cond_14

    .line 168
    .line 169
    if-le v10, v14, :cond_12

    .line 170
    .line 171
    :cond_14
    if-lt v10, v13, :cond_15

    .line 172
    .line 173
    if-le v10, v12, :cond_12

    .line 174
    .line 175
    :cond_15
    :goto_4
    return v16

    .line 176
    :cond_16
    add-int/lit8 v3, v10, -0x3

    .line 177
    .line 178
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    add-int/lit8 v7, v10, -0x2

    .line 183
    .line 184
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    add-int/lit8 v10, v10, -0x1

    .line 189
    .line 190
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 191
    .line 192
    .line 193
    move-result v10

    .line 194
    if-lt v3, v9, :cond_17

    .line 195
    .line 196
    if-le v3, v1, :cond_19

    .line 197
    .line 198
    :cond_17
    if-lt v3, v15, :cond_18

    .line 199
    .line 200
    if-le v3, v14, :cond_19

    .line 201
    .line 202
    :cond_18
    if-lt v3, v13, :cond_1f

    .line 203
    .line 204
    if-le v3, v12, :cond_19

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_19
    if-lt v7, v9, :cond_1a

    .line 208
    .line 209
    if-le v7, v1, :cond_1c

    .line 210
    .line 211
    :cond_1a
    if-lt v7, v15, :cond_1b

    .line 212
    .line 213
    if-le v7, v14, :cond_1c

    .line 214
    .line 215
    :cond_1b
    if-lt v7, v13, :cond_1f

    .line 216
    .line 217
    if-le v7, v12, :cond_1c

    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_1c
    if-lt v10, v9, :cond_1d

    .line 221
    .line 222
    if-le v10, v1, :cond_12

    .line 223
    .line 224
    :cond_1d
    if-lt v10, v15, :cond_1e

    .line 225
    .line 226
    if-le v10, v14, :cond_12

    .line 227
    .line 228
    :cond_1e
    if-lt v10, v13, :cond_1f

    .line 229
    .line 230
    if-le v10, v12, :cond_12

    .line 231
    .line 232
    :cond_1f
    :goto_5
    return v16

    .line 233
    :cond_20
    add-int/lit8 v3, v10, -0x2

    .line 234
    .line 235
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    add-int/lit8 v10, v10, -0x1

    .line 240
    .line 241
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    if-lt v3, v9, :cond_21

    .line 246
    .line 247
    if-le v3, v1, :cond_23

    .line 248
    .line 249
    :cond_21
    if-lt v3, v15, :cond_22

    .line 250
    .line 251
    if-le v3, v14, :cond_23

    .line 252
    .line 253
    :cond_22
    if-lt v3, v13, :cond_26

    .line 254
    .line 255
    if-le v3, v12, :cond_23

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_23
    if-lt v7, v9, :cond_24

    .line 259
    .line 260
    if-le v7, v1, :cond_12

    .line 261
    .line 262
    :cond_24
    if-lt v7, v15, :cond_25

    .line 263
    .line 264
    if-le v7, v14, :cond_12

    .line 265
    .line 266
    :cond_25
    if-lt v7, v13, :cond_26

    .line 267
    .line 268
    if-le v7, v12, :cond_12

    .line 269
    .line 270
    :cond_26
    :goto_6
    return v16

    .line 271
    :cond_27
    add-int/lit8 v10, v10, -0x1

    .line 272
    .line 273
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    if-lt v3, v9, :cond_28

    .line 278
    .line 279
    if-le v3, v1, :cond_12

    .line 280
    .line 281
    :cond_28
    if-lt v3, v15, :cond_29

    .line 282
    .line 283
    if-le v3, v14, :cond_12

    .line 284
    .line 285
    :cond_29
    if-lt v3, v13, :cond_2a

    .line 286
    .line 287
    if-le v3, v12, :cond_12

    .line 288
    .line 289
    :cond_2a
    return v16

    .line 290
    :cond_2b
    move/from16 v16, v1

    .line 291
    .line 292
    move v1, v9

    .line 293
    :goto_7
    if-ne v8, v1, :cond_2c

    .line 294
    .line 295
    add-int/lit8 v6, v6, 0x1

    .line 296
    .line 297
    add-int/lit8 v5, v4, 0x1

    .line 298
    .line 299
    :cond_2c
    :goto_8
    add-int/lit8 v4, v4, 0x1

    .line 300
    .line 301
    move/from16 v1, v16

    .line 302
    .line 303
    const/4 v3, 0x2

    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :goto_9
    if-lez v6, :cond_2d

    .line 307
    .line 308
    const/16 v0, 0x8

    .line 309
    .line 310
    if-ge v6, v0, :cond_2d

    .line 311
    .line 312
    return v7

    .line 313
    :cond_2d
    :goto_a
    return v16
.end method
