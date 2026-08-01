.class public final L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰苏哲:Ljava/util/HashMap;

.field public 飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

.field public 飘花落叶言子楪世苏兰哲:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    iget-object p0, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    iget-object p1, p1, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-nez p0, :cond_2

    .line 20
    .line 21
    :goto_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 24
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    iget p0, p0, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 4
    .line 5
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "TemperatureCache(input="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ")"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏()L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;
    .locals 1

    .line 1
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/lit8 p0, p0, -0x1

    .line 14
    .line 15
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲()Ljava/util/Map;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/HashMap;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-object v1

    .line 8
    :cond_0
    invoke-virtual {v0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    new-instance v1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget v4, v3, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 47
    .line 48
    shr-int/lit8 v5, v4, 0x10

    .line 49
    .line 50
    and-int/lit16 v5, v5, 0xff

    .line 51
    .line 52
    invoke-static {v5}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(I)D

    .line 53
    .line 54
    .line 55
    move-result-wide v5

    .line 56
    shr-int/lit8 v7, v4, 0x8

    .line 57
    .line 58
    and-int/lit16 v7, v7, 0xff

    .line 59
    .line 60
    invoke-static {v7}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(I)D

    .line 61
    .line 62
    .line 63
    move-result-wide v7

    .line 64
    and-int/lit16 v4, v4, 0xff

    .line 65
    .line 66
    invoke-static {v4}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(I)D

    .line 67
    .line 68
    .line 69
    move-result-wide v9

    .line 70
    sget-object v4, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:[[D

    .line 71
    .line 72
    const/4 v11, 0x0

    .line 73
    aget-object v12, v4, v11

    .line 74
    .line 75
    aget-wide v13, v12, v11

    .line 76
    .line 77
    mul-double/2addr v13, v5

    .line 78
    const/4 v15, 0x1

    .line 79
    aget-wide v16, v12, v15

    .line 80
    .line 81
    mul-double v16, v16, v7

    .line 82
    .line 83
    add-double v16, v16, v13

    .line 84
    .line 85
    const/4 v13, 0x2

    .line 86
    aget-wide v18, v12, v13

    .line 87
    .line 88
    mul-double v18, v18, v9

    .line 89
    .line 90
    add-double v18, v18, v16

    .line 91
    .line 92
    aget-object v12, v4, v15

    .line 93
    .line 94
    aget-wide v16, v12, v11

    .line 95
    .line 96
    mul-double v16, v16, v5

    .line 97
    .line 98
    aget-wide v20, v12, v15

    .line 99
    .line 100
    mul-double v20, v20, v7

    .line 101
    .line 102
    add-double v20, v20, v16

    .line 103
    .line 104
    aget-wide v16, v12, v13

    .line 105
    .line 106
    mul-double v16, v16, v9

    .line 107
    .line 108
    add-double v16, v16, v20

    .line 109
    .line 110
    aget-object v4, v4, v13

    .line 111
    .line 112
    aget-wide v20, v4, v11

    .line 113
    .line 114
    mul-double v20, v20, v5

    .line 115
    .line 116
    aget-wide v5, v4, v15

    .line 117
    .line 118
    mul-double/2addr v5, v7

    .line 119
    add-double v5, v5, v20

    .line 120
    .line 121
    aget-wide v7, v4, v13

    .line 122
    .line 123
    mul-double/2addr v7, v9

    .line 124
    add-double/2addr v7, v5

    .line 125
    sget-object v4, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:[D

    .line 126
    .line 127
    aget-wide v5, v4, v11

    .line 128
    .line 129
    div-double v18, v18, v5

    .line 130
    .line 131
    aget-wide v5, v4, v15

    .line 132
    .line 133
    div-double v16, v16, v5

    .line 134
    .line 135
    aget-wide v5, v4, v13

    .line 136
    .line 137
    div-double/2addr v7, v5

    .line 138
    invoke-static/range {v18 .. v19}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(D)D

    .line 139
    .line 140
    .line 141
    move-result-wide v4

    .line 142
    invoke-static/range {v16 .. v17}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v9

    .line 146
    invoke-static {v7, v8}, L飘花落叶言楪兰子哲苏世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(D)D

    .line 147
    .line 148
    .line 149
    move-result-wide v6

    .line 150
    const-wide/high16 v16, 0x405d000000000000L    # 116.0

    .line 151
    .line 152
    mul-double v16, v16, v9

    .line 153
    .line 154
    const-wide/high16 v18, 0x4030000000000000L    # 16.0

    .line 155
    .line 156
    sub-double v16, v16, v18

    .line 157
    .line 158
    const-wide v18, 0x407f400000000000L    # 500.0

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    sub-double/2addr v4, v9

    .line 164
    mul-double v4, v4, v18

    .line 165
    .line 166
    const-wide/high16 v18, 0x4069000000000000L    # 200.0

    .line 167
    .line 168
    sub-double/2addr v9, v6

    .line 169
    mul-double v9, v9, v18

    .line 170
    .line 171
    const/4 v6, 0x3

    .line 172
    new-array v6, v6, [D

    .line 173
    .line 174
    aput-wide v16, v6, v11

    .line 175
    .line 176
    aput-wide v4, v6, v15

    .line 177
    .line 178
    aput-wide v9, v6, v13

    .line 179
    .line 180
    aget-wide v4, v6, v13

    .line 181
    .line 182
    aget-wide v7, v6, v15

    .line 183
    .line 184
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->atan2(DD)D

    .line 185
    .line 186
    .line 187
    move-result-wide v4

    .line 188
    const-wide v7, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    mul-double/2addr v4, v7

    .line 194
    const-wide v7, 0x4076800000000000L    # 360.0

    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    rem-double/2addr v4, v7

    .line 200
    const-wide/16 v9, 0x0

    .line 201
    .line 202
    cmpg-double v11, v4, v9

    .line 203
    .line 204
    if-gez v11, :cond_1

    .line 205
    .line 206
    add-double/2addr v4, v7

    .line 207
    :cond_1
    aget-wide v11, v6, v15

    .line 208
    .line 209
    aget-wide v13, v6, v13

    .line 210
    .line 211
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 212
    .line 213
    .line 214
    move-result-wide v11

    .line 215
    const-wide v13, 0x3ff11eb851eb851fL    # 1.07

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    invoke-static {v11, v12, v13, v14}, Ljava/lang/Math;->pow(DD)D

    .line 221
    .line 222
    .line 223
    move-result-wide v11

    .line 224
    const-wide v13, 0x3f947ae147ae147bL    # 0.02

    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    mul-double/2addr v11, v13

    .line 230
    const-wide/high16 v13, 0x4049000000000000L    # 50.0

    .line 231
    .line 232
    sub-double/2addr v4, v13

    .line 233
    rem-double/2addr v4, v7

    .line 234
    cmpg-double v6, v4, v9

    .line 235
    .line 236
    if-gez v6, :cond_2

    .line 237
    .line 238
    add-double/2addr v4, v7

    .line 239
    :cond_2
    const-wide v6, 0x3f91df46a2529d39L    # 0.017453292519943295

    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    mul-double/2addr v4, v6

    .line 245
    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    .line 246
    .line 247
    .line 248
    move-result-wide v4

    .line 249
    mul-double/2addr v4, v11

    .line 250
    const-wide/high16 v6, -0x4020000000000000L    # -0.5

    .line 251
    .line 252
    add-double/2addr v4, v6

    .line 253
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_3
    iput-object v1, v0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/HashMap;

    .line 263
    .line 264
    return-object v1
.end method

.method public final 飘花落叶言子楪世哲兰苏(L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;)D
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏()L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v0, Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v0, Ljava/lang/Number;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v2, Ljava/util/HashMap;

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast v2, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    sub-double/2addr v0, v2

    .line 51
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    check-cast p1, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲()Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰()L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    check-cast p1, Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    check-cast p0, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 90
    .line 91
    .line 92
    move-result-wide p0

    .line 93
    sub-double/2addr v2, p0

    .line 94
    const-wide/16 p0, 0x0

    .line 95
    .line 96
    cmpg-double p0, v0, p0

    .line 97
    .line 98
    if-nez p0, :cond_0

    .line 99
    .line 100
    const-wide/high16 p0, 0x3fe0000000000000L    # 0.5

    .line 101
    .line 102
    return-wide p0

    .line 103
    :cond_0
    div-double/2addr v2, v0

    .line 104
    return-wide v2
.end method

.method public final 飘花落叶言子楪世哲苏兰()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    new-instance v0, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏兰哲;

    .line 21
    .line 22
    const/4 v2, 0x3

    .line 23
    invoke-direct {v0, p0, v2}, Landroidx/compose/ui/semantics/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v0}, Lkotlin/collections/飘花落叶言子楪兰苏世哲;->飘花落叶言子苏哲楪世兰(Ljava/util/List;Ljava/util/Comparator;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 30
    .line 31
    return-object v1
.end method

.method public final 飘花落叶言子楪世苏兰哲()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    move-wide v3, v1

    .line 14
    :goto_0
    const-wide v1, 0x4076800000000000L    # 360.0

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmpg-double v1, v3, v1

    .line 20
    .line 21
    if-gtz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    iget-wide v5, v1, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:D

    .line 26
    .line 27
    iget-wide v7, v1, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:D

    .line 28
    .line 29
    invoke-static/range {v3 .. v8}, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(DDD)L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 37
    .line 38
    add-double/2addr v3, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子世哲苏兰楪(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/Iterable;

    .line 64
    .line 65
    invoke-static {v2, v1}, Lkotlin/collections/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏哲楪兰世(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    iput-object v1, p0, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/ArrayList;

    .line 70
    .line 71
    return-object v1
.end method

.method public final 飘花落叶言子楪世苏哲兰()L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;
    .locals 1

    .line 1
    invoke-virtual {p0}, L飘花落叶言楪兰子哲世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, L飘花落叶言楪兰子世哲苏/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    return-object p0
.end method
