.class public LYue/ۥۡۡ۠ۢ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡ۠ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# instance fields
.field public ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized ۥ()LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    iget-object v1, v0, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    iput-object v1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized ۥ۟(I)V
    .locals 4

    monitor-enter p0

    :goto_0
    :try_start_0
    iget-object v0, p0, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    if-eqz v0, :cond_0

    iget v1, v0, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ۟:I

    if-ne v1, p1, :cond_0

    iget-object v1, v0, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    iput-object v1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ۟۟۟()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_0
    if-eqz v0, :cond_2

    iget-object v1, v0, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    :goto_1
    if-eqz v1, :cond_2

    iget-object v2, v1, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    iget v3, v1, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ۟:I

    if-ne v3, p1, :cond_1

    iput-object v2, v0, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    invoke-virtual {v1}, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ۟۟۟()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_1
    move-object v0, v1

    :goto_2
    move-object v1, v2

    goto :goto_1

    :cond_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized ۥ۟۟(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    if-nez v0, :cond_0

    iput-object p1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    :try_start_1
    iget-object v1, v0, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    if-eqz v1, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    iput-object p1, v0, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized ۥ۟۟۟(LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    iput-object v0, p1, LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;

    iput-object p1, p0, LYue/ۥۡۡ۠ۢ$ۥ۟۟;->ۥ:LYue/ۥۡۡ۠ۢ$ۥ۟۟۟;
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
