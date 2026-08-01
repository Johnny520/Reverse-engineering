.class final Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;
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
    c = "io.ktor.client.plugins.cache.HttpCacheLegacyKt"
    f = "HttpCacheLegacy.kt"
    l = {
        0x3e,
        0x3f,
        0x48
    }
    m = "interceptReceiveLegacy"
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
            "Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;",
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
    iput-object p1, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->label:I

    .line 9
    .line 10
    and-int v1, p1, v0

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    sub-int/2addr p1, v0

    .line 15
    iput p1, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v0, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->label:I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_5

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    const/4 v3, 0x2

    .line 35
    if-eq v0, v2, :cond_3

    .line 36
    .line 37
    if-eq v0, v3, :cond_1

    .line 38
    .line 39
    const/4 p0, 0x3

    .line 40
    if-ne v0, p0, :cond_2

    .line 41
    .line 42
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    iget-object v0, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->L$0:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;

    .line 58
    .line 59
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 65
    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_4
    iput-object v1, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    iput v3, p0, Lio/ktor/client/plugins/cache/HttpCacheLegacyKt$interceptReceiveLegacy$1;->label:I

    .line 71
    .line 72
    invoke-virtual {v0, v1, p0}, Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method
