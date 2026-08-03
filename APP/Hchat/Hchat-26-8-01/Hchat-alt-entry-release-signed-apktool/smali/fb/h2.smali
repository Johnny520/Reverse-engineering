.class public final Lfb/h2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Lfb/w;

.field public static final c:Lsf/i;

.field public static final d:Lfb/w;

.field public static final e:Lsf/i;

.field public static final f:Log/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfb/h2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Lfb/w;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, v1}, Lfb/w;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lfb/h2;->b:Lfb/w;

    .line 15
    .line 16
    new-instance v0, Lbi/c;

    .line 17
    .line 18
    const/16 v1, 0x15

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lbi/c;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lsf/i;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lsf/i;-><init>(Lfg/a;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lfb/h2;->c:Lsf/i;

    .line 29
    .line 30
    new-instance v0, Lfb/w;

    .line 31
    .line 32
    const/4 v1, 0x4

    .line 33
    invoke-direct {v0, v1}, Lfb/w;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lfb/h2;->d:Lfb/w;

    .line 37
    .line 38
    new-instance v0, Lbi/c;

    .line 39
    .line 40
    const/16 v1, 0x16

    .line 41
    .line 42
    invoke-direct {v0, v1}, Lbi/c;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lsf/i;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Lsf/i;-><init>(Lfg/a;)V

    .line 48
    .line 49
    .line 50
    sput-object v1, Lfb/h2;->e:Lsf/i;

    .line 51
    .line 52
    new-instance v0, Log/k;

    .line 53
    .line 54
    const-string v1, "(?:\\d{1,3}\\.){3}\\d{1,3}"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lfb/h2;->f:Log/k;

    .line 60
    .line 61
    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x258

    .line 2
    .line 3
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "[\u8054\u7f51\u641c\u7d22\u9519\u8bef] "

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "(?i)https?://[^\\s<>\"\']+"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-static {v0, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Log/i;->c()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/16 v0, 0xc

    .line 29
    .line 30
    new-array v0, v0, [C

    .line 31
    .line 32
    fill-array-data v0, :array_0

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v0}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    invoke-static {p0}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_0
    const/4 p0, 0x0

    .line 49
    return-object p0

    .line 50
    nop

    .line 51
    :array_0
    .array-data 2
        0x2es
        0x2cs
        0x3bs
        0x3as
        -0xf4s
        0x3002s
        -0xe5s
        -0xe6s
        0x29s
        -0xf7s
        0x5ds
        0x3011s
    .end array-data
.end method

.method public static c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    iget-object v2, v1, Lfb/b;->b:Ljava/util/Set;

    .line 4
    .line 5
    and-int/lit8 v0, p4, 0x4

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object/from16 v0, p2

    .line 13
    .line 14
    :goto_0
    const-string v3, ""

    .line 15
    .line 16
    invoke-static/range {p0 .. p0}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    if-eqz v4, :cond_13

    .line 21
    .line 22
    invoke-virtual {v4}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 27
    .line 28
    invoke-static {v6, v5, v6}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v6, "localhost"

    .line 33
    .line 34
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    const/4 v7, 0x0

    .line 39
    if-nez v6, :cond_2

    .line 40
    .line 41
    const-string v6, ".localhost"

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    invoke-static {v5, v6, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_2

    .line 49
    .line 50
    const-string v6, ".local"

    .line 51
    .line 52
    invoke-static {v5, v6, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-nez v6, :cond_2

    .line 57
    .line 58
    const-string v6, ".internal"

    .line 59
    .line 60
    invoke-static {v5, v6, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move-object v14, v7

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    :goto_1
    const-string v5, "\u62d2\u7edd\u8bbf\u95ee\u672c\u5730\u7f51\u7edc\u5730\u5740"

    .line 70
    .line 71
    move-object v14, v5

    .line 72
    :goto_2
    if-eqz v14, :cond_3

    .line 73
    .line 74
    new-instance v8, Lfb/c2;

    .line 75
    .line 76
    const/4 v13, 0x0

    .line 77
    const/16 v15, 0x1f

    .line 78
    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    invoke-direct/range {v8 .. v15}, Lfb/c2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    return-object v8

    .line 87
    :cond_3
    new-instance v5, Lokhttp3/Request$Builder;

    .line 88
    .line 89
    invoke-direct {v5}, Lokhttp3/Request$Builder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5, v4}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const-string v5, "User-Agent"

    .line 97
    .line 98
    const-string v6, "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36 Hchat-Plugin-Agent/1.1"

    .line 99
    .line 100
    invoke-virtual {v4, v5, v6}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    const-string v5, "Accept"

    .line 105
    .line 106
    const-string v6, "text/html,application/xhtml+xml,application/json,application/xml;q=0.9,text/plain;q=0.8,*/*;q=0.5"

    .line 107
    .line 108
    invoke-virtual {v4, v5, v6}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    const-string v5, "Accept-Language"

    .line 113
    .line 114
    const-string v6, "zh-CN,zh;q=0.9,en;q=0.6"

    .line 115
    .line 116
    invoke-virtual {v4, v5, v6}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_4

    .line 133
    .line 134
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    check-cast v5, Ljava/util/Map$Entry;

    .line 139
    .line 140
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    check-cast v6, Ljava/lang/String;

    .line 145
    .line 146
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    check-cast v5, Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v4, v6, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_4
    invoke-virtual {v4}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    sget-object v4, Lfb/h2;->e:Lsf/i;

    .line 165
    .line 166
    invoke-virtual {v4}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Lokhttp3/OkHttpClient;

    .line 171
    .line 172
    invoke-virtual {v4, v0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 173
    .line 174
    .line 175
    move-result-object v4

    .line 176
    invoke-virtual {v1, v4}, Lfb/b;->a(Lokhttp3/Call;)V

    .line 177
    .line 178
    .line 179
    :try_start_0
    invoke-interface {v4}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 180
    .line 181
    .line 182
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 183
    :try_start_1
    invoke-virtual {v1}, Lfb/b;->d()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5}, Lokhttp3/Response;->isSuccessful()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    const/4 v6, 0x2

    .line 191
    if-nez v0, :cond_b

    .line 192
    .line 193
    const-string v0, "Retry-After"

    .line 194
    .line 195
    invoke-static {v5, v0, v7, v6, v7}, Lokhttp3/Response;->header$default(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_5

    .line 200
    .line 201
    new-instance v8, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 204
    .line 205
    .line 206
    const-string v9, ", Retry-After="

    .line 207
    .line 208
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    goto :goto_4

    .line 219
    :catchall_0
    move-exception v0

    .line 220
    move-object v6, v0

    .line 221
    goto/16 :goto_8

    .line 222
    .line 223
    :cond_5
    move-object v0, v7

    .line 224
    :goto_4
    if-nez v0, :cond_6

    .line 225
    .line 226
    move-object v0, v3

    .line 227
    :cond_6
    const-string v8, "X-RateLimit-Remaining"

    .line 228
    .line 229
    invoke-static {v5, v8, v7, v6, v7}, Lokhttp3/Response;->header$default(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    if-eqz v8, :cond_9

    .line 234
    .line 235
    const-string v9, "X-RateLimit-Reset"

    .line 236
    .line 237
    invoke-static {v5, v9, v7, v6, v7}, Lokhttp3/Response;->header$default(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    if-eqz v6, :cond_7

    .line 242
    .line 243
    new-instance v7, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 246
    .line 247
    .line 248
    const-string v9, ", reset="

    .line 249
    .line 250
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    :cond_7
    if-nez v7, :cond_8

    .line 261
    .line 262
    move-object v7, v3

    .line 263
    :cond_8
    new-instance v6, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    const-string v9, ", rateLimitRemaining="

    .line 269
    .line 270
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    :cond_9
    if-nez v7, :cond_a

    .line 284
    .line 285
    move-object v7, v3

    .line 286
    :cond_a
    new-instance v8, Lfb/c2;

    .line 287
    .line 288
    invoke-virtual {v5}, Lokhttp3/Response;->code()I

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    invoke-virtual {v5}, Lokhttp3/Response;->request()Lokhttp3/Request;

    .line 293
    .line 294
    .line 295
    move-result-object v6

    .line 296
    invoke-virtual {v6}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    invoke-virtual {v6}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-virtual {v5}, Lokhttp3/Response;->code()I

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    new-instance v11, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    const-string v12, "HTTP "

    .line 314
    .line 315
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v14

    .line 331
    const/16 v15, 0x1c

    .line 332
    .line 333
    const/4 v11, 0x0

    .line 334
    const/4 v12, 0x0

    .line 335
    const/4 v13, 0x0

    .line 336
    invoke-direct/range {v8 .. v15}, Lfb/c2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_7

    .line 340
    .line 341
    :cond_b
    const-string v0, "Content-Type"

    .line 342
    .line 343
    invoke-static {v5, v0, v7, v6, v7}, Lokhttp3/Response;->header$default(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    if-nez v0, :cond_c

    .line 348
    .line 349
    move-object v9, v3

    .line 350
    goto :goto_5

    .line 351
    :cond_c
    move-object v9, v0

    .line 352
    :goto_5
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_f

    .line 357
    .line 358
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 359
    .line 360
    invoke-static {v0, v9, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    const-string v6, "text/"

    .line 365
    .line 366
    const/4 v7, 0x0

    .line 367
    invoke-static {v0, v6, v7}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 368
    .line 369
    .line 370
    move-result v6

    .line 371
    if-nez v6, :cond_d

    .line 372
    .line 373
    const-string v6, "json"

    .line 374
    .line 375
    invoke-static {v0, v6, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    if-nez v6, :cond_d

    .line 380
    .line 381
    const-string v6, "xml"

    .line 382
    .line 383
    invoke-static {v0, v6, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    if-nez v6, :cond_d

    .line 388
    .line 389
    const-string v6, "javascript"

    .line 390
    .line 391
    invoke-static {v0, v6, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 392
    .line 393
    .line 394
    move-result v6

    .line 395
    if-nez v6, :cond_d

    .line 396
    .line 397
    const-string v6, "markdown"

    .line 398
    .line 399
    invoke-static {v0, v6, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 400
    .line 401
    .line 402
    move-result v6

    .line 403
    if-nez v6, :cond_d

    .line 404
    .line 405
    const-string v6, "github.raw"

    .line 406
    .line 407
    invoke-static {v0, v6, v7}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 408
    .line 409
    .line 410
    move-result v0

    .line 411
    if-eqz v0, :cond_e

    .line 412
    .line 413
    :cond_d
    const/4 v7, 0x1

    .line 414
    :cond_e
    if-nez v7, :cond_f

    .line 415
    .line 416
    new-instance v6, Lfb/c2;

    .line 417
    .line 418
    invoke-virtual {v5}, Lokhttp3/Response;->code()I

    .line 419
    .line 420
    .line 421
    move-result v7

    .line 422
    invoke-virtual {v5}, Lokhttp3/Response;->request()Lokhttp3/Request;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    new-instance v0, Ljava/lang/StringBuilder;

    .line 435
    .line 436
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 437
    .line 438
    .line 439
    const-string v10, "\u54cd\u5e94\u7c7b\u578b\u4e0d\u53ef\u8bfb\u53d6: "

    .line 440
    .line 441
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    const/16 v13, 0x18

    .line 452
    .line 453
    const/4 v10, 0x0

    .line 454
    const/4 v11, 0x0

    .line 455
    invoke-direct/range {v6 .. v13}, Lfb/c2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    .line 456
    .line 457
    .line 458
    :goto_6
    move-object v8, v6

    .line 459
    goto :goto_7

    .line 460
    :cond_f
    invoke-virtual {v5}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    if-eqz v0, :cond_10

    .line 465
    .line 466
    move/from16 v6, p3

    .line 467
    .line 468
    invoke-static {v0, v6}, Lfb/h2;->n(Lokhttp3/ResponseBody;I)Lfb/e2;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    new-instance v6, Lfb/c2;

    .line 473
    .line 474
    invoke-virtual {v5}, Lokhttp3/Response;->code()I

    .line 475
    .line 476
    .line 477
    move-result v7

    .line 478
    invoke-virtual {v5}, Lokhttp3/Response;->request()Lokhttp3/Request;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    invoke-virtual {v8}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 483
    .line 484
    .line 485
    move-result-object v8

    .line 486
    invoke-virtual {v8}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v8

    .line 490
    iget-object v10, v0, Lfb/e2;->a:Ljava/lang/String;

    .line 491
    .line 492
    iget-boolean v11, v0, Lfb/e2;->b:Z

    .line 493
    .line 494
    const/4 v12, 0x0

    .line 495
    const/16 v13, 0x20

    .line 496
    .line 497
    invoke-direct/range {v6 .. v13}, Lfb/c2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    .line 498
    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_10
    new-instance v6, Lfb/c2;

    .line 502
    .line 503
    invoke-virtual {v5}, Lokhttp3/Response;->code()I

    .line 504
    .line 505
    .line 506
    move-result v7

    .line 507
    invoke-virtual {v5}, Lokhttp3/Response;->request()Lokhttp3/Request;

    .line 508
    .line 509
    .line 510
    move-result-object v0

    .line 511
    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v8

    .line 519
    const-string v12, "\u54cd\u5e94\u4e3a\u7a7a"

    .line 520
    .line 521
    const/16 v13, 0x18

    .line 522
    .line 523
    const/4 v10, 0x0

    .line 524
    const/4 v11, 0x0

    .line 525
    invoke-direct/range {v6 .. v13}, Lfb/c2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 526
    .line 527
    .line 528
    goto :goto_6

    .line 529
    :goto_7
    :try_start_2
    invoke-interface {v5}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 530
    .line 531
    .line 532
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    return-object v8

    .line 536
    :catchall_1
    move-exception v0

    .line 537
    goto :goto_9

    .line 538
    :goto_8
    :try_start_3
    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 539
    :catchall_2
    move-exception v0

    .line 540
    :try_start_4
    invoke-static {v5, v6}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 544
    :goto_9
    :try_start_5
    invoke-virtual {v1, v0}, Lfb/b;->b(Ljava/lang/Throwable;)Z

    .line 545
    .line 546
    .line 547
    move-result v1

    .line 548
    const/4 v5, 0x1

    .line 549
    if-eq v1, v5, :cond_12

    .line 550
    .line 551
    new-instance v6, Lfb/c2;

    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    if-nez v0, :cond_11

    .line 566
    .line 567
    goto :goto_a

    .line 568
    :cond_11
    move-object v3, v0

    .line 569
    :goto_a
    const/16 v0, 0xf0

    .line 570
    .line 571
    invoke-static {v0, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    new-instance v3, Ljava/lang/StringBuilder;

    .line 576
    .line 577
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    const-string v1, ": "

    .line 584
    .line 585
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v12

    .line 595
    const/16 v13, 0x1f

    .line 596
    .line 597
    const/4 v7, 0x0

    .line 598
    const/4 v8, 0x0

    .line 599
    const/4 v9, 0x0

    .line 600
    const/4 v10, 0x0

    .line 601
    const/4 v11, 0x0

    .line 602
    invoke-direct/range {v6 .. v13}, Lfb/c2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 603
    .line 604
    .line 605
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    return-object v6

    .line 612
    :catchall_3
    move-exception v0

    .line 613
    goto :goto_b

    .line 614
    :cond_12
    :try_start_6
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 615
    .line 616
    const-string v1, "Agent \u5df2\u4e2d\u65ad"

    .line 617
    .line 618
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 622
    :goto_b
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    throw v0

    .line 629
    :cond_13
    new-instance v5, Lfb/c2;

    .line 630
    .line 631
    const-string v11, "URL \u65e0\u6548"

    .line 632
    .line 633
    const/16 v12, 0x1f

    .line 634
    .line 635
    const/4 v6, 0x0

    .line 636
    const/4 v7, 0x0

    .line 637
    const/4 v8, 0x0

    .line 638
    const/4 v9, 0x0

    .line 639
    const/4 v10, 0x0

    .line 640
    invoke-direct/range {v5 .. v12}, Lfb/c2;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    .line 641
    .line 642
    .line 643
    return-object v5
.end method

.method public static d(Lfb/d2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "[GitHub \u6587\u4ef6]\n"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lfb/d2;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, Lfb/d2;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/16 v7, 0x3e

    .line 14
    .line 15
    const-string v3, "/"

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v2, p2

    .line 20
    invoke-static/range {v2 .. v7}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const-string v2, "\u8def\u5f84: "

    .line 25
    .line 26
    const-string v3, "/"

    .line 27
    .line 28
    invoke-static {v2, v1, v3, p0, v3}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 p0, 0xa

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p2, "\u5206\u652f: "

    .line 48
    .line 49
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    new-instance p0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string p1, "\u6765\u6e90: "

    .line 62
    .line 63
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p0, "\n\n"

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    if-eqz p5, :cond_0

    .line 85
    .line 86
    const-string p0, "\n[\u6587\u4ef6\u5185\u5bb9\u5df2\u622a\u65ad]\n"

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method

.method public static varargs e([Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 4

    .line 1
    const-string v0, "https://api.github.com"

    .line 2
    .line 3
    invoke-static {v0}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    array-length v1, p0

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-ge v2, v1, :cond_0

    .line 17
    .line 18
    aget-object v3, p0, v2

    .line 19
    .line 20
    invoke-virtual {v0, v3}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static f(Lfb/d2;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "https://raw.githubusercontent.com"

    .line 2
    .line 3
    invoke-static {v0}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lfb/d2;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object p0, p0, Lfb/d2;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, p1}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    if-eqz p2, :cond_0

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    check-cast p2, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p0, p2}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lfb/h2;->h(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "[\u7f51\u9875\u641c\u7d22\u7ed3\u679c]"

    .line 9
    .line 10
    invoke-static {p0, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    return v1
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Log/m;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "[\u8054\u7f51\u641c\u7d22\u9519\u8bef]"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public static i(Ljava/net/InetAddress;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/net/InetAddress;->isAnyLocalAddress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_c

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_c

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/net/InetAddress;->isLinkLocalAddress()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_c

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/net/InetAddress;->isSiteLocalAddress()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_c

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/net/InetAddress;->isMulticastAddress()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    const-string p0, ""

    .line 41
    .line 42
    :cond_1
    const/16 v0, 0x25

    .line 43
    .line 44
    invoke-static {p0, v0}, Log/m;->M0(Ljava/lang/String;C)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-array v0, v1, [C

    .line 49
    .line 50
    const/16 v2, 0x2e

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    aput-char v2, v0, v3

    .line 54
    .line 55
    const/4 v2, 0x6

    .line 56
    invoke-static {p0, v0, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v4, 0x4

    .line 65
    if-ne v2, v4, :cond_a

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_5

    .line 83
    .line 84
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v4}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    if-eqz v4, :cond_4

    .line 95
    .line 96
    move v4, v1

    .line 97
    goto :goto_0

    .line 98
    :cond_4
    move v4, v3

    .line 99
    :goto_0
    if-nez v4, :cond_3

    .line 100
    .line 101
    goto/16 :goto_3

    .line 102
    .line 103
    :cond_5
    :goto_1
    new-instance p0, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_6

    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    check-cast v2, Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_6
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, Ljava/lang/Number;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-eqz v0, :cond_c

    .line 161
    .line 162
    const/16 v2, 0xa

    .line 163
    .line 164
    if-eq v0, v2, :cond_c

    .line 165
    .line 166
    const/16 v2, 0x7f

    .line 167
    .line 168
    if-eq v0, v2, :cond_c

    .line 169
    .line 170
    const/16 v2, 0x64

    .line 171
    .line 172
    if-ne v0, v2, :cond_7

    .line 173
    .line 174
    const/16 v2, 0x40

    .line 175
    .line 176
    if-gt v2, p0, :cond_7

    .line 177
    .line 178
    const/16 v2, 0x80

    .line 179
    .line 180
    if-ge p0, v2, :cond_7

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_7
    const/16 v2, 0xa9

    .line 184
    .line 185
    if-ne v0, v2, :cond_8

    .line 186
    .line 187
    const/16 v2, 0xfe

    .line 188
    .line 189
    if-eq p0, v2, :cond_c

    .line 190
    .line 191
    :cond_8
    const/16 v2, 0xac

    .line 192
    .line 193
    if-ne v0, v2, :cond_9

    .line 194
    .line 195
    const/16 v2, 0x10

    .line 196
    .line 197
    if-gt v2, p0, :cond_9

    .line 198
    .line 199
    const/16 v2, 0x20

    .line 200
    .line 201
    if-ge p0, v2, :cond_9

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_9
    const/16 v2, 0xc0

    .line 205
    .line 206
    if-ne v0, v2, :cond_b

    .line 207
    .line 208
    const/16 v0, 0xa8

    .line 209
    .line 210
    if-ne p0, v0, :cond_b

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_a
    :goto_3
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 214
    .line 215
    invoke-static {v0, p0, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    const-string v0, "::1"

    .line 220
    .line 221
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-nez v0, :cond_c

    .line 226
    .line 227
    const-string v0, "fc"

    .line 228
    .line 229
    invoke-static {p0, v0, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-nez v0, :cond_c

    .line 234
    .line 235
    const-string v0, "fd"

    .line 236
    .line 237
    invoke-static {p0, v0, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 238
    .line 239
    .line 240
    move-result p0

    .line 241
    if-eqz p0, :cond_b

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_b
    return v3

    .line 245
    :cond_c
    :goto_4
    return v1
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/16 v0, 0xa0

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-static {p0, v0, v1}, Log/t;->b0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "[ \\t]+"

    .line 10
    .line 11
    const-string v1, " "

    .line 12
    .line 13
    invoke-static {v0, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "\n{3,}"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const-string v1, "\n\n"

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public static k(Ljava/lang/String;)Ljava/net/InetAddress;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/16 v2, 0x2e

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-char v2, v1, v3

    .line 8
    .line 9
    const/4 v2, 0x6

    .line 10
    invoke-static {p0, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v2}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_6

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    const/4 v2, 0x4

    .line 54
    if-ne p0, v2, :cond_6

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_4

    .line 72
    .line 73
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/Number;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-ltz v4, :cond_3

    .line 84
    .line 85
    const/16 v5, 0x100

    .line 86
    .line 87
    if-ge v4, v5, :cond_3

    .line 88
    .line 89
    move v4, v0

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    move v4, v3

    .line 92
    :goto_1
    if-nez v4, :cond_2

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_4
    :goto_2
    new-array p0, v2, [B

    .line 96
    .line 97
    :goto_3
    if-ge v3, v2, :cond_5

    .line 98
    .line 99
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    int-to-byte v0, v0

    .line 110
    aput-byte v0, p0, v3

    .line 111
    .line 112
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    invoke-static {p0}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0

    .line 120
    :cond_6
    :goto_4
    const/4 p0, 0x0

    .line 121
    return-object p0
.end method

.method public static l(Ljava/lang/String;Lfb/b;)Ljava/lang/String;
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x80000

    .line 3
    .line 4
    const/16 v2, 0x14

    .line 5
    .line 6
    invoke-static {p0, p1, v0, v1, v2}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v3, v1, Lfb/c2;->d:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v4, v1, Lfb/c2;->b:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v5, v1, Lfb/c2;->f:Ljava/lang/String;

    .line 15
    .line 16
    const-string v6, "\n\n"

    .line 17
    .line 18
    const-string v7, ""

    .line 19
    .line 20
    const/4 v8, 0x1

    .line 21
    const-string v9, "\u6765\u6e90: "

    .line 22
    .line 23
    const/4 v10, 0x0

    .line 24
    if-eqz v5, :cond_3

    .line 25
    .line 26
    const-string v0, "SSLHandshakeException"

    .line 27
    .line 28
    invoke-static {v5, v0, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    const-string v0, "UnknownHostException"

    .line 35
    .line 36
    invoke-static {v5, v0, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    const-string v0, "connection closed"

    .line 43
    .line 44
    invoke-static {v5, v0, v8}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    :cond_0
    invoke-static {p0, p1}, Lfb/h2;->q(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    :cond_1
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    const-string v0, "\u8bfb\u53d6\u9875\u9762\u5931\u8d25: "

    .line 59
    .line 60
    if-nez p1, :cond_2

    .line 61
    .line 62
    invoke-static {v7}, Lfb/h2;->h(Ljava/lang/String;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    new-instance p1, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, "\n\u5df2\u9644\u4e0a\u641c\u7d22\u5019\u9009\uff0c\u4e0d\u80fd\u5c06\u5176\u5f53\u4f5c\u7f51\u9875\u6b63\u6587\u3002\n"

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0

    .line 115
    :cond_2
    invoke-virtual {v0, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :cond_3
    iget-object p0, v1, Lfb/c2;->c:Ljava/lang/String;

    .line 125
    .line 126
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 127
    .line 128
    invoke-static {p1, p0, p1}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const-string p1, "json"

    .line 133
    .line 134
    invoke-static {p0, p1, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    const-string v1, "[\u7f51\u9875\u5185\u5bb9]\n"

    .line 139
    .line 140
    if-nez p1, :cond_10

    .line 141
    .line 142
    const-string p1, "xml"

    .line 143
    .line 144
    invoke-static {p0, p1, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-nez p1, :cond_10

    .line 149
    .line 150
    const-string p1, "text/plain"

    .line 151
    .line 152
    invoke-static {p0, p1, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_4

    .line 157
    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :cond_4
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_5

    .line 165
    .line 166
    const-string p1, "html"

    .line 167
    .line 168
    invoke-static {p0, p1, v10}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-nez p1, :cond_5

    .line 173
    .line 174
    const-string p1, "text/"

    .line 175
    .line 176
    invoke-static {p0, p1, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-nez p1, :cond_5

    .line 181
    .line 182
    const-string p1, "\u9875\u9762\u4e0d\u662f\u53ef\u8bfb\u53d6\u7684\u6587\u672c\u5185\u5bb9: "

    .line 183
    .line 184
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-static {p0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :cond_5
    const-string p0, "(?is)<(script|style|noscript|svg)[^>]*>.*?</\\1>"

    .line 194
    .line 195
    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    const-string p1, " "

    .line 203
    .line 204
    invoke-virtual {p0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {p0, p1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-static {p0, v10}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    const-string p1, "(?is)<title[^>]*>(.*?)</title>"

    .line 223
    .line 224
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {p1, v10, v3}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    if-eqz p1, :cond_6

    .line 243
    .line 244
    invoke-virtual {p1}, Log/i;->a()Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    invoke-static {v8, p1}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    check-cast p1, Ljava/lang/String;

    .line 253
    .line 254
    if-eqz p1, :cond_6

    .line 255
    .line 256
    invoke-static {p1, v10}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {p1}, Lfb/h2;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    :cond_6
    if-nez v0, :cond_7

    .line 272
    .line 273
    goto :goto_0

    .line 274
    :cond_7
    move-object v7, v0

    .line 275
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {p1}, Lfb/h2;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 284
    .line 285
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    const-class v5, Landroid/text/style/URLSpan;

    .line 293
    .line 294
    invoke-interface {p0, v10, v3, v5}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    array-length v5, v3

    .line 302
    move v6, v10

    .line 303
    :goto_1
    if-ge v6, v5, :cond_c

    .line 304
    .line 305
    aget-object v8, v3, v6

    .line 306
    .line 307
    check-cast v8, Landroid/text/style/URLSpan;

    .line 308
    .line 309
    invoke-virtual {v8}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-static {v11}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 317
    .line 318
    .line 319
    move-result-object v11

    .line 320
    if-eqz v11, :cond_b

    .line 321
    .line 322
    invoke-virtual {v11}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v11

    .line 326
    if-eqz v11, :cond_b

    .line 327
    .line 328
    const-string v12, "http://"

    .line 329
    .line 330
    invoke-static {v11, v12, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 331
    .line 332
    .line 333
    move-result v12

    .line 334
    if-nez v12, :cond_8

    .line 335
    .line 336
    const-string v12, "https://"

    .line 337
    .line 338
    invoke-static {v11, v12, v10}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 339
    .line 340
    .line 341
    move-result v12

    .line 342
    if-nez v12, :cond_8

    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_8
    invoke-interface {p0, v8}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 346
    .line 347
    .line 348
    move-result v12

    .line 349
    if-gez v12, :cond_9

    .line 350
    .line 351
    move v12, v10

    .line 352
    :cond_9
    invoke-interface {p0, v8}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 353
    .line 354
    .line 355
    move-result v8

    .line 356
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    if-le v8, v13, :cond_a

    .line 361
    .line 362
    move v8, v13

    .line 363
    :cond_a
    invoke-interface {p0, v12, v8}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 364
    .line 365
    .line 366
    move-result-object v8

    .line 367
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v8

    .line 371
    invoke-static {v8}, Lfb/h2;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    const/16 v12, 0xb4

    .line 376
    .line 377
    invoke-static {v12, v8}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    if-nez v12, :cond_b

    .line 386
    .line 387
    invoke-interface {v0, v11, v8}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    :cond_b
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 391
    .line 392
    goto :goto_1

    .line 393
    :cond_c
    new-instance p0, Ljava/util/ArrayList;

    .line 394
    .line 395
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    invoke-direct {p0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v3

    .line 414
    if-eqz v3, :cond_d

    .line 415
    .line 416
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    check-cast v3, Ljava/util/Map$Entry;

    .line 421
    .line 422
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    check-cast v5, Ljava/lang/String;

    .line 427
    .line 428
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    check-cast v3, Ljava/lang/String;

    .line 433
    .line 434
    new-instance v6, Lfb/f2;

    .line 435
    .line 436
    invoke-direct {v6, v3, v5}, Lfb/f2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    goto :goto_3

    .line 443
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 449
    .line 450
    .line 451
    move-result v1

    .line 452
    const/16 v3, 0xa

    .line 453
    .line 454
    if-nez v1, :cond_e

    .line 455
    .line 456
    const/16 v1, 0x190

    .line 457
    .line 458
    invoke-static {v1, v7}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    const-string v5, "\u6807\u9898: "

    .line 463
    .line 464
    invoke-virtual {v5, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    :cond_e
    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 482
    .line 483
    .line 484
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    if-nez v1, :cond_f

    .line 489
    .line 490
    const-string v1, "\u94fe\u63a5:\n"

    .line 491
    .line 492
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-static {v2, p0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object p0

    .line 499
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    if-eqz v1, :cond_f

    .line 508
    .line 509
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    check-cast v1, Lfb/f2;

    .line 514
    .line 515
    iget-object v2, v1, Lfb/f2;->a:Ljava/lang/String;

    .line 516
    .line 517
    iget-object v1, v1, Lfb/f2;->b:Ljava/lang/String;

    .line 518
    .line 519
    new-instance v4, Ljava/lang/StringBuilder;

    .line 520
    .line 521
    const-string v5, "- "

    .line 522
    .line 523
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    const-string v2, ": "

    .line 530
    .line 531
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    goto :goto_4

    .line 548
    :cond_f
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object p0

    .line 558
    return-object p0

    .line 559
    :cond_10
    :goto_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object p1

    .line 568
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    invoke-virtual {p0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    invoke-static {v3}, Lfb/h2;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object p1

    .line 578
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    .line 580
    .line 581
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    return-object p0
.end method

.method public static m(Lfb/d2;Ljava/lang/String;Lfb/b;)Ljava/lang/String;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    iget-object v4, v1, Lfb/d2;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v7, v1, Lfb/d2;->b:Ljava/lang/String;

    .line 10
    .line 11
    const-string v5, "repos"

    .line 12
    .line 13
    filled-new-array {v5, v4, v7}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lfb/h2;->e([Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v11, "Accept"

    .line 26
    .line 27
    const-string v12, "application/vnd.github+json"

    .line 28
    .line 29
    invoke-static {v11, v12}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const v8, 0x18000

    .line 37
    .line 38
    .line 39
    const/16 v13, 0x10

    .line 40
    .line 41
    invoke-static {v0, v3, v6, v8, v13}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v6, v0, Lfb/c2;->f:Ljava/lang/String;

    .line 46
    .line 47
    const-string v14, "\u5730\u5740: "

    .line 48
    .line 49
    const-string v15, "/"

    .line 50
    .line 51
    const-string v10, "\u4ed3\u5e93: "

    .line 52
    .line 53
    const-string v13, "[GitHub \u4ed3\u5e93]\n"

    .line 54
    .line 55
    const-string v16, "README.md"

    .line 56
    .line 57
    const-string v8, "main"

    .line 58
    .line 59
    if-eqz v6, :cond_6

    .line 60
    .line 61
    const-string v0, "master"

    .line 62
    .line 63
    filled-new-array {v8, v0}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/String;

    .line 86
    .line 87
    invoke-static/range {v16 .. v16}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-static {v1, v5, v8}, Lfb/h2;->f(Lfb/d2;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    const/4 v9, 0x0

    .line 96
    const/16 v11, 0x14

    .line 97
    .line 98
    const v12, 0x28000

    .line 99
    .line 100
    .line 101
    invoke-static {v8, v3, v9, v12, v11}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    iget-object v9, v8, Lfb/c2;->f:Ljava/lang/String;

    .line 106
    .line 107
    if-nez v9, :cond_1

    .line 108
    .line 109
    iget-object v9, v8, Lfb/c2;->d:Ljava/lang/String;

    .line 110
    .line 111
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-nez v9, :cond_1

    .line 116
    .line 117
    move-object v9, v8

    .line 118
    goto :goto_0

    .line 119
    :cond_1
    const/4 v9, 0x0

    .line 120
    :goto_0
    if-eqz v9, :cond_2

    .line 121
    .line 122
    iget-object v8, v9, Lfb/c2;->d:Ljava/lang/String;

    .line 123
    .line 124
    new-instance v9, Lsf/e;

    .line 125
    .line 126
    invoke-direct {v9, v5, v8}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_2
    const/4 v9, 0x0

    .line 131
    :goto_1
    if-eqz v9, :cond_0

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    const/4 v9, 0x0

    .line 135
    :goto_2
    if-eqz v9, :cond_4

    .line 136
    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v1, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    const/16 v1, 0xa

    .line 164
    .line 165
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    new-instance v3, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v3, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget-object v2, v9, Lsf/e;->g:Ljava/lang/Object;

    .line 187
    .line 188
    new-instance v3, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    const-string v4, "\u9ed8\u8ba4\u5206\u652f\u5019\u9009: "

    .line 191
    .line 192
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v1, "GitHub API: "

    .line 209
    .line 210
    invoke-virtual {v1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v1, "\n\n[README]\n"

    .line 218
    .line 219
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    iget-object v1, v9, Lsf/e;->h:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v1, Ljava/lang/String;

    .line 225
    .line 226
    invoke-static {v1}, Lfb/h2;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    return-object v0

    .line 238
    :cond_4
    invoke-static/range {p1 .. p2}, Lfb/h2;->l(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-static {v0}, Lfb/h2;->h(Ljava/lang/String;)Z

    .line 243
    .line 244
    .line 245
    move-result v1

    .line 246
    if-eqz v1, :cond_5

    .line 247
    .line 248
    const-string v1, "[\u8054\u7f51\u641c\u7d22\u9519\u8bef]"

    .line 249
    .line 250
    invoke-static {v0, v1}, Log/m;->A0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    new-instance v1, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    const-string v2, "\u8bfb\u53d6 GitHub \u4ed3\u5e93\u5931\u8d25: "

    .line 265
    .line 266
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v2, "\uff1b"

    .line 273
    .line 274
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :cond_5
    const-string v1, "\n\nGitHub API: "

    .line 290
    .line 291
    invoke-static {v0, v1, v6}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    return-object v0

    .line 296
    :cond_6
    const/16 v19, 0xa

    .line 297
    .line 298
    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    .line 299
    .line 300
    iget-object v0, v0, Lfb/c2;->d:Ljava/lang/String;

    .line 301
    .line 302
    invoke-direct {v6, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 303
    .line 304
    .line 305
    :goto_3
    move-object v9, v6

    .line 306
    goto :goto_4

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    new-instance v6, Lsf/f;

    .line 309
    .line 310
    invoke-direct {v6, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 311
    .line 312
    .line 313
    goto :goto_3

    .line 314
    :goto_4
    instance-of v0, v9, Lsf/f;

    .line 315
    .line 316
    if-eqz v0, :cond_7

    .line 317
    .line 318
    const/4 v9, 0x0

    .line 319
    :cond_7
    move-object v0, v9

    .line 320
    check-cast v0, Lorg/json/JSONObject;

    .line 321
    .line 322
    if-eqz v0, :cond_1b

    .line 323
    .line 324
    const-string v6, "default_branch"

    .line 325
    .line 326
    invoke-virtual {v0, v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v6

    .line 330
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 331
    .line 332
    .line 333
    move-result v9

    .line 334
    if-eqz v9, :cond_8

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_8
    move-object v8, v6

    .line 338
    :goto_5
    const-string v6, "readme"

    .line 339
    .line 340
    filled-new-array {v5, v4, v7, v6}, [Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-static {v5}, Lfb/h2;->e([Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    invoke-virtual {v5}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    new-instance v6, Lsf/e;

    .line 353
    .line 354
    const-string v9, "application/vnd.github.raw"

    .line 355
    .line 356
    invoke-direct {v6, v11, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    new-instance v9, Lsf/e;

    .line 360
    .line 361
    move-object/from16 v20, v7

    .line 362
    .line 363
    const-string v7, "X-GitHub-Api-Version"

    .line 364
    .line 365
    move-object/from16 v21, v10

    .line 366
    .line 367
    const-string v10, "2022-11-28"

    .line 368
    .line 369
    invoke-direct {v9, v7, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    filled-new-array {v6, v9}, [Lsf/e;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    invoke-static {v6}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    const v7, 0x28000

    .line 381
    .line 382
    .line 383
    const/16 v9, 0x10

    .line 384
    .line 385
    invoke-static {v5, v3, v6, v7, v9}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    iget-object v6, v5, Lfb/c2;->f:Ljava/lang/String;

    .line 390
    .line 391
    if-nez v6, :cond_9

    .line 392
    .line 393
    const/4 v9, 0x0

    .line 394
    goto :goto_7

    .line 395
    :cond_9
    invoke-static/range {v16 .. v16}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 396
    .line 397
    .line 398
    move-result-object v6

    .line 399
    invoke-static {v1, v8, v6}, Lfb/h2;->f(Lfb/d2;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    const/4 v9, 0x0

    .line 404
    const/16 v10, 0x14

    .line 405
    .line 406
    invoke-static {v6, v3, v9, v7, v10}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    iget-object v7, v6, Lfb/c2;->f:Ljava/lang/String;

    .line 411
    .line 412
    if-nez v7, :cond_a

    .line 413
    .line 414
    iget-object v7, v6, Lfb/c2;->d:Ljava/lang/String;

    .line 415
    .line 416
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-nez v7, :cond_a

    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_a
    move-object v6, v9

    .line 424
    :goto_6
    if-eqz v6, :cond_b

    .line 425
    .line 426
    move-object v5, v6

    .line 427
    :cond_b
    :goto_7
    iget-object v6, v5, Lfb/c2;->d:Ljava/lang/String;

    .line 428
    .line 429
    iget-object v5, v5, Lfb/c2;->f:Ljava/lang/String;

    .line 430
    .line 431
    iget-object v1, v1, Lfb/d2;->a:Ljava/lang/String;

    .line 432
    .line 433
    move-object v10, v8

    .line 434
    const-string v8, "git"

    .line 435
    .line 436
    move-object/from16 v18, v9

    .line 437
    .line 438
    const-string v9, "trees"

    .line 439
    .line 440
    move-object v7, v5

    .line 441
    const-string v5, "repos"

    .line 442
    .line 443
    move-object/from16 p0, v6

    .line 444
    .line 445
    move-object/from16 v16, v7

    .line 446
    .line 447
    move-object/from16 v17, v14

    .line 448
    .line 449
    move/from16 v14, v19

    .line 450
    .line 451
    move-object/from16 v7, v20

    .line 452
    .line 453
    move-object v6, v1

    .line 454
    move-object/from16 v1, v21

    .line 455
    .line 456
    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    invoke-static {v5}, Lfb/h2;->e([Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    invoke-virtual {v5}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 465
    .line 466
    .line 467
    move-result-object v5

    .line 468
    const-string v6, "recursive"

    .line 469
    .line 470
    const-string v8, "1"

    .line 471
    .line 472
    invoke-virtual {v5, v6, v8}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 473
    .line 474
    .line 475
    move-result-object v5

    .line 476
    invoke-virtual {v5}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    invoke-virtual {v5}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v5

    .line 484
    invoke-static {v11, v12}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 485
    .line 486
    .line 487
    move-result-object v6

    .line 488
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    const/high16 v8, 0x60000

    .line 492
    .line 493
    const/16 v9, 0x10

    .line 494
    .line 495
    invoke-static {v5, v3, v6, v8, v9}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 496
    .line 497
    .line 498
    move-result-object v3

    .line 499
    iget-object v5, v3, Lfb/c2;->d:Ljava/lang/String;

    .line 500
    .line 501
    iget-object v3, v3, Lfb/c2;->f:Ljava/lang/String;

    .line 502
    .line 503
    new-instance v6, Ljava/lang/StringBuilder;

    .line 504
    .line 505
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    new-instance v8, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    const-string v7, "full_name"

    .line 527
    .line 528
    invoke-virtual {v0, v7, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    new-instance v7, Ljava/lang/StringBuilder;

    .line 533
    .line 534
    invoke-direct {v7, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    const-string v1, "html_url"

    .line 551
    .line 552
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    new-instance v4, Ljava/lang/StringBuilder;

    .line 557
    .line 558
    move-object/from16 v7, v17

    .line 559
    .line 560
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    const-string v1, "description"

    .line 577
    .line 578
    const-string v4, ""

    .line 579
    .line 580
    invoke-static {v1, v4, v0}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v9

    .line 584
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    if-nez v1, :cond_c

    .line 589
    .line 590
    goto :goto_8

    .line 591
    :cond_c
    move-object/from16 v9, v18

    .line 592
    .line 593
    :goto_8
    if-eqz v9, :cond_d

    .line 594
    .line 595
    const/16 v1, 0x3e8

    .line 596
    .line 597
    invoke-static {v1, v9}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    const-string v7, "\u7b80\u4ecb: "

    .line 602
    .line 603
    invoke-virtual {v7, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 611
    .line 612
    .line 613
    :cond_d
    const-string v1, "\u9ed8\u8ba4\u5206\u652f: "

    .line 614
    .line 615
    invoke-virtual {v1, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    const-string v1, "language"

    .line 626
    .line 627
    invoke-virtual {v0, v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 628
    .line 629
    .line 630
    move-result-object v9

    .line 631
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    if-nez v1, :cond_e

    .line 639
    .line 640
    goto :goto_9

    .line 641
    :cond_e
    move-object/from16 v9, v18

    .line 642
    .line 643
    :goto_9
    if-eqz v9, :cond_f

    .line 644
    .line 645
    const-string v1, "\u4e3b\u8981\u8bed\u8a00: "

    .line 646
    .line 647
    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    :cond_f
    const-string v1, "stargazers_count"

    .line 658
    .line 659
    const/4 v7, 0x0

    .line 660
    invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    const-string v8, "forks_count"

    .line 665
    .line 666
    invoke-virtual {v0, v8, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 667
    .line 668
    .line 669
    move-result v0

    .line 670
    new-instance v8, Ljava/lang/StringBuilder;

    .line 671
    .line 672
    const-string v9, "Stars: "

    .line 673
    .line 674
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 678
    .line 679
    .line 680
    const-string v1, "\uff0cForks: "

    .line 681
    .line 682
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 686
    .line 687
    .line 688
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 696
    .line 697
    .line 698
    new-instance v0, Ljava/lang/StringBuilder;

    .line 699
    .line 700
    const-string v1, "\u6765\u6e90: "

    .line 701
    .line 702
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    .line 707
    .line 708
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    .line 718
    if-nez v16, :cond_10

    .line 719
    .line 720
    invoke-static/range {p0 .. p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 721
    .line 722
    .line 723
    move-result v0

    .line 724
    if-nez v0, :cond_10

    .line 725
    .line 726
    const-string v0, "\n[README]\n"

    .line 727
    .line 728
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    .line 730
    .line 731
    invoke-static/range {p0 .. p0}, Lfb/h2;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 739
    .line 740
    .line 741
    :cond_10
    if-nez v3, :cond_18

    .line 742
    .line 743
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    if-nez v0, :cond_18

    .line 748
    .line 749
    const-string v0, "\n[\u6587\u4ef6\u6811]\n"

    .line 750
    .line 751
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    .line 755
    .line 756
    invoke-direct {v0, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 757
    .line 758
    .line 759
    move-object v9, v0

    .line 760
    goto :goto_a

    .line 761
    :catchall_1
    move-exception v0

    .line 762
    new-instance v1, Lsf/f;

    .line 763
    .line 764
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 765
    .line 766
    .line 767
    move-object v9, v1

    .line 768
    :goto_a
    instance-of v0, v9, Lsf/f;

    .line 769
    .line 770
    if-eqz v0, :cond_11

    .line 771
    .line 772
    move-object/from16 v9, v18

    .line 773
    .line 774
    :cond_11
    check-cast v9, Lorg/json/JSONObject;

    .line 775
    .line 776
    if-eqz v9, :cond_17

    .line 777
    .line 778
    const-string v0, "tree"

    .line 779
    .line 780
    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    if-eqz v0, :cond_16

    .line 785
    .line 786
    new-instance v1, Ljava/lang/StringBuilder;

    .line 787
    .line 788
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    const/16 v5, 0x320

    .line 796
    .line 797
    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    .line 798
    .line 799
    .line 800
    move-result v2

    .line 801
    move v8, v7

    .line 802
    :goto_b
    if-lt v8, v2, :cond_14

    .line 803
    .line 804
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    if-gt v0, v5, :cond_12

    .line 809
    .line 810
    const-string v0, "truncated"

    .line 811
    .line 812
    invoke-virtual {v9, v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 813
    .line 814
    .line 815
    move-result v0

    .line 816
    if-eqz v0, :cond_13

    .line 817
    .line 818
    :cond_12
    const-string v0, "... \u6587\u4ef6\u6811\u8fc7\u957f\uff0c\u4ee5\u4e0a\u4e3a\u524d 800 \u9879\n"

    .line 819
    .line 820
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    :cond_13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    invoke-static {v0}, Log/m;->T0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v0

    .line 835
    goto :goto_c

    .line 836
    :cond_14
    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 837
    .line 838
    .line 839
    move-result-object v10

    .line 840
    if-eqz v10, :cond_15

    .line 841
    .line 842
    const-string v11, "type"

    .line 843
    .line 844
    const-string v12, "blob"

    .line 845
    .line 846
    invoke-virtual {v10, v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v11

    .line 850
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    const-string v11, " "

    .line 854
    .line 855
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 856
    .line 857
    .line 858
    const-string v11, "path"

    .line 859
    .line 860
    invoke-virtual {v10, v11, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v10

    .line 864
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 868
    .line 869
    .line 870
    :cond_15
    add-int/lit8 v8, v8, 0x1

    .line 871
    .line 872
    goto :goto_b

    .line 873
    :cond_16
    const-string v0, "\u6587\u4ef6\u6811\u4e3a\u7a7a"

    .line 874
    .line 875
    goto :goto_c

    .line 876
    :cond_17
    const-string v0, "\u6587\u4ef6\u6811 JSON \u65e0\u6cd5\u89e3\u6790"

    .line 877
    .line 878
    :goto_c
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    :cond_18
    if-eqz v16, :cond_19

    .line 885
    .line 886
    const-string v0, "README: "

    .line 887
    .line 888
    move-object/from16 v7, v16

    .line 889
    .line 890
    invoke-virtual {v0, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 895
    .line 896
    .line 897
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 898
    .line 899
    .line 900
    :cond_19
    if-eqz v3, :cond_1a

    .line 901
    .line 902
    const-string v0, "\u6587\u4ef6\u6811: "

    .line 903
    .line 904
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    .line 910
    .line 911
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    :cond_1a
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    return-object v0

    .line 919
    :cond_1b
    const-string v0, "GitHub \u4ed3\u5e93\u8fd4\u56de\u7684 JSON \u65e0\u6cd5\u89e3\u6790"

    .line 920
    .line 921
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    return-object v0
.end method

.method public static n(Lokhttp3/ResponseBody;I)Lfb/e2;
    .locals 7

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    const/high16 v1, 0x10000

    .line 4
    .line 5
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/16 v2, 0x2000

    .line 17
    .line 18
    :try_start_0
    new-array v3, v2, [B

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    move v5, v4

    .line 22
    :goto_0
    if-ge v5, p1, :cond_1

    .line 23
    .line 24
    sub-int v6, p1, v5

    .line 25
    .line 26
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v1, v3, v4, v6}, Ljava/io/InputStream;->read([BII)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-gtz v6, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-virtual {v0, v3, v4, v6}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 38
    .line 39
    .line 40
    add-int/2addr v5, v6

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    :goto_1
    if-lt v5, p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    .line 47
    .line 48
    .line 49
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    const/4 v2, -0x1

    .line 51
    if-eq p1, v2, :cond_2

    .line 52
    .line 53
    const/4 v4, 0x1

    .line 54
    :cond_2
    const/4 p1, 0x0

    .line 55
    invoke-static {v1, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lokhttp3/ResponseBody;->contentType()Lokhttp3/MediaType;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lokhttp3/MediaType;->charset(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-eqz p0, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 74
    .line 75
    :goto_2
    new-instance p1, Lfb/e2;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v1, Ljava/lang/String;

    .line 88
    .line 89
    invoke-direct {v1, v0, p0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 90
    .line 91
    .line 92
    invoke-direct {p1, v1, v4}, Lfb/e2;-><init>(Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :goto_3
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    :catchall_1
    move-exception p1

    .line 98
    invoke-static {v1, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw p1
.end method

.method public static o(Ljava/lang/String;Lfb/b;)Ljava/lang/String;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-static/range {p0 .. p0}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_19

    .line 8
    .line 9
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-static {v3, v2, v3}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "github.com"

    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    const-string v3, "www.github.com"

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_17

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->pathSegments()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    move-object v6, v5

    .line 59
    check-cast v6, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-nez v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    const/4 v5, 0x2

    .line 76
    if-lt v3, v5, :cond_17

    .line 77
    .line 78
    new-instance v6, Lfb/d2;

    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    check-cast v7, Ljava/lang/String;

    .line 86
    .line 87
    const/4 v8, 0x1

    .line 88
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    check-cast v8, Ljava/lang/String;

    .line 93
    .line 94
    const-string v9, ".git"

    .line 95
    .line 96
    invoke-static {v8, v9}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    invoke-direct {v6, v7, v8}, Lfb/d2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v5, v4}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Ljava/lang/String;

    .line 108
    .line 109
    if-eqz v5, :cond_3

    .line 110
    .line 111
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 112
    .line 113
    invoke-static {v10, v5, v10}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    goto :goto_1

    .line 118
    :cond_3
    const/4 v5, 0x0

    .line 119
    :goto_1
    const-string v10, "blob"

    .line 120
    .line 121
    invoke-static {v5, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    const-string v12, "Accept"

    .line 126
    .line 127
    const-string v13, "ref"

    .line 128
    .line 129
    const-string v14, "contents"

    .line 130
    .line 131
    const-string v15, "repos"

    .line 132
    .line 133
    const/4 v3, 0x4

    .line 134
    const/4 v11, 0x3

    .line 135
    const-string v9, ""

    .line 136
    .line 137
    if-eqz v10, :cond_d

    .line 138
    .line 139
    invoke-static {v11, v4}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    check-cast v5, Ljava/lang/String;

    .line 144
    .line 145
    if-nez v5, :cond_4

    .line 146
    .line 147
    move-object v5, v9

    .line 148
    :cond_4
    invoke-static {v3, v4}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    if-nez v4, :cond_17

    .line 157
    .line 158
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-nez v4, :cond_17

    .line 163
    .line 164
    move-object v10, v9

    .line 165
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    filled-new-array {v15, v7, v8, v14}, [Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Lfb/h2;->e([Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v4

    .line 189
    if-eqz v4, :cond_5

    .line 190
    .line 191
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    check-cast v4, Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v1, v4}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 198
    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_5
    invoke-virtual {v1, v13, v5}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-static {v6, v5, v3}, Lfb/h2;->f(Lfb/d2;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    const/16 v4, 0x14

    .line 218
    .line 219
    const/high16 v7, 0x80000

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    invoke-static {v2, v0, v8, v7, v4}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    move-object v4, v10

    .line 227
    iget-object v10, v2, Lfb/c2;->d:Ljava/lang/String;

    .line 228
    .line 229
    iget-object v11, v2, Lfb/c2;->f:Ljava/lang/String;

    .line 230
    .line 231
    if-nez v11, :cond_6

    .line 232
    .line 233
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    if-nez v13, :cond_6

    .line 238
    .line 239
    iget-boolean v11, v2, Lfb/c2;->e:Z

    .line 240
    .line 241
    move-object v8, v3

    .line 242
    move-object v7, v5

    .line 243
    invoke-static/range {v6 .. v11}, Lfb/h2;->d(Lfb/d2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    return-object v0

    .line 248
    :cond_6
    move-object/from16 v16, v8

    .line 249
    .line 250
    move-object v8, v3

    .line 251
    const-string v2, "application/vnd.github.raw"

    .line 252
    .line 253
    invoke-static {v12, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    const/16 v3, 0x10

    .line 261
    .line 262
    invoke-static {v1, v0, v2, v7, v3}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iget-object v0, v1, Lfb/c2;->f:Ljava/lang/String;

    .line 267
    .line 268
    if-eqz v0, :cond_8

    .line 269
    .line 270
    if-eqz v11, :cond_7

    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_7
    const-string v11, "raw \u6587\u4ef6\u4e3a\u7a7a"

    .line 274
    .line 275
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    const-string v2, "\u8bfb\u53d6 GitHub \u6587\u4ef6\u5931\u8d25: "

    .line 278
    .line 279
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    const-string v2, "\uff1b"

    .line 286
    .line 287
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    return-object v0

    .line 302
    :cond_8
    iget-object v2, v1, Lfb/c2;->d:Ljava/lang/String;

    .line 303
    .line 304
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 305
    .line 306
    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :catchall_0
    move-exception v0

    .line 311
    new-instance v3, Lsf/f;

    .line 312
    .line 313
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    move-object v0, v3

    .line 317
    :goto_4
    nop

    .line 318
    instance-of v3, v0, Lsf/f;

    .line 319
    .line 320
    if-eqz v3, :cond_9

    .line 321
    .line 322
    move-object/from16 v0, v16

    .line 323
    .line 324
    :cond_9
    check-cast v0, Lorg/json/JSONObject;

    .line 325
    .line 326
    if-eqz v0, :cond_c

    .line 327
    .line 328
    const-string v3, "content"

    .line 329
    .line 330
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    const-string v3, "\\s+"

    .line 338
    .line 339
    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    if-eqz v3, :cond_a

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_a
    const/4 v10, 0x0

    .line 365
    :try_start_1
    invoke-static {v0, v10}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 370
    .line 371
    .line 372
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 373
    .line 374
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 375
    .line 376
    .line 377
    new-instance v4, Ljava/lang/String;

    .line 378
    .line 379
    invoke-direct {v4, v0, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 380
    .line 381
    .line 382
    goto :goto_5

    .line 383
    :catchall_1
    move-exception v0

    .line 384
    new-instance v4, Lsf/f;

    .line 385
    .line 386
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 387
    .line 388
    .line 389
    :goto_5
    instance-of v0, v4, Lsf/f;

    .line 390
    .line 391
    if-eqz v0, :cond_b

    .line 392
    .line 393
    goto :goto_6

    .line 394
    :cond_b
    move-object v2, v4

    .line 395
    :goto_6
    check-cast v2, Ljava/lang/String;

    .line 396
    .line 397
    :cond_c
    :goto_7
    move-object v10, v2

    .line 398
    iget-boolean v11, v1, Lfb/c2;->e:Z

    .line 399
    .line 400
    move-object v7, v5

    .line 401
    invoke-static/range {v6 .. v11}, Lfb/h2;->d(Lfb/d2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    return-object v0

    .line 406
    :cond_d
    move-object/from16 v16, v9

    .line 407
    .line 408
    move-object v9, v6

    .line 409
    move-object/from16 v6, v16

    .line 410
    .line 411
    const/16 v16, 0x0

    .line 412
    .line 413
    const-string v10, "tree"

    .line 414
    .line 415
    invoke-static {v5, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    move-result v10

    .line 419
    if-eqz v10, :cond_16

    .line 420
    .line 421
    invoke-static {v11, v4}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v5

    .line 425
    check-cast v5, Ljava/lang/String;

    .line 426
    .line 427
    if-nez v5, :cond_e

    .line 428
    .line 429
    move-object v5, v6

    .line 430
    :cond_e
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 431
    .line 432
    .line 433
    move-result v10

    .line 434
    if-nez v10, :cond_17

    .line 435
    .line 436
    invoke-static {v3, v4}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 437
    .line 438
    .line 439
    move-result-object v17

    .line 440
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    filled-new-array {v15, v7, v8, v14}, [Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v2

    .line 448
    invoke-static {v2}, Lfb/h2;->e([Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    if-eqz v4, :cond_f

    .line 465
    .line 466
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    check-cast v4, Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v2, v4}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 473
    .line 474
    .line 475
    goto :goto_8

    .line 476
    :cond_f
    invoke-virtual {v2, v13, v5}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 477
    .line 478
    .line 479
    move-result-object v2

    .line 480
    invoke-virtual {v2}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 481
    .line 482
    .line 483
    move-result-object v2

    .line 484
    invoke-virtual {v2}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    const-string v3, "application/vnd.github+json"

    .line 489
    .line 490
    invoke-static {v12, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    const/high16 v4, 0x60000

    .line 498
    .line 499
    const/16 v7, 0x10

    .line 500
    .line 501
    invoke-static {v2, v0, v3, v4, v7}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    iget-object v3, v2, Lfb/c2;->f:Ljava/lang/String;

    .line 506
    .line 507
    if-eqz v3, :cond_11

    .line 508
    .line 509
    invoke-static {v1, v0}, Lfb/h2;->l(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-static {v0}, Lfb/h2;->h(Ljava/lang/String;)Z

    .line 514
    .line 515
    .line 516
    move-result v1

    .line 517
    if-eqz v1, :cond_10

    .line 518
    .line 519
    const-string v0, "\u8bfb\u53d6 GitHub \u76ee\u5f55\u5931\u8d25: "

    .line 520
    .line 521
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    return-object v0

    .line 530
    :cond_10
    const-string v1, "\n\nGitHub \u76ee\u5f55 API: "

    .line 531
    .line 532
    invoke-static {v0, v1, v3}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    return-object v0

    .line 537
    :cond_11
    :try_start_2
    new-instance v0, Lorg/json/JSONArray;

    .line 538
    .line 539
    iget-object v2, v2, Lfb/c2;->d:Ljava/lang/String;

    .line 540
    .line 541
    invoke-direct {v0, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 542
    .line 543
    .line 544
    goto :goto_9

    .line 545
    :catchall_2
    move-exception v0

    .line 546
    new-instance v2, Lsf/f;

    .line 547
    .line 548
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 549
    .line 550
    .line 551
    move-object v0, v2

    .line 552
    :goto_9
    nop

    .line 553
    instance-of v2, v0, Lsf/f;

    .line 554
    .line 555
    if-eqz v2, :cond_12

    .line 556
    .line 557
    move-object/from16 v0, v16

    .line 558
    .line 559
    :cond_12
    check-cast v0, Lorg/json/JSONArray;

    .line 560
    .line 561
    if-eqz v0, :cond_15

    .line 562
    .line 563
    new-instance v2, Ljava/lang/StringBuilder;

    .line 564
    .line 565
    const-string v3, "[GitHub \u76ee\u5f55]\n"

    .line 566
    .line 567
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 568
    .line 569
    .line 570
    const/16 v21, 0x0

    .line 571
    .line 572
    const/16 v22, 0x3e

    .line 573
    .line 574
    const-string v18, "/"

    .line 575
    .line 576
    const/16 v19, 0x0

    .line 577
    .line 578
    const/16 v20, 0x0

    .line 579
    .line 580
    invoke-static/range {v17 .. v22}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    const-string v4, "\u8def\u5f84: "

    .line 585
    .line 586
    iget-object v7, v9, Lfb/d2;->a:Ljava/lang/String;

    .line 587
    .line 588
    const-string v9, "/"

    .line 589
    .line 590
    invoke-static {v4, v7, v9, v8, v9}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v3

    .line 601
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    const/16 v3, 0xa

    .line 605
    .line 606
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    const-string v4, "\u5206\u652f: "

    .line 610
    .line 611
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v4

    .line 615
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    new-instance v4, Ljava/lang/StringBuilder;

    .line 622
    .line 623
    const-string v5, "\u6765\u6e90: "

    .line 624
    .line 625
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    const/16 v4, 0x320

    .line 646
    .line 647
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    const/4 v4, 0x0

    .line 652
    :goto_a
    if-lt v4, v1, :cond_13

    .line 653
    .line 654
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    goto :goto_b

    .line 659
    :cond_13
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 660
    .line 661
    .line 662
    move-result-object v5

    .line 663
    if-eqz v5, :cond_14

    .line 664
    .line 665
    const-string v7, "type"

    .line 666
    .line 667
    const-string v8, "file"

    .line 668
    .line 669
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v7

    .line 673
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 674
    .line 675
    .line 676
    const-string v7, " "

    .line 677
    .line 678
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    const-string v7, "path"

    .line 682
    .line 683
    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v5

    .line 687
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 694
    .line 695
    goto :goto_a

    .line 696
    :cond_15
    const-string v0, "GitHub \u76ee\u5f55\u8fd4\u56de\u7684 JSON \u65e0\u6cd5\u89e3\u6790"

    .line 697
    .line 698
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    :goto_b
    return-object v0

    .line 703
    :cond_16
    if-nez v5, :cond_17

    .line 704
    .line 705
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    invoke-static {v9, v1, v0}, Lfb/h2;->m(Lfb/d2;Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    return-object v0

    .line 714
    :cond_17
    const-string v3, "raw.githubusercontent.com"

    .line 715
    .line 716
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-result v2

    .line 720
    if-eqz v2, :cond_18

    .line 721
    .line 722
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    invoke-static {v1, v0}, Lfb/h2;->l(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    return-object v0

    .line 731
    :cond_18
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    invoke-static {v1, v0}, Lfb/h2;->l(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    return-object v0

    .line 740
    :cond_19
    const-string v0, "URL \u65e0\u6548: "

    .line 741
    .line 742
    move-object/from16 v1, p0

    .line 743
    .line 744
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    return-object v0
.end method

.method public static p(Ljava/lang/String;Lfb/b;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/16 v0, 0x3e8

    .line 13
    .line 14
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const-string p0, "\u6a21\u578b\u6ca1\u6709\u63d0\u4f9b\u641c\u7d22\u5173\u952e\u8bcd"

    .line 25
    .line 26
    invoke-static {p0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    invoke-virtual {p1}, Lfb/b;->d()V

    .line 32
    .line 33
    .line 34
    invoke-static {p0}, Lfb/h2;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-static {v0, p1}, Lfb/h2;->o(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_1
    const-string v0, "(?i)(?:www\\.)?github\\.com/[^\\s<>\"\']+"

    .line 46
    .line 47
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-static {v0, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v2, 0x0

    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {v0}, Log/i;->c()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/16 v3, 0xc

    .line 74
    .line 75
    new-array v3, v3, [C

    .line 76
    .line 77
    fill-array-data v3, :array_0

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v3}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v3, "https://"

    .line 85
    .line 86
    invoke-static {v3, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    move-object v0, v2

    .line 98
    :goto_0
    if-eqz v0, :cond_3

    .line 99
    .line 100
    invoke-static {v0, p1}, Lfb/h2;->o(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :cond_3
    const-string v0, "(?i)(?:github\\.com/)([^/\\s?#]+)/([^/\\s?#]+)"

    .line 106
    .line 107
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    const-string v3, "github"

    .line 126
    .line 127
    const/4 v4, 0x1

    .line 128
    if-eqz v0, :cond_4

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    const-string v0, "^\\s*([A-Za-z0-9_.-]{1,64})/([A-Za-z0-9_.-]{1,100})\\s*$"

    .line 132
    .line 133
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-nez v5, :cond_5

    .line 152
    .line 153
    move-object v0, v2

    .line 154
    goto :goto_1

    .line 155
    :cond_5
    new-instance v5, Log/i;

    .line 156
    .line 157
    invoke-direct {v5, v0, p0}, Log/i;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    move-object v0, v5

    .line 161
    :goto_1
    if-eqz v0, :cond_6

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    invoke-static {p0, v3, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_7

    .line 169
    .line 170
    const-string v0, "(?<![A-Za-z0-9_.-])([A-Za-z0-9_.-]{1,64})/([A-Za-z0-9_.-]{1,100})(?![A-Za-z0-9_.-])"

    .line 171
    .line 172
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v1, p0}, La7/a;->b(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Log/i;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    goto :goto_2

    .line 191
    :cond_7
    move-object v0, v2

    .line 192
    :goto_2
    if-nez v0, :cond_9

    .line 193
    .line 194
    :cond_8
    :goto_3
    move-object v6, v2

    .line 195
    goto :goto_4

    .line 196
    :cond_9
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    check-cast v5, Log/g;

    .line 201
    .line 202
    invoke-virtual {v5, v4}, Log/g;->get(I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    check-cast v5, Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    invoke-virtual {v0}, Log/i;->a()Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Log/g;

    .line 221
    .line 222
    const/4 v6, 0x2

    .line 223
    invoke-virtual {v0, v6}, Log/g;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    check-cast v0, Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const/4 v6, 0x4

    .line 238
    new-array v6, v6, [C

    .line 239
    .line 240
    fill-array-data v6, :array_1

    .line 241
    .line 242
    .line 243
    invoke-static {v0, v6}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    const-string v6, ".git"

    .line 248
    .line 249
    invoke-static {v0, v6}, Log/m;->B0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-nez v6, :cond_8

    .line 258
    .line 259
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-nez v6, :cond_8

    .line 264
    .line 265
    const-string v6, "v1"

    .line 266
    .line 267
    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    if-eqz v6, :cond_a

    .line 272
    .line 273
    goto :goto_3

    .line 274
    :cond_a
    new-instance v6, Lfb/d2;

    .line 275
    .line 276
    invoke-direct {v6, v5, v0}, Lfb/d2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :goto_4
    if-eqz v6, :cond_b

    .line 280
    .line 281
    iget-object p0, v6, Lfb/d2;->a:Ljava/lang/String;

    .line 282
    .line 283
    iget-object v0, v6, Lfb/d2;->b:Ljava/lang/String;

    .line 284
    .line 285
    const-string v1, "https://github.com/"

    .line 286
    .line 287
    const-string v2, "/"

    .line 288
    .line 289
    invoke-static {v1, p0, v2, v0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    invoke-static {v6, p0, p1}, Lfb/h2;->m(Lfb/d2;Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    return-object p0

    .line 298
    :cond_b
    invoke-static {p0, v3, v4}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eqz v0, :cond_17

    .line 303
    .line 304
    const-string v0, "(?i)github(?:\\.com)?"

    .line 305
    .line 306
    const-string v3, " "

    .line 307
    .line 308
    invoke-static {v0, p0, v3}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    const-string v4, "\\s+"

    .line 313
    .line 314
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 315
    .line 316
    .line 317
    move-result-object v4

    .line 318
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    if-eqz v3, :cond_c

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_c
    move-object p0, v0

    .line 348
    :goto_5
    const-string v0, "search"

    .line 349
    .line 350
    const-string v3, "repositories"

    .line 351
    .line 352
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Lfb/h2;->e([Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    const-string v3, "q"

    .line 365
    .line 366
    invoke-virtual {v0, v3, p0}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    const-string v3, "per_page"

    .line 371
    .line 372
    const-string v4, "8"

    .line 373
    .line 374
    invoke-virtual {v0, v3, v4}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    const-string v3, "Accept"

    .line 387
    .line 388
    const-string v4, "application/vnd.github+json"

    .line 389
    .line 390
    invoke-static {v3, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    const/high16 v4, 0x40000

    .line 398
    .line 399
    const/16 v5, 0x10

    .line 400
    .line 401
    invoke-static {v0, p1, v3, v4, v5}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    iget-object v4, v3, Lfb/c2;->f:Ljava/lang/String;

    .line 406
    .line 407
    const-string v5, "[GitHub \u4ed3\u5e93\u641c\u7d22]\n"

    .line 408
    .line 409
    const/16 v6, 0xa

    .line 410
    .line 411
    if-eqz v4, :cond_e

    .line 412
    .line 413
    const-string v0, "site:github.com "

    .line 414
    .line 415
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    invoke-static {p0, p1}, Lfb/h2;->q(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    invoke-static {p0}, Lfb/h2;->h(Ljava/lang/String;)Z

    .line 424
    .line 425
    .line 426
    move-result p1

    .line 427
    if-nez p1, :cond_d

    .line 428
    .line 429
    new-instance p1, Ljava/lang/StringBuilder;

    .line 430
    .line 431
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    const-string v0, "GitHub API: "

    .line 435
    .line 436
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    return-object p0

    .line 454
    :cond_d
    const-string p0, "GitHub \u4ed3\u5e93\u641c\u7d22\u5931\u8d25: "

    .line 455
    .line 456
    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object p0

    .line 460
    invoke-static {p0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    return-object p0

    .line 465
    :cond_e
    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    .line 466
    .line 467
    iget-object v3, v3, Lfb/c2;->d:Ljava/lang/String;

    .line 468
    .line 469
    invoke-direct {p1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 470
    .line 471
    .line 472
    goto :goto_6

    .line 473
    :catchall_0
    move-exception p1

    .line 474
    new-instance v3, Lsf/f;

    .line 475
    .line 476
    invoke-direct {v3, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 477
    .line 478
    .line 479
    move-object p1, v3

    .line 480
    :goto_6
    nop

    .line 481
    instance-of v3, p1, Lsf/f;

    .line 482
    .line 483
    if-eqz v3, :cond_f

    .line 484
    .line 485
    move-object p1, v2

    .line 486
    :cond_f
    check-cast p1, Lorg/json/JSONObject;

    .line 487
    .line 488
    if-eqz p1, :cond_16

    .line 489
    .line 490
    const-string v3, "items"

    .line 491
    .line 492
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    if-eqz p1, :cond_15

    .line 497
    .line 498
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    if-nez v3, :cond_10

    .line 503
    .line 504
    goto/16 :goto_9

    .line 505
    .line 506
    :cond_10
    new-instance v3, Ljava/lang/StringBuilder;

    .line 507
    .line 508
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    const-string v4, "\u67e5\u8be2: "

    .line 512
    .line 513
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 524
    .line 525
    .line 526
    move-result p0

    .line 527
    const/16 v4, 0x8

    .line 528
    .line 529
    invoke-static {p0, v4}, Ljava/lang/Math;->min(II)I

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    move v4, v1

    .line 534
    :goto_7
    if-lt v4, p0, :cond_11

    .line 535
    .line 536
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    new-instance p0, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    const-string p1, "\u6765\u6e90: "

    .line 542
    .line 543
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object p0

    .line 553
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object p0

    .line 563
    goto/16 :goto_a

    .line 564
    .line 565
    :cond_11
    invoke-virtual {p1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    if-eqz v5, :cond_14

    .line 570
    .line 571
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 572
    .line 573
    .line 574
    add-int/lit8 v7, v4, 0x1

    .line 575
    .line 576
    const-string v8, "full_name"

    .line 577
    .line 578
    const-string v9, "\u672a\u547d\u540d\u4ed3\u5e93"

    .line 579
    .line 580
    invoke-virtual {v5, v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    new-instance v9, Ljava/lang/StringBuilder;

    .line 585
    .line 586
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    const-string v7, ". "

    .line 593
    .line 594
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v7

    .line 604
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 608
    .line 609
    .line 610
    const-string v7, "html_url"

    .line 611
    .line 612
    const-string v8, ""

    .line 613
    .line 614
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    new-instance v9, Ljava/lang/StringBuilder;

    .line 619
    .line 620
    const-string v10, "\u5730\u5740: "

    .line 621
    .line 622
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 636
    .line 637
    .line 638
    const-string v7, "description"

    .line 639
    .line 640
    invoke-static {v7, v8, v5}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v7

    .line 644
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 645
    .line 646
    .line 647
    move-result v8

    .line 648
    if-nez v8, :cond_12

    .line 649
    .line 650
    goto :goto_8

    .line 651
    :cond_12
    move-object v7, v2

    .line 652
    :goto_8
    if-eqz v7, :cond_13

    .line 653
    .line 654
    const/16 v8, 0x2bc

    .line 655
    .line 656
    invoke-static {v8, v7}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v7

    .line 660
    const-string v8, "\u7b80\u4ecb: "

    .line 661
    .line 662
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v7

    .line 666
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 670
    .line 671
    .line 672
    :cond_13
    const-string v7, "language"

    .line 673
    .line 674
    const-string v8, "\u672a\u77e5"

    .line 675
    .line 676
    invoke-virtual {v5, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 677
    .line 678
    .line 679
    move-result-object v7

    .line 680
    const-string v8, "stargazers_count"

    .line 681
    .line 682
    invoke-virtual {v5, v8, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 683
    .line 684
    .line 685
    move-result v5

    .line 686
    new-instance v8, Ljava/lang/StringBuilder;

    .line 687
    .line 688
    const-string v9, "\u8bed\u8a00: "

    .line 689
    .line 690
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    const-string v7, "\uff0cStars: "

    .line 697
    .line 698
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v5

    .line 708
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 712
    .line 713
    .line 714
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 715
    .line 716
    goto/16 :goto_7

    .line 717
    .line 718
    :cond_15
    :goto_9
    const-string p0, "GitHub \u6ca1\u6709\u627e\u5230\u5339\u914d\u7684\u516c\u5f00\u4ed3\u5e93"

    .line 719
    .line 720
    invoke-static {p0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object p0

    .line 724
    goto :goto_a

    .line 725
    :cond_16
    const-string p0, "GitHub \u641c\u7d22\u8fd4\u56de\u7684 JSON \u65e0\u6cd5\u89e3\u6790"

    .line 726
    .line 727
    invoke-static {p0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object p0

    .line 731
    :goto_a
    return-object p0

    .line 732
    :cond_17
    invoke-static {p0, p1}, Lfb/h2;->q(Ljava/lang/String;Lfb/b;)Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object p0

    .line 736
    return-object p0

    .line 737
    :array_0
    .array-data 2
        0x2es
        0x2cs
        0x3bs
        0x3as
        -0xf4s
        0x3002s
        -0xe5s
        -0xe6s
        0x29s
        -0xf7s
        0x5ds
        0x3011s
    .end array-data

    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    :array_1
    .array-data 2
        0x2es
        0x2cs
        -0xf4s
        0x3002s
    .end array-data
.end method

.method public static q(Ljava/lang/String;Lfb/b;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "https://html.duckduckgo.com/html/"

    .line 4
    .line 5
    invoke-static {v1}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_18

    .line 10
    .line 11
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_18

    .line 16
    .line 17
    const-string v2, "q"

    .line 18
    .line 19
    invoke-virtual {v1, v2, v0}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_18

    .line 24
    .line 25
    const-string v2, "kl"

    .line 26
    .line 27
    const-string v3, "wt-wt"

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_18

    .line 34
    .line 35
    invoke-virtual {v1}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    if-eqz v1, :cond_18

    .line 40
    .line 41
    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_18

    .line 46
    .line 47
    const-string v2, "Accept"

    .line 48
    .line 49
    const-string v3, "text/html,application/xhtml+xml"

    .line 50
    .line 51
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/high16 v3, 0x60000

    .line 59
    .line 60
    const/16 v4, 0x10

    .line 61
    .line 62
    move-object/from16 v5, p1

    .line 63
    .line 64
    invoke-static {v1, v5, v2, v3, v4}, Lfb/h2;->c(Ljava/lang/String;Lfb/b;Ljava/util/Map;II)Lfb/c2;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v3, v2, Lfb/c2;->f:Ljava/lang/String;

    .line 69
    .line 70
    if-eqz v3, :cond_0

    .line 71
    .line 72
    const-string v0, "\u7f51\u9875\u641c\u7d22\u5931\u8d25: "

    .line 73
    .line 74
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    :cond_0
    iget-object v2, v2, Lfb/c2;->d:Ljava/lang/String;

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-static {v2, v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    const-class v6, Landroid/text/style/URLSpan;

    .line 103
    .line 104
    invoke-interface {v2, v3, v5, v6}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v6, Lc9/a0;

    .line 112
    .line 113
    const/16 v7, 0xf

    .line 114
    .line 115
    invoke-direct {v6, v2, v7}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    invoke-static {v5, v6}, Ltf/l;->H0([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    :cond_1
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    const/4 v7, 0x0

    .line 131
    const/4 v8, 0x1

    .line 132
    if-eqz v6, :cond_c

    .line 133
    .line 134
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    check-cast v6, Landroid/text/style/URLSpan;

    .line 139
    .line 140
    invoke-virtual {v6}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const-string v10, "//"

    .line 148
    .line 149
    invoke-static {v9, v10, v3}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_2

    .line 154
    .line 155
    const-string v10, "https:"

    .line 156
    .line 157
    invoke-virtual {v10, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    :cond_2
    invoke-static {v9}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    if-eqz v9, :cond_4

    .line 166
    .line 167
    invoke-virtual {v9}, Lokhttp3/HttpUrl;->host()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    const-string v11, "duckduckgo.com"

    .line 172
    .line 173
    invoke-static {v10, v11, v8}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 174
    .line 175
    .line 176
    move-result v8

    .line 177
    if-eqz v8, :cond_3

    .line 178
    .line 179
    const-string v8, "uddg"

    .line 180
    .line 181
    invoke-virtual {v9, v8}, Lokhttp3/HttpUrl;->queryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    if-eqz v8, :cond_4

    .line 186
    .line 187
    invoke-static {v8}, Lfb/h2;->r(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    if-eqz v9, :cond_4

    .line 192
    .line 193
    move-object v7, v8

    .line 194
    goto :goto_1

    .line 195
    :cond_3
    invoke-virtual {v9}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    :cond_4
    :goto_1
    if-eqz v7, :cond_1

    .line 200
    .line 201
    invoke-interface {v2, v6}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 202
    .line 203
    .line 204
    move-result v8

    .line 205
    if-gez v8, :cond_5

    .line 206
    .line 207
    move v8, v3

    .line 208
    :cond_5
    invoke-interface {v2, v6}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 213
    .line 214
    .line 215
    move-result v9

    .line 216
    if-le v6, v9, :cond_6

    .line 217
    .line 218
    move v6, v9

    .line 219
    :cond_6
    invoke-interface {v2, v8, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    invoke-static {v6}, Lfb/h2;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-eqz v8, :cond_7

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_7
    invoke-virtual {v4, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    if-nez v8, :cond_8

    .line 243
    .line 244
    new-instance v8, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    invoke-interface {v4, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    :cond_8
    check-cast v8, Ljava/util/List;

    .line 253
    .line 254
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    if-eqz v7, :cond_9

    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_9
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    :cond_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    if-eqz v9, :cond_b

    .line 270
    .line 271
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    check-cast v9, Ljava/lang/String;

    .line 276
    .line 277
    invoke-static {v9, v6}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    if-eqz v9, :cond_a

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_b
    :goto_2
    invoke-interface {v8, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    goto/16 :goto_0

    .line 289
    .line 290
    :cond_c
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    check-cast v2, Ljava/lang/Iterable;

    .line 298
    .line 299
    new-instance v4, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-static {v2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    if-eqz v5, :cond_12

    .line 317
    .line 318
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v5

    .line 322
    check-cast v5, Ljava/util/Map$Entry;

    .line 323
    .line 324
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    check-cast v6, Ljava/lang/String;

    .line 335
    .line 336
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    check-cast v5, Ljava/util/List;

    .line 344
    .line 345
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 346
    .line 347
    .line 348
    move-result-object v9

    .line 349
    :cond_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 350
    .line 351
    .line 352
    move-result v10

    .line 353
    if-eqz v10, :cond_e

    .line 354
    .line 355
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v10

    .line 359
    move-object v11, v10

    .line 360
    check-cast v11, Ljava/lang/String;

    .line 361
    .line 362
    const-string v12, "http"

    .line 363
    .line 364
    invoke-static {v11, v12, v8}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    if-nez v11, :cond_d

    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_e
    move-object v10, v7

    .line 372
    :goto_4
    check-cast v10, Ljava/lang/String;

    .line 373
    .line 374
    if-eqz v10, :cond_f

    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_f
    invoke-static {v5}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    move-object v10, v9

    .line 382
    check-cast v10, Ljava/lang/String;

    .line 383
    .line 384
    :goto_5
    invoke-static {v8, v5}, Ltf/m;->q1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    new-instance v11, Ljava/util/ArrayList;

    .line 389
    .line 390
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    :cond_10
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 398
    .line 399
    .line 400
    move-result v9

    .line 401
    if-eqz v9, :cond_11

    .line 402
    .line 403
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v9

    .line 407
    move-object v12, v9

    .line 408
    check-cast v12, Ljava/lang/String;

    .line 409
    .line 410
    invoke-static {v12, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v12

    .line 414
    if-nez v12, :cond_10

    .line 415
    .line 416
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_6

    .line 420
    :cond_11
    const/4 v15, 0x0

    .line 421
    const/16 v16, 0x3e

    .line 422
    .line 423
    const-string v12, " "

    .line 424
    .line 425
    const/4 v13, 0x0

    .line 426
    const/4 v14, 0x0

    .line 427
    invoke-static/range {v11 .. v16}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    new-instance v9, Lfb/g2;

    .line 432
    .line 433
    invoke-direct {v9, v10, v6, v5}, Lfb/g2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    goto :goto_3

    .line 440
    :cond_12
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    if-eqz v2, :cond_13

    .line 445
    .line 446
    const-string v0, "\u7f51\u9875\u641c\u7d22\u6ca1\u6709\u627e\u5230\u53ef\u8bfb\u53d6\u7684\u7ed3\u679c"

    .line 447
    .line 448
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    return-object v0

    .line 453
    :cond_13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    const-string v5, "[\u7f51\u9875\u641c\u7d22\u7ed3\u679c]\n"

    .line 456
    .line 457
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    new-instance v5, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    const-string v6, "\u67e5\u8be2: "

    .line 463
    .line 464
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    const/16 v0, 0xa

    .line 478
    .line 479
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    const/16 v5, 0x8

    .line 483
    .line 484
    invoke-static {v5, v4}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    if-eqz v5, :cond_17

    .line 497
    .line 498
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v5

    .line 502
    add-int/lit8 v6, v3, 0x1

    .line 503
    .line 504
    if-ltz v3, :cond_16

    .line 505
    .line 506
    check-cast v5, Lfb/g2;

    .line 507
    .line 508
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    iget-object v3, v5, Lfb/g2;->a:Ljava/lang/String;

    .line 512
    .line 513
    new-instance v8, Ljava/lang/StringBuilder;

    .line 514
    .line 515
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    const-string v9, ". "

    .line 522
    .line 523
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 537
    .line 538
    .line 539
    iget-object v3, v5, Lfb/g2;->b:Ljava/lang/String;

    .line 540
    .line 541
    const-string v8, "\u6765\u6e90: "

    .line 542
    .line 543
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    iget-object v3, v5, Lfb/g2;->c:Ljava/lang/String;

    .line 554
    .line 555
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 556
    .line 557
    .line 558
    move-result v5

    .line 559
    if-nez v5, :cond_14

    .line 560
    .line 561
    goto :goto_8

    .line 562
    :cond_14
    move-object v3, v7

    .line 563
    :goto_8
    if-eqz v3, :cond_15

    .line 564
    .line 565
    const/16 v5, 0x384

    .line 566
    .line 567
    invoke-static {v5, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    const-string v5, "\u6458\u8981: "

    .line 572
    .line 573
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v3

    .line 577
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 578
    .line 579
    .line 580
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    :cond_15
    move v3, v6

    .line 584
    goto :goto_7

    .line 585
    :cond_16
    invoke-static {}, La/a;->Q0()V

    .line 586
    .line 587
    .line 588
    throw v7

    .line 589
    :cond_17
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    const-string v3, "\u641c\u7d22\u6765\u6e90: "

    .line 593
    .line 594
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    return-object v0

    .line 609
    :cond_18
    const-string v0, "\u65e0\u6cd5\u751f\u6210\u7f51\u9875\u641c\u7d22\u5730\u5740"

    .line 610
    .line 611
    invoke-static {v0}, Lfb/h2;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    return-object v0
.end method

.method public static r(Ljava/lang/String;)Lokhttp3/HttpUrl;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lokhttp3/HttpUrl$Companion;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    new-instance v0, Lsf/f;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    move-object p0, v0

    .line 15
    :goto_0
    nop

    .line 16
    instance-of v0, p0, Lsf/f;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move-object p0, v1

    .line 22
    :cond_0
    check-cast p0, Lokhttp3/HttpUrl;

    .line 23
    .line 24
    if-eqz p0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v2, "http"

    .line 31
    .line 32
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v2, "https"

    .line 43
    .line 44
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 v0, 0x0

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 54
    :goto_2
    if-eqz v0, :cond_3

    .line 55
    .line 56
    move-object v1, p0

    .line 57
    :cond_3
    return-object v1
.end method
