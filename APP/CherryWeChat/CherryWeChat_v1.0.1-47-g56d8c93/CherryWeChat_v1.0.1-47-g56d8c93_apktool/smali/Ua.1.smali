.class public LUa;
.super Landroid/app/Dialog;
.source ""

# interfaces
.implements LYn;
.implements Lix;


# instance fields
.field public a:Lao;

.field public final b:Lwy;

.field public final c:Lot;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance p1, Lwy;

    invoke-direct {p1, p0}, Lwy;-><init>(Lix;)V

    iput-object p1, p0, LUa;->b:Lwy;

    new-instance p1, Lot;

    new-instance p2, LN2;

    const/4 v0, 0x7

    invoke-direct {p2, v0, p0}, LN2;-><init>(ILjava/lang/Object;)V

    invoke-direct {p1, p2}, Lot;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, LUa;->c:Lot;

    return-void
.end method

.method public static a(LUa;)V
    .locals 0

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p0}, LUa;->b()V

    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a025f

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a0260

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const v1, 0x550a0261

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final getLifecycle()LRn;
    .locals 1

    iget-object v0, p0, LUa;->a:Lao;

    if-nez v0, :cond_0

    new-instance v0, Lao;

    invoke-direct {v0, p0}, Lao;-><init>(LYn;)V

    iput-object v0, p0, LUa;->a:Lao;

    :cond_0
    return-object v0
.end method

.method public final getSavedStateRegistry()Lhx;
    .locals 1

    iget-object v0, p0, LUa;->b:Lwy;

    iget-object v0, v0, Lwy;->d:Ljava/lang/Object;

    check-cast v0, Lhx;

    return-object v0
.end method

.method public final onBackPressed()V
    .locals 1

    iget-object v0, p0, LUa;->c:Lot;

    invoke-virtual {v0}, Lot;->b()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LU;->d(LUa;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v0

    iget-object v1, p0, LUa;->c:Lot;

    iput-object v0, v1, Lot;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean v0, v1, Lot;->g:Z

    invoke-virtual {v1, v0}, Lot;->c(Z)V

    :cond_0
    iget-object v0, p0, LUa;->b:Lwy;

    invoke-virtual {v0, p1}, Lwy;->d(Landroid/os/Bundle;)V

    iget-object p1, p0, LUa;->a:Lao;

    if-nez p1, :cond_1

    new-instance p1, Lao;

    invoke-direct {p1, p0}, Lao;-><init>(LYn;)V

    iput-object p1, p0, LUa;->a:Lao;

    :cond_1
    sget-object v0, LOn;->ON_CREATE:LOn;

    invoke-virtual {p1, v0}, Lao;->e(LOn;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Bundle;
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    iget-object v1, p0, LUa;->b:Lwy;

    invoke-virtual {v1, v0}, Lwy;->e(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    iget-object v0, p0, LUa;->a:Lao;

    if-nez v0, :cond_0

    new-instance v0, Lao;

    invoke-direct {v0, p0}, Lao;-><init>(LYn;)V

    iput-object v0, p0, LUa;->a:Lao;

    :cond_0
    sget-object v1, LOn;->ON_RESUME:LOn;

    invoke-virtual {v0, v1}, Lao;->e(LOn;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    iget-object v0, p0, LUa;->a:Lao;

    if-nez v0, :cond_0

    new-instance v0, Lao;

    invoke-direct {v0, p0}, Lao;-><init>(LYn;)V

    iput-object v0, p0, LUa;->a:Lao;

    :cond_0
    sget-object v1, LOn;->ON_DESTROY:LOn;

    invoke-virtual {v0, v1}, Lao;->e(LOn;)V

    const/4 v0, 0x0

    iput-object v0, p0, LUa;->a:Lao;

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LUa;->b()V

    .line 2
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 3
    invoke-virtual {p0}, LUa;->b()V

    .line 4
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 5
    invoke-virtual {p0}, LUa;->b()V

    .line 6
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
