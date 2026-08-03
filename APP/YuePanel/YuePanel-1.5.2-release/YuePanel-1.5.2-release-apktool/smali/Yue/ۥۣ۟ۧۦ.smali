.class public final LYue/ۥۣ۟ۧۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e1\u06e3\u06e1\u06e7;",
            ">;"
        }
    .end annotation
.end field

.field public volatile ۥ۟:Landroid/content/Context;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۟ۧۦ;->ۥ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final ۥ(LYue/ۥۣۡۡۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۡۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۟ۧۦ;->ۥ۟:Landroid/content/Context;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, LYue/ۥۣۡۡۧ;->ۥ(Landroid/content/Context;)V

    :cond_0
    iget-object v0, p0, LYue/ۥۣ۟ۧۦ;->ۥ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۥ۟()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۣ۟ۧۦ;->ۥ۟:Landroid/content/Context;

    return-void
.end method

.method public final ۥ۟۟(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۣ۟ۧۦ;->ۥ۟:Landroid/content/Context;

    iget-object v0, p0, LYue/ۥۣ۟ۧۦ;->ۥ:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣۡۡۧ;

    invoke-interface {v1, p1}, LYue/ۥۣۡۡۧ;->ۥ(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۟()Landroid/content/Context;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۟ۧۦ;->ۥ۟:Landroid/content/Context;

    return-object v0
.end method

.method public final ۥ۟۟۟۟(LYue/ۥۣۡۡۧ;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۡۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۟ۧۦ;->ۥ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method
