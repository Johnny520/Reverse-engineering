.class public final Lyyds/ᛸᲀᛳᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᲇᛶᲀ;


# instance fields
.field public ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

.field public volatile ᛶᛷᛲᲁ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᛳᲁᲈᛵ;

.field public ᲇᲇᲇᛱ:Ljava/io/InputStream;

.field public final ᲇᲈᛵᛷ:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lyyds/ᛳᲁᲈᛵ;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᲀᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲁᲈᛵ;

    .line 5
    .line 6
    iput p2, p0, Lyyds/ᛸᲀᛳᛴ;->ᲇᲈᛵᛷ:I

    .line 7
    .line 8
    return-void
.end method

.method public static ᲀᛲᛳᲀ(Ljava/net/HttpURLConnection;)I
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 2
    .line 3
    .line 4
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return p0

    .line 6
    :catch_0
    move-exception p0

    .line 7
    const/4 v0, 0x3

    .line 8
    const-string v1, "HttpUrlFetcher"

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const-string v0, "Failed to get a response code"

    .line 17
    .line 18
    invoke-static {v1, v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p0, -0x1

    .line 22
    return p0
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lyyds/ᛸᲀᛳᛴ;->ᛶᛷᛲᲁ:Z

    .line 3
    .line 4
    return-void
.end method

.method public final ᛲᛴᛳᛲ(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;
    .locals 7

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    if-ge p2, v0, :cond_a

    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p1}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p3}, Ljava/net/URL;->toURI()Ljava/net/URI;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-virtual {v0, p3}, Ljava/net/URI;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    if-nez p3, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance p3, Lyyds/ᲀᛲᲁᲁ;

    .line 24
    .line 25
    const-string v0, "In re-direct loop"

    .line 26
    .line 27
    invoke-direct {p3, v0, v1, v2}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 28
    .line 29
    .line 30
    throw p3
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :catch_0
    :cond_1
    :goto_0
    iget p3, p0, Lyyds/ᛸᲀᛳᛴ;->ᲇᲈᛵᛷ:I

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :try_start_1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_5

    .line 39
    .line 40
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Ljava/util/Map$Entry;

    .line 59
    .line 60
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    check-cast v6, Ljava/lang/String;

    .line 65
    .line 66
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v3, v6, v5}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    invoke-virtual {v3, p3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, p3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 83
    .line 84
    .line 85
    const/4 p3, 0x1

    .line 86
    invoke-virtual {v3, p3}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 90
    .line 91
    .line 92
    iput-object v3, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 93
    .line 94
    :try_start_2
    invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, Lyyds/ᛸᲀᛳᛴ;->ᲇᲇᲇᛱ:Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 104
    .line 105
    iget-boolean v0, p0, Lyyds/ᛸᲀᛳᛴ;->ᛶᛷᛲᲁ:Z

    .line 106
    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    return-object v2

    .line 110
    :cond_3
    iget-object v0, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 111
    .line 112
    invoke-static {v0}, Lyyds/ᛸᲀᛳᛴ;->ᲀᛲᛳᲀ(Ljava/net/HttpURLConnection;)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    div-int/lit8 v3, v0, 0x64

    .line 117
    .line 118
    const/4 v4, 0x2

    .line 119
    const/4 v5, 0x3

    .line 120
    if-ne v3, v4, :cond_6

    .line 121
    .line 122
    iget-object p1, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 123
    .line 124
    const-string p2, "HttpUrlFetcher"

    .line 125
    .line 126
    const-string p3, "Got non empty content encoding: "

    .line 127
    .line 128
    :try_start_3
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    if-eqz p4, :cond_4

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentLength()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    int-to-long v0, p2

    .line 147
    new-instance p2, Lyyds/ᲁᛲ;

    .line 148
    .line 149
    invoke-direct {p2, p3, v0, v1}, Lyyds/ᲁᛲ;-><init>(Ljava/io/InputStream;J)V

    .line 150
    .line 151
    .line 152
    iput-object p2, p0, Lyyds/ᛸᲀᛳᛴ;->ᲇᲇᲇᛱ:Ljava/io/InputStream;

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :catch_1
    move-exception p0

    .line 156
    goto :goto_3

    .line 157
    :cond_4
    invoke-static {p2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 158
    .line 159
    .line 160
    move-result p4

    .line 161
    if-eqz p4, :cond_5

    .line 162
    .line 163
    new-instance p4, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p4, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p3

    .line 172
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p3

    .line 179
    invoke-static {p2, p3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    :cond_5
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    iput-object p2, p0, Lyyds/ᛸᲀᛳᛴ;->ᲇᲇᲇᛱ:Ljava/io/InputStream;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 187
    .line 188
    :goto_2
    return-object p2

    .line 189
    :goto_3
    new-instance p2, Lyyds/ᲀᛲᲁᲁ;

    .line 190
    .line 191
    const-string p3, "Failed to obtain InputStream"

    .line 192
    .line 193
    invoke-static {p1}, Lyyds/ᛸᲀᛳᛴ;->ᲀᛲᛳᲀ(Ljava/net/HttpURLConnection;)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-direct {p2, p3, p1, p0}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 198
    .line 199
    .line 200
    throw p2

    .line 201
    :cond_6
    if-ne v3, v5, :cond_8

    .line 202
    .line 203
    iget-object v1, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 204
    .line 205
    const-string v3, "Location"

    .line 206
    .line 207
    invoke-virtual {v1, v3}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    if-nez v3, :cond_7

    .line 216
    .line 217
    :try_start_4
    new-instance v2, Ljava/net/URL;

    .line 218
    .line 219
    invoke-direct {v2, p1, v1}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/net/MalformedURLException; {:try_start_4 .. :try_end_4} :catch_2

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Lyyds/ᛸᲀᛳᛴ;->ᛵᛸᛸᛷ()V

    .line 223
    .line 224
    .line 225
    add-int/2addr p2, p3

    .line 226
    invoke-virtual {p0, v2, p2, p1, p4}, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :catch_2
    move-exception p0

    .line 232
    new-instance p1, Lyyds/ᲀᛲᲁᲁ;

    .line 233
    .line 234
    new-instance p2, Ljava/lang/StringBuilder;

    .line 235
    .line 236
    const-string p3, "Bad redirect url: "

    .line 237
    .line 238
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    invoke-direct {p1, p2, v0, p0}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 249
    .line 250
    .line 251
    throw p1

    .line 252
    :cond_7
    new-instance p0, Lyyds/ᲀᛲᲁᲁ;

    .line 253
    .line 254
    const-string p1, "Received empty or null redirect url"

    .line 255
    .line 256
    invoke-direct {p0, p1, v0, v2}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 257
    .line 258
    .line 259
    throw p0

    .line 260
    :cond_8
    if-ne v0, v1, :cond_9

    .line 261
    .line 262
    new-instance p0, Lyyds/ᲀᛲᲁᲁ;

    .line 263
    .line 264
    const-string p1, "Http request failed"

    .line 265
    .line 266
    invoke-direct {p0, p1, v0, v2}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 267
    .line 268
    .line 269
    throw p0

    .line 270
    :cond_9
    :try_start_5
    new-instance p1, Lyyds/ᲀᛲᲁᲁ;

    .line 271
    .line 272
    iget-object p0, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 273
    .line 274
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-direct {p1, p0, v0, v2}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 279
    .line 280
    .line 281
    throw p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 282
    :catch_3
    move-exception p0

    .line 283
    new-instance p1, Lyyds/ᲀᛲᲁᲁ;

    .line 284
    .line 285
    const-string p2, "Failed to get a response message"

    .line 286
    .line 287
    invoke-direct {p1, p2, v0, p0}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 288
    .line 289
    .line 290
    throw p1

    .line 291
    :catch_4
    move-exception p1

    .line 292
    new-instance p2, Lyyds/ᲀᛲᲁᲁ;

    .line 293
    .line 294
    iget-object p0, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 295
    .line 296
    invoke-static {p0}, Lyyds/ᛸᲀᛳᛴ;->ᲀᛲᛳᲀ(Ljava/net/HttpURLConnection;)I

    .line 297
    .line 298
    .line 299
    move-result p0

    .line 300
    const-string p3, "Failed to connect or obtain data"

    .line 301
    .line 302
    invoke-direct {p2, p3, p0, p1}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 303
    .line 304
    .line 305
    throw p2

    .line 306
    :catch_5
    move-exception p0

    .line 307
    new-instance p1, Lyyds/ᲀᛲᲁᲁ;

    .line 308
    .line 309
    const-string p2, "URL.openConnection threw"

    .line 310
    .line 311
    invoke-direct {p1, p2, v0, p0}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 312
    .line 313
    .line 314
    throw p1

    .line 315
    :cond_a
    new-instance p0, Lyyds/ᲀᛲᲁᲁ;

    .line 316
    .line 317
    const-string p1, "Too many (> 5) redirects!"

    .line 318
    .line 319
    invoke-direct {p0, p1, v1, v2}, Lyyds/ᲀᛲᲁᲁ;-><init>(Ljava/lang/String;ILjava/io/IOException;)V

    .line 320
    .line 321
    .line 322
    throw p0
.end method

.method public final ᛲᲈᲁ()Ljava/lang/Class;
    .locals 0

    .line 1
    const-class p0, Ljava/io/InputStream;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛸᲀᛳᛴ;->ᲇᲇᲇᛱ:Ljava/io/InputStream;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    iget-object v0, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 13
    .line 14
    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ:Ljava/net/HttpURLConnection;

    .line 17
    .line 18
    return-void
.end method

.method public final ᲇᲇᲇᛱ()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛲᛲᲀᲈ;Lyyds/ᛲᛳᛴ;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lyyds/ᛸᲀᛳᛴ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲁᲈᛵ;

    .line 2
    .line 3
    const-string v0, "Finished http url fetcher fetch in "

    .line 4
    .line 5
    const-string v1, "HttpUrlFetcher"

    .line 6
    .line 7
    sget v2, Lyyds/ᛶᛷᛷᲇ;->ᛵᛸᛸᛷ:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    const/4 v4, 0x2

    .line 14
    :try_start_0
    invoke-virtual {p1}, Lyyds/ᛳᲁᲈᛵ;->ᲇᲈᛵᛷ()Ljava/net/URL;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    iget-object p1, p1, Lyyds/ᛳᲁᲈᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲁᛳᛵᛲ;

    .line 19
    .line 20
    invoke-interface {p1}, Lyyds/ᲁᛳᛵᛲ;->ᛲᲈᲁ()Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x0

    .line 26
    invoke-virtual {p0, v5, v6, v7, p1}, Lyyds/ᛸᲀᛳᛴ;->ᛲᛴᛳᛲ(Ljava/net/URL;ILjava/net/URL;Ljava/util/Map;)Ljava/io/InputStream;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-interface {p2, p0}, Lyyds/ᛲᛳᛴ;->ᛲᛴᛳᛲ(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    new-instance p0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    .line 45
    .line 46
    .line 47
    move-result-wide p1

    .line 48
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    move-exception p0

    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception p0

    .line 62
    const/4 p1, 0x3

    .line 63
    :try_start_1
    invoke-static {v1, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_0

    .line 68
    .line 69
    const-string p1, "Failed to load data for url"

    .line 70
    .line 71
    invoke-static {v1, p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-interface {p2, p0}, Lyyds/ᛲᛳᛴ;->ᲀᛲᛳᲀ(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_1

    .line 82
    .line 83
    new-instance p0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v3}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    .line 89
    .line 90
    .line 91
    move-result-wide p1

    .line 92
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    :cond_1
    return-void

    .line 103
    :goto_0
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_2

    .line 108
    .line 109
    new-instance p1, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v2, v3}, Lyyds/ᛶᛷᛷᲇ;->ᛲᲈᲁ(J)D

    .line 115
    .line 116
    .line 117
    move-result-wide v2

    .line 118
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    :cond_2
    throw p0
.end method
