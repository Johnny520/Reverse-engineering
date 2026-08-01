.class final Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;
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
    c = "io.ktor.server.engine.BaseApplicationEngineKt$installDefaultInterceptors$1"
    f = "BaseApplicationEngine.kt"
    l = {
        0x83
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 3
    .line 4
    .line 5
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
    new-instance p0, Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;

    .line 2
    .line 3
    invoke-direct {p0, p3}, Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;->L$0:Ljava/lang/Object;

    .line 7
    .line 8
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 15
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    check-cast p2, Lkotlin/飘花落叶言子楪兰苏哲世;

    check-cast p3, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3}, Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;->invoke(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lkotlin/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object v3

    .line 17
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 29
    .line 30
    iget-object p1, p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 34
    .line 35
    invoke-static {v1}, Lio/ktor/server/application/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 43
    .line 44
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世哲兰()Lio/ktor/server/response/飘花落叶言子楪世哲苏兰;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v1}, Lio/ktor/server/response/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏哲世兰()L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-nez v1, :cond_3

    .line 53
    .line 54
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->getAttributes()Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget-object v5, Lio/ktor/server/routing/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    invoke-virtual {v1, v5}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 65
    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    sget-object v1, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世楪苏哲兰:L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 69
    .line 70
    :cond_3
    sget-object v5, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 71
    .line 72
    const-class v6, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    :try_start_0
    invoke-static {v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 79
    .line 80
    .line 81
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    :catchall_0
    new-instance v6, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 83
    .line 84
    invoke-direct {v6, v5, v2}, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

    .line 85
    .line 86
    .line 87
    iput v4, p0, Lio/ktor/server/engine/BaseApplicationEngineKt$installDefaultInterceptors$1;->label:I

    .line 88
    .line 89
    invoke-interface {p1, v1, v6, p0}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    if-ne p0, v0, :cond_4

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_4
    :goto_0
    return-object v3
.end method
