.class public final Lrg/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrg/f;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lrg/f;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lrg/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lrg/f;->h:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Ly1/t;

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Ly1/t;->C0:Landroid/view/MotionEvent;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v3, 0xa

    .line 23
    .line 24
    if-eq v0, v3, :cond_1

    .line 25
    .line 26
    const/4 v3, 0x1

    .line 27
    if-eq v0, v3, :cond_1

    .line 28
    .line 29
    const/4 v3, 0x7

    .line 30
    if-eq v0, v3, :cond_0

    .line 31
    .line 32
    const/16 v4, 0x9

    .line 33
    .line 34
    if-eq v0, v4, :cond_0

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    :cond_0
    iget-wide v4, v1, Ly1/t;->D0:J

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-virtual/range {v1 .. v6}, Ly1/t;->L(Landroid/view/MotionEvent;IJZ)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :pswitch_0
    iget-object v0, p0, Lrg/f;->h:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v1, v0

    .line 47
    check-cast v1, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;

    .line 48
    .line 49
    iget-boolean v0, v1, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->h:Z

    .line 50
    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    move-object v0, v1

    .line 62
    :goto_0
    :try_start_0
    invoke-static {}, Lw9/a;->c()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v3, "com.tencent.mm"

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    const/high16 v3, 0x10000000

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    new-instance v2, Lsf/f;

    .line 94
    .line 95
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    move-object v0, v2

    .line 99
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const-string v3, "[Hchat:KeepAlive] \u770b\u95e8\u72d7\u62c9\u8d77\u5fae\u4fe1\u5931\u8d25: "

    .line 110
    .line 111
    invoke-static {v3, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    :goto_2
    iget-boolean v0, v1, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->i:Z

    .line 115
    .line 116
    if-nez v0, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    new-instance v0, Ljava/lang/Thread;

    .line 120
    .line 121
    new-instance v2, Lh/Hchat/crash/e;

    .line 122
    .line 123
    const/4 v3, 0x5

    .line 124
    invoke-direct {v2, v3}, Lh/Hchat/crash/e;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    const-string v2, "Hchat-KeepAlive-Heartbeat"

    .line 131
    .line 132
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v2, 0x1

    .line 136
    invoke-virtual {v0, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 140
    .line 141
    .line 142
    :goto_3
    iget-object v0, v1, Lh/Hchat/hooks/items/keepalive/WeChatKeepAliveService;->g:Landroid/os/Handler;

    .line 143
    .line 144
    const-wide/32 v1, 0xea60

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_1
    iget-object v0, p0, Lrg/f;->h:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lqg/g;

    .line 154
    .line 155
    invoke-static {v0}, Lrg/g;->a(Lqg/g;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
