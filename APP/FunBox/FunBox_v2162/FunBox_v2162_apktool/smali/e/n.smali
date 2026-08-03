.class public abstract Le/n;
.super Le/j;
.source "SourceFile"


# virtual methods
.method public final b()I
    .locals 1

    invoke-virtual {p0}, Le/j;->k()Le/l;

    move-result-object v0

    invoke-virtual {v0}, Le/l;->b()Le/p;

    move-result-object v0

    invoke-virtual {v0}, Le/p;->d()I

    move-result v0

    return v0
.end method

.method protected final q()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Le/j;->k()Le/l;

    move-result-object v0

    invoke-virtual {v0}, Le/l;->b()Le/p;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Le/j;->k()Le/l;

    move-result-object v1

    invoke-virtual {v1}, Le/l;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0}, Le/p;->g(Le/j;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p0}, Le/p;->h(Le/j;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0x64

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, " // "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final v(I)Le/j;
    .locals 1

    invoke-virtual {p0}, Le/j;->m()Lj/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lj/o;->N(I)Lj/o;

    move-result-object p1

    invoke-virtual {p0, p1}, Le/j;->w(Lj/o;)Le/j;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ln/d;)V
    .locals 1

    invoke-virtual {p0}, Le/j;->k()Le/l;

    move-result-object v0

    invoke-virtual {v0}, Le/l;->b()Le/p;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Le/p;->u(Ln/d;Le/j;)V

    return-void
.end method
