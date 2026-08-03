.class public Lcom/kongzue/dialogx/wrapper/ModuleUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static modulePath:Ljava/lang/String; = ""


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getContext(Landroid/content/Context;)Landroid/content/Context;
    .locals 1

    new-instance v0, Lcom/kongzue/dialogx/wrapper/ModuleContext;

    invoke-direct {v0, p0}, Lcom/kongzue/dialogx/wrapper/ModuleContext;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static getLayoutInflater(Landroid/content/Context;)Landroid/view/LayoutInflater;
    .locals 1

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {p0}, Lcom/kongzue/dialogx/wrapper/ModuleUtil;->getContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    return-object p0
.end method

.method public static injectModuleAppResources(Landroid/content/Context;)V
    .locals 0

    .line 6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-static {p0}, Lcom/kongzue/dialogx/wrapper/ModuleUtil;->injectModuleAppResources(Landroid/content/res/Resources;)V

    return-void
.end method

.method public static injectModuleAppResources(Landroid/content/res/Resources;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DiscouragedPrivateApi"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/kongzue/dialogx/wrapper/ModuleUtil;->modulePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p0

    .line 3
    const-class v0, Landroid/content/res/AssetManager;

    const-string v1, "addAssetPath"

    const-class v2, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 5
    sget-object v1, Lcom/kongzue/dialogx/wrapper/ModuleUtil;->modulePath:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
