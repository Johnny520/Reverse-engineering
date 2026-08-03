.class public Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;,
        Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 7
    .line 8
    return-void
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

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/reflect/Method;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->lambda$createBuildFunction$3(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/String;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->lambda$createObjectReaderWithCreator$1(Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/String;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;ILjava/util/LinkedHashMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->lambda$createObjectReaderWithBuilder$0(Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;ILjava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Ljava/util/ArrayList;Ljava/lang/reflect/Constructor;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->lambda$createObjectReader$2(Ljava/util/List;Ljava/lang/reflect/Constructor;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getInitReader(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/reflect/Type;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/FieldInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 6

    .line 1
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/codec/FieldInfo;->getInitReader()Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_6

    .line 6
    .line 7
    iget-object v1, p3, Lcom/alibaba/fastjson2/codec/FieldInfo;->keyUsing:Ljava/lang/Class;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p3, Lcom/alibaba/fastjson2/codec/FieldInfo;->valueUsing:Ljava/lang/Class;

    .line 12
    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    :cond_0
    const-class v1, Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {v1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_6

    .line 22
    .line 23
    iget-object v1, p3, Lcom/alibaba/fastjson2/codec/FieldInfo;->keyUsing:Ljava/lang/Class;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lcom/alibaba/fastjson2/reader/ObjectReader;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    :cond_1
    move-object v1, v3

    .line 44
    :goto_0
    iget-object v4, p3, Lcom/alibaba/fastjson2/codec/FieldInfo;->valueUsing:Ljava/lang/Class;

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    :try_start_1
    invoke-virtual {v4, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    check-cast v2, Lcom/alibaba/fastjson2/reader/ObjectReader;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    .line 61
    move-object v3, v2

    .line 62
    :catch_1
    :cond_2
    if-nez v1, :cond_3

    .line 63
    .line 64
    if-eqz v3, :cond_6

    .line 65
    .line 66
    :cond_3
    iget-wide v4, p3, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 67
    .line 68
    invoke-static {p1, p2, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    instance-of p3, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;

    .line 73
    .line 74
    if-eqz p3, :cond_6

    .line 75
    .line 76
    check-cast p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;

    .line 77
    .line 78
    if-eqz v1, :cond_4

    .line 79
    .line 80
    iput-object v1, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->keyObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 81
    .line 82
    :cond_4
    if-eqz v3, :cond_5

    .line 83
    .line 84
    iput-object v3, p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplMapTyped;->valueObjectReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 85
    .line 86
    :cond_5
    return-object p1

    .line 87
    :cond_6
    if-nez v0, :cond_9

    .line 88
    .line 89
    const-class p1, Ljava/math/BigDecimal;

    .line 90
    .line 91
    const/4 p3, 0x0

    .line 92
    if-ne p2, p1, :cond_7

    .line 93
    .line 94
    invoke-virtual {p0, p1, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    sget-object p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplBigDecimal;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplBigDecimal;

    .line 99
    .line 100
    if-eq p0, p1, :cond_9

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_7
    const-class p1, Ljava/math/BigInteger;

    .line 104
    .line 105
    if-ne p2, p1, :cond_8

    .line 106
    .line 107
    invoke-virtual {p0, p1, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    sget-object p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplBigInteger;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplBigInteger;

    .line 112
    .line 113
    if-eq p0, p1, :cond_9

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_8
    const-class p1, Ljava/util/Date;

    .line 117
    .line 118
    if-ne p2, p1, :cond_9

    .line 119
    .line 120
    invoke-virtual {p0, p1, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    sget-object p1, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;

    .line 125
    .line 126
    if-eq p0, p1, :cond_9

    .line 127
    .line 128
    :goto_1
    move-object v0, p0

    .line 129
    :cond_9
    return-object v0
.end method

.method private static synthetic lambda$createBuildFunction$3(Ljava/lang/reflect/Method;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    return-object p0

    .line 7
    :catchall_0
    move-exception p0

    .line 8
    const-string p1, "create instance error"

    .line 9
    .line 10
    invoke-static {p1, p0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0
.end method

.method private static synthetic lambda$createObjectReader$2(Ljava/util/List;Ljava/lang/reflect/Constructor;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private synthetic lambda$createObjectReaderWithBuilder$0(Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;ILjava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/reflect/Method;)V
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    move-object/from16 v14, p10

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    move-object/from16 v3, p3

    .line 13
    .line 14
    invoke-virtual {v2, v0, v3, v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_7

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iget-object v2, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 40
    .line 41
    :goto_0
    move-object/from16 v5, p5

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_2
    :goto_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    invoke-virtual/range {p4 .. p4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-le v3, v5, :cond_4

    .line 53
    .line 54
    move-object/from16 v3, p4

    .line 55
    .line 56
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move/from16 v3, p7

    .line 64
    .line 65
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->setterName(Ljava/lang/String;I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    goto :goto_0

    .line 70
    :cond_4
    :goto_2
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-class v5, Ljava/lang/Object;

    .line 75
    .line 76
    if-eq v3, v5, :cond_c

    .line 77
    .line 78
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    move-object/from16 v5, p5

    .line 83
    .line 84
    if-ne v3, v5, :cond_c

    .line 85
    .line 86
    const-class v3, Lcom/alibaba/fastjson2/annotation/JSONField;

    .line 87
    .line 88
    invoke-virtual {v14, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    if-nez v3, :cond_5

    .line 93
    .line 94
    move-object/from16 v3, p6

    .line 95
    .line 96
    iget-wide v6, v3, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 97
    .line 98
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 99
    .line 100
    iget-wide v8, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 101
    .line 102
    and-long/2addr v6, v8

    .line 103
    const-wide/16 v8, 0x0

    .line 104
    .line 105
    cmp-long v3, v6, v8

    .line 106
    .line 107
    if-eqz v3, :cond_c

    .line 108
    .line 109
    :cond_5
    :goto_3
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    array-length v3, v3

    .line 114
    if-nez v3, :cond_7

    .line 115
    .line 116
    iget v6, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 117
    .line 118
    iget-wide v7, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 119
    .line 120
    iget-object v9, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 121
    .line 122
    iget-object v10, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 123
    .line 124
    iget-object v11, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 127
    .line 128
    .line 129
    move-result-object v12

    .line 130
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    const/4 v15, 0x0

    .line 135
    move-object/from16 v4, p5

    .line 136
    .line 137
    move-object v3, v5

    .line 138
    move-object v5, v2

    .line 139
    move-object/from16 v2, p0

    .line 140
    .line 141
    invoke-virtual/range {v2 .. v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 150
    .line 151
    if-nez v2, :cond_6

    .line 152
    .line 153
    invoke-interface {v1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_6
    invoke-virtual {v2, v0}, Lcom/alibaba/fastjson2/reader/FieldReader;->compareTo(Lcom/alibaba/fastjson2/reader/FieldReader;)I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-lez v2, :cond_c

    .line 162
    .line 163
    invoke-interface {v1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_7
    move-object v5, v2

    .line 168
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    aget-object v12, v2, v4

    .line 173
    .line 174
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    aget-object v13, v2, v4

    .line 179
    .line 180
    const/4 v2, 0x1

    .line 181
    invoke-virtual {v14, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 182
    .line 183
    .line 184
    iget v6, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 185
    .line 186
    iget-wide v7, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 187
    .line 188
    iget-object v9, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 189
    .line 190
    iget-object v10, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 191
    .line 192
    iget-object v11, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 193
    .line 194
    const/4 v15, 0x0

    .line 195
    move-object/from16 v2, p0

    .line 196
    .line 197
    move-object/from16 v3, p5

    .line 198
    .line 199
    move/from16 v16, v4

    .line 200
    .line 201
    move-object/from16 v4, p9

    .line 202
    .line 203
    invoke-virtual/range {v2 .. v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    move-object v2, v5

    .line 208
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    check-cast v3, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 213
    .line 214
    if-nez v3, :cond_8

    .line 215
    .line 216
    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_8
    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson2/reader/FieldReader;->compareTo(Lcom/alibaba/fastjson2/reader/FieldReader;)I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    if-lez v3, :cond_9

    .line 225
    .line 226
    invoke-interface {v1, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    :cond_9
    :goto_4
    iget-object v3, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 230
    .line 231
    if-eqz v3, :cond_c

    .line 232
    .line 233
    move/from16 v4, v16

    .line 234
    .line 235
    :goto_5
    array-length v5, v3

    .line 236
    if-ge v4, v5, :cond_c

    .line 237
    .line 238
    aget-object v5, v3, v4

    .line 239
    .line 240
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_b

    .line 245
    .line 246
    :cond_a
    move-object/from16 v16, v2

    .line 247
    .line 248
    move-object/from16 v17, v3

    .line 249
    .line 250
    move/from16 v18, v4

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_b
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    check-cast v6, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 258
    .line 259
    if-nez v6, :cond_a

    .line 260
    .line 261
    iget v6, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 262
    .line 263
    iget-wide v7, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 264
    .line 265
    iget-object v9, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v10, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 268
    .line 269
    iget-object v11, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 270
    .line 271
    const/4 v15, 0x0

    .line 272
    move-object/from16 v14, p10

    .line 273
    .line 274
    move-object/from16 v16, v2

    .line 275
    .line 276
    move-object/from16 v17, v3

    .line 277
    .line 278
    move/from16 v18, v4

    .line 279
    .line 280
    move-object/from16 v2, p0

    .line 281
    .line 282
    move-object/from16 v3, p5

    .line 283
    .line 284
    move-object/from16 v4, p9

    .line 285
    .line 286
    invoke-virtual/range {v2 .. v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 287
    .line 288
    .line 289
    move-result-object v6

    .line 290
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    :goto_6
    add-int/lit8 v4, v18, 0x1

    .line 294
    .line 295
    move-object/from16 v2, v16

    .line 296
    .line 297
    move-object/from16 v3, v17

    .line 298
    .line 299
    goto :goto_5

    .line 300
    :cond_c
    :goto_7
    return-void
.end method

.method private static synthetic lambda$createObjectReaderWithCreator$1(Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/String;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V
    .locals 1

    .line 1
    invoke-virtual {p6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eq v0, p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p0, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0, p2, p6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 17
    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-boolean p1, p3, Lcom/alibaba/fastjson2/codec/BeanInfo;->kotlin:Z

    .line 21
    .line 22
    sget-object p2, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->CamelCase:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p6, p1, p2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/reflect/Method;ZLjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :cond_1
    iget-object p2, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->readUsing:Ljava/lang/Class;

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    invoke-virtual {p4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object p0, p0, Lcom/alibaba/fastjson2/codec/FieldInfo;->readUsing:Ljava/lang/Class;

    .line 43
    .line 44
    iput-object p0, p5, Lcom/alibaba/fastjson2/codec/FieldInfo;->readUsing:Ljava/lang/Class;

    .line 45
    .line 46
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public createBuildFunction(Ljava/lang/reflect/Method;)Ljava/util/function/Function;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Method;",
            ")",
            "Ljava/util/function/Function<",
            "TT;TR;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lbc/j;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    invoke-direct {v0, p1, v1}, Lbc/j;-><init>(Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public createEnumReader(Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 11

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    move-object v7, v1

    .line 11
    check-cast v7, [Ljava/lang/Enum;

    .line 12
    .line 13
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-eqz v7, :cond_4

    .line 21
    .line 22
    array-length v4, v7

    .line 23
    if-ge v3, v4, :cond_4

    .line 24
    .line 25
    aget-object v4, v7, v3

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 32
    .line 33
    .line 34
    move-result-wide v8

    .line 35
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-interface {v1, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, v5}, Lcom/alibaba/fastjson2/util/BeanUtils;->getField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {p3, v0, p1, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 50
    .line 51
    .line 52
    iget-object v6, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v6, :cond_0

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-nez v8, :cond_0

    .line 61
    .line 62
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_0

    .line 67
    .line 68
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    :cond_0
    iget-object v5, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v5, :cond_3

    .line 82
    .line 83
    array-length v6, v5

    .line 84
    move v8, v2

    .line 85
    :goto_1
    if-ge v8, v6, :cond_3

    .line 86
    .line 87
    aget-object v9, v5, v8

    .line 88
    .line 89
    if-eqz v9, :cond_2

    .line 90
    .line 91
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-eqz v10, :cond_1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    invoke-static {v9}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 99
    .line 100
    .line 101
    move-result-wide v9

    .line 102
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-interface {v1, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :catch_0
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    move v0, v2

    .line 116
    :goto_3
    if-eqz v7, :cond_6

    .line 117
    .line 118
    array-length v3, v7

    .line 119
    if-ge v0, v3, :cond_6

    .line 120
    .line 121
    aget-object v3, v7, v0

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v5

    .line 131
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v3}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_5

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_5
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    :goto_4
    add-int/lit8 v0, v0, 0x1

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    new-array v8, v0, [J

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    move v4, v2

    .line 178
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_7

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    check-cast v5, Ljava/lang/Long;

    .line 189
    .line 190
    add-int/lit8 v6, v4, 0x1

    .line 191
    .line 192
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 193
    .line 194
    .line 195
    move-result-wide v9

    .line 196
    aput-wide v9, v8, v4

    .line 197
    .line 198
    move v4, v6

    .line 199
    goto :goto_5

    .line 200
    :cond_7
    invoke-static {v8}, Ljava/util/Arrays;->sort([J)V

    .line 201
    .line 202
    .line 203
    invoke-static {p1, p3}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumValueField(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/reflect/Member;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    if-nez v3, :cond_8

    .line 208
    .line 209
    if-eqz p3, :cond_8

    .line 210
    .line 211
    iget-object v4, p3, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    .line 212
    .line 213
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    check-cast v4, Ljava/lang/Class;

    .line 218
    .line 219
    if-eqz v4, :cond_8

    .line 220
    .line 221
    invoke-static {v4, p3}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumValueField(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/reflect/Member;

    .line 222
    .line 223
    .line 224
    move-result-object p3

    .line 225
    instance-of v4, p3, Ljava/lang/reflect/Field;

    .line 226
    .line 227
    if-eqz v4, :cond_9

    .line 228
    .line 229
    :try_start_1
    check-cast p3, Ljava/lang/reflect/Field;

    .line 230
    .line 231
    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    invoke-virtual {p1, p3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 236
    .line 237
    .line 238
    move-result-object v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 239
    :catch_1
    :cond_8
    :goto_6
    move-object v5, v3

    .line 240
    goto :goto_7

    .line 241
    :cond_9
    instance-of v4, p3, Ljava/lang/reflect/Method;

    .line 242
    .line 243
    if-eqz v4, :cond_8

    .line 244
    .line 245
    :try_start_2
    check-cast p3, Ljava/lang/reflect/Method;

    .line 246
    .line 247
    invoke-virtual {p3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p3

    .line 251
    const/4 v4, 0x0

    .line 252
    invoke-virtual {p1, p3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 253
    .line 254
    .line 255
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_1

    .line 256
    goto :goto_6

    .line 257
    :goto_7
    new-array v6, v0, [Ljava/lang/Enum;

    .line 258
    .line 259
    move p3, v2

    .line 260
    :goto_8
    if-ge p3, v0, :cond_a

    .line 261
    .line 262
    aget-wide v3, v8, p3

    .line 263
    .line 264
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    check-cast v3, Ljava/lang/Enum;

    .line 273
    .line 274
    aput-object v3, v6, p3

    .line 275
    .line 276
    add-int/lit8 p3, p3, 0x1

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_a
    if-nez p2, :cond_b

    .line 280
    .line 281
    if-nez v5, :cond_b

    .line 282
    .line 283
    if-eqz v7, :cond_b

    .line 284
    .line 285
    array-length p3, v7

    .line 286
    const/4 v1, 0x2

    .line 287
    if-ne p3, v1, :cond_b

    .line 288
    .line 289
    aget-object p3, v7, v2

    .line 290
    .line 291
    :goto_9
    if-ge v2, v0, :cond_b

    .line 292
    .line 293
    aget-object p3, v6, v2

    .line 294
    .line 295
    add-int/lit8 v2, v2, 0x1

    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_b
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;

    .line 299
    .line 300
    move-object v3, p1

    .line 301
    move-object v4, p2

    .line 302
    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplEnum;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/lang/reflect/Member;[Ljava/lang/Enum;[Ljava/lang/Enum;[J)V

    .line 303
    .line 304
    .line 305
    return-object v2
.end method

.method public varargs createFactoryFunction(Ljava/lang/reflect/Method;[Ljava/lang/String;)Ljava/util/function/Function;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Method;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/function/Function<",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, Lcom/alibaba/fastjson2/reader/FactoryFunction;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FactoryFunction;-><init>(Ljava/lang/reflect/Method;[Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public createFieldReader(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    .line 1136
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReader(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v3, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    .line 1144
    invoke-virtual/range {v0 .. v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Field;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader<",
            "TT;>;"
        }
    .end annotation

    .line 1142
    invoke-virtual/range {p12 .. p12}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v12

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    .line 1143
    invoke-virtual/range {v1 .. v16}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v0

    return-object v0
.end method

.method public createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Field;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            "Ljava/lang/String;",
            "Ljava/util/function/BiConsumer;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    move-object/from16 v2, p10

    .line 4
    .line 5
    move-object/from16 v3, p11

    .line 6
    .line 7
    move-object/from16 v8, p12

    .line 8
    .line 9
    move-object/from16 v10, p13

    .line 10
    .line 11
    instance-of v1, v0, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Class;->isEnum()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3, v0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :cond_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eq v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v1, v4, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_1
    move-object v9, v0

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, "illegal defaultValue : "

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", class "

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v1, v0, v2}, Lah/a;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    return-object v0

    .line 76
    :goto_0
    const/4 v0, 0x1

    .line 77
    const/4 v1, 0x0

    .line 78
    if-eqz v8, :cond_3

    .line 79
    .line 80
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    const-string v5, "java.lang"

    .line 85
    .line 86
    invoke-virtual {v4, v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-nez v4, :cond_3

    .line 91
    .line 92
    invoke-virtual {v8, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 93
    .line 94
    .line 95
    :cond_3
    if-eqz v10, :cond_4

    .line 96
    .line 97
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectField;

    .line 98
    .line 99
    const-wide/high16 v4, 0x8000000000000L

    .line 100
    .line 101
    or-long v5, p5, v4

    .line 102
    .line 103
    move-object v1, v9

    .line 104
    move-object v9, v8

    .line 105
    move-object v8, v1

    .line 106
    move-object/from16 v1, p3

    .line 107
    .line 108
    move/from16 v4, p4

    .line 109
    .line 110
    move-object/from16 v7, p7

    .line 111
    .line 112
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/reader/FieldReaderObjectField;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Field;)V

    .line 113
    .line 114
    .line 115
    iput-object v10, v0, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->initReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_4
    move-object v2, v3

    .line 119
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 120
    .line 121
    if-ne v2, v3, :cond_5

    .line 122
    .line 123
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt32ValueField;

    .line 124
    .line 125
    move-object v5, v9

    .line 126
    check-cast v5, Ljava/lang/Integer;

    .line 127
    .line 128
    move-object/from16 v1, p3

    .line 129
    .line 130
    move/from16 v3, p4

    .line 131
    .line 132
    move-object/from16 v4, p7

    .line 133
    .line 134
    move-object/from16 v6, p12

    .line 135
    .line 136
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/FieldReaderInt32ValueField;-><init>(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/reflect/Field;)V

    .line 137
    .line 138
    .line 139
    return-object v0

    .line 140
    :cond_5
    const-class v3, Ljava/lang/Integer;

    .line 141
    .line 142
    if-ne v2, v3, :cond_6

    .line 143
    .line 144
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt32Field;

    .line 145
    .line 146
    move-object v7, v9

    .line 147
    check-cast v7, Ljava/lang/Integer;

    .line 148
    .line 149
    move-object/from16 v1, p3

    .line 150
    .line 151
    move/from16 v3, p4

    .line 152
    .line 153
    move-wide/from16 v4, p5

    .line 154
    .line 155
    move-object/from16 v6, p7

    .line 156
    .line 157
    move-object/from16 v8, p12

    .line 158
    .line 159
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt32Field;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/reflect/Field;)V

    .line 160
    .line 161
    .line 162
    return-object v0

    .line 163
    :cond_6
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 164
    .line 165
    if-ne v2, v3, :cond_7

    .line 166
    .line 167
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueField;

    .line 168
    .line 169
    move-object v7, v9

    .line 170
    check-cast v7, Ljava/lang/Long;

    .line 171
    .line 172
    move-object/from16 v1, p3

    .line 173
    .line 174
    move/from16 v3, p4

    .line 175
    .line 176
    move-wide/from16 v4, p5

    .line 177
    .line 178
    move-object/from16 v6, p7

    .line 179
    .line 180
    move-object/from16 v8, p12

    .line 181
    .line 182
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Long;Ljava/lang/reflect/Field;)V

    .line 183
    .line 184
    .line 185
    return-object v0

    .line 186
    :cond_7
    const-class v3, Ljava/lang/Long;

    .line 187
    .line 188
    if-ne v2, v3, :cond_8

    .line 189
    .line 190
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64Field;

    .line 191
    .line 192
    move-object v7, v9

    .line 193
    check-cast v7, Ljava/lang/Long;

    .line 194
    .line 195
    move-object/from16 v1, p3

    .line 196
    .line 197
    move/from16 v3, p4

    .line 198
    .line 199
    move-wide/from16 v4, p5

    .line 200
    .line 201
    move-object/from16 v6, p7

    .line 202
    .line 203
    move-object/from16 v8, p12

    .line 204
    .line 205
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt64Field;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Long;Ljava/lang/reflect/Field;)V

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_8
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 210
    .line 211
    if-ne v2, v3, :cond_9

    .line 212
    .line 213
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt16ValueField;

    .line 214
    .line 215
    move-object v7, v9

    .line 216
    check-cast v7, Ljava/lang/Short;

    .line 217
    .line 218
    move-object/from16 v1, p3

    .line 219
    .line 220
    move/from16 v3, p4

    .line 221
    .line 222
    move-wide/from16 v4, p5

    .line 223
    .line 224
    move-object/from16 v6, p7

    .line 225
    .line 226
    move-object/from16 v8, p12

    .line 227
    .line 228
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt16ValueField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Short;Ljava/lang/reflect/Field;)V

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :cond_9
    const-class v3, Ljava/lang/Short;

    .line 233
    .line 234
    if-ne v2, v3, :cond_a

    .line 235
    .line 236
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt16Field;

    .line 237
    .line 238
    move-object v7, v9

    .line 239
    check-cast v7, Ljava/lang/Short;

    .line 240
    .line 241
    move-object/from16 v1, p3

    .line 242
    .line 243
    move/from16 v3, p4

    .line 244
    .line 245
    move-wide/from16 v4, p5

    .line 246
    .line 247
    move-object/from16 v6, p7

    .line 248
    .line 249
    move-object/from16 v8, p12

    .line 250
    .line 251
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt16Field;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Short;Ljava/lang/reflect/Field;)V

    .line 252
    .line 253
    .line 254
    return-object v0

    .line 255
    :cond_a
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 256
    .line 257
    if-ne v2, v3, :cond_b

    .line 258
    .line 259
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolValueField;

    .line 260
    .line 261
    move-object v6, v9

    .line 262
    check-cast v6, Ljava/lang/Boolean;

    .line 263
    .line 264
    move-object/from16 v1, p3

    .line 265
    .line 266
    move/from16 v2, p4

    .line 267
    .line 268
    move-wide/from16 v3, p5

    .line 269
    .line 270
    move-object/from16 v5, p7

    .line 271
    .line 272
    move-object/from16 v7, p12

    .line 273
    .line 274
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/FieldReaderBoolValueField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/reflect/Field;)V

    .line 275
    .line 276
    .line 277
    return-object v0

    .line 278
    :cond_b
    const-class v3, Ljava/lang/Boolean;

    .line 279
    .line 280
    if-ne v2, v3, :cond_c

    .line 281
    .line 282
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolField;

    .line 283
    .line 284
    move-object v7, v9

    .line 285
    check-cast v7, Ljava/lang/Boolean;

    .line 286
    .line 287
    move-object/from16 v1, p3

    .line 288
    .line 289
    move/from16 v3, p4

    .line 290
    .line 291
    move-wide/from16 v4, p5

    .line 292
    .line 293
    move-object/from16 v6, p7

    .line 294
    .line 295
    move-object/from16 v8, p12

    .line 296
    .line 297
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderBoolField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/reflect/Field;)V

    .line 298
    .line 299
    .line 300
    return-object v0

    .line 301
    :cond_c
    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 302
    .line 303
    if-ne v2, v3, :cond_d

    .line 304
    .line 305
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueField;

    .line 306
    .line 307
    move-object v7, v9

    .line 308
    check-cast v7, Ljava/lang/Byte;

    .line 309
    .line 310
    move-object/from16 v1, p3

    .line 311
    .line 312
    move/from16 v3, p4

    .line 313
    .line 314
    move-wide/from16 v4, p5

    .line 315
    .line 316
    move-object/from16 v6, p7

    .line 317
    .line 318
    move-object/from16 v8, p12

    .line 319
    .line 320
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Byte;Ljava/lang/reflect/Field;)V

    .line 321
    .line 322
    .line 323
    return-object v0

    .line 324
    :cond_d
    const-class v3, Ljava/lang/Byte;

    .line 325
    .line 326
    if-ne v2, v3, :cond_e

    .line 327
    .line 328
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8Field;

    .line 329
    .line 330
    move-object v7, v9

    .line 331
    check-cast v7, Ljava/lang/Byte;

    .line 332
    .line 333
    move-object/from16 v1, p3

    .line 334
    .line 335
    move/from16 v3, p4

    .line 336
    .line 337
    move-wide/from16 v4, p5

    .line 338
    .line 339
    move-object/from16 v6, p7

    .line 340
    .line 341
    move-object/from16 v8, p12

    .line 342
    .line 343
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt8Field;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Byte;Ljava/lang/reflect/Field;)V

    .line 344
    .line 345
    .line 346
    return-object v0

    .line 347
    :cond_e
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 348
    .line 349
    if-ne v2, v3, :cond_f

    .line 350
    .line 351
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderFloatValueField;

    .line 352
    .line 353
    move-object v7, v9

    .line 354
    check-cast v7, Ljava/lang/Float;

    .line 355
    .line 356
    move-object/from16 v1, p3

    .line 357
    .line 358
    move/from16 v3, p4

    .line 359
    .line 360
    move-wide/from16 v4, p5

    .line 361
    .line 362
    move-object/from16 v6, p7

    .line 363
    .line 364
    move-object/from16 v8, p12

    .line 365
    .line 366
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderFloatValueField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Float;Ljava/lang/reflect/Field;)V

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :cond_f
    const-class v3, Ljava/lang/Float;

    .line 371
    .line 372
    if-ne v2, v3, :cond_10

    .line 373
    .line 374
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderFloatField;

    .line 375
    .line 376
    move-object v7, v9

    .line 377
    check-cast v7, Ljava/lang/Float;

    .line 378
    .line 379
    move-object/from16 v1, p3

    .line 380
    .line 381
    move/from16 v3, p4

    .line 382
    .line 383
    move-wide/from16 v4, p5

    .line 384
    .line 385
    move-object/from16 v6, p7

    .line 386
    .line 387
    move-object/from16 v8, p12

    .line 388
    .line 389
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderFloatField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Float;Ljava/lang/reflect/Field;)V

    .line 390
    .line 391
    .line 392
    return-object v0

    .line 393
    :cond_10
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 394
    .line 395
    if-ne v2, v3, :cond_11

    .line 396
    .line 397
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleValueField;

    .line 398
    .line 399
    move-object v7, v9

    .line 400
    check-cast v7, Ljava/lang/Double;

    .line 401
    .line 402
    move-object/from16 v1, p3

    .line 403
    .line 404
    move/from16 v3, p4

    .line 405
    .line 406
    move-wide/from16 v4, p5

    .line 407
    .line 408
    move-object/from16 v6, p7

    .line 409
    .line 410
    move-object/from16 v8, p12

    .line 411
    .line 412
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleValueField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Double;Ljava/lang/reflect/Field;)V

    .line 413
    .line 414
    .line 415
    return-object v0

    .line 416
    :cond_11
    const-class v3, Ljava/lang/Double;

    .line 417
    .line 418
    if-ne v2, v3, :cond_12

    .line 419
    .line 420
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleField;

    .line 421
    .line 422
    move-object v7, v9

    .line 423
    check-cast v7, Ljava/lang/Double;

    .line 424
    .line 425
    move-object/from16 v1, p3

    .line 426
    .line 427
    move/from16 v3, p4

    .line 428
    .line 429
    move-wide/from16 v4, p5

    .line 430
    .line 431
    move-object/from16 v6, p7

    .line 432
    .line 433
    move-object/from16 v8, p12

    .line 434
    .line 435
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Double;Ljava/lang/reflect/Field;)V

    .line 436
    .line 437
    .line 438
    return-object v0

    .line 439
    :cond_12
    sget-object v3, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 440
    .line 441
    if-ne v2, v3, :cond_13

    .line 442
    .line 443
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderCharValueField;

    .line 444
    .line 445
    move-object v6, v9

    .line 446
    check-cast v6, Ljava/lang/Character;

    .line 447
    .line 448
    move-object/from16 v1, p3

    .line 449
    .line 450
    move/from16 v2, p4

    .line 451
    .line 452
    move-wide/from16 v3, p5

    .line 453
    .line 454
    move-object/from16 v5, p7

    .line 455
    .line 456
    move-object/from16 v7, p12

    .line 457
    .line 458
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/FieldReaderCharValueField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Character;Ljava/lang/reflect/Field;)V

    .line 459
    .line 460
    .line 461
    return-object v0

    .line 462
    :cond_13
    const-class v3, Ljava/math/BigDecimal;

    .line 463
    .line 464
    if-ne v2, v3, :cond_14

    .line 465
    .line 466
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBigDecimalField;

    .line 467
    .line 468
    move-object v7, v9

    .line 469
    check-cast v7, Ljava/math/BigDecimal;

    .line 470
    .line 471
    move-object/from16 v1, p3

    .line 472
    .line 473
    move/from16 v3, p4

    .line 474
    .line 475
    move-wide/from16 v4, p5

    .line 476
    .line 477
    move-object/from16 v6, p7

    .line 478
    .line 479
    move-object/from16 v8, p12

    .line 480
    .line 481
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderBigDecimalField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/math/BigDecimal;Ljava/lang/reflect/Field;)V

    .line 482
    .line 483
    .line 484
    return-object v0

    .line 485
    :cond_14
    const-class v3, Ljava/math/BigInteger;

    .line 486
    .line 487
    if-ne v2, v3, :cond_15

    .line 488
    .line 489
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBigIntegerField;

    .line 490
    .line 491
    move-object v7, v9

    .line 492
    check-cast v7, Ljava/math/BigInteger;

    .line 493
    .line 494
    move-object/from16 v1, p3

    .line 495
    .line 496
    move/from16 v3, p4

    .line 497
    .line 498
    move-wide/from16 v4, p5

    .line 499
    .line 500
    move-object/from16 v6, p7

    .line 501
    .line 502
    move-object/from16 v8, p12

    .line 503
    .line 504
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderBigIntegerField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/math/BigInteger;Ljava/lang/reflect/Field;)V

    .line 505
    .line 506
    .line 507
    return-object v0

    .line 508
    :cond_15
    const-class v3, Ljava/lang/String;

    .line 509
    .line 510
    if-ne v2, v3, :cond_16

    .line 511
    .line 512
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderStringField;

    .line 513
    .line 514
    move-object v7, v9

    .line 515
    check-cast v7, Ljava/lang/String;

    .line 516
    .line 517
    move-object/from16 v1, p3

    .line 518
    .line 519
    move/from16 v3, p4

    .line 520
    .line 521
    move-wide/from16 v4, p5

    .line 522
    .line 523
    move-object/from16 v6, p7

    .line 524
    .line 525
    move-object/from16 v8, p12

    .line 526
    .line 527
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderStringField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    .line 528
    .line 529
    .line 530
    return-object v0

    .line 531
    :cond_16
    const-class v4, Ljava/util/Date;

    .line 532
    .line 533
    if-ne v2, v4, :cond_17

    .line 534
    .line 535
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderDate;

    .line 536
    .line 537
    const/4 v11, 0x0

    .line 538
    const/4 v12, 0x0

    .line 539
    move-object/from16 v1, p3

    .line 540
    .line 541
    move/from16 v4, p4

    .line 542
    .line 543
    move-wide/from16 v5, p5

    .line 544
    .line 545
    move-object/from16 v7, p7

    .line 546
    .line 547
    move-object/from16 v8, p8

    .line 548
    .line 549
    move-object/from16 v10, p12

    .line 550
    .line 551
    move-object v3, v2

    .line 552
    move-object/from16 v2, p10

    .line 553
    .line 554
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderDate;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    .line 555
    .line 556
    .line 557
    return-object v0

    .line 558
    :cond_17
    const-class v4, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 559
    .line 560
    if-ne v2, v4, :cond_18

    .line 561
    .line 562
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicBooleanFieldReadOnly;

    .line 563
    .line 564
    move-object v5, v9

    .line 565
    check-cast v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 566
    .line 567
    move-object/from16 v1, p3

    .line 568
    .line 569
    move/from16 v3, p4

    .line 570
    .line 571
    move-object/from16 v4, p7

    .line 572
    .line 573
    move-object/from16 v6, p12

    .line 574
    .line 575
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicBooleanFieldReadOnly;-><init>(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/String;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/reflect/Field;)V

    .line 576
    .line 577
    .line 578
    return-object v0

    .line 579
    :cond_18
    const-class v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 580
    .line 581
    if-ne v2, v4, :cond_19

    .line 582
    .line 583
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicReferenceField;

    .line 584
    .line 585
    move-object/from16 v1, p3

    .line 586
    .line 587
    move/from16 v4, p4

    .line 588
    .line 589
    move-object/from16 v5, p7

    .line 590
    .line 591
    move-object/from16 v6, p12

    .line 592
    .line 593
    move-object v3, v2

    .line 594
    move-object/from16 v2, p10

    .line 595
    .line 596
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicReferenceField;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;ILjava/lang/String;Ljava/lang/reflect/Field;)V

    .line 597
    .line 598
    .line 599
    return-object v0

    .line 600
    :cond_19
    move-object/from16 v8, p12

    .line 601
    .line 602
    move-object v4, v2

    .line 603
    move-object/from16 v2, p10

    .line 604
    .line 605
    instance-of v5, v2, Ljava/lang/Class;

    .line 606
    .line 607
    const/4 v6, 0x0

    .line 608
    if-nez v5, :cond_1a

    .line 609
    .line 610
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson2/TypeReference;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/TypeReference;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    move-object/from16 v7, p1

    .line 615
    .line 616
    invoke-static {v5, v7, v8, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getFieldType(Lcom/alibaba/fastjson2/TypeReference;Ljava/lang/Class;Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    move-result-object v7

    .line 624
    goto :goto_1

    .line 625
    :cond_1a
    move-object v5, v6

    .line 626
    move-object v7, v5

    .line 627
    :goto_1
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 628
    .line 629
    .line 630
    move-result v10

    .line 631
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 632
    .line 633
    .line 634
    move-result v10

    .line 635
    const-class v11, Ljava/util/Collection;

    .line 636
    .line 637
    invoke-virtual {v11, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 638
    .line 639
    .line 640
    move-result v11

    .line 641
    const-wide/16 v12, 0x0

    .line 642
    .line 643
    if-eqz v11, :cond_21

    .line 644
    .line 645
    instance-of v11, v5, Ljava/lang/reflect/ParameterizedType;

    .line 646
    .line 647
    if-eqz v11, :cond_1e

    .line 648
    .line 649
    move-object v11, v5

    .line 650
    check-cast v11, Ljava/lang/reflect/ParameterizedType;

    .line 651
    .line 652
    invoke-interface {v11}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 653
    .line 654
    .line 655
    move-result-object v11

    .line 656
    array-length v14, v11

    .line 657
    if-ne v14, v0, :cond_1e

    .line 658
    .line 659
    aget-object v4, v11, v1

    .line 660
    .line 661
    move-object v2, v5

    .line 662
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    move-result-object v5

    .line 666
    if-ne v5, v3, :cond_1d

    .line 667
    .line 668
    if-eqz v10, :cond_1c

    .line 669
    .line 670
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 671
    .line 672
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 673
    .line 674
    and-long v0, p5, v0

    .line 675
    .line 676
    cmp-long v0, v0, v12

    .line 677
    .line 678
    if-eqz v0, :cond_1b

    .line 679
    .line 680
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderListFieldUF;

    .line 681
    .line 682
    const-class v5, Ljava/lang/String;

    .line 683
    .line 684
    const/4 v11, 0x0

    .line 685
    const-class v4, Ljava/lang/String;

    .line 686
    .line 687
    move-object/from16 v1, p3

    .line 688
    .line 689
    move/from16 v6, p4

    .line 690
    .line 691
    move-object/from16 v9, p7

    .line 692
    .line 693
    move-object/from16 v10, p8

    .line 694
    .line 695
    move-object v3, v7

    .line 696
    move-object v12, v8

    .line 697
    move-wide/from16 v7, p5

    .line 698
    .line 699
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderListFieldUF;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/util/Collection;Ljava/lang/reflect/Field;)V

    .line 700
    .line 701
    .line 702
    return-object v0

    .line 703
    :cond_1b
    move-object v3, v7

    .line 704
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderCollectionFieldReadOnly;

    .line 705
    .line 706
    move-object/from16 v1, p3

    .line 707
    .line 708
    move/from16 v4, p4

    .line 709
    .line 710
    move-wide/from16 v5, p5

    .line 711
    .line 712
    move-object/from16 v7, p7

    .line 713
    .line 714
    move-object/from16 v8, p12

    .line 715
    .line 716
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderCollectionFieldReadOnly;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/reflect/Field;)V

    .line 717
    .line 718
    .line 719
    return-object v0

    .line 720
    :cond_1c
    move-object v3, v7

    .line 721
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderListFieldUF;

    .line 722
    .line 723
    const-class v5, Ljava/lang/String;

    .line 724
    .line 725
    const/4 v11, 0x0

    .line 726
    const-class v4, Ljava/lang/String;

    .line 727
    .line 728
    move-object/from16 v1, p3

    .line 729
    .line 730
    move/from16 v6, p4

    .line 731
    .line 732
    move-wide/from16 v7, p5

    .line 733
    .line 734
    move-object/from16 v9, p7

    .line 735
    .line 736
    move-object/from16 v10, p8

    .line 737
    .line 738
    move-object/from16 v12, p12

    .line 739
    .line 740
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderListFieldUF;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/util/Collection;Ljava/lang/reflect/Field;)V

    .line 741
    .line 742
    .line 743
    return-object v0

    .line 744
    :cond_1d
    move-object v3, v7

    .line 745
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderListFieldUF;

    .line 746
    .line 747
    move-object v11, v9

    .line 748
    check-cast v11, Ljava/util/Collection;

    .line 749
    .line 750
    move-object/from16 v1, p3

    .line 751
    .line 752
    move/from16 v6, p4

    .line 753
    .line 754
    move-wide/from16 v7, p5

    .line 755
    .line 756
    move-object/from16 v9, p7

    .line 757
    .line 758
    move-object/from16 v10, p8

    .line 759
    .line 760
    move-object/from16 v12, p12

    .line 761
    .line 762
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderListFieldUF;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/util/Collection;Ljava/lang/reflect/Field;)V

    .line 763
    .line 764
    .line 765
    return-object v0

    .line 766
    :cond_1e
    instance-of v0, v2, Ljava/lang/reflect/ParameterizedType;

    .line 767
    .line 768
    if-eqz v0, :cond_1f

    .line 769
    .line 770
    move-object v0, v2

    .line 771
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 772
    .line 773
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    array-length v3, v0

    .line 778
    if-lez v3, :cond_1f

    .line 779
    .line 780
    aget-object v6, v0, v1

    .line 781
    .line 782
    :cond_1f
    if-nez v6, :cond_20

    .line 783
    .line 784
    const-class v6, Ljava/lang/Object;

    .line 785
    .line 786
    :cond_20
    invoke-static {v6}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    move-result-object v5

    .line 790
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderListFieldUF;

    .line 791
    .line 792
    move-object v11, v9

    .line 793
    check-cast v11, Ljava/util/Collection;

    .line 794
    .line 795
    move-object/from16 v1, p3

    .line 796
    .line 797
    move-wide/from16 v7, p5

    .line 798
    .line 799
    move-object/from16 v9, p7

    .line 800
    .line 801
    move-object/from16 v10, p8

    .line 802
    .line 803
    move-object/from16 v12, p12

    .line 804
    .line 805
    move-object v3, v4

    .line 806
    move-object v4, v6

    .line 807
    move/from16 v6, p4

    .line 808
    .line 809
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderListFieldUF;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/util/Collection;Ljava/lang/reflect/Field;)V

    .line 810
    .line 811
    .line 812
    return-object v0

    .line 813
    :cond_21
    move-object v2, v4

    .line 814
    move-object v3, v7

    .line 815
    const-class v0, Ljava/util/Map;

    .line 816
    .line 817
    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 818
    .line 819
    .line 820
    move-result v1

    .line 821
    if-eqz v1, :cond_22

    .line 822
    .line 823
    instance-of v1, v5, Ljava/lang/reflect/ParameterizedType;

    .line 824
    .line 825
    if-eqz v1, :cond_22

    .line 826
    .line 827
    move-object v1, v5

    .line 828
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 829
    .line 830
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    array-length v1, v1

    .line 835
    const/4 v4, 0x2

    .line 836
    if-ne v1, v4, :cond_22

    .line 837
    .line 838
    if-eqz v10, :cond_22

    .line 839
    .line 840
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 841
    .line 842
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 843
    .line 844
    and-long v6, p5, v6

    .line 845
    .line 846
    cmp-long v1, v6, v12

    .line 847
    .line 848
    if-nez v1, :cond_22

    .line 849
    .line 850
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderMapFieldReadOnly;

    .line 851
    .line 852
    move-object/from16 v1, p3

    .line 853
    .line 854
    move/from16 v4, p4

    .line 855
    .line 856
    move-object/from16 v7, p7

    .line 857
    .line 858
    move-object/from16 v8, p12

    .line 859
    .line 860
    move-object/from16 v9, p14

    .line 861
    .line 862
    move-object/from16 v10, p15

    .line 863
    .line 864
    move-object v2, v5

    .line 865
    move-wide/from16 v5, p5

    .line 866
    .line 867
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderMapFieldReadOnly;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/util/function/BiConsumer;)V

    .line 868
    .line 869
    .line 870
    return-object v0

    .line 871
    :cond_22
    if-eqz v10, :cond_24

    .line 872
    .line 873
    const-class v1, [I

    .line 874
    .line 875
    if-ne v2, v1, :cond_23

    .line 876
    .line 877
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt32ValueArrayFinalField;

    .line 878
    .line 879
    move-object v7, v9

    .line 880
    check-cast v7, [I

    .line 881
    .line 882
    move-object/from16 v1, p3

    .line 883
    .line 884
    move/from16 v3, p4

    .line 885
    .line 886
    move-wide/from16 v4, p5

    .line 887
    .line 888
    move-object/from16 v6, p7

    .line 889
    .line 890
    move-object/from16 v8, p12

    .line 891
    .line 892
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt32ValueArrayFinalField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;[ILjava/lang/reflect/Field;)V

    .line 893
    .line 894
    .line 895
    return-object v0

    .line 896
    :cond_23
    const-class v1, [J

    .line 897
    .line 898
    if-ne v2, v1, :cond_24

    .line 899
    .line 900
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueArrayFinalField;

    .line 901
    .line 902
    move-object v7, v9

    .line 903
    check-cast v7, [J

    .line 904
    .line 905
    move-object/from16 v1, p3

    .line 906
    .line 907
    move/from16 v3, p4

    .line 908
    .line 909
    move-wide/from16 v4, p5

    .line 910
    .line 911
    move-object/from16 v6, p7

    .line 912
    .line 913
    move-object/from16 v8, p12

    .line 914
    .line 915
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueArrayFinalField;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;[JLjava/lang/reflect/Field;)V

    .line 916
    .line 917
    .line 918
    return-object v0

    .line 919
    :cond_24
    if-eqz v3, :cond_28

    .line 920
    .line 921
    const-wide/high16 v1, 0x2000000000000L

    .line 922
    .line 923
    and-long v1, p5, v1

    .line 924
    .line 925
    cmp-long v1, v1, v12

    .line 926
    .line 927
    if-eqz v1, :cond_25

    .line 928
    .line 929
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 930
    .line 931
    .line 932
    move-result v2

    .line 933
    if-eqz v2, :cond_25

    .line 934
    .line 935
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderMapFieldReadOnly;

    .line 936
    .line 937
    move-object/from16 v1, p3

    .line 938
    .line 939
    move/from16 v4, p4

    .line 940
    .line 941
    move-object/from16 v7, p7

    .line 942
    .line 943
    move-object/from16 v3, p11

    .line 944
    .line 945
    move-object/from16 v8, p12

    .line 946
    .line 947
    move-object/from16 v9, p14

    .line 948
    .line 949
    move-object/from16 v10, p15

    .line 950
    .line 951
    move-object v2, v5

    .line 952
    move-wide/from16 v5, p5

    .line 953
    .line 954
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderMapFieldReadOnly;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/util/function/BiConsumer;)V

    .line 955
    .line 956
    .line 957
    return-object v0

    .line 958
    :cond_25
    move-object v2, v5

    .line 959
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 960
    .line 961
    .line 962
    move-result v0

    .line 963
    if-eqz v0, :cond_27

    .line 964
    .line 965
    if-eqz v1, :cond_26

    .line 966
    .line 967
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderMapFieldReadOnly;

    .line 968
    .line 969
    move-object/from16 v1, p3

    .line 970
    .line 971
    move/from16 v4, p4

    .line 972
    .line 973
    move-wide/from16 v5, p5

    .line 974
    .line 975
    move-object/from16 v7, p7

    .line 976
    .line 977
    move-object/from16 v3, p11

    .line 978
    .line 979
    move-object/from16 v8, p12

    .line 980
    .line 981
    move-object/from16 v9, p14

    .line 982
    .line 983
    move-object/from16 v10, p15

    .line 984
    .line 985
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderMapFieldReadOnly;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/util/function/BiConsumer;)V

    .line 986
    .line 987
    .line 988
    return-object v0

    .line 989
    :cond_26
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderMapField;

    .line 990
    .line 991
    move-object/from16 v1, p3

    .line 992
    .line 993
    move/from16 v4, p4

    .line 994
    .line 995
    move-wide/from16 v5, p5

    .line 996
    .line 997
    move-object/from16 v7, p7

    .line 998
    .line 999
    move-object/from16 v8, p8

    .line 1000
    .line 1001
    move-object/from16 v3, p11

    .line 1002
    .line 1003
    move-object/from16 v10, p12

    .line 1004
    .line 1005
    move-object/from16 v11, p14

    .line 1006
    .line 1007
    move-object/from16 v12, p15

    .line 1008
    .line 1009
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderMapField;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/util/function/BiConsumer;)V

    .line 1010
    .line 1011
    .line 1012
    return-object v0

    .line 1013
    :cond_27
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectField;

    .line 1014
    .line 1015
    move-object/from16 v1, p3

    .line 1016
    .line 1017
    move/from16 v4, p4

    .line 1018
    .line 1019
    move-wide/from16 v5, p5

    .line 1020
    .line 1021
    move-object/from16 v7, p7

    .line 1022
    .line 1023
    move-object/from16 v3, p11

    .line 1024
    .line 1025
    move-object v8, v9

    .line 1026
    move-object/from16 v9, p12

    .line 1027
    .line 1028
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/reader/FieldReaderObjectField;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Field;)V

    .line 1029
    .line 1030
    .line 1031
    return-object v0

    .line 1032
    :cond_28
    move-object/from16 v2, p11

    .line 1033
    .line 1034
    const-class v0, Ljava/time/LocalDateTime;

    .line 1035
    .line 1036
    if-ne v2, v0, :cond_29

    .line 1037
    .line 1038
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderLocalDateTime;

    .line 1039
    .line 1040
    const/4 v11, 0x0

    .line 1041
    const/4 v12, 0x0

    .line 1042
    move-object/from16 v1, p3

    .line 1043
    .line 1044
    move/from16 v4, p4

    .line 1045
    .line 1046
    move-wide/from16 v5, p5

    .line 1047
    .line 1048
    move-object/from16 v7, p7

    .line 1049
    .line 1050
    move-object/from16 v8, p8

    .line 1051
    .line 1052
    move-object/from16 v10, p12

    .line 1053
    .line 1054
    move-object v3, v2

    .line 1055
    move-object/from16 v2, p10

    .line 1056
    .line 1057
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderLocalDateTime;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    .line 1058
    .line 1059
    .line 1060
    return-object v0

    .line 1061
    :cond_29
    const-class v0, Ljava/time/ZonedDateTime;

    .line 1062
    .line 1063
    if-ne v2, v0, :cond_2a

    .line 1064
    .line 1065
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderZonedDateTime;

    .line 1066
    .line 1067
    const/4 v11, 0x0

    .line 1068
    const/4 v12, 0x0

    .line 1069
    move-object/from16 v1, p3

    .line 1070
    .line 1071
    move/from16 v4, p4

    .line 1072
    .line 1073
    move-wide/from16 v5, p5

    .line 1074
    .line 1075
    move-object/from16 v7, p7

    .line 1076
    .line 1077
    move-object/from16 v8, p8

    .line 1078
    .line 1079
    move-object/from16 v10, p12

    .line 1080
    .line 1081
    move-object v3, v2

    .line 1082
    move-object/from16 v2, p10

    .line 1083
    .line 1084
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderZonedDateTime;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    .line 1085
    .line 1086
    .line 1087
    return-object v0

    .line 1088
    :cond_2a
    const-class v0, Ljava/time/Instant;

    .line 1089
    .line 1090
    if-ne v2, v0, :cond_2b

    .line 1091
    .line 1092
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInstant;

    .line 1093
    .line 1094
    const/4 v11, 0x0

    .line 1095
    const/4 v12, 0x0

    .line 1096
    move-object/from16 v1, p3

    .line 1097
    .line 1098
    move/from16 v4, p4

    .line 1099
    .line 1100
    move-wide/from16 v5, p5

    .line 1101
    .line 1102
    move-object/from16 v7, p7

    .line 1103
    .line 1104
    move-object/from16 v8, p8

    .line 1105
    .line 1106
    move-object/from16 v10, p12

    .line 1107
    .line 1108
    move-object v3, v2

    .line 1109
    move-object/from16 v2, p10

    .line 1110
    .line 1111
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderInstant;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    .line 1112
    .line 1113
    .line 1114
    return-object v0

    .line 1115
    :cond_2b
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectField;

    .line 1116
    .line 1117
    move-object/from16 v1, p3

    .line 1118
    .line 1119
    move/from16 v4, p4

    .line 1120
    .line 1121
    move-wide/from16 v5, p5

    .line 1122
    .line 1123
    move-object/from16 v7, p7

    .line 1124
    .line 1125
    move-object/from16 v2, p10

    .line 1126
    .line 1127
    move-object/from16 v3, p11

    .line 1128
    .line 1129
    move-object v8, v9

    .line 1130
    move-object/from16 v9, p12

    .line 1131
    .line 1132
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/reader/FieldReaderObjectField;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Field;)V

    .line 1133
    .line 1134
    .line 1135
    return-object v0
.end method

.method public createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;JLjava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader<",
            "TT;>;"
        }
    .end annotation

    .line 1140
    invoke-virtual/range {p9 .. p9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v11

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-wide/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v10, p7

    move-object/from16 v12, p9

    .line 1141
    invoke-virtual/range {v0 .. v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class<",
            "TV;>;IJ",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/function/BiConsumer<",
            "TT;TV;>;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    move-object/from16 v13, p14

    if-eqz v13, :cond_0

    .line 1146
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObject;

    const-wide/high16 v1, 0x8000000000000L

    or-long v5, p7, v1

    const/4 v11, 0x0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move/from16 v4, p6

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v12, p13

    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 1147
    iput-object v13, v0, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->initReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    return-object v0

    :cond_0
    move-object/from16 v2, p5

    .line 1148
    const-class v0, Ljava/lang/Integer;

    if-ne v2, v0, :cond_1

    .line 1149
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt32Func;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt32Func;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1150
    :cond_1
    const-class v0, Ljava/lang/Long;

    if-ne v2, v0, :cond_2

    .line 1151
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64Func;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt64Func;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1152
    :cond_2
    const-class v0, Ljava/lang/String;

    if-ne v2, v0, :cond_3

    .line 1153
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderStringFunc;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderStringFunc;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1154
    :cond_3
    const-class v1, Ljava/lang/Boolean;

    if-ne v2, v1, :cond_4

    .line 1155
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolFunc;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderBoolFunc;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1156
    :cond_4
    const-class v1, Ljava/lang/Short;

    if-ne v2, v1, :cond_5

    .line 1157
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt16Func;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt16Func;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1158
    :cond_5
    const-class v1, Ljava/lang/Byte;

    if-ne v2, v1, :cond_6

    .line 1159
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8Func;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt8Func;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1160
    :cond_6
    const-class v1, Ljava/math/BigDecimal;

    if-ne v2, v1, :cond_7

    .line 1161
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBigDecimalFunc;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderBigDecimalFunc;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1162
    :cond_7
    const-class v1, Ljava/math/BigInteger;

    if-ne v2, v1, :cond_8

    .line 1163
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBigIntegerFunc;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderBigIntegerFunc;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1164
    :cond_8
    const-class v1, Ljava/lang/Float;

    if-ne v2, v1, :cond_9

    .line 1165
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderFloatFunc;

    move-object/from16 v8, p11

    check-cast v8, Ljava/lang/Float;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderFloatFunc;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Float;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1166
    :cond_9
    const-class v1, Ljava/lang/Double;

    if-ne v2, v1, :cond_a

    .line 1167
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleFunc;

    move-object/from16 v8, p11

    check-cast v8, Ljava/lang/Double;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleFunc;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Double;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1168
    :cond_a
    const-class v1, Ljava/lang/Number;

    if-ne v2, v1, :cond_b

    .line 1169
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderNumberFunc;

    move-object/from16 v8, p11

    check-cast v8, Ljava/lang/Number;

    move-object/from16 v1, p3

    move/from16 v3, p6

    move-wide/from16 v4, p7

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderNumberFunc;-><init>(Ljava/lang/String;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Number;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    .line 1170
    :cond_b
    const-class v1, Ljava/util/Date;

    if-ne v2, v1, :cond_c

    .line 1171
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderDate;

    const/4 v10, 0x0

    move-object/from16 v1, p3

    move/from16 v4, p6

    move-wide/from16 v5, p7

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object v3, v2

    move-object/from16 v2, p4

    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderDate;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    return-object v0

    :cond_c
    move-object v3, v2

    move-object/from16 v2, p4

    .line 1172
    instance-of v1, v2, Ljava/lang/Class;

    const/4 v4, 0x0

    if-nez v1, :cond_e

    if-nez p2, :cond_d

    :goto_0
    move-object/from16 v1, p1

    move-object/from16 v9, p12

    goto :goto_1

    .line 1173
    :cond_d
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson2/TypeReference;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/TypeReference;

    move-result-object v4

    goto :goto_0

    .line 1174
    :goto_1
    invoke-static {v4, v1, v9, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getFieldType(Lcom/alibaba/fastjson2/TypeReference;Ljava/lang/Class;Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v4

    .line 1175
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    goto :goto_2

    :cond_e
    move-object/from16 v9, p12

    move-object v1, v4

    .line 1176
    :goto_2
    const-class v5, Ljava/util/List;

    if-eq v3, v5, :cond_f

    const-class v5, Ljava/util/ArrayList;

    if-ne v3, v5, :cond_10

    :cond_f
    move-object v3, v4

    goto :goto_3

    :cond_10
    if-eqz v4, :cond_11

    .line 1177
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectFunc;

    const/4 v12, 0x0

    move-object/from16 v1, p3

    move-wide/from16 v5, p7

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v11, p13

    move-object v2, v4

    move-object v10, v9

    move/from16 v4, p6

    move-object/from16 v9, p11

    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderObjectFunc;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;Lcom/alibaba/fastjson2/reader/ObjectReader;)V

    return-object v0

    .line 1178
    :cond_11
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectFunc;

    const/4 v12, 0x0

    move-object/from16 v1, p3

    move-object/from16 v3, p5

    move/from16 v4, p6

    move-wide/from16 v5, p7

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderObjectFunc;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;Lcom/alibaba/fastjson2/reader/ObjectReader;)V

    return-object v0

    .line 1179
    :goto_3
    instance-of v2, v3, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_13

    .line 1180
    move-object v4, v3

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    .line 1181
    invoke-interface {v4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    .line 1182
    array-length v4, v2

    const/4 v5, 0x1

    if-ne v4, v5, :cond_13

    const/4 v4, 0x0

    .line 1183
    aget-object v2, v2, v4

    .line 1184
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v4

    if-ne v4, v0, :cond_12

    move-object v4, v1

    .line 1185
    new-instance v1, Lcom/alibaba/fastjson2/reader/FieldReaderList;

    const-class v6, Ljava/lang/String;

    const/4 v14, 0x0

    const-class v5, Ljava/lang/String;

    move-object/from16 v2, p3

    move/from16 v7, p6

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p13

    invoke-direct/range {v1 .. v15}, Lcom/alibaba/fastjson2/reader/FieldReaderList;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    return-object v1

    :cond_12
    move-object v0, v4

    move-object v4, v1

    move-object v6, v0

    move-object v5, v2

    goto :goto_4

    :cond_13
    move-object v4, v1

    .line 1186
    const-class v2, Ljava/lang/Object;

    move-object v5, v2

    move-object v6, v5

    :goto_4
    new-instance v1, Lcom/alibaba/fastjson2/reader/FieldReaderList;

    const/4 v14, 0x0

    move-object/from16 v2, p3

    move/from16 v7, p6

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v15, p13

    invoke-direct/range {v1 .. v15}, Lcom/alibaba/fastjson2/reader/FieldReaderList;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    return-object v1
.end method

.method public createFieldReader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader<",
            "TT;>;"
        }
    .end annotation

    .line 1138
    invoke-virtual {p4}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    const-wide/16 v4, 0x0

    .line 1139
    invoke-virtual {p4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    move-object v2, v1

    move-object v0, p0

    move-object v3, p1

    move-object v6, p2

    move-object v7, p3

    move-object v9, p4

    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;JLjava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReader(Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1187
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReader(Ljava/lang/String;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    .line 1188
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    .line 1189
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    .line 1190
    array-length v2, v0

    if-nez v2, :cond_0

    .line 1191
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    .line 1192
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v2

    :goto_0
    move-object v11, v0

    move-object v10, v2

    goto :goto_1

    .line 1193
    :cond_0
    array-length v2, v0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const/4 v2, 0x0

    .line 1194
    aget-object v0, v0, v2

    .line 1195
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v3

    aget-object v2, v3, v2

    goto :goto_0

    :goto_1
    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v1

    move-object v0, p0

    move-object v3, p1

    move-object/from16 v12, p2

    .line 1196
    invoke-virtual/range {v0 .. v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1

    .line 1197
    :cond_1
    const-string p1, "illegal setter method "

    move-object/from16 v12, p2

    invoke-static {v12, p1}, Lah/a;->v(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public createFieldReader(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class<",
            "TV;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/function/BiConsumer<",
            "TT;TV;>;)",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    .line 1145
    invoke-virtual/range {v0 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v1

    return-object v1
.end method

.method public createFieldReader(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1137
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v3, p2

    move-object/from16 v7, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    .line 1163
    invoke-virtual/range {v0 .. v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Method;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    .line 1162
    invoke-virtual/range {v1 .. v16}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v0

    return-object v0
.end method

.method public createFieldReaderMethod(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/lang/String;Ljava/util/function/BiConsumer;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/reflect/Method;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            "Ljava/lang/String;",
            "Ljava/util/function/BiConsumer;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    move-object/from16 v2, p10

    .line 4
    .line 5
    move-object/from16 v3, p11

    .line 6
    .line 7
    move-object/from16 v10, p12

    .line 8
    .line 9
    move-object/from16 v13, p13

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v10, :cond_0

    .line 13
    .line 14
    invoke-virtual {v10, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    instance-of v4, v0, Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Class;->isEnum()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    check-cast v0, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v3, v0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eq v4, v3, :cond_2

    .line 40
    .line 41
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    invoke-interface {v4, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_2
    move-object v9, v0

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v2, "illegal defaultValue : "

    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v0, ", class "

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-static {v1, v0, v2}, Lah/a;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    return-object v0

    .line 82
    :goto_0
    if-eqz v13, :cond_4

    .line 83
    .line 84
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObject;

    .line 85
    .line 86
    const-wide/high16 v4, 0x8000000000000L

    .line 87
    .line 88
    or-long v5, p5, v4

    .line 89
    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v12, 0x0

    .line 92
    move-object/from16 v1, p3

    .line 93
    .line 94
    move/from16 v4, p4

    .line 95
    .line 96
    move-object/from16 v7, p7

    .line 97
    .line 98
    move-object/from16 v8, p8

    .line 99
    .line 100
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 101
    .line 102
    .line 103
    iput-object v13, v0, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->initReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 104
    .line 105
    return-object v0

    .line 106
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 107
    .line 108
    if-ne v2, v0, :cond_5

    .line 109
    .line 110
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolValueMethod;

    .line 111
    .line 112
    move-object v6, v9

    .line 113
    check-cast v6, Ljava/lang/Boolean;

    .line 114
    .line 115
    move-object/from16 v1, p3

    .line 116
    .line 117
    move/from16 v2, p4

    .line 118
    .line 119
    move-wide/from16 v3, p5

    .line 120
    .line 121
    move-object/from16 v5, p7

    .line 122
    .line 123
    move-object/from16 v7, p12

    .line 124
    .line 125
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/FieldReaderBoolValueMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/reflect/Method;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_5
    const-class v0, Ljava/lang/Boolean;

    .line 130
    .line 131
    if-ne v2, v0, :cond_6

    .line 132
    .line 133
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolMethod;

    .line 134
    .line 135
    check-cast v9, Ljava/lang/Boolean;

    .line 136
    .line 137
    move-object/from16 v1, p3

    .line 138
    .line 139
    move/from16 v4, p4

    .line 140
    .line 141
    move-wide/from16 v5, p5

    .line 142
    .line 143
    move-object/from16 v7, p7

    .line 144
    .line 145
    move-object/from16 v8, p8

    .line 146
    .line 147
    move-object/from16 v3, p11

    .line 148
    .line 149
    move-object/from16 v10, p12

    .line 150
    .line 151
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderBoolMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Boolean;Ljava/lang/reflect/Method;)V

    .line 152
    .line 153
    .line 154
    return-object v0

    .line 155
    :cond_6
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 156
    .line 157
    if-ne v2, v0, :cond_7

    .line 158
    .line 159
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueMethod;

    .line 160
    .line 161
    check-cast v9, Ljava/lang/Byte;

    .line 162
    .line 163
    move-object/from16 v1, p3

    .line 164
    .line 165
    move/from16 v4, p4

    .line 166
    .line 167
    move-wide/from16 v5, p5

    .line 168
    .line 169
    move-object/from16 v7, p7

    .line 170
    .line 171
    move-object/from16 v8, p8

    .line 172
    .line 173
    move-object/from16 v3, p11

    .line 174
    .line 175
    move-object/from16 v10, p12

    .line 176
    .line 177
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Byte;Ljava/lang/reflect/Method;)V

    .line 178
    .line 179
    .line 180
    return-object v0

    .line 181
    :cond_7
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 182
    .line 183
    if-ne v2, v0, :cond_8

    .line 184
    .line 185
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt16ValueMethod;

    .line 186
    .line 187
    check-cast v9, Ljava/lang/Short;

    .line 188
    .line 189
    move-object/from16 v1, p3

    .line 190
    .line 191
    move/from16 v4, p4

    .line 192
    .line 193
    move-wide/from16 v5, p5

    .line 194
    .line 195
    move-object/from16 v7, p7

    .line 196
    .line 197
    move-object/from16 v8, p8

    .line 198
    .line 199
    move-object/from16 v3, p11

    .line 200
    .line 201
    move-object/from16 v10, p12

    .line 202
    .line 203
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt16ValueMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Short;Ljava/lang/reflect/Method;)V

    .line 204
    .line 205
    .line 206
    return-object v0

    .line 207
    :cond_8
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 208
    .line 209
    if-ne v2, v0, :cond_9

    .line 210
    .line 211
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt32ValueMethod;

    .line 212
    .line 213
    move-object v8, v9

    .line 214
    check-cast v8, Ljava/lang/Integer;

    .line 215
    .line 216
    move-object/from16 v1, p3

    .line 217
    .line 218
    move/from16 v4, p4

    .line 219
    .line 220
    move-wide/from16 v5, p5

    .line 221
    .line 222
    move-object/from16 v7, p7

    .line 223
    .line 224
    move-object/from16 v3, p11

    .line 225
    .line 226
    move-object/from16 v9, p12

    .line 227
    .line 228
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/reader/FieldReaderInt32ValueMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/reflect/Method;)V

    .line 229
    .line 230
    .line 231
    return-object v0

    .line 232
    :cond_9
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 233
    .line 234
    if-ne v2, v0, :cond_a

    .line 235
    .line 236
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueMethod;

    .line 237
    .line 238
    check-cast v9, Ljava/lang/Long;

    .line 239
    .line 240
    move-object/from16 v1, p3

    .line 241
    .line 242
    move/from16 v4, p4

    .line 243
    .line 244
    move-wide/from16 v5, p5

    .line 245
    .line 246
    move-object/from16 v7, p7

    .line 247
    .line 248
    move-object/from16 v8, p8

    .line 249
    .line 250
    move-object/from16 v3, p11

    .line 251
    .line 252
    move-object/from16 v10, p12

    .line 253
    .line 254
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/reflect/Method;)V

    .line 255
    .line 256
    .line 257
    return-object v0

    .line 258
    :cond_a
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 259
    .line 260
    if-ne v2, v0, :cond_b

    .line 261
    .line 262
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderFloatValueMethod;

    .line 263
    .line 264
    check-cast v9, Ljava/lang/Float;

    .line 265
    .line 266
    move-object/from16 v1, p3

    .line 267
    .line 268
    move/from16 v4, p4

    .line 269
    .line 270
    move-wide/from16 v5, p5

    .line 271
    .line 272
    move-object/from16 v7, p7

    .line 273
    .line 274
    move-object/from16 v8, p8

    .line 275
    .line 276
    move-object/from16 v3, p11

    .line 277
    .line 278
    move-object/from16 v10, p12

    .line 279
    .line 280
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderFloatValueMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Float;Ljava/lang/reflect/Method;)V

    .line 281
    .line 282
    .line 283
    return-object v0

    .line 284
    :cond_b
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 285
    .line 286
    if-ne v2, v0, :cond_c

    .line 287
    .line 288
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleValueMethod;

    .line 289
    .line 290
    check-cast v9, Ljava/lang/Double;

    .line 291
    .line 292
    move-object/from16 v1, p3

    .line 293
    .line 294
    move/from16 v4, p4

    .line 295
    .line 296
    move-wide/from16 v5, p5

    .line 297
    .line 298
    move-object/from16 v7, p7

    .line 299
    .line 300
    move-object/from16 v8, p8

    .line 301
    .line 302
    move-object/from16 v3, p11

    .line 303
    .line 304
    move-object/from16 v10, p12

    .line 305
    .line 306
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleValueMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Double;Ljava/lang/reflect/Method;)V

    .line 307
    .line 308
    .line 309
    return-object v0

    .line 310
    :cond_c
    const-class v0, Ljava/lang/Byte;

    .line 311
    .line 312
    if-ne v2, v0, :cond_d

    .line 313
    .line 314
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8Method;

    .line 315
    .line 316
    check-cast v9, Ljava/lang/Byte;

    .line 317
    .line 318
    move-object/from16 v1, p3

    .line 319
    .line 320
    move/from16 v4, p4

    .line 321
    .line 322
    move-wide/from16 v5, p5

    .line 323
    .line 324
    move-object/from16 v7, p7

    .line 325
    .line 326
    move-object/from16 v8, p8

    .line 327
    .line 328
    move-object/from16 v3, p11

    .line 329
    .line 330
    move-object/from16 v10, p12

    .line 331
    .line 332
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt8Method;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Byte;Ljava/lang/reflect/Method;)V

    .line 333
    .line 334
    .line 335
    return-object v0

    .line 336
    :cond_d
    const-class v0, Ljava/lang/Short;

    .line 337
    .line 338
    if-ne v2, v0, :cond_e

    .line 339
    .line 340
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt16Method;

    .line 341
    .line 342
    check-cast v9, Ljava/lang/Short;

    .line 343
    .line 344
    move-object/from16 v1, p3

    .line 345
    .line 346
    move/from16 v4, p4

    .line 347
    .line 348
    move-wide/from16 v5, p5

    .line 349
    .line 350
    move-object/from16 v7, p7

    .line 351
    .line 352
    move-object/from16 v8, p8

    .line 353
    .line 354
    move-object/from16 v3, p11

    .line 355
    .line 356
    move-object/from16 v10, p12

    .line 357
    .line 358
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt16Method;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Short;Ljava/lang/reflect/Method;)V

    .line 359
    .line 360
    .line 361
    return-object v0

    .line 362
    :cond_e
    move-object/from16 v3, p11

    .line 363
    .line 364
    const-class v0, Ljava/lang/Integer;

    .line 365
    .line 366
    if-ne v2, v0, :cond_f

    .line 367
    .line 368
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt32Method;

    .line 369
    .line 370
    move-object v7, v9

    .line 371
    check-cast v7, Ljava/lang/Integer;

    .line 372
    .line 373
    move-object/from16 v1, p3

    .line 374
    .line 375
    move/from16 v2, p4

    .line 376
    .line 377
    move-wide/from16 v3, p5

    .line 378
    .line 379
    move-object/from16 v5, p7

    .line 380
    .line 381
    move-object/from16 v6, p8

    .line 382
    .line 383
    move-object/from16 v8, p12

    .line 384
    .line 385
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt32Method;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Integer;Ljava/lang/reflect/Method;)V

    .line 386
    .line 387
    .line 388
    return-object v0

    .line 389
    :cond_f
    const-class v0, Ljava/lang/Long;

    .line 390
    .line 391
    if-ne v2, v0, :cond_10

    .line 392
    .line 393
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64Method;

    .line 394
    .line 395
    move-object v7, v9

    .line 396
    check-cast v7, Ljava/lang/Long;

    .line 397
    .line 398
    move-object/from16 v1, p3

    .line 399
    .line 400
    move/from16 v2, p4

    .line 401
    .line 402
    move-wide/from16 v3, p5

    .line 403
    .line 404
    move-object/from16 v5, p7

    .line 405
    .line 406
    move-object/from16 v6, p8

    .line 407
    .line 408
    move-object/from16 v8, p12

    .line 409
    .line 410
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderInt64Method;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/reflect/Method;)V

    .line 411
    .line 412
    .line 413
    return-object v0

    .line 414
    :cond_10
    const-class v0, Ljava/lang/Float;

    .line 415
    .line 416
    if-ne v2, v0, :cond_11

    .line 417
    .line 418
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderFloatMethod;

    .line 419
    .line 420
    move-object v7, v9

    .line 421
    check-cast v7, Ljava/lang/Float;

    .line 422
    .line 423
    move-object/from16 v1, p3

    .line 424
    .line 425
    move/from16 v2, p4

    .line 426
    .line 427
    move-wide/from16 v3, p5

    .line 428
    .line 429
    move-object/from16 v5, p7

    .line 430
    .line 431
    move-object/from16 v6, p8

    .line 432
    .line 433
    move-object/from16 v8, p12

    .line 434
    .line 435
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/FieldReaderFloatMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Float;Ljava/lang/reflect/Method;)V

    .line 436
    .line 437
    .line 438
    return-object v0

    .line 439
    :cond_11
    const-class v0, Ljava/lang/Double;

    .line 440
    .line 441
    if-ne v2, v0, :cond_12

    .line 442
    .line 443
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleMethod;

    .line 444
    .line 445
    move-object v6, v9

    .line 446
    check-cast v6, Ljava/lang/Double;

    .line 447
    .line 448
    move-object/from16 v1, p3

    .line 449
    .line 450
    move/from16 v2, p4

    .line 451
    .line 452
    move-wide/from16 v3, p5

    .line 453
    .line 454
    move-object/from16 v5, p7

    .line 455
    .line 456
    move-object/from16 v7, p12

    .line 457
    .line 458
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/FieldReaderDoubleMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Double;Ljava/lang/reflect/Method;)V

    .line 459
    .line 460
    .line 461
    return-object v0

    .line 462
    :cond_12
    const-class v0, Ljava/math/BigDecimal;

    .line 463
    .line 464
    if-ne v3, v0, :cond_13

    .line 465
    .line 466
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBigDecimalMethod;

    .line 467
    .line 468
    check-cast v9, Ljava/math/BigDecimal;

    .line 469
    .line 470
    move-object/from16 v1, p3

    .line 471
    .line 472
    move/from16 v4, p4

    .line 473
    .line 474
    move-wide/from16 v5, p5

    .line 475
    .line 476
    move-object/from16 v7, p7

    .line 477
    .line 478
    move-object/from16 v8, p8

    .line 479
    .line 480
    move-object/from16 v10, p12

    .line 481
    .line 482
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderBigDecimalMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/math/BigDecimal;Ljava/lang/reflect/Method;)V

    .line 483
    .line 484
    .line 485
    return-object v0

    .line 486
    :cond_13
    const-class v0, Ljava/math/BigInteger;

    .line 487
    .line 488
    if-ne v3, v0, :cond_14

    .line 489
    .line 490
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderBigIntegerMethod;

    .line 491
    .line 492
    check-cast v9, Ljava/math/BigInteger;

    .line 493
    .line 494
    move-object/from16 v1, p3

    .line 495
    .line 496
    move/from16 v4, p4

    .line 497
    .line 498
    move-wide/from16 v5, p5

    .line 499
    .line 500
    move-object/from16 v7, p7

    .line 501
    .line 502
    move-object/from16 v8, p8

    .line 503
    .line 504
    move-object/from16 v2, p10

    .line 505
    .line 506
    move-object/from16 v10, p12

    .line 507
    .line 508
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderBigIntegerMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/math/BigInteger;Ljava/lang/reflect/Method;)V

    .line 509
    .line 510
    .line 511
    return-object v0

    .line 512
    :cond_14
    move-object/from16 v2, p10

    .line 513
    .line 514
    const-class v0, Ljava/lang/String;

    .line 515
    .line 516
    if-ne v2, v0, :cond_15

    .line 517
    .line 518
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderStringMethod;

    .line 519
    .line 520
    check-cast v9, Ljava/lang/String;

    .line 521
    .line 522
    move-object/from16 v1, p3

    .line 523
    .line 524
    move/from16 v4, p4

    .line 525
    .line 526
    move-wide/from16 v5, p5

    .line 527
    .line 528
    move-object/from16 v7, p7

    .line 529
    .line 530
    move-object/from16 v8, p8

    .line 531
    .line 532
    move-object/from16 v3, p11

    .line 533
    .line 534
    move-object/from16 v10, p12

    .line 535
    .line 536
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderStringMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 537
    .line 538
    .line 539
    return-object v0

    .line 540
    :cond_15
    const-class v3, Ljava/time/LocalDate;

    .line 541
    .line 542
    if-ne v2, v3, :cond_16

    .line 543
    .line 544
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderLocalDate;

    .line 545
    .line 546
    const/4 v11, 0x0

    .line 547
    const/4 v12, 0x0

    .line 548
    move-object/from16 v1, p3

    .line 549
    .line 550
    move/from16 v4, p4

    .line 551
    .line 552
    move-wide/from16 v5, p5

    .line 553
    .line 554
    move-object/from16 v7, p7

    .line 555
    .line 556
    move-object/from16 v8, p8

    .line 557
    .line 558
    move-object/from16 v3, p11

    .line 559
    .line 560
    move-object/from16 v10, p12

    .line 561
    .line 562
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderLocalDate;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 563
    .line 564
    .line 565
    return-object v0

    .line 566
    :cond_16
    const-class v3, Ljava/time/OffsetDateTime;

    .line 567
    .line 568
    if-ne v2, v3, :cond_17

    .line 569
    .line 570
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderOffsetDateTime;

    .line 571
    .line 572
    const/4 v11, 0x0

    .line 573
    const/4 v12, 0x0

    .line 574
    move-object/from16 v1, p3

    .line 575
    .line 576
    move/from16 v4, p4

    .line 577
    .line 578
    move-wide/from16 v5, p5

    .line 579
    .line 580
    move-object/from16 v7, p7

    .line 581
    .line 582
    move-object/from16 v8, p8

    .line 583
    .line 584
    move-object/from16 v3, p11

    .line 585
    .line 586
    move-object/from16 v10, p12

    .line 587
    .line 588
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderOffsetDateTime;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 589
    .line 590
    .line 591
    return-object v0

    .line 592
    :cond_17
    const-class v3, Ljava/util/UUID;

    .line 593
    .line 594
    if-ne v2, v3, :cond_18

    .line 595
    .line 596
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderUUID;

    .line 597
    .line 598
    const/4 v11, 0x0

    .line 599
    const/4 v12, 0x0

    .line 600
    move-object/from16 v1, p3

    .line 601
    .line 602
    move/from16 v4, p4

    .line 603
    .line 604
    move-wide/from16 v5, p5

    .line 605
    .line 606
    move-object/from16 v7, p7

    .line 607
    .line 608
    move-object/from16 v8, p8

    .line 609
    .line 610
    move-object/from16 v3, p11

    .line 611
    .line 612
    move-object/from16 v10, p12

    .line 613
    .line 614
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderUUID;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 615
    .line 616
    .line 617
    return-object v0

    .line 618
    :cond_18
    const-class v3, [Ljava/lang/String;

    .line 619
    .line 620
    if-ne v2, v3, :cond_19

    .line 621
    .line 622
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderStringArray;

    .line 623
    .line 624
    const/4 v11, 0x0

    .line 625
    const/4 v12, 0x0

    .line 626
    move-object/from16 v1, p3

    .line 627
    .line 628
    move/from16 v4, p4

    .line 629
    .line 630
    move-wide/from16 v5, p5

    .line 631
    .line 632
    move-object/from16 v7, p7

    .line 633
    .line 634
    move-object/from16 v8, p8

    .line 635
    .line 636
    move-object/from16 v3, p11

    .line 637
    .line 638
    move-object/from16 v10, p12

    .line 639
    .line 640
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderStringArray;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 641
    .line 642
    .line 643
    return-object v0

    .line 644
    :cond_19
    move/from16 v4, p4

    .line 645
    .line 646
    move-object/from16 v3, p11

    .line 647
    .line 648
    move-object/from16 v10, p12

    .line 649
    .line 650
    move v2, v1

    .line 651
    move-object/from16 v1, p3

    .line 652
    .line 653
    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    move-result-object v5

    .line 657
    array-length v5, v5

    .line 658
    const-class v6, Ljava/util/Map;

    .line 659
    .line 660
    const/4 v7, 0x0

    .line 661
    const/4 v8, 0x0

    .line 662
    if-nez v5, :cond_24

    .line 663
    .line 664
    const-class v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 665
    .line 666
    if-ne v3, v5, :cond_1a

    .line 667
    .line 668
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicIntegerMethodReadOnly;

    .line 669
    .line 670
    invoke-direct {v0, v1, v3, v4, v10}, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicIntegerMethodReadOnly;-><init>(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/reflect/Method;)V

    .line 671
    .line 672
    .line 673
    return-object v0

    .line 674
    :cond_1a
    const-class v5, Ljava/util/concurrent/atomic/AtomicLong;

    .line 675
    .line 676
    if-ne v3, v5, :cond_1b

    .line 677
    .line 678
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicLongReadOnly;

    .line 679
    .line 680
    invoke-direct {v0, v1, v3, v4, v10}, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicLongReadOnly;-><init>(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/reflect/Method;)V

    .line 681
    .line 682
    .line 683
    return-object v0

    .line 684
    :cond_1b
    const-class v5, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 685
    .line 686
    if-ne v3, v5, :cond_1c

    .line 687
    .line 688
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicIntegerArrayReadOnly;

    .line 689
    .line 690
    invoke-direct {v0, v1, v3, v4, v10}, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicIntegerArrayReadOnly;-><init>(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/reflect/Method;)V

    .line 691
    .line 692
    .line 693
    return-object v0

    .line 694
    :cond_1c
    const-class v5, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 695
    .line 696
    if-ne v3, v5, :cond_1d

    .line 697
    .line 698
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicLongArrayReadOnly;

    .line 699
    .line 700
    invoke-direct {v0, v1, v3, v4, v10}, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicLongArrayReadOnly;-><init>(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/reflect/Method;)V

    .line 701
    .line 702
    .line 703
    return-object v0

    .line 704
    :cond_1d
    const-class v5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 705
    .line 706
    if-ne v3, v5, :cond_1e

    .line 707
    .line 708
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicBooleanMethodReadOnly;

    .line 709
    .line 710
    invoke-direct {v0, v1, v3, v4, v10}, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicBooleanMethodReadOnly;-><init>(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/reflect/Method;)V

    .line 711
    .line 712
    .line 713
    return-object v0

    .line 714
    :cond_1e
    const-class v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 715
    .line 716
    if-ne v3, v5, :cond_1f

    .line 717
    .line 718
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicReferenceMethodReadOnly;

    .line 719
    .line 720
    move-object/from16 v2, p10

    .line 721
    .line 722
    move-object v5, v10

    .line 723
    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/FieldReaderAtomicReferenceMethodReadOnly;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;ILjava/lang/reflect/Method;)V

    .line 724
    .line 725
    .line 726
    return-object v0

    .line 727
    :cond_1f
    const-class v1, Ljava/util/Collection;

    .line 728
    .line 729
    invoke-virtual {v1, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 730
    .line 731
    .line 732
    move-result v1

    .line 733
    const-string v4, "get"

    .line 734
    .line 735
    if-eqz v1, :cond_21

    .line 736
    .line 737
    invoke-virtual/range {p12 .. p12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    invoke-virtual {v0, v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    if-eqz v1, :cond_20

    .line 746
    .line 747
    sget-object v1, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->CamelCase:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 748
    .line 749
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 750
    .line 751
    .line 752
    move-result-object v1

    .line 753
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-virtual/range {p12 .. p12}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 762
    .line 763
    .line 764
    move-result-object v8

    .line 765
    :cond_20
    move-object v9, v8

    .line 766
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderCollectionMethodReadOnly;

    .line 767
    .line 768
    move-object/from16 v1, p3

    .line 769
    .line 770
    move/from16 v4, p4

    .line 771
    .line 772
    move-wide/from16 v5, p5

    .line 773
    .line 774
    move-object/from16 v7, p7

    .line 775
    .line 776
    move-object/from16 v2, p10

    .line 777
    .line 778
    move-object/from16 v8, p12

    .line 779
    .line 780
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/reader/FieldReaderCollectionMethodReadOnly;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 781
    .line 782
    .line 783
    return-object v0

    .line 784
    :cond_21
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 785
    .line 786
    .line 787
    move-result v1

    .line 788
    if-eqz v1, :cond_23

    .line 789
    .line 790
    invoke-virtual/range {p12 .. p12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    invoke-virtual {v0, v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 795
    .line 796
    .line 797
    move-result v1

    .line 798
    if-eqz v1, :cond_22

    .line 799
    .line 800
    sget-object v1, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->CamelCase:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 801
    .line 802
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual/range {p12 .. p12}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 815
    .line 816
    .line 817
    move-result-object v8

    .line 818
    :cond_22
    move-object v9, v8

    .line 819
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethodReadOnly;

    .line 820
    .line 821
    move-object/from16 v1, p3

    .line 822
    .line 823
    move/from16 v4, p4

    .line 824
    .line 825
    move-wide/from16 v5, p5

    .line 826
    .line 827
    move-object/from16 v7, p7

    .line 828
    .line 829
    move-object/from16 v2, p10

    .line 830
    .line 831
    move-object/from16 v8, p12

    .line 832
    .line 833
    move-object/from16 v10, p14

    .line 834
    .line 835
    move-object/from16 v11, p15

    .line 836
    .line 837
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethodReadOnly;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/String;Ljava/util/function/BiConsumer;)V

    .line 838
    .line 839
    .line 840
    return-object v0

    .line 841
    :cond_23
    move-object/from16 v10, p12

    .line 842
    .line 843
    move v1, v2

    .line 844
    move-object/from16 v2, p10

    .line 845
    .line 846
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isInterface()Z

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    if-nez v4, :cond_25

    .line 851
    .line 852
    return-object v8

    .line 853
    :cond_24
    move v1, v2

    .line 854
    move-object/from16 v2, p10

    .line 855
    .line 856
    :cond_25
    instance-of v4, v2, Ljava/lang/Class;

    .line 857
    .line 858
    if-nez v4, :cond_26

    .line 859
    .line 860
    invoke-static/range {p2 .. p2}, Lcom/alibaba/fastjson2/TypeReference;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/TypeReference;

    .line 861
    .line 862
    .line 863
    move-result-object v4

    .line 864
    move-object/from16 v5, p1

    .line 865
    .line 866
    invoke-static {v4, v5, v10, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getFieldType(Lcom/alibaba/fastjson2/TypeReference;Ljava/lang/Class;Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    invoke-static {v4}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    move-result-object v5

    .line 874
    goto :goto_1

    .line 875
    :cond_26
    move-object v4, v8

    .line 876
    move-object v5, v4

    .line 877
    :goto_1
    const-class v11, Ljava/util/List;

    .line 878
    .line 879
    if-eq v3, v11, :cond_2f

    .line 880
    .line 881
    const-class v11, Ljava/util/ArrayList;

    .line 882
    .line 883
    if-ne v3, v11, :cond_27

    .line 884
    .line 885
    goto/16 :goto_5

    .line 886
    .line 887
    :cond_27
    const-class v0, Ljava/util/Date;

    .line 888
    .line 889
    if-ne v3, v0, :cond_28

    .line 890
    .line 891
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderDate;

    .line 892
    .line 893
    const/4 v10, 0x0

    .line 894
    const/4 v12, 0x0

    .line 895
    move-object/from16 v1, p3

    .line 896
    .line 897
    move/from16 v4, p4

    .line 898
    .line 899
    move-wide/from16 v5, p5

    .line 900
    .line 901
    move-object/from16 v7, p7

    .line 902
    .line 903
    move-object/from16 v8, p8

    .line 904
    .line 905
    move-object/from16 v11, p12

    .line 906
    .line 907
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderDate;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/BiConsumer;)V

    .line 908
    .line 909
    .line 910
    return-object v0

    .line 911
    :cond_28
    const-class v0, [Ljava/lang/StackTraceElement;

    .line 912
    .line 913
    if-ne v3, v0, :cond_2a

    .line 914
    .line 915
    invoke-virtual/range {p12 .. p12}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    const-class v2, Ljava/lang/Throwable;

    .line 920
    .line 921
    if-ne v0, v2, :cond_2a

    .line 922
    .line 923
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderStackTrace;

    .line 924
    .line 925
    if-eqz v4, :cond_29

    .line 926
    .line 927
    move-object v2, v4

    .line 928
    goto :goto_2

    .line 929
    :cond_29
    move-object/from16 v2, p10

    .line 930
    .line 931
    :goto_2
    new-instance v12, Lcom/alibaba/fastjson2/reader/d;

    .line 932
    .line 933
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 934
    .line 935
    .line 936
    const/4 v11, 0x0

    .line 937
    move-object/from16 v1, p3

    .line 938
    .line 939
    move/from16 v4, p4

    .line 940
    .line 941
    move-wide/from16 v5, p5

    .line 942
    .line 943
    move-object/from16 v7, p7

    .line 944
    .line 945
    move-object/from16 v8, p8

    .line 946
    .line 947
    move-object/from16 v10, p12

    .line 948
    .line 949
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderStackTrace;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 950
    .line 951
    .line 952
    return-object v0

    .line 953
    :cond_2a
    const-wide/high16 v10, 0x2000000000000L

    .line 954
    .line 955
    and-long v10, p5, v10

    .line 956
    .line 957
    const-wide/16 v12, 0x0

    .line 958
    .line 959
    cmp-long v0, v10, v12

    .line 960
    .line 961
    if-eqz v0, :cond_2b

    .line 962
    .line 963
    invoke-virtual/range {p12 .. p12}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 964
    .line 965
    .line 966
    move-result-object v0

    .line 967
    const-string v2, "set"

    .line 968
    .line 969
    invoke-virtual {v0, v2, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 970
    .line 971
    .line 972
    move-result v2

    .line 973
    if-eqz v2, :cond_2b

    .line 974
    .line 975
    sget-object v2, Lcom/alibaba/fastjson2/PropertyNamingStrategy;->CamelCase:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 976
    .line 977
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 978
    .line 979
    .line 980
    move-result-object v2

    .line 981
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->setterName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    invoke-virtual/range {p12 .. p12}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    move-result-object v2

    .line 989
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 990
    .line 991
    .line 992
    move-result-object v8

    .line 993
    :try_start_0
    invoke-virtual {v8, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 994
    .line 995
    .line 996
    :catchall_0
    :cond_2b
    move-object v11, v8

    .line 997
    invoke-virtual {v6, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 998
    .line 999
    .line 1000
    move-result v0

    .line 1001
    if-eqz v0, :cond_2d

    .line 1002
    .line 1003
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;

    .line 1004
    .line 1005
    if-eqz v4, :cond_2c

    .line 1006
    .line 1007
    move-object v2, v4

    .line 1008
    goto :goto_3

    .line 1009
    :cond_2c
    move-object/from16 v2, p10

    .line 1010
    .line 1011
    :goto_3
    const/4 v12, 0x0

    .line 1012
    move-object/from16 v1, p3

    .line 1013
    .line 1014
    move/from16 v4, p4

    .line 1015
    .line 1016
    move-wide/from16 v5, p5

    .line 1017
    .line 1018
    move-object/from16 v7, p7

    .line 1019
    .line 1020
    move-object/from16 v8, p8

    .line 1021
    .line 1022
    move-object/from16 v10, p12

    .line 1023
    .line 1024
    move-object/from16 v13, p14

    .line 1025
    .line 1026
    move-object/from16 v14, p15

    .line 1027
    .line 1028
    invoke-direct/range {v0 .. v14}, Lcom/alibaba/fastjson2/reader/FieldReaderMapMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;Ljava/lang/String;Ljava/util/function/BiConsumer;)V

    .line 1029
    .line 1030
    .line 1031
    return-object v0

    .line 1032
    :cond_2d
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObject;

    .line 1033
    .line 1034
    if-eqz v4, :cond_2e

    .line 1035
    .line 1036
    move-object v2, v4

    .line 1037
    goto :goto_4

    .line 1038
    :cond_2e
    move-object/from16 v2, p10

    .line 1039
    .line 1040
    :goto_4
    const/4 v12, 0x0

    .line 1041
    move-object/from16 v1, p3

    .line 1042
    .line 1043
    move/from16 v4, p4

    .line 1044
    .line 1045
    move-wide/from16 v5, p5

    .line 1046
    .line 1047
    move-object/from16 v7, p7

    .line 1048
    .line 1049
    move-object/from16 v8, p8

    .line 1050
    .line 1051
    move-object/from16 v3, p11

    .line 1052
    .line 1053
    move-object/from16 v10, p12

    .line 1054
    .line 1055
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 1056
    .line 1057
    .line 1058
    return-object v0

    .line 1059
    :cond_2f
    :goto_5
    instance-of v2, v4, Ljava/lang/reflect/ParameterizedType;

    .line 1060
    .line 1061
    if-eqz v2, :cond_31

    .line 1062
    .line 1063
    move-object v2, v4

    .line 1064
    check-cast v2, Ljava/lang/reflect/ParameterizedType;

    .line 1065
    .line 1066
    invoke-interface {v2}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v2

    .line 1070
    array-length v3, v2

    .line 1071
    if-ne v3, v1, :cond_31

    .line 1072
    .line 1073
    aget-object v1, v2, v7

    .line 1074
    .line 1075
    move-object v3, v5

    .line 1076
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v5

    .line 1080
    if-ne v5, v0, :cond_30

    .line 1081
    .line 1082
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderList;

    .line 1083
    .line 1084
    const/4 v13, 0x0

    .line 1085
    const/4 v14, 0x0

    .line 1086
    move-object v2, v4

    .line 1087
    const-class v4, Ljava/lang/String;

    .line 1088
    .line 1089
    const-class v5, Ljava/lang/String;

    .line 1090
    .line 1091
    const/4 v11, 0x0

    .line 1092
    move-object/from16 v1, p3

    .line 1093
    .line 1094
    move/from16 v6, p4

    .line 1095
    .line 1096
    move-wide/from16 v7, p5

    .line 1097
    .line 1098
    move-object/from16 v9, p7

    .line 1099
    .line 1100
    move-object/from16 v10, p8

    .line 1101
    .line 1102
    move-object/from16 v3, p11

    .line 1103
    .line 1104
    move-object/from16 v12, p12

    .line 1105
    .line 1106
    invoke-direct/range {v0 .. v14}, Lcom/alibaba/fastjson2/reader/FieldReaderList;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 1107
    .line 1108
    .line 1109
    return-object v0

    .line 1110
    :cond_30
    move-object v2, v4

    .line 1111
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderList;

    .line 1112
    .line 1113
    const/4 v13, 0x0

    .line 1114
    const/4 v14, 0x0

    .line 1115
    const/4 v11, 0x0

    .line 1116
    move/from16 v6, p4

    .line 1117
    .line 1118
    move-wide/from16 v7, p5

    .line 1119
    .line 1120
    move-object/from16 v9, p7

    .line 1121
    .line 1122
    move-object/from16 v10, p8

    .line 1123
    .line 1124
    move-object/from16 v12, p12

    .line 1125
    .line 1126
    move-object v4, v1

    .line 1127
    move-object/from16 v1, p3

    .line 1128
    .line 1129
    invoke-direct/range {v0 .. v14}, Lcom/alibaba/fastjson2/reader/FieldReaderList;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 1130
    .line 1131
    .line 1132
    return-object v0

    .line 1133
    :cond_31
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderList;

    .line 1134
    .line 1135
    const/4 v13, 0x0

    .line 1136
    const/4 v14, 0x0

    .line 1137
    const-class v4, Ljava/lang/Object;

    .line 1138
    .line 1139
    const-class v5, Ljava/lang/Object;

    .line 1140
    .line 1141
    const/4 v11, 0x0

    .line 1142
    move-object/from16 v1, p3

    .line 1143
    .line 1144
    move/from16 v6, p4

    .line 1145
    .line 1146
    move-wide/from16 v7, p5

    .line 1147
    .line 1148
    move-object/from16 v9, p7

    .line 1149
    .line 1150
    move-object/from16 v10, p8

    .line 1151
    .line 1152
    move-object/from16 v2, p10

    .line 1153
    .line 1154
    move-object/from16 v3, p11

    .line 1155
    .line 1156
    move-object/from16 v12, p12

    .line 1157
    .line 1158
    invoke-direct/range {v0 .. v14}, Lcom/alibaba/fastjson2/reader/FieldReaderList;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V

    .line 1159
    .line 1160
    .line 1161
    return-object v0
.end method

.method public createFieldReaderParam(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    .line 220
    invoke-virtual/range {v0 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderParam(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v1

    return-object v1
.end method

.method public createFieldReaderParam(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    .line 219
    invoke-virtual/range {v0 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderParam(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v1

    return-object v1
.end method

.method public createFieldReaderParam(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/util/Locale;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            "Lcom/alibaba/fastjson2/reader/ObjectReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    .line 1
    move-object/from16 v11, p14

    .line 2
    .line 3
    if-eqz v11, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;

    .line 6
    .line 7
    move-object/from16 v1, p3

    .line 8
    .line 9
    move/from16 v5, p4

    .line 10
    .line 11
    move-wide/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v8, p7

    .line 14
    .line 15
    move-object/from16 v9, p8

    .line 16
    .line 17
    move-object/from16 v10, p9

    .line 18
    .line 19
    move-object/from16 v2, p10

    .line 20
    .line 21
    move-object/from16 v3, p11

    .line 22
    .line 23
    move-object/from16 v4, p12

    .line 24
    .line 25
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v11, v0, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->initReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    move-object/from16 v2, p10

    .line 32
    .line 33
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    if-eq v2, v0, :cond_c

    .line 36
    .line 37
    const-class v0, Ljava/lang/Byte;

    .line 38
    .line 39
    if-ne v2, v0, :cond_1

    .line 40
    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 44
    .line 45
    if-eq v2, v0, :cond_b

    .line 46
    .line 47
    const-class v0, Ljava/lang/Short;

    .line 48
    .line 49
    if-ne v2, v0, :cond_2

    .line 50
    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_2
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    if-eq v2, v0, :cond_a

    .line 56
    .line 57
    const-class v0, Ljava/lang/Integer;

    .line 58
    .line 59
    if-ne v2, v0, :cond_3

    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 64
    .line 65
    if-eq v2, v0, :cond_9

    .line 66
    .line 67
    const-class v0, Ljava/lang/Long;

    .line 68
    .line 69
    if-ne v2, v0, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    instance-of v0, v2, Ljava/lang/Class;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    if-nez v0, :cond_6

    .line 76
    .line 77
    if-eqz p2, :cond_6

    .line 78
    .line 79
    invoke-static {p2}, Lcom/alibaba/fastjson2/TypeReference;->get(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/TypeReference;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    move-object/from16 v0, p13

    .line 84
    .line 85
    invoke-static {p2, p1, v0, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getParamType(Lcom/alibaba/fastjson2/TypeReference;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_5

    .line 90
    .line 91
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_5
    move-object v12, v1

    .line 96
    move-object v1, p1

    .line 97
    move-object p1, v12

    .line 98
    goto :goto_0

    .line 99
    :cond_6
    move-object p1, v1

    .line 100
    :goto_0
    if-nez v1, :cond_7

    .line 101
    .line 102
    move-object v3, v2

    .line 103
    goto :goto_1

    .line 104
    :cond_7
    move-object v3, v1

    .line 105
    :goto_1
    if-nez p1, :cond_8

    .line 106
    .line 107
    move-object/from16 v4, p11

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_8
    move-object v4, p1

    .line 111
    :goto_2
    new-instance v1, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;

    .line 112
    .line 113
    move-object/from16 v2, p3

    .line 114
    .line 115
    move/from16 v6, p4

    .line 116
    .line 117
    move-wide/from16 v7, p5

    .line 118
    .line 119
    move-object/from16 v9, p7

    .line 120
    .line 121
    move-object/from16 v10, p8

    .line 122
    .line 123
    move-object/from16 v11, p9

    .line 124
    .line 125
    move-object/from16 v5, p12

    .line 126
    .line 127
    invoke-direct/range {v1 .. v11}, Lcom/alibaba/fastjson2/reader/FieldReaderObjectParam;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :cond_9
    :goto_3
    new-instance v1, Lcom/alibaba/fastjson2/reader/FieldReaderInt64Param;

    .line 132
    .line 133
    move-object/from16 v2, p3

    .line 134
    .line 135
    move/from16 v5, p4

    .line 136
    .line 137
    move-wide/from16 v6, p5

    .line 138
    .line 139
    move-object/from16 v8, p7

    .line 140
    .line 141
    move-object/from16 v9, p8

    .line 142
    .line 143
    move-object/from16 v10, p9

    .line 144
    .line 145
    move-object/from16 v3, p11

    .line 146
    .line 147
    move-object/from16 v4, p12

    .line 148
    .line 149
    invoke-direct/range {v1 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt64Param;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    return-object v1

    .line 153
    :cond_a
    :goto_4
    new-instance v1, Lcom/alibaba/fastjson2/reader/FieldReaderInt32Param;

    .line 154
    .line 155
    move-object/from16 v2, p3

    .line 156
    .line 157
    move/from16 v5, p4

    .line 158
    .line 159
    move-wide/from16 v6, p5

    .line 160
    .line 161
    move-object/from16 v8, p7

    .line 162
    .line 163
    move-object/from16 v9, p8

    .line 164
    .line 165
    move-object/from16 v10, p9

    .line 166
    .line 167
    move-object/from16 v3, p11

    .line 168
    .line 169
    move-object/from16 v4, p12

    .line 170
    .line 171
    invoke-direct/range {v1 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt32Param;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    return-object v1

    .line 175
    :cond_b
    :goto_5
    new-instance v1, Lcom/alibaba/fastjson2/reader/FieldReaderInt16Param;

    .line 176
    .line 177
    move-object/from16 v2, p3

    .line 178
    .line 179
    move/from16 v5, p4

    .line 180
    .line 181
    move-wide/from16 v6, p5

    .line 182
    .line 183
    move-object/from16 v8, p7

    .line 184
    .line 185
    move-object/from16 v9, p8

    .line 186
    .line 187
    move-object/from16 v10, p9

    .line 188
    .line 189
    move-object/from16 v3, p11

    .line 190
    .line 191
    move-object/from16 v4, p12

    .line 192
    .line 193
    invoke-direct/range {v1 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt16Param;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    return-object v1

    .line 197
    :cond_c
    :goto_6
    new-instance v1, Lcom/alibaba/fastjson2/reader/FieldReaderInt8Param;

    .line 198
    .line 199
    move-object/from16 v2, p3

    .line 200
    .line 201
    move/from16 v5, p4

    .line 202
    .line 203
    move-wide/from16 v6, p5

    .line 204
    .line 205
    move-object/from16 v8, p7

    .line 206
    .line 207
    move-object/from16 v9, p8

    .line 208
    .line 209
    move-object/from16 v10, p9

    .line 210
    .line 211
    move-object/from16 v3, p11

    .line 212
    .line 213
    move-object/from16 v4, p12

    .line 214
    .line 215
    invoke-direct/range {v1 .. v10}, Lcom/alibaba/fastjson2/reader/FieldReaderInt8Param;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    return-object v1
.end method

.method public varargs createFieldReaders(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/AccessibleObject;[Ljava/lang/Class;[Ljava/lang/String;)[Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 26

    .line 1
    move-object/from16 v6, p4

    .line 2
    .line 3
    move-object/from16 v7, p5

    .line 4
    .line 5
    move-object/from16 v8, p6

    .line 6
    .line 7
    instance-of v9, v6, Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    if-eqz v9, :cond_0

    .line 10
    .line 11
    move-object v0, v6

    .line 12
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    move-object v5, v0

    .line 27
    move-object/from16 v25, v2

    .line 28
    .line 29
    move-object v2, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    instance-of v0, v6, Ljava/lang/reflect/Method;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    move-object v0, v6

    .line 36
    check-cast v0, Ljava/lang/reflect/Method;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    const/4 v1, 0x0

    .line 52
    move-object v2, v1

    .line 53
    move-object v5, v2

    .line 54
    move-object/from16 v25, v5

    .line 55
    .line 56
    :goto_1
    array-length v0, v7

    .line 57
    new-array v10, v0, [Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    move v14, v0

    .line 61
    :goto_2
    array-length v0, v7

    .line 62
    if-ge v14, v0, :cond_a

    .line 63
    .line 64
    new-instance v1, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 65
    .line 66
    invoke-direct {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 67
    .line 68
    .line 69
    array-length v0, v8

    .line 70
    const-string v11, "arg"

    .line 71
    .line 72
    if-ge v14, v0, :cond_2

    .line 73
    .line 74
    aget-object v0, v8, v14

    .line 75
    .line 76
    :goto_3
    move-object v12, v0

    .line 77
    goto :goto_4

    .line 78
    :cond_2
    invoke-static {v14, v11}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_3

    .line 83
    :goto_4
    if-eqz v9, :cond_3

    .line 84
    .line 85
    move-object v3, v6

    .line 86
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 87
    .line 88
    move-object/from16 v0, p1

    .line 89
    .line 90
    move v4, v14

    .line 91
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;I[[Ljava/lang/annotation/Annotation;)V

    .line 92
    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_3
    move-object/from16 v0, p1

    .line 96
    .line 97
    :goto_5
    if-eqz v9, :cond_4

    .line 98
    .line 99
    invoke-static {v2, v12}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    if-eqz v3, :cond_4

    .line 104
    .line 105
    invoke-virtual {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    iget-object v3, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v3, :cond_6

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_5

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_5
    iget-object v3, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 120
    .line 121
    goto :goto_7

    .line 122
    :cond_6
    :goto_6
    move-object v3, v12

    .line 123
    :goto_7
    if-nez v3, :cond_7

    .line 124
    .line 125
    invoke-static {v14, v11}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    :cond_7
    move-object v13, v3

    .line 130
    if-nez v12, :cond_8

    .line 131
    .line 132
    invoke-static {v14, v11}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    :cond_8
    move-object/from16 v22, v12

    .line 137
    .line 138
    aget-object v3, v25, v14

    .line 139
    .line 140
    move-object/from16 v4, p2

    .line 141
    .line 142
    move-object/from16 v11, p3

    .line 143
    .line 144
    invoke-static {v11, v4, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->resolve(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    if-eqz v12, :cond_9

    .line 149
    .line 150
    move-object v3, v12

    .line 151
    :cond_9
    aget-object v12, v7, v14

    .line 152
    .line 153
    invoke-static {v0, v3, v12, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->getInitReader(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/reflect/Type;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/FieldInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 154
    .line 155
    .line 156
    move-result-object v24

    .line 157
    move-object/from16 v23, v2

    .line 158
    .line 159
    move-object/from16 v20, v3

    .line 160
    .line 161
    iget-wide v2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 162
    .line 163
    iget-object v12, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 164
    .line 165
    iget-object v15, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->locale:Ljava/util/Locale;

    .line 166
    .line 167
    iget-object v1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 168
    .line 169
    aget-object v21, v7, v14

    .line 170
    .line 171
    const/4 v11, 0x0

    .line 172
    move-object/from16 v17, v12

    .line 173
    .line 174
    const/4 v12, 0x0

    .line 175
    move-object/from16 v19, v1

    .line 176
    .line 177
    move-object v1, v10

    .line 178
    move-object/from16 v18, v15

    .line 179
    .line 180
    move-object/from16 v10, p0

    .line 181
    .line 182
    move-wide v15, v2

    .line 183
    invoke-virtual/range {v10 .. v24}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderParam(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    aput-object v2, v1, v14

    .line 188
    .line 189
    add-int/lit8 v14, v14, 0x1

    .line 190
    .line 191
    move-object v10, v1

    .line 192
    move-object/from16 v2, v23

    .line 193
    .line 194
    goto/16 :goto_2

    .line 195
    .line 196
    :cond_a
    move-object v1, v10

    .line 197
    return-object v1
.end method

.method public createFieldReaders(Ljava/lang/Class;)[Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    const/4 v4, 0x0

    .line 198
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    const/4 v3, 0x0

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaders(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/codec/BeanInfo;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReaders(Ljava/lang/Class;Ljava/lang/reflect/Type;)[Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            ")[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    const/4 v4, 0x0

    .line 199
    sget-object v5, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaders(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/codec/BeanInfo;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    return-object p1
.end method

.method public createFieldReaders(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/codec/BeanInfo;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)[Lcom/alibaba/fastjson2/reader/FieldReader;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Z",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;",
            ")[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;"
        }
    .end annotation

    move-object/from16 v7, p5

    if-nez p3, :cond_0

    .line 200
    new-instance v0, Lcom/alibaba/fastjson2/codec/BeanInfo;

    invoke-direct {v0}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    .line 201
    invoke-virtual {v7, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    .line 202
    :goto_0
    iget-object v4, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->namingStrategy:Ljava/lang/String;

    .line 203
    new-instance v8, Ljava/util/LinkedHashMap;

    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 204
    new-instance v5, Lcom/alibaba/fastjson2/codec/FieldInfo;

    invoke-direct {v5}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 205
    iget-object v10, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->orders:[Ljava/lang/String;

    .line 206
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;

    move-object v1, v8

    move-object v8, v6

    move-object v6, v1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v9, p4

    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$FieldConsumer;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/util/Map;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Z)V

    move-object v12, v8

    move-object v8, v6

    move-object v6, v12

    if-eqz p4, :cond_1

    .line 207
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->declaredFields(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    goto :goto_1

    .line 208
    :cond_1
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->declaredFields(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 209
    iget-object v0, v7, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->mixInCache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/lang/Class;

    .line 210
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v9, v7

    move-object v7, v5

    move-object v5, v10

    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator$CreateFieldReaderConsumer;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;[Ljava/lang/String;Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/util/Map;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    .line 211
    invoke-static {p1, v6, v11, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->setters(Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 212
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 213
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->getters(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 214
    :cond_2
    :goto_1
    invoke-interface {v8}, Ljava/util/Map;->size()I

    move-result p1

    new-array p1, p1, [Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 215
    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 216
    invoke-static {p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    return-object p1
.end method

.method public varargs createFunction(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;[Ljava/lang/String;)Ljava/util/function/Function;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Constructor;",
            "Ljava/lang/reflect/Constructor;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/function/Function<",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;TT;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 5
    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 9
    .line 10
    .line 11
    :goto_0
    new-instance v1, Lcom/alibaba/fastjson2/reader/ConstructorFunction;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v3, p1

    .line 17
    move-object v6, p2

    .line 18
    move-object v7, p3

    .line 19
    invoke-direct/range {v1 .. v7}, Lcom/alibaba/fastjson2/reader/ConstructorFunction;-><init>(Ljava/util/List;Ljava/lang/reflect/Constructor;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/lang/reflect/Constructor;[Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public varargs createFunction(Ljava/lang/reflect/Constructor;[Ljava/lang/String;)Ljava/util/function/Function;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Constructor;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/function/Function<",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;TT;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 24
    new-instance v1, Lcom/alibaba/fastjson2/reader/ConstructorFunction;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    move-object v7, p2

    invoke-direct/range {v1 .. v7}, Lcom/alibaba/fastjson2/reader/ConstructorFunction;-><init>(Ljava/util/List;Ljava/lang/reflect/Constructor;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/lang/reflect/Constructor;[Ljava/lang/String;)V

    return-object v1
.end method

.method public createObjectReader(Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 797
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {p0, p1, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/lang/reflect/Type;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public varargs createObjectReader(Ljava/lang/Class;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;J",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/util/function/Function;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v4, p2

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    .line 777
    invoke-virtual/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public varargs createObjectReader(Ljava/lang/Class;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/util/function/Function;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p3

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    .line 778
    invoke-virtual/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public varargs createObjectReader(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/util/function/Function;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    if-eqz p1, :cond_1

    .line 779
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    .line 780
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 781
    :cond_0
    new-instance v1, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;

    const/4 v4, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v1

    :cond_1
    if-eqz p3, :cond_2

    .line 782
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReaderRootName;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v6, p3

    move-wide/from16 v7, p4

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v14, p8

    invoke-direct/range {v2 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderRootName;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v2

    :cond_2
    move-object/from16 v10, p8

    .line 783
    array-length v0, v10

    packed-switch v0, :pswitch_data_0

    .line 784
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-wide/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v2

    .line 785
    :pswitch_0
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReader6;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-wide/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader6;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v2

    .line 786
    :pswitch_1
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReader5;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-wide/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v2

    .line 787
    :pswitch_2
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReader4;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-wide/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v2

    .line 788
    :pswitch_3
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReader3;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-wide/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader3;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v2

    .line 789
    :pswitch_4
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReader2;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-wide/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader2;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v2

    .line 790
    :pswitch_5
    new-instance v2, Lcom/alibaba/fastjson2/reader/ObjectReader1;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-wide/from16 v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-direct/range {v2 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReader1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public createObjectReader(Ljava/lang/Class;Ljava/lang/reflect/Type;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Z",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    new-instance v4, Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 8
    .line 9
    invoke-direct {v4}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    .line 10
    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    iget-wide v5, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 15
    .line 16
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 17
    .line 18
    iget-wide v7, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 19
    .line 20
    or-long/2addr v5, v7

    .line 21
    iput-wide v5, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0, v4, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    iget-wide v5, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 27
    .line 28
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 29
    .line 30
    iget-wide v7, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 31
    .line 32
    and-long/2addr v5, v7

    .line 33
    const-wide/16 v7, 0x0

    .line 34
    .line 35
    cmp-long v5, v5, v7

    .line 36
    .line 37
    const/4 v10, 0x1

    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    move v5, v10

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move/from16 v5, p3

    .line 43
    .line 44
    :goto_0
    iget-object v6, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->deserializer:Ljava/lang/Class;

    .line 45
    .line 46
    const/4 v11, 0x0

    .line 47
    if-eqz v6, :cond_2

    .line 48
    .line 49
    const-class v9, Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 50
    .line 51
    invoke-virtual {v9, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    :try_start_0
    iget-object v0, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->deserializer:Ljava/lang/Class;

    .line 58
    .line 59
    invoke-virtual {v0, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Lcom/alibaba/fastjson2/reader/ObjectReader;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    return-object v0

    .line 73
    :catch_0
    move-exception v0

    .line 74
    goto :goto_1

    .line 75
    :catch_1
    move-exception v0

    .line 76
    goto :goto_1

    .line 77
    :catch_2
    move-exception v0

    .line 78
    goto :goto_1

    .line 79
    :catch_3
    move-exception v0

    .line 80
    :goto_1
    const-string v2, "create deserializer error"

    .line 81
    .line 82
    invoke-static {v2, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    return-object v0

    .line 87
    :cond_2
    if-eqz v5, :cond_3

    .line 88
    .line 89
    iget-wide v12, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 90
    .line 91
    iget-wide v14, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 92
    .line 93
    or-long/2addr v12, v14

    .line 94
    iput-wide v12, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 95
    .line 96
    :cond_3
    const-class v3, Ljava/lang/Enum;

    .line 97
    .line 98
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    if-eqz v3, :cond_5

    .line 103
    .line 104
    iget-object v3, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 105
    .line 106
    if-eqz v3, :cond_4

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    array-length v3, v3

    .line 113
    if-ne v3, v10, :cond_5

    .line 114
    .line 115
    :cond_4
    iget-object v3, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 116
    .line 117
    invoke-virtual {v1, v2, v3, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createEnumReader(Ljava/lang/Class;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0

    .line 122
    :cond_5
    const-class v9, Ljava/lang/Throwable;

    .line 123
    .line 124
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_6

    .line 129
    .line 130
    iget-wide v5, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 131
    .line 132
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreSetNullValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 133
    .line 134
    iget-wide v13, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 135
    .line 136
    or-long/2addr v5, v13

    .line 137
    iput-wide v5, v4, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 138
    .line 139
    const/4 v5, 0x0

    .line 140
    :cond_6
    const-class v3, Ljava/lang/Class;

    .line 141
    .line 142
    if-ne v2, v3, :cond_7

    .line 143
    .line 144
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplClass;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplClass;

    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_7
    if-eqz v5, :cond_8

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-eqz v3, :cond_8

    .line 154
    .line 155
    const/4 v5, 0x0

    .line 156
    :cond_8
    move-object/from16 v3, p2

    .line 157
    .line 158
    move-object v6, v0

    .line 159
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaders(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/codec/BeanInfo;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    move-object v14, v1

    .line 164
    move-object v15, v4

    .line 165
    move/from16 v16, v5

    .line 166
    .line 167
    move-object v0, v6

    .line 168
    move-object v6, v3

    .line 169
    const/4 v1, 0x0

    .line 170
    :goto_2
    array-length v3, v13

    .line 171
    if-ge v1, v3, :cond_a

    .line 172
    .line 173
    aget-object v3, v13, v1

    .line 174
    .line 175
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/reader/FieldReader;->isReadOnly()Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-nez v3, :cond_9

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_9
    add-int/lit8 v1, v1, 0x1

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_a
    move/from16 v17, v10

    .line 188
    .line 189
    :goto_3
    iget-object v1, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 190
    .line 191
    if-nez v1, :cond_b

    .line 192
    .line 193
    iget-object v1, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 194
    .line 195
    if-eqz v1, :cond_c

    .line 196
    .line 197
    :cond_b
    move-object v3, v6

    .line 198
    move-object v1, v14

    .line 199
    goto/16 :goto_13

    .line 200
    .line 201
    :cond_c
    iget-object v1, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->builder:Ljava/lang/Class;

    .line 202
    .line 203
    if-eqz v1, :cond_d

    .line 204
    .line 205
    invoke-virtual {v14, v2, v6, v0, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReaderWithBuilder(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    return-object v0

    .line 210
    :cond_d
    new-instance v1, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 213
    .line 214
    .line 215
    new-instance v3, Lbe/m0;

    .line 216
    .line 217
    const/4 v4, 0x2

    .line 218
    invoke-direct {v3, v4, v1}, Lbe/m0;-><init>(ILjava/util/ArrayList;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->constructor(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_e

    .line 229
    .line 230
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderException;

    .line 231
    .line 232
    invoke-direct {v0, v2, v1, v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderException;-><init>(Ljava/lang/Class;Ljava/util/List;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    const/4 v4, -0x1

    .line 241
    move/from16 v19, v4

    .line 242
    .line 243
    move-wide/from16 v21, v7

    .line 244
    .line 245
    move-object/from16 v18, v11

    .line 246
    .line 247
    move-object/from16 v20, v18

    .line 248
    .line 249
    const/4 v5, 0x0

    .line 250
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-ge v5, v7, :cond_15

    .line 255
    .line 256
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    check-cast v7, Ljava/lang/reflect/Constructor;

    .line 261
    .line 262
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    array-length v8, v8

    .line 267
    if-nez v8, :cond_f

    .line 268
    .line 269
    move-object/from16 v20, v7

    .line 270
    .line 271
    :cond_f
    if-eqz v3, :cond_10

    .line 272
    .line 273
    if-ne v8, v10, :cond_10

    .line 274
    .line 275
    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v23

    .line 279
    const/16 p3, 0x0

    .line 280
    .line 281
    aget-object v12, v23, p3

    .line 282
    .line 283
    invoke-virtual {v3, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v12

    .line 287
    if-eqz v12, :cond_11

    .line 288
    .line 289
    move-object v3, v7

    .line 290
    goto :goto_6

    .line 291
    :cond_10
    const/16 p3, 0x0

    .line 292
    .line 293
    :cond_11
    if-nez v18, :cond_12

    .line 294
    .line 295
    goto :goto_5

    .line 296
    :cond_12
    if-nez v8, :cond_13

    .line 297
    .line 298
    goto :goto_5

    .line 299
    :cond_13
    invoke-virtual/range {v18 .. v18}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    array-length v12, v12

    .line 304
    if-ge v12, v8, :cond_14

    .line 305
    .line 306
    :goto_5
    move/from16 v19, v5

    .line 307
    .line 308
    move-object/from16 v18, v7

    .line 309
    .line 310
    :cond_14
    add-int/lit8 v5, v5, 0x1

    .line 311
    .line 312
    goto :goto_4

    .line 313
    :cond_15
    const/16 p3, 0x0

    .line 314
    .line 315
    move-object/from16 v3, v18

    .line 316
    .line 317
    move/from16 v5, v19

    .line 318
    .line 319
    :goto_6
    if-eqz v3, :cond_16

    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    array-length v7, v7

    .line 326
    goto :goto_7

    .line 327
    :cond_16
    move v7, v4

    .line 328
    :goto_7
    if-eq v5, v4, :cond_17

    .line 329
    .line 330
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    :cond_17
    if-eqz v3, :cond_27

    .line 334
    .line 335
    if-eqz v7, :cond_27

    .line 336
    .line 337
    iget-object v4, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 338
    .line 339
    if-nez v4, :cond_27

    .line 340
    .line 341
    invoke-virtual {v3, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 342
    .line 343
    .line 344
    iget-object v4, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;

    .line 345
    .line 346
    if-eqz v4, :cond_19

    .line 347
    .line 348
    array-length v5, v4

    .line 349
    if-nez v5, :cond_18

    .line 350
    .line 351
    goto :goto_8

    .line 352
    :cond_18
    move-object/from16 v18, v1

    .line 353
    .line 354
    move-object v8, v4

    .line 355
    goto :goto_a

    .line 356
    :cond_19
    :goto_8
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->lookupParameterNames(Ljava/lang/reflect/Constructor;)[Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v8

    .line 360
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 365
    .line 366
    .line 367
    move-result-object v5

    .line 368
    move-object v4, v1

    .line 369
    new-instance v1, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 370
    .line 371
    invoke-direct {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 372
    .line 373
    .line 374
    move-object/from16 v18, v4

    .line 375
    .line 376
    move/from16 v4, p3

    .line 377
    .line 378
    :goto_9
    array-length v11, v12

    .line 379
    if-ge v4, v11, :cond_1b

    .line 380
    .line 381
    array-length v11, v8

    .line 382
    if-ge v4, v11, :cond_1b

    .line 383
    .line 384
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 385
    .line 386
    .line 387
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;I[[Ljava/lang/annotation/Annotation;)V

    .line 388
    .line 389
    .line 390
    iget-object v0, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 391
    .line 392
    if-eqz v0, :cond_1a

    .line 393
    .line 394
    aput-object v0, v8, v4

    .line 395
    .line 396
    :cond_1a
    add-int/lit8 v4, v4, 0x1

    .line 397
    .line 398
    move-object/from16 v0, p4

    .line 399
    .line 400
    goto :goto_9

    .line 401
    :cond_1b
    :goto_a
    if-eqz v20, :cond_1f

    .line 402
    .line 403
    move/from16 v0, p3

    .line 404
    .line 405
    move v1, v0

    .line 406
    :goto_b
    array-length v4, v8

    .line 407
    if-ge v0, v4, :cond_20

    .line 408
    .line 409
    aget-object v4, v8, v0

    .line 410
    .line 411
    if-nez v4, :cond_1c

    .line 412
    .line 413
    goto :goto_d

    .line 414
    :cond_1c
    move/from16 v5, p3

    .line 415
    .line 416
    :goto_c
    array-length v11, v13

    .line 417
    if-ge v5, v11, :cond_1e

    .line 418
    .line 419
    aget-object v11, v13, v5

    .line 420
    .line 421
    if-eqz v11, :cond_1d

    .line 422
    .line 423
    iget-object v11, v11, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    move-result v11

    .line 429
    if-eqz v11, :cond_1d

    .line 430
    .line 431
    add-int/lit8 v1, v1, 0x1

    .line 432
    .line 433
    goto :goto_d

    .line 434
    :cond_1d
    add-int/lit8 v5, v5, 0x1

    .line 435
    .line 436
    goto :goto_c

    .line 437
    :cond_1e
    :goto_d
    add-int/lit8 v0, v0, 0x1

    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_1f
    move/from16 v1, p3

    .line 441
    .line 442
    :cond_20
    if-nez v16, :cond_27

    .line 443
    .line 444
    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 445
    .line 446
    .line 447
    move-result v0

    .line 448
    if-nez v0, :cond_27

    .line 449
    .line 450
    if-nez v20, :cond_27

    .line 451
    .line 452
    array-length v0, v8

    .line 453
    if-eq v1, v0, :cond_27

    .line 454
    .line 455
    if-ne v7, v10, :cond_23

    .line 456
    .line 457
    new-instance v1, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 458
    .line 459
    invoke-direct {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 460
    .line 461
    .line 462
    const/4 v4, 0x0

    .line 463
    const/4 v5, 0x0

    .line 464
    move-object/from16 v0, p4

    .line 465
    .line 466
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;I[[Ljava/lang/annotation/Annotation;)V

    .line 467
    .line 468
    .line 469
    iget-wide v4, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 470
    .line 471
    const-wide/high16 v9, 0x1000000000000L

    .line 472
    .line 473
    and-long/2addr v4, v9

    .line 474
    cmp-long v0, v4, v21

    .line 475
    .line 476
    if-eqz v0, :cond_23

    .line 477
    .line 478
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    aget-object v2, v0, p3

    .line 483
    .line 484
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    aget-object v0, v0, p3

    .line 489
    .line 490
    iget-object v4, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 491
    .line 492
    if-eqz v4, :cond_21

    .line 493
    .line 494
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    move-result-object v5

    .line 498
    if-eq v5, v0, :cond_21

    .line 499
    .line 500
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    move-result-object v6

    .line 508
    invoke-virtual {v5, v6, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    if-eqz v5, :cond_22

    .line 513
    .line 514
    invoke-interface {v5, v4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    :cond_21
    move-object/from16 v18, v3

    .line 519
    .line 520
    move-object v7, v4

    .line 521
    move-object v3, v0

    .line 522
    goto :goto_e

    .line 523
    :cond_22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 524
    .line 525
    const-string v2, "illegal defaultValue : "

    .line 526
    .line 527
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    const-string v2, ", class "

    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-static {v1, v2, v0}, Lah/a;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    const/4 v0, 0x0

    .line 543
    return-object v0

    .line 544
    :goto_e
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;

    .line 545
    .line 546
    iget-wide v4, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 547
    .line 548
    iget-object v6, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 549
    .line 550
    const/4 v9, 0x0

    .line 551
    const/4 v10, 0x0

    .line 552
    move-object/from16 v1, p1

    .line 553
    .line 554
    move-object/from16 v8, v18

    .line 555
    .line 556
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    .line 557
    .line 558
    .line 559
    return-object v0

    .line 560
    :cond_23
    if-eqz v17, :cond_26

    .line 561
    .line 562
    array-length v0, v13

    .line 563
    if-eqz v0, :cond_26

    .line 564
    .line 565
    invoke-virtual/range {v18 .. v18}, Ljava/util/ArrayList;->isEmpty()Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    if-eqz v0, :cond_26

    .line 570
    .line 571
    move/from16 v0, p3

    .line 572
    .line 573
    :goto_f
    array-length v1, v8

    .line 574
    if-ge v0, v1, :cond_26

    .line 575
    .line 576
    aget-object v1, v8, v0

    .line 577
    .line 578
    array-length v2, v13

    .line 579
    move/from16 v4, p3

    .line 580
    .line 581
    :goto_10
    if-ge v4, v2, :cond_25

    .line 582
    .line 583
    aget-object v5, v13, v4

    .line 584
    .line 585
    iget-object v7, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->field:Ljava/lang/reflect/Field;

    .line 586
    .line 587
    if-eqz v7, :cond_24

    .line 588
    .line 589
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v7

    .line 593
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v7

    .line 597
    if-eqz v7, :cond_24

    .line 598
    .line 599
    iget-object v7, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 600
    .line 601
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v7

    .line 605
    if-nez v7, :cond_24

    .line 606
    .line 607
    iget-object v1, v5, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 608
    .line 609
    aput-object v1, v8, v0

    .line 610
    .line 611
    goto :goto_11

    .line 612
    :cond_24
    add-int/lit8 v4, v4, 0x1

    .line 613
    .line 614
    goto :goto_10

    .line 615
    :cond_25
    :goto_11
    add-int/lit8 v0, v0, 0x1

    .line 616
    .line 617
    goto :goto_f

    .line 618
    :cond_26
    new-instance v16, Lcom/alibaba/fastjson2/reader/ConstructorFunction;

    .line 619
    .line 620
    const/16 v20, 0x0

    .line 621
    .line 622
    const/16 v21, 0x0

    .line 623
    .line 624
    const/16 v19, 0x0

    .line 625
    .line 626
    move-object/from16 v22, v8

    .line 627
    .line 628
    move-object/from16 v17, v18

    .line 629
    .line 630
    move-object/from16 v18, v3

    .line 631
    .line 632
    invoke-direct/range {v16 .. v22}, Lcom/alibaba/fastjson2/reader/ConstructorFunction;-><init>(Ljava/util/List;Ljava/lang/reflect/Constructor;Ljava/util/function/Function;Ljava/util/function/BiFunction;Ljava/lang/reflect/Constructor;[Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    move-object/from16 v7, v22

    .line 636
    .line 637
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    move-result-object v6

    .line 641
    move-object/from16 v4, p2

    .line 642
    .line 643
    move-object/from16 v2, p4

    .line 644
    .line 645
    move-object v5, v3

    .line 646
    move-object v1, v14

    .line 647
    move-object/from16 v3, p1

    .line 648
    .line 649
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaders(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/AccessibleObject;[Ljava/lang/Class;[Ljava/lang/String;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 650
    .line 651
    .line 652
    move-result-object v8

    .line 653
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;

    .line 654
    .line 655
    iget-object v2, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 656
    .line 657
    iget-object v3, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 658
    .line 659
    iget-wide v4, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 660
    .line 661
    const/4 v10, 0x0

    .line 662
    const/4 v11, 0x0

    .line 663
    move-object/from16 v1, p1

    .line 664
    .line 665
    move-object v9, v13

    .line 666
    move-object/from16 v6, v16

    .line 667
    .line 668
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    return-object v0

    .line 672
    :cond_27
    move-object v9, v13

    .line 673
    iget-object v4, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 674
    .line 675
    if-eqz v4, :cond_28

    .line 676
    .line 677
    array-length v0, v4

    .line 678
    if-eqz v0, :cond_28

    .line 679
    .line 680
    iget-object v3, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 681
    .line 682
    iget-object v5, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlsoNames:[Ljava/lang/String;

    .line 683
    .line 684
    iget-object v6, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlsoDefault:Ljava/lang/Class;

    .line 685
    .line 686
    move-object/from16 v1, p0

    .line 687
    .line 688
    move-object/from16 v2, p1

    .line 689
    .line 690
    move-object v7, v9

    .line 691
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReaderSeeAlso(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    return-object v0

    .line 696
    :cond_28
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->isInterface()Z

    .line 697
    .line 698
    .line 699
    move-result v0

    .line 700
    if-eqz v0, :cond_29

    .line 701
    .line 702
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderInterface;

    .line 703
    .line 704
    const/4 v6, 0x0

    .line 705
    const/4 v7, 0x0

    .line 706
    const/4 v2, 0x0

    .line 707
    const/4 v3, 0x0

    .line 708
    const-wide/16 v4, 0x0

    .line 709
    .line 710
    move-object/from16 v1, p1

    .line 711
    .line 712
    move-object v8, v9

    .line 713
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReaderInterface;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 714
    .line 715
    .line 716
    return-object v0

    .line 717
    :cond_29
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createSupplier(Ljava/lang/Class;)Ljava/util/function/Supplier;

    .line 718
    .line 719
    .line 720
    move-result-object v7

    .line 721
    iget-object v3, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 722
    .line 723
    iget-object v4, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->rootName:Ljava/lang/String;

    .line 724
    .line 725
    iget-wide v5, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 726
    .line 727
    const/4 v8, 0x0

    .line 728
    move-object/from16 v1, p0

    .line 729
    .line 730
    move-object/from16 v2, p1

    .line 731
    .line 732
    invoke-virtual/range {v1 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    instance-of v2, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    .line 737
    .line 738
    if-eqz v2, :cond_2b

    .line 739
    .line 740
    iget-object v2, v15, Lcom/alibaba/fastjson2/codec/BeanInfo;->autoTypeBeforeHandler:Ljava/lang/Class;

    .line 741
    .line 742
    if-eqz v2, :cond_2a

    .line 743
    .line 744
    const/4 v3, 0x0

    .line 745
    :try_start_1
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    invoke-virtual {v2, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    check-cast v2, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    .line 757
    .line 758
    move-object v11, v2

    .line 759
    goto :goto_12

    .line 760
    :cond_2a
    const/4 v3, 0x0

    .line 761
    :catch_4
    move-object v11, v3

    .line 762
    :goto_12
    if-eqz v11, :cond_2b

    .line 763
    .line 764
    move-object v2, v0

    .line 765
    check-cast v2, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    .line 766
    .line 767
    invoke-virtual {v2, v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->setAutoTypeBeforeHandler(Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;)V

    .line 768
    .line 769
    .line 770
    :cond_2b
    return-object v0

    .line 771
    :goto_13
    invoke-virtual {v1, v2, v3, v0, v15}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReaderWithCreator(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    return-object v0
.end method

.method public varargs createObjectReader(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/function/Supplier<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    const-wide/16 v3, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p2

    move-object v7, p3

    .line 776
    invoke-virtual/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public createObjectReader(Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;Z)",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 798
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {p0, p1, p1, p2, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/lang/reflect/Type;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public varargs createObjectReader(Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 799
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createSupplier(Ljava/lang/Class;)Ljava/util/function/Supplier;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v7, p2

    .line 800
    invoke-virtual/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/lang/String;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public createObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 791
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_0

    .line 792
    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1

    .line 793
    :cond_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    .line 794
    invoke-virtual {p0, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaders(Ljava/lang/Class;Ljava/lang/reflect/Type;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object p1

    .line 795
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createSupplier(Ljava/lang/Class;)Ljava/util/function/Supplier;

    move-result-object v1

    .line 796
    invoke-virtual {p0, v0, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public varargs createObjectReaderFactoryMethod(Ljava/lang/reflect/Method;[Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Method;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual/range {p0 .. p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFactoryFunction(Ljava/lang/reflect/Method;[Ljava/lang/String;)Ljava/util/function/Function;

    .line 2
    .line 3
    .line 4
    move-result-object v6

    .line 5
    sget-object v8, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 6
    .line 7
    const/4 v10, 0x0

    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v12

    .line 12
    const/4 v9, 0x0

    .line 13
    move-object v7, p0

    .line 14
    move-object v11, p1

    .line 15
    move-object/from16 v13, p2

    .line 16
    .line 17
    invoke-virtual/range {v7 .. v13}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaders(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/AccessibleObject;[Ljava/lang/Class;[Ljava/lang/String;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    move-object/from16 v7, p2

    .line 30
    .line 31
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public varargs createObjectReaderNoneDefaultConstructor(Ljava/lang/Class;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class;",
            "Ljava/util/function/Function<",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;TT;>;[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 28
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v1, p1

    move-object v6, p2

    move-object v8, p3

    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V

    return-object v0
.end method

.method public varargs createObjectReaderNoneDefaultConstructor(Ljava/lang/reflect/Constructor;[Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Constructor;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFunction(Ljava/lang/reflect/Constructor;[Ljava/lang/String;)Ljava/util/function/Function;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    move-object v4, v3

    .line 16
    move-object v1, p0

    .line 17
    move-object v5, p1

    .line 18
    move-object v7, p2

    .line 19
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaders(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/AccessibleObject;[Ljava/lang/Class;[Ljava/lang/String;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0, v3, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReaderNoneDefaultConstructor(Ljava/lang/Class;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public varargs createObjectReaderSeeAlso(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class;",
            "[",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 20
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createSupplier(Ljava/lang/Class;)Ljava/util/function/Supplier;

    move-result-object v2

    .line 21
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;-><init>(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v0
.end method

.method public varargs createObjectReaderSeeAlso(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class;",
            "[",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 18
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createSupplier(Ljava/lang/Class;)Ljava/util/function/Supplier;

    move-result-object v2

    .line 19
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;-><init>(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v0
.end method

.method public varargs createObjectReaderSeeAlso(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class;",
            "[",
            "Ljava/lang/String;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 22
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;-><init>(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    return-object v0
.end method

.method public varargs createObjectReaderSeeAlso(Ljava/lang/Class;[Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Ljava/lang/Class;",
            "[",
            "Lcom/alibaba/fastjson2/reader/FieldReader;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createSupplier(Ljava/lang/Class;)Ljava/util/function/Supplier;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    const-string v3, "@type"

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    move-object v4, p2

    .line 13
    move-object v7, p3

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderSeeAlso;-><init>(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/FieldReader;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public createObjectReaderWithBuilder(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p4

    .line 2
    .line 3
    iget-object v0, v7, Lcom/alibaba/fastjson2/codec/BeanInfo;->buildMethod:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createBuildFunction(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    move-object v11, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    iget-object v2, v7, Lcom/alibaba/fastjson2/codec/BeanInfo;->builder:Ljava/lang/Class;

    .line 16
    .line 17
    iget-object v0, v7, Lcom/alibaba/fastjson2/codec/BeanInfo;->builderWithPrefix:Ljava/lang/String;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_1
    :goto_2
    move-object v5, v0

    .line 29
    goto :goto_4

    .line 30
    :cond_2
    :goto_3
    const-string v0, "with"

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :goto_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 40
    .line 41
    .line 42
    move-object v6, v2

    .line 43
    new-instance v2, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 44
    .line 45
    invoke-direct {v2}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lcom/alibaba/fastjson2/reader/c;

    .line 49
    .line 50
    move-object v1, p0

    .line 51
    move-object v4, p1

    .line 52
    move-object v10, p2

    .line 53
    move-object v3, p3

    .line 54
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/c;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;ILjava/util/LinkedHashMap;Ljava/lang/reflect/Type;)V

    .line 55
    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    invoke-static {v6, p1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->setters(Ljava/lang/Class;ZLjava/util/function/Consumer;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v9}, Ljava/util/Map;->size()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    new-array v7, p1, [Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 66
    .line 67
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1, v7}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-static {v7}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createSupplier(Ljava/lang/Class;)Ljava/util/function/Supplier;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    const-wide/16 v3, 0x0

    .line 82
    .line 83
    move-object v2, v6

    .line 84
    move-object v6, v11

    .line 85
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createObjectReader(Ljava/lang/Class;JLjava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1
.end method

.method public createObjectReaderWithCreator(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            "Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            ")",
            "Lcom/alibaba/fastjson2/reader/ObjectReader<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p4

    .line 2
    .line 3
    new-instance v1, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 4
    .line 5
    invoke-direct {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v2, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 28
    .line 29
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->lookupParameterNames(Ljava/lang/reflect/Constructor;)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 34
    .line 35
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v5, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    :goto_0
    move-object v14, v0

    .line 46
    move-object v11, v2

    .line 47
    move-object v15, v3

    .line 48
    move-object/from16 v16, v4

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    iget-object v0, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-object v2, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    array-length v3, v0

    .line 64
    new-array v3, v3, [Ljava/lang/String;

    .line 65
    .line 66
    iget-object v4, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v5, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    goto :goto_0

    .line 79
    :goto_1
    const/4 v7, 0x0

    .line 80
    move v4, v7

    .line 81
    :goto_2
    array-length v0, v14

    .line 82
    const-wide/16 v8, 0x0

    .line 83
    .line 84
    const-wide/high16 v17, 0x1000000000000L

    .line 85
    .line 86
    const/4 v10, 0x1

    .line 87
    if-ge v4, v0, :cond_e

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 90
    .line 91
    .line 92
    iget-object v3, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 93
    .line 94
    if-eqz v3, :cond_1

    .line 95
    .line 96
    move-object/from16 v2, p1

    .line 97
    .line 98
    move-object/from16 v0, p3

    .line 99
    .line 100
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;I[[Ljava/lang/annotation/Annotation;)V

    .line 101
    .line 102
    .line 103
    move-object v12, v2

    .line 104
    move-object v2, v1

    .line 105
    move-object v1, v12

    .line 106
    move v12, v4

    .line 107
    move-object/from16 v19, v5

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_1
    move-object/from16 v0, p3

    .line 111
    .line 112
    move-object v2, v1

    .line 113
    move v12, v4

    .line 114
    move-object/from16 v19, v5

    .line 115
    .line 116
    move-object/from16 v1, p1

    .line 117
    .line 118
    iget-object v3, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 119
    .line 120
    invoke-virtual {v0, v2, v1, v3, v12}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;I)V

    .line 121
    .line 122
    .line 123
    :goto_3
    array-length v3, v14

    .line 124
    if-ne v3, v10, :cond_2

    .line 125
    .line 126
    iget-wide v3, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 127
    .line 128
    and-long v3, v3, v17

    .line 129
    .line 130
    cmp-long v3, v3, v8

    .line 131
    .line 132
    if-eqz v3, :cond_2

    .line 133
    .line 134
    move-object/from16 v21, v15

    .line 135
    .line 136
    move-object v15, v2

    .line 137
    :goto_4
    move-object/from16 v11, p0

    .line 138
    .line 139
    move/from16 v20, v7

    .line 140
    .line 141
    goto/16 :goto_c

    .line 142
    .line 143
    :cond_2
    iget-object v3, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 144
    .line 145
    const-string v8, "arg"

    .line 146
    .line 147
    if-eqz v3, :cond_3

    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_6

    .line 154
    .line 155
    :cond_3
    iget-object v4, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createParameterNames:[Ljava/lang/String;

    .line 156
    .line 157
    if-eqz v4, :cond_4

    .line 158
    .line 159
    array-length v5, v4

    .line 160
    if-ge v12, v5, :cond_4

    .line 161
    .line 162
    aget-object v3, v4, v12

    .line 163
    .line 164
    :cond_4
    if-eqz v3, :cond_5

    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_6

    .line 171
    .line 172
    :cond_5
    invoke-static {v12, v8}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    :cond_6
    invoke-virtual {v3, v8, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    if-eqz v4, :cond_8

    .line 181
    .line 182
    array-length v4, v15

    .line 183
    if-le v4, v12, :cond_7

    .line 184
    .line 185
    aget-object v3, v15, v12

    .line 186
    .line 187
    :cond_7
    :goto_5
    move-object v5, v3

    .line 188
    goto :goto_6

    .line 189
    :cond_8
    aput-object v3, v15, v12

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :goto_6
    aget-object v9, v14, v12

    .line 193
    .line 194
    new-instance v0, Lcom/alibaba/fastjson2/reader/b;

    .line 195
    .line 196
    move-object v3, v1

    .line 197
    move-object v4, v6

    .line 198
    move-object v1, v9

    .line 199
    move-object v6, v2

    .line 200
    move-object/from16 v2, p3

    .line 201
    .line 202
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/b;-><init>(Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/String;Lcom/alibaba/fastjson2/codec/FieldInfo;)V

    .line 203
    .line 204
    .line 205
    move-object v1, v3

    .line 206
    move-object v3, v0

    .line 207
    move-object v0, v2

    .line 208
    move-object v2, v6

    .line 209
    invoke-static {v1, v3}, Lcom/alibaba/fastjson2/util/BeanUtils;->getters(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 210
    .line 211
    .line 212
    if-eqz v5, :cond_a

    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_9

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_9
    :goto_7
    move-object v3, v5

    .line 222
    goto :goto_9

    .line 223
    :cond_a
    :goto_8
    invoke-static {v12, v8}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    goto :goto_7

    .line 228
    :goto_9
    aget-object v8, v16, v12

    .line 229
    .line 230
    move v4, v12

    .line 231
    invoke-static {v0, v8, v9, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->getInitReader(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/reflect/Type;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/FieldInfo;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    iget-wide v5, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 236
    .line 237
    move v10, v7

    .line 238
    iget-object v7, v2, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 239
    .line 240
    move/from16 v17, v10

    .line 241
    .line 242
    move-object v10, v3

    .line 243
    move-object/from16 v0, p0

    .line 244
    .line 245
    move-object/from16 v21, v15

    .line 246
    .line 247
    move/from16 v20, v17

    .line 248
    .line 249
    move-object v15, v2

    .line 250
    move-object/from16 v2, p2

    .line 251
    .line 252
    invoke-virtual/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderParam(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    invoke-interface {v13, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    iget-object v0, v15, Lcom/alibaba/fastjson2/codec/FieldInfo;->alternateNames:[Ljava/lang/String;

    .line 260
    .line 261
    if-eqz v0, :cond_d

    .line 262
    .line 263
    move/from16 v1, v20

    .line 264
    .line 265
    :goto_a
    array-length v2, v0

    .line 266
    if-ge v1, v2, :cond_d

    .line 267
    .line 268
    aget-object v2, v0, v1

    .line 269
    .line 270
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    if-eqz v5, :cond_c

    .line 275
    .line 276
    :cond_b
    move-object/from16 v17, v0

    .line 277
    .line 278
    move/from16 v18, v1

    .line 279
    .line 280
    move-object v2, v11

    .line 281
    move-object/from16 v11, p0

    .line 282
    .line 283
    goto :goto_b

    .line 284
    :cond_c
    invoke-virtual {v13, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    check-cast v5, Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 289
    .line 290
    if-nez v5, :cond_b

    .line 291
    .line 292
    iget-wide v5, v15, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 293
    .line 294
    iget-object v7, v15, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 295
    .line 296
    const/4 v12, 0x0

    .line 297
    move-object/from16 v17, v0

    .line 298
    .line 299
    move/from16 v18, v1

    .line 300
    .line 301
    move-object v10, v3

    .line 302
    move-object/from16 v0, p0

    .line 303
    .line 304
    move-object/from16 v1, p1

    .line 305
    .line 306
    move-object v3, v2

    .line 307
    move-object/from16 v2, p2

    .line 308
    .line 309
    invoke-virtual/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaderParam(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReader;)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 310
    .line 311
    .line 312
    move-result-object v5

    .line 313
    move-object v2, v11

    .line 314
    move-object v11, v0

    .line 315
    move-object v0, v3

    .line 316
    move-object v3, v10

    .line 317
    invoke-interface {v13, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    :goto_b
    add-int/lit8 v1, v18, 0x1

    .line 321
    .line 322
    move-object v11, v2

    .line 323
    move-object/from16 v0, v17

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_d
    move-object v2, v11

    .line 327
    move-object/from16 v11, p0

    .line 328
    .line 329
    add-int/lit8 v4, v4, 0x1

    .line 330
    .line 331
    move-object/from16 v6, p4

    .line 332
    .line 333
    move-object v11, v2

    .line 334
    move-object v1, v15

    .line 335
    move-object/from16 v5, v19

    .line 336
    .line 337
    move/from16 v7, v20

    .line 338
    .line 339
    move-object/from16 v15, v21

    .line 340
    .line 341
    goto/16 :goto_2

    .line 342
    .line 343
    :cond_e
    move-object/from16 v21, v15

    .line 344
    .line 345
    move-object v15, v1

    .line 346
    goto/16 :goto_4

    .line 347
    .line 348
    :goto_c
    array-length v0, v14

    .line 349
    if-ne v0, v10, :cond_13

    .line 350
    .line 351
    iget-wide v0, v15, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 352
    .line 353
    and-long v0, v0, v17

    .line 354
    .line 355
    cmp-long v0, v0, v8

    .line 356
    .line 357
    if-eqz v0, :cond_13

    .line 358
    .line 359
    move-object/from16 v6, p4

    .line 360
    .line 361
    iget-object v0, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 362
    .line 363
    if-nez v0, :cond_f

    .line 364
    .line 365
    iget-object v0, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    aget-object v0, v0, v20

    .line 372
    .line 373
    :goto_d
    move-object v2, v0

    .line 374
    goto :goto_e

    .line 375
    :cond_f
    aget-object v0, v16, v20

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :goto_e
    iget-object v0, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 379
    .line 380
    if-nez v0, :cond_10

    .line 381
    .line 382
    iget-object v0, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    aget-object v0, v0, v20

    .line 389
    .line 390
    :goto_f
    move-object v3, v0

    .line 391
    goto :goto_10

    .line 392
    :cond_10
    invoke-virtual {v0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    aget-object v0, v0, v20

    .line 397
    .line 398
    goto :goto_f

    .line 399
    :goto_10
    iget-object v0, v15, Lcom/alibaba/fastjson2/codec/FieldInfo;->defaultValue:Ljava/lang/String;

    .line 400
    .line 401
    if-eqz v0, :cond_11

    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    if-eq v1, v3, :cond_11

    .line 408
    .line 409
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->getDefaultObjectReaderProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    invoke-virtual {v1, v4, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    if-eqz v1, :cond_12

    .line 422
    .line 423
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    :cond_11
    move-object v7, v0

    .line 428
    goto :goto_11

    .line 429
    :cond_12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 430
    .line 431
    const-string v2, "illegal defaultValue : "

    .line 432
    .line 433
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    const-string v0, ", class "

    .line 440
    .line 441
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    invoke-static {v1, v0, v2}, Lah/a;->s(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    const/4 v0, 0x0

    .line 449
    return-object v0

    .line 450
    :goto_11
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;

    .line 451
    .line 452
    iget-wide v4, v15, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 453
    .line 454
    iget-object v1, v15, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 455
    .line 456
    iget-object v8, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 457
    .line 458
    iget-object v9, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 459
    .line 460
    const/4 v10, 0x0

    .line 461
    move-object v6, v1

    .line 462
    move-object/from16 v1, p1

    .line 463
    .line 464
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplValue;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;JLjava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    .line 465
    .line 466
    .line 467
    return-object v0

    .line 468
    :cond_13
    move-object/from16 v6, p4

    .line 469
    .line 470
    iget-object v0, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->creatorConstructor:Ljava/lang/reflect/Constructor;

    .line 471
    .line 472
    if-eqz v0, :cond_14

    .line 473
    .line 474
    iget-object v1, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->markerConstructor:Ljava/lang/reflect/Constructor;

    .line 475
    .line 476
    move-object/from16 v7, v21

    .line 477
    .line 478
    invoke-virtual {v11, v0, v1, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFunction(Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;[Ljava/lang/String;)Ljava/util/function/Function;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    :goto_12
    move-object v8, v0

    .line 483
    goto :goto_13

    .line 484
    :cond_14
    move-object/from16 v7, v21

    .line 485
    .line 486
    iget-object v0, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->createMethod:Ljava/lang/reflect/Method;

    .line 487
    .line 488
    invoke-virtual {v11, v0, v7}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFactoryFunction(Ljava/lang/reflect/Method;[Ljava/lang/String;)Ljava/util/function/Function;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    goto :goto_12

    .line 493
    :goto_13
    invoke-interface {v13}, Ljava/util/Map;->size()I

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    new-array v9, v0, [Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 498
    .line 499
    invoke-virtual {v13}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-interface {v0, v9}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    invoke-static {v9}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    const/4 v3, 0x0

    .line 510
    const/4 v4, 0x0

    .line 511
    move-object/from16 v1, p1

    .line 512
    .line 513
    move-object/from16 v2, p2

    .line 514
    .line 515
    move-object/from16 v5, p3

    .line 516
    .line 517
    move-object v0, v11

    .line 518
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->createFieldReaders(Ljava/lang/Class;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/codec/BeanInfo;ZLcom/alibaba/fastjson2/reader/ObjectReaderProvider;)[Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-static {v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    const/4 v0, 0x0

    .line 526
    move/from16 v1, v20

    .line 527
    .line 528
    move v3, v1

    .line 529
    :goto_14
    array-length v4, v2

    .line 530
    if-ge v1, v4, :cond_17

    .line 531
    .line 532
    aget-object v4, v2, v1

    .line 533
    .line 534
    iget-object v4, v4, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 535
    .line 536
    invoke-interface {v13, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v4

    .line 540
    if-eqz v4, :cond_16

    .line 541
    .line 542
    if-nez v0, :cond_15

    .line 543
    .line 544
    array-length v0, v2

    .line 545
    new-array v0, v0, [Z

    .line 546
    .line 547
    :cond_15
    aput-boolean v10, v0, v1

    .line 548
    .line 549
    add-int/lit8 v3, v3, 0x1

    .line 550
    .line 551
    :cond_16
    add-int/lit8 v1, v1, 0x1

    .line 552
    .line 553
    goto :goto_14

    .line 554
    :cond_17
    if-lez v3, :cond_1a

    .line 555
    .line 556
    array-length v1, v2

    .line 557
    sub-int/2addr v1, v3

    .line 558
    new-array v1, v1, [Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 559
    .line 560
    move/from16 v3, v20

    .line 561
    .line 562
    :goto_15
    array-length v4, v2

    .line 563
    if-ge v3, v4, :cond_19

    .line 564
    .line 565
    aget-boolean v4, v0, v3

    .line 566
    .line 567
    if-nez v4, :cond_18

    .line 568
    .line 569
    add-int/lit8 v4, v20, 0x1

    .line 570
    .line 571
    aget-object v5, v2, v3

    .line 572
    .line 573
    aput-object v5, v1, v20

    .line 574
    .line 575
    move/from16 v20, v4

    .line 576
    .line 577
    :cond_18
    add-int/lit8 v3, v3, 0x1

    .line 578
    .line 579
    goto :goto_15

    .line 580
    :cond_19
    move-object v2, v1

    .line 581
    :cond_1a
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;

    .line 582
    .line 583
    move-object v1, v8

    .line 584
    move-object v8, v9

    .line 585
    move-object v9, v2

    .line 586
    iget-object v2, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 587
    .line 588
    iget-object v3, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 589
    .line 590
    iget-wide v4, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->readerFeatures:J

    .line 591
    .line 592
    iget-object v10, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 593
    .line 594
    iget-object v11, v6, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlsoNames:[Ljava/lang/String;

    .line 595
    .line 596
    move-object v6, v1

    .line 597
    move-object/from16 v1, p1

    .line 598
    .line 599
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/ObjectReaderNoneDefaultConstructor;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;[Ljava/lang/String;[Lcom/alibaba/fastjson2/reader/FieldReader;[Lcom/alibaba/fastjson2/reader/FieldReader;[Ljava/lang/Class;[Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    return-object v0
.end method

.method public createSupplier(Ljava/lang/Class;)Ljava/util/function/Supplier;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/function/Supplier<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    new-instance p1, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;

    .line 28
    .line 29
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/reader/ConstructorSupplier;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v1, "get constructor error, class "

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    return-object p1

    .line 49
    :catch_0
    :cond_1
    :goto_0
    return-object v1
.end method
