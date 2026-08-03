.class public final LYue/ۥ۟ۧۦۧ$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۧۦۧ;->ۥ(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ;Z)LYue/ۥ۟ۧۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e2<",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۤ:Z


# direct methods
.method public constructor <init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e2<",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۧۦۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iput-boolean p2, p0, LYue/ۥ۟ۧۦۧ$ۥ۟;->ۥ۟۟۠ۤ:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۟ۧۦۥ;

    check-cast p2, LYue/ۥ۟ۧۦۥ$ۥ۟;

    invoke-virtual {p0, p1, p2}, LYue/ۥ۟ۧۦۧ$ۥ۟;->ۥ۟۟(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ$ۥ۟;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۦۥ$ۥ۟;)LYue/ۥ۟ۧۦۥ;
    .locals 4
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    instance-of v0, p2, LYue/ۥ۟ۧۦۣ;

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۧۦۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v0, v0, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v0, LYue/ۥ۟ۧۦۥ;

    invoke-interface {p2}, LYue/ۥ۟ۧۦۥ$ۥ۟;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۦۥ;->get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, LYue/ۥ۟ۧۦۧ$ۥ۟;->ۥ۟۟۠ۤ:Z

    check-cast p2, LYue/ۥ۟ۧۦۣ;

    if-eqz v0, :cond_1

    invoke-interface {p2}, LYue/ۥ۟ۧۦۣ;->ۥ۟۟ۤۤ()LYue/ۥ۟ۧۦۣ;

    move-result-object p2

    :cond_1
    invoke-interface {p1, p2}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v1, p0, LYue/ۥ۟ۧۦۧ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v2, v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v2, LYue/ۥ۟ۧۦۥ;

    invoke-interface {p2}, LYue/ۥ۟ۧۦۥ$ۥ۟;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v3

    invoke-interface {v2, v3}, LYue/ۥ۟ۧۦۥ;->minusKey(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;

    move-result-object v2

    iput-object v2, v1, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p2, LYue/ۥ۟ۧۦۣ;

    invoke-interface {p2, v0}, LYue/ۥ۟ۧۦۣ;->ۥ۟۟ۢۧ(LYue/ۥ۟ۧۦۥ$ۥ۟;)LYue/ۥ۟ۧۦۥ;

    move-result-object p2

    invoke-interface {p1, p2}, LYue/ۥ۟ۧۦۥ;->plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1
.end method
