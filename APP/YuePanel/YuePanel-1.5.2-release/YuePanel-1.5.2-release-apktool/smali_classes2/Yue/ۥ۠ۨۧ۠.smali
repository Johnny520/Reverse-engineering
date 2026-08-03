.class public final LYue/ۥ۠ۨۧ۠;
.super LYue/ۥ۟۟ۡۦ;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;
.implements LYue/ۥ۠ۦۣ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e1\u06e6<",
        "TV;>;",
        "Ljava/util/Collection<",
        "TV;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e3;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "*TV;>;"
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
            "*TV;>;)V"
        }
    .end annotation

    const-string v0, "backing"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LYue/ۥ۟۟ۡۦ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
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
            "+TV;>;)Z"
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

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۦۨ;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

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
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟ۢۤ()LYue/ۥ۠ۨۦۨ$ۥ۟۟۟۠;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟ۢۢ(Ljava/lang/Object;)Z

    move-result p1

    return p1
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

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

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

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۦ()V

    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->size()I

    move-result v0

    return v0
.end method

.method public final ۥ۟()LYue/ۥ۠ۨۦۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "*TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۧ۠;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    return-object v0
.end method
