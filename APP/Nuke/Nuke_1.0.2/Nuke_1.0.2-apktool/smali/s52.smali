.class public final Ls52;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final h:Let1;

.field public final i:Lk82;

.field public final j:Lud0;

.field public volatile k:Lkg0;

.field public final l:Lr52;

.field public final m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public n:Ljava/lang/Object;

.field public o:Lyg0;

.field public p:Lt52;

.field public q:Z

.field public r:Lf90;

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public volatile x:Z

.field public volatile y:Lf90;

.field public final z:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Lkg0;

    .line 2
    .line 3
    const-string v1, "k"

    .line 4
    .line 5
    const-class v2, Ls52;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Let1;Lk82;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls52;->h:Let1;

    .line 8
    .line 9
    iput-object p2, p0, Ls52;->i:Lk82;

    .line 10
    .line 11
    iget-object v0, p1, Let1;->E:Ln4;

    .line 12
    .line 13
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lud0;

    .line 16
    .line 17
    iput-object v0, p0, Ls52;->j:Lud0;

    .line 18
    .line 19
    iget-object v0, p1, Let1;->d:Lum2;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    sget-object v0, Lkg0;->a:Ljg0;

    .line 25
    .line 26
    iput-object v0, p0, Ls52;->k:Lkg0;

    .line 27
    .line 28
    new-instance v0, Lr52;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lr52;-><init>(Ls52;)V

    .line 31
    .line 32
    .line 33
    iget p1, p1, Let1;->w:I

    .line 34
    .line 35
    int-to-long v1, p1

    .line 36
    invoke-virtual {v0, v1, v2}, Lo23;->g(J)Lo23;

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Ls52;->l:Lr52;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ls52;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    const/4 p1, 0x1

    .line 49
    iput-boolean p1, p0, Ls52;->w:Z

    .line 50
    .line 51
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 57
    .line 58
    new-instance p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 59
    .line 60
    iget-object p1, p2, Lk82;->e:Lp40;

    .line 61
    .line 62
    invoke-direct {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public static final a(Ls52;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, Ls52;->x:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "canceled "

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v1, ""

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, "call"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, " to "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Ls52;->i:Lk82;

    .line 29
    .line 30
    iget-object p0, p0, Lk82;->a:Lyw0;

    .line 31
    .line 32
    invoke-virtual {p0}, Lyw0;->g()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ls52;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ls52;->x:Z

    .line 8
    .line 9
    iget-object v0, p0, Ls52;->y:Lf90;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Lf90;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lxg0;

    .line 16
    .line 17
    invoke-interface {v0}, Lxg0;->cancel()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Ls52;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljb2;

    .line 40
    .line 41
    invoke-interface {v1}, Ljb2;->cancel()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    iget-object p0, p0, Ls52;->k:Lkg0;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ls52;

    .line 2
    .line 3
    iget-object v1, p0, Ls52;->h:Let1;

    .line 4
    .line 5
    iget-object p0, p0, Ls52;->i:Lk82;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Ls52;-><init>(Let1;Lk82;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final d(Lt52;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lwg3;->a:Ljava/util/TimeZone;

    .line 5
    .line 6
    iget-object v0, p0, Ls52;->p:Lt52;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Ls52;->p:Lt52;

    .line 11
    .line 12
    iget-object p1, p1, Lt52;->p:Ljava/util/ArrayList;

    .line 13
    .line 14
    new-instance v0, Lq52;

    .line 15
    .line 16
    iget-object v1, p0, Ls52;->n:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-direct {v0, p0, v1}, Lq52;-><init>(Ls52;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "Check failed."

    .line 26
    .line 27
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final f(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    sget-object v0, Lwg3;->a:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p0, Ls52;->p:Lt52;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Ls52;->m()Ljava/net/Socket;

    .line 9
    .line 10
    .line 11
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    monitor-exit v0

    .line 13
    iget-object v0, p0, Ls52;->p:Lt52;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-static {v1}, Lwg3;->c(Ljava/net/Socket;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Ls52;->k:Lkg0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    if-nez v1, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    const-string p0, "Check failed."

    .line 32
    .line 33
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    monitor-exit v0

    .line 40
    throw p0

    .line 41
    :cond_3
    :goto_0
    iget-boolean v0, p0, Ls52;->q:Z

    .line 42
    .line 43
    if-eqz v0, :cond_4

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget-object v0, p0, Ls52;->l:Lr52;

    .line 47
    .line 48
    invoke-virtual {v0}, Lwg;->i()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    :goto_1
    move-object v0, p1

    .line 55
    goto :goto_2

    .line 56
    :cond_5
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 57
    .line 58
    const-string v1, "timeout"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 66
    .line 67
    .line 68
    :cond_6
    :goto_2
    iget-object p0, p0, Ls52;->k:Lkg0;

    .line 69
    .line 70
    if-eqz p1, :cond_7

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method public final g(Ldp;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ls52;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lzz1;->a:Lzz1;

    .line 12
    .line 13
    sget-object v0, Lzz1;->a:Lzz1;

    .line 14
    .line 15
    invoke-virtual {v0}, Lzz1;->e()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Ls52;->n:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Ls52;->k:Lkg0;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Ls52;->h:Let1;

    .line 27
    .line 28
    iget-object v0, v0, Let1;->a:Lkj1;

    .line 29
    .line 30
    new-instance v1, Lp52;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1}, Lp52;-><init>(Ls52;Ldp;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x6

    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-static {v0, v1, p1, p1, p0}, Lkj1;->H(Lkj1;Lp52;Ls52;Lp52;I)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    const-string p0, "Already Executed"

    .line 45
    .line 46
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final h()Lr92;
    .locals 4

    .line 1
    iget-object v0, p0, Ls52;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ls52;->l:Lr52;

    .line 13
    .line 14
    invoke-virtual {v0}, Lwg;->h()V

    .line 15
    .line 16
    .line 17
    sget-object v0, Lzz1;->a:Lzz1;

    .line 18
    .line 19
    sget-object v0, Lzz1;->a:Lzz1;

    .line 20
    .line 21
    invoke-virtual {v0}, Lzz1;->e()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Ls52;->n:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v0, p0, Ls52;->k:Lkg0;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x5

    .line 33
    :try_start_0
    iget-object v2, p0, Ls52;->h:Let1;

    .line 34
    .line 35
    iget-object v2, v2, Let1;->a:Lkj1;

    .line 36
    .line 37
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    :try_start_1
    iget-object v3, v2, Lkj1;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v3, Ljava/util/ArrayDeque;

    .line 41
    .line 42
    invoke-virtual {v3, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 43
    .line 44
    .line 45
    :try_start_2
    monitor-exit v2

    .line 46
    invoke-virtual {p0}, Ls52;->j()Lr92;

    .line 47
    .line 48
    .line 49
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    iget-object v3, p0, Ls52;->h:Let1;

    .line 51
    .line 52
    iget-object v3, v3, Let1;->a:Lkj1;

    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v1, p0, v1, v0}, Lkj1;->H(Lkj1;Lp52;Ls52;Lp52;I)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :catchall_0
    move-exception v2

    .line 62
    goto :goto_0

    .line 63
    :catchall_1
    move-exception v3

    .line 64
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 65
    :try_start_4
    throw v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 66
    :goto_0
    iget-object v3, p0, Ls52;->h:Let1;

    .line 67
    .line 68
    iget-object v3, v3, Let1;->a:Lkj1;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {v3, v1, p0, v1, v0}, Lkj1;->H(Lkj1;Lp52;Ls52;Lp52;I)V

    .line 74
    .line 75
    .line 76
    throw v2

    .line 77
    :cond_0
    const-string p0, "Already Executed"

    .line 78
    .line 79
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method

.method public final i(Z)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ls52;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object v2, p0, Ls52;->y:Lf90;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    iget-object p1, v2, Lf90;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lxg0;

    .line 16
    .line 17
    invoke-interface {p1}, Lxg0;->cancel()V

    .line 18
    .line 19
    .line 20
    iget-object p1, v2, Lf90;->b:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    check-cast v1, Ls52;

    .line 24
    .line 25
    const/4 v6, 0x1

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v3, 0x1

    .line 28
    const/4 v4, 0x1

    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-virtual/range {v1 .. v7}, Ls52;->k(Lf90;ZZZZLjava/io/IOException;)Ljava/io/IOException;

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Ls52;->r:Lf90;

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    :try_start_1
    const-string p1, "released"

    .line 38
    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    monitor-exit p0

    .line 48
    throw p1
.end method

.method public final j()Lr92;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    new-instance v2, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Ls52;->h:Let1;

    .line 9
    .line 10
    iget-object v0, v0, Let1;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v2}, Liu;->g0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lzo;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v0, v3}, Lzo;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    new-instance v0, Lzo;

    .line 25
    .line 26
    const/4 v3, 0x2

    .line 27
    invoke-direct {v0, v3}, Lzo;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    new-instance v0, Lzo;

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v0, v3}, Lzo;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    sget-object v0, Lzo;->c:Lzo;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    iget-object v0, v1, Ls52;->h:Let1;

    .line 48
    .line 49
    iget-object v0, v0, Let1;->c:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {v0, v2}, Liu;->g0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lzo;->b:Lzo;

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    new-instance v0, Lv52;

    .line 60
    .line 61
    iget-object v5, v1, Ls52;->i:Lk82;

    .line 62
    .line 63
    iget-object v3, v1, Ls52;->h:Let1;

    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget v6, v3, Let1;->x:I

    .line 69
    .line 70
    iget v7, v3, Let1;->y:I

    .line 71
    .line 72
    iget v8, v3, Let1;->z:I

    .line 73
    .line 74
    iget-object v9, v3, Let1;->g:Lgd3;

    .line 75
    .line 76
    iget-object v10, v3, Let1;->u:Lcq;

    .line 77
    .line 78
    iget-object v11, v3, Let1;->E:Ln4;

    .line 79
    .line 80
    iget-object v12, v3, Let1;->j:Lsn;

    .line 81
    .line 82
    iget-object v13, v3, Let1;->k:Lna0;

    .line 83
    .line 84
    iget-object v14, v3, Let1;->t:Lys1;

    .line 85
    .line 86
    iget-object v15, v3, Let1;->l:Ljava/net/Proxy;

    .line 87
    .line 88
    iget-object v4, v3, Let1;->n:Lgd3;

    .line 89
    .line 90
    move-object/from16 v16, v0

    .line 91
    .line 92
    iget-object v0, v3, Let1;->m:Ljava/net/ProxySelector;

    .line 93
    .line 94
    move-object/from16 v17, v0

    .line 95
    .line 96
    iget-boolean v0, v3, Let1;->e:Z

    .line 97
    .line 98
    move/from16 v18, v0

    .line 99
    .line 100
    iget-object v0, v3, Let1;->o:Ljavax/net/SocketFactory;

    .line 101
    .line 102
    move-object/from16 v19, v0

    .line 103
    .line 104
    iget-object v0, v3, Let1;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 105
    .line 106
    move-object/from16 v20, v0

    .line 107
    .line 108
    iget-object v0, v3, Let1;->q:Ljavax/net/ssl/X509TrustManager;

    .line 109
    .line 110
    iget-object v3, v3, Let1;->v:Lup0;

    .line 111
    .line 112
    move-object/from16 v22, v3

    .line 113
    .line 114
    const/4 v3, 0x0

    .line 115
    move-object/from16 v21, v0

    .line 116
    .line 117
    move-object/from16 v0, v16

    .line 118
    .line 119
    move-object/from16 v16, v4

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    invoke-direct/range {v0 .. v22}, Lv52;-><init>(Ls52;Ljava/util/ArrayList;ILf90;Lk82;IIILgd3;Lcq;Ln4;Lsn;Lna0;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Proxy;Lgd3;Ljava/net/ProxySelector;ZLjavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;Lup0;)V

    .line 123
    .line 124
    .line 125
    const/4 v2, 0x0

    .line 126
    const/4 v3, 0x0

    .line 127
    :try_start_0
    iget-object v4, v1, Ls52;->i:Lk82;

    .line 128
    .line 129
    invoke-virtual {v0, v4}, Lv52;->b(Lk82;)Lr92;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iget-boolean v4, v1, Ls52;->x:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    .line 135
    if-nez v4, :cond_0

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Ls52;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :cond_0
    :try_start_1
    invoke-static {v0}, Lug3;->b(Ljava/io/Closeable;)V

    .line 142
    .line 143
    .line 144
    new-instance v0, Ljava/io/IOException;

    .line 145
    .line 146
    const-string v4, "Canceled"

    .line 147
    .line 148
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    :catchall_0
    move-exception v0

    .line 153
    goto :goto_0

    .line 154
    :catch_0
    move-exception v0

    .line 155
    const/4 v3, 0x1

    .line 156
    :try_start_2
    invoke-virtual {v1, v0}, Ls52;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    :goto_0
    if-nez v3, :cond_1

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Ls52;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 167
    .line 168
    .line 169
    :cond_1
    throw v0
.end method

.method public final k(Lf90;ZZZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls52;->y:Lf90;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_5

    .line 13
    .line 14
    :cond_0
    monitor-enter p0

    .line 15
    const/4 p1, 0x1

    .line 16
    const/4 v0, 0x0

    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    :try_start_0
    iget-boolean v1, p0, Ls52;->s:Z

    .line 20
    .line 21
    if-nez v1, :cond_4

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 27
    .line 28
    iget-boolean v1, p0, Ls52;->t:Z

    .line 29
    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    :cond_2
    if-eqz p5, :cond_3

    .line 33
    .line 34
    iget-boolean v1, p0, Ls52;->u:Z

    .line 35
    .line 36
    if-nez v1, :cond_4

    .line 37
    .line 38
    :cond_3
    if-eqz p4, :cond_b

    .line 39
    .line 40
    iget-boolean v1, p0, Ls52;->v:Z

    .line 41
    .line 42
    if-eqz v1, :cond_b

    .line 43
    .line 44
    :cond_4
    if-eqz p2, :cond_5

    .line 45
    .line 46
    iput-boolean v0, p0, Ls52;->s:Z

    .line 47
    .line 48
    :cond_5
    if-eqz p3, :cond_6

    .line 49
    .line 50
    iput-boolean v0, p0, Ls52;->t:Z

    .line 51
    .line 52
    :cond_6
    if-eqz p5, :cond_7

    .line 53
    .line 54
    iput-boolean v0, p0, Ls52;->u:Z

    .line 55
    .line 56
    :cond_7
    if-eqz p4, :cond_8

    .line 57
    .line 58
    iput-boolean v0, p0, Ls52;->v:Z

    .line 59
    .line 60
    :cond_8
    iget-boolean p2, p0, Ls52;->s:Z

    .line 61
    .line 62
    if-nez p2, :cond_9

    .line 63
    .line 64
    iget-boolean p2, p0, Ls52;->t:Z

    .line 65
    .line 66
    if-nez p2, :cond_9

    .line 67
    .line 68
    iget-boolean p2, p0, Ls52;->u:Z

    .line 69
    .line 70
    if-nez p2, :cond_9

    .line 71
    .line 72
    iget-boolean p2, p0, Ls52;->v:Z

    .line 73
    .line 74
    if-nez p2, :cond_9

    .line 75
    .line 76
    move p2, p1

    .line 77
    goto :goto_1

    .line 78
    :cond_9
    move p2, v0

    .line 79
    :goto_1
    if-eqz p2, :cond_a

    .line 80
    .line 81
    iget-boolean p3, p0, Ls52;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    if-nez p3, :cond_a

    .line 84
    .line 85
    move v0, p1

    .line 86
    :cond_a
    move v2, v0

    .line 87
    move v0, p2

    .line 88
    move p2, v2

    .line 89
    goto :goto_3

    .line 90
    :goto_2
    monitor-exit p0

    .line 91
    throw p1

    .line 92
    :cond_b
    move p2, v0

    .line 93
    :goto_3
    monitor-exit p0

    .line 94
    if-eqz v0, :cond_c

    .line 95
    .line 96
    const/4 p3, 0x0

    .line 97
    iput-object p3, p0, Ls52;->y:Lf90;

    .line 98
    .line 99
    iget-object p3, p0, Ls52;->p:Lt52;

    .line 100
    .line 101
    if-eqz p3, :cond_c

    .line 102
    .line 103
    monitor-enter p3

    .line 104
    :try_start_1
    iget p4, p3, Lt52;->m:I

    .line 105
    .line 106
    add-int/2addr p4, p1

    .line 107
    iput p4, p3, Lt52;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    .line 109
    monitor-exit p3

    .line 110
    goto :goto_4

    .line 111
    :catchall_1
    move-exception p0

    .line 112
    monitor-exit p3

    .line 113
    throw p0

    .line 114
    :cond_c
    :goto_4
    if-eqz p2, :cond_d

    .line 115
    .line 116
    invoke-virtual {p0, p6}, Ls52;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :cond_d
    :goto_5
    return-object p6
.end method

.method public final l(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ls52;->w:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Ls52;->w:Z

    .line 8
    .line 9
    iget-boolean v0, p0, Ls52;->s:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Ls52;->t:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-boolean v0, p0, Ls52;->u:Z

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-boolean v0, p0, Ls52;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit p0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ls52;->f(Ljava/io/IOException;)Ljava/io/IOException;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :cond_1
    return-object p1

    .line 38
    :goto_1
    monitor-exit p0

    .line 39
    throw p1
.end method

.method public final m()Ljava/net/Socket;
    .locals 6

    .line 1
    iget-object v0, p0, Ls52;->p:Lt52;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lwg3;->a:Ljava/util/TimeZone;

    .line 7
    .line 8
    iget-object v1, v0, Lt52;->p:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, -0x1

    .line 20
    if-eqz v4, :cond_1

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Ljava/lang/ref/Reference;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v4, p0}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v3, v5

    .line 43
    :goto_1
    const/4 v2, 0x0

    .line 44
    if-eq v3, v5, :cond_6

    .line 45
    .line 46
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Ls52;->p:Lt52;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_5

    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    iput-wide v3, v0, Lt52;->q:J

    .line 62
    .line 63
    iget-object p0, p0, Ls52;->j:Lud0;

    .line 64
    .line 65
    iget-object v1, p0, Lud0;->d:Ljava/io/Serializable;

    .line 66
    .line 67
    check-cast v1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 68
    .line 69
    sget-object v3, Lwg3;->a:Ljava/util/TimeZone;

    .line 70
    .line 71
    iget-boolean v3, v0, Lt52;->j:Z

    .line 72
    .line 73
    if-nez v3, :cond_2

    .line 74
    .line 75
    iget-object v0, p0, Lud0;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lhy2;

    .line 78
    .line 79
    iget-object p0, p0, Lud0;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Lu52;

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    invoke-virtual {v0, p0, v3, v4}, Lhy2;->c(Ley2;J)V

    .line 86
    .line 87
    .line 88
    return-object v2

    .line 89
    :cond_2
    const/4 v2, 0x1

    .line 90
    iput-boolean v2, v0, Lt52;->j:Z

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_4

    .line 100
    .line 101
    iget-object p0, p0, Lud0;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Lhy2;

    .line 104
    .line 105
    iget-object v1, p0, Lhy2;->a:Liy2;

    .line 106
    .line 107
    monitor-enter v1

    .line 108
    :try_start_0
    invoke-virtual {p0}, Lhy2;->a()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_3

    .line 113
    .line 114
    iget-object v2, p0, Lhy2;->a:Liy2;

    .line 115
    .line 116
    invoke-virtual {v2, p0}, Liy2;->c(Lhy2;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catchall_0
    move-exception p0

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    :goto_2
    monitor-exit v1

    .line 123
    goto :goto_4

    .line 124
    :goto_3
    monitor-exit v1

    .line 125
    throw p0

    .line 126
    :cond_4
    :goto_4
    iget-object p0, v0, Lt52;->e:Ljava/net/Socket;

    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_5
    return-object v2

    .line 130
    :cond_6
    const-string p0, "Check failed."

    .line 131
    .line 132
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-object v2
.end method
