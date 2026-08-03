.class public final Lw9/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static a:Landroid/os/PowerManager$WakeLock;

.field public static volatile b:Z

.field public static volatile c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Context;)V
    .locals 7

    .line 1
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_8

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    move-object p0, v1

    .line 14
    :cond_1
    const/4 v1, 0x0

    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_2
    :try_start_0
    const-string p1, "h.Hchat"

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    new-instance v2, Lsf/f;

    .line 28
    .line 29
    invoke-direct {v2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p1, v2

    .line 33
    :goto_0
    nop

    .line 34
    instance-of v2, p1, Lsf/f;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    move-object p1, v1

    .line 39
    :cond_3
    check-cast p1, Landroid/content/Context;

    .line 40
    .line 41
    :goto_1
    if-eqz p1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-eqz v1, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    move-object v1, p1

    .line 51
    :cond_5
    :goto_2
    const-string p1, "Hchat_wechat_keep_alive_config"

    .line 52
    .line 53
    invoke-static {p0, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v2, "wechat_keep_alive_enable"

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const-class v4, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;

    .line 65
    .line 66
    if-nez v2, :cond_7

    .line 67
    .line 68
    invoke-static {}, Lw9/a;->d()V

    .line 69
    .line 70
    .line 71
    if-eqz v1, :cond_13

    .line 72
    .line 73
    :try_start_1
    sget p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->k:I

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_6

    .line 80
    .line 81
    move-object v1, p0

    .line 82
    :cond_6
    new-instance p0, Landroid/content/Intent;

    .line 83
    .line 84
    invoke-direct {p0, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 88
    .line 89
    .line 90
    goto/16 :goto_8

    .line 91
    .line 92
    :cond_7
    const-string v2, "wechat_keep_alive_wake_lock"

    .line 93
    .line 94
    const/4 v5, 0x1

    .line 95
    invoke-interface {p1, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_9

    .line 100
    .line 101
    sget-object v2, Lw9/a;->a:Landroid/os/PowerManager$WakeLock;

    .line 102
    .line 103
    if-eqz v2, :cond_8

    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-ne v2, v5, :cond_8

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_8
    :try_start_2
    const-string v2, "power"

    .line 113
    .line 114
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    check-cast p0, Landroid/os/PowerManager;

    .line 122
    .line 123
    const-string v2, "Hchat:WeChatKeepAlive"

    .line 124
    .line 125
    invoke-virtual {p0, v5, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-virtual {p0, v3}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 133
    .line 134
    .line 135
    sput-object p0, Lw9/a;->a:Landroid/os/PowerManager$WakeLock;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 136
    .line 137
    move-object v2, v0

    .line 138
    goto :goto_3

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    new-instance v2, Lsf/f;

    .line 141
    .line 142
    invoke-direct {v2, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 143
    .line 144
    .line 145
    :goto_3
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-eqz p0, :cond_a

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const-string v6, "[Hchat:KeepAlive] \u83b7\u53d6 WakeLock \u5931\u8d25: "

    .line 156
    .line 157
    invoke-static {v6, v2, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_9
    invoke-static {}, Lw9/a;->d()V

    .line 162
    .line 163
    .line 164
    :cond_a
    :goto_4
    const-string p0, "wechat_keep_alive_foreground_service"

    .line 165
    .line 166
    invoke-interface {p1, p0, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    if-eqz p0, :cond_d

    .line 171
    .line 172
    if-eqz v1, :cond_c

    .line 173
    .line 174
    const-string p0, "wechat_keep_alive_watchdog"

    .line 175
    .line 176
    invoke-interface {p1, p0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    const-string v2, "wechat_keep_alive_network_heartbeat"

    .line 181
    .line 182
    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    :try_start_3
    sget v6, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->k:I

    .line 187
    .line 188
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    if-eqz v6, :cond_b

    .line 193
    .line 194
    move-object v1, v6

    .line 195
    :cond_b
    new-instance v6, Landroid/content/Intent;

    .line 196
    .line 197
    invoke-direct {v6, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 198
    .line 199
    .line 200
    const-string v4, "h.Hchat.extra.WATCHDOG"

    .line 201
    .line 202
    invoke-virtual {v6, v4, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 203
    .line 204
    .line 205
    const-string p0, "h.Hchat.extra.NETWORK_HEARTBEAT"

    .line 206
    .line 207
    invoke-virtual {v6, p0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v6}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 211
    .line 212
    .line 213
    goto :goto_5

    .line 214
    :catchall_2
    move-exception p0

    .line 215
    new-instance v0, Lsf/f;

    .line 216
    .line 217
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    :goto_5
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    if-eqz p0, :cond_f

    .line 225
    .line 226
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    const-string v1, "[Hchat:KeepAlive] \u542f\u52a8\u524d\u53f0\u670d\u52a1\u5931\u8d25: "

    .line 231
    .line 232
    invoke-static {v1, v0, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_c
    const-string p0, "[Hchat:KeepAlive] \u6a21\u5757 Context \u4e0d\u53ef\u7528\uff0c\u8df3\u8fc7\u524d\u53f0\u670d\u52a1"

    .line 237
    .line 238
    invoke-static {p0}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_d
    if-eqz v1, :cond_f

    .line 243
    .line 244
    :try_start_4
    sget p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->k:I

    .line 245
    .line 246
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    if-eqz p0, :cond_e

    .line 251
    .line 252
    move-object v1, p0

    .line 253
    :cond_e
    new-instance p0, Landroid/content/Intent;

    .line 254
    .line 255
    invoke-direct {p0, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, p0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 259
    .line 260
    .line 261
    :catchall_3
    :cond_f
    :goto_6
    const-string p0, "wechat_keep_alive_root_doze_whitelist"

    .line 262
    .line 263
    invoke-interface {p1, p0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 264
    .line 265
    .line 266
    move-result p0

    .line 267
    if-eqz p0, :cond_11

    .line 268
    .line 269
    sget-boolean p0, Lw9/a;->b:Z

    .line 270
    .line 271
    if-eqz p0, :cond_10

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_10
    sput-boolean v5, Lw9/a;->b:Z

    .line 275
    .line 276
    new-instance p0, Ljava/lang/Thread;

    .line 277
    .line 278
    new-instance v0, Lh/Hchat/crash/e;

    .line 279
    .line 280
    const/4 v1, 0x7

    .line 281
    invoke-direct {v0, v1}, Lh/Hchat/crash/e;-><init>(I)V

    .line 282
    .line 283
    .line 284
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 285
    .line 286
    .line 287
    const-string v0, "Hchat-KeepAlive-RootWhitelist"

    .line 288
    .line 289
    invoke-virtual {p0, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p0, v5}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 296
    .line 297
    .line 298
    :cond_11
    :goto_7
    const-string p0, "wechat_keep_alive_root_app_ops"

    .line 299
    .line 300
    invoke-interface {p1, p0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 301
    .line 302
    .line 303
    move-result p0

    .line 304
    if-eqz p0, :cond_13

    .line 305
    .line 306
    sget-boolean p0, Lw9/a;->c:Z

    .line 307
    .line 308
    if-eqz p0, :cond_12

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_12
    sput-boolean v5, Lw9/a;->c:Z

    .line 312
    .line 313
    new-instance p0, Ljava/lang/Thread;

    .line 314
    .line 315
    new-instance p1, Lh/Hchat/crash/e;

    .line 316
    .line 317
    const/4 v0, 0x6

    .line 318
    invoke-direct {p1, v0}, Lh/Hchat/crash/e;-><init>(I)V

    .line 319
    .line 320
    .line 321
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 322
    .line 323
    .line 324
    const-string p1, "Hchat-KeepAlive-RootAppOps"

    .line 325
    .line 326
    invoke-virtual {p0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0, v5}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 333
    .line 334
    .line 335
    :catchall_4
    :cond_13
    :goto_8
    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 1
    :try_start_0
    const-string v0, "power"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Landroid/os/PowerManager;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroid/os/PowerManager;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    const/4 v0, 0x0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    const-string v1, "com.tencent.mm"

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    const/4 v1, 0x1

    .line 25
    if-ne p0, v1, :cond_1

    .line 26
    .line 27
    move v0, v1

    .line 28
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    new-instance v0, Lsf/f;

    .line 35
    .line 36
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p0, v0

    .line 40
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    instance-of v1, p0, Lsf/f;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    move-object p0, v0

    .line 47
    :cond_2
    check-cast p0, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    return p0
.end method

.method public static c()Z
    .locals 4

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/ProcessBuilder;

    .line 2
    .line 3
    const-string v1, "sh"

    .line 4
    .line 5
    const-string v2, "-c"

    .line 6
    .line 7
    const-string v3, "pidof com.tencent.mm"

    .line 8
    .line 9
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {v0, v1}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    goto :goto_1

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    new-instance v1, Lsf/f;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object v0, v1

    .line 45
    :goto_1
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    instance-of v2, v0, Lsf/f;

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    move-object v0, v1

    .line 52
    :cond_1
    check-cast v0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    return v0
.end method

.method public static d()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Lw9/a;->a:Landroid/os/PowerManager$WakeLock;

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v0

    .line 14
    :goto_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    goto :goto_2

    .line 22
    :catchall_0
    move-exception v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object v1, v0

    .line 25
    goto :goto_2

    .line 26
    :goto_1
    new-instance v2, Lsf/f;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object v1, v2

    .line 32
    :goto_2
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v3, "[Hchat:KeepAlive] \u91ca\u653e WakeLock \u5931\u8d25: "

    .line 43
    .line 44
    invoke-static {v3, v2, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    sput-object v0, Lw9/a;->a:Landroid/os/PowerManager$WakeLock;

    .line 48
    .line 49
    return-void
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/ProcessBuilder;

    .line 2
    .line 3
    const-string v1, "su"

    .line 4
    .line 5
    const-string v2, "-c"

    .line 6
    .line 7
    filled-new-array {v1, v2, p0}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    new-instance v0, Lsf/f;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    move-object p0, v0

    .line 43
    :goto_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 44
    .line 45
    instance-of v1, p0, Lsf/f;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    move-object p0, v0

    .line 50
    :cond_1
    check-cast p0, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0
.end method
