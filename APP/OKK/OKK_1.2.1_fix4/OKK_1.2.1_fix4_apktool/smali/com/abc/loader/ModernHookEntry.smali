.class public final Lcom/abc/loader/ModernHookEntry;
.super Lio/github/libxposed/api/XposedModule;
.source "SourceFile"


# annotations
.annotation build La/a;
.end annotation


# static fields
.field private static final Companion:Lf0/d0;

.field public static final TAG:Ljava/lang/String; = "OKK-Modern"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final WECHAT_PACKAGE:Ljava/lang/String; = "com.tencent.mm"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/abc/loader/ModernHookEntry;->Companion:Lf0/d0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lio/github/libxposed/api/XposedModule;-><init>()V

    return-void
.end method


# virtual methods
.method public onModuleLoaded(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V
    .locals 1

    const-string v0, "param"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object p1, p0

    check-cast p1, Lio/github/libxposed/api/XposedModule;

    invoke-static {p1}, Lde/robv/android/xposed/d;->c(Lio/github/libxposed/api/XposedModule;)V

    :try_start_0
    invoke-virtual {p0}, Lcom/abc/loader/ModernHookEntry;->getModuleApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {p1}, Lf0/P;->U(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    return-void
.end method

.method public onPackageReady(Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;)V
    .locals 4

    const-string v0, "param"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.tencent.mm"

    invoke-static {v0, v1}, LQ0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, LB/c;->p()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPackageName(...)"

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_5

    :cond_2
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->processName:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-static {v0}, LW0/j;->R0(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    if-eqz v3, :cond_3

    move-object v2, v0

    :cond_3
    if-nez v2, :cond_4

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v0, v2

    :cond_5
    :goto_1
    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->isFirstPackage()Z

    sget-object v2, Lf0/c0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->isFirstPackage()Z

    move-result v1

    invoke-interface {p1}, Lio/github/libxposed/api/XposedModuleInterface$PackageReadyParam;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const-string v3, "getClassLoader(...)"

    invoke-static {p1, v3}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/abc/loader/ModernHookEntry;->getModuleApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {v2, v0, v1, p1, v3}, Lf0/c0;->b(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/ClassLoader;Ljava/lang/String;)V

    return-void
.end method
