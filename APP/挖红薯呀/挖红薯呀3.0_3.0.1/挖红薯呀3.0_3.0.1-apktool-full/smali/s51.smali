.class public final Ls51;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lrr0;
.implements Lym;
.implements Lqr0;


# instance fields
.field public A:J

.field public r:Ljava/lang/Object;

.field public s:Ljava/lang/Object;

.field public t:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

.field public u:Lr31;

.field public v:Lir0;

.field public final w:Lsh0;

.field public final x:Lsh0;

.field public final y:Lsh0;

.field public z:Lir0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls51;->r:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Ls51;->s:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Ls51;->t:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 9
    .line 10
    sget-object p1, Lo51;->a:Lir0;

    .line 11
    .line 12
    iput-object p1, p0, Ls51;->v:Lir0;

    .line 13
    .line 14
    new-instance p1, Lsh0;

    .line 15
    .line 16
    const/16 p2, 0x10

    .line 17
    .line 18
    new-array p3, p2, [Lr51;

    .line 19
    .line 20
    invoke-direct {p1, p3}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ls51;->w:Lsh0;

    .line 24
    .line 25
    iput-object p1, p0, Ls51;->x:Lsh0;

    .line 26
    .line 27
    new-instance p1, Lsh0;

    .line 28
    .line 29
    new-array p2, p2, [Lr51;

    .line 30
    .line 31
    invoke-direct {p1, p2}, Lsh0;-><init>([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Ls51;->y:Lsh0;

    .line 35
    .line 36
    const-wide/16 p1, 0x0

    .line 37
    .line 38
    iput-wide p1, p0, Ls51;->A:J

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final N()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls51;->x0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final U()V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ls51;->z:Lir0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v1, v1, Lir0;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_3

    .line 17
    .line 18
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Lnr0;

    .line 23
    .line 24
    iget-boolean v5, v5, Lnr0;->d:Z

    .line 25
    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    :goto_1
    if-ge v3, v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Lnr0;

    .line 48
    .line 49
    iget-wide v7, v5, Lnr0;->a:J

    .line 50
    .line 51
    iget-wide v11, v5, Lnr0;->c:J

    .line 52
    .line 53
    iget-wide v9, v5, Lnr0;->b:J

    .line 54
    .line 55
    iget v14, v5, Lnr0;->e:F

    .line 56
    .line 57
    iget-boolean v6, v5, Lnr0;->d:Z

    .line 58
    .line 59
    iget v5, v5, Lnr0;->i:I

    .line 60
    .line 61
    move/from16 v19, v6

    .line 62
    .line 63
    new-instance v6, Lnr0;

    .line 64
    .line 65
    const/4 v13, 0x0

    .line 66
    const-wide/16 v22, 0x0

    .line 67
    .line 68
    move-wide v15, v9

    .line 69
    move-wide/from16 v17, v11

    .line 70
    .line 71
    move/from16 v20, v19

    .line 72
    .line 73
    move/from16 v21, v5

    .line 74
    .line 75
    invoke-direct/range {v6 .. v23}, Lnr0;-><init>(JJJZFJJZZIJ)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    new-instance v1, Lir0;

    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-direct {v1, v2, v3}, Lir0;-><init>(Ljava/util/List;Ld;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, v0, Ls51;->v:Lir0;

    .line 91
    .line 92
    sget-object v2, Ljr0;->d:Ljr0;

    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Ls51;->w0(Lir0;Ljr0;)V

    .line 95
    .line 96
    .line 97
    sget-object v2, Ljr0;->e:Ljr0;

    .line 98
    .line 99
    invoke-virtual {v0, v1, v2}, Ls51;->w0(Lir0;Ljr0;)V

    .line 100
    .line 101
    .line 102
    sget-object v2, Ljr0;->f:Ljr0;

    .line 103
    .line 104
    invoke-virtual {v0, v1, v2}, Ls51;->w0(Lir0;Ljr0;)V

    .line 105
    .line 106
    .line 107
    iput-object v3, v0, Ls51;->z:Lir0;

    .line 108
    .line 109
    return-void

    .line 110
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    :goto_2
    return-void
.end method

.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls51;->x0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()F
    .locals 0

    .line 1
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lb60;->B:Lym;

    .line 6
    .line 7
    invoke-interface {p0}, Lym;->b()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final h()F
    .locals 0

    .line 1
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lb60;->B:Lym;

    .line 6
    .line 7
    invoke-interface {p0}, Lym;->h()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final p0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ls51;->x0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final w0(Lir0;Ljr0;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ls51;->x:Lsh0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ls51;->y:Lsh0;

    .line 5
    .line 6
    iget-object v2, p0, Ls51;->w:Lsh0;

    .line 7
    .line 8
    iget v3, v1, Lsh0;->f:I

    .line 9
    .line 10
    invoke-virtual {v1, v3, v2}, Lsh0;->c(ILsh0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    monitor-exit v0

    .line 14
    :try_start_1
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq v0, v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-ne v0, v2, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    new-instance p1, Lsg;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw p1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    iget-object v0, p0, Ls51;->y:Lsh0;

    .line 37
    .line 38
    iget v3, v0, Lsh0;->f:I

    .line 39
    .line 40
    sub-int/2addr v3, v2

    .line 41
    iget-object v0, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 42
    .line 43
    array-length v2, v0

    .line 44
    if-ge v3, v2, :cond_5

    .line 45
    .line 46
    :goto_0
    if-ltz v3, :cond_5

    .line 47
    .line 48
    aget-object v2, v0, v3

    .line 49
    .line 50
    check-cast v2, Lr51;

    .line 51
    .line 52
    iget-object v4, v2, Lr51;->g:Ljr0;

    .line 53
    .line 54
    if-ne p2, v4, :cond_2

    .line 55
    .line 56
    iget-object v4, v2, Lr51;->f:Lwc;

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    iput-object v1, v2, Lr51;->f:Lwc;

    .line 61
    .line 62
    invoke-virtual {v4, p1}, Lwc;->i(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    add-int/lit8 v3, v3, -0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    :goto_1
    iget-object v0, p0, Ls51;->y:Lsh0;

    .line 69
    .line 70
    iget-object v2, v0, Lsh0;->d:[Ljava/lang/Object;

    .line 71
    .line 72
    iget v0, v0, Lsh0;->f:I

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    :goto_2
    if-ge v3, v0, :cond_5

    .line 76
    .line 77
    aget-object v4, v2, v3

    .line 78
    .line 79
    check-cast v4, Lr51;

    .line 80
    .line 81
    iget-object v5, v4, Lr51;->g:Ljr0;

    .line 82
    .line 83
    if-ne p2, v5, :cond_4

    .line 84
    .line 85
    iget-object v5, v4, Lr51;->f:Lwc;

    .line 86
    .line 87
    if-eqz v5, :cond_4

    .line 88
    .line 89
    iput-object v1, v4, Lr51;->f:Lwc;

    .line 90
    .line 91
    invoke-virtual {v5, p1}, Lwc;->i(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    .line 93
    .line 94
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iget-object p0, p0, Ls51;->y:Lsh0;

    .line 98
    .line 99
    invoke-virtual {p0}, Lsh0;->g()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :goto_3
    iget-object p0, p0, Ls51;->y:Lsh0;

    .line 104
    .line 105
    invoke-virtual {p0}, Lsh0;->g()V

    .line 106
    .line 107
    .line 108
    throw p1

    .line 109
    :catchall_1
    move-exception p0

    .line 110
    monitor-exit v0

    .line 111
    throw p0
.end method

.method public final x(Lir0;Ljr0;J)V
    .locals 2

    .line 1
    iput-wide p3, p0, Ls51;->A:J

    .line 2
    .line 3
    sget-object p3, Ljr0;->d:Ljr0;

    .line 4
    .line 5
    if-ne p2, p3, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Ls51;->v:Lir0;

    .line 8
    .line 9
    :cond_0
    iget-object p3, p0, Ls51;->u:Lr31;

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    if-nez p3, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Loe0;->k0()Lyk;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    new-instance v0, Lcg;

    .line 19
    .line 20
    const/4 v1, 0x7

    .line 21
    invoke-direct {v0, p0, p4, v1}, Lcg;-><init>(Ljava/lang/Object;Lik;I)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-static {p3, p4, v0, v1}, Li4;->w(Lyk;Lpk;Lww;I)Lr31;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    iput-object p3, p0, Ls51;->u:Lr31;

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0, p1, p2}, Ls51;->w0(Lir0;Ljr0;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p1, Lir0;->a:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    const/4 v0, 0x0

    .line 41
    :goto_0
    if-ge v0, p3, :cond_3

    .line 42
    .line 43
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Lnr0;

    .line 48
    .line 49
    invoke-static {v1}, Lw60;->k(Lnr0;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move-object p1, p4

    .line 60
    :goto_1
    iput-object p1, p0, Ls51;->z:Lir0;

    .line 61
    .line 62
    return-void
.end method

.method public final x0()V
    .locals 4

    .line 1
    iget-object v0, p0, Ls51;->u:Lr31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lse0;

    .line 6
    .line 7
    const-string v2, "Pointer input was reset"

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    invoke-direct {v1, v2, v3}, Ldr0;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lj40;->B(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Ls51;->u:Lr31;

    .line 18
    .line 19
    :cond_0
    return-void
.end method
