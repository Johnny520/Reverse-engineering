.class public final Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;
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
    name = "TimeWriter"
.end annotation


# static fields
.field public static final INSTANCE:Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;-><init>(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;->INSTANCE:Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static of(Ljava/lang/String;)Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;->INSTANCE:Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/util/JdbcSupport$TimeWriter;-><init>(Ljava/lang/String;)V

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
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatUnixTime:Z

    .line 10
    .line 11
    if-nez p4, :cond_9

    .line 12
    .line 13
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatUnixTime()Z

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    if-eqz p4, :cond_1

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_1
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatMillis:Z

    .line 22
    .line 23
    if-nez p4, :cond_8

    .line 24
    .line 25
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatMillis()Z

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    if-eqz p4, :cond_2

    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_2
    iget-boolean p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->formatISO8601:Z

    .line 34
    .line 35
    if-nez p4, :cond_7

    .line 36
    .line 37
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->isDateFormatISO8601()Z

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    if-eqz p4, :cond_3

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    iget-object p4, p0, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->format:Ljava/lang/String;

    .line 45
    .line 46
    const-string v0, "dd"

    .line 47
    .line 48
    if-eqz p4, :cond_4

    .line 49
    .line 50
    invoke-virtual {p4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    if-nez p4, :cond_4

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/codec/DateTimeCodec;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 57
    .line 58
    .line 59
    move-result-object p4

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    const/4 p4, 0x0

    .line 62
    :goto_0
    if-nez p4, :cond_5

    .line 63
    .line 64
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormat()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_5

    .line 75
    .line 76
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    :cond_5
    if-nez p4, :cond_6

    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_6
    check-cast p2, Ljava/util/Date;

    .line 91
    .line 92
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {p2, p3}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p4, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeString(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_7
    :goto_1
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getZoneId()Ljava/time/ZoneId;

    .line 117
    .line 118
    .line 119
    move-result-object p3

    .line 120
    check-cast p2, Ljava/util/Date;

    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 123
    .line 124
    .line 125
    move-result-wide v0

    .line 126
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-static {p2, p3}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    invoke-virtual {p3}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getYear()I

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 159
    .line 160
    .line 161
    move-result v5

    .line 162
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v9, 0x1

    .line 168
    move-object v0, p1

    .line 169
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/JSONWriter;->writeDateTimeISO8601(IIIIIIIIZ)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_8
    :goto_2
    check-cast p2, Ljava/util/Date;

    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 176
    .line 177
    .line 178
    move-result-wide p2

    .line 179
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_9
    :goto_3
    check-cast p2, Ljava/util/Date;

    .line 184
    .line 185
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 186
    .line 187
    .line 188
    move-result-wide p2

    .line 189
    const-wide/16 v1, 0x3e8

    .line 190
    .line 191
    div-long/2addr p2, v1

    .line 192
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt64(J)V

    .line 193
    .line 194
    .line 195
    return-void
.end method
