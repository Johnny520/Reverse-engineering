.class public final Lg/z;
.super Lg/w;
.source "SourceFile"


# instance fields
.field private final f:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>(Lg/k;)V
    .locals 1

    const-string v0, "method_ids"

    invoke-direct {p0, v0, p1}, Lg/w;-><init>(Ljava/lang/String;Lg/k;)V

    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    iput-object p1, p0, Lg/z;->f:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final f()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lg/z;->f:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lk/a;)Lg/r;
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lg/E;->j()V

    iget-object v0, p0, Lg/z;->f:Ljava/util/TreeMap;

    check-cast p1, Lk/d;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg/r;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cst == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lk/d;)I
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lg/E;->j()V

    iget-object v0, p0, Lg/z;->f:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg/y;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lg/r;->e()I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "not found"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "ref == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized r(Lk/d;)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p0}, Lg/E;->k()V

    iget-object v0, p0, Lg/z;->f:Ljava/util/TreeMap;

    invoke-virtual {v0, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg/y;

    if-nez v0, :cond_0

    new-instance v0, Lg/y;

    invoke-direct {v0, p1}, Lg/y;-><init>(Lk/d;)V

    iget-object v1, p0, Lg/z;->f:Ljava/util/TreeMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "method == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final s(Ln/d;)V
    .locals 5

    invoke-virtual {p0}, Lg/E;->j()V

    iget-object v0, p0, Lg/z;->f:Ljava/util/TreeMap;

    invoke-virtual {v0}, Ljava/util/TreeMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg/E;->e()I

    move-result v1

    :goto_0
    invoke-virtual {p1}, Ln/d;->d()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "method_ids_size: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    invoke-virtual {p1, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    invoke-static {v1}, La/b;->s(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "method_ids_off:  "

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v3, v2}, Ln/d;->b(ILjava/lang/String;)V

    :cond_1
    invoke-virtual {p1, v0}, Ln/d;->q(I)V

    invoke-virtual {p1, v1}, Ln/d;->q(I)V

    return-void
.end method
