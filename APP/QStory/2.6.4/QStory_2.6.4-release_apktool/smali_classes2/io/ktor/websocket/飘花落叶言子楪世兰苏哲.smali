.class public abstract Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

.field public static final 飘花落叶言子楪世哲苏兰:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

.field public static final 飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

.field public static final 飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "io.ktor.websocket.WebSocket"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sput-object v0, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:L飘花落叶言苏楪世子兰哲/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 13
    .line 14
    const-string v1, "ws-incoming-processor"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 20
    .line 21
    new-instance v0, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 22
    .line 23
    const-string v1, "ws-outgoing-processor"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:Lkotlinx/coroutines/飘花落叶言子世楪哲苏兰;

    .line 29
    .line 30
    new-instance v0, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 31
    .line 32
    sget-object v1, Lio/ktor/websocket/CloseReason$Codes;->NORMAL:Lio/ktor/websocket/CloseReason$Codes;

    .line 33
    .line 34
    const-string v2, "OK"

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;-><init>(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lio/ktor/websocket/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:Lio/ktor/websocket/飘花落叶言子楪世苏兰哲;

    .line 40
    .line 41
    return-void
.end method
