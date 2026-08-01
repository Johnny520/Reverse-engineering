.class final Lio/ktor/server/application/OnCallRespondContext$transformBody$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
    c = "io.ktor.server.application.OnCallRespondContext"
    f = "KtorCallContexts.kt"
    l = {
        0x55
    }
    m = "transformBody"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/ktor/server/application/飘花落叶言子楪哲世兰苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/ktor/server/application/飘花落叶言子楪哲世兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/application/OnCallRespondContext$transformBody$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->this$0:Lio/ktor/server/application/飘花落叶言子楪哲世兰苏;

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
    .locals 4

    .line 1
    iput-object p1, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    iput v0, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->label:I

    .line 9
    .line 10
    iget-object v2, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->this$0:Lio/ktor/server/application/飘花落叶言子楪哲世兰苏;

    .line 11
    .line 12
    iget-object v2, v2, Lio/ktor/server/application/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 13
    .line 14
    sub-int/2addr v0, v1

    .line 15
    iput v0, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->label:I

    .line 16
    .line 17
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v3, 0x1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    if-ne v0, v3, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, v2, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 50
    .line 51
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰()Lio/ktor/server/response/飘花落叶言子楪世哲苏兰;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object v0, Lio/ktor/server/response/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1}, Lio/ktor/server/response/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->getAttributes()Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    sget-object v0, Lio/ktor/server/response/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 75
    .line 76
    iput-object v2, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    iput v3, p0, Lio/ktor/server/application/OnCallRespondContext$transformBody$1;->label:I

    .line 79
    .line 80
    throw v1
.end method
