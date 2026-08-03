.class public LYue/ۥ۟ۡۨۡ;
.super LYue/ۥۢ۟ۡ;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e2\u06df\u06e1<",
        "TK;TV;>;",
        "Ljava/util/Map<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field mCollections:LYue/ۥ۠ۨۧۡ;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e7\u06e1<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۢ۟ۡ;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۢ۟ۡ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۢ۟ۡ;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LYue/ۥۢ۟ۡ;-><init>(LYue/ۥۢ۟ۡ;)V

    return-void
.end method


# virtual methods
.method public containsAll(Ljava/util/Collection;)Z
    .locals 0
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۠ۨۧۡ;->ۥ۟۟۟ۤ(Ljava/util/Map;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public entrySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۡۨۡ;->ۥ۟۟۟()LYue/ۥ۠ۨۧۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۨۧۡ;->ۥ۟۟۟ۦ()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public keySet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "TK;>;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۡۨۡ;->ۥ۟۟۟()LYue/ۥ۠ۨۧۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۨۧۡ;->ۥ۟۟۟ۧ()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public putAll(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "+TK;+TV;>;)V"
        }
    .end annotation

    iget v0, p0, LYue/ۥۢ۟ۡ;->mSize:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0, v0}, LYue/ۥۢ۟ۡ;->ensureCapacity(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, LYue/ۥۢ۟ۡ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 0
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۠ۨۧۡ;->ۥ۟۟۠(Ljava/util/Map;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 0
    .param p1    # Ljava/util/Collection;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۠ۨۧۡ;->ۥ۟۟۠۟(Ljava/util/Map;Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public values()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۡۨۡ;->ۥ۟۟۟()LYue/ۥ۠ۨۧۡ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۠ۨۧۡ;->ۥ۟۟۟ۨ()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟۟()LYue/ۥ۠ۨۧۡ;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e8\u06e7\u06e1<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۨۡ;->mCollections:LYue/ۥ۠ۨۧۡ;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۡۨۡ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۨۡ$ۥ;-><init>(LYue/ۥ۟ۡۨۡ;)V

    iput-object v0, p0, LYue/ۥ۟ۡۨۡ;->mCollections:LYue/ۥ۠ۨۧۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۡۨۡ;->mCollections:LYue/ۥ۠ۨۧۡ;

    return-object v0
.end method
