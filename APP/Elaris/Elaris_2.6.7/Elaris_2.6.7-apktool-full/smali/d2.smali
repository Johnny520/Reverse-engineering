.class public final Ld2;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/Runnable;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Ld2;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Ld2;->b:I

    .line 8
    .line 9
    iput-object p2, p0, Ld2;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ld2;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Ld2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Le2;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ld2;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2;->d:Ljava/lang/Object;

    iput-object p2, p0, Ld2;->e:Ljava/lang/Object;

    iput-object p3, p0, Ld2;->c:Ljava/lang/Object;

    iput p4, p0, Ld2;->b:I

    return-void
.end method

.method public constructor <init>(Ll1;ILe2;Landroid/widget/ImageView;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ld2;->a:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld2;->d:Ljava/lang/Object;

    iput p2, p0, Ld2;->b:I

    iput-object p3, p0, Ld2;->c:Ljava/lang/Object;

    iput-object p4, p0, Ld2;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Ld2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Ld2;->e:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, Ld2;->b:I

    .line 6
    .line 7
    iget-object v3, p0, Ld2;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Ld2;->d:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    check-cast v4, Ljava/lang/String;

    .line 17
    .line 18
    :try_start_0
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 19
    .line 20
    .line 21
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/util/concurrent/Future;

    .line 29
    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    :goto_0
    sget-object v0, Lo7;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-virtual {v0, v4, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    check-cast v1, Ljava/lang/Runnable;

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 45
    .line 46
    .line 47
    const-string p0, "debug_log"

    .line 48
    .line 49
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    new-instance p0, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, " completed in "

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    sub-long/2addr v0, v5

    .line 73
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, "ms"

    .line 77
    .line 78
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    goto :goto_2

    .line 91
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Ljava/util/concurrent/Future;

    .line 96
    .line 97
    if-eqz p0, :cond_2

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :goto_2
    :try_start_2
    const-string v0, "hook-task"

    .line 101
    .line 102
    invoke-static {v0, v4, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, Ljava/util/concurrent/Future;

    .line 110
    .line 111
    if-eqz p0, :cond_2

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    :goto_3
    return-void

    .line 115
    :catchall_1
    move-exception p0

    .line 116
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Ljava/util/concurrent/Future;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    sget-object v1, Lo7;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 125
    .line 126
    invoke-virtual {v1, v4, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_3
    throw p0

    .line 130
    :pswitch_0
    check-cast v4, Ll1;

    .line 131
    .line 132
    :try_start_3
    invoke-static {v4}, Li5;->Y(Ll1;)[B

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v2, v0}, Lg2;->a(I[B)Landroid/graphics/Bitmap;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-eqz v0, :cond_4

    .line 141
    .line 142
    sget-object v1, Lg2;->e:Ljava/util/Map;

    .line 143
    .line 144
    iget-object v2, v4, Ll1;->a:Ljava/lang/String;

    .line 145
    .line 146
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    :cond_4
    if-eqz v0, :cond_5

    .line 150
    .line 151
    sget-object v1, Lg2;->d:Landroid/os/Handler;

    .line 152
    .line 153
    new-instance v2, Lq;

    .line 154
    .line 155
    const/4 v3, 0x3

    .line 156
    const/4 v4, 0x0

    .line 157
    invoke-direct {v2, p0, v0, v3, v4}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 161
    .line 162
    .line 163
    :catchall_2
    :cond_5
    return-void

    .line 164
    :pswitch_1
    :try_start_4
    check-cast v4, Ljava/lang/String;

    .line 165
    .line 166
    check-cast v1, Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v4, v1}, Li5;->R0(Ljava/lang/String;Ljava/lang/String;)Ly;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iget-object v1, v0, Ly;->a:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v1, Ljava/util/ArrayList;

    .line 175
    .line 176
    sget-object v2, Lg2;->d:Landroid/os/Handler;

    .line 177
    .line 178
    new-instance v4, Lc2;

    .line 179
    .line 180
    invoke-direct {v4, p0, v0, v1}, Lc2;-><init>(Ld2;Ly;Ljava/util/ArrayList;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :catchall_3
    move-exception p0

    .line 188
    check-cast v3, Le2;

    .line 189
    .line 190
    invoke-static {p0}, Lg2;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-static {v3, p0}, Lg2;->m(Le2;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    :goto_4
    return-void

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
