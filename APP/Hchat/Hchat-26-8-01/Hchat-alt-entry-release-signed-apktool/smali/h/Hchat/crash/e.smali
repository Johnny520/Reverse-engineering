.class public final synthetic Lh/Hchat/crash/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lh/Hchat/crash/e;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lh/Hchat/crash/e;->g:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object v0, Ly1/t;->W0:Lf/f0;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    iget-object v3, v0, Lf/f0;->a:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v4, v0, Lf/f0;->b:I

    .line 15
    .line 16
    const/16 v5, 0x1e

    .line 17
    .line 18
    if-ge v2, v5, :cond_1

    .line 19
    .line 20
    :goto_0
    if-ge v1, v4, :cond_2

    .line 21
    .line 22
    :try_start_1
    aget-object v2, v3, v1

    .line 23
    .line 24
    check-cast v2, Ly1/t;

    .line 25
    .line 26
    invoke-virtual {v2}, Ly1/t;->getShowLayoutBounds()Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    sget-object v6, Ly1/t;->T0:Ljava/lang/Class;

    .line 31
    .line 32
    invoke-static {}, Ly1/g0;->n()Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    invoke-virtual {v2, v6}, Ly1/t;->setShowLayoutBounds(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ly1/t;->getShowLayoutBounds()Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-eq v5, v6, :cond_0

    .line 44
    .line 45
    new-instance v5, Ly1/j;

    .line 46
    .line 47
    const/4 v6, 0x2

    .line 48
    invoke-direct {v5, v2, v6}, Ly1/j;-><init>(Ly1/t;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v1

    .line 56
    goto :goto_3

    .line 57
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    :goto_2
    if-ge v1, v4, :cond_2

    .line 61
    .line 62
    aget-object v2, v3, v1

    .line 63
    .line 64
    check-cast v2, Ly1/t;

    .line 65
    .line 66
    new-instance v5, Ly1/j;

    .line 67
    .line 68
    const/4 v6, 0x3

    .line 69
    invoke-direct {v5, v2, v6}, Ly1/j;-><init>(Ly1/t;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    .line 74
    .line 75
    add-int/lit8 v1, v1, 0x1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    monitor-exit v0

    .line 79
    return-void

    .line 80
    :goto_3
    monitor-exit v0

    .line 81
    throw v1

    .line 82
    :pswitch_0
    const-string v0, "cmd deviceidle whitelist +com.tencent.mm"

    .line 83
    .line 84
    invoke-static {v0}, Lw9/a;->e(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    const-string v0, "[Hchat:KeepAlive] Root Doze \u767d\u540d\u5355\u6267\u884c\u5931\u8d25"

    .line 91
    .line 92
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    return-void

    .line 96
    :pswitch_1
    const-string v0, "cmd appops set com.tencent.mm RUN_ANY_IN_BACKGROUND allow"

    .line 97
    .line 98
    const-string v1, "cmd appops set com.tencent.mm RUN_IN_BACKGROUND allow"

    .line 99
    .line 100
    const-string v2, "cmd appops set com.tencent.mm WAKE_LOCK allow"

    .line 101
    .line 102
    const-string v3, "cmd appops set com.tencent.mm START_FOREGROUND allow"

    .line 103
    .line 104
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v1}, Lw9/a;->e(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    if-nez v1, :cond_5

    .line 140
    .line 141
    const-string v0, "[Hchat:KeepAlive] Root AppOps \u653e\u884c\u6267\u884c\u4e0d\u5b8c\u6574"

    .line 142
    .line 143
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_6
    :goto_4
    return-void

    .line 147
    :pswitch_2
    :try_start_2
    new-instance v0, Ljava/net/URL;

    .line 148
    .line 149
    const-string v2, "https://connectivitycheck.gstatic.com/generate_204"

    .line 150
    .line 151
    invoke-direct {v0, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 162
    .line 163
    const/16 v2, 0xbb8

    .line 164
    .line 165
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 172
    .line 173
    .line 174
    const-string v1, "GET"

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 183
    .line 184
    .line 185
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 186
    .line 187
    goto :goto_5

    .line 188
    :catchall_1
    move-exception v0

    .line 189
    new-instance v1, Lsf/f;

    .line 190
    .line 191
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 192
    .line 193
    .line 194
    move-object v0, v1

    .line 195
    :goto_5
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-eqz v0, :cond_7

    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    new-instance v1, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    const-string v2, "[Hchat:KeepAlive] \u7f51\u7edc\u5fc3\u8df3\u5931\u8d25: "

    .line 208
    .line 209
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    :cond_7
    :pswitch_3
    return-void

    .line 223
    :pswitch_4
    sget-boolean v0, Lk9/r;->e:Z

    .line 224
    .line 225
    if-eqz v0, :cond_9

    .line 226
    .line 227
    sget-boolean v0, Lk9/r;->d:Z

    .line 228
    .line 229
    if-eqz v0, :cond_9

    .line 230
    .line 231
    sget-boolean v0, Lk9/r;->f:Z

    .line 232
    .line 233
    if-eqz v0, :cond_8

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    if-eqz v0, :cond_9

    .line 241
    .line 242
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    if-eqz v0, :cond_9

    .line 247
    .line 248
    sget-object v2, Lk9/r;->a:Lk9/r;

    .line 249
    .line 250
    invoke-static {v0}, Lk9/r;->q(Landroid/app/Activity;)Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_9

    .line 255
    .line 256
    new-instance v2, Lk9/p;

    .line 257
    .line 258
    invoke-direct {v2, v0, v1}, Lk9/p;-><init>(Landroid/app/Activity;I)V

    .line 259
    .line 260
    .line 261
    invoke-static {v2}, Lk9/r;->p(Lfg/a;)V

    .line 262
    .line 263
    .line 264
    :cond_9
    :goto_6
    return-void

    .line 265
    :pswitch_5
    sget-object v0, Lk9/r;->h:Ljava/lang/ref/WeakReference;

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, Landroid/view/View;

    .line 272
    .line 273
    if-eqz v0, :cond_a

    .line 274
    .line 275
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 276
    .line 277
    .line 278
    :cond_a
    return-void

    .line 279
    :pswitch_6
    sget-object v0, Lhb/m;->a:Lhb/l;

    .line 280
    .line 281
    :try_start_3
    invoke-static {v1}, Lhb/m;->c(Z)Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 282
    .line 283
    .line 284
    :catchall_2
    sget-object v0, Lhb/m;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :pswitch_7
    sget-object v0, Lh/Hchat/crash/g;->a:Lh/Hchat/crash/g;

    .line 291
    .line 292
    invoke-static {}, Lh/Hchat/crash/g;->d()V

    .line 293
    .line 294
    .line 295
    invoke-static {}, Lh/Hchat/crash/g;->e()V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
