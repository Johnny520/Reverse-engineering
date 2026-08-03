.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCalendar;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 10

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
    check-cast p2, Ljava/util/Calendar;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 16
    .line 17
    if-nez p2, :cond_9

    .line 18
    .line 19
    iget-object p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 20
    .line 21
    if-nez p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_1
    iget-object p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 32
    .line 33
    if-nez p2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    invoke-static {p4, p2}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 58
    .line 59
    .line 60
    move-result-object p4

    .line 61
    invoke-virtual {p4}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getYear()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-ltz v1, :cond_6

    .line 70
    .line 71
    const/16 p4, 0x270f

    .line 72
    .line 73
    if-gt v1, p4, :cond_6

    .line 74
    .line 75
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 76
    .line 77
    const v7, 0xf4240

    .line 78
    .line 79
    .line 80
    if-nez p4, :cond_3

    .line 81
    .line 82
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 83
    .line 84
    .line 85
    move-result p4

    .line 86
    if-eqz p4, :cond_3

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getNano()I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    div-int v7, p2, v7

    .line 113
    .line 114
    const/4 v9, 0x1

    .line 115
    move-object v0, p1

    .line 116
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_3
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 121
    .line 122
    if-nez p4, :cond_4

    .line 123
    .line 124
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormat()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p4

    .line 128
    :cond_4
    if-nez p4, :cond_6

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getNano()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    if-nez p2, :cond_5

    .line 155
    .line 156
    move-object v0, p1

    .line 157
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_5
    div-int v7, p2, v7

    .line 162
    .line 163
    const/4 v9, 0x0

    .line 164
    move-object v0, p1

    .line 165
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 170
    .line 171
    if-eqz v0, :cond_7

    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 174
    .line 175
    .line 176
    move-result-object p3

    .line 177
    goto :goto_0

    .line 178
    :cond_7
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 179
    .line 180
    .line 181
    move-result-object p3

    .line 182
    :goto_0
    if-nez p3, :cond_8

    .line 183
    .line 184
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeZonedDateTime(Ljava/time/ZonedDateTime;)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_8
    invoke-virtual {p3, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_9
    :goto_1
    const-wide/16 p2, 0x3e8

    .line 197
    .line 198
    div-long/2addr v0, p2

    .line 199
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

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
    check-cast p2, Ljava/util/Calendar;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeMillis(J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
