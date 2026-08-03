.class public final LYue/ۥۣۡۧۨ;
.super LYue/ۥ۠ۦ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e6\u06e0;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۧ:LYue/ۥۡۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e8<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۨ:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۨ;LYue/ۥۣ۠ۢۢ;)V
    .locals 0
    .param p1    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8<",
            "-TR;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TT;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥ۠ۦ۠;-><init>()V

    iput-object p1, p0, LYue/ۥۣۡۧۨ;->ۥ۟۟۠ۧ:LYue/ۥۡۨ;

    iput-object p2, p0, LYue/ۥۣۡۧۨ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۢۢ;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, LYue/ۥۣۡۧۨ;->ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟ۦۤ(Ljava/lang/Throwable;)V
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iget-object p1, p0, LYue/ۥۣۡۧۨ;->ۥ۟۟۠ۧ:LYue/ۥۡۨ;

    invoke-interface {p1}, LYue/ۥۡۨ;->ۥ۟۟۠ۧ()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۣۡۧۨ;->ۥ۟۟۠ۧ:LYue/ۥۡۨ;

    iget-object v1, p0, LYue/ۥۣۡۧۨ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۢۢ;

    invoke-virtual {p1, v0, v1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۨۧ(LYue/ۥۡۨ;LYue/ۥۣ۠ۢۢ;)V

    :cond_0
    return-void
.end method
