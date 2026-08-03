.class public abstract LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;
.super LYue/ۥۡۧۢۥ$ۥ۟۟۟۠;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۧۢۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df\u06df\u06e0<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۡۧۢۥ$ۥ۟۟;LYue/ۥۡۧۢۥ$ۥ۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟۠;-><init>()V

    iput-object p2, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object p1, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۟()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥۡۧۢۥ$ۥ۟۟;)V
    .locals 1
    .param p1    # LYue/ۥۡۧۢۥ$ۥ۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iput-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    :cond_0
    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟(LYue/ۥۡۧۢۥ$ۥ۟۟;)LYue/ۥۡۧۢۥ$ۥ۟۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    :cond_1
    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-ne v0, p1, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۡ()LYue/ۥۡۧۢۥ$ۥ۟۟;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    :cond_2
    return-void
.end method

.method public abstract ۥ۟(LYue/ۥۡۧۢۥ$ۥ۟۟;)LYue/ۥۡۧۢۥ$ۥ۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;)",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public abstract ۥ۟۟(LYue/ۥۡۧۢۥ$ۥ۟۟;)LYue/ۥۡۧۢۥ$ۥ۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;)",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public ۥ۟۟۟()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    invoke-virtual {p0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۟ۡ()LYue/ۥۡۧۢۥ$ۥ۟۟;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    return-object v0
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥۡۧۢۥ$ۥ۟۟;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e1\u06e7\u06e2\u06e5$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:LYue/ۥۡۧۢۥ$ۥ۟۟;

    iget-object v1, p0, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥۡۧۢۥ$ۥ۟۟;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, LYue/ۥۡۧۢۥ$ۥ۟۟۟۟;->ۥ۟۟(LYue/ۥۡۧۢۥ$ۥ۟۟;)LYue/ۥۡۧۢۥ$ۥ۟۟;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
