.class public final La/pc;
.super La/a2;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La/oc;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final b(La/B6;)I
    .locals 4

    iget-object v0, p0, La/pc;->a:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/oc;

    if-eqz v3, :cond_0

    :goto_1
    invoke-virtual {v3, p1}, La/oc;->b(La/B6;)I

    move-result v3

    goto :goto_2

    :cond_0
    new-instance v3, La/oc;

    invoke-direct {v3}, La/oc;-><init>()V

    goto :goto_1

    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2}, La/t3;->v0(Ljava/util/ArrayList;)[I

    move-result-object v0

    invoke-virtual {p1, v0}, La/B6;->d([I)I

    move-result v0

    goto :goto_3

    :cond_2
    move v0, v1

    :goto_3
    const/4 v2, 0x2

    invoke-virtual {p1, v2}, La/B6;->i(I)V

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v1}, La/B6;->a(II)V

    invoke-virtual {p1, v1, v0}, La/B6;->a(II)V

    invoke-virtual {p1}, La/B6;->e()I

    move-result v0

    invoke-virtual {p1, v0}, La/B6;->f(I)V

    return v0
.end method
