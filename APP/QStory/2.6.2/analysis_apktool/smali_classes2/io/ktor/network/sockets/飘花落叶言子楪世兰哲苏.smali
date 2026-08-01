.class public abstract Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

.field public static final 飘花落叶言子楪世苏哲兰:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 9
    .line 10
    new-instance v0, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 11
    .line 12
    invoke-direct {v0, v1}, Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Lcom/materialkolor/dynamiccolor/飘花落叶言子楪兰苏世哲;

    .line 16
    .line 17
    return-void
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Ljava/net/SocketAddress;)Lio/ktor/network/sockets/飘花落叶言子楪哲兰苏世;
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/net/InetSocketAddress;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    check-cast p0, Ljava/net/InetSocketAddress;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lio/ktor/network/sockets/飘花落叶言子楪苏兰哲世;-><init>(Ljava/net/InetSocketAddress;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "java.net.UnixDomainSocketAddress"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    new-instance v0, Lio/ktor/network/sockets/飘花落叶言子楪兰苏哲世;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Lio/ktor/network/sockets/飘花落叶言子楪兰苏哲世;-><init>(Ljava/net/SocketAddress;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    const-string p0, "Unknown socket address type"

    .line 36
    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;->label:I

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
    iput v1, v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;->label:I

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
    iget-object p0, v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;->L$0:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, Lio/ktor/network/sockets/飘花落叶言子楪世哲兰苏;

    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世苏哲:Lkotlinx/coroutines/飘花落叶言子苏世哲楪兰;

    .line 55
    .line 56
    iput-object p0, v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    iput v3, v0, Lio/ktor/network/sockets/SocketsKt$awaitClosed$1;->label:I

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Lkotlinx/coroutines/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪兰世苏哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v1, :cond_3

    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    invoke-interface {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-interface {p1}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->isCancelled()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_4
    invoke-interface {p0}, Lio/ktor/network/sockets/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲楪苏()Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-interface {p0}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪兰哲苏世()Ljava/util/concurrent/CancellationException;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    throw p0
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/channels/ReadableByteChannel;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;->label:I

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
    iput v1, v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;-><init>(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;->label:I

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
    iget-object p0, v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;->L$0:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_3

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
    invoke-static {p2}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    new-instance p2, Lkotlin/jvm/internal/Ref$IntRef;

    .line 56
    .line 57
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p2, v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    iput v4, v0, Lio/ktor/network/sockets/CIOReaderKt$readFrom$1;->label:I

    .line 63
    .line 64
    check-cast p0, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 65
    .line 66
    invoke-virtual {p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰世哲()Lkotlinx/io/飘花落叶言子楪世苏哲兰;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v4}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(I)Lkotlinx/io/飘花落叶言子楪苏世兰哲;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-object v6, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:[B

    .line 78
    .line 79
    iget v7, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 80
    .line 81
    array-length v8, v6

    .line 82
    sub-int/2addr v8, v7

    .line 83
    invoke-static {v6, v7, v8}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-interface {p1, v6}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    iput p1, p2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 95
    .line 96
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    sub-int/2addr p1, v7

    .line 101
    if-ne p1, v4, :cond_3

    .line 102
    .line 103
    iget v3, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 104
    .line 105
    add-int/2addr v3, p1

    .line 106
    iput v3, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 107
    .line 108
    iget-wide v3, v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 109
    .line 110
    int-to-long v5, p1

    .line 111
    add-long/2addr v3, v5

    .line 112
    iput-wide v3, v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_3
    if-ltz p1, :cond_8

    .line 116
    .line 117
    invoke-virtual {v5}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-gt p1, v4, :cond_8

    .line 122
    .line 123
    if-eqz p1, :cond_4

    .line 124
    .line 125
    iget v3, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 126
    .line 127
    add-int/2addr v3, p1

    .line 128
    iput v3, v5, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:I

    .line 129
    .line 130
    iget-wide v3, v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 131
    .line 132
    int-to-long v5, p1

    .line 133
    add-long/2addr v3, v5

    .line 134
    iput-wide v3, v2, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    invoke-static {v5}, Lkotlinx/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世哲兰(Lkotlinx/io/飘花落叶言子楪苏世兰哲;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_5

    .line 142
    .line 143
    invoke-virtual {v2}, Lkotlinx/io/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 144
    .line 145
    .line 146
    :cond_5
    :goto_1
    invoke-virtual {p0, v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    if-ne p0, v1, :cond_6

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 154
    .line 155
    :goto_2
    if-ne p0, v1, :cond_7

    .line 156
    .line 157
    return-object v1

    .line 158
    :cond_7
    move-object p0, p2

    .line 159
    :goto_3
    iget p0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 160
    .line 161
    new-instance p1, Ljava/lang/Integer;

    .line 162
    .line 163
    invoke-direct {p1, p0}, Ljava/lang/Integer;-><init>(I)V

    .line 164
    .line 165
    .line 166
    return-object p1

    .line 167
    :cond_8
    const-string p0, "Invalid number of bytes written: "

    .line 168
    .line 169
    const-string p2, ". Should be in 0.."

    .line 170
    .line 171
    invoke-static {p1, p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {v5}, Lkotlinx/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰()I

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    invoke-static {p0, p1}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰苏哲世(Ljava/lang/StringBuilder;I)V

    .line 180
    .line 181
    .line 182
    return-object v3
.end method
