.class final Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

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
    c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1"
    f = "CIOReader.kt"
    l = {
        0x61,
        0x6a,
        0x6d,
        0x6e,
        0x61,
        0x6a,
        0x6d,
        0x6e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

.field final synthetic $nioChannel:Ljava/nio/channels/ReadableByteChannel;

.field final synthetic $selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

.field final synthetic $selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

.field final synthetic $socketOptions:Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;",
            "Lio/ktor/network/sockets/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u4e16\u54f2;",
            "Lio/ktor/utils/io/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2;",
            "Ljava/nio/channels/ReadableByteChannel;",
            "Lio/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u4e16\u54f2;",
            "Lkotlin/coroutines/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170<",
            "-",
            "Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 2
    .line 3
    iput-object p3, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iput-object p4, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 6
    .line 7
    iput-object p5, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

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
    new-instance v0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iget-object v3, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    iget-object v4, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 8
    .line 9
    iget-object v5, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    move-object v6, p2

    .line 13
    invoke-direct/range {v0 .. v6}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;-><init>(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/sockets/飘花落叶言子楪兰苏世哲;Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;Ljava/nio/channels/ReadableByteChannel;Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 17
    .line 18
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
    invoke-virtual {p0, p1, p2}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->create(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;

    .line 6
    .line 7
    sget-object p1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->invoke(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->label:I

    .line 4
    .line 5
    sget-object v2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, -0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v5

    .line 19
    :pswitch_0
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$5:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 22
    .line 23
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 26
    .line 27
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v7, Ljava/nio/channels/ReadableByteChannel;

    .line 30
    .line 31
    iget-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 34
    .line 35
    iget-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v9, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 38
    .line 39
    iget-object v10, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v10, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 42
    .line 43
    :try_start_0
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :pswitch_1
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$5:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 54
    .line 55
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v6, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 58
    .line 59
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Ljava/nio/channels/ReadableByteChannel;

    .line 62
    .line 63
    iget-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 66
    .line 67
    iget-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v9, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 70
    .line 71
    iget-object v10, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v10, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 74
    .line 75
    :try_start_1
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :pswitch_2
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$5:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 83
    .line 84
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v6, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 87
    .line 88
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, Ljava/nio/channels/ReadableByteChannel;

    .line 91
    .line 92
    iget-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 95
    .line 96
    iget-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v9, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 99
    .line 100
    iget-object v10, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v10, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 103
    .line 104
    :try_start_2
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :pswitch_3
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$5:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 111
    .line 112
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v6, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 115
    .line 116
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v7, Ljava/nio/channels/ReadableByteChannel;

    .line 119
    .line 120
    iget-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 123
    .line 124
    iget-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v9, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 127
    .line 128
    iget-object v10, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v10, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 131
    .line 132
    :try_start_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    check-cast p1, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-ne p1, v4, :cond_0

    .line 142
    .line 143
    invoke-virtual {v8}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_0
    if-gtz p1, :cond_5

    .line 148
    .line 149
    iput-object v10, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 150
    .line 151
    iput-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$5:Ljava/lang/Object;

    .line 160
    .line 161
    const/4 p1, 0x6

    .line 162
    iput p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->label:I

    .line 163
    .line 164
    invoke-virtual {v8, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    if-ne p1, v0, :cond_1

    .line 169
    .line 170
    goto/16 :goto_b

    .line 171
    .line 172
    :cond_1
    :goto_0
    iput-object v10, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$5:Ljava/lang/Object;

    .line 183
    .line 184
    const/4 p1, 0x7

    .line 185
    iput p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->label:I

    .line 186
    .line 187
    sget-object p1, Lio/ktor/network/selector/SelectInterest;->READ:Lio/ktor/network/selector/SelectInterest;

    .line 188
    .line 189
    invoke-interface {v6, p1, v3}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪兰苏(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 190
    .line 191
    .line 192
    move-object v11, v1

    .line 193
    check-cast v11, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 194
    .line 195
    invoke-virtual {v11, v6, p1, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    sget-object v11, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 200
    .line 201
    if-ne p1, v11, :cond_2

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_2
    move-object p1, v2

    .line 205
    :goto_1
    if-ne p1, v0, :cond_3

    .line 206
    .line 207
    goto/16 :goto_b

    .line 208
    .line 209
    :cond_3
    :goto_2
    iput-object v10, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 210
    .line 211
    iput-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 214
    .line 215
    iput-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 216
    .line 217
    iput-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$5:Ljava/lang/Object;

    .line 220
    .line 221
    const/16 p1, 0x8

    .line 222
    .line 223
    iput p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->label:I

    .line 224
    .line 225
    invoke-static {v8, v7, p0}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/channels/ReadableByteChannel;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    if-ne p1, v0, :cond_4

    .line 230
    .line 231
    goto/16 :goto_b

    .line 232
    .line 233
    :cond_4
    :goto_3
    check-cast p1, Ljava/lang/Number;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 239
    if-eqz p1, :cond_1

    .line 240
    .line 241
    :cond_5
    :goto_4
    :try_start_4
    invoke-virtual {v9}, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 242
    .line 243
    .line 244
    goto/16 :goto_6

    .line 245
    .line 246
    :catchall_1
    move-exception p1

    .line 247
    goto/16 :goto_f

    .line 248
    .line 249
    :goto_5
    invoke-virtual {v9}, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 250
    .line 251
    .line 252
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 253
    :pswitch_4
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 256
    .line 257
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v6, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 260
    .line 261
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v7, Ljava/nio/channels/ReadableByteChannel;

    .line 264
    .line 265
    iget-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 268
    .line 269
    iget-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v9, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 272
    .line 273
    :try_start_5
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 274
    .line 275
    .line 276
    goto/16 :goto_c

    .line 277
    .line 278
    :pswitch_5
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 281
    .line 282
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v6, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 285
    .line 286
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v7, Ljava/nio/channels/ReadableByteChannel;

    .line 289
    .line 290
    iget-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 293
    .line 294
    iget-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v9, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 297
    .line 298
    :try_start_6
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 299
    .line 300
    .line 301
    goto/16 :goto_a

    .line 302
    .line 303
    :pswitch_6
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 306
    .line 307
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v6, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 310
    .line 311
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v7, Ljava/nio/channels/ReadableByteChannel;

    .line 314
    .line 315
    iget-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 318
    .line 319
    iget-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v9, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 322
    .line 323
    :try_start_7
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 324
    .line 325
    .line 326
    goto/16 :goto_8

    .line 327
    .line 328
    :pswitch_7
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 331
    .line 332
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v6, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 335
    .line 336
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v7, Ljava/nio/channels/ReadableByteChannel;

    .line 339
    .line 340
    iget-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v8, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 343
    .line 344
    iget-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v9, Lio/ktor/network/util/飘花落叶言子楪世苏兰哲;

    .line 347
    .line 348
    :try_start_8
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 349
    .line 350
    .line 351
    goto :goto_7

    .line 352
    :pswitch_8
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    iget-object p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast p1, Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;

    .line 358
    .line 359
    :try_start_9
    iget-object p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 360
    .line 361
    sget-object v1, Lio/ktor/network/selector/SelectInterest;->READ:Lio/ktor/network/selector/SelectInterest;

    .line 362
    .line 363
    const/4 v6, 0x0

    .line 364
    invoke-interface {p1, v1, v6}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪兰苏(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 365
    .line 366
    .line 367
    move-object v10, v5

    .line 368
    :goto_6
    iget-object p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 369
    .line 370
    invoke-virtual {p1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏兰哲世()Z

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    if-nez p1, :cond_d

    .line 375
    .line 376
    iget-object p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 377
    .line 378
    iget-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 379
    .line 380
    iget-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$selectable:Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;

    .line 381
    .line 382
    iget-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$selector:Lio/ktor/network/selector/飘花落叶言子楪苏兰世哲;

    .line 383
    .line 384
    iput-object v10, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 387
    .line 388
    iput-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 389
    .line 390
    iput-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v5, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$5:Ljava/lang/Object;

    .line 395
    .line 396
    iput v3, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->label:I

    .line 397
    .line 398
    invoke-static {p1, v1, p0}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/channels/ReadableByteChannel;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    if-ne v8, v0, :cond_6

    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_6
    move-object v9, v8

    .line 406
    move-object v8, p1

    .line 407
    move-object p1, v9

    .line 408
    move-object v9, v7

    .line 409
    move-object v7, v1

    .line 410
    move-object v1, v9

    .line 411
    move-object v9, v10

    .line 412
    :goto_7
    check-cast p1, Ljava/lang/Number;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    if-ne p1, v4, :cond_7

    .line 419
    .line 420
    invoke-virtual {v8}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 421
    .line 422
    .line 423
    goto :goto_d

    .line 424
    :cond_7
    if-gtz p1, :cond_c

    .line 425
    .line 426
    iput-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 427
    .line 428
    iput-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 429
    .line 430
    iput-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 431
    .line 432
    iput-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 433
    .line 434
    iput-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 435
    .line 436
    const/4 p1, 0x2

    .line 437
    iput p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->label:I

    .line 438
    .line 439
    invoke-virtual {v8, p0}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object p1

    .line 443
    if-ne p1, v0, :cond_8

    .line 444
    .line 445
    goto :goto_b

    .line 446
    :cond_8
    :goto_8
    iput-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 447
    .line 448
    iput-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 449
    .line 450
    iput-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 451
    .line 452
    iput-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 453
    .line 454
    iput-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 455
    .line 456
    const/4 p1, 0x3

    .line 457
    iput p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->label:I

    .line 458
    .line 459
    sget-object p1, Lio/ktor/network/selector/SelectInterest;->READ:Lio/ktor/network/selector/SelectInterest;

    .line 460
    .line 461
    invoke-interface {v6, p1, v3}, Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;->飘花落叶言子世哲楪兰苏(Lio/ktor/network/selector/SelectInterest;Z)V

    .line 462
    .line 463
    .line 464
    move-object v10, v1

    .line 465
    check-cast v10, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;

    .line 466
    .line 467
    invoke-virtual {v10, v6, p1, p0}, Lio/ktor/network/selector/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲苏兰楪(Lio/ktor/network/selector/飘花落叶言子楪苏哲世兰;Lio/ktor/network/selector/SelectInterest;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    sget-object v10, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 472
    .line 473
    if-ne p1, v10, :cond_9

    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_9
    move-object p1, v2

    .line 477
    :goto_9
    if-ne p1, v0, :cond_a

    .line 478
    .line 479
    goto :goto_b

    .line 480
    :cond_a
    :goto_a
    iput-object v9, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$0:Ljava/lang/Object;

    .line 481
    .line 482
    iput-object v8, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$1:Ljava/lang/Object;

    .line 483
    .line 484
    iput-object v7, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$2:Ljava/lang/Object;

    .line 485
    .line 486
    iput-object v6, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$3:Ljava/lang/Object;

    .line 487
    .line 488
    iput-object v1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->L$4:Ljava/lang/Object;

    .line 489
    .line 490
    const/4 p1, 0x4

    .line 491
    iput p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->label:I

    .line 492
    .line 493
    invoke-static {v8, v7, p0}, Lio/ktor/network/sockets/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;Ljava/nio/channels/ReadableByteChannel;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    if-ne p1, v0, :cond_b

    .line 498
    .line 499
    :goto_b
    return-object v0

    .line 500
    :cond_b
    :goto_c
    check-cast p1, Ljava/lang/Number;

    .line 501
    .line 502
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 503
    .line 504
    .line 505
    move-result p1

    .line 506
    if-eqz p1, :cond_8

    .line 507
    .line 508
    :cond_c
    :goto_d
    move-object v10, v9

    .line 509
    goto/16 :goto_6

    .line 510
    .line 511
    :cond_d
    iget-object p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 512
    .line 513
    invoke-virtual {p1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲()Ljava/lang/Throwable;

    .line 514
    .line 515
    .line 516
    move-result-object p1

    .line 517
    if-nez p1, :cond_10

    .line 518
    .line 519
    iget-object p1, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$channel:Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;

    .line 520
    .line 521
    invoke-virtual {p1}, Lio/ktor/utils/io/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 522
    .line 523
    .line 524
    iget-object p0, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 525
    .line 526
    instance-of p1, p0, Ljava/nio/channels/SocketChannel;

    .line 527
    .line 528
    if-eqz p1, :cond_f

    .line 529
    .line 530
    :try_start_a
    sget-boolean p1, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 531
    .line 532
    if-eqz p1, :cond_e

    .line 533
    .line 534
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 535
    .line 536
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->shutdownInput()Ljava/nio/channels/SocketChannel;

    .line 537
    .line 538
    .line 539
    goto :goto_e

    .line 540
    :cond_e
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 541
    .line 542
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 543
    .line 544
    .line 545
    move-result-object p0

    .line 546
    invoke-virtual {p0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_a
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_a .. :try_end_a} :catch_0

    .line 547
    .line 548
    .line 549
    :catch_0
    :cond_f
    :goto_e
    return-object v2

    .line 550
    :cond_10
    :try_start_b
    throw p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 551
    :goto_f
    iget-object p0, p0, Lio/ktor/network/sockets/CIOReaderKt$attachForReadingDirectImpl$1;->$nioChannel:Ljava/nio/channels/ReadableByteChannel;

    .line 552
    .line 553
    instance-of v0, p0, Ljava/nio/channels/SocketChannel;

    .line 554
    .line 555
    if-eqz v0, :cond_12

    .line 556
    .line 557
    :try_start_c
    sget-boolean v0, Lio/ktor/network/sockets/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Z

    .line 558
    .line 559
    if-eqz v0, :cond_11

    .line 560
    .line 561
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 562
    .line 563
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->shutdownInput()Ljava/nio/channels/SocketChannel;

    .line 564
    .line 565
    .line 566
    goto :goto_10

    .line 567
    :cond_11
    check-cast p0, Ljava/nio/channels/SocketChannel;

    .line 568
    .line 569
    invoke-virtual {p0}, Ljava/nio/channels/SocketChannel;->socket()Ljava/net/Socket;

    .line 570
    .line 571
    .line 572
    move-result-object p0

    .line 573
    invoke-virtual {p0}, Ljava/net/Socket;->shutdownInput()V
    :try_end_c
    .catch Ljava/nio/channels/ClosedChannelException; {:try_start_c .. :try_end_c} :catch_1

    .line 574
    .line 575
    .line 576
    :catch_1
    :cond_12
    :goto_10
    throw p1

    .line 577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
