.class public final Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;
.super Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

.field static INSTANCE_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

.field static final TYPE_HASH_JSONObject1O:J

.field static final TYPE_NAME_JSONObject1O:[B


# instance fields
.field final contentAs:Z

.field final features:J

.field final format:Ljava/lang/String;

.field final jsonObject1:Z

.field final jsonObject1InnerMap:Ljava/lang/reflect/Field;

.field jsonObject1InnerMapOffset:J

.field final jsonbTypeInfo:[B

.field final keyType:Ljava/lang/reflect/Type;

.field volatile keyWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

.field final objectClass:Ljava/lang/Class;

.field final objectType:Ljava/lang/reflect/Type;

.field final typeInfoUTF16:[C

.field final typeInfoUTF8:[B

.field final typeNameHash:J

.field final valueType:Ljava/lang/reflect/Type;

.field final valueTypeRefDetect:Z

.field volatile valueWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v0, "JO10"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sput-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->TYPE_NAME_JSONObject1O:[B

    .line 8
    .line 9
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sput-wide v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->TYPE_HASH_JSONObject1O:J

    .line 14
    .line 15
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 16
    .line 17
    const-class v6, Lcom/alibaba/fastjson2/JSONObject;

    .line 18
    .line 19
    const-wide/16 v7, 0x0

    .line 20
    .line 21
    const-class v3, Ljava/lang/String;

    .line 22
    .line 23
    const-class v4, Ljava/lang/Object;

    .line 24
    .line 25
    const-class v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 26
    .line 27
    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;J)V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, p1

    move-object v0, p0

    move-object v3, p1

    move-wide v5, p2

    .line 138
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V
    .locals 8

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-wide v6, p5

    .line 137
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->jsonObject1InnerMapOffset:J

    .line 7
    .line 8
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->keyType:Ljava/lang/reflect/Type;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->format:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->objectClass:Ljava/lang/Class;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->objectType:Ljava/lang/reflect/Type;

    .line 17
    .line 18
    iput-wide p6, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->features:J

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueTypeRefDetect:Z

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-static {p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    xor-int/2addr p2, p1

    .line 35
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueTypeRefDetect:Z

    .line 36
    .line 37
    :goto_0
    const-wide/high16 p2, -0x8000000000000000L

    .line 38
    .line 39
    and-long/2addr p2, p6

    .line 40
    const-wide/16 p5, 0x0

    .line 41
    .line 42
    cmp-long p2, p2, p5

    .line 43
    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    move p2, p1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 p2, 0x0

    .line 49
    :goto_1
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->contentAs:Z

    .line 50
    .line 51
    invoke-static {p4}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    new-instance p3, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string p5, "\"@type\":\""

    .line 58
    .line 59
    invoke-direct {p3, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p5

    .line 66
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string p5, "\""

    .line 70
    .line 71
    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    invoke-virtual {p3}, Ljava/lang/String;->toCharArray()[C

    .line 79
    .line 80
    .line 81
    move-result-object p5

    .line 82
    iput-object p5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->typeInfoUTF16:[C

    .line 83
    .line 84
    sget-object p5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 85
    .line 86
    invoke-virtual {p3, p5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 87
    .line 88
    .line 89
    move-result-object p3

    .line 90
    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->typeInfoUTF8:[B

    .line 91
    .line 92
    const-string p3, "JO1"

    .line 93
    .line 94
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p3

    .line 98
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->jsonObject1:Z

    .line 99
    .line 100
    invoke-static {p2}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 101
    .line 102
    .line 103
    move-result-object p5

    .line 104
    iput-object p5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->jsonbTypeInfo:[B

    .line 105
    .line 106
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 107
    .line 108
    .line 109
    move-result-wide p5

    .line 110
    iput-wide p5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->typeNameHash:J

    .line 111
    .line 112
    if-eqz p3, :cond_3

    .line 113
    .line 114
    const-string p2, "map"

    .line 115
    .line 116
    invoke-static {p4, p2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->jsonObject1InnerMap:Ljava/lang/reflect/Field;

    .line 121
    .line 122
    if-eqz p2, :cond_2

    .line 123
    .line 124
    invoke-virtual {p2, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 125
    .line 126
    .line 127
    sget-object p1, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 130
    .line 131
    .line 132
    :cond_2
    return-void

    .line 133
    :cond_3
    const/4 p1, 0x0

    .line 134
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->jsonObject1InnerMap:Ljava/lang/reflect/Field;

    .line 135
    .line 136
    return-void
.end method

.method public static getINSTANCE1()Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;
    .locals 8

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v4

    .line 9
    if-nez v4, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 16
    .line 17
    const-class v3, Ljava/lang/Object;

    .line 18
    .line 19
    const-wide/16 v6, 0x0

    .line 20
    .line 21
    const-class v2, Ljava/lang/String;

    .line 22
    .line 23
    move-object v5, v4

    .line 24
    invoke-direct/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 28
    .line 29
    :cond_1
    :goto_0
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE_1x:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 30
    .line 31
    return-object v0
.end method

.method public static isWriteAsString(Ljava/lang/Object;J)Z
    .locals 4

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNonStringKeyAsString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BrowserCompatible:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 8
    .line 9
    or-long/2addr v0, v2

    .line 10
    and-long/2addr p1, v0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long p1, p1, v0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isPrimitiveOrEnum(Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    instance-of p1, p0, Ljava/time/temporal/Temporal;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    instance-of p0, p0, Ljava/util/Date;

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_0
    const/4 p0, 0x0

    .line 38
    return p0
.end method

.method public static of(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;
    .locals 7

    .line 45
    const-class v0, Lcom/alibaba/fastjson2/JSONObject;

    if-ne p0, v0, :cond_0

    .line 46
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    return-object p0

    .line 47
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getClassJSONObject1x()Ljava/lang/Class;

    move-result-object v0

    if-ne p0, v0, :cond_1

    .line 48
    invoke-static {}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->getINSTANCE1()Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    move-result-object p0

    return-object p0

    .line 49
    :cond_1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    const/4 v2, 0x0

    const-wide/16 v5, 0x0

    const/4 v1, 0x0

    move-object v4, p0

    move-object v3, p0

    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    return-object v0
.end method

.method public static of(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;
    .locals 3

    .line 42
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    .line 43
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    const-wide/16 v1, 0x0

    invoke-direct {v0, p0, v1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;-><init>(Ljava/lang/Class;J)V

    return-object v0
.end method

.method public static of(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-static {p0, v0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;
    .locals 10

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
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    array-length v1, v0

    .line 16
    const/4 v2, 0x2

    .line 17
    if-ne v1, v2, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    aget-object v1, v0, v1

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aget-object v0, v0, v2

    .line 24
    .line 25
    move-object v4, v0

    .line 26
    move-object v3, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v1, 0x0

    .line 29
    move-object v3, v1

    .line 30
    move-object v4, v3

    .line 31
    :goto_0
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 32
    .line 33
    const-wide/16 v8, 0x0

    .line 34
    .line 35
    move-object v7, p0

    .line 36
    move-object v5, p1

    .line 37
    move-object v6, p2

    .line 38
    invoke-direct/range {v2 .. v9}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Type;J)V

    .line 39
    .line 40
    .line 41
    return-object v2
.end method


# virtual methods
.method public mapKeyToString(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter;J)Ljava/lang/String;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    .line 13
    .line 14
    if-nez v0, :cond_6

    .line 15
    .line 16
    instance-of v0, p1, Ljava/lang/Long;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    invoke-static {p1, p3, p4}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->isWriteAsString(Ljava/lang/Object;J)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-eqz p3, :cond_3

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_3
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/JSONWriter;->getContext()Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    invoke-static {p1, p3}, Lcom/alibaba/fastjson2/JSON;->toJSONString(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter$Context;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_5

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    const/4 p4, 0x1

    .line 47
    if-le p3, p4, :cond_5

    .line 48
    .line 49
    iget-boolean p2, p2, Lcom/alibaba/fastjson2/JSONWriter;->useSingleQuote:Z

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    const/16 p2, 0x27

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_4
    const/16 p2, 0x22

    .line 57
    .line 58
    :goto_0
    const/4 v0, 0x0

    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-ne v0, p2, :cond_5

    .line 64
    .line 65
    sub-int/2addr p3, p4

    .line 66
    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-ne v0, p2, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1, p4, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    :cond_5
    return-object p1

    .line 77
    :cond_6
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    return-object p1
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v1, p4

    .line 8
    .line 9
    move-wide/from16 v3, p5

    .line 10
    .line 11
    iget-boolean v5, v2, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 12
    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-interface/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->hasFilter(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->writeWithFilter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    move-object v5, v8

    .line 30
    check-cast v5, Ljava/util/Map;

    .line 31
    .line 32
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->objectType:Ljava/lang/reflect/Type;

    .line 37
    .line 38
    if-ne v1, v6, :cond_2

    .line 39
    .line 40
    iget-object v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->objectClass:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-virtual {v2, v8, v6, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteMapTypeInfo(Ljava/lang/Object;Ljava/lang/Class;J)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_3

    .line 47
    .line 48
    :cond_2
    invoke-virtual {v2, v8, v1, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    :cond_3
    const/4 v1, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_4
    const/4 v1, 0x0

    .line 57
    :goto_0
    if-nez v1, :cond_5

    .line 58
    .line 59
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-eqz v6, :cond_5

    .line 64
    .line 65
    const/16 v1, 0x7b

    .line 66
    .line 67
    const/16 v3, 0x7d

    .line 68
    .line 69
    invoke-virtual {v2, v1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw(CC)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_5
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 74
    .line 75
    .line 76
    if-eqz v1, :cond_6

    .line 77
    .line 78
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->writeTypeInfo(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 79
    .line 80
    .line 81
    :cond_6
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    or-long v12, v3, v6

    .line 86
    .line 87
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->MapSortField:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 88
    .line 89
    iget-wide v3, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 90
    .line 91
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->SortMapEntriesByKeys:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 92
    .line 93
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 94
    .line 95
    or-long/2addr v3, v6

    .line 96
    and-long/2addr v3, v12

    .line 97
    const-wide/16 v14, 0x0

    .line 98
    .line 99
    cmp-long v3, v3, v14

    .line 100
    .line 101
    if-eqz v3, :cond_8

    .line 102
    .line 103
    instance-of v3, v5, Ljava/util/SortedMap;

    .line 104
    .line 105
    if-nez v3, :cond_8

    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    const-class v4, Ljava/util/LinkedHashMap;

    .line 112
    .line 113
    if-ne v3, v4, :cond_7

    .line 114
    .line 115
    iget-wide v3, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 116
    .line 117
    and-long/2addr v3, v12

    .line 118
    cmp-long v1, v3, v14

    .line 119
    .line 120
    if-eqz v1, :cond_8

    .line 121
    .line 122
    :cond_7
    new-instance v1, Ljava/util/TreeMap;

    .line 123
    .line 124
    invoke-direct {v1, v5}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 125
    .line 126
    .line 127
    move-object v5, v1

    .line 128
    :cond_8
    iget-object v1, v2, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 129
    .line 130
    iget-object v1, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 131
    .line 132
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object v16

    .line 140
    :cond_9
    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_1e

    .line 145
    .line 146
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Ljava/util/Map$Entry;

    .line 151
    .line 152
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-nez v4, :cond_a

    .line 161
    .line 162
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 163
    .line 164
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 165
    .line 166
    and-long/2addr v4, v12

    .line 167
    cmp-long v4, v4, v14

    .line 168
    .line 169
    if-eqz v4, :cond_9

    .line 170
    .line 171
    invoke-virtual {v0, v3, v2, v12, v13}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->writeMapKey(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter;J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_a
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 182
    .line 183
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 184
    .line 185
    and-long/2addr v5, v12

    .line 186
    cmp-long v5, v5, v14

    .line 187
    .line 188
    if-eqz v5, :cond_c

    .line 189
    .line 190
    instance-of v5, v4, Ljava/util/Collection;

    .line 191
    .line 192
    if-eqz v5, :cond_b

    .line 193
    .line 194
    move-object v5, v4

    .line 195
    check-cast v5, Ljava/util/Collection;

    .line 196
    .line 197
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-eqz v5, :cond_b

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_b
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-virtual {v5}, Ljava/lang/Class;->isArray()Z

    .line 209
    .line 210
    .line 211
    move-result v5

    .line 212
    if-eqz v5, :cond_c

    .line 213
    .line 214
    invoke-static {v4}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-nez v5, :cond_c

    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_c
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->keyWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 222
    .line 223
    const/4 v6, 0x0

    .line 224
    if-eqz v5, :cond_d

    .line 225
    .line 226
    move-object v5, v1

    .line 227
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->keyWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 228
    .line 229
    move-object v7, v5

    .line 230
    const/4 v5, 0x0

    .line 231
    move-object/from16 v18, v6

    .line 232
    .line 233
    move-object/from16 v17, v7

    .line 234
    .line 235
    const-wide/16 v6, 0x0

    .line 236
    .line 237
    move-object/from16 v19, v4

    .line 238
    .line 239
    const/4 v4, 0x0

    .line 240
    move-object/from16 v11, v17

    .line 241
    .line 242
    move-object/from16 v10, v18

    .line 243
    .line 244
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 245
    .line 246
    .line 247
    move-object v4, v3

    .line 248
    move-object v6, v10

    .line 249
    goto :goto_2

    .line 250
    :cond_d
    move-object v11, v1

    .line 251
    move-object/from16 v19, v4

    .line 252
    .line 253
    move-object v10, v6

    .line 254
    move-object v4, v3

    .line 255
    invoke-virtual {v0, v4, v2, v12, v13}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->writeMapKey(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter;J)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v6

    .line 259
    :goto_2
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 260
    .line 261
    .line 262
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->contentAs:Z

    .line 263
    .line 264
    if-eqz v1, :cond_e

    .line 265
    .line 266
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 267
    .line 268
    check-cast v1, Ljava/lang/Class;

    .line 269
    .line 270
    goto :goto_3

    .line 271
    :cond_e
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    :goto_3
    const-class v3, Ljava/lang/String;

    .line 276
    .line 277
    if-ne v1, v3, :cond_10

    .line 278
    .line 279
    move-object/from16 v4, v19

    .line 280
    .line 281
    check-cast v4, Ljava/lang/String;

    .line 282
    .line 283
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    :cond_f
    :goto_4
    move-object v1, v11

    .line 287
    goto/16 :goto_1

    .line 288
    .line 289
    :cond_10
    const-class v3, Ljava/lang/Integer;

    .line 290
    .line 291
    if-ne v1, v3, :cond_11

    .line 292
    .line 293
    move-object/from16 v4, v19

    .line 294
    .line 295
    check-cast v4, Ljava/lang/Integer;

    .line 296
    .line 297
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(Ljava/lang/Integer;)V

    .line 298
    .line 299
    .line 300
    goto :goto_4

    .line 301
    :cond_11
    const-class v3, Ljava/lang/Long;

    .line 302
    .line 303
    if-ne v1, v3, :cond_13

    .line 304
    .line 305
    iget-wide v3, v11, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 306
    .line 307
    const-wide/16 v20, 0x4

    .line 308
    .line 309
    and-long v3, v3, v20

    .line 310
    .line 311
    cmp-long v3, v3, v14

    .line 312
    .line 313
    if-nez v3, :cond_12

    .line 314
    .line 315
    move-object/from16 v4, v19

    .line 316
    .line 317
    check-cast v4, Ljava/lang/Long;

    .line 318
    .line 319
    invoke-virtual {v2, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(Ljava/lang/Long;)V

    .line 320
    .line 321
    .line 322
    goto :goto_4

    .line 323
    :cond_12
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    const-class v5, Ljava/lang/Long;

    .line 328
    .line 329
    move-object v4, v6

    .line 330
    move-wide v6, v12

    .line 331
    move-object/from16 v3, v19

    .line 332
    .line 333
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_13
    move-object/from16 v3, v19

    .line 338
    .line 339
    const-class v5, Ljava/lang/Boolean;

    .line 340
    .line 341
    if-ne v1, v5, :cond_14

    .line 342
    .line 343
    move-object v4, v3

    .line 344
    check-cast v4, Ljava/lang/Boolean;

    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 351
    .line 352
    .line 353
    goto :goto_4

    .line 354
    :cond_14
    const-class v5, Ljava/math/BigDecimal;

    .line 355
    .line 356
    if-ne v1, v5, :cond_16

    .line 357
    .line 358
    iget-wide v5, v11, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 359
    .line 360
    const-wide/16 v18, 0x8

    .line 361
    .line 362
    and-long v5, v5, v18

    .line 363
    .line 364
    cmp-long v5, v5, v14

    .line 365
    .line 366
    if-nez v5, :cond_15

    .line 367
    .line 368
    move-object v4, v3

    .line 369
    check-cast v4, Ljava/math/BigDecimal;

    .line 370
    .line 371
    invoke-virtual {v2, v4, v12, v13, v10}, Lcom/alibaba/fastjson2/JSONWriter;->writeDecimal(Ljava/math/BigDecimal;JLjava/text/DecimalFormat;)V

    .line 372
    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_15
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 380
    .line 381
    iget-wide v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->features:J

    .line 382
    .line 383
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 384
    .line 385
    .line 386
    goto :goto_4

    .line 387
    :cond_16
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 388
    .line 389
    if-ne v1, v5, :cond_18

    .line 390
    .line 391
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 392
    .line 393
    if-eqz v5, :cond_17

    .line 394
    .line 395
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 396
    .line 397
    goto :goto_5

    .line 398
    :cond_17
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    :goto_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    invoke-static {v5}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isPrimitiveOrEnum(Ljava/lang/Class;)Z

    .line 407
    .line 408
    .line 409
    move-result v5

    .line 410
    goto :goto_7

    .line 411
    :cond_18
    const-class v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 412
    .line 413
    if-ne v1, v5, :cond_19

    .line 414
    .line 415
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 416
    .line 417
    :goto_6
    const/4 v5, 0x0

    .line 418
    goto :goto_7

    .line 419
    :cond_19
    const-class v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 420
    .line 421
    if-ne v1, v5, :cond_1a

    .line 422
    .line 423
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 424
    .line 425
    goto :goto_6

    .line 426
    :cond_1a
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 427
    .line 428
    .line 429
    move-result-object v5

    .line 430
    invoke-static {v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isPrimitiveOrEnum(Ljava/lang/Class;)Z

    .line 431
    .line 432
    .line 433
    move-result v1

    .line 434
    move-object/from16 v22, v5

    .line 435
    .line 436
    move v5, v1

    .line 437
    move-object/from16 v1, v22

    .line 438
    .line 439
    :goto_7
    if-eqz v9, :cond_1b

    .line 440
    .line 441
    if-eqz v6, :cond_1b

    .line 442
    .line 443
    if-nez v5, :cond_1b

    .line 444
    .line 445
    const/4 v10, 0x1

    .line 446
    goto :goto_8

    .line 447
    :cond_1b
    const/4 v10, 0x0

    .line 448
    :goto_8
    if-eqz v10, :cond_1d

    .line 449
    .line 450
    if-ne v3, v8, :cond_1c

    .line 451
    .line 452
    const-string v1, ".."

    .line 453
    .line 454
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_4

    .line 458
    .line 459
    :cond_1c
    invoke-virtual {v2, v6, v3}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    if-eqz v5, :cond_1d

    .line 464
    .line 465
    invoke-virtual {v2, v5}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    goto/16 :goto_4

    .line 472
    .line 473
    :cond_1d
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 474
    .line 475
    iget-wide v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->features:J

    .line 476
    .line 477
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 478
    .line 479
    .line 480
    if-eqz v10, :cond_f

    .line 481
    .line 482
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    goto/16 :goto_4

    .line 486
    .line 487
    :cond_1e
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 488
    .line 489
    .line 490
    return-void
.end method

.method public writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 7

    .line 1
    check-cast p2, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteNulls()Z

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p4

    .line 22
    if-eqz p4, :cond_3

    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p4

    .line 28
    check-cast p4, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p5

    .line 34
    move-object v3, p5

    .line 35
    check-cast v3, Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    if-eqz p3, :cond_0

    .line 44
    .line 45
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object p4

    .line 59
    const-class p5, Ljava/lang/String;

    .line 60
    .line 61
    if-ne p4, p5, :cond_2

    .line 62
    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    move-object v1, p1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 75
    .line 76
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->features:J

    .line 77
    .line 78
    move-object v1, p1

    .line 79
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 80
    .line 81
    .line 82
    :goto_1
    move-object p1, v1

    .line 83
    goto :goto_0

    .line 84
    :cond_3
    move-object v1, p1

    .line 85
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v1, p4

    .line 8
    .line 9
    move-wide/from16 v3, p5

    .line 10
    .line 11
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->objectType:Ljava/lang/reflect/Type;

    .line 12
    .line 13
    if-ne v1, v5, :cond_0

    .line 14
    .line 15
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->objectClass:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {v2, v8, v5, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteMapTypeInfo(Ljava/lang/Object;Ljava/lang/Class;J)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v2, v8, v1, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_5

    .line 28
    .line 29
    :cond_1
    iget-object v3, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->jsonObject1InnerMap:Ljava/lang/reflect/Field;

    .line 30
    .line 31
    if-eqz v3, :cond_3

    .line 32
    .line 33
    iget-wide v4, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->jsonObject1InnerMapOffset:J

    .line 34
    .line 35
    const-wide/16 v6, -0x1

    .line 36
    .line 37
    cmp-long v6, v4, v6

    .line 38
    .line 39
    if-eqz v6, :cond_2

    .line 40
    .line 41
    sget-object v3, Lcom/alibaba/fastjson2/util/JDKUtils;->UNSAFE:Lsun/misc/Unsafe;

    .line 42
    .line 43
    invoke-virtual {v3, v8, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    instance-of v3, v3, Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    :try_start_0
    invoke-virtual {v3, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    instance-of v3, v3, Ljava/util/LinkedHashMap;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    :cond_3
    const/4 v3, 0x0

    .line 58
    :goto_0
    if-eqz v3, :cond_4

    .line 59
    .line 60
    sget-object v3, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->TYPE_NAME_JSONObject1O:[B

    .line 61
    .line 62
    sget-wide v4, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->TYPE_HASH_JSONObject1O:J

    .line 63
    .line 64
    invoke-virtual {v2, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName([BJ)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    iget-object v3, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->jsonbTypeInfo:[B

    .line 69
    .line 70
    iget-wide v4, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->typeNameHash:J

    .line 71
    .line 72
    invoke-virtual {v2, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName([BJ)Z

    .line 73
    .line 74
    .line 75
    :cond_5
    :goto_1
    move-object v10, v8

    .line 76
    check-cast v10, Ljava/util/Map;

    .line 77
    .line 78
    iget-object v3, v2, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 79
    .line 80
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 81
    .line 82
    .line 83
    iget-object v4, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 84
    .line 85
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->objectType:Ljava/lang/reflect/Type;

    .line 86
    .line 87
    const/4 v11, 0x1

    .line 88
    if-ne v1, v5, :cond_7

    .line 89
    .line 90
    :cond_6
    :goto_2
    move-object v12, v4

    .line 91
    goto :goto_3

    .line 92
    :cond_7
    instance-of v5, v1, Ljava/lang/reflect/ParameterizedType;

    .line 93
    .line 94
    if-eqz v5, :cond_6

    .line 95
    .line 96
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 97
    .line 98
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    array-length v5, v1

    .line 103
    const/4 v6, 0x2

    .line 104
    if-ne v5, v6, :cond_6

    .line 105
    .line 106
    aget-object v4, v1, v11

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :goto_3
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getFeatures()J

    .line 110
    .line 111
    .line 112
    move-result-wide v13

    .line 113
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 114
    .line 115
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 116
    .line 117
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 118
    .line 119
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 120
    .line 121
    or-long/2addr v4, v6

    .line 122
    and-long/2addr v4, v13

    .line 123
    const-wide/16 v15, 0x0

    .line 124
    .line 125
    cmp-long v1, v4, v15

    .line 126
    .line 127
    if-eqz v1, :cond_8

    .line 128
    .line 129
    move/from16 v17, v11

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_8
    const/16 v17, 0x0

    .line 133
    .line 134
    :goto_4
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 135
    .line 136
    iget-wide v4, v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 137
    .line 138
    and-long/2addr v4, v13

    .line 139
    cmp-long v1, v4, v15

    .line 140
    .line 141
    if-eqz v1, :cond_9

    .line 142
    .line 143
    move v1, v11

    .line 144
    goto :goto_5

    .line 145
    :cond_9
    const/4 v1, 0x0

    .line 146
    :goto_5
    iget-object v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 147
    .line 148
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 149
    .line 150
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 151
    .line 152
    and-long/2addr v4, v13

    .line 153
    cmp-long v4, v4, v15

    .line 154
    .line 155
    if-eqz v4, :cond_a

    .line 156
    .line 157
    move/from16 v18, v11

    .line 158
    .line 159
    goto :goto_6

    .line 160
    :cond_a
    const/16 v18, 0x0

    .line 161
    .line 162
    :goto_6
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v19

    .line 170
    const/16 v20, 0x0

    .line 171
    .line 172
    move-object/from16 v5, v20

    .line 173
    .line 174
    move-object/from16 v21, v5

    .line 175
    .line 176
    const/4 v4, 0x0

    .line 177
    :goto_7
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    if-eqz v6, :cond_2d

    .line 182
    .line 183
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    check-cast v6, Ljava/util/Map$Entry;

    .line 188
    .line 189
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    move-wide/from16 p3, v15

    .line 194
    .line 195
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v15

    .line 199
    if-nez v15, :cond_11

    .line 200
    .line 201
    if-eqz v17, :cond_10

    .line 202
    .line 203
    instance-of v15, v7, Ljava/lang/String;

    .line 204
    .line 205
    if-eqz v15, :cond_b

    .line 206
    .line 207
    check-cast v7, Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v2, v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    move v15, v1

    .line 213
    move-object/from16 v25, v3

    .line 214
    .line 215
    move/from16 v26, v4

    .line 216
    .line 217
    move-object v11, v5

    .line 218
    goto :goto_b

    .line 219
    :cond_b
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    move-result-object v15

    .line 223
    if-eqz v18, :cond_c

    .line 224
    .line 225
    invoke-static {v15}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 226
    .line 227
    .line 228
    move-result v16

    .line 229
    if-nez v16, :cond_c

    .line 230
    .line 231
    move/from16 v16, v11

    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_c
    const/16 v16, 0x0

    .line 235
    .line 236
    :goto_8
    if-eqz v16, :cond_d

    .line 237
    .line 238
    invoke-virtual {v2, v4, v6}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    const-string v11, "key"

    .line 242
    .line 243
    invoke-virtual {v2, v11, v7}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    goto :goto_9

    .line 248
    :cond_d
    move-object/from16 v11, v20

    .line 249
    .line 250
    :goto_9
    if-eqz v11, :cond_e

    .line 251
    .line 252
    invoke-virtual {v2, v11}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    move v15, v1

    .line 256
    move-object/from16 v25, v3

    .line 257
    .line 258
    move/from16 v26, v4

    .line 259
    .line 260
    move-object v11, v5

    .line 261
    move-object v9, v6

    .line 262
    move-object v3, v7

    .line 263
    goto :goto_a

    .line 264
    :cond_e
    invoke-virtual {v3, v15, v15, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    move-object v15, v5

    .line 269
    const/4 v5, 0x0

    .line 270
    move-object/from16 v23, v3

    .line 271
    .line 272
    move-object/from16 v22, v6

    .line 273
    .line 274
    move-object v3, v7

    .line 275
    const-wide/16 v6, 0x0

    .line 276
    .line 277
    move/from16 v24, v4

    .line 278
    .line 279
    const/4 v4, 0x0

    .line 280
    move-object v9, v15

    .line 281
    move v15, v1

    .line 282
    move-object v1, v11

    .line 283
    move-object v11, v9

    .line 284
    move-object/from16 v9, v22

    .line 285
    .line 286
    move-object/from16 v25, v23

    .line 287
    .line 288
    move/from16 v26, v24

    .line 289
    .line 290
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 291
    .line 292
    .line 293
    :goto_a
    if-eqz v16, :cond_f

    .line 294
    .line 295
    invoke-virtual {v2, v9}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_f
    :goto_b
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 302
    .line 303
    .line 304
    move-object/from16 p6, v12

    .line 305
    .line 306
    move v9, v15

    .line 307
    move-object/from16 v12, v25

    .line 308
    .line 309
    :goto_c
    move/from16 v6, v26

    .line 310
    .line 311
    const/4 v4, 0x0

    .line 312
    goto/16 :goto_16

    .line 313
    .line 314
    :cond_10
    move-object v11, v5

    .line 315
    move v9, v1

    .line 316
    move v6, v4

    .line 317
    move-object/from16 p6, v12

    .line 318
    .line 319
    const/4 v4, 0x0

    .line 320
    move-object v12, v3

    .line 321
    goto/16 :goto_16

    .line 322
    .line 323
    :cond_11
    move v9, v1

    .line 324
    move-object/from16 v25, v3

    .line 325
    .line 326
    move/from16 v26, v4

    .line 327
    .line 328
    move-object v11, v5

    .line 329
    move-object v3, v7

    .line 330
    instance-of v1, v3, Ljava/lang/String;

    .line 331
    .line 332
    if-nez v1, :cond_12

    .line 333
    .line 334
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 335
    .line 336
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 337
    .line 338
    and-long/2addr v4, v13

    .line 339
    cmp-long v4, v4, p3

    .line 340
    .line 341
    if-nez v4, :cond_13

    .line 342
    .line 343
    :cond_12
    move/from16 v16, v1

    .line 344
    .line 345
    move-object/from16 p6, v12

    .line 346
    .line 347
    move-object/from16 v12, v25

    .line 348
    .line 349
    goto :goto_d

    .line 350
    :cond_13
    if-nez v3, :cond_14

    .line 351
    .line 352
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 353
    .line 354
    .line 355
    move/from16 v16, v1

    .line 356
    .line 357
    move-object/from16 p6, v12

    .line 358
    .line 359
    move-object/from16 v12, v25

    .line 360
    .line 361
    goto :goto_f

    .line 362
    :cond_14
    if-eqz v18, :cond_15

    .line 363
    .line 364
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 365
    .line 366
    const/4 v5, 0x0

    .line 367
    invoke-virtual {v2, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter;->config(Lcom/alibaba/fastjson2/JSONWriter$Feature;Z)V

    .line 368
    .line 369
    .line 370
    :cond_15
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    move-object/from16 v5, v25

    .line 375
    .line 376
    invoke-virtual {v5, v4, v4, v9}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    const/4 v5, 0x0

    .line 381
    const-wide/16 v6, 0x0

    .line 382
    .line 383
    move/from16 v16, v1

    .line 384
    .line 385
    move-object v1, v4

    .line 386
    const/4 v4, 0x0

    .line 387
    move-object/from16 p6, v12

    .line 388
    .line 389
    move-object/from16 v12, v25

    .line 390
    .line 391
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 392
    .line 393
    .line 394
    if-eqz v18, :cond_18

    .line 395
    .line 396
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 397
    .line 398
    const/4 v4, 0x1

    .line 399
    invoke-virtual {v2, v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->config(Lcom/alibaba/fastjson2/JSONWriter$Feature;Z)V

    .line 400
    .line 401
    .line 402
    goto :goto_f

    .line 403
    :goto_d
    if-eqz v16, :cond_16

    .line 404
    .line 405
    move-object v7, v3

    .line 406
    check-cast v7, Ljava/lang/String;

    .line 407
    .line 408
    goto :goto_e

    .line 409
    :cond_16
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    :goto_e
    iget-object v1, v2, Lcom/alibaba/fastjson2/JSONWriter;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 414
    .line 415
    if-eqz v1, :cond_17

    .line 416
    .line 417
    invoke-virtual {v2, v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeSymbol(Ljava/lang/String;)V

    .line 418
    .line 419
    .line 420
    instance-of v1, v15, Ljava/lang/String;

    .line 421
    .line 422
    if-eqz v1, :cond_18

    .line 423
    .line 424
    check-cast v15, Ljava/lang/String;

    .line 425
    .line 426
    invoke-virtual {v2, v15}, Lcom/alibaba/fastjson2/JSONWriter;->writeSymbol(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    goto :goto_c

    .line 430
    :cond_17
    invoke-virtual {v2, v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    :cond_18
    :goto_f
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->contentAs:Z

    .line 434
    .line 435
    if-eqz v1, :cond_19

    .line 436
    .line 437
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 438
    .line 439
    check-cast v1, Ljava/lang/Class;

    .line 440
    .line 441
    :goto_10
    move-object v5, v1

    .line 442
    goto :goto_11

    .line 443
    :cond_19
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    goto :goto_10

    .line 448
    :goto_11
    const-class v1, Ljava/lang/String;

    .line 449
    .line 450
    if-ne v5, v1, :cond_1a

    .line 451
    .line 452
    check-cast v15, Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v2, v15}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_c

    .line 458
    .line 459
    :cond_1a
    const-class v1, Ljava/lang/Integer;

    .line 460
    .line 461
    if-ne v5, v1, :cond_1b

    .line 462
    .line 463
    check-cast v15, Ljava/lang/Integer;

    .line 464
    .line 465
    invoke-virtual {v2, v15}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(Ljava/lang/Integer;)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_c

    .line 469
    .line 470
    :cond_1b
    const-class v1, Ljava/lang/Long;

    .line 471
    .line 472
    if-ne v5, v1, :cond_1c

    .line 473
    .line 474
    check-cast v15, Ljava/lang/Long;

    .line 475
    .line 476
    invoke-virtual {v2, v15}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(Ljava/lang/Long;)V

    .line 477
    .line 478
    .line 479
    goto/16 :goto_c

    .line 480
    .line 481
    :cond_1c
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 482
    .line 483
    if-ne v5, v1, :cond_1e

    .line 484
    .line 485
    if-eqz v18, :cond_1d

    .line 486
    .line 487
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueTypeRefDetect:Z

    .line 488
    .line 489
    if-eqz v1, :cond_1d

    .line 490
    .line 491
    :goto_12
    const/4 v1, 0x1

    .line 492
    goto :goto_13

    .line 493
    :cond_1d
    const/4 v1, 0x0

    .line 494
    goto :goto_13

    .line 495
    :cond_1e
    if-eqz v18, :cond_1d

    .line 496
    .line 497
    invoke-static {v5}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-nez v1, :cond_1d

    .line 502
    .line 503
    goto :goto_12

    .line 504
    :goto_13
    if-eqz v1, :cond_24

    .line 505
    .line 506
    if-ne v15, v8, :cond_1f

    .line 507
    .line 508
    const-string v1, ".."

    .line 509
    .line 510
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_c

    .line 514
    .line 515
    :cond_1f
    if-eqz v16, :cond_20

    .line 516
    .line 517
    move-object v7, v3

    .line 518
    check-cast v7, Ljava/lang/String;

    .line 519
    .line 520
    invoke-virtual {v2, v7, v15}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v4

    .line 524
    :goto_14
    move-object v7, v4

    .line 525
    move/from16 v6, v26

    .line 526
    .line 527
    const/4 v4, 0x0

    .line 528
    const/16 v22, 0x0

    .line 529
    .line 530
    goto :goto_15

    .line 531
    :cond_20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    move-result-object v4

    .line 535
    invoke-static {v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isPrimitiveOrEnum(Ljava/lang/Class;)Z

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    if-eqz v4, :cond_21

    .line 540
    .line 541
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    invoke-virtual {v2, v4, v15}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    goto :goto_14

    .line 550
    :cond_21
    invoke-interface {v10}, Ljava/util/Map;->size()I

    .line 551
    .line 552
    .line 553
    move-result v4

    .line 554
    const/4 v6, 0x1

    .line 555
    if-eq v4, v6, :cond_22

    .line 556
    .line 557
    instance-of v4, v10, Ljava/util/SortedMap;

    .line 558
    .line 559
    if-nez v4, :cond_22

    .line 560
    .line 561
    instance-of v4, v10, Ljava/util/LinkedHashMap;

    .line 562
    .line 563
    if-nez v4, :cond_22

    .line 564
    .line 565
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 566
    .line 567
    const/4 v4, 0x0

    .line 568
    invoke-virtual {v2, v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->config(Lcom/alibaba/fastjson2/JSONWriter$Feature;Z)V

    .line 569
    .line 570
    .line 571
    move v1, v4

    .line 572
    move-object/from16 v7, v20

    .line 573
    .line 574
    move/from16 v6, v26

    .line 575
    .line 576
    const/16 v22, 0x1

    .line 577
    .line 578
    goto :goto_15

    .line 579
    :cond_22
    const/4 v4, 0x0

    .line 580
    move/from16 v6, v26

    .line 581
    .line 582
    invoke-virtual {v2, v6, v15}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    move/from16 v22, v4

    .line 587
    .line 588
    :goto_15
    if-eqz v7, :cond_23

    .line 589
    .line 590
    invoke-virtual {v2, v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v2, v15}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    :goto_16
    move-object/from16 v5, p6

    .line 597
    .line 598
    move v15, v4

    .line 599
    move/from16 v26, v6

    .line 600
    .line 601
    const/4 v4, 0x1

    .line 602
    goto/16 :goto_1c

    .line 603
    .line 604
    :cond_23
    :goto_17
    move/from16 v16, v1

    .line 605
    .line 606
    goto :goto_18

    .line 607
    :cond_24
    move/from16 v6, v26

    .line 608
    .line 609
    const/4 v4, 0x0

    .line 610
    move/from16 v22, v4

    .line 611
    .line 612
    goto :goto_17

    .line 613
    :goto_18
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 614
    .line 615
    if-ne v5, v1, :cond_26

    .line 616
    .line 617
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 618
    .line 619
    if-eqz v1, :cond_26

    .line 620
    .line 621
    iget-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 622
    .line 623
    :cond_25
    :goto_19
    move/from16 v26, v6

    .line 624
    .line 625
    goto :goto_1b

    .line 626
    :cond_26
    if-ne v11, v5, :cond_27

    .line 627
    .line 628
    move/from16 v26, v6

    .line 629
    .line 630
    move-object/from16 v1, v21

    .line 631
    .line 632
    goto :goto_1b

    .line 633
    :cond_27
    const-class v1, Lcom/alibaba/fastjson2/JSONObject;

    .line 634
    .line 635
    if-ne v5, v1, :cond_28

    .line 636
    .line 637
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 638
    .line 639
    goto :goto_1a

    .line 640
    :cond_28
    const-class v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 641
    .line 642
    if-ne v5, v1, :cond_29

    .line 643
    .line 644
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplList;

    .line 645
    .line 646
    goto :goto_1a

    .line 647
    :cond_29
    invoke-virtual {v12, v5, v5, v9}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    :goto_1a
    if-nez v21, :cond_2a

    .line 652
    .line 653
    move-object/from16 v21, v1

    .line 654
    .line 655
    move-object v11, v5

    .line 656
    :cond_2a
    iget-object v7, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 657
    .line 658
    if-ne v5, v7, :cond_25

    .line 659
    .line 660
    iput-object v1, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 661
    .line 662
    goto :goto_19

    .line 663
    :goto_1b
    iget-wide v6, v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->features:J

    .line 664
    .line 665
    move v5, v4

    .line 666
    move-object v4, v3

    .line 667
    move-object v3, v15

    .line 668
    move v15, v5

    .line 669
    move-object/from16 v5, p6

    .line 670
    .line 671
    invoke-interface/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 672
    .line 673
    .line 674
    if-eqz v22, :cond_2b

    .line 675
    .line 676
    sget-object v1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 677
    .line 678
    const/4 v4, 0x1

    .line 679
    invoke-virtual {v2, v1, v4}, Lcom/alibaba/fastjson2/JSONWriter;->config(Lcom/alibaba/fastjson2/JSONWriter$Feature;Z)V

    .line 680
    .line 681
    .line 682
    goto :goto_1c

    .line 683
    :cond_2b
    const/4 v4, 0x1

    .line 684
    if-eqz v16, :cond_2c

    .line 685
    .line 686
    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 687
    .line 688
    .line 689
    :cond_2c
    :goto_1c
    add-int/lit8 v1, v26, 0x1

    .line 690
    .line 691
    move-wide/from16 v15, p3

    .line 692
    .line 693
    move-object v3, v12

    .line 694
    move-object v12, v5

    .line 695
    move-object v5, v11

    .line 696
    move v11, v4

    .line 697
    move v4, v1

    .line 698
    move v1, v9

    .line 699
    goto/16 :goto_7

    .line 700
    .line 701
    :cond_2d
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 702
    .line 703
    .line 704
    return-void
.end method

.method public writeMapKey(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter;J)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const-string p1, "null"

    .line 5
    .line 6
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    check-cast p1, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_1
    invoke-static {p1, p3, p4}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->isWriteAsString(Ljava/lang/Object;J)Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-eqz p3, :cond_2

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    instance-of p3, p1, Ljava/lang/Integer;

    .line 35
    .line 36
    if-eqz p3, :cond_3

    .line 37
    .line 38
    check-cast p1, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(I)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    instance-of p3, p1, Ljava/lang/Long;

    .line 49
    .line 50
    if-eqz p3, :cond_4

    .line 51
    .line 52
    check-cast p1, Ljava/lang/Long;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide p3

    .line 58
    invoke-virtual {p2, p3, p4}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(J)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_4
    invoke-virtual {p2, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameAny(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v0
.end method

.method public writeTypeInfo(Lcom/alibaba/fastjson2/JSONWriter;)Z
    .locals 1

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->utf8:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->typeInfoUTF8:[B

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([B)V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->typeInfoUTF16:[C

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeNameRaw([C)V

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public writeWithFilter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 14
    .line 15
    .line 16
    move-object v2, v0

    .line 17
    check-cast v2, Ljava/util/Map;

    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    or-long v9, p5, v4

    .line 24
    .line 25
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->MapSortField:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 26
    .line 27
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 28
    .line 29
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->SortMapEntriesByKeys:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 30
    .line 31
    iget-wide v7, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 32
    .line 33
    or-long/2addr v4, v7

    .line 34
    and-long/2addr v4, v9

    .line 35
    const-wide/16 v11, 0x0

    .line 36
    .line 37
    cmp-long v4, v4, v11

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    instance-of v4, v2, Ljava/util/SortedMap;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const-class v5, Ljava/util/LinkedHashMap;

    .line 50
    .line 51
    if-ne v4, v5, :cond_1

    .line 52
    .line 53
    iget-wide v4, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 54
    .line 55
    and-long/2addr v4, v9

    .line 56
    cmp-long v4, v4, v11

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    :cond_1
    new-instance v4, Ljava/util/TreeMap;

    .line 61
    .line 62
    invoke-direct {v4, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    move-object v2, v4

    .line 66
    :cond_2
    iget-object v4, v3, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 67
    .line 68
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getBeforeFilter()Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    invoke-virtual {v5, v3, v0}, Lcom/alibaba/fastjson2/filter/BeforeFilter;->writeBefore(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getPropertyPreFilter()Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getNameFilter()Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 82
    .line 83
    .line 84
    move-result-object v14

    .line 85
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getValueFilter()Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 86
    .line 87
    .line 88
    move-result-object v15

    .line 89
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getPropertyFilter()Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getAfterFilter()Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 98
    .line 99
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 100
    .line 101
    invoke-virtual {v4, v7, v8}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isEnabled(J)Z

    .line 102
    .line 103
    .line 104
    move-result v16

    .line 105
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 106
    .line 107
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 108
    .line 109
    invoke-virtual {v4, v7, v8}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isEnabled(J)Z

    .line 110
    .line 111
    .line 112
    move-result v17

    .line 113
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v18

    .line 121
    :cond_4
    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-eqz v2, :cond_12

    .line 126
    .line 127
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Ljava/util/Map$Entry;

    .line 132
    .line 133
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    if-nez v4, :cond_5

    .line 138
    .line 139
    if-nez v16, :cond_5

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_5
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v1, v2, v3, v9, v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->mapKeyToString(Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONWriter;J)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    if-eqz v17, :cond_6

    .line 151
    .line 152
    invoke-virtual {v3, v2, v4}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    if-eqz v7, :cond_6

    .line 157
    .line 158
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_6
    if-eqz v13, :cond_7

    .line 172
    .line 173
    :try_start_0
    invoke-interface {v13, v3, v0, v2}, Lcom/alibaba/fastjson2/filter/PropertyPreFilter;->process(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/String;)Z

    .line 174
    .line 175
    .line 176
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    if-nez v7, :cond_7

    .line 178
    .line 179
    if-eqz v17, :cond_4

    .line 180
    .line 181
    :goto_1
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    goto :goto_0

    .line 185
    :catchall_0
    move-exception v0

    .line 186
    goto/16 :goto_5

    .line 187
    .line 188
    :cond_7
    if-eqz v14, :cond_8

    .line 189
    .line 190
    :try_start_1
    invoke-interface {v14, v0, v2, v4}, Lcom/alibaba/fastjson2/filter/NameFilter;->process(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    :cond_8
    if-eqz v5, :cond_9

    .line 195
    .line 196
    invoke-interface {v5, v0, v2, v4}, Lcom/alibaba/fastjson2/filter/PropertyFilter;->apply(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v7

    .line 200
    if-nez v7, :cond_9

    .line 201
    .line 202
    if-eqz v17, :cond_4

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_9
    if-eqz v15, :cond_a

    .line 206
    .line 207
    invoke-interface {v15, v0, v2, v4}, Lcom/alibaba/fastjson2/filter/ValueFilter;->apply(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    :cond_a
    if-nez v4, :cond_c

    .line 212
    .line 213
    invoke-virtual {v3, v9, v10}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 214
    .line 215
    .line 216
    move-result-wide v7

    .line 217
    move-wide/from16 p5, v11

    .line 218
    .line 219
    sget-object v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 220
    .line 221
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    .line 223
    and-long/2addr v7, v11

    .line 224
    cmp-long v7, v7, p5

    .line 225
    .line 226
    if-nez v7, :cond_d

    .line 227
    .line 228
    if-eqz v17, :cond_b

    .line 229
    .line 230
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    :cond_b
    :goto_2
    move-wide/from16 v11, p5

    .line 234
    .line 235
    goto :goto_0

    .line 236
    :cond_c
    move-wide/from16 p5, v11

    .line 237
    .line 238
    :cond_d
    :try_start_2
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 242
    .line 243
    .line 244
    if-nez v4, :cond_e

    .line 245
    .line 246
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 247
    .line 248
    .line 249
    move-object v11, v5

    .line 250
    move-object v12, v6

    .line 251
    goto :goto_4

    .line 252
    :cond_e
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->contentAs:Z

    .line 253
    .line 254
    if-eqz v2, :cond_f

    .line 255
    .line 256
    iget-object v2, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueType:Ljava/lang/reflect/Type;

    .line 257
    .line 258
    check-cast v2, Ljava/lang/Class;

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_f
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    :goto_3
    invoke-virtual {v3, v2}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    iget-wide v7, v1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->features:J

    .line 270
    .line 271
    move-object v11, v5

    .line 272
    move-object v12, v6

    .line 273
    move-object/from16 v5, p3

    .line 274
    .line 275
    move-object/from16 v6, p4

    .line 276
    .line 277
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 278
    .line 279
    .line 280
    :goto_4
    if-eqz v17, :cond_10

    .line 281
    .line 282
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_10
    move-object v5, v11

    .line 286
    move-object v6, v12

    .line 287
    goto :goto_2

    .line 288
    :goto_5
    if-eqz v17, :cond_11

    .line 289
    .line 290
    invoke-virtual {v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_11
    throw v0

    .line 294
    :cond_12
    move-object v12, v6

    .line 295
    if-eqz v12, :cond_13

    .line 296
    .line 297
    invoke-virtual {v12, v3, v0}, Lcom/alibaba/fastjson2/filter/AfterFilter;->writeAfter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_13
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 301
    .line 302
    .line 303
    return-void
.end method
