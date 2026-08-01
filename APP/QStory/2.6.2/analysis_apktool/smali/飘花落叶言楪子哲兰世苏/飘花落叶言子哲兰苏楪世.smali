.class public final L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;
.super L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言楪子哲兰世苏/飘花落叶言子苏兰楪世哲;


# static fields
.field public static final 飘花落叶言子楪兰世哲苏:[C

.field public static final 飘花落叶言子楪兰世苏哲:[B

.field public static final 飘花落叶言子楪兰苏世哲:[B

.field public static final 飘花落叶言子楪哲兰世苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;

.field public static final 飘花落叶言子楪哲兰苏世:[C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪哲兰世苏:L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;

    .line 8
    .line 9
    const/16 v0, 0x9

    .line 10
    .line 11
    new-array v0, v0, [C

    .line 12
    .line 13
    fill-array-data v0, :array_0

    .line 14
    .line 15
    .line 16
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪哲兰苏世:[C

    .line 17
    .line 18
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    const-string v1, "new Date("

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sput-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪兰世苏哲:[B

    .line 27
    .line 28
    const/16 v1, 0x1f

    .line 29
    .line 30
    new-array v1, v1, [C

    .line 31
    .line 32
    fill-array-data v1, :array_1

    .line 33
    .line 34
    .line 35
    sput-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪兰世哲苏:[C

    .line 36
    .line 37
    const-string v1, "{\"@type\":\"java.sql.Date\",\"val\":"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪兰苏世哲:[B

    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :array_0
    .array-data 2
        0x6es
        0x65s
        0x77s
        0x20s
        0x44s
        0x61s
        0x74s
        0x65s
        0x28s
    .end array-data

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    nop

    .line 61
    :array_1
    .array-data 2
        0x7bs
        0x22s
        0x40s
        0x74s
        0x79s
        0x70s
        0x65s
        0x22s
        0x3as
        0x22s
        0x6as
        0x61s
        0x76s
        0x61s
        0x2es
        0x73s
        0x71s
        0x6cs
        0x2es
        0x44s
        0x61s
        0x74s
        0x65s
        0x22s
        0x2cs
        0x22s
        0x76s
        0x61s
        0x6cs
        0x22s
        0x3as
    .end array-data
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏世哲(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    check-cast p2, Ljava/util/Date;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    invoke-virtual {p1, p2, p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰苏世楪哲(J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰(Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰哲楪苏世()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v3, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲苏兰世:Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;

    .line 14
    .line 15
    move-object v4, v2

    .line 16
    check-cast v4, Ljava/util/Date;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    move-object/from16 v7, p4

    .line 23
    .line 24
    invoke-virtual {v1, v2, v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子世兰苏楪哲(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const-string v7, "java.sql.Date"

    .line 29
    .line 30
    if-eqz v2, :cond_4

    .line 31
    .line 32
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰苏世:Z

    .line 33
    .line 34
    const/16 v2, 0x7d

    .line 35
    .line 36
    const/16 v3, 0x29

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪兰世哲苏:[C

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪哲兰苏世:[C

    .line 58
    .line 59
    move v2, v3

    .line 60
    :goto_0
    array-length v3, v0

    .line 61
    invoke-virtual {v1, v3, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世哲兰苏(I[C)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪兰苏世哲:[B

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪兰世苏哲:[B

    .line 83
    .line 84
    move v2, v3

    .line 85
    :goto_1
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世兰哲苏([B)V

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-virtual {v1, v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子世苏兰哲(C)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_4
    iget-boolean v2, v0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Z

    .line 96
    .line 97
    if-nez v2, :cond_5

    .line 98
    .line 99
    move-wide/from16 v8, p5

    .line 100
    .line 101
    invoke-virtual {v1, v8, v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪苏世哲兰(J)J

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriterUtilDateAsMillis:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 106
    .line 107
    iget-wide v10, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 108
    .line 109
    and-long/2addr v8, v10

    .line 110
    const-wide/16 v10, 0x0

    .line 111
    .line 112
    cmp-long v2, v8, v10

    .line 113
    .line 114
    if-eqz v2, :cond_6

    .line 115
    .line 116
    :cond_5
    move-object v0, v1

    .line 117
    goto/16 :goto_d

    .line 118
    .line 119
    :cond_6
    iget-boolean v2, v0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Z

    .line 120
    .line 121
    const-wide/16 v8, 0x3e8

    .line 122
    .line 123
    if-nez v2, :cond_18

    .line 124
    .line 125
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪世哲苏兰()Ljava/time/ZoneId;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    sget-object v3, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Ljava/time/ZoneId;

    .line 130
    .line 131
    if-eq v2, v3, :cond_a

    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    sget-object v13, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 138
    .line 139
    if-ne v12, v13, :cond_7

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    sget-object v12, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    .line 143
    .line 144
    if-eq v2, v12, :cond_9

    .line 145
    .line 146
    const-string v12, "UTC"

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/time/ZoneId;->getId()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v12

    .line 156
    if-eqz v12, :cond_8

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_8
    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 160
    .line 161
    .line 162
    move-result-object v12

    .line 163
    invoke-static {v12, v2}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 164
    .line 165
    .line 166
    move-result-object v12

    .line 167
    invoke-virtual {v12}, Ljava/time/ZonedDateTime;->getOffset()Ljava/time/ZoneOffset;

    .line 168
    .line 169
    .line 170
    move-result-object v12

    .line 171
    invoke-virtual {v12}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    goto :goto_5

    .line 176
    :cond_9
    :goto_3
    const/4 v12, 0x0

    .line 177
    goto :goto_5

    .line 178
    :cond_a
    :goto_4
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 179
    .line 180
    .line 181
    move-result-wide v12

    .line 182
    invoke-static {v12, v13}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(J)I

    .line 183
    .line 184
    .line 185
    move-result v12

    .line 186
    :goto_5
    iget-object v14, v0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 187
    .line 188
    iget-boolean v15, v0, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:Z

    .line 189
    .line 190
    if-eqz v15, :cond_b

    .line 191
    .line 192
    :goto_6
    const/16 v16, 0x0

    .line 193
    .line 194
    goto :goto_7

    .line 195
    :cond_b
    if-nez v14, :cond_c

    .line 196
    .line 197
    goto :goto_6

    .line 198
    :cond_c
    move-object/from16 v16, v14

    .line 199
    .line 200
    :goto_7
    if-nez v16, :cond_16

    .line 201
    .line 202
    invoke-static {v5, v6, v8, v9}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v16

    .line 206
    if-eq v2, v3, :cond_e

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    move-wide/from16 p2, v10

    .line 213
    .line 214
    sget-object v10, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:Ljava/time/zone/ZoneRules;

    .line 215
    .line 216
    if-ne v3, v10, :cond_d

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_d
    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-virtual {v2}, Ljava/time/ZoneId;->getRules()Ljava/time/zone/ZoneRules;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    invoke-virtual {v10, v3}, Ljava/time/zone/ZoneRules;->getOffset(Ljava/time/Instant;)Ljava/time/ZoneOffset;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v3}, Ljava/time/ZoneOffset;->getTotalSeconds()I

    .line 232
    .line 233
    .line 234
    move-result v3

    .line 235
    goto :goto_9

    .line 236
    :cond_e
    move-wide/from16 p2, v10

    .line 237
    .line 238
    :goto_8
    invoke-static/range {v16 .. v17}, Lcom/alibaba/fastjson2/util/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲(J)I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    :goto_9
    int-to-long v10, v3

    .line 243
    add-long v10, v16, v10

    .line 244
    .line 245
    move-object v3, v14

    .line 246
    const-wide/32 v13, 0x15180

    .line 247
    .line 248
    .line 249
    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->floorDiv(JJ)J

    .line 250
    .line 251
    .line 252
    move-result-wide v16

    .line 253
    invoke-static {v10, v11, v13, v14}, Ljava/lang/Math;->floorMod(JJ)J

    .line 254
    .line 255
    .line 256
    move-result-wide v10

    .line 257
    long-to-int v10, v10

    .line 258
    const-wide/32 v13, 0xafa6c

    .line 259
    .line 260
    .line 261
    add-long v13, v16, v13

    .line 262
    .line 263
    cmp-long v11, v13, p2

    .line 264
    .line 265
    const-wide/16 v18, 0x1

    .line 266
    .line 267
    const-wide/32 v20, 0x23ab1

    .line 268
    .line 269
    .line 270
    const-wide/16 v22, 0x190

    .line 271
    .line 272
    if-gez v11, :cond_f

    .line 273
    .line 274
    const-wide/32 v24, 0xafa6d

    .line 275
    .line 276
    .line 277
    add-long v16, v16, v24

    .line 278
    .line 279
    div-long v16, v16, v20

    .line 280
    .line 281
    sub-long v8, v16, v18

    .line 282
    .line 283
    mul-long v16, v8, v22

    .line 284
    .line 285
    neg-long v8, v8

    .line 286
    mul-long v8, v8, v20

    .line 287
    .line 288
    add-long/2addr v13, v8

    .line 289
    goto :goto_a

    .line 290
    :cond_f
    move-wide/from16 v16, p2

    .line 291
    .line 292
    :goto_a
    mul-long v8, v13, v22

    .line 293
    .line 294
    const-wide/16 v24, 0x24f

    .line 295
    .line 296
    add-long v8, v8, v24

    .line 297
    .line 298
    div-long v8, v8, v20

    .line 299
    .line 300
    const-wide/16 v20, 0x16d

    .line 301
    .line 302
    mul-long v24, v8, v20

    .line 303
    .line 304
    const-wide/16 v26, 0x4

    .line 305
    .line 306
    div-long v28, v8, v26

    .line 307
    .line 308
    add-long v28, v28, v24

    .line 309
    .line 310
    const-wide/16 v24, 0x64

    .line 311
    .line 312
    div-long v30, v8, v24

    .line 313
    .line 314
    sub-long v28, v28, v30

    .line 315
    .line 316
    div-long v30, v8, v22

    .line 317
    .line 318
    add-long v30, v30, v28

    .line 319
    .line 320
    sub-long v28, v13, v30

    .line 321
    .line 322
    cmp-long v11, v28, p2

    .line 323
    .line 324
    if-gez v11, :cond_10

    .line 325
    .line 326
    sub-long v8, v8, v18

    .line 327
    .line 328
    mul-long v20, v20, v8

    .line 329
    .line 330
    div-long v18, v8, v26

    .line 331
    .line 332
    add-long v18, v18, v20

    .line 333
    .line 334
    div-long v20, v8, v24

    .line 335
    .line 336
    sub-long v18, v18, v20

    .line 337
    .line 338
    div-long v20, v8, v22

    .line 339
    .line 340
    add-long v20, v20, v18

    .line 341
    .line 342
    sub-long v28, v13, v20

    .line 343
    .line 344
    :cond_10
    move-wide/from16 v13, v28

    .line 345
    .line 346
    add-long v8, v8, v16

    .line 347
    .line 348
    long-to-int v11, v13

    .line 349
    mul-int/lit8 v13, v11, 0x5

    .line 350
    .line 351
    add-int/lit8 v13, v13, 0x2

    .line 352
    .line 353
    div-int/lit16 v13, v13, 0x99

    .line 354
    .line 355
    add-int/lit8 v14, v13, 0x2

    .line 356
    .line 357
    rem-int/lit8 v14, v14, 0xc

    .line 358
    .line 359
    add-int/lit8 v14, v14, 0x1

    .line 360
    .line 361
    mul-int/lit16 v0, v13, 0x132

    .line 362
    .line 363
    add-int/lit8 v0, v0, 0x5

    .line 364
    .line 365
    div-int/lit8 v0, v0, 0xa

    .line 366
    .line 367
    sub-int/2addr v11, v0

    .line 368
    add-int/lit8 v11, v11, 0x1

    .line 369
    .line 370
    div-int/lit8 v13, v13, 0xa

    .line 371
    .line 372
    move-object/from16 v16, v3

    .line 373
    .line 374
    move-object v0, v4

    .line 375
    int-to-long v3, v13

    .line 376
    add-long/2addr v8, v3

    .line 377
    const-wide/32 v3, -0x3b9ac9ff

    .line 378
    .line 379
    .line 380
    cmp-long v3, v8, v3

    .line 381
    .line 382
    if-ltz v3, :cond_15

    .line 383
    .line 384
    const-wide/32 v3, 0x3b9ac9ff

    .line 385
    .line 386
    .line 387
    cmp-long v3, v8, v3

    .line 388
    .line 389
    if-gtz v3, :cond_15

    .line 390
    .line 391
    long-to-int v3, v8

    .line 392
    int-to-long v8, v10

    .line 393
    cmp-long v4, v8, p2

    .line 394
    .line 395
    if-ltz v4, :cond_14

    .line 396
    .line 397
    const-wide/32 v17, 0x1517f

    .line 398
    .line 399
    .line 400
    cmp-long v4, v8, v17

    .line 401
    .line 402
    if-gtz v4, :cond_14

    .line 403
    .line 404
    const-wide/16 v17, 0xe10

    .line 405
    .line 406
    move/from16 p2, v12

    .line 407
    .line 408
    div-long v12, v8, v17

    .line 409
    .line 410
    long-to-int v4, v12

    .line 411
    mul-int/lit16 v10, v4, 0xe10

    .line 412
    .line 413
    int-to-long v12, v10

    .line 414
    sub-long/2addr v8, v12

    .line 415
    const-wide/16 v12, 0x3c

    .line 416
    .line 417
    div-long v12, v8, v12

    .line 418
    .line 419
    long-to-int v10, v12

    .line 420
    mul-int/lit8 v12, v10, 0x3c

    .line 421
    .line 422
    int-to-long v12, v12

    .line 423
    sub-long/2addr v8, v12

    .line 424
    long-to-int v8, v8

    .line 425
    if-ltz v3, :cond_13

    .line 426
    .line 427
    const/16 v9, 0x270f

    .line 428
    .line 429
    if-gt v3, v9, :cond_13

    .line 430
    .line 431
    const-wide/16 v12, 0x3e8

    .line 432
    .line 433
    invoke-static {v5, v6, v12, v13}, Ljava/lang/Math;->floorMod(JJ)J

    .line 434
    .line 435
    .line 436
    move-result-wide v5

    .line 437
    long-to-int v2, v5

    .line 438
    if-nez v2, :cond_12

    .line 439
    .line 440
    if-nez v15, :cond_12

    .line 441
    .line 442
    if-nez v4, :cond_11

    .line 443
    .line 444
    if-nez v10, :cond_11

    .line 445
    .line 446
    if-nez v8, :cond_11

    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    if-eqz v0, :cond_11

    .line 461
    .line 462
    invoke-virtual {v1, v3, v14, v11}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲苏楪世兰(III)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :cond_11
    move-object v0, v1

    .line 467
    move v1, v3

    .line 468
    move v6, v8

    .line 469
    move v5, v10

    .line 470
    move v3, v11

    .line 471
    move v2, v14

    .line 472
    invoke-virtual/range {v0 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰楪苏(IIIIII)V

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :cond_12
    move v1, v3

    .line 477
    move-object/from16 v0, p1

    .line 478
    .line 479
    move v7, v2

    .line 480
    move v6, v8

    .line 481
    move v5, v10

    .line 482
    move v3, v11

    .line 483
    move v2, v14

    .line 484
    move v9, v15

    .line 485
    move/from16 v8, p2

    .line 486
    .line 487
    invoke-virtual/range {v0 .. v9}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子哲世兰苏楪(IIIIIIIIZ)V

    .line 488
    .line 489
    .line 490
    return-void

    .line 491
    :cond_13
    move-object v0, v1

    .line 492
    goto :goto_b

    .line 493
    :cond_14
    new-instance v0, Ljava/time/DateTimeException;

    .line 494
    .line 495
    const-string v1, "Invalid secondOfDay "

    .line 496
    .line 497
    invoke-static {v8, v9, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(JLjava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v0

    .line 505
    :cond_15
    new-instance v0, Ljava/time/DateTimeException;

    .line 506
    .line 507
    const-string v1, "Invalid year "

    .line 508
    .line 509
    invoke-static {v8, v9, v1}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏世兰(JLjava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-direct {v0, v1}, Ljava/time/DateTimeException;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    throw v0

    .line 517
    :cond_16
    move-object v0, v1

    .line 518
    move-object/from16 v16, v14

    .line 519
    .line 520
    :goto_b
    if-eqz v16, :cond_17

    .line 521
    .line 522
    invoke-virtual/range {p0 .. p0}, L飘花落叶言楪子世兰哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子世楪兰苏哲()Ljava/time/format/DateTimeFormatter;

    .line 523
    .line 524
    .line 525
    move-result-object v13

    .line 526
    goto :goto_c

    .line 527
    :cond_17
    const/4 v13, 0x0

    .line 528
    :goto_c
    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-static {v1, v2}, Ljava/time/ZonedDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    invoke-virtual {v13, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v1

    .line 540
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言楪子哲世苏兰(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    return-void

    .line 544
    :cond_18
    move-object v0, v1

    .line 545
    move-wide v12, v8

    .line 546
    div-long/2addr v5, v12

    .line 547
    invoke-virtual {v0, v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 548
    .line 549
    .line 550
    return-void

    .line 551
    :goto_d
    invoke-virtual {v0, v5, v6}, Lcom/alibaba/fastjson2/飘花落叶言子哲世苏楪兰;->飘花落叶言子兰世楪苏哲(J)V

    .line 552
    .line 553
    .line 554
    return-void
.end method
