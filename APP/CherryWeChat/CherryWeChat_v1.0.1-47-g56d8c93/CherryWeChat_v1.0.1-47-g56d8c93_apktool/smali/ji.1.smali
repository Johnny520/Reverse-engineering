.class public final Lji;
.super LTB;
.source ""

# interfaces
.implements LyE;
.implements LYn;
.implements Lix;
.implements LEi;


# instance fields
.field public final l:Lc3;

.field public final m:Lc3;

.field public final n:Landroid/os/Handler;

.field public final o:LAi;

.field public final synthetic p:Lc3;


# direct methods
.method public constructor <init>(Lc3;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lji;->p:Lc3;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, LAi;

    invoke-direct {v1}, Lzi;-><init>()V

    iput-object v1, p0, Lji;->o:LAi;

    iput-object p1, p0, Lji;->l:Lc3;

    iput-object p1, p0, Lji;->m:Lc3;

    iput-object v0, p0, Lji;->n:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Lhi;)V
    .locals 1

    iget-object v0, p0, Lji;->p:Lc3;

    invoke-virtual {v0, p1}, Lki;->onAttachFragment(Lhi;)V

    return-void
.end method

.method public final getLifecycle()LRn;
    .locals 1

    iget-object v0, p0, Lji;->p:Lc3;

    iget-object v0, v0, Lki;->v:Lao;

    return-object v0
.end method

.method public final getSavedStateRegistry()Lhx;
    .locals 1

    iget-object v0, p0, Lji;->p:Lc3;

    invoke-virtual {v0}, LTa;->getSavedStateRegistry()Lhx;

    move-result-object v0

    return-object v0
.end method

.method public final getViewModelStore()LxE;
    .locals 1

    iget-object v0, p0, Lji;->p:Lc3;

    invoke-virtual {v0}, LTa;->getViewModelStore()LxE;

    move-result-object v0

    return-object v0
.end method

.method public final y(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lji;->p:Lc3;

    invoke-virtual {v0, p1}, Lc3;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final z()Z
    .locals 1

    iget-object v0, p0, Lji;->p:Lc3;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
