.class public final LYue/ۥ۟ۦۣۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCompletionState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n+ 2 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,67:1\n57#2,2:68\n57#2,2:70\n*S KotlinDebug\n*F\n+ 1 CompletionState.kt\nkotlinx/coroutines/CompletionStateKt\n*L\n21#1:68,2\n27#1:70,2\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
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
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p0, LYue/ۥ۟ۦۣۢ;

    if-eqz p1, :cond_0

    sget-object p1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    check-cast p0, LYue/ۥ۟ۦۣۢ;

    iget-object p0, p0, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    invoke-static {p0}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object p1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟(Ljava/lang/Object;LYue/ۥۣ۟ۨ۟;)Ljava/lang/Object;
    .locals 3
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, LYue/ۥ۟ۦۣۢ;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, LYue/ۥ۟ۦۣۢ;-><init>(Ljava/lang/Throwable;ZILYue/ۥ۟ۨۥۢ;)V

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 3
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_1

    new-instance v0, LYue/ۥ۟ۦۣۣ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۦۣۣ;-><init>(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    new-instance p0, LYue/ۥ۟ۦۣۢ;

    const/4 p1, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v2, p1, v1}, LYue/ۥ۟ۦۣۢ;-><init>(Ljava/lang/Throwable;ZILYue/ۥ۟ۨۥۢ;)V

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۟ۦۣۨ;->ۥ۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
