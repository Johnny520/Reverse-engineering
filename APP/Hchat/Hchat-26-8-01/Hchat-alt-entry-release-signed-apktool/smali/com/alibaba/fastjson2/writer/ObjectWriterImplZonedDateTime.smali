.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;


# instance fields
.field private final function:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;Ljava/util/function/Function;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;Ljava/util/function/Function;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;->function:Ljava/util/function/Function;

    .line 5
    .line 6
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
    iget-object p3, p0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplZonedDateTime;->function:Ljava/util/function/Function;

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    invoke-interface {p3, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/time/ZonedDateTime;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast p2, Ljava/time/ZonedDateTime;

    .line 19
    .line 20
    :goto_0
    iget-object p3, p1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 21
    .line 22
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 23
    .line 24
    if-nez p4, :cond_b

    .line 25
    .line 26
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 27
    .line 28
    if-nez p4, :cond_2

    .line 29
    .line 30
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 31
    .line 32
    .line 33
    move-result p4

    .line 34
    if-eqz p4, :cond_2

    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_2
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 39
    .line 40
    if-nez p4, :cond_a

    .line 41
    .line 42
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 43
    .line 44
    if-nez p4, :cond_3

    .line 45
    .line 46
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 47
    .line 48
    .line 49
    move-result p4

    .line 50
    if-eqz p4, :cond_3

    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :cond_3
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getYear()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-ltz v1, :cond_7

    .line 59
    .line 60
    const/16 p4, 0x270f

    .line 61
    .line 62
    if-gt v1, p4, :cond_7

    .line 63
    .line 64
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 65
    .line 66
    if-nez p4, :cond_6

    .line 67
    .line 68
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    if-eqz p4, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 76
    .line 77
    if-eqz p4, :cond_5

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    move-object v0, p1

    .line 100
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss14:Z

    .line 105
    .line 106
    if-eqz p4, :cond_7

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    move-object v0, p1

    .line 129
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime14(IIIIII)V

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :cond_6
    :goto_1
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 150
    .line 151
    .line 152
    move-result v6

    .line 153
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getNano()I

    .line 154
    .line 155
    .line 156
    move-result p3

    .line 157
    const p4, 0xf4240

    .line 158
    .line 159
    .line 160
    div-int v7, p3, p4

    .line 161
    .line 162
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-virtual {p2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    const/4 v9, 0x1

    .line 171
    move-object v0, p1

    .line 172
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 177
    .line 178
    .line 179
    move-result-object p4

    .line 180
    if-nez p4, :cond_8

    .line 181
    .line 182
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 183
    .line 184
    .line 185
    move-result-object p4

    .line 186
    :cond_8
    if-nez p4, :cond_9

    .line 187
    .line 188
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeZonedDateTime(Ljava/time/ZonedDateTime;)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_9
    invoke-virtual {p4, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_a
    :goto_2
    invoke-interface {p2}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 205
    .line 206
    .line 207
    move-result-wide p2

    .line 208
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_b
    :goto_3
    invoke-interface {p2}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 217
    .line 218
    .line 219
    move-result-wide p2

    .line 220
    const-wide/16 v1, 0x3e8

    .line 221
    .line 222
    div-long/2addr p2, v1

    .line 223
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 224
    .line 225
    .line 226
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    check-cast p2, Ljava/time/ZonedDateTime;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeZonedDateTime(Ljava/time/ZonedDateTime;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
