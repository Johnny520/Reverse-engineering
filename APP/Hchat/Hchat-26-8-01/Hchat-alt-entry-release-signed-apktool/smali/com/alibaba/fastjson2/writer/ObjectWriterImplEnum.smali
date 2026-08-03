.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;
.super Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Enum<",
        "TE;>;>",
        "Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;"
    }
.end annotation


# instance fields
.field annotationNames:[Ljava/lang/String;

.field final defineClass:Ljava/lang/Class;

.field final enumConstants:[Ljava/lang/Enum;

.field final enumType:Ljava/lang/Class;

.field final features:J

.field final hashCodes:[J

.field jsonbNames:[[B

.field final names:[Ljava/lang/String;

.field typeNameHash:J

.field typeNameJSONB:[B

.field final valueField:Ljava/lang/reflect/Member;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Member;[Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterPrimitiveImpl;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->defineClass:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->enumType:Ljava/lang/Class;

    .line 7
    .line 8
    iput-wide p5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->features:J

    .line 9
    .line 10
    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->valueField:Ljava/lang/reflect/Member;

    .line 11
    .line 12
    instance-of p1, p3, Ljava/lang/reflect/AccessibleObject;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    :try_start_0
    check-cast p3, Ljava/lang/reflect/AccessibleObject;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p3, p1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :catchall_0
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, [Ljava/lang/Enum;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->enumConstants:[Ljava/lang/Enum;

    .line 29
    .line 30
    array-length p2, p1

    .line 31
    new-array p2, p2, [Ljava/lang/String;

    .line 32
    .line 33
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->names:[Ljava/lang/String;

    .line 34
    .line 35
    array-length p1, p1

    .line 36
    new-array p1, p1, [J

    .line 37
    .line 38
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->hashCodes:[J

    .line 39
    .line 40
    const/4 p1, 0x0

    .line 41
    :goto_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->enumConstants:[Ljava/lang/Enum;

    .line 42
    .line 43
    array-length p3, p2

    .line 44
    if-ge p1, p3, :cond_1

    .line 45
    .line 46
    aget-object p2, p2, p1

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->names:[Ljava/lang/String;

    .line 53
    .line 54
    aput-object p2, p3, p1

    .line 55
    .line 56
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->hashCodes:[J

    .line 57
    .line 58
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 59
    .line 60
    .line 61
    move-result-wide p5

    .line 62
    aput-wide p5, p3, p1

    .line 63
    .line 64
    add-int/lit8 p1, p1, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    iput-object p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->annotationNames:[Ljava/lang/String;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 5

    .line 1
    move-object p3, p2

    .line 2
    check-cast p3, Ljava/lang/Enum;

    .line 3
    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->valueField:Ljava/lang/reflect/Member;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p4, :cond_2

    .line 14
    .line 15
    :try_start_0
    instance-of v1, p4, Ljava/lang/reflect/Field;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    check-cast p4, Ljava/lang/reflect/Field;

    .line 20
    .line 21
    invoke-virtual {p4, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    check-cast p4, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    invoke-virtual {p4, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    :goto_0
    if-eq p4, p2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/JSONWriter;->writeAny(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :goto_1
    const-string p2, "getEnumValue error"

    .line 41
    .line 42
    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    iget-wide v1, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->features:J

    .line 47
    .line 48
    or-long p4, p5, v1

    .line 49
    .line 50
    invoke-virtual {p1, p4, p5}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 51
    .line 52
    .line 53
    move-result-wide p4

    .line 54
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 55
    .line 56
    iget-wide v1, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 57
    .line 58
    and-long/2addr v1, p4

    .line 59
    const-wide/16 v3, 0x0

    .line 60
    .line 61
    cmp-long p2, v1, v3

    .line 62
    .line 63
    if-eqz p2, :cond_3

    .line 64
    .line 65
    invoke-virtual {p3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingOrdinal:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 74
    .line 75
    iget-wide v1, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 76
    .line 77
    and-long/2addr p4, v1

    .line 78
    cmp-long p2, p4, v3

    .line 79
    .line 80
    if-eqz p2, :cond_4

    .line 81
    .line 82
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->annotationNames:[Ljava/lang/String;

    .line 91
    .line 92
    if-eqz p2, :cond_5

    .line 93
    .line 94
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    iget-object p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->annotationNames:[Ljava/lang/String;

    .line 99
    .line 100
    array-length p5, p4

    .line 101
    if-ge p2, p5, :cond_5

    .line 102
    .line 103
    aget-object v0, p4, p2

    .line 104
    .line 105
    :cond_5
    if-nez v0, :cond_6

    .line 106
    .line 107
    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    :cond_6
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->typeNameJSONB:[B

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->enumType:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 18
    .line 19
    .line 20
    move-result-object p4

    .line 21
    iput-object p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->typeNameJSONB:[B

    .line 22
    .line 23
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 24
    .line 25
    .line 26
    move-result-wide p3

    .line 27
    iput-wide p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->typeNameHash:J

    .line 28
    .line 29
    :cond_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->typeNameJSONB:[B

    .line 30
    .line 31
    iget-wide p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->typeNameHash:J

    .line 32
    .line 33
    invoke-virtual {p1, p3, p4, p5}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName([BJ)Z

    .line 34
    .line 35
    .line 36
    :cond_1
    check-cast p2, Ljava/lang/Enum;

    .line 37
    .line 38
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteEnumUsingToString:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 39
    .line 40
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONWriter;->isEnabled(Lcom/alibaba/fastjson2/JSONWriter$Feature;)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->jsonbNames:[[B

    .line 55
    .line 56
    if-nez p3, :cond_3

    .line 57
    .line 58
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->names:[Ljava/lang/String;

    .line 59
    .line 60
    array-length p3, p3

    .line 61
    new-array p3, p3, [[B

    .line 62
    .line 63
    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->jsonbNames:[[B

    .line 64
    .line 65
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->jsonbNames:[[B

    .line 70
    .line 71
    aget-object p3, p3, p2

    .line 72
    .line 73
    if-nez p3, :cond_4

    .line 74
    .line 75
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->names:[Ljava/lang/String;

    .line 76
    .line 77
    aget-object p3, p3, p2

    .line 78
    .line 79
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONB;->toBytes(Ljava/lang/String;)[B

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    iget-object p4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;->jsonbNames:[[B

    .line 84
    .line 85
    aput-object p3, p4, p2

    .line 86
    .line 87
    :cond_4
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeRaw([B)V

    .line 88
    .line 89
    .line 90
    return-void
.end method
