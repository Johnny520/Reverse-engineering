.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲世楪;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲世楪;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲世楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰苏哲世楪;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
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
    check-cast p2, Ljava/time/OffsetDateTime;

    .line 10
    .line 11
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 12
    .line 13
    if-nez p3, :cond_7

    .line 14
    .line 15
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 16
    .line 17
    if-nez p3, :cond_6

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getYear()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-ltz v1, :cond_3

    .line 24
    .line 25
    const/16 p3, 0x270f

    .line 26
    .line 27
    if-gt v1, p3, :cond_3

    .line 28
    .line 29
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 30
    .line 31
    if-nez p3, :cond_2

    .line 32
    .line 33
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMonthValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getDayOfMonth()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getHour()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMinute()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getSecond()I

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
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世:Z

    .line 63
    .line 64
    if-eqz p3, :cond_3

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMonthValue()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getDayOfMonth()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getHour()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMinute()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getSecond()I

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
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMonthValue()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getDayOfMonth()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getHour()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getMinute()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getSecond()I

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getNano()I

    .line 112
    .line 113
    .line 114
    move-result p0

    .line 115
    const p3, 0xf4240

    .line 116
    .line 117
    .line 118
    div-int v7, p0, p3

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    const/4 v9, 0x1

    .line 129
    move-object v0, p1

    .line 130
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    if-nez p0, :cond_4

    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    :cond_4
    if-nez p0, :cond_5

    .line 142
    .line 143
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲苏楪世(Ljava/time/OffsetDateTime;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_5
    invoke-virtual {p0, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_6
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->toInstant()Ljava/time/Instant;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 160
    .line 161
    .line 162
    move-result-wide p2

    .line 163
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_7
    invoke-virtual {p2}, Ljava/time/OffsetDateTime;->toInstant()Ljava/time/Instant;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 172
    .line 173
    .line 174
    move-result-wide p2

    .line 175
    const-wide/16 v1, 0x3e8

    .line 176
    .line 177
    div-long/2addr p2, v1

    .line 178
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 179
    .line 180
    .line 181
    return-void
.end method
