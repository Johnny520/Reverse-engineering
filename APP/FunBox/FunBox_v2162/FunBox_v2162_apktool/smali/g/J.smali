.class public abstract Lg/J;
.super Lg/E;
.source "SourceFile"


# virtual methods
.method public final a(Lg/s;)I
    .locals 1

    check-cast p1, Lg/r;

    invoke-virtual {p1}, Lg/r;->e()I

    move-result v0

    invoke-virtual {p1}, Lg/s;->c()I

    move-result p1

    mul-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lg/E;->b(I)I

    move-result p1

    return p1
.end method

.method protected final h()V
    .locals 3

    invoke-virtual {p0}, Lg/E;->d()Lg/k;

    move-result-object v0

    invoke-virtual {p0}, Lg/J;->o()V

    invoke-virtual {p0}, Lg/E;->f()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg/s;

    invoke-virtual {v2, v0}, Lg/s;->a(Lg/k;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l()I
    .locals 2

    invoke-virtual {p0}, Lg/E;->f()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/s;

    invoke-virtual {v0}, Lg/s;->c()I

    move-result v0

    mul-int/2addr v0, v1

    return v0
.end method

.method protected final n(Ln/d;)V
    .locals 4

    invoke-virtual {p0}, Lg/E;->d()Lg/k;

    move-result-object v0

    invoke-virtual {p0}, Lg/E;->c()I

    move-result v1

    invoke-virtual {p0}, Lg/E;->f()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg/s;

    invoke-virtual {v3, v0, p1}, Lg/s;->d(Lg/k;Ln/d;)V

    invoke-virtual {p1, v1}, Ln/d;->a(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected abstract o()V
.end method
