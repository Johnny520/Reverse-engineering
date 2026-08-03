.class public final LYue/ۥۣ۠۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣ۠۠ۤ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # LYue/ۥۣ۠۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e4;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, LYue/ۥۣ۠۠ۥ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LYue/ۥۣ۠۠ۥ$ۥ;

    iget v1, v0, LYue/ۥۣ۠۠ۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥۣ۠۠ۥ$ۥ;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۣ۠۠ۥ$ۥ;

    invoke-direct {v0, p2}, LYue/ۥۣ۠۠ۥ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p2, v0, LYue/ۥۣ۠۠ۥ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥۣ۠۠ۥ$ۥ;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥۣ۠۠ۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, LYue/ۥۣ۠۠ۤ;

    :try_start_0
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟()V

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۟()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :cond_3
    :try_start_1
    iput-object p0, v0, LYue/ۥۣ۠۠ۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥۣ۠۠ۥ$ۥ;->ۥ۟۟۠ۥ:I

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۢ()V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :goto_2
    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۢ()V

    invoke-static {v3}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method

.method public static final ۥ۟(LYue/ۥۣ۠۠ۤ;LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e4;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟()V

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1, p2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۢ()V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0

    :catchall_0
    move-exception p1

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۢ()V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method
