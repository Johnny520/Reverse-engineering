.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲苏楪;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# static fields
.field public static final 飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲苏楪;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲苏楪;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲苏楪;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世哲苏楪;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    const-wide/16 p4, 0x3e8

    .line 17
    .line 18
    iget-boolean v0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 19
    .line 20
    iget-boolean v1, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 21
    .line 22
    iget-boolean v2, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世:Z

    .line 23
    .line 24
    iget-boolean v3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 25
    .line 26
    if-eqz p3, :cond_3

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1, p0}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世兰苏哲()J

    .line 52
    .line 53
    .line 54
    move-result-wide p0

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    mul-long/2addr p0, p4

    .line 58
    :cond_2
    invoke-static {p0, p1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 72
    .line 73
    .line 74
    move-result p3

    .line 75
    if-eqz p3, :cond_4

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_4
    iget-object p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 79
    .line 80
    if-eqz p3, :cond_c

    .line 81
    .line 82
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世兰苏:Z

    .line 83
    .line 84
    if-nez p3, :cond_c

    .line 85
    .line 86
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲世苏兰:Z

    .line 87
    .line 88
    if-nez p3, :cond_c

    .line 89
    .line 90
    if-nez v2, :cond_c

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result p3

    .line 103
    if-eqz p3, :cond_6

    .line 104
    .line 105
    :goto_0
    const/4 p0, 0x0

    .line 106
    return-object p0

    .line 107
    :cond_6
    if-nez v1, :cond_a

    .line 108
    .line 109
    if-eqz v3, :cond_7

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰哲苏()Ljava/time/format/DateTimeFormatter;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    iget-boolean p3, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Z

    .line 120
    .line 121
    if-nez p3, :cond_8

    .line 122
    .line 123
    invoke-static {p1, p2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    sget-object p1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 128
    .line 129
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_8
    iget-boolean p0, p0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 135
    .line 136
    if-nez p0, :cond_9

    .line 137
    .line 138
    const/16 p0, 0x7b2

    .line 139
    .line 140
    const/4 p3, 0x1

    .line 141
    invoke-static {p0, p3, p3}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p1, p2}, Ljava/time/LocalTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_9
    invoke-static {p1, p2}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :cond_a
    :goto_1
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 160
    .line 161
    .line 162
    move-result-wide p0

    .line 163
    if-eqz v3, :cond_b

    .line 164
    .line 165
    mul-long/2addr p0, p4

    .line 166
    :cond_b
    invoke-static {p0, p1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {p0, p1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    return-object p0

    .line 179
    :cond_c
    :goto_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/time/LocalDateTime;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
