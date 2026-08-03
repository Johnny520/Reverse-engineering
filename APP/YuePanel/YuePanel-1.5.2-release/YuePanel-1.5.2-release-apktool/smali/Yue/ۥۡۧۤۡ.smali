.class public final LYue/ۥۡۧۤۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧۤۡ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:LYue/ۥۡۧۤۡ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:LYue/ۥۡۧۤۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:Landroidx/savedstate/ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۧۤۡ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۧۤۡ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۧۤۡ;->ۥ۟۟۟:LYue/ۥۡۧۤۡ$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۧۤۢ;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۤۡ;->ۥ:LYue/ۥۡۧۤۢ;

    .line 3
    new-instance p1, Landroidx/savedstate/ۥ;

    invoke-direct {p1}, Landroidx/savedstate/ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۤۡ;->ۥ۟:Landroidx/savedstate/ۥ;

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۡۧۤۢ;LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LYue/ۥۡۧۤۡ;-><init>(LYue/ۥۡۧۤۢ;)V

    return-void
.end method

.method public static final ۥ(LYue/ۥۡۧۤۢ;)LYue/ۥۡۧۤۡ;
    .locals 1
    .param p0    # LYue/ۥۡۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۠ۦۡۦ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۡۧۤۡ;->ۥ۟۟۟:LYue/ۥۡۧۤۡ$ۥ;

    invoke-virtual {v0, p0}, LYue/ۥۡۧۤۡ$ۥ;->ۥ(LYue/ۥۡۧۤۢ;)LYue/ۥۡۧۤۡ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ۟()Landroidx/savedstate/ۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۤۡ;->ۥ۟:Landroidx/savedstate/ۥ;

    return-object v0
.end method

.method public final ۥ۟۟()V
    .locals 3
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۤۡ;->ۥ:LYue/ۥۡۧۤۢ;

    invoke-interface {v0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->INITIALIZED:Landroidx/lifecycle/Lifecycle$State;

    if-ne v1, v2, :cond_0

    new-instance v1, Landroidx/savedstate/Recreator;

    iget-object v2, p0, LYue/ۥۡۧۤۡ;->ۥ:LYue/ۥۡۧۤۢ;

    invoke-direct {v1, v2}, Landroidx/savedstate/Recreator;-><init>(LYue/ۥۡۧۤۢ;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    iget-object v1, p0, LYue/ۥۡۧۤۡ;->ۥ۟:Landroidx/savedstate/ۥ;

    invoke-virtual {v1, v0}, Landroidx/savedstate/ۥ;->ۥ۟۟۟ۡ(Landroidx/lifecycle/Lifecycle;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۡۧۤۡ;->ۥ۟۟:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟(Landroid/os/Bundle;)V
    .locals 3
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    iget-boolean v0, p0, LYue/ۥۡۧۤۡ;->ۥ۟۟:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۧۤۡ;->ۥ۟۟()V

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۤۡ;->ۥ:LYue/ۥۡۧۤۢ;

    invoke-interface {v0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_1

    iget-object v0, p0, LYue/ۥۡۧۤۡ;->ۥ۟:Landroidx/savedstate/ۥ;

    invoke-virtual {v0, p1}, Landroidx/savedstate/ۥ;->ۥ۟۟۟ۢ(Landroid/os/Bundle;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "performRestore cannot be called when owner is "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟۟(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation

    const-string v0, "outBundle"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۧۤۡ;->ۥ۟:Landroidx/savedstate/ۥ;

    invoke-virtual {v0, p1}, Landroidx/savedstate/ۥ;->ۥۣ۟۟۟(Landroid/os/Bundle;)V

    return-void
.end method
