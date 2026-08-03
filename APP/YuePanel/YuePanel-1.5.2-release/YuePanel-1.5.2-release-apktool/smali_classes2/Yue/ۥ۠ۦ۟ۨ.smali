.class public final synthetic LYue/ۥ۠ۦ۟ۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,670:1\n13#2:671\n1290#3,2:672\n1290#3,2:674\n1290#3,2:676\n1290#3,2:678\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n479#1:671\n506#1:672,2\n520#1:674,2\n614#1:676,2\n638#1:678,2\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۟ۦۣ۟;
    .locals 1
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۦ۟ۤ;

    invoke-direct {v0, p0}, LYue/ۥ۠ۦ۟ۤ;-><init>(LYue/ۥ۠ۦ۟ۡ;)V

    return-object v0
.end method

.method public static final synthetic ۥ۟(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "Job"
    .end annotation

    invoke-static {p0}, LYue/ۥ۠ۦ۟ۦ;->ۥ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۟ۦۣ۟;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۦ۟ۡ;ILjava/lang/Object;)LYue/ۥ۟ۦۣ۟;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۦ۟ۦ;->ۥ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۟ۦۣ۟;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۠ۦ۟ۡ;ILjava/lang/Object;)LYue/ۥ۠ۦ۟ۡ;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟۟(LYue/ۥ۟ۧۦۥ;)V
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;)V
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    check-cast p0, LYue/ۥ۠ۦ۟ۡ;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥ۠ۦ۟ۡ;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-static {p1, p2}, LYue/ۥ۠ۡۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    instance-of v0, p0, LYue/ۥ۠ۦ۠۟;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥ۠ۦ۠۟;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {p1, p0}, LYue/ۥ۠ۦ۟ۨ;->ۥ۟۟ۡ۠(Ljava/lang/Throwable;LYue/ۥ۠ۦ۟ۡ;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۨ(Ljava/lang/Throwable;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic ۥۣ۟۟۟(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۤ(LYue/ۥ۠ۦ۟ۡ;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۟ۡ(LYue/ۥ۠ۦ۟ۡ;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;ILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۦ(LYue/ۥ۠ۦ۟ۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
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
            "(",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, LYue/ۥ۠ۦ۟ۡ$ۥ;->ۥ۟(LYue/ۥ۠ۦ۟ۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    invoke-interface {p0, p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۤۨ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

.method public static final synthetic ۥ۟۟۟ۧ(LYue/ۥ۟ۧۦۥ;)V
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۨ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    check-cast p0, LYue/ۥ۠ۦ۟ۡ;

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۠ۨ()LYue/ۥۡۨۢ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۦ۟ۡ;

    instance-of v2, v1, LYue/ۥ۠ۦ۠۟;

    if-eqz v2, :cond_2

    check-cast v1, LYue/ۥ۠ۦ۠۟;

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_1

    invoke-static {p1, p0}, LYue/ۥ۠ۦ۟ۨ;->ۥ۟۟ۡ۠(Ljava/lang/Throwable;LYue/ۥ۠ۦ۟ۡ;)Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v1, v2}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۨ(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static final ۥ۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;)V
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    check-cast p0, LYue/ۥ۠ۦ۟ۡ;

    if-eqz p0, :cond_0

    invoke-interface {p0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۠ۨ()LYue/ۥۡۨۢ;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦ۟ۡ;

    invoke-interface {v0, p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final synthetic ۥ۟۟۠۟(LYue/ۥ۠ۦ۟ۡ;)V
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    const/4 v0, 0x0

    invoke-static {p0, v0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۠ۡ(LYue/ۥ۠ۦ۟ۡ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final synthetic ۥ۟۟۠۠(LYue/ۥ۠ۦ۟ۡ;Ljava/lang/Throwable;)V
    .locals 3
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    invoke-interface {p0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۠ۨ()LYue/ۥۡۨۢ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۦ۟ۡ;

    instance-of v2, v1, LYue/ۥ۠ۦ۠۟;

    if-eqz v2, :cond_1

    check-cast v1, LYue/ۥ۠ۦ۠۟;

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_0

    invoke-static {p1, p0}, LYue/ۥ۠ۦ۟ۨ;->ۥ۟۟ۡ۠(Ljava/lang/Throwable;LYue/ۥ۠ۦ۟ۡ;)Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v1, v2}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۨ(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static final ۥ۟۟۠ۡ(LYue/ۥ۠ۦ۟ۡ;Ljava/util/concurrent/CancellationException;)V
    .locals 1
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/CancellationException;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-interface {p0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۠ۨ()LYue/ۥۡۨۢ;

    move-result-object p0

    invoke-interface {p0}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦ۟ۡ;

    invoke-interface {v0, p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic ۥ۟۟۠ۢ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۟ۨ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ۥۣ۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۠(LYue/ۥ۟ۧۦۥ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۠ۤ(LYue/ۥ۠ۦ۟ۡ;Ljava/lang/Throwable;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۠۠(LYue/ۥ۠ۦ۟ۡ;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۠ۥ(LYue/ۥ۠ۦ۟ۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟۠ۡ(LYue/ۥ۠ۦ۟ۡ;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final ۥ۟۟۠ۦ(LYue/ۥ۠ۦ۟ۡ;LYue/ۥۣۣ۠۟;)LYue/ۥۣۣ۠۟;
    .locals 1
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣۣ۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۣ۠۟ۥ;

    invoke-direct {v0, p1}, LYue/ۥۣ۠۟ۥ;-><init>(LYue/ۥۣۣ۠۟;)V

    invoke-interface {p0, v0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۡۡ(LYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۧ(LYue/ۥ۟ۧۦۥ;)V
    .locals 1
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    check-cast p0, LYue/ۥ۠ۦ۟ۡ;

    if-eqz p0, :cond_0

    invoke-static {p0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟ۡ۟(LYue/ۥ۠ۦ۟ۡ;)V

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۠ۨ(LYue/ۥ۠ۦ۟ۡ;)V
    .locals 1
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۢۥ()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final ۥ۟۟ۡ(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۠ۦ۟ۡ;
    .locals 3
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    check-cast v0, LYue/ۥ۠ۦ۟ۡ;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟ۡ۟(LYue/ۥ۟ۧۦۥ;)Z
    .locals 2
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    sget-object v0, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p0, v0}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    check-cast p0, LYue/ۥ۠ۦ۟ۡ;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟()Z

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    move v0, v1

    :cond_0
    return v0
.end method

.method public static final ۥ۟۟ۡ۠(Ljava/lang/Throwable;LYue/ۥ۠ۦ۟ۡ;)Ljava/lang/Throwable;
    .locals 2

    if-nez p0, :cond_0

    new-instance p0, LYue/ۥ۠ۦ۟ۢ;

    const-string v0, "Job was cancelled"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, LYue/ۥ۠ۦ۟ۢ;-><init>(Ljava/lang/String;Ljava/lang/Throwable;LYue/ۥ۠ۦ۟ۡ;)V

    :cond_0
    return-object p0
.end method
