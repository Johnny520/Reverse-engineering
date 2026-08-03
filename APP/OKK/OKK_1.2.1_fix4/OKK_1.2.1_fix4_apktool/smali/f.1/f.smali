.class public final Lf/f;
.super Lf/l;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public A:Z

.field public final b:Landroid/content/Context;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Z

.field public final g:Landroid/os/Handler;

.field public final h:Ljava/util/ArrayList;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lf/c;

.field public final k:LA0/s;

.field public final l:LD/d;

.field public m:I

.field public n:I

.field public o:Landroid/view/View;

.field public p:Landroid/view/View;

.field public q:I

.field public r:Z

.field public s:Z

.field public t:I

.field public u:I

.field public v:Z

.field public w:Z

.field public x:Lf/o;

.field public y:Landroid/view/ViewTreeObserver;

.field public z:Landroid/widget/PopupWindow$OnDismissListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;IIZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf/f;->h:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf/f;->i:Ljava/util/ArrayList;

    new-instance v0, Lf/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lf/c;-><init>(Lf/l;I)V

    iput-object v0, p0, Lf/f;->j:Lf/c;

    new-instance v0, LA0/s;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, LA0/s;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lf/f;->k:LA0/s;

    new-instance v0, LD/d;

    const/16 v1, 0x10

    invoke-direct {v0, v1, p0}, LD/d;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lf/f;->l:LD/d;

    const/4 v0, 0x0

    iput v0, p0, Lf/f;->m:I

    iput v0, p0, Lf/f;->n:I

    iput-object p1, p0, Lf/f;->b:Landroid/content/Context;

    iput-object p2, p0, Lf/f;->o:Landroid/view/View;

    iput p3, p0, Lf/f;->d:I

    iput p4, p0, Lf/f;->e:I

    iput-boolean p5, p0, Lf/f;->f:Z

    iput-boolean v0, p0, Lf/f;->v:Z

    invoke-virtual {p2}, Landroid/view/View;->getLayoutDirection()I

    move-result p2

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    goto :goto_0

    :cond_0
    move v0, p3

    :goto_0
    iput v0, p0, Lf/f;->q:I

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 p2, p2, 0x2

    const p3, 0x7f070017

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lf/f;->c:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lf/f;->g:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(Lf/j;Z)V
    .locals 7

    iget-object v0, p0, Lf/f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf/e;

    iget-object v4, v4, Lf/e;->b:Lf/j;

    if-ne p1, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_2

    return-void

    :cond_2
    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v1, v4, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf/e;

    iget-object v1, v1, Lf/e;->b:Lf/j;

    invoke-virtual {v1, v2}, Lf/j;->c(Z)V

    :cond_3
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf/e;

    iget-object v3, v1, Lf/e;->b:Lf/j;

    iget-object v3, v3, Lf/j;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/WeakReference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf/p;

    if-eqz v6, :cond_5

    if-ne v6, p0, :cond_4

    :cond_5
    invoke-virtual {v3, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    iget-boolean v3, p0, Lf/f;->A:Z

    const/4 v4, 0x0

    iget-object v1, v1, Lf/e;->a:Lg/t0;

    if-eqz v3, :cond_7

    iget-object v3, v1, Lg/o0;->v:Lg/y;

    invoke-static {v3, v4}, Lg/q0;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    iget-object v3, v1, Lg/o0;->v:Lg/y;

    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    :cond_7
    invoke-virtual {v1}, Lg/o0;->dismiss()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x1

    if-lez v1, :cond_8

    add-int/lit8 v5, v1, -0x1

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf/e;

    iget v5, v5, Lf/e;->c:I

    iput v5, p0, Lf/f;->q:I

    goto :goto_4

    :cond_8
    iget-object v5, p0, Lf/f;->o:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    if-ne v5, v3, :cond_9

    move v5, v2

    goto :goto_3

    :cond_9
    move v5, v3

    :goto_3
    iput v5, p0, Lf/f;->q:I

    :goto_4
    if-nez v1, :cond_d

    invoke-virtual {p0}, Lf/f;->dismiss()V

    iget-object p2, p0, Lf/f;->x:Lf/o;

    if-eqz p2, :cond_a

    invoke-interface {p2, p1, v3}, Lf/o;->a(Lf/j;Z)V

    :cond_a
    iget-object p1, p0, Lf/f;->y:Landroid/view/ViewTreeObserver;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lf/f;->y:Landroid/view/ViewTreeObserver;

    iget-object p2, p0, Lf/f;->j:Lf/c;

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_b
    iput-object v4, p0, Lf/f;->y:Landroid/view/ViewTreeObserver;

    :cond_c
    iget-object p1, p0, Lf/f;->p:Landroid/view/View;

    iget-object p2, p0, Lf/f;->k:LA0/s;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object p1, p0, Lf/f;->z:Landroid/widget/PopupWindow$OnDismissListener;

    invoke-interface {p1}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    goto :goto_5

    :cond_d
    if-eqz p2, :cond_e

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf/e;

    iget-object p1, p1, Lf/e;->b:Lf/j;

    invoke-virtual {p1, v2}, Lf/j;->c(Z)V

    :cond_e
    :goto_5
    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lf/f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf/e;

    iget-object v1, v1, Lf/e;->a:Lg/t0;

    iget-object v1, v1, Lg/o0;->c:Lg/s0;

    invoke-virtual {v1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    instance-of v2, v1, Landroid/widget/HeaderViewListAdapter;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    check-cast v1, Lf/g;

    goto :goto_1

    :cond_0
    check-cast v1, Lf/g;

    :goto_1
    invoke-virtual {v1}, Lf/g;->notifyDataSetChanged()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d()Z
    .locals 3

    iget-object v0, p0, Lf/f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf/e;

    iget-object v0, v0, Lf/e;->a:Lg/t0;

    iget-object v0, v0, Lg/o0;->v:Lg/y;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2
.end method

.method public final dismiss()V
    .locals 4

    iget-object v0, p0, Lf/f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_1

    new-array v2, v1, [Lf/e;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf/e;

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_1

    aget-object v2, v0, v1

    iget-object v3, v2, Lf/e;->a:Lg/t0;

    iget-object v3, v3, Lg/o0;->v:Lg/y;

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v2, v2, Lf/e;->a:Lg/t0;

    invoke-virtual {v2}, Lg/o0;->dismiss()V

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e()Landroid/widget/ListView;
    .locals 2

    iget-object v0, p0, Lf/f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf/e;

    iget-object v0, v0, Lf/e;->a:Lg/t0;

    iget-object v0, v0, Lg/o0;->c:Lg/s0;

    :goto_0
    return-object v0
.end method

.method public final f()V
    .locals 3

    invoke-virtual {p0}, Lf/f;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf/f;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf/j;

    invoke-virtual {p0, v2}, Lf/f;->v(Lf/j;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lf/f;->o:Landroid/view/View;

    iput-object v0, p0, Lf/f;->p:Landroid/view/View;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lf/f;->y:Landroid/view/ViewTreeObserver;

    if-nez v1, :cond_2

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Lf/f;->y:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lf/f;->j:Lf/c;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    iget-object v0, p0, Lf/f;->p:Landroid/view/View;

    iget-object v1, p0, Lf/f;->k:LA0/s;

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :cond_4
    return-void
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j(Lf/o;)V
    .locals 0

    iput-object p1, p0, Lf/f;->x:Lf/o;

    return-void
.end method

.method public final k(Lf/t;)Z
    .locals 4

    iget-object v0, p0, Lf/f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf/e;

    iget-object v3, v1, Lf/e;->b:Lf/j;

    if-ne p1, v3, :cond_0

    iget-object p1, v1, Lf/e;->a:Lg/t0;

    iget-object p1, p1, Lg/o0;->c:Lg/s0;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return v2

    :cond_1
    invoke-virtual {p1}, Lf/j;->hasVisibleItems()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Lf/f;->l(Lf/j;)V

    iget-object v0, p0, Lf/f;->x:Lf/o;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lf/o;->k(Lf/j;)Z

    :cond_2
    return v2

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final l(Lf/j;)V
    .locals 1

    iget-object v0, p0, Lf/f;->b:Landroid/content/Context;

    invoke-virtual {p1, p0, v0}, Lf/j;->b(Lf/p;Landroid/content/Context;)V

    invoke-virtual {p0}, Lf/f;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lf/f;->v(Lf/j;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lf/f;->h:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lf/f;->o:Landroid/view/View;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Lf/f;->o:Landroid/view/View;

    iget v0, p0, Lf/f;->m:I

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    invoke-static {v0, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    iput p1, p0, Lf/f;->n:I

    :cond_0
    return-void
.end method

.method public final o(Z)V
    .locals 0

    iput-boolean p1, p0, Lf/f;->v:Z

    return-void
.end method

.method public final onDismiss()V
    .locals 6

    iget-object v0, p0, Lf/f;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf/e;

    iget-object v5, v4, Lf/e;->a:Lg/t0;

    iget-object v5, v5, Lg/o0;->v:Lg/y;

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_2

    iget-object v0, v4, Lf/e;->b:Lf/j;

    invoke-virtual {v0, v2}, Lf/j;->c(Z)V

    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lf/f;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(I)V
    .locals 1

    iget v0, p0, Lf/f;->m:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Lf/f;->m:I

    iget-object v0, p0, Lf/f;->o:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    iput p1, p0, Lf/f;->n:I

    :cond_0
    return-void
.end method

.method public final q(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf/f;->r:Z

    iput p1, p0, Lf/f;->t:I

    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Lf/f;->z:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Lf/f;->w:Z

    return-void
.end method

.method public final t(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf/f;->s:Z

    iput p1, p0, Lf/f;->u:I

    return-void
.end method

.method public final v(Lf/j;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lf/f;->b:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    new-instance v4, Lf/g;

    iget-boolean v5, v0, Lf/f;->f:Z

    const v6, 0x7f0c000b

    invoke-direct {v4, v1, v3, v5, v6}, Lf/g;-><init>(Lf/j;Landroid/view/LayoutInflater;ZI)V

    invoke-virtual/range {p0 .. p0}, Lf/f;->d()Z

    move-result v5

    const/4 v6, 0x1

    if-nez v5, :cond_0

    iget-boolean v5, v0, Lf/f;->v:Z

    if-eqz v5, :cond_0

    iput-boolean v6, v4, Lf/g;->c:Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lf/f;->d()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static/range {p1 .. p1}, Lf/l;->u(Lf/j;)Z

    move-result v5

    iput-boolean v5, v4, Lf/g;->c:Z

    :cond_1
    :goto_0
    iget v5, v0, Lf/f;->c:I

    invoke-static {v4, v2, v5}, Lf/l;->m(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    move-result v5

    new-instance v7, Lg/t0;

    iget v8, v0, Lf/f;->d:I

    iget v9, v0, Lf/f;->e:I

    invoke-direct {v7, v2, v8, v9}, Lg/o0;-><init>(Landroid/content/Context;II)V

    iget-object v2, v0, Lf/f;->l:LD/d;

    iput-object v2, v7, Lg/t0;->y:Lg/p0;

    iput-object v0, v7, Lg/o0;->m:Landroid/widget/AdapterView$OnItemClickListener;

    iget-object v2, v7, Lg/o0;->v:Lg/y;

    invoke-virtual {v2, v0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v2, v0, Lf/f;->o:Landroid/view/View;

    iput-object v2, v7, Lg/o0;->l:Landroid/view/View;

    iget v2, v0, Lf/f;->n:I

    iput v2, v7, Lg/o0;->j:I

    iput-boolean v6, v7, Lg/o0;->u:Z

    iget-object v2, v7, Lg/o0;->v:Lg/y;

    invoke-virtual {v2, v6}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v2, v7, Lg/o0;->v:Lg/y;

    const/4 v8, 0x2

    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    invoke-virtual {v7, v4}, Lg/o0;->a(Landroid/widget/ListAdapter;)V

    iget-object v2, v7, Lg/o0;->v:Lg/y;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v4, v7, Lg/o0;->s:Landroid/graphics/Rect;

    invoke-virtual {v2, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v2, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v4

    add-int/2addr v2, v5

    iput v2, v7, Lg/o0;->d:I

    goto :goto_1

    :cond_2
    iput v5, v7, Lg/o0;->d:I

    :goto_1
    iget v2, v0, Lf/f;->n:I

    iput v2, v7, Lg/o0;->j:I

    iget-object v2, v0, Lf/f;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v9, 0x0

    if-lez v4, :cond_b

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v6

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf/e;

    iget-object v11, v4, Lf/e;->b:Lf/j;

    iget-object v12, v11, Lf/j;->f:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    move v13, v9

    :goto_2
    if-ge v13, v12, :cond_4

    invoke-virtual {v11, v13}, Lf/j;->getItem(I)Landroid/view/MenuItem;

    move-result-object v14

    invoke-interface {v14}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-interface {v14}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v15

    if-ne v1, v15, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_4
    const/4 v14, 0x0

    :goto_3
    if-nez v14, :cond_5

    :goto_4
    goto :goto_8

    :cond_5
    iget-object v11, v4, Lf/e;->a:Lg/t0;

    iget-object v11, v11, Lg/o0;->c:Lg/s0;

    invoke-virtual {v11}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v12

    instance-of v13, v12, Landroid/widget/HeaderViewListAdapter;

    if-eqz v13, :cond_6

    check-cast v12, Landroid/widget/HeaderViewListAdapter;

    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    move-result v13

    invoke-virtual {v12}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    move-result-object v12

    check-cast v12, Lf/g;

    goto :goto_5

    :cond_6
    check-cast v12, Lf/g;

    move v13, v9

    :goto_5
    invoke-virtual {v12}, Lf/g;->getCount()I

    move-result v15

    move v8, v9

    :goto_6
    const/4 v6, -0x1

    if-ge v8, v15, :cond_8

    invoke-virtual {v12, v8}, Lf/g;->b(I)Lf/k;

    move-result-object v10

    if-ne v14, v10, :cond_7

    goto :goto_7

    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_8
    move v8, v6

    :goto_7
    if-ne v8, v6, :cond_9

    goto :goto_4

    :cond_9
    add-int/2addr v8, v13

    invoke-virtual {v11}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v6

    sub-int/2addr v8, v6

    if-ltz v8, :cond_c

    invoke-virtual {v11}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-lt v8, v6, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v11, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    goto :goto_9

    :cond_b
    const/4 v4, 0x0

    :cond_c
    :goto_8
    const/4 v6, 0x0

    :goto_9
    if-eqz v6, :cond_16

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v10, v7, Lg/o0;->v:Lg/y;

    const/16 v11, 0x1c

    if-gt v8, v11, :cond_d

    sget-object v8, Lg/t0;->z:Ljava/lang/reflect/Method;

    if-eqz v8, :cond_e

    :try_start_0
    sget-object v11, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v8, v10, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_a

    :cond_d
    invoke-static {v10, v9}, Lg/r0;->a(Landroid/widget/PopupWindow;Z)V

    :catch_0
    :cond_e
    :goto_a
    iget-object v8, v7, Lg/o0;->v:Lg/y;

    const/4 v10, 0x0

    invoke-static {v8, v10}, Lg/q0;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v10, 0x1

    sub-int/2addr v8, v10

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf/e;

    iget-object v8, v8, Lf/e;->a:Lg/t0;

    iget-object v8, v8, Lg/o0;->c:Lg/s0;

    const/4 v10, 0x2

    new-array v10, v10, [I

    invoke-virtual {v8, v10}, Landroid/view/View;->getLocationOnScreen([I)V

    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11}, Landroid/graphics/Rect;-><init>()V

    iget-object v12, v0, Lf/f;->p:Landroid/view/View;

    invoke-virtual {v12, v11}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget v12, v0, Lf/f;->q:I

    const/4 v13, 0x1

    if-ne v12, v13, :cond_11

    aget v10, v10, v9

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    add-int/2addr v8, v10

    add-int/2addr v8, v5

    iget v10, v11, Landroid/graphics/Rect;->right:I

    if-le v8, v10, :cond_10

    :cond_f
    move v8, v9

    :goto_b
    const/4 v10, 0x1

    goto :goto_d

    :cond_10
    :goto_c
    const/4 v8, 0x1

    goto :goto_b

    :cond_11
    aget v8, v10, v9

    sub-int/2addr v8, v5

    if-gez v8, :cond_f

    goto :goto_c

    :goto_d
    if-ne v8, v10, :cond_12

    const/4 v10, 0x1

    goto :goto_e

    :cond_12
    move v10, v9

    :goto_e
    iput v8, v0, Lf/f;->q:I

    iput-object v6, v7, Lg/o0;->l:Landroid/view/View;

    iget v8, v0, Lf/f;->n:I

    const/4 v11, 0x5

    and-int/2addr v8, v11

    if-ne v8, v11, :cond_14

    if-eqz v10, :cond_13

    goto :goto_f

    :cond_13
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v5

    rsub-int/lit8 v5, v5, 0x0

    goto :goto_f

    :cond_14
    if-eqz v10, :cond_15

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v5

    goto :goto_f

    :cond_15
    rsub-int/lit8 v5, v5, 0x0

    :goto_f
    iput v5, v7, Lg/o0;->e:I

    const/4 v5, 0x1

    iput-boolean v5, v7, Lg/o0;->i:Z

    iput-boolean v5, v7, Lg/o0;->h:Z

    iput v9, v7, Lg/o0;->f:I

    iput-boolean v5, v7, Lg/o0;->g:Z

    goto :goto_11

    :cond_16
    iget-boolean v5, v0, Lf/f;->r:Z

    if-eqz v5, :cond_17

    iget v5, v0, Lf/f;->t:I

    iput v5, v7, Lg/o0;->e:I

    :cond_17
    iget-boolean v5, v0, Lf/f;->s:Z

    if-eqz v5, :cond_18

    iget v5, v0, Lf/f;->u:I

    iput v5, v7, Lg/o0;->f:I

    const/4 v5, 0x1

    iput-boolean v5, v7, Lg/o0;->g:Z

    :cond_18
    iget-object v5, v0, Lf/l;->a:Landroid/graphics/Rect;

    if-eqz v5, :cond_19

    new-instance v10, Landroid/graphics/Rect;

    invoke-direct {v10, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_10

    :cond_19
    const/4 v10, 0x0

    :goto_10
    iput-object v10, v7, Lg/o0;->t:Landroid/graphics/Rect;

    :goto_11
    new-instance v5, Lf/e;

    iget v6, v0, Lf/f;->q:I

    invoke-direct {v5, v7, v1, v6}, Lf/e;-><init>(Lg/t0;Lf/j;I)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v7}, Lg/o0;->f()V

    iget-object v2, v7, Lg/o0;->c:Lg/s0;

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    if-nez v4, :cond_1a

    iget-boolean v4, v0, Lf/f;->w:Z

    if-eqz v4, :cond_1a

    iget-object v4, v1, Lf/j;->l:Ljava/lang/CharSequence;

    if-eqz v4, :cond_1a

    const v4, 0x7f0c0012

    invoke-virtual {v3, v4, v2, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v4, 0x1020016

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v3, v9}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, v1, Lf/j;->l:Ljava/lang/CharSequence;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v2, v3, v1, v9}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    invoke-virtual {v7}, Lg/o0;->f()V

    :cond_1a
    return-void
.end method
