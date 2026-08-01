.class public final synthetic Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/annotation/Annotation;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/core/view/飘花落叶言子楪世兰哲苏;Ljava/lang/annotation/Annotation;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-string v1, "builder"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/annotation/Annotation;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:Landroidx/core/view/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :try_start_0
    invoke-virtual {p1, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    const-class v4, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏楪兰哲世;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    sparse-switch v2, :sswitch_data_0

    .line 33
    .line 34
    .line 35
    goto/16 :goto_6

    .line 36
    .line 37
    :sswitch_0
    :try_start_1
    const-string v1, "seeAlso"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_5

    .line 44
    .line 45
    check-cast p1, [Ljava/lang/Class;

    .line 46
    .line 47
    array-length v0, p1

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Class;

    .line 51
    .line 52
    array-length v0, p1

    .line 53
    new-array v0, v0, [Ljava/lang/String;

    .line 54
    .line 55
    iput-object v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 56
    .line 57
    :goto_0
    array-length v0, p1

    .line 58
    if-ge v5, v0, :cond_2

    .line 59
    .line 60
    aget-object v0, p1, v5

    .line 61
    .line 62
    new-instance v1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v1, v2}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;-><init>(Lcom/alibaba/fastjson2/reader/飘花落叶言楪子苏哲兰世;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0, v1}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏楪哲(Ljava/lang/Class;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v1, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 75
    .line 76
    if-eqz v1, :cond_0

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    :cond_1
    iget-object v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 89
    .line 90
    aput-object v1, v0, v5

    .line 91
    .line 92
    add-int/lit8 v5, v5, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    iget-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 96
    .line 97
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 98
    .line 99
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 100
    .line 101
    or-long/2addr p0, v0

    .line 102
    iput-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 103
    .line 104
    goto/16 :goto_6

    .line 105
    .line 106
    :sswitch_1
    const-string p0, "ignores"

    .line 107
    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    if-eqz p0, :cond_5

    .line 113
    .line 114
    check-cast p1, [Ljava/lang/String;

    .line 115
    .line 116
    array-length p0, p1

    .line 117
    if-lez p0, :cond_5

    .line 118
    .line 119
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/String;

    .line 120
    .line 121
    goto/16 :goto_6

    .line 122
    .line 123
    :sswitch_2
    const-string p0, "autoTypeCheckHandler"

    .line 124
    .line 125
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    if-eqz p0, :cond_5

    .line 130
    .line 131
    goto/16 :goto_2

    .line 132
    .line 133
    :sswitch_3
    const-string p0, "disableArrayMapping"

    .line 134
    .line 135
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_5

    .line 140
    .line 141
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 142
    .line 143
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    if-eqz p0, :cond_5

    .line 148
    .line 149
    iget-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 150
    .line 151
    const-wide/high16 v0, 0x400000000000000L

    .line 152
    .line 153
    or-long/2addr p0, v0

    .line 154
    iput-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 155
    .line 156
    goto/16 :goto_6

    .line 157
    .line 158
    :sswitch_4
    const-string p0, "deserializeFeatures"

    .line 159
    .line 160
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    if-eqz p0, :cond_5

    .line 165
    .line 166
    check-cast p1, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 167
    .line 168
    array-length p0, p1

    .line 169
    :goto_1
    if-ge v5, p0, :cond_5

    .line 170
    .line 171
    aget-object v0, p1, v5

    .line 172
    .line 173
    iget-wide v1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 174
    .line 175
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 176
    .line 177
    or-long v0, v1, v6

    .line 178
    .line 179
    iput-wide v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 180
    .line 181
    add-int/lit8 v5, v5, 0x1

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :sswitch_5
    const-string p0, "deserializeUsing"

    .line 185
    .line 186
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result p0

    .line 190
    if-eqz p0, :cond_5

    .line 191
    .line 192
    check-cast p1, Ljava/lang/Class;

    .line 193
    .line 194
    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-eqz p0, :cond_5

    .line 199
    .line 200
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 201
    .line 202
    goto/16 :goto_6

    .line 203
    .line 204
    :sswitch_6
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_5

    .line 209
    .line 210
    check-cast p1, Ljava/lang/Class;

    .line 211
    .line 212
    invoke-virtual {p0, p1, v3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪哲苏(Ljava/lang/Class;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;)V

    .line 213
    .line 214
    .line 215
    goto/16 :goto_6

    .line 216
    .line 217
    :sswitch_7
    const-string p0, "rootName"

    .line 218
    .line 219
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-eqz p0, :cond_5

    .line 224
    .line 225
    check-cast p1, Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-nez p0, :cond_5

    .line 232
    .line 233
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/String;

    .line 234
    .line 235
    goto/16 :goto_6

    .line 236
    .line 237
    :sswitch_8
    const-string p0, "autoTypeBeforeHandler"

    .line 238
    .line 239
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    if-eqz p0, :cond_5

    .line 244
    .line 245
    :goto_2
    check-cast p1, Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 246
    .line 247
    const-class p0, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世哲楪;

    .line 248
    .line 249
    if-eq p1, p0, :cond_5

    .line 250
    .line 251
    :try_start_2
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    if-eqz p0, :cond_5

    .line 256
    .line 257
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲兰苏:Ljava/lang/Class;

    .line 258
    .line 259
    goto/16 :goto_6

    .line 260
    .line 261
    :sswitch_9
    const-string p0, "seeAlsoDefault"

    .line 262
    .line 263
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result p0

    .line 267
    if-eqz p0, :cond_5

    .line 268
    .line 269
    move-object p0, p1

    .line 270
    check-cast p0, Ljava/lang/Class;

    .line 271
    .line 272
    const-class v0, Ljava/lang/Void;

    .line 273
    .line 274
    if-eq p0, v0, :cond_3

    .line 275
    .line 276
    iput-object p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/Class;

    .line 277
    .line 278
    goto :goto_3

    .line 279
    :sswitch_a
    const-string p0, "typeName"

    .line 280
    .line 281
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result p0

    .line 285
    if-eqz p0, :cond_5

    .line 286
    .line 287
    check-cast p1, Ljava/lang/String;

    .line 288
    .line 289
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 290
    .line 291
    .line 292
    move-result p0

    .line 293
    if-nez p0, :cond_5

    .line 294
    .line 295
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 296
    .line 297
    goto/16 :goto_6

    .line 298
    .line 299
    :sswitch_b
    const-string p0, "disableReferenceDetect"

    .line 300
    .line 301
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result p0

    .line 305
    if-eqz p0, :cond_5

    .line 306
    .line 307
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 308
    .line 309
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result p0

    .line 313
    if-eqz p0, :cond_5

    .line 314
    .line 315
    iget-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 316
    .line 317
    const-wide/high16 v0, 0x200000000000000L

    .line 318
    .line 319
    or-long/2addr p0, v0

    .line 320
    iput-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 321
    .line 322
    goto/16 :goto_6

    .line 323
    .line 324
    :sswitch_c
    const-string p0, "typeKey"

    .line 325
    .line 326
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    if-eqz p0, :cond_5

    .line 331
    .line 332
    :cond_3
    :goto_3
    check-cast p1, Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 335
    .line 336
    .line 337
    move-result p0

    .line 338
    if-nez p0, :cond_5

    .line 339
    .line 340
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 341
    .line 342
    goto/16 :goto_6

    .line 343
    .line 344
    :sswitch_d
    const-string p0, "schema"

    .line 345
    .line 346
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    move-result p0

    .line 350
    if-eqz p0, :cond_5

    .line 351
    .line 352
    check-cast p1, Ljava/lang/String;

    .line 353
    .line 354
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    if-nez p1, :cond_5

    .line 363
    .line 364
    iput-object p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰哲苏世:Ljava/lang/String;

    .line 365
    .line 366
    goto/16 :goto_6

    .line 367
    .line 368
    :sswitch_e
    const-string p0, "disableJSONB"

    .line 369
    .line 370
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move-result p0

    .line 374
    if-eqz p0, :cond_5

    .line 375
    .line 376
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 377
    .line 378
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result p0

    .line 382
    if-eqz p0, :cond_5

    .line 383
    .line 384
    iget-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 385
    .line 386
    const-wide/high16 v0, 0x1000000000000000L

    .line 387
    .line 388
    or-long/2addr p0, v0

    .line 389
    iput-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 390
    .line 391
    goto/16 :goto_6

    .line 392
    .line 393
    :sswitch_f
    const-string p0, "orders"

    .line 394
    .line 395
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result p0

    .line 399
    if-eqz p0, :cond_5

    .line 400
    .line 401
    check-cast p1, [Ljava/lang/String;

    .line 402
    .line 403
    array-length p0, p1

    .line 404
    if-eqz p0, :cond_5

    .line 405
    .line 406
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:[Ljava/lang/String;

    .line 407
    .line 408
    goto/16 :goto_6

    .line 409
    .line 410
    :sswitch_10
    const-string p0, "naming"

    .line 411
    .line 412
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result p0

    .line 416
    if-eqz p0, :cond_5

    .line 417
    .line 418
    check-cast p1, Ljava/lang/Enum;

    .line 419
    .line 420
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    iput-object p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/String;

    .line 425
    .line 426
    goto/16 :goto_6

    .line 427
    .line 428
    :sswitch_11
    const-string p0, "parseFeatures"

    .line 429
    .line 430
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    move-result p0

    .line 434
    if-eqz p0, :cond_5

    .line 435
    .line 436
    check-cast p1, [Ljava/lang/Enum;

    .line 437
    .line 438
    array-length p0, p1

    .line 439
    :goto_4
    if-ge v5, p0, :cond_5

    .line 440
    .line 441
    aget-object v0, p1, v5

    .line 442
    .line 443
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 448
    .line 449
    .line 450
    move-result v1

    .line 451
    sparse-switch v1, :sswitch_data_1

    .line 452
    .line 453
    .line 454
    goto :goto_5

    .line 455
    :sswitch_12
    const-string v1, "InitStringFieldAsEmpty"

    .line 456
    .line 457
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v0

    .line 461
    if-eqz v0, :cond_4

    .line 462
    .line 463
    iget-wide v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 464
    .line 465
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 466
    .line 467
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 468
    .line 469
    or-long/2addr v0, v6

    .line 470
    iput-wide v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 471
    .line 472
    goto :goto_5

    .line 473
    :sswitch_13
    const-string v1, "SupportAutoType"

    .line 474
    .line 475
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_4

    .line 480
    .line 481
    iget-wide v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 482
    .line 483
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 484
    .line 485
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 486
    .line 487
    or-long/2addr v0, v6

    .line 488
    iput-wide v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 489
    .line 490
    goto :goto_5

    .line 491
    :sswitch_14
    const-string v1, "SupportArrayToBean"

    .line 492
    .line 493
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-eqz v0, :cond_4

    .line 498
    .line 499
    iget-wide v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 500
    .line 501
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 502
    .line 503
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 504
    .line 505
    or-long/2addr v0, v6

    .line 506
    iput-wide v0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 507
    .line 508
    goto :goto_5

    .line 509
    :sswitch_15
    const-string v1, "TrimStringFieldValue"

    .line 510
    .line 511
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    :cond_4
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 516
    .line 517
    goto :goto_4

    .line 518
    :sswitch_16
    const-string p0, "disableAutoType"

    .line 519
    .line 520
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result p0

    .line 524
    if-eqz p0, :cond_5

    .line 525
    .line 526
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 527
    .line 528
    invoke-virtual {p0, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result p0

    .line 532
    if-eqz p0, :cond_5

    .line 533
    .line 534
    iget-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 535
    .line 536
    const-wide/high16 v0, 0x800000000000000L

    .line 537
    .line 538
    or-long/2addr p0, v0

    .line 539
    iput-wide p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 540
    .line 541
    goto :goto_6

    .line 542
    :sswitch_17
    const-string p0, "deserializer"

    .line 543
    .line 544
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result p0

    .line 548
    if-eqz p0, :cond_5

    .line 549
    .line 550
    check-cast p1, Ljava/lang/Class;

    .line 551
    .line 552
    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 553
    .line 554
    .line 555
    move-result p0

    .line 556
    if-eqz p0, :cond_5

    .line 557
    .line 558
    iput-object p1, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 559
    .line 560
    :catchall_0
    :cond_5
    :goto_6
    return-void

    .line 561
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    :try_start_3
    invoke-virtual {p1, v4, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    const-string v2, "using"

    .line 570
    .line 571
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v2

    .line 575
    if-nez v2, :cond_7

    .line 576
    .line 577
    const-string v2, "contentUsing"

    .line 578
    .line 579
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v2

    .line 583
    if-eqz v2, :cond_6

    .line 584
    .line 585
    goto :goto_7

    .line 586
    :cond_6
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    if-eqz v0, :cond_8

    .line 591
    .line 592
    check-cast p1, Ljava/lang/Class;

    .line 593
    .line 594
    invoke-virtual {p0, p1, v3}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰楪哲苏(Ljava/lang/Class;L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;)V

    .line 595
    .line 596
    .line 597
    goto :goto_8

    .line 598
    :cond_7
    :goto_7
    check-cast p1, Ljava/lang/Class;

    .line 599
    .line 600
    invoke-static {p1}, Landroidx/core/view/飘花落叶言子楪世兰哲苏;->飘花落叶言子世兰苏哲楪(Ljava/lang/Class;)Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    move-result-object p0

    .line 604
    if-eqz p0, :cond_8

    .line 605
    .line 606
    iput-object p0, v3, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 607
    .line 608
    :catchall_1
    :cond_8
    :goto_8
    return-void

    .line 609
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    :sswitch_data_0
    .sparse-switch
        -0x64056b2d -> :sswitch_17
        -0x4c036f6f -> :sswitch_16
        -0x4000fff0 -> :sswitch_11
        -0x3ec0df78 -> :sswitch_10
        -0x3c209d1b -> :sswitch_f
        -0x3bfad98e -> :sswitch_e
        -0x361eca5f -> :sswitch_d
        -0x32d96b3b -> :sswitch_c
        -0x28b02a3a -> :sswitch_b
        -0x2852af1b -> :sswitch_a
        -0x24dcc1d9 -> :sswitch_9
        -0x19c7a83e -> :sswitch_8
        -0x9f4d173 -> :sswitch_7
        0xdc3ef9b -> :sswitch_6
        0x3ecb2845 -> :sswitch_5
        0x539034dc -> :sswitch_4
        0x5b60f33d -> :sswitch_3
        0x65b7914b -> :sswitch_2
        0x6873bce1 -> :sswitch_1
        0x75748aba -> :sswitch_0
    .end sparse-switch

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    :sswitch_data_1
    .sparse-switch
        -0x5f9ef016 -> :sswitch_15
        -0x35496aab -> :sswitch_14
        -0xbf831a8 -> :sswitch_13
        0x778dede2 -> :sswitch_12
    .end sparse-switch
.end method
