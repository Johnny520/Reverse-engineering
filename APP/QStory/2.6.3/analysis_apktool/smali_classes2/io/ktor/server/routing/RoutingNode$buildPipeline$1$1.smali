.class final Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;
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
    c = "io.ktor.server.routing.RoutingNode$buildPipeline$1$1"
    f = "RoutingNode.kt"
    l = {
        0x74
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $handlers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $index:I

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Ljava/util/List;ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            ">;I",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->$handlers:Ljava/util/List;

    .line 2
    .line 3
    iput p2, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->$index:I

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lkotlin/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 1
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
    new-instance p2, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->$handlers:Ljava/util/List;

    .line 4
    .line 5
    iget p0, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->$index:I

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p3}, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;-><init>(Ljava/util/List;ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p2, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    invoke-virtual {p2, p0}, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 19
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    check-cast p2, Lkotlin/飘花落叶言子楪兰苏哲世;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lkotlin/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->label:I

    .line 4
    .line 5
    sget-object v2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v2

    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    iget-object p1, p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    check-cast p1, Lio/ktor/server/routing/飘花落叶言子楪兰哲世苏;

    .line 38
    .line 39
    new-instance v1, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;

    .line 40
    .line 41
    invoke-direct {v1, p1}, Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;-><init>(Lio/ktor/server/routing/飘花落叶言子楪兰哲世苏;)V

    .line 42
    .line 43
    .line 44
    new-instance v4, Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;

    .line 45
    .line 46
    invoke-direct {v4, v1}, Lio/ktor/server/routing/飘花落叶言子楪兰世苏哲;-><init>(Lio/ktor/server/routing/飘花落叶言子楪哲兰苏世;)V

    .line 47
    .line 48
    .line 49
    sget-object v1, Lio/ktor/server/application/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 50
    .line 51
    iget-object p1, p1, Lio/ktor/server/routing/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 52
    .line 53
    iget-object p1, p1, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lio/ktor/server/response/飘花落叶言子楪世哲苏兰;

    .line 56
    .line 57
    invoke-interface {p1}, Lio/ktor/server/response/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲世苏兰()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iget-object p1, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->$handlers:Ljava/util/List;

    .line 65
    .line 66
    iget v1, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->$index:I

    .line 67
    .line 68
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 73
    .line 74
    iput v3, p0, Lio/ktor/server/routing/RoutingNode$buildPipeline$1$1;->label:I

    .line 75
    .line 76
    invoke-interface {p1, v4, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    if-ne p0, v0, :cond_3

    .line 81
    .line 82
    return-object v0

    .line 83
    :cond_3
    :goto_0
    return-object v2
.end method
