.class public LYue/ۥۡۨۤۡ;
.super LYue/ۥۡۨۤ۠;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۨۤ۠;-><init>()V

    return-void
.end method

.method public static final ۥۣ۟۟۟(ILYue/ۥۣ۠ۡ۟;)Ljava/util/Set;
    .locals 1
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۣ۟ۤ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.6"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/util/Set<",
            "TE;>;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LYue/ۥۡۨۤ۠;->ۥ۟۟۟۟(I)Ljava/util/Set;

    move-result-object p0

    invoke-interface {p1, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۡۨۤ۠;->ۥ(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۣ۠ۡ۟;)Ljava/util/Set;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۣ۟ۤ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.6"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/util/Set<",
            "TE;>;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/util/Set<",
            "TE;>;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LYue/ۥۡۨۤ۠;->ۥ۟۟۟()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p0, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, LYue/ۥۡۨۤ۠;->ۥ(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۥ()Ljava/util/Set;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۠۠ۨۢ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۨۢ;

    return-object v0
.end method

.method public static final ۥ۟۟۟ۦ()Ljava/util/HashSet;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/HashSet<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    return-object v0
.end method

.method public static final varargs ۥ۟۟۟ۧ([Ljava/lang/Object;)Ljava/util/HashSet;
    .locals 2
    .param p0    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/HashSet<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/HashSet;

    array-length v1, p0

    invoke-static {v1}, LYue/ۥ۠ۨۧۦ;->ۥ۟۟۟ۤ(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    invoke-static {p0, v0}, LYue/ۥ۟ۢ۟۠;->ۥ۠ۥۣۦ([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/util/HashSet;

    return-object p0
.end method

.method public static final ۥ۟۟۟ۨ()Ljava/util/LinkedHashSet;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/LinkedHashSet<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public static final varargs ۥ۟۟۠([Ljava/lang/Object;)Ljava/util/LinkedHashSet;
    .locals 2
    .param p0    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/LinkedHashSet<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    array-length v1, p0

    invoke-static {v1}, LYue/ۥ۠ۨۧۦ;->ۥ۟۟۟ۤ(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    invoke-static {p0, v0}, LYue/ۥ۟ۢ۟۠;->ۥ۠ۥۣۦ([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/util/LinkedHashSet;

    return-object p0
.end method

.method public static final ۥ۟۟۠۟()Ljava/util/Set;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public static final varargs ۥ۟۟۠۠([Ljava/lang/Object;)Ljava/util/Set;
    .locals 2
    .param p0    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    array-length v1, p0

    invoke-static {v1}, LYue/ۥ۠ۨۧۦ;->ۥ۟۟۟ۤ(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(I)V

    invoke-static {p0, v0}, LYue/ۥ۟ۢ۟۠;->ۥ۠ۥۣۦ([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method public static final ۥ۟۟۠ۡ(Ljava/util/Set;)Ljava/util/Set;
    .locals 2
    .param p0    # Ljava/util/Set;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "+TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۨۤ۠;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-static {}, LYue/ۥۡۨۤۡ;->ۥ۟۟۟ۥ()Ljava/util/Set;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟۠ۢ(Ljava/util/Set;)Ljava/util/Set;
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Set<",
            "+TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, LYue/ۥۡۨۤۡ;->ۥ۟۟۟ۥ()Ljava/util/Set;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final ۥۣ۟۟۠()Ljava/util/Set;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, LYue/ۥۡۨۤۡ;->ۥ۟۟۟ۥ()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public static final varargs ۥ۟۟۠ۤ([Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .param p0    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-lez v0, :cond_0

    invoke-static {p0}, LYue/ۥ۟ۢ۟۠;->ۥ۠ۥۨ۠([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, LYue/ۥۡۨۤۡ;->ۥ۟۟۟ۥ()Ljava/util/Set;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟۠ۥ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-static {p0}, LYue/ۥۡۨۤ۠;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, LYue/ۥۡۨۤۡ;->ۥ۟۟۟ۥ()Ljava/util/Set;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final varargs ۥ۟۟۠ۦ([Ljava/lang/Object;)Ljava/util/Set;
    .locals 1
    .param p0    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-static {p0, v0}, LYue/ۥ۟ۢ۟۠;->ۥۣ۟ۤۤ([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method
