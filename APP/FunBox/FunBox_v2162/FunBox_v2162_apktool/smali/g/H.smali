.class public final Lg/H;
.super Lg/q;
.source "SourceFile"


# virtual methods
.method public final a(Lg/k;)V
    .locals 1

    invoke-virtual {p1}, Lg/k;->p()Lg/x;

    move-result-object p1

    invoke-virtual {p0}, Lg/q;->i()Lk/u;

    move-result-object v0

    invoke-virtual {v0}, Lk/u;->h()Lk/t;

    move-result-object v0

    invoke-virtual {p1, v0}, Lg/x;->u(Lk/t;)V

    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->f:Lg/t;

    return-object v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final d(Lg/k;Ln/d;)V
    .locals 3

    invoke-virtual {p0}, Lg/q;->i()Lk/u;

    move-result-object v0

    invoke-virtual {v0}, Lk/u;->h()Lk/t;

    move-result-object v0

    invoke-virtual {p1}, Lg/k;->p()Lg/x;

    move-result-object p1

    invoke-virtual {p1, v0}, Lg/x;->q(Lk/t;)I

    move-result p1

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/r;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lk/t;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {p1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "  descriptor_idx: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {p2, v1, v0}, Ln/d;->b(ILjava/lang/String;)V

    :cond_0
    invoke-virtual {p2, p1}, Ln/d;->q(I)V

    return-void
.end method
