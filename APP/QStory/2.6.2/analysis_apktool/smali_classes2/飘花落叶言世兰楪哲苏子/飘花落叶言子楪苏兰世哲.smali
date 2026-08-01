.class public final L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public volatile 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;

    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    const-string v0, "Callback failure for "

    .line 2
    .line 3
    const-string v1, "canceled due to "

    .line 4
    .line 5
    iget-object v2, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 6
    .line 7
    iget-object v2, v2, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;

    .line 8
    .line 9
    iget-object v2, v2, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;

    .line 10
    .line 11
    invoke-virtual {v2}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "OkHttp "

    .line 16
    .line 17
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世:L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v4}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v4, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    iget-object v2, v3, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰世苏哲:L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世苏兰;

    .line 35
    .line 36
    invoke-virtual {v2}, L飘花落叶言世兰哲苏楪子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    :try_start_1
    invoke-virtual {v3}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲()L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;

    .line 43
    .line 44
    .line 45
    move-result-object v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 46
    const/4 v8, 0x1

    .line 47
    :try_start_2
    iget-object v9, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;

    .line 48
    .line 49
    invoke-interface {v9, v3, v7}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏兰哲楪(L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;L飘花落叶言世兰楪子苏哲/飘花落叶言子世苏哲楪兰;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 50
    .line 51
    .line 52
    :try_start_3
    iget-object v0, v3, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 53
    .line 54
    iget-object v0, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 55
    .line 56
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v6, v6, p0, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子苏楪世哲兰(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_5

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    goto :goto_7

    .line 65
    :catchall_1
    move-exception v0

    .line 66
    move v7, v8

    .line 67
    goto :goto_1

    .line 68
    :catch_0
    move-exception v1

    .line 69
    move v7, v8

    .line 70
    goto :goto_3

    .line 71
    :catchall_2
    move-exception v0

    .line 72
    :goto_1
    :try_start_4
    invoke-virtual {v3}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->cancel()V

    .line 73
    .line 74
    .line 75
    if-nez v7, :cond_0

    .line 76
    .line 77
    new-instance v7, Ljava/io/IOException;

    .line 78
    .line 79
    new-instance v8, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v7, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v7, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;

    .line 98
    .line 99
    invoke-interface {v1, v3, v7}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏兰世哲楪(L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;Ljava/io/IOException;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_3
    move-exception v0

    .line 104
    goto :goto_6

    .line 105
    :cond_0
    :goto_2
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 106
    .line 107
    if-eqz v1, :cond_1

    .line 108
    .line 109
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 114
    .line 115
    .line 116
    :try_start_5
    iget-object v0, v3, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 117
    .line 118
    iget-object v0, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_1
    :try_start_6
    throw v0

    .line 122
    :catch_1
    move-exception v1

    .line 123
    :goto_3
    if-eqz v7, :cond_2

    .line 124
    .line 125
    sget-object v7, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;

    .line 126
    .line 127
    sget-object v7, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;

    .line 128
    .line 129
    invoke-static {v3}, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v8

    .line 133
    invoke-virtual {v0, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    const/4 v8, 0x4

    .line 138
    invoke-virtual {v7, v0, v8, v1}, L飘花落叶言世兰苏哲楪子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_2
    iget-object v0, p0, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;

    .line 143
    .line 144
    invoke-interface {v0, v3, v1}, L飘花落叶言世兰楪子苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子苏兰世哲楪(L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;Ljava/io/IOException;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 145
    .line 146
    .line 147
    :goto_4
    :try_start_7
    iget-object v0, v3, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 148
    .line 149
    iget-object v0, v0, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :goto_5
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :goto_6
    :try_start_8
    iget-object v1, v3, L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;

    .line 157
    .line 158
    iget-object v1, v1, L飘花落叶言世兰楪子苏哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;

    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v6, v6, p0, v2}, Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;->飘花落叶言子苏楪世哲兰(Landroidx/compose/animation/core/飘花落叶言子哲楪苏世兰;L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;L飘花落叶言世兰楪哲苏子/飘花落叶言子楪哲世兰苏;L飘花落叶言世兰楪哲苏子/飘花落叶言子楪苏兰世哲;I)V

    .line 164
    .line 165
    .line 166
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 167
    :goto_7
    invoke-virtual {v4, v5}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw p0
.end method
