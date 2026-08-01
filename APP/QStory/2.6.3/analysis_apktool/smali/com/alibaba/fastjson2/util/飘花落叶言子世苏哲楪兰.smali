.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Constructor;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Constructor;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪苏世哲兰:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Class;I)V
    .locals 13

    .line 1
    iput p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const-string v1, "create LocalDateWriter error"

    .line 4
    .line 5
    const-string v0, "getInstance"

    .line 6
    .line 7
    const-string v2, "org.joda.time.chrono.ISOChronology"

    .line 8
    .line 9
    const-string v3, "org.joda.time.Chronology"

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    packed-switch p2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    iput-object v3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 29
    .line 30
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    filled-new-array {v5, v5, v5}, [Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {p1, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iput-object v6, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Constructor;

    .line 41
    .line 42
    filled-new-array {v5, v5, v5, v3}, [Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Constructor;

    .line 51
    .line 52
    invoke-virtual {p2, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    return-void

    .line 67
    :catch_0
    move-exception v0

    .line 68
    :goto_0
    move-object p0, v0

    .line 69
    goto :goto_1

    .line 70
    :catch_1
    move-exception v0

    .line 71
    goto :goto_0

    .line 72
    :catch_2
    move-exception v0

    .line 73
    goto :goto_0

    .line 74
    :catch_3
    move-exception v0

    .line 75
    goto :goto_0

    .line 76
    :catch_4
    move-exception v0

    .line 77
    goto :goto_0

    .line 78
    :goto_1
    invoke-static {v1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v4

    .line 82
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 86
    .line 87
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    iput-object v12, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 96
    .line 97
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    move-object v6, v5

    .line 100
    move-object v7, v5

    .line 101
    move-object v8, v5

    .line 102
    move-object v9, v5

    .line 103
    move-object v10, v5

    .line 104
    move-object v11, v5

    .line 105
    filled-new-array/range {v5 .. v11}, [Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    iput-object v3, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Constructor;

    .line 114
    .line 115
    move-object v6, v5

    .line 116
    move-object v7, v5

    .line 117
    move-object v8, v5

    .line 118
    move-object v9, v5

    .line 119
    move-object v10, v5

    .line 120
    move-object v11, v5

    .line 121
    filled-new-array/range {v5 .. v12}, [Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Constructor;

    .line 130
    .line 131
    invoke-virtual {p2, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世哲兰:Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_5

    .line 144
    .line 145
    return-void

    .line 146
    :catch_5
    move-exception v0

    .line 147
    :goto_2
    move-object p0, v0

    .line 148
    goto :goto_3

    .line 149
    :catch_6
    move-exception v0

    .line 150
    goto :goto_2

    .line 151
    :catch_7
    move-exception v0

    .line 152
    goto :goto_2

    .line 153
    :catch_8
    move-exception v0

    .line 154
    goto :goto_2

    .line 155
    :catch_9
    move-exception v0

    .line 156
    goto :goto_2

    .line 157
    :goto_3
    invoke-static {v1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    throw v4

    .line 161
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 7

    .line 1
    iget p2, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    const-string p3, "read org.joda.time.LocalDate error"

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    packed-switch p2, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰世楪()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲楪兰世()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p0, "not support"

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    goto :goto_3

    .line 32
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-nez p2, :cond_2

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_2
    :try_start_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Constructor;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getYear()I

    .line 42
    .line 43
    .line 44
    move-result p5

    .line 45
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 50
    .line 51
    .line 52
    move-result p5

    .line 53
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 58
    .line 59
    .line 60
    move-result p5

    .line 61
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getHour()I

    .line 66
    .line 67
    .line 68
    move-result p5

    .line 69
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getMinute()I

    .line 74
    .line 75
    .line 76
    move-result p5

    .line 77
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getSecond()I

    .line 82
    .line 83
    .line 84
    move-result p5

    .line 85
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-virtual {p2}, Ljava/time/LocalDateTime;->getNano()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    const p5, 0xf4240

    .line 94
    .line 95
    .line 96
    div-int/2addr p2, p5

    .line 97
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p4
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    goto :goto_3

    .line 110
    :catch_0
    move-exception v0

    .line 111
    :goto_1
    move-object p0, v0

    .line 112
    goto :goto_2

    .line 113
    :catch_1
    move-exception v0

    .line 114
    goto :goto_1

    .line 115
    :catch_2
    move-exception v0

    .line 116
    goto :goto_1

    .line 117
    :goto_2
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    return-object p4

    .line 125
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-eqz p2, :cond_3

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲()Ljava/time/LocalDate;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    if-nez p2, :cond_4

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_4
    :try_start_1
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Constructor;

    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/time/LocalDate;->getYear()I

    .line 142
    .line 143
    .line 144
    move-result p5

    .line 145
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object p5

    .line 149
    invoke-virtual {p2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {p2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 158
    .line 159
    .line 160
    move-result p2

    .line 161
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    filled-new-array {p5, v0, p2, p4}, [Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-virtual {p0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p4
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    .line 173
    goto :goto_6

    .line 174
    :catch_3
    move-exception v0

    .line 175
    :goto_4
    move-object p0, v0

    .line 176
    goto :goto_5

    .line 177
    :catch_4
    move-exception v0

    .line 178
    goto :goto_4

    .line 179
    :catch_5
    move-exception v0

    .line 180
    goto :goto_4

    .line 181
    :goto_5
    invoke-virtual {p1, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    :goto_6
    return-object p4

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/Class;
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 10
    .line 11
    return-object p0

    .line 12
    nop

    .line 13
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲:I

    .line 6
    .line 7
    const-string v3, "not support "

    .line 8
    .line 9
    iget-object v4, v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    const-string v5, "not support fieldName "

    .line 12
    .line 13
    iget-object v6, v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 14
    .line 15
    const/16 v7, -0x57

    .line 16
    .line 17
    const-string v8, "read org.joda.time.LocalDate error"

    .line 18
    .line 19
    iget-object v0, v0, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Constructor;

    .line 20
    .line 21
    const/4 v9, 0x0

    .line 22
    packed-switch v2, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v13

    .line 30
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-ne v2, v7, :cond_0

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲()Ljava/time/LocalDate;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :try_start_0
    invoke-virtual {v2}, Ljava/time/LocalDate;->getYear()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v10

    .line 48
    invoke-virtual {v2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    invoke-virtual {v2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    move-object v14, v13

    .line 65
    move-object v15, v13

    .line 66
    move-object/from16 v16, v13

    .line 67
    .line 68
    filled-new-array/range {v10 .. v16}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v9
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :catch_0
    move-exception v0

    .line 79
    goto :goto_0

    .line 80
    :catch_1
    move-exception v0

    .line 81
    goto :goto_0

    .line 82
    :catch_2
    move-exception v0

    .line 83
    :goto_0
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_0
    const/16 v7, -0x58

    .line 93
    .line 94
    if-ne v2, v7, :cond_1

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/time/LocalDateTime;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :try_start_1
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getYear()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getMonthValue()I

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v12

    .line 124
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getHour()I

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getMinute()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v14

    .line 140
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getSecond()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    invoke-virtual {v2}, Ljava/time/LocalDateTime;->getNano()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    const v3, 0xf4240

    .line 153
    .line 154
    .line 155
    div-int/2addr v2, v3

    .line 156
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v16

    .line 160
    filled-new-array/range {v10 .. v16}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v9
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :catch_3
    move-exception v0

    .line 171
    goto :goto_1

    .line 172
    :catch_4
    move-exception v0

    .line 173
    goto :goto_1

    .line 174
    :catch_5
    move-exception v0

    .line 175
    :goto_1
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_4

    .line 183
    .line 184
    :cond_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世兰楪()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_b

    .line 189
    .line 190
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 191
    .line 192
    .line 193
    move-object v10, v9

    .line 194
    move-object v11, v10

    .line 195
    move-object v12, v11

    .line 196
    move-object v13, v12

    .line 197
    move-object v14, v13

    .line 198
    move-object v15, v14

    .line 199
    move-object/from16 v16, v15

    .line 200
    .line 201
    move-object/from16 v17, v16

    .line 202
    .line 203
    :goto_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_a

    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 210
    .line 211
    .line 212
    move-result-wide v2

    .line 213
    sget-wide v18, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:J

    .line 214
    .line 215
    cmp-long v0, v2, v18

    .line 216
    .line 217
    if-nez v0, :cond_2

    .line 218
    .line 219
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    goto :goto_2

    .line 228
    :cond_2
    sget-wide v18, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:J

    .line 229
    .line 230
    cmp-long v0, v2, v18

    .line 231
    .line 232
    if-nez v0, :cond_3

    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v11

    .line 242
    goto :goto_2

    .line 243
    :cond_3
    sget-wide v18, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:J

    .line 244
    .line 245
    cmp-long v0, v2, v18

    .line 246
    .line 247
    if-nez v0, :cond_4

    .line 248
    .line 249
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 254
    .line 255
    .line 256
    move-result-object v12

    .line 257
    goto :goto_2

    .line 258
    :cond_4
    sget-wide v18, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲兰苏:J

    .line 259
    .line 260
    cmp-long v0, v2, v18

    .line 261
    .line 262
    if-nez v0, :cond_5

    .line 263
    .line 264
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    goto :goto_2

    .line 273
    :cond_5
    sget-wide v18, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世兰苏哲:J

    .line 274
    .line 275
    cmp-long v0, v2, v18

    .line 276
    .line 277
    if-nez v0, :cond_6

    .line 278
    .line 279
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v14

    .line 287
    goto :goto_2

    .line 288
    :cond_6
    sget-wide v18, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世兰哲苏:J

    .line 289
    .line 290
    cmp-long v0, v2, v18

    .line 291
    .line 292
    if-nez v0, :cond_7

    .line 293
    .line 294
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 295
    .line 296
    .line 297
    move-result v0

    .line 298
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v15

    .line 302
    goto :goto_2

    .line 303
    :cond_7
    sget-wide v18, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世哲兰:J

    .line 304
    .line 305
    cmp-long v0, v2, v18

    .line 306
    .line 307
    if-nez v0, :cond_8

    .line 308
    .line 309
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v16

    .line 317
    goto :goto_2

    .line 318
    :cond_8
    sget-wide v17, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲:J

    .line 319
    .line 320
    cmp-long v0, v2, v17

    .line 321
    .line 322
    if-nez v0, :cond_9

    .line 323
    .line 324
    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏楪世(Ljava/lang/Class;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v17

    .line 328
    goto :goto_2

    .line 329
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    goto :goto_4

    .line 353
    :cond_a
    :try_start_2
    filled-new-array/range {v10 .. v17}, [Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v9
    :try_end_2
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_8
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_6

    .line 361
    goto :goto_4

    .line 362
    :catch_6
    move-exception v0

    .line 363
    goto :goto_3

    .line 364
    :catch_7
    move-exception v0

    .line 365
    goto :goto_3

    .line 366
    :catch_8
    move-exception v0

    .line 367
    :goto_3
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    goto :goto_4

    .line 375
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    :goto_4
    return-object v9

    .line 399
    :pswitch_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 400
    .line 401
    .line 402
    move-result v2

    .line 403
    if-ne v2, v7, :cond_c

    .line 404
    .line 405
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏世兰哲()Ljava/time/LocalDate;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    :try_start_3
    invoke-virtual {v2}, Ljava/time/LocalDate;->getYear()I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-virtual {v2}, Ljava/time/LocalDate;->getMonthValue()I

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    invoke-virtual {v2}, Ljava/time/LocalDate;->getDayOfMonth()I

    .line 426
    .line 427
    .line 428
    move-result v2

    .line 429
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    filled-new-array {v3, v4, v2}, [Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v9
    :try_end_3
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_b
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_a
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_9

    .line 441
    goto/16 :goto_8

    .line 442
    .line 443
    :catch_9
    move-exception v0

    .line 444
    goto :goto_5

    .line 445
    :catch_a
    move-exception v0

    .line 446
    goto :goto_5

    .line 447
    :catch_b
    move-exception v0

    .line 448
    :goto_5
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 453
    .line 454
    .line 455
    goto/16 :goto_8

    .line 456
    .line 457
    :cond_c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲世兰楪()Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_12

    .line 462
    .line 463
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 464
    .line 465
    .line 466
    move-object v0, v9

    .line 467
    move-object v2, v0

    .line 468
    move-object v3, v2

    .line 469
    move-object v7, v3

    .line 470
    :goto_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 471
    .line 472
    .line 473
    move-result v10

    .line 474
    if-nez v10, :cond_11

    .line 475
    .line 476
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 477
    .line 478
    .line 479
    move-result-wide v10

    .line 480
    sget-wide v12, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:J

    .line 481
    .line 482
    cmp-long v12, v10, v12

    .line 483
    .line 484
    if-nez v12, :cond_d

    .line 485
    .line 486
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 487
    .line 488
    .line 489
    move-result v0

    .line 490
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    goto :goto_6

    .line 495
    :cond_d
    sget-wide v12, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:J

    .line 496
    .line 497
    cmp-long v12, v10, v12

    .line 498
    .line 499
    if-nez v12, :cond_e

    .line 500
    .line 501
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v2

    .line 509
    goto :goto_6

    .line 510
    :cond_e
    sget-wide v12, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:J

    .line 511
    .line 512
    cmp-long v12, v10, v12

    .line 513
    .line 514
    if-nez v12, :cond_f

    .line 515
    .line 516
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏兰哲()I

    .line 517
    .line 518
    .line 519
    move-result v3

    .line 520
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 521
    .line 522
    .line 523
    move-result-object v3

    .line 524
    goto :goto_6

    .line 525
    :cond_f
    sget-wide v12, Lcom/alibaba/fastjson2/util/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪苏世兰哲:J

    .line 526
    .line 527
    cmp-long v7, v10, v12

    .line 528
    .line 529
    if-nez v7, :cond_10

    .line 530
    .line 531
    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏楪世(Ljava/lang/Class;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v7

    .line 535
    goto :goto_6

    .line 536
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 537
    .line 538
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    goto :goto_8

    .line 560
    :cond_11
    :try_start_4
    filled-new-array {v0, v2, v3, v7}, [Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v9
    :try_end_4
    .catch Ljava/lang/InstantiationException; {:try_start_4 .. :try_end_4} :catch_e
    .catch Ljava/lang/IllegalAccessException; {:try_start_4 .. :try_end_4} :catch_d
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_4 .. :try_end_4} :catch_c

    .line 568
    goto :goto_8

    .line 569
    :catch_c
    move-exception v0

    .line 570
    goto :goto_7

    .line 571
    :catch_d
    move-exception v0

    .line 572
    goto :goto_7

    .line 573
    :catch_e
    move-exception v0

    .line 574
    :goto_7
    invoke-virtual {v1, v8}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    invoke-static {v1, v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 579
    .line 580
    .line 581
    goto :goto_8

    .line 582
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 583
    .line 584
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    :goto_8
    return-object v9

    .line 606
    nop

    .line 607
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
