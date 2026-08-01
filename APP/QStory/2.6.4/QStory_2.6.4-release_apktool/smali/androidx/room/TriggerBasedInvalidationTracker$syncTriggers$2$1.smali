.class final Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u5170\u54f2;",
        "connection",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1"
    f = "InvalidationTracker.kt"
    l = {
        0x133,
        0x13a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;


# direct methods
.method public constructor <init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u696a\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Landroidx/room/飘花落叶言子世苏楪兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u696a\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Landroidx/room/飘花落叶言子世苏楪兰哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->invoke(Landroidx/room/飘花落叶言子世苏楪兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 6
    .line 7
    iget v3, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->label:I

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x1

    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    if-eq v3, v7, :cond_1

    .line 16
    .line 17
    if-ne v3, v4, :cond_0

    .line 18
    .line 19
    iget-object v2, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->L$1:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 22
    .line 23
    iget-object v0, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v3, v0

    .line 26
    check-cast v3, Landroidx/room/飘花落叶言子楪哲苏世兰;

    .line 27
    .line 28
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move v4, v6

    .line 35
    goto/16 :goto_9

    .line 36
    .line 37
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v5

    .line 43
    :cond_1
    iget-object v3, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Landroidx/room/飘花落叶言子世苏楪兰哲;

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object/from16 v8, p1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, Landroidx/room/飘花落叶言子世苏楪兰哲;

    .line 59
    .line 60
    iput-object v3, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput v7, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->label:I

    .line 63
    .line 64
    invoke-interface {v3, v0}, Landroidx/room/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    if-ne v8, v2, :cond_3

    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_3
    :goto_0
    check-cast v8, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_4

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_4
    iget-object v8, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 82
    .line 83
    iget-object v9, v8, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroidx/room/飘花落叶言子楪哲苏世兰;

    .line 84
    .line 85
    iget-object v10, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/locks/ReentrantLock;

    .line 86
    .line 87
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 88
    .line 89
    .line 90
    :try_start_1
    iput-boolean v7, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:Z

    .line 91
    .line 92
    iget-object v11, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 93
    .line 94
    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    .line 95
    .line 96
    .line 97
    :try_start_2
    iget-boolean v12, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 98
    .line 99
    if-nez v12, :cond_6

    .line 100
    .line 101
    :cond_5
    move-object v13, v5

    .line 102
    goto :goto_5

    .line 103
    :cond_6
    iput-boolean v6, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 104
    .line 105
    iget-object v12, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:[J

    .line 106
    .line 107
    array-length v12, v12

    .line 108
    new-array v13, v12, [Landroidx/room/ObservedTableStates$ObserveOp;

    .line 109
    .line 110
    move v14, v6

    .line 111
    move v15, v14

    .line 112
    :goto_1
    if-ge v14, v12, :cond_a

    .line 113
    .line 114
    iget-object v7, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:[J

    .line 115
    .line 116
    aget-wide v16, v7, v14

    .line 117
    .line 118
    const-wide/16 v18, 0x0

    .line 119
    .line 120
    cmp-long v7, v16, v18

    .line 121
    .line 122
    if-lez v7, :cond_7

    .line 123
    .line 124
    const/4 v7, 0x1

    .line 125
    goto :goto_2

    .line 126
    :cond_7
    move v7, v6

    .line 127
    :goto_2
    iget-object v6, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰:[Z

    .line 128
    .line 129
    aget-boolean v4, v6, v14

    .line 130
    .line 131
    if-eq v7, v4, :cond_9

    .line 132
    .line 133
    aput-boolean v7, v6, v14

    .line 134
    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    sget-object v4, Landroidx/room/ObservedTableStates$ObserveOp;->ADD:Landroidx/room/ObservedTableStates$ObserveOp;

    .line 138
    .line 139
    :goto_3
    const/4 v15, 0x1

    .line 140
    goto :goto_4

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    goto :goto_b

    .line 143
    :cond_8
    sget-object v4, Landroidx/room/ObservedTableStates$ObserveOp;->REMOVE:Landroidx/room/ObservedTableStates$ObserveOp;

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    sget-object v4, Landroidx/room/ObservedTableStates$ObserveOp;->NO_OP:Landroidx/room/ObservedTableStates$ObserveOp;

    .line 147
    .line 148
    :goto_4
    aput-object v4, v13, v14
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    .line 150
    add-int/lit8 v14, v14, 0x1

    .line 151
    .line 152
    const/4 v4, 0x2

    .line 153
    const/4 v6, 0x0

    .line 154
    const/4 v7, 0x1

    .line 155
    goto :goto_1

    .line 156
    :cond_a
    if-eqz v15, :cond_5

    .line 157
    .line 158
    :goto_5
    :try_start_3
    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 159
    .line 160
    .line 161
    if-eqz v13, :cond_d

    .line 162
    .line 163
    :try_start_4
    array-length v4, v13

    .line 164
    if-nez v4, :cond_b

    .line 165
    .line 166
    goto :goto_8

    .line 167
    :cond_b
    sget-object v4, Landroidx/room/Transactor$SQLiteTransactionType;->IMMEDIATE:Landroidx/room/Transactor$SQLiteTransactionType;

    .line 168
    .line 169
    new-instance v6, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1;

    .line 170
    .line 171
    invoke-direct {v6, v13, v8, v3, v5}, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1;-><init>([Landroidx/room/ObservedTableStates$ObserveOp;Landroidx/room/飘花落叶言子世苏兰楪哲;Landroidx/room/飘花落叶言子世苏楪兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 172
    .line 173
    .line 174
    iput-object v9, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->L$0:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v10, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->L$1:Ljava/lang/Object;

    .line 177
    .line 178
    const/4 v5, 0x2

    .line 179
    iput v5, v0, Landroidx/room/TriggerBasedInvalidationTracker$syncTriggers$2$1;->label:I

    .line 180
    .line 181
    invoke-interface {v3, v4, v6, v0}, Landroidx/room/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/room/Transactor$SQLiteTransactionType;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 185
    if-ne v0, v2, :cond_c

    .line 186
    .line 187
    :goto_6
    return-object v2

    .line 188
    :cond_c
    move-object v3, v9

    .line 189
    move-object v2, v10

    .line 190
    :goto_7
    move-object v10, v2

    .line 191
    move-object v9, v3

    .line 192
    :cond_d
    :goto_8
    const/4 v4, 0x0

    .line 193
    goto :goto_a

    .line 194
    :catchall_2
    move-exception v0

    .line 195
    move-object v3, v9

    .line 196
    move-object v2, v10

    .line 197
    const/4 v4, 0x0

    .line 198
    :goto_9
    :try_start_5
    iput-boolean v4, v3, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:Z

    .line 199
    .line 200
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 201
    :catchall_3
    move-exception v0

    .line 202
    move-object v10, v2

    .line 203
    goto :goto_c

    .line 204
    :goto_a
    :try_start_6
    iput-boolean v4, v9, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 205
    .line 206
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 207
    .line 208
    .line 209
    return-object v1

    .line 210
    :catchall_4
    move-exception v0

    .line 211
    goto :goto_c

    .line 212
    :goto_b
    :try_start_7
    invoke-virtual {v11}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 213
    .line 214
    .line 215
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 216
    :goto_c
    invoke-virtual {v10}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 217
    .line 218
    .line 219
    throw v0
.end method
