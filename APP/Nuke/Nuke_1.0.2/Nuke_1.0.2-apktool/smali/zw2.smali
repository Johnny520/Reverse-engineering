.class public final Lzw2;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ls12;
.implements Le70;
.implements Lr12;


# instance fields
.field public final A:Lzk1;

.field public final B:Lzk1;

.field public final C:Lzk1;

.field public D:Lh12;

.field public E:J

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

.field public y:Lzt2;

.field public z:Lh12;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzw2;->v:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lzw2;->w:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lzw2;->x:Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 9
    .line 10
    sget-object p1, Lvw2;->a:Lh12;

    .line 11
    .line 12
    iput-object p1, p0, Lzw2;->z:Lh12;

    .line 13
    .line 14
    new-instance p1, Lzk1;

    .line 15
    .line 16
    const/16 p2, 0x10

    .line 17
    .line 18
    new-array p3, p2, [Lyw2;

    .line 19
    .line 20
    invoke-direct {p1, p3}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lzw2;->A:Lzk1;

    .line 24
    .line 25
    iput-object p1, p0, Lzw2;->B:Lzk1;

    .line 26
    .line 27
    new-instance p1, Lzk1;

    .line 28
    .line 29
    new-array p2, p2, [Lyw2;

    .line 30
    .line 31
    invoke-direct {p1, p2}, Lzk1;-><init>([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lzw2;->C:Lzk1;

    .line 35
    .line 36
    const-wide/16 p1, 0x0

    .line 37
    .line 38
    iput-wide p1, p0, Lzw2;->E:J

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final F0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzw2;->O0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final J(Lh12;Li12;J)V
    .locals 2

    .line 1
    iput-wide p3, p0, Lzw2;->E:J

    .line 2
    .line 3
    sget-object p3, Li12;->h:Li12;

    .line 4
    .line 5
    if-ne p2, p3, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Lzw2;->z:Lh12;

    .line 8
    .line 9
    :cond_0
    iget-object p3, p0, Lzw2;->y:Lzt2;

    .line 10
    .line 11
    const/4 p4, 0x0

    .line 12
    if-nez p3, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lth1;->A0()Lj20;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    new-instance v0, Lh50;

    .line 19
    .line 20
    const/16 v1, 0x9

    .line 21
    .line 22
    invoke-direct {v0, p0, p4, v1}, Lh50;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-static {p3, p4, v0, v1}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    iput-object p3, p0, Lzw2;->y:Lzt2;

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0, p1, p2}, Lzw2;->N0(Lh12;Li12;)V

    .line 33
    .line 34
    .line 35
    iget-object p2, p1, Lh12;->a:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    const/4 v0, 0x0

    .line 42
    :goto_0
    if-ge v0, p3, :cond_3

    .line 43
    .line 44
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lo12;

    .line 49
    .line 50
    invoke-static {v1}, Ltp0;->q(Lo12;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    move-object p1, p4

    .line 61
    :goto_1
    iput-object p1, p0, Lzw2;->D:Lh12;

    .line 62
    .line 63
    return-void
.end method

.method public final M0(Lmn0;Lt00;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lmp;

    .line 2
    .line 3
    invoke-static {p2}, Lgf1;->z(Lt00;)Lt00;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lmp;-><init>(ILt00;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lmp;->u()V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lyw2;

    .line 15
    .line 16
    invoke-direct {p2, p0, v0}, Lyw2;-><init>(Lzw2;Lmp;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lzw2;->B:Lzk1;

    .line 20
    .line 21
    monitor-enter v1

    .line 22
    :try_start_0
    iget-object p0, p0, Lzw2;->A:Lzk1;

    .line 23
    .line 24
    invoke-virtual {p0, p2}, Lzk1;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lxb2;

    .line 28
    .line 29
    invoke-static {p2, p2, p1}, Lgf1;->p(Lt00;Lt00;Lmn0;)Lt00;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lgf1;->z(Lt00;)Lt00;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p0, p1}, Lxb2;-><init>(Lt00;)V

    .line 38
    .line 39
    .line 40
    sget-object p1, La83;->a:La83;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Lxb2;->h(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit v1

    .line 46
    new-instance p0, Lv5;

    .line 47
    .line 48
    const/16 p1, 0x16

    .line 49
    .line 50
    invoke-direct {p0, p1, p2}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p0}, Lmp;->w(Lin0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lmp;->t()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    monitor-exit v1

    .line 63
    throw p0
.end method

.method public final N0(Lh12;Li12;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lzw2;->B:Lzk1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lzw2;->C:Lzk1;

    .line 5
    .line 6
    iget-object v2, p0, Lzw2;->A:Lzk1;

    .line 7
    .line 8
    iget v3, v1, Lzk1;->j:I

    .line 9
    .line 10
    invoke-virtual {v1, v3, v2}, Lzk1;->c(ILzk1;)V
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
    new-instance p1, Lpv;

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
    iget-object v0, p0, Lzw2;->C:Lzk1;

    .line 37
    .line 38
    iget v3, v0, Lzk1;->j:I

    .line 39
    .line 40
    sub-int/2addr v3, v2

    .line 41
    iget-object v0, v0, Lzk1;->h:[Ljava/lang/Object;

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
    check-cast v2, Lyw2;

    .line 51
    .line 52
    iget-object v4, v2, Lyw2;->k:Li12;

    .line 53
    .line 54
    if-ne p2, v4, :cond_2

    .line 55
    .line 56
    iget-object v4, v2, Lyw2;->j:Lmp;

    .line 57
    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    iput-object v1, v2, Lyw2;->j:Lmp;

    .line 61
    .line 62
    invoke-virtual {v4, p1}, Lmp;->h(Ljava/lang/Object;)V

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
    iget-object v0, p0, Lzw2;->C:Lzk1;

    .line 69
    .line 70
    iget-object v2, v0, Lzk1;->h:[Ljava/lang/Object;

    .line 71
    .line 72
    iget v0, v0, Lzk1;->j:I

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
    check-cast v4, Lyw2;

    .line 80
    .line 81
    iget-object v5, v4, Lyw2;->k:Li12;

    .line 82
    .line 83
    if-ne p2, v5, :cond_4

    .line 84
    .line 85
    iget-object v5, v4, Lyw2;->j:Lmp;

    .line 86
    .line 87
    if-eqz v5, :cond_4

    .line 88
    .line 89
    iput-object v1, v4, Lyw2;->j:Lmp;

    .line 90
    .line 91
    invoke-virtual {v5, p1}, Lmp;->h(Ljava/lang/Object;)V
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
    iget-object p0, p0, Lzw2;->C:Lzk1;

    .line 98
    .line 99
    invoke-virtual {p0}, Lzk1;->g()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :goto_3
    iget-object p0, p0, Lzw2;->C:Lzk1;

    .line 104
    .line 105
    invoke-virtual {p0}, Lzk1;->g()V

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

.method public final O0()V
    .locals 4

    .line 1
    iget-object v0, p0, Lzw2;->y:Lzt2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lxh1;

    .line 6
    .line 7
    const-string v2, "Pointer input was reset"

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    invoke-direct {v1, v2, v3}, Lj02;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lr21;->D(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lzw2;->y:Lzt2;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzw2;->O0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()F
    .locals 0

    .line 1
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lr61;->F:Le70;

    .line 6
    .line 7
    invoke-interface {p0}, Le70;->b()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lzw2;->O0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final m()F
    .locals 0

    .line 1
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lr61;->F:Le70;

    .line 6
    .line 7
    invoke-interface {p0}, Le70;->m()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final m0()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lzw2;->D:Lh12;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v1, v1, Lh12;->a:Ljava/util/List;

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
    check-cast v5, Lo12;

    .line 23
    .line 24
    iget-boolean v5, v5, Lo12;->d:Z

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
    check-cast v5, Lo12;

    .line 48
    .line 49
    iget-wide v7, v5, Lo12;->a:J

    .line 50
    .line 51
    iget-wide v11, v5, Lo12;->c:J

    .line 52
    .line 53
    iget-wide v9, v5, Lo12;->b:J

    .line 54
    .line 55
    iget v14, v5, Lo12;->e:F

    .line 56
    .line 57
    iget-boolean v6, v5, Lo12;->d:Z

    .line 58
    .line 59
    iget v5, v5, Lo12;->i:I

    .line 60
    .line 61
    move/from16 v19, v6

    .line 62
    .line 63
    new-instance v6, Lo12;

    .line 64
    .line 65
    const/high16 v24, 0x3f800000    # 1.0f

    .line 66
    .line 67
    const-wide/16 v25, 0x0

    .line 68
    .line 69
    const/4 v13, 0x0

    .line 70
    const-wide/16 v22, 0x0

    .line 71
    .line 72
    move-wide v15, v9

    .line 73
    move-wide/from16 v17, v11

    .line 74
    .line 75
    move/from16 v20, v19

    .line 76
    .line 77
    move/from16 v21, v5

    .line 78
    .line 79
    invoke-direct/range {v6 .. v26}, Lo12;-><init>(JJJZFJJZZIJFJ)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    new-instance v1, Lh12;

    .line 89
    .line 90
    const/4 v3, 0x0

    .line 91
    invoke-direct {v1, v2, v3}, Lh12;-><init>(Ljava/util/List;Ler2;)V

    .line 92
    .line 93
    .line 94
    iput-object v1, v0, Lzw2;->z:Lh12;

    .line 95
    .line 96
    sget-object v2, Li12;->h:Li12;

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, Lzw2;->N0(Lh12;Li12;)V

    .line 99
    .line 100
    .line 101
    sget-object v2, Li12;->i:Li12;

    .line 102
    .line 103
    invoke-virtual {v0, v1, v2}, Lzw2;->N0(Lh12;Li12;)V

    .line 104
    .line 105
    .line 106
    sget-object v2, Li12;->j:Li12;

    .line 107
    .line 108
    invoke-virtual {v0, v1, v2}, Lzw2;->N0(Lh12;Li12;)V

    .line 109
    .line 110
    .line 111
    iput-object v3, v0, Lzw2;->D:Lh12;

    .line 112
    .line 113
    return-void

    .line 114
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_3
    :goto_2
    return-void
.end method
