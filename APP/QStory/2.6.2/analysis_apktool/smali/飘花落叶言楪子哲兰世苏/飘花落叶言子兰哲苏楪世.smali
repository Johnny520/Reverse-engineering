.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# static fields
.field public static final 飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;-><init>(Ljava/lang/String;Ljava/util/Locale;Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Locale;Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljava/time/ZonedDateTime;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object p0, p2

    .line 13
    check-cast p0, Ljava/time/ZonedDateTime;

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子哲兰苏(Ljava/time/ZonedDateTime;)V

    .line 16
    .line 17
    .line 18
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
    iget-object p3, p0, L飘花落叶言楪子哲兰世苏/飘花落叶言子兰哲苏楪世;->飘花落叶言子楪哲兰世苏:Ljava/util/function/Function;

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    invoke-interface {p3, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Ljava/time/ZonedDateTime;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    check-cast p2, Ljava/time/ZonedDateTime;

    .line 19
    .line 20
    :goto_0
    iget-object p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 21
    .line 22
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 23
    .line 24
    if-nez p3, :cond_8

    .line 25
    .line 26
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 27
    .line 28
    if-nez p3, :cond_7

    .line 29
    .line 30
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getYear()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-ltz v1, :cond_4

    .line 35
    .line 36
    const/16 p3, 0x270f

    .line 37
    .line 38
    if-gt v1, p3, :cond_4

    .line 39
    .line 40
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 41
    .line 42
    if-nez p3, :cond_3

    .line 43
    .line 44
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 45
    .line 46
    if-eqz p3, :cond_2

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    move-object v0, p1

    .line 69
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰楪苏(IIIIII)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰哲世:Z

    .line 74
    .line 75
    if-eqz p3, :cond_4

    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    move-object v0, p1

    .line 98
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世苏兰楪(IIIIII)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 119
    .line 120
    .line 121
    move-result v6

    .line 122
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getNano()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    const p3, 0xf4240

    .line 127
    .line 128
    .line 129
    div-int v7, p0, p3

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    const/4 v9, 0x1

    .line 140
    move-object v0, p1

    .line 141
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-nez p0, :cond_5

    .line 150
    .line 151
    const/4 p0, 0x0

    .line 152
    :cond_5
    if-nez p0, :cond_6

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子哲兰苏(Ljava/time/ZonedDateTime;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_6
    invoke-virtual {p0, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_7
    invoke-interface {p2}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 171
    .line 172
    .line 173
    move-result-wide p2

    .line 174
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_8
    invoke-interface {p2}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 183
    .line 184
    .line 185
    move-result-wide p2

    .line 186
    const-wide/16 v1, 0x3e8

    .line 187
    .line 188
    div-long/2addr p2, v1

    .line 189
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 190
    .line 191
    .line 192
    return-void
.end method
