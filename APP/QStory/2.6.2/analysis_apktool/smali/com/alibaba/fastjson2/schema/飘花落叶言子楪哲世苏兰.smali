.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子世哲楪兰苏:Z

.field public final 飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

.field public transient 飘花落叶言子世哲苏楪兰:Ljava/util/ArrayList;

.field public final 飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子世楪兰苏哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子世楪哲兰苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子世楪哲苏兰:I

.field public final 飘花落叶言子世楪苏兰哲:I

.field public final 飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子世苏兰楪哲:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子世苏哲楪兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子世苏楪哲兰:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪兰世哲苏:Ljava/util/Set;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪兰哲世苏:[J

.field public final 飘花落叶言子楪兰哲苏世:[L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪兰苏世哲:Z

.field public final 飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪哲兰苏世:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪哲苏兰世:Z


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)V
    .locals 10

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
    const-string v1, "object"

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Z

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/LinkedHashMap;

    .line 38
    .line 39
    const-string v0, "encoded"

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getBooleanValue(Ljava/lang/String;Z)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪兰苏:Z

    .line 47
    .line 48
    const-string v0, "definitions"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    check-cast v2, Ljava/util/Map$Entry;

    .line 75
    .line 76
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 87
    .line 88
    if-nez p2, :cond_0

    .line 89
    .line 90
    move-object v4, p0

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    move-object v4, p2

    .line 93
    :goto_1
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

    .line 98
    .line 99
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string v0, "$defs"

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    check-cast v2, Ljava/util/Map$Entry;

    .line 130
    .line 131
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Ljava/lang/String;

    .line 136
    .line 137
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 142
    .line 143
    if-nez p2, :cond_2

    .line 144
    .line 145
    move-object v4, p0

    .line 146
    goto :goto_3

    .line 147
    :cond_2
    move-object v4, p2

    .line 148
    :goto_3
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲苏楪兰:Ljava/util/ArrayList;

    .line 159
    .line 160
    if-eqz v0, :cond_6

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    if-eqz v2, :cond_6

    .line 171
    .line 172
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, L飘花落叶言楪子哲世兰苏/飘花落叶言子楪世哲苏兰;

    .line 177
    .line 178
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/LinkedHashMap;

    .line 182
    .line 183
    if-nez v3, :cond_5

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_5
    iget-object v4, v2, L飘花落叶言楪子哲世兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    check-cast v3, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 193
    .line 194
    if-eqz v3, :cond_4

    .line 195
    .line 196
    iget-object v4, v2, L飘花落叶言楪子哲世兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 197
    .line 198
    iget-object v2, v2, L飘花落叶言楪子哲世兰苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 199
    .line 200
    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_6
    const-string v0, "properties"

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sget-object v2, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;

    .line 211
    .line 212
    sget-object v3, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;

    .line 213
    .line 214
    if-eqz v0, :cond_d

    .line 215
    .line 216
    invoke-virtual {v0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :cond_7
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-eqz v4, :cond_d

    .line 229
    .line 230
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    check-cast v4, Ljava/util/Map$Entry;

    .line 235
    .line 236
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    check-cast v5, Ljava/lang/String;

    .line 241
    .line 242
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    instance-of v6, v4, Ljava/lang/Boolean;

    .line 247
    .line 248
    if-eqz v6, :cond_9

    .line 249
    .line 250
    check-cast v4, Ljava/lang/Boolean;

    .line 251
    .line 252
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    if-eqz v4, :cond_8

    .line 257
    .line 258
    move-object v4, v3

    .line 259
    goto :goto_7

    .line 260
    :cond_8
    move-object v4, v2

    .line 261
    goto :goto_7

    .line 262
    :cond_9
    instance-of v6, v4, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 263
    .line 264
    if-eqz v6, :cond_a

    .line 265
    .line 266
    check-cast v4, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_a
    check-cast v4, Lcom/alibaba/fastjson2/JSONObject;

    .line 270
    .line 271
    if-nez p2, :cond_b

    .line 272
    .line 273
    move-object v6, p0

    .line 274
    goto :goto_6

    .line 275
    :cond_b
    move-object v6, p2

    .line 276
    :goto_6
    invoke-static {v4, v6}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    :goto_7
    iget-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

    .line 281
    .line 282
    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    instance-of v6, v4, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏兰世;

    .line 286
    .line 287
    if-eqz v6, :cond_7

    .line 288
    .line 289
    check-cast v4, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏兰世;

    .line 290
    .line 291
    iget-object v4, v4, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 292
    .line 293
    new-instance v6, L飘花落叶言楪子哲世兰苏/飘花落叶言子楪世哲苏兰;

    .line 294
    .line 295
    iget-object v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

    .line 296
    .line 297
    invoke-direct {v6, v7, v5, v4}, L飘花落叶言楪子哲世兰苏/飘花落叶言子楪世哲苏兰;-><init>(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    if-nez p2, :cond_c

    .line 301
    .line 302
    move-object v4, p0

    .line 303
    goto :goto_8

    .line 304
    :cond_c
    move-object v4, p2

    .line 305
    :goto_8
    invoke-virtual {v4, v6}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世苏哲兰(L飘花落叶言楪子哲世兰苏/飘花落叶言子楪世哲苏兰;)V

    .line 306
    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_d
    const-string v0, "patternProperties"

    .line 310
    .line 311
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    if-eqz v0, :cond_11

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/util/AbstractMap;->size()I

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    new-array v4, v4, [L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 322
    .line 323
    iput-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:[L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    move v4, v1

    .line 334
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    if-eqz v5, :cond_12

    .line 339
    .line 340
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    check-cast v5, Ljava/util/Map$Entry;

    .line 345
    .line 346
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v6

    .line 350
    check-cast v6, Ljava/lang/String;

    .line 351
    .line 352
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    instance-of v7, v5, Ljava/lang/Boolean;

    .line 357
    .line 358
    if-eqz v7, :cond_f

    .line 359
    .line 360
    check-cast v5, Ljava/lang/Boolean;

    .line 361
    .line 362
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 363
    .line 364
    .line 365
    move-result v5

    .line 366
    if-eqz v5, :cond_e

    .line 367
    .line 368
    move-object v5, v3

    .line 369
    goto :goto_b

    .line 370
    :cond_e
    move-object v5, v2

    .line 371
    goto :goto_b

    .line 372
    :cond_f
    check-cast v5, Lcom/alibaba/fastjson2/JSONObject;

    .line 373
    .line 374
    if-nez p2, :cond_10

    .line 375
    .line 376
    move-object v7, p0

    .line 377
    goto :goto_a

    .line 378
    :cond_10
    move-object v7, p2

    .line 379
    :goto_a
    invoke-static {v5, v7}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    :goto_b
    iget-object v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:[L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 384
    .line 385
    add-int/lit8 v8, v4, 0x1

    .line 386
    .line 387
    new-instance v9, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 388
    .line 389
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    invoke-direct {v9, v6, v5}, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    aput-object v9, v7, v4

    .line 397
    .line 398
    move v4, v8

    .line 399
    goto :goto_9

    .line 400
    :cond_11
    new-array v0, v1, [L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 401
    .line 402
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:[L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 403
    .line 404
    :cond_12
    const-string v0, "required"

    .line 405
    .line 406
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    if-eqz v0, :cond_15

    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 413
    .line 414
    .line 415
    move-result v4

    .line 416
    if-eqz v4, :cond_13

    .line 417
    .line 418
    goto :goto_e

    .line 419
    :cond_13
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    invoke-direct {v4, v5}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 426
    .line 427
    .line 428
    iput-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/Set;

    .line 429
    .line 430
    move v4, v1

    .line 431
    :goto_c
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    iget-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/Set;

    .line 436
    .line 437
    if-ge v4, v5, :cond_14

    .line 438
    .line 439
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/JSONArray;->getString(I)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    invoke-interface {v6, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    add-int/lit8 v4, v4, 0x1

    .line 447
    .line 448
    goto :goto_c

    .line 449
    :cond_14
    invoke-interface {v6}, Ljava/util/Set;->size()I

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    new-array v0, v0, [J

    .line 454
    .line 455
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏:[J

    .line 456
    .line 457
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/Set;

    .line 458
    .line 459
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    move v4, v1

    .line 464
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 465
    .line 466
    .line 467
    move-result v5

    .line 468
    if-eqz v5, :cond_16

    .line 469
    .line 470
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    check-cast v5, Ljava/lang/String;

    .line 475
    .line 476
    iget-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏:[J

    .line 477
    .line 478
    add-int/lit8 v7, v4, 0x1

    .line 479
    .line 480
    invoke-static {v5}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 481
    .line 482
    .line 483
    move-result-wide v8

    .line 484
    aput-wide v8, v6, v4

    .line 485
    .line 486
    move v4, v7

    .line 487
    goto :goto_d

    .line 488
    :cond_15
    :goto_e
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 489
    .line 490
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/Set;

    .line 491
    .line 492
    new-array v0, v1, [J

    .line 493
    .line 494
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏:[J

    .line 495
    .line 496
    :cond_16
    const-string v0, "additionalProperties"

    .line 497
    .line 498
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    instance-of v4, v0, Ljava/lang/Boolean;

    .line 503
    .line 504
    const/4 v5, 0x0

    .line 505
    if-eqz v4, :cond_17

    .line 506
    .line 507
    iput-object v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 508
    .line 509
    check-cast v0, Ljava/lang/Boolean;

    .line 510
    .line 511
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 512
    .line 513
    .line 514
    move-result p2

    .line 515
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 516
    .line 517
    goto :goto_f

    .line 518
    :cond_17
    instance-of v4, v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 519
    .line 520
    if-eqz v4, :cond_18

    .line 521
    .line 522
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 523
    .line 524
    invoke-static {v0, p2}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 525
    .line 526
    .line 527
    move-result-object p2

    .line 528
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 529
    .line 530
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 531
    .line 532
    goto :goto_f

    .line 533
    :cond_18
    iput-object v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 534
    .line 535
    const/4 p2, 0x1

    .line 536
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 537
    .line 538
    :goto_f
    const-string p2, "propertyNames"

    .line 539
    .line 540
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object p2

    .line 544
    if-nez p2, :cond_19

    .line 545
    .line 546
    iput-object v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 547
    .line 548
    goto :goto_10

    .line 549
    :cond_19
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 550
    .line 551
    if-eqz v0, :cond_1b

    .line 552
    .line 553
    check-cast p2, Ljava/lang/Boolean;

    .line 554
    .line 555
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 556
    .line 557
    .line 558
    move-result p2

    .line 559
    if-eqz p2, :cond_1a

    .line 560
    .line 561
    move-object v2, v3

    .line 562
    :cond_1a
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 563
    .line 564
    goto :goto_10

    .line 565
    :cond_1b
    new-instance v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;

    .line 566
    .line 567
    check-cast p2, Lcom/alibaba/fastjson2/JSONObject;

    .line 568
    .line 569
    invoke-direct {v0, p2}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲苏世兰;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 570
    .line 571
    .line 572
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 573
    .line 574
    :goto_10
    const-string p2, "minProperties"

    .line 575
    .line 576
    const/4 v0, -0x1

    .line 577
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;I)I

    .line 578
    .line 579
    .line 580
    move-result p2

    .line 581
    iput p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏兰哲:I

    .line 582
    .line 583
    const-string p2, "maxProperties"

    .line 584
    .line 585
    invoke-virtual {p1, p2, v0}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;I)I

    .line 586
    .line 587
    .line 588
    move-result p2

    .line 589
    iput p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰:I

    .line 590
    .line 591
    const-string p2, "dependentRequired"

    .line 592
    .line 593
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 594
    .line 595
    .line 596
    move-result-object p2

    .line 597
    const/high16 v0, 0x3f800000    # 1.0f

    .line 598
    .line 599
    if-eqz p2, :cond_1d

    .line 600
    .line 601
    invoke-virtual {p2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    if-nez v2, :cond_1d

    .line 606
    .line 607
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 608
    .line 609
    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    .line 610
    .line 611
    .line 612
    move-result v3

    .line 613
    invoke-direct {v2, v3, v0}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 614
    .line 615
    .line 616
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲兰苏:Ljava/util/LinkedHashMap;

    .line 617
    .line 618
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 619
    .line 620
    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    invoke-direct {v2, v3, v0}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 625
    .line 626
    .line 627
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰苏哲:Ljava/util/LinkedHashMap;

    .line 628
    .line 629
    invoke-virtual {p2}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    .line 630
    .line 631
    .line 632
    move-result-object v2

    .line 633
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v2

    .line 637
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 638
    .line 639
    .line 640
    move-result v3

    .line 641
    if-eqz v3, :cond_1e

    .line 642
    .line 643
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    check-cast v3, Ljava/lang/String;

    .line 648
    .line 649
    const-class v4, [Ljava/lang/String;

    .line 650
    .line 651
    new-array v6, v1, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 652
    .line 653
    invoke-virtual {p2, v3, v4, v6}, Lcom/alibaba/fastjson2/JSONObject;->getObject(Ljava/lang/String;Ljava/lang/Class;[Lcom/alibaba/fastjson2/JSONReader$Feature;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    check-cast v4, [Ljava/lang/String;

    .line 658
    .line 659
    array-length v6, v4

    .line 660
    new-array v6, v6, [J

    .line 661
    .line 662
    move v7, v1

    .line 663
    :goto_12
    array-length v8, v4

    .line 664
    if-ge v7, v8, :cond_1c

    .line 665
    .line 666
    aget-object v8, v4, v7

    .line 667
    .line 668
    invoke-static {v8}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 669
    .line 670
    .line 671
    move-result-wide v8

    .line 672
    aput-wide v8, v6, v7

    .line 673
    .line 674
    add-int/lit8 v7, v7, 0x1

    .line 675
    .line 676
    goto :goto_12

    .line 677
    :cond_1c
    iget-object v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲兰苏:Ljava/util/LinkedHashMap;

    .line 678
    .line 679
    invoke-interface {v7, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰苏哲:Ljava/util/LinkedHashMap;

    .line 683
    .line 684
    invoke-static {v3}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 685
    .line 686
    .line 687
    move-result-wide v7

    .line 688
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    invoke-interface {v4, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    goto :goto_11

    .line 696
    :cond_1d
    iput-object v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲兰苏:Ljava/util/LinkedHashMap;

    .line 697
    .line 698
    iput-object v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰苏哲:Ljava/util/LinkedHashMap;

    .line 699
    .line 700
    :cond_1e
    const-string p2, "dependentSchemas"

    .line 701
    .line 702
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 703
    .line 704
    .line 705
    move-result-object p2

    .line 706
    const/16 v1, 0xf

    .line 707
    .line 708
    if-eqz p2, :cond_1f

    .line 709
    .line 710
    invoke-virtual {p2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 711
    .line 712
    .line 713
    move-result v2

    .line 714
    if-nez v2, :cond_1f

    .line 715
    .line 716
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 717
    .line 718
    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    .line 719
    .line 720
    .line 721
    move-result v3

    .line 722
    invoke-direct {v2, v3, v0}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 723
    .line 724
    .line 725
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

    .line 726
    .line 727
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 728
    .line 729
    invoke-virtual {p2}, Ljava/util/AbstractMap;->size()I

    .line 730
    .line 731
    .line 732
    move-result v3

    .line 733
    invoke-direct {v2, v3, v0}, Ljava/util/LinkedHashMap;-><init>(IF)V

    .line 734
    .line 735
    .line 736
    iput-object v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪哲兰:Ljava/util/LinkedHashMap;

    .line 737
    .line 738
    invoke-virtual {p2}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 743
    .line 744
    .line 745
    move-result-object v0

    .line 746
    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    if-eqz v2, :cond_20

    .line 751
    .line 752
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    check-cast v2, Ljava/lang/String;

    .line 757
    .line 758
    new-instance v3, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 759
    .line 760
    invoke-direct {v3, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 761
    .line 762
    .line 763
    invoke-virtual {p2, v2, v3}, Lcom/alibaba/fastjson2/JSONObject;->getObject(Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    check-cast v3, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 768
    .line 769
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

    .line 770
    .line 771
    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪哲兰:Ljava/util/LinkedHashMap;

    .line 775
    .line 776
    invoke-static {v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 777
    .line 778
    .line 779
    move-result-wide v6

    .line 780
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 781
    .line 782
    .line 783
    move-result-object v2

    .line 784
    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    goto :goto_13

    .line 788
    :cond_1f
    iput-object v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

    .line 789
    .line 790
    iput-object v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪哲兰:Ljava/util/LinkedHashMap;

    .line 791
    .line 792
    :cond_20
    new-instance p2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 793
    .line 794
    invoke-direct {p2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 795
    .line 796
    .line 797
    const-string v0, "if"

    .line 798
    .line 799
    invoke-virtual {p1, v0, p2}, Lcom/alibaba/fastjson2/JSONObject;->getObject(Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object p2

    .line 803
    check-cast p2, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 804
    .line 805
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 806
    .line 807
    new-instance p2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 808
    .line 809
    invoke-direct {p2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 810
    .line 811
    .line 812
    const-string v0, "else"

    .line 813
    .line 814
    invoke-virtual {p1, v0, p2}, Lcom/alibaba/fastjson2/JSONObject;->getObject(Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object p2

    .line 818
    check-cast p2, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 819
    .line 820
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 821
    .line 822
    new-instance p2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 823
    .line 824
    invoke-direct {p2, v1}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 825
    .line 826
    .line 827
    const-string v0, "then"

    .line 828
    .line 829
    invoke-virtual {p1, v0, p2}, Lcom/alibaba/fastjson2/JSONObject;->getObject(Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object p2

    .line 833
    check-cast p2, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 834
    .line 835
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 836
    .line 837
    const-string p2, "allOf"

    .line 838
    .line 839
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 840
    .line 841
    .line 842
    move-result-object p2

    .line 843
    invoke-static {p2, v5}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/JSONArray;Ljava/lang/Class;)[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 844
    .line 845
    .line 846
    move-result-object p2

    .line 847
    if-nez p2, :cond_21

    .line 848
    .line 849
    move-object v0, v5

    .line 850
    goto :goto_14

    .line 851
    :cond_21
    new-instance v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

    .line 852
    .line 853
    invoke-direct {v0, p2}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;-><init>([Lcom/alibaba/fastjson2/schema/JSONSchema;)V

    .line 854
    .line 855
    .line 856
    :goto_14
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

    .line 857
    .line 858
    const-string p2, "anyOf"

    .line 859
    .line 860
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 861
    .line 862
    .line 863
    move-result-object p2

    .line 864
    invoke-static {p2, v5}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/JSONArray;Ljava/lang/Class;)Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 865
    .line 866
    .line 867
    move-result-object p2

    .line 868
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 869
    .line 870
    const-string p2, "oneOf"

    .line 871
    .line 872
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 873
    .line 874
    .line 875
    move-result-object p1

    .line 876
    invoke-static {p1, v5}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/JSONArray;Ljava/lang/Class;)Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 877
    .line 878
    .line 879
    move-result-object p1

    .line 880
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 881
    .line 882
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(L飘花落叶言楪子哲世兰苏/飘花落叶言子楪世哲苏兰;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲苏楪兰:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲苏楪兰:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲苏楪兰:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Z

    .line 6
    .line 7
    sget-object v3, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    move-object/from16 v20, v3

    .line 17
    .line 18
    goto/16 :goto_13

    .line 19
    .line 20
    :cond_1
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪兰苏:Z

    .line 21
    .line 22
    if-eqz v4, :cond_3

    .line 23
    .line 24
    instance-of v4, v1, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    :try_start_0
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    goto :goto_0

    .line 35
    :catch_0
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏世哲兰:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_3
    :goto_0
    instance-of v4, v1, Ljava/util/Map;

    .line 39
    .line 40
    iget-object v5, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 41
    .line 42
    iget-object v6, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 43
    .line 44
    iget-object v7, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

    .line 45
    .line 46
    iget-object v8, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 47
    .line 48
    iget-object v9, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 49
    .line 50
    iget-object v10, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 51
    .line 52
    const-string v11, "property %s, dependentRequired property %s"

    .line 53
    .line 54
    iget-object v12, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲兰苏:Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    const-string v13, "maxProperties not match, expect %s, but %s"

    .line 57
    .line 58
    const-string v14, "minProperties not match, expect %s, but %s"

    .line 59
    .line 60
    iget-object v15, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/Set;

    .line 61
    .line 62
    move/from16 v16, v2

    .line 63
    .line 64
    iget-object v2, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

    .line 65
    .line 66
    move/from16 p1, v4

    .line 67
    .line 68
    iget v4, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏兰哲:I

    .line 69
    .line 70
    move-object/from16 v17, v12

    .line 71
    .line 72
    iget v12, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰:I

    .line 73
    .line 74
    move-object/from16 v18, v15

    .line 75
    .line 76
    if-eqz p1, :cond_21

    .line 77
    .line 78
    check-cast v1, Ljava/util/Map;

    .line 79
    .line 80
    invoke-interface/range {v18 .. v18}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v16

    .line 84
    :cond_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v18

    .line 88
    if-eqz v18, :cond_5

    .line 89
    .line 90
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v18

    .line 94
    move-object/from16 v15, v18

    .line 95
    .line 96
    check-cast v15, Ljava/lang/String;

    .line 97
    .line 98
    invoke-interface {v1, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v18

    .line 102
    if-nez v18, :cond_4

    .line 103
    .line 104
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 105
    .line 106
    const-string v1, "required %s"

    .line 107
    .line 108
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    const/4 v3, 0x0

    .line 113
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_5
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v15

    .line 121
    invoke-interface {v15}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v15

    .line 125
    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v16

    .line 129
    if-eqz v16, :cond_9

    .line 130
    .line 131
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v16

    .line 135
    check-cast v16, Ljava/util/Map$Entry;

    .line 136
    .line 137
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v18

    .line 141
    move-object/from16 v19, v15

    .line 142
    .line 143
    move-object/from16 v15, v18

    .line 144
    .line 145
    check-cast v15, Ljava/lang/String;

    .line 146
    .line 147
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v16

    .line 151
    move-object/from16 v20, v5

    .line 152
    .line 153
    move-object/from16 v5, v16

    .line 154
    .line 155
    check-cast v5, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 156
    .line 157
    move-object/from16 v21, v6

    .line 158
    .line 159
    invoke-interface {v1, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    if-nez v6, :cond_7

    .line 164
    .line 165
    invoke-interface {v1, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v16

    .line 169
    if-nez v16, :cond_7

    .line 170
    .line 171
    :cond_6
    move-object/from16 v15, v19

    .line 172
    .line 173
    move-object/from16 v5, v20

    .line 174
    .line 175
    move-object/from16 v6, v21

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_7
    invoke-virtual {v5, v6}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    iget-boolean v6, v5, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 183
    .line 184
    if-nez v6, :cond_6

    .line 185
    .line 186
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 187
    .line 188
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 193
    .line 194
    .line 195
    const/4 v3, 0x0

    .line 196
    iput-boolean v3, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 197
    .line 198
    const-string v2, "property %s invalid"

    .line 199
    .line 200
    iput-object v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v5, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 205
    .line 206
    array-length v1, v1

    .line 207
    if-nez v1, :cond_8

    .line 208
    .line 209
    iput-object v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 210
    .line 211
    :cond_8
    return-object v0

    .line 212
    :cond_9
    move-object/from16 v20, v5

    .line 213
    .line 214
    move-object/from16 v21, v6

    .line 215
    .line 216
    iget-object v5, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:[L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 217
    .line 218
    array-length v6, v5

    .line 219
    const/4 v15, 0x0

    .line 220
    :goto_2
    if-ge v15, v6, :cond_c

    .line 221
    .line 222
    move/from16 v16, v6

    .line 223
    .line 224
    aget-object v6, v5, v15

    .line 225
    .line 226
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 227
    .line 228
    .line 229
    move-result-object v18

    .line 230
    invoke-interface/range {v18 .. v18}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v18

    .line 234
    :goto_3
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v19

    .line 238
    if-eqz v19, :cond_b

    .line 239
    .line 240
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v19

    .line 244
    check-cast v19, Ljava/util/Map$Entry;

    .line 245
    .line 246
    move/from16 v22, v15

    .line 247
    .line 248
    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v15

    .line 252
    move-object/from16 v23, v7

    .line 253
    .line 254
    instance-of v7, v15, Ljava/lang/String;

    .line 255
    .line 256
    if-eqz v7, :cond_a

    .line 257
    .line 258
    check-cast v15, Ljava/lang/String;

    .line 259
    .line 260
    iget-object v7, v6, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 261
    .line 262
    check-cast v7, Ljava/util/regex/Pattern;

    .line 263
    .line 264
    invoke-virtual {v7, v15}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-eqz v7, :cond_a

    .line 273
    .line 274
    iget-object v7, v6, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v7, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 277
    .line 278
    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v15

    .line 282
    invoke-virtual {v7, v15}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    iget-boolean v15, v7, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 287
    .line 288
    if-nez v15, :cond_a

    .line 289
    .line 290
    return-object v7

    .line 291
    :cond_a
    move/from16 v15, v22

    .line 292
    .line 293
    move-object/from16 v7, v23

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_b
    move-object/from16 v23, v7

    .line 297
    .line 298
    move/from16 v22, v15

    .line 299
    .line 300
    add-int/lit8 v15, v22, 0x1

    .line 301
    .line 302
    move/from16 v6, v16

    .line 303
    .line 304
    goto :goto_2

    .line 305
    :cond_c
    move-object/from16 v23, v7

    .line 306
    .line 307
    iget-boolean v6, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 308
    .line 309
    if-nez v6, :cond_12

    .line 310
    .line 311
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v7

    .line 323
    if-eqz v7, :cond_12

    .line 324
    .line 325
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    check-cast v7, Ljava/util/Map$Entry;

    .line 330
    .line 331
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v15

    .line 335
    invoke-interface {v2, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v16

    .line 339
    if-eqz v16, :cond_d

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_d
    move-object/from16 v19, v2

    .line 343
    .line 344
    array-length v2, v5

    .line 345
    move-object/from16 v16, v5

    .line 346
    .line 347
    const/4 v5, 0x0

    .line 348
    :goto_5
    if-ge v5, v2, :cond_10

    .line 349
    .line 350
    move/from16 v18, v2

    .line 351
    .line 352
    aget-object v2, v16, v5

    .line 353
    .line 354
    move/from16 v22, v5

    .line 355
    .line 356
    instance-of v5, v15, Ljava/lang/String;

    .line 357
    .line 358
    if-eqz v5, :cond_f

    .line 359
    .line 360
    move-object v5, v15

    .line 361
    check-cast v5, Ljava/lang/String;

    .line 362
    .line 363
    iget-object v2, v2, L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v2, Ljava/util/regex/Pattern;

    .line 366
    .line 367
    invoke-virtual {v2, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-eqz v2, :cond_f

    .line 376
    .line 377
    :cond_e
    move-object/from16 v5, v16

    .line 378
    .line 379
    move-object/from16 v2, v19

    .line 380
    .line 381
    goto :goto_4

    .line 382
    :cond_f
    add-int/lit8 v5, v22, 0x1

    .line 383
    .line 384
    move/from16 v2, v18

    .line 385
    .line 386
    goto :goto_5

    .line 387
    :cond_10
    iget-object v2, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 388
    .line 389
    if-eqz v2, :cond_11

    .line 390
    .line 391
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {v2, v5}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    iget-boolean v5, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 400
    .line 401
    if-nez v5, :cond_e

    .line 402
    .line 403
    return-object v2

    .line 404
    :cond_11
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 405
    .line 406
    const-string v1, "add additionalProperties %s"

    .line 407
    .line 408
    filled-new-array {v15}, [Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    const/4 v3, 0x0

    .line 413
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 414
    .line 415
    .line 416
    return-object v0

    .line 417
    :cond_12
    iget-object v2, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 418
    .line 419
    if-eqz v2, :cond_14

    .line 420
    .line 421
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 426
    .line 427
    .line 428
    move-result-object v5

    .line 429
    :cond_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    if-eqz v6, :cond_14

    .line 434
    .line 435
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    invoke-virtual {v2, v6}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 440
    .line 441
    .line 442
    move-result-object v6

    .line 443
    iget-boolean v6, v6, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 444
    .line 445
    if-nez v6, :cond_13

    .line 446
    .line 447
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 448
    .line 449
    return-object v0

    .line 450
    :cond_14
    if-ltz v4, :cond_15

    .line 451
    .line 452
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    if-ge v2, v4, :cond_15

    .line 457
    .line 458
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 459
    .line 460
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v1

    .line 476
    const/4 v3, 0x0

    .line 477
    invoke-direct {v0, v14, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 478
    .line 479
    .line 480
    return-object v0

    .line 481
    :cond_15
    if-ltz v12, :cond_16

    .line 482
    .line 483
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    if-le v2, v12, :cond_16

    .line 488
    .line 489
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 490
    .line 491
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 496
    .line 497
    .line 498
    move-result v1

    .line 499
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    const/4 v3, 0x0

    .line 508
    invoke-direct {v0, v13, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 509
    .line 510
    .line 511
    return-object v0

    .line 512
    :cond_16
    if-eqz v17, :cond_19

    .line 513
    .line 514
    invoke-virtual/range {v17 .. v17}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    if-eqz v4, :cond_19

    .line 527
    .line 528
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    check-cast v4, Ljava/util/Map$Entry;

    .line 533
    .line 534
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    check-cast v5, Ljava/lang/String;

    .line 539
    .line 540
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v6

    .line 544
    if-eqz v6, :cond_17

    .line 545
    .line 546
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v4

    .line 550
    check-cast v4, [Ljava/lang/String;

    .line 551
    .line 552
    array-length v6, v4

    .line 553
    const/4 v7, 0x0

    .line 554
    :goto_6
    if-ge v7, v6, :cond_17

    .line 555
    .line 556
    aget-object v12, v4, v7

    .line 557
    .line 558
    invoke-interface {v1, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v13

    .line 562
    if-nez v13, :cond_18

    .line 563
    .line 564
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 565
    .line 566
    filled-new-array {v5, v12}, [Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    const/4 v3, 0x0

    .line 571
    invoke-direct {v0, v11, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 572
    .line 573
    .line 574
    return-object v0

    .line 575
    :cond_18
    add-int/lit8 v7, v7, 0x1

    .line 576
    .line 577
    goto :goto_6

    .line 578
    :cond_19
    iget-object v0, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

    .line 579
    .line 580
    if-eqz v0, :cond_1c

    .line 581
    .line 582
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    :cond_1a
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 591
    .line 592
    .line 593
    move-result v2

    .line 594
    if-eqz v2, :cond_1c

    .line 595
    .line 596
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    check-cast v2, Ljava/util/Map$Entry;

    .line 601
    .line 602
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v4

    .line 606
    check-cast v4, Ljava/lang/String;

    .line 607
    .line 608
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    if-nez v4, :cond_1b

    .line 613
    .line 614
    goto :goto_7

    .line 615
    :cond_1b
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v2

    .line 619
    check-cast v2, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 620
    .line 621
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    iget-boolean v4, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 626
    .line 627
    if-nez v4, :cond_1a

    .line 628
    .line 629
    return-object v2

    .line 630
    :cond_1c
    if-eqz v10, :cond_1e

    .line 631
    .line 632
    invoke-virtual {v10, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    if-ne v0, v3, :cond_1d

    .line 637
    .line 638
    if-eqz v9, :cond_1e

    .line 639
    .line 640
    invoke-virtual {v9, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    iget-boolean v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 645
    .line 646
    if-nez v2, :cond_1e

    .line 647
    .line 648
    return-object v0

    .line 649
    :cond_1d
    if-eqz v8, :cond_1e

    .line 650
    .line 651
    invoke-virtual {v8, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 652
    .line 653
    .line 654
    move-result-object v0

    .line 655
    iget-boolean v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 656
    .line 657
    if-nez v2, :cond_1e

    .line 658
    .line 659
    return-object v0

    .line 660
    :cond_1e
    if-eqz v23, :cond_1f

    .line 661
    .line 662
    move-object/from16 v2, v23

    .line 663
    .line 664
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    iget-boolean v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 669
    .line 670
    if-nez v2, :cond_1f

    .line 671
    .line 672
    return-object v0

    .line 673
    :cond_1f
    if-eqz v21, :cond_20

    .line 674
    .line 675
    move-object/from16 v5, v21

    .line 676
    .line 677
    invoke-virtual {v5, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    iget-boolean v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 682
    .line 683
    if-nez v2, :cond_20

    .line 684
    .line 685
    return-object v0

    .line 686
    :cond_20
    if-eqz v20, :cond_0

    .line 687
    .line 688
    move-object/from16 v6, v20

    .line 689
    .line 690
    invoke-virtual {v6, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 695
    .line 696
    if-nez v1, :cond_0

    .line 697
    .line 698
    return-object v0

    .line 699
    :cond_21
    move-object/from16 v19, v6

    .line 700
    .line 701
    move-object v6, v5

    .line 702
    move-object/from16 v5, v19

    .line 703
    .line 704
    move-object/from16 v19, v2

    .line 705
    .line 706
    move-object v2, v7

    .line 707
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    move-result-object v7

    .line 711
    sget-object v15, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;

    .line 712
    .line 713
    move-object/from16 v20, v3

    .line 714
    .line 715
    const/4 v3, 0x0

    .line 716
    invoke-virtual {v15, v7, v7, v3}, L飘花落叶言楪子哲兰世苏/飘花落叶言楪子世苏哲兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;

    .line 717
    .line 718
    .line 719
    move-result-object v15

    .line 720
    instance-of v3, v15, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 721
    .line 722
    if-nez v3, :cond_22

    .line 723
    .line 724
    if-eqz v16, :cond_3e

    .line 725
    .line 726
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 727
    .line 728
    sget-object v1, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Object:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 729
    .line 730
    filled-new-array {v1, v7}, [Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    const-string v2, "expect type %s, but %s"

    .line 735
    .line 736
    const/4 v3, 0x0

    .line 737
    invoke-direct {v0, v2, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 738
    .line 739
    .line 740
    return-object v0

    .line 741
    :cond_22
    const/4 v3, 0x0

    .line 742
    :goto_8
    iget-object v7, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏:[J

    .line 743
    .line 744
    move-object/from16 v16, v6

    .line 745
    .line 746
    array-length v6, v7

    .line 747
    const/16 v21, 0x0

    .line 748
    .line 749
    if-ge v3, v6, :cond_27

    .line 750
    .line 751
    aget-wide v6, v7, v3

    .line 752
    .line 753
    invoke-interface {v15, v6, v7}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 754
    .line 755
    .line 756
    move-result-object v6

    .line 757
    if-eqz v6, :cond_23

    .line 758
    .line 759
    invoke-virtual {v6, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v6

    .line 763
    goto :goto_9

    .line 764
    :cond_23
    move-object/from16 v6, v21

    .line 765
    .line 766
    :goto_9
    if-nez v6, :cond_26

    .line 767
    .line 768
    invoke-interface/range {v18 .. v18}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 769
    .line 770
    .line 771
    move-result-object v0

    .line 772
    const/4 v1, 0x0

    .line 773
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    if-eqz v2, :cond_25

    .line 778
    .line 779
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    check-cast v2, Ljava/lang/String;

    .line 784
    .line 785
    if-ne v1, v3, :cond_24

    .line 786
    .line 787
    move-object/from16 v21, v2

    .line 788
    .line 789
    :cond_24
    add-int/lit8 v1, v1, 0x1

    .line 790
    .line 791
    goto :goto_a

    .line 792
    :cond_25
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 793
    .line 794
    const-string v1, "required property %s"

    .line 795
    .line 796
    filled-new-array/range {v21 .. v21}, [Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    const/4 v3, 0x0

    .line 801
    invoke-direct {v0, v1, v2, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 802
    .line 803
    .line 804
    return-object v0

    .line 805
    :cond_26
    add-int/lit8 v3, v3, 0x1

    .line 806
    .line 807
    move-object/from16 v6, v16

    .line 808
    .line 809
    goto :goto_8

    .line 810
    :cond_27
    invoke-virtual/range {v19 .. v19}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 811
    .line 812
    .line 813
    move-result-object v3

    .line 814
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 819
    .line 820
    .line 821
    move-result v6

    .line 822
    if-eqz v6, :cond_2a

    .line 823
    .line 824
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v6

    .line 828
    check-cast v6, Ljava/util/Map$Entry;

    .line 829
    .line 830
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v7

    .line 834
    check-cast v7, Ljava/lang/String;

    .line 835
    .line 836
    move-object/from16 v18, v6

    .line 837
    .line 838
    invoke-static {v7}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)J

    .line 839
    .line 840
    .line 841
    move-result-wide v6

    .line 842
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v18

    .line 846
    move-object/from16 v19, v3

    .line 847
    .line 848
    move-object/from16 v3, v18

    .line 849
    .line 850
    check-cast v3, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 851
    .line 852
    invoke-interface {v15, v6, v7}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 853
    .line 854
    .line 855
    move-result-object v6

    .line 856
    if-eqz v6, :cond_28

    .line 857
    .line 858
    invoke-virtual {v6, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v6

    .line 862
    if-nez v6, :cond_29

    .line 863
    .line 864
    :cond_28
    move-object/from16 v3, v19

    .line 865
    .line 866
    goto :goto_b

    .line 867
    :cond_29
    invoke-virtual {v3, v6}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    iget-boolean v6, v3, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 872
    .line 873
    if-nez v6, :cond_28

    .line 874
    .line 875
    return-object v3

    .line 876
    :cond_2a
    if-gez v4, :cond_2b

    .line 877
    .line 878
    if-ltz v12, :cond_2f

    .line 879
    .line 880
    :cond_2b
    move-object v3, v15

    .line 881
    check-cast v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;

    .line 882
    .line 883
    iget-object v3, v3, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 884
    .line 885
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 886
    .line 887
    .line 888
    move-result-object v3

    .line 889
    const/4 v6, 0x0

    .line 890
    :cond_2c
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 891
    .line 892
    .line 893
    move-result v7

    .line 894
    if-eqz v7, :cond_2d

    .line 895
    .line 896
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v7

    .line 900
    check-cast v7, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 901
    .line 902
    invoke-virtual {v7, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v7

    .line 906
    if-eqz v7, :cond_2c

    .line 907
    .line 908
    add-int/lit8 v6, v6, 0x1

    .line 909
    .line 910
    goto :goto_c

    .line 911
    :cond_2d
    if-ltz v4, :cond_2e

    .line 912
    .line 913
    if-ge v6, v4, :cond_2e

    .line 914
    .line 915
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 916
    .line 917
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 918
    .line 919
    .line 920
    move-result-object v1

    .line 921
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 922
    .line 923
    .line 924
    move-result-object v2

    .line 925
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    const/4 v3, 0x0

    .line 930
    invoke-direct {v0, v14, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 931
    .line 932
    .line 933
    return-object v0

    .line 934
    :cond_2e
    const/4 v3, 0x0

    .line 935
    if-ltz v12, :cond_2f

    .line 936
    .line 937
    if-le v6, v12, :cond_2f

    .line 938
    .line 939
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 940
    .line 941
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 946
    .line 947
    .line 948
    move-result-object v2

    .line 949
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    invoke-direct {v0, v13, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 954
    .line 955
    .line 956
    return-object v0

    .line 957
    :cond_2f
    iget-object v3, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰苏哲:Ljava/util/LinkedHashMap;

    .line 958
    .line 959
    if-eqz v3, :cond_36

    .line 960
    .line 961
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 962
    .line 963
    .line 964
    move-result-object v3

    .line 965
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 966
    .line 967
    .line 968
    move-result-object v3

    .line 969
    const/4 v4, 0x0

    .line 970
    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 971
    .line 972
    .line 973
    move-result v6

    .line 974
    if-eqz v6, :cond_36

    .line 975
    .line 976
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v6

    .line 980
    check-cast v6, Ljava/util/Map$Entry;

    .line 981
    .line 982
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 983
    .line 984
    .line 985
    move-result-object v7

    .line 986
    check-cast v7, Ljava/lang/Long;

    .line 987
    .line 988
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v6

    .line 992
    check-cast v6, [J

    .line 993
    .line 994
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 995
    .line 996
    .line 997
    move-result-wide v12

    .line 998
    invoke-interface {v15, v12, v13}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 999
    .line 1000
    .line 1001
    move-result-object v7

    .line 1002
    invoke-virtual {v7, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v7

    .line 1006
    if-nez v7, :cond_30

    .line 1007
    .line 1008
    :goto_e
    add-int/lit8 v4, v4, 0x1

    .line 1009
    .line 1010
    goto :goto_d

    .line 1011
    :cond_30
    const/4 v7, 0x0

    .line 1012
    :goto_f
    array-length v12, v6

    .line 1013
    if-ge v7, v12, :cond_35

    .line 1014
    .line 1015
    aget-wide v12, v6, v7

    .line 1016
    .line 1017
    invoke-interface {v15, v12, v13}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v12

    .line 1021
    if-eqz v12, :cond_32

    .line 1022
    .line 1023
    invoke-virtual {v12, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v12

    .line 1027
    if-nez v12, :cond_31

    .line 1028
    .line 1029
    goto :goto_10

    .line 1030
    :cond_31
    add-int/lit8 v7, v7, 0x1

    .line 1031
    .line 1032
    goto :goto_f

    .line 1033
    :cond_32
    :goto_10
    invoke-virtual/range {v17 .. v17}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v0

    .line 1041
    move-object/from16 v1, v21

    .line 1042
    .line 1043
    move-object v2, v1

    .line 1044
    const/4 v3, 0x0

    .line 1045
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v5

    .line 1049
    if-eqz v5, :cond_34

    .line 1050
    .line 1051
    if-ne v4, v3, :cond_33

    .line 1052
    .line 1053
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v1

    .line 1057
    check-cast v1, Ljava/util/Map$Entry;

    .line 1058
    .line 1059
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    check-cast v2, Ljava/lang/String;

    .line 1064
    .line 1065
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    check-cast v1, [Ljava/lang/String;

    .line 1070
    .line 1071
    aget-object v1, v1, v7

    .line 1072
    .line 1073
    move-object/from16 v24, v2

    .line 1074
    .line 1075
    move-object v2, v1

    .line 1076
    move-object/from16 v1, v24

    .line 1077
    .line 1078
    :cond_33
    add-int/lit8 v3, v3, 0x1

    .line 1079
    .line 1080
    goto :goto_11

    .line 1081
    :cond_34
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 1082
    .line 1083
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v1

    .line 1087
    const/4 v6, 0x0

    .line 1088
    invoke-direct {v0, v11, v1, v6}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 1089
    .line 1090
    .line 1091
    return-object v0

    .line 1092
    :cond_35
    const/4 v6, 0x0

    .line 1093
    goto :goto_e

    .line 1094
    :cond_36
    iget-object v0, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪哲兰:Ljava/util/LinkedHashMap;

    .line 1095
    .line 1096
    if-eqz v0, :cond_39

    .line 1097
    .line 1098
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v0

    .line 1102
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v0

    .line 1106
    :cond_37
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1107
    .line 1108
    .line 1109
    move-result v3

    .line 1110
    if-eqz v3, :cond_39

    .line 1111
    .line 1112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v3

    .line 1116
    check-cast v3, Ljava/util/Map$Entry;

    .line 1117
    .line 1118
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v4

    .line 1122
    check-cast v4, Ljava/lang/Long;

    .line 1123
    .line 1124
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 1125
    .line 1126
    .line 1127
    move-result-wide v6

    .line 1128
    invoke-interface {v15, v6, v7}, L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪兰世哲苏(J)L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v4

    .line 1132
    if-eqz v4, :cond_37

    .line 1133
    .line 1134
    invoke-virtual {v4, v1}, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v4

    .line 1138
    if-nez v4, :cond_38

    .line 1139
    .line 1140
    goto :goto_12

    .line 1141
    :cond_38
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v3

    .line 1145
    check-cast v3, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 1146
    .line 1147
    invoke-virtual {v3, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v3

    .line 1151
    iget-boolean v4, v3, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 1152
    .line 1153
    if-nez v4, :cond_37

    .line 1154
    .line 1155
    return-object v3

    .line 1156
    :cond_39
    if-eqz v10, :cond_3b

    .line 1157
    .line 1158
    invoke-virtual {v10, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    iget-boolean v0, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 1163
    .line 1164
    if-eqz v0, :cond_3a

    .line 1165
    .line 1166
    if-eqz v9, :cond_3b

    .line 1167
    .line 1168
    invoke-virtual {v9, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    iget-boolean v3, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 1173
    .line 1174
    if-nez v3, :cond_3b

    .line 1175
    .line 1176
    return-object v0

    .line 1177
    :cond_3a
    if-eqz v8, :cond_3b

    .line 1178
    .line 1179
    invoke-virtual {v8, v1}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    iget-boolean v3, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 1184
    .line 1185
    if-nez v3, :cond_3b

    .line 1186
    .line 1187
    return-object v0

    .line 1188
    :cond_3b
    if-eqz v2, :cond_3c

    .line 1189
    .line 1190
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    iget-boolean v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 1195
    .line 1196
    if-nez v2, :cond_3c

    .line 1197
    .line 1198
    return-object v0

    .line 1199
    :cond_3c
    if-eqz v5, :cond_3d

    .line 1200
    .line 1201
    invoke-virtual {v5, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 1202
    .line 1203
    .line 1204
    move-result-object v0

    .line 1205
    iget-boolean v2, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 1206
    .line 1207
    if-nez v2, :cond_3d

    .line 1208
    .line 1209
    return-object v0

    .line 1210
    :cond_3d
    if-eqz v16, :cond_3e

    .line 1211
    .line 1212
    move-object/from16 v6, v16

    .line 1213
    .line 1214
    invoke-virtual {v6, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v0

    .line 1218
    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 1219
    .line 1220
    if-nez v1, :cond_3e

    .line 1221
    .line 1222
    return-object v0

    .line 1223
    :cond_3e
    :goto_13
    return-object v20
.end method

.method public 飘花落叶言子楪哲苏兰世()Lcom/alibaba/fastjson2/JSONObject;
    .locals 4
    .annotation runtime L飘花落叶言楪子世兰苏哲/飘花落叶言子楪世哲兰苏;
        value = true
    .end annotation

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
    const-string v2, "object"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    const-string v2, "title"

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const-string v2, "description"

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_2

    .line 38
    .line 39
    const-string v2, "definitions"

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰苏世:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-nez v2, :cond_3

    .line 51
    .line 52
    const-string v2, "defs"

    .line 53
    .line 54
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_4

    .line 64
    .line 65
    const-string v2, "properties"

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世哲苏:Ljava/util/Set;

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_5

    .line 77
    .line 78
    const-string v2, "required"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :cond_5
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏世哲:Z

    .line 84
    .line 85
    if-nez v1, :cond_7

    .line 86
    .line 87
    const-string v2, "additionalProperties"

    .line 88
    .line 89
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 90
    .line 91
    if-eqz v3, :cond_6

    .line 92
    .line 93
    invoke-virtual {v0, v2, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :cond_7
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲苏世:[L飘花落叶言楪世子苏兰哲/飘花落叶言子楪苏世兰哲;

    .line 105
    .line 106
    if-eqz v1, :cond_8

    .line 107
    .line 108
    array-length v2, v1

    .line 109
    if-eqz v2, :cond_8

    .line 110
    .line 111
    const-string v2, "patternProperties"

    .line 112
    .line 113
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    :cond_8
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 117
    .line 118
    if-eqz v1, :cond_9

    .line 119
    .line 120
    const-string v2, "propertyNames"

    .line 121
    .line 122
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_9
    const/4 v1, -0x1

    .line 126
    iget v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪苏兰哲:I

    .line 127
    .line 128
    if-eq v2, v1, :cond_a

    .line 129
    .line 130
    const-string v3, "minProperties"

    .line 131
    .line 132
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v0, v3, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :cond_a
    iget v2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰:I

    .line 140
    .line 141
    if-eq v2, v1, :cond_b

    .line 142
    .line 143
    const-string v1, "maxProperties"

    .line 144
    .line 145
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    :cond_b
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲兰苏:Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    if-eqz v1, :cond_c

    .line 155
    .line 156
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-nez v2, :cond_c

    .line 161
    .line 162
    const-string v2, "dependentRequired"

    .line 163
    .line 164
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    :cond_c
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏:Ljava/util/LinkedHashMap;

    .line 168
    .line 169
    if-eqz v1, :cond_d

    .line 170
    .line 171
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-nez v2, :cond_d

    .line 176
    .line 177
    const-string v2, "dependentSchemas"

    .line 178
    .line 179
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_d
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏楪兰哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 183
    .line 184
    if-eqz v1, :cond_e

    .line 185
    .line 186
    const-string v2, "if"

    .line 187
    .line 188
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :cond_e
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲楪兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 192
    .line 193
    if-eqz v1, :cond_f

    .line 194
    .line 195
    const-string v2, "then"

    .line 196
    .line 197
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    :cond_f
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏哲兰楪:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 201
    .line 202
    if-eqz v1, :cond_10

    .line 203
    .line 204
    const-string v2, "else"

    .line 205
    .line 206
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    :cond_10
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰楪哲:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

    .line 210
    .line 211
    if-eqz v1, :cond_11

    .line 212
    .line 213
    const-string v2, "allOf"

    .line 214
    .line 215
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    :cond_11
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世苏兰哲楪:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 219
    .line 220
    if-eqz v1, :cond_12

    .line 221
    .line 222
    const-string v2, "anyOf"

    .line 223
    .line 224
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    :cond_12
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世苏兰;->飘花落叶言子世哲楪苏兰:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 228
    .line 229
    if-eqz p0, :cond_13

    .line 230
    .line 231
    const-string v1, "oneOf"

    .line 232
    .line 233
    invoke-virtual {v0, v1, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    :cond_13
    return-object v0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Object:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
