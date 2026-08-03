.class public final LYue/ۥ۟ۧۧ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,110:1\n75#2:111\n*S KotlinDebug\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n39#1:111\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۢۢ;)LYue/ۥ۟ۧۧ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "LYue/\u06e5\u06df\u06e7\u06e7;"
        }
    .end annotation

    sget-object v0, LYue/ۥ۟ۧۧ;->ۥ۟۟۟ۤ:LYue/ۥ۟ۧۧ$ۥ۟;

    new-instance v1, LYue/ۥ۟ۧۧ۠$ۥ;

    invoke-direct {v1, p0, v0}, LYue/ۥ۟ۧۧ۠$ۥ;-><init>(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۧ$ۥ۟;)V

    return-object v1
.end method

.method public static final ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    :try_start_0
    sget-object v0, LYue/ۥ۟ۧۧ;->ۥ۟۟۟ۤ:LYue/ۥ۟ۧۧ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۧۧ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, LYue/ۥ۟ۧۧ;->ۥ۟۟ۢ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۟ۧۧ۟;->ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    return-void

    :goto_0
    invoke-static {p1, v0}, LYue/ۥ۟ۧۧ۠;->ۥ۟۟(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۟ۧۧ۟;->ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final ۥ۟۟(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2
    .param p0    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Exception while trying to handle coroutine exception"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v0, p0}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-object v0
.end method
