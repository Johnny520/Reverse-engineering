.class public Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

.field public final 飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Type;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

.field public final 飘花落叶言子楪苏世兰哲:Ljava/util/function/Function;

.field public final 飘花落叶言子楪苏世哲兰:J

.field public 飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

.field public 飘花落叶言子楪苏兰哲世:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

.field public final 飘花落叶言子楪苏哲世兰:Z

.field public final 飘花落叶言子楪苏哲兰世:Ljava/lang/reflect/Constructor;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;JLjava/util/function/Function;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-ne p3, v0, :cond_0

    .line 8
    .line 9
    move-object p3, v1

    .line 10
    :cond_0
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 13
    .line 14
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Type;

    .line 15
    .line 16
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 17
    .line 18
    invoke-static {p4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 23
    .line 24
    iput-wide p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏世哲兰:J

    .line 25
    .line 26
    iput-object p7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏世兰哲:Ljava/util/function/Function;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    const/4 p3, 0x1

    .line 30
    if-eqz p2, :cond_1

    .line 31
    .line 32
    const-string p4, "org.springframework.util.LinkedMultiValueMap"

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p5

    .line 38
    invoke-virtual {p4, p5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p4

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    move p4, p3

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move p4, p1

    .line 47
    :goto_0
    iput-boolean p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏哲世兰:Z

    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    array-length p4, p2

    .line 54
    :goto_1
    if-ge p1, p4, :cond_3

    .line 55
    .line 56
    aget-object p5, p2, p1

    .line 57
    .line 58
    invoke-virtual {p5}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 59
    .line 60
    .line 61
    move-result p6

    .line 62
    if-nez p6, :cond_2

    .line 63
    .line 64
    invoke-virtual {p5}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 65
    .line 66
    .line 67
    move-result p6

    .line 68
    invoke-static {p6}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 69
    .line 70
    .line 71
    move-result p6

    .line 72
    if-nez p6, :cond_2

    .line 73
    .line 74
    invoke-virtual {p5, p3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 75
    .line 76
    .line 77
    move-object v1, p5

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    :goto_2
    iput-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏哲兰世:Ljava/lang/reflect/Constructor;

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_1

    .line 10
    .line 11
    :try_start_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏哲兰世:Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-object p0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    const-string p1, "create map error"

    .line 28
    .line 29
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    new-instance p0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子世苏哲兰()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    if-nez v2, :cond_2

    .line 14
    .line 15
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iput-boolean v4, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏楪世()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return-object v7

    .line 30
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "expect \'{\', but \'"

    .line 33
    .line 34
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-char v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v2, "\'"

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v7

    .line 59
    :cond_2
    :goto_0
    iget-wide v2, v3, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 60
    .line 61
    or-long v8, v2, p4

    .line 62
    .line 63
    const-class v2, Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object v10, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Type;

    .line 66
    .line 67
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 68
    .line 69
    if-ne v3, v2, :cond_3

    .line 70
    .line 71
    new-instance v2, Ljava/util/HashMap;

    .line 72
    .line 73
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 74
    .line 75
    .line 76
    :goto_1
    move-object v11, v2

    .line 77
    move v12, v4

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    const-class v2, Ljava/util/EnumMap;

    .line 80
    .line 81
    if-ne v3, v2, :cond_4

    .line 82
    .line 83
    instance-of v2, v10, Ljava/lang/Class;

    .line 84
    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    new-instance v2, Ljava/util/EnumMap;

    .line 88
    .line 89
    move-object v3, v10

    .line 90
    check-cast v3, Ljava/lang/Class;

    .line 91
    .line 92
    invoke-direct {v2, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-virtual {v0, v8, v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    check-cast v2, Ljava/util/Map;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :goto_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲苏世楪()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-nez v2, :cond_1c

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世苏楪()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    goto/16 :goto_b

    .line 116
    .line 117
    :cond_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    const-string v3, "illegal json"

    .line 122
    .line 123
    const-wide/16 v13, 0x0

    .line 124
    .line 125
    const/16 v15, 0x3a

    .line 126
    .line 127
    if-eqz v2, :cond_7

    .line 128
    .line 129
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世哲楪(C)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_6

    .line 134
    .line 135
    move-object v3, v1

    .line 136
    move-wide/from16 v16, v13

    .line 137
    .line 138
    move-wide/from16 v13, p4

    .line 139
    .line 140
    goto/16 :goto_7

    .line 141
    .line 142
    :cond_6
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-object v7

    .line 150
    :cond_7
    const-class v2, Ljava/lang/String;

    .line 151
    .line 152
    const-string v4, "@type"

    .line 153
    .line 154
    if-ne v10, v2, :cond_c

    .line 155
    .line 156
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子苏兰哲()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-nez v12, :cond_9

    .line 161
    .line 162
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 163
    .line 164
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 165
    .line 166
    and-long/2addr v5, v8

    .line 167
    cmp-long v5, v5, v13

    .line 168
    .line 169
    if-eqz v5, :cond_9

    .line 170
    .line 171
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_9

    .line 176
    .line 177
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世兰苏子()J

    .line 178
    .line 179
    .line 180
    move-result-wide v2

    .line 181
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 182
    .line 183
    move-wide/from16 v4, p4

    .line 184
    .line 185
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲楪世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    move-wide v5, v4

    .line 190
    if-eqz v2, :cond_8

    .line 191
    .line 192
    instance-of v3, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;

    .line 193
    .line 194
    if-eqz v3, :cond_8

    .line 195
    .line 196
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    check-cast v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;

    .line 201
    .line 202
    iget-object v4, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 203
    .line 204
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_8

    .line 209
    .line 210
    invoke-virtual {v2, v5, v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    check-cast v2, Ljava/util/Map;

    .line 215
    .line 216
    move-object v11, v2

    .line 217
    :cond_8
    :goto_3
    move-wide v13, v5

    .line 218
    goto/16 :goto_a

    .line 219
    .line 220
    :cond_9
    move-wide/from16 v5, p4

    .line 221
    .line 222
    if-nez v2, :cond_a

    .line 223
    .line 224
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-virtual {v1, v15}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世哲楪(C)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_b

    .line 233
    .line 234
    :cond_a
    move-object v3, v1

    .line 235
    :goto_4
    move-object v7, v2

    .line 236
    move-wide/from16 v16, v13

    .line 237
    .line 238
    move-wide v13, v5

    .line 239
    goto/16 :goto_7

    .line 240
    .line 241
    :cond_b
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世(Ljava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    return-object v7

    .line 249
    :cond_c
    move-wide/from16 v5, p4

    .line 250
    .line 251
    const-class v2, Ljava/lang/Enum;

    .line 252
    .line 253
    if-nez v12, :cond_10

    .line 254
    .line 255
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 256
    .line 257
    invoke-virtual {v1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰世楪苏(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 258
    .line 259
    .line 260
    move-result v3

    .line 261
    if-nez v3, :cond_d

    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_d
    iget-char v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 265
    .line 266
    const/16 v7, 0x22

    .line 267
    .line 268
    if-ne v3, v7, :cond_10

    .line 269
    .line 270
    instance-of v3, v10, Ljava/lang/Class;

    .line 271
    .line 272
    if-eqz v3, :cond_e

    .line 273
    .line 274
    move-object v3, v10

    .line 275
    check-cast v3, Ljava/lang/Class;

    .line 276
    .line 277
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-nez v3, :cond_10

    .line 282
    .line 283
    :cond_e
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子苏兰哲()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-eqz v3, :cond_f

    .line 292
    .line 293
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世兰苏子()J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 298
    .line 299
    move-wide/from16 v4, p4

    .line 300
    .line 301
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲楪世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    move-wide v5, v4

    .line 306
    if-eqz v2, :cond_8

    .line 307
    .line 308
    instance-of v1, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;

    .line 309
    .line 310
    if-eqz v1, :cond_8

    .line 311
    .line 312
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;

    .line 317
    .line 318
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 319
    .line 320
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-nez v1, :cond_8

    .line 325
    .line 326
    invoke-virtual {v2, v5, v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    check-cast v1, Ljava/util/Map;

    .line 331
    .line 332
    move-object v11, v1

    .line 333
    goto :goto_3

    .line 334
    :cond_f
    invoke-static {v2, v10}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    move-object/from16 v3, p1

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_10
    :goto_5
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰哲世:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 342
    .line 343
    if-eqz v1, :cond_11

    .line 344
    .line 345
    move-object v3, v4

    .line 346
    const/4 v4, 0x0

    .line 347
    const-wide/16 v5, 0x0

    .line 348
    .line 349
    move-object v7, v3

    .line 350
    const/4 v3, 0x0

    .line 351
    move-wide/from16 v16, v13

    .line 352
    .line 353
    move-object v13, v7

    .line 354
    move-object v7, v2

    .line 355
    move-object/from16 v2, p1

    .line 356
    .line 357
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    goto :goto_6

    .line 362
    :cond_11
    move-object v7, v2

    .line 363
    move-wide/from16 v16, v13

    .line 364
    .line 365
    move-object/from16 v2, p1

    .line 366
    .line 367
    move-object v13, v4

    .line 368
    invoke-virtual {v2, v10}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子苏哲兰世(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    :goto_6
    if-nez v1, :cond_12

    .line 373
    .line 374
    move-object v3, v10

    .line 375
    check-cast v3, Ljava/lang/Class;

    .line 376
    .line 377
    invoke-virtual {v7, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 378
    .line 379
    .line 380
    move-result v3

    .line 381
    if-eqz v3, :cond_12

    .line 382
    .line 383
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    invoke-virtual {v2, v15}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世哲楪(C)Z

    .line 388
    .line 389
    .line 390
    :cond_12
    if-nez v12, :cond_13

    .line 391
    .line 392
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 393
    .line 394
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 395
    .line 396
    and-long/2addr v3, v8

    .line 397
    cmp-long v3, v3, v16

    .line 398
    .line 399
    if-eqz v3, :cond_13

    .line 400
    .line 401
    invoke-virtual {v1, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    if-eqz v3, :cond_13

    .line 406
    .line 407
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世兰苏子()J

    .line 408
    .line 409
    .line 410
    move-result-wide v2

    .line 411
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 412
    .line 413
    move-object/from16 v1, p1

    .line 414
    .line 415
    move-wide/from16 v4, p4

    .line 416
    .line 417
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲楪世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    move-object v3, v1

    .line 422
    move-wide v13, v4

    .line 423
    if-eqz v2, :cond_1b

    .line 424
    .line 425
    instance-of v1, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;

    .line 426
    .line 427
    if-eqz v1, :cond_1b

    .line 428
    .line 429
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    check-cast v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;

    .line 434
    .line 435
    iget-object v4, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/Class;

    .line 436
    .line 437
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v1

    .line 441
    if-nez v1, :cond_1b

    .line 442
    .line 443
    invoke-virtual {v2, v13, v14}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v1, Ljava/util/Map;

    .line 448
    .line 449
    move-object v11, v1

    .line 450
    goto/16 :goto_a

    .line 451
    .line 452
    :cond_13
    move-wide/from16 v13, p4

    .line 453
    .line 454
    move-object v3, v2

    .line 455
    invoke-virtual {v3, v15}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏世哲楪(C)Z

    .line 456
    .line 457
    .line 458
    move-object v7, v1

    .line 459
    :goto_7
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 460
    .line 461
    if-nez v1, :cond_14

    .line 462
    .line 463
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 464
    .line 465
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世楪哲(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 470
    .line 471
    :cond_14
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 472
    .line 473
    .line 474
    move-result v1

    .line 475
    if-eqz v1, :cond_16

    .line 476
    .line 477
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    const-string v2, ".."

    .line 482
    .line 483
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    if-eqz v2, :cond_15

    .line 488
    .line 489
    move-object v1, v11

    .line 490
    goto :goto_9

    .line 491
    :cond_15
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    invoke-virtual {v3, v11, v7, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 496
    .line 497
    .line 498
    goto/16 :goto_a

    .line 499
    .line 500
    :cond_16
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏哲世兰:Z

    .line 501
    .line 502
    if-eqz v1, :cond_18

    .line 503
    .line 504
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲苏楪()Z

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    if-eqz v1, :cond_18

    .line 509
    .line 510
    new-instance v15, Lcom/alibaba/fastjson2/JSONArray;

    .line 511
    .line 512
    invoke-direct {v15}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 513
    .line 514
    .line 515
    :goto_8
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    if-nez v1, :cond_17

    .line 520
    .line 521
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 522
    .line 523
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 524
    .line 525
    const-wide/16 v5, 0x0

    .line 526
    .line 527
    move-object/from16 v2, p1

    .line 528
    .line 529
    move-object/from16 v4, p3

    .line 530
    .line 531
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-object/from16 v3, p1

    .line 539
    .line 540
    goto :goto_8

    .line 541
    :cond_17
    invoke-interface {v11, v7, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    goto :goto_a

    .line 545
    :cond_18
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 546
    .line 547
    iget-object v3, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 548
    .line 549
    const-wide/16 v5, 0x0

    .line 550
    .line 551
    move-object/from16 v2, p1

    .line 552
    .line 553
    move-object/from16 v4, p3

    .line 554
    .line 555
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    :goto_9
    if-nez v1, :cond_19

    .line 560
    .line 561
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 562
    .line 563
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 564
    .line 565
    and-long/2addr v2, v8

    .line 566
    cmp-long v2, v2, v16

    .line 567
    .line 568
    if-eqz v2, :cond_19

    .line 569
    .line 570
    goto :goto_a

    .line 571
    :cond_19
    invoke-interface {v11, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    if-eqz v2, :cond_1b

    .line 576
    .line 577
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 578
    .line 579
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 580
    .line 581
    and-long/2addr v3, v8

    .line 582
    cmp-long v3, v3, v16

    .line 583
    .line 584
    if-eqz v3, :cond_1b

    .line 585
    .line 586
    instance-of v3, v2, Ljava/util/Collection;

    .line 587
    .line 588
    if-eqz v3, :cond_1a

    .line 589
    .line 590
    move-object v3, v2

    .line 591
    check-cast v3, Ljava/util/Collection;

    .line 592
    .line 593
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    invoke-interface {v11, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    goto :goto_a

    .line 600
    :cond_1a
    invoke-static {v2, v1}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-interface {v11, v7, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    :cond_1b
    :goto_a
    add-int/lit8 v12, v12, 0x1

    .line 608
    .line 609
    move-object/from16 v1, p1

    .line 610
    .line 611
    const/4 v7, 0x0

    .line 612
    goto/16 :goto_2

    .line 613
    .line 614
    :cond_1c
    :goto_b
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏楪世哲()Z

    .line 615
    .line 616
    .line 617
    iget-object v0, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏世兰哲:Ljava/util/function/Function;

    .line 618
    .line 619
    if-eqz v0, :cond_1d

    .line 620
    .line 621
    invoke-interface {v0, v11}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v0

    .line 625
    return-object v0

    .line 626
    :cond_1d
    return-object v11
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, -0x6e

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏世兰哲:Ljava/util/function/Function;

    .line 9
    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏世哲兰:J

    .line 13
    .line 14
    or-long v10, v0, p4

    .line 15
    .line 16
    const-wide/16 v8, 0x0

    .line 17
    .line 18
    iget-object v12, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 19
    .line 20
    move-object v7, p1

    .line 21
    invoke-virtual/range {v7 .. v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏世兰(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    if-eq v0, p0, :cond_1

    .line 28
    .line 29
    invoke-interface {v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲世苏兰()Ljava/util/function/Function;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    instance-of v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    instance-of v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;

    .line 38
    .line 39
    if-nez v1, :cond_0

    .line 40
    .line 41
    move-object v1, p1

    .line 42
    move-object v2, p2

    .line 43
    move-object/from16 v3, p3

    .line 44
    .line 45
    move-wide/from16 v4, p4

    .line 46
    .line 47
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :cond_0
    move-wide/from16 v4, p4

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    move-wide/from16 v4, p4

    .line 56
    .line 57
    move-object v7, v2

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-wide/from16 v4, p4

    .line 60
    .line 61
    move-object v7, v2

    .line 62
    move-object v0, v6

    .line 63
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世()B

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    const/16 v3, -0x51

    .line 68
    .line 69
    if-ne v2, v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 72
    .line 73
    .line 74
    return-object v6

    .line 75
    :cond_3
    const/16 v3, -0x5a

    .line 76
    .line 77
    if-ne v2, v3, :cond_4

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 80
    .line 81
    .line 82
    :cond_4
    iget-object v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 83
    .line 84
    iget-wide v2, v2, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 85
    .line 86
    or-long v8, v4, v2

    .line 87
    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-interface {v0, v8, v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/util/Map;

    .line 95
    .line 96
    :goto_1
    move-object v10, v0

    .line 97
    goto :goto_2

    .line 98
    :cond_5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 99
    .line 100
    const-class v2, Ljava/util/HashMap;

    .line 101
    .line 102
    if-ne v0, v2, :cond_6

    .line 103
    .line 104
    new-instance v0, Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    invoke-virtual {p0, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ljava/util/Map;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :goto_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰苏世()B

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const/16 v2, -0x5b

    .line 122
    .line 123
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Type;

    .line 124
    .line 125
    if-ne v0, v2, :cond_9

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世苏哲楪()V

    .line 128
    .line 129
    .line 130
    if-eqz v7, :cond_8

    .line 131
    .line 132
    sget-object p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏世楪哲;->飘花落叶言子楪苏哲世兰:Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 133
    .line 134
    if-ne v7, p0, :cond_7

    .line 135
    .line 136
    invoke-interface {v10}, Ljava/util/Map;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_7

    .line 141
    .line 142
    new-instance p0, Ljava/util/EnumMap;

    .line 143
    .line 144
    check-cast v3, Ljava/lang/Class;

    .line 145
    .line 146
    invoke-direct {p0, v3}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 147
    .line 148
    .line 149
    return-object p0

    .line 150
    :cond_7
    invoke-interface {v7, v10}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :cond_8
    return-object v10

    .line 156
    :cond_9
    const-class v0, Ljava/lang/String;

    .line 157
    .line 158
    if-eq v3, v0, :cond_e

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_a

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_b

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    new-instance v2, Lcom/alibaba/fastjson2/util/飘花落叶言子世哲苏兰楪;

    .line 178
    .line 179
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {p1, v10, v2, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 187
    .line 188
    .line 189
    :goto_3
    move-object v11, v2

    .line 190
    goto :goto_5

    .line 191
    :cond_b
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰哲世:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 192
    .line 193
    if-nez v0, :cond_c

    .line 194
    .line 195
    if-eqz v3, :cond_c

    .line 196
    .line 197
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世楪哲(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰哲世:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 202
    .line 203
    :cond_c
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰哲世:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 204
    .line 205
    if-nez v0, :cond_d

    .line 206
    .line 207
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    goto :goto_3

    .line 212
    :cond_d
    const/4 v2, 0x0

    .line 213
    const/4 v3, 0x0

    .line 214
    move-object v1, p1

    .line 215
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    goto :goto_3

    .line 220
    :cond_e
    :goto_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世子苏兰哲()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    goto :goto_3

    .line 225
    :goto_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Z

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-eqz v0, :cond_10

    .line 230
    .line 231
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世子苏兰()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    const-string v2, ".."

    .line 236
    .line 237
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v2

    .line 241
    if-eqz v2, :cond_f

    .line 242
    .line 243
    invoke-interface {v10, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    goto/16 :goto_7

    .line 247
    .line 248
    :cond_f
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p1, v10, v11, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏世哲兰(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/飘花落叶言子楪兰哲世苏;)V

    .line 253
    .line 254
    .line 255
    instance-of v0, v10, Ljava/util/concurrent/ConcurrentMap;

    .line 256
    .line 257
    if-nez v0, :cond_16

    .line 258
    .line 259
    invoke-interface {v10, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰哲世苏楪()Z

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    if-eqz v0, :cond_11

    .line 268
    .line 269
    invoke-interface {v10, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_11
    const-class v0, Ljava/lang/Object;

    .line 274
    .line 275
    iget-object v12, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 276
    .line 277
    if-ne v12, v0, :cond_12

    .line 278
    .line 279
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪子哲世苏兰()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    move-object v3, v11

    .line 284
    goto :goto_6

    .line 285
    :cond_12
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 286
    .line 287
    const-wide/16 v1, 0x0

    .line 288
    .line 289
    move-object v0, p1

    .line 290
    move-wide/from16 v3, p4

    .line 291
    .line 292
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏世兰(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    if-eqz v1, :cond_13

    .line 297
    .line 298
    if-eq v1, p0, :cond_13

    .line 299
    .line 300
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 301
    .line 302
    move-wide/from16 v4, p4

    .line 303
    .line 304
    move-object v0, v1

    .line 305
    move-object v3, v11

    .line 306
    move-object v1, p1

    .line 307
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    goto :goto_6

    .line 312
    :cond_13
    move-object v3, v11

    .line 313
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 314
    .line 315
    if-nez v0, :cond_14

    .line 316
    .line 317
    invoke-virtual {p1, v12}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世楪哲(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 322
    .line 323
    :cond_14
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 324
    .line 325
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 326
    .line 327
    move-object v1, p1

    .line 328
    move-wide/from16 v4, p4

    .line 329
    .line 330
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    :goto_6
    if-nez v0, :cond_15

    .line 335
    .line 336
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 337
    .line 338
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 339
    .line 340
    and-long/2addr v1, v8

    .line 341
    const-wide/16 v4, 0x0

    .line 342
    .line 343
    cmp-long v1, v1, v4

    .line 344
    .line 345
    if-eqz v1, :cond_15

    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_15
    invoke-interface {v10, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    :cond_16
    :goto_7
    move-wide/from16 v4, p4

    .line 352
    .line 353
    goto/16 :goto_2
.end method

.method public final 飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/util/Map;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 8
    .line 9
    if-eq v2, v1, :cond_1

    .line 10
    .line 11
    const-class v1, Ljava/util/HashMap;

    .line 12
    .line 13
    if-ne v2, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子世楪哲兰苏(J)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/util/Map;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    new-instance v1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_12

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/util/Map$Entry;

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Type;

    .line 57
    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    const-class v5, Ljava/lang/String;

    .line 61
    .line 62
    if-ne v4, v5, :cond_2

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_2
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_4

    .line 70
    :cond_3
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    :goto_4
    if-eqz v2, :cond_11

    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    const-class v5, Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰苏哲:Ljava/lang/reflect/Type;

    .line 83
    .line 84
    if-ne v6, v5, :cond_4

    .line 85
    .line 86
    goto/16 :goto_6

    .line 87
    .line 88
    :cond_4
    const-class v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 89
    .line 90
    const/4 v7, 0x0

    .line 91
    if-eq v4, v5, :cond_f

    .line 92
    .line 93
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Class;

    .line 94
    .line 95
    if-ne v4, v5, :cond_5

    .line 96
    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :cond_5
    const-class v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 100
    .line 101
    if-eq v4, v5, :cond_6

    .line 102
    .line 103
    sget-object v5, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 104
    .line 105
    if-ne v4, v5, :cond_8

    .line 106
    .line 107
    :cond_6
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪世兰哲苏:Ljava/lang/Class;

    .line 108
    .line 109
    const-class v8, Ljava/util/List;

    .line 110
    .line 111
    if-ne v5, v8, :cond_8

    .line 112
    .line 113
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 114
    .line 115
    if-nez v4, :cond_7

    .line 116
    .line 117
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 122
    .line 123
    :cond_7
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 124
    .line 125
    check-cast v2, Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v4, v2, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    goto :goto_6

    .line 132
    :cond_8
    invoke-virtual {v0, v4, v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    if-eqz v5, :cond_9

    .line 137
    .line 138
    invoke-interface {v5, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    goto :goto_6

    .line 143
    :cond_9
    instance-of v5, v2, Ljava/util/Map;

    .line 144
    .line 145
    if-eqz v5, :cond_b

    .line 146
    .line 147
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 148
    .line 149
    if-nez v4, :cond_a

    .line 150
    .line 151
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 156
    .line 157
    :cond_a
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 158
    .line 159
    check-cast v2, Ljava/util/Map;

    .line 160
    .line 161
    invoke-interface {v4, v2, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    goto :goto_6

    .line 166
    :cond_b
    instance-of v5, v2, Ljava/util/Collection;

    .line 167
    .line 168
    if-eqz v5, :cond_d

    .line 169
    .line 170
    iget-boolean v5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏哲世兰:Z

    .line 171
    .line 172
    if-nez v5, :cond_d

    .line 173
    .line 174
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 175
    .line 176
    if-nez v4, :cond_c

    .line 177
    .line 178
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 183
    .line 184
    :cond_c
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 185
    .line 186
    check-cast v2, Ljava/util/Collection;

    .line 187
    .line 188
    invoke-interface {v4, v2, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    goto :goto_6

    .line 193
    :cond_d
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_e

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_e
    const-string p0, "can not convert from "

    .line 201
    .line 202
    const-string p1, " to "

    .line 203
    .line 204
    invoke-static {p0, v4, p1, v6}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    const/4 p0, 0x0

    .line 208
    return-object p0

    .line 209
    :cond_f
    :goto_5
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 210
    .line 211
    if-nez v4, :cond_10

    .line 212
    .line 213
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    iput-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 218
    .line 219
    :cond_10
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏兰世哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 220
    .line 221
    check-cast v2, Ljava/util/Map;

    .line 222
    .line 223
    invoke-interface {v4, v2, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    :cond_11
    :goto_6
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto/16 :goto_2

    .line 231
    .line 232
    :cond_12
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰苏哲世楪;->飘花落叶言子楪苏世兰哲:Ljava/util/function/Function;

    .line 233
    .line 234
    if-eqz p0, :cond_13

    .line 235
    .line 236
    invoke-interface {p0, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :cond_13
    return-object v1
.end method
