.class public final Lcom/alibaba/fastjson2/function/impl/StringToAny;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field final defaultValue:Ljava/lang/Object;

.field final targetClass:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/function/impl/StringToAny;->targetClass:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/function/impl/StringToAny;->defaultValue:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p1, :cond_16

    .line 4
    .line 5
    const-string v0, "null"

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_16

    .line 12
    .line 13
    const-string v0, ""

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_8

    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/function/impl/StringToAny;->targetClass:Ljava/lang/Class;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-eq v0, v1, :cond_15

    .line 28
    .line 29
    const-class v1, Ljava/lang/Byte;

    .line 30
    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    goto/16 :goto_7

    .line 34
    .line 35
    :cond_1
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-eq v0, v1, :cond_14

    .line 38
    .line 39
    const-class v1, Ljava/lang/Short;

    .line 40
    .line 41
    if-ne v0, v1, :cond_2

    .line 42
    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :cond_2
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    if-eq v0, v1, :cond_13

    .line 48
    .line 49
    const-class v1, Ljava/lang/Integer;

    .line 50
    .line 51
    if-ne v0, v1, :cond_3

    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_3
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 56
    .line 57
    if-eq v0, v1, :cond_11

    .line 58
    .line 59
    const-class v1, Ljava/lang/Long;

    .line 60
    .line 61
    if-ne v0, v1, :cond_4

    .line 62
    .line 63
    goto/16 :goto_4

    .line 64
    .line 65
    :cond_4
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    if-eq v0, v1, :cond_10

    .line 68
    .line 69
    const-class v1, Ljava/lang/Float;

    .line 70
    .line 71
    if-ne v0, v1, :cond_5

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_5
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 76
    .line 77
    if-eq v0, v1, :cond_f

    .line 78
    .line 79
    const-class v1, Ljava/lang/Double;

    .line 80
    .line 81
    if-ne v0, v1, :cond_6

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    if-eq v0, v1, :cond_e

    .line 87
    .line 88
    const-class v1, Ljava/lang/Character;

    .line 89
    .line 90
    if-ne v0, v1, :cond_7

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_7
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    if-eq v0, v1, :cond_d

    .line 96
    .line 97
    const-class v1, Ljava/lang/Boolean;

    .line 98
    .line 99
    if-ne v0, v1, :cond_8

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_8
    const-class v1, Ljava/math/BigDecimal;

    .line 103
    .line 104
    if-ne v0, v1, :cond_9

    .line 105
    .line 106
    new-instance v0, Ljava/math/BigDecimal;

    .line 107
    .line 108
    invoke-direct {v0, p1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_9
    const-class v1, Ljava/math/BigInteger;

    .line 113
    .line 114
    if-ne v0, v1, :cond_a

    .line 115
    .line 116
    new-instance v0, Ljava/math/BigInteger;

    .line 117
    .line 118
    invoke-direct {v0, p1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_a
    const-class v1, Ljava/util/Collections;

    .line 123
    .line 124
    if-eq v0, v1, :cond_b

    .line 125
    .line 126
    const-class v1, Ljava/util/List;

    .line 127
    .line 128
    if-eq v0, v1, :cond_b

    .line 129
    .line 130
    const-class v1, Lcom/alibaba/fastjson2/JSONArray;

    .line 131
    .line 132
    if-ne v0, v1, :cond_c

    .line 133
    .line 134
    :cond_b
    const-string v0, "[]"

    .line 135
    .line 136
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_c

    .line 141
    .line 142
    new-instance p1, Lcom/alibaba/fastjson2/JSONArray;

    .line 143
    .line 144
    invoke-direct {p1}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 145
    .line 146
    .line 147
    return-object p1

    .line 148
    :cond_c
    iget-object v0, p0, Lcom/alibaba/fastjson2/function/impl/StringToAny;->targetClass:Ljava/lang/Class;

    .line 149
    .line 150
    const-string v1, ", value : "

    .line 151
    .line 152
    const-string v2, "can not convert to "

    .line 153
    .line 154
    invoke-static {v2, v0, v1, p1}, Lah/a;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    const/4 p1, 0x0

    .line 158
    return-object p1

    .line 159
    :cond_d
    :goto_0
    const-string v0, "true"

    .line 160
    .line 161
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    return-object p1

    .line 170
    :cond_e
    :goto_1
    const/4 v0, 0x0

    .line 171
    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1

    .line 180
    :cond_f
    :goto_2
    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 181
    .line 182
    .line 183
    move-result-wide v0

    .line 184
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    return-object p1

    .line 189
    :cond_10
    :goto_3
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    return-object p1

    .line 198
    :cond_11
    :goto_4
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-nez v0, :cond_12

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    const/16 v1, 0x13

    .line 209
    .line 210
    if-ne v0, v1, :cond_12

    .line 211
    .line 212
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 213
    .line 214
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    return-object p1

    .line 223
    :cond_12
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 224
    .line 225
    .line 226
    move-result-wide v0

    .line 227
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    return-object p1

    .line 232
    :cond_13
    :goto_5
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    move-result p1

    .line 236
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    return-object p1

    .line 241
    :cond_14
    :goto_6
    invoke-static {p1}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    return-object p1

    .line 250
    :cond_15
    :goto_7
    invoke-static {p1}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    return-object p1

    .line 259
    :cond_16
    :goto_8
    iget-object p1, p0, Lcom/alibaba/fastjson2/function/impl/StringToAny;->defaultValue:Ljava/lang/Object;

    .line 260
    .line 261
    return-object p1
.end method
