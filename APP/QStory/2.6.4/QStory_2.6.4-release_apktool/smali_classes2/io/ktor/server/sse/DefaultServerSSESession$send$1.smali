.class final Lio/ktor/server/sse/DefaultServerSSESession$send$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.server.sse.DefaultServerSSESession"
    f = "DefaultServerSSESession.kt"
    l = {
        0x2c,
        0x16
    }
    m = "send"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/sse/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/sse/DefaultServerSSESession$send$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->this$0:Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;

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
    .locals 7

    .line 1
    iput-object p1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->this$0:Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->label:I

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
    iput v1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->label:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, Lio/ktor/server/sse/DefaultServerSSESession$send$1;-><init>(Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    iget-object v0, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v2, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->label:I

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x2

    .line 39
    const/4 v5, 0x1

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eq v2, v5, :cond_2

    .line 43
    .line 44
    if-ne v2, v4, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 49
    .line 50
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_3

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_4

    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v3

    .line 62
    :cond_2
    iget-object p1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$2:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 65
    .line 66
    iget-object v2, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$1:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, L飘花落叶言楪兰哲苏世子/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    iget-object v5, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$0:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v5, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p1, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;

    .line 82
    .line 83
    iput-object p1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$0:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v3, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$1:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object v0, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$2:Ljava/lang/Object;

    .line 88
    .line 89
    iput v5, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->label:I

    .line 90
    .line 91
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-ne v2, v1, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    move-object v5, p1

    .line 99
    move-object p1, v0

    .line 100
    move-object v2, v3

    .line 101
    :goto_1
    :try_start_1
    iget-object v0, v5, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 102
    .line 103
    iput-object p1, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$0:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v3, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$1:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v3, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->L$2:Ljava/lang/Object;

    .line 108
    .line 109
    iput v4, p0, Lio/ktor/server/sse/DefaultServerSSESession$send$1;->label:I

    .line 110
    .line 111
    invoke-virtual {v5, v0, v2, p0}, Lio/ktor/server/sse/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;L飘花落叶言楪兰哲苏世子/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 115
    if-ne p0, v1, :cond_5

    .line 116
    .line 117
    :goto_2
    return-object v1

    .line 118
    :cond_5
    move-object p0, p1

    .line 119
    :goto_3
    invoke-interface {p0, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 123
    .line 124
    return-object p0

    .line 125
    :catchall_1
    move-exception p0

    .line 126
    move-object v6, p1

    .line 127
    move-object p1, p0

    .line 128
    move-object p0, v6

    .line 129
    :goto_4
    invoke-interface {p0, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    throw p1
.end method
