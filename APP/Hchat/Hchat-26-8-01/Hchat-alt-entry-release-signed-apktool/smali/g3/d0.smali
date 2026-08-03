.class public Lg3/d0;
.super Lg3/g0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lg3/g0;-><init>()V

    .line 23
    invoke-static {}, Lf1/a;->e()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Lg3/d0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lg3/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lg3/g0;-><init>(Lg3/r0;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lg3/r0;->b()Landroid/view/WindowInsets;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lf1/a;->f(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Lf1/a;->e()Landroid/view/WindowInsets$Builder;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    iput-object p1, p0, Lg3/d0;->c:Landroid/view/WindowInsets$Builder;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public b()Lg3/r0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lg3/g0;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lg3/d0;->c:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-static {v0}, Lf1/a;->g(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, v1}, Lg3/r0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Lg3/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lg3/g0;->b:[Lb3/a;

    .line 16
    .line 17
    iget-object v2, v0, Lg3/r0;->a:Lg3/n0;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Lg3/n0;->r([Lb3/a;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public d(Lb3/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/d0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb3/a;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lf1/a;->y(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(Lb3/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/d0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb3/a;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lf1/a;->D(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lb3/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/d0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb3/a;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lf1/a;->u(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Lb3/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/d0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb3/a;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lf1/a;->o(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(Lb3/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/d0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Lb3/a;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lf1/a;->B(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
