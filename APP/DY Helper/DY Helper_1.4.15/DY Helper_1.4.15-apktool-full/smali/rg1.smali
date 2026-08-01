.class public abstract Lrg1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;

.field public static final β:Lym1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v5, "requiredmsgcount"

    .line 2
    .line 3
    const-string v6, "requiredmessagecount"

    .line 4
    .line 5
    const-string v0, "msgcount"

    .line 6
    .line 7
    const-string v1, "messagecount"

    .line 8
    .line 9
    const-string v2, "sendcount"

    .line 10
    .line 11
    const-string v3, "targetmsgcount"

    .line 12
    .line 13
    const-string v4, "targetmessagecount"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lrg1;->α:Ljava/util/Set;

    .line 24
    .line 25
    new-instance v0, Lym1;

    .line 26
    .line 27
    const-string v1, "(\\d{1,3})\\s*\u6761(?:\u6d88\u606f)?"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lrg1;->β:Lym1;

    .line 33
    .line 34
    return-void
.end method

.method public static α(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 4

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lx02;->Π(Ljava/lang/String;)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const-string v0, "\\d{1,3}"

    .line 38
    .line 39
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast p0, Ljava/lang/CharSequence;

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-static {v0, v1, p0}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    iget-object p0, p0, Lix0;->α:Ljava/util/regex/Matcher;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const/16 v0, 0xa

    .line 72
    .line 73
    invoke-static {p0, v0}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :cond_1
    return-object v0

    .line 79
    :cond_2
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    const-string v0, "count"

    .line 84
    .line 85
    const-string v1, "num"

    .line 86
    .line 87
    const-string v2, "value"

    .line 88
    .line 89
    const-string v3, "text"

    .line 90
    .line 91
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    new-instance v1, Lef;

    .line 100
    .line 101
    const/16 v2, 0xe

    .line 102
    .line 103
    invoke-direct {v1, v2, p0}, Lef;-><init>(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Lus1;->Α(Lss1;La80;)Ly30;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, Lus1;->φ(Lss1;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Ljava/lang/Integer;

    .line 115
    .line 116
    return-object p0

    .line 117
    :cond_3
    const/4 p0, 0x0

    .line 118
    return-object p0
.end method

.method public static β(Ltf1;)Lqg1;
    .locals 15

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ltf1;->γ()Lfg1;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lfg1;->ε:Lfg1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_9

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Ltf1;->ξ:Lorg/json/JSONObject;

    .line 16
    .line 17
    new-instance v1, Ljava/util/ArrayDeque;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    new-instance v5, Ll91;

    .line 28
    .line 29
    invoke-direct {v5, v0, v4}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/16 v4, 0x33

    .line 40
    .line 41
    const/4 v5, 0x1

    .line 42
    if-nez v0, :cond_b

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ll91;

    .line 49
    .line 50
    iget-object v6, v0, Ll91;->ε:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v0, v0, Ll91;->ζ:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ljava/lang/Number;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v7, 0x6

    .line 61
    if-gt v0, v7, :cond_1

    .line 62
    .line 63
    instance-of v7, v6, Lorg/json/JSONObject;

    .line 64
    .line 65
    if-eqz v7, :cond_8

    .line 66
    .line 67
    check-cast v6, Lorg/json/JSONObject;

    .line 68
    .line 69
    invoke-virtual {v6}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    :cond_2
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_1

    .line 78
    .line 79
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v9

    .line 89
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v10, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    move v12, v3

    .line 102
    :goto_1
    if-ge v12, v11, :cond_4

    .line 103
    .line 104
    invoke-virtual {v8, v12}, Ljava/lang/String;->charAt(I)C

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    invoke-static {v13}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    if-eqz v14, :cond_3

    .line 113
    .line 114
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 115
    .line 116
    .line 117
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 125
    .line 126
    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object v11, Lrg1;->α:Ljava/util/Set;

    .line 134
    .line 135
    invoke-interface {v11, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v10

    .line 139
    if-eqz v10, :cond_6

    .line 140
    .line 141
    invoke-static {v9}, Lrg1;->α(Ljava/lang/Object;)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v10

    .line 145
    if-eqz v10, :cond_6

    .line 146
    .line 147
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    if-gt v5, v11, :cond_5

    .line 152
    .line 153
    if-ge v11, v4, :cond_5

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move-object v10, v2

    .line 157
    :goto_2
    if-eqz v10, :cond_6

    .line 158
    .line 159
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    new-instance v1, Lqg1;

    .line 164
    .line 165
    const-string v6, "structured:"

    .line 166
    .line 167
    invoke-virtual {v6, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-direct {v1, v6, v0}, Lqg1;-><init>(Ljava/lang/String;I)V

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_6
    instance-of v8, v9, Lorg/json/JSONObject;

    .line 176
    .line 177
    if-nez v8, :cond_7

    .line 178
    .line 179
    instance-of v8, v9, Lorg/json/JSONArray;

    .line 180
    .line 181
    if-eqz v8, :cond_2

    .line 182
    .line 183
    :cond_7
    add-int/lit8 v8, v0, 0x1

    .line 184
    .line 185
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v8

    .line 189
    new-instance v10, Ll91;

    .line 190
    .line 191
    invoke-direct {v10, v9, v8}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v10}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_8
    instance-of v4, v6, Lorg/json/JSONArray;

    .line 199
    .line 200
    if-eqz v4, :cond_1

    .line 201
    .line 202
    check-cast v6, Lorg/json/JSONArray;

    .line 203
    .line 204
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    move v5, v3

    .line 209
    :goto_3
    if-ge v5, v4, :cond_1

    .line 210
    .line 211
    invoke-virtual {v6, v5}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    instance-of v8, v7, Lorg/json/JSONObject;

    .line 216
    .line 217
    if-nez v8, :cond_9

    .line 218
    .line 219
    instance-of v8, v7, Lorg/json/JSONArray;

    .line 220
    .line 221
    if-eqz v8, :cond_a

    .line 222
    .line 223
    :cond_9
    add-int/lit8 v8, v0, 0x1

    .line 224
    .line 225
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    new-instance v9, Ll91;

    .line 230
    .line 231
    invoke-direct {v9, v7, v8}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v9}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    :cond_a
    add-int/lit8 v5, v5, 0x1

    .line 238
    .line 239
    goto :goto_3

    .line 240
    :cond_b
    move-object v1, v2

    .line 241
    :goto_4
    if-eqz v1, :cond_c

    .line 242
    .line 243
    return-object v1

    .line 244
    :cond_c
    iget-object v0, p0, Ltf1;->κ:Ljava/lang/String;

    .line 245
    .line 246
    iget-object v1, p0, Ltf1;->λ:Ljava/lang/String;

    .line 247
    .line 248
    iget-object v6, p0, Ltf1;->ζ:Ljava/lang/String;

    .line 249
    .line 250
    filled-new-array {v0, v1, v6}, [Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    new-instance v1, Lnq1;

    .line 259
    .line 260
    const/16 v6, 0x1a

    .line 261
    .line 262
    invoke-direct {v1, v6}, Lnq1;-><init>(I)V

    .line 263
    .line 264
    .line 265
    new-instance v6, Ly30;

    .line 266
    .line 267
    invoke-direct {v6, v0, v3, v1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 268
    .line 269
    .line 270
    new-instance v0, Lx30;

    .line 271
    .line 272
    invoke-direct {v0, v6}, Lx30;-><init>(Ly30;)V

    .line 273
    .line 274
    .line 275
    :cond_d
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    const/16 v6, 0xa

    .line 280
    .line 281
    if-eqz v1, :cond_f

    .line 282
    .line 283
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    check-cast v1, Ljava/lang/String;

    .line 288
    .line 289
    sget-object v7, Lrg1;->β:Lym1;

    .line 290
    .line 291
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object v7, v7, Lym1;->ε:Ljava/util/regex/Pattern;

    .line 298
    .line 299
    invoke-virtual {v7, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    invoke-static {v7, v3, v1}, Lv71;->α(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lix0;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    if-eqz v1, :cond_d

    .line 311
    .line 312
    invoke-virtual {v1}, Lix0;->α()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-static {v5, v1}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    check-cast v1, Ljava/lang/String;

    .line 321
    .line 322
    if-eqz v1, :cond_d

    .line 323
    .line 324
    invoke-static {v1, v6}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    if-eqz v1, :cond_d

    .line 329
    .line 330
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 331
    .line 332
    .line 333
    move-result v6

    .line 334
    if-gt v5, v6, :cond_e

    .line 335
    .line 336
    if-ge v6, v4, :cond_e

    .line 337
    .line 338
    goto :goto_5

    .line 339
    :cond_e
    move-object v1, v2

    .line 340
    :goto_5
    if-eqz v1, :cond_d

    .line 341
    .line 342
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 343
    .line 344
    .line 345
    move-result p0

    .line 346
    new-instance v0, Lqg1;

    .line 347
    .line 348
    const-string v1, "task-text"

    .line 349
    .line 350
    invoke-direct {v0, v1, p0}, Lqg1;-><init>(Ljava/lang/String;I)V

    .line 351
    .line 352
    .line 353
    return-object v0

    .line 354
    :cond_f
    iget-object p0, p0, Ltf1;->α:Ljava/lang/String;

    .line 355
    .line 356
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    const v3, 0x5ee12639

    .line 365
    .line 366
    .line 367
    if-eq v1, v3, :cond_11

    .line 368
    .line 369
    packed-switch v1, :pswitch_data_0

    .line 370
    .line 371
    .line 372
    goto :goto_6

    .line 373
    :pswitch_0
    const-string v1, "601052"

    .line 374
    .line 375
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result p0

    .line 379
    if-nez p0, :cond_12

    .line 380
    .line 381
    goto :goto_6

    .line 382
    :pswitch_1
    const-string v0, "601051"

    .line 383
    .line 384
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result p0

    .line 388
    if-nez p0, :cond_10

    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_10
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    goto :goto_7

    .line 396
    :pswitch_2
    const-string v1, "601050"

    .line 397
    .line 398
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result p0

    .line 402
    if-nez p0, :cond_12

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_11
    const-string v1, "601374"

    .line 406
    .line 407
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result p0

    .line 411
    if-nez p0, :cond_12

    .line 412
    .line 413
    :goto_6
    move-object v0, v2

    .line 414
    :cond_12
    :goto_7
    if-eqz v0, :cond_14

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    if-gt v5, p0, :cond_13

    .line 421
    .line 422
    if-ge p0, v4, :cond_13

    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_13
    move-object v0, v2

    .line 426
    :goto_8
    if-eqz v0, :cond_14

    .line 427
    .line 428
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 429
    .line 430
    .line 431
    move-result p0

    .line 432
    new-instance v0, Lqg1;

    .line 433
    .line 434
    const-string v1, "task-id-fallback"

    .line 435
    .line 436
    invoke-direct {v0, v1, p0}, Lqg1;-><init>(Ljava/lang/String;I)V

    .line 437
    .line 438
    .line 439
    return-object v0

    .line 440
    :cond_14
    :goto_9
    return-object v2

    .line 441
    :pswitch_data_0
    .packed-switch 0x5ee11ab4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
