.class public abstract Lt5;
.super Lc3;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lki;-><init>()V

    invoke-virtual {p0}, LTa;->getSavedStateRegistry()Lhx;

    move-result-object v0

    new-instance v1, La3;

    invoke-direct {v1, p0}, La3;-><init>(Lt5;)V

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2, v1}, Lhx;->c(Ljava/lang/String;Lgx;)V

    new-instance v0, Lb3;

    invoke-direct {v0, p0}, Lb3;-><init>(Lt5;)V

    invoke-virtual {p0, v0}, LTa;->addOnContextAvailableListener(Lpt;)V

    return-void
.end method


# virtual methods
.method public abstract onCreate()V
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Lki;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Lc3;->getSupportActionBar()Ln0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ln0;->f()V

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 4
    new-instance v1, Lhw;

    const/16 v2, 0x8

    invoke-direct {v1, v0, v2}, Lhw;-><init>(Landroid/view/View;I)V

    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x23

    if-lt v0, v2, :cond_1

    .line 6
    new-instance v0, LOF;

    .line 7
    invoke-direct {v0, p1, v1}, LNF;-><init>(Landroid/view/Window;Lhw;)V

    goto :goto_0

    :cond_1
    const/16 v2, 0x1e

    if-lt v0, v2, :cond_2

    .line 8
    new-instance v0, LNF;

    invoke-direct {v0, p1, v1}, LNF;-><init>(Landroid/view/Window;Lhw;)V

    goto :goto_0

    .line 9
    :cond_2
    new-instance v0, LMF;

    .line 10
    invoke-direct {v0, p1, v1}, LMF;-><init>(Landroid/view/Window;Lhw;)V

    .line 11
    :goto_0
    invoke-static {p0}, LGu;->u(Landroid/content/Context;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    .line 12
    invoke-virtual {v0, p1}, Lcr;->T(Z)V

    .line 13
    invoke-static {p0}, LGu;->u(Landroid/content/Context;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    .line 14
    invoke-virtual {v0, p1}, Lcr;->S(Z)V

    .line 15
    invoke-virtual {p0}, Lc3;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget-object v0, LCw;->a:Ljava/lang/ThreadLocal;

    const v0, 0x55060040

    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result p1

    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 18
    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 19
    :cond_4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0, p1}, Landroid/view/Window;->setNavigationBarDividerColor(I)V

    .line 20
    :cond_5
    invoke-virtual {p0}, Lt5;->onCreate()V

    return-void
.end method
