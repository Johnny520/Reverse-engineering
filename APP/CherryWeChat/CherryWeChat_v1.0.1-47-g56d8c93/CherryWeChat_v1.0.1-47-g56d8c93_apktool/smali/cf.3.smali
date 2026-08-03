.class public abstract Lcf;
.super Ljava/lang/Object;
.source ""


# virtual methods
.method public a(LdA;LdA;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p3, v0}, LPj;->y(Landroid/view/Window;Z)V

    if-eqz p5, :cond_0

    iget p1, p1, LdA;->b:I

    goto :goto_0

    :cond_0
    iget p1, p1, LdA;->a:I

    :goto_0
    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    if-eqz p6, :cond_1

    iget p1, p2, LdA;->b:I

    goto :goto_1

    :cond_1
    iget p1, p2, LdA;->a:I

    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    new-instance p1, Lhw;

    const/16 p2, 0x8

    invoke-direct {p1, p4, p2}, Lhw;-><init>(Landroid/view/View;I)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x23

    if-lt p2, p4, :cond_2

    new-instance p2, LOF;

    invoke-direct {p2, p3, p1}, LNF;-><init>(Landroid/view/Window;Lhw;)V

    goto :goto_2

    :cond_2
    const/16 p4, 0x1e

    if-lt p2, p4, :cond_3

    new-instance p2, LNF;

    invoke-direct {p2, p3, p1}, LNF;-><init>(Landroid/view/Window;Lhw;)V

    goto :goto_2

    :cond_3
    new-instance p2, LMF;

    invoke-direct {p2, p3, p1}, LMF;-><init>(Landroid/view/Window;Lhw;)V

    :goto_2
    xor-int/lit8 p1, p5, 0x1

    invoke-virtual {p2, p1}, Lcr;->T(Z)V

    xor-int/lit8 p1, p6, 0x1

    invoke-virtual {p2, p1}, Lcr;->S(Z)V

    return-void
.end method
