.class public final Lx8/j;
.super Lokhttp3/WebSocketListener;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lx8/j;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lx8/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Lokhttp3/WebSocketListener;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClosed(Lokhttp3/WebSocket;ILjava/lang/String;)V
    .locals 1

    .line 1
    iget p2, p0, Lx8/j;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, Lx8/j;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lx8/n;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Lx8/n;->c(Lokhttp3/WebSocket;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p2, Lx8/n;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lx8/m;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p1, Lx8/m;->e:Lx8/d;

    .line 31
    .line 32
    invoke-virtual {p1}, Lx8/d;->invoke()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :pswitch_0
    iget-object p2, p0, Lx8/j;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Lx8/k;

    .line 39
    .line 40
    iget-object p3, p2, Lx8/k;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p3, p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eq v0, p1, :cond_1

    .line 55
    .line 56
    :goto_0
    iget-object p1, p2, Lx8/k;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    const/4 p3, 0x0

    .line 59
    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p2, Lx8/k;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    invoke-static {p2}, Lx8/k;->a(Lx8/k;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onFailure(Lokhttp3/WebSocket;Ljava/lang/Throwable;Lokhttp3/Response;)V
    .locals 1

    .line 1
    iget v0, p0, Lx8/j;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lx8/j;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lx8/n;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lx8/n;->c(Lokhttp3/WebSocket;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v0, Lx8/n;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lx8/m;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p1, Lx8/m;->d:Lc9/z0;

    .line 31
    .line 32
    invoke-virtual {p1, p2, p3}, Lc9/z0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :pswitch_0
    iget-object p2, p0, Lx8/j;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Lx8/k;

    .line 39
    .line 40
    iget-object p3, p2, Lx8/k;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p3, p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eq v0, p1, :cond_1

    .line 55
    .line 56
    :goto_0
    iget-object p1, p2, Lx8/k;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 57
    .line 58
    const/4 p3, 0x0

    .line 59
    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 60
    .line 61
    .line 62
    invoke-static {p2}, Lx8/k;->a(Lx8/k;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onMessage(Lokhttp3/WebSocket;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget v0, p0, Lx8/j;->a:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lx8/j;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lx8/n;

    .line 15
    .line 16
    iget-object v1, v0, Lx8/n;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-virtual {v0}, Lx8/n;->e()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 22
    .line 23
    invoke-direct {v2, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p2, "type"

    .line 27
    .line 28
    invoke-virtual {v2, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string v3, "hello"

    .line 33
    .line 34
    invoke-static {p2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    const/4 v3, 0x0

    .line 39
    sget-object v4, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    :try_start_1
    const-string p2, "audio_params"

    .line 44
    .line 45
    invoke-virtual {v2, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-object v2, v0, Lx8/n;->j:Ljava/util/concurrent/atomic/AtomicReference;

    .line 50
    .line 51
    invoke-virtual {v2, p2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, v0, Lx8/n;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lx8/m;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    iget-object v1, v0, Lx8/m;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    iget-object v0, v0, Lx8/m;->a:Lwb/o7;

    .line 78
    .line 79
    invoke-virtual {v0, p1, p2}, Lwb/o7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    :cond_0
    :goto_0
    move-object v3, v4

    .line 83
    goto :goto_2

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    check-cast p2, Lx8/m;

    .line 91
    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    iget-object p2, p2, Lx8/m;->b:Lwb/qp;

    .line 95
    .line 96
    invoke-virtual {p2, p1, v2}, Lwb/qp;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :goto_1
    new-instance v3, Lsf/f;

    .line 101
    .line 102
    invoke-direct {v3, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_2
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    if-eqz p1, :cond_3

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    const-string v0, "[Hchat:AutoReply] \u5c0f\u667aAI \u6570\u636e\u89e3\u6790\u5931\u8d25: "

    .line 116
    .line 117
    invoke-static {v0, p2, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    return-void

    .line 121
    :pswitch_0
    iget-object v0, p0, Lx8/j;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Lx8/k;

    .line 124
    .line 125
    :try_start_2
    new-instance v1, Lorg/json/JSONObject;

    .line 126
    .line 127
    invoke-direct {v1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    const-string p2, "method"

    .line 131
    .line 132
    invoke-virtual {v1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    const-string v2, "ping"

    .line 137
    .line 138
    invoke-static {p2, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_4

    .line 143
    .line 144
    const-string v2, "notifications/initialized"

    .line 145
    .line 146
    invoke-static {p2, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    if-nez p2, :cond_4

    .line 151
    .line 152
    iget-object p2, v0, Lx8/k;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 153
    .line 154
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 155
    .line 156
    .line 157
    move-result-wide v2

    .line 158
    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 159
    .line 160
    .line 161
    goto :goto_3

    .line 162
    :catchall_1
    move-exception p1

    .line 163
    goto :goto_4

    .line 164
    :cond_4
    :goto_3
    invoke-virtual {v0}, Lx8/k;->g()V

    .line 165
    .line 166
    .line 167
    const-string p2, "endpoint"

    .line 168
    .line 169
    invoke-virtual {v0, p2, v1}, Lx8/k;->d(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    if-eqz p2, :cond_5

    .line 174
    .line 175
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p2

    .line 179
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-interface {p1, p2}, Lokhttp3/WebSocket;->send(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 187
    .line 188
    .line 189
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 190
    goto :goto_5

    .line 191
    :goto_4
    new-instance p2, Lsf/f;

    .line 192
    .line 193
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 194
    .line 195
    .line 196
    move-object p1, p2

    .line 197
    :goto_5
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    if-eqz p1, :cond_5

    .line 202
    .line 203
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    const-string v0, "[Hchat:AutoReply] \u5c0f\u667aMCP\u6865\u63a5\u6d88\u606f\u5904\u7406\u5931\u8d25: "

    .line 208
    .line 209
    invoke-static {v0, p2, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    :cond_5
    return-void

    .line 213
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onMessage(Lokhttp3/WebSocket;Lokio/ByteString;)V
    .locals 1

    iget v0, p0, Lx8/j;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lokhttp3/WebSocketListener;->onMessage(Lokhttp3/WebSocket;Lokio/ByteString;)V

    return-void

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    iget-object p1, p0, Lx8/j;->b:Ljava/lang/Object;

    check-cast p1, Lx8/n;

    invoke-virtual {p1}, Lx8/n;->e()V

    .line 214
    iget-object p1, p1, Lx8/n;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 215
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx8/m;

    if-eqz p1, :cond_0

    .line 216
    iget-object p1, p1, Lx8/m;->c:Ld9/h;

    .line 217
    invoke-virtual {p1, p2}, Ld9/h;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onOpen(Lokhttp3/WebSocket;Lokhttp3/Response;)V
    .locals 5

    .line 1
    iget v0, p0, Lx8/j;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lx8/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v1, Lx8/n;

    .line 15
    .line 16
    invoke-virtual {v1}, Lx8/n;->e()V

    .line 17
    .line 18
    .line 19
    sget-object p2, Lx8/q;->a:Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    iget-object p2, v1, Lx8/n;->c:Lx8/t;

    .line 22
    .line 23
    iget-boolean v0, v1, Lx8/n;->d:Z

    .line 24
    .line 25
    new-instance v1, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "type"

    .line 31
    .line 32
    const-string v3, "hello"

    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const-string v2, "version"

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 41
    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p2, Lx8/t;->k:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    new-instance v0, Lorg/json/JSONObject;

    .line 62
    .line 63
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v2, "mcp"

    .line 67
    .line 68
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    const-string v2, "features"

    .line 72
    .line 73
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    :cond_0
    const-string v0, "transport"

    .line 77
    .line 78
    const-string v2, "websocket"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    new-instance v0, Lorg/json/JSONObject;

    .line 84
    .line 85
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v2, "format"

    .line 89
    .line 90
    const-string v4, "opus"

    .line 91
    .line 92
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    const-string v2, "sample_rate"

    .line 96
    .line 97
    const/16 v4, 0x3e80

    .line 98
    .line 99
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    const-string v2, "channels"

    .line 103
    .line 104
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 105
    .line 106
    .line 107
    const-string v2, "frame_duration"

    .line 108
    .line 109
    const/16 v3, 0x3c

    .line 110
    .line 111
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 112
    .line 113
    .line 114
    const-string v2, "audio_params"

    .line 115
    .line 116
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    invoke-static {v1, p2}, Lx8/q;->B(Lorg/json/JSONObject;Lx8/t;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-interface {p1, p2}, Lokhttp3/WebSocket;->send(Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_0
    check-cast v1, Lx8/k;

    .line 134
    .line 135
    iget-object p2, v1, Lx8/k;->l:Ljava/util/concurrent/atomic/AtomicLong;

    .line 136
    .line 137
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 138
    .line 139
    .line 140
    move-result-wide v2

    .line 141
    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lx8/k;->g()V

    .line 145
    .line 146
    .line 147
    iget-object p2, v1, Lx8/k;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 148
    .line 149
    const/4 v0, 0x0

    .line 150
    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 151
    .line 152
    .line 153
    new-instance p2, Lorg/json/JSONObject;

    .line 154
    .line 155
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v0, "jsonrpc"

    .line 159
    .line 160
    const-string v1, "2.0"

    .line 161
    .line 162
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    const-string v0, "method"

    .line 166
    .line 167
    const-string v1, "notifications/initialized"

    .line 168
    .line 169
    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    new-instance v0, Lorg/json/JSONObject;

    .line 173
    .line 174
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 175
    .line 176
    .line 177
    const-string v1, "params"

    .line 178
    .line 179
    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-interface {p1, p2}, Lokhttp3/WebSocket;->send(Ljava/lang/String;)Z

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
