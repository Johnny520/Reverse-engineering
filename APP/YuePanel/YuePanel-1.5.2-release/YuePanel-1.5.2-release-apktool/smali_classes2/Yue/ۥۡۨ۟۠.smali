.class public final LYue/ۥۡۨ۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e4<",
            "-TR;>;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۢ۟ۥ;

    invoke-direct {v0, p1}, LYue/ۥۣۢ۟ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :try_start_0
    invoke-interface {p0, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {v0, p0}, LYue/ۥۣۢ۟ۥ;->ۥ۟۟(Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {v0}, LYue/ۥۣۢ۟ۥ;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠ۡ۟;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e4<",
            "-TR;>;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    new-instance v0, LYue/ۥۣۢ۟ۥ;

    invoke-direct {v0, p1}, LYue/ۥۣۢ۟ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :try_start_0
    invoke-interface {p0, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {v0, p0}, LYue/ۥۣۢ۟ۥ;->ۥ۟۟(Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {v0}, LYue/ۥۣۢ۟ۥ;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    const/4 p1, 0x1

    invoke-static {p1}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟۟(I)V

    return-object p0
.end method
