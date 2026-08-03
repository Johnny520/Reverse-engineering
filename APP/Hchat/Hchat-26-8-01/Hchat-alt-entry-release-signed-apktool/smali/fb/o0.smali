.class public final Lfb/o0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lfb/b;

.field public final d:Lokhttp3/OkHttpClient;

.field public final e:Ljava/util/concurrent/atomic/AtomicLong;

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lfb/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfb/o0;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lfb/o0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lfb/o0;->c:Lfb/b;

    .line 9
    .line 10
    new-instance p1, Lokhttp3/OkHttpClient$Builder;

    .line 11
    .line 12
    invoke-direct {p1}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-wide/16 p2, 0xf

    .line 16
    .line 17
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    invoke-virtual {p1, p2, p3, v0}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-wide/16 p2, 0x3c

    .line 24
    .line 25
    invoke-virtual {p1, p2, p3, v0}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-wide/16 p2, 0x1e

    .line 30
    .line 31
    invoke-virtual {p1, p2, p3, v0}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, p0, Lfb/o0;->d:Lokhttp3/OkHttpClient;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 42
    .line 43
    const-wide/16 p2, 0x0

    .line 44
    .line 45
    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lfb/o0;->e:Ljava/util/concurrent/atomic/AtomicLong;

    .line 49
    .line 50
    const-string p1, ""

    .line 51
    .line 52
    iput-object p1, p0, Lfb/o0;->f:Ljava/lang/String;

    .line 53
    .line 54
    iput-object p1, p0, Lfb/o0;->h:Ljava/lang/String;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lfb/o0;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v0, "2024-11-05"

    .line 7
    .line 8
    const-string v1, "protocolVersion"

    .line 9
    .line 10
    invoke-static {v1, v0}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v2, Lorg/json/JSONObject;

    .line 15
    .line 16
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v3, "capabilities"

    .line 20
    .line 21
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    new-instance v2, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "name"

    .line 30
    .line 31
    const-string v4, "Hchat Plugin Agent"

    .line 32
    .line 33
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    const-string v3, "version"

    .line 37
    .line 38
    const-string v4, "1.0"

    .line 39
    .line 40
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    const-string v3, "clientInfo"

    .line 44
    .line 45
    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v2, "initialize"

    .line 49
    .line 50
    invoke-virtual {p0, v2, v0}, Lfb/o0;->d(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    const-string v1, "instructions"

    .line 68
    .line 69
    const-string v2, ""

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const/16 v1, 0xfa0

    .line 87
    .line 88
    invoke-static {v1, v0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lfb/o0;->h:Ljava/lang/String;

    .line 93
    .line 94
    new-instance v0, Lorg/json/JSONObject;

    .line 95
    .line 96
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v1, "2.0"

    .line 100
    .line 101
    const-string v2, "method"

    .line 102
    .line 103
    const-string v3, "jsonrpc"

    .line 104
    .line 105
    const-string v4, "notifications/initialized"

    .line 106
    .line 107
    invoke-static {v3, v1, v2, v4}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "params"

    .line 112
    .line 113
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    invoke-virtual {p0, v1, v0}, Lfb/o0;->c(Lorg/json/JSONObject;Z)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x1

    .line 121
    iput-boolean v0, p0, Lfb/o0;->g:Z

    .line 122
    .line 123
    return-void

    .line 124
    :cond_1
    const-string v0, "MCP initialize \u8fd4\u56de\u65e0\u6548"

    .line 125
    .line 126
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lfb/o0;->a()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    move-object v3, v2

    .line 17
    :cond_0
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const-string v5, "tools"

    .line 22
    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    new-instance v4, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-nez v6, :cond_2

    .line 42
    .line 43
    const-string v6, "cursor"

    .line 44
    .line 45
    invoke-virtual {v4, v6, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    :cond_2
    const-string v3, "tools/list"

    .line 49
    .line 50
    invoke-virtual {p0, v3, v4}, Lfb/o0;->d(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-eqz v4, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    new-instance v4, Lorg/json/JSONArray;

    .line 62
    .line 63
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    const/4 v7, 0x0

    .line 71
    :goto_1
    if-lt v7, v6, :cond_5

    .line 72
    .line 73
    const-string v4, "nextCursor"

    .line 74
    .line 75
    invoke-static {v4, v2, v3}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_0

    .line 84
    .line 85
    :goto_2
    new-instance v1, Lorg/json/JSONObject;

    .line 86
    .line 87
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 88
    .line 89
    .line 90
    iget-object v2, p0, Lfb/o0;->h:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_4

    .line 97
    .line 98
    const-string v2, "instructions"

    .line 99
    .line 100
    iget-object v3, p0, Lfb/o0;->h:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-virtual {v1, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    return-object v0

    .line 116
    :cond_5
    invoke-virtual {v4, v7}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 121
    .line 122
    .line 123
    add-int/lit8 v7, v7, 0x1

    .line 124
    .line 125
    goto :goto_1
.end method

.method public final c(Lorg/json/JSONObject;Z)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, "MCP HTTP "

    .line 2
    .line 3
    iget-object v1, p0, Lfb/o0;->c:Lfb/b;

    .line 4
    .line 5
    iget-object v2, v1, Lfb/b;->b:Ljava/util/Set;

    .line 6
    .line 7
    invoke-virtual {v1}, Lfb/b;->d()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lokhttp3/Request$Builder;

    .line 11
    .line 12
    invoke-direct {v3}, Lokhttp3/Request$Builder;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v4, p0, Lfb/o0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v3, v4}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "Accept"

    .line 22
    .line 23
    const-string v5, "application/json, text/event-stream"

    .line 24
    .line 25
    invoke-virtual {v3, v4, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "Content-Type"

    .line 30
    .line 31
    const-string v5, "application/json"

    .line 32
    .line 33
    invoke-virtual {v3, v4, v5}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const-string v4, "MCP-Protocol-Version"

    .line 38
    .line 39
    const-string v6, "2024-11-05"

    .line 40
    .line 41
    invoke-virtual {v3, v4, v6}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-object v4, p0, Lfb/o0;->f:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    const-string v6, "Mcp-Session-Id"

    .line 52
    .line 53
    if-nez v4, :cond_0

    .line 54
    .line 55
    iget-object v4, p0, Lfb/o0;->f:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v3, v6, v4}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 58
    .line 59
    .line 60
    :cond_0
    iget-object v4, p0, Lfb/o0;->b:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-nez v7, :cond_1

    .line 67
    .line 68
    const-string v7, "Authorization"

    .line 69
    .line 70
    invoke-virtual {v3, v7, v4}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 71
    .line 72
    .line 73
    :cond_1
    sget-object v4, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 74
    .line 75
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    sget-object v7, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 83
    .line 84
    invoke-virtual {v7, v5}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v4, p1, v5}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {v3, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iget-object v3, p0, Lfb/o0;->d:Lokhttp3/OkHttpClient;

    .line 101
    .line 102
    invoke-virtual {v3, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {v1, p1}, Lfb/b;->a(Lokhttp3/Call;)V

    .line 107
    .line 108
    .line 109
    :try_start_0
    invoke-interface {p1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 110
    .line 111
    .line 112
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 113
    :try_start_1
    invoke-virtual {v1}, Lfb/b;->d()V

    .line 114
    .line 115
    .line 116
    const/4 v4, 0x2

    .line 117
    const/4 v5, 0x0

    .line 118
    invoke-static {v3, v6, v5, v4, v5}, Lokhttp3/Response;->header$default(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    const-string v8, ""

    .line 123
    .line 124
    if-nez v7, :cond_2

    .line 125
    .line 126
    move-object v7, v8

    .line 127
    :cond_2
    :try_start_2
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v7

    .line 131
    if-nez v7, :cond_4

    .line 132
    .line 133
    invoke-static {v3, v6, v5, v4, v5}, Lokhttp3/Response;->header$default(Lokhttp3/Response;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    if-nez v4, :cond_3

    .line 138
    .line 139
    move-object v4, v8

    .line 140
    :cond_3
    iput-object v4, p0, Lfb/o0;->f:Ljava/lang/String;

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :catchall_0
    move-exception p2

    .line 144
    goto :goto_3

    .line 145
    :cond_4
    :goto_0
    invoke-virtual {v3}, Lokhttp3/Response;->isSuccessful()Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-eqz v4, :cond_9

    .line 150
    .line 151
    if-nez p2, :cond_5

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-virtual {v3}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    if-eqz p2, :cond_6

    .line 159
    .line 160
    invoke-virtual {p2}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    :cond_6
    if-nez v5, :cond_7

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_7
    move-object v8, v5

    .line 168
    :goto_1
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 169
    .line 170
    .line 171
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 172
    if-nez p2, :cond_8

    .line 173
    .line 174
    :goto_2
    :try_start_3
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 175
    .line 176
    .line 177
    invoke-interface {v2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    return-object v8

    .line 181
    :catchall_1
    move-exception p2

    .line 182
    goto :goto_4

    .line 183
    :cond_8
    :try_start_4
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 184
    .line 185
    const-string v0, "MCP \u8fd4\u56de\u4e3a\u7a7a"

    .line 186
    .line 187
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    throw p2

    .line 191
    :cond_9
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 192
    .line 193
    invoke-virtual {v3}, Lokhttp3/Response;->code()I

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    new-instance v5, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 213
    :goto_3
    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 214
    :catchall_2
    move-exception v0

    .line 215
    :try_start_6
    invoke-static {v3, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 219
    :goto_4
    :try_start_7
    invoke-virtual {v1, p2}, Lfb/b;->b(Ljava/lang/Throwable;)Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    const/4 v1, 0x1

    .line 224
    if-ne v0, v1, :cond_a

    .line 225
    .line 226
    new-instance p2, Ljava/util/concurrent/CancellationException;

    .line 227
    .line 228
    const-string v0, "Agent \u5df2\u4e2d\u65ad"

    .line 229
    .line 230
    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw p2

    .line 234
    :catchall_3
    move-exception p2

    .line 235
    goto :goto_5

    .line 236
    :cond_a
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 237
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-interface {v2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    throw p2
.end method

.method public final d(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 10

    .line 1
    iget-object v0, p0, Lfb/o0;->e:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    new-instance v2, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "jsonrpc"

    .line 13
    .line 14
    const-string v4, "2.0"

    .line 15
    .line 16
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    const-string v3, "id"

    .line 20
    .line 21
    invoke-virtual {v2, v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    const-string v4, "method"

    .line 25
    .line 26
    invoke-virtual {v2, v4, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const-string v4, "params"

    .line 30
    .line 31
    invoke-virtual {v2, v4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-virtual {p0, v2, p2}, Lfb/o0;->c(Lorg/json/JSONObject;Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const/4 v4, 0x0

    .line 48
    const-string v5, "{"

    .line 49
    .line 50
    invoke-static {v2, v5, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    const-wide/high16 v5, -0x8000000000000000L

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    new-instance p2, Lorg/json/JSONObject;

    .line 60
    .line 61
    invoke-direct {p2, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, v3, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 65
    .line 66
    .line 67
    move-result-wide v2

    .line 68
    cmp-long v0, v2, v0

    .line 69
    .line 70
    if-nez v0, :cond_0

    .line 71
    .line 72
    move-object v7, p2

    .line 73
    :cond_0
    if-eqz v7, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    const-string p1, "MCP \u8fd4\u56de\u7684\u8bf7\u6c42 ID \u4e0d\u5339\u914d"

    .line 77
    .line 78
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    const/4 p1, 0x0

    .line 82
    return-object p1

    .line 83
    :cond_2
    new-instance v4, Ldg/n;

    .line 84
    .line 85
    const/4 v8, 0x4

    .line 86
    invoke-direct {v4, v2, v8}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    new-instance v2, Lfb/g0;

    .line 90
    .line 91
    const/4 v8, 0x3

    .line 92
    invoke-direct {v2, v8}, Lfb/g0;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {v4, v2}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    new-instance v4, Lfb/g0;

    .line 100
    .line 101
    const/4 v8, 0x4

    .line 102
    invoke-direct {v4, v8}, Lfb/g0;-><init>(I)V

    .line 103
    .line 104
    .line 105
    new-instance v8, Lng/i;

    .line 106
    .line 107
    invoke-direct {v8, v2, p2, v4}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 108
    .line 109
    .line 110
    new-instance v2, Lfb/g0;

    .line 111
    .line 112
    const/4 v4, 0x5

    .line 113
    invoke-direct {v2, v4}, Lfb/g0;-><init>(I)V

    .line 114
    .line 115
    .line 116
    invoke-static {v8, v2}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    new-instance v4, Lfb/g0;

    .line 121
    .line 122
    const/4 v8, 0x6

    .line 123
    invoke-direct {v4, v8}, Lfb/g0;-><init>(I)V

    .line 124
    .line 125
    .line 126
    new-instance v8, Lng/i;

    .line 127
    .line 128
    invoke-direct {v8, v2, p2, v4}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 129
    .line 130
    .line 131
    new-instance p2, Lfb/g0;

    .line 132
    .line 133
    const/4 v2, 0x7

    .line 134
    invoke-direct {p2, v2}, Lfb/g0;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-static {v8, p2}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    new-instance v2, Lng/h;

    .line 142
    .line 143
    invoke-direct {v2, p2}, Lng/h;-><init>(Lng/i;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    invoke-virtual {v2}, Lng/h;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    if-eqz p2, :cond_4

    .line 151
    .line 152
    invoke-virtual {v2}, Lng/h;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    move-object v4, p2

    .line 157
    check-cast v4, Lorg/json/JSONObject;

    .line 158
    .line 159
    invoke-virtual {v4, v3, v5, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 160
    .line 161
    .line 162
    move-result-wide v8

    .line 163
    cmp-long v4, v8, v0

    .line 164
    .line 165
    if-nez v4, :cond_3

    .line 166
    .line 167
    move-object v7, p2

    .line 168
    :cond_4
    check-cast v7, Lorg/json/JSONObject;

    .line 169
    .line 170
    if-eqz v7, :cond_7

    .line 171
    .line 172
    :goto_1
    const-string p2, "error"

    .line 173
    .line 174
    invoke-virtual {v7, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    const-string v0, "MCP "

    .line 179
    .line 180
    if-nez p2, :cond_6

    .line 181
    .line 182
    const-string p2, "result"

    .line 183
    .line 184
    invoke-virtual {v7, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    if-eqz p2, :cond_5

    .line 189
    .line 190
    return-object p2

    .line 191
    :cond_5
    const-string p2, " \u7f3a\u5c11 result"

    .line 192
    .line 193
    invoke-static {v0, p1, p2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    goto :goto_0

    .line 201
    :cond_6
    const-string v1, "message"

    .line 202
    .line 203
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {p2, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    const-string v1, " \u5931\u8d25: "

    .line 212
    .line 213
    invoke-static {v0, p1, v1, p2}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_7
    const-string p1, "MCP SSE \u4e2d\u6ca1\u6709\u5339\u914d\u7684\u8bf7\u6c42\u54cd\u5e94"

    .line 223
    .line 224
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto/16 :goto_0
.end method
