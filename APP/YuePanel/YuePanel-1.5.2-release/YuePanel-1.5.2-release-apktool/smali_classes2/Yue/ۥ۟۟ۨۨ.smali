.class public LYue/ۥ۟۟ۨۨ;
.super LYue/ۥ۟ۤۡ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟۠۟;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e4\u06e1\u06df<",
        "TE;>;",
        "LYue/\u06e5\u06df\u06e0\u06df<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;Z)V
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
            "TE;>;Z)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0, p3}, LYue/ۥ۟ۤۡ۟;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۤ۠ۨ;ZZ)V

    sget-object p2, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p1, p2}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۦ۟ۡ;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۦ(LYue/ۥ۠ۦ۟ۡ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)Z
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۟۟۠ۧ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥ۟ۧۧ۠;->ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟۟ۨ۠(Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۟;->ۥ۟۠۠ۡ()LYue/ۥ۟ۤ۠ۨ;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    instance-of v2, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/util/concurrent/CancellationException;

    :cond_0
    if-nez v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " was cancelled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, LYue/ۥ۠ۡۢۧ;->ۥ(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    move-object v1, p1

    :cond_1
    invoke-interface {v0, v1}, LYue/ۥۡۦۡۡ;->ۥ۟۟۟۟(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method
