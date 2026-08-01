.class final Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;
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
    c = "io.ktor.http.cio.HttpParserKt"
    f = "HttpParser.kt"
    l = {
        0x56
    }
    m = "parseHeaders"
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
            "Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;",
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
    iput-object p1, p0, Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    iput v0, p0, Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;->label:I

    .line 9
    .line 10
    sget-object v2, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    iput v0, p0, Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;->label:I

    .line 14
    .line 15
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    if-ne v0, v3, :cond_0

    .line 22
    .line 23
    iget-object p0, p0, Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;->L$0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 26
    .line 27
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;

    .line 41
    .line 42
    invoke-direct {p1}, Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    iput v3, p0, Lio/ktor/http/cio/HttpParserKt$parseHeaders$1;->label:I

    .line 48
    .line 49
    new-instance v0, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;

    .line 50
    .line 51
    invoke-direct {v0}, Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-static {v2, p1, v0, p0}, Lio/ktor/http/cio/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;Lio/ktor/http/cio/internals/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-ne p0, v1, :cond_2

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_2
    move-object v4, p1

    .line 62
    move-object p1, p0

    .line 63
    move-object p0, v4

    .line 64
    :goto_0
    check-cast p1, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 65
    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    new-instance p1, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Lio/ktor/http/cio/飘花落叶言子楪苏哲世兰;-><init>(Lio/ktor/http/cio/internals/飘花落叶言子楪世哲苏兰;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-object p1
.end method
