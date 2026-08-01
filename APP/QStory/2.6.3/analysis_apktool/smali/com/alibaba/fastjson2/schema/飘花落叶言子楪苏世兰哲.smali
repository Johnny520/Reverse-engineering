.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Z

.field public final 飘花落叶言子楪兰世苏哲:J

.field public final 飘花落叶言子楪兰苏世哲:J

.field public final 飘花落叶言子楪兰苏哲世:Ljava/lang/Long;

.field public final 飘花落叶言子楪哲兰世苏:J

.field public final 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONObject;)V
    .locals 9

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "type"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "integer"

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, "required"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getBooleanValue(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    move v0, v2

    .line 32
    :goto_1
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 33
    .line 34
    const-string v0, "exclusiveMinimum"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    const-string v4, "minimum"

    .line 41
    .line 42
    const-wide/high16 v5, -0x8000000000000000L

    .line 43
    .line 44
    invoke-virtual {p1, v4, v5, v6}, Lcom/alibaba/fastjson2/JSONObject;->getLongValue(Ljava/lang/String;J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 49
    .line 50
    if-ne v3, v4, :cond_2

    .line 51
    .line 52
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 53
    .line 54
    iput-wide v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    instance-of v3, v3, Ljava/lang/Number;

    .line 58
    .line 59
    if-eqz v3, :cond_3

    .line 60
    .line 61
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getLongValue(Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    iput-wide v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    iput-wide v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 71
    .line 72
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 73
    .line 74
    :goto_2
    const-string v0, "maximum"

    .line 75
    .line 76
    invoke-virtual {p1, v0, v5, v6}, Lcom/alibaba/fastjson2/JSONObject;->getLongValue(Ljava/lang/String;J)J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    const-string v0, "exclusiveMaximum"

    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-ne v3, v4, :cond_4

    .line 87
    .line 88
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 89
    .line 90
    iput-wide v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_4
    instance-of v3, v3, Ljava/lang/Number;

    .line 94
    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getLongValue(Ljava/lang/String;)J

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    iput-wide v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_5
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 107
    .line 108
    iput-wide v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 109
    .line 110
    :goto_3
    const-string v0, "multipleOf"

    .line 111
    .line 112
    const-wide/16 v1, 0x0

    .line 113
    .line 114
    invoke-virtual {p1, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONObject;->getLongValue(Ljava/lang/String;J)J

    .line 115
    .line 116
    .line 117
    move-result-wide v0

    .line 118
    iput-wide v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 119
    .line 120
    const-string v0, "const"

    .line 121
    .line 122
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getLong(Ljava/lang/String;)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Long;

    .line 127
    .line 128
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 13

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-eqz v0, :cond_13

    .line 6
    .line 7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-class v2, Ljava/lang/Byte;

    .line 15
    .line 16
    const-class v3, Ljava/math/BigInteger;

    .line 17
    .line 18
    const-string v4, "const not match, expect %s, but %s"

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    iget-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Long;

    .line 22
    .line 23
    if-eq v1, v2, :cond_9

    .line 24
    .line 25
    const-class v2, Ljava/lang/Short;

    .line 26
    .line 27
    if-eq v1, v2, :cond_9

    .line 28
    .line 29
    const-class v2, Ljava/lang/Integer;

    .line 30
    .line 31
    if-eq v1, v2, :cond_9

    .line 32
    .line 33
    const-class v2, Ljava/lang/Long;

    .line 34
    .line 35
    if-eq v1, v2, :cond_9

    .line 36
    .line 37
    if-eq v1, v3, :cond_9

    .line 38
    .line 39
    const-class v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    if-eq v1, v2, :cond_9

    .line 42
    .line 43
    const-class v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 44
    .line 45
    if-ne v1, v2, :cond_1

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_1
    instance-of p0, p1, Ljava/math/BigDecimal;

    .line 50
    .line 51
    if-eqz p0, :cond_4

    .line 52
    .line 53
    move-object p0, p1

    .line 54
    check-cast p0, Ljava/math/BigDecimal;

    .line 55
    .line 56
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏(Ljava/math/BigDecimal;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-eqz v2, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz v6, :cond_13

    .line 67
    .line 68
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/math/BigInteger;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_2

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    invoke-virtual {p0}, Ljava/math/BigInteger;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    cmp-long p0, v0, v2

    .line 83
    .line 84
    if-nez p0, :cond_2

    .line 85
    .line 86
    goto/16 :goto_7

    .line 87
    .line 88
    :cond_2
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 89
    .line 90
    filled-new-array {v6, p1}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-direct {p0, v4, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_3
    if-eqz v6, :cond_4

    .line 99
    .line 100
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 101
    .line 102
    filled-new-array {v6, p1}, [Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-direct {p0, v4, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_4
    if-eqz v6, :cond_8

    .line 111
    .line 112
    instance-of p0, p1, Ljava/lang/Float;

    .line 113
    .line 114
    if-eqz p0, :cond_5

    .line 115
    .line 116
    move-object p0, p1

    .line 117
    check-cast p0, Ljava/lang/Float;

    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v2

    .line 127
    long-to-float v2, v2

    .line 128
    cmpl-float p0, v2, p0

    .line 129
    .line 130
    if-eqz p0, :cond_8

    .line 131
    .line 132
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 133
    .line 134
    filled-new-array {v6, p1}, [Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-direct {p0, v4, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_5
    instance-of p0, p1, Ljava/lang/Double;

    .line 143
    .line 144
    if-eqz p0, :cond_6

    .line 145
    .line 146
    move-object p0, p1

    .line 147
    check-cast p0, Ljava/lang/Double;

    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    .line 150
    .line 151
    .line 152
    move-result-wide v2

    .line 153
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 154
    .line 155
    .line 156
    move-result-wide v7

    .line 157
    long-to-double v7, v7

    .line 158
    cmpl-double p0, v7, v2

    .line 159
    .line 160
    if-eqz p0, :cond_8

    .line 161
    .line 162
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 163
    .line 164
    filled-new-array {v6, p1}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-direct {p0, v4, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 169
    .line 170
    .line 171
    return-object p0

    .line 172
    :cond_6
    instance-of p0, p1, Ljava/lang/String;

    .line 173
    .line 174
    if-eqz p0, :cond_8

    .line 175
    .line 176
    move-object p0, p1

    .line 177
    check-cast p0, Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {p0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    if-eqz v2, :cond_7

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    const/16 v3, 0x15

    .line 190
    .line 191
    if-ge v2, v3, :cond_7

    .line 192
    .line 193
    :try_start_0
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 194
    .line 195
    .line 196
    move-result-wide v2

    .line 197
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 198
    .line 199
    .line 200
    move-result-wide v7
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    cmp-long p0, v7, v2

    .line 202
    .line 203
    if-nez p0, :cond_7

    .line 204
    .line 205
    goto :goto_0

    .line 206
    :catch_0
    :cond_7
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 207
    .line 208
    filled-new-array {v6, p1}, [Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-direct {p0, v4, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 213
    .line 214
    .line 215
    return-object p0

    .line 216
    :cond_8
    :goto_0
    if-eqz v0, :cond_13

    .line 217
    .line 218
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 219
    .line 220
    sget-object p1, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Integer:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 221
    .line 222
    filled-new-array {p1, v1}, [Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    const-string v0, "expect type %s, but %s"

    .line 227
    .line 228
    invoke-direct {p0, v0, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 229
    .line 230
    .line 231
    return-object p0

    .line 232
    :cond_9
    :goto_1
    if-ne v1, v3, :cond_a

    .line 233
    .line 234
    move-object v0, p1

    .line 235
    check-cast v0, Ljava/math/BigInteger;

    .line 236
    .line 237
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏世兰(Ljava/math/BigInteger;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    goto :goto_2

    .line 242
    :cond_a
    const/4 v0, 0x1

    .line 243
    :goto_2
    move-object v1, p1

    .line 244
    check-cast v1, Ljava/lang/Number;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 247
    .line 248
    .line 249
    move-result-wide v1

    .line 250
    iget-wide v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 251
    .line 252
    const-wide/high16 v9, -0x8000000000000000L

    .line 253
    .line 254
    cmp-long v3, v7, v9

    .line 255
    .line 256
    if-eqz v3, :cond_d

    .line 257
    .line 258
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 259
    .line 260
    cmp-long v11, v1, v7

    .line 261
    .line 262
    if-eqz v3, :cond_b

    .line 263
    .line 264
    if-gtz v11, :cond_d

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_b
    if-gez v11, :cond_d

    .line 268
    .line 269
    :goto_3
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 270
    .line 271
    if-eqz v3, :cond_c

    .line 272
    .line 273
    const-string v0, "exclusiveMinimum not match, expect > %s, but %s"

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_c
    const-string v0, "minimum not match, expect >= %s, but %s"

    .line 277
    .line 278
    :goto_4
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    invoke-direct {p0, v0, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 287
    .line 288
    .line 289
    return-object p0

    .line 290
    :cond_d
    iget-wide v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 291
    .line 292
    cmp-long v3, v7, v9

    .line 293
    .line 294
    if-eqz v3, :cond_10

    .line 295
    .line 296
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 297
    .line 298
    cmp-long v9, v1, v7

    .line 299
    .line 300
    if-eqz v3, :cond_e

    .line 301
    .line 302
    if-ltz v9, :cond_10

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_e
    if-lez v9, :cond_10

    .line 306
    .line 307
    :goto_5
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 308
    .line 309
    if-eqz v3, :cond_f

    .line 310
    .line 311
    const-string v0, "exclusiveMaximum not match, expect < %s, but %s"

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_f
    const-string v0, "maximum not match, expect <= %s, but %s"

    .line 315
    .line 316
    :goto_6
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-direct {p0, v0, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 325
    .line 326
    .line 327
    return-object p0

    .line 328
    :cond_10
    iget-wide v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 329
    .line 330
    const-wide/16 v9, 0x0

    .line 331
    .line 332
    cmp-long p0, v7, v9

    .line 333
    .line 334
    if-eqz p0, :cond_11

    .line 335
    .line 336
    rem-long v11, v1, v7

    .line 337
    .line 338
    cmp-long p0, v11, v9

    .line 339
    .line 340
    if-eqz p0, :cond_11

    .line 341
    .line 342
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 343
    .line 344
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    const-string v0, "multipleOf not match, expect multipleOf %s, but %s"

    .line 353
    .line 354
    invoke-direct {p0, v0, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 355
    .line 356
    .line 357
    return-object p0

    .line 358
    :cond_11
    if-eqz v6, :cond_13

    .line 359
    .line 360
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 361
    .line 362
    .line 363
    move-result-wide v7

    .line 364
    cmp-long p0, v7, v1

    .line 365
    .line 366
    if-nez p0, :cond_12

    .line 367
    .line 368
    if-nez v0, :cond_13

    .line 369
    .line 370
    :cond_12
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 371
    .line 372
    filled-new-array {v6, p1}, [Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    invoke-direct {p0, v4, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 377
    .line 378
    .line 379
    return-object p0

    .line 380
    :cond_13
    :goto_7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 381
    .line 382
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏世哲(Ljava/lang/Integer;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 4
    .line 5
    if-eqz p0, :cond_8

    .line 6
    .line 7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 15
    .line 16
    const-wide/high16 v4, -0x8000000000000000L

    .line 17
    .line 18
    cmp-long v6, v2, v4

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    if-eqz v6, :cond_3

    .line 22
    .line 23
    iget-boolean v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 24
    .line 25
    cmp-long v8, v0, v2

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    if-gtz v8, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    if-gez v8, :cond_3

    .line 33
    .line 34
    :goto_0
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 35
    .line 36
    if-eqz v6, :cond_2

    .line 37
    .line 38
    const-string v0, "exclusiveMinimum not match, expect > %s, but %s"

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string v0, "minimum not match, expect >= %s, but %s"

    .line 42
    .line 43
    :goto_1
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, v0, p1, v7}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    iget-wide v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 56
    .line 57
    cmp-long v4, v2, v4

    .line 58
    .line 59
    if-eqz v4, :cond_6

    .line 60
    .line 61
    iget-boolean v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 62
    .line 63
    cmp-long v5, v0, v2

    .line 64
    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    if-ltz v5, :cond_6

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    if-lez v5, :cond_6

    .line 71
    .line 72
    :goto_2
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 73
    .line 74
    if-eqz v4, :cond_5

    .line 75
    .line 76
    const-string v0, "exclusiveMaximum not match, expect < %s, but %s"

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    const-string v0, "maximum not match, expect <= %s, but %s"

    .line 80
    .line 81
    :goto_3
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {p0, v0, p1, v7}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_6
    iget-wide v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 94
    .line 95
    const-wide/16 v4, 0x0

    .line 96
    .line 97
    cmp-long v6, v2, v4

    .line 98
    .line 99
    if-eqz v6, :cond_7

    .line 100
    .line 101
    rem-long v8, v0, v2

    .line 102
    .line 103
    cmp-long v4, v8, v4

    .line 104
    .line 105
    if-eqz v4, :cond_7

    .line 106
    .line 107
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 108
    .line 109
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    filled-new-array {p1, v0}, [Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    const-string v0, "multipleOf not match, expect multipleOf %s, but %s"

    .line 122
    .line 123
    invoke-direct {p0, v0, p1, v7}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 124
    .line 125
    .line 126
    return-object p0

    .line 127
    :cond_7
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Long;

    .line 128
    .line 129
    if-eqz p0, :cond_8

    .line 130
    .line 131
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 132
    .line 133
    .line 134
    move-result-wide v2

    .line 135
    cmp-long v0, v2, v0

    .line 136
    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 140
    .line 141
    const-string v1, "const not match, expect %s, but %s"

    .line 142
    .line 143
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-direct {v0, v1, p0, v7}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 148
    .line 149
    .line 150
    return-object v0

    .line 151
    :cond_8
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 152
    .line 153
    return-object p0
.end method

.method public final 飘花落叶言子楪兰苏哲世(Ljava/lang/Long;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 10

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Z

    .line 4
    .line 5
    if-eqz p0, :cond_8

    .line 6
    .line 7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-wide v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 15
    .line 16
    const-wide/high16 v4, -0x8000000000000000L

    .line 17
    .line 18
    cmp-long v6, v2, v4

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    if-eqz v6, :cond_3

    .line 22
    .line 23
    iget-boolean v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 24
    .line 25
    cmp-long v8, v0, v2

    .line 26
    .line 27
    if-eqz v6, :cond_1

    .line 28
    .line 29
    if-gtz v8, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    if-gez v8, :cond_3

    .line 33
    .line 34
    :goto_0
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 35
    .line 36
    if-eqz v6, :cond_2

    .line 37
    .line 38
    const-string v0, "exclusiveMinimum not match, expect > %s, but %s"

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string v0, "minimum not match, expect >= %s, but %s"

    .line 42
    .line 43
    :goto_1
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-direct {p0, v0, p1, v7}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 52
    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    iget-wide v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 56
    .line 57
    cmp-long v4, v2, v4

    .line 58
    .line 59
    if-eqz v4, :cond_6

    .line 60
    .line 61
    iget-boolean v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 62
    .line 63
    cmp-long v5, v0, v2

    .line 64
    .line 65
    if-eqz v4, :cond_4

    .line 66
    .line 67
    if-ltz v5, :cond_6

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    if-lez v5, :cond_6

    .line 71
    .line 72
    :goto_2
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 73
    .line 74
    if-eqz v4, :cond_5

    .line 75
    .line 76
    const-string v0, "exclusiveMaximum not match, expect < %s, but %s"

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_5
    const-string v0, "maximum not match, expect <= %s, but %s"

    .line 80
    .line 81
    :goto_3
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-direct {p0, v0, p1, v7}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 90
    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_6
    iget-wide v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 94
    .line 95
    const-wide/16 v4, 0x0

    .line 96
    .line 97
    cmp-long v6, v2, v4

    .line 98
    .line 99
    if-eqz v6, :cond_7

    .line 100
    .line 101
    rem-long v8, v0, v2

    .line 102
    .line 103
    cmp-long v4, v8, v4

    .line 104
    .line 105
    if-eqz v4, :cond_7

    .line 106
    .line 107
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 108
    .line 109
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string v0, "multipleOf not match, expect multipleOf %s, but %s"

    .line 118
    .line 119
    invoke-direct {p0, v0, p1, v7}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 120
    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_7
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Long;

    .line 124
    .line 125
    if-eqz p0, :cond_8

    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide v2

    .line 131
    cmp-long v0, v2, v0

    .line 132
    .line 133
    if-eqz v0, :cond_8

    .line 134
    .line 135
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 136
    .line 137
    const-string v1, "const not match, expect %s, but %s"

    .line 138
    .line 139
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-direct {v0, v1, p0, v7}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_8
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 148
    .line 149
    return-object p0
.end method

.method public final 飘花落叶言子楪哲兰苏世(J)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 8

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    cmp-long v4, v0, v2

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    if-eqz v4, :cond_2

    .line 9
    .line 10
    iget-boolean v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 11
    .line 12
    cmp-long v6, p1, v0

    .line 13
    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    if-gtz v6, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    if-gez v6, :cond_2

    .line 20
    .line 21
    :goto_0
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    const-string v2, "exclusiveMinimum not match, expect > %s, but %s"

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-string v2, "minimum not match, expect >= %s, but %s"

    .line 29
    .line 30
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {p0, v2, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    iget-wide v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 47
    .line 48
    cmp-long v2, v0, v2

    .line 49
    .line 50
    if-eqz v2, :cond_5

    .line 51
    .line 52
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 53
    .line 54
    cmp-long v3, p1, v0

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    if-ltz v3, :cond_5

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    if-lez v3, :cond_5

    .line 62
    .line 63
    :goto_2
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    const-string v2, "exclusiveMaximum not match, expect < %s, but %s"

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const-string v2, "maximum not match, expect <= %s, but %s"

    .line 71
    .line 72
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-direct {p0, v2, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 85
    .line 86
    .line 87
    return-object p0

    .line 88
    :cond_5
    iget-wide v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 89
    .line 90
    const-wide/16 v2, 0x0

    .line 91
    .line 92
    cmp-long v4, v0, v2

    .line 93
    .line 94
    if-eqz v4, :cond_6

    .line 95
    .line 96
    rem-long v6, p1, v0

    .line 97
    .line 98
    cmp-long v2, v6, v2

    .line 99
    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    new-instance p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 103
    .line 104
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string p2, "multipleOf not match, expect multipleOf %s, but %s"

    .line 117
    .line 118
    invoke-direct {p0, p2, p1, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 119
    .line 120
    .line 121
    return-object p0

    .line 122
    :cond_6
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Long;

    .line 123
    .line 124
    if-eqz p0, :cond_7

    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v0

    .line 130
    cmp-long v0, v0, p1

    .line 131
    .line 132
    if-eqz v0, :cond_7

    .line 133
    .line 134
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 135
    .line 136
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    const-string p1, "const not match, expect %s, but %s"

    .line 145
    .line 146
    invoke-direct {v0, p1, p0, v5}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    :cond_7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 151
    .line 152
    return-object p0
.end method

.method public final 飘花落叶言子楪哲苏兰世()Lcom/alibaba/fastjson2/JSONObject;
    .locals 6

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "type"

    .line 7
    .line 8
    const-string v2, "integer"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:J

    .line 14
    .line 15
    const-wide/high16 v3, -0x8000000000000000L

    .line 16
    .line 17
    cmp-long v5, v1, v3

    .line 18
    .line 19
    if-eqz v5, :cond_1

    .line 20
    .line 21
    iget-boolean v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    const-string v5, "exclusiveMinimum"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string v5, "minimum"

    .line 29
    .line 30
    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v5, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-wide v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世苏哲:J

    .line 38
    .line 39
    cmp-long v3, v1, v3

    .line 40
    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰世哲苏:Z

    .line 44
    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const-string v3, "exclusiveMaximum"

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const-string v3, "maximum"

    .line 51
    .line 52
    :goto_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    :cond_3
    const-wide/16 v1, 0x0

    .line 60
    .line 61
    iget-wide v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:J

    .line 62
    .line 63
    cmp-long v1, v3, v1

    .line 64
    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    const-string v1, "multipleOf"

    .line 68
    .line 69
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    :cond_4
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏哲世:Ljava/lang/Long;

    .line 77
    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    const-string v1, "const"

    .line 81
    .line 82
    invoke-virtual {v0, v1, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    :cond_5
    return-object v0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Integer:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
