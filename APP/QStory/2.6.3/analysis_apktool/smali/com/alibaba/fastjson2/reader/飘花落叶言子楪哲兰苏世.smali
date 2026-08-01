.class public abstract Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子世哲楪兰苏:Z

.field public final 飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

.field public final 飘花落叶言子世哲苏楪兰:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;)V
    .locals 1

    .line 1
    invoke-direct/range {p0 .. p12}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 2
    .line 3
    .line 4
    iput-object p13, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    if-eqz p7, :cond_1

    .line 8
    .line 9
    const-string p2, "millis"

    .line 10
    .line 11
    invoke-virtual {p7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    const/4 p3, 0x1

    .line 16
    if-nez p2, :cond_2

    .line 17
    .line 18
    const-string p2, "unixtime"

    .line 19
    .line 20
    invoke-virtual {p7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v0, p3

    .line 28
    move p3, p1

    .line 29
    move p1, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    move p3, p1

    .line 32
    :cond_2
    :goto_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏:Z

    .line 33
    .line 34
    iput-boolean p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲苏楪兰:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public abstract 飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)V
.end method

.method public abstract 飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V
.end method

.method public abstract 飘花落叶言子世楪哲兰苏(Ljava/lang/Object;Ljava/time/ZonedDateTime;)V
.end method

.method public abstract 飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V
.end method

.method public abstract 飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Ljava/time/Instant;)V
.end method

.method public 飘花落叶言子世楪苏哲兰(Ljava/lang/Class;)Z
    .locals 0

    .line 1
    const-class p0, Ljava/util/Date;

    .line 2
    .line 3
    if-eq p1, p0, :cond_1

    .line 4
    .line 5
    const-class p0, Ljava/lang/String;

    .line 6
    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    instance-of v0, p2, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_5

    .line 18
    .line 19
    const-string v0, "null"

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪兰苏:Z

    .line 29
    .line 30
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲苏楪兰:Z

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    :cond_2
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_4

    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    const-wide/16 v3, 0x3e8

    .line 53
    .line 54
    mul-long/2addr v1, v3

    .line 55
    :cond_3
    invoke-virtual {p0, p1, v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;J)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 60
    .line 61
    invoke-static {p2, v1, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/time/ZoneId;)Ljava/util/Date;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    goto :goto_1

    .line 66
    :cond_5
    :goto_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_6
    :goto_1
    instance-of v0, p2, Ljava/util/Date;

    .line 71
    .line 72
    if-eqz v0, :cond_7

    .line 73
    .line 74
    check-cast p2, Ljava/util/Date;

    .line 75
    .line 76
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪兰苏哲(Ljava/lang/Object;Ljava/util/Date;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_7
    instance-of v0, p2, Ljava/time/Instant;

    .line 81
    .line 82
    if-eqz v0, :cond_8

    .line 83
    .line 84
    check-cast p2, Ljava/time/Instant;

    .line 85
    .line 86
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Ljava/time/Instant;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_8
    instance-of v0, p2, Ljava/lang/Long;

    .line 91
    .line 92
    if-eqz v0, :cond_9

    .line 93
    .line 94
    check-cast p2, Ljava/lang/Long;

    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;J)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_9
    instance-of v0, p2, Ljava/time/LocalDateTime;

    .line 105
    .line 106
    if-eqz v0, :cond_a

    .line 107
    .line 108
    check-cast p2, Ljava/time/LocalDateTime;

    .line 109
    .line 110
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪哲苏兰(Ljava/lang/Object;Ljava/time/LocalDateTime;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_a
    instance-of v0, p2, Ljava/time/ZonedDateTime;

    .line 115
    .line 116
    if-eqz v0, :cond_b

    .line 117
    .line 118
    check-cast p2, Ljava/time/ZonedDateTime;

    .line 119
    .line 120
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;Ljava/time/ZonedDateTime;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :cond_b
    new-instance p0, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const-string p1, "not support value "

    .line 127
    .line 128
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final 飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪哲兰苏世;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    return-object p0
.end method
