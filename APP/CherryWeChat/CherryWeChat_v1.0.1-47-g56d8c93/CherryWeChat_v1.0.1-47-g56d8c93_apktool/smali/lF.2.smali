.class public final LlF;
.super LI0;
.source ""

# interfaces
.implements Ljr;


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Llr;

.field public e:LP3;

.field public f:Ljava/lang/ref/WeakReference;

.field public final synthetic g:LmF;


# direct methods
.method public constructor <init>(LmF;Landroid/content/Context;LP3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LlF;->g:LmF;

    iput-object p2, p0, LlF;->c:Landroid/content/Context;

    iput-object p3, p0, LlF;->e:LP3;

    new-instance p1, Llr;

    invoke-direct {p1, p2}, Llr;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    iput p2, p1, Llr;->l:I

    iput-object p1, p0, LlF;->d:Llr;

    iput-object p0, p1, Llr;->e:Ljr;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v1, v0, LmF;->i:LlF;

    if-eq v1, p0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, LmF;->p:Z

    iget-boolean v2, v0, LmF;->q:Z

    if-nez v1, :cond_2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LlF;->e:LP3;

    invoke-virtual {v1, p0}, LP3;->h(LI0;)V

    goto :goto_1

    :cond_2
    :goto_0
    iput-object p0, v0, LmF;->j:LlF;

    iget-object v1, p0, LlF;->e:LP3;

    iput-object v1, v0, LmF;->k:LP3;

    :goto_1
    const/4 v1, 0x0

    iput-object v1, p0, LlF;->e:LP3;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LmF;->q(Z)V

    iget-object v2, v0, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v3, v2, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroid/view/View;

    if-nez v3, :cond_3

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    :cond_3
    iget-object v2, v0, LmF;->c:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, v0, LmF;->v:Z

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iput-object v1, v0, LmF;->i:LlF;

    return-void
.end method

.method public final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LlF;->f:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Llr;
    .locals 1

    iget-object v0, p0, LlF;->d:Llr;

    return-object v0
.end method

.method public final d(Llr;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, LlF;->e:LP3;

    if-eqz p1, :cond_0

    iget-object p1, p1, LP3;->b:Ljava/lang/Object;

    check-cast p1, LH0;

    invoke-interface {p1, p0, p2}, LH0;->d(LI0;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, LLz;

    iget-object v1, p0, LlF;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, LLz;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final g()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final h()V
    .locals 2

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->i:LlF;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LlF;->d:Llr;

    invoke-virtual {v0}, Llr;->w()V

    :try_start_0
    iget-object v1, p0, LlF;->e:LP3;

    invoke-virtual {v1, p0, v0}, LP3;->g(LI0;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Llr;->v()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Llr;->v()V

    throw v1
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->s:Z

    return v0
.end method

.method public final j(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LlF;->f:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final k(I)V
    .locals 1

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LlF;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final l(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final m(I)V
    .locals 1

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LlF;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final n(Llr;)V
    .locals 0

    iget-object p1, p0, LlF;->e:LP3;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LlF;->h()V

    iget-object p1, p0, LlF;->g:LmF;

    iget-object p1, p1, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarContextView;->d:LD0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LD0;->l()Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final o(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final p(Z)V
    .locals 1

    iput-boolean p1, p0, LI0;->b:Z

    iget-object v0, p0, LlF;->g:LmF;

    iget-object v0, v0, LmF;->f:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method
