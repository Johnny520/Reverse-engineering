.class final Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;
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
    c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt"
    f = "ByteReadChannelOperations.jvm.kt"
    l = {
        0x6b
    }
    m = "skipDelimiter"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

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
            "Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;",
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
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-ne v0, v3, :cond_3

    .line 18
    .line 19
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->I$1:I

    .line 20
    .line 21
    iget v4, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->I$0:I

    .line 22
    .line 23
    iget-object v5, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->L$1:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    iget-object v6, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    check-cast p1, Ljava/lang/Number;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {v5, v4}, L飘花落叶言世苏哲楪兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(I)B

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-ne p1, v7, :cond_2

    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    if-ge v4, v0, :cond_1

    .line 49
    .line 50
    iput-object v6, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object v5, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    iput v4, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->I$0:I

    .line 55
    .line 56
    iput v0, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->I$1:I

    .line 57
    .line 58
    iput v3, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$skipDelimiter$2;->label:I

    .line 59
    .line 60
    invoke-static {v6, p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_0

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_2
    const-string p0, "Delimiter is not found"

    .line 71
    .line 72
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    return-object v2

    .line 76
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object v2

    .line 82
    :cond_4
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    throw v2
.end method
