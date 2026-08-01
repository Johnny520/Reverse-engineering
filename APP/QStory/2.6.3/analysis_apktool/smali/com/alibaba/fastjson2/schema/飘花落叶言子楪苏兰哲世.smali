.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:J

.field public final 飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

.field public final 飘花落叶言子楪兰哲世苏:J

.field public final 飘花落叶言子楪兰哲苏世:Z

.field public final 飘花落叶言子楪兰苏世哲:Z

.field public final 飘花落叶言子楪兰苏哲世:Ljava/math/BigDecimal;

.field public final 飘花落叶言子楪哲兰世苏:J

.field public final 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONObject;)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "type"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "number"

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲苏世:Z

    .line 17
    .line 18
    const-string v0, "exclusiveMinimum"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "minimum"

    .line 25
    .line 26
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-ne v1, v3, :cond_0

    .line 35
    .line 36
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 37
    .line 38
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    instance-of v1, v1, Ljava/lang/Number;

    .line 42
    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 50
    .line 51
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 55
    .line 56
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 57
    .line 58
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 59
    .line 60
    const-wide/high16 v1, -0x8000000000000000L

    .line 61
    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    invoke-static {v6, v7}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-virtual {v0, v6}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v6

    .line 85
    iput-wide v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:J

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    :goto_1
    iput-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:J

    .line 89
    .line 90
    :goto_2
    const-string v0, "maximum"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v6, "exclusiveMaximum"

    .line 97
    .line 98
    invoke-virtual {p1, v6}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-ne v7, v3, :cond_4

    .line 103
    .line 104
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 105
    .line 106
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏世哲:Z

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    instance-of v3, v7, Ljava/lang/Number;

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    invoke-virtual {p1, v6}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 118
    .line 119
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏世哲:Z

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 123
    .line 124
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏世哲:Z

    .line 125
    .line 126
    :goto_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 127
    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide v3

    .line 134
    invoke-static {v3, v4}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v0, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_6

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    .line 148
    .line 149
    .line 150
    move-result-wide v3

    .line 151
    iput-wide v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世哲苏:J

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_7
    :goto_4
    iput-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世哲苏:J

    .line 155
    .line 156
    :goto_5
    const-string v0, "multipleOf"

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏哲世:Ljava/math/BigDecimal;

    .line 163
    .line 164
    if-nez p1, :cond_8

    .line 165
    .line 166
    iput-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:J

    .line 167
    .line 168
    return-void

    .line 169
    :cond_8
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValue()J

    .line 170
    .line 171
    .line 172
    move-result-wide v3

    .line 173
    invoke-static {v3, v4}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    if-nez p1, :cond_9

    .line 182
    .line 183
    iput-wide v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:J

    .line 184
    .line 185
    return-void

    .line 186
    :cond_9
    iput-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:J

    .line 187
    .line 188
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰世哲苏(Ljava/lang/Float;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->doubleValue()D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏(D)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪兰世苏哲(Ljava/lang/Double;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏(D)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲苏世:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-eqz v0, :cond_e

    .line 6
    .line 7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    instance-of v1, p1, Ljava/lang/Number;

    .line 11
    .line 12
    if-eqz v1, :cond_d

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Ljava/lang/Number;

    .line 16
    .line 17
    instance-of v1, v0, Ljava/lang/Byte;

    .line 18
    .line 19
    if-nez v1, :cond_c

    .line 20
    .line 21
    instance-of v1, v0, Ljava/lang/Short;

    .line 22
    .line 23
    if-nez v1, :cond_c

    .line 24
    .line 25
    instance-of v1, v0, Ljava/lang/Integer;

    .line 26
    .line 27
    if-nez v1, :cond_c

    .line 28
    .line 29
    instance-of v1, v0, Ljava/lang/Long;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    goto/16 :goto_6

    .line 34
    .line 35
    :cond_1
    instance-of v1, v0, Ljava/lang/Float;

    .line 36
    .line 37
    if-nez v1, :cond_b

    .line 38
    .line 39
    instance-of v1, v0, Ljava/lang/Double;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_2
    instance-of v1, v0, Ljava/math/BigInteger;

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    new-instance v1, Ljava/math/BigDecimal;

    .line 51
    .line 52
    check-cast v0, Ljava/math/BigInteger;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    instance-of v1, v0, Ljava/math/BigDecimal;

    .line 59
    .line 60
    if-eqz v1, :cond_a

    .line 61
    .line 62
    move-object v1, v0

    .line 63
    check-cast v1, Ljava/math/BigDecimal;

    .line 64
    .line 65
    :goto_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 66
    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 70
    .line 71
    if-eqz v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-ltz v4, :cond_6

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_4
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-lez v4, :cond_6

    .line 85
    .line 86
    :goto_1
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 87
    .line 88
    if-eqz v3, :cond_5

    .line 89
    .line 90
    const-string v1, "exclusiveMinimum not match, expect > %s, but %s"

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_5
    const-string v1, "minimum not match, expect >= %s, but %s"

    .line 94
    .line 95
    :goto_2
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p0, v1, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 100
    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 104
    .line 105
    if-eqz v0, :cond_9

    .line 106
    .line 107
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏世哲:Z

    .line 108
    .line 109
    if-eqz v3, :cond_7

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-gtz v4, :cond_9

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-gez v4, :cond_9

    .line 123
    .line 124
    :goto_3
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 125
    .line 126
    if-eqz v3, :cond_8

    .line 127
    .line 128
    const-string v1, "exclusiveMaximum not match, expect < %s, but %s"

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_8
    const-string v1, "maximum not match, expect <= %s, but %s"

    .line 132
    .line 133
    :goto_4
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-direct {p0, v1, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 138
    .line 139
    .line 140
    return-object p0

    .line 141
    :cond_9
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏哲世:Ljava/math/BigDecimal;

    .line 142
    .line 143
    if-eqz p0, :cond_e

    .line 144
    .line 145
    invoke-virtual {v1, p0}, Ljava/math/BigDecimal;->divideAndRemainder(Ljava/math/BigDecimal;)[Ljava/math/BigDecimal;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const/4 v0, 0x1

    .line 150
    aget-object p1, p1, v0

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 157
    .line 158
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-lez p1, :cond_e

    .line 163
    .line 164
    new-instance p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 165
    .line 166
    const-string v0, "multipleOf not match, expect multipleOf %s, but %s"

    .line 167
    .line 168
    filled-new-array {p0, v1}, [Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-direct {p1, v0, p0, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 173
    .line 174
    .line 175
    return-object p1

    .line 176
    :cond_a
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 177
    .line 178
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Number:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const-string v0, "expect type %s, but %s"

    .line 189
    .line 190
    invoke-direct {p0, v0, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 191
    .line 192
    .line 193
    return-object p0

    .line 194
    :cond_b
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 195
    .line 196
    .line 197
    move-result-wide v0

    .line 198
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏(D)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    return-object p0

    .line 203
    :cond_c
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v0

    .line 207
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世(J)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    return-object p0

    .line 212
    :cond_d
    if-eqz v0, :cond_e

    .line 213
    .line 214
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 215
    .line 216
    return-object p0

    .line 217
    :cond_e
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 218
    .line 219
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏世哲(Ljava/lang/Integer;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世(J)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏哲世(Ljava/lang/Long;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-virtual {p0, v0, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世(J)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰世苏(D)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 10

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 5
    .line 6
    if-eqz v3, :cond_5

    .line 7
    .line 8
    iget-wide v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:J

    .line 9
    .line 10
    cmp-long v6, v4, v0

    .line 11
    .line 12
    const-string v7, "minimum not match, expect >= %s, but %s"

    .line 13
    .line 14
    const-string v8, "exclusiveMinimum not match, expect > %s, but %s"

    .line 15
    .line 16
    iget-boolean v9, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 17
    .line 18
    if-eqz v6, :cond_2

    .line 19
    .line 20
    long-to-double v4, v4

    .line 21
    cmpg-double v4, p1, v4

    .line 22
    .line 23
    if-eqz v9, :cond_0

    .line 24
    .line 25
    if-gtz v4, :cond_5

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-gez v4, :cond_5

    .line 29
    .line 30
    :goto_0
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 31
    .line 32
    if-eqz v9, :cond_1

    .line 33
    .line 34
    move-object v7, v8

    .line 35
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, v7, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 44
    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    cmpg-double v4, p1, v4

    .line 52
    .line 53
    if-eqz v9, :cond_3

    .line 54
    .line 55
    if-gtz v4, :cond_5

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    if-gez v4, :cond_5

    .line 59
    .line 60
    :goto_1
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 61
    .line 62
    if-eqz v9, :cond_4

    .line 63
    .line 64
    move-object v7, v8

    .line 65
    :cond_4
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {p0, v7, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_5
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 78
    .line 79
    if-eqz v3, :cond_b

    .line 80
    .line 81
    iget-wide v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世哲苏:J

    .line 82
    .line 83
    cmp-long v6, v4, v0

    .line 84
    .line 85
    const-string v7, "maximum not match, expect <= %s, but %s"

    .line 86
    .line 87
    const-string v8, "exclusiveMaximum not match, expect < %s, but %s"

    .line 88
    .line 89
    iget-boolean v9, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏世哲:Z

    .line 90
    .line 91
    if-eqz v6, :cond_8

    .line 92
    .line 93
    long-to-double v4, v4

    .line 94
    cmpl-double v4, p1, v4

    .line 95
    .line 96
    if-eqz v9, :cond_6

    .line 97
    .line 98
    if-ltz v4, :cond_b

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_6
    if-lez v4, :cond_b

    .line 102
    .line 103
    :goto_2
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 104
    .line 105
    if-eqz v9, :cond_7

    .line 106
    .line 107
    move-object v7, v8

    .line 108
    :cond_7
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-direct {p0, v7, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 117
    .line 118
    .line 119
    return-object p0

    .line 120
    :cond_8
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 121
    .line 122
    .line 123
    move-result-wide v4

    .line 124
    cmpl-double v4, p1, v4

    .line 125
    .line 126
    if-eqz v9, :cond_9

    .line 127
    .line 128
    if-ltz v4, :cond_b

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_9
    if-lez v4, :cond_b

    .line 132
    .line 133
    :goto_3
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 134
    .line 135
    if-eqz v9, :cond_a

    .line 136
    .line 137
    move-object v7, v8

    .line 138
    :cond_a
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {p0, v7, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_b
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏哲世:Ljava/math/BigDecimal;

    .line 151
    .line 152
    if-eqz v3, :cond_d

    .line 153
    .line 154
    iget-wide v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:J

    .line 155
    .line 156
    cmp-long p0, v4, v0

    .line 157
    .line 158
    const-string v0, "multipleOf not match, expect multipleOf %s, but %s"

    .line 159
    .line 160
    if-eqz p0, :cond_c

    .line 161
    .line 162
    long-to-double v4, v4

    .line 163
    rem-double v4, p1, v4

    .line 164
    .line 165
    const-wide/16 v6, 0x0

    .line 166
    .line 167
    cmpl-double p0, v4, v6

    .line 168
    .line 169
    if-eqz p0, :cond_c

    .line 170
    .line 171
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 172
    .line 173
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-direct {p0, v0, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 182
    .line 183
    .line 184
    return-object p0

    .line 185
    :cond_c
    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-virtual {p0, v3}, Ljava/math/BigDecimal;->divideAndRemainder(Ljava/math/BigDecimal;)[Ljava/math/BigDecimal;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    const/4 p2, 0x1

    .line 194
    aget-object p1, p1, p2

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    sget-object p2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 201
    .line 202
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    if-lez p1, :cond_d

    .line 207
    .line 208
    new-instance p1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 209
    .line 210
    filled-new-array {v3, p0}, [Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-direct {p1, v0, p0, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 215
    .line 216
    .line 217
    return-object p1

    .line 218
    :cond_d
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 219
    .line 220
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(J)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 11

    .line 1
    const-wide/high16 v0, -0x8000000000000000L

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 5
    .line 6
    if-eqz v3, :cond_5

    .line 7
    .line 8
    iget-wide v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:J

    .line 9
    .line 10
    cmp-long v6, v4, v0

    .line 11
    .line 12
    const-string v7, "minimum not match, expect >= %s, but %s"

    .line 13
    .line 14
    const-string v8, "exclusiveMinimum not match, expect > %s, but %s"

    .line 15
    .line 16
    iget-boolean v9, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 17
    .line 18
    if-eqz v6, :cond_2

    .line 19
    .line 20
    cmp-long v4, p1, v4

    .line 21
    .line 22
    if-eqz v9, :cond_0

    .line 23
    .line 24
    if-gtz v4, :cond_5

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-gez v4, :cond_5

    .line 28
    .line 29
    :goto_0
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 30
    .line 31
    if-eqz v9, :cond_1

    .line 32
    .line 33
    move-object v7, v8

    .line 34
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p0, v7, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v9, :cond_3

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-ltz v5, :cond_6

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-lez v5, :cond_6

    .line 64
    .line 65
    :goto_1
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 66
    .line 67
    if-eqz v9, :cond_4

    .line 68
    .line 69
    move-object v7, v8

    .line 70
    :cond_4
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p0, v7, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 79
    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_5
    const/4 v4, 0x0

    .line 83
    :cond_6
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 84
    .line 85
    if-eqz v3, :cond_d

    .line 86
    .line 87
    iget-wide v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世哲苏:J

    .line 88
    .line 89
    cmp-long v7, v5, v0

    .line 90
    .line 91
    const-string v8, "maximum not match, expect <= %s, but %s"

    .line 92
    .line 93
    const-string v9, "exclusiveMaximum not match, expect < %s, but %s"

    .line 94
    .line 95
    iget-boolean v10, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏世哲:Z

    .line 96
    .line 97
    if-eqz v7, :cond_9

    .line 98
    .line 99
    cmp-long v5, p1, v5

    .line 100
    .line 101
    if-eqz v10, :cond_7

    .line 102
    .line 103
    if-ltz v5, :cond_d

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_7
    if-lez v5, :cond_d

    .line 107
    .line 108
    :goto_2
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 109
    .line 110
    if-eqz v10, :cond_8

    .line 111
    .line 112
    move-object v8, v9

    .line 113
    :cond_8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {p0, v8, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 122
    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_9
    if-nez v4, :cond_a

    .line 126
    .line 127
    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    :cond_a
    if-eqz v10, :cond_b

    .line 132
    .line 133
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-gtz v5, :cond_d

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_b
    invoke-virtual {v3, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-gez v5, :cond_d

    .line 145
    .line 146
    :goto_3
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 147
    .line 148
    if-eqz v10, :cond_c

    .line 149
    .line 150
    move-object v8, v9

    .line 151
    :cond_c
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-direct {p0, v8, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :cond_d
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏哲世:Ljava/math/BigDecimal;

    .line 164
    .line 165
    if-eqz v3, :cond_10

    .line 166
    .line 167
    iget-wide v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:J

    .line 168
    .line 169
    cmp-long p0, v5, v0

    .line 170
    .line 171
    const-string v0, "multipleOf not match, expect multipleOf %s, but %s"

    .line 172
    .line 173
    if-eqz p0, :cond_e

    .line 174
    .line 175
    rem-long v5, p1, v5

    .line 176
    .line 177
    const-wide/16 v7, 0x0

    .line 178
    .line 179
    cmp-long p0, v5, v7

    .line 180
    .line 181
    if-eqz p0, :cond_e

    .line 182
    .line 183
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 184
    .line 185
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-direct {p0, v0, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 190
    .line 191
    .line 192
    return-object p0

    .line 193
    :cond_e
    if-nez v4, :cond_f

    .line 194
    .line 195
    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    :cond_f
    invoke-virtual {v4, v3}, Ljava/math/BigDecimal;->divideAndRemainder(Ljava/math/BigDecimal;)[Ljava/math/BigDecimal;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    const/4 v1, 0x1

    .line 204
    aget-object p0, p0, v1

    .line 205
    .line 206
    invoke-virtual {p0}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 211
    .line 212
    invoke-virtual {p0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    if-lez p0, :cond_10

    .line 217
    .line 218
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 219
    .line 220
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-direct {p0, v0, p1, v2}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 229
    .line 230
    .line 231
    return-object p0

    .line 232
    :cond_10
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 233
    .line 234
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世()Lcom/alibaba/fastjson2/JSONObject;
    .locals 9

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    const-string v1, "number"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/alibaba/fastjson2/JSONObject;->of(Ljava/lang/String;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:J

    .line 10
    .line 11
    const-wide/high16 v3, -0x8000000000000000L

    .line 12
    .line 13
    cmp-long v5, v1, v3

    .line 14
    .line 15
    const-string v6, "minimum"

    .line 16
    .line 17
    const-string v7, "exclusiveMinimum"

    .line 18
    .line 19
    iget-boolean v8, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Z

    .line 20
    .line 21
    if-eqz v5, :cond_1

    .line 22
    .line 23
    if-eqz v8, :cond_0

    .line 24
    .line 25
    move-object v6, v7

    .line 26
    :cond_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v6, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:Ljava/math/BigDecimal;

    .line 35
    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eqz v8, :cond_2

    .line 39
    .line 40
    move-object v6, v7

    .line 41
    :cond_2
    invoke-virtual {v0, v6, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_3
    :goto_0
    iget-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世哲苏:J

    .line 45
    .line 46
    cmp-long v5, v1, v3

    .line 47
    .line 48
    const-string v6, "maximum"

    .line 49
    .line 50
    const-string v7, "exclusiveMaximum"

    .line 51
    .line 52
    iget-boolean v8, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏世哲:Z

    .line 53
    .line 54
    if-eqz v5, :cond_5

    .line 55
    .line 56
    if-eqz v8, :cond_4

    .line 57
    .line 58
    move-object v6, v7

    .line 59
    :cond_4
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v0, v6, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_5
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Ljava/math/BigDecimal;

    .line 68
    .line 69
    if-eqz v1, :cond_7

    .line 70
    .line 71
    if-eqz v8, :cond_6

    .line 72
    .line 73
    move-object v6, v7

    .line 74
    :cond_6
    invoke-virtual {v0, v6, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    :cond_7
    :goto_1
    iget-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰哲世苏:J

    .line 78
    .line 79
    cmp-long v3, v1, v3

    .line 80
    .line 81
    const-string v4, "multipleOf"

    .line 82
    .line 83
    if-eqz v3, :cond_8

    .line 84
    .line 85
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {v0, v4, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_8
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰苏哲世:Ljava/math/BigDecimal;

    .line 94
    .line 95
    if-eqz p0, :cond_9

    .line 96
    .line 97
    invoke-virtual {v0, v4, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :cond_9
    return-object v0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Number:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
