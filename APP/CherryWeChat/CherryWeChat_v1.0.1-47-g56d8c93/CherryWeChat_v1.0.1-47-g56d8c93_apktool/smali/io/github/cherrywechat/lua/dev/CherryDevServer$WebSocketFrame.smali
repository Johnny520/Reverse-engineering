.class final Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/dev/CherryDevServer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WebSocketFrame"
.end annotation


# instance fields
.field private final opcode:I

.field private final payload:[B


# direct methods
.method public constructor <init>(I[B)V
    .locals 2

    const-wide v0, -0x13982fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->opcode:I

    iput-object p2, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->payload:[B

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;I[BILjava/lang/Object;)Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->opcode:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->payload:[B

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->copy(I[B)Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->opcode:I

    return v0
.end method

.method public final component2()[B
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->payload:[B

    return-object v0
.end method

.method public final copy(I[B)Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;
    .locals 2

    const-wide v0, -0x1398afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;

    invoke-direct {v0, p1, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;-><init>(I[B)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;

    iget v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->opcode:I

    iget v3, p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->opcode:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->payload:[B

    iget-object p1, p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->payload:[B

    invoke-static {v1, p1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getOpcode()I
    .locals 1

    iget v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->opcode:I

    return v0
.end method

.method public final getPayload()[B
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->payload:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->opcode:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->payload:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x13992fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->opcode:I

    const-wide v2, -0x139a9fffff835L

    invoke-static {v0, v1, v2, v3}, LEy;->p(Ljava/lang/StringBuilder;IJ)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->payload:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
