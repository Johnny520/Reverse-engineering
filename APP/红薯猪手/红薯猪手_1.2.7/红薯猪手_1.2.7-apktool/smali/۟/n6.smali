.class public final L۟/n6;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lorg/json/JSONObject;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/f6;


# direct methods
.method public constructor <init>(L۟/f6;)V
    .locals 0

    iput-object p1, p0, L۟/n6;->ۥ:L۟/f6;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, Lorg/json/JSONObject;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    fill-array-data v0, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x6

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    fill-array-data v2, :array_1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, L۟/n6;->ۥ:L۟/f6;

    .line 23
    .line 24
    sget-object v2, L۟/f6;->ۥ۟ۨ:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    new-array v2, v0, [B

    .line 31
    .line 32
    fill-array-data v2, :array_2

    .line 33
    .line 34
    .line 35
    new-array v3, v1, [B

    .line 36
    .line 37
    fill-array-data v3, :array_3

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_a

    .line 49
    .line 50
    sget v3, L۟/o;->ۥ:I

    .line 51
    .line 52
    invoke-static {v2}, L۟/o;->ۥ۟ۡ(Lorg/json/JSONArray;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x0

    .line 57
    const/4 v5, 0x1

    .line 58
    if-ne v3, v5, :cond_0

    .line 59
    .line 60
    move v3, v5

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move v3, v4

    .line 63
    :goto_0
    if-eqz v3, :cond_a

    .line 64
    .line 65
    invoke-static {v2}, L۟/o;->ۥ۟ۤ(Lorg/json/JSONArray;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    :goto_1
    const/4 v6, -0x1

    .line 70
    if-ge v6, v3, :cond_a

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    if-eqz v6, :cond_9

    .line 77
    .line 78
    sget-boolean v7, L۟/y2;->ۥ:Z

    .line 79
    .line 80
    if-eqz v7, :cond_9

    .line 81
    .line 82
    sget-object v7, L۟/y2;->ۥ۟ۡ:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-lez v7, :cond_1

    .line 89
    .line 90
    move v7, v5

    .line 91
    goto :goto_2

    .line 92
    :cond_1
    move v7, v4

    .line 93
    :goto_2
    const-string v8, "compile(...)"

    .line 94
    .line 95
    const-string v9, "pattern"

    .line 96
    .line 97
    const-string v10, ""

    .line 98
    .line 99
    const/16 v11, 0x42

    .line 100
    .line 101
    if-eqz v7, :cond_5

    .line 102
    .line 103
    new-array v7, v0, [B

    .line 104
    .line 105
    fill-array-data v7, :array_4

    .line 106
    .line 107
    .line 108
    new-array v12, v1, [B

    .line 109
    .line 110
    fill-array-data v12, :array_5

    .line 111
    .line 112
    .line 113
    invoke-static {v7, v12}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    if-eqz v7, :cond_2

    .line 122
    .line 123
    const/16 v12, 0x8

    .line 124
    .line 125
    new-array v12, v12, [B

    .line 126
    .line 127
    fill-array-data v12, :array_6

    .line 128
    .line 129
    .line 130
    new-array v13, v1, [B

    .line 131
    .line 132
    fill-array-data v13, :array_7

    .line 133
    .line 134
    .line 135
    invoke-static {v12, v13}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v12

    .line 139
    invoke-virtual {v7, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    goto :goto_3

    .line 144
    :cond_2
    const/4 v7, 0x0

    .line 145
    :goto_3
    if-nez v7, :cond_3

    .line 146
    .line 147
    move-object v7, v10

    .line 148
    :cond_3
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    if-lez v12, :cond_4

    .line 153
    .line 154
    move v12, v5

    .line 155
    goto :goto_4

    .line 156
    :cond_4
    move v12, v4

    .line 157
    :goto_4
    if-eqz v12, :cond_5

    .line 158
    .line 159
    sget-object v12, L۟/y2;->ۥ۟ۡ:Ljava/lang/String;

    .line 160
    .line 161
    sget-object v13, L۟/u8;->ۥ:[L۟/u8;

    .line 162
    .line 163
    invoke-static {v9, v12}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v12, v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 167
    .line 168
    .line 169
    move-result-object v12

    .line 170
    invoke-static {v8, v12}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_5

    .line 182
    .line 183
    goto :goto_8

    .line 184
    :cond_5
    sget-object v7, L۟/y2;->ۥ۟۠:Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-lez v7, :cond_6

    .line 191
    .line 192
    move v7, v5

    .line 193
    goto :goto_5

    .line 194
    :cond_6
    move v7, v4

    .line 195
    :goto_5
    if-eqz v7, :cond_9

    .line 196
    .line 197
    const/4 v7, 0x5

    .line 198
    new-array v7, v7, [B

    .line 199
    .line 200
    fill-array-data v7, :array_8

    .line 201
    .line 202
    .line 203
    new-array v12, v1, [B

    .line 204
    .line 205
    fill-array-data v12, :array_9

    .line 206
    .line 207
    .line 208
    invoke-static {v7, v12}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    if-nez v6, :cond_7

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :cond_7
    move-object v10, v6

    .line 220
    :goto_6
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    if-lez v6, :cond_8

    .line 225
    .line 226
    move v6, v5

    .line 227
    goto :goto_7

    .line 228
    :cond_8
    move v6, v4

    .line 229
    :goto_7
    if-eqz v6, :cond_9

    .line 230
    .line 231
    sget-object v6, L۟/y2;->ۥ۟۠:Ljava/lang/String;

    .line 232
    .line 233
    sget-object v7, L۟/u8;->ۥ:[L۟/u8;

    .line 234
    .line 235
    invoke-static {v9, v6}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v6, v11}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-static {v8, v6}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6, v10}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    .line 250
    .line 251
    .line 252
    move-result v6

    .line 253
    if-eqz v6, :cond_9

    .line 254
    .line 255
    :goto_8
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    :cond_9
    add-int/lit8 v3, v3, -0x1

    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_a
    return-object p1

    .line 263
    :array_0
    .array-data 1
        0x43t
        -0x44t
    .end array-data

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    nop

    .line 269
    :array_1
    .array-data 1
        0x2at
        -0x38t
        -0x5bt
        -0x2dt
        0x23t
        0x2ft
    .end array-data

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    nop

    .line 277
    :array_2
    .array-data 1
        -0x2dt
        -0x52t
        0x44t
        0x37t
    .end array-data

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    :array_3
    .array-data 1
        -0x49t
        -0x31t
        0x30t
        0x56t
        -0x18t
        0x10t
    .end array-data

    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    nop

    .line 291
    :array_4
    .array-data 1
        0x4ft
        0x78t
        0x6ct
        -0x59t
    .end array-data

    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    :array_5
    .array-data 1
        0x3at
        0xbt
        0x9t
        -0x2bt
        -0x74t
        -0xdt
    .end array-data

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    nop

    .line 305
    :array_6
    .array-data 1
        0x5t
        0x31t
        0x70t
        -0x2t
        0x2t
        0x76t
        0x6t
        0x3dt
    .end array-data

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    :array_7
    .array-data 1
        0x6bt
        0x58t
        0x13t
        -0x6bt
        0x6ct
        0x17t
    .end array-data

    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    nop

    .line 321
    :array_8
    .array-data 1
        0x1ft
        -0x63t
        -0x73t
        -0x5et
        0x5ct
    .end array-data

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    nop

    .line 329
    :array_9
    .array-data 1
        0x6bt
        -0xct
        -0x7t
        -0x32t
        0x39t
        0x56t
    .end array-data
.end method
