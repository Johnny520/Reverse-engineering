.class public final Lx2/u;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ld1/u;


# virtual methods
.method public final r0(Ld1/r;)V
    .locals 2

    .line 1
    invoke-static {p0}, Lx2/i;->c(Ly0/n;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ly0/n;->g:Ly0/n;

    .line 6
    .line 7
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Lx2/i;->c(Ly0/n;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Landroid/view/View;->hasFocusable()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v1, 0x0

    .line 24
    :goto_0
    invoke-interface {p1, v1}, Ld1/r;->c(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-static {v1, v0}, Ld1/h;->a(Landroid/view/View;Landroid/view/View;)Le1/c;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, v0}, Ld1/r;->d(Le1/c;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method
