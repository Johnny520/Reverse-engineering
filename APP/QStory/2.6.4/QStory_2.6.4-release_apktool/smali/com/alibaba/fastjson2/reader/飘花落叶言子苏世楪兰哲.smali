.class public final synthetic Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;I)V
    .locals 0

    .line 13
    iput p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世兰苏哲;Ljava/lang/annotation/Annotation;L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    const/16 p1, 0xb

    .line 2
    .line 3
    iput p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;Ljava/lang/annotation/Annotation;I)V
    .locals 0

    .line 14
    iput p3, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;

    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "property"

    .line 5
    .line 6
    const-string v3, "parameterNames"

    .line 7
    .line 8
    const-string v4, "value"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/alibaba/fastjson2/reader/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/annotation/Annotation;

    .line 14
    .line 15
    check-cast p1, Ljava/lang/reflect/Method;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :try_start_0
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    check-cast p0, Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_0

    .line 41
    .line 42
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 43
    .line 44
    iget-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:J

    .line 45
    .line 46
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteClassName:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 47
    .line 48
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 49
    .line 50
    or-long/2addr p0, v0

    .line 51
    iput-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    :catchall_0
    :cond_0
    return-void

    .line 54
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :try_start_1
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_1

    .line 67
    .line 68
    check-cast p0, [Ljava/lang/annotation/Annotation;

    .line 69
    .line 70
    array-length p1, p0

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    array-length p1, p0

    .line 74
    new-array p1, p1, [Ljava/lang/Class;

    .line 75
    .line 76
    iput-object p1, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Class;

    .line 77
    .line 78
    array-length p1, p0

    .line 79
    new-array p1, p1, [Ljava/lang/String;

    .line 80
    .line 81
    iput-object p1, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 82
    .line 83
    :goto_0
    array-length p1, p0

    .line 84
    if-ge v1, p1, :cond_1

    .line 85
    .line 86
    aget-object p1, p0, v1

    .line 87
    .line 88
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/reflect/Type;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;

    .line 95
    .line 96
    invoke-direct {v2, p1, v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;I)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/util/function/Consumer;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    .line 102
    add-int/lit8 v1, v1, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_1
    :cond_1
    return-void

    .line 106
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :try_start_2
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_2

    .line 119
    .line 120
    check-cast p0, [Ljava/lang/String;

    .line 121
    .line 122
    array-length p1, p0

    .line 123
    if-eqz p1, :cond_2

    .line 124
    .line 125
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:[Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 126
    .line 127
    :catchall_2
    :cond_2
    return-void

    .line 128
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    :try_start_3
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    const v1, 0x6a69c84

    .line 141
    .line 142
    .line 143
    if-eq p1, v1, :cond_4

    .line 144
    .line 145
    const v1, 0x1d513165

    .line 146
    .line 147
    .line 148
    if-eq p1, v1, :cond_3

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    const-string p1, "keyUsing"

    .line 152
    .line 153
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_5

    .line 158
    .line 159
    check-cast p0, Ljava/lang/Class;

    .line 160
    .line 161
    invoke-static {p0}, L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    if-eqz p0, :cond_5

    .line 166
    .line 167
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Class;

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_4
    const-string p1, "using"

    .line 171
    .line 172
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_5

    .line 177
    .line 178
    check-cast p0, Ljava/lang/Class;

    .line 179
    .line 180
    invoke-static {p0}, L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏(Ljava/lang/Class;)Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    if-eqz p0, :cond_5

    .line 185
    .line 186
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰苏世哲:Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 187
    .line 188
    :catchall_3
    :cond_5
    :goto_1
    return-void

    .line 189
    :pswitch_3
    invoke-static {v6, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏兰楪(L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_4
    invoke-static {v6, p0, p1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏兰楪(L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    :try_start_4
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    const v1, -0x4169f1a6

    .line 210
    .line 211
    .line 212
    if-eq p1, v1, :cond_9

    .line 213
    .line 214
    const v1, -0x2f271470

    .line 215
    .line 216
    .line 217
    if-eq p1, v1, :cond_8

    .line 218
    .line 219
    const v1, 0x6854fa1

    .line 220
    .line 221
    .line 222
    if-eq p1, v1, :cond_6

    .line 223
    .line 224
    goto :goto_2

    .line 225
    :cond_6
    const-string p1, "shape"

    .line 226
    .line 227
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    if-eqz p1, :cond_a

    .line 232
    .line 233
    check-cast p0, Ljava/lang/Enum;

    .line 234
    .line 235
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    const-string p1, "NUMBER"

    .line 240
    .line 241
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result p1

    .line 245
    if-eqz p1, :cond_7

    .line 246
    .line 247
    const-string p0, "millis"

    .line 248
    .line 249
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/String;

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_7
    const-string p1, "OBJECT"

    .line 253
    .line 254
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    if-eqz p0, :cond_a

    .line 259
    .line 260
    const/4 p0, 0x1

    .line 261
    iput-boolean p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏世兰:Z

    .line 262
    .line 263
    goto :goto_2

    .line 264
    :cond_8
    const-string p1, "pattern"

    .line 265
    .line 266
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p1

    .line 270
    if-eqz p1, :cond_a

    .line 271
    .line 272
    check-cast p0, Ljava/lang/String;

    .line 273
    .line 274
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-nez p1, :cond_a

    .line 279
    .line 280
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰:Ljava/lang/String;

    .line 281
    .line 282
    goto :goto_2

    .line 283
    :cond_9
    const-string p1, "locale"

    .line 284
    .line 285
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    if-eqz p1, :cond_a

    .line 290
    .line 291
    check-cast p0, Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 294
    .line 295
    .line 296
    move-result p1

    .line 297
    if-nez p1, :cond_a

    .line 298
    .line 299
    const-string p1, "##default"

    .line 300
    .line 301
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result p1

    .line 305
    if-nez p1, :cond_a

    .line 306
    .line 307
    invoke-static {p0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏兰哲:Ljava/util/Locale;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 312
    .line 313
    :catchall_4
    :cond_a
    :goto_2
    return-void

    .line 314
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    :try_start_5
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result p1

    .line 326
    if-eqz p1, :cond_b

    .line 327
    .line 328
    check-cast p0, Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    if-nez p1, :cond_b

    .line 335
    .line 336
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 337
    .line 338
    :catchall_5
    :cond_b
    return-void

    .line 339
    :pswitch_7
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    :try_start_6
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result p1

    .line 351
    if-eqz p1, :cond_f

    .line 352
    .line 353
    check-cast p0, Ljava/lang/Enum;

    .line 354
    .line 355
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 360
    .line 361
    .line 362
    move-result p1

    .line 363
    const v0, -0x7656e5

    .line 364
    .line 365
    .line 366
    if-eq p1, v0, :cond_e

    .line 367
    .line 368
    const v0, 0xa13a8f

    .line 369
    .line 370
    .line 371
    if-eq p1, v0, :cond_d

    .line 372
    .line 373
    const v0, 0x7342860f

    .line 374
    .line 375
    .line 376
    if-eq p1, v0, :cond_c

    .line 377
    .line 378
    goto :goto_3

    .line 379
    :cond_c
    const-string p1, "ALWAYS"

    .line 380
    .line 381
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result p0

    .line 385
    if-eqz p0, :cond_f

    .line 386
    .line 387
    iget-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:J

    .line 388
    .line 389
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 390
    .line 391
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 392
    .line 393
    or-long/2addr p0, v0

    .line 394
    iput-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:J

    .line 395
    .line 396
    goto :goto_3

    .line 397
    :cond_d
    const-string p1, "NON_DEFAULT"

    .line 398
    .line 399
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result p0

    .line 403
    if-eqz p0, :cond_f

    .line 404
    .line 405
    iget-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:J

    .line 406
    .line 407
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 408
    .line 409
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 410
    .line 411
    or-long/2addr p0, v0

    .line 412
    iput-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:J

    .line 413
    .line 414
    goto :goto_3

    .line 415
    :cond_e
    const-string p1, "NON_EMPTY"

    .line 416
    .line 417
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result p0

    .line 421
    if-eqz p0, :cond_f

    .line 422
    .line 423
    iget-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:J

    .line 424
    .line 425
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteEmptyArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 426
    .line 427
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 428
    .line 429
    or-long/2addr p0, v0

    .line 430
    iput-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世兰苏:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 431
    .line 432
    :catchall_6
    :cond_f
    :goto_3
    return-void

    .line 433
    :pswitch_8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    :try_start_7
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result p1

    .line 445
    if-eqz p1, :cond_10

    .line 446
    .line 447
    check-cast p0, Ljava/lang/String;

    .line 448
    .line 449
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 450
    .line 451
    .line 452
    move-result p1

    .line 453
    if-nez p1, :cond_10

    .line 454
    .line 455
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 456
    .line 457
    iget-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J

    .line 458
    .line 459
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 460
    .line 461
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 462
    .line 463
    or-long/2addr p0, v0

    .line 464
    iput-wide p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 465
    .line 466
    :catchall_7
    :cond_10
    return-void

    .line 467
    :pswitch_9
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    :try_start_8
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    const-string p1, "typeName"

    .line 476
    .line 477
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 478
    .line 479
    .line 480
    move-result p1

    .line 481
    if-eqz p1, :cond_11

    .line 482
    .line 483
    check-cast p0, Ljava/lang/String;

    .line 484
    .line 485
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 486
    .line 487
    .line 488
    move-result p1

    .line 489
    if-nez p1, :cond_11

    .line 490
    .line 491
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 492
    .line 493
    :catchall_8
    :cond_11
    return-void

    .line 494
    :pswitch_a
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    :try_start_9
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result p1

    .line 506
    if-eqz p1, :cond_12

    .line 507
    .line 508
    check-cast p0, [Ljava/lang/Object;

    .line 509
    .line 510
    array-length p1, p0

    .line 511
    if-eqz p1, :cond_12

    .line 512
    .line 513
    array-length p1, p0

    .line 514
    new-array p1, p1, [Ljava/lang/Class;

    .line 515
    .line 516
    iput-object p1, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:[Ljava/lang/Class;

    .line 517
    .line 518
    array-length p1, p0

    .line 519
    new-array p1, p1, [Ljava/lang/String;

    .line 520
    .line 521
    iput-object p1, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰:[Ljava/lang/String;

    .line 522
    .line 523
    :goto_4
    array-length p1, p0

    .line 524
    if-ge v1, p1, :cond_12

    .line 525
    .line 526
    aget-object p1, p0, v1

    .line 527
    .line 528
    check-cast p1, Ljava/lang/annotation/Annotation;

    .line 529
    .line 530
    sget-object v0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:[Ljava/lang/reflect/Type;

    .line 531
    .line 532
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    new-instance v2, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;

    .line 537
    .line 538
    invoke-direct {v2, p1, v6, v1}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪世兰苏哲;-><init>(Ljava/lang/annotation/Annotation;L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;I)V

    .line 539
    .line 540
    .line 541
    invoke-static {v0, v2}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/util/function/Consumer;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 542
    .line 543
    .line 544
    add-int/lit8 v1, v1, 0x1

    .line 545
    .line 546
    goto :goto_4

    .line 547
    :catchall_9
    :cond_12
    return-void

    .line 548
    :pswitch_b
    :try_start_a
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v0

    .line 556
    if-eqz v0, :cond_13

    .line 557
    .line 558
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    check-cast p0, [Ljava/lang/String;

    .line 563
    .line 564
    array-length p1, p0

    .line 565
    if-eqz p1, :cond_13

    .line 566
    .line 567
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 568
    .line 569
    :catchall_a
    :cond_13
    return-void

    .line 570
    :pswitch_c
    :try_start_b
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    move-result v0

    .line 578
    if-eqz v0, :cond_14

    .line 579
    .line 580
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object p0

    .line 584
    check-cast p0, [Ljava/lang/String;

    .line 585
    .line 586
    array-length p1, p0

    .line 587
    if-eqz p1, :cond_14

    .line 588
    .line 589
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 590
    .line 591
    :catchall_b
    :cond_14
    return-void

    .line 592
    :pswitch_d
    :try_start_c
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-eqz v0, :cond_15

    .line 601
    .line 602
    invoke-virtual {p1, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object p0

    .line 606
    check-cast p0, [Ljava/lang/String;

    .line 607
    .line 608
    array-length p1, p0

    .line 609
    if-eqz p1, :cond_15

    .line 610
    .line 611
    iput-object p0, v6, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏兰哲世:[Ljava/lang/String;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 612
    .line 613
    :catchall_c
    :cond_15
    return-void

    .line 614
    nop

    .line 615
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
