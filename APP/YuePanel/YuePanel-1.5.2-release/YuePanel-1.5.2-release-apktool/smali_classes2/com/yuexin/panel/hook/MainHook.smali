.class public Lcom/yuexin/panel/hook/MainHook;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lde/robv/android/xposed/IXposedHookLoadPackage;
.implements Lde/robv/android/xposed/IXposedHookZygoteInit;


# static fields
.field public static final ۥۣ۟۟۠:Ljava/lang/String; = "com.yuexin.panel"

.field public static final ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public static ۥ۟۟۠ۥ:Ljava/lang/ClassLoader;

.field public static ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile ۥ۟۟۠ۨ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic ۥ()V
    .locals 0

    invoke-static {}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟()V

    return-void
.end method

.method public static synthetic ۥ۟(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 0

    invoke-static {p0}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۟۟(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    return-void
.end method

.method public static ۥ۟۟()V
    .locals 2

    sget-boolean v0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۨ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۨ:Z

    if-eqz v1, :cond_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    const-string v1, "miao"

    invoke-static {v1}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۟۠(Ljava/lang/String;)V

    sget-object v1, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-static {v1}, Lcom/yuexin/panel/security/SignatureGuard;->assertValid(Ljava/lang/String;)V

    const-string v1, "yuexin"

    invoke-static {v1}, LYue/ۥۡۢ۠ۨ;->ۥ۟(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "yuexinya"

    invoke-static {v1}, LYue/ۥۡۢ۠ۨ;->ۥ۟(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    const-string v1, "yuexinya"

    invoke-static {v1}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۟۠(Ljava/lang/String;)V

    const-string v1, "yuexin"

    invoke-static {v1}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۟۠(Ljava/lang/String;)V

    :cond_3
    const-string v1, "dexkit"

    invoke-static {v1}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۟۠(Ljava/lang/String;)V

    const-string v1, "url_encode"

    invoke-static {v1}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۟۠(Ljava/lang/String;)V

    const/4 v1, 0x1

    sput-boolean v1, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۨ:Z

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static ۥ۟۟۟()Lorg/luckypray/dexkit/DexKitBridge;
    .locals 1

    invoke-static {}, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟()V

    sget-object v0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-static {v0}, Lcom/yuexin/panel/security/SignatureGuard;->assertValid(Ljava/lang/String;)V

    sget-object v0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۧ:Ljava/lang/String;

    invoke-static {v0}, Lorg/luckypray/dexkit/DexKitBridge;->create(Ljava/lang/String;)Lorg/luckypray/dexkit/DexKitBridge;

    move-result-object v0

    return-object v0
.end method

.method public static ۥ۟۟۟۟(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 1

    iget-object v0, p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    sput-object v0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۥ:Ljava/lang/ClassLoader;

    iget-object v0, p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    iget-object p0, p0, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->appInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    sput-object p0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۧ:Ljava/lang/String;

    sget-object p0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-static {p0}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠۠(Ljava/lang/String;)V

    sget-object p0, Lcom/kongzue/dialogx/DialogX$IMPL_MODE;->WINDOW:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    sput-object p0, Lcom/kongzue/dialogx/DialogX;->implIMPLMode:Lcom/kongzue/dialogx/DialogX$IMPL_MODE;

    sget-object p0, Lcom/kongzue/dialogx/DialogX$THEME;->AUTO:Lcom/kongzue/dialogx/DialogX$THEME;

    sput-object p0, Lcom/kongzue/dialogx/DialogX;->globalTheme:Lcom/kongzue/dialogx/DialogX$THEME;

    const/4 p0, 0x1

    sput-boolean p0, Lcom/kongzue/dialogx/DialogX;->enableImmersiveMode:Z

    const-class p0, Lcom/yuexin/panel/hook/MainHook;

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۥ(Ljava/lang/ClassLoader;)V

    sget-object p0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۥ:Ljava/lang/ClassLoader;

    invoke-static {p0}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۠(Ljava/lang/ClassLoader;)V

    invoke-static {v0}, LYue/ۥ۠ۥۢ;->ۥ(Ljava/lang/String;)V

    sget-object p0, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۥ:Ljava/lang/ClassLoader;

    invoke-static {p0}, LYue/ۥ۠ۤۦۣ;->ۥ(Ljava/lang/ClassLoader;)V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۥ()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-static {p0}, LYue/ۥ۠ۤۦۣ;->ۥ۟(Ljava/lang/ClassLoader;)V

    return-void
.end method

.method public static ۥ۟۟۟۠(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۡۢ۠ۨ;->ۥ۟۟(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 2

    iget-boolean v0, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->isFirstApplication:Z

    if-eqz v0, :cond_1

    const-string v0, "com.yuexin.panel"

    iget-object v1, p1, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/yuexin/panel/hook/MainHook$ۥ;

    invoke-direct {v0, p0, p1}, Lcom/yuexin/panel/hook/MainHook$ۥ;-><init>(Lcom/yuexin/panel/hook/MainHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V

    const-class p1, Landroid/content/Context;

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-class v0, Landroid/app/Application;

    const-string v1, "attach"

    invoke-static {v0, v1, p1}, Lde/robv/android/xposed/XposedHelpers;->findAndHookMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    :cond_1
    :goto_0
    return-void
.end method

.method public initZygote(Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;)V
    .locals 0

    iget-object p1, p1, Lde/robv/android/xposed/IXposedHookZygoteInit$StartupParam;->modulePath:Ljava/lang/String;

    sput-object p1, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۦ:Ljava/lang/String;

    sput-object p1, Lcom/kongzue/dialogx/wrapper/ModuleUtil;->modulePath:Ljava/lang/String;

    sget-object p1, Lcom/yuexin/panel/hook/MainHook;->ۥ۟۟۠ۦ:Ljava/lang/String;

    invoke-static {p1}, LYue/ۥۡۢ۠ۨ;->ۥ۟۟۟۠(Ljava/lang/String;)V

    return-void
.end method
