.class final Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;
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
    c = "io.ktor.server.response.ApplicationResponseFunctionsKt"
    f = "ApplicationResponseFunctions.kt"
    l = {
        0x88,
        0xda
    }
    m = "respondBytes"
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
            "Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;",
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
    iput-object p1, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->label:I

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
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_1
    iget-object v0, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$2:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;

    .line 35
    .line 36
    iget-object v3, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$1:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;

    .line 39
    .line 40
    iget-object v5, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;

    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    check-cast p1, [B

    .line 48
    .line 49
    new-instance v6, Lio/ktor/http/content/飘花落叶言子楪世苏兰哲;

    .line 50
    .line 51
    invoke-direct {v6, p1, v5, v3}, Lio/ktor/http/content/飘花落叶言子楪世苏兰哲;-><init>([BL飘花落叶言楪兰世哲子苏/飘花落叶言子楪苏世哲兰;L飘花落叶言楪兰世哲子苏/飘花落叶言子世楪哲苏兰;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 55
    .line 56
    const-class v3, Lio/ktor/http/content/飘花落叶言子楪世苏兰哲;

    .line 57
    .line 58
    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :try_start_0
    invoke-static {v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 63
    .line 64
    .line 65
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-object v3, v2

    .line 68
    :goto_0
    new-instance v5, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    invoke-direct {v5, p1, v3}, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;-><init>(Lkotlin/reflect/飘花落叶言子楪世哲兰苏;Lkotlin/reflect/飘花落叶言子世楪苏兰哲;)V

    .line 71
    .line 72
    .line 73
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$1:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$2:Ljava/lang/Object;

    .line 78
    .line 79
    iput v4, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->label:I

    .line 80
    .line 81
    invoke-interface {v0, v6, v5, p0}, Lio/ktor/server/application/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v1, :cond_2

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    :goto_1
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 89
    .line 90
    :goto_2
    return-object v1

    .line 91
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v2, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->L$2:Ljava/lang/Object;

    .line 99
    .line 100
    iput v3, p0, Lio/ktor/server/response/ApplicationResponseFunctionsKt$respondBytes$1;->label:I

    .line 101
    .line 102
    throw v2
.end method
