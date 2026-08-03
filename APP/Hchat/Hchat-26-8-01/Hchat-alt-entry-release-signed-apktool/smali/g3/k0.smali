.class public Lg3/k0;
.super Lg3/j0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public o:Lb3/a;

.field public p:Lb3/a;

.field public q:Lb3/a;


# direct methods
.method public constructor <init>(Lg3/r0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lg3/j0;-><init>(Lg3/r0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lg3/k0;->o:Lb3/a;

    .line 6
    .line 7
    iput-object p1, p0, Lg3/k0;->p:Lb3/a;

    .line 8
    .line 9
    iput-object p1, p0, Lg3/k0;->q:Lb3/a;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lg3/r0;Lg3/k0;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lg3/j0;-><init>(Lg3/r0;Lg3/j0;)V

    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, Lg3/k0;->o:Lb3/a;

    .line 14
    iput-object p1, p0, Lg3/k0;->p:Lb3/a;

    .line 15
    iput-object p1, p0, Lg3/k0;->q:Lb3/a;

    return-void
.end method


# virtual methods
.method public i()Lb3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/k0;->p:Lb3/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg3/h0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lf1/a;->r(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lb3/a;->c(Landroid/graphics/Insets;)Lb3/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lg3/k0;->p:Lb3/a;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lg3/k0;->p:Lb3/a;

    .line 18
    .line 19
    return-object v0
.end method

.method public k()Lb3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/k0;->o:Lb3/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg3/h0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lf1/a;->w(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lb3/a;->c(Landroid/graphics/Insets;)Lb3/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lg3/k0;->o:Lb3/a;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lg3/k0;->o:Lb3/a;

    .line 18
    .line 19
    return-object v0
.end method

.method public m()Lb3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/k0;->q:Lb3/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lg3/h0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lf1/a;->d(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lb3/a;->c(Landroid/graphics/Insets;)Lb3/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lg3/k0;->q:Lb3/a;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lg3/k0;->q:Lb3/a;

    .line 18
    .line 19
    return-object v0
.end method

.method public n(IIII)Lg3/r0;
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/h0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Lf1/a;->h(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p1, p2}, Lg3/r0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Lg3/r0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public u(Lb3/a;)V
    .locals 0

    .line 1
    return-void
.end method
