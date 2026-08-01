.class public final Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lio/ktor/server/engine/ShutDownUrl$Companion$ApplicationCallPlugin$1;->INSTANCE:Lio/ktor/server/engine/ShutDownUrl$Companion$ApplicationCallPlugin$1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 7
    .line 8
    const-class v1, Lio/ktor/server/application/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 15
    .line 16
    .line 17
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    const/4 v1, 0x0

    .line 20
    :goto_0
    new-instance v2, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    const-string v1, "shutdown.url"

    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, Lio/ktor/util/飘花落叶言子楪世苏哲兰;-><init>(Ljava/lang/String;L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    .line 1
    const-class v0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    instance-of v1, p2, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;-><init>(Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;->label:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    iget-object p0, v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏兰哲楪()Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object p2, p2, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 68
    .line 69
    check-cast p2, Lio/ktor/server/engine/飘花落叶言子楪世哲苏兰;

    .line 70
    .line 71
    iget-object p2, p2, Lio/ktor/server/engine/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 72
    .line 73
    const-string v3, "Shutdown URL was called: server is going down"

    .line 74
    .line 75
    invoke-interface {p2, v3}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;->warn(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏兰哲楪()Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    iget-object v9, v8, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 83
    .line 84
    iget-object p0, p0, Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v10

    .line 98
    invoke-static {}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲()Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏兰哲楪()Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    new-instance v6, Lio/ktor/server/engine/ShutDownUrl$doShutdown$2;

    .line 107
    .line 108
    const/4 v11, 0x0

    .line 109
    invoke-direct/range {v6 .. v11}, Lio/ktor/server/engine/ShutDownUrl$doShutdown$2;-><init>(Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 110
    .line 111
    .line 112
    const/4 p2, 0x3

    .line 113
    invoke-static {p0, v5, v5, v6, p2}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰苏哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪兰世苏;

    .line 114
    .line 115
    .line 116
    :try_start_1
    sget-object p0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪哲兰苏:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 117
    .line 118
    :try_start_2
    sget-object p2, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 119
    .line 120
    invoke-virtual {p2, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 121
    .line 122
    .line 123
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 124
    :try_start_3
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 128
    goto :goto_1

    .line 129
    :catchall_1
    move-object v0, v5

    .line 130
    :goto_1
    :try_start_4
    new-instance v3, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;

    .line 131
    .line 132
    invoke-direct {v3, p2, v0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

    .line 133
    .line 134
    .line 135
    iput-object v7, v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;->L$0:Ljava/lang/Object;

    .line 136
    .line 137
    iput v4, v1, Lio/ktor/server/engine/ShutDownUrl$doShutdown$1;->label:I

    .line 138
    .line 139
    invoke-interface {p1, p0, v3, v1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲兰楪世(Ljava/lang/Object;L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 143
    if-ne p0, v2, :cond_3

    .line 144
    .line 145
    return-object v2

    .line 146
    :cond_3
    move-object p0, v7

    .line 147
    :goto_2
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;

    .line 148
    .line 149
    invoke-virtual {p0, v5}, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 150
    .line 151
    .line 152
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 153
    .line 154
    return-object p0

    .line 155
    :catchall_2
    move-exception v0

    .line 156
    move-object p1, v0

    .line 157
    :goto_3
    move-object p0, v7

    .line 158
    goto :goto_4

    .line 159
    :catchall_3
    move-exception v0

    .line 160
    move-object p0, v0

    .line 161
    move-object p1, p0

    .line 162
    goto :goto_3

    .line 163
    :goto_4
    check-cast p0, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;

    .line 164
    .line 165
    invoke-virtual {p0, v5}, Lkotlinx/coroutines/飘花落叶言子苏兰楪世哲;->飘花落叶言子楪哲世苏兰(Ljava/util/concurrent/CancellationException;)V

    .line 166
    .line 167
    .line 168
    throw p1
.end method
