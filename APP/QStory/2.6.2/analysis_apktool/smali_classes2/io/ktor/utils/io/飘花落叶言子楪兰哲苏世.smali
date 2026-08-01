.class public final Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(II)Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    iget-object p0, p0, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    add-int/2addr p2, p1

    .line 12
    int-to-long v2, p2

    .line 13
    cmp-long p2, v0, v2

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    if-gez p2, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Lkotlinx/io/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->peek()Lkotlinx/io/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const/4 p2, -0x1

    .line 35
    :try_start_0
    invoke-static {p0, p2}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;I)[B

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-static {p0, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    if-lez p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/nio/Buffer;->position()I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, p1

    .line 53
    invoke-virtual {p2, p0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object p2

    .line 57
    :catchall_0
    move-exception p1

    .line 58
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    :catchall_1
    move-exception p2

    .line 60
    invoke-static {p0, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw p2
.end method

.method public final 飘花落叶言子楪世苏哲兰(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;-><init>(Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p1, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->I$0:I

    .line 37
    .line 38
    iget-object p0, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->L$0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 57
    .line 58
    invoke-interface {p2}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v2}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    int-to-long v6, p1

    .line 67
    cmp-long v2, v4, v6

    .line 68
    .line 69
    if-ltz v2, :cond_3

    .line 70
    .line 71
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_3
    iput-object p0, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->L$0:Ljava/lang/Object;

    .line 75
    .line 76
    iput p1, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->I$0:I

    .line 77
    .line 78
    iput v3, v0, Lio/ktor/utils/io/LookAheadSuspendSession$awaitAtLeast$1;->label:I

    .line 79
    .line 80
    invoke-interface {p2, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v1, :cond_4

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_4
    :goto_1
    iget-object p0, p0, Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 88
    .line 89
    invoke-interface {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Lkotlinx/io/飘花落叶言子楪苏兰世哲;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v0

    .line 97
    int-to-long p0, p1

    .line 98
    cmp-long p0, v0, p0

    .line 99
    .line 100
    if-ltz p0, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    const/4 v3, 0x0

    .line 104
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0
.end method
