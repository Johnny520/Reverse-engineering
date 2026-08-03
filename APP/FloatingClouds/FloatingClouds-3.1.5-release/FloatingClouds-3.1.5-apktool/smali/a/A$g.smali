.class public final La/A$g;
.super La/A$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# virtual methods
.method public final a(La/A;La/A$d;)Z
    .locals 2

    sget-object v0, La/A$d;->b:La/A$d;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, La/A;->b:La/A$d;

    if-ne v1, p2, :cond_0

    iput-object v0, p1, La/A;->b:La/A$d;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final b(La/A;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/A<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, La/A;->a:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, La/A;->a:Ljava/lang/Object;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final c(La/A;La/A$h;La/A$h;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/A<",
            "*>;",
            "La/A$h;",
            "La/A$h;",
            ")Z"
        }
    .end annotation

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, La/A;->c:La/A$h;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, La/A;->c:La/A$h;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final d(La/A$h;La/A$h;)V
    .locals 0

    iput-object p2, p1, La/A$h;->b:La/A$h;

    return-void
.end method

.method public final e(La/A$h;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, La/A$h;->a:Ljava/lang/Thread;

    return-void
.end method
