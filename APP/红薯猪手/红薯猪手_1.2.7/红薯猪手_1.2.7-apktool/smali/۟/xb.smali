.class public final L۟/xb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/x1;


# static fields
.field public static volatile ۥ۟:Landroid/net/http/HttpResponseCache;

.field public static final ۥ۟۟:Ljava/lang/Object;

.field public static final ۥ۟۠:L۟/xb$a;


# instance fields
.field public final ۥ:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, L۟/xb;->ۥ۟۟:Ljava/lang/Object;

    new-instance v0, L۟/xb$a;

    invoke-direct {v0}, L۟/xb$a;-><init>()V

    sput-object v0, L۟/xb;->ۥ۟۠:L۟/xb$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, L۟/xb;->ۥ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final ۥ(Landroid/net/Uri;I)L۟/x1$a;
    .locals 6

    .line 1
    iget-object v0, p0, L۟/xb;->ۥ:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, L۟/xb;->ۥ۟:Landroid/net/http/HttpResponseCache;

    .line 4
    .line 5
    if-nez v1, :cond_3

    .line 6
    .line 7
    :try_start_0
    sget-object v1, L۟/xb;->ۥ۟۟:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :try_start_1
    sget-object v2, L۟/xb;->ۥ۟:Landroid/net/http/HttpResponseCache;

    .line 11
    .line 12
    if-nez v2, :cond_2

    .line 13
    .line 14
    new-instance v2, Ljava/io/File;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v3, "picasso-cache"

    .line 25
    .line 26
    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {}, Landroid/net/http/HttpResponseCache;->getInstalled()Landroid/net/http/HttpResponseCache;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    invoke-static {v2}, L۟/ic;->ۥ(Ljava/io/File;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    invoke-static {v2, v3, v4}, Landroid/net/http/HttpResponseCache;->install(Ljava/io/File;J)Landroid/net/http/HttpResponseCache;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_1
    sput-object v0, L۟/xb;->ۥ۟:Landroid/net/http/HttpResponseCache;

    .line 53
    .line 54
    :cond_2
    monitor-exit v1

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 59
    :catch_0
    :cond_3
    :goto_0
    new-instance v0, Ljava/net/URL;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 73
    .line 74
    const/16 v0, 0x3a98

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 77
    .line 78
    .line 79
    const/16 v0, 0x4e20

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 82
    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 86
    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    if-eqz p2, :cond_8

    .line 90
    .line 91
    invoke-static {p2}, L۟/c4;->ۥ(I)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    const-string v2, "only-if-cached,max-age=2147483647"

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    sget-object v2, L۟/xb;->ۥ۟۠:L۟/xb$a;

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 109
    .line 110
    .line 111
    invoke-static {p2}, L۟/c4;->ۥ۟(I)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_5

    .line 116
    .line 117
    const-string v3, "no-cache"

    .line 118
    .line 119
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    :cond_5
    invoke-static {p2}, L۟/c4;->ۥ۟۟(I)Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-nez v3, :cond_7

    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-lez v3, :cond_6

    .line 133
    .line 134
    const/16 v3, 0x2c

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    :cond_6
    const-string v3, "no-store"

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    :cond_7
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :goto_1
    const-string v3, "Cache-Control"

    .line 149
    .line 150
    invoke-virtual {p1, v3, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :cond_8
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    const/16 v3, 0x12c

    .line 158
    .line 159
    if-ge v2, v3, :cond_d

    .line 160
    .line 161
    const-string p2, "Content-Length"

    .line 162
    .line 163
    const/4 v2, -0x1

    .line 164
    invoke-virtual {p1, p2, v2}, Ljava/net/URLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    int-to-long v2, p2

    .line 169
    const-string p2, "X-Android-Response-Source"

    .line 170
    .line 171
    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    if-nez p2, :cond_9

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_9
    const/4 v4, 0x2

    .line 179
    const-string v5, " "

    .line 180
    .line 181
    invoke-virtual {p2, v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    aget-object v4, p2, v1

    .line 186
    .line 187
    const-string v5, "CACHE"

    .line 188
    .line 189
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_a

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_a
    array-length v4, p2

    .line 197
    if-ne v4, v0, :cond_b

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_b
    :try_start_3
    const-string v4, "CONDITIONAL_CACHE"

    .line 201
    .line 202
    aget-object v5, p2, v1

    .line 203
    .line 204
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_c

    .line 209
    .line 210
    aget-object p2, p2, v0

    .line 211
    .line 212
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result p2
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    .line 216
    const/16 v4, 0x130

    .line 217
    .line 218
    if-ne p2, v4, :cond_c

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :catch_1
    :cond_c
    :goto_2
    move v0, v1

    .line 222
    :goto_3
    new-instance p2, L۟/x1$a;

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-direct {p2, p1, v0, v2, v3}, L۟/x1$a;-><init>(Ljava/io/InputStream;ZJ)V

    .line 229
    .line 230
    .line 231
    return-object p2

    .line 232
    :cond_d
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 233
    .line 234
    .line 235
    new-instance v0, L۟/x1$b;

    .line 236
    .line 237
    new-instance v1, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v3, " "

    .line 246
    .line 247
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-direct {v0, p1, p2, v2}, L۟/x1$b;-><init>(Ljava/lang/String;II)V

    .line 262
    .line 263
    .line 264
    throw v0
.end method
