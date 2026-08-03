.class public final Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap$SingleMapBuilder;
    }
.end annotation


# static fields
.field static final ENUM_MAP_BUILDER:Ljava/util/function/Function;

.field public static final INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

.field public static final INSTANCE_OBJECT:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;


# instance fields
.field final builder:Ljava/util/function/Function;

.field final fastjson1x:Z

.field final features:J

.field final fieldType:Ljava/lang/reflect/Type;

.field volatile instanceError:Z

.field final instanceType:Ljava/lang/Class;

.field mapSingleton:Ljava/lang/Object;

.field final mapType:Ljava/lang/Class;

.field final mapTypeHash:J


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->ENUM_MAP_BUILDER:Ljava/util/function/Function;

    .line 9
    .line 10
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 11
    .line 12
    const-wide/16 v8, 0x0

    .line 13
    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const-class v4, Ljava/util/HashMap;

    .line 17
    .line 18
    const-wide/16 v5, 0x4d

    .line 19
    .line 20
    const-class v7, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/Class;JLjava/util/function/Function;)V

    .line 23
    .line 24
    .line 25
    sput-object v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 26
    .line 27
    new-instance v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 28
    .line 29
    const-wide/16 v9, 0x0

    .line 30
    .line 31
    const/4 v11, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const-class v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 34
    .line 35
    const-wide v6, -0x2463b1f14dade6e8L

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const-class v8, Lcom/alibaba/fastjson2/JSONObject;

    .line 41
    .line 42
    invoke-direct/range {v3 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/Class;JLjava/util/function/Function;)V

    .line 43
    .line 44
    .line 45
    sput-object v3, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->INSTANCE_OBJECT:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;JLjava/lang/Object;)V
    .locals 7

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p1

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    .line 37
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;JLjava/util/function/Function;)V

    .line 38
    iput-object p4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapSingleton:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/Class;JLjava/util/function/Function;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->fieldType:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapType:Ljava/lang/Class;

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapTypeHash:J

    .line 9
    .line 10
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 11
    .line 12
    iput-wide p6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->features:J

    .line 13
    .line 14
    iput-object p8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->builder:Ljava/util/function/Function;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string p2, "com.alibaba.fastjson.JSONObject"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p1, 0x0

    .line 33
    :goto_0
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->fastjson1x:Z

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;JLjava/util/function/Function;)V
    .locals 10

    .line 36
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    move-result-wide v4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v6, p3

    move-wide v7, p4

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/Class;JLjava/util/function/Function;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->lambda$static$0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->lambda$createObjectSupplier$1(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static createObjectSupplier(Ljava/lang/Class;)Ljava/util/function/Function;
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Ljava/util/Map;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    new-instance v0, Lbc/j;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, p0, v1}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :catch_0
    const-string p0, "create JSONObject1 error"

    .line 19
    .line 20
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return-object p0
.end method

.method private static synthetic lambda$createObjectSupplier$1(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    const-string p0, "create JSONObject1 error"

    .line 11
    .line 12
    invoke-static {p0}, Lah/a;->w(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method private static synthetic lambda$static$0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/EnumMap;

    .line 2
    .line 3
    check-cast p0, Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Ljava/util/EnumMap;-><init>(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-wide/from16 v4, p2

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object/from16 v2, p0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object/from16 v2, p0

    .line 32
    .line 33
    move-object v0, v1

    .line 34
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-class v6, Ljava/util/Map;

    .line 39
    .line 40
    const-string v7, "java.util.Collections$UnmodifiableMap"

    .line 41
    .line 42
    const-string v8, "java.util.Collections$SingletonMap"

    .line 43
    .line 44
    const-class v9, Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    const-class v10, Ljava/util/HashMap;

    .line 47
    .line 48
    const/4 v11, 0x0

    .line 49
    if-eq v1, v6, :cond_8

    .line 50
    .line 51
    const-class v6, Ljava/util/AbstractMap;

    .line 52
    .line 53
    if-eq v1, v6, :cond_8

    .line 54
    .line 55
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_2

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_3

    .line 67
    .line 68
    move-object v6, v9

    .line 69
    :goto_1
    move-object v0, v11

    .line 70
    goto :goto_4

    .line 71
    :cond_3
    const-class v6, Ljava/util/concurrent/ConcurrentMap;

    .line 72
    .line 73
    if-ne v1, v6, :cond_4

    .line 74
    .line 75
    const-class v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 76
    .line 77
    :goto_2
    move-object v6, v0

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    const-class v6, Ljava/util/concurrent/ConcurrentNavigableMap;

    .line 80
    .line 81
    if-ne v1, v6, :cond_5

    .line 82
    .line 83
    const-class v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_5
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const-string v12, "java.util.Collections$SynchronizedSortedMap"

    .line 94
    .line 95
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-nez v12, :cond_7

    .line 100
    .line 101
    const-string v12, "java.util.Collections$SynchronizedMap"

    .line 102
    .line 103
    invoke-virtual {v6, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-nez v6, :cond_6

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_6
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 111
    .line 112
    const/16 v6, 0x13

    .line 113
    .line 114
    invoke-direct {v0, v6}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 115
    .line 116
    .line 117
    move-object v6, v10

    .line 118
    goto :goto_4

    .line 119
    :cond_7
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 120
    .line 121
    const/16 v6, 0x14

    .line 122
    .line 123
    invoke-direct {v0, v6}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 124
    .line 125
    .line 126
    const-class v6, Ljava/util/TreeMap;

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_8
    :goto_3
    move-object v6, v10

    .line 130
    goto :goto_1

    .line 131
    :goto_4
    instance-of v12, v2, Ljava/lang/reflect/ParameterizedType;

    .line 132
    .line 133
    const/4 v14, 0x2

    .line 134
    const/4 v15, 0x1

    .line 135
    if-eqz v12, :cond_a

    .line 136
    .line 137
    move-object v12, v2

    .line 138
    check-cast v12, Ljava/lang/reflect/ParameterizedType;

    .line 139
    .line 140
    invoke-interface {v12}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    const/16 p0, 0x0

    .line 145
    .line 146
    array-length v13, v12

    .line 147
    if-ne v13, v14, :cond_b

    .line 148
    .line 149
    const-string v13, "org.springframework.util.LinkedMultiValueMap"

    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-nez v13, :cond_b

    .line 160
    .line 161
    aget-object v3, v12, p0

    .line 162
    .line 163
    aget-object v2, v12, v15

    .line 164
    .line 165
    const-class v7, Ljava/lang/String;

    .line 166
    .line 167
    if-ne v3, v7, :cond_9

    .line 168
    .line 169
    if-ne v2, v7, :cond_9

    .line 170
    .line 171
    if-nez v0, :cond_9

    .line 172
    .line 173
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapString;

    .line 174
    .line 175
    invoke-direct {v0, v1, v6, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapString;-><init>(Ljava/lang/Class;Ljava/lang/Class;J)V

    .line 176
    .line 177
    .line 178
    return-object v0

    .line 179
    :cond_9
    move-object v7, v0

    .line 180
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;

    .line 181
    .line 182
    move-object v4, v2

    .line 183
    move-object v2, v6

    .line 184
    const-wide/16 v5, 0x0

    .line 185
    .line 186
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V

    .line 187
    .line 188
    .line 189
    return-object v0

    .line 190
    :cond_a
    const/16 p0, 0x0

    .line 191
    .line 192
    :cond_b
    const-class v12, Lcom/alibaba/fastjson2/JSONObject;

    .line 193
    .line 194
    if-nez v2, :cond_d

    .line 195
    .line 196
    const-wide/16 v13, 0x0

    .line 197
    .line 198
    cmp-long v13, v4, v13

    .line 199
    .line 200
    if-nez v13, :cond_d

    .line 201
    .line 202
    if-ne v1, v10, :cond_c

    .line 203
    .line 204
    if-ne v6, v10, :cond_c

    .line 205
    .line 206
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_c
    if-ne v1, v12, :cond_d

    .line 210
    .line 211
    if-ne v6, v12, :cond_d

    .line 212
    .line 213
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->INSTANCE_OBJECT:Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 214
    .line 215
    return-object v0

    .line 216
    :cond_d
    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v13

    .line 220
    const-string v14, "com.alibaba.fastjson.JSONObject"

    .line 221
    .line 222
    invoke-virtual {v13, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v14

    .line 226
    if-eqz v14, :cond_e

    .line 227
    .line 228
    move-object v7, v0

    .line 229
    goto/16 :goto_8

    .line 230
    .line 231
    :cond_e
    const-string v10, "java.util.Collections$EmptyMap"

    .line 232
    .line 233
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    if-eqz v10, :cond_f

    .line 238
    .line 239
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 240
    .line 241
    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 242
    .line 243
    invoke-direct {v0, v6, v4, v5, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;-><init>(Ljava/lang/Class;JLjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    return-object v0

    .line 247
    :cond_f
    const-string v10, "tf.u"

    .line 248
    .line 249
    invoke-virtual {v13, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v10

    .line 253
    if-eqz v10, :cond_11

    .line 254
    .line 255
    :try_start_0
    const-string v0, "INSTANCE"

    .line 256
    .line 257
    invoke-virtual {v6, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {v0}, Ljava/lang/reflect/AccessibleObject;->isAccessible()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-nez v1, :cond_10

    .line 266
    .line 267
    invoke-virtual {v0, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :catch_0
    move-exception v0

    .line 272
    goto :goto_6

    .line 273
    :catch_1
    move-exception v0

    .line 274
    goto :goto_6

    .line 275
    :cond_10
    :goto_5
    invoke-virtual {v0, v11}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 280
    .line 281
    invoke-direct {v1, v6, v4, v5, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;-><init>(Ljava/lang/Class;JLjava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    return-object v1

    .line 285
    :goto_6
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 286
    .line 287
    const-string v2, "Failed to get singleton of "

    .line 288
    .line 289
    invoke-static {v6, v2}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 294
    .line 295
    .line 296
    throw v1

    .line 297
    :cond_11
    const-class v10, Lcom/alibaba/fastjson2/util/JSONObject1O;

    .line 298
    .line 299
    if-ne v6, v10, :cond_12

    .line 300
    .line 301
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getBuilderJSONObject1x()Ljava/util/function/Function;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    move-object v7, v0

    .line 306
    move-object v10, v9

    .line 307
    goto :goto_8

    .line 308
    :cond_12
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-eqz v7, :cond_14

    .line 313
    .line 314
    new-instance v0, Lcom/alibaba/fastjson2/reader/f;

    .line 315
    .line 316
    const/16 v3, 0x15

    .line 317
    .line 318
    invoke-direct {v0, v3}, Lcom/alibaba/fastjson2/reader/f;-><init>(I)V

    .line 319
    .line 320
    .line 321
    :cond_13
    :goto_7
    move-object v7, v0

    .line 322
    move-object v10, v6

    .line 323
    goto :goto_8

    .line 324
    :cond_14
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_13

    .line 329
    .line 330
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap$SingleMapBuilder;

    .line 331
    .line 332
    invoke-direct {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap$SingleMapBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    goto :goto_7

    .line 336
    :goto_8
    invoke-virtual {v10}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-eq v1, v12, :cond_15

    .line 341
    .line 342
    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    .line 343
    .line 344
    if-eqz v3, :cond_15

    .line 345
    .line 346
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 347
    .line 348
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    array-length v3, v0

    .line 353
    const/4 v6, 0x2

    .line 354
    if-ne v3, v6, :cond_15

    .line 355
    .line 356
    aget-object v3, v0, p0

    .line 357
    .line 358
    aget-object v0, v0, v15

    .line 359
    .line 360
    instance-of v6, v3, Ljava/lang/reflect/TypeVariable;

    .line 361
    .line 362
    if-nez v6, :cond_15

    .line 363
    .line 364
    instance-of v6, v0, Ljava/lang/reflect/TypeVariable;

    .line 365
    .line 366
    if-nez v6, :cond_15

    .line 367
    .line 368
    move-object v4, v0

    .line 369
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;

    .line 370
    .line 371
    const-wide/16 v5, 0x0

    .line 372
    .line 373
    move-object v2, v10

    .line 374
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V

    .line 375
    .line 376
    .line 377
    return-object v0

    .line 378
    :cond_15
    move-object v6, v10

    .line 379
    const-class v0, Ljava/util/EnumMap;

    .line 380
    .line 381
    if-ne v1, v0, :cond_16

    .line 382
    .line 383
    sget-object v7, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->ENUM_MAP_BUILDER:Ljava/util/function/Function;

    .line 384
    .line 385
    move-object v3, v9

    .line 386
    :goto_9
    move-object v6, v7

    .line 387
    goto :goto_a

    .line 388
    :cond_16
    move-object v3, v6

    .line 389
    goto :goto_9

    .line 390
    :goto_a
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;

    .line 391
    .line 392
    move-object v4, v2

    .line 393
    move-object v2, v1

    .line 394
    move-object v1, v4

    .line 395
    move-wide/from16 v4, p2

    .line 396
    .line 397
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;JLjava/util/function/Function;)V

    .line 398
    .line 399
    .line 400
    return-object v0
.end method


# virtual methods
.method public createInstance(J)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 2
    .line 3
    const-class p2, Ljava/util/HashMap;

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    const-class p2, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    if-ne p1, p2, :cond_1

    .line 16
    .line 17
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    const-class p2, Lcom/alibaba/fastjson2/JSONObject;

    .line 24
    .line 25
    if-ne p1, p2, :cond_2

    .line 26
    .line 27
    new-instance p1, Lcom/alibaba/fastjson2/JSONObject;

    .line 28
    .line 29
    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_2
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapSingleton:Ljava/lang/Object;

    .line 34
    .line 35
    if-eqz p2, :cond_3

    .line 36
    .line 37
    return-object p2

    .line 38
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p2, "java.util.ImmutableCollections$Map1"

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-nez p2, :cond_5

    .line 49
    .line 50
    const-string p2, "java.util.ImmutableCollections$MapN"

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_4

    .line 57
    .line 58
    :try_start_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    return-object p1

    .line 65
    :catch_0
    const-string p1, "create map error : "

    .line 66
    .line 67
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-static {p2, p1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    return-object p1

    .line 74
    :cond_4
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_5
    new-instance p1, Ljava/util/HashMap;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 83
    .line 84
    .line 85
    return-object p1
.end method

.method public createInstance(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapType:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 87
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapType:Ljava/lang/Class;

    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    if-ne v0, v1, :cond_1

    .line 88
    new-instance p2, Lcom/alibaba/fastjson2/JSONObject;

    invoke-direct {p2, p1}, Lcom/alibaba/fastjson2/JSONObject;-><init>(Ljava/util/Map;)V

    return-object p2

    .line 89
    :cond_1
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->createInstance(J)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    .line 90
    invoke-interface {p2, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 91
    iget-boolean p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->fastjson1x:Z

    if-eqz p1, :cond_2

    .line 92
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSONFactory;->createJSONObject1(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    .line 93
    :cond_2
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->builder:Ljava/util/function/Function;

    if-eqz p1, :cond_3

    .line 94
    invoke-interface {p1, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    return-object p2
.end method

.method public getBuildFunction()Ljava/util/function/Function;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->builder:Ljava/util/function/Function;

    .line 2
    .line 3
    return-object v0
.end method

.method public getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapType:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapType:Ljava/lang/Class;

    .line 4
    .line 5
    iget-wide v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapTypeHash:J

    .line 6
    .line 7
    iget-wide v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->features:J

    .line 8
    .line 9
    or-long v5, v5, p4

    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    if-eq v2, v0, :cond_0

    .line 20
    .line 21
    move-object/from16 v3, p2

    .line 22
    .line 23
    move-object/from16 v4, p3

    .line 24
    .line 25
    move-wide/from16 v5, p4

    .line 26
    .line 27
    move-object v1, v2

    .line 28
    move-object/from16 v2, p1

    .line 29
    .line 30
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    return-object v1

    .line 35
    :cond_0
    move-object/from16 v1, p1

    .line 36
    .line 37
    move-wide/from16 v7, p4

    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v9, 0x0

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    return-object v9

    .line 47
    :cond_1
    const/16 v10, -0x5a

    .line 48
    .line 49
    invoke-virtual {v1, v10}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v11

    .line 56
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectSupplier()Ljava/util/function/Supplier;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapType:Ljava/lang/Class;

    .line 63
    .line 64
    if-nez v3, :cond_2

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    check-cast v2, Ljava/util/Map;

    .line 73
    .line 74
    :goto_0
    move-object v13, v2

    .line 75
    goto/16 :goto_3

    .line 76
    .line 77
    :cond_2
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 78
    .line 79
    const-class v3, Ljava/util/HashMap;

    .line 80
    .line 81
    if-ne v2, v3, :cond_3

    .line 82
    .line 83
    new-instance v2, Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    const-class v3, Ljava/util/LinkedHashMap;

    .line 90
    .line 91
    if-ne v2, v3, :cond_4

    .line 92
    .line 93
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_4
    const-class v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 100
    .line 101
    if-ne v2, v3, :cond_5

    .line 102
    .line 103
    new-instance v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 104
    .line 105
    invoke-direct {v2}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    if-eqz v2, :cond_6

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const-string v3, "java.util.Collections$EmptyMap"

    .line 116
    .line 117
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_6

    .line 122
    .line 123
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_6
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceError:Z

    .line 127
    .line 128
    const-string v3, "create map error "

    .line 129
    .line 130
    if-nez v2, :cond_7

    .line 131
    .line 132
    :try_start_0
    iget-object v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 133
    .line 134
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    .line 140
    move-object v4, v2

    .line 141
    move-object v2, v9

    .line 142
    goto :goto_1

    .line 143
    :catch_0
    const/4 v2, 0x1

    .line 144
    iput-boolean v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceError:Z

    .line 145
    .line 146
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 147
    .line 148
    new-instance v4, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 154
    .line 155
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-virtual {v1, v4}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-direct {v2, v4}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    move-object v4, v9

    .line 170
    goto :goto_1

    .line 171
    :cond_7
    move-object v2, v9

    .line 172
    move-object v4, v2

    .line 173
    :goto_1
    iget-boolean v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceError:Z

    .line 174
    .line 175
    if-eqz v5, :cond_8

    .line 176
    .line 177
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 178
    .line 179
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    const-class v6, Ljava/util/Map;

    .line 184
    .line 185
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-eqz v5, :cond_8

    .line 190
    .line 191
    :try_start_1
    iget-object v5, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    check-cast v5, Ljava/util/Map;
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1

    .line 202
    .line 203
    move-object v4, v5

    .line 204
    move-object v2, v9

    .line 205
    goto :goto_2

    .line 206
    :catch_1
    if-nez v2, :cond_8

    .line 207
    .line 208
    new-instance v2, Lcom/alibaba/fastjson2/JSONException;

    .line 209
    .line 210
    new-instance v5, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->instanceType:Ljava/lang/Class;

    .line 216
    .line 217
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-direct {v2, v3}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :cond_8
    :goto_2
    if-nez v2, :cond_1a

    .line 232
    .line 233
    move-object v13, v4

    .line 234
    :goto_3
    const/4 v2, 0x0

    .line 235
    move v14, v2

    .line 236
    :goto_4
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    const/16 v3, -0x5b

    .line 241
    .line 242
    if-ne v2, v3, :cond_b

    .line 243
    .line 244
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 245
    .line 246
    .line 247
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->fastjson1x:Z

    .line 248
    .line 249
    if-eqz v1, :cond_9

    .line 250
    .line 251
    invoke-static {v13}, Lcom/alibaba/fastjson2/JSONFactory;->createJSONObject1(Ljava/util/Map;)Ljava/util/Map;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    return-object v1

    .line 256
    :cond_9
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->builder:Ljava/util/function/Function;

    .line 257
    .line 258
    if-eqz v1, :cond_a

    .line 259
    .line 260
    invoke-interface {v1, v13}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    return-object v1

    .line 265
    :cond_a
    return-object v13

    .line 266
    :cond_b
    const/16 v3, -0x6d

    .line 267
    .line 268
    const/16 v4, 0x49

    .line 269
    .line 270
    if-lt v2, v4, :cond_c

    .line 271
    .line 272
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    :goto_5
    move-object v15, v2

    .line 277
    goto :goto_6

    .line 278
    :cond_c
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(B)Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_d

    .line 283
    .line 284
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    new-instance v5, Lcom/alibaba/fastjson2/util/ReferenceKey;

    .line 289
    .line 290
    invoke-direct {v5, v14}, Lcom/alibaba/fastjson2/util/ReferenceKey;-><init>(I)V

    .line 291
    .line 292
    .line 293
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v1, v13, v5, v2}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 298
    .line 299
    .line 300
    move-object v15, v5

    .line 301
    goto :goto_6

    .line 302
    :cond_d
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    goto :goto_5

    .line 307
    :goto_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    const-string v5, ".."

    .line 312
    .line 313
    if-eqz v2, :cond_f

    .line 314
    .line 315
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    if-eqz v3, :cond_e

    .line 324
    .line 325
    invoke-interface {v13, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    :goto_7
    move-object v4, v1

    .line 329
    goto/16 :goto_a

    .line 330
    .line 331
    :cond_e
    invoke-static {v2}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-virtual {v1, v13, v15, v2}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v13, v15, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_f
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-lt v2, v4, :cond_10

    .line 347
    .line 348
    const/16 v4, 0x7d

    .line 349
    .line 350
    if-gt v2, v4, :cond_10

    .line 351
    .line 352
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    move-object v4, v1

    .line 357
    move-object v6, v15

    .line 358
    goto/16 :goto_9

    .line 359
    .line 360
    :cond_10
    const/16 v4, -0x6e

    .line 361
    .line 362
    if-ne v2, v4, :cond_12

    .line 363
    .line 364
    iget-wide v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->features:J

    .line 365
    .line 366
    or-long v5, v2, v7

    .line 367
    .line 368
    const-class v2, Ljava/lang/Object;

    .line 369
    .line 370
    const-wide/16 v3, 0x0

    .line 371
    .line 372
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    if-eqz v2, :cond_11

    .line 377
    .line 378
    const/4 v3, 0x0

    .line 379
    move-object v1, v2

    .line 380
    move-wide v5, v7

    .line 381
    move-object v4, v15

    .line 382
    move-object/from16 v2, p1

    .line 383
    .line 384
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    move-object v6, v4

    .line 389
    move-object v4, v2

    .line 390
    :goto_8
    move-object v2, v1

    .line 391
    goto :goto_9

    .line 392
    :cond_11
    move-object/from16 v4, p1

    .line 393
    .line 394
    move-object v6, v15

    .line 395
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    goto :goto_8

    .line 400
    :cond_12
    move-object v4, v1

    .line 401
    move-object v6, v15

    .line 402
    const/16 v1, -0x4f

    .line 403
    .line 404
    if-ne v2, v1, :cond_13

    .line 405
    .line 406
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 407
    .line 408
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 409
    .line 410
    .line 411
    goto :goto_9

    .line 412
    :cond_13
    const/16 v1, -0x50

    .line 413
    .line 414
    if-ne v2, v1, :cond_14

    .line 415
    .line 416
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 417
    .line 418
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 419
    .line 420
    .line 421
    goto :goto_9

    .line 422
    :cond_14
    if-ne v2, v3, :cond_16

    .line 423
    .line 424
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v2

    .line 432
    if-eqz v2, :cond_15

    .line 433
    .line 434
    move-object v2, v13

    .line 435
    goto :goto_9

    .line 436
    :cond_15
    invoke-static {v1}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-virtual {v4, v13, v6, v1}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 441
    .line 442
    .line 443
    move-object v2, v9

    .line 444
    goto :goto_9

    .line 445
    :cond_16
    if-ne v2, v10, :cond_17

    .line 446
    .line 447
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    goto :goto_9

    .line 452
    :cond_17
    const/16 v1, -0x6c

    .line 453
    .line 454
    if-lt v2, v1, :cond_18

    .line 455
    .line 456
    const/16 v1, -0x5c

    .line 457
    .line 458
    if-gt v2, v1, :cond_18

    .line 459
    .line 460
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    goto :goto_9

    .line 465
    :cond_18
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v2

    .line 469
    :goto_9
    if-nez v2, :cond_19

    .line 470
    .line 471
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 472
    .line 473
    iget-wide v7, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 474
    .line 475
    and-long/2addr v7, v11

    .line 476
    const-wide/16 v15, 0x0

    .line 477
    .line 478
    cmp-long v1, v7, v15

    .line 479
    .line 480
    if-eqz v1, :cond_19

    .line 481
    .line 482
    goto :goto_a

    .line 483
    :cond_19
    invoke-interface {v13, v6, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    :goto_a
    add-int/lit8 v14, v14, 0x1

    .line 487
    .line 488
    move-wide/from16 v7, p4

    .line 489
    .line 490
    move-object v1, v4

    .line 491
    goto/16 :goto_4

    .line 492
    .line 493
    :cond_1a
    throw v2
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    move-object p2, p0

    .line 10
    return-object p1

    .line 11
    :cond_0
    move-object p2, p0

    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    :cond_1
    iget-object p3, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 21
    .line 22
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectSupplier()Ljava/util/function/Supplier;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget-object v1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->mapType:Ljava/lang/Class;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    const-class v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 33
    .line 34
    if-eq v1, v2, :cond_2

    .line 35
    .line 36
    const-string v2, "com.alibaba.fastjson.JSONObject"

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    :cond_2
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    check-cast p3, Ljava/util/Map;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    iget-wide v0, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 56
    .line 57
    or-long/2addr v0, p4

    .line 58
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->createInstance(J)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    check-cast p3, Ljava/util/Map;

    .line 63
    .line 64
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isTypeRedirect()Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_6

    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :try_start_0
    invoke-virtual {v1, p3, p4, p5}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->close()V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    move-object p1, v0

    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    :try_start_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :catchall_1
    move-exception v0

    .line 110
    move-object p3, v0

    .line 111
    invoke-virtual {p1, p3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    :goto_1
    throw p1

    .line 115
    :cond_5
    invoke-virtual {p1, p3, p4, p5}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 116
    .line 117
    .line 118
    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 119
    .line 120
    .line 121
    iget-boolean p1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->fastjson1x:Z

    .line 122
    .line 123
    if-eqz p1, :cond_7

    .line 124
    .line 125
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONFactory;->createJSONObject1(Ljava/util/Map;)Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    return-object p1

    .line 130
    :cond_7
    iget-object p1, p2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->builder:Ljava/util/function/Function;

    .line 131
    .line 132
    if-eqz p1, :cond_8

    .line 133
    .line 134
    invoke-interface {p1, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    return-object p1

    .line 139
    :cond_8
    return-object p3
.end method
