.class public final Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;
.super Lcom/alibaba/fastjson2/schema/JSONSchema;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子世楪兰哲苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

.field public final 飘花落叶言子世楪兰苏哲:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子世楪哲兰苏:Z

.field public final 飘花落叶言子世楪哲苏兰:I

.field public final 飘花落叶言子世楪苏兰哲:I

.field public final 飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子世苏楪兰哲:Z

.field public final 飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪兰世哲苏:I

.field public final 飘花落叶言子楪兰世苏哲:I

.field public final 飘花落叶言子楪兰哲世苏:Z

.field public final 飘花落叶言子楪兰哲苏世:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子楪兰苏哲世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

.field public final 飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

.field public final 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)V
    .locals 9

    .line 1
    invoke-direct {p0, p1}, Lcom/alibaba/fastjson2/schema/JSONSchema;-><init>(Lcom/alibaba/fastjson2/JSONObject;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "type"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "array"

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    const-string v0, "encoded"

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONObject;->getBooleanValue(Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲:Z

    .line 40
    .line 41
    const-string v0, "definitions"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, Ljava/util/Map$Entry;

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Ljava/lang/String;

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 80
    .line 81
    if-nez p2, :cond_0

    .line 82
    .line 83
    move-object v4, p0

    .line 84
    goto :goto_1

    .line 85
    :cond_0
    move-object v4, p2

    .line 86
    :goto_1
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/LinkedHashMap;

    .line 91
    .line 92
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const-string v0, "$defs"

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getJSONObject(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONObject;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/util/AbstractMap;->entrySet()Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/util/Map$Entry;

    .line 123
    .line 124
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    check-cast v3, Ljava/lang/String;

    .line 129
    .line 130
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Lcom/alibaba/fastjson2/JSONObject;

    .line 135
    .line 136
    if-nez p2, :cond_2

    .line 137
    .line 138
    move-object v4, p0

    .line 139
    goto :goto_3

    .line 140
    :cond_2
    move-object v4, p2

    .line 141
    :goto_3
    invoke-static {v2, v4}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iget-object v4, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-interface {v4, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_3
    const-string v0, "minItems"

    .line 152
    .line 153
    const/4 v2, -0x1

    .line 154
    invoke-virtual {p1, v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;I)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iput v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 159
    .line 160
    const-string v0, "maxItems"

    .line 161
    .line 162
    invoke-virtual {p1, v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;I)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    iput v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 167
    .line 168
    const-string v0, "items"

    .line 169
    .line 170
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    const-string v3, "additionalItems"

    .line 175
    .line 176
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    const-string v4, "prefixItems"

    .line 181
    .line 182
    invoke-virtual {p1, v4}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    const/4 v5, 0x1

    .line 187
    const/4 v6, 0x0

    .line 188
    if-nez v0, :cond_4

    .line 189
    .line 190
    iput-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 191
    .line 192
    :goto_4
    move v7, v5

    .line 193
    goto :goto_6

    .line 194
    :cond_4
    instance-of v7, v0, Ljava/lang/Boolean;

    .line 195
    .line 196
    if-eqz v7, :cond_5

    .line 197
    .line 198
    move-object v7, v0

    .line 199
    check-cast v7, Ljava/lang/Boolean;

    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    iput-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_5
    instance-of v7, v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 209
    .line 210
    if-eqz v7, :cond_7

    .line 211
    .line 212
    if-nez v4, :cond_6

    .line 213
    .line 214
    move-object v4, v0

    .line 215
    check-cast v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 216
    .line 217
    iput-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_6
    const-string p0, "schema error, items : "

    .line 221
    .line 222
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    invoke-static {p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    throw v6

    .line 230
    :cond_7
    move-object v7, v0

    .line 231
    check-cast v7, Lcom/alibaba/fastjson2/JSONObject;

    .line 232
    .line 233
    if-eqz p2, :cond_8

    .line 234
    .line 235
    move-object v8, p2

    .line 236
    goto :goto_5

    .line 237
    :cond_8
    move-object v8, p0

    .line 238
    :goto_5
    invoke-static {v7, v8}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    iput-object v7, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 243
    .line 244
    goto :goto_4

    .line 245
    :goto_6
    instance-of v8, v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 246
    .line 247
    if-eqz v8, :cond_a

    .line 248
    .line 249
    check-cast v3, Lcom/alibaba/fastjson2/JSONObject;

    .line 250
    .line 251
    if-nez p2, :cond_9

    .line 252
    .line 253
    move-object v7, p0

    .line 254
    goto :goto_7

    .line 255
    :cond_9
    move-object v7, p2

    .line 256
    :goto_7
    invoke-static {v3, v7}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    iput-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 261
    .line 262
    move v7, v5

    .line 263
    goto :goto_8

    .line 264
    :cond_a
    instance-of v8, v3, Ljava/lang/Boolean;

    .line 265
    .line 266
    if-eqz v8, :cond_b

    .line 267
    .line 268
    check-cast v3, Ljava/lang/Boolean;

    .line 269
    .line 270
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 271
    .line 272
    .line 273
    move-result v7

    .line 274
    iput-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_b
    iput-object v6, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 278
    .line 279
    :goto_8
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 280
    .line 281
    if-eqz v3, :cond_c

    .line 282
    .line 283
    instance-of v3, v3, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;

    .line 284
    .line 285
    if-nez v3, :cond_c

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :cond_c
    if-nez v4, :cond_d

    .line 289
    .line 290
    instance-of v0, v0, Ljava/lang/Boolean;

    .line 291
    .line 292
    if-nez v0, :cond_d

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_d
    move v5, v7

    .line 296
    :goto_9
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:Z

    .line 297
    .line 298
    if-nez v4, :cond_e

    .line 299
    .line 300
    new-array p2, v1, [Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 301
    .line 302
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 303
    .line 304
    goto :goto_d

    .line 305
    :cond_e
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    new-array v0, v0, [Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 310
    .line 311
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 312
    .line 313
    :goto_a
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-ge v1, v0, :cond_12

    .line 318
    .line 319
    invoke-virtual {v4, v1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    instance-of v3, v0, Ljava/lang/Boolean;

    .line 324
    .line 325
    if-eqz v3, :cond_10

    .line 326
    .line 327
    check-cast v0, Ljava/lang/Boolean;

    .line 328
    .line 329
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_f

    .line 334
    .line 335
    sget-object v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;

    .line 336
    .line 337
    goto :goto_c

    .line 338
    :cond_f
    sget-object v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪苏哲兰世;

    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_10
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 342
    .line 343
    if-nez p2, :cond_11

    .line 344
    .line 345
    move-object v3, p0

    .line 346
    goto :goto_b

    .line 347
    :cond_11
    move-object v3, p2

    .line 348
    :goto_b
    invoke-static {v0, v3}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰哲世(Lcom/alibaba/fastjson2/JSONObject;Lcom/alibaba/fastjson2/schema/JSONSchema;)Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    :goto_c
    iget-object v3, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 353
    .line 354
    aput-object v0, v3, v1

    .line 355
    .line 356
    add-int/lit8 v1, v1, 0x1

    .line 357
    .line 358
    goto :goto_a

    .line 359
    :cond_12
    :goto_d
    new-instance p2, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;

    .line 360
    .line 361
    const/16 v0, 0xf

    .line 362
    .line 363
    invoke-direct {p2, v0}, Lcom/alibaba/fastjson2/reader/飘花落叶言子兰世苏楪哲;-><init>(I)V

    .line 364
    .line 365
    .line 366
    const-string v0, "contains"

    .line 367
    .line 368
    invoke-virtual {p1, v0, p2}, Lcom/alibaba/fastjson2/JSONObject;->getObject(Ljava/lang/String;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object p2

    .line 372
    check-cast p2, Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 373
    .line 374
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 375
    .line 376
    const-string p2, "minContains"

    .line 377
    .line 378
    invoke-virtual {p1, p2, v2}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;I)I

    .line 379
    .line 380
    .line 381
    move-result p2

    .line 382
    iput p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:I

    .line 383
    .line 384
    const-string p2, "maxContains"

    .line 385
    .line 386
    invoke-virtual {p1, p2, v2}, Lcom/alibaba/fastjson2/JSONObject;->getIntValue(Ljava/lang/String;I)I

    .line 387
    .line 388
    .line 389
    move-result p2

    .line 390
    iput p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:I

    .line 391
    .line 392
    const-string p2, "uniqueItems"

    .line 393
    .line 394
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getBooleanValue(Ljava/lang/String;)Z

    .line 395
    .line 396
    .line 397
    move-result p2

    .line 398
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏:Z

    .line 399
    .line 400
    const-string p2, "allOf"

    .line 401
    .line 402
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 403
    .line 404
    .line 405
    move-result-object p2

    .line 406
    invoke-static {p2, v6}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/JSONArray;Ljava/lang/Class;)[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 407
    .line 408
    .line 409
    move-result-object p2

    .line 410
    if-nez p2, :cond_13

    .line 411
    .line 412
    move-object v0, v6

    .line 413
    goto :goto_e

    .line 414
    :cond_13
    new-instance v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

    .line 415
    .line 416
    invoke-direct {v0, p2}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;-><init>([Lcom/alibaba/fastjson2/schema/JSONSchema;)V

    .line 417
    .line 418
    .line 419
    :goto_e
    iput-object v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰苏哲:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

    .line 420
    .line 421
    const-string p2, "anyOf"

    .line 422
    .line 423
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 424
    .line 425
    .line 426
    move-result-object p2

    .line 427
    invoke-static {p2, v6}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世苏兰哲(Lcom/alibaba/fastjson2/JSONArray;Ljava/lang/Class;)Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 428
    .line 429
    .line 430
    move-result-object p2

    .line 431
    iput-object p2, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 432
    .line 433
    const-string p2, "oneOf"

    .line 434
    .line 435
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONObject;->getJSONArray(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-static {p1, v6}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/JSONArray;Ljava/lang/Class;)Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    iput-object p1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 444
    .line 445
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲:Z

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    instance-of v1, p1, Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    :try_start_0
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/alibaba/fastjson2/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONArray;

    .line 21
    .line 22
    .line 23
    move-result-object p1
    :try_end_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    goto :goto_0

    .line 25
    :catch_0
    :cond_1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏世哲兰:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_2
    :goto_0
    instance-of v1, p1, [Ljava/lang/Object;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    move-object v0, p1

    .line 33
    check-cast v0, [Ljava/lang/Object;

    .line 34
    .line 35
    array-length v1, v0

    .line 36
    new-instance v2, Lbsh/飘花落叶言子苏楪哲兰世;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {v2, v0, v3}, Lbsh/飘花落叶言子苏楪哲兰世;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, v1, v2}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;ILjava/util/function/IntFunction;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    new-instance v1, Lbsh/飘花落叶言子苏楪哲兰世;

    .line 62
    .line 63
    const/4 v2, 0x2

    .line 64
    invoke-direct {v1, p1, v2}, Lbsh/飘花落叶言子苏楪哲兰世;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;ILjava/util/function/IntFunction;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_4
    instance-of v1, p1, Ljava/util/Collection;

    .line 73
    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    move-object v0, p1

    .line 77
    check-cast v0, Ljava/util/Collection;

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    new-instance v2, Lbsh/飘花落叶言子苏楪哲兰世;

    .line 88
    .line 89
    const/4 v3, 0x3

    .line 90
    invoke-direct {v2, v1, v3}, Lbsh/飘花落叶言子苏楪哲兰世;-><init>(Ljava/lang/Object;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1, v0, v2}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;ILjava/util/function/IntFunction;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    :cond_5
    if-eqz v0, :cond_6

    .line 99
    .line 100
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪苏兰世哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_6
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 104
    .line 105
    return-object p0
.end method

.method public final 飘花落叶言子楪兰哲苏世(Ljava/lang/Object;ILjava/util/function/IntFunction;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget v4, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 9
    .line 10
    if-ltz v4, :cond_0

    .line 11
    .line 12
    if-ge v2, v4, :cond_0

    .line 13
    .line 14
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 15
    .line 16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "minLength not match, expect >= %s, but %s"

    .line 29
    .line 30
    invoke-direct {v0, v2, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    iget v4, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 35
    .line 36
    if-ltz v4, :cond_1

    .line 37
    .line 38
    if-le v2, v4, :cond_1

    .line 39
    .line 40
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 41
    .line 42
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "maxLength not match, expect <= %s, but %s"

    .line 55
    .line 56
    invoke-direct {v0, v2, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_1
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:Z

    .line 61
    .line 62
    iget-object v5, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 63
    .line 64
    if-nez v4, :cond_2

    .line 65
    .line 66
    array-length v4, v5

    .line 67
    if-le v2, v4, :cond_2

    .line 68
    .line 69
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 70
    .line 71
    array-length v1, v5

    .line 72
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "additional items not match, max size %s, but %s"

    .line 85
    .line 86
    invoke-direct {v0, v2, v1, v3}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_2
    instance-of v4, v1, Ljava/util/Collection;

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    move v7, v3

    .line 94
    move v8, v7

    .line 95
    :goto_0
    sget-object v9, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 96
    .line 97
    iget v10, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:I

    .line 98
    .line 99
    iget v11, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:I

    .line 100
    .line 101
    iget-object v12, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 102
    .line 103
    if-ge v7, v2, :cond_e

    .line 104
    .line 105
    move-object/from16 v13, p3

    .line 106
    .line 107
    invoke-interface {v13, v7}, Ljava/util/function/IntFunction;->apply(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v14

    .line 111
    array-length v15, v5

    .line 112
    if-ge v7, v15, :cond_4

    .line 113
    .line 114
    aget-object v15, v5, v7

    .line 115
    .line 116
    invoke-virtual {v15, v14}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    iget-boolean v3, v15, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 121
    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    return-object v15

    .line 125
    :cond_3
    move/from16 v16, v4

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    iget-object v3, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 129
    .line 130
    if-eqz v4, :cond_5

    .line 131
    .line 132
    if-nez v3, :cond_5

    .line 133
    .line 134
    iget-object v15, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 135
    .line 136
    if-eqz v15, :cond_5

    .line 137
    .line 138
    invoke-virtual {v15, v14}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 139
    .line 140
    .line 141
    move-result-object v15

    .line 142
    move/from16 v16, v4

    .line 143
    .line 144
    iget-boolean v4, v15, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 145
    .line 146
    if-nez v4, :cond_6

    .line 147
    .line 148
    return-object v15

    .line 149
    :cond_5
    move/from16 v16, v4

    .line 150
    .line 151
    :cond_6
    if-eqz v3, :cond_7

    .line 152
    .line 153
    invoke-virtual {v3, v14}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    iget-boolean v4, v3, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 158
    .line 159
    if-nez v4, :cond_7

    .line 160
    .line 161
    return-object v3

    .line 162
    :cond_7
    :goto_1
    if-eqz v12, :cond_9

    .line 163
    .line 164
    if-gtz v11, :cond_8

    .line 165
    .line 166
    if-gtz v10, :cond_8

    .line 167
    .line 168
    if-nez v8, :cond_9

    .line 169
    .line 170
    :cond_8
    invoke-virtual {v12, v14}, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    if-ne v3, v9, :cond_9

    .line 175
    .line 176
    add-int/lit8 v8, v8, 0x1

    .line 177
    .line 178
    :cond_9
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏:Z

    .line 179
    .line 180
    if-eqz v3, :cond_d

    .line 181
    .line 182
    if-nez v6, :cond_a

    .line 183
    .line 184
    new-instance v6, Ljava/util/HashSet;

    .line 185
    .line 186
    const/high16 v3, 0x3f800000    # 1.0f

    .line 187
    .line 188
    invoke-direct {v6, v2, v3}, Ljava/util/HashSet;-><init>(IF)V

    .line 189
    .line 190
    .line 191
    :cond_a
    instance-of v3, v14, Ljava/math/BigDecimal;

    .line 192
    .line 193
    if-eqz v3, :cond_c

    .line 194
    .line 195
    check-cast v14, Ljava/math/BigDecimal;

    .line 196
    .line 197
    invoke-virtual {v14}, Ljava/math/BigDecimal;->signum()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-nez v3, :cond_b

    .line 202
    .line 203
    new-instance v3, Ljava/math/BigDecimal;

    .line 204
    .line 205
    sget-object v4, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 206
    .line 207
    const/4 v9, 0x0

    .line 208
    invoke-direct {v3, v4, v9}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 209
    .line 210
    .line 211
    :goto_2
    move-object v14, v3

    .line 212
    goto :goto_3

    .line 213
    :cond_b
    invoke-virtual {v14}, Ljava/math/BigDecimal;->stripTrailingZeros()Ljava/math/BigDecimal;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    goto :goto_2

    .line 218
    :cond_c
    :goto_3
    invoke-interface {v6, v14}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-nez v3, :cond_d

    .line 223
    .line 224
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪哲世兰苏:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 225
    .line 226
    return-object v0

    .line 227
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 228
    .line 229
    move/from16 v4, v16

    .line 230
    .line 231
    const/4 v3, 0x0

    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_e
    move/from16 v16, v4

    .line 235
    .line 236
    if-eqz v16, :cond_f

    .line 237
    .line 238
    if-eqz v12, :cond_13

    .line 239
    .line 240
    :cond_f
    if-ltz v11, :cond_10

    .line 241
    .line 242
    if-ge v8, v11, :cond_10

    .line 243
    .line 244
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 245
    .line 246
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v1

    .line 258
    const-string v2, "minContains not match, expect %s, but %s"

    .line 259
    .line 260
    const/4 v9, 0x0

    .line 261
    invoke-direct {v0, v2, v1, v9}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_10
    if-eqz v16, :cond_11

    .line 266
    .line 267
    if-nez v8, :cond_12

    .line 268
    .line 269
    if-eqz v11, :cond_12

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_11
    if-eqz v12, :cond_12

    .line 273
    .line 274
    if-nez v8, :cond_12

    .line 275
    .line 276
    :goto_4
    sget-object v0, Lcom/alibaba/fastjson2/schema/JSONSchema;->飘花落叶言子楪哲世苏兰:Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 277
    .line 278
    return-object v0

    .line 279
    :cond_12
    if-ltz v10, :cond_13

    .line 280
    .line 281
    if-le v8, v10, :cond_13

    .line 282
    .line 283
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 284
    .line 285
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    const-string v2, "maxContains not match, expect %s, but %s"

    .line 298
    .line 299
    const/4 v9, 0x0

    .line 300
    invoke-direct {v0, v2, v1, v9}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/String;[Ljava/lang/Object;Z)V

    .line 301
    .line 302
    .line 303
    return-object v0

    .line 304
    :cond_13
    iget-object v2, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰苏哲:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

    .line 305
    .line 306
    if-eqz v2, :cond_14

    .line 307
    .line 308
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    iget-boolean v3, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 313
    .line 314
    if-nez v3, :cond_14

    .line 315
    .line 316
    return-object v2

    .line 317
    :cond_14
    iget-object v2, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 318
    .line 319
    if-eqz v2, :cond_15

    .line 320
    .line 321
    invoke-virtual {v2, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    iget-boolean v3, v2, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 326
    .line 327
    if-nez v3, :cond_15

    .line 328
    .line 329
    return-object v2

    .line 330
    :cond_15
    iget-object v0, v0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 331
    .line 332
    if-eqz v0, :cond_16

    .line 333
    .line 334
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    iget-boolean v1, v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 339
    .line 340
    if-nez v1, :cond_16

    .line 341
    .line 342
    return-object v0

    .line 343
    :cond_16
    return-object v9
.end method

.method public final 飘花落叶言子楪哲苏兰世()Lcom/alibaba/fastjson2/JSONObject;
    .locals 4

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
    const-string v2, "array"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    const-string v3, "maxLength"

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    iget v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:I

    .line 28
    .line 29
    if-eq v1, v2, :cond_1

    .line 30
    .line 31
    const-string v3, "minLength"

    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const-string v3, "items"

    .line 45
    .line 46
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:[Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    array-length v3, v1

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    const-string v3, "prefixItems"

    .line 57
    .line 58
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_3
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:Z

    .line 62
    .line 63
    if-nez v1, :cond_4

    .line 64
    .line 65
    const-string v3, "additionalItems"

    .line 66
    .line 67
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    :cond_4
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 75
    .line 76
    if-eqz v1, :cond_5

    .line 77
    .line 78
    const-string v3, "additionalItem"

    .line 79
    .line 80
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :cond_5
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏哲兰:Lcom/alibaba/fastjson2/schema/JSONSchema;

    .line 84
    .line 85
    if-eqz v1, :cond_6

    .line 86
    .line 87
    const-string v3, "contains"

    .line 88
    .line 89
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    :cond_6
    iget v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:I

    .line 93
    .line 94
    if-eq v1, v2, :cond_7

    .line 95
    .line 96
    const-string v3, "minContains"

    .line 97
    .line 98
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v3, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :cond_7
    iget v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲苏兰:I

    .line 106
    .line 107
    if-eq v1, v2, :cond_8

    .line 108
    .line 109
    const-string v2, "maxContains"

    .line 110
    .line 111
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    :cond_8
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪哲兰苏:Z

    .line 119
    .line 120
    if-eqz v1, :cond_9

    .line 121
    .line 122
    const-string v2, "uniqueItems"

    .line 123
    .line 124
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    :cond_9
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰苏哲:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世苏兰哲;

    .line 132
    .line 133
    if-eqz v1, :cond_a

    .line 134
    .line 135
    const-string v2, "allOf"

    .line 136
    .line 137
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    :cond_a
    iget-object v1, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世哲兰苏;

    .line 141
    .line 142
    if-eqz v1, :cond_b

    .line 143
    .line 144
    const-string v2, "anyOf"

    .line 145
    .line 146
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    :cond_b
    iget-object p0, p0, Lcom/alibaba/fastjson2/schema/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰:Lcom/alibaba/fastjson2/schema/飘花落叶言子楪哲世兰苏;

    .line 150
    .line 151
    if-eqz p0, :cond_c

    .line 152
    .line 153
    const-string v1, "oneOf"

    .line 154
    .line 155
    invoke-virtual {v0, v1, p0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    :cond_c
    return-object v0
.end method

.method public final 飘花落叶言子楪苏哲兰世()Lcom/alibaba/fastjson2/schema/JSONSchema$Type;
    .locals 0

    .line 1
    sget-object p0, Lcom/alibaba/fastjson2/schema/JSONSchema$Type;->Array:Lcom/alibaba/fastjson2/schema/JSONSchema$Type;

    .line 2
    .line 3
    return-object p0
.end method
