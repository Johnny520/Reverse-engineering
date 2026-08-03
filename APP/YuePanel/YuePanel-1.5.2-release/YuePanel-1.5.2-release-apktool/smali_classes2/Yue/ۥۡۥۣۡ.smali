.class public final LYue/ۥۡۥۣۡ;
.super LYue/ۥ۟ۤۡ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۥۡۤ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e4\u06e1\u06df<",
        "TE;>;",
        "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۤ۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06df\u06e4\u06e0\u06e8<",
            "TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0, v0}, LYue/ۥ۟ۤۡ۟;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;ZZ)V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ()LYue/ۥۡۨۡ۠;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۟;->ۥ()LYue/ۥ۟ۤ۠ۨ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    invoke-super {p0}, LYue/ۥ۟۟۠ۧ;->ۥ۟۟۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۠۠(Ljava/lang/Throwable;Z)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۟;->ۥ۟۠۠ۡ()LYue/ۥ۟ۤ۠ۨ;

    move-result-object v0

    invoke-interface {v0, p1}, LYue/ۥۡۨۡ۠;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟۟۠ۧ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object p2

    invoke-static {p2, p1}, LYue/ۥ۟ۧۧ۠;->ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic ۥ۟۠۠۟(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p0, p1}, LYue/ۥۡۥۣۡ;->ۥ۟۠۠ۢ(LYue/ۥۣۢ۠ۤ;)V

    return-void
.end method

.method public ۥ۟۠۠ۢ(LYue/ۥۣۢ۠ۤ;)V
    .locals 2
    .param p1    # LYue/ۥۣۢ۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۟;->ۥ۟۠۠ۡ()LYue/ۥ۟ۤ۠ۨ;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LYue/ۥۡۨۡ۠$ۥ;->ۥ(LYue/ۥۡۨۡ۠;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    return-void
.end method
