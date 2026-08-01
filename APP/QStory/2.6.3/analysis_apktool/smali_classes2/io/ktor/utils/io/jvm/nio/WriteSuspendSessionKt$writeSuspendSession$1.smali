.class final Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;
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
    c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt"
    f = "WriteSuspendSession.kt"
    l = {
        0x2b,
        0x2d,
        0x2d
    }
    m = "writeSuspendSession"
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
            "Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;",
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
    iput-object p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->label:I

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
    iput p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->label:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 21
    .line 22
    .line 23
    move-object p0, p1

    .line 24
    :goto_0
    iget-object p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->result:Ljava/lang/Object;

    .line 25
    .line 26
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 27
    .line 28
    iget v1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->label:I

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x3

    .line 32
    if-eqz v1, :cond_5

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eq v1, v5, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-eq v1, v3, :cond_1

    .line 41
    .line 42
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_1
    iget-object p0, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ljava/lang/Throwable;

    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    iget-object v1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;

    .line 63
    .line 64
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    iput-object v2, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->L$0:Ljava/lang/Object;

    .line 68
    .line 69
    iput v4, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->label:I

    .line 70
    .line 71
    check-cast v1, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 72
    .line 73
    invoke-virtual {v1, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    if-ne p0, v0, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 81
    .line 82
    return-object p0

    .line 83
    :catchall_0
    move-exception p1

    .line 84
    move-object v2, v1

    .line 85
    goto :goto_2

    .line 86
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    const/16 p1, 0x2000

    .line 93
    .line 94
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    .line 97
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 98
    :catchall_1
    move-exception p1

    .line 99
    :goto_2
    iput-object p1, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->L$0:Ljava/lang/Object;

    .line 100
    .line 101
    iput v3, p0, Lio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt$writeSuspendSession$1;->label:I

    .line 102
    .line 103
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 104
    .line 105
    invoke-virtual {v2, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-ne p0, v0, :cond_6

    .line 110
    .line 111
    :goto_3
    return-object v0

    .line 112
    :cond_6
    move-object p0, p1

    .line 113
    :goto_4
    throw p0
.end method
