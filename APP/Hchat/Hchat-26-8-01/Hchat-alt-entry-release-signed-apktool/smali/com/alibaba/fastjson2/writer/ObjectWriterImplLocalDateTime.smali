.class final Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/writer/ObjectWriter;


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;

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

.method public static of(Ljava/lang/String;Ljava/util/Locale;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplLocalDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 4
    .line 5
    .line 6
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
    check-cast p2, Ljava/time/LocalDateTime;

    .line 10
    .line 11
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 12
    .line 13
    if-nez p4, :cond_d

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
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_1
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 28
    .line 29
    if-nez p4, :cond_c

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
    goto/16 :goto_2

    .line 42
    .line 43
    :cond_2
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getYear()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-ltz v1, :cond_8

    .line 48
    .line 49
    const/16 p4, 0x270f

    .line 50
    .line 51
    if-gt v1, p4, :cond_8

    .line 52
    .line 53
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 54
    .line 55
    if-nez p4, :cond_7

    .line 56
    .line 57
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 58
    .line 59
    if-nez p4, :cond_3

    .line 60
    .line 61
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    if-eqz p4, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 69
    .line 70
    if-eqz p4, :cond_4

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getHour()I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMinute()I

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getSecond()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    move-object v0, p1

    .line 93
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime19(IIIIII)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss14:Z

    .line 98
    .line 99
    if-eqz p4, :cond_5

    .line 100
    .line 101
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getHour()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMinute()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getSecond()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    move-object v0, p1

    .line 122
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTime14(IIIIII)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd8:Z

    .line 127
    .line 128
    if-eqz p4, :cond_6

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 131
    .line 132
    .line 133
    move-result p3

    .line 134
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    invoke-virtual {p1, v1, p3, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD8(III)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_6
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMdd10:Z

    .line 143
    .line 144
    if-eqz p4, :cond_8

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 147
    .line 148
    .line 149
    move-result p3

    .line 150
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    invoke-virtual {p1, v1, p3, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateYYYMMDD10(III)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_7
    :goto_0
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getHour()I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMinute()I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getSecond()I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getNano()I

    .line 179
    .line 180
    .line 181
    move-result p4

    .line 182
    const v7, 0xf4240

    .line 183
    .line 184
    .line 185
    div-int v7, p4, v7

    .line 186
    .line 187
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 188
    .line 189
    .line 190
    move-result-object p3

    .line 191
    invoke-virtual {p3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    invoke-virtual {p3, p2}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    invoke-virtual {p2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    const/4 v9, 0x1

    .line 204
    move-object v0, p1

    .line 205
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 210
    .line 211
    .line 212
    move-result-object p4

    .line 213
    if-nez p4, :cond_9

    .line 214
    .line 215
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 216
    .line 217
    .line 218
    move-result-object p4

    .line 219
    :cond_9
    if-nez p4, :cond_a

    .line 220
    .line 221
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeLocalDateTime(Ljava/time/LocalDateTime;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_a
    iget-boolean p3, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->useSimpleDateFormat:Z

    .line 226
    .line 227
    if-eqz p3, :cond_b

    .line 228
    .line 229
    iget-object p3, p1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 230
    .line 231
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 232
    .line 233
    .line 234
    move-result-object p3

    .line 235
    invoke-virtual {p3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 236
    .line 237
    .line 238
    move-result-object p3

    .line 239
    invoke-virtual {p3, p2}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 240
    .line 241
    .line 242
    move-result-object p3

    .line 243
    invoke-interface {p2, p3}, Ljava/time/chrono/ChronoLocalDateTime;->toInstant(Ljava/time/ZoneOffset;)Ljava/time/Instant;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    new-instance p3, Ljava/util/Date;

    .line 248
    .line 249
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 250
    .line 251
    .line 252
    move-result-wide v1

    .line 253
    invoke-direct {p3, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 254
    .line 255
    .line 256
    new-instance p2, Ljava/text/SimpleDateFormat;

    .line 257
    .line 258
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 259
    .line 260
    invoke-direct {p2, p4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p2, p3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p2

    .line 267
    goto :goto_1

    .line 268
    :cond_b
    invoke-virtual {p4, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    :goto_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :cond_c
    :goto_2
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 277
    .line 278
    .line 279
    move-result-object p3

    .line 280
    invoke-virtual {p2, p3}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    invoke-interface {p2}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 289
    .line 290
    .line 291
    move-result-wide p2

    .line 292
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 293
    .line 294
    .line 295
    return-void

    .line 296
    :cond_d
    :goto_3
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 297
    .line 298
    .line 299
    move-result-object p3

    .line 300
    invoke-virtual {p2, p3}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 301
    .line 302
    .line 303
    move-result-object p2

    .line 304
    invoke-interface {p2}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 305
    .line 306
    .line 307
    move-result-object p2

    .line 308
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 309
    .line 310
    .line 311
    move-result-wide p2

    .line 312
    const-wide/16 v1, 0x3e8

    .line 313
    .line 314
    div-long/2addr p2, v1

    .line 315
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 316
    .line 317
    .line 318
    return-void
.end method

.method public writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    check-cast p2, Ljava/time/LocalDateTime;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeLocalDateTime(Ljava/time/LocalDateTime;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
