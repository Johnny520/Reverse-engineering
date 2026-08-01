.class public Lrc0;
.super Lqc0;


# instance fields
.field public n:Lep;

.field public o:Lep;

.field public p:Lep;


# direct methods
.method public constructor <init>(Lwc0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lqc0;-><init>(Lwc0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lrc0;->n:Lep;

    .line 6
    .line 7
    iput-object p1, p0, Lrc0;->o:Lep;

    .line 8
    .line 9
    iput-object p1, p0, Lrc0;->p:Lep;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public g()Lep;
    .locals 1

    .line 1
    iget-object v0, p0, Lrc0;->o:Lep;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnc0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Ljc0;->f(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lep;->c(Landroid/graphics/Insets;)Lep;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lrc0;->o:Lep;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lrc0;->o:Lep;

    .line 18
    .line 19
    return-object v0
.end method

.method public i()Lep;
    .locals 1

    .line 1
    iget-object v0, p0, Lrc0;->n:Lep;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnc0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Ljc0;->h(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lep;->c(Landroid/graphics/Insets;)Lep;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lrc0;->n:Lep;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lrc0;->n:Lep;

    .line 18
    .line 19
    return-object v0
.end method

.method public k()Lep;
    .locals 1

    .line 1
    iget-object v0, p0, Lrc0;->p:Lep;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnc0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Ljc0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lep;->c(Landroid/graphics/Insets;)Lep;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lrc0;->p:Lep;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lrc0;->p:Lep;

    .line 18
    .line 19
    return-object v0
.end method

.method public l(IIII)Lwc0;
    .locals 1

    .line 1
    iget-object v0, p0, Lnc0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Ljc0;->d(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, p1}, Lwc0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lwc0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public q(Lep;)V
    .locals 0

    .line 1
    return-void
.end method
