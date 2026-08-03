.class public final Lio/github/cherrywechat/lua/loader/ScriptPackageManager;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;
    }
.end annotation


# static fields
.field public static final INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptPackageManager;

.field private static final PACKAGES_DIR:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String;

.field private static final loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x141acfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->TAG:Ljava/lang/String;

    const-wide v0, -0x14041fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->PACKAGES_DIR:Ljava/lang/String;

    new-instance v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;

    invoke-direct {v0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptPackageManager;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->listPackages$lambda$1(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method private static final listPackages$lambda$1(Ljava/io/File;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result p0

    return p0
.end method

.method private final setupScriptGlobals(Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;)V
    .locals 4

    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    const-wide v1, -0x158f1fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide v1, -0x158fafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide v1, -0x15888fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide v1, -0x15893fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getAuthor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide v1, -0x158a0fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide v1, -0x158a9fffff835L

    :try_start_0
    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lgf;->A()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide v1, -0x158b2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lgf;->I()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide v1, -0x158b8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lgf;->A()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lio/github/cherrywechat/lua/LuaEngine;->setGlobal(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-wide v0, -0x158bffffff835L

    const-wide v2, -0x14754fffff835L

    invoke-static {v0, v1, v2, v3, p1}, LEy;->i(JJLjava/lang/Exception;)V

    :goto_0
    sget-object p1, Lio/github/cherrywechat/lua/api/CherryAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryAPI;

    sget-object v0, Lio/github/cherrywechat/application/MainApplication;->a:Lio/github/cherrywechat/application/MainApplication;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lgf;->p:Landroid/app/Application;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/app/AndroidAppHelper;->currentApplication()Landroid/app/Application;

    move-result-object v0

    const-wide v1, -0x2f91cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    :goto_1
    invoke-virtual {p1, v0}, Lio/github/cherrywechat/lua/api/CherryAPI;->setCurrentContext(Landroid/content/Context;)V

    sget-object v0, Lgf;->q:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1, v0}, Lio/github/cherrywechat/lua/api/CherryAPI;->setCurrentActivity(Landroid/app/Activity;)V

    return-void
.end method


# virtual methods
.method public final createPackageTemplate-BWLJW6A(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    const-wide v0, -0x146dffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x146e7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x146f1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x146f6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->getPackagesDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-wide p3, -0x146fdfffff835L

    invoke-static {p3, p4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2

    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    new-instance p1, Ljava/io/File;

    const-wide v1, -0x14696fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v2, -0x146a0fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, -0x146b7fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, -0x1456efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v2, -0x14503fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Luz;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lwh;->i0(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Ljava/io/File;

    const-wide v1, -0x14511fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1451afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1452ffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x145c8fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x14598fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1438dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1429dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Luz;->D(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lwh;->i0(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Ljava/io/File;

    const-wide v1, -0x14165fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1416efffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide p3, -0x14174fffff835L

    invoke-static {p3, p4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lwh;->i0(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-wide p2, -0x1417bfffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadPackageInfo(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide p2, -0x14110fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    const-wide p2, -0x14129fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x1413efffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_0
    invoke-static {v0}, Lwh;->b0(Ljava/io/File;)Z

    const-wide p2, -0x141d9fffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    const-wide p2, -0x141eefffff835L

    invoke-static {p2, p3}, LGu;->r(J)Ljava/lang/String;

    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public final executePackage-gIAlu-s(Landroid/content/Context;Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;)Ljava/lang/Object;
    .locals 3

    const-wide v0, -0x159b9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15841fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 8
    invoke-virtual {p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x15845fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 10
    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2

    :cond_0
    const-wide v0, -0x1585ffffff835L

    .line 11
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15874fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getName()Ljava/lang/String;

    const-wide v0, -0x15808fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getId()Ljava/lang/String;

    .line 12
    :try_start_0
    sget-object v0, Lio/github/cherrywechat/lua/LuaEngine;->INSTANCE:Lio/github/cherrywechat/lua/LuaEngine;

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/LuaEngine;->isInitialized()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 13
    invoke-static {v0, p1, v2, v1, v2}, Lio/github/cherrywechat/lua/LuaEngine;->init$default(Lio/github/cherrywechat/lua/LuaEngine;Landroid/content/Context;Ljava/lang/ClassLoader;ILjava/lang/Object;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    invoke-direct {p0, p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->setupScriptGlobals(Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;)V

    .line 15
    invoke-virtual {p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getMainFile()Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object p1

    .line 16
    invoke-virtual {v0, p1}, Lio/github/cherrywechat/lua/LuaEngine;->execute-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    .line 17
    instance-of v0, p1, LGw;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p2, v0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->setRunning(Z)V

    .line 19
    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v0, -0x1580bfffff835L

    .line 20
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15820fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getName()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object p1

    :goto_1
    const-wide v0, -0x158c0fffff835L

    .line 21
    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x158d5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getName()Ljava/lang/String;

    .line 22
    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public final executePackage-gIAlu-s(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    const-wide v0, -0x159fefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15986fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 1
    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->getPackagesDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 4
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x15990fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0, v0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadPackageInfo(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    .line 5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-wide v0, -0x159a5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 6
    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2

    .line 7
    :cond_1
    invoke-virtual {p0, p1, v0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->executePackage-gIAlu-s(Landroid/content/Context;Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getLoadedPackages()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;",
            ">;"
        }
    .end annotation

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x14190fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v0}, Lra;->r0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getPackagesDir(Landroid/content/Context;)Ljava/io/File;
    .locals 3

    const-wide v0, -0x15acefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    const-wide v1, -0x15ad6fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    return-object v0
.end method

.method public final installPackage-gIAlu-s(Landroid/content/Context;Ljava/io/File;)Ljava/lang/Object;
    .locals 3

    const-wide v0, -0x147e0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x147e8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x147f2fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0, v0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadPackageInfo(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-wide v0, -0x14787fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2

    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->getPackagesDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {v0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v1}, Lwh;->b0(Ljava/io/File;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {p2, v1}, Lwh;->Z(Ljava/io/File;Ljava/io/File;)V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x14797fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadPackageInfo(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    move-result-object p1

    if-nez p1, :cond_2

    new-instance p1, Ljava/lang/IllegalStateException;

    const-wide v0, -0x147acfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2

    :cond_2
    const-wide v0, -0x1464afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1465ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getName()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    const-wide v0, -0x14673fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14608fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance p2, LGw;

    invoke-direct {p2, p1}, LGw;-><init>(Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public final isPackageRunning(Ljava/lang/String;)Z
    .locals 2

    const-wide v0, -0x141a2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final listPackages(Landroid/content/Context;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;",
            ">;"
        }
    .end annotation

    const-wide v0, -0x15ae3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->getPackagesDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lpx;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lpx;-><init>(I)V

    invoke-virtual {p1, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    sget-object v4, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->INSTANCE:Lio/github/cherrywechat/lua/loader/ScriptPackageManager;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    const-wide v5, -0x15aebfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {v4, v3}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadPackageInfo(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$listPackages$$inlined$sortedBy$1;

    invoke-direct {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$listPackages$$inlined$sortedBy$1;-><init>()V

    invoke-static {v0, p1}, Lra;->n0(Ljava/util/List;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final loadPackageInfo(Ljava/lang/String;)Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;
    .locals 11

    const-wide v0, -0x15a80fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/io/File;

    const-wide v3, -0x15a8cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    const-wide v0, -0x15a95fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x15aaafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-object v2

    :cond_1
    new-instance v0, Ljava/io/File;

    const-wide v2, -0x15941fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_2

    :try_start_0
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v2, v3}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v4, v0

    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v3, v4}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    const-wide v3, -0x1594bfffff835L

    const-wide v5, -0x15960fffff835L

    invoke-static {v3, v4, v5, v6, v0}, LEy;->i(JJLjava/lang/Exception;)V

    :cond_2
    :goto_1
    new-instance v0, Ljava/io/File;

    const-wide v3, -0x1597bfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    :try_start_5
    invoke-static {v0}, Lwh;->g0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_2

    :catch_1
    const-wide v3, -0x15904fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :goto_2
    move-object v8, v0

    goto :goto_3

    :cond_3
    const-wide v3, -0x15905fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x15911fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :goto_3
    new-instance v3, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    const-wide v4, -0x15912fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x15915fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    const-wide v5, -0x15926fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v0, v5}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x1592bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const-wide v6, -0x1593cfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v6, -0x159c4fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v0, v6}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-wide v9, -0x159cafffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    const-wide v9, -0x159dbfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v9, -0x159e2fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v0, v7}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-wide v9, -0x159eafffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    const-wide v9, -0x159fbfffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v9, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    move-object v9, p1

    invoke-direct/range {v3 .. v10}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v3

    :cond_4
    :goto_4
    return-object v2
.end method

.method public final stopAllPackages()V
    .locals 3

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-wide v1, -0x14724fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->setRunning(Z)V

    goto :goto_0

    :cond_0
    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    const-wide v0, -0x14736fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x147cbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    return-void
.end method

.method public final stopPackage(Ljava/lang/String;)Z
    .locals 2

    const-wide v0, -0x14773fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->loadedPackages:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->setRunning(Z)V

    const-wide v0, -0x1477dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x14712fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager$ScriptPackage;->getName()Ljava/lang/String;

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final uninstallPackage(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    const-wide v0, -0x14622fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1462afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p0, p2}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->stopPackage(Ljava/lang/String;)Z

    new-instance v0, Ljava/io/File;

    invoke-virtual {p0, p1}, Lio/github/cherrywechat/lua/loader/ScriptPackageManager;->getPackagesDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v0}, Lwh;->b0(Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-wide v0, -0x14634fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x146c9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
