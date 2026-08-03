.class public final Lio/github/cherrywechat/lua/dev/CherryDevServer;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;,
        Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;,
        Lio/github/cherrywechat/lua/dev/CherryDevServer$LogListener;,
        Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;,
        Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;
    }
.end annotation


# static fields
.field private static final DEFAULT_PORT:I = 0x2537

.field public static final INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

.field private static final TAG:Ljava/lang/String;

.field private static context:Landroid/content/Context;

.field private static final executor:Ljava/util/concurrent/ExecutorService;

.field private static final logListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/lua/dev/CherryDevServer$LogListener;",
            ">;"
        }
    .end annotation
.end field

.field private static final mainHandler:Landroid/os/Handler;

.field private static port:I

.field private static final running:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static serverSocket:Ljava/net/ServerSocket;

.field private static final wsConnections:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x12cc3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->mainHandler:Landroid/os/Handler;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0x2537

    sput v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->port:I

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->logListeners:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a([B)V
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog$lambda$4([B)V

    return-void
.end method

.method private final acceptConnections()V
    .locals 4

    :cond_0
    :goto_0
    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->serverSocket:Ljava/net/ServerSocket;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v2, LN2;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v0}, LN2;-><init>(ILjava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide v0, -0x138adfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x138bdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method private static final acceptConnections$lambda$5(Ljava/net/Socket;)V
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-direct {v0, p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleConnection(Ljava/net/Socket;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;LHw;)LTC;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleScriptUpload$lambda$16$lambda$15(Ljava/lang/String;LHw;)LTC;

    move-result-object p0

    return-object p0
.end method

.method private static final broadcastLog$lambda$4([B)V
    .locals 6

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x12d70fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;

    :try_start_0
    invoke-virtual {v1, p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->send([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-wide v2, -0x12d02fffff835L

    const-wide v4, -0x12d12fffff835L

    invoke-static {v2, v3, v4, v5, v1}, LEy;->i(JJLjava/lang/Exception;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic c(Ljava/net/Socket;)V
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->acceptConnections$lambda$5(Ljava/net/Socket;)V

    return-void
.end method

.method private final createWebSocketFrame(I[B)[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    or-int/lit16 p1, p1, 0x80

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    array-length p1, p2

    const/16 v1, 0x7e

    if-ge p1, v1, :cond_0

    array-length p1, p2

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_0
    array-length p1, p2

    const/high16 v2, 0x10000

    if-ge p1, v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    array-length p1, p2

    shr-int/lit8 p1, p1, 0x8

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    array-length p1, p2

    and-int/lit16 p1, p1, 0xff

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_1
    const/16 p1, 0x7f

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/4 p1, 0x7

    :goto_0
    const/4 v1, -0x1

    if-ge v1, p1, :cond_2

    array-length v1, p2

    int-to-long v1, v1

    mul-int/lit8 v3, p1, 0x8

    shr-long/2addr v1, v3

    long-to-int v1, v1

    and-int/lit16 v1, v1, 0xff

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    const-wide v0, -0x12ed1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object p1
.end method

.method private final createWebSocketTextFrame(Ljava/lang/String;)[B
    .locals 2

    sget-object v0, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-wide v0, -0x12ec3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->createWebSocketFrame(I[B)[B

    move-result-object p1

    return-object p1
.end method

.method public static synthetic d(Ljava/lang/String;LIv;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleScriptExecute$lambda$20(Ljava/lang/String;LIv;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

.method public static synthetic e(Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;[B)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleWebSocketMessage$lambda$24$lambda$23(Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;[B)V

    return-void
.end method

.method public static synthetic f(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleScriptUpload$lambda$16(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g()V
    .locals 0

    invoke-static {}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->start$lambda$0()V

    return-void
.end method

.method private final generateWebSocketAcceptKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-wide v0, -0x12e76fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x12e1bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-static {p1, v0}, LEy;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-wide v2, -0x12e21fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-static {}, Ljava/util/Base64;->getEncoder()Ljava/util/Base64$Encoder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x12e2ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object p1
.end method

.method private final getLocalIpAddress()Ljava/lang/String;
    .locals 4

    :try_start_0
    invoke-static {}, Ljava/net/NetworkInterface;->getNetworkInterfaces()Ljava/util/Enumeration;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/NetworkInterface;

    invoke-virtual {v1}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetAddress;

    invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z

    move-result v3

    if-nez v3, :cond_1

    instance-of v3, v2, Ljava/net/Inet4Address;

    if-eqz v3, :cond_1

    check-cast v2, Ljava/net/Inet4Address;

    invoke-virtual {v2}, Ljava/net/Inet4Address;->getHostAddress()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-wide v0, -0x12e90fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object v0

    :catch_0
    const-wide v0, -0x12e9afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12eaafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_3
    const-wide v0, -0x12ebbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Ljava/lang/String;Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleWebSocketMessage$lambda$24(Ljava/lang/String;Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;)V

    return-void
.end method

.method private final handleConnection(Ljava/net/Socket;)V
    .locals 4

    const/16 v0, 0x7530

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v1, Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->parseHttpRequest(Ljava/io/BufferedInputStream;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    return-void

    :cond_0
    invoke-direct {p0, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->isWebSocketUpgrade(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-direct {p0, p1, v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleWebSocketUpgrade(Ljava/net/Socket;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)V

    return-void

    :cond_1
    invoke-direct {p0, p1, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleHttpRequest(Ljava/net/Socket;Ljava/io/BufferedOutputStream;Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-wide v0, -0x1274afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1275afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :try_start_1
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method

.method private final handleHttpRequest(Ljava/net/Socket;Ljava/io/BufferedOutputStream;Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)V
    .locals 3

    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x1276bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x12777fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleStatus()Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    move-result-object p3

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x1277bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x1270cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleScriptList()Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    move-result-object p3

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x12710fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x12723fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleScriptUpload(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    move-result-object p3

    goto/16 :goto_0

    :cond_2
    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x12728fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x1273cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleScriptExecute(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    move-result-object p3

    goto :goto_0

    :cond_3
    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x127c1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x127d4fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleScriptReload(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    move-result-object p3

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x127d9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getMethod()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x127ecfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p0, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleScriptDelete(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    move-result-object p3

    goto :goto_0

    :cond_5
    new-instance p3, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v0, -0x127f1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x127fbfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x194

    invoke-direct {p3, v2, v0, v1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0, p2, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->sendHttpResponse(Ljava/io/BufferedOutputStream;Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;)V

    invoke-virtual {p1}, Ljava/net/Socket;->close()V

    return-void
.end method

.method private final handleScriptDelete(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
    .locals 6

    const/16 v0, 0x190

    :try_start_0
    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->parseRequestBody(Ljava/lang/String;)Lkotlinx/serialization/json/c;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v1, -0x123e8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x123f4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    goto/16 :goto_0

    :cond_0
    const-wide v1, -0x1238efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object v1

    invoke-static {v1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    :cond_1
    const-wide v1, -0x12391fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_2
    const-wide v2, -0x12392fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object p1

    invoke-static {p1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    const-wide v2, -0x12397fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    sget-object v2, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v2, v1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->unloadScript(Ljava/lang/String;)Z

    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_6
    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v1, -0x12398fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x1239bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xc8

    invoke-direct {p1, v3, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_0
    new-instance v1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x123adfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x123b9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x12245fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, v2, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private final handleScriptExecute(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
    .locals 6

    const/16 v0, 0x190

    :try_start_0
    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->parseRequestBody(Ljava/lang/String;)Lkotlinx/serialization/json/c;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v1, -0x1258dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x12599fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    const-wide v1, -0x125b3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object p1

    invoke-static {p1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, LIv;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    sget-object v3, Lio/github/cherrywechat/lua/dev/CherryDevServer;->mainHandler:Landroid/os/Handler;

    new-instance v4, Lr8;

    invoke-direct {v4, p1, v1, v2}, Lr8;-><init>(Ljava/lang/String;LIv;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xa

    invoke-virtual {v2, v3, v4, p1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x1245efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    iget-object v1, v1, LIv;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_2

    const-wide v3, -0x12461fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_2
    const/16 v3, 0xc8

    invoke-direct {p1, v3, v2, v1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_3
    :goto_0
    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v1, -0x125b8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x12444fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    new-instance v1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x12476fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x12402fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x1240efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, v2, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final handleScriptExecute$lambda$20(Ljava/lang/String;LIv;Ljava/util/concurrent/CountDownLatch;)V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v1, p0}, Lio/github/cherrywechat/lua/LuaEngine;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v2, -0x12c5afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    instance-of v3, p0, LGw;

    xor-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    sget v4, Lsm;->a:I

    new-instance v4, LBm;

    invoke-direct {v4, v3, v0}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/b;

    instance-of v2, p0, LGw;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    const-wide v4, -0x12c62fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    instance-of v4, p0, LGw;

    if-eqz v4, :cond_0

    move-object p0, v3

    :cond_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {v3}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object p0

    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/b;

    goto :goto_1

    :cond_2
    const-wide v4, -0x12c69fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-static {v3}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object p0

    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/b;

    :goto_1
    new-instance p0, Lkotlinx/serialization/json/c;

    invoke-direct {p0, v1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, LIv;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v2, -0x12c6ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget v4, Lsm;->a:I

    new-instance v4, LBm;

    invoke-direct {v4, v3, v0}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/b;

    const-wide v2, -0x12c77fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object p0

    invoke-interface {v1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/b;

    new-instance p0, Lkotlinx/serialization/json/c;

    invoke-direct {p0, v1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    invoke-virtual {p0}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    move-result-object p0

    iput-object p0, p1, LIv;->a:Ljava/lang/Object;

    :goto_3
    invoke-virtual {p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method private final handleScriptList()Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
    .locals 6

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->getLoadedScripts()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/github/cherrywechat/lua/loader/LoadedScript;

    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v4, -0x12644fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlinx/serialization/json/b;

    const-wide v4, -0x12647fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlinx/serialization/json/b;

    const-wide v4, -0x1264cfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getState()Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v5

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlinx/serialization/json/b;

    const-wide v4, -0x12652fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getFilePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/b;

    new-instance v2, Lkotlinx/serialization/json/c;

    invoke-direct {v2, v3}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Lkotlinx/serialization/json/a;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/a;-><init>(Ljava/util/List;)V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v2, -0x12657fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/b;

    new-instance v0, Lkotlinx/serialization/json/c;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    new-instance v1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x1265ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0xc8

    invoke-direct {v1, v3, v2, v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private final handleScriptReload(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
    .locals 12

    const/16 v1, 0x190

    :try_start_0
    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->parseRequestBody(Ljava/lang/String;)Lkotlinx/serialization/json/c;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x12411fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x1241dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_0

    :cond_0
    const-wide v2, -0x12437fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/b;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object v0

    invoke-static {v0}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    const-wide v2, -0x1243cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :cond_2
    const-wide v2, -0x1243dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object p1

    invoke-static {p1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    const-wide v2, -0x124c0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xc8

    const/16 v4, 0x1f4

    if-lez v2, :cond_6

    sget-object v5, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v5, p1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->getScript(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/LoadedScript;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v5, p1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->unloadScript(Ljava/lang/String;)Z

    sget-object v6, Lio/github/cherrywechat/lua/dev/CherryDevServer;->context:Landroid/content/Context;

    if-nez v6, :cond_5

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x124c1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x124c7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v4, v0, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_5
    new-instance v7, Ljava/io/File;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getFilePath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v7, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadAndExecute$default(Lio/github/cherrywechat/lua/loader/ScriptManager;Landroid/content/Context;Ljava/io/File;ZLfj;ILjava/lang/Object;)Lio/github/cherrywechat/lua/loader/LoadedScript;

    const-wide v4, -0x124dffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v4, -0x124e4fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x124f4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v2, v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v4, -0x12486fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v4, -0x12489fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v3, v0, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_8

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_8

    sget-object v6, Lio/github/cherrywechat/lua/dev/CherryDevServer;->context:Landroid/content/Context;

    if-nez v6, :cond_7

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x124b2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x124b8fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v4, v0, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_7
    sget-object v5, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadAndExecute$default(Lio/github/cherrywechat/lua/loader/ScriptManager;Landroid/content/Context;Ljava/io/File;ZLfj;ILjava/lang/Object;)Lio/github/cherrywechat/lua/loader/LoadedScript;

    const-wide v4, -0x12350fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v4, -0x12355fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x12365fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v4, -0x12377fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v4, -0x1237afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v3, v0, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_8
    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x12323fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v2, -0x1232ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_0
    new-instance v0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x123cdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x123d9fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x123e5fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final handleScriptUpload(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
    .locals 10

    const/16 v0, 0x190

    :try_start_0
    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getBody()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->parseRequestBody(Ljava/lang/String;)Lkotlinx/serialization/json/c;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v1, -0x12662fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x1266efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    const-wide v1, -0x12608fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    if-eqz v1, :cond_e

    invoke-static {v1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object v1

    invoke-static {v1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const-wide v2, -0x1263bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/b;

    if-eqz v2, :cond_d

    invoke-static {v2}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-static {v2}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    goto/16 :goto_3

    :cond_2
    const-wide v3, -0x126ecfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    const/4 v3, 0x0

    if-eqz p1, :cond_5

    invoke-static {p1}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object p1

    invoke-static {p1}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    const-string v4, "true"

    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    const-string v4, "false"

    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_0

    :cond_4
    move-object p1, v3

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_1

    :cond_5
    const/4 p1, 0x1

    :goto_1
    sget-object v4, Lio/github/cherrywechat/lua/dev/CherryDevServer;->context:Landroid/content/Context;

    if-nez v4, :cond_6

    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v1, -0x126f8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x126fefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x1f4

    invoke-direct {p1, v3, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_6
    new-instance v5, Ljava/io/File;

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v6

    const-wide v7, -0x12696fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    :cond_7
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v6, v2}, Lwh;->i0(Ljava/io/File;Ljava/lang/String;)V

    sget-object v2, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/loader/ScriptManager;->getLoadedScripts()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lio/github/cherrywechat/lua/loader/LoadedScript;

    invoke-virtual {v7}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getFilePath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    move-object v3, v5

    :cond_9
    check-cast v3, Lio/github/cherrywechat/lua/loader/LoadedScript;

    if-eqz v3, :cond_a

    sget-object v2, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/github/cherrywechat/lua/loader/ScriptManager;->unloadScript(Ljava/lang/String;)Z

    const-wide v2, -0x126a2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v7, -0x126a7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v7, -0x126b7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v2, v3, v5}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_a
    const-wide v2, -0x12552fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v7, -0x12557fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v7, -0x12567fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v7, -0x12579fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v7, 0x29

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v2, v3, v5}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    if-eqz p1, :cond_b

    const-wide v7, -0x12508fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const-wide v7, -0x1250efffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v8, -0x1251efffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v3, v5, v7}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v3, Lio/github/cherrywechat/lua/dev/CherryDevServer;->mainHandler:Landroid/os/Handler;

    new-instance v5, Lr8;

    invoke-direct {v5, v4, v6, v1, v2}, Lr8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v3, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_b
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v3, -0x1253afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget v5, Lsm;->a:I

    new-instance v5, LBm;

    invoke-direct {v5, v4, v2}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/b;

    const-wide v2, -0x125c2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/b;

    const-wide v2, -0x125c7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x125cffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_c

    const-wide v4, -0x125dffffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_c
    const-wide v4, -0x125eefffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    new-instance p1, Lkotlinx/serialization/json/c;

    invoke-direct {p1, v1}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    new-instance v1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x125effffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v3, 0xc8

    invoke-direct {v1, v3, v2, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_d
    :goto_3
    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v1, -0x126c3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x126cffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_e
    :goto_4
    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v1, -0x12611fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x1261dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_5
    new-instance v1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x125f2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x125fefffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x1258afffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, v2, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final handleScriptUpload$lambda$16(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    new-instance v1, Ls8;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Ls8;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, p0, p1, v2, v1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadAndExecute(Landroid/content/Context;Ljava/io/File;ZLfj;)Lio/github/cherrywechat/lua/loader/LoadedScript;

    move-result-object p0

    if-nez p0, :cond_0

    sget-object p0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    const-wide v0, -0x12dacfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x12db2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x12c42fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final handleScriptUpload$lambda$16$lambda$15(Ljava/lang/String;LHw;)LTC;
    .locals 7

    iget-object p1, p1, LHw;->a:Ljava/lang/Object;

    instance-of v0, p1, LGw;

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x64

    if-le v2, v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-wide v0, -0x12d29fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :goto_1
    sget-object v1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    const-wide v2, -0x12d2ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const-wide v3, -0x12d34fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v5, -0x12dc4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v5, -0x12dd6fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v3, v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-static {p1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    const-wide v1, -0x12ddbfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x12de1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x12df1fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v4, -0x12d81fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v1, v2, p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-wide p0, -0x12d85fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    const-wide p0, -0x12d95fffff835L

    invoke-static {p0, p1}, LGu;->r(J)Ljava/lang/String;

    :cond_3
    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private final handleStatus()Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;
    .locals 5

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v1, -0x12792fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x12799fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x1279cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/LuaEngine;->isInitialized()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    sget v3, Lsm;->a:I

    new-instance v3, LBm;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x127a3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/loader/ScriptManager;->getLoadedScripts()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget v3, Lsm;->a:I

    new-instance v3, LBm;

    invoke-direct {v3, v2, v4}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x127abfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    sget v3, Lsm;->a:I

    new-instance v3, LBm;

    invoke-direct {v3, v2, v4}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x127b7fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget v3, Lsm;->a:I

    new-instance v3, LBm;

    invoke-direct {v3, v2, v4}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    new-instance v1, Lkotlinx/serialization/json/c;

    invoke-direct {v1, v0}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    new-instance v0, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;

    const-wide v2, -0x12641fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0xc8

    invoke-direct {v0, v3, v2, v1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final handleWebSocketMessage(Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;Ljava/lang/String;)V
    .locals 3

    :try_start_0
    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->parseRequestBody(Ljava/lang/String;)Lkotlinx/serialization/json/c;

    move-result-object p2

    if-nez p2, :cond_0

    goto/16 :goto_1

    :cond_0
    const-wide v0, -0x12079fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlinx/serialization/json/b;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object v0

    invoke-static {v0}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-wide v1, -0x1207efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-wide v0, -0x12003fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->createWebSocketTextFrame(Ljava/lang/String;)[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->send([B)V

    return-void

    :cond_2
    const-wide v1, -0x12014fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-wide v0, -0x1201cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkotlinx/serialization/json/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lkotlinx/serialization/json/b;

    if-eqz p2, :cond_3

    invoke-static {p2}, Lsm;->d(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/d;

    move-result-object p2

    invoke-static {p2}, Lsm;->c(Lkotlinx/serialization/json/d;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_4

    :cond_3
    const-wide v0, -0x12021fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    :cond_4
    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->mainHandler:Landroid/os/Handler;

    new-instance v1, Ln3;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p2, p1}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    :goto_1
    return-void

    :catch_0
    const-wide p1, -0x12022fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x12032fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method private static final handleWebSocketMessage$lambda$24(Ljava/lang/String;Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;)V
    .locals 6

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v0, p0}, Lio/github/cherrywechat/lua/LuaEngine;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v1, -0x12c24fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x12c29fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x12c30fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    instance-of v2, p0, LGw;

    xor-int/lit8 v3, v2, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    sget v4, Lsm;->a:I

    new-instance v4, LBm;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v0, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v3, -0x12c38fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-static {v2}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x12c3dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-static {v3}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object p0

    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlinx/serialization/json/b;

    new-instance p0, Lkotlinx/serialization/json/c;

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-virtual {p0}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->createWebSocketTextFrame(Ljava/lang/String;)[B

    move-result-object p0

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ln3;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p1, p0}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final handleWebSocketMessage$lambda$24$lambda$23(Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;[B)V
    .locals 4

    :try_start_0
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->send([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-wide v0, -0x12c7dfffff835L

    const-wide v2, -0x12c0dfffff835L

    invoke-static {v0, v1, v2, v3, p0}, LEy;->i(JJLjava/lang/Exception;)V

    return-void
.end method

.method private final handleWebSocketUpgrade(Ljava/net/Socket;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)V
    .locals 5

    invoke-virtual {p4}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getHeaders()Ljava/util/Map;

    move-result-object p4

    const-wide v0, -0x1220ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/String;

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p4}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->generateWebSocketAcceptKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x12221fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x122b1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Luz;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-wide v0, -0x122bcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x122befffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {p4, v0, v1}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    const-wide v0, -0x12141fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    sget-object v0, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p4, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p4

    const-wide v0, -0x12144fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p3}, Ljava/io/BufferedOutputStream;->flush()V

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/net/Socket;->getPort()I

    move-result v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    new-instance v0, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;

    invoke-direct {v0, p4, p1, p2, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;-><init>(Ljava/lang/String;Ljava/net/Socket;Ljava/io/BufferedInputStream;Ljava/io/BufferedOutputStream;)V

    sget-object p3, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p3, p4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v1, -0x12152fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x12162fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x12178fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p3

    const-wide v1, -0x1217dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x1210dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p3, v1, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v1, -0x12120fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x12125fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x1212ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x12137fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-interface {p3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x121d2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    new-instance v3, LBm;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {p3, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    new-instance v1, Lkotlinx/serialization/json/c;

    invoke-direct {v1, p3}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    invoke-virtual {v1}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->createWebSocketTextFrame(Ljava/lang/String;)[B

    move-result-object p3

    invoke-virtual {v0, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->send([B)V

    :goto_0
    :try_start_0
    sget-object p3, Lio/github/cherrywechat/lua/dev/CherryDevServer;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p1}, Ljava/net/Socket;->isClosed()Z

    move-result p3

    if-nez p3, :cond_4

    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readWebSocketFrame(Ljava/io/BufferedInputStream;)Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;

    move-result-object p3

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->getOpcode()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/16 v2, 0x8

    if-eq v1, v2, :cond_4

    const/16 v2, 0x9

    if-eq v1, v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->getPayload()[B

    move-result-object p3

    const/16 v1, 0xa

    invoke-direct {p0, v1, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->createWebSocketFrame(I[B)[B

    move-result-object p3

    invoke-virtual {v0, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->send([B)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_3
    new-instance v1, Ljava/lang/String;

    invoke-virtual {p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;->getPayload()[B

    move-result-object p3

    sget-object v2, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-direct {v1, p3, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-direct {p0, v0, v1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->handleWebSocketMessage(Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_4
    :goto_1
    sget-object p1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->close()V

    const-wide p1, -0x121dcfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x121ecfffff835L

    :goto_2
    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-void

    :goto_3
    const-wide p2, -0x12185fffff835L

    :try_start_1
    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x12195fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, p4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->close()V

    const-wide p1, -0x121a7fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x121b7fffff835L

    goto :goto_2

    :goto_4
    sget-object p2, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2, p4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->close()V

    const-wide p2, -0x12050fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x12060fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    throw p1
.end method

.method private final isWebSocketUpgrade(Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;)Z
    .locals 4

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getHeaders()Ljava/util/Map;

    move-result-object v0

    const-wide v1, -0x12248fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x12250fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-wide v1, -0x12261fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;->getHeaders()Ljava/util/Map;

    move-result-object p1

    const-wide v2, -0x1226bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-wide v2, -0x12276fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x12207fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    return v0

    :cond_1
    return v1
.end method

.method private final parseHttpRequest(Ljava/io/BufferedInputStream;)Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;
    .locals 10

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readLine(Ljava/io/BufferedInputStream;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-static {v0}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    const-wide v1, -0x120cafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, Ltz;->Z(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x2

    if-ge v1, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const-wide v4, -0x120ccfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4, v2}, Ltz;->Z(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_3
    :goto_0
    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readLine(Ljava/io/BufferedInputStream;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_8

    const-wide v5, -0x120fdfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-static {v2}, LAz;->H(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_5
    if-lez v1, :cond_7

    new-array v2, v1, [B

    invoke-direct {p0, p1, v2, v1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readFully(Ljava/io/BufferedInputStream;[BI)Z

    move-result p1

    if-nez p1, :cond_6

    :goto_1
    const/4 p1, 0x0

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/String;

    sget-object v1, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-direct {p1, v2, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    goto :goto_2

    :cond_7
    const-wide v1, -0x1208cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :goto_2
    new-instance v1, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;

    invoke-direct {v1, v3, v0, v4, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-object v1

    :cond_8
    const/16 v6, 0x3a

    invoke-static {v5, v6, v1, v2}, Ltz;->Q(Ljava/lang/CharSequence;CII)I

    move-result v6

    if-lez v6, :cond_3

    invoke-virtual {v5, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x120cefffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v7}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x120ddfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-wide v8, -0x120eefffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0
.end method

.method private final parseRequestBody(Ljava/lang/String;)Lkotlinx/serialization/json/c;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lzm;->a:LAm;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lvm;->a:Lvm;

    invoke-virtual {v1, v2, p1}, Lmm;->a(LQm;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    sget v1, Lsm;->a:I

    instance-of v1, p1, Lkotlinx/serialization/json/c;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lkotlinx/serialization/json/c;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "JsonObject"

    invoke-static {p1, v1}, Lsm;->b(Lkotlinx/serialization/json/b;Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    new-instance v1, LGw;

    invoke-direct {v1, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    :goto_1
    instance-of p1, v1, LGw;

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    check-cast v0, Lkotlinx/serialization/json/c;

    return-object v0
.end method

.method private final readByte(Ljava/io/BufferedInputStream;)Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->read()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method private final readFully(Ljava/io/BufferedInputStream;[BI)Z
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p3, :cond_1

    sub-int v2, p3, v1

    invoke-virtual {p1, p2, v1, v2}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    return v0

    :cond_0
    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private final readLine(Ljava/io/BufferedInputStream;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->read()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    sget-object p1, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 v2, 0xa

    if-ne v1, v2, :cond_3

    sget-object p1, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const/16 v2, 0xd

    if-eq v1, v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_0
.end method

.method private final readWebSocketFrame(Ljava/io/BufferedInputStream;)Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;
    .locals 12

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readByte(Ljava/io/BufferedInputStream;)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readByte(Ljava/io/BufferedInputStream;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    and-int/lit8 v0, v0, 0xf

    and-int/lit16 v3, v2, 0x80

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    const/16 v5, 0x7f

    and-int/2addr v2, v5

    int-to-long v6, v2

    long-to-int v2, v6

    const/16 v8, 0x7e

    const/16 v9, 0x8

    if-eq v2, v8, :cond_3

    if-eq v2, v5, :cond_1

    goto :goto_2

    :cond_1
    const-wide/16 v5, 0x0

    move v2, v4

    move-wide v6, v5

    :goto_1
    if-ge v2, v9, :cond_4

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readByte(Ljava/io/BufferedInputStream;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    shl-long/2addr v6, v9

    int-to-long v10, v5

    or-long/2addr v6, v10

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-object v1

    :cond_3
    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readByte(Ljava/io/BufferedInputStream;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readByte(Ljava/io/BufferedInputStream;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    shl-int/2addr v2, v9

    or-int/2addr v2, v5

    int-to-long v6, v2

    :cond_4
    :goto_2
    const-wide/32 v8, 0x7fffffff

    cmp-long v2, v6, v8

    if-lez v2, :cond_5

    const-wide v2, -0x12ee2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x12ef2fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    return-object v1

    :cond_5
    if-eqz v3, :cond_6

    const/4 v2, 0x4

    new-array v3, v2, [B

    sget-object v5, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-direct {v5, p1, v3, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readFully(Ljava/io/BufferedInputStream;[BI)Z

    move-result v2

    if-nez v2, :cond_7

    return-object v1

    :cond_6
    move-object v3, v1

    :cond_7
    long-to-int v2, v6

    new-array v5, v2, [B

    invoke-direct {p0, p1, v5, v2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->readFully(Ljava/io/BufferedInputStream;[BI)Z

    move-result p1

    if-nez p1, :cond_8

    return-object v1

    :cond_8
    if-eqz v3, :cond_9

    :goto_3
    if-ge v4, v2, :cond_9

    aget-byte p1, v5, v4

    rem-int/lit8 v1, v4, 0x4

    aget-byte v1, v3, v1

    xor-int/2addr p1, v1

    int-to-byte p1, p1

    aput-byte p1, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_9
    new-instance p1, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;

    invoke-direct {p1, v0, v5}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketFrame;-><init>(I[B)V

    return-object p1

    :cond_a
    return-object v1
.end method

.method private final sendHttpResponse(Ljava/io/BufferedOutputStream;Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;)V
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1208dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->getCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->getStatus()Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x120a4fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->getBody()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lw7;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-wide v3, -0x12f7cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-wide v3, -0x12f0afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Luz;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x12e52fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0x12e54fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v1, v3}, LBz;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x12e57fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-wide v3, -0x12e5afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer$HttpResponse;->getBody()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    const-wide v0, -0x12e68fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->flush()V

    return-void
.end method

.method public static synthetic start$default(Lio/github/cherrywechat/lua/dev/CherryDevServer;Landroid/content/Context;IILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/16 p2, 0x2537

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->start(Landroid/content/Context;I)Z

    move-result p0

    return p0
.end method

.method private static final start$lambda$0()V
    .locals 2

    const-wide v0, -0x12d45fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12d55fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->INSTANCE:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->acceptConnections()V

    return-void
.end method


# virtual methods
.method public final broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    const-wide v0, -0x138eefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x138f4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x138f8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-wide v1, -0x13880fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x13885fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x13889fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    const-wide v1, -0x1388ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    const-wide p1, -0x13893fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {p3}, Lsm;->a(Ljava/lang/String;)Lkotlinx/serialization/json/d;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    const-wide p1, -0x1389bfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    sget p3, Lsm;->a:I

    new-instance p3, LBm;

    const/4 v1, 0x0

    invoke-direct {p3, p2, v1}, LBm;-><init>(Ljava/lang/Object;Z)V

    invoke-interface {v0, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/b;

    new-instance p1, Lkotlinx/serialization/json/c;

    invoke-direct {p1, v0}, Lkotlinx/serialization/json/c;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, Lkotlinx/serialization/json/c;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->createWebSocketTextFrame(Ljava/lang/String;)[B

    move-result-object p1

    sget-object p2, Lio/github/cherrywechat/lua/dev/CherryDevServer;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance p3, LN2;

    const/4 v0, 0x2

    invoke-direct {p3, v0, p1}, LN2;-><init>(ILjava/lang/Object;)V

    invoke-interface {p2, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final getConnectionCount()I
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v0

    return v0
.end method

.method public final getPort()I
    .locals 1

    sget v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->port:I

    return v0
.end method

.method public final getServerUrl()Ljava/lang/String;
    .locals 4

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->getLocalIpAddress()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x138a5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3a

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->port:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isRunning()Z
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final start(Landroid/content/Context;I)Z
    .locals 3

    const-wide v0, -0x139b4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const-wide p1, -0x139b8fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x13848fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return v2

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sput-object p1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->context:Landroid/content/Context;

    sput p2, Lio/github/cherrywechat/lua/dev/CherryDevServer;->port:I

    :try_start_0
    new-instance p1, Ljava/net/ServerSocket;

    sget p2, Lio/github/cherrywechat/lua/dev/CherryDevServer;->port:I

    invoke-direct {p1, p2}, Ljava/net/ServerSocket;-><init>(I)V

    sput-object p1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->serverSocket:Ljava/net/ServerSocket;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p1, Lio/github/cherrywechat/lua/dev/CherryDevServer;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lt8;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lt8;-><init>(I)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object p1, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {p1, p0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->register(Lio/github/cherrywechat/lua/dev/CherryDevServer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    const-wide p1, -0x1386bfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x1387bfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const/4 p1, 0x0

    return p1
.end method

.method public final stop()V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->unregister()V

    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x13815fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;

    invoke-virtual {v1}, Lio/github/cherrywechat/lua/dev/CherryDevServer$WebSocketConnection;->close()V

    goto :goto_0

    :cond_1
    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->wsConnections:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->serverSocket:Ljava/net/ServerSocket;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-wide v0, -0x13827fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x13837fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_2
    :goto_1
    const/4 v0, 0x0

    sput-object v0, Lio/github/cherrywechat/lua/dev/CherryDevServer;->serverSocket:Ljava/net/ServerSocket;

    const-wide v0, -0x138ccfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x138dcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method
