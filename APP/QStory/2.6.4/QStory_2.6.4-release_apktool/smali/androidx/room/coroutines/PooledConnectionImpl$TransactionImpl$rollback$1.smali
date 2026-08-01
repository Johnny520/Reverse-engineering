.class final Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.room.coroutines.PooledConnectionImpl$TransactionImpl"
    f = "ConnectionPoolImpl.kt"
    l = {
        0x280
    }
    m = "rollback"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/room/coroutines/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/coroutines/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->this$0:Landroidx/room/coroutines/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iput-object p1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->this$0:Landroidx/room/coroutines/飘花落叶言子楪哲兰世苏;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->label:I

    .line 16
    .line 17
    and-int v2, v1, v0

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v0

    .line 22
    iput v1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->label:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;-><init>(Landroidx/room/coroutines/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    iget-object v0, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v2, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->label:I

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x1

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-eq v2, v4, :cond_1

    .line 42
    .line 43
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_1
    iget-object p1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 52
    .line 53
    iget-object v1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;

    .line 56
    .line 57
    iget-object p0, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p1, Landroidx/room/coroutines/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;

    .line 67
    .line 68
    iget-boolean v0, p1, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Z

    .line 69
    .line 70
    const/16 v2, 0x15

    .line 71
    .line 72
    if-nez v0, :cond_6

    .line 73
    .line 74
    invoke-interface {p0}, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;->getContext()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v5, p1, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Landroidx/room/coroutines/飘花落叶言子楪世苏兰哲;

    .line 79
    .line 80
    invoke-interface {v0, v5}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Landroidx/room/coroutines/飘花落叶言子楪世苏哲兰;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    iget-object v0, v0, Landroidx/room/coroutines/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;

    .line 89
    .line 90
    if-ne v0, p1, :cond_5

    .line 91
    .line 92
    iget-object v0, p1, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 93
    .line 94
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->isEmpty()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_4

    .line 99
    .line 100
    iget-object v0, p1, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;

    .line 101
    .line 102
    iput-object v3, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->L$0:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object p1, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->L$1:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v0, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->L$2:Ljava/lang/Object;

    .line 107
    .line 108
    iput v4, p0, Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl$rollback$1;->label:I

    .line 109
    .line 110
    iget-object v2, v0, Landroidx/room/coroutines/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 111
    .line 112
    invoke-interface {v2, p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v1, :cond_3

    .line 117
    .line 118
    return-object v1

    .line 119
    :cond_3
    move-object v1, p1

    .line 120
    move-object p1, v0

    .line 121
    move-object p0, v3

    .line 122
    :goto_1
    :try_start_0
    iget-object v0, v1, Landroidx/room/coroutines/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Lkotlin/collections/飘花落叶言子楪苏兰哲世;

    .line 123
    .line 124
    invoke-virtual {v0}, Lkotlin/collections/飘花落叶言子楪苏兰哲世;->last()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Landroidx/room/coroutines/飘花落叶言子楪哲兰苏世;

    .line 129
    .line 130
    iput-boolean v4, v0, Landroidx/room/coroutines/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    .line 132
    invoke-interface {p1, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    new-instance p1, Landroidx/room/coroutines/ConnectionPool$RollbackException;

    .line 136
    .line 137
    invoke-direct {p1, p0}, Landroidx/room/coroutines/ConnectionPool$RollbackException;-><init>(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    throw p1

    .line 141
    :catchall_0
    move-exception p0

    .line 142
    invoke-interface {p1, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    throw p0

    .line 146
    :cond_4
    const-string p0, "Not in a transaction"

    .line 147
    .line 148
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    return-object v3

    .line 152
    :cond_5
    const-string p0, "Attempted to use connection on a different coroutine"

    .line 153
    .line 154
    invoke-static {v2, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw v3

    .line 158
    :cond_6
    const-string p0, "Connection is recycled"

    .line 159
    .line 160
    invoke-static {v2, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v3
.end method
