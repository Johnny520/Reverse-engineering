.class public final LE9;
.super LTB;
.source ""


# instance fields
.field public l:Lqz;

.field public m:Lkh;

.field public n:Ljava/util/ArrayList;


# virtual methods
.method public final N(LCh;)I
    .locals 6

    iget-object v0, p0, LE9;->l:Lqz;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lqz;->N(LCh;)I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, LE9;->m:Lkh;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1}, Lkh;->N(LCh;)I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    iget-object v3, p0, LE9;->n:Ljava/util/ArrayList;

    if-eqz v3, :cond_3

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lta;->d0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqz;

    invoke-virtual {v5, p1}, Lqz;->N(LCh;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {v4}, Lra;->q0(Ljava/util/ArrayList;)[I

    move-result-object v3

    invoke-virtual {p1, v3}, LCh;->c([I)I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v1

    :goto_3
    const/16 v4, 0x9

    invoke-virtual {p1, v4}, LCh;->i(I)V

    const/16 v4, 0x8

    invoke-virtual {p1, v4, v3}, LCh;->a(II)V

    const/4 v3, 0x7

    invoke-virtual {p1, v3, v1}, LCh;->a(II)V

    const/4 v3, 0x6

    invoke-virtual {p1, v3, v2}, LCh;->a(II)V

    const/4 v2, 0x5

    invoke-virtual {p1, v2, v1}, LCh;->a(II)V

    const/4 v2, 0x4

    invoke-virtual {p1, v2, v1}, LCh;->a(II)V

    const/4 v2, 0x3

    invoke-virtual {p1, v2, v1}, LCh;->a(II)V

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, LCh;->a(II)V

    const/4 v2, 0x1

    invoke-virtual {p1, v2, v0}, LCh;->a(II)V

    invoke-virtual {p1, v1, v1}, LCh;->a(II)V

    invoke-virtual {p1}, LCh;->d()I

    move-result v0

    invoke-virtual {p1, v0}, LCh;->e(I)V

    return v0
.end method

.method public final varargs O([Ljava/lang/String;)V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    new-instance v4, Lqz;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Lqz;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, LE9;->n:Ljava/util/ArrayList;

    return-void
.end method
