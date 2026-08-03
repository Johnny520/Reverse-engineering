.class public final Li0/l1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Li0/q;

.field public final b:Li0/o;

.field public final c:Li0/h0;

.field public final d:Lfg/p;

.field public final e:Z

.field public final f:Lx1/f2;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/atomic/AtomicReference;

.field public i:J

.field public j:Lf/l0;

.field public final k:Lb5/i;

.field public final l:Li0/z1;


# direct methods
.method public constructor <init>(Li0/q;Li0/o;Li0/h0;Lf/n0;Lfg/p;ZLx1/f2;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/l1;->a:Li0/q;

    .line 5
    .line 6
    iput-object p2, p0, Li0/l1;->b:Li0/o;

    .line 7
    .line 8
    iput-object p3, p0, Li0/l1;->c:Li0/h0;

    .line 9
    .line 10
    iput-object p5, p0, Li0/l1;->d:Lfg/p;

    .line 11
    .line 12
    iput-boolean p6, p0, Li0/l1;->e:Z

    .line 13
    .line 14
    iput-object p7, p0, Li0/l1;->f:Lx1/f2;

    .line 15
    .line 16
    iput-object p8, p0, Li0/l1;->g:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    sget-object p2, Li0/m1;->i:Li0/m1;

    .line 21
    .line 22
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Li0/l1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 26
    .line 27
    invoke-static {}, Ls0/i;->c()J

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    iput-wide p1, p0, Li0/l1;->i:J

    .line 32
    .line 33
    sget-object p1, Lf/s0;->a:Lf/l0;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Li0/l1;->j:Lf/l0;

    .line 39
    .line 40
    new-instance p1, Lb5/i;

    .line 41
    .line 42
    invoke-direct {p1}, Lb5/i;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3}, Li0/h0;->C()Lx0/d;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {p1, p4, p2}, Lb5/i;->i(Ljava/util/Set;Lx0/d;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Li0/l1;->k:Lb5/i;

    .line 53
    .line 54
    new-instance p1, Li0/z1;

    .line 55
    .line 56
    iget-object p2, p7, Lx1/f2;->i:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-direct {p1, p2}, Li0/z1;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Li0/l1;->l:Li0/z1;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Li0/l1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Li0/m1;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance v1, Laf/d;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v1

    .line 22
    :catch_0
    move-exception v1

    .line 23
    goto :goto_0

    .line 24
    :pswitch_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v2, "The paused composition has already been applied"

    .line 27
    .line 28
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1

    .line 32
    :pswitch_1
    invoke-virtual {p0}, Li0/l1;->b()V

    .line 33
    .line 34
    .line 35
    sget-object v1, Li0/m1;->l:Li0/m1;

    .line 36
    .line 37
    sget-object v2, Li0/m1;->m:Li0/m1;

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-eq v3, v1, :cond_0

    .line 51
    .line 52
    new-instance v3, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v4, "Unexpected state change from: "

    .line 58
    .line 59
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v1, " to: "

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x2e

    .line 74
    .line 75
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, Li0/n1;->b(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string v2, "The paused composition has not completed yet"

    .line 89
    .line 90
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :pswitch_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    const-string v2, "The paused composition has been cancelled"

    .line 97
    .line 98
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v1

    .line 102
    :pswitch_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 103
    .line 104
    const-string v2, "The paused composition is invalid because of a previous exception"

    .line 105
    .line 106
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    :goto_0
    sget-object v2, Li0/m1;->g:Li0/m1;

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    throw v1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 5

    .line 1
    const-string v0, "PausedComposition:applyChanges"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Li0/l1;->g:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_1
    iget-object v2, p0, Li0/l1;->l:Li0/z1;

    .line 11
    .line 12
    iget-object v3, p0, Li0/l1;->f:Lx1/f2;

    .line 13
    .line 14
    iget-object v4, p0, Li0/l1;->k:Lb5/i;

    .line 15
    .line 16
    invoke-virtual {v2, v3, v4}, Li0/z1;->a(Lx1/f2;Lb5/i;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Li0/l1;->k:Lb5/i;

    .line 20
    .line 21
    invoke-virtual {v2}, Lb5/i;->c()V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Li0/l1;->k:Lb5/i;

    .line 25
    .line 26
    invoke-virtual {v2}, Lb5/i;->d()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 27
    .line 28
    .line 29
    :try_start_2
    iget-object v2, p0, Li0/l1;->k:Lb5/i;

    .line 30
    .line 31
    invoke-virtual {v2}, Lb5/i;->b()V

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, Li0/l1;->a:Li0/q;

    .line 35
    .line 36
    iput-object v1, v2, Li0/q;->w:Li0/l1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    .line 38
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception v1

    .line 46
    goto :goto_0

    .line 47
    :catchall_2
    move-exception v2

    .line 48
    :try_start_4
    iget-object v3, p0, Li0/l1;->k:Lb5/i;

    .line 49
    .line 50
    invoke-virtual {v3}, Lb5/i;->b()V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Li0/l1;->a:Li0/q;

    .line 54
    .line 55
    iput-object v1, v3, Li0/q;->w:Li0/l1;

    .line 56
    .line 57
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 58
    :goto_0
    :try_start_5
    monitor-exit v0

    .line 59
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 60
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Li0/l1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Li0/m1;

    .line 8
    .line 9
    sget-object v1, Li0/m1;->l:Li0/m1;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-ltz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final d()V
    .locals 4

    .line 1
    :cond_0
    iget-object v0, p0, Li0/l1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Li0/m1;->j:Li0/m1;

    .line 4
    .line 5
    sget-object v2, Li0/m1;->l:Li0/m1;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_2

    .line 23
    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "Unexpected state change from: "

    .line 27
    .line 28
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v1, " to: "

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x2e

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Li0/n1;->b(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-void
.end method

.method public final e(Li0/e2;)Z
    .locals 13

    .line 1
    sget-object v0, Li0/m1;->k:Li0/m1;

    .line 2
    .line 3
    iget-object v1, p0, Li0/l1;->h:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Li0/m1;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    sget-object v3, Li0/m1;->j:Li0/m1;

    .line 16
    .line 17
    iget-object v4, p0, Li0/l1;->a:Li0/q;

    .line 18
    .line 19
    iget-object v5, p0, Li0/l1;->b:Li0/o;

    .line 20
    .line 21
    const/16 v6, 0x2e

    .line 22
    .line 23
    const-string v7, " to: "

    .line 24
    .line 25
    const-string v8, "Unexpected state change from: "

    .line 26
    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    :try_start_1
    new-instance p1, Laf/d;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :catch_0
    move-exception p1

    .line 37
    goto/16 :goto_5

    .line 38
    .line 39
    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "The paused composition has been applied"

    .line 42
    .line 43
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1

    .line 47
    :pswitch_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "Pausable composition is complete and apply() should be applied"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :pswitch_2
    const-string p1, "Recursive call to resume()"

    .line 56
    .line 57
    invoke-static {p1}, Li0/m;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 58
    .line 59
    .line 60
    new-instance p1, Laf/d;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_0
    :pswitch_3
    invoke-virtual {v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-eq v2, v3, :cond_0

    .line 78
    .line 79
    new-instance v2, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v2}, Li0/n1;->b(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :goto_0
    iget-wide v9, p0, Li0/l1;->i:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 107
    .line 108
    :try_start_2
    invoke-static {}, Ls0/i;->c()J

    .line 109
    .line 110
    .line 111
    move-result-wide v11

    .line 112
    iput-wide v11, p0, Li0/l1;->i:J

    .line 113
    .line 114
    iget-object v2, p0, Li0/l1;->j:Lf/l0;

    .line 115
    .line 116
    invoke-virtual {v5, v4, p1, v2}, Li0/o;->n(Li0/q;Li0/e2;Lf/l0;)Lf/l0;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput-object p1, p0, Li0/l1;->j:Lf/l0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 121
    .line 122
    :try_start_3
    iput-wide v9, p0, Li0/l1;->i:J

    .line 123
    .line 124
    :cond_2
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eq p1, v0, :cond_2

    .line 136
    .line 137
    new-instance p1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {p1}, Li0/n1;->b(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :goto_1
    iget-object p1, p0, Li0/l1;->j:Lf/l0;

    .line 165
    .line 166
    invoke-virtual {p1}, Lf/l0;->g()Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_a

    .line 171
    .line 172
    invoke-virtual {p0}, Li0/l1;->d()V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_4

    .line 176
    .line 177
    :catchall_0
    move-exception p1

    .line 178
    iput-wide v9, p0, Li0/l1;->i:J

    .line 179
    .line 180
    :goto_2
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-nez v2, :cond_5

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    if-ne v2, v0, :cond_4

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, Li0/n1;->b(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    :cond_5
    throw p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 221
    :pswitch_4
    iget-object v0, p0, Li0/l1;->c:Li0/h0;

    .line 222
    .line 223
    iget-boolean v2, p0, Li0/l1;->e:Z

    .line 224
    .line 225
    if-eqz v2, :cond_6

    .line 226
    .line 227
    const/4 v9, 0x0

    .line 228
    :try_start_4
    iput v9, v0, Li0/h0;->z:I

    .line 229
    .line 230
    const/4 v9, 0x1

    .line 231
    iput-boolean v9, v0, Li0/h0;->y:Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 232
    .line 233
    :cond_6
    :try_start_5
    iget-object v9, p0, Li0/l1;->d:Lfg/p;

    .line 234
    .line 235
    invoke-virtual {v5, v4, p1, v9}, Li0/o;->b(Li0/q;Li0/e2;Lfg/p;)Lf/l0;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    iput-object p1, p0, Li0/l1;->j:Lf/l0;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 240
    .line 241
    if-eqz v2, :cond_7

    .line 242
    .line 243
    :try_start_6
    invoke-virtual {v0}, Li0/h0;->u()V

    .line 244
    .line 245
    .line 246
    :cond_7
    sget-object p1, Li0/m1;->i:Li0/m1;

    .line 247
    .line 248
    :cond_8
    invoke-virtual {v1, p1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_9

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_9
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    if-eq v0, p1, :cond_8

    .line 260
    .line 261
    new-instance v0, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {p1}, Li0/n1;->b(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    :goto_3
    iget-object p1, p0, Li0/l1;->j:Lf/l0;

    .line 289
    .line 290
    invoke-virtual {p1}, Lf/l0;->g()Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-eqz p1, :cond_a

    .line 295
    .line 296
    invoke-virtual {p0}, Li0/l1;->d()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 297
    .line 298
    .line 299
    :cond_a
    :goto_4
    invoke-virtual {p0}, Li0/l1;->c()Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    return p1

    .line 304
    :catchall_1
    move-exception p1

    .line 305
    if-eqz v2, :cond_b

    .line 306
    .line 307
    :try_start_7
    invoke-virtual {v0}, Li0/h0;->u()V

    .line 308
    .line 309
    .line 310
    :cond_b
    throw p1

    .line 311
    :pswitch_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 312
    .line 313
    const-string v0, "The paused composition has been cancelled"

    .line 314
    .line 315
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw p1

    .line 319
    :pswitch_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 320
    .line 321
    const-string v0, "The paused composition is invalid because of a previous exception"

    .line 322
    .line 323
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    throw p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 327
    :goto_5
    sget-object v0, Li0/m1;->g:Li0/m1;

    .line 328
    .line 329
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    throw p1

    .line 333
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
