.class public final Lio/github/cherrywechat/lua/loader/ScriptManager;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

.field private static final TAG:Ljava/lang/String;

.field private static final loadedScripts:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/github/cherrywechat/lua/loader/LoadedScript;",
            ">;"
        }
    .end annotation
.end field

.field private static final mainHandler:Landroid/os/Handler;

.field private static final scriptIdCounter:Ljava/util/concurrent/atomic/AtomicLong;

.field private static final stateListeners:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/github/cherrywechat/lua/loader/ScriptStateListener;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-wide v0, -0x15b81fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/loader/ScriptManager;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadedScripts:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->scriptIdCounter:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->stateListeners:Ljava/util/List;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->mainHandler:Landroid/os/Handler;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/github/cherrywechat/lua/loader/LoadedScript;)V
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->notifyStateChanged$lambda$10(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    return-void
.end method

.method public static synthetic b(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/loader/ScriptManager;->executeScript$lambda$5(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V

    return-void
.end method

.method public static synthetic c(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/Exception;Lfj;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/loader/ScriptManager;->executeScript$lambda$5$lambda$4(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/Exception;Lfj;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Object;Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/loader/ScriptManager;->executeScript$lambda$5$lambda$3(Ljava/lang/Object;Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V

    return-void
.end method

.method public static synthetic executeScript$default(Lio/github/cherrywechat/lua/loader/ScriptManager;Ljava/lang/String;Lfj;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/lua/loader/ScriptManager;->executeScript(Ljava/lang/String;Lfj;)V

    return-void
.end method

.method private static final executeScript$lambda$5(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V
    .locals 8

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getFilePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getLuaContext()Lio/github/cherrywechat/lua/LuaContext;

    move-result-object v1

    invoke-virtual {v1, v0}, Lio/github/cherrywechat/lua/LuaContext;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->mainHandler:Landroid/os/Handler;

    new-instance v2, LNk;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v7, 0x1

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    :try_start_1
    invoke-direct/range {v2 .. v7}, LNk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    :goto_0
    move-object p0, v0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v4, p0

    move-object v6, p2

    goto :goto_0

    :goto_1
    sget-object p1, Lio/github/cherrywechat/lua/loader/ScriptManager;->mainHandler:Landroid/os/Handler;

    new-instance p2, Lr8;

    const/4 v0, 0x4

    invoke-direct {p2, v4, p0, v6, v0}, Lr8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final executeScript$lambda$5$lambda$3(Ljava/lang/Object;Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V
    .locals 2

    instance-of v0, p0, LGw;

    if-nez v0, :cond_2

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->COMPLETED:Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-virtual {p1, v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->setState(Lio/github/cherrywechat/lua/loader/ScriptState;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->setLastResult(Ljava/lang/String;)V

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-direct {v0, p1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->notifyStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getAutoRelease()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, p2}, Lio/github/cherrywechat/lua/loader/ScriptManager;->unloadScript(Ljava/lang/String;)Z

    :cond_1
    if-eqz p3, :cond_2

    new-instance p2, LHw;

    invoke-direct {p2, p0}, LHw;-><init>(Ljava/lang/Object;)V

    invoke-interface {p3, p2}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {p0}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-eqz p0, :cond_3

    sget-object p2, Lio/github/cherrywechat/lua/loader/ScriptState;->ERROR:Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-virtual {p1, p2}, Lio/github/cherrywechat/lua/loader/LoadedScript;->setState(Lio/github/cherrywechat/lua/loader/ScriptState;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/github/cherrywechat/lua/loader/LoadedScript;->setLastError(Ljava/lang/String;)V

    sget-object p2, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-direct {p2, p1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->notifyStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    if-eqz p3, :cond_3

    new-instance p1, LGw;

    invoke-direct {p1, p0}, LGw;-><init>(Ljava/lang/Throwable;)V

    new-instance p0, LHw;

    invoke-direct {p0, p1}, LHw;-><init>(Ljava/lang/Object;)V

    invoke-interface {p3, p0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method private static final executeScript$lambda$5$lambda$4(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/Exception;Lfj;)V
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptState;->ERROR:Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-virtual {p0, v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->setState(Lio/github/cherrywechat/lua/loader/ScriptState;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->setLastError(Ljava/lang/String;)V

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-direct {v0, p0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->notifyStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    if-eqz p2, :cond_0

    new-instance p0, LGw;

    invoke-direct {p0, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    new-instance p1, LHw;

    invoke-direct {p1, p0}, LHw;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static synthetic loadAndExecute$default(Lio/github/cherrywechat/lua/loader/ScriptManager;Landroid/content/Context;Ljava/io/File;ZLfj;ILjava/lang/Object;)Lio/github/cherrywechat/lua/loader/LoadedScript;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x1

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadAndExecute(Landroid/content/Context;Ljava/io/File;ZLfj;)Lio/github/cherrywechat/lua/loader/LoadedScript;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic loadScript$default(Lio/github/cherrywechat/lua/loader/ScriptManager;Landroid/content/Context;Ljava/io/File;ZILjava/lang/Object;)Lio/github/cherrywechat/lua/loader/LoadedScript;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadScript(Landroid/content/Context;Ljava/io/File;Z)Lio/github/cherrywechat/lua/loader/LoadedScript;

    move-result-object p0

    return-object p0
.end method

.method private final notifyStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->mainHandler:Landroid/os/Handler;

    new-instance v1, LN2;

    const/16 v2, 0x17

    invoke-direct {v1, v2, p1}, LN2;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final notifyStateChanged$lambda$10(Lio/github/cherrywechat/lua/loader/LoadedScript;)V
    .locals 2

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->stateListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/loader/ScriptStateListener;

    invoke-interface {v1, p0}, Lio/github/cherrywechat/lua/loader/ScriptStateListener;->onScriptStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final parseScriptMetadata(Ljava/lang/String;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, LMv;

    const-wide v2, -0x15b2dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    packed-switch v3, :pswitch_data_0

    const/4 p1, 0x0

    throw p1

    :pswitch_0
    const/16 v4, 0x80

    goto :goto_0

    :pswitch_1
    const/16 v4, 0x20

    goto :goto_0

    :pswitch_2
    const/4 v4, 0x4

    goto :goto_0

    :pswitch_3
    const/4 v4, 0x1

    goto :goto_0

    :pswitch_4
    const/16 v4, 0x10

    goto :goto_0

    :pswitch_5
    const/16 v4, 0x8

    goto :goto_0

    :pswitch_6
    const/4 v4, 0x2

    :goto_0
    and-int/lit8 v5, v4, 0x2

    if-eqz v5, :cond_0

    or-int/lit8 v4, v4, 0x40

    :cond_0
    invoke-static {v2, v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-direct {v1, v2}, LMv;-><init>(Ljava/util/regex/Pattern;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ltz v2, :cond_2

    new-instance v2, Lf;

    const/16 v4, 0x9

    invoke-direct {v2, v4, v1, p1}, Lf;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, LLv;->i:LLv;

    new-instance v1, Lyj;

    invoke-direct {v1, v2, p1}, Lyj;-><init>(LUi;Lfj;)V

    new-instance p1, Lxj;

    invoke-direct {p1, v1}, Lxj;-><init>(Lyj;)V

    :goto_1
    invoke-virtual {p1}, Lxj;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lxj;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzq;

    invoke-virtual {v1}, Lzq;->a()Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x1

    check-cast v2, Lyq;

    invoke-virtual {v2, v4}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-wide v4, -0x15bc2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v1}, Lzq;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Lyq;

    invoke-virtual {v1, v3}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Start index out of bounds: 0, input length: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final registerLocalRequire(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x154e9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x154affffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Luz;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/github/cherrywechat/lua/LuaContext;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, LGw;

    if-eqz p2, :cond_0

    const-wide v0, -0x15b7ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15b0dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {p1}, LHw;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_0
    return-void
.end method


# virtual methods
.method public final addStateListener(Lio/github/cherrywechat/lua/loader/ScriptStateListener;)V
    .locals 2

    const-wide v0, -0x154d7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->stateListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final cleanup()V
    .locals 2

    invoke-virtual {p0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->unloadAll()V

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->stateListeners:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const-wide v0, -0x15bd3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15be1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final executeScript(Ljava/lang/String;Lfj;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lfj;",
            ")V"
        }
    .end annotation

    const-wide v0, -0x155d3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadedScripts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/lua/loader/LoadedScript;

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x155dcfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance p1, LGw;

    invoke-direct {p1, v0}, LGw;-><init>(Ljava/lang/Throwable;)V

    new-instance v0, LHw;

    invoke-direct {v0, p1}, LHw;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getState()Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v1

    sget-object v2, Lio/github/cherrywechat/lua/loader/ScriptState;->UNLOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    if-ne v1, v2, :cond_2

    if-eqz p2, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x155effffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance v0, LGw;

    invoke-direct {v0, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    new-instance p1, LHw;

    invoke-direct {p1, v0}, LHw;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, p1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void

    :cond_2
    sget-object v1, Lio/github/cherrywechat/lua/loader/ScriptState;->RUNNING:Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-virtual {v0, v1}, Lio/github/cherrywechat/lua/loader/LoadedScript;->setState(Lio/github/cherrywechat/lua/loader/ScriptState;)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->notifyStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lr8;

    invoke-direct {v2, v0, p1, p2}, Lr8;-><init>(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Lfj;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final getLoadedScripts()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/lua/loader/LoadedScript;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadedScripts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x1543cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/github/cherrywechat/lua/loader/LoadedScript;

    invoke-virtual {v3}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getState()Lio/github/cherrywechat/lua/loader/ScriptState;

    move-result-object v3

    sget-object v4, Lio/github/cherrywechat/lua/loader/ScriptState;->UNLOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    if-eq v3, v4, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getScript(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/LoadedScript;
    .locals 2

    const-wide v0, -0x154cefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadedScripts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/github/cherrywechat/lua/loader/LoadedScript;

    return-object p1
.end method

.method public final loadAndExecute(Landroid/content/Context;Ljava/io/File;ZLfj;)Lio/github/cherrywechat/lua/loader/LoadedScript;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            "Z",
            "Lfj;",
            ")",
            "Lio/github/cherrywechat/lua/loader/LoadedScript;"
        }
    .end annotation

    const-wide v0, -0x15587fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1558ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadScript(Landroid/content/Context;Ljava/io/File;Z)Lio/github/cherrywechat/lua/loader/LoadedScript;

    move-result-object p1

    if-nez p1, :cond_1

    const-wide v0, -0x1559afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x155a8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    if-eqz p4, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v0, -0x15440fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    new-instance p1, LHw;

    invoke-direct {p1, p2}, LHw;-><init>(Ljava/lang/Object;)V

    invoke-interface {p4, p1}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, p4}, Lio/github/cherrywechat/lua/loader/ScriptManager;->executeScript(Ljava/lang/String;Lfj;)V

    return-object p1
.end method

.method public final loadScript(Landroid/content/Context;Ljava/io/File;Z)Lio/github/cherrywechat/lua/loader/LoadedScript;
    .locals 22

    move-object/from16 v0, p0

    const-wide v1, -0x156c6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x156cefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-wide v3, -0x156fffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1568cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v1, v4, v3}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-wide v3, -0x15691fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1569ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    return-object v2

    :cond_1
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v3, -0x156bffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lio/github/cherrywechat/lua/loader/ScriptManager;->scriptIdCounter:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    move-object v12, v1

    goto :goto_2

    :cond_3
    :goto_1
    const-wide v3, -0x15547fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :goto_2
    invoke-static/range {p2 .. p2}, Lwh;->c0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-static/range {p2 .. p2}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lio/github/cherrywechat/lua/loader/ScriptManager;->parseScriptMetadata(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    sget-object v4, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    sget-object v5, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {v5}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v4, v6, v5}, Lio/github/cherrywechat/lua/LuaEngine;->createContext(Ljava/lang/String;Landroid/app/Activity;)Lio/github/cherrywechat/lua/LuaContext;

    move-result-object v13

    invoke-direct {v0, v13, v12}, Lio/github/cherrywechat/lua/loader/ScriptManager;->registerLocalRequire(Lio/github/cherrywechat/lua/LuaContext;Ljava/lang/String;)V

    new-instance v5, Lio/github/cherrywechat/lua/loader/LoadedScript;

    const-wide v7, -0x15548fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_4

    move-object v7, v1

    goto :goto_3

    :cond_4
    move-object v7, v4

    :goto_3
    const-wide v8, -0x1554dfffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_5

    const-wide v8, -0x15554fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_5
    move-object v8, v1

    const-wide v9, -0x1555cfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_6

    const-wide v9, -0x15564fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_6
    move-object v9, v1

    const-wide v10, -0x1556afffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_7

    const-wide v3, -0x15576fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_7
    move-object v10, v1

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    const-wide v3, -0x15577fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    sget-object v15, Lio/github/cherrywechat/lua/loader/ScriptState;->LOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    const/16 v20, 0x1c00

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    move/from16 v14, p3

    invoke-direct/range {v5 .. v21}, Lio/github/cherrywechat/lua/loader/LoadedScript;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/lua/LuaContext;ZLio/github/cherrywechat/lua/loader/ScriptState;Ljava/lang/String;Ljava/lang/String;JILOc;)V

    sget-object v1, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadedScripts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, v5}, Lio/github/cherrywechat/lua/loader/ScriptManager;->notifyStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    const-wide v3, -0x1550cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1551afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v5}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getName()Ljava/lang/String;

    const-wide v3, -0x1552afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v5

    :catch_0
    const-wide v3, -0x1552dfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x1553bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    return-object v2

    :cond_8
    :goto_4
    const-wide v3, -0x156d9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    const-wide v3, -0x156e7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    return-object v2
.end method

.method public final removeStateListener(Lio/github/cherrywechat/lua/loader/ScriptStateListener;)V
    .locals 2

    const-wide v0, -0x154e0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->stateListeners:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final unloadAll()V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadedScripts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const-wide v1, -0x1542cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, Lio/github/cherrywechat/lua/loader/ScriptManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptManager;

    invoke-virtual {v2, v1}, Lio/github/cherrywechat/lua/loader/ScriptManager;->unloadScript(Ljava/lang/String;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final unloadScript(Ljava/lang/String;)Z
    .locals 4

    const-wide v0, -0x15458fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptManager;->loadedScripts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/lua/loader/LoadedScript;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    sget-object v2, Lio/github/cherrywechat/lua/loader/ScriptState;->UNLOADED:Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-virtual {v0, v2}, Lio/github/cherrywechat/lua/loader/LoadedScript;->setState(Lio/github/cherrywechat/lua/loader/ScriptState;)V

    sget-object v2, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v2, p1}, Lio/github/cherrywechat/lua/LuaEngine;->destroyContext(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/github/cherrywechat/lua/loader/ScriptManager;->notifyStateChanged(Lio/github/cherrywechat/lua/loader/LoadedScript;)V

    const-wide v2, -0x15461fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x1546ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/LoadedScript;->getName()Ljava/lang/String;

    const-wide v2, -0x15401fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const-wide v2, -0x15404fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x15412fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    return v1
.end method
