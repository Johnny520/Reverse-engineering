.class public final Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;
.super Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

.field public static final 飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

    .line 8
    .line 9
    new-instance v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世哲苏兰:Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 11
    .line 12
    :goto_0
    const/4 v2, 0x1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 17
    .line 18
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    instance-of v3, v0, Ljava/util/Map;

    .line 22
    .line 23
    iget-boolean p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 24
    .line 25
    if-eqz v3, :cond_5

    .line 26
    .line 27
    check-cast v0, Ljava/util/Map;

    .line 28
    .line 29
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-direct {v3, v4}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    instance-of v5, v4, Ljava/util/Collection;

    .line 59
    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    check-cast v4, Ljava/util/Collection;

    .line 63
    .line 64
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {v3, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    if-eqz v1, :cond_4

    .line 73
    .line 74
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 75
    .line 76
    invoke-direct {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;-><init>(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_4
    iput-object v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 83
    .line 84
    :goto_2
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 85
    .line 86
    return-void

    .line 87
    :cond_5
    instance-of v3, v0, Ljava/util/List;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    if-eqz v3, :cond_a

    .line 91
    .line 92
    move-object v3, v0

    .line 93
    check-cast v3, Ljava/util/List;

    .line 94
    .line 95
    new-instance v5, Lcom/alibaba/fastjson2/JSONArray;

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-direct {v5, v6}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 102
    .line 103
    .line 104
    if-nez v1, :cond_8

    .line 105
    .line 106
    if-nez p0, :cond_8

    .line 107
    .line 108
    :goto_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-ge v4, p0, :cond_7

    .line 113
    .line 114
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    instance-of v0, p0, Ljava/util/Map;

    .line 119
    .line 120
    if-eqz v0, :cond_6

    .line 121
    .line 122
    check-cast p0, Ljava/util/Map;

    .line 123
    .line 124
    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {v5, p0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_6
    invoke-virtual {v5, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_7
    iput-object v5, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 139
    .line 140
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 141
    .line 142
    return-void

    .line 143
    :cond_8
    if-eqz v1, :cond_9

    .line 144
    .line 145
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 146
    .line 147
    invoke-direct {p0, v3}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;-><init>(Ljava/util/List;)V

    .line 148
    .line 149
    .line 150
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_9
    iput-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 154
    .line 155
    :goto_5
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 156
    .line 157
    return-void

    .line 158
    :cond_a
    instance-of v3, v0, Ljava/util/Collection;

    .line 159
    .line 160
    if-eqz v3, :cond_b

    .line 161
    .line 162
    iput-object v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 163
    .line 164
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 165
    .line 166
    return-void

    .line 167
    :cond_b
    instance-of v3, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 168
    .line 169
    if-eqz v3, :cond_10

    .line 170
    .line 171
    check-cast v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 172
    .line 173
    iget-object v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 174
    .line 175
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    invoke-direct {v3, v5}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 182
    .line 183
    .line 184
    if-nez v1, :cond_f

    .line 185
    .line 186
    :goto_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-ge v4, v1, :cond_e

    .line 191
    .line 192
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    instance-of v5, v1, Ljava/util/Map;

    .line 197
    .line 198
    if-eqz v5, :cond_c

    .line 199
    .line 200
    if-nez p0, :cond_c

    .line 201
    .line 202
    check-cast v1, Ljava/util/Map;

    .line 203
    .line 204
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_c
    instance-of v5, v1, Ljava/util/Collection;

    .line 213
    .line 214
    if-eqz v5, :cond_d

    .line 215
    .line 216
    check-cast v1, Ljava/util/Collection;

    .line 217
    .line 218
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 219
    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_d
    invoke-virtual {v3, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    :goto_7
    add-int/lit8 v4, v4, 0x1

    .line 226
    .line 227
    goto :goto_6

    .line 228
    :cond_e
    iput-object v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 229
    .line 230
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 231
    .line 232
    return-void

    .line 233
    :cond_f
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 234
    .line 235
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;-><init>(Ljava/util/List;)V

    .line 236
    .line 237
    .line 238
    iput-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 239
    .line 240
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 241
    .line 242
    return-void

    .line 243
    :cond_10
    iget-object p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 244
    .line 245
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    iget-object p0, p0, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 250
    .line 251
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-virtual {p0, v1, v1, v4}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-interface {p0}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪苏哲世兰()Ljava/util/List;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    new-instance v3, Lcom/alibaba/fastjson2/JSONArray;

    .line 268
    .line 269
    invoke-direct {v3, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 270
    .line 271
    .line 272
    :goto_8
    if-ge v4, v1, :cond_11

    .line 273
    .line 274
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    check-cast v5, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 279
    .line 280
    invoke-virtual {v5, v0}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v3, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    add-int/lit8 v4, v4, 0x1

    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_11
    iput-object v3, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 291
    .line 292
    iput-boolean v2, p1, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 293
    .line 294
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V
    .locals 7

    .line 1
    iget-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;

    .line 2
    .line 3
    iget-object v1, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:Lcom/alibaba/fastjson2/飘花落叶言子苏哲楪兰世;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世兰哲楪()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iput-boolean v2, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-boolean v0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲兰世苏:Z

    .line 26
    .line 27
    if-eqz v0, :cond_6

    .line 28
    .line 29
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 32
    .line 33
    .line 34
    const/16 v2, -0x5a

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_4

    .line 41
    .line 42
    :goto_0
    const/16 v1, -0x5b

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲楪兰世苏(B)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲子兰()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Z

    .line 58
    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    instance-of v2, v1, Ljava/util/Collection;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    check-cast v1, Ljava/util/Collection;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_3
    iput-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏世楪兰哲()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_5

    .line 83
    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_5
    const-string p0, "TODO"

    .line 89
    .line 90
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_6
    if-nez v1, :cond_7

    .line 95
    .line 96
    iget-object p0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;

    .line 97
    .line 98
    iget-wide v3, p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:J

    .line 99
    .line 100
    sget-object p0, Lcom/alibaba/fastjson2/JSONPath$Feature;->AlwaysReturnList:Lcom/alibaba/fastjson2/JSONPath$Feature;

    .line 101
    .line 102
    iget-wide v5, p0, Lcom/alibaba/fastjson2/JSONPath$Feature;->mask:J

    .line 103
    .line 104
    and-long/2addr v3, v5

    .line 105
    const-wide/16 v5, 0x0

    .line 106
    .line 107
    cmp-long p0, v3, v5

    .line 108
    .line 109
    if-eqz p0, :cond_7

    .line 110
    .line 111
    move p0, v2

    .line 112
    goto :goto_1

    .line 113
    :cond_7
    const/4 p0, 0x0

    .line 114
    :goto_1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 115
    .line 116
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲苏世楪兰()Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    const/16 v4, 0x2c

    .line 124
    .line 125
    const/16 v5, 0x5d

    .line 126
    .line 127
    const/16 v6, 0x5b

    .line 128
    .line 129
    if-eqz v3, :cond_13

    .line 130
    .line 131
    :cond_8
    :goto_2
    iget-char v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 132
    .line 133
    const/16 v3, 0x7d

    .line 134
    .line 135
    if-ne v1, v3, :cond_9

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏世哲子兰()V

    .line 142
    .line 143
    .line 144
    iget-char v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 145
    .line 146
    const/16 v3, 0x22

    .line 147
    .line 148
    if-eq v1, v3, :cond_10

    .line 149
    .line 150
    const/16 v3, 0x27

    .line 151
    .line 152
    if-eq v1, v3, :cond_10

    .line 153
    .line 154
    const/16 v3, 0x2b

    .line 155
    .line 156
    if-eq v1, v3, :cond_f

    .line 157
    .line 158
    const/16 v3, 0x2d

    .line 159
    .line 160
    if-eq v1, v3, :cond_f

    .line 161
    .line 162
    if-eq v1, v6, :cond_e

    .line 163
    .line 164
    if-eq v1, v5, :cond_d

    .line 165
    .line 166
    const/16 v3, 0x66

    .line 167
    .line 168
    if-eq v1, v3, :cond_c

    .line 169
    .line 170
    const/16 v3, 0x6e

    .line 171
    .line 172
    if-eq v1, v3, :cond_b

    .line 173
    .line 174
    const/16 v3, 0x74

    .line 175
    .line 176
    if-eq v1, v3, :cond_c

    .line 177
    .line 178
    const/16 v3, 0x7b

    .line 179
    .line 180
    if-eq v1, v3, :cond_a

    .line 181
    .line 182
    packed-switch v1, :pswitch_data_0

    .line 183
    .line 184
    .line 185
    const-string p0, "TODO : "

    .line 186
    .line 187
    iget-char p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 188
    .line 189
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(ILjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_a
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏兰子()Ljava/util/Map;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    goto :goto_4

    .line 198
    :cond_b
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏兰哲子()V

    .line 199
    .line 200
    .line 201
    const/4 v1, 0x0

    .line 202
    goto :goto_4

    .line 203
    :cond_c
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰世哲楪苏()Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    goto :goto_4

    .line 212
    :cond_d
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 213
    .line 214
    .line 215
    :goto_3
    iput-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 216
    .line 217
    iput-boolean v2, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 218
    .line 219
    return-void

    .line 220
    :cond_e
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏哲世()Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    goto :goto_4

    .line 225
    :cond_f
    :pswitch_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子世哲苏楪兰()Ljava/lang/Number;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    goto :goto_4

    .line 233
    :cond_10
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世兰哲子苏()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    :goto_4
    instance-of v3, v1, Ljava/util/Collection;

    .line 238
    .line 239
    if-eqz v3, :cond_12

    .line 240
    .line 241
    if-eqz p0, :cond_11

    .line 242
    .line 243
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_11
    check-cast v1, Ljava/util/Collection;

    .line 248
    .line 249
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :cond_12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    :goto_5
    iget-char v1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 257
    .line 258
    if-ne v1, v4, :cond_8

    .line 259
    .line 260
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 261
    .line 262
    .line 263
    goto/16 :goto_2

    .line 264
    .line 265
    :cond_13
    iget-char p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 266
    .line 267
    if-ne p0, v6, :cond_17

    .line 268
    .line 269
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 270
    .line 271
    .line 272
    :cond_14
    :goto_6
    iget-char p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 273
    .line 274
    if-ne p0, v5, :cond_16

    .line 275
    .line 276
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 277
    .line 278
    .line 279
    if-eqz v1, :cond_15

    .line 280
    .line 281
    new-instance p0, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;

    .line 282
    .line 283
    invoke-direct {p0, v0}, Lcom/alibaba/fastjson2/飘花落叶言子楪兰苏世哲;-><init>(Ljava/util/List;)V

    .line 284
    .line 285
    .line 286
    iput-object p0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_15
    iput-object v0, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 290
    .line 291
    :goto_7
    iput-boolean v2, p2, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰:Z

    .line 292
    .line 293
    return-void

    .line 294
    :cond_16
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子兰楪苏世哲()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    iget-char p0, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪兰世哲苏:C

    .line 302
    .line 303
    if-ne p0, v4, :cond_14

    .line 304
    .line 305
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏兰哲世楪()V

    .line 306
    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_17
    :goto_8
    return-void

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
