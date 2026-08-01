.class final Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
        "",
        "",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1"
    f = "InvalidationTracker.kt"
    l = {
        0xef,
        0xef,
        0xf3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $emitInitialState:Z

.field final synthetic $resolvedTableNames:[Ljava/lang/String;

.field final synthetic $tableIds:[I

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;


# direct methods
.method public constructor <init>(Landroidx/room/飘花落叶言子世苏兰楪哲;[IZ[Ljava/lang/String;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u5170\u696a\u54f2;",
            "[IZ[",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$tableIds:[I

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$emitInitialState:Z

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$resolvedTableNames:[Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 6
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
    new-instance v0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$tableIds:[I

    .line 6
    .line 7
    iget-boolean v3, p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$emitInitialState:Z

    .line 8
    .line 9
    iget-object v4, p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$resolvedTableNames:[Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;[IZ[Ljava/lang/String;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->L$0:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->invoke(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->label:I

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x3

    .line 10
    const/4 v8, 0x2

    .line 11
    const/4 v9, 0x1

    .line 12
    if-eqz v2, :cond_3

    .line 13
    .line 14
    if-eq v2, v9, :cond_2

    .line 15
    .line 16
    if-eq v2, v8, :cond_1

    .line 17
    .line 18
    if-eq v2, v7, :cond_0

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-static {v0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v6

    .line 26
    :cond_0
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    const-wide/16 v17, 0x1

    .line 30
    .line 31
    goto/16 :goto_7

    .line 32
    .line 33
    :catchall_0
    move-exception v0

    .line 34
    const-wide/16 v17, 0x1

    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_1
    iget-object v2, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 41
    .line 42
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-wide/16 v17, 0x1

    .line 46
    .line 47
    goto/16 :goto_5

    .line 48
    .line 49
    :cond_2
    iget-object v2, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 52
    .line 53
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object/from16 v3, p1

    .line 57
    .line 58
    const-wide/16 v17, 0x1

    .line 59
    .line 60
    goto :goto_4

    .line 61
    :cond_3
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;

    .line 67
    .line 68
    iget-object v10, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 69
    .line 70
    iget-object v10, v10, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroidx/room/飘花落叶言子楪哲苏世兰;

    .line 71
    .line 72
    iget-object v11, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$tableIds:[I

    .line 73
    .line 74
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v12, v10, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 81
    .line 82
    invoke-virtual {v12}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 83
    .line 84
    .line 85
    :try_start_1
    array-length v13, v11

    .line 86
    move v14, v5

    .line 87
    move v15, v14

    .line 88
    :goto_0
    if-ge v14, v13, :cond_5

    .line 89
    .line 90
    aget v16, v11, v14

    .line 91
    .line 92
    const-wide/16 v17, 0x1

    .line 93
    .line 94
    iget-object v3, v10, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:[J

    .line 95
    .line 96
    aget-wide v19, v3, v16

    .line 97
    .line 98
    add-long v21, v19, v17

    .line 99
    .line 100
    aput-wide v21, v3, v16

    .line 101
    .line 102
    const-wide/16 v3, 0x0

    .line 103
    .line 104
    cmp-long v3, v19, v3

    .line 105
    .line 106
    if-nez v3, :cond_4

    .line 107
    .line 108
    iput-boolean v9, v10, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 109
    .line 110
    move v15, v9

    .line 111
    goto :goto_1

    .line 112
    :catchall_1
    move-exception v0

    .line 113
    goto/16 :goto_c

    .line 114
    .line 115
    :cond_4
    :goto_1
    add-int/lit8 v14, v14, 0x1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_5
    const-wide/16 v17, 0x1

    .line 119
    .line 120
    if-nez v15, :cond_7

    .line 121
    .line 122
    iget-boolean v3, v10, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 123
    .line 124
    if-nez v3, :cond_7

    .line 125
    .line 126
    iget-boolean v3, v10, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    .line 128
    if-eqz v3, :cond_6

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_6
    move v3, v5

    .line 132
    goto :goto_3

    .line 133
    :cond_7
    :goto_2
    move v3, v9

    .line 134
    :goto_3
    invoke-virtual {v12}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 135
    .line 136
    .line 137
    if-eqz v3, :cond_9

    .line 138
    .line 139
    iget-object v3, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 140
    .line 141
    iget-object v3, v3, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/database/RecallDatabase_Impl;

    .line 142
    .line 143
    iput-object v2, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->L$0:Ljava/lang/Object;

    .line 144
    .line 145
    iput v9, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->label:I

    .line 146
    .line 147
    invoke-static {v3, v5, v1}, Landroidx/room/util/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲(Landroidx/room/飘花落叶言子楪兰哲苏世;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    if-ne v3, v0, :cond_8

    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_8
    :goto_4
    check-cast v3, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 155
    .line 156
    new-instance v4, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$1;

    .line 157
    .line 158
    iget-object v10, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 159
    .line 160
    invoke-direct {v4, v10, v6}, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1$1;-><init>(Landroidx/room/飘花落叶言子世苏兰楪哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 161
    .line 162
    .line 163
    iput-object v2, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->L$0:Ljava/lang/Object;

    .line 164
    .line 165
    iput v8, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->label:I

    .line 166
    .line 167
    invoke-static {v3, v4, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    if-ne v3, v0, :cond_9

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_9
    :goto_5
    move-object v13, v2

    .line 175
    :try_start_2
    new-instance v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 176
    .line 177
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 178
    .line 179
    .line 180
    iget-object v2, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 181
    .line 182
    iget-object v2, v2, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroidx/room/飘花落叶言子楪哲苏兰世;

    .line 183
    .line 184
    new-instance v10, Landroidx/room/飘花落叶言子世苏哲楪兰;

    .line 185
    .line 186
    iget-boolean v12, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$emitInitialState:Z

    .line 187
    .line 188
    iget-object v14, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$resolvedTableNames:[Ljava/lang/String;

    .line 189
    .line 190
    iget-object v15, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$tableIds:[I

    .line 191
    .line 192
    invoke-direct/range {v10 .. v15}, Landroidx/room/飘花落叶言子世苏哲楪兰;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;ZLkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;[Ljava/lang/String;[I)V

    .line 193
    .line 194
    .line 195
    iput-object v6, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->L$0:Ljava/lang/Object;

    .line 196
    .line 197
    iput v7, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->label:I

    .line 198
    .line 199
    invoke-virtual {v2, v10, v1}, Landroidx/room/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(Landroidx/room/飘花落叶言子世苏哲楪兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    if-ne v2, v0, :cond_a

    .line 204
    .line 205
    :goto_6
    return-object v0

    .line 206
    :cond_a
    :goto_7
    new-instance v0, Lkotlin/KotlinNothingValueException;

    .line 207
    .line 208
    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 209
    .line 210
    .line 211
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 212
    :catchall_2
    move-exception v0

    .line 213
    :goto_8
    iget-object v2, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->this$0:Landroidx/room/飘花落叶言子世苏兰楪哲;

    .line 214
    .line 215
    iget-object v2, v2, Landroidx/room/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroidx/room/飘花落叶言子楪哲苏世兰;

    .line 216
    .line 217
    iget-object v1, v1, Landroidx/room/TriggerBasedInvalidationTracker$createFlow$1;->$tableIds:[I

    .line 218
    .line 219
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object v3, v2, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/locks/ReentrantLock;

    .line 226
    .line 227
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 228
    .line 229
    .line 230
    :try_start_3
    array-length v4, v1

    .line 231
    move v6, v5

    .line 232
    :goto_9
    if-ge v5, v4, :cond_c

    .line 233
    .line 234
    aget v7, v1, v5

    .line 235
    .line 236
    iget-object v8, v2, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲:[J

    .line 237
    .line 238
    aget-wide v10, v8, v7

    .line 239
    .line 240
    sub-long v12, v10, v17

    .line 241
    .line 242
    aput-wide v12, v8, v7

    .line 243
    .line 244
    cmp-long v7, v10, v17

    .line 245
    .line 246
    if-nez v7, :cond_b

    .line 247
    .line 248
    iput-boolean v9, v2, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 249
    .line 250
    move v6, v9

    .line 251
    goto :goto_a

    .line 252
    :catchall_3
    move-exception v0

    .line 253
    goto :goto_b

    .line 254
    :cond_b
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 255
    .line 256
    goto :goto_9

    .line 257
    :cond_c
    if-nez v6, :cond_d

    .line 258
    .line 259
    iget-boolean v1, v2, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏:Z

    .line 260
    .line 261
    if-nez v1, :cond_d

    .line 262
    .line 263
    iget-boolean v1, v2, Landroidx/room/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世兰哲苏:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 264
    .line 265
    :cond_d
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 266
    .line 267
    .line 268
    throw v0

    .line 269
    :goto_b
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 270
    .line 271
    .line 272
    throw v0

    .line 273
    :goto_c
    invoke-virtual {v12}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 274
    .line 275
    .line 276
    throw v0
.end method
