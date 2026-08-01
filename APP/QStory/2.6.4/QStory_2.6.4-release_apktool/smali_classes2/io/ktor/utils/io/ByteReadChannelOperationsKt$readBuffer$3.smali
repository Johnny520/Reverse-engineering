.class final Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;
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
    c = "io.ktor.utils.io.ByteReadChannelOperationsKt"
    f = "ByteReadChannelOperations.kt"
    l = {
        0x63
    }
    m = "readBuffer"
.end annotation


# instance fields
.field I$0:I

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
            "Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;",
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
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v0, v3, :cond_0

    .line 18
    .line 19
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->I$0:I

    .line 20
    .line 21
    iget-object v2, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->L$1:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    iget-object v4, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    :goto_0
    if-lez v0, :cond_4

    .line 49
    .line 50
    invoke-interface {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_4

    .line 55
    .line 56
    invoke-interface {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v4}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子世苏兰楪哲()Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_3

    .line 65
    .line 66
    iput-object v2, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->L$0:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    iput v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->I$0:I

    .line 71
    .line 72
    iput v3, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readBuffer$3;->label:I

    .line 73
    .line 74
    invoke-interface {v2, v3, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    if-ne v4, v1, :cond_2

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_2
    move-object v4, v2

    .line 82
    move-object v2, p1

    .line 83
    :goto_1
    move-object p1, v2

    .line 84
    move-object v2, v4

    .line 85
    :cond_3
    int-to-long v4, v0

    .line 86
    invoke-interface {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-static {v6}, L飘花落叶言世子苏楪哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 91
    .line 92
    .line 93
    move-result-wide v6

    .line 94
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 95
    .line 96
    .line 97
    move-result-wide v4

    .line 98
    invoke-interface {v2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-interface {v6, p1, v4, v5}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子哲楪世兰苏(Lkotlinx/io/飘花落叶言子楪苏哲兰世;J)V

    .line 103
    .line 104
    .line 105
    long-to-int v4, v4

    .line 106
    sub-int/2addr v0, v4

    .line 107
    goto :goto_0

    .line 108
    :cond_4
    return-object p1
.end method
