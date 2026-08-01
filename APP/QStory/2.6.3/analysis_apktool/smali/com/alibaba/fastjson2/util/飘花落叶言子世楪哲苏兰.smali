.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世楪哲苏兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    iget-boolean p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const-wide/16 p3, 0x3e8

    .line 18
    .line 19
    mul-long/2addr p1, p3

    .line 20
    :cond_0
    new-instance p0, Ljava/sql/Timestamp;

    .line 21
    .line 22
    invoke-direct {p0, p1, p2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 23
    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_2

    .line 31
    .line 32
    goto/16 :goto_2

    .line 33
    .line 34
    :cond_2
    iget-object p2, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p2, :cond_7

    .line 37
    .line 38
    iget-boolean p2, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 39
    .line 40
    if-nez p2, :cond_7

    .line 41
    .line 42
    iget-boolean p2, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 43
    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget-boolean p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Z

    .line 63
    .line 64
    if-nez p0, :cond_5

    .line 65
    .line 66
    invoke-static {p1, p2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 71
    .line 72
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    goto :goto_0

    .line 89
    :cond_5
    invoke-static {p1, p2}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    :goto_0
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 106
    .line 107
    .line 108
    move-result-wide p1

    .line 109
    invoke-virtual {p0}, Ljava/time/Instant;->getNano()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    new-instance p3, Ljava/sql/Timestamp;

    .line 114
    .line 115
    invoke-direct {p3, p1, p2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 116
    .line 117
    .line 118
    if-eqz p0, :cond_6

    .line 119
    .line 120
    invoke-virtual {p3, p0}, Ljava/sql/Timestamp;->setNanos(I)V

    .line 121
    .line 122
    .line 123
    :cond_6
    return-object p3

    .line 124
    :cond_7
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    if-eqz p0, :cond_8

    .line 129
    .line 130
    invoke-static {p0}, Ljava/sql/Timestamp;->valueOf(Ljava/time/LocalDateTime;)Ljava/sql/Timestamp;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :cond_8
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 136
    .line 137
    if-eqz p0, :cond_9

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏哲兰子()J

    .line 141
    .line 142
    .line 143
    move-result-wide p2

    .line 144
    const-wide/16 p4, 0x0

    .line 145
    .line 146
    cmp-long p0, p2, p4

    .line 147
    .line 148
    if-nez p0, :cond_a

    .line 149
    .line 150
    iget-boolean p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰哲苏世:Z

    .line 151
    .line 152
    if-eqz p0, :cond_a

    .line 153
    .line 154
    :goto_2
    const/4 p0, 0x0

    .line 155
    return-object p0

    .line 156
    :cond_a
    new-instance p0, Ljava/sql/Timestamp;

    .line 157
    .line 158
    invoke-direct {p0, p2, p3}, Ljava/sql/Timestamp;-><init>(J)V

    .line 159
    .line 160
    .line 161
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    iget-boolean p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const-wide/16 p3, 0x3e8

    .line 16
    .line 17
    mul-long/2addr p1, p3

    .line 18
    :cond_0
    new-instance p0, Ljava/sql/Timestamp;

    .line 19
    .line 20
    invoke-direct {p0, p1, p2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 21
    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0

    .line 32
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/16 v1, -0x58

    .line 37
    .line 38
    if-ne v0, v1, :cond_4

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 59
    .line 60
    .line 61
    move-result-wide p1

    .line 62
    invoke-virtual {p0}, Ljava/time/Instant;->getNano()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    new-instance p3, Ljava/sql/Timestamp;

    .line 67
    .line 68
    invoke-direct {p3, p1, p2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 69
    .line 70
    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    invoke-virtual {p3, p0}, Ljava/sql/Timestamp;->setNanos(I)V

    .line 74
    .line 75
    .line 76
    :cond_3
    return-object p3

    .line 77
    :cond_4
    move-object v0, p0

    .line 78
    move-object v1, p1

    .line 79
    move-object v2, p2

    .line 80
    move-object v3, p3

    .line 81
    move-wide v4, p4

    .line 82
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method
