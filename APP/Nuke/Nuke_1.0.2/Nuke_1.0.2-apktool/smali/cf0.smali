.class public final Lcf0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:I

.field public final i:Lyq2;

.field public final synthetic j:Lff0;


# direct methods
.method public synthetic constructor <init>(Lff0;Lyq2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcf0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lcf0;->j:Lff0;

    .line 4
    .line 5
    iput-object p2, p0, Lcf0;->i:Lyq2;

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
    .locals 6

    .line 1
    iget v0, p0, Lcf0;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcf0;->i:Lyq2;

    .line 7
    .line 8
    iget-object v1, v0, Lyq2;->b:Lsu2;

    .line 9
    .line 10
    invoke-virtual {v1}, Lsu2;->a()V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lyq2;->c:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    :try_start_0
    iget-object v1, p0, Lcf0;->j:Lff0;

    .line 17
    .line 18
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 19
    :try_start_1
    iget-object v2, p0, Lcf0;->j:Lff0;

    .line 20
    .line 21
    iget-object v2, v2, Lff0;->h:Lef0;

    .line 22
    .line 23
    iget-object v3, p0, Lcf0;->i:Lyq2;

    .line 24
    .line 25
    iget-object v2, v2, Lef0;->h:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v4, Ldf0;

    .line 28
    .line 29
    sget-object v5, Lup0;->d:Ldh0;

    .line 30
    .line 31
    invoke-direct {v4, v3, v5}, Ldf0;-><init>(Lyq2;Ljava/util/concurrent/Executor;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget-object v2, p0, Lcf0;->j:Lff0;

    .line 41
    .line 42
    iget-object v2, v2, Lff0;->z:Lhf0;

    .line 43
    .line 44
    invoke-virtual {v2}, Lhf0;->a()V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lcf0;->j:Lff0;

    .line 48
    .line 49
    iget-object v3, p0, Lcf0;->i:Lyq2;

    .line 50
    .line 51
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    .line 53
    .line 54
    :try_start_2
    iget-object v4, v2, Lff0;->z:Lhf0;

    .line 55
    .line 56
    iget v2, v2, Lff0;->v:I

    .line 57
    .line 58
    invoke-virtual {v3, v4, v2}, Lyq2;->g(Ld92;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 59
    .line 60
    .line 61
    :try_start_3
    iget-object v2, p0, Lcf0;->j:Lff0;

    .line 62
    .line 63
    iget-object v3, p0, Lcf0;->i:Lyq2;

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Lff0;->g(Lyq2;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto :goto_1

    .line 71
    :catchall_1
    move-exception p0

    .line 72
    new-instance v2, Lep;

    .line 73
    .line 74
    invoke-direct {v2, p0}, Lep;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v2

    .line 78
    :cond_0
    :goto_0
    iget-object p0, p0, Lcf0;->j:Lff0;

    .line 79
    .line 80
    invoke-virtual {p0}, Lff0;->b()V

    .line 81
    .line 82
    .line 83
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 84
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 85
    return-void

    .line 86
    :catchall_2
    move-exception p0

    .line 87
    goto :goto_2

    .line 88
    :goto_1
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 89
    :try_start_6
    throw p0

    .line 90
    :goto_2
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 91
    throw p0

    .line 92
    :pswitch_0
    iget-object v0, p0, Lcf0;->i:Lyq2;

    .line 93
    .line 94
    iget-object v1, v0, Lyq2;->b:Lsu2;

    .line 95
    .line 96
    invoke-virtual {v1}, Lsu2;->a()V

    .line 97
    .line 98
    .line 99
    iget-object v0, v0, Lyq2;->c:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v0

    .line 102
    :try_start_7
    iget-object v1, p0, Lcf0;->j:Lff0;

    .line 103
    .line 104
    monitor-enter v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 105
    :try_start_8
    iget-object v2, p0, Lcf0;->j:Lff0;

    .line 106
    .line 107
    iget-object v2, v2, Lff0;->h:Lef0;

    .line 108
    .line 109
    iget-object v3, p0, Lcf0;->i:Lyq2;

    .line 110
    .line 111
    iget-object v2, v2, Lef0;->h:Ljava/util/ArrayList;

    .line 112
    .line 113
    new-instance v4, Ldf0;

    .line 114
    .line 115
    sget-object v5, Lup0;->d:Ldh0;

    .line 116
    .line 117
    invoke-direct {v4, v3, v5}, Ldf0;-><init>(Lyq2;Ljava/util/concurrent/Executor;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_1

    .line 125
    .line 126
    iget-object v2, p0, Lcf0;->j:Lff0;

    .line 127
    .line 128
    iget-object v3, p0, Lcf0;->i:Lyq2;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 131
    .line 132
    .line 133
    :try_start_9
    iget-object v2, v2, Lff0;->x:Lxp0;

    .line 134
    .line 135
    const/4 v4, 0x5

    .line 136
    invoke-virtual {v3, v2, v4}, Lyq2;->f(Lxp0;I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :catchall_3
    move-exception p0

    .line 141
    :try_start_a
    new-instance v2, Lep;

    .line 142
    .line 143
    invoke-direct {v2, p0}, Lep;-><init>(Ljava/lang/Throwable;)V

    .line 144
    .line 145
    .line 146
    throw v2

    .line 147
    :catchall_4
    move-exception p0

    .line 148
    goto :goto_4

    .line 149
    :cond_1
    :goto_3
    iget-object p0, p0, Lcf0;->j:Lff0;

    .line 150
    .line 151
    invoke-virtual {p0}, Lff0;->b()V

    .line 152
    .line 153
    .line 154
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 155
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 156
    return-void

    .line 157
    :catchall_5
    move-exception p0

    .line 158
    goto :goto_5

    .line 159
    :goto_4
    :try_start_c
    monitor-exit v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 160
    :try_start_d
    throw p0

    .line 161
    :goto_5
    monitor-exit v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 162
    throw p0

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
