.class public final Lyyds/ᲀᛴᲈᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᛳᲇᲁ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛵᛴ;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Lyyds/ᛱᛷᛳᛳ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 5
    .line 6
    new-instance v0, Lyyds/ᛵᛱᛵᛴ;

    .line 7
    .line 8
    iget-object p1, p1, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 9
    .line 10
    iget-object p1, p1, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lyyds/ᲈᲇᛲᛴ;

    .line 13
    .line 14
    iget-object p1, p1, Lyyds/ᲈᲇᛲᛴ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛳᲇᲁ;

    .line 15
    .line 16
    invoke-interface {p1}, Lyyds/ᲀᛳᲇᲁ;->ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Lyyds/ᛵᛱᛵᛴ;-><init>(Lyyds/ᲈᲁᛴᛲ;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛵᛴ;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᲇᲈᛵᛷ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    :try_start_1
    iput-boolean v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᲇᲈᛵᛷ:Z

    .line 10
    .line 11
    iget-object v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 12
    .line 13
    iget-object v0, v0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 14
    .line 15
    iget-object v0, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lyyds/ᲈᲇᛲᛴ;

    .line 18
    .line 19
    const-string v1, "0\r\n\r\n"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛵᛴ;

    .line 25
    .line 26
    iget-object v1, v0, Lyyds/ᛵᛱᛵᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲁᛴᛲ;

    .line 27
    .line 28
    sget-object v2, Lyyds/ᲈᲁᛴᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲁᲁᲁ;

    .line 29
    .line 30
    iput-object v2, v0, Lyyds/ᛵᛱᛵᛴ;->ᛲᛴᛳᛲ:Lyyds/ᲈᲁᛴᛲ;

    .line 31
    .line 32
    invoke-virtual {v1}, Lyyds/ᲈᲁᛴᛲ;->ᛲᲈᲁ()Lyyds/ᲈᲁᛴᛲ;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lyyds/ᲈᲁᛴᛲ;->ᛵᛸᛸᛷ()Lyyds/ᲈᲁᛴᛲ;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    iput v1, v0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᲇᲈᛵᛷ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 9
    .line 10
    iget-object v0, v0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 11
    .line 12
    iget-object v0, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lyyds/ᲈᲇᛲᛴ;

    .line 15
    .line 16
    invoke-virtual {v0}, Lyyds/ᲈᲇᛲᛴ;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 23
    throw v0
.end method

.method public final ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᲀᛴᲈᲈ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    const-string v1, "closed"

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, p1, v2

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, Lyyds/ᲀᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛷᛳᛳ;

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lyyds/ᲈᲇᛲᛴ;

    .line 21
    .line 22
    iget-boolean v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᛲᛴᛳᛲ:Z

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lyyds/ᲈᲇᛲᛴ;->ᲇᲈᛵᛷ:Lyyds/ᛷᛲᲈᛲ;

    .line 27
    .line 28
    invoke-virtual {v0, p1, p2}, Lyyds/ᛷᛲᲈᛲ;->ᛲᲀᛵᛷ(J)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->ᛲᲈᲁ()Lyyds/ᛴᛴᛱᛴ;

    .line 32
    .line 33
    .line 34
    const-string v0, "\r\n"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, p2, p3}, Lyyds/ᲈᲇᛲᛴ;->ᛱᛳᲇ(JLyyds/ᛷᛲᲈᛲ;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-static {v1}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-static {v1}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᲈᲁᛴᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᛴᲈᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛵᛱᛵᛴ;

    .line 2
    .line 3
    return-object p0
.end method
