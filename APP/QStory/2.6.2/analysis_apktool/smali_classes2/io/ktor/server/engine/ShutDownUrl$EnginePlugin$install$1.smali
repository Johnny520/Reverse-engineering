.class final Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
    c = "io.ktor.server.engine.ShutDownUrl$EnginePlugin$install$1"
    f = "ShutDownUrl.kt"
    l = {
        0x41
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $plugin:Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/engine/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->$plugin:Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;

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
    new-instance p2, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;

    .line 2
    .line 3
    iget-object p0, p0, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->$plugin:Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;

    .line 4
    .line 5
    invoke-direct {p2, p0, p3}, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;-><init>(Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p2, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lkotlin/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->L$0:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 27
    .line 28
    iget-object v1, p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 31
    .line 32
    invoke-interface {v1}, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏兰哲()Lio/ktor/server/request/飘花落叶言子楪世兰苏哲;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏世兰(Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v3, p0, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->$plugin:Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;

    .line 41
    .line 42
    iget-object v3, v3, Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    iget-object v1, p0, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->$plugin:Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;

    .line 51
    .line 52
    iget-object p1, p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 55
    .line 56
    iput v2, p0, Lio/ktor/server/engine/ShutDownUrl$EnginePlugin$install$1;->label:I

    .line 57
    .line 58
    invoke-virtual {v1, p1, p0}, Lio/ktor/server/engine/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v0, :cond_2

    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 66
    .line 67
    return-object p0
.end method
