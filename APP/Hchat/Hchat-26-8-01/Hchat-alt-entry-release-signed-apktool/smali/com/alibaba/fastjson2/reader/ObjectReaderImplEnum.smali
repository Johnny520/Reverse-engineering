.class public final Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# instance fields
.field final createMethod:Ljava/lang/reflect/Method;

.field final createMethodParamType:Ljava/lang/reflect/Type;

.field final enumClass:Ljava/lang/Class;

.field private final enumNameHashCodes:[J

.field private final enums:[Ljava/lang/Enum;

.field private intValues:[J

.field private final ordinalEnums:[Ljava/lang/Enum;

.field private stringValues:[Ljava/lang/String;

.field final typeNameHash:J

.field final valueField:Ljava/lang/reflect/Member;

.field final valueFieldType:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Member;[Ljava/lang/Enum;[Ljava/lang/Enum;[J)V
    .locals 13

    .line 1
    move-object/from16 v1, p3

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->createMethod:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    instance-of v3, v1, Ljava/lang/reflect/AccessibleObject;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    move-object v3, v1

    .line 18
    check-cast v3, Ljava/lang/reflect/AccessibleObject;

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->valueField:Ljava/lang/reflect/Member;

    .line 24
    .line 25
    instance-of v3, v1, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    move-object v3, v1

    .line 31
    check-cast v3, Ljava/lang/reflect/Field;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    instance-of v3, v1, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    move-object v3, v1

    .line 43
    check-cast v3, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v3, v5

    .line 51
    :goto_0
    iput-object v3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->valueFieldType:Ljava/lang/reflect/Type;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    if-eqz v3, :cond_8

    .line 55
    .line 56
    array-length v7, v2

    .line 57
    new-array v7, v7, [Ljava/lang/String;

    .line 58
    .line 59
    iput-object v7, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->stringValues:[Ljava/lang/String;

    .line 60
    .line 61
    const-class v7, Ljava/lang/String;

    .line 62
    .line 63
    if-eq v3, v7, :cond_3

    .line 64
    .line 65
    array-length v8, v2

    .line 66
    new-array v8, v8, [J

    .line 67
    .line 68
    iput-object v8, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->intValues:[J

    .line 69
    .line 70
    :cond_3
    move v8, v6

    .line 71
    :goto_1
    array-length v9, v2

    .line 72
    if-ge v8, v9, :cond_8

    .line 73
    .line 74
    aget-object v9, v2, v8

    .line 75
    .line 76
    :try_start_0
    instance-of v10, v1, Ljava/lang/reflect/Field;

    .line 77
    .line 78
    if-eqz v10, :cond_4

    .line 79
    .line 80
    move-object v10, v1

    .line 81
    check-cast v10, Ljava/lang/reflect/Field;

    .line 82
    .line 83
    invoke-virtual {v10, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move-object v10, v1

    .line 89
    check-cast v10, Ljava/lang/reflect/Method;

    .line 90
    .line 91
    invoke-virtual {v10, v9, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    :goto_2
    iget-object v10, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->stringValues:[Ljava/lang/String;

    .line 96
    .line 97
    if-ne v3, v7, :cond_5

    .line 98
    .line 99
    :try_start_1
    check-cast v9, Ljava/lang/String;

    .line 100
    .line 101
    aput-object v9, v10, v8

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    if-nez v9, :cond_6

    .line 105
    .line 106
    move-object v11, v5

    .line 107
    goto :goto_3

    .line 108
    :cond_6
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    :goto_3
    aput-object v11, v10, v8

    .line 113
    .line 114
    instance-of v10, v9, Ljava/lang/Number;

    .line 115
    .line 116
    if-eqz v10, :cond_7

    .line 117
    .line 118
    iget-object v10, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->intValues:[J

    .line 119
    .line 120
    check-cast v9, Ljava/lang/Number;

    .line 121
    .line 122
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 123
    .line 124
    .line 125
    move-result-wide v11

    .line 126
    aput-wide v11, v10, v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 127
    .line 128
    :catch_0
    :cond_7
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_8
    if-eqz p2, :cond_9

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-ne v1, v4, :cond_9

    .line 138
    .line 139
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    aget-object v5, v0, v6

    .line 144
    .line 145
    :cond_9
    iput-object v5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->createMethodParamType:Ljava/lang/reflect/Type;

    .line 146
    .line 147
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 152
    .line 153
    .line 154
    move-result-wide v0

    .line 155
    iput-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->typeNameHash:J

    .line 156
    .line 157
    iput-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enums:[Ljava/lang/Enum;

    .line 158
    .line 159
    move-object/from16 p1, p5

    .line 160
    .line 161
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->ordinalEnums:[Ljava/lang/Enum;

    .line 162
    .line 163
    move-object/from16 p1, p6

    .line 164
    .line 165
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumNameHashCodes:[J

    .line 166
    .line 167
    return-void
.end method

.method private oomCheck(Ljava/lang/reflect/Type;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-class v0, Ljava/util/List;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p1, "ObjectReaderImplEnum parses error, JSONReader not forward when field type belongs to collection to avoid OOM"

    .line 23
    .line 24
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public getEnum(Ljava/lang/String;)Ljava/lang/Enum;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->getEnumByHashCode(J)Ljava/lang/Enum;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public getEnumByHashCode(J)Ljava/lang/Enum;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enums:[Ljava/lang/Enum;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumNameHashCodes:[J

    .line 8
    .line 9
    invoke-static {v0, p1, p2}, Ljava/util/Arrays;->binarySearch([JJ)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-gez p1, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enums:[Ljava/lang/Enum;

    .line 17
    .line 18
    aget-object p1, p2, p1

    .line 19
    .line 20
    return-object p1
.end method

.method public getEnumByOrdinal(I)Ljava/lang/Enum;
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->ordinalEnums:[Ljava/lang/Enum;

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    if-ge p1, v1, :cond_0

    .line 7
    .line 8
    aget-object p1, v0, p1

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "."

    .line 18
    .line 19
    const-string v2, "No enum ordinal "

    .line 20
    .line 21
    invoke-static {p1, v0, v1, v2}, Lah/a;->f(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1
.end method

.method public getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public of(I)Ljava/lang/Enum;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->valueField:Ljava/lang/reflect/Member;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    if-ltz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->ordinalEnums:[Ljava/lang/Enum;

    .line 9
    .line 10
    array-length v2, v0

    .line 11
    if-ge p1, v2, :cond_0

    .line 12
    .line 13
    aget-object p1, v0, p1

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    return-object v1

    .line 17
    :cond_1
    :try_start_0
    instance-of v2, v0, Ljava/lang/reflect/Field;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enums:[Ljava/lang/Enum;

    .line 23
    .line 24
    array-length v2, v0

    .line 25
    if-ge v3, v2, :cond_5

    .line 26
    .line 27
    aget-object v0, v0, v3

    .line 28
    .line 29
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->valueField:Ljava/lang/reflect/Member;

    .line 30
    .line 31
    check-cast v2, Ljava/lang/reflect/Field;

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-ne v2, p1, :cond_2

    .line 38
    .line 39
    move-object v1, v0

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    check-cast v0, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    :goto_1
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enums:[Ljava/lang/Enum;

    .line 49
    .line 50
    array-length v4, v2

    .line 51
    if-ge v3, v4, :cond_5

    .line 52
    .line 53
    aget-object v2, v2, v3

    .line 54
    .line 55
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    if-ne v4, p1, :cond_4

    .line 66
    .line 67
    move-object v1, v2

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_5
    :goto_2
    if-eqz v1, :cond_6

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_6
    const-string v0, "None enum ordinal or value "

    .line 76
    .line 77
    invoke-static {p1, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    return-object p1

    .line 86
    :goto_3
    new-instance v1, Lcom/alibaba/fastjson2/JSONException;

    .line 87
    .line 88
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    new-instance v3, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v4, "parse enum error, class "

    .line 97
    .line 98
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v2, ", value "

    .line 105
    .line 106
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-direct {v1, p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    throw v1
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getOffset()I

    .line 2
    .line 3
    .line 4
    move-result v6

    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getType()B

    .line 6
    .line 7
    .line 8
    move-result v7

    .line 9
    const/16 v0, -0x6e

    .line 10
    .line 11
    if-ne v7, v0, :cond_2

    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    move-wide v4, p4

    .line 19
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReader;->checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    if-eq v1, p0, :cond_2

    .line 26
    .line 27
    move-object v2, p2

    .line 28
    move-object v3, p3

    .line 29
    move-wide v4, p4

    .line 30
    move-object v0, v1

    .line 31
    move-object v1, p1

    .line 32
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0

    .line 37
    :cond_0
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v2, "not support enumType : "

    .line 49
    .line 50
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    return-object v0

    .line 73
    :cond_2
    :goto_0
    const/16 v1, -0x10

    .line 74
    .line 75
    if-lt v7, v1, :cond_5

    .line 76
    .line 77
    const/16 v1, 0x48

    .line 78
    .line 79
    if-gt v7, v1, :cond_5

    .line 80
    .line 81
    const/16 v1, 0x2f

    .line 82
    .line 83
    if-gt v7, v1, :cond_3

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    :goto_1
    if-ltz v7, :cond_4

    .line 94
    .line 95
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->ordinalEnums:[Ljava/lang/Enum;

    .line 96
    .line 97
    array-length v2, v1

    .line 98
    if-ge v7, v2, :cond_4

    .line 99
    .line 100
    aget-object v1, v1, v7

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "."

    .line 110
    .line 111
    const-string v2, "No enum ordinal "

    .line 112
    .line 113
    invoke-static {v7, v0, v1, v2}, Lah/a;->f(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    return-object v0

    .line 118
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    return-object v0

    .line 126
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readValueHashCode()J

    .line 127
    .line 128
    .line 129
    move-result-wide v1

    .line 130
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->getEnumByHashCode(J)Ljava/lang/Enum;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-nez v1, :cond_7

    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 137
    .line 138
    .line 139
    move-result-wide v1

    .line 140
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->getEnumByHashCode(J)Ljava/lang/Enum;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    :cond_7
    :goto_2
    if-nez v1, :cond_8

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getOffset()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-ne v0, v6, :cond_8

    .line 151
    .line 152
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->oomCheck(Ljava/lang/reflect/Type;)V

    .line 153
    .line 154
    .line 155
    :cond_8
    return-object v1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getOffset()I

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->createMethodParamType:Ljava/lang/reflect/Type;

    .line 6
    .line 7
    const/4 p5, 0x0

    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :try_start_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->createMethod:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    invoke-virtual {p3, p5, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    return-object p1

    .line 25
    :catch_0
    move-exception p3

    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception p3

    .line 28
    :goto_0
    new-instance p4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p5, "create enum error, enumClass "

    .line 31
    .line 32
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {p5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p5

    .line 41
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p5, ", paramValue "

    .line 45
    .line 46
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1, p3}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    :goto_1
    const/4 p1, 0x0

    .line 64
    return-object p1

    .line 65
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    const-string v0, "parse enum error, class "

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    if-eqz p4, :cond_6

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 75
    .line 76
    .line 77
    move-result p4

    .line 78
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->valueField:Ljava/lang/reflect/Member;

    .line 79
    .line 80
    if-nez v2, :cond_2

    .line 81
    .line 82
    if-ltz p4, :cond_1

    .line 83
    .line 84
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->ordinalEnums:[Ljava/lang/Enum;

    .line 85
    .line 86
    array-length v0, p5

    .line 87
    if-ge p4, v0, :cond_1

    .line 88
    .line 89
    aget-object p4, p5, p4

    .line 90
    .line 91
    move-object p5, p4

    .line 92
    goto/16 :goto_8

    .line 93
    .line 94
    :cond_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const-string p2, "."

    .line 101
    .line 102
    const-string p3, "No enum ordinal "

    .line 103
    .line 104
    invoke-static {p4, p1, p2, p3}, Lah/a;->f(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->intValues:[J

    .line 109
    .line 110
    if-eqz v2, :cond_4

    .line 111
    .line 112
    :goto_2
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->intValues:[J

    .line 113
    .line 114
    array-length v3, v2

    .line 115
    if-ge v1, v3, :cond_4

    .line 116
    .line 117
    aget-wide v3, v2, v1

    .line 118
    .line 119
    int-to-long v5, p4

    .line 120
    cmp-long v2, v3, v5

    .line 121
    .line 122
    if-nez v2, :cond_3

    .line 123
    .line 124
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enums:[Ljava/lang/Enum;

    .line 125
    .line 126
    aget-object p5, p5, v1

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    :goto_3
    if-nez p5, :cond_11

    .line 133
    .line 134
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 135
    .line 136
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/JSONReader;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-nez v1, :cond_5

    .line 141
    .line 142
    goto/16 :goto_8

    .line 143
    .line 144
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 150
    .line 151
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p3

    .line 155
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string p3, ", "

    .line 159
    .line 160
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    iget-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->valueField:Ljava/lang/reflect/Member;

    .line 164
    .line 165
    invoke-interface {p3}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p3

    .line 169
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string p3, " "

    .line 173
    .line 174
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_1

    .line 192
    .line 193
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 194
    .line 195
    .line 196
    move-result p4

    .line 197
    if-nez p4, :cond_11

    .line 198
    .line 199
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->stringValues:[Ljava/lang/String;

    .line 200
    .line 201
    if-eqz p4, :cond_9

    .line 202
    .line 203
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 204
    .line 205
    .line 206
    move-result p4

    .line 207
    if-eqz p4, :cond_9

    .line 208
    .line 209
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p4

    .line 213
    :goto_4
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->stringValues:[Ljava/lang/String;

    .line 214
    .line 215
    array-length v3, v2

    .line 216
    if-ge v1, v3, :cond_8

    .line 217
    .line 218
    aget-object v2, v2, v1

    .line 219
    .line 220
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_7

    .line 225
    .line 226
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enums:[Ljava/lang/Enum;

    .line 227
    .line 228
    aget-object p5, p5, v1

    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_8
    :goto_5
    if-nez p5, :cond_f

    .line 235
    .line 236
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->valueField:Ljava/lang/reflect/Member;

    .line 237
    .line 238
    if-eqz v1, :cond_f

    .line 239
    .line 240
    :try_start_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 241
    .line 242
    invoke-static {v1, p4}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 243
    .line 244
    .line 245
    move-result-object p5
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2

    .line 246
    goto :goto_7

    .line 247
    :cond_9
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->intValues:[J

    .line 248
    .line 249
    if-eqz p4, :cond_b

    .line 250
    .line 251
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 252
    .line 253
    .line 254
    move-result p4

    .line 255
    if-eqz p4, :cond_b

    .line 256
    .line 257
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 258
    .line 259
    .line 260
    move-result p4

    .line 261
    :goto_6
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->intValues:[J

    .line 262
    .line 263
    array-length v3, v2

    .line 264
    if-ge v1, v3, :cond_f

    .line 265
    .line 266
    aget-wide v3, v2, v1

    .line 267
    .line 268
    int-to-long v5, p4

    .line 269
    cmp-long v2, v3, v5

    .line 270
    .line 271
    if-nez v2, :cond_a

    .line 272
    .line 273
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enums:[Ljava/lang/Enum;

    .line 274
    .line 275
    aget-object p5, p4, v1

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readValueHashCode()J

    .line 282
    .line 283
    .line 284
    move-result-wide v1

    .line 285
    const-wide v3, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    cmp-long p4, v1, v3

    .line 291
    .line 292
    if-nez p4, :cond_c

    .line 293
    .line 294
    return-object p5

    .line 295
    :cond_c
    invoke-virtual {p0, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->getEnumByHashCode(J)Ljava/lang/Enum;

    .line 296
    .line 297
    .line 298
    move-result-object p4

    .line 299
    if-nez p4, :cond_d

    .line 300
    .line 301
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 302
    .line 303
    .line 304
    move-result-wide p4

    .line 305
    invoke-virtual {p0, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->getEnumByHashCode(J)Ljava/lang/Enum;

    .line 306
    .line 307
    .line 308
    move-result-object p4

    .line 309
    :cond_d
    if-nez p4, :cond_e

    .line 310
    .line 311
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object p5

    .line 315
    invoke-static {p5}, Lcom/alibaba/fastjson2/util/TypeUtils;->isInteger(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-eqz v1, :cond_e

    .line 320
    .line 321
    invoke-static {p5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    move-result p5

    .line 325
    if-ltz p5, :cond_e

    .line 326
    .line 327
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->ordinalEnums:[Ljava/lang/Enum;

    .line 328
    .line 329
    array-length v2, v1

    .line 330
    if-ge p5, v2, :cond_e

    .line 331
    .line 332
    aget-object p4, v1, p5

    .line 333
    .line 334
    :cond_e
    move-object p5, p4

    .line 335
    :catch_2
    :cond_f
    :goto_7
    if-nez p5, :cond_11

    .line 336
    .line 337
    sget-object p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnEnumNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 338
    .line 339
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/JSONReader;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 340
    .line 341
    .line 342
    move-result p4

    .line 343
    if-nez p4, :cond_10

    .line 344
    .line 345
    goto :goto_8

    .line 346
    :cond_10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    new-instance p3, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    iget-object p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->enumClass:Ljava/lang/Class;

    .line 356
    .line 357
    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p4

    .line 361
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    const-string p4, ", value "

    .line 365
    .line 366
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 370
    .line 371
    .line 372
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p2

    .line 376
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    goto/16 :goto_1

    .line 384
    .line 385
    :cond_11
    :goto_8
    if-nez p5, :cond_12

    .line 386
    .line 387
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getOffset()I

    .line 388
    .line 389
    .line 390
    move-result p1

    .line 391
    if-ne p1, p3, :cond_12

    .line 392
    .line 393
    invoke-direct {p0, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;->oomCheck(Ljava/lang/reflect/Type;)V

    .line 394
    .line 395
    .line 396
    :cond_12
    return-object p5
.end method
