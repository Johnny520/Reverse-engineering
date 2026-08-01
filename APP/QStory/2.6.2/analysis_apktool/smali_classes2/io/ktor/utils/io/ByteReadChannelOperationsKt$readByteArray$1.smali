.class final Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;
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
    c = "io.ktor.utils.io.ByteReadChannelOperationsKt"
    f = "ByteReadChannelOperations.kt"
    l = {
        0xbd
    }
    m = "readByteArray"
.end annotation


# instance fields
.field I$0:I

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
            "Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;",
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
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->label:I

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
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->I$0:I

    .line 20
    .line 21
    iget-object v2, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->L$2:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lkotlinx/io/飘花落叶言子楪苏哲兰世;

    .line 24
    .line 25
    iget-object v4, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->L$1:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v4, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    iget-object v5, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->L$0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v5, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 34
    .line 35
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
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    move-object v4, p1

    .line 53
    move-object p1, v2

    .line 54
    move-object v2, v4

    .line 55
    :goto_0
    move-object v5, v2

    .line 56
    check-cast v5, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 57
    .line 58
    iget-wide v5, v5, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 59
    .line 60
    long-to-int v5, v5

    .line 61
    if-ge v5, v0, :cond_3

    .line 62
    .line 63
    sub-int v5, v0, v5

    .line 64
    .line 65
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->L$0:Ljava/lang/Object;

    .line 66
    .line 67
    iput-object v4, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    iput-object v2, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->L$2:Ljava/lang/Object;

    .line 70
    .line 71
    iput v0, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->I$0:I

    .line 72
    .line 73
    iput v3, p0, Lio/ktor/utils/io/ByteReadChannelOperationsKt$readByteArray$1;->label:I

    .line 74
    .line 75
    invoke-static {p1, v5, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    if-ne v5, v1, :cond_2

    .line 80
    .line 81
    return-object v1

    .line 82
    :cond_2
    move-object v7, v5

    .line 83
    move-object v5, p1

    .line 84
    move-object p1, v7

    .line 85
    :goto_1
    check-cast p1, Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 86
    .line 87
    invoke-static {v2, p1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲世兰(Lkotlinx/io/飘花落叶言子楪苏哲兰世;Lkotlinx/io/飘花落叶言子楪苏兰世哲;)V

    .line 88
    .line 89
    .line 90
    move-object p1, v5

    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-static {v4}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲世兰(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)[B

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method
