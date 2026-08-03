.class public final LYue/ۥۡۧ۠ۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e1\u06e7\u06e0\u06e3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LYue/ۥۡۧ۠ۤ;->ۥ:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ۥ(LYue/ۥۣۡۧ۠;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "route"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۧ۠ۤ;->ۥ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟(LYue/ۥۣۡۧ۠;)V
    .locals 1
    .param p1    # LYue/ۥۣۡۧ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "failedRoute"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۧ۠ۤ;->ۥ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۥ۟۟(LYue/ۥۣۡۧ۠;)Z
    .locals 1
    .param p1    # LYue/ۥۣۡۧ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    monitor-enter p0

    :try_start_0
    const-string v0, "route"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۡۧ۠ۤ;->ۥ:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
