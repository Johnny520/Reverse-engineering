.class public final LYue/ۥ۟ۤۡۥ;
.super LYue/ۥ۟ۤۡۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e4\u06e1\u06e4<",
        "TT;TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥ۟ۤۡۤ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥ۟ۤۡۥ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥ۟ۤۡ۠;
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")",
            "LYue/\u06e5\u06df\u06e4\u06e1\u06e0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۤۡۥ;

    iget-object v1, p0, LYue/ۥ۟ۤۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۡ;

    invoke-direct {v0, v1, p1, p2, p3}, LYue/ۥ۟ۤۡۥ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-object v0
.end method

.method public ۥۣ۟۟۟()LYue/ۥۣ۠ۢۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۡ;

    return-object v0
.end method

.method public ۥ۟۟۠ۢ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥۣۣ۠ۢ;
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
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡۤ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۢۡ;

    invoke-interface {v0, p1, p2}, LYue/ۥۣ۠ۢۡ;->ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method
