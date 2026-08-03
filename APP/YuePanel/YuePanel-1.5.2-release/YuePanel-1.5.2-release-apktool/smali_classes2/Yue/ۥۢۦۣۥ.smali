.class public final LYue/ۥۢۦۣۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟ۡ(LYue/ۥ۟ۧۦۥ;)V

    invoke-static {p0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v1

    instance-of v2, v1, LYue/ۥ۠۟ۢ۟;

    if-eqz v2, :cond_0

    check-cast v1, LYue/ۥ۠۟ۢ۟;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_2

    :cond_1
    iget-object v2, v1, LYue/ۥ۠۟ۢ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۦۨ;

    invoke-virtual {v2, v0}, LYue/ۥ۟ۧۦۨ;->isDispatchNeeded(LYue/ۥ۟ۧۦۥ;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v1, v0, v2}, LYue/ۥ۠۟ۢ۟;->ۥ۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance v2, LYue/ۥۢۦۣۤ;

    invoke-direct {v2}, LYue/ۥۢۦۣۤ;-><init>()V

    invoke-interface {v0, v2}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    sget-object v3, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {v1, v0, v3}, LYue/ۥ۠۟ۢ۟;->ۥ۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    iget-boolean v0, v2, LYue/ۥۢۦۣۤ;->ۥۣ۟۟۠:Z

    if-eqz v0, :cond_4

    invoke-static {v1}, LYue/ۥ۠۟ۢ۠;->ۥ۟۟۟ۢ(LYue/ۥ۠۟ۢ۟;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_3
    move-object v0, v3

    goto :goto_2

    :cond_4
    :goto_1
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-static {p0}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_5
    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p0

    if-ne v0, p0, :cond_6

    return-object v0

    :cond_6
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method
