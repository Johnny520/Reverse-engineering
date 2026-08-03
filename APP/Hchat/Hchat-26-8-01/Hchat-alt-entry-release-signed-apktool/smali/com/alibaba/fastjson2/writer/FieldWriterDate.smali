.class abstract Lcom/alibaba/fastjson2/writer/FieldWriterDate;
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
.field protected dateWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

.field final formatISO8601:Z

.field final formatMillis:Z

.field final formatUnixTime:Z

.field protected formatter:Ljava/time/format/DateTimeFormatter;

.field final formatyyyyMMdd8:Z

.field final formatyyyyMMddhhmmss14:Z

.field final formatyyyyMMddhhmmss19:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/alibaba/fastjson2/writer/FieldWriter;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p5, :cond_6

    .line 7
    .line 8
    invoke-virtual {p5}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    const/4 p4, 0x1

    .line 13
    const/4 p6, -0x1

    .line 14
    sparse-switch p3, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :sswitch_0
    const-string p3, "iso8601"

    .line 19
    .line 20
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    if-nez p3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p6, 0x5

    .line 28
    goto :goto_0

    .line 29
    :sswitch_1
    const-string p3, "yyyyMMddHHmmss"

    .line 30
    .line 31
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-nez p3, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 p6, 0x4

    .line 39
    goto :goto_0

    .line 40
    :sswitch_2
    const-string p3, "yyyy-MM-dd HH:mm:ss"

    .line 41
    .line 42
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    if-nez p3, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 p6, 0x3

    .line 50
    goto :goto_0

    .line 51
    :sswitch_3
    const-string p3, "yyyyMMdd"

    .line 52
    .line 53
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-nez p3, :cond_3

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 p6, 0x2

    .line 61
    goto :goto_0

    .line 62
    :sswitch_4
    const-string p3, "unixtime"

    .line 63
    .line 64
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p3

    .line 68
    if-nez p3, :cond_4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    move p6, p4

    .line 72
    goto :goto_0

    .line 73
    :sswitch_5
    const-string p3, "millis"

    .line 74
    .line 75
    invoke-virtual {p5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result p3

    .line 79
    if-nez p3, :cond_5

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    move p6, p2

    .line 83
    :goto_0
    packed-switch p6, :pswitch_data_0

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :pswitch_0
    move p3, p2

    .line 88
    move p5, p3

    .line 89
    :goto_1
    move p6, p5

    .line 90
    move p7, p6

    .line 91
    goto :goto_4

    .line 92
    :pswitch_1
    move p3, p2

    .line 93
    move p5, p3

    .line 94
    move p7, p5

    .line 95
    move p6, p4

    .line 96
    :goto_2
    move p4, p7

    .line 97
    goto :goto_4

    .line 98
    :pswitch_2
    move p3, p2

    .line 99
    move p5, p3

    .line 100
    move p6, p5

    .line 101
    move p7, p4

    .line 102
    move p4, p6

    .line 103
    goto :goto_4

    .line 104
    :pswitch_3
    move p3, p2

    .line 105
    move p6, p3

    .line 106
    move p7, p6

    .line 107
    move p5, p4

    .line 108
    goto :goto_2

    .line 109
    :pswitch_4
    move p5, p2

    .line 110
    move p6, p5

    .line 111
    move p7, p6

    .line 112
    move p3, p4

    .line 113
    goto :goto_2

    .line 114
    :pswitch_5
    move p3, p2

    .line 115
    move p5, p3

    .line 116
    move p6, p5

    .line 117
    move p7, p6

    .line 118
    move p2, p4

    .line 119
    goto :goto_2

    .line 120
    :cond_6
    :goto_3
    move p3, p2

    .line 121
    move p4, p3

    .line 122
    move p5, p4

    .line 123
    goto :goto_1

    .line 124
    :goto_4
    iput-boolean p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatMillis:Z

    .line 125
    .line 126
    iput-boolean p4, p1, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatISO8601:Z

    .line 127
    .line 128
    iput-boolean p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatUnixTime:Z

    .line 129
    .line 130
    iput-boolean p5, p1, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatyyyyMMdd8:Z

    .line 131
    .line 132
    iput-boolean p6, p1, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatyyyyMMddhhmmss14:Z

    .line 133
    .line 134
    iput-boolean p7, p1, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatyyyyMMddhhmmss19:Z

    .line 135
    .line 136
    return-void

    .line 137
    :sswitch_data_0
    .sparse-switch
        -0x400565ba -> :sswitch_5
        -0x112ad7ab -> :sswitch_4
        -0x10781ba0 -> :sswitch_3
        0x4f76f1a0 -> :sswitch_2
        0x5069d960 -> :sswitch_1
        0x7ce21384 -> :sswitch_0
    .end sparse-switch

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public getFormatter()Ljava/time/format/DateTimeFormatter;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatter:Ljava/time/format/DateTimeFormatter;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatMillis:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatISO8601:Z

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatUnixTime:Z

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatter:Ljava/time/format/DateTimeFormatter;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatter:Ljava/time/format/DateTimeFormatter;

    .line 28
    .line 29
    return-object v0
.end method

.method public getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p2, v0, :cond_3

    .line 4
    .line 5
    iget-object p1, p1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->dateWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 10
    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    iget-wide v0, p1, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->userDefineMask:J

    .line 14
    .line 15
    const-wide/16 v2, 0x10

    .line 16
    .line 17
    and-long/2addr v0, v2

    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    cmp-long v0, v0, v2

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-virtual {p1, p2, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->dateWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    sget-object p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 37
    .line 38
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->dateWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    new-instance p1, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;

    .line 42
    .line 43
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->dateWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->dateWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    return-object p1
.end method

.method public isDateFormatISO8601()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatISO8601:Z

    .line 2
    .line 3
    return v0
.end method

.method public isDateFormatMillis()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatMillis:Z

    .line 2
    .line 3
    return v0
.end method

.method public writeDate(Lcom/alibaba/fastjson2/JSONWriter;J)V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v4, v1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeMillis(J)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v4, v1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 19
    .line 20
    iget-boolean v5, v0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatUnixTime:Z

    .line 21
    .line 22
    const-wide/16 v6, 0x3e8

    .line 23
    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 27
    .line 28
    if-nez v5, :cond_2

    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    :cond_1
    move-wide v11, v2

    .line 37
    move-object v2, v1

    .line 38
    goto/16 :goto_d

    .line 39
    .line 40
    :cond_2
    iget-boolean v5, v0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatMillis:Z

    .line 41
    .line 42
    if-nez v5, :cond_3

    .line 43
    .line 44
    iget-object v5, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 45
    .line 46
    if-nez v5, :cond_4

    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_3

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_0
    move-wide v11, v2

    .line 56
    move-object v2, v1

    .line 57
    goto/16 :goto_c

    .line 58
    .line 59
    :cond_4
    :goto_1
    iget-wide v8, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 60
    .line 61
    invoke-virtual {v1, v8, v9}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v8

    .line 65
    sget-object v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriterUtilDateAsMillis:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 66
    .line 67
    iget-wide v10, v5, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 68
    .line 69
    and-long/2addr v8, v10

    .line 70
    const-wide/16 v10, 0x0

    .line 71
    .line 72
    cmp-long v5, v8, v10

    .line 73
    .line 74
    if-eqz v5, :cond_5

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    iget-object v8, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 82
    .line 83
    if-eqz v8, :cond_6

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_6
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormat()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    :goto_2
    iget-boolean v9, v0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatyyyyMMddhhmmss19:Z

    .line 91
    .line 92
    const/4 v12, 0x1

    .line 93
    if-nez v9, :cond_8

    .line 94
    .line 95
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isFormatyyyyMMddhhmmss19()Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_7

    .line 100
    .line 101
    iget-object v9, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 102
    .line 103
    if-nez v9, :cond_7

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_7
    const/4 v9, 0x0

    .line 107
    goto :goto_4

    .line 108
    :cond_8
    :goto_3
    move v9, v12

    .line 109
    :goto_4
    const/16 v13, 0x270f

    .line 110
    .line 111
    if-eqz v8, :cond_a

    .line 112
    .line 113
    iget-boolean v8, v0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatyyyyMMddhhmmss14:Z

    .line 114
    .line 115
    if-nez v8, :cond_a

    .line 116
    .line 117
    if-eqz v9, :cond_9

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    move-wide v11, v2

    .line 121
    goto/16 :goto_9

    .line 122
    .line 123
    :cond_a
    :goto_5
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 124
    .line 125
    .line 126
    move-result-wide v14

    .line 127
    sget-object v8, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_ID:Ljava/time/ZoneId;

    .line 128
    .line 129
    if-eq v5, v8, :cond_c

    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    move-wide/from16 v16, v10

    .line 136
    .line 137
    sget-object v10, Lcom/alibaba/fastjson2/util/DateUtils;->SHANGHAI_ZONE_RULES:Ljava/time/zone/ZoneRules;

    .line 138
    .line 139
    if-ne v8, v10, :cond_b

    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_b
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-virtual {v5}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-virtual {v10, v8}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    invoke-virtual {v8}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    goto :goto_7

    .line 159
    :cond_c
    move-wide/from16 v16, v10

    .line 160
    .line 161
    :goto_6
    invoke-static {v14, v15}, Lcom/alibaba/fastjson2/util/DateUtils;->getShanghaiZoneOffsetTotalSeconds(J)I

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    :goto_7
    int-to-long v10, v8

    .line 166
    add-long/2addr v14, v10

    .line 167
    const-wide/32 v10, 0x15180

    .line 168
    .line 169
    .line 170
    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 171
    .line 172
    .line 173
    move-result-wide v18

    .line 174
    invoke-static {v14, v15, v10, v11}, Ljava/lang/Math;->floorMod(JJ)J

    .line 175
    .line 176
    .line 177
    move-result-wide v10

    .line 178
    long-to-int v8, v10

    .line 179
    const-wide/32 v10, 0xafa6c

    .line 180
    .line 181
    .line 182
    add-long v10, v18, v10

    .line 183
    .line 184
    cmp-long v14, v10, v16

    .line 185
    .line 186
    const-wide/16 v20, 0x1

    .line 187
    .line 188
    const-wide/32 v22, 0x23ab1

    .line 189
    .line 190
    .line 191
    const-wide/16 v24, 0x190

    .line 192
    .line 193
    if-gez v14, :cond_d

    .line 194
    .line 195
    const-wide/32 v14, 0xafa6d

    .line 196
    .line 197
    .line 198
    add-long v18, v18, v14

    .line 199
    .line 200
    div-long v18, v18, v22

    .line 201
    .line 202
    sub-long v14, v18, v20

    .line 203
    .line 204
    mul-long v18, v14, v24

    .line 205
    .line 206
    neg-long v14, v14

    .line 207
    mul-long v14, v14, v22

    .line 208
    .line 209
    add-long/2addr v10, v14

    .line 210
    goto :goto_8

    .line 211
    :cond_d
    move-wide/from16 v18, v16

    .line 212
    .line 213
    :goto_8
    mul-long v14, v10, v24

    .line 214
    .line 215
    const-wide/16 v26, 0x24f

    .line 216
    .line 217
    add-long v14, v14, v26

    .line 218
    .line 219
    div-long v14, v14, v22

    .line 220
    .line 221
    const-wide/16 v22, 0x16d

    .line 222
    .line 223
    mul-long v26, v14, v22

    .line 224
    .line 225
    const-wide/16 v28, 0x4

    .line 226
    .line 227
    div-long v30, v14, v28

    .line 228
    .line 229
    add-long v30, v30, v26

    .line 230
    .line 231
    const-wide/16 v26, 0x64

    .line 232
    .line 233
    div-long v32, v14, v26

    .line 234
    .line 235
    sub-long v30, v30, v32

    .line 236
    .line 237
    div-long v32, v14, v24

    .line 238
    .line 239
    add-long v32, v32, v30

    .line 240
    .line 241
    sub-long v30, v10, v32

    .line 242
    .line 243
    cmp-long v32, v30, v16

    .line 244
    .line 245
    if-gez v32, :cond_e

    .line 246
    .line 247
    sub-long v14, v14, v20

    .line 248
    .line 249
    mul-long v22, v22, v14

    .line 250
    .line 251
    div-long v20, v14, v28

    .line 252
    .line 253
    add-long v20, v20, v22

    .line 254
    .line 255
    div-long v22, v14, v26

    .line 256
    .line 257
    sub-long v20, v20, v22

    .line 258
    .line 259
    div-long v22, v14, v24

    .line 260
    .line 261
    add-long v22, v22, v20

    .line 262
    .line 263
    sub-long v30, v10, v22

    .line 264
    .line 265
    :cond_e
    move-wide/from16 v10, v30

    .line 266
    .line 267
    add-long v14, v14, v18

    .line 268
    .line 269
    long-to-int v10, v10

    .line 270
    mul-int/lit8 v11, v10, 0x5

    .line 271
    .line 272
    add-int/lit8 v11, v11, 0x2

    .line 273
    .line 274
    div-int/lit16 v11, v11, 0x99

    .line 275
    .line 276
    add-int/lit8 v18, v11, 0x2

    .line 277
    .line 278
    rem-int/lit8 v18, v18, 0xc

    .line 279
    .line 280
    add-int/lit8 v18, v18, 0x1

    .line 281
    .line 282
    move/from16 v19, v12

    .line 283
    .line 284
    mul-int/lit16 v12, v11, 0x132

    .line 285
    .line 286
    add-int/lit8 v12, v12, 0x5

    .line 287
    .line 288
    div-int/lit8 v12, v12, 0xa

    .line 289
    .line 290
    sub-int/2addr v10, v12

    .line 291
    add-int/lit8 v10, v10, 0x1

    .line 292
    .line 293
    div-int/lit8 v11, v11, 0xa

    .line 294
    .line 295
    int-to-long v11, v11

    .line 296
    add-long/2addr v14, v11

    .line 297
    const-wide/32 v11, -0x3b9ac9ff

    .line 298
    .line 299
    .line 300
    cmp-long v11, v14, v11

    .line 301
    .line 302
    if-ltz v11, :cond_19

    .line 303
    .line 304
    const-wide/32 v11, 0x3b9ac9ff

    .line 305
    .line 306
    .line 307
    cmp-long v11, v14, v11

    .line 308
    .line 309
    if-gtz v11, :cond_19

    .line 310
    .line 311
    move-wide v11, v2

    .line 312
    long-to-int v2, v14

    .line 313
    int-to-long v14, v8

    .line 314
    cmp-long v3, v14, v16

    .line 315
    .line 316
    if-ltz v3, :cond_18

    .line 317
    .line 318
    const-wide/32 v16, 0x1517f

    .line 319
    .line 320
    .line 321
    cmp-long v3, v14, v16

    .line 322
    .line 323
    if-gtz v3, :cond_18

    .line 324
    .line 325
    const-wide/16 v16, 0xe10

    .line 326
    .line 327
    div-long v6, v14, v16

    .line 328
    .line 329
    long-to-int v3, v6

    .line 330
    mul-int/lit16 v6, v3, 0xe10

    .line 331
    .line 332
    int-to-long v6, v6

    .line 333
    sub-long/2addr v14, v6

    .line 334
    const-wide/16 v6, 0x3c

    .line 335
    .line 336
    div-long v6, v14, v6

    .line 337
    .line 338
    long-to-int v6, v6

    .line 339
    mul-int/lit8 v7, v6, 0x3c

    .line 340
    .line 341
    int-to-long v7, v7

    .line 342
    sub-long/2addr v14, v7

    .line 343
    long-to-int v7, v14

    .line 344
    if-ltz v2, :cond_12

    .line 345
    .line 346
    if-gt v2, v13, :cond_12

    .line 347
    .line 348
    iget-boolean v5, v0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatyyyyMMddhhmmss14:Z

    .line 349
    .line 350
    if-eqz v5, :cond_f

    .line 351
    .line 352
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 353
    .line 354
    .line 355
    move v5, v3

    .line 356
    move v4, v10

    .line 357
    move/from16 v3, v18

    .line 358
    .line 359
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime14(IIIIII)V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :cond_f
    move v5, v3

    .line 364
    move/from16 v3, v18

    .line 365
    .line 366
    if-eqz v9, :cond_10

    .line 367
    .line 368
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 369
    .line 370
    .line 371
    move-object/from16 v1, p1

    .line 372
    .line 373
    move v4, v10

    .line 374
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 375
    .line 376
    .line 377
    return-void

    .line 378
    :cond_10
    const-wide/16 v8, 0x3e8

    .line 379
    .line 380
    invoke-static {v11, v12, v8, v9}, Ljava/lang/Math;->floorMod(JJ)J

    .line 381
    .line 382
    .line 383
    move-result-wide v8

    .line 384
    long-to-int v8, v8

    .line 385
    if-eqz v8, :cond_11

    .line 386
    .line 387
    invoke-static {v11, v12}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    invoke-virtual {v4}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-virtual {v4, v1}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    invoke-virtual {v1}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 408
    .line 409
    .line 410
    move v4, v10

    .line 411
    const/4 v10, 0x0

    .line 412
    move-object/from16 v1, p1

    .line 413
    .line 414
    invoke-virtual/range {v1 .. v10}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :cond_11
    move v4, v10

    .line 419
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 420
    .line 421
    .line 422
    move-object/from16 v1, p1

    .line 423
    .line 424
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :cond_12
    :goto_9
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v11, v12}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    invoke-static {v1, v5}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatISO8601:Z

    .line 440
    .line 441
    if-nez v2, :cond_14

    .line 442
    .line 443
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    if-eqz v2, :cond_13

    .line 448
    .line 449
    iget-object v2, v0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 450
    .line 451
    if-nez v2, :cond_13

    .line 452
    .line 453
    goto :goto_a

    .line 454
    :cond_13
    move-object/from16 v2, p1

    .line 455
    .line 456
    goto :goto_b

    .line 457
    :cond_14
    :goto_a
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getYear()I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-ltz v2, :cond_13

    .line 462
    .line 463
    if-gt v2, v13, :cond_13

    .line 464
    .line 465
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 466
    .line 467
    .line 468
    move-result v3

    .line 469
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 470
    .line 471
    .line 472
    move-result v4

    .line 473
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getHour()I

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 482
    .line 483
    .line 484
    move-result v7

    .line 485
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getNano()I

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    const v9, 0xf4240

    .line 490
    .line 491
    .line 492
    div-int/2addr v8, v9

    .line 493
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    invoke-virtual {v1}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 498
    .line 499
    .line 500
    move-result v9

    .line 501
    const/4 v10, 0x1

    .line 502
    move-object/from16 v1, p1

    .line 503
    .line 504
    invoke-virtual/range {v1 .. v10}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :goto_b
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->formatyyyyMMdd8:Z

    .line 509
    .line 510
    if-eqz v3, :cond_15

    .line 511
    .line 512
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getYear()I

    .line 513
    .line 514
    .line 515
    move-result v3

    .line 516
    if-ltz v3, :cond_15

    .line 517
    .line 518
    if-gt v3, v13, :cond_15

    .line 519
    .line 520
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    invoke-virtual {v2, v3, v4, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD8(III)V

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    :cond_15
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/writer/FieldWriterDate;->getFormatter()Ljava/time/format/DateTimeFormatter;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    if-nez v3, :cond_16

    .line 537
    .line 538
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    :cond_16
    if-eqz v3, :cond_17

    .line 543
    .line 544
    invoke-virtual {v3, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    return-void

    .line 552
    :cond_17
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeZonedDateTime(Ljava/time/ZonedDateTime;)V

    .line 553
    .line 554
    .line 555
    return-void

    .line 556
    :cond_18
    new-instance v1, Ljava/time/DateTimeException;

    .line 557
    .line 558
    const-string v2, "Invalid secondOfDay "

    .line 559
    .line 560
    invoke-static {v14, v15, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-direct {v1, v2}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    throw v1

    .line 568
    :cond_19
    new-instance v1, Ljava/time/DateTimeException;

    .line 569
    .line 570
    const-string v2, "Invalid year "

    .line 571
    .line 572
    invoke-static {v14, v15, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    invoke-direct {v1, v2}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    throw v1

    .line 580
    :goto_c
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {p1 .. p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 584
    .line 585
    .line 586
    return-void

    .line 587
    :goto_d
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 588
    .line 589
    .line 590
    const-wide/16 v19, 0x3e8

    .line 591
    .line 592
    div-long v3, v11, v19

    .line 593
    .line 594
    invoke-virtual {v2, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 595
    .line 596
    .line 597
    return-void
.end method
