.class public final Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampWriter;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/util/JdbcSupport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TimestampWriter"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 11

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p3, p1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 8
    .line 9
    check-cast p2, Ljava/sql/Timestamp;

    .line 10
    .line 11
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 12
    .line 13
    if-nez p4, :cond_9

    .line 14
    .line 15
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    if-eqz p4, :cond_1

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_1
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-virtual {p2}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, p4}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 44
    .line 45
    const v1, 0xf4240

    .line 46
    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    :cond_2
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getNano()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    rem-int/2addr v0, v1

    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getYear()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getHour()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getNano()I

    .line 88
    .line 89
    .line 90
    move-result p2

    .line 91
    div-int v8, p2, v1

    .line 92
    .line 93
    const/4 v10, 0x1

    .line 94
    move-object v1, p1

    .line 95
    invoke-virtual/range {v1 .. v10}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-nez v0, :cond_4

    .line 104
    .line 105
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    :cond_4
    if-nez v0, :cond_8

    .line 110
    .line 111
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 112
    .line 113
    if-nez v0, :cond_7

    .line 114
    .line 115
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 116
    .line 117
    .line 118
    move-result p3

    .line 119
    if-eqz p3, :cond_5

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_5
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getNanos()I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getYear()I

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 135
    .line 136
    .line 137
    move-result v4

    .line 138
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getHour()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    rem-int p3, p2, v1

    .line 151
    .line 152
    if-nez p3, :cond_6

    .line 153
    .line 154
    div-int v8, p2, v1

    .line 155
    .line 156
    const/4 v10, 0x0

    .line 157
    move-object v1, p1

    .line 158
    invoke-virtual/range {v1 .. v10}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_6
    invoke-virtual {p4}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeLocalDateTime(Ljava/time/LocalDateTime;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_7
    :goto_0
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getTime()J

    .line 171
    .line 172
    .line 173
    move-result-wide p2

    .line 174
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_8
    invoke-virtual {v0, p4}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_9
    :goto_1
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getTime()J

    .line 187
    .line 188
    .line 189
    move-result-wide p2

    .line 190
    const-wide/16 v2, 0x3e8

    .line 191
    .line 192
    div-long/2addr p2, v2

    .line 193
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 194
    .line 195
    .line 196
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 2

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimestampWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    check-cast p2, Ljava/sql/Timestamp;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide p3

    .line 21
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getNanos()I

    .line 22
    .line 23
    .line 24
    move-result p5

    .line 25
    invoke-virtual {p2}, Ljava/sql/Timestamp;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 26
    .line 27
    .line 28
    const-wide/16 v0, 0x3e8

    .line 29
    .line 30
    div-long/2addr p3, v0

    .line 31
    invoke-virtual {p1, p3, p4, p5}, Lcom/alibaba/fastjson2/JSONWriter;->writeInstant(JI)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
