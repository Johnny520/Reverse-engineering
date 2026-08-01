.class public final Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏哲兰;
.super Lcom/alibaba/fastjson2/reader/飘花落叶言子哲苏楪世兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子哲兰苏世楪()Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const-wide/16 p3, 0x3e8

    .line 6
    .line 7
    iget-boolean p5, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲苏子兰()J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    if-eqz p5, :cond_0

    .line 16
    .line 17
    mul-long/2addr p0, p3

    .line 18
    :cond_0
    new-instance p2, Ljava/sql/Time;

    .line 19
    .line 20
    invoke-direct {p2, p0, p1}, Ljava/sql/Time;-><init>(J)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世苏哲子兰()Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/4 v0, 0x0

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :cond_2
    iget-boolean p2, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 34
    .line 35
    if-nez p2, :cond_10

    .line 36
    .line 37
    iget-boolean p2, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 38
    .line 39
    if-eqz p2, :cond_3

    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_3
    if-eqz p5, :cond_4

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪世哲子兰苏()Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide p0

    .line 53
    new-instance p2, Ljava/sql/Time;

    .line 54
    .line 55
    mul-long/2addr p0, p3

    .line 56
    invoke-direct {p2, p0, p1}, Ljava/sql/Time;-><init>(J)V

    .line 57
    .line 58
    .line 59
    return-object p2

    .line 60
    :cond_4
    iget-object p2, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 61
    .line 62
    const/4 p3, 0x1

    .line 63
    if-eqz p2, :cond_9

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子苏楪兰哲世()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰哲苏()Ljava/time/format/DateTimeFormatter;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-eqz p2, :cond_8

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    invoke-virtual {p4}, Ljava/lang/String;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result p5

    .line 82
    if-eqz p5, :cond_5

    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :cond_5
    iget-boolean p5, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Z

    .line 87
    .line 88
    if-nez p5, :cond_6

    .line 89
    .line 90
    invoke-static {p4, p2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    sget-object p2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 95
    .line 96
    invoke-static {p0, p2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    goto :goto_0

    .line 101
    :cond_6
    iget-boolean p0, p0, L飘花落叶言楪子苏哲兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Z

    .line 102
    .line 103
    if-nez p0, :cond_7

    .line 104
    .line 105
    const/16 p0, 0x7b2

    .line 106
    .line 107
    invoke-static {p0, p3, p3}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p4, p2}, Ljava/time/LocalTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalTime;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-static {p0, p2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    goto :goto_0

    .line 120
    :cond_7
    invoke-static {p4, p2}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :goto_0
    iget-object p1, p1, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;

    .line 125
    .line 126
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世兰苏哲()Ljava/time/ZoneId;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    goto :goto_1

    .line 135
    :cond_8
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲苏世子兰()Ljava/time/ZonedDateTime;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_1
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 144
    .line 145
    .line 146
    move-result-wide p0

    .line 147
    goto/16 :goto_4

    .line 148
    .line 149
    :cond_9
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪哲世苏子兰()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    const-string p1, "0000-00-00"

    .line 154
    .line 155
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    if-nez p1, :cond_f

    .line 160
    .line 161
    const-string p1, "0000-00-00 00:00:00"

    .line 162
    .line 163
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-eqz p1, :cond_a

    .line 168
    .line 169
    goto/16 :goto_3

    .line 170
    .line 171
    :cond_a
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    const/16 p2, 0x9

    .line 176
    .line 177
    if-ne p1, p2, :cond_c

    .line 178
    .line 179
    const/16 p1, 0x8

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    const/16 p2, 0x5a

    .line 186
    .line 187
    if-ne p1, p2, :cond_c

    .line 188
    .line 189
    const/4 p1, 0x0

    .line 190
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    const/4 p3, 0x2

    .line 199
    invoke-virtual {p0, p3}, Ljava/lang/String;->charAt(I)C

    .line 200
    .line 201
    .line 202
    move-result p3

    .line 203
    const/4 p4, 0x3

    .line 204
    invoke-virtual {p0, p4}, Ljava/lang/String;->charAt(I)C

    .line 205
    .line 206
    .line 207
    move-result p4

    .line 208
    const/4 p5, 0x4

    .line 209
    invoke-virtual {p0, p5}, Ljava/lang/String;->charAt(I)C

    .line 210
    .line 211
    .line 212
    move-result p5

    .line 213
    const/4 v1, 0x5

    .line 214
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    const/4 v2, 0x6

    .line 219
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    const/4 v3, 0x7

    .line 224
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 229
    .line 230
    const/16 v3, 0x3a

    .line 231
    .line 232
    if-ne p3, v3, :cond_b

    .line 233
    .line 234
    if-ne v1, v3, :cond_b

    .line 235
    .line 236
    const/16 p3, 0x30

    .line 237
    .line 238
    if-lt p1, p3, :cond_b

    .line 239
    .line 240
    const/16 v1, 0x39

    .line 241
    .line 242
    if-gt p1, v1, :cond_b

    .line 243
    .line 244
    if-lt p2, p3, :cond_b

    .line 245
    .line 246
    if-gt p2, v1, :cond_b

    .line 247
    .line 248
    sub-int/2addr p1, p3

    .line 249
    mul-int/lit8 p1, p1, 0xa

    .line 250
    .line 251
    sub-int/2addr p2, p3

    .line 252
    add-int/2addr p2, p1

    .line 253
    if-lt p4, p3, :cond_b

    .line 254
    .line 255
    if-gt p4, v1, :cond_b

    .line 256
    .line 257
    if-lt p5, p3, :cond_b

    .line 258
    .line 259
    if-gt p5, v1, :cond_b

    .line 260
    .line 261
    sub-int/2addr p4, p3

    .line 262
    mul-int/lit8 p4, p4, 0xa

    .line 263
    .line 264
    sub-int/2addr p5, p3

    .line 265
    add-int/2addr p5, p4

    .line 266
    if-lt v2, p3, :cond_b

    .line 267
    .line 268
    if-gt v2, v1, :cond_b

    .line 269
    .line 270
    if-lt p0, p3, :cond_b

    .line 271
    .line 272
    if-gt p0, v1, :cond_b

    .line 273
    .line 274
    sub-int/2addr v2, p3

    .line 275
    mul-int/lit8 v2, v2, 0xa

    .line 276
    .line 277
    sub-int/2addr p0, p3

    .line 278
    add-int/2addr p0, v2

    .line 279
    invoke-static {p2, p5, p0}, Ljava/time/LocalTime;->of(III)Ljava/time/LocalTime;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    :cond_b
    sget-object p0, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Ljava/time/LocalDate;

    .line 284
    .line 285
    invoke-static {p0, v0}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    sget-object p1, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/time/ZoneId;

    .line 290
    .line 291
    invoke-virtual {p0, p1}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-interface {p0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-virtual {p0}, Ljava/time/Instant;->toEpochMilli()J

    .line 300
    .line 301
    .line 302
    move-result-wide p0

    .line 303
    goto :goto_4

    .line 304
    :cond_c
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    if-nez p1, :cond_e

    .line 309
    .line 310
    const-string p1, "null"

    .line 311
    .line 312
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result p1

    .line 316
    if-eqz p1, :cond_d

    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_d
    invoke-static {p0}, Ljava/sql/Time;->valueOf(Ljava/lang/String;)Ljava/sql/Time;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    return-object p0

    .line 324
    :cond_e
    :goto_2
    return-object v0

    .line 325
    :cond_f
    :goto_3
    const-wide/16 p0, 0x0

    .line 326
    .line 327
    :goto_4
    new-instance p2, Ljava/sql/Time;

    .line 328
    .line 329
    invoke-direct {p2, p0, p1}, Ljava/sql/Time;-><init>(J)V

    .line 330
    .line 331
    .line 332
    return-object p2

    .line 333
    :cond_10
    :goto_5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;->飘花落叶言楪苏兰子哲世()J

    .line 334
    .line 335
    .line 336
    move-result-wide p0

    .line 337
    new-instance p2, Ljava/sql/Time;

    .line 338
    .line 339
    invoke-direct {p2, p0, p1}, Ljava/sql/Time;-><init>(J)V

    .line 340
    .line 341
    .line 342
    return-object p2
.end method

.method public final 飘花落叶言子楪苏兰世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/alibaba/fastjson2/util/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰苏哲(Lcom/alibaba/fastjson2/飘花落叶言子哲楪世兰苏;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
