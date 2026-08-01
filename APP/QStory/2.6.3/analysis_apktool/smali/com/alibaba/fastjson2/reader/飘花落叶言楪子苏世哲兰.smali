.class public final Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子世楪兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子世楪哲兰苏:Ljava/lang/reflect/Constructor;

.field public final 飘花落叶言子世楪哲苏兰:Ljava/util/HashMap;

.field public final 飘花落叶言子世楪苏兰哲:Ljava/util/function/Function;

.field public final 飘花落叶言子世楪苏哲兰:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/function/Function;[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;[Ljava/lang/Class;[Ljava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v13, p6

    .line 2
    .line 3
    move-object/from16 v14, p7

    .line 4
    .line 5
    move-object/from16 v15, p8

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez v15, :cond_0

    .line 9
    .line 10
    move-object v12, v14

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    array-length v1, v14

    .line 13
    array-length v2, v15

    .line 14
    add-int/2addr v2, v1

    .line 15
    invoke-static {v14, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, [Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 20
    .line 21
    array-length v3, v15

    .line 22
    invoke-static {v15, v0, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    move-object v12, v2

    .line 26
    :goto_0
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const/4 v8, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    move-object/from16 v1, p1

    .line 31
    .line 32
    move-object/from16 v2, p2

    .line 33
    .line 34
    move-object/from16 v3, p3

    .line 35
    .line 36
    move-wide/from16 v4, p4

    .line 37
    .line 38
    move-object/from16 v9, p9

    .line 39
    .line 40
    move-object/from16 v10, p10

    .line 41
    .line 42
    move/from16 v16, v0

    .line 43
    .line 44
    move-object/from16 v0, p0

    .line 45
    .line 46
    invoke-direct/range {v0 .. v12}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/util/function/Supplier;Ljava/util/function/Function;[Ljava/lang/Class;[Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;)V

    .line 47
    .line 48
    .line 49
    iput-object v13, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Function;

    .line 50
    .line 51
    iput-object v15, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏哲兰:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 52
    .line 53
    new-instance v1, Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪哲苏兰:Ljava/util/HashMap;

    .line 59
    .line 60
    array-length v1, v14

    .line 61
    move/from16 v2, v16

    .line 62
    .line 63
    :goto_1
    if-ge v2, v1, :cond_1

    .line 64
    .line 65
    aget-object v3, v14, v2

    .line 66
    .line 67
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪哲苏兰:Ljava/util/HashMap;

    .line 68
    .line 69
    iget-wide v5, v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 70
    .line 71
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v4, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    add-int/lit8 v2, v2, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Function;

    .line 82
    .line 83
    instance-of v1, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    move-object v1, v13

    .line 89
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;

    .line 90
    .line 91
    iget-object v1, v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/reflect/Constructor;

    .line 92
    .line 93
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪哲兰苏:Ljava/lang/reflect/Constructor;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_2
    iput-object v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪哲兰苏:Ljava/lang/reflect/Constructor;

    .line 97
    .line 98
    :goto_2
    instance-of v1, v13, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世哲苏兰;

    .line 99
    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    iput-object v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;

    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    instance-of v1, v13, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;

    .line 106
    .line 107
    if-eqz v1, :cond_4

    .line 108
    .line 109
    move-object v1, v13

    .line 110
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;

    .line 111
    .line 112
    iput-object v1, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;

    .line 113
    .line 114
    return-void

    .line 115
    :cond_4
    iput-object v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪兰苏哲:Lcom/alibaba/fastjson2/reader/飘花落叶言子楪世兰苏哲;

    .line 116
    .line 117
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世:Z

    .line 6
    .line 7
    iget-object v6, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    move-object/from16 v2, p2

    .line 21
    .line 22
    move-object/from16 v3, p3

    .line 23
    .line 24
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :cond_1
    move-object v7, v0

    .line 30
    iget-wide v8, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 31
    .line 32
    or-long v2, p4, v8

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰世楪哲(J)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v10, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Function;

    .line 39
    .line 40
    iget-object v11, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 41
    .line 42
    const/4 v12, 0x0

    .line 43
    const/4 v13, 0x0

    .line 44
    if-eqz v0, :cond_6

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_6

    .line 51
    .line 52
    move-object v0, v13

    .line 53
    :goto_0
    array-length v2, v11

    .line 54
    if-ge v12, v2, :cond_3

    .line 55
    .line 56
    aget-object v2, v11, v12

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-wide v4, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 70
    .line 71
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v0, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    add-int/lit8 v12, v12, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 88
    .line 89
    .line 90
    if-nez v0, :cond_4

    .line 91
    .line 92
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 93
    .line 94
    :cond_4
    invoke-interface {v10, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    return-object v0

    .line 99
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v2, "array not end, "

    .line 102
    .line 103
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-char v2, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v13

    .line 123
    :cond_6
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_8

    .line 128
    .line 129
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 130
    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    iput-boolean v12, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲楪苏兰:Z

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_7
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪世兰()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    return-object v13

    .line 143
    :cond_8
    :goto_1
    iget-object v14, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 144
    .line 145
    iget-wide v4, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 146
    .line 147
    or-long v15, v2, v4

    .line 148
    .line 149
    move/from16 v17, v12

    .line 150
    .line 151
    move-object v0, v13

    .line 152
    move-object/from16 v18, v0

    .line 153
    .line 154
    :goto_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    iget-object v3, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪哲苏兰:Ljava/util/HashMap;

    .line 159
    .line 160
    if-eqz v2, :cond_12

    .line 161
    .line 162
    iget-boolean v2, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲世兰:Z

    .line 163
    .line 164
    if-eqz v2, :cond_b

    .line 165
    .line 166
    if-nez v0, :cond_9

    .line 167
    .line 168
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 169
    .line 170
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 171
    .line 172
    .line 173
    :cond_9
    array-length v2, v11

    .line 174
    move v4, v12

    .line 175
    :goto_3
    if-ge v4, v2, :cond_b

    .line 176
    .line 177
    aget-object v5, v11, v4

    .line 178
    .line 179
    iget-object v6, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 180
    .line 181
    if-eqz v6, :cond_a

    .line 182
    .line 183
    iget-wide v8, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 184
    .line 185
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    iget-object v5, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/Object;

    .line 190
    .line 191
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_b
    if-nez v0, :cond_c

    .line 198
    .line 199
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_c
    move-object v2, v0

    .line 203
    :goto_4
    invoke-interface {v10, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    iget-object v4, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏哲兰:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 208
    .line 209
    if-eqz v4, :cond_10

    .line 210
    .line 211
    if-eqz v0, :cond_10

    .line 212
    .line 213
    :goto_5
    array-length v5, v4

    .line 214
    if-ge v12, v5, :cond_10

    .line 215
    .line 216
    aget-object v5, v4, v12

    .line 217
    .line 218
    iget-wide v6, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 219
    .line 220
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 221
    .line 222
    .line 223
    move-result-object v6

    .line 224
    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v6

    .line 228
    check-cast v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 229
    .line 230
    if-eqz v6, :cond_d

    .line 231
    .line 232
    iget-object v7, v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 233
    .line 234
    iget-object v8, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 235
    .line 236
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    if-nez v7, :cond_d

    .line 241
    .line 242
    goto :goto_6

    .line 243
    :cond_d
    iget-wide v7, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 244
    .line 245
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v7

    .line 253
    if-eqz v7, :cond_f

    .line 254
    .line 255
    if-eqz v6, :cond_e

    .line 256
    .line 257
    iget-object v6, v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 258
    .line 259
    if-eqz v6, :cond_f

    .line 260
    .line 261
    iget-object v8, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 262
    .line 263
    if-eqz v8, :cond_f

    .line 264
    .line 265
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-nez v6, :cond_e

    .line 270
    .line 271
    goto :goto_6

    .line 272
    :cond_e
    invoke-virtual {v5, v2, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    :cond_f
    :goto_6
    add-int/lit8 v12, v12, 0x1

    .line 276
    .line 277
    goto :goto_5

    .line 278
    :cond_10
    if-eqz v18, :cond_11

    .line 279
    .line 280
    invoke-virtual/range {v18 .. v18}, Ljava/util/IdentityHashMap;->entrySet()Ljava/util/Set;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    if-eqz v3, :cond_11

    .line 293
    .line 294
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    check-cast v3, Ljava/util/Map$Entry;

    .line 299
    .line 300
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    check-cast v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 305
    .line 306
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    check-cast v3, Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v4, v1, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    goto :goto_7

    .line 316
    :cond_11
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 317
    .line 318
    .line 319
    return-object v2

    .line 320
    :cond_12
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 321
    .line 322
    .line 323
    move-result-wide v4

    .line 324
    const-wide/16 v19, 0x0

    .line 325
    .line 326
    cmp-long v2, v4, v19

    .line 327
    .line 328
    if-nez v2, :cond_13

    .line 329
    .line 330
    move-object v2, v13

    .line 331
    move-object v13, v0

    .line 332
    goto/16 :goto_a

    .line 333
    .line 334
    :cond_13
    iget-wide v12, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 335
    .line 336
    cmp-long v2, v4, v12

    .line 337
    .line 338
    if-nez v2, :cond_18

    .line 339
    .line 340
    if-nez v17, :cond_18

    .line 341
    .line 342
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()J

    .line 343
    .line 344
    .line 345
    move-result-wide v1

    .line 346
    iget-wide v3, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 347
    .line 348
    cmp-long v3, v1, v3

    .line 349
    .line 350
    if-nez v3, :cond_14

    .line 351
    .line 352
    move-object/from16 v1, p1

    .line 353
    .line 354
    move-object v13, v0

    .line 355
    :goto_8
    const/4 v2, 0x0

    .line 356
    goto/16 :goto_a

    .line 357
    .line 358
    :cond_14
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 359
    .line 360
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 361
    .line 362
    and-long/2addr v3, v15

    .line 363
    cmp-long v3, v3, v19

    .line 364
    .line 365
    if-eqz v3, :cond_15

    .line 366
    .line 367
    iget-object v5, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 368
    .line 369
    iget-wide v3, v7, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 370
    .line 371
    move-object v13, v0

    .line 372
    move-object/from16 v0, p1

    .line 373
    .line 374
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪苏哲(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    goto :goto_9

    .line 379
    :cond_15
    move-object v13, v0

    .line 380
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v14, v6, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    :goto_9
    if-nez v1, :cond_16

    .line 389
    .line 390
    invoke-virtual/range {p1 .. p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    iget-object v1, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v1, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 397
    .line 398
    iget-wide v2, v14, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:J

    .line 399
    .line 400
    or-long/2addr v2, v8

    .line 401
    invoke-virtual {v1, v0, v6, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 402
    .line 403
    .line 404
    move-result-object v1

    .line 405
    :cond_16
    move-object v0, v1

    .line 406
    if-eqz v0, :cond_17

    .line 407
    .line 408
    const-wide/16 v4, 0x0

    .line 409
    .line 410
    move-object/from16 v1, p1

    .line 411
    .line 412
    move-object/from16 v2, p2

    .line 413
    .line 414
    move-object/from16 v3, p3

    .line 415
    .line 416
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 421
    .line 422
    .line 423
    return-object v0

    .line 424
    :cond_17
    move-object/from16 v1, p1

    .line 425
    .line 426
    goto :goto_8

    .line 427
    :cond_18
    move-object v13, v0

    .line 428
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲世兰苏楪()Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-eqz v0, :cond_19

    .line 433
    .line 434
    goto :goto_8

    .line 435
    :cond_19
    invoke-virtual {v7, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    check-cast v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 448
    .line 449
    if-eqz v2, :cond_1a

    .line 450
    .line 451
    if-eqz v0, :cond_1a

    .line 452
    .line 453
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 454
    .line 455
    if-eqz v3, :cond_1a

    .line 456
    .line 457
    iget-object v4, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 458
    .line 459
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    if-nez v3, :cond_1a

    .line 464
    .line 465
    move-object v0, v2

    .line 466
    :cond_1a
    if-nez v0, :cond_1d

    .line 467
    .line 468
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 469
    .line 470
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 471
    .line 472
    and-long/2addr v2, v15

    .line 473
    cmp-long v2, v2, v19

    .line 474
    .line 475
    if-eqz v2, :cond_1d

    .line 476
    .line 477
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世苏楪兰哲()J

    .line 478
    .line 479
    .line 480
    move-result-wide v2

    .line 481
    invoke-virtual {v7, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    if-nez v0, :cond_1c

    .line 486
    .line 487
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世楪哲苏兰()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    const-string v3, "is"

    .line 492
    .line 493
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    if-eqz v3, :cond_1c

    .line 498
    .line 499
    const/4 v3, 0x2

    .line 500
    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)J

    .line 505
    .line 506
    .line 507
    move-result-wide v2

    .line 508
    invoke-virtual {v7, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 509
    .line 510
    .line 511
    move-result-object v2

    .line 512
    if-eqz v2, :cond_1c

    .line 513
    .line 514
    iget-object v3, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 515
    .line 516
    const-class v4, Ljava/lang/Boolean;

    .line 517
    .line 518
    if-eq v3, v4, :cond_1b

    .line 519
    .line 520
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 521
    .line 522
    if-ne v3, v4, :cond_1c

    .line 523
    .line 524
    :cond_1b
    move-object v0, v2

    .line 525
    :cond_1c
    if-eqz v0, :cond_1d

    .line 526
    .line 527
    if-eqz v13, :cond_1d

    .line 528
    .line 529
    iget-wide v2, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 530
    .line 531
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-virtual {v13, v2}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    if-eqz v2, :cond_1d

    .line 540
    .line 541
    const/4 v0, 0x0

    .line 542
    :cond_1d
    if-nez v0, :cond_1e

    .line 543
    .line 544
    const/4 v2, 0x0

    .line 545
    invoke-virtual {v7, v1, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :goto_a
    move-object v0, v13

    .line 549
    goto :goto_d

    .line 550
    :cond_1e
    const/4 v2, 0x0

    .line 551
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-eqz v3, :cond_20

    .line 556
    .line 557
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰苏子哲()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    if-nez v18, :cond_1f

    .line 562
    .line 563
    new-instance v4, Ljava/util/IdentityHashMap;

    .line 564
    .line 565
    invoke-direct {v4}, Ljava/util/IdentityHashMap;-><init>()V

    .line 566
    .line 567
    .line 568
    goto :goto_b

    .line 569
    :cond_1f
    move-object/from16 v4, v18

    .line 570
    .line 571
    :goto_b
    invoke-virtual {v4, v0, v3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-object/from16 v18, v4

    .line 575
    .line 576
    goto :goto_a

    .line 577
    :cond_20
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    if-nez v13, :cond_21

    .line 582
    .line 583
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 584
    .line 585
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 586
    .line 587
    .line 588
    move-object v13, v4

    .line 589
    :cond_21
    instance-of v4, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;

    .line 590
    .line 591
    if-eqz v4, :cond_22

    .line 592
    .line 593
    check-cast v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;

    .line 594
    .line 595
    iget-wide v4, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;->飘花落叶言子世哲苏楪兰:J

    .line 596
    .line 597
    goto :goto_c

    .line 598
    :cond_22
    iget-wide v4, v0, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 599
    .line 600
    :goto_c
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v13, v0, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    goto :goto_a

    .line 608
    :goto_d
    add-int/lit8 v17, v17, 0x1

    .line 609
    .line 610
    move-object v13, v2

    .line 611
    const/4 v12, 0x0

    .line 612
    goto/16 :goto_2
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/util/Collection;J)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_3

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 26
    .line 27
    array-length v3, v2

    .line 28
    if-lt v0, v3, :cond_0

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_0
    aget-object v2, v2, v0

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v4, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 40
    .line 41
    if-eq v3, v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {p2, v3, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    if-eqz v3, :cond_1

    .line 48
    .line 49
    invoke-interface {v3, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :cond_1
    instance-of v3, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    check-cast v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;

    .line 58
    .line 59
    iget-wide v2, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;->飘花落叶言子世哲苏楪兰:J

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget-wide v2, v2, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 63
    .line 64
    :goto_1
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p3, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    add-int/lit8 v0, v0, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    :goto_2
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Function;

    .line 75
    .line 76
    invoke-interface {p0, p3}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子世楪苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-boolean p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世:Z

    .line 11
    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世兰苏()Z

    .line 20
    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    const/4 p3, 0x0

    .line 24
    move-object p4, p2

    .line 25
    :goto_0
    iget-object p5, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 26
    .line 27
    array-length v0, p5

    .line 28
    if-ge p3, v0, :cond_3

    .line 29
    .line 30
    aget-object p5, p5, p3

    .line 31
    .line 32
    invoke-virtual {p5, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez p4, :cond_2

    .line 37
    .line 38
    new-instance p4, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-direct {p4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-wide v1, p5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 44
    .line 45
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p5

    .line 49
    invoke-virtual {p4, p5, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    add-int/lit8 p3, p3, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪世苏兰()Z

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    if-eqz p3, :cond_5

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 62
    .line 63
    .line 64
    if-nez p4, :cond_4

    .line 65
    .line 66
    sget-object p4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 67
    .line 68
    :cond_4
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Function;

    .line 69
    .line 70
    invoke-interface {p0, p4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string p3, "array not end, "

    .line 78
    .line 79
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-char p3, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 83
    .line 84
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p1, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-object p2
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世:Z

    .line 2
    .line 3
    iget-object v7, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/16 v3, -0x51

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    if-ne v2, v3, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 20
    .line 21
    .line 22
    return-object v8

    .line 23
    :cond_1
    const/16 v3, -0x6e

    .line 24
    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 28
    .line 29
    or-long v4, v2, p4

    .line 30
    .line 31
    iget-wide v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏世哲兰:J

    .line 32
    .line 33
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 34
    .line 35
    move-object v1, p1

    .line 36
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏哲兰世(JJLjava/lang/Class;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    if-eq v2, p0, :cond_2

    .line 43
    .line 44
    move-object v3, p2

    .line 45
    move-object/from16 v4, p3

    .line 46
    .line 47
    move-wide/from16 v5, p4

    .line 48
    .line 49
    move-object v1, v2

    .line 50
    move-object v2, p1

    .line 51
    invoke-interface/range {v1 .. v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :cond_2
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x0

    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰楪哲世()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世兰子哲()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    move v4, v3

    .line 74
    move-object v5, v8

    .line 75
    :goto_0
    if-ge v4, v2, :cond_6

    .line 76
    .line 77
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 78
    .line 79
    aget-object v6, v6, v4

    .line 80
    .line 81
    invoke-virtual {v6, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    :cond_3
    iget-wide v9, v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 93
    .line 94
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-virtual {v5, v6, v7}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v2, "expect object, but "

    .line 107
    .line 108
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪哲兰世()B

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    invoke-static {v2}, Lcom/alibaba/fastjson2/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(B)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-object v8

    .line 134
    :cond_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 135
    .line 136
    .line 137
    move v2, v3

    .line 138
    move-object v4, v8

    .line 139
    move-object v5, v4

    .line 140
    :goto_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏楪兰世()Z

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    if-eqz v6, :cond_b

    .line 145
    .line 146
    move-object v8, v4

    .line 147
    :cond_6
    if-nez v5, :cond_7

    .line 148
    .line 149
    sget-object v5, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 150
    .line 151
    :cond_7
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Function;

    .line 152
    .line 153
    invoke-interface {v2, v5}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏哲兰:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 158
    .line 159
    if-eqz v4, :cond_8

    .line 160
    .line 161
    :goto_2
    array-length v6, v4

    .line 162
    if-ge v3, v6, :cond_8

    .line 163
    .line 164
    aget-object v6, v4, v3

    .line 165
    .line 166
    iget-wide v9, v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 167
    .line 168
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v7

    .line 176
    invoke-virtual {v6, v2, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    add-int/lit8 v3, v3, 0x1

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_8
    if-eqz v8, :cond_a

    .line 183
    .line 184
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    if-eqz v4, :cond_a

    .line 197
    .line 198
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    check-cast v4, Ljava/util/Map$Entry;

    .line 203
    .line 204
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    check-cast v5, Ljava/lang/Long;

    .line 209
    .line 210
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 217
    .line 218
    .line 219
    move-result-wide v5

    .line 220
    invoke-virtual {p0, v5, v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 221
    .line 222
    .line 223
    move-result-object v5

    .line 224
    const-string v6, ".."

    .line 225
    .line 226
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_9

    .line 231
    .line 232
    invoke-virtual {v5, v2, v2}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_9
    invoke-virtual {v5, p1, v2, v4}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_a
    return-object v2

    .line 241
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰苏哲楪世()J

    .line 242
    .line 243
    .line 244
    move-result-wide v9

    .line 245
    const-wide/16 v11, 0x0

    .line 246
    .line 247
    cmp-long v6, v9, v11

    .line 248
    .line 249
    if-nez v6, :cond_c

    .line 250
    .line 251
    goto/16 :goto_5

    .line 252
    .line 253
    :cond_c
    sget-wide v11, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:J

    .line 254
    .line 255
    cmp-long v6, v9, v11

    .line 256
    .line 257
    if-nez v6, :cond_f

    .line 258
    .line 259
    if-nez v2, :cond_f

    .line 260
    .line 261
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏子世兰哲()J

    .line 262
    .line 263
    .line 264
    move-result-wide v2

    .line 265
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 266
    .line 267
    iget-object v4, v0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v4, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 270
    .line 271
    invoke-virtual {v4, v2, v3}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世哲兰(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    if-nez v2, :cond_e

    .line 276
    .line 277
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世兰楪哲苏()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v0, v7, v2}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    if-eqz v0, :cond_d

    .line 286
    .line 287
    move-object v1, p1

    .line 288
    move-object v2, p2

    .line 289
    move-object/from16 v3, p3

    .line 290
    .line 291
    move-wide/from16 v4, p4

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 295
    .line 296
    const-string v3, "autoType not support : "

    .line 297
    .line 298
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-static {v0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    return-object v8

    .line 316
    :cond_e
    move-object v0, v2

    .line 317
    move-object v1, p1

    .line 318
    move-object/from16 v3, p3

    .line 319
    .line 320
    move-wide/from16 v4, p4

    .line 321
    .line 322
    move-object v2, p2

    .line 323
    :goto_4
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪苏世兰()Z

    .line 328
    .line 329
    .line 330
    return-object v0

    .line 331
    :cond_f
    invoke-virtual {p0, v9, v10}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲世兰苏(J)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    if-nez v6, :cond_10

    .line 336
    .line 337
    invoke-virtual {p0, p1, v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪兰世哲苏(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏哲兰楪世()Z

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    if-eqz v11, :cond_12

    .line 346
    .line 347
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v6

    .line 354
    if-nez v4, :cond_11

    .line 355
    .line 356
    new-instance v4, Ljava/util/HashMap;

    .line 357
    .line 358
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 359
    .line 360
    .line 361
    :cond_11
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    invoke-interface {v4, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_12
    invoke-virtual {v6, p1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v9

    .line 373
    if-nez v5, :cond_13

    .line 374
    .line 375
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 376
    .line 377
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 378
    .line 379
    .line 380
    :cond_13
    iget-wide v10, v6, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 381
    .line 382
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 383
    .line 384
    .line 385
    move-result-object v6

    .line 386
    invoke-virtual {v5, v6, v9}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 390
    .line 391
    goto/16 :goto_1
.end method

.method public final 飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏兰哲世:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v2, v1, Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v4

    .line 22
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 23
    .line 24
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 25
    .line 26
    and-long/2addr v6, p2

    .line 27
    const-wide/16 v8, 0x0

    .line 28
    .line 29
    cmp-long v2, v6, v8

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, v0, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世兰哲苏(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v2, v3

    .line 39
    :goto_0
    if-nez v2, :cond_1

    .line 40
    .line 41
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世兰苏哲:J

    .line 42
    .line 43
    or-long/2addr v4, p2

    .line 44
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :cond_1
    if-eq v2, p0, :cond_2

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-interface {v2, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v2, v3

    .line 68
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_7

    .line 73
    .line 74
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, Ljava/util/Map$Entry;

    .line 79
    .line 80
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-interface {p0, v5}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-eqz v5, :cond_3

    .line 97
    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    iget-object v7, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 105
    .line 106
    if-eq v6, v7, :cond_4

    .line 107
    .line 108
    invoke-virtual {v0, v6, v7}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    if-eqz v6, :cond_4

    .line 113
    .line 114
    invoke-interface {v6, v4}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    :cond_4
    if-nez v2, :cond_5

    .line 119
    .line 120
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 123
    .line 124
    .line 125
    :cond_5
    instance-of v6, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;

    .line 126
    .line 127
    if-eqz v6, :cond_6

    .line 128
    .line 129
    check-cast v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;

    .line 130
    .line 131
    iget-wide v5, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子世苏兰楪哲;->飘花落叶言子世哲苏楪兰:J

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    iget-wide v5, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰苏哲:J

    .line 135
    .line 136
    :goto_2
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v2, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_7
    if-nez v2, :cond_8

    .line 145
    .line 146
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 147
    .line 148
    :cond_8
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/function/Function;

    .line 149
    .line 150
    invoke-interface {v1, v2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏世哲兰;->飘花落叶言子世楪苏哲兰:[Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;

    .line 155
    .line 156
    if-eqz p0, :cond_e

    .line 157
    .line 158
    const/4 v2, 0x0

    .line 159
    move v4, v2

    .line 160
    :goto_3
    array-length v5, p0

    .line 161
    if-ge v4, v5, :cond_e

    .line 162
    .line 163
    aget-object v5, p0, v4

    .line 164
    .line 165
    iget-object v6, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/String;

    .line 166
    .line 167
    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    if-nez v6, :cond_9

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_9
    iget-object v7, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰哲世苏:Ljava/lang/reflect/Field;

    .line 175
    .line 176
    if-eqz v7, :cond_a

    .line 177
    .line 178
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 179
    .line 180
    .line 181
    move-result v7

    .line 182
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 183
    .line 184
    .line 185
    move-result v7

    .line 186
    if-eqz v7, :cond_a

    .line 187
    .line 188
    :try_start_0
    iget-object v7, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/reflect/Method;

    .line 189
    .line 190
    invoke-virtual {v7, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    instance-of v8, v7, Ljava/util/Collection;

    .line 195
    .line 196
    if-eqz v8, :cond_a

    .line 197
    .line 198
    check-cast v7, Ljava/util/Collection;

    .line 199
    .line 200
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 204
    if-nez v7, :cond_a

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :catch_0
    :cond_a
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    iget-object v8, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Class;

    .line 212
    .line 213
    iget-object v9, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/reflect/Type;

    .line 214
    .line 215
    instance-of v10, v9, Ljava/lang/Class;

    .line 216
    .line 217
    if-nez v10, :cond_b

    .line 218
    .line 219
    invoke-static {v6, v9, v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    goto :goto_4

    .line 224
    :cond_b
    if-eq v7, v8, :cond_d

    .line 225
    .line 226
    invoke-virtual {v0, v7, v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;->飘花落叶言子楪苏兰世哲(Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    if-eqz v7, :cond_c

    .line 231
    .line 232
    invoke-interface {v7, v6}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    goto :goto_4

    .line 237
    :cond_c
    instance-of v7, v6, Ljava/util/Map;

    .line 238
    .line 239
    if-eqz v7, :cond_d

    .line 240
    .line 241
    new-array v7, v2, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 242
    .line 243
    new-instance v8, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 244
    .line 245
    invoke-direct {v8, v0}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8, v7}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5, v8}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世(Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;)Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    check-cast v6, Ljava/util/Map;

    .line 256
    .line 257
    iget-wide v8, v5, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏:J

    .line 258
    .line 259
    or-long/2addr v8, p2

    .line 260
    invoke-interface {v7, v6, v8, v9}, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪苏哲兰世(Ljava/util/Map;J)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    :cond_d
    :goto_4
    invoke-virtual {v5, v1, v6}, Lcom/alibaba/fastjson2/reader/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_e
    return-object v1
.end method
