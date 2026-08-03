.class public final LYue/ۥ۠ۧ۟;
.super LYue/ۥۣۣ۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e3\u06e2\u06e3<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۟ۢۡ;LYue/ۥۣ۠ۢۢ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۢۡ;
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
            "LYue/\u06e5\u06df\u06e3\u06e2\u06e1<",
            "TE;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TE;>;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LYue/ۥۣۣ۟ۢ;-><init>(LYue/ۥ۟ۧۦۥ;LYue/ۥۣ۟ۢۡ;Z)V

    invoke-static {p3, p0, p0}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟(LYue/ۥۣ۠ۢۢ;Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۧ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۡۥ()LYue/ۥۡۦۡۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TE;>;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣۣ۟ۢ;->ۥ۟۠۠ۡ()LYue/ۥۣ۟ۢۡ;

    move-result-object v0

    invoke-interface {v0}, LYue/ۥۣ۟ۢۡ;->ۥ۟۟ۡۥ()LYue/ۥۡۦۡۡ;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠۟;->start()Z

    return-object v0
.end method

.method public ۥ۟۟ۨۢ()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧ۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۧۤۢ;

    invoke-static {v0, p0}, LYue/ۥۣ۟ۨۥ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;LYue/ۥ۟ۧۤۢ;)V

    return-void
.end method
