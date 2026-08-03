.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;

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

.method public static of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplOffsetDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 9
    .line 10
    .line 11
    return-object v0
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
    check-cast p2, Ljava/time/OffsetDateTime;

    .line 10
    .line 11
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 12
    .line 13
    if-nez p4, :cond_a

    .line 14
    .line 15
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 16
    .line 17
    if-nez p4, :cond_1

    .line 18
    .line 19
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-eqz p4, :cond_1

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_1
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 28
    .line 29
    if-nez p4, :cond_9

    .line 30
    .line 31
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 32
    .line 33
    if-nez p4, :cond_2

    .line 34
    .line 35
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 36
    .line 37
    .line 38
    move-result p4

    .line 39
    if-eqz p4, :cond_2

    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getYear()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-ltz v1, :cond_6

    .line 48
    .line 49
    const/16 p4, 0x270f

    .line 50
    .line 51
    if-gt v1, p4, :cond_6

    .line 52
    .line 53
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 54
    .line 55
    if-nez p4, :cond_5

    .line 56
    .line 57
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    if-eqz p4, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 65
    .line 66
    if-eqz p4, :cond_4

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMonthValue()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getDayOfMonth()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getHour()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMinute()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getSecond()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    move-object v0, p1

    .line 89
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_4
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss14:Z

    .line 94
    .line 95
    if-eqz p4, :cond_6

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMonthValue()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getDayOfMonth()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getHour()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMinute()I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getSecond()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    move-object v0, p1

    .line 118
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime14(IIIIII)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_5
    :goto_0
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMonthValue()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getDayOfMonth()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getHour()I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMinute()I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getSecond()I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getNano()I

    .line 143
    .line 144
    .line 145
    move-result p3

    .line 146
    const p4, 0xf4240

    .line 147
    .line 148
    .line 149
    div-int v7, p3, p4

    .line 150
    .line 151
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    const/4 v9, 0x1

    .line 160
    move-object v0, p1

    .line 161
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 166
    .line 167
    .line 168
    move-result-object p4

    .line 169
    if-nez p4, :cond_7

    .line 170
    .line 171
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 172
    .line 173
    .line 174
    move-result-object p4

    .line 175
    :cond_7
    if-nez p4, :cond_8

    .line 176
    .line 177
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeOffsetDateTime(Ljava/time/OffsetDateTime;)V

    .line 178
    .line 179
    .line 180
    return-void

    .line 181
    :cond_8
    invoke-virtual {p4, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_9
    :goto_1
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->toInstant()Ljava/time/Instant;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 194
    .line 195
    .line 196
    move-result-wide p2

    .line 197
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :cond_a
    :goto_2
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->toInstant()Ljava/time/Instant;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 206
    .line 207
    .line 208
    move-result-wide p2

    .line 209
    const-wide/16 v1, 0x3e8

    .line 210
    .line 211
    div-long/2addr p2, v1

    .line 212
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 213
    .line 214
    .line 215
    return-void
.end method
