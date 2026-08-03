.class public abstract Lt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LQm;


# virtual methods
.method public abstract a()Ljava/lang/Object;
.end method

.method public abstract b(Ljava/lang/Object;)I
.end method

.method public abstract c(Ljava/lang/Object;)I
.end method

.method public final d(LJc;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Lt;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lt;->b(Ljava/lang/Object;)I

    move-result v1

    invoke-interface {p0}, LQm;->getDescriptor()LCx;

    move-result-object v2

    invoke-interface {p1, v2}, LJc;->B(LCx;)LVa;

    move-result-object p1

    :goto_0
    invoke-interface {p0}, LQm;->getDescriptor()LCx;

    move-result-object v2

    invoke-interface {p1, v2}, LVa;->j(LCx;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    add-int/2addr v2, v1

    invoke-virtual {p0, p1, v2, v0}, Lt;->e(LVa;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LQm;->getDescriptor()LCx;

    move-result-object v1

    invoke-interface {p1, v1}, LVa;->r(LCx;)V

    invoke-virtual {p0, v0}, Lt;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(LJc;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lt;->d(LJc;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract e(LVa;ILjava/lang/Object;)V
.end method

.method public abstract f(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract g(Ljava/lang/Object;)Ljava/lang/Object;
.end method
