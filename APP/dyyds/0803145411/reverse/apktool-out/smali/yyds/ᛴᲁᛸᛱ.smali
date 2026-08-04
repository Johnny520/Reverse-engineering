.class public final Lyyds/ᛴᲁᛸᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛴᲁᛸᛱ;

.field public static final ᛵᛸᛸᛷ:Lyyds/ᛱᛱᛳᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-wide v0, -0x2bdd9e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x2bdf0e68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x2bdf8e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    const-wide v0, -0x2bdfee68a836eL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    const-wide v0, -0x2be03e68a836eL

    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    const-wide v0, -0x2be08e68a836eL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    new-instance v0, Lyyds/ᛴᲁᛸᛱ;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    sput-object v0, Lyyds/ᛴᲁᛸᛱ;->ᛲᲈᲁ:Lyyds/ᛴᲁᛸᛱ;

    .line 55
    .line 56
    new-instance v0, Lyyds/ᛱᛱᛳᲈ;

    .line 57
    .line 58
    const-wide v1, -0x2be0ae68a836eL

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-direct {v0, v1}, Lyyds/ᛱᛱᛳᲈ;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lyyds/ᛴᲁᛸᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛱᛳᲈ;

    .line 71
    .line 72
    return-void
.end method

.method public static ᛲᲈᲁ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-wide v0, -0x2bc9ce68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_a

    .line 11
    .line 12
    invoke-static {p0}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p0, v0

    .line 20
    :goto_0
    if-nez p0, :cond_1

    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :cond_1
    if-eqz p1, :cond_a

    .line 25
    .line 26
    invoke-static {p1}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object p1, v0

    .line 34
    :goto_1
    if-nez p1, :cond_3

    .line 35
    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :cond_3
    invoke-static {p2}, Lyyds/ᛴᲁᛸᛱ;->ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    new-instance v1, Lorg/json/JSONObject;

    .line 43
    .line 44
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 45
    .line 46
    .line 47
    const-wide v2, -0x2bca1e68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/4 v3, 0x1

    .line 57
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    const-wide v2, -0x2bca3e68a836eL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-wide v3, -0x2bcaae68a836eL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    .line 80
    .line 81
    const-wide v2, -0x2bcafe68a836eL

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    const-wide v2, -0x2bcb4e68a836eL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const-wide v2, -0x2bcbce68a836eL

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {v1, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    if-eqz p3, :cond_5

    .line 118
    .line 119
    invoke-static {p3}, Lyyds/ᛲᲇᛸᲇ;->ᲀᛴᲁᲈ(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-nez p0, :cond_4

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    move-object p3, v0

    .line 127
    :goto_2
    if-eqz p3, :cond_5

    .line 128
    .line 129
    const-wide p0, -0x2bcc0e68a836eL

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v1, p0, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    :cond_5
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    const-wide v0, -0x2bcc4e68a836eL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 154
    .line 155
    const-wide v0, -0x2bcd2e68a836eL

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    const-wide v0, -0x2bcd8e68a836eL

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    const/16 p1, 0xa

    .line 176
    .line 177
    invoke-static {p0, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    new-instance p3, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-wide v0, -0x2bd55e68a836eL

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_6

    .line 197
    .line 198
    const-wide v0, -0x2bd5be68a836eL

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    goto :goto_3

    .line 208
    :cond_6
    const-wide v0, -0x2bd73e68a836eL

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-eqz v0, :cond_7

    .line 222
    .line 223
    const-wide v0, -0x2bd78e68a836eL

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    goto :goto_3

    .line 233
    :cond_7
    const-wide v0, -0x2bd90e68a836eL

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    :goto_3
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-wide v0, -0x2bd29e68a836eL

    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-eqz p1, :cond_8

    .line 262
    .line 263
    const-wide p1, -0x2bd2fe68a836eL

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    goto :goto_4

    .line 273
    :cond_8
    const-wide v0, -0x2bd3ae68a836eL

    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    if-eqz p1, :cond_9

    .line 287
    .line 288
    const-wide p1, -0x2bd3fe68a836eL

    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    goto :goto_4

    .line 298
    :cond_9
    const-wide p1, -0x2bd4ae68a836eL

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    invoke-static {p1, p2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    :goto_4
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const/16 p0, 0x3011

    .line 314
    .line 315
    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    return-object p0

    .line 323
    :cond_a
    :goto_5
    return-object v0
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-wide v0, -0x2bda8e68a836eL

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
    invoke-static {p0, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-wide v0, -0x2bdaee68a836eL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    const-wide v0, -0x2bdb4e68a836eL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p0, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    const-wide v0, -0x2bdb9e68a836eL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_1
    const-wide v0, -0x2bdbee68a836eL

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
