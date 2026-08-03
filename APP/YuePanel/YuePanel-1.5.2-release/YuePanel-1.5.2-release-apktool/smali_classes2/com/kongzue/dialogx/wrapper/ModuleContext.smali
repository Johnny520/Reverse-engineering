.class public Lcom/kongzue/dialogx/wrapper/ModuleContext;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# instance fields
.field private mLayoutInflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    invoke-static {}, Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;->getInstance()Lcom/kongzue/dialogx/wrapper/ModuleClassLoader;

    move-result-object v0

    return-object v0
.end method

.method public getResources()Landroid/content/res/Resources;
    .locals 1

    invoke-super {p0}, Landroid/content/ContextWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/kongzue/dialogx/wrapper/ModuleUtil;->injectModuleAppResources(Landroid/content/res/Resources;)V

    return-object v0
.end method

.method public getSystemService(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/view/LayoutInflater;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kongzue/dialogx/wrapper/ModuleContext;->mLayoutInflater:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    check-cast p1, Landroid/view/LayoutInflater;

    invoke-virtual {p1, p0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/kongzue/dialogx/wrapper/ModuleContext;->mLayoutInflater:Landroid/view/LayoutInflater;

    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object p1

    new-instance v0, Lcom/kongzue/dialogx/wrapper/ModuleInflaterFactory;

    invoke-virtual {p0}, Lcom/kongzue/dialogx/wrapper/ModuleContext;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/kongzue/dialogx/wrapper/ModuleInflaterFactory;-><init>(Landroid/view/LayoutInflater$Factory;Ljava/lang/ClassLoader;)V

    iget-object p1, p0, Lcom/kongzue/dialogx/wrapper/ModuleContext;->mLayoutInflater:Landroid/view/LayoutInflater;

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    :cond_0
    iget-object p1, p0, Lcom/kongzue/dialogx/wrapper/ModuleContext;->mLayoutInflater:Landroid/view/LayoutInflater;

    :cond_1
    return-object p1
.end method
