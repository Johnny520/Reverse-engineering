.class public final LYue/ۥۣۡۢۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nOnUndeliveredElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n+ 2 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,44:1\n75#2:45\n*S KotlinDebug\n*F\n+ 1 OnUndeliveredElement.kt\nkotlinx/coroutines/internal/OnUndeliveredElementKt\n*L\n22#1:45\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۡ۟;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;TE;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣۡۢۥ$ۥ;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥۣۡۢۥ$ۥ;-><init>(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۦۥ;)V

    return-object v0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۦۥ;)V
    .locals 1
    .param p0    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;TE;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, LYue/ۥۣۡۢۥ;->ۥ۟۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥۣۢ۟ۨ;)LYue/ۥۣۢ۟ۨ;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p2, p0}, LYue/ۥ۟ۧۧ۠;->ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥۣۢ۟ۨ;)LYue/ۥۣۢ۟ۨ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣۢ۟ۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;TE;",
            "LYue/\u06e5\u06e2\u06e3\u06df\u06e8;",
            ")",
            "LYue/\u06e5\u06e2\u06e3\u06df\u06e8;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-static {p2, p0}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    return-object p2

    :cond_0
    new-instance p2, LYue/ۥۣۢ۟ۨ;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception in undelivered element handler for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, LYue/ۥۣۢ۟ۨ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥۣۢ۟ۨ;ILjava/lang/Object;)LYue/ۥۣۢ۟ۨ;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥۣۡۢۥ;->ۥ۟۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥۣۢ۟ۨ;)LYue/ۥۣۢ۟ۨ;

    move-result-object p0

    return-object p0
.end method
