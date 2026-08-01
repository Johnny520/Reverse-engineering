.class final Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0xb0
.end annotation

.annotation runtime L飘花落叶言世子苏兰哲楪/飘花落叶言子楪世哲苏兰;
    c = "kotlinx.coroutines.sync.SemaphoreKt"
    f = "Semaphore.kt"
    l = {
        0x51
    }
    m = "withPermit"
    v = 0x1
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
            "Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;",
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
    iput-object p1, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->label:I

    .line 9
    .line 10
    sget v1, Lkotlinx/coroutines/sync/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:I

    .line 11
    .line 12
    and-int v1, p1, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p1, v0

    .line 17
    iput p1, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    move-object p0, p1

    .line 26
    :goto_0
    iget-object p1, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 29
    .line 30
    iget v0, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->label:I

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    if-ne v0, v2, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 41
    .line 42
    iget-object p0, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世兰哲苏;

    .line 45
    .line 46
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :try_start_0
    invoke-interface {v0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;

    .line 54
    .line 55
    invoke-virtual {p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏()V

    .line 56
    .line 57
    .line 58
    return-object p1

    .line 59
    :catchall_0
    move-exception p1

    .line 60
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;

    .line 61
    .line 62
    invoke-virtual {p0}, Lkotlinx/coroutines/sync/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏()V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput-object v1, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->L$1:Ljava/lang/Object;

    .line 78
    .line 79
    const/4 p1, 0x0

    .line 80
    iput p1, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->I$0:I

    .line 81
    .line 82
    iput v2, p0, Lkotlinx/coroutines/sync/SemaphoreKt$withPermit$1;->label:I

    .line 83
    .line 84
    throw v1
.end method
