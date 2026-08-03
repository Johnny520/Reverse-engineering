.class public LYue/ۥۡۧۥ;
.super LYue/ۥ۟۟۠ۧ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۧۨ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e7<",
        "TT;>;",
        "LYue/\u06e5\u06df\u06e7\u06e7\u06e8;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۤۢ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, LYue/ۥ۟۟۠ۧ;-><init>(LYue/ۥ۟ۧۦۥ;ZZ)V

    iput-object p2, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    return-void
.end method


# virtual methods
.method public final getCallerFrame()LYue/ۥ۟ۧۧۨ;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    instance-of v1, v0, LYue/ۥ۟ۧۧۨ;

    if-eqz v1, :cond_0

    check-cast v0, LYue/ۥ۟ۧۧۨ;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥۣ۟۟ۢ(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-static {v0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-static {p1, v1}, LYue/ۥ۟ۦۣۨ;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, LYue/ۥ۠۟ۢ۠;->ۥ۟۟۟ۡ(LYue/ۥ۟ۧۤۢ;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟۟ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۠۟ۧ(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡۧۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۤۢ;

    invoke-static {p1, v0}, LYue/ۥ۟ۦۣۨ;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟۠۠ۡ()LYue/ۥ۠ۦ۟ۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۢ()LYue/ۥ۟ۤۥۨ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LYue/ۥ۟ۤۥۨ;->getParent()LYue/ۥ۠ۦ۟ۡ;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
