.class final Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰苏世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lio/ktor/server/application/hooks/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "call",
        "Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
        "content",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/server/application/hooks/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.server.http.content.StaticContentKt$StaticContentAutoHead$1$1"
    f = "StaticContent.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invoke(Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/server/application/hooks/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lio/ktor/server/application/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lio/ktor/http/content/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u4e16\u82cf\u5170;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p0, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;

    .line 2
    .line 3
    invoke-direct {p0, p4}, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->L$0:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, p0, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->L$1:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->L$2:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 19
    check-cast p1, Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;

    check-cast p2, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    check-cast p3, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;

    check-cast p4, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->invoke(Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->label:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->L$0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;

    .line 14
    .line 15
    iget-object v0, p0, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->L$1:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    iget-object p0, p0, Lio/ktor/server/http/content/StaticContentKt$StaticContentAutoHead$1$1;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;

    .line 22
    .line 23
    invoke-interface {v0}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲()Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Lio/ktor/server/request/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言楪兰苏世子哲/飘花落叶言子世苏哲兰楪;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 32
    .line 33
    iget-object v0, v0, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;

    .line 36
    .line 37
    sget-object v2, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏世哲兰:L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪苏哲兰;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    instance-of v0, p0, Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    move-object v0, p0

    .line 50
    check-cast v0, Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;

    .line 51
    .line 52
    invoke-virtual {v0}, Lio/ktor/http/content/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰()Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :cond_0
    new-instance v0, Lio/ktor/server/http/content/飘花落叶言子楪世哲兰苏;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lio/ktor/server/http/content/飘花落叶言子楪世哲兰苏;-><init>(Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object p0, p1, Lio/ktor/server/application/hooks/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_1
    const-string p0, "Check failed."

    .line 76
    .line 77
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v1
.end method
