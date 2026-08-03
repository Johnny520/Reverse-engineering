.class public final Le/E;
.super Le/n;
.source "SourceFile"


# virtual methods
.method protected final a()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final u(Le/l;)Le/j;
    .locals 3

    new-instance v0, Le/E;

    invoke-virtual {p0}, Le/j;->l()Lj/s;

    move-result-object v1

    invoke-virtual {p0}, Le/j;->m()Lj/o;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Le/E;-><init>(Le/l;Lj/s;Lj/o;)V

    return-object v0
.end method

.method public final w(Lj/o;)Le/j;
    .locals 3

    new-instance v0, Le/E;

    invoke-virtual {p0}, Le/j;->k()Le/l;

    move-result-object v1

    invoke-virtual {p0}, Le/j;->l()Lj/s;

    move-result-object v2

    invoke-direct {v0, v1, v2, p1}, Le/E;-><init>(Le/l;Lj/s;Lj/o;)V

    return-object v0
.end method
