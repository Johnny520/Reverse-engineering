.class public abstract Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Z

.field public final 飘花落叶言子楪世兰苏哲:Z

.field public final 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:[B

.field public final 飘花落叶言子楪世苏兰哲:Lio/ktor/websocket/FrameType;

.field public final 飘花落叶言子楪世苏哲兰:Z

.field public final 飘花落叶言子楪苏世哲兰:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(ZLio/ktor/websocket/FrameType;[BZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Z

    .line 5
    .line 6
    iput-object p2, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lio/ktor/websocket/FrameType;

    .line 7
    .line 8
    iput-object p3, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:[B

    .line 9
    .line 10
    iput-boolean p4, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲兰苏:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰苏哲:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世兰哲苏:Z

    .line 15
    .line 16
    invoke-static {p3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪苏世哲兰:Ljava/nio/ByteBuffer;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Frame "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:Lio/ktor/websocket/FrameType;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " (fin="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", buffer len = "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lio/ktor/websocket/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世哲苏兰:[B

    .line 29
    .line 30
    array-length p0, p0

    .line 31
    const/16 v1, 0x29

    .line 32
    .line 33
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
