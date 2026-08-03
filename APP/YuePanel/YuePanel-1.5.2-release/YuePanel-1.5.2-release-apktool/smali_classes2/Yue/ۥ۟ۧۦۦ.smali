.class public final LYue/ۥ۟ۧۦۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;
    .locals 2
    .param p0    # LYue/ۥ۟ۧۦۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥ۟;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "TE;>;)TE;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥ۟۟ۡ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, LYue/ۥ۟۟ۡ;

    invoke-interface {p0}, LYue/ۥ۟ۧۦۥ$ۥ۟;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۡ;->ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, LYue/ۥ۟۟ۡ;->ۥ۟(LYue/ۥ۟ۧۦۥ$ۥ۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    instance-of p1, p0, LYue/ۥ۟ۧۦۥ$ۥ۟;

    if-eqz p1, :cond_0

    move-object v1, p0

    :cond_0
    return-object v1

    :cond_1
    invoke-interface {p0}, LYue/ۥ۟ۧۦۥ$ۥ۟;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v0

    if-ne v0, p1, :cond_2

    goto :goto_0

    :cond_2
    move-object p0, v1

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥ۟ۧۦۥ$ۥ۟;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥ۟;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥ۟۟ۡ;

    if-eqz v0, :cond_1

    check-cast p1, LYue/ۥ۟۟ۡ;

    invoke-interface {p0}, LYue/ۥ۟ۧۦۥ$ۥ۟;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {p1, v0}, LYue/ۥ۟۟ۡ;->ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p0}, LYue/ۥ۟۟ۡ;->ۥ۟(LYue/ۥ۟ۧۦۥ$ۥ۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    return-object p0

    :cond_1
    invoke-interface {p0}, LYue/ۥ۟ۧۦۥ$ۥ۟;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v0

    if-ne v0, p1, :cond_2

    sget-object p0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_2
    return-object p0
.end method
