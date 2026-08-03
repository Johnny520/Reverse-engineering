.class abstract Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;
.super Lcom/alibaba/fastjson2/writer/FieldWriterObject;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/writer/FieldWriterObject<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final fieldClass:Ljava/lang/Class;

.field final fieldType:Ljava/lang/reflect/Type;

.field volatile objectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

.field final refDetect:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iput-object p7, p1, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldType:Ljava/lang/reflect/Type;

    .line 6
    .line 7
    iput-object p8, p1, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldClass:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {p8}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    xor-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    iput-boolean p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->refDetect:Z

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldClass:Ljava/lang/Class;

    .line 2
    .line 3
    if-eq v0, p2, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->objectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->objectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->objectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 22
    .line 23
    return-object p1
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "TT;)Z"
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    const/4 p2, 0x1

    .line 7
    if-nez v4, :cond_4

    .line 8
    .line 9
    iget-wide v2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    or-long/2addr v2, v4

    .line 16
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 17
    .line 18
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 19
    .line 20
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 21
    .line 22
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 23
    .line 24
    or-long/2addr v4, v6

    .line 25
    and-long/2addr v2, v4

    .line 26
    const-wide/16 v4, 0x0

    .line 27
    .line 28
    cmp-long v0, v2, v4

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    return v1

    .line 33
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldClass:Ljava/lang/Class;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldClass:Ljava/lang/Class;

    .line 49
    .line 50
    const-class v1, Ljava/lang/StringBuffer;

    .line 51
    .line 52
    if-eq v0, v1, :cond_3

    .line 53
    .line 54
    const-class v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    if-ne v0, v1, :cond_2

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeObjectNull(Ljava/lang/Class;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    .line 64
    .line 65
    .line 66
    :goto_1
    return p2

    .line 67
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldClass:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->unwrapped:Z

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 78
    .line 79
    iget-boolean v7, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->refDetect:Z

    .line 80
    .line 81
    move-object v3, p1

    .line 82
    move-object v8, v2

    .line 83
    move-object v2, p0

    .line 84
    invoke-virtual/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->writeWithUnwrapped(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;JZLcom/alibaba/fastjson2/writer/ObjectWriter;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    move-object v9, v2

    .line 89
    move-object v2, v8

    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    return p2

    .line 93
    :cond_5
    move-object v9, p0

    .line 94
    move-object v3, p1

    .line 95
    :cond_6
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 96
    .line 97
    .line 98
    iget-boolean p1, v3, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 99
    .line 100
    iget-object v5, v9, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 101
    .line 102
    if-eqz p1, :cond_7

    .line 103
    .line 104
    iget-object v6, v9, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldType:Ljava/lang/reflect/Type;

    .line 105
    .line 106
    iget-wide v7, v9, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 107
    .line 108
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_7
    iget-object v6, v9, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldType:Ljava/lang/reflect/Type;

    .line 113
    .line 114
    iget-wide v7, v9, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 115
    .line 116
    invoke-interface/range {v2 .. v8}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 117
    .line 118
    .line 119
    :goto_2
    return p2

    .line 120
    :catch_0
    move-exception v0

    .line 121
    move-object v9, p0

    .line 122
    move-object v3, p1

    .line 123
    move-object p1, v0

    .line 124
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONWriter;->isIgnoreErrorGetter()Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_8

    .line 129
    .line 130
    return v1

    .line 131
    :cond_8
    throw p1
.end method

.method public writeValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V
    .locals 10
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
    move-result-object v2

    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->refDetect:Z

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move v7, v3

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v7, v1

    .line 26
    :goto_0
    if-eqz v7, :cond_3

    .line 27
    .line 28
    if-ne v2, p2, :cond_2

    .line 29
    .line 30
    const-string p2, ".."

    .line 31
    .line 32
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {p1, p2, v2}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldClass:Ljava/lang/Class;

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget-wide v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 58
    .line 59
    invoke-virtual {p1, v4, v5}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v4

    .line 63
    sget-object p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 64
    .line 65
    iget-wide v8, p2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 66
    .line 67
    and-long/2addr v4, v8

    .line 68
    const-wide/16 v8, 0x0

    .line 69
    .line 70
    cmp-long p2, v4, v8

    .line 71
    .line 72
    if-eqz p2, :cond_4

    .line 73
    .line 74
    move v1, v3

    .line 75
    :cond_4
    iget-boolean p2, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 76
    .line 77
    if-eqz p2, :cond_6

    .line 78
    .line 79
    iget-object v3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldType:Ljava/lang/reflect/Type;

    .line 84
    .line 85
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 86
    .line 87
    move-object v1, p1

    .line 88
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    move-object v1, p1

    .line 93
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldType:Ljava/lang/reflect/Type;

    .line 94
    .line 95
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 96
    .line 97
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_6
    iget-object v3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 102
    .line 103
    if-eqz v1, :cond_7

    .line 104
    .line 105
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldType:Ljava/lang/reflect/Type;

    .line 106
    .line 107
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 108
    .line 109
    move-object v1, p1

    .line 110
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMapping(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_7
    move-object v1, p1

    .line 115
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObjectFinal;->fieldType:Ljava/lang/reflect/Type;

    .line 116
    .line 117
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 118
    .line 119
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 120
    .line 121
    .line 122
    :goto_1
    if-eqz v7, :cond_8

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_8
    return-void
.end method
