.class final Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;
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
    c = "io.ktor.http.cio.MultipartKt"
    f = "Multipart.kt"
    l = {
        0x18f,
        0x197
    }
    m = "skipDelimiterOrEof"
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
            "Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;",
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
    .locals 6

    .line 1
    iput-object p1, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    iput v0, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->label:I

    .line 9
    .line 10
    sget-object v2, Lio/ktor/http/cio/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    iput v0, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->label:I

    .line 14
    .line 15
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v0, v4, :cond_1

    .line 23
    .line 24
    if-ne v0, v3, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_1
    iget-object v0, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->L$2:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 39
    .line 40
    iget-object v4, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->L$1:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 43
    .line 44
    iget-object v5, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-boolean p1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_2
    iput-object v2, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v2, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object v2, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->L$2:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, p0, Lio/ktor/http/cio/MultipartKt$skipDelimiterOrEof$1;->label:I

    .line 65
    .line 66
    invoke-static {v5, v4, p0}, Lio/ktor/http/cio/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    return-object p0

    .line 74
    :cond_4
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    throw v2
.end method
