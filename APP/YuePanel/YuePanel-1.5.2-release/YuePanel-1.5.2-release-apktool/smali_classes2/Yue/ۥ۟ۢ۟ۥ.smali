.class public abstract LYue/ۥ۟ۢ۟ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public ۥ:LYue/ۥ۟ۢ۠;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ۥ(LYue/ۥ۟ۢ۠;Ljava/lang/Object;)V
    .param p1    # LYue/ۥ۟ۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation
.end method

.method public final ۥ۟()LYue/ۥ۟ۢ۠;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۥ;->ۥ:LYue/ۥ۟ۢ۠;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "atomicOp"

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟ۢۦ(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ۥ۟۟(LYue/ۥ۟ۢ۠;)Ljava/lang/Object;
    .param p1    # LYue/ۥ۟ۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public final ۥ۟۟۟(LYue/ۥ۟ۢ۠;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۢ۟ۥ;->ۥ:LYue/ۥ۟ۢ۠;

    return-void
.end method
