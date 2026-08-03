.class Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;
.super Lcom/alibaba/fastjson2/codec/DateTimeCodec;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# static fields
.field static final INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;

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
.method public getObjectClass()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Ljava/time/LocalDateTime;

    .line 2
    .line 3
    return-object v0
.end method

.method public readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime()Ljava/time/LocalDateTime;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplLocalDateTime;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    move-object p2, p0

    .line 10
    return-object p1

    .line 11
    :cond_0
    move-object p2, p0

    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 17
    .line 18
    .line 19
    move-result p4

    .line 20
    const-wide/16 v0, 0x3e8

    .line 21
    .line 22
    if-eqz p4, :cond_3

    .line 23
    .line 24
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 25
    .line 26
    if-nez p4, :cond_1

    .line 27
    .line 28
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 29
    .line 30
    if-nez p4, :cond_1

    .line 31
    .line 32
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 33
    .line 34
    if-nez p4, :cond_1

    .line 35
    .line 36
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 37
    .line 38
    if-nez p4, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 41
    .line 42
    .line 43
    move-result-object p4

    .line 44
    if-eqz p4, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1, p4}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    return-object p1

    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 56
    .line 57
    .line 58
    move-result-wide p4

    .line 59
    iget-boolean p1, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 60
    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    mul-long/2addr p4, v0

    .line 64
    :cond_2
    invoke-static {p4, p5}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    invoke-static {p1, p3}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

    .line 78
    .line 79
    .line 80
    move-result p4

    .line 81
    const/4 p5, 0x0

    .line 82
    if-eqz p4, :cond_4

    .line 83
    .line 84
    return-object p5

    .line 85
    :cond_4
    iget-object p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 86
    .line 87
    if-eqz p4, :cond_c

    .line 88
    .line 89
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->yyyyMMddhhmmss19:Z

    .line 90
    .line 91
    if-nez p4, :cond_c

    .line 92
    .line 93
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 94
    .line 95
    if-eqz p4, :cond_5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result p4

    .line 106
    if-eqz p4, :cond_6

    .line 107
    .line 108
    return-object p5

    .line 109
    :cond_6
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 110
    .line 111
    if-nez p4, :cond_a

    .line 112
    .line 113
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 114
    .line 115
    if-eqz p4, :cond_7

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_7
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getLocale()Ljava/util/Locale;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    invoke-virtual {p0, p3}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter(Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasHour:Z

    .line 127
    .line 128
    if-nez p4, :cond_8

    .line 129
    .line 130
    invoke-static {p1, p3}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    sget-object p3, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 135
    .line 136
    invoke-static {p1, p3}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    return-object p1

    .line 141
    :cond_8
    iget-boolean p4, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatHasDay:Z

    .line 142
    .line 143
    if-nez p4, :cond_9

    .line 144
    .line 145
    const/16 p4, 0x7b2

    .line 146
    .line 147
    const/4 p5, 0x1

    .line 148
    invoke-static {p4, p5, p5}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 149
    .line 150
    .line 151
    move-result-object p4

    .line 152
    invoke-static {p1, p3}, Ljava/time/LocalTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p4, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    return-object p1

    .line 161
    :cond_9
    invoke-static {p1, p3}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    return-object p1

    .line 166
    :cond_a
    :goto_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 167
    .line 168
    .line 169
    move-result-wide p4

    .line 170
    iget-boolean p1, p2, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 171
    .line 172
    if-eqz p1, :cond_b

    .line 173
    .line 174
    mul-long/2addr p4, v0

    .line 175
    :cond_b
    invoke-static {p4, p5}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 180
    .line 181
    .line 182
    move-result-object p3

    .line 183
    invoke-static {p1, p3}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    return-object p1

    .line 188
    :cond_c
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime()Ljava/time/LocalDateTime;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    return-object p1
.end method
