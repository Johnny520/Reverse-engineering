.class public final synthetic Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;I)V
    .locals 0

    .line 1
    iput p3, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;

    .line 4
    .line 5
    iput-object p2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;

    .line 7
    .line 8
    iget-object v6, v2, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 9
    .line 10
    move-object v0, v2

    .line 11
    check-cast v0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 12
    .line 13
    iget-object v5, v0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 14
    .line 15
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 24
    .line 25
    new-instance v1, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 26
    .line 27
    const-string v3, "cio-from-nio-reader"

    .line 28
    .line 29
    invoke-direct {v1, v3}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;

    .line 37
    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    iget-object v4, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 41
    .line 42
    invoke-direct/range {v1 .. v7}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v0, v4, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏哲世兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lio/ktor/utils/io/飘花落叶言子世楪哲兰苏;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_0
    iget-object v1, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰世苏:Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;

    .line 51
    .line 52
    move-object v0, v1

    .line 53
    check-cast v0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;

    .line 54
    .line 55
    iget-object v5, v0, Lio/ktor/network/sockets/飘花落叶言子楪兰世苏哲;->飘花落叶言子世楪苏哲兰:Ljava/nio/channels/SocketChannel;

    .line 56
    .line 57
    iget-object v4, v1, Lio/ktor/network/sockets/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 58
    .line 59
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget-object v0, Lkotlinx/coroutines/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世兰苏哲;

    .line 66
    .line 67
    sget-object v0, L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世苏哲楪子兰/飘花落叶言子楪世哲兰苏;

    .line 68
    .line 69
    new-instance v2, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 70
    .line 71
    const-string v3, "cio-to-nio-writer"

    .line 72
    .line 73
    invoke-direct {v2, v3}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v2}, Lkotlin/coroutines/飘花落叶言子楪世苏哲兰;->plus(Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;)Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    new-instance v0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;

    .line 81
    .line 82
    const/4 v6, 0x0

    .line 83
    const/4 v2, 0x0

    .line 84
    iget-object v3, p0, Lio/ktor/network/sockets/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 85
    .line 86
    invoke-direct/range {v0 .. v6}, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Ljava/nio/channels/WritableByteChannel;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v7, v3, v0}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Lio/ktor/utils/io/飘花落叶言子世楪苏哲兰;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
