.class public final Lio/ktor/serialization/WebsocketDeserializeException;
.super Lio/ktor/serialization/WebsocketContentConvertException;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/ktor/serialization/WebsocketDeserializeException;",
        "Lio/ktor/serialization/WebsocketContentConvertException;",
        "",
        "message",
        "",
        "cause",
        "Lio/ktor/websocket/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
        "frame",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;)V",
        "Lio/ktor/websocket/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
        "getFrame",
        "()Lio/ktor/websocket/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
        "ktor-serialization"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final frame:Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Lio/ktor/serialization/WebsocketContentConvertException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, Lio/ktor/serialization/WebsocketDeserializeException;->frame:Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/ktor/serialization/WebsocketDeserializeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;)V

    return-void
.end method


# virtual methods
.method public final getFrame()Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/serialization/WebsocketDeserializeException;->frame:Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    return-object p0
.end method
