.class public final Ls8;
.super Lxg;

# interfaces
.implements Lvd;
.implements Lre;


# static fields
.field public static final f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _decisionAndIndex:I

.field private volatile _parentHandle:Ljava/lang/Object;

.field private volatile _state:Ljava/lang/Object;

.field public final d:Lvd;

.field public final e:Lhe;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "_decisionAndIndex"

    .line 2
    .line 3
    const-class v1, Ls8;

    .line 4
    .line 5
    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Ls8;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 10
    .line 11
    const-string v0, "_state"

    .line 12
    .line 13
    const-class v2, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Ls8;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 20
    .line 21
    const-string v0, "_parentHandle"

    .line 22
    .line 23
    invoke-static {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Ls8;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lvd;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lxg;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Ls8;->d:Lvd;

    .line 6
    .line 7
    invoke-interface {p1}, Lvd;->d()Lhe;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Ls8;->e:Lhe;

    .line 12
    .line 13
    const p1, 0x1fffffff

    .line 14
    .line 15
    .line 16
    iput p1, p0, Ls8;->_decisionAndIndex:I

    .line 17
    .line 18
    sget-object p1, Lo1;->a:Lo1;

    .line 19
    .line 20
    iput-object p1, p0, Ls8;->_state:Ljava/lang/Object;

    .line 21
    .line 22
    return-void
.end method

.method public static p(Lch;Ljava/lang/Object;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "It\'s prohibited to register multiple handlers, tried to register "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ", already has "

    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public static r(Ls8;Ljava/lang/Object;I)V
    .locals 6

    .line 1
    :goto_0
    sget-object v0, Ls8;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, Lww;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eqz v2, :cond_9

    .line 11
    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lww;

    .line 14
    .line 15
    instance-of v4, p1, Lwb;

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    :cond_0
    :goto_1
    move-object v2, p1

    .line 20
    goto :goto_3

    .line 21
    :cond_1
    if-eq p2, v3, :cond_2

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    if-ne p2, v3, :cond_0

    .line 25
    .line 26
    :cond_2
    instance-of v3, v2, Lch;

    .line 27
    .line 28
    if-nez v3, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    new-instance v3, Lub;

    .line 32
    .line 33
    instance-of v4, v2, Lch;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    check-cast v2, Lch;

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_4
    move-object v2, v5

    .line 42
    :goto_2
    const/16 v4, 0x10

    .line 43
    .line 44
    invoke-direct {v3, p1, v2, v5, v4}, Lub;-><init>(Ljava/lang/Object;Lch;Ljava/util/concurrent/CancellationException;I)V

    .line 45
    .line 46
    .line 47
    move-object v2, v3

    .line 48
    :cond_5
    :goto_3
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_8

    .line 53
    .line 54
    invoke-virtual {p0}, Ls8;->o()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_7

    .line 59
    .line 60
    sget-object p1, Ls8;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 61
    .line 62
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lbh;

    .line 67
    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_6
    invoke-interface {v0}, Lbh;->b()V

    .line 72
    .line 73
    .line 74
    sget-object v0, Lvw;->a:Lvw;

    .line 75
    .line 76
    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_7
    :goto_4
    invoke-virtual {p0, p2}, Ls8;->l(I)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eq v3, v1, :cond_5

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    instance-of p0, v1, Lv8;

    .line 91
    .line 92
    if-eqz p0, :cond_a

    .line 93
    .line 94
    check-cast v1, Lv8;

    .line 95
    .line 96
    sget-object p0, Lv8;->c:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 97
    .line 98
    const/4 p2, 0x0

    .line 99
    invoke-virtual {p0, v1, p2, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_a

    .line 104
    .line 105
    return-void

    .line 106
    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 107
    .line 108
    new-instance p2, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v0, "Already resumed, but proposed with update "

    .line 111
    .line 112
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/concurrent/CancellationException;)V
    .locals 4

    .line 1
    :goto_0
    sget-object p1, Ls8;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lww;

    .line 8
    .line 9
    if-nez v1, :cond_9

    .line 10
    .line 11
    instance-of v1, v0, Lwb;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    instance-of v1, v0, Lub;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_5

    .line 20
    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Lub;

    .line 23
    .line 24
    iget-object v3, v1, Lub;->e:Ljava/lang/Throwable;

    .line 25
    .line 26
    if-nez v3, :cond_4

    .line 27
    .line 28
    const/16 v3, 0xf

    .line 29
    .line 30
    invoke-static {v1, v2, p2, v3}, Lub;->a(Lub;Lch;Ljava/util/concurrent/CancellationException;I)Lub;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    invoke-virtual {p1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    iget-object p1, v1, Lub;->b:Lch;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, Ls8;->j(Lch;Ljava/lang/Throwable;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget-object p1, v1, Lub;->c:Lum;

    .line 48
    .line 49
    if-eqz p1, :cond_7

    .line 50
    .line 51
    :try_start_0
    invoke-interface {p1, p2}, Lum;->f(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    new-instance p2, Lyb;

    .line 57
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v1, "Exception in resume onCancellation handler for "

    .line 61
    .line 62
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Ls8;->e:Lhe;

    .line 76
    .line 77
    invoke-static {p1, p2}, Lg80;->q(Lhe;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    return-void

    .line 81
    :cond_3
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-eq v3, v0, :cond_1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 89
    .line 90
    const-string p2, "Must be called at most once"

    .line 91
    .line 92
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_5
    new-instance v1, Lub;

    .line 97
    .line 98
    const/16 v3, 0xe

    .line 99
    .line 100
    invoke-direct {v1, v0, v2, p2, v3}, Lub;-><init>(Ljava/lang/Object;Lch;Ljava/util/concurrent/CancellationException;I)V

    .line 101
    .line 102
    .line 103
    :cond_6
    invoke-virtual {p1, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_8

    .line 108
    .line 109
    :cond_7
    :goto_2
    return-void

    .line 110
    :cond_8
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-eq v2, v0, :cond_6

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 118
    .line 119
    const-string p2, "Not completed"

    .line 120
    .line 121
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p1
.end method

.method public final b()Lvd;
    .locals 1

    .line 1
    iget-object v0, p0, Ls8;->d:Lvd;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lre;
    .locals 2

    .line 1
    iget-object v0, p0, Ls8;->d:Lvd;

    .line 2
    .line 3
    instance-of v1, v0, Lre;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lre;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final d()Lhe;
    .locals 1

    .line 1
    iget-object v0, p0, Ls8;->e:Lhe;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Throwable;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lxg;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return-object p1
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lm10;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lwb;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {p1, v0, v1}, Lwb;-><init>(Ljava/lang/Throwable;Z)V

    .line 12
    .line 13
    .line 14
    :goto_0
    iget v0, p0, Lxg;->c:I

    .line 15
    .line 16
    invoke-static {p0, p1, v0}, Ls8;->r(Ls8;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lub;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lub;

    .line 6
    .line 7
    iget-object p1, p1, Lub;->a:Ljava/lang/Object;

    .line 8
    .line 9
    :cond_0
    return-object p1
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Ls8;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final j(Lch;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Lch;->a(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    new-instance p2, Lyb;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Exception in invokeOnCancellation handler for "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Ls8;->e:Lhe;

    .line 26
    .line 27
    invoke-static {p1, p2}, Lg80;->q(Lhe;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final k(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    :goto_0
    sget-object v0, Ls8;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    instance-of v2, v1, Lww;

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v2, Lv8;

    .line 13
    .line 14
    instance-of v3, v1, Lch;

    .line 15
    .line 16
    invoke-direct {v2, p0, p1, v3}, Lv8;-><init>(Ls8;Ljava/lang/Throwable;Z)V

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_5

    .line 24
    .line 25
    move-object v0, v1

    .line 26
    check-cast v0, Lww;

    .line 27
    .line 28
    instance-of v0, v0, Lch;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    check-cast v1, Lch;

    .line 33
    .line 34
    invoke-virtual {p0, v1, p1}, Ls8;->j(Lch;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Ls8;->o()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_4

    .line 42
    .line 43
    sget-object p1, Ls8;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 44
    .line 45
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lbh;

    .line 50
    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-interface {v0}, Lbh;->b()V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lvw;->a:Lvw;

    .line 58
    .line 59
    invoke-virtual {p1, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    :goto_1
    iget p1, p0, Lxg;->c:I

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ls8;->l(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_5
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eq v3, v1, :cond_1

    .line 73
    .line 74
    goto :goto_0
.end method

.method public final l(I)V
    .locals 6

    .line 1
    :cond_0
    sget-object v0, Ls8;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    shr-int/lit8 v2, v1, 0x1d

    .line 8
    .line 9
    if-eqz v2, :cond_c

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    if-ne v2, v0, :cond_b

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    const/4 v2, 0x0

    .line 16
    if-ne p1, v1, :cond_1

    .line 17
    .line 18
    move v1, v0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v1, v2

    .line 21
    :goto_0
    iget-object v3, p0, Ls8;->d:Lvd;

    .line 22
    .line 23
    if-nez v1, :cond_a

    .line 24
    .line 25
    instance-of v4, v3, Lvg;

    .line 26
    .line 27
    if-eqz v4, :cond_a

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    if-eq p1, v0, :cond_3

    .line 31
    .line 32
    if-ne p1, v4, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    move p1, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    move p1, v0

    .line 38
    :goto_2
    iget v5, p0, Lxg;->c:I

    .line 39
    .line 40
    if-eq v5, v0, :cond_4

    .line 41
    .line 42
    if-ne v5, v4, :cond_5

    .line 43
    .line 44
    :cond_4
    move v2, v0

    .line 45
    :cond_5
    if-ne p1, v2, :cond_a

    .line 46
    .line 47
    move-object p1, v3

    .line 48
    check-cast p1, Lvg;

    .line 49
    .line 50
    iget-object v1, p1, Lvg;->d:Lle;

    .line 51
    .line 52
    iget-object p1, p1, Lvg;->e:Lt50;

    .line 53
    .line 54
    iget-object p1, p1, Lt50;->b:Lhe;

    .line 55
    .line 56
    invoke-static {p1}, Lmp;->d(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lle;->e()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_6

    .line 64
    .line 65
    invoke-virtual {v1, p1, p0}, Lle;->d(Lhe;Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_6
    invoke-static {}, Lz60;->a()Lmj;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iget-wide v1, p1, Lmj;->c:J

    .line 74
    .line 75
    const-wide v4, 0x100000000L

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    cmp-long v1, v1, v4

    .line 81
    .line 82
    if-ltz v1, :cond_8

    .line 83
    .line 84
    iget-object v0, p1, Lmj;->e:Lk6;

    .line 85
    .line 86
    if-nez v0, :cond_7

    .line 87
    .line 88
    new-instance v0, Lk6;

    .line 89
    .line 90
    invoke-direct {v0}, Lk6;-><init>()V

    .line 91
    .line 92
    .line 93
    iput-object v0, p1, Lmj;->e:Lk6;

    .line 94
    .line 95
    :cond_7
    invoke-virtual {v0, p0}, Lk6;->addLast(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_8
    invoke-virtual {p1, v0}, Lmj;->k(Z)V

    .line 100
    .line 101
    .line 102
    :try_start_0
    invoke-static {p0, v3, v0}, Lgf;->S(Ls8;Lvd;Z)V

    .line 103
    .line 104
    .line 105
    :cond_9
    invoke-virtual {p1}, Lmj;->l()Z

    .line 106
    .line 107
    .line 108
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    if-nez v0, :cond_9

    .line 110
    .line 111
    :goto_3
    invoke-virtual {p1}, Lmj;->f()V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    const/4 v1, 0x0

    .line 117
    :try_start_1
    invoke-virtual {p0, v0, v1}, Lxg;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 118
    .line 119
    .line 120
    goto :goto_3

    .line 121
    :catchall_1
    move-exception v0

    .line 122
    invoke-virtual {p1}, Lmj;->f()V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_a
    invoke-static {p0, v3, v1}, Lgf;->S(Ls8;Lvd;Z)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    const-string v0, "Already resumed"

    .line 133
    .line 134
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_c
    const v2, 0x1fffffff

    .line 139
    .line 140
    .line 141
    and-int/2addr v2, v1

    .line 142
    const/high16 v3, 0x40000000    # 2.0f

    .line 143
    .line 144
    add-int/2addr v3, v2

    .line 145
    invoke-virtual {v0, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_0

    .line 150
    .line 151
    :goto_4
    return-void
.end method

.method public final m()Lbh;
    .locals 4

    .line 1
    iget-object v0, p0, Ls8;->e:Lhe;

    .line 2
    .line 3
    sget-object v1, Lxh;->h:Lxh;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lhe;->b(Lge;)Lfe;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lqp;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_0
    new-instance v2, Lka;

    .line 16
    .line 17
    invoke-direct {v2, p0}, Lka;-><init>(Ls8;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    invoke-static {v0, v2, v3}, Lg80;->r(Lqp;Lwp;I)Lbh;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    sget-object v2, Ls8;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 26
    .line 27
    invoke-virtual {v2, p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    :goto_0
    return-object v0
.end method

.method public final n(Lum;)V
    .locals 6

    .line 1
    instance-of v0, p1, Lch;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lch;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lch;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1, p1}, Lch;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v0

    .line 15
    :goto_0
    sget-object v0, Ls8;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    instance-of v2, v1, Lo1;

    .line 22
    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    :cond_1
    invoke-virtual {v0, p0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    instance-of v2, v1, Lch;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-nez v2, :cond_e

    .line 43
    .line 44
    instance-of v2, v1, Lwb;

    .line 45
    .line 46
    if-eqz v2, :cond_5

    .line 47
    .line 48
    move-object v0, v1

    .line 49
    check-cast v0, Lwb;

    .line 50
    .line 51
    sget-object v2, Lwb;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    const/4 v5, 0x1

    .line 55
    invoke-virtual {v2, v0, v4, v5}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    instance-of v1, v1, Lv8;

    .line 62
    .line 63
    if-eqz v1, :cond_c

    .line 64
    .line 65
    iget-object v0, v0, Lwb;->a:Ljava/lang/Throwable;

    .line 66
    .line 67
    invoke-virtual {p0, p1, v0}, Ls8;->j(Lch;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_4
    invoke-static {p1, v1}, Ls8;->p(Lch;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    throw v3

    .line 75
    :cond_5
    instance-of v2, v1, Lub;

    .line 76
    .line 77
    if-eqz v2, :cond_a

    .line 78
    .line 79
    move-object v2, v1

    .line 80
    check-cast v2, Lub;

    .line 81
    .line 82
    iget-object v4, v2, Lub;->b:Lch;

    .line 83
    .line 84
    if-nez v4, :cond_9

    .line 85
    .line 86
    iget-object v4, v2, Lub;->e:Ljava/lang/Throwable;

    .line 87
    .line 88
    if-eqz v4, :cond_6

    .line 89
    .line 90
    invoke-virtual {p0, p1, v4}, Ls8;->j(Lch;Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_6
    const/16 v4, 0x1d

    .line 95
    .line 96
    invoke-static {v2, p1, v3, v4}, Lub;->a(Lub;Lch;Ljava/util/concurrent/CancellationException;I)Lub;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_7
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_8

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_8
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-eq v3, v1, :cond_7

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_9
    invoke-static {p1, v1}, Ls8;->p(Lch;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    throw v3

    .line 118
    :cond_a
    new-instance v2, Lub;

    .line 119
    .line 120
    const/16 v4, 0x1c

    .line 121
    .line 122
    invoke-direct {v2, v1, p1, v3, v4}, Lub;-><init>(Ljava/lang/Object;Lch;Ljava/util/concurrent/CancellationException;I)V

    .line 123
    .line 124
    .line 125
    :cond_b
    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_d

    .line 130
    .line 131
    :cond_c
    :goto_1
    return-void

    .line 132
    :cond_d
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    if-eq v3, v1, :cond_b

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_e
    invoke-static {p1, v1}, Ls8;->p(Lch;Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    throw v3
.end method

.method public final o()Z
    .locals 2

    .line 1
    iget v0, p0, Lxg;->c:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"

    .line 7
    .line 8
    iget-object v1, p0, Ls8;->d:Lvd;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lmp;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    check-cast v1, Lvg;

    .line 14
    .line 15
    sget-object v0, Lvg;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public final q()V
    .locals 5

    .line 1
    iget-object v0, p0, Ls8;->d:Lvd;

    .line 2
    .line 3
    instance-of v1, v0, Lvg;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lvg;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    :goto_0
    if-eqz v0, :cond_9

    .line 13
    .line 14
    sget-object v1, Lvg;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    sget-object v4, Lg80;->e:Ll0;

    .line 21
    .line 22
    if-ne v3, v4, :cond_3

    .line 23
    .line 24
    :cond_1
    invoke-virtual {v1, v0, v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    if-eq v3, v4, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    instance-of v4, v3, Ljava/lang/Throwable;

    .line 39
    .line 40
    if-eqz v4, :cond_8

    .line 41
    .line 42
    :goto_2
    invoke-virtual {v1, v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_6

    .line 47
    .line 48
    move-object v2, v3

    .line 49
    check-cast v2, Ljava/lang/Throwable;

    .line 50
    .line 51
    :goto_3
    if-nez v2, :cond_4

    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_4
    sget-object v0, Ls8;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lbh;

    .line 61
    .line 62
    if-nez v1, :cond_5

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_5
    invoke-interface {v1}, Lbh;->b()V

    .line 66
    .line 67
    .line 68
    sget-object v1, Lvw;->a:Lvw;

    .line 69
    .line 70
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :goto_4
    invoke-virtual {p0, v2}, Ls8;->k(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_6
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-ne v4, v3, :cond_7

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 85
    .line 86
    const-string v1, "Failed requirement."

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v2, "Inconsistent state "

    .line 97
    .line 98
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :cond_9
    :goto_5
    return-void
.end method

.method public final s(Lle;)V
    .locals 4

    .line 1
    sget-object v0, Lxh;->n:Lxh;

    .line 2
    .line 3
    iget-object v1, p0, Ls8;->d:Lvd;

    .line 4
    .line 5
    instance-of v2, v1, Lvg;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    check-cast v1, Lvg;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v3

    .line 14
    :goto_0
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v3, v1, Lvg;->d:Lle;

    .line 17
    .line 18
    :cond_1
    if-ne v3, p1, :cond_2

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    goto :goto_1

    .line 22
    :cond_2
    iget p1, p0, Lxg;->c:I

    .line 23
    .line 24
    :goto_1
    invoke-static {p0, v0, p1}, Ls8;->r(Ls8;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CancellableContinuation("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ls8;->d:Lvd;

    .line 9
    .line 10
    invoke-static {v1}, Lgf;->Y(Lvd;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, "){"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    sget-object v1, Ls8;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    instance-of v2, v1, Lww;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const-string v1, "Active"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    instance-of v1, v1, Lv8;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    const-string v1, "Cancelled"

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const-string v1, "Completed"

    .line 43
    .line 44
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, "}@"

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lgf;->x(Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    return-object v0
.end method
