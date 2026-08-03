.class public final Lth/l;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lx1/m;
.implements Lx1/n;


# instance fields
.field public u:Lth/j;


# virtual methods
.method public final B(Lx1/h0;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Lx1/h0;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lth/l;->u:Lth/j;

    .line 5
    .line 6
    iget-object v0, v0, Lth/j;->a:Li1/b;

    .line 7
    .line 8
    iget-object v1, p1, Lx1/h0;->g:Lh1/b;

    .line 9
    .line 10
    invoke-interface {v1}, Lh1/d;->a()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-static {v1, v2}, Lr9/e0;->p0(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v3, v3, Lx1/f0;->E:Lu2/c;

    .line 23
    .line 24
    new-instance v4, Lth/h;

    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    invoke-direct {v4, v3, p0, p1, v5}, Lth/h;-><init>(Lu2/c;Ly0/n;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1, v2, v4, v0}, Lx1/h0;->y(JLfg/l;Li1/b;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final d1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lth/l;->u:Lth/j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v0, v0, Lth/j;->c:Li0/j1;

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final w(Lx1/i1;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lx1/i1;->r1()Ly0/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lth/l;->u:Lth/j;

    .line 10
    .line 11
    iget-object v0, v0, Lth/j;->c:Li0/j1;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
