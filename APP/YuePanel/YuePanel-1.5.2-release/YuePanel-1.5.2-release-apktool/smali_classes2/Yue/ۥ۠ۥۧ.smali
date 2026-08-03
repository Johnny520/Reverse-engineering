.class public final LYue/ۥ۠ۥۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:I = 0x0

.field public static final ۥ۟:I = 0x1

.field public static final ۥ۟۟:I = 0x2

.field public static final ۥ۟۟۟:I = 0x3


# direct methods
.method public static final synthetic ۥ(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ;->ۥ۟۟۟(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠۠ۨ;
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
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۧ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LYue/ۥ۠ۥۧ$ۥ;-><init>(LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {p0, v0, p2}, LYue/ۥۣ۟ۤ۠;->ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    sget-object p0, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    invoke-static {p0, p1, p2}, LYue/ۥ۠ۥۧ;->ۥ۟(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠۠ۨ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)TT;"
        }
    .end annotation

    :try_start_0
    new-instance v0, LYue/ۥۢۡۢۥ;

    invoke-static {p0}, LYue/ۥ۠ۦ۟ۦ;->ۥ۟۟ۡ۠(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۠ۦ۟ۡ;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥۢۡۢۥ;-><init>(LYue/ۥ۠ۦ۟ۡ;)V

    invoke-virtual {v0}, LYue/ۥۢۡۢۥ;->ۥ۟۟۟ۢ()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, LYue/ۥۢۡۢۥ;->ۥ۟۟()V

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, LYue/ۥۢۡۢۥ;->ۥ۟۟()V

    throw p0
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_0
    new-instance p1, Ljava/util/concurrent/CancellationException;

    const-string v0, "Blocking call was interrupted due to parent cancellation"

    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    throw p0
.end method
