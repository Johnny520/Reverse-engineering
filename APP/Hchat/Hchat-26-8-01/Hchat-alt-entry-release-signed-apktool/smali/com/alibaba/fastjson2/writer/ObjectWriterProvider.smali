.class public Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;
    }
.end annotation


# static fields
.field static final ENUM:I = 0x4000

.field static final NOT_REFERENCES_TYPE_HASH_CODES:[I

.field static final PRIMITIVE_HASH_CODES:[I

.field static STACK_TRACE_ELEMENT_WRITER:Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter; = null

.field static final TYPE_DATE_MASK:I = 0x10

.field static final TYPE_DECIMAL_MASK:I = 0x8

.field static final TYPE_ENUM_MASK:I = 0x20

.field static final TYPE_INT32_MASK:I = 0x2

.field static final TYPE_INT64_MASK:I = 0x4


# instance fields
.field final cache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            ">;"
        }
    .end annotation
.end field

.field final cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            ">;"
        }
    .end annotation
.end field

.field final creator:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

.field final mixInCache:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/Class;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field

.field final namingStrategy:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

.field volatile userDefineMask:J


# direct methods
.method static constructor <clinit>()V
    .locals 29

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v26

    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v27

    .line 13
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v28

    .line 19
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    const-class v2, Ljava/lang/Boolean;

    .line 22
    .line 23
    const-class v3, Ljava/lang/Character;

    .line 24
    .line 25
    sget-object v4, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    const-class v5, Ljava/lang/Byte;

    .line 28
    .line 29
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v7, Ljava/lang/Short;

    .line 32
    .line 33
    sget-object v8, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-class v9, Ljava/lang/Integer;

    .line 36
    .line 37
    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    const-class v11, Ljava/lang/Long;

    .line 40
    .line 41
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    const-class v13, Ljava/lang/Float;

    .line 44
    .line 45
    sget-object v14, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    const-class v15, Ljava/lang/Double;

    .line 48
    .line 49
    sget-object v16, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    const-class v17, Ljava/math/BigInteger;

    .line 52
    .line 53
    const-class v18, Ljava/math/BigDecimal;

    .line 54
    .line 55
    const-class v19, Ljava/lang/String;

    .line 56
    .line 57
    const-class v20, Ljava/util/Currency;

    .line 58
    .line 59
    const-class v21, Ljava/util/Date;

    .line 60
    .line 61
    const-class v22, Ljava/util/UUID;

    .line 62
    .line 63
    const-class v23, Ljava/util/Locale;

    .line 64
    .line 65
    const-class v24, Ljava/lang/String;

    .line 66
    .line 67
    const-class v25, Ljava/lang/StackTraceElement;

    .line 68
    .line 69
    filled-new-array/range {v1 .. v28}, [Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/16 v1, 0x1c

    .line 74
    .line 75
    new-array v2, v1, [I

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    :goto_0
    if-ge v3, v1, :cond_0

    .line 79
    .line 80
    aget-object v4, v0, v3

    .line 81
    .line 82
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    aput v4, v2, v3

    .line 87
    .line 88
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_0
    invoke-static {v2}, Ljava/util/Arrays;->sort([I)V

    .line 92
    .line 93
    .line 94
    sput-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->PRIMITIVE_HASH_CODES:[I

    .line 95
    .line 96
    const/16 v0, 0x1f

    .line 97
    .line 98
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    array-length v1, v0

    .line 103
    add-int/lit8 v1, v1, -0x1

    .line 104
    .line 105
    const-class v2, Ljava/lang/Class;

    .line 106
    .line 107
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    aput v2, v0, v1

    .line 112
    .line 113
    array-length v1, v0

    .line 114
    add-int/lit8 v1, v1, -0x2

    .line 115
    .line 116
    const-class v2, [I

    .line 117
    .line 118
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    aput v2, v0, v1

    .line 123
    .line 124
    array-length v1, v0

    .line 125
    add-int/lit8 v1, v1, -0x3

    .line 126
    .line 127
    const-class v2, [J

    .line 128
    .line 129
    invoke-static {v2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    aput v2, v0, v1

    .line 134
    .line 135
    invoke-static {v0}, Ljava/util/Arrays;->sort([I)V

    .line 136
    .line 137
    .line 138
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->NOT_REFERENCES_TYPE_HASH_CODES:[I

    .line 139
    .line 140
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;-><init>(Lcom/alibaba/fastjson2/PropertyNamingStrategy;)V

    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/PropertyNamingStrategy;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 24
    .line 25
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->namingStrategy:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 26
    .line 27
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->creator:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 35
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 36
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 37
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->creator:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->namingStrategy:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    return-void
.end method

.method public static synthetic a(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->lambda$processJSONField1x$1(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private applyFeatures(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/Enum;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p2

    .line 4
    if-ge v1, v2, :cond_e

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, -0x1

    .line 20
    sparse-switch v3, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :sswitch_0
    const-string v3, "WriteMapNullValue"

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_0
    const/16 v4, 0xd

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :sswitch_1
    const-string v3, "WriteClassName"

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_1
    const/16 v4, 0xc

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :sswitch_2
    const-string v3, "WriteNullBooleanAsFalse"

    .line 54
    .line 55
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :cond_2
    const/16 v4, 0xb

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :sswitch_3
    const-string v3, "WriteNonStringValueAsString"

    .line 68
    .line 69
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_3

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :cond_3
    const/16 v4, 0xa

    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :sswitch_4
    const-string v3, "WriteNullListAsEmpty"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_4

    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :cond_4
    const/16 v4, 0x9

    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :sswitch_5
    const-string v3, "NotWriteRootClassName"

    .line 96
    .line 97
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_5

    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :cond_5
    const/16 v4, 0x8

    .line 106
    .line 107
    goto/16 :goto_1

    .line 108
    .line 109
    :sswitch_6
    const-string v3, "WriteNullStringAsEmpty"

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_6

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_6
    const/4 v4, 0x7

    .line 119
    goto :goto_1

    .line 120
    :sswitch_7
    const-string v3, "BrowserCompatible"

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-nez v2, :cond_7

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_7
    const/4 v4, 0x6

    .line 130
    goto :goto_1

    .line 131
    :sswitch_8
    const-string v3, "WriteEnumUsingToString"

    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-nez v2, :cond_8

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_8
    const/4 v4, 0x5

    .line 141
    goto :goto_1

    .line 142
    :sswitch_9
    const-string v3, "WriteBigDecimalAsPlain"

    .line 143
    .line 144
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_9

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_9
    const/4 v4, 0x4

    .line 152
    goto :goto_1

    .line 153
    :sswitch_a
    const-string v3, "UseISO8601DateFormat"

    .line 154
    .line 155
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-nez v2, :cond_a

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_a
    const/4 v4, 0x3

    .line 163
    goto :goto_1

    .line 164
    :sswitch_b
    const-string v3, "IgnoreErrorGetter"

    .line 165
    .line 166
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-nez v2, :cond_b

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_b
    const/4 v4, 0x2

    .line 174
    goto :goto_1

    .line 175
    :sswitch_c
    const-string v3, "WriteNullNumberAsZero"

    .line 176
    .line 177
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-nez v2, :cond_c

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_c
    const/4 v4, 0x1

    .line 185
    goto :goto_1

    .line 186
    :sswitch_d
    const-string v3, "DisableCircularReferenceDetect"

    .line 187
    .line 188
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-nez v2, :cond_d

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_d
    move v4, v0

    .line 196
    :goto_1
    packed-switch v4, :pswitch_data_0

    .line 197
    .line 198
    .line 199
    goto/16 :goto_2

    .line 200
    .line 201
    :pswitch_0
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 202
    .line 203
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 204
    .line 205
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 206
    .line 207
    or-long/2addr v2, v4

    .line 208
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 209
    .line 210
    goto/16 :goto_2

    .line 211
    .line 212
    :pswitch_1
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 213
    .line 214
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 215
    .line 216
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 217
    .line 218
    or-long/2addr v2, v4

    .line 219
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 220
    .line 221
    goto/16 :goto_2

    .line 222
    .line 223
    :pswitch_2
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 224
    .line 225
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 226
    .line 227
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 228
    .line 229
    or-long/2addr v2, v4

    .line 230
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :pswitch_3
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 234
    .line 235
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 236
    .line 237
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 238
    .line 239
    or-long/2addr v2, v4

    .line 240
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :pswitch_4
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 244
    .line 245
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 246
    .line 247
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 248
    .line 249
    or-long/2addr v2, v4

    .line 250
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :pswitch_5
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 254
    .line 255
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteRootClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 256
    .line 257
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 258
    .line 259
    or-long/2addr v2, v4

    .line 260
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :pswitch_6
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 264
    .line 265
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullStringAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 266
    .line 267
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 268
    .line 269
    or-long/2addr v2, v4

    .line 270
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :pswitch_7
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 274
    .line 275
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 276
    .line 277
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 278
    .line 279
    or-long/2addr v2, v4

    .line 280
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 281
    .line 282
    goto :goto_2

    .line 283
    :pswitch_8
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 284
    .line 285
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 286
    .line 287
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 288
    .line 289
    or-long/2addr v2, v4

    .line 290
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 291
    .line 292
    goto :goto_2

    .line 293
    :pswitch_9
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 294
    .line 295
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteBigDecimalAsPlain:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 296
    .line 297
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 298
    .line 299
    or-long/2addr v2, v4

    .line 300
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 301
    .line 302
    goto :goto_2

    .line 303
    :pswitch_a
    const-string v2, "iso8601"

    .line 304
    .line 305
    iput-object v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 306
    .line 307
    goto :goto_2

    .line 308
    :pswitch_b
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 309
    .line 310
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreErrorGetter:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 311
    .line 312
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 313
    .line 314
    or-long/2addr v2, v4

    .line 315
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 316
    .line 317
    goto :goto_2

    .line 318
    :pswitch_c
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 319
    .line 320
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 321
    .line 322
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 323
    .line 324
    or-long/2addr v2, v4

    .line 325
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 326
    .line 327
    goto :goto_2

    .line 328
    :pswitch_d
    iget-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 329
    .line 330
    const-wide/high16 v4, 0x400000000000000L

    .line 331
    .line 332
    or-long/2addr v2, v4

    .line 333
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 334
    .line 335
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 336
    .line 337
    goto/16 :goto_0

    .line 338
    .line 339
    :cond_e
    return-void

    .line 340
    nop

    .line 341
    :sswitch_data_0
    .sparse-switch
        -0x7e4756b9 -> :sswitch_d
        -0x737c2857 -> :sswitch_c
        -0x6a158c1f -> :sswitch_b
        -0x1f6b42be -> :sswitch_a
        -0x14cc04b8 -> :sswitch_9
        -0x13fc7e70 -> :sswitch_8
        -0xca1b004 -> :sswitch_7
        -0x61b295c -> :sswitch_6
        -0x3c0c42b -> :sswitch_5
        0x3c26e3f7 -> :sswitch_4
        0x5a8cc575 -> :sswitch_3
        0x6bc5c64f -> :sswitch_2
        0x700b1b24 -> :sswitch_1
        0x7a300f8d -> :sswitch_0
    .end sparse-switch

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public static synthetic b(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->lambda$getBeanInfo$0(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private createEnumWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move-object v4, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v4, p1

    .line 20
    :goto_0
    invoke-static {v4, p0}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumValueField(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/reflect/Member;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v0, 0x0

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 28
    .line 29
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v1, p0}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumValueField(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/reflect/Member;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    instance-of v2, v1, Ljava/lang/reflect/Field;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    :try_start_0
    check-cast v1, Ljava/lang/reflect/Field;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v4, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 50
    .line 51
    .line 52
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    :catch_0
    :cond_1
    :goto_1
    move-object v5, p1

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    instance-of v2, v1, Ljava/lang/reflect/Method;

    .line 56
    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    :try_start_1
    check-cast v1, Ljava/lang/reflect/Method;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v4, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0

    .line 69
    goto :goto_1

    .line 70
    :goto_2
    new-instance p1, Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 71
    .line 72
    invoke-direct {p1}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 76
    .line 77
    .line 78
    iget-boolean p1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->writeEnumAsJavaBean:Z

    .line 79
    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_3
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumAnnotationNames(Ljava/lang/Class;)[Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    const-wide/16 v7, 0x0

    .line 91
    .line 92
    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Member;[Ljava/lang/String;J)V

    .line 93
    .line 94
    .line 95
    return-object v2
.end method

.method public static isNotReferenceDetect(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->NOT_REFERENCES_TYPE_HASH_CODES:[I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v0, v1}, Ljava/util/Arrays;->binarySearch([II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    and-int/lit16 v0, v0, 0x4000

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-class v0, Ljava/lang/Enum;

    .line 26
    .line 27
    if-ne p0, v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public static isPrimitiveOrEnum(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->PRIMITIVE_HASH_CODES:[I

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v0, v1}, Ljava/util/Arrays;->binarySearch([II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    and-int/lit16 v0, v0, 0x4000

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-class v0, Ljava/lang/Enum;

    .line 26
    .line 27
    if-ne p0, v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    return p0

    .line 32
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method private static synthetic lambda$getBeanInfo$0(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/alibaba/fastjson2/util/BeanUtils;->processJSONType1x(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$processJSONField1x$1(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p3, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result p3

    .line 14
    sparse-switch p3, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :sswitch_0
    const-string p3, "label"

    .line 20
    .line 21
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    check-cast p1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-nez p3, :cond_0

    .line 34
    .line 35
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->label:Ljava/lang/String;

    .line 36
    .line 37
    return-void

    .line 38
    :sswitch_1
    const-string p3, "jsonDirect"

    .line 39
    .line 40
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_0

    .line 45
    .line 46
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    iget-wide v0, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 55
    .line 56
    const-wide/high16 v2, 0x4000000000000L

    .line 57
    .line 58
    or-long/2addr v0, v2

    .line 59
    iput-wide v0, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 60
    .line 61
    return-void

    .line 62
    :sswitch_2
    const-string p3, "name"

    .line 63
    .line 64
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-eqz p3, :cond_0

    .line 69
    .line 70
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    if-nez p3, :cond_0

    .line 77
    .line 78
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 79
    .line 80
    return-void

    .line 81
    :sswitch_3
    const-string p3, "serialize"

    .line 82
    .line 83
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-eqz p3, :cond_0

    .line 88
    .line 89
    check-cast p1, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-nez p1, :cond_0

    .line 96
    .line 97
    const/4 p1, 0x1

    .line 98
    iput-boolean p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 99
    .line 100
    return-void

    .line 101
    :sswitch_4
    const-string p3, "defaultValue"

    .line 102
    .line 103
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    if-eqz p3, :cond_0

    .line 108
    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    if-nez p3, :cond_0

    .line 116
    .line 117
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 118
    .line 119
    return-void

    .line 120
    :sswitch_5
    const-string p3, "serialzeFeatures"

    .line 121
    .line 122
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-eqz p3, :cond_0

    .line 127
    .line 128
    check-cast p1, [Ljava/lang/Enum;

    .line 129
    .line 130
    invoke-direct {p0, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->applyFeatures(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/Enum;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :sswitch_6
    const-string p3, "unwrapped"

    .line 135
    .line 136
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result p3

    .line 140
    if-eqz p3, :cond_0

    .line 141
    .line 142
    check-cast p1, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-eqz p1, :cond_0

    .line 149
    .line 150
    iget-wide v0, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 151
    .line 152
    const-wide/high16 v2, 0x2000000000000L

    .line 153
    .line 154
    or-long/2addr v0, v2

    .line 155
    iput-wide v0, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 156
    .line 157
    return-void

    .line 158
    :sswitch_7
    const-string p3, "ordinal"

    .line 159
    .line 160
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p3

    .line 164
    if-eqz p3, :cond_0

    .line 165
    .line 166
    check-cast p1, Ljava/lang/Integer;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    if-eqz p3, :cond_0

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    iput p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 179
    .line 180
    return-void

    .line 181
    :sswitch_8
    const-string p3, "format"

    .line 182
    .line 183
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result p3

    .line 187
    if-eqz p3, :cond_0

    .line 188
    .line 189
    check-cast p1, Ljava/lang/String;

    .line 190
    .line 191
    invoke-direct {p0, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->loadJsonFieldFormat(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :sswitch_9
    const-string p3, "serializeUsing"

    .line 196
    .line 197
    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    if-eqz p3, :cond_0

    .line 202
    .line 203
    check-cast p1, Ljava/lang/Class;

    .line 204
    .line 205
    const-class p3, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 206
    .line 207
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    if-eqz p3, :cond_0

    .line 212
    .line 213
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 214
    .line 215
    :catchall_0
    :cond_0
    :goto_0
    return-void

    .line 216
    nop

    .line 217
    :sswitch_data_0
    .sparse-switch
        -0x51c06e7c -> :sswitch_9
        -0x4ba00809 -> :sswitch_8
        -0x47f1458f -> :sswitch_7
        -0x3ade7834 -> :sswitch_6
        -0x3814e684 -> :sswitch_5
        -0x27497450 -> :sswitch_4
        -0x222e9920 -> :sswitch_3
        0x337a8b -> :sswitch_2
        0xbd26f1 -> :sswitch_1
        0x61f7ef4 -> :sswitch_0
    .end sparse-switch
.end method

.method private loadFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/annotation/JSONField;)V
    .locals 7

    .line 1
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 12
    .line 13
    :cond_0
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->defaultValue()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 24
    .line 25
    :cond_1
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->format()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, p1, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->loadJsonFieldFormat(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->label()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->label:Ljava/lang/String;

    .line 43
    .line 44
    :cond_2
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->serialize()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    xor-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    iput-boolean v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 55
    .line 56
    :cond_3
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->unwrapped()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    iget-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 63
    .line 64
    const-wide/high16 v2, 0x2000000000000L

    .line 65
    .line 66
    or-long/2addr v0, v2

    .line 67
    iput-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 68
    .line 69
    :cond_4
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->serializeFeatures()[Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/4 v1, 0x0

    .line 74
    :goto_0
    array-length v2, v0

    .line 75
    if-ge v1, v2, :cond_5

    .line 76
    .line 77
    aget-object v2, v0, v1

    .line 78
    .line 79
    iget-wide v3, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 80
    .line 81
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 82
    .line 83
    or-long v2, v3, v5

    .line 84
    .line 85
    iput-wide v2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iput v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 97
    .line 98
    :cond_6
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->value()Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    iget-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 105
    .line 106
    const-wide/high16 v2, 0x1000000000000L

    .line 107
    .line 108
    or-long/2addr v0, v2

    .line 109
    iput-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 110
    .line 111
    :cond_7
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->jsonDirect()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_8

    .line 116
    .line 117
    iget-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 118
    .line 119
    const-wide/high16 v2, 0x4000000000000L

    .line 120
    .line 121
    or-long/2addr v0, v2

    .line 122
    iput-wide v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 123
    .line 124
    :cond_8
    invoke-interface {p2}, Lcom/alibaba/fastjson2/annotation/JSONField;->serializeUsing()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    const-class v0, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 129
    .line 130
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_9

    .line 135
    .line 136
    iput-object p2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 137
    .line 138
    :cond_9
    return-void
.end method

.method private loadJsonFieldFormat(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const/16 v0, 0x54

    .line 12
    .line 13
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, -0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const-string v0, "\'T\'"

    .line 21
    .line 22
    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const-string v1, "T"

    .line 29
    .line 30
    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    iput-object p2, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public static match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/ClassLoader;Ljava/util/IdentityHashMap;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/IdentityHashMap<",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    if-ne p0, p2, :cond_0

    .line 13
    .line 14
    return v0

    .line 15
    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    return v1

    .line 23
    :cond_1
    instance-of p0, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 24
    .line 25
    if-eqz p0, :cond_4

    .line 26
    .line 27
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 28
    .line 29
    iget-object p0, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 30
    .line 31
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-ne p0, p2, :cond_2

    .line 42
    .line 43
    return v0

    .line 44
    :cond_2
    iget-object p0, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->keyType:Ljava/lang/reflect/Type;

    .line 45
    .line 46
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    if-eqz p0, :cond_3

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    if-ne p0, p2, :cond_3

    .line 57
    .line 58
    return v0

    .line 59
    :cond_3
    return v1

    .line 60
    :cond_4
    instance-of p0, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;

    .line 61
    .line 62
    if-eqz p0, :cond_6

    .line 63
    .line 64
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;

    .line 65
    .line 66
    iget-object p0, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->itemType:Ljava/lang/reflect/Type;

    .line 67
    .line 68
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-eqz p0, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, p2, :cond_5

    .line 79
    .line 80
    return v0

    .line 81
    :cond_5
    return v1

    .line 82
    :cond_6
    instance-of p0, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 83
    .line 84
    if-eqz p0, :cond_8

    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    invoke-virtual {p3, p1, p0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 91
    .line 92
    iget-object p1, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 93
    .line 94
    move v2, v1

    .line 95
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-ge v2, v3, :cond_8

    .line 100
    .line 101
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 106
    .line 107
    instance-of v4, v3, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 108
    .line 109
    if-eqz v4, :cond_7

    .line 110
    .line 111
    check-cast v3, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 112
    .line 113
    iget-object v3, v3, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 114
    .line 115
    invoke-static {p0, v3, p2, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/ClassLoader;Ljava/util/IdentityHashMap;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_7

    .line 120
    .line 121
    return v0

    .line 122
    :cond_7
    add-int/lit8 v2, v2, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_8
    return v1
.end method

.method private processAnnotations(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p2

    .line 3
    if-ge v0, v1, :cond_3

    .line 4
    .line 5
    aget-object v1, p2, v0

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-class v3, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 12
    .line 13
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-direct {p0, p1, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->loadFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/annotation/JSONField;)V

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "java.beans.Transient"

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    const-string v3, "com.alibaba.fastjson.annotation.JSONField"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-direct {p0, p1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->processJSONField1x(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/annotation/Annotation;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v1, 0x1

    .line 51
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 52
    .line 53
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->isTransient:Z

    .line 54
    .line 55
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    return-void
.end method

.method private processJSONField1x(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/annotation/Annotation;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/alibaba/fastjson2/reader/k;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2, p1}, Lcom/alibaba/fastjson2/reader/k;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/FieldInfo;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->annotationMethods(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public cleanup(Ljava/lang/Class;)V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->cleanupCache(Ljava/lang/Class;)V

    return-void
.end method

.method public cleanup(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/util/Map$Entry;

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-ne v1, p1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Ljava/util/Map$Entry;

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/reflect/Type;

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 77
    .line 78
    invoke-static {v3, v2, p1, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/ClassLoader;Ljava/util/IdentityHashMap;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/util/Map$Entry;

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    check-cast v3, Ljava/lang/reflect/Type;

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    check-cast v2, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 121
    .line 122
    invoke-static {v3, v2, p1, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->match(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/ClassLoader;Ljava/util/IdentityHashMap;)Z

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    if-eqz v2, :cond_4

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->cleanupCache(Ljava/lang/ClassLoader;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public cleanupMixIn()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final varargs configEnumAsJavaBean([Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Enum;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/SafeVarargs;
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    iget-object v3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->creator:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 8
    .line 9
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {p0, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->namingStrategy:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->NeverUseThisValueExceptDefaultValue:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->namingStrategy:Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-class v2, Ljava/lang/Object;

    .line 23
    .line 24
    if-eq v1, v2, :cond_2

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    const-class v2, Ljava/lang/Enum;

    .line 29
    .line 30
    if-eq v1, v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, p1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlsoNames:[Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    move v1, v0

    .line 44
    :goto_0
    iget-object v2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 45
    .line 46
    array-length v3, v2

    .line 47
    if-ge v1, v3, :cond_2

    .line 48
    .line 49
    aget-object v2, v2, v1

    .line 50
    .line 51
    if-ne v2, p2, :cond_1

    .line 52
    .line 53
    iget-object v2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlsoNames:[Ljava/lang/String;

    .line 54
    .line 55
    array-length v3, v2

    .line 56
    if-ge v1, v3, :cond_1

    .line 57
    .line 58
    aget-object v2, v2, v1

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    iput-object v2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/4 v2, 0x0

    .line 79
    move v4, v0

    .line 80
    move-object v3, v2

    .line 81
    :goto_2
    array-length v5, v1

    .line 82
    const-string v6, "com.alibaba.fastjson.annotation.JSONType"

    .line 83
    .line 84
    const-class v7, Lcom/alibaba/fastjson2/annotation/JSONType;

    .line 85
    .line 86
    if-ge v4, v5, :cond_5

    .line 87
    .line 88
    aget-object v2, v1, v4

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v2, v7}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    check-cast v7, Lcom/alibaba/fastjson2/annotation/JSONType;

    .line 99
    .line 100
    if-ne v7, v2, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-nez v5, :cond_4

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_4
    move-object v3, v2

    .line 115
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 116
    .line 117
    move-object v2, v7

    .line 118
    goto :goto_2

    .line 119
    :cond_5
    const/4 v1, 0x1

    .line 120
    if-nez v2, :cond_8

    .line 121
    .line 122
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 123
    .line 124
    invoke-interface {v4, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    check-cast v4, Ljava/lang/Class;

    .line 129
    .line 130
    if-eqz v4, :cond_8

    .line 131
    .line 132
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->mixIn:Z

    .line 133
    .line 134
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    move v5, v0

    .line 139
    :goto_4
    array-length v8, v4

    .line 140
    if-ge v5, v8, :cond_8

    .line 141
    .line 142
    aget-object v2, v4, v5

    .line 143
    .line 144
    invoke-interface {v2}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    invoke-static {v2, v7}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    check-cast v9, Lcom/alibaba/fastjson2/annotation/JSONType;

    .line 153
    .line 154
    if-ne v9, v2, :cond_6

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_6
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_7

    .line 166
    .line 167
    move-object v3, v2

    .line 168
    :cond_7
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 169
    .line 170
    move-object v2, v9

    .line 171
    goto :goto_4

    .line 172
    :cond_8
    if-eqz v2, :cond_16

    .line 173
    .line 174
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->seeAlso()[Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    array-length v4, v3

    .line 179
    if-eqz v4, :cond_9

    .line 180
    .line 181
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 182
    .line 183
    :cond_9
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->typeKey()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-nez v4, :cond_a

    .line 192
    .line 193
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 194
    .line 195
    :cond_a
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->typeName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-nez v4, :cond_b

    .line 204
    .line 205
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 206
    .line 207
    :cond_b
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->serializeFeatures()[Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    move v4, v0

    .line 212
    :goto_6
    array-length v5, v3

    .line 213
    if-ge v4, v5, :cond_c

    .line 214
    .line 215
    aget-object v5, v3, v4

    .line 216
    .line 217
    iget-wide v6, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->writerFeatures:J

    .line 218
    .line 219
    iget-wide v8, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 220
    .line 221
    or-long v5, v6, v8

    .line 222
    .line 223
    iput-wide v5, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->writerFeatures:J

    .line 224
    .line 225
    add-int/lit8 v4, v4, 0x1

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_c
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->naming()Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->namingStrategy:Ljava/lang/String;

    .line 237
    .line 238
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->ignores()[Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    array-length v4, v3

    .line 243
    if-lez v4, :cond_d

    .line 244
    .line 245
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->ignores:[Ljava/lang/String;

    .line 246
    .line 247
    :cond_d
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->includes()[Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    array-length v4, v3

    .line 252
    if-lez v4, :cond_e

    .line 253
    .line 254
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->includes:[Ljava/lang/String;

    .line 255
    .line 256
    :cond_e
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->orders()[Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    array-length v4, v3

    .line 261
    if-lez v4, :cond_f

    .line 262
    .line 263
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->orders:[Ljava/lang/String;

    .line 264
    .line 265
    :cond_f
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->serializer()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    const-class v4, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 270
    .line 271
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    if-eqz v4, :cond_10

    .line 276
    .line 277
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->serializer:Ljava/lang/Class;

    .line 278
    .line 279
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->writeEnumAsJavaBean:Z

    .line 280
    .line 281
    :cond_10
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->serializeFilters()[Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    array-length v4, v3

    .line 286
    if-eqz v4, :cond_11

    .line 287
    .line 288
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->serializeFilters:[Ljava/lang/Class;

    .line 289
    .line 290
    :cond_11
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->format()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v3

    .line 294
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-nez v4, :cond_12

    .line 299
    .line 300
    iput-object v3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 301
    .line 302
    :cond_12
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->locale()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-nez v4, :cond_13

    .line 311
    .line 312
    const-string v4, "_"

    .line 313
    .line 314
    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    array-length v4, v3

    .line 319
    const/4 v5, 0x2

    .line 320
    if-ne v4, v5, :cond_13

    .line 321
    .line 322
    new-instance v4, Ljava/util/Locale;

    .line 323
    .line 324
    aget-object v5, v3, v0

    .line 325
    .line 326
    aget-object v3, v3, v1

    .line 327
    .line 328
    invoke-direct {v4, v5, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iput-object v4, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 332
    .line 333
    :cond_13
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->alphabetic()Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-nez v3, :cond_14

    .line 338
    .line 339
    iput-boolean v0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->alphabetic:Z

    .line 340
    .line 341
    :cond_14
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->writeEnumAsJavaBean()Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    if-eqz v3, :cond_15

    .line 346
    .line 347
    iput-boolean v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->writeEnumAsJavaBean:Z

    .line 348
    .line 349
    :cond_15
    invoke-interface {v2}, Lcom/alibaba/fastjson2/annotation/JSONType;->rootName()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-nez v2, :cond_17

    .line 358
    .line 359
    iput-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->rootName:Ljava/lang/String;

    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_16
    if-eqz v3, :cond_17

    .line 363
    .line 364
    invoke-interface {v3}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    new-instance v2, Lcom/alibaba/fastjson2/reader/g;

    .line 369
    .line 370
    const/4 v4, 0x4

    .line 371
    invoke-direct {v2, p1, v3, v4}, Lcom/alibaba/fastjson2/reader/g;-><init>(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;I)V

    .line 372
    .line 373
    .line 374
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->annotationMethods(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 375
    .line 376
    .line 377
    :cond_17
    :goto_7
    iget-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 378
    .line 379
    if-eqz v1, :cond_1a

    .line 380
    .line 381
    array-length v1, v1

    .line 382
    if-eqz v1, :cond_1a

    .line 383
    .line 384
    iget-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 385
    .line 386
    if-eqz v1, :cond_18

    .line 387
    .line 388
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 389
    .line 390
    .line 391
    move-result v1

    .line 392
    if-nez v1, :cond_1a

    .line 393
    .line 394
    :cond_18
    iget-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 395
    .line 396
    array-length v2, v1

    .line 397
    :goto_8
    if-ge v0, v2, :cond_1a

    .line 398
    .line 399
    aget-object v3, v1, v0

    .line 400
    .line 401
    if-ne v3, p2, :cond_19

    .line 402
    .line 403
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p2

    .line 407
    iput-object p2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 408
    .line 409
    return-void

    .line 410
    :cond_19
    add-int/lit8 v0, v0, 0x1

    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_1a
    return-void
.end method

.method public getExternalObjectWriter(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "java.sql.Time"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    const-string v0, "java.sql.Timestamp"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    const-class p1, Ljava/sql/Clob;

    .line 22
    .line 23
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    new-instance p1, Lcom/alibaba/fastjson2/util/JdbcSupport$ClobWriter;

    .line 30
    .line 31
    invoke-direct {p1}, Lcom/alibaba/fastjson2/util/JdbcSupport$ClobWriter;-><init>()V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    return-object v1

    .line 36
    :cond_1
    new-instance p1, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampWriter;

    .line 37
    .line 38
    invoke-direct {p1, v1}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampWriter;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_2
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
.end method

.method public getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 5
    .line 6
    invoke-interface {v1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/Class;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    if-eq v1, p3, :cond_0

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {p4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-virtual {v1, p3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 21
    .line 22
    .line 23
    move-result-object p3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-object p3, v0

    .line 26
    :goto_0
    if-eqz p3, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0, p1, p2, v1, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 32
    .line 33
    invoke-virtual {p4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Ljava/lang/Class;

    .line 42
    .line 43
    const/4 p3, 0x1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iput-boolean p3, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldClassMixIn:Z

    .line 47
    .line 48
    :cond_1
    invoke-virtual {p4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    iput-boolean p3, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 59
    .line 60
    iput-boolean p3, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->isTransient:Z

    .line 61
    .line 62
    :cond_2
    invoke-virtual {p4}, Ljava/lang/reflect/Field;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const/4 p3, 0x0

    .line 67
    :goto_1
    array-length v1, p1

    .line 68
    if-ge p3, v1, :cond_5

    .line 69
    .line 70
    aget-object v1, p1, p3

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-nez v0, :cond_3

    .line 77
    .line 78
    const-class v0, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 79
    .line 80
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->findAnnotation(Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 85
    .line 86
    if-ne v0, v1, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const-string v3, "com.alibaba.fastjson.annotation.JSONField"

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_4

    .line 100
    .line 101
    invoke-direct {p0, p2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->processJSONField1x(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/annotation/Annotation;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    :goto_2
    add-int/lit8 p3, p3, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    if-nez v0, :cond_6

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_6
    invoke-direct {p0, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->loadFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/annotation/JSONField;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Lcom/alibaba/fastjson2/annotation/JSONField;->writeUsing()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-class p3, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 118
    .line 119
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-eqz v1, :cond_7

    .line 124
    .line 125
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 126
    .line 127
    :cond_7
    invoke-interface {v0}, Lcom/alibaba/fastjson2/annotation/JSONField;->serializeUsing()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 132
    .line 133
    .line 134
    move-result p3

    .line 135
    if-eqz p3, :cond_8

    .line 136
    .line 137
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 138
    .line 139
    :cond_8
    invoke-interface {v0}, Lcom/alibaba/fastjson2/annotation/JSONField;->jsonDirect()Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_9

    .line 144
    .line 145
    iget-wide v1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 146
    .line 147
    const-wide/high16 v3, 0x4000000000000L

    .line 148
    .line 149
    or-long/2addr v1, v3

    .line 150
    iput-wide v1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 151
    .line 152
    :cond_9
    iget-wide v1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 153
    .line 154
    sget-object p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringValueAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 155
    .line 156
    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 157
    .line 158
    and-long/2addr v1, v3

    .line 159
    const-wide/16 v3, 0x0

    .line 160
    .line 161
    cmp-long p1, v1, v3

    .line 162
    .line 163
    if-eqz p1, :cond_a

    .line 164
    .line 165
    const-class p1, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    invoke-virtual {p1, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    if-nez p1, :cond_a

    .line 176
    .line 177
    iget-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 178
    .line 179
    if-nez p1, :cond_a

    .line 180
    .line 181
    const-class p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;

    .line 182
    .line 183
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 184
    .line 185
    :cond_a
    invoke-interface {v0}, Lcom/alibaba/fastjson2/annotation/JSONField;->contentAs()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-class p3, Ljava/lang/Void;

    .line 190
    .line 191
    if-eq p1, p3, :cond_b

    .line 192
    .line 193
    iput-object p1, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->contentAs:Ljava/lang/Class;

    .line 194
    .line 195
    :cond_b
    :goto_3
    return-void
.end method

.method public getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 7

    .line 196
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    .line 197
    invoke-virtual {p4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    if-eq v0, p3, :cond_0

    .line 198
    :try_start_0
    invoke-virtual {p4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_0

    .line 199
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-virtual {p4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 201
    iput-boolean v0, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldClassMixIn:Z

    :cond_1
    const/4 v0, 0x0

    if-eqz p3, :cond_4

    .line 202
    invoke-virtual {p3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    .line 203
    invoke-static {v1, p4}, Lcom/alibaba/fastjson2/util/BeanUtils;->getMethod(Ljava/lang/Class;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 204
    invoke-virtual {p0, p1, p2, v1, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 205
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v3

    move v4, v0

    .line 206
    :goto_1
    array-length v5, v3

    if-ge v4, v5, :cond_4

    .line 207
    aget-object v5, v3, v4

    invoke-static {v5, p4}, Lcom/alibaba/fastjson2/util/BeanUtils;->getMethod(Ljava/lang/Class;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Method;

    move-result-object v5

    if-eqz v5, :cond_3

    .line 208
    invoke-virtual {p0, p1, p2, v1, v5}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 209
    :cond_4
    invoke-virtual {p4}, Ljava/lang/reflect/Method;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    .line 210
    invoke-direct {p0, p2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->processAnnotations(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V

    .line 211
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "java.lang"

    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v1

    if-nez v1, :cond_5

    .line 212
    invoke-static {p3, p4}, Lcom/alibaba/fastjson2/util/BeanUtils;->getField(Ljava/lang/Class;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Field;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 213
    iget-wide v3, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    const-wide/high16 v5, 0x10000000000000L

    or-long/2addr v3, v5

    iput-wide v3, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 214
    invoke-virtual {p0, p1, p2, p3, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 215
    :cond_5
    iget-boolean p3, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->kotlin:Z

    if-eqz p3, :cond_7

    iget-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    if-eqz v1, :cond_7

    iget-object v1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;

    if-eqz v1, :cond_7

    .line 216
    invoke-static {p4, p3, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/reflect/Method;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object p3

    .line 217
    :goto_2
    iget-object p4, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;

    array-length v1, p4

    if-ge v0, v1, :cond_7

    .line 218
    aget-object p4, p4, v0

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_6

    .line 219
    iget-object p4, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 220
    invoke-virtual {p4}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object p4

    .line 221
    array-length v1, p4

    if-ge v0, v1, :cond_6

    .line 222
    aget-object p1, p4, v0

    .line 223
    invoke-direct {p0, p2, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->processAnnotations(Lcom/alibaba/fastjson2/codec/FieldInfo;[Ljava/lang/annotation/Annotation;)V

    goto :goto_3

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    :goto_3
    return-void
.end method

.method public getMixIn(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Class;

    .line 8
    .line 9
    return-object p1
.end method

.method public getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    const/4 v0, 0x0

    .line 203
    invoke-virtual {p0, p1, p1, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1
.end method

.method public getObjectWriter(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 2

    .line 201
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 202
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1
.end method

.method public getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    const/4 v0, 0x0

    .line 200
    invoke-virtual {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1
.end method

.method public getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v0, v0, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    if-eqz p3, :cond_1

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-class v1, Ljava/lang/Object;

    .line 29
    .line 30
    if-eq v0, v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "com.google.protobuf.GeneratedMessageV3"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    const/4 p3, 0x0

    .line 45
    :cond_1
    if-eqz p3, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 48
    .line 49
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 57
    .line 58
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 63
    .line 64
    :goto_0
    if-eqz v0, :cond_3

    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_3
    if-eqz p3, :cond_4

    .line 68
    .line 69
    const-class v1, Ljava/lang/Iterable;

    .line 70
    .line 71
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    const-class v1, Ljava/util/Collection;

    .line 78
    .line 79
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriterModule(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    if-eqz p3, :cond_5

    .line 93
    .line 94
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 95
    .line 96
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 104
    .line 105
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 110
    .line 111
    :goto_1
    if-eqz p1, :cond_6

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_6
    return-object v0

    .line 115
    :cond_7
    :goto_2
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v2, "android.net.Uri$HierarchicalUri"

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_9

    .line 126
    .line 127
    const-string v2, "android.net.Uri$StringUri"

    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-nez v2, :cond_9

    .line 134
    .line 135
    const-string v2, "com.alibaba.fastjson.JSONObject"

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-nez v2, :cond_8

    .line 142
    .line 143
    const-string v2, "android.net.Uri$OpaqueUri"

    .line 144
    .line 145
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_9

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_8
    invoke-static {p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    goto :goto_3

    .line 157
    :cond_9
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;

    .line 158
    .line 159
    :goto_3
    if-nez v0, :cond_d

    .line 160
    .line 161
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->creator:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 162
    .line 163
    if-eqz p3, :cond_a

    .line 164
    .line 165
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 166
    .line 167
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_a
    const-wide/16 v1, 0x0

    .line 171
    .line 172
    :goto_4
    invoke-virtual {v0, p2, v1, v2, p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createObjectWriter(Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    if-eqz p3, :cond_b

    .line 177
    .line 178
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 179
    .line 180
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_b
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 188
    .line 189
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 194
    .line 195
    :goto_5
    if-eqz p1, :cond_c

    .line 196
    .line 197
    return-object p1

    .line 198
    :cond_c
    return-object p2

    .line 199
    :cond_d
    return-object v0
.end method

.method public getObjectWriterFromCache(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 13
    .line 14
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 19
    .line 20
    return-object p1
.end method

.method public getObjectWriterModule(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-class v2, Ljava/lang/String;

    .line 6
    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplString;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplString;

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    if-nez p2, :cond_2

    .line 13
    .line 14
    instance-of v3, v1, Ljava/lang/Class;

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    move-object v3, v1

    .line 19
    check-cast v3, Ljava/lang/Class;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move-object/from16 v3, p2

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v0, v4, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getExternalObjectWriter(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    return-object v5

    .line 40
    :cond_3
    const-string v5, "java.util.regex.Pattern"

    .line 41
    .line 42
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-nez v5, :cond_5e

    .line 47
    .line 48
    const-string v5, "net.sf.json.JSONNull"

    .line 49
    .line 50
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_5e

    .line 55
    .line 56
    const-string v5, "java.net.Inet6Address"

    .line 57
    .line 58
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_5e

    .line 63
    .line 64
    const-string v5, "java.net.Inet4Address"

    .line 65
    .line 66
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-nez v5, :cond_5e

    .line 71
    .line 72
    const-string v5, "java.text.SimpleDateFormat"

    .line 73
    .line 74
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-nez v5, :cond_5e

    .line 79
    .line 80
    const-string v5, "java.net.InetSocketAddress"

    .line 81
    .line 82
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-nez v4, :cond_5e

    .line 87
    .line 88
    instance-of v4, v1, Ljava/lang/reflect/ParameterizedType;

    .line 89
    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x1

    .line 92
    const-class v7, Ljava/util/Map;

    .line 93
    .line 94
    const-class v8, Ljava/util/ArrayList;

    .line 95
    .line 96
    const-class v9, Ljava/util/List;

    .line 97
    .line 98
    if-eqz v4, :cond_7

    .line 99
    .line 100
    move-object v4, v1

    .line 101
    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 102
    .line 103
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    if-eq v10, v9, :cond_4

    .line 112
    .line 113
    if-ne v10, v8, :cond_6

    .line 114
    .line 115
    :cond_4
    array-length v1, v4

    .line 116
    if-ne v1, v6, :cond_5

    .line 117
    .line 118
    aget-object v1, v4, v5

    .line 119
    .line 120
    if-ne v1, v2, :cond_5

    .line 121
    .line 122
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplListStr;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplListStr;

    .line 123
    .line 124
    return-object v1

    .line 125
    :cond_5
    move-object v1, v10

    .line 126
    :cond_6
    invoke-virtual {v7, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_7

    .line 131
    .line 132
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    return-object v1

    .line 137
    :cond_7
    const-class v4, Ljava/util/LinkedList;

    .line 138
    .line 139
    if-ne v1, v4, :cond_8

    .line 140
    .line 141
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_8
    if-eq v1, v8, :cond_5d

    .line 145
    .line 146
    if-eq v1, v9, :cond_5d

    .line 147
    .line 148
    invoke-virtual {v9, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_9

    .line 153
    .line 154
    goto/16 :goto_b

    .line 155
    .line 156
    :cond_9
    const-class v4, Ljava/util/Collection;

    .line 157
    .line 158
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_a

    .line 163
    .line 164
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCollection;

    .line 165
    .line 166
    return-object v1

    .line 167
    :cond_a
    invoke-virtual {v7, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-eqz v4, :cond_b

    .line 172
    .line 173
    invoke-static {v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    return-object v1

    .line 178
    :cond_b
    const-class v4, Ljava/util/Map$Entry;

    .line 179
    .line 180
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-eqz v4, :cond_c

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    const-string v4, "java.util"

    .line 191
    .line 192
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_c

    .line 197
    .line 198
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMapEntry;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMapEntry;

    .line 199
    .line 200
    return-object v1

    .line 201
    :cond_c
    const-class v3, Ljava/lang/Integer;

    .line 202
    .line 203
    if-ne v1, v3, :cond_d

    .line 204
    .line 205
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt32;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt32;

    .line 206
    .line 207
    return-object v1

    .line 208
    :cond_d
    const-class v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 209
    .line 210
    if-ne v1, v3, :cond_e

    .line 211
    .line 212
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicInteger;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicInteger;

    .line 213
    .line 214
    return-object v1

    .line 215
    :cond_e
    const-class v3, Ljava/lang/Byte;

    .line 216
    .line 217
    if-ne v1, v3, :cond_f

    .line 218
    .line 219
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt8;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt8;

    .line 220
    .line 221
    return-object v1

    .line 222
    :cond_f
    const-class v3, Ljava/lang/Short;

    .line 223
    .line 224
    if-ne v1, v3, :cond_10

    .line 225
    .line 226
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt16;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt16;

    .line 227
    .line 228
    return-object v1

    .line 229
    :cond_10
    const-class v3, Ljava/lang/Long;

    .line 230
    .line 231
    if-ne v1, v3, :cond_11

    .line 232
    .line 233
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64;

    .line 234
    .line 235
    return-object v1

    .line 236
    :cond_11
    const-class v3, Ljava/util/concurrent/atomic/AtomicLong;

    .line 237
    .line 238
    if-ne v1, v3, :cond_12

    .line 239
    .line 240
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicLong;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicLong;

    .line 241
    .line 242
    return-object v1

    .line 243
    :cond_12
    const-class v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 244
    .line 245
    if-ne v1, v3, :cond_13

    .line 246
    .line 247
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicReference;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicReference;

    .line 248
    .line 249
    return-object v1

    .line 250
    :cond_13
    const-class v3, Ljava/lang/Float;

    .line 251
    .line 252
    if-ne v1, v3, :cond_14

    .line 253
    .line 254
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloat;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloat;

    .line 255
    .line 256
    return-object v1

    .line 257
    :cond_14
    const-class v3, Ljava/lang/Double;

    .line 258
    .line 259
    if-ne v1, v3, :cond_15

    .line 260
    .line 261
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDouble;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDouble;

    .line 262
    .line 263
    return-object v1

    .line 264
    :cond_15
    const-class v3, Ljava/math/BigInteger;

    .line 265
    .line 266
    if-ne v1, v3, :cond_16

    .line 267
    .line 268
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterBigInteger;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterBigInteger;

    .line 269
    .line 270
    return-object v1

    .line 271
    :cond_16
    const-class v3, Ljava/math/BigDecimal;

    .line 272
    .line 273
    if-ne v1, v3, :cond_17

    .line 274
    .line 275
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;

    .line 276
    .line 277
    return-object v1

    .line 278
    :cond_17
    const-class v3, Ljava/util/OptionalInt;

    .line 279
    .line 280
    if-ne v1, v3, :cond_18

    .line 281
    .line 282
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptionalInt;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptionalInt;

    .line 283
    .line 284
    return-object v1

    .line 285
    :cond_18
    const-class v3, Ljava/util/OptionalLong;

    .line 286
    .line 287
    if-ne v1, v3, :cond_19

    .line 288
    .line 289
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptionalLong;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptionalLong;

    .line 290
    .line 291
    return-object v1

    .line 292
    :cond_19
    const-class v3, Ljava/util/OptionalDouble;

    .line 293
    .line 294
    if-ne v1, v3, :cond_1a

    .line 295
    .line 296
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptionalDouble;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptionalDouble;

    .line 297
    .line 298
    return-object v1

    .line 299
    :cond_1a
    const-class v3, Ljava/util/Optional;

    .line 300
    .line 301
    if-ne v1, v3, :cond_1b

    .line 302
    .line 303
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptional;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOptional;

    .line 304
    .line 305
    return-object v1

    .line 306
    :cond_1b
    const-class v3, Ljava/lang/Boolean;

    .line 307
    .line 308
    if-ne v1, v3, :cond_1c

    .line 309
    .line 310
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBoolean;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplBoolean;

    .line 311
    .line 312
    return-object v1

    .line 313
    :cond_1c
    const-class v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 314
    .line 315
    if-ne v1, v3, :cond_1d

    .line 316
    .line 317
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicBoolean;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicBoolean;

    .line 318
    .line 319
    return-object v1

    .line 320
    :cond_1d
    const-class v3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 321
    .line 322
    if-ne v1, v3, :cond_1e

    .line 323
    .line 324
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicIntegerArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicIntegerArray;

    .line 325
    .line 326
    return-object v1

    .line 327
    :cond_1e
    const-class v3, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 328
    .line 329
    if-ne v1, v3, :cond_1f

    .line 330
    .line 331
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicLongArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplAtomicLongArray;

    .line 332
    .line 333
    return-object v1

    .line 334
    :cond_1f
    const-class v3, Ljava/lang/Character;

    .line 335
    .line 336
    if-ne v1, v3, :cond_20

    .line 337
    .line 338
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCharacter;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCharacter;

    .line 339
    .line 340
    return-object v1

    .line 341
    :cond_20
    instance-of v3, v1, Ljava/lang/Class;

    .line 342
    .line 343
    const/4 v4, 0x0

    .line 344
    if-eqz v3, :cond_5c

    .line 345
    .line 346
    check-cast v1, Ljava/lang/Class;

    .line 347
    .line 348
    const-class v3, Ljava/util/concurrent/TimeUnit;

    .line 349
    .line 350
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    if-eqz v3, :cond_21

    .line 355
    .line 356
    new-instance v7, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;

    .line 357
    .line 358
    const/4 v11, 0x0

    .line 359
    const-wide/16 v12, 0x0

    .line 360
    .line 361
    const/4 v8, 0x0

    .line 362
    const-class v9, Ljava/util/concurrent/TimeUnit;

    .line 363
    .line 364
    const/4 v10, 0x0

    .line 365
    invoke-direct/range {v7 .. v13}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Member;[Ljava/lang/String;J)V

    .line 366
    .line 367
    .line 368
    return-object v7

    .line 369
    :cond_21
    const-class v3, Ljava/lang/Enum;

    .line 370
    .line 371
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-eqz v3, :cond_22

    .line 376
    .line 377
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->createEnumWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    if-eqz v3, :cond_22

    .line 382
    .line 383
    return-object v3

    .line 384
    :cond_22
    const-class v3, Lcom/alibaba/fastjson2/JSONPath;

    .line 385
    .line 386
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 387
    .line 388
    .line 389
    move-result v3

    .line 390
    if-eqz v3, :cond_23

    .line 391
    .line 392
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;

    .line 393
    .line 394
    return-object v1

    .line 395
    :cond_23
    const-class v3, [Z

    .line 396
    .line 397
    if-ne v1, v3, :cond_24

    .line 398
    .line 399
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBoolValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplBoolValueArray;

    .line 400
    .line 401
    return-object v1

    .line 402
    :cond_24
    const-class v3, [C

    .line 403
    .line 404
    if-ne v1, v3, :cond_25

    .line 405
    .line 406
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCharValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCharValueArray;

    .line 407
    .line 408
    return-object v1

    .line 409
    :cond_25
    const-class v3, Ljava/lang/StringBuffer;

    .line 410
    .line 411
    if-eq v1, v3, :cond_5b

    .line 412
    .line 413
    const-class v3, Ljava/lang/StringBuilder;

    .line 414
    .line 415
    if-ne v1, v3, :cond_26

    .line 416
    .line 417
    goto/16 :goto_a

    .line 418
    .line 419
    :cond_26
    const-class v3, [B

    .line 420
    .line 421
    if-ne v1, v3, :cond_27

    .line 422
    .line 423
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt8ValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt8ValueArray;

    .line 424
    .line 425
    return-object v1

    .line 426
    :cond_27
    const-class v3, [S

    .line 427
    .line 428
    if-ne v1, v3, :cond_28

    .line 429
    .line 430
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt16ValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt16ValueArray;

    .line 431
    .line 432
    return-object v1

    .line 433
    :cond_28
    const-class v3, [I

    .line 434
    .line 435
    if-ne v1, v3, :cond_29

    .line 436
    .line 437
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt32ValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt32ValueArray;

    .line 438
    .line 439
    return-object v1

    .line 440
    :cond_29
    const-class v3, [J

    .line 441
    .line 442
    if-ne v1, v3, :cond_2a

    .line 443
    .line 444
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64ValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64ValueArray;

    .line 445
    .line 446
    return-object v1

    .line 447
    :cond_2a
    const-class v3, [F

    .line 448
    .line 449
    if-ne v1, v3, :cond_2b

    .line 450
    .line 451
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloatValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloatValueArray;

    .line 452
    .line 453
    return-object v1

    .line 454
    :cond_2b
    const-class v3, [D

    .line 455
    .line 456
    if-ne v1, v3, :cond_2c

    .line 457
    .line 458
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDoubleValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDoubleValueArray;

    .line 459
    .line 460
    return-object v1

    .line 461
    :cond_2c
    const-class v3, [Ljava/lang/Byte;

    .line 462
    .line 463
    if-ne v1, v3, :cond_2d

    .line 464
    .line 465
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt8Array;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt8Array;

    .line 466
    .line 467
    return-object v1

    .line 468
    :cond_2d
    const-class v3, [Ljava/lang/Integer;

    .line 469
    .line 470
    if-ne v1, v3, :cond_2e

    .line 471
    .line 472
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt32Array;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt32Array;

    .line 473
    .line 474
    return-object v1

    .line 475
    :cond_2e
    const-class v3, [Ljava/lang/Long;

    .line 476
    .line 477
    if-ne v1, v3, :cond_2f

    .line 478
    .line 479
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64Array;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64Array;

    .line 480
    .line 481
    return-object v1

    .line 482
    :cond_2f
    const-class v3, [Ljava/lang/String;

    .line 483
    .line 484
    if-ne v3, v1, :cond_30

    .line 485
    .line 486
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplStringArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplStringArray;

    .line 487
    .line 488
    return-object v1

    .line 489
    :cond_30
    const-class v3, [Ljava/math/BigDecimal;

    .line 490
    .line 491
    if-ne v3, v1, :cond_31

    .line 492
    .line 493
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImpDecimalArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImpDecimalArray;

    .line 494
    .line 495
    return-object v1

    .line 496
    :cond_31
    const-class v3, [Ljava/lang/Object;

    .line 497
    .line 498
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 499
    .line 500
    .line 501
    move-result v7

    .line 502
    if-eqz v7, :cond_34

    .line 503
    .line 504
    if-ne v1, v3, :cond_32

    .line 505
    .line 506
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterArray;

    .line 507
    .line 508
    return-object v1

    .line 509
    :cond_32
    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    if-eqz v2, :cond_33

    .line 522
    .line 523
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 524
    .line 525
    invoke-direct {v2, v1, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 526
    .line 527
    .line 528
    return-object v2

    .line 529
    :cond_33
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;

    .line 530
    .line 531
    invoke-direct {v2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterArray;-><init>(Ljava/lang/reflect/Type;)V

    .line 532
    .line 533
    .line 534
    return-object v2

    .line 535
    :cond_34
    const-class v3, Ljava/util/UUID;

    .line 536
    .line 537
    if-ne v1, v3, :cond_35

    .line 538
    .line 539
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplUUID;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplUUID;

    .line 540
    .line 541
    return-object v1

    .line 542
    :cond_35
    const-class v3, Ljava/util/Locale;

    .line 543
    .line 544
    if-ne v1, v3, :cond_36

    .line 545
    .line 546
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocale;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocale;

    .line 547
    .line 548
    return-object v1

    .line 549
    :cond_36
    const-class v3, Ljava/util/Currency;

    .line 550
    .line 551
    if-ne v1, v3, :cond_37

    .line 552
    .line 553
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCurrency;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCurrency;

    .line 554
    .line 555
    return-object v1

    .line 556
    :cond_37
    const-class v3, Ljava/util/TimeZone;

    .line 557
    .line 558
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 559
    .line 560
    .line 561
    move-result v3

    .line 562
    if-eqz v3, :cond_38

    .line 563
    .line 564
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplTimeZone;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplTimeZone;

    .line 565
    .line 566
    return-object v1

    .line 567
    :cond_38
    const-class v3, Ljava/net/URI;

    .line 568
    .line 569
    if-eq v1, v3, :cond_5a

    .line 570
    .line 571
    const-class v3, Ljava/net/URL;

    .line 572
    .line 573
    if-eq v1, v3, :cond_5a

    .line 574
    .line 575
    const-class v3, Ljava/io/File;

    .line 576
    .line 577
    if-eq v1, v3, :cond_5a

    .line 578
    .line 579
    const-class v3, Ljava/time/ZoneId;

    .line 580
    .line 581
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 582
    .line 583
    .line 584
    move-result v3

    .line 585
    if-nez v3, :cond_5a

    .line 586
    .line 587
    const-class v3, Ljava/nio/charset/Charset;

    .line 588
    .line 589
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    if-eqz v3, :cond_39

    .line 594
    .line 595
    goto/16 :goto_9

    .line 596
    .line 597
    :cond_39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    invoke-virtual {v0, v3, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getExternalObjectWriter(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 602
    .line 603
    .line 604
    move-result-object v3

    .line 605
    if-eqz v3, :cond_3a

    .line 606
    .line 607
    return-object v3

    .line 608
    :cond_3a
    new-instance v3, Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 609
    .line 610
    invoke-direct {v3}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getMixIn(Ljava/lang/Class;)Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    if-eqz v7, :cond_3b

    .line 618
    .line 619
    invoke-virtual {v0, v3, v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 620
    .line 621
    .line 622
    :cond_3b
    const-class v7, Ljava/util/Date;

    .line 623
    .line 624
    invoke-virtual {v7, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 625
    .line 626
    .line 627
    move-result v7

    .line 628
    if-eqz v7, :cond_3e

    .line 629
    .line 630
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 631
    .line 632
    if-nez v1, :cond_3d

    .line 633
    .line 634
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 635
    .line 636
    if-eqz v1, :cond_3c

    .line 637
    .line 638
    goto :goto_1

    .line 639
    :cond_3c
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 640
    .line 641
    return-object v1

    .line 642
    :cond_3d
    :goto_1
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 643
    .line 644
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 645
    .line 646
    iget-object v3, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 647
    .line 648
    invoke-direct {v1, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 649
    .line 650
    .line 651
    return-object v1

    .line 652
    :cond_3e
    const-class v7, Ljava/util/Calendar;

    .line 653
    .line 654
    invoke-virtual {v7, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 655
    .line 656
    .line 657
    move-result v7

    .line 658
    if-eqz v7, :cond_41

    .line 659
    .line 660
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 661
    .line 662
    if-nez v1, :cond_40

    .line 663
    .line 664
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 665
    .line 666
    if-eqz v1, :cond_3f

    .line 667
    .line 668
    goto :goto_2

    .line 669
    :cond_3f
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;

    .line 670
    .line 671
    return-object v1

    .line 672
    :cond_40
    :goto_2
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;

    .line 673
    .line 674
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 675
    .line 676
    iget-object v3, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 677
    .line 678
    invoke-direct {v1, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 679
    .line 680
    .line 681
    return-object v1

    .line 682
    :cond_41
    const-class v7, Ljava/time/ZonedDateTime;

    .line 683
    .line 684
    if-ne v7, v1, :cond_44

    .line 685
    .line 686
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 687
    .line 688
    if-nez v1, :cond_43

    .line 689
    .line 690
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 691
    .line 692
    if-eqz v1, :cond_42

    .line 693
    .line 694
    goto :goto_3

    .line 695
    :cond_42
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;

    .line 696
    .line 697
    return-object v1

    .line 698
    :cond_43
    :goto_3
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;

    .line 699
    .line 700
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 701
    .line 702
    iget-object v3, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 703
    .line 704
    invoke-direct {v1, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 705
    .line 706
    .line 707
    return-object v1

    .line 708
    :cond_44
    const-class v7, Ljava/time/OffsetDateTime;

    .line 709
    .line 710
    if-ne v7, v1, :cond_45

    .line 711
    .line 712
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 713
    .line 714
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 715
    .line 716
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;

    .line 717
    .line 718
    .line 719
    move-result-object v1

    .line 720
    return-object v1

    .line 721
    :cond_45
    const-class v7, Ljava/time/LocalDateTime;

    .line 722
    .line 723
    if-ne v7, v1, :cond_48

    .line 724
    .line 725
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 726
    .line 727
    if-nez v1, :cond_47

    .line 728
    .line 729
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 730
    .line 731
    if-eqz v1, :cond_46

    .line 732
    .line 733
    goto :goto_4

    .line 734
    :cond_46
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;

    .line 735
    .line 736
    return-object v1

    .line 737
    :cond_47
    :goto_4
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;

    .line 738
    .line 739
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 740
    .line 741
    iget-object v3, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 742
    .line 743
    invoke-direct {v1, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 744
    .line 745
    .line 746
    return-object v1

    .line 747
    :cond_48
    const-class v7, Ljava/time/LocalDate;

    .line 748
    .line 749
    if-ne v7, v1, :cond_49

    .line 750
    .line 751
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 752
    .line 753
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 754
    .line 755
    invoke-static {v1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;->of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    return-object v1

    .line 760
    :cond_49
    const-class v7, Ljava/time/LocalTime;

    .line 761
    .line 762
    if-ne v7, v1, :cond_4c

    .line 763
    .line 764
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 765
    .line 766
    if-nez v1, :cond_4b

    .line 767
    .line 768
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 769
    .line 770
    if-eqz v1, :cond_4a

    .line 771
    .line 772
    goto :goto_5

    .line 773
    :cond_4a
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;

    .line 774
    .line 775
    return-object v1

    .line 776
    :cond_4b
    :goto_5
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;

    .line 777
    .line 778
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 779
    .line 780
    iget-object v3, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 781
    .line 782
    invoke-direct {v1, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 783
    .line 784
    .line 785
    return-object v1

    .line 786
    :cond_4c
    const-class v7, Ljava/time/OffsetTime;

    .line 787
    .line 788
    if-ne v7, v1, :cond_4f

    .line 789
    .line 790
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 791
    .line 792
    if-nez v1, :cond_4e

    .line 793
    .line 794
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 795
    .line 796
    if-eqz v1, :cond_4d

    .line 797
    .line 798
    goto :goto_6

    .line 799
    :cond_4d
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetTime;

    .line 800
    .line 801
    return-object v1

    .line 802
    :cond_4e
    :goto_6
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetTime;

    .line 803
    .line 804
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 805
    .line 806
    iget-object v3, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 807
    .line 808
    invoke-direct {v1, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 809
    .line 810
    .line 811
    return-object v1

    .line 812
    :cond_4f
    const-class v7, Ljava/time/Instant;

    .line 813
    .line 814
    if-ne v7, v1, :cond_52

    .line 815
    .line 816
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 817
    .line 818
    if-nez v1, :cond_51

    .line 819
    .line 820
    iget-object v1, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 821
    .line 822
    if-eqz v1, :cond_50

    .line 823
    .line 824
    goto :goto_7

    .line 825
    :cond_50
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;

    .line 826
    .line 827
    return-object v1

    .line 828
    :cond_51
    :goto_7
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;

    .line 829
    .line 830
    iget-object v2, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 831
    .line 832
    iget-object v3, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->locale:Ljava/util/Locale;

    .line 833
    .line 834
    invoke-direct {v1, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInstant;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 835
    .line 836
    .line 837
    return-object v1

    .line 838
    :cond_52
    const-class v3, Ljava/time/Duration;

    .line 839
    .line 840
    if-eq v3, v1, :cond_59

    .line 841
    .line 842
    const-class v3, Ljava/time/Period;

    .line 843
    .line 844
    if-ne v3, v1, :cond_53

    .line 845
    .line 846
    goto/16 :goto_8

    .line 847
    .line 848
    :cond_53
    const-class v3, Ljava/lang/StackTraceElement;

    .line 849
    .line 850
    const/4 v7, 0x4

    .line 851
    if-ne v3, v1, :cond_55

    .line 852
    .line 853
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->STACK_TRACE_ELEMENT_WRITER:Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 854
    .line 855
    if-nez v1, :cond_54

    .line 856
    .line 857
    new-instance v8, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 858
    .line 859
    new-instance v1, Lcom/alibaba/fastjson2/writer/b;

    .line 860
    .line 861
    const/4 v3, 0x2

    .line 862
    invoke-direct {v1, v3}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 863
    .line 864
    .line 865
    const-string v3, "fileName"

    .line 866
    .line 867
    invoke-static {v3, v2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    new-instance v3, Lae/a;

    .line 872
    .line 873
    invoke-direct {v3, v7}, Lae/a;-><init>(I)V

    .line 874
    .line 875
    .line 876
    const-string v4, "lineNumber"

    .line 877
    .line 878
    invoke-static {v4, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/util/function/ToIntFunction;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 879
    .line 880
    .line 881
    move-result-object v3

    .line 882
    new-instance v4, Lcom/alibaba/fastjson2/writer/b;

    .line 883
    .line 884
    const/4 v5, 0x5

    .line 885
    invoke-direct {v4, v5}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 886
    .line 887
    .line 888
    const-string v5, "className"

    .line 889
    .line 890
    invoke-static {v5, v2, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    new-instance v5, Lcom/alibaba/fastjson2/writer/b;

    .line 895
    .line 896
    const/4 v6, 0x6

    .line 897
    invoke-direct {v5, v6}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 898
    .line 899
    .line 900
    const-string v6, "methodName"

    .line 901
    .line 902
    invoke-static {v6, v2, v5}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 903
    .line 904
    .line 905
    move-result-object v2

    .line 906
    filled-new-array {v1, v3, v4, v2}, [Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 911
    .line 912
    .line 913
    move-result-object v14

    .line 914
    const-class v9, Ljava/lang/StackTraceElement;

    .line 915
    .line 916
    const/4 v10, 0x0

    .line 917
    const/4 v11, 0x0

    .line 918
    const-wide/16 v12, 0x0

    .line 919
    .line 920
    invoke-direct/range {v8 .. v14}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 921
    .line 922
    .line 923
    sput-object v8, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->STACK_TRACE_ELEMENT_WRITER:Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 924
    .line 925
    :cond_54
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->STACK_TRACE_ELEMENT_WRITER:Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 926
    .line 927
    return-object v1

    .line 928
    :cond_55
    const-class v3, Ljava/lang/Class;

    .line 929
    .line 930
    if-ne v3, v1, :cond_56

    .line 931
    .line 932
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplClass;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplClass;

    .line 933
    .line 934
    return-object v1

    .line 935
    :cond_56
    const-class v8, Ljava/lang/reflect/Method;

    .line 936
    .line 937
    const-string v9, "name"

    .line 938
    .line 939
    const-string v10, "declaringClass"

    .line 940
    .line 941
    if-ne v8, v1, :cond_57

    .line 942
    .line 943
    new-instance v11, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 944
    .line 945
    new-instance v1, Lcom/alibaba/fastjson2/writer/b;

    .line 946
    .line 947
    const/4 v4, 0x7

    .line 948
    invoke-direct {v1, v4}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 949
    .line 950
    .line 951
    invoke-static {v10, v3, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 952
    .line 953
    .line 954
    move-result-object v1

    .line 955
    new-instance v3, Lcom/alibaba/fastjson2/writer/b;

    .line 956
    .line 957
    const/16 v4, 0x8

    .line 958
    .line 959
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 960
    .line 961
    .line 962
    invoke-static {v9, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 963
    .line 964
    .line 965
    move-result-object v2

    .line 966
    new-instance v3, Lcom/alibaba/fastjson2/writer/b;

    .line 967
    .line 968
    const/16 v4, 0x9

    .line 969
    .line 970
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 971
    .line 972
    .line 973
    const-string v4, "parameterTypes"

    .line 974
    .line 975
    const-class v5, [Ljava/lang/Class;

    .line 976
    .line 977
    invoke-static {v4, v5, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 978
    .line 979
    .line 980
    move-result-object v3

    .line 981
    filled-new-array {v1, v2, v3}, [Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 982
    .line 983
    .line 984
    move-result-object v1

    .line 985
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 986
    .line 987
    .line 988
    move-result-object v17

    .line 989
    const-class v12, Ljava/lang/reflect/Method;

    .line 990
    .line 991
    const/4 v13, 0x0

    .line 992
    const/4 v14, 0x0

    .line 993
    const-wide/16 v15, 0x0

    .line 994
    .line 995
    invoke-direct/range {v11 .. v17}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 996
    .line 997
    .line 998
    return-object v11

    .line 999
    :cond_57
    const-class v8, Ljava/lang/reflect/Field;

    .line 1000
    .line 1001
    if-ne v8, v1, :cond_58

    .line 1002
    .line 1003
    new-instance v11, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 1004
    .line 1005
    new-instance v1, Lae/d;

    .line 1006
    .line 1007
    const/16 v4, 0x1d

    .line 1008
    .line 1009
    invoke-direct {v1, v4}, Lae/d;-><init>(I)V

    .line 1010
    .line 1011
    .line 1012
    invoke-static {v10, v3, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    new-instance v3, Lcom/alibaba/fastjson2/writer/b;

    .line 1017
    .line 1018
    invoke-direct {v3, v5}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 1019
    .line 1020
    .line 1021
    invoke-static {v9, v2, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    filled-new-array {v1, v2}, [Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v1

    .line 1029
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v17

    .line 1033
    const-class v12, Ljava/lang/reflect/Method;

    .line 1034
    .line 1035
    const/4 v13, 0x0

    .line 1036
    const/4 v14, 0x0

    .line 1037
    const-wide/16 v15, 0x0

    .line 1038
    .line 1039
    invoke-direct/range {v11 .. v17}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 1040
    .line 1041
    .line 1042
    return-object v11

    .line 1043
    :cond_58
    const-class v2, Ljava/lang/reflect/ParameterizedType;

    .line 1044
    .line 1045
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v1

    .line 1049
    if-eqz v1, :cond_5c

    .line 1050
    .line 1051
    new-instance v1, Lcom/alibaba/fastjson2/writer/b;

    .line 1052
    .line 1053
    invoke-direct {v1, v6}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 1054
    .line 1055
    .line 1056
    const-string v3, "actualTypeArguments"

    .line 1057
    .line 1058
    const-class v4, [Ljava/lang/reflect/Type;

    .line 1059
    .line 1060
    invoke-static {v3, v4, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    new-instance v3, Lcom/alibaba/fastjson2/writer/b;

    .line 1065
    .line 1066
    const/4 v4, 0x3

    .line 1067
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 1068
    .line 1069
    .line 1070
    const-string v4, "ownerType"

    .line 1071
    .line 1072
    const-class v5, Ljava/lang/reflect/Type;

    .line 1073
    .line 1074
    invoke-static {v4, v5, v3}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v3

    .line 1078
    new-instance v4, Lcom/alibaba/fastjson2/writer/b;

    .line 1079
    .line 1080
    invoke-direct {v4, v7}, Lcom/alibaba/fastjson2/writer/b;-><init>(I)V

    .line 1081
    .line 1082
    .line 1083
    const-string v6, "rawType"

    .line 1084
    .line 1085
    invoke-static {v6, v5, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->fieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v4

    .line 1089
    filled-new-array {v1, v3, v4}, [Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v1

    .line 1093
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriters;->objectWriter(Ljava/lang/Class;[Lcom/alibaba/fastjson2/writer/FieldWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v1

    .line 1097
    return-object v1

    .line 1098
    :cond_59
    :goto_8
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;

    .line 1099
    .line 1100
    return-object v1

    .line 1101
    :cond_5a
    :goto_9
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;

    .line 1102
    .line 1103
    return-object v1

    .line 1104
    :cond_5b
    :goto_a
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplToString;

    .line 1105
    .line 1106
    return-object v1

    .line 1107
    :cond_5c
    return-object v4

    .line 1108
    :cond_5d
    :goto_b
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 1109
    .line 1110
    return-object v1

    .line 1111
    :cond_5e
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterMisc;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterMisc;

    .line 1112
    .line 1113
    return-object v1
.end method

.method public mixIn(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :goto_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 13
    .line 14
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    const/4 v0, 0x0

    .line 177
    invoke-virtual {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1
.end method

.method public register(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 4

    .line 1
    const-class v0, Ljava/lang/Integer;

    .line 2
    .line 3
    if-ne p1, v0, :cond_2

    .line 4
    .line 5
    if-eqz p2, :cond_1

    .line 6
    .line 7
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt32;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt32;

    .line 8
    .line 9
    if-ne p2, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 13
    .line 14
    const-wide/16 v2, 0x2

    .line 15
    .line 16
    or-long/2addr v0, v2

    .line 17
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_1
    :goto_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 22
    .line 23
    const-wide/16 v2, -0x3

    .line 24
    .line 25
    and-long/2addr v0, v2

    .line 26
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 27
    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :cond_2
    const-class v0, Ljava/lang/Long;

    .line 31
    .line 32
    if-eq p1, v0, :cond_b

    .line 33
    .line 34
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    if-ne p1, v0, :cond_3

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_3
    const-class v0, Ljava/math/BigDecimal;

    .line 40
    .line 41
    if-ne p1, v0, :cond_6

    .line 42
    .line 43
    if-eqz p2, :cond_5

    .line 44
    .line 45
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;

    .line 46
    .line 47
    if-ne p2, v0, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 51
    .line 52
    const-wide/16 v2, 0x8

    .line 53
    .line 54
    or-long/2addr v0, v2

    .line 55
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 56
    .line 57
    goto :goto_5

    .line 58
    :cond_5
    :goto_1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 59
    .line 60
    const-wide/16 v2, -0x9

    .line 61
    .line 62
    and-long/2addr v0, v2

    .line 63
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_6
    const-class v0, Ljava/util/Date;

    .line 67
    .line 68
    if-ne p1, v0, :cond_9

    .line 69
    .line 70
    if-eqz p2, :cond_8

    .line 71
    .line 72
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 73
    .line 74
    if-ne p2, v0, :cond_7

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_7
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 78
    .line 79
    const-wide/16 v2, 0x10

    .line 80
    .line 81
    or-long/2addr v0, v2

    .line 82
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :cond_8
    :goto_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 86
    .line 87
    const-wide/16 v2, -0x11

    .line 88
    .line 89
    and-long/2addr v0, v2

    .line 90
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_9
    const-class v0, Ljava/lang/Enum;

    .line 94
    .line 95
    if-ne p1, v0, :cond_e

    .line 96
    .line 97
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 98
    .line 99
    if-nez p2, :cond_a

    .line 100
    .line 101
    const-wide/16 v2, -0x21

    .line 102
    .line 103
    and-long/2addr v0, v2

    .line 104
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_a
    const-wide/16 v2, 0x20

    .line 108
    .line 109
    or-long/2addr v0, v2

    .line 110
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_b
    :goto_3
    if-eqz p2, :cond_d

    .line 114
    .line 115
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64;

    .line 116
    .line 117
    if-ne p2, v0, :cond_c

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_c
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 121
    .line 122
    const-wide/16 v2, 0x4

    .line 123
    .line 124
    or-long/2addr v0, v2

    .line 125
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_d
    :goto_4
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 129
    .line 130
    const-wide/16 v2, -0x5

    .line 131
    .line 132
    and-long/2addr v0, v2

    .line 133
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 134
    .line 135
    :cond_e
    :goto_5
    if-nez p2, :cond_10

    .line 136
    .line 137
    if-eqz p3, :cond_f

    .line 138
    .line 139
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 140
    .line 141
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 146
    .line 147
    return-object p1

    .line 148
    :cond_f
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 149
    .line 150
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 155
    .line 156
    return-object p1

    .line 157
    :cond_10
    if-eqz p3, :cond_11

    .line 158
    .line 159
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cacheFieldBased:Ljava/util/concurrent/ConcurrentMap;

    .line 160
    .line 161
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 166
    .line 167
    return-object p1

    .line 168
    :cond_11
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 169
    .line 170
    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 175
    .line 176
    return-object p1
.end method

.method public registerIfAbsent(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 12
    .line 13
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public unregister(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 8
    .line 9
    return-object p1
.end method

.method public unregister(Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Z
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1, p2}, Ljava/util/concurrent/ConcurrentMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
