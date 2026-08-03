.class public final LYue/ۥ۠ۨۧ;
.super LYue/ۥ۟۟ۡۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e1\u06e5<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;TK;TV;>;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۨۦۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۨۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "backing"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥ۟۟ۡۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    return-void
.end method


# virtual methods
.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۨۧ;->ۥ۟۟۟۟(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->clear()V

    return-void
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۨ(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۠ۢ()LYue/ۥ۠ۨۦۨ$ۥ۟;

    move-result-object v0

    return-object v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۦ()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۦ()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->size()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟(Ljava/util/Map$Entry;)Z
    .locals 1
    .param p1    # Ljava/util/Map$Entry;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)Z"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۠(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟(Ljava/util/Map$Entry;)Z
    .locals 1
    .param p1    # Ljava/util/Map$Entry;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "element"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟ۢ(Ljava/util/Map$Entry;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۟(Ljava/util/Map$Entry;)Z
    .locals 1
    .param p1    # Ljava/util/Map$Entry;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;)Z"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ۥ۟۟۟۠()LYue/ۥ۠ۨۦۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۧ;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    return-object v0
.end method
