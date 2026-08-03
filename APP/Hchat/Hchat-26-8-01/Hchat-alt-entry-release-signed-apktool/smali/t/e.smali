.class public final Lt/e;
.super Ly0/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public u:Lt/c;


# virtual methods
.method public final Z0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final c1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt/e;->u:Lt/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lt/c;->a:Lj0/b;

    .line 6
    .line 7
    invoke-virtual {v1, p0}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, v0, Lt/c;->a:Lj0/b;

    .line 13
    .line 14
    invoke-virtual {v1, p0}, Lj0/b;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v0, p0, Lt/e;->u:Lt/c;

    .line 18
    .line 19
    return-void
.end method

.method public final d1()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt/e;->u:Lt/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Lt/c;->a:Lj0/b;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lj0/b;->j(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
