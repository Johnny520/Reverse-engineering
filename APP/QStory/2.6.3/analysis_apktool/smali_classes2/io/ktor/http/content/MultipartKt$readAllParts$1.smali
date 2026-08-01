.class final Lio/ktor/http/content/MultipartKt$readAllParts$1;
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
    c = "io.ktor.http.content.MultipartKt"
    f = "Multipart.kt"
    l = {
        0x82,
        0x87
    }
    m = "readAllParts"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

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
            "Lio/ktor/http/content/MultipartKt$readAllParts$1;",
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
    iput-object p1, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_5

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
    iget-object v0, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->L$1:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object v2, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->L$0:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lio/ktor/http/content/飘花落叶言子楪世兰苏哲;

    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    move-object v5, v2

    .line 34
    move-object v2, v0

    .line 35
    move-object v0, v5

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_1
    iget-object v0, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lio/ktor/http/content/飘花落叶言子楪世兰苏哲;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    check-cast p1, Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;

    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :goto_0
    iput-object v0, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v2, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    iput v4, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->label:I

    .line 70
    .line 71
    move-object p1, v0

    .line 72
    check-cast p1, Lio/ktor/http/cio/飘花落叶言子楪世哲兰苏;

    .line 73
    .line 74
    invoke-virtual {p1, p0}, Lio/ktor/http/cio/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    move-object v5, v0

    .line 82
    move-object v0, p1

    .line 83
    move-object p1, v5

    .line 84
    :goto_1
    check-cast p1, Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;

    .line 85
    .line 86
    if-nez p1, :cond_4

    .line 87
    .line 88
    return-object v2

    .line 89
    :cond_4
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iput-object v2, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->L$0:Ljava/lang/Object;

    .line 97
    .line 98
    iput v3, p0, Lio/ktor/http/content/MultipartKt$readAllParts$1;->label:I

    .line 99
    .line 100
    throw v2
.end method
