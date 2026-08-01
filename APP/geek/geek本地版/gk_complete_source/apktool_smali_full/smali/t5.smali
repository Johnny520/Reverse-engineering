.class public final synthetic Lt5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lt5;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lt5;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lt5;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lt5;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lt5;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lt5;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Landroid/app/Activity;

    .line 11
    .line 12
    check-cast v1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    :try_start_0
    invoke-static {v2, v1}, Lvh;->d(Landroid/app/Activity;Landroid/view/ViewGroup;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    const-string v0, "+VffZ09eERHCWM55\n"

    .line 32
    .line 33
    const-string v1, "rT6rCyoNYX4=\n"

    .line 34
    .line 35
    invoke-static {v0, v1}, Lu40;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "Fg==\n"

    .line 40
    .line 41
    const-string v2, "c8HJlSTQVfc=\n"

    .line 42
    .line 43
    const-string v3, "Nwje\n"

    .line 44
    .line 45
    const-string v4, "Q2m5jaPP2Zc=\n"

    .line 46
    .line 47
    invoke-static {v3, v4, v0, v1, v2}, Lz30;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void

    .line 51
    :pswitch_0
    check-cast v2, Lzt;

    .line 52
    .line 53
    check-cast v1, Landroid/graphics/Typeface;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Lzt;->J(Landroid/graphics/Typeface;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_1
    check-cast v2, Lsm;

    .line 60
    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    invoke-interface {v2, v1}, Lsm;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_2
    check-cast v2, Lhv;

    .line 68
    .line 69
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 70
    .line 71
    invoke-virtual {v2}, Lhv;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_3
    check-cast v2, Ljava/lang/String;

    .line 79
    .line 80
    check-cast v1, Li00;

    .line 81
    .line 82
    sget-object v0, Ld9;->a:Ljava/lang/ClassLoader;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    sget-object v3, Luv;->a:Landroid/os/Handler;

    .line 87
    .line 88
    iget-object v1, v1, Li00;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v0, v2, v1}, Luv;->f(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    :cond_2
    return-void

    .line 96
    :pswitch_4
    check-cast v2, Ljava/lang/String;

    .line 97
    .line 98
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    sget-object v0, Ld9;->a:Ljava/lang/ClassLoader;

    .line 101
    .line 102
    if-eqz v0, :cond_3

    .line 103
    .line 104
    invoke-static {v0, v2, v1}, Luv;->c(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    :cond_3
    return-void

    .line 108
    :pswitch_5
    check-cast v2, Lio/fastkv/MPFastKV;

    .line 109
    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v2, v1}, Lio/fastkv/MPFastKV;->c(Lio/fastkv/MPFastKV;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_6
    check-cast v2, Lio/fastkv/LimitExecutor;

    .line 117
    .line 118
    check-cast v1, Ljava/lang/Runnable;

    .line 119
    .line 120
    invoke-static {v2, v1}, Lio/fastkv/LimitExecutor;->a(Lio/fastkv/LimitExecutor;Ljava/lang/Runnable;)V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_7
    check-cast v2, Landroid/view/ViewGroup;

    .line 125
    .line 126
    check-cast v1, Li00;

    .line 127
    .line 128
    iget-object v0, v1, Li00;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Landroid/view/View;

    .line 131
    .line 132
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_8
    check-cast v2, Lo9;

    .line 137
    .line 138
    check-cast v1, Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v2, v1}, Lo9;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :pswitch_9
    check-cast v2, Lu5;

    .line 145
    .line 146
    check-cast v1, Ljava/lang/Runnable;

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    :try_start_1
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Lu5;->a()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :catchall_1
    move-exception v0

    .line 159
    invoke-virtual {v2}, Lu5;->a()V

    .line 160
    .line 161
    .line 162
    throw v0

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
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
