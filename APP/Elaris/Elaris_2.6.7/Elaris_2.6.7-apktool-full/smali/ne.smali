.class public final Lne;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ln9;

.field public final synthetic c:Lve;

.field public final synthetic d:Landroid/os/Handler;

.field public final synthetic e:I

.field public final synthetic f:Landroid/app/Activity;

.field public final synthetic g:Ljava/lang/ClassLoader;

.field public final synthetic h:Lpd;

.field public final synthetic i:[Z

.field public final synthetic j:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ln9;Lve;Landroid/os/Handler;ILandroid/app/Activity;Ljava/lang/ClassLoader;Lpd;[ZLandroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lne;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lne;->b:Ln9;

    .line 7
    .line 8
    iput-object p3, p0, Lne;->c:Lve;

    .line 9
    .line 10
    iput-object p4, p0, Lne;->d:Landroid/os/Handler;

    .line 11
    .line 12
    iput p5, p0, Lne;->e:I

    .line 13
    .line 14
    iput-object p6, p0, Lne;->f:Landroid/app/Activity;

    .line 15
    .line 16
    iput-object p7, p0, Lne;->g:Ljava/lang/ClassLoader;

    .line 17
    .line 18
    iput-object p8, p0, Lne;->h:Lpd;

    .line 19
    .line 20
    iput-object p9, p0, Lne;->i:[Z

    .line 21
    .line 22
    iput-object p10, p0, Lne;->j:Landroid/app/Dialog;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    const-string v0, "local voice direct file prepare failed: "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lne;->a:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v3, p0, Lne;->b:Ln9;

    .line 7
    .line 8
    iget-object v4, p0, Lne;->c:Lve;

    .line 9
    .line 10
    invoke-static {v2, v3, v4}, Lcom/mr/elaris/w;->c(Landroid/content/Context;Ln9;Lve;)Lna;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v2, p0, Lne;->d:Landroid/os/Handler;

    .line 15
    .line 16
    new-instance v3, Lq;

    .line 17
    .line 18
    const/16 v4, 0xa

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    invoke-direct {v3, p0, v1, v4, v5}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lne;->c:Lve;

    .line 28
    .line 29
    iget-boolean p0, p0, Lve;->a:Z

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    iget-object p0, v1, Lna;->a:Ljava/io/File;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    :try_start_1
    iget-object p0, v1, Lna;->a:Ljava/io/File;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v2

    .line 48
    goto :goto_0

    .line 49
    :catch_0
    move-exception v2

    .line 50
    goto :goto_2

    .line 51
    :goto_0
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, ": "

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lne;->d:Landroid/os/Handler;

    .line 91
    .line 92
    new-instance v2, Lh0;

    .line 93
    .line 94
    const/16 v3, 0x8

    .line 95
    .line 96
    invoke-direct {v2, v3, p0}, Lh0;-><init>(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 100
    .line 101
    .line 102
    if-eqz v1, :cond_0

    .line 103
    .line 104
    iget-object p0, p0, Lne;->c:Lve;

    .line 105
    .line 106
    iget-boolean p0, p0, Lve;->a:Z

    .line 107
    .line 108
    if-eqz p0, :cond_0

    .line 109
    .line 110
    iget-object p0, v1, Lna;->a:Ljava/io/File;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_0

    .line 117
    .line 118
    :goto_1
    :try_start_3
    iget-object p0, v1, Lna;->a:Ljava/io/File;

    .line 119
    .line 120
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :catchall_1
    move-exception v0

    .line 125
    goto :goto_4

    .line 126
    :goto_2
    :try_start_4
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-static {v2}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object v0, p0, Lne;->d:Landroid/os/Handler;

    .line 142
    .line 143
    new-instance v3, Lq;

    .line 144
    .line 145
    const/16 v4, 0xb

    .line 146
    .line 147
    invoke-direct {v3, p0, v2, v4}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 151
    .line 152
    .line 153
    if-eqz v1, :cond_0

    .line 154
    .line 155
    iget-object p0, p0, Lne;->c:Lve;

    .line 156
    .line 157
    iget-boolean p0, p0, Lve;->a:Z

    .line 158
    .line 159
    if-eqz p0, :cond_0

    .line 160
    .line 161
    iget-object p0, v1, Lna;->a:Ljava/io/File;

    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_0

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :catchall_2
    :cond_0
    :goto_3
    return-void

    .line 171
    :goto_4
    if-eqz v1, :cond_1

    .line 172
    .line 173
    iget-object p0, p0, Lne;->c:Lve;

    .line 174
    .line 175
    iget-boolean p0, p0, Lve;->a:Z

    .line 176
    .line 177
    if-eqz p0, :cond_1

    .line 178
    .line 179
    iget-object p0, v1, Lna;->a:Ljava/io/File;

    .line 180
    .line 181
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-eqz p0, :cond_1

    .line 186
    .line 187
    :try_start_5
    iget-object p0, v1, Lna;->a:Ljava/io/File;

    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/io/File;->delete()Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 190
    .line 191
    .line 192
    :catchall_3
    :cond_1
    throw v0
.end method
