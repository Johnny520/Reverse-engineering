.class public Lfun/box001/loader/ZygiskEntry;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    sput-object v0, Lfun/box001/loader/ZygiskEntry;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method static a(Landroid/content/pm/ApplicationInfo;Ljava/lang/ClassLoader;)V
    .locals 3

    sget-object v0, Lfun/box001/loader/ZygiskEntry;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "FunBoxLoadStatus"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "LOADED"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, v2}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    :try_start_0
    sput-object p1, Lfun/box001/shared/Env;->first_classloader:Ljava/lang/ClassLoader;

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    sput-object p0, Lfun/box001/shared/Env;->app_path:Ljava/lang/String;

    const-string p0, "app.bin"

    invoke-static {p0}, La/b;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lfun/box001/shared/Env;->module_path:Ljava/lang/String;

    invoke-static {}, La/b;->o()V

    sget-object p0, Lfun/box001/shared/Env;->module_path:Ljava/lang/String;

    sput-object p0, Lfun/box001/shared/Env;->module_core_path:Ljava/lang/String;

    new-instance p0, Lp/f;

    invoke-direct {p0}, Lp/f;-><init>()V

    invoke-static {p0}, Lfun/box001/shared/hook/XHooker;->setImpl(Lfun/box001/shared/hook/XHooker;)V

    invoke-static {}, La/b;->l()V

    invoke-static {}, Lfun/box001/loader/FunLoader;->load()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "FunBox"

    const-string v0, "loadModuleMainFailed"

    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    :goto_0
    return-void
.end method

.method private static b()V
    .locals 5

    :try_start_0
    const-class v0, Landroid/app/LoadedApk;

    const-string v1, "createAppFactory"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/content/pm/ApplicationInfo;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/ClassLoader;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-instance v1, Lfun/box001/loader/a;

    invoke-direct {v1}, Lfun/box001/loader/a;-><init>()V

    invoke-static {v0, v1}, Lcom/shooker/SHooker;->a(Ljava/lang/reflect/Member;La/b;)Lo/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    const-string v1, "FunBox"

    const-string v2, "hookAndWaitAppInitFailed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public static init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x4

    sput v0, Lfun/box001/shared/Env;->load_type:I

    sput-object p0, Lfun/box001/shared/Env;->process_name:Ljava/lang/String;

    sput-object p1, Lfun/box001/shared/Env;->data_dir:Ljava/lang/String;

    sput-object p2, Lfun/box001/shared/Env;->module_core_path:Ljava/lang/String;

    const/4 p1, 0x3

    sput p1, Lfun/box001/shared/Env;->api_type:I

    const-string p1, ":"

    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    sget-object p0, Lfun/box001/shared/Env;->process_name:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    aget-object p0, p0, v0

    :cond_0
    sput-object p0, Lfun/box001/shared/Env;->package_name:Ljava/lang/String;

    const-string p0, "EnterJavaEnv"

    const-string p1, "FunBox"

    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const-string p0, "/files/mmkv/account_dbs"

    :try_start_0
    sget-object p2, Lfun/box001/shared/Env;->module_core_path:Ljava/lang/String;

    const-string v1, "lib/arm64-v8a/libshooker.so"

    invoke-static {p2, v1}, Lfun/box001/loader/utils/FileUtils;->readZipEntry(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lfun/box001/shared/Env;->data_dir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p2}, Lfun/box001/loader/utils/FileUtils;->d(Ljava/lang/String;[B)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lfun/box001/shared/Env;->data_dir:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/System;->load(Ljava/lang/String;)V

    new-instance p2, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lfun/box001/shared/Env;->data_dir:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lfun/box001/loader/utils/FileUtils;->b(Ljava/io/File;)V

    invoke-static {}, Lcom/shooker/SHooker;->_init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p2, "load SHooker failed"

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {}, Lfun/box001/loader/ZygiskEntry;->b()V

    return-void
.end method
