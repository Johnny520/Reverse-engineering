.class final Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1"
    f = "CIOReader.kt"
    l = {
        0x2a,
        0x2c,
        0x2a,
        0x2c,
        0x37
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $buffer:Ljava/nio/ByteBuffer;

.field final synthetic $channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

.field final synthetic $nioChannel:Ljava/nio/channels/ReadableByteChannel;

.field final synthetic $pool:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u54f2\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

.field final synthetic $selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

.field final synthetic $socketOptions:Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Ljava/nio/ByteBuffer;L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/network/sockets/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
            "Ljava/nio/ByteBuffer;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u696a\u54f2\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf;",
            "Ljava/nio/channels/ReadableByteChannel;",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    iput-object p3, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iput-object p4, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$buffer:Ljava/nio/ByteBuffer;

    .line 6
    .line 7
    iput-object p5, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$pool:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    iput-object p6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 10
    .line 11
    iput-object p7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "*>;)",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;

    .line 2
    .line 3
    iget-object v2, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget-object v3, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    iget-object v4, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$buffer:Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget-object v5, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$pool:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 10
    .line 11
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 12
    .line 13
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    move-object v8, p2

    .line 17
    invoke-direct/range {v0 .. v8}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;-><init>(Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Ljava/nio/ByteBuffer;L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, v0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 21
    .line 22
    return-object v0
.end method

.method public final invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u82cf\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 14
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->label:I

    .line 6
    .line 7
    const/4 v3, 0x5

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    if-eqz v2, :cond_8

    .line 12
    .line 13
    if-eq v2, v5, :cond_7

    .line 14
    .line 15
    if-eq v2, v4, :cond_6

    .line 16
    .line 17
    const/4 v7, 0x4

    .line 18
    const/4 v8, 0x3

    .line 19
    if-eq v2, v8, :cond_2

    .line 20
    .line 21
    if-eq v2, v7, :cond_1

    .line 22
    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    iget-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 28
    .line 29
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    move v12, v3

    .line 33
    goto/16 :goto_8

    .line 34
    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {v0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v6

    .line 44
    :cond_1
    iget-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$7:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 47
    .line 48
    iget-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v9, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 51
    .line 52
    iget-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v10, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 55
    .line 56
    iget-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v11, Ljava/nio/ByteBuffer;

    .line 59
    .line 60
    iget-object v12, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v12, Ljava/nio/channels/ReadableByteChannel;

    .line 63
    .line 64
    iget-object v13, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v13, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 67
    .line 68
    iget-object v14, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v14, Lkotlin/jvm/internal/Ref$IntRef;

    .line 71
    .line 72
    iget-object v15, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v15, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 75
    .line 76
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_1
    move-exception v0

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    iget-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$7:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 85
    .line 86
    iget-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v9, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 89
    .line 90
    iget-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v10, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 93
    .line 94
    iget-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v11, Ljava/nio/ByteBuffer;

    .line 97
    .line 98
    iget-object v12, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v12, Ljava/nio/channels/ReadableByteChannel;

    .line 101
    .line 102
    iget-object v13, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v13, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 105
    .line 106
    iget-object v14, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v14, Lkotlin/jvm/internal/Ref$IntRef;

    .line 109
    .line 110
    iget-object v15, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v15, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 113
    .line 114
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    sget-object v3, Lio/ktor/network/selector/SelectInterest;->READ:Lio/ktor/network/selector/SelectInterest;

    .line 118
    .line 119
    invoke-interface {v9, v3, v5}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 120
    .line 121
    .line 122
    iput-object v15, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v14, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v13, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v12, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 133
    .line 134
    iput-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 135
    .line 136
    iput-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$7:Ljava/lang/Object;

    .line 137
    .line 138
    iput v7, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->label:I

    .line 139
    .line 140
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 141
    .line 142
    invoke-virtual {v2, v9, v3, v1}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-ne v3, v0, :cond_4

    .line 147
    .line 148
    goto/16 :goto_7

    .line 149
    .line 150
    :cond_4
    :goto_0
    iget v3, v14, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 151
    .line 152
    if-eqz v3, :cond_5

    .line 153
    .line 154
    :try_start_3
    invoke-virtual {v13}, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 155
    .line 156
    .line 157
    move-object v2, v15

    .line 158
    goto/16 :goto_5

    .line 159
    .line 160
    :cond_5
    :try_start_4
    invoke-interface {v12, v11}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    iput v3, v14, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 165
    .line 166
    if-nez v3, :cond_4

    .line 167
    .line 168
    iput-object v15, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v14, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v13, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v12, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$7:Ljava/lang/Object;

    .line 183
    .line 184
    iput v8, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->label:I

    .line 185
    .line 186
    invoke-virtual {v10, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 190
    if-ne v3, v0, :cond_3

    .line 191
    .line 192
    goto/16 :goto_7

    .line 193
    .line 194
    :goto_1
    :try_start_5
    invoke-virtual {v13}, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 195
    .line 196
    .line 197
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 198
    :cond_6
    iget-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 201
    .line 202
    iget-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v3, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 205
    .line 206
    iget-object v7, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v7, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 209
    .line 210
    iget-object v8, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 213
    .line 214
    iget-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v9, Ljava/nio/channels/ReadableByteChannel;

    .line 217
    .line 218
    iget-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v10, Lkotlin/jvm/internal/Ref$IntRef;

    .line 221
    .line 222
    iget-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast v11, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 225
    .line 226
    :try_start_6
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 227
    .line 228
    .line 229
    goto/16 :goto_4

    .line 230
    .line 231
    :cond_7
    iget-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 234
    .line 235
    iget-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v3, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 238
    .line 239
    iget-object v7, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v7, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 242
    .line 243
    iget-object v8, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v8, Ljava/nio/ByteBuffer;

    .line 246
    .line 247
    iget-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v9, Ljava/nio/channels/ReadableByteChannel;

    .line 250
    .line 251
    iget-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v10, Lkotlin/jvm/internal/Ref$IntRef;

    .line 254
    .line 255
    iget-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v11, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 258
    .line 259
    :try_start_7
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 260
    .line 261
    .line 262
    goto :goto_3

    .line 263
    :cond_8
    invoke-static/range {p1 .. p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    iget-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v2, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 269
    .line 270
    move-object v2, v6

    .line 271
    :goto_2
    :try_start_8
    new-instance v3, Lkotlin/jvm/internal/Ref$IntRef;

    .line 272
    .line 273
    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 274
    .line 275
    .line 276
    iget-object v7, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 277
    .line 278
    iget-object v8, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$buffer:Ljava/nio/ByteBuffer;

    .line 279
    .line 280
    iget-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 281
    .line 282
    iget-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 283
    .line 284
    iget-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 285
    .line 286
    :cond_9
    invoke-interface {v7, v8}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 287
    .line 288
    .line 289
    move-result v12

    .line 290
    iput v12, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 291
    .line 292
    if-nez v12, :cond_c

    .line 293
    .line 294
    iput-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 295
    .line 296
    iput-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 297
    .line 298
    iput-object v7, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 299
    .line 300
    iput-object v8, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 301
    .line 302
    iput-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 303
    .line 304
    iput-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 305
    .line 306
    iput-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 307
    .line 308
    iput v5, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->label:I

    .line 309
    .line 310
    invoke-virtual {v9, v1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v12

    .line 314
    if-ne v12, v0, :cond_a

    .line 315
    .line 316
    goto/16 :goto_7

    .line 317
    .line 318
    :cond_a
    move-object/from16 v16, v11

    .line 319
    .line 320
    move-object v11, v2

    .line 321
    move-object/from16 v2, v16

    .line 322
    .line 323
    move-object/from16 v16, v10

    .line 324
    .line 325
    move-object v10, v3

    .line 326
    move-object/from16 v3, v16

    .line 327
    .line 328
    move-object/from16 v16, v9

    .line 329
    .line 330
    move-object v9, v7

    .line 331
    move-object/from16 v7, v16

    .line 332
    .line 333
    :goto_3
    sget-object v12, Lio/ktor/network/selector/SelectInterest;->READ:Lio/ktor/network/selector/SelectInterest;

    .line 334
    .line 335
    invoke-interface {v3, v12, v5}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 336
    .line 337
    .line 338
    iput-object v11, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v10, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 341
    .line 342
    iput-object v9, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 343
    .line 344
    iput-object v8, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v7, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 347
    .line 348
    iput-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 349
    .line 350
    iput-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 351
    .line 352
    iput v4, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->label:I

    .line 353
    .line 354
    check-cast v2, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 355
    .line 356
    invoke-virtual {v2, v3, v12, v1}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    if-ne v12, v0, :cond_b

    .line 361
    .line 362
    goto/16 :goto_7

    .line 363
    .line 364
    :cond_b
    :goto_4
    move-object/from16 v16, v11

    .line 365
    .line 366
    move-object v11, v2

    .line 367
    move-object/from16 v2, v16

    .line 368
    .line 369
    move-object/from16 v16, v10

    .line 370
    .line 371
    move-object v10, v3

    .line 372
    move-object/from16 v3, v16

    .line 373
    .line 374
    move-object/from16 v16, v9

    .line 375
    .line 376
    move-object v9, v7

    .line 377
    move-object/from16 v7, v16

    .line 378
    .line 379
    :cond_c
    iget v12, v3, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 380
    .line 381
    if-eqz v12, :cond_9

    .line 382
    .line 383
    move-object v14, v3

    .line 384
    :goto_5
    iget v3, v14, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 385
    .line 386
    const/4 v7, -0x1

    .line 387
    if-ne v3, v7, :cond_f

    .line 388
    .line 389
    iget-object v0, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 390
    .line 391
    invoke-virtual {v0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 392
    .line 393
    .line 394
    iget-object v0, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$pool:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 395
    .line 396
    iget-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$buffer:Ljava/nio/ByteBuffer;

    .line 397
    .line 398
    invoke-interface {v0, v2}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    iget-object v0, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 402
    .line 403
    instance-of v1, v0, Ljava/nio/channels/SocketChannel;

    .line 404
    .line 405
    if-eqz v1, :cond_e

    .line 406
    .line 407
    :try_start_9
    sget-boolean v1, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 408
    .line 409
    if-eqz v1, :cond_d

    .line 410
    .line 411
    check-cast v0, Ljava/nio/channels/SocketChannel;

    .line 412
    .line 413
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->shutdownInput()Ljava/nio/channels/SocketChannel;

    .line 414
    .line 415
    .line 416
    goto :goto_6

    .line 417
    :cond_d
    check-cast v0, Ljava/nio/channels/SocketChannel;

    .line 418
    .line 419
    invoke-virtual {v0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-virtual {v0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_9
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_9 .. :try_end_9} :catch_0

    .line 424
    .line 425
    .line 426
    :catch_0
    :cond_e
    :goto_6
    sget-object v0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 427
    .line 428
    return-object v0

    .line 429
    :cond_f
    :try_start_a
    iget-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 430
    .line 431
    sget-object v7, Lio/ktor/network/selector/SelectInterest;->READ:Lio/ktor/network/selector/SelectInterest;

    .line 432
    .line 433
    const/4 v8, 0x0

    .line 434
    invoke-interface {v3, v7, v8}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 435
    .line 436
    .line 437
    iget-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$buffer:Ljava/nio/ByteBuffer;

    .line 438
    .line 439
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 440
    .line 441
    .line 442
    iget-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 443
    .line 444
    iget-object v7, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$buffer:Ljava/nio/ByteBuffer;

    .line 445
    .line 446
    iput-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$0:Ljava/lang/Object;

    .line 447
    .line 448
    iput-object v6, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$1:Ljava/lang/Object;

    .line 449
    .line 450
    iput-object v6, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$2:Ljava/lang/Object;

    .line 451
    .line 452
    iput-object v6, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$3:Ljava/lang/Object;

    .line 453
    .line 454
    iput-object v6, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$4:Ljava/lang/Object;

    .line 455
    .line 456
    iput-object v6, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$5:Ljava/lang/Object;

    .line 457
    .line 458
    iput-object v6, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$6:Ljava/lang/Object;

    .line 459
    .line 460
    iput-object v6, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->L$7:Ljava/lang/Object;

    .line 461
    .line 462
    const/4 v12, 0x5

    .line 463
    iput v12, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->label:I

    .line 464
    .line 465
    invoke-static {v3, v7, v1}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子世楪兰哲苏(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/ByteBuffer;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v3

    .line 469
    if-ne v3, v0, :cond_10

    .line 470
    .line 471
    :goto_7
    return-object v0

    .line 472
    :cond_10
    :goto_8
    iget-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$buffer:Ljava/nio/ByteBuffer;

    .line 473
    .line 474
    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 475
    .line 476
    .line 477
    goto/16 :goto_2

    .line 478
    .line 479
    :goto_9
    iget-object v2, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$pool:L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;

    .line 480
    .line 481
    iget-object v3, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$buffer:Ljava/nio/ByteBuffer;

    .line 482
    .line 483
    invoke-interface {v2, v3}, L飘花落叶言世子楪哲兰苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子世兰哲苏楪(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    iget-object v1, v1, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 487
    .line 488
    instance-of v2, v1, Ljava/nio/channels/SocketChannel;

    .line 489
    .line 490
    if-eqz v2, :cond_12

    .line 491
    .line 492
    :try_start_b
    sget-boolean v2, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 493
    .line 494
    if-eqz v2, :cond_11

    .line 495
    .line 496
    check-cast v1, Ljava/nio/channels/SocketChannel;

    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->shutdownInput()Ljava/nio/channels/SocketChannel;

    .line 499
    .line 500
    .line 501
    goto :goto_a

    .line 502
    :cond_11
    check-cast v1, Ljava/nio/channels/SocketChannel;

    .line 503
    .line 504
    invoke-virtual {v1}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 505
    .line 506
    .line 507
    move-result-object v1

    .line 508
    invoke-virtual {v1}, Ljava/net/Socket;->shutdownInput()V
    :try_end_b
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_b .. :try_end_b} :catch_1

    .line 509
    .line 510
    .line 511
    :catch_1
    :cond_12
    :goto_a
    throw v0
.end method
