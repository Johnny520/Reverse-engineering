.class public final LYue/ۥ۟ۢۢۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "AutoCloseableKt"
.end annotation


# direct methods
.method public static final ۥ(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V
    .locals 0
    .param p0    # Ljava/lang/AutoCloseable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۥۤ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final ۥ۟(Ljava/lang/AutoCloseable;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.2"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/AutoCloseable;",
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

    :try_start_0
    invoke-interface {p1, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    const/4 v1, 0x0

    invoke-static {p0, v1}, LYue/ۥ۟ۢۢۢ;->ۥ(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {p0, p1}, LYue/ۥ۟ۢۢۢ;->ۥ(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-static {v0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw v1
.end method
