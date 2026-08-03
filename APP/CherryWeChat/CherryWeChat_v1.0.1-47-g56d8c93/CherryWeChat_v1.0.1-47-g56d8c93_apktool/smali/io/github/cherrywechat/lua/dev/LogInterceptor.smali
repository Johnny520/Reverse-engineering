.class public final Lio/github/cherrywechat/lua/dev/LogInterceptor;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/dev/LogInterceptor$LogListener;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

.field public static final LEVEL_DEBUG:Ljava/lang/String;

.field public static final LEVEL_ERROR:Ljava/lang/String;

.field public static final LEVEL_INFO:Ljava/lang/String;

.field public static final LEVEL_VERBOSE:Ljava/lang/String;

.field public static final LEVEL_WARN:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String;

.field private static devServer:Lio/github/cherrywechat/lua/dev/CherryDevServer;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field

.field private static final filterTags:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile interceptSystemLog:Z

.field private static final listeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/lua/dev/LogInterceptor$LogListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x12a49fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->TAG:Ljava/lang/String;

    const-wide v0, -0x12a58fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->LEVEL_DEBUG:Ljava/lang/String;

    const-wide v0, -0x12a5efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->LEVEL_INFO:Ljava/lang/String;

    const-wide v0, -0x12a63fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->LEVEL_WARN:Ljava/lang/String;

    const-wide v0, -0x12a68fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->LEVEL_ERROR:Ljava/lang/String;

    const-wide v0, -0x12a6efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->LEVEL_VERBOSE:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/dev/LogInterceptor;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->INSTANCE:Lio/github/cherrywechat/lua/dev/LogInterceptor;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->listeners:Ljava/util/List;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->filterTags:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->filterTags:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->devServer:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2, p3}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->broadcastLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->listeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/dev/LogInterceptor$LogListener;

    :try_start_0
    invoke-interface {v1, p1, p2, p3}, Lio/github/cherrywechat/lua/dev/LogInterceptor$LogListener;->onLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public static synthetic e$default(Lio/github/cherrywechat/lua/dev/LogInterceptor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final addFilterTag(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12b40fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->filterTags:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addListener(Lio/github/cherrywechat/lua/dev/LogInterceptor$LogListener;)V
    .locals 2

    const-wide v0, -0x12caefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final clearFilterTags()V
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->filterTags:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12b48fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b4cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b54fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const-wide v0, -0x12b7cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b00fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    if-eqz p3, :cond_0

    const-wide v0, -0x12b08fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0xa

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance p2, Ljava/io/StringWriter;

    invoke-direct {p2}, Ljava/io/StringWriter;-><init>()V

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, p2}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p3, v2}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {v2}, Ljava/io/PrintWriter;->flush()V

    invoke-virtual {p2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, p1, p2}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-wide v0, -0x12b0efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3, p1, p2}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final getInterceptSystemLog()Z
    .locals 1

    sget-boolean v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->interceptSystemLog:Z

    return v0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12b5afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b5efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b66fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final isRegistered()Z
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->devServer:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final print(Ljava/lang/String;)V
    .locals 3

    const-wide v0, -0x12b28fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b30fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->devServer:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->getConnectionCount()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-wide v0, -0x12b3afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12bc4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_1
    const-wide v0, -0x12bd4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x12bd9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p1}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final register(Lio/github/cherrywechat/lua/dev/CherryDevServer;)V
    .locals 2

    const-wide v0, -0x12cd3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sput-object p1, Lio/github/cherrywechat/lua/dev/LogInterceptor;->devServer:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    const-wide v0, -0x12cdafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12ce9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final removeFilterTag(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12b44fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->filterTags:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final removeListener(Lio/github/cherrywechat/lua/dev/LogInterceptor$LogListener;)V
    .locals 2

    const-wide v0, -0x12cb7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->listeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final result(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 3

    const-wide v0, -0x12bdffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    if-eqz p2, :cond_0

    const-wide v0, -0x12beafffff835L

    :goto_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    const-wide v0, -0x12beffffff835L

    goto :goto_0

    :goto_1
    if-eqz p2, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x12bf5fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x12bfefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    const-wide v1, -0x12b96fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-wide v1, -0x12b99fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :cond_2
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x12b9afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x12ba3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez p3, :cond_4

    const-wide v1, -0x12baefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p3

    :cond_4
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    const-wide p2, -0x12bbcfffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, v0, p2, p1}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setInterceptSystemLog(Z)V
    .locals 0

    sput-boolean p1, Lio/github/cherrywechat/lua/dev/LogInterceptor;->interceptSystemLog:Z

    return-void
.end method

.method public final unregister()V
    .locals 2

    const/4 v0, 0x0

    sput-object v0, Lio/github/cherrywechat/lua/dev/LogInterceptor;->devServer:Lio/github/cherrywechat/lua/dev/CherryDevServer;

    const-wide v0, -0x12c83fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12c92fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12b14fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b18fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b20fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x12b6bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b6ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12b77fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lio/github/cherrywechat/lua/dev/LogInterceptor;->broadcast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
