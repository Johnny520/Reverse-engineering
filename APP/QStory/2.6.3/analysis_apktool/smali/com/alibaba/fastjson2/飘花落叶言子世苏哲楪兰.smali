.class public final Lcom/alibaba/fastjson2/飘花落叶言子世苏哲楪兰;
.super Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

.field public final 飘花落叶言子楪苏哲世兰:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J[Ljava/lang/String;[JLjava/util/function/Function;Lcom/alibaba/fastjson2/JSONPathFilter$Operator;J)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;-><init>(Ljava/lang/String;J[Ljava/lang/String;[JLjava/util/function/Function;)V

    .line 2
    .line 3
    .line 4
    iput-object p7, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 5
    .line 6
    iput-wide p8, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲世兰:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "[?("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲兰苏:[Ljava/lang/String;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "@"

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x2e

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/16 v1, 0x20

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget-wide v1, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲世兰:J

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, ")]"

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 2
    .line 3
    sget-object v0, Lcom/alibaba/fastjson2/JSONPathFilter$Operator;->NE:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Object;)Z
    .locals 11

    .line 1
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x2

    .line 7
    iget-object v5, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏世兰哲:Lcom/alibaba/fastjson2/JSONPathFilter$Operator;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    iget-wide v7, p0, Lcom/alibaba/fastjson2/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪苏哲世兰:J

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    if-nez v0, :cond_13

    .line 14
    .line 15
    instance-of v9, p1, Ljava/lang/Byte;

    .line 16
    .line 17
    if-nez v9, :cond_13

    .line 18
    .line 19
    instance-of v9, p1, Ljava/lang/Short;

    .line 20
    .line 21
    if-nez v9, :cond_13

    .line 22
    .line 23
    instance-of v9, p1, Ljava/lang/Integer;

    .line 24
    .line 25
    if-nez v9, :cond_13

    .line 26
    .line 27
    instance-of v9, p1, Ljava/lang/Long;

    .line 28
    .line 29
    if-eqz v9, :cond_0

    .line 30
    .line 31
    goto/16 :goto_1

    .line 32
    .line 33
    :cond_0
    instance-of v0, p1, Ljava/math/BigDecimal;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    check-cast p1, Ljava/math/BigDecimal;

    .line 38
    .line 39
    invoke-static {v7, v8}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    instance-of v0, p1, Ljava/math/BigInteger;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    check-cast p1, Ljava/math/BigInteger;

    .line 53
    .line 54
    invoke-static {v7, v8}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1, v0}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    instance-of v0, p1, Ljava/lang/Float;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    check-cast p1, Ljava/lang/Float;

    .line 68
    .line 69
    long-to-float v0, v7

    .line 70
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    goto :goto_0

    .line 79
    :cond_3
    instance-of v0, p1, Ljava/lang/Double;

    .line 80
    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    check-cast p1, Ljava/lang/Double;

    .line 84
    .line 85
    long-to-double v7, v7

    .line 86
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/Double;->compareTo(Ljava/lang/Double;)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    goto :goto_0

    .line 95
    :cond_4
    instance-of v0, p1, Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_12

    .line 98
    .line 99
    check-cast p1, Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪兰世哲苏;->飘花落叶言子世哲兰楪苏(Ljava/lang/String;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 108
    .line 109
    .line 110
    move-result-wide v9

    .line 111
    invoke-static {v9, v10, v7, v8}, Ljava/lang/Long;->compare(JJ)I

    .line 112
    .line 113
    .line 114
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    goto :goto_0

    .line 116
    :catch_0
    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    goto :goto_0

    .line 125
    :cond_5
    invoke-static {v7, v8}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p1, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_10

    .line 138
    .line 139
    if-eq v0, p0, :cond_e

    .line 140
    .line 141
    if-eq v0, v4, :cond_c

    .line 142
    .line 143
    if-eq v0, v3, :cond_a

    .line 144
    .line 145
    if-eq v0, v2, :cond_8

    .line 146
    .line 147
    if-ne v0, v1, :cond_7

    .line 148
    .line 149
    if-gtz p1, :cond_6

    .line 150
    .line 151
    move v6, p0

    .line 152
    :cond_6
    return v6

    .line 153
    :cond_7
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 154
    .line 155
    .line 156
    return v6

    .line 157
    :cond_8
    if-gez p1, :cond_9

    .line 158
    .line 159
    move v6, p0

    .line 160
    :cond_9
    return v6

    .line 161
    :cond_a
    if-ltz p1, :cond_b

    .line 162
    .line 163
    move v6, p0

    .line 164
    :cond_b
    return v6

    .line 165
    :cond_c
    if-lez p1, :cond_d

    .line 166
    .line 167
    move v6, p0

    .line 168
    :cond_d
    return v6

    .line 169
    :cond_e
    if-eqz p1, :cond_f

    .line 170
    .line 171
    move v6, p0

    .line 172
    :cond_f
    return v6

    .line 173
    :cond_10
    if-nez p1, :cond_11

    .line 174
    .line 175
    move v6, p0

    .line 176
    :cond_11
    return v6

    .line 177
    :cond_12
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 178
    .line 179
    .line 180
    return v6

    .line 181
    :cond_13
    :goto_1
    if-eqz v0, :cond_15

    .line 182
    .line 183
    check-cast p1, Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_14

    .line 190
    .line 191
    const-wide/16 v9, 0x1

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_14
    const-wide/16 v9, 0x0

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_15
    check-cast p1, Ljava/lang/Number;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 200
    .line 201
    .line 202
    move-result-wide v9

    .line 203
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_20

    .line 208
    .line 209
    if-eq p1, p0, :cond_1e

    .line 210
    .line 211
    if-eq p1, v4, :cond_1c

    .line 212
    .line 213
    if-eq p1, v3, :cond_1a

    .line 214
    .line 215
    if-eq p1, v2, :cond_18

    .line 216
    .line 217
    if-ne p1, v1, :cond_17

    .line 218
    .line 219
    cmp-long p1, v9, v7

    .line 220
    .line 221
    if-gtz p1, :cond_16

    .line 222
    .line 223
    return p0

    .line 224
    :cond_16
    return v6

    .line 225
    :cond_17
    invoke-static {}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世()V

    .line 226
    .line 227
    .line 228
    return v6

    .line 229
    :cond_18
    cmp-long p1, v9, v7

    .line 230
    .line 231
    if-gez p1, :cond_19

    .line 232
    .line 233
    return p0

    .line 234
    :cond_19
    return v6

    .line 235
    :cond_1a
    cmp-long p1, v9, v7

    .line 236
    .line 237
    if-ltz p1, :cond_1b

    .line 238
    .line 239
    return p0

    .line 240
    :cond_1b
    return v6

    .line 241
    :cond_1c
    cmp-long p1, v9, v7

    .line 242
    .line 243
    if-lez p1, :cond_1d

    .line 244
    .line 245
    return p0

    .line 246
    :cond_1d
    return v6

    .line 247
    :cond_1e
    cmp-long p1, v9, v7

    .line 248
    .line 249
    if-eqz p1, :cond_1f

    .line 250
    .line 251
    return p0

    .line 252
    :cond_1f
    return v6

    .line 253
    :cond_20
    cmp-long p1, v9, v7

    .line 254
    .line 255
    if-nez p1, :cond_21

    .line 256
    .line 257
    return p0

    .line 258
    :cond_21
    return v6
.end method
