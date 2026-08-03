.class public LYue/ۥ۠ۡۦۦ;
.super LYue/ۥۡۧۢۥ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۧ:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TK;",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LYue/ۥۡۧۢۥ;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥ۠ۡۦۦ;->ۥ۟۟۠ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۦۦ;->ۥ۟۟۠ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟(Ljava/lang/Object;)LYue/ۥۡۧۢۥ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۡۦۦ;->ۥ۟۟۠ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-object p1
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

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۦۦ;->ۥ۟(Ljava/lang/Object;)LYue/ۥۡۧۢۥ$ۥ۟۟;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, v0, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۡۦۦ;->ۥ۟۟۠ۧ:Ljava/util/HashMap;

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۧۢۥ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۡۧۢۥ$ۥ۟۟;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return-object p1
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥۡۧۢۥ;->ۥ۟۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LYue/ۥ۠ۡۦۦ;->ۥ۟۟۠ۧ:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۠ۡۦۦ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۡۦۦ;->ۥ۟۟۠ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۡۧۢۥ$ۥ۟۟;

    iget-object p1, p1, LYue/ۥۡۧۢۥ$ۥ۟۟;->ۥ۟۟۠ۦ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
