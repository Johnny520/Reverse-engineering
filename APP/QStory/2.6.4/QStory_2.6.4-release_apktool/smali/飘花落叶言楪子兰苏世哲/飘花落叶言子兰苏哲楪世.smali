.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏哲楪世;
.super L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏哲楪世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏哲楪世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏哲楪世;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子兰苏哲楪世;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    check-cast p2, Ljava/time/LocalTime;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰哲苏世(Ljava/time/LocalTime;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子兰哲苏()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 8
    .line 9
    check-cast p2, Ljava/time/LocalTime;

    .line 10
    .line 11
    iget-boolean p4, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 12
    .line 13
    const/16 p5, 0x7b2

    .line 14
    .line 15
    const/4 p6, 0x1

    .line 16
    if-nez p4, :cond_6

    .line 17
    .line 18
    iget-boolean p4, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 19
    .line 20
    if-nez p4, :cond_5

    .line 21
    .line 22
    invoke-virtual {p0}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    if-nez p3, :cond_1

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    :cond_1
    if-nez p3, :cond_3

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/time/LocalTime;->getHour()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p2}, Ljava/time/LocalTime;->getMinute()I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    invoke-virtual {p2}, Ljava/time/LocalTime;->getSecond()I

    .line 40
    .line 41
    .line 42
    move-result p4

    .line 43
    invoke-virtual {p2}, Ljava/time/LocalTime;->getNano()I

    .line 44
    .line 45
    .line 46
    move-result p5

    .line 47
    if-nez p5, :cond_2

    .line 48
    .line 49
    invoke-virtual {p1, p0, p3, p4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世哲兰子(III)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰哲苏世(Ljava/time/LocalTime;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    iget-boolean p0, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 58
    .line 59
    if-nez p0, :cond_4

    .line 60
    .line 61
    invoke-virtual {p3, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    invoke-static {p5, p6, p6}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0, p2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p3, p0}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    :goto_0
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    invoke-static {p5, p6, p6}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0, p2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p0, p2}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 103
    .line 104
    .line 105
    move-result-wide p2

    .line 106
    const-wide/16 p4, 0x3e8

    .line 107
    .line 108
    div-long/2addr p2, p4

    .line 109
    long-to-int p0, p2

    .line 110
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_6
    invoke-static {p5, p6, p6}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0, p2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p0, p2}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 135
    .line 136
    .line 137
    move-result-wide p2

    .line 138
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 139
    .line 140
    .line 141
    return-void
.end method
