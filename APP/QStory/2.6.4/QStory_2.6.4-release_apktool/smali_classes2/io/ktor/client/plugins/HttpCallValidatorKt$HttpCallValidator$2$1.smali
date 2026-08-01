.class final Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "request",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1"
    f = "HttpCallValidator.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $expectSuccess:Z

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(ZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->$expectSuccess:Z

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final invokeSuspend$lambda$0(Z)Z
    .locals 0

    .line 1
    return p0
.end method

.method public static synthetic 飘花落叶言子楪世哲兰苏(Z)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->invokeSuspend$lambda$0(Z)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 1
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
    new-instance v0, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;

    .line 2
    .line 3
    iget-boolean p0, p0, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->$expectSuccess:Z

    .line 4
    .line 5
    invoke-direct {v0, p0, p2}, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;-><init>(ZLkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->invoke(L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->L$0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    iget-object p1, p1, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏:Lio/ktor/util/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    sget-object v0, Lio/ktor/client/plugins/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏兰哲:Lio/ktor/util/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    iget-boolean p0, p0, Lio/ktor/client/plugins/HttpCallValidatorKt$HttpCallValidator$2$1;->$expectSuccess:Z

    .line 19
    .line 20
    new-instance v1, Lio/ktor/client/plugins/飘花落叶言子楪苏世兰哲;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lio/ktor/client/plugins/飘花落叶言子楪苏世兰哲;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Lio/ktor/util/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lio/ktor/util/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0
.end method
