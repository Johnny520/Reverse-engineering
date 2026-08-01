.class public final Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;


# static fields
.field public static final synthetic 飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic 飘花落叶言子楪哲兰苏世:J

.field public static final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic closed:I

.field private volatile synthetic closedCause:Ljava/lang/Object;

.field private volatile synthetic onCloseHandler:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    const-class v1, Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "onCloseHandler"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sput-object v1, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    sget-object v1, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    sput-wide v1, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:J

    .line 24
    .line 25
    const-string v1, "closed"

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lio/ktor/network/sockets/DatagramSendChannel$send$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->label:I

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
    iput v1, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/network/sockets/DatagramSendChannel$send$1;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_5

    .line 34
    .line 35
    const/4 p0, 0x2

    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$0:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_3

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v3

    .line 56
    :cond_2
    iget-object v2, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$2:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v2, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;

    .line 59
    .line 60
    iget-object v4, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    if-nez v4, :cond_4

    .line 63
    .line 64
    iget-object v4, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v4, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;

    .line 67
    .line 68
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :try_start_1
    sget-object p1, Lkotlinx/coroutines/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世兰苏哲;

    .line 72
    .line 73
    sget-object p1, L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世哲兰苏;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 74
    .line 75
    :try_start_2
    new-instance v5, Lio/ktor/network/sockets/DatagramSendChannel$send$2$1;

    .line 76
    .line 77
    invoke-direct {v5, v3, v4, v3}, Lio/ktor/network/sockets/DatagramSendChannel$send$2$1;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 78
    .line 79
    .line 80
    iput-object v2, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object v3, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v3, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$2:Ljava/lang/Object;

    .line 85
    .line 86
    iput p0, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->label:I

    .line 87
    .line 88
    invoke-static {p1, v5, v0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲苏兰楪(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    if-ne p0, v1, :cond_3

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_3
    move-object p0, v2

    .line 96
    :goto_1
    invoke-interface {p0, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 100
    .line 101
    return-object p0

    .line 102
    :catchall_1
    move-exception p1

    .line 103
    :goto_2
    move-object p0, v2

    .line 104
    goto :goto_3

    .line 105
    :catchall_2
    move-exception p0

    .line 106
    move-object p1, p0

    .line 107
    goto :goto_2

    .line 108
    :goto_3
    invoke-interface {p0, v3}, Lkotlinx/coroutines/sync/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_4
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 113
    .line 114
    .line 115
    return-object v3

    .line 116
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iput-object p0, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$0:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object v3, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$1:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v3, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->L$2:Ljava/lang/Object;

    .line 124
    .line 125
    iput v4, v0, Lio/ktor/network/sockets/DatagramSendChannel$send$1;->label:I

    .line 126
    .line 127
    throw v3
.end method

.method public final 飘花落叶言子楪哲世兰苏(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪哲兰苏(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    throw p0
.end method

.method public final synthetic 飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V
    .locals 12

    .line 1
    sget-object v5, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;

    .line 2
    .line 3
    sget-object v0, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v6, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 9
    .line 10
    sget-wide v8, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:J

    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    move-object v7, p0

    .line 14
    move-object v11, p1

    .line 15
    invoke-virtual/range {v6 .. v11}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    move-object v1, v7

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-virtual {v6, v1, v8, v9}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_5

    .line 28
    .line 29
    iget-object p0, v1, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->onCloseHandler:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v4, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪哲兰世苏;

    .line 32
    .line 33
    if-ne p0, v4, :cond_3

    .line 34
    .line 35
    sget-object p0, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 36
    .line 37
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v0, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 41
    .line 42
    sget-wide v2, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰苏世:J

    .line 43
    .line 44
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    iget-object p0, v1, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->closedCause:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-interface {v11, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    invoke-virtual {v0, v1, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v4, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const-string p0, "Failed requirement."

    .line 64
    .line 65
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    iget-object p0, v1, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->onCloseHandler:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p0, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 72
    .line 73
    if-ne p0, v5, :cond_4

    .line 74
    .line 75
    const-string p0, "Another handler was already registered and successfully invoked"

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v0, "Another handler was already registered: "

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    :goto_2
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_5
    move-object p0, v1

    .line 97
    move-object p1, v11

    .line 98
    goto :goto_0
.end method

.method public final 飘花落叶言子楪苏哲兰世(Ljava/lang/Throwable;)Z
    .locals 2

    .line 1
    sget-object p1, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪苏哲兰世;->closedCause:Ljava/lang/Object;

    .line 14
    .line 15
    throw p1
.end method
