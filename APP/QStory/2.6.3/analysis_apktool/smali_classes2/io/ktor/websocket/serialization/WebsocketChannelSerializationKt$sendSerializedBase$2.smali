.class final Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;
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
    c = "io.ktor.websocket.serialization.WebsocketChannelSerializationKt"
    f = "WebsocketChannelSerialization.kt"
    l = {
        0x33,
        0x38
    }
    m = "sendSerializedBase"
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
            "Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;",
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
    .locals 5

    .line 1
    iput-object p1, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    if-eq v0, v3, :cond_1

    .line 19
    .line 20
    if-ne v0, v4, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v2

    .line 32
    :cond_1
    iget-object v0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;->L$0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;

    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    check-cast p1, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 40
    .line 41
    invoke-interface {v0}, Lio/ktor/websocket/飘花落叶言子世楪苏哲兰;->飘花落叶言子世苏楪哲兰()Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v2, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;->L$0:Ljava/lang/Object;

    .line 46
    .line 47
    iput v4, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;->label:I

    .line 48
    .line 49
    invoke-interface {v0, p1, p0}, Lkotlinx/coroutines/channels/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪苏兰哲(Ljava/lang/Object;Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-ne p0, v1, :cond_2

    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object v2, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$sendSerializedBase$2;->label:I

    .line 65
    .line 66
    throw v2
.end method
