.class public final Lwk1;
.super Lt22;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lp70;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lwk1;->ε:I

    iput-object p2, p0, Lwk1;->ζ:Ljava/lang/Object;

    .line 10
    invoke-direct {p0, p1}, Lt22;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lxk1;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwk1;->ε:I

    .line 3
    .line 4
    iput-object p1, p0, Lwk1;->ζ:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lt22;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final α()J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lwk1;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lwk1;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lp70;

    .line 11
    .line 12
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, -0x1

    .line 16
    .line 17
    return-wide v0

    .line 18
    :pswitch_0
    iget-object v0, v0, Lwk1;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lxk1;

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    iget-wide v3, v0, Lxk1;->α:J

    .line 27
    .line 28
    sub-long v3, v1, v3

    .line 29
    .line 30
    const-wide/16 v5, 0x1

    .line 31
    .line 32
    add-long/2addr v3, v5

    .line 33
    iget-object v5, v0, Lxk1;->δ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const-wide v7, 0x7fffffffffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    move-object v11, v6

    .line 50
    move-object v12, v11

    .line 51
    move v10, v9

    .line 52
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v13

    .line 56
    if-eqz v13, :cond_3

    .line 57
    .line 58
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v13

    .line 62
    check-cast v13, Lvk1;

    .line 63
    .line 64
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    monitor-enter v13

    .line 68
    :try_start_0
    invoke-virtual {v0, v13, v1, v2}, Lxk1;->α(Lvk1;J)I

    .line 69
    .line 70
    .line 71
    move-result v14

    .line 72
    if-lez v14, :cond_0

    .line 73
    .line 74
    add-int/lit8 v10, v10, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    iget-wide v14, v13, Lvk1;->ρ:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    cmp-long v16, v14, v3

    .line 80
    .line 81
    if-gez v16, :cond_1

    .line 82
    .line 83
    move-object v11, v13

    .line 84
    move-wide v3, v14

    .line 85
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 86
    .line 87
    cmp-long v16, v14, v7

    .line 88
    .line 89
    if-gez v16, :cond_2

    .line 90
    .line 91
    move-object v12, v13

    .line 92
    move-wide v7, v14

    .line 93
    :cond_2
    :goto_1
    monitor-exit v13

    .line 94
    goto :goto_0

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    monitor-exit v13

    .line 97
    throw v0

    .line 98
    :cond_3
    const-wide/16 v13, -0x1

    .line 99
    .line 100
    if-eqz v11, :cond_4

    .line 101
    .line 102
    move-object v6, v11

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const/4 v3, 0x5

    .line 105
    if-le v9, v3, :cond_5

    .line 106
    .line 107
    move-wide v3, v7

    .line 108
    move-object v6, v12

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move-wide v3, v13

    .line 111
    :goto_2
    if-eqz v6, :cond_9

    .line 112
    .line 113
    monitor-enter v6

    .line 114
    :try_start_1
    iget-object v1, v6, Lvk1;->π:Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 120
    const-wide/16 v13, 0x0

    .line 121
    .line 122
    if-nez v1, :cond_6

    .line 123
    .line 124
    :goto_3
    monitor-exit v6

    .line 125
    goto :goto_6

    .line 126
    :cond_6
    :try_start_2
    iget-wide v1, v6, Lvk1;->ρ:J

    .line 127
    .line 128
    cmp-long v1, v1, v3

    .line 129
    .line 130
    if-eqz v1, :cond_7

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    const/4 v1, 0x1

    .line 134
    iput-boolean v1, v6, Lvk1;->κ:Z

    .line 135
    .line 136
    iget-object v1, v0, Lxk1;->δ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 137
    .line 138
    invoke-virtual {v1, v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 139
    .line 140
    .line 141
    monitor-exit v6

    .line 142
    iget-object v1, v6, Lvk1;->ε:Ljava/net/Socket;

    .line 143
    .line 144
    invoke-static {v1}, Lud2;->γ(Ljava/net/Socket;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, v0, Lxk1;->δ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_b

    .line 154
    .line 155
    iget-object v0, v0, Lxk1;->β:Lw22;

    .line 156
    .line 157
    iget-object v1, v0, Lw22;->α:Lx22;

    .line 158
    .line 159
    monitor-enter v1

    .line 160
    :try_start_3
    invoke-virtual {v0}, Lw22;->α()Z

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-eqz v2, :cond_8

    .line 165
    .line 166
    iget-object v2, v0, Lw22;->α:Lx22;

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Lx22;->γ(Lw22;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    goto :goto_5

    .line 174
    :cond_8
    :goto_4
    monitor-exit v1

    .line 175
    goto :goto_6

    .line 176
    :goto_5
    monitor-exit v1

    .line 177
    throw v0

    .line 178
    :catchall_2
    move-exception v0

    .line 179
    monitor-exit v6

    .line 180
    throw v0

    .line 181
    :cond_9
    if-eqz v12, :cond_a

    .line 182
    .line 183
    iget-wide v3, v0, Lxk1;->α:J

    .line 184
    .line 185
    add-long/2addr v7, v3

    .line 186
    sub-long v13, v7, v1

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_a
    if-lez v10, :cond_b

    .line 190
    .line 191
    iget-wide v13, v0, Lxk1;->α:J

    .line 192
    .line 193
    :cond_b
    :goto_6
    return-wide v13

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
