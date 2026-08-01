.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;
.super L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;


# instance fields
.field public final 飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

.field public final 飘花落叶言子楪兰世哲苏:Ljava/util/function/ToIntFunction;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪兰哲世苏:Ljava/util/function/ToIntFunction;

.field public final 飘花落叶言子楪兰哲苏世:Ljava/util/function/Function;

.field public final 飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

.field public final 飘花落叶言子楪兰苏哲世:Ljava/util/function/ToIntFunction;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v1, "org.joda.time.chrono.ISOChronology"

    .line 10
    .line 11
    invoke-virtual {p2, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v1, "getInstance"

    .line 16
    .line 17
    invoke-virtual {p2, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "withUTC"

    .line 26
    .line 27
    invoke-virtual {p2, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 36
    .line 37
    const-string p2, "getYear"

    .line 38
    .line 39
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 44
    .line 45
    const-string p2, "getMonthOfYear"

    .line 46
    .line 47
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 52
    .line 53
    const-string p2, "getDayOfMonth"

    .line 54
    .line 55
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Method;

    .line 60
    .line 61
    const-string p2, "getHourOfDay"

    .line 62
    .line 63
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-static {p2}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世哲苏:Ljava/util/function/ToIntFunction;

    .line 72
    .line 73
    const-string p2, "getMinuteOfHour"

    .line 74
    .line 75
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {p2}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 84
    .line 85
    const-string p2, "getSecondOfMinute"

    .line 86
    .line 87
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p2}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰苏哲世:Ljava/util/function/ToIntFunction;

    .line 96
    .line 97
    const-string p2, "getMillisOfSecond"

    .line 98
    .line 99
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-static {p2}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/reflect/Method;)Ljava/util/function/ToIntFunction;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰哲世苏:Ljava/util/function/ToIntFunction;

    .line 108
    .line 109
    const-string p2, "getChronology"

    .line 110
    .line 111
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1}, L飘花落叶言楪子兰世苏哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/reflect/Method;)Ljava/util/function/Function;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰哲苏世:Ljava/util/function/Function;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    return-void

    .line 122
    :catch_0
    move-exception p0

    .line 123
    goto :goto_0

    .line 124
    :catch_1
    move-exception p0

    .line 125
    goto :goto_0

    .line 126
    :catch_2
    move-exception p0

    .line 127
    goto :goto_0

    .line 128
    :catch_3
    move-exception p0

    .line 129
    goto :goto_0

    .line 130
    :catch_4
    move-exception p0

    .line 131
    :goto_0
    const-string p1, "create LocalDateWriter error"

    .line 132
    .line 133
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    throw v0
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 8

    .line 1
    :try_start_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p3, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    invoke-virtual {p3, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    check-cast p3, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {p3, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世哲苏:Ljava/util/function/ToIntFunction;

    .line 39
    .line 40
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 45
    .line 46
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰苏哲世:Ljava/util/function/ToIntFunction;

    .line 51
    .line 52
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰哲世苏:Ljava/util/function/ToIntFunction;

    .line 57
    .line 58
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰哲苏世:Ljava/util/function/Function;

    .line 63
    .line 64
    invoke-interface {v0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏世兰(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    if-eqz p4, :cond_0

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世兰哲子(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 86
    .line 87
    if-eq v0, p0, :cond_2

    .line 88
    .line 89
    if-nez v0, :cond_1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪哲世苏()V

    .line 93
    .line 94
    .line 95
    const-string p0, "year"

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 101
    .line 102
    .line 103
    const-string p0, "month"

    .line 104
    .line 105
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 109
    .line 110
    .line 111
    const-string p0, "day"

    .line 112
    .line 113
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 117
    .line 118
    .line 119
    const-string p0, "hour"

    .line 120
    .line 121
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 125
    .line 126
    .line 127
    const-string p0, "minute"

    .line 128
    .line 129
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 133
    .line 134
    .line 135
    const-string p0, "second"

    .line 136
    .line 137
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 141
    .line 142
    .line 143
    const-string p0, "millis"

    .line 144
    .line 145
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 149
    .line 150
    .line 151
    const-string p0, "chronology"

    .line 152
    .line 153
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪哲苏(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰()V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_2
    :goto_0
    const p0, 0xf4240

    .line 164
    .line 165
    .line 166
    mul-int v7, p3, p0

    .line 167
    .line 168
    invoke-static/range {v1 .. v7}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰哲世苏(Ljava/time/LocalDateTime;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :catch_0
    move-exception v0

    .line 177
    move-object p0, v0

    .line 178
    const-string p1, "write LocalDateWriter error"

    .line 179
    .line 180
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 8

    .line 1
    :try_start_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p3, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    check-cast p3, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/reflect/Method;

    .line 15
    .line 16
    invoke-virtual {p3, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    check-cast p3, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {p3, p2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰世哲苏:Ljava/util/function/ToIntFunction;

    .line 39
    .line 40
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰苏世哲:Ljava/util/function/ToIntFunction;

    .line 45
    .line 46
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰苏哲世:Ljava/util/function/ToIntFunction;

    .line 51
    .line 52
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget-object p3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰哲世苏:Ljava/util/function/ToIntFunction;

    .line 57
    .line 58
    invoke-interface {p3, p2}, Ljava/util/function/ToIntFunction;->applyAsInt(Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    iget-object v7, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪兰哲苏世:Ljava/util/function/Function;

    .line 63
    .line 64
    invoke-interface {v7, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-virtual {p1, p2, p4, p5, p6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲楪苏世兰(Ljava/lang/Object;Ljava/lang/reflect/Type;J)Z

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    if-eqz p4, :cond_0

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏世兰哲子(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲兰楪;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 86
    .line 87
    if-eq v7, p2, :cond_2

    .line 88
    .line 89
    if-nez v7, :cond_1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰楪哲世苏()V

    .line 93
    .line 94
    .line 95
    const-string p0, "year"

    .line 96
    .line 97
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 101
    .line 102
    .line 103
    const-string p0, "month"

    .line 104
    .line 105
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 109
    .line 110
    .line 111
    const-string p0, "day"

    .line 112
    .line 113
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 117
    .line 118
    .line 119
    const-string p0, "hour"

    .line 120
    .line 121
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 125
    .line 126
    .line 127
    const-string p0, "minute"

    .line 128
    .line 129
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 133
    .line 134
    .line 135
    const-string p0, "second"

    .line 136
    .line 137
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 141
    .line 142
    .line 143
    const-string p0, "millis"

    .line 144
    .line 145
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世兰苏(I)V

    .line 149
    .line 150
    .line 151
    const-string p0, "chronology"

    .line 152
    .line 153
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏兰哲(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪哲苏(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰()V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_2
    :goto_0
    const p2, 0xf4240

    .line 164
    .line 165
    .line 166
    mul-int v7, p3, p2

    .line 167
    .line 168
    invoke-static/range {v1 .. v7}, Ljava/time/LocalDateTime;->of(IIIIIII)Ljava/time/LocalDateTime;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-virtual {p0}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    if-nez p0, :cond_3

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_3
    move-object v0, p0

    .line 180
    :goto_1
    if-nez v0, :cond_4

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子兰哲世苏(Ljava/time/LocalDateTime;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :cond_4
    invoke-virtual {v0, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :catch_0
    move-exception v0

    .line 195
    move-object p0, v0

    .line 196
    const-string p1, "write LocalDateWriter error"

    .line 197
    .line 198
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method
