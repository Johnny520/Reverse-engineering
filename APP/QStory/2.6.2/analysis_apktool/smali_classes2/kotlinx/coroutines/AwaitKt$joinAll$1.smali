.class final Lkotlinx/coroutines/AwaitKt$joinAll$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.AwaitKt"
    f = "Await.kt"
    l = {
        0x2f
    }
    m = "joinAll"
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

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
            "Lkotlinx/coroutines/AwaitKt$joinAll$1;",
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
    .locals 8

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->label:I

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
    iput p1, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lkotlinx/coroutines/AwaitKt$joinAll$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lkotlinx/coroutines/AwaitKt$joinAll$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->label:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_4

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-ne v1, v3, :cond_3

    .line 35
    .line 36
    iget v1, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->I$2:I

    .line 37
    .line 38
    iget v4, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->I$1:I

    .line 39
    .line 40
    iget v5, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->I$0:I

    .line 41
    .line 42
    iget-object v6, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->L$3:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v6, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 45
    .line 46
    iget-object v6, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->L$2:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 49
    .line 50
    iget-object v6, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->L$1:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, [Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 53
    .line 54
    iget-object v7, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->L$0:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v7, [Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 57
    .line 58
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    add-int/2addr v4, v3

    .line 62
    if-ge v4, v1, :cond_2

    .line 63
    .line 64
    aget-object p1, v6, v4

    .line 65
    .line 66
    iput-object v2, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v6, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v2, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->L$2:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v2, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->L$3:Ljava/lang/Object;

    .line 73
    .line 74
    iput v5, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->I$0:I

    .line 75
    .line 76
    iput v4, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->I$1:I

    .line 77
    .line 78
    iput v1, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->I$2:I

    .line 79
    .line 80
    const/4 v7, 0x0

    .line 81
    iput v7, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->I$3:I

    .line 82
    .line 83
    iput v3, p0, Lkotlinx/coroutines/AwaitKt$joinAll$1;->label:I

    .line 84
    .line 85
    invoke-interface {p1, p0}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-ne p1, v0, :cond_1

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_2
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 96
    .line 97
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-object v2

    .line 101
    :cond_4
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    throw v2
.end method
