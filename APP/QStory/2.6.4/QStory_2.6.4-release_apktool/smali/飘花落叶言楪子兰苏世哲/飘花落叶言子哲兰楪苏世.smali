.class public final L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰楪苏世;
.super L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰楪苏世;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰楪苏世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰楪苏世;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰楪苏世;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
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
    check-cast p2, Ljava/util/Calendar;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 10

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
    check-cast p2, Ljava/util/Calendar;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-boolean p2, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 16
    .line 17
    if-nez p2, :cond_6

    .line 18
    .line 19
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    invoke-static {p3, p2}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p3}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getYear()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 p3, 0x0

    .line 44
    iget-object p4, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 45
    .line 46
    if-ltz v1, :cond_3

    .line 47
    .line 48
    const/16 v0, 0x270f

    .line 49
    .line 50
    if-gt v1, v0, :cond_3

    .line 51
    .line 52
    if-nez p4, :cond_1

    .line 53
    .line 54
    move-object v0, p3

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v0, p4

    .line 57
    :goto_0
    if-nez v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getHour()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    invoke-virtual {p2}, Ljava/time/ZonedDateTime;->getNano()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_2

    .line 84
    .line 85
    move-object v0, p1

    .line 86
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世楪苏(IIIIII)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    const p2, 0xf4240

    .line 91
    .line 92
    .line 93
    div-int v7, p0, p2

    .line 94
    .line 95
    const/4 v9, 0x0

    .line 96
    move-object v0, p1

    .line 97
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世苏楪(IIIIIIIIZ)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    if-eqz p4, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    :cond_4
    if-nez p3, :cond_5

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏哲子兰世(Ljava/time/ZonedDateTime;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :cond_5
    invoke-virtual {p3, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_6
    const-wide/16 p2, 0x3e8

    .line 122
    .line 123
    div-long/2addr v0, p2

    .line 124
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 125
    .line 126
    .line 127
    return-void
.end method
