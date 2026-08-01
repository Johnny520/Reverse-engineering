.class public final Lo4;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lo4;->d:I

    .line 2
    .line 3
    iput-object p2, p0, Lo4;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lo4;->f:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lo4;->d:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Lk3;

    .line 8
    .line 9
    iget-object v0, p0, Lo4;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lww;

    .line 12
    .line 13
    iget-object p0, p0, Lo4;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lwe1;

    .line 16
    .line 17
    iget-boolean v2, p0, Lwe1;->f:Z

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    iget-object p1, p1, Lk3;->a:Lx90;

    .line 22
    .line 23
    invoke-interface {p1}, Lx90;->getLifecycle()Ls90;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object v0, p0, Lwe1;->h:Lww;

    .line 28
    .line 29
    iget-object v2, p0, Lwe1;->g:Ls90;

    .line 30
    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    iput-object p1, p0, Lwe1;->g:Ls90;

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ls90;->a(Lw90;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    check-cast p1, Lz90;

    .line 40
    .line 41
    iget-object p1, p1, Lz90;->c:Lr90;

    .line 42
    .line 43
    sget-object v2, Lr90;->f:Lr90;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ltz p1, :cond_1

    .line 50
    .line 51
    iget-object p1, p0, Lwe1;->e:Lyi;

    .line 52
    .line 53
    new-instance v2, Lve1;

    .line 54
    .line 55
    invoke-direct {v2, p0, v0, v1}, Lve1;-><init>(Lwe1;Lww;I)V

    .line 56
    .line 57
    .line 58
    new-instance p0, Lmh;

    .line 59
    .line 60
    const v0, 0x4f523a4f

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, v0, v1, v2}, Lmh;-><init>(IZLex;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lyi;->B(Lww;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    sget-object p0, Lna1;->a:Lna1;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_0
    check-cast p1, Lwq0;

    .line 73
    .line 74
    iget-object v0, p0, Lo4;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lxq0;

    .line 77
    .line 78
    iget-object p0, p0, Lo4;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Lo11;

    .line 81
    .line 82
    iget-object p0, p0, Lo11;->C:Ls2;

    .line 83
    .line 84
    invoke-static {p1, v0, p0}, Lwq0;->q(Lwq0;Lxq0;Lsw;)V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lna1;->a:Lna1;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1
    check-cast p1, Lwq0;

    .line 91
    .line 92
    iget-object v0, p0, Lo4;->e:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Lxq0;

    .line 95
    .line 96
    iget-object p0, p0, Lo4;->f:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Lla;

    .line 99
    .line 100
    iget-object p0, p0, Lla;->r:Lsw;

    .line 101
    .line 102
    invoke-static {p1, v0, p0}, Lwq0;->q(Lwq0;Lxq0;Lsw;)V

    .line 103
    .line 104
    .line 105
    sget-object p0, Lna1;->a:Lna1;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 109
    .line 110
    iget-object p1, p0, Lo4;->e:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Ls6;

    .line 113
    .line 114
    iget-object p1, p1, Ls6;->e:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, Landroid/view/Choreographer;

    .line 117
    .line 118
    iget-object p0, p0, Lo4;->f:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p0, Lr6;

    .line 121
    .line 122
    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lna1;->a:Lna1;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_3
    check-cast p1, Ljava/lang/Throwable;

    .line 129
    .line 130
    iget-object p1, p0, Lo4;->e:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Lq6;

    .line 133
    .line 134
    iget-object p0, p0, Lo4;->f:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p0, Lr6;

    .line 137
    .line 138
    iget-object v0, p1, Lq6;->h:Ljava/lang/Object;

    .line 139
    .line 140
    monitor-enter v0

    .line 141
    :try_start_0
    iget-object p1, p1, Lq6;->j:Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .line 145
    .line 146
    monitor-exit v0

    .line 147
    sget-object p0, Lna1;->a:Lna1;

    .line 148
    .line 149
    return-object p0

    .line 150
    :catchall_0
    move-exception p0

    .line 151
    monitor-exit v0

    .line 152
    throw p0

    .line 153
    :pswitch_4
    check-cast p1, Loo;

    .line 154
    .line 155
    iget-object p1, p0, Lo4;->e:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Landroid/content/Context;

    .line 158
    .line 159
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iget-object p0, p0, Lo4;->f:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p0, Lq4;

    .line 166
    .line 167
    invoke-virtual {v0, p0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 168
    .line 169
    .line 170
    new-instance v0, Ln4;

    .line 171
    .line 172
    invoke-direct {v0, v1, p1, p0}, Ln4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_5
    check-cast p1, Loo;

    .line 177
    .line 178
    iget-object p1, p0, Lo4;->e:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p1, Landroid/content/Context;

    .line 181
    .line 182
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    iget-object p0, p0, Lo4;->f:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p0, Lp4;

    .line 189
    .line 190
    invoke-virtual {v0, p0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 191
    .line 192
    .line 193
    new-instance v0, Ln4;

    .line 194
    .line 195
    const/4 v1, 0x0

    .line 196
    invoke-direct {v0, v1, p1, p0}, Ln4;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
