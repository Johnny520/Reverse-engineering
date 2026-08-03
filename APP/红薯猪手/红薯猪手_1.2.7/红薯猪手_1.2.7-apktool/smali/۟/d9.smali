.class public final L۟/d9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements L۟/bb;
.implements L۟/j1;


# instance fields
.field public ۥ:L۟/f1;

.field public ۥ۟:Z


# virtual methods
.method public final declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final getDatabaseName()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ۥ۟۟()L۟/bb;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۥ۟ۦ(Ljava/io/File;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized ۥ۠ۡ()L۟/ab;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, L۟/d9;->ۥ۟:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, L۟/d9;->ۥۣ۠(Z)V

    iput-boolean v0, p0, L۟/d9;->ۥ۟:Z

    :cond_0
    const/4 v0, 0x0

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final ۥۣ۠(Z)V
    .locals 0

    invoke-virtual {p0}, L۟/d9;->getDatabaseName()Ljava/lang/String;

    const/4 p1, 0x0

    throw p1
.end method
