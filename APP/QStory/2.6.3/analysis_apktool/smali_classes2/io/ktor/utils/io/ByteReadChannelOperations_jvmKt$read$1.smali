.class final Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$read$1;
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
    xi = 0xb0
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt"
    f = "ByteReadChannelOperations.jvm.kt"
    l = {
        0xb6
    }
    m = "read"
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
            "Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$read$1;",
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
    iput-object p1, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$read$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$read$1;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$read$1;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_4

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-ne v0, v2, :cond_3

    .line 18
    .line 19
    iget v0, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$read$1;->I$0:I

    .line 20
    .line 21
    iget-object v1, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$read$1;->L$1:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 24
    .line 25
    iget-object p0, p0, Lio/ktor/utils/io/ByteReadChannelOperations_jvmKt$read$1;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 28
    .line 29
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    if-gtz v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 42
    .line 43
    const-string v1, "Not enough bytes available: required "

    .line 44
    .line 45
    const-string v2, " but "

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p0, " available"

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {p1, p0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_1
    :goto_0
    invoke-static {p0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 76
    .line 77
    if-lez p1, :cond_2

    .line 78
    .line 79
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0, v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    return-object v0

    .line 87
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_4
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 97
    .line 98
    .line 99
    throw v1
.end method
