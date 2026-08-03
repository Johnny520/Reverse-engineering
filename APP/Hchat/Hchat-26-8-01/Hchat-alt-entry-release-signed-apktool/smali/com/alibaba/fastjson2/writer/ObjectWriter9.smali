.class public Lcom/alibaba/fastjson2/writer/ObjectWriter9;
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

.field public final fieldWriter3:Lcom/alibaba/fastjson2/writer/FieldWriter;

.field public final fieldWriter4:Lcom/alibaba/fastjson2/writer/FieldWriter;

.field public final fieldWriter5:Lcom/alibaba/fastjson2/writer/FieldWriter;

.field public final fieldWriter6:Lcom/alibaba/fastjson2/writer/FieldWriter;

.field public final fieldWriter7:Lcom/alibaba/fastjson2/writer/FieldWriter;

.field public final fieldWriter8:Lcom/alibaba/fastjson2/writer/FieldWriter;


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
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

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
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter1:Lcom/alibaba/fastjson2/writer/FieldWriter;

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
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter2:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 31
    .line 32
    const/4 p2, 0x3

    .line 33
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 38
    .line 39
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter3:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 40
    .line 41
    const/4 p2, 0x4

    .line 42
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 47
    .line 48
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter4:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 49
    .line 50
    const/4 p2, 0x5

    .line 51
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 56
    .line 57
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter5:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 58
    .line 59
    const/4 p2, 0x6

    .line 60
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 65
    .line 66
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter6:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 67
    .line 68
    const/4 p2, 0x7

    .line 69
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 74
    .line 75
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter7:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 76
    .line 77
    const/16 p2, 0x8

    .line 78
    .line 79
    invoke-interface {p6, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 84
    .line 85
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter8:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final getFieldWriter(J)Lcom/alibaba/fastjson2/writer/FieldWriter;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter1:Lcom/alibaba/fastjson2/writer/FieldWriter;

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
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter2:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 20
    .line 21
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 22
    .line 23
    cmp-long v1, p1, v1

    .line 24
    .line 25
    if-nez v1, :cond_2

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter3:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 29
    .line 30
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 31
    .line 32
    cmp-long v1, p1, v1

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter4:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 38
    .line 39
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 40
    .line 41
    cmp-long v1, p1, v1

    .line 42
    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter5:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 47
    .line 48
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 49
    .line 50
    cmp-long v1, p1, v1

    .line 51
    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter6:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 56
    .line 57
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 58
    .line 59
    cmp-long v1, p1, v1

    .line 60
    .line 61
    if-nez v1, :cond_6

    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter7:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 65
    .line 66
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 67
    .line 68
    cmp-long v1, p1, v1

    .line 69
    .line 70
    if-nez v1, :cond_7

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_7
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter8:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 74
    .line 75
    iget-wide v1, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->hashCode:J

    .line 76
    .line 77
    cmp-long p1, p1, v1

    .line 78
    .line 79
    if-nez p1, :cond_8

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_8
    const/4 p1, 0x0

    .line 83
    return-object p1
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 12

    .line 1
    move-wide/from16 v0, p5

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 4
    .line 5
    or-long/2addr v2, v0

    .line 6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 7
    .line 8
    .line 9
    move-result-wide v4

    .line 10
    or-long/2addr v2, v4

    .line 11
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 12
    .line 13
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 14
    .line 15
    and-long/2addr v4, v2

    .line 16
    const-wide/16 v6, 0x0

    .line 17
    .line 18
    cmp-long v4, v4, v6

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v4, 0x0

    .line 25
    :goto_0
    iget-boolean v5, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    if-eqz v4, :cond_1

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
    if-eqz v4, :cond_3

    .line 40
    .line 41
    iget-wide v2, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 42
    .line 43
    or-long v9, v0, v2

    .line 44
    .line 45
    move-object v4, p0

    .line 46
    move-object v5, p1

    .line 47
    move-object v6, p2

    .line 48
    move-object v7, p3

    .line 49
    move-object/from16 v8, p4

    .line 50
    .line 51
    invoke-interface/range {v4 .. v10}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMapping(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    iget-boolean v5, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->serializable:Z

    .line 56
    .line 57
    if-nez v5, :cond_5

    .line 58
    .line 59
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 60
    .line 61
    iget-wide v8, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 62
    .line 63
    and-long/2addr v8, v2

    .line 64
    cmp-long v5, v8, v6

    .line 65
    .line 66
    if-eqz v5, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->errorOnNoneSerializable()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 73
    .line 74
    iget-wide v8, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 75
    .line 76
    and-long/2addr v2, v8

    .line 77
    cmp-long v2, v2, v6

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_5
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->hasFilter(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_6

    .line 90
    .line 91
    const-wide/16 v5, 0x0

    .line 92
    .line 93
    move-object v0, p0

    .line 94
    move-object v1, p1

    .line 95
    move-object v2, p2

    .line 96
    move-object v3, p3

    .line 97
    move-object/from16 v4, p4

    .line 98
    .line 99
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeWithFilter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_6
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->startObject()V

    .line 104
    .line 105
    .line 106
    iget-wide v8, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->features:J

    .line 107
    .line 108
    or-long/2addr v8, v0

    .line 109
    sget-object p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 110
    .line 111
    iget-wide v10, p3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 112
    .line 113
    and-long/2addr v8, v10

    .line 114
    cmp-long p3, v8, v6

    .line 115
    .line 116
    if-nez p3, :cond_7

    .line 117
    .line 118
    invoke-virtual {p1, p2, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->isWriteTypeInfo(Ljava/lang/Object;J)Z

    .line 119
    .line 120
    .line 121
    move-result p3

    .line 122
    if-eqz p3, :cond_8

    .line 123
    .line 124
    :cond_7
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->writeTypeInfo(Lcom/alibaba/fastjson2/JSONWriter;)Z

    .line 125
    .line 126
    .line 127
    :cond_8
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter0:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 128
    .line 129
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter1:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 133
    .line 134
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter2:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 138
    .line 139
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter3:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 143
    .line 144
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter4:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 148
    .line 149
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter5:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 153
    .line 154
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter6:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 158
    .line 159
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter7:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 163
    .line 164
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriter9;->fieldWriter8:Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 168
    .line 169
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->endObject()V

    .line 173
    .line 174
    .line 175
    return-void
.end method
