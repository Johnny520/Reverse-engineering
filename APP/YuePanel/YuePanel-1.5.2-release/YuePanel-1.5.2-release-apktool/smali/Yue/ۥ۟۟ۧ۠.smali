.class public abstract LYue/ۥ۟۟ۧ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟۟ۧ۠$ۥ۟;,
        LYue/ۥ۟۟ۧ۠$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:Ljava/lang/String; = "ActionProvider(support)"


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public ۥ۟:LYue/ۥ۟۟ۧ۠$ۥ;

.field public ۥ۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟ۧ۠;->ۥ:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/content/Context;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟ۧ۠;->ۥ:Landroid/content/Context;

    return-object v0
.end method

.method public ۥ۟()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract ۥ۟۟۟()Landroid/view/View;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end method

.method public ۥ۟۟۟۟(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 0
    .param p1    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟۟ۧ۠;->ۥ۟۟۟()Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟۠()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟۟ۡ(Landroid/view/SubMenu;)V
    .locals 0
    .param p1    # Landroid/view/SubMenu;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    return-void
.end method

.method public ۥ۟۟۟ۢ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥۣ۟۟۟()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟۟ۧ۠;->ۥ۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟۟ۧ۠;->ۥ۟۟۟ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۟ۧ۠;->ۥ۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;

    invoke-virtual {p0}, LYue/ۥ۟۟ۧ۠;->ۥ۟۟()Z

    move-result v1

    invoke-interface {v0, v1}, LYue/ۥ۟۟ۧ۠$ۥ۟;->onActionProviderVisibilityChanged(Z)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟ۤ()V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۟۟ۧ۠;->ۥ۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;

    iput-object v0, p0, LYue/ۥ۟۟ۧ۠;->ۥ۟:LYue/ۥ۟۟ۧ۠$ۥ;

    return-void
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥ۟۟ۧ۠$ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۟۟ۧ۠$ۥ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۧ۠;->ۥ۟:LYue/ۥ۟۟ۧ۠$ۥ;

    return-void
.end method

.method public ۥ۟۟۟ۦ(LYue/ۥ۟۟ۧ۠$ۥ۟;)V
    .locals 2
    .param p1    # LYue/ۥ۟۟ۧ۠$ۥ۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟۟ۧ۠;->ۥ۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " instance while it is still in use somewhere else?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ActionProvider(support)"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iput-object p1, p0, LYue/ۥ۟۟ۧ۠;->ۥ۟۟:LYue/ۥ۟۟ۧ۠$ۥ۟;

    return-void
.end method

.method public ۥ۟۟۟ۧ(Z)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟ۧ۠;->ۥ۟:LYue/ۥ۟۟ۧ۠$ۥ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, LYue/ۥ۟۟ۧ۠$ۥ;->ۥ(Z)V

    :cond_0
    return-void
.end method
