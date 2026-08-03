.class public final Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/dev/CherryDevServer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WebSocketConnection"
.end annotation


# instance fields
.field private final id:Ljava/lang/String;

.field private final input:Ljava/io/BufferedInputStream;

.field private final output:Ljava/io/BufferedOutputStream;

.field private final socket:Ljava/net/Socket;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/net/Socket;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V
    .locals 2

    const-wide v0, -0x139c1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x139c4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x139cbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x139d1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->id:Ljava/lang/String;

    iput-object p2, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->socket:Ljava/net/Socket;

    iput-object p3, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->input:Ljava/io/BufferedInputStream;

    iput-object p4, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->output:Ljava/io/BufferedOutputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->socket:Ljava/net/Socket;

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final declared-synchronized send([B)V
    .locals 2

    monitor-enter p0

    const-wide v0, -0x139d8fffff835L

    :try_start_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v0, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->output:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    iget-object p1, p0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->output:Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    const-wide v0, -0x139ddfffff835L

    :try_start_2
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x139edfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method
