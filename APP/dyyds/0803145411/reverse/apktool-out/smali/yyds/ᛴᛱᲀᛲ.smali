.class public final Lyyds/ᛴᛱᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛱᛵᲁᲀ;
.implements Lyyds/ᛸᛷᛷᛸ;


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public final ᛲᲈᲁ:Ljava/lang/Object;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲁᲀ;

.field public volatile ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

.field public ᲇᲇᲇᛱ:I

.field public volatile ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lyyds/ᛱᛵᲁᲀ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 6
    .line 7
    iput v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Lyyds/ᛴᛱᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲁᲀ;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x3

    .line 5
    :try_start_0
    iput v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 6
    .line 7
    iget-object v2, p0, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 8
    .line 9
    invoke-interface {v2}, Lyyds/ᛸᛷᛷᛸ;->clear()V

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 13
    .line 14
    if-eq v2, v1, :cond_0

    .line 15
    .line 16
    iput v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 19
    .line 20
    invoke-interface {p0}, Lyyds/ᛸᛷᛷᛸ;->clear()V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0
.end method

.method public final getRoot()Lyyds/ᛱᛵᲁᲀ;
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲁᲀ;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Lyyds/ᛱᛵᲁᲀ;->getRoot()Lyyds/ᛱᛵᲁᲀ;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit v0

    .line 16
    return-object p0

    .line 17
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p0
.end method

.method public final isRunning()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    iget p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    if-ne p0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    monitor-exit v0

    .line 19
    return v2

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public final ᛱᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lyyds/ᛴᛱᲀᛲ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lyyds/ᛴᛱᲀᛲ;

    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 9
    .line 10
    iget-object v2, p1, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 11
    .line 12
    invoke-interface {v0, v2}, Lyyds/ᛸᛷᛷᛸ;->ᛱᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 19
    .line 20
    iget-object p1, p1, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Lyyds/ᛸᛷᛷᛸ;->ᛱᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v1
.end method

.method public final ᛲᛳᛶᲁ()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 5
    .line 6
    const/4 v2, 0x4

    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    iget p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    if-ne p0, v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_2

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    :goto_1
    monitor-exit v0

    .line 20
    return p0

    .line 21
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
.end method

.method public final ᛲᛴᛳᛲ(Lyyds/ᛸᛷᛷᛸ;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 5
    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v1, 0x5

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iput v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 14
    .line 15
    iget p1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq p1, v1, :cond_0

    .line 19
    .line 20
    iput v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 21
    .line 22
    iget-object p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 23
    .line 24
    invoke-interface {p0}, Lyyds/ᛸᛷᛷᛸ;->ᛶᛷᛲᲁ()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :cond_1
    iput v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 33
    .line 34
    iget-object p1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲁᲀ;

    .line 35
    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    invoke-interface {p1, p0}, Lyyds/ᛱᛵᲁᲀ;->ᛲᛴᛳᛲ(Lyyds/ᛸᛷᛷᛸ;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0
.end method

.method public final ᛲᲈᲁ()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 5
    .line 6
    invoke-interface {v1}, Lyyds/ᛸᛷᛷᛸ;->ᛲᲈᲁ()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 13
    .line 14
    invoke-interface {p0}, Lyyds/ᛸᛷᛷᛸ;->ᛲᲈᲁ()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    :goto_1
    monitor-exit v0

    .line 27
    return p0

    .line 28
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0
.end method

.method public final ᛵᛸᛸᛷ(Lyyds/ᛸᛷᛷᛸ;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 5
    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x4

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iput v2, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iput v2, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 27
    .line 28
    :cond_1
    :goto_0
    iget-object p1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲁᲀ;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-interface {p1, p0}, Lyyds/ᛱᛵᲁᲀ;->ᛵᛸᛸᛷ(Lyyds/ᛸᛷᛷᛸ;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    throw p0
.end method

.method public final ᛶᛷᛲᲁ()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    iput v2, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 12
    .line 13
    invoke-interface {p0}, Lyyds/ᛸᛷᛷᛸ;->ᛶᛷᛲᲁ()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
.end method

.method public final ᛷᛲᲈᛱ(Lyyds/ᛸᛷᛷᛸ;)Z
    .locals 1

    .line 1
    iget-object p1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p1

    .line 4
    :try_start_0
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲁᲀ;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-interface {v0, p0}, Lyyds/ᛱᛵᲁᲀ;->ᛷᛲᲈᛱ(Lyyds/ᛸᛷᛷᛸ;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 18
    :goto_1
    monitor-exit p1

    .line 19
    return p0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw p0
.end method

.method public final ᛷᲈᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲁᲀ;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1, p0}, Lyyds/ᛱᛵᲁᲀ;->ᛷᲈᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    :goto_0
    monitor-exit v0

    .line 26
    return p0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 5
    .line 6
    const/4 v2, 0x3

    .line 7
    if-ne v1, v2, :cond_0

    .line 8
    .line 9
    iget p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    if-ne p0, v2, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    monitor-exit v0

    .line 19
    return p0

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p0
.end method

.method public final ᲇᲇᲇᛱ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    if-ne v1, v3, :cond_0

    .line 9
    .line 10
    iput v2, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 11
    .line 12
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 13
    .line 14
    invoke-interface {v1}, Lyyds/ᛸᛷᛷᛸ;->ᲇᲇᲇᛱ()V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    iget v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 21
    .line 22
    if-ne v1, v3, :cond_1

    .line 23
    .line 24
    iput v2, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 25
    .line 26
    iget-object p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 27
    .line 28
    invoke-interface {p0}, Lyyds/ᛸᛷᛷᛸ;->ᲇᲇᲇᛱ()V

    .line 29
    .line 30
    .line 31
    :cond_1
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    throw p0
.end method

.method public final ᲇᲈᛵᛷ(Lyyds/ᛸᛷᛷᛸ;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛵᲁᲀ;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v1, p0}, Lyyds/ᛱᛵᲁᲀ;->ᲇᲈᛵᛷ(Lyyds/ᛸᛷᛷᛸ;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_4

    .line 14
    .line 15
    :cond_0
    iget v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᛲᛴᛳᛲ:I

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x5

    .line 19
    if-eq v1, v4, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲀᛲᛳᲀ:Lyyds/ᛸᛷᛷᛸ;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v1, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛸᛷᛷᛸ;

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    iget p0, p0, Lyyds/ᛴᛱᲀᛲ;->ᲇᲇᲇᛱ:I

    .line 37
    .line 38
    const/4 p1, 0x4

    .line 39
    if-eq p0, p1, :cond_2

    .line 40
    .line 41
    if-ne p0, v4, :cond_3

    .line 42
    .line 43
    :cond_2
    move p0, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    move p0, v2

    .line 46
    :goto_0
    if-eqz p0, :cond_4

    .line 47
    .line 48
    move v2, v3

    .line 49
    :cond_4
    monitor-exit v0

    .line 50
    return v2

    .line 51
    :catchall_0
    move-exception p0

    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw p0
.end method
