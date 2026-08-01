.class final Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.server.engine.DefaultEnginePipelineKt$defaultEnginePipeline$1$1"
    f = "DefaultEnginePipeline.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $$this$intercept:Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $error:Lio/ktor/util/cio/ChannelIOException;

.field label:I


# direct methods
.method public constructor <init>(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/util/cio/ChannelIOException;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/util/pipeline/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Lio/ktor/util/cio/ChannelIOException;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->$$this$intercept:Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->$error:Lio/ktor/util/cio/ChannelIOException;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->$$this$intercept:Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    iget-object p0, p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->$error:Lio/ktor/util/cio/ChannelIOException;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;-><init>(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/util/cio/ChannelIOException;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1}, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->invoke(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->create(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->$$this$intercept:Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    iget-object p1, p1, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 15
    .line 16
    invoke-interface {p1}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲()Lio/ktor/server/application/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, Lio/ktor/server/application/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰苏哲世:Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;

    .line 21
    .line 22
    iget-object v0, p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->$$this$intercept:Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 23
    .line 24
    iget-object v0, v0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lio/ktor/server/application/飘花落叶言子楪哲苏世兰;

    .line 27
    .line 28
    iget-object p0, p0, Lio/ktor/server/engine/DefaultEnginePipelineKt$defaultEnginePipeline$1$1;->$error:Lio/ktor/util/cio/ChannelIOException;

    .line 29
    .line 30
    invoke-static {p1, v0, p0}, Lio/ktor/server/engine/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Lio/ktor/server/application/飘花落叶言子楪世哲兰苏;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    return-object p0
.end method
