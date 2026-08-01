.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世楪哲兰苏;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 2

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
    move-object v0, p2

    .line 8
    check-cast v0, Ljava/sql/Timestamp;

    .line 9
    .line 10
    iget-object v1, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual/range {p0 .. p6}, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-virtual {v0}, Ljava/sql/Timestamp;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏楪世哲(Ljava/time/LocalDateTime;)V

    .line 23
    .line 24
    .line 25
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
    check-cast p2, Ljava/sql/Timestamp;

    .line 10
    .line 11
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 12
    .line 13
    if-nez p4, :cond_7

    .line 14
    .line 15
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p2}, Ljava/util/Date;->toInstant()Ljava/time/Instant;

    .line 20
    .line 21
    .line 22
    move-result-object p4

    .line 23
    invoke-static {p4, p3}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    invoke-virtual {p4}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 36
    .line 37
    const v0, 0xf4240

    .line 38
    .line 39
    .line 40
    if-nez p4, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getNano()I

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    rem-int/2addr p4, v0

    .line 48
    if-nez p4, :cond_2

    .line 49
    .line 50
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getYear()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getHour()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getNano()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    div-int v7, p0, v0

    .line 79
    .line 80
    const/4 v9, 0x1

    .line 81
    move-object v0, p1

    .line 82
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    :goto_0
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 87
    .line 88
    .line 89
    move-result-object p4

    .line 90
    if-nez p4, :cond_3

    .line 91
    .line 92
    const/4 p4, 0x0

    .line 93
    :cond_3
    if-nez p4, :cond_6

    .line 94
    .line 95
    iget-boolean p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 96
    .line 97
    if-nez p0, :cond_5

    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getNanos()I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getYear()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getHour()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    rem-int p2, p0, v0

    .line 128
    .line 129
    if-nez p2, :cond_4

    .line 130
    .line 131
    div-int v7, p0, v0

    .line 132
    .line 133
    const/4 v9, 0x0

    .line 134
    move-object v0, p1

    .line 135
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_4
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏楪世哲(Ljava/time/LocalDateTime;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_5
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getTime()J

    .line 148
    .line 149
    .line 150
    move-result-wide p2

    .line 151
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_6
    invoke-virtual {p4, p3}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_7
    invoke-virtual {p2}, Ljava/sql/Timestamp;->getTime()J

    .line 164
    .line 165
    .line 166
    move-result-wide p2

    .line 167
    const-wide/16 v1, 0x3e8

    .line 168
    .line 169
    div-long/2addr p2, v1

    .line 170
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 171
    .line 172
    .line 173
    return-void
.end method
