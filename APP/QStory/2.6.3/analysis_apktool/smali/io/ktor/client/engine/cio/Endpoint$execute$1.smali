.class final Lio/ktor/client/engine/cio/Endpoint$execute$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.engine.cio.Endpoint"
    f = "Endpoint.kt"
    l = {
        0x41,
        0x47,
        0x48
    }
    m = "execute"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;


# direct methods
.method public constructor <init>(Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/client/engine/cio/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/engine/cio/Endpoint$execute$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

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
    .locals 5

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->this$0:Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->label:I

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
    iput v1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->label:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Lio/ktor/client/engine/cio/Endpoint$execute$1;

    .line 26
    .line 27
    invoke-direct {v0, p1, p0}, Lio/ktor/client/engine/cio/Endpoint$execute$1;-><init>(Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 28
    .line 29
    .line 30
    move-object p0, v0

    .line 31
    :goto_0
    iget-object v0, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v2, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->label:I

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v2, :cond_7

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    if-eq v2, p1, :cond_6

    .line 42
    .line 43
    const/4 p1, 0x2

    .line 44
    const/4 v4, 0x3

    .line 45
    if-eq v2, p1, :cond_3

    .line 46
    .line 47
    if-ne v2, v4, :cond_2

    .line 48
    .line 49
    iget-object p0, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    if-nez p0, :cond_1

    .line 52
    .line 53
    :try_start_0
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v3

    .line 67
    :cond_3
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    if-nez p1, :cond_5

    .line 70
    .line 71
    iget-object p1, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子楪哲苏兰世;

    .line 74
    .line 75
    :try_start_1
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object v3, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->L$0:Ljava/lang/Object;

    .line 79
    .line 80
    iput-object v3, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->L$1:Ljava/lang/Object;

    .line 81
    .line 82
    iput v4, p0, Lio/ktor/client/engine/cio/Endpoint$execute$1;->label:I

    .line 83
    .line 84
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子世苏哲兰楪(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 90
    if-ne p0, v1, :cond_4

    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    return-object p0

    .line 94
    :catchall_0
    throw v3

    .line 95
    :cond_5
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 96
    .line 97
    .line 98
    return-object v3

    .line 99
    :cond_6
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_7
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, L飘花落叶言楪兰哲世苏子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/TimeZone;

    .line 107
    .line 108
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    iput-wide v0, p1, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰苏哲;->lastActivity:J

    .line 113
    .line 114
    throw v3
.end method
