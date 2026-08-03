.class public final Lio/github/cherrywechat/lua/LuaEngine;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

.field private static final TAG:Ljava/lang/String;

.field private static final classLoaders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation
.end field

.field private static final contexts:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/github/cherrywechat/lua/LuaContext;",
            ">;"
        }
    .end annotation
.end field

.field private static hookApiEnabled:Z

.field private static volatile initialized:Z

.field private static final mainHandler:Landroid/os/Handler;

.field private static mainLua:Lparty/iroiro/luajava/Lua;

.field private static volatile moduleApkPath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x14a69fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/LuaEngine;->TAG:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/LuaEngine;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/LuaEngine;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/LuaEngine;->contexts:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainHandler:Landroid/os/Handler;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/LuaEngine;->classLoaders:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)LHw;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/LuaEngine;->executeInternal_gIAlu_s$lambda$7(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)LHw;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lparty/iroiro/luajava/Lua;Ljava/lang/String;)LTC;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal$lambda$9$lambda$8(Ljava/lang/Object;Lparty/iroiro/luajava/Lua;Ljava/lang/String;)LTC;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/LuaEngine;->getGlobal$lambda$11$lambda$10(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final checkInitialized()V
    .locals 3

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaEngine;->initialized:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-wide v1, -0x14b8dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic createContext$default(Lio/github/cherrywechat/lua/LuaEngine;Ljava/lang/String;Landroid/app/Activity;ILjava/lang/Object;)Lio/github/cherrywechat/lua/LuaContext;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/lua/LuaEngine;->createContext(Ljava/lang/String;Landroid/app/Activity;)Lio/github/cherrywechat/lua/LuaContext;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lfj;)V
    .locals 0

    invoke-static {p0, p1}, Lio/github/cherrywechat/lua/LuaEngine;->executeOnUiThread$lambda$6(Ljava/lang/String;Lfj;)V

    return-void
.end method

.method private static final executeInternal_gIAlu_s$lambda$7(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)LHw;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, -0x1

    :try_start_0
    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->run(Ljava/lang/String;)V

    invoke-interface {p0}, Lparty/iroiro/luajava/Lua;->getTop()I

    move-result p1

    if-lez p1, :cond_0

    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    move-object p1, v1

    :goto_0
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->setTop(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    :try_start_1
    invoke-interface {p0, v2}, Lparty/iroiro/luajava/Lua;->toString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->setTop(I)V

    const-wide v2, -0x14bbbfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const-wide v2, -0x14a45fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_1
    new-instance p0, Lio/github/cherrywechat/lua/LuaException;

    if-nez v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    const-wide v0, -0x14a5bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-direct {p0, v1}, Lio/github/cherrywechat/lua/LuaException;-><init>(Ljava/lang/String;)V

    new-instance p1, LGw;

    invoke-direct {p1, p0}, LGw;-><init>(Ljava/lang/Throwable;)V

    :goto_2
    new-instance p0, LHw;

    invoke-direct {p0, p1}, LHw;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static synthetic executeOnUiThread$default(Lio/github/cherrywechat/lua/LuaEngine;Ljava/lang/String;Lfj;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/lua/LuaEngine;->executeOnUiThread(Ljava/lang/String;Lfj;)V

    return-void
.end method

.method private static final executeOnUiThread$lambda$6(Ljava/lang/String;Lfj;)V
    .locals 1

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v0, p0}, Lio/github/cherrywechat/lua/LuaEngine;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p1, :cond_0

    new-instance v0, LHw;

    invoke-direct {v0, p0}, LHw;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final extractNativeLibFromApk(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    const-wide v2, -0x14dbdfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    aget-object v1, v1, v3

    :goto_0
    if-nez v1, :cond_1

    const-wide v1, -0x14c4cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v4, -0x14c56fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/zip/ZipFile;

    invoke-direct {v2, p2}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object p2

    if-eqz p2, :cond_4

    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-wide v4, -0x14c5bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, p1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_2
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v1, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {p2}, Ljava/util/zip/ZipEntry;->getSize()J

    move-result-wide v6

    cmp-long p3, v4, v6

    if-nez p3, :cond_3

    const-wide p2, -0x14c6bfffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x14c75fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    return-object p1

    :cond_3
    invoke-virtual {v2, p2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance p3, Ljava/io/FileOutputStream;

    invoke-direct {p3, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p2, p3}, Lcr;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {p3}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-interface {p2}, Ljava/io/Closeable;->close()V

    const/4 p2, 0x1

    invoke-virtual {p1, p2, v3}, Ljava/io/File;->setExecutable(ZZ)Z

    invoke-virtual {p1, p2, v3}, Ljava/io/File;->setReadable(ZZ)Z

    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V

    const-wide p2, -0x14c13fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x14c1dfffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    :try_start_6
    invoke-static {p3, p1}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_2
    :try_start_7
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catchall_3
    move-exception p3

    :try_start_8
    invoke-static {p2, p1}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p3

    :cond_4
    const-wide p1, -0x14c3bfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x14cc5fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v2}, Ljava/util/zip/ZipFile;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    return-object v0

    :goto_3
    const-wide p2, -0x14cdefffff835L

    const-wide v1, -0x14ce8fffff835L

    invoke-static {p2, p3, v1, v2, p1}, LEy;->i(JJLjava/lang/Exception;)V

    return-object v0
.end method

.method private static final getGlobal$lambda$11$lambda$10(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->getGlobal(Ljava/lang/String;)V

    const/4 p1, -0x1

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/Lua;->toObject(I)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lparty/iroiro/luajava/Lua;->pop(I)V

    return-object p1
.end method

.method public static synthetic init$default(Lio/github/cherrywechat/lua/LuaEngine;Landroid/content/Context;Ljava/lang/ClassLoader;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/github/cherrywechat/lua/LuaEngine;->init(Landroid/content/Context;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method private static final setGlobal$lambda$9$lambda$8(Ljava/lang/Object;Lparty/iroiro/luajava/Lua;Ljava/lang/String;)LTC;
    .locals 1

    if-eqz p0, :cond_0

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-interface {p1, p0, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->pushNil()V

    :goto_0
    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->setGlobal(Ljava/lang/String;)V

    sget-object p0, LTC;->a:LTC;

    return-object p0
.end method

.method private final tryLoadNativeLibrary(Landroid/content/Context;)V
    .locals 5

    const-wide v0, -0x14faafffff835L

    :try_start_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-wide v0, -0x14fb1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14fbbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-wide v1, -0x14e68fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x14e72fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, -0x14e0efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    const-wide v0, -0x14e1cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14e26fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    goto/16 :goto_4

    :catch_1
    move-exception v0

    goto :goto_0

    :cond_0
    const-wide v0, -0x14ecefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14ed8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :goto_0
    const-wide v1, -0x14ef6fffff835L

    const-wide v3, -0x14e80fffff835L

    invoke-static {v1, v2, v3, v4, v0}, LEy;->i(JJLjava/lang/Exception;)V

    :goto_1
    :try_start_2
    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->moduleApkPath:Ljava/lang/String;

    if-nez v0, :cond_2

    const-class v0, Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v0}, Ljava/lang/Class;->getProtectionDomain()Ljava/security/ProtectionDomain;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/security/ProtectionDomain;->getCodeSource()Ljava/security/CodeSource;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/security/CodeSource;->getLocation()Ljava/net/URL;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_2
    if-eqz v0, :cond_3

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    const-wide v1, -0x14e95fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x14e9ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x14ebcfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lio/github/cherrywechat/lua/LuaEngine;->extractNativeLibFromApk(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/System;->load(Ljava/lang/String;)V

    const-wide v1, -0x14d49fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    const-wide v1, -0x14d53fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    :goto_3
    const-wide v1, -0x14d7afffff835L

    const-wide v3, -0x14d04fffff835L

    invoke-static {v1, v2, v3, v4, v0}, LEy;->i(JJLjava/lang/Exception;)V

    :cond_3
    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    const-wide v1, -0x14d25fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lio/github/cherrywechat/lua/LuaEngine;->extractNativeLibFromApk(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->load(Ljava/lang/String;)V

    const-wide v0, -0x14d32fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14d3cfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :goto_4
    return-void

    :catch_3
    move-exception p1

    const-wide v0, -0x14de3fffff835L

    const-wide v2, -0x14dedfffff835L

    invoke-static {v0, v1, v2, v3, p1}, LEy;->i(JJLjava/lang/Exception;)V

    :cond_4
    const-wide v0, -0x14d8dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14d97fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final addClassLoader(Ljava/lang/ClassLoader;)V
    .locals 2

    const-wide v0, -0x14c8bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->classLoaders:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaEngine;->hookApiEnabled:Z

    if-eqz v0, :cond_0

    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/api/HookAPI;->addClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    const-wide v0, -0x14c97fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14ca1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final createContext(Ljava/lang/String;Landroid/app/Activity;)Lio/github/cherrywechat/lua/LuaContext;
    .locals 3

    const-wide v0, -0x14b71fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaEngine;->checkInitialized()V

    const-wide v0, -0x14b74fffff835L

    :try_start_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance v0, Lio/github/cherrywechat/lua/LuaContext;

    new-instance v1, Lparty/iroiro/luajava/luajit/LuaJit;

    invoke-direct {v1}, Lparty/iroiro/luajava/luajit/LuaJit;-><init>()V

    sget-object v2, Lio/github/cherrywechat/lua/LuaEngine;->classLoaders:Ljava/util/List;

    invoke-direct {v0, p1, v1, v2, p2}, Lio/github/cherrywechat/lua/LuaContext;-><init>(Ljava/lang/String;Lparty/iroiro/luajava/Lua;Ljava/util/List;Landroid/app/Activity;)V

    sget-object p2, Lio/github/cherrywechat/lua/LuaEngine;->contexts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide p1, -0x14b7bfffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x14b05fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    return-object v0
.end method

.method public final destroyContext(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x14b1dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->contexts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/github/cherrywechat/lua/LuaContext;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/LuaContext;->close()V

    :cond_0
    const-wide v0, -0x14b20fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14b2afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final enableHookAPI()V
    .locals 3

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaEngine;->checkInitialized()V

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaEngine;->hookApiEnabled:Z

    if-eqz v0, :cond_0

    const-wide v0, -0x14cb5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14cbffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainLua:Lparty/iroiro/luajava/Lua;

    if-eqz v0, :cond_1

    sget-object v1, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    sget-object v2, Lio/github/cherrywechat/lua/LuaEngine;->classLoaders:Ljava/util/List;

    invoke-virtual {v1, v2}, Lio/github/cherrywechat/lua/api/HookAPI;->setClassLoaders(Ljava/util/List;)V

    invoke-virtual {v1, v0}, Lio/github/cherrywechat/lua/api/HookAPI;->register(Lparty/iroiro/luajava/Lua;)V

    const/4 v0, 0x1

    sput-boolean v0, Lio/github/cherrywechat/lua/LuaEngine;->hookApiEnabled:Z

    const-wide v0, -0x14b57fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14b61fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public final execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    const-wide v0, -0x14bc1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaEngine;->checkInitialized()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainLua:Lparty/iroiro/luajava/Lua;

    invoke-virtual {p0, v0, p1}, Lio/github/cherrywechat/lua/LuaEngine;->executeInternal-gIAlu-s$app_release(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final executeInternal-gIAlu-s$app_release(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    const-wide v0, -0x14bcbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14bcffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v1, LGp;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, v2}, LGp;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/String;I)V

    invoke-virtual {v0, p1, v1}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LHw;

    iget-object p1, p1, LHw;->a:Ljava/lang/Object;

    return-object p1
.end method

.method public final executeOnUiThread(Ljava/lang/String;Lfj;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lfj;",
            ")V"
        }
    .end annotation

    const-wide v0, -0x14bc6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/LuaEngine;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p2, :cond_0

    new-instance v0, LHw;

    invoke-direct {v0, p1}, LHw;-><init>(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, Lfj;->g(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :cond_1
    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainHandler:Landroid/os/Handler;

    new-instance v1, Ln3;

    const/16 v2, 0xa

    invoke-direct {v1, v2, p1, p2}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final getClassLoaders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/ClassLoader;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->classLoaders:Ljava/util/List;

    invoke-static {v0}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getContext(Ljava/lang/String;)Lio/github/cherrywechat/lua/LuaContext;
    .locals 2

    const-wide v0, -0x14b1afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->contexts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/github/cherrywechat/lua/LuaContext;

    return-object p1
.end method

.method public final getGlobal(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    const-wide v0, -0x14bd9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaEngine;->checkInitialized()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainLua:Lparty/iroiro/luajava/Lua;

    if-eqz v0, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v2, LGp;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, LGp;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/String;I)V

    invoke-virtual {v1, v0, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final declared-synchronized init(Landroid/content/Context;Ljava/lang/ClassLoader;)V
    .locals 5

    monitor-enter p0

    const-wide v0, -0x14f5ffffff835L

    :try_start_0
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaEngine;->initialized:Z

    if-eqz v0, :cond_0

    const-wide p1, -0x14f67fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x14f71fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    :try_start_1
    invoke-direct {p0, p1}, Lio/github/cherrywechat/lua/LuaEngine;->tryLoadNativeLibrary(Landroid/content/Context;)V

    new-instance v0, Lparty/iroiro/luajava/luajit/LuaJit;

    invoke-direct {v0}, Lparty/iroiro/luajava/luajit/LuaJit;-><init>()V

    invoke-virtual {v0}, Lparty/iroiro/luajava/AbstractLua;->openLibraries()V

    sget-object v1, Lio/github/cherrywechat/lua/LuaEngine;->classLoaders:Ljava/util/List;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const-wide v3, -0x14f0ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p2, :cond_1

    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    const-class p2, Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object p2, Lio/github/cherrywechat/lua/bridge/JavaImporter;->INSTANCE:Lio/github/cherrywechat/lua/bridge/JavaImporter;

    invoke-virtual {p2, v0, v1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->register(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    sget-object p2, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryGlobalAPI;

    invoke-virtual {p2, p1}, Lio/github/cherrywechat/lua/api/CherryGlobalAPI;->setCurrentContext(Landroid/content/Context;)V

    sget-object p2, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPIRegistry;

    invoke-virtual {p2, v0, v1}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->registerAll(Lparty/iroiro/luajava/Lua;Ljava/util/List;)V

    sget-object p2, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {v0, p1, p2}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    const-wide p1, -0x14f23fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lparty/iroiro/luajava/AbstractLua;->setGlobal(Ljava/lang/String;)V

    sput-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainLua:Lparty/iroiro/luajava/Lua;

    const/4 p1, 0x1

    sput-boolean p1, Lio/github/cherrywechat/lua/LuaEngine;->initialized:Z

    const-wide p1, -0x14f35fffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;

    const-wide p1, -0x14f3ffffff835L

    invoke-static {p1, p2}, LGu;->r(J)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    const-wide v0, -0x14fe2fffff835L

    :try_start_2
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14fecfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance p2, Ljava/lang/RuntimeException;

    const-wide v0, -0x14f8bfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final isInitialized()Z
    .locals 1

    sget-boolean v0, Lio/github/cherrywechat/lua/LuaEngine;->initialized:Z

    return v0
.end method

.method public final setGlobal(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 4

    const-wide v0, -0x14bd4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Lio/github/cherrywechat/lua/LuaEngine;->checkInitialized()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainLua:Lparty/iroiro/luajava/Lua;

    if-eqz v0, :cond_0

    sget-object v1, Lio/github/cherrywechat/lua/LuaLocks;->INSTANCE:Lio/github/cherrywechat/lua/LuaLocks;

    new-instance v2, LM8;

    const/4 v3, 0x3

    invoke-direct {v2, p2, v0, p1, v3}, LM8;-><init>(Ljava/lang/Object;Ljava/lang/AutoCloseable;Ljava/lang/String;I)V

    invoke-virtual {v1, v0, v2}, Lio/github/cherrywechat/lua/LuaLocks;->withLock(Lparty/iroiro/luajava/Lua;LUi;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setModuleApkPath(Ljava/lang/String;)V
    .locals 2

    const-wide v0, -0x140bafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sput-object p1, Lio/github/cherrywechat/lua/LuaEngine;->moduleApkPath:Ljava/lang/String;

    const-wide v0, -0x140bffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14f49fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final declared-synchronized shutdown()V
    .locals 4

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lio/github/cherrywechat/lua/LuaEngine;->initialized:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-boolean v0, Lio/github/cherrywechat/lua/LuaEngine;->hookApiEnabled:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lio/github/cherrywechat/lua/api/HookAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/HookAPI;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/HookAPI;->cleanup()V

    sput-boolean v1, Lio/github/cherrywechat/lua/LuaEngine;->hookApiEnabled:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    sget-object v0, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPIRegistry;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/api/CherryAPIRegistry;->cleanup()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->contexts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v2, -0x14bdefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/github/cherrywechat/lua/LuaContext;

    invoke-virtual {v2}, Lio/github/cherrywechat/lua/LuaContext;->close()V

    goto :goto_1

    :cond_2
    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->contexts:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainLua:Lparty/iroiro/luajava/Lua;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lparty/iroiro/luajava/Lua;->close()V

    :cond_3
    const/4 v0, 0x0

    sput-object v0, Lio/github/cherrywechat/lua/LuaEngine;->mainLua:Lparty/iroiro/luajava/Lua;

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->classLoaders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    sput-boolean v1, Lio/github/cherrywechat/lua/LuaEngine;->initialized:Z

    const-wide v0, -0x14bf0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14bfafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
