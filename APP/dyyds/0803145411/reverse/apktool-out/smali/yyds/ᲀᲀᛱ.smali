.class public final Lyyds/ᲀᲀᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛱᛸᛵ;


# instance fields
.field public ᛱᲈᲁ:I

.field public ᛲᛳᛶᲁ:Z

.field public final ᛲᛴᛳᛲ:Lyyds/ᲁᛱᛸᛵ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᛶᲀᛶᲀ;

.field public final ᲀᛲᛳᲀ:Z

.field public final ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛳᛵ;

.field public final ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Lyyds/ᲁᛱᛸᛵ;ZZLyyds/ᛶᲀᛶᲀ;Lyyds/ᲈᛳᛳᛵ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᲀᲀᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛱᛸᛵ;

    .line 10
    .line 11
    iput-boolean p2, p0, Lyyds/ᲀᲀᛱ;->ᲀᛲᛳᲀ:Z

    .line 12
    .line 13
    iput-boolean p3, p0, Lyyds/ᲀᲀᛱ;->ᲇᲈᛵᛷ:Z

    .line 14
    .line 15
    iput-object p4, p0, Lyyds/ᲀᲀᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲀᛶᲀ;

    .line 16
    .line 17
    invoke-static {p5, v0}, Lyyds/ᛲᛳᲁ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object p5, p0, Lyyds/ᲀᲀᛱ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛳᛵ;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛱᛸᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲁᛱᛸᛵ;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "EngineResource{isMemoryCacheable="

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lyyds/ᲀᲀᛱ;->ᲀᛲᛳᲀ:Z

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v0, ", listener="

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lyyds/ᲀᲀᛱ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛳᛵ;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v0, ", key="

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lyyds/ᲀᲀᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲀᛶᲀ;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, ", acquired="

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget v0, p0, Lyyds/ᲀᲀᛱ;->ᛱᲈᲁ:I

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ", isRecycled="

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-boolean v0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛳᛶᲁ:Z

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v0, ", resource="

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛱᛸᛵ;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const/16 v0, 0x7d

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit p0

    .line 74
    return-object v0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw v0
.end method

.method public final declared-synchronized ᛲᛴᛳᛲ()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lyyds/ᲀᲀᛱ;->ᛱᲈᲁ:I

    .line 3
    .line 4
    if-gtz v0, :cond_2

    .line 5
    .line 6
    iget-boolean v0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛳᛶᲁ:Z

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛳᛶᲁ:Z

    .line 12
    .line 13
    iget-boolean v0, p0, Lyyds/ᲀᲀᛱ;->ᲇᲈᛵᛷ:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛱᛸᛵ;

    .line 18
    .line 19
    invoke-interface {v0}, Lyyds/ᲁᛱᛸᛵ;->ᛲᛴᛳᛲ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "Cannot recycle a resource that has already been recycled"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v1, "Cannot recycle a resource while it is still acquired"

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw v0
.end method

.method public final declared-synchronized ᛲᲈᲁ()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛳᛶᲁ:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lyyds/ᲀᲀᛱ;->ᛱᲈᲁ:I

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    iput v0, p0, Lyyds/ᲀᲀᛱ;->ᛱᲈᲁ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v1, "Cannot acquire a recycled resource"

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛱᛸᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲁᛱᛸᛵ;->ᛵᛸᛸᛷ()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Lyyds/ᲀᲀᛱ;->ᛱᲈᲁ:I

    .line 3
    .line 4
    if-lez v0, :cond_2

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    sub-int/2addr v0, v1

    .line 8
    iput v0, p0, Lyyds/ᲀᲀᛱ;->ᛱᲈᲁ:I

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᲀᲀᛱ;->ᲇᲇᲇᛱ:Lyyds/ᲈᛳᛳᛵ;

    .line 18
    .line 19
    iget-object v1, p0, Lyyds/ᲀᲀᛱ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲀᛶᲀ;

    .line 20
    .line 21
    invoke-virtual {v0, v1, p0}, Lyyds/ᲈᛳᛳᛵ;->ᲇᲇᲇᛱ(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᲀᲀᛱ;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v1, "Cannot release a recycled or not yet acquired resource"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0

    .line 35
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    throw v0
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲀᲀᛱ;->ᛲᛴᛳᛲ:Lyyds/ᲁᛱᛸᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲁᛱᛸᛵ;->ᲇᲈᛵᛷ()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
