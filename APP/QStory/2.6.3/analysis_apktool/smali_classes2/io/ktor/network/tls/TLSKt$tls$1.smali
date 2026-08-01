.class final Lio/ktor/network/tls/TLSKt$tls$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


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
    c = "io.ktor.network.tls.TLSKt"
    f = "TLS.kt"
    l = {
        0x1f
    }
    m = "tls"
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
            "Lio/ktor/network/tls/TLSKt$tls$1;",
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
    .locals 3

    .line 1
    iput-object p1, p0, Lio/ktor/network/tls/TLSKt$tls$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/network/tls/TLSKt$tls$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/network/tls/TLSKt$tls$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lio/ktor/network/tls/TLSKt$tls$1;->L$2:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 22
    .line 23
    iget-object v1, p0, Lio/ktor/network/tls/TLSKt$tls$1;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 26
    .line 27
    iget-object p0, p0, Lio/ktor/network/tls/TLSKt$tls$1;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 30
    .line 31
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    check-cast p1, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    return-object p1

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    invoke-interface {v1, p1}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, p1}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw v1
.end method
