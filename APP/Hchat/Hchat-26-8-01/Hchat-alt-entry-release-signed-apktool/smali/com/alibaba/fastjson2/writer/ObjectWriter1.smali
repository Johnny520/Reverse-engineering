.class public Lcom/alibaba/fastjson2/writer/ObjectWriter1;
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
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter1;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final getFieldWriter(J)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter1;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 4
    .line 5
    cmp-long p1, p1, v1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return-object p1
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 8

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 2
    .line 3
    or-long/2addr v0, p5

    .line 4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 5
    .line 6
    .line 7
    move-result-wide v2

    .line 8
    or-long/2addr v0, v2

    .line 9
    iget-boolean v2, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 10
    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 16
    .line 17
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 18
    .line 19
    and-long/2addr v0, v5

    .line 20
    cmp-long v0, v0, v3

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 33
    .line 34
    iget-wide v5, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 35
    .line 36
    and-long/2addr v5, v0

    .line 37
    cmp-long v2, v5, v3

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    invoke-interface/range {p0 .. p6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMapping(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 42
    .line 43
    .line 44
    move-object p1, p0

    .line 45
    return-void

    .line 46
    :cond_2
    move-object v2, p1

    .line 47
    move-object p1, p0

    .line 48
    iget-boolean v5, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->serializable:Z

    .line 49
    .line 50
    if-nez v5, :cond_4

    .line 51
    .line 52
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 53
    .line 54
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 55
    .line 56
    and-long/2addr v5, v0

    .line 57
    cmp-long v5, v5, v3

    .line 58
    .line 59
    if-eqz v5, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->errorOnNoneSerializable()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 66
    .line 67
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 68
    .line 69
    and-long/2addr v0, v5

    .line 70
    cmp-long v0, v0, v3

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    const-wide/16 v6, 0x0

    .line 85
    .line 86
    move-object v1, p1

    .line 87
    move-object v3, p2

    .line 88
    move-object v4, p3

    .line 89
    move-object v5, p4

    .line 90
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeWithFilter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 95
    .line 96
    .line 97
    iget-wide p3, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 98
    .line 99
    or-long/2addr p3, p5

    .line 100
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 101
    .line 102
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 103
    .line 104
    and-long/2addr p3, v0

    .line 105
    cmp-long p3, p3, v3

    .line 106
    .line 107
    if-nez p3, :cond_6

    .line 108
    .line 109
    invoke-virtual {v2, p2, p5, p6}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;J)Z

    .line 110
    .line 111
    .line 112
    move-result p3

    .line 113
    if-eqz p3, :cond_7

    .line 114
    .line 115
    :cond_6
    invoke-virtual {p0, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeTypeInfo(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 116
    .line 117
    .line 118
    :cond_7
    iget-object p3, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter1;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 119
    .line 120
    invoke-virtual {p3, v2, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 124
    .line 125
    .line 126
    return-void
.end method
