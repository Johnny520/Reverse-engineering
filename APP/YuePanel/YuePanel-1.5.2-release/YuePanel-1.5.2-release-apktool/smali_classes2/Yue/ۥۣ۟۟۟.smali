.class public LYue/ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۦ۠;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;


# direct methods
.method public constructor <init>(LYue/ۥۢۦ۠;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    return-void
.end method

.method public constructor <init>(Ljava/nio/channels/ByteChannel;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V

    return-void
.end method

.method public isOpen()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    invoke-interface {v0}, Ljava/nio/channels/Channel;->isOpen()Z

    move-result v0

    return v0
.end method

.method public read(Ljava/nio/ByteBuffer;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    invoke-interface {v0, p1}, Ljava/nio/channels/ReadableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    invoke-interface {v0, p1}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟۠ۤ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    instance-of v1, v0, Ljava/nio/channels/SocketChannel;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/nio/channels/SocketChannel;

    invoke-virtual {v0}, Ljava/nio/channels/SelectableChannel;->isBlocking()Z

    move-result v0

    return v0

    :cond_0
    instance-of v1, v0, LYue/ۥۢۦ۠;

    if-eqz v1, :cond_1

    check-cast v0, LYue/ۥۢۦ۠;

    invoke-interface {v0}, LYue/ۥۢۦ۠;->ۥ۟۟۠ۤ()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۥ۠()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    instance-of v1, v0, LYue/ۥۢۦ۠;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۢۦ۠;

    invoke-interface {v0}, LYue/ۥۢۦ۠;->ۥ۟۟ۥ۠()V

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۥۨ(Ljava/nio/ByteBuffer;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    instance-of v1, v0, LYue/ۥۢۦ۠;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۢۦ۠;

    invoke-interface {v0, p1}, LYue/ۥۢۦ۠;->ۥ۟۟ۥۨ(Ljava/nio/ByteBuffer;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public ۥ۟۟ۦ۟()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    instance-of v1, v0, LYue/ۥۢۦ۠;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۢۦ۠;

    invoke-interface {v0}, LYue/ۥۢۦ۠;->ۥ۟۟ۦ۟()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟ۦۡ()Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣ۟۟۟;->ۥۣ۟۟۠:Ljava/nio/channels/ByteChannel;

    instance-of v1, v0, LYue/ۥۢۦ۠;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥۢۦ۠;

    invoke-interface {v0}, LYue/ۥۢۦ۠;->ۥ۟۟ۦۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
