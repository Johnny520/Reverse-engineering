.class public final LYue/ۥ۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۡ۠;
    .locals 1
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۟ۧۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۢۨ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e7\u06e8;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e0\u06df<",
            "TE;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "TE;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۧۦۧ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p0

    const/4 p1, 0x0

    const/4 v0, 0x6

    invoke-static {p2, p1, p1, v0, p1}, LYue/ۥ۟ۤۡۨ;->ۥ۟۟۟(ILYue/ۥۣۣ۟;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)LYue/ۥ۟ۤ۠ۨ;

    move-result-object p1

    invoke-virtual {p3}, LYue/ۥ۟ۧۨ;->ۥ۟۟۟۠()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LYue/ۥ۠ۧ;

    invoke-direct {p2, p0, p1, p5}, LYue/ۥ۠ۧ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;LYue/ۥۣ۠ۢۢ;)V

    goto :goto_0

    :cond_0
    new-instance p2, LYue/ۥ۟۟ۨۨ;

    const/4 v0, 0x1

    invoke-direct {p2, p0, p1, v0}, LYue/ۥ۟۟ۨۨ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;Z)V

    :goto_0
    if-eqz p4, :cond_1

    invoke-virtual {p2, p4}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۡۡ(LYue/ۥۣ۠ۡ۟;)LYue/ۥۣۣ۠۟;

    :cond_1
    invoke-virtual {p2, p3, p2, p5}, LYue/ۥ۟۟۠ۧ;->ۥ۟۠۠۠(LYue/ۥ۟ۧۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V

    return-object p2
.end method

.method public static synthetic ۥ۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۨۡ۠;
    .locals 6

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    sget-object p1, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    move-object v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/4 p2, 0x0

    :cond_1
    move v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    sget-object p3, LYue/ۥ۟ۧۨ;->ۥۣ۟۟۠:LYue/ۥ۟ۧۨ;

    :cond_2
    move-object v3, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    const/4 p4, 0x0

    :cond_3
    move-object v4, p4

    move-object v0, p0

    move-object v5, p5

    invoke-static/range {v0 .. v5}, LYue/ۥ۟۠;->ۥ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۢ;)LYue/ۥۡۨۡ۠;

    move-result-object p0

    return-object p0
.end method
