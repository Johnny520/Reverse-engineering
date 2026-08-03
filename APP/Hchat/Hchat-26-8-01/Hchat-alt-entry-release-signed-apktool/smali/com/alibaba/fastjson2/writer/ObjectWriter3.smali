.class public Lcom/alibaba/fastjson2/writer/ObjectWriter3;
.super Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

.field public final fieldWriter1:Lcom/alibaba/fastjson2/writer/FieldWriter;

.field public final fieldWriter2:Lcom/alibaba/fastjson2/writer/FieldWriter;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/writer/FieldWriter;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 11
    .line 12
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 13
    .line 14
    const/4 p2, 0x1

    .line 15
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 20
    .line 21
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter1:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 22
    .line 23
    const/4 p2, 0x2

    .line 24
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 29
    .line 30
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter2:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final getFieldWriter(J)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 4
    .line 5
    cmp-long v1, p1, v1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter1:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 11
    .line 12
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 13
    .line 14
    cmp-long v1, p1, v1

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter2:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 20
    .line 21
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 22
    .line 23
    cmp-long p1, p1, v1

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    const/4 p1, 0x0

    .line 29
    return-object p1
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 12

    .line 1
    move-wide/from16 v2, p5

    .line 2
    .line 3
    iget-wide v4, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 4
    .line 5
    or-long/2addr v4, v2

    .line 6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 7
    .line 8
    .line 9
    move-result-wide v6

    .line 10
    or-long/2addr v4, v6

    .line 11
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v6, v4

    .line 16
    const-wide/16 v8, 0x0

    .line 17
    .line 18
    cmp-long v6, v6, v8

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    const/4 v6, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v6, 0x0

    .line 25
    :goto_0
    iget-boolean v7, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 26
    .line 27
    if-eqz v7, :cond_2

    .line 28
    .line 29
    if-eqz v6, :cond_1

    .line 30
    .line 31
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    if-eqz v6, :cond_3

    .line 40
    .line 41
    invoke-interface/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMapping(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    iget-boolean v6, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->serializable:Z

    .line 46
    .line 47
    if-nez v6, :cond_5

    .line 48
    .line 49
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 50
    .line 51
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 52
    .line 53
    and-long/2addr v6, v4

    .line 54
    cmp-long v6, v6, v8

    .line 55
    .line 56
    if-eqz v6, :cond_4

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->errorOnNoneSerializable()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 63
    .line 64
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 65
    .line 66
    and-long/2addr v4, v6

    .line 67
    cmp-long v4, v4, v8

    .line 68
    .line 69
    if-eqz v4, :cond_5

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_5
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_6

    .line 80
    .line 81
    const-wide/16 v5, 0x0

    .line 82
    .line 83
    move-object v0, p0

    .line 84
    move-object v1, p1

    .line 85
    move-object v2, p2

    .line 86
    move-object v3, p3

    .line 87
    move-object/from16 v4, p4

    .line 88
    .line 89
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeWithFilter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 94
    .line 95
    .line 96
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 97
    .line 98
    or-long/2addr v5, v2

    .line 99
    sget-object v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 100
    .line 101
    iget-wide v10, v7, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 102
    .line 103
    and-long/2addr v5, v10

    .line 104
    cmp-long v5, v5, v8

    .line 105
    .line 106
    if-nez v5, :cond_7

    .line 107
    .line 108
    invoke-virtual {p1, p2, v2, v3}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;J)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_8

    .line 113
    .line 114
    :cond_7
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeTypeInfo(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 115
    .line 116
    .line 117
    :cond_8
    iget-object v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 118
    .line 119
    invoke-virtual {v2, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    iget-object v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter1:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 123
    .line 124
    invoke-virtual {v2, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    iget-object v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter3;->fieldWriter2:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 128
    .line 129
    invoke-virtual {v2, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 133
    .line 134
    .line 135
    return-void
.end method
