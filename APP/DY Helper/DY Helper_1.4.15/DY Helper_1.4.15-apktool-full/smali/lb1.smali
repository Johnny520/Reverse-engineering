.class public final Llb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Llb1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Llb1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Llb1;->α:Llb1;

    .line 7
    .line 8
    return-void
.end method

.method public static β(ILjava/lang/Object;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    if-le p0, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    instance-of v0, p1, Lorg/json/JSONObject;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, Lorg/json/JSONObject;

    .line 17
    .line 18
    const-string v1, "pet"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lus1;->τ(Ljava/util/Iterator;)Lss1;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lya1;

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    invoke-direct {v1, p0, v2, p1}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Lorg/json/JSONObject;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    instance-of v0, p1, Lorg/json/JSONArray;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    move-object v0, p1

    .line 60
    check-cast v0, Lorg/json/JSONArray;

    .line 61
    .line 62
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-static {v1, v0}, Lj81;->Σ(II)Lxm0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v0}, Lxh;->я(Ljava/lang/Iterable;)Lf7;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    new-instance v1, Lya1;

    .line 76
    .line 77
    const/4 v2, 0x5

    .line 78
    invoke-direct {v1, p0, v2, p1}, Lya1;-><init>(IILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Lorg/json/JSONObject;

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 93
    return-object p0
.end method

.method public static γ(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 6

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p0, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-eqz p0, :cond_2

    .line 18
    .line 19
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lx02;->Σ(Ljava/lang/String;)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    :goto_0
    move-object p0, v1

    .line 46
    :goto_1
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    const-wide/16 v4, 0x0

    .line 53
    .line 54
    cmp-long v0, v2, v4

    .line 55
    .line 56
    if-lez v0, :cond_3

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    return-object v1
.end method


# virtual methods
.method public final α(Lorg/json/JSONObject;JJ)Lkb1;
    .locals 26

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p2, v0

    .line 7
    .line 8
    if-lez v2, :cond_1b

    .line 9
    .line 10
    cmp-long v0, p4, v0

    .line 11
    .line 12
    if-lez v0, :cond_1a

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    invoke-static {v0, v1}, Llb1;->β(ILjava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    new-instance v2, Lkb1;

    .line 24
    .line 25
    const/4 v10, 0x0

    .line 26
    const/4 v11, 0x0

    .line 27
    sget-object v3, Ljz;->ε:Ljz;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x0

    .line 33
    const/4 v8, 0x0

    .line 34
    const/4 v9, 0x0

    .line 35
    move-object v12, v3

    .line 36
    invoke-direct/range {v2 .. v12}, Lkb1;-><init>(Ljava/util/List;IZLjava/lang/Integer;IIIIILjava/util/List;)V

    .line 37
    .line 38
    .line 39
    return-object v2

    .line 40
    :cond_0
    const-string v2, "pet"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    new-instance v2, Lorg/json/JSONArray;

    .line 49
    .line 50
    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 51
    .line 52
    .line 53
    :cond_1
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v4, Ljava/util/LinkedHashSet;

    .line 59
    .line 60
    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    move v6, v0

    .line 68
    move v9, v6

    .line 69
    move v13, v9

    .line 70
    move v14, v13

    .line 71
    move v15, v14

    .line 72
    move/from16 v16, v15

    .line 73
    .line 74
    :goto_0
    const/4 v7, 0x0

    .line 75
    if-ge v6, v5, :cond_11

    .line 76
    .line 77
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    if-nez v8, :cond_2

    .line 82
    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_2
    const-string v10, "relation"

    .line 86
    .line 87
    invoke-virtual {v8, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    if-nez v10, :cond_3

    .line 92
    .line 93
    goto/16 :goto_6

    .line 94
    .line 95
    :cond_3
    add-int/lit8 v13, v13, 0x1

    .line 96
    .line 97
    const-string v11, "conversation_id"

    .line 98
    .line 99
    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    if-eqz v11, :cond_6

    .line 104
    .line 105
    sget-object v12, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 106
    .line 107
    if-ne v11, v12, :cond_4

    .line 108
    .line 109
    move-object v11, v7

    .line 110
    :cond_4
    if-eqz v11, :cond_6

    .line 111
    .line 112
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    if-eqz v11, :cond_6

    .line 117
    .line 118
    invoke-static {v11}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 119
    .line 120
    .line 121
    move-result-object v11

    .line 122
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    if-eqz v11, :cond_6

    .line 127
    .line 128
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    const/4 v0, 0x3

    .line 133
    if-gt v0, v12, :cond_6

    .line 134
    .line 135
    const/16 v0, 0x101

    .line 136
    .line 137
    if-ge v12, v0, :cond_6

    .line 138
    .line 139
    const-string v0, "0"

    .line 140
    .line 141
    invoke-virtual {v11, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_6

    .line 146
    .line 147
    const/4 v0, 0x0

    .line 148
    :goto_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-ge v0, v12, :cond_7

    .line 153
    .line 154
    invoke-virtual {v11, v0}, Ljava/lang/String;->charAt(I)C

    .line 155
    .line 156
    .line 157
    move-result v12

    .line 158
    invoke-static {v12}, Ljx0;->Κ(C)Z

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    if-eqz v12, :cond_5

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_6
    :goto_2
    move-object v11, v7

    .line 169
    :cond_7
    if-eqz v11, :cond_8

    .line 170
    .line 171
    add-int/lit8 v14, v14, 0x1

    .line 172
    .line 173
    :cond_8
    const-string v0, "conversation_short_id"

    .line 174
    .line 175
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    filled-new-array {v12, v0}, [Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-instance v18, Lny0;

    .line 192
    .line 193
    const/16 v24, 0x0

    .line 194
    .line 195
    const/16 v25, 0xb

    .line 196
    .line 197
    const/16 v19, 0x1

    .line 198
    .line 199
    const-class v21, Llb1;

    .line 200
    .line 201
    const-string v22, "toPositiveLong"

    .line 202
    .line 203
    const-string v23, "toPositiveLong(Ljava/lang/Object;)Ljava/lang/Long;"

    .line 204
    .line 205
    move-object/from16 v20, p0

    .line 206
    .line 207
    invoke-direct/range {v18 .. v25}, Lny0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 208
    .line 209
    .line 210
    move-object/from16 v12, v18

    .line 211
    .line 212
    invoke-static {v0, v12}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Ljava/lang/Long;

    .line 221
    .line 222
    const-string v12, "friend"

    .line 223
    .line 224
    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    if-eqz v12, :cond_9

    .line 229
    .line 230
    const-string v7, "user_id"

    .line 231
    .line 232
    invoke-virtual {v12, v7}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    :cond_9
    invoke-static {v7}, Llb1;->γ(Ljava/lang/Object;)Ljava/lang/Long;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    if-eqz v7, :cond_a

    .line 241
    .line 242
    add-int/lit8 v15, v15, 0x1

    .line 243
    .line 244
    :cond_a
    if-eqz v11, :cond_c

    .line 245
    .line 246
    const/16 v12, 0xa

    .line 247
    .line 248
    invoke-static {v11, v12}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v12

    .line 252
    if-nez v12, :cond_b

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_b
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 256
    .line 257
    .line 258
    move-result-wide v18

    .line 259
    cmp-long v12, v18, p2

    .line 260
    .line 261
    if-nez v12, :cond_c

    .line 262
    .line 263
    goto :goto_4

    .line 264
    :cond_c
    :goto_3
    if-eqz v0, :cond_d

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 267
    .line 268
    .line 269
    move-result-wide v18

    .line 270
    cmp-long v0, v18, p2

    .line 271
    .line 272
    if-nez v0, :cond_10

    .line 273
    .line 274
    goto :goto_4

    .line 275
    :cond_d
    if-nez v7, :cond_e

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_e
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 279
    .line 280
    .line 281
    move-result-wide v18

    .line 282
    cmp-long v0, v18, p4

    .line 283
    .line 284
    if-nez v0, :cond_10

    .line 285
    .line 286
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 287
    .line 288
    const-string v0, "sec_pet_id"

    .line 289
    .line 290
    invoke-virtual {v8, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    invoke-virtual {v10, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    filled-new-array {v7, v0}, [Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    new-instance v7, Lf71;

    .line 307
    .line 308
    const/16 v8, 0xd

    .line 309
    .line 310
    invoke-direct {v7, v8}, Lf71;-><init>(I)V

    .line 311
    .line 312
    .line 313
    invoke-static {v0, v7}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-static {v0}, Lus1;->υ(Lss1;)Lcu;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0}, Lcu;->iterator()Ljava/util/Iterator;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    :goto_5
    move-object v7, v0

    .line 326
    check-cast v7, Lσ;

    .line 327
    .line 328
    invoke-virtual {v7}, Lσ;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v8

    .line 332
    if-eqz v8, :cond_f

    .line 333
    .line 334
    invoke-virtual {v7}, Lσ;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    check-cast v7, Ljava/lang/String;

    .line 339
    .line 340
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    add-int/lit8 v16, v16, 0x1

    .line 344
    .line 345
    goto :goto_5

    .line 346
    :cond_f
    if-eqz v11, :cond_10

    .line 347
    .line 348
    invoke-virtual {v4, v11}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    :cond_10
    :goto_6
    add-int/lit8 v6, v6, 0x1

    .line 352
    .line 353
    const/4 v0, 0x0

    .line 354
    goto/16 :goto_0

    .line 355
    .line 356
    :cond_11
    new-instance v0, Lkb1;

    .line 357
    .line 358
    invoke-static {v3}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    const-string v3, "has_more"

    .line 363
    .line 364
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    instance-of v5, v3, Ljava/lang/Boolean;

    .line 369
    .line 370
    if-eqz v5, :cond_12

    .line 371
    .line 372
    check-cast v3, Ljava/lang/Boolean;

    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    move v10, v3

    .line 379
    goto :goto_8

    .line 380
    :cond_12
    instance-of v5, v3, Ljava/lang/Number;

    .line 381
    .line 382
    const/4 v6, 0x1

    .line 383
    if-eqz v5, :cond_15

    .line 384
    .line 385
    check-cast v3, Ljava/lang/Number;

    .line 386
    .line 387
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    if-eqz v3, :cond_14

    .line 392
    .line 393
    :cond_13
    :goto_7
    move v10, v6

    .line 394
    goto :goto_8

    .line 395
    :cond_14
    const/4 v10, 0x0

    .line 396
    goto :goto_8

    .line 397
    :cond_15
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v5

    .line 401
    const-string v10, "1"

    .line 402
    .line 403
    invoke-virtual {v5, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    if-nez v5, :cond_13

    .line 408
    .line 409
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    const-string v5, "true"

    .line 414
    .line 415
    invoke-virtual {v3, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    if-eqz v3, :cond_14

    .line 420
    .line 421
    goto :goto_7

    .line 422
    :goto_8
    const-string v3, "offset"

    .line 423
    .line 424
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    instance-of v3, v1, Ljava/lang/Number;

    .line 429
    .line 430
    if-eqz v3, :cond_16

    .line 431
    .line 432
    check-cast v1, Ljava/lang/Number;

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 435
    .line 436
    .line 437
    move-result v1

    .line 438
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    goto :goto_a

    .line 443
    :cond_16
    if-eqz v1, :cond_18

    .line 444
    .line 445
    sget-object v3, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 446
    .line 447
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-eqz v3, :cond_17

    .line 452
    .line 453
    goto :goto_9

    .line 454
    :cond_17
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    invoke-static {v1}, Lx02;->Π(Ljava/lang/String;)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    goto :goto_a

    .line 471
    :cond_18
    :goto_9
    move-object v1, v7

    .line 472
    :goto_a
    if-eqz v1, :cond_19

    .line 473
    .line 474
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 475
    .line 476
    .line 477
    move-result v3

    .line 478
    if-ltz v3, :cond_19

    .line 479
    .line 480
    move-object v11, v1

    .line 481
    goto :goto_b

    .line 482
    :cond_19
    move-object v11, v7

    .line 483
    :goto_b
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 484
    .line 485
    .line 486
    move-result v12

    .line 487
    invoke-static {v4}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 488
    .line 489
    .line 490
    move-result-object v17

    .line 491
    move-object v7, v0

    .line 492
    invoke-direct/range {v7 .. v17}, Lkb1;-><init>(Ljava/util/List;IZLjava/lang/Integer;IIIIILjava/util/List;)V

    .line 493
    .line 494
    .line 495
    return-object v7

    .line 496
    :cond_1a
    const-string v0, "otherUid \u5fc5\u987b\u5927\u4e8e 0"

    .line 497
    .line 498
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :goto_c
    const/4 v0, 0x0

    .line 502
    return-object v0

    .line 503
    :cond_1b
    const-string v0, "conversationShortId \u5fc5\u987b\u5927\u4e8e 0"

    .line 504
    .line 505
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    goto :goto_c
.end method
