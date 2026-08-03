.class public La/X0;
.super La/E3;
.source "SourceFile"

# interfaces
.implements La/I0;


# instance fields
.field public d:La/Q0;

.field public final e:La/W0;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 4

    const/4 v0, 0x1

    if-nez p2, :cond_0

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget v3, Landroidx/appcompat/R$attr;->dialogTheme:I

    invoke-virtual {v2, v3, v1, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    goto :goto_0

    :cond_0
    move v1, p2

    :goto_0
    invoke-direct {p0, p1, v1}, La/E3;-><init>(Landroid/content/Context;I)V

    new-instance v1, La/W0;

    move-object v2, p0

    check-cast v2, Landroidx/appcompat/app/b;

    invoke-direct {v1, v2}, La/W0;-><init>(Landroidx/appcompat/app/b;)V

    iput-object v1, p0, La/X0;->e:La/W0;

    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v1

    if-nez p2, :cond_1

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget v2, Landroidx/appcompat/R$attr;->dialogTheme:I

    invoke-virtual {p1, v2, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    :cond_1
    move-object p1, v1

    check-cast p1, La/Q0;

    iput p2, p1, La/Q0;->U:I

    invoke-virtual {v1}, La/O0;->o()V

    return-void
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La/O0;->c(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final c()La/O0;
    .locals 3

    iget-object v0, p0, La/X0;->d:La/Q0;

    if-nez v0, :cond_0

    sget-object v0, La/O0;->a:La/O0$c;

    new-instance v0, La/Q0;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0, p0}, La/Q0;-><init>(Landroid/content/Context;Landroid/view/Window;La/I0;Ljava/lang/Object;)V

    iput-object v0, p0, La/X0;->d:La/Q0;

    :cond_0
    iget-object v0, p0, La/X0;->d:La/Q0;

    return-object v0
.end method

.method public final d()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, La/Mg;->a(Landroid/view/View;La/y9;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/savedstate/b;->a(Landroid/view/View;La/Ld;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, Landroidx/activity/c;->a(Landroid/view/View;La/Yb;)V

    return-void
.end method

.method public final dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0}, La/O0;->p()V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, La/X0;->e:La/W0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, v0, La/W0;->a:Landroidx/appcompat/app/b;

    invoke-virtual {v0, p1}, La/X0;->e(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final e(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0, p1}, La/O0;->e(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0}, La/O0;->l()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0}, La/O0;->k()V

    invoke-super {p0, p1}, La/E3;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object p1

    invoke-virtual {p1}, La/O0;->o()V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, La/E3;->onStop()V

    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0}, La/O0;->t()V

    return-void
.end method

.method public final onSupportActionModeFinished(La/P;)V
    .locals 0

    return-void
.end method

.method public final onSupportActionModeStarted(La/P;)V
    .locals 0

    return-void
.end method

.method public final onWindowStartingSupportActionMode(La/P$a;)La/P;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/X0;->d()V

    .line 2
    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0, p1}, La/O0;->w(I)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, La/X0;->d()V

    .line 4
    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0, p1}, La/O0;->x(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, La/X0;->d()V

    .line 6
    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La/O0;->y(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 2

    .line 3
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 4
    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, La/O0;->B(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 2
    invoke-virtual {p0}, La/X0;->c()La/O0;

    move-result-object v0

    invoke-virtual {v0, p1}, La/O0;->B(Ljava/lang/CharSequence;)V

    return-void
.end method
