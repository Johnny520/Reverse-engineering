.class final Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
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
    c = "io.ktor.client.engine.cio.UtilsKt$writeRequest$2"
    f = "utils.kt"
    l = {
        0x1f,
        0x20
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $callContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field final synthetic $closeChannel:Z

.field final synthetic $output:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

.field final synthetic $overProxy:Z

.field final synthetic $request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

.field label:I


# direct methods
.method public constructor <init>(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ZZLkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u82cf\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u4e16\u5170;",
            "ZZ",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$output:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 4
    .line 5
    iput-boolean p3, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$overProxy:Z

    .line 6
    .line 7
    iput-boolean p4, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$closeChannel:Z

    .line 8
    .line 9
    iput-object p5, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$callContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 7
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
    new-instance v0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$output:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 6
    .line 7
    iget-boolean v3, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$overProxy:Z

    .line 8
    .line 9
    iget-boolean v4, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$closeChannel:Z

    .line 10
    .line 11
    iget-object v5, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$callContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;-><init>(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ZZLkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->invoke(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->label:I

    .line 4
    .line 5
    sget-object v2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v4, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 34
    .line 35
    iget-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$output:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 36
    .line 37
    iget-boolean v5, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$overProxy:Z

    .line 38
    .line 39
    iget-boolean v6, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$closeChannel:Z

    .line 40
    .line 41
    iput v4, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->label:I

    .line 42
    .line 43
    invoke-static {p1, v1, v5, v6, p0}, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;ZZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-ne p1, v0, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    :goto_0
    iget-object p1, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$request:L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;

    .line 51
    .line 52
    iget-object v1, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$output:Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 53
    .line 54
    iget-object v4, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->$callContext:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 55
    .line 56
    iput v3, p0, Lio/ktor/client/engine/cio/UtilsKt$writeRequest$2;->label:I

    .line 57
    .line 58
    invoke-static {p1, v1, v4}, Lio/ktor/client/engine/cio/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)V

    .line 59
    .line 60
    .line 61
    if-ne v2, v0, :cond_4

    .line 62
    .line 63
    :goto_1
    return-object v0

    .line 64
    :cond_4
    return-object v2
.end method
