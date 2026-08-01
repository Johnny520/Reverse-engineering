.class public final Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Z

.field public 飘花落叶言子楪世兰苏哲:Z

.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:Z

.field public 飘花落叶言子楪世苏兰哲:Z

.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

.field public 飘花落叶言子楪苏世兰哲:I

.field public 飘花落叶言子楪苏世哲兰:I

.field public 飘花落叶言子楪苏兰世哲:Ljava/lang/Integer;

.field public 飘花落叶言子楪苏哲世兰:I

.field public 飘花落叶言子楪苏哲兰世:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    sget-object v1, Lio/ktor/websocket/FrameParser$State;->HEADER0:Lio/ktor/websocket/FrameParser$State;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰()Lio/ktor/websocket/FrameType;
    .locals 3

    .line 1
    sget-object v0, Lio/ktor/websocket/FrameType;->Companion:Lio/ktor/websocket/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lio/ktor/websocket/FrameType;->access$getMaxOpcode$cp()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-gt v1, v2, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lio/ktor/websocket/FrameType;->access$getByOpcodeArray$cp()[Lio/ktor/websocket/FrameType;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    aget-object v1, v2, v1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v1, v0

    .line 25
    :goto_0
    if-eqz v1, :cond_1

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_1
    iget p0, p0, Lio/ktor/websocket/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 29
    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v1, "Unsupported opcode "

    .line 35
    .line 36
    invoke-static {p0, v1}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method
