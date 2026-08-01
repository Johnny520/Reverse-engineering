.class public final Lan1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lan1;

.field public static β:Lorg/json/JSONObject;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile δ:Z

.field public static final ε:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lan1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lan1;->α:Lan1;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lan1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    const-string v0, "31"

    .line 16
    .line 17
    const-string v1, "50"

    .line 18
    .line 19
    const-string v2, "11"

    .line 20
    .line 21
    const-string v3, "12"

    .line 22
    .line 23
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lan1;->ε:Ljava/util/Set;

    .line 32
    .line 33
    return-void
.end method

.method public static α(Ljava/lang/String;Lorg/json/JSONObject;)Lzm1;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x4

    .line 7
    const/4 v3, 0x6

    .line 8
    const-string v4, "00"

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    if-ne v0, v5, :cond_0

    .line 12
    .line 13
    const-string v0, "0000"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ne v0, v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-le v0, v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v0, p0

    .line 43
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    const-string v7, "\uff09"

    .line 48
    .line 49
    const/4 v8, 0x0

    .line 50
    if-ge v6, v3, :cond_3

    .line 51
    .line 52
    new-instance p1, Lzm1;

    .line 53
    .line 54
    const-string v0, "\u65e0\u6548\u4ee3\u7801\uff08"

    .line 55
    .line 56
    invoke-static {v0, p0, v7}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {p1, v8, v8, v8, p0}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_3
    invoke-virtual {v0, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v2, "\u672a\u77e5\u5730\u533a\uff08"

    .line 81
    .line 82
    if-nez p1, :cond_4

    .line 83
    .line 84
    new-instance p1, Lzm1;

    .line 85
    .line 86
    invoke-static {v2, p0, v7}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-direct {p1, v8, v8, v8, p0}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    return-object p1

    .line 94
    :cond_4
    const-string v3, "name"

    .line 95
    .line 96
    const-string v9, ""

    .line 97
    .line 98
    invoke-virtual {p1, v3, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {v10}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    if-eqz v11, :cond_5

    .line 110
    .line 111
    new-instance p1, Lzm1;

    .line 112
    .line 113
    invoke-static {v2, p0, v7}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-direct {p1, v8, v8, v8, p0}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-object p1

    .line 121
    :cond_5
    sget-object p0, Lan1;->ε:Ljava/util/Set;

    .line 122
    .line 123
    invoke-interface {p0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    invoke-virtual {v5, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_6

    .line 132
    .line 133
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    new-instance p0, Lzm1;

    .line 140
    .line 141
    invoke-direct {p0, v10, v8, v8, v10}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_6
    const-string v2, "cities"

    .line 146
    .line 147
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-nez p1, :cond_7

    .line 152
    .line 153
    new-instance p0, Lzm1;

    .line 154
    .line 155
    invoke-direct {p0, v10, v8, v8, v10}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    return-object p0

    .line 159
    :cond_7
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    if-nez p1, :cond_8

    .line 164
    .line 165
    new-instance p0, Lzm1;

    .line 166
    .line 167
    invoke-direct {p0, v10, v8, v8, v10}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object p0

    .line 171
    :cond_8
    invoke-virtual {p1, v3, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    if-eqz p0, :cond_a

    .line 176
    .line 177
    const-string p0, "\u5e02\u8f96\u533a"

    .line 178
    .line 179
    invoke-static {v2, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-nez p0, :cond_9

    .line 184
    .line 185
    invoke-static {v2, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    if-nez p0, :cond_9

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-eqz p0, :cond_a

    .line 199
    .line 200
    :cond_9
    const/4 v1, 0x1

    .line 201
    :cond_a
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    if-eqz p0, :cond_d

    .line 206
    .line 207
    if-eqz v1, :cond_b

    .line 208
    .line 209
    move-object p0, v10

    .line 210
    goto :goto_1

    .line 211
    :cond_b
    invoke-static {v10, v2}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    :goto_1
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    if-eqz p1, :cond_c

    .line 220
    .line 221
    move-object v2, v8

    .line 222
    :cond_c
    new-instance p1, Lzm1;

    .line 223
    .line 224
    invoke-direct {p1, v10, v2, v8, p0}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-object p1

    .line 228
    :cond_d
    const-string p0, "counties"

    .line 229
    .line 230
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    if-nez p0, :cond_10

    .line 235
    .line 236
    if-eqz v1, :cond_e

    .line 237
    .line 238
    move-object p0, v10

    .line 239
    goto :goto_2

    .line 240
    :cond_e
    invoke-static {v10, v2}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    :goto_2
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    if-eqz p1, :cond_f

    .line 249
    .line 250
    move-object v2, v8

    .line 251
    :cond_f
    new-instance p1, Lzm1;

    .line 252
    .line 253
    invoke-direct {p1, v10, v2, v8, p0}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    return-object p1

    .line 257
    :cond_10
    invoke-virtual {p0, v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p0

    .line 261
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-nez p1, :cond_13

    .line 269
    .line 270
    if-eqz v1, :cond_11

    .line 271
    .line 272
    invoke-virtual {v10, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    goto :goto_3

    .line 277
    :cond_11
    invoke-static {v10, v2, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    :goto_3
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_12

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_12
    move-object v8, v2

    .line 289
    :goto_4
    new-instance v0, Lzm1;

    .line 290
    .line 291
    invoke-direct {v0, v10, v8, p0, p1}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-object v0

    .line 295
    :cond_13
    if-eqz v1, :cond_14

    .line 296
    .line 297
    move-object p0, v10

    .line 298
    goto :goto_5

    .line 299
    :cond_14
    invoke-static {v10, v2}, Lnx;->θ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    :goto_5
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 304
    .line 305
    .line 306
    move-result p1

    .line 307
    if-eqz p1, :cond_15

    .line 308
    .line 309
    move-object v2, v8

    .line 310
    :cond_15
    new-instance p1, Lzm1;

    .line 311
    .line 312
    invoke-direct {p1, v10, v2, v8, p0}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    return-object p1
.end method

.method public static γ(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_6

    .line 3
    .line 4
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_1

    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    sget-object v2, Lzm1;->ε:Lzm1;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-static {p0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v1, "[^0-9]"

    .line 30
    .line 31
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v1, ""

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v3, 0x2

    .line 59
    if-ge v1, v3, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    sget-object v1, Lan1;->γ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 63
    .line 64
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lzm1;

    .line 69
    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    sget-object v2, Lan1;->β:Lorg/json/JSONObject;

    .line 74
    .line 75
    if-nez v2, :cond_4

    .line 76
    .line 77
    const-string v2, "\u26a0\ufe0f parse \u88ab\u8c03\u7528\u4f46 regionData \u4e3a null\uff0ccode="

    .line 78
    .line 79
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const/4 v3, 0x4

    .line 84
    const-string v4, "DYHelper"

    .line 85
    .line 86
    invoke-static {v4, v2, v0, v3, v0}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    new-instance v2, Lzm1;

    .line 90
    .line 91
    const-string v3, "\u5730\u533a\u4ee3\u7801: "

    .line 92
    .line 93
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-direct {v2, v0, v0, v0, v3}, Lzm1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    invoke-static {p0, v2}, Lan1;->α(Ljava/lang/String;Lorg/json/JSONObject;)Lzm1;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v1, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    :goto_0
    iget-object p0, v2, Lzm1;->δ:Ljava/lang/String;

    .line 112
    .line 113
    const-string v1, "\u672a\u77e5"

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    invoke-static {p0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-nez v1, :cond_6

    .line 121
    .line 122
    const-string v1, "\u5730\u533a\u4ee3\u7801"

    .line 123
    .line 124
    invoke-static {p0, v1, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_5

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_5
    return-object p0

    .line 132
    :cond_6
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final β(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "\u2705 \u533a\u57df\u4ee3\u7801\u8868\u52a0\u8f7d\u6210\u529f\uff0c\u7701\u4efd\u6570: "

    .line 2
    .line 3
    sget-boolean v1, Lan1;->δ:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    monitor-enter p0

    .line 9
    :try_start_0
    sget-boolean v1, Lan1;->δ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :cond_1
    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lan1;->β:Lorg/json/JSONObject;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    sput-boolean p1, Lan1;->δ:Z

    .line 24
    .line 25
    const-string p1, "110105"

    .line 26
    .line 27
    invoke-static {p1, v1}, Lan1;->α(Ljava/lang/String;Lorg/json/JSONObject;)Lzm1;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v2, "DYHelper"

    .line 32
    .line 33
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget-object p1, p1, Lzm1;->δ:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, "\uff0c\u9a8c\u8bc1 110105 = "

    .line 48
    .line 49
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/4 v0, 0x4

    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-static {v2, p1, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    :try_start_2
    const-string v0, "DYHelper"

    .line 67
    .line 68
    const-string v1, "\u274c JSON \u89e3\u6790\u5931\u8d25"

    .line 69
    .line 70
    invoke-static {v0, v1, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 71
    .line 72
    .line 73
    :goto_0
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    monitor-exit p0

    .line 77
    throw p1
.end method
