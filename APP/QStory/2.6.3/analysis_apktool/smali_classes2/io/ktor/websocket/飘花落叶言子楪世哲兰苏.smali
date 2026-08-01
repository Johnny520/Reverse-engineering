.class public final Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lio/ktor/websocket/飘花落叶言子楪世哲苏兰;
.implements Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;


# static fields
.field public static final synthetic 飘花落叶言子世楪苏兰哲:J

.field public static final synthetic 飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic 飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic 飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic closed:I

.field volatile synthetic pinger:Ljava/lang/Object;

.field private volatile synthetic started:I

.field public final 飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

.field public final 飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

.field public final 飘花落叶言子楪兰苏哲世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

.field public final 飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [B

    .line 5
    .line 6
    sget-object v2, Lio/ktor/websocket/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子楪哲苏兰世;

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;-><init>([BLkotlinx/coroutines/飘花落叶言子世哲苏楪兰;)V

    .line 9
    .line 10
    .line 11
    const-class v0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    const-class v1, Ljava/lang/Object;

    .line 14
    .line 15
    const-string v2, "pinger"

    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 22
    .line 23
    sget-object v1, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    sput-wide v1, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 34
    .line 35
    const-string v1, "closed"

    .line 36
    .line 37
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sput-object v1, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 42
    .line 43
    const-string v1, "started"

    .line 44
    .line 45
    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>(Lio/ktor/server/websocket/飘花落叶言子楪世兰苏哲;J)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 8
    .line 9
    const/4 p2, 0x0

    .line 10
    iput-object p2, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->pinger:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲()Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    iput-object p3, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 17
    .line 18
    const/16 p3, 0x8

    .line 19
    .line 20
    const/4 v0, 0x6

    .line 21
    invoke-static {p3, v0, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 26
    .line 27
    const-string v1, "io.ktor.websocket.outgoingChannelCapacity"

    .line 28
    .line 29
    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    :cond_0
    invoke-static {p3, v0, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iput-object p2, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    iput p2, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->closed:I

    .line 47
    .line 48
    invoke-interface {p1}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/飘花落叶言子苏世楪哲兰;

    .line 53
    .line 54
    invoke-interface {p3, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->get(Lkotlin/coroutines/飘花落叶言子楪苏世哲兰;)Lkotlin/coroutines/飘花落叶言子楪世兰哲苏;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    check-cast p3, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 59
    .line 60
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 61
    .line 62
    invoke-direct {v0, p3}, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;-><init>(Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 66
    .line 67
    new-instance p3, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p3, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 73
    .line 74
    iput p2, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->started:I

    .line 75
    .line 76
    invoke-interface {p1}, Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;->飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p1, v0}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    new-instance p2, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 85
    .line 86
    const-string p3, "ws-default"

    .line 87
    .line 88
    invoke-direct {p2, p3}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, p2}, Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏哲世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 96
    .line 97
    return-void
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;

    .line 10
    .line 11
    iget v1, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->label:I

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    and-int v3, v1, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    sub-int/2addr v1, v2

    .line 20
    iput v1, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p1}, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;-><init>(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v2, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->label:I

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    if-eq v2, v5, :cond_4

    .line 41
    .line 42
    if-eq v2, v4, :cond_3

    .line 43
    .line 44
    if-ne v2, v3, :cond_2

    .line 45
    .line 46
    iget-object p0, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 49
    .line 50
    iget-object v2, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;

    .line 53
    .line 54
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_1
    move-object v10, v2

    .line 58
    move-object v2, p0

    .line 59
    move-object p0, v10

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v6

    .line 67
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_4
    iget-object p0, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$1:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲兰世;

    .line 75
    .line 76
    iget-object v2, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;

    .line 79
    .line 80
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v2, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 93
    .line 94
    invoke-direct {v2, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    iput-object p0, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$0:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object v2, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$1:Ljava/lang/Object;

    .line 100
    .line 101
    iput v5, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->label:I

    .line 102
    .line 103
    move-object p1, v2

    .line 104
    check-cast p1, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 105
    .line 106
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-ne v2, v1, :cond_6

    .line 111
    .line 112
    goto/16 :goto_3

    .line 113
    .line 114
    :cond_6
    move-object v10, v2

    .line 115
    move-object v2, p0

    .line 116
    move-object p0, p1

    .line 117
    move-object p1, v10

    .line 118
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-eqz p1, :cond_c

    .line 125
    .line 126
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;

    .line 127
    .line 128
    invoke-virtual {p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    check-cast p1, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 133
    .line 134
    sget-object v7, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 135
    .line 136
    invoke-static {v7}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世哲苏楪兰(L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-eqz v8, :cond_7

    .line 141
    .line 142
    new-instance v8, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v9, "Sending "

    .line 145
    .line 146
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string v9, " from session "

    .line 153
    .line 154
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    invoke-interface {v7, v8}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_7
    instance-of v7, p1, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 168
    .line 169
    if-eqz v7, :cond_8

    .line 170
    .line 171
    check-cast p1, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 172
    .line 173
    invoke-static {p1}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲兰苏(Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;)Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    iput-object v6, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$0:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v6, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$1:Ljava/lang/Object;

    .line 180
    .line 181
    iput v4, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->label:I

    .line 182
    .line 183
    invoke-virtual {v2, p0, v6, v0}, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏(Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;Ljava/io/IOException;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    if-ne p0, v1, :cond_c

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_8
    instance-of v7, p1, Lio/ktor/websocket/飘花落叶言子楪苏兰世哲;

    .line 191
    .line 192
    if-nez v7, :cond_9

    .line 193
    .line 194
    instance-of v7, p1, Lio/ktor/websocket/飘花落叶言子楪世兰哲苏;

    .line 195
    .line 196
    if-eqz v7, :cond_a

    .line 197
    .line 198
    :cond_9
    iget-object v7, v2, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v8

    .line 208
    if-nez v8, :cond_b

    .line 209
    .line 210
    :cond_a
    iget-object v7, v2, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 211
    .line 212
    invoke-interface {v7}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子世苏楪哲兰()Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    iput-object v2, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$0:Ljava/lang/Object;

    .line 217
    .line 218
    iput-object p0, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->L$1:Ljava/lang/Object;

    .line 219
    .line 220
    iput v3, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$outgoingProcessorLoop$1;->label:I

    .line 221
    .line 222
    invoke-interface {v7, p1, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    if-ne p1, v1, :cond_1

    .line 227
    .line 228
    :goto_3
    return-object v1

    .line 229
    :cond_b
    invoke-static {v7}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲世兰苏(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    throw p0

    .line 234
    :cond_c
    :goto_4
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 235
    .line 236
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lkotlinx/io/飘花落叶言子楪苏哲兰世;Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    instance-of v1, p3, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p3

    .line 8
    check-cast v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p3}, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;-><init>(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p3, v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 30
    .line 31
    iget v3, v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;->label:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    if-eq v3, v4, :cond_1

    .line 37
    .line 38
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_1
    iget p0, v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;->I$0:I

    .line 46
    .line 47
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p2, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:[B

    .line 55
    .line 56
    array-length p2, p2

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    check-cast p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    iget-wide v5, p1, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 62
    .line 63
    long-to-int p1, v5

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/4 p1, 0x0

    .line 66
    :goto_1
    add-int/2addr p1, p2

    .line 67
    int-to-long p2, p1

    .line 68
    invoke-interface {v0}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子苏楪哲兰世()J

    .line 69
    .line 70
    .line 71
    move-result-wide v5

    .line 72
    cmp-long p2, p2, v5

    .line 73
    .line 74
    if-lez p2, :cond_5

    .line 75
    .line 76
    new-instance p2, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 77
    .line 78
    sget-object p3, Lio/ktor/websocket/CloseReason$Codes;->TOO_BIG:Lio/ktor/websocket/CloseReason$Codes;

    .line 79
    .line 80
    const-string v3, "Frame is too big: "

    .line 81
    .line 82
    const-string v5, ". Max size is "

    .line 83
    .line 84
    invoke-static {p1, v3, v5}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲苏世(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-interface {v0}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子苏楪哲兰世()J

    .line 89
    .line 90
    .line 91
    move-result-wide v5

    .line 92
    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {p2, p3, v0}, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput p1, v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;->I$0:I

    .line 103
    .line 104
    iput v4, v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$checkMaxFrameSize$1;->label:I

    .line 105
    .line 106
    invoke-static {p0, p2, v1}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏哲兰(Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-ne p0, v2, :cond_4

    .line 111
    .line 112
    return-object v2

    .line 113
    :cond_4
    move p0, p1

    .line 114
    :goto_2
    new-instance p1, Lio/ktor/websocket/FrameTooBigException;

    .line 115
    .line 116
    int-to-long p2, p0

    .line 117
    invoke-direct {p1, p2, p3}, Lio/ktor/websocket/FrameTooBigException;-><init>(J)V

    .line 118
    .line 119
    .line 120
    throw p1

    .line 121
    :cond_5
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 122
    .line 123
    return-object p0
.end method


# virtual methods
.method public final 飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏哲世:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子世苏楪哲兰()Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰哲苏(Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;Ljava/io/IOException;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->label:I

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
    iput v1, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;-><init>(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->label:I

    .line 30
    .line 31
    sget-object v3, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    iget-object p1, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    move-object p2, p1

    .line 46
    check-cast p2, Ljava/lang/Throwable;

    .line 47
    .line 48
    iget-object p1, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;

    .line 51
    .line 52
    :try_start_0
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    move-object v7, p1

    .line 56
    move-object p1, p0

    .line 57
    move-object p0, v7

    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :catchall_0
    move-exception p3

    .line 61
    move-object v7, p1

    .line 62
    move-object p1, p0

    .line 63
    move-object p0, v7

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    return-object p0

    .line 73
    :cond_2
    invoke-static {p3}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sget-object p3, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲苏世:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 77
    .line 78
    invoke-virtual {p3, p0, v5, v4}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 79
    .line 80
    .line 81
    move-result p3

    .line 82
    if-nez p3, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    sget-object p3, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 86
    .line 87
    invoke-static {p3}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世哲苏楪兰(L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    const-string v6, "Sending Close Sequence for session "

    .line 96
    .line 97
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v6, " with reason "

    .line 104
    .line 105
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v6, " and exception "

    .line 112
    .line 113
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-interface {p3, v2}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    iget-object p3, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 127
    .line 128
    invoke-virtual {p3}, Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世楪苏兰()Z

    .line 129
    .line 130
    .line 131
    if-nez p1, :cond_5

    .line 132
    .line 133
    new-instance p1, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 134
    .line 135
    sget-object p3, Lio/ktor/websocket/CloseReason$Codes;->NORMAL:Lio/ktor/websocket/CloseReason$Codes;

    .line 136
    .line 137
    const-string v2, ""

    .line 138
    .line 139
    invoke-direct {p1, p3, v2}, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    :try_start_1
    invoke-virtual {p0}, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲()V

    .line 143
    .line 144
    .line 145
    iget-short p3, p1, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:S

    .line 146
    .line 147
    sget-object v2, Lio/ktor/websocket/CloseReason$Codes;->CLOSED_ABNORMALLY:Lio/ktor/websocket/CloseReason$Codes;

    .line 148
    .line 149
    invoke-virtual {v2}, Lio/ktor/websocket/CloseReason$Codes;->getCode()S

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eq p3, v2, :cond_6

    .line 154
    .line 155
    iget-object p3, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 156
    .line 157
    invoke-interface {p3}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子世苏楪哲兰()Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 158
    .line 159
    .line 160
    move-result-object p3

    .line 161
    new-instance v2, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 162
    .line 163
    invoke-direct {v2, p1}, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;-><init>(Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;)V

    .line 164
    .line 165
    .line 166
    iput-object p0, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->L$0:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object p2, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->L$1:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object p1, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->L$2:Ljava/lang/Object;

    .line 171
    .line 172
    iput v4, v0, Lio/ktor/websocket/DefaultWebSocketSessionImpl$sendCloseSequence$1;->label:I

    .line 173
    .line 174
    invoke-interface {p3, v2, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 178
    if-ne p3, v1, :cond_6

    .line 179
    .line 180
    return-object v1

    .line 181
    :catchall_1
    move-exception p3

    .line 182
    goto :goto_3

    .line 183
    :cond_6
    :goto_1
    iget-object p3, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 184
    .line 185
    invoke-virtual {p3, p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏哲楪世兰(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    if-eqz p2, :cond_7

    .line 189
    .line 190
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 191
    .line 192
    invoke-virtual {p1, p2, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z

    .line 193
    .line 194
    .line 195
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 196
    .line 197
    invoke-virtual {p0, p2, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z

    .line 198
    .line 199
    .line 200
    :cond_7
    :goto_2
    return-object v3

    .line 201
    :goto_3
    iget-object v0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子楪哲兰世苏;

    .line 202
    .line 203
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子苏哲楪世兰(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    if-eqz p2, :cond_8

    .line 207
    .line 208
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 209
    .line 210
    invoke-virtual {p1, p2, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z

    .line 211
    .line 212
    .line 213
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 214
    .line 215
    invoke-virtual {p0, p2, v5}, Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Throwable;Z)Z

    .line 216
    .line 217
    .line 218
    :cond_8
    throw p3
.end method

.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 4

    .line 1
    sget-object v0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰哲世苏:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, L飘花落叶言楪子哲兰世苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Lsun/misc/Unsafe;

    .line 7
    .line 8
    sget-wide v1, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲:J

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-virtual {v0, p0, v1, v2, v3}, Lsun/misc/Unsafe;->getAndSetObject(Ljava/lang/Object;JLjava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, v3}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰世苏哲(Ljava/lang/Throwable;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪兰苏世哲(Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子世苏楪哲兰()Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1, p2}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 10
    .line 11
    sget-object p2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 12
    .line 13
    if-ne p0, p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p0, p2

    .line 17
    :goto_0
    if-ne p0, p1, :cond_1

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    return-object p2
.end method

.method public final 飘花落叶言子楪哲苏世兰()Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏世哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰苏世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏世兰哲(Ljava/util/List;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏哲兰:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 4
    .line 5
    invoke-virtual {v2, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    sget-object v0, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子世哲苏楪兰(L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Starting default WebSocketSession("

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, ") with negotiated extensions: "

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/4 v7, 0x0

    .line 35
    const/16 v8, 0x3f

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    move-object v3, p1

    .line 41
    invoke-static/range {v3 .. v8}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子哲兰楪苏世(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {v0, p1}, L飘花落叶言苏楪子哲世兰/飘花落叶言子楪世苏兰哲;->trace(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object v3, p1

    .line 57
    :goto_0
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰苏世哲:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲()V

    .line 63
    .line 64
    .line 65
    sget-object p1, Lio/ktor/websocket/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 66
    .line 67
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const/4 v0, 0x5

    .line 73
    const/4 v1, 0x6

    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, Lio/ktor/websocket/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 80
    .line 81
    new-instance v3, Lio/ktor/websocket/PingPongKt$ponger$1;

    .line 82
    .line 83
    invoke-direct {v3, v0, p1, v2}, Lio/ktor/websocket/PingPongKt$ponger$1;-><init>(Lkotlinx/coroutines/channels/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x2

    .line 87
    invoke-static {p0, v1, v2, v3, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 88
    .line 89
    .line 90
    sget-object v1, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 91
    .line 92
    sget-object v3, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子哲世苏楪兰;

    .line 93
    .line 94
    invoke-virtual {v1, v3}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    new-instance v4, Lio/ktor/websocket/DefaultWebSocketSessionImpl$runIncomingProcessor$1;

    .line 99
    .line 100
    invoke-direct {v4, p0, v0, v2}, Lio/ktor/websocket/DefaultWebSocketSessionImpl$runIncomingProcessor$1;-><init>(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 101
    .line 102
    .line 103
    invoke-static {p0, v1, v2, v4, p1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 104
    .line 105
    .line 106
    sget-object p1, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 107
    .line 108
    invoke-virtual {p1, v3}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    sget-object v0, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    .line 113
    .line 114
    new-instance v1, Lio/ktor/websocket/DefaultWebSocketSessionImpl$runOutgoingProcessor$1;

    .line 115
    .line 116
    invoke-direct {v1, p0, v2}, Lio/ktor/websocket/DefaultWebSocketSessionImpl$runOutgoingProcessor$1;-><init>(Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p0, p1, v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏兰哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_1
    const-string p1, "WebSocket session "

    .line 124
    .line 125
    const-string v0, " is already started."

    .line 126
    .line 127
    invoke-static {p0, p1, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏兰哲世(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    return-object p0
.end method

.method public final 飘花落叶言子苏楪哲兰世()J
    .locals 2

    .line 1
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 2
    .line 3
    invoke-interface {p0}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子苏楪哲兰世()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
