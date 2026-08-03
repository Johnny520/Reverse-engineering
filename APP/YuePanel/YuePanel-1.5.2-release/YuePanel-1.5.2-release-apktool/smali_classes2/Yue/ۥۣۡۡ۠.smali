.class public final synthetic LYue/ۥۣۡۡ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ()LYue/ۥۣۢ۟ۡ;
    .locals 1
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "blackhole"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟ۢۧۥ;

    invoke-direct {v0}, LYue/ۥ۟ۢۧۥ;-><init>()V

    return-object v0
.end method

.method public static final ۥ۟(LYue/ۥۣۢ۟ۡ;)LYue/ۥۣۣ۟۟;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦ۠ۢ;

    invoke-direct {v0, p0}, LYue/ۥۡۦ۠ۢ;-><init>(LYue/ۥۣۢ۟ۡ;)V

    return-object v0
.end method

.method public static final ۥ۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦۣ۠;

    invoke-direct {v0, p0}, LYue/ۥۡۦۣ۠;-><init>(LYue/ۥۣۢ۟ۦ;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟(Ljava/io/Closeable;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 3
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/io/Closeable;",
            "R:",
            "Ljava/lang/Object;",
            ">(TT;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;+TR;>;)TR;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {p1, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz p0, :cond_0

    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :cond_0
    :goto_0
    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    if-eqz p0, :cond_1

    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p0

    invoke-static {p1, p0}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    move-object v2, v1

    move-object v1, p1

    move-object p1, v2

    :goto_2
    if-nez v1, :cond_2

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    throw v1
.end method
