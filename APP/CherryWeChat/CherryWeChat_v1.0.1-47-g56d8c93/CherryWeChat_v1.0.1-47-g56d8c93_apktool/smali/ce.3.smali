.class public final Lce;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LUd;


# instance fields
.field public final a:LP3;

.field public final b:Ljava/io/File;

.field public final c:J

.field public final d:LP3;

.field public e:Lbe;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LP3;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, LP3;-><init>(I)V

    iput-object v0, p0, Lce;->d:LP3;

    iput-object p1, p0, Lce;->b:Ljava/io/File;

    const-wide/32 v0, 0xfa00000

    iput-wide v0, p0, Lce;->c:J

    new-instance p1, LP3;

    const/16 v0, 0x1d

    invoke-direct {p1, v0}, LP3;-><init>(I)V

    iput-object p1, p0, Lce;->a:LP3;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lbe;
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lce;->e:Lbe;

    if-nez v0, :cond_0

    iget-object v0, p0, Lce;->b:Ljava/io/File;

    iget-wide v1, p0, Lce;->c:J

    invoke-static {v0, v1, v2}, Lbe;->q(Ljava/io/File;J)Lbe;

    move-result-object v0

    iput-object v0, p0, Lce;->e:Lbe;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lce;->e:Lbe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b(LSm;)Ljava/io/File;
    .locals 3

    iget-object v0, p0, Lce;->a:LP3;

    invoke-virtual {v0, p1}, LP3;->G(LSm;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DiskLruCacheWrapper"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lce;->a()Lbe;

    move-result-object v1

    invoke-virtual {v1, v0}, Lbe;->o(Ljava/lang/String;)LD2;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/io/File;

    const/4 v1, 0x0

    aget-object p1, v0, v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-object p1
.end method

.method public final d(LSm;Lw4;)V
    .locals 6

    const-string v0, "Had two simultaneous puts for: "

    iget-object v1, p0, Lce;->a:LP3;

    invoke-virtual {v1, p1}, LP3;->G(LSm;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lce;->d:LP3;

    monitor-enter v2

    :try_start_0
    iget-object v3, v2, LP3;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LWd;

    if-nez v3, :cond_1

    iget-object v3, v2, LP3;->c:Ljava/lang/Object;

    check-cast v3, Ln6;

    iget-object v4, v3, Ln6;->a:Ljava/util/ArrayDeque;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v3, v3, Ln6;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LWd;

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v3, :cond_0

    :try_start_2
    new-instance v3, LWd;

    invoke-direct {v3}, LWd;-><init>()V

    :cond_0
    iget-object v4, v2, LP3;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1

    :cond_1
    :goto_0
    iget v4, v3, LWd;->b:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v3, LWd;->b:I

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v2, v3, LWd;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_5
    const-string v2, "DiskLruCacheWrapper"

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_1
    :try_start_6
    invoke-virtual {p0}, Lce;->a()Lbe;

    move-result-object p1

    invoke-virtual {p1, v1}, Lbe;->o(Ljava/lang/String;)LD2;

    move-result-object v2
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v2, :cond_4

    :catch_0
    :cond_3
    :goto_2
    iget-object p1, p0, Lce;->d:LP3;

    invoke-virtual {p1, v1}, LP3;->Q(Ljava/lang/String;)V

    return-void

    :cond_4
    :try_start_7
    invoke-virtual {p1, v1}, Lbe;->l(Ljava/lang/String;)LZd;

    move-result-object p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz p1, :cond_7

    :try_start_8
    invoke-virtual {p1}, LZd;->b()Ljava/io/File;

    move-result-object v0

    iget-object v2, p2, Lw4;->b:Ljava/lang/Object;

    check-cast v2, LPf;

    iget-object v3, p2, Lw4;->c:Ljava/lang/Object;

    iget-object p2, p2, Lw4;->d:Ljava/lang/Object;

    check-cast p2, Lvt;

    invoke-interface {v2, v3, v0, p2}, LPf;->c(Ljava/lang/Object;Ljava/io/File;Lvt;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p1, LZd;->d:Ljava/lang/Object;

    check-cast p2, Lbe;

    invoke-static {p2, p1, v5}, Lbe;->d(Lbe;LZd;Z)V

    iput-boolean v5, p1, LZd;->a:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :cond_5
    :try_start_9
    iget-boolean p2, p1, LZd;->a:Z

    if-nez p2, :cond_3

    invoke-virtual {p1}, LZd;->a()V

    goto :goto_2

    :catchall_3
    move-exception p2

    iget-boolean v0, p1, LZd;->a:Z
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-nez v0, :cond_6

    :try_start_a
    invoke-virtual {p1}, LZd;->a()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    :catch_1
    :cond_6
    :try_start_b
    throw p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :goto_3
    iget-object p2, p0, Lce;->d:LP3;

    invoke-virtual {p2, v1}, LP3;->Q(Ljava/lang/String;)V

    throw p1

    :goto_4
    :try_start_c
    monitor-exit v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    throw p1
.end method
