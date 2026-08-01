.class public final Lm3;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/ClassLoader;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/ClassLoader;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lm3;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lm3;->b:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput-object p3, p0, Lm3;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    const-string v0, "[Elaris:NoticeGate] precise group-todo hook unavailable cost="

    .line 2
    .line 3
    const-string v1, "[Elaris:NoticeGate] precise group-todo hook unavailable cost="

    .line 4
    .line 5
    const-string v2, "[Elaris:NoticeGate] precise group-todo scan hook cost="

    .line 6
    .line 7
    iget v3, p0, Lm3;->a:I

    .line 8
    .line 9
    invoke-static {v3}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_4

    .line 16
    .line 17
    :cond_0
    const-string v3, "notice_block_group_todo"

    .line 18
    .line 19
    invoke-static {v3}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v3, :cond_2

    .line 25
    .line 26
    const-class v3, Lr3;

    .line 27
    .line 28
    monitor-enter v3

    .line 29
    :try_start_0
    iget p0, p0, Lm3;->a:I

    .line 30
    .line 31
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    sput-boolean v4, Lr3;->d:Z

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    :goto_0
    monitor-exit v3

    .line 43
    return-void

    .line 44
    :goto_1
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    throw p0

    .line 46
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v5

    .line 50
    :try_start_1
    iget-object v3, p0, Lm3;->b:Ljava/lang/ClassLoader;

    .line 51
    .line 52
    new-instance v7, Lp3;

    .line 53
    .line 54
    iget-object v8, p0, Lm3;->c:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v7, v8}, Lp3;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v3, v7}, Lr3;->b(Ljava/lang/ClassLoader;Lp3;)I

    .line 60
    .line 61
    .line 62
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    sub-long/2addr v7, v5

    .line 68
    const-class v3, Lr3;

    .line 69
    .line 70
    monitor-enter v3

    .line 71
    :try_start_2
    iget p0, p0, Lm3;->a:I

    .line 72
    .line 73
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-nez p0, :cond_3

    .line 78
    .line 79
    monitor-exit v3

    .line 80
    return-void

    .line 81
    :catchall_1
    move-exception p0

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    sput-boolean v4, Lr3;->d:Z

    .line 84
    .line 85
    if-lez v0, :cond_4

    .line 86
    .line 87
    const/4 p0, 0x1

    .line 88
    sput-boolean p0, Lr3;->c:Z

    .line 89
    .line 90
    new-instance p0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, "ms"

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, Lr3;->o(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string v0, "ms"

    .line 120
    .line 121
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, Lr3;->o(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    :goto_2
    monitor-exit v3

    .line 132
    return-void

    .line 133
    :goto_3
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 134
    throw p0

    .line 135
    :catchall_2
    move-exception v1

    .line 136
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 137
    .line 138
    .line 139
    move-result-wide v2

    .line 140
    sub-long/2addr v2, v5

    .line 141
    const-class v5, Lr3;

    .line 142
    .line 143
    monitor-enter v5

    .line 144
    :try_start_3
    iget p0, p0, Lm3;->a:I

    .line 145
    .line 146
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->isCurrentHotReloadGeneration(I)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_5

    .line 151
    .line 152
    monitor-exit v5

    .line 153
    :goto_4
    return-void

    .line 154
    :catchall_3
    move-exception p0

    .line 155
    goto :goto_5

    .line 156
    :cond_5
    sput-boolean v4, Lr3;->d:Z

    .line 157
    .line 158
    new-instance p0, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v0, "ms"

    .line 167
    .line 168
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0}, Lr3;->o(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 179
    throw v1

    .line 180
    :goto_5
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 181
    throw p0
.end method
