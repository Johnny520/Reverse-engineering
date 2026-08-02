.class public final Lw40;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lg40;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lth0;


# static fields
.field public static final O:Lmv1;


# instance fields
.field public A:Ln4;

.field public B:Ljava/util/function/Supplier;

.field public C:Ljava/lang/Thread;

.field public D:La51;

.field public E:La51;

.field public F:Ljava/lang/Object;

.field public G:Lf40;

.field public volatile H:Lh40;

.field public volatile I:Z

.field public volatile J:Z

.field public K:Z

.field public L:I

.field public M:I

.field public N:I

.field public final h:Lt40;

.field public final i:Ljava/util/ArrayList;

.field public final j:Lsu2;

.field public final k:Laf0;

.field public final l:La22;

.field public final m:Lb5;

.field public final n:Lv40;

.field public o:Lvp0;

.field public p:La51;

.field public q:Li32;

.field public r:Lgf0;

.field public s:I

.field public t:I

.field public u:Lb90;

.field public v:Lov1;

.field public w:Lff0;

.field public x:I

.field public y:J

.field public z:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lmv1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lmv1;->e:Li51;

    .line 5
    .line 6
    const-string v3, "glide_thread_priority_override"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lmv1;-><init>(Ljava/lang/String;Ljava/lang/Object;Llv1;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lw40;->O:Lmv1;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Laf0;Lb5;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt40;

    .line 5
    .line 6
    invoke-direct {v0}, Lt40;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw40;->h:Lt40;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lw40;->i:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lsu2;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lw40;->j:Lsu2;

    .line 24
    .line 25
    new-instance v0, Lb5;

    .line 26
    .line 27
    const/4 v1, 0x6

    .line 28
    invoke-direct {v0, v1}, Lb5;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lw40;->m:Lb5;

    .line 32
    .line 33
    new-instance v0, Lv40;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lw40;->n:Lv40;

    .line 39
    .line 40
    iput-object p1, p0, Lw40;->k:Laf0;

    .line 41
    .line 42
    iput-object p2, p0, Lw40;->l:La22;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(La51;Ljava/lang/Object;Lf40;ILa51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw40;->D:La51;

    .line 2
    .line 3
    iput-object p2, p0, Lw40;->F:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lw40;->G:Lf40;

    .line 6
    .line 7
    iput p4, p0, Lw40;->N:I

    .line 8
    .line 9
    iput-object p5, p0, Lw40;->E:La51;

    .line 10
    .line 11
    iget-object p2, p0, Lw40;->h:Lt40;

    .line 12
    .line 13
    invoke-virtual {p2}, Lt40;->a()Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eq p1, p2, :cond_0

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    :cond_0
    iput-boolean p3, p0, Lw40;->K:Z

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p0, Lw40;->C:Ljava/lang/Thread;

    .line 32
    .line 33
    if-eq p1, p2, :cond_2

    .line 34
    .line 35
    const/4 p1, 0x3

    .line 36
    iput p1, p0, Lw40;->M:I

    .line 37
    .line 38
    iget-object p1, p0, Lw40;->w:Lff0;

    .line 39
    .line 40
    iget-boolean p2, p1, Lff0;->t:Z

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    iget-object p1, p1, Lff0;->p:Laq0;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object p1, p1, Lff0;->o:Laq0;

    .line 48
    .line 49
    :goto_0
    invoke-virtual {p1, p0}, Laq0;->execute(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    invoke-virtual {p0}, Lw40;->f()V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final b(La51;Ljava/lang/Exception;Lf40;I)V
    .locals 2

    .line 1
    invoke-interface {p3}, Lf40;->b()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxp0;

    .line 5
    .line 6
    const-string v1, "Fetching data failed"

    .line 7
    .line 8
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-direct {v0, v1, p2}, Lxp0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p3}, Lf40;->a()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p1, v0, Lxp0;->i:La51;

    .line 20
    .line 21
    iput p4, v0, Lxp0;->j:I

    .line 22
    .line 23
    iput-object p2, v0, Lxp0;->k:Ljava/lang/Class;

    .line 24
    .line 25
    iget-object p1, p0, Lw40;->i:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p2, p0, Lw40;->C:Ljava/lang/Thread;

    .line 35
    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x2

    .line 39
    iput p1, p0, Lw40;->M:I

    .line 40
    .line 41
    iget-object p1, p0, Lw40;->w:Lff0;

    .line 42
    .line 43
    iget-boolean p2, p1, Lff0;->t:Z

    .line 44
    .line 45
    if-eqz p2, :cond_0

    .line 46
    .line 47
    iget-object p1, p1, Lff0;->p:Laq0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object p1, p1, Lff0;->o:Laq0;

    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1, p0}, Laq0;->execute(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    invoke-virtual {p0}, Lw40;->m()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final c()Lsu2;
    .locals 0

    .line 1
    iget-object p0, p0, Lw40;->j:Lsu2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 1
    check-cast p1, Lw40;

    .line 2
    .line 3
    iget-object v0, p0, Lw40;->q:Li32;

    .line 4
    .line 5
    iget-object v1, p1, Lw40;->q:Li32;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Lw40;->x:I

    .line 14
    .line 15
    iget p1, p1, Lw40;->x:I

    .line 16
    .line 17
    sub-int/2addr p0, p1

    .line 18
    return p0

    .line 19
    :cond_0
    return v0
.end method

.method public final d(Lf40;Ljava/lang/Object;I)Ld92;
    .locals 5

    .line 1
    const-string v0, "Decoded result "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    invoke-interface {p1}, Lf40;->b()V

    .line 7
    .line 8
    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_0
    sget v2, Ltc1;->b:I

    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-virtual {p0, p3, p2}, Lw40;->e(ILjava/lang/Object;)Ld92;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    const-string p3, "DecodeJob"

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    invoke-static {p3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    new-instance p3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-virtual {p0, p3, v2, v3, v1}, Lw40;->i(Ljava/lang/String;JLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    :goto_0
    invoke-interface {p1}, Lf40;->b()V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :goto_1
    invoke-interface {p1}, Lf40;->b()V

    .line 52
    .line 53
    .line 54
    throw p0
.end method

.method public final e(ILjava/lang/Object;)Ld92;
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lw40;->h:Lt40;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lt40;->c(Ljava/lang/Class;)Lwb1;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v0, p0, Lw40;->v:Lov1;

    .line 12
    .line 13
    const/4 v3, 0x4

    .line 14
    if-eq p1, v3, :cond_1

    .line 15
    .line 16
    iget-boolean v1, v1, Lt40;->r:Z

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 24
    :goto_1
    sget-object v4, Lxa0;->i:Lmv1;

    .line 25
    .line 26
    invoke-virtual {v0, v4}, Lov1;->c(Lmv1;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ljava/lang/Boolean;

    .line 31
    .line 32
    if-eqz v5, :cond_3

    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_2

    .line 39
    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    :cond_2
    :goto_2
    move-object v7, v0

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    new-instance v0, Lov1;

    .line 45
    .line 46
    invoke-direct {v0}, Lov1;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v5, p0, Lw40;->v:Lov1;

    .line 50
    .line 51
    iget-object v5, v5, Lov1;->b:Lro;

    .line 52
    .line 53
    iget-object v6, v0, Lov1;->b:Lro;

    .line 54
    .line 55
    invoke-virtual {v6, v5}, Lro;->g(Lro;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v6, v4, v1}, Lro;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :goto_3
    iget-object v0, p0, Lw40;->o:Lvp0;

    .line 67
    .line 68
    invoke-virtual {v0}, Lvp0;->a()Lv72;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, p2}, Lv72;->g(Ljava/lang/Object;)Lk40;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    move p2, v3

    .line 77
    :try_start_0
    iget v3, p0, Lw40;->s:I

    .line 78
    .line 79
    iget v4, p0, Lw40;->t:I

    .line 80
    .line 81
    new-instance v5, Ldk;

    .line 82
    .line 83
    invoke-direct {v5, p1, p2, p0}, Ldk;-><init>(IILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {v2 .. v7}, Lwb1;->a(IILdk;Lk40;Lov1;)Ld92;

    .line 87
    .line 88
    .line 89
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    invoke-interface {v6}, Lk40;->b()V

    .line 91
    .line 92
    .line 93
    return-object p0

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    move-object p0, v0

    .line 96
    invoke-interface {v6}, Lk40;->b()V

    .line 97
    .line 98
    .line 99
    throw p0
.end method

.method public final f()V
    .locals 12

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "Retrieved data"

    .line 11
    .line 12
    iget-wide v2, p0, Lw40;->y:J

    .line 13
    .line 14
    new-instance v4, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v5, "data: "

    .line 17
    .line 18
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v5, p0, Lw40;->F:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v5, ", cache key: "

    .line 27
    .line 28
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v5, p0, Lw40;->D:La51;

    .line 32
    .line 33
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v5, ", fetcher: "

    .line 37
    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v5, p0, Lw40;->G:Lf40;

    .line 42
    .line 43
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p0, v0, v2, v3, v4}, Lw40;->i(Ljava/lang/String;JLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-object v0, p0, Lw40;->A:Ln4;

    .line 54
    .line 55
    const-class v2, Leu;

    .line 56
    .line 57
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    const/4 v2, 0x0

    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    iget-object v0, p0, Lw40;->B:Ljava/util/function/Supplier;

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v3, p0, Lw40;->B:Ljava/util/function/Supplier;

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-static {v0, v3}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :catch_0
    move-exception v0

    .line 99
    goto :goto_0

    .line 100
    :catch_1
    move-exception v0

    .line 101
    :goto_0
    iput-object v2, p0, Lw40;->B:Ljava/util/function/Supplier;

    .line 102
    .line 103
    const-string v3, "DecodeJob"

    .line 104
    .line 105
    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-eqz v1, :cond_1

    .line 110
    .line 111
    const-string v1, "DecodeJob"

    .line 112
    .line 113
    const-string v3, "Failed to set thread priority; using default priority for any subsequent jobs."

    .line 114
    .line 115
    invoke-static {v1, v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 116
    .line 117
    .line 118
    :cond_1
    :goto_1
    :try_start_1
    iget-object v0, p0, Lw40;->G:Lf40;

    .line 119
    .line 120
    iget-object v1, p0, Lw40;->F:Ljava/lang/Object;

    .line 121
    .line 122
    iget v3, p0, Lw40;->N:I

    .line 123
    .line 124
    invoke-virtual {p0, v0, v1, v3}, Lw40;->d(Lf40;Ljava/lang/Object;I)Ld92;

    .line 125
    .line 126
    .line 127
    move-result-object v0
    :try_end_1
    .catch Lxp0; {:try_start_1 .. :try_end_1} :catch_2

    .line 128
    goto :goto_2

    .line 129
    :catch_2
    move-exception v0

    .line 130
    iget-object v1, p0, Lw40;->E:La51;

    .line 131
    .line 132
    iget v3, p0, Lw40;->N:I

    .line 133
    .line 134
    iput-object v1, v0, Lxp0;->i:La51;

    .line 135
    .line 136
    iput v3, v0, Lxp0;->j:I

    .line 137
    .line 138
    iput-object v2, v0, Lxp0;->k:Ljava/lang/Class;

    .line 139
    .line 140
    iget-object v1, p0, Lw40;->i:Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-object v0, v2

    .line 146
    :goto_2
    if-eqz v0, :cond_d

    .line 147
    .line 148
    iget v1, p0, Lw40;->N:I

    .line 149
    .line 150
    instance-of v3, v0, Lfz0;

    .line 151
    .line 152
    if-eqz v3, :cond_2

    .line 153
    .line 154
    move-object v3, v0

    .line 155
    check-cast v3, Lfz0;

    .line 156
    .line 157
    invoke-interface {v3}, Lfz0;->a()V

    .line 158
    .line 159
    .line 160
    :cond_2
    iget-object v3, p0, Lw40;->m:Lb5;

    .line 161
    .line 162
    iget-object v3, v3, Lb5;->k:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v3, Lsc1;

    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    const/4 v5, 0x1

    .line 168
    if-eqz v3, :cond_3

    .line 169
    .line 170
    sget-object v2, Lsc1;->l:Lb5;

    .line 171
    .line 172
    invoke-virtual {v2}, Lb5;->c()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, Lsc1;

    .line 177
    .line 178
    iput-boolean v4, v2, Lsc1;->k:Z

    .line 179
    .line 180
    iput-boolean v5, v2, Lsc1;->j:Z

    .line 181
    .line 182
    iput-object v0, v2, Lsc1;->i:Ld92;

    .line 183
    .line 184
    move-object v0, v2

    .line 185
    :cond_3
    iget-object v3, p0, Lw40;->A:Ln4;

    .line 186
    .line 187
    const-class v6, Leu;

    .line 188
    .line 189
    iget-object v3, v3, Ln4;->i:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v3, Ljava/util/Map;

    .line 192
    .line 193
    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_4

    .line 198
    .line 199
    invoke-virtual {p0}, Lw40;->l()V

    .line 200
    .line 201
    .line 202
    :cond_4
    invoke-virtual {p0}, Lw40;->o()V

    .line 203
    .line 204
    .line 205
    iget-object v3, p0, Lw40;->w:Lff0;

    .line 206
    .line 207
    monitor-enter v3

    .line 208
    :try_start_2
    iput-object v0, v3, Lff0;->u:Ld92;

    .line 209
    .line 210
    iput v1, v3, Lff0;->v:I

    .line 211
    .line 212
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 213
    monitor-enter v3

    .line 214
    :try_start_3
    iget-object v0, v3, Lff0;->i:Lsu2;

    .line 215
    .line 216
    invoke-virtual {v0}, Lsu2;->a()V

    .line 217
    .line 218
    .line 219
    iget-boolean v0, v3, Lff0;->B:Z

    .line 220
    .line 221
    if-eqz v0, :cond_5

    .line 222
    .line 223
    iget-object v0, v3, Lff0;->u:Ld92;

    .line 224
    .line 225
    invoke-interface {v0}, Ld92;->e()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, Lff0;->f()V

    .line 229
    .line 230
    .line 231
    monitor-exit v3

    .line 232
    goto :goto_4

    .line 233
    :catchall_0
    move-exception v0

    .line 234
    move-object p0, v0

    .line 235
    goto/16 :goto_7

    .line 236
    .line 237
    :cond_5
    iget-object v0, v3, Lff0;->h:Lef0;

    .line 238
    .line 239
    iget-object v0, v0, Lef0;->h:Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_c

    .line 246
    .line 247
    iget-boolean v0, v3, Lff0;->w:Z

    .line 248
    .line 249
    if-nez v0, :cond_b

    .line 250
    .line 251
    iget-object v0, v3, Lff0;->l:Lz8;

    .line 252
    .line 253
    iget-object v7, v3, Lff0;->u:Ld92;

    .line 254
    .line 255
    iget-boolean v8, v3, Lff0;->s:Z

    .line 256
    .line 257
    iget-object v10, v3, Lff0;->r:Lgf0;

    .line 258
    .line 259
    iget-object v11, v3, Lff0;->j:Lbf0;

    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    new-instance v6, Lhf0;

    .line 265
    .line 266
    const/4 v9, 0x1

    .line 267
    invoke-direct/range {v6 .. v11}, Lhf0;-><init>(Ld92;ZZLa51;Lbf0;)V

    .line 268
    .line 269
    .line 270
    iput-object v6, v3, Lff0;->z:Lhf0;

    .line 271
    .line 272
    iput-boolean v5, v3, Lff0;->w:Z

    .line 273
    .line 274
    iget-object v0, v3, Lff0;->h:Lef0;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    new-instance v1, Ljava/util/ArrayList;

    .line 280
    .line 281
    iget-object v0, v0, Lef0;->h:Ljava/util/ArrayList;

    .line 282
    .line 283
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    add-int/2addr v0, v5

    .line 291
    invoke-virtual {v3, v0}, Lff0;->d(I)V

    .line 292
    .line 293
    .line 294
    iget-object v0, v3, Lff0;->r:Lgf0;

    .line 295
    .line 296
    iget-object v6, v3, Lff0;->z:Lhf0;

    .line 297
    .line 298
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 299
    iget-object v7, v3, Lff0;->m:Lbf0;

    .line 300
    .line 301
    invoke-virtual {v7, v3, v0, v6}, Lbf0;->e(Lff0;Lgf0;Lhf0;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    if-eqz v1, :cond_6

    .line 313
    .line 314
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, Ldf0;

    .line 319
    .line 320
    iget-object v6, v1, Ldf0;->b:Ljava/util/concurrent/Executor;

    .line 321
    .line 322
    new-instance v7, Lcf0;

    .line 323
    .line 324
    iget-object v1, v1, Ldf0;->a:Lyq2;

    .line 325
    .line 326
    invoke-direct {v7, v3, v1, v5}, Lcf0;-><init>(Lff0;Lyq2;I)V

    .line 327
    .line 328
    .line 329
    invoke-interface {v6, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 330
    .line 331
    .line 332
    goto :goto_3

    .line 333
    :cond_6
    invoke-virtual {v3}, Lff0;->b()V

    .line 334
    .line 335
    .line 336
    :goto_4
    const/4 v0, 0x5

    .line 337
    iput v0, p0, Lw40;->L:I

    .line 338
    .line 339
    :try_start_4
    iget-object v1, p0, Lw40;->m:Lb5;

    .line 340
    .line 341
    iget-object v3, v1, Lb5;->k:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v3, Lsc1;

    .line 344
    .line 345
    if-eqz v3, :cond_7

    .line 346
    .line 347
    move v4, v5

    .line 348
    :cond_7
    if-eqz v4, :cond_8

    .line 349
    .line 350
    iget-object v3, p0, Lw40;->k:Laf0;

    .line 351
    .line 352
    iget-object v4, p0, Lw40;->v:Lov1;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 353
    .line 354
    :try_start_5
    invoke-virtual {v3}, Laf0;->a()La90;

    .line 355
    .line 356
    .line 357
    move-result-object v3

    .line 358
    iget-object v6, v1, Lb5;->i:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v6, La51;

    .line 361
    .line 362
    new-instance v7, Lb5;

    .line 363
    .line 364
    iget-object v8, v1, Lb5;->j:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v8, Lj92;

    .line 367
    .line 368
    iget-object v9, v1, Lb5;->k:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v9, Lsc1;

    .line 371
    .line 372
    invoke-direct {v7, v8, v9, v4, v0}, Lb5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v3, v6, v7}, La90;->j(La51;Lb5;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 376
    .line 377
    .line 378
    :try_start_6
    iget-object v0, v1, Lb5;->k:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Lsc1;

    .line 381
    .line 382
    invoke-virtual {v0}, Lsc1;->a()V

    .line 383
    .line 384
    .line 385
    goto :goto_5

    .line 386
    :catchall_1
    move-exception v0

    .line 387
    move-object p0, v0

    .line 388
    iget-object v0, v1, Lb5;->k:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, Lsc1;

    .line 391
    .line 392
    invoke-virtual {v0}, Lsc1;->a()V

    .line 393
    .line 394
    .line 395
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 396
    :catchall_2
    move-exception v0

    .line 397
    move-object p0, v0

    .line 398
    goto :goto_6

    .line 399
    :cond_8
    :goto_5
    if-eqz v2, :cond_9

    .line 400
    .line 401
    invoke-virtual {v2}, Lsc1;->a()V

    .line 402
    .line 403
    .line 404
    :cond_9
    iget-object v1, p0, Lw40;->n:Lv40;

    .line 405
    .line 406
    monitor-enter v1

    .line 407
    :try_start_7
    iput-boolean v5, v1, Lv40;->b:Z

    .line 408
    .line 409
    invoke-virtual {v1}, Lv40;->a()Z

    .line 410
    .line 411
    .line 412
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 413
    monitor-exit v1

    .line 414
    if-eqz v0, :cond_e

    .line 415
    .line 416
    invoke-virtual {p0}, Lw40;->k()V

    .line 417
    .line 418
    .line 419
    goto :goto_8

    .line 420
    :catchall_3
    move-exception v0

    .line 421
    move-object p0, v0

    .line 422
    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 423
    throw p0

    .line 424
    :goto_6
    if-eqz v2, :cond_a

    .line 425
    .line 426
    invoke-virtual {v2}, Lsc1;->a()V

    .line 427
    .line 428
    .line 429
    :cond_a
    throw p0

    .line 430
    :cond_b
    :try_start_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 431
    .line 432
    const-string v0, "Already have resource"

    .line 433
    .line 434
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    throw p0

    .line 438
    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 439
    .line 440
    const-string v0, "Received a resource without any callbacks to notify"

    .line 441
    .line 442
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw p0

    .line 446
    :goto_7
    monitor-exit v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 447
    throw p0

    .line 448
    :catchall_4
    move-exception v0

    .line 449
    move-object p0, v0

    .line 450
    :try_start_a
    monitor-exit v3
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 451
    throw p0

    .line 452
    :cond_d
    invoke-virtual {p0}, Lw40;->m()V

    .line 453
    .line 454
    .line 455
    :cond_e
    :goto_8
    return-void
.end method

.method public final g()Lh40;
    .locals 3

    .line 1
    iget v0, p0, Lw40;->L:I

    .line 2
    .line 3
    invoke-static {v0}, Lvi0;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lw40;->h:Lt40;

    .line 9
    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    const/4 v2, 0x0

    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    iget p0, p0, Lw40;->L:I

    .line 24
    .line 25
    invoke-static {p0}, Lvi0;->w(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "Unrecognized stage: "

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_1
    new-instance v0, Lit2;

    .line 40
    .line 41
    invoke-direct {v0, v2, p0}, Lit2;-><init>(Lt40;Lw40;)V

    .line 42
    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    new-instance v0, Lc40;

    .line 46
    .line 47
    invoke-virtual {v2}, Lt40;->a()Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-direct {v0, v1, v2, p0}, Lc40;-><init>(Ljava/util/List;Lt40;Lg40;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    new-instance v0, Le92;

    .line 56
    .line 57
    invoke-direct {v0, v2, p0}, Le92;-><init>(Lt40;Lw40;)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final h(I)I
    .locals 5

    .line 1
    invoke-static {p1}, Lvi0;->u(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x2

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    const/4 v4, 0x3

    .line 11
    if-eq v0, v2, :cond_3

    .line 12
    .line 13
    if-eq v0, v3, :cond_2

    .line 14
    .line 15
    if-eq v0, v4, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x5

    .line 18
    if-ne v0, p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p1}, Lvi0;->w(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "Unrecognized stage: "

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x6

    .line 36
    return p0

    .line 37
    :cond_2
    const/4 p0, 0x4

    .line 38
    return p0

    .line 39
    :cond_3
    iget-object p1, p0, Lw40;->u:Lb90;

    .line 40
    .line 41
    iget p1, p1, Lb90;->a:I

    .line 42
    .line 43
    packed-switch p1, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    :pswitch_0
    move v1, v2

    .line 47
    :pswitch_1
    if-eqz v1, :cond_4

    .line 48
    .line 49
    return v4

    .line 50
    :cond_4
    invoke-virtual {p0, v4}, Lw40;->h(I)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_5
    iget-object p1, p0, Lw40;->u:Lb90;

    .line 56
    .line 57
    iget p1, p1, Lb90;->a:I

    .line 58
    .line 59
    packed-switch p1, :pswitch_data_1

    .line 60
    .line 61
    .line 62
    move v1, v2

    .line 63
    :pswitch_2
    if-eqz v1, :cond_6

    .line 64
    .line 65
    return v3

    .line 66
    :cond_6
    invoke-virtual {p0, v3}, Lw40;->h(I)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    return p0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final i(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    const-string p1, " in "

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-static {p2, p3}, Ltc1;->a(J)D

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, ", load key: "

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lw40;->r:Lgf0;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    if-eqz p4, :cond_0

    .line 32
    .line 33
    const-string p0, ", "

    .line 34
    .line 35
    invoke-virtual {p0, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string p0, ""

    .line 41
    .line 42
    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, ", thread: "

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string p1, "DecodeJob"

    .line 66
    .line 67
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final j()V
    .locals 7

    .line 1
    iget-object v0, p0, Lw40;->A:Ln4;

    .line 2
    .line 3
    const-class v1, Leu;

    .line 4
    .line 5
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lw40;->l()V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Lw40;->o()V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lxp0;

    .line 22
    .line 23
    const-string v1, "Failed to load resource"

    .line 24
    .line 25
    new-instance v2, Ljava/util/ArrayList;

    .line 26
    .line 27
    iget-object v3, p0, Lw40;->i:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1, v2}, Lxp0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lw40;->w:Lff0;

    .line 36
    .line 37
    monitor-enter v1

    .line 38
    :try_start_0
    iput-object v0, v1, Lff0;->x:Lxp0;

    .line 39
    .line 40
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 41
    monitor-enter v1

    .line 42
    :try_start_1
    iget-object v0, v1, Lff0;->i:Lsu2;

    .line 43
    .line 44
    invoke-virtual {v0}, Lsu2;->a()V

    .line 45
    .line 46
    .line 47
    iget-boolean v0, v1, Lff0;->B:Z

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {v1}, Lff0;->f()V

    .line 53
    .line 54
    .line 55
    monitor-exit v1

    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    iget-object v0, v1, Lff0;->h:Lef0;

    .line 60
    .line 61
    iget-object v0, v0, Lef0;->h:Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    iget-boolean v0, v1, Lff0;->y:Z

    .line 70
    .line 71
    if-nez v0, :cond_4

    .line 72
    .line 73
    iput-boolean v2, v1, Lff0;->y:Z

    .line 74
    .line 75
    iget-object v0, v1, Lff0;->r:Lgf0;

    .line 76
    .line 77
    iget-object v3, v1, Lff0;->h:Lef0;

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v4, Ljava/util/ArrayList;

    .line 83
    .line 84
    iget-object v3, v3, Lef0;->h:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    add-int/2addr v3, v2

    .line 94
    invoke-virtual {v1, v3}, Lff0;->d(I)V

    .line 95
    .line 96
    .line 97
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    iget-object v3, v1, Lff0;->m:Lbf0;

    .line 99
    .line 100
    const/4 v5, 0x0

    .line 101
    invoke-virtual {v3, v1, v0, v5}, Lbf0;->e(Lff0;Lgf0;Lhf0;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_2

    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Ldf0;

    .line 119
    .line 120
    iget-object v4, v3, Ldf0;->b:Ljava/util/concurrent/Executor;

    .line 121
    .line 122
    new-instance v5, Lcf0;

    .line 123
    .line 124
    iget-object v3, v3, Ldf0;->a:Lyq2;

    .line 125
    .line 126
    const/4 v6, 0x0

    .line 127
    invoke-direct {v5, v1, v3, v6}, Lcf0;-><init>(Lff0;Lyq2;I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    invoke-virtual {v1}, Lff0;->b()V

    .line 135
    .line 136
    .line 137
    :goto_1
    iget-object v0, p0, Lw40;->n:Lv40;

    .line 138
    .line 139
    monitor-enter v0

    .line 140
    :try_start_2
    iput-boolean v2, v0, Lv40;->c:Z

    .line 141
    .line 142
    invoke-virtual {v0}, Lv40;->a()Z

    .line 143
    .line 144
    .line 145
    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 146
    monitor-exit v0

    .line 147
    if-eqz v1, :cond_3

    .line 148
    .line 149
    invoke-virtual {p0}, Lw40;->k()V

    .line 150
    .line 151
    .line 152
    :cond_3
    return-void

    .line 153
    :catchall_1
    move-exception p0

    .line 154
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 155
    throw p0

    .line 156
    :cond_4
    :try_start_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 157
    .line 158
    const-string v0, "Already failed once"

    .line 159
    .line 160
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    const-string v0, "Received an exception without any callbacks to notify"

    .line 167
    .line 168
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p0

    .line 172
    :goto_2
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 173
    throw p0

    .line 174
    :catchall_2
    move-exception p0

    .line 175
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 176
    throw p0
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-object v0, p0, Lw40;->n:Lv40;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, v0, Lv40;->b:Z

    .line 6
    .line 7
    iput-boolean v1, v0, Lv40;->a:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lv40;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    iget-object v0, p0, Lw40;->m:Lb5;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    iput-object v2, v0, Lb5;->i:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v2, v0, Lb5;->j:Ljava/lang/Object;

    .line 18
    .line 19
    iput-object v2, v0, Lb5;->k:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Lw40;->h:Lt40;

    .line 22
    .line 23
    iput-object v2, v0, Lt40;->c:Lvp0;

    .line 24
    .line 25
    iput-object v2, v0, Lt40;->d:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v2, v0, Lt40;->n:La51;

    .line 28
    .line 29
    iput-object v2, v0, Lt40;->g:Ljava/lang/Class;

    .line 30
    .line 31
    iput-object v2, v0, Lt40;->k:Ljava/lang/Class;

    .line 32
    .line 33
    iput-object v2, v0, Lt40;->i:Lov1;

    .line 34
    .line 35
    iput-object v2, v0, Lt40;->o:Li32;

    .line 36
    .line 37
    iput-object v2, v0, Lt40;->j:Ljava/util/Map;

    .line 38
    .line 39
    iput-object v2, v0, Lt40;->p:Lb90;

    .line 40
    .line 41
    iget-object v3, v0, Lt40;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, v0, Lt40;->l:Z

    .line 47
    .line 48
    iget-object v3, v0, Lt40;->b:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 51
    .line 52
    .line 53
    iput-boolean v1, v0, Lt40;->m:Z

    .line 54
    .line 55
    iput-boolean v1, p0, Lw40;->I:Z

    .line 56
    .line 57
    iput-object v2, p0, Lw40;->o:Lvp0;

    .line 58
    .line 59
    iput-object v2, p0, Lw40;->p:La51;

    .line 60
    .line 61
    iput-object v2, p0, Lw40;->v:Lov1;

    .line 62
    .line 63
    iput-object v2, p0, Lw40;->q:Li32;

    .line 64
    .line 65
    iput-object v2, p0, Lw40;->r:Lgf0;

    .line 66
    .line 67
    iput-object v2, p0, Lw40;->w:Lff0;

    .line 68
    .line 69
    iput v1, p0, Lw40;->L:I

    .line 70
    .line 71
    iput-object v2, p0, Lw40;->H:Lh40;

    .line 72
    .line 73
    iput-object v2, p0, Lw40;->C:Ljava/lang/Thread;

    .line 74
    .line 75
    iput-object v2, p0, Lw40;->D:La51;

    .line 76
    .line 77
    iput-object v2, p0, Lw40;->F:Ljava/lang/Object;

    .line 78
    .line 79
    iput v1, p0, Lw40;->N:I

    .line 80
    .line 81
    iput-object v2, p0, Lw40;->G:Lf40;

    .line 82
    .line 83
    const-wide/16 v3, 0x0

    .line 84
    .line 85
    iput-wide v3, p0, Lw40;->y:J

    .line 86
    .line 87
    iput-boolean v1, p0, Lw40;->J:Z

    .line 88
    .line 89
    iput-object v2, p0, Lw40;->z:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v0, p0, Lw40;->i:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lw40;->l:La22;

    .line 97
    .line 98
    invoke-interface {v0, p0}, La22;->a(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :catchall_0
    move-exception p0

    .line 103
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 104
    throw p0
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw40;->A:Ln4;

    .line 2
    .line 3
    iget-object v0, v0, Ln4;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/Map;

    .line 6
    .line 7
    const-class v1, Leu;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lw40;->B:Ljava/util/function/Supplier;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v1, 0x9

    .line 30
    .line 31
    invoke-static {v0, v1}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_0

    .line 37
    :catch_1
    move-exception v0

    .line 38
    :goto_0
    const/4 v1, 0x0

    .line 39
    iput-object v1, p0, Lw40;->B:Ljava/util/function/Supplier;

    .line 40
    .line 41
    const/4 p0, 0x2

    .line 42
    const-string v1, "DecodeJob"

    .line 43
    .line 44
    invoke-static {v1, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    const-string p0, "Failed to set thread priority; using default priority for any subsequent jobs."

    .line 51
    .line 52
    invoke-static {v1, p0, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void

    .line 56
    :cond_1
    const-string p0, "OverrideGlideThreadPriority experiment is not enabled."

    .line 57
    .line 58
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final m()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lw40;->C:Ljava/lang/Thread;

    .line 6
    .line 7
    sget v0, Ltc1;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Lw40;->y:J

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    iget-boolean v1, p0, Lw40;->J:Z

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    iget-object v1, p0, Lw40;->H:Lh40;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lw40;->H:Lh40;

    .line 25
    .line 26
    invoke-interface {v0}, Lh40;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    iget v1, p0, Lw40;->L:I

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lw40;->h(I)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iput v1, p0, Lw40;->L:I

    .line 39
    .line 40
    invoke-virtual {p0}, Lw40;->g()Lh40;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, p0, Lw40;->H:Lh40;

    .line 45
    .line 46
    iget v1, p0, Lw40;->L:I

    .line 47
    .line 48
    const/4 v2, 0x4

    .line 49
    if-ne v1, v2, :cond_0

    .line 50
    .line 51
    const/4 v0, 0x2

    .line 52
    iput v0, p0, Lw40;->M:I

    .line 53
    .line 54
    iget-object v0, p0, Lw40;->w:Lff0;

    .line 55
    .line 56
    iget-boolean v1, v0, Lff0;->t:Z

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-object v0, v0, Lff0;->p:Laq0;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object v0, v0, Lff0;->o:Laq0;

    .line 64
    .line 65
    :goto_0
    invoke-virtual {v0, p0}, Laq0;->execute(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    iget v1, p0, Lw40;->L:I

    .line 70
    .line 71
    const/4 v2, 0x6

    .line 72
    if-eq v1, v2, :cond_3

    .line 73
    .line 74
    iget-boolean v1, p0, Lw40;->J:Z

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    :cond_3
    if-nez v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {p0}, Lw40;->j()V

    .line 81
    .line 82
    .line 83
    :cond_4
    return-void
.end method

.method public final n()V
    .locals 2

    .line 1
    iget v0, p0, Lw40;->M:I

    .line 2
    .line 3
    invoke-static {v0}, Lvi0;->u(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lw40;->f()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    iget p0, p0, Lw40;->M:I

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-eq p0, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eq p0, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const-string p0, "null"

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string p0, "DECODE_DATA"

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string p0, "SWITCH_TO_SOURCE_SERVICE"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const-string p0, "INITIALIZE"

    .line 40
    .line 41
    :goto_0
    const-string v0, "Unrecognized run reason: "

    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_4
    invoke-virtual {p0}, Lw40;->m()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_5
    invoke-virtual {p0, v1}, Lw40;->h(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iput v0, p0, Lw40;->L:I

    .line 60
    .line 61
    invoke-virtual {p0}, Lw40;->g()Lh40;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lw40;->H:Lh40;

    .line 66
    .line 67
    invoke-virtual {p0}, Lw40;->m()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw40;->j:Lsu2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsu2;->a()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lw40;->I:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lw40;->i:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, Lw40;->i:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sub-int/2addr v0, v1

    .line 28
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/lang/Throwable;

    .line 33
    .line 34
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v1, "Already notified"

    .line 37
    .line 38
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :cond_1
    iput-boolean v1, p0, Lw40;->I:Z

    .line 43
    .line 44
    return-void
.end method

.method public final run()V
    .locals 5

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const-string v1, "DecodeJob threw unexpectedly, isCancelled: "

    .line 4
    .line 5
    iget-object v2, p0, Lw40;->G:Lf40;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, p0, Lw40;->J:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lw40;->j()V
    :try_end_0
    .catch Lep; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-interface {v2}, Lf40;->b()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v3

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lw40;->n()V
    :try_end_1
    .catch Lep; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Lf40;->b()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void

    .line 33
    :goto_0
    const/4 v4, 0x3

    .line 34
    :try_start_2
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    new-instance v4, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v1, p0, Lw40;->J:Z

    .line 46
    .line 47
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", stage: "

    .line 51
    .line 52
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lw40;->L:I

    .line 56
    .line 57
    invoke-static {v1}, Lvi0;->w(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v0, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    :goto_1
    iget v0, p0, Lw40;->L:I

    .line 75
    .line 76
    const/4 v1, 0x5

    .line 77
    if-eq v0, v1, :cond_3

    .line 78
    .line 79
    iget-object v0, p0, Lw40;->i:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lw40;->j()V

    .line 85
    .line 86
    .line 87
    :cond_3
    iget-boolean p0, p0, Lw40;->J:Z

    .line 88
    .line 89
    if-nez p0, :cond_4

    .line 90
    .line 91
    throw v3

    .line 92
    :cond_4
    throw v3

    .line 93
    :goto_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 94
    :goto_3
    if-eqz v2, :cond_5

    .line 95
    .line 96
    invoke-interface {v2}, Lf40;->b()V

    .line 97
    .line 98
    .line 99
    :cond_5
    throw p0
.end method
