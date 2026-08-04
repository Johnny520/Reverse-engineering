.class public final Lyyds/ᲈᲀᛷᛲ;
.super Lyyds/ᛱᛶᛶᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static ᛱᲈᲁ:Z

.field public static ᛶᛷᛲᲁ:Z

.field public static final ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛷᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, -0x37cb8e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᲈᲀᛷᛲ;

    .line 10
    .line 11
    invoke-direct {v0}, Lyyds/ᛱᛶᛶᲇ;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lyyds/ᲈᲀᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛷᛲ;

    .line 15
    .line 16
    return-void
.end method

.method public static ᛱᛳᛶᛳ(Landroid/content/Context;)V
    .locals 3

    .line 1
    const-wide v0, -0x37b9ae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x37ba2e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, v0, Landroid/content/ClipboardManager;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    check-cast v0, Landroid/content/ClipboardManager;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static {p0, v0}, Lyyds/ᲈᲀᛷᛲ;->ᛸᛸᛷᛱ(Landroid/content/Context;Landroid/content/ClipboardManager;)Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    :goto_1
    return-void

    .line 40
    :cond_2
    invoke-virtual {p0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {}, Lyyds/ᲀᛸ;->ᛵᛸᛸᛷ()Lcom/tencent/mmkv/MMKV;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-wide v1, -0x37bace68a836eL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v0, v1, p0}, Lcom/tencent/mmkv/MMKV;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :catch_0
    move-exception p0

    .line 64
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 65
    .line 66
    const-wide v1, -0x37bcce68a836eL

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public static ᛸᛸᛷᛱ(Landroid/content/Context;Landroid/content/ClipboardManager;)Lkotlin/Pair;
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_7

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-gtz v0, :cond_1

    .line 15
    .line 16
    goto/16 :goto_7

    .line 17
    .line 18
    :cond_1
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_11

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    if-nez p0, :cond_2

    .line 30
    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :cond_2
    sget-object v0, Lyyds/ᛴᲁᛸᛱ;->ᛲᲈᲁ:Lyyds/ᛴᲁᛸᛱ;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-nez p0, :cond_4

    .line 43
    .line 44
    :cond_3
    :goto_0
    move-object v2, v1

    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_4
    sget-object v0, Lyyds/ᛴᲁᛸᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛱᛳᲈ;

    .line 48
    .line 49
    invoke-static {v0, p0}, Lyyds/ᛱᛱᛳᲈ;->ᛲᲈᲁ(Lyyds/ᛱᛱᛳᲈ;Ljava/lang/String;)Lyyds/ᛳᛷᲀᛴ;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_5

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_5
    invoke-virtual {p0}, Lyyds/ᛳᛷᲀᛴ;->ᛵᲀᲈᛴ()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const/4 v2, 0x1

    .line 61
    invoke-static {v2, v0}, Lyyds/ᛷᛷᛶᲇ;->ᛷᛶᛷᲀ(ILjava/util/List;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-nez v2, :cond_6

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_6
    move-object v0, v1

    .line 77
    :goto_1
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    const/16 v2, 0x8

    .line 81
    .line 82
    :try_start_0
    invoke-static {v0, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-wide v2, -0x2bceee68a836eL

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 95
    .line 96
    const-wide v3, -0x2bcfae68a836eL

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    new-instance v3, Ljava/lang/String;

    .line 105
    .line 106
    invoke-direct {v3, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lorg/json/JSONObject;

    .line 110
    .line 111
    invoke-direct {v0, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-wide v2, -0x2bd00e68a836eL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    const-wide v3, -0x2bd07e68a836eL

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-static {v2, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-nez v2, :cond_8

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_8
    const-wide v2, -0x2bd0ce68a836eL

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    const-wide v3, -0x2bd11e68a836eL

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const-wide v3, -0x2bdc6e68a836eL

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v2, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-nez v3, :cond_9

    .line 179
    .line 180
    const-wide v3, -0x2bdcee68a836eL

    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-static {v2, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_9

    .line 194
    .line 195
    const-wide v3, -0x2bdd4e68a836eL

    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    invoke-static {v2, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-eqz v3, :cond_3

    .line 209
    .line 210
    :cond_9
    invoke-static {v2}, Lyyds/ᛴᲁᛸᛱ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    const-wide v2, -0x2bd19e68a836eL

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-static {v2}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-nez v3, :cond_a

    .line 232
    .line 233
    move-object v3, v2

    .line 234
    goto :goto_2

    .line 235
    :cond_a
    move-object v3, v1

    .line 236
    :goto_2
    if-nez v3, :cond_b

    .line 237
    .line 238
    goto/16 :goto_0

    .line 239
    .line 240
    :cond_b
    const-wide v4, -0x2bd21e68a836eL

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    invoke-static {v4, v5}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-static {v2}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-nez v4, :cond_c

    .line 258
    .line 259
    move-object v4, v2

    .line 260
    goto :goto_3

    .line 261
    :cond_c
    move-object v4, v1

    .line 262
    :goto_3
    if-nez v4, :cond_d

    .line 263
    .line 264
    goto/16 :goto_0

    .line 265
    .line 266
    :cond_d
    const-wide v7, -0x2bd25e68a836eL

    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    invoke-static {v7, v8}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-static {v0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    if-nez v2, :cond_e

    .line 284
    .line 285
    move-object v7, v0

    .line 286
    goto :goto_4

    .line 287
    :cond_e
    move-object v7, v1

    .line 288
    :goto_4
    new-instance v2, Lyyds/ᛲᲈᛱᛸ;

    .line 289
    .line 290
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p0, Ljava/util/regex/Matcher;

    .line 293
    .line 294
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-direct/range {v2 .. v7}, Lyyds/ᛲᲈᛱᛸ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    .line 300
    .line 301
    goto :goto_5

    .line 302
    :catchall_0
    move-exception v0

    .line 303
    move-object p0, v0

    .line 304
    new-instance v2, Lyyds/ᲈᛵᛵᛴ;

    .line 305
    .line 306
    invoke-direct {v2, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 307
    .line 308
    .line 309
    :goto_5
    instance-of p0, v2, Lyyds/ᲈᛵᛵᛴ;

    .line 310
    .line 311
    if-eqz p0, :cond_f

    .line 312
    .line 313
    move-object v2, v1

    .line 314
    :cond_f
    check-cast v2, Lyyds/ᛲᲈᛱᛸ;

    .line 315
    .line 316
    :goto_6
    if-nez v2, :cond_10

    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_10
    new-instance p0, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p1}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {p1}, Landroid/content/ClipDescription;->getTimestamp()J

    .line 329
    .line 330
    .line 331
    move-result-wide v0

    .line 332
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const/16 p1, 0x3a

    .line 336
    .line 337
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    iget-object p1, v2, Lyyds/ᛲᲈᛱᛸ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 341
    .line 342
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    new-instance p1, Lkotlin/Pair;

    .line 350
    .line 351
    invoke-direct {p1, v2, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    return-object p1

    .line 355
    :cond_11
    :goto_7
    return-object v1
.end method


# virtual methods
.method public final ᲇᲇᲇᛱ()V
    .locals 5

    .line 1
    const-wide v0, -0x37b5ee68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛲᲈᲁ()Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-static {v0, p0, v1}, Lyyds/ᛶᛷᛱᲈ;->ᲀᛲᛳᲀ(Ljava/lang/String;Ljava/lang/ClassLoader;I)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    sget v0, Lyyds/ᲁᛸᛵᲁ;->ᛲᲈᲁ:I

    .line 22
    .line 23
    invoke-static {p0}, Lyyds/ᛲᲇᲁᛳ;->ᛷᛵᲇᲀ(Ljava/lang/Object;)Lyyds/ᲀᛵᲁᛴ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    iget-object v0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lyyds/ᛴᛸᛲᛳ;

    .line 30
    .line 31
    iput v1, v0, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput v1, v0, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 38
    .line 39
    const-wide v3, -0x37b89e68a836eL

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    iput-object v3, v2, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v2}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-static {v2}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Lyyds/ᛳᛲᛶᛴ;

    .line 59
    .line 60
    new-instance v3, Lyyds/ᛳᲀᛴᛳ;

    .line 61
    .line 62
    const/4 v4, 0x1

    .line 63
    invoke-direct {v3, v4}, Lyyds/ᛳᲀᛴᛳ;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sget-object v4, Lyyds/ᲈᲀᛷᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲈᲀᛷᛲ;

    .line 67
    .line 68
    invoke-virtual {v4, v2, v3}, Lyyds/ᛱᛶᛶᲇ;->ᛶᛳᛶᛵ(Lyyds/ᛳᛲᛶᛴ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lyyds/ᲀᛵᲁᛴ;->ᛶᲈᛴᲈ()Lyyds/ᛵᲀᲀᛶ;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iput v1, v0, Lyyds/ᛴᛸᛲᛳ;->ᲇᲈᛵᛷ:I

    .line 76
    .line 77
    const-wide v2, -0x37b92e68a836eL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Lyyds/ᲇᛴᲇᛶ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛶ;->ᛲᲈᲁ()Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᲀᛲᛱᛱ(Ljava/util/List;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, Lyyds/ᛳᛲᛶᛴ;

    .line 97
    .line 98
    new-instance v0, Lyyds/ᛳᲀᛴᛳ;

    .line 99
    .line 100
    invoke-direct {v0, v1}, Lyyds/ᛳᲀᛴᛳ;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4, p0, v0}, Lyyds/ᛱᛶᛶᲇ;->ᛶᛳᛶᛵ(Lyyds/ᛳᛲᛶᛴ;Lyyds/ᛷᛴᲈᲀ;)V

    .line 104
    .line 105
    .line 106
    :cond_0
    return-void
.end method
