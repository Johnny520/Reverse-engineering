.class public Lcom/kongzue/dialogx/wrapper/ModuleInflaterFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory;


# instance fields
.field private final mModuleLoader:Ljava/lang/ClassLoader;

.field private final mOriginFactory:Landroid/view/LayoutInflater$Factory;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater$Factory;Ljava/lang/ClassLoader;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/kongzue/dialogx/wrapper/ModuleInflaterFactory;->mOriginFactory:Landroid/view/LayoutInflater$Factory;

    iput-object p2, p0, Lcom/kongzue/dialogx/wrapper/ModuleInflaterFactory;->mModuleLoader:Ljava/lang/ClassLoader;

    return-void
.end method


# virtual methods
.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p3    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/kongzue/dialogx/wrapper/ModuleInflaterFactory;->mModuleLoader:Ljava/lang/ClassLoader;

    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    const-class v3, Landroid/util/AttributeSet;

    filled-new-array {v2, v3}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v1, p0, Lcom/kongzue/dialogx/wrapper/ModuleInflaterFactory;->mOriginFactory:Landroid/view/LayoutInflater$Factory;

    if-eqz v1, :cond_1

    invoke-interface {v1, p1, p2, p3}, Landroid/view/LayoutInflater$Factory;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0
.end method
