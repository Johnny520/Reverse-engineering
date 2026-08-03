.class public final LYue/ۥۢ۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۟ۦۣ۟;
    .locals 1
    .param p0    # LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۠ۤۨ;

    invoke-direct {v0, p0}, LYue/ۥۢ۠ۤۨ;-><init>(LYue/ۥ۠ۦ۟ۡ;)V

    return-object v0
.end method

.method public static final synthetic ۥ۟(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.2.0, binary compatibility with versions <= 1.1.x"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "SupervisorJob"
    .end annotation

    invoke-static {p0}, LYue/ۥۢ۠ۥ;->ۥ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۟ۦۣ۟;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟(LYue/ۥ۠ۦ۟ۡ;ILjava/lang/Object;)LYue/ۥ۟ۦۣ۟;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LYue/ۥۢ۠ۥ;->ۥ(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۟ۦۣ۟;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۠ۦ۟ۡ;ILjava/lang/Object;)LYue/ۥ۠ۦ۟ۡ;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, LYue/ۥۢ۠ۥ;->ۥ۟(LYue/ۥ۠ۦ۟ۡ;)LYue/ۥ۠ۦ۟ۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۢ;
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
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢ۠ۤۧ;

    invoke-interface {p1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-direct {v0, v1, p1}, LYue/ۥۢ۠ۤۧ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0, v0, p0}, LYue/ۥۣۢ۠۠;->ۥ۟۟۟۠(LYue/ۥۡۧۥ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_0
    return-object p0
.end method
