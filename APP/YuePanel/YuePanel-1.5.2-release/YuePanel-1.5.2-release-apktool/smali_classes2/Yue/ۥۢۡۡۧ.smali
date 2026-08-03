.class public final LYue/ۥۢۡۡۧ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۡۤ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e2\u06e1\u06e1\u06e4<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/ThreadLocal;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۥ:LYue/ۥ۟ۧۦۥ$ۥ۟۟;
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
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V
    .locals 0
    .param p2    # Ljava/lang/ThreadLocal;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/ThreadLocal<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡۡۧ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput-object p2, p0, LYue/ۥۢۡۡۧ;->ۥ۟۟۠ۤ:Ljava/lang/ThreadLocal;

    new-instance p1, LYue/ۥۢۡۢ;

    invoke-direct {p1, p2}, LYue/ۥۢۡۢ;-><init>(Ljava/lang/ThreadLocal;)V

    iput-object p1, p0, LYue/ۥۢۡۡۧ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    return-void
.end method


# virtual methods
.method public fold(Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;
    .locals 0
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TR;-",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            "+TR;>;)TR;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, LYue/ۥۢۡۡۤ$ۥ;->ۥ(LYue/ۥۢۡۡۤ;Ljava/lang/Object;LYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ$ۥ۟;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df;",
            ">(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "TE;>;)TE;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۡۡۧ;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move-object p1, p0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡۡۧ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    return-object v0
.end method

.method public minusKey(LYue/ۥ۟ۧۦۥ$ۥ۟۟;)LYue/ۥ۟ۧۦۥ;
    .locals 1
    .param p1    # LYue/ۥ۟ۧۦۥ$ۥ۟۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۡۡۧ;->getKey()LYue/ۥ۟ۧۦۥ$ۥ۟۟;

    move-result-object v0

    invoke-static {v0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    return-object p1
.end method

.method public plus(LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۢۡۡۤ$ۥ;->ۥ۟۟۟(LYue/ۥۢۡۡۤ;LYue/ۥ۟ۧۦۥ;)LYue/ۥ۟ۧۦۥ;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ThreadLocal(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۡۡۧ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadLocal = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۡۡۧ;->ۥ۟۟۠ۤ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۦ(LYue/ۥ۟ۧۦۥ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            ")TT;"
        }
    .end annotation

    iget-object p1, p0, LYue/ۥۢۡۡۧ;->ۥ۟۟۠ۤ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۢۡۡۧ;->ۥ۟۟۠ۤ:Ljava/lang/ThreadLocal;

    iget-object v1, p0, LYue/ۥۢۡۡۧ;->ۥۣ۟۟۠:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object p1
.end method

.method public ۥ۟۟ۢۨ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Object;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "TT;)V"
        }
    .end annotation

    iget-object p1, p0, LYue/ۥۢۡۡۧ;->ۥ۟۟۠ۤ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
