.class public final Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/room/飘花落叶言子世苏楪兰哲;
.implements Landroidx/room/coroutines/飘花落叶言子楪兰苏世哲;


# instance fields
.field public 飘花落叶言子楪世哲兰苏:Landroidx/room/Transactor$SQLiteTransactionType;

.field public final 飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲(Landroidx/room/Transactor$SQLiteTransactionType;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Landroidx/room/coroutines/PassthroughConnection$transaction$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;->label:I

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
    iput v1, v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/room/coroutines/PassthroughConnection$transaction$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;->label:I

    .line 30
    .line 31
    const-string v3, "ROLLBACK TRANSACTION"

    .line 32
    .line 33
    iget-object v4, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    iget-object v6, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-ne v2, v5, :cond_1

    .line 42
    .line 43
    iget v5, v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;->I$0:I

    .line 44
    .line 45
    :try_start_0
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v7

    .line 57
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object p3, Landroidx/room/coroutines/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:[I

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    aget p3, p3, v2

    .line 67
    .line 68
    if-eq p3, v5, :cond_5

    .line 69
    .line 70
    const/4 v2, 0x2

    .line 71
    if-eq p3, v2, :cond_4

    .line 72
    .line 73
    const/4 v2, 0x3

    .line 74
    if-ne p3, v2, :cond_3

    .line 75
    .line 76
    const-string p3, "BEGIN EXCLUSIVE TRANSACTION"

    .line 77
    .line 78
    invoke-static {v6, p3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    invoke-static {}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲苏兰世()V

    .line 83
    .line 84
    .line 85
    return-object v7

    .line 86
    :cond_4
    const-string p3, "BEGIN IMMEDIATE TRANSACTION"

    .line 87
    .line 88
    invoke-static {v6, p3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_5
    const-string p3, "BEGIN DEFERRED TRANSACTION"

    .line 93
    .line 94
    invoke-static {v6, p3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-lez p3, :cond_6

    .line 102
    .line 103
    iput-object p1, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Landroidx/room/Transactor$SQLiteTransactionType;

    .line 104
    .line 105
    :cond_6
    :try_start_1
    new-instance p1, Landroidx/room/coroutines/飘花落叶言子楪苏哲兰世;

    .line 106
    .line 107
    invoke-direct {p1, p0}, Landroidx/room/coroutines/飘花落叶言子楪苏哲兰世;-><init>(Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;)V

    .line 108
    .line 109
    .line 110
    iput v5, v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;->I$0:I

    .line 111
    .line 112
    iput v5, v0, Landroidx/room/coroutines/PassthroughConnection$transaction$1;->label:I

    .line 113
    .line 114
    invoke-interface {p2, p1, v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    if-ne p3, v1, :cond_7

    .line 119
    .line 120
    return-object v1

    .line 121
    :cond_7
    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_8

    .line 126
    .line 127
    iput-object v7, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Landroidx/room/Transactor$SQLiteTransactionType;

    .line 128
    .line 129
    :cond_8
    if-eqz v5, :cond_9

    .line 130
    .line 131
    const-string p0, "END TRANSACTION"

    .line 132
    .line 133
    invoke-static {v6, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object p3

    .line 137
    :cond_9
    invoke-static {v6, v3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-object p3

    .line 141
    :goto_3
    :try_start_2
    instance-of p2, p1, Landroidx/room/coroutines/ConnectionPool$RollbackException;

    .line 142
    .line 143
    if-eqz p2, :cond_b

    .line 144
    .line 145
    check-cast p1, Landroidx/room/coroutines/ConnectionPool$RollbackException;

    .line 146
    .line 147
    invoke-virtual {p1}, Landroidx/room/coroutines/ConnectionPool$RollbackException;->getResult()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 151
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-nez p2, :cond_a

    .line 156
    .line 157
    iput-object v7, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Landroidx/room/Transactor$SQLiteTransactionType;

    .line 158
    .line 159
    :cond_a
    invoke-static {v6, v3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object p1

    .line 163
    :catchall_1
    move-exception p1

    .line 164
    move-object p2, v7

    .line 165
    goto :goto_4

    .line 166
    :cond_b
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 167
    :catchall_2
    move-exception p2

    .line 168
    move-object v8, p2

    .line 169
    move-object p2, p1

    .line 170
    move-object p1, v8

    .line 171
    :goto_4
    :try_start_4
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 172
    .line 173
    .line 174
    move-result p3

    .line 175
    if-nez p3, :cond_c

    .line 176
    .line 177
    iput-object v7, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Landroidx/room/Transactor$SQLiteTransactionType;

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :catch_0
    move-exception p0

    .line 181
    goto :goto_6

    .line 182
    :cond_c
    :goto_5
    invoke-static {v6, v3}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世(L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/database/SQLException; {:try_start_4 .. :try_end_4} :catch_0

    .line 183
    .line 184
    .line 185
    goto :goto_7

    .line 186
    :goto_6
    if-eqz p2, :cond_d

    .line 187
    .line 188
    invoke-static {p2, p0}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    :goto_7
    throw p1

    .line 192
    :cond_d
    throw p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->label:I

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
    iput v1, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v5

    .line 50
    :cond_2
    iget-object p1, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    move-object p2, p1

    .line 53
    check-cast p2, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 54
    .line 55
    iget-object p1, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object p2, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    iput v4, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->label:I

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    if-ne p3, v1, :cond_4

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-eqz p3, :cond_6

    .line 86
    .line 87
    new-instance p3, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;

    .line 88
    .line 89
    invoke-direct {p3, p0, p1, p2, v5}, Landroidx/room/coroutines/PassthroughConnection$usePrepared$2;-><init>(Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;Ljava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 90
    .line 91
    .line 92
    iput-object v5, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v5, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->L$1:Ljava/lang/Object;

    .line 95
    .line 96
    iput v3, v0, Landroidx/room/coroutines/PassthroughConnection$usePrepared$1;->label:I

    .line 97
    .line 98
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 99
    .line 100
    invoke-interface {p0, p3, v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-ne p0, v1, :cond_5

    .line 105
    .line 106
    :goto_2
    return-object v1

    .line 107
    :cond_5
    return-object p0

    .line 108
    :cond_6
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 109
    .line 110
    invoke-interface {p0, p1}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子哲苏世楪兰(Ljava/lang/String;)L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世哲苏兰;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    :try_start_0
    invoke-interface {p2, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    invoke-static {p0, v5}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    return-object p1

    .line 122
    :catchall_0
    move-exception p1

    .line 123
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    :catchall_1
    move-exception p2

    .line 125
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 126
    .line 127
    .line 128
    throw p2
.end method

.method public final 飘花落叶言子楪世哲苏兰()L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Landroidx/room/Transactor$SQLiteTransactionType;

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-interface {p0}, L飘花落叶言子兰世苏哲楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲兰世()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/room/Transactor$SQLiteTransactionType;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Landroidx/room/coroutines/PassthroughConnection$withTransaction$2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/room/coroutines/PassthroughConnection$withTransaction$2;-><init>(Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;Landroidx/room/Transactor$SQLiteTransactionType;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Landroidx/room/coroutines/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 8
    .line 9
    invoke-interface {p0, v0, p3}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 14
    .line 15
    return-object p0
.end method
