.class public final LYue/ۥ۟ۤۡۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic ۥ(I)LYue/ۥ۟ۤ۠ۨ;
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.4.0, binary compatibility with earlier versions"
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p0, v0, v0, v1, v0}, LYue/ۥ۟ۤۡۨ;->ۥ۟۟۟(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥ۟ۤ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;)LYue/ۥ۟ۤ۠ۨ;
    .locals 2
    .param p1    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "LYue/\u06e5\u06df\u06e4\u06e0\u06e8<",
            "TE;>;"
        }
    .end annotation

    const/4 v0, -0x2

    const/4 v1, 0x1

    if-eq p0, v0, :cond_6

    const/4 v0, -0x1

    if-eq p0, v0, :cond_4

    if-eqz p0, :cond_2

    const v0, 0x7fffffff

    if-eq p0, v0, :cond_1

    if-ne p0, v1, :cond_0

    sget-object v0, LYue/ۥۣۣ۟;->ۥ۟۟۠ۤ:LYue/ۥۣۣ۟;

    if-ne p1, v0, :cond_0

    new-instance p0, LYue/ۥ۟ۦۧۢ;

    invoke-direct {p0, p2}, LYue/ۥ۟ۦۧۢ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۡۧ۟;

    invoke-direct {v0, p0, p1, p2}, LYue/ۥ۟ۡۧ۟;-><init>(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;)V

    move-object p0, v0

    goto :goto_0

    :cond_1
    new-instance p0, LYue/ۥ۠ۧۡۨ;

    invoke-direct {p0, p2}, LYue/ۥ۠ۧۡۨ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    goto :goto_0

    :cond_2
    sget-object p0, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    if-ne p1, p0, :cond_3

    new-instance p0, LYue/ۥۡۦۤ۠;

    invoke-direct {p0, p2}, LYue/ۥۡۦۤ۠;-><init>(LYue/ۥۣ۠ۡ۟;)V

    goto :goto_0

    :cond_3
    new-instance p0, LYue/ۥ۟ۡۧ۟;

    invoke-direct {p0, v1, p1, p2}, LYue/ۥ۟ۡۧ۟;-><init>(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;)V

    goto :goto_0

    :cond_4
    sget-object p0, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    if-ne p1, p0, :cond_5

    new-instance p0, LYue/ۥ۟ۦۧۢ;

    invoke-direct {p0, p2}, LYue/ۥ۟ۦۧۢ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "CONFLATED capacity cannot be used with non-default onBufferOverflow"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, LYue/ۥ۟ۡۧ۟;

    sget-object v0, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    if-ne p1, v0, :cond_7

    sget-object v0, LYue/ۥ۟ۤ۠ۨ;->ۥ۟:LYue/ۥ۟ۤ۠ۨ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥ۟ۤ۠ۨ$ۥ۟;->ۥ()I

    move-result v1

    :cond_7
    invoke-direct {p0, v1, p1, p2}, LYue/ۥ۟ۡۧ۟;-><init>(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;)V

    :goto_0
    return-object p0
.end method

.method public static synthetic ۥ۟۟(IILjava/lang/Object;)LYue/ۥ۟ۤ۠ۨ;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LYue/ۥ۟ۤۡۨ;->ۥ(I)LYue/ۥ۟ۤ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥ۟ۤ۠ۨ;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p0, 0x0

    :cond_0
    and-int/lit8 p4, p3, 0x2

    if-eqz p4, :cond_1

    sget-object p1, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    :cond_1
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_2

    const/4 p2, 0x0

    :cond_2
    invoke-static {p0, p1, p2}, LYue/ۥ۟ۤۡۨ;->ۥ۟(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;)LYue/ۥ۟ۤ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "+TT;>;)TT;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    if-eqz v0, :cond_0

    invoke-static {p0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    invoke-interface {p1, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
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
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ;

    if-eqz v0, :cond_0

    invoke-static {p0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public static final ۥ۟۟۟ۡ(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
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
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    if-eqz v0, :cond_0

    invoke-static {p0}, LYue/ۥ۟ۤۢ۟;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {p1, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
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
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p0, LYue/ۥ۟ۤۢ۟$ۥ۟۟;

    if-nez v0, :cond_0

    invoke-interface {p1, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object p0
.end method
