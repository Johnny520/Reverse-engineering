.class public final Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;

.field public 飘花落叶言子楪兰世苏哲:Lio/ktor/websocket/WebSocketReader$State;

.field public final 飘花落叶言子楪兰苏世哲:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

.field public final 飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

.field public final 飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪哲兰苏世:J

.field public final 飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;JL飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 11
    .line 12
    iput-object p2, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 13
    .line 14
    iput-wide p3, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰苏世:J

    .line 15
    .line 16
    sget-object p1, Lio/ktor/websocket/WebSocketReader$State;->HEADER:Lio/ktor/websocket/WebSocketReader$State;

    .line 17
    .line 18
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:Lio/ktor/websocket/WebSocketReader$State;

    .line 19
    .line 20
    new-instance p1, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;

    .line 21
    .line 22
    invoke-direct {p1}, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世哲苏:Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;

    .line 26
    .line 27
    new-instance p1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 28
    .line 29
    const/4 p2, 0x5

    .line 30
    const/4 p3, 0x0

    .line 31
    invoke-direct {p1, p3, p2}, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;-><init>(BI)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 35
    .line 36
    const/4 p1, 0x6

    .line 37
    const/16 p2, 0x8

    .line 38
    .line 39
    const/4 p3, 0x0

    .line 40
    invoke-static {p2, p1, p3}, Lkotlinx/coroutines/channels/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰(IILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 45
    .line 46
    new-instance p1, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 47
    .line 48
    const-string p2, "ws-reader"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget-object p2, Lkotlinx/coroutines/CoroutineStart;->ATOMIC:Lkotlinx/coroutines/CoroutineStart;

    .line 54
    .line 55
    new-instance p4, Lio/ktor/websocket/WebSocketReader$readerJob$1;

    .line 56
    .line 57
    invoke-direct {p4, p5, p0, p3}, Lio/ktor/websocket/WebSocketReader$readerJob$1;-><init>(L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, p1, p2, p4}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏兰哲(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p2, Lio/ktor/websocket/WebSocketReader$readLoop$1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;

    .line 10
    .line 11
    iget v1, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->label:I

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
    iput v1, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->label:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;

    .line 24
    .line 25
    invoke-direct {v0, p0, p2}, Lio/ktor/websocket/WebSocketReader$readLoop$1;-><init>(Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p2, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->result:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 31
    .line 32
    iget v2, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->label:I

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v4, :cond_3

    .line 39
    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    iget-object p0, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 45
    .line 46
    iget-object p1, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;

    .line 49
    .line 50
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    move-object v5, p1

    .line 54
    move-object p1, p0

    .line 55
    move-object p0, v5

    .line 56
    goto :goto_4

    .line 57
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :cond_3
    iget-object p0, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->L$1:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Ljava/nio/ByteBuffer;

    .line 67
    .line 68
    iget-object p1, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;

    .line 71
    .line 72
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 80
    .line 81
    .line 82
    :goto_1
    iget-object p2, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:Lio/ktor/websocket/WebSocketReader$State;

    .line 83
    .line 84
    sget-object v2, Lio/ktor/websocket/WebSocketReader$State;->CLOSED:Lio/ktor/websocket/WebSocketReader$State;

    .line 85
    .line 86
    if-eq p2, v2, :cond_7

    .line 87
    .line 88
    iget-object p2, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏兰世:Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 89
    .line 90
    iput-object p0, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->L$0:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object p1, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->L$1:Ljava/lang/Object;

    .line 93
    .line 94
    iput v4, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->label:I

    .line 95
    .line 96
    invoke-static {p2, p1, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲世苏兰(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    if-ne p2, v1, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    move-object v5, p1

    .line 104
    move-object p1, p0

    .line 105
    move-object p0, v5

    .line 106
    :goto_2
    check-cast p2, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    const/4 v2, -0x1

    .line 113
    if-ne p2, v2, :cond_6

    .line 114
    .line 115
    sget-object p0, Lio/ktor/websocket/WebSocketReader$State;->CLOSED:Lio/ktor/websocket/WebSocketReader$State;

    .line 116
    .line 117
    iput-object p0, p1, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:Lio/ktor/websocket/WebSocketReader$State;

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_6
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 121
    .line 122
    .line 123
    iput-object p1, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->L$0:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object p0, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->L$1:Ljava/lang/Object;

    .line 126
    .line 127
    iput v3, v0, Lio/ktor/websocket/WebSocketReader$readLoop$1;->label:I

    .line 128
    .line 129
    invoke-virtual {p1, p0, v0}, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    if-ne p2, v1, :cond_1

    .line 134
    .line 135
    :goto_3
    return-object v1

    .line 136
    :goto_4
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_7
    :goto_5
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 141
    .line 142
    return-object p0
.end method


# virtual methods
.method public final 飘花落叶言子世哲苏楪兰()Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰世苏:Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    instance-of v1, v0, Lio/ktor/websocket/WebSocketReader$parseLoop$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;

    .line 9
    .line 10
    iget v2, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->label:I

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
    iput v2, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->label:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lio/ktor/websocket/WebSocketReader$parseLoop$1;-><init>(Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 34
    .line 35
    iget v4, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->label:I

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v7, :cond_1

    .line 43
    .line 44
    if-ne v4, v6, :cond_2

    .line 45
    .line 46
    :cond_1
    iget-object v2, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    iget-object v4, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v2

    .line 58
    move-object v2, v4

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v5

    .line 66
    :cond_3
    invoke-static {v0}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object/from16 v0, p1

    .line 70
    .line 71
    :cond_4
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2b

    .line 76
    .line 77
    iget-object v4, v2, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:Lio/ktor/websocket/WebSocketReader$State;

    .line 78
    .line 79
    iget-object v8, v2, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 80
    .line 81
    iget-object v9, v2, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世哲苏:Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;

    .line 82
    .line 83
    sget-object v10, Lio/ktor/websocket/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:[I

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    aget v4, v10, v4

    .line 90
    .line 91
    const/4 v10, 0x3

    .line 92
    if-eq v4, v7, :cond_7

    .line 93
    .line 94
    if-eq v4, v6, :cond_6

    .line 95
    .line 96
    if-ne v4, v10, :cond_5

    .line 97
    .line 98
    goto/16 :goto_13

    .line 99
    .line 100
    :cond_5
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 101
    .line 102
    .line 103
    return-object v5

    .line 104
    :cond_6
    iget v4, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 105
    .line 106
    iget-object v9, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 109
    .line 110
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget v10, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 114
    .line 115
    invoke-static {v0, v9, v10}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    sub-int/2addr v4, v9

    .line 120
    iput v4, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 121
    .line 122
    iput-object v2, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v0, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->L$1:Ljava/lang/Object;

    .line 125
    .line 126
    iput v6, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->label:I

    .line 127
    .line 128
    invoke-virtual {v2, v1}, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    if-ne v4, v3, :cond_4

    .line 133
    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :cond_7
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v4, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    sget-object v12, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 146
    .line 147
    invoke-static {v11, v12}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    if-eqz v11, :cond_2a

    .line 152
    .line 153
    :goto_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    check-cast v11, Lio/ktor/websocket/FrameParser$State;

    .line 161
    .line 162
    sget-object v12, Lio/ktor/websocket/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:[I

    .line 163
    .line 164
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 165
    .line 166
    .line 167
    move-result v11

    .line 168
    aget v11, v12, v11

    .line 169
    .line 170
    const/16 v12, 0x8

    .line 171
    .line 172
    if-eq v11, v7, :cond_10

    .line 173
    .line 174
    if-eq v11, v6, :cond_b

    .line 175
    .line 176
    const/4 v12, 0x4

    .line 177
    if-eq v11, v10, :cond_9

    .line 178
    .line 179
    if-ne v11, v12, :cond_8

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_8
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 183
    .line 184
    .line 185
    return-object v5

    .line 186
    :cond_9
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 187
    .line 188
    .line 189
    move-result v11

    .line 190
    if-ge v11, v12, :cond_a

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_a
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 194
    .line 195
    .line 196
    move-result v11

    .line 197
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    iput-object v11, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰世哲:Ljava/lang/Integer;

    .line 202
    .line 203
    sget-object v11, Lio/ktor/websocket/FrameParser$State;->BODY:Lio/ktor/websocket/FrameParser$State;

    .line 204
    .line 205
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_b
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    iget v13, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 214
    .line 215
    if-ge v11, v13, :cond_c

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_c
    if-eq v13, v6, :cond_e

    .line 219
    .line 220
    if-ne v13, v12, :cond_d

    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 223
    .line 224
    .line 225
    move-result-wide v11

    .line 226
    goto :goto_3

    .line 227
    :cond_d
    invoke-static {}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 228
    .line 229
    .line 230
    return-object v5

    .line 231
    :cond_e
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 232
    .line 233
    .line 234
    move-result v11

    .line 235
    int-to-long v11, v11

    .line 236
    const-wide/32 v13, 0xffff

    .line 237
    .line 238
    .line 239
    and-long/2addr v11, v13

    .line 240
    :goto_3
    iput-wide v11, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世:J

    .line 241
    .line 242
    iget-boolean v11, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:Z

    .line 243
    .line 244
    if-eqz v11, :cond_f

    .line 245
    .line 246
    sget-object v11, Lio/ktor/websocket/FrameParser$State;->MASK_KEY:Lio/ktor/websocket/FrameParser$State;

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_f
    sget-object v11, Lio/ktor/websocket/FrameParser$State;->BODY:Lio/ktor/websocket/FrameParser$State;

    .line 250
    .line 251
    :goto_4
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_10
    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    .line 256
    .line 257
    .line 258
    move-result v11

    .line 259
    if-ge v11, v6, :cond_15

    .line 260
    .line 261
    :goto_5
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    sget-object v10, Lio/ktor/websocket/FrameParser$State;->BODY:Lio/ktor/websocket/FrameParser$State;

    .line 266
    .line 267
    if-ne v4, v10, :cond_2b

    .line 268
    .line 269
    sget-object v4, Lio/ktor/websocket/WebSocketReader$State;->BODY:Lio/ktor/websocket/WebSocketReader$State;

    .line 270
    .line 271
    iput-object v4, v2, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:Lio/ktor/websocket/WebSocketReader$State;

    .line 272
    .line 273
    iget-wide v10, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世:J

    .line 274
    .line 275
    const-wide/32 v12, 0x7fffffff

    .line 276
    .line 277
    .line 278
    cmp-long v4, v10, v12

    .line 279
    .line 280
    if-gtz v4, :cond_14

    .line 281
    .line 282
    iget-wide v12, v2, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲兰苏世:J

    .line 283
    .line 284
    cmp-long v4, v10, v12

    .line 285
    .line 286
    if-gtz v4, :cond_14

    .line 287
    .line 288
    long-to-int v4, v10

    .line 289
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    iget v9, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 293
    .line 294
    if-nez v9, :cond_13

    .line 295
    .line 296
    iput v4, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 297
    .line 298
    iget-object v9, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 301
    .line 302
    if-eqz v9, :cond_11

    .line 303
    .line 304
    invoke-virtual {v9}, Ljava/nio/Buffer;->capacity()I

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    if-ge v9, v4, :cond_12

    .line 309
    .line 310
    :cond_11
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    iput-object v4, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 315
    .line 316
    :cond_12
    iget-object v4, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast v4, Ljava/nio/ByteBuffer;

    .line 319
    .line 320
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 324
    .line 325
    .line 326
    iget v4, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 327
    .line 328
    iget-object v9, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 331
    .line 332
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    iget v10, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 336
    .line 337
    invoke-static {v0, v9, v10}, Lio/ktor/util/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲兰世(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)I

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    sub-int/2addr v4, v9

    .line 342
    iput v4, v8, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 343
    .line 344
    iput-object v2, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->L$0:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v0, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->L$1:Ljava/lang/Object;

    .line 347
    .line 348
    iput v7, v1, Lio/ktor/websocket/WebSocketReader$parseLoop$1;->label:I

    .line 349
    .line 350
    invoke-virtual {v2, v1}, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲兰苏(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v4

    .line 354
    if-ne v4, v3, :cond_4

    .line 355
    .line 356
    :goto_6
    return-object v3

    .line 357
    :cond_13
    const-string v0, "remaining should be 0"

    .line 358
    .line 359
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    return-object v5

    .line 363
    :cond_14
    new-instance v0, Lio/ktor/websocket/FrameTooBigException;

    .line 364
    .line 365
    iget-wide v1, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世:J

    .line 366
    .line 367
    invoke-direct {v0, v1, v2}, Lio/ktor/websocket/FrameTooBigException;-><init>(J)V

    .line 368
    .line 369
    .line 370
    throw v0

    .line 371
    :cond_15
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 372
    .line 373
    .line 374
    move-result v11

    .line 375
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    .line 376
    .line 377
    .line 378
    move-result v13

    .line 379
    and-int/lit16 v14, v11, 0x80

    .line 380
    .line 381
    const/4 v15, 0x0

    .line 382
    if-eqz v14, :cond_16

    .line 383
    .line 384
    move v14, v7

    .line 385
    goto :goto_7

    .line 386
    :cond_16
    move v14, v15

    .line 387
    :goto_7
    iput-boolean v14, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 388
    .line 389
    and-int/lit8 v14, v11, 0x40

    .line 390
    .line 391
    if-eqz v14, :cond_17

    .line 392
    .line 393
    move v14, v7

    .line 394
    goto :goto_8

    .line 395
    :cond_17
    move v14, v15

    .line 396
    :goto_8
    iput-boolean v14, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Z

    .line 397
    .line 398
    and-int/lit8 v14, v11, 0x20

    .line 399
    .line 400
    if-eqz v14, :cond_18

    .line 401
    .line 402
    move v14, v7

    .line 403
    goto :goto_9

    .line 404
    :cond_18
    move v14, v15

    .line 405
    :goto_9
    iput-boolean v14, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 406
    .line 407
    and-int/lit8 v14, v11, 0x10

    .line 408
    .line 409
    if-eqz v14, :cond_19

    .line 410
    .line 411
    move v14, v7

    .line 412
    goto :goto_a

    .line 413
    :cond_19
    move v14, v15

    .line 414
    :goto_a
    iput-boolean v14, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Z

    .line 415
    .line 416
    and-int/lit8 v11, v11, 0xf

    .line 417
    .line 418
    iput v11, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 419
    .line 420
    if-nez v11, :cond_1b

    .line 421
    .line 422
    iget v14, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲:I

    .line 423
    .line 424
    if-eqz v14, :cond_1a

    .line 425
    .line 426
    goto :goto_b

    .line 427
    :cond_1a
    new-instance v0, Lio/ktor/websocket/ProtocolViolationException;

    .line 428
    .line 429
    const-string v1, "Can\'t continue finished frames"

    .line 430
    .line 431
    invoke-direct {v0, v1}, Lio/ktor/websocket/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    throw v0

    .line 435
    :cond_1b
    :goto_b
    iget v14, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲:I

    .line 436
    .line 437
    if-nez v11, :cond_1c

    .line 438
    .line 439
    iput v14, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 440
    .line 441
    goto :goto_c

    .line 442
    :cond_1c
    if-eqz v14, :cond_1e

    .line 443
    .line 444
    invoke-virtual {v9}, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()Lio/ktor/websocket/FrameType;

    .line 445
    .line 446
    .line 447
    move-result-object v11

    .line 448
    invoke-virtual {v11}, Lio/ktor/websocket/FrameType;->getControlFrame()Z

    .line 449
    .line 450
    .line 451
    move-result v11

    .line 452
    if-eqz v11, :cond_1d

    .line 453
    .line 454
    goto :goto_c

    .line 455
    :cond_1d
    new-instance v0, Lio/ktor/websocket/ProtocolViolationException;

    .line 456
    .line 457
    const-string v1, "Can\'t start new data frame before finishing previous one"

    .line 458
    .line 459
    invoke-direct {v0, v1}, Lio/ktor/websocket/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v0

    .line 463
    :cond_1e
    :goto_c
    invoke-virtual {v9}, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()Lio/ktor/websocket/FrameType;

    .line 464
    .line 465
    .line 466
    move-result-object v11

    .line 467
    invoke-virtual {v11}, Lio/ktor/websocket/FrameType;->getControlFrame()Z

    .line 468
    .line 469
    .line 470
    move-result v11

    .line 471
    iget-boolean v14, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 472
    .line 473
    if-nez v11, :cond_20

    .line 474
    .line 475
    if-eqz v14, :cond_1f

    .line 476
    .line 477
    move v11, v15

    .line 478
    goto :goto_d

    .line 479
    :cond_1f
    iget v11, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 480
    .line 481
    :goto_d
    iput v11, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世兰哲:I

    .line 482
    .line 483
    goto :goto_e

    .line 484
    :cond_20
    if-eqz v14, :cond_29

    .line 485
    .line 486
    :goto_e
    and-int/lit16 v11, v13, 0x80

    .line 487
    .line 488
    if-eqz v11, :cond_21

    .line 489
    .line 490
    move v11, v7

    .line 491
    goto :goto_f

    .line 492
    :cond_21
    move v11, v15

    .line 493
    :goto_f
    iput-boolean v11, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:Z

    .line 494
    .line 495
    and-int/lit8 v11, v13, 0x7f

    .line 496
    .line 497
    invoke-virtual {v9}, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()Lio/ktor/websocket/FrameType;

    .line 498
    .line 499
    .line 500
    move-result-object v13

    .line 501
    invoke-virtual {v13}, Lio/ktor/websocket/FrameType;->getControlFrame()Z

    .line 502
    .line 503
    .line 504
    move-result v13

    .line 505
    if-eqz v13, :cond_23

    .line 506
    .line 507
    const/16 v13, 0x7d

    .line 508
    .line 509
    if-gt v11, v13, :cond_22

    .line 510
    .line 511
    goto :goto_10

    .line 512
    :cond_22
    new-instance v0, Lio/ktor/websocket/ProtocolViolationException;

    .line 513
    .line 514
    const-string v1, "control frames can\'t be larger than 125 bytes"

    .line 515
    .line 516
    invoke-direct {v0, v1}, Lio/ktor/websocket/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    throw v0

    .line 520
    :cond_23
    :goto_10
    const/16 v13, 0x7e

    .line 521
    .line 522
    if-eq v11, v13, :cond_24

    .line 523
    .line 524
    const/16 v13, 0x7f

    .line 525
    .line 526
    if-eq v11, v13, :cond_25

    .line 527
    .line 528
    move v12, v15

    .line 529
    goto :goto_11

    .line 530
    :cond_24
    move v12, v6

    .line 531
    :cond_25
    :goto_11
    iput v12, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 532
    .line 533
    if-nez v12, :cond_26

    .line 534
    .line 535
    int-to-long v13, v11

    .line 536
    goto :goto_12

    .line 537
    :cond_26
    const-wide/16 v13, 0x0

    .line 538
    .line 539
    :goto_12
    iput-wide v13, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世:J

    .line 540
    .line 541
    if-lez v12, :cond_27

    .line 542
    .line 543
    sget-object v11, Lio/ktor/websocket/FrameParser$State;->LENGTH:Lio/ktor/websocket/FrameParser$State;

    .line 544
    .line 545
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    goto/16 :goto_2

    .line 549
    .line 550
    :cond_27
    iget-boolean v11, v9, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰哲苏:Z

    .line 551
    .line 552
    if-eqz v11, :cond_28

    .line 553
    .line 554
    sget-object v11, Lio/ktor/websocket/FrameParser$State;->MASK_KEY:Lio/ktor/websocket/FrameParser$State;

    .line 555
    .line 556
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 557
    .line 558
    .line 559
    goto/16 :goto_2

    .line 560
    .line 561
    :cond_28
    sget-object v11, Lio/ktor/websocket/FrameParser$State;->BODY:Lio/ktor/websocket/FrameParser$State;

    .line 562
    .line 563
    invoke-virtual {v4, v11}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 564
    .line 565
    .line 566
    goto/16 :goto_2

    .line 567
    .line 568
    :cond_29
    new-instance v0, Lio/ktor/websocket/ProtocolViolationException;

    .line 569
    .line 570
    const-string v1, "control frames can\'t be fragmented"

    .line 571
    .line 572
    invoke-direct {v0, v1}, Lio/ktor/websocket/ProtocolViolationException;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v0

    .line 576
    :cond_2a
    const-string v1, "Buffer order should be BIG_ENDIAN but it is "

    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-static {v0, v1}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    return-object v5

    .line 586
    :cond_2b
    :goto_13
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 587
    .line 588
    return-object v0
.end method

.method public final 飘花落叶言子楪世哲兰苏(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;->label:I

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
    iput v1, v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;-><init>(Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;->label:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v3

    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏世哲:Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;

    .line 56
    .line 57
    iget v2, p1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:I

    .line 58
    .line 59
    if-lez v2, :cond_3

    .line 60
    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_3
    iget-object v2, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世哲苏:Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;

    .line 64
    .line 65
    invoke-virtual {v2}, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()Lio/ktor/websocket/FrameType;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    sget-object v6, Lio/ktor/websocket/FrameType;->CLOSE:Lio/ktor/websocket/FrameType;

    .line 70
    .line 71
    if-ne v5, v6, :cond_4

    .line 72
    .line 73
    sget-object v5, Lio/ktor/websocket/WebSocketReader$State;->CLOSED:Lio/ktor/websocket/WebSocketReader$State;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    sget-object v5, Lio/ktor/websocket/WebSocketReader$State;->HEADER:Lio/ktor/websocket/WebSocketReader$State;

    .line 77
    .line 78
    :goto_1
    iput-object v5, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世苏哲:Lio/ktor/websocket/WebSocketReader$State;

    .line 79
    .line 80
    iget-boolean v7, v2, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 81
    .line 82
    invoke-virtual {v2}, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰()Lio/ktor/websocket/FrameType;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    iget-object v6, v2, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰世哲:Ljava/lang/Integer;

    .line 87
    .line 88
    iget-object v8, p1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 91
    .line 92
    iget-object v9, p1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v9, Ljava/nio/ByteBuffer;

    .line 95
    .line 96
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    if-eqz v6, :cond_5

    .line 107
    .line 108
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {v10, v6}, Ljava/nio/IntBuffer;->put(I)Ljava/nio/IntBuffer;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-static {v9, v8}, Lio/ktor/websocket/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V

    .line 129
    .line 130
    .line 131
    :cond_5
    iput-object v3, p1, Landroidx/appcompat/widget/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    new-array v9, v6, [B

    .line 145
    .line 146
    invoke-virtual {p1, v9}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 147
    .line 148
    .line 149
    iget-boolean v10, v2, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲苏兰:Z

    .line 150
    .line 151
    iget-boolean v11, v2, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世哲兰苏:Z

    .line 152
    .line 153
    iget-boolean v12, v2, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世兰苏哲:Z

    .line 154
    .line 155
    sget-object p1, Lio/ktor/websocket/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[I

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    aget p1, p1, v2

    .line 162
    .line 163
    if-eq p1, v4, :cond_a

    .line 164
    .line 165
    const/4 v2, 0x2

    .line 166
    if-eq p1, v2, :cond_9

    .line 167
    .line 168
    const/4 v2, 0x3

    .line 169
    if-eq p1, v2, :cond_8

    .line 170
    .line 171
    const/4 v2, 0x4

    .line 172
    if-eq p1, v2, :cond_7

    .line 173
    .line 174
    const/4 v2, 0x5

    .line 175
    if-ne p1, v2, :cond_6

    .line 176
    .line 177
    new-instance p1, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;

    .line 178
    .line 179
    sget-object v2, Lio/ktor/websocket/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世:Lio/ktor/websocket/飘花落叶言子楪哲苏兰世;

    .line 180
    .line 181
    invoke-direct {p1, v9, v2}, Lio/ktor/websocket/飘花落叶言子楪苏哲兰世;-><init>([BLkotlinx/coroutines/飘花落叶言子世哲苏楪兰;)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_6
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 186
    .line 187
    .line 188
    return-object v3

    .line 189
    :cond_7
    new-instance p1, Lio/ktor/websocket/飘花落叶言子楪苏哲世兰;

    .line 190
    .line 191
    invoke-direct {p1, v9}, Lio/ktor/websocket/飘花落叶言子楪苏哲世兰;-><init>([B)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_8
    new-instance p1, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;

    .line 196
    .line 197
    invoke-direct {p1, v9}, Lio/ktor/websocket/飘花落叶言子楪苏世哲兰;-><init>([B)V

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_9
    new-instance v6, Lio/ktor/websocket/飘花落叶言子楪苏兰世哲;

    .line 202
    .line 203
    sget-object v8, Lio/ktor/websocket/FrameType;->TEXT:Lio/ktor/websocket/FrameType;

    .line 204
    .line 205
    invoke-direct/range {v6 .. v12}, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;-><init>(ZLio/ktor/websocket/FrameType;[BZZZ)V

    .line 206
    .line 207
    .line 208
    :goto_2
    move-object p1, v6

    .line 209
    goto :goto_3

    .line 210
    :cond_a
    new-instance v6, Lio/ktor/websocket/飘花落叶言子楪世兰哲苏;

    .line 211
    .line 212
    sget-object v8, Lio/ktor/websocket/FrameType;->BINARY:Lio/ktor/websocket/FrameType;

    .line 213
    .line 214
    invoke-direct/range {v6 .. v12}, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;-><init>(ZLio/ktor/websocket/FrameType;[BZZZ)V

    .line 215
    .line 216
    .line 217
    goto :goto_2

    .line 218
    :goto_3
    iput-object p0, v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;->L$0:Ljava/lang/Object;

    .line 219
    .line 220
    iput v4, v0, Lio/ktor/websocket/WebSocketReader$handleFrameIfProduced$1;->label:I

    .line 221
    .line 222
    iget-object v2, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏哲世:Lkotlinx/coroutines/channels/飘花落叶言子楪世兰苏哲;

    .line 223
    .line 224
    invoke-interface {v2, p1, v0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    if-ne p1, v1, :cond_b

    .line 229
    .line 230
    return-object v1

    .line 231
    :cond_b
    :goto_4
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰世哲苏:Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;

    .line 232
    .line 233
    iget-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 234
    .line 235
    sget-object v0, Lio/ktor/websocket/FrameParser$State;->BODY:Lio/ktor/websocket/FrameParser$State;

    .line 236
    .line 237
    sget-object v1, Lio/ktor/websocket/FrameParser$State;->HEADER0:Lio/ktor/websocket/FrameParser$State;

    .line 238
    .line 239
    :goto_5
    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-eqz v2, :cond_c

    .line 244
    .line 245
    const/4 p1, 0x0

    .line 246
    iput p1, p0, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 247
    .line 248
    const-wide/16 v0, 0x0

    .line 249
    .line 250
    iput-wide v0, p0, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世:J

    .line 251
    .line 252
    iput p1, p0, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲世兰:I

    .line 253
    .line 254
    iput-object v3, p0, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰世哲:Ljava/lang/Integer;

    .line 255
    .line 256
    :goto_6
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 257
    .line 258
    return-object p0

    .line 259
    :cond_c
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    if-ne v2, v0, :cond_d

    .line 264
    .line 265
    goto :goto_5

    .line 266
    :cond_d
    const-string p0, "It should be state BODY but it is "

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-static {p1, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-object v3
.end method
