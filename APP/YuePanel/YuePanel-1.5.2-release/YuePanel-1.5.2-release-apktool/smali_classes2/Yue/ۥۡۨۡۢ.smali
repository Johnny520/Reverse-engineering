.class public final LYue/ۥۡۨۡۢ;
.super LYue/ۥۡۨۡۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e8\u06e1\u06e1<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;LYue/ۥۣ۟ۨ۟;LYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .param p2    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, LYue/ۥۡۨۡۡ;-><init>(Ljava/lang/Object;LYue/ۥۣ۟ۨ۟;)V

    iput-object p3, p0, LYue/ۥۡۨۡۢ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۥۨ()Z
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۨ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۨۡۢ;->ۥ۟۟ۦۨ()V

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟ۦۨ()V
    .locals 3

    iget-object v0, p0, LYue/ۥۡۨۡۢ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠ۡ۟;

    invoke-virtual {p0}, LYue/ۥۡۨۡۡ;->ۥ۟۟ۦۥ()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LYue/ۥۡۨۡۡ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    invoke-interface {v2}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v2

    invoke-static {v0, v1, v2}, LYue/ۥۣۡۢۥ;->ۥ۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۦۥ;)V

    return-void
.end method
