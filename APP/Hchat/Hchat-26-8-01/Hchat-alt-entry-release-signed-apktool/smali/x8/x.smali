.class public abstract Lx8/x;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lokhttp3/OkHttpClient;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lm/a;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lm/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lokhttp3/OkHttpClient$Builder;

    .line 9
    .line 10
    invoke-direct {v1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lokhttp3/OkHttpClient$Builder;->cookieJar(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-wide/16 v1, 0xf

    .line 18
    .line 19
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-wide/16 v1, 0x1e

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lx8/x;->a:Lokhttp3/OkHttpClient;

    .line 36
    .line 37
    return-void
.end method

.method public static a(Lokhttp3/Request$Builder;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    const-string v1, "Bearer "

    .line 17
    .line 18
    invoke-static {p1, v1, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    const-string v0, "Authorization"

    .line 30
    .line 31
    invoke-virtual {p0, v0, p1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public static b(Lokhttp3/Request$Builder;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "User-Agent"

    .line 2
    .line 3
    const-string v1, "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0 Mobile Safari/537.36"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 6
    .line 7
    .line 8
    const-string v0, "Accept"

    .line 9
    .line 10
    const-string v1, "*/*"

    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 13
    .line 14
    .line 15
    const-string v0, "Accept-Language"

    .line 16
    .line 17
    const-string v1, "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7"

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 20
    .line 21
    .line 22
    const-string v0, "/api/auth/"

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-static {p1, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const-string v1, "Referer"

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const-string v0, "https://xiaozhi.me/login"

    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string v0, "https://xiaozhi.me/console/agents"

    .line 40
    .line 41
    invoke-virtual {p0, v1, v0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 42
    .line 43
    .line 44
    :goto_0
    const-string v0, "/api/auth/send-code"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    const-string v0, "/api/auth/phone-login"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    return-void

    .line 62
    :cond_2
    :goto_1
    const-string p1, "Origin"

    .line 63
    .line 64
    const-string v0, "https://xiaozhi.me"

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "/api/agents/"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1, p0}, Lx8/x;->i(Ljava/lang/String;Ljava/lang/String;)Lx8/w;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-boolean p1, p0, Lx8/w;->b:Z

    .line 34
    .line 35
    if-eqz p1, :cond_4

    .line 36
    .line 37
    iget-object p0, p0, Lx8/w;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    const-string p0, "{}"

    .line 46
    .line 47
    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string p0, "success"

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-virtual {p1, p0, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    const-string p0, "message"

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    const-string p0, "\u62c9\u53d6\u667a\u80fd\u4f53\u914d\u7f6e\u5931\u8d25"

    .line 74
    .line 75
    :cond_1
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    const/4 p0, 0x0

    .line 79
    return-object p0

    .line 80
    :cond_2
    const-string p0, "data"

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-eqz p0, :cond_3

    .line 87
    .line 88
    const-string p1, "agent"

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_3
    const-string p0, "\u667a\u80fd\u4f53\u914d\u7f6e\u4e3a\u7a7a"

    .line 98
    .line 99
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    iget p0, p0, Lx8/w;->a:I

    .line 104
    .line 105
    const-string p1, "\u62c9\u53d6\u667a\u80fd\u4f53\u914d\u7f6e\u5931\u8d25: HTTP "

    .line 106
    .line 107
    invoke-static {p0, p1}, Lokio/a;->d(ILjava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0
.end method

.method public static d(Ljava/lang/String;)Luf/c;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "/api/agents?page=1&pageSize=24"

    .line 5
    .line 6
    invoke-static {v0, p0}, Lx8/x;->i(Ljava/lang/String;Ljava/lang/String;)Lx8/w;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-boolean v0, p0, Lx8/w;->b:Z

    .line 11
    .line 12
    if-eqz v0, :cond_d

    .line 13
    .line 14
    iget-object p0, p0, Lx8/w;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string p0, "{}"

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string p0, "success"

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    const-string p0, "message"

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    const-string p0, "\u62c9\u53d6\u667a\u80fd\u4f53\u5931\u8d25"

    .line 51
    .line 52
    :cond_1
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_2
    const-string p0, "data"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    :goto_0
    move-object v0, p0

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance p0, Lorg/json/JSONArray;

    .line 68
    .line 69
    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :goto_1
    invoke-static {}, La/a;->E()Luf/c;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    move p0, v1

    .line 82
    :goto_2
    if-lt p0, v3, :cond_4

    .line 83
    .line 84
    invoke-static {v2}, La/a;->t(Luf/c;)Luf/c;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ltf/g;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v2, "\u667a\u80fd\u4f53\u5217\u8868\u5df2\u62c9\u53d6 count="

    .line 95
    .line 96
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object p0

    .line 110
    :cond_4
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    if-eqz v4, :cond_c

    .line 115
    .line 116
    const-string v5, "id"

    .line 117
    .line 118
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    if-eqz v7, :cond_9

    .line 127
    .line 128
    const-wide/16 v6, 0x0

    .line 129
    .line 130
    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v8

    .line 134
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    cmp-long v6, v8, v6

    .line 139
    .line 140
    if-lez v6, :cond_5

    .line 141
    .line 142
    const/4 v6, 0x1

    .line 143
    goto :goto_3

    .line 144
    :cond_5
    move v6, v1

    .line 145
    :goto_3
    const/4 v7, 0x0

    .line 146
    if-eqz v6, :cond_6

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_6
    move-object v5, v7

    .line 150
    :goto_4
    if-eqz v5, :cond_7

    .line 151
    .line 152
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 153
    .line 154
    .line 155
    move-result-wide v5

    .line 156
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    :cond_7
    if-nez v7, :cond_8

    .line 161
    .line 162
    const-string v5, ""

    .line 163
    .line 164
    move-object v6, v5

    .line 165
    goto :goto_5

    .line 166
    :cond_8
    move-object v6, v7

    .line 167
    :cond_9
    :goto_5
    move-object v8, v6

    .line 168
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    if-eqz v5, :cond_a

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_a
    const-string v5, "agent_name"

    .line 176
    .line 177
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-eqz v6, :cond_b

    .line 186
    .line 187
    const-string v5, "\u667a\u80fd\u4f53 "

    .line 188
    .line 189
    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    :cond_b
    move-object v9, v5

    .line 194
    const-string v5, "assistant_name"

    .line 195
    .line 196
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v10

    .line 200
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    const-string v5, "llm_model"

    .line 204
    .line 205
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v11

    .line 209
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const-string v5, "tts_voice"

    .line 213
    .line 214
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    new-instance v7, Lx8/v;

    .line 222
    .line 223
    invoke-direct/range {v7 .. v12}, Lx8/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v7}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    :cond_c
    :goto_6
    add-int/lit8 p0, p0, 0x1

    .line 230
    .line 231
    goto/16 :goto_2

    .line 232
    .line 233
    :cond_d
    iget p0, p0, Lx8/w;->a:I

    .line 234
    .line 235
    const-string v0, "\u62c9\u53d6\u667a\u80fd\u4f53\u5931\u8d25: HTTP "

    .line 236
    .line 237
    invoke-static {p0, v0}, Lokio/a;->d(ILjava/lang/String;)V

    .line 238
    .line 239
    .line 240
    const/4 p0, 0x0

    .line 241
    return-object p0
.end method

.method public static e()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "/api/auth/captcha"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1}, Lx8/x;->i(Ljava/lang/String;Ljava/lang/String;)Lx8/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-boolean v1, v0, Lx8/w;->b:Z

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lx8/w;->c:Ljava/lang/String;

    .line 14
    .line 15
    const-string v1, "<svg"

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-static {v0, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v3, "\u56fe\u5f62\u9a8c\u8bc1\u7801\u5df2\u5237\u65b0 len="

    .line 31
    .line 32
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, Lx8/x;->j(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_0
    const-string v0, "\u56fe\u5f62\u9a8c\u8bc1\u7801\u683c\u5f0f\u5f02\u5e38"

    .line 47
    .line 48
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    return-object v0

    .line 53
    :cond_1
    iget v0, v0, Lx8/w;->a:I

    .line 54
    .line 55
    const-string v1, "\u56fe\u5f62\u9a8c\u8bc1\u7801\u8bf7\u6c42\u5931\u8d25: HTTP "

    .line 56
    .line 57
    invoke-static {v0, v1}, Lokio/a;->d(ILjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    return-object v0
.end method

.method public static f(Ljava/lang/String;Ljava/lang/String;)Lx8/y;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_9

    .line 20
    .line 21
    const-string v0, "agent_"

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {p1, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_0
    const-string v0, "https://api.xiaozhi.me/mcp/endpoints/list?endpoint_ids="

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1, p0}, Lx8/x;->i(Ljava/lang/String;Ljava/lang/String;)Lx8/w;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iget-object p1, p0, Lx8/w;->c:Ljava/lang/String;

    .line 46
    .line 47
    iget-boolean v0, p0, Lx8/w;->b:Z

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    iget p0, p0, Lx8/w;->a:I

    .line 52
    .line 53
    const/16 v0, 0x130

    .line 54
    .line 55
    if-ne p0, v0, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v1, "\u67e5\u8be2 MCP \u72b6\u6001\u5931\u8d25: HTTP "

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_2
    :goto_1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-eqz p0, :cond_3

    .line 87
    .line 88
    new-instance p0, Lx8/y;

    .line 89
    .line 90
    const-string p1, "\u672a\u77e5"

    .line 91
    .line 92
    const-string v0, "\u63a7\u5236\u53f0\u8fd4\u56de\u7a7a\u5185\u5bb9\uff0c\u8bf7\u7a0d\u540e\u5237\u65b0"

    .line 93
    .line 94
    invoke-direct {p0, p1, v0, v1}, Lx8/y;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_3
    new-instance p0, Lorg/json/JSONObject;

    .line 99
    .line 100
    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string p1, "endpoints"

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    const-string p1, "\u79bb\u7ebf"

    .line 110
    .line 111
    if-eqz p0, :cond_8

    .line 112
    .line 113
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-eqz p0, :cond_8

    .line 118
    .line 119
    const-string v0, "connectionCount"

    .line 120
    .line 121
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    const-string v2, "status"

    .line 126
    .line 127
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const-string v3, "tools"

    .line 132
    .line 133
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    if-eqz p0, :cond_4

    .line 138
    .line 139
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    goto :goto_2

    .line 144
    :cond_4
    move p0, v1

    .line 145
    :goto_2
    if-gtz v0, :cond_5

    .line 146
    .line 147
    const-string v3, "connected"

    .line 148
    .line 149
    invoke-static {v2, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-nez v3, :cond_5

    .line 154
    .line 155
    const-string v3, "online"

    .line 156
    .line 157
    invoke-static {v2, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    :cond_5
    const/4 v1, 0x1

    .line 164
    :cond_6
    new-instance v3, Lx8/y;

    .line 165
    .line 166
    if-eqz v1, :cond_7

    .line 167
    .line 168
    const-string p1, "\u5728\u7ebf"

    .line 169
    .line 170
    :cond_7
    const-string v4, "\uff0c\u8fde\u63a5\u6570="

    .line 171
    .line 172
    const-string v5, "\uff0c\u5de5\u5177="

    .line 173
    .line 174
    const-string v6, "\u63a7\u5236\u53f0 status="

    .line 175
    .line 176
    invoke-static {v0, v6, v2, v4, v5}, Leh/a;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-direct {v3, p1, p0, v1}, Lx8/y;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 188
    .line 189
    .line 190
    return-object v3

    .line 191
    :cond_8
    new-instance p0, Lx8/y;

    .line 192
    .line 193
    const-string v0, "\u63a7\u5236\u53f0\u672a\u8fd4\u56de\u63a5\u5165\u70b9"

    .line 194
    .line 195
    invoke-direct {p0, p1, v0, v1}, Lx8/y;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 196
    .line 197
    .line 198
    return-object p0

    .line 199
    :cond_9
    const-string p0, "\u8bf7\u5148\u9009\u62e9\u5c0f\u667a\u667a\u80fd\u4f53"

    .line 200
    .line 201
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const/4 p0, 0x0

    .line 205
    return-object p0
.end method

.method public static g(Ljava/lang/String;)Luf/c;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "/api/roles/model-list"

    .line 5
    .line 6
    invoke-static {v0, p0}, Lx8/x;->i(Ljava/lang/String;Ljava/lang/String;)Lx8/w;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-boolean v0, p0, Lx8/w;->b:Z

    .line 11
    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    iget-object p0, p0, Lx8/w;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string p0, "{}"

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string p0, "data"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    const-string v0, "modelList"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    :goto_0
    move-object v0, p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p0, Lorg/json/JSONArray;

    .line 48
    .line 49
    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    invoke-static {}, La/a;->E()Luf/c;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 p0, 0x0

    .line 62
    :goto_2
    if-lt p0, v2, :cond_2

    .line 63
    .line 64
    invoke-static {v1}, La/a;->t(Luf/c;)Luf/c;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ltf/g;->size()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v2, "\u6a21\u578b\u5217\u8868\u5df2\u62c9\u53d6 count="

    .line 75
    .line 76
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-object p0

    .line 90
    :cond_2
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-eqz v3, :cond_6

    .line 95
    .line 96
    const-string v4, "name"

    .line 97
    .line 98
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_3

    .line 107
    .line 108
    const-string v4, "model"

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_4

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    const-string v5, "description"

    .line 125
    .line 126
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_5

    .line 135
    .line 136
    move-object v3, v4

    .line 137
    :cond_5
    new-instance v5, Lx8/z;

    .line 138
    .line 139
    invoke-direct {v5, v4, v3}, Lx8/z;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v5}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    :cond_6
    :goto_3
    add-int/lit8 p0, p0, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_7
    iget p0, p0, Lx8/w;->a:I

    .line 149
    .line 150
    const-string v0, "\u62c9\u53d6\u6a21\u578b\u5217\u8868\u5931\u8d25: HTTP "

    .line 151
    .line 152
    invoke-static {p0, v0}, Lokio/a;->d(ILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    const/4 p0, 0x0

    .line 156
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Luf/c;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "/api/roles/tts-list"

    .line 5
    .line 6
    invoke-static {v0, p0}, Lx8/x;->i(Ljava/lang/String;Ljava/lang/String;)Lx8/w;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget-boolean v0, p0, Lx8/w;->b:Z

    .line 11
    .line 12
    if-eqz v0, :cond_b

    .line 13
    .line 14
    iget-object p0, p0, Lx8/w;->c:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string p0, "{}"

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string p0, "data"

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    const-string v0, "ttsList"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    if-eqz p0, :cond_1

    .line 44
    .line 45
    :goto_0
    move-object v0, p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p0, Lorg/json/JSONArray;

    .line 48
    .line 49
    invoke-direct {p0}, Lorg/json/JSONArray;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :goto_1
    invoke-static {}, La/a;->E()Luf/c;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    const/4 v3, 0x0

    .line 62
    move p0, v3

    .line 63
    :goto_2
    if-lt p0, v2, :cond_2

    .line 64
    .line 65
    invoke-static {v1}, La/a;->t(Luf/c;)Luf/c;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p0}, Ltf/g;->size()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v2, "\u8bed\u97f3\u89d2\u8272\u5217\u8868\u5df2\u62c9\u53d6 count="

    .line 76
    .line 77
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_2
    invoke-virtual {v0, p0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    if-eqz v4, :cond_a

    .line 96
    .line 97
    const-string v5, "voice_id"

    .line 98
    .line 99
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_3

    .line 111
    .line 112
    goto :goto_6

    .line 113
    :cond_3
    const-string v6, "languages"

    .line 114
    .line 115
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    const/4 v7, 0x0

    .line 120
    if-eqz v6, :cond_7

    .line 121
    .line 122
    invoke-static {}, La/a;->E()Luf/c;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    move v10, v3

    .line 131
    :goto_3
    if-lt v10, v9, :cond_4

    .line 132
    .line 133
    invoke-static {v8}, La/a;->t(Luf/c;)Luf/c;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    goto :goto_5

    .line 138
    :cond_4
    invoke-virtual {v6, v10}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v11

    .line 142
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 146
    .line 147
    .line 148
    move-result v12

    .line 149
    if-nez v12, :cond_5

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_5
    move-object v11, v7

    .line 153
    :goto_4
    if-eqz v11, :cond_6

    .line 154
    .line 155
    invoke-virtual {v8, v11}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_6
    add-int/lit8 v10, v10, 0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_7
    :goto_5
    if-nez v7, :cond_8

    .line 162
    .line 163
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 164
    .line 165
    :cond_8
    const-string v6, "name"

    .line 166
    .line 167
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    if-eqz v6, :cond_9

    .line 176
    .line 177
    move-object v4, v5

    .line 178
    :cond_9
    new-instance v6, Lx8/a0;

    .line 179
    .line 180
    invoke-direct {v6, v5, v4, v7}, Lx8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1, v6}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    :cond_a
    :goto_6
    add-int/lit8 p0, p0, 0x1

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_b
    iget p0, p0, Lx8/w;->a:I

    .line 190
    .line 191
    const-string v0, "\u62c9\u53d6\u8bed\u97f3\u89d2\u8272\u5931\u8d25: HTTP "

    .line 192
    .line 193
    invoke-static {p0, v0}, Lokio/a;->d(ILjava/lang/String;)V

    .line 194
    .line 195
    .line 196
    const/4 p0, 0x0

    .line 197
    return-object p0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)Lx8/w;
    .locals 3

    .line 1
    const-string v0, "http://"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "https://"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "https://xiaozhi.me"

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move-object v0, p0

    .line 27
    :goto_1
    new-instance v1, Lokhttp3/Request$Builder;

    .line 28
    .line 29
    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0, p0}, Lx8/x;->b(Lokhttp3/Request$Builder;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v0, p1}, Lx8/x;->a(Lokhttp3/Request$Builder;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    sget-object p1, Lx8/x;->a:Lokhttp3/OkHttpClient;

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :try_start_0
    new-instance p1, Lx8/w;

    .line 61
    .line 62
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p0}, Lokhttp3/Response;->isSuccessful()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    invoke-virtual {v2}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    goto :goto_2

    .line 81
    :catchall_0
    move-exception p1

    .line 82
    goto :goto_3

    .line 83
    :cond_2
    const/4 v2, 0x0

    .line 84
    :goto_2
    if-nez v2, :cond_3

    .line 85
    .line 86
    const-string v2, ""

    .line 87
    .line 88
    :cond_3
    invoke-direct {p1, v2, v0, v1}, Lx8/w;-><init>(Ljava/lang/String;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 92
    .line 93
    .line 94
    return-object p1

    .line 95
    :goto_3
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    :catchall_1
    move-exception v0

    .line 97
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v0
.end method

.method public static j(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[Hchat:XiaozhiConsole] "

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, " "

    .line 10
    .line 11
    const-string v1, ""

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "-"

    .line 19
    .line 20
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v0, "+"

    .line 25
    .line 26
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    const-string v1, "86"

    .line 34
    .line 35
    invoke-static {p0, v1, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/16 v2, 0xd

    .line 46
    .line 47
    if-ne v1, v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0

    .line 54
    :cond_1
    const-string v0, "+86"

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lx8/x;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "phone"

    .line 12
    .line 13
    invoke-static {v0, p0}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "code"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v3, "\u624b\u673a\u53f7\u767b\u5f55\u8bf7\u6c42: phoneLen="

    .line 49
    .line 50
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, " codeLen="

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lx8/x;->j(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string p1, "/api/auth/phone-login"

    .line 72
    .line 73
    const-string v1, ""

    .line 74
    .line 75
    invoke-static {p1, v1, v0}, Lx8/x;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lx8/w;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget v0, p1, Lx8/w;->a:I

    .line 80
    .line 81
    iget-object v2, p1, Lx8/w;->c:Ljava/lang/String;

    .line 82
    .line 83
    iget-boolean p1, p1, Lx8/w;->b:Z

    .line 84
    .line 85
    const-string v3, " body="

    .line 86
    .line 87
    if-eqz p1, :cond_6

    .line 88
    .line 89
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_0

    .line 94
    .line 95
    const-string p1, "{}"

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    move-object p1, v2

    .line 99
    :goto_0
    new-instance v0, Lorg/json/JSONObject;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string p1, "success"

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-virtual {v0, p1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_2

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    invoke-static {v2}, Lx8/x;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v1, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v2, "\u624b\u673a\u53f7\u767b\u5f55\u4e1a\u52a1\u5931\u8d25: phoneLen="

    .line 124
    .line 125
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-string p0, "message"

    .line 145
    .line 146
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_1

    .line 155
    .line 156
    const-string p0, "\u767b\u5f55\u5931\u8d25"

    .line 157
    .line 158
    :cond_1
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :goto_1
    const/4 p0, 0x0

    .line 162
    return-object p0

    .line 163
    :cond_2
    const-string p0, "data"

    .line 164
    .line 165
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    if-eqz p0, :cond_3

    .line 170
    .line 171
    const-string p1, "token"

    .line 172
    .line 173
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    goto :goto_2

    .line 178
    :cond_3
    const/4 p0, 0x0

    .line 179
    :goto_2
    if-nez p0, :cond_4

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_4
    move-object v1, p0

    .line 183
    :goto_3
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    if-nez p0, :cond_5

    .line 188
    .line 189
    const-string p0, "\u624b\u673a\u53f7\u767b\u5f55\u6210\u529f tokenPresent=true"

    .line 190
    .line 191
    invoke-static {p0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    return-object v1

    .line 195
    :cond_5
    const-string p0, "\u767b\u5f55\u6210\u529f\u4f46\u672a\u8fd4\u56de token"

    .line 196
    .line 197
    invoke-static {p0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    invoke-static {v2}, Lx8/x;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    const-string v1, "\u624b\u673a\u53f7\u767b\u5f55\u5931\u8d25: HTTP "

    .line 210
    .line 211
    const-string v4, " phoneLen="

    .line 212
    .line 213
    invoke-static {v0, p0, v1, v4, v3}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-static {p0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 228
    .line 229
    invoke-static {v2}, Lx8/x;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v2, "\u767b\u5f55\u5931\u8d25: HTTP "

    .line 236
    .line 237
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v0, " "

    .line 244
    .line 245
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw p0
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lx8/w;
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/Request$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "https://xiaozhi.me"

    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0, p0}, Lx8/x;->b(Lokhttp3/Request$Builder;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p1}, Lx8/x;->a(Lokhttp3/Request$Builder;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string p0, "Content-Type"

    .line 23
    .line 24
    const-string p1, "application/json"

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v0, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 31
    .line 32
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v1, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v0, p2, p1}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    sget-object p1, Lx8/x;->a:Lokhttp3/OkHttpClient;

    .line 58
    .line 59
    invoke-virtual {p1, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    :try_start_0
    new-instance p1, Lx8/w;

    .line 68
    .line 69
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-virtual {p0}, Lokhttp3/Response;->isSuccessful()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_0

    .line 82
    .line 83
    invoke-virtual {v1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    goto :goto_1

    .line 90
    :cond_0
    const/4 v1, 0x0

    .line 91
    :goto_0
    if-nez v1, :cond_1

    .line 92
    .line 93
    const-string v1, ""

    .line 94
    .line 95
    :cond_1
    invoke-direct {p1, v1, p2, v0}, Lx8/w;-><init>(Ljava/lang/String;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    .line 98
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 99
    .line 100
    .line 101
    return-object p1

    .line 102
    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 103
    :catchall_1
    move-exception p2

    .line 104
    invoke-static {p0, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    throw p2
.end method

.method public static n(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string p0, "message"

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    const-string p0, "msg"

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    const-string p0, "code"

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_2

    .line 49
    :goto_1
    new-instance v0, Lsf/f;

    .line 50
    .line 51
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p0, v0

    .line 55
    :cond_2
    :goto_2
    nop

    .line 56
    instance-of v0, p0, Lsf/f;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    move-object v1, p0

    .line 62
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast v1, Ljava/lang/String;

    .line 66
    .line 67
    const/16 p0, 0x50

    .line 68
    .line 69
    invoke-static {p0, v1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public static o(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "\"token\"\\s*:\\s*\"[^\"]+\""

    .line 2
    .line 3
    const-string v1, "\"token\":\"***\""

    .line 4
    .line 5
    invoke-static {v0, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "\"phone\"\\s*:\\s*\"[^\"]+\""

    .line 10
    .line 11
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const-string v1, "\"phone\":\"***\""

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/16 v0, 0x1f4

    .line 32
    .line 33
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx8/v;
    .locals 15

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static/range {p0 .. p1}, Lx8/x;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v2, "agent_name"

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    const-string v3, "assistant_name"

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-static/range {p2 .. p2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v5, v4

    .line 47
    :goto_0
    const/4 v6, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    if-eqz v5, :cond_2

    .line 50
    .line 51
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    if-eqz v8, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v8, v7

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    :goto_1
    move v8, v6

    .line 61
    :goto_2
    if-nez v8, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move-object v5, v4

    .line 65
    :goto_3
    const-string v8, "llm_model"

    .line 66
    .line 67
    if-eqz v5, :cond_4

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_4
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    :goto_4
    invoke-virtual {v1, v8, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    if-eqz p3, :cond_5

    .line 78
    .line 79
    invoke-static/range {p3 .. p3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    goto :goto_5

    .line 88
    :cond_5
    move-object v5, v4

    .line 89
    :goto_5
    if-eqz v5, :cond_7

    .line 90
    .line 91
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-eqz v9, :cond_6

    .line 96
    .line 97
    goto :goto_6

    .line 98
    :cond_6
    move v9, v7

    .line 99
    goto :goto_7

    .line 100
    :cond_7
    :goto_6
    move v9, v6

    .line 101
    :goto_7
    if-nez v9, :cond_8

    .line 102
    .line 103
    move-object v4, v5

    .line 104
    :cond_8
    const-string v5, "tts_voice"

    .line 105
    .line 106
    if-eqz v4, :cond_9

    .line 107
    .line 108
    goto :goto_8

    .line 109
    :cond_9
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    :goto_8
    invoke-virtual {v1, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    const-string v4, "tts_speech_speed"

    .line 117
    .line 118
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-eqz v10, :cond_a

    .line 127
    .line 128
    const-string v9, "normal"

    .line 129
    .line 130
    :cond_a
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    const-string v4, "tts_pitch"

    .line 134
    .line 135
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    if-eqz v9, :cond_b

    .line 140
    .line 141
    goto :goto_9

    .line 142
    :cond_b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    :goto_9
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 147
    .line 148
    .line 149
    const-string v4, "asr_speed"

    .line 150
    .line 151
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 156
    .line 157
    .line 158
    const-string v4, "language"

    .line 159
    .line 160
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    if-eqz v10, :cond_c

    .line 169
    .line 170
    const-string v9, "lang_code"

    .line 171
    .line 172
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 177
    .line 178
    .line 179
    move-result v10

    .line 180
    if-eqz v10, :cond_c

    .line 181
    .line 182
    const-string v9, "zh"

    .line 183
    .line 184
    :cond_c
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    const-string v4, "character"

    .line 188
    .line 189
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 194
    .line 195
    .line 196
    const-string v4, "memory"

    .line 197
    .line 198
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 203
    .line 204
    .line 205
    const-string v4, "memory_by_speaker"

    .line 206
    .line 207
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v9

    .line 211
    if-eqz v9, :cond_d

    .line 212
    .line 213
    goto :goto_a

    .line 214
    :cond_d
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 215
    .line 216
    :goto_a
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    .line 218
    .line 219
    const-string v4, "mcp_endpoints"

    .line 220
    .line 221
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 222
    .line 223
    .line 224
    move-result-object v9

    .line 225
    if-eqz v9, :cond_e

    .line 226
    .line 227
    goto :goto_b

    .line 228
    :cond_e
    new-instance v9, Lorg/json/JSONArray;

    .line 229
    .line 230
    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 231
    .line 232
    .line 233
    :goto_b
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 234
    .line 235
    .line 236
    const-string v4, "memory_type"

    .line 237
    .line 238
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v9

    .line 242
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 243
    .line 244
    .line 245
    const-string v4, "teen_mode"

    .line 246
    .line 247
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    if-eqz v9, :cond_f

    .line 252
    .line 253
    goto :goto_c

    .line 254
    :cond_f
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 255
    .line 256
    :goto_c
    invoke-virtual {v1, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 257
    .line 258
    .line 259
    const-string v4, "knowledge_base_ids"

    .line 260
    .line 261
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-eqz v0, :cond_10

    .line 266
    .line 267
    goto :goto_d

    .line 268
    :cond_10
    new-instance v0, Lorg/json/JSONArray;

    .line 269
    .line 270
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 271
    .line 272
    .line 273
    :goto_d
    invoke-virtual {v1, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 274
    .line 275
    .line 276
    invoke-static/range {p1 .. p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    new-instance v4, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    const-string v9, "/api/agents/"

    .line 287
    .line 288
    invoke-direct {v4, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    const-string v0, "/config"

    .line 295
    .line 296
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0, p0, v1}, Lx8/x;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lx8/w;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    iget-boolean v1, v0, Lx8/w;->b:Z

    .line 308
    .line 309
    if-eqz v1, :cond_19

    .line 310
    .line 311
    iget-object v0, v0, Lx8/w;->c:Ljava/lang/String;

    .line 312
    .line 313
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    if-eqz v1, :cond_11

    .line 318
    .line 319
    const-string v0, "{}"

    .line 320
    .line 321
    :cond_11
    new-instance v1, Lorg/json/JSONObject;

    .line 322
    .line 323
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    const-string v0, "success"

    .line 327
    .line 328
    invoke-virtual {v1, v0, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-nez v0, :cond_13

    .line 333
    .line 334
    const-string p0, "message"

    .line 335
    .line 336
    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_12

    .line 345
    .line 346
    const-string p0, "\u4fdd\u5b58\u667a\u80fd\u4f53\u914d\u7f6e\u5931\u8d25"

    .line 347
    .line 348
    :cond_12
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    :goto_e
    const/4 p0, 0x0

    .line 352
    return-object p0

    .line 353
    :cond_13
    if-eqz p2, :cond_15

    .line 354
    .line 355
    invoke-static/range {p2 .. p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    if-eqz v0, :cond_14

    .line 360
    .line 361
    goto :goto_f

    .line 362
    :cond_14
    move v0, v7

    .line 363
    goto :goto_10

    .line 364
    :cond_15
    :goto_f
    move v0, v6

    .line 365
    :goto_10
    xor-int/2addr v0, v6

    .line 366
    if-eqz p3, :cond_16

    .line 367
    .line 368
    invoke-static/range {p3 .. p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 369
    .line 370
    .line 371
    move-result v1

    .line 372
    if-eqz v1, :cond_17

    .line 373
    .line 374
    :cond_16
    move v7, v6

    .line 375
    :cond_17
    xor-int/lit8 v1, v7, 0x1

    .line 376
    .line 377
    new-instance v4, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v6, "\u667a\u80fd\u4f53\u914d\u7f6e\u5df2\u4fdd\u5b58 agentId="

    .line 380
    .line 381
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    move-object/from16 v6, p1

    .line 385
    .line 386
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 387
    .line 388
    .line 389
    const-string v7, " modelSet="

    .line 390
    .line 391
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    const-string v0, " voiceSet="

    .line 398
    .line 399
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-static {v0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    invoke-static/range {p0 .. p1}, Lx8/x;->c(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v10

    .line 424
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 429
    .line 430
    .line 431
    move-result v1

    .line 432
    if-eqz v1, :cond_18

    .line 433
    .line 434
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    const-string v1, "\u667a\u80fd\u4f53 "

    .line 443
    .line 444
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    :cond_18
    move-object v11, v0

    .line 449
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v12

    .line 453
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    invoke-virtual {p0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v13

    .line 460
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v14

    .line 467
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    new-instance v9, Lx8/v;

    .line 471
    .line 472
    invoke-direct/range {v9 .. v14}, Lx8/v;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    .line 474
    .line 475
    return-object v9

    .line 476
    :cond_19
    iget p0, v0, Lx8/w;->a:I

    .line 477
    .line 478
    const-string v0, "\u4fdd\u5b58\u667a\u80fd\u4f53\u914d\u7f6e\u5931\u8d25: HTTP "

    .line 479
    .line 480
    invoke-static {p0, v0}, Lokio/a;->d(ILjava/lang/String;)V

    .line 481
    .line 482
    .line 483
    goto/16 :goto_e
.end method

.method public static q(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lx8/x;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "phone"

    .line 12
    .line 13
    invoke-static {v0, p0}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "captcha_code"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v3, "\u77ed\u4fe1\u9a8c\u8bc1\u7801\u8bf7\u6c42: phoneLen="

    .line 49
    .line 50
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, " captchaLen="

    .line 57
    .line 58
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lx8/x;->j(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string p1, "/api/auth/send-code"

    .line 72
    .line 73
    const-string v1, ""

    .line 74
    .line 75
    invoke-static {p1, v1, v0}, Lx8/x;->m(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lx8/w;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget v0, p1, Lx8/w;->a:I

    .line 80
    .line 81
    iget-object v1, p1, Lx8/w;->c:Ljava/lang/String;

    .line 82
    .line 83
    iget-boolean p1, p1, Lx8/w;->b:Z

    .line 84
    .line 85
    const-string v2, " body="

    .line 86
    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_0

    .line 94
    .line 95
    const-string p1, "{}"

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    move-object p1, v1

    .line 99
    :goto_0
    new-instance v0, Lorg/json/JSONObject;

    .line 100
    .line 101
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const-string p1, "success"

    .line 105
    .line 106
    const/4 v3, 0x0

    .line 107
    invoke-virtual {v0, p1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_2

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    invoke-static {v1}, Lx8/x;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    new-instance v1, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v3, "\u77ed\u4fe1\u9a8c\u8bc1\u7801\u4e1a\u52a1\u5931\u8d25: phoneLen="

    .line 124
    .line 125
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-string p0, "message"

    .line 145
    .line 146
    invoke-virtual {v0, p0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_1

    .line 155
    .line 156
    const-string p0, "\u77ed\u4fe1\u9a8c\u8bc1\u7801\u8bf7\u6c42\u5931\u8d25"

    .line 157
    .line 158
    :cond_1
    invoke-static {p0}, Lah/a;->h(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    new-instance p1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v0, "\u77ed\u4fe1\u9a8c\u8bc1\u7801\u5df2\u53d1\u9001 phoneLen="

    .line 169
    .line 170
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-static {p0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    invoke-static {v1}, Lx8/x;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    const-string v3, " phoneLen="

    .line 193
    .line 194
    const-string v4, "\u77ed\u4fe1\u9a8c\u8bc1\u7801\u8bf7\u6c42\u5931\u8d25: HTTP "

    .line 195
    .line 196
    invoke-static {v0, p0, v4, v3, v2}, Leh/a;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-static {p0}, Lx8/x;->j(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 211
    .line 212
    invoke-static {v1}, Lx8/x;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    new-instance v1, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v0, " "

    .line 225
    .line 226
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    throw p0
.end method
