.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏世楪哲;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏世楪哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏世楪哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏世楪哲;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p2, Ljava/time/LocalDateTime;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏楪世哲(Ljava/time/LocalDateTime;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 10

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    check-cast p2, Ljava/time/LocalDateTime;

    .line 10
    .line 11
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 12
    .line 13
    if-nez p4, :cond_b

    .line 14
    .line 15
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 16
    .line 17
    if-nez p4, :cond_a

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getYear()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-ltz v1, :cond_5

    .line 24
    .line 25
    const/16 p4, 0x270f

    .line 26
    .line 27
    if-gt v1, p4, :cond_5

    .line 28
    .line 29
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 30
    .line 31
    if-nez p4, :cond_4

    .line 32
    .line 33
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 34
    .line 35
    if-eqz p4, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getHour()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMinute()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getSecond()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    move-object v0, p1

    .line 58
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰楪苏(IIIIII)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世:Z

    .line 63
    .line 64
    if-eqz p4, :cond_2

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getHour()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMinute()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getSecond()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    move-object v0, p1

    .line 87
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏兰楪(IIIIII)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Z

    .line 92
    .line 93
    if-eqz p4, :cond_3

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-virtual {p1, v1, p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏楪兰世(III)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_3
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:Z

    .line 108
    .line 109
    if-eqz p4, :cond_5

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    invoke-virtual {p1, v1, p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏楪世兰(III)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_4
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getHour()I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMinute()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getSecond()I

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getNano()I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    const p4, 0xf4240

    .line 148
    .line 149
    .line 150
    div-int v7, p0, p4

    .line 151
    .line 152
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p0}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0, p2}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 165
    .line 166
    .line 167
    move-result v8

    .line 168
    const/4 v9, 0x1

    .line 169
    move-object v0, p1

    .line 170
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :cond_5
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 175
    .line 176
    .line 177
    move-result-object p4

    .line 178
    if-nez p4, :cond_6

    .line 179
    .line 180
    const/4 p4, 0x0

    .line 181
    :cond_6
    if-nez p4, :cond_7

    .line 182
    .line 183
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏楪世哲(Ljava/time/LocalDateTime;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_7
    iget-boolean v1, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏世兰:Z

    .line 188
    .line 189
    if-eqz v1, :cond_8

    .line 190
    .line 191
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    invoke-virtual {p3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    invoke-virtual {p3, p2}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/LocalDateTime;)Ljava/time/ZoneOffset;

    .line 200
    .line 201
    .line 202
    move-result-object p3

    .line 203
    invoke-interface {p2, p3}, Ljava/time/chrono/ChronoLocalDateTime;->toInstant(Ljava/time/ZoneOffset;)Ljava/time/Instant;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    new-instance p3, Ljava/util/Date;

    .line 208
    .line 209
    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    .line 210
    .line 211
    .line 212
    move-result-wide v1

    .line 213
    invoke-direct {p3, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 214
    .line 215
    .line 216
    new-instance p2, Ljava/text/SimpleDateFormat;

    .line 217
    .line 218
    iget-object p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 219
    .line 220
    invoke-direct {p2, p0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, p3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    goto :goto_0

    .line 228
    :cond_8
    iget-object p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰:Ljava/util/Locale;

    .line 229
    .line 230
    if-eqz p0, :cond_9

    .line 231
    .line 232
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-static {p2, p0}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-virtual {p4, p0}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    goto :goto_0

    .line 245
    :cond_9
    invoke-virtual {p4, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    :goto_0
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :cond_a
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p2, p0}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 266
    .line 267
    .line 268
    move-result-wide p2

    .line 269
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :cond_b
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {p2, p0}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 286
    .line 287
    .line 288
    move-result-wide p2

    .line 289
    const-wide/16 v1, 0x3e8

    .line 290
    .line 291
    div-long/2addr p2, v1

    .line 292
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 293
    .line 294
    .line 295
    return-void
.end method
