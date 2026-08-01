.class final Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

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
    c = "io.ktor.server.request.ApplicationReceiveFunctionsKt"
    f = "ApplicationReceiveFunctions.kt"
    l = {
        0x86
    }
    m = "receiveOrNull"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iput-object p1, p0, Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    iput v0, p0, Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;->label:I

    .line 9
    .line 10
    sget-object v2, Lio/ktor/server/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    iput v0, p0, Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;->label:I

    .line 14
    .line 15
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-ne v0, v3, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 26
    .line 27
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catch Lio/ktor/server/plugins/ContentTransformationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :try_start_1
    iput-object v2, p0, Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    iput v3, p0, Lio/ktor/server/request/ApplicationReceiveFunctionsKt$receiveOrNull$3;->label:I

    .line 45
    .line 46
    invoke-static {p0}, Lio/ktor/server/request/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0
    :try_end_1
    .catch Lio/ktor/server/plugins/ContentTransformationException; {:try_start_1 .. :try_end_1} :catch_1

    .line 50
    if-ne p0, v1, :cond_2

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_2
    return-object p0

    .line 54
    :catch_1
    move-exception p1

    .line 55
    move-object p0, v2

    .line 56
    :goto_0
    invoke-interface {p0}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏()Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 64
    .line 65
    check-cast p0, Lio/ktor/server/engine/飘花落叶言子楪世哲苏兰;

    .line 66
    .line 67
    iget-object p0, p0, Lio/ktor/server/engine/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 68
    .line 69
    const-string v0, "Conversion failed, null returned"

    .line 70
    .line 71
    invoke-interface {p0, v0, p1}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->debug(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    return-object v2
.end method
