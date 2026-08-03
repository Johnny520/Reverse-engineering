.class final Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;
.super Lcom/alibaba/fastjson2/writer/FieldWriter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/writer/FieldWriter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final itemClass:Ljava/lang/Class;

.field itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

.field final itemType:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move v2, p3

    .line 4
    move-wide v3, p4

    .line 5
    move-object/from16 v5, p6

    .line 6
    .line 7
    move-object/from16 v6, p7

    .line 8
    .line 9
    move-object/from16 v7, p8

    .line 10
    .line 11
    move-object/from16 v8, p9

    .line 12
    .line 13
    move-object/from16 v9, p10

    .line 14
    .line 15
    move-object/from16 v10, p11

    .line 16
    .line 17
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriter;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemType:Ljava/lang/reflect/Type;

    .line 21
    .line 22
    instance-of p1, p2, Ljava/lang/Class;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    check-cast p2, Ljava/lang/Class;

    .line 27
    .line 28
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemClass:Ljava/lang/Class;

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemClass:Ljava/lang/Class;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->method:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-object p1

    .line 9
    :catch_0
    move-exception p1

    .line 10
    goto :goto_0

    .line 11
    :catch_1
    move-exception p1

    .line 12
    goto :goto_0

    .line 13
    :catch_2
    move-exception p1

    .line 14
    :goto_0
    const-string v0, "field.get error, "

    .line 15
    .line 16
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, p1}, Lah/a;->o(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public getItemWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_1

    .line 3
    .line 4
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemType:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    if-ne p2, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_2
    const-class v1, [Ljava/lang/Float;

    .line 20
    .line 21
    const-class v2, Ljava/lang/Float;

    .line 22
    .line 23
    if-ne p2, v1, :cond_4

    .line 24
    .line 25
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 26
    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 30
    .line 31
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 32
    .line 33
    invoke-direct {p1, v2, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->FLOAT_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_4
    const-class v1, [Ljava/lang/Double;

    .line 41
    .line 42
    const-class v3, Ljava/lang/Double;

    .line 43
    .line 44
    if-ne p2, v1, :cond_6

    .line 45
    .line 46
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 47
    .line 48
    if-eqz p1, :cond_5

    .line 49
    .line 50
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 51
    .line 52
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 53
    .line 54
    invoke-direct {p1, v3, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_5
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->DOUBLE_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_6
    const-class v1, [Ljava/math/BigDecimal;

    .line 62
    .line 63
    const-class v4, Ljava/math/BigDecimal;

    .line 64
    .line 65
    if-ne p2, v1, :cond_8

    .line 66
    .line 67
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 68
    .line 69
    if-eqz p1, :cond_7

    .line 70
    .line 71
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 72
    .line 73
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 74
    .line 75
    invoke-direct {p1, v4, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 76
    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_7
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->DECIMAL_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 80
    .line 81
    return-object p1

    .line 82
    :cond_8
    if-ne p2, v2, :cond_a

    .line 83
    .line 84
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 85
    .line 86
    if-eqz p1, :cond_9

    .line 87
    .line 88
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloat;

    .line 89
    .line 90
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 91
    .line 92
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloat;-><init>(Ljava/text/DecimalFormat;)V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :cond_9
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloat;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloat;

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_a
    if-ne p2, v3, :cond_c

    .line 100
    .line 101
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 102
    .line 103
    if-eqz p1, :cond_b

    .line 104
    .line 105
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDouble;

    .line 106
    .line 107
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 108
    .line 109
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDouble;-><init>(Ljava/text/DecimalFormat;)V

    .line 110
    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_b
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDouble;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDouble;

    .line 114
    .line 115
    return-object p1

    .line 116
    :cond_c
    if-ne p2, v4, :cond_e

    .line 117
    .line 118
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 119
    .line 120
    if-eqz p1, :cond_d

    .line 121
    .line 122
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;

    .line 123
    .line 124
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 125
    .line 126
    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;-><init>(Ljava/text/DecimalFormat;Ljava/util/function/Function;)V

    .line 127
    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_d
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;

    .line 131
    .line 132
    return-object p1

    .line 133
    :cond_e
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemType:Ljava/lang/reflect/Type;

    .line 134
    .line 135
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemClass:Ljava/lang/Class;

    .line 136
    .line 137
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 142
    .line 143
    return-object p1
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "TT;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [Ljava/lang/Object;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-nez p2, :cond_1

    .line 9
    .line 10
    iget-wide v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 13
    .line 14
    .line 15
    move-result-wide v3

    .line 16
    or-long/2addr v1, v3

    .line 17
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 18
    .line 19
    iget-wide v3, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 20
    .line 21
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 22
    .line 23
    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 24
    .line 25
    or-long/2addr v3, v5

    .line 26
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullListAsEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 27
    .line 28
    iget-wide v5, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 29
    .line 30
    or-long/2addr v3, v5

    .line 31
    and-long/2addr v1, v3

    .line 32
    const-wide/16 v3, 0x0

    .line 33
    .line 34
    cmp-long p2, v1, v3

    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 42
    .line 43
    .line 44
    return v0

    .line 45
    :cond_0
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_1
    invoke-virtual {p0, p1, v0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->writeArray(Lcom/alibaba/fastjson2/JSONWriter;Z[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return v0
.end method

.method public writeArray(Lcom/alibaba/fastjson2/JSONWriter;Z[Ljava/lang/Object;)V
    .locals 13

    .line 1
    move-object/from16 v7, p3

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 9
    .line 10
    .line 11
    move-result v8

    .line 12
    if-eqz v8, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v0, v7}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v0, :cond_a

    .line 31
    .line 32
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 37
    .line 38
    if-eq v0, v4, :cond_2

    .line 39
    .line 40
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    array-length v9, v7

    .line 48
    invoke-virtual {p1, v9}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 49
    .line 50
    .line 51
    move v10, v2

    .line 52
    move-object v0, v3

    .line 53
    move v2, v8

    .line 54
    :goto_0
    if-ge v10, v9, :cond_8

    .line 55
    .line 56
    move v4, v2

    .line 57
    aget-object v2, v7, v10

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 62
    .line 63
    .line 64
    move v2, v4

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    if-eq v5, v3, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-virtual {p0, p1, v5}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->getItemWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    invoke-static {v5}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    xor-int/lit8 v0, v0, 0x1

    .line 87
    .line 88
    :cond_4
    move v11, v0

    .line 89
    move-object v0, v3

    .line 90
    move-object v12, v5

    .line 91
    goto :goto_1

    .line 92
    :cond_5
    move-object v12, v3

    .line 93
    move v11, v4

    .line 94
    :goto_1
    if-eqz v11, :cond_6

    .line 95
    .line 96
    invoke-virtual {p1, v10, v2}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->itemType:Ljava/lang/reflect/Type;

    .line 114
    .line 115
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 116
    .line 117
    move-object v1, p1

    .line 118
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 119
    .line 120
    .line 121
    if-eqz v11, :cond_7

    .line 122
    .line 123
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_7
    :goto_2
    move v2, v11

    .line 127
    move-object v3, v12

    .line 128
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_8
    if-eqz v8, :cond_9

    .line 132
    .line 133
    invoke-virtual {p1, v7}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_9
    return-void

    .line 137
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->startArray()V

    .line 138
    .line 139
    .line 140
    move v8, v2

    .line 141
    move-object v0, v3

    .line 142
    :goto_4
    array-length v2, v7

    .line 143
    if-ge v8, v2, :cond_e

    .line 144
    .line 145
    if-eqz v8, :cond_b

    .line 146
    .line 147
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeComma()V

    .line 148
    .line 149
    .line 150
    :cond_b
    aget-object v2, v7, v8

    .line 151
    .line 152
    if-nez v2, :cond_c

    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 155
    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_c
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    if-ne v4, v3, :cond_d

    .line 163
    .line 164
    move-object v9, v3

    .line 165
    goto :goto_5

    .line 166
    :cond_d
    invoke-virtual {p0, p1, v4}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->getItemWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    move-object v9, v4

    .line 171
    :goto_5
    const/4 v4, 0x0

    .line 172
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 173
    .line 174
    const/4 v3, 0x0

    .line 175
    move-object v1, p1

    .line 176
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 177
    .line 178
    .line 179
    move-object v3, v9

    .line 180
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_e
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->endArray()V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method public writeValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "TT;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, [Ljava/lang/Object;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p0, p1, v0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayMethod;->writeArray(Lcom/alibaba/fastjson2/JSONWriter;Z[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
