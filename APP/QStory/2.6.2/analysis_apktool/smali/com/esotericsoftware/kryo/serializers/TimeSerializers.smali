.class public final Lcom/esotericsoftware/kryo/serializers/TimeSerializers;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$PeriodSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$MonthDaySerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$YearMonthSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$YearSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZonedDateTimeSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$OffsetDateTimeSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$OffsetTimeSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZoneIdSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZoneOffsetSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalDateTimeSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalDateSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$InstantSerializer;,
        Lcom/esotericsoftware/kryo/serializers/TimeSerializers$DurationSerializer;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static addDefaultSerializers(Lcom/esotericsoftware/kryo/Kryo;)V
    .locals 2

    .line 1
    const-string v0, "java.time.Duration"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-class v0, Ljava/time/Duration;

    .line 10
    .line 11
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$DurationSerializer;

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const-string v0, "java.time.Instant"

    .line 17
    .line 18
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const-class v0, Ljava/time/Instant;

    .line 25
    .line 26
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$InstantSerializer;

    .line 27
    .line 28
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    const-string v0, "java.time.LocalDate"

    .line 32
    .line 33
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-class v0, Ljava/time/LocalDate;

    .line 40
    .line 41
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalDateSerializer;

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    const-string v0, "java.time.LocalTime"

    .line 47
    .line 48
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    const-class v0, Ljava/time/LocalTime;

    .line 55
    .line 56
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    const-string v0, "java.time.LocalDateTime"

    .line 62
    .line 63
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    const-class v0, Ljava/time/LocalDateTime;

    .line 70
    .line 71
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalDateTimeSerializer;

    .line 72
    .line 73
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    const-string v0, "java.time.ZoneOffset"

    .line 77
    .line 78
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    const-class v0, Ljava/time/ZoneOffset;

    .line 85
    .line 86
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZoneOffsetSerializer;

    .line 87
    .line 88
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 89
    .line 90
    .line 91
    :cond_5
    const-string v0, "java.time.ZoneId"

    .line 92
    .line 93
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    const-class v0, Ljava/time/ZoneId;

    .line 100
    .line 101
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZoneIdSerializer;

    .line 102
    .line 103
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 104
    .line 105
    .line 106
    :cond_6
    const-string v0, "java.time.OffsetTime"

    .line 107
    .line 108
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_7

    .line 113
    .line 114
    const-class v0, Ljava/time/OffsetTime;

    .line 115
    .line 116
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$OffsetTimeSerializer;

    .line 117
    .line 118
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 119
    .line 120
    .line 121
    :cond_7
    const-string v0, "java.time.OffsetDateTime"

    .line 122
    .line 123
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    const-class v0, Ljava/time/OffsetDateTime;

    .line 130
    .line 131
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$OffsetDateTimeSerializer;

    .line 132
    .line 133
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 134
    .line 135
    .line 136
    :cond_8
    const-string v0, "java.time.ZonedDateTime"

    .line 137
    .line 138
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_9

    .line 143
    .line 144
    const-class v0, Ljava/time/ZonedDateTime;

    .line 145
    .line 146
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZonedDateTimeSerializer;

    .line 147
    .line 148
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 149
    .line 150
    .line 151
    :cond_9
    const-string v0, "java.time.Year"

    .line 152
    .line 153
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_a

    .line 158
    .line 159
    const-class v0, Ljava/time/Year;

    .line 160
    .line 161
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$YearSerializer;

    .line 162
    .line 163
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 164
    .line 165
    .line 166
    :cond_a
    const-string v0, "java.time.YearMonth"

    .line 167
    .line 168
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    const-class v0, Ljava/time/YearMonth;

    .line 175
    .line 176
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$YearMonthSerializer;

    .line 177
    .line 178
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    const-string v0, "java.time.MonthDay"

    .line 182
    .line 183
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    if-eqz v0, :cond_c

    .line 188
    .line 189
    const-class v0, Ljava/time/MonthDay;

    .line 190
    .line 191
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$MonthDaySerializer;

    .line 192
    .line 193
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 194
    .line 195
    .line 196
    :cond_c
    const-string v0, "java.time.Period"

    .line 197
    .line 198
    invoke-static {v0}, Lcom/esotericsoftware/kryo/util/Util;->isClassAvailable(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_d

    .line 203
    .line 204
    const-class v0, Ljava/time/Period;

    .line 205
    .line 206
    const-class v1, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$PeriodSerializer;

    .line 207
    .line 208
    invoke-virtual {p0, v0, v1}, Lcom/esotericsoftware/kryo/Kryo;->addDefaultSerializer(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 209
    .line 210
    .line 211
    :cond_d
    return-void
.end method
