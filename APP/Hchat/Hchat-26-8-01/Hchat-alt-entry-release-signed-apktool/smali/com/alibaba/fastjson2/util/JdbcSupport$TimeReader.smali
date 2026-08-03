.class public final Lcom/alibaba/fastjson2/util/JdbcSupport$TimeReader;
.super Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/util/JdbcSupport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TimeReader"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplDate;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const-wide/16 p3, 0x3e8

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    iget-boolean p5, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 14
    .line 15
    if-eqz p5, :cond_0

    .line 16
    .line 17
    mul-long/2addr p1, p3

    .line 18
    :cond_0
    new-instance p3, Ljava/sql/Time;

    .line 19
    .line 20
    invoke-direct {p3, p1, p2}, Ljava/sql/Time;-><init>(J)V

    .line 21
    .line 22
    .line 23
    return-object p3

    .line 24
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/4 p5, 0x0

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    return-object p5

    .line 32
    :cond_2
    iget-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 33
    .line 34
    if-nez p2, :cond_f

    .line 35
    .line 36
    iget-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 37
    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :cond_3
    iget-boolean p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 43
    .line 44
    if-eqz p2, :cond_4

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt64()Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    new-instance p5, Ljava/sql/Time;

    .line 55
    .line 56
    mul-long/2addr p1, p3

    .line 57
    invoke-direct {p5, p1, p2}, Ljava/sql/Time;-><init>(J)V

    .line 58
    .line 59
    .line 60
    return-object p5

    .line 61
    :cond_4
    iget-object p2, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 62
    .line 63
    const/4 p3, 0x1

    .line 64
    if-eqz p2, :cond_9

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getLocale()Ljava/util/Locale;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-eqz p2, :cond_8

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    return-object p5

    .line 87
    :cond_5
    iget-boolean p5, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasHour:Z

    .line 88
    .line 89
    if-nez p5, :cond_6

    .line 90
    .line 91
    invoke-static {p4, p2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    sget-object p3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 96
    .line 97
    invoke-static {p2, p3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    goto :goto_0

    .line 102
    :cond_6
    iget-boolean p5, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasDay:Z

    .line 103
    .line 104
    if-nez p5, :cond_7

    .line 105
    .line 106
    const/16 p5, 0x7b2

    .line 107
    .line 108
    invoke-static {p5, p3, p3}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 109
    .line 110
    .line 111
    move-result-object p3

    .line 112
    invoke-static {p4, p2}, Ljava/time/LocalTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    invoke-static {p3, p2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    goto :goto_0

    .line 121
    :cond_7
    invoke-static {p4, p2}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p2, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    goto :goto_1

    .line 138
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :goto_1
    invoke-interface {p1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    .line 147
    .line 148
    .line 149
    move-result-wide p1

    .line 150
    goto/16 :goto_4

    .line 151
    .line 152
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    const-string p2, "0000-00-00"

    .line 157
    .line 158
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-nez p2, :cond_e

    .line 163
    .line 164
    const-string p2, "0000-00-00 00:00:00"

    .line 165
    .line 166
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    if-eqz p2, :cond_a

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_a
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result p2

    .line 177
    const/16 p4, 0x9

    .line 178
    .line 179
    if-ne p2, p4, :cond_b

    .line 180
    .line 181
    const/16 p2, 0x8

    .line 182
    .line 183
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    const/16 p4, 0x5a

    .line 188
    .line 189
    if-ne p2, p4, :cond_b

    .line 190
    .line 191
    const/4 p2, 0x0

    .line 192
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    invoke-virtual {p1, p3}, Ljava/lang/String;->charAt(I)C

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    const/4 p2, 0x2

    .line 201
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    const/4 p2, 0x3

    .line 206
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    const/4 p2, 0x4

    .line 211
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    const/4 p2, 0x5

    .line 216
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    const/4 p2, 0x6

    .line 221
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    const/4 p2, 0x7

    .line 226
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 227
    .line 228
    .line 229
    move-result v7

    .line 230
    invoke-static/range {v0 .. v7}, Lcom/alibaba/fastjson2/util/DateUtils;->parseLocalTime(CCCCCCCC)Ljava/time/LocalTime;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    sget-object p2, Lcom/alibaba/fastjson2/util/DateUtils;->LOCAL_DATE_19700101:Ljava/time/LocalDate;

    .line 235
    .line 236
    invoke-static {p2, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    sget-object p2, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 241
    .line 242
    invoke-virtual {p1, p2}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-interface {p1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    .line 251
    .line 252
    .line 253
    move-result-wide p1

    .line 254
    goto :goto_4

    .line 255
    :cond_b
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result p2

    .line 259
    if-nez p2, :cond_d

    .line 260
    .line 261
    const-string p2, "null"

    .line 262
    .line 263
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result p2

    .line 267
    if-eqz p2, :cond_c

    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_c
    invoke-static {p1}, Ljava/sql/Time;->valueOf(Ljava/lang/String;)Ljava/sql/Time;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    return-object p1

    .line 275
    :cond_d
    :goto_2
    return-object p5

    .line 276
    :cond_e
    :goto_3
    const-wide/16 p1, 0x0

    .line 277
    .line 278
    :goto_4
    new-instance p3, Ljava/sql/Time;

    .line 279
    .line 280
    invoke-direct {p3, p1, p2}, Ljava/sql/Time;-><init>(J)V

    .line 281
    .line 282
    .line 283
    return-object p3

    .line 284
    :cond_f
    :goto_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readMillisFromString()J

    .line 285
    .line 286
    .line 287
    move-result-wide p1

    .line 288
    new-instance p3, Ljava/sql/Time;

    .line 289
    .line 290
    invoke-direct {p3, p1, p2}, Ljava/sql/Time;-><init>(J)V

    .line 291
    .line 292
    .line 293
    return-object p3
.end method
