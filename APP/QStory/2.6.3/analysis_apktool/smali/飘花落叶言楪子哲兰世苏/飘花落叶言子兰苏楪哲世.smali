.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪哲世;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪哲世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪哲世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪哲世;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪哲世;

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
    invoke-virtual/range {p0 .. p6}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏楪哲世;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p2, Ljava/time/LocalDate;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世哲苏楪(Ljava/time/LocalDate;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 7

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
    check-cast p2, Ljava/time/LocalDate;

    .line 10
    .line 11
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 12
    .line 13
    if-nez p4, :cond_8

    .line 14
    .line 15
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 16
    .line 17
    if-nez p4, :cond_7

    .line 18
    .line 19
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Z

    .line 20
    .line 21
    if-eqz p3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 28
    .line 29
    .line 30
    move-result p3

    .line 31
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p1, p0, p3, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏楪兰世(III)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:Z

    .line 40
    .line 41
    if-eqz p3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {p1, p0, p3, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏楪世兰(III)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 60
    .line 61
    if-eqz p3, :cond_3

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const/4 v5, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    move-object v0, p1

    .line 79
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰楪苏(IIIIII)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    move-object v0, p1

    .line 84
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-nez p1, :cond_4

    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    :cond_4
    if-nez p1, :cond_5

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-virtual {v0, p0, p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏楪世兰(III)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_5
    iget-boolean p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Z

    .line 110
    .line 111
    if-nez p0, :cond_6

    .line 112
    .line 113
    invoke-virtual {p1, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    goto :goto_0

    .line 118
    :cond_6
    sget-object p0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 119
    .line 120
    invoke-static {p2, p0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p1, p0}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    :goto_0
    invoke-virtual {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_7
    move-object v0, p1

    .line 133
    sget-object p0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 134
    .line 135
    invoke-static {p2, p0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 152
    .line 153
    .line 154
    move-result-wide p0

    .line 155
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_8
    move-object v0, p1

    .line 160
    sget-object p0, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 161
    .line 162
    invoke-static {p2, p0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 179
    .line 180
    .line 181
    move-result-wide p0

    .line 182
    const-wide/16 p2, 0x3e8

    .line 183
    .line 184
    div-long/2addr p0, p2

    .line 185
    invoke-virtual {v0, p0, p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 186
    .line 187
    .line 188
    return-void
.end method
