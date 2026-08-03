.class public Lef;
.super Ldf;
.source ""


# virtual methods
.method public a(LdA;LdA;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p3, v0}, LPj;->y(Landroid/view/Window;Z)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v0}, Landroid/view/Window;->setNavigationBarColor(I)V

    invoke-static {p3}, LQ;->r(Landroid/view/Window;)V

    invoke-static {p3}, LQ;->y(Landroid/view/Window;)V

    new-instance p1, Lhw;

    const/16 p2, 0x8

    invoke-direct {p1, p4, p2}, Lhw;-><init>(Landroid/view/View;I)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x23

    if-lt p2, p4, :cond_0

    new-instance p2, LOF;

    invoke-direct {p2, p3, p1}, LNF;-><init>(Landroid/view/Window;Lhw;)V

    goto :goto_0

    :cond_0
    const/16 p4, 0x1e

    if-lt p2, p4, :cond_1

    new-instance p2, LNF;

    invoke-direct {p2, p3, p1}, LNF;-><init>(Landroid/view/Window;Lhw;)V

    goto :goto_0

    :cond_1
    new-instance p2, LMF;

    invoke-direct {p2, p3, p1}, LMF;-><init>(Landroid/view/Window;Lhw;)V

    :goto_0
    xor-int/lit8 p1, p5, 0x1

    invoke-virtual {p2, p1}, Lcr;->T(Z)V

    xor-int/lit8 p1, p6, 0x1

    invoke-virtual {p2, p1}, Lcr;->S(Z)V

    return-void
.end method
