.class final Lio/ktor/network/tls/TLSCommonKt$tls$3;
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
    c = "io.ktor.network.tls.TLSCommonKt"
    f = "TLSCommon.kt"
    l = {
        0x27
    }
    m = "tls"
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
            "Lio/ktor/network/tls/TLSCommonKt$tls$3;",
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
    .locals 5

    .line 1
    iput-object p1, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->label:I

    .line 9
    .line 10
    instance-of p1, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget p1, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->label:I

    .line 15
    .line 16
    and-int v1, p1, v0

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    sub-int/2addr p1, v0

    .line 21
    iput p1, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Lio/ktor/network/tls/TLSCommonKt$tls$3;

    .line 25
    .line 26
    invoke-direct {p1, p0}, Lio/ktor/network/tls/TLSCommonKt$tls$3;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 27
    .line 28
    .line 29
    move-object p0, p1

    .line 30
    :goto_0
    iget-object p1, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->result:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 33
    .line 34
    iget v1, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->label:I

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    iget-object p0, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v2, p0

    .line 45
    check-cast v2, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    move-object v0, v2

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iget-object p1, v2, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 64
    .line 65
    iget-object v1, v2, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 66
    .line 67
    iget-object v4, v2, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    iput-object v2, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    iput v3, p0, Lio/ktor/network/tls/TLSCommonKt$tls$3;->label:I

    .line 72
    .line 73
    invoke-static {p1, v1, v4, v2, p0}, Lio/ktor/network/tls/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/network/tls/飘花落叶言子楪世哲苏兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v0, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    :goto_1
    move-object v0, p1

    .line 81
    check-cast v0, Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    :goto_2
    return-object v0

    .line 84
    :goto_3
    iget-object p1, v2, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 85
    .line 86
    invoke-virtual {p1, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, v2, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 90
    .line 91
    invoke-static {p1, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, v2, Lio/ktor/network/sockets/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Lio/ktor/network/sockets/飘花落叶言子楪哲兰世苏;

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 97
    .line 98
    .line 99
    throw p0
.end method
