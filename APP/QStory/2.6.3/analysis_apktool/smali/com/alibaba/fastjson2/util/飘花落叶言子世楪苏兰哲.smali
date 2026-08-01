.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏兰哲;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏兰哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏兰哲;

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
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 10
    .line 11
    if-nez p4, :cond_5

    .line 12
    .line 13
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 14
    .line 15
    if-nez p4, :cond_4

    .line 16
    .line 17
    iget-boolean p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 18
    .line 19
    if-nez p4, :cond_3

    .line 20
    .line 21
    iget-object p4, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 22
    .line 23
    if-eqz p4, :cond_1

    .line 24
    .line 25
    const-string v0, "dd"

    .line 26
    .line 27
    invoke-virtual {p4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result p4

    .line 31
    if-nez p4, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    :goto_0
    if-nez p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    check-cast p2, Ljava/util/Date;

    .line 50
    .line 51
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p2, p3}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p0, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    invoke-virtual {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p2, Ljava/util/Date;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 82
    .line 83
    .line 84
    move-result-wide p2

    .line 85
    invoke-static {p2, p3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-static {p2, p0}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getYear()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getHour()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-virtual {p0}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v9, 0x1

    .line 127
    move-object v0, p1

    .line 128
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_4
    check-cast p2, Ljava/util/Date;

    .line 133
    .line 134
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 135
    .line 136
    .line 137
    move-result-wide p2

    .line 138
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_5
    check-cast p2, Ljava/util/Date;

    .line 143
    .line 144
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 145
    .line 146
    .line 147
    move-result-wide p2

    .line 148
    const-wide/16 v1, 0x3e8

    .line 149
    .line 150
    div-long/2addr p2, v1

    .line 151
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 152
    .line 153
    .line 154
    return-void
.end method
