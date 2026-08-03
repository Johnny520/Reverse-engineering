.class public final LTr;
.super LTB;
.source ""


# instance fields
.field public l:Lqz;

.field public m:LE9;

.field public n:LE9;

.field public o:LGt;

.field public p:Ljava/util/ArrayList;


# virtual methods
.method public final N(I)V
    .locals 2

    iget-object v0, p0, LTr;->o:LGt;

    if-nez v0, :cond_0

    new-instance v0, LGt;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LTr;->o:LGt;

    :cond_0
    iget-object v0, p0, LTr;->o:LGt;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LFl;

    invoke-direct {v1, p1}, LFl;-><init>(I)V

    iput-object v1, v0, LGt;->m:LFl;

    return-void
.end method

.method public final O(Ljava/util/List;)V
    .locals 6

    new-instance v0, LGt;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    sget-object v2, LKf;->a:LKf;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, LGt;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v2, LFt;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, LE9;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lqz;

    const/4 v5, 0x5

    invoke-direct {v4, v1, v5}, Lqz;-><init>(Ljava/lang/String;I)V

    iput-object v4, v3, LE9;->l:Lqz;

    iput-object v3, v2, LFt;->l:LE9;

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    iget-object v1, v0, LGt;->l:Ljava/util/List;

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    iput-object v1, v0, LGt;->l:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iput-object v0, p0, LTr;->o:LGt;

    return-void
.end method

.method public final varargs P([Ljava/lang/String;)V
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

    const/4 v5, 0x5

    invoke-direct {v4, v3, v5}, Lqz;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, LTr;->p:Ljava/util/ArrayList;

    return-void
.end method

.method public final varargs Q([Ljava/lang/String;)V
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

    iput-object p1, p0, LTr;->p:Ljava/util/ArrayList;

    return-void
.end method
