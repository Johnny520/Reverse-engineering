.class public Lwc0;
.super Lvc0;


# instance fields
.field public n:Lip;

.field public o:Lip;

.field public p:Lip;


# direct methods
.method public constructor <init>(Lbd0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lvc0;-><init>(Lbd0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lwc0;->n:Lip;

    .line 6
    .line 7
    iput-object p1, p0, Lwc0;->o:Lip;

    .line 8
    .line 9
    iput-object p1, p0, Lwc0;->p:Lip;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public g()Lip;
    .locals 1

    .line 1
    iget-object v0, p0, Lwc0;->o:Lip;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lsc0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Loc0;->f(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lip;->c(Landroid/graphics/Insets;)Lip;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lwc0;->o:Lip;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lwc0;->o:Lip;

    .line 18
    .line 19
    return-object v0
.end method

.method public i()Lip;
    .locals 1

    .line 1
    iget-object v0, p0, Lwc0;->n:Lip;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lsc0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Loc0;->h(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lip;->c(Landroid/graphics/Insets;)Lip;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lwc0;->n:Lip;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lwc0;->n:Lip;

    .line 18
    .line 19
    return-object v0
.end method

.method public k()Lip;
    .locals 1

    .line 1
    iget-object v0, p0, Lwc0;->p:Lip;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lsc0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Loc0;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lip;->c(Landroid/graphics/Insets;)Lip;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lwc0;->p:Lip;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lwc0;->p:Lip;

    .line 18
    .line 19
    return-object v0
.end method

.method public l(IIII)Lbd0;
    .locals 1

    .line 1
    iget-object v0, p0, Lsc0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Loc0;->d(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, p1}, Lbd0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lbd0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public q(Lip;)V
    .locals 0

    .line 1
    return-void
.end method
