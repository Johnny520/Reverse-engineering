.class final Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.server.response.ApplicationResponseFunctionsKt"
    f = "ApplicationResponseFunctions.kt"
    l = {
        0x79,
        0xda
    }
    m = "respondText"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;",
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
    .locals 7

    .line 1
    iput-object p1, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    if-eq v0, v3, :cond_1

    .line 19
    .line 20
    if-ne v0, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_1
    iget-object v0, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$2:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;

    .line 35
    .line 36
    iget-object v3, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;

    .line 39
    .line 40
    iget-object v5, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v5, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;)L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    new-instance v6, Lio/ktor/http/content/飘花落叶言子楪兰世苏哲;

    .line 54
    .line 55
    invoke-direct {v6, p1, v3, v0}, Lio/ktor/http/content/飘花落叶言子楪兰世苏哲;-><init>(Ljava/lang/String;L飘花落叶言楪兰苏世子哲/飘花落叶言子楪苏世哲兰;L飘花落叶言楪兰苏世子哲/飘花落叶言子世楪哲苏兰;)V

    .line 56
    .line 57
    .line 58
    sget-object p1, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 59
    .line 60
    const-class v0, Lio/ktor/http/content/飘花落叶言子楪兰世苏哲;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    :try_start_0
    invoke-static {v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 67
    .line 68
    .line 69
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    goto :goto_0

    .line 71
    :catchall_0
    move-object v0, v2

    .line 72
    :goto_0
    new-instance v3, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;

    .line 73
    .line 74
    invoke-direct {v3, p1, v0}, L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$0:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$1:Ljava/lang/Object;

    .line 80
    .line 81
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$2:Ljava/lang/Object;

    .line 82
    .line 83
    iput v4, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->label:I

    .line 84
    .line 85
    invoke-interface {v5, v6, v3, p0}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏哲兰楪世(Ljava/lang/Object;L飘花落叶言世子楪兰苏哲/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, v1, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    :goto_1
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 93
    .line 94
    :goto_2
    return-object v1

    .line 95
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$1:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->L$2:Ljava/lang/Object;

    .line 103
    .line 104
    iput v3, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondText$3;->label:I

    .line 105
    .line 106
    throw v2
.end method
