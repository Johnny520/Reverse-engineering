.class public abstract LYue/ۥ۠۟ۢۢ;
.super LYue/ۥۢ۠ۨۧ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e2\u06e0\u06e8\u06e7;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,221:1\n1#2:222\n107#3,10:223\n118#3,2:237\n117#3:239\n219#4:233\n220#4:236\n57#5,2:234\n75#6:240\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n88#1:223,10\n88#1:237,2\n88#1:239\n101#1:233\n101#1:236\n101#1:234,2\n140#1:240\n*E\n"
.end annotation


# instance fields
.field public ۥ۟۟۠ۥ:I
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢ۠ۨۧ;-><init>()V

    iput p1, p0, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۠ۥ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, LYue/ۥۢ۠ۨۧ;->ۥ۟۟۠ۤ:LYue/ۥۢ۠ۨۨ;

    :try_start_0
    invoke-virtual {p0}, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۟۟()LYue/ۥ۟ۧۤۢ;

    move-result-object v1

    check-cast v1, LYue/ۥ۠۟ۢ۟;

    iget-object v2, v1, LYue/ۥ۠۟ۢ۟;->ۥ۟۟۠ۧ:LYue/ۥ۟ۧۤۢ;

    iget-object v1, v1, LYue/ۥ۠۟ۢ۟;->ۥ۟۟ۡ:Ljava/lang/Object;

    invoke-interface {v2}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v3

    invoke-static {v3, v1}, LYue/ۥۢۡۡۦ;->ۥ۟۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sget-object v4, LYue/ۥۢۡۡۦ;->ۥ:LYue/ۥۢ۠ۦۢ;

    const/4 v5, 0x0

    if-eq v1, v4, :cond_0

    invoke-static {v2, v3, v1}, LYue/ۥ۟ۧۦۧ;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)LYue/ۥۣۢ۠۟;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :cond_0
    move-object v4, v5

    :goto_0
    :try_start_1
    invoke-interface {v2}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v6

    invoke-virtual {p0}, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p0, v7}, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_1

    iget v9, p0, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۠ۥ:I

    invoke-static {v9}, LYue/ۥۣ۠۟ۢ;->ۥ۟۟(I)Z

    move-result v9

    if-eqz v9, :cond_1

    sget-object v9, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {v6, v9}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v6

    check-cast v6, LYue/ۥ۠ۦ۟ۡ;

    goto :goto_1

    :catchall_1
    move-exception v2

    goto :goto_4

    :cond_1
    move-object v6, v5

    :goto_1
    if-eqz v6, :cond_2

    invoke-interface {v6}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟()Z

    move-result v9

    if-nez v9, :cond_2

    invoke-interface {v6}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۢۥ()Ljava/util/concurrent/CancellationException;

    move-result-object v6

    invoke-virtual {p0, v7, v6}, LYue/ۥ۠۟ۢۢ;->ۥ۟(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object v7, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v6}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v6}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    if-eqz v8, :cond_3

    sget-object v6, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v8}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v6}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    sget-object v6, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-virtual {p0, v7}, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v2, v6}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    :goto_2
    sget-object v2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_4

    :try_start_2
    invoke-virtual {v4}, LYue/ۥۣۢ۠۟;->ۥ۟۠۠ۢ()Z

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    invoke-static {v3, v1}, LYue/ۥۢۡۡۦ;->ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_5
    :try_start_3
    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-interface {v0}, LYue/ۥۢ۠ۨۨ;->ۥ۟۟ۡۧ()V

    invoke-static {v2}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v5, v0}, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۟ۤ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_4
    if-eqz v4, :cond_6

    :try_start_4
    invoke-virtual {v4}, LYue/ۥۣۢ۠۟;->ۥ۟۠۠ۢ()Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_6
    invoke-static {v3, v1}, LYue/ۥۢۡۡۦ;->ۥ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V

    :cond_7
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_5
    :try_start_5
    sget-object v2, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-interface {v0}, LYue/ۥۢ۠ۨۨ;->ۥ۟۟ۡۧ()V

    sget-object v0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_6

    :catchall_3
    move-exception v0

    sget-object v2, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-static {v0}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_6
    invoke-static {v0}, LYue/ۥۡۦۧۤ;->ۥ۟۟۟۟(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۟ۤ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_7
    return-void
.end method

.method public ۥ۟(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    return-void
.end method

.method public abstract ۥ۟۟۟۟()LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TT;>;"
        }
    .end annotation
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۦۣۢ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۟ۦۣۢ;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    :cond_1
    return-object v1
.end method

.method public ۥ۟۟۟ۡ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    return-object p1
.end method

.method public final ۥ۟۟۟ۤ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, LYue/ۥۣ۠ۡ;->ۥ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    if-nez p1, :cond_2

    move-object p1, p2

    :cond_2
    new-instance p2, LYue/ۥ۟ۧۨ۟;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fatal exception in coroutines machinery for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-direct {p2, v0, p1}, LYue/ۥ۟ۧۨ۟;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, LYue/ۥ۠۟ۢۢ;->ۥ۟۟۟۟()LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    invoke-static {p1, p2}, LYue/ۥ۟ۧۧ۠;->ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    return-void
.end method

.method public abstract ۥ۟۟۟ۦ()Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end method
