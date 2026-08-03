.class public final LYue/ۥۡۨۢۦ$ۥ۟۟۟ۧ$ۥ;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۡ۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۢۦ$ۥ۟۟۟ۧ;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
        "TT;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۦۢۥ$ۥ;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e6\u06e2\u06e5$\u06e5;",
            "TT;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ;

    iput-object p2, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۧ$ۥ;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ;

    iget-boolean v0, v0, LYue/ۥۡۦۢۥ$ۥ;->ۥۣ۟۟۠:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۧ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥۡۨۢۦ$ۥ۟۟۟ۧ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ;

    iput-boolean v1, p1, LYue/ۥۡۦۢۥ$ۥ;->ۥۣ۟۟۠:Z

    const/4 v1, 0x0

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
