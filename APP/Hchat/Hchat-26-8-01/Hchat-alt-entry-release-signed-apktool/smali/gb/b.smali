.class public abstract Lgb/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lokhttp3/MediaType;

.field public static final b:Lokhttp3/OkHttpClient;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 2
    .line 3
    const-string v1, "application/json; charset=utf-8"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lgb/b;->a:Lokhttp3/MediaType;

    .line 10
    .line 11
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 12
    .line 13
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-wide/16 v1, 0xf

    .line 17
    .line 18
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-wide/16 v1, 0x78

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-wide/16 v1, 0xb4

    .line 35
    .line 36
    invoke-virtual {v0, v1, v2, v3}, Lokhttp3/OkHttpClient$Builder;->callTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, Lgb/b;->b:Lokhttp3/OkHttpClient;

    .line 45
    .line 46
    return-void
.end method

.method public static a(Landroid/content/Context;Lgb/s;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    sget-object v2, Lgb/a;->h:Lgb/a;

    .line 8
    .line 9
    const-string v0, "v1"

    .line 10
    .line 11
    const-string v1, "plugins"

    .line 12
    .line 13
    const-string v3, "comments"

    .line 14
    .line 15
    filled-new-array {v0, v1, p2, v3}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-static {p2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p1}, Lgb/s;->a()Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string p1, "content"

    .line 28
    .line 29
    invoke-virtual {v4, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    move-object v1, p0

    .line 36
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "comment"

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    invoke-static {p1}, Lgb/q;->b(Lorg/json/JSONObject;)Lgb/c;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    new-instance p2, Lgb/d;

    .line 57
    .line 58
    const-string p3, "commentCount"

    .line 59
    .line 60
    const-wide/16 v0, 0x0

    .line 61
    .line 62
    invoke-virtual {p0, p3, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    cmp-long p0, v2, v0

    .line 67
    .line 68
    if-gez p0, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move-wide v0, v2

    .line 72
    :goto_0
    invoke-direct {p2, p1, v0, v1}, Lgb/d;-><init>(Lgb/c;J)V

    .line 73
    .line 74
    .line 75
    return-object p2

    .line 76
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string p1, "\u63d2\u4ef6\u4ed3\u5e93\u672a\u8fd4\u56de\u65b0\u8bc4\u8bba"

    .line 79
    .line 80
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p0

    .line 84
    :cond_2
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 85
    .line 86
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 87
    .line 88
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    move-object p0, v0

    .line 94
    new-instance p1, Lsf/f;

    .line 95
    .line 96
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    return-object p1
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Lgb/s;)Ljava/lang/Object;
    .locals 10

    .line 1
    const-string v0, "limit"

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_6

    .line 8
    .line 9
    const/16 v1, 0x64

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-static {v1, v2, v1}, Lr9/e0;->r(III)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    sget-object v5, Lgb/a;->g:Lgb/a;

    .line 17
    .line 18
    const-string v4, "v1"

    .line 19
    .line 20
    const-string v6, "plugins"

    .line 21
    .line 22
    const-string v7, "comments"

    .line 23
    .line 24
    filled-new-array {v4, v6, p1, v7}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    new-instance p1, Luf/g;

    .line 33
    .line 34
    invoke-direct {p1}, Luf/g;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {p1, v0, v4}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    if-eqz p2, :cond_1

    .line 45
    .line 46
    iget-object p2, p2, Lgb/s;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-nez v4, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 p2, 0x0

    .line 56
    :goto_0
    if-eqz p2, :cond_1

    .line 57
    .line 58
    const-string v4, "userWxId"

    .line 59
    .line 60
    invoke-virtual {p1, v4, p2}, Luf/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p1}, Luf/g;->c()Luf/g;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    move-object v4, p0

    .line 70
    invoke-static/range {v4 .. v9}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string p1, "items"

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    new-instance p1, Lorg/json/JSONArray;

    .line 88
    .line 89
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-static {}, La/a;->E()Luf/c;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    const/4 v5, 0x0

    .line 101
    :goto_2
    if-lt v5, v4, :cond_4

    .line 102
    .line 103
    invoke-static {p2}, La/a;->t(Luf/c;)Luf/c;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const-string p2, "total"

    .line 108
    .line 109
    const-wide/16 v4, 0x0

    .line 110
    .line 111
    invoke-virtual {p0, p2, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    cmp-long p2, v6, v4

    .line 116
    .line 117
    if-gez p2, :cond_3

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_3
    move-wide v4, v6

    .line 121
    :goto_3
    invoke-virtual {p0, v0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-static {p0, v2, v1}, Lr9/e0;->r(III)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    new-instance p2, Lgb/e;

    .line 130
    .line 131
    invoke-direct {p2, p1, v4, v5, p0}, Lgb/e;-><init>(Luf/c;JI)V

    .line 132
    .line 133
    .line 134
    return-object p2

    .line 135
    :cond_4
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    if-eqz v6, :cond_5

    .line 140
    .line 141
    invoke-static {v6}, Lgb/q;->b(Lorg/json/JSONObject;)Lgb/c;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    invoke-virtual {p2, v6}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_6
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 152
    .line 153
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 154
    .line 155
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    :catchall_0
    move-exception v0

    .line 160
    move-object p0, v0

    .line 161
    new-instance p1, Lsf/f;

    .line 162
    .line 163
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    return-object p1
.end method

.method public static c(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Lorg/json/JSONObject;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance p0, Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public static d(Landroid/content/Context;Lgb/m;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p1, Lgb/m;->a:Ljava/lang/String;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "v1"

    .line 10
    .line 11
    const-string v2, "plugins"

    .line 12
    .line 13
    filled-new-array {v1, v2, v0}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, Lorg/json/JSONObject;

    .line 22
    .line 23
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v0, "installId"

    .line 27
    .line 28
    invoke-static {p0}, Lgb/q;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    const-string v0, "ownerToken"

    .line 36
    .line 37
    iget-object v1, p1, Lgb/m;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    iget-object v5, p1, Lgb/m;->b:Ljava/lang/String;

    .line 43
    .line 44
    sget-object v2, Lgb/a;->i:Lgb/a;

    .line 45
    .line 46
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 47
    .line 48
    move-object v1, p0

    .line 49
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_0
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 56
    .line 57
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    move-object p0, v0

    .line 65
    new-instance p1, Lsf/f;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public static e(Landroid/content/Context;Lgb/s;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-static {p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_2

    .line 15
    .line 16
    sget-object v2, Lgb/a;->i:Lgb/a;

    .line 17
    .line 18
    const-string v0, "v1"

    .line 19
    .line 20
    const-string v1, "plugins"

    .line 21
    .line 22
    const-string v3, "comments"

    .line 23
    .line 24
    filled-new-array {v0, v1, p2, v3, p3}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    invoke-static {p2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {p1}, Lgb/s;->a()Lorg/json/JSONObject;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    move-object v1, p0

    .line 40
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string p1, "deleted"

    .line 49
    .line 50
    const/4 p2, 0x0

    .line 51
    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_1

    .line 56
    .line 57
    new-instance p1, Lgb/d;

    .line 58
    .line 59
    const-string p2, "commentCount"

    .line 60
    .line 61
    const-wide/16 v0, 0x0

    .line 62
    .line 63
    invoke-virtual {p0, p2, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 64
    .line 65
    .line 66
    move-result-wide p2

    .line 67
    cmp-long p0, p2, v0

    .line 68
    .line 69
    if-gez p0, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    move-wide v0, p2

    .line 73
    :goto_0
    const/4 p0, 0x0

    .line 74
    invoke-direct {p1, p0, v0, v1}, Lgb/d;-><init>(Lgb/c;J)V

    .line 75
    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_1
    const-string p0, "\u63d2\u4ef6\u4ed3\u5e93\u672a\u786e\u8ba4\u8bc4\u8bba\u5df2\u5220\u9664"

    .line 79
    .line 80
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_2
    const-string p0, "\u8bc4\u8bba ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 87
    .line 88
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_3
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 95
    .line 96
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 97
    .line 98
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    move-object p0, v0

    .line 104
    new-instance p1, Lsf/f;

    .line 105
    .line 106
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    return-object p1
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v2, Lgb/a;->g:Lgb/a;

    .line 8
    .line 9
    const-string v0, "v1"

    .line 10
    .line 11
    const-string v1, "plugins"

    .line 12
    .line 13
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, Lgb/q;->c(Lorg/json/JSONObject;)Lgb/o;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_0
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 40
    .line 41
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p0, v0

    .line 49
    new-instance p1, Lsf/f;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-object p1
.end method

.method public static g(Lorg/json/JSONObject;I)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Lorg/json/JSONObject;

    .line 12
    .line 13
    const-string v0, "message"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    if-eqz p0, :cond_2

    .line 31
    .line 32
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    const-string v0, ""

    .line 47
    .line 48
    :cond_3
    :goto_1
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_4

    .line 53
    .line 54
    const-string p0, "\u63d2\u4ef6\u4ed3\u5e93\u8bf7\u6c42\u5931\u8d25: HTTP "

    .line 55
    .line 56
    invoke-static {p1, p0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :cond_4
    return-object v0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v2, Lgb/a;->g:Lgb/a;

    .line 14
    .line 15
    const-string v0, "v1"

    .line 16
    .line 17
    const-string v1, "plugins"

    .line 18
    .line 19
    const-string v3, "snapshots"

    .line 20
    .line 21
    filled-new-array {v0, v1, p1, v3, p2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    move-object v1, p0

    .line 34
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0}, Lgb/q;->c(Lorg/json/JSONObject;)Lgb/o;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :cond_0
    const-string p0, "\u5386\u53f2\u7248\u672c ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 48
    .line 49
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 56
    .line 57
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 58
    .line 59
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    move-object p0, v0

    .line 65
    new-instance p1, Lsf/f;

    .line 66
    .line 67
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-object p1
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;Lgb/s;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v2, Lgb/a;->h:Lgb/a;

    .line 8
    .line 9
    const-string v0, "v1"

    .line 10
    .line 11
    const-string v1, "plugins"

    .line 12
    .line 13
    const-string v3, "likes"

    .line 14
    .line 15
    filled-new-array {v0, v1, p1, v3}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p2}, Lgb/s;->a()Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v1, p0

    .line 31
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Lgb/l;

    .line 40
    .line 41
    const-string p2, "liked"

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    const-string v0, "likeCount"

    .line 49
    .line 50
    const-wide/16 v1, 0x0

    .line 51
    .line 52
    invoke-virtual {p0, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    cmp-long p0, v3, v1

    .line 57
    .line 58
    if-gez p0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-wide v1, v3

    .line 62
    :goto_0
    invoke-direct {p1, v1, v2, p2}, Lgb/l;-><init>(JZ)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_1
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 67
    .line 68
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p0, v0

    .line 76
    new-instance p1, Lsf/f;

    .line 77
    .line 78
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    return-object p1
.end method

.method public static j(Landroid/content/Context;Ljava/lang/String;Lgb/s;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v2, Lgb/a;->g:Lgb/a;

    .line 8
    .line 9
    const-string v0, "v1"

    .line 10
    .line 11
    const-string v1, "plugins"

    .line 12
    .line 13
    const-string v3, "likes"

    .line 14
    .line 15
    filled-new-array {v0, v1, p1, v3}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string p1, "userWxId"

    .line 24
    .line 25
    iget-object p2, p2, Lgb/s;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {p1, p2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    move-object v1, p0

    .line 37
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Lgb/l;

    .line 46
    .line 47
    const-string p2, "liked"

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-virtual {p0, p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    const-string v0, "likeCount"

    .line 55
    .line 56
    const-wide/16 v1, 0x0

    .line 57
    .line 58
    invoke-virtual {p0, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    cmp-long p0, v3, v1

    .line 63
    .line 64
    if-gez p0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move-wide v1, v3

    .line 68
    :goto_0
    invoke-direct {p1, v1, v2, p2}, Lgb/l;-><init>(JZ)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_1
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 73
    .line 74
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 75
    .line 76
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    move-object p0, v0

    .line 82
    new-instance p1, Lsf/f;

    .line 83
    .line 84
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    return-object p1
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/Serializable;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_3

    .line 6
    .line 7
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_2

    .line 12
    .line 13
    invoke-static {p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    sget-object v2, Lgb/a;->h:Lgb/a;

    .line 20
    .line 21
    const-string v0, "v1"

    .line 22
    .line 23
    const-string v1, "plugins"

    .line 24
    .line 25
    const-string v3, "downloads"

    .line 26
    .line 27
    filled-new-array {v0, v1, p1, v3}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    new-instance v4, Lorg/json/JSONObject;

    .line 36
    .line 37
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 38
    .line 39
    .line 40
    const-string p1, "versionId"

    .line 41
    .line 42
    invoke-virtual {v4, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    const-string p1, "eventId"

    .line 46
    .line 47
    invoke-virtual {v4, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    .line 50
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    move-object v1, p0

    .line 54
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    const-string p1, "downloadCount"

    .line 63
    .line 64
    const-wide/16 p2, -0x1

    .line 65
    .line 66
    invoke-virtual {p0, p1, p2, p3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 67
    .line 68
    .line 69
    move-result-wide p0

    .line 70
    const-wide/16 p2, 0x0

    .line 71
    .line 72
    cmp-long p2, p0, p2

    .line 73
    .line 74
    if-ltz p2, :cond_0

    .line 75
    .line 76
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_0
    const-string p0, "\u63d2\u4ef6\u4ed3\u5e93\u672a\u8fd4\u56de\u6709\u6548\u4e0b\u8f7d\u91cf"

    .line 82
    .line 83
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 84
    .line 85
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_1
    const-string p0, "\u4e0b\u8f7d\u4e8b\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 90
    .line 91
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_2
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6\u7248\u672c ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 98
    .line 99
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 100
    .line 101
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p1

    .line 105
    :cond_3
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 106
    .line 107
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    move-object p0, v0

    .line 115
    new-instance p1, Lsf/f;

    .line 116
    .line 117
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    return-object p1
.end method

.method public static l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 10

    .line 1
    const-string v1, "ok"

    .line 2
    .line 3
    const-string v2, " path=/"

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, p0

    .line 16
    :goto_0
    const-string v3, "Hchat_script_plugin_market"

    .line 17
    .line 18
    invoke-static {v0, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v3, "service_url"

    .line 23
    .line 24
    const-string v4, "https://hchat.208.75.133.91.sslip.io"

    .line 25
    .line 26
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v5, 0x1

    .line 32
    const/4 v6, 0x0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    new-array v7, v5, [C

    .line 46
    .line 47
    const/16 v8, 0x2f

    .line 48
    .line 49
    aput-char v8, v7, v3

    .line 50
    .line 51
    invoke-static {v0, v7}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v0, v6

    .line 57
    :goto_1
    const-string v7, ""

    .line 58
    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    move-object v0, v7

    .line 62
    :cond_2
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-eqz v8, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object v4, v0

    .line 70
    :goto_2
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :try_start_0
    sget-object v4, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    .line 79
    .line 80
    invoke-virtual {v4, v0}, Lokhttp3/HttpUrl$Companion;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 81
    .line 82
    .line 83
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    goto :goto_3

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    new-instance v4, Lsf/f;

    .line 87
    .line 88
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object v0, v4

    .line 92
    :goto_3
    nop

    .line 93
    instance-of v4, v0, Lsf/f;

    .line 94
    .line 95
    if-eqz v4, :cond_4

    .line 96
    .line 97
    move-object v0, v6

    .line 98
    :cond_4
    check-cast v0, Lokhttp3/HttpUrl;

    .line 99
    .line 100
    if-eqz v0, :cond_1d

    .line 101
    .line 102
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const-string v8, "https"

    .line 107
    .line 108
    invoke-static {v4, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-nez v4, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    const-string v8, "http"

    .line 119
    .line 120
    invoke-static {v4, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_5

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_5
    const-string p0, "\u63d2\u4ef6\u4ed3\u5e93\u53ea\u652f\u6301 HTTP/HTTPS \u5730\u5740"

    .line 128
    .line 129
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-object v6

    .line 133
    :cond_6
    :goto_4
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_8

    .line 146
    .line 147
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    check-cast v8, Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-nez v9, :cond_7

    .line 158
    .line 159
    const-string v9, "."

    .line 160
    .line 161
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    if-nez v9, :cond_7

    .line 166
    .line 167
    const-string v9, ".."

    .line 168
    .line 169
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-nez v9, :cond_7

    .line 174
    .line 175
    invoke-virtual {v0, v8}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 176
    .line 177
    .line 178
    goto :goto_5

    .line 179
    :cond_7
    const-string p0, "\u63d2\u4ef6\u4ed3\u5e93\u8def\u5f84\u65e0\u6548"

    .line 180
    .line 181
    invoke-static {p0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-object v6

    .line 185
    :cond_8
    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 186
    .line 187
    .line 188
    move-result-object p5

    .line 189
    invoke-interface {p5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 190
    .line 191
    .line 192
    move-result-object p5

    .line 193
    :cond_9
    :goto_6
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_a

    .line 198
    .line 199
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    check-cast v4, Ljava/util/Map$Entry;

    .line 204
    .line 205
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    check-cast v8, Ljava/lang/String;

    .line 210
    .line 211
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    check-cast v4, Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    if-nez v9, :cond_9

    .line 222
    .line 223
    invoke-virtual {v0, v8, v4}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 224
    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_a
    invoke-virtual {v0}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 228
    .line 229
    .line 230
    move-result-object p5

    .line 231
    new-instance v0, Lokhttp3/Request$Builder;

    .line 232
    .line 233
    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, p5}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    .line 237
    .line 238
    .line 239
    move-result-object p5

    .line 240
    const-string v0, "Accept"

    .line 241
    .line 242
    const-string v4, "application/json"

    .line 243
    .line 244
    invoke-virtual {p5, v0, v4}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 245
    .line 246
    .line 247
    move-result-object p5

    .line 248
    const-string v0, "X-Hchat-Install-Id"

    .line 249
    .line 250
    invoke-static {p0}, Lgb/q;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    invoke-virtual {p5, v0, p0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    if-eqz p4, :cond_c

    .line 259
    .line 260
    invoke-static {p4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 261
    .line 262
    .line 263
    move-result-object p4

    .line 264
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p4

    .line 268
    if-eqz p4, :cond_c

    .line 269
    .line 270
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 271
    .line 272
    .line 273
    move-result p5

    .line 274
    if-nez p5, :cond_b

    .line 275
    .line 276
    goto :goto_7

    .line 277
    :cond_b
    move-object p4, v6

    .line 278
    :goto_7
    if-eqz p4, :cond_c

    .line 279
    .line 280
    const-string p5, "Bearer "

    .line 281
    .line 282
    invoke-virtual {p5, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object p4

    .line 286
    const-string p5, "Authorization"

    .line 287
    .line 288
    invoke-virtual {p0, p5, p4}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 289
    .line 290
    .line 291
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 292
    .line 293
    .line 294
    move-result p4

    .line 295
    if-eqz p4, :cond_11

    .line 296
    .line 297
    sget-object p5, Lgb/b;->a:Lokhttp3/MediaType;

    .line 298
    .line 299
    if-eq p4, v5, :cond_f

    .line 300
    .line 301
    const/4 v0, 0x2

    .line 302
    if-ne p4, v0, :cond_e

    .line 303
    .line 304
    sget-object p4, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 305
    .line 306
    if-eqz p3, :cond_d

    .line 307
    .line 308
    goto :goto_8

    .line 309
    :cond_d
    new-instance p3, Lorg/json/JSONObject;

    .line 310
    .line 311
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 312
    .line 313
    .line 314
    :goto_8
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object p3

    .line 318
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-virtual {p4, p3, p5}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 322
    .line 323
    .line 324
    move-result-object p3

    .line 325
    invoke-virtual {p0, p3}, Lokhttp3/Request$Builder;->delete(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 326
    .line 327
    .line 328
    goto :goto_a

    .line 329
    :cond_e
    invoke-static {}, Lokio/a;->k()V

    .line 330
    .line 331
    .line 332
    return-object v6

    .line 333
    :cond_f
    sget-object p4, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 334
    .line 335
    if-eqz p3, :cond_10

    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_10
    new-instance p3, Lorg/json/JSONObject;

    .line 339
    .line 340
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 341
    .line 342
    .line 343
    :goto_9
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object p3

    .line 347
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    invoke-virtual {p4, p3, p5}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 351
    .line 352
    .line 353
    move-result-object p3

    .line 354
    invoke-virtual {p0, p3}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 355
    .line 356
    .line 357
    goto :goto_a

    .line 358
    :cond_11
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 359
    .line 360
    .line 361
    :goto_a
    const/16 p3, 0xa

    .line 362
    .line 363
    :try_start_1
    sget-object p4, Lgb/b;->b:Lokhttp3/OkHttpClient;
    :try_end_1
    .catch Lgb/f; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 364
    .line 365
    :try_start_2
    invoke-virtual {p0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    invoke-virtual {p4, p0}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    invoke-interface {p0}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 374
    .line 375
    .line 376
    move-result-object p0
    :try_end_2
    .catch Lgb/f; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 377
    :try_start_3
    invoke-virtual {p0}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 378
    .line 379
    .line 380
    move-result-object p4

    .line 381
    if-eqz p4, :cond_12

    .line 382
    .line 383
    invoke-virtual {p4}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 387
    goto :goto_b

    .line 388
    :catchall_1
    move-exception v0

    .line 389
    move-object p4, v0

    .line 390
    goto/16 :goto_12

    .line 391
    .line 392
    :cond_12
    move-object p4, v6

    .line 393
    :goto_b
    if-nez p4, :cond_13

    .line 394
    .line 395
    goto :goto_c

    .line 396
    :cond_13
    move-object v7, p4

    .line 397
    :goto_c
    :try_start_4
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 398
    .line 399
    .line 400
    move-result p4

    .line 401
    if-eqz p4, :cond_14

    .line 402
    .line 403
    const-string v7, "{}"

    .line 404
    .line 405
    goto :goto_d

    .line 406
    :catchall_2
    move-exception v0

    .line 407
    move-object p4, v0

    .line 408
    goto :goto_e

    .line 409
    :cond_14
    :goto_d
    new-instance p4, Lorg/json/JSONObject;

    .line 410
    .line 411
    invoke-direct {p4, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 412
    .line 413
    .line 414
    goto :goto_f

    .line 415
    :goto_e
    :try_start_5
    new-instance p5, Lsf/f;

    .line 416
    .line 417
    invoke-direct {p5, p4}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 418
    .line 419
    .line 420
    move-object p4, p5

    .line 421
    :goto_f
    invoke-static {p4}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 422
    .line 423
    .line 424
    move-result-object p5

    .line 425
    if-nez p5, :cond_19

    .line 426
    .line 427
    check-cast p4, Lorg/json/JSONObject;

    .line 428
    .line 429
    invoke-virtual {p4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 430
    .line 431
    .line 432
    move-result p5

    .line 433
    if-eqz p5, :cond_18

    .line 434
    .line 435
    invoke-virtual {p4, v1, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 436
    .line 437
    .line 438
    move-result p5

    .line 439
    invoke-virtual {p0}, Lokhttp3/Response;->isSuccessful()Z

    .line 440
    .line 441
    .line 442
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 443
    if-eqz v0, :cond_16

    .line 444
    .line 445
    if-nez p5, :cond_15

    .line 446
    .line 447
    goto :goto_10

    .line 448
    :cond_15
    :try_start_6
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catch Lgb/f; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 449
    .line 450
    .line 451
    return-object p4

    .line 452
    :catchall_3
    move-exception v0

    .line 453
    move-object p0, v0

    .line 454
    goto/16 :goto_13

    .line 455
    .line 456
    :catch_0
    move-exception v0

    .line 457
    move-object p0, v0

    .line 458
    move-object v3, p2

    .line 459
    goto/16 :goto_15

    .line 460
    .line 461
    :catch_1
    move-exception v0

    .line 462
    move-object p0, v0

    .line 463
    move-object v3, p2

    .line 464
    goto/16 :goto_18

    .line 465
    .line 466
    :cond_16
    :goto_10
    :try_start_7
    new-instance p5, Lgb/f;

    .line 467
    .line 468
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 469
    .line 470
    .line 471
    move-result v0

    .line 472
    invoke-static {p4, v0}, Lgb/b;->g(Lorg/json/JSONObject;I)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 477
    .line 478
    .line 479
    const-string v1, "error"

    .line 480
    .line 481
    invoke-virtual {p4, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 482
    .line 483
    .line 484
    move-result-object p4

    .line 485
    if-eqz p4, :cond_17

    .line 486
    .line 487
    const-string v1, "code"

    .line 488
    .line 489
    invoke-virtual {p4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p4

    .line 493
    if-eqz p4, :cond_17

    .line 494
    .line 495
    invoke-static {p4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 496
    .line 497
    .line 498
    move-result-object p4

    .line 499
    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object p4

    .line 503
    if-eqz p4, :cond_17

    .line 504
    .line 505
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    if-nez v1, :cond_17

    .line 510
    .line 511
    goto :goto_11

    .line 512
    :cond_17
    move-object p4, v6

    .line 513
    :goto_11
    const/4 v1, 0x4

    .line 514
    invoke-direct {p5, v0, v1, p4, v6}, Lgb/f;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 515
    .line 516
    .line 517
    throw p5

    .line 518
    :cond_18
    new-instance p4, Lgb/f;

    .line 519
    .line 520
    const-string p5, "\u63d2\u4ef6\u4ed3\u5e93\u54cd\u5e94\u7f3a\u5c11 ok \u5b57\u6bb5"

    .line 521
    .line 522
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 523
    .line 524
    .line 525
    const/16 v0, 0xc

    .line 526
    .line 527
    invoke-direct {p4, p5, v0, v6, v6}, Lgb/f;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 528
    .line 529
    .line 530
    throw p4

    .line 531
    :cond_19
    new-instance p4, Lgb/f;

    .line 532
    .line 533
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    new-instance v1, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 540
    .line 541
    .line 542
    const-string v3, "\u63d2\u4ef6\u4ed3\u5e93\u8fd4\u56de\u4e86\u65e0\u6548 JSON: HTTP "

    .line 543
    .line 544
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-virtual {p0}, Lokhttp3/Response;->code()I

    .line 555
    .line 556
    .line 557
    const/16 v1, 0x8

    .line 558
    .line 559
    invoke-direct {p4, v0, v1, v6, p5}, Lgb/f;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 560
    .line 561
    .line 562
    throw p4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 563
    :goto_12
    :try_start_8
    throw p4
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 564
    :catchall_4
    move-exception v0

    .line 565
    move-object p5, v0

    .line 566
    :try_start_9
    invoke-static {p0, p4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 567
    .line 568
    .line 569
    throw p5
    :try_end_9
    .catch Lgb/f; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 570
    :goto_13
    new-instance p4, Lgb/f;

    .line 571
    .line 572
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object p5

    .line 576
    if-eqz p5, :cond_1a

    .line 577
    .line 578
    goto :goto_14

    .line 579
    :cond_1a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    move-result-object p5

    .line 583
    invoke-virtual {p5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object p5

    .line 587
    :goto_14
    const-string v0, "\u63d2\u4ef6\u4ed3\u5e93\u8bf7\u6c42\u5931\u8d25: "

    .line 588
    .line 589
    invoke-virtual {v0, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object p5

    .line 593
    invoke-direct {p4, p5, p3, v6, p0}, Lgb/f;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object p0

    .line 600
    const/4 v7, 0x0

    .line 601
    const/16 v8, 0x3e

    .line 602
    .line 603
    const-string v4, "/"

    .line 604
    .line 605
    const/4 v5, 0x0

    .line 606
    const/4 v6, 0x0

    .line 607
    move-object v3, p2

    .line 608
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object p1

    .line 612
    new-instance p2, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    const-string p3, "[Hchat:PluginMarket] \u8bf7\u6c42\u5f02\u5e38 method="

    .line 615
    .line 616
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 623
    .line 624
    .line 625
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object p0

    .line 632
    invoke-static {p0, p4}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 633
    .line 634
    .line 635
    throw p4

    .line 636
    :catch_2
    move-exception v0

    .line 637
    move-object v3, p2

    .line 638
    move-object p0, v0

    .line 639
    :goto_15
    instance-of p2, p0, Ljava/net/SocketTimeoutException;

    .line 640
    .line 641
    if-nez p2, :cond_1c

    .line 642
    .line 643
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object p2

    .line 647
    if-eqz p2, :cond_1b

    .line 648
    .line 649
    goto :goto_16

    .line 650
    :cond_1b
    const-string p2, "\u7f51\u7edc\u4e0d\u53ef\u7528"

    .line 651
    .line 652
    :goto_16
    const-string p4, "\u63d2\u4ef6\u4ed3\u5e93\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: "

    .line 653
    .line 654
    invoke-virtual {p4, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object p2

    .line 658
    goto :goto_17

    .line 659
    :cond_1c
    const-string p2, "\u63d2\u4ef6\u4ed3\u5e93\u8bf7\u6c42\u8d85\u65f6"

    .line 660
    .line 661
    :goto_17
    new-instance p4, Lgb/f;

    .line 662
    .line 663
    invoke-direct {p4, p2, p3, v6, p0}, Lgb/f;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object p0

    .line 670
    const/4 v7, 0x0

    .line 671
    const/16 v8, 0x3e

    .line 672
    .line 673
    const-string v4, "/"

    .line 674
    .line 675
    const/4 v5, 0x0

    .line 676
    const/4 v6, 0x0

    .line 677
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object p1

    .line 681
    new-instance p2, Ljava/lang/StringBuilder;

    .line 682
    .line 683
    const-string p3, "[Hchat:PluginMarket] \u7f51\u7edc\u8bf7\u6c42\u5931\u8d25 method="

    .line 684
    .line 685
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object p0

    .line 701
    invoke-static {p0, p4}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 702
    .line 703
    .line 704
    throw p4

    .line 705
    :catch_3
    move-exception v0

    .line 706
    move-object v3, p2

    .line 707
    move-object p0, v0

    .line 708
    :goto_18
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object p1

    .line 712
    const/4 v7, 0x0

    .line 713
    const/16 v8, 0x3e

    .line 714
    .line 715
    const-string v4, "/"

    .line 716
    .line 717
    const/4 v5, 0x0

    .line 718
    const/4 v6, 0x0

    .line 719
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object p2

    .line 723
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object p3

    .line 727
    const-string p4, "[Hchat:PluginMarket] \u8bf7\u6c42\u5931\u8d25 method="

    .line 728
    .line 729
    const-string p5, " "

    .line 730
    .line 731
    invoke-static {p4, p1, v2, p2, p5}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 736
    .line 737
    .line 738
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object p1

    .line 742
    invoke-static {p1, p0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 743
    .line 744
    .line 745
    throw p0

    .line 746
    :cond_1d
    new-instance p0, Lgb/f;

    .line 747
    .line 748
    const-string p1, "\u63d2\u4ef6\u4ed3\u5e93\u5730\u5740\u65e0\u6548\uff0c\u8bf7\u5148\u914d\u7f6e\u5b8c\u6574\u7684 HTTPS \u5730\u5740"

    .line 749
    .line 750
    const/16 p2, 0xe

    .line 751
    .line 752
    invoke-direct {p0, p1, p2, v6, v6}, Lgb/f;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 753
    .line 754
    .line 755
    throw p0
.end method

.method public static m(Landroid/content/Context;Ljava/lang/String;Lgb/s;)Ljava/lang/Object;
    .locals 7

    .line 1
    :try_start_0
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v2, Lgb/a;->i:Lgb/a;

    .line 8
    .line 9
    const-string v0, "v1"

    .line 10
    .line 11
    const-string v1, "plugins"

    .line 12
    .line 13
    const-string v3, "likes"

    .line 14
    .line 15
    filled-new-array {v0, v1, p1, v3}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p2}, Lgb/s;->a()Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    move-object v1, p0

    .line 31
    invoke-static/range {v1 .. v6}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    new-instance p1, Lgb/l;

    .line 40
    .line 41
    const-string p2, "liked"

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    const-string v0, "likeCount"

    .line 49
    .line 50
    const-wide/16 v1, 0x0

    .line 51
    .line 52
    invoke-virtual {p0, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    cmp-long p0, v3, v1

    .line 57
    .line 58
    if-gez p0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-wide v1, v3

    .line 62
    :goto_0
    invoke-direct {p1, v1, v2, p2}, Lgb/l;-><init>(JZ)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_1
    const-string p0, "\u8fdc\u7a0b\u63d2\u4ef6 ID \u4e0d\u80fd\u4e3a\u7a7a"

    .line 67
    .line 68
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object p0, v0

    .line 76
    new-instance p1, Lsf/f;

    .line 77
    .line 78
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    return-object p1
.end method

.method public static n(Landroid/content/Context;Lgb/r;Lgb/m;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lgb/a;->h:Lgb/a;

    .line 5
    .line 6
    const-string v0, "v1"

    .line 7
    .line 8
    const-string v2, "plugins"

    .line 9
    .line 10
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object v0, p2, Lgb/m;->a:Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v6

    .line 25
    :goto_0
    invoke-virtual {p1, v0}, Lgb/r;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    iget-object p1, p2, Lgb/m;->b:Ljava/lang/String;

    .line 32
    .line 33
    move-object v4, p1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v4, v6

    .line 36
    :goto_1
    sget-object v5, Ltf/u;->g:Ltf/u;

    .line 37
    .line 38
    move-object v0, p0

    .line 39
    invoke-static/range {v0 .. v5}, Lgb/b;->l(Landroid/content/Context;Lgb/a;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/Map;)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Lgb/b;->c(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string p1, "ownership"

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-object p1, p0

    .line 57
    :goto_2
    const-string v0, "remotePluginId"

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    const-string v0, "pluginId"

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    const-string v0, "id"

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    :cond_4
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 88
    .line 89
    .line 90
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    const-string v2, ""

    .line 92
    .line 93
    if-eqz v1, :cond_6

    .line 94
    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    :try_start_1
    iget-object v0, p2, Lgb/m;->a:Ljava/lang/String;

    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_5
    move-object v0, v6

    .line 101
    :goto_3
    if-nez v0, :cond_6

    .line 102
    .line 103
    move-object v0, v2

    .line 104
    :cond_6
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v1, "ownerToken"

    .line 113
    .line 114
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_9

    .line 123
    .line 124
    if-eqz p2, :cond_7

    .line 125
    .line 126
    iget-object p1, p2, Lgb/m;->b:Ljava/lang/String;

    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_7
    move-object p1, v6

    .line 130
    :goto_4
    if-nez p1, :cond_8

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_8
    move-object v2, p1

    .line 134
    :goto_5
    move-object p1, v2

    .line 135
    :cond_9
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    if-nez p2, :cond_d

    .line 148
    .line 149
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-nez p2, :cond_c

    .line 154
    .line 155
    new-instance p2, Lgb/m;

    .line 156
    .line 157
    sget-object v1, Lgb/p;->g:La2/a;

    .line 158
    .line 159
    const-string v2, "reviewStatus"

    .line 160
    .line 161
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    if-eqz p0, :cond_a

    .line 169
    .line 170
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    if-eqz p0, :cond_a

    .line 179
    .line 180
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 181
    .line 182
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    :cond_a
    const-string p0, "pending"

    .line 190
    .line 191
    invoke-static {v6, p0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    move-result p0

    .line 195
    if-eqz p0, :cond_b

    .line 196
    .line 197
    sget-object p0, Lgb/p;->h:Lgb/p;

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_b
    sget-object p0, Lgb/p;->i:Lgb/p;

    .line 201
    .line 202
    :goto_6
    invoke-direct {p2, v0, p1, p0}, Lgb/m;-><init>(Ljava/lang/String;Ljava/lang/String;Lgb/p;)V

    .line 203
    .line 204
    .line 205
    return-object p2

    .line 206
    :cond_c
    const-string p0, "\u4e0a\u4f20\u6210\u529f\u4f46\u670d\u52a1\u7aef\u672a\u8fd4\u56de ownerToken"

    .line 207
    .line 208
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 209
    .line 210
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p1

    .line 214
    :cond_d
    const-string p0, "\u4e0a\u4f20\u6210\u529f\u4f46\u670d\u52a1\u7aef\u672a\u8fd4\u56de remotePluginId"

    .line 215
    .line 216
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 217
    .line 218
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    :catchall_0
    move-exception v0

    .line 223
    move-object p0, v0

    .line 224
    new-instance p1, Lsf/f;

    .line 225
    .line 226
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    return-object p1
.end method
