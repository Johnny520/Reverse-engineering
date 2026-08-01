.class final Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;
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
        "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "<anonymous>",
        "(Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime L飘花落叶言世子苏楪兰哲/飘花落叶言子楪世哲苏兰;
    c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1"
    f = "CIOWriter.kt"
    l = {
        0x21,
        0x4f,
        0x32
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

.field final synthetic $nioChannel:Ljava/nio/channels/WritableByteChannel;

.field final synthetic $selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

.field final synthetic $selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

.field final synthetic $socketOptions:Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;

.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Ljava/nio/channels/WritableByteChannel;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
            "Lio/ktor/network/sockets/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Ljava/nio/channels/WritableByteChannel;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    iput-object p3, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iput-object p4, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 6
    .line 7
    iput-object p5, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$nioChannel:Ljava/nio/channels/WritableByteChannel;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;Lkotlin/jvm/internal/Ref$IntRef;Ljava/nio/channels/WritableByteChannel;Ljava/nio/ByteBuffer;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    :cond_0
    :goto_0
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    :cond_1
    invoke-interface {p2, p3}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    iput p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 20
    .line 21
    if-gtz p0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 25
    .line 26
    return-object p0
.end method

.method public static synthetic 飘花落叶言子楪世苏兰哲(Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;Lkotlin/jvm/internal/Ref$IntRef;Ljava/nio/channels/WritableByteChannel;Ljava/nio/ByteBuffer;)Lkotlin/飘花落叶言子楪兰苏哲世;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->invokeSuspend$lambda$1(Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;Lkotlin/jvm/internal/Ref$IntRef;Ljava/nio/channels/WritableByteChannel;Ljava/nio/ByteBuffer;)Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;
    .locals 7
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
    new-instance v0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iget-object v3, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    iget-object v4, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 8
    .line 9
    iget-object v5, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$nioChannel:Ljava/nio/channels/WritableByteChannel;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move-object v6, p2

    .line 13
    invoke-direct/range {v0 .. v6}, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Ljava/nio/channels/WritableByteChannel;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public final invoke(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u5170\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;

    check-cast p2, Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    invoke-virtual {p0, p1, p2}, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v5, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    :goto_0
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto/16 :goto_8

    .line 28
    .line 29
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v6

    .line 35
    :cond_1
    iget v1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->I$0:I

    .line 36
    .line 37
    iget-object v7, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v7, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 40
    .line 41
    iget-object v8, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;

    .line 44
    .line 45
    iget-object v9, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v9, Lkotlin/jvm/internal/Ref$IntRef;

    .line 48
    .line 49
    iget-object v10, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v10, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 52
    .line 53
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :cond_2
    iget-object v1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :goto_1
    move-object v10, v1

    .line 64
    goto :goto_2

    .line 65
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;

    .line 71
    .line 72
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 73
    .line 74
    sget-object v1, Lio/ktor/network/selector/SelectInterest;->WRITE:Lio/ktor/network/selector/SelectInterest;

    .line 75
    .line 76
    invoke-interface {p1, v1, v4}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 77
    .line 78
    .line 79
    move-object v10, v6

    .line 80
    :cond_4
    :goto_2
    :try_start_2
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 81
    .line 82
    invoke-virtual {p1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰苏哲()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_b

    .line 87
    .line 88
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 89
    .line 90
    invoke-static {p1}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-nez p1, :cond_5

    .line 95
    .line 96
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 97
    .line 98
    iput-object v10, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v6, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v6, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v6, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 105
    .line 106
    iput v5, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->label:I

    .line 107
    .line 108
    invoke-virtual {p1, v5, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v0, :cond_4

    .line 113
    .line 114
    goto/16 :goto_6

    .line 115
    .line 116
    :cond_5
    new-instance v9, Lkotlin/jvm/internal/Ref$IntRef;

    .line 117
    .line 118
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 119
    .line 120
    .line 121
    iget-object v8, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 122
    .line 123
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$nioChannel:Ljava/nio/channels/WritableByteChannel;

    .line 124
    .line 125
    new-instance v7, Lio/ktor/network/sockets/飘花落叶言子楪苏世哲兰;

    .line 126
    .line 127
    invoke-direct {v7, v10, v9, p1}, Lio/ktor/network/sockets/飘花落叶言子楪苏世哲兰;-><init>(Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;Lkotlin/jvm/internal/Ref$IntRef;Ljava/nio/channels/WritableByteChannel;)V

    .line 128
    .line 129
    .line 130
    invoke-static {v8}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-lez p1, :cond_6

    .line 135
    .line 136
    invoke-static {v8}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-lt p1, v5, :cond_6

    .line 141
    .line 142
    invoke-virtual {v8}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p1, v7}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 147
    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_6
    iput-object v10, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 151
    .line 152
    iput-object v9, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 153
    .line 154
    iput-object v8, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 155
    .line 156
    iput-object v7, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 157
    .line 158
    iput v5, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->I$0:I

    .line 159
    .line 160
    iput v3, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->label:I

    .line 161
    .line 162
    invoke-virtual {v8, v5, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ne p1, v0, :cond_7

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_7
    move v1, v5

    .line 170
    :goto_3
    invoke-interface {v8}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_9

    .line 175
    .line 176
    if-gtz v1, :cond_8

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_8
    new-instance p1, Ljava/io/EOFException;

    .line 180
    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const-string v2, "Not enough bytes available: required "

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string v1, " but "

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-static {v8}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const-string v1, " available"

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    throw p1

    .line 219
    :cond_9
    :goto_4
    invoke-static {v8}, Lio/ktor/utils/io/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏兰世哲(Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;)I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-lez p1, :cond_a

    .line 224
    .line 225
    invoke-interface {v8}, Lio/ktor/utils/io/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰()Lkotlinx/io/飘花落叶言子楪苏兰世哲;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    invoke-static {p1, v7}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Lkotlinx/io/飘花落叶言子楪苏兰世哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 230
    .line 231
    .line 232
    :cond_a
    :goto_5
    iget p1, v9, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 233
    .line 234
    if-nez p1, :cond_4

    .line 235
    .line 236
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 237
    .line 238
    sget-object v1, Lio/ktor/network/selector/SelectInterest;->WRITE:Lio/ktor/network/selector/SelectInterest;

    .line 239
    .line 240
    invoke-interface {p1, v1, v5}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 241
    .line 242
    .line 243
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 244
    .line 245
    iget-object v7, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 246
    .line 247
    iput-object v10, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 248
    .line 249
    iput-object v6, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 250
    .line 251
    iput-object v6, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v6, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 254
    .line 255
    iput v2, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->label:I

    .line 256
    .line 257
    check-cast p1, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 258
    .line 259
    invoke-virtual {p1, v7, v1, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 263
    if-ne p1, v0, :cond_4

    .line 264
    .line 265
    :goto_6
    return-object v0

    .line 266
    :cond_b
    iget-object p1, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 267
    .line 268
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->WRITE:Lio/ktor/network/selector/SelectInterest;

    .line 269
    .line 270
    invoke-interface {p1, v0, v4}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 271
    .line 272
    .line 273
    iget-object p0, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$nioChannel:Ljava/nio/channels/WritableByteChannel;

    .line 274
    .line 275
    instance-of p1, p0, Ljava/nio/channels/SocketChannel;

    .line 276
    .line 277
    if-eqz p1, :cond_d

    .line 278
    .line 279
    :try_start_3
    sget-boolean p1, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 280
    .line 281
    if-eqz p1, :cond_c

    .line 282
    .line 283
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 284
    .line 285
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->shutdownOutput()Ljava/nio/channels/SocketChannel;

    .line 286
    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_c
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 290
    .line 291
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-virtual {p0}, Ljava/net/Socket;->shutdownOutput()V
    :try_end_3
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_3 .. :try_end_3} :catch_0

    .line 296
    .line 297
    .line 298
    :catch_0
    :cond_d
    :goto_7
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 299
    .line 300
    return-object p0

    .line 301
    :goto_8
    iget-object v0, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 302
    .line 303
    sget-object v1, Lio/ktor/network/selector/SelectInterest;->WRITE:Lio/ktor/network/selector/SelectInterest;

    .line 304
    .line 305
    invoke-interface {v0, v1, v4}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲苏楪兰(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 306
    .line 307
    .line 308
    iget-object p0, p0, Lio/ktor/network/sockets/CIOWriterKt$attachForWritingDirectImpl$1;->$nioChannel:Ljava/nio/channels/WritableByteChannel;

    .line 309
    .line 310
    instance-of v0, p0, Ljava/nio/channels/SocketChannel;

    .line 311
    .line 312
    if-eqz v0, :cond_f

    .line 313
    .line 314
    :try_start_4
    sget-boolean v0, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 315
    .line 316
    if-eqz v0, :cond_e

    .line 317
    .line 318
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 319
    .line 320
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->shutdownOutput()Ljava/nio/channels/SocketChannel;

    .line 321
    .line 322
    .line 323
    goto :goto_9

    .line 324
    :cond_e
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 325
    .line 326
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 327
    .line 328
    .line 329
    move-result-object p0

    .line 330
    invoke-virtual {p0}, Ljava/net/Socket;->shutdownOutput()V
    :try_end_4
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_4 .. :try_end_4} :catch_1

    .line 331
    .line 332
    .line 333
    :catch_1
    :cond_f
    :goto_9
    throw p1
.end method
