.class public Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;

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

.method public static synthetic a(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/TreeMap;Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->lambda$createObjectWriter$0(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/Map;Ljava/lang/reflect/Field;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;JLcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/util/TreeMap;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->lambda$createObjectWriter$2(Lcom/alibaba/fastjson2/codec/FieldInfo;JLcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/TreeMap;Ljava/lang/reflect/Field;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p8}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->lambda$createObjectWriter$1(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/Map;Ljava/lang/reflect/Field;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static configSerializeFilters(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/codec/BeanInfo;->serializeFilters:[Ljava/lang/Class;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    const-class v3, Lcom/alibaba/fastjson2/filter/Filter;

    .line 10
    .line 11
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Lcom/alibaba/fastjson2/filter/Filter;

    .line 23
    .line 24
    invoke-interface {p1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->setFilter(Lcom/alibaba/fastjson2/filter/Filter;)V
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    .line 27
    :catch_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public static getFieldName(Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p2, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    :goto_0
    iget-boolean p2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->kotlin:Z

    .line 16
    .line 17
    iget-object p1, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->namingStrategy:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p3, p2, p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/reflect/Method;ZLjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    const/4 p3, 0x0

    .line 28
    if-lez p2, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move v0, p3

    .line 36
    :goto_1
    const/16 v1, 0x7a

    .line 37
    .line 38
    const/16 v2, 0x61

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    if-ne p2, v3, :cond_3

    .line 42
    .line 43
    if-lt v0, v2, :cond_3

    .line 44
    .line 45
    if-le v0, v1, :cond_4

    .line 46
    .line 47
    :cond_3
    if-le p2, v3, :cond_8

    .line 48
    .line 49
    const/16 p2, 0x41

    .line 50
    .line 51
    if-lt v0, p2, :cond_8

    .line 52
    .line 53
    const/16 v4, 0x5a

    .line 54
    .line 55
    if-gt v0, v4, :cond_8

    .line 56
    .line 57
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-lt v3, p2, :cond_8

    .line 62
    .line 63
    if-gt v3, v4, :cond_8

    .line 64
    .line 65
    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-lt v0, v2, :cond_5

    .line 70
    .line 71
    if-gt v0, v1, :cond_5

    .line 72
    .line 73
    aget-char v0, p2, p3

    .line 74
    .line 75
    add-int/lit8 v0, v0, -0x20

    .line 76
    .line 77
    int-to-char v0, v0

    .line 78
    aput-char v0, p2, p3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    aget-char v0, p2, p3

    .line 82
    .line 83
    add-int/lit8 v0, v0, 0x20

    .line 84
    .line 85
    int-to-char v0, v0

    .line 86
    aput-char v0, p2, p3

    .line 87
    .line 88
    :goto_2
    new-instance p3, Ljava/lang/String;

    .line 89
    .line 90
    invoke-direct {p3, p2}, Ljava/lang/String;-><init>([C)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, p3}, Lcom/alibaba/fastjson2/util/BeanUtils;->getDeclaredField(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-eqz p0, :cond_8

    .line 98
    .line 99
    const/4 v0, 0x2

    .line 100
    :goto_3
    array-length v3, p2

    .line 101
    if-ge v0, v3, :cond_7

    .line 102
    .line 103
    aget-char v3, p2, v0

    .line 104
    .line 105
    if-lt v3, v2, :cond_6

    .line 106
    .line 107
    if-gt v3, v1, :cond_6

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-static {p0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_8

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    :goto_4
    return-object p3

    .line 124
    :cond_8
    return-object p1
.end method

.method private synthetic lambda$createObjectWriter$0(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/Map;Ljava/lang/reflect/Field;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v6, p1

    .line 6
    move-object v1, p2

    .line 7
    move-wide v2, p3

    .line 8
    move-object v4, p5

    .line 9
    move-object v5, p6

    .line 10
    move-object/from16 v7, p8

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    instance-of p1, p2, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    move-object p1, p2

    .line 27
    check-cast p1, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 28
    .line 29
    const/4 p3, 0x1

    .line 30
    iput-boolean p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->writeUsing:Z

    .line 31
    .line 32
    :cond_0
    iget-object p1, p2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {p7, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method private synthetic lambda$createObjectWriter$1(Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/Map;Ljava/lang/reflect/Field;)V
    .locals 10

    .line 1
    move-object/from16 v8, p7

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p8 .. p8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v9, 0x1

    .line 11
    and-int/2addr v0, v9

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    move v0, v9

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iput-boolean v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 18
    .line 19
    move-object v0, p0

    .line 20
    move-object v6, p1

    .line 21
    move-object v1, p2

    .line 22
    move-wide v2, p3

    .line 23
    move-object v4, p5

    .line 24
    move-object/from16 v5, p6

    .line 25
    .line 26
    move-object/from16 v7, p8

    .line 27
    .line 28
    invoke-virtual/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    iget-object v0, p1, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    instance-of v0, v1, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    move-object v0, v1

    .line 43
    check-cast v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 44
    .line 45
    iput-boolean v9, v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->writeUsing:Z

    .line 46
    .line 47
    :cond_1
    iget-object v0, v1, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v8, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    iget-object v2, v1, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v8, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_2
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->compareTo(Ljava/lang/Object;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-lez v0, :cond_3

    .line 69
    .line 70
    iget-object v0, v1, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 71
    .line 72
    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_3
    return-void
.end method

.method private synthetic lambda$createObjectWriter$2(Lcom/alibaba/fastjson2/codec/FieldInfo;JLcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/reflect/Method;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    move-object/from16 v3, p6

    .line 6
    .line 7
    move-object/from16 v13, p7

    .line 8
    .line 9
    move-object/from16 v10, p8

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/codec/FieldInfo;->init()V

    .line 12
    .line 13
    .line 14
    move-wide/from16 v4, p2

    .line 15
    .line 16
    iput-wide v4, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 17
    .line 18
    iget-object v2, v1, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v2, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 21
    .line 22
    move-object/from16 v2, p5

    .line 23
    .line 24
    invoke-virtual {v2, v1, v0, v3, v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 25
    .line 26
    .line 27
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_0
    invoke-static {v3, v1, v0, v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->getFieldName(Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v5, v1, Lcom/alibaba/fastjson2/codec/BeanInfo;->includes:[Ljava/lang/String;

    .line 38
    .line 39
    const/4 v14, 0x0

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    array-length v6, v5

    .line 43
    if-lez v6, :cond_2

    .line 44
    .line 45
    move v6, v14

    .line 46
    :goto_0
    array-length v7, v5

    .line 47
    if-ge v6, v7, :cond_f

    .line 48
    .line 49
    aget-object v7, v5, v6

    .line 50
    .line 51
    invoke-virtual {v7, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    :goto_1
    iget-wide v5, v1, Lcom/alibaba/fastjson2/codec/BeanInfo;->writerFeatures:J

    .line 62
    .line 63
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 64
    .line 65
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 66
    .line 67
    and-long/2addr v5, v7

    .line 68
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    cmp-long v5, v5, v7

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    iget-object v5, v1, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_3

    .line 81
    .line 82
    goto/16 :goto_6

    .line 83
    .line 84
    :cond_3
    iget-object v5, v1, Lcom/alibaba/fastjson2/codec/BeanInfo;->orders:[Ljava/lang/String;

    .line 85
    .line 86
    const/4 v15, 0x1

    .line 87
    if-eqz v5, :cond_6

    .line 88
    .line 89
    move v5, v14

    .line 90
    move v6, v5

    .line 91
    :goto_2
    iget-object v7, v1, Lcom/alibaba/fastjson2/codec/BeanInfo;->orders:[Ljava/lang/String;

    .line 92
    .line 93
    array-length v8, v7

    .line 94
    if-ge v5, v8, :cond_5

    .line 95
    .line 96
    aget-object v7, v7, v5

    .line 97
    .line 98
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_4

    .line 103
    .line 104
    iput v5, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 105
    .line 106
    move v6, v15

    .line 107
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    if-nez v6, :cond_6

    .line 111
    .line 112
    iget v1, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 113
    .line 114
    if-nez v1, :cond_6

    .line 115
    .line 116
    array-length v1, v7

    .line 117
    iput v1, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 118
    .line 119
    :cond_6
    iget-object v1, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 120
    .line 121
    const/4 v5, 0x0

    .line 122
    if-eqz v1, :cond_7

    .line 123
    .line 124
    :try_start_0
    invoke-virtual {v1, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v1, v15}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Lcom/alibaba/fastjson2/writer/ObjectWriter;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :catch_0
    move-exception v0

    .line 139
    goto :goto_3

    .line 140
    :catch_1
    move-exception v0

    .line 141
    goto :goto_3

    .line 142
    :catch_2
    move-exception v0

    .line 143
    goto :goto_3

    .line 144
    :catch_3
    move-exception v0

    .line 145
    :goto_3
    const-string v1, "create writeUsing Writer error"

    .line 146
    .line 147
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_7
    move-object v1, v5

    .line 152
    :goto_4
    if-nez v1, :cond_8

    .line 153
    .line 154
    iget-boolean v6, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldClassMixIn:Z

    .line 155
    .line 156
    if-eqz v6, :cond_8

    .line 157
    .line 158
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;

    .line 159
    .line 160
    :cond_8
    move-object v11, v1

    .line 161
    move-object v1, v5

    .line 162
    iget v5, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 163
    .line 164
    iget-wide v6, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 165
    .line 166
    iget-object v8, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v9, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->label:Ljava/lang/String;

    .line 169
    .line 170
    iget-object v12, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->contentAs:Ljava/lang/Class;

    .line 171
    .line 172
    move-object/from16 v16, v1

    .line 173
    .line 174
    move-object/from16 v1, p0

    .line 175
    .line 176
    invoke-virtual/range {v1 .. v12}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    iget-object v0, v0, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    .line 181
    .line 182
    if-eqz v0, :cond_9

    .line 183
    .line 184
    instance-of v0, v2, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 185
    .line 186
    if-eqz v0, :cond_9

    .line 187
    .line 188
    move-object v0, v2

    .line 189
    check-cast v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 190
    .line 191
    iput-boolean v15, v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->writeUsing:Z

    .line 192
    .line 193
    :cond_9
    iget-object v0, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 194
    .line 195
    invoke-interface {v13, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 200
    .line 201
    if-nez v0, :cond_a

    .line 202
    .line 203
    iget-object v1, v2, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 204
    .line 205
    invoke-interface {v13, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    :cond_a
    if-eqz v0, :cond_b

    .line 209
    .line 210
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->compareTo(Ljava/lang/Object;)I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-lez v1, :cond_b

    .line 215
    .line 216
    invoke-interface {v13, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    :cond_b
    if-nez v0, :cond_f

    .line 220
    .line 221
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    const/16 v1, 0x41

    .line 226
    .line 227
    if-lt v0, v1, :cond_c

    .line 228
    .line 229
    const/16 v1, 0x5a

    .line 230
    .line 231
    if-gt v0, v1, :cond_c

    .line 232
    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    add-int/lit8 v0, v0, 0x20

    .line 239
    .line 240
    int-to-char v0, v0

    .line 241
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v4, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    goto :goto_5

    .line 256
    :cond_c
    const/16 v1, 0x61

    .line 257
    .line 258
    if-lt v0, v1, :cond_d

    .line 259
    .line 260
    const/16 v1, 0x7a

    .line 261
    .line 262
    if-gt v0, v1, :cond_d

    .line 263
    .line 264
    new-instance v1, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 267
    .line 268
    .line 269
    add-int/lit8 v0, v0, -0x20

    .line 270
    .line 271
    int-to-char v0, v0

    .line 272
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    goto :goto_5

    .line 287
    :cond_d
    move-object/from16 v5, v16

    .line 288
    .line 289
    :goto_5
    if-eqz v5, :cond_f

    .line 290
    .line 291
    invoke-interface {v13, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    check-cast v0, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 296
    .line 297
    if-eqz v0, :cond_f

    .line 298
    .line 299
    iget-object v0, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 300
    .line 301
    if-eqz v0, :cond_e

    .line 302
    .line 303
    invoke-virtual {v0, v10}, Ljava/lang/reflect/Method;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    if-eqz v0, :cond_f

    .line 308
    .line 309
    :cond_e
    invoke-interface {v13, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    :cond_f
    :goto_6
    return-void
.end method


# virtual methods
.method public createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            ")",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    const/4 v11, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p4

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    .line 761
    invoke-virtual/range {v0 .. v11}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual/range {p9 .. p9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v9

    .line 7
    invoke-virtual/range {p9 .. p9}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    const-class v1, Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-ne v9, v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-virtual/range {p9 .. p9}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "java.util.HashMap$Node"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual/range {p9 .. p9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, "getValue"

    .line 37
    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    const-string v4, "getKey"

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-object/from16 v3, p9

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_0
    :goto_0
    const-class v4, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-virtual {v4, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 59
    .line 60
    .line 61
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move-object/from16 v3, p9

    .line 64
    .line 65
    :goto_1
    const/4 v4, 0x1

    .line 66
    :try_start_1
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 67
    .line 68
    .line 69
    :catch_1
    :goto_2
    move-object v8, v3

    .line 70
    const-class v3, Ljava/util/Date;

    .line 71
    .line 72
    if-nez p10, :cond_3

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    if-eqz p7, :cond_2

    .line 77
    .line 78
    invoke-virtual/range {p7 .. p7}, Ljava/lang/String;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    if-eq v9, v3, :cond_3

    .line 85
    .line 86
    :cond_2
    move-object/from16 v13, p0

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_3
    move-object/from16 v13, p0

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :goto_3
    invoke-virtual {v13, v0, v9}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->getInitWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    move-object v11, v4

    .line 97
    goto :goto_5

    .line 98
    :goto_4
    move-object/from16 v11, p10

    .line 99
    .line 100
    :goto_5
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 101
    .line 102
    and-long v4, p5, v4

    .line 103
    .line 104
    const-wide/16 v14, 0x0

    .line 105
    .line 106
    cmp-long v4, v4, v14

    .line 107
    .line 108
    if-eqz v4, :cond_4

    .line 109
    .line 110
    move-object v10, v2

    .line 111
    goto :goto_6

    .line 112
    :cond_4
    move-object/from16 v4, p2

    .line 113
    .line 114
    invoke-static {v4, v8}, Lcom/alibaba/fastjson2/util/BeanUtils;->getField(Ljava/lang/Class;Ljava/lang/reflect/Method;)Ljava/lang/reflect/Field;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    move-object v10, v4

    .line 119
    :goto_6
    if-eqz v11, :cond_6

    .line 120
    .line 121
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectMethod;

    .line 122
    .line 123
    move-object v1, v10

    .line 124
    move-object v10, v8

    .line 125
    move-object v8, v9

    .line 126
    move-object v9, v1

    .line 127
    move-object/from16 v1, p3

    .line 128
    .line 129
    move/from16 v2, p4

    .line 130
    .line 131
    move-wide/from16 v3, p5

    .line 132
    .line 133
    move-object/from16 v5, p7

    .line 134
    .line 135
    move-object/from16 v6, p8

    .line 136
    .line 137
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 138
    .line 139
    .line 140
    move-object v9, v8

    .line 141
    iput-object v9, v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClass:Ljava/lang/Class;

    .line 142
    .line 143
    sget-object v1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;

    .line 144
    .line 145
    if-eq v11, v1, :cond_5

    .line 146
    .line 147
    iput-object v11, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 148
    .line 149
    :cond_5
    return-object v0

    .line 150
    :cond_6
    const/4 v4, 0x0

    .line 151
    if-nez p3, :cond_7

    .line 152
    .line 153
    invoke-static {v8, v4, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getterName(Ljava/lang/reflect/Method;ZLjava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    goto :goto_7

    .line 158
    :cond_7
    move-object/from16 v5, p3

    .line 159
    .line 160
    :goto_7
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 161
    .line 162
    if-eq v9, v6, :cond_8

    .line 163
    .line 164
    const-class v6, Ljava/lang/Boolean;

    .line 165
    .line 166
    if-ne v9, v6, :cond_9

    .line 167
    .line 168
    :cond_8
    move-object v1, v5

    .line 169
    goto/16 :goto_13

    .line 170
    .line 171
    :cond_9
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 172
    .line 173
    if-eq v9, v6, :cond_a

    .line 174
    .line 175
    const-class v6, Ljava/lang/Integer;

    .line 176
    .line 177
    if-ne v9, v6, :cond_b

    .line 178
    .line 179
    :cond_a
    move-object v1, v5

    .line 180
    goto/16 :goto_12

    .line 181
    .line 182
    :cond_b
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 183
    .line 184
    if-eq v9, v6, :cond_c

    .line 185
    .line 186
    const-class v6, Ljava/lang/Float;

    .line 187
    .line 188
    if-ne v9, v6, :cond_d

    .line 189
    .line 190
    :cond_c
    move-object v1, v5

    .line 191
    goto/16 :goto_11

    .line 192
    .line 193
    :cond_d
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 194
    .line 195
    if-eq v9, v6, :cond_e

    .line 196
    .line 197
    const-class v6, Ljava/lang/Double;

    .line 198
    .line 199
    if-ne v9, v6, :cond_f

    .line 200
    .line 201
    :cond_e
    move-object v1, v5

    .line 202
    goto/16 :goto_10

    .line 203
    .line 204
    :cond_f
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 205
    .line 206
    if-eq v9, v6, :cond_10

    .line 207
    .line 208
    const-class v6, Ljava/lang/Long;

    .line 209
    .line 210
    if-ne v9, v6, :cond_11

    .line 211
    .line 212
    :cond_10
    move-object v1, v5

    .line 213
    move-object/from16 v5, p7

    .line 214
    .line 215
    goto/16 :goto_e

    .line 216
    .line 217
    :cond_11
    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 218
    .line 219
    if-eq v9, v6, :cond_12

    .line 220
    .line 221
    const-class v6, Ljava/lang/Short;

    .line 222
    .line 223
    if-ne v9, v6, :cond_13

    .line 224
    .line 225
    :cond_12
    move-object v1, v5

    .line 226
    goto/16 :goto_d

    .line 227
    .line 228
    :cond_13
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 229
    .line 230
    if-eq v9, v6, :cond_14

    .line 231
    .line 232
    const-class v6, Ljava/lang/Byte;

    .line 233
    .line 234
    if-ne v9, v6, :cond_15

    .line 235
    .line 236
    :cond_14
    move-object v1, v5

    .line 237
    goto/16 :goto_c

    .line 238
    .line 239
    :cond_15
    sget-object v6, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 240
    .line 241
    if-eq v9, v6, :cond_16

    .line 242
    .line 243
    const-class v6, Ljava/lang/Character;

    .line 244
    .line 245
    if-ne v9, v6, :cond_17

    .line 246
    .line 247
    :cond_16
    move-object v1, v5

    .line 248
    goto/16 :goto_b

    .line 249
    .line 250
    :cond_17
    const-class v6, Ljava/math/BigDecimal;

    .line 251
    .line 252
    if-ne v9, v6, :cond_18

    .line 253
    .line 254
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterBigDecimalMethod;

    .line 255
    .line 256
    move/from16 v2, p4

    .line 257
    .line 258
    move-wide/from16 v3, p5

    .line 259
    .line 260
    move-object/from16 v6, p8

    .line 261
    .line 262
    move-object v1, v5

    .line 263
    move-object v7, v10

    .line 264
    move-object/from16 v5, p7

    .line 265
    .line 266
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterBigDecimalMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 267
    .line 268
    .line 269
    return-object v0

    .line 270
    :cond_18
    move-object/from16 v16, v5

    .line 271
    .line 272
    move-object v5, v1

    .line 273
    move-object/from16 v1, v16

    .line 274
    .line 275
    invoke-virtual {v9}, Ljava/lang/Class;->isEnum()Z

    .line 276
    .line 277
    .line 278
    move-result v6

    .line 279
    if-eqz v6, :cond_19

    .line 280
    .line 281
    invoke-static {v9, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumValueField(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/reflect/Member;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-nez v0, :cond_19

    .line 286
    .line 287
    invoke-static {v9}, Lcom/alibaba/fastjson2/util/BeanUtils;->isWriteEnumAsJavaBean(Ljava/lang/Class;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-nez v0, :cond_19

    .line 292
    .line 293
    invoke-static {v9}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumAnnotationNames(Ljava/lang/Class;)[Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    if-nez v0, :cond_19

    .line 298
    .line 299
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterEnumMethod;

    .line 300
    .line 301
    move/from16 v2, p4

    .line 302
    .line 303
    move-wide/from16 v3, p5

    .line 304
    .line 305
    move-object/from16 v5, p7

    .line 306
    .line 307
    move-object/from16 v6, p8

    .line 308
    .line 309
    move-object v7, v9

    .line 310
    move-object v9, v8

    .line 311
    move-object v8, v10

    .line 312
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterEnumMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 313
    .line 314
    .line 315
    return-object v0

    .line 316
    :cond_19
    if-ne v9, v3, :cond_1c

    .line 317
    .line 318
    if-eqz p7, :cond_1b

    .line 319
    .line 320
    invoke-virtual/range {p7 .. p7}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_1a

    .line 329
    .line 330
    move-object v5, v2

    .line 331
    goto :goto_8

    .line 332
    :cond_1a
    move-object v5, v0

    .line 333
    goto :goto_8

    .line 334
    :cond_1b
    move-object/from16 v5, p7

    .line 335
    .line 336
    :goto_8
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterDateMethod;

    .line 337
    .line 338
    move/from16 v2, p4

    .line 339
    .line 340
    move-wide/from16 v3, p5

    .line 341
    .line 342
    move-object/from16 v6, p8

    .line 343
    .line 344
    move-object v7, v9

    .line 345
    move-object v9, v8

    .line 346
    move-object v8, v10

    .line 347
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterDateMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 348
    .line 349
    .line 350
    return-object v0

    .line 351
    :cond_1c
    const-class v0, Ljava/lang/String;

    .line 352
    .line 353
    if-ne v9, v0, :cond_1d

    .line 354
    .line 355
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterStringMethod;

    .line 356
    .line 357
    move/from16 v2, p4

    .line 358
    .line 359
    move-wide/from16 v5, p5

    .line 360
    .line 361
    move-object/from16 v3, p7

    .line 362
    .line 363
    move-object/from16 v4, p8

    .line 364
    .line 365
    move-object v7, v10

    .line 366
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterStringMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :cond_1d
    const-class v0, Ljava/util/List;

    .line 371
    .line 372
    if-eq v9, v0, :cond_23

    .line 373
    .line 374
    const-class v0, Ljava/util/ArrayList;

    .line 375
    .line 376
    if-eq v9, v0, :cond_23

    .line 377
    .line 378
    const-class v0, Ljava/lang/Iterable;

    .line 379
    .line 380
    if-ne v9, v0, :cond_1e

    .line 381
    .line 382
    goto/16 :goto_9

    .line 383
    .line 384
    :cond_1e
    const-class v0, Ljava/util/Map;

    .line 385
    .line 386
    invoke-virtual {v0, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_1f

    .line 391
    .line 392
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterMapMethod;

    .line 393
    .line 394
    move-object v2, v10

    .line 395
    move-object v10, v8

    .line 396
    move-object v8, v9

    .line 397
    move-object v9, v2

    .line 398
    move/from16 v2, p4

    .line 399
    .line 400
    move-wide/from16 v3, p5

    .line 401
    .line 402
    move-object/from16 v5, p7

    .line 403
    .line 404
    move-object/from16 v6, p8

    .line 405
    .line 406
    move-object/from16 v11, p11

    .line 407
    .line 408
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/writer/FieldWriterMapMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 409
    .line 410
    .line 411
    return-object v0

    .line 412
    :cond_1f
    const-class v0, [Ljava/lang/Float;

    .line 413
    .line 414
    if-ne v9, v0, :cond_20

    .line 415
    .line 416
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;

    .line 417
    .line 418
    const-class v2, Ljava/lang/Float;

    .line 419
    .line 420
    move/from16 v3, p4

    .line 421
    .line 422
    move-wide/from16 v4, p5

    .line 423
    .line 424
    move-object/from16 v6, p7

    .line 425
    .line 426
    move-object v11, v8

    .line 427
    move-object v8, v7

    .line 428
    move-object/from16 v7, p8

    .line 429
    .line 430
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 431
    .line 432
    .line 433
    return-object v0

    .line 434
    :cond_20
    const-class v0, [Ljava/lang/Double;

    .line 435
    .line 436
    if-ne v9, v0, :cond_21

    .line 437
    .line 438
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;

    .line 439
    .line 440
    const-class v2, Ljava/lang/Double;

    .line 441
    .line 442
    move/from16 v3, p4

    .line 443
    .line 444
    move-wide/from16 v4, p5

    .line 445
    .line 446
    move-object/from16 v6, p7

    .line 447
    .line 448
    move-object v11, v8

    .line 449
    move-object v8, v7

    .line 450
    move-object/from16 v7, p8

    .line 451
    .line 452
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 453
    .line 454
    .line 455
    return-object v0

    .line 456
    :cond_21
    const-class v0, [Ljava/math/BigDecimal;

    .line 457
    .line 458
    if-ne v9, v0, :cond_22

    .line 459
    .line 460
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;

    .line 461
    .line 462
    const-class v2, Ljava/math/BigDecimal;

    .line 463
    .line 464
    move/from16 v3, p4

    .line 465
    .line 466
    move-wide/from16 v4, p5

    .line 467
    .line 468
    move-object/from16 v6, p7

    .line 469
    .line 470
    move-object v11, v8

    .line 471
    move-object v8, v7

    .line 472
    move-object/from16 v7, p8

    .line 473
    .line 474
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 475
    .line 476
    .line 477
    return-object v0

    .line 478
    :cond_22
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectMethod;

    .line 479
    .line 480
    move-object v2, v10

    .line 481
    move-object v10, v8

    .line 482
    move-object v8, v9

    .line 483
    move-object v9, v2

    .line 484
    move/from16 v2, p4

    .line 485
    .line 486
    move-wide/from16 v3, p5

    .line 487
    .line 488
    move-object/from16 v5, p7

    .line 489
    .line 490
    move-object/from16 v6, p8

    .line 491
    .line 492
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 493
    .line 494
    .line 495
    return-object v0

    .line 496
    :cond_23
    :goto_9
    instance-of v0, v7, Ljava/lang/reflect/ParameterizedType;

    .line 497
    .line 498
    if-eqz v0, :cond_24

    .line 499
    .line 500
    move-object v0, v7

    .line 501
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    .line 502
    .line 503
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    aget-object v0, v0, v4

    .line 508
    .line 509
    move-object v2, v0

    .line 510
    goto :goto_a

    .line 511
    :cond_24
    move-object v2, v5

    .line 512
    :goto_a
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterListMethod;

    .line 513
    .line 514
    move/from16 v3, p4

    .line 515
    .line 516
    move-wide/from16 v4, p5

    .line 517
    .line 518
    move-object/from16 v6, p7

    .line 519
    .line 520
    move-object/from16 v12, p11

    .line 521
    .line 522
    move-object v11, v9

    .line 523
    move-object v9, v8

    .line 524
    move-object v8, v10

    .line 525
    move-object v10, v7

    .line 526
    move-object/from16 v7, p8

    .line 527
    .line 528
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/writer/FieldWriterListMethod;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 529
    .line 530
    .line 531
    return-object v0

    .line 532
    :goto_b
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterCharMethod;

    .line 533
    .line 534
    move/from16 v2, p4

    .line 535
    .line 536
    move-wide/from16 v3, p5

    .line 537
    .line 538
    move-object/from16 v5, p7

    .line 539
    .line 540
    move-object/from16 v6, p8

    .line 541
    .line 542
    move-object v7, v10

    .line 543
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterCharMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 544
    .line 545
    .line 546
    return-object v0

    .line 547
    :goto_c
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt8Method;

    .line 548
    .line 549
    move/from16 v2, p4

    .line 550
    .line 551
    move-wide/from16 v3, p5

    .line 552
    .line 553
    move-object/from16 v5, p7

    .line 554
    .line 555
    move-object/from16 v6, p8

    .line 556
    .line 557
    move-object v7, v10

    .line 558
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterInt8Method;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 559
    .line 560
    .line 561
    return-object v0

    .line 562
    :goto_d
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt16Method;

    .line 563
    .line 564
    move/from16 v2, p4

    .line 565
    .line 566
    move-wide/from16 v3, p5

    .line 567
    .line 568
    move-object/from16 v5, p7

    .line 569
    .line 570
    move-object/from16 v6, p8

    .line 571
    .line 572
    move-object v7, v10

    .line 573
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterInt16Method;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 574
    .line 575
    .line 576
    return-object v0

    .line 577
    :goto_e
    if-eqz v5, :cond_26

    .line 578
    .line 579
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    if-nez v0, :cond_26

    .line 584
    .line 585
    const-string v0, "string"

    .line 586
    .line 587
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    if-eqz v0, :cond_25

    .line 592
    .line 593
    goto :goto_f

    .line 594
    :cond_25
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterMillisMethod;

    .line 595
    .line 596
    move/from16 v2, p4

    .line 597
    .line 598
    move-wide/from16 v3, p5

    .line 599
    .line 600
    move-object/from16 v6, p8

    .line 601
    .line 602
    move-object v7, v9

    .line 603
    move-object v9, v8

    .line 604
    move-object v8, v10

    .line 605
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterMillisMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 606
    .line 607
    .line 608
    return-object v0

    .line 609
    :cond_26
    :goto_f
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt64Method;

    .line 610
    .line 611
    move/from16 v2, p4

    .line 612
    .line 613
    move-wide/from16 v3, p5

    .line 614
    .line 615
    move-object/from16 v5, p7

    .line 616
    .line 617
    move-object/from16 v6, p8

    .line 618
    .line 619
    move-object v7, v8

    .line 620
    move-object v8, v10

    .line 621
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterInt64Method;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;)V

    .line 622
    .line 623
    .line 624
    return-object v0

    .line 625
    :goto_10
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterDoubleMethod;

    .line 626
    .line 627
    move-object v11, v8

    .line 628
    move-object v8, v9

    .line 629
    move/from16 v2, p4

    .line 630
    .line 631
    move-wide/from16 v3, p5

    .line 632
    .line 633
    move-object/from16 v5, p7

    .line 634
    .line 635
    move-object/from16 v6, p8

    .line 636
    .line 637
    move-object v7, v9

    .line 638
    move-object v9, v10

    .line 639
    move-object v10, v11

    .line 640
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterDoubleMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 641
    .line 642
    .line 643
    return-object v0

    .line 644
    :goto_11
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterFloatMethod;

    .line 645
    .line 646
    move-object v11, v8

    .line 647
    move-object v8, v9

    .line 648
    move/from16 v2, p4

    .line 649
    .line 650
    move-wide/from16 v3, p5

    .line 651
    .line 652
    move-object/from16 v5, p7

    .line 653
    .line 654
    move-object/from16 v6, p8

    .line 655
    .line 656
    move-object v7, v9

    .line 657
    move-object v9, v10

    .line 658
    move-object v10, v11

    .line 659
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterFloatMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 660
    .line 661
    .line 662
    return-object v0

    .line 663
    :goto_12
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt32Method;

    .line 664
    .line 665
    move/from16 v2, p4

    .line 666
    .line 667
    move-wide/from16 v3, p5

    .line 668
    .line 669
    move-object/from16 v5, p7

    .line 670
    .line 671
    move-object/from16 v6, p8

    .line 672
    .line 673
    move-object v7, v10

    .line 674
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterInt32Method;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 675
    .line 676
    .line 677
    return-object v0

    .line 678
    :goto_13
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolMethod;

    .line 679
    .line 680
    move/from16 v2, p4

    .line 681
    .line 682
    move-wide/from16 v3, p5

    .line 683
    .line 684
    move-object/from16 v5, p7

    .line 685
    .line 686
    move-object/from16 v6, p8

    .line 687
    .line 688
    move-object v7, v10

    .line 689
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterBoolMethod;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    .line 690
    .line 691
    .line 692
    return-object v0
.end method

.method public createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class<",
            "TV;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/function/Function<",
            "TT;TV;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    const/4 v13, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-wide/from16 v5, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    .line 819
    invoke-virtual/range {v0 .. v13}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class<",
            "TV;>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/function/Function<",
            "TT;TV;>;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v8, p10

    .line 820
    const-class p2, Ljava/lang/Byte;

    if-ne v8, p2, :cond_0

    .line 821
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt8Func;

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p11

    move-object/from16 v8, p12

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterInt8Func;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v0

    .line 822
    :cond_0
    const-class p2, Ljava/lang/Short;

    if-ne v8, p2, :cond_1

    .line 823
    new-instance v1, Lcom/alibaba/fastjson2/writer/FieldWriterInt16Func;

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterInt16Func;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 824
    :cond_1
    const-class p2, Ljava/lang/Integer;

    if-ne v8, p2, :cond_2

    .line 825
    new-instance v1, Lcom/alibaba/fastjson2/writer/FieldWriterInt32Func;

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterInt32Func;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 826
    :cond_2
    const-class p2, Ljava/lang/Long;

    if-ne v8, p2, :cond_3

    .line 827
    new-instance v1, Lcom/alibaba/fastjson2/writer/FieldWriterInt64Func;

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterInt64Func;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 828
    :cond_3
    const-class p2, Ljava/math/BigInteger;

    if-ne v8, p2, :cond_4

    .line 829
    new-instance v1, Lcom/alibaba/fastjson2/writer/FieldWriterBigIntFunc;

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterBigIntFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 830
    :cond_4
    const-class p2, Ljava/math/BigDecimal;

    if-ne v8, p2, :cond_5

    .line 831
    new-instance v1, Lcom/alibaba/fastjson2/writer/FieldWriterBigDecimalFunc;

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterBigDecimalFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 832
    :cond_5
    const-class p2, Ljava/lang/String;

    if-ne v8, p2, :cond_6

    .line 833
    new-instance v1, Lcom/alibaba/fastjson2/writer/FieldWriterStringFunc;

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterStringFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 834
    :cond_6
    const-class v0, Ljava/util/Date;

    if-ne v8, v0, :cond_7

    .line 835
    new-instance v1, Lcom/alibaba/fastjson2/writer/FieldWriterDateFunc;

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterDateFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 836
    :cond_7
    const-class v0, Ljava/util/UUID;

    if-ne v8, v0, :cond_8

    .line 837
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterUUIDFunc;

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterUUIDFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v0

    .line 838
    :cond_8
    const-class v0, Ljava/util/Calendar;

    invoke-virtual {v0, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 839
    new-instance v1, Lcom/alibaba/fastjson2/writer/FieldWriterCalendarFunc;

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-wide/from16 v4, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    invoke-direct/range {v1 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterCalendarFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v1

    .line 840
    :cond_9
    invoke-virtual {v8}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_c

    .line 841
    new-instance v0, Lcom/alibaba/fastjson2/codec/BeanInfo;

    invoke-direct {v0}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    if-nez p1, :cond_a

    .line 842
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 843
    :cond_a
    invoke-virtual {p1, v0, v8}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 844
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/codec/BeanInfo;->writeEnumAsJavaBean:Z

    if-nez v0, :cond_b

    .line 845
    iget-object v2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    if-eqz v2, :cond_b

    .line 846
    instance-of v2, v2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;

    if-nez v2, :cond_b

    move v0, v1

    :cond_b
    if-nez v0, :cond_c

    .line 847
    invoke-static {v8, p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumValueField(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/reflect/Member;

    move-result-object p1

    if-nez p1, :cond_c

    .line 848
    invoke-static {v8}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumAnnotationNames(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_c

    .line 849
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterEnumFunc;

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterEnumFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v0

    :cond_c
    move-object/from16 v7, p9

    .line 850
    instance-of p1, v7, Ljava/lang/reflect/ParameterizedType;

    if-eqz p1, :cond_10

    .line 851
    move-object p1, v7

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 852
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 853
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p1

    .line 854
    const-class v2, Ljava/util/List;

    if-eq v0, v2, :cond_d

    const-class v2, Ljava/util/ArrayList;

    if-eq v0, v2, :cond_d

    const-class v2, Ljava/lang/Iterable;

    if-ne v0, v2, :cond_f

    .line 855
    :cond_d
    array-length v2, p1

    if-ne v2, v1, :cond_f

    const/4 v0, 0x0

    .line 856
    aget-object p1, p1, v0

    if-ne p1, p2, :cond_e

    .line 857
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterListStrFunc;

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v10, p10

    move-object/from16 v8, p12

    move-object v9, v7

    move-object/from16 v7, p11

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterListStrFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/reflect/Type;Ljava/lang/Class;)V

    return-object v0

    .line 858
    :cond_e
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterListFunc;

    move-object v7, p1

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v12, p13

    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/writer/FieldWriterListFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/Class;)V

    return-object v0

    .line 859
    :cond_f
    instance-of p1, v0, Ljava/lang/Class;

    if-eqz p1, :cond_10

    const-class p1, Ljava/util/Map;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_10

    .line 860
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterMapFunction;

    const/4 v9, 0x0

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/writer/FieldWriterMapFunction;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/util/function/Function;Ljava/lang/Class;)V

    return-object v0

    .line 861
    :cond_10
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Class;->getModifiers()I

    move-result p1

    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result p1

    if-eqz p1, :cond_11

    .line 862
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFuncFinal;

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFuncFinal;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v0

    .line 863
    :cond_11
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFunc;

    move-object/from16 v1, p3

    move/from16 v2, p4

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;)V

    return-object v0
.end method

.method public createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            ")",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    .line 696
    invoke-virtual/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            "Ljava/lang/Class<",
            "*>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    .line 697
    invoke-virtual/range {p8 .. p8}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    .line 698
    const-class v2, Ljava/lang/Throwable;

    if-ne v0, v2, :cond_0

    .line 699
    invoke-virtual/range {p8 .. p8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v3, "stackTrace"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 700
    const-string v0, "getStackTrace"

    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->getMethod(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    move-object v9, v0

    goto :goto_0

    :cond_0
    move-object v9, v1

    :goto_0
    if-eqz v9, :cond_1

    .line 701
    const-class v2, Ljava/lang/Throwable;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move v4, p3

    move-wide/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    invoke-virtual/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1

    :cond_1
    move-object/from16 v11, p9

    .line 702
    invoke-virtual/range {p8 .. p8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    .line 703
    invoke-virtual/range {p8 .. p8}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v7

    if-eqz v11, :cond_3

    .line 704
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    const/4 v10, 0x0

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 705
    iput-object v8, v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClass:Ljava/lang/Class;

    .line 706
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;

    if-eq v11, p1, :cond_2

    .line 707
    iput-object v11, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    :cond_2
    return-object v0

    .line 708
    :cond_3
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v8, v2, :cond_4

    .line 709
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolValField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterBoolValField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/Class;)V

    return-object v0

    .line 710
    :cond_4
    const-class v2, Ljava/lang/Boolean;

    if-ne v8, v2, :cond_5

    .line 711
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolField;

    move-object v9, v8

    const/4 v8, 0x0

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/FieldWriterBoolField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    return-object v0

    .line 712
    :cond_5
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v8, v2, :cond_6

    .line 713
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt8ValField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterInt8ValField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 714
    :cond_6
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v8, v2, :cond_7

    .line 715
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt16ValField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterInt16ValField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 716
    :cond_7
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v8, v2, :cond_8

    .line 717
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt32Val;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterInt32Val;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    :cond_8
    move-object/from16 v5, p6

    .line 718
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v8, v2, :cond_b

    if-eqz v5, :cond_a

    .line 719
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_a

    const-string p1, "string"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_1

    .line 720
    :cond_9
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterMillisField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterMillisField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 721
    :cond_a
    :goto_1
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt64ValField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterInt64ValField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 722
    :cond_b
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v8, v2, :cond_c

    .line 723
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterFloatValField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterFloatValField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 724
    :cond_c
    const-class v2, Ljava/lang/Float;

    if-ne v8, v2, :cond_d

    .line 725
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterFloatField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterFloatField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 726
    :cond_d
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v8, v2, :cond_e

    .line 727
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterDoubleValField;

    move-object v1, p2

    move v2, p3

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/writer/FieldWriterDoubleValField;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 728
    :cond_e
    const-class v2, Ljava/lang/Double;

    if-ne v8, v2, :cond_f

    .line 729
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterDoubleField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterDoubleField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 730
    :cond_f
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v8, v2, :cond_10

    .line 731
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterCharValField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterCharValField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 732
    :cond_10
    const-class v2, Ljava/math/BigInteger;

    if-ne v8, v2, :cond_11

    .line 733
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterBigIntField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterBigIntField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 734
    :cond_11
    const-class v2, Ljava/math/BigDecimal;

    if-ne v8, v2, :cond_12

    .line 735
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterBigDecimalField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterBigDecimalField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 736
    :cond_12
    const-class v2, Ljava/util/Date;

    if-ne v8, v2, :cond_13

    .line 737
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterDateField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterDateField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 738
    :cond_13
    const-class v2, Ljava/lang/String;

    if-ne v8, v2, :cond_14

    .line 739
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterStringField;

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterStringField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 740
    :cond_14
    invoke-virtual {v8}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_16

    .line 741
    new-instance v2, Lcom/alibaba/fastjson2/codec/BeanInfo;

    invoke-direct {v2}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    .line 742
    invoke-virtual {p1, v2, v8}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 743
    iget-boolean v2, v2, Lcom/alibaba/fastjson2/codec/BeanInfo;->writeEnumAsJavaBean:Z

    if-nez v2, :cond_15

    .line 744
    iget-object v3, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    if-eqz v3, :cond_15

    .line 745
    instance-of v3, v3, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;

    if-nez v3, :cond_15

    const/4 v2, 0x1

    .line 746
    :cond_15
    invoke-static {v8, p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumValueField(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/reflect/Member;

    move-result-object p1

    if-nez p1, :cond_16

    if-nez v2, :cond_16

    .line 747
    invoke-static {v8}, Lcom/alibaba/fastjson2/util/BeanUtils;->getEnumAnnotationNames(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_16

    .line 748
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterEnum;

    const/4 v10, 0x0

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterEnum;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    return-object v0

    .line 749
    :cond_16
    const-class p1, Ljava/util/List;

    if-eq v8, p1, :cond_1a

    const-class p1, Ljava/util/ArrayList;

    if-eq v8, p1, :cond_1a

    const-class p1, Ljava/lang/Iterable;

    if-ne v8, p1, :cond_17

    goto :goto_2

    .line 750
    :cond_17
    const-class p1, Ljava/util/Map;

    invoke-virtual {p1, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_18

    .line 751
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterMapField;

    invoke-virtual/range {p8 .. p8}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v7

    const/4 v10, 0x0

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/writer/FieldWriterMapField;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/Class;)V

    return-object v0

    .line 752
    :cond_18
    invoke-virtual {v8}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_19

    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result p1

    if-nez p1, :cond_19

    .line 753
    invoke-virtual {v8}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v2

    .line 754
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;

    move-object v9, v8

    move-object v8, v2

    move-object v1, p2

    move v3, p3

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v10, p8

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    return-object v0

    .line 755
    :cond_19
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    invoke-virtual/range {p8 .. p8}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v7

    const/4 v10, 0x0

    move-object v1, p2

    move v2, p3

    move-wide/from16 v3, p4

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v9, p8

    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    return-object v0

    .line 756
    :cond_1a
    :goto_2
    instance-of p1, v7, Ljava/lang/reflect/ParameterizedType;

    if-eqz p1, :cond_1b

    .line 757
    move-object p1, v7

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 v0, 0x0

    aget-object v1, p1, v0

    :cond_1b
    move-object v2, v1

    .line 758
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterListField;

    move-object v1, p2

    move v3, p3

    move-wide/from16 v4, p4

    move-object/from16 v6, p6

    move-object/from16 v10, p8

    move-object/from16 v11, p10

    move-object v9, v8

    move-object v8, v7

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/writer/FieldWriterListField;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Class;)V

    return-object v0
.end method

.method public createFieldWriter(Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 12

    move-object/from16 v2, p4

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move-object/from16 v9, p7

    .line 762
    iput-wide p2, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    .line 763
    invoke-virtual {v2, v0, v1, p1, v9}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getFieldInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;Ljava/lang/reflect/Field;)V

    .line 764
    iget-boolean p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ignore:Z

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    return-object p2

    .line 765
    :cond_0
    iget-object p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    .line 766
    :cond_1
    iget-object p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldName:Ljava/lang/String;

    :cond_2
    :goto_0
    move-object v3, p1

    goto :goto_2

    .line 767
    :cond_3
    :goto_1
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    .line 768
    iget-object p3, v0, Lcom/alibaba/fastjson2/codec/BeanInfo;->namingStrategy:Ljava/lang/String;

    if-eqz p3, :cond_2

    .line 769
    invoke-static {p1, p3}, Lcom/alibaba/fastjson2/util/BeanUtils;->fieldName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 770
    :goto_2
    iget-object p1, v0, Lcom/alibaba/fastjson2/codec/BeanInfo;->orders:[Ljava/lang/String;

    const/4 p3, 0x0

    const/4 v4, 0x1

    if-eqz p1, :cond_6

    move p1, p3

    move v5, p1

    .line 771
    :goto_3
    iget-object v6, v0, Lcom/alibaba/fastjson2/codec/BeanInfo;->orders:[Ljava/lang/String;

    array-length v7, v6

    if-ge p1, v7, :cond_5

    .line 772
    aget-object v6, v6, p1

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 773
    iput p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    move v5, v4

    :cond_4
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    if-nez v5, :cond_6

    .line 774
    iget p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    if-nez p1, :cond_6

    .line 775
    array-length p1, v6

    iput p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 776
    :cond_6
    iget p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    if-nez p1, :cond_7

    iget-object p1, v0, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 p1, -0x1

    .line 777
    iput p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    .line 778
    :cond_7
    iget-object p1, v0, Lcom/alibaba/fastjson2/codec/BeanInfo;->includes:[Ljava/lang/String;

    if-eqz p1, :cond_a

    .line 779
    array-length v5, p1

    if-lez v5, :cond_a

    .line 780
    :goto_4
    array-length v5, p1

    if-ge p3, v5, :cond_9

    .line 781
    aget-object v5, p1, p3

    .line 782
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 p3, p3, 0x1

    goto :goto_4

    :cond_9
    return-object p2

    .line 783
    :cond_a
    :goto_5
    iget-object p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->writeUsing:Ljava/lang/Class;

    if-eqz p1, :cond_b

    .line 784
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    .line 785
    invoke-virtual {p1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 786
    invoke-virtual {p1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    :goto_6
    move-object p1, v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_6

    .line 787
    :goto_7
    const-string p2, "create writeUsing Writer error"

    invoke-static {p2, p1}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1

    :cond_b
    move-object p1, p2

    .line 788
    :goto_8
    :try_start_1
    invoke-virtual {v9, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    if-nez p1, :cond_c

    .line 789
    iget-boolean p3, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->fieldClassMixIn:Z

    if-eqz p3, :cond_c

    .line 790
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;

    :cond_c
    if-nez p1, :cond_d

    .line 791
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p3

    .line 792
    const-class v5, Ljava/util/Date;

    if-ne p3, v5, :cond_e

    .line 793
    iget-object p2, v2, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 794
    sget-object p3, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    if-eq p2, p3, :cond_d

    move-object p1, p2

    :cond_d
    :goto_9
    move-object v10, p1

    goto :goto_b

    .line 795
    :cond_e
    const-class v5, Ljava/util/Map;

    invoke-virtual {v5, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v5, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->keyUsing:Ljava/lang/Class;

    if-nez v5, :cond_f

    iget-object v6, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->valueUsing:Ljava/lang/Class;

    if-eqz v6, :cond_d

    :cond_f
    if-eqz v5, :cond_10

    .line 796
    :try_start_2
    invoke-virtual {v5, p2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    .line 797
    invoke-virtual {v5, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 798
    invoke-virtual {v5, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/alibaba/fastjson2/writer/ObjectWriter;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    goto :goto_a

    :catch_4
    :cond_10
    move-object v5, p2

    .line 799
    :goto_a
    iget-object v6, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->valueUsing:Ljava/lang/Class;

    if-eqz v6, :cond_11

    .line 800
    :try_start_3
    invoke-virtual {v6, p2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    .line 801
    invoke-virtual {v6, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 802
    invoke-virtual {v6, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/alibaba/fastjson2/writer/ObjectWriter;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_5

    move-object p2, v4

    :catch_5
    :cond_11
    if-nez v5, :cond_12

    if-eqz p2, :cond_d

    .line 803
    :cond_12
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, p3}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    move-result-object p1

    .line 804
    iput-object v5, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->keyWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 805
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->valueWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    goto :goto_9

    .line 806
    :goto_b
    iget-object p1, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->format:Ljava/lang/String;

    if-nez p1, :cond_13

    .line 807
    iget-object p2, v0, Lcom/alibaba/fastjson2/codec/BeanInfo;->format:Ljava/lang/String;

    if-eqz p2, :cond_13

    move-object v7, p2

    goto :goto_c

    :cond_13
    move-object v7, p1

    .line 808
    :goto_c
    iget v4, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->ordinal:I

    iget-wide v5, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->features:J

    iget-object v8, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->label:Ljava/lang/String;

    iget-object v11, v1, Lcom/alibaba/fastjson2/codec/FieldInfo;->contentAs:Ljava/lang/Class;

    move-object v1, p0

    invoke-virtual/range {v1 .. v11}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/writer/ObjectWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v1, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-wide v5, p4

    move-object/from16 v7, p6

    move-object/from16 v9, p7

    .line 760
    invoke-virtual/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            ")",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p3

    move-object v7, p4

    .line 759
    invoke-virtual/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/reflect/Method;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;",
            ")",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    .line 695
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "IJ",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    .line 694
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v6, p5

    move-object/from16 v8, p6

    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            "Ljava/util/function/Function<",
            "TT;TV;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object/from16 v10, p5

    move-object v0, p0

    move-object v3, p1

    move-wide v5, p2

    move-object/from16 v7, p4

    move-object/from16 v9, p5

    move-object/from16 v12, p6

    .line 818
    invoke-virtual/range {v0 .. v12}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/String;Lcom/alibaba/fastjson2/function/ToByteFunction;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/function/ToByteFunction<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    .line 812
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt8ValFunc;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterInt8ValFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/function/ToByteFunction;)V

    return-object v0
.end method

.method public createFieldWriter(Ljava/lang/String;Lcom/alibaba/fastjson2/function/ToFloatFunction;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/function/ToFloatFunction<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    .line 813
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterFloatValueFunc;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterFloatValueFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/function/ToFloatFunction;)V

    return-object v0
.end method

.method public createFieldWriter(Ljava/lang/String;Lcom/alibaba/fastjson2/function/ToShortFunction;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/alibaba/fastjson2/function/ToShortFunction<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    .line 811
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt16ValFunc;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterInt16ValFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/function/ToShortFunction;)V

    return-object v0
.end method

.method public createFieldWriter(Ljava/lang/String;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class;",
            "Ljava/util/function/Function<",
            "TT;TV;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v10, p2

    move-object v0, p0

    move-object v3, p1

    move-object v9, p2

    move-object/from16 v12, p3

    .line 816
    invoke-virtual/range {v0 .. v12}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lcom/alibaba/fastjson2/writer/FieldWriter<",
            "TT;>;"
        }
    .end annotation

    .line 693
    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v6, p2

    move-object v8, p3

    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/writer/ObjectWriter;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class;",
            "Ljava/util/function/Function<",
            "TT;TV;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v9, p2

    move-object/from16 v10, p3

    move-object/from16 v12, p4

    .line 817
    invoke-virtual/range {v0 .. v12}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createFieldWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Method;Ljava/util/function/Function;)Lcom/alibaba/fastjson2/writer/FieldWriter;

    move-result-object p1

    return-object p1
.end method

.method public createFieldWriter(Ljava/lang/String;Ljava/util/function/Predicate;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/function/Predicate<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    .line 815
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterBoolValFunc;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterBoolValFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/Predicate;)V

    return-object v0
.end method

.method public createFieldWriter(Ljava/lang/String;Ljava/util/function/ToDoubleFunction;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/function/ToDoubleFunction<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    .line 814
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterDoubleValueFunc;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterDoubleValueFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/ToDoubleFunction;)V

    return-object v0
.end method

.method public createFieldWriter(Ljava/lang/String;Ljava/util/function/ToIntFunction;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/function/ToIntFunction<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    .line 810
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt32ValFunc;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterInt32ValFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/ToIntFunction;)V

    return-object v0
.end method

.method public createFieldWriter(Ljava/lang/String;Ljava/util/function/ToLongFunction;)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/function/ToLongFunction<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;"
        }
    .end annotation

    .line 809
    new-instance v0, Lcom/alibaba/fastjson2/writer/FieldWriterInt64ValFunc;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterInt64ValFunc;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/util/function/ToLongFunction;)V

    return-object v0
.end method

.method public createObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 3

    const-wide/16 v0, 0x0

    .line 424
    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createObjectWriter(Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1
.end method

.method public createObjectWriter(Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v6, p4

    .line 4
    .line 5
    new-instance v7, Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 6
    .line 7
    invoke-direct {v7}, Lcom/alibaba/fastjson2/codec/BeanInfo;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v6, v7, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getBeanInfo(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v7, Lcom/alibaba/fastjson2/codec/BeanInfo;->serializer:Ljava/lang/Class;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const-class v2, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    :try_start_0
    iget-object v0, v7, Lcom/alibaba/fastjson2/codec/BeanInfo;->serializer:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/alibaba/fastjson2/writer/ObjectWriter;
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    return-object v0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    goto :goto_0

    .line 36
    :catch_1
    move-exception v0

    .line 37
    :goto_0
    const-string v1, "create serializer error"

    .line 38
    .line 39
    invoke-static {v1, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    return-object v0

    .line 44
    :cond_0
    iget-wide v2, v7, Lcom/alibaba/fastjson2/codec/BeanInfo;->writerFeatures:J

    .line 45
    .line 46
    iget-object v0, v7, Lcom/alibaba/fastjson2/codec/BeanInfo;->seeAlso:[Ljava/lang/Class;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 51
    .line 52
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 53
    .line 54
    not-long v4, v4

    .line 55
    and-long/2addr v2, v4

    .line 56
    :cond_1
    or-long v2, p2, v2

    .line 57
    .line 58
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 59
    .line 60
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 61
    .line 62
    not-long v4, v4

    .line 63
    and-long/2addr v4, v2

    .line 64
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 65
    .line 66
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 67
    .line 68
    and-long/2addr v2, v4

    .line 69
    const-wide/16 v10, 0x0

    .line 70
    .line 71
    cmp-long v0, v2, v10

    .line 72
    .line 73
    const/4 v12, 0x0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    move v0, v12

    .line 79
    :goto_1
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    move v13, v12

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move v13, v0

    .line 90
    :goto_2
    new-instance v2, Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 91
    .line 92
    invoke-direct {v2}, Lcom/alibaba/fastjson2/codec/FieldInfo;-><init>()V

    .line 93
    .line 94
    .line 95
    if-eqz v13, :cond_4

    .line 96
    .line 97
    new-instance v8, Ljava/util/TreeMap;

    .line 98
    .line 99
    invoke-direct {v8}, Ljava/util/TreeMap;-><init>()V

    .line 100
    .line 101
    .line 102
    new-instance v0, Lcom/alibaba/fastjson2/writer/a;

    .line 103
    .line 104
    const/4 v9, 0x0

    .line 105
    move-object v3, v1

    .line 106
    move-object v1, p0

    .line 107
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/a;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/TreeMap;I)V

    .line 108
    .line 109
    .line 110
    move-object v1, v3

    .line 111
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->declaredFields(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v8}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 121
    .line 122
    .line 123
    move-object v6, v0

    .line 124
    move-object v8, v7

    .line 125
    goto :goto_3

    .line 126
    :cond_4
    new-instance v8, Ljava/util/TreeMap;

    .line 127
    .line 128
    invoke-direct {v8}, Ljava/util/TreeMap;-><init>()V

    .line 129
    .line 130
    .line 131
    new-instance v0, Lcom/alibaba/fastjson2/writer/a;

    .line 132
    .line 133
    const/4 v9, 0x1

    .line 134
    move-object/from16 v6, p4

    .line 135
    .line 136
    move-object v3, v1

    .line 137
    move-object v1, p0

    .line 138
    invoke-direct/range {v0 .. v9}, Lcom/alibaba/fastjson2/writer/a;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/TreeMap;I)V

    .line 139
    .line 140
    .line 141
    move-object v1, v3

    .line 142
    invoke-static {v1, v0}, Lcom/alibaba/fastjson2/util/BeanUtils;->declaredFields(Ljava/lang/Class;Ljava/util/function/Consumer;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getMixIn(Ljava/lang/Class;)Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    iget-boolean v14, v7, Lcom/alibaba/fastjson2/codec/BeanInfo;->kotlin:Z

    .line 150
    .line 151
    new-instance v0, Lcom/alibaba/fastjson2/writer/a;

    .line 152
    .line 153
    move-wide v3, v4

    .line 154
    move-object v5, v7

    .line 155
    move-object v7, v1

    .line 156
    move-object v1, p0

    .line 157
    invoke-direct/range {v0 .. v8}, Lcom/alibaba/fastjson2/writer/a;-><init>(Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;JLcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;Ljava/util/TreeMap;)V

    .line 158
    .line 159
    .line 160
    move-object v2, v0

    .line 161
    move-object v1, v7

    .line 162
    move-object v0, v8

    .line 163
    move-object v8, v5

    .line 164
    invoke-static {v1, v9, v14, v2}, Lcom/alibaba/fastjson2/util/BeanUtils;->getters(Ljava/lang/Class;Ljava/lang/Class;ZLjava/util/function/Consumer;)V

    .line 165
    .line 166
    .line 167
    new-instance v2, Ljava/util/ArrayList;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 174
    .line 175
    .line 176
    move-object v6, v2

    .line 177
    :goto_3
    iget-wide v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->writerFeatures:J

    .line 178
    .line 179
    or-long v4, p2, v2

    .line 180
    .line 181
    if-nez v13, :cond_5

    .line 182
    .line 183
    const-class v0, Ljava/lang/Throwable;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-eqz v0, :cond_5

    .line 190
    .line 191
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterException;

    .line 192
    .line 193
    invoke-direct {v0, v1, v4, v5, v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterException;-><init>(Ljava/lang/Class;JLjava/util/List;)V

    .line 194
    .line 195
    .line 196
    return-object v0

    .line 197
    :cond_5
    invoke-virtual {p0, v8, v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->handleIgnores(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/List;)V

    .line 198
    .line 199
    .line 200
    iget-boolean v0, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->alphabetic:Z

    .line 201
    .line 202
    if-eqz v0, :cond_6

    .line 203
    .line 204
    invoke-static {v6}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 205
    .line 206
    .line 207
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v0, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->rootName:Ljava/lang/String;

    .line 211
    .line 212
    if-nez v0, :cond_7

    .line 213
    .line 214
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    packed-switch v0, :pswitch_data_0

    .line 219
    .line 220
    .line 221
    goto/16 :goto_4

    .line 222
    .line 223
    :pswitch_0
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter12;

    .line 224
    .line 225
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 228
    .line 229
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter12;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 230
    .line 231
    .line 232
    goto/16 :goto_5

    .line 233
    .line 234
    :pswitch_1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter11;

    .line 235
    .line 236
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 237
    .line 238
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 239
    .line 240
    move-object/from16 v1, p1

    .line 241
    .line 242
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter11;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_5

    .line 246
    .line 247
    :pswitch_2
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter10;

    .line 248
    .line 249
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 252
    .line 253
    move-object/from16 v1, p1

    .line 254
    .line 255
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter10;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_5

    .line 259
    .line 260
    :pswitch_3
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;

    .line 261
    .line 262
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 263
    .line 264
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 265
    .line 266
    move-object/from16 v1, p1

    .line 267
    .line 268
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter9;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_5

    .line 272
    .line 273
    :pswitch_4
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter8;

    .line 274
    .line 275
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 276
    .line 277
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 278
    .line 279
    move-object/from16 v1, p1

    .line 280
    .line 281
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter8;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 282
    .line 283
    .line 284
    goto :goto_5

    .line 285
    :pswitch_5
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter7;

    .line 286
    .line 287
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 288
    .line 289
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 290
    .line 291
    move-object/from16 v1, p1

    .line 292
    .line 293
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter7;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 294
    .line 295
    .line 296
    goto :goto_5

    .line 297
    :pswitch_6
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter6;

    .line 298
    .line 299
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 300
    .line 301
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 302
    .line 303
    move-object/from16 v1, p1

    .line 304
    .line 305
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter6;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 306
    .line 307
    .line 308
    goto :goto_5

    .line 309
    :pswitch_7
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter5;

    .line 310
    .line 311
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 312
    .line 313
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 314
    .line 315
    move-object/from16 v1, p1

    .line 316
    .line 317
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 318
    .line 319
    .line 320
    goto :goto_5

    .line 321
    :pswitch_8
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter4;

    .line 322
    .line 323
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 324
    .line 325
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 326
    .line 327
    move-object/from16 v1, p1

    .line 328
    .line 329
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 330
    .line 331
    .line 332
    goto :goto_5

    .line 333
    :pswitch_9
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter3;

    .line 334
    .line 335
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 336
    .line 337
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 338
    .line 339
    move-object/from16 v1, p1

    .line 340
    .line 341
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter3;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :pswitch_a
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter2;

    .line 346
    .line 347
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 348
    .line 349
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 350
    .line 351
    move-object/from16 v1, p1

    .line 352
    .line 353
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter2;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 354
    .line 355
    .line 356
    goto :goto_5

    .line 357
    :pswitch_b
    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    check-cast v0, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 362
    .line 363
    iget-wide v0, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 364
    .line 365
    const-wide/high16 v2, 0x1000000000000L

    .line 366
    .line 367
    and-long/2addr v0, v2

    .line 368
    cmp-long v0, v0, v10

    .line 369
    .line 370
    if-nez v0, :cond_7

    .line 371
    .line 372
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriter1;

    .line 373
    .line 374
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 375
    .line 376
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 377
    .line 378
    move-object/from16 v1, p1

    .line 379
    .line 380
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 381
    .line 382
    .line 383
    goto :goto_5

    .line 384
    :cond_7
    :goto_4
    const/4 v0, 0x0

    .line 385
    :goto_5
    if-nez v0, :cond_9

    .line 386
    .line 387
    move-object v7, v6

    .line 388
    move-wide v5, v4

    .line 389
    iget-object v4, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->rootName:Ljava/lang/String;

    .line 390
    .line 391
    iget-object v2, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeKey:Ljava/lang/String;

    .line 392
    .line 393
    iget-object v3, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->typeName:Ljava/lang/String;

    .line 394
    .line 395
    if-eqz v4, :cond_8

    .line 396
    .line 397
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterRootName;

    .line 398
    .line 399
    move-object/from16 v1, p1

    .line 400
    .line 401
    invoke-direct/range {v0 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterRootName;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 402
    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_8
    move-wide v4, v5

    .line 406
    move-object v6, v7

    .line 407
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 408
    .line 409
    move-object/from16 v1, p1

    .line 410
    .line 411
    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 412
    .line 413
    .line 414
    :cond_9
    :goto_6
    iget-object v1, v8, Lcom/alibaba/fastjson2/codec/BeanInfo;->serializeFilters:[Ljava/lang/Class;

    .line 415
    .line 416
    if-eqz v1, :cond_a

    .line 417
    .line 418
    invoke-static {v8, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->configSerializeFilters(Lcom/alibaba/fastjson2/codec/BeanInfo;Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;)V

    .line 419
    .line 420
    .line 421
    :cond_a
    return-object v0

    .line 422
    nop

    .line 423
    :pswitch_data_0
    .packed-switch 0x1
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

.method public varargs createObjectWriter(Ljava/lang/Class;J[Lcom/alibaba/fastjson2/writer/FieldWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 9

    .line 426
    array-length v0, p4

    if-nez v0, :cond_0

    .line 427
    sget-object p4, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createObjectWriter(Ljava/lang/Class;JLcom/alibaba/fastjson2/writer/ObjectWriterProvider;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1

    .line 428
    :cond_0
    array-length v0, p4

    packed-switch v0, :pswitch_data_0

    .line 429
    new-instance v1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    const/4 v4, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/4 v3, 0x0

    move-object v2, p1

    move-wide v5, p2

    invoke-direct/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v1

    :pswitch_0
    move-object v3, p1

    move-wide v6, p2

    .line 430
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter12;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter12;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_1
    move-object v3, p1

    move-wide v6, p2

    .line 431
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter11;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter11;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_2
    move-object v3, p1

    move-wide v6, p2

    .line 432
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter10;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter10;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_3
    move-object v3, p1

    move-wide v6, p2

    .line 433
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter9;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter9;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_4
    move-object v3, p1

    move-wide v6, p2

    .line 434
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter8;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter8;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_5
    move-object v3, p1

    move-wide v6, p2

    .line 435
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter7;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter7;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_6
    move-object v3, p1

    move-wide v6, p2

    .line 436
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter6;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter6;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_7
    move-object v3, p1

    move-wide v6, p2

    .line 437
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter5;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter5;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_8
    move-object v3, p1

    move-wide v6, p2

    .line 438
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter4;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter4;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_9
    move-object v3, p1

    move-wide v6, p2

    .line 439
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter3;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter3;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_a
    move-object v3, p1

    move-wide v6, p2

    .line 440
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter2;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter2;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_b
    move-object v3, p1

    move-wide v6, p2

    const/4 p1, 0x0

    .line 441
    aget-object p1, p4, p1

    iget-wide p1, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    const-wide/high16 v0, 0x1000000000000L

    and-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-nez p1, :cond_1

    .line 442
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriter1;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    .line 443
    :cond_1
    new-instance v2, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    const/4 v5, 0x0

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
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

.method public varargs createObjectWriter(Ljava/lang/Class;[Lcom/alibaba/fastjson2/writer/FieldWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 2

    const-wide/16 v0, 0x0

    .line 425
    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterCreator;->createObjectWriter(Ljava/lang/Class;J[Lcom/alibaba/fastjson2/writer/FieldWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1
.end method

.method public createObjectWriter(Ljava/util/List;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;",
            ">;)",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter;"
        }
    .end annotation

    .line 444
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v0
.end method

.method public varargs createObjectWriter([Lcom/alibaba/fastjson2/writer/FieldWriter;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 7

    .line 423
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    const-wide/16 v4, 0x0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    return-object v0
.end method

.method public getInitWriter(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 8

    .line 1
    const-class v0, Ljava/util/Date;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    iget-wide v3, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 8
    .line 9
    const-wide/16 v5, 0x10

    .line 10
    .line 11
    and-long/2addr v3, v5

    .line 12
    cmp-long v0, v3, v1

    .line 13
    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    iget-object p1, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 17
    .line 18
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 23
    .line 24
    sget-object p2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 25
    .line 26
    if-eq p1, p2, :cond_4

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    const-class v3, Ljava/lang/Long;

    .line 32
    .line 33
    if-eq p2, v0, :cond_3

    .line 34
    .line 35
    if-ne p2, v3, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-class v0, Ljava/math/BigDecimal;

    .line 39
    .line 40
    if-ne p2, v0, :cond_2

    .line 41
    .line 42
    iget-wide v3, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 43
    .line 44
    const-wide/16 v5, 0x8

    .line 45
    .line 46
    and-long/2addr v3, v5

    .line 47
    cmp-long v0, v3, v1

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    iget-object p1, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 52
    .line 53
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 58
    .line 59
    sget-object p2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;

    .line 60
    .line 61
    if-eq p1, p2, :cond_4

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_2
    const-class v0, Ljava/lang/Enum;

    .line 65
    .line 66
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    iget-object p1, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 73
    .line 74
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 79
    .line 80
    instance-of p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplEnum;

    .line 81
    .line 82
    if-nez p2, :cond_4

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_3
    :goto_0
    iget-wide v4, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 86
    .line 87
    const-wide/16 v6, 0x4

    .line 88
    .line 89
    and-long/2addr v4, v6

    .line 90
    cmp-long p2, v4, v1

    .line 91
    .line 92
    if-eqz p2, :cond_4

    .line 93
    .line 94
    iget-object p1, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->cache:Ljava/util/concurrent/ConcurrentMap;

    .line 95
    .line 96
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 101
    .line 102
    sget-object p2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplInt64;

    .line 103
    .line 104
    if-eq p1, p2, :cond_4

    .line 105
    .line 106
    return-object p1

    .line 107
    :cond_4
    const/4 p1, 0x0

    .line 108
    return-object p1
.end method

.method public handleIgnores(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/codec/BeanInfo;",
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->ignores:[Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    array-length v0, v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    :goto_0
    if-ltz v0, :cond_3

    .line 16
    .line 17
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 22
    .line 23
    iget-object v2, p1, Lcom/alibaba/fastjson2/codec/BeanInfo;->ignores:[Ljava/lang/String;

    .line 24
    .line 25
    array-length v3, v2

    .line 26
    const/4 v4, 0x0

    .line 27
    :goto_1
    if-ge v4, v3, :cond_2

    .line 28
    .line 29
    aget-object v5, v2, v4

    .line 30
    .line 31
    iget-object v6, v1, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    invoke-interface {p2, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_2
    add-int/lit8 v0, v0, -0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    :goto_3
    return-void
.end method
