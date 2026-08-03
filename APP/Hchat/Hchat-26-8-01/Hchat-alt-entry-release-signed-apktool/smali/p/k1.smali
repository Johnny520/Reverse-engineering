.class public final Lp/k1;
.super Lp/i0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public x:Lfg/l;

.field public y:Lp/s1;


# virtual methods
.method public final c1()V
    .locals 3

    .line 1
    invoke-static {p0}, Lx1/k;->y(Lx1/i;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lp/s1;->v:Ljava/util/WeakHashMap;

    .line 6
    .line 7
    invoke-static {v0}, Lp/c;->f(Landroid/view/View;)Lp/s1;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Lp/s1;->a(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lp/k1;->x:Lfg/l;

    .line 15
    .line 16
    invoke-interface {v0, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lp/r1;

    .line 21
    .line 22
    iget-object v2, p0, Lp/i0;->w:Lp/r1;

    .line 23
    .line 24
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    iput-object v0, p0, Lp/i0;->w:Lp/r1;

    .line 31
    .line 32
    invoke-virtual {p0}, Lp/i0;->l1()V

    .line 33
    .line 34
    .line 35
    :cond_0
    iput-object v1, p0, Lp/k1;->y:Lp/s1;

    .line 36
    .line 37
    invoke-super {p0}, Lp/e0;->c1()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final d1()V
    .locals 3

    .line 1
    invoke-static {p0}, Lx1/k;->y(Lx1/i;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lp/k1;->y:Lp/s1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v2, v1, Lp/s1;->t:I

    .line 10
    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    iput v2, v1, Lp/s1;->t:I

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    sget v2, Lg3/q;->a:I

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-static {v0, v2}, Lg3/m;->b(Landroid/view/View;Lg3/e;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2}, Lg3/q;->b(Landroid/view/View;Lg3/s;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, v1, Lp/s1;->u:Lp/f0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-super {p0}, Lp/e0;->d1()V

    .line 32
    .line 33
    .line 34
    return-void
.end method
