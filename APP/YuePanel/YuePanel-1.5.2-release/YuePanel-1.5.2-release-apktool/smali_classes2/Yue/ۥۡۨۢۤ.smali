.class public LYue/ۥۡۨۢۤ;
.super LYue/ۥۣۡۨۢ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۣۡۨۢ;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣ۠۠ۨ;)LYue/ۥۡۨۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+",
            "Ljava/util/Iterator<",
            "+TT;>;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "iterator"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۨۢۤ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۡۨۢۤ$ۥ;-><init>(LYue/ۥۣ۠۠ۨ;)V

    return-object v0
.end method

.method public static ۥ۟۟۟۟(Ljava/util/Iterator;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # Ljava/util/Iterator;
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
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۨۢۤ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۡۨۢۤ$ۥ۟;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟۠(LYue/ۥۡۨۢ;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(LYue/ۥۡۨۢ;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # LYue/ۥۡۨۢ;
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
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, LYue/ۥ۟ۧ۟۟;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۧ۟۟;

    invoke-direct {v0, p0}, LYue/ۥ۟ۧ۟۟;-><init>(LYue/ۥۡۨۢ;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static ۥ۟۟۟ۡ()LYue/ۥۡۨۢ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۠۠ۨۡ;->ۥ:LYue/ۥ۠۠ۨۡ;

    return-object v0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;
    .locals 2
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            "-TT;+TC;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TC;+",
            "Ljava/util/Iterator<",
            "+TR;>;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "source"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transform"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iterator"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۨۢۤ$ۥ۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, LYue/ۥۡۨۢۤ$ۥ۟۟;-><init>(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۢۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۡۨۢۢ;->ۥ۟(LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۡۨۢ;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # LYue/ۥۡۨۢ;
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
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۨۢۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۨۢۤ$ۥ۟۟۟;

    invoke-static {p0, v0}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟ۤ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+",
            "Ljava/util/Iterator<",
            "+TR;>;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TR;>;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥۢۢ۟ۥ;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥۢۢ۟ۥ;

    invoke-virtual {p0, p1}, LYue/ۥۢۢ۟ۥ;->ۥ۟۟۟۟(LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥ۠ۢۢ۟;

    sget-object v1, LYue/ۥۡۨۢۤ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥۡۨۢۤ$ۥ۟۟۟۠;

    invoke-direct {v0, p0, v1, p1}, LYue/ۥ۠ۢۢ۟;-><init>(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۡ۟;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥۡۨۢ;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "flattenSequenceOfIterable"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+",
            "Ljava/lang/Iterable<",
            "+TT;>;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۨۢۤ$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۨۢۤ$ۥ۟۟۟۟;

    invoke-static {p0, v0}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟ۤ(LYue/ۥۡۨۢ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۦ(LYue/ۥۣ۠۠ۨ;)LYue/ۥۡۨۢ;
    .locals 2
    .param p0    # LYue/ۥۣ۠۠ۨ;
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
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "nextFunction"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۣ۠ۨ;

    new-instance v1, LYue/ۥۡۨۢۤ$ۥ۟۟۟ۡ;

    invoke-direct {v1, p0}, LYue/ۥۡۨۢۤ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۣ۠۠ۨ;)V

    invoke-direct {v0, p0, v1}, LYue/ۥۣۣ۠ۨ;-><init>(LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۡ۟;)V

    invoke-static {v0}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟۠(LYue/ۥۡۨۢ;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۧ(LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
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
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "seedFunction"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextFunction"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣۣ۠ۨ;

    invoke-direct {v0, p0, p1}, LYue/ۥۣۣ۠ۨ;-><init>(LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۡ۟;)V

    return-object v0
.end method

.method public static ۥ۟۟۟ۨ(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)LYue/ۥۡۨۢ;
    .locals 2
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۠ۨۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "nextFunction"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p0, :cond_0

    sget-object p0, LYue/ۥ۠۠ۨۡ;->ۥ:LYue/ۥ۠۠ۨۡ;

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣۣ۠ۨ;

    new-instance v1, LYue/ۥۡۨۢۤ$ۥ۟۟۟ۢ;

    invoke-direct {v1, p0}, LYue/ۥۡۨۢۤ$ۥ۟۟۟ۢ;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p1}, LYue/ۥۣۣ۠ۨ;-><init>(LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۡ۟;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟۠(LYue/ۥۡۨۢ;LYue/ۥۣ۠۠ۨ;)LYue/ۥۡۨۢ;
    .locals 2
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultValue"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۨۢۤ$ۥۣ۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥۡۨۢۤ$ۥۣ۟۟۟;-><init>(LYue/ۥۡۨۢ;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۡۨۢۢ;->ۥ۟(LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠۟(LYue/ۥۡۨۢ;)LYue/ۥۡۨۢ;
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    invoke-static {}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟ۡ()LYue/ۥۡۨۢ;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static varargs ۥ۟۟۠۠([Ljava/lang/Object;)LYue/ۥۡۨۢ;
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
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟ۡ()LYue/ۥۡۨۢ;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {p0}, LYue/ۥ۟ۢ۟۠;->ۥ۟ۢ۠۟([Ljava/lang/Object;)LYue/ۥۡۨۢ;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟۠ۡ(LYue/ۥۡۨۢ;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # LYue/ۥۡۨۢ;
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
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;)",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۡۨۢۤ;->ۥ۟۟۠ۢ(LYue/ۥۡۨۢ;LYue/ۥۡۥۨۤ;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۢ(LYue/ۥۡۨۢ;LYue/ۥۡۥۨۤ;)LYue/ۥۡۨۢ;
    .locals 2
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۥۨۤ;
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
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+TT;>;",
            "LYue/\u06e5\u06e1\u06e5\u06e8\u06e4;",
            ")",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۨۢۤ$ۥ۟۟۟ۤ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥۡۨۢۤ$ۥ۟۟۟ۤ;-><init>(LYue/ۥۡۨۢ;LYue/ۥۡۥۨۤ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۡۨۢۢ;->ۥ۟(LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۢ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟۠(LYue/ۥۡۨۢ;)LYue/ۥۣۡۦ۠;
    .locals 4
    .param p0    # LYue/ۥۡۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "+",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "+TT;+TR;>;>;)",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TR;>;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۣۡۦ۠;

    invoke-virtual {v2}, LYue/ۥۣۡۦ۠;->ۥ۟۟۟۟()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2}, LYue/ۥۣۡۦ۠;->ۥ۟۟۟۠()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, LYue/ۥۢۢۢۡ;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)LYue/ۥۣۡۦ۠;

    move-result-object p0

    return-object p0
.end method
