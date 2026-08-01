.class final Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;
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
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
        "",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "it",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;Ljava/lang/Object;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.DefaultRequest$Plugin$install$1"
    f = "DefaultRequest.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $plugin:Lio/ktor/client/plugins/飘花落叶言子楪世苏兰哲;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/ktor/client/plugins/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/client/plugins/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 p1, 0x3

    .line 2
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p0, Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-direct {p0, p2, p3}, Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;-><init>(Lio/ktor/client/plugins/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;->L$0:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 16
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;->invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;->label:I

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p0

    .line 15
    :cond_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lio/ktor/client/plugins/DefaultRequest$Plugin$install$1;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 21
    .line 22
    iget-object p1, p0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    iget-object p1, p1, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;

    .line 27
    .line 28
    invoke-virtual {p1}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    new-instance p1, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏世哲;

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    invoke-direct {p1, v0}, Landroidx/compose/runtime/飘花落叶言子哲世苏楪兰;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v0, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;

    .line 38
    .line 39
    invoke-direct {v0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    invoke-static {v0}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Z)Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

    .line 49
    .line 50
    iget-object p0, p0, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏世哲;

    .line 51
    .line 52
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪哲苏兰世;Lio/ktor/util/飘花落叶言子楪哲苏兰世;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子哲世苏兰楪()L飘花落叶言楪兰世哲子苏/飘花落叶言子楪兰苏哲世;

    .line 56
    .line 57
    .line 58
    sget p0, Lio/ktor/client/plugins/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:I

    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    throw p0
.end method
