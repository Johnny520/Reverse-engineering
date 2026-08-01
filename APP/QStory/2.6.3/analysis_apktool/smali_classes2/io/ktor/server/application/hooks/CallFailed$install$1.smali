.class final Lio/ktor/server/application/hooks/CallFailed$install$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u4e16\u5170;",
        "it",
        "<anonymous>",
        "(Lio/ktor/util/pipeline/PipelineContext;V)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.server.application.hooks.CallFailed$install$1"
    f = "CommonHooks.kt"
    l = {
        0x2c,
        0x30
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/application/hooks/CallFailed$install$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lkotlin/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p2, Lio/ktor/server/application/hooks/CallFailed$install$1;

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    invoke-direct {p2, p0, p3}, Lio/ktor/server/application/hooks/CallFailed$install$1;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p2, Lio/ktor/server/application/hooks/CallFailed$install$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Lio/ktor/server/application/hooks/CallFailed$install$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 17
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    check-cast p2, Lkotlin/飘花落叶言子楪兰苏哲世;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/server/application/hooks/CallFailed$install$1;->invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lkotlin/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->L$1:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/lang/Throwable;

    .line 17
    .line 18
    iget-object p0, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_1
    iget-object v1, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 35
    .line 36
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    move-object v5, v1

    .line 42
    move-object v1, p1

    .line 43
    move-object p1, v5

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 51
    .line 52
    :try_start_1
    new-instance v1, Lio/ktor/server/application/hooks/CallFailed$install$1$1;

    .line 53
    .line 54
    invoke-direct {v1, p1, v2}, Lio/ktor/server/application/hooks/CallFailed$install$1$1;-><init>(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    iput v4, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->label:I

    .line 60
    .line 61
    invoke-static {v1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰哲世(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    if-ne p0, v0, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_1
    move-exception v1

    .line 69
    :goto_0
    iget-object v2, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->$handler:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;

    .line 70
    .line 71
    iget-object v4, p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v4, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 74
    .line 75
    iput-object p1, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v1, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    iput v3, p0, Lio/ktor/server/application/hooks/CallFailed$install$1;->label:I

    .line 80
    .line 81
    invoke-interface {v2, v4, v1, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲兰世苏;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v0, :cond_3

    .line 86
    .line 87
    :goto_1
    return-object v0

    .line 88
    :cond_3
    move-object p0, p1

    .line 89
    move-object v0, v1

    .line 90
    :goto_2
    iget-object p0, p0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 93
    .line 94
    invoke-interface {p0}, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰()Lio/ktor/server/response/飘花落叶言子楪世哲苏兰;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-interface {p0}, Lio/ktor/server/response/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰()Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-eqz p0, :cond_5

    .line 103
    .line 104
    :cond_4
    :goto_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 105
    .line 106
    return-object p0

    .line 107
    :cond_5
    throw v0
.end method
