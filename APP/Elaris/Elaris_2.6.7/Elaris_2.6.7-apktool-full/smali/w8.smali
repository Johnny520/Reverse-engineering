.class public final Lw8;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lb9;

.field public final synthetic d:Ll8;

.field public final synthetic e:Landroid/os/Handler;

.field public final synthetic f:I

.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Ljava/lang/ClassLoader;

.field public final synthetic i:Lpd;

.field public final synthetic j:Lx2;

.field public final synthetic k:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lb9;Ll8;Landroid/os/Handler;ILandroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Lx2;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw8;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lw8;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lw8;->c:Lb9;

    .line 9
    .line 10
    iput-object p4, p0, Lw8;->d:Ll8;

    .line 11
    .line 12
    iput-object p5, p0, Lw8;->e:Landroid/os/Handler;

    .line 13
    .line 14
    iput p6, p0, Lw8;->f:I

    .line 15
    .line 16
    iput-object p7, p0, Lw8;->g:Landroid/app/Activity;

    .line 17
    .line 18
    iput-object p8, p0, Lw8;->h:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    iput-object p9, p0, Lw8;->i:Lpd;

    .line 21
    .line 22
    iput-object p10, p0, Lw8;->j:Lx2;

    .line 23
    .line 24
    iput-object p11, p0, Lw8;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    const/4 v1, 0x0

    .line 2
    const/4 v2, 0x0

    .line 3
    :try_start_0
    iget-object v0, p0, Lw8;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v3, p0, Lw8;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lw8;->c:Lb9;

    .line 8
    .line 9
    iget-object v4, v4, Lb9;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lw8;->d:Ll8;

    .line 12
    .line 13
    invoke-static {v0, v3, v4, v5}, Li5;->v0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ll8;)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 17
    :try_start_1
    invoke-static {v3}, Lcom/mr/elaris/w;->v(Ljava/io/File;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lez v0, :cond_0

    .line 22
    .line 23
    new-instance v4, Lna;

    .line 24
    .line 25
    invoke-direct {v4, v3, v0}, Lna;-><init>(Ljava/io/File;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 26
    .line 27
    .line 28
    :try_start_2
    iget-object v0, p0, Lw8;->e:Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v5, Lq;

    .line 31
    .line 32
    const/4 v6, 0x7

    .line 33
    invoke-direct {v5, p0, v4, v6, v1}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 37
    .line 38
    .line 39
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    iget-object p0, p0, Lw8;->d:Ll8;

    .line 41
    .line 42
    invoke-virtual {p0}, Ll8;->c()V

    .line 43
    .line 44
    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    invoke-static {v3}, Li5;->a(Ljava/io/File;)V

    .line 48
    .line 49
    .line 50
    invoke-static {}, La9;->b()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object v8, v0

    .line 56
    move-object v13, v2

    .line 57
    move-object v14, v4

    .line 58
    goto :goto_0

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    move-object v8, v0

    .line 61
    move-object v14, v2

    .line 62
    move-object v13, v3

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 65
    .line 66
    const-string v4, "script silk duration invalid"

    .line 67
    .line 68
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 72
    :catchall_2
    move-exception v0

    .line 73
    move-object v8, v0

    .line 74
    move-object v13, v2

    .line 75
    move-object v14, v13

    .line 76
    :goto_0
    :try_start_4
    iget-object v0, p0, Lw8;->d:Ll8;

    .line 77
    .line 78
    iget-boolean v0, v0, Ll8;->a:Z

    .line 79
    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_1
    :goto_1
    move v6, v1

    .line 94
    goto :goto_3

    .line 95
    :catchall_3
    move-exception v0

    .line 96
    goto :goto_5

    .line 97
    :cond_2
    :goto_2
    const/4 v1, 0x1

    .line 98
    goto :goto_1

    .line 99
    :goto_3
    if-nez v6, :cond_3

    .line 100
    .line 101
    const-string v0, "kk-tts"

    .line 102
    .line 103
    const-string v1, "generate"

    .line 104
    .line 105
    invoke-static {v0, v1, v8}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    iget-object v0, p0, Lw8;->e:Landroid/os/Handler;

    .line 109
    .line 110
    iget-object v4, p0, Lw8;->j:Lx2;

    .line 111
    .line 112
    iget-object v5, p0, Lw8;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 113
    .line 114
    iget-object v7, p0, Lw8;->g:Landroid/app/Activity;

    .line 115
    .line 116
    iget-object v9, p0, Lw8;->h:Ljava/lang/ClassLoader;

    .line 117
    .line 118
    iget-object v10, p0, Lw8;->i:Lpd;

    .line 119
    .line 120
    iget-object v11, p0, Lw8;->c:Lb9;

    .line 121
    .line 122
    iget-object v12, p0, Lw8;->b:Ljava/lang/String;

    .line 123
    .line 124
    new-instance v3, Lv8;

    .line 125
    .line 126
    invoke-direct/range {v3 .. v12}, Lv8;-><init>(Lx2;Ljava/util/concurrent/atomic/AtomicBoolean;ZLandroid/app/Activity;Ljava/lang/Throwable;Ljava/lang/ClassLoader;Lpd;Lb9;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 130
    .line 131
    .line 132
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 133
    invoke-static {v13}, Li5;->a(Ljava/io/File;)V

    .line 134
    .line 135
    .line 136
    iget-object p0, p0, Lw8;->d:Ll8;

    .line 137
    .line 138
    invoke-virtual {p0}, Ll8;->c()V

    .line 139
    .line 140
    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    if-nez v14, :cond_4

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_4
    iget-object v2, v14, Lna;->a:Ljava/io/File;

    .line 147
    .line 148
    :goto_4
    invoke-static {v2}, Li5;->a(Ljava/io/File;)V

    .line 149
    .line 150
    .line 151
    invoke-static {}, La9;->b()V

    .line 152
    .line 153
    .line 154
    :cond_5
    return-void

    .line 155
    :goto_5
    invoke-static {v13}, Li5;->a(Ljava/io/File;)V

    .line 156
    .line 157
    .line 158
    iget-object p0, p0, Lw8;->d:Ll8;

    .line 159
    .line 160
    invoke-virtual {p0}, Ll8;->c()V

    .line 161
    .line 162
    .line 163
    if-nez v14, :cond_6

    .line 164
    .line 165
    goto :goto_6

    .line 166
    :cond_6
    iget-object v2, v14, Lna;->a:Ljava/io/File;

    .line 167
    .line 168
    :goto_6
    invoke-static {v2}, Li5;->a(Ljava/io/File;)V

    .line 169
    .line 170
    .line 171
    invoke-static {}, La9;->b()V

    .line 172
    .line 173
    .line 174
    throw v0
.end method
