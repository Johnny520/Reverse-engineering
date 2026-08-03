.class public final Lq6/a;
.super Lr6/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final b()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lr6/d;->a:Lr6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0, v0}, Lx6/g;->a(Lq6/a;Lr6/c;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0, v0}, Lx6/g;->j(Lr6/d;Lr6/c;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    return-object v1

    .line 22
    :cond_1
    const-string v0, "You must provide a configuration to resolve the member use build(configuration)."

    .line 23
    .line 24
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    return-object v0
.end method
