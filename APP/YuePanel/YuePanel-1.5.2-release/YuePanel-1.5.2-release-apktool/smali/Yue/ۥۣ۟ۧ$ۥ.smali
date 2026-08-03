.class public final LYue/ۥۣ۟ۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public ۥ:Ljava/lang/Object;

.field public ۥ۟:LYue/ۥۣ۟ۧ$ۥ۟۟۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e3\u06e7$\u06e5\u06df\u06df\u06df<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟:LYue/ۥۡۦۦ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e1\u06e6\u06e6\u06df<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۟:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠ۤ()LYue/ۥۡۦۦ۟;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟:LYue/ۥۡۦۦ۟;

    return-void
.end method


# virtual methods
.method public finalize()V
    .locals 4

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->isDone()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, LYue/ۥۣ۟ۧ$ۥ۟;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The completer object was garbage collected - this future would otherwise never complete. The tag was: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, LYue/ۥۣ۟ۧ$ۥ۟;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟(Ljava/lang/Throwable;)Z

    :cond_0
    iget-boolean v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟۟:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟:LYue/ۥۡۦۦ۟;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public ۥ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p1    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟:LYue/ۥۡۦۦ۟;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    :cond_0
    return-void
.end method

.method public ۥ۟()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ:Ljava/lang/Object;

    iput-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    iget-object v1, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟:LYue/ۥۡۦۦ۟;

    invoke-virtual {v1, v0}, LYue/ۥۡۦۦ۟;->ۥ۟۟۠۟(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۥ۟۟(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟۟:Z

    iget-object v1, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟۟۟()V

    :cond_1
    return v0
.end method

.method public ۥ۟۟۟()Z
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟۟:Z

    iget-object v1, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟۟۟()V

    :cond_1
    return v0
.end method

.method public final ۥ۟۟۟۟()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ:Ljava/lang/Object;

    iput-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    iput-object v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟:LYue/ۥۡۦۦ۟;

    return-void
.end method

.method public ۥ۟۟۟۠(Ljava/lang/Throwable;)Z
    .locals 2
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x1

    iput-boolean v0, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟۟:Z

    iget-object v1, p0, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟:LYue/ۥۣ۟ۧ$ۥ۟۟۟;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, LYue/ۥۣ۟ۧ$ۥ۟۟۟;->ۥ۟۟(Ljava/lang/Throwable;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, LYue/ۥۣ۟ۧ$ۥ;->ۥ۟۟۟۟()V

    :cond_1
    return v0
.end method
