.class public LYue/ۥۡۧۢۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧۢۥ$ۥ۟۟;,
        LYue/ۥۡۧۢۥ$ۥ۟۟۟۠;,
        LYue/ۥۡۧۢۥ$ۥ;,
        LYue/ۥۡۧۢۥ$ۥ۟;,
        LYue/ۥۡۧۢۥ$ۥ۟۟۟;,
        LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e0<",
            "TK;TV;>;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۦ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۥ:Ljava/util/WeakHashMap;

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۦ:I

    return-void
.end method


# virtual methods
.method public descendingIterator()Ljava/util/Iterator;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۧۢۥ$ۥ۟;

    iget-object v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iget-object v2, p0, LYue/ۥۡۧۢۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    invoke-direct {v0, v1, v2}, LYue/ۥۡۧۢۥ$ۥ۟;-><init>(LYue/ۥۡۧۢۥ$ۥ۟۟;LYue/ۥۡۧۢۥ$ۥ۟۟;)V

    iget-object v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۥ:Ljava/util/WeakHashMap;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥۡۧۢۥ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥۡۧۢۥ;

    invoke-virtual {p0}, LYue/ۥۡۧۢۥ;->size()I

    move-result v1

    invoke-virtual {p1}, LYue/ۥۡۧۢۥ;->size()I

    move-result v3

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, LYue/ۥۡۧۢۥ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-virtual {p1}, LYue/ۥۡۧۢۥ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_4

    if-nez v4, :cond_5

    :cond_4
    if-eqz v3, :cond_3

    invoke-interface {v3, v4}, Ljava/util/Map$Entry;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_5
    return v2

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, LYue/ۥۡۧۢۥ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۧۢۥ$ۥ;

    iget-object v1, p0, LYue/ۥۡۧۢۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iget-object v2, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    invoke-direct {v0, v1, v2}, LYue/ۥۡۧۢۥ$ۥ;-><init>(LYue/ۥۡۧۢۥ$ۥ۟۟;LYue/ۥۡۧۢۥ$ۥ۟۟;)V

    iget-object v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۥ:Ljava/util/WeakHashMap;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۦ:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۡۧۢۥ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ()Ljava/util/Map$Entry;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-object v0
.end method

.method public ۥ۟(Ljava/lang/Object;)LYue/ۥۡۧۢۥ$ۥ۟۟;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, v0, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    goto :goto_0

    :cond_1
    :goto_1
    return-object v0
.end method

.method public ۥ۟۟()LYue/ۥۡۧۢۥ$ۥ۟۟۟;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5<",
            "TK;TV;>.\u06e5\u06df\u06df\u06df;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۧۢۥ$ۥ۟۟۟;

    invoke-direct {v0, p0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟;-><init>(LYue/ۥۡۧۢۥ;)V

    iget-object v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۥ:Ljava/util/WeakHashMap;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public ۥ۟۟۟()Ljava/util/Map$Entry;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-object v0
.end method

.method public ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۡۧۢۥ$ۥ۟۟;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۧۢۥ$ۥ۟۟;

    invoke-direct {v0, p1, p2}, LYue/ۥۡۧۢۥ$ۥ۟۟;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۦ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۦ:I

    iget-object p1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-nez p1, :cond_0

    iput-object v0, p0, LYue/ۥۡۧۢۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object v0, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-object v0

    :cond_0
    iput-object v0, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object p1, v0, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object v0, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-object v0
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۡۧۢۥ;->ۥ۟(Ljava/lang/Object;)LYue/ۥۡۧۢۥ$ۥ۟۟;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, v0, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2}, LYue/ۥۡۧۢۥ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۡۧۢۥ$ۥ۟۟;

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥۡۧۢۥ;->ۥ۟(Ljava/lang/Object;)LYue/ۥۡۧۢۥ$ۥ۟۟;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۦ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۦ:I

    iget-object v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۥ:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Ljava/util/WeakHashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۥ:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۡۧۢۥ$ۥ۟۟۟۠;

    invoke-virtual {v2, p1}, LYue/ۥۡۧۢۥ$ۥ۟۟۟۠;->ۥ(LYue/ۥۡۧۢۥ$ۥ۟۟;)V

    goto :goto_0

    :cond_1
    iget-object v1, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-eqz v1, :cond_2

    iget-object v2, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object v2, v1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    goto :goto_1

    :cond_2
    iget-object v2, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object v2, p0, LYue/ۥۡۧۢۥ;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    :goto_1
    iget-object v2, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-eqz v2, :cond_3

    iput-object v1, v2, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    goto :goto_2

    :cond_3
    iput-object v1, p0, LYue/ۥۡۧۢۥ;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    :goto_2
    iput-object v0, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object v0, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iget-object p1, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object p1
.end method
