.class final Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


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
        0x60,
        0x69
    }
    m = "receiveDeserializedBase"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

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
            "Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;",
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
    .locals 9

    .line 1
    iput-object p1, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget v0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;->label:I

    .line 4
    .line 5
    const/high16 v1, -0x80000000

    .line 6
    .line 7
    or-int/2addr v0, v1

    .line 8
    sub-int/2addr v0, v1

    .line 9
    iput v0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;->label:I

    .line 10
    .line 11
    sget-object v1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_6

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eq v0, v2, :cond_4

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-ne v0, v3, :cond_3

    .line 21
    .line 22
    iget-object v0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;->L$1:Ljava/lang/Object;

    .line 23
    .line 24
    move-object v6, v0

    .line 25
    check-cast v6, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 26
    .line 27
    iget-object p0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;->L$0:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 35
    .line 36
    invoke-interface {v0, p1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->isInstance(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_0
    if-nez p1, :cond_2

    .line 44
    .line 45
    iget-object p0, p0, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Lkotlin/reflect/飘花落叶言子世楪苏兰哲;

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰哲苏()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-ne p0, v2, :cond_1

    .line 54
    .line 55
    return-object v1

    .line 56
    :cond_1
    new-instance v3, Lio/ktor/serialization/WebsocketDeserializeException;

    .line 57
    .line 58
    const/4 v7, 0x2

    .line 59
    const/4 v8, 0x0

    .line 60
    const-string v4, "Frame has null content"

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    invoke-direct/range {v3 .. v8}, Lio/ktor/serialization/WebsocketDeserializeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 64
    .line 65
    .line 66
    throw v3

    .line 67
    :cond_2
    new-instance v3, Lio/ktor/serialization/WebsocketDeserializeException;

    .line 68
    .line 69
    iget-object p0, p0, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 70
    .line 71
    invoke-interface {p0}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->getSimpleName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object v0, Lkotlin/jvm/internal/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;

    .line 80
    .line 81
    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)Lkotlin/reflect/飘花落叶言子楪世哲兰苏;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-interface {p1}, Lkotlin/reflect/飘花落叶言子楪世哲兰苏;->getSimpleName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v1, "Can\'t deserialize value: expected value of type "

    .line 92
    .line 93
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string p0, ", got "

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const/4 v7, 0x2

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v5, 0x0

    .line 114
    invoke-direct/range {v3 .. v8}, Lio/ktor/serialization/WebsocketDeserializeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V

    .line 115
    .line 116
    .line 117
    throw v3

    .line 118
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 119
    .line 120
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object v1

    .line 124
    :cond_4
    iget-object v0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;->L$2:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Ljava/nio/charset/Charset;

    .line 127
    .line 128
    iget-object v0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;->L$1:Ljava/lang/Object;

    .line 129
    .line 130
    if-eqz v0, :cond_5

    .line 131
    .line 132
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 133
    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_5
    iget-object p0, p0, Lio/ktor/websocket/serialization/WebsocketChannelSerializationKt$receiveDeserializedBase$2;->L$0:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, L飘花落叶言世子楪苏哲兰/飘花落叶言子楪世苏哲兰;

    .line 139
    .line 140
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    check-cast p1, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 144
    .line 145
    throw v1

    .line 146
    :cond_6
    invoke-static {p1}, Lkotlin/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    throw v1
.end method
