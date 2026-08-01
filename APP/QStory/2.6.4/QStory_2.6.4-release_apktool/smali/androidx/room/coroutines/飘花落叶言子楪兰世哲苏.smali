.class public final Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/room/飘花落叶言子世苏楪兰哲;
.implements Landroidx/room/coroutines/飘花落叶言子楪兰苏世哲;


# instance fields
.field public volatile 飘花落叶言子楪世兰苏哲:Z

.field public final 飘花落叶言子楪世哲兰苏:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

.field public final 飘花落叶言子楪世哲苏兰:Z

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/room/coroutines/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(Landroidx/room/coroutines/飘花落叶言子楪世苏兰哲;Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/room/coroutines/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    iput-boolean p3, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Z

    .line 12
    .line 13
    new-instance p1, Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 14
    .line 15
    invoke-direct {p1}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    const-string v1, "ROLLBACK TRANSACTION TO SAVEPOINT \'"

    .line 4
    .line 5
    const-string v2, "RELEASE SAVEPOINT \'"

    .line 6
    .line 7
    instance-of v3, p2, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, p2

    .line 12
    check-cast v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;

    .line 13
    .line 14
    iget v4, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;

    .line 27
    .line 28
    invoke-direct {v3, p0, p2}, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v5, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->label:I

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 39
    .line 40
    const/4 v7, 0x0

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    if-ne v5, v6, :cond_1

    .line 44
    .line 45
    iget-boolean p1, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->Z$0:Z

    .line 46
    .line 47
    iget-object v3, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v7

    .line 61
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iput-object p0, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    iput-boolean p1, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->Z$0:Z

    .line 67
    .line 68
    iput v6, v3, Landroidx/room/coroutines/PooledConnectionImpl$endTransaction$1;->label:I

    .line 69
    .line 70
    iget-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    invoke-interface {p2, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-ne p2, v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    move-object v3, p0

    .line 80
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    if-nez p2, :cond_7

    .line 85
    .line 86
    invoke-static {v0}, Lkotlin/collections/飘花落叶言子楪兰苏哲世;->飘花落叶言子苏哲世兰楪(Ljava/util/List;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    check-cast p2, Landroidx/room/coroutines/飘花落叶言子楪哲兰苏世;

    .line 91
    .line 92
    const/16 v4, 0x27

    .line 93
    .line 94
    if-eqz p1, :cond_5

    .line 95
    .line 96
    iget-boolean p1, p2, Landroidx/room/coroutines/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Z

    .line 97
    .line 98
    if-nez p1, :cond_5

    .line 99
    .line 100
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    const-string p1, "END TRANSACTION"

    .line 107
    .line 108
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :catchall_0
    move-exception p0

    .line 113
    goto :goto_3

    .line 114
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget p2, p2, Landroidx/room/coroutines/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 120
    .line 121
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result p1

    .line 139
    if-eqz p1, :cond_6

    .line 140
    .line 141
    const-string p1, "ROLLBACK TRANSACTION"

    .line 142
    .line 143
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget p2, p2, Landroidx/room/coroutines/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:I

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :goto_2
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    .line 169
    invoke-interface {v3, v7}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :cond_7
    :try_start_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 174
    .line 175
    const-string p1, "Not in a transaction"

    .line 176
    .line 177
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    :goto_3
    invoke-interface {v3, v7}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    throw p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    const-string v1, "SAVEPOINT \'"

    .line 4
    .line 5
    instance-of v2, p2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, p2

    .line 10
    check-cast v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;

    .line 11
    .line 12
    iget v3, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;

    .line 25
    .line 26
    invoke-direct {v2, p0, p2}, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 32
    .line 33
    iget v4, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->label:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    if-ne v4, v5, :cond_1

    .line 42
    .line 43
    iget-object p1, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 46
    .line 47
    iget-object v2, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, Landroidx/room/Transactor$SQLiteTransactionType;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object p2, p1

    .line 55
    move-object p1, v2

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v6

    .line 63
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object p0, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    iput v5, v2, Landroidx/room/coroutines/PooledConnectionImpl$beginTransaction$1;->label:I

    .line 71
    .line 72
    iget-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    invoke-interface {p2, v2}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-ne p2, v3, :cond_3

    .line 79
    .line 80
    return-object v3

    .line 81
    :cond_3
    move-object p2, p0

    .line 82
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏世兰哲;->size()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_7

    .line 91
    .line 92
    sget-object v1, Landroidx/room/coroutines/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世苏哲兰:[I

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    aget p1, v1, p1

    .line 99
    .line 100
    if-eq p1, v5, :cond_6

    .line 101
    .line 102
    const/4 v1, 0x2

    .line 103
    if-eq p1, v1, :cond_5

    .line 104
    .line 105
    const/4 v1, 0x3

    .line 106
    if-ne p1, v1, :cond_4

    .line 107
    .line 108
    const-string p1, "BEGIN EXCLUSIVE TRANSACTION"

    .line 109
    .line 110
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :catchall_0
    move-exception p0

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 117
    .line 118
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p0

    .line 122
    :cond_5
    const-string p1, "BEGIN IMMEDIATE TRANSACTION"

    .line 123
    .line 124
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    const-string p1, "BEGIN DEFERRED TRANSACTION"

    .line 129
    .line 130
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    const/16 v1, 0x27

    .line 143
    .line 144
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p0, p1}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :goto_2
    new-instance p0, Landroidx/room/coroutines/飘花落叶言子楪哲兰苏世;

    .line 155
    .line 156
    invoke-direct {p0, v2}, Landroidx/room/coroutines/飘花落叶言子楪哲兰苏世;-><init>(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, p0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->addLast(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 163
    .line 164
    invoke-interface {p2, v6}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    :goto_3
    invoke-interface {p2, v6}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->L$2:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 40
    .line 41
    iget-object p2, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->L$1:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p2, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 44
    .line 45
    iget-object v0, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object p3, p1

    .line 53
    move-object p1, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v4

    .line 61
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-boolean p3, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 65
    .line 66
    const/16 v2, 0x15

    .line 67
    .line 68
    if-nez p3, :cond_5

    .line 69
    .line 70
    invoke-interface {v0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    iget-object v5, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/room/coroutines/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    invoke-interface {p3, v5}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    check-cast p3, Landroidx/room/coroutines/飘花落叶言子楪世苏哲兰;

    .line 81
    .line 82
    if-eqz p3, :cond_4

    .line 83
    .line 84
    iget-object p3, p3, Landroidx/room/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;

    .line 85
    .line 86
    if-ne p3, p0, :cond_4

    .line 87
    .line 88
    iget-object p3, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 89
    .line 90
    iput-object p1, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object p2, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->L$1:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p3, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->L$2:Ljava/lang/Object;

    .line 95
    .line 96
    iput v3, v0, Landroidx/room/coroutines/PooledConnectionImpl$usePrepared$1;->label:I

    .line 97
    .line 98
    iget-object v2, p3, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 99
    .line 100
    invoke-interface {v2, v0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-ne v0, v1, :cond_3

    .line 105
    .line 106
    return-object v1

    .line 107
    :cond_3
    :goto_1
    :try_start_0
    new-instance v0, Landroidx/room/coroutines/飘花落叶言子楪哲苏兰世;

    .line 108
    .line 109
    iget-object v1, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->飘花落叶言子哲苏世楪兰(Ljava/lang/String;)L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {v0, p0, p1}, Landroidx/room/coroutines/飘花落叶言子楪哲苏兰世;-><init>(Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    .line 117
    .line 118
    :try_start_1
    invoke-interface {p2, v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    :try_start_2
    invoke-static {v0, v4}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 123
    .line 124
    .line 125
    invoke-interface {p3, v4}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    return-object p0

    .line 129
    :catchall_0
    move-exception p0

    .line 130
    goto :goto_2

    .line 131
    :catchall_1
    move-exception p0

    .line 132
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 133
    :catchall_2
    move-exception p1

    .line 134
    :try_start_4
    invoke-static {v0, p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 138
    :goto_2
    invoke-interface {p3, v4}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_4
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 143
    .line 144
    invoke-static {v2, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v4

    .line 148
    :cond_5
    const-string p0, "Connection is recycled"

    .line 149
    .line 150
    invoke-static {v2, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v4
.end method

.method public final 飘花落叶言子楪世哲苏兰()L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Boolean;
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-interface {p1}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/room/coroutines/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    invoke-interface {p1, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Landroidx/room/coroutines/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p1, Landroidx/room/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;

    .line 23
    .line 24
    if-ne p1, p0, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 27
    .line 28
    invoke-virtual {p1}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 35
    .line 36
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    invoke-interface {p0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 p0, 0x0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 48
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_2
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 54
    .line 55
    invoke-static {v2, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v1

    .line 59
    :cond_3
    const-string p0, "Connection is recycled"

    .line 60
    .line 61
    invoke-static {v2, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/room/Transactor$SQLiteTransactionType;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x15

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p3}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v3, p0, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/room/coroutines/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    invoke-interface {v0, v3}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroidx/room/coroutines/飘花落叶言子楪世苏哲兰;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, v0, Landroidx/room/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;

    .line 23
    .line 24
    if-ne v0, p0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世哲兰(Landroidx/room/Transactor$SQLiteTransactionType;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 32
    .line 33
    invoke-static {v2, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_1
    const-string p0, "Connection is recycled"

    .line 38
    .line 39
    invoke-static {v2, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v1
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroidx/room/Transactor$SQLiteTransactionType;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x5

    .line 32
    const/4 v4, 0x4

    .line 33
    const/4 v5, 0x3

    .line 34
    const/4 v6, 0x2

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    const/4 v9, 0x0

    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    if-eq v2, v8, :cond_4

    .line 41
    .line 42
    if-eq v2, v6, :cond_3

    .line 43
    .line 44
    if-eq v2, v5, :cond_2

    .line 45
    .line 46
    if-eq v2, v4, :cond_2

    .line 47
    .line 48
    if-eq v2, v3, :cond_1

    .line 49
    .line 50
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v9

    .line 56
    :cond_1
    iget-object p0, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$1:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Ljava/lang/Throwable;

    .line 59
    .line 60
    iget-object p1, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Ljava/lang/Throwable;

    .line 63
    .line 64
    :try_start_0
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :catch_0
    move-exception p2

    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_2
    iget-object p0, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_3
    iget p1, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->I$0:I

    .line 79
    .line 80
    :try_start_1
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catchall_0
    move-exception p1

    .line 85
    goto :goto_3

    .line 86
    :cond_4
    iget-object p1, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$0:Ljava/lang/Object;

    .line 87
    .line 88
    move-object p2, p1

    .line 89
    check-cast p2, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 90
    .line 91
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    if-nez p1, :cond_6

    .line 99
    .line 100
    sget-object p1, Landroidx/room/Transactor$SQLiteTransactionType;->DEFERRED:Landroidx/room/Transactor$SQLiteTransactionType;

    .line 101
    .line 102
    :cond_6
    iput-object p2, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    iput v8, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->label:I

    .line 105
    .line 106
    invoke-virtual {p0, p1, v0}, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    if-ne p1, v1, :cond_7

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_7
    :goto_1
    :try_start_2
    new-instance p1, Landroidx/room/coroutines/飘花落叶言子楪哲兰世苏;

    .line 114
    .line 115
    invoke-direct {p1, p0}, Landroidx/room/coroutines/飘花落叶言子楪哲兰世苏;-><init>(Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;)V

    .line 116
    .line 117
    .line 118
    iput-object v9, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$0:Ljava/lang/Object;

    .line 119
    .line 120
    iput v8, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->I$0:I

    .line 121
    .line 122
    iput v6, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->label:I

    .line 123
    .line 124
    invoke-interface {p2, p1, v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 128
    if-ne p3, v1, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    move p1, v8

    .line 132
    :goto_2
    if-eqz p1, :cond_9

    .line 133
    .line 134
    move v7, v8

    .line 135
    :cond_9
    iput-object p3, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$0:Ljava/lang/Object;

    .line 136
    .line 137
    iput v5, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->label:I

    .line 138
    .line 139
    invoke-virtual {p0, v7, v0}, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-ne p0, v1, :cond_a

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_a
    return-object p3

    .line 147
    :goto_3
    :try_start_3
    instance-of p2, p1, Landroidx/room/coroutines/ConnectionPool$RollbackException;

    .line 148
    .line 149
    if-eqz p2, :cond_c

    .line 150
    .line 151
    check-cast p1, Landroidx/room/coroutines/ConnectionPool$RollbackException;

    .line 152
    .line 153
    invoke-virtual {p1}, Landroidx/room/coroutines/ConnectionPool$RollbackException;->getResult()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 157
    iput-object p1, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$0:Ljava/lang/Object;

    .line 158
    .line 159
    iput v4, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->label:I

    .line 160
    .line 161
    invoke-virtual {p0, v7, v0}, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    if-ne p0, v1, :cond_b

    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_b
    return-object p1

    .line 169
    :catchall_1
    move-exception p1

    .line 170
    goto :goto_4

    .line 171
    :cond_c
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 172
    :catchall_2
    move-exception p2

    .line 173
    move-object v9, p1

    .line 174
    move-object p1, p2

    .line 175
    :goto_4
    :try_start_5
    iput-object v9, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$0:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object p1, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->L$1:Ljava/lang/Object;

    .line 178
    .line 179
    iput v3, v0, Landroidx/room/coroutines/PooledConnectionImpl$transaction$1;->label:I

    .line 180
    .line 181
    invoke-virtual {p0, v7, v0}, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p0
    :try_end_5
    .catch Landroid/database/SQLException; {:try_start_5 .. :try_end_5} :catch_1

    .line 185
    if-ne p0, v1, :cond_d

    .line 186
    .line 187
    :goto_5
    return-object v1

    .line 188
    :cond_d
    move-object p0, p1

    .line 189
    goto :goto_7

    .line 190
    :catch_1
    move-exception p2

    .line 191
    move-object p0, p1

    .line 192
    move-object p1, v9

    .line 193
    :goto_6
    if-eqz p1, :cond_e

    .line 194
    .line 195
    invoke-static {p1, p2}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 196
    .line 197
    .line 198
    :goto_7
    throw p0

    .line 199
    :cond_e
    throw p2
.end method
