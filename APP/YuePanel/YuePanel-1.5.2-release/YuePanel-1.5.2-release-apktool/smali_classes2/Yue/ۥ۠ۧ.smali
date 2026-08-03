.class public final LYue/ۥ۠ۧ;
.super LYue/ۥ۟۟ۨۨ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۧۨۨ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e8\u06e8<",
        "TE;>;",
        "LYue/\u06e5\u06e1\u06e7\u06e8\u06e8<",
        "TE;",
        "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
        "-TE;>;>;"
    }
.end annotation


# instance fields
.field public ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;LYue/ۥۣ۠ۢۢ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۤ۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06df\u06e4\u06e0\u06e8<",
            "TE;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06df\u06e0\u06df<",
            "TE;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LYue/ۥ۟۟ۨۨ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;Z)V

    invoke-static {p3, p0, p0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۧ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    return-void
.end method


# virtual methods
.method public offer(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->start()Z

    invoke-super {p0, p1}, LYue/ۥ۟ۤۡ۟;->offer(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->start()Z

    invoke-super {p0, p1, p2}, LYue/ۥ۟ۤۡ۟;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟۠ۥ(LYue/ۥۡۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V
    .locals 1
    .param p1    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8<",
            "-TR;>;TE;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "-TE;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->start()Z

    invoke-super {p0}, LYue/ۥ۟ۤۡ۟;->ۥ۟۟ۡ۠()LYue/ۥۡۧۨۨ;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, LYue/ۥۡۧۨۨ;->ۥ۟۟۠ۥ(LYue/ۥۡۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V

    return-void
.end method

.method public ۥ۟۟ۡ۠()LYue/ۥۡۧۨۨ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e8<",
            "TE;",
            "LYue/\u06e5\u06e1\u06e8\u06e1\u06e0<",
            "TE;>;>;"
        }
    .end annotation

    return-object p0
.end method

.method public ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-super {p0, p1}, LYue/ۥ۟ۤۡ۟;->ۥ۟۟ۡۤ(Ljava/lang/Throwable;)Z

    move-result p1

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->start()Z

    return p1
.end method

.method public ۥ۟۟ۡۨ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->start()Z

    invoke-super {p0, p1}, LYue/ۥ۟ۤۡ۟;->ۥ۟۟ۡۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۨۢ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧ;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-static {v0, p0}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;LYue/ۥ۟ۧۤۢ;)V

    return-void
.end method
