.class public final LYue/ۥۣۢ۠;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:LYue/ۥۣ۠ۢۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۦۥ;)V
    .locals 1
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥۣۢ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    invoke-static {p2}, LYue/ۥۢۡۡۦ;->ۥ۟(LYue/ۥ۟ۧۦۥ;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, p0, LYue/ۥۣۢ۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    new-instance p2, LYue/ۥۣۢ۠$ۥ;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, LYue/ۥۣۢ۠$ۥ;-><init>(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)V

    iput-object p2, p0, LYue/ۥۣۢ۠;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۢۢ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 3
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۢ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    iget-object v1, p0, LYue/ۥۣۢ۠;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iget-object v2, p0, LYue/ۥۣۢ۠;->ۥ۟۟۠ۥ:LYue/ۥۣ۠ۢۢ;

    invoke-static {v0, p1, v1, v2, p2}, LYue/ۥ۟ۤۡۢ;->ۥ۟۟(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method
