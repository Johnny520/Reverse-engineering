.class public Lcom/alibaba/fastjson2/reader/飘花落叶言子楪兰哲苏世;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Lcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/util/function/BiConsumer;)V
    .locals 15

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object/from16 v8, p1

    .line 5
    .line 6
    move-object/from16 v12, p2

    .line 7
    .line 8
    move-object/from16 v6, p3

    .line 9
    .line 10
    move/from16 v2, p6

    .line 11
    .line 12
    move-wide/from16 v3, p7

    .line 13
    .line 14
    move-object/from16 v9, p9

    .line 15
    .line 16
    move-object/from16 v13, p10

    .line 17
    .line 18
    move-object/from16 v7, p11

    .line 19
    .line 20
    move-object/from16 v5, p12

    .line 21
    .line 22
    move-object/from16 v11, p13

    .line 23
    .line 24
    move-object/from16 v10, p14

    .line 25
    .line 26
    move-object/from16 v14, p15

    .line 27
    .line 28
    invoke-direct/range {v1 .. v14}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;-><init>(IJLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;Ljava/util/Locale;Ljava/util/function/BiConsumer;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰楪哲:Ljava/lang/reflect/Type;

    .line 32
    .line 33
    if-nez p5, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 41
    .line 42
    .line 43
    :goto_0
    if-nez p3, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-static/range {p3 .. p3}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/Class;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 51
    .line 52
    .line 53
    :goto_1
    if-eqz v9, :cond_2

    .line 54
    .line 55
    const-class v2, Ljava/util/Date;

    .line 56
    .line 57
    if-ne v0, v2, :cond_2

    .line 58
    .line 59
    new-instance v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;

    .line 60
    .line 61
    move-object/from16 v13, p10

    .line 62
    .line 63
    invoke-direct {v0, v9, v13}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 67
    .line 68
    :cond_2
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Ljava/util/Collection;
    .locals 2

    .line 1
    const-class v0, Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 4
    .line 5
    if-eq v1, v0, :cond_1

    .line 6
    .line 7
    const-class v0, Ljava/util/Collection;

    .line 8
    .line 9
    if-eq v1, v0, :cond_1

    .line 10
    .line 11
    const-class v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    if-ne v1, v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 21
    .line 22
    invoke-interface {p1, v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/util/Collection;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    :goto_0
    new-instance p0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    return-object p0
.end method

.method public final 飘花落叶言子楪兰哲世苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪兰哲苏世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, ".."

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, p2, p2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0, p1, p2, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 53
    .line 54
    if-eqz v3, :cond_4

    .line 55
    .line 56
    invoke-interface {v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲世苏兰()Ljava/util/function/Function;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    instance-of v3, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;

    .line 62
    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    move-object v1, v2

    .line 66
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;

    .line 67
    .line 68
    iget-object v1, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世楪苏哲;->飘花落叶言子楪苏世兰哲:Ljava/util/function/Function;

    .line 69
    .line 70
    :cond_5
    :goto_0
    iget-char v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 71
    .line 72
    const/16 v4, 0x5b

    .line 73
    .line 74
    if-ne v3, v4, :cond_9

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Ljava/util/Collection;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 85
    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_7

    .line 93
    .line 94
    if-eqz v1, :cond_6

    .line 95
    .line 96
    invoke-interface {v1, v4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object v4, v0

    .line 101
    check-cast v4, Ljava/util/Collection;

    .line 102
    .line 103
    :cond_6
    invoke-virtual {p0, p2, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_7
    invoke-virtual {p1, v0, v4}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子兰苏(ILjava/util/Collection;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_8

    .line 115
    .line 116
    move-object v7, p1

    .line 117
    goto :goto_2

    .line 118
    :cond_8
    const/4 v8, 0x0

    .line 119
    const-wide/16 v9, 0x0

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    move-object v6, p1

    .line 123
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    move-object v7, v6

    .line 128
    invoke-interface {v4, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 132
    .line 133
    .line 134
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 135
    .line 136
    move-object p1, v7

    .line 137
    goto :goto_1

    .line 138
    :cond_9
    move-object v7, p1

    .line 139
    const/16 p1, 0x7b

    .line 140
    .line 141
    if-ne v3, p1, :cond_c

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    instance-of p1, p1, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;

    .line 148
    .line 149
    if-eqz p1, :cond_c

    .line 150
    .line 151
    iget-boolean p1, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 152
    .line 153
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 154
    .line 155
    iget-wide v10, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 156
    .line 157
    if-eqz p1, :cond_a

    .line 158
    .line 159
    const/4 v8, 0x0

    .line 160
    const/4 v9, 0x0

    .line 161
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    goto :goto_3

    .line 166
    :cond_a
    const/4 v8, 0x0

    .line 167
    const/4 v9, 0x0

    .line 168
    invoke-interface/range {v6 .. v11}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    :goto_3
    iget-wide v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 173
    .line 174
    invoke-interface {v2, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Ljava/util/Collection;

    .line 179
    .line 180
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    if-eqz v1, :cond_b

    .line 184
    .line 185
    invoke-interface {v1, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    move-object v0, p1

    .line 190
    check-cast v0, Ljava/util/Collection;

    .line 191
    .line 192
    :cond_b
    invoke-virtual {p0, p2, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_c
    iget-boolean p1, v7, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 200
    .line 201
    move-object v3, v7

    .line 202
    iget-wide v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 203
    .line 204
    if-eqz p1, :cond_d

    .line 205
    .line 206
    const/4 v4, 0x0

    .line 207
    const/4 v5, 0x0

    .line 208
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    goto :goto_4

    .line 213
    :cond_d
    move-wide v0, v6

    .line 214
    move-object v7, v3

    .line 215
    const/4 v4, 0x0

    .line 216
    const/4 v5, 0x0

    .line 217
    move-wide v6, v0

    .line 218
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    :goto_4
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    iget-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, -0x1

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲兰世子苏()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-ne v0, v4, :cond_0

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    new-array v2, v0, [Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    :goto_0
    if-ge v3, v0, :cond_1

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    move-object v5, p1

    .line 30
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    aput-object p0, v2, v3

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_2
    move-object v5, p1

    .line 45
    iget-char p1, v5, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 46
    .line 47
    const/16 v0, 0x5b

    .line 48
    .line 49
    if-ne p1, v0, :cond_4

    .line 50
    .line 51
    move-object v6, v5

    .line 52
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世兰苏(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-virtual {v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_3

    .line 68
    .line 69
    const/4 v8, 0x0

    .line 70
    const-wide/16 v9, 0x0

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    invoke-interface/range {v5 .. v10}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    move-object v0, v5

    .line 78
    move-object v5, v6

    .line 79
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 83
    .line 84
    .line 85
    move-object v5, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v5, v6

    .line 88
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_4
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_6

    .line 97
    .line 98
    invoke-virtual {v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰楪哲:Ljava/lang/reflect/Type;

    .line 103
    .line 104
    instance-of v6, v0, Ljava/lang/Class;

    .line 105
    .line 106
    if-eqz v6, :cond_6

    .line 107
    .line 108
    const-class v6, Ljava/lang/Number;

    .line 109
    .line 110
    check-cast v0, Ljava/lang/Class;

    .line 111
    .line 112
    invoke-virtual {v6, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    iget-object v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 121
    .line 122
    const-class v6, Ljava/lang/String;

    .line 123
    .line 124
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰楪哲:Ljava/lang/reflect/Type;

    .line 125
    .line 126
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-eqz v0, :cond_6

    .line 131
    .line 132
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪兰哲苏世;->飘花落叶言子世楪哲苏兰(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Ljava/util/Collection;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const/16 v1, 0x2c

    .line 137
    .line 138
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eq v1, v4, :cond_5

    .line 143
    .line 144
    const-string v1, ","

    .line 145
    .line 146
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    array-length v1, p1

    .line 151
    :goto_2
    if-ge v3, v1, :cond_5

    .line 152
    .line 153
    aget-object v2, p1, v3

    .line 154
    .line 155
    invoke-interface {v0, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-interface {p0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    return-object p0

    .line 166
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v0, "TODO : "

    .line 169
    .line 170
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-virtual {v5, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    return-object v2
.end method
