.class public final LYue/ۥ۠ۦ۟ۡ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۦ۟ۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static synthetic ۥ(LYue/ۥ۠ۦ۟ۡ;)V
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥ۠ۦ۟ۡ;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۦ۟ۡ;Ljava/lang/Throwable;ILjava/lang/Object;)Z
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟(Ljava/lang/Throwable;)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: cancel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟(LYue/ۥ۠ۦ۟ۡ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;
    .locals 0
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            "TR;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TR;-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥ۟ۧۦۥ$ۥ۟$ۥ;->ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(LYue/ۥ۠ۦ۟ۡ;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;
    .locals 0
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            ">(",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۥ$ۥ۟$ۥ;->ۥ۟(LYue/ۥ۟ۧۦۥ$ۥ۟;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟۠(LYue/ۥ۠ۦ۟ۡ;ZZLYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥۣۣ۠۟;
    .locals 0

    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    :cond_1
    invoke-interface {p0, p1, p2, p3}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۤۢ(ZZLYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: invokeOnCompletion"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟ۡ(LYue/ۥ۠ۦ۟ۡ;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;
    .locals 0
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۥ$ۥ۟$ۥ;->ۥ۟۟(LYue/ۥ۟ۧۦۥ$ۥ۟;LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۢ(LYue/ۥ۠ۦ۟ۡ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;
    .locals 0
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۥ$ۥ۟$ۥ;->ۥ۟۟۟(LYue/ۥ۟ۧۦۥ$ۥ۟;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟۟(LYue/ۥ۠ۦ۟ۡ;LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;
    .locals 0
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Operator \'+\' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`."
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    return-object p1
.end method
