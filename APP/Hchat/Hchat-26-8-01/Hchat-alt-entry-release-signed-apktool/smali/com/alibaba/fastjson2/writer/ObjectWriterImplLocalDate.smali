.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 7

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
    check-cast p2, Ljava/time/LocalDate;

    .line 10
    .line 11
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 12
    .line 13
    if-nez p4, :cond_1

    .line 14
    .line 15
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 16
    .line 17
    if-nez p4, :cond_2

    .line 18
    .line 19
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    :cond_1
    move-object v0, p1

    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_2
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 29
    .line 30
    if-nez p4, :cond_3

    .line 31
    .line 32
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 33
    .line 34
    if-nez p4, :cond_4

    .line 35
    .line 36
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    if-eqz p4, :cond_4

    .line 41
    .line 42
    :cond_3
    move-object v0, p1

    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_4
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd8:Z

    .line 46
    .line 47
    if-eqz p4, :cond_5

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 54
    .line 55
    .line 56
    move-result p4

    .line 57
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {p1, p3, p4, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD8(III)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_5
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd10:Z

    .line 66
    .line 67
    if-eqz p4, :cond_6

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 78
    .line 79
    .line 80
    move-result p2

    .line 81
    invoke-virtual {p1, p3, p4, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD10(III)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_6
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 86
    .line 87
    if-eqz p4, :cond_7

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    const/4 v5, 0x0

    .line 102
    const/4 v6, 0x0

    .line 103
    const/4 v4, 0x0

    .line 104
    move-object v0, p1

    .line 105
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_7
    move-object v0, p1

    .line 110
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    if-nez p1, :cond_8

    .line 115
    .line 116
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :cond_8
    if-nez p1, :cond_9

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 127
    .line 128
    .line 129
    move-result p3

    .line 130
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    invoke-virtual {v0, p1, p3, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD10(III)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_9
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasHour:Z

    .line 139
    .line 140
    if-nez p4, :cond_b

    .line 141
    .line 142
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatHasHour()Z

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    if-eqz p3, :cond_a

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_a
    invoke-virtual {p1, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    goto :goto_1

    .line 154
    :cond_b
    :goto_0
    sget-object p3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 155
    .line 156
    invoke-static {p2, p3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p1, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    :goto_1
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :goto_2
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 169
    .line 170
    invoke-static {p2, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    invoke-virtual {p1, p2}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-interface {p1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    .line 187
    .line 188
    .line 189
    move-result-wide p1

    .line 190
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :goto_3
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 195
    .line 196
    invoke-static {p2, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p1, p2}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-interface {p1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    .line 213
    .line 214
    .line 215
    move-result-wide p1

    .line 216
    const-wide/16 p3, 0x3e8

    .line 217
    .line 218
    div-long/2addr p1, p3

    .line 219
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 220
    .line 221
    .line 222
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    check-cast p2, Ljava/time/LocalDate;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeLocalDate(Ljava/time/LocalDate;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
