.class final Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1$1$killer$1"
    f = "HttpTimeout.kt"
    l = {
        0xa5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $executionContext:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

.field final synthetic $request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

.field final synthetic $requestTimeout:Ljava/lang/Long;

.field label:I


# direct methods
.method public constructor <init>(Ljava/lang/Long;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u696a\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$requestTimeout:Ljava/lang/Long;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    iput-object p3, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$executionContext:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
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
    new-instance p1, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;

    .line 2
    .line 3
    iget-object v0, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$requestTimeout:Ljava/lang/Long;

    .line 4
    .line 5
    iget-object v1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    iget-object p0, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$executionContext:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p0, p2}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;-><init>(Ljava/lang/Long;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u54f2\u5170\u82cf;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->label:I

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
    iget-object p1, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$requestTimeout:Ljava/lang/Long;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    iput v2, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->label:I

    .line 31
    .line 32
    invoke-static {v3, v4, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰(JLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    :goto_0
    new-instance p1, Lio/ktor/client/plugins/HttpRequestTimeoutException;

    .line 40
    .line 41
    iget-object v0, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lio/ktor/client/plugins/HttpRequestTimeoutException;-><init>(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lio/ktor/client/plugins/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 47
    .line 48
    new-instance v1, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string v2, "Request timeout: "

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v2, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;

    .line 56
    .line 57
    iget-object v2, v2, L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世苏兰楪哲;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v0, v1}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lio/ktor/client/plugins/HttpTimeoutKt$HttpTimeout$2$1$1$killer$1;->$executionContext:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {v0, p1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V

    .line 79
    .line 80
    .line 81
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 82
    .line 83
    return-object p0
.end method
