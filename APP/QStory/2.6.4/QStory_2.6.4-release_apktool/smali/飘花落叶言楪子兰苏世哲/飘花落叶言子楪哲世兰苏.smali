.class public abstract L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;
.super L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世兰哲楪苏:Z

.field public final 飘花落叶言子世兰哲苏楪:Z

.field public final 飘花落叶言子世兰楪哲苏:Z

.field public 飘花落叶言子世兰楪苏哲:Ljava/time/format/DateTimeFormatter;

.field public final 飘花落叶言子世兰苏哲楪:Z

.field public final 飘花落叶言子世兰苏楪哲:Z

.field public 飘花落叶言子苏楪世兰哲:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;

.field public final 飘花落叶言子苏楪世哲兰:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 12

    .line 1
    const/4 v6, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move-wide v3, p3

    .line 6
    move-object/from16 v5, p5

    .line 7
    .line 8
    move-object/from16 v7, p6

    .line 9
    .line 10
    move-object/from16 v8, p7

    .line 11
    .line 12
    move-object/from16 v9, p8

    .line 13
    .line 14
    move-object/from16 v10, p9

    .line 15
    .line 16
    move-object/from16 v11, p10

    .line 17
    .line 18
    invoke-direct/range {v0 .. v11}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    if-eqz v5, :cond_6

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/4 v1, 0x1

    .line 29
    const/4 v2, -0x1

    .line 30
    sparse-switch p2, :sswitch_data_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :sswitch_0
    const-string p2, "iso8601"

    .line 35
    .line 36
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v2, 0x5

    .line 44
    goto :goto_0

    .line 45
    :sswitch_1
    const-string p2, "yyyyMMddHHmmss"

    .line 46
    .line 47
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-nez p2, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v2, 0x4

    .line 55
    goto :goto_0

    .line 56
    :sswitch_2
    const-string p2, "yyyy-MM-dd HH:mm:ss"

    .line 57
    .line 58
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-nez p2, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v2, 0x3

    .line 66
    goto :goto_0

    .line 67
    :sswitch_3
    const-string p2, "yyyyMMdd"

    .line 68
    .line 69
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    const/4 v2, 0x2

    .line 77
    goto :goto_0

    .line 78
    :sswitch_4
    const-string p2, "unixtime"

    .line 79
    .line 80
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_4

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    move v2, v1

    .line 88
    goto :goto_0

    .line 89
    :sswitch_5
    const-string p2, "millis"

    .line 90
    .line 91
    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-nez p2, :cond_5

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_5
    move v2, p1

    .line 99
    :goto_0
    packed-switch v2, :pswitch_data_0

    .line 100
    .line 101
    .line 102
    goto :goto_3

    .line 103
    :pswitch_0
    move p2, p1

    .line 104
    move v2, p2

    .line 105
    :goto_1
    move v3, v2

    .line 106
    move v4, v3

    .line 107
    goto :goto_4

    .line 108
    :pswitch_1
    move p2, p1

    .line 109
    move v2, p2

    .line 110
    move v4, v2

    .line 111
    move v3, v1

    .line 112
    :goto_2
    move v1, v4

    .line 113
    goto :goto_4

    .line 114
    :pswitch_2
    move p2, p1

    .line 115
    move v2, p2

    .line 116
    move v3, v2

    .line 117
    move v4, v1

    .line 118
    move v1, v3

    .line 119
    goto :goto_4

    .line 120
    :pswitch_3
    move p2, p1

    .line 121
    move v3, p2

    .line 122
    move v4, v3

    .line 123
    move v2, v1

    .line 124
    goto :goto_2

    .line 125
    :pswitch_4
    move v2, p1

    .line 126
    move v3, v2

    .line 127
    move v4, v3

    .line 128
    move p2, v1

    .line 129
    goto :goto_2

    .line 130
    :pswitch_5
    move p2, p1

    .line 131
    move v2, p2

    .line 132
    move v3, v2

    .line 133
    move v4, v3

    .line 134
    move p1, v1

    .line 135
    goto :goto_2

    .line 136
    :cond_6
    :goto_3
    move p2, p1

    .line 137
    move v1, p2

    .line 138
    move v2, v1

    .line 139
    goto :goto_1

    .line 140
    :goto_4
    iput-boolean p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰楪哲苏:Z

    .line 141
    .line 142
    iput-boolean v1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰苏楪哲:Z

    .line 143
    .line 144
    iput-boolean p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏楪世哲兰:Z

    .line 145
    .line 146
    iput-boolean v2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰苏哲楪:Z

    .line 147
    .line 148
    iput-boolean v3, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰哲楪苏:Z

    .line 149
    .line 150
    iput-boolean v4, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰哲苏楪:Z

    .line 151
    .line 152
    return-void

    .line 153
    :sswitch_data_0
    .sparse-switch
        -0x400565ba -> :sswitch_5
        -0x112ad7ab -> :sswitch_4
        -0x10781ba0 -> :sswitch_3
        0x4f76f1a0 -> :sswitch_2
        0x5069d960 -> :sswitch_1
        0x7ce21384 -> :sswitch_0
    .end sparse-switch

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p2, v0, :cond_2

    .line 4
    .line 5
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子兰苏世哲/飘花落叶言楪子世苏兰哲;

    .line 8
    .line 9
    iget-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏楪世兰哲:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;

    .line 10
    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    sget-object p1, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;

    .line 21
    .line 22
    iput-object p1, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏楪世兰哲:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance p2, L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {p2, p1, v0}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏楪世兰哲:L飘花落叶言楪子兰苏世哲/飘花落叶言子哲兰苏世楪;

    .line 32
    .line 33
    :cond_1
    return-object p2

    .line 34
    :cond_2
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/Class;)L飘花落叶言楪子兰苏世哲/飘花落叶言子苏兰楪哲世;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;J)V
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    iget-boolean v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪兰世苏哲:Z

    .line 8
    .line 9
    if-eqz v4, :cond_0

    .line 10
    .line 11
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世子苏哲兰(J)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 19
    .line 20
    iget-boolean v5, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子苏楪世哲兰:Z

    .line 21
    .line 22
    const-wide/16 v6, 0x3e8

    .line 23
    .line 24
    if-nez v5, :cond_16

    .line 25
    .line 26
    iget-boolean v8, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰楪哲苏:Z

    .line 27
    .line 28
    if-nez v8, :cond_15

    .line 29
    .line 30
    iget-wide v9, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 31
    .line 32
    invoke-virtual {v1, v9, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏兰世哲(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v9

    .line 36
    sget-object v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriterUtilDateAsMillis:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 37
    .line 38
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 39
    .line 40
    and-long/2addr v9, v11

    .line 41
    const-wide/16 v11, 0x0

    .line 42
    .line 43
    cmp-long v9, v9, v11

    .line 44
    .line 45
    if-eqz v9, :cond_1

    .line 46
    .line 47
    goto/16 :goto_8

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    iget-object v13, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v13, :cond_2

    .line 56
    .line 57
    move-object v14, v13

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    const/4 v14, 0x0

    .line 60
    :goto_0
    iget-boolean v15, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰哲楪苏:Z

    .line 61
    .line 62
    move-wide/from16 v16, v11

    .line 63
    .line 64
    iget-boolean v11, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰哲苏楪:Z

    .line 65
    .line 66
    if-eqz v14, :cond_4

    .line 67
    .line 68
    if-nez v15, :cond_4

    .line 69
    .line 70
    if-eqz v11, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move/from16 v19, v5

    .line 74
    .line 75
    move-object v7, v13

    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_4
    :goto_1
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v18

    .line 82
    sget-object v12, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 83
    .line 84
    if-eq v9, v12, :cond_6

    .line 85
    .line 86
    invoke-virtual {v9}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 87
    .line 88
    .line 89
    move-result-object v12

    .line 90
    sget-object v14, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 91
    .line 92
    if-ne v12, v14, :cond_5

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_5
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    invoke-virtual {v9}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 100
    .line 101
    .line 102
    move-result-object v14

    .line 103
    invoke-virtual {v14, v12}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-virtual {v12}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    goto :goto_3

    .line 112
    :cond_6
    :goto_2
    invoke-static/range {v18 .. v19}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(J)I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    :goto_3
    int-to-long v6, v12

    .line 117
    add-long v6, v18, v6

    .line 118
    .line 119
    move v14, v11

    .line 120
    const-wide/32 v10, 0x15180

    .line 121
    .line 122
    .line 123
    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 124
    .line 125
    .line 126
    move-result-wide v18

    .line 127
    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->floorMod(JJ)J

    .line 128
    .line 129
    .line 130
    move-result-wide v6

    .line 131
    long-to-int v6, v6

    .line 132
    const-wide/32 v10, 0xafa6c

    .line 133
    .line 134
    .line 135
    add-long v10, v18, v10

    .line 136
    .line 137
    cmp-long v7, v10, v16

    .line 138
    .line 139
    const-wide/16 v22, 0x1

    .line 140
    .line 141
    const-wide/32 v24, 0x23ab1

    .line 142
    .line 143
    .line 144
    const-wide/16 v26, 0x190

    .line 145
    .line 146
    if-gez v7, :cond_7

    .line 147
    .line 148
    const-wide/32 v28, 0xafa6d

    .line 149
    .line 150
    .line 151
    add-long v18, v18, v28

    .line 152
    .line 153
    div-long v18, v18, v24

    .line 154
    .line 155
    move-object v7, v13

    .line 156
    sub-long v12, v18, v22

    .line 157
    .line 158
    mul-long v18, v12, v26

    .line 159
    .line 160
    neg-long v12, v12

    .line 161
    mul-long v12, v12, v24

    .line 162
    .line 163
    add-long/2addr v10, v12

    .line 164
    goto :goto_4

    .line 165
    :cond_7
    move-object v7, v13

    .line 166
    move-wide/from16 v18, v16

    .line 167
    .line 168
    :goto_4
    mul-long v12, v10, v26

    .line 169
    .line 170
    const-wide/16 v29, 0x24f

    .line 171
    .line 172
    add-long v12, v12, v29

    .line 173
    .line 174
    div-long v12, v12, v24

    .line 175
    .line 176
    const-wide/16 v24, 0x16d

    .line 177
    .line 178
    mul-long v29, v12, v24

    .line 179
    .line 180
    const-wide/16 v31, 0x4

    .line 181
    .line 182
    div-long v33, v12, v31

    .line 183
    .line 184
    add-long v33, v33, v29

    .line 185
    .line 186
    const-wide/16 v29, 0x64

    .line 187
    .line 188
    div-long v35, v12, v29

    .line 189
    .line 190
    sub-long v33, v33, v35

    .line 191
    .line 192
    div-long v35, v12, v26

    .line 193
    .line 194
    add-long v35, v35, v33

    .line 195
    .line 196
    sub-long v33, v10, v35

    .line 197
    .line 198
    cmp-long v35, v33, v16

    .line 199
    .line 200
    if-gez v35, :cond_8

    .line 201
    .line 202
    sub-long v12, v12, v22

    .line 203
    .line 204
    mul-long v24, v24, v12

    .line 205
    .line 206
    div-long v22, v12, v31

    .line 207
    .line 208
    add-long v22, v22, v24

    .line 209
    .line 210
    div-long v24, v12, v29

    .line 211
    .line 212
    sub-long v22, v22, v24

    .line 213
    .line 214
    div-long v24, v12, v26

    .line 215
    .line 216
    add-long v24, v24, v22

    .line 217
    .line 218
    sub-long v33, v10, v24

    .line 219
    .line 220
    :cond_8
    move-wide/from16 v10, v33

    .line 221
    .line 222
    add-long v12, v12, v18

    .line 223
    .line 224
    long-to-int v10, v10

    .line 225
    mul-int/lit8 v11, v10, 0x5

    .line 226
    .line 227
    add-int/lit8 v11, v11, 0x2

    .line 228
    .line 229
    div-int/lit16 v11, v11, 0x99

    .line 230
    .line 231
    add-int/lit8 v18, v11, 0x2

    .line 232
    .line 233
    rem-int/lit8 v18, v18, 0xc

    .line 234
    .line 235
    add-int/lit8 v18, v18, 0x1

    .line 236
    .line 237
    mul-int/lit16 v1, v11, 0x132

    .line 238
    .line 239
    add-int/lit8 v1, v1, 0x5

    .line 240
    .line 241
    div-int/lit8 v1, v1, 0xa

    .line 242
    .line 243
    sub-int/2addr v10, v1

    .line 244
    add-int/lit8 v10, v10, 0x1

    .line 245
    .line 246
    div-int/lit8 v11, v11, 0xa

    .line 247
    .line 248
    move-object v1, v4

    .line 249
    move/from16 v19, v5

    .line 250
    .line 251
    int-to-long v4, v11

    .line 252
    add-long/2addr v12, v4

    .line 253
    const-wide/32 v4, -0x3b9ac9ff

    .line 254
    .line 255
    .line 256
    cmp-long v4, v12, v4

    .line 257
    .line 258
    if-ltz v4, :cond_14

    .line 259
    .line 260
    const-wide/32 v4, 0x3b9ac9ff

    .line 261
    .line 262
    .line 263
    cmp-long v4, v12, v4

    .line 264
    .line 265
    if-gtz v4, :cond_14

    .line 266
    .line 267
    move-object v4, v1

    .line 268
    long-to-int v1, v12

    .line 269
    int-to-long v5, v6

    .line 270
    cmp-long v11, v5, v16

    .line 271
    .line 272
    if-ltz v11, :cond_13

    .line 273
    .line 274
    const-wide/32 v11, 0x1517f

    .line 275
    .line 276
    .line 277
    cmp-long v11, v5, v11

    .line 278
    .line 279
    if-gtz v11, :cond_13

    .line 280
    .line 281
    const-wide/16 v11, 0xe10

    .line 282
    .line 283
    div-long v11, v5, v11

    .line 284
    .line 285
    long-to-int v11, v11

    .line 286
    mul-int/lit16 v12, v11, 0xe10

    .line 287
    .line 288
    int-to-long v12, v12

    .line 289
    sub-long/2addr v5, v12

    .line 290
    const-wide/16 v12, 0x3c

    .line 291
    .line 292
    div-long v12, v5, v12

    .line 293
    .line 294
    long-to-int v13, v12

    .line 295
    mul-int/lit8 v12, v13, 0x3c

    .line 296
    .line 297
    move-object/from16 v16, v4

    .line 298
    .line 299
    move-wide/from16 v22, v5

    .line 300
    .line 301
    int-to-long v4, v12

    .line 302
    sub-long v5, v22, v4

    .line 303
    .line 304
    long-to-int v6, v5

    .line 305
    if-ltz v1, :cond_c

    .line 306
    .line 307
    const/16 v12, 0x270f

    .line 308
    .line 309
    if-gt v1, v12, :cond_c

    .line 310
    .line 311
    if-eqz v15, :cond_9

    .line 312
    .line 313
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 314
    .line 315
    .line 316
    move-object/from16 v0, p1

    .line 317
    .line 318
    move v3, v10

    .line 319
    move v4, v11

    .line 320
    move v5, v13

    .line 321
    move/from16 v2, v18

    .line 322
    .line 323
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世(IIIIII)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :cond_9
    move v4, v11

    .line 328
    move v5, v13

    .line 329
    if-eqz v14, :cond_a

    .line 330
    .line 331
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 332
    .line 333
    .line 334
    move-object/from16 v0, p1

    .line 335
    .line 336
    move v3, v10

    .line 337
    move/from16 v2, v18

    .line 338
    .line 339
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世楪苏(IIIIII)V

    .line 340
    .line 341
    .line 342
    return-void

    .line 343
    :cond_a
    const-wide/16 v7, 0x3e8

    .line 344
    .line 345
    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->floorMod(JJ)J

    .line 346
    .line 347
    .line 348
    move-result-wide v7

    .line 349
    long-to-int v7, v7

    .line 350
    if-eqz v7, :cond_b

    .line 351
    .line 352
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual/range {v16 .. v16}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-virtual {v3}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v3, v2}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-virtual {v2}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 369
    .line 370
    .line 371
    move-result v8

    .line 372
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 373
    .line 374
    .line 375
    const/4 v9, 0x0

    .line 376
    move-object/from16 v0, p1

    .line 377
    .line 378
    move v3, v10

    .line 379
    move/from16 v2, v18

    .line 380
    .line 381
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世苏楪(IIIIIIIIZ)V

    .line 382
    .line 383
    .line 384
    return-void

    .line 385
    :cond_b
    move v3, v10

    .line 386
    move/from16 v2, v18

    .line 387
    .line 388
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 389
    .line 390
    .line 391
    move-object/from16 v0, p1

    .line 392
    .line 393
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世楪苏(IIIIII)V

    .line 394
    .line 395
    .line 396
    return-void

    .line 397
    :cond_c
    :goto_5
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 398
    .line 399
    .line 400
    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-static {v1, v9}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    iget-boolean v2, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰苏楪哲:Z

    .line 409
    .line 410
    if-nez v2, :cond_d

    .line 411
    .line 412
    move-object v9, v1

    .line 413
    move-object/from16 v1, p1

    .line 414
    .line 415
    goto :goto_6

    .line 416
    :cond_d
    move-object v3, v1

    .line 417
    invoke-virtual {v3}, Ljava/time/ZonedDateTime;->getYear()I

    .line 418
    .line 419
    .line 420
    move-result v1

    .line 421
    if-ltz v1, :cond_e

    .line 422
    .line 423
    const/16 v12, 0x270f

    .line 424
    .line 425
    if-gt v1, v12, :cond_e

    .line 426
    .line 427
    invoke-virtual {v3}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    move-object v4, v3

    .line 432
    invoke-virtual {v4}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    move-object v5, v4

    .line 437
    invoke-virtual {v5}, Ljava/time/ZonedDateTime;->getHour()I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    move-object v6, v5

    .line 442
    invoke-virtual {v6}, Ljava/time/ZonedDateTime;->getMinute()I

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    move-object v9, v6

    .line 447
    invoke-virtual {v9}, Ljava/time/ZonedDateTime;->getSecond()I

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    invoke-virtual {v9}, Ljava/time/ZonedDateTime;->getNano()I

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    const v7, 0xf4240

    .line 456
    .line 457
    .line 458
    div-int v7, v0, v7

    .line 459
    .line 460
    invoke-virtual {v9}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v0}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 465
    .line 466
    .line 467
    move-result v8

    .line 468
    const/4 v9, 0x1

    .line 469
    move-object/from16 v0, p1

    .line 470
    .line 471
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲世苏楪(IIIIIIIIZ)V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :cond_e
    move-object/from16 v1, p1

    .line 476
    .line 477
    move-object v9, v3

    .line 478
    :goto_6
    iget-boolean v3, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰苏哲楪:Z

    .line 479
    .line 480
    if-eqz v3, :cond_f

    .line 481
    .line 482
    invoke-virtual {v9}, Ljava/time/ZonedDateTime;->getYear()I

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    if-ltz v3, :cond_f

    .line 487
    .line 488
    const/16 v12, 0x270f

    .line 489
    .line 490
    if-gt v3, v12, :cond_f

    .line 491
    .line 492
    invoke-virtual {v9}, Ljava/time/ZonedDateTime;->getMonthValue()I

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    invoke-virtual {v9}, Ljava/time/ZonedDateTime;->getDayOfMonth()I

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    invoke-virtual {v1, v3, v0, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲苏世楪(III)V

    .line 501
    .line 502
    .line 503
    return-void

    .line 504
    :cond_f
    iget-object v3, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰楪苏哲:Ljava/time/format/DateTimeFormatter;

    .line 505
    .line 506
    if-nez v3, :cond_10

    .line 507
    .line 508
    if-eqz v7, :cond_10

    .line 509
    .line 510
    if-nez v8, :cond_10

    .line 511
    .line 512
    if-nez v2, :cond_10

    .line 513
    .line 514
    if-nez v19, :cond_10

    .line 515
    .line 516
    invoke-static {v7}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 517
    .line 518
    .line 519
    move-result-object v2

    .line 520
    iput-object v2, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰楪苏哲:Ljava/time/format/DateTimeFormatter;

    .line 521
    .line 522
    :cond_10
    iget-object v0, v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪哲世兰苏;->飘花落叶言子世兰楪苏哲:Ljava/time/format/DateTimeFormatter;

    .line 523
    .line 524
    if-nez v0, :cond_11

    .line 525
    .line 526
    const/4 v10, 0x0

    .line 527
    goto :goto_7

    .line 528
    :cond_11
    move-object v10, v0

    .line 529
    :goto_7
    if-eqz v10, :cond_12

    .line 530
    .line 531
    invoke-virtual {v10, v9}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪世兰哲子苏(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    return-void

    .line 539
    :cond_12
    invoke-virtual {v1, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪苏哲子兰世(Ljava/time/ZonedDateTime;)V

    .line 540
    .line 541
    .line 542
    return-void

    .line 543
    :cond_13
    new-instance v0, Ljava/time/DateTimeException;

    .line 544
    .line 545
    const-string v1, "Invalid secondOfDay "

    .line 546
    .line 547
    invoke-static {v5, v6, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v1

    .line 551
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    throw v0

    .line 555
    :cond_14
    new-instance v0, Ljava/time/DateTimeException;

    .line 556
    .line 557
    const-string v1, "Invalid year "

    .line 558
    .line 559
    invoke-static {v12, v13, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世(JLjava/lang/String;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 564
    .line 565
    .line 566
    throw v0

    .line 567
    :cond_15
    :goto_8
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual/range {p1 .. p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :cond_16
    invoke-virtual/range {p0 .. p1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;)V

    .line 575
    .line 576
    .line 577
    const-wide/16 v20, 0x3e8

    .line 578
    .line 579
    div-long v2, v2, v20

    .line 580
    .line 581
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲兰世苏(J)V

    .line 582
    .line 583
    .line 584
    return-void
.end method
