.class public final synthetic Lcy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/util/ArrayList;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ι:Z

.field public final synthetic κ:Landroid/app/NotificationManager;

.field public final synthetic λ:I


# direct methods
.method public synthetic constructor <init>(ILjava/util/ArrayList;Landroid/app/Activity;Ljava/util/concurrent/atomic/AtomicInteger;ZLandroid/app/NotificationManager;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcy0;->ε:I

    .line 5
    .line 6
    iput-object p2, p0, Lcy0;->ζ:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-object p3, p0, Lcy0;->η:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lcy0;->θ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    iput-boolean p5, p0, Lcy0;->ι:Z

    .line 13
    .line 14
    iput-object p6, p0, Lcy0;->κ:Landroid/app/NotificationManager;

    .line 15
    .line 16
    iput p7, p0, Lcy0;->λ:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v4, p0, Lcy0;->ε:I

    .line 2
    .line 3
    const/4 v11, 0x1

    .line 4
    if-ge v4, v11, :cond_0

    .line 5
    .line 6
    move v0, v11

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v4

    .line 9
    :goto_0
    const/4 v1, 0x6

    .line 10
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-instance v1, Laj;

    .line 15
    .line 16
    const/16 v2, 0xd

    .line 17
    .line 18
    invoke-direct {v1, v2}, Laj;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object v12

    .line 25
    new-instance v7, Ljava/util/concurrent/CountDownLatch;

    .line 26
    .line 27
    invoke-direct {v7, v4}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-instance v6, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {v6, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcy0;->ζ:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v13

    .line 42
    move v3, v0

    .line 43
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v2, p0, Lcy0;->η:Landroid/app/Activity;

    .line 48
    .line 49
    iget-object v5, p0, Lcy0;->θ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 50
    .line 51
    iget-boolean v8, p0, Lcy0;->ι:Z

    .line 52
    .line 53
    iget-object v9, p0, Lcy0;->κ:Landroid/app/NotificationManager;

    .line 54
    .line 55
    iget v10, p0, Lcy0;->λ:I

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    add-int/lit8 v14, v3, 0x1

    .line 64
    .line 65
    if-ltz v3, :cond_1

    .line 66
    .line 67
    move-object v1, v0

    .line 68
    check-cast v1, Lf8;

    .line 69
    .line 70
    new-instance v0, Lux0;

    .line 71
    .line 72
    invoke-direct/range {v0 .. v10}, Lux0;-><init>(Lf8;Landroid/app/Activity;IILjava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/CountDownLatch;ZLandroid/app/NotificationManager;I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v12, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    move v3, v14

    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-static {}, Lyh;->х()V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    throw p0

    .line 85
    :cond_2
    invoke-virtual {v7}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v12}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lqy0;->α:Lqy0;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    const-string v0, "\u6210\u529f "

    .line 98
    .line 99
    const-string v1, "/"

    .line 100
    .line 101
    invoke-static {p0, v4, v0, v1}, Lnx;->δ(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string v0, "\u6279\u91cf\u4e0b\u8f7d"

    .line 106
    .line 107
    const-string v3, "\u6279\u91cf\u4e0b\u8f7d\u5b8c\u6210"

    .line 108
    .line 109
    invoke-static {v2, v3, p0, v0}, Lqy0;->Е(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    if-eqz v8, :cond_3

    .line 113
    .line 114
    new-instance p0, Lx31;

    .line 115
    .line 116
    invoke-direct {p0, v2}, Lx31;-><init>(Landroid/content/Context;)V

    .line 117
    .line 118
    .line 119
    const v0, 0x1080082

    .line 120
    .line 121
    .line 122
    iget-object v6, p0, Lx31;->ξ:Landroid/app/Notification;

    .line 123
    .line 124
    iput v0, v6, Landroid/app/Notification;->icon:I

    .line 125
    .line 126
    invoke-static {v3}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, p0, Lx31;->ε:Ljava/lang/CharSequence;

    .line 131
    .line 132
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    new-instance v3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    const-string v6, "\u6210\u529f\u4e0b\u8f7d "

    .line 139
    .line 140
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v0, " \u4e2a\u4f5c\u54c1"

    .line 153
    .line 154
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-static {v0}, Lx31;->β(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iput-object v0, p0, Lx31;->ζ:Ljava/lang/CharSequence;

    .line 166
    .line 167
    const/16 v0, 0x10

    .line 168
    .line 169
    invoke-virtual {p0, v0}, Lx31;->γ(I)V

    .line 170
    .line 171
    .line 172
    iput-boolean v11, p0, Lx31;->ο:Z

    .line 173
    .line 174
    invoke-virtual {p0}, Lx31;->α()Landroid/app/Notification;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {v9, v10, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 179
    .line 180
    .line 181
    :cond_3
    new-instance p0, Lgs;

    .line 182
    .line 183
    invoke-direct {p0, v2, v5, v4}, Lgs;-><init>(Landroid/app/Activity;Ljava/util/concurrent/atomic/AtomicInteger;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, p0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method
