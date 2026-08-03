.class public abstract LYue/ۥ۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۦۥ$ۥ۟۟;


# annotations
.annotation build LYue/ۥ۠ۡۥ۟;
.end annotation

.annotation build LYue/ۥۢ۟ۡۡ;
    version = "1.3"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B::",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
        "E::TB;>",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "TE;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟۟;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۦۥ$ۥ۟۟;LYue/ۥۣ۠ۡ۟;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "TB;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "+TE;>;)V"
        }
    .end annotation

    const-string v0, "baseKey"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "safeCast"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LYue/ۥ۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    instance-of p2, p1, LYue/ۥ۟۟ۡ;

    if-eqz p2, :cond_0

    check-cast p1, LYue/ۥ۟۟ۡ;

    iget-object p1, p1, LYue/ۥ۟۟ۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    :cond_0
    iput-object p1, p0, LYue/ۥ۟۟ۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)Z
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p1, p0, :cond_1

    iget-object v0, p0, LYue/ۥ۟۟ۡ;->ۥ۟۟۠ۤ:LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final ۥ۟(LYue/ۥ۟ۧۦۥ$ۥ۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            ")TE;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥ۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    invoke-interface {v0, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۟ۧۦۥ$ۥ۟;

    return-object p1
.end method
