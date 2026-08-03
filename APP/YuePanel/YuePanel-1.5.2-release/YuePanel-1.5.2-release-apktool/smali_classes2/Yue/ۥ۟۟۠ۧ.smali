.class public abstract LYue/ۥ۟۟۠ۧ;
.super LYue/ۥ۠ۦ۠۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۠ۦ۟ۡ;
.implements LYue/ۥ۟ۧۤۢ;
.implements LYue/ۥ۟ۧۧۥ;


# annotations
.annotation build LYue/ۥ۠ۥۦۧ;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e6\u06e0\u06df;",
        "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "TT;>;",
        "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;ZZ)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-direct {p0, p3}, LYue/ۥ۠ۦ۠۟;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟۟ۥ:LYue/ۥ۠ۦ۟ۡ$ۥ۟;

    invoke-interface {p1, p2}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object p2

    check-cast p2, LYue/ۥ۠ۦ۟ۡ;

    invoke-virtual {p0, p2}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۦ(LYue/ۥ۠ۦ۟ۡ;)V

    :cond_0
    invoke-interface {p1, p0}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    return-void
.end method

.method public static synthetic ۥ۟۠۟ۨ()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getContext()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    return-object v0
.end method

.method public getCoroutineContext()LYue/ۥ۟ۧۦۥ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۧۤ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LYue/ۥ۠ۦ۠۠;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۟۟۠ۧ;->ۥ۟۠۟ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟۟()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۤ۠()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " was cancelled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۦۥ(Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥ۟۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    invoke-static {v0, p1}, LYue/ۥ۟ۧۧ۠;->ۥ۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Throwable;)V

    return-void
.end method

.method public ۥ۟۟ۧۦ()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۧ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ;

    invoke-static {v0}, LYue/ۥ۟ۧۦۧ;->ۥ۟(LYue/ۥ۟ۧۦۥ;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۧۦ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۧۦ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ۟۟ۨۡ(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, LYue/ۥ۟ۦۣۢ;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۟ۦۣۢ;

    iget-object v0, p1, LYue/ۥ۟ۦۣۢ;->ۥ:Ljava/lang/Throwable;

    invoke-virtual {p1}, LYue/ۥ۟ۦۣۢ;->ۥ()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, LYue/ۥ۟۟۠ۧ;->ۥ۟۠۠(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۟۟۠ۧ;->ۥ۟۠۠۟(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public ۥ۟۠۟ۧ(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟ۢ(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۠۠(Ljava/lang/Throwable;Z)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    return-void
.end method

.method public ۥ۟۠۠۟(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public final ۥ۟۠۠۠(LYue/ۥ۟ۧۨ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۨ;
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
            "LYue/\u06e5\u06df\u06e7\u06e8;",
            "TR;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TR;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p3, p2, p0}, LYue/ۥ۟ۧۨ;->ۥ۟۟۟۟(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)V

    return-void
.end method
