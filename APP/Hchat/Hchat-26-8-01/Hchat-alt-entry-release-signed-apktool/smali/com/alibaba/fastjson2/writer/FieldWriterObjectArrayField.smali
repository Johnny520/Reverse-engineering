.class final Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;
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
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;)V
    .locals 11

    .line 1
    const/4 v10, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p3

    .line 5
    move-wide v3, p4

    .line 6
    move-object/from16 v5, p6

    .line 7
    .line 8
    move-object/from16 v6, p7

    .line 9
    .line 10
    move-object/from16 v7, p8

    .line 11
    .line 12
    move-object/from16 v8, p9

    .line 13
    .line 14
    move-object/from16 v9, p10

    .line 15
    .line 16
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriter;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemType:Ljava/lang/reflect/Type;

    .line 20
    .line 21
    instance-of p1, p2, Ljava/lang/Class;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p2, Ljava/lang/Class;

    .line 26
    .line 27
    iput-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemClass:Ljava/lang/Class;

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getMapping(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemClass:Ljava/lang/Class;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public getItemWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemType:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->getClass(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_2
    const-class v0, Ljava/lang/Double;

    .line 23
    .line 24
    if-ne p2, v0, :cond_3

    .line 25
    .line 26
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDouble;

    .line 27
    .line 28
    new-instance p2, Ljava/text/DecimalFormat;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {p2, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDouble;-><init>(Ljava/text/DecimalFormat;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    const-class v0, Ljava/lang/Float;

    .line 42
    .line 43
    if-ne p2, v0, :cond_4

    .line 44
    .line 45
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloat;

    .line 46
    .line 47
    new-instance p2, Ljava/text/DecimalFormat;

    .line 48
    .line 49
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {p2, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloat;-><init>(Ljava/text/DecimalFormat;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    const-class v0, Ljava/math/BigDecimal;

    .line 61
    .line 62
    if-ne p2, v0, :cond_5

    .line 63
    .line 64
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 65
    .line 66
    if-eqz p2, :cond_5

    .line 67
    .line 68
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;

    .line 69
    .line 70
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 71
    .line 72
    const/4 v0, 0x0

    .line 73
    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplBigDecimal;-><init>(Ljava/text/DecimalFormat;Ljava/util/function/Function;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemType:Ljava/lang/reflect/Type;

    .line 80
    .line 81
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemClass:Ljava/lang/Class;

    .line 82
    .line 83
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 88
    .line 89
    :goto_1
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 90
    .line 91
    return-object p1
.end method

.method public getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    const-class v0, [Ljava/lang/String;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplStringArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplStringArray;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const-class v0, [Ljava/lang/Float;

    .line 9
    .line 10
    if-ne p2, v0, :cond_2

    .line 11
    .line 12
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 17
    .line 18
    const-class p2, Ljava/lang/Float;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 21
    .line 22
    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 23
    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_1
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->FLOAT_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_2
    const-class v0, [Ljava/lang/Double;

    .line 30
    .line 31
    if-ne p2, v0, :cond_4

    .line 32
    .line 33
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 38
    .line 39
    const-class p2, Ljava/lang/Double;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 42
    .line 43
    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 44
    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_3
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->DOUBLE_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_4
    const-class v0, [Ljava/math/BigDecimal;

    .line 51
    .line 52
    if-ne p2, v0, :cond_6

    .line 53
    .line 54
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 55
    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 59
    .line 60
    const-class p2, Ljava/math/BigDecimal;

    .line 61
    .line 62
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 63
    .line 64
    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_5
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->DECIMAL_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_6
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
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
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, v0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->writeArray(Lcom/alibaba/fastjson2/JSONWriter;Z[Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return v0
.end method

.method public writeArray(Lcom/alibaba/fastjson2/JSONWriter;Z[Ljava/lang/Object;)V
    .locals 14

    .line 1
    move-object v1, p1

    .line 2
    move-object/from16 v7, p3

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    iget-wide v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 9
    .line 10
    or-long v5, v2, v4

    .line 11
    .line 12
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ReferenceDetection:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 13
    .line 14
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 15
    .line 16
    and-long/2addr v2, v5

    .line 17
    const-wide/16 v8, 0x0

    .line 18
    .line 19
    cmp-long v0, v2, v8

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v10, 0x1

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    move v11, v10

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v11, v2

    .line 28
    :goto_0
    if-eqz p2, :cond_2

    .line 29
    .line 30
    array-length v0, v7

    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 34
    .line 35
    iget-wide v3, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 36
    .line 37
    and-long/2addr v3, v5

    .line 38
    cmp-long v0, v3, v8

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_1
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    if-eqz v11, :cond_3

    .line 48
    .line 49
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1, v0, v7}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    if-eqz v0, :cond_c

    .line 65
    .line 66
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 71
    .line 72
    if-eq v0, v4, :cond_4

    .line 73
    .line 74
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeTypeName(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    array-length v8, v7

    .line 82
    invoke-virtual {p1, v8}, Lcom/alibaba/fastjson2/JSONWriter;->startArray(I)V

    .line 83
    .line 84
    .line 85
    move v9, v2

    .line 86
    move-object v0, v3

    .line 87
    move v2, v11

    .line 88
    :goto_1
    if-ge v9, v8, :cond_a

    .line 89
    .line 90
    move v4, v2

    .line 91
    aget-object v2, v7, v9

    .line 92
    .line 93
    if-nez v2, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 96
    .line 97
    .line 98
    move v2, v4

    .line 99
    goto :goto_4

    .line 100
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    if-eq v5, v3, :cond_7

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-virtual {p0, p1, v5}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->getItemWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    if-eqz v0, :cond_6

    .line 115
    .line 116
    invoke-static {v5}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    xor-int/2addr v0, v10

    .line 121
    :cond_6
    move v12, v0

    .line 122
    move-object v0, v3

    .line 123
    move-object v13, v5

    .line 124
    goto :goto_2

    .line 125
    :cond_7
    move-object v13, v3

    .line 126
    move v12, v4

    .line 127
    :goto_2
    if-eqz v12, :cond_8

    .line 128
    .line 129
    invoke-virtual {p1, v9, v2}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(ILjava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    if-eqz v3, :cond_8

    .line 134
    .line 135
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->itemType:Ljava/lang/reflect/Type;

    .line 147
    .line 148
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 149
    .line 150
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 151
    .line 152
    .line 153
    if-eqz v12, :cond_9

    .line 154
    .line 155
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_9
    :goto_3
    move v2, v12

    .line 159
    move-object v3, v13

    .line 160
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_a
    if-eqz v11, :cond_b

    .line 164
    .line 165
    invoke-virtual {p1, v7}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    :cond_b
    :goto_5
    return-void

    .line 169
    :cond_c
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->startArray()V

    .line 170
    .line 171
    .line 172
    move v8, v2

    .line 173
    move-object v0, v3

    .line 174
    :goto_6
    array-length v2, v7

    .line 175
    if-ge v8, v2, :cond_10

    .line 176
    .line 177
    if-eqz v8, :cond_d

    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeComma()V

    .line 180
    .line 181
    .line 182
    :cond_d
    aget-object v2, v7, v8

    .line 183
    .line 184
    if-nez v2, :cond_e

    .line 185
    .line 186
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 187
    .line 188
    .line 189
    goto :goto_8

    .line 190
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    if-ne v4, v3, :cond_f

    .line 195
    .line 196
    move-object v9, v3

    .line 197
    goto :goto_7

    .line 198
    :cond_f
    invoke-virtual {p0, p1, v4}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->getItemWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    move-object v9, v4

    .line 203
    :goto_7
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 208
    .line 209
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 210
    .line 211
    .line 212
    move-object v3, v9

    .line 213
    :goto_8
    add-int/lit8 v8, v8, 0x1

    .line 214
    .line 215
    move-object v1, p1

    .line 216
    goto :goto_6

    .line 217
    :cond_10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->endArray()V

    .line 218
    .line 219
    .line 220
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
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, v0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectArrayField;->writeArray(Lcom/alibaba/fastjson2/JSONWriter;Z[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
