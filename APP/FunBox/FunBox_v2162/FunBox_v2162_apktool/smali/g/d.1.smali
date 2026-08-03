.class public final Lg/d;
.super Lg/C;
.source "SourceFile"


# instance fields
.field private final e:Lk/u;

.field private final f:Ljava/util/ArrayList;

.field private final g:Ljava/util/HashMap;

.field private final h:Ljava/util/ArrayList;

.field private final i:Ljava/util/ArrayList;

.field private final j:Ljava/util/ArrayList;

.field private k:Lk/c;

.field private l:[B


# direct methods
.method public constructor <init>(Lk/u;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, Lg/C;-><init>(II)V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lg/d;->e:Lk/u;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lg/d;->f:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/HashMap;

    const/16 v1, 0x28

    invoke-direct {p1, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Lg/d;->g:Ljava/util/HashMap;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lg/d;->h:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lg/d;->i:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lg/d;->j:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput-object p1, p0, Lg/d;->k:Lk/c;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "thisClass == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static o(Lg/k;Ln/d;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ln/d;->d()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "  "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v2, p2}, Ln/d;->b(ILjava/lang/String;)V

    :cond_1
    move p2, v2

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/m;

    invoke-virtual {v1, p0, p1, p2, v2}, Lg/m;->b(Lg/k;Ln/d;II)I

    move-result p2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private p(Lg/k;Ln/d;)V
    .locals 10

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lg/C;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " class data for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lg/d;->e:Lk/u;

    invoke-virtual {v2}, Lk/u;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p2, v2, v1}, Ln/d;->b(ILjava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lg/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const-string v3, "static_fields"

    invoke-static {p2, v3, v2}, Lg/d;->q(Ln/d;Ljava/lang/String;I)V

    iget-object v2, p0, Lg/d;->h:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    const-string v5, "instance_fields"

    invoke-static {p2, v5, v4}, Lg/d;->q(Ln/d;Ljava/lang/String;I)V

    iget-object v4, p0, Lg/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    const-string v7, "direct_methods"

    invoke-static {p2, v7, v6}, Lg/d;->q(Ln/d;Ljava/lang/String;I)V

    iget-object v6, p0, Lg/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v8

    const-string v9, "virtual_methods"

    invoke-static {p2, v9, v8}, Lg/d;->q(Ln/d;Ljava/lang/String;I)V

    invoke-static {p1, p2, v3, v1}, Lg/d;->o(Lg/k;Ln/d;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-static {p1, p2, v5, v2}, Lg/d;->o(Lg/k;Ln/d;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-static {p1, p2, v7, v4}, Lg/d;->o(Lg/k;Ln/d;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-static {p1, p2, v9, v6}, Lg/d;->o(Lg/k;Ln/d;Ljava/lang/String;Ljava/util/ArrayList;)V

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ln/d;->f()V

    :cond_1
    return-void
.end method

.method private static q(Ln/d;Ljava/lang/String;I)V
    .locals 1

    invoke-virtual {p0}, Ln/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "_size:"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p1, v0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "  %-21s %08x"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ln/d;->c(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, p2}, Ln/d;->t(I)I

    return-void
.end method


# virtual methods
.method public final a(Lg/k;)V
    .locals 3

    iget-object v0, p0, Lg/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lg/d;->r()Lk/c;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lc/d;->a(Ljava/lang/Object;)V

    throw v2

    :cond_1
    :goto_0
    iget-object v0, p0, Lg/d;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lc/d;->a(Ljava/lang/Object;)V

    throw v2

    :cond_3
    :goto_1
    iget-object v0, p0, Lg/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/n;

    invoke-virtual {v1, p1}, Lg/n;->f(Lg/k;)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lg/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg/n;

    invoke-virtual {v1, p1}, Lg/n;->f(Lg/k;)V

    goto :goto_3

    :cond_5
    return-void
.end method

.method public final b()Lg/t;
    .locals 1

    sget-object v0, Lg/t;->l:Lg/t;

    return-object v0
.end method

.method protected final j(Lg/E;I)V
    .locals 0

    new-instance p2, Ln/d;

    invoke-direct {p2}, Ln/d;-><init>()V

    invoke-virtual {p1}, Lg/E;->d()Lg/k;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lg/d;->p(Lg/k;Ln/d;)V

    invoke-virtual {p2}, Ln/d;->m()[B

    move-result-object p1

    iput-object p1, p0, Lg/d;->l:[B

    array-length p1, p1

    invoke-virtual {p0, p1}, Lg/C;->k(I)V

    return-void
.end method

.method public final l(Lg/k;Ln/d;)V
    .locals 1

    invoke-virtual {p2}, Ln/d;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lg/d;->p(Lg/k;Ln/d;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lg/d;->l:[B

    invoke-virtual {p2, p1}, Ln/d;->o([B)V

    :goto_0
    return-void
.end method

.method public final m(Lg/n;)V
    .locals 1

    iget-object v0, p0, Lg/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final n(Lg/n;)V
    .locals 1

    iget-object v0, p0, Lg/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final r()Lk/c;
    .locals 9

    iget-object v0, p0, Lg/d;->k:Lk/c;

    if-nez v0, :cond_5

    iget-object v0, p0, Lg/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    iget-object v2, p0, Lg/d;->g:Ljava/util/HashMap;

    const/4 v3, 0x0

    if-lez v1, :cond_2

    add-int/lit8 v4, v1, -0x1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lc/d;->a(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lk/a;

    instance-of v6, v5, Lk/n;

    if-eqz v6, :cond_0

    check-cast v5, Lk/n;

    invoke-virtual {v5}, Lk/n;->i()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_0
    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move v1, v4

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    new-instance v4, Lk/b;

    invoke-direct {v4, v1}, Lk/b;-><init>(I)V

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v1, :cond_4

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lc/d;->a(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lk/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v5, v6}, Lk/b;->y(ILk/a;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Ln/j;->g()V

    new-instance v3, Lk/c;

    invoke-direct {v3, v4}, Lk/c;-><init>(Lk/b;)V

    :goto_3
    iput-object v3, p0, Lg/d;->k:Lk/c;

    :cond_5
    iget-object v0, p0, Lg/d;->k:Lk/c;

    return-object v0
.end method

.method public final s()Z
    .locals 1

    iget-object v0, p0, Lg/d;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg/d;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg/d;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg/d;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
