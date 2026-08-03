.class public final Lx8/k;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:J

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final l:Ljava/util/concurrent/atomic/AtomicLong;

.field public final m:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lx8/k;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p3, p0, Lx8/k;->b:Z

    .line 13
    .line 14
    iput-object p4, p0, Lx8/k;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p5, p0, Lx8/k;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-wide p6, p0, Lx8/k;->e:J

    .line 19
    .line 20
    new-instance p3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    invoke-direct {p3, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p3, p0, Lx8/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lx8/k;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 33
    .line 34
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lx8/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    const/4 p3, 0x0

    .line 44
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 48
    .line 49
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 52
    .line 53
    .line 54
    iput-object p2, p0, Lx8/k;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, Lx8/k;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 62
    .line 63
    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 64
    .line 65
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 66
    .line 67
    .line 68
    move-result-wide p3

    .line 69
    invoke-direct {p2, p3, p4}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 70
    .line 71
    .line 72
    iput-object p2, p0, Lx8/k;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 73
    .line 74
    new-instance p2, Ljava/util/concurrent/CountDownLatch;

    .line 75
    .line 76
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    xor-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    invoke-direct {p2, p1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iput-object p2, p0, Lx8/k;->m:Ljava/util/concurrent/CountDownLatch;

    .line 86
    .line 87
    return-void
.end method

.method public static final a(Lx8/k;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lx8/k;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    .line 22
    .line 23
    new-instance v1, Lwb/cr;

    .line 24
    .line 25
    const/4 v3, 0x3

    .line 26
    invoke-direct {v1, p0, v3}, Lwb/cr;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    const-string p0, "Hchat-Xiaozhi-MCP-Reconnect"

    .line 30
    .line 31
    invoke-direct {v0, v1, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 2

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    const-string v1, "description"

    .line 4
    .line 5
    invoke-static {v0, p0, v1, p1}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance p1, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v0, "type"

    .line 15
    .line 16
    const-string v1, "object"

    .line 17
    .line 18
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    const-string v0, "properties"

    .line 22
    .line 23
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    .line 25
    .line 26
    const-string p2, "required"

    .line 27
    .line 28
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    const-string p2, "inputSchema"

    .line 32
    .line 33
    invoke-virtual {p0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lx8/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lx8/k;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lokhttp3/WebSocket;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/16 v1, 0x3e8

    .line 24
    .line 25
    invoke-interface {v0, v1, p1}, Lokhttp3/WebSocket;->close(ILjava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    iget-object v0, p0, Lx8/k;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    iget-object v1, p0, Lx8/k;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :try_start_0
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    iget-object v4, p0, Lx8/k;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    :try_start_1
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lokhttp3/WebSocket;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const-string v3, "main websocket mcp only"

    .line 33
    .line 34
    const/16 v4, 0x3e8

    .line 35
    .line 36
    invoke-interface {v1, v4, v3}, Lokhttp3/WebSocket;->close(ILjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_2
    new-instance v3, Lokhttp3/Request$Builder;

    .line 47
    .line 48
    invoke-direct {v3}, Lokhttp3/Request$Builder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v3, Lx8/q;->c:Lokhttp3/OkHttpClient;

    .line 60
    .line 61
    new-instance v5, Lx8/j;

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-direct {v5, p0, v6}, Lx8/j;-><init>(Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v1, v5}, Lokhttp3/OkHttpClient;->newWebSocket(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :goto_1
    new-instance v3, Lsf/f;

    .line 78
    .line 79
    invoke-direct {v3, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    move-object v1, v3

    .line 83
    :goto_2
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v2, "[Hchat:AutoReply] \u5c0f\u667aMCP\u6865\u63a5\u8fde\u63a5\u5931\u8d25: "

    .line 97
    .line 98
    invoke-static {v2, v0, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_3
    return-void
.end method

.method public final d(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string v3, "id"

    .line 10
    .line 11
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    :goto_0
    return-object v2

    .line 18
    :cond_1
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const-string v5, "method"

    .line 23
    .line 24
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_13

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    const-string v7, "hchat_kugou_order_music"

    .line 35
    .line 36
    iget-object v8, v0, Lx8/k;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-boolean v9, v0, Lx8/k;->b:Z

    .line 39
    .line 40
    const-string v10, "appId"

    .line 41
    .line 42
    const-string v11, "musicDataUrl"

    .line 43
    .line 44
    const-string v12, "musicUrl"

    .line 45
    .line 46
    const-string v13, "title"

    .line 47
    .line 48
    const-string v14, "hchat_share_music"

    .line 49
    .line 50
    const-string v15, "description"

    .line 51
    .line 52
    const-string v2, "type"

    .line 53
    .line 54
    move-object/from16 v16, v4

    .line 55
    .line 56
    const-string v4, "text"

    .line 57
    .line 58
    move/from16 v17, v6

    .line 59
    .line 60
    const-string v6, "hchat_send_text"

    .line 61
    .line 62
    move/from16 v18, v9

    .line 63
    .line 64
    const-string v9, "keyword"

    .line 65
    .line 66
    move-object/from16 v19, v3

    .line 67
    .line 68
    const-string v3, "name"

    .line 69
    .line 70
    move-object/from16 v20, v8

    .line 71
    .line 72
    const-string v8, "tools"

    .line 73
    .line 74
    sparse-switch v17, :sswitch_data_0

    .line 75
    .line 76
    .line 77
    :goto_1
    move-object v7, v0

    .line 78
    :goto_2
    move-object v8, v5

    .line 79
    goto/16 :goto_9

    .line 80
    .line 81
    :sswitch_0
    const-string v1, "initialize"

    .line 82
    .line 83
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    const-string v1, "protocolVersion"

    .line 91
    .line 92
    const-string v2, "2024-11-05"

    .line 93
    .line 94
    invoke-static {v1, v2}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    new-instance v1, Lorg/json/JSONObject;

    .line 99
    .line 100
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 101
    .line 102
    .line 103
    new-instance v4, Lorg/json/JSONObject;

    .line 104
    .line 105
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 109
    .line 110
    .line 111
    const-string v4, "capabilities"

    .line 112
    .line 113
    invoke-virtual {v2, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    .line 115
    .line 116
    new-instance v1, Lorg/json/JSONObject;

    .line 117
    .line 118
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v4, "Hchat"

    .line 122
    .line 123
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    const-string v3, "version"

    .line 127
    .line 128
    const-string v4, "1.0"

    .line 129
    .line 130
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    const-string v3, "serverInfo"

    .line 134
    .line 135
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    move-object v7, v0

    .line 139
    move-object v8, v5

    .line 140
    goto/16 :goto_a

    .line 141
    .line 142
    :sswitch_1
    const-string v1, "tools/list"

    .line 143
    .line 144
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_3

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    new-instance v1, Lorg/json/JSONObject;

    .line 152
    .line 153
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 154
    .line 155
    .line 156
    new-instance v3, Lorg/json/JSONArray;

    .line 157
    .line 158
    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    .line 159
    .line 160
    .line 161
    move-object/from16 v17, v5

    .line 162
    .line 163
    new-instance v5, Lorg/json/JSONObject;

    .line 164
    .line 165
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v0, "\u8981\u53d1\u9001\u5230\u5f53\u524d\u5fae\u4fe1\u4f1a\u8bdd\u7684\u6587\u5b57\u5185\u5bb9\uff0c\u5c3d\u91cf\u5c11\u4e8e1024\u5b57\u8282"

    .line 169
    .line 170
    move-object/from16 p1, v1

    .line 171
    .line 172
    const-string v1, "string"

    .line 173
    .line 174
    invoke-static {v2, v1, v15, v0}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-virtual {v5, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    .line 180
    .line 181
    new-instance v0, Lorg/json/JSONObject;

    .line 182
    .line 183
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 187
    .line 188
    .line 189
    move-object/from16 v21, v8

    .line 190
    .line 191
    const-string v8, "\u5f53\u524d Hchat \u4f1a\u8bdd session_id\uff1b\u5982\u679c\u4f60\u62ff\u5f97\u5230\uff0c\u8bf7\u4f7f\u7528\u7528\u6237\u6d88\u606f\u91cc\u7684\u539f\u503c"

    .line 192
    .line 193
    invoke-virtual {v0, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 194
    .line 195
    .line 196
    move-object/from16 v22, v7

    .line 197
    .line 198
    const-string v7, "session_id"

    .line 199
    .line 200
    invoke-virtual {v5, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    .line 202
    .line 203
    new-instance v0, Lorg/json/JSONArray;

    .line 204
    .line 205
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    const-string v4, "\u5f53\u7528\u6237\u8981\u6c42\u4f60\u901a\u8fc7\u5fae\u4fe1\u53d1\u9001\u3001\u901a\u77e5\u3001\u56de\u590d\u6587\u5b57\u65f6\uff0c\u4f7f\u7528\u6b64\u5de5\u5177\u628a\u6587\u5b57\u53d1\u9001\u5230\u5f53\u524d\u89e6\u53d1\u81ea\u52a8\u56de\u590d\u7684\u5fae\u4fe1\u4f1a\u8bdd\u3002\u4e0d\u80fd\u6307\u5b9a\u5176\u4ed6\u4f1a\u8bdd\u3002"

    .line 216
    .line 217
    invoke-static {v6, v4, v5, v0}, Lx8/k;->e(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;)Lorg/json/JSONObject;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 222
    .line 223
    .line 224
    new-instance v0, Lorg/json/JSONObject;

    .line 225
    .line 226
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 227
    .line 228
    .line 229
    const-string v4, "\u6b4c\u66f2\u6807\u9898"

    .line 230
    .line 231
    invoke-static {v2, v1, v15, v4}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v0, v13, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 236
    .line 237
    .line 238
    new-instance v4, Lorg/json/JSONObject;

    .line 239
    .line 240
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 244
    .line 245
    .line 246
    const-string v5, "\u6b4c\u624b\u6216\u63cf\u8ff0"

    .line 247
    .line 248
    invoke-virtual {v4, v15, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v0, v15, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 252
    .line 253
    .line 254
    new-instance v4, Lorg/json/JSONObject;

    .line 255
    .line 256
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 260
    .line 261
    .line 262
    const-string v5, "\u97f3\u4e50\u8be6\u60c5\u9875\u6216\u5206\u4eab\u9875 URL"

    .line 263
    .line 264
    invoke-virtual {v4, v15, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v12, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 268
    .line 269
    .line 270
    new-instance v4, Lorg/json/JSONObject;

    .line 271
    .line 272
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 276
    .line 277
    .line 278
    const-string v5, "\u53ef\u64ad\u653e\u7684\u97f3\u9891\u76f4\u94fe URL"

    .line 279
    .line 280
    invoke-virtual {v4, v15, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v11, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 284
    .line 285
    .line 286
    new-instance v4, Lorg/json/JSONObject;

    .line 287
    .line 288
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 292
    .line 293
    .line 294
    const-string v5, "\u5fae\u4fe1 appid\uff0c\u53ef\u7559\u7a7a"

    .line 295
    .line 296
    invoke-virtual {v4, v15, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0, v10, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 300
    .line 301
    .line 302
    new-instance v4, Lorg/json/JSONObject;

    .line 303
    .line 304
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 314
    .line 315
    .line 316
    new-instance v4, Lorg/json/JSONArray;

    .line 317
    .line 318
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    invoke-virtual {v4, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {v4, v11}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    const-string v5, "\u5f53\u4f60\u5df2\u7ecf\u83b7\u5f97\u6b4c\u66f2\u64ad\u653e\u94fe\u63a5\u65f6\uff0c\u4f7f\u7528\u6b64\u5de5\u5177\u53d1\u9001\u5fae\u4fe1\u97f3\u4e50\u5361\u7247\u5230\u5f53\u524d\u89e6\u53d1\u81ea\u52a8\u56de\u590d\u7684\u5fae\u4fe1\u4f1a\u8bdd\u3002\u4e0d\u80fd\u6307\u5b9a\u5176\u4ed6\u4f1a\u8bdd\u3002"

    .line 337
    .line 338
    invoke-static {v14, v5, v0, v4}, Lx8/k;->e(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;)Lorg/json/JSONObject;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 343
    .line 344
    .line 345
    if-eqz v18, :cond_4

    .line 346
    .line 347
    invoke-static/range {v20 .. v20}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-nez v0, :cond_4

    .line 352
    .line 353
    new-instance v0, Lorg/json/JSONObject;

    .line 354
    .line 355
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 356
    .line 357
    .line 358
    const-string v4, "\u4ece\u7528\u6237\u8bf7\u6c42\u4e2d\u63d0\u53d6\u51fa\u7684\u6b4c\u66f2\u540d\u3001\u6b4c\u624b\u540d\u6216\u7ec4\u5408\u5173\u952e\u8bcd\uff0c\u4f8b\u5982 \u6674\u5929\u3001\u5468\u6770\u4f26 \u6674\u5929\u3001\u6797\u4fca\u6770 \u9ed1\u591c\u95ee\u767d\u5929"

    .line 359
    .line 360
    invoke-static {v2, v1, v15, v4}, Lwb/en;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    invoke-virtual {v0, v9, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 365
    .line 366
    .line 367
    new-instance v4, Lorg/json/JSONObject;

    .line 368
    .line 369
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 379
    .line 380
    .line 381
    new-instance v1, Lorg/json/JSONArray;

    .line 382
    .line 383
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    const-string v2, "\u5f53\u7528\u6237\u8868\u8fbe\u60f3\u542c\u6b4c\u3001\u653e\u4e00\u9996\u6b4c\u3001\u64ad\u653e\u97f3\u4e50\u3001\u6765\u4e00\u9996\u67d0\u6b4c\u624b\u6216\u67d0\u6b4c\u66f2\u65f6\uff0c\u5148\u4ece\u7528\u6237\u8bdd\u91cc\u63d0\u53d6\u6b4c\u66f2\u540d\u3001\u6b4c\u624b\u540d\u6216\u7ec4\u5408\u5173\u952e\u8bcd\uff0c\u7136\u540e\u4f7f\u7528\u6b64\u5de5\u5177\u8c03\u7528 Hchat \u914d\u7f6e\u7684\u70b9\u6b4c\u5de5\u5177\uff0c\u5728\u5f53\u524d\u5fae\u4fe1\u4f1a\u8bdd\u641c\u7d22\u5e76\u53d1\u9001\u97f3\u4e50\u5361\u7247\u3002"

    .line 394
    .line 395
    move-object/from16 v5, v22

    .line 396
    .line 397
    invoke-static {v5, v2, v0, v1}, Lx8/k;->e(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;)Lorg/json/JSONObject;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 402
    .line 403
    .line 404
    :cond_4
    move-object/from16 v0, p1

    .line 405
    .line 406
    move-object/from16 v1, v21

    .line 407
    .line 408
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 409
    .line 410
    .line 411
    move-object/from16 v7, p0

    .line 412
    .line 413
    iget-object v1, v7, Lx8/k;->m:Ljava/util/concurrent/CountDownLatch;

    .line 414
    .line 415
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 416
    .line 417
    .line 418
    :goto_3
    move-object v2, v0

    .line 419
    move-object/from16 v8, v17

    .line 420
    .line 421
    goto/16 :goto_a

    .line 422
    .line 423
    :sswitch_2
    move-object/from16 v17, v5

    .line 424
    .line 425
    move-object v5, v7

    .line 426
    move-object v7, v0

    .line 427
    const-string v0, "tools/call"

    .line 428
    .line 429
    move-object/from16 v8, v17

    .line 430
    .line 431
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-nez v0, :cond_5

    .line 436
    .line 437
    goto/16 :goto_9

    .line 438
    .line 439
    :cond_5
    const-string v0, "params"

    .line 440
    .line 441
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    if-eqz v0, :cond_6

    .line 446
    .line 447
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    goto :goto_4

    .line 452
    :cond_6
    const/4 v1, 0x0

    .line 453
    :goto_4
    if-nez v1, :cond_7

    .line 454
    .line 455
    const-string v1, ""

    .line 456
    .line 457
    :cond_7
    if-eqz v0, :cond_8

    .line 458
    .line 459
    const-string v3, "arguments"

    .line 460
    .line 461
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    if-eqz v0, :cond_8

    .line 466
    .line 467
    goto :goto_5

    .line 468
    :cond_8
    new-instance v0, Lorg/json/JSONObject;

    .line 469
    .line 470
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 471
    .line 472
    .line 473
    :goto_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 474
    .line 475
    .line 476
    move-result v3

    .line 477
    move-object/from16 v17, v8

    .line 478
    .line 479
    const v8, -0x3613f23b

    .line 480
    .line 481
    .line 482
    const/16 v21, 0x0

    .line 483
    .line 484
    move-object/from16 v22, v2

    .line 485
    .line 486
    const/4 v2, 0x1

    .line 487
    if-eq v3, v8, :cond_e

    .line 488
    .line 489
    const v6, 0x1cd1dbc6

    .line 490
    .line 491
    .line 492
    if-eq v3, v6, :cond_b

    .line 493
    .line 494
    const v6, 0x66def3d9

    .line 495
    .line 496
    .line 497
    if-eq v3, v6, :cond_9

    .line 498
    .line 499
    goto/16 :goto_7

    .line 500
    .line 501
    :cond_9
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    if-nez v1, :cond_a

    .line 506
    .line 507
    goto/16 :goto_7

    .line 508
    .line 509
    :cond_a
    invoke-static {v9, v0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    if-nez v3, :cond_10

    .line 518
    .line 519
    if-eqz v18, :cond_10

    .line 520
    .line 521
    invoke-static/range {v20 .. v20}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    if-nez v3, :cond_10

    .line 526
    .line 527
    sget-object v3, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 528
    .line 529
    invoke-virtual {v7, v0}, Lx8/k;->h(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    iget-object v1, v7, Lx8/k;->d:Ljava/lang/String;

    .line 538
    .line 539
    move-object/from16 v5, v20

    .line 540
    .line 541
    invoke-virtual {v3, v5, v1, v0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->callPluginFunction-0E7RQCE(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    instance-of v0, v0, Lsf/f;

    .line 546
    .line 547
    if-nez v0, :cond_10

    .line 548
    .line 549
    :goto_6
    move/from16 v21, v2

    .line 550
    .line 551
    goto/16 :goto_7

    .line 552
    .line 553
    :cond_b
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    if-nez v1, :cond_c

    .line 558
    .line 559
    goto :goto_7

    .line 560
    :cond_c
    invoke-static {v13, v0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v25

    .line 564
    invoke-static {v15, v0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    invoke-static {v12, v0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v27

    .line 572
    invoke-static {v11, v0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v28

    .line 576
    invoke-static {v10, v0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v32

    .line 580
    invoke-virtual {v7, v0}, Lx8/k;->h(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v24

    .line 584
    invoke-static/range {v25 .. v25}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 585
    .line 586
    .line 587
    move-result v0

    .line 588
    if-nez v0, :cond_10

    .line 589
    .line 590
    invoke-static/range {v27 .. v27}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    if-nez v0, :cond_10

    .line 595
    .line 596
    invoke-static/range {v28 .. v28}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    if-nez v0, :cond_10

    .line 601
    .line 602
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    if-eqz v0, :cond_10

    .line 607
    .line 608
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    if-eqz v3, :cond_d

    .line 613
    .line 614
    const-string v1, "\u97f3\u4e50"

    .line 615
    .line 616
    :cond_d
    move-object/from16 v26, v1

    .line 617
    .line 618
    iget-object v0, v0, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 619
    .line 620
    const-string v29, ""

    .line 621
    .line 622
    const-string v30, ""

    .line 623
    .line 624
    const/16 v31, 0x0

    .line 625
    .line 626
    move-object/from16 v23, v0

    .line 627
    .line 628
    invoke-virtual/range {v23 .. v32}, Landroidx/lifecycle/x;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    if-ne v0, v2, :cond_10

    .line 633
    .line 634
    goto :goto_6

    .line 635
    :cond_e
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    move-result v1

    .line 639
    if-nez v1, :cond_f

    .line 640
    .line 641
    goto :goto_7

    .line 642
    :cond_f
    invoke-static {v4, v0}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-virtual {v7, v0}, Lx8/k;->h(Lorg/json/JSONObject;)Ljava/lang/String;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 651
    .line 652
    .line 653
    move-result v3

    .line 654
    if-nez v3, :cond_10

    .line 655
    .line 656
    sget-object v3, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 657
    .line 658
    invoke-static {v0, v1}, Lx8/q;->I(Ljava/lang/String;Ljava/lang/String;)Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-eqz v0, :cond_10

    .line 663
    .line 664
    goto :goto_6

    .line 665
    :cond_10
    :goto_7
    new-instance v0, Lorg/json/JSONObject;

    .line 666
    .line 667
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 668
    .line 669
    .line 670
    new-instance v1, Lorg/json/JSONArray;

    .line 671
    .line 672
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 673
    .line 674
    .line 675
    move-object/from16 v3, v22

    .line 676
    .line 677
    invoke-static {v3, v4}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    if-eqz v21, :cond_11

    .line 682
    .line 683
    const-string v5, "ok"

    .line 684
    .line 685
    goto :goto_8

    .line 686
    :cond_11
    const-string v5, "failed"

    .line 687
    .line 688
    :goto_8
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    const-string v3, "content"

    .line 696
    .line 697
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 698
    .line 699
    .line 700
    const-string v1, "isError"

    .line 701
    .line 702
    xor-int/lit8 v2, v21, 0x1

    .line 703
    .line 704
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 705
    .line 706
    .line 707
    goto/16 :goto_3

    .line 708
    .line 709
    :sswitch_3
    move-object v7, v0

    .line 710
    move-object/from16 v17, v5

    .line 711
    .line 712
    const-string v0, "ping"

    .line 713
    .line 714
    move-object/from16 v8, v17

    .line 715
    .line 716
    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 717
    .line 718
    .line 719
    move-result v0

    .line 720
    if-nez v0, :cond_12

    .line 721
    .line 722
    goto :goto_9

    .line 723
    :cond_12
    new-instance v2, Lorg/json/JSONObject;

    .line 724
    .line 725
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 726
    .line 727
    .line 728
    goto :goto_a

    .line 729
    :cond_13
    move-object v7, v0

    .line 730
    move-object/from16 v19, v3

    .line 731
    .line 732
    move-object/from16 v16, v4

    .line 733
    .line 734
    goto/16 :goto_2

    .line 735
    .line 736
    :goto_9
    const/4 v2, 0x0

    .line 737
    :goto_a
    const-string v0, "2.0"

    .line 738
    .line 739
    const-string v1, "jsonrpc"

    .line 740
    .line 741
    if-nez v2, :cond_15

    .line 742
    .line 743
    const-string v2, "Method not found: "

    .line 744
    .line 745
    invoke-static {v2, v8}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    invoke-static {v1, v0}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    if-eqz v16, :cond_14

    .line 754
    .line 755
    move-object/from16 v4, v16

    .line 756
    .line 757
    :goto_b
    move-object/from16 v3, v19

    .line 758
    .line 759
    goto :goto_c

    .line 760
    :cond_14
    sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 761
    .line 762
    goto :goto_b

    .line 763
    :goto_c
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 764
    .line 765
    .line 766
    new-instance v1, Lorg/json/JSONObject;

    .line 767
    .line 768
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 769
    .line 770
    .line 771
    const-string v3, "code"

    .line 772
    .line 773
    const/16 v4, -0x7f59

    .line 774
    .line 775
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 776
    .line 777
    .line 778
    const-string v3, "message"

    .line 779
    .line 780
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 781
    .line 782
    .line 783
    const-string v2, "error"

    .line 784
    .line 785
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 786
    .line 787
    .line 788
    return-object v0

    .line 789
    :cond_15
    move-object/from16 v3, v19

    .line 790
    .line 791
    invoke-static {v1, v0}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    if-eqz v16, :cond_16

    .line 796
    .line 797
    move-object/from16 v4, v16

    .line 798
    .line 799
    goto :goto_d

    .line 800
    :cond_16
    sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 801
    .line 802
    :goto_d
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 803
    .line 804
    .line 805
    const-string v1, "result"

    .line 806
    .line 807
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 808
    .line 809
    .line 810
    return-object v0

    .line 811
    :sswitch_data_0
    .sparse-switch
        0x348172 -> :sswitch_3
        0x1db8f212 -> :sswitch_2
        0x1dbd2852 -> :sswitch_1
        0x33ebcb90 -> :sswitch_0
    .end sparse-switch
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Lx8/k;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 8
    .line 9
    .line 10
    new-instance v2, Lx8/i;

    .line 11
    .line 12
    invoke-direct {v2, p2, v0, v1}, Lx8/i;-><init>(Ljava/lang/String;J)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lx8/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {p2, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, Lca/c;

    .line 25
    .line 26
    const/16 v2, 0x15

    .line 27
    .line 28
    invoke-direct {p2, v0, v1, v2}, Lca/c;-><init>(JI)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Lx8/h;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, p2, v1}, Lx8/h;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v0}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lx8/k;->g()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lx8/k;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :goto_0
    return-void

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    .line 22
    .line 23
    new-instance v1, Lrb/g;

    .line 24
    .line 25
    const/16 v3, 0x13

    .line 26
    .line 27
    invoke-direct {v1, p0, v3, p0}, Lrb/g;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const-string v3, "Hchat-Xiaozhi-MCP-Idle"

    .line 31
    .line 32
    invoke-direct {v0, v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final h(Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "session_id"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lx8/k;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lx8/i;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p1, Lx8/i;->a:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lx8/k;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    :goto_0
    sget-object v0, Lx8/q;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    return-object p1
.end method

.method public final i()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lx8/k;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v1

    .line 16
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lx8/k;->g()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
