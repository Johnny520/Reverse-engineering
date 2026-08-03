.class public final Ls1/o;
.super Ls1/f;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final bridge synthetic F()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "androidx.compose.ui.input.pointer.PointerHoverIcon"

    .line 2
    .line 3
    return-object v0
.end method

.method public final l1(Ls1/q;)V
    .locals 2

    .line 1
    sget-object v0, Ly1/h1;->v:Li0/m2;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lx1/k;->h(Lx1/h;Li0/p1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ls1/r;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast v0, Ly1/q;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    sget-object p1, Ls1/q;->a:Ls1/p;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object p1, Ls1/s;->a:Ls1/a;

    .line 21
    .line 22
    :cond_0
    sget-object v1, Ly1/e0;->a:Ly1/e0;

    .line 23
    .line 24
    iget-object v0, v0, Ly1/q;->b:Ly1/t;

    .line 25
    .line 26
    invoke-virtual {v1, v0, p1}, Ly1/e0;->a(Landroid/view/View;Ls1/q;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final n1(I)Z
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x4

    .line 6
    if-ne p1, v0, :cond_1

    .line 7
    .line 8
    :goto_0
    const/4 p1, 0x0

    .line 9
    return p1

    .line 10
    :cond_1
    const/4 p1, 0x1

    .line 11
    return p1
.end method
