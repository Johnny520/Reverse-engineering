.class public final Le9/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final d:Ljava/util/concurrent/ExecutorService;

.field public static final e:Ljava/util/concurrent/ExecutorService;

.field public static final f:Landroid/os/Handler;

.field public static final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final l:Ljava/lang/ThreadLocal;

.field public static volatile m:Ljava/lang/String;

.field public static volatile n:J

.field public static volatile o:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Le9/q;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Le9/q;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    new-instance v0, Lc9/q;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Le9/q;->d:Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    new-instance v0, Lc9/q;

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    invoke-direct {v0, v1}, Lc9/q;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Le9/q;->e:Ljava/util/concurrent/ExecutorService;

    .line 46
    .line 47
    new-instance v0, Landroid/os/Handler;

    .line 48
    .line 49
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Le9/q;->f:Landroid/os/Handler;

    .line 57
    .line 58
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v0, Le9/q;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 64
    .line 65
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, Le9/q;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    .line 74
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 75
    .line 76
    .line 77
    sput-object v0, Le9/q;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 78
    .line 79
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 82
    .line 83
    .line 84
    sput-object v0, Le9/q;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    .line 86
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    sput-object v0, Le9/q;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 92
    .line 93
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 96
    .line 97
    .line 98
    sput-object v0, Le9/q;->l:Ljava/lang/ThreadLocal;

    .line 99
    .line 100
    return-void
.end method

.method public static A(Le9/c;Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-boolean p0, p0, Le9/c;->o:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->conversations()Lh8/a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lh8/a;->e(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 p1, 0x1

    .line 18
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    move v0, p1

    .line 21
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    new-instance p1, Lsf/f;

    .line 28
    .line 29
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    move-object p0, p1

    .line 33
    :goto_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 34
    .line 35
    instance-of v0, p0, Lsf/f;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    move-object p0, p1

    .line 40
    :cond_2
    check-cast p0, Ljava/lang/Boolean;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public static final a(Landroid/content/Context;ILjava/lang/String;Z)V
    .locals 8

    .line 1
    const-string v0, "notification"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/app/NotificationManager;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/app/NotificationManager;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_a

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    :try_start_0
    invoke-virtual {v0}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    array-length v4, v3

    .line 27
    move v5, v1

    .line 28
    :goto_1
    if-ge v5, v4, :cond_2

    .line 29
    .line 30
    aget-object v6, v3, v5

    .line 31
    .line 32
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    if-nez v7, :cond_1

    .line 37
    .line 38
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-ne v7, p1, :cond_1

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_0
    move-exception v3

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object v6, v2

    .line 51
    :goto_2
    if-eqz v6, :cond_3

    .line 52
    .line 53
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    .line 54
    .line 55
    .line 56
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    goto :goto_4

    .line 58
    :cond_3
    move-object v3, v2

    .line 59
    goto :goto_4

    .line 60
    :goto_3
    new-instance v4, Lsf/f;

    .line 61
    .line 62
    invoke-direct {v4, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v3, v4

    .line 66
    :goto_4
    nop

    .line 67
    instance-of v4, v3, Lsf/f;

    .line 68
    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_4
    move-object v2, v3

    .line 73
    :goto_5
    check-cast v2, Landroid/app/Notification;

    .line 74
    .line 75
    if-eqz v2, :cond_9

    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 78
    .line 79
    .line 80
    move-result-wide v3

    .line 81
    :try_start_1
    invoke-static {p0, v2}, Landroid/app/Notification$Builder;->recoverBuilder(Landroid/content/Context;Landroid/app/Notification;)Landroid/app/Notification$Builder;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const/4 v5, 0x1

    .line 86
    invoke-virtual {p0, v5}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    if-eqz p3, :cond_5

    .line 91
    .line 92
    new-instance v6, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string v7, "\u5df2\u56de\u590d\uff1a"

    .line 98
    .line 99
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    goto :goto_6

    .line 110
    :catchall_1
    move-exception p0

    .line 111
    goto :goto_7

    .line 112
    :cond_5
    const-string v6, "\u53d1\u9001\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 113
    .line 114
    :goto_6
    invoke-virtual {p0, v6}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    new-instance v6, Landroid/os/Bundle;

    .line 119
    .line 120
    iget-object v2, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 121
    .line 122
    invoke-direct {v6, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 123
    .line 124
    .line 125
    const-string v2, "hchat_custom_notification_reply_completion_token"

    .line 126
    .line 127
    invoke-virtual {v6, v2, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0, v6}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    if-eqz p3, :cond_6

    .line 138
    .line 139
    new-array v2, v5, [Ljava/lang/CharSequence;

    .line 140
    .line 141
    aput-object p2, v2, v1

    .line 142
    .line 143
    invoke-virtual {p0, v2}, Landroid/app/Notification$Builder;->setRemoteInputHistory([Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 144
    .line 145
    .line 146
    :cond_6
    invoke-virtual {p0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-virtual {v0, p1, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 151
    .line 152
    .line 153
    sget-object p0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 154
    .line 155
    goto :goto_8

    .line 156
    :goto_7
    new-instance p2, Lsf/f;

    .line 157
    .line 158
    invoke-direct {p2, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 159
    .line 160
    .line 161
    move-object p0, p2

    .line 162
    :goto_8
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    if-eqz p0, :cond_7

    .line 167
    .line 168
    new-instance p2, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    const-string v1, "[Hchat:CustomNotification] \u5feb\u6377\u56de\u590d\u901a\u77e5\u72b6\u6001\u66f4\u65b0\u5931\u8d25: "

    .line 171
    .line 172
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    invoke-static {p2, p0}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    if-eqz p3, :cond_a

    .line 186
    .line 187
    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 188
    .line 189
    .line 190
    goto :goto_9

    .line 191
    :cond_7
    if-nez p3, :cond_8

    .line 192
    .line 193
    goto :goto_9

    .line 194
    :cond_8
    new-instance p0, Le9/f;

    .line 195
    .line 196
    invoke-direct {p0, v0, p1, v3, v4}, Le9/f;-><init>(Landroid/app/NotificationManager;IJ)V

    .line 197
    .line 198
    .line 199
    const-wide/16 p1, 0x4b0

    .line 200
    .line 201
    sget-object p3, Le9/q;->f:Landroid/os/Handler;

    .line 202
    .line 203
    invoke-virtual {p3, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 204
    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_9
    if-eqz p3, :cond_a

    .line 208
    .line 209
    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 210
    .line 211
    .line 212
    :cond_a
    :goto_9
    return-void
.end method

.method public static final b(Ljava/lang/Object;Landroid/content/Context;)V
    .locals 12

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_5

    .line 4
    .line 5
    :cond_0
    new-instance v0, Le9/s;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Le9/s;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "custom_notification_enable"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Le9/s;->b(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-string v2, "Hchat_custom_friend_avatar_config"

    .line 17
    .line 18
    invoke-static {p1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, "enable"

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x1

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-static {p1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "scope_notifications"

    .line 37
    .line 38
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    move v2, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    move v2, v5

    .line 47
    :goto_0
    const-string v3, "Hchat_block_at_all_notification_config"

    .line 48
    .line 49
    invoke-static {p1, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v3, "block_at_all_notification_enable"

    .line 54
    .line 55
    invoke-interface {p1, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    if-nez v2, :cond_2

    .line 62
    .line 63
    if-nez p1, :cond_2

    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :cond_2
    const-string v3, "talker"

    .line 68
    .line 69
    const-string v6, "talkerUserName"

    .line 70
    .line 71
    const-string v7, "h"

    .line 72
    .line 73
    const-string v8, "userName"

    .line 74
    .line 75
    const-string v9, "username"

    .line 76
    .line 77
    filled-new-array {v7, v8, v9, v3, v6}, [Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {p0, v3}, Le9/q;->w(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    const-string v6, "notification"

    .line 86
    .line 87
    const-string v7, "mNotification"

    .line 88
    .line 89
    const-string v8, "f"

    .line 90
    .line 91
    filled-new-array {v8, v6, v7}, [Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    move v7, v5

    .line 96
    :goto_1
    const/4 v8, 0x3

    .line 97
    const/4 v9, 0x0

    .line 98
    if-lt v7, v8, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_7

    .line 117
    .line 118
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    check-cast v7, Ljava/lang/reflect/Field;

    .line 123
    .line 124
    const-class v8, Landroid/app/Notification;

    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-virtual {v8, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 131
    .line 132
    .line 133
    move-result v8

    .line 134
    if-eqz v8, :cond_4

    .line 135
    .line 136
    invoke-static {v7, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    instance-of v8, v7, Landroid/app/Notification;

    .line 141
    .line 142
    if-eqz v8, :cond_4

    .line 143
    .line 144
    check-cast v7, Landroid/app/Notification;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    move-object v7, v9

    .line 148
    :goto_2
    if-eqz v7, :cond_3

    .line 149
    .line 150
    move-object v9, v7

    .line 151
    goto :goto_3

    .line 152
    :cond_5
    aget-object v8, v6, v7

    .line 153
    .line 154
    invoke-static {p0, v8}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    instance-of v10, v8, Landroid/app/Notification;

    .line 159
    .line 160
    if-eqz v10, :cond_6

    .line 161
    .line 162
    move-object v9, v8

    .line 163
    check-cast v9, Landroid/app/Notification;

    .line 164
    .line 165
    :cond_6
    if-eqz v9, :cond_13

    .line 166
    .line 167
    :cond_7
    :goto_3
    if-nez v1, :cond_8

    .line 168
    .line 169
    if-eqz p1, :cond_9

    .line 170
    .line 171
    :cond_8
    move v5, v4

    .line 172
    :cond_9
    const-wide/16 v6, 0x0

    .line 173
    .line 174
    if-eqz v5, :cond_a

    .line 175
    .line 176
    const-string v4, "i"

    .line 177
    .line 178
    const-string v8, "msgId"

    .line 179
    .line 180
    filled-new-array {v4, v8}, [Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-static {p0, v4}, Le9/q;->v(Ljava/lang/Object;[Ljava/lang/String;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v10

    .line 188
    goto :goto_4

    .line 189
    :cond_a
    move-wide v10, v6

    .line 190
    :goto_4
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    if-nez v4, :cond_12

    .line 195
    .line 196
    if-nez v9, :cond_b

    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_b
    iget-object v4, v9, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 200
    .line 201
    if-nez v4, :cond_c

    .line 202
    .line 203
    new-instance v4, Landroid/os/Bundle;

    .line 204
    .line 205
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 206
    .line 207
    .line 208
    iput-object v4, v9, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 209
    .line 210
    :cond_c
    const-string v4, "hchat_custom_notification_talker"

    .line 211
    .line 212
    if-nez v1, :cond_d

    .line 213
    .line 214
    if-nez v2, :cond_d

    .line 215
    .line 216
    if-eqz p1, :cond_e

    .line 217
    .line 218
    :cond_d
    iget-object p1, v9, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 219
    .line 220
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    :cond_e
    if-eqz v5, :cond_f

    .line 224
    .line 225
    cmp-long p1, v10, v6

    .line 226
    .line 227
    if-lez p1, :cond_f

    .line 228
    .line 229
    iget-object p1, v9, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 230
    .line 231
    const-string v2, "hchat_custom_notification_native_msg_svr_id"

    .line 232
    .line 233
    invoke-virtual {p1, v2, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 234
    .line 235
    .line 236
    :cond_f
    if-nez v1, :cond_10

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_10
    invoke-virtual {v0, v3}, Le9/s;->a(Ljava/lang/String;)Le9/c;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    if-eqz p1, :cond_12

    .line 244
    .line 245
    iget-boolean p1, p1, Le9/c;->f:Z

    .line 246
    .line 247
    if-nez p1, :cond_11

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_11
    iget-object p1, v9, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 251
    .line 252
    invoke-virtual {p1, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    const-string p1, "m"

    .line 256
    .line 257
    const-string v0, "j"

    .line 258
    .line 259
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    invoke-static {p0, p1}, Le9/q;->u(Ljava/lang/Object;[Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result p0

    .line 267
    if-lez p0, :cond_12

    .line 268
    .line 269
    iget-object p1, v9, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 270
    .line 271
    const-string v0, "hchat_custom_notification_unread_count"

    .line 272
    .line 273
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 274
    .line 275
    .line 276
    :cond_12
    :goto_5
    return-void

    .line 277
    :cond_13
    add-int/lit8 v7, v7, 0x1

    .line 278
    .line 279
    goto/16 :goto_1
.end method

.method public static final c(Ljava/lang/String;JJLjava/lang/String;Z)Z
    .locals 5

    .line 1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    if-eqz p6, :cond_8

    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p6

    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    cmp-long p1, p1, v1

    .line 16
    .line 17
    const/4 p2, 0x0

    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p6, p2

    .line 22
    :goto_0
    if-eqz p6, :cond_1

    .line 23
    .line 24
    move-object p2, p6

    .line 25
    goto :goto_4

    .line 26
    :cond_1
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    cmp-long p3, p3, v1

    .line 31
    .line 32
    if-lez p3, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move-object p1, p2

    .line 36
    :goto_1
    if-eqz p1, :cond_7

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 39
    .line 40
    .line 41
    move-result-wide p3

    .line 42
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1, p3, p4, p0}, Lk8/s;->e(JLjava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    iget-wide v3, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 55
    .line 56
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_3

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    move-object p1, p2

    .line 64
    goto :goto_3

    .line 65
    :goto_2
    new-instance p6, Lsf/f;

    .line 66
    .line 67
    invoke-direct {p6, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    move-object p1, p6

    .line 71
    :goto_3
    nop

    .line 72
    instance-of p6, p1, Lsf/f;

    .line 73
    .line 74
    if-eqz p6, :cond_4

    .line 75
    .line 76
    move-object p1, p2

    .line 77
    :cond_4
    check-cast p1, Ljava/lang/Long;

    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    cmp-long p6, v3, v1

    .line 86
    .line 87
    if-lez p6, :cond_5

    .line 88
    .line 89
    move-object p2, p1

    .line 90
    :cond_5
    if-eqz p2, :cond_6

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 93
    .line 94
    .line 95
    move-result-wide p3

    .line 96
    :cond_6
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    :cond_7
    :goto_4
    if-eqz p2, :cond_8

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide p1

    .line 106
    invoke-virtual {v0, p1, p2, p0, p5}, Lk8/g;->u(JLjava/lang/String;Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_8

    .line 111
    .line 112
    const/4 p0, 0x1

    .line 113
    goto :goto_5

    .line 114
    :cond_8
    invoke-virtual {v0, p0, p5}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    :goto_5
    return p0

    .line 119
    :cond_9
    const/4 p0, 0x0

    .line 120
    return p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)I
    .locals 8

    .line 1
    const-string v0, "notification"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Landroid/app/NotificationManager;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Landroid/app/NotificationManager;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v1

    .line 16
    :goto_0
    const/4 v0, 0x0

    .line 17
    if-eqz p0, :cond_6

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p0}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    array-length v2, p0

    .line 27
    move v3, v0

    .line 28
    move v4, v3

    .line 29
    :goto_1
    if-ge v3, v2, :cond_4

    .line 30
    .line 31
    aget-object v5, p0, v3

    .line 32
    .line 33
    invoke-virtual {v5}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    iget-object v6, v5, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 40
    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    const-string v7, "hchat_custom_notification"

    .line 44
    .line 45
    invoke-virtual {v6, v7, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    const/4 v7, 0x1

    .line 50
    if-ne v6, v7, :cond_2

    .line 51
    .line 52
    iget-object v5, v5, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 53
    .line 54
    if-eqz v5, :cond_1

    .line 55
    .line 56
    const-string v6, "hchat_custom_notification_talker"

    .line 57
    .line 58
    invoke-virtual {v5, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    goto :goto_2

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    goto :goto_4

    .line 65
    :cond_1
    move-object v5, v1

    .line 66
    :goto_2
    invoke-static {v5, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    move v7, v0

    .line 74
    :goto_3
    if-eqz v7, :cond_3

    .line 75
    .line 76
    add-int/lit8 v4, v4, 0x1

    .line 77
    .line 78
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    goto :goto_5

    .line 86
    :goto_4
    new-instance p1, Lsf/f;

    .line 87
    .line 88
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    move-object p0, p1

    .line 92
    :goto_5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    instance-of v0, p0, Lsf/f;

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    move-object p0, p1

    .line 101
    :cond_5
    check-cast p0, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    return p0

    .line 108
    :cond_6
    return v0
.end method

.method public static e(Landroid/content/Context;Le9/c;Lk8/o;)Le9/l;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v2, Lk8/o;->b:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, v2, Lk8/o;->k:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 10
    .line 11
    iget-object v5, v1, Le9/c;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, v1, Le9/c;->c:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v5}, Lg4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    if-eqz v8, :cond_1

    .line 24
    .line 25
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    move-object v7, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v7, v6

    .line 34
    :cond_1
    :goto_0
    iget-boolean v8, v1, Le9/c;->n:Z

    .line 35
    .line 36
    const/4 v9, 0x0

    .line 37
    const/4 v10, 0x0

    .line 38
    const-string v11, "[\u6536\u5230\u4e00\u6761\u65b0\u6d88\u606f]"

    .line 39
    .line 40
    if-eqz v8, :cond_39

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v8, v10

    .line 50
    :goto_1
    const-string v12, ""

    .line 51
    .line 52
    if-nez v8, :cond_3

    .line 53
    .line 54
    move-object v8, v12

    .line 55
    :cond_3
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    if-eqz v13, :cond_4

    .line 60
    .line 61
    iget-object v8, v2, Lk8/o;->e:Ljava/lang/String;

    .line 62
    .line 63
    :cond_4
    invoke-static {v8, v8}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const-string v13, "text"

    .line 68
    .line 69
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v13

    .line 73
    if-eqz v13, :cond_6

    .line 74
    .line 75
    const-string v3, ":\n"

    .line 76
    .line 77
    const/4 v13, 0x6

    .line 78
    invoke-static {v8, v3, v9, v9, v13}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-lez v3, :cond_5

    .line 83
    .line 84
    add-int/lit8 v3, v3, 0x2

    .line 85
    .line 86
    invoke-virtual {v8, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    :cond_5
    invoke-static {v8}, Le9/q;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    goto/16 :goto_f

    .line 95
    .line 96
    :cond_6
    invoke-virtual {v2}, Lk8/o;->k()Z

    .line 97
    .line 98
    .line 99
    move-result v13

    .line 100
    if-eqz v13, :cond_7

    .line 101
    .line 102
    const-string v3, "[\u56fe\u7247]"

    .line 103
    .line 104
    goto/16 :goto_f

    .line 105
    .line 106
    :cond_7
    invoke-virtual {v2}, Lk8/o;->u()Z

    .line 107
    .line 108
    .line 109
    move-result v13

    .line 110
    if-eqz v13, :cond_8

    .line 111
    .line 112
    const-string v3, "[\u8bed\u97f3]"

    .line 113
    .line 114
    goto/16 :goto_f

    .line 115
    .line 116
    :cond_8
    invoke-virtual {v2}, Lk8/o;->t()Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    if-eqz v13, :cond_9

    .line 121
    .line 122
    const-string v3, "[\u89c6\u9891]"

    .line 123
    .line 124
    goto/16 :goto_f

    .line 125
    .line 126
    :cond_9
    invoke-virtual {v2}, Lk8/o;->h()Z

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    if-eqz v13, :cond_a

    .line 131
    .line 132
    const-string v3, "[\u8868\u60c5]"

    .line 133
    .line 134
    goto/16 :goto_f

    .line 135
    .line 136
    :cond_a
    invoke-virtual {v2}, Lk8/o;->m()Z

    .line 137
    .line 138
    .line 139
    move-result v13

    .line 140
    if-eqz v13, :cond_b

    .line 141
    .line 142
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v8, :cond_31

    .line 151
    .line 152
    const-string v3, "[\u4f4d\u7f6e]"

    .line 153
    .line 154
    goto/16 :goto_f

    .line 155
    .line 156
    :cond_b
    const-string v13, "red_packet"

    .line 157
    .line 158
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    if-eqz v13, :cond_c

    .line 163
    .line 164
    const-string v3, "[\u7ea2\u5305]"

    .line 165
    .line 166
    goto/16 :goto_f

    .line 167
    .line 168
    :cond_c
    const-string v13, "transfer"

    .line 169
    .line 170
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v13

    .line 174
    if-nez v13, :cond_2b

    .line 175
    .line 176
    if-eqz v4, :cond_d

    .line 177
    .line 178
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isTransfer()Z

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    if-eqz v13, :cond_d

    .line 183
    .line 184
    goto/16 :goto_c

    .line 185
    .line 186
    :cond_d
    invoke-virtual {v2}, Lk8/o;->p()Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    if-eqz v13, :cond_16

    .line 191
    .line 192
    if-eqz v4, :cond_e

    .line 193
    .line 194
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->getQuoteMsg()Lh/Hchat/hooks/api/model/WeChatQuoteMsg;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    goto :goto_2

    .line 199
    :cond_e
    move-object v3, v10

    .line 200
    :goto_2
    if-eqz v3, :cond_f

    .line 201
    .line 202
    iget-object v13, v3, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->title:Ljava/lang/String;

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_f
    move-object v13, v10

    .line 206
    :goto_3
    if-nez v13, :cond_10

    .line 207
    .line 208
    move-object v13, v12

    .line 209
    :cond_10
    invoke-static {v13}, Le9/q;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    if-eqz v3, :cond_11

    .line 214
    .line 215
    iget-object v3, v3, Lh/Hchat/hooks/api/model/WeChatQuoteMsg;->content:Ljava/lang/String;

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_11
    move-object v3, v10

    .line 219
    :goto_4
    if-nez v3, :cond_12

    .line 220
    .line 221
    move-object v3, v12

    .line 222
    :cond_12
    invoke-static {v3}, Le9/q;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    const-string v15, "[\u5f15\u7528] "

    .line 231
    .line 232
    if-nez v14, :cond_13

    .line 233
    .line 234
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 235
    .line 236
    .line 237
    move-result v14

    .line 238
    if-nez v14, :cond_13

    .line 239
    .line 240
    const-string v8, " | "

    .line 241
    .line 242
    invoke-static {v15, v13, v8, v3}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    goto/16 :goto_f

    .line 247
    .line 248
    :cond_13
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v14

    .line 252
    if-nez v14, :cond_14

    .line 253
    .line 254
    invoke-virtual {v15, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    goto/16 :goto_f

    .line 259
    .line 260
    :cond_14
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    if-nez v13, :cond_15

    .line 265
    .line 266
    invoke-virtual {v15, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    goto/16 :goto_f

    .line 271
    .line 272
    :cond_15
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-eqz v8, :cond_31

    .line 281
    .line 282
    const-string v3, "[\u5f15\u7528]"

    .line 283
    .line 284
    goto/16 :goto_f

    .line 285
    .line 286
    :cond_16
    invoke-virtual {v2}, Lk8/o;->i()Z

    .line 287
    .line 288
    .line 289
    move-result v13

    .line 290
    if-eqz v13, :cond_1e

    .line 291
    .line 292
    if-eqz v4, :cond_17

    .line 293
    .line 294
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->getFileMsg()Lh/Hchat/hooks/api/model/WeChatFileMsg;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    goto :goto_5

    .line 299
    :cond_17
    move-object v3, v10

    .line 300
    :goto_5
    if-eqz v3, :cond_18

    .line 301
    .line 302
    iget-object v8, v3, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

    .line 303
    .line 304
    goto :goto_6

    .line 305
    :cond_18
    move-object v8, v10

    .line 306
    :goto_6
    if-nez v8, :cond_19

    .line 307
    .line 308
    move-object v8, v12

    .line 309
    :cond_19
    invoke-static {v8}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 310
    .line 311
    .line 312
    move-result v13

    .line 313
    if-eqz v13, :cond_1c

    .line 314
    .line 315
    if-eqz v3, :cond_1a

    .line 316
    .line 317
    iget-object v3, v3, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_1a
    move-object v3, v10

    .line 321
    :goto_7
    if-nez v3, :cond_1b

    .line 322
    .line 323
    move-object v8, v12

    .line 324
    goto :goto_8

    .line 325
    :cond_1b
    move-object v8, v3

    .line 326
    :cond_1c
    :goto_8
    invoke-static {v8}, Le9/q;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    if-nez v8, :cond_1d

    .line 335
    .line 336
    const-string v8, "[\u6587\u4ef6] "

    .line 337
    .line 338
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    goto/16 :goto_f

    .line 343
    .line 344
    :cond_1d
    const-string v3, "[\u6587\u4ef6]"

    .line 345
    .line 346
    goto/16 :goto_f

    .line 347
    .line 348
    :cond_1e
    invoke-virtual {v2}, Lk8/o;->l()Z

    .line 349
    .line 350
    .line 351
    move-result v13

    .line 352
    if-eqz v13, :cond_1f

    .line 353
    .line 354
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    goto/16 :goto_f

    .line 359
    .line 360
    :cond_1f
    const-string v13, "music"

    .line 361
    .line 362
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    move-result v13

    .line 366
    if-nez v13, :cond_2a

    .line 367
    .line 368
    if-eqz v4, :cond_20

    .line 369
    .line 370
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isMusic()Z

    .line 371
    .line 372
    .line 373
    move-result v13

    .line 374
    if-eqz v13, :cond_20

    .line 375
    .line 376
    goto/16 :goto_b

    .line 377
    .line 378
    :cond_20
    const-string v13, "note"

    .line 379
    .line 380
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v13

    .line 384
    if-nez v13, :cond_29

    .line 385
    .line 386
    if-eqz v4, :cond_21

    .line 387
    .line 388
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isNote()Z

    .line 389
    .line 390
    .line 391
    move-result v13

    .line 392
    if-eqz v13, :cond_21

    .line 393
    .line 394
    goto :goto_a

    .line 395
    :cond_21
    invoke-virtual {v2}, Lk8/o;->r()Z

    .line 396
    .line 397
    .line 398
    move-result v13

    .line 399
    if-eqz v13, :cond_22

    .line 400
    .line 401
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    goto/16 :goto_f

    .line 406
    .line 407
    :cond_22
    const-string v13, "video_number_video"

    .line 408
    .line 409
    invoke-virtual {v13, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-nez v3, :cond_28

    .line 414
    .line 415
    if-eqz v4, :cond_23

    .line 416
    .line 417
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVideoNumberVideo()Z

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    if-eqz v3, :cond_23

    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_23
    if-eqz v4, :cond_24

    .line 425
    .line 426
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoipVideo()Z

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    if-eqz v3, :cond_24

    .line 431
    .line 432
    const-string v3, "[\u89c6\u9891\u901a\u8bdd]"

    .line 433
    .line 434
    goto/16 :goto_f

    .line 435
    .line 436
    :cond_24
    if-eqz v4, :cond_25

    .line 437
    .line 438
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->isVoipVoice()Z

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    if-eqz v3, :cond_25

    .line 443
    .line 444
    const-string v3, "[\u8bed\u97f3\u901a\u8bdd]"

    .line 445
    .line 446
    goto :goto_f

    .line 447
    :cond_25
    invoke-virtual {v2}, Lk8/o;->v()Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-eqz v3, :cond_26

    .line 452
    .line 453
    const-string v3, "[\u901a\u8bdd]"

    .line 454
    .line 455
    goto :goto_f

    .line 456
    :cond_26
    invoke-virtual {v2}, Lk8/o;->f()Z

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    if-eqz v3, :cond_27

    .line 461
    .line 462
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    goto :goto_f

    .line 467
    :cond_27
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    goto :goto_f

    .line 472
    :cond_28
    :goto_9
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v3

    .line 476
    goto :goto_f

    .line 477
    :cond_29
    :goto_a
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    goto :goto_f

    .line 482
    :cond_2a
    :goto_b
    invoke-static {v8}, Le9/q;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v3

    .line 486
    goto :goto_f

    .line 487
    :cond_2b
    :goto_c
    iget-object v3, v2, Lk8/o;->p:Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 488
    .line 489
    if-eqz v3, :cond_2c

    .line 490
    .line 491
    goto :goto_d

    .line 492
    :cond_2c
    if-eqz v4, :cond_2d

    .line 493
    .line 494
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->getTransferMsg()Lh/Hchat/hooks/api/model/WeChatTransferMsg;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    goto :goto_d

    .line 499
    :cond_2d
    move-object v3, v10

    .line 500
    :goto_d
    if-eqz v3, :cond_2e

    .line 501
    .line 502
    iget-object v3, v3, Lh/Hchat/hooks/api/model/WeChatTransferMsg;->description:Ljava/lang/String;

    .line 503
    .line 504
    goto :goto_e

    .line 505
    :cond_2e
    move-object v3, v10

    .line 506
    :goto_e
    if-nez v3, :cond_2f

    .line 507
    .line 508
    move-object v3, v12

    .line 509
    :cond_2f
    invoke-static {v3}, Le9/q;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 514
    .line 515
    .line 516
    move-result v8

    .line 517
    if-nez v8, :cond_30

    .line 518
    .line 519
    const-string v8, "[\u8f6c\u8d26] "

    .line 520
    .line 521
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    goto :goto_f

    .line 526
    :cond_30
    const-string v3, "[\u8f6c\u8d26]"

    .line 527
    .line 528
    :cond_31
    :goto_f
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 529
    .line 530
    .line 531
    move-result v8

    .line 532
    if-eqz v8, :cond_32

    .line 533
    .line 534
    goto :goto_10

    .line 535
    :cond_32
    move-object v11, v3

    .line 536
    :goto_10
    iget-boolean v1, v1, Le9/c;->d:Z

    .line 537
    .line 538
    if-eqz v1, :cond_39

    .line 539
    .line 540
    iget-object v1, v2, Lk8/o;->d:Ljava/lang/String;

    .line 541
    .line 542
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 543
    .line 544
    .line 545
    move-result v3

    .line 546
    if-eqz v3, :cond_33

    .line 547
    .line 548
    invoke-virtual {v2}, Lk8/o;->c()Ljava/lang/String;

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    :cond_33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    if-nez v2, :cond_36

    .line 560
    .line 561
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    if-eqz v2, :cond_34

    .line 566
    .line 567
    invoke-virtual {v2, v5, v1}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    goto :goto_11

    .line 572
    :cond_34
    move-object v1, v10

    .line 573
    :goto_11
    if-nez v1, :cond_35

    .line 574
    .line 575
    goto :goto_12

    .line 576
    :cond_35
    move-object v12, v1

    .line 577
    :cond_36
    :goto_12
    invoke-static {v5}, Lg4/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    if-eqz v2, :cond_38

    .line 586
    .line 587
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 588
    .line 589
    .line 590
    move-result v1

    .line 591
    if-eqz v1, :cond_37

    .line 592
    .line 593
    move-object v6, v5

    .line 594
    :cond_37
    move-object v7, v6

    .line 595
    goto :goto_13

    .line 596
    :cond_38
    move-object v7, v1

    .line 597
    :goto_13
    invoke-static {v12}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    if-nez v1, :cond_39

    .line 602
    .line 603
    const-string v1, ": "

    .line 604
    .line 605
    invoke-static {v12, v1, v11}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v11

    .line 609
    :cond_39
    move-object v13, v7

    .line 610
    move-object v14, v11

    .line 611
    invoke-static {v0, v5}, Le9/q;->d(Landroid/content/Context;Ljava/lang/String;)I

    .line 612
    .line 613
    .line 614
    move-result v1

    .line 615
    const/4 v2, 0x1

    .line 616
    add-int/lit8 v15, v1, 0x1

    .line 617
    .line 618
    invoke-static {v0, v5}, Le9/q;->p(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 619
    .line 620
    .line 621
    move-result-object v16

    .line 622
    const-wide/16 v0, 0x0

    .line 623
    .line 624
    if-eqz v4, :cond_3a

    .line 625
    .line 626
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->getCreateTime()J

    .line 627
    .line 628
    .line 629
    move-result-wide v5

    .line 630
    goto :goto_14

    .line 631
    :cond_3a
    move-wide v5, v0

    .line 632
    :goto_14
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    cmp-long v5, v5, v0

    .line 637
    .line 638
    if-lez v5, :cond_3b

    .line 639
    .line 640
    move v9, v2

    .line 641
    :cond_3b
    if-eqz v9, :cond_3c

    .line 642
    .line 643
    move-object v10, v3

    .line 644
    :cond_3c
    if-eqz v10, :cond_3d

    .line 645
    .line 646
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 647
    .line 648
    .line 649
    move-result-wide v2

    .line 650
    :goto_15
    move-wide/from16 v17, v2

    .line 651
    .line 652
    goto :goto_16

    .line 653
    :cond_3d
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 654
    .line 655
    .line 656
    move-result-wide v2

    .line 657
    goto :goto_15

    .line 658
    :goto_16
    if-eqz v4, :cond_3e

    .line 659
    .line 660
    invoke-virtual {v4}, Lh/Hchat/hooks/api/model/WeChatMessage;->getMsgId()J

    .line 661
    .line 662
    .line 663
    move-result-wide v2

    .line 664
    move-wide/from16 v19, v2

    .line 665
    .line 666
    goto :goto_17

    .line 667
    :cond_3e
    move-wide/from16 v19, v0

    .line 668
    .line 669
    :goto_17
    if-eqz v4, :cond_3f

    .line 670
    .line 671
    iget-wide v0, v4, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 672
    .line 673
    :cond_3f
    move-wide/from16 v21, v0

    .line 674
    .line 675
    new-instance v12, Le9/l;

    .line 676
    .line 677
    const/16 v23, 0x0

    .line 678
    .line 679
    const/16 v24, 0x80

    .line 680
    .line 681
    invoke-direct/range {v12 .. v24}, Le9/l;-><init>(Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/Bitmap;JJJLandroid/app/PendingIntent;I)V

    .line 682
    .line 683
    .line 684
    return-object v12
.end method

.method public static f([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/4 v3, 0x0

    .line 5
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    aget-object v4, p0, v2

    .line 8
    .line 9
    invoke-static {v4}, Le9/q;->m(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    if-eqz v5, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    move-object v4, v3

    .line 20
    :goto_1
    if-eqz v4, :cond_2

    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_2
    array-length v0, p0

    .line 24
    :goto_2
    if-lt v1, v0, :cond_3

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_3
    aget-object v2, p0, v1

    .line 28
    .line 29
    if-nez v2, :cond_4

    .line 30
    .line 31
    goto :goto_4

    .line 32
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-static {v4}, Le9/q;->j(Ljava/lang/Class;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    :cond_5
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_7

    .line 49
    .line 50
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, Ljava/lang/reflect/Field;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {v6}, Ljava/lang/Class;->isPrimitive()Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-nez v7, :cond_5

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/Class;->isEnum()Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-nez v7, :cond_5

    .line 71
    .line 72
    const-class v7, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-nez v7, :cond_5

    .line 79
    .line 80
    const-class v7, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_5

    .line 87
    .line 88
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-eqz v6, :cond_6

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_6
    invoke-static {v5, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    if-eqz v5, :cond_5

    .line 102
    .line 103
    invoke-static {v5}, Le9/q;->m(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-eqz v6, :cond_5

    .line 108
    .line 109
    return-object v5

    .line 110
    :cond_7
    :goto_4
    add-int/lit8 v1, v1, 0x1

    .line 111
    .line 112
    goto :goto_2
.end method

.method public static varargs g([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_3

    .line 5
    .line 6
    aget-object v3, p0, v2

    .line 7
    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-eqz v4, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    move v4, v1

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_1
    const/4 v4, 0x1

    .line 20
    :goto_2
    if-nez v4, :cond_2

    .line 21
    .line 22
    goto :goto_3

    .line 23
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    const/4 v3, 0x0

    .line 27
    :goto_3
    if-nez v3, :cond_4

    .line 28
    .line 29
    const-string p0, ""

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_4
    return-object v3
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ".mp3"

    .line 2
    .line 3
    const-string v1, "ringtone_"

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, ""

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    return-object v3

    .line 20
    :cond_0
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v2

    .line 26
    new-instance v4, Lsf/f;

    .line 27
    .line 28
    invoke-direct {v4, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    move-object v2, v4

    .line 32
    :goto_0
    nop

    .line 33
    instance-of v4, v2, Lsf/f;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    move-object v2, v5

    .line 39
    :cond_1
    check-cast v2, Landroid/net/Uri;

    .line 40
    .line 41
    if-eqz v2, :cond_9

    .line 42
    .line 43
    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move-object v3, v4

    .line 51
    :goto_1
    const-string v4, "content"

    .line 52
    .line 53
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-nez v3, :cond_3

    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :cond_3
    :try_start_1
    new-instance v3, Ljava/io/File;

    .line 62
    .line 63
    invoke-virtual {p0, v5}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const-string v6, "custom_notification_ringtones"

    .line 68
    .line 69
    invoke-direct {v3, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    if-eqz v4, :cond_5

    .line 80
    .line 81
    invoke-static {v4}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-eqz v4, :cond_5

    .line 86
    .line 87
    const/16 v6, 0x2f

    .line 88
    .line 89
    invoke-static {v4, v6, v4}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    const/16 v6, 0x3a

    .line 94
    .line 95
    invoke-static {v4, v6, v4}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    const-string v6, "[\\\\/:*?\"<>|\\s]+"

    .line 100
    .line 101
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const-string v7, "_"

    .line 109
    .line 110
    invoke-virtual {v6, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-nez v6, :cond_4

    .line 126
    .line 127
    move-object v5, v4

    .line 128
    :cond_4
    if-eqz v5, :cond_5

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :catchall_1
    move-exception p0

    .line 132
    goto :goto_5

    .line 133
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 134
    .line 135
    .line 136
    move-result-wide v4

    .line 137
    new-instance v6, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    :goto_2
    const/16 v1, 0x2e

    .line 150
    .line 151
    invoke-static {v5, v1}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_6

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_6
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    :goto_3
    new-instance v0, Ljava/io/File;

    .line 163
    .line 164
    invoke-direct {v0, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 172
    .line 173
    .line 174
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 175
    if-eqz p0, :cond_7

    .line 176
    .line 177
    :try_start_2
    new-instance v1, Ljava/io/FileOutputStream;

    .line 178
    .line 179
    const/4 v2, 0x0

    .line 180
    invoke-direct {v1, v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 181
    .line 182
    .line 183
    :try_start_3
    invoke-static {p0, v1}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 184
    .line 185
    .line 186
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 187
    .line 188
    .line 189
    :try_start_5
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 190
    .line 191
    .line 192
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 201
    .line 202
    .line 203
    goto :goto_6

    .line 204
    :catchall_2
    move-exception v0

    .line 205
    goto :goto_4

    .line 206
    :catchall_3
    move-exception v0

    .line 207
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 208
    :catchall_4
    move-exception v2

    .line 209
    :try_start_7
    invoke-static {v1, v0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 213
    :goto_4
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 214
    :catchall_5
    move-exception v1

    .line 215
    :try_start_9
    invoke-static {p0, v0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    throw v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 219
    :cond_7
    move-object p0, p1

    .line 220
    goto :goto_6

    .line 221
    :goto_5
    new-instance v0, Lsf/f;

    .line 222
    .line 223
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    move-object p0, v0

    .line 227
    :goto_6
    nop

    .line 228
    instance-of v0, p0, Lsf/f;

    .line 229
    .line 230
    if-eqz v0, :cond_8

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_8
    move-object p1, p0

    .line 234
    :goto_7
    check-cast p1, Ljava/lang/String;

    .line 235
    .line 236
    :cond_9
    :goto_8
    return-object p1
.end method

.method public static i(Lr8/g;)V
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Le9/q;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2c

    .line 13
    .line 14
    invoke-static {p0}, Lya/i;->a(Lr8/g;)V

    .line 15
    .line 16
    .line 17
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 18
    .line 19
    iget-object v3, p0, Lr8/g;->a:Landroid/content/Context;

    .line 20
    .line 21
    const-string v4, "Hchat_custom_notification_method_cache"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    sput-object v3, Le9/q;->o:Landroid/content/SharedPreferences;

    .line 28
    .line 29
    new-instance v3, Le9/h;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-direct {v3, v5}, Le9/h;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const-string v5, "native_notification_processor"

    .line 36
    .line 37
    const-string v6, "in sample Notify: needSound: %B, needShake: %B, msgContent: ==, msgType: %d, talker: %s, customNotify: %s, isRevokeMessage:%b"

    .line 38
    .line 39
    invoke-static {p0, v5, v6, v3}, Le9/q;->r(Lr8/g;Ljava/lang/String;Ljava/lang/String;Lfg/l;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, Ljava/lang/reflect/Method;

    .line 58
    .line 59
    sget-object v7, Lr8/i;->b:Lr8/i;

    .line 60
    .line 61
    new-instance v8, Lc9/a2;

    .line 62
    .line 63
    const/4 v9, 0x2

    .line 64
    invoke-direct {v8, p0, v9}, Lc9/a2;-><init>(Lr8/g;I)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7, v6, v8}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    new-instance v5, Le9/h;

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    invoke-direct {v5, v6}, Le9/h;-><init>(I)V

    .line 75
    .line 76
    .line 77
    const-string v6, "native_notification_cleanup"

    .line 78
    .line 79
    const-string v7, "needRemoveNotificationId:%s"

    .line 80
    .line 81
    invoke-static {p0, v6, v7, v5}, Le9/q;->r(Lr8/g;Ljava/lang/String;Ljava/lang/String;Lfg/l;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-nez v6, :cond_3

    .line 90
    .line 91
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_2

    .line 107
    .line 108
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    check-cast v6, Ljava/lang/reflect/Method;

    .line 113
    .line 114
    sget-object v7, Lr8/i;->b:Lr8/i;

    .line 115
    .line 116
    new-instance v8, Lc9/a2;

    .line 117
    .line 118
    const/4 v9, 0x3

    .line 119
    invoke-direct {v8, p0, v9}, Lc9/a2;-><init>(Lr8/g;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v6, v8}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    check-cast v5, Ljava/lang/reflect/Method;

    .line 141
    .line 142
    sget-object v6, Lr8/i;->b:Lr8/i;

    .line 143
    .line 144
    new-instance v7, Lba/f;

    .line 145
    .line 146
    const/16 v8, 0xd

    .line 147
    .line 148
    invoke-direct {v7, v8}, Lba/f;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v5, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_3
    :goto_3
    const-string v3, "[Hchat:CustomNotification] \u672a\u5b9a\u4f4d\u5fae\u4fe1\u9690\u85cf\u5185\u5bb9\u901a\u77e5\u6e05\u7406\u94fe\u8def"

    .line 156
    .line 157
    invoke-static {v3}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    :cond_4
    sget-object v3, Le8/b;->a:Le8/b;

    .line 161
    .line 162
    sget-object v5, Le9/q;->o:Landroid/content/SharedPreferences;

    .line 163
    .line 164
    if-eqz v5, :cond_5

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_5
    iget-object v5, p0, Lr8/g;->a:Landroid/content/Context;

    .line 168
    .line 169
    invoke-static {v5, v4}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    sput-object v5, Le9/q;->o:Landroid/content/SharedPreferences;

    .line 174
    .line 175
    :goto_4
    iget-object v4, p0, Lr8/g;->a:Landroid/content/Context;

    .line 176
    .line 177
    iget-object v6, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 178
    .line 179
    invoke-static {v4, v6}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    iget-object v6, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 184
    .line 185
    const-string v7, "native_notification_builder"

    .line 186
    .line 187
    invoke-static {v5, v4, v6, v7}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    new-instance v8, Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    :cond_6
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v9

    .line 204
    if-eqz v9, :cond_7

    .line 205
    .line 206
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v9

    .line 210
    move-object v10, v9

    .line 211
    check-cast v10, Ljava/lang/reflect/Method;

    .line 212
    .line 213
    invoke-static {v10}, Le9/q;->n(Ljava/lang/reflect/Method;)Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-eqz v10, :cond_6

    .line 218
    .line 219
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_7
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    const/4 v9, 0x0

    .line 228
    if-nez v6, :cond_8

    .line 229
    .line 230
    goto :goto_6

    .line 231
    :cond_8
    move-object v8, v9

    .line 232
    :goto_6
    if-eqz v8, :cond_9

    .line 233
    .line 234
    goto/16 :goto_11

    .line 235
    .line 236
    :cond_9
    const-string v6, "com.tencent.mm.booter.notification.e0"

    .line 237
    .line 238
    const-string v8, "com.tencent.mm.booter.notification.w"

    .line 239
    .line 240
    filled-new-array {v6, v8}, [Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-static {v6}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    new-instance v8, Ljava/util/ArrayList;

    .line 249
    .line 250
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    :cond_a
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    if-eqz v10, :cond_b

    .line 262
    .line 263
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    check-cast v10, Ljava/lang/String;

    .line 268
    .line 269
    iget-object v11, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 270
    .line 271
    invoke-static {v10, v11}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    if-eqz v10, :cond_a

    .line 276
    .line 277
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_b
    new-instance v6, Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v8

    .line 290
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v10

    .line 294
    if-eqz v10, :cond_e

    .line 295
    .line 296
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    check-cast v10, Ljava/lang/Class;

    .line 301
    .line 302
    invoke-static {v10}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v10

    .line 306
    new-instance v11, Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 309
    .line 310
    .line 311
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 312
    .line 313
    .line 314
    move-result-object v10

    .line 315
    :cond_c
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v12

    .line 319
    if-eqz v12, :cond_d

    .line 320
    .line 321
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    move-object v13, v12

    .line 326
    check-cast v13, Ljava/lang/reflect/Method;

    .line 327
    .line 328
    invoke-static {v13}, Le9/q;->n(Ljava/lang/reflect/Method;)Z

    .line 329
    .line 330
    .line 331
    move-result v13

    .line 332
    if-eqz v13, :cond_c

    .line 333
    .line 334
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_9

    .line 338
    :cond_d
    invoke-static {v6, v11}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 339
    .line 340
    .line 341
    goto :goto_8

    .line 342
    :cond_e
    new-instance v8, Ljava/util/HashSet;

    .line 343
    .line 344
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 345
    .line 346
    .line 347
    new-instance v10, Ljava/util/ArrayList;

    .line 348
    .line 349
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    :cond_f
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v11

    .line 360
    if-eqz v11, :cond_10

    .line 361
    .line 362
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v11

    .line 366
    move-object v12, v11

    .line 367
    check-cast v12, Ljava/lang/reflect/Method;

    .line 368
    .line 369
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v12

    .line 373
    invoke-virtual {v8, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v12

    .line 377
    if-eqz v12, :cond_f

    .line 378
    .line 379
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    goto :goto_a

    .line 383
    :cond_10
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 384
    .line 385
    .line 386
    move-result v6

    .line 387
    if-nez v6, :cond_11

    .line 388
    .line 389
    invoke-virtual {v3, v5, v4, v7, v10}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 390
    .line 391
    .line 392
    move-object v8, v10

    .line 393
    goto/16 :goto_11

    .line 394
    .line 395
    :cond_11
    :try_start_0
    iget-object v6, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 396
    .line 397
    new-instance v8, Lch/e;

    .line 398
    .line 399
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 400
    .line 401
    .line 402
    new-instance v10, Lfh/k;

    .line 403
    .line 404
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 405
    .line 406
    .line 407
    const-string v11, "MicroMsg.Notification.AppMsg.Handle"

    .line 408
    .line 409
    invoke-static {v11}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 410
    .line 411
    .line 412
    move-result-object v11

    .line 413
    invoke-static {v10, v11}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 414
    .line 415
    .line 416
    iput-object v10, v8, Lch/e;->h:Lfh/k;

    .line 417
    .line 418
    invoke-virtual {v6, v8}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    new-instance v8, Ljava/util/ArrayList;

    .line 423
    .line 424
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 428
    .line 429
    .line 430
    move-result-object v6

    .line 431
    :cond_12
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 432
    .line 433
    .line 434
    move-result v10

    .line 435
    if-eqz v10, :cond_14

    .line 436
    .line 437
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v10

    .line 441
    check-cast v10, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 442
    .line 443
    :try_start_1
    iget-object v11, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 444
    .line 445
    invoke-virtual {v10, v11}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 446
    .line 447
    .line 448
    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 449
    goto :goto_c

    .line 450
    :catchall_0
    move-exception v10

    .line 451
    :try_start_2
    new-instance v11, Lsf/f;

    .line 452
    .line 453
    invoke-direct {v11, v10}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 454
    .line 455
    .line 456
    move-object v10, v11

    .line 457
    :goto_c
    nop

    .line 458
    instance-of v11, v10, Lsf/f;

    .line 459
    .line 460
    if-eqz v11, :cond_13

    .line 461
    .line 462
    move-object v10, v9

    .line 463
    :cond_13
    check-cast v10, Ljava/lang/reflect/Method;

    .line 464
    .line 465
    if-eqz v10, :cond_12

    .line 466
    .line 467
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    goto :goto_b

    .line 471
    :catchall_1
    move-exception v6

    .line 472
    goto :goto_f

    .line 473
    :cond_14
    new-instance v6, Ljava/util/ArrayList;

    .line 474
    .line 475
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    :cond_15
    :goto_d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 483
    .line 484
    .line 485
    move-result v10

    .line 486
    if-eqz v10, :cond_16

    .line 487
    .line 488
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v10

    .line 492
    move-object v11, v10

    .line 493
    check-cast v11, Ljava/lang/reflect/Method;

    .line 494
    .line 495
    invoke-static {v11}, Le9/q;->n(Ljava/lang/reflect/Method;)Z

    .line 496
    .line 497
    .line 498
    move-result v11

    .line 499
    if-eqz v11, :cond_15

    .line 500
    .line 501
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 502
    .line 503
    .line 504
    goto :goto_d

    .line 505
    :cond_16
    new-instance v8, Ljava/util/HashSet;

    .line 506
    .line 507
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 508
    .line 509
    .line 510
    new-instance v10, Ljava/util/ArrayList;

    .line 511
    .line 512
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 513
    .line 514
    .line 515
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    :cond_17
    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v11

    .line 523
    if-eqz v11, :cond_18

    .line 524
    .line 525
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v11

    .line 529
    move-object v12, v11

    .line 530
    check-cast v12, Ljava/lang/reflect/Method;

    .line 531
    .line 532
    invoke-virtual {v12}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v12

    .line 536
    invoke-virtual {v8, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 537
    .line 538
    .line 539
    move-result v12

    .line 540
    if-eqz v12, :cond_17

    .line 541
    .line 542
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 543
    .line 544
    .line 545
    goto :goto_e

    .line 546
    :goto_f
    new-instance v10, Lsf/f;

    .line 547
    .line 548
    invoke-direct {v10, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 549
    .line 550
    .line 551
    :cond_18
    invoke-static {v10}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    if-nez v6, :cond_19

    .line 556
    .line 557
    goto :goto_10

    .line 558
    :cond_19
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 559
    .line 560
    .line 561
    move-result-object v8

    .line 562
    const-string v10, "[Hchat:CustomNotification] \u5b9a\u4f4d\u5fae\u4fe1\u539f\u751f\u901a\u77e5\u6784\u5efa\u65b9\u6cd5\u5931\u8d25: "

    .line 563
    .line 564
    invoke-static {v10, v8, v6}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 565
    .line 566
    .line 567
    move-object v10, v0

    .line 568
    :goto_10
    move-object v8, v10

    .line 569
    check-cast v8, Ljava/util/List;

    .line 570
    .line 571
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 572
    .line 573
    .line 574
    move-result v6

    .line 575
    if-nez v6, :cond_1a

    .line 576
    .line 577
    invoke-virtual {v3, v5, v4, v7, v8}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 578
    .line 579
    .line 580
    goto :goto_11

    .line 581
    :cond_1a
    const-string v3, "cache.key"

    .line 582
    .line 583
    :try_start_3
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    const-string v10, ""

    .line 588
    .line 589
    invoke-interface {v5, v3, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v5

    .line 593
    invoke-static {v5, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v5

    .line 597
    if-nez v5, :cond_1b

    .line 598
    .line 599
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    invoke-interface {v5, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 604
    .line 605
    .line 606
    :cond_1b
    invoke-interface {v6, v7}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 611
    .line 612
    .line 613
    :catchall_2
    :goto_11
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    :goto_12
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 618
    .line 619
    .line 620
    move-result v4

    .line 621
    if-eqz v4, :cond_1c

    .line 622
    .line 623
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    check-cast v4, Ljava/lang/reflect/Method;

    .line 628
    .line 629
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 630
    .line 631
    new-instance v6, Lb9/e;

    .line 632
    .line 633
    const/4 v7, 0x6

    .line 634
    invoke-direct {v6, v4, v7}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v5, v4, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 638
    .line 639
    .line 640
    goto :goto_12

    .line 641
    :cond_1c
    iget-object v3, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 642
    .line 643
    const-string v4, "com.tencent.mm.booter.notification.NotificationItem"

    .line 644
    .line 645
    invoke-static {v4, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    move-result-object v3

    .line 649
    if-eqz v3, :cond_1d

    .line 650
    .line 651
    :goto_13
    move-object v9, v3

    .line 652
    goto :goto_16

    .line 653
    :cond_1d
    :try_start_4
    iget-object v3, p0, Lr8/g;->h:Lh/Hchat/dexkit/DexBridgeHolder;

    .line 654
    .line 655
    const-string v5, "id: "

    .line 656
    .line 657
    const-string v6, "userName: "

    .line 658
    .line 659
    const-string v7, "unreadCount:"

    .line 660
    .line 661
    filled-new-array {v5, v6, v7}, [Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v5

    .line 665
    invoke-virtual {v3, v5}, Lh/Hchat/dexkit/DexBridgeHolder;->findClassesByStrings([Ljava/lang/String;)Ljava/util/List;

    .line 666
    .line 667
    .line 668
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 669
    goto :goto_14

    .line 670
    :catchall_3
    move-exception v3

    .line 671
    new-instance v5, Lsf/f;

    .line 672
    .line 673
    invoke-direct {v5, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 674
    .line 675
    .line 676
    move-object v3, v5

    .line 677
    :goto_14
    nop

    .line 678
    instance-of v5, v3, Lsf/f;

    .line 679
    .line 680
    if-eqz v5, :cond_1e

    .line 681
    .line 682
    goto :goto_15

    .line 683
    :cond_1e
    move-object v0, v3

    .line 684
    :goto_15
    check-cast v0, Ljava/util/List;

    .line 685
    .line 686
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 691
    .line 692
    .line 693
    move-result v3

    .line 694
    if-eqz v3, :cond_21

    .line 695
    .line 696
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v3

    .line 700
    check-cast v3, Ljava/lang/String;

    .line 701
    .line 702
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v5

    .line 706
    if-nez v5, :cond_20

    .line 707
    .line 708
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    const-string v5, ".NotificationItem"

    .line 712
    .line 713
    invoke-static {v3, v5, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 714
    .line 715
    .line 716
    move-result v5

    .line 717
    if-nez v5, :cond_20

    .line 718
    .line 719
    const-string v5, "com.tencent.mm.booter.notification"

    .line 720
    .line 721
    invoke-static {v3, v5, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    if-eqz v5, :cond_1f

    .line 726
    .line 727
    :cond_20
    iget-object v5, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 728
    .line 729
    invoke-static {v3, v5}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    if-eqz v3, :cond_1f

    .line 734
    .line 735
    goto :goto_13

    .line 736
    :cond_21
    :goto_16
    if-eqz v9, :cond_24

    .line 737
    .line 738
    new-instance v0, Lc9/a2;

    .line 739
    .line 740
    const/4 v3, 0x5

    .line 741
    invoke-direct {v0, p0, v3}, Lc9/a2;-><init>(Lr8/g;I)V

    .line 742
    .line 743
    .line 744
    invoke-static {v9, v0}, Lde/robv/android/xposed/XposedBridge;->hookAllConstructors(Ljava/lang/Class;Lde/robv/android/xposed/XC_MethodHook;)Ljava/util/Set;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    if-eqz v0, :cond_22

    .line 749
    .line 750
    check-cast v0, Ljava/lang/Iterable;

    .line 751
    .line 752
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 753
    .line 754
    .line 755
    move-result-object v0

    .line 756
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    if-eqz v3, :cond_22

    .line 761
    .line 762
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v3

    .line 766
    check-cast v3, Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 767
    .line 768
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 769
    .line 770
    invoke-virtual {v4, v3}, Lr8/i;->a(Lde/robv/android/xposed/XC_MethodHook$Unhook;)V

    .line 771
    .line 772
    .line 773
    goto :goto_17

    .line 774
    :cond_22
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    :cond_23
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 783
    .line 784
    .line 785
    move-result v3

    .line 786
    if-eqz v3, :cond_24

    .line 787
    .line 788
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v3

    .line 792
    check-cast v3, Ljava/lang/reflect/Method;

    .line 793
    .line 794
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    move-result-object v4

    .line 798
    if-eqz v4, :cond_23

    .line 799
    .line 800
    array-length v5, v4

    .line 801
    if-ne v5, v2, :cond_23

    .line 802
    .line 803
    const-class v5, Landroid/content/Context;

    .line 804
    .line 805
    aget-object v4, v4, v1

    .line 806
    .line 807
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    if-eqz v4, :cond_23

    .line 812
    .line 813
    sget-object v4, Lr8/i;->b:Lr8/i;

    .line 814
    .line 815
    new-instance v5, Lc9/a2;

    .line 816
    .line 817
    const/4 v6, 0x4

    .line 818
    invoke-direct {v5, p0, v6}, Lc9/a2;-><init>(Lr8/g;I)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v4, v3, v5}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 822
    .line 823
    .line 824
    goto :goto_18

    .line 825
    :cond_24
    const-class v0, Landroid/app/NotificationManager;

    .line 826
    .line 827
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 832
    .line 833
    .line 834
    array-length v3, v0

    .line 835
    move v4, v1

    .line 836
    :goto_19
    if-lt v4, v3, :cond_27

    .line 837
    .line 838
    iget-object p0, p0, Lr8/g;->a:Landroid/content/Context;

    .line 839
    .line 840
    sget-object v0, Le9/q;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 841
    .line 842
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 843
    .line 844
    .line 845
    move-result v2

    .line 846
    if-nez v2, :cond_25

    .line 847
    .line 848
    goto/16 :goto_1c

    .line 849
    .line 850
    :cond_25
    new-instance v2, Le9/p;

    .line 851
    .line 852
    invoke-direct {v2}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 853
    .line 854
    .line 855
    new-instance v3, Landroid/content/IntentFilter;

    .line 856
    .line 857
    const-string v4, "h.Hchat.action.CUSTOM_NOTIFICATION_REPLY"

    .line 858
    .line 859
    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 860
    .line 861
    .line 862
    const-string v4, "h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ"

    .line 863
    .line 864
    invoke-virtual {v3, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    :try_start_5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 868
    .line 869
    const/16 v5, 0x21

    .line 870
    .line 871
    if-lt v4, v5, :cond_26

    .line 872
    .line 873
    const/4 v4, 0x4

    .line 874
    invoke-virtual {p0, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 875
    .line 876
    .line 877
    goto :goto_1c

    .line 878
    :catchall_4
    move-exception p0

    .line 879
    goto :goto_1a

    .line 880
    :cond_26
    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 881
    .line 882
    .line 883
    goto :goto_1c

    .line 884
    :goto_1a
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 885
    .line 886
    .line 887
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 888
    .line 889
    .line 890
    move-result-object v0

    .line 891
    const-string v1, "[Hchat:CustomNotification] \u6ce8\u518c\u901a\u77e5\u52a8\u4f5c\u5e7f\u64ad\u5931\u8d25: "

    .line 892
    .line 893
    invoke-static {v1, v0, p0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 894
    .line 895
    .line 896
    goto :goto_1c

    .line 897
    :cond_27
    aget-object v5, v0, v4

    .line 898
    .line 899
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    move-result-object v6

    .line 903
    if-eqz v6, :cond_2b

    .line 904
    .line 905
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v7

    .line 909
    const-string v8, "notify"

    .line 910
    .line 911
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 912
    .line 913
    .line 914
    move-result v7

    .line 915
    if-eqz v7, :cond_2b

    .line 916
    .line 917
    array-length v7, v6

    .line 918
    if-nez v7, :cond_28

    .line 919
    .line 920
    goto :goto_1b

    .line 921
    :cond_28
    array-length v7, v6

    .line 922
    if-eqz v7, :cond_2a

    .line 923
    .line 924
    array-length v7, v6

    .line 925
    sub-int/2addr v7, v2

    .line 926
    aget-object v6, v6, v7

    .line 927
    .line 928
    const-class v7, Landroid/app/Notification;

    .line 929
    .line 930
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 931
    .line 932
    .line 933
    move-result v6

    .line 934
    if-nez v6, :cond_29

    .line 935
    .line 936
    goto :goto_1b

    .line 937
    :cond_29
    sget-object v6, Lr8/i;->b:Lr8/i;

    .line 938
    .line 939
    new-instance v7, Lc9/a2;

    .line 940
    .line 941
    const/4 v8, 0x6

    .line 942
    invoke-direct {v7, p0, v8}, Lc9/a2;-><init>(Lr8/g;I)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v6, v5, v7}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 946
    .line 947
    .line 948
    goto :goto_1b

    .line 949
    :cond_2a
    const-string p0, "Array is empty."

    .line 950
    .line 951
    invoke-static {p0}, Lj8/o;->l(Ljava/lang/String;)V

    .line 952
    .line 953
    .line 954
    return-void

    .line 955
    :cond_2b
    :goto_1b
    add-int/lit8 v4, v4, 0x1

    .line 956
    .line 957
    goto :goto_19

    .line 958
    :cond_2c
    :goto_1c
    return-void
.end method

.method public static j(Ljava/lang/Class;)Ljava/util/List;
    .locals 7

    .line 1
    sget-object v0, Le9/q;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object v2, p0

    .line 15
    :goto_0
    if-eqz v2, :cond_2

    .line 16
    .line 17
    const-class v3, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-nez v3, :cond_2

    .line 24
    .line 25
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v4, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    :cond_0
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    move-object v6, v5

    .line 49
    check-cast v6, Ljava/lang/reflect/Field;

    .line 50
    .line 51
    invoke-static {v6}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_0

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-static {v1, v4}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-nez p0, :cond_3

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    move-object v1, p0

    .line 77
    :cond_4
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 78
    .line 79
    return-object v1
.end method

.method public static k(Le9/c;)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Le9/c;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    sget-object v0, Le9/s;->b:Ljava/util/Set;

    .line 7
    .line 8
    iget-object v0, p0, Le9/c;->q:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Le9/r;->g(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget-object p0, p0, Le9/c;->r:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, Le9/r;->g(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-ltz v0, :cond_5

    .line 21
    .line 22
    if-gez p0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    if-ne v0, p0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/16 v2, 0xb

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    mul-int/lit16 v2, v2, 0xe10

    .line 39
    .line 40
    const/16 v3, 0xc

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    mul-int/lit8 v3, v3, 0x3c

    .line 47
    .line 48
    add-int/2addr v3, v2

    .line 49
    const/16 v2, 0xd

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    add-int/2addr v1, v3

    .line 56
    if-ge v0, p0, :cond_3

    .line 57
    .line 58
    if-gt v0, v1, :cond_5

    .line 59
    .line 60
    if-ge v1, p0, :cond_5

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    if-ge v1, v0, :cond_4

    .line 64
    .line 65
    if-ge v1, p0, :cond_5

    .line 66
    .line 67
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 68
    return p0

    .line 69
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 70
    return p0
.end method

.method public static l([Ljava/lang/Class;)Z
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/16 v1, 0xf

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const-class v0, Landroid/app/Notification;

    .line 8
    .line 9
    aget-object v1, p0, v2

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aget-object v1, p0, v0

    .line 19
    .line 20
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    aget-object v1, p0, v1

    .line 30
    .line 31
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    aget-object v1, p0, v1

    .line 39
    .line 40
    const-class v3, Landroid/app/PendingIntent;

    .line 41
    .line 42
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    aget-object v1, p0, v1

    .line 50
    .line 51
    const-class v3, Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    const/4 v1, 0x5

    .line 60
    aget-object v1, p0, v1

    .line 61
    .line 62
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    const/4 v1, 0x6

    .line 69
    aget-object v1, p0, v1

    .line 70
    .line 71
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    const/4 v1, 0x7

    .line 78
    aget-object v1, p0, v1

    .line 79
    .line 80
    const-class v4, Landroid/graphics/Bitmap;

    .line 81
    .line 82
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_0

    .line 87
    .line 88
    const/16 v1, 0xe

    .line 89
    .line 90
    aget-object p0, p0, v1

    .line 91
    .line 92
    invoke-static {p0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_0

    .line 97
    .line 98
    return v0

    .line 99
    :cond_0
    return v2
.end method

.method public static m(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, Le9/q;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-nez v3, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "field_msgSvrId"

    .line 22
    .line 23
    invoke-static {v3, v4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-string v4, "field_talker"

    .line 34
    .line 35
    invoke-static {v3, v4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v3, "field_content"

    .line 46
    .line 47
    invoke-static {p0, v3}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v2, v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    move-object v3, p0

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move-object v3, v0

    .line 67
    :cond_3
    :goto_0
    check-cast v3, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    return p0
.end method

.method public static n(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Landroid/app/Notification;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Le9/q;->l([Ljava/lang/Class;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    invoke-static {p0}, Le9/q;->o([Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 35
    return p0

    .line 36
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 37
    return p0
.end method

.method public static o([Ljava/lang/Class;)Z
    .locals 8

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    if-ne v0, v2, :cond_9

    .line 5
    .line 6
    aget-object v0, p0, v1

    .line 7
    .line 8
    const-class v3, Landroid/app/Notification;

    .line 9
    .line 10
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_0
    aget-object p0, p0, v1

    .line 19
    .line 20
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    :cond_1
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_2

    .line 38
    .line 39
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    move-object v6, v5

    .line 44
    check-cast v6, Ljava/lang/reflect/Field;

    .line 45
    .line 46
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const-class v7, Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_1
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
    check-cast v5, Ljava/lang/reflect/Field;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    invoke-static {v4}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_4

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-eqz v4, :cond_9

    .line 115
    .line 116
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    check-cast v4, Ljava/lang/reflect/Field;

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    if-eqz v4, :cond_5

    .line 131
    .line 132
    const-string p0, "g"

    .line 133
    .line 134
    const-string v3, "o"

    .line 135
    .line 136
    const-string v4, "e"

    .line 137
    .line 138
    const-string v5, "f"

    .line 139
    .line 140
    filled-new-array {v4, v5, p0, v3}, [Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    check-cast p0, Ljava/lang/Iterable;

    .line 149
    .line 150
    instance-of v3, p0, Ljava/util/Collection;

    .line 151
    .line 152
    if-eqz v3, :cond_6

    .line 153
    .line 154
    move-object v3, p0

    .line 155
    check-cast v3, Ljava/util/Collection;

    .line 156
    .line 157
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_6

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    if-eqz v3, :cond_8

    .line 173
    .line 174
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    check-cast v3, Ljava/lang/String;

    .line 179
    .line 180
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-nez v3, :cond_7

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_8
    :goto_2
    return v2

    .line 188
    :cond_9
    :goto_3
    return v1
.end method

.method public static p(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

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
    return-object v1

    .line 9
    :cond_0
    const-string v0, "Hchat_custom_friend_avatar_config"

    .line 10
    .line 11
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "enable"

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-static {p0, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v2, "scope_notifications"

    .line 30
    .line 31
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-static {p0, p1}, Ld9/o;->e(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    sget-object p0, Le9/q;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Landroid/graphics/Bitmap;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_2
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0, p1, v3}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move-object v2, v1

    .line 71
    :goto_0
    const-string v5, ""

    .line 72
    .line 73
    if-nez v2, :cond_4

    .line 74
    .line 75
    move-object v2, v5

    .line 76
    :cond_4
    if-eqz v0, :cond_5

    .line 77
    .line 78
    invoke-virtual {v0, p1, v4}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    goto :goto_1

    .line 83
    :cond_5
    move-object v0, v1

    .line 84
    :goto_1
    if-nez v0, :cond_6

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    move-object v5, v0

    .line 88
    :goto_2
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-nez v6, :cond_7

    .line 98
    .line 99
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_7
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_8

    .line 107
    .line 108
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    :cond_8
    invoke-static {p1, v4}, Le9/q;->q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    if-eqz v2, :cond_9

    .line 116
    .line 117
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    :cond_9
    invoke-static {p1, v3}, Le9/q;->q(Ljava/lang/String;Z)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    if-eqz v2, :cond_a

    .line 125
    .line 126
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_a
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    if-eqz v2, :cond_11

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Ljava/lang/String;

    .line 148
    .line 149
    :try_start_0
    const-string v3, "http://"

    .line 150
    .line 151
    invoke-static {v2, v3, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-nez v3, :cond_f

    .line 156
    .line 157
    const-string v3, "https://"

    .line 158
    .line 159
    invoke-static {v2, v3, v4}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eqz v3, :cond_c

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_c
    new-instance v3, Ljava/io/File;

    .line 167
    .line 168
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_d

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_d
    move-object v3, v1

    .line 179
    :goto_3
    if-eqz v3, :cond_e

    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    goto :goto_7

    .line 190
    :catchall_0
    move-exception v2

    .line 191
    goto :goto_5

    .line 192
    :cond_e
    move-object v2, v1

    .line 193
    goto :goto_7

    .line 194
    :cond_f
    :goto_4
    new-instance v3, Ljava/net/URL;

    .line 195
    .line 196
    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const/16 v3, 0xbb8

    .line 204
    .line 205
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 212
    .line 213
    .line 214
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    :try_start_1
    invoke-static {v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    .line 216
    .line 217
    .line 218
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 219
    :try_start_2
    invoke-static {v2, v1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 220
    .line 221
    .line 222
    goto :goto_6

    .line 223
    :catchall_1
    move-exception v3

    .line 224
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 225
    :catchall_2
    move-exception v5

    .line 226
    :try_start_4
    invoke-static {v2, v3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 227
    .line 228
    .line 229
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 230
    :goto_5
    new-instance v3, Lsf/f;

    .line 231
    .line 232
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 233
    .line 234
    .line 235
    :goto_6
    move-object v2, v3

    .line 236
    :goto_7
    nop

    .line 237
    instance-of v3, v2, Lsf/f;

    .line 238
    .line 239
    if-eqz v3, :cond_10

    .line 240
    .line 241
    move-object v2, v1

    .line 242
    :cond_10
    check-cast v2, Landroid/graphics/Bitmap;

    .line 243
    .line 244
    if-eqz v2, :cond_b

    .line 245
    .line 246
    move-object v1, v2

    .line 247
    :cond_11
    invoke-virtual {p0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    return-object v1
.end method

.method public static q(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 10

    .line 1
    sget-object v0, Le9/q;->m:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_7

    .line 13
    .line 14
    :try_start_0
    const-string v2, "PRAGMA database_list"

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->query(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    new-instance v2, Lsf/f;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v2

    .line 28
    :goto_0
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 29
    .line 30
    instance-of v3, v0, Lsf/f;

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    move-object v0, v2

    .line 35
    :cond_1
    check-cast v0, Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_7

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/util/Map;

    .line 52
    .line 53
    const-string v3, "file"

    .line 54
    .line 55
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object v2, v1

    .line 67
    :goto_2
    if-nez v2, :cond_4

    .line 68
    .line 69
    const-string v2, ""

    .line 70
    .line 71
    :cond_4
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    new-instance v3, Ljava/io/File;

    .line 79
    .line 80
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    new-instance v3, Ljava/io/File;

    .line 90
    .line 91
    const-string v4, "avatar"

    .line 92
    .line 93
    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_6

    .line 101
    .line 102
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    :cond_6
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_3

    .line 113
    :cond_7
    move-object v0, v1

    .line 114
    :goto_3
    sput-object v0, Le9/q;->m:Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v0, :cond_b

    .line 117
    .line 118
    :goto_4
    const/4 v2, 0x0

    .line 119
    const/4 v3, 0x2

    .line 120
    :try_start_1
    const-string v4, "MD5"

    .line 121
    .line 122
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    sget-object v5, Log/a;->a:Ljava/nio/charset/Charset;

    .line 127
    .line 128
    invoke-virtual {p0, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    array-length v4, p0

    .line 140
    mul-int/2addr v4, v3

    .line 141
    new-instance v5, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 144
    .line 145
    .line 146
    array-length v4, p0

    .line 147
    move v6, v2

    .line 148
    :goto_5
    if-lt v6, v4, :cond_8

    .line 149
    .line 150
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    goto :goto_7

    .line 155
    :catchall_1
    move-exception p0

    .line 156
    goto :goto_6

    .line 157
    :cond_8
    aget-byte v7, p0, v6

    .line 158
    .line 159
    ushr-int/lit8 v8, v7, 0x4

    .line 160
    .line 161
    and-int/lit8 v8, v8, 0xf

    .line 162
    .line 163
    const/16 v9, 0x10

    .line 164
    .line 165
    invoke-static {v9}, La/a;->w(I)V

    .line 166
    .line 167
    .line 168
    invoke-static {v8, v9}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    and-int/lit8 v7, v7, 0xf

    .line 179
    .line 180
    invoke-static {v9}, La/a;->w(I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v7, v9}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 191
    .line 192
    .line 193
    add-int/lit8 v6, v6, 0x1

    .line 194
    .line 195
    goto :goto_5

    .line 196
    :goto_6
    new-instance v4, Lsf/f;

    .line 197
    .line 198
    invoke-direct {v4, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    move-object p0, v4

    .line 202
    :goto_7
    nop

    .line 203
    instance-of v4, p0, Lsf/f;

    .line 204
    .line 205
    if-eqz v4, :cond_9

    .line 206
    .line 207
    move-object p0, v1

    .line 208
    :cond_9
    check-cast p0, Ljava/lang/String;

    .line 209
    .line 210
    if-eqz p0, :cond_b

    .line 211
    .line 212
    new-instance v4, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    const/4 v5, 0x1

    .line 218
    new-array v5, v5, [C

    .line 219
    .line 220
    const/16 v6, 0x2f

    .line 221
    .line 222
    aput-char v6, v5, v2

    .line 223
    .line 224
    invoke-static {v0, v5}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const/4 v0, 0x4

    .line 245
    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    const-string v0, "/user_"

    .line 253
    .line 254
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    if-eqz p1, :cond_a

    .line 258
    .line 259
    const-string p1, "hd_"

    .line 260
    .line 261
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    :cond_a
    const-string p1, ".png"

    .line 265
    .line 266
    invoke-static {v4, p0, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    new-instance p1, Ljava/io/File;

    .line 271
    .line 272
    invoke-direct {p1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-eqz p1, :cond_b

    .line 280
    .line 281
    move-object v1, p0

    .line 282
    :cond_b
    return-object v1
.end method

.method public static r(Lr8/g;Ljava/lang/String;Ljava/lang/String;Lfg/l;)Ljava/util/List;
    .locals 8

    .line 1
    sget-object v0, Le8/b;->a:Le8/b;

    .line 2
    .line 3
    sget-object v1, Le9/q;->o:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lr8/g;->a:Landroid/content/Context;

    .line 9
    .line 10
    const-string v2, "Hchat_custom_notification_method_cache"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sput-object v1, Le9/q;->o:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    :goto_0
    iget-object v2, p0, Lr8/g;->a:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v3, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    invoke-static {v2, v3}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    iget-object v3, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 27
    .line 28
    invoke-static {v1, v2, v3, p1}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v4, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {p3, v5}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/4 v5, 0x0

    .line 72
    if-nez v3, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    move-object v4, v5

    .line 76
    :goto_2
    if-eqz v4, :cond_4

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_4
    :try_start_0
    iget-object v3, p0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 80
    .line 81
    new-instance v4, Lch/e;

    .line 82
    .line 83
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    new-instance v6, Lfh/k;

    .line 87
    .line 88
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-static {p2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-static {v6, v7}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 96
    .line 97
    .line 98
    iput-object v6, v4, Lch/e;->h:Lfh/k;

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    new-instance v4, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    :cond_5
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_7

    .line 118
    .line 119
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 124
    .line 125
    :try_start_1
    iget-object v7, p0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 126
    .line 127
    invoke-virtual {v6, v7}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 128
    .line 129
    .line 130
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    goto :goto_4

    .line 132
    :catchall_0
    move-exception v6

    .line 133
    :try_start_2
    new-instance v7, Lsf/f;

    .line 134
    .line 135
    invoke-direct {v7, v6}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    move-object v6, v7

    .line 139
    :goto_4
    nop

    .line 140
    instance-of v7, v6, Lsf/f;

    .line 141
    .line 142
    if-eqz v7, :cond_6

    .line 143
    .line 144
    move-object v6, v5

    .line 145
    :cond_6
    check-cast v6, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    if-eqz v6, :cond_5

    .line 148
    .line 149
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :catchall_1
    move-exception p0

    .line 154
    goto :goto_7

    .line 155
    :cond_7
    new-instance p0, Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    :cond_8
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_9

    .line 169
    .line 170
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-interface {p3, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    check-cast v5, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    if-eqz v5, :cond_8

    .line 185
    .line 186
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    new-instance p3, Ljava/util/HashSet;

    .line 191
    .line 192
    invoke-direct {p3}, Ljava/util/HashSet;-><init>()V

    .line 193
    .line 194
    .line 195
    new-instance v3, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    :cond_a
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_b

    .line 209
    .line 210
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    move-object v5, v4

    .line 215
    check-cast v5, Ljava/lang/reflect/Method;

    .line 216
    .line 217
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-virtual {p3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v5

    .line 225
    if-eqz v5, :cond_a

    .line 226
    .line 227
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 228
    .line 229
    .line 230
    goto :goto_6

    .line 231
    :goto_7
    new-instance v3, Lsf/f;

    .line 232
    .line 233
    invoke-direct {v3, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 234
    .line 235
    .line 236
    :cond_b
    invoke-static {v3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    if-nez p0, :cond_c

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_c
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p3

    .line 247
    const-string v3, "[Hchat:CustomNotification] \u5b9a\u4f4d\u5fae\u4fe1\u901a\u77e5\u65b9\u6cd5\u5931\u8d25 anchor="

    .line 248
    .line 249
    const-string v4, ": "

    .line 250
    .line 251
    invoke-static {v3, p2, v4, p3, p0}, Leh/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 255
    .line 256
    :goto_8
    check-cast v3, Ljava/util/List;

    .line 257
    .line 258
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result p0

    .line 262
    if-nez p0, :cond_d

    .line 263
    .line 264
    invoke-virtual {v0, v1, v2, p1, v3}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 265
    .line 266
    .line 267
    goto :goto_9

    .line 268
    :cond_d
    const-string p0, "cache.key"

    .line 269
    .line 270
    :try_start_3
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    const-string p3, ""

    .line 275
    .line 276
    invoke-interface {v1, p0, p3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p3

    .line 280
    invoke-static {p3, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result p3

    .line 284
    if-nez p3, :cond_e

    .line 285
    .line 286
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 287
    .line 288
    .line 289
    move-result-object p3

    .line 290
    invoke-interface {p3, p0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 291
    .line 292
    .line 293
    :cond_e
    invoke-interface {p2, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 298
    .line 299
    .line 300
    :catchall_2
    :goto_9
    return-object v3
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x6

    .line 2
    const-string v1, ":\n"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p0, v1, v2, v2, v0}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x2

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v0, "title"

    .line 31
    .line 32
    invoke-static {p0, v0}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "des"

    .line 37
    .line 38
    invoke-static {p0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v3, "description"

    .line 43
    .line 44
    invoke-static {p0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v4, "content"

    .line 49
    .line 50
    invoke-static {p0, v4}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    filled-new-array {v0, v1, v3, v4}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v0}, Le9/q;->g([Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0}, Le9/q;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_1

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_1
    const-string v0, "<"

    .line 74
    .line 75
    invoke-static {p0, v0, v2}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    const-string p0, "[\u6536\u5230\u4e00\u6761\u65b0\u6d88\u606f]"

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_2
    invoke-static {p0}, Le9/q;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public static t(Landroid/app/Notification;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-nez p0, :cond_1

    .line 18
    .line 19
    const-string p0, ""

    .line 20
    .line 21
    :cond_1
    return-object p0
.end method

.method public static varargs u(Ljava/lang/Object;[Ljava/lang/String;)I
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-lt v2, v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    aget-object v3, p1, v2

    .line 8
    .line 9
    invoke-static {p0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    instance-of v4, v3, Ljava/lang/Number;

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Number;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 v3, 0x0

    .line 21
    :goto_1
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0
.end method

.method public static varargs v(Ljava/lang/Object;[Ljava/lang/String;)J
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-lt v1, v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p0, 0x0

    .line 6
    .line 7
    return-wide p0

    .line 8
    :cond_0
    aget-object v2, p1, v1

    .line 9
    .line 10
    invoke-static {p0, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    instance-of v3, v2, Ljava/lang/Number;

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    check-cast v2, Ljava/lang/Number;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/4 v2, 0x0

    .line 22
    :goto_1
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0

    .line 29
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0
.end method

.method public static varargs w(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const-string v2, ""

    .line 4
    .line 5
    if-lt v1, v0, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-object v3, p1, v1

    .line 9
    .line 10
    invoke-static {p0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    :goto_1
    if-nez v3, :cond_2

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move-object v2, v3

    .line 36
    :goto_2
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0
.end method

.method public static x(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/String;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v0

    .line 14
    :goto_0
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-string p0, ""

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    return-object v0
.end method

.method public static y(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "&lt;"

    .line 2
    .line 3
    const-string v1, "<"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "&gt;"

    .line 11
    .line 12
    const-string v1, ">"

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "&amp;"

    .line 19
    .line 20
    const-string v1, "&"

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "&quot;"

    .line 27
    .line 28
    const-string v1, "\""

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "&#39;"

    .line 35
    .line 36
    const-string v1, "\'"

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "\\s+"

    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v1, " "

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public static z(Landroid/content/Context;Le9/c;Le9/l;)V
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
    const-string v0, "notification"

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v4, v0, Landroid/app/NotificationManager;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroid/app/NotificationManager;

    .line 19
    .line 20
    move-object v4, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v4, v5

    .line 23
    :goto_0
    if-eqz v4, :cond_2d

    .line 24
    .line 25
    iget-boolean v0, v2, Le9/c;->i:Z

    .line 26
    .line 27
    const-string v6, "0"

    .line 28
    .line 29
    const-string v7, "1"

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v0, v7

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v0, v6

    .line 36
    :goto_1
    iget-boolean v8, v2, Le9/c;->h:Z

    .line 37
    .line 38
    if-eqz v8, :cond_2

    .line 39
    .line 40
    move-object v6, v7

    .line 41
    :cond_2
    iget-object v7, v2, Le9/c;->s:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const-string v8, "_v"

    .line 48
    .line 49
    const-string v9, "_"

    .line 50
    .line 51
    const-string v10, "Hchat_custom_notification_s"

    .line 52
    .line 53
    invoke-static {v10, v0, v8, v6, v9}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const/4 v6, 0x0

    .line 65
    :try_start_0
    invoke-virtual {v4}, Landroid/app/NotificationManager;->getNotificationChannels()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    if-eqz v7, :cond_7

    .line 70
    .line 71
    new-instance v8, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v9

    .line 84
    if-eqz v9, :cond_5

    .line 85
    .line 86
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    check-cast v9, Landroid/app/NotificationChannel;

    .line 91
    .line 92
    invoke-virtual {v9}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    if-eqz v9, :cond_4

    .line 97
    .line 98
    const-string v10, "Hchat_custom_notification_"

    .line 99
    .line 100
    invoke-static {v9, v10, v6}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-eqz v10, :cond_4

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    move-object v9, v5

    .line 108
    :goto_3
    if-eqz v9, :cond_3

    .line 109
    .line 110
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    const/16 v9, 0x64

    .line 119
    .line 120
    if-gt v7, v9, :cond_6

    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_6
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    sub-int/2addr v7, v9

    .line 128
    invoke-static {v7, v8}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-eqz v8, :cond_7

    .line 141
    .line 142
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    check-cast v8, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v4, v8}, Landroid/app/NotificationManager;->deleteNotificationChannel(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :catchall_0
    :cond_7
    :goto_5
    new-instance v7, Landroid/app/NotificationChannel;

    .line 153
    .line 154
    const-string v8, "Hchat \u81ea\u5b9a\u4e49\u901a\u77e5"

    .line 155
    .line 156
    const/4 v9, 0x4

    .line 157
    invoke-direct {v7, v0, v8, v9}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 158
    .line 159
    .line 160
    iget-boolean v8, v2, Le9/c;->h:Z

    .line 161
    .line 162
    invoke-virtual {v7, v8}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 163
    .line 164
    .line 165
    iget-boolean v8, v2, Le9/c;->h:Z

    .line 166
    .line 167
    const-wide/16 v10, 0x0

    .line 168
    .line 169
    const/4 v12, 0x2

    .line 170
    const/4 v13, 0x1

    .line 171
    if-eqz v8, :cond_8

    .line 172
    .line 173
    new-array v8, v9, [J

    .line 174
    .line 175
    aput-wide v10, v8, v6

    .line 176
    .line 177
    const-wide/16 v9, 0xfa

    .line 178
    .line 179
    aput-wide v9, v8, v13

    .line 180
    .line 181
    aput-wide v9, v8, v12

    .line 182
    .line 183
    const/4 v11, 0x3

    .line 184
    aput-wide v9, v8, v11

    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    new-array v8, v13, [J

    .line 188
    .line 189
    aput-wide v10, v8, v6

    .line 190
    .line 191
    :goto_6
    invoke-virtual {v7, v8}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v5, v5}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v7}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 198
    .line 199
    .line 200
    new-instance v7, Landroid/app/Notification$Builder;

    .line 201
    .line 202
    invoke-direct {v7, v1, v0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-boolean v0, v2, Le9/c;->m:Z

    .line 206
    .line 207
    iget-object v8, v2, Le9/c;->b:Ljava/lang/String;

    .line 208
    .line 209
    if-eqz v0, :cond_9

    .line 210
    .line 211
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    const v8, 0xffffff

    .line 216
    .line 217
    .line 218
    and-int/2addr v0, v8

    .line 219
    const/high16 v8, 0x4b000000    # 8388608.0f

    .line 220
    .line 221
    or-int/2addr v0, v8

    .line 222
    :goto_7
    move v8, v0

    .line 223
    goto :goto_8

    .line 224
    :cond_9
    sget-object v0, Le9/q;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 225
    .line 226
    new-instance v9, Lba/c;

    .line 227
    .line 228
    const/4 v10, 0x3

    .line 229
    invoke-direct {v9, v10}, Lba/c;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v9}, Ljava/util/concurrent/atomic/AtomicInteger;->updateAndGet(Ljava/util/function/IntUnaryOperator;)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 237
    .line 238
    .line 239
    move-result v8

    .line 240
    int-to-long v8, v8

    .line 241
    const-wide/16 v10, 0x3ff

    .line 242
    .line 243
    and-long/2addr v8, v10

    .line 244
    const/16 v10, 0x14

    .line 245
    .line 246
    shl-long/2addr v8, v10

    .line 247
    const-wide/32 v10, 0x4a000000

    .line 248
    .line 249
    .line 250
    or-long/2addr v8, v10

    .line 251
    int-to-long v10, v0

    .line 252
    const-wide/32 v14, 0xfffff

    .line 253
    .line 254
    .line 255
    and-long/2addr v10, v14

    .line 256
    or-long/2addr v8, v10

    .line 257
    const-wide/32 v10, 0x7fffffff

    .line 258
    .line 259
    .line 260
    and-long/2addr v8, v10

    .line 261
    long-to-int v0, v8

    .line 262
    goto :goto_7

    .line 263
    :goto_8
    iget-boolean v0, v2, Le9/c;->m:Z

    .line 264
    .line 265
    iget v9, v3, Le9/l;->c:I

    .line 266
    .line 267
    const-string v10, "hchat_custom_notification_unread_count"

    .line 268
    .line 269
    const-string v11, "hchat_custom_notification"

    .line 270
    .line 271
    const-string v14, "hchat_custom_notification_talker"

    .line 272
    .line 273
    if-eqz v0, :cond_14

    .line 274
    .line 275
    iget-object v0, v2, Le9/c;->b:Ljava/lang/String;

    .line 276
    .line 277
    :try_start_1
    invoke-virtual {v4}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 278
    .line 279
    .line 280
    move-result-object v15

    .line 281
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    new-instance v5, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 287
    .line 288
    .line 289
    move/from16 v16, v12

    .line 290
    .line 291
    :try_start_2
    array-length v12, v15

    .line 292
    move v13, v6

    .line 293
    :goto_9
    if-ge v13, v12, :cond_e

    .line 294
    .line 295
    aget-object v18, v15, v13

    .line 296
    .line 297
    invoke-virtual/range {v18 .. v18}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    if-eqz v6, :cond_b

    .line 302
    .line 303
    iget-object v6, v6, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 304
    .line 305
    if-eqz v6, :cond_b

    .line 306
    .line 307
    move/from16 v18, v12

    .line 308
    .line 309
    const/4 v12, 0x0

    .line 310
    invoke-virtual {v6, v11, v12}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 311
    .line 312
    .line 313
    move-result v19

    .line 314
    if-eqz v19, :cond_c

    .line 315
    .line 316
    invoke-virtual {v6, v14}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v12

    .line 320
    invoke-static {v12, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v12

    .line 324
    if-eqz v12, :cond_c

    .line 325
    .line 326
    const/4 v12, 0x0

    .line 327
    invoke-virtual {v6, v10, v12}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    const/4 v12, 0x1

    .line 332
    if-ge v6, v12, :cond_a

    .line 333
    .line 334
    const/4 v6, 0x1

    .line 335
    :cond_a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    goto :goto_a

    .line 340
    :catchall_1
    move-exception v0

    .line 341
    goto :goto_f

    .line 342
    :cond_b
    move/from16 v18, v12

    .line 343
    .line 344
    :cond_c
    const/4 v6, 0x0

    .line 345
    :goto_a
    if-eqz v6, :cond_d

    .line 346
    .line 347
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    :cond_d
    add-int/lit8 v13, v13, 0x1

    .line 351
    .line 352
    move/from16 v12, v18

    .line 353
    .line 354
    const/4 v6, 0x0

    .line 355
    goto :goto_9

    .line 356
    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 357
    .line 358
    .line 359
    move-result v0

    .line 360
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    if-nez v6, :cond_f

    .line 369
    .line 370
    const/4 v6, 0x0

    .line 371
    goto :goto_c

    .line 372
    :cond_f
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v6

    .line 376
    check-cast v6, Ljava/lang/Comparable;

    .line 377
    .line 378
    :cond_10
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    if-eqz v12, :cond_11

    .line 383
    .line 384
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v12

    .line 388
    check-cast v12, Ljava/lang/Comparable;

    .line 389
    .line 390
    invoke-interface {v6, v12}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 391
    .line 392
    .line 393
    move-result v13

    .line 394
    if-gez v13, :cond_10

    .line 395
    .line 396
    move-object v6, v12

    .line 397
    goto :goto_b

    .line 398
    :cond_11
    :goto_c
    check-cast v6, Ljava/lang/Integer;

    .line 399
    .line 400
    if-eqz v6, :cond_12

    .line 401
    .line 402
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    goto :goto_d

    .line 407
    :cond_12
    const/4 v5, 0x0

    .line 408
    :goto_d
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 413
    .line 414
    .line 415
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 416
    :goto_e
    const/16 v19, 0x0

    .line 417
    .line 418
    goto :goto_10

    .line 419
    :catchall_2
    move-exception v0

    .line 420
    move/from16 v16, v12

    .line 421
    .line 422
    :goto_f
    new-instance v5, Lsf/f;

    .line 423
    .line 424
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 425
    .line 426
    .line 427
    move-object v0, v5

    .line 428
    goto :goto_e

    .line 429
    :goto_10
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    instance-of v6, v0, Lsf/f;

    .line 434
    .line 435
    if-eqz v6, :cond_13

    .line 436
    .line 437
    move-object v0, v5

    .line 438
    :cond_13
    check-cast v0, Ljava/lang/Number;

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    const/16 v17, 0x1

    .line 445
    .line 446
    add-int/lit8 v0, v0, 0x1

    .line 447
    .line 448
    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    .line 449
    .line 450
    .line 451
    move-result v9

    .line 452
    goto :goto_11

    .line 453
    :cond_14
    move/from16 v16, v12

    .line 454
    .line 455
    :goto_11
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 460
    .line 461
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    if-eqz v0, :cond_15

    .line 466
    .line 467
    goto :goto_12

    .line 468
    :cond_15
    const/4 v5, 0x0

    .line 469
    :goto_12
    if-eqz v5, :cond_16

    .line 470
    .line 471
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    goto :goto_13

    .line 476
    :cond_16
    const v0, 0x1080077

    .line 477
    .line 478
    .line 479
    :goto_13
    iget-object v5, v3, Le9/l;->b:Ljava/lang/String;

    .line 480
    .line 481
    const/4 v12, 0x1

    .line 482
    if-le v9, v12, :cond_18

    .line 483
    .line 484
    const-string v6, "^\\[\\d+\u6761].*"

    .line 485
    .line 486
    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    invoke-virtual {v6, v5}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z

    .line 498
    .line 499
    .line 500
    move-result v6

    .line 501
    if-eqz v6, :cond_17

    .line 502
    .line 503
    goto :goto_14

    .line 504
    :cond_17
    new-instance v6, Ljava/lang/StringBuilder;

    .line 505
    .line 506
    const-string v12, "["

    .line 507
    .line 508
    invoke-direct {v6, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-string v12, "\u6761]"

    .line 515
    .line 516
    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    :cond_18
    :goto_14
    iget-object v6, v3, Le9/l;->h:Landroid/app/PendingIntent;

    .line 527
    .line 528
    if-eqz v6, :cond_19

    .line 529
    .line 530
    move-object/from16 v20, v4

    .line 531
    .line 532
    move-object/from16 v21, v10

    .line 533
    .line 534
    goto :goto_15

    .line 535
    :cond_19
    iget-object v6, v2, Le9/c;->b:Ljava/lang/String;

    .line 536
    .line 537
    new-instance v13, Ljava/util/ArrayList;

    .line 538
    .line 539
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 540
    .line 541
    .line 542
    new-instance v15, Landroid/content/Intent;

    .line 543
    .line 544
    invoke-direct {v15}, Landroid/content/Intent;-><init>()V

    .line 545
    .line 546
    .line 547
    new-instance v12, Landroid/content/ComponentName;

    .line 548
    .line 549
    move-object/from16 v20, v4

    .line 550
    .line 551
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    move-object/from16 v21, v10

    .line 556
    .line 557
    const-string v10, "com.tencent.mm.ui.LauncherUI"

    .line 558
    .line 559
    invoke-direct {v12, v4, v10}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {v15, v12}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 563
    .line 564
    .line 565
    const/high16 v4, 0x34000000

    .line 566
    .line 567
    invoke-virtual {v15, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    if-nez v4, :cond_1a

    .line 578
    .line 579
    new-instance v4, Landroid/content/Intent;

    .line 580
    .line 581
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 582
    .line 583
    .line 584
    new-instance v10, Landroid/content/ComponentName;

    .line 585
    .line 586
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 587
    .line 588
    .line 589
    move-result-object v12

    .line 590
    const-string v15, "com.tencent.mm.ui.chatting.ChattingUI"

    .line 591
    .line 592
    invoke-direct {v10, v12, v15}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v4, v10}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 596
    .line 597
    .line 598
    const-string v10, "Chat_User"

    .line 599
    .line 600
    invoke-virtual {v4, v10, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 601
    .line 602
    .line 603
    const-string v6, "Chat_Mode"

    .line 604
    .line 605
    const/4 v12, 0x1

    .line 606
    invoke-virtual {v4, v6, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 607
    .line 608
    .line 609
    const-string v6, "finish_direct"

    .line 610
    .line 611
    invoke-virtual {v4, v6, v12}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 612
    .line 613
    .line 614
    const/high16 v6, 0x24000000

    .line 615
    .line 616
    invoke-virtual {v4, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    :cond_1a
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 623
    .line 624
    .line 625
    move-result v4

    .line 626
    if-eqz v4, :cond_1b

    .line 627
    .line 628
    const/4 v6, 0x0

    .line 629
    goto :goto_15

    .line 630
    :cond_1b
    const/4 v12, 0x0

    .line 631
    new-array v4, v12, [Landroid/content/Intent;

    .line 632
    .line 633
    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    check-cast v4, [Landroid/content/Intent;

    .line 638
    .line 639
    const/high16 v6, 0xc000000

    .line 640
    .line 641
    invoke-static {v1, v8, v4, v6}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    move-object v6, v4

    .line 646
    :goto_15
    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    iget-object v4, v3, Le9/l;->a:Ljava/lang/String;

    .line 651
    .line 652
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    invoke-virtual {v0, v5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    invoke-virtual {v0, v9}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    iget-wide v4, v3, Le9/l;->e:J

    .line 669
    .line 670
    invoke-virtual {v0, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    const/4 v12, 0x1

    .line 675
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    const/4 v4, 0x0

    .line 684
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    const-string v4, "msg"

    .line 689
    .line 690
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-virtual {v0, v12}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-virtual {v0, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 699
    .line 700
    .line 701
    move-result-object v0

    .line 702
    new-instance v4, Landroid/os/Bundle;

    .line 703
    .line 704
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v4, v11, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 708
    .line 709
    .line 710
    iget-object v5, v2, Le9/c;->b:Ljava/lang/String;

    .line 711
    .line 712
    invoke-virtual {v4, v14, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    move-object/from16 v5, v21

    .line 716
    .line 717
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    .line 721
    .line 722
    .line 723
    iget-object v0, v3, Le9/l;->d:Landroid/graphics/Bitmap;

    .line 724
    .line 725
    if-eqz v0, :cond_1c

    .line 726
    .line 727
    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 728
    .line 729
    .line 730
    :cond_1c
    iget-boolean v0, v2, Le9/c;->j:Z

    .line 731
    .line 732
    const-string v4, "hchat_custom_notification_id"

    .line 733
    .line 734
    if-eqz v0, :cond_1e

    .line 735
    .line 736
    iget-object v0, v2, Le9/c;->b:Ljava/lang/String;

    .line 737
    .line 738
    :try_start_3
    new-instance v5, Landroid/content/Intent;

    .line 739
    .line 740
    const-string v6, "h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ"

    .line 741
    .line 742
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v6

    .line 749
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v5, v14, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v5, v4, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 756
    .line 757
    .line 758
    const/high16 v6, 0xc000000

    .line 759
    .line 760
    invoke-static {v1, v8, v5, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    new-instance v5, Landroid/app/Notification$Action$Builder;

    .line 765
    .line 766
    const-string v6, "\u5df2\u8bfb"

    .line 767
    .line 768
    const v9, 0x1080057

    .line 769
    .line 770
    .line 771
    invoke-direct {v5, v9, v6, v0}, Landroid/app/Notification$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v5}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 775
    .line 776
    .line 777
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 778
    goto :goto_16

    .line 779
    :catchall_3
    move-exception v0

    .line 780
    new-instance v5, Lsf/f;

    .line 781
    .line 782
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 783
    .line 784
    .line 785
    move-object v0, v5

    .line 786
    :goto_16
    nop

    .line 787
    instance-of v5, v0, Lsf/f;

    .line 788
    .line 789
    if-eqz v5, :cond_1d

    .line 790
    .line 791
    const/4 v0, 0x0

    .line 792
    :cond_1d
    check-cast v0, Landroid/app/Notification$Action;

    .line 793
    .line 794
    if-eqz v0, :cond_1e

    .line 795
    .line 796
    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 797
    .line 798
    .line 799
    :cond_1e
    iget-boolean v0, v2, Le9/c;->k:Z

    .line 800
    .line 801
    if-eqz v0, :cond_22

    .line 802
    .line 803
    iget-object v0, v2, Le9/c;->b:Ljava/lang/String;

    .line 804
    .line 805
    iget-wide v5, v3, Le9/l;->f:J

    .line 806
    .line 807
    iget-wide v9, v3, Le9/l;->g:J

    .line 808
    .line 809
    iget-boolean v3, v2, Le9/c;->l:Z

    .line 810
    .line 811
    :try_start_4
    new-instance v12, Landroid/app/RemoteInput$Builder;

    .line 812
    .line 813
    const-string v13, "hchat_reply_text"

    .line 814
    .line 815
    invoke-direct {v12, v13}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    const-string v13, "\u8f93\u5165\u56de\u590d\u5185\u5bb9..."

    .line 819
    .line 820
    invoke-virtual {v12, v13}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;

    .line 821
    .line 822
    .line 823
    move-result-object v12

    .line 824
    const/4 v13, 0x1

    .line 825
    invoke-virtual {v12, v13}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;

    .line 826
    .line 827
    .line 828
    move-result-object v12

    .line 829
    invoke-virtual {v12}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;

    .line 830
    .line 831
    .line 832
    move-result-object v12

    .line 833
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    new-instance v13, Landroid/content/Intent;

    .line 837
    .line 838
    const-string v15, "h.Hchat.action.CUSTOM_NOTIFICATION_REPLY"

    .line 839
    .line 840
    invoke-direct {v13, v15}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 844
    .line 845
    .line 846
    move-result-object v15

    .line 847
    invoke-virtual {v13, v15}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 848
    .line 849
    .line 850
    const/high16 v15, 0x10000000

    .line 851
    .line 852
    invoke-virtual {v13, v15}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 853
    .line 854
    .line 855
    invoke-virtual {v13, v14, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v13, v4, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 859
    .line 860
    .line 861
    const-string v0, "hchat_custom_notification_reply_msg_id"

    .line 862
    .line 863
    invoke-virtual {v13, v0, v5, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 864
    .line 865
    .line 866
    const-string v0, "hchat_custom_notification_native_msg_svr_id"

    .line 867
    .line 868
    invoke-virtual {v13, v0, v9, v10}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 869
    .line 870
    .line 871
    const-string v0, "hchat_custom_notification_quote_quick_reply"

    .line 872
    .line 873
    invoke-virtual {v13, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 874
    .line 875
    .line 876
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 877
    .line 878
    const/16 v3, 0x1f

    .line 879
    .line 880
    if-lt v0, v3, :cond_1f

    .line 881
    .line 882
    const/high16 v3, 0xa000000

    .line 883
    .line 884
    goto :goto_17

    .line 885
    :cond_1f
    const/high16 v3, 0x8000000

    .line 886
    .line 887
    :goto_17
    invoke-static {v1, v8, v13, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 888
    .line 889
    .line 890
    move-result-object v3

    .line 891
    new-instance v4, Landroid/app/Notification$Action$Builder;

    .line 892
    .line 893
    const-string v5, "\u5feb\u6377\u56de\u590d"

    .line 894
    .line 895
    const v6, 0x1080050

    .line 896
    .line 897
    .line 898
    invoke-direct {v4, v6, v5, v3}, Landroid/app/Notification$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v4, v12}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 902
    .line 903
    .line 904
    move-result-object v3

    .line 905
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    const/4 v12, 0x1

    .line 909
    invoke-virtual {v3, v12}, Landroid/app/Notification$Action$Builder;->setAllowGeneratedReplies(Z)Landroid/app/Notification$Action$Builder;

    .line 910
    .line 911
    .line 912
    const/16 v4, 0x1c

    .line 913
    .line 914
    if-lt v0, v4, :cond_20

    .line 915
    .line 916
    invoke-static {v3}, Lb0/b0;->t(Landroid/app/Notification$Action$Builder;)V

    .line 917
    .line 918
    .line 919
    goto :goto_18

    .line 920
    :catchall_4
    move-exception v0

    .line 921
    goto :goto_19

    .line 922
    :cond_20
    :goto_18
    invoke-virtual {v3}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    .line 923
    .line 924
    .line 925
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 926
    goto :goto_1a

    .line 927
    :goto_19
    new-instance v3, Lsf/f;

    .line 928
    .line 929
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 930
    .line 931
    .line 932
    move-object v0, v3

    .line 933
    :goto_1a
    nop

    .line 934
    instance-of v3, v0, Lsf/f;

    .line 935
    .line 936
    if-eqz v3, :cond_21

    .line 937
    .line 938
    const/4 v0, 0x0

    .line 939
    :cond_21
    check-cast v0, Landroid/app/Notification$Action;

    .line 940
    .line 941
    if-eqz v0, :cond_22

    .line 942
    .line 943
    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 944
    .line 945
    .line 946
    :cond_22
    invoke-virtual {v7}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    move-object/from16 v5, v20

    .line 951
    .line 952
    invoke-virtual {v5, v8, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 953
    .line 954
    .line 955
    iget-boolean v0, v2, Le9/c;->m:Z

    .line 956
    .line 957
    if-eqz v0, :cond_28

    .line 958
    .line 959
    iget-object v3, v2, Le9/c;->b:Ljava/lang/String;

    .line 960
    .line 961
    :try_start_5
    invoke-virtual {v5}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 962
    .line 963
    .line 964
    move-result-object v0

    .line 965
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 966
    .line 967
    .line 968
    array-length v4, v0

    .line 969
    const/4 v12, 0x0

    .line 970
    :goto_1b
    if-ge v12, v4, :cond_27

    .line 971
    .line 972
    aget-object v6, v0, v12

    .line 973
    .line 974
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 975
    .line 976
    .line 977
    move-result v7

    .line 978
    if-ne v7, v8, :cond_24

    .line 979
    .line 980
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v7

    .line 984
    if-nez v7, :cond_24

    .line 985
    .line 986
    :cond_23
    const/4 v9, 0x0

    .line 987
    goto :goto_1c

    .line 988
    :catchall_5
    move-exception v0

    .line 989
    goto :goto_1d

    .line 990
    :cond_24
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    .line 991
    .line 992
    .line 993
    move-result-object v7

    .line 994
    if-eqz v7, :cond_23

    .line 995
    .line 996
    iget-object v7, v7, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 997
    .line 998
    if-eqz v7, :cond_23

    .line 999
    .line 1000
    const/4 v9, 0x0

    .line 1001
    invoke-virtual {v7, v11, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 1002
    .line 1003
    .line 1004
    move-result v10

    .line 1005
    if-eqz v10, :cond_26

    .line 1006
    .line 1007
    invoke-virtual {v7, v14}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v7

    .line 1011
    invoke-static {v7, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1012
    .line 1013
    .line 1014
    move-result v7

    .line 1015
    if-eqz v7, :cond_26

    .line 1016
    .line 1017
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v7

    .line 1021
    if-nez v7, :cond_25

    .line 1022
    .line 1023
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 1024
    .line 1025
    .line 1026
    move-result v6

    .line 1027
    invoke-virtual {v5, v6}, Landroid/app/NotificationManager;->cancel(I)V

    .line 1028
    .line 1029
    .line 1030
    goto :goto_1c

    .line 1031
    :cond_25
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v7

    .line 1035
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 1036
    .line 1037
    .line 1038
    move-result v6

    .line 1039
    invoke-virtual {v5, v7, v6}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 1040
    .line 1041
    .line 1042
    :cond_26
    :goto_1c
    add-int/lit8 v12, v12, 0x1

    .line 1043
    .line 1044
    goto :goto_1b

    .line 1045
    :cond_27
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1046
    .line 1047
    goto :goto_1e

    .line 1048
    :goto_1d
    new-instance v4, Lsf/f;

    .line 1049
    .line 1050
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1051
    .line 1052
    .line 1053
    move-object v0, v4

    .line 1054
    :goto_1e
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    if-eqz v0, :cond_28

    .line 1059
    .line 1060
    const-string v4, "[Hchat:CustomNotification] \u5408\u5e76\u4f1a\u8bdd\u901a\u77e5\u6e05\u7406\u5931\u8d25: "

    .line 1061
    .line 1062
    invoke-static {v4, v3, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1063
    .line 1064
    .line 1065
    :cond_28
    iget-boolean v0, v2, Le9/c;->i:Z

    .line 1066
    .line 1067
    if-eqz v0, :cond_2d

    .line 1068
    .line 1069
    iget-object v0, v2, Le9/c;->s:Ljava/lang/String;

    .line 1070
    .line 1071
    :try_start_6
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v2

    .line 1075
    if-eqz v2, :cond_29

    .line 1076
    .line 1077
    invoke-static/range {v16 .. v16}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    goto :goto_20

    .line 1082
    :catchall_6
    move-exception v0

    .line 1083
    goto :goto_1f

    .line 1084
    :cond_29
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1088
    goto :goto_20

    .line 1089
    :goto_1f
    new-instance v2, Lsf/f;

    .line 1090
    .line 1091
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 1092
    .line 1093
    .line 1094
    move-object v0, v2

    .line 1095
    :goto_20
    nop

    .line 1096
    instance-of v2, v0, Lsf/f;

    .line 1097
    .line 1098
    if-eqz v2, :cond_2a

    .line 1099
    .line 1100
    const/4 v5, 0x0

    .line 1101
    goto :goto_21

    .line 1102
    :cond_2a
    move-object v5, v0

    .line 1103
    :goto_21
    check-cast v5, Landroid/net/Uri;

    .line 1104
    .line 1105
    if-nez v5, :cond_2b

    .line 1106
    .line 1107
    goto :goto_22

    .line 1108
    :cond_2b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1109
    .line 1110
    .line 1111
    move-result-wide v2

    .line 1112
    sget-wide v6, Le9/q;->n:J

    .line 1113
    .line 1114
    sub-long v6, v2, v6

    .line 1115
    .line 1116
    const-wide/16 v8, 0x4b0

    .line 1117
    .line 1118
    cmp-long v0, v6, v8

    .line 1119
    .line 1120
    if-gez v0, :cond_2c

    .line 1121
    .line 1122
    goto :goto_22

    .line 1123
    :cond_2c
    sput-wide v2, Le9/q;->n:J

    .line 1124
    .line 1125
    sget-object v0, Le9/q;->f:Landroid/os/Handler;

    .line 1126
    .line 1127
    new-instance v2, Le9/e;

    .line 1128
    .line 1129
    const/4 v3, 0x0

    .line 1130
    invoke-direct {v2, v1, v5, v3}, Le9/e;-><init>(Landroid/content/Context;Landroid/net/Uri;I)V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1134
    .line 1135
    .line 1136
    :cond_2d
    :goto_22
    return-void
.end method
