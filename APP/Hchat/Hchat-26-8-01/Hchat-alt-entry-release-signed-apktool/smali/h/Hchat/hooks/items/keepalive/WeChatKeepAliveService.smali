.class public final Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;
.super Landroid/app/Service;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final synthetic k:I


# instance fields
.field public final g:Landroid/os/Handler;

.field public h:Z

.field public i:Z

.field public final j:Lrg/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->g:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Lrg/f;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, v1}, Lrg/f;-><init>(Ljava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->j:Lrg/f;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a()Landroid/app/Notification;
    .locals 6

    .line 1
    const-class v0, Landroid/app/NotificationManager;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/NotificationManager;

    .line 8
    .line 9
    new-instance v1, Landroid/app/NotificationChannel;

    .line 10
    .line 11
    const-string v2, "hchat_wechat_keep_alive"

    .line 12
    .line 13
    const-string v3, "Hchat \u5fae\u4fe1\u4fdd\u6d3b"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->enableLights(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v3}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    invoke-virtual {v1, v5, v5}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    .line 31
    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    new-instance v0, Landroid/app/Notification$Builder;

    .line 39
    .line 40
    invoke-direct {v0, p0, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const v1, 0x7f050008

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const-string v1, "Hchat \u5fae\u4fe1\u5f3a\u4fdd\u6d3b"

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, "\u6b63\u5728\u5c1d\u8bd5\u4fdd\u6301\u5fae\u4fe1\u606f\u5c4f\u8fd0\u884c"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    return-object v0
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->g:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->j:Lrg/f;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    .line 1
    iget-object p2, p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->j:Lrg/f;

    .line 2
    .line 3
    iget-object p3, p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->g:Landroid/os/Handler;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    :try_start_0
    const-string v2, "h.Hchat.extra.WATCHDOG"

    .line 10
    .line 11
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ne v2, v0, :cond_0

    .line 16
    .line 17
    move v2, v0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    move v2, v1

    .line 22
    :goto_0
    iput-boolean v2, p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->h:Z

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const-string v2, "h.Hchat.extra.NETWORK_HEARTBEAT"

    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-ne p1, v0, :cond_1

    .line 33
    .line 34
    move v1, v0

    .line 35
    :cond_1
    iput-boolean v1, p0, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->i:Z

    .line 36
    .line 37
    invoke-virtual {p0}, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->a()Landroid/app/Notification;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const v1, 0x7efc6

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1, p1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p3, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    const-wide/32 v1, 0xea60

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, p2, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_2

    .line 61
    :goto_1
    new-instance p2, Lsf/f;

    .line 62
    .line 63
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    move-object p1, p2

    .line 67
    :goto_2
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-eqz p2, :cond_2

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    const-string v0, "[Hchat:KeepAliveService] \u542f\u52a8\u524d\u53f0\u4fdd\u6d3b\u670d\u52a1\u5931\u8d25: "

    .line 78
    .line 79
    invoke-static {v0, p3, p2}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    const/4 p2, 0x2

    .line 83
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    instance-of p3, p1, Lsf/f;

    .line 88
    .line 89
    if-eqz p3, :cond_3

    .line 90
    .line 91
    move-object p1, p2

    .line 92
    :cond_3
    check-cast p1, Ljava/lang/Number;

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    return p1
.end method
