.class public final L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏兰世;
.super L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世兰苏哲:I


# direct methods
.method public constructor <init>(Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲:I

    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 10
    invoke-direct {p0, p1}, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲:I

    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0, p2}, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()J
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲:I

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-interface {v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-wide v2

    .line 18
    :pswitch_0
    iget-object v0, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    iget-wide v6, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 27
    .line 28
    sub-long v6, v4, v6

    .line 29
    .line 30
    const-wide/16 v8, 0x1

    .line 31
    .line 32
    add-long/2addr v6, v8

    .line 33
    iget-object v1, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    const-wide v9, 0x7fffffffffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const/4 v11, 0x0

    .line 49
    move-object v13, v8

    .line 50
    move-object v14, v13

    .line 51
    move v12, v11

    .line 52
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    if-eqz v15, :cond_3

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v15

    .line 62
    check-cast v15, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;

    .line 63
    .line 64
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    monitor-enter v15

    .line 68
    :try_start_0
    invoke-virtual {v0, v15, v4, v5}, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;J)I

    .line 69
    .line 70
    .line 71
    move-result v16

    .line 72
    if-lez v16, :cond_0

    .line 73
    .line 74
    add-int/lit8 v12, v12, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    iget-wide v2, v15, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    cmp-long v17, v2, v6

    .line 80
    .line 81
    if-gez v17, :cond_1

    .line 82
    .line 83
    move-wide v6, v2

    .line 84
    move-object v13, v15

    .line 85
    :cond_1
    add-int/lit8 v11, v11, 0x1

    .line 86
    .line 87
    cmp-long v17, v2, v9

    .line 88
    .line 89
    if-gez v17, :cond_2

    .line 90
    .line 91
    move-wide v9, v2

    .line 92
    move-object v14, v15

    .line 93
    :cond_2
    :goto_1
    monitor-exit v15

    .line 94
    const-wide/16 v2, -0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    monitor-exit v15

    .line 99
    throw v0

    .line 100
    :cond_3
    if-eqz v13, :cond_4

    .line 101
    .line 102
    move-object v8, v13

    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const/4 v1, 0x5

    .line 105
    if-le v11, v1, :cond_5

    .line 106
    .line 107
    move-wide v6, v9

    .line 108
    move-object v8, v14

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    const-wide/16 v6, -0x1

    .line 111
    .line 112
    :goto_2
    if-eqz v8, :cond_9

    .line 113
    .line 114
    monitor-enter v8

    .line 115
    :try_start_1
    iget-object v1, v8, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 118
    .line 119
    .line 120
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 121
    const-wide/16 v2, 0x0

    .line 122
    .line 123
    if-nez v1, :cond_6

    .line 124
    .line 125
    :goto_3
    monitor-exit v8

    .line 126
    goto :goto_6

    .line 127
    :cond_6
    :try_start_2
    iget-wide v4, v8, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:J

    .line 128
    .line 129
    cmp-long v1, v4, v6

    .line 130
    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_7
    const/4 v1, 0x1

    .line 135
    iput-boolean v1, v8, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲兰世:Z

    .line 136
    .line 137
    iget-object v1, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 138
    .line 139
    invoke-virtual {v1, v8}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 140
    .line 141
    .line 142
    monitor-exit v8

    .line 143
    iget-object v1, v8, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:Ljava/net/Socket;

    .line 144
    .line 145
    invoke-static {v1}, L飘花落叶言世兰楪子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Ljava/net/Socket;)V

    .line 146
    .line 147
    .line 148
    iget-object v1, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_c

    .line 155
    .line 156
    iget-object v0, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏兰哲;

    .line 157
    .line 158
    iget-object v1, v0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世哲苏兰;

    .line 159
    .line 160
    monitor-enter v1

    .line 161
    :try_start_3
    invoke-virtual {v0}, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_8

    .line 166
    .line 167
    iget-object v4, v0, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世哲苏兰;

    .line 168
    .line 169
    invoke-virtual {v4, v0}, L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(L飘花落叶言世兰楪苏哲子/飘花落叶言子楪世苏兰哲;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :catchall_1
    move-exception v0

    .line 174
    goto :goto_5

    .line 175
    :cond_8
    :goto_4
    monitor-exit v1

    .line 176
    goto :goto_6

    .line 177
    :goto_5
    monitor-exit v1

    .line 178
    throw v0

    .line 179
    :catchall_2
    move-exception v0

    .line 180
    monitor-exit v8

    .line 181
    throw v0

    .line 182
    :cond_9
    if-eqz v14, :cond_a

    .line 183
    .line 184
    iget-wide v0, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 185
    .line 186
    add-long/2addr v9, v0

    .line 187
    sub-long v2, v9, v4

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_a
    if-lez v12, :cond_b

    .line 191
    .line 192
    iget-wide v2, v0, L飘花落叶言世兰楪哲子苏/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_b
    const-wide/16 v2, -0x1

    .line 196
    .line 197
    :cond_c
    :goto_6
    return-wide v2

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
